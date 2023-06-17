package wso2.apim.devportal.Middleware_WSO2_API_Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

@SpringBootApplication
@EnableFeignClients
public class MiddlewareWso2ApiManagerApplication {

	//@Autowired
	//private static RestTemplate restTemplate;

	private static void ignoreCertificates() {
		TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
			@Override
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			@Override
			public void checkClientTrusted(X509Certificate[] certs, String authType) {
			}

			@Override
			public void checkServerTrusted(X509Certificate[] certs, String authType) {
			}
		}};

		try {
			SSLContext sc = SSLContext.getInstance("TLS");
			sc.init(null, trustAllCerts, new SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (Exception e) {


		}
	}

	public static void main(String[] args) {

		ignoreCertificates();
		SpringApplication.run(MiddlewareWso2ApiManagerApplication.class, args);

		/*HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		});*/

		ignoreCertificates();
		RestTemplate restTemplate = new RestTemplate();
		String apiUrl = "https://localhost:9443/api/am/devportal/v2/apis"; // Remplacez l'URL par l'URL réelle de l'API

		ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

		if (response.getStatusCode().is2xxSuccessful()) {
			String responseBody = response.getBody();
			System.out.println(responseBody);
			// Vous pouvez traiter la réponse JSON ici
		} else {
			System.err.println("Erreur lors de l'appel à l'API. Code de statut : " + response.getStatusCode());
		}
	}

}
