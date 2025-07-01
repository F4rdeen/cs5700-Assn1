import kotlin.math.abs

class Triangle(
    val p1: Point,
    val p2: Point,
    val p3: Point
) {
    fun getPoints() = listOf(p1.clone(), p2.clone(), p3.clone())
    fun area(): Double {
        val (x1, y1) = p1.getX() to p1.getY()
        return abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2.0)
        val (x3, y3) = p3.getX() to p3.getY()
        return kotlin.math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2.0
    }
    fun move(dx: Double, dy: Double) = apply {
        p1.move(dx, dy)
        p2.move(dx, dy)
        p3.move(dx, dy)
    }
}