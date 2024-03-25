package com.rasysbox.ws.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "`remote-ocbp`")
public class RegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 10)
    @NotNull
    @Column(name = "PSIGRAM", nullable = false, length = 10)
    private String psigram;

    @Size(max = 10)
    @NotNull
    @Column(name = "PSIGLAM", nullable = false, length = 10)
    private String psiglam;

    @Size(max = 10)
    @NotNull
    @Column(name = "PO2FLAM", nullable = false, length = 10)
    private String po2flam;

    @Size(max = 10)
    @NotNull
    @Column(name = "CDPPPAM", nullable = false, length = 10)
    private String cdpppam;

    @Size(max = 10)
    @NotNull
    @Column(name = "PPMCOAM", nullable = false, length = 10)
    private String ppmcoam;

    @Size(max = 10)
    @NotNull
    @Column(name = "PSIG1OM", nullable = false, length = 10)
    private String psig1om;

    @Size(max = 10)
    @NotNull
    @Column(name = "PSIG2OM", nullable = false, length = 10)
    private String psig2om;

    @Size(max = 10)
    @NotNull
    @Column(name = "PSIG3OM", nullable = false, length = 10)
    private String psig3om;

    @Size(max = 10)
    @NotNull
    @Column(name = "PSIG4OM", nullable = false, length = 10)
    private String psig4om;

    @Size(max = 10)
    @NotNull
    @Column(name = "PO2G1OM", nullable = false, length = 10)
    private String po2g1om;

    @Size(max = 10)
    @NotNull
    @Column(name = "PO2G2OM", nullable = false, length = 10)
    private String po2g2om;

    @Size(max = 10)
    @NotNull
    @Column(name = "PO2G3OM", nullable = false, length = 10)
    private String po2g3om;

    @Size(max = 10)
    @NotNull
    @Column(name = "PO2G4OM", nullable = false, length = 10)
    private String po2g4om;

    @Size(max = 10)
    @NotNull
    @Column(name = "PSIGFLO", nullable = false, length = 10)
    private String psigflo;

    @Size(max = 10)
    @NotNull
    @Column(name = "PO2GFLO", nullable = false, length = 10)
    private String po2gflo;

    @Size(max = 10)
    @NotNull
    @Column(name = "PSIGROM", nullable = false, length = 10)
    private String psigrom;

    @NotNull
    @Column(name = "FECHA", nullable = false)
    private Instant fecha;

}