package com.demo.domain.port.in.impl;

import com.demo.domain.model.UserDO;
import com.demo.domain.port.in.CoreDemoProcessService;
import com.demo.domain.port.out.DatabaseService;
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
