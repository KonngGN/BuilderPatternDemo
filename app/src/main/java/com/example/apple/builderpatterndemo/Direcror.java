package com.example.apple.builderpatterndemo;

/**
 * 作者：孔先生 on 2017/3/22 12:53
 * 邮箱：197726885@qq.com
 * 说明：商家实现了抽象的Builder类，MoonComputerBuilder类用于组装电脑：
 */
public class Direcror {

    Builder mBuilder = null;
    public Direcror(Builder builder) {
        this.mBuilder = builder;
    }

    public Computer CreateComputer(String cpu,String mainboard,String ram) {
        mBuilder.buildCpu(cpu);
        mBuilder.buildMainboard(mainboard);
        mBuilder.buildRam(ram);
        return mBuilder.creat();
    }
}
