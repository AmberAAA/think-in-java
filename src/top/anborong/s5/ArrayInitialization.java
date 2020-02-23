package top.anborong.s5;

/**
 * 数组初始化
 */
public class ArrayInitialization {
    class A {
        public A(String i) {
            System.out.println(i);
        }
    }

    // private String[] arr = {"Hello", "World", "String"};
    private A[] arr = {new A("a"), new A("b"), new A("c")};

    public void printArr() {
        for (A i :
                arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new ArrayInitialization().printArr();
    }
}
