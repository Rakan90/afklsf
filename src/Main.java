public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice", "Software Engineer", 120000, 5);
        ReportBuilder reportBuilder = new ReportBuilder();

        ReportFactory factory = new ReportFactory();

        MainReportContent experienceReport = factory.createReport("yearsOfExperience");
        MainReportContent payReport = factory.createReport("pay");

        System.out.println(reportBuilder.buildReport(employee, experienceReport));

        System.out.println(reportBuilder.buildReport(employee, payReport));

        reportBuilder.setHeader("=== Custom Header ===");
        reportBuilder.setFooter("=== Custom Footer ===");

        System.out.println(reportBuilder.buildReport(employee, experienceReport));
    }
}