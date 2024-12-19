package com.byAmina;

public class OutboxEventDTO {
    private String eventType;
    private String payload;

    public String getPayload() {
        return payload;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public OutboxEventDTO(String eventType, String payload) {
        this.eventType = eventType;
        this.payload = payload;
    }

    public OutboxEventDTO() {
    }

    @Override
    public String toString() {
        return "OutboxEventDTO{" +
                "eventType='" + eventType + '\'' +
                ", payload='" + payload + '\'' +
                '}';
    }
}
