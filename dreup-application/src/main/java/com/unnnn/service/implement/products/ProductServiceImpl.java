package com.unnnn.service.implement.products;

import com.alibaba.dubbo.config.annotation.Service;
import net.unnnn.instructions.RequestInstruction;
import net.unnnn.instructions.ResponseInstruction;
import net.unnnn.service.products.ProductObject;
import net.unnnn.service.products.ProductService;

/**
 * 产品服务。
 * @author ZengZhi
 * @date 2017/7/25
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ResponseInstruction<Boolean> AddProduct(RequestInstruction<ProductObject> request) {
        return null;
    }

    @Override
    public ResponseInstruction<ProductObject> getProduct(long id) {
        return new ResponseInstruction<ProductObject>();
    }
}
