package tech.tresearchgroup.fpcalcschema.model;

import com.jsoniter.annotation.JsonProperty;

public class FPCalcOutput {
	@JsonProperty("duration")
	private double duration;

	@JsonProperty("fingerprint")
	private String fingerprint;
}