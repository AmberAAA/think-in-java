package top.anborong.s7;

import static net.mindview.util.Print.*;

/**
 * 第七章 初始化基类 P243
 */
public class Cartoon extends Drawing {

    public Cartoon() {
        print("Cartoon Constructor");
    }

    public static void main(String[] args) {
        new Cartoon();
    }
}

class Drawing extends Art {

    public int say () { return 1; }

    public Drawing() {
        print("Drawing Constructor");
    }
}

class Art{
    public Art() {
        print("Art Constructor");
    }
}