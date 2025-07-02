import kotlin.test.*

class testellipse {
    @Test
    fun testArea() {
        val e = Ellipse(Point(0.0, 0.0), 2.0, 1.0)
        assertEquals(Math.PI * 2.0 * 1.0, e.area(), 1e-6)
    }
}
