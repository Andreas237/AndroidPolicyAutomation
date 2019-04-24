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


	public StdJdkSerializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static Collection all()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #24  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void HashMap()>
	//    3    7:astore_0        
		ToStringSerializer tostringserializer = ToStringSerializer.instance;
	//    4    8:getstatic       #31  <Field ToStringSerializer ToStringSerializer.instance>
	//    5   11:astore_1        
		hashmap.put(java/net/URL, ((Object) (tostringserializer)));
	//    6   12:aload_0         
	//    7   13:ldc1            #33  <Class URL>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   10   19:pop             
		hashmap.put(java/net/URI, ((Object) (tostringserializer)));
	//   11   20:aload_0         
	//   12   21:ldc1            #39  <Class URI>
	//   13   23:aload_1         
	//   14   24:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   15   27:pop             
		hashmap.put(java/util/Currency, ((Object) (tostringserializer)));
	//   16   28:aload_0         
	//   17   29:ldc1            #41  <Class Currency>
	//   18   31:aload_1         
	//   19   32:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   20   35:pop             
		hashmap.put(java/util/UUID, ((Object) (new UUIDSerializer())));
	//   21   36:aload_0         
	//   22   37:ldc1            #43  <Class UUID>
	//   23   39:new             #45  <Class UUIDSerializer>
	//   24   42:dup             
	//   25   43:invokespecial   #46  <Method void UUIDSerializer()>
	//   26   46:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   27   49:pop             
		hashmap.put(java/util/regex/Pattern, ((Object) (tostringserializer)));
	//   28   50:aload_0         
	//   29   51:ldc1            #48  <Class Pattern>
	//   30   53:aload_1         
	//   31   54:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   32   57:pop             
		hashmap.put(java/util/Locale, ((Object) (tostringserializer)));
	//   33   58:aload_0         
	//   34   59:ldc1            #50  <Class Locale>
	//   35   61:aload_1         
	//   36   62:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   37   65:pop             
		hashmap.put(java/util/concurrent/atomic/AtomicBoolean, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicBooleanSerializer);
	//   38   66:aload_0         
	//   39   67:ldc1            #52  <Class AtomicBoolean>
	//   40   69:ldc1            #6   <Class StdJdkSerializers$AtomicBooleanSerializer>
	//   41   71:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   42   74:pop             
		hashmap.put(java/util/concurrent/atomic/AtomicInteger, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicIntegerSerializer);
	//   43   75:aload_0         
	//   44   76:ldc1            #54  <Class AtomicInteger>
	//   45   78:ldc1            #9   <Class StdJdkSerializers$AtomicIntegerSerializer>
	//   46   80:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   47   83:pop             
		hashmap.put(java/util/concurrent/atomic/AtomicLong, com/fasterxml/jackson/databind/ser/std/StdJdkSerializers$AtomicLongSerializer);
	//   48   84:aload_0         
	//   49   85:ldc1            #56  <Class AtomicLong>
	//   50   87:ldc1            #12  <Class StdJdkSerializers$AtomicLongSerializer>
	//   51   89:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   52   92:pop             
		hashmap.put(java/io/File, com/fasterxml/jackson/databind/ser/std/FileSerializer);
	//   53   93:aload_0         
	//   54   94:ldc1            #58  <Class File>
	//   55   96:ldc1            #60  <Class FileSerializer>
	//   56   98:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   57  101:pop             
		hashmap.put(java/lang/Class, com/fasterxml/jackson/databind/ser/std/ClassSerializer);
	//   58  102:aload_0         
	//   59  103:ldc1            #62  <Class Class>
	//   60  105:ldc1            #64  <Class ClassSerializer>
	//   61  107:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   62  110:pop             
		hashmap.put(java/lang/Void, ((Object) (NullSerializer.instance)));
	//   63  111:aload_0         
	//   64  112:ldc1            #66  <Class Void>
	//   65  114:getstatic       #71  <Field NullSerializer NullSerializer.instance>
	//   66  117:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   67  120:pop             
		hashmap.put(((Object) (Void.TYPE)), ((Object) (NullSerializer.instance)));
	//   68  121:aload_0         
	//   69  122:getstatic       #75  <Field Class Void.TYPE>
	//   70  125:getstatic       #71  <Field NullSerializer NullSerializer.instance>
	//   71  128:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   72  131:pop             
		try
		{
			hashmap.put(java/sql/Timestamp, ((Object) (DateSerializer.instance)));
	//   73  132:aload_0         
	//   74  133:ldc1            #77  <Class Timestamp>
	//   75  135:getstatic       #82  <Field DateSerializer DateSerializer.instance>
	//   76  138:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   77  141:pop             
			hashmap.put(java/sql/Date, com/fasterxml/jackson/databind/ser/std/SqlDateSerializer);
	//   78  142:aload_0         
	//   79  143:ldc1            #84  <Class Date>
	//   80  145:ldc1            #86  <Class SqlDateSerializer>
	//   81  147:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   82  150:pop             
			hashmap.put(java/sql/Time, com/fasterxml/jackson/databind/ser/std/SqlTimeSerializer);
	//   83  151:aload_0         
	//   84  152:ldc1            #88  <Class Time>
	//   85  154:ldc1            #90  <Class SqlTimeSerializer>
	//   86  156:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   87  159:pop             
		}
	//*  88  160:aload_0         
	//*  89  161:invokevirtual   #94  <Method java.util.Set HashMap.entrySet()>
	//*  90  164:areturn         
		catch(NoClassDefFoundError noclassdeffounderror) { }
	//   91  165:astore_1        
		return ((Collection) (hashmap.entrySet()));
	//*  92  166:goto            160
	}
}
