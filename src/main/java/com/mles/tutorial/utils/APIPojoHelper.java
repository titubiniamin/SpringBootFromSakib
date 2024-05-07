package com.mles.tutorial.utils;

import com.mles.tutorial.dto.GenericAPIResponse;
import org.springframework.stereotype.Component;

@Component
public class APIPojoHelper {

    public static GenericAPIResponse makeSuccessResponse(Object data) {
        GenericAPIResponse genericAPIResponse = new GenericAPIResponse();
        genericAPIResponse.setPayload(data);
        genericAPIResponse.setStatus("ok");
        genericAPIResponse.setMessage("success");
        return genericAPIResponse;
    }

}
