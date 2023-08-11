fun main(args: Array<String>) {
    var marks = 100
    var grade = if (marks <= 40){
        "E"
    }else if (marks <= 50){
        "D"
    }else if (marks <= 60){
        "C"
    }else if (marks <= 70){
        "B"
    }else{
        "A"
    }
    println(grade)


    var bettingNumber = 3
    var bettingResult = when(bettingNumber){
        1 -> {
            println("You have won a car")
        }
        2 -> {
            println("You have won a horse")
        }
        3 -> {
            println("You have won 3M")
        }
        else -> {
            println("You haven't selected a valid number")
        }

    }
    println(bettingResult)
}