import kotlin.test.*

class testcircle {
    @Test
    fun testArea() {
        val c = Circle(Point(0.0, 0.0), 2.0)
        assertEquals(Math.PI * 4.0, c.area(), 1e-6)
    }

    @Test
    fun testGetRadius() {
        val c = Circle(Point(1.0, 1.0), 5.0)
        assertEquals(5.0, c.getRadius(), 1e-6)
    }

    @Test
    fun testMove() {
        val c = Circle(Point(1.0, 2.0), 3.0)
        val moved = c.move(2.0, 3.0) as Circle
        assertEquals(3.0, moved.getCenter().getX(), 1e-6)
        assertEquals(5.0, moved.getCenter().getY(), 1e-6)
        assertEquals(3.0, moved.getRadius(), 1e-6)
    }
}
