package eu.jpereira.trainings.designpatterns.creational.abstractfactory;

/**
 * Abstract factory for creating report elements.
 */
public interface ReportFactory {

    ReportHeader createHeader();

    ReportBody createBody();

    ReportFooter createFooter();

}
