fun main() {
    var total = 0.0
    var gradeSum = 0.0

    for (i in 0 until 20) {
        val input = readln().split(" ")
        val grade = input[1].toDouble()
        val rating = input[2]

        if (rating == "P") {
            continue
        }

        val score = getScore(rating)
        total += grade * score
        gradeSum += grade
    }

    println("%.6f".format(total / gradeSum))
}

fun getScore(rating: String): Double {
    return when (rating) {
        "A+" -> 4.5
        "A0" -> 4.0
        "B+" -> 3.5
        "B0" -> 3.0
        "C+" -> 2.5
        "C0" -> 2.0
        "D+" -> 1.5
        "D0" -> 1.0
        else -> 0.0
    }
}