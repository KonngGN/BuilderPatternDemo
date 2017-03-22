package com.example.apple.builderpatterndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 建造者模式（builder），将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 * Dirextor: 指挥者类，用于统一组装流程
 * Builder：抽象Builder类，规范产品的组建，一般是由子类实现。
 * ConcreteBulider: MoonComputerBuilder抽象Builder类的实现类，实现抽象Builder类定义的所有方法，并且返回一个组建好的对象
 * Product: Computer产品类
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MoonComputerBuilder computerBuild = new MoonComputerBuilder();
        Direcror direcror = new Direcror(computerBuild);
        Computer computer = direcror.CreateComputer("cpu", "zhuban", "neicun");
    }
}
