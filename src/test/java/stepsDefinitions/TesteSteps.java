package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static utils.Utils.*;

public class TesteSteps {
    @Dado("que eu estou acessando o sistema")
    public void que_eu_estou_acessando_o_sistema() {
        acessarSistema();
    }

    @Quando("eu informar usuario")
    public void euInformarUsuario() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Quando("informar a senha")
    public void informarASenha() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("o sistema apresenta o usuario logado")
    public void oSistemaApresentaOUsuarioLogado() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
