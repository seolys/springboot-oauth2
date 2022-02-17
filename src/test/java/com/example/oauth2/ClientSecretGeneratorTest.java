package com.example.oauth2;

import com.example.oauth2.util.ClientSecretGenerator;
import org.junit.Test;

public class ClientSecretGeneratorTest {

	private final String clientId = "client";
	private final String clientSecret = "seolyeonsu";

	@Test
	public void generateAuthrizationBasicHeader() {
		final String token = ClientSecretGenerator.base64EncodeAuthrizationBasicHeader(clientId, clientSecret);
		System.out.println("Authorization: Basic " + token);
	}

	@Test
	public void generateClientSecret() {
		final String encryptClientSecret = ClientSecretGenerator.encryptClientSecret(clientSecret);
		System.out.println(encryptClientSecret);
	}

}
