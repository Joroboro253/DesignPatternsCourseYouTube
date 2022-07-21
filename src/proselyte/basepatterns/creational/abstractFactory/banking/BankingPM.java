package proselyte.basepatterns.creational.abstractFactory.banking;

import proselyte.basepatterns.creational.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking projects...");
    }
}
