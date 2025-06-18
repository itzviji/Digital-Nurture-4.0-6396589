public class Main{
    public static void main(String[] args){
        Logger l1=Logger.getInstance();
        l1.log("Log 1");
        Logger l2=Logger.getInstance();
        l2.log("Log 2");

        if(l1==l2){
          System.out.println("Log1 and Log2 are the same instance");
        }
        else{
            System.out.println("Both are different instance");
        }
    }
}