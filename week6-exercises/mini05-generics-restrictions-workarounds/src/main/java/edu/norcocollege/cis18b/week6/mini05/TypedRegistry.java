package edu.norcocollege.cis18b.week6.mini05;

import java.util.HashMap;
import java.util.Map;

/*
 * Stores values by key and retrieves them using Class<T> tokens.
*/
public class TypedRegistry {

    private final Map<String, Object> values = new HashMap<>();

    /*
     * Stores a value under the given key.
     *
     * @param key registry key
     * @param value value to store
     * @param <T> type of value
     */
    public <T> void put(String key, T value) {
        values.put(key, value);
    }

    /*
     * Retrieves a value using a Class<T> token for a safe cast.
     *
     * @param key registry key
     * @param token runtime class token
     * @param <T> expected type
     * @return value cast to type T
    */
    public <T> T get(String key, Class<T> token) {
        Object value = values.get(key);
        return token.cast(value);
    }
}
