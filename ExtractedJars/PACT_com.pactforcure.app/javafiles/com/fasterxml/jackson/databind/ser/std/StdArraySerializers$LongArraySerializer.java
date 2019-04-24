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
//			StdArraySerializers

public static class StdArraySerializers$LongArraySerializer extends erializer
{

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new StdArraySerializers$LongArraySerializer(this, beanproperty, _valueTypeSerializer, boolean1)));
	//    0    0:new             #2   <Class StdArraySerializers$LongArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
	//    6   10:aload_2         
	//    7   11:invokespecial   #50  <Method void StdArraySerializers$LongArraySerializer(StdArraySerializers$LongArraySerializer, BeanProperty, TypeSerializer, Boolean)>
	//    8   14:areturn         
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new StdArraySerializers$LongArraySerializer(this, _property, typeserializer, _unwrapSingle)));
	//    0    0:new             #2   <Class StdArraySerializers$LongArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field BeanProperty _property>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #62  <Field Boolean _unwrapSingle>
	//    8   14:invokespecial   #50  <Method void StdArraySerializers$LongArraySerializer(StdArraySerializers$LongArraySerializer, BeanProperty, TypeSerializer, Boolean)>
	//    9   17:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.NUMBER);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #73  <Field JsonFormatTypes JsonFormatTypes.NUMBER>
	//    4    6:invokevirtual   #77  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
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
		return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("number", true))));
	//    0    0:aload_0         
	//    1    1:ldc1            #87  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #91  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #93  <String "items">
	//    5    9:aload_0         
	//    6   10:ldc1            #95  <String "number">
	//    7   12:iconst_1        
	//    8   13:invokevirtual   #91  <Method ObjectNode createSchemaNode(String, boolean)>
	//    9   16:invokevirtual   #101 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   10   19:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((long[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class long[]>
	//    3    5:invokevirtual   #106 <Method boolean hasSingleElement(long[])>
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
	//    4    6:invokevirtual   #111 <Method boolean isEmpty(SerializerProvider, long[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, long al[])
	{
		return al == null || al.length == 0;
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
		serialize((long[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class long[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #118 <Method void serialize(long[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(long al[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = al.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    4:iload           4
	//*   4    6:iconst_1        
	//*   5    7:icmpne          45
	//*   6   10:aload_0         
	//*   7   11:getfield        #62  <Field Boolean _unwrapSingle>
	//*   8   14:ifnonnull       27
	//*   9   17:aload_3         
	//*  10   18:getstatic       #124 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   21:invokevirtual   #130 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   24:ifne            37
	//*  13   27:aload_0         
	//*  14   28:getfield        #62  <Field Boolean _unwrapSingle>
	//*  15   31:getstatic       #135 <Field Boolean Boolean.TRUE>
	//*  16   34:if_acmpne       45
		{
			serializeContents(al, jsongenerator, serializerprovider);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #138 <Method void serializeContents(long[], JsonGenerator, SerializerProvider)>
			return;
	//   22   44:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   45:aload_2         
	//   24   46:iload           4
	//   25   48:invokevirtual   #144 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(al, jsongenerator, serializerprovider);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:aload_3         
	//   30   55:invokevirtual   #138 <Method void serializeContents(long[], JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   58:aload_2         
	//   32   59:invokevirtual   #147 <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   62:return          
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
	//    5    7:invokevirtual   #138 <Method void serializeContents(long[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(long al[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_valueTypeSerializer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
	//*   2    4:ifnull          59
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore          4
			for(int k = al.length; i < k; i++)
	//*   5   10:aload_1         
	//*   6   11:arraylength     
	//*   7   12:istore          5
	//*   8   14:iload           4
	//*   9   16:iload           5
	//*  10   18:icmpge          90
			{
				_valueTypeSerializer.writeTypePrefixForScalar(((Object) (null)), jsongenerator, Long.TYPE);
	//   11   21:aload_0         
	//   12   22:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
	//   13   25:aconst_null     
	//   14   26:aload_2         
	//   15   27:getstatic       #25  <Field Class Long.TYPE>
	//   16   30:invokevirtual   #153 <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator, Class)>
				jsongenerator.writeNumber(al[i]);
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:iload           4
	//   20   37:laload          
	//   21   38:invokevirtual   #157 <Method void JsonGenerator.writeNumber(long)>
				_valueTypeSerializer.writeTypeSuffixForScalar(((Object) (null)), jsongenerator);
	//   22   41:aload_0         
	//   23   42:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
	//   24   45:aconst_null     
	//   25   46:aload_2         
	//   26   47:invokevirtual   #161 <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
			}

	//   27   50:iload           4
	//   28   52:iconst_1        
	//   29   53:iadd            
	//   30   54:istore          4
		} else
	//*  31   56:goto            14
		{
			int j = 0;
	//   32   59:iconst_0        
	//   33   60:istore          4
			for(int l = al.length; j < l; j++)
	//*  34   62:aload_1         
	//*  35   63:arraylength     
	//*  36   64:istore          5
	//*  37   66:iload           4
	//*  38   68:iload           5
	//*  39   70:icmpge          90
				jsongenerator.writeNumber(al[j]);
	//   40   73:aload_2         
	//   41   74:aload_1         
	//   42   75:iload           4
	//   43   77:laload          
	//   44   78:invokevirtual   #157 <Method void JsonGenerator.writeNumber(long)>

	//   45   81:iload           4
	//   46   83:iconst_1        
	//   47   84:iadd            
	//   48   85:istore          4
		}
	//*  49   87:goto            66
	//   50   90:return          
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

	public StdArraySerializers$LongArraySerializer(StdArraySerializers$LongArraySerializer stdarrayserializers$longarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer, Boolean boolean1)
	{
		super(((erializer) (stdarrayserializers$longarrayserializer)), beanproperty, typeserializer, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #42  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty, TypeSerializer, Boolean)>
	//    6    9:return          
	}
}
