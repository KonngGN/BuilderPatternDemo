package com.example.apple.builderpatterndemo;

/**
 * 作者：孔先生 on 2017/3/22 11:29
 * 邮箱：197726885@qq.com
 * 说明：创建产品类
        我要组装一台电脑，电脑被抽象为Computer类，它有三个部件:CPU 、主板和内存。并在里面提供了三个方法分别用来设置CPU 、主板和内存：
 */
public class Computer {
    private String mCpu;
    private String mMainboard;
    private String mRam;

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setmMainboard(String mMainboard) {
        this.mMainboard = mMainboard;
    }

    public void setmRam(String mRam) {
        this.mRam = mRam;
    }
}
