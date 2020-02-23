package top.anborong.s5;

/**
 * 第五章 练习题 P77 练习10~12
 * 垃圾回收与GC程序
 */
public class Tank {
    private boolean empty = true;

    public Tank(boolean empty) {
        this.empty = empty;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (!empty) {
            System.out.println("error not empty!!!");
        }
    }

    public static void test() {
        System.out.println("test finalize .....");
        Tank tank = new Tank(true);
        Tank tank1 = new Tank(false);
        Tank tank2 = new Tank(true);
    }

    public static void main(String[] args) {
        test();
        System.gc();
    }
}
