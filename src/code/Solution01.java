package code;

/**
 * 空格替换
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 */

/**
 * 思路:
 *      此题并没有要求不能调用String类的api,可以直接使用api来进行字符替换;
 *      如果规定不能调用,则利用字符数组来进行遍历替换,只需小心下标的运算即可;
 */
public class Solution01 {
    //方案1:
    public String replaceSpace01(StringBuffer str) {
        return str.toString().replace(" ","%20");
    }

    //方案2:此方案最符合出题人想要考的解题创新能力,解题思路是创建一个不会被下标越界的新字符串容器,将原字符串的每一个字符依次遍历,
    // 如果不是空格就将当前字符装入新容器,是空格则不装入,而是改成装入"$20",但实际运行效率没有方案1高;
    public String replaceSpace02(StringBuffer str) {
        int len = str.length();
        int spaceNum = 0;//用于储存空格的数量
        for(int i=0;i<len;i++){
            if(str.charAt(i)==' ')
                spaceNum++;
        }

        int indexOld = len-1; //indexOld为为替换前的str末尾字符的下标
        int newLength = len + spaceNum*2;//计算空格转换成%20之后的str长度
        int indexNew = newLength-1;//indexNew为把空格替换为%20后的str末尾字符下标
        str.setLength(newLength);//使str的长度扩大到转换成%20之后的长度

        for(;indexOld>=0 && indexOld<newLength;--indexOld){//从末尾开始往前遍历,遇到一个空格就替换
            if(str.charAt(indexOld) == ' '){  //
                str.setCharAt(indexNew--, '0');
                str.setCharAt(indexNew--, '2');
                str.setCharAt(indexNew--, '%');
            }else{
                str.setCharAt(indexNew--, str.charAt(indexOld));
            }
        }
        return str.toString();

    }

   //方案3:
    public String replaceSpace03(StringBuffer str) {
        StringBuffer out=new StringBuffer();
        for (int i = 0; i < str.toString().length(); i++) {
            char b=str.charAt(i);
            if(String.valueOf(b).equals(" ")){
                out.append("%20");
            }else{
                out.append(b);
            }
        }
        return out.toString();
    }



}
