package io.address.validation.client.api;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.address.validation.client.ApiCallback;
import io.address.validation.client.ApiClient;
import io.address.validation.client.ApiException;
import io.address.validation.client.ApiResponse;
import io.address.validation.client.Configuration;
import io.address.validation.client.Pair;
import io.address.validation.client.ProgressRequestBody;
import io.address.validation.client.ProgressResponseBody;
import io.address.validation.client.model.VerificationRequest;
import io.address.validation.client.model.VerificationResponse200;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerificationsApi {
    private ApiClient apiClient;
    public VerificationsApi() {
        this(Configuration.getDefaultApiClient());
    }
    public VerificationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call createVerificationCall(String xApiKey, String username, String password, VerificationRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        String localVarPath = "";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call createVerificationValidateBeforeCall(String xApiKey, String username, String password, VerificationRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling createVerification(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling createVerification(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling createVerification(Async)");
        }
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createVerification(Async)");
        }
        
        okhttp3.Call call = createVerificationCall( xApiKey, username, password, body, progressListener, progressRequestListener);
        return call;
    }
    
    public VerificationResponse200 createVerification( String xApiKey, String username, String password, VerificationRequest body) throws ApiException {
        ApiResponse<VerificationResponse200> resp = createVerificationWithHttpInfo( xApiKey, username, password, body);
        return resp.getData();
    }
    
    public ApiResponse<VerificationResponse200> createVerificationWithHttpInfo(String xApiKey, String username, String password, VerificationRequest body) throws ApiException {
        okhttp3.Call call = createVerificationValidateBeforeCall( xApiKey, username, password, body, null, null);
        Type localVarReturnType = new TypeToken<VerificationResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call createVerificationAsync(String xSignature, String xApiKey, String username, String password, VerificationRequest body, String contentType, final ApiCallback<VerificationResponse200> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = createVerificationValidateBeforeCall(xApiKey, username, password, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerificationResponse200>(){}.getType();
        //apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public okhttp3.Call getVerificationByrequestIdCall( String xApiKey, String username, String password, String requestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/{requestId}".replaceAll("\\{" + "requestId" + "\\}", apiClient.escapeString(requestId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
            localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVerificationByrequestIdValidateBeforeCall(String xApiKey, String username, String password, String requestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getVerificationByrequestId(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getVerificationByrequestId(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getVerificationByrequestId(Async)");
        }
        if (requestId == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling getVerificationByrequestId(Async)");
        }
        
        okhttp3.Call call = getVerificationByrequestIdCall( xApiKey, username, password, requestId, progressListener, progressRequestListener);
        return call;
    }
    
    public VerificationResponse200 getVerificationByrequestId( String xApiKey, String username, String password, String requestId) throws ApiException {
        ApiResponse<VerificationResponse200> resp = getVerificationByrequestIdWithHttpInfo( xApiKey, username, password, requestId);
        return resp.getData();
    }
    
    public ApiResponse<VerificationResponse200> getVerificationByrequestIdWithHttpInfo( String xApiKey, String username, String password, String requestId) throws ApiException {
        okhttp3.Call call = getVerificationByrequestIdValidateBeforeCall( xApiKey, username, password, requestId, null, null);
        Type localVarReturnType = new TypeToken<VerificationResponse200>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call getVerificationByrequestIdAsync(String xSignature, String xApiKey, String username, String password, String requestId, final ApiCallback<VerificationResponse200> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getVerificationByrequestIdValidateBeforeCall(xApiKey, username, password, requestId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VerificationResponse200>(){}.getType();
        //apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    
    public okhttp3.Call verificationsOptionsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/verifications";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "OPTIONS", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call verificationsOptionsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        okhttp3.Call call = verificationsOptionsCall(progressListener, progressRequestListener);
        return call;
    }
    
    public void verificationsOptions() throws ApiException {
        verificationsOptionsWithHttpInfo();
    }
    
    public ApiResponse<Void> verificationsOptionsWithHttpInfo() throws ApiException {
        okhttp3.Call call = verificationsOptionsValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }
    
    public okhttp3.Call verificationsOptionsAsync(final ApiCallback<Void> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = verificationsOptionsValidateBeforeCall(progressListener, progressRequestListener);
        //apiClient.executeAsync(call, callback);
        return call;
    }
    
    public okhttp3.Call verificationsRequestIdOptionsCall(String requestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/verifications/{requestId}"
            .replaceAll("\\{" + "requestId" + "\\}", apiClient.escapeString(requestId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "OPTIONS", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call verificationsRequestIdOptionsValidateBeforeCall(String requestId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (requestId == null) {
            throw new ApiException("Missing the required parameter 'requestId' when calling verificationsRequestIdOptions(Async)");
        }
        
        okhttp3.Call call = verificationsRequestIdOptionsCall(requestId, progressListener, progressRequestListener);
        return call;
    }
    
    public void verificationsRequestIdOptions(String requestId) throws ApiException {
        verificationsRequestIdOptionsWithHttpInfo(requestId);
    }
    
    public ApiResponse<Void> verificationsRequestIdOptionsWithHttpInfo(String requestId) throws ApiException {
        okhttp3.Call call = verificationsRequestIdOptionsValidateBeforeCall(requestId, null, null);
        return apiClient.execute(call);
    }
    
    public okhttp3.Call verificationsRequestIdOptionsAsync(String requestId, final ApiCallback<Void> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = verificationsRequestIdOptionsValidateBeforeCall(requestId, progressListener, progressRequestListener);
        //apiClient.executeAsync(call, callback);
        return call;
    }
}
