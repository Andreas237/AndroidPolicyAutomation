// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//			ConfigFeature, BaseSettings, HandlerInstantiator, ContextAttributes

public abstract class MapperConfig
	implements com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver, Serializable
{

	protected MapperConfig(BaseSettings basesettings, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		_base = basesettings;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field BaseSettings _base>
		_mapperFeatures = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #47  <Field int _mapperFeatures>
	//    8   14:return          
	}

	protected MapperConfig(MapperConfig mapperconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		_base = mapperconfig._base;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #45  <Field BaseSettings _base>
	//    5    9:putfield        #45  <Field BaseSettings _base>
		_mapperFeatures = mapperconfig._mapperFeatures;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #47  <Field int _mapperFeatures>
	//    9   17:putfield        #47  <Field int _mapperFeatures>
	//   10   20:return          
	}

	protected MapperConfig(MapperConfig mapperconfig, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		_base = mapperconfig._base;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #45  <Field BaseSettings _base>
	//    5    9:putfield        #45  <Field BaseSettings _base>
		_mapperFeatures = i;
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:putfield        #47  <Field int _mapperFeatures>
	//    9   17:return          
	}

	protected MapperConfig(MapperConfig mapperconfig, BaseSettings basesettings)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		_base = basesettings;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #45  <Field BaseSettings _base>
		_mapperFeatures = mapperconfig._mapperFeatures;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #47  <Field int _mapperFeatures>
	//    8   14:putfield        #47  <Field int _mapperFeatures>
	//    9   17:return          
	}

	public static int collectFeatureDefaults(Class class1)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		class1 = ((Class) ((Enum[])class1.getEnumConstants()));
	//    2    2:aload_0         
	//    3    3:invokevirtual   #62  <Method Object[] Class.getEnumConstants()>
	//    4    6:checkcast       #64  <Class Enum[]>
	//    5    9:astore_0        
		int l = class1.length;
	//    6   10:aload_0         
	//    7   11:arraylength     
	//    8   12:istore          4
		for(int i = 0; i < l;)
	//*   9   14:iconst_0        
	//*  10   15:istore_1        
	//*  11   16:iload_1         
	//*  12   17:iload           4
	//*  13   19:icmpge          64
		{
			Object obj = class1[i];
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:astore          5
			int k = j;
	//   18   27:iload_2         
	//   19   28:istore_3        
			if(((ConfigFeature)obj).enabledByDefault())
	//*  20   29:aload           5
	//*  21   31:checkcast       #66  <Class ConfigFeature>
	//*  22   34:invokeinterface #70  <Method boolean ConfigFeature.enabledByDefault()>
	//*  23   39:ifeq            55
				k = j | ((ConfigFeature)obj).getMask();
	//   24   42:iload_2         
	//   25   43:aload           5
	//   26   45:checkcast       #66  <Class ConfigFeature>
	//   27   48:invokeinterface #74  <Method int ConfigFeature.getMask()>
	//   28   53:ior             
	//   29   54:istore_3        
			i++;
	//   30   55:iload_1         
	//   31   56:iconst_1        
	//   32   57:iadd            
	//   33   58:istore_1        
			j = k;
	//   34   59:iload_3         
	//   35   60:istore_2        
		}

	//*  36   61:goto            16
		return j;
	//   37   64:iload_2         
	//   38   65:ireturn         
	}

	public final boolean canOverrideAccessModifiers()
	{
		return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
	//    0    0:aload_0         
	//    1    1:getstatic       #82  <Field MapperFeature MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS>
	//    2    4:invokevirtual   #86  <Method boolean isEnabled(MapperFeature)>
	//    3    7:ireturn         
	}

	public SerializableString compileString(String s)
	{
		return ((SerializableString) (new SerializedString(s)));
	//    0    0:new             #90  <Class SerializedString>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #93  <Method void SerializedString(String)>
	//    4    8:areturn         
	}

	public JavaType constructSpecializedType(JavaType javatype, Class class1)
	{
		return getTypeFactory().constructSpecializedType(javatype, class1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method TypeFactory getTypeFactory()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #103 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//    5    9:areturn         
	}

	public final JavaType constructType(TypeReference typereference)
	{
		return getTypeFactory().constructType(typereference.getType());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method TypeFactory getTypeFactory()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method java.lang.reflect.Type TypeReference.getType()>
	//    4    8:invokevirtual   #115 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    5   11:areturn         
	}

	public final JavaType constructType(Class class1)
	{
		return getTypeFactory().constructType(((java.lang.reflect.Type) (class1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method TypeFactory getTypeFactory()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    4    8:areturn         
	}

	public abstract PropertyName findRootName(JavaType javatype);

	public abstract PropertyName findRootName(Class class1);

	public abstract Class getActiveView();

	public AnnotationIntrospector getAnnotationIntrospector()
	{
		return _base.getAnnotationIntrospector();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #129 <Method AnnotationIntrospector BaseSettings.getAnnotationIntrospector()>
	//    3    7:areturn         
	}

	public abstract ContextAttributes getAttributes();

	public Base64Variant getBase64Variant()
	{
		return _base.getBase64Variant();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #135 <Method Base64Variant BaseSettings.getBase64Variant()>
	//    3    7:areturn         
	}

	public ClassIntrospector getClassIntrospector()
	{
		return _base.getClassIntrospector();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #139 <Method ClassIntrospector BaseSettings.getClassIntrospector()>
	//    3    7:areturn         
	}

	public final DateFormat getDateFormat()
	{
		return _base.getDateFormat();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #143 <Method DateFormat BaseSettings.getDateFormat()>
	//    3    7:areturn         
	}

	public abstract com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class class1);

	public abstract com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion();

	public abstract com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion(Class class1);

	public final TypeResolverBuilder getDefaultTyper(JavaType javatype)
	{
		return _base.getTypeResolverBuilder();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #153 <Method TypeResolverBuilder BaseSettings.getTypeResolverBuilder()>
	//    3    7:areturn         
	}

	public VisibilityChecker getDefaultVisibilityChecker()
	{
		return _base.getVisibilityChecker();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #159 <Method VisibilityChecker BaseSettings.getVisibilityChecker()>
	//    3    7:areturn         
	}

	public final HandlerInstantiator getHandlerInstantiator()
	{
		return _base.getHandlerInstantiator();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #164 <Method HandlerInstantiator BaseSettings.getHandlerInstantiator()>
	//    3    7:areturn         
	}

	public final Locale getLocale()
	{
		return _base.getLocale();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #168 <Method Locale BaseSettings.getLocale()>
	//    3    7:areturn         
	}

	public final PropertyNamingStrategy getPropertyNamingStrategy()
	{
		return _base.getPropertyNamingStrategy();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #172 <Method PropertyNamingStrategy BaseSettings.getPropertyNamingStrategy()>
	//    3    7:areturn         
	}

	public abstract SubtypeResolver getSubtypeResolver();

	public final TimeZone getTimeZone()
	{
		return _base.getTimeZone();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #178 <Method TimeZone BaseSettings.getTimeZone()>
	//    3    7:areturn         
	}

	public final TypeFactory getTypeFactory()
	{
		return _base.getTypeFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #179 <Method TypeFactory BaseSettings.getTypeFactory()>
	//    3    7:areturn         
	}

	public final boolean hasMapperFeatures(int i)
	{
		return (_mapperFeatures & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int _mapperFeatures>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public abstract BeanDescription introspectClassAnnotations(JavaType javatype);

	public BeanDescription introspectClassAnnotations(Class class1)
	{
		return introspectClassAnnotations(constructType(class1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #186 <Method JavaType constructType(Class)>
	//    4    6:invokevirtual   #188 <Method BeanDescription introspectClassAnnotations(JavaType)>
	//    5    9:areturn         
	}

	public abstract BeanDescription introspectDirectClassAnnotations(JavaType javatype);

	public BeanDescription introspectDirectClassAnnotations(Class class1)
	{
		return introspectDirectClassAnnotations(constructType(class1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #186 <Method JavaType constructType(Class)>
	//    4    6:invokevirtual   #192 <Method BeanDescription introspectDirectClassAnnotations(JavaType)>
	//    5    9:areturn         
	}

	public final boolean isAnnotationProcessingEnabled()
	{
		return isEnabled(MapperFeature.USE_ANNOTATIONS);
	//    0    0:aload_0         
	//    1    1:getstatic       #196 <Field MapperFeature MapperFeature.USE_ANNOTATIONS>
	//    2    4:invokevirtual   #86  <Method boolean isEnabled(MapperFeature)>
	//    3    7:ireturn         
	}

	public final boolean isEnabled(MapperFeature mapperfeature)
	{
		return (_mapperFeatures & mapperfeature.getMask()) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int _mapperFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #197 <Method int MapperFeature.getMask()>
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final boolean shouldSortPropertiesAlphabetically()
	{
		return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
	//    0    0:aload_0         
	//    1    1:getstatic       #201 <Field MapperFeature MapperFeature.SORT_PROPERTIES_ALPHABETICALLY>
	//    2    4:invokevirtual   #86  <Method boolean isEnabled(MapperFeature)>
	//    3    7:ireturn         
	}

	public TypeIdResolver typeIdResolverInstance(Annotated annotated, Class class1)
	{
		HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method HandlerInstantiator getHandlerInstantiator()>
	//    2    4:astore_3        
		if(handlerinstantiator != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          23
		{
			annotated = ((Annotated) (handlerinstantiator.typeIdResolverInstance(this, annotated, class1)));
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #209 <Method TypeIdResolver HandlerInstantiator.typeIdResolverInstance(MapperConfig, Annotated, Class)>
	//   10   16:astore_1        
			if(annotated != null)
	//*  11   17:aload_1         
	//*  12   18:ifnull          23
				return ((TypeIdResolver) (annotated));
	//   13   21:aload_1         
	//   14   22:areturn         
		}
		return (TypeIdResolver)ClassUtil.createInstance(class1, canOverrideAccessModifiers());
	//   15   23:aload_2         
	//   16   24:aload_0         
	//   17   25:invokevirtual   #211 <Method boolean canOverrideAccessModifiers()>
	//   18   28:invokestatic    #217 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   19   31:checkcast       #219 <Class TypeIdResolver>
	//   20   34:areturn         
	}

	public TypeResolverBuilder typeResolverBuilderInstance(Annotated annotated, Class class1)
	{
		HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method HandlerInstantiator getHandlerInstantiator()>
	//    2    4:astore_3        
		if(handlerinstantiator != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          23
		{
			annotated = ((Annotated) (handlerinstantiator.typeResolverBuilderInstance(this, annotated, class1)));
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #225 <Method TypeResolverBuilder HandlerInstantiator.typeResolverBuilderInstance(MapperConfig, Annotated, Class)>
	//   10   16:astore_1        
			if(annotated != null)
	//*  11   17:aload_1         
	//*  12   18:ifnull          23
				return ((TypeResolverBuilder) (annotated));
	//   13   21:aload_1         
	//   14   22:areturn         
		}
		return (TypeResolverBuilder)ClassUtil.createInstance(class1, canOverrideAccessModifiers());
	//   15   23:aload_2         
	//   16   24:aload_0         
	//   17   25:invokevirtual   #211 <Method boolean canOverrideAccessModifiers()>
	//   18   28:invokestatic    #217 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   19   31:checkcast       #227 <Class TypeResolverBuilder>
	//   20   34:areturn         
	}

	public abstract boolean useRootWrapping();

	public abstract MapperConfig with(MapperFeature mapperfeature, boolean flag);

	public transient abstract MapperConfig with(MapperFeature amapperfeature[]);

	public transient abstract MapperConfig without(MapperFeature amapperfeature[]);

	protected static final com.fasterxml.jackson.annotation.JsonFormat.Value EMPTY_FORMAT = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
	protected static final com.fasterxml.jackson.annotation.JsonInclude.Value EMPTY_INCLUDE = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
	private static final long serialVersionUID = 1L;
	protected final BaseSettings _base;
	protected final int _mapperFeatures;

	static 
	{
	//    0    0:invokestatic    #29  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//    1    3:putstatic       #31  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//    2    6:invokestatic    #36  <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.empty()>
	//    3    9:putstatic       #38  <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
	//*   4   12:return          
	}
}
