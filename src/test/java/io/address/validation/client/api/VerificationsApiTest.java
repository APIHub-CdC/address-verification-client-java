package io.address.validation.client.api;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import io.address.validation.client.ApiClient;
import io.address.validation.client.model.Address;
import io.address.validation.client.model.Holder;
import io.address.validation.client.model.State;
import io.address.validation.client.model.VerificationRequest;
import io.address.validation.client.model.VerificationResponse200;
import okhttp3.OkHttpClient;

public class VerificationsApiTest {
	
    private final VerificationsApi api = new VerificationsApi();
    
    private Logger logger = LoggerFactory.getLogger(VerificationsApiTest.class.getName());
    
    private String keystoreFile = "/your_path_for_your_keystore/keystore.jks";
    private String cdcCertFile = "/your_path_for_your_keystore/cdc_cert.pem";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyAlias = "your_key_alias";
    private String keyPassword = "your_super_secure_password";
    
    private String username = "your_username_otorgante";
    private String password = "your_password_otorgante";
    
    private String url = "the_url";
    private String xApiKey = "your_x_Api_Key";
    
    @Before()
    public void setUp() {
    	 
    	ApiClient apiClient = api.getApiClient();
        apiClient.setBasePath(url);
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword)).build();
		apiClient.setHttpClient(okHttpClient);
			
    }
    
    @Test
    public void createVerificationTest() throws Exception {
        
        VerificationRequest objVerificationRequest = new VerificationRequest();
        Holder objHolder = new Holder();
        Address objAddress = new Address();
        
        objHolder.setName("");
        objHolder.setSecondName("");
        objHolder.setLastName("");
        objHolder.setSecondLastName("");
        
        objAddress.setStreetAddress("");
        objAddress.setSettlement("");
        objAddress.setCity("");
        objAddress.setState("");
        objAddress.setZipCode("");
        
        objVerificationRequest.setRequestId(UUID.fromString(""));
        objVerificationRequest.setSubscriptionId(UUID.fromString(""));
        objVerificationRequest.setServiceCode("");
        objVerificationRequest.setContractNumber("");
        objVerificationRequest.setAcceptanceDate("");
        objVerificationRequest.setAcceptance("");
        objVerificationRequest.setHolder(objHolder);
        objVerificationRequest.setAddress(objAddress);
        
        String contentType = null;
        VerificationResponse200 response = api.createVerification(xApiKey, username, password, objVerificationRequest);
        logger.info(response.toString());
    } 
    
    @Test
    public void getVerificationByrequestIdTest() throws Exception {
        
        String requestId = "";
        VerificationResponse200 response = api.getVerificationByrequestId(xApiKey, username, password, requestId);
        logger.info(response.toString());
    }
    
    
    
}
