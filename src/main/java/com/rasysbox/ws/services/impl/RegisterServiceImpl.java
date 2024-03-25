package com.rasysbox.ws.services.impl;

import com.rasysbox.ws.dto.RegisterDto;
import com.rasysbox.ws.dto.SamDto;
import com.rasysbox.ws.dto.SomDto;
import com.rasysbox.ws.repository.RegisterRepository;
import com.rasysbox.ws.services.RegisterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

import static com.rasysbox.ws.mappers.RegisterMapper.*;
import static com.rasysbox.ws.utils.Utilities.latency;

@Service
public class RegisterServiceImpl implements RegisterService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterServiceImpl.class);

    private final RegisterRepository registerRepository;

    @Autowired
    public RegisterServiceImpl(RegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    @Override
    public ResponseEntity<Long> count() {
        try {
            var start = System.currentTimeMillis();
            var req = registerRepository.count();
            var end = System.currentTimeMillis();
            var latency = latency(start, end);

            LOGGER.info("total registers count: {} in {} ms", req, latency);
            return new ResponseEntity<>(req, HttpStatus.OK);
        } catch (ResourceAccessException e) {
            LOGGER.error("Access Error: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<RegisterDto> last() {
        try {
            var start = System.currentTimeMillis();
            var req = registerRepository.findFirstByOrderByFechaDesc();
            var end = System.currentTimeMillis();
            var latency = latency(start, end);

            LOGGER.info("register id: {} in {} ms", req.getId(), latency);
            return new ResponseEntity<>(OcbpDtoFromOcbpEntity(req), HttpStatus.OK);
        } catch (ResourceAccessException e) {
            LOGGER.error("Access Error: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<SamDto> sam() {
        try {
            var start = System.currentTimeMillis();
            var req = registerRepository.findFirstByOrderByFechaDesc();
            var end = System.currentTimeMillis();
            var latency = latency(start, end);

            LOGGER.info("register SAM id: {} in {} ms", req.getId(), latency);
            return new ResponseEntity<>(SamDtoFromOcbpEntity(req), HttpStatus.OK);
        } catch (ResourceAccessException e) {
            LOGGER.error("Access Error: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<SomDto> som() {
        try {
            var start = System.currentTimeMillis();
            var req = registerRepository.findFirstByOrderByFechaDesc();
            var end = System.currentTimeMillis();
            var latency = latency(start, end);

            LOGGER.info("register SOM id: {} in {} ms", req.getId(), latency);
            return new ResponseEntity<>(SomDtoFromOcbpEntity(req), HttpStatus.OK);
        } catch (ResourceAccessException e) {
            LOGGER.error("Access Error: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<RegisterDto>> findLastTenRegisters() {
        try {
            var start = System.currentTimeMillis();
            var req = registerRepository.findLastTenRegisters();
            var end = System.currentTimeMillis();
            var latency = latency(start, end);

            LOGGER.info("registers result count: {} in {} ms", req.size(), latency);
            return new ResponseEntity<>(RegisterDtoListFromRegisterList(req), HttpStatus.OK);
        } catch (ResourceAccessException e) {
            LOGGER.error("Access Error: {}", e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

}
