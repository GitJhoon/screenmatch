package br.com.jhoonk.screenmatch.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    public <T> T obterDados(String json, Class<T> classe){
        try {
            return mapper.readValue(json, classe);
        }
        catch (JsonProcessingException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
