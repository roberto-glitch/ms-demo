package com.demo.mongo.service.impl;

import com.demo.domain.model.UserDO;
import com.demo.domain.outboundPort.DatabaseService;
import org.springframework.stereotype.Service;

@Service
public class MongoDbServiceImpl implements DatabaseService {

    @Override
    public UserDO getUserById(String id) {
        return new UserDO("userId", "Pippo", "Franco");
    }

    //TODO: CERCARE DI CAPIRE COSA INSERIRE DOVE, PERCHè SI è VERO CHE LE PORTS VANNO IN DOMAIN MA NON TUTTE, CI SONO PORTS
    // CHE SI TROVANO SOLO ALL'INTERNO DI ALCUNI ADAPTER SPECIFICI COME QUELLI DI MONGO PER ESEMPIO, TUTTO QUESTO PERCHè NON SERVONO
    // DA ALTRE PARTI, MA ALLORA IN DOMAIN CI VANNO SOLO LE PORTS CHE SAPPIAMO DOVER INIETTARE IN TANTI POSTI DIVERSI?
    // SE UN INTERFACCIA SERVE SOLO IN MONGODB ADAPTER, QUESTA NON DEVE ANDARE IN DOMAIN, GIUSTO?

}
