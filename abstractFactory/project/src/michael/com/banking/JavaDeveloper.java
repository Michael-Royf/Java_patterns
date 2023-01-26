package michael.com.banking;

import michael.com.inter.Developer;

public class JavaDeveloper  implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes code...");
    }
}
