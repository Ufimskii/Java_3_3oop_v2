package ru.netology;

public class Radio {
    private int maxValume = 100;
    private int minValume = 0;
    int currentValume;
    private int maxStation = 9;
    private int minStation = 0;


    int currentStation;
    private int numberOfStations = 9;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public Radio() {
    }

    //Количество станций
    public int getNumberOfStations() {
        return numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
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
        this.currentStation = currentStation;
    }


    public void buttonChangeRadioStation(String arg) {
        if (arg.matches("[0-9]*")) {
            int currentStation = Integer.parseInt(arg);
            if (currentStation <= numberOfStations)
                this.currentStation = currentStation;
        } else if ("next".equals(arg)) {
            if (currentStation == numberOfStations) {
                currentStation = 0;
            } else {
                currentStation++;
            }
        } else if ("prev".equals(arg)) {
            if (currentStation == 0) {
                currentStation = maxStation;
            } else {
                currentStation--;
            }
        }
    }
    //Увеличение станции
//    public void upStation() {
//        if (currentStation >= maxStation) {
//            currentStation = minStation;
//        } else {
//            currentStation++;
//        }
//    }

    //Уменьшение станции
//    public void downStation() {
//        if (currentStation <= minStation) {
//            currentStation = maxStation;
//        } else {
//            currentStation--;
//        }
//    }

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

    public void buttonChangeVolume(String arg) {
        if ("+".equals(arg)) {
            if (currentValume < maxValume) {
                currentValume++;
            }
        } else if ("-".equals(arg)) {
            if (currentValume > 0) {
                currentValume--;
            }
        }
    }
//    //Увеличение громкости
//    public void upVolume() {
//        if (currentValume == maxValume) {
//            currentValume = currentValume + 0;
//        } else {
//            currentValume++;
//        }
//    }
//
//    //Уменьшение громкости -
//    public void downVolume() {
//        if (currentValume == minValume) {
//            currentValume = currentValume - 0;
//        } else {
//            currentValume--;
//        }
//    }
}
