package stepsDefinitions;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.TelaInicialPage;
import static org.junit.Assert.assertEquals;

import static utils.Utils.*;

public class TestandoActionsSteps {

    //Passo a passo, com ações separadas
    @Quando("mover o mouse para aba PIM")
    public void moverOMouseParaAbaPIM() {
        Na(TelaInicialPage.class).moverMouseParaAbaPim();
    }
    @Quando("mover o mouse para a menu configuration")
    public void moverOMouseParaAMenuConfiguration() {
        Na(TelaInicialPage.class).moverMouseParaMenuConfiguration();
    }
    @Quando("mover o mouse para o menu custom field")
    public void moverOMouseParaOMenuCustomField() {
        Na(TelaInicialPage.class).moverMouseParaMenuField();
    }


    //Ações mais unificadas e com validação
    @Quando("acionar o submenu customField")
    public void acionarOSubmenuCustomField() {
        Na(TelaInicialPage.class).acessarMenuCustomField();
    }

    @Então("sistema apresenta a tela customField")
    public void sistemaApresentaATelaCustomField() {
        assertEquals("Defined Custom Fields", driver.findElement(By.xpath("//*[@id=\"customFieldListPane\"]/div[1]/h1")).getText());
    }
}
