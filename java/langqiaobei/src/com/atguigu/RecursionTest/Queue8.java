package com.atguigu.RecursionTest;

public class Queue8 {

    //定义一个max表示共有多少个皇后
    int max = 8;
    int[] array = new int[max];
    static int count = 0;

    public static void main(String[] args) {

        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.println("一共有" + count + "种解法");
    }

    //编写一个方法，放置第n个皇后
    private void check(int n) {
        if (n == max) {//n=8 这是放第九个皇后了，其实8个皇后已放好了
            print();
            return;
        }

        //依次放入皇后，并判断是否冲突
        for (int i = 0; i < max; i++) {
            //先把当前这个皇后n，放到该行的第1列
            array[n] = i;
            //判断当放置第n个皇后到i列时是否冲突
            if (judge(n)) {
                //接着放n+1个皇后，寄开始递归
                check(n + 1);
            }
            //如果冲突，就继续执行 array[n] = i; 即将第n个皇后，放置在本行得 后移的一个位置
        }
    }


    //查看当我们放置第n个皇后，就去检测该皇后是否和前面已经摆放的皇后冲突

    /***
     *
     * @param n 表示第n个皇后
     * @return
     */
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            // 说明
            //1，array[i] == array[n] 表示判断 第n个皇后是否和前面的n-1个皇后在同一列
            //2，Math,abs(n-i) == Math,abs(array[n] - array[i]) 表示判断第n个皇后是否和第i皇后是否在同-斜线
            // n = 1 放置第 2列1 n = 1 array[1] = 1
            // Math.abs(1-0) == 1 Math,abs(array[n]
            //3。判断是否在同一行，没有必要，n 每次都在递增
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;

    }


    //写一个方法，将皇后摆放的位置打印出来

    private void print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
