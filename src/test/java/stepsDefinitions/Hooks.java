package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static utils.Utils.*;

public class Hooks {
    /* define o before e after por valor, é possivel definir ordem de execução também, usando order.
    Before é crescente e after decrescente
    ex: @Before(value = "@login")
    ex: @Before(order = 1, value = "@login")
    ex: @Before(order = 2, value = "@outro")
    */
    @Before
    public void setUp(){
        acessarSistema();
    }

    @After
    public void tearDown(){
//        driver.quit();    //fecha o navegador
    }
}
