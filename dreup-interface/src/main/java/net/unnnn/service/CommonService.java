package net.unnnn.service;

import net.unnnn.instructions.RequestExceptionParamter;

import javax.xml.ws.Response;

/**
 * 系统通用服务。
 *
 * @author
 * @createdTime 2018-01-17 12:40
 **/
public interface CommonService {

    /**
     * 写入请求过程中出现的错误信息。
     *
     * @param request 请求对象。
     * @return 响应对象。
     */
    Response writeRequestException(RequestExceptionParamter request);
}
