// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.sql.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.regex.Pattern;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			ToStringSerializer, UUIDSerializer, FileSerializer, ClassSerializer, 
//			NullSerializer, DateSerializer, SqlDateSerializer, SqlTimeSerializer, 
//			StdScalarSerializer

public class StdJdkSerializers
{
	public static class AtomicBooleanSerializer extends StdScalarSerializer
	{

		public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			jsonformatvisitorwrapper.expectBooleanFormat(javatype);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokeinterface #26  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonBooleanFormatVisitor JsonFormatVisitorWrapper.expectBooleanFormat(JavaType)>
		//    3    7:pop             
		//    4    8:return          
		}

		public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return ((JsonNode) (createSchemaNode("boolean", true)));
		//    0    0:aload_0         
		//    1    1:ldc1            #31  <String "boolean">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #35  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
		//    4    7:areturn         
		}

		public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			serialize((AtomicBoolean)obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #12  <Class AtomicBoolean>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #42  <Method void serialize(AtomicBoolean, JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serialize(AtomicBoolean atomicboolean, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException, JsonGenerationException
		{
			jsongenerator.writeBoolean(atomicboolean.get());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #48  <Method boolean AtomicBoolean.get()>
		//    3    5:invokevirtual   #54  <Method void JsonGenerator.writeBoolean(boolean)>
		//    4    8:return          
		}

		public AtomicBooleanSerializer()
		{
			super(java/util/concurrent/atomic/AtomicBoolean, false);
		//    0    0:aload_0         
		//    1    1:ldc1            #12  <Class AtomicBoolean>
		//    2    3:iconst_0        
		//    3    4:invokespecial   #15  <Method void StdScalarSerializer(Class, boolean)>
		//    4    7:return          
		}
	}

	public static class AtomicIntegerSerializer extends StdScalarSerializer
	{

		public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			visitIntFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.INT);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #26  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
		//    4    6:invokevirtual   #30  <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
		//    5    9:return          
		}

		public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return ((JsonNode) (createSchemaNode("integer", true)));
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <String "integer">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #39  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
		//    4    7:areturn         
		}

		public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			serialize((AtomicInteger)obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #12  <Class AtomicInteger>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #46  <Method void serialize(AtomicInteger, JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serialize(AtomicInteger atomicinteger, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException, JsonGenerationException
		{
			jsongenerator.writeNumber(atomicinteger.get());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #52  <Method int AtomicInteger.get()>
		//    3    5:invokevirtual   #58  <Method void JsonGenerator.writeNumber(int)>
		//    4    8:return          
		}

		public AtomicIntegerSerializer()
		{
			super(java/util/concurrent/atomic/AtomicInteger, false);
		//    0    0:aload_0         
		//    1    1:ldc1            #12  <Class AtomicInteger>
		//    2    3:iconst_0        
		//    3    4:invokespecial   #15  <Method void StdScalarSerializer(Class, boolean)>
		//    4    7:return          
		}
	}

	public static class AtomicLongSerializer extends StdScalarSerializer
	{

		public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			visitIntFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.LONG);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:getstatic       #26  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
		//    4    6:invokevirtual   #30  <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
		//    5    9:return          
		}

		public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		{
			return ((JsonNode) (createSchemaNode("integer", true)));
		//    0    0:aload_0         
		//    1    1:ldc1            #35  <String "integer">
		//    2    3:iconst_1        
		//    3    4:invokevirtual   #39  <Method com.fasterxml.jackson.databind.node.ObjectNode createSchemaNode(String, boolean)>
		//    4    7:areturn         
		}

		public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			serialize((AtomicLong)obj, jsongenerator, serializerprovider);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #12  <Class AtomicLong>
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #46  <Method void serialize(AtomicLong, JsonGenerator, SerializerProvider)>
		//    6   10:return          
		}

		public void serialize(AtomicLong atomiclong, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException, JsonGenerationException
		{
			jsongenerator.writeNumber(atomiclong.get());
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #52  <Method long AtomicLong.get()>
		//    3    5:invokevirtual   #58  <Method void JsonGenerator.writeNumber(long)>
		//    4    8:return          
		}

		public AtomicLongSerializer()
		{
			super(java/util/concurrent/atomic/AtomicLong, false);
		//    0    0:aload_0         
		//    1    1:ldc1            #12  <Class AtomicLong>
		//    2    3:iconst_0        
		//    3    4:invokespecial   #15  <Method void StdScalarSerializer(Class, boolean)>
		//    4    7:return          
		}
	}


	public static Collection all()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #19  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void HashMap()>
	//    3    7:astore_0        
		hashmap.put(java/net/URL, ((Object) (new ToStringSerializer(java/net/URL))));
	//    4    8:aload_0         
	//    5    9:ldc1            #25  <Class URL>
	//    6   11:new             #27  <Class ToStringSerializer>
	//    7   14:dup             
	//    8   15:ldc1            #25  <Class URL>
	//    9   17:invokespecial   #30  <Method void ToStringSerializer(Class)>
	//   10   20:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   11   23:pop             
		hashmap.put(java/net/URI, ((Object) (new ToStringSerializer(java/net/URI))));
	//   12   24:aload_0         
	//   13   25:ldc1            #36  <Class URI>
	//   14   27:new             #27  <Class ToStringSerializer>
	//   15   30:dup             
	//   16   31:ldc1            #36  <Class URI>
	//   17   33:invokespecial   #30  <Method void ToStringSerializer(Class)>
	//   18   36:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   19   39:pop             
		hashmap.put(java/util/Currency, ((Object) (new ToStringSerializer(java/util/Currency))));
	//   20   40:aload_0         
	//   21   41:ldc1            #38  <Class Currency>
	//   22   43:new             #27  <Class ToStringSerializer>
	//   23   46:dup             
	//   24   47:ldc1            #38  <Class Currency>
	//   25   49:invokespecial   #30  <Method void ToStringSerializer(Class)>
	//   26   52:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   27   55:pop             
		hashmap.put(java/util/UUID, ((Object) (new UUIDSerializer())));
	//   28   56:aload_0         
	//   29   57:ldc1            #40  <Class UUID>
	//   30   59:new             #42  <Class UUIDSerializer>
	//   31   62:dup             
	//   32   63:invokespecial   #43  <Method void UUIDSerializer()>
	//   33   66:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   34   69:pop             
		hashmap.put(java/util/regex/Pattern, ((Object) (new ToStringSerializer(java/util/regex/Pattern))));
	//   35   70:aload_0         
	//   36   71:ldc1            #45  <Class Pattern>
	//   37   73:new             #27  <Class ToStringSerializer>
	//   38   76:dup             
	//   39   77:ldc1            #45  <Class Pattern>
	//   40   79:invokespecial   #30  <Method void ToStringSerializer(Class)>
	//   41   82:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   42   85:pop             
		hashmap.put(java/util/Locale, ((Object) (new ToStringSerializer(java/util/Locale))));
	//   43   86:aload_0         
	//   44   87:ldc1            #47  <Class Locale>
	//   45   89:new             #27  <Class ToStringSerializer>
	//   46   92:dup             
	//   47   93:ldc1            #47  <Class Locale>
	//   48   95:invokespecial   #30  <Method void ToStringSerializer(Class)>
	//   49   98:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   50  101:pop             
		hashmap.put(java/util/concurrent/atomic/AtomicBoolean, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicBooleanSerializer);
	//   51  102:aload_0         
	//   52  103:ldc1            #49  <Class AtomicBoolean>
	//   53  105:ldc1            #6   <Class StdJdkSerializers$AtomicBooleanSerializer>
	//   54  107:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   55  110:pop             
		hashmap.put(java/util/concurrent/atomic/AtomicInteger, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicIntegerSerializer);
	//   56  111:aload_0         
	//   57  112:ldc1            #51  <Class AtomicInteger>
	//   58  114:ldc1            #9   <Class StdJdkSerializers$AtomicIntegerSerializer>
	//   59  116:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   60  119:pop             
		hashmap.put(java/util/concurrent/atomic/AtomicLong, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicLongSerializer);
	//   61  120:aload_0         
	//   62  121:ldc1            #53  <Class AtomicLong>
	//   63  123:ldc1            #12  <Class StdJdkSerializers$AtomicLongSerializer>
	//   64  125:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   65  128:pop             
		hashmap.put(java/io/File, com/fasterxml/jackson/databind/ser/std/FileSerializer);
	//   66  129:aload_0         
	//   67  130:ldc1            #55  <Class File>
	//   68  132:ldc1            #57  <Class FileSerializer>
	//   69  134:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   70  137:pop             
		hashmap.put(java/lang/Class, com/fasterxml/jackson/databind/ser/std/ClassSerializer);
	//   71  138:aload_0         
	//   72  139:ldc1            #59  <Class Class>
	//   73  141:ldc1            #61  <Class ClassSerializer>
	//   74  143:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   75  146:pop             
		hashmap.put(java/lang/Void, ((Object) (NullSerializer.instance)));
	//   76  147:aload_0         
	//   77  148:ldc1            #63  <Class Void>
	//   78  150:getstatic       #69  <Field NullSerializer NullSerializer.instance>
	//   79  153:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   80  156:pop             
		hashmap.put(((Object) (Void.TYPE)), ((Object) (NullSerializer.instance)));
	//   81  157:aload_0         
	//   82  158:getstatic       #73  <Field Class Void.TYPE>
	//   83  161:getstatic       #69  <Field NullSerializer NullSerializer.instance>
	//   84  164:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   85  167:pop             
		try
		{
			hashmap.put(java/sql/Timestamp, ((Object) (DateSerializer.instance)));
	//   86  168:aload_0         
	//   87  169:ldc1            #75  <Class Timestamp>
	//   88  171:getstatic       #80  <Field DateSerializer DateSerializer.instance>
	//   89  174:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   90  177:pop             
			hashmap.put(java/sql/Date, com/fasterxml/jackson/databind/ser/std/SqlDateSerializer);
	//   91  178:aload_0         
	//   92  179:ldc1            #82  <Class Date>
	//   93  181:ldc1            #84  <Class SqlDateSerializer>
	//   94  183:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//   95  186:pop             
			hashmap.put(java/sql/Time, com/fasterxml/jackson/databind/ser/std/SqlTimeSerializer);
	//   96  187:aload_0         
	//   97  188:ldc1            #86  <Class Time>
	//   98  190:ldc1            #88  <Class SqlTimeSerializer>
	//   99  192:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//  100  195:pop             
		}
	//* 101  196:aload_0         
	//* 102  197:invokevirtual   #92  <Method java.util.Set HashMap.entrySet()>
	//* 103  200:areturn         
		catch(NoClassDefFoundError noclassdeffounderror) { }
	//  104  201:astore_1        
		return ((Collection) (hashmap.entrySet()));
	//* 105  202:goto            196
	}
}
