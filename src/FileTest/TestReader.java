package FileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 统计文件内某个字符的出现次数
 * @author Administrator
 *
 */
public class TestReader {

	public static void main(String[] args) {

		File file = new File("D:\\Test.txt");
		BufferedReader bufferedReader = null;
		try {
			//读取文件
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
			//统计字符出现次数
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
