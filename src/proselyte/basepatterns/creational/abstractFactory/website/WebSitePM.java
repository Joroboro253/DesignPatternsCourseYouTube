package proselyte.basepatterns.creational.abstractFactory.website;

import proselyte.basepatterns.creational.abstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
