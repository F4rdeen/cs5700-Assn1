import kotlin.test.*

class testtriangle {
    @Test
    fun testArea() {
        val t = Triangle(Point(0.0, 0.0), Point(1.0, 0.0), Point(0.0, 1.0))
        assertEquals(0.5, t.area(), 1e-6)
    }

    @Test
    fun testMove() {
        val t = Triangle(Point(0.0, 0.0), Point(1.0, 0.0), Point(0.0, 1.0))
        val moved = t.move(2.0, 3.0) as Triangle
        val pts: List<Point> = moved.points
        assertEquals(2.0, pts[0].getX(), 1e-6)
        assertEquals(3.0, pts[0].getY(), 1e-6)
        assertEquals(3.0, pts[1].getX(), 1e-6)
        assertEquals(3.0, pts[1].getY(), 1e-6)
        assertEquals(2.0, pts[2].getX(), 1e-6)
        assertEquals(4.0, pts[2].getY(), 1e-6)
    }

    @Test
    fun testPointsProperty() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 0.0)
        val p3 = Point(0.0, 1.0)
        val t = Triangle(p1, p2, p3)
        val pts: List<Point> = t.points
        assertEquals(3, pts.size)
        assertTrue(pts.contains(p1))
        assertTrue(pts.contains(p2))
        assertTrue(pts.contains(p3))
    }

    @Test
    fun testCollinearPointsThrows() {
        assertFailsWith<IllegalArgumentException> {
            Triangle(Point(0.0, 0.0), Point(1.0, 1.0), Point(2.0, 2.0))
        }
    }
}