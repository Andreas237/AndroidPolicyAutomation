// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
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

public static class StdArraySerializers$BooleanArraySerializer extends ArraySerializerBase
{

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new StdArraySerializers$BooleanArraySerializer(this, beanproperty, boolean1)));
	//    0    0:new             #2   <Class StdArraySerializers$BooleanArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #42  <Method void StdArraySerializers$BooleanArraySerializer(StdArraySerializers$BooleanArraySerializer, BeanProperty, Boolean)>
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
		visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.BOOLEAN);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #57  <Field JsonFormatTypes JsonFormatTypes.BOOLEAN>
	//    4    6:invokevirtual   #61  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
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
	//    0    0:getstatic       #27  <Field JavaType VALUE_TYPE>
	//    1    3:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		serializerprovider = ((SerializerProvider) (createSchemaNode("array", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #71  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #75  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:astore_1        
		((ObjectNode) (serializerprovider)).set("items", ((JsonNode) (createSchemaNode("boolean"))));
	//    5    8:aload_1         
	//    6    9:ldc1            #77  <String "items">
	//    7   11:aload_0         
	//    8   12:ldc1            #79  <String "boolean">
	//    9   14:invokevirtual   #82  <Method ObjectNode createSchemaNode(String)>
	//   10   17:invokevirtual   #88  <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   11   20:pop             
		return ((JsonNode) (serializerprovider));
	//   12   21:aload_1         
	//   13   22:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((boolean[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class boolean[]>
	//    3    5:invokevirtual   #93  <Method boolean hasSingleElement(boolean[])>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(boolean aflag[])
	{
		return aflag.length == 1;
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
		return isEmpty(serializerprovider, (boolean[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #31  <Class boolean[]>
	//    4    6:invokevirtual   #98  <Method boolean isEmpty(SerializerProvider, boolean[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, boolean aflag[])
	{
		return aflag == null || aflag.length == 0;
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
		serialize((boolean[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class boolean[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #105 <Method void serialize(boolean[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = aflag.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    4:iload           4
	//*   4    6:iconst_1        
	//*   5    7:icmpne          45
	//*   6   10:aload_0         
	//*   7   11:getfield        #109 <Field Boolean _unwrapSingle>
	//*   8   14:ifnonnull       27
	//*   9   17:aload_3         
	//*  10   18:getstatic       #115 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   21:invokevirtual   #121 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   24:ifne            37
	//*  13   27:aload_0         
	//*  14   28:getfield        #109 <Field Boolean _unwrapSingle>
	//*  15   31:getstatic       #124 <Field Boolean Boolean.TRUE>
	//*  16   34:if_acmpne       45
		{
			serializeContents(aflag, jsongenerator, serializerprovider);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #127 <Method void serializeContents(boolean[], JsonGenerator, SerializerProvider)>
			return;
	//   22   44:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   45:aload_2         
	//   24   46:iload           4
	//   25   48:invokevirtual   #133 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(aflag, jsongenerator, serializerprovider);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:aload_3         
	//   30   55:invokevirtual   #127 <Method void serializeContents(boolean[], JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   58:aload_2         
	//   32   59:invokevirtual   #136 <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   62:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((boolean[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class boolean[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #127 <Method void serializeContents(boolean[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonGenerationException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		for(int j = aflag.length; i < j; i++)
	//*   2    3:aload_1         
	//*   3    4:arraylength     
	//*   4    5:istore          5
	//*   5    7:iload           4
	//*   6    9:iload           5
	//*   7   11:icmpge          31
			jsongenerator.writeBoolean(aflag[i]);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:iload           4
	//   11   18:baload          
	//   12   19:invokevirtual   #142 <Method void JsonGenerator.writeBoolean(boolean)>

	//   13   22:iload           4
	//   14   24:iconst_1        
	//   15   25:iadd            
	//   16   26:istore          4
	//*  17   28:goto            7
	//   18   31:return          
	}

	private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(java/lang/Boolean);

	static 
	{
	//    0    0:invokestatic    #19  <Method TypeFactory TypeFactory.defaultInstance()>
	//    1    3:ldc1            #21  <Class Boolean>
	//    2    5:invokevirtual   #25  <Method JavaType TypeFactory.uncheckedSimpleType(Class)>
	//    3    8:putstatic       #27  <Field JavaType VALUE_TYPE>
	//*   4   11:return          
	}

	public StdArraySerializers$BooleanArraySerializer()
	{
		super([Z);
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <Class boolean[]>
	//    2    3:invokespecial   #34  <Method void ArraySerializerBase(Class)>
	//    3    6:return          
	}

	protected StdArraySerializers$BooleanArraySerializer(StdArraySerializers$BooleanArraySerializer stdarrayserializers$booleanarrayserializer, BeanProperty beanproperty, Boolean boolean1)
	{
		super(((ArraySerializerBase) (stdarrayserializers$booleanarrayserializer)), beanproperty, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #38  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
	//    5    7:return          
	}
}
