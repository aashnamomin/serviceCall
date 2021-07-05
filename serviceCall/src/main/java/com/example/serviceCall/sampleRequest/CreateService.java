/*
 * package com.example.serviceCall.sampleRequest;
 * 
 * import java.lang.reflect.ParameterizedType;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpEntity; import
 * org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.stereotype.Service; import
 * org.springframework.web.client.RestTemplate;
 * 
 * @Service public class CreateService {
 * 
 * @Autowired private RestTemplate restTemplate;
 * 
 * private <T, A, P> void CreateTransaction(Request<T, A, P> requestParam) {
 * String baseUrl = "http://localhost:8080/add/employee"; HttpHeaders
 * requestHeaders = new HttpHeaders();
 * 
 * requestHeaders.set("Content-Type", "application/xml"); Request<T, A, P>
 * request = requestParam; HttpEntity<Request<T, A, P>> entity = new
 * HttpEntity<>(requestParam, requestHeaders);
 * 
 * ResponseEntity<String> responseEntity = restTemplate.exchange(baseUrl,
 * HttpMethod.POST, entity, String.class);
 * 
 * String response = responseEntity.getBody(); }
 * 
 * public <T, A, P, R> void callCreateTransaction(R request, Class<R> clazz) {
 * 
 * Class<R> persistentClass = (Class<R>)
 * ((ParameterizedType)getClass().getGenericSuperclass())
 * .getActualTypeArguments()[0];
 * 
 * Request<T, A, P> traxRequest = new Request<T, A, P>();
 * traxRequest.setTransactionId(persistentClass.);
 * 
 * 
 * 
 * 
 * }
 * 
 * public static Object runGetter(Field field, BaseValidationObject o) { Field
 * field = object.getClass().getDeclaredField(fieldName);
 * field.setAccessible(true); Object value = field.get(object);
 * 
 * }
 * 
 * 
 * }
 */