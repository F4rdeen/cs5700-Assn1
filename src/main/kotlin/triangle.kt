class Triangle(
    private val p1: Point,
    private val p2: Point,
    private val p3: Point
) : Shape() {
    public override val points = listOf(p1, p2, p3) // explicitly public

    init {
        require(area() > 0.000001) { "Points must not be collinear" }
    }

    fun area(): Double {
        return 0.5 * kotlin.math.abs(
            (p1.getX() * (p2.getY() - p3.getY()) +
                    p2.getX() * (p3.getY() - p1.getY()) +
                    p3.getX() * (p1.getY() - p2.getY()))
        )
    }

    override fun move(dx: Double, dy: Double): Shape {
        return Triangle(
            p1.clone().apply { move(dx, dy) },
            p2.clone().apply { move(dx, dy) },
            p3.clone().apply { move(dx, dy) }
        )
    }
}