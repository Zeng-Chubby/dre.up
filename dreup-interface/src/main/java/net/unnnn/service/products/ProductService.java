package net.unnnn.service.products;

import net.unnnn.instructions.RequestInstruction;
import net.unnnn.instructions.ResponseInstruction;

/**
 * @Author:曾智
 * @Description:描述
 * @CreatedTime 2017/7/23
 */
public interface ProductService {
    ResponseInstruction<Boolean> AddProduct(RequestInstruction<ProductObject> request);

    /**
     * 获取产品。
     *
     * @param id 产品Id。
     * @return
     */
    ResponseInstruction<ProductObject> getProduct(long id);
}
