package item5;

import lombok.extern.java.Log;
import lombok.val;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class InjectAbleLoggerTest {
    @Test
    void TextLoggerをinjectできること () {
        Supplier<Logger> factory = TextLogger::new;

        val logger = InjectAbleLogger.create(factory);

        assertEquals("hello world", logger.getLogger().info("hello world"));
    }

    @Test
    void JsonLoggerをinjectできること () {
        Supplier<Logger> factory = JsonLogger::new;

        val logger = InjectAbleLogger.create(factory);

        assertEquals("{ \"message\": \"hello world\" }", logger.getLogger().info("hello world"));
    }
}