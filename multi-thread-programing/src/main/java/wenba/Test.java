package wenba;

/**
 * @author：tongrongbing
 * @date：created in 2020/9/25 9:53 上午
 * @description：
 */
public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
        thread.start();
    }
}
