class Circle(center: Point, radius: Double) : Ellipse(center, radius, radius) {
    fun getRadius() = getRx()
}