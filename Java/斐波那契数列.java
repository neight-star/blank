/*
斐波那契数列
*/
public class HelloWorld {
    public static void main(String []args) {
        T t1 = new T();
        System.out.println(t1.factorial(0));
    }
}
class T{
    //阶乘
    public int factorial(int n){
        if(n >=3){
            return factorial(n-1) + factorial(n-2);
        }else if(n ==1 | n==2){
            return 1;
        }
        else{
            return -1;
        }
    }
}
