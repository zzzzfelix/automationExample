package common;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateCommand {

    public static void elementExist(String value) {
        assertThat(value).isEqualTo(true);
    }
}
