package eu.jpereira.trainings.designpatterns.creational.factorymethod;

/**
 * Concrete Creator that implements the factory method.
 */
public class DefaultReportGenerator extends ReportGenerator {

    @Override
    protected Report createReport(String type) {
        if ("JSON".equals(type)) {
            return new JSONReport();
        } else if ("XML".equals(type)) {
            return new XMLReport();
        } else if ("HTML".equals(type)) {
            return new HTMLReport();
        } else if ("PDF".equals(type)) {
            return new PDFReport();
        }
        return null;
    }

}
