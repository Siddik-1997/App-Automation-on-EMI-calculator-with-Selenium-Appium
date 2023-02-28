import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMIPage {
    @FindBy(id = "com.continuum.emi.calculator:id/btnStart")
    AndroidElement btnStart;
    @FindBy(id = "com.continuum.emi.calculator:id/etLoanAmount")
    AndroidElement txtLoanAmount;
    @FindBy(id = "com.continuum.emi.calculator:id/etInterest")
    AndroidElement txtInterest;
    @FindBy(id = "com.continuum.emi.calculator:id/etYears")
    AndroidElement txtYear;
    @FindBy(id="com.continuum.emi.calculator:id/etMonths")
    AndroidElement txtMonth;
    @FindBy(id = "com.continuum.emi.calculator:id/etFee")
    AndroidElement txtProcessingFee;
    @FindBy(id="com.continuum.emi.calculator:id/etEMI")
    AndroidElement txtEMI;
    @FindBy(id="com.continuum.emi.calculator:id/rbPeriod")
    AndroidElement btnPeriod;

    @FindBy(id = "com.continuum.emi.calculator:id/btnCalculate")
    AndroidElement btnCalculate;


    @FindBy(id = "com.continuum.emi.calculator:id/monthly_emi_result")
    AndroidElement txtEMIMonthlyAmountResult;
    @FindBy(id = "com.continuum.emi.calculator:id/total_interest_result")
    AndroidElement txtTotalInterestResult;
    @FindBy(id = "com.continuum.emi.calculator:id/processing_fee_result")
    AndroidElement txtProcessingFeeResult;
    @FindBy(id = "com.continuum.emi.calculator:id/total_payment_result")
    AndroidElement txtTotalPaymentResult;

    @FindBy(id = "com.continuum.emi.calculator:id/btnReset")
    AndroidElement btnReset;

    public EMIPage(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void calculateEMI(int loanAmount, double interest, int emi, double processingFee ) throws InterruptedException {

        txtLoanAmount.sendKeys(""+loanAmount+"");
        txtInterest.sendKeys(""+interest+"");
        btnPeriod.click();
        txtEMI.sendKeys(""+emi+"");
        txtProcessingFee.sendKeys(""+processingFee+"");
        btnCalculate.click();
    }
}
