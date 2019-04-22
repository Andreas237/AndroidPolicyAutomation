// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//			ConfigFeature, BaseSettings, ConfigOverride, HandlerInstantiator

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
		class1 = ((Class) ((Enum[])class1.getEnumConstants()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method Object[] Class.getEnumConstants()>
	//    2    4:checkcast       #64  <Class Enum[]>
	//    3    7:astore_0        
		int l = class1.length;
	//    4    8:aload_0         
	//    5    9:arraylength     
	//    6   10:istore          4
		int i = 0;
	//    7   12:iconst_0        
	//    8   13:istore_1        
		int j;
		int k;
		for(j = 0; i < l; j = k)
	//*   9   14:iconst_0        
	//*  10   15:istore_2        
	//*  11   16:iload_1         
	//*  12   17:iload           4
	//*  13   19:icmpge          61
		{
			ConfigFeature configfeature = (ConfigFeature)class1[i];
	//   14   22:aload_0         
	//   15   23:iload_1         
	//   16   24:aaload          
	//   17   25:checkcast       #66  <Class ConfigFeature>
	//   18   28:astore          5
			k = j;
	//   19   30:iload_2         
	//   20   31:istore_3        
			if(configfeature.enabledByDefault())
	//*  21   32:aload           5
	//*  22   34:invokeinterface #70  <Method boolean ConfigFeature.enabledByDefault()>
	//*  23   39:ifeq            52
				k = j | configfeature.getMask();
	//   24   42:iload_2         
	//   25   43:aload           5
	//   26   45:invokeinterface #74  <Method int ConfigFeature.getMask()>
	//   27   50:ior             
	//   28   51:istore_3        
			i++;
	//   29   52:iload_1         
	//   30   53:iconst_1        
	//   31   54:iadd            
	//   32   55:istore_1        
		}

	//   33   56:iload_3         
	//   34   57:istore_2        
	//*  35   58:goto            16
		return j;
	//   36   61:iload_2         
	//   37   62:ireturn         
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

	public final JavaType constructType(Class class1)
	{
		return getTypeFactory().constructType(((java.lang.reflect.Type) (class1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method TypeFactory getTypeFactory()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    4    8:areturn         
	}

	public AnnotationIntrospector getAnnotationIntrospector()
	{
		if(isEnabled(MapperFeature.USE_ANNOTATIONS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #115 <Field MapperFeature MapperFeature.USE_ANNOTATIONS>
	//*   2    4:invokevirtual   #86  <Method boolean isEnabled(MapperFeature)>
	//*   3    7:ifeq            18
			return _base.getAnnotationIntrospector();
	//    4   10:aload_0         
	//    5   11:getfield        #45  <Field BaseSettings _base>
	//    6   14:invokevirtual   #119 <Method AnnotationIntrospector BaseSettings.getAnnotationIntrospector()>
	//    7   17:areturn         
		else
			return ((AnnotationIntrospector) (NopAnnotationIntrospector.instance));
	//    8   18:getstatic       #125 <Field NopAnnotationIntrospector NopAnnotationIntrospector.instance>
	//    9   21:areturn         
	}

	public Base64Variant getBase64Variant()
	{
		return _base.getBase64Variant();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #129 <Method Base64Variant BaseSettings.getBase64Variant()>
	//    3    7:areturn         
	}

	public ClassIntrospector getClassIntrospector()
	{
		return _base.getClassIntrospector();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #133 <Method ClassIntrospector BaseSettings.getClassIntrospector()>
	//    3    7:areturn         
	}

	public abstract ConfigOverride getConfigOverride(Class class1);

	public final DateFormat getDateFormat()
	{
		return _base.getDateFormat();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #139 <Method DateFormat BaseSettings.getDateFormat()>
	//    3    7:areturn         
	}

	public abstract com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultInclusion(Class class1, Class class2);

	public com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultInclusion(Class class1, Class class2, com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		return com.fasterxml.jackson.annotation.JsonInclude.Value.mergeAll(new com.fasterxml.jackson.annotation.JsonInclude.Value[] {
			value, getConfigOverride(class1).getInclude(), getConfigOverride(class2).getIncludeAsProperty()
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       com.fasterxml.jackson.annotation.JsonInclude.Value[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_3         
	//    5    7:aastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:invokevirtual   #144 <Method ConfigOverride getConfigOverride(Class)>
	//   11   15:invokevirtual   #149 <Method com.fasterxml.jackson.annotation.JsonInclude$Value ConfigOverride.getInclude()>
	//   12   18:aastore         
	//   13   19:dup             
	//   14   20:iconst_2        
	//   15   21:aload_0         
	//   16   22:aload_2         
	//   17   23:invokevirtual   #144 <Method ConfigOverride getConfigOverride(Class)>
	//   18   26:invokevirtual   #152 <Method com.fasterxml.jackson.annotation.JsonInclude$Value ConfigOverride.getIncludeAsProperty()>
	//   19   29:aastore         
	//   20   30:invokestatic    #156 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.mergeAll(com.fasterxml.jackson.annotation.JsonInclude$Value[])>
	//   21   33:areturn         
	}

	public abstract Boolean getDefaultMergeable();

	public abstract com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class class1);

	public abstract com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion(Class class1);

	public com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion(Class class1, com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		class1 = ((Class) (getConfigOverride(class1).getInclude()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #144 <Method ConfigOverride getConfigOverride(Class)>
	//    3    5:invokevirtual   #149 <Method com.fasterxml.jackson.annotation.JsonInclude$Value ConfigOverride.getInclude()>
	//    4    8:astore_1        
		if(class1 != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          15
			return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1));
	//    7   13:aload_1         
	//    8   14:areturn         
		else
			return value;
	//    9   15:aload_2         
	//   10   16:areturn         
	}

	public abstract com.fasterxml.jackson.annotation.JsonSetter.Value getDefaultSetterInfo();

	public final TypeResolverBuilder getDefaultTyper(JavaType javatype)
	{
		return _base.getTypeResolverBuilder();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #173 <Method TypeResolverBuilder BaseSettings.getTypeResolverBuilder()>
	//    3    7:areturn         
	}

	public abstract VisibilityChecker getDefaultVisibilityChecker(Class class1, AnnotatedClass annotatedclass);

	public final HandlerInstantiator getHandlerInstantiator()
	{
		return _base.getHandlerInstantiator();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #180 <Method HandlerInstantiator BaseSettings.getHandlerInstantiator()>
	//    3    7:areturn         
	}

	public final Locale getLocale()
	{
		return _base.getLocale();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #184 <Method Locale BaseSettings.getLocale()>
	//    3    7:areturn         
	}

	public final PropertyNamingStrategy getPropertyNamingStrategy()
	{
		return _base.getPropertyNamingStrategy();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #188 <Method PropertyNamingStrategy BaseSettings.getPropertyNamingStrategy()>
	//    3    7:areturn         
	}

	public final TimeZone getTimeZone()
	{
		return _base.getTimeZone();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #192 <Method TimeZone BaseSettings.getTimeZone()>
	//    3    7:areturn         
	}

	public final TypeFactory getTypeFactory()
	{
		return _base.getTypeFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field BaseSettings _base>
	//    2    4:invokevirtual   #193 <Method TypeFactory BaseSettings.getTypeFactory()>
	//    3    7:areturn         
	}

	public BeanDescription introspectClassAnnotations(JavaType javatype)
	{
		return getClassIntrospector().forClassAnnotations(this, javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #196 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #202 <Method BeanDescription ClassIntrospector.forClassAnnotations(MapperConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public BeanDescription introspectClassAnnotations(Class class1)
	{
		return introspectClassAnnotations(constructType(class1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #205 <Method JavaType constructType(Class)>
	//    4    6:invokevirtual   #207 <Method BeanDescription introspectClassAnnotations(JavaType)>
	//    5    9:areturn         
	}

	public final boolean isAnnotationProcessingEnabled()
	{
		return isEnabled(MapperFeature.USE_ANNOTATIONS);
	//    0    0:aload_0         
	//    1    1:getstatic       #115 <Field MapperFeature MapperFeature.USE_ANNOTATIONS>
	//    2    4:invokevirtual   #86  <Method boolean isEnabled(MapperFeature)>
	//    3    7:ireturn         
	}

	public final boolean isEnabled(MapperFeature mapperfeature)
	{
		int i = _mapperFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int _mapperFeatures>
	//    2    4:istore_2        
		return (mapperfeature.getMask() & i) != 0;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #210 <Method int MapperFeature.getMask()>
	//    5    9:iload_2         
	//    6   10:iand            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public final boolean shouldSortPropertiesAlphabetically()
	{
		return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
	//    0    0:aload_0         
	//    1    1:getstatic       #214 <Field MapperFeature MapperFeature.SORT_PROPERTIES_ALPHABETICALLY>
	//    2    4:invokevirtual   #86  <Method boolean isEnabled(MapperFeature)>
	//    3    7:ireturn         
	}

	public TypeIdResolver typeIdResolverInstance(Annotated annotated, Class class1)
	{
		HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method HandlerInstantiator getHandlerInstantiator()>
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
	//    9   13:invokevirtual   #222 <Method TypeIdResolver HandlerInstantiator.typeIdResolverInstance(MapperConfig, Annotated, Class)>
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
	//   17   25:invokevirtual   #224 <Method boolean canOverrideAccessModifiers()>
	//   18   28:invokestatic    #230 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   19   31:checkcast       #232 <Class TypeIdResolver>
	//   20   34:areturn         
	}

	public TypeResolverBuilder typeResolverBuilderInstance(Annotated annotated, Class class1)
	{
		HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method HandlerInstantiator getHandlerInstantiator()>
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
	//    9   13:invokevirtual   #238 <Method TypeResolverBuilder HandlerInstantiator.typeResolverBuilderInstance(MapperConfig, Annotated, Class)>
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
	//   17   25:invokevirtual   #224 <Method boolean canOverrideAccessModifiers()>
	//   18   28:invokestatic    #230 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   19   31:checkcast       #240 <Class TypeResolverBuilder>
	//   20   34:areturn         
	}

	protected static final com.fasterxml.jackson.annotation.JsonFormat.Value EMPTY_FORMAT = com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
	protected static final com.fasterxml.jackson.annotation.JsonInclude.Value EMPTY_INCLUDE = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
	private static final long serialVersionUID = 2L;
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
