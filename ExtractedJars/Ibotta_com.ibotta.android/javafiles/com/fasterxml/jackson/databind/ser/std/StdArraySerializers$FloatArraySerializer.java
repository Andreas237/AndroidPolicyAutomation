// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdArraySerializers

public static class StdArraySerializers$FloatArraySerializer extends rializer
{

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new StdArraySerializers$FloatArraySerializer(this, beanproperty, boolean1)));
	//    0    0:new             #2   <Class StdArraySerializers$FloatArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #46  <Method void StdArraySerializers$FloatArraySerializer(StdArraySerializers$FloatArraySerializer, BeanProperty, Boolean)>
	//    6   10:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.NUMBER);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #58  <Field JsonFormatTypes JsonFormatTypes.NUMBER>
	//    4    6:invokevirtual   #62  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
	//    5    9:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("number"))));
	//    0    0:aload_0         
	//    1    1:ldc1            #67  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #71  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #73  <String "items">
	//    5    9:aload_0         
	//    6   10:ldc1            #75  <String "number">
	//    7   12:invokevirtual   #78  <Method ObjectNode createSchemaNode(String)>
	//    8   15:invokevirtual   #84  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    9   18:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((float[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class float[]>
	//    3    5:invokevirtual   #89  <Method boolean hasSingleElement(float[])>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(float af[])
	{
		return af.length == 1;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:icmpne          8
	//    4    6:iconst_1        
	//    5    7:ireturn         
	//    6    8:iconst_0        
	//    7    9:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (float[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class float[]>
	//    4    6:invokevirtual   #94  <Method boolean isEmpty(SerializerProvider, float[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, float af[])
	{
		return af.length == 0;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:ifne            7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((float[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class float[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #101 <Method void serialize(float[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(float af[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = af.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		if(i == 1 && _shouldUnwrapSingle(serializerprovider))
	//*   3    4:iload           4
	//*   4    6:iconst_1        
	//*   5    7:icmpne          26
	//*   6   10:aload_0         
	//*   7   11:aload_3         
	//*   8   12:invokevirtual   #105 <Method boolean _shouldUnwrapSingle(SerializerProvider)>
	//*   9   15:ifeq            26
		{
			serializeContents(af, jsongenerator, serializerprovider);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:invokevirtual   #108 <Method void serializeContents(float[], JsonGenerator, SerializerProvider)>
			return;
	//   15   25:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   16   26:aload_2         
	//   17   27:iload           4
	//   18   29:invokevirtual   #114 <Method void JsonGenerator.writeStartArray(int)>
			jsongenerator.setCurrentValue(((Object) (af)));
	//   19   32:aload_2         
	//   20   33:aload_1         
	//   21   34:invokevirtual   #118 <Method void JsonGenerator.setCurrentValue(Object)>
			serializeContents(af, jsongenerator, serializerprovider);
	//   22   37:aload_0         
	//   23   38:aload_1         
	//   24   39:aload_2         
	//   25   40:aload_3         
	//   26   41:invokevirtual   #108 <Method void serializeContents(float[], JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   27   44:aload_2         
	//   28   45:invokevirtual   #121 <Method void JsonGenerator.writeEndArray()>
			return;
	//   29   48:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((float[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class float[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #108 <Method void serializeContents(float[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(float af[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int j = af.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          5
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore          4
	//*   5    7:iload           4
	//*   6    9:iload           5
	//*   7   11:icmpge          31
			jsongenerator.writeNumber(af[i]);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:iload           4
	//   11   18:faload          
	//   12   19:invokevirtual   #125 <Method void JsonGenerator.writeNumber(float)>

	//   13   22:iload           4
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore          4
	//*  17   28:goto            7
	//   18   31:return          
	}

	private static final JavaType VALUE_TYPE;

	static 
	{
		VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Float.TYPE);
	//    0    0:invokestatic    #19  <Method TypeFactory TypeFactory.defaultInstance()>
	//    1    3:getstatic       #25  <Field Class Float.TYPE>
	//    2    6:invokevirtual   #29  <Method JavaType TypeFactory.uncheckedSimpleType(Class)>
	//    3    9:putstatic       #31  <Field JavaType VALUE_TYPE>
	//*   4   12:return          
	}

	public StdArraySerializers$FloatArraySerializer()
	{
		super([F);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <Class float[]>
	//    2    3:invokespecial   #38  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(Class)>
	//    3    6:return          
	}

	public StdArraySerializers$FloatArraySerializer(StdArraySerializers$FloatArraySerializer stdarrayserializers$floatarrayserializer, BeanProperty beanproperty, Boolean boolean1)
	{
		super(((rializer) (stdarrayserializers$floatarrayserializer)), beanproperty, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #42  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty, Boolean)>
	//    5    7:return          
	}
}
