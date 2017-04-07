package com.vcredit.restructure.repository;

import com.vcredit.restructure.entity.Mobile;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dell on 2017/4/6.
 */
public interface MobileRepository extends CrudRepository<Mobile,Integer> {

    Mobile findByMobileId(Integer mobileId);

}
