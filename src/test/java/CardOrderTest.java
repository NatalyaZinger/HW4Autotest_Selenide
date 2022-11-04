import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class CardOrderTest {
    @Test
    void shouldRegister() {
        open("http://localhost:9999");
        $("[placeholder='Город']").setValue("Челябинск");

    }

    }