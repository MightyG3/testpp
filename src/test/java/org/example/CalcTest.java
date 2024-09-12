package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcSummTest {
    @DisplayName("Проверка суммирования  ")
    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1,2,3", "-1,2,1", "0,0,0", "1, 1, 3"})
    @Tag("param")
    void summ(int a, int b, int expectedResult) {
        Calc sum = new Calc();
        int result = sum.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот результат");
    }
}
class CalcDiffTest {
    @DisplayName("Проверка вычитания ")
    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"5,2,3", "-5,10,-15", "0,0,0", "10, 11, 0"})
    @Tag("param")
    void diff(int a, int b, int expectedResult) {
        Calc diff = new Calc();
        int result = diff.diff(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот результат");
    }
}