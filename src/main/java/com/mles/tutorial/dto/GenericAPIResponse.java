package com.mles.tutorial.dto;

import jakarta.websocket.OnClose;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GenericAPIResponse {

    private String message;
    private String status;
    private Object payload;

}
