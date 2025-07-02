class Point(private var x: Double, private var y: Double) {
    fun getX() = x
    fun getY() = y
    fun clone() = Point(x, y)
    fun move(dx: Double, dy: Double) {
        x += dx
        y += dy
    }
}