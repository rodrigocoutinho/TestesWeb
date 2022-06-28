package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage{

    public void adicionarAbaAdmin(){
        abaAdmin.click();
    }

    //Elementos
    @FindBy(name = "btnAdd")
    public WebElement botaoAdd;

    public void acionarBotaoAdd(){
        botaoAdd.click();
    }
}
