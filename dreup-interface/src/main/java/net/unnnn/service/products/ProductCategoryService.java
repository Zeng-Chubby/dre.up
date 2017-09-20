package net.unnnn.service.products;

import net.unnnn.instructions.RequestInstruction;
import net.unnnn.instructions.ResponseInstruction;
import net.unnnn.instructions.product.ProductCategoryObject;

import java.util.List;

/**
 * @Author:曾智
 * @Description:描述
 * @CreatedTime 2017/7/23
 */
public interface ProductCategoryService {

    /**
     * 获取商品分类集合。
     *
     * @param request 请求命令。
     * @return 响应命令。
     */
    ResponseInstruction<List<ProductCategoryObject>> GetList(RequestInstruction request);
}
