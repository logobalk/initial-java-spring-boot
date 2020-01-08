package com.siampharm.core.utility;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.common.base.Strings;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@JsonComponent
public class DateConvertor {
    private static final ThreadLocal<SimpleDateFormat> sdf =
            ThreadLocal.<SimpleDateFormat>withInitial(
                    () -> {return new SimpleDateFormat("yyyy-MM-dd HH:mm a z");});

    public static class Serialize extends JsonSerializer<Timestamp> {
        public void serialize(Timestamp value, JsonGenerator jgen, SerializerProvider provider) {
            System.out.println("==========================Serialize============================");
            if (value == null) {
//                jgen.writeNull();
            }
            else {
                try {
                    jgen.writeString(sdf.get().format(value));
                }catch (Exception e){
                    e.printStackTrace();
                }

            }
        }
    }

    public static class Deserialize extends JsonDeserializer<Timestamp> {
        public Timestamp deserialize(JsonParser jp, DeserializationContext ctxt)  {
            String dateAsString = null;
            try {
                dateAsString = jp.getText();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (Strings.isNullOrEmpty(dateAsString)) {
                    return null;
                }
                else {
                    return new Timestamp(sdf.get().parse(dateAsString).getTime());
                }
            }
            catch (Exception pe) {
                pe.printStackTrace();
            }
            return null;
        }
    }
}
