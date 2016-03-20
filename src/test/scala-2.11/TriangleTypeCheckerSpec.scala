import exercises.TriangleTypeChecker.{TriangleType, checkTrianglesType}
import org.scalatest._

class TriangleTypeCheckerSpec extends FlatSpec {
  "checkTrianglesType" should "determine the type of triangle given the lengths of the three sides" in {
    assert(checkTrianglesType(3, 3, 5) === TriangleType.Isosceles)
    assert(checkTrianglesType(1, 1, 1) === TriangleType.Equilateral)
    assert(checkTrianglesType(2, 3, 4) === TriangleType.Scalene)
    assert(checkTrianglesType(1, 2, 4) === TriangleType.None)
  }
}