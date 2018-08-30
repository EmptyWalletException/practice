package code;

/**
 * 青蛙跳台阶
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */

/**
 * 解题思路:
 *      思路1:
 *          通常碰到此类题目应该先代入几个数字来寻找规律:
 *          台阶数: 1 , 2 , 3 , 4 , 5 , 6 ....
 *          跳法数: 1 , 2 , 3 , 5 , 8 , 13 ....
 *          求得规律: 当台阶数大于2 时, n个台阶的跳法等于(n-1)个台阶的跳法+(n-2)个台阶的跳法,
 *          所以此题是属于著名的兔子繁殖的斐波那契数列问题;
 *          一般使用三个变量来完成迭代即可,也可以通过递归来简化代码量,
 *          但是要注意递归性能会比迭代低很多,当数值较大时递归可能不满足考试时的测试器的要求;
 *
 *      思路2:
 *          斐波那契数列通常可以利用推导最后一步来推理出公式:
 *          假设当有n个台阶时假设有f(n)种走法。
 *          青蛙最后一步要么跨1个台阶要么跨2个台阶。
 *          当最后一步跨1个台阶时即之前有n-1个台阶，根据1的假设即n-1个台阶有f(n-1)种走法。
 *          当最后一步跨2个台阶时即之前有n-2个台阶，根据1的假设即n-2个台阶有f(n-2 )种走法。
 *          显然n个台阶的走法等于前两种情况的走法之和即f(n)=f(n-1)+f(n-2)。
 *          找出递推公式后要找公式出口，即当n为1、2时的情况，显然n=1时f(1)等于1，f(2)等于2
 *              | 1, (n=1)
 *      f(n) =  | 2, (n=2)
 *              | f(n-1)+f(n-2) ,(n>2,n为整数)
 *
 *
 *
 *      斐波那契数列的规律生效通常都需要跳过前两个数,
 *      在此题中则需要跳过第一个和第二个台阶才能用规律计算
 */
public class Solution03 {

    //方案1:迭代
    public int JumpFloor(int target) {
        if(1 == target || 2 == target){
            return target;
        }

        int prevFloor = 1 ;
        int currentFloor = 2 ;
        int count = 0 ;
        for(int i=3; i<=target; i++) {//注意斐波那契数列能用规律计算的起始位置,此处是3;
            count = prevFloor + currentFloor;
            prevFloor = currentFloor;
            currentFloor = count;
        }
        return count;
    }
    //方案2:递归
    public int JumpFloor02(int target) {
        if(1 == target || 2 == target){
            return target;
        }
        return JumpFloor02(target-1)+JumpFloor02(target-2);
    }
}
