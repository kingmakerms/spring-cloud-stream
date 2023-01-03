package com.malatesh.producercloudstream.rest.news;

import javax.validation.constraints.NotBlank;

public record CreateNewsRequest(@NotBlank String source, @NotBlank String title) {
}
