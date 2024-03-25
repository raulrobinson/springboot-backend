package com.rasysbox.ws.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
	@JsonProperty("PSIG1OM")
	private String PSIG1OM;

	@JsonProperty("PO2G1OM")
	private String PO2G1OM;

	@JsonProperty("PSIG2OM")
	private String PSIG2OM;

	@JsonProperty("PO2G2OM")
	private String PO2G2OM;

	@JsonProperty("PSIG3OM")
	private String PSIG3OM;

	@JsonProperty("PO2G3OM")
	private String PO2G3OM;

	@JsonProperty("PSIG4OM")
	private String PSIG4OM;

	@JsonProperty("PO2G4OM")
	private String PO2G4OM;

	@JsonProperty("PSIGFLO")
	private String PSIGFLO;

	@JsonProperty("PO2GFLO")
	private String PO2GFLO;

	@JsonProperty("PSIGROM")
	private String PSIGROM;

	@JsonProperty("PSIGLAM")
	private String PSIGLAM;

	@JsonProperty("PO2FLAM")
	private String PO2FLAM;

	@JsonProperty("PPMCOAM")
	private String PPMCOAM;

	@JsonProperty("CDPPPAM")
	private String CDPPPAM;

	@JsonProperty("PSIGRAM")
	private String PSIGRAM;

	@JsonProperty("FECHA")
	private String FECHA;
}