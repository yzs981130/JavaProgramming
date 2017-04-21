/**
 * Created by yzs on 2017/4/21.
 */
class A{
    public int foo(int x, int y){
        int z = 0;
        try {
            z = x/ y;
        }
        catch (ArithmeticException e){
            String message = e.getMessage();
            System.out.println(message);
        }
        return z;
    }
}
class MyException extends Exception{
    private int id;
    public MyException(String message, int _id){
        super(message);
        this.id = _id;
    }
    public int getId(){
        return id;
    }
}
class Test{
    public void regist(int num) throws MyException{
        if(num < 0){
            System.out.println("ID number" + num);
            throw new MyException("Negative!", num);
        }
    }
    public void manager(){
        try{
            regist(-100);
        }
        catch (MyException e){
            System.out.println("Failed to register" + e.getId());
        }
    }
}
public class Main{
    public static void main(String [] args){
        A a = new A();
        Test t = new Test();
        t.manager();
        a.foo(4, 0);
    }
}
