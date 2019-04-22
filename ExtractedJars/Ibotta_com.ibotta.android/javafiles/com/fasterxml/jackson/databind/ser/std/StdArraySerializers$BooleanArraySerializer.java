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

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		serializerprovider = ((SerializerProvider) (createSchemaNode("array", true)));
	//    0    0:aload_0         
	//    1    1:ldc1            #66  <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #70  <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:astore_1        
		((ObjectNode) (serializerprovider)).set("items", ((JsonNode) (createSchemaNode("boolean"))));
	//    5    8:aload_1         
	//    6    9:ldc1            #72  <String "items">
	//    7   11:aload_0         
	//    8   12:ldc1            #74  <String "boolean">
	//    9   14:invokevirtual   #77  <Method ObjectNode createSchemaNode(String)>
	//   10   17:invokevirtual   #83  <Method JsonNode ObjectNode.set(String, JsonNode)>
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
	//    3    5:invokevirtual   #88  <Method boolean hasSingleElement(boolean[])>
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
	//    4    6:invokevirtual   #93  <Method boolean isEmpty(SerializerProvider, boolean[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, boolean aflag[])
	{
		return aflag.length == 0;
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
		serialize((boolean[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class boolean[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #100 <Method void serialize(boolean[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = aflag.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		if(i == 1 && _shouldUnwrapSingle(serializerprovider))
	//*   3    4:iload           4
	//*   4    6:iconst_1        
	//*   5    7:icmpne          26
	//*   6   10:aload_0         
	//*   7   11:aload_3         
	//*   8   12:invokevirtual   #104 <Method boolean _shouldUnwrapSingle(SerializerProvider)>
	//*   9   15:ifeq            26
		{
			serializeContents(aflag, jsongenerator, serializerprovider);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:invokevirtual   #107 <Method void serializeContents(boolean[], JsonGenerator, SerializerProvider)>
			return;
	//   15   25:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   16   26:aload_2         
	//   17   27:iload           4
	//   18   29:invokevirtual   #113 <Method void JsonGenerator.writeStartArray(int)>
			jsongenerator.setCurrentValue(((Object) (aflag)));
	//   19   32:aload_2         
	//   20   33:aload_1         
	//   21   34:invokevirtual   #117 <Method void JsonGenerator.setCurrentValue(Object)>
			serializeContents(aflag, jsongenerator, serializerprovider);
	//   22   37:aload_0         
	//   23   38:aload_1         
	//   24   39:aload_2         
	//   25   40:aload_3         
	//   26   41:invokevirtual   #107 <Method void serializeContents(boolean[], JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   27   44:aload_2         
	//   28   45:invokevirtual   #120 <Method void JsonGenerator.writeEndArray()>
			return;
	//   29   48:return          
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
	//    5    7:invokevirtual   #107 <Method void serializeContents(boolean[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(boolean aflag[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int j = aflag.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          5
		for(int i = 0; i < j; i++)
	//*   3    4:iconst_0        
	//*   4    5:istore          4
	//*   5    7:iload           4
	//*   6    9:iload           5
	//*   7   11:icmpge          31
			jsongenerator.writeBoolean(aflag[i]);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:iload           4
	//   11   18:baload          
	//   12   19:invokevirtual   #124 <Method void JsonGenerator.writeBoolean(boolean)>

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
