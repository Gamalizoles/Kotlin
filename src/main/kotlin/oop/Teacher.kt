package oop

open class Teacher(name:String,
                   email:String,
                   password:String):User(name, email, password) {
    fun sybmitResults(){
        println("Yeah, I can submit results")
    }
    fun takeAttendance(){
        println("Yeah, I can take attendance")
    }
}