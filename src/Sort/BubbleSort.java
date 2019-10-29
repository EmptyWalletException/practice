package Sort;

/**
 * 冒泡排序
 * 
 * @author Administrator
 *
 */
public class BubbleSort {
	

	//普通的for嵌套
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
	//只使用一个for循环
	public static void bubbleSortByOnceFor(int[] a) {
		for(int i=0 ; i<a.length-1 ; i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;
				i=-1;// 核心代码,性能会比两个for嵌套要差很多
			}
			
		}
	}
	
	//运行测试
	public static void main(String[] args) {
		int[] a = { 0, 2, 3, 5, 6, 7, 1 };
		//bubbleSort(a);
		bubbleSortByOnceFor(a);
		for (int i : a) {
			System.out.print(i + ",");
		}
	}
}
