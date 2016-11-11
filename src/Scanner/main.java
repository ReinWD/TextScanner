package Scanner;

import java.util.Scanner;

/**
 * Created by 张巍 on 2016/11/12.
 */
public class main {
    public static void main(String[] IG) {
        String target;
        System.out.println("请输入文件地址");
        String path = new Scanner(System.in).nextLine().replace("\\", "\\\\");
        Scan wow = new Scan(path);
        System.out.println("请输入搜索目标");
        target = new Scanner(System.in).nextLine();
        boolean done = false;
        do {
            wow.start(target);
            System.out.println("继续搜索其他字符吗？(y)");
            String whether = new Scanner(System.in).next();
            switch (whether) {
                case "y":
                    System.out.println("请输入搜索目标");
                    target = new Scanner(System.in).nextLine();
                    break;
                default:
                    done = true;
            }

        } while (!done);
    }

    static {
        System.out.println("2016214874张巍的作业");
    }
}
