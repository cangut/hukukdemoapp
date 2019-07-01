package tr.com.can.hukukmicroservicevekil.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vekil {

    private int vekilId;

    private String buro;

    private String adi;

    private String soyadi;

    private static Object[][] vekils = {
            { "Deniz Hukuk Bürosu", "Ahmet", "Çam"},
            { "Bulut Avukatlık Bürosu", "Mehmet", "Gün",},
            { "Güneş Hukuk Bürosu", "Ayşe", "Ay"},
            { "Ay Avukatlık Bürosu", "Mahmut", "Mert"},
            { "Çarpar Avukatlık", "Ali", "Veli"}};

    public static List<Vekil> getVekils() {

        List<Vekil> tmpVekils = new ArrayList<>();
        int iteration = 0;
        for (Object[] vekil : Arrays.asList(vekils)) {
            tmpVekils.add(new Vekil(iteration++, vekil[0].toString(), vekil[1].toString(), vekil[2].toString()));
        }
        return tmpVekils;
    }

    public Vekil(int vekilId, String buro, String adi, String soyadi) {
        this.vekilId = vekilId;
        this.buro = buro;
        this.adi = adi;
        this.soyadi = soyadi;
    }

    public int getVekilId() {
        return vekilId;
    }

    public void setVekilId(int vekilId) {
        this.vekilId = vekilId;
    }

    public String getBuro() {
        return buro;
    }

    public void setBuro(String buro) {
        this.buro = buro;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
}
