package com.vcredit.restructure.service;

import com.vcredit.framework.annotation.Log;
import com.vcredit.restructure.entity.Mobile;
import com.vcredit.restructure.repository.MobileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by dell on 2017/4/6.
 */
@Service
@Transactional
public class MobileService {

    private static Logger log= LoggerFactory.getLogger(MobileService.class);

    @Resource
    MobileRepository mobileRepository;


    @Log
    public Mobile getMobile(Integer id)throws Exception{
        Mobile mobile=  mobileRepository.findByMobileId(id);
       return  mobile;
       // throw new RuntimeException("id错误");
    }
}
