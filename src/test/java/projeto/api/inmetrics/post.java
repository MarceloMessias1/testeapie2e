package projeto.api.inmetrics;

import static org.junit.Assert.assertEquals;

import java.net.Authenticator.RequestorType;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.runner.Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class post {

	@Test
	public void statusCodeCadastroEmpregado() {

		RequestSpecification request = RestAssured.given().auth().preemptive().basic("inmetrics", "automacao");
		request.header("Content-Type", "application/json");
		JSONObject json = new JSONObject();
		json.put("admissao", "01/12/2018");
		json.put("cargo", "especialista de teste");
		json.put("comissao", "12.000,00");
		json.put("cpf", "107.225.410-74");
		json.put("departamentoId", "1");
		json.put("nome", "Nome de Teste");
		json.put("salario", "35.000,00");
		json.put("sexo", "m");
		json.put("tipoContratacao", "clt");

		request.body(json.toJSONString());
		Response response = request.post("https://inm-test-api.herokuapp.com/empregado/cadastrar");
		assertEquals(202, response.getStatusCode());
		System.out.println("response com asPrettyString "+ response.asPrettyString());
		System.out.println("response com asString " + response.asString());

	}

}
