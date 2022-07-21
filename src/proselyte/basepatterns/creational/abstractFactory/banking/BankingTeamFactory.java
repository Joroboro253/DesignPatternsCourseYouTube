package proselyte.basepatterns.creational.abstractFactory.banking;

import proselyte.basepatterns.creational.abstractFactory.Developer;
import proselyte.basepatterns.creational.abstractFactory.ProjectManager;
import proselyte.basepatterns.creational.abstractFactory.ProjectTeamFactory;
import proselyte.basepatterns.creational.abstractFactory.Tester;

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
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
