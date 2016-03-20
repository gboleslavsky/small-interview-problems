import exercises.ContainsAll.containsAll
import org.scalatest._

class ContainsAllSpec extends FlatSpec {
  "containsAll" should "determine whether every element of list A is contained in list B" in {
    assert(containsAll(listA = List(1,2,3),   listB = List(1,2,3,4))  === true)
    assert(containsAll(listA = List(1,2,3),   listB = List(2,3,4))    === false)
    assert(containsAll(listA = List(1),       listB = List(1,2))      === true)
    assert(containsAll(listA = List(),        listB = List(2,3,4))    === true)
    assert(containsAll(listA = List(1,2,3,4), listB = List(1,2,3,4))  === true)
    assert(containsAll(listA = List(1,2,3,4), listB = List(2,3,4))    === false)
    assert(containsAll(listA = List(1),       listB = List(4, 3,2,1)) === true)
    assert(containsAll(listA = List(1),       listB = List())         === false)
  }
}