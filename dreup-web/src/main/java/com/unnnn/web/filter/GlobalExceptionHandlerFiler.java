package com.unnnn.web.filter;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import net.unnnn.instructions.RequestExceptionParamter;
import net.unnnn.service.CommonService;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;

/**
 * 统一异常处理过滤器。
 *
 * @author ZengZhi
 */
@ControllerAdvice
public class GlobalExceptionHandlerFiler {

    @Reference
    private CommonService commonService;

    public GlobalExceptionHandlerFiler(CommonService commonService) {
        this.commonService = commonService;
    }


    @ExceptionHandler
    public Response defaultExceptionHandler(HttpServletRequest httpServletRequest, Exception exception) {
        // 序列化请求参数和异常信息。
        String requestJsonStr = JSON.toJSONString(httpServletRequest);
        String requestExceptionJsonStr = JSON.toJSONString(exception);

        // 保存请求信息和出现的异常信息。
        RequestExceptionParamter params = new RequestExceptionParamter();
        params.setException(requestExceptionJsonStr);
        params.setRequest(requestJsonStr);

        // 写入服务。
        Response response = commonService.writeRequestException(params);

        return response;
    }
}
