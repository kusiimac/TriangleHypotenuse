import kotlin.math.sqrt
/**
 *c2 = a2 + b2
 * If a right-angled triangle has base 4cm, height 3cm
 * Find the hypotenuse of the triangle
 */
fun main () {
    //This program will calculate the hypotenuse of a triangle whose base is 4cm and height 3cm
    val a = 3
    val b = 4
    val x = ((a * a) + (b * b))
    val y = x.toDouble()
    val c = sqrt(y)
    println("The hypotenuse of the triangle is ${c.toInt()} cm")
}