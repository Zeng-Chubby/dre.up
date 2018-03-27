package com.unnnn.web.controller;

import com.unnnn.web.AbstractApiController;
import net.unnnn.instructions.ResponseInstruction;
import net.unnnn.service.products.ProductObject;
import net.unnnn.service.products.ProductService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZengZhi
 */

@RequestMapping(value = "/user")
public class UserController extends AbstractApiController {

    @Reference(check = false)
    public ProductService productService;

    @RequestMapping(value = "/{orderId}", method = {RequestMethod.GET})
    public ResponseInstruction<ProductObject> Get(@PathVariable long orderId) {
        ResponseInstruction<ProductObject> response = productService.getProduct(orderId);
        return response;
    }

    @RequestMapping(method = {RequestMethod.POST})
    public ResponseInstruction Post() {
        return null;
    }
}
