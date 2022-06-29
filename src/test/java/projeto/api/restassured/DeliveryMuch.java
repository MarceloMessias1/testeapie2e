package projeto.api.restassured;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeliveryMuch {
	@Test
	public void StatusCodeDezMil() {
//na linha abaixo usamos o restassured para comunicar com a api get
		Response response = RestAssured.get("http://challengeqa.staging.devmuch.io/-10000");

		// usamos o restassured para guardar o valor do status code retornado pela api
		// em uma variavel inteira
		int code = response.getStatusCode();

		// usamos o junit para validar se o retorno do status da api é igual ao retorno
		// esperado
		assertEquals(200, code);

	}

	@Test
	public void bodyMenosDezMil() {
		Response response = RestAssured.get("http://challengeqa.staging.devmuch.io/-10000");
		String bodyResponse = response.asPrettyString();
        String retornoEsperado = "menos dez mil";
        assertTrue(bodyResponse.contains(retornoEsperado));
        System.out.println(retornoEsperado);
	}

}
