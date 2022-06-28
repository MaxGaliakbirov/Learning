val usdRate=0.014
fun main(){
    var rub: Double
    print("Укажите колличество рублей: ")
    rub = readLine()?.replace(",", ".")?.toDouble()!!
    print("В долларах это ровно: ${exchangeUsdToRub(rub)}")
}
fun exchangeUsdToRub(rub: Double):Double = rub * usdRate