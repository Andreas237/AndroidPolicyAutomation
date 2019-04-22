// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class ToStringSerializer extends StdSerializer
{

	public ToStringSerializer()
	{
		super(java/lang/Object);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <Class Object>
	//    2    3:invokespecial   #21  <Method void StdSerializer(Class)>
	//    3    6:return          
	}

	public ToStringSerializer(Class class1)
	{
		super(class1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #24  <Method void StdSerializer(Class, boolean)>
	//    4    6:return          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitStringFormat(jsonformatvisitorwrapper, javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #33  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType)>
	//    4    6:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		return ((JsonNode) (createSchemaNode("string", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "string">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #42  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
	//    4    7:areturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return obj.toString().isEmpty();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #48  <Method String Object.toString()>
	//    2    4:invokevirtual   #53  <Method boolean String.isEmpty()>
	//    3    7:ireturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeString(obj.toString());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method String Object.toString()>
	//    3    5:invokevirtual   #63  <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(obj, JsonToken.VALUE_STRING));
	//    0    0:aload           4
	//    1    2:aload_2         
	//    2    3:aload           4
	//    3    5:aload_1         
	//    4    6:getstatic       #71  <Field JsonToken JsonToken.VALUE_STRING>
	//    5    9:invokevirtual   #77  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    6   12:invokevirtual   #81  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    7   15:astore          5
		serialize(obj, jsongenerator, serializerprovider);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokevirtual   #83  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   13   24:aload           4
	//   14   26:aload_2         
	//   15   27:aload           5
	//   16   29:invokevirtual   #86  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   17   32:pop             
	//   18   33:return          
	}

	public static final ToStringSerializer instance = new ToStringSerializer();

	static 
	{
	//    0    0:new             #2   <Class ToStringSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void ToStringSerializer()>
	//    3    7:putstatic       #15  <Field ToStringSerializer instance>
	//*   4   10:return          
	}
}
