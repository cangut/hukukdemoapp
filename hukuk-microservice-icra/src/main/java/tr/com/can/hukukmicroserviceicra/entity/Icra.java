package tr.com.can.hukukmicroserviceicra.entity;

import java.util.Date;

public class Icra {

    private long icraId;

    private String vekilAdi;

    private long vekilId;

    private Date date;

    public long getIcraId() {
        return icraId;
    }

    public void setIcraId(long icraId) {
        this.icraId = icraId;
    }

    public String getVekilAdi() {
        return vekilAdi;
    }

    public void setVekilAdi(String vekilAdi) {
        this.vekilAdi = vekilAdi;
    }

    public long getVekilId() {
        return vekilId;
    }

    public void setVekilId(long vekilId) {
        this.vekilId = vekilId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
