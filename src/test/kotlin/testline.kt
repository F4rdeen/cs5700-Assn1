import kotlin.test.*

class testline {
    @Test
    fun testLength() {
        val l = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        assertEquals(5.0, l.length(), 1e-6)
    }

    @Test
    fun testSlope() {
        val l = Line(Point(1.0, 2.0), Point(4.0, 8.0))
        assertEquals(2.0, l.slope(), 1e-6)
    }

    @Test
    fun testGetStart() {
        val l = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        val start = l.getStart()
        assertEquals(1.0, start.getX(), 1e-6)
        assertEquals(2.0, start.getY(), 1e-6)
    }

    @Test
    fun testGetEnd() {
        val l = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        val end = l.getEnd()
        assertEquals(3.0, end.getX(), 1e-6)
        assertEquals(4.0, end.getY(), 1e-6)
    }

    @Test
    fun testMove() {
        val l = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        val moved = l.move(2.0, 3.0) as Line
        val start = moved.getStart()
        val end = moved.getEnd()
        assertEquals(3.0, start.getX(), 1e-6)
        assertEquals(5.0, start.getY(), 1e-6)
        assertEquals(5.0, end.getX(), 1e-6)
        assertEquals(7.0, end.getY(), 1e-6)
    }
}
