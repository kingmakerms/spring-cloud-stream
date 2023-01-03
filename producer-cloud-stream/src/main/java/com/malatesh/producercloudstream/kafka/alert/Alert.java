package com.malatesh.producercloudstream.kafka.alert;

public record Alert(String id, Integer level, String message) {
}
