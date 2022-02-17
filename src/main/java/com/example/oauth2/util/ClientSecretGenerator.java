package com.example.oauth2.util;

import java.util.Base64;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

public class ClientSecretGenerator {

	/**
	 * encode clientId,clientSecret
	 * clientId:clientSecret
	 */
	public static String base64EncodeAuthrizationBasicHeader(final String clientId, final String clientSecret) {
		final String pattern = String.format("%s:%s", clientId, clientSecret);
		return Base64.getUrlEncoder().encodeToString(pattern.getBytes());
	}

	/**
	 * oauth_client_details > client_secret
	 */
	public static String encryptClientSecret(final String clientSecret) {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(clientSecret);
	}
}
