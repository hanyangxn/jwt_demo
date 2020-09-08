package com.hy.jwt_demo.config;

public class ResultUtil {

	public static <T> ResultDto<T> success(T obj, String msgCd, String msg){
        return new ResultDto<T>(msgCd, msg, obj);
    }
    /**
     * add by xlqi
     * 用于异常返回
     * */
    public static <T> ResultDto error(String code, String exceptionMsg) {
        return new ResultDto<T>(code, exceptionMsg, null);
    }
}
