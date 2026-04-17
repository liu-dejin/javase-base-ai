package cn.kis2.loop;

public class ForForDemo05 {
    static void main() {
        For();
    }

    static void For() {
        // 打印四行五列
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");  //不换行打印
            }
            // 打印空行
            System.out.println();
        }

    }
}
