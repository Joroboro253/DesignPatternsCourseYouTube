package proselyte.basepatterns.creational.abstractFactory.banking;

import proselyte.basepatterns.creational.abstractFactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
