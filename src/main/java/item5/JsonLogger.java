package item5;

public class JsonLogger implements Logger{
    @Override
    public String info(String message) {
        return "{ \"message\": \"%s\" }".formatted(message);
    }
}
