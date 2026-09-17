package com.demo.restapi;

import com.demo.domain.model.UserDO;
import com.demo.domain.port.in.CoreDemoProcessService;
import com.demo.restapi.model.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final CoreDemoProcessService coreDemoProcessService;

    @GetMapping("/id")
    public UserDTO getUserFromId(String id) {
        return mapper(coreDemoProcessService.coreMethod(id));
    }

    private UserDTO mapper(UserDO userDO) {
        return new UserDTO(userDO.getNome(), userDO.getCognome());
    }
}
