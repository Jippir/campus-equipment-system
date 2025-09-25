package edu.cit.azcona.jeffer.campusequipmentloan.repository;
import edu.cit.azcona.jeffer.campusequipmentloan.entity.Loan;
import edu.cit.azcona.jeffer.campusequipmentloan.entity.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByStudentIdAndStatus(Long studentId, LoanStatus status);
}