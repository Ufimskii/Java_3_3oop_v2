package ru.netology;

public class Radio {
    private int maxValume = 10;
    private int minValume = 0;
    private int currentValume;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;

    // СТАНЦИИ
    // Максимальная станция
    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    // Минимальная  станция
    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    // Текущая станция
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    //Увеличение станции
    public void upStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    //Уменьшение станции
    public void downStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }

    // ГРОМКОСТЬ
// Максимальная громкость
    public int getMaxValume() {
        return maxValume;
    }

    public void setMaxValume(int maxValume) {
        this.maxValume = maxValume;
    }

    // Минимальная  громкость
    public int getMinValume() {
        return minValume;
    }

    public void setMinValume(int minValume) {
        this.minValume = minValume;
    }

    // Текущая громкость
    public int getCurrentValume() {
        return currentValume;
    }

    public void setCurrentValume(int currentValume) {
        this.currentValume = currentValume;
    }

    //Увеличение громкости
     public void upVolume() {
        if (currentValume == maxValume) {
            currentValume = currentValume + 0;
        }else {currentValume++;}
    }

    //Уменьшение громкости -
    public void downVolume() {
        if (currentValume == minValume) {
            currentValume = currentValume - 0;
        }else {currentValume--;}
    }
}
