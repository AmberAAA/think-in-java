package top.anborong.s5;

/**
 * 第五章 可变参数列表 P203
 */
public class OverloadArgs {
    public static void main(String... args) {
        for (String i :
                args) {
            System.out.println(i);
        }
    }
}
