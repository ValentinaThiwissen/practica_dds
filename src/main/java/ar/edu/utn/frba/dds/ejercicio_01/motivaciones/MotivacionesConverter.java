package ar.edu.utn.frba.dds.ejercicio_01.motivaciones;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
   @Converter(autoApply = true)
   public class MotivacionesConverter implements AttributeConverter <Motivacion, String> {
       @Override
       public String convertToDatabaseColumn(Motivacion tipo) {
           if (tipo instanceof BajarDePeso) {
               return "bajar de peso";}

           else if (tipo instanceof Mantener) {
               return "mantener";
           }

           else if (tipo instanceof Tonificar) {
               return "tonificar";
           }

           return null;
       }

       @Override
       public Motivacion convertToEntityAttribute(String dbData) {
           if ("bajar de peso".equals(dbData)) {
               return new BajarDePeso();
           } else if ("matener".equals(dbData)) {
               return new Mantener();
           } else if ("tonificar".equals(dbData)) {
               return new Tonificar();
           }
           return null;
       }
   }