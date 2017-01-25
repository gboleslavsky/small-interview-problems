/**
  *Problem:
  * Given four integers, find the largest valid time value in 24 hr format or report that it's not possible.
  * So for 4632 it would be 23:46
  *
  * this problem was part of several exercises and the only one i did not finish in time. I had an hour for three
  * problems, two were very simple, this one I ran out of time and wasn't sure how best to solve it.
  * Solution that appears below came to me the next day, after I tried and failed to find a reasonable one on the web.
  */
object ValidTime {
  val INVALID_TIME = "No valid time"
  def solution(a: Int, b: Int, c: Int, d: Int): String = {
    val time = validTime(a,b,c,d)
    if (time == INVALID_TIME) INVALID_TIME
    time.substring(0,2)  + ":" + time.substring(2)
  }

  def validTime(a: Int, b: Int, c: Int, d: Int): String = {
    val allPossible = List(a, b, c, d).permutations.map(p => p.mkString).toSet
    val minutes = List.range(0, 60).map(n => f"$n%02d").toSet
    val hours = List.range(0, 24).map(n => f"$n%02d").toSet
    val allValid = ((for (h <- hours; m <- minutes) yield h + m))
    val possibleAndValid = allValid.intersect(allPossible)

    if (possibleAndValid.isEmpty) INVALID_TIME else possibleAndValid.max
  }

}
