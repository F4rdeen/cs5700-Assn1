import kotlin.test.*

class testcircle {
    @Test
    fun testArea() {
        val c = Circle(Point(0.0, 0.0), 2.0)
        assertEquals(Math.PI * 4.0, c.area(), 1e-6)
    }
}
