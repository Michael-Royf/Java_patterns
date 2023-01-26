package com.example.project.factory;

import com.example.project.developers.Developer;
import com.example.project.developers.PhpDeveloper;

public class PhpDeveloperFactory  implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
