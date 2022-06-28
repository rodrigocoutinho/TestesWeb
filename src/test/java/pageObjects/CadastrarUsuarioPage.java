package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {
    @FindBy(id = "systemUser_employeeName_empName")
    public WebElement campoEmployer;

    @FindBy(name = "systemUser[userName]")
    public WebElement campoUsername;

    @FindBy(name = "systemUser[password]")
    public WebElement campoPassword;

    @FindBy(name = "systemUser[confirmPassword]")
    public WebElement campoConfirmarPassword;

    @FindBy(name = "btnSave")
    public WebElement salvar;

    public void informarCampoEmployerName(String employerName){
        campoEmployer.sendKeys(employerName);

    }
    public void informarCampoUserName(String userName){
        campoUsername.sendKeys(userName);

    }
    public void informarCampoPassword(String password){
        campoPassword.sendKeys(password);

    }
    public void informarCampoConfirmarPassword(String confirmarPassword){
        campoConfirmarPassword.sendKeys(confirmarPassword);

    }
    public void acionarBotaoSalvar(){
        salvar.click();
    }
}
