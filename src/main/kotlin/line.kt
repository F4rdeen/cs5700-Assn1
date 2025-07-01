class Line(val start: Point, val end: Point) {
    fun getStart() = start.clone()
    fun getEnd() = end.clone()
    fun slope() = (end.getY() - start.getY()) / (end.getX() - start.getX())
    fun length() = (end.getX() - start.getX(), end.getY() - start.getY())
    fun move(dx: Double, dy:Double) {
        start.move(dx,dy)
        end.move(dx,dy)
    } 
}