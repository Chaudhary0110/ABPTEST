package pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import testBase.TestBase;

public class ExaminationAndResult extends TestBase {

	public static final Logger log = Logger.getLogger(ExaminationAndResult.class.getName());
	
		
	@FindBy (linkText = "Examination Master")
	WebElement examinationMaster;
	
	@FindBy (linkText = "Exam Configuration Master")
	WebElement examConfigMaster;
	
	@FindBy (linkText = "Exam Configuration Transaction")
	WebElement ExamConfigurationTransaction;
	
	@FindBy (linkText = "Exam Configuration Transaction College Wise")
	WebElement ExamConfigurationTransactionCollegeWise;
	
	@FindBy (linkText = "Grace Configuration Master")
	WebElement GraceConfigurationMaster;
	
	@FindBy (linkText = "District Place Mapping")
	WebElement DistrictPlaceMapping;
	
	@FindBy (linkText = "Exam Challan No. Configuration")
	WebElement ExamChallanNoConfiguration;
	
	
			
	public ExaminationAndResult (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
		
	public WebElement getExaminationMaster(){
		log("Mouse Hover to Examination Master");
		return examinationMaster;
	}	
	
	public WebElement getExamConfigMaster(){
		log("Clicked on Exam Config Master");
		return examConfigMaster;
	}
	
	public WebElement getExamConfigurationTransaction(){
		log("Clicked on Exam Configuration Transaction");
		return ExamConfigurationTransaction;
	}
	
	public WebElement getExamConfigurationTransactionCollegeWise(){
		log("Clicked on Exam Configuration Transaction College Wise");
		return ExamConfigurationTransactionCollegeWise;
	}
	
	public WebElement getGraceConfigurationMaster(){
		log("Clicked on Grace Configuration Master");
		return GraceConfigurationMaster;
	}
	
	public WebElement getDistrictPlaceMapping(){
		log("Clicked on District PlaceMapping");
		return DistrictPlaceMapping;
	}
	
	public WebElement getExamChallanNoConfiguration(){
		log("Clicked on Exam Configuration Transaction");
		return ExamChallanNoConfiguration;
	}
	
	
	public void log(String data){
		log.info(data);
		Reporter.log(data);
	}
}
