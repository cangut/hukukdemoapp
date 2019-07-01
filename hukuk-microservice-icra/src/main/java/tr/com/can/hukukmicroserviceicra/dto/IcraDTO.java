package tr.com.can.hukukmicroserviceicra.dto;

public class IcraDTO {

    private long vekilId;
    private  String vekilAdi;

    public long getVekilId() {
        return vekilId;
    }

    public void setVekilId(long vekilId) {
        this.vekilId = vekilId;
    }

    public String getVekilAdi() {
        return vekilAdi;
    }

    public void setVekilAdi(String vekilAdi) {
        this.vekilAdi = vekilAdi;
    }
}
