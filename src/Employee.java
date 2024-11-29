public class Employee {
    private String fullName;
    private String position;
    private double wage;
    private int experienceYears;

    public Employee(String fullName, String position, double wage, int experienceYears) {
        this.fullName = fullName;
        this.position = position;
        this.wage = wage;
        this.experienceYears = experienceYears;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return wage;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
}
