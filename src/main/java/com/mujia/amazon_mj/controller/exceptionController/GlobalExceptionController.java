package com.mujia.amazon_mj.controller.exceptionController;

import com.mujia.amazon_mj.util.responseMsg.Msg;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionController extends ResponseEntityExceptionHandler {
    /** 在controller里面内容执行之前，校验一些参数不匹配啊，Get post方法不对啊之类的 */
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(
            Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return new ResponseEntity<Object>(Msg.methodError(), status);
    }
}
