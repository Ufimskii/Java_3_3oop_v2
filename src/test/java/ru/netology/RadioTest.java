package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    //Stations Tests
    @Test //1
    public void shouldUpCurrentStation() {
        radio.setCurrentStation(8);
        radio.upStation();
        assertEquals(9, radio.getCurrentStation());

    }
    @Test//2
    public void shouldUpMaxStation() {
        radio.setCurrentStation(9);
        radio.upStation();
        assertEquals(0, radio.getCurrentStation());

    }
    @Test //3
    public void shouldFalseOneCurrentStation() {
        radio.setCurrentStation(-2);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test //4
    public void shouldFalseTwoCurrentStation() {
        radio.setCurrentStation(15);
        assertEquals(0, radio.getCurrentStation());

    }


    @Test//5
    public void shouldDownCurrentStation() {
        radio.setCurrentStation(1);
        radio.downStation();
        assertEquals(0, radio.getCurrentStation());

    }


    @Test//6
    public void shouldDownMinStation() {
        radio.setCurrentStation(0);
        radio.downStation();
        assertEquals(9, radio.getCurrentStation());

    }


    //Volume tests
    @Test//1
    public void shouldUpCurrentValume() {
        radio.setCurrentValume(9);
        radio.upVolume();
        assertEquals(10, radio.getCurrentValume());

    }


    @Test//2
    public void shouldUpMaxValume() {
        radio.setCurrentValume(10);
        radio.upVolume();
        assertEquals(10, radio.getCurrentValume());

    }


    @Test//3
    public void shouldDownCurrentValume() {
        radio.setCurrentValume(1);
        radio.downVolume();
        assertEquals(0, radio.getCurrentValume());

    }


    @Test//4
    public void shouldDownMinValume() {
        radio.setCurrentValume(0);
        radio.downVolume();
        assertEquals(0, radio.getCurrentValume());

    }

}