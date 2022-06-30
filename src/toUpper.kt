
val scan = java.util.Scanner(System.`in`)
fun main () {

//*******************************
//    val str = scan.nextLine()
//    println(str.toUpperCase())

//Напишите программу, которая считывает целое число, делит его на 10 и выводит получившееся частное.
//********************************
//    var number = scan.nextInt()
//    number /=10
//    println(number)

//Напишите программу, которая считывает целые числа aa и bb и находит значение выражения: 5*(b-a)
//*******************************
//    val a = scan.nextInt()
//    val b = scan.nextInt()
//    val c = 5*(b - a)
//    println(c)

//Напишите программу, которая считывает два числа и выводит их в обратном порядке через пробел.
//*****************************
//    val a = scan.nextInt()
//    val b = scan.nextInt()
//    println("$b $a")
//Напишите программу, которая считывает трехзначное число и разворачивает его.
//*****************************
//    val str = scan.nextLine()
//    println("${str[2]}${str[1]}${str[0]}")
//Напишите программу, которая считывает два трёхзначных числа и складывает первый и третий разряд
//каждого из них. Например, если введены числа 191191 и 292292, ответом будет число 6 (1 + 1 + 2 + 2 = 61+1+2+2=6).
//****************************
// val str = scan.nextLine().toString()
// val str1 = str.substringBefore(" ")
// val str2 = str.substringAfter(" ")
// val a = str1[0].toString().toInt()
// val b = str1[2].toString().toInt()
// val c = str2[0].toString().toInt()
// val d = str2[2].toString().toInt()
// println(a+b+c+d)
//Напишите программу, которая считывает число от 1000 до 9999, разворачивает его и выводит без ведущих нулей:
//1300 -> 0031 -> 31 // т.е. нули спереди числа - ведущие нули
//****************************

  val numberRead = scan.nextLine().reversed().substringAfter("0").toInt()
 println(numberRead)

 }