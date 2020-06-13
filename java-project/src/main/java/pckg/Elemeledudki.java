package pckg;

import java.util.Optional;

/**
 * @author  gasdasd
 */
public class Elemeledudki {

    public static void main(String[] args) {
        System.out.println("eleleeme");
    }

    public static class Elemele {
        private Optional<String> stringOptional;

        public Optional<String> getStringOptional() {
            return stringOptional;
        }

        public void setStringOptional(final Optional<String> stringOptional) {
            this.stringOptional = stringOptional;
        }
    }
}



