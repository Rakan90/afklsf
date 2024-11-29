public class PayReport extends MainReportContent {
    @Override
    public String mainReportContent(Employee employee) {
        return "Employee Report\n" +
                "Name: " + employee.getFullName() + "\n" +
                "Job Title: " + employee.getPosition() + "\n" +
                "Salary: $" + employee.getSalary() + "\n";
    }
}

