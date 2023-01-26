package michael.com;

import michael.com.banking.BankingTeamFactory;
import michael.com.inter.Developer;
import michael.com.inter.ProjectManager;
import michael.com.inter.ProjectTeamFactory;
import michael.com.inter.Tester;
import michael.com.webSite.WebSiteTeamFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppMain {
    public static void main(String[] args) {

        System.out.println("Enter factory team name.");        
        // website or bank

        String factoryTeamName = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            factoryTeamName = br.readLine();
            factoryTeamName = factoryTeamName.trim();
        } catch (IOException e) {
            e.printStackTrace();
        }


        ProjectTeamFactory projectTeamFactory = createTeamFactoryByProject(factoryTeamName);
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager manager = projectTeamFactory.getManager();

        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }

    static ProjectTeamFactory createTeamFactoryByProject(String factoryName) {
        if (factoryName.equalsIgnoreCase("bank")) {
            return new BankingTeamFactory();
        } else if (factoryName.equalsIgnoreCase("website")) {
            return new WebSiteTeamFactory();
        } else
            throw new RuntimeException(factoryName + " is unknown Factory Team");
    }
}
