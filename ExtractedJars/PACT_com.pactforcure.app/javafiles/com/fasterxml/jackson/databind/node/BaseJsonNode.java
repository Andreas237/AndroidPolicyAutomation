// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			MissingNode, TreeTraversingParser

public abstract class BaseJsonNode extends JsonNode
	implements JsonSerializable
{

	protected BaseJsonNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void JsonNode()>
	//    2    4:return          
	}

	public abstract JsonToken asToken();

	public final JsonNode findPath(String s)
	{
		JsonNode jsonnode = findValue(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method JsonNode findValue(String)>
	//    3    5:astore_2        
		s = ((String) (jsonnode));
	//    4    6:aload_2         
	//    5    7:astore_1        
		if(jsonnode == null)
	//*   6    8:aload_2         
	//*   7    9:ifnonnull       16
			s = ((String) (MissingNode.getInstance()));
	//    8   12:invokestatic    #24  <Method MissingNode MissingNode.getInstance()>
	//    9   15:astore_1        
		return ((JsonNode) (s));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public abstract int hashCode();

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException;

	public abstract void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonProcessingException;

	public JsonParser traverse()
	{
		return ((JsonParser) (new TreeTraversingParser(((JsonNode) (this)))));
	//    0    0:new             #40  <Class TreeTraversingParser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method void TreeTraversingParser(JsonNode)>
	//    4    8:areturn         
	}

	public JsonParser traverse(ObjectCodec objectcodec)
	{
		return ((JsonParser) (new TreeTraversingParser(((JsonNode) (this)), objectcodec)));
	//    0    0:new             #40  <Class TreeTraversingParser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #47  <Method void TreeTraversingParser(JsonNode, ObjectCodec)>
	//    5    9:areturn         
	}
}
