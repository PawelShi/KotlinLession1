import java.util.List;

public class Lession1 {
    public static void main(String[] args) {
        System.out.println("Start homework 1 on Java");

        IPersonRepository repository = new PersonRepositoryDefault();
        List<Person> listPerson = repository.load();

        System.out.println("Совершеннолетние:");
        listPerson.stream().filter(person -> (person.age != null && person.age>=18))
                .map(person -> person.name)
                .toList()
                .forEach(s -> System.out.println(s));

        System.out.println("Неполные данные:");
//        listPerson.stream().filter(person -> person.age == null)
//                .sorted((o1, o2) -> )

    }

}
