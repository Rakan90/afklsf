public class ReportBuilder {
    private Settings settings = Settings.getInstance();

    public String buildReport(Employee employee, MainReportContent contentProvider) {
        StringBuilder report = new StringBuilder();

        report.append(settings.getHeader()).append("\n");
        report.append(contentProvider.makeMainReportContent(employee));
        report.append(settings.getFooter());

        return report.toString();
    }

    public void setHeader(String header) {
        settings.setHeader(header);
    }

    public void setFooter(String footer) {
        settings.setFooter(footer);
    }
}