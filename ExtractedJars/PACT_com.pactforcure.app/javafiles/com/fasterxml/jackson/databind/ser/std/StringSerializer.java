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
//			NonTypedScalarSerializerBase

public final class StringSerializer extends NonTypedScalarSerializerBase
{

	public StringSerializer()
	{
		super(java/lang/String, false);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <Class String>
	//    2    3:iconst_0        
	//    3    4:invokespecial   #17  <Method void NonTypedScalarSerializerBase(Class, boolean)>
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
		serializerprovider = ((SerializerProvider) ((String)obj));
	//    0    0:aload_2         
	//    1    1:checkcast       #14  <Class String>
	//    2    4:astore_1        
		return serializerprovider == null || ((String) (serializerprovider)).length() == 0;
	//    3    5:aload_1         
	//    4    6:ifnull          16
	//    5    9:aload_1         
	//    6   10:invokevirtual   #40  <Method int String.length()>
	//    7   13:ifne            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isEmpty(Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #14  <Class String>
	//    2    4:astore_1        
		return obj == null || ((String) (obj)).length() == 0;
	//    3    5:aload_1         
	//    4    6:ifnull          16
	//    5    9:aload_1         
	//    6   10:invokevirtual   #40  <Method int String.length()>
	//    7   13:ifne            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeString((String)obj);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:checkcast       #14  <Class String>
	//    3    5:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	private static final long serialVersionUID = 1L;
}
