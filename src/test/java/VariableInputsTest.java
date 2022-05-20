import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableInputsTest {

    @Test
    @DisplayName("Making sure this returns the String")
    void yourStringIs() {
        assertEquals("Your string is Drew", VariableInputs.yourStringIs("Drew"));
    }

    @Test
    @DisplayName("Making sure this returns the integer")
    void yourIntIs() {
        assertEquals("Your number is 4", VariableInputs.yourIntIs(4));
    }

    @Test
    @DisplayName("Making sure this returns the double")
    void yourDoubleIs() {
        assertEquals("Your double is 10.5", VariableInputs.yourDoubleIs(10.5));
    }

    @Test
    @DisplayName("Making sure this returns the boolean")
    void yourBooleanIs() {
        assertEquals("Your boolean is true", VariableInputs.yourBooleanIs(true));
    }
}