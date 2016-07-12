package FazzBizzBarrSeamless
import collection.immutable.Seq

object FnFazzBizzBarr extends App {
  /*
- Implement the FazzBizzBarr function:
Output every integer, except that
multiples of 3 output Fazz,
multiple of 5 output Bizz,
multiples of 7 output Barr.
Multiples of several of these output each word in turn on the same line
(for example, line 21 should output "Fazz Barr").Write a test for this.  Do not spend more than 30 minutes on this.
*/
  implicit class ModInt(x: Int) {
    //for easy to read infix syntax
    def divisibleBy(y: Int) = x % y == 0
  }

  def fazzBizzBarr(ints: Seq[Int] ): Seq[String] = {
    (ints) map
      (i =>
        i match {
          case i if ((i divisibleBy 3) && (i divisibleBy 5) && (i divisibleBy 7))   => " Fazz Bizz Barr "
          case i if ((i divisibleBy 3) && (i divisibleBy 5))                      => " Fazz Bizz "
          case i if ((i divisibleBy 3) && (i divisibleBy 7))                      => " Fazz Barr "
          case i if ((i divisibleBy 5) && (i divisibleBy 7))                      => " Bizz Barr "
          case i if (i divisibleBy 3)                                           => " Fazz "
          case i if (i divisibleBy 5)                                           => " Bizz "
          case i if (i divisibleBy 7)                                           => " Barr "
          case i                                                              => s"  $i  "
        })
  }

  def fazzBizzBarr(start: Int, end: Int): Seq[String] = fazzBizzBarr(start to end)

  fazzBizzBarr(start = 1, end = 105) foreach println

}