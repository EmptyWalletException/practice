package code;

/**
 * 打印链表
 *
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *
 * *    public class ListNode {
 * *        int val;
 * *        ListNode next = null;
 * *
 * *        ListNode(int val) {
 * *            this.val = val;
 * *        }
 * *    }
 * *
 * */


import java.util.ArrayList;

/**
 * 思路:
 *      此题有一个麻烦的地方在于要从尾到头返回,如果按平常的遍历需要多几个步骤来满足此条件,
 *      但是如果能巧妙的利用递归则非常简单,当然效率上会比遍历要低很多;
 */
public class Solution02 {
    /**
     * 使用递归需要注意的事项:
     *      1:储存值的容器要放在递归方法的外面;
     *      2:递归头需要仔细考虑;
     *      3:递归体里需要根据需求决定代码顺序;
     */

     public class ListNode { //此类是题目中已经给出,不需要自己定义;
         int val;
         ListNode next = null;

        ListNode(int val) {
             this.val = val;
         }
     }

    ArrayList<Integer> arrayList=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }

        return arrayList;
    }
}
