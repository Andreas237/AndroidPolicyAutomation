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
			throws IOException, JsonGenerationException
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			for(int j = ac.length; i < j; i++)
		//*   2    2:aload_2         
		//*   3    3:arraylength     
		//*   4    4:istore          4
		//*   5    6:iload_3         
		//*   6    7:iload           4
		//*   7    9:icmpge          26
				jsongenerator.writeString(ac, i, 1);
		//    8   12:aload_1         
		//    9   13:aload_2         
		//   10   14:iload_3         
		//   11   15:iconst_1        
		//   12   16:invokevirtual   #29  <Method void JsonGenerator.writeString(char[], int, int)>

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
		//    3    3:getstatic       #40  <Field JsonFormatTypes JsonFormatTypes.STRING>
		//    4    6:invokevirtual   #44  <Method void visitArrayFormat(JsonFormatVisitorWrapper, JavaType, JsonFormatTypes)>
		//    5    9:return          
		}

		public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			serializerprovider = ((SerializerProvider) (createSchemaNode("array", true)));
		//    0    0:aload_0         
		//    1    1:ldc1            #48  <String "array">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #52  <Method ObjectNode createSchemaNode(String, boolean)>
		//    4    7:astore_1        
			type = ((Type) (createSchemaNode("string")));
		//    5    8:aload_0         
		//    6    9:ldc1            #54  <String "string">
		//    7   11:invokevirtual   #57  <Method ObjectNode createSchemaNode(String)>
		//    8   14:astore_2        
			((ObjectNode) (type)).put("type", "string");
		//    9   15:aload_2         
		//   10   16:ldc1            #59  <String "type">
		//   11   18:ldc1            #54  <String "string">
		//   12   20:invokevirtual   #65  <Method ObjectNode ObjectNode.put(String, String)>
		//   13   23:pop             
			return ((ObjectNode) (serializerprovider)).set("items", ((JsonNode) (type)));
		//   14   24:aload_1         
		//   15   25:ldc1            #67  <String "items">
		//   16   27:aload_2         
		//   17   28:invokevirtual   #71  <Method JsonNode ObjectNode.set(String, JsonNode)>
		//   18   31:areturn         
		}

		public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
		{
			return isEmpty(serializerprovider, (char[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #13  <Class char[]>
		//    4    6:invokevirtual   #76  <Method boolean isEmpty(SerializerProvider, char[])>
		//    5    9:ireturn         
		}

		public boolean isEmpty(SerializerProvider serializerprovider, char ac[])
		{
			return ac == null || ac.length == 0;
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
			serialize((char[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #13  <Class char[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #81  <Method void serialize(char[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serialize(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException, JsonGenerationException
		{
			if(serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
		//*   0    0:aload_3         
		//*   1    1:getstatic       #87  <Field SerializationFeature SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS>
		//*   2    4:invokevirtual   #93  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*   3    7:ifeq            27
			{
				jsongenerator.writeStartArray(ac.length);
		//    4   10:aload_2         
		//    5   11:aload_1         
		//    6   12:arraylength     
		//    7   13:invokevirtual   #97  <Method void JsonGenerator.writeStartArray(int)>
				_writeArrayContents(jsongenerator, ac);
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:aload_1         
		//   11   19:invokespecial   #99  <Method void _writeArrayContents(JsonGenerator, char[])>
				jsongenerator.writeEndArray();
		//   12   22:aload_2         
		//   13   23:invokevirtual   #102 <Method void JsonGenerator.writeEndArray()>
				return;
		//   14   26:return          
			} else
			{
				jsongenerator.writeString(ac, 0, ac.length);
		//   15   27:aload_2         
		//   16   28:aload_1         
		//   17   29:iconst_0        
		//   18   30:aload_1         
		//   19   31:arraylength     
		//   20   32:invokevirtual   #29  <Method void JsonGenerator.writeString(char[], int, int)>
				return;
		//   21   35:return          
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
		//    6    9:invokevirtual   #107 <Method void serializeWithType(char[], JsonGenerator, SerializerProvider, TypeSerializer)>
		//    7   12:return          
		}

		public void serializeWithType(char ac[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
			throws IOException, JsonGenerationException
		{
			if(serializerprovider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS))
		//*   0    0:aload_3         
		//*   1    1:getstatic       #87  <Field SerializationFeature SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS>
		//*   2    4:invokevirtual   #93  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*   3    7:ifeq            31
			{
				typeserializer.writeTypePrefixForArray(((Object) (ac)), jsongenerator);
		//    4   10:aload           4
		//    5   12:aload_1         
		//    6   13:aload_2         
		//    7   14:invokevirtual   #113 <Method void TypeSerializer.writeTypePrefixForArray(Object, JsonGenerator)>
				_writeArrayContents(jsongenerator, ac);
		//    8   17:aload_0         
		//    9   18:aload_2         
		//   10   19:aload_1         
		//   11   20:invokespecial   #99  <Method void _writeArrayContents(JsonGenerator, char[])>
				typeserializer.writeTypeSuffixForArray(((Object) (ac)), jsongenerator);
		//   12   23:aload           4
		//   13   25:aload_1         
		//   14   26:aload_2         
		//   15   27:invokevirtual   #116 <Method void TypeSerializer.writeTypeSuffixForArray(Object, JsonGenerator)>
				return;
		//   16   30:return          
			} else
			{
				typeserializer.writeTypePrefixForScalar(((Object) (ac)), jsongenerator);
		//   17   31:aload           4
		//   18   33:aload_1         
		//   19   34:aload_2         
		//   20   35:invokevirtual   #119 <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
				jsongenerator.writeString(ac, 0, ac.length);
		//   21   38:aload_2         
		//   22   39:aload_1         
		//   23   40:iconst_0        
		//   24   41:aload_1         
		//   25   42:arraylength     
		//   26   43:invokevirtual   #29  <Method void JsonGenerator.writeString(char[], int, int)>
				typeserializer.writeTypeSuffixForScalar(((Object) (ac)), jsongenerator);
		//   27   46:aload           4
		//   28   48:aload_1         
		//   29   49:aload_2         
		//   30   50:invokevirtual   #122 <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
				return;
		//   31   53:return          
			}
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
			return ((JsonSerializer) (new FloatArraySerializer(this, beanproperty, _valueTypeSerializer, boolean1)));
		//    0    0:new             #2   <Class StdArraySerializers$FloatArraySerializer>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_0         
		//    5    7:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
		//    6   10:aload_2         
		//    7   11:invokespecial   #50  <Method void StdArraySerializers$FloatArraySerializer(StdArraySerializers$FloatArraySerializer, BeanProperty, TypeSerializer, Boolean)>
		//    8   14:areturn         
		}

		public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
		{
			return ((ContainerSerializer) (new FloatArraySerializer(this, _property, typeserializer, _unwrapSingle)));
		//    0    0:new             #2   <Class StdArraySerializers$FloatArraySerializer>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #58  <Field BeanProperty _property>
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #62  <Field Boolean _unwrapSingle>
		//    8   14:invokespecial   #50  <Method void StdArraySerializers$FloatArraySerializer(StdArraySerializers$FloatArraySerializer, BeanProperty, TypeSerializer, Boolean)>
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
			return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("number"))));
		//    0    0:aload_0         
		//    1    1:ldc1            #87  <String "array">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #91  <Method ObjectNode createSchemaNode(String, boolean)>
		//    4    7:ldc1            #93  <String "items">
		//    5    9:aload_0         
		//    6   10:ldc1            #95  <String "number">
		//    7   12:invokevirtual   #98  <Method ObjectNode createSchemaNode(String)>
		//    8   15:invokevirtual   #104 <Method JsonNode ObjectNode.set(String, JsonNode)>
		//    9   18:areturn         
		}

		public volatile boolean hasSingleElement(Object obj)
		{
			return hasSingleElement((float[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class float[]>
		//    3    5:invokevirtual   #109 <Method boolean hasSingleElement(float[])>
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
		//    4    6:invokevirtual   #114 <Method boolean isEmpty(SerializerProvider, float[])>
		//    5    9:ireturn         
		}

		public boolean isEmpty(SerializerProvider serializerprovider, float af[])
		{
			return af == null || af.length == 0;
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
			serialize((float[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class float[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #121 <Method void serialize(float[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public final void serialize(float af[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			int i = af.length;
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
		//*  10   18:getstatic       #127 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
		//*  11   21:invokevirtual   #133 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*  12   24:ifne            37
		//*  13   27:aload_0         
		//*  14   28:getfield        #62  <Field Boolean _unwrapSingle>
		//*  15   31:getstatic       #138 <Field Boolean Boolean.TRUE>
		//*  16   34:if_acmpne       45
			{
				serializeContents(af, jsongenerator, serializerprovider);
		//   17   37:aload_0         
		//   18   38:aload_1         
		//   19   39:aload_2         
		//   20   40:aload_3         
		//   21   41:invokevirtual   #141 <Method void serializeContents(float[], JsonGenerator, SerializerProvider)>
				return;
		//   22   44:return          
			} else
			{
				jsongenerator.writeStartArray(i);
		//   23   45:aload_2         
		//   24   46:iload           4
		//   25   48:invokevirtual   #147 <Method void JsonGenerator.writeStartArray(int)>
				serializeContents(af, jsongenerator, serializerprovider);
		//   26   51:aload_0         
		//   27   52:aload_1         
		//   28   53:aload_2         
		//   29   54:aload_3         
		//   30   55:invokevirtual   #141 <Method void serializeContents(float[], JsonGenerator, SerializerProvider)>
				jsongenerator.writeEndArray();
		//   31   58:aload_2         
		//   32   59:invokevirtual   #150 <Method void JsonGenerator.writeEndArray()>
				return;
		//   33   62:return          
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
		//    5    7:invokevirtual   #141 <Method void serializeContents(float[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serializeContents(float af[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException, JsonGenerationException
		{
			if(_valueTypeSerializer != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
		//*   2    4:ifnull          59
			{
				int i = 0;
		//    3    7:iconst_0        
		//    4    8:istore          4
				for(int k = af.length; i < k; i++)
		//*   5   10:aload_1         
		//*   6   11:arraylength     
		//*   7   12:istore          5
		//*   8   14:iload           4
		//*   9   16:iload           5
		//*  10   18:icmpge          90
				{
					_valueTypeSerializer.writeTypePrefixForScalar(((Object) (null)), jsongenerator, Float.TYPE);
		//   11   21:aload_0         
		//   12   22:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
		//   13   25:aconst_null     
		//   14   26:aload_2         
		//   15   27:getstatic       #25  <Field Class Float.TYPE>
		//   16   30:invokevirtual   #158 <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator, Class)>
					jsongenerator.writeNumber(af[i]);
		//   17   33:aload_2         
		//   18   34:aload_1         
		//   19   35:iload           4
		//   20   37:faload          
		//   21   38:invokevirtual   #162 <Method void JsonGenerator.writeNumber(float)>
					_valueTypeSerializer.writeTypeSuffixForScalar(((Object) (null)), jsongenerator);
		//   22   41:aload_0         
		//   23   42:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
		//   24   45:aconst_null     
		//   25   46:aload_2         
		//   26   47:invokevirtual   #166 <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
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
				for(int l = af.length; j < l; j++)
		//*  34   62:aload_1         
		//*  35   63:arraylength     
		//*  36   64:istore          5
		//*  37   66:iload           4
		//*  38   68:iload           5
		//*  39   70:icmpge          90
					jsongenerator.writeNumber(af[j]);
		//   40   73:aload_2         
		//   41   74:aload_1         
		//   42   75:iload           4
		//   43   77:faload          
		//   44   78:invokevirtual   #162 <Method void JsonGenerator.writeNumber(float)>

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

		public FloatArraySerializer(FloatArraySerializer floatarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer, Boolean boolean1)
		{
			super(((TypedPrimitiveArraySerializer) (floatarrayserializer)), beanproperty, typeserializer, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #42  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty, TypeSerializer, Boolean)>
		//    6    9:return          
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
			return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("integer"))));
		//    0    0:aload_0         
		//    1    1:ldc1            #75  <String "array">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #79  <Method ObjectNode createSchemaNode(String, boolean)>
		//    4    7:ldc1            #81  <String "items">
		//    5    9:aload_0         
		//    6   10:ldc1            #83  <String "integer">
		//    7   12:invokevirtual   #86  <Method ObjectNode createSchemaNode(String)>
		//    8   15:invokevirtual   #92  <Method JsonNode ObjectNode.set(String, JsonNode)>
		//    9   18:areturn         
		}

		public volatile boolean hasSingleElement(Object obj)
		{
			return hasSingleElement((int[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class int[]>
		//    3    5:invokevirtual   #97  <Method boolean hasSingleElement(int[])>
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
		//    4    6:invokevirtual   #102 <Method boolean isEmpty(SerializerProvider, int[])>
		//    5    9:ireturn         
		}

		public boolean isEmpty(SerializerProvider serializerprovider, int ai[])
		{
			return ai == null || ai.length == 0;
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
			serialize((int[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class int[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #109 <Method void serialize(int[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public final void serialize(int ai[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			int i = ai.length;
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
				serializeContents(ai, jsongenerator, serializerprovider);
		//   17   37:aload_0         
		//   18   38:aload_1         
		//   19   39:aload_2         
		//   20   40:aload_3         
		//   21   41:invokevirtual   #133 <Method void serializeContents(int[], JsonGenerator, SerializerProvider)>
				return;
		//   22   44:return          
			} else
			{
				jsongenerator.writeStartArray(i);
		//   23   45:aload_2         
		//   24   46:iload           4
		//   25   48:invokevirtual   #139 <Method void JsonGenerator.writeStartArray(int)>
				serializeContents(ai, jsongenerator, serializerprovider);
		//   26   51:aload_0         
		//   27   52:aload_1         
		//   28   53:aload_2         
		//   29   54:aload_3         
		//   30   55:invokevirtual   #133 <Method void serializeContents(int[], JsonGenerator, SerializerProvider)>
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
			serializeContents((int[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class int[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #133 <Method void serializeContents(int[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serializeContents(int ai[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore          4
			for(int j = ai.length; i < j; i++)
		//*   2    3:aload_1         
		//*   3    4:arraylength     
		//*   4    5:istore          5
		//*   5    7:iload           4
		//*   6    9:iload           5
		//*   7   11:icmpge          31
				jsongenerator.writeNumber(ai[i]);
		//    8   14:aload_2         
		//    9   15:aload_1         
		//   10   16:iload           4
		//   11   18:iaload          
		//   12   19:invokevirtual   #145 <Method void JsonGenerator.writeNumber(int)>

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
			return ((JsonSerializer) (new LongArraySerializer(this, beanproperty, _valueTypeSerializer, boolean1)));
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
			return ((ContainerSerializer) (new LongArraySerializer(this, _property, typeserializer, _unwrapSingle)));
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

		public LongArraySerializer()
		{
			super([J);
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <Class long[]>
		//    2    3:invokespecial   #38  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(Class)>
		//    3    6:return          
		}

		public LongArraySerializer(LongArraySerializer longarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer, Boolean boolean1)
		{
			super(((TypedPrimitiveArraySerializer) (longarrayserializer)), beanproperty, typeserializer, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #42  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty, TypeSerializer, Boolean)>
		//    6    9:return          
		}
	}

	public static class ShortArraySerializer extends TypedPrimitiveArraySerializer
	{

		public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
		{
			return ((JsonSerializer) (new ShortArraySerializer(this, beanproperty, _valueTypeSerializer, boolean1)));
		//    0    0:new             #2   <Class StdArraySerializers$ShortArraySerializer>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_0         
		//    5    7:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
		//    6   10:aload_2         
		//    7   11:invokespecial   #50  <Method void StdArraySerializers$ShortArraySerializer(StdArraySerializers$ShortArraySerializer, BeanProperty, TypeSerializer, Boolean)>
		//    8   14:areturn         
		}

		public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
		{
			return ((ContainerSerializer) (new ShortArraySerializer(this, _property, typeserializer, _unwrapSingle)));
		//    0    0:new             #2   <Class StdArraySerializers$ShortArraySerializer>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #58  <Field BeanProperty _property>
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #62  <Field Boolean _unwrapSingle>
		//    8   14:invokespecial   #50  <Method void StdArraySerializers$ShortArraySerializer(StdArraySerializers$ShortArraySerializer, BeanProperty, TypeSerializer, Boolean)>
		//    9   17:areturn         
		}

		public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			visitArrayFormat(jsonformatvisitorwrapper, javatype, JsonFormatTypes.INTEGER);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #73  <Field JsonFormatTypes JsonFormatTypes.INTEGER>
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
			return createSchemaNode("array", true).set("items", ((JsonNode) (createSchemaNode("integer"))));
		//    0    0:aload_0         
		//    1    1:ldc1            #87  <String "array">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #91  <Method ObjectNode createSchemaNode(String, boolean)>
		//    4    7:ldc1            #93  <String "items">
		//    5    9:aload_0         
		//    6   10:ldc1            #95  <String "integer">
		//    7   12:invokevirtual   #98  <Method ObjectNode createSchemaNode(String)>
		//    8   15:invokevirtual   #104 <Method JsonNode ObjectNode.set(String, JsonNode)>
		//    9   18:areturn         
		}

		public volatile boolean hasSingleElement(Object obj)
		{
			return hasSingleElement((short[])obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class short[]>
		//    3    5:invokevirtual   #109 <Method boolean hasSingleElement(short[])>
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
		//    4    6:invokevirtual   #114 <Method boolean isEmpty(SerializerProvider, short[])>
		//    5    9:ireturn         
		}

		public boolean isEmpty(SerializerProvider serializerprovider, short aword0[])
		{
			return aword0 == null || aword0.length == 0;
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
			serialize((short[])obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #35  <Class short[]>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #121 <Method void serialize(short[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public final void serialize(short aword0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			int i = aword0.length;
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
		//*  10   18:getstatic       #127 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
		//*  11   21:invokevirtual   #133 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*  12   24:ifne            37
		//*  13   27:aload_0         
		//*  14   28:getfield        #62  <Field Boolean _unwrapSingle>
		//*  15   31:getstatic       #138 <Field Boolean Boolean.TRUE>
		//*  16   34:if_acmpne       45
			{
				serializeContents(aword0, jsongenerator, serializerprovider);
		//   17   37:aload_0         
		//   18   38:aload_1         
		//   19   39:aload_2         
		//   20   40:aload_3         
		//   21   41:invokevirtual   #141 <Method void serializeContents(short[], JsonGenerator, SerializerProvider)>
				return;
		//   22   44:return          
			} else
			{
				jsongenerator.writeStartArray(i);
		//   23   45:aload_2         
		//   24   46:iload           4
		//   25   48:invokevirtual   #147 <Method void JsonGenerator.writeStartArray(int)>
				serializeContents(aword0, jsongenerator, serializerprovider);
		//   26   51:aload_0         
		//   27   52:aload_1         
		//   28   53:aload_2         
		//   29   54:aload_3         
		//   30   55:invokevirtual   #141 <Method void serializeContents(short[], JsonGenerator, SerializerProvider)>
				jsongenerator.writeEndArray();
		//   31   58:aload_2         
		//   32   59:invokevirtual   #150 <Method void JsonGenerator.writeEndArray()>
				return;
		//   33   62:return          
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
		//    5    7:invokevirtual   #141 <Method void serializeContents(short[], JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serializeContents(short aword0[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException, JsonGenerationException
		{
			if(_valueTypeSerializer != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
		//*   2    4:ifnull          59
			{
				int i = 0;
		//    3    7:iconst_0        
		//    4    8:istore          4
				for(int k = aword0.length; i < k; i++)
		//*   5   10:aload_1         
		//*   6   11:arraylength     
		//*   7   12:istore          5
		//*   8   14:iload           4
		//*   9   16:iload           5
		//*  10   18:icmpge          90
				{
					_valueTypeSerializer.writeTypePrefixForScalar(((Object) (null)), jsongenerator, Short.TYPE);
		//   11   21:aload_0         
		//   12   22:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
		//   13   25:aconst_null     
		//   14   26:aload_2         
		//   15   27:getstatic       #25  <Field Class Short.TYPE>
		//   16   30:invokevirtual   #158 <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator, Class)>
					jsongenerator.writeNumber(aword0[i]);
		//   17   33:aload_2         
		//   18   34:aload_1         
		//   19   35:iload           4
		//   20   37:saload          
		//   21   38:invokevirtual   #162 <Method void JsonGenerator.writeNumber(short)>
					_valueTypeSerializer.writeTypeSuffixForScalar(((Object) (null)), jsongenerator);
		//   22   41:aload_0         
		//   23   42:getfield        #48  <Field TypeSerializer _valueTypeSerializer>
		//   24   45:aconst_null     
		//   25   46:aload_2         
		//   26   47:invokevirtual   #166 <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
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
				for(int l = aword0.length; j < l; j++)
		//*  34   62:aload_1         
		//*  35   63:arraylength     
		//*  36   64:istore          5
		//*  37   66:iload           4
		//*  38   68:iload           5
		//*  39   70:icmpge          90
					jsongenerator.writeNumber(((int) (aword0[j])));
		//   40   73:aload_2         
		//   41   74:aload_1         
		//   42   75:iload           4
		//   43   77:saload          
		//   44   78:invokevirtual   #168 <Method void JsonGenerator.writeNumber(int)>

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

		public ShortArraySerializer(ShortArraySerializer shortarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer, Boolean boolean1)
		{
			super(((TypedPrimitiveArraySerializer) (shortarrayserializer)), beanproperty, typeserializer, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #42  <Method void StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty, TypeSerializer, Boolean)>
		//    6    9:return          
		}
	}

	protected static abstract class TypedPrimitiveArraySerializer extends ArraySerializerBase
	{

		protected final TypeSerializer _valueTypeSerializer;

		protected TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer typedprimitivearrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer, Boolean boolean1)
		{
			super(((ArraySerializerBase) (typedprimitivearrayserializer)), beanproperty, boolean1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload           4
		//    4    5:invokespecial   #15  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
			_valueTypeSerializer = typeserializer;
		//    5    8:aload_0         
		//    6    9:aload_3         
		//    7   10:putfield        #17  <Field TypeSerializer _valueTypeSerializer>
		//    8   13:return          
		}

		protected TypedPrimitiveArraySerializer(Class class1)
		{
			super(class1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void ArraySerializerBase(Class)>
			_valueTypeSerializer = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #17  <Field TypeSerializer _valueTypeSerializer>
		//    6   10:return          
		}
	}


	protected StdArraySerializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
	//    2    4:return          
	}

	public static JsonSerializer findStandardImpl(Class class1)
	{
		return (JsonSerializer)_arraySerializers.get(((Object) (class1.getName())));
	//    0    0:getstatic       #40  <Field HashMap _arraySerializers>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #48  <Method String Class.getName()>
	//    3    7:invokevirtual   #84  <Method Object HashMap.get(Object)>
	//    4   10:checkcast       #86  <Class JsonSerializer>
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
