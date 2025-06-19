package SmallProject;

public abstract class OldPhone {
    // abstract class must contain at least one abstract method
    // abstract class can has a constructor but we cant instantiate an object

    private String Model;
    private String Brand;

    // constructor OverLoading
    public OldPhone(){}

    public OldPhone(String Model, String Brand){
    this.Brand = Brand;
    this.Model = Model;
    }
    public void setModel(String Model){
        this.Model = Model;
    }


    public void setBrand(String Brand){
        this.Brand = Brand;
    }


    public String getModel (){
        return this.Model;
    }

    public String getBrand(){
        return this.Brand;
    }

    public void MakeCalls(){
        System.out.println("Making a call ....Helloooo");
    }



    public void rcvCall(){
        System.out.println("rcv a call...... Hellooooo");
    }
    // abstract method has no imp.
    public abstract void sendSMS();
}
