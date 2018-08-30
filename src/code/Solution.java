package code;


/**
 * 二元数组查找
 *
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *
 */

/**
 * 思路:此题给出的数组条件经分析后应该是一个矩阵数组,可充分利用此数组的递增规律来实现查找,
 * 使用暴力遍历和二分法均不是最优答案,最佳的方案是将左下角当成判断的起点,通过判断来进行上移或右移坐标遍历;
 *      测试用例:
 *         目标值:5;
 *         二位数组(矩阵):
 *         1 3 5 7 9
 *         2 4 6 8 10
 *         4 6 8 10 12
 *         8 10 12 14
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        int row = array.length-1;
        int col = 0;//必须从左下角或右上角开始判断,这样才有确定的移动方向,若从某行中间开始则不确定往哪个方向移动;

        //限制坐标,
        while(row>=0 && col<array[row].length){
            //首先必须判断是否命中,否则会得不到准确的boolean值;
            if(array[row][col] == target){
                return true;
            }

            //其次判断当前坐标与目标值的大小,小则移动列坐标,大则移动行坐标,注意每移动一次都要利用 continue跳过当前循环,否则同时移动行列坐标可能导致数组下标越界;
            if(array[row][col] < target){
                col++;
                continue;
            }
            if(array[row][col] > target){
                row--;
                continue;
            }

        }
        return false;

    }
}
