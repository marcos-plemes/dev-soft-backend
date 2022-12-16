package br.com.devsoft.comum.utils;

import java.lang.reflect.ParameterizedType;

public final class GenericoUtil {
    
    private GenericoUtil() {}
    
    @SuppressWarnings("unchecked")
    public static <T> Class<T> retornarClasseDoDiamante(final Class<?> classe, final Integer posicaoDoArgumento) {
        return (Class<T>) ((ParameterizedType) classe.getGenericSuperclass()).getActualTypeArguments()[posicaoDoArgumento];
        
    }
    
}
