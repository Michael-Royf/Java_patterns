package com.example.project;

import com.example.project.developers.Developer;
import com.example.project.factory.CppDeveloperFactory;
import com.example.project.factory.DeveloperFactory;
import com.example.project.factory.JavaDeveloperFactory;
import com.example.project.factory.PhpDeveloperFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProjectApplication {
    public static void main(String[] args) {
        System.out.println("Enter the programming language");
        String language = null;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            language = bufferedReader.readLine();
            language = language.trim();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DeveloperFactory developerFactory = createDeveloperBySpeciality(language);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }

    }
}
