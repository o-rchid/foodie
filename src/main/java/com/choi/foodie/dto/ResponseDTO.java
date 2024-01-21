package com.choi.foodie.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {
    private String resultCode;
    private Object res;
}
