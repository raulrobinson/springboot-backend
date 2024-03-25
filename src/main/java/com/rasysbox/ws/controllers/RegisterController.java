package com.rasysbox.ws.controllers;

import com.rasysbox.ws.dto.RegisterDto;
import com.rasysbox.ws.dto.SamDto;
import com.rasysbox.ws.dto.SomDto;
import com.rasysbox.ws.services.RegisterService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${controller.properties.base-path}")
@Tag(name = "OCBP Data", description = "Datos maestros de la database remota.")
public class RegisterController {

    private final RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @GetMapping
    @Operation(summary = "Obtain last value", description = "Obtain a last value reported.")
    public ResponseEntity<RegisterDto> last() {
        return registerService.last();
    }

    @GetMapping("sam")
    @Operation(summary = "sam values", description = "Obtain a last value reported for SAM.")
    public ResponseEntity<SamDto> sam() {
        return registerService.sam();
    }

    @GetMapping("som")
    @Operation(summary = "som values", description = "Obtain a last value reported for SOM.")
    public ResponseEntity<SomDto> som() {
        return registerService.som();
    }

    @GetMapping("/last-ten")
    @Operation(summary = "last ten registers", description = "Obtain a last ten values reported.")
    public ResponseEntity<List<RegisterDto>> findLastTenRegisters() {
        return registerService.findLastTenRegisters();
    }

//    @GetMapping("/count")
//    @Operation(summary = "Total Count", description = "Total count of registers.")
//    public ResponseEntity<Long> count() {
//        return registerService.count();
//    }

}
