package com.chacha.exception.constant;

import lombok.Getter;

/**
 * <p>
 *      状态码封装
 * </p>
 *
 * @package: com.chacha.exception.constant
 * @description: 状态码封装
 * @author chacha
 */
@Getter
public enum Status {
    /**
     * 操作成功
     */
    OK(200, "操作成功!"),

    /**
     * 404未找到
     */
    NOT_FOUND(404, "未找到!"),

    /**
     * 未知异常
     */
    UNKNOWN_ERROR(500, "服务器出错啦!");

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 内容
     */
    private String message;

    Status(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
