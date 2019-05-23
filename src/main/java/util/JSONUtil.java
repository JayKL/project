package util;


import javax.enterprise.inject.Default;

import com.fasterxml.jackson.databind.ObjectMapper;
@Default
public class JSONUtil {

	public JSONUtil() {
	}
	
	private ObjectMapper mapper = new ObjectMapper();
	
	public String toJSON(Object obj) {
		try {
			return this.mapper.writeValueAsString(obj);
		} catch (Exception E) {
			System.out.println(E);
			return null;
		}
	}
	
	public <T> T fromJSON(String json, Class<T> clazz) {
		try {
			return this.mapper.readValue(json, clazz);
		} catch (Exception E) {
			System.out.println(E);
			return null;
		}
	}
}
