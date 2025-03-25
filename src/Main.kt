fun main() {
    // Upcasting: Reference of Father pointing to Son object
    val fatherRef: Father = Son("Smith")
    fatherRef.printName()  // Calls overridden method in Son

    // Downcasting: Casting Father reference back to Son
    if (fatherRef is Son) {
        val sonRef: Son = fatherRef as Son
        sonRef.printName()  // Calls method from Son
    }
}

open class Father(val lastName: String) {
    open val firstName: String = "John"

    open fun printName() {
        println("Name: $firstName $lastName")
    }
}

class Son(lastName: String) : Father(lastName) {
    override val firstName: String = "Michael"

    override fun printName() {
        println("Name: $firstName $lastName, Father's Name: ${super.firstName} $lastName")
    }
}
