package com.demo.domain.service.impl;

import com.demo.domain.model.UserDO;
import com.demo.domain.service.CoreDemoProcessService;
import com.demo.domain.outboundPort.DatabaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoreDemoProcessServiceImpl implements CoreDemoProcessService {

    private final DatabaseService databaseService;

    @Override
    public UserDO coreMethod(String userId) {
        return databaseService.getUserById(userId);
    }
}
