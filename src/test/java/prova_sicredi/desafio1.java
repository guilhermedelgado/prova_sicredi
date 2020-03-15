package prova_sicredi;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class desafio1 {
    @Test
    public void test_desafio1 () throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\guilh\\Documents\\chromedriver.exe");
     WebDriver navegador = new ChromeDriver();
     //1. Acesse a página https://www.grocerycrud.com/demo/bootstrap_theme
     navegador.get("https://www.grocerycrud.com/demo/bootstrap_theme");
     navegador.manage().window().maximize();
     navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     //2. Mude o valor da combo Select version para "Bootstrap V4 Theme"
     navegador.findElement(By.id("switch-version-select")).sendKeys(Keys.ARROW_DOWN);
     sleep(2000);

     //3. Clique no botão Add Customer
     navegador.findElement(By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a")).click();

     //4. Preencha os campos do formulário com as seguintes informações:
     navegador.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");
     navegador.findElement(By.id("field-contactLastName")).sendKeys("Teste");
     navegador.findElement(By.id("field-contactFirstName")).sendKeys("Guilherme");
     navegador.findElement(By.id("field-phone")).sendKeys(" 51 9999-9999");
     navegador.findElement(By.id("field-addressLine1")).sendKeys(" Av Assis Brasil, 3970");
     navegador.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
     navegador.findElement(By.id("field-city")).sendKeys("Porto Alegre");
     navegador.findElement(By.id("field-state")).sendKeys("RS");
     navegador.findElement(By.id("field-postalCode")).sendKeys(" 91000-000");
     navegador.findElement(By.id("field-country")).sendKeys("Brasil");
     navegador.findElement(By.cssSelector("#field_salesRepEmployeeNumber_chosen > a > span")).click();
     navegador.findElement(By.cssSelector("#field_salesRepEmployeeNumber_chosen > div > div > input[type=text]")).sendKeys("Fixter");
     navegador.findElement(By.cssSelector("#field_salesRepEmployeeNumber_chosen > div > div > input[type=text]")).sendKeys(Keys.ENTER);
     navegador.findElement(By.id("field-creditLimit")).sendKeys("200");

     //5. Clique no botão Save
     navegador.findElement(By.id("form-button-save")).click();
     sleep(3000);

     //6. Validar a mensagem "Your data has been successfully stored into the database." através de uma asserção
     String message = navegador.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div[14]/div[2]/p")).getText();
     assertTrue(message.contains("Your data has been successfully stored into the database."));
     sleep(1000);

     //7. Feche o browser web
     navegador.close();
    }

  @Test
  public void test_desafio2 () throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\guilh\\Documents\\chromedriver.exe");
    WebDriver navegador = new ChromeDriver();
    navegador.get("https://www.grocerycrud.com/demo/bootstrap_theme");
    navegador.manage().window().maximize();
    navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    navegador.findElement(By.id("switch-version-select")).sendKeys(Keys.ARROW_DOWN);
    sleep(2000);
    navegador.findElement(By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a")).click();
    navegador.findElement(By.id("field-customerName")).sendKeys("Teste Sicredi");
    navegador.findElement(By.id("field-contactLastName")).sendKeys("Teste");
    navegador.findElement(By.id("field-contactFirstName")).sendKeys("Guilherme");
    navegador.findElement(By.id("field-phone")).sendKeys(" 51 9999-9999");
    navegador.findElement(By.id("field-addressLine1")).sendKeys(" Av Assis Brasil, 3970");
    navegador.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
    navegador.findElement(By.id("field-city")).sendKeys("Porto Alegre");
    navegador.findElement(By.id("field-state")).sendKeys("RS");
    navegador.findElement(By.id("field-postalCode")).sendKeys(" 91000-000");
    navegador.findElement(By.id("field-country")).sendKeys("Brasil");
    navegador.findElement(By.cssSelector("#field_salesRepEmployeeNumber_chosen > a > span")).click();
    navegador.findElement(By.cssSelector("#field_salesRepEmployeeNumber_chosen > div > div > input[type=text]")).sendKeys("Fixter");
    navegador.findElement(By.cssSelector("#field_salesRepEmployeeNumber_chosen > div > div > input[type=text]")).sendKeys(Keys.ENTER);
    navegador.findElement(By.id("field-creditLimit")).sendKeys("200");
    navegador.findElement(By.id("form-button-save")).click();
    sleep(3000);
    String message = navegador.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div[14]/div[2]/p")).getText();
    assertTrue(message.contains("Your data has been successfully stored into the database."));
    sleep(1000);

    //1. Clique no link Go back to list
    navegador.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div[14]/div[2]/p/a[2]")).click();

    //2. Clique no ícone da lupa (pesquisa) e digite o conteúdo do Name (Teste Sicredi)
    navegador.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/a[3]/i")).click();
    sleep(2000);
    navegador.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/a[3]/input")).sendKeys("Teste Sicredi");
    navegador.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/a[3]/input")).sendKeys(Keys.ENTER);
    sleep(3000);

    //3. Clicar no checkbox abaixo da palavra Actions
    List<WebElement> lista = navegador.findElements(By.xpath("//input[@type='checkbox']"));
    lista.get(1).click();
    sleep(2000);

    //4. Clicar no botão Delete
    navegador.findElement(By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > thead > tr.filter-row.gc-search-row > td.no-border-left > div.floatL > a")).click();
    sleep(2000);
    String delete = navegador.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]")).getText();
    sleep(2000);

    //5. Validar o texto "Are you sure that you want to delete this 1 item?" através de uma asserção para a popup que será apresentada
    assertEquals("Are you sure that you want to delete this 1 item?",delete);
    sleep(2000);

    //6. Clicar no botão Delete da popup
    navegador.findElement(By.cssSelector("body > div.container-fluid.gc-container > div.row > div.delete-multiple-confirmation.modal.fade.in.show > div > div > div.modal-footer > button.btn.btn-danger.delete-multiple-confirmation-button")).click();
    sleep(2000);

    //7. Aparecerá uma mensagem dentro de um box verde na parte superior direito da tela. Adicione uma asserção na mensagem "Your data has been successfully deleted from the database."
    String delete2 = navegador.findElement(By.xpath("/html/body/div[3]")).getText();
    assertTrue(delete2.contains("Your data has been successfully deleted from the database"));
    sleep(1000);

    //8. Feche o driver web
    navegador.quit();
  }
}