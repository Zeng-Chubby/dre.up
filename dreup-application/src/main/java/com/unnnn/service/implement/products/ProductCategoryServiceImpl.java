package com.unnnn.service.implement.products;

import com.alibaba.dubbo.config.annotation.Service;
import com.unnnn.queue.MessageQueueSender;
import com.unnnn.queue.RabbitExchangeType;
import com.unnnn.queue.RabbitQueueMessage;
import net.unnnn.instructions.RequestInstruction;
import net.unnnn.instructions.ResponseInstruction;
import net.unnnn.instructions.product.ProductCategoryObject;
import net.unnnn.products.ProductCategory;
import net.unnnn.products.ProductCategoryExample;
import net.unnnn.repositories.products.ProductCategoryMapper;
import net.unnnn.service.products.ProductCategoryService;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    public ProductCategoryMapper productCategoryMapper;

    @Autowired
    private RabbitTemplate template;

    /*@Qualifier("nameB")
    @Autowired
    private Queue queue;*/

    @Autowired
    private MessageQueueSender messageQueueSender;

    @Override
    public ResponseInstruction<List<ProductCategoryObject>> GetList(RequestInstruction request) {

        // 响应命令。
        ResponseInstruction<List<ProductCategoryObject>> response = new ResponseInstruction<List<ProductCategoryObject>>();
        RabbitQueueMessage message = new RabbitQueueMessage();
        message.setExchange(RabbitExchangeType.Fanout);
        message.setMessage("Hello");
        message.setRoutingKey("quesadadasda");
        messageQueueSender.send(message);

        ProductCategoryExample temp = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = temp.createCriteria();
        criteria.andIsdeletedEqualTo((byte) 0);

        ArrayList arrayList = new ArrayList<ProductCategoryObject>();
        for (ProductCategory item : productCategoryMapper.selectByExample(temp)) {
            ProductCategoryObject productCategoryObject = new ProductCategoryObject();
            productCategoryObject.setCategoryid(item.getCategoryid());
            productCategoryObject.setSortorder(item.getSortorder());
            productCategoryObject.setIsleaf(item.getIsleaf());
            productCategoryObject.setIconurl(item.getIconurl());
            productCategoryObject.setDescription(item.getDescription());
            productCategoryObject.setName(item.getName());
            productCategoryObject.setCreatedtime(item.getCreatedtime());
            arrayList.add(productCategoryObject);
        }

        response.setContent(arrayList);

        return response;
    }
}
