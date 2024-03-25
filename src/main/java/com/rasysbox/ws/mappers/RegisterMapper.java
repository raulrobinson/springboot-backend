package com.rasysbox.ws.mappers;

import com.rasysbox.ws.dto.RegisterDto;
import com.rasysbox.ws.dto.SamDto;
import com.rasysbox.ws.dto.SomDto;
import com.rasysbox.ws.entity.RegisterEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.rasysbox.ws.utils.Shield.blindStr;

@Component
public class RegisterMapper {

    public static RegisterDto OcbpDtoFromOcbpEntity(RegisterEntity entity) {
        return RegisterDto.builder()
                .PPMCOAM(blindStr(entity.getPpmcoam()))
                .CDPPPAM(blindStr(entity.getCdpppam()))
                .PSIGLAM(blindStr(entity.getPsiglam()))
                .PO2FLAM(blindStr(entity.getPo2flam()))
                .PSIGRAM(blindStr(entity.getPsigram()))
                .PSIG1OM(blindStr(entity.getPsig1om()))
                .PO2G1OM(blindStr(entity.getPo2g1om()))
                .PSIG2OM(blindStr(entity.getPsig2om()))
                .PO2G2OM(blindStr(entity.getPo2g2om()))
                .PSIG3OM(blindStr(entity.getPsig3om()))
                .PO2G3OM(blindStr(entity.getPo2g3om()))
                .PO2G4OM(blindStr(entity.getPo2g3om()))
                .PSIG4OM(blindStr(entity.getPsig4om()))
                .PO2G4OM(blindStr(entity.getPo2g4om()))
                .PO2GFLO(blindStr(entity.getPo2gflo()))
                .PSIGFLO(blindStr(entity.getPsigflo()))
                .PSIGROM(blindStr(entity.getPsigrom()))
                .FECHA(blindStr(String.valueOf(entity.getFecha())))
                .build();
    }

    public static SamDto SamDtoFromOcbpEntity(RegisterEntity entity) {
        return SamDto.builder()
                .psiSam(blindStr(entity.getPsiglam()))
                .psiResSam(blindStr(entity.getPsigram()))
                .oxiSam(blindStr(entity.getPo2flam()))
                .monoCo(blindStr(entity.getPpmcoam()))
                .dewPoint(blindStr(entity.getCdpppam()))
                .date(blindStr(String.valueOf(entity.getFecha())))
                .build();
    }

    public static SomDto SomDtoFromOcbpEntity(RegisterEntity entity) {
        return SomDto.builder()
                .psiGen1(blindStr(entity.getPsig1om()))
                .oxiGen1(blindStr(entity.getPo2g1om()))
                .psiGen2(blindStr(entity.getPsig2om()))
                .oxiGen2(blindStr(entity.getPo2g2om()))
                .psiGen3(blindStr(entity.getPsig3om()))
                .oxiGen3(blindStr(entity.getPo2g3om()))
                .oxiGen4(blindStr(entity.getPo2g3om()))
                .psiGen4(blindStr(entity.getPsig4om()))
                .oxiGen4(blindStr(entity.getPo2g4om()))
                .oxiSom(blindStr(entity.getPo2gflo()))
                .psiSom(blindStr(entity.getPsigflo()))
                .psiResSom(blindStr(entity.getPsigrom()))
                .date(blindStr(String.valueOf(entity.getFecha())))
                .build();
    }

    public static List<RegisterDto> RegisterDtoListFromRegisterList(List<RegisterEntity> registerEntities) {
        List<RegisterDto> registerDtos = new ArrayList<>();
        for (RegisterEntity register : registerEntities) {
            registerDtos.add(RegisterDto.builder()
                    .PSIG1OM(blindStr(register.getPsig1om()))
                    .PO2G1OM(blindStr(register.getPo2g1om()))
                    .PSIG2OM(blindStr(register.getPsig2om()))
                    .PO2G2OM(blindStr(register.getPo2g2om()))
                    .PSIG3OM(blindStr(register.getPsig3om()))
                    .PO2G3OM(blindStr(register.getPo2g3om()))
                    .PO2G4OM(blindStr(register.getPo2g3om()))
                    .PSIG4OM(blindStr(register.getPsig4om()))
                    .PO2G4OM(blindStr(register.getPo2g4om()))
                    .PO2GFLO(blindStr(register.getPo2gflo()))
                    .PSIGFLO(blindStr(register.getPsigflo()))
                    .PSIGROM(blindStr(register.getPsigrom()))
                    .PSIGLAM(blindStr(register.getPsiglam()))
                    .PO2FLAM(blindStr(register.getPo2flam()))
                    .PPMCOAM(blindStr(register.getPpmcoam()))
                    .CDPPPAM(blindStr(register.getCdpppam()))
                    .PSIGRAM(blindStr(register.getPsigram()))
                    .FECHA(blindStr(String.valueOf(register.getFecha())))
                    .build());
        }

        return registerDtos;
    }
}
