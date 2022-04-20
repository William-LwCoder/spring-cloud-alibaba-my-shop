package com.wwh.myshop.commons.service.impl;

import com.wwh.myshop.commons.domain.TbUser;
import com.wwh.myshop.commons.mapper.TbUserMapper;
import com.wwh.myshop.commons.service.TbUserService;
import org.springframework.stereotype.Service;

@Service
public class TbUserServiceImpl extends BaseCrudServiceImpl<TbUser, TbUserMapper> implements TbUserService {
}
