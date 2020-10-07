package com.chacha.exception.exception;

import com.chacha.exception.constant.Status;
import lombok.Getter;

/**
 * <p>
 *      JSON异常
 * </p>
 *
 * @package: com.chacha.handler.exception
 * @description: JSON异常
 * @author chacha
 */
@Getter
public class JsonException extends BaseException {

    public JsonException(Status status) {
        super(status);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }
}
