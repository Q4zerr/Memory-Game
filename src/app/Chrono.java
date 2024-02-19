package app;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class Chrono {
    private Timer timer;
    private long startTime;
    private long elapsedTime;

    public Chrono() {
        timer = new Timer();
    }

    public void start(JLabel txtTimeCounter) {
        startTime = System.currentTimeMillis();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                elapsedTime = System.currentTimeMillis() - startTime;
                txtTimeCounter.setText(getElapsedTimeInSeconds() + "s");
            }
        }, 0, 100);
    }

    public void stop() {
        timer.cancel();
    }
    
    public void reset(JLabel txtTimeCounter) {
        timer.cancel();
        timer = new Timer();
        start(txtTimeCounter);
    }

    public double getElapsedTimeInSeconds() {
        return Math.round(elapsedTime / 100.0) / 10.0; // Arrondir au dixième de seconde
    }
}
