package com.wll.demo.DTF;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;
import com.wll.demo.DTF.Product;
/**
 * 把读取的数据进行处理
 */
@Component("DTF_productProcessor")
public class ProductItemProcessor implements ItemProcessor<Product, Product> {

    @Override
    public Product process(Product product) throws Exception {
        product.setId(product.getId() + 1);
        product.setName(product.getName()+"w");
        System.out.println("=====处理完成::" + product.toString());
        return product;
    }
}
