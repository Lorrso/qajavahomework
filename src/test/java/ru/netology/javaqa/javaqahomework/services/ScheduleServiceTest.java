package ru.netology.javaqa.javaqahomework.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
public class ScheduleServiceTest {
      @ParameterizedTest
      @CsvFileSource(files="src/test/resources/schedule.csv")
      public void calculateTheNumberOfRestDays(int expected, int income, int expenses, int threshold) {
            ScheduleService service = new ScheduleService();

            int actual = service.calculate(income, expenses, threshold);

            Assertions.assertEquals(expected, actual);
      }
}
