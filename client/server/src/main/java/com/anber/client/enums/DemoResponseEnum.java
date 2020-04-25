package com.anber.client.enums;


import lombok.Getter;

/**
 * @author anber
 */

@Getter
public enum  DemoResponseEnum {
    SUCCESS(0, "成功"),
    ERROR(1, "失败"),
    EXCEPTION(500, "异常"),
    ;
    private Integer code;

    private String message;

    DemoResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
