import org.junit.Test;

import static org.junit.Assert.*;

/*
* 等价类划分：
* 1、有效等价类
* 单一分数 ex: "1/2"，"2/3"，"5/1"
* 多个分数加法 ex : "1/2+1/3"，"3/4+1/4"
* 多个分数的减法 ex : "1/2-1/3"，"3/4-1/4"
* 混合运算（加法和减法）ex: "1/2+1/3-1/4"，"-1/2+1/3+1/4"
* 负分数：ex: "-1/2+1/2"，"-2/3-1/3"
* 2、边界等价类
* 最小分子和分母：示例："1/1"
* 最大分数数量：示例："1/2+1/3+1/4+1/5+1/6+1/7+1/8+1/9+1/10"
* */

public class L2022211918_Solution10_Test {
    private Solution10 test = new Solution10();
    // 测试目的：题目中给出的实例1
    // 测试用例："-1/2+1/2"
    //           "0/1"
    @Test
    public void test1() {
        assertEquals("0/1", test.fractionAddition("-1/2+1/2"));
    }
    // 测试目的：题目中给出的实例2
    // 测试用例："-1/2+1/2+1/3"
    //           "1/3"
    @Test
    public void test2() {
        assertEquals("1/3", test.fractionAddition("-1/2+1/2+1/3"));
    }
    // 测试目的：题目中给出的实例3
    // 测试用例："1/3-1/2"
    //           "-1/6"
    @Test
    public void test3() {
        assertEquals("-1/6", test.fractionAddition("1/3-1/2"));
    }
    // 测试目的：用于测试 gcd 函数是否正常
    // 测试用例：(36, 48)
    //           12
    @Test
    public void testForGcd1() {
        assertEquals(12, test.gcd(36, 48));
    }
    // 测试目的：测试 gcd 函数的边界情况
    // 测试用例：(0, 100)
    //           100
    @Test
    public void testForGcd2() {
        assertEquals(100, test.gcd(0, 100));
    }
    // 测试目的：测试单一分数情况
    // 测试用例： "1/2"
    //           "1/2"
    @Test
    public void singleNumber() {
        assertEquals("1/2", test.fractionAddition("1/2"));
    }
    // 测试目的：测试多个分数加法情况
    // 测试用例： "3/4+1/4"
    //           "1/1"
    @Test
    public void NumbersPlus() {
        assertEquals("1/1", test.fractionAddition("3/4+1/4"));
    }
    // 测试目的：测试多个分数减法情况
    // 测试用例： "3/4+1/4"
    //           "1/6"
    @Test
    public void NumbersMinus() {
        assertEquals("1/6", test.fractionAddition("1/2-1/3"));
    }
    // 测试目的：测试混合运算
    // 测试用例： "1/2+1/3-1/4"
    //           "7/12"
    @Test
    public void NumbersMix() {
        assertEquals("7/12", test.fractionAddition("1/2+1/3-1/4"));
    }
    // 测试目的：测试负分数
    // 测试用例： "-2/3-1/3"
    //           "-1/1"
    @Test
    public void NumbersFu() {
        assertEquals("-1/1", test.fractionAddition("-2/3-1/3"));
    }
    // 测试目的：最小分子和分母
    // 测试用例： "0/1"
    //           "0/1"
    @Test
    public void NumbersMinNumber() {
        assertEquals("0/1", test.fractionAddition("0/1"));
    }
    // 测试目的：最大分子和分母
    // 测试用例： "1/2+1/3+1/4+1/5+1/6+1/7+1/8+1/9+1/10"
    //           "4861/2520"
    @Test
    public void NumbersMaxNumber() {
        assertEquals("4861/2520", test.fractionAddition("1/2+1/3+1/4+1/5+1/6+1/7+1/8+1/9+1/10"));
    }
}