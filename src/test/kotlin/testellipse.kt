import kotlin.test.*

class testellipse {
    @Test
    fun testArea() {
        val e = Ellipse(Point(0.0, 0.0), 2.0, 1.0)
        assertEquals(Math.PI * 2.0 * 1.0, e.area(), 1e-6)
    }

    @Test
    fun testGetCenter() {
        val e = Ellipse(Point(3.0, 4.0), 2.0, 1.0)
        val center = e.getCenter()
        assertEquals(3.0, center.getX(), 1e-6)
        assertEquals(4.0, center.getY(), 1e-6)
    }

    @Test
    fun testGetRx() {
        val e = Ellipse(Point(0.0, 0.0), 5.0, 2.0)
        assertEquals(5.0, e.getRx(), 1e-6)
    }

    @Test
    fun testGetRy() {
        val e = Ellipse(Point(0.0, 0.0), 5.0, 2.0)
        assertEquals(2.0, e.getRy(), 1e-6)
    }

    @Test
    fun testMove() {
        val e = Ellipse(Point(1.0, 2.0), 3.0, 4.0)
        val moved = e.move(2.0, 3.0) as Ellipse
        val center = moved.getCenter()
        assertEquals(3.0, center.getX(), 1e-6)
        assertEquals(5.0, center.getY(), 1e-6)
        assertEquals(3.0, moved.getRx(), 1e-6)
        assertEquals(4.0, moved.getRy(), 1e-6)
    }
}
