package com.wwh.myshop.service.reg.service;

import com.wwh.myshop.commons.domain.TbUser;
import com.wwh.myshop.commons.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class RegService {

    @Autowired
    private MessageChannel output;

    @Async
    public void sendEmail(TbUser tbUser) throws Exception {
        output.send(MessageBuilder.withPayload(MapperUtils.obj2json(tbUser)).build());
    }
}
