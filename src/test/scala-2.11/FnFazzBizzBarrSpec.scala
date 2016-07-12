import FazzBizzBarrSeamless.FnFazzBizzBarr._
import org.scalatest._
/*
- Implement the FazzBizzBarr function:
Output every integer, except that
multiples of 3 output Fazz, multiple of 5 output Bizz, multiples of 7 output Barr.
Multiples of several of these output each word in turn on the same line
(for example, line 21 should output "Fazz Barr").Write a test for this.  Do not spend more than 30 minutes on this.
*/

class FnFazzBizzBarrSpec extends FlatSpec {
  "Integer value" should "determine the string that correponds to it based on divisibility by 3,5, and 7" in {
    assert(fazzBizzBarr(List(2,3,4,5,6,7,8))
            ===
           List("  2  ", " Fazz ", "  4  ", " Bizz ", " Fazz ", " Barr ", "  8  "))

    assert(fazzBizzBarr(List(15))
            ===
            List(" Fazz Bizz "))

    assert(fazzBizzBarr(List(21))
            ===
            List(" Fazz Barr "))

    assert(fazzBizzBarr(List(105))
            ===
            List(" Fazz Bizz Barr "))
  }
}