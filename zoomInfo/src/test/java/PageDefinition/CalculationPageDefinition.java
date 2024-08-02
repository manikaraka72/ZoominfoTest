package PageDefinition;

import StepDefinition.Hook;
import io.cucumber.java.ca.Cal;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculationPageDefinition extends Hook {

    @FindBy(id = "BtnParanL")
    private WebElement CurveL;
    @FindBy(id = "BtnParanR")
    private WebElement CurveR;

    @FindBy(id = "BtnMult")
    private WebElement Multiple;



    @FindBy(id = "Btn0")
    private WebElement Zero;
    @FindBy(id = "Btn1")
    private WebElement One;
    @FindBy(id = "Btn2")
    private WebElement Two;
    @FindBy(id = "Btn3")
    private WebElement Three;
    @FindBy(id = "BtnPlus")
    private WebElement Plus;
    @FindBy(id = "BtnMinus")
    private WebElement Minus;

    @FindBy(id = "BtnCalc")
    private WebElement Calculate;
    @FindBy(id = "BtnSin")
    private WebElement Sin;


    @FindBy(xpath = "//div[@id='histframe']/ul/li/p")
    private WebElement latestResult;





    public  CalculationPageDefinition(){
        PageFactory.initElements(driver, this);

    }
    public void Sub(){
        One.click();
        Zero.click();
        Minus.click();
        Two.click();
        Calculate.click();;
    }
    public void add(){
        Two.click();
        Plus.click();
        Three.click();
        Calculate.click();;
    }
    public void multiple(){
        CurveL.click();
        One.click();
        Zero.click();
        Minus.click();
        Two.click();
        CurveR.click();
        Multiple.click();
        Two.click();
        Calculate.click();;
    }
    public void sinDetails(){
        Sin.click();
        Three.click();
        Zero.click();
        CurveR.click();
        Calculate.click();;
    }

    public void verifyResult(int exp){
        Assert.assertEquals(Integer.parseInt(latestResult.getAttribute("title")),exp);
    }

    public void verifyNoResult(int exp){
        Assert.assertNotEquals(Integer.parseInt(latestResult.getAttribute("title")),exp);
    }

    public void verifyFloatResult(String exp){
        Assert.assertEquals(latestResult.getAttribute("title"),exp);
    }



}
