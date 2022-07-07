package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import pages.ApiGet;

public class ApiGetTest {

	ApiGet apiget = new ApiGet();

	@Dado("que eu acesse api get para consultar")
	public void que_eu_acesse_api_get_para_consultar() {
		apiget.acessarApi("https://reqres.in/api/users/2");
	}

	@Entao("valido o status code de retorno")
	public void valido_o_status_code_de_retorno() {
		apiget.statusCode(201);
	}

	@Entao("valido o email {string}")
	public void valido_o_email(String texto) {
		apiget.body("janet.weaver@reqres.in");
	}

}
