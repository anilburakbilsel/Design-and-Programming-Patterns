public class ClassicSingleton{

    private static ClassicSingleton instance = null;
    
    private ClassicSingleton(){
        //exists only to defeat instantiation
    }

    public static ClassicSingleton getInstance(){
        if(instance == null){
            instance = new ClassicSingleton();
        }
        return instance;
    }
}