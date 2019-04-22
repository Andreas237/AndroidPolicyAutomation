// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public final class StringSerializer extends StdScalarSerializer
{

	public StringSerializer()
	{
		super(java/lang/String, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <Class String>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #17  <Method void StdScalarSerializer(Class, boolean)>
	//    4    7:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitStringFormat(jsonformatvisitorwrapper, javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #25  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType)>
	//    4    6:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #34  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return ((String)obj).length() == 0;
	//    0    0:aload_2         
	//    1    1:checkcast       #14  <Class String>
	//    2    4:invokevirtual   #40  <Method int String.length()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeString((String)obj);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class String>
	//    3    5:invokevirtual   #50  <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		jsongenerator.writeString((String)obj);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class String>
	//    3    5:invokevirtual   #50  <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	private static final long serialVersionUID = 1L;
}
