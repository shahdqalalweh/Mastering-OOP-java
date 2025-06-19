package SmallProject;

public class IOS extends SmartPhone {

    private String OS = "IOS";
    private int chargingCap;

public IOS (String Model, String Brand,float Size,int chargingCap){
    super( Model, Brand, Size);
    this.chargingCap = chargingCap;
}
@Override
    public void welcoming() {
        System.out.println("Hello I am Iphone phone");
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getChargingCap() {
        return chargingCap;
    }

    public void setChargingCap(int chargingCap) {
        this.chargingCap = chargingCap;
    }
}
