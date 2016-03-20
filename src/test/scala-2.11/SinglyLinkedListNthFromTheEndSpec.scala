import SinglyLinkedNthFromTheEnd.SinglyLinkedList
import SinglyLinkedNthFromTheEnd.SinglyLinkedList._
import org.scalatest._

class SinglyLinkedListNthFromTheEndSpec extends FlatSpec {
  "nthFromTheEnd" should "find the n-th element from the end of a singly-linked list" in {
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 0).getOrElse(null)
                                                                      === 9)
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 1).getOrElse(null)
                                                                      === 8)
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 2).getOrElse(null)
                                                                      === 7)
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 3).getOrElse(null)
                                                                      === 6)
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 4).getOrElse(null)
                                                                      === 5)
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 5).getOrElse(null)
                                                                      === 4)
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 6).getOrElse(null)
                                                                      === 3)
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 7).getOrElse(null)
                                                                      === 2)
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 8).getOrElse(null)
                                                                      === 1)
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = -1).getOrElse("Invalid value for n")
                                                                      === "Invalid value for n")
    assert(nthFromTheEnd(SinglyLinkedList(1, 2, 3, 4, 5, 6, 7, 8, 9), n = 100).getOrElse("Invalid value for n")
                                                                      === "Invalid value for n")
  }
}