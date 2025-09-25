package edu.cit.azcona.jeffer.campusequipmentloan.repository;
import edu.cit.azcona.jeffer.campusequipmentloan.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    List<Equipment> findByAvailableTrue();
}