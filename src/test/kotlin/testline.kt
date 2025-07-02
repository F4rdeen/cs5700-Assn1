import kotlin.test.*

class testline {
    @Test
    fun testLength() {
        val l = Line(Point(0.0, 0.0), Point(3.0, 4.0))
        assertEquals(5.0, l.length(), 1e-6)
    }
}
