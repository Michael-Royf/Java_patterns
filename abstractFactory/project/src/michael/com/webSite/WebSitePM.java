package michael.com.webSite;

import michael.com.inter.ProjectManager;

public class WebSitePM  implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages project...");
    }
}
