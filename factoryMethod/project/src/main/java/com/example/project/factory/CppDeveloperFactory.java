package com.example.project.factory;

import com.example.project.developers.CppDeveloper;
import com.example.project.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
