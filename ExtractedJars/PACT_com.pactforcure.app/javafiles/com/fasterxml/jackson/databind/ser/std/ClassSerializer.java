// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class ClassSerializer extends StdScalarSerializer
{

	public ClassSerializer()
	{
		super(java/lang/Class, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <Class Class>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #12  <Method void StdScalarSerializer(Class, boolean)>
	//    4    7:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitStringFormat(jsonformatvisitorwrapper, javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #20  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType)>
	//    4    6:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #25  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #29  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public void serialize(Class class1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeString(class1.getName());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #37  <Method String Class.getName()>
	//    3    5:invokevirtual   #43  <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Class)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #9   <Class Class>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #48  <Method void serialize(Class, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}
}
