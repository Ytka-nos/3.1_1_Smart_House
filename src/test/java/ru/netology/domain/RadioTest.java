package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // Тесты на изменение станции с цифрового пульта:  /////////////////////////////////////////////
    @Test
    void setCurrentRadioStationBorderBeforeMinByControl() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(5);

        rad.setCurrentRadioStationByControl(-1);
        int expected = 5;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadioStationMinByControln() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(5);

        rad.setCurrentRadioStationByControl(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadioStationBorderAfterMinByControl() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(10);
        rad.setCurrentRadioStationByControl(5);

        rad.setCurrentRadioStationByControl(1);
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadioStationBorderBeforeMaxByControl() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(5);

        rad.setCurrentRadioStationByControl(8);
        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadioStationMaxByControl() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(5);

        rad.setCurrentRadioStationByControl(9);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    void setCurrentRadioStationBorderAfterMaxByControl() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(5);

        rad.setCurrentRadioStationByControl(10);
        int expected = 5;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    ;


    // Тесты на изменение станции с цифрового пульта c конструктором:  /////////////////////////////////////////////


    @Test
    void setCurrentRadioStationBorderAfterMaxByControlWithConstructor() {
        Radio rad = new Radio(10);
        rad.setMinRadioStation(0);
        rad.setCurrentRadioStationByControl(5);

        rad.setCurrentRadioStationByControl(10);
        int expected = 5;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


// Тесты на увеличение радио станции:  ////////////////////////////////////////////////////////////////

    @Test
    void increaseRadioStationFromMin() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(0);

        rad.increaseRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    ;

    @Test
    void increaseRadioStationBorderAfterMin() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(10);
        rad.setCurrentRadioStationByControl(1);

        rad.increaseRadioStation();
        int expected = 2;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    ;

    @Test
    void increaseRadioStationBorderBeforeMax() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(8);

        rad.increaseRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    ;

    @Test
    void increaseRadioStationFromMax() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(9);

        rad.increaseRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    ;


// Тесты на увеличение радио станции с конструктором:  ////////////////////////////////////////////////////////////////


    @Test
    void increaseRadioStationFromMaxWithConstructor() {
        Radio rad = new Radio(10);
        rad.setMinRadioStation(0);
        rad.setCurrentRadioStationByControl(9);

        rad.increaseRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////
// Тесты на уменьшение радио станции:
    @Test
    void decreaseRadioStationFromMin() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(0);

        rad.decreaseRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseRadioStationBorderAfterMin() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(1);

        rad.decreaseRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseRadioStationBorderBeforeMax() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(8);

        rad.decreaseRadioStation();
        int expected = 7;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    void decreaseRadioStationFromMax() {
        Radio rad = new Radio();
        rad.setMinRadioStation(0);
        rad.setMaxRadioStation(9);
        rad.setCurrentRadioStationByControl(9);

        rad.decreaseRadioStation();
        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    // Тест на ввод звука

    @Test
    void setVolumeBeforeMin() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(10);
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(-1);
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeMin() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(10);
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(0);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);


    }

    @Test
    void setVolumeAfterMin() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(10);
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(1);
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void setVolumeBeforeMax() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(10);
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(9);
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void setVolumeMax() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(10);
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setVolumeAfterMax() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(10);
        rad.setCurrentVolume(5);

        rad.setCurrentVolume(11);
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Тесты на увеличение звука


    @Test
    void increaseVolumeMin() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(100);
        rad.setCurrentVolume(0);

        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeAfterMin() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(100);
        rad.setCurrentVolume(1);

        rad.increaseVolume();
        int expected = 2;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeBeforeMax() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(100);
        rad.setCurrentVolume(99);

        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void increaseVolumeAfterMax() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(100);
        rad.setCurrentVolume(100);

        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Тесты на уменьшение звука:

    @Test
    void decreaseVolumeMin() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(100);
        rad.setCurrentVolume(0);

        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    void decreaseVolumeAfterMin() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(100);
        rad.setCurrentVolume(1);

        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeBeforeMax() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(100);
        rad.setCurrentVolume(99);

        rad.decreaseVolume();
        int expected = 98;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeMax() {
        Radio rad = new Radio();
        rad.setMinVolume(0);
        rad.setMaxVolume(100);
        rad.setCurrentVolume(100);

        rad.decreaseVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    // Тесты на указание текущей  станций с конструктором ///////////////////////////////////
    @Test
    void setNumberOfRadioStationByControlWithConstructor() {
        Radio rad = new Radio(

                20
        );

        rad.setCurrentRadioStationByControl(15);
        int expected = 15;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    // Тест на указания текущей станции://///////////////////////////////////////////////////////////////////

    @Test
    void setNumberOfRadioStation(){
        Radio rad = new Radio();
        rad.setMaxRadioStation(5);

        rad.setNumberOfRadioStationByControl(10);
        int expected = 9;
        int actual = rad.getMaxRadioStation();
        assertEquals(expected, actual);


    }

}