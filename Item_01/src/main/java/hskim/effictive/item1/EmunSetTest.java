package hskim.effictive.item1;

import java.util.EnumSet;

public class EmunSetTest {

    enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public void test(int count){
        EnumSet<Days> set = EnumSet.allOf(Days.class);



    }
}
