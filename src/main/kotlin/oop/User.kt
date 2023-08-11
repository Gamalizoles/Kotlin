package oop

open class User {
    open var name:String=""
    open var email:String=""
    open var password:String=""

    constructor(name: String, email: String, password: String) {
        this.name = name
        this.email = email
        this.password = password
    }

    private var gender:String = ""
    fun setGender(gender:String){
        this.gender = gender
    }
    fun getGender():String{
        return this.gender
    }


    private var idNumber:String = ""
    fun setidNumber(idNumber:String){
        this.idNumber = idNumber
    }
    fun getidNumber():String{
        return this.idNumber
    }



    fun register(){
        println("Yeah, I can register")
    }
    fun login(){
        println("Yeah, I can login")
    }
    fun logout(){
        println("Yeah, I can logout")
    }
}