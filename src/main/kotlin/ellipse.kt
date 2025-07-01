import kotlin.math.PI

class Ellipse(val center: Point, val rx: Double, val ry: Double) {
    fun getCenter() = center.clone()
    fun getRx() = rx
    fun getRy() = ry
    fun area() = PI * rx * ry
    fun move(dx: Double, dy: Double) {
        center.move(dx, dy)
    }
}