package entities.ex1;

public class Student {
    private String name;
    private int enrolledCredits;

    public Student(String name) {
        this.name = name;
        this.enrolledCredits = 0;
    }

    public void enroll(int credits) {
        int targetCredits = this.enrolledCredits + credits;
        if (targetCredits > 30) {
            throw new CreditLimitException(targetCredits);
        }

        this.enrolledCredits = targetCredits;
        System.out.println("Matrícula de " + credits + " créditos realizada com sucesso. Total atual: " + this.enrolledCredits);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrolledCredits() {
        return enrolledCredits;
    }
}
