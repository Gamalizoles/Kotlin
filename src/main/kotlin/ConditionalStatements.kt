fun main(args: Array<String>) {
    val age = 18
    if (age<18){
        println("FALSE")
    }else{
        println("TRUE")
    }
    if(age >= 18){
        println("FALSE")
    }else{
        println("TRUE")
    }

    var x = 10
    var y = 20
    if (x < y || y > 50){
        println("FALSE")
    }else{
        println("TRUE")
    }

    var bettingNumber = 3
    if (bettingNumber == 1){
        println("You won a car")
    }else if(bettingNumber == 2){
        println("You won a horse")
    }else if (bettingNumber == 3){
        println("You won 3M")
    }else if (bettingNumber == 4){
        println("You lost")
    }else{
        println("Enter a number from 1-4 to bet")
    }

    var number = 0
    when(number){
        0 -> {
            println("You have selected zero")
        }
        1 -> {
            println("You have selected one")
        }
        2 -> {
            println("You have selected two")
        }
        else -> {
            println("You haven't selected a valid number")
        }
    }
}