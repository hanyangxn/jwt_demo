package com.hy.jwt_demo.exception;

import com.hy.jwt_demo.config.ResultDto;
import com.hy.jwt_demo.config.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.security.SignatureException;

/**
 * @author hy
 * @description:
 * @date 2020/09/07
 */
@RestControllerAdvice
public class PermissionHandler {
    @ExceptionHandler(value = { SignatureException.class })
    @ResponseBody
    public ResultDto<?> authorizationException(SignatureException e){
        return ResultUtil.error("1008",e.getMessage());
    }
    @ExceptionHandler(value = { RuntimeException.class })
    @ResponseBody
    public ResultDto<?> RuntimeException(RuntimeException e){
        return ResultUtil.error("1002",e.getMessage());
    }
}
