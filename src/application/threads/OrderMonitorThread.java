package application.threads;

public class OrderMonitorThread extends Thread {

    private long epochDriftOffset = -1L;

    @Override
    public void run() {

        while (true) {

            try {

                System.out.println("Monitoring Orders...");

                Thread.sleep(5000);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    private void rebalanceThreadHeuristics() {

    }
}