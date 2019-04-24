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

public final class BooleanSerializer extends NonTypedScalarSerializerBase
{

	public BooleanSerializer(boolean flag)
	{
		super(java/lang/Boolean);
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <Class Boolean>
	//    2    3:invokespecial   #19  <Method void NonTypedScalarSerializerBase(Class)>
		_forPrimitive = flag;
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:putfield        #21  <Field boolean _forPrimitive>
	//    6   11:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			jsonformatvisitorwrapper.expectBooleanFormat(javatype);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #32  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor JsonFormatVisitorWrapper.expectBooleanFormat(JavaType)>
	//    5   11:pop             
	//    6   12:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		boolean flag;
		if(!_forPrimitive)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean _forPrimitive>
	//*   2    4:ifne            17
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_3        
		else
	//*   5    9:aload_0         
	//*   6   10:ldc1            #37  <String "boolean">
	//*   7   12:iload_3         
	//*   8   13:invokevirtual   #41  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//*   9   16:areturn         
			flag = false;
	//   10   17:iconst_0        
	//   11   18:istore_3        
		return ((JsonNode) (createSchemaNode("boolean", flag)));
	//*  12   19:goto            9
	}

	public void serialize(Boolean boolean1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeBoolean(boolean1.booleanValue());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #49  <Method boolean Boolean.booleanValue()>
	//    3    5:invokevirtual   #54  <Method void JsonGenerator.writeBoolean(boolean)>
	//    4    8:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Boolean)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #16  <Class Boolean>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #57  <Method void serialize(Boolean, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	private static final long serialVersionUID = 1L;
	protected final boolean _forPrimitive;
}
