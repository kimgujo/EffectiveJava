package hskim.effictive.item1;

public interface StaticMethodInterfaceTest {

    public static String PUBLIC_NAME = "HSKIM";


    //private static String PRIVATE_NAME = "HSKIM";
    //인터페이스에서 정적필드, 정적 클래스는 모두 public여야한다.

    public static boolean isTrue(boolean flag){
        return flag;
    }

    private static String getName(){
        return PUBLIC_NAME;
    }

    /*private static String getName(){
        return PRIVATE_NAME;
    }*/

}
