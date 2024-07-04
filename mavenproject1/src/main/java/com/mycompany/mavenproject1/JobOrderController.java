package com.mycompany.mavenproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/joborder")
public class JobOrderController {

    @Autowired
    private MangoDBConnection mangoDBConnection;

    @PostMapping("/insert")
    public String insertData(@RequestBody JOVar jobOrder) {
        mangoDBConnection.insertData(jobOrder);
        return "Job Order inserted successfully";
    }

    @GetMapping("/jobcode")
    public String getJobCode(@RequestParam String jobOrderType) {
        JOVar jobOrder = new JOVar();
        jobOrder.setJobOrderType(jobOrderType);
        return mangoDBConnection.jobCode(jobOrder);
    }

    @GetMapping("/status")
    public String getStatusByJobCode(@RequestParam String jobCode) {
        // Implement a method to fetch status by job code if required
        return "Status fetching not implemented";
    }

    @PostMapping("/updateStatus")
    public String updateStatusByJobCode(@RequestParam String jobCode, @RequestParam String status) {
        mangoDBConnection.updateStatusByJobCode(jobCode, status);
        return "Status updated successfully";
    }
    
    public String updateStatus(@RequestParam String jobCode, @RequestParam String status) {
        mangoDBConnection.updateStatusByJobCode(jobCode, status);
        return "Status updated successfully for job code: " + jobCode;
    }
}
