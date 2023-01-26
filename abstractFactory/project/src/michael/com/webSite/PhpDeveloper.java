package michael.com.webSite;

import michael.com.inter.Developer;

public class PhpDeveloper  implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes code...");
    }
}
