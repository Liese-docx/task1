fun main(args: Array<String>) {
    println("Enter the year: ")
    val year = readln().toInt()
    val century = (year-1)/100+1
    println("the century is $century")
}