import kotlin.test.*

class testpoint {
    @Test
    fun testMove() {
        val p = Point(1.0, 2.0)
        p.move(3.0, 4.0)
        assertEquals(4.0, p.getX(), 1e-6)
        assertEquals(6.0, p.getY(), 1e-6)
    }
}
