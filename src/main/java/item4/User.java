package item4;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;
import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Value
@EqualsAndHashCode(exclude = {"name"})
public class User {
    Ulid id;
    String name;

    static User create(String name) {
        val id = UlidCreator.getUlid();
        return new User(id, name);
    }

    static User reConstructor(Ulid id, String name) {
        return new User(id, name);
    }
}
