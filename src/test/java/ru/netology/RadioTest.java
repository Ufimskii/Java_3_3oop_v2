package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //Изменение громкости
    @Test
    public void shouldChangeValumeNotValidButton() {
        Radio radio = new Radio();
        radio.setCurrentValume(10);
        radio.buttonChangeVolume("!");
        assertEquals(radio.getCurrentValume(), 10);
    }

    @Test
    public void shouldUpMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentValume(100);
        radio.buttonChangeVolume("+");
        assertEquals(radio.getCurrentValume(), 100);
    }

    @Test
    public void shouldDownMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentValume(0);
        radio.buttonChangeVolume("-");
        assertEquals(radio.getCurrentValume(), 0);
    }

    @Test
    public void shouldUpMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentValume(0);
        radio.buttonChangeVolume("+");
        assertEquals(radio.getCurrentValume(), 1);
    }

    @Test
    public void shouldDownCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentValume(10);
        radio.buttonChangeVolume("-");
        assertEquals(radio.getCurrentValume(), 9);
    }
    //Изменение станций
    @Test
    public void shouldChangeRadioStationNotValidButton() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.buttonChangeRadioStation("nex");
        assertEquals(radio.getCurrentStation(), 9);
    }

    @Test
    public void shouldUpMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.buttonChangeRadioStation("next");
        assertEquals(radio.getCurrentStation(), 0);
    }

    @Test
    public void shouldDowmMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.buttonChangeRadioStation("prev");
        assertEquals(radio.getCurrentStation(), 9);
    }

    @Test
    public void shouldUpCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.buttonChangeRadioStation("next");
        assertEquals(radio.getCurrentStation(), 1);
    }

    @Test
    public void shouldDownMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.buttonChangeRadioStation("prev");
        assertEquals(radio.getCurrentStation(), 8);
    }

    @Test
    public void shouldChoiceRadioStation() {
        Radio radio = new Radio();
        radio.buttonChangeRadioStation("7");
        assertEquals(radio.getCurrentStation(), 7);
    }

    @Test
    public void shouldChoiceNotValidStation() {
        Radio radio = new Radio();
        radio.buttonChangeRadioStation("10");
        assertEquals(radio.getCurrentStation(), 0);
    }
}