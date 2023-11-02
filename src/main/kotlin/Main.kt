/*Обучение
* */

fun main(args:Array<String>) {
    println("Start homework 1 on Kotlin.")

    //Объект - хранилище
    val repository : PersonRepository
    repository = PersonRepositoryDefault()

    //Получаем список
    val listPerson = repository.load()

    //    Действия со списком
    val oldPerson = listPerson.filter { it.age != null && it.age >= 18 }
        .map { person -> person.name  }
    println("Cовершеннолетние: $oldPerson");

    //Список без возраста - только первые 2 ввиде Имя-телефон
    println("Неполные данные: ")
    val errAge = listPerson.filter { it.age == null }
        .take(3)
        .sortedBy { person->person.name }
        .map {  listOf(it.name, it.truePhone) }
        .forEach{ println("Имя: ${it[0]}, телефон: ${it[1]}") }










}