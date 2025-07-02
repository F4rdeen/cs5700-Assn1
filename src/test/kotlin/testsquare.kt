import kotlin.test.*

class testsquare {
    @Test
    fun testArea() {
        val s = Square(Point(0.0, 0.0), Point(2.0, 2.0))
        assertEquals(4.0, s.area(), 1e-6)
    }

    @Test
    fun testMove() {
        val s = Square(Point(0.0, 0.0), Point(2.0, 2.0))
        val moved = s.move(1.0, 1.0) as Square
        val topLeft = moved.getTopLeft()
        val bottomRight = moved.getBottomRight()
        assertEquals(1.0, topLeft.getX(), 1e-6)
        assertEquals(1.0, topLeft.getY(), 1e-6)
        assertEquals(3.0, bottomRight.getX(), 1e-6)
        assertEquals(3.0, bottomRight.getY(), 1e-6)
    }

    @Test
    fun testGetTopLeft() {
        val s = Square(Point(1.0, 2.0), Point(3.0, 4.0))
        val topLeft = s.getTopLeft()
        assertEquals(1.0, topLeft.getX(), 1e-6)
        assertEquals(2.0, topLeft.getY(), 1e-6)
    }

    @Test
    fun testGetBottomRight() {
        val s = Square(Point(1.0, 2.0), Point(3.0, 4.0))
        val bottomRight = s.getBottomRight()
        assertEquals(3.0, bottomRight.getX(), 1e-6)
        assertEquals(4.0, bottomRight.getY(), 1e-6)
    }
}