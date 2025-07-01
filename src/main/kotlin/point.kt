class Point(var x:Double, var y: Double) {
    fun getX() = x
    fun getY() = y
    fun clone() = Point(x,y)
    fun move(dx: double, dy: Double) {
        x += dx
        y += dy
    }
}