package com.demo.restapi;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserController userController;

    @Test
    public void test(){
        System.out.println(2);
    }

}
