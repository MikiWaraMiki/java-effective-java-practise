package item4;

import com.github.f4b6a3.ulid.Ulid;
import com.github.f4b6a3.ulid.UlidCreator;
import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Nested
    @DisplayName("create")
    class CreateTest {
        @Test
        void ULIDが生成されたインスタンスが生成されること() {
            val name = "yamada";

            val user = User.create(name);

            assertNotNull(user.getId());
            assertEquals(name, user.getName());
        }
    }

    @Nested
    @DisplayName("reConstructor")
    class ReConstructorTest {
        @Test
        void 指定したULIDと名前を持つインスタンスが生成されること() {
            val id = UlidCreator.getUlid();
            val name = "yamada";

            val user = User.reConstructor(id, name);

            assertEquals(id, user.getId());
            assertEquals(name, user.getName());
        }
    }

    @Nested
    @DisplayName("equals")
    class EqualsTest {
        @Test
        void IDが同じ場合はtrueを返すこと() {
            val id = UlidCreator.getUlid();

            val user1 = User.reConstructor(id, "user1");

            val user2 = User.reConstructor(id, "user2");

            assertEquals(user1, user2);
        }
    }
}