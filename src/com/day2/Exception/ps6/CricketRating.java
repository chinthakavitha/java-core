package com.day2.Exception.ps6;

class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}
//Input 1
public class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public CricketRating(String playerName, float critic1, float critic2) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        calculateAverageRating(critic1, critic2);
        calculateCoins();
    }
    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating(critic1, critic2, critic3);
        calculateCoins();
    }

    public void calculateAverageRating(float critic1, float critic2) {
        avgRating = (critic1 + critic2) / 2;
    }

    public void calculateAverageRating(float critic1, float critic2, float critic3) {
        avgRating = (critic1 + critic2 + critic3) / 3;
    }

    public String calculateCoins() {
        if (avgRating >= 7) {
            coins = "Gold";
        } else if (avgRating >= 5 && avgRating < 7) {
            coins = "Silver";
        } else if (avgRating >= 2 && avgRating < 5) {
            coins = "Copper";
        } else {
            coins = "Not Eligible";
        }
        return coins;
    }

    public void display() {
        System.out.println(playerName + " " + avgRating + " " + coins);
    }

    public static void main(String[] args) {
        CricketRating player = new CricketRating("John", 9.3f, 9.67f, 8.7f);
        player.display();
    }
}

