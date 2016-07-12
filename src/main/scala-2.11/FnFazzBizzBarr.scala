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

  def fazzBizzBarr(ints: Seq[Int] ): Seq[String] = {

    def divBy(i: Int, d: Int): Boolean = i % d == 0

    (ints) map
      (i =>
        i match {
          case i if (divBy(i, 3) && divBy(i, 5) && divBy(i, 7)) => " Fazz Bizz Barr "
          case i if (divBy(i, 3) && divBy(i, 5))                => " Fazz Bizz "
          case i if (divBy(i, 3) && divBy(i, 7))                => " Fazz Barr "
          case i if (divBy(i, 5) && divBy(i, 7))                => " Bizz Barr "
          case i if divBy(i, 3)                                 => " Fazz "
          case i if divBy(i, 5)                                 => " Bizz "
          case i if divBy(i, 7)                                 => " Barr "
          case i                                                => s"  $i  "
        })
  }

  def fazzBizzBarr(start: Int, end: Int): Seq[String] = fazzBizzBarr(start to end)

  println(fazzBizzBarr(start = 1, end = 100))

}