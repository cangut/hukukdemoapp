package tr.com.can.hukukmicroserviceicra.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.can.hukukmicroserviceicra.dto.IcraDTO;
import tr.com.can.hukukmicroserviceicra.entity.Icra;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("v1/icra")
public class IcraRestController {

    @Value("${server.port}")
    private String port;

    private Map<Long, Icra> atamalist = new HashMap<Long, Icra>();

    @PostMapping("/vekilAta")
    public String vekilAta(@RequestBody IcraDTO icraDTO) {
        Icra icra = new Icra();
        icra.setVekilId(icraDTO.getVekilId());
        icra.setVekilAdi(icraDTO.getVekilAdi());
        icra.setDate(new Date());
        icra.setIcraId(new Random().nextInt(100));
        atamalist.put(icra.getIcraId(), icra);
        System.out.println(atamalist.size());
        return "Vekil atandı. Port: " + port + ".";
    }

}
