package com.siampharm.core.converter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateConverter {

    public static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

    //java.util.Date
    public static class DateSerializer extends JsonSerializer<LocalDateTime> {
        @Override
        public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(format.format(value));
        }
    }

    public static class DateDeserializer extends JsonDeserializer<LocalDateTime> {
        @Override
        public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return LocalDateTime.ofInstant(Instant.ofEpochSecond(p.getLongValue()), ZoneId.systemDefault());
        }
    }

    //java.sql.Timestamp
    public static class TimestampSerializer extends JsonSerializer<Timestamp> {
        @Override
        public void serialize(Timestamp value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString(format.format(value));
        }
    }

    public static class TimestampDeserializer extends JsonDeserializer<Timestamp> {
        @Override
        public Timestamp deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return new Timestamp(p.getLongValue());
        }
    }

    //java.util.Calendar
    public static class CalendarSerializer extends JsonSerializer<Calendar> {
        @Override
        public void serialize(Calendar value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            gen.writeString("Correct Format");
        }
    }

    public static class CalendarDeserializer extends JsonDeserializer<Calendar> {
        @Override
        public Calendar deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            java.util.Date date = new java.util.Date();
            date.setTime(p.getLongValue());
            Calendar cal = new GregorianCalendar();
            cal.setTime(date);
            return cal;
        }
    }
}
