package oop

class Phone {
    var name:String
    var os:String
    var charger:String

    constructor(name: String, os: String, charger: String) {
        this.name = name
        this.os = os
        this.charger = charger
    }
    fun call(phoneNumber:String){
        println("I can call using the number $phoneNumber")
    }
    fun sms(phoneNumber: String){
        println("I can SMS the number $phoneNumber")
    }
    fun hungUp(phoneNumber: String){
        println("Yeah, I can hung up")
    }
}