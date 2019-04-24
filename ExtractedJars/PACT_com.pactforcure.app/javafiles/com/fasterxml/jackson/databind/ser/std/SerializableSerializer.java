// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class SerializableSerializer extends StdSerializer
{

	protected SerializableSerializer()
	{
		super(com/fasterxml/jackson/databind/JsonSerializable);
	//    0    0:aload_0         
	//    1    1:ldc1            #26  <Class JsonSerializable>
	//    2    3:invokespecial   #29  <Method void StdSerializer(Class)>
	//    3    6:return          
	}

	private static final ObjectMapper _getObjectMapper()
	{
		com/fasterxml/jackson/databind/ser/std/SerializableSerializer;
	//    0    0:ldc1            #2   <Class SerializableSerializer>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		ObjectMapper objectmapper1 = (ObjectMapper)_mapperReference.get();
	//    2    3:getstatic       #23  <Field AtomicReference _mapperReference>
	//    3    6:invokevirtual   #35  <Method Object AtomicReference.get()>
	//    4    9:checkcast       #37  <Class ObjectMapper>
	//    5   12:astore_1        
		ObjectMapper objectmapper;
		objectmapper = objectmapper1;
	//    6   13:aload_1         
	//    7   14:astore_0        
		if(objectmapper1 != null)
			break MISSING_BLOCK_LABEL_34;
	//    8   15:aload_1         
	//    9   16:ifnonnull       34
		objectmapper = new ObjectMapper();
	//   10   19:new             #37  <Class ObjectMapper>
	//   11   22:dup             
	//   12   23:invokespecial   #38  <Method void ObjectMapper()>
	//   13   26:astore_0        
		_mapperReference.set(((Object) (objectmapper)));
	//   14   27:getstatic       #23  <Field AtomicReference _mapperReference>
	//   15   30:aload_0         
	//   16   31:invokevirtual   #42  <Method void AtomicReference.set(Object)>
		com/fasterxml/jackson/databind/ser/std/SerializableSerializer;
	//   17   34:ldc1            #2   <Class SerializableSerializer>
		JVM INSTR monitorexit ;
	//   18   36:monitorexit     
		return objectmapper;
	//   19   37:aload_0         
	//   20   38:areturn         
		Exception exception;
		exception;
	//   21   39:astore_0        
	//*  22   40:ldc1            #2   <Class SerializableSerializer>
		throw exception;
	//   23   42:monitorexit     
	//   24   43:aload_0         
	//   25   44:athrow          
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectAnyFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #52  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		ObjectNode objectnode = createObjectNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method ObjectNode createObjectNode()>
	//    2    4:astore          10
		String s2 = "any";
	//    3    6:ldc1            #63  <String "any">
	//    4    8:astore          8
		Object obj2 = null;
	//    5   10:aconst_null     
	//    6   11:astore          9
		Object obj1 = null;
	//    7   13:aconst_null     
	//    8   14:astore          7
		Object obj = null;
	//    9   16:aconst_null     
	//   10   17:astore          6
		String s1 = ((String) (obj));
	//   11   19:aload           6
	//   12   21:astore          5
		Type type1 = ((Type) (obj2));
	//   13   23:aload           9
	//   14   25:astore_3        
		String s = s2;
	//   15   26:aload           8
	//   16   28:astore          4
		if(type != null)
	//*  17   30:aload_2         
	//*  18   31:ifnull          145
		{
			type = ((Type) (TypeFactory.rawClass(type)));
	//   19   34:aload_2         
	//   20   35:invokestatic    #69  <Method Class TypeFactory.rawClass(Type)>
	//   21   38:astore_2        
			s1 = ((String) (obj));
	//   22   39:aload           6
	//   23   41:astore          5
			type1 = ((Type) (obj2));
	//   24   43:aload           9
	//   25   45:astore_3        
			s = s2;
	//   26   46:aload           8
	//   27   48:astore          4
			if(((Class) (type)).isAnnotationPresent(com/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema))
	//*  28   50:aload_2         
	//*  29   51:ldc1            #71  <Class JsonSerializableSchema>
	//*  30   53:invokevirtual   #77  <Method boolean Class.isAnnotationPresent(Class)>
	//*  31   56:ifeq            145
			{
				JsonSerializableSchema jsonserializableschema = (JsonSerializableSchema)((Class) (type)).getAnnotation(com/fasterxml/jackson/databind/jsonschema/JsonSerializableSchema);
	//   32   59:aload_2         
	//   33   60:ldc1            #71  <Class JsonSerializableSchema>
	//   34   62:invokevirtual   #81  <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//   35   65:checkcast       #71  <Class JsonSerializableSchema>
	//   36   68:astore          9
				String s3 = jsonserializableschema.schemaType();
	//   37   70:aload           9
	//   38   72:invokeinterface #85  <Method String JsonSerializableSchema.schemaType()>
	//   39   77:astore          8
				type = ((Type) (obj1));
	//   40   79:aload           7
	//   41   81:astore_2        
				if(!"##irrelevant".equals(((Object) (jsonserializableschema.schemaObjectPropertiesDefinition()))))
	//*  42   82:ldc1            #87  <String "##irrelevant">
	//*  43   84:aload           9
	//*  44   86:invokeinterface #90  <Method String JsonSerializableSchema.schemaObjectPropertiesDefinition()>
	//*  45   91:invokevirtual   #96  <Method boolean String.equals(Object)>
	//*  46   94:ifne            105
					type = ((Type) (jsonserializableschema.schemaObjectPropertiesDefinition()));
	//   47   97:aload           9
	//   48   99:invokeinterface #90  <Method String JsonSerializableSchema.schemaObjectPropertiesDefinition()>
	//   49  104:astore_2        
				s1 = ((String) (obj));
	//   50  105:aload           6
	//   51  107:astore          5
				type1 = type;
	//   52  109:aload_2         
	//   53  110:astore_3        
				s = s3;
	//   54  111:aload           8
	//   55  113:astore          4
				if(!"##irrelevant".equals(((Object) (jsonserializableschema.schemaItemDefinition()))))
	//*  56  115:ldc1            #87  <String "##irrelevant">
	//*  57  117:aload           9
	//*  58  119:invokeinterface #99  <Method String JsonSerializableSchema.schemaItemDefinition()>
	//*  59  124:invokevirtual   #96  <Method boolean String.equals(Object)>
	//*  60  127:ifne            145
				{
					s1 = jsonserializableschema.schemaItemDefinition();
	//   61  130:aload           9
	//   62  132:invokeinterface #99  <Method String JsonSerializableSchema.schemaItemDefinition()>
	//   63  137:astore          5
					s = s3;
	//   64  139:aload           8
	//   65  141:astore          4
					type1 = type;
	//   66  143:aload_2         
	//   67  144:astore_3        
				}
			}
		}
		objectnode.put("type", s);
	//   68  145:aload           10
	//   69  147:ldc1            #101 <String "type">
	//   70  149:aload           4
	//   71  151:invokevirtual   #107 <Method ObjectNode ObjectNode.put(String, String)>
	//   72  154:pop             
		if(type1 != null)
	//*  73  155:aload_3         
	//*  74  156:ifnull          174
			try
			{
				objectnode.set("properties", _getObjectMapper().readTree(((String) (type1))));
	//   75  159:aload           10
	//   76  161:ldc1            #109 <String "properties">
	//   77  163:invokestatic    #111 <Method ObjectMapper _getObjectMapper()>
	//   78  166:aload_3         
	//   79  167:invokevirtual   #115 <Method JsonNode ObjectMapper.readTree(String)>
	//   80  170:invokevirtual   #118 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//   81  173:pop             
			}
	//*  82  174:aload           5
	//*  83  176:ifnull          195
	//*  84  179:aload           10
	//*  85  181:ldc1            #120 <String "items">
	//*  86  183:invokestatic    #111 <Method ObjectMapper _getObjectMapper()>
	//*  87  186:aload           5
	//*  88  188:invokevirtual   #115 <Method JsonNode ObjectMapper.readTree(String)>
	//*  89  191:invokevirtual   #118 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//*  90  194:pop             
	//*  91  195:aload           10
	//*  92  197:areturn         
			// Misplaced declaration of an exception variable
			catch(Type type)
	//*  93  198:astore_2        
			{
				throw JsonMappingException.from(serializerprovider, "Failed to parse @JsonSerializableSchema.schemaObjectPropertiesDefinition value");
	//   94  199:aload_1         
	//   95  200:ldc1            #122 <String "Failed to parse @JsonSerializableSchema.schemaObjectPropertiesDefinition value">
	//   96  202:invokestatic    #126 <Method JsonMappingException JsonMappingException.from(SerializerProvider, String)>
	//   97  205:athrow          
			}
		if(s1 != null)
			try
			{
				objectnode.set("items", _getObjectMapper().readTree(s1));
			}
			// Misplaced declaration of an exception variable
			catch(Type type)
	//*  98  206:astore_2        
			{
				throw JsonMappingException.from(serializerprovider, "Failed to parse @JsonSerializableSchema.schemaItemDefinition value");
	//   99  207:aload_1         
	//  100  208:ldc1            #128 <String "Failed to parse @JsonSerializableSchema.schemaItemDefinition value">
	//  101  210:invokestatic    #126 <Method JsonMappingException JsonMappingException.from(SerializerProvider, String)>
	//  102  213:athrow          
			}
		return ((JsonNode) (objectnode));
	}

	public boolean isEmpty(SerializerProvider serializerprovider, JsonSerializable jsonserializable)
	{
		if(jsonserializable instanceof com.fasterxml.jackson.databind.JsonSerializable.Base)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #132 <Class com.fasterxml.jackson.databind.JsonSerializable$Base>
	//*   2    4:ifeq            16
			return ((com.fasterxml.jackson.databind.JsonSerializable.Base)jsonserializable).isEmpty(serializerprovider);
	//    3    7:aload_2         
	//    4    8:checkcast       #132 <Class com.fasterxml.jackson.databind.JsonSerializable$Base>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #135 <Method boolean com.fasterxml.jackson.databind.JsonSerializable$Base.isEmpty(SerializerProvider)>
	//    7   15:ireturn         
		else
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (JsonSerializable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #26  <Class JsonSerializable>
	//    4    6:invokevirtual   #138 <Method boolean isEmpty(SerializerProvider, JsonSerializable)>
	//    5    9:ireturn         
	}

	public void serialize(JsonSerializable jsonserializable, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsonserializable.serialize(jsongenerator, serializerprovider);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokeinterface #143 <Method void JsonSerializable.serialize(JsonGenerator, SerializerProvider)>
	//    4    8:return          
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((JsonSerializable)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class JsonSerializable>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #146 <Method void serialize(JsonSerializable, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serializeWithType(JsonSerializable jsonserializable, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		jsonserializable.serializeWithType(jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:invokeinterface #151 <Method void JsonSerializable.serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer)>
	//    5   10:return          
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((JsonSerializable)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class JsonSerializable>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #154 <Method void serializeWithType(JsonSerializable, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	private static final AtomicReference _mapperReference = new AtomicReference();
	public static final SerializableSerializer instance = new SerializableSerializer();

	static 
	{
	//    0    0:new             #2   <Class SerializableSerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void SerializableSerializer()>
	//    3    7:putstatic       #18  <Field SerializableSerializer instance>
	//    4   10:new             #20  <Class AtomicReference>
	//    5   13:dup             
	//    6   14:invokespecial   #21  <Method void AtomicReference()>
	//    7   17:putstatic       #23  <Field AtomicReference _mapperReference>
	//*   8   20:return          
	}
}
