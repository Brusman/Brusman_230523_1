package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class CalcRestTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Rest.csv")
    public void test(int exMonths, int income, int expenses, int threshold) {
        CalcRest service = new CalcRest();
        int actMonths = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(exMonths, actMonths);
    }

}
