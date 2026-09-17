package com.demo.domain.port.out;

import com.demo.domain.model.UserDO;

public interface DatabaseService {

    UserDO getUserById(String id);

}
