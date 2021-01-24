fun main() {
    agoToText(61)
}

fun printResult(result: String) {
    println("Был(а) в сети $result")
}

fun agoToText(seconds: Int) {
    when (seconds) {
        in 0..60 -> printResult("только что")
        in 61..60 * 60 -> resultOfMinutes(seconds / 60)
        in 60 * 60 + 1..24 * 60 * 60 -> resultOfHours(seconds/3600)
        in 86_400..172_800 -> printResult("сегодня")
        in 172_800..259_200 -> printResult("вчера")
        else -> printResult("давно")
    }
}

fun resultOfMinutes(minutes: Int) {
    if (minutes % 100 in 11..14) {
        printResult("$minutes минут назад")
    } else when (minutes % 10) {
        1 -> printResult("$minutes минуту назад")
        2, 3, 4 -> printResult("$minutes минуты назад")
        else -> printResult("$minutes минут назад")
    }
}

fun resultOfHours(hours: Int) {
    when (hours % 100){
        1, 21 -> printResult("$hours час назад")
        in 5..20 -> printResult("$hours часов назад")
        else -> printResult("$hours часа назад")
    }
}





