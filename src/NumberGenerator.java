public class NumberGenerator implements Runnable{
    private String hashCode;

    public NumberGenerator(String hashCode) {
        this.hashCode = hashCode;
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(hashCode+ ": number "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
