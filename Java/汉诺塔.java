
public class HelloWorld {
    public static void main(String []args) {
        T t1 = new T();
//
        t1.move(1,'A','B','C');
    }
}
class T{
    public void move(int num,char a,char b,char c){
        if (num == 1){
            System.out.println(a + "->" + c);
        }else {
            move(num -1, a,c,b);
            System.out.println(a + "->" + c);
            move(num -1 ,b,a,c);
        }
    }
}
