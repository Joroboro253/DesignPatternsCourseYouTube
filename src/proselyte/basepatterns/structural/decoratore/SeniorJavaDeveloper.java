package proselyte.basepatterns.structural.decoratore;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code rewiew.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
