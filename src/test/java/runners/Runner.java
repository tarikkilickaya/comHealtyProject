package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",  "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@Practice",//"@gp1 or @gp2" iki tag i ayni anda calistirmak icin
        dryRun = false
)
public class Runner {
    /*
    Runner class i TestNG deki XML mantigi ile calisir
    Calistirmak istedigimiz senaryolara tag belirtiriz
    ve belirttigimiz taglari calistirir.
    XML deki gibiistedigimiz testleri calistirmak icin kullanirz
    Runner class body sini ekleyecegimiz notasyonlar aktive eder

    Bu class da kullanacagimiz iki adet notasyon vardr
    -@RunWith(Cucubber.class) notasyonu runner class ina calisma ozelligi ekler
    bu notasyon oldugu icin cucumber frameworkunda Junit kullanmayi tercih ederiz
    -@CucumberOptions notasyonu icinde
    features : Runner dosyasinin feature dosyasini nereden bulacagini tarif eder
    glue: stepDefinitions yolunu belirtiriz
    tag: Hangi tag i calistirmak istiyorsak onu belirler

    dryRun:iki secenek vardir
    dryRun=true   dersek testimizi calistirmadan eksik adimlari bize verir
    dryRun=false   testlerimizi driver ile calistirir
     */

}
