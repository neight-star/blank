public class HelloWorld {
    public static void main(String []args) {
        int x = 23;
        int arr[] = {10,12,45,90};
        int arrNew[] = new int[arr.length + 1];
        arrNew[arr.length] = x;
        for (int i = 0; i < arrNew.length - 1; i++){
            for (int j = 0; j < arrNew.length - i -1; j++){
                arrNew[j] = arr[j];
                if(arrNew[j] > arrNew[j+1]){
                    int tmp = arrNew[j];
                    arrNew[j] = arrNew[j+1];
                    arrNew[j+1] = tmp;
                }
            }
        }for (int n:arrNew) {
            System.out.println(n + "\t");
        }
    }
}



