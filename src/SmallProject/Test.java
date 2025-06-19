package SmallProject;

public class Test {
    public static void main(String[] args){
       // OldPhone old = new OldPhone();
        SmartPhone smart = new SmartPhone("2017", "New", 12);
        smart.MakeCalls();

        SmartPhone Galexy = new Android("2019", "Nokia", 12, true);

        OldPhone Galexy2 = new Android("2018", "Samsung", 12, true);
        Android Galexy3 = new Android("2020", "oppo", 12, true);

        Galexy.welcoming();
        System.out.println(Galexy.getClass());
        System.out.println(Galexy2.getClass());
        System.out.println(Galexy3.getClass());
        Galexy.sendSMS();

        Galexy.welcoming();
       // Galexy2.welcoming(); =>> Cant
        Galexy3.welcoming();

        SmartPhone ph1 = new SmartPhone("Smart 1", "2020",10);
        SmartPhone ph2 = new SmartPhone("Smart 2", "2020",10);

ph1.MakeCalls(ph2);
ph1.MakeCalls();

        IOS iphone1 = new IOS("2023", "Apple", 10, 100);
        IOS iphone2 = new IOS("2024", "Apple", 10, 100);
        IOS iphone3 = new IOS("2025", "Apple", 10, 100);

        SmartPhone[] phones ={Galexy3, Galexy, iphone1, iphone2,iphone3};
        System.out.println("Smart Phones with diff Prob");
        for(SmartPhone ph: phones){
            System.out.print(ph.getBrand()+" ");
            System.out.println(ph.getModel());
        }



    }
}
