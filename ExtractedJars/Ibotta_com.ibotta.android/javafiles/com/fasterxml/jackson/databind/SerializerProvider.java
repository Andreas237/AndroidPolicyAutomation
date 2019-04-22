// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
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
//			SerializationFeature, JsonSerializer, BeanDescription, BeanProperty, 
//			AnnotationIntrospector, MapperFeature

public abstract class SerializerProvider extends DatabindContext
{

	public SerializerProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void DatabindContext()>
		_unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
	//    2    4:aload_0         
	//    3    5:getstatic       #47  <Field JsonSerializer DEFAULT_UNKNOWN_SERIALIZER>
	//    4    8:putfield        #51  <Field JsonSerializer _unknownTypeSerializer>
		_nullValueSerializer = ((JsonSerializer) (NullSerializer.instance));
	//    5   11:aload_0         
	//    6   12:getstatic       #57  <Field NullSerializer NullSerializer.instance>
	//    7   15:putfield        #59  <Field JsonSerializer _nullValueSerializer>
		_nullKeySerializer = DEFAULT_NULL_KEY_SERIALIZER;
	//    8   18:aload_0         
	//    9   19:getstatic       #41  <Field JsonSerializer DEFAULT_NULL_KEY_SERIALIZER>
	//   10   22:putfield        #61  <Field JsonSerializer _nullKeySerializer>
		_config = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #63  <Field SerializationConfig _config>
		_serializerFactory = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #65  <Field SerializerFactory _serializerFactory>
		_serializerCache = new SerializerCache();
	//   17   35:aload_0         
	//   18   36:new             #67  <Class SerializerCache>
	//   19   39:dup             
	//   20   40:invokespecial   #68  <Method void SerializerCache()>
	//   21   43:putfield        #70  <Field SerializerCache _serializerCache>
		_knownSerializers = null;
	//   22   46:aload_0         
	//   23   47:aconst_null     
	//   24   48:putfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
		_serializationView = null;
	//   25   51:aload_0         
	//   26   52:aconst_null     
	//   27   53:putfield        #74  <Field Class _serializationView>
		_attributes = null;
	//   28   56:aload_0         
	//   29   57:aconst_null     
	//   30   58:putfield        #76  <Field ContextAttributes _attributes>
		_stdNullValueSerializer = true;
	//   31   61:aload_0         
	//   32   62:iconst_1        
	//   33   63:putfield        #78  <Field boolean _stdNullValueSerializer>
	//   34   66:return          
	}

	protected SerializerProvider(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void DatabindContext()>
		_unknownTypeSerializer = DEFAULT_UNKNOWN_SERIALIZER;
	//    2    4:aload_0         
	//    3    5:getstatic       #47  <Field JsonSerializer DEFAULT_UNKNOWN_SERIALIZER>
	//    4    8:putfield        #51  <Field JsonSerializer _unknownTypeSerializer>
		_nullValueSerializer = ((JsonSerializer) (NullSerializer.instance));
	//    5   11:aload_0         
	//    6   12:getstatic       #57  <Field NullSerializer NullSerializer.instance>
	//    7   15:putfield        #59  <Field JsonSerializer _nullValueSerializer>
		JsonSerializer jsonserializer = DEFAULT_NULL_KEY_SERIALIZER;
	//    8   18:getstatic       #41  <Field JsonSerializer DEFAULT_NULL_KEY_SERIALIZER>
	//    9   21:astore          5
		_nullKeySerializer = jsonserializer;
	//   10   23:aload_0         
	//   11   24:aload           5
	//   12   26:putfield        #61  <Field JsonSerializer _nullKeySerializer>
		_serializerFactory = serializerfactory;
	//   13   29:aload_0         
	//   14   30:aload_3         
	//   15   31:putfield        #65  <Field SerializerFactory _serializerFactory>
		_config = serializationconfig;
	//   16   34:aload_0         
	//   17   35:aload_2         
	//   18   36:putfield        #63  <Field SerializationConfig _config>
		_serializerCache = serializerprovider._serializerCache;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:getfield        #70  <Field SerializerCache _serializerCache>
	//   22   44:putfield        #70  <Field SerializerCache _serializerCache>
		_unknownTypeSerializer = serializerprovider._unknownTypeSerializer;
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:getfield        #51  <Field JsonSerializer _unknownTypeSerializer>
	//   26   52:putfield        #51  <Field JsonSerializer _unknownTypeSerializer>
		_keySerializer = serializerprovider._keySerializer;
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:getfield        #81  <Field JsonSerializer _keySerializer>
	//   30   60:putfield        #81  <Field JsonSerializer _keySerializer>
		_nullValueSerializer = serializerprovider._nullValueSerializer;
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getfield        #59  <Field JsonSerializer _nullValueSerializer>
	//   34   68:putfield        #59  <Field JsonSerializer _nullValueSerializer>
		_nullKeySerializer = serializerprovider._nullKeySerializer;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:getfield        #61  <Field JsonSerializer _nullKeySerializer>
	//   38   76:putfield        #61  <Field JsonSerializer _nullKeySerializer>
		boolean flag;
		if(_nullValueSerializer == jsonserializer)
	//*  39   79:aload_0         
	//*  40   80:getfield        #59  <Field JsonSerializer _nullValueSerializer>
	//*  41   83:aload           5
	//*  42   85:if_acmpne       94
			flag = true;
	//   43   88:iconst_1        
	//   44   89:istore          4
		else
	//*  45   91:goto            97
			flag = false;
	//   46   94:iconst_0        
	//   47   95:istore          4
		_stdNullValueSerializer = flag;
	//   48   97:aload_0         
	//   49   98:iload           4
	//   50  100:putfield        #78  <Field boolean _stdNullValueSerializer>
		_serializationView = serializationconfig.getActiveView();
	//   51  103:aload_0         
	//   52  104:aload_2         
	//   53  105:invokevirtual   #87  <Method Class SerializationConfig.getActiveView()>
	//   54  108:putfield        #74  <Field Class _serializationView>
		_attributes = serializationconfig.getAttributes();
	//   55  111:aload_0         
	//   56  112:aload_2         
	//   57  113:invokevirtual   #91  <Method ContextAttributes SerializationConfig.getAttributes()>
	//   58  116:putfield        #76  <Field ContextAttributes _attributes>
		_knownSerializers = _serializerCache.getReadOnlyLookupMap();
	//   59  119:aload_0         
	//   60  120:aload_0         
	//   61  121:getfield        #70  <Field SerializerCache _serializerCache>
	//   62  124:invokevirtual   #95  <Method ReadOnlyClassToSerializerMap SerializerCache.getReadOnlyLookupMap()>
	//   63  127:putfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//   64  130:return          
	}

	protected JsonSerializer _createAndCacheUntypedSerializer(JavaType javatype)
		throws JsonMappingException
	{
		Object obj;
		try
		{
			obj = ((Object) (_createUntypedSerializer(javatype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #104 <Method JsonSerializer _createUntypedSerializer(JavaType)>
	//    3    5:astore_2        
		}
	//*   4    6:goto            25
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   5    9:astore_2        
		{
			reportMappingProblem(((Throwable) (obj)), ((IllegalArgumentException) (obj)).getMessage(), new Object[0]);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #108 <Method String IllegalArgumentException.getMessage()>
	//   10   16:iconst_0        
	//   11   17:anewarray       Object[]
	//   12   20:invokevirtual   #114 <Method void reportMappingProblem(Throwable, String, Object[])>
			obj = null;
	//   13   23:aconst_null     
	//   14   24:astore_2        
		}
		if(obj != null)
	//*  15   25:aload_2         
	//*  16   26:ifnull          39
			_serializerCache.addAndResolveNonTypedSerializer(javatype, ((JsonSerializer) (obj)), this);
	//   17   29:aload_0         
	//   18   30:getfield        #70  <Field SerializerCache _serializerCache>
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:aload_0         
	//   22   36:invokevirtual   #118 <Method void SerializerCache.addAndResolveNonTypedSerializer(JavaType, JsonSerializer, SerializerProvider)>
		return ((JsonSerializer) (obj));
	//   23   39:aload_2         
	//   24   40:areturn         
	}

	protected JsonSerializer _createAndCacheUntypedSerializer(Class class1)
		throws JsonMappingException
	{
		JavaType javatype = _config.constructType(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #126 <Method JavaType SerializationConfig.constructType(Class)>
	//    4    8:astore_3        
		Object obj;
		try
		{
			obj = ((Object) (_createUntypedSerializer(javatype)));
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #104 <Method JsonSerializer _createUntypedSerializer(JavaType)>
	//    8   14:astore_2        
		}
	//*   9   15:goto            34
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   18:astore_2        
		{
			reportMappingProblem(((Throwable) (obj)), ((IllegalArgumentException) (obj)).getMessage(), new Object[0]);
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #108 <Method String IllegalArgumentException.getMessage()>
	//   15   25:iconst_0        
	//   16   26:anewarray       Object[]
	//   17   29:invokevirtual   #114 <Method void reportMappingProblem(Throwable, String, Object[])>
			obj = null;
	//   18   32:aconst_null     
	//   19   33:astore_2        
		}
		if(obj != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          49
			_serializerCache.addAndResolveNonTypedSerializer(class1, javatype, ((JsonSerializer) (obj)), this);
	//   22   38:aload_0         
	//   23   39:getfield        #70  <Field SerializerCache _serializerCache>
	//   24   42:aload_1         
	//   25   43:aload_3         
	//   26   44:aload_2         
	//   27   45:aload_0         
	//   28   46:invokevirtual   #129 <Method void SerializerCache.addAndResolveNonTypedSerializer(Class, JavaType, JsonSerializer, SerializerProvider)>
		return ((JsonSerializer) (obj));
	//   29   49:aload_2         
	//   30   50:areturn         
	}

	protected JsonSerializer _createUntypedSerializer(JavaType javatype)
		throws JsonMappingException
	{
		synchronized(_serializerCache)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field SerializerCache _serializerCache>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			javatype = ((JavaType) (_serializerFactory.createSerializer(this, javatype)));
	//    5    7:aload_0         
	//    6    8:getfield        #65  <Field SerializerFactory _serializerFactory>
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #136 <Method JsonSerializer SerializerFactory.createSerializer(SerializerProvider, JavaType)>
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
		DateFormat dateformat = _dateFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field DateFormat _dateFormat>
	//    2    4:astore_1        
		if(dateformat != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
		{
			return dateformat;
	//    5    9:aload_1         
	//    6   10:areturn         
		} else
		{
			DateFormat dateformat1 = (DateFormat)_config.getDateFormat().clone();
	//    7   11:aload_0         
	//    8   12:getfield        #63  <Field SerializationConfig _config>
	//    9   15:invokevirtual   #142 <Method DateFormat SerializationConfig.getDateFormat()>
	//   10   18:invokevirtual   #148 <Method Object DateFormat.clone()>
	//   11   21:checkcast       #144 <Class DateFormat>
	//   12   24:astore_1        
			_dateFormat = dateformat1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #139 <Field DateFormat _dateFormat>
			return dateformat1;
	//   16   30:aload_1         
	//   17   31:areturn         
		}
	}

	protected JsonSerializer _handleContextualResolvable(JsonSerializer jsonserializer, BeanProperty beanproperty)
		throws JsonMappingException
	{
		if(jsonserializer instanceof ResolvableSerializer)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #152 <Class ResolvableSerializer>
	//*   2    4:ifeq            17
			((ResolvableSerializer)jsonserializer).resolve(this);
	//    3    7:aload_1         
	//    4    8:checkcast       #152 <Class ResolvableSerializer>
	//    5   11:aload_0         
	//    6   12:invokeinterface #156 <Method void ResolvableSerializer.resolve(SerializerProvider)>
		return handleSecondaryContextualization(jsonserializer, beanproperty);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:invokevirtual   #159 <Method JsonSerializer handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   11   23:areturn         
	}

	protected JsonSerializer _handleResolvable(JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		if(jsonserializer instanceof ResolvableSerializer)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #152 <Class ResolvableSerializer>
	//*   2    4:ifeq            17
			((ResolvableSerializer)jsonserializer).resolve(this);
	//    3    7:aload_1         
	//    4    8:checkcast       #152 <Class ResolvableSerializer>
	//    5   11:aload_0         
	//    6   12:invokeinterface #156 <Method void ResolvableSerializer.resolve(SerializerProvider)>
		return jsonserializer;
	//    7   17:aload_1         
	//    8   18:areturn         
	}

	protected void _reportIncompatibleRootType(Object obj, JavaType javatype)
		throws IOException
	{
		if(javatype.isPrimitive() && ClassUtil.wrapperType(javatype.getRawClass()).isAssignableFrom(obj.getClass()))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #173 <Method boolean JavaType.isPrimitive()>
	//*   2    4:ifeq            25
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #176 <Method Class JavaType.getRawClass()>
	//*   5   11:invokestatic    #182 <Method Class ClassUtil.wrapperType(Class)>
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #185 <Method Class Object.getClass()>
	//*   8   18:invokevirtual   #191 <Method boolean Class.isAssignableFrom(Class)>
	//*   9   21:ifeq            25
		{
			return;
	//   10   24:return          
		} else
		{
			reportBadDefinition(javatype, String.format("Incompatible types: declared root type (%s) vs %s", new Object[] {
				javatype, ClassUtil.classNameOf(obj)
			}));
	//   11   25:aload_0         
	//   12   26:aload_2         
	//   13   27:ldc1            #193 <String "Incompatible types: declared root type (%s) vs %s">
	//   14   29:iconst_2        
	//   15   30:anewarray       Object[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:aload_2         
	//   19   36:aastore         
	//   20   37:dup             
	//   21   38:iconst_1        
	//   22   39:aload_1         
	//   23   40:invokestatic    #197 <Method String ClassUtil.classNameOf(Object)>
	//   24   43:aastore         
	//   25   44:invokestatic    #203 <Method String String.format(String, Object[])>
	//   26   47:invokevirtual   #207 <Method Object reportBadDefinition(JavaType, String)>
	//   27   50:pop             
			return;
	//   28   51:return          
		}
	}

	public final boolean canOverrideAccessModifiers()
	{
		return _config.canOverrideAccessModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #210 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//    3    7:ireturn         
	}

	public void defaultSerializeDateKey(long l, JsonGenerator jsongenerator)
		throws IOException
	{
		if(isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #218 <Field SerializationFeature SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS>
	//*   2    4:invokevirtual   #222 <Method boolean isEnabled(SerializationFeature)>
	//*   3    7:ifeq            19
		{
			jsongenerator.writeFieldName(String.valueOf(l));
	//    4   10:aload_3         
	//    5   11:lload_1         
	//    6   12:invokestatic    #226 <Method String String.valueOf(long)>
	//    7   15:invokevirtual   #231 <Method void JsonGenerator.writeFieldName(String)>
			return;
	//    8   18:return          
		} else
		{
			jsongenerator.writeFieldName(_dateFormat().format(new Date(l)));
	//    9   19:aload_3         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #233 <Method DateFormat _dateFormat()>
	//   12   24:new             #235 <Class Date>
	//   13   27:dup             
	//   14   28:lload_1         
	//   15   29:invokespecial   #238 <Method void Date(long)>
	//   16   32:invokevirtual   #241 <Method String DateFormat.format(Date)>
	//   17   35:invokevirtual   #231 <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   18   38:return          
		}
	}

	public void defaultSerializeDateKey(Date date, JsonGenerator jsongenerator)
		throws IOException
	{
		if(isEnabled(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #218 <Field SerializationFeature SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS>
	//*   2    4:invokevirtual   #222 <Method boolean isEnabled(SerializationFeature)>
	//*   3    7:ifeq            22
		{
			jsongenerator.writeFieldName(String.valueOf(date.getTime()));
	//    4   10:aload_2         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #246 <Method long Date.getTime()>
	//    7   15:invokestatic    #226 <Method String String.valueOf(long)>
	//    8   18:invokevirtual   #231 <Method void JsonGenerator.writeFieldName(String)>
			return;
	//    9   21:return          
		} else
		{
			jsongenerator.writeFieldName(_dateFormat().format(date));
	//   10   22:aload_2         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #233 <Method DateFormat _dateFormat()>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #241 <Method String DateFormat.format(Date)>
	//   15   31:invokevirtual   #231 <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   16   34:return          
		}
	}

	public final void defaultSerializeDateValue(Date date, JsonGenerator jsongenerator)
		throws IOException
	{
		if(isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #250 <Field SerializationFeature SerializationFeature.WRITE_DATES_AS_TIMESTAMPS>
	//*   2    4:invokevirtual   #222 <Method boolean isEnabled(SerializationFeature)>
	//*   3    7:ifeq            19
		{
			jsongenerator.writeNumber(date.getTime());
	//    4   10:aload_2         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #246 <Method long Date.getTime()>
	//    7   15:invokevirtual   #253 <Method void JsonGenerator.writeNumber(long)>
			return;
	//    8   18:return          
		} else
		{
			jsongenerator.writeString(_dateFormat().format(date));
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:invokevirtual   #233 <Method DateFormat _dateFormat()>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #241 <Method String DateFormat.format(Date)>
	//   14   28:invokevirtual   #256 <Method void JsonGenerator.writeString(String)>
			return;
	//   15   31:return          
		}
	}

	public final void defaultSerializeNull(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_stdNullValueSerializer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean _stdNullValueSerializer>
	//*   2    4:ifeq            12
		{
			jsongenerator.writeNull();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #261 <Method void JsonGenerator.writeNull()>
			return;
	//    5   11:return          
		} else
		{
			_nullValueSerializer.serialize(((Object) (null)), jsongenerator, this);
	//    6   12:aload_0         
	//    7   13:getfield        #59  <Field JsonSerializer _nullValueSerializer>
	//    8   16:aconst_null     
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #267 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   12   22:return          
		}
	}

	public JsonSerializer findKeySerializer(JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return _handleContextualResolvable(_serializerFactory.createKeySerializer(_config, javatype, _keySerializer), beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #65  <Field SerializerFactory _serializerFactory>
	//    3    5:aload_0         
	//    4    6:getfield        #63  <Field SerializationConfig _config>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #81  <Field JsonSerializer _keySerializer>
	//    8   14:invokevirtual   #273 <Method JsonSerializer SerializerFactory.createKeySerializer(SerializationConfig, JavaType, JsonSerializer)>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #275 <Method JsonSerializer _handleContextualResolvable(JsonSerializer, BeanProperty)>
	//   11   21:areturn         
	}

	public JsonSerializer findKeySerializer(Class class1, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return findKeySerializer(_config.constructType(class1), beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field SerializationConfig _config>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #126 <Method JavaType SerializationConfig.constructType(Class)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #279 <Method JsonSerializer findKeySerializer(JavaType, BeanProperty)>
	//    7   13:areturn         
	}

	public JsonSerializer findNullKeySerializer(JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return _nullKeySerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field JsonSerializer _nullKeySerializer>
	//    2    4:areturn         
	}

	public JsonSerializer findNullValueSerializer(BeanProperty beanproperty)
		throws JsonMappingException
	{
		return _nullValueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JsonSerializer _nullValueSerializer>
	//    2    4:areturn         
	}

	public abstract WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator);

	public JsonSerializer findPrimaryPropertySerializer(JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #292 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(JavaType)>
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
	//   10   19:getfield        #70  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #293 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
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
	//   20   38:invokevirtual   #295 <Method JsonSerializer _createAndCacheUntypedSerializer(JavaType)>
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
	//   28   53:invokevirtual   #176 <Method Class JavaType.getRawClass()>
	//   29   56:invokevirtual   #298 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   30   59:areturn         
			}
		}
		return handlePrimaryContextualization(jsonserializer, beanproperty);
	//   31   60:aload_0         
	//   32   61:aload_3         
	//   33   62:aload_2         
	//   34   63:invokevirtual   #301 <Method JsonSerializer handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   35   66:areturn         
	}

	public JsonSerializer findPrimaryPropertySerializer(Class class1, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #303 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(Class)>
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
	//   10   19:getfield        #70  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #304 <Method JsonSerializer SerializerCache.untypedValueSerializer(Class)>
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
	//   19   37:getfield        #70  <Field SerializerCache _serializerCache>
	//   20   40:aload_0         
	//   21   41:getfield        #63  <Field SerializationConfig _config>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #126 <Method JavaType SerializationConfig.constructType(Class)>
	//   24   48:invokevirtual   #293 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
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
	//   32   63:invokevirtual   #306 <Method JsonSerializer _createAndCacheUntypedSerializer(Class)>
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
	//   40   78:invokevirtual   #298 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   41   81:areturn         
				}
			}
		}
		return handlePrimaryContextualization(jsonserializer, beanproperty);
	//   42   82:aload_0         
	//   43   83:aload_3         
	//   44   84:aload_2         
	//   45   85:invokevirtual   #301 <Method JsonSerializer handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   46   88:areturn         
	}

	public JsonSerializer findTypedValueSerializer(JavaType javatype, boolean flag, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_knownSerializers.typedValueSerializer(javatype)));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #311 <Method JsonSerializer ReadOnlyClassToSerializerMap.typedValueSerializer(JavaType)>
	//    4    8:astore          4
		if(obj != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          18
			return ((JsonSerializer) (obj));
	//    7   15:aload           4
	//    8   17:areturn         
		obj = ((Object) (_serializerCache.typedValueSerializer(javatype)));
	//    9   18:aload_0         
	//   10   19:getfield        #70  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #312 <Method JsonSerializer SerializerCache.typedValueSerializer(JavaType)>
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
	//   21   39:invokevirtual   #315 <Method JsonSerializer findValueSerializer(JavaType, BeanProperty)>
	//   22   42:astore          5
		TypeSerializer typeserializer = _serializerFactory.createTypeSerializer(_config, javatype);
	//   23   44:aload_0         
	//   24   45:getfield        #65  <Field SerializerFactory _serializerFactory>
	//   25   48:aload_0         
	//   26   49:getfield        #63  <Field SerializationConfig _config>
	//   27   52:aload_1         
	//   28   53:invokevirtual   #319 <Method TypeSerializer SerializerFactory.createTypeSerializer(SerializationConfig, JavaType)>
	//   29   56:astore          6
		obj = ((Object) (jsonserializer));
	//   30   58:aload           5
	//   31   60:astore          4
		if(typeserializer != null)
	//*  32   62:aload           6
	//*  33   64:ifnull          84
			obj = ((Object) (new TypeWrappedSerializer(typeserializer.forProperty(beanproperty), jsonserializer)));
	//   34   67:new             #321 <Class TypeWrappedSerializer>
	//   35   70:dup             
	//   36   71:aload           6
	//   37   73:aload_3         
	//   38   74:invokevirtual   #327 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
	//   39   77:aload           5
	//   40   79:invokespecial   #330 <Method void TypeWrappedSerializer(TypeSerializer, JsonSerializer)>
	//   41   82:astore          4
		if(flag)
	//*  42   84:iload_2         
	//*  43   85:ifeq            98
			_serializerCache.addTypedSerializer(javatype, ((JsonSerializer) (obj)));
	//   44   88:aload_0         
	//   45   89:getfield        #70  <Field SerializerCache _serializerCache>
	//   46   92:aload_1         
	//   47   93:aload           4
	//   48   95:invokevirtual   #334 <Method void SerializerCache.addTypedSerializer(JavaType, JsonSerializer)>
		return ((JsonSerializer) (obj));
	//   49   98:aload           4
	//   50  100:areturn         
	}

	public JsonSerializer findTypedValueSerializer(Class class1, boolean flag, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_knownSerializers.typedValueSerializer(class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #338 <Method JsonSerializer ReadOnlyClassToSerializerMap.typedValueSerializer(Class)>
	//    4    8:astore          4
		if(obj != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          18
			return ((JsonSerializer) (obj));
	//    7   15:aload           4
	//    8   17:areturn         
		obj = ((Object) (_serializerCache.typedValueSerializer(class1)));
	//    9   18:aload_0         
	//   10   19:getfield        #70  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #339 <Method JsonSerializer SerializerCache.typedValueSerializer(Class)>
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
	//   21   39:invokevirtual   #341 <Method JsonSerializer findValueSerializer(Class, BeanProperty)>
	//   22   42:astore          5
		obj = ((Object) (_serializerFactory));
	//   23   44:aload_0         
	//   24   45:getfield        #65  <Field SerializerFactory _serializerFactory>
	//   25   48:astore          4
		Object obj1 = ((Object) (_config));
	//   26   50:aload_0         
	//   27   51:getfield        #63  <Field SerializationConfig _config>
	//   28   54:astore          6
		obj1 = ((Object) (((SerializerFactory) (obj)).createTypeSerializer(((SerializationConfig) (obj1)), ((SerializationConfig) (obj1)).constructType(class1))));
	//   29   56:aload           4
	//   30   58:aload           6
	//   31   60:aload           6
	//   32   62:aload_1         
	//   33   63:invokevirtual   #126 <Method JavaType SerializationConfig.constructType(Class)>
	//   34   66:invokevirtual   #319 <Method TypeSerializer SerializerFactory.createTypeSerializer(SerializationConfig, JavaType)>
	//   35   69:astore          6
		obj = ((Object) (jsonserializer));
	//   36   71:aload           5
	//   37   73:astore          4
		if(obj1 != null)
	//*  38   75:aload           6
	//*  39   77:ifnull          97
			obj = ((Object) (new TypeWrappedSerializer(((TypeSerializer) (obj1)).forProperty(beanproperty), jsonserializer)));
	//   40   80:new             #321 <Class TypeWrappedSerializer>
	//   41   83:dup             
	//   42   84:aload           6
	//   43   86:aload_3         
	//   44   87:invokevirtual   #327 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
	//   45   90:aload           5
	//   46   92:invokespecial   #330 <Method void TypeWrappedSerializer(TypeSerializer, JsonSerializer)>
	//   47   95:astore          4
		if(flag)
	//*  48   97:iload_2         
	//*  49   98:ifeq            111
			_serializerCache.addTypedSerializer(class1, ((JsonSerializer) (obj)));
	//   50  101:aload_0         
	//   51  102:getfield        #70  <Field SerializerCache _serializerCache>
	//   52  105:aload_1         
	//   53  106:aload           4
	//   54  108:invokevirtual   #344 <Method void SerializerCache.addTypedSerializer(Class, JsonSerializer)>
		return ((JsonSerializer) (obj));
	//   55  111:aload           4
	//   56  113:areturn         
	}

	public JsonSerializer findValueSerializer(JavaType javatype)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #292 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(JavaType)>
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
	//   10   16:getfield        #70  <Field SerializerCache _serializerCache>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #293 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
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
	//   20   32:invokevirtual   #295 <Method JsonSerializer _createAndCacheUntypedSerializer(JavaType)>
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
	//   28   44:invokevirtual   #176 <Method Class JavaType.getRawClass()>
	//   29   47:invokevirtual   #298 <Method JsonSerializer getUnknownTypeSerializer(Class)>
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
		if(javatype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			reportMappingProblem("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
	//    2    4:aload_0         
	//    3    5:ldc2            #347 <String "Null passed for `valueType` of `findValueSerializer()`">
	//    4    8:iconst_0        
	//    5    9:anewarray       Object[]
	//    6   12:invokevirtual   #350 <Method void reportMappingProblem(String, Object[])>
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(javatype);
	//    7   15:aload_0         
	//    8   16:getfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #292 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(JavaType)>
	//   11   23:astore          4
		JsonSerializer jsonserializer = jsonserializer1;
	//   12   25:aload           4
	//   13   27:astore_3        
		if(jsonserializer1 == null)
	//*  14   28:aload           4
	//*  15   30:ifnonnull       75
		{
			JsonSerializer jsonserializer2 = _serializerCache.untypedValueSerializer(javatype);
	//   16   33:aload_0         
	//   17   34:getfield        #70  <Field SerializerCache _serializerCache>
	//   18   37:aload_1         
	//   19   38:invokevirtual   #293 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
	//   20   41:astore          4
			jsonserializer = jsonserializer2;
	//   21   43:aload           4
	//   22   45:astore_3        
			if(jsonserializer2 == null)
	//*  23   46:aload           4
	//*  24   48:ifnonnull       75
			{
				JsonSerializer jsonserializer3 = _createAndCacheUntypedSerializer(javatype);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:invokevirtual   #295 <Method JsonSerializer _createAndCacheUntypedSerializer(JavaType)>
	//   28   56:astore          4
				jsonserializer = jsonserializer3;
	//   29   58:aload           4
	//   30   60:astore_3        
				if(jsonserializer3 == null)
	//*  31   61:aload           4
	//*  32   63:ifnonnull       75
					return getUnknownTypeSerializer(javatype.getRawClass());
	//   33   66:aload_0         
	//   34   67:aload_1         
	//   35   68:invokevirtual   #176 <Method Class JavaType.getRawClass()>
	//   36   71:invokevirtual   #298 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   37   74:areturn         
			}
		}
		return handleSecondaryContextualization(jsonserializer, beanproperty);
	//   38   75:aload_0         
	//   39   76:aload_3         
	//   40   77:aload_2         
	//   41   78:invokevirtual   #159 <Method JsonSerializer handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   42   81:areturn         
	}

	public JsonSerializer findValueSerializer(Class class1)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer1 = _knownSerializers.untypedValueSerializer(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #303 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(Class)>
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
	//   10   16:getfield        #70  <Field SerializerCache _serializerCache>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #304 <Method JsonSerializer SerializerCache.untypedValueSerializer(Class)>
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
	//   19   31:getfield        #70  <Field SerializerCache _serializerCache>
	//   20   34:aload_0         
	//   21   35:getfield        #63  <Field SerializationConfig _config>
	//   22   38:aload_1         
	//   23   39:invokevirtual   #126 <Method JavaType SerializationConfig.constructType(Class)>
	//   24   42:invokevirtual   #293 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
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
	//   32   54:invokevirtual   #306 <Method JsonSerializer _createAndCacheUntypedSerializer(Class)>
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
	//   40   66:invokevirtual   #298 <Method JsonSerializer getUnknownTypeSerializer(Class)>
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
	//    1    1:getfield        #72  <Field ReadOnlyClassToSerializerMap _knownSerializers>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #303 <Method JsonSerializer ReadOnlyClassToSerializerMap.untypedValueSerializer(Class)>
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
	//   10   19:getfield        #70  <Field SerializerCache _serializerCache>
	//   11   22:aload_1         
	//   12   23:invokevirtual   #304 <Method JsonSerializer SerializerCache.untypedValueSerializer(Class)>
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
	//   19   37:getfield        #70  <Field SerializerCache _serializerCache>
	//   20   40:aload_0         
	//   21   41:getfield        #63  <Field SerializationConfig _config>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #126 <Method JavaType SerializationConfig.constructType(Class)>
	//   24   48:invokevirtual   #293 <Method JsonSerializer SerializerCache.untypedValueSerializer(JavaType)>
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
	//   32   63:invokevirtual   #306 <Method JsonSerializer _createAndCacheUntypedSerializer(Class)>
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
	//   40   78:invokevirtual   #298 <Method JsonSerializer getUnknownTypeSerializer(Class)>
	//   41   81:areturn         
				}
			}
		}
		return handleSecondaryContextualization(jsonserializer, beanproperty);
	//   42   82:aload_0         
	//   43   83:aload_3         
	//   44   84:aload_2         
	//   45   85:invokevirtual   #159 <Method JsonSerializer handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   46   88:areturn         
	}

	public final Class getActiveView()
	{
		return _serializationView;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Class _serializationView>
	//    2    4:areturn         
	}

	public final AnnotationIntrospector getAnnotationIntrospector()
	{
		return _config.getAnnotationIntrospector();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #355 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    3    7:areturn         
	}

	public Object getAttribute(Object obj)
	{
		return _attributes.getAttribute(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field ContextAttributes _attributes>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #361 <Method Object ContextAttributes.getAttribute(Object)>
	//    4    8:areturn         
	}

	public final SerializationConfig getConfig()
	{
		return _config;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:areturn         
	}

	public volatile MapperConfig getConfig()
	{
		return ((MapperConfig) (getConfig()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #366 <Method SerializationConfig getConfig()>
	//    2    4:areturn         
	}

	public JsonSerializer getDefaultNullValueSerializer()
	{
		return _nullValueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field JsonSerializer _nullValueSerializer>
	//    2    4:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class class1)
	{
		return _config.getDefaultPropertyFormat(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #373 <Method com.fasterxml.jackson.annotation.JsonFormat$Value SerializationConfig.getDefaultPropertyFormat(Class)>
	//    4    8:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion(Class class1)
	{
		return _config.getDefaultPropertyInclusion();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #379 <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializationConfig.getDefaultPropertyInclusion()>
	//    3    7:areturn         
	}

	public final FilterProvider getFilterProvider()
	{
		return _config.getFilterProvider();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #384 <Method FilterProvider SerializationConfig.getFilterProvider()>
	//    3    7:areturn         
	}

	public JsonGenerator getGenerator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Locale getLocale()
	{
		return _config.getLocale();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #390 <Method Locale SerializationConfig.getLocale()>
	//    3    7:areturn         
	}

	public TimeZone getTimeZone()
	{
		return _config.getTimeZone();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #394 <Method TimeZone SerializationConfig.getTimeZone()>
	//    3    7:areturn         
	}

	public final TypeFactory getTypeFactory()
	{
		return _config.getTypeFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:invokevirtual   #398 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//    3    7:areturn         
	}

	public JsonSerializer getUnknownTypeSerializer(Class class1)
	{
		if(class1 == java/lang/Object)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #110 <Class Object>
	//*   2    3:if_acmpne       11
			return _unknownTypeSerializer;
	//    3    6:aload_0         
	//    4    7:getfield        #51  <Field JsonSerializer _unknownTypeSerializer>
	//    5   10:areturn         
		else
			return ((JsonSerializer) (new UnknownSerializer(class1)));
	//    6   11:new             #43  <Class UnknownSerializer>
	//    7   14:dup             
	//    8   15:aload_1         
	//    9   16:invokespecial   #401 <Method void UnknownSerializer(Class)>
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
	//*   7    9:instanceof      #403 <Class ContextualSerializer>
	//*   8   12:ifeq            27
				jsonserializer1 = ((ContextualSerializer)jsonserializer).createContextual(this, beanproperty);
	//    9   15:aload_1         
	//   10   16:checkcast       #403 <Class ContextualSerializer>
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokeinterface #407 <Method JsonSerializer ContextualSerializer.createContextual(SerializerProvider, BeanProperty)>
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
	//*   7    9:instanceof      #403 <Class ContextualSerializer>
	//*   8   12:ifeq            27
				jsonserializer1 = ((ContextualSerializer)jsonserializer).createContextual(this, beanproperty);
	//    9   15:aload_1         
	//   10   16:checkcast       #403 <Class ContextualSerializer>
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokeinterface #407 <Method JsonSerializer ContextualSerializer.createContextual(SerializerProvider, BeanProperty)>
	//   14   26:astore_3        
		}
		return jsonserializer1;
	//   15   27:aload_3         
	//   16   28:areturn         
	}

	public abstract Object includeFilterInstance(BeanPropertyDefinition beanpropertydefinition, Class class1)
		throws JsonMappingException;

	public abstract boolean includeFilterSuppressNulls(Object obj)
		throws JsonMappingException;

	public JsonMappingException invalidTypeIdException(JavaType javatype, String s, String s1)
	{
		return ((JsonMappingException) (InvalidTypeIdException.from(((com.fasterxml.jackson.core.JsonParser) (null)), _colonConcat(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[] {
			s, javatype
		}), s1), javatype, s)));
	//    0    0:aconst_null     
	//    1    1:aload_0         
	//    2    2:ldc2            #416 <String "Could not resolve type id '%s' as a subtype of %s">
	//    3    5:iconst_2        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_2         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:aload_1         
	//   12   16:aastore         
	//   13   17:invokestatic    #203 <Method String String.format(String, Object[])>
	//   14   20:aload_3         
	//   15   21:invokevirtual   #420 <Method String _colonConcat(String, String)>
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:invokestatic    #426 <Method InvalidTypeIdException InvalidTypeIdException.from(com.fasterxml.jackson.core.JsonParser, String, JavaType, String)>
	//   19   29:areturn         
	}

	public final boolean isEnabled(MapperFeature mapperfeature)
	{
		return _config.isEnabled(mapperfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #429 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//    4    8:ireturn         
	}

	public final boolean isEnabled(SerializationFeature serializationfeature)
	{
		return _config.isEnabled(serializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field SerializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #430 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//    4    8:ireturn         
	}

	public transient JsonMappingException mappingException(String s, Object aobj[])
	{
		return JsonMappingException.from(getGenerator(), _format(s, aobj));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #435 <Method JsonGenerator getGenerator()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #438 <Method String _format(String, Object[])>
	//    6   10:invokestatic    #441 <Method JsonMappingException JsonMappingException.from(JsonGenerator, String)>
	//    7   13:areturn         
	}

	public Object reportBadDefinition(JavaType javatype, String s)
		throws JsonMappingException
	{
		throw InvalidDefinitionException.from(getGenerator(), s, javatype);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #435 <Method JsonGenerator getGenerator()>
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokestatic    #447 <Method InvalidDefinitionException InvalidDefinitionException.from(JsonGenerator, String, JavaType)>
	//    5    9:athrow          
	}

	public Object reportBadDefinition(Class class1, String s, Throwable throwable)
		throws JsonMappingException
	{
		class1 = ((Class) (InvalidDefinitionException.from(getGenerator(), s, constructType(((java.lang.reflect.Type) (class1))))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #435 <Method JsonGenerator getGenerator()>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #452 <Method JavaType constructType(java.lang.reflect.Type)>
	//    6   10:invokestatic    #447 <Method InvalidDefinitionException InvalidDefinitionException.from(JsonGenerator, String, JavaType)>
	//    7   13:astore_1        
		((InvalidDefinitionException) (class1)).initCause(throwable);
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #456 <Method Throwable InvalidDefinitionException.initCause(Throwable)>
	//   11   19:pop             
		throw class1;
	//   12   20:aload_1         
	//   13   21:athrow          
	}

	public transient Object reportBadPropertyDefinition(BeanDescription beandescription, BeanPropertyDefinition beanpropertydefinition, String s, Object aobj[])
		throws JsonMappingException
	{
		String s1 = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokevirtual   #438 <Method String _format(String, Object[])>
	//    4    7:astore          5
		s = "N/A";
	//    5    9:ldc2            #461 <String "N/A">
	//    6   12:astore_3        
		if(beanpropertydefinition != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          26
			s = _quotedString(beanpropertydefinition.getName());
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #466 <Method String BeanPropertyDefinition.getName()>
	//   12   22:invokevirtual   #470 <Method String _quotedString(String)>
	//   13   25:astore_3        
		if(beandescription != null)
	//*  14   26:aload_1         
	//*  15   27:ifnull          42
			aobj = ((Object []) (ClassUtil.nameOf(beandescription.getBeanClass())));
	//   16   30:aload_1         
	//   17   31:invokevirtual   #475 <Method Class BeanDescription.getBeanClass()>
	//   18   34:invokestatic    #479 <Method String ClassUtil.nameOf(Class)>
	//   19   37:astore          4
		else
	//*  20   39:goto            47
			aobj = "N/A";
	//   21   42:ldc2            #461 <String "N/A">
	//   22   45:astore          4
		s = String.format("Invalid definition for property %s (of type %s): %s", new Object[] {
			s, aobj, s1
		});
	//   23   47:ldc2            #481 <String "Invalid definition for property %s (of type %s): %s">
	//   24   50:iconst_3        
	//   25   51:anewarray       Object[]
	//   26   54:dup             
	//   27   55:iconst_0        
	//   28   56:aload_3         
	//   29   57:aastore         
	//   30   58:dup             
	//   31   59:iconst_1        
	//   32   60:aload           4
	//   33   62:aastore         
	//   34   63:dup             
	//   35   64:iconst_2        
	//   36   65:aload           5
	//   37   67:aastore         
	//   38   68:invokestatic    #203 <Method String String.format(String, Object[])>
	//   39   71:astore_3        
		throw InvalidDefinitionException.from(getGenerator(), s, beandescription, beanpropertydefinition);
	//   40   72:aload_0         
	//   41   73:invokevirtual   #435 <Method JsonGenerator getGenerator()>
	//   42   76:aload_3         
	//   43   77:aload_1         
	//   44   78:aload_2         
	//   45   79:invokestatic    #484 <Method InvalidDefinitionException InvalidDefinitionException.from(JsonGenerator, String, BeanDescription, BeanPropertyDefinition)>
	//   46   82:athrow          
	}

	public transient Object reportBadTypeDefinition(BeanDescription beandescription, String s, Object aobj[])
		throws JsonMappingException
	{
		String s1;
		if(beandescription != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
			s1 = ClassUtil.nameOf(beandescription.getBeanClass());
	//    2    4:aload_1         
	//    3    5:invokevirtual   #475 <Method Class BeanDescription.getBeanClass()>
	//    4    8:invokestatic    #479 <Method String ClassUtil.nameOf(Class)>
	//    5   11:astore          4
		else
	//*   6   13:goto            21
			s1 = "N/A";
	//    7   16:ldc2            #461 <String "N/A">
	//    8   19:astore          4
		s = String.format("Invalid type definition for type %s: %s", new Object[] {
			s1, _format(s, aobj)
		});
	//    9   21:ldc2            #489 <String "Invalid type definition for type %s: %s">
	//   10   24:iconst_2        
	//   11   25:anewarray       Object[]
	//   12   28:dup             
	//   13   29:iconst_0        
	//   14   30:aload           4
	//   15   32:aastore         
	//   16   33:dup             
	//   17   34:iconst_1        
	//   18   35:aload_0         
	//   19   36:aload_2         
	//   20   37:aload_3         
	//   21   38:invokevirtual   #438 <Method String _format(String, Object[])>
	//   22   41:aastore         
	//   23   42:invokestatic    #203 <Method String String.format(String, Object[])>
	//   24   45:astore_2        
		throw InvalidDefinitionException.from(getGenerator(), s, beandescription, ((BeanPropertyDefinition) (null)));
	//   25   46:aload_0         
	//   26   47:invokevirtual   #435 <Method JsonGenerator getGenerator()>
	//   27   50:aload_2         
	//   28   51:aload_1         
	//   29   52:aconst_null     
	//   30   53:invokestatic    #484 <Method InvalidDefinitionException InvalidDefinitionException.from(JsonGenerator, String, BeanDescription, BeanPropertyDefinition)>
	//   31   56:athrow          
	}

	public transient void reportMappingProblem(String s, Object aobj[])
		throws JsonMappingException
	{
		throw mappingException(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #492 <Method JsonMappingException mappingException(String, Object[])>
	//    4    6:athrow          
	}

	public transient void reportMappingProblem(Throwable throwable, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #438 <Method String _format(String, Object[])>
	//    4    6:astore_2        
		throw JsonMappingException.from(getGenerator(), s, throwable);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #435 <Method JsonGenerator getGenerator()>
	//    7   11:aload_2         
	//    8   12:aload_1         
	//    9   13:invokestatic    #495 <Method JsonMappingException JsonMappingException.from(JsonGenerator, String, Throwable)>
	//   10   16:athrow          
	}

	public abstract JsonSerializer serializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException;

	public SerializerProvider setAttribute(Object obj, Object obj1)
	{
		_attributes = _attributes.withPerCallAttribute(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #76  <Field ContextAttributes _attributes>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #503 <Method ContextAttributes ContextAttributes.withPerCallAttribute(Object, Object)>
	//    6   10:putfield        #76  <Field ContextAttributes _attributes>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public void setNullValueSerializer(JsonSerializer jsonserializer)
	{
		if(jsonserializer != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
		{
			_nullValueSerializer = jsonserializer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field JsonSerializer _nullValueSerializer>
			return;
	//    5    9:return          
		} else
		{
			throw new IllegalArgumentException("Cannot pass null JsonSerializer");
	//    6   10:new             #101 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc2            #507 <String "Cannot pass null JsonSerializer">
	//    9   17:invokespecial   #508 <Method void IllegalArgumentException(String)>
	//   10   20:athrow          
		}
	}

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
	//    0    0:new             #33  <Class FailingSerializer>
	//    1    3:dup             
	//    2    4:ldc1            #35  <String "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)">
	//    3    6:invokespecial   #39  <Method void FailingSerializer(String)>
	//    4    9:putstatic       #41  <Field JsonSerializer DEFAULT_NULL_KEY_SERIALIZER>
	//    5   12:new             #43  <Class UnknownSerializer>
	//    6   15:dup             
	//    7   16:invokespecial   #45  <Method void UnknownSerializer()>
	//    8   19:putstatic       #47  <Field JsonSerializer DEFAULT_UNKNOWN_SERIALIZER>
	//*   9   22:return          
	}
}
