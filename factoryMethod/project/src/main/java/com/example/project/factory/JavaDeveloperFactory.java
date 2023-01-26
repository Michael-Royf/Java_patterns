package com.example.project.factory;

import com.example.project.developers.Developer;
import com.example.project.developers.JavaDeveloper;

public class JavaDeveloperFactory  implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
