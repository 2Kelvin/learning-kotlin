import java.util.*

fun main(args: Array<String>) {
    checkUser()
    checkBMI()
}

//Creating a program that ensures the user has entered ONLY the following details
    //email: anonymous@gmail.com
    //password: anonymous
fun checkUser() {
    var scanner = Scanner(System.`in`)
    println("Enter your email")
    var email = scanner.next()

    println("Enter your password")
    var password = scanner.next()
    if (email != "anonymous@gmail.com" && password != "anonymous") {
        println("GET OUT OF HERE")
    }else {
        println("Welcome")
    }
}

//calculating the BMI of the user
fun checkBMI () {
    var scann = Scanner(System.`in`)
    println("Enter your weight")
    var weight = scann.nextDouble()
    println("Enter your height")
    var height = scann.nextDouble()
    var myBMI = weight/Math.pow(height,2.0)
    if (myBMI < 15) {
        println("You are underweight")
    }else if (myBMI <= 24 && myBMI >= 20){
        println("You're okay")
    }else if (myBMI > 24 && myBMI <= 32){
        println("You're overweight")
    } else {
        println("You are obese")
    }
}
