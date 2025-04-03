package nidheeshnelson.firstpack;

public interface Doable {
  default void doIt(){
        System.out.println("Do it now");
    }
    default void doItUrge(){
        System.out.println("Do it immediately");
    }
}
