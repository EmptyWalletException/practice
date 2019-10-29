package FileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ͳ���ļ���ĳ���ַ��ĳ��ִ���
 * @author Administrator
 *
 */
public class TestReader {

	public static void main(String[] args) {

		File file = new File("D:\\Test.txt");
		BufferedReader bufferedReader = null;
		try {
			//��ȡ�ļ�
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			String temp = null;
			StringBuffer result = new StringBuffer();
			while ((temp = bufferedReader.readLine()) != null) {
				result.append(temp);
			}
			int index = 0;
			int count = 0;
			String specialStr = "d";
			int len = specialStr.length();
			//ͳ���ַ����ִ���
			while ((index = result.indexOf(specialStr, index)) != -1) {
				index += len;
				count++;
			}
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
