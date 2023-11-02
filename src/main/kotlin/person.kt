
data class Person(
    val id: Int? = null,
    val name :String? = null,
    val age: Int? = null,
    val phone: String? = null,
){
   val truePhone: String?
        get() = this.phone.toPhone()

}

fun String?.toPhone():String{
    return if (this == null) "не задан телефон"
    else if (this.length != 11) this
    else {

        val el2 = this.substring(startIndex = 1, endIndex = 4)
        val el3 = this.substring(startIndex = 4, endIndex = 7)
        val el4 = this.substring(startIndex = 7, endIndex = 9)
        val el5 = this.substring(startIndex = 9,)
        "+7($el2)-$el3-$el4-$el5"
    }
}