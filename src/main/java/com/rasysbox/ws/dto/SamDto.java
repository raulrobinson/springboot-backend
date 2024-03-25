package com.rasysbox.ws.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SamDto {
    private String psiSam;
    private String oxiSam;
    private String monoCo;
    private String dewPoint;
    private String psiResSam;
    private String date;
}
