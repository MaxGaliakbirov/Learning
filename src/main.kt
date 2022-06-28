import java.io.File
import java.lang.System.out


fun main () {
    val file = File("./src/input.txt")
    val inLine = file.bufferedReader().readLine() //прочитали файл

    val a = inLine.substringBefore(" ").toInt() //взяли первое значение по индксу
    val b = inLine.substringAfter(" ").toInt()
    val result = a + b
    val outLine = File("./src/output.txt")
    outLine.writeText(result.toString()) //записали в файл

}


//   var line = scan.nextLine()
//    val scan = java.util.Scanner(System.`in`)
//    var line = scan.nextLine()
//    var s = line.substring(1 until line.length)
//    val s1 = "Q"
//    println(s1 + s)
//    val a = scan.nextInt()
//    val b = scan.nextInt()
//    println(a + b)

