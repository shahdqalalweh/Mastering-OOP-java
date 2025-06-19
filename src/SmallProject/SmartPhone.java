package SmallProject;

public class SmartPhone extends OldPhone implements Camera,Mp3Player {

    private float Size;
   // private String OS;

    public float getSize() {
        return Size;
    }

    public void setSize(float size) {
        Size = size;
    }


    public SmartPhone(String Model, String Brand,float Size){
   super(Model, Brand);
    this.Size = Size;

}
    @Override
    public void sendSMS() {
        System.out.println("Sending SMS ......");
    }
    public void welcoming(){
        System.out.println("Hello I am a smart phone");
    }

    @Override
    public void MakeCalls() {
        System.out.println("Hello from Smart Phone");
    }
// overloading
    public void MakeCalls(SmartPhone phone){
        System.out.println("Making a call ....Helloooo " + phone.toString());
    }

    @Override
    public void shoot() {
        System.out.println("Take a Photo");
    }

    @Override
    public void mp3Music() {
        System.out.println("Musiiiicccc");
    }
}
