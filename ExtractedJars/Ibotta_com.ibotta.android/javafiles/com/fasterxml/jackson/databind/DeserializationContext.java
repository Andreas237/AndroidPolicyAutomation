// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualKeyDeserializer;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind:
//			DatabindContext, DeserializationConfig, JsonMappingException, InjectableValues, 
//			JavaType, DeserializationFeature, JsonDeserializer, MapperFeature, 
//			BeanDescription, BeanProperty, KeyDeserializer, AnnotationIntrospector

public abstract class DeserializationContext extends DatabindContext
	implements Serializable
{

	protected DeserializationContext(DeserializationContext deserializationcontext, DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void DatabindContext()>
		_cache = deserializationcontext._cache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #43  <Field DeserializerCache _cache>
	//    5    9:putfield        #43  <Field DeserializerCache _cache>
		_factory = deserializationcontext._factory;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #45  <Field DeserializerFactory _factory>
	//    9   17:putfield        #45  <Field DeserializerFactory _factory>
		_config = deserializationconfig;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #47  <Field DeserializationConfig _config>
		_featureFlags = deserializationconfig.getDeserializationFeatures();
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #53  <Method int DeserializationConfig.getDeserializationFeatures()>
	//   16   30:putfield        #55  <Field int _featureFlags>
		_view = deserializationconfig.getActiveView();
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:invokevirtual   #59  <Method Class DeserializationConfig.getActiveView()>
	//   20   38:putfield        #61  <Field Class _view>
		_parser = jsonparser;
	//   21   41:aload_0         
	//   22   42:aload_3         
	//   23   43:putfield        #63  <Field JsonParser _parser>
		_injectableValues = injectablevalues;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #65  <Field InjectableValues _injectableValues>
		_attributes = deserializationconfig.getAttributes();
	//   27   52:aload_0         
	//   28   53:aload_2         
	//   29   54:invokevirtual   #69  <Method ContextAttributes DeserializationConfig.getAttributes()>
	//   30   57:putfield        #71  <Field ContextAttributes _attributes>
	//   31   60:return          
	}

	protected DeserializationContext(DeserializationContext deserializationcontext, DeserializerFactory deserializerfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void DatabindContext()>
		_cache = deserializationcontext._cache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #43  <Field DeserializerCache _cache>
	//    5    9:putfield        #43  <Field DeserializerCache _cache>
		_factory = deserializerfactory;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #45  <Field DeserializerFactory _factory>
		_config = deserializationcontext._config;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #47  <Field DeserializationConfig _config>
	//   12   22:putfield        #47  <Field DeserializationConfig _config>
		_featureFlags = deserializationcontext._featureFlags;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #55  <Field int _featureFlags>
	//   16   30:putfield        #55  <Field int _featureFlags>
		_view = deserializationcontext._view;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #61  <Field Class _view>
	//   20   38:putfield        #61  <Field Class _view>
		_parser = deserializationcontext._parser;
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getfield        #63  <Field JsonParser _parser>
	//   24   46:putfield        #63  <Field JsonParser _parser>
		_injectableValues = deserializationcontext._injectableValues;
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:getfield        #65  <Field InjectableValues _injectableValues>
	//   28   54:putfield        #65  <Field InjectableValues _injectableValues>
		_attributes = deserializationcontext._attributes;
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:getfield        #71  <Field ContextAttributes _attributes>
	//   32   62:putfield        #71  <Field ContextAttributes _attributes>
	//   33   65:return          
	}

	protected DeserializationContext(DeserializerFactory deserializerfactory, DeserializerCache deserializercache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void DatabindContext()>
		if(deserializerfactory != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          58
		{
			_factory = deserializerfactory;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #45  <Field DeserializerFactory _factory>
			deserializerfactory = ((DeserializerFactory) (deserializercache));
	//    7   13:aload_2         
	//    8   14:astore_1        
			if(deserializercache == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       27
				deserializerfactory = ((DeserializerFactory) (new DeserializerCache()));
	//   11   19:new             #76  <Class DeserializerCache>
	//   12   22:dup             
	//   13   23:invokespecial   #77  <Method void DeserializerCache()>
	//   14   26:astore_1        
			_cache = ((DeserializerCache) (deserializerfactory));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #43  <Field DeserializerCache _cache>
			_featureFlags = 0;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #55  <Field int _featureFlags>
			_config = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #47  <Field DeserializationConfig _config>
			_injectableValues = null;
	//   24   42:aload_0         
	//   25   43:aconst_null     
	//   26   44:putfield        #65  <Field InjectableValues _injectableValues>
			_view = null;
	//   27   47:aload_0         
	//   28   48:aconst_null     
	//   29   49:putfield        #61  <Field Class _view>
			_attributes = null;
	//   30   52:aload_0         
	//   31   53:aconst_null     
	//   32   54:putfield        #71  <Field ContextAttributes _attributes>
			return;
	//   33   57:return          
		} else
		{
			throw new IllegalArgumentException("Cannot pass null DeserializerFactory");
	//   34   58:new             #79  <Class IllegalArgumentException>
	//   35   61:dup             
	//   36   62:ldc1            #81  <String "Cannot pass null DeserializerFactory">
	//   37   64:invokespecial   #84  <Method void IllegalArgumentException(String)>
	//   38   67:athrow          
		}
	}

	protected boolean _isCompatible(Class class1, Object obj)
	{
		if(obj != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          36
		{
			if(class1.isInstance(obj))
	//*   2    4:aload_1         
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #92  <Method boolean Class.isInstance(Object)>
	//*   5    9:ifeq            14
				return true;
	//    6   12:iconst_1        
	//    7   13:ireturn         
			return class1.isPrimitive() && ClassUtil.wrapperType(class1).isInstance(obj);
	//    8   14:aload_1         
	//    9   15:invokevirtual   #96  <Method boolean Class.isPrimitive()>
	//   10   18:ifeq            34
	//   11   21:aload_1         
	//   12   22:invokestatic    #102 <Method Class ClassUtil.wrapperType(Class)>
	//   13   25:aload_2         
	//   14   26:invokevirtual   #92  <Method boolean Class.isInstance(Object)>
	//   15   29:ifeq            34
	//   16   32:iconst_1        
	//   17   33:ireturn         
	//   18   34:iconst_0        
	//   19   35:ireturn         
		} else
		{
			return true;
	//   20   36:iconst_1        
	//   21   37:ireturn         
		}
	}

	public final boolean canOverrideAccessModifiers()
	{
		return _config.canOverrideAccessModifiers();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #107 <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//    3    7:ireturn         
	}

	public abstract void checkUnresolvedObjectId()
		throws UnresolvedForwardReference;

	public Calendar constructCalendar(Date date)
	{
		Calendar calendar = Calendar.getInstance(getTimeZone());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method TimeZone getTimeZone()>
	//    2    4:invokestatic    #122 <Method Calendar Calendar.getInstance(TimeZone)>
	//    3    7:astore_2        
		calendar.setTime(date);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #126 <Method void Calendar.setTime(Date)>
		return calendar;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	public final JavaType constructType(Class class1)
	{
		if(class1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return _config.constructType(class1);
	//    4    6:aload_0         
	//    5    7:getfield        #47  <Field DeserializationConfig _config>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #130 <Method JavaType DeserializationConfig.constructType(Class)>
	//    8   14:areturn         
	}

	public abstract JsonDeserializer deserializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException;

	public Class findClass(String s)
		throws ClassNotFoundException
	{
		return getTypeFactory().findClass(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method TypeFactory getTypeFactory()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method Class TypeFactory.findClass(String)>
	//    4    8:areturn         
	}

	public final JsonDeserializer findContextualValueDeserializer(JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer1 = _cache.findValueDeserializer(this, _factory, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field DeserializerCache _cache>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field DeserializerFactory _factory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #155 <Method JsonDeserializer DeserializerCache.findValueDeserializer(DeserializationContext, DeserializerFactory, JavaType)>
	//    7   13:astore          4
		JsonDeserializer jsondeserializer = jsondeserializer1;
	//    8   15:aload           4
	//    9   17:astore_3        
		if(jsondeserializer1 != null)
	//*  10   18:aload           4
	//*  11   20:ifnull          32
			jsondeserializer = handleSecondaryContextualization(jsondeserializer1, beanproperty, javatype);
	//   12   23:aload_0         
	//   13   24:aload           4
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #159 <Method JsonDeserializer handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   17   31:astore_3        
		return jsondeserializer;
	//   18   32:aload_3         
	//   19   33:areturn         
	}

	public final Object findInjectableValue(Object obj, BeanProperty beanproperty, Object obj1)
		throws JsonMappingException
	{
		if(_injectableValues == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field InjectableValues _injectableValues>
	//*   2    4:ifnonnull       29
			reportBadDefinition(ClassUtil.classOf(obj), String.format("No 'injectableValues' configured, cannot inject value with id [%s]", new Object[] {
				obj
			}));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #166 <Method Class ClassUtil.classOf(Object)>
	//    6   12:ldc1            #168 <String "No 'injectableValues' configured, cannot inject value with id [%s]">
	//    7   14:iconst_1        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_1         
	//   12   21:aastore         
	//   13   22:invokestatic    #176 <Method String String.format(String, Object[])>
	//   14   25:invokevirtual   #180 <Method Object reportBadDefinition(Class, String)>
	//   15   28:pop             
		return _injectableValues.findInjectableValue(obj, this, beanproperty, obj1);
	//   16   29:aload_0         
	//   17   30:getfield        #65  <Field InjectableValues _injectableValues>
	//   18   33:aload_1         
	//   19   34:aload_0         
	//   20   35:aload_2         
	//   21   36:aload_3         
	//   22   37:invokevirtual   #185 <Method Object InjectableValues.findInjectableValue(Object, DeserializationContext, BeanProperty, Object)>
	//   23   40:areturn         
	}

	public final KeyDeserializer findKeyDeserializer(JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		KeyDeserializer keydeserializer = _cache.findKeyDeserializer(this, _factory, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field DeserializerCache _cache>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field DeserializerFactory _factory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #190 <Method KeyDeserializer DeserializerCache.findKeyDeserializer(DeserializationContext, DeserializerFactory, JavaType)>
	//    7   13:astore_3        
		javatype = ((JavaType) (keydeserializer));
	//    8   14:aload_3         
	//    9   15:astore_1        
		if(keydeserializer instanceof ContextualKeyDeserializer)
	//*  10   16:aload_3         
	//*  11   17:instanceof      #192 <Class ContextualKeyDeserializer>
	//*  12   20:ifeq            35
			javatype = ((JavaType) (((ContextualKeyDeserializer)keydeserializer).createContextual(this, beanproperty)));
	//   13   23:aload_3         
	//   14   24:checkcast       #192 <Class ContextualKeyDeserializer>
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokeinterface #196 <Method KeyDeserializer ContextualKeyDeserializer.createContextual(DeserializationContext, BeanProperty)>
	//   18   34:astore_1        
		return ((KeyDeserializer) (javatype));
	//   19   35:aload_1         
	//   20   36:areturn         
	}

	public final JsonDeserializer findNonContextualValueDeserializer(JavaType javatype)
		throws JsonMappingException
	{
		return _cache.findValueDeserializer(this, _factory, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field DeserializerCache _cache>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field DeserializerFactory _factory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #155 <Method JsonDeserializer DeserializerCache.findValueDeserializer(DeserializationContext, DeserializerFactory, JavaType)>
	//    7   13:areturn         
	}

	public abstract ReadableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator, ObjectIdResolver objectidresolver);

	public final JsonDeserializer findRootValueDeserializer(JavaType javatype)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer = _cache.findValueDeserializer(this, _factory, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field DeserializerCache _cache>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field DeserializerFactory _factory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #155 <Method JsonDeserializer DeserializerCache.findValueDeserializer(DeserializationContext, DeserializerFactory, JavaType)>
	//    7   13:astore_2        
		if(jsondeserializer == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		jsondeserializer = handleSecondaryContextualization(jsondeserializer, ((BeanProperty) (null)), javatype);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:aconst_null     
	//   15   23:aload_1         
	//   16   24:invokevirtual   #159 <Method JsonDeserializer handleSecondaryContextualization(JsonDeserializer, BeanProperty, JavaType)>
	//   17   27:astore_2        
		javatype = ((JavaType) (_factory.findTypeDeserializer(_config, javatype)));
	//   18   28:aload_0         
	//   19   29:getfield        #45  <Field DeserializerFactory _factory>
	//   20   32:aload_0         
	//   21   33:getfield        #47  <Field DeserializationConfig _config>
	//   22   36:aload_1         
	//   23   37:invokevirtual   #208 <Method TypeDeserializer DeserializerFactory.findTypeDeserializer(DeserializationConfig, JavaType)>
	//   24   40:astore_1        
		if(javatype != null)
	//*  25   41:aload_1         
	//*  26   42:ifnull          59
			return ((JsonDeserializer) (new TypeWrappedDeserializer(((TypeDeserializer) (javatype)).forProperty(((BeanProperty) (null))), jsondeserializer)));
	//   27   45:new             #210 <Class TypeWrappedDeserializer>
	//   28   48:dup             
	//   29   49:aload_1         
	//   30   50:aconst_null     
	//   31   51:invokevirtual   #216 <Method TypeDeserializer TypeDeserializer.forProperty(BeanProperty)>
	//   32   54:aload_2         
	//   33   55:invokespecial   #219 <Method void TypeWrappedDeserializer(TypeDeserializer, JsonDeserializer)>
	//   34   58:areturn         
		else
			return jsondeserializer;
	//   35   59:aload_2         
	//   36   60:areturn         
	}

	public final Class getActiveView()
	{
		return _view;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Class _view>
	//    2    4:areturn         
	}

	public final AnnotationIntrospector getAnnotationIntrospector()
	{
		return _config.getAnnotationIntrospector();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #224 <Method AnnotationIntrospector DeserializationConfig.getAnnotationIntrospector()>
	//    3    7:areturn         
	}

	public final ArrayBuilders getArrayBuilders()
	{
		if(_arrayBuilders == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field ArrayBuilders _arrayBuilders>
	//*   2    4:ifnonnull       18
			_arrayBuilders = new ArrayBuilders();
	//    3    7:aload_0         
	//    4    8:new             #230 <Class ArrayBuilders>
	//    5   11:dup             
	//    6   12:invokespecial   #231 <Method void ArrayBuilders()>
	//    7   15:putfield        #228 <Field ArrayBuilders _arrayBuilders>
		return _arrayBuilders;
	//    8   18:aload_0         
	//    9   19:getfield        #228 <Field ArrayBuilders _arrayBuilders>
	//   10   22:areturn         
	}

	public final Base64Variant getBase64Variant()
	{
		return _config.getBase64Variant();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #235 <Method Base64Variant DeserializationConfig.getBase64Variant()>
	//    3    7:areturn         
	}

	public DeserializationConfig getConfig()
	{
		return _config;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:areturn         
	}

	public volatile MapperConfig getConfig()
	{
		return ((MapperConfig) (getConfig()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method DeserializationConfig getConfig()>
	//    2    4:areturn         
	}

	protected DateFormat getDateFormat()
	{
		DateFormat dateformat = _dateFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DateFormat _dateFormat>
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
	//    8   12:getfield        #47  <Field DeserializationConfig _config>
	//    9   15:invokevirtual   #246 <Method DateFormat DeserializationConfig.getDateFormat()>
	//   10   18:invokevirtual   #252 <Method Object DateFormat.clone()>
	//   11   21:checkcast       #248 <Class DateFormat>
	//   12   24:astore_1        
			_dateFormat = dateformat1;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #244 <Field DateFormat _dateFormat>
			return dateformat1;
	//   16   30:aload_1         
	//   17   31:areturn         
		}
	}

	public final com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class class1)
	{
		return _config.getDefaultPropertyFormat(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #256 <Method com.fasterxml.jackson.annotation.JsonFormat$Value DeserializationConfig.getDefaultPropertyFormat(Class)>
	//    4    8:areturn         
	}

	public final int getDeserializationFeatures()
	{
		return _featureFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _featureFlags>
	//    2    4:ireturn         
	}

	public Locale getLocale()
	{
		return _config.getLocale();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #261 <Method Locale DeserializationConfig.getLocale()>
	//    3    7:areturn         
	}

	public final JsonNodeFactory getNodeFactory()
	{
		return _config.getNodeFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #265 <Method JsonNodeFactory DeserializationConfig.getNodeFactory()>
	//    3    7:areturn         
	}

	public final JsonParser getParser()
	{
		return _parser;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field JsonParser _parser>
	//    2    4:areturn         
	}

	public TimeZone getTimeZone()
	{
		return _config.getTimeZone();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #268 <Method TimeZone DeserializationConfig.getTimeZone()>
	//    3    7:areturn         
	}

	public final TypeFactory getTypeFactory()
	{
		return _config.getTypeFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #269 <Method TypeFactory DeserializationConfig.getTypeFactory()>
	//    3    7:areturn         
	}

	public Object handleInstantiationProblem(Class class1, Object obj, Throwable throwable)
		throws IOException
	{
		for(LinkedNode linkednode = _config.getProblemHandlers(); linkednode != null; linkednode = linkednode.next())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field DeserializationConfig _config>
	//*   2    4:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//*   3    7:astore          4
	//*   4    9:aload           4
	//*   5   11:ifnull          94
		{
			Object obj1 = ((DeserializationProblemHandler)linkednode.value()).handleInstantiationProblem(this, class1, obj, throwable);
	//    6   14:aload           4
	//    7   16:invokevirtual   #282 <Method Object LinkedNode.value()>
	//    8   19:checkcast       #284 <Class DeserializationProblemHandler>
	//    9   22:aload_0         
	//   10   23:aload_1         
	//   11   24:aload_2         
	//   12   25:aload_3         
	//   13   26:invokevirtual   #287 <Method Object DeserializationProblemHandler.handleInstantiationProblem(DeserializationContext, Class, Object, Throwable)>
	//   14   29:astore          5
			if(obj1 == DeserializationProblemHandler.NOT_HANDLED)
				continue;
	//   15   31:aload           5
	//   16   33:getstatic       #291 <Field Object DeserializationProblemHandler.NOT_HANDLED>
	//   17   36:if_acmpeq       84
			if(_isCompatible(class1, obj1))
	//*  18   39:aload_0         
	//*  19   40:aload_1         
	//*  20   41:aload           5
	//*  21   43:invokevirtual   #293 <Method boolean _isCompatible(Class, Object)>
	//*  22   46:ifeq            52
				return obj1;
	//   23   49:aload           5
	//   24   51:areturn         
			reportBadDefinition(constructType(class1), String.format("DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s", new Object[] {
				class1, ClassUtil.classNameOf(obj1)
			}));
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #294 <Method JavaType constructType(Class)>
	//   29   58:ldc2            #296 <String "DeserializationProblemHandler.handleInstantiationProblem() for type %s returned value of type %s">
	//   30   61:iconst_2        
	//   31   62:anewarray       Object[]
	//   32   65:dup             
	//   33   66:iconst_0        
	//   34   67:aload_1         
	//   35   68:aastore         
	//   36   69:dup             
	//   37   70:iconst_1        
	//   38   71:aload           5
	//   39   73:invokestatic    #300 <Method String ClassUtil.classNameOf(Object)>
	//   40   76:aastore         
	//   41   77:invokestatic    #176 <Method String String.format(String, Object[])>
	//   42   80:invokevirtual   #303 <Method Object reportBadDefinition(JavaType, String)>
	//   43   83:pop             
		}

	//   44   84:aload           4
	//   45   86:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   46   89:astore          4
	//*  47   91:goto            9
		ClassUtil.throwIfIOE(throwable);
	//   48   94:aload_3         
	//   49   95:invokestatic    #310 <Method Throwable ClassUtil.throwIfIOE(Throwable)>
	//   50   98:pop             
		throw instantiationException(class1, throwable);
	//   51   99:aload_0         
	//   52  100:aload_1         
	//   53  101:aload_3         
	//   54  102:invokevirtual   #314 <Method JsonMappingException instantiationException(Class, Throwable)>
	//   55  105:athrow          
	}

	public transient Object handleMissingInstantiator(Class class1, ValueInstantiator valueinstantiator, JsonParser jsonparser, String s, Object aobj[])
		throws IOException
	{
		JsonParser jsonparser1 = jsonparser;
	//    0    0:aload_3         
	//    1    1:astore          6
		if(jsonparser == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       13
			jsonparser1 = getParser();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #319 <Method JsonParser getParser()>
	//    6   11:astore          6
		s = _format(s, aobj);
	//    7   13:aload_0         
	//    8   14:aload           4
	//    9   16:aload           5
	//   10   18:invokevirtual   #322 <Method String _format(String, Object[])>
	//   11   21:astore          4
		for(jsonparser = ((JsonParser) (_config.getProblemHandlers())); jsonparser != null; jsonparser = ((JsonParser) (((LinkedNode) (jsonparser)).next())))
	//*  12   23:aload_0         
	//*  13   24:getfield        #47  <Field DeserializationConfig _config>
	//*  14   27:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//*  15   30:astore_3        
	//*  16   31:aload_3         
	//*  17   32:ifnull          115
		{
			aobj = ((Object []) (((DeserializationProblemHandler)((LinkedNode) (jsonparser)).value()).handleMissingInstantiator(this, class1, valueinstantiator, jsonparser1, s)));
	//   18   35:aload_3         
	//   19   36:invokevirtual   #282 <Method Object LinkedNode.value()>
	//   20   39:checkcast       #284 <Class DeserializationProblemHandler>
	//   21   42:aload_0         
	//   22   43:aload_1         
	//   23   44:aload_2         
	//   24   45:aload           6
	//   25   47:aload           4
	//   26   49:invokevirtual   #325 <Method Object DeserializationProblemHandler.handleMissingInstantiator(DeserializationContext, Class, ValueInstantiator, JsonParser, String)>
	//   27   52:astore          5
			if(aobj == DeserializationProblemHandler.NOT_HANDLED)
				continue;
	//   28   54:aload           5
	//   29   56:getstatic       #291 <Field Object DeserializationProblemHandler.NOT_HANDLED>
	//   30   59:if_acmpeq       107
			if(_isCompatible(class1, ((Object) (aobj))))
	//*  31   62:aload_0         
	//*  32   63:aload_1         
	//*  33   64:aload           5
	//*  34   66:invokevirtual   #293 <Method boolean _isCompatible(Class, Object)>
	//*  35   69:ifeq            75
				return ((Object) (aobj));
	//   36   72:aload           5
	//   37   74:areturn         
			reportBadDefinition(constructType(class1), String.format("DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s", new Object[] {
				class1, ClassUtil.classNameOf(((Object) (aobj)))
			}));
	//   38   75:aload_0         
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #294 <Method JavaType constructType(Class)>
	//   42   81:ldc2            #327 <String "DeserializationProblemHandler.handleMissingInstantiator() for type %s returned value of type %s">
	//   43   84:iconst_2        
	//   44   85:anewarray       Object[]
	//   45   88:dup             
	//   46   89:iconst_0        
	//   47   90:aload_1         
	//   48   91:aastore         
	//   49   92:dup             
	//   50   93:iconst_1        
	//   51   94:aload           5
	//   52   96:invokestatic    #300 <Method String ClassUtil.classNameOf(Object)>
	//   53   99:aastore         
	//   54  100:invokestatic    #176 <Method String String.format(String, Object[])>
	//   55  103:invokevirtual   #303 <Method Object reportBadDefinition(JavaType, String)>
	//   56  106:pop             
		}

	//   57  107:aload_3         
	//   58  108:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   59  111:astore_3        
	//*  60  112:goto            31
		if(valueinstantiator != null && !valueinstantiator.canInstantiate())
	//*  61  115:aload_2         
	//*  62  116:ifnull          160
	//*  63  119:aload_2         
	//*  64  120:invokevirtual   #332 <Method boolean ValueInstantiator.canInstantiate()>
	//*  65  123:ifne            160
		{
			valueinstantiator = ((ValueInstantiator) (String.format("Cannot construct instance of %s (no Creators, like default construct, exist): %s", new Object[] {
				ClassUtil.nameOf(class1), s
			})));
	//   66  126:ldc2            #334 <String "Cannot construct instance of %s (no Creators, like default construct, exist): %s">
	//   67  129:iconst_2        
	//   68  130:anewarray       Object[]
	//   69  133:dup             
	//   70  134:iconst_0        
	//   71  135:aload_1         
	//   72  136:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//   73  139:aastore         
	//   74  140:dup             
	//   75  141:iconst_1        
	//   76  142:aload           4
	//   77  144:aastore         
	//   78  145:invokestatic    #176 <Method String String.format(String, Object[])>
	//   79  148:astore_2        
			return reportBadDefinition(constructType(class1), ((String) (valueinstantiator)));
	//   80  149:aload_0         
	//   81  150:aload_0         
	//   82  151:aload_1         
	//   83  152:invokevirtual   #294 <Method JavaType constructType(Class)>
	//   84  155:aload_2         
	//   85  156:invokevirtual   #303 <Method Object reportBadDefinition(JavaType, String)>
	//   86  159:areturn         
		} else
		{
			return reportInputMismatch(class1, String.format("Cannot construct instance of %s (although at least one Creator exists): %s", new Object[] {
				ClassUtil.nameOf(class1), s
			}), new Object[0]);
	//   87  160:aload_0         
	//   88  161:aload_1         
	//   89  162:ldc2            #340 <String "Cannot construct instance of %s (although at least one Creator exists): %s">
	//   90  165:iconst_2        
	//   91  166:anewarray       Object[]
	//   92  169:dup             
	//   93  170:iconst_0        
	//   94  171:aload_1         
	//   95  172:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//   96  175:aastore         
	//   97  176:dup             
	//   98  177:iconst_1        
	//   99  178:aload           4
	//  100  180:aastore         
	//  101  181:invokestatic    #176 <Method String String.format(String, Object[])>
	//  102  184:iconst_0        
	//  103  185:anewarray       Object[]
	//  104  188:invokevirtual   #344 <Method Object reportInputMismatch(Class, String, Object[])>
	//  105  191:areturn         
		}
	}

	public JavaType handleMissingTypeId(JavaType javatype, TypeIdResolver typeidresolver, String s)
		throws IOException
	{
		for(LinkedNode linkednode = _config.getProblemHandlers(); linkednode != null; linkednode = linkednode.next())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field DeserializationConfig _config>
	//*   2    4:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//*   3    7:astore          4
	//*   4    9:aload           4
	//*   5   11:ifnull          108
		{
			JavaType javatype1 = ((DeserializationProblemHandler)linkednode.value()).handleMissingTypeId(this, javatype, typeidresolver, s);
	//    6   14:aload           4
	//    7   16:invokevirtual   #282 <Method Object LinkedNode.value()>
	//    8   19:checkcast       #284 <Class DeserializationProblemHandler>
	//    9   22:aload_0         
	//   10   23:aload_1         
	//   11   24:aload_2         
	//   12   25:aload_3         
	//   13   26:invokevirtual   #350 <Method JavaType DeserializationProblemHandler.handleMissingTypeId(DeserializationContext, JavaType, TypeIdResolver, String)>
	//   14   29:astore          5
			if(javatype1 != null)
	//*  15   31:aload           5
	//*  16   33:ifnull          98
			{
				if(javatype1.hasRawClass(java/lang/Void))
	//*  17   36:aload           5
	//*  18   38:ldc2            #352 <Class Void>
	//*  19   41:invokevirtual   #358 <Method boolean JavaType.hasRawClass(Class)>
	//*  20   44:ifeq            49
					return null;
	//   21   47:aconst_null     
	//   22   48:areturn         
				if(javatype1.isTypeOrSubTypeOf(javatype.getRawClass()))
	//*  23   49:aload           5
	//*  24   51:aload_1         
	//*  25   52:invokevirtual   #361 <Method Class JavaType.getRawClass()>
	//*  26   55:invokevirtual   #364 <Method boolean JavaType.isTypeOrSubTypeOf(Class)>
	//*  27   58:ifeq            64
				{
					return javatype1;
	//   28   61:aload           5
	//   29   63:areturn         
				} else
				{
					typeidresolver = ((TypeIdResolver) (new StringBuilder()));
	//   30   64:new             #366 <Class StringBuilder>
	//   31   67:dup             
	//   32   68:invokespecial   #367 <Method void StringBuilder()>
	//   33   71:astore_2        
					((StringBuilder) (typeidresolver)).append("problem handler tried to resolve into non-subtype: ");
	//   34   72:aload_2         
	//   35   73:ldc2            #369 <String "problem handler tried to resolve into non-subtype: ">
	//   36   76:invokevirtual   #373 <Method StringBuilder StringBuilder.append(String)>
	//   37   79:pop             
					((StringBuilder) (typeidresolver)).append(((Object) (javatype1)));
	//   38   80:aload_2         
	//   39   81:aload           5
	//   40   83:invokevirtual   #376 <Method StringBuilder StringBuilder.append(Object)>
	//   41   86:pop             
					throw invalidTypeIdException(javatype, ((String) (null)), ((StringBuilder) (typeidresolver)).toString());
	//   42   87:aload_0         
	//   43   88:aload_1         
	//   44   89:aconst_null     
	//   45   90:aload_2         
	//   46   91:invokevirtual   #380 <Method String StringBuilder.toString()>
	//   47   94:invokevirtual   #384 <Method JsonMappingException invalidTypeIdException(JavaType, String, String)>
	//   48   97:athrow          
				}
			}
		}

	//   49   98:aload           4
	//   50  100:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   51  103:astore          4
	//*  52  105:goto            9
		throw missingTypeIdException(javatype, s);
	//   53  108:aload_0         
	//   54  109:aload_1         
	//   55  110:aload_3         
	//   56  111:invokevirtual   #388 <Method JsonMappingException missingTypeIdException(JavaType, String)>
	//   57  114:athrow          
	}

	public JsonDeserializer handlePrimaryContextualization(JsonDeserializer jsondeserializer, BeanProperty beanproperty, JavaType javatype)
		throws JsonMappingException
	{
		if(!(jsondeserializer instanceof ContextualDeserializer))
			break MISSING_BLOCK_LABEL_62;
	//    0    0:aload_1         
	//    1    1:instanceof      #391 <Class ContextualDeserializer>
	//    2    4:ifeq            62
		_currentType = new LinkedNode(((Object) (javatype)), _currentType);
	//    3    7:aload_0         
	//    4    8:new             #279 <Class LinkedNode>
	//    5   11:dup             
	//    6   12:aload_3         
	//    7   13:aload_0         
	//    8   14:getfield        #393 <Field LinkedNode _currentType>
	//    9   17:invokespecial   #396 <Method void LinkedNode(Object, LinkedNode)>
	//   10   20:putfield        #393 <Field LinkedNode _currentType>
		jsondeserializer = ((ContextualDeserializer)jsondeserializer).createContextual(this, beanproperty);
	//   11   23:aload_1         
	//   12   24:checkcast       #391 <Class ContextualDeserializer>
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokeinterface #399 <Method JsonDeserializer ContextualDeserializer.createContextual(DeserializationContext, BeanProperty)>
	//   16   34:astore_1        
		_currentType = _currentType.next();
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #393 <Field LinkedNode _currentType>
	//   20   40:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   21   43:putfield        #393 <Field LinkedNode _currentType>
		return jsondeserializer;
	//   22   46:aload_1         
	//   23   47:areturn         
		jsondeserializer;
	//   24   48:astore_1        
		_currentType = _currentType.next();
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #393 <Field LinkedNode _currentType>
	//   28   54:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   29   57:putfield        #393 <Field LinkedNode _currentType>
		throw jsondeserializer;
	//   30   60:aload_1         
	//   31   61:athrow          
		return jsondeserializer;
	//   32   62:aload_1         
	//   33   63:areturn         
	}

	public JsonDeserializer handleSecondaryContextualization(JsonDeserializer jsondeserializer, BeanProperty beanproperty, JavaType javatype)
		throws JsonMappingException
	{
		if(!(jsondeserializer instanceof ContextualDeserializer))
			break MISSING_BLOCK_LABEL_62;
	//    0    0:aload_1         
	//    1    1:instanceof      #391 <Class ContextualDeserializer>
	//    2    4:ifeq            62
		_currentType = new LinkedNode(((Object) (javatype)), _currentType);
	//    3    7:aload_0         
	//    4    8:new             #279 <Class LinkedNode>
	//    5   11:dup             
	//    6   12:aload_3         
	//    7   13:aload_0         
	//    8   14:getfield        #393 <Field LinkedNode _currentType>
	//    9   17:invokespecial   #396 <Method void LinkedNode(Object, LinkedNode)>
	//   10   20:putfield        #393 <Field LinkedNode _currentType>
		jsondeserializer = ((ContextualDeserializer)jsondeserializer).createContextual(this, beanproperty);
	//   11   23:aload_1         
	//   12   24:checkcast       #391 <Class ContextualDeserializer>
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokeinterface #399 <Method JsonDeserializer ContextualDeserializer.createContextual(DeserializationContext, BeanProperty)>
	//   16   34:astore_1        
		_currentType = _currentType.next();
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #393 <Field LinkedNode _currentType>
	//   20   40:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   21   43:putfield        #393 <Field LinkedNode _currentType>
		return jsondeserializer;
	//   22   46:aload_1         
	//   23   47:areturn         
		jsondeserializer;
	//   24   48:astore_1        
		_currentType = _currentType.next();
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #393 <Field LinkedNode _currentType>
	//   28   54:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   29   57:putfield        #393 <Field LinkedNode _currentType>
		throw jsondeserializer;
	//   30   60:aload_1         
	//   31   61:athrow          
		return jsondeserializer;
	//   32   62:aload_1         
	//   33   63:areturn         
	}

	public Object handleUnexpectedToken(Class class1, JsonParser jsonparser)
		throws IOException
	{
		return handleUnexpectedToken(class1, jsonparser.getCurrentToken(), jsonparser, ((String) (null)), new Object[0]);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #408 <Method JsonToken JsonParser.getCurrentToken()>
	//    4    6:aload_2         
	//    5    7:aconst_null     
	//    6    8:iconst_0        
	//    7    9:anewarray       Object[]
	//    8   12:invokevirtual   #411 <Method Object handleUnexpectedToken(Class, JsonToken, JsonParser, String, Object[])>
	//    9   15:areturn         
	}

	public transient Object handleUnexpectedToken(Class class1, JsonToken jsontoken, JsonParser jsonparser, String s, Object aobj[])
		throws IOException
	{
		aobj = ((Object []) (_format(s, aobj)));
	//    0    0:aload_0         
	//    1    1:aload           4
	//    2    3:aload           5
	//    3    5:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    8:astore          5
		for(s = ((String) (_config.getProblemHandlers())); s != null; s = ((String) (((LinkedNode) (s)).next())))
	//*   5   10:aload_0         
	//*   6   11:getfield        #47  <Field DeserializationConfig _config>
	//*   7   14:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//*   8   17:astore          4
	//*   9   19:aload           4
	//*  10   21:ifnull          109
		{
			Object obj = ((DeserializationProblemHandler)((LinkedNode) (s)).value()).handleUnexpectedToken(this, class1, jsontoken, jsonparser, ((String) (aobj)));
	//   11   24:aload           4
	//   12   26:invokevirtual   #282 <Method Object LinkedNode.value()>
	//   13   29:checkcast       #284 <Class DeserializationProblemHandler>
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:aload_3         
	//   18   36:aload           5
	//   19   38:invokevirtual   #415 <Method Object DeserializationProblemHandler.handleUnexpectedToken(DeserializationContext, Class, JsonToken, JsonParser, String)>
	//   20   41:astore          6
			if(obj == DeserializationProblemHandler.NOT_HANDLED)
				continue;
	//   21   43:aload           6
	//   22   45:getstatic       #291 <Field Object DeserializationProblemHandler.NOT_HANDLED>
	//   23   48:if_acmpeq       99
			if(_isCompatible(class1, obj))
	//*  24   51:aload_0         
	//*  25   52:aload_1         
	//*  26   53:aload           6
	//*  27   55:invokevirtual   #293 <Method boolean _isCompatible(Class, Object)>
	//*  28   58:ifeq            64
				return obj;
	//   29   61:aload           6
	//   30   63:areturn         
			reportBadDefinition(constructType(class1), String.format("DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s", new Object[] {
				ClassUtil.nameOf(class1), ClassUtil.classNameOf(obj)
			}));
	//   31   64:aload_0         
	//   32   65:aload_0         
	//   33   66:aload_1         
	//   34   67:invokevirtual   #294 <Method JavaType constructType(Class)>
	//   35   70:ldc2            #417 <String "DeserializationProblemHandler.handleUnexpectedToken() for type %s returned value of type %s">
	//   36   73:iconst_2        
	//   37   74:anewarray       Object[]
	//   38   77:dup             
	//   39   78:iconst_0        
	//   40   79:aload_1         
	//   41   80:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//   42   83:aastore         
	//   43   84:dup             
	//   44   85:iconst_1        
	//   45   86:aload           6
	//   46   88:invokestatic    #300 <Method String ClassUtil.classNameOf(Object)>
	//   47   91:aastore         
	//   48   92:invokestatic    #176 <Method String String.format(String, Object[])>
	//   49   95:invokevirtual   #303 <Method Object reportBadDefinition(JavaType, String)>
	//   50   98:pop             
		}

	//   51   99:aload           4
	//   52  101:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   53  104:astore          4
	//*  54  106:goto            19
		jsonparser = ((JsonParser) (aobj));
	//   55  109:aload           5
	//   56  111:astore_3        
		if(aobj == null)
	//*  57  112:aload           5
	//*  58  114:ifnonnull       164
			if(jsontoken == null)
	//*  59  117:aload_2         
	//*  60  118:ifnonnull       142
				jsonparser = ((JsonParser) (String.format("Unexpected end-of-input when binding data into %s", new Object[] {
					ClassUtil.nameOf(class1)
				})));
	//   61  121:ldc2            #419 <String "Unexpected end-of-input when binding data into %s">
	//   62  124:iconst_1        
	//   63  125:anewarray       Object[]
	//   64  128:dup             
	//   65  129:iconst_0        
	//   66  130:aload_1         
	//   67  131:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//   68  134:aastore         
	//   69  135:invokestatic    #176 <Method String String.format(String, Object[])>
	//   70  138:astore_3        
			else
	//*  71  139:goto            164
				jsonparser = ((JsonParser) (String.format("Cannot deserialize instance of %s out of %s token", new Object[] {
					ClassUtil.nameOf(class1), jsontoken
				})));
	//   72  142:ldc2            #421 <String "Cannot deserialize instance of %s out of %s token">
	//   73  145:iconst_2        
	//   74  146:anewarray       Object[]
	//   75  149:dup             
	//   76  150:iconst_0        
	//   77  151:aload_1         
	//   78  152:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//   79  155:aastore         
	//   80  156:dup             
	//   81  157:iconst_1        
	//   82  158:aload_2         
	//   83  159:aastore         
	//   84  160:invokestatic    #176 <Method String String.format(String, Object[])>
	//   85  163:astore_3        
		reportInputMismatch(class1, ((String) (jsonparser)), new Object[0]);
	//   86  164:aload_0         
	//   87  165:aload_1         
	//   88  166:aload_3         
	//   89  167:iconst_0        
	//   90  168:anewarray       Object[]
	//   91  171:invokevirtual   #344 <Method Object reportInputMismatch(Class, String, Object[])>
	//   92  174:pop             
		return ((Object) (null));
	//   93  175:aconst_null     
	//   94  176:areturn         
	}

	public boolean handleUnknownProperty(JsonParser jsonparser, JsonDeserializer jsondeserializer, Object obj, String s)
		throws IOException
	{
		for(LinkedNode linkednode = _config.getProblemHandlers(); linkednode != null; linkednode = linkednode.next())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field DeserializationConfig _config>
	//*   2    4:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//*   3    7:astore          5
	//*   4    9:aload           5
	//*   5   11:ifnull          46
			if(((DeserializationProblemHandler)linkednode.value()).handleUnknownProperty(this, jsonparser, jsondeserializer, obj, s))
	//*   6   14:aload           5
	//*   7   16:invokevirtual   #282 <Method Object LinkedNode.value()>
	//*   8   19:checkcast       #284 <Class DeserializationProblemHandler>
	//*   9   22:aload_0         
	//*  10   23:aload_1         
	//*  11   24:aload_2         
	//*  12   25:aload_3         
	//*  13   26:aload           4
	//*  14   28:invokevirtual   #427 <Method boolean DeserializationProblemHandler.handleUnknownProperty(DeserializationContext, JsonParser, JsonDeserializer, Object, String)>
	//*  15   31:ifeq            36
				return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         

	//   18   36:aload           5
	//   19   38:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   20   41:astore          5
	//*  21   43:goto            9
		if(!isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES))
	//*  22   46:aload_0         
	//*  23   47:getstatic       #433 <Field DeserializationFeature DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES>
	//*  24   50:invokevirtual   #437 <Method boolean isEnabled(DeserializationFeature)>
	//*  25   53:ifne            63
		{
			jsonparser.skipChildren();
	//   26   56:aload_1         
	//   27   57:invokevirtual   #440 <Method JsonParser JsonParser.skipChildren()>
	//   28   60:pop             
			return true;
	//   29   61:iconst_1        
	//   30   62:ireturn         
		}
		if(jsondeserializer == null)
	//*  31   63:aload_2         
	//*  32   64:ifnonnull       72
			jsonparser = null;
	//   33   67:aconst_null     
	//   34   68:astore_1        
		else
	//*  35   69:goto            77
			jsonparser = ((JsonParser) (jsondeserializer.getKnownPropertyNames()));
	//   36   72:aload_2         
	//   37   73:invokevirtual   #446 <Method java.util.Collection JsonDeserializer.getKnownPropertyNames()>
	//   38   76:astore_1        
		throw UnrecognizedPropertyException.from(_parser, obj, s, ((java.util.Collection) (jsonparser)));
	//   39   77:aload_0         
	//   40   78:getfield        #63  <Field JsonParser _parser>
	//   41   81:aload_3         
	//   42   82:aload           4
	//   43   84:aload_1         
	//   44   85:invokestatic    #452 <Method UnrecognizedPropertyException UnrecognizedPropertyException.from(JsonParser, Object, String, java.util.Collection)>
	//   45   88:athrow          
	}

	public JavaType handleUnknownTypeId(JavaType javatype, String s, TypeIdResolver typeidresolver, String s1)
		throws IOException
	{
		for(LinkedNode linkednode = _config.getProblemHandlers(); linkednode != null; linkednode = linkednode.next())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field DeserializationConfig _config>
	//*   2    4:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//*   3    7:astore          5
	//*   4    9:aload           5
	//*   5   11:ifnull          110
		{
			JavaType javatype1 = ((DeserializationProblemHandler)linkednode.value()).handleUnknownTypeId(this, javatype, s, typeidresolver, s1);
	//    6   14:aload           5
	//    7   16:invokevirtual   #282 <Method Object LinkedNode.value()>
	//    8   19:checkcast       #284 <Class DeserializationProblemHandler>
	//    9   22:aload_0         
	//   10   23:aload_1         
	//   11   24:aload_2         
	//   12   25:aload_3         
	//   13   26:aload           4
	//   14   28:invokevirtual   #458 <Method JavaType DeserializationProblemHandler.handleUnknownTypeId(DeserializationContext, JavaType, String, TypeIdResolver, String)>
	//   15   31:astore          6
			if(javatype1 != null)
	//*  16   33:aload           6
	//*  17   35:ifnull          100
			{
				if(javatype1.hasRawClass(java/lang/Void))
	//*  18   38:aload           6
	//*  19   40:ldc2            #352 <Class Void>
	//*  20   43:invokevirtual   #358 <Method boolean JavaType.hasRawClass(Class)>
	//*  21   46:ifeq            51
					return null;
	//   22   49:aconst_null     
	//   23   50:areturn         
				if(javatype1.isTypeOrSubTypeOf(javatype.getRawClass()))
	//*  24   51:aload           6
	//*  25   53:aload_1         
	//*  26   54:invokevirtual   #361 <Method Class JavaType.getRawClass()>
	//*  27   57:invokevirtual   #364 <Method boolean JavaType.isTypeOrSubTypeOf(Class)>
	//*  28   60:ifeq            66
				{
					return javatype1;
	//   29   63:aload           6
	//   30   65:areturn         
				} else
				{
					typeidresolver = ((TypeIdResolver) (new StringBuilder()));
	//   31   66:new             #366 <Class StringBuilder>
	//   32   69:dup             
	//   33   70:invokespecial   #367 <Method void StringBuilder()>
	//   34   73:astore_3        
					((StringBuilder) (typeidresolver)).append("problem handler tried to resolve into non-subtype: ");
	//   35   74:aload_3         
	//   36   75:ldc2            #369 <String "problem handler tried to resolve into non-subtype: ">
	//   37   78:invokevirtual   #373 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:pop             
					((StringBuilder) (typeidresolver)).append(((Object) (javatype1)));
	//   39   82:aload_3         
	//   40   83:aload           6
	//   41   85:invokevirtual   #376 <Method StringBuilder StringBuilder.append(Object)>
	//   42   88:pop             
					throw invalidTypeIdException(javatype, s, ((StringBuilder) (typeidresolver)).toString());
	//   43   89:aload_0         
	//   44   90:aload_1         
	//   45   91:aload_2         
	//   46   92:aload_3         
	//   47   93:invokevirtual   #380 <Method String StringBuilder.toString()>
	//   48   96:invokevirtual   #384 <Method JsonMappingException invalidTypeIdException(JavaType, String, String)>
	//   49   99:athrow          
				}
			}
		}

	//   50  100:aload           5
	//   51  102:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   52  105:astore          5
	//*  53  107:goto            9
		if(!isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE))
	//*  54  110:aload_0         
	//*  55  111:getstatic       #461 <Field DeserializationFeature DeserializationFeature.FAIL_ON_INVALID_SUBTYPE>
	//*  56  114:invokevirtual   #437 <Method boolean isEnabled(DeserializationFeature)>
	//*  57  117:ifne            122
			return null;
	//   58  120:aconst_null     
	//   59  121:areturn         
		else
			throw invalidTypeIdException(javatype, s, s1);
	//   60  122:aload_0         
	//   61  123:aload_1         
	//   62  124:aload_2         
	//   63  125:aload           4
	//   64  127:invokevirtual   #384 <Method JsonMappingException invalidTypeIdException(JavaType, String, String)>
	//   65  130:athrow          
	}

	public transient Object handleWeirdKey(Class class1, String s, String s1, Object aobj[])
		throws IOException
	{
		aobj = ((Object []) (_format(s1, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    7:astore          4
		for(s1 = ((String) (_config.getProblemHandlers())); s1 != null; s1 = ((String) (((LinkedNode) (s1)).next())))
	//*   5    9:aload_0         
	//*   6   10:getfield        #47  <Field DeserializationConfig _config>
	//*   7   13:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//*   8   16:astore_3        
	//*   9   17:aload_3         
	//*  10   18:ifnull          103
		{
			Object obj = ((DeserializationProblemHandler)((LinkedNode) (s1)).value()).handleWeirdKey(this, class1, s, ((String) (aobj)));
	//   11   21:aload_3         
	//   12   22:invokevirtual   #282 <Method Object LinkedNode.value()>
	//   13   25:checkcast       #284 <Class DeserializationProblemHandler>
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload           4
	//   18   33:invokevirtual   #466 <Method Object DeserializationProblemHandler.handleWeirdKey(DeserializationContext, Class, String, String)>
	//   19   36:astore          5
			if(obj != DeserializationProblemHandler.NOT_HANDLED)
	//*  20   38:aload           5
	//*  21   40:getstatic       #291 <Field Object DeserializationProblemHandler.NOT_HANDLED>
	//*  22   43:if_acmpeq       95
				if(obj != null)
	//*  23   46:aload           5
	//*  24   48:ifnull          92
				{
					if(class1.isInstance(obj))
	//*  25   51:aload_1         
	//*  26   52:aload           5
	//*  27   54:invokevirtual   #92  <Method boolean Class.isInstance(Object)>
	//*  28   57:ifeq            63
						return obj;
	//   29   60:aload           5
	//   30   62:areturn         
					else
						throw weirdStringException(s, class1, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[] {
							class1, obj.getClass()
						}));
	//   31   63:aload_0         
	//   32   64:aload_2         
	//   33   65:aload_1         
	//   34   66:ldc2            #468 <String "DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s">
	//   35   69:iconst_2        
	//   36   70:anewarray       Object[]
	//   37   73:dup             
	//   38   74:iconst_0        
	//   39   75:aload_1         
	//   40   76:aastore         
	//   41   77:dup             
	//   42   78:iconst_1        
	//   43   79:aload           5
	//   44   81:invokevirtual   #471 <Method Class Object.getClass()>
	//   45   84:aastore         
	//   46   85:invokestatic    #176 <Method String String.format(String, Object[])>
	//   47   88:invokevirtual   #475 <Method JsonMappingException weirdStringException(String, Class, String)>
	//   48   91:athrow          
				} else
				{
					return obj;
	//   49   92:aload           5
	//   50   94:areturn         
				}
		}

	//   51   95:aload_3         
	//   52   96:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   53   99:astore_3        
	//*  54  100:goto            17
		throw weirdKeyException(class1, s, ((String) (aobj)));
	//   55  103:aload_0         
	//   56  104:aload_1         
	//   57  105:aload_2         
	//   58  106:aload           4
	//   59  108:invokevirtual   #479 <Method JsonMappingException weirdKeyException(Class, String, String)>
	//   60  111:athrow          
	}

	public Object handleWeirdNativeValue(JavaType javatype, Object obj, JsonParser jsonparser)
		throws IOException
	{
		LinkedNode linkednode = _config.getProblemHandlers();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//    3    7:astore          4
		Class class1 = javatype.getRawClass();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #361 <Method Class JavaType.getRawClass()>
	//    6   13:astore          5
		for(; linkednode != null; linkednode = linkednode.next())
	//*   7   15:aload           4
	//*   8   17:ifnull          104
		{
			Object obj1 = ((DeserializationProblemHandler)linkednode.value()).handleWeirdNativeValue(this, javatype, obj, jsonparser);
	//    9   20:aload           4
	//   10   22:invokevirtual   #282 <Method Object LinkedNode.value()>
	//   11   25:checkcast       #284 <Class DeserializationProblemHandler>
	//   12   28:aload_0         
	//   13   29:aload_1         
	//   14   30:aload_2         
	//   15   31:aload_3         
	//   16   32:invokevirtual   #485 <Method Object DeserializationProblemHandler.handleWeirdNativeValue(DeserializationContext, JavaType, Object, JsonParser)>
	//   17   35:astore          6
			if(obj1 != DeserializationProblemHandler.NOT_HANDLED)
	//*  18   37:aload           6
	//*  19   39:getstatic       #291 <Field Object DeserializationProblemHandler.NOT_HANDLED>
	//*  20   42:if_acmpeq       94
				if(obj1 != null)
	//*  21   45:aload           6
	//*  22   47:ifnull          91
				{
					if(class1.isInstance(obj1))
	//*  23   50:aload           5
	//*  24   52:aload           6
	//*  25   54:invokevirtual   #92  <Method boolean Class.isInstance(Object)>
	//*  26   57:ifeq            63
						return obj1;
	//   27   60:aload           6
	//   28   62:areturn         
					else
						throw JsonMappingException.from(jsonparser, _format("DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s", new Object[] {
							javatype, obj1.getClass()
						}));
	//   29   63:aload_3         
	//   30   64:aload_0         
	//   31   65:ldc2            #487 <String "DeserializationProblemHandler.handleWeirdNativeValue() for type %s returned value of type %s">
	//   32   68:iconst_2        
	//   33   69:anewarray       Object[]
	//   34   72:dup             
	//   35   73:iconst_0        
	//   36   74:aload_1         
	//   37   75:aastore         
	//   38   76:dup             
	//   39   77:iconst_1        
	//   40   78:aload           6
	//   41   80:invokevirtual   #471 <Method Class Object.getClass()>
	//   42   83:aastore         
	//   43   84:invokevirtual   #322 <Method String _format(String, Object[])>
	//   44   87:invokestatic    #490 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   45   90:athrow          
				} else
				{
					return obj1;
	//   46   91:aload           6
	//   47   93:areturn         
				}
		}

	//   48   94:aload           4
	//   49   96:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   50   99:astore          4
	//*  51  101:goto            15
		throw weirdNativeValueException(obj, class1);
	//   52  104:aload_0         
	//   53  105:aload_2         
	//   54  106:aload           5
	//   55  108:invokevirtual   #494 <Method JsonMappingException weirdNativeValueException(Object, Class)>
	//   56  111:athrow          
	}

	public transient Object handleWeirdNumberValue(Class class1, Number number, String s, Object aobj[])
		throws IOException
	{
		aobj = ((Object []) (_format(s, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    7:astore          4
		for(s = ((String) (_config.getProblemHandlers())); s != null; s = ((String) (((LinkedNode) (s)).next())))
	//*   5    9:aload_0         
	//*   6   10:getfield        #47  <Field DeserializationConfig _config>
	//*   7   13:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//*   8   16:astore_3        
	//*   9   17:aload_3         
	//*  10   18:ifnull          97
		{
			Object obj = ((DeserializationProblemHandler)((LinkedNode) (s)).value()).handleWeirdNumberValue(this, class1, number, ((String) (aobj)));
	//   11   21:aload_3         
	//   12   22:invokevirtual   #282 <Method Object LinkedNode.value()>
	//   13   25:checkcast       #284 <Class DeserializationProblemHandler>
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload           4
	//   18   33:invokevirtual   #499 <Method Object DeserializationProblemHandler.handleWeirdNumberValue(DeserializationContext, Class, Number, String)>
	//   19   36:astore          5
			if(obj != DeserializationProblemHandler.NOT_HANDLED)
	//*  20   38:aload           5
	//*  21   40:getstatic       #291 <Field Object DeserializationProblemHandler.NOT_HANDLED>
	//*  22   43:if_acmpeq       89
				if(_isCompatible(class1, obj))
	//*  23   46:aload_0         
	//*  24   47:aload_1         
	//*  25   48:aload           5
	//*  26   50:invokevirtual   #293 <Method boolean _isCompatible(Class, Object)>
	//*  27   53:ifeq            59
					return obj;
	//   28   56:aload           5
	//   29   58:areturn         
				else
					throw weirdNumberException(number, class1, _format("DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s", new Object[] {
						class1, obj.getClass()
					}));
	//   30   59:aload_0         
	//   31   60:aload_2         
	//   32   61:aload_1         
	//   33   62:aload_0         
	//   34   63:ldc2            #501 <String "DeserializationProblemHandler.handleWeirdNumberValue() for type %s returned value of type %s">
	//   35   66:iconst_2        
	//   36   67:anewarray       Object[]
	//   37   70:dup             
	//   38   71:iconst_0        
	//   39   72:aload_1         
	//   40   73:aastore         
	//   41   74:dup             
	//   42   75:iconst_1        
	//   43   76:aload           5
	//   44   78:invokevirtual   #471 <Method Class Object.getClass()>
	//   45   81:aastore         
	//   46   82:invokevirtual   #322 <Method String _format(String, Object[])>
	//   47   85:invokevirtual   #505 <Method JsonMappingException weirdNumberException(Number, Class, String)>
	//   48   88:athrow          
		}

	//   49   89:aload_3         
	//   50   90:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   51   93:astore_3        
	//*  52   94:goto            17
		throw weirdNumberException(number, class1, ((String) (aobj)));
	//   53   97:aload_0         
	//   54   98:aload_2         
	//   55   99:aload_1         
	//   56  100:aload           4
	//   57  102:invokevirtual   #505 <Method JsonMappingException weirdNumberException(Number, Class, String)>
	//   58  105:athrow          
	}

	public transient Object handleWeirdStringValue(Class class1, String s, String s1, Object aobj[])
		throws IOException
	{
		aobj = ((Object []) (_format(s1, aobj)));
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    7:astore          4
		for(s1 = ((String) (_config.getProblemHandlers())); s1 != null; s1 = ((String) (((LinkedNode) (s1)).next())))
	//*   5    9:aload_0         
	//*   6   10:getfield        #47  <Field DeserializationConfig _config>
	//*   7   13:invokevirtual   #277 <Method LinkedNode DeserializationConfig.getProblemHandlers()>
	//*   8   16:astore_3        
	//*   9   17:aload_3         
	//*  10   18:ifnull          96
		{
			Object obj = ((DeserializationProblemHandler)((LinkedNode) (s1)).value()).handleWeirdStringValue(this, class1, s, ((String) (aobj)));
	//   11   21:aload_3         
	//   12   22:invokevirtual   #282 <Method Object LinkedNode.value()>
	//   13   25:checkcast       #284 <Class DeserializationProblemHandler>
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:aload           4
	//   18   33:invokevirtual   #509 <Method Object DeserializationProblemHandler.handleWeirdStringValue(DeserializationContext, Class, String, String)>
	//   19   36:astore          5
			if(obj != DeserializationProblemHandler.NOT_HANDLED)
	//*  20   38:aload           5
	//*  21   40:getstatic       #291 <Field Object DeserializationProblemHandler.NOT_HANDLED>
	//*  22   43:if_acmpeq       88
				if(_isCompatible(class1, obj))
	//*  23   46:aload_0         
	//*  24   47:aload_1         
	//*  25   48:aload           5
	//*  26   50:invokevirtual   #293 <Method boolean _isCompatible(Class, Object)>
	//*  27   53:ifeq            59
					return obj;
	//   28   56:aload           5
	//   29   58:areturn         
				else
					throw weirdStringException(s, class1, String.format("DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s", new Object[] {
						class1, obj.getClass()
					}));
	//   30   59:aload_0         
	//   31   60:aload_2         
	//   32   61:aload_1         
	//   33   62:ldc2            #468 <String "DeserializationProblemHandler.handleWeirdStringValue() for type %s returned value of type %s">
	//   34   65:iconst_2        
	//   35   66:anewarray       Object[]
	//   36   69:dup             
	//   37   70:iconst_0        
	//   38   71:aload_1         
	//   39   72:aastore         
	//   40   73:dup             
	//   41   74:iconst_1        
	//   42   75:aload           5
	//   43   77:invokevirtual   #471 <Method Class Object.getClass()>
	//   44   80:aastore         
	//   45   81:invokestatic    #176 <Method String String.format(String, Object[])>
	//   46   84:invokevirtual   #475 <Method JsonMappingException weirdStringException(String, Class, String)>
	//   47   87:athrow          
		}

	//   48   88:aload_3         
	//   49   89:invokevirtual   #306 <Method LinkedNode LinkedNode.next()>
	//   50   92:astore_3        
	//*  51   93:goto            17
		throw weirdStringException(s, class1, ((String) (aobj)));
	//   52   96:aload_0         
	//   53   97:aload_2         
	//   54   98:aload_1         
	//   55   99:aload           4
	//   56  101:invokevirtual   #475 <Method JsonMappingException weirdStringException(String, Class, String)>
	//   57  104:athrow          
	}

	public final boolean hasSomeOfFeatures(int i)
	{
		return (i & _featureFlags) != 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field int _featureFlags>
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public JsonMappingException instantiationException(Class class1, Throwable throwable)
	{
		JavaType javatype = constructType(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #294 <Method JavaType constructType(Class)>
	//    3    5:astore_3        
		class1 = ((Class) (String.format("Cannot construct instance of %s, problem: %s", new Object[] {
			ClassUtil.nameOf(class1), throwable.getMessage()
		})));
	//    4    6:ldc2            #513 <String "Cannot construct instance of %s, problem: %s">
	//    5    9:iconst_2        
	//    6   10:anewarray       Object[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_1         
	//   10   16:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//   11   19:aastore         
	//   12   20:dup             
	//   13   21:iconst_1        
	//   14   22:aload_2         
	//   15   23:invokevirtual   #518 <Method String Throwable.getMessage()>
	//   16   26:aastore         
	//   17   27:invokestatic    #176 <Method String String.format(String, Object[])>
	//   18   30:astore_1        
		class1 = ((Class) (InvalidDefinitionException.from(_parser, ((String) (class1)), javatype)));
	//   19   31:aload_0         
	//   20   32:getfield        #63  <Field JsonParser _parser>
	//   21   35:aload_1         
	//   22   36:aload_3         
	//   23   37:invokestatic    #523 <Method InvalidDefinitionException InvalidDefinitionException.from(JsonParser, String, JavaType)>
	//   24   40:astore_1        
		((InvalidDefinitionException) (class1)).initCause(throwable);
	//   25   41:aload_1         
	//   26   42:aload_2         
	//   27   43:invokevirtual   #526 <Method Throwable InvalidDefinitionException.initCause(Throwable)>
	//   28   46:pop             
		return ((JsonMappingException) (class1));
	//   29   47:aload_1         
	//   30   48:areturn         
	}

	public JsonMappingException invalidTypeIdException(JavaType javatype, String s, String s1)
	{
		String s2 = String.format("Could not resolve type id '%s' as a subtype of %s", new Object[] {
			s, javatype
		});
	//    0    0:ldc2            #529 <String "Could not resolve type id '%s' as a subtype of %s">
	//    1    3:iconst_2        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_2         
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_1         
	//   10   14:aastore         
	//   11   15:invokestatic    #176 <Method String String.format(String, Object[])>
	//   12   18:astore          4
		return ((JsonMappingException) (InvalidTypeIdException.from(_parser, _colonConcat(s2, s1), javatype, s)));
	//   13   20:aload_0         
	//   14   21:getfield        #63  <Field JsonParser _parser>
	//   15   24:aload_0         
	//   16   25:aload           4
	//   17   27:aload_3         
	//   18   28:invokevirtual   #533 <Method String _colonConcat(String, String)>
	//   19   31:aload_1         
	//   20   32:aload_2         
	//   21   33:invokestatic    #538 <Method InvalidTypeIdException InvalidTypeIdException.from(JsonParser, String, JavaType, String)>
	//   22   36:areturn         
	}

	public final boolean isEnabled(DeserializationFeature deserializationfeature)
	{
		int i = _featureFlags;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _featureFlags>
	//    2    4:istore_2        
		return (deserializationfeature.getMask() & i) != 0;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #541 <Method int DeserializationFeature.getMask()>
	//    5    9:iload_2         
	//    6   10:iand            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public final boolean isEnabled(MapperFeature mapperfeature)
	{
		return _config.isEnabled(mapperfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field DeserializationConfig _config>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #544 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//    4    8:ireturn         
	}

	public abstract KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException;

	public final ObjectBuffer leaseObjectBuffer()
	{
		ObjectBuffer objectbuffer = _objectBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #550 <Field ObjectBuffer _objectBuffer>
	//    2    4:astore_1        
		if(objectbuffer == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       17
		{
			return new ObjectBuffer();
	//    5    9:new             #552 <Class ObjectBuffer>
	//    6   12:dup             
	//    7   13:invokespecial   #553 <Method void ObjectBuffer()>
	//    8   16:areturn         
		} else
		{
			_objectBuffer = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #550 <Field ObjectBuffer _objectBuffer>
			return objectbuffer;
	//   12   22:aload_1         
	//   13   23:areturn         
		}
	}

	public JsonMappingException mappingException(String s)
	{
		return JsonMappingException.from(getParser(), s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #319 <Method JsonParser getParser()>
	//    2    4:aload_1         
	//    3    5:invokestatic    #490 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//    4    8:areturn         
	}

	public JsonMappingException missingTypeIdException(JavaType javatype, String s)
	{
		String s1 = String.format("Missing type id when trying to resolve subtype of %s", new Object[] {
			javatype
		});
	//    0    0:ldc2            #559 <String "Missing type id when trying to resolve subtype of %s">
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_1         
	//    6   10:aastore         
	//    7   11:invokestatic    #176 <Method String String.format(String, Object[])>
	//    8   14:astore_3        
		return ((JsonMappingException) (InvalidTypeIdException.from(_parser, _colonConcat(s1, s), javatype, ((String) (null)))));
	//    9   15:aload_0         
	//   10   16:getfield        #63  <Field JsonParser _parser>
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #533 <Method String _colonConcat(String, String)>
	//   15   25:aload_1         
	//   16   26:aconst_null     
	//   17   27:invokestatic    #538 <Method InvalidTypeIdException InvalidTypeIdException.from(JsonParser, String, JavaType, String)>
	//   18   30:areturn         
	}

	public Date parseDate(String s)
		throws IllegalArgumentException
	{
		Date date;
		try
		{
			date = getDateFormat().parse(s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #564 <Method DateFormat getDateFormat()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #567 <Method Date DateFormat.parse(String)>
	//    4    8:astore_2        
		}
	//*   5    9:aload_2         
	//*   6   10:areturn         
		catch(ParseException parseexception)
	//*   7   11:astore_2        
		{
			throw new IllegalArgumentException(String.format("Failed to parse Date value '%s': %s", new Object[] {
				s, parseexception.getMessage()
			}));
	//    8   12:new             #79  <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:ldc2            #569 <String "Failed to parse Date value '%s': %s">
	//   11   19:iconst_2        
	//   12   20:anewarray       Object[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:aload_1         
	//   16   26:aastore         
	//   17   27:dup             
	//   18   28:iconst_1        
	//   19   29:aload_2         
	//   20   30:invokevirtual   #570 <Method String ParseException.getMessage()>
	//   21   33:aastore         
	//   22   34:invokestatic    #176 <Method String String.format(String, Object[])>
	//   23   37:invokespecial   #84  <Method void IllegalArgumentException(String)>
	//   24   40:athrow          
		}
		return date;
	}

	public Object reportBadDefinition(JavaType javatype, String s)
		throws JsonMappingException
	{
		throw InvalidDefinitionException.from(_parser, s, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field JsonParser _parser>
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokestatic    #523 <Method InvalidDefinitionException InvalidDefinitionException.from(JsonParser, String, JavaType)>
	//    5    9:athrow          
	}

	public Object reportBadMerge(JsonDeserializer jsondeserializer)
		throws JsonMappingException
	{
		if(isEnabled(MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #579 <Field MapperFeature MapperFeature.IGNORE_MERGE_FOR_UNMERGEABLE>
	//*   2    4:invokevirtual   #580 <Method boolean isEnabled(MapperFeature)>
	//*   3    7:ifeq            12
		{
			return ((Object) (null));
	//    4   10:aconst_null     
	//    5   11:areturn         
		} else
		{
			jsondeserializer = ((JsonDeserializer) (constructType(jsondeserializer.handledType())));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #583 <Method Class JsonDeserializer.handledType()>
	//    9   17:invokevirtual   #294 <Method JavaType constructType(Class)>
	//   10   20:astore_1        
			String s = String.format("Invalid configuration: values of type %s cannot be merged", new Object[] {
				jsondeserializer
			});
	//   11   21:ldc2            #585 <String "Invalid configuration: values of type %s cannot be merged">
	//   12   24:iconst_1        
	//   13   25:anewarray       Object[]
	//   14   28:dup             
	//   15   29:iconst_0        
	//   16   30:aload_1         
	//   17   31:aastore         
	//   18   32:invokestatic    #176 <Method String String.format(String, Object[])>
	//   19   35:astore_2        
			throw InvalidDefinitionException.from(getParser(), s, ((JavaType) (jsondeserializer)));
	//   20   36:aload_0         
	//   21   37:invokevirtual   #319 <Method JsonParser getParser()>
	//   22   40:aload_2         
	//   23   41:aload_1         
	//   24   42:invokestatic    #523 <Method InvalidDefinitionException InvalidDefinitionException.from(JsonParser, String, JavaType)>
	//   25   45:athrow          
		}
	}

	public transient Object reportBadPropertyDefinition(BeanDescription beandescription, BeanPropertyDefinition beanpropertydefinition, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    7:astore_3        
		s = String.format("Invalid definition for property %s (of type %s): %s", new Object[] {
			ClassUtil.nameOf(((com.fasterxml.jackson.databind.util.Named) (beanpropertydefinition))), ClassUtil.nameOf(beandescription.getBeanClass()), s
		});
	//    5    8:ldc2            #590 <String "Invalid definition for property %s (of type %s): %s">
	//    6   11:iconst_3        
	//    7   12:anewarray       Object[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:aload_2         
	//   11   18:invokestatic    #593 <Method String ClassUtil.nameOf(com.fasterxml.jackson.databind.util.Named)>
	//   12   21:aastore         
	//   13   22:dup             
	//   14   23:iconst_1        
	//   15   24:aload_1         
	//   16   25:invokevirtual   #598 <Method Class BeanDescription.getBeanClass()>
	//   17   28:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_2        
	//   21   34:aload_3         
	//   22   35:aastore         
	//   23   36:invokestatic    #176 <Method String String.format(String, Object[])>
	//   24   39:astore_3        
		throw InvalidDefinitionException.from(_parser, s, beandescription, beanpropertydefinition);
	//   25   40:aload_0         
	//   26   41:getfield        #63  <Field JsonParser _parser>
	//   27   44:aload_3         
	//   28   45:aload_1         
	//   29   46:aload_2         
	//   30   47:invokestatic    #601 <Method InvalidDefinitionException InvalidDefinitionException.from(JsonParser, String, BeanDescription, BeanPropertyDefinition)>
	//   31   50:athrow          
	}

	public transient Object reportBadTypeDefinition(BeanDescription beandescription, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    6:astore_2        
		s = String.format("Invalid type definition for type %s: %s", new Object[] {
			ClassUtil.nameOf(beandescription.getBeanClass()), s
		});
	//    5    7:ldc2            #606 <String "Invalid type definition for type %s: %s">
	//    6   10:iconst_2        
	//    7   11:anewarray       Object[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_1         
	//   11   17:invokevirtual   #598 <Method Class BeanDescription.getBeanClass()>
	//   12   20:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:aload_2         
	//   17   27:aastore         
	//   18   28:invokestatic    #176 <Method String String.format(String, Object[])>
	//   19   31:astore_2        
		throw InvalidDefinitionException.from(_parser, s, beandescription, ((BeanPropertyDefinition) (null)));
	//   20   32:aload_0         
	//   21   33:getfield        #63  <Field JsonParser _parser>
	//   22   36:aload_2         
	//   23   37:aload_1         
	//   24   38:aconst_null     
	//   25   39:invokestatic    #601 <Method InvalidDefinitionException InvalidDefinitionException.from(JsonParser, String, BeanDescription, BeanPropertyDefinition)>
	//   26   42:athrow          
	}

	public transient Object reportInputMismatch(BeanProperty beanproperty, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    6:astore_2        
		if(beanproperty == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       16
			beanproperty = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
		else
	//*   9   13:goto            23
			beanproperty = ((BeanProperty) (beanproperty.getType()));
	//   10   16:aload_1         
	//   11   17:invokeinterface #614 <Method JavaType BeanProperty.getType()>
	//   12   22:astore_1        
		throw MismatchedInputException.from(getParser(), ((JavaType) (beanproperty)), s);
	//   13   23:aload_0         
	//   14   24:invokevirtual   #319 <Method JsonParser getParser()>
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokestatic    #619 <Method MismatchedInputException MismatchedInputException.from(JsonParser, JavaType, String)>
	//   18   32:athrow          
	}

	public transient Object reportInputMismatch(JavaType javatype, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    6:astore_2        
		throw MismatchedInputException.from(getParser(), javatype, s);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #319 <Method JsonParser getParser()>
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokestatic    #619 <Method MismatchedInputException MismatchedInputException.from(JsonParser, JavaType, String)>
	//   10   16:athrow          
	}

	public transient Object reportInputMismatch(JsonDeserializer jsondeserializer, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    6:astore_2        
		throw MismatchedInputException.from(getParser(), jsondeserializer.handledType(), s);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #319 <Method JsonParser getParser()>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #583 <Method Class JsonDeserializer.handledType()>
	//    9   15:aload_2         
	//   10   16:invokestatic    #626 <Method MismatchedInputException MismatchedInputException.from(JsonParser, Class, String)>
	//   11   19:athrow          
	}

	public transient Object reportInputMismatch(Class class1, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    6:astore_2        
		throw MismatchedInputException.from(getParser(), class1, s);
	//    5    7:aload_0         
	//    6    8:invokevirtual   #319 <Method JsonParser getParser()>
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokestatic    #626 <Method MismatchedInputException MismatchedInputException.from(JsonParser, Class, String)>
	//   10   16:athrow          
	}

	public Object reportTrailingTokens(Class class1, JsonParser jsonparser, JsonToken jsontoken)
		throws JsonMappingException
	{
		throw MismatchedInputException.from(jsonparser, class1, String.format("Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`", new Object[] {
			jsontoken, ClassUtil.nameOf(class1)
		}));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:ldc2            #632 <String "Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`">
	//    3    5:iconst_2        
	//    4    6:anewarray       Object[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_3         
	//    8   12:aastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:aload_1         
	//   12   16:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//   13   19:aastore         
	//   14   20:invokestatic    #176 <Method String String.format(String, Object[])>
	//   15   23:invokestatic    #626 <Method MismatchedInputException MismatchedInputException.from(JsonParser, Class, String)>
	//   16   26:athrow          
	}

	public Object reportUnresolvedObjectId(ObjectIdReader objectidreader, Object obj)
		throws JsonMappingException
	{
		obj = ((Object) (String.format("No Object Id found for an instance of %s, to assign to property '%s'", new Object[] {
			ClassUtil.classNameOf(obj), objectidreader.propertyName
		})));
	//    0    0:ldc2            #637 <String "No Object Id found for an instance of %s, to assign to property '%s'">
	//    1    3:iconst_2        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_2         
	//    6   10:invokestatic    #300 <Method String ClassUtil.classNameOf(Object)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_1         
	//   11   17:getfield        #643 <Field PropertyName ObjectIdReader.propertyName>
	//   12   20:aastore         
	//   13   21:invokestatic    #176 <Method String String.format(String, Object[])>
	//   14   24:astore_2        
		return reportInputMismatch(((BeanProperty) (objectidreader.idProperty)), ((String) (obj)), new Object[0]);
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:getfield        #647 <Field com.fasterxml.jackson.databind.deser.SettableBeanProperty ObjectIdReader.idProperty>
	//   18   30:aload_2         
	//   19   31:iconst_0        
	//   20   32:anewarray       Object[]
	//   21   35:invokevirtual   #649 <Method Object reportInputMismatch(BeanProperty, String, Object[])>
	//   22   38:areturn         
	}

	public transient void reportWrongTokenException(JavaType javatype, JsonToken jsontoken, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    7:astore_3        
		throw wrongTokenException(getParser(), javatype, jsontoken, s);
	//    5    8:aload_0         
	//    6    9:aload_0         
	//    7   10:invokevirtual   #319 <Method JsonParser getParser()>
	//    8   13:aload_1         
	//    9   14:aload_2         
	//   10   15:aload_3         
	//   11   16:invokevirtual   #656 <Method JsonMappingException wrongTokenException(JsonParser, JavaType, JsonToken, String)>
	//   12   19:athrow          
	}

	public transient void reportWrongTokenException(JsonDeserializer jsondeserializer, JsonToken jsontoken, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    7:astore_3        
		throw wrongTokenException(getParser(), jsondeserializer.handledType(), jsontoken, s);
	//    5    8:aload_0         
	//    6    9:aload_0         
	//    7   10:invokevirtual   #319 <Method JsonParser getParser()>
	//    8   13:aload_1         
	//    9   14:invokevirtual   #583 <Method Class JsonDeserializer.handledType()>
	//   10   17:aload_2         
	//   11   18:aload_3         
	//   12   19:invokevirtual   #660 <Method JsonMappingException wrongTokenException(JsonParser, Class, JsonToken, String)>
	//   13   22:athrow          
	}

	public transient void reportWrongTokenException(Class class1, JsonToken jsontoken, String s, Object aobj[])
		throws JsonMappingException
	{
		s = _format(s, aobj);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:aload           4
	//    3    4:invokevirtual   #322 <Method String _format(String, Object[])>
	//    4    7:astore_3        
		throw wrongTokenException(getParser(), class1, jsontoken, s);
	//    5    8:aload_0         
	//    6    9:aload_0         
	//    7   10:invokevirtual   #319 <Method JsonParser getParser()>
	//    8   13:aload_1         
	//    9   14:aload_2         
	//   10   15:aload_3         
	//   11   16:invokevirtual   #660 <Method JsonMappingException wrongTokenException(JsonParser, Class, JsonToken, String)>
	//   12   19:athrow          
	}

	public final void returnObjectBuffer(ObjectBuffer objectbuffer)
	{
		if(_objectBuffer == null || objectbuffer.initialCapacity() >= _objectBuffer.initialCapacity())
	//*   0    0:aload_0         
	//*   1    1:getfield        #550 <Field ObjectBuffer _objectBuffer>
	//*   2    4:ifnull          21
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #668 <Method int ObjectBuffer.initialCapacity()>
	//*   5   11:aload_0         
	//*   6   12:getfield        #550 <Field ObjectBuffer _objectBuffer>
	//*   7   15:invokevirtual   #668 <Method int ObjectBuffer.initialCapacity()>
	//*   8   18:icmplt          26
			_objectBuffer = objectbuffer;
	//    9   21:aload_0         
	//   10   22:aload_1         
	//   11   23:putfield        #550 <Field ObjectBuffer _objectBuffer>
	//   12   26:return          
	}

	public JsonMappingException weirdKeyException(Class class1, String s, String s1)
	{
		return ((JsonMappingException) (InvalidFormatException.from(_parser, String.format("Cannot deserialize Map key of type %s from String %s: %s", new Object[] {
			ClassUtil.nameOf(class1), _quotedString(s), s1
		}), ((Object) (s)), class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field JsonParser _parser>
	//    2    4:ldc2            #670 <String "Cannot deserialize Map key of type %s from String %s: %s">
	//    3    7:iconst_3        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_1         
	//    8   14:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #674 <Method String _quotedString(String)>
	//   15   25:aastore         
	//   16   26:dup             
	//   17   27:iconst_2        
	//   18   28:aload_3         
	//   19   29:aastore         
	//   20   30:invokestatic    #176 <Method String String.format(String, Object[])>
	//   21   33:aload_2         
	//   22   34:aload_1         
	//   23   35:invokestatic    #679 <Method InvalidFormatException InvalidFormatException.from(JsonParser, String, Object, Class)>
	//   24   38:areturn         
	}

	public JsonMappingException weirdNativeValueException(Object obj, Class class1)
	{
		return ((JsonMappingException) (InvalidFormatException.from(_parser, String.format("Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types", new Object[] {
			ClassUtil.nameOf(class1), ClassUtil.classNameOf(obj)
		}), obj, class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field JsonParser _parser>
	//    2    4:ldc2            #682 <String "Cannot deserialize value of type %s from native value (`JsonToken.VALUE_EMBEDDED_OBJECT`) of type %s: incompatible types">
	//    3    7:iconst_2        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_2         
	//    8   14:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:aload_1         
	//   13   21:invokestatic    #300 <Method String ClassUtil.classNameOf(Object)>
	//   14   24:aastore         
	//   15   25:invokestatic    #176 <Method String String.format(String, Object[])>
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:invokestatic    #679 <Method InvalidFormatException InvalidFormatException.from(JsonParser, String, Object, Class)>
	//   19   33:areturn         
	}

	public JsonMappingException weirdNumberException(Number number, Class class1, String s)
	{
		return ((JsonMappingException) (InvalidFormatException.from(_parser, String.format("Cannot deserialize value of type %s from number %s: %s", new Object[] {
			ClassUtil.nameOf(class1), String.valueOf(((Object) (number))), s
		}), ((Object) (number)), class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field JsonParser _parser>
	//    2    4:ldc2            #685 <String "Cannot deserialize value of type %s from number %s: %s">
	//    3    7:iconst_3        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_2         
	//    8   14:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:aload_1         
	//   13   21:invokestatic    #688 <Method String String.valueOf(Object)>
	//   14   24:aastore         
	//   15   25:dup             
	//   16   26:iconst_2        
	//   17   27:aload_3         
	//   18   28:aastore         
	//   19   29:invokestatic    #176 <Method String String.format(String, Object[])>
	//   20   32:aload_1         
	//   21   33:aload_2         
	//   22   34:invokestatic    #679 <Method InvalidFormatException InvalidFormatException.from(JsonParser, String, Object, Class)>
	//   23   37:areturn         
	}

	public JsonMappingException weirdStringException(String s, Class class1, String s1)
	{
		return ((JsonMappingException) (InvalidFormatException.from(_parser, String.format("Cannot deserialize value of type %s from String %s: %s", new Object[] {
			ClassUtil.nameOf(class1), _quotedString(s), s1
		}), ((Object) (s)), class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field JsonParser _parser>
	//    2    4:ldc2            #691 <String "Cannot deserialize value of type %s from String %s: %s">
	//    3    7:iconst_3        
	//    4    8:anewarray       Object[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:aload_2         
	//    8   14:invokestatic    #338 <Method String ClassUtil.nameOf(Class)>
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #674 <Method String _quotedString(String)>
	//   15   25:aastore         
	//   16   26:dup             
	//   17   27:iconst_2        
	//   18   28:aload_3         
	//   19   29:aastore         
	//   20   30:invokestatic    #176 <Method String String.format(String, Object[])>
	//   21   33:aload_1         
	//   22   34:aload_2         
	//   23   35:invokestatic    #679 <Method InvalidFormatException InvalidFormatException.from(JsonParser, String, Object, Class)>
	//   24   38:areturn         
	}

	public JsonMappingException wrongTokenException(JsonParser jsonparser, JavaType javatype, JsonToken jsontoken, String s)
	{
		return ((JsonMappingException) (MismatchedInputException.from(jsonparser, javatype, _colonConcat(String.format("Unexpected token (%s), expected %s", new Object[] {
			jsonparser.getCurrentToken(), jsontoken
		}), s))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:ldc2            #694 <String "Unexpected token (%s), expected %s">
	//    4    6:iconst_2        
	//    5    7:anewarray       Object[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:invokevirtual   #408 <Method JsonToken JsonParser.getCurrentToken()>
	//   10   16:aastore         
	//   11   17:dup             
	//   12   18:iconst_1        
	//   13   19:aload_3         
	//   14   20:aastore         
	//   15   21:invokestatic    #176 <Method String String.format(String, Object[])>
	//   16   24:aload           4
	//   17   26:invokevirtual   #533 <Method String _colonConcat(String, String)>
	//   18   29:invokestatic    #619 <Method MismatchedInputException MismatchedInputException.from(JsonParser, JavaType, String)>
	//   19   32:areturn         
	}

	public JsonMappingException wrongTokenException(JsonParser jsonparser, Class class1, JsonToken jsontoken, String s)
	{
		return ((JsonMappingException) (MismatchedInputException.from(jsonparser, class1, _colonConcat(String.format("Unexpected token (%s), expected %s", new Object[] {
			jsonparser.getCurrentToken(), jsontoken
		}), s))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:ldc2            #694 <String "Unexpected token (%s), expected %s">
	//    4    6:iconst_2        
	//    5    7:anewarray       Object[]
	//    6   10:dup             
	//    7   11:iconst_0        
	//    8   12:aload_1         
	//    9   13:invokevirtual   #408 <Method JsonToken JsonParser.getCurrentToken()>
	//   10   16:aastore         
	//   11   17:dup             
	//   12   18:iconst_1        
	//   13   19:aload_3         
	//   14   20:aastore         
	//   15   21:invokestatic    #176 <Method String String.format(String, Object[])>
	//   16   24:aload           4
	//   17   26:invokevirtual   #533 <Method String _colonConcat(String, String)>
	//   18   29:invokestatic    #626 <Method MismatchedInputException MismatchedInputException.from(JsonParser, Class, String)>
	//   19   32:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected transient ArrayBuilders _arrayBuilders;
	protected transient ContextAttributes _attributes;
	protected final DeserializerCache _cache;
	protected final DeserializationConfig _config;
	protected LinkedNode _currentType;
	protected transient DateFormat _dateFormat;
	protected final DeserializerFactory _factory;
	protected final int _featureFlags;
	protected final InjectableValues _injectableValues;
	protected transient ObjectBuffer _objectBuffer;
	protected transient JsonParser _parser;
	protected final Class _view;
}
