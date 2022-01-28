package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//caminho das features
		features = "src/test/resources/features",
		//packege dos steps
		glue = "testes",
		// tags que deseja executar
		tags = "@positivo",
		
		
		//validar se existem gherkins sem steps
		dryRun = false,
		//formataçao do console para aparecer igual ao cucumber
		plugin = {"pretty","html:target/report.html"},
		//tirar os caracteres especiais do console
		monochrome = true
		
				
		
		
		)


public class Executa {

}
