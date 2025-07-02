import kotlin.test.*

class testsquare {
    @Test
    fun testArea() {
        val s = Square(Point(0.0, 0.0), Point(2.0, 2.0))
        assertEquals(4.0, s.area(), 1e-6)
    }
}