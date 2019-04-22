// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			TreeTraversingParser

public abstract class BaseJsonNode extends JsonNode
	implements JsonSerializable
{

	protected BaseJsonNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void JsonNode()>
	//    2    4:return          
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException;

	public JsonParser traverse()
	{
		return ((JsonParser) (new TreeTraversingParser(((JsonNode) (this)))));
	//    0    0:new             #23  <Class TreeTraversingParser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #26  <Method void TreeTraversingParser(JsonNode)>
	//    4    8:areturn         
	}

	public JsonParser traverse(ObjectCodec objectcodec)
	{
		return ((JsonParser) (new TreeTraversingParser(((JsonNode) (this)), objectcodec)));
	//    0    0:new             #23  <Class TreeTraversingParser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #30  <Method void TreeTraversingParser(JsonNode, ObjectCodec)>
	//    5    9:areturn         
	}
}
