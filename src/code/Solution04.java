package code;

/**
 *变态青蛙跳台阶
 *
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

/**
 * 解题思路:
 *      此题目是上一题的升级版
 *      迭代思路:
 *          根据上一个题目：青蛙只跳1或2可以得出是一个斐波那契问题，即f[n]=f[n-1]+f[n-2],
 *          那么能跳1,2,3个台阶时f[3]=f[n-1]+f[n-2]+f[n-3],
 *          ......
 *          那么能跳1,2,3...n个台阶时f[n]=f[n-1]+f[n-2]+f[n-3]...+f[1]
 *          依次类推，能推出本题的f[n]=f[n-1]+f[n-2]+......+f[1];
 *          将此方程变形,得出f[n]=2*f[n-1]
 *          由此得出代码：
 */
public class Solution04 {

    //方案1:迭代
    public int JumpFloorII01(int target) {
        if( 0 >= target){
            return 0;
        }
        if( 1 == target){
            return 1;
        }
        int count = 1;
        while(0 < --target){
            count *= 2;
        }
        return count;
    }

    //高效迭代:
    public int JumpFloorII011(int target) {
        return 1 << (--target);
    }

    //方案3:递归
    public int JumpFloorII02(int target) {
        if( 0 >= target){
            return 0;
        }
        if( 1 == target){
            return 1;
        }
        return 2 * JumpFloorII02(target - 1);

    }
}
