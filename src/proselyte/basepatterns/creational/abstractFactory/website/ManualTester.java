package proselyte.basepatterns.creational.abstractFactory.website;

import proselyte.basepatterns.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
