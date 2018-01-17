package com.unnnn.webapi;

import com.unnnn.webapi.ApiController;
import net.unnnn.instructions.ResponseInstruction;
import net.unnnn.service.products.ProductObject;
import net.unnnn.service.products.ProductService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZengZhi
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/user")
public class UserController extends ApiController {

    @Reference(check = false)
    public ProductService productService;

    @RequestMapping(value = "/{orderId}", method = {RequestMethod.POST, RequestMethod.GET})
    public ResponseInstruction<ProductObject> Get(@PathVariable long orderId) {
        ResponseInstruction<ProductObject> response = productService.getProduct(orderId);

        return response;
    }
}
