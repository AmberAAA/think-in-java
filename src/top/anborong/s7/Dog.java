package top.anborong.s7;

import static net.mindview.util.Print.*;

/**
 * 重写与重载
 *
 * 1. 重写
 *  * 子类覆盖父类的方法
 *  * 要求同名同参同返回
 *
 * 2. 重载
 *  * 同名不同参
 *  * 对返回值不做判断
 */
public class Dog extends Animal {

    Dog say (char c) {
        printf("Dog say char: %s \n", c);
        return this;
    }


    Dog say (int i) {
        printf("Dog say int: %s \n", i);
        return this;
    }

    public static void main(String[] args) {
        new Dog().say(1).say(1L).say("1").say('c');
    }
}

class Animal{
    Animal say (int i) {
        printf("Animal say int: %d \n", i);
        return this;
    }
    Animal say (String s) {
        printf("Animal say String: %s \n", s);
        return this;
    }
    Animal say (Long l) {
        printf("Animal say Long: %d \n", l);
        return this;
    }
}
