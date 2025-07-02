import kotlin.test.*

class testrectangle {
    @Test
    fun testArea() {
        val r = Rectangle(Point(0.0, 0.0), Point(3.0, 2.0))
        assertEquals(6.0, r.area(), 1e-6)
    }

    @Test
    fun testMove() {
        val r = Rectangle(Point(0.0, 0.0), Point(3.0, 2.0))
        val moved = r.move(1.0, 1.0) as Rectangle
        val topLeft = moved.getTopLeft()
        val bottomRight = moved.getBottomRight()
        assertEquals(1.0, topLeft.getX(), 1e-6)
        assertEquals(1.0, topLeft.getY(), 1e-6)
        assertEquals(4.0, bottomRight.getX(), 1e-6)
        assertEquals(3.0, bottomRight.getY(), 1e-6)
    }

    @Test
    fun testGetTopLeft() {
        val r = Rectangle(Point(1.0, 2.0), Point(3.0, 4.0))
        val topLeft = r.getTopLeft()
        assertEquals(1.0, topLeft.getX(), 1e-6)
        assertEquals(2.0, topLeft.getY(), 1e-6)
    }

    @Test
    fun testGetBottomRight() {
        val r = Rectangle(Point(1.0, 2.0), Point(3.0, 4.0))
        val bottomRight = r.getBottomRight()
        assertEquals(3.0, bottomRight.getX(), 1e-6)
        assertEquals(4.0, bottomRight.getY(), 1e-6)
    }
}