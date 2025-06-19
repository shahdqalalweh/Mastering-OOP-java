package SmallProject;

public class Android extends SmartPhone{
private String OS = "Android";
private boolean withPen = false;

public Android(String Model, String Brand,float Size, boolean withPen){
    super( Model, Brand, Size);
    this.withPen = withPen;
}

@Override
    public void welcoming() {
        System.out.println("Hello I am Android Phone");
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean isWithPen() {
        return withPen;
    }

    public void setWithPen(boolean withPen) {
        this.withPen = withPen;
    }
}
