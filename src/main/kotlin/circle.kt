class Circle(
    center: Point,
    radius: Double
) : Ellipse(center, radius, radius) {
    fun getRadius() = getRx()

    override fun move(dx: Double, dy: Double): Shape {
        return Circle(
            getCenter().apply { move(dx, dy) },
            getRadius()
        )
    }
}