package com.example.apple.builderpatterndemo;

/**
 * 作者：孔先生 on 2017/3/22 11:33
 * 邮箱：197726885@qq.com
 * 说明：商家实现了抽象的Builder类，MoonComputerBuilder类用于组装电脑：
 */
public class MoonComputerBuilder extends Builder {
    private Computer mComputer = new Computer();
    @Override
    public void buildCpu(String cpu) {
        this.mComputer.setmCpu(cpu);
    }

    @Override
    public void buildMainboard(String mMainboard) {
        this.mComputer.setmMainboard(mMainboard);
    }

    @Override
    public void buildRam(String mRam) {
        this.mComputer.setmRam(mRam);
    }

    @Override
    public Computer creat() {
        return mComputer;
    }
}
