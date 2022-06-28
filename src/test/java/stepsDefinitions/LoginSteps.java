package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

public class LoginSteps {

    //LoginPage lp = new LoginPage();
    @Quando("eu informar o usuario {string}")
    public void euInformarOUsuario(String usuario) {
        //lp.informarCampoUsuario(usuario);
        Na(LoginPage.class).informarCampoUsuario(usuario);
    }
    @Quando("informar a senha {string}")
    public void informarASenha(String senha) {
        //lp.informarCampoSenha(senha);
        Na(LoginPage.class).informarCampoSenha(senha);
    }
    @Quando("clicar no botao login")
    public void clicarNoBotaoLogin() {
        //lp.acionarBotaoLogin();
        Na(LoginPage.class).acionarBotaoLogin();
    }
    @Entao("o sistema exibe a mensagem usuario invalido")
    public void oSistemaExibeAMensagemUsuarioInvalido() {
        assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
    }

    @Entao("o sistema exibe o usuario logado")
    public void oSistemaExibeOUsuarioLogado() {
        assertEquals("Welcome Paul", driver.findElement(By.id("welcome")).getText());
    }
}
