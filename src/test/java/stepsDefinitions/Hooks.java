package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObjects.LoginPage;

import java.io.IOException;

import static utils.Utils.*;

public class Hooks {
    /* define o before e after por valor, é possivel definir ordem de execução também, usando order.
    Before é crescente e after decrescente
    ex: @Before(value = "@login")
    ex: @Before(order = 1, value = "@login")
    ex: @Before(order = 2, value = "@outro")
    */

    @Before (value = "not @login")
    public void setUp(){
        acessarSistema();
        Na(LoginPage.class).realizarLogin("Admin", "admin123");
    }

    @Before(value = "@login")
    public void funcionalidadeLogin(){
        acessarSistema();
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        capturarTela(scenario);
        driver.quit();    //fecha o navegador
    }
}
