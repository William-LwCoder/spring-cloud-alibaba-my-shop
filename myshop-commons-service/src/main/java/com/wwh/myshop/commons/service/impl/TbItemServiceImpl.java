package com.wwh.myshop.commons.service.impl;

import com.wwh.myshop.commons.domain.TbItem;
import com.wwh.myshop.commons.mapper.TbItemMapper;
import com.wwh.myshop.commons.service.TbItemService;
import org.springframework.stereotype.Service;

@Service
public class TbItemServiceImpl extends BaseCrudServiceImpl<TbItem, TbItemMapper> implements TbItemService {

}
