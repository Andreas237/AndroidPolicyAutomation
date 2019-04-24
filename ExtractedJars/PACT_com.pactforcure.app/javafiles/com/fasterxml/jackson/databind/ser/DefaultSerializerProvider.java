// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			SerializerCache, SerializerFactory

public abstract class DefaultSerializerProvider extends SerializerProvider
	implements Serializable
{
	public static final class Impl extends DefaultSerializerProvider
	{

		public DefaultSerializerProvider copy()
		{
			if(((Object)this).getClass() != com/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #29  <Method Class Object.getClass()>
		//*   2    4:ldc1            #2   <Class DefaultSerializerProvider$Impl>
		//*   3    6:if_acmpeq       14
				return copy();
		//    4    9:aload_0         
		//    5   10:invokespecial   #31  <Method DefaultSerializerProvider DefaultSerializerProvider.copy()>
		//    6   13:areturn         
			else
				return ((DefaultSerializerProvider) (new Impl(this)));
		//    7   14:new             #2   <Class DefaultSerializerProvider$Impl>
		//    8   17:dup             
		//    9   18:aload_0         
		//   10   19:invokespecial   #33  <Method void DefaultSerializerProvider$Impl(DefaultSerializerProvider$Impl)>
		//   11   22:areturn         
		}

		public Impl createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
		{
			return new Impl(((SerializerProvider) (this)), serializationconfig, serializerfactory);
		//    0    0:new             #2   <Class DefaultSerializerProvider$Impl>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #36  <Method void DefaultSerializerProvider$Impl(SerializerProvider, SerializationConfig, SerializerFactory)>
		//    6   10:areturn         
		}

		public volatile DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
		{
			return ((DefaultSerializerProvider) (createInstance(serializationconfig, serializerfactory)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #39  <Method DefaultSerializerProvider$Impl createInstance(SerializationConfig, SerializerFactory)>
		//    4    6:areturn         
		}

		private static final long serialVersionUID = 1L;

		public Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void DefaultSerializerProvider()>
		//    2    4:return          
		}

		protected Impl(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
		{
			super(serializerprovider, serializationconfig, serializerfactory);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #17  <Method void DefaultSerializerProvider(SerializerProvider, SerializationConfig, SerializerFactory)>
		//    5    7:return          
		}

		public Impl(Impl impl)
		{
			super(((DefaultSerializerProvider) (impl)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void DefaultSerializerProvider(DefaultSerializerProvider)>
		//    3    5:return          
		}
	}


	protected DefaultSerializerProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void SerializerProvider()>
	//    2    4:return          
	}

	protected DefaultSerializerProvider(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
	{
		super(serializerprovider, serializationconfig, serializerfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #27  <Method void SerializerProvider(SerializerProvider, SerializationConfig, SerializerFactory)>
	//    5    7:return          
	}

	protected DefaultSerializerProvider(DefaultSerializerProvider defaultserializerprovider)
	{
		super(((SerializerProvider) (defaultserializerprovider)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void SerializerProvider(SerializerProvider)>
	//    3    5:return          
	}

	protected Map _createObjectIdMap()
	{
		if(isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #39  <Field SerializationFeature SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID>
	//*   2    4:invokevirtual   #43  <Method boolean isEnabled(SerializationFeature)>
	//*   3    7:ifeq            18
			return ((Map) (new HashMap()));
	//    4   10:new             #45  <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #46  <Method void HashMap()>
	//    7   17:areturn         
		else
			return ((Map) (new IdentityHashMap()));
	//    8   18:new             #48  <Class IdentityHashMap>
	//    9   21:dup             
	//   10   22:invokespecial   #49  <Method void IdentityHashMap()>
	//   11   25:areturn         
	}

	protected void _serializeNull(JsonGenerator jsongenerator)
		throws IOException
	{
		JsonSerializer jsonserializer = getDefaultNullValueSerializer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method JsonSerializer getDefaultNullValueSerializer()>
	//    2    4:astore_2        
		try
		{
			jsonserializer.serialize(((Object) (null)), jsongenerator, ((SerializerProvider) (this)));
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #67  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//    8   12:return          
		}
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//*   9   13:astore_1        
		{
			throw jsongenerator;
	//   10   14:aload_1         
	//   11   15:athrow          
		}
		catch(Exception exception)
	//*  12   16:astore          4
		{
			String s1 = exception.getMessage();
	//   13   18:aload           4
	//   14   20:invokevirtual   #71  <Method String Exception.getMessage()>
	//   15   23:astore_3        
			String s = s1;
	//   16   24:aload_3         
	//   17   25:astore_2        
			if(s1 == null)
	//*  18   26:aload_3         
	//*  19   27:ifnonnull       62
				s = (new StringBuilder()).append("[no message for ").append(((Object) (exception)).getClass().getName()).append("]").toString();
	//   20   30:new             #73  <Class StringBuilder>
	//   21   33:dup             
	//   22   34:invokespecial   #74  <Method void StringBuilder()>
	//   23   37:ldc1            #76  <String "[no message for ">
	//   24   39:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   25   42:aload           4
	//   26   44:invokevirtual   #86  <Method Class Object.getClass()>
	//   27   47:invokevirtual   #91  <Method String Class.getName()>
	//   28   50:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:ldc1            #93  <String "]">
	//   30   55:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   32   61:astore_2        
			throw JsonMappingException.from(jsongenerator, s, ((Throwable) (exception)));
	//   33   62:aload_1         
	//   34   63:aload_2         
	//   35   64:aload           4
	//   36   66:invokestatic    #102 <Method JsonMappingException JsonMappingException.from(JsonGenerator, String, Throwable)>
	//   37   69:athrow          
		}
	}

	public void acceptJsonFormatVisitor(JavaType javatype, JsonFormatVisitorWrapper jsonformatvisitorwrapper)
		throws JsonMappingException
	{
		if(javatype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("A class must be provided");
	//    2    4:new             #107 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #109 <String "A class must be provided">
	//    5   10:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			jsonformatvisitorwrapper.setProvider(((SerializerProvider) (this)));
	//    7   14:aload_2         
	//    8   15:aload_0         
	//    9   16:invokeinterface #117 <Method void JsonFormatVisitorWrapper.setProvider(SerializerProvider)>
			findValueSerializer(javatype, ((com.fasterxml.jackson.databind.BeanProperty) (null))).acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:aconst_null     
	//   13   24:invokevirtual   #121 <Method JsonSerializer findValueSerializer(JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #124 <Method void JsonSerializer.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
			return;
	//   17   32:return          
		}
	}

	public int cachedSerializersCount()
	{
		return _serializerCache.size();
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field SerializerCache _serializerCache>
	//    2    4:invokevirtual   #135 <Method int SerializerCache.size()>
	//    3    7:ireturn         
	}

	public DefaultSerializerProvider copy()
	{
		throw new IllegalStateException("DefaultSerializerProvider sub-class not overriding copy()");
	//    0    0:new             #139 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #141 <String "DefaultSerializerProvider sub-class not overriding copy()">
	//    3    6:invokespecial   #142 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory);

	public WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator)
	{
		Object obj1;
		ObjectIdGenerator objectidgenerator1;
		if(_seenObjectIds == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field Map _seenObjectIds>
	//*   2    4:ifnonnull       92
		{
			_seenObjectIds = _createObjectIdMap();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #150 <Method Map _createObjectIdMap()>
	//    6   12:putfield        #148 <Field Map _seenObjectIds>
		} else
	//*   7   15:aconst_null     
	//*   8   16:astore          6
	//*   9   18:aload_0         
	//*  10   19:getfield        #152 <Field ArrayList _objectIdGenerators>
	//*  11   22:ifnonnull       115
	//*  12   25:aload_0         
	//*  13   26:new             #154 <Class ArrayList>
	//*  14   29:dup             
	//*  15   30:bipush          8
	//*  16   32:invokespecial   #157 <Method void ArrayList(int)>
	//*  17   35:putfield        #152 <Field ArrayList _objectIdGenerators>
	//*  18   38:aload           6
	//*  19   40:astore          5
	//*  20   42:aload           5
	//*  21   44:astore          6
	//*  22   46:aload           5
	//*  23   48:ifnonnull       68
	//*  24   51:aload_2         
	//*  25   52:aload_0         
	//*  26   53:invokevirtual   #163 <Method ObjectIdGenerator ObjectIdGenerator.newForSerialization(Object)>
	//*  27   56:astore          6
	//*  28   58:aload_0         
	//*  29   59:getfield        #152 <Field ArrayList _objectIdGenerators>
	//*  30   62:aload           6
	//*  31   64:invokevirtual   #167 <Method boolean ArrayList.add(Object)>
	//*  32   67:pop             
	//*  33   68:new             #169 <Class WritableObjectId>
	//*  34   71:dup             
	//*  35   72:aload           6
	//*  36   74:invokespecial   #172 <Method void WritableObjectId(ObjectIdGenerator)>
	//*  37   77:astore_2        
	//*  38   78:aload_0         
	//*  39   79:getfield        #148 <Field Map _seenObjectIds>
	//*  40   82:aload_1         
	//*  41   83:aload_2         
	//*  42   84:invokeinterface #178 <Method Object Map.put(Object, Object)>
	//*  43   89:pop             
	//*  44   90:aload_2         
	//*  45   91:areturn         
		{
			obj1 = ((Object) ((WritableObjectId)_seenObjectIds.get(obj)));
	//   46   92:aload_0         
	//   47   93:getfield        #148 <Field Map _seenObjectIds>
	//   48   96:aload_1         
	//   49   97:invokeinterface #182 <Method Object Map.get(Object)>
	//   50  102:checkcast       #169 <Class WritableObjectId>
	//   51  105:astore          5
			if(obj1 != null)
	//*  52  107:aload           5
	//*  53  109:ifnull          15
				return ((WritableObjectId) (obj1));
	//   54  112:aload           5
	//   55  114:areturn         
		}
		objectidgenerator1 = null;
		if(_objectIdGenerators != null) goto _L2; else goto _L1
_L1:
		_objectIdGenerators = new ArrayList(8);
		obj1 = ((Object) (objectidgenerator1));
_L4:
		objectidgenerator1 = ((ObjectIdGenerator) (obj1));
		if(obj1 == null)
		{
			objectidgenerator1 = objectidgenerator.newForSerialization(((Object) (this)));
			_objectIdGenerators.add(((Object) (objectidgenerator1)));
		}
		objectidgenerator = ((ObjectIdGenerator) (new WritableObjectId(objectidgenerator1)));
		_seenObjectIds.put(obj, ((Object) (objectidgenerator)));
		return ((WritableObjectId) (objectidgenerator));
_L2:
		int i;
		int j;
		i = 0;
	//   56  115:iconst_0        
	//   57  116:istore_3        
		j = _objectIdGenerators.size();
	//   58  117:aload_0         
	//   59  118:getfield        #152 <Field ArrayList _objectIdGenerators>
	//   60  121:invokevirtual   #183 <Method int ArrayList.size()>
	//   61  124:istore          4
_L6:
		obj1 = ((Object) (objectidgenerator1));
	//   62  126:aload           6
	//   63  128:astore          5
		if(i >= j) goto _L4; else goto _L3
	//   64  130:iload_3         
	//   65  131:iload           4
	//   66  133:icmpge          42
_L3:
		obj1 = ((Object) ((ObjectIdGenerator)_objectIdGenerators.get(i)));
	//   67  136:aload_0         
	//   68  137:getfield        #152 <Field ArrayList _objectIdGenerators>
	//   69  140:iload_3         
	//   70  141:invokevirtual   #186 <Method Object ArrayList.get(int)>
	//   71  144:checkcast       #159 <Class ObjectIdGenerator>
	//   72  147:astore          5
		if(!((ObjectIdGenerator) (obj1)).canUseFor(objectidgenerator)) goto _L5; else goto _L4
	//   73  149:aload           5
	//   74  151:aload_2         
	//   75  152:invokevirtual   #190 <Method boolean ObjectIdGenerator.canUseFor(ObjectIdGenerator)>
	//   76  155:ifeq            161
	//*  77  158:goto            42
_L5:
		i++;
	//   78  161:iload_3         
	//   79  162:iconst_1        
	//   80  163:iadd            
	//   81  164:istore_3        
		  goto _L6
	//*  82  165:goto            126
	}

	public void flushCachedSerializers()
	{
		_serializerCache.flush();
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field SerializerCache _serializerCache>
	//    2    4:invokevirtual   #195 <Method void SerializerCache.flush()>
	//    3    7:return          
	}

	public JsonSchema generateJsonSchema(Class class1)
		throws JsonMappingException
	{
		if(class1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("A class must be provided");
	//    2    4:new             #107 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #109 <String "A class must be provided">
	//    5   10:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		Object obj = ((Object) (findValueSerializer(class1, ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aconst_null     
	//   10   17:invokevirtual   #201 <Method JsonSerializer findValueSerializer(Class, com.fasterxml.jackson.databind.BeanProperty)>
	//   11   20:astore_2        
		if(obj instanceof SchemaAware)
	//*  12   21:aload_2         
	//*  13   22:instanceof      #203 <Class SchemaAware>
	//*  14   25:ifeq            82
			obj = ((Object) (((SchemaAware)obj).getSchema(((SerializerProvider) (this)), ((java.lang.reflect.Type) (null)))));
	//   15   28:aload_2         
	//   16   29:checkcast       #203 <Class SchemaAware>
	//   17   32:aload_0         
	//   18   33:aconst_null     
	//   19   34:invokeinterface #207 <Method com.fasterxml.jackson.databind.JsonNode SchemaAware.getSchema(SerializerProvider, java.lang.reflect.Type)>
	//   20   39:astore_2        
		else
	//*  21   40:aload_2         
	//*  22   41:instanceof      #209 <Class ObjectNode>
	//*  23   44:ifne            89
	//*  24   47:new             #107 <Class IllegalArgumentException>
	//*  25   50:dup             
	//*  26   51:new             #73  <Class StringBuilder>
	//*  27   54:dup             
	//*  28   55:invokespecial   #74  <Method void StringBuilder()>
	//*  29   58:ldc1            #211 <String "Class ">
	//*  30   60:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  31   63:aload_1         
	//*  32   64:invokevirtual   #91  <Method String Class.getName()>
	//*  33   67:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  34   70:ldc1            #213 <String " would not be serialized as a JSON object and therefore has no schema">
	//*  35   72:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//*  36   75:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  37   78:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//*  38   81:athrow          
			obj = ((Object) (JsonSchema.getDefaultSchemaNode()));
	//   39   82:invokestatic    #219 <Method com.fasterxml.jackson.databind.JsonNode JsonSchema.getDefaultSchemaNode()>
	//   40   85:astore_2        
		if(!(obj instanceof ObjectNode))
			throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(class1.getName()).append(" would not be serialized as a JSON object and therefore has no schema").toString());
		else
	//*  41   86:goto            40
			return new JsonSchema((ObjectNode)obj);
	//   42   89:new             #215 <Class JsonSchema>
	//   43   92:dup             
	//   44   93:aload_2         
	//   45   94:checkcast       #209 <Class ObjectNode>
	//   46   97:invokespecial   #222 <Method void JsonSchema(ObjectNode)>
	//   47  100:areturn         
	}

	public boolean hasSerializerFor(Class class1, AtomicReference atomicreference)
	{
		if(class1 != java/lang/Object || _config.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ldc1            #82  <Class Object>
	//    2    3:if_acmpne       21
	//    3    6:aload_0         
	//    4    7:getfield        #232 <Field SerializationConfig _config>
	//    5   10:getstatic       #235 <Field SerializationFeature SerializationFeature.FAIL_ON_EMPTY_BEANS>
	//    6   13:invokevirtual   #238 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//    7   16:ifne            21
_L1:
		return true;
	//    8   19:iconst_1        
	//    9   20:ireturn         
	//*  10   21:aload_0         
	//*  11   22:aload_1         
	//*  12   23:invokevirtual   #242 <Method JsonSerializer _findExplicitUntypedSerializer(Class)>
	//*  13   26:astore_1        
_L2:
		if((class1 = ((Class) (_findExplicitUntypedSerializer(class1)))) != null) goto _L1; else goto _L3
	//   14   27:aload_1         
	//   15   28:ifnonnull       19
_L3:
		return false;
	//   16   31:iconst_0        
	//   17   32:ireturn         
		class1;
	//   18   33:astore_1        
		if(atomicreference != null)
	//*  19   34:aload_2         
	//*  20   35:ifnull          43
			atomicreference.set(((Object) (class1)));
	//   21   38:aload_2         
	//   22   39:aload_1         
	//   23   40:invokevirtual   #248 <Method void AtomicReference.set(Object)>
_L5:
		return false;
	//   24   43:iconst_0        
	//   25   44:ireturn         
		class1;
	//   26   45:astore_1        
		if(atomicreference == null)
	//*  27   46:aload_2         
	//*  28   47:ifnonnull       52
			throw class1;
	//   29   50:aload_1         
	//   30   51:athrow          
		atomicreference.set(((Object) (class1)));
	//   31   52:aload_2         
	//   32   53:aload_1         
	//   33   54:invokevirtual   #248 <Method void AtomicReference.set(Object)>
		if(true) goto _L5; else goto _L4
	//   34   57:goto            43
_L4:
	}

	public void serializePolymorphic(JsonGenerator jsongenerator, Object obj, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer)
		throws IOException
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnonnull       10
_L1:
		_serializeNull(jsongenerator);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #253 <Method void _serializeNull(JsonGenerator)>
_L4:
		return;
	//    5    9:return          
_L2:
		if(javatype != null && !javatype.getRawClass().isAssignableFrom(obj.getClass()))
	//*   6   10:aload_3         
	//*   7   11:ifnull          34
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #258 <Method Class JavaType.getRawClass()>
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #86  <Method Class Object.getClass()>
	//*  12   22:invokevirtual   #262 <Method boolean Class.isAssignableFrom(Class)>
	//*  13   25:ifne            34
			_reportIncompatibleRootType(obj, javatype);
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #266 <Method void _reportIncompatibleRootType(Object, JavaType)>
		JsonSerializer jsonserializer1 = jsonserializer;
	//   18   34:aload           4
	//   19   36:astore          8
		boolean flag;
		if(jsonserializer == null)
	//*  20   38:aload           4
	//*  21   40:ifnonnull       62
			if(javatype != null && javatype.isContainerType())
	//*  22   43:aload_3         
	//*  23   44:ifnull          148
	//*  24   47:aload_3         
	//*  25   48:invokevirtual   #270 <Method boolean JavaType.isContainerType()>
	//*  26   51:ifeq            148
				jsonserializer1 = findValueSerializer(javatype, ((com.fasterxml.jackson.databind.BeanProperty) (null)));
	//   27   54:aload_0         
	//   28   55:aload_3         
	//   29   56:aconst_null     
	//   30   57:invokevirtual   #121 <Method JsonSerializer findValueSerializer(JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//   31   60:astore          8
			else
	//*  32   62:aload_0         
	//*  33   63:getfield        #232 <Field SerializationConfig _config>
	//*  34   66:invokevirtual   #274 <Method PropertyName SerializationConfig.getFullRootName()>
	//*  35   69:astore_3        
	//*  36   70:aload_3         
	//*  37   71:ifnonnull       162
	//*  38   74:aload_0         
	//*  39   75:getfield        #232 <Field SerializationConfig _config>
	//*  40   78:getstatic       #277 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//*  41   81:invokevirtual   #238 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  42   84:istore          7
	//*  43   86:iload           7
	//*  44   88:istore          6
	//*  45   90:iload           7
	//*  46   92:ifeq            125
	//*  47   95:aload_1         
	//*  48   96:invokevirtual   #282 <Method void JsonGenerator.writeStartObject()>
	//*  49   99:aload_1         
	//*  50  100:aload_0         
	//*  51  101:getfield        #232 <Field SerializationConfig _config>
	//*  52  104:aload_2         
	//*  53  105:invokevirtual   #86  <Method Class Object.getClass()>
	//*  54  108:invokevirtual   #286 <Method PropertyName SerializationConfig.findRootName(Class)>
	//*  55  111:aload_0         
	//*  56  112:getfield        #232 <Field SerializationConfig _config>
	//*  57  115:invokevirtual   #292 <Method com.fasterxml.jackson.core.SerializableString PropertyName.simpleAsEncoded(com.fasterxml.jackson.databind.cfg.MapperConfig)>
	//*  58  118:invokevirtual   #296 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
	//*  59  121:iload           7
	//*  60  123:istore          6
	//*  61  125:aload           8
	//*  62  127:aload_2         
	//*  63  128:aload_1         
	//*  64  129:aload_0         
	//*  65  130:aload           5
	//*  66  132:invokevirtual   #300 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  67  135:iload           6
	//*  68  137:ifeq            9
	//*  69  140:aload_1         
	//*  70  141:invokevirtual   #303 <Method void JsonGenerator.writeEndObject()>
	//*  71  144:return          
	//*  72  145:astore_1        
	//*  73  146:aload_1         
	//*  74  147:athrow          
				jsonserializer1 = findValueSerializer(obj.getClass(), ((com.fasterxml.jackson.databind.BeanProperty) (null)));
	//   75  148:aload_0         
	//   76  149:aload_2         
	//   77  150:invokevirtual   #86  <Method Class Object.getClass()>
	//   78  153:aconst_null     
	//   79  154:invokevirtual   #201 <Method JsonSerializer findValueSerializer(Class, com.fasterxml.jackson.databind.BeanProperty)>
	//   80  157:astore          8
		javatype = ((JavaType) (_config.getFullRootName()));
		if(javatype == null)
		{
			boolean flag1 = _config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
			flag = flag1;
			if(flag1)
			{
				jsongenerator.writeStartObject();
				jsongenerator.writeFieldName(_config.findRootName(obj.getClass()).simpleAsEncoded(((com.fasterxml.jackson.databind.cfg.MapperConfig) (_config))));
				flag = flag1;
			}
		} else
	//*  81  159:goto            62
		if(((PropertyName) (javatype)).isEmpty())
	//*  82  162:aload_3         
	//*  83  163:invokevirtual   #306 <Method boolean PropertyName.isEmpty()>
	//*  84  166:ifeq            175
		{
			flag = false;
	//   85  169:iconst_0        
	//   86  170:istore          6
		} else
	//*  87  172:goto            125
		{
			flag = true;
	//   88  175:iconst_1        
	//   89  176:istore          6
			jsongenerator.writeStartObject();
	//   90  178:aload_1         
	//   91  179:invokevirtual   #282 <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeFieldName(((PropertyName) (javatype)).getSimpleName());
	//   92  182:aload_1         
	//   93  183:aload_3         
	//   94  184:invokevirtual   #309 <Method String PropertyName.getSimpleName()>
	//   95  187:invokevirtual   #311 <Method void JsonGenerator.writeFieldName(String)>
		}
		jsonserializer1.serializeWithType(obj, jsongenerator, ((SerializerProvider) (this)), typeserializer);
		if(flag)
		{
			try
			{
				jsongenerator.writeEndObject();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
			{
				throw jsongenerator;
			}
	//*  96  190:goto            125
			// Misplaced declaration of an exception variable
			catch(JsonSerializer jsonserializer)
	//*  97  193:astore          4
			{
				javatype = ((JavaType) (((Exception) (jsonserializer)).getMessage()));
	//   98  195:aload           4
	//   99  197:invokevirtual   #71  <Method String Exception.getMessage()>
	//  100  200:astore_3        
			}
			obj = ((Object) (javatype));
	//  101  201:aload_3         
	//  102  202:astore_2        
			if(javatype == null)
	//* 103  203:aload_3         
	//* 104  204:ifnonnull       239
				obj = ((Object) ((new StringBuilder()).append("[no message for ").append(((Object) (jsonserializer)).getClass().getName()).append("]").toString()));
	//  105  207:new             #73  <Class StringBuilder>
	//  106  210:dup             
	//  107  211:invokespecial   #74  <Method void StringBuilder()>
	//  108  214:ldc1            #76  <String "[no message for ">
	//  109  216:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  110  219:aload           4
	//  111  221:invokevirtual   #86  <Method Class Object.getClass()>
	//  112  224:invokevirtual   #91  <Method String Class.getName()>
	//  113  227:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  114  230:ldc1            #93  <String "]">
	//  115  232:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  116  235:invokevirtual   #96  <Method String StringBuilder.toString()>
	//  117  238:astore_2        
			throw JsonMappingException.from(jsongenerator, ((String) (obj)), ((Throwable) (jsonserializer)));
	//  118  239:aload_1         
	//  119  240:aload_2         
	//  120  241:aload           4
	//  121  243:invokestatic    #102 <Method JsonMappingException JsonMappingException.from(JsonGenerator, String, Throwable)>
	//  122  246:athrow          
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	public void serializePolymorphic(JsonGenerator jsongenerator, Object obj, TypeSerializer typeserializer)
		throws IOException
	{
		JavaType javatype;
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       18
			javatype = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		else
	//*   4    7:aload_0         
	//*   5    8:aload_1         
	//*   6    9:aload_2         
	//*   7   10:aload           4
	//*   8   12:aconst_null     
	//*   9   13:aload_3         
	//*  10   14:invokevirtual   #315 <Method void serializePolymorphic(JsonGenerator, Object, JavaType, JsonSerializer, TypeSerializer)>
	//*  11   17:return          
			javatype = _config.constructType(obj.getClass());
	//   12   18:aload_0         
	//   13   19:getfield        #232 <Field SerializationConfig _config>
	//   14   22:aload_2         
	//   15   23:invokevirtual   #86  <Method Class Object.getClass()>
	//   16   26:invokevirtual   #319 <Method JavaType SerializationConfig.constructType(Class)>
	//   17   29:astore          4
		serializePolymorphic(jsongenerator, obj, javatype, ((JsonSerializer) (null)), typeserializer);
	//*  18   31:goto            7
	}

	public void serializeValue(JsonGenerator jsongenerator, Object obj)
		throws IOException
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnonnull       10
_L1:
		_serializeNull(jsongenerator);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #253 <Method void _serializeNull(JsonGenerator)>
_L4:
		return;
	//    5    9:return          
_L2:
		JsonSerializer jsonserializer = findTypedValueSerializer(obj.getClass(), true, ((com.fasterxml.jackson.databind.BeanProperty) (null)));
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #86  <Method Class Object.getClass()>
	//    9   15:iconst_1        
	//   10   16:aconst_null     
	//   11   17:invokevirtual   #325 <Method JsonSerializer findTypedValueSerializer(Class, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   12   20:astore          5
		PropertyName propertyname = _config.getFullRootName();
	//   13   22:aload_0         
	//   14   23:getfield        #232 <Field SerializationConfig _config>
	//   15   26:invokevirtual   #274 <Method PropertyName SerializationConfig.getFullRootName()>
	//   16   29:astore          6
		boolean flag;
		if(propertyname == null)
	//*  17   31:aload           6
	//*  18   33:ifnonnull       105
		{
			boolean flag1 = _config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
	//   19   36:aload_0         
	//   20   37:getfield        #232 <Field SerializationConfig _config>
	//   21   40:getstatic       #277 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//   22   43:invokevirtual   #238 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//   23   46:istore          4
			flag = flag1;
	//   24   48:iload           4
	//   25   50:istore_3        
			if(flag1)
	//*  26   51:iload           4
	//*  27   53:ifeq            85
			{
				jsongenerator.writeStartObject();
	//   28   56:aload_1         
	//   29   57:invokevirtual   #282 <Method void JsonGenerator.writeStartObject()>
				jsongenerator.writeFieldName(_config.findRootName(obj.getClass()).simpleAsEncoded(((com.fasterxml.jackson.databind.cfg.MapperConfig) (_config))));
	//   30   60:aload_1         
	//   31   61:aload_0         
	//   32   62:getfield        #232 <Field SerializationConfig _config>
	//   33   65:aload_2         
	//   34   66:invokevirtual   #86  <Method Class Object.getClass()>
	//   35   69:invokevirtual   #286 <Method PropertyName SerializationConfig.findRootName(Class)>
	//   36   72:aload_0         
	//   37   73:getfield        #232 <Field SerializationConfig _config>
	//   38   76:invokevirtual   #292 <Method com.fasterxml.jackson.core.SerializableString PropertyName.simpleAsEncoded(com.fasterxml.jackson.databind.cfg.MapperConfig)>
	//   39   79:invokevirtual   #296 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
				flag = flag1;
	//   40   82:iload           4
	//   41   84:istore_3        
			}
		} else
	//*  42   85:aload           5
	//*  43   87:aload_2         
	//*  44   88:aload_1         
	//*  45   89:aload_0         
	//*  46   90:invokevirtual   #67  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  47   93:iload_3         
	//*  48   94:ifeq            9
	//*  49   97:aload_1         
	//*  50   98:invokevirtual   #303 <Method void JsonGenerator.writeEndObject()>
	//*  51  101:return          
	//*  52  102:astore_1        
	//*  53  103:aload_1         
	//*  54  104:athrow          
		if(propertyname.isEmpty())
	//*  55  105:aload           6
	//*  56  107:invokevirtual   #306 <Method boolean PropertyName.isEmpty()>
	//*  57  110:ifeq            118
		{
			flag = false;
	//   58  113:iconst_0        
	//   59  114:istore_3        
		} else
	//*  60  115:goto            85
		{
			flag = true;
	//   61  118:iconst_1        
	//   62  119:istore_3        
			jsongenerator.writeStartObject();
	//   63  120:aload_1         
	//   64  121:invokevirtual   #282 <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeFieldName(propertyname.getSimpleName());
	//   65  124:aload_1         
	//   66  125:aload           6
	//   67  127:invokevirtual   #309 <Method String PropertyName.getSimpleName()>
	//   68  130:invokevirtual   #311 <Method void JsonGenerator.writeFieldName(String)>
		}
		try
		{
			jsonserializer.serialize(obj, jsongenerator, ((SerializerProvider) (this)));
		}
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
		{
			throw jsongenerator;
		}
	//*  69  133:goto            85
		catch(Exception exception)
	//*  70  136:astore          6
		{
			String s = exception.getMessage();
	//   71  138:aload           6
	//   72  140:invokevirtual   #71  <Method String Exception.getMessage()>
	//   73  143:astore          5
			obj = ((Object) (s));
	//   74  145:aload           5
	//   75  147:astore_2        
			if(s == null)
	//*  76  148:aload           5
	//*  77  150:ifnonnull       185
				obj = ((Object) ((new StringBuilder()).append("[no message for ").append(((Object) (exception)).getClass().getName()).append("]").toString()));
	//   78  153:new             #73  <Class StringBuilder>
	//   79  156:dup             
	//   80  157:invokespecial   #74  <Method void StringBuilder()>
	//   81  160:ldc1            #76  <String "[no message for ">
	//   82  162:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   83  165:aload           6
	//   84  167:invokevirtual   #86  <Method Class Object.getClass()>
	//   85  170:invokevirtual   #91  <Method String Class.getName()>
	//   86  173:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   87  176:ldc1            #93  <String "]">
	//   88  178:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   89  181:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   90  184:astore_2        
			throw new JsonMappingException(((java.io.Closeable) (jsongenerator)), ((String) (obj)), ((Throwable) (exception)));
	//   91  185:new             #98  <Class JsonMappingException>
	//   92  188:dup             
	//   93  189:aload_1         
	//   94  190:aload_2         
	//   95  191:aload           6
	//   96  193:invokespecial   #328 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//   97  196:athrow          
		}
		if(!flag) goto _L4; else goto _L3
_L3:
		jsongenerator.writeEndObject();
		return;
	}

	public void serializeValue(JsonGenerator jsongenerator, Object obj, JavaType javatype)
		throws IOException
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnonnull       10
_L1:
		_serializeNull(jsongenerator);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #253 <Method void _serializeNull(JsonGenerator)>
_L4:
		return;
	//    5    9:return          
_L2:
		if(!javatype.getRawClass().isAssignableFrom(obj.getClass()))
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #258 <Method Class JavaType.getRawClass()>
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #86  <Method Class Object.getClass()>
	//*  10   18:invokevirtual   #262 <Method boolean Class.isAssignableFrom(Class)>
	//*  11   21:ifne            30
			_reportIncompatibleRootType(obj, javatype);
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #266 <Method void _reportIncompatibleRootType(Object, JavaType)>
		javatype = ((JavaType) (findTypedValueSerializer(javatype, true, ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:iconst_1        
	//   19   33:aconst_null     
	//   20   34:invokevirtual   #332 <Method JsonSerializer findTypedValueSerializer(JavaType, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   21   37:astore_3        
		PropertyName propertyname = _config.getFullRootName();
	//   22   38:aload_0         
	//   23   39:getfield        #232 <Field SerializationConfig _config>
	//   24   42:invokevirtual   #274 <Method PropertyName SerializationConfig.getFullRootName()>
	//   25   45:astore          6
		boolean flag;
		if(propertyname == null)
	//*  26   47:aload           6
	//*  27   49:ifnonnull       123
		{
			boolean flag1 = _config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
	//   28   52:aload_0         
	//   29   53:getfield        #232 <Field SerializationConfig _config>
	//   30   56:getstatic       #277 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//   31   59:invokevirtual   #238 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//   32   62:istore          5
			flag = flag1;
	//   33   64:iload           5
	//   34   66:istore          4
			if(flag1)
	//*  35   68:iload           5
	//*  36   70:ifeq            103
			{
				jsongenerator.writeStartObject();
	//   37   73:aload_1         
	//   38   74:invokevirtual   #282 <Method void JsonGenerator.writeStartObject()>
				jsongenerator.writeFieldName(_config.findRootName(obj.getClass()).simpleAsEncoded(((com.fasterxml.jackson.databind.cfg.MapperConfig) (_config))));
	//   39   77:aload_1         
	//   40   78:aload_0         
	//   41   79:getfield        #232 <Field SerializationConfig _config>
	//   42   82:aload_2         
	//   43   83:invokevirtual   #86  <Method Class Object.getClass()>
	//   44   86:invokevirtual   #286 <Method PropertyName SerializationConfig.findRootName(Class)>
	//   45   89:aload_0         
	//   46   90:getfield        #232 <Field SerializationConfig _config>
	//   47   93:invokevirtual   #292 <Method com.fasterxml.jackson.core.SerializableString PropertyName.simpleAsEncoded(com.fasterxml.jackson.databind.cfg.MapperConfig)>
	//   48   96:invokevirtual   #296 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
				flag = flag1;
	//   49   99:iload           5
	//   50  101:istore          4
			}
		} else
	//*  51  103:aload_3         
	//*  52  104:aload_2         
	//*  53  105:aload_1         
	//*  54  106:aload_0         
	//*  55  107:invokevirtual   #67  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  56  110:iload           4
	//*  57  112:ifeq            9
	//*  58  115:aload_1         
	//*  59  116:invokevirtual   #303 <Method void JsonGenerator.writeEndObject()>
	//*  60  119:return          
	//*  61  120:astore_1        
	//*  62  121:aload_1         
	//*  63  122:athrow          
		if(propertyname.isEmpty())
	//*  64  123:aload           6
	//*  65  125:invokevirtual   #306 <Method boolean PropertyName.isEmpty()>
	//*  66  128:ifeq            137
		{
			flag = false;
	//   67  131:iconst_0        
	//   68  132:istore          4
		} else
	//*  69  134:goto            103
		{
			flag = true;
	//   70  137:iconst_1        
	//   71  138:istore          4
			jsongenerator.writeStartObject();
	//   72  140:aload_1         
	//   73  141:invokevirtual   #282 <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeFieldName(propertyname.getSimpleName());
	//   74  144:aload_1         
	//   75  145:aload           6
	//   76  147:invokevirtual   #309 <Method String PropertyName.getSimpleName()>
	//   77  150:invokevirtual   #311 <Method void JsonGenerator.writeFieldName(String)>
		}
		try
		{
			((JsonSerializer) (javatype)).serialize(obj, jsongenerator, ((SerializerProvider) (this)));
		}
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
		{
			throw jsongenerator;
		}
	//*  78  153:goto            103
		catch(Exception exception)
	//*  79  156:astore          6
		{
			javatype = ((JavaType) (exception.getMessage()));
	//   80  158:aload           6
	//   81  160:invokevirtual   #71  <Method String Exception.getMessage()>
	//   82  163:astore_3        
			obj = ((Object) (javatype));
	//   83  164:aload_3         
	//   84  165:astore_2        
			if(javatype == null)
	//*  85  166:aload_3         
	//*  86  167:ifnonnull       202
				obj = ((Object) ((new StringBuilder()).append("[no message for ").append(((Object) (exception)).getClass().getName()).append("]").toString()));
	//   87  170:new             #73  <Class StringBuilder>
	//   88  173:dup             
	//   89  174:invokespecial   #74  <Method void StringBuilder()>
	//   90  177:ldc1            #76  <String "[no message for ">
	//   91  179:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   92  182:aload           6
	//   93  184:invokevirtual   #86  <Method Class Object.getClass()>
	//   94  187:invokevirtual   #91  <Method String Class.getName()>
	//   95  190:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   96  193:ldc1            #93  <String "]">
	//   97  195:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   98  198:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   99  201:astore_2        
			throw JsonMappingException.from(jsongenerator, ((String) (obj)), ((Throwable) (exception)));
	//  100  202:aload_1         
	//  101  203:aload_2         
	//  102  204:aload           6
	//  103  206:invokestatic    #102 <Method JsonMappingException JsonMappingException.from(JsonGenerator, String, Throwable)>
	//  104  209:athrow          
		}
		if(!flag) goto _L4; else goto _L3
_L3:
		jsongenerator.writeEndObject();
		return;
	}

	public void serializeValue(JsonGenerator jsongenerator, Object obj, JavaType javatype, JsonSerializer jsonserializer)
		throws IOException
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnonnull       10
_L1:
		_serializeNull(jsongenerator);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #253 <Method void _serializeNull(JsonGenerator)>
_L4:
		return;
	//    5    9:return          
_L2:
		if(javatype != null && !javatype.getRawClass().isAssignableFrom(obj.getClass()))
	//*   6   10:aload_3         
	//*   7   11:ifnull          34
	//*   8   14:aload_3         
	//*   9   15:invokevirtual   #258 <Method Class JavaType.getRawClass()>
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #86  <Method Class Object.getClass()>
	//*  12   22:invokevirtual   #262 <Method boolean Class.isAssignableFrom(Class)>
	//*  13   25:ifne            34
			_reportIncompatibleRootType(obj, javatype);
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #266 <Method void _reportIncompatibleRootType(Object, JavaType)>
		JsonSerializer jsonserializer1 = jsonserializer;
	//   18   34:aload           4
	//   19   36:astore          7
		if(jsonserializer == null)
	//*  20   38:aload           4
	//*  21   40:ifnonnull       52
			jsonserializer1 = findTypedValueSerializer(javatype, true, ((com.fasterxml.jackson.databind.BeanProperty) (null)));
	//   22   43:aload_0         
	//   23   44:aload_3         
	//   24   45:iconst_1        
	//   25   46:aconst_null     
	//   26   47:invokevirtual   #332 <Method JsonSerializer findTypedValueSerializer(JavaType, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   27   50:astore          7
		jsonserializer = ((JsonSerializer) (_config.getFullRootName()));
	//   28   52:aload_0         
	//   29   53:getfield        #232 <Field SerializationConfig _config>
	//   30   56:invokevirtual   #274 <Method PropertyName SerializationConfig.getFullRootName()>
	//   31   59:astore          4
		boolean flag;
		if(jsonserializer == null)
	//*  32   61:aload           4
	//*  33   63:ifnonnull       156
		{
			boolean flag1 = _config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
	//   34   66:aload_0         
	//   35   67:getfield        #232 <Field SerializationConfig _config>
	//   36   70:getstatic       #277 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//   37   73:invokevirtual   #238 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//   38   76:istore          6
			flag = flag1;
	//   39   78:iload           6
	//   40   80:istore          5
			if(flag1)
	//*  41   82:iload           6
	//*  42   84:ifeq            123
			{
				jsongenerator.writeStartObject();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #282 <Method void JsonGenerator.writeStartObject()>
				if(javatype == null)
	//*  45   91:aload_3         
	//*  46   92:ifnonnull       144
					javatype = ((JavaType) (_config.findRootName(obj.getClass())));
	//   47   95:aload_0         
	//   48   96:getfield        #232 <Field SerializationConfig _config>
	//   49   99:aload_2         
	//   50  100:invokevirtual   #86  <Method Class Object.getClass()>
	//   51  103:invokevirtual   #286 <Method PropertyName SerializationConfig.findRootName(Class)>
	//   52  106:astore_3        
				else
	//*  53  107:aload_1         
	//*  54  108:aload_3         
	//*  55  109:aload_0         
	//*  56  110:getfield        #232 <Field SerializationConfig _config>
	//*  57  113:invokevirtual   #292 <Method com.fasterxml.jackson.core.SerializableString PropertyName.simpleAsEncoded(com.fasterxml.jackson.databind.cfg.MapperConfig)>
	//*  58  116:invokevirtual   #296 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
	//*  59  119:iload           6
	//*  60  121:istore          5
	//*  61  123:aload           7
	//*  62  125:aload_2         
	//*  63  126:aload_1         
	//*  64  127:aload_0         
	//*  65  128:invokevirtual   #67  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  66  131:iload           5
	//*  67  133:ifeq            9
	//*  68  136:aload_1         
	//*  69  137:invokevirtual   #303 <Method void JsonGenerator.writeEndObject()>
	//*  70  140:return          
	//*  71  141:astore_1        
	//*  72  142:aload_1         
	//*  73  143:athrow          
					javatype = ((JavaType) (_config.findRootName(javatype)));
	//   74  144:aload_0         
	//   75  145:getfield        #232 <Field SerializationConfig _config>
	//   76  148:aload_3         
	//   77  149:invokevirtual   #336 <Method PropertyName SerializationConfig.findRootName(JavaType)>
	//   78  152:astore_3        
				jsongenerator.writeFieldName(((PropertyName) (javatype)).simpleAsEncoded(((com.fasterxml.jackson.databind.cfg.MapperConfig) (_config))));
				flag = flag1;
			}
		} else
	//*  79  153:goto            107
		if(((PropertyName) (jsonserializer)).isEmpty())
	//*  80  156:aload           4
	//*  81  158:invokevirtual   #306 <Method boolean PropertyName.isEmpty()>
	//*  82  161:ifeq            170
		{
			flag = false;
	//   83  164:iconst_0        
	//   84  165:istore          5
		} else
	//*  85  167:goto            123
		{
			flag = true;
	//   86  170:iconst_1        
	//   87  171:istore          5
			jsongenerator.writeStartObject();
	//   88  173:aload_1         
	//   89  174:invokevirtual   #282 <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeFieldName(((PropertyName) (jsonserializer)).getSimpleName());
	//   90  177:aload_1         
	//   91  178:aload           4
	//   92  180:invokevirtual   #309 <Method String PropertyName.getSimpleName()>
	//   93  183:invokevirtual   #311 <Method void JsonGenerator.writeFieldName(String)>
		}
		jsonserializer1.serialize(obj, jsongenerator, ((SerializerProvider) (this)));
		if(flag)
		{
			try
			{
				jsongenerator.writeEndObject();
				return;
			}
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
			{
				throw jsongenerator;
			}
	//*  94  186:goto            123
			// Misplaced declaration of an exception variable
			catch(JsonSerializer jsonserializer)
	//*  95  189:astore          4
			{
				javatype = ((JavaType) (((Exception) (jsonserializer)).getMessage()));
	//   96  191:aload           4
	//   97  193:invokevirtual   #71  <Method String Exception.getMessage()>
	//   98  196:astore_3        
			}
			obj = ((Object) (javatype));
	//   99  197:aload_3         
	//  100  198:astore_2        
			if(javatype == null)
	//* 101  199:aload_3         
	//* 102  200:ifnonnull       235
				obj = ((Object) ((new StringBuilder()).append("[no message for ").append(((Object) (jsonserializer)).getClass().getName()).append("]").toString()));
	//  103  203:new             #73  <Class StringBuilder>
	//  104  206:dup             
	//  105  207:invokespecial   #74  <Method void StringBuilder()>
	//  106  210:ldc1            #76  <String "[no message for ">
	//  107  212:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  108  215:aload           4
	//  109  217:invokevirtual   #86  <Method Class Object.getClass()>
	//  110  220:invokevirtual   #91  <Method String Class.getName()>
	//  111  223:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  112  226:ldc1            #93  <String "]">
	//  113  228:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//  114  231:invokevirtual   #96  <Method String StringBuilder.toString()>
	//  115  234:astore_2        
			throw JsonMappingException.from(jsongenerator, ((String) (obj)), ((Throwable) (jsonserializer)));
	//  116  235:aload_1         
	//  117  236:aload_2         
	//  118  237:aload           4
	//  119  239:invokestatic    #102 <Method JsonMappingException JsonMappingException.from(JsonGenerator, String, Throwable)>
	//  120  242:athrow          
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	public JsonSerializer serializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnonnull       6
_L1:
		return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
_L2:
		if(obj instanceof JsonSerializer)
	//*   4    6:aload_2         
	//*   5    7:instanceof      #63  <Class JsonSerializer>
	//*   6   10:ifeq            24
		{
			annotated = ((Annotated) ((JsonSerializer)obj));
	//    7   13:aload_2         
	//    8   14:checkcast       #63  <Class JsonSerializer>
	//    9   17:astore_1        
		} else
	//*  10   18:aload_0         
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #343 <Method JsonSerializer _handleResolvable(JsonSerializer)>
	//*  13   23:areturn         
		{
			if(!(obj instanceof Class))
	//*  14   24:aload_2         
	//*  15   25:instanceof      #88  <Class Class>
	//*  16   28:ifne            71
				throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned serializer definition of type ").append(obj.getClass().getName()).append("; expected type JsonSerializer or Class<JsonSerializer> instead").toString());
	//   17   31:new             #139 <Class IllegalStateException>
	//   18   34:dup             
	//   19   35:new             #73  <Class StringBuilder>
	//   20   38:dup             
	//   21   39:invokespecial   #74  <Method void StringBuilder()>
	//   22   42:ldc2            #345 <String "AnnotationIntrospector returned serializer definition of type ">
	//   23   45:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:aload_2         
	//   25   49:invokevirtual   #86  <Method Class Object.getClass()>
	//   26   52:invokevirtual   #91  <Method String Class.getName()>
	//   27   55:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:ldc2            #347 <String "; expected type JsonSerializer or Class<JsonSerializer> instead">
	//   29   61:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   30   64:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   31   67:invokespecial   #142 <Method void IllegalStateException(String)>
	//   32   70:athrow          
			Class class1 = (Class)obj;
	//   33   71:aload_2         
	//   34   72:checkcast       #88  <Class Class>
	//   35   75:astore_3        
			if(class1 == com/fasterxml/jackson/databind/JsonSerializer$None || ClassUtil.isBogusClass(class1))
				continue; /* Loop/switch isn't completed */
	//   36   76:aload_3         
	//   37   77:ldc2            #349 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//   38   80:if_acmpeq       4
	//   39   83:aload_3         
	//   40   84:invokestatic    #354 <Method boolean ClassUtil.isBogusClass(Class)>
	//   41   87:ifne            4
			if(!((Class) (com/fasterxml/jackson/databind/JsonSerializer)).isAssignableFrom(class1))
	//*  42   90:ldc1            #63  <Class JsonSerializer>
	//*  43   92:aload_3         
	//*  44   93:invokevirtual   #262 <Method boolean Class.isAssignableFrom(Class)>
	//*  45   96:ifne            136
				throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(class1.getName()).append("; expected Class<JsonSerializer>").toString());
	//   46   99:new             #139 <Class IllegalStateException>
	//   47  102:dup             
	//   48  103:new             #73  <Class StringBuilder>
	//   49  106:dup             
	//   50  107:invokespecial   #74  <Method void StringBuilder()>
	//   51  110:ldc2            #356 <String "AnnotationIntrospector returned Class ">
	//   52  113:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   53  116:aload_3         
	//   54  117:invokevirtual   #91  <Method String Class.getName()>
	//   55  120:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   56  123:ldc2            #358 <String "; expected Class<JsonSerializer>">
	//   57  126:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   58  129:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   59  132:invokespecial   #142 <Method void IllegalStateException(String)>
	//   60  135:athrow          
			obj = ((Object) (_config.getHandlerInstantiator()));
	//   61  136:aload_0         
	//   62  137:getfield        #232 <Field SerializationConfig _config>
	//   63  140:invokevirtual   #362 <Method HandlerInstantiator SerializationConfig.getHandlerInstantiator()>
	//   64  143:astore_2        
			if(obj == null)
	//*  65  144:aload_2         
	//*  66  145:ifnonnull       174
				obj = null;
	//   67  148:aconst_null     
	//   68  149:astore_2        
			else
	//*  69  150:aload_2         
	//*  70  151:astore_1        
	//*  71  152:aload_2         
	//*  72  153:ifnonnull       18
	//*  73  156:aload_3         
	//*  74  157:aload_0         
	//*  75  158:getfield        #232 <Field SerializationConfig _config>
	//*  76  161:invokevirtual   #365 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//*  77  164:invokestatic    #368 <Method Object ClassUtil.createInstance(Class, boolean)>
	//*  78  167:checkcast       #63  <Class JsonSerializer>
	//*  79  170:astore_1        
	//*  80  171:goto            18
				obj = ((Object) (((HandlerInstantiator) (obj)).serializerInstance(_config, annotated, class1)));
	//   81  174:aload_2         
	//   82  175:aload_0         
	//   83  176:getfield        #232 <Field SerializationConfig _config>
	//   84  179:aload_1         
	//   85  180:aload_3         
	//   86  181:invokevirtual   #373 <Method JsonSerializer HandlerInstantiator.serializerInstance(SerializationConfig, Annotated, Class)>
	//   87  184:astore_2        
			annotated = ((Annotated) (obj));
			if(obj == null)
				annotated = ((Annotated) ((JsonSerializer)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers())));
		}
		return _handleResolvable(((JsonSerializer) (annotated)));
		if(true) goto _L1; else goto _L3
_L3:
	//*  88  185:goto            150
	}

	private static final long serialVersionUID = 1L;
	protected transient ArrayList _objectIdGenerators;
	protected transient Map _seenObjectIds;
}
