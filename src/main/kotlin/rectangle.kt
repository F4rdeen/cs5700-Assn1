class Rectangle(val topLeft: Point, val bottomRight: Point) {
    fun getTopLeft() = topLeft.clone()
    fun getBottomRight() = bottomRight.clone()
    fun area() = (bottomRight.getX() - topLeft.getX()) *
            (bottomRight.getY() - topLeft.getY())
    fun move(dx: Double, dy: Double) {
        topLeft.move(dx, dy)
        bottomRight.move(dx, dy)
    }
}