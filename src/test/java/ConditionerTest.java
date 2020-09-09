import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25); // установим максимальную температуру 25 градусов
        conditioner.setCurrentTemperature(20); // установим текущую температуру 20 градусов
        int current = conditioner.getCurrentTemperature(); // в переменную current сохраним текущую температуру 20 градусов
        int expected = conditioner.getCurrentTemperature()+1; // в переменную expected сохраним ожидаемую температуру 21 градус после вызова метода increaseCurrentTemperature
        conditioner.increaseCurrentTemperature(current); // вызовем метод увеличения текущей температуры
        assertEquals(expected, conditioner.getCurrentTemperature()); // сравним ожидаемое значение текущей температуры 21 со значением текущей температуры после вызова метода increaseCurrentTemperature
    }

    @Test
    void increaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25); // установим максимальную температуру 25 градусов
        conditioner.setCurrentTemperature(25); // установим текущую температуру, равную максимальной, то есть 25 градусов
        int current = conditioner.getCurrentTemperature(); // в переменную current сохраним текущую температуру 25 градусов
        int expected = conditioner.getCurrentTemperature(); // в переменную expected сохраним ожидаемую температуру 25 градус после вызова метода increaseCurrentTemperature
        conditioner.increaseCurrentTemperature(current); // вызовем метод увеличения текущей температуры
        assertEquals(expected, conditioner.getCurrentTemperature()); // сравним ожидаемое значение текущей температуры 21 со значением текущей температуры после вызова метода increaseCurrentTemperature
    }

    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0); // установим минимальную температуру 0 градусов
        conditioner.setCurrentTemperature(10); // установим текущую температуру 10 градусов
        int current = conditioner.getCurrentTemperature(); // в переменную current сохраним текущую температуру 10 градусов
        int expected = conditioner.getCurrentTemperature()-1; // в переменную expected сохраним ожидаемую температуру 9 градус после вызова метода decreaseCurrentTemperature
        conditioner.decreaseCurrentTemperature(current); // вызовем метод уменьшения текущей температуры
        assertEquals(expected, conditioner.getCurrentTemperature()); // сравним ожидаемое значение текущей температуры 9 со значением текущей температуры после вызова метода decreaseCurrentTemperature
    }

    @Test
    void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0); // установим минимальную температуру 0 градусов
        conditioner.setCurrentTemperature(0); // установим текущую температуру 0 градусов
        int current = conditioner.getCurrentTemperature(); // в переменную current сохраним текущую температуру 0 градусов
        int expected = conditioner.getCurrentTemperature(); // в переменную expected сохраним ожидаемую температуру 0 градус после вызова метода decreaseCurrentTemperature
        conditioner.decreaseCurrentTemperature(current); // вызовем метод уменьшения текущей температуры
        assertEquals(expected, conditioner.getCurrentTemperature()); // сравним ожидаемое значение текущей температуры 9 со значением текущей температуры после вызова метода decreaseCurrentTemperature
    }

}