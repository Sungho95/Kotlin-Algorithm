fun main() {
    val mutableSet = mutableSetOf<Int>()
    
    repeat(10) {
        val input = readln().toInt()
        mutableSet.add(input % 42)
    }

    println(mutableSet.size)
}