class Line(private val start: Point, private val end: Point) : Shape() {
    override val points = listOf(start, end)

    init {
        require(!(start.getX() == end.getX() && start.getY() == end.getY())) {
            "Line must have non-zero length"
        }
    }

    fun slope(): Double {
        require(start.getX() != end.getX()) { "Vertical line has no slope" }
        return (end.getY() - start.getY()) / (end.getX() - start.getX())
    }

    fun length() = kotlin.math.hypot(
        end.getX() - start.getX(),
        end.getY() - start.getY()
    )

    fun getStart() = start.clone()
    fun getEnd() = end.clone()

    override fun move(dx: Double, dy: Double): Shape {
        return Line(
            start.clone().apply { move(dx, dy) },
            end.clone().apply { move(dx, dy) }
        )
    }
}