import kotlin.test.*

class testpoint {
    @Test
    fun testGetX() {
        val p = Point(1.5, 2.5)
        assertEquals(1.5, p.getX(), 1e-6)
    }

    @Test
    fun testGetY() {
        val p = Point(1.5, 2.5)
        assertEquals(2.5, p.getY(), 1e-6)
    }

    @Test
    fun testClone() {
        val p = Point(3.0, 4.0)
        val c = p.clone()
        assertNotSame(p, c)
        assertEquals(3.0, c.getX(), 1e-6)
        assertEquals(4.0, c.getY(), 1e-6)
    }

    @Test
    fun testMove() {
        val p = Point(1.0, 2.0)
        p.move(3.0, 4.0)
        assertEquals(4.0, p.getX(), 1e-6)
        assertEquals(6.0, p.getY(), 1e-6)
    }
}
