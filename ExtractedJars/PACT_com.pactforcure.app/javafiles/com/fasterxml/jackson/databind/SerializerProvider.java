// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.text.DateFormat;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind:
//			DatabindContext, SerializationConfig, JsonMappingException, JavaType, 
//			SerializationFeature, JsonSerializer, BeanProperty, AnnotationIntrospector, 
//			MapperFeature

public abstract class SerializerProvider extends DatabindContext
{

	public SerializerProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void DatabindContext()>
		_unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
	//    2    4:aload_0         
	//    3    5:getstatic       #49  <Field JsonSerializer DEFAULT_UNKNOWN_SERIALIZER>
	//    4    8:putfield        #53  <Field JsonSerializer _unknownTypeSerializer>
		_nullValueSerializer = ((JsonSerializer) (NullSerializer.instance));
	//    5   11:aload_0         
	//    6   12:getstatic       #59  <Field NullSerializer NullSerializer.instance>
	//    7   15:putfield        #61  <Field JsonSerializer _nullValueSerializer>
		_nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
	//    8   18:aload_0         
	//    9   19:getstatic       #43  <Field JsonSerializer DEFAULT_NULL_KEY_SERIALIZER>
	//   10   22:putfield        #63  <Field JsonSerializer _nullKeySerializer>
		_config = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #65  <Field SerializationConfig _config>
		_serializerFactory = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #67  <Field SerializerFactory _serializerFactory>
		_serializerCache = new SerializerCache();
	//   17   35:aload_0         
	//   18   36:new             #69  <Class SerializerCache>
	//   19   39:dup             
	//   20   40:invokespecial   #70  <Method void SerializerCache()>
	//   21   43:putfield        #72  <Field SerializerCache _serializerCache>
		_knownSerializers = null;
	//   22   46:aload_0         
	//   23   47:aconst_null     
	//   24   48:putfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
		_serializationView = null;
	//   25   51:aload_0         
	//   26   52:aconst_null     
	//   27   53:putfield        #76  <Field Class _serializationView>
		_attributes = null;
	//   28   56:aload_0         
	//   29   57:aconst_null     
	//   30   58:putfield        #78  <Field ContextAttributes _attributes>
		_stdNullValueSerializer = true;
	//   31   61:aload_0         
	//   32   62:iconst_1        
	//   33   63:putfield        #80  <Field boolean _stdNullValueSerializer>
	//   34   66:return          
	}

	protected SerializerProvider(SerializerProvider serializerprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void DatabindContext()>
		_unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
	//    2    4:aload_0         
	//    3    5:getstatic       #49  <Field JsonSerializer DEFAULT_UNKNOWN_SERIALIZER>
	//    4    8:putfield        #53  <Field JsonSerializer _unknownTypeSerializer>
		_nullValueSerializer = ((JsonSerializer) (NullSerializer.instance));
	//    5   11:aload_0         
	//    6   12:getstatic       #59  <Field NullSerializer NullSerializer.instance>
	//    7   15:putfield        #61  <Field JsonSerializer _nullValueSerializer>
		_nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
	//    8   18:aload_0         
	//    9   19:getstatic       #43  <Field JsonSerializer DEFAULT_NULL_KEY_SERIALIZER>
	//   10   22:putfield        #63  <Field JsonSerializer _nullKeySerializer>
		_config = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #65  <Field SerializationConfig _config>
		_serializationView = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #76  <Field Class _serializationView>
		_serializerFactory = null;
	//   17   35:aload_0         
	//   18   36:aconst_null     
	//   19   37:putfield        #67  <Field SerializerFactory _serializerFactory>
		_knownSerializers = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
		_serializerCache = new SerializerCache();
	//   23   45:aload_0         
	//   24   46:new             #69  <Class SerializerCache>
	//   25   49:dup             
	//   26   50:invokespecial   #70  <Method void SerializerCache()>
	//   27   53:putfield        #72  <Field SerializerCache _serializerCache>
		_unknownTypeSerializer = serializerprovider._unknownTypeSerializer;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #53  <Field JsonSerializer _unknownTypeSerializer>
	//   31   61:putfield        #53  <Field JsonSerializer _unknownTypeSerializer>
		_keySerializer = serializerprovider._keySerializer;
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:getfield        #83  <Field JsonSerializer _keySerializer>
	//   35   69:putfield        #83  <Field JsonSerializer _keySerializer>
		_nullValueSerializer = serializerprovider._nullValueSerializer;
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:getfield        #61  <Field JsonSerializer _nullValueSerializer>
	//   39   77:putfield        #61  <Field JsonSerializer _nullValueSerializer>
		_nullKeySerializer = serializerprovider._nullKeySerializer;
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:getfield        #63  <Field JsonSerializer _nullKeySerializer>
	//   43   85:putfield        #63  <Field JsonSerializer _nullKeySerializer>
		_stdNullValueSerializer = serializerprovider._stdNullValueSerializer;
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:getfield        #80  <Field boolean _stdNullValueSerializer>
	//   47   93:putfield        #80  <Field boolean _stdNullValueSerializer>
	//   48   96:return          
	}

	protected SerializerProvider(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void DatabindContext()>
		_unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
	//    2    4:aload_0         
	//    3    5:getstatic       #49  <Field JsonSerializer DEFAULT_UNKNOWN_SERIALIZER>
	//    4    8:putfield        #53  <Field JsonSerializer _unknownTypeSerializer>
		_nullValueSerializer = ((JsonSerializer) (NullSerializer.instance));
	//    5   11:aload_0         
	//    6   12:getstatic       #59  <Field NullSerializer NullSerializer.instance>
	//    7   15:putfield        #61  <Field JsonSerializer _nullValueSerializer>
		_nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
	//    8   18:aload_0         
	//    9   19:getstatic       #43  <Field JsonSerializer DEFAULT_NULL_KEY_SERIALIZER>
	//   10   22:putfield        #63  <Field JsonSerializer _nullKeySerializer>
		if(serializationconfig == null)
	//*  11   25:aload_2         
	//*  12   26:ifnonnull       37
			throw new NullPointerException();
	//   13   29:new             #86  <Class NullPointerException>
	//   14   32:dup             
	//   15   33:invokespecial   #87  <Method void NullPointerException()>
	//   16   36:athrow          
		_serializerFactory = serializerfactory;
	//   17   37:aload_0         
	//   18   38:aload_3         
	//   19   39:putfield        #67  <Field SerializerFactory _serializerFactory>
		_config = serializationconfig;
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:putfield        #65  <Field SerializationConfig _config>
		_serializerCache = serializerprovider._serializerCache;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:getfield        #72  <Field SerializerCache _serializerCache>
	//   26   52:putfield        #72  <Field SerializerCache _serializerCache>
		_unknownTypeSerializer = serializerprovider._unknownTypeSerializer;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:getfield        #53  <Field JsonSerializer _unknownTypeSerializer>
	//   30   60:putfield        #53  <Field JsonSerializer _unknownTypeSerializer>
		_keySerializer = serializerprovider._keySerializer;
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getfield        #83  <Field JsonSerializer _keySerializer>
	//   34   68:putfield        #83  <Field JsonSerializer _keySerializer>
		_nullValueSerializer = serializerprovider._nullValueSerializer;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:getfield        #61  <Field JsonSerializer _nullValueSerializer>
	//   38   76:putfield        #61  <Field JsonSerializer _nullValueSerializer>
		_nullKeySerializer = serializerprovider._nullKeySerializer;
	//   39   79:aload_0         
	//   40   80:aload_1         
	//   41   81:getfield        #63  <Field JsonSerializer _nullKeySerializer>
	//   42   84:putfield        #63  <Field JsonSerializer _nullKeySerializer>
		boolean flag;
		if(_nullValueSerializer == DEFAULT_NULL_KEY_SERIALIZER)
	//*  43   87:aload_0         
	//*  44   88:getfield        #61  <Field JsonSerializer _nullValueSerializer>
	//*  45   91:getstatic       #43  <Field JsonSerializer DEFAULT_NULL_KEY_SERIALIZER>
	//*  46   94:if_acmpne       134
			flag = true;
	//   47   97:iconst_1        
	//   48   98:istore          4
		else
	//*  49  100:aload_0         
	//*  50  101:iload           4
	//*  51  103:putfield        #80  <Field boolean _stdNullValueSerializer>
	//*  52  106:aload_0         
	//*  53  107:aload_2         
	//*  54  108:invokevirtual   #93  <Method Class SerializationConfig.getActiveView()>
	//*  55  111:putfield        #76  <Field Class _serializationView>
	//*  56  114:aload_0         
	//*  57  115:aload_2         
	//*  58  116:invokevirtual   #97  <Method ContextAttributes SerializationConfig.getAttributes()>
	//*  59  119:putfield        #78  <Field ContextAttributes _attributes>
	//*  60  122:aload_0         
	//*  61  123:aload_0         
	//*  62  124:getfield        #72  <Field SerializerCache _serializerCache>
	//*  63  127:invokevirtual   #101 <Method ReadOnlyClassToSerializerMap SerializerCache.getReadOnlyLookupMap()>
	//*  64  130:putfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//*  65  133:return          
			flag = false;
	//   66  134:iconst_0        
	//   67  135:istore          4
		_stdNullValueSerializer = flag;
		_serializationView = serializationconfig.getActiveView();
		_attributes = serializationconfig.getAttributes();
		_knownSerializers = _serializerCache.getReadOnlyLookupMap();
	//*  68  137:goto            100
	}

	protected JsonSerializer _createAndCacheUntypedSerializer(JavaType javatype)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer;
		try
		{
			jsonserializer = _createUntypedSerializer(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method JsonSerializer _createUntypedSerializer(JavaType)>
	//    3    5:astore_2        
		}
	//*   4    6:aload_2         
	//*   5    7:ifnull          20
	//*   6   10:aload_0         
	//*   7   11:getfield        #72  <Field SerializerCache _serializerCache>
	//*   8   14:aload_1         
	//*   9   15:aload_2         
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #114 <Method void SerializerCache.addAndResolveNonTypedSerializer(JavaType, JsonSerializer, SerializerProvider)>
	//*  12   20:aload_2         
	//*  13   21:areturn         
		// Misplaced declaration of an exception variable
		catch(JavaType javatype)
	//*  14   22:astore_1        
		{
			throw JsonMappingException.from(this, ((IllegalArgumentException) (javatype)).getMessage(), ((Throwable) (javatype)));
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:invokevirtual   #118 <Method String IllegalArgumentException.getMessage()>
	//   18   28:aload_1         
	//   19   29:invokestatic    #122 <Method JsonMappingException JsonMappingException.from(SerializerProvider, String, Throwable)>
	//   20   32:athrow          
		}
		if(jsonserializer != null)
			_serializerCache.addAndResolveNonTypedSerializer(javatype, jsonserializer, this);
		return jsonserializer;
	}

	protected JsonSerializer _createAndCacheUntypedSerializer(Class class1)
		throws JsonMappingException
	{
		JavaType javatype = _config.constructType(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method JavaType SerializationConfig.constructType(Class)>
	//    4    8:astore_2        
		JsonSerializer jsonserializer;
		try
		{
			jsonserializer = _createUntypedSerializer(javatype);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #110 <Method JsonSerializer _createUntypedSerializer(JavaType)>
	//    8   14:astore_3        
		}
	//*   9   15:aload_3         
	//*  10   16:ifnull          30
	//*  11   19:aload_0         
	//*  12   20:getfield        #72  <Field SerializerCache _serializerCache>
	//*  13   23:aload_1         
	//*  14   24:aload_2         
	//*  15   25:aload_3         
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #133 <Method void SerializerCache.addAndResolveNonTypedSerializer(Class, JavaType, JsonSerializer, SerializerProvider)>
	//*  18   30:aload_3         
	//*  19   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*  20   32:astore_1        
		{
			throw JsonMappingException.from(this, ((IllegalArgumentException) (class1)).getMessage(), ((Throwable) (class1)));
	//   21   33:aload_0         
	//   22   34:aload_1         
	//   23   35:invokevirtual   #118 <Method String IllegalArgumentException.getMessage()>
	//   24   38:aload_1         
	//   25   39:invokestatic    #122 <Method JsonMappingException JsonMappingException.from(SerializerProvider, String, Throwable)>
	//   26   42:athrow          
		}
		if(jsonserializer != null)
			_serializerCache.addAndResolveNonTypedSerializer(class1, javatype, jsonserializer, this);
		return jsonserializer;
	}

	protected JsonSerializer _createUntypedSerializer(JavaType javatype)
		throws JsonMappingException
	{
		synchronized(_serializerCache)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field SerializerCache _serializerCache>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			javatype = ((JavaType) (_serializerFactory.createSerializer(this, javatype)));
	//    5    7:aload_0         
	//    6    8:getfield        #67  <Field SerializerFactory _serializerFactory>
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #140 <Method JsonSerializer SerializerFactory.createSerializer(SerializerProvider, JavaType)>
	//   10   16:astore_1        
		}
	//   11   17:aload_2         
	//   12   18:monitorexit     
		return ((JsonSerializer) (javatype));
	//   13   19:aload_1         
	//   14   20:areturn         
		javatype;
	//   15   21:astore_1        
		serializercache;
	//   16   22:aload_2         
		JVM INSTR monitorexit ;
	//   17   23:monitorexit     
		throw javatype;
	//   18   24:aload_1         
	//   19   25:athrow          
	}

	protected final DateFormat _dateFormat()
	{
		if(_dateFormat != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field DateFormat _dateFormat>
	//*   2    4:ifnull          12
		{
			return _dateFormat;
	//    3    7:aload_0         
	//    4    8:getfield        #143 <Field DateFormat _dateFormat>
	//    5   11:areturn         
		} else
		{
			DateFormat dateformat = (DateFormat)_config.getDateFormat().clone();
	//    6   12:aload_0         
	//    7   13:getfield        #65  <Field SerializationConfig _config>
	//    8   16:invokevirtual   #146 <Method DateFormat SerializationConfig.getDateFormat()>
	//    9   19:invokevirtual   #152 <Method Object DateFormat.clone()>
	//   10   22:checkcast       #148 <Class DateFormat>
	//   11   25:astore_1        
			_dateFormat = dateformat;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #143 <Field DateFormat _dateFormat>
			return dateformat;
	//   15   31:aload_1         
	//   16   32:areturn         
		}
	}

	protected JsonSerializer _findExplicitUntypedSerializer(Class class1)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(Class)>
	//    4    8:astore_3        
		JsonSerializer jsonserializer = jsonserializer1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(jsonserializer1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       36
		{
			JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(class1);
	//    9   15:aload_0         
	//   10   16:getfield        #72  <Field SerializerCache _serializerCache>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #159 <Method JsonSerializer SerializerCache.untypedValueSerializer(Class)>
	//   13   23:astore_3        
			jsonserializer = jsonserializer2;
	//   14   24:aload_3         
	//   15   25:astore_2        
			if(jsonserializer2 == null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       36
				jsonserializer = _createAndCacheUntypedSerializer(class1);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:invokevirtual   #161 <Method JsonSerializer _createAndCacheUntypedSerializer(Class)>
	//   21   35:astore_2        
		}
		class1 = ((Class) (jsonserializer));
	//   22   36:aload_2         
	//   23   37:astore_1        
		if(isUnknownTypeSerializer(jsonserializer))
	//*  24   38:aload_0         
	//*  25   39:aload_2         
	//*  26   40:invokevirtual   #165 <Method boolean isUnknownTypeSerializer(JsonSerializer)>
	//*  27   43:ifeq            48
			class1 = null;
	//   28   46:aconst_null     
	//   29   47:astore_1        
		return ((JsonSerializer) (class1));
	//   30   48:aload_1         
	//   31   49:areturn         
	}

	protected JsonSerializer _handleContextualResolvable(JsonSerializer jsonserializer, BeanProperty beanproperty)
		throws JsonMappingException
	{
		if(jsonserializer instanceof ResolvableSerializer)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #169 <Class ResolvableSerializer>
	//*   2    4:ifeq            17
			((ResolvableSerializer)jsonserializer).resolve(this);
	//    3    7:aload_1         
	//    4    8:checkcast       #169 <Class ResolvableSerializer>
	//    5   11:aload_0         
	//    6   12:invokeinterface #172 <Method void ResolvableSerializer.resolve(SerializerProvider)>
		return handleSecondaryContextualization(jsonserializer, beanproperty);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokevirtual   #175 <Method JsonSerializer handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   11   23:areturn         
	}

	protected JsonSerializer _handleResolvable(JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		if(jsonserializer instanceof ResolvableSerializer)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #169 <Class ResolvableSerializer>
	//*   2    4:ifeq            17
			((ResolvableSerializer)jsonserializer).resolve(this);
	//    3    7:aload_1         
	//    4    8:checkcast       #169 <Class ResolvableSerializer>
	//    5   11:aload_0         
	//    6   12:invokeinterface #172 <Method void ResolvableSerializer.resolve(SerializerProvider)>
		return jsonserializer;
	//    7   17:aload_1         
	//    8   18:areturn         
	}

	protected void _reportIncompatibleRootType(Object obj, JavaType javatype)
		throws IOException
	{
		if(javatype.isPrimitive() && ClassUtil.wrapperType(javatype.getRawClass()).isAssignableFrom(obj.getClass()))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #189 <Method boolean JavaType.isPrimitive()>
	//*   2    4:ifeq            25
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #192 <Method Class JavaType.getRawClass()>
	//*   5   11:invokestatic    #198 <Method Class ClassUtil.wrapperType(Class)>
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #203 <Method Class Object.getClass()>
	//*   8   18:invokevirtual   #209 <Method boolean Class.isAssignableFrom(Class)>
	//*   9   21:ifeq            25
			return;
	//   10   24:return          
		else
			throw JsonMappingException.from(this, (new StringBuilder()).append("Incompatible types: declared root type (").append(((Object) (javatype))).append(") vs ").append(obj.getClass().getName()).toString());
	//   11   25:aload_0         
	//   12   26:new             #211 <Class StringBuilder>
	//   13   29:dup             
	//   14   30:invokespecial   #212 <Method void StringBuilder()>
	//   15   33:ldc1            #214 <String "Incompatible types: declared root type (">
	//   16   35:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:aload_2         
	//   18   39:invokevirtual   #221 <Method StringBuilder StringBuilder.append(Object)>
	//   19   42:ldc1            #223 <String ") vs ">
	//   20   44:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #203 <Method Class Object.getClass()>
	//   23   51:invokevirtual   #226 <Method String Class.getName()>
	//   24   54:invokevirtual   #218 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:invokevirtual   #229 <Method String StringBuilder.toString()>
	//   26   60:invokestatic    #232 <Method JsonMappingException JsonMappingException.from(SerializerProvider, String)>
	//   27   63:athrow          
	}

	public final boolean canOverrideAccessModifiers()
	{
		return _config.canOverrideAccessModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #235 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//    3    7:ireturn         
	}

	public void defaultSerializeDateKey(long l, JsonGenerator jsongenerator)
		throws IOException
	{
		if(isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #243 <Field SerializationFeature SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS>
	//*   2    4:invokevirtual   #247 <Method boolean isEnabled(SerializationFeature)>
	//*   3    7:ifeq            19
		{
			jsongenerator.writeFieldName(String.valueOf(l));
	//    4   10:aload_3         
	//    5   11:lload_1         
	//    6   12:invokestatic    #253 <Method String String.valueOf(long)>
	//    7   15:invokevirtual   #258 <Method void JsonGenerator.writeFieldName(String)>
			return;
	//    8   18:return          
		} else
		{
			jsongenerator.writeFieldName(_dateFormat().format(new Date(l)));
	//    9   19:aload_3         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #260 <Method DateFormat _dateFormat()>
	//   12   24:new             #262 <Class Date>
	//   13   27:dup             
	//   14   28:lload_1         
	//   15   29:invokespecial   #265 <Method void Date(long)>
	//   16   32:invokevirtual   #269 <Method String DateFormat.format(Date)>
	//   17   35:invokevirtual   #258 <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   18   38:return          
		}
	}

	public void defaultSerializeDateKey(Date date, JsonGenerator jsongenerator)
		throws IOException
	{
		if(isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #243 <Field SerializationFeature SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS>
	//*   2    4:invokevirtual   #247 <Method boolean isEnabled(SerializationFeature)>
	//*   3    7:ifeq            22
		{
			jsongenerator.writeFieldName(String.valueOf(date.getTime()));
	//    4   10:aload_2         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #274 <Method long Date.getTime()>
	//    7   15:invokestatic    #253 <Method String String.valueOf(long)>
	//    8   18:invokevirtual   #258 <Method void JsonGenerator.writeFieldName(String)>
			return;
	//    9   21:return          
		} else
		{
			jsongenerator.writeFieldName(_dateFormat().format(date));
	//   10   22:aload_2         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #260 <Method DateFormat _dateFormat()>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #269 <Method String DateFormat.format(Date)>
	//   15   31:invokevirtual   #258 <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   16   34:return          
		}
	}

	public final void defaultSerializeDateValue(long l, JsonGenerator jsongenerator)
		throws IOException
	{
		if(isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #278 <Field SerializationFeature SerializationFeature.WRITE_DATES_AS_TIMESTAMPS>
	//*   2    4:invokevirtual   #247 <Method boolean isEnabled(SerializationFeature)>
	//*   3    7:ifeq            16
		{
			jsongenerator.writeNumber(l);
	//    4   10:aload_3         
	//    5   11:lload_1         
	//    6   12:invokevirtual   #281 <Method void JsonGenerator.writeNumber(long)>
			return;
	//    7   15:return          
		} else
		{
			jsongenerator.writeString(_dateFormat().format(new Date(l)));
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #260 <Method DateFormat _dateFormat()>
	//   11   21:new             #262 <Class Date>
	//   12   24:dup             
	//   13   25:lload_1         
	//   14   26:invokespecial   #265 <Method void Date(long)>
	//   15   29:invokevirtual   #269 <Method String DateFormat.format(Date)>
	//   16   32:invokevirtual   #284 <Method void JsonGenerator.writeString(String)>
			return;
	//   17   35:return          
		}
	}

	public final void defaultSerializeDateValue(Date date, JsonGenerator jsongenerator)
		throws IOException
	{
		if(isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #278 <Field SerializationFeature SerializationFeature.WRITE_DATES_AS_TIMESTAMPS>
	//*   2    4:invokevirtual   #247 <Method boolean isEnabled(SerializationFeature)>
	//*   3    7:ifeq            19
		{
			jsongenerator.writeNumber(date.getTime());
	//    4   10:aload_2         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #274 <Method long Date.getTime()>
	//    7   15:invokevirtual   #281 <Method void JsonGenerator.writeNumber(long)>
			return;
	//    8   18:return          
		} else
		{
			jsongenerator.writeString(_dateFormat().format(date));
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #260 <Method DateFormat _dateFormat()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #269 <Method String DateFormat.format(Date)>
	//   14   28:invokevirtual   #284 <Method void JsonGenerator.writeString(String)>
			return;
	//   15   31:return          
		}
	}

	public final void defaultSerializeField(String s, Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeFieldName(s);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #258 <Method void JsonGenerator.writeFieldName(String)>
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       32
		{
			if(_stdNullValueSerializer)
	//*   5    9:aload_0         
	//*   6   10:getfield        #80  <Field boolean _stdNullValueSerializer>
	//*   7   13:ifeq            21
			{
				jsongenerator.writeNull();
	//    8   16:aload_3         
	//    9   17:invokevirtual   #289 <Method void JsonGenerator.writeNull()>
				return;
	//   10   20:return          
			} else
			{
				_nullValueSerializer.serialize(((Object) (null)), jsongenerator, this);
	//   11   21:aload_0         
	//   12   22:getfield        #61  <Field JsonSerializer _nullValueSerializer>
	//   13   25:aconst_null     
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #295 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   17   31:return          
			}
		} else
		{
			findTypedValueSerializer(obj.getClass(), true, ((BeanProperty) (null))).serialize(obj, jsongenerator, this);
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #203 <Method Class Object.getClass()>
	//   21   37:iconst_1        
	//   22   38:aconst_null     
	//   23   39:invokevirtual   #299 <Method JsonSerializer findTypedValueSerializer(Class, boolean, BeanProperty)>
	//   24   42:aload_2         
	//   25   43:aload_3         
	//   26   44:aload_0         
	//   27   45:invokevirtual   #295 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   28   48:return          
		}
	}

	public final void defaultSerializeNull(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_stdNullValueSerializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field boolean _stdNullValueSerializer>
	//*   2    4:ifeq            12
		{
			jsongenerator.writeNull();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #289 <Method void JsonGenerator.writeNull()>
			return;
	//    5   11:return          
		} else
		{
			_nullValueSerializer.serialize(((Object) (null)), jsongenerator, this);
	//    6   12:aload_0         
	//    7   13:getfield        #61  <Field JsonSerializer _nullValueSerializer>
	//    8   16:aconst_null     
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #295 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   12   22:return          
		}
	}

	public final void defaultSerializeValue(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       27
		{
			if(_stdNullValueSerializer)
	//*   2    4:aload_0         
	//*   3    5:getfield        #80  <Field boolean _stdNullValueSerializer>
	//*   4    8:ifeq            16
			{
				jsongenerator.writeNull();
	//    5   11:aload_2         
	//    6   12:invokevirtual   #289 <Method void JsonGenerator.writeNull()>
				return;
	//    7   15:return          
			} else
			{
				_nullValueSerializer.serialize(((Object) (null)), jsongenerator, this);
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field JsonSerializer _nullValueSerializer>
	//   10   20:aconst_null     
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #295 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   14   26:return          
			}
		} else
		{
			findTypedValueSerializer(obj.getClass(), true, ((BeanProperty) (null))).serialize(obj, jsongenerator, this);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #203 <Method Class Object.getClass()>
	//   18   32:iconst_1        
	//   19   33:aconst_null     
	//   20   34:invokevirtual   #299 <Method JsonSerializer findTypedValueSerializer(Class, boolean, BeanProperty)>
	//   21   37:aload_1         
	//   22   38:aload_2         
	//   23   39:aload_0         
	//   24   40:invokevirtual   #295 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   25   43:return          
		}
	}

	public JsonSerializer findKeySerializer(JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return _handleContextualResolvable(_serializerFactory.createKeySerializer(_config, javatype, _keySerializer), beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field SerializerFactory _serializerFactory>
	//    3    5:aload_0         
	//    4    6:getfield        #65  <Field SerializationConfig _config>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #83  <Field JsonSerializer _keySerializer>
	//    8   14:invokevirtual   #309 <Method JsonSerializer SerializerFactory.createKeySerializer(SerializationConfig, JavaType, JsonSerializer)>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #311 <Method JsonSerializer _handleContextualResolvable(JsonSerializer, BeanProperty)>
	//   11   21:areturn         
	}

	public JsonSerializer findKeySerializer(Class class1, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return findKeySerializer(_config.constructType(class1), beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field SerializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #130 <Method JavaType SerializationConfig.constructType(Class)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #315 <Method JsonSerializer findKeySerializer(JavaType, BeanProperty)>
	//    7   13:areturn         
	}

	public JsonSerializer findNullKeySerializer(JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return _nullKeySerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field JsonSerializer _nullKeySerializer>
	//    2    4:areturn         
	}

	public JsonSerializer findNullValueSerializer(BeanProperty beanproperty)
		throws JsonMappingException
	{
		return _nullValueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field JsonSerializer _nullValueSerializer>
	//    2    4:areturn         
	}

	public abstract WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator);

	public JsonSerializer findPrimaryPropertySerializer(JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #325 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(JavaType)>
	//    4    8:astore          4
		JsonSerializer jsonserializer = jsonserializer1;
	//    5   10:aload           4
	//    6   12:astore_3        
		if(jsonserializer1 == null)
	//*   7   13:aload           4
	//*   8   15:ifnonnull       60
		{
			JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(javatype);
	//    9   18:aload_0         
	//   10   19:getfield        #72  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #326 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
	//   13   26:astore          4
			jsonserializer = jsonserializer2;
	//   14   28:aload           4
	//   15   30:astore_3        
			if(jsonserializer2 == null)
	//*  16   31:aload           4
	//*  17   33:ifnonnull       60
			{
				JsonSerializer jsonserializer3 = _createAndCacheUntypedSerializer(javatype);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #328 <Method JsonSerializer _createAndCacheUntypedSerializer(JavaType)>
	//   21   41:astore          4
				jsonserializer = jsonserializer3;
	//   22   43:aload           4
	//   23   45:astore_3        
				if(jsonserializer3 == null)
	//*  24   46:aload           4
	//*  25   48:ifnonnull       60
					return getUnknownTypeSerializer(javatype.getRawClass());
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #192 <Method Class JavaType.getRawClass()>
	//   29   56:invokevirtual   #331 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   30   59:areturn         
			}
		}
		return handlePrimaryContextualization(jsonserializer, beanproperty);
	//   31   60:aload_0         
	//   32   61:aload_3         
	//   33   62:aload_2         
	//   34   63:invokevirtual   #334 <Method JsonSerializer handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   35   66:areturn         
	}

	public JsonSerializer findPrimaryPropertySerializer(Class class1, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(Class)>
	//    4    8:astore          4
		JsonSerializer jsonserializer = jsonserializer1;
	//    5   10:aload           4
	//    6   12:astore_3        
		if(jsonserializer1 == null)
	//*   7   13:aload           4
	//*   8   15:ifnonnull       82
		{
			JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(class1);
	//    9   18:aload_0         
	//   10   19:getfield        #72  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #159 <Method JsonSerializer SerializerCache.untypedValueSerializer(Class)>
	//   13   26:astore          4
			jsonserializer = jsonserializer2;
	//   14   28:aload           4
	//   15   30:astore_3        
			if(jsonserializer2 == null)
	//*  16   31:aload           4
	//*  17   33:ifnonnull       82
			{
				JsonSerializer jsonserializer3 = _serializerCache.untypedValueSerializer(_config.constructType(class1));
	//   18   36:aload_0         
	//   19   37:getfield        #72  <Field SerializerCache _serializerCache>
	//   20   40:aload_0         
	//   21   41:getfield        #65  <Field SerializationConfig _config>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #130 <Method JavaType SerializationConfig.constructType(Class)>
	//   24   48:invokevirtual   #326 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
	//   25   51:astore          4
				jsonserializer = jsonserializer3;
	//   26   53:aload           4
	//   27   55:astore_3        
				if(jsonserializer3 == null)
	//*  28   56:aload           4
	//*  29   58:ifnonnull       82
				{
					JsonSerializer jsonserializer4 = _createAndCacheUntypedSerializer(class1);
	//   30   61:aload_0         
	//   31   62:aload_1         
	//   32   63:invokevirtual   #161 <Method JsonSerializer _createAndCacheUntypedSerializer(Class)>
	//   33   66:astore          4
					jsonserializer = jsonserializer4;
	//   34   68:aload           4
	//   35   70:astore_3        
					if(jsonserializer4 == null)
	//*  36   71:aload           4
	//*  37   73:ifnonnull       82
						return getUnknownTypeSerializer(class1);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokevirtual   #331 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   41   81:areturn         
				}
			}
		}
		return handlePrimaryContextualization(jsonserializer, beanproperty);
	//   42   82:aload_0         
	//   43   83:aload_3         
	//   44   84:aload_2         
	//   45   85:invokevirtual   #334 <Method JsonSerializer handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   46   88:areturn         
	}

	public TypeSerializer findTypeSerializer(JavaType javatype)
		throws JsonMappingException
	{
		return _serializerFactory.createTypeSerializer(_config, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field SerializerFactory _serializerFactory>
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field SerializationConfig _config>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #340 <Method TypeSerializer SerializerFactory.createTypeSerializer(SerializationConfig, JavaType)>
	//    6   12:areturn         
	}

	public JsonSerializer findTypedValueSerializer(JavaType javatype, boolean flag, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_knownSerializers.typedValueSerializer(javatype)));
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #344 <Method JsonSerializer ReadOnlyClassToSerializerMap.typedValueSerializer(JavaType)>
	//    4    8:astore          4
		if(obj != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          18
			return ((JsonSerializer) (obj));
	//    7   15:aload           4
	//    8   17:areturn         
		obj = ((Object) (_serializerCache.typedValueSerializer(javatype)));
	//    9   18:aload_0         
	//   10   19:getfield        #72  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #345 <Method JsonSerializer SerializerCache.typedValueSerializer(JavaType)>
	//   13   26:astore          4
		if(obj != null)
	//*  14   28:aload           4
	//*  15   30:ifnull          36
			return ((JsonSerializer) (obj));
	//   16   33:aload           4
	//   17   35:areturn         
		JsonSerializer jsonserializer = findValueSerializer(javatype, beanproperty);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_3         
	//   21   39:invokevirtual   #348 <Method JsonSerializer findValueSerializer(JavaType, BeanProperty)>
	//   22   42:astore          5
		TypeSerializer typeserializer = _serializerFactory.createTypeSerializer(_config, javatype);
	//   23   44:aload_0         
	//   24   45:getfield        #67  <Field SerializerFactory _serializerFactory>
	//   25   48:aload_0         
	//   26   49:getfield        #65  <Field SerializationConfig _config>
	//   27   52:aload_1         
	//   28   53:invokevirtual   #340 <Method TypeSerializer SerializerFactory.createTypeSerializer(SerializationConfig, JavaType)>
	//   29   56:astore          6
		obj = ((Object) (jsonserializer));
	//   30   58:aload           5
	//   31   60:astore          4
		if(typeserializer != null)
	//*  32   62:aload           6
	//*  33   64:ifnull          84
			obj = ((Object) (new TypeWrappedSerializer(typeserializer.forProperty(beanproperty), jsonserializer)));
	//   34   67:new             #350 <Class TypeWrappedSerializer>
	//   35   70:dup             
	//   36   71:aload           6
	//   37   73:aload_3         
	//   38   74:invokevirtual   #356 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
	//   39   77:aload           5
	//   40   79:invokespecial   #359 <Method void TypeWrappedSerializer(TypeSerializer, JsonSerializer)>
	//   41   82:astore          4
		if(flag)
	//*  42   84:iload_2         
	//*  43   85:ifeq            98
			_serializerCache.addTypedSerializer(javatype, ((JsonSerializer) (obj)));
	//   44   88:aload_0         
	//   45   89:getfield        #72  <Field SerializerCache _serializerCache>
	//   46   92:aload_1         
	//   47   93:aload           4
	//   48   95:invokevirtual   #363 <Method void SerializerCache.addTypedSerializer(JavaType, JsonSerializer)>
		return ((JsonSerializer) (obj));
	//   49   98:aload           4
	//   50  100:areturn         
	}

	public JsonSerializer findTypedValueSerializer(Class class1, boolean flag, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_knownSerializers.typedValueSerializer(class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #366 <Method JsonSerializer ReadOnlyClassToSerializerMap.typedValueSerializer(Class)>
	//    4    8:astore          4
		if(obj != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          18
			return ((JsonSerializer) (obj));
	//    7   15:aload           4
	//    8   17:areturn         
		obj = ((Object) (_serializerCache.typedValueSerializer(class1)));
	//    9   18:aload_0         
	//   10   19:getfield        #72  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #367 <Method JsonSerializer SerializerCache.typedValueSerializer(Class)>
	//   13   26:astore          4
		if(obj != null)
	//*  14   28:aload           4
	//*  15   30:ifnull          36
			return ((JsonSerializer) (obj));
	//   16   33:aload           4
	//   17   35:areturn         
		JsonSerializer jsonserializer = findValueSerializer(class1, beanproperty);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_3         
	//   21   39:invokevirtual   #369 <Method JsonSerializer findValueSerializer(Class, BeanProperty)>
	//   22   42:astore          5
		TypeSerializer typeserializer = _serializerFactory.createTypeSerializer(_config, _config.constructType(class1));
	//   23   44:aload_0         
	//   24   45:getfield        #67  <Field SerializerFactory _serializerFactory>
	//   25   48:aload_0         
	//   26   49:getfield        #65  <Field SerializationConfig _config>
	//   27   52:aload_0         
	//   28   53:getfield        #65  <Field SerializationConfig _config>
	//   29   56:aload_1         
	//   30   57:invokevirtual   #130 <Method JavaType SerializationConfig.constructType(Class)>
	//   31   60:invokevirtual   #340 <Method TypeSerializer SerializerFactory.createTypeSerializer(SerializationConfig, JavaType)>
	//   32   63:astore          6
		obj = ((Object) (jsonserializer));
	//   33   65:aload           5
	//   34   67:astore          4
		if(typeserializer != null)
	//*  35   69:aload           6
	//*  36   71:ifnull          91
			obj = ((Object) (new TypeWrappedSerializer(typeserializer.forProperty(beanproperty), jsonserializer)));
	//   37   74:new             #350 <Class TypeWrappedSerializer>
	//   38   77:dup             
	//   39   78:aload           6
	//   40   80:aload_3         
	//   41   81:invokevirtual   #356 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
	//   42   84:aload           5
	//   43   86:invokespecial   #359 <Method void TypeWrappedSerializer(TypeSerializer, JsonSerializer)>
	//   44   89:astore          4
		if(flag)
	//*  45   91:iload_2         
	//*  46   92:ifeq            105
			_serializerCache.addTypedSerializer(class1, ((JsonSerializer) (obj)));
	//   47   95:aload_0         
	//   48   96:getfield        #72  <Field SerializerCache _serializerCache>
	//   49   99:aload_1         
	//   50  100:aload           4
	//   51  102:invokevirtual   #372 <Method void SerializerCache.addTypedSerializer(Class, JsonSerializer)>
		return ((JsonSerializer) (obj));
	//   52  105:aload           4
	//   53  107:areturn         
	}

	public JsonSerializer findValueSerializer(JavaType javatype)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #325 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(JavaType)>
	//    4    8:astore_3        
		JsonSerializer jsonserializer = jsonserializer1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(jsonserializer1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       51
		{
			JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(javatype);
	//    9   15:aload_0         
	//   10   16:getfield        #72  <Field SerializerCache _serializerCache>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #326 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
	//   13   23:astore_3        
			jsonserializer = jsonserializer2;
	//   14   24:aload_3         
	//   15   25:astore_2        
			if(jsonserializer2 == null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       51
			{
				JsonSerializer jsonserializer3 = _createAndCacheUntypedSerializer(javatype);
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:invokevirtual   #328 <Method JsonSerializer _createAndCacheUntypedSerializer(JavaType)>
	//   21   35:astore_3        
				jsonserializer = jsonserializer3;
	//   22   36:aload_3         
	//   23   37:astore_2        
				if(jsonserializer3 == null)
	//*  24   38:aload_3         
	//*  25   39:ifnonnull       51
					jsonserializer = getUnknownTypeSerializer(javatype.getRawClass());
	//   26   42:aload_0         
	//   27   43:aload_1         
	//   28   44:invokevirtual   #192 <Method Class JavaType.getRawClass()>
	//   29   47:invokevirtual   #331 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   30   50:astore_2        
			}
		}
		return jsonserializer;
	//   31   51:aload_2         
	//   32   52:areturn         
	}

	public JsonSerializer findValueSerializer(JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #325 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(JavaType)>
	//    4    8:astore          4
		JsonSerializer jsonserializer = jsonserializer1;
	//    5   10:aload           4
	//    6   12:astore_3        
		if(jsonserializer1 == null)
	//*   7   13:aload           4
	//*   8   15:ifnonnull       60
		{
			JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(javatype);
	//    9   18:aload_0         
	//   10   19:getfield        #72  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #326 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
	//   13   26:astore          4
			jsonserializer = jsonserializer2;
	//   14   28:aload           4
	//   15   30:astore_3        
			if(jsonserializer2 == null)
	//*  16   31:aload           4
	//*  17   33:ifnonnull       60
			{
				JsonSerializer jsonserializer3 = _createAndCacheUntypedSerializer(javatype);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #328 <Method JsonSerializer _createAndCacheUntypedSerializer(JavaType)>
	//   21   41:astore          4
				jsonserializer = jsonserializer3;
	//   22   43:aload           4
	//   23   45:astore_3        
				if(jsonserializer3 == null)
	//*  24   46:aload           4
	//*  25   48:ifnonnull       60
					return getUnknownTypeSerializer(javatype.getRawClass());
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #192 <Method Class JavaType.getRawClass()>
	//   29   56:invokevirtual   #331 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   30   59:areturn         
			}
		}
		return handleSecondaryContextualization(jsonserializer, beanproperty);
	//   31   60:aload_0         
	//   32   61:aload_3         
	//   33   62:aload_2         
	//   34   63:invokevirtual   #175 <Method JsonSerializer handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   35   66:areturn         
	}

	public JsonSerializer findValueSerializer(Class class1)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(Class)>
	//    4    8:astore_3        
		JsonSerializer jsonserializer = jsonserializer1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(jsonserializer1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       70
		{
			JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(class1);
	//    9   15:aload_0         
	//   10   16:getfield        #72  <Field SerializerCache _serializerCache>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #159 <Method JsonSerializer SerializerCache.untypedValueSerializer(Class)>
	//   13   23:astore_3        
			jsonserializer = jsonserializer2;
	//   14   24:aload_3         
	//   15   25:astore_2        
			if(jsonserializer2 == null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       70
			{
				JsonSerializer jsonserializer3 = _serializerCache.untypedValueSerializer(_config.constructType(class1));
	//   18   30:aload_0         
	//   19   31:getfield        #72  <Field SerializerCache _serializerCache>
	//   20   34:aload_0         
	//   21   35:getfield        #65  <Field SerializationConfig _config>
	//   22   38:aload_1         
	//   23   39:invokevirtual   #130 <Method JavaType SerializationConfig.constructType(Class)>
	//   24   42:invokevirtual   #326 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
	//   25   45:astore_3        
				jsonserializer = jsonserializer3;
	//   26   46:aload_3         
	//   27   47:astore_2        
				if(jsonserializer3 == null)
	//*  28   48:aload_3         
	//*  29   49:ifnonnull       70
				{
					JsonSerializer jsonserializer4 = _createAndCacheUntypedSerializer(class1);
	//   30   52:aload_0         
	//   31   53:aload_1         
	//   32   54:invokevirtual   #161 <Method JsonSerializer _createAndCacheUntypedSerializer(Class)>
	//   33   57:astore_3        
					jsonserializer = jsonserializer4;
	//   34   58:aload_3         
	//   35   59:astore_2        
					if(jsonserializer4 == null)
	//*  36   60:aload_3         
	//*  37   61:ifnonnull       70
						jsonserializer = getUnknownTypeSerializer(class1);
	//   38   64:aload_0         
	//   39   65:aload_1         
	//   40   66:invokevirtual   #331 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   41   69:astore_2        
				}
			}
		}
		return jsonserializer;
	//   42   70:aload_2         
	//   43   71:areturn         
	}

	public JsonSerializer findValueSerializer(Class class1, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(Class)>
	//    4    8:astore          4
		JsonSerializer jsonserializer = jsonserializer1;
	//    5   10:aload           4
	//    6   12:astore_3        
		if(jsonserializer1 == null)
	//*   7   13:aload           4
	//*   8   15:ifnonnull       82
		{
			JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(class1);
	//    9   18:aload_0         
	//   10   19:getfield        #72  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #159 <Method JsonSerializer SerializerCache.untypedValueSerializer(Class)>
	//   13   26:astore          4
			jsonserializer = jsonserializer2;
	//   14   28:aload           4
	//   15   30:astore_3        
			if(jsonserializer2 == null)
	//*  16   31:aload           4
	//*  17   33:ifnonnull       82
			{
				JsonSerializer jsonserializer3 = _serializerCache.untypedValueSerializer(_config.constructType(class1));
	//   18   36:aload_0         
	//   19   37:getfield        #72  <Field SerializerCache _serializerCache>
	//   20   40:aload_0         
	//   21   41:getfield        #65  <Field SerializationConfig _config>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #130 <Method JavaType SerializationConfig.constructType(Class)>
	//   24   48:invokevirtual   #326 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
	//   25   51:astore          4
				jsonserializer = jsonserializer3;
	//   26   53:aload           4
	//   27   55:astore_3        
				if(jsonserializer3 == null)
	//*  28   56:aload           4
	//*  29   58:ifnonnull       82
				{
					JsonSerializer jsonserializer4 = _createAndCacheUntypedSerializer(class1);
	//   30   61:aload_0         
	//   31   62:aload_1         
	//   32   63:invokevirtual   #161 <Method JsonSerializer _createAndCacheUntypedSerializer(Class)>
	//   33   66:astore          4
					jsonserializer = jsonserializer4;
	//   34   68:aload           4
	//   35   70:astore_3        
					if(jsonserializer4 == null)
	//*  36   71:aload           4
	//*  37   73:ifnonnull       82
						return getUnknownTypeSerializer(class1);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:invokevirtual   #331 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   41   81:areturn         
				}
			}
		}
		return handleSecondaryContextualization(jsonserializer, beanproperty);
	//   42   82:aload_0         
	//   43   83:aload_3         
	//   44   84:aload_2         
	//   45   85:invokevirtual   #175 <Method JsonSerializer handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   46   88:areturn         
	}

	public final Class getActiveView()
	{
		return _serializationView;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Class _serializationView>
	//    2    4:areturn         
	}

	public final AnnotationIntrospector getAnnotationIntrospector()
	{
		return _config.getAnnotationIntrospector();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #378 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    3    7:areturn         
	}

	public Object getAttribute(Object obj)
	{
		return _attributes.getAttribute(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field ContextAttributes _attributes>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #384 <Method Object ContextAttributes.getAttribute(Object)>
	//    4    8:areturn         
	}

	public final SerializationConfig getConfig()
	{
		return _config;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:areturn         
	}

	public volatile MapperConfig getConfig()
	{
		return ((MapperConfig) (getConfig()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #389 <Method SerializationConfig getConfig()>
	//    2    4:areturn         
	}

	public JsonSerializer getDefaultNullKeySerializer()
	{
		return _nullKeySerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field JsonSerializer _nullKeySerializer>
	//    2    4:areturn         
	}

	public JsonSerializer getDefaultNullValueSerializer()
	{
		return _nullValueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field JsonSerializer _nullValueSerializer>
	//    2    4:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class class1)
	{
		return _config.getDefaultPropertyFormat(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #397 <Method com.fasterxml.jackson.annotation.JsonFormat$Value SerializationConfig.getDefaultPropertyFormat(Class)>
	//    4    8:areturn         
	}

	public final FilterProvider getFilterProvider()
	{
		return _config.getFilterProvider();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #402 <Method FilterProvider SerializationConfig.getFilterProvider()>
	//    3    7:areturn         
	}

	public Locale getLocale()
	{
		return _config.getLocale();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #406 <Method Locale SerializationConfig.getLocale()>
	//    3    7:areturn         
	}

	public final Class getSerializationView()
	{
		return _serializationView;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Class _serializationView>
	//    2    4:areturn         
	}

	public TimeZone getTimeZone()
	{
		return _config.getTimeZone();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #413 <Method TimeZone SerializationConfig.getTimeZone()>
	//    3    7:areturn         
	}

	public final TypeFactory getTypeFactory()
	{
		return _config.getTypeFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #417 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//    3    7:areturn         
	}

	public JsonSerializer getUnknownTypeSerializer(Class class1)
	{
		if(class1 == java/lang/Object)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #200 <Class Object>
	//*   2    3:if_acmpne       11
			return _unknownTypeSerializer;
	//    3    6:aload_0         
	//    4    7:getfield        #53  <Field JsonSerializer _unknownTypeSerializer>
	//    5   10:areturn         
		else
			return ((JsonSerializer) (new UnknownSerializer(class1)));
	//    6   11:new             #45  <Class UnknownSerializer>
	//    7   14:dup             
	//    8   15:aload_1         
	//    9   16:invokespecial   #420 <Method void UnknownSerializer(Class)>
	//   10   19:areturn         
	}

	public JsonSerializer handlePrimaryContextualization(JsonSerializer jsonserializer, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = jsonserializer;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(jsonserializer != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          27
		{
			jsonserializer1 = jsonserializer;
	//    4    6:aload_1         
	//    5    7:astore_3        
			if(jsonserializer instanceof ContextualSerializer)
	//*   6    8:aload_1         
	//*   7    9:instanceof      #422 <Class ContextualSerializer>
	//*   8   12:ifeq            27
				jsonserializer1 = ((ContextualSerializer)jsonserializer).createContextual(this, beanproperty);
	//    9   15:aload_1         
	//   10   16:checkcast       #422 <Class ContextualSerializer>
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokeinterface #426 <Method JsonSerializer ContextualSerializer.createContextual(SerializerProvider, BeanProperty)>
	//   14   26:astore_3        
		}
		return jsonserializer1;
	//   15   27:aload_3         
	//   16   28:areturn         
	}

	public JsonSerializer handleSecondaryContextualization(JsonSerializer jsonserializer, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = jsonserializer;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(jsonserializer != null)
	//*   2    2:aload_1         
	//*   3    3:ifnull          27
		{
			jsonserializer1 = jsonserializer;
	//    4    6:aload_1         
	//    5    7:astore_3        
			if(jsonserializer instanceof ContextualSerializer)
	//*   6    8:aload_1         
	//*   7    9:instanceof      #422 <Class ContextualSerializer>
	//*   8   12:ifeq            27
				jsonserializer1 = ((ContextualSerializer)jsonserializer).createContextual(this, beanproperty);
	//    9   15:aload_1         
	//   10   16:checkcast       #422 <Class ContextualSerializer>
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokeinterface #426 <Method JsonSerializer ContextualSerializer.createContextual(SerializerProvider, BeanProperty)>
	//   14   26:astore_3        
		}
		return jsonserializer1;
	//   15   27:aload_3         
	//   16   28:areturn         
	}

	public final boolean hasSerializationFeatures(int i)
	{
		return _config.hasSerializationFeatures(i);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #431 <Method boolean SerializationConfig.hasSerializationFeatures(int)>
	//    4    8:ireturn         
	}

	public final boolean isEnabled(MapperFeature mapperfeature)
	{
		return _config.isEnabled(mapperfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #434 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//    4    8:ireturn         
	}

	public final boolean isEnabled(SerializationFeature serializationfeature)
	{
		return _config.isEnabled(serializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #435 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//    4    8:ireturn         
	}

	public boolean isUnknownTypeSerializer(JsonSerializer jsonserializer)
	{
		while(jsonserializer == _unknownTypeSerializer || jsonserializer == null || isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS) && ((Object) (jsonserializer)).getClass() == com/fasterxml/jackson/databind/ser/impl/UnknownSerializer) 
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #53  <Field JsonSerializer _unknownTypeSerializer>
	//*   3    5:if_acmpeq       12
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
			return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:aload_0         
	//    9   15:getstatic       #438 <Field SerializationFeature SerializationFeature.FAIL_ON_EMPTY_BEANS>
	//   10   18:invokevirtual   #247 <Method boolean isEnabled(SerializationFeature)>
	//   11   21:ifeq            33
	//   12   24:aload_1         
	//   13   25:invokevirtual   #203 <Method Class Object.getClass()>
	//   14   28:ldc1            #45  <Class UnknownSerializer>
	//   15   30:if_acmpeq       12
		return false;
	//   16   33:iconst_0        
	//   17   34:ireturn         
	}

	public transient JsonMappingException mappingException(String s, Object aobj[])
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(aobj != null)
	//*   2    2:aload_2         
	//*   3    3:ifnull          19
		{
			s1 = s;
	//    4    6:aload_1         
	//    5    7:astore_3        
			if(aobj.length > 0)
	//*   6    8:aload_2         
	//*   7    9:arraylength     
	//*   8   10:ifle            19
				s1 = String.format(s, aobj);
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokestatic    #444 <Method String String.format(String, Object[])>
	//   12   18:astore_3        
		}
		return JsonMappingException.from(this, s1);
	//   13   19:aload_0         
	//   14   20:aload_3         
	//   15   21:invokestatic    #232 <Method JsonMappingException JsonMappingException.from(SerializerProvider, String)>
	//   16   24:areturn         
	}

	public abstract JsonSerializer serializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException;

	public volatile DatabindContext setAttribute(Object obj, Object obj1)
	{
		return ((DatabindContext) (setAttribute(obj, obj1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #451 <Method SerializerProvider setAttribute(Object, Object)>
	//    4    6:areturn         
	}

	public SerializerProvider setAttribute(Object obj, Object obj1)
	{
		_attributes = _attributes.withPerCallAttribute(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #78  <Field ContextAttributes _attributes>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #455 <Method ContextAttributes ContextAttributes.withPerCallAttribute(Object, Object)>
	//    6   10:putfield        #78  <Field ContextAttributes _attributes>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public void setDefaultKeySerializer(JsonSerializer jsonserializer)
	{
		if(jsonserializer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("Can not pass null JsonSerializer");
	//    2    4:new             #107 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #459 <String "Can not pass null JsonSerializer">
	//    5   11:invokespecial   #460 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			_keySerializer = jsonserializer;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #83  <Field JsonSerializer _keySerializer>
			return;
	//   10   20:return          
		}
	}

	public void setNullKeySerializer(JsonSerializer jsonserializer)
	{
		if(jsonserializer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("Can not pass null JsonSerializer");
	//    2    4:new             #107 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #459 <String "Can not pass null JsonSerializer">
	//    5   11:invokespecial   #460 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			_nullKeySerializer = jsonserializer;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #63  <Field JsonSerializer _nullKeySerializer>
			return;
	//   10   20:return          
		}
	}

	public void setNullValueSerializer(JsonSerializer jsonserializer)
	{
		if(jsonserializer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("Can not pass null JsonSerializer");
	//    2    4:new             #107 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #459 <String "Can not pass null JsonSerializer">
	//    5   11:invokespecial   #460 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			_nullValueSerializer = jsonserializer;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #61  <Field JsonSerializer _nullValueSerializer>
			return;
	//   10   20:return          
		}
	}

	protected static final boolean CACHE_UNKNOWN_MAPPINGS = false;
	public static final JsonSerializer DEFAULT_NULL_KEY_SERIALIZER = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
	protected static final JsonSerializer DEFAULT_UNKNOWN_SERIALIZER = new UnknownSerializer();
	protected transient ContextAttributes _attributes;
	protected final SerializationConfig _config;
	protected DateFormat _dateFormat;
	protected JsonSerializer _keySerializer;
	protected final ReadOnlyClassToSerializerMap _knownSerializers;
	protected JsonSerializer _nullKeySerializer;
	protected JsonSerializer _nullValueSerializer;
	protected final Class _serializationView;
	protected final SerializerCache _serializerCache;
	protected final SerializerFactory _serializerFactory;
	protected final boolean _stdNullValueSerializer;
	protected JsonSerializer _unknownTypeSerializer;

	static 
	{
	//    0    0:new             #35  <Class FailingSerializer>
	//    1    3:dup             
	//    2    4:ldc1            #37  <String "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)">
	//    3    6:invokespecial   #41  <Method void FailingSerializer(String)>
	//    4    9:putstatic       #43  <Field JsonSerializer DEFAULT_NULL_KEY_SERIALIZER>
	//    5   12:new             #45  <Class UnknownSerializer>
	//    6   15:dup             
	//    7   16:invokespecial   #47  <Method void UnknownSerializer()>
	//    8   19:putstatic       #49  <Field JsonSerializer DEFAULT_UNKNOWN_SERIALIZER>
	//*   9   22:return          
	}
}
