package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static utils.Utils.*;

public class TelaInicialPage extends BasePage{
    Actions acao = new Actions(driver);

    public void adicionarAbaAdmin(){
        abaAdmin.click();
    }

    //Elementos
    @FindBy(name = "btnAdd")
    public WebElement botaoAdd;

    public void acionarBotaoAdd(){
        botaoAdd.click();
    }

    public void moverMouseParaAbaPim(){
        acao.moveToElement(abaPim).build().perform();
    }

    public void moverMouseParaMenuConfiguration(){
        acao.moveToElement(menuConfiguration).build().perform();
    }

    public void moverMouseParaMenuField(){
        acao.moveToElement(menuField).build().perform();
    }

    public void acessarMenuCustomField(){
        //Podendo ser instanciado localmente, se for usar somente essa opção, deixei separado para ficar os 2 cenários
        //Actions acao = new Actions(driver);
        acao.moveToElement(abaPim).build().perform();
        acao.moveToElement(menuConfiguration).build().perform();
        acao.moveToElement(menuField).click().perform(); //alteração com click
    }
}
