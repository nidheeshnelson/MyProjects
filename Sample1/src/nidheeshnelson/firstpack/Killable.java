package nidheeshnelson.firstpack;

public interface Killable {
    default void killIt(){
        System.out.println("Kill it now");
    }
}
