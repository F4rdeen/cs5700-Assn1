import kotlin.test.*

class testtriangle {
    @Test
    fun testArea() {
        val t = Triangle(Point(0.0, 0.0), Point(1.0, 0.0), Point(0.0, 1.0))
        assertEquals(0.5, t.area(), 1e-6)
    }
}