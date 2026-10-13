
open class Person(
    val firstName: String,
    val lastName: String,
    var age: Int
) {
    constructor(firstName: String, lastName: String) : this(firstName, lastName, 19)

    open fun displayInfo() {
        print("Name: $firstName $lastName | Age: $age")
    }
}

class Student(
    firstName: String,
    lastName: String,
    age: Int,
    val enrollmentNo: String,
    val branch: String,
    val className: String,
    val labBatch: String
) : Person(firstName, lastName, age) {

    constructor(
        firstName: String,
        lastName: String,
        enrollmentNo: String,
        branch: String
    ) : this(
        firstName, lastName, 20, enrollmentNo, branch,
        "Default-Class", "A"
    )

    override fun displayInfo() {
        super.displayInfo()
        println(
            " | Enrollment No: $enrollmentNo | Branch: $branch | Class: $className | Lab Batch: $labBatch"
        )
    }
}

fun main() {
    val studentList = ArrayList<Student>()

    // Populating using the Primary Constructor
    studentList.add(
        Student("Pushti", "Gandhi", 20, "026", "Computer Engineering", "I", "I2")
    )
    studentList.add(
        Student("Riddhi", "Prajapati", 19, "156", "Information Technology", "A", "A1")
    )
    studentList.add(
        Student("dhruva", "Patel", 21, "095", "Machine Learning", "B", "B1")
    )
    studentList.add(
        Student("astha", "Raval", 19, "169", "Computer Science and Engineering", "C", "C1")
    )

    // Using the Secondary Constructor
    studentList.add(
        Student("Pankti", "Joshi", "030", "Psychology")
    )

    println("================ Student List Data ================")

    for (student in studentList) {
        student.displayInfo()
    }
}
