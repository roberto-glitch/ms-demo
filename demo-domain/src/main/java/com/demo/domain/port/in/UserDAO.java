package com.demo.domain.port.in;

import com.demo.domain.model.UserDO;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<UserDO, String> {

    UserDO getUserDOById(String id);

}
