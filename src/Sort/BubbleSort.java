package Sort;

/**
 * ð������
 * 
 * @author Administrator
 *
 */
public class BubbleSort {
	

	//��ͨ��forǶ��
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
	
	//ֻʹ��һ��forѭ��
	public static void bubbleSortByOnceFor(int[] a) {
		for(int i=0 ; i<a.length-1 ; i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i+1];
				a[i+1] = a[i];
				a[i] = temp;
				i=-1;// ���Ĵ���,���ܻ������forǶ��Ҫ��ܶ�
			}
			
		}
	}
	
	//���в���
	public static void main(String[] args) {
		int[] a = { 0, 2, 3, 5, 6, 7, 1 };
		//bubbleSort(a);
		bubbleSortByOnceFor(a);
		for (int i : a) {
			System.out.print(i + ",");
		}
	}
}
