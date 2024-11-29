public class ExperienceReport extends MainReportContent {
    @Override
    public String mainReportContent(Employee employee) {
        return "Employee Details:\n" +
                "Name: " + employee.getFullName() + "\n" +
                "Position: " + employee.getPosition() + "\n" +
                "Years of Experience: " + employee.getExperienceYears() + "\n";
    }
}
