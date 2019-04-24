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
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		else
			return obj.toString().isEmpty();
	//    4    6:aload_2         
	//    5    7:invokevirtual   #48  <Method String Object.toString()>
	//    6   10:invokevirtual   #53  <Method boolean String.isEmpty()>
	//    7   13:ireturn         
	}

	public boolean isEmpty(Object obj)
	{
		return isEmpty(((SerializerProvider) (null)), obj);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #57  <Method boolean isEmpty(SerializerProvider, Object)>
	//    4    6:ireturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeString(obj.toString());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #48  <Method String Object.toString()>
	//    3    5:invokevirtual   #68  <Method void JsonGenerator.writeString(String)>
	//    4    8:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer.writeTypePrefixForScalar(obj, jsongenerator);
	//    0    0:aload           4
	//    1    2:aload_1         
	//    2    3:aload_2         
	//    3    4:invokevirtual   #76  <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
		serialize(obj, jsongenerator, serializerprovider);
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:aload_3         
	//    8   11:invokevirtual   #78  <Method void serialize(Object, JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForScalar(obj, jsongenerator);
	//    9   14:aload           4
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #81  <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   13   21:return          
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
