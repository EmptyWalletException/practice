package code;


/**
 * 矩形覆盖
 *
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */

/**
 * 解题思路:
 *      此题其实也是斐波那契数列的变形
 *      不妨先假设n为1,2,3,4,5的情况:
 *          边长: 1 , 2 , 3 , 4 , 5 , 6 ....
 *  *       放法: 1 , 2 , 3 , 5 , 8 , 13 ....
 *      假设2为长边,n为宽边,放法为f[n*2]
 *      当横着放下一个小矩形时,则大矩形的宽需要减去1,剩下的放法就是f[(n-1)*2];再放下一个就是f[(n-2)*2];
 *      当竖着放下一个小矩形时,则此小矩形旁边的格子只能继续竖着放(可以动手画图试验),其实等于被迫要放下一个,等于扣除两个步骤,剩下的放法为f[(n-2)*2]
 *      所以,其规律就是无论怎么放,放下第一个之后剩下的放法是f[(n-1)*2];放下第二个之后剩下的放法是f[(n-2)*2];
 *      得出公式f(n) = f(n-1) + f(n-2);
 */
public class Solution05 {

    //方案1:递归
    public int RectCover(int target) {
        if(0 >= target){
            return 0;
        }
        if(1 == target || 2 == target){
            return target;
        }
        return RectCover(target-1) + RectCover(target-2);
    }

    //方案2:迭代
    public int rectCover02(int target) {
        if (target < 1) {
            return 0;
        }
        int g = 1;
        int f = 2;
        while (0 < --target) {
            f = f + g;
            g = f - g;
        }
        return g;
    }
}
