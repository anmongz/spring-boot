package com.am.springboot.service;

import com.am.springboot.model.PropDataBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class PropertyDataService {

    private static final Logger log = LoggerFactory.getLogger(PropertyDataService.class);
    private static Map<String, PropDataBean> DB=new HashMap<>();

    public PropertyDataService(Map<String, PropDataBean> DB) {
        this.DB = DB;
        DB.put("owner_name", new PropDataBean("owner_name", "dmadmin1",false));
    }

    public Map<String, PropDataBean> getAllData()
    {
        return DB;
    }

    public void addToList(PropDataBean propDataBean) {
        DB.put(propDataBean.getProp(), propDataBean);
    }
}