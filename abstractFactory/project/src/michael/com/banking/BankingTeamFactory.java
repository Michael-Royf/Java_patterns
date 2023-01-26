package michael.com.banking;

import michael.com.inter.Developer;
import michael.com.inter.ProjectManager;
import michael.com.inter.ProjectTeamFactory;
import michael.com.inter.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getManager() {
        return new BankingPM();
    }
}
