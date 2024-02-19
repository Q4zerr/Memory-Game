package app;

import java.io.*;
import java.util.*;

public class ScoreManager {
    private ArrayList<Double> scores;
    private static final String SCORE_FILE = "scores.dat";

    public ScoreManager() {
        scores = new ArrayList<>();
        loadScores();
    }

    @SuppressWarnings("unchecked")
    private void loadScores() {
        try {
            FileInputStream fis = new FileInputStream(SCORE_FILE);
            ObjectInputStream ois = new ObjectInputStream(fis);
            scores = (ArrayList<Double>) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveScores() {
        try {
            FileOutputStream fos = new FileOutputStream(SCORE_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(scores);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addScore(double score) {
        scores.add(score);
        Collections.sort(scores);
        if (scores.size() > 3) {
            scores.remove(scores.size() - 1);
        }
        saveScores();
    }
    
    public void clearScores() {
        scores.clear();
        saveScores();
    }

    public List<Double> getTopScores() {
        return scores;
    }
}
