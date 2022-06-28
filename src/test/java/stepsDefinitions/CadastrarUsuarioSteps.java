package stepsDefinitions;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

public class CadastrarUsuarioSteps {

    @Quando("eu acionar a aba admin")
    public void euAcionarAAbaAdmin() {
        Na(TelaInicialPage.class).adicionarAbaAdmin();
    }
    @Quando("acionar botao add")
    public void acionarBotaoAdd() {
        Na(TelaInicialPage.class).acionarBotaoAdd();
    }
    @Quando("informar no campo employer name {string}")
    public void informarNoCampoEmployerName(String employerName) {
        Na(CadastrarUsuarioPage.class).informarCampoEmployerName(employerName);
    }
    @Quando("informar no campo username {string}")
    public void informarNoCampoUsername(String username) {
        Na(CadastrarUsuarioPage.class).informarCampoUserName(username);
    }
    @Quando("informar no campo password {string}")
    public void informarNoCampoPassword(String password) {
        Na(CadastrarUsuarioPage.class).informarCampoPassword(password);
    }
    @Quando("informar no campo confirmar password {string}")
    public void informarNoCampoConfirmarPassword(String confirmarPassword) {
        Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(confirmarPassword);
    }
    @E("acionar o botao salvar")
    public void acionarOBotaoSalvar() {
        Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
    }

    @Entao("o sistema cadastra o usuario {string}")
    public void oSistemaCadastraOUsuario(String usuario) {
        assertTrue(driver.findElement(By.xpath("//a[text()='" +usuario+ "']")).isDisplayed());
    }
}
