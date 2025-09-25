package edu.cit.azcona.jeffer.campusequipmentloan.web;
import edu.cit.azcona.jeffer.campusequipmentloan.dto.EquipmentDTO;
import edu.cit.azcona.jeffer.campusequipmentloan.service.LoanService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {
    private final LoanService loanService;
    public EquipmentController(LoanService loanService) {
        this.loanService = loanService;
    }
    @GetMapping("/available")
    public List<EquipmentDTO> listAvailable() {
        return loanService.listAvailableEquipment();
    }
}