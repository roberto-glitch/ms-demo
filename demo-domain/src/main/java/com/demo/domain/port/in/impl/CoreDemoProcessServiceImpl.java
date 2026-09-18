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

    @Override
    public <T> T getMedian(T[] array) {
        int medianIndexElement;
        int arrayLenght = array.length;
        //Se la lunghezza dell'array è pari, allora restituisce l'elemento corrispondente alla lenght.array/2, sù
        // e invece l'array è dispari, allora è lenght.array/2+1 affinchè restitusca quello simmetrico (X)    es: | # | . | X | # | . |
        medianIndexElement = arrayLenght % 2 == 0 ? (arrayLenght / 2) -1 : (arrayLenght / 2);
        return array[medianIndexElement];
    }

}
