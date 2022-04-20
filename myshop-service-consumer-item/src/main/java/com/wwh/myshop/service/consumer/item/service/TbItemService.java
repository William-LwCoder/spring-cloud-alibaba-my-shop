package com.wwh.myshop.service.consumer.item.service;

import com.wwh.myshop.commons.domain.TbItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "myshop-service-provider-item")
public interface TbItemService {

    @PostMapping(value = "/item/page/{pageNum}/{pageSize}")
    String page(TbItem tbItem, @PathVariable(name = "pageNum") int pageNum, @PathVariable(name = "pageSize") int pageSize);
}
