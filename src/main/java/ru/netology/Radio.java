package ru.netology;

public class Radio {
    private int maxValume=100;
    private int minValume=0;
    private int currentValume;
    private int maxStation=9;
    private int minStation=0;
    private int currentStation;
    private int numberStation=10;

    public Radio() {
    }

    public Radio (int numberStation) {
        this.maxStation = numberStation - 1;
    }

    public Radio(int maxValume, int minValume,
                 int currentValume, int maxStation,
                 int minStation, int currentStation) {
        this.maxValume = maxValume;
        this.minValume = minValume;
        this.currentValume = currentValume;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
    }

//    public Radio(int maxStation) {
//        this.maxStation = maxStation;
//    }

    public Radio(int maxStation, int currentStation, int currentValume) {
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.currentValume = currentValume;
    }

    public Radio(int currentStation, int currentValume) {
        this.currentStation = currentStation;
        this.currentValume = currentValume;
    }

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
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
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
        if (currentValume > maxValume) {
            this.currentValume = maxValume;
            return;
        }
        if (currentValume < minValume) {
            this.currentValume = minValume;
            return;
        }

        this.currentValume = currentValume;
    }

    //    //Увеличение громкости
    public void upValume() {
        if (currentValume == maxValume) {
            currentValume = currentValume + 0;
        } else {
            currentValume++;
        }
    }

    //    //Уменьшение громкости -
    public void downValume() {
        if (currentValume == minValume) {
            currentValume = currentValume - 0;
        } else {
            currentValume--;
        }
    }
}
