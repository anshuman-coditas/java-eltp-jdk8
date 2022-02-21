package JDK8Updates;

class Addition extends Thread{
   public void run(){
       try{
           for(int i=0;i<5;i++)
               System.out.println("Thread Running:: "+Thread.currentThread());
                Thread.sleep(100);
       }
       catch(Exception e){
           e.printStackTrace();
       }
   }

}
public class Ques1 {
    public static void main(String[] args) throws Throwable {
        Addition obj_a=new Addition();
        Addition obj_a1=new Addition();
        System.out.println(obj_a.getClass());
        System.out.println(obj_a.hashCode());
        System.out.println(obj_a.equals(obj_a1));
        System.out.println(obj_a.toString());
        obj_a.start();
        obj_a1.start();
    }
}
/*
class JDK8Updates.Addition
1705736037
false
Thread[Thread-0,5,main]
Thread Running:: Thread[Thread-1,5,main]
Thread Running:: Thread[Thread-1,5,main]
Thread Running:: Thread[Thread-1,5,main]
Thread Running:: Thread[Thread-1,5,main]
Thread Running:: Thread[Thread-1,5,main]
Thread Running:: Thread[Thread-0,5,main]
Thread Running:: Thread[Thread-0,5,main]
Thread Running:: Thread[Thread-0,5,main]
Thread Running:: Thread[Thread-0,5,main]
Thread Running:: Thread[Thread-0,5,main]
 */