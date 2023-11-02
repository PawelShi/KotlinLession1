import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface IPersonRepository {

    public List<Person> load();
}

class PersonRepositoryDefault implements IPersonRepository {
    @Override
    public List<Person> load() {
        return Arrays.asList(
                new Person(1, 10, "Варя", "89022323231"),
                new Person(2, 22, "Семен", "89022323231"),
                new Person(3, 33, "Костя", "89022323231"),
                new Person(4, 12, "Павел", "89022323231"),
                new Person(5, 18, "Света", "89022323231"),
                new Person(6, 11, "Катя", "89022323231"),
                new Person(8, null, "Степан", "89223344556"),
                new Person(9, null, "Никодим", null),
                new Person(10, null, "Феофан", "89009873644")
        );
    }
}