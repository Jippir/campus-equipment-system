package edu.cit.azcona.jeffer.campusequipmentloan.service;
import java.time.LocalDate;
public interface PenaltyCalculator {
    double calculate(LocalDate dueDate, LocalDate returnDate);
}