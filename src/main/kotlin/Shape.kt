abstract class Shape {
    protected abstract val points: List<Point>

    abstract fun move(dx: Double, dy: Double): Shape
}