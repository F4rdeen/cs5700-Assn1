open class Ellipse(
    private val center: Point,
    private val rx: Double,
    private val ry: Double
) : Shape() {
    override val points = listOf(center)

    init {
        require(rx > 0.0 && ry > 0.0) { "Radii must be positive" }
    }

    fun area() = kotlin.math.PI * rx * ry

    fun getCenter() = center.clone()
    fun getRx() = rx
    fun getRy() = ry

    override fun move(dx: Double, dy: Double): Shape {
        return Ellipse(
            center.clone().apply { move(dx, dy) },
            rx,
            ry
        )
    }
}