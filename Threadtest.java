class Mythread extends Thread
{
    public Mythread(String yash)
    {
        super(yash);
    }
}

public class Threadtest {
    public static void main(String[] args) throws Exception{
        Mythread t =new Mythread("My thread 1");
        System.out.println(t.getId()); //ID
        System.out.println(t.getName()); //NAME
        System.out.println(t.getPriority()); //Priority
        t.start();
        System.out.println(t.getState()); //state
        System.out.println(t.isAlive()); //alive

    }
}
