package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    //Станции
    @Test
    void shouldSetMaxOneArgStation() {
        Radio radio = new Radio(10);
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    void shouldSetNineArgStation() {
        Radio radio = new Radio(9);
        assertEquals(8, radio.getMaxStation());
    }

    @Test
    void shouldSetMaxNoArgsStation() {
        Radio radio = new Radio();

        assertEquals(9, radio.getMaxStation());
    }

    @Test
    void shouldSetMinNoArgsStation() {
        Radio radio = new Radio();

        assertEquals(0, radio.getMinStation());
    }

    @Test
    void shouldSetMinArgsStation() {
        Radio radio = new Radio();

        assertEquals(0, radio.getMinStation());
    }

    @Test
    void shouldSetCurrentArgsStation() {
        Radio radio = new Radio();

        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void shouldSetMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(20);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSetMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetUnderMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-12);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldUpStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.upStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldUpMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.upStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldDownStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.downStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldDownMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.downStation();
        assertEquals(9, radio.getCurrentStation());
    }

    //Громкость
    @Test
    void shouldSetMaxValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(100);
        assertEquals(100, radio.getMaxValume());
    }

    @Test
    void shouldGetMinValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(0);
        assertEquals(0, radio.getMinValume());
    }

    @Test
    void shouldSetCurrentValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(25);
        assertEquals(25, radio.getCurrentValume());
    }

    @Test
    void shouldSetMoreMaxValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(102);
        assertEquals(100, radio.getCurrentValume());
    }

    @Test
    void shouldSetMinValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(0);
        assertEquals(0, radio.getCurrentValume());
    }

    @Test
    void shouldSetUnderMinValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(-5);
        assertEquals(0, radio.getCurrentValume());
    }

    @Test
    void shouldUpValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(99);
        radio.upValume();
        assertEquals(100, radio.getCurrentValume());
    }

    @Test
    void shouldUpMaxValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(105);
        radio.upValume();
        assertEquals(100, radio.getCurrentValume());
    }

    @Test
    void shouldDownValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(1);
        radio.downValume();
        assertEquals(0, radio.getCurrentValume());
    }

    @Test
    void shouldDownMinValume() {
        Radio radio = new Radio();
        radio.setCurrentValume(-5);
        radio.downValume();
        assertEquals(0, radio.getCurrentValume());
    }

}