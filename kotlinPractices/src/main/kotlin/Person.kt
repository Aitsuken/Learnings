abstract class Person(
    val name: String,
    val height: Int,
    val age: Int,
) {
    init {
        println("Hello my name is $name")
    }

    abstract fun cry()
}