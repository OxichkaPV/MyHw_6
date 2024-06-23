package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class GraphServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")

    void ParameterTest(int income, int expenses, int threshold, int expected){
        GraphService  service = new GraphService();
        int actual = service.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, actual);
    }
}
