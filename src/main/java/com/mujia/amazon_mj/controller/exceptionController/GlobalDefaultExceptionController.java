package com.mujia.amazon_mj.controller.exceptionController;

import com.mujia.amazon_mj.util.responseMsg.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalDefaultExceptionController {
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    /**
     * @param req
     * @param ex
     * @return ApiResult
     * @throws @Title: defaultErrorHandler @Description: 统一处理某一类异常，从而能够减少代码重复率和复杂度
     */
    //	@ExceptionHandler(value = ExceptionResult.class)//指定具体要处理的异常
    @ExceptionHandler // 处理所有异常
    @ResponseBody
    public Msg defaultErrorHandler(HttpServletRequest req, RuntimeException ex) {
        // 打印异常信息：
        ex.printStackTrace();
        logger.error("捕获全局异常==" + ex);
        return Msg.systemError();
    }

    /**
     * 捕获类内所有的异常
     *
     * @param ex
     * @return
     */
    //	@ExceptionHandler(value = Exception.class)
    //	public ModelAndView exceptionHandelByThymeleaf(Exception ex, HttpServletRequest req) {
    //		ModelAndView mav = new ModelAndView();
    //		mav.setViewName("error");
    //		mav.addObject("exception", ex.getMessage());
    //		mav.addObject("url", req.getRequestURL());
    //		return mav;
    //	}

}
