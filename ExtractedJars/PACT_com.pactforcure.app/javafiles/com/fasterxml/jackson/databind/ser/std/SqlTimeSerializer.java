// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.Time;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class SqlTimeSerializer extends StdScalarSerializer
{

	public SqlTimeSerializer()
	{
		super(java/sql/Time);
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <Class Time>
	//    2    3:invokespecial   #13  <Method void StdScalarSerializer(Class)>
	//    3    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitStringFormat(jsonformatvisitorwrapper, javatype, JsonValueFormat.DATE_TIME);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #24  <Field JsonValueFormat JsonValueFormat.DATE_TIME>
	//    4    6:invokevirtual   #28  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType, JsonValueFormat)>
	//    5    9:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #37  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Time)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #10  <Class Time>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #44  <Method void serialize(Time, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(Time time, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeString(time.toString());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method String Time.toString()>
	//    3    5:invokevirtual   #54  <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}
}
