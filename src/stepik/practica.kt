//1.10 Практика - "Обратная разработка" stepik.org
fun main() {
    //******************************************************************************************************
    //Sample Input 1: 5 6
    //Sample Output 1: -1

//    val a = scan.nextInt()
//    val b = scan.nextInt()
//    print(a-b)

    //******************************************************************************************************
    //Sample Input 1: Cats
    //Sample Output 1: staC

//    val str = readLine()?.reversed()
//    print(str)

    //******************************************************************************************************
    //Sample Input 1: Kotlin
    //Sample Output 1: Kot
    //Sample Input 4: 1234__5678
    //Sample Output 4: 1234_

//    val str = readLine()!!
//    print(str.substring(0, (str.length)/2))

    //******************************************************************************************************
    //Sample Input 1: Kotlin
    //Sample Output 1: 36
    //Sample Input 2: java
    //Sample Output 2: 16

//    val str = scan.nextLine()
//    var len = str.length
//    print(len*len)

    //******************************************************************************************************
    //Sample Input 1: Cats
    //Sample Output 1: CaTs
    //Sample Input 2: dogS
    //Sample Output 2: DoGs

//    val str = scan.nextLine()
//    print("${ str[0].uppercaseChar() }${str[1].lowercaseChar()}${str[2].uppercaseChar()}${str[3].lowercaseChar()}")

    //******************************************************************************************************
    //Sample Input 1: 5 6
    //Sample Output 1: -11
    //Sample Input 2: 7 4
    //Sample Output 2: 33
    //Sample Input 3: 8 0
    //Sample Output 3: 64

//    var a = scan.nextInt()
//    var b = scan.nextInt()
//    a*=a
//    b *= b
//    print(a-b)

    //******************************************************************************************************
    //Sample Input 1: 56
    //Sample Output 1: 30
    //Sample Input 2: 74
    //Sample Output 2: 28

//    val str = scan.nextLine()
//    val a = str[0].toString().toInt()
//    val b = str[1].toString().toInt()
//    print(a*b)

    //******************************************************************************************************
    //Sample Input 1: 55
    //Sample Output 1: true

    //Sample Input 2: 74
    //Sample Output 2: false

    //Sample Input 3: 83
    //Sample Output 3: false

    //Sample Input 4: 51
    //Sample Output 4: false

    //Sample Input 5: 12
    //Sample Output 5: false

    //Sample Input 6: 10
    //Sample Output 6: true

//    val i = scan.nextInt()
//    if (i%5==0) print(true)
//    else print(false)

    //******************************************************************************************************
    //Sample Input 1: Hello
    //Sample Output 1: odd

    //Sample Input 2: java
    //Sample Output 2: even

    //Sample Input 3: Normal
    //Sample Output 3: even

    //Sample Input 4: Cat
    //Sample Output 4: odd

    val str = scan.nextLine()
    if (str.length%2!=0 || str.length%2!=0) print("odd")
    else print("even")

}