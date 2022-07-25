fun main () {
    //***********************************************************************************************************
    //Напишите программу, которая считывает переменную типа Double и выводит её значение, уменьшенное на единицу

    //print(scan.nextDouble() - 1)

    //***********************************************************************************************************
    //Напишите программу, которая считывает две переменных типа Double и выводит:
    //1."Да", если округлённые по правилам математики значения переменных равны
    //2."Нет" в обратном случае

//    var a = Math.round(scan.nextDouble())
//    var b = Math.round(scan.nextDouble())
//    if (a==b) print("Да")
//    else print("Нет")

    //***********************************************************************************************************
    //Напишите программу, которая считывает четыре переменных типа Int и выводит максимальное из них


//    val e = Math.max(scan.nextInt(), scan.nextInt())
//    val f = Math.max(scan.nextInt(), scan.nextInt())
//    print(Math.max(e, f))

    //***********************************************************************************************************
    //Напишите программу, которая считывает четыре переменных типа Int и переменную EE типа Boolean. И выводит:
    //Если E = true, то минимальное из этих чисел
    //Иначе - максимальное.
    //NB! При наличии нескольких минимумов/максимумов выводим ровно одно из них.

//    val a = scan.nextInt()
//    val b = scan.nextInt()
//    val c = scan.nextInt()
//    val d = scan.nextInt()
//    when (scan.nextBoolean()) {
//        true -> print (Math.min(Math.min(a, b), Math.min(c, d)))
//        false -> print (Math.max(Math.max(a, b), Math.max(c, d)))
//    }

    //***********************************************************************************************************
    //Напишите программу, которая считывает числа A, B, C, D, E и F, и рассчитывает стоимость путёвки в лагерь, если:
    //Ребёнок питается A раз в день
    //Стоимость одного обеда - B рублей
    //Стоимость одного дня проживания - C рублей
    //Путь на поезде в одно направление стоит D рублей
    //Смена длится E дней
    //Персональная скидка - F рублей

//    val countEatOneDay = scan.nextInt()
//    val priceOneLunch = scan.nextInt()
//    val priceOneDayResidence = scan.nextInt()
//    val ticket = scan.nextInt()
//    val countDay = scan.nextInt()
//    val personalDiscount = scan.nextInt()
//    print((countEatOneDay*priceOneLunch+priceOneDayResidence) * countDay + (ticket * 2) - personalDiscount)

    //***********************************************************************************************************
    //Напишите программу, которая считывает переменные A, B и C и рассчитывает скидку на путёвку на каждого из
    //членов семьи в санаторий, если:
    //
    //A - месячная зарплата мамы
    //B - месячная зарплата папы
    //C - кол-во членов в семье
    //Стоимость путёвки на семью равна 100000 руб
    //Предоставляются следующие скидки:
    //
    //
    //
    //0%, если з/п в месяц на одного члена семьи >= 20000 руб
    //10%, если з/п в месяц на одного члена семьи < 20000 руб
    //20%, если з/п в месяц на одного члена семьи < 18000 руб
    //30%, если з/п в месяц на одного члена семьи < 16000 руб
    //40%, если з/п в месяц на одного члена семьи < 12000 руб
    //50%, если з/п в месяц на одного члена семьи < 10000 руб

    val salaryMother = scan.nextInt()
    val salaryFather = scan.nextInt()
    val countMembersFamaly = scan.nextInt()
    val ticket = 100000
    val salaryForOneMembers = (salaryFather+salaryMother)/countMembersFamaly
    var discount = 0.0
    if (salaryForOneMembers >= 20000) discount
    else if (salaryForOneMembers in 18000..19999) discount = ticket*0.1/countMembersFamaly
    else if (salaryForOneMembers in 16000..17999) discount = ticket*0.2/countMembersFamaly
    else if (salaryForOneMembers in 12000..15999) discount = ticket*0.3/countMembersFamaly
    else if (salaryForOneMembers in 10000..11999) discount = ticket*0.4/countMembersFamaly
    else ticket*0.5/countMembersFamaly
    print (discount.toInt())

    //***********************************************************************************************************

}