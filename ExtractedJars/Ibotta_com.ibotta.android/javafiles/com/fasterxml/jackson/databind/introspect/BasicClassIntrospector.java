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
//			ClassIntrospector, AnnotatedClassResolver, BasicBeanDescription, POJOPropertiesCollector, 
//			AnnotatedClass

public class BasicClassIntrospector extends ClassIntrospector
	implements Serializable
{

	public BasicClassIntrospector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void ClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:new             #66  <Class LRUMap>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:bipush          64
	//    7   13:invokespecial   #69  <Method void LRUMap(int, int)>
	//    8   16:putfield        #71  <Field LRUMap _cachedFCA>
	//    9   19:return          
	}

	protected BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig mapperconfig, JavaType javatype)
	{
		if(_isStdJDKCollection(javatype))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #77  <Method boolean _isStdJDKCollection(JavaType)>
	//*   3    5:ifeq            21
			return BasicBeanDescription.forOtherUse(mapperconfig, javatype, _resolveAnnotatedClass(mapperconfig, javatype, ((ClassIntrospector.MixInResolver) (mapperconfig))));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #81  <Method AnnotatedClass _resolveAnnotatedClass(MapperConfig, JavaType, ClassIntrospector$MixInResolver)>
	//   11   17:invokestatic    #40  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   12   20:areturn         
		else
			return null;
	//   13   21:aconst_null     
	//   14   22:areturn         
	}

	protected BasicBeanDescription _findStdTypeDesc(JavaType javatype)
	{
		javatype = ((JavaType) (javatype.getRawClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #91  <Method Class JavaType.getRawClass()>
	//    2    4:astore_1        
		if(((Class) (javatype)).isPrimitive())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #97  <Method boolean Class.isPrimitive()>
	//*   5    9:ifeq            45
		{
			if(javatype == Boolean.TYPE)
	//*   6   12:aload_1         
	//*   7   13:getstatic       #48  <Field Class Boolean.TYPE>
	//*   8   16:if_acmpne       23
				return BOOLEAN_DESC;
	//    9   19:getstatic       #50  <Field BasicBeanDescription BOOLEAN_DESC>
	//   10   22:areturn         
			if(javatype == Integer.TYPE)
	//*  11   23:aload_1         
	//*  12   24:getstatic       #53  <Field Class Integer.TYPE>
	//*  13   27:if_acmpne       34
				return INT_DESC;
	//   14   30:getstatic       #55  <Field BasicBeanDescription INT_DESC>
	//   15   33:areturn         
			if(javatype == Long.TYPE)
	//*  16   34:aload_1         
	//*  17   35:getstatic       #58  <Field Class Long.TYPE>
	//*  18   38:if_acmpne       55
				return LONG_DESC;
	//   19   41:getstatic       #60  <Field BasicBeanDescription LONG_DESC>
	//   20   44:areturn         
		} else
		if(javatype == java/lang/String)
	//*  21   45:aload_1         
	//*  22   46:ldc1            #22  <Class String>
	//*  23   48:if_acmpne       55
			return STRING_DESC;
	//   24   51:getstatic       #42  <Field BasicBeanDescription STRING_DESC>
	//   25   54:areturn         
		return null;
	//   26   55:aconst_null     
	//   27   56:areturn         
	}

	protected boolean _isStdJDKCollection(JavaType javatype)
	{
		if(javatype.isContainerType())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #100 <Method boolean JavaType.isContainerType()>
	//*   2    4:ifeq            70
		{
			if(javatype.isArrayType())
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #103 <Method boolean JavaType.isArrayType()>
	//*   5   11:ifeq            16
				return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
			javatype = ((JavaType) (javatype.getRawClass()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #91  <Method Class JavaType.getRawClass()>
	//   10   20:astore_1        
			String s = ClassUtil.getPackageName(((Class) (javatype)));
	//   11   21:aload_1         
	//   12   22:invokestatic    #109 <Method String ClassUtil.getPackageName(Class)>
	//   13   25:astore_2        
			return s != null && (s.startsWith("java.lang") || s.startsWith("java.util")) && (((Class) (java/util/Collection)).isAssignableFrom(((Class) (javatype))) || ((Class) (java/util/Map)).isAssignableFrom(((Class) (javatype))));
	//   14   26:aload_2         
	//   15   27:ifnull          68
	//   16   30:aload_2         
	//   17   31:ldc1            #111 <String "java.lang">
	//   18   33:invokevirtual   #115 <Method boolean String.startsWith(String)>
	//   19   36:ifne            48
	//   20   39:aload_2         
	//   21   40:ldc1            #117 <String "java.util">
	//   22   42:invokevirtual   #115 <Method boolean String.startsWith(String)>
	//   23   45:ifeq            68
	//   24   48:ldc1            #119 <Class Collection>
	//   25   50:aload_1         
	//   26   51:invokevirtual   #123 <Method boolean Class.isAssignableFrom(Class)>
	//   27   54:ifne            66
	//   28   57:ldc1            #125 <Class Map>
	//   29   59:aload_1         
	//   30   60:invokevirtual   #123 <Method boolean Class.isAssignableFrom(Class)>
	//   31   63:ifeq            68
	//   32   66:iconst_1        
	//   33   67:ireturn         
	//   34   68:iconst_0        
	//   35   69:ireturn         
		} else
		{
			return false;
	//   36   70:iconst_0        
	//   37   71:ireturn         
		}
	}

	protected AnnotatedClass _resolveAnnotatedClass(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return AnnotatedClassResolver.resolve(mapperconfig, javatype, mixinresolver);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #128 <Method AnnotatedClass AnnotatedClassResolver.resolve(MapperConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    4    6:areturn         
	}

	protected POJOPropertiesCollector collectProperties(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver, boolean flag, String s)
	{
		return constructPropertyCollector(mapperconfig, _resolveAnnotatedClass(mapperconfig, javatype, mixinresolver), javatype, flag, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:aload_3         
	//    6    6:invokevirtual   #81  <Method AnnotatedClass _resolveAnnotatedClass(MapperConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    7    9:aload_2         
	//    8   10:iload           4
	//    9   12:aload           5
	//   10   14:invokevirtual   #135 <Method POJOPropertiesCollector constructPropertyCollector(MapperConfig, AnnotatedClass, JavaType, boolean, String)>
	//   11   17:areturn         
	}

	protected POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver, boolean flag)
	{
		AnnotatedClass annotatedclass = _resolveAnnotatedClass(mapperconfig, javatype, mixinresolver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #81  <Method AnnotatedClass _resolveAnnotatedClass(MapperConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:astore          7
		boolean flag1 = mapperconfig.isAnnotationProcessingEnabled();
	//    6    9:aload_1         
	//    7   10:invokevirtual   #143 <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//    8   13:istore          5
		Object obj = null;
	//    9   15:aconst_null     
	//   10   16:astore          6
		if(flag1)
	//*  11   18:iload           5
	//*  12   20:ifeq            31
			mixinresolver = ((ClassIntrospector.MixInResolver) (mapperconfig.getAnnotationIntrospector()));
	//   13   23:aload_1         
	//   14   24:invokevirtual   #147 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   15   27:astore_3        
		else
	//*  16   28:goto            33
			mixinresolver = null;
	//   17   31:aconst_null     
	//   18   32:astore_3        
		if(mixinresolver == null)
	//*  19   33:aload_3         
	//*  20   34:ifnonnull       43
			mixinresolver = ((ClassIntrospector.MixInResolver) (obj));
	//   21   37:aload           6
	//   22   39:astore_3        
		else
	//*  23   40:goto            50
			mixinresolver = ((ClassIntrospector.MixInResolver) (((AnnotationIntrospector) (mixinresolver)).findPOJOBuilderConfig(annotatedclass)));
	//   24   43:aload_3         
	//   25   44:aload           7
	//   26   46:invokevirtual   #153 <Method com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value AnnotationIntrospector.findPOJOBuilderConfig(AnnotatedClass)>
	//   27   49:astore_3        
		if(mixinresolver == null)
	//*  28   50:aload_3         
	//*  29   51:ifnonnull       60
			mixinresolver = "with";
	//   30   54:ldc1            #155 <String "with">
	//   31   56:astore_3        
		else
	//*  32   57:goto            65
			mixinresolver = ((ClassIntrospector.MixInResolver) (((com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value) (mixinresolver)).withPrefix));
	//   33   60:aload_3         
	//   34   61:getfield        #161 <Field String com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value.withPrefix>
	//   35   64:astore_3        
		return constructPropertyCollector(mapperconfig, annotatedclass, javatype, flag, ((String) (mixinresolver)));
	//   36   65:aload_0         
	//   37   66:aload_1         
	//   38   67:aload           7
	//   39   69:aload_2         
	//   40   70:iload           4
	//   41   72:aload_3         
	//   42   73:invokevirtual   #135 <Method POJOPropertiesCollector constructPropertyCollector(MapperConfig, AnnotatedClass, JavaType, boolean, String)>
	//   43   76:areturn         
	}

	protected POJOPropertiesCollector constructPropertyCollector(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype, boolean flag, String s)
	{
		return new POJOPropertiesCollector(mapperconfig, flag, javatype, annotatedclass, s);
	//    0    0:new             #164 <Class POJOPropertiesCollector>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload           4
	//    4    7:aload_3         
	//    5    8:aload_2         
	//    6    9:aload           5
	//    7   11:invokespecial   #167 <Method void POJOPropertiesCollector(MapperConfig, boolean, JavaType, AnnotatedClass, String)>
	//    8   14:areturn         
	}

	public volatile BeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return ((BeanDescription) (forClassAnnotations(mapperconfig, javatype, mixinresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #173 <Method BasicBeanDescription forClassAnnotations(MapperConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #175 <Method BasicBeanDescription _findStdTypeDesc(JavaType)>
	//    3    5:astore          5
		BasicBeanDescription basicbeandescription = basicbeandescription1;
	//    4    7:aload           5
	//    5    9:astore          4
		if(basicbeandescription1 == null)
	//*   6   11:aload           5
	//*   7   13:ifnonnull       63
		{
			BasicBeanDescription basicbeandescription2 = (BasicBeanDescription)_cachedFCA.get(((Object) (javatype)));
	//    8   16:aload_0         
	//    9   17:getfield        #71  <Field LRUMap _cachedFCA>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #179 <Method Object LRUMap.get(Object)>
	//   12   24:checkcast       #36  <Class BasicBeanDescription>
	//   13   27:astore          5
			basicbeandescription = basicbeandescription2;
	//   14   29:aload           5
	//   15   31:astore          4
			if(basicbeandescription2 == null)
	//*  16   33:aload           5
	//*  17   35:ifnonnull       63
			{
				basicbeandescription = BasicBeanDescription.forOtherUse(mapperconfig, javatype, _resolveAnnotatedClass(mapperconfig, javatype, mixinresolver));
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:aload_3         
	//   24   44:invokevirtual   #81  <Method AnnotatedClass _resolveAnnotatedClass(MapperConfig, JavaType, ClassIntrospector$MixInResolver)>
	//   25   47:invokestatic    #40  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   26   50:astore          4
				_cachedFCA.put(((Object) (javatype)), ((Object) (basicbeandescription)));
	//   27   52:aload_0         
	//   28   53:getfield        #71  <Field LRUMap _cachedFCA>
	//   29   56:aload_2         
	//   30   57:aload           4
	//   31   59:invokevirtual   #183 <Method Object LRUMap.put(Object, Object)>
	//   32   62:pop             
			}
		}
		return basicbeandescription;
	//   33   63:aload           4
	//   34   65:areturn         
	}

	public volatile BeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return ((BeanDescription) (forCreation(deserializationconfig, javatype, mixinresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #189 <Method BasicBeanDescription forCreation(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #175 <Method BasicBeanDescription _findStdTypeDesc(JavaType)>
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
	//   11   19:invokevirtual   #191 <Method BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig, JavaType)>
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
	//   22   38:ldc1            #193 <String "set">
	//   23   40:invokevirtual   #195 <Method POJOPropertiesCollector collectProperties(MapperConfig, JavaType, ClassIntrospector$MixInResolver, boolean, String)>
	//   24   43:invokestatic    #199 <Method BasicBeanDescription BasicBeanDescription.forDeserialization(POJOPropertiesCollector)>
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
	//    4    4:invokevirtual   #201 <Method BasicBeanDescription forDeserialization(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #175 <Method BasicBeanDescription _findStdTypeDesc(JavaType)>
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
	//   11   19:invokevirtual   #191 <Method BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig, JavaType)>
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
	//   22   38:ldc1            #193 <String "set">
	//   23   40:invokevirtual   #195 <Method POJOPropertiesCollector collectProperties(MapperConfig, JavaType, ClassIntrospector$MixInResolver, boolean, String)>
	//   24   43:invokestatic    #199 <Method BasicBeanDescription BasicBeanDescription.forDeserialization(POJOPropertiesCollector)>
	//   25   46:astore          4
			_cachedFCA.putIfAbsent(((Object) (javatype)), ((Object) (basicbeandescription)));
	//   26   48:aload_0         
	//   27   49:getfield        #71  <Field LRUMap _cachedFCA>
	//   28   52:aload_2         
	//   29   53:aload           4
	//   30   55:invokevirtual   #204 <Method Object LRUMap.putIfAbsent(Object, Object)>
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
	//    4    4:invokevirtual   #207 <Method BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig, JavaType, ClassIntrospector$MixInResolver)>
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
	//    5    5:invokevirtual   #209 <Method POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig, JavaType, ClassIntrospector$MixInResolver, boolean)>
	//    6    8:invokestatic    #199 <Method BasicBeanDescription BasicBeanDescription.forDeserialization(POJOPropertiesCollector)>
	//    7   11:astore_1        
		_cachedFCA.putIfAbsent(((Object) (javatype)), ((Object) (deserializationconfig)));
	//    8   12:aload_0         
	//    9   13:getfield        #71  <Field LRUMap _cachedFCA>
	//   10   16:aload_2         
	//   11   17:aload_1         
	//   12   18:invokevirtual   #204 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//   13   21:pop             
		return ((BasicBeanDescription) (deserializationconfig));
	//   14   22:aload_1         
	//   15   23:areturn         
	}

	public volatile BeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		return ((BeanDescription) (forSerialization(serializationconfig, javatype, mixinresolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #214 <Method BasicBeanDescription forSerialization(SerializationConfig, JavaType, ClassIntrospector$MixInResolver)>
	//    5    7:areturn         
	}

	public BasicBeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
	{
		BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #175 <Method BasicBeanDescription _findStdTypeDesc(JavaType)>
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
	//   11   19:invokevirtual   #191 <Method BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig, JavaType)>
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
	//   22   38:ldc1            #193 <String "set">
	//   23   40:invokevirtual   #195 <Method POJOPropertiesCollector collectProperties(MapperConfig, JavaType, ClassIntrospector$MixInResolver, boolean, String)>
	//   24   43:invokestatic    #216 <Method BasicBeanDescription BasicBeanDescription.forSerialization(POJOPropertiesCollector)>
	//   25   46:astore          4
			_cachedFCA.putIfAbsent(((Object) (javatype)), ((Object) (basicbeandescription)));
	//   26   48:aload_0         
	//   27   49:getfield        #71  <Field LRUMap _cachedFCA>
	//   28   52:aload_2         
	//   29   53:aload           4
	//   30   55:invokevirtual   #204 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//   31   58:pop             
		}
		return basicbeandescription;
	//   32   59:aload           4
	//   33   61:areturn         
	}

	protected static final BasicBeanDescription BOOLEAN_DESC;
	protected static final BasicBeanDescription INT_DESC;
	protected static final BasicBeanDescription LONG_DESC;
	protected static final BasicBeanDescription STRING_DESC = BasicBeanDescription.forOtherUse(((MapperConfig) (null)), ((JavaType) (SimpleType.constructUnsafe(java/lang/String))), AnnotatedClassResolver.createPrimordial(java/lang/String));
	private static final long serialVersionUID = 1L;
	protected final LRUMap _cachedFCA = new LRUMap(16, 64);

	static 
	{
	//    0    0:aconst_null     
	//    1    1:ldc1            #22  <Class String>
	//    2    3:invokestatic    #28  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//    3    6:ldc1            #22  <Class String>
	//    4    8:invokestatic    #34  <Method AnnotatedClass AnnotatedClassResolver.createPrimordial(Class)>
	//    5   11:invokestatic    #40  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//    6   14:putstatic       #42  <Field BasicBeanDescription STRING_DESC>
		BOOLEAN_DESC = BasicBeanDescription.forOtherUse(((MapperConfig) (null)), ((JavaType) (SimpleType.constructUnsafe(Boolean.TYPE))), AnnotatedClassResolver.createPrimordial(Boolean.TYPE));
	//    7   17:aconst_null     
	//    8   18:getstatic       #48  <Field Class Boolean.TYPE>
	//    9   21:invokestatic    #28  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//   10   24:getstatic       #48  <Field Class Boolean.TYPE>
	//   11   27:invokestatic    #34  <Method AnnotatedClass AnnotatedClassResolver.createPrimordial(Class)>
	//   12   30:invokestatic    #40  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   13   33:putstatic       #50  <Field BasicBeanDescription BOOLEAN_DESC>
		INT_DESC = BasicBeanDescription.forOtherUse(((MapperConfig) (null)), ((JavaType) (SimpleType.constructUnsafe(Integer.TYPE))), AnnotatedClassResolver.createPrimordial(Integer.TYPE));
	//   14   36:aconst_null     
	//   15   37:getstatic       #53  <Field Class Integer.TYPE>
	//   16   40:invokestatic    #28  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//   17   43:getstatic       #53  <Field Class Integer.TYPE>
	//   18   46:invokestatic    #34  <Method AnnotatedClass AnnotatedClassResolver.createPrimordial(Class)>
	//   19   49:invokestatic    #40  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   20   52:putstatic       #55  <Field BasicBeanDescription INT_DESC>
		LONG_DESC = BasicBeanDescription.forOtherUse(((MapperConfig) (null)), ((JavaType) (SimpleType.constructUnsafe(Long.TYPE))), AnnotatedClassResolver.createPrimordial(Long.TYPE));
	//   21   55:aconst_null     
	//   22   56:getstatic       #58  <Field Class Long.TYPE>
	//   23   59:invokestatic    #28  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//   24   62:getstatic       #58  <Field Class Long.TYPE>
	//   25   65:invokestatic    #34  <Method AnnotatedClass AnnotatedClassResolver.createPrimordial(Class)>
	//   26   68:invokestatic    #40  <Method BasicBeanDescription BasicBeanDescription.forOtherUse(MapperConfig, JavaType, AnnotatedClass)>
	//   27   71:putstatic       #60  <Field BasicBeanDescription LONG_DESC>
	//*  28   74:return          
	}
}
