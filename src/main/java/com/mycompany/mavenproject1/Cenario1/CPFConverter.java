package com.mycompany.mavenproject1.Cenario1;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author murillo
 */
@Converter
public class CPFConverter implements AttributeConverter<CPF, String>{
    
    @Override
    public String convertToDatabaseColumn(CPF attribute) {
        return attribute.numero;
    }

    @Override
    public CPF convertToEntityAttribute(String dbData) {
        return new CPF(dbData);
    }
    
}
