// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			ClassIntrospector, AnnotatedClass, BasicBeanDescription, POJOPropertiesCollector

public class BasicClassIntrospector extends ClassIntrospector
	implements Serializable
{

	public BasicClassIntrospector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void ClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:new             #72  <Class LRUMap>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:bipush          64
	//    7   13:invokespecial   #75  <Method void LRUMap(int, int)>
	//    8   16:putfield        #77  <Field LRUMap _cachedFCA>
	//    9   19:return          
	}

	protected BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig mapperconfig, JavaType javatype)
	{
		if(_isStdJDKCollection(javatype))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #83  <Method boolean _isStdJDKCollection(JavaType)>
	//*   3    5:ifeq            19
			return BasicBeanDescription.forOtherUse(mapperconfig, javatype, AnnotatedClass.construct(javatype, mapperconfig));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokestatic    #87  <Method AnnotatedClass AnnotatedClass.construct(JavaType, MapperConfig)>
	//    9   15:invokestatic    #43  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	protected BasicBeanDescription _findStdTypeDesc(JavaType javatype)
	{
		javatype = ((JavaType) (javatype.getRawClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #97  <Method Class JavaType.getRawClass()>
	//    2    4:astore_1        
		if(((Class) (javatype)).isPrimitive())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #103 <Method boolean Class.isPrimitive()>
	//*   5    9:ifeq            45
		{
			if(javatype == Boolean.TYPE)
	//*   6   12:aload_1         
	//*   7   13:getstatic       #51  <Field Class Boolean.TYPE>
	//*   8   16:if_acmpne       23
				return BOOLEAN_DESC;
	//    9   19:getstatic       #53  <Field BasicBeanDescription BOOLEAN_DESC>
	//   10   22:areturn         
			if(javatype == Integer.TYPE)
	//*  11   23:aload_1         
	//*  12   24:getstatic       #56  <Field Class Integer.TYPE>
	//*  13   27:if_acmpne       34
				return INT_DESC;
	//   14   30:getstatic       #58  <Field BasicBeanDescription INT_DESC>
	//   15   33:areturn         
			if(javatype == Long.TYPE)
	//*  16   34:aload_1         
	//*  17   35:getstatic       #61  <Field Class Long.TYPE>
	//*  18   38:if_acmpne       55
				return LONG_DESC;
	//   19   41:getstatic       #63  <Field BasicBeanDescription LONG_DESC>
	//   20   44:areturn         
		} else
		if(javatype == java/lang/String)
	//*  21   45:aload_1         
	//*  22   46:ldc1            #25  <Class String>
	//*  23   48:if_acmpne       55
			return STRING_DESC;
	//   24   51:getstatic       #45  <Field BasicBeanDescription STRING_DESC>
	//   25   54:areturn         
		return null;
	//   26   55:aconst_null     
	//   27   56:areturn         
	}

	protected boolean _isStdJDKCollection(JavaType javatype)
	{
		if(javatype.isContainerType() && !javatype.isArrayType())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #106 <Method boolean JavaType.isContainerType()>
	//*   2    4:ifeq            14
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #109 <Method boolean JavaType.isArrayType()>
	//*   5   11:ifeq            16
	//*   6   14:iconst_0        
	//*   7   15:ireturn         
		{
			javatype = ((JavaType) (javatype.getRawClass()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #97  <Method Class JavaType.getRawClass()>
	//   10   20:astore_1        
			String s = ClassUtil.getPackageName(((Class) (javatype)));
	//   11   21:aload_1         
	//   12   22:invokestatic    #115 <Method String ClassUtil.getPackageName(Class)>
	//   13   25:astore_2        
			if(s != null && (s.startsWith("java.lang") || s.startsWith("java.util")) && (((Class) (java/util/Collection)).isAssignableFrom(((Class) (javatype))) || ((Class) (java/util/Map)).isAssignableFrom(((Class) (javatype)))))
	//*  14   26:aload_2         
	//*  15   27:ifnull          14
	//*  16   30:aload_2         
	//*  17   31:ldc1            #117 <String "java.lang">
	//*  18   33:invokevirtual   #121 <Method boolean String.startsWith(String)>
	//*  19   36:ifne            48
	//*  20   39:aload_2         
	//*  21   40:ldc1            #123 <String "java.util">
	//*  22   42:invokevirtual   #121 <Method boolean String.startsWith(String)>
	//*  23   45:ifeq            14
	//*  24   48:ldc1            #125 <Class Collection>
	//*  25   50:aload_1         
	//*  26   51:invokevirtual   #129 <Method boolean Class.isAssignableFrom(Class)>
	//*  27   54:ifne            66
	//*  28   57:ldc1            #131 <Class Map>
	//*  29   59:aload_1         
	//*  30   60:invokevirtual   #129 <Method boolean Class.isAssignableFrom(Class)>
	//*  31   63:ifeq            14
				return true;
	//   32   66:iconst_1        
	//   33   67:ireturn         
		}
		return false;
	}

	protected POJOPropertiesCollector collectProperties(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver, boolean flag, String s)
	{
		return constructPropertyCollector(mapperconfig, AnnotatedClass.construct(javatype, mapperconfig, mixinresolver), javatype, flag, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:aload_3         
	//    5    5:invokestatic    #136 <Method AnnotatedClass AnnotatedClass.construct(JavaType, MapperConfig, ClassIntrospector$MixInResolver)>
	//    6    8:aload_2         
	//    7    9:iload           4
	//    8   11:aload           5
	//    9   13:invokevirtual   #140 <Method POJOPropertiesCollector constructPropertyCollector(MapperConfig, AnnotatedClass, JavaType, boolean, String)>
	//   10   16:areturn         
	}

	protected POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver, boolean flag)
	{
		AnnotationIntrospector annotationintrospector;
		AnnotatedClass annotatedclass;
		if(mapperconfig.isAnnotationProcessingEnabled())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #148 <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*   2    4:ifeq            47
			annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #152 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    5   11:astore          5
		else
	//*   6   13:aload_2         
	//*   7   14:aload_1         
	//*   8   15:aload_3         
	//*   9   16:invokestatic    #136 <Method AnnotatedClass AnnotatedClass.construct(JavaType, MapperConfig, ClassIntrospector$MixInResolver)>
	//*  10   19:astore          6
	//*  11   21:aload           5
	//*  12   23:ifnonnull       53
	//*  13   26:aconst_null     
	//*  14   27:astore_3        
	//*  15   28:aload_3         
	//*  16   29:ifnonnull       64
	//*  17   32:ldc1            #154 <String "with">
	//*  18   34:astore_3        
	//*  19   35:aload_0         
	//*  20   36:aload_1         
	//*  21   37:aload           6
	//*  22   39:aload_2         
	//*  23   40:iload           4
	//*  24   42:aload_3         
	//*  25   43:invokevirtual   #140 <Method POJOPropertiesCollector constructPropertyCollector(MapperConfig, AnnotatedClass, JavaType, boolean, String)>
	//*  26   46:areturn         
			annotationintrospector = null;
	//   27   47:aconst_null     
	//   28   48:astore          5
		annotatedclass = AnnotatedClass.construct(javatype, mapperconfig, mixinresolver);
		if(annotationintrospector == null)
			mixinresolver = null;
		else
	//*  29   50:goto            13
			mixinresolver = ((ClassIntrospector.MixInResolver) (annotationintrospector.findPOJOBuilderConfig(annotatedclass)));
	//   30   53:aload           5
	//   31   55:aload           6
	//   32   57:invokevirtual   #160 <Method com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value AnnotationIntrospector.findPOJOBuilderConfig(AnnotatedClass)>
	//   33   60:astore_3        
		if(mixinresolver == null)
			mixinresolver = "with";
		else
	//*  34   61:goto            28
			mixinresolver = ((ClassIntrospector.MixInResolver) (((com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value) (mixinresolver)).withPrefix));
	//   35   64:aload_3         
	//   36   65:getfield        #166 <Field String com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value.withPrefix>
	//   37   68:astore_3        
		return constructPropertyCollector(mapperconfig, annotatedclass, javatype, flag, ((String) (mixinresolver)));
	//*  38   69:goto            35
	}

	protected POJOPropertiesCollector constructPropertyCollector(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype, boolean flag, String s)
	{
		return new POJOPropertiesCollector(mapperconfig, flag, javatype, annotatedclass, s);
	//    0    0:new             #169 <Class POJOPropertiesCollector>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload           4
	//    4    7:aload_3         
	//    5    8:aload_2         
	//    6    9:aload           5
	//    7   11:invokespecial   #172 <Method void POJOPropertiesCollector(MapperConfig, boolean, JavaType, AnnotatedClass, String)>
	//    8   14:areturn         
	}

	public volatile BeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return ((BeanDescription) (forClassAnnotations(mapperconfig, javatype, mixinresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #178 <Method BasicBeanDescription forClassAnnotations(MapperConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #180 <Method BasicBeanDescription _findStdTypeDesc(JavaType)>
	//    3    5:astore          5
		BasicBeanDescription basicbeandescription = basicbeandescription1;
	//    4    7:aload           5
	//    5    9:astore          4
		if(basicbeandescription1 == null)
	//*   6   11:aload           5
	//*   7   13:ifnonnull       62
		{
			BasicBeanDescription basicbeandescription2 = (BasicBeanDescription)_cachedFCA.get(((Object) (javatype)));
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field LRUMap _cachedFCA>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #184 <Method Object LRUMap.get(Object)>
	//   12   24:checkcast       #39  <Class BasicBeanDescription>
	//   13   27:astore          5
			basicbeandescription = basicbeandescription2;
	//   14   29:aload           5
	//   15   31:astore          4
			if(basicbeandescription2 == null)
	//*  16   33:aload           5
	//*  17   35:ifnonnull       62
			{
				basicbeandescription = BasicBeanDescription.forOtherUse(mapperconfig, javatype, AnnotatedClass.construct(javatype, mapperconfig, mixinresolver));
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_2         
	//   21   41:aload_1         
	//   22   42:aload_3         
	//   23   43:invokestatic    #136 <Method AnnotatedClass AnnotatedClass.construct(JavaType, MapperConfig, ClassIntrospector$MixInResolver)>
	//   24   46:invokestatic    #43  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   25   49:astore          4
				_cachedFCA.put(((Object) (javatype)), ((Object) (basicbeandescription)));
	//   26   51:aload_0         
	//   27   52:getfield        #77  <Field LRUMap _cachedFCA>
	//   28   55:aload_2         
	//   29   56:aload           4
	//   30   58:invokevirtual   #188 <Method Object LRUMap.put(Object, Object)>
	//   31   61:pop             
			}
		}
		return basicbeandescription;
	//   32   62:aload           4
	//   33   64:areturn         
	}

	public volatile BeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return ((BeanDescription) (forCreation(deserializationconfig, javatype, mixinresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #194 <Method BasicBeanDescription forCreation(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #180 <Method BasicBeanDescription _findStdTypeDesc(JavaType)>
	//    3    5:astore          5
		BasicBeanDescription basicbeandescription = basicbeandescription1;
	//    4    7:aload           5
	//    5    9:astore          4
		if(basicbeandescription1 == null)
	//*   6   11:aload           5
	//*   7   13:ifnonnull       48
		{
			BasicBeanDescription basicbeandescription2 = _findStdJdkCollectionDesc(((MapperConfig) (deserializationconfig)), javatype);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #196 <Method BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig, JavaType)>
	//   12   22:astore          5
			basicbeandescription = basicbeandescription2;
	//   13   24:aload           5
	//   14   26:astore          4
			if(basicbeandescription2 == null)
	//*  15   28:aload           5
	//*  16   30:ifnonnull       48
				basicbeandescription = BasicBeanDescription.forDeserialization(collectProperties(((MapperConfig) (deserializationconfig)), javatype, mixinresolver, false, "set"));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:ldc1            #198 <String "set">
	//   23   40:invokevirtual   #200 <Method POJOPropertiesCollector collectProperties(MapperConfig, JavaType, ClassIntrospector$MixInResolver, boolean, String)>
	//   24   43:invokestatic    #204 <Method BasicBeanDescription BasicBeanDescription.forDeserialization(POJOPropertiesCollector)>
	//   25   46:astore          4
		}
		return basicbeandescription;
	//   26   48:aload           4
	//   27   50:areturn         
	}

	public volatile BeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return ((BeanDescription) (forDeserialization(deserializationconfig, javatype, mixinresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #206 <Method BasicBeanDescription forDeserialization(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #180 <Method BasicBeanDescription _findStdTypeDesc(JavaType)>
	//    3    5:astore          5
		BasicBeanDescription basicbeandescription = basicbeandescription1;
	//    4    7:aload           5
	//    5    9:astore          4
		if(basicbeandescription1 == null)
	//*   6   11:aload           5
	//*   7   13:ifnonnull       59
		{
			BasicBeanDescription basicbeandescription2 = _findStdJdkCollectionDesc(((MapperConfig) (deserializationconfig)), javatype);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #196 <Method BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig, JavaType)>
	//   12   22:astore          5
			basicbeandescription = basicbeandescription2;
	//   13   24:aload           5
	//   14   26:astore          4
			if(basicbeandescription2 == null)
	//*  15   28:aload           5
	//*  16   30:ifnonnull       48
				basicbeandescription = BasicBeanDescription.forDeserialization(collectProperties(((MapperConfig) (deserializationconfig)), javatype, mixinresolver, false, "set"));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:ldc1            #198 <String "set">
	//   23   40:invokevirtual   #200 <Method POJOPropertiesCollector collectProperties(MapperConfig, JavaType, ClassIntrospector$MixInResolver, boolean, String)>
	//   24   43:invokestatic    #204 <Method BasicBeanDescription BasicBeanDescription.forDeserialization(POJOPropertiesCollector)>
	//   25   46:astore          4
			_cachedFCA.putIfAbsent(((Object) (javatype)), ((Object) (basicbeandescription)));
	//   26   48:aload_0         
	//   27   49:getfield        #77  <Field LRUMap _cachedFCA>
	//   28   52:aload_2         
	//   29   53:aload           4
	//   30   55:invokevirtual   #209 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//   31   58:pop             
		}
		return basicbeandescription;
	//   32   59:aload           4
	//   33   61:areturn         
	}

	public volatile BeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return ((BeanDescription) (forDeserializationWithBuilder(deserializationconfig, javatype, mixinresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #212 <Method BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		deserializationconfig = ((DeserializationConfig) (BasicBeanDescription.forDeserialization(collectPropertiesWithBuilder(((MapperConfig) (deserializationconfig)), javatype, mixinresolver, false))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #214 <Method POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig, JavaType, ClassIntrospector$MixInResolver, boolean)>
	//    6    8:invokestatic    #204 <Method BasicBeanDescription BasicBeanDescription.forDeserialization(POJOPropertiesCollector)>
	//    7   11:astore_1        
		_cachedFCA.putIfAbsent(((Object) (javatype)), ((Object) (deserializationconfig)));
	//    8   12:aload_0         
	//    9   13:getfield        #77  <Field LRUMap _cachedFCA>
	//   10   16:aload_2         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #209 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//   13   21:pop             
		return ((BasicBeanDescription) (deserializationconfig));
	//   14   22:aload_1         
	//   15   23:areturn         
	}

	public volatile BeanDescription forDirectClassAnnotations(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return ((BeanDescription) (forDirectClassAnnotations(mapperconfig, javatype, mixinresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #217 <Method BasicBeanDescription forDirectClassAnnotations(MapperConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forDirectClassAnnotations(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #180 <Method BasicBeanDescription _findStdTypeDesc(JavaType)>
	//    3    5:astore          5
		BasicBeanDescription basicbeandescription = basicbeandescription1;
	//    4    7:aload           5
	//    5    9:astore          4
		if(basicbeandescription1 == null)
	//*   6   11:aload           5
	//*   7   13:ifnonnull       32
			basicbeandescription = BasicBeanDescription.forOtherUse(mapperconfig, javatype, AnnotatedClass.constructWithoutSuperTypes(javatype.getRawClass(), mapperconfig, mixinresolver));
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #97  <Method Class JavaType.getRawClass()>
	//   12   22:aload_1         
	//   13   23:aload_3         
	//   14   24:invokestatic    #220 <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig, ClassIntrospector$MixInResolver)>
	//   15   27:invokestatic    #43  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   16   30:astore          4
		return basicbeandescription;
	//   17   32:aload           4
	//   18   34:areturn         
	}

	public volatile BeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return ((BeanDescription) (forSerialization(serializationconfig, javatype, mixinresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #225 <Method BasicBeanDescription forSerialization(SerializationConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #180 <Method BasicBeanDescription _findStdTypeDesc(JavaType)>
	//    3    5:astore          5
		BasicBeanDescription basicbeandescription = basicbeandescription1;
	//    4    7:aload           5
	//    5    9:astore          4
		if(basicbeandescription1 == null)
	//*   6   11:aload           5
	//*   7   13:ifnonnull       59
		{
			BasicBeanDescription basicbeandescription2 = _findStdJdkCollectionDesc(((MapperConfig) (serializationconfig)), javatype);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #196 <Method BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig, JavaType)>
	//   12   22:astore          5
			basicbeandescription = basicbeandescription2;
	//   13   24:aload           5
	//   14   26:astore          4
			if(basicbeandescription2 == null)
	//*  15   28:aload           5
	//*  16   30:ifnonnull       48
				basicbeandescription = BasicBeanDescription.forSerialization(collectProperties(((MapperConfig) (serializationconfig)), javatype, mixinresolver, true, "set"));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:aload_3         
	//   21   37:iconst_1        
	//   22   38:ldc1            #198 <String "set">
	//   23   40:invokevirtual   #200 <Method POJOPropertiesCollector collectProperties(MapperConfig, JavaType, ClassIntrospector$MixInResolver, boolean, String)>
	//   24   43:invokestatic    #227 <Method BasicBeanDescription BasicBeanDescription.forSerialization(POJOPropertiesCollector)>
	//   25   46:astore          4
			_cachedFCA.putIfAbsent(((Object) (javatype)), ((Object) (basicbeandescription)));
	//   26   48:aload_0         
	//   27   49:getfield        #77  <Field LRUMap _cachedFCA>
	//   28   52:aload_2         
	//   29   53:aload           4
	//   30   55:invokevirtual   #209 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//   31   58:pop             
		}
		return basicbeandescription;
	//   32   59:aload           4
	//   33   61:areturn         
	}

	protected static final BasicBeanDescription BOOLEAN_DESC;
	protected static final BasicBeanDescription INT_DESC;
	protected static final BasicBeanDescription LONG_DESC;
	protected static final BasicBeanDescription STRING_DESC;
	public static final BasicClassIntrospector instance = new BasicClassIntrospector();
	private static final long serialVersionUID = 1L;
	protected final LRUMap _cachedFCA = new LRUMap(16, 64);

	static 
	{
		AnnotatedClass annotatedclass = AnnotatedClass.constructWithoutSuperTypes(java/lang/String, ((MapperConfig) (null)));
	//    0    0:ldc1            #25  <Class String>
	//    1    2:aconst_null     
	//    2    3:invokestatic    #31  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//    3    6:astore_0        
		STRING_DESC = BasicBeanDescription.forOtherUse(((MapperConfig) (null)), ((JavaType) (SimpleType.constructUnsafe(java/lang/String))), annotatedclass);
	//    4    7:aconst_null     
	//    5    8:ldc1            #25  <Class String>
	//    6   10:invokestatic    #37  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//    7   13:aload_0         
	//    8   14:invokestatic    #43  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//    9   17:putstatic       #45  <Field BasicBeanDescription STRING_DESC>
		annotatedclass = AnnotatedClass.constructWithoutSuperTypes(Boolean.TYPE, ((MapperConfig) (null)));
	//   10   20:getstatic       #51  <Field Class Boolean.TYPE>
	//   11   23:aconst_null     
	//   12   24:invokestatic    #31  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//   13   27:astore_0        
		BOOLEAN_DESC = BasicBeanDescription.forOtherUse(((MapperConfig) (null)), ((JavaType) (SimpleType.constructUnsafe(Boolean.TYPE))), annotatedclass);
	//   14   28:aconst_null     
	//   15   29:getstatic       #51  <Field Class Boolean.TYPE>
	//   16   32:invokestatic    #37  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//   17   35:aload_0         
	//   18   36:invokestatic    #43  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   19   39:putstatic       #53  <Field BasicBeanDescription BOOLEAN_DESC>
		annotatedclass = AnnotatedClass.constructWithoutSuperTypes(Integer.TYPE, ((MapperConfig) (null)));
	//   20   42:getstatic       #56  <Field Class Integer.TYPE>
	//   21   45:aconst_null     
	//   22   46:invokestatic    #31  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//   23   49:astore_0        
		INT_DESC = BasicBeanDescription.forOtherUse(((MapperConfig) (null)), ((JavaType) (SimpleType.constructUnsafe(Integer.TYPE))), annotatedclass);
	//   24   50:aconst_null     
	//   25   51:getstatic       #56  <Field Class Integer.TYPE>
	//   26   54:invokestatic    #37  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//   27   57:aload_0         
	//   28   58:invokestatic    #43  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   29   61:putstatic       #58  <Field BasicBeanDescription INT_DESC>
		annotatedclass = AnnotatedClass.constructWithoutSuperTypes(Long.TYPE, ((MapperConfig) (null)));
	//   30   64:getstatic       #61  <Field Class Long.TYPE>
	//   31   67:aconst_null     
	//   32   68:invokestatic    #31  <Method AnnotatedClass AnnotatedClass.constructWithoutSuperTypes(Class, MapperConfig)>
	//   33   71:astore_0        
		LONG_DESC = BasicBeanDescription.forOtherUse(((MapperConfig) (null)), ((JavaType) (SimpleType.constructUnsafe(Long.TYPE))), annotatedclass);
	//   34   72:aconst_null     
	//   35   73:getstatic       #61  <Field Class Long.TYPE>
	//   36   76:invokestatic    #37  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//   37   79:aload_0         
	//   38   80:invokestatic    #43  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   39   83:putstatic       #63  <Field BasicBeanDescription LONG_DESC>
	//   40   86:new             #2   <Class BasicClassIntrospector>
	//   41   89:dup             
	//   42   90:invokespecial   #66  <Method void BasicClassIntrospector()>
	//   43   93:putstatic       #68  <Field BasicClassIntrospector instance>
	//*  44   96:return          
	}
}
