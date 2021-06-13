package ru.netology.domain;

public class Radio {
    private int currentRadioStation;               //текущая радио станция
    private int minRadioStation;
    private int maxRadioStation;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }


    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Изменение текущей радио станции на цифровом пульте от min  до max:
    public void setCurrentRadioStationByControl(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }

        this.currentRadioStation = currentRadioStation;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  Увеличение текущей радио станции :

    public void increaseRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation = currentRadioStation + 1;

    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Уменьшение текущей радио станции:
    public void decreaseRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation = currentRadioStation - 1;

    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Звук


    private int currentVolume;
    private int minVolume;
    private int maxVolume;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////
    //   Ввод звука (чтобы не этапе подготовки не ввести значение больше или меньше, чем возможно):

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Увеличение звука на 1
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return;
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Уменьшение звук ана 1:

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

}