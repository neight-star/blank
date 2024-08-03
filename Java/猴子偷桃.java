//猴子偷桃
/*猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，
并再多吃了一个!以后每天猴子都吃其中的一半，然后再多吃一个。
当到第10天时，想再吃时(即还没吃)，发现只有1个桃子了。问题:最初共多少个桃子?
*/
public class HelloWorld {
    public static void main(String []args) {
        T t1 = new T();
        int n = t1.pearSum(9,1);
        System.out.println(n);
    }
}
class T{
    public int pearSum(int n,int sum){
        if(n >= 1){
            sum = (sum + 1) * 2;
            return pearSum(n-1,sum);
        }else {
            return sum;
        }

    }

}
