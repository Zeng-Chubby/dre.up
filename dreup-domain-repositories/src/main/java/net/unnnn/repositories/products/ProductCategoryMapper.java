package net.unnnn.repositories.products;

import java.util.List;
import net.unnnn.products.ProductCategory;
import net.unnnn.products.ProductCategoryExample;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryMapper {
    long countByExample(ProductCategoryExample example);

    int deleteByExample(ProductCategoryExample example);

    int deleteByPrimaryKey(Long categoryid);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    List<ProductCategory> selectByExample(ProductCategoryExample example);

    ProductCategory selectByPrimaryKey(Long categoryid);

    int updateByExampleSelective(@Param("record") ProductCategory record, @Param("example") ProductCategoryExample example);

    int updateByExample(@Param("record") ProductCategory record, @Param("example") ProductCategoryExample example);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
}