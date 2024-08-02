package StepDefinition;

import PageDefinition.CalculationPageDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CalculationStepDef {
CalculationPageDefinition cpd=new CalculationPageDefinition();
    @Given("add 2 and 3 numbers")
    public void addTeoNumber(){
        cpd.add();
    }
    @Given("Sin 30 number")
    public void sinDetails(){
        cpd.sinDetails();
    }

    @Given("Sub 10 and 2 numbers")
    public void SubTwoNumber(){
        cpd.Sub();
    }
    @Given("Sub 10 and 2 and multiple 2 numbers")
    public void multiple(){
        cpd.multiple();
    }

    @Then("verify result value as {string}")
    public void verifyFloatResult(String exp) throws InterruptedException {
        Thread.sleep(1000);
        cpd.verifyFloatResult(exp);
    }
    @Then("verify result as {int}")
    public void verifyResult(int exp) throws InterruptedException {
        Thread.sleep(1000);
        cpd.verifyResult(exp);
    }

    @Then("verify result not as {int}")
    public void verifyNoResult(int exp)throws InterruptedException {
        Thread.sleep(1000);
        cpd.verifyNoResult(exp);
    }

}
