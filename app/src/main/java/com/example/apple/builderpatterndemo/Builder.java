package com.example.apple.builderpatterndemo;

/**
 * 作者：孔先生 on 2017/3/22 11:30
 * 邮箱：197726885@qq.com
 * 说明：创建Builder类规范产品的组建
        商家组装电脑有一套组装方法的模版，就是一个抽象的Builder类,里面提供了安装CPU、主板和内存的方法，以及组装成电脑的create方法：
 */
public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void buildMainboard(String mMainboard);
    public abstract void buildRam(String mRam);
    public abstract Computer creat();
}
