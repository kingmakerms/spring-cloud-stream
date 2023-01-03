package com.malatesh.producercloudstream.rest.alert;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public record CreateAlertRequest(@Min(1) @Max(100) Integer level, @NotBlank String message) {
}
