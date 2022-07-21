package proselyte.basepatterns.creational.abstractFactory.website;

import proselyte.basepatterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code");
    }
}
