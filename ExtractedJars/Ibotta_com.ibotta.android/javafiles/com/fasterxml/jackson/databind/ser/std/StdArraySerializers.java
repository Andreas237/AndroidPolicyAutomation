// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			ByteArraySerializer, ArraySerializerBase, StdSerializer

public class StdArraySerializers
{
	public static class BooleanArraySerializer extends ArraySerializerBase
	{

		public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
		{
			return ((JsonSerializer) (new BooleanArraySerializer(this, beanproperty, boolean1)));
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

		public BooleanArraySerializer()
		{
			super([Z);
		//    0    0:aload_0         
		//    1    1:ldc1            #31  <Class boolean[]>
		//    2    3:invokespecial   #34  <Method void ArraySerializerBase(Class)>
		//    3    6:return          
		}

		protected BooleanArraySerializer(BooleanArraySerializer booleanarrayserializer, BeanProperty beanproperty, Boolean boolean1)
		{
			super(((ArraySerializerBase) (booleanarrayserializer)), beanproperty, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #38  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
		//    5    7:return          
		}
	}

	public static class CharArraySerializer extends StdSerializer
	{

		private final void _writeArrayContents(JsonGenerator jsongenerator, char ac[])
			throws IOException
		{
			int j = ac.length;
		//    0    0:aload_2         
		//    1    1:arraylength     
		//    2    2:istore          4
			for(int i = 0; i < j; i++)
		//*   3    4:iconst_0        
		//*   4    5:istore_3        
		//*   5    6:iload_3         
		//*   6    7:iload           4
		//*   7    9:icmpge          26
				jsongenerator.writeString(ac, i, 1);
		//    8   12:aload_1         
		//    9   13:aload_2         
		//   10   14:iload_3         
		//   11   15:iconst_1        
		//   12   16:invokevirtual   #27  <Method void JsonGenerator.writeString(char[], int, int)>

		//   13   19:iload_3         
		//   14   20:iconst_1        
		//   15   21:iadd            
		//   16   22:istore_3        
		//*  17   23:goto            6
		//   18   26:return          
		}

		public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.STRING);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #38  <Field JsonFormatTypes JsonFormatTypes.STRING>
		//    4    6:invokevirtual   #42  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
		//    5    9:return          
		}

		public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			serializerprovider = ((SerializerProvider) (createSchemaNode("array", true)));
		//    0    0:aload_0         
		//    1    1:ldc1            #46  <String "array">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #50  <Method ObjectNode createSchemaNode(String, boolean)>
		//    4    7:astore_1        
			type = ((Type) (createSchemaNode("string")));
		//    5    8:aload_0         
		//    6    9:ldc1            #52  <String "string">
		//    7   11:invokevirtual   #55  <Method ObjectNode createSchemaNode(String)>
		//    8   14:astore_2        
			((ObjectNode) (type)).put("type", "string");
		//    9   15:aload_2         
		//   10   16:ldc1            #57  <String "type">
		//   11   18:ldc1            #52  <String "string">
		//   12   20:invokevirtual   #63  <Method ObjectNode ObjectNode.put(String, String)>
		//   13   23:pop             
			return ((ObjectNode) (serializerprovider)).set("items", ((JsonNode) (type)));
		//   14   24:aload_1         
		//   15   25:ldc1            #65  <String "items">
		//   16   27:aload_2         
		//   17   28:invokevirtual   #69  <Method JsonNode ObjectNode.set(String, JsonNode)>
		//   18   31:areturn         
		}

