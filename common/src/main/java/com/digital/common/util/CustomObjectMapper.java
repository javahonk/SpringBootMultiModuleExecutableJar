package com.digital.common.util;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.NumberFormat;

@Component
public class CustomObjectMapper {

    private final ObjectMapper mapper;

    public CustomObjectMapper() {
        this(true);
    }

    public CustomObjectMapper(boolean indentOutput) {
        mapper = new ObjectMapper();
        if (indentOutput) {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
        }
        mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        mapper.registerModule(new SimpleModule().addSerializer(Double.class, new CustomDoubleSerializer()));
        mapper.registerModule(new SimpleModule().addSerializer(BigDecimal.class, new CustomBigDecimalSerializer()));
    }

    public <T> T jsonToObject(String json, Class<T> valueType) throws IOException {
        return mapper.readValue(json, valueType);
    }

    public <T> T jsonToObject(String json, TypeReference valueType) throws IOException {
        return (T) mapper.readValue(json, valueType);
    }

    public String objectToJson(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }

    public static class CustomDoubleSerializer extends JsonSerializer<Double> {
        @Override
        public void serialize(Double aDouble, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (aDouble != null) {
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setGroupingUsed(false);
                nf.setMaximumFractionDigits(15);
                jsonGenerator.writeString(nf.format(aDouble));
            }
        }
    }

    public static class CustomBigDecimalSerializer extends JsonSerializer<BigDecimal> {
        @Override
        public void serialize(BigDecimal aBigDecimal, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (aBigDecimal != null) {
                jsonGenerator.writeString(aBigDecimal.toPlainString());
            }
        }
    }
}
