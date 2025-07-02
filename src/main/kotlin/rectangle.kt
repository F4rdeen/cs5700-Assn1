open class Rectangle(
    private val topLeft: Point,
    private val bottomRight: Point
) : Shape() {
    override val points = listOf(topLeft, bottomRight)

    init {
        require(topLeft.getX() != bottomRight.getX() &&
                topLeft.getY() != bottomRight.getY()) {
            "Rectangle must have non-zero dimensions"
        }
    }

    fun area() = kotlin.math.abs(
        (bottomRight.getX() - topLeft.getX()) *
                (bottomRight.getY() - topLeft.getY())
    )

    open fun getTopLeft() = topLeft.clone()
    open fun getBottomRight() = bottomRight.clone()

    override fun move(dx: Double, dy: Double): Shape {
        return Rectangle(
            topLeft.clone().apply { move(dx, dy) },
            bottomRight.clone().apply { move(dx, dy) }
        )
    }
}