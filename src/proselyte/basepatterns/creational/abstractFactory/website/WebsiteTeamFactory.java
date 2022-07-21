package proselyte.basepatterns.creational.abstractFactory.website;

import proselyte.basepatterns.creational.abstractFactory.Developer;
import proselyte.basepatterns.creational.abstractFactory.ProjectManager;
import proselyte.basepatterns.creational.abstractFactory.ProjectTeamFactory;
import proselyte.basepatterns.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
