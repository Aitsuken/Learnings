fun main(args: Array<String>) {
    val num = readLine() ?: "0"
    val parsed = try {
        num.toInt()
    } catch (e: Exception) {
        0
    }
    println(parsed)
}

/*    val proger = Programmer()
    val jessica = object: Person("Jessica", 159, 16){
        override fun cry() {
            println("Any plans tonight?")
        }
    }
    jessica.cry()*/
//proger.cry();
//printStr("Hello warudo!")
//print(26.isOdd())
/*    val x = 101
    when(x){
        in 1..5 -> println("x is in 1 and 5")
        in 5..10 -> println("x is in 5 and 10")
        in 1..10 -> println("x is in 1 and 10")
        else -> {
            println("x is not in 1 and 10")
        }
    }*/
/*    println(listInt[3])
    var counter = 0
    while(counter < listInt.size){
        println(listInt[counter])
        counter++
    }*/
/*    for(i in 1..100){
        println(i);
    }*/
fun Int.isOdd(): Boolean {
    return this % 2 != 0
}

fun printStr(word: String) {
    println(word)
}

/*fun isOdd(int : Int): Boolean{
    return int % 2 != 0
}*/
fun printHello() {
    print("Hello World!")
}