package oop

fun main(args: Array<String>) {
    println("Welcome to Object Oriented Programming")
    var firstCar = Car("Toyota", "V8", "KDM007J")
    var secondCar = Car("Mercedes", "AMG", "KBP739J")
    println(firstCar.model)
    println(secondCar.reg_no)

    var firstFruit = Fruit("Mango", "Yellow", 35.00)
    var secondFruit = Fruit("Apple", "Pink", 40.00)
    println(firstCar.name)
    var thirdfruit = secondFruit.copy()
    println(secondFruit.toString())

    var firstPhone = Phone("iPhone", "iOS", "Type C")
    var secondPhone = Phone("Samsung", "Android", "Type C")
    secondPhone.call("0719283746")

    var teacherOne = Teacher("Wanyama",
        "wanyama@test.com", "pass123")
    var teacherTwo = Teacher("Mutua",
        "mutua@test.com", "123pass")
    teacherOne.register()


    var firstUser = User("Steve",
        "steve@test.com", "pass123")
    println(firstUser.name)
    println(firstUser.email)
    firstUser.setidNumber("1029384756")
    println(firstUser.getidNumber())


    var history = History()
    history.grading()
    history.standardize()

    var maths = Maths()
    maths.grading()
    maths.standardize()

}

