package tr.com.can.hukukmicroservicevekil.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.can.hukukmicroservicevekil.entity.Vekil;

import java.util.List;

@RestController
@RequestMapping("v1/vekil")
public class VekilRestController {

    @Value("${vekil.size}")
    private int size;

    @GetMapping("/allVekils")
    public List<Vekil> getVekils() {
        return Vekil.getVekils().subList(0, size);
    }
}
