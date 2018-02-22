public class Singleton{

    private static Singleton singleton = new Singleton();

    //a private constructor prevents any other class from instantiating
    private Singleton(){ }

    //static instance method
    public static Singleton getInstace(){
        return singleton;
    }

    protected static void demoMethod(){
        System.out.println("demoMethod for singleton");
    }
}