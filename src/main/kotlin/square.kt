class Square(topLeft: Point, bottomRight: Point) : Rectangle(topLeft, bottomRight) {
    fun getTopLeft() = topLeft.clone()
    fun getBottomRight() = bottomRight.clone()

    }
}