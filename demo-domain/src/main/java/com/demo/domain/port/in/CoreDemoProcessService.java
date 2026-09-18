package com.demo.domain.port.in;

import com.demo.domain.model.UserDO;

public interface CoreDemoProcessService {

    UserDO coreMethod(String userId);

    <T> T getMedian(T[] array);

}
