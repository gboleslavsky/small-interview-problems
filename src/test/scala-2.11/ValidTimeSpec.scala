import ValidTime._
import org.scalatest._


class ValidTimeSpec extends FlatSpec {
  "Four integers" should "define the latest valid time in 24 hr format if possible" in {
    assert(solution(1, 2, 5, 4) === "21:54")
    assert(solution(9, 9, 9, 9) === INVALID_TIME)
  }
}