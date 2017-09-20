package com.unnnn.service.implement.products;

import com.alibaba.dubbo.config.annotation.Service;
import net.unnnn.instructions.RequestInstruction;
import net.unnnn.instructions.ResponseInstruction;
import net.unnnn.service.products.ProductObject;
import net.unnnn.service.products.ProductService;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by warrenn on 2017/7/25.
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
