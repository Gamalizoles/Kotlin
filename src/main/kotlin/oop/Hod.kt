package oop

class Hod(name:String,
          email:String,
          password:String):Teacher(name,email,password) {
    fun suspendTeacher(){
        println("I can suspend a teacher")
    }
    fun scheduleMeeting(){
        println("I can schedule a meeting")
    }
}
