package com.demo.restapi;

import com.demo.domain.service.CoreDemoProcessService;
import com.demo.domain.service.DatabaseService;
import lombok.RequiredArgsConstructor;
import com.demo.domain.model.UserDO;
import com.demo.domain.model.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserControllerServiceImpl {

    @Autowired
    private DatabaseService databaseService;
    @Autowired
    private CoreDemoProcessService coreDemoProcessService;

    @GetMapping("/id")
    public UserDTO getUserFromId(String id) {
        UserDO userDO = databaseService.getUserById(id);
        return new UserDTO(userDO.getNome(), userDO.getCognome() + " " + coreDemoProcessService.coreMethod());
    }
}
