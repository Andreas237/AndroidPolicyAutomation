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

public static class StdArraySerializers$LongArraySerializer extends erializer
{

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new StdArraySerializers$LongArraySerializer(this, beanproperty, boolean1)));
	//    0    0:new             #2   <Class StdArraySerializers$LongArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #46  <Method void StdArraySerializers$LongArraySerializer(StdArraySerializers$LongArraySerializer, BeanProperty, Boolean)>
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
		return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("number", true))));
	//    0    0:aload_0         
	//    1    1:ldc1            #67  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #71  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #73  <String "items">
	//    5    9:aload_0         
	//    6   10:ldc1            #75  <String "number">
	//    7   12:iconst_1        
	//    8   13:invokevirtual   #71  <Method ObjectNode createSchemaNode(String, boolean)>
	//    9   16:invokevirtual   #81  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   10   19:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((long[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class long[]>
	//    3    5:invokevirtual   #86  <Method boolean hasSingleElement(long[])>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(long al[])
	{
		return al.length == 1;
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
		return isEmpty(serializerprovider, (long[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class long[]>
	//    4    6:invokevirtual   #91  <Method boolean isEmpty(SerializerProvider, long[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, long al[])
	{
		return al.length == 0;
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
		serialize((long[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class long[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #98  <Method void serialize(long[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(long al[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(al.length == 1 && _shouldUnwrapSingle(serializerprovider))
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_1        
	//*   3    3:icmpne          22
	//*   4    6:aload_0         
	//*   5    7:aload_3         
	//*   6    8:invokevirtual   #102 <Method boolean _shouldUnwrapSingle(SerializerProvider)>
	//*   7   11:ifeq            22
		{
			serializeContents(al, jsongenerator, serializerprovider);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #105 <Method void serializeContents(long[], JsonGenerator, SerializerProvider)>
			return;
	//   13   21:return          
		} else
		{
			jsongenerator.setCurrentValue(((Object) (al)));
	//   14   22:aload_2         
	//   15   23:aload_1         
	//   16   24:invokevirtual   #111 <Method void JsonGenerator.setCurrentValue(Object)>
			jsongenerator.writeArray(al, 0, al.length);
	//   17   27:aload_2         
	//   18   28:aload_1         
	//   19   29:iconst_0        
	//   20   30:aload_1         
	//   21   31:arraylength     
	//   22   32:invokevirtual   #115 <Method void JsonGenerator.writeArray(long[], int, int)>
			return;
	//   23   35:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((long[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class long[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #105 <Method void serializeContents(long[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(long al[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int j = al.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          5
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore          4
	//*   5    7:iload           4
	//*   6    9:iload           5
	//*   7   11:icmpge          31
			jsongenerator.writeNumber(al[i]);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:iload           4
	//   11   18:laload          
	//   12   19:invokevirtual   #119 <Method void JsonGenerator.writeNumber(long)>

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
		VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);
	//    0    0:invokestatic    #19  <Method TypeFactory TypeFactory.defaultInstance()>
	//    1    3:getstatic       #25  <Field Class Long.TYPE>
	//    2    6:invokevirtual   #29  <Method JavaType TypeFactory.uncheckedSimpleType(Class)>
	//    3    9:putstatic       #31  <Field JavaType VALUE_TYPE>
	//*   4   12:return          
	}

	public StdArraySerializers$LongArraySerializer()
	{
		super([J);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <Class long[]>
	//    2    3:invokespecial   #38  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(Class)>
	//    3    6:return          
	}

	public StdArraySerializers$LongArraySerializer(StdArraySerializers$LongArraySerializer stdarrayserializers$longarrayserializer, BeanProperty beanproperty, Boolean boolean1)
	{
		super(((erializer) (stdarrayserializers$longarrayserializer)), beanproperty, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #42  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty, Boolean)>
	//    5    7:return          
	}
}
