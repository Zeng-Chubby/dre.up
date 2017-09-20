package com.unnnn.webapi.products;

import com.alibaba.dubbo.config.annotation.Reference;
import com.unnnn.webapi.ApiController;
import net.unnnn.instructions.ResponseInstruction;
import net.unnnn.instructions.RequestInstruction;
import net.unnnn.instructions.product.ProductCategoryObject;
import net.unnnn.service.products.ProductCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/wechat/Goods")
public class ProductCategoryController extends ApiController {

    @Reference(check = false)
    public ProductCategoryService productCategoryService;

    @RequestMapping(method = RequestMethod.GET)
    public void Get() throws Exception {
        throw new Exception("测试统一异常捕获。");
    }

    @RequestMapping(value = "/Category", method = RequestMethod.POST)
    public ResponseInstruction<List<ProductCategoryObject>> List(RequestInstruction request) {
        return productCategoryService.GetList(request);
    }
}
