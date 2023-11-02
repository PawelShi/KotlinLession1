
interface PersonRepository {
    fun load() : List<Person>
}

class PersonRepositoryDefault : PersonRepository{
    override fun load(): List<Person> {
        return listOf(
            Person(id=1, age=10, name="Варя", phone="89022323231"),
            Person(id=2, age=22, name="Семен", phone="89022323231"),
            Person(id=3, age=33, name="Костя", phone="89022323231"),
            Person(id=4, age=12, name="Павел", phone="89022323231"),
            Person(id=5, age=18, name="Света", phone="89022323231"),
            Person(id=6, age=11, name="Катя", phone="89022323231"),
            Person(id=8,  name="Степан",  phone="89223344556"),
            Person(id=9,  name="Никодим", ),
            Person(id=10, name="Феофан",  phone="89009873644"),
        )
    }
}