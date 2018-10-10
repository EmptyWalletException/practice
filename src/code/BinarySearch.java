package code;

/**
 * @Description:    二分查找
 * @Author: MasterCV
 * @Date: Created in  2018/10/9 13:11
 */
public class BinarySearch {
    public static void main(String[] args) {

    }

    /**
     * 使用普通的while循环进行二分查找
     * @param arr
     * @param key
     * @return
     */
    public static int commonBinarySearch(int[] arr,int key){
        int low = 0;
        int high = arr.length-1;
        int middle = 0;

        if( low>key || high<key || low>high){
            return -1;
        }

        while( low <= high){
            middle = (low + high)/2;
            if (arr[middle] < key){
                low = middle+1;
            }else if (arr[middle] > key){
                high = middle-1;
            }else {
                //当arr[middle]既不大于目标数字,又不小于目标数字,说明刚好命中,返回下标middle;
                return middle;
            }
        }

        return -1;//说明没有找到
    }

    /**
     * 使用递归方法进行二分查找;
     * @param arr
     * @param key
     * @param low
     * @param high
     * @return
     */
    public static int recursionBinarySearch(int[] arr, int key , int low , int high ){
        if( low>key || high<key || low>high){
            return -1;
        }
        int middle = (low + high)/2;
        if (arr[middle] < key){
            recursionBinarySearch(arr,key,middle+1,high);
        }else if (arr[middle] > key){
            recursionBinarySearch(arr,key,low,middle-1);
        }else {
            //当arr[middle]既不大于目标数字,又不小于目标数字,说明刚好命中,返回下标middle;
            return middle;
        }
        return -1;
    }
}
