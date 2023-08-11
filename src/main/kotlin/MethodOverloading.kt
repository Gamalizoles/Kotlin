fun main(args: Array<String>) {
  avg(10,20.0)
  avg(10,20.0,30.0f)
    println(solution("bob"))
}

fun avg(x:Int, y:Double){
    var jibu = (x + y)/2.0
    println("Your avg1 answer ia $jibu")
}

fun avg(x:Int, y:Double, z:Float) {
    var jibu = (x + y + z) / 3.0
    println("Your avg2 answer ia $jibu")
}

//Create a function to determine that the value submitted by
//a user is a palindrome

fun solution(inputString:String):Boolean{
    if (inputString.reversed()== inputString){
        return true
    }else{
        return false
    }
}
