// Singleton Pattern

// the singleton's purpose is to control object creation, limiting the number of objects to only one. 
// only one instance per class, just like the static fields.

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