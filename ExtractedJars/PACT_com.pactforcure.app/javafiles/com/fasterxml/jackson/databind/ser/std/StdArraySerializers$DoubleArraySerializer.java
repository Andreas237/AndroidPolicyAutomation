// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			ArraySerializerBase, StdArraySerializers

public static class StdArraySerializers$DoubleArraySerializer extends ArraySerializerBase
{

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new StdArraySerializers$DoubleArraySerializer(this, beanproperty, boolean1)));
	//    0    0:new             #2   <Class StdArraySerializers$DoubleArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #46  <Method void StdArraySerializers$DoubleArraySerializer(StdArraySerializers$DoubleArraySerializer, BeanProperty, Boolean)>
	//    6   10:areturn         
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.NUMBER);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #61  <Field JsonFormatTypes JsonFormatTypes.NUMBER>
	//    4    6:invokevirtual   #65  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
	//    5    9:return          
	}

	public JsonSerializer getContentSerializer()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JavaType getContentType()
	{
		return VALUE_TYPE;
	//    0    0:getstatic       #31  <Field JavaType VALUE_TYPE>
	//    1    3:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("number"))));
	//    0    0:aload_0         
	//    1    1:ldc1            #75  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #79  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #81  <String "items">
	//    5    9:aload_0         
	//    6   10:ldc1            #83  <String "number">
	//    7   12:invokevirtual   #86  <Method ObjectNode createSchemaNode(String)>
	//    8   15:invokevirtual   #92  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    9   18:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((double[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class double[]>
	//    3    5:invokevirtual   #97  <Method boolean hasSingleElement(double[])>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(double ad[])
	{
		return ad.length == 1;
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
		return isEmpty(serializerprovider, (double[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #35  <Class double[]>
	//    4    6:invokevirtual   #102 <Method boolean isEmpty(SerializerProvider, double[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, double ad[])
	{
		return ad == null || ad.length == 0;
	//    0    0:aload_2         
	//    1    1:ifnull          9
	//    2    4:aload_2         
	//    3    5:arraylength     
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((double[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class double[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #109 <Method void serialize(double[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(double ad[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = ad.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    4:iload           4
	//*   4    6:iconst_1        
	//*   5    7:icmpne          45
	//*   6   10:aload_0         
	//*   7   11:getfield        #113 <Field Boolean _unwrapSingle>
	//*   8   14:ifnonnull       27
	//*   9   17:aload_3         
	//*  10   18:getstatic       #119 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   21:invokevirtual   #125 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   24:ifne            37
	//*  13   27:aload_0         
	//*  14   28:getfield        #113 <Field Boolean _unwrapSingle>
	//*  15   31:getstatic       #130 <Field Boolean Boolean.TRUE>
	//*  16   34:if_acmpne       45
		{
			serializeContents(ad, jsongenerator, serializerprovider);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #133 <Method void serializeContents(double[], JsonGenerator, SerializerProvider)>
			return;
	//   22   44:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   45:aload_2         
	//   24   46:iload           4
	//   25   48:invokevirtual   #139 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(ad, jsongenerator, serializerprovider);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:aload_3         
	//   30   55:invokevirtual   #133 <Method void serializeContents(double[], JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   58:aload_2         
	//   32   59:invokevirtual   #142 <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   62:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((double[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class double[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #133 <Method void serializeContents(double[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(double ad[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		for(int j = ad.length; i < j; i++)
	//*   2    3:aload_1         
	//*   3    4:arraylength     
	//*   4    5:istore          5
	//*   5    7:iload           4
	//*   6    9:iload           5
	//*   7   11:icmpge          31
			jsongenerator.writeNumber(ad[i]);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:iload           4
	//   11   18:daload          
	//   12   19:invokevirtual   #146 <Method void JsonGenerator.writeNumber(double)>

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
		VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);
	//    0    0:invokestatic    #19  <Method TypeFactory TypeFactory.defaultInstance()>
	//    1    3:getstatic       #25  <Field Class Double.TYPE>
	//    2    6:invokevirtual   #29  <Method JavaType TypeFactory.uncheckedSimpleType(Class)>
	//    3    9:putstatic       #31  <Field JavaType VALUE_TYPE>
	//*   4   12:return          
	}

	public StdArraySerializers$DoubleArraySerializer()
	{
		super([D);
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <Class double[]>
	//    2    3:invokespecial   #38  <Method void ArraySerializerBase(Class)>
	//    3    6:return          
	}

	protected StdArraySerializers$DoubleArraySerializer(StdArraySerializers$DoubleArraySerializer stdarrayserializers$doublearrayserializer, BeanProperty beanproperty, Boolean boolean1)
	{
		super(((ArraySerializerBase) (stdarrayserializers$doublearrayserializer)), beanproperty, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #42  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
	//    5    7:return          
	}
}
