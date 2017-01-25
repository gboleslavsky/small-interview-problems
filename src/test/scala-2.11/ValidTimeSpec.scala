import ValidTime._
import org.scalatest._


class ValidTimeSpec extends FlatSpec {
  "Four integers" should "define the latest valid time in 24 hr format if possible" in {
    assert(solution(0, 0, 0, 0) === "00:00")
    assert(solution(9, 9, 9, 9) === INVALID_TIME)
    assert(solution(9, 2, 5, 3) === "23:59")
    assert(solution(9, 2, 5, 4) === INVALID_TIME)
    assert(solution(1, 2, 5, 4) === "21:54")
    assert(solution(1, 8, 3, 2) === "23:18")
    assert(solution(1, 1, 2, 2) === "22:11")
    assert(solution(1, 2, 2, 4) === "22:41")
  }
}