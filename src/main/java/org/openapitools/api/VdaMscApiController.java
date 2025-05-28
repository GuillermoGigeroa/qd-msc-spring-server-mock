package org.openapitools.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("${openapi.vdaFull.base-path:}")
public class VdaMscApiController implements VdaMscApi {

    private final NativeWebRequest request;

    @Autowired
    public VdaMscApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
