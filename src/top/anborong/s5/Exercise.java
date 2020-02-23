package top.anborong.s5;

/**
 * 练习使用枚举类型
 */
public enum Exercise {
    RED(1, "red"),
    GREEN(2, "green"),
    BLUE(3, "blue"),
    BLACK(3, "BLACK");

    private int code;
    private String name;

    Exercise(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static void print(Exercise exercise) {
        switch (exercise) {
            case RED: System.out.println("RED"); break;
            case BLUE:System.out.println("BLUE"); break;
            case GREEN: System.out.println("GREEN"); break;
            case BLACK: System.out.println("BLACK"); break;
        }
    }

    public static void main(String[] args) {
        print(Exercise.BLACK);
        print(Exercise.GREEN);
    }
}
