
public class HelloWorld {
    public static void main(String []args) {
        T t1 = new T();
//        t1.factorial(5);
        int map[][] = new int[8][7];
        for(int i = 0;i < 7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for(int i = 0; i < 8 ;i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;

        for(int[] i: map){
            for(int j :i){
                System.out.print(j +"\t");
            }
            System.out.println();
        }
        t1.findway(map,1,1);
        System.out.println("==========================");
        for(int[] i: map){
            for(int j :i){
                System.out.print(j +"\t");
            }
            System.out.println();
        }
    }
}
class T{

//1.findway方法就是专内来找出迷宫的路径
//2.如果找到，就返回 true，否则返回false
//3.map 就是二维数组，即表示迷宫
//4.i,j 就是老鼠的位置，初始化的位置为(1,1)
//5.因为我们是递归的找路，所以我先规定 map数组的各个值的含义
//  0 表示可以走 1 表示障碍物 2 表示可以走 3 表示走过，但是走不通是死路//6.当map[6][5]=2 就说明找到通路,就可以结束，否则就继续找·
//7.先确定老鼠找路策略下->右->上->左
    public boolean findway(int [][] map ,int i,int j){

        if(map[6][5] == 2){
            return true;
        }else {
            if (map[i][j] == 0){
                map[i][j] = 2;
                if(findway(map,i+1,j)){
                    map[i][j] = 2;
                    return true;
                }else if(findway(map,i,j+1)){
                    map[i][j] = 2;
                    return true;
                }else if(findway(map, i-1 ,j)){
                    map[i][j] = 2;
                    return true;
                }else if(findway(map,i,j-1)){
                    map[i][j] = 2;
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }

            }else{// 1,3
                return false;
            }
        }
    }

}
