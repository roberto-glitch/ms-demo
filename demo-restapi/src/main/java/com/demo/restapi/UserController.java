package com.demo.restapi;

import com.demo.domain.model.UserDO;
import com.demo.domain.port.in.CoreDemoProcessService;
import com.demo.restapi.model.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final CoreDemoProcessService coreDemoProcessService;

    @GetMapping("/id")
    public UserDTO getUserFromId(String id) {
        return mapper(coreDemoProcessService.coreMethod(id));
    }

    @GetMapping("/getMedian")
    public String getMedian() {
        String[] array = {"uno", "due", "tre", "quattro", "cinque"};
        return coreDemoProcessService.<String>getMedian(array);
    }

    @GetMapping("/map")
    public Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map.put("number" + i, i);
        }
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("rimuovo una chiave dalla vista keySet");
        Set<String> ciccio = map.keySet();
        ciccio.remove("number3");
        System.out.println("stampo il set dopo rimozione da keyset");
        System.out.println(ciccio);
        System.out.println("stampo la mappa dopo la rimozione");
        System.out.println(map);
        System.out.println("rimuovo elemento da value");
        Collection<Integer> vaules = map.values();
        System.out.println("stampo values");
        System.out.println(vaules);
        System.out.println("rimuovo oggetto da values");
        vaules.remove(4);
        System.out.println("stampo mappa dopo rimozione elemento da values");

        return map;
    }

    @GetMapping("/enum")
    public int semeOperation() {
        System.out.println("stampo un seme: " + Seme.CUORI);
        System.out.println("stampo l'ordinal di CUORI: " + Seme.PICCHE.ordinal());
        System.out.println("stampo l'array di elementi dalla classe enumerata Enum<Seme>: " + Arrays.toString(Seme.values()));
        for (Seme e : Seme.values()) System.out.println(e.ordinal());
        System.out.println(Seme.values()[2].equals(Seme.QUADRI));
        return 0;
    }

    private void pippo() {
        List<Number> numbers = new ArrayList<>();
        numbers.add(Float.valueOf(1.0f));
        numbers.add(Integer.valueOf(2));
        numbers.add(Double.valueOf(2.4d));

    }

    private enum Seme {
        CUORI(true, false),
        PICCHE(false, false),
        QUADRI(true, false),
        FIORI(false, true);

        private final boolean isRed;
        private final boolean isFlower;

        private Seme(boolean isRed, boolean isFlower) {
            this.isRed = isRed;
            this.isFlower = isFlower;
        }

        public boolean isRedFlower() {
            return isRed && isFlower;
        }
    }

    private UserDTO mapper(UserDO userDO) {
        return new UserDTO(userDO.getNome(), userDO.getCognome());
    }
}
