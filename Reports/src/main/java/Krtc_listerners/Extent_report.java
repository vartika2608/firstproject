package Krtc_listerners;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

 


public class Extent_report {    
static ExtentReports  extent;
    public static ExtentReports CreateTest()    
    {
    
        ExtentSparkReporter reporter = new ExtentSparkReporter("./ExtentReport.html");
        
        reporter.config().setReportName("KSRTC");
        
        reporter.config().setDocumentTitle("Book Tickets");
        
        extent = new ExtentReports();
        extent.attachReporter(reporter);       
        extent.setSystemInfo("Test Engineer", "Vartika");
        return extent;
             
        

 

}
}