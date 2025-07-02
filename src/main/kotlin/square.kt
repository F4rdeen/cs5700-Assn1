class Square(
    topLeft: Point,
    bottomRight: Point
) : Rectangle(topLeft, bottomRight) {
    init {
        val width = bottomRight.getX() - topLeft.getX()
        val height = bottomRight.getY() - topLeft.getY()
        require(kotlin.math.abs(width) == kotlin.math.abs(height)) {
            "Square must have equal sides"
        }
    }

    override fun move(dx: Double, dy: Double): Shape {
        return Square(
            getTopLeft().apply { move(dx, dy) },
            getBottomRight().apply { move(dx, dy) }
        )
    }
}