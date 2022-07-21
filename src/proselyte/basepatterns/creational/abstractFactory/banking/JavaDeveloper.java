package proselyte.basepatterns.creational.abstractFactory.banking;

import proselyte.basepatterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code");
    }
}
