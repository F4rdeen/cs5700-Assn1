import kotlin.test.*

class testrectangle {
    @Test
    fun testArea() {
        val r = Rectangle(Point(0.0, 0.0), Point(3.0, 2.0))
        assertEquals(6.0, r.area(), 1e-6)
    }
}