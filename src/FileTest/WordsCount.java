package FileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 统计文件内每个单词出现的次数
 * @author Administrator
 *
 */
public class WordsCount {
	private static HashMap<String, Integer> wordsCountMap = new HashMap<String, Integer>();

	public static void main(String[] args) {
		File file = new File("D:/Test.txt");
		BufferedReader br = null;
		Set<String> wordsSet = wordsCountMap.keySet();
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			String nextLine = null;
			while(null !=(nextLine=br.readLine())) {
				String[] wordsArr = nextLine.split("\\W+");
				for(int i=0 ; i<wordsArr.length ; i++) {
					if(wordsSet.contains(wordsArr[i])) {
						Integer countInt =  wordsCountMap.get(wordsArr[i]);
						wordsCountMap.put(wordsArr[i], ++countInt);
					}else {
						wordsCountMap.put(wordsArr[i], 1);
					}
				}
			}
			
			Iterator<String> iterator = wordsCountMap.keySet().iterator();
			while(iterator.hasNext()) {
				String next = iterator.next();
				System.out.println("单词"+next+"出现了"+wordsCountMap.get(next)+"次!");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != br) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
