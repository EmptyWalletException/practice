package code;

/**
 * @Description:    冒泡排序
 * @Author: MasterCV
 * @Date: Created in  2018/10/9 12:54
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {2,6,8,1,0,3,5,5,1,9,4};
        bubbleSort(num);
    }

    public static void bubbleSort(int[] arr){
        System.out.println("排序前的数组为 ： " );
        for(int num : arr){
            System.out.print(num+" ");
        }

        //冒泡排序的核心，记住这两个for循环就可以了；
        for(int i=0 ; i<arr.length-1 ; i++){
            for (int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(" ");
        System.out.println("排序后的数组为 ： " );
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
