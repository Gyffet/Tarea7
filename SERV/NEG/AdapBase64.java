package NEG;

import java.lang.reflect.Type;
import com.google.gson.*;
import java.util.Base64;

public class AdapBase64 implements JsonSerializer<byte[]>,JsonDeserializer<byte[]>
{
	public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
	{
		String s = json.getAsString().replaceAll("\\ ", "+");
		return Base64.getDecoder().decode(s);
	}

	public JsonElement serialize(byte[] src,Type typeOfSrc, JsonSerializationContext context)
	{
		return new JsonPrimitive(Base64.getEncoder().encodeToString(src));
	}
}
