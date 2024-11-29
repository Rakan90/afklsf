public class PayReport extends MainReportContent {
    @Override
    public String makeMainReportContent(Employee employee) {
        return "Employee Report\n" +
                "Name: " + employee.getName() + "\n" +
                "Job Title: " + employee.getJobTitle() + "\n" +
                "Salary: $" + employee.getSalary() + "\n";
    }
}

