package com.mmtap.cma.demo.service.test.impl;

import com.mmtap.cma.demo.dao.test.TestDao;
import com.mmtap.cma.demo.saas.tenant.DataSourceBasedMultiTenantConnectionProviderImpl;
import com.mmtap.cma.demo.service.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public Object testDb() {
        return testDao.findAll();
    }
}
