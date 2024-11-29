public class ReportFactory {
    public MainReportContent createReport(String type) {
        switch (type) {
            case "yearsOfExperience":
                return new ExperienceReport();
            case "pay":
                return new PayReport();
            default:
                throw new IllegalArgumentException("Unknown report type");
        }
    }
}