		public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
		{
			return isEmpty(serializerprovider, (char[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #13  <Class char[]>
		//    4    6:invokevirtual   #74  <Method boolean isEmpty(SerializerProvider, char[])>
		//    5    9:ireturn         
		}

		public boolean isEmpty(SerializerProvider serializerprovider, char ac[])
		{
			return ac.length == 0;
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
			serialize((char[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #13  <Class char[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #79  <Method void serialize(char[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serialize(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			if(serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
		//*   0    0:aload_3         
		//*   1    1:getstatic       #85  <Field SerializationFeature SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS>
		//*   2    4:invokevirtual   #91  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*   3    7:ifeq            32
			{
				jsongenerator.writeStartArray(ac.length);
		//    4   10:aload_2         
		//    5   11:aload_1         
		//    6   12:arraylength     
		//    7   13:invokevirtual   #95  <Method void JsonGenerator.writeStartArray(int)>
				jsongenerator.setCurrentValue(((Object) (ac)));
		//    8   16:aload_2         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #99  <Method void JsonGenerator.setCurrentValue(Object)>
				_writeArrayContents(jsongenerator, ac);
		//   11   21:aload_0         
		//   12   22:aload_2         
		//   13   23:aload_1         
		//   14   24:invokespecial   #101 <Method void _writeArrayContents(JsonGenerator, char[])>
				jsongenerator.writeEndArray();
		//   15   27:aload_2         
		//   16   28:invokevirtual   #104 <Method void JsonGenerator.writeEndArray()>
				return;
		//   17   31:return          
			} else
			{
				jsongenerator.writeString(ac, 0, ac.length);
		//   18   32:aload_2         
		//   19   33:aload_1         
		//   20   34:iconst_0        
		//   21   35:aload_1         
		//   22   36:arraylength     
		//   23   37:invokevirtual   #27  <Method void JsonGenerator.writeString(char[], int, int)>
				return;
		//   24   40:return          
			}
		}

		public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
			throws IOException
		{
			serializeWithType((char[])obj, jsongenerator, serializerprovider, typeserializer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #13  <Class char[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:invokevirtual   #109 <Method void serializeWithType(char[], JsonGenerator, SerializerProvider, TypeSerializer)>
		//    7   12:return          
		}

		public void serializeWithType(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
			throws IOException
		{
			if(serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
		//*   0    0:aload_3         
		//*   1    1:getstatic       #85  <Field SerializationFeature SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS>
		//*   2    4:invokevirtual   #91  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*   3    7:ifeq            37
			{
				serializerprovider = ((SerializerProvider) (typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (ac)), JsonToken.START_ARRAY))));
		//    4   10:aload           4
		//    5   12:aload_2         
		//    6   13:aload           4
		//    7   15:aload_1         
		//    8   16:getstatic       #115 <Field JsonToken JsonToken.START_ARRAY>
		//    9   19:invokevirtual   #121 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
		//   10   22:invokevirtual   #125 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
		//   11   25:astore_3        
				_writeArrayContents(jsongenerator, ac);
		//   12   26:aload_0         
		//   13   27:aload_2         
		//   14   28:aload_1         
		//   15   29:invokespecial   #101 <Method void _writeArrayContents(JsonGenerator, char[])>
				ac = ((char []) (serializerprovider));
		//   16   32:aload_3         
		//   17   33:astore_1        
			} else
		//*  18   34:goto            63
			{
				serializerprovider = ((SerializerProvider) (typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (ac)), JsonToken.VALUE_STRING))));
		//   19   37:aload           4
		//   20   39:aload_2         
		//   21   40:aload           4
		//   22   42:aload_1         
		//   23   43:getstatic       #128 <Field JsonToken JsonToken.VALUE_STRING>
		//   24   46:invokevirtual   #121 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
		//   25   49:invokevirtual   #125 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
		//   26   52:astore_3        
				jsongenerator.writeString(ac, 0, ac.length);
		//   27   53:aload_2         
		//   28   54:aload_1         
		//   29   55:iconst_0        
		//   30   56:aload_1         
		//   31   57:arraylength     
		//   32   58:invokevirtual   #27  <Method void JsonGenerator.writeString(char[], int, int)>
				ac = ((char []) (serializerprovider));
		//   33   61:aload_3         
		//   34   62:astore_1        
			}
			typeserializer.writeTypeSuffix(jsongenerator, ((com.fasterxml.jackson.core.type.WritableTypeId) (ac)));
		//   35   63:aload           4
		//   36   65:aload_2         
		//   37   66:aload_1         
		//   38   67:invokevirtual   #131 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
		//   39   70:pop             
		//   40   71:return          
		}

		public CharArraySerializer()
		{
			super([C);
		//    0    0:aload_0         
		//    1    1:ldc1            #13  <Class char[]>
		//    2    3:invokespecial   #16  <Method void StdSerializer(Class)>
		//    3    6:return          
		}
	}

	public static class DoubleArraySerializer extends ArraySerializerBase
	{

		public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
		{
			return ((JsonSerializer) (new DoubleArraySerializer(this, beanproperty, boolean1)));
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

		public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("number"))));
		//    0    0:aload_0         
		//    1    1:ldc1            #70  <String "array">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #74  <Method ObjectNode createSchemaNode(String, boolean)>
		//    4    7:ldc1            #76  <String "items">
		//    5    9:aload_0         
		//    6   10:ldc1            #78  <String "number">
		//    7   12:invokevirtual   #81  <Method ObjectNode createSchemaNode(String)>
		//    8   15:invokevirtual   #87  <Method JsonNode ObjectNode.set(String, JsonNode)>
		//    9   18:areturn         
		}

		public volatile boolean hasSingleElement(Object obj)
		{
			return hasSingleElement((double[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class double[]>
		//    3    5:invokevirtual   #92  <Method boolean hasSingleElement(double[])>
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
		//    4    6:invokevirtual   #97  <Method boolean isEmpty(SerializerProvider, double[])>
		//    5    9:ireturn         
		}

		public boolean isEmpty(SerializerProvider serializerprovider, double ad[])
		{
			return ad.length == 0;
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
			serialize((double[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class double[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #104 <Method void serialize(double[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public final void serialize(double ad[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			if(ad.length == 1 && _shouldUnwrapSingle(serializerprovider))
		//*   0    0:aload_1         
		//*   1    1:arraylength     
		//*   2    2:iconst_1        
		//*   3    3:icmpne          22
		//*   4    6:aload_0         
		//*   5    7:aload_3         
		//*   6    8:invokevirtual   #108 <Method boolean _shouldUnwrapSingle(SerializerProvider)>
		//*   7   11:ifeq            22
			{
				serializeContents(ad, jsongenerator, serializerprovider);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:aload_3         
		//   12   18:invokevirtual   #111 <Method void serializeContents(double[], JsonGenerator, SerializerProvider)>
				return;
		//   13   21:return          
			} else
			{
				jsongenerator.setCurrentValue(((Object) (ad)));
		//   14   22:aload_2         
		//   15   23:aload_1         
		//   16   24:invokevirtual   #117 <Method void JsonGenerator.setCurrentValue(Object)>
				jsongenerator.writeArray(ad, 0, ad.length);
		//   17   27:aload_2         
		//   18   28:aload_1         
		//   19   29:iconst_0        
		//   20   30:aload_1         
		//   21   31:arraylength     
		//   22   32:invokevirtual   #121 <Method void JsonGenerator.writeArray(double[], int, int)>
				return;
		//   23   35:return          
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
		//    5    7:invokevirtual   #111 <Method void serializeContents(double[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serializeContents(double ad[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			int j = ad.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore          5
			for(int i = 0; i < j; i++)
		//*   3    4:iconst_0        
		//*   4    5:istore          4
		//*   5    7:iload           4
		//*   6    9:iload           5
		//*   7   11:icmpge          31
				jsongenerator.writeNumber(ad[i]);
		//    8   14:aload_2         
		//    9   15:aload_1         
		//   10   16:iload           4
		//   11   18:daload          
		//   12   19:invokevirtual   #125 <Method void JsonGenerator.writeNumber(double)>

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

		public DoubleArraySerializer()
		{
			super([D);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <Class double[]>
		//    2    3:invokespecial   #38  <Method void ArraySerializerBase(Class)>
		//    3    6:return          
		}

		protected DoubleArraySerializer(DoubleArraySerializer doublearrayserializer, BeanProperty beanproperty, Boolean boolean1)
		{
			super(((ArraySerializerBase) (doublearrayserializer)), beanproperty, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #42  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
		//    5    7:return          
		}
	}

	public static class FloatArraySerializer extends TypedPrimitiveArraySerializer
	{

		public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
		{
			return ((JsonSerializer) (new FloatArraySerializer(this, beanproperty, boolean1)));
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

		public FloatArraySerializer()
		{
			super([F);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <Class float[]>
		//    2    3:invokespecial   #38  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(Class)>
		//    3    6:return          
		}

		public FloatArraySerializer(FloatArraySerializer floatarrayserializer, BeanProperty beanproperty, Boolean boolean1)
		{
			super(((TypedPrimitiveArraySerializer) (floatarrayserializer)), beanproperty, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #42  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty, Boolean)>
		//    5    7:return          
		}
	}

	public static class IntArraySerializer extends ArraySerializerBase
	{

		public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
		{
			return ((JsonSerializer) (new IntArraySerializer(this, beanproperty, boolean1)));
		//    0    0:new             #2   <Class StdArraySerializers$IntArraySerializer>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #46  <Method void StdArraySerializers$IntArraySerializer(StdArraySerializers$IntArraySerializer, BeanProperty, Boolean)>
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
			visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.INTEGER);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #61  <Field JsonFormatTypes JsonFormatTypes.INTEGER>
		//    4    6:invokevirtual   #65  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
		//    5    9:return          
		}

		public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("integer"))));
		//    0    0:aload_0         
		//    1    1:ldc1            #70  <String "array">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #74  <Method ObjectNode createSchemaNode(String, boolean)>
		//    4    7:ldc1            #76  <String "items">
		//    5    9:aload_0         
		//    6   10:ldc1            #78  <String "integer">
		//    7   12:invokevirtual   #81  <Method ObjectNode createSchemaNode(String)>
		//    8   15:invokevirtual   #87  <Method JsonNode ObjectNode.set(String, JsonNode)>
		//    9   18:areturn         
		}

		public volatile boolean hasSingleElement(Object obj)
		{
			return hasSingleElement((int[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class int[]>
		//    3    5:invokevirtual   #92  <Method boolean hasSingleElement(int[])>
		//    4    8:ireturn         
		}

		public boolean hasSingleElement(int ai[])
		{
			return ai.length == 1;
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
			return isEmpty(serializerprovider, (int[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #35  <Class int[]>
		//    4    6:invokevirtual   #97  <Method boolean isEmpty(SerializerProvider, int[])>
		//    5    9:ireturn         
		}

		public boolean isEmpty(SerializerProvider serializerprovider, int ai[])
		{
			return ai.length == 0;
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
			serialize((int[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class int[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #104 <Method void serialize(int[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public final void serialize(int ai[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			if(ai.length == 1 && _shouldUnwrapSingle(serializerprovider))
		//*   0    0:aload_1         
		//*   1    1:arraylength     
		//*   2    2:iconst_1        
		//*   3    3:icmpne          22
		//*   4    6:aload_0         
		//*   5    7:aload_3         
		//*   6    8:invokevirtual   #108 <Method boolean _shouldUnwrapSingle(SerializerProvider)>
		//*   7   11:ifeq            22
			{
				serializeContents(ai, jsongenerator, serializerprovider);
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:aload_3         
		//   12   18:invokevirtual   #111 <Method void serializeContents(int[], JsonGenerator, SerializerProvider)>
				return;
		//   13   21:return          
			} else
			{
				jsongenerator.setCurrentValue(((Object) (ai)));
		//   14   22:aload_2         
		//   15   23:aload_1         
		//   16   24:invokevirtual   #117 <Method void JsonGenerator.setCurrentValue(Object)>
				jsongenerator.writeArray(ai, 0, ai.length);
		//   17   27:aload_2         
		//   18   28:aload_1         
		//   19   29:iconst_0        
		//   20   30:aload_1         
		//   21   31:arraylength     
		//   22   32:invokevirtual   #121 <Method void JsonGenerator.writeArray(int[], int, int)>
				return;
		//   23   35:return          
			}
		}

		public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			serializeContents((int[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class int[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #111 <Method void serializeContents(int[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serializeContents(int ai[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			int j = ai.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore          5
			for(int i = 0; i < j; i++)
		//*   3    4:iconst_0        
		//*   4    5:istore          4
		//*   5    7:iload           4
		//*   6    9:iload           5
		//*   7   11:icmpge          31
				jsongenerator.writeNumber(ai[i]);
		//    8   14:aload_2         
		//    9   15:aload_1         
		//   10   16:iload           4
		//   11   18:iaload          
		//   12   19:invokevirtual   #125 <Method void JsonGenerator.writeNumber(int)>

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
			VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);
		//    0    0:invokestatic    #19  <Method TypeFactory TypeFactory.defaultInstance()>
		//    1    3:getstatic       #25  <Field Class Integer.TYPE>
		//    2    6:invokevirtual   #29  <Method JavaType TypeFactory.uncheckedSimpleType(Class)>
		//    3    9:putstatic       #31  <Field JavaType VALUE_TYPE>
		//*   4   12:return          
		}

		public IntArraySerializer()
		{
			super([I);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <Class int[]>
		//    2    3:invokespecial   #38  <Method void ArraySerializerBase(Class)>
		//    3    6:return          
		}

		protected IntArraySerializer(IntArraySerializer intarrayserializer, BeanProperty beanproperty, Boolean boolean1)
		{
			super(((ArraySerializerBase) (intarrayserializer)), beanproperty, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #42  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
		//    5    7:return          
		}
	}

	public static class LongArraySerializer extends TypedPrimitiveArraySerializer
	{

		public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
		{
			return ((JsonSerializer) (new LongArraySerializer(this, beanproperty, boolean1)));
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

		public LongArraySerializer()
		{
			super([J);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <Class long[]>
		//    2    3:invokespecial   #38  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(Class)>
		//    3    6:return          
		}

		public LongArraySerializer(LongArraySerializer longarrayserializer, BeanProperty beanproperty, Boolean boolean1)
		{
			super(((TypedPrimitiveArraySerializer) (longarrayserializer)), beanproperty, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #42  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty, Boolean)>
		//    5    7:return          
		}
	}

	public static class ShortArraySerializer extends TypedPrimitiveArraySerializer
	{

		public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
		{
			return ((JsonSerializer) (new ShortArraySerializer(this, beanproperty, boolean1)));
		//    0    0:new             #2   <Class StdArraySerializers$ShortArraySerializer>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #46  <Method void StdArraySerializers$ShortArraySerializer(StdArraySerializers$ShortArraySerializer, BeanProperty, Boolean)>
		//    6   10:areturn         
		}

		public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.INTEGER);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #58  <Field JsonFormatTypes JsonFormatTypes.INTEGER>
		//    4    6:invokevirtual   #62  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
		//    5    9:return          
		}

		public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("integer"))));
		//    0    0:aload_0         
		//    1    1:ldc1            #67  <String "array">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #71  <Method ObjectNode createSchemaNode(String, boolean)>
		//    4    7:ldc1            #73  <String "items">
		//    5    9:aload_0         
		//    6   10:ldc1            #75  <String "integer">
		//    7   12:invokevirtual   #78  <Method ObjectNode createSchemaNode(String)>
		//    8   15:invokevirtual   #84  <Method JsonNode ObjectNode.set(String, JsonNode)>
		//    9   18:areturn         
		}

		public volatile boolean hasSingleElement(Object obj)
		{
			return hasSingleElement((short[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class short[]>
		//    3    5:invokevirtual   #89  <Method boolean hasSingleElement(short[])>
		//    4    8:ireturn         
		}

		public boolean hasSingleElement(short aword0[])
		{
			return aword0.length == 1;
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
			return isEmpty(serializerprovider, (short[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #35  <Class short[]>
		//    4    6:invokevirtual   #94  <Method boolean isEmpty(SerializerProvider, short[])>
		//    5    9:ireturn         
		}

		public boolean isEmpty(SerializerProvider serializerprovider, short aword0[])
		{
			return aword0.length == 0;
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
			serialize((short[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class short[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #101 <Method void serialize(short[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public final void serialize(short aword0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			int i = aword0.length;
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
				serializeContents(aword0, jsongenerator, serializerprovider);
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:aload_2         
		//   13   21:aload_3         
		//   14   22:invokevirtual   #108 <Method void serializeContents(short[], JsonGenerator, SerializerProvider)>
				return;
		//   15   25:return          
			} else
			{
				jsongenerator.writeStartArray(i);
		//   16   26:aload_2         
		//   17   27:iload           4
		//   18   29:invokevirtual   #114 <Method void JsonGenerator.writeStartArray(int)>
				jsongenerator.setCurrentValue(((Object) (aword0)));
		//   19   32:aload_2         
		//   20   33:aload_1         
		//   21   34:invokevirtual   #118 <Method void JsonGenerator.setCurrentValue(Object)>
				serializeContents(aword0, jsongenerator, serializerprovider);
		//   22   37:aload_0         
		//   23   38:aload_1         
		//   24   39:aload_2         
		//   25   40:aload_3         
		//   26   41:invokevirtual   #108 <Method void serializeContents(short[], JsonGenerator, SerializerProvider)>
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
			serializeContents((short[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class short[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #108 <Method void serializeContents(short[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serializeContents(short aword0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			int j = aword0.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore          5
			for(int i = 0; i < j; i++)
		//*   3    4:iconst_0        
		//*   4    5:istore          4
		//*   5    7:iload           4
		//*   6    9:iload           5
		//*   7   11:icmpge          31
				jsongenerator.writeNumber(((int) (aword0[i])));
		//    8   14:aload_2         
		//    9   15:aload_1         
		//   10   16:iload           4
		//   11   18:saload          
		//   12   19:invokevirtual   #124 <Method void JsonGenerator.writeNumber(int)>

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
			VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Short.TYPE);
		//    0    0:invokestatic    #19  <Method TypeFactory TypeFactory.defaultInstance()>
		//    1    3:getstatic       #25  <Field Class Short.TYPE>
		//    2    6:invokevirtual   #29  <Method JavaType TypeFactory.uncheckedSimpleType(Class)>
		//    3    9:putstatic       #31  <Field JavaType VALUE_TYPE>
		//*   4   12:return          
		}

		public ShortArraySerializer()
		{
			super([S);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <Class short[]>
		//    2    3:invokespecial   #38  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(Class)>
		//    3    6:return          
		}

		public ShortArraySerializer(ShortArraySerializer shortarrayserializer, BeanProperty beanproperty, Boolean boolean1)
		{
			super(((TypedPrimitiveArraySerializer) (shortarrayserializer)), beanproperty, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #42  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty, Boolean)>
		//    5    7:return          
		}
	}

	protected static abstract class TypedPrimitiveArraySerializer extends ArraySerializerBase
	{

		public final ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
		{
			return ((ContainerSerializer) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		protected TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer typedprimitivearrayserializer, BeanProperty beanproperty, Boolean boolean1)
		{
			super(((ArraySerializerBase) (typedprimitivearrayserializer)), beanproperty, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #13  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
		//    5    7:return          
		}

		protected TypedPrimitiveArraySerializer(Class class1)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #19  <Method void ArraySerializerBase(Class)>
		//    3    5:return          
		}
	}


	public static JsonSerializer findStandardImpl(Class class1)
	{
		return (JsonSerializer)_arraySerializers.get(((Object) (class1.getName())));
	//    0    0:getstatic       #40  <Field HashMap _arraySerializers>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #48  <Method String Class.getName()>
	//    3    7:invokevirtual   #83  <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #85  <Class JsonSerializer>
	//    5   13:areturn         
	}

	protected static final HashMap _arraySerializers;

	static 
	{
		_arraySerializers = new HashMap();
	//    0    0:new             #35  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void HashMap()>
	//    3    7:putstatic       #40  <Field HashMap _arraySerializers>
		_arraySerializers.put(((Object) (((Class) ([Z)).getName())), ((Object) (new BooleanArraySerializer())));
	//    4   10:getstatic       #40  <Field HashMap _arraySerializers>
	//    5   13:ldc1            #42  <Class boolean[]>
	//    6   15:invokevirtual   #48  <Method String Class.getName()>
	//    7   18:new             #6   <Class StdArraySerializers$BooleanArraySerializer>
	//    8   21:dup             
	//    9   22:invokespecial   #49  <Method void StdArraySerializers$BooleanArraySerializer()>
	//   10   25:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   11   28:pop             
		_arraySerializers.put(((Object) (((Class) ([B)).getName())), ((Object) (new ByteArraySerializer())));
	//   12   29:getstatic       #40  <Field HashMap _arraySerializers>
	//   13   32:ldc1            #55  <Class byte[]>
	//   14   34:invokevirtual   #48  <Method String Class.getName()>
	//   15   37:new             #57  <Class ByteArraySerializer>
	//   16   40:dup             
	//   17   41:invokespecial   #58  <Method void ByteArraySerializer()>
	//   18   44:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   19   47:pop             
		_arraySerializers.put(((Object) (((Class) ([C)).getName())), ((Object) (new CharArraySerializer())));
	//   20   48:getstatic       #40  <Field HashMap _arraySerializers>
	//   21   51:ldc1            #60  <Class char[]>
	//   22   53:invokevirtual   #48  <Method String Class.getName()>
	//   23   56:new             #9   <Class StdArraySerializers$CharArraySerializer>
	//   24   59:dup             
	//   25   60:invokespecial   #61  <Method void StdArraySerializers$CharArraySerializer()>
	//   26   63:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   27   66:pop             
		_arraySerializers.put(((Object) (((Class) ([S)).getName())), ((Object) (new ShortArraySerializer())));
	//   28   67:getstatic       #40  <Field HashMap _arraySerializers>
	//   29   70:ldc1            #63  <Class short[]>
	//   30   72:invokevirtual   #48  <Method String Class.getName()>
	//   31   75:new             #24  <Class StdArraySerializers$ShortArraySerializer>
	//   32   78:dup             
	//   33   79:invokespecial   #64  <Method void StdArraySerializers$ShortArraySerializer()>
	//   34   82:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   35   85:pop             
		_arraySerializers.put(((Object) (((Class) ([I)).getName())), ((Object) (new IntArraySerializer())));
	//   36   86:getstatic       #40  <Field HashMap _arraySerializers>
	//   37   89:ldc1            #66  <Class int[]>
	//   38   91:invokevirtual   #48  <Method String Class.getName()>
	//   39   94:new             #18  <Class StdArraySerializers$IntArraySerializer>
	//   40   97:dup             
	//   41   98:invokespecial   #67  <Method void StdArraySerializers$IntArraySerializer()>
	//   42  101:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   43  104:pop             
		_arraySerializers.put(((Object) (((Class) ([J)).getName())), ((Object) (new LongArraySerializer())));
	//   44  105:getstatic       #40  <Field HashMap _arraySerializers>
	//   45  108:ldc1            #69  <Class long[]>
	//   46  110:invokevirtual   #48  <Method String Class.getName()>
	//   47  113:new             #21  <Class StdArraySerializers$LongArraySerializer>
	//   48  116:dup             
	//   49  117:invokespecial   #70  <Method void StdArraySerializers$LongArraySerializer()>
	//   50  120:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   51  123:pop             
		_arraySerializers.put(((Object) (((Class) ([F)).getName())), ((Object) (new FloatArraySerializer())));
	//   52  124:getstatic       #40  <Field HashMap _arraySerializers>
	//   53  127:ldc1            #72  <Class float[]>
	//   54  129:invokevirtual   #48  <Method String Class.getName()>
	//   55  132:new             #15  <Class StdArraySerializers$FloatArraySerializer>
	//   56  135:dup             
	//   57  136:invokespecial   #73  <Method void StdArraySerializers$FloatArraySerializer()>
	//   58  139:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   59  142:pop             
		_arraySerializers.put(((Object) (((Class) ([D)).getName())), ((Object) (new DoubleArraySerializer())));
	//   60  143:getstatic       #40  <Field HashMap _arraySerializers>
	//   61  146:ldc1            #75  <Class double[]>
	//   62  148:invokevirtual   #48  <Method String Class.getName()>
	//   63  151:new             #12  <Class StdArraySerializers$DoubleArraySerializer>
	//   64  154:dup             
	//   65  155:invokespecial   #76  <Method void StdArraySerializers$DoubleArraySerializer()>
	//   66  158:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
	//   67  161:pop             
	//*  68  162:return          
	}
}
