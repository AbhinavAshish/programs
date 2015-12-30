package stacksAndQueues;

import java.util.Date;

/**
 * Created by Abhinav on 12/30/2015.
 */
public class Obj {
public String name;
public Date time;
public static int order =0;
public int orderapplied;
    public String getName() {
        return name;
    }

    public Date getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Obj() {
        orderapplied= order+1;
        order++;
    }
}
