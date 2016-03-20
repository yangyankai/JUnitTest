package com.example.junittest;

import junit.framework.Assert;
import junit.framework.TestCase;

/*******************************************************************************
 * Author  : Yankai
 * Date    : 2016-02-19 16:41
 * Email   : yk_yang@wesugarfree.com
 * Company : 上海无糖运动
 ******************************************************************************/
public class CalculateTest extends TestCase {
    private Calculate calcuate;

    /***
     * @throws Exception android 单元测试
     *                   1. 继承TestCase
     *                   2. 写方法
     *                   public void testXxx() throws Exception{
     *                   }
     *                   3. 方法中加断言    Assert.assertEquals("加法有问题", 5, result);
     */
    public void testAdd() throws Exception {
        calcuate = new Calculate();
        int result = calcuate.add(2, 3);
        Assert.assertEquals("加法有问题", 5, result);
    }

    public void testSubtract() throws Exception {
        calcuate = new Calculate();
        int result = calcuate.subtract(12, 2);
        Assert.assertEquals("减法有问题", 10990, result); //故意设置减法期望值为10000
    }

    public void testMultiply() throws Exception {
        calcuate = new Calculate();
        int result = calcuate.multiply(2, 3);
        Assert.assertEquals("乘法有问题", 6, result);
    }

    public void testDivide() throws Exception {
        calcuate = new Calculate();
        int result = calcuate.divide(6, 3);
        Assert.assertEquals("除法有问题", 2, result);
    }
}