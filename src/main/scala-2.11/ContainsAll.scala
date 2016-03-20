/**
  * Created by gboleslavsky on 3/20/16.
  */
package exercises
object ContainsAll {

  def containsAll[T](listA: List[T], listB: List[T]): Boolean = {
    /*
      this function determines if listB contains every element contained in listA. It ignores both the order of elements and the number
      of identical elements in either list when making that determination, so it uses set arithmetic.
     */
    listA.toSet subsetOf listB.toSet
  }

}
