package top.anborong.s5;


/**
 * 第五章 P187
 * 静态变量的初始化顺序
 */
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new CupBoard();
        System.out.println("Creating new Cupboard() in main");
        new CupBoard();
        table.f2(1);
        cupBoard.f3(1);
    }
    static  Table table = new Table();
    static CupBoard cupBoard = new CupBoard();
}

/**

 控制台输出顺序：
 1. 初始化MStaticInitialization的静态变量
    1。1. 初始化Table静态变量 table
        1.1.1 初始化 Table Bowl(1)
            - Bowl(1)
        1.1.2 初始化 Table Bowl(2)
            - Bowl(2)
        1.1.3 创建对象Table
            - Table()
    1.2 初始化cupBoard静态变量
        1.2.1 初始化CupBoard bowl4
            - Bowl(4)
        1.2.2 初始化CupBoard bowl5
            - Bowl(5)
        1.2.3 创建 CupBoard
            1.2.3.1 Bowl(3)
            1.2.3.2 CupBoard()
            1.2.3.3 f1(2)
 2. 执行Main方法
    - Creating new Cupboard() in main
    2.1 创建CupBoard
        - Bowl(3)
        - CupBoard()
        - f1(2)
    - Creating new Cupboard() in main
    2.2 创建CupBoard
        - Bowl(3)
        - CupBoard()
        - f1(2)
    - f2(1)
    - f3(1)

 */
class Bowl {
    public Bowl(int maker) {
        System.out.println("Bowl (" + maker + ")");
    }

    void f1(int maker) {
        System.out.println("f1 (" + maker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    public Table() {
        System.out.println("Table()");

    }

    void f2(int maker) {
        System.out.println("f2 (" + maker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}


class CupBoard{
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    public CupBoard() {
        System.out.println("CupBoard()");
        bowl4.f1(2);
    }

    void f3(int maker) {
        System.out.println("f3 (" + maker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

