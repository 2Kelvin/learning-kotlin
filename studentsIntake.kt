import java.util.*

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    println("How many students do you have?")
    var numOfStuds = scanner.nextInt()
    var students = arrayOfNulls<String>(numOfStuds)
    var regNo = arrayOfNulls<Int>(numOfStuds)
    var grade = arrayOfNulls<String>(numOfStuds)
    println("Enter the $numOfStuds students")
    //loop to receive the names and salaries of the employees
    var i = 0
    while (i<numOfStuds) {
        students[i] = scanner.next()
        println("Enter " +students[i]+ "'s registration number")
        regNo[i] = scanner.nextInt()
        println("Enter " +students[i]+ "'s grade")
        grade[i] = scanner.next()
        i++
    }
    //loop to print employee names and salaries
    var u = 0
    while (u<numOfStuds) {
        println(students[u]+ ":  Registration Number; " +regNo[u]+ "  Grade; " +grade[u])
        u++
    }
}