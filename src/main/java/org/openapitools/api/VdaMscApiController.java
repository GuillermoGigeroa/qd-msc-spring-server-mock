package org.openapitools.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/vda-msc")
public class VdaMscApiController implements VdaMscApi {

	private static final String FOLDER = "vda-msc/";
	private static final String FORMAT = ".json";
	private static final String ERROR_RESPONSE_DEFAULT = "Internal error";
    private final NativeWebRequest request;

    @Autowired
    public VdaMscApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    @GetMapping(value = "/1.0/{action}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getMock(@PathVariable("action") String action) {
    	return mock(action);
    }
    
    @PostMapping(value = "/1.0/{action}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> postMock(@PathVariable("action") String action) {
    	return mock(action);
    }
    
    private ResponseEntity<String> mock(String action) {
    	return buildMock(FOLDER + action + FORMAT, 200, new HttpHeaders());
    }
    
    private ResponseEntity<String> buildMock(String filepath, int httpStatus, HttpHeaders headers) {
        try {
            Resource resource = new ClassPathResource(filepath);
            String json = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
            return ResponseEntity.status(httpStatus).headers(headers).body(json);
        } catch (IOException e) {
            return ResponseEntity.status(500).body(ERROR_RESPONSE_DEFAULT);
        }
    }

}
