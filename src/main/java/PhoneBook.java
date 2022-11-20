import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class PhoneBook {

    private final Map<String, Long> phonebook = new HashMap<>();

    public int add(String name, long phone) {
        phonebook.put(name, phone);
        return phonebook.size();
    }

    public Map<String, Long> findByNumber(long phone) {
        return Stream.of(phonebook)
                .filter(x -> x.containsValue(phone))
                .findFirst()
                .orElse(null);
    }

}
