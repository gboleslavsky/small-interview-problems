/**
  * Created by gboleslavsky on 3/20/16.
  */

object SinglyLinkedNthFromTheEnd{

  /*  I use the traditional imperative two pointer solution, translated to Scala.
      Recursive solution is simpler, but will overflow the stack for long lists. Using ScalaZ trampolined
      FoldLeft eliminates the overflow risk, but the code is not as simple for anyone not used to ScalaZ.
   */

  sealed trait SinglyLinkedList[+T]

  case class Element[+T](val head: T, val tail: SinglyLinkedList[T]) extends SinglyLinkedList[T]

  case object Nil extends SinglyLinkedList[Nothing]

  object SinglyLinkedList {

    def apply[T](items: T*): SinglyLinkedList[T] =
      if (items.isEmpty)
        Nil
      else
        Element(items.head, apply(items.tail: _*))

    def tail[T](l: SinglyLinkedList[T]) = l.asInstanceOf[Element[T]].tail

    def head[T](l: SinglyLinkedList[T]) = l.asInstanceOf[Element[T]].head

    def nthFromTheEnd[T](l: SinglyLinkedList[T], n: Int): Option[T] = {

      if (n < 0) return None

      var l1, l2 = l

      //move l1 n steps towards the end
      for (i <- 1 to n ) {
        //check for the case of n > length of the list
        if (l1 == Nil) return None
        l1 = tail(l1)
      }

      //now that l2 is exactly n elements behind l1,
      //move l2 in lockstep with l1 until l1 hits the end
      //which makes l2 point to nth element from the end
      while (tail(l1) != Nil) {
        l1 = tail(l1)
        l2 = tail(l2)
      }
      Some(head(l2))
    }

  }
}