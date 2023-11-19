fun main() {
    var input = readln()
    val croatia = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")

    for (alphabet in croatia) {
        if (input.contains(alphabet)) {
            input = input.replace(alphabet, "@")
        }
    }
    
    println(input.length)
}