package com.rasysbox.ws.services;

import com.rasysbox.ws.dto.RegisterDto;
import com.rasysbox.ws.dto.SamDto;
import com.rasysbox.ws.dto.SomDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RegisterService {

    ResponseEntity<Long> count();

    ResponseEntity<RegisterDto> last();

    ResponseEntity<SamDto> sam();

    ResponseEntity<SomDto> som();

    ResponseEntity<List<RegisterDto>> findLastTenRegisters();
}
