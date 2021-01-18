package com.bobcfc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommonResult implements Serializable {
    private int code;
    private String message;
    private Object data;

    public CommonResult(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
