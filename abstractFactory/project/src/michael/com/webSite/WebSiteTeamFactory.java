package michael.com.webSite;

import michael.com.inter.Developer;
import michael.com.inter.ProjectManager;
import michael.com.inter.ProjectTeamFactory;
import michael.com.inter.Tester;

public class WebSiteTeamFactory  implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getManager() {
        return new WebSitePM();
    }
}
