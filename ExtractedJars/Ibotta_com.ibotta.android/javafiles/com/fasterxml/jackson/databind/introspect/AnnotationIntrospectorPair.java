// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedClass, VisibilityChecker, Annotated, AnnotatedMember, 
//			ObjectIdInfo, AnnotatedMethod

public class AnnotationIntrospectorPair extends AnnotationIntrospector
	implements Serializable
{

	public AnnotationIntrospectorPair(AnnotationIntrospector annotationintrospector, AnnotationIntrospector annotationintrospector1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void AnnotationIntrospector()>
		_primary = annotationintrospector;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field AnnotationIntrospector _primary>
		_secondary = annotationintrospector1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field AnnotationIntrospector _secondary>
	//    8   14:return          
	}

	public static AnnotationIntrospector create(AnnotationIntrospector annotationintrospector, AnnotationIntrospector annotationintrospector1)
	{
		if(annotationintrospector == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return annotationintrospector1;
	//    2    4:aload_1         
	//    3    5:areturn         
		if(annotationintrospector1 == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return annotationintrospector;
	//    6   10:aload_0         
	//    7   11:areturn         
		else
			return ((AnnotationIntrospector) (new AnnotationIntrospectorPair(annotationintrospector, annotationintrospector1)));
	//    8   12:new             #2   <Class AnnotationIntrospectorPair>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:invokespecial   #27  <Method void AnnotationIntrospectorPair(AnnotationIntrospector, AnnotationIntrospector)>
	//   13   21:areturn         
	}

	protected Object _explicitClassOrOb(Object obj, Class class1)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          32
		{
			if(obj == class1)
	//*   2    4:aload_1         
	//*   3    5:aload_2         
	//*   4    6:if_acmpne       11
				return ((Object) (null));
	//    5    9:aconst_null     
	//    6   10:areturn         
			if((obj instanceof Class) && ClassUtil.isBogusClass((Class)obj))
	//*   7   11:aload_1         
	//*   8   12:instanceof      #31  <Class Class>
	//*   9   15:ifeq            30
	//*  10   18:aload_1         
	//*  11   19:checkcast       #31  <Class Class>
	//*  12   22:invokestatic    #37  <Method boolean ClassUtil.isBogusClass(Class)>
	//*  13   25:ifeq            30
				return ((Object) (null));
	//   14   28:aconst_null     
	//   15   29:areturn         
			else
				return obj;
	//   16   30:aload_1         
	//   17   31:areturn         
		} else
		{
			return ((Object) (null));
	//   18   32:aconst_null     
	//   19   33:areturn         
		}
	}

	protected boolean _isExplicitClassOrOb(Object obj, Class class1)
	{
		if(obj != null && obj != class1)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
	//*   2    4:aload_1         
	//*   3    5:aload_2         
	//*   4    6:if_acmpne       12
	//*   5    9:goto            31
		{
			if(obj instanceof Class)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #31  <Class Class>
	//*   8   16:ifeq            29
				return ClassUtil.isBogusClass((Class)obj) ^ true;
	//    9   19:aload_1         
	//   10   20:checkcast       #31  <Class Class>
	//   11   23:invokestatic    #37  <Method boolean ClassUtil.isBogusClass(Class)>
	//   12   26:iconst_1        
	//   13   27:ixor            
	//   14   28:ireturn         
			else
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		} else
		{
			return false;
	//   17   31:iconst_0        
	//   18   32:ireturn         
		}
	}

	public void findAndAddVirtualProperties(MapperConfig mapperconfig, AnnotatedClass annotatedclass, List list)
	{
		_primary.findAndAddVirtualProperties(mapperconfig, annotatedclass, list);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #46  <Method void AnnotationIntrospector.findAndAddVirtualProperties(MapperConfig, AnnotatedClass, List)>
		_secondary.findAndAddVirtualProperties(mapperconfig, annotatedclass, list);
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #46  <Method void AnnotationIntrospector.findAndAddVirtualProperties(MapperConfig, AnnotatedClass, List)>
	//   12   20:return          
	}

	public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
	{
		visibilitychecker = _secondary.findAutoDetectVisibility(annotatedclass, visibilitychecker);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #51  <Method VisibilityChecker AnnotationIntrospector.findAutoDetectVisibility(AnnotatedClass, VisibilityChecker)>
	//    5    9:astore_2        
		return _primary.findAutoDetectVisibility(annotatedclass, visibilitychecker);
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field AnnotationIntrospector _primary>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #51  <Method VisibilityChecker AnnotationIntrospector.findAutoDetectVisibility(AnnotatedClass, VisibilityChecker)>
	//   11   19:areturn         
	}

	public Object findContentDeserializer(Annotated annotated)
	{
		Object obj = _primary.findContentDeserializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method Object AnnotationIntrospector.findContentDeserializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonDeserializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #58  <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//*   8   13:invokevirtual   #60  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _explicitClassOrOb(_secondary.findContentDeserializer(annotated), com/fasterxml/jackson/databind/JsonDeserializer$None);
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   15   26:aload_1         
	//   16   27:invokevirtual   #56  <Method Object AnnotationIntrospector.findContentDeserializer(Annotated)>
	//   17   30:ldc1            #58  <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//   18   32:invokevirtual   #62  <Method Object _explicitClassOrOb(Object, Class)>
	//   19   35:areturn         
	}

	public Object findContentSerializer(Annotated annotated)
	{
		Object obj = _primary.findContentSerializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #65  <Method Object AnnotationIntrospector.findContentSerializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonSerializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #67  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*   8   13:invokevirtual   #60  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _explicitClassOrOb(_secondary.findContentSerializer(annotated), com/fasterxml/jackson/databind/JsonSerializer$None);
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   15   26:aload_1         
	//   16   27:invokevirtual   #65  <Method Object AnnotationIntrospector.findContentSerializer(Annotated)>
	//   17   30:ldc1            #67  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//   18   32:invokevirtual   #62  <Method Object _explicitClassOrOb(Object, Class)>
	//   19   35:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorAnnotation(MapperConfig mapperconfig, Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonCreator.Mode mode1 = _primary.findCreatorAnnotation(mapperconfig, annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #71  <Method com.fasterxml.jackson.annotation.JsonCreator$Mode AnnotationIntrospector.findCreatorAnnotation(MapperConfig, Annotated)>
	//    5    9:astore          4
		com.fasterxml.jackson.annotation.JsonCreator.Mode mode = mode1;
	//    6   11:aload           4
	//    7   13:astore_3        
		if(mode1 == null)
	//*   8   14:aload           4
	//*   9   16:ifnonnull       29
			mode = _secondary.findCreatorAnnotation(mapperconfig, annotated);
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #71  <Method com.fasterxml.jackson.annotation.JsonCreator$Mode AnnotationIntrospector.findCreatorAnnotation(MapperConfig, Annotated)>
	//   15   28:astore_3        
		return mode;
	//   16   29:aload_3         
	//   17   30:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorBinding(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonCreator.Mode mode = _primary.findCreatorBinding(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method com.fasterxml.jackson.annotation.JsonCreator$Mode AnnotationIntrospector.findCreatorBinding(Annotated)>
	//    4    8:astore_2        
		if(mode != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          15
			return mode;
	//    7   13:aload_2         
	//    8   14:areturn         
		else
			return _secondary.findCreatorBinding(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #77  <Method com.fasterxml.jackson.annotation.JsonCreator$Mode AnnotationIntrospector.findCreatorBinding(Annotated)>
	//   13   23:areturn         
	}

	public Enum findDefaultEnumValue(Class class1)
	{
		Enum enum1 = _primary.findDefaultEnumValue(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #82  <Method Enum AnnotationIntrospector.findDefaultEnumValue(Class)>
	//    4    8:astore_3        
		Enum enum = enum1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(enum1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			enum = _secondary.findDefaultEnumValue(class1);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #82  <Method Enum AnnotationIntrospector.findDefaultEnumValue(Class)>
	//   13   23:astore_2        
		return enum;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findDeserializationContentConverter(AnnotatedMember annotatedmember)
	{
		Object obj1 = _primary.findDeserializationContentConverter(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method Object AnnotationIntrospector.findDeserializationContentConverter(AnnotatedMember)>
	//    4    8:astore_3        
		Object obj = obj1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(obj1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			obj = _secondary.findDeserializationContentConverter(annotatedmember);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #87  <Method Object AnnotationIntrospector.findDeserializationContentConverter(AnnotatedMember)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findDeserializationConverter(Annotated annotated)
	{
		Object obj1 = _primary.findDeserializationConverter(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #90  <Method Object AnnotationIntrospector.findDeserializationConverter(Annotated)>
	//    4    8:astore_3        
		Object obj = obj1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(obj1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			obj = _secondary.findDeserializationConverter(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #90  <Method Object AnnotationIntrospector.findDeserializationConverter(Annotated)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findDeserializer(Annotated annotated)
	{
		Object obj = _primary.findDeserializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #93  <Method Object AnnotationIntrospector.findDeserializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonDeserializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #58  <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//*   8   13:invokevirtual   #60  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _explicitClassOrOb(_secondary.findDeserializer(annotated), com/fasterxml/jackson/databind/JsonDeserializer$None);
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   15   26:aload_1         
	//   16   27:invokevirtual   #93  <Method Object AnnotationIntrospector.findDeserializer(Annotated)>
	//   17   30:ldc1            #58  <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//   18   32:invokevirtual   #62  <Method Object _explicitClassOrOb(Object, Class)>
	//   19   35:areturn         
	}

	public String[] findEnumValues(Class class1, Enum aenum[], String as[])
	{
		as = _secondary.findEnumValues(class1, aenum, as);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #97  <Method String[] AnnotationIntrospector.findEnumValues(Class, Enum[], String[])>
	//    6   10:astore_3        
		return _primary.findEnumValues(class1, aenum, as);
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field AnnotationIntrospector _primary>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #97  <Method String[] AnnotationIntrospector.findEnumValues(Class, Enum[], String[])>
	//   13   21:areturn         
	}

	public Object findFilterId(Annotated annotated)
	{
		Object obj1 = _primary.findFilterId(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method Object AnnotationIntrospector.findFilterId(Annotated)>
	//    4    8:astore_3        
		Object obj = obj1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(obj1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			obj = _secondary.findFilterId(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #101 <Method Object AnnotationIntrospector.findFilterId(Annotated)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findFormat(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonFormat.Value value = _primary.findFormat(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #105 <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
	//    4    8:astore_2        
		annotated = ((Annotated) (_secondary.findFormat(annotated)));
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #105 <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
	//    9   17:astore_1        
		if(annotated == null)
	//*  10   18:aload_1         
	//*  11   19:ifnonnull       24
			return value;
	//   12   22:aload_2         
	//   13   23:areturn         
		else
			return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (annotated)).withOverrides(value);
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #111 <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.withOverrides(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   17   29:areturn         
	}

	public String findImplicitPropertyName(AnnotatedMember annotatedmember)
	{
		String s1 = _primary.findImplicitPropertyName(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//    4    8:astore_3        
		String s = s1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(s1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			s = _secondary.findImplicitPropertyName(annotatedmember);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #115 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//   13   23:astore_2        
		return s;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public com.fasterxml.jackson.annotation.JacksonInject.Value findInjectableValue(AnnotatedMember annotatedmember)
	{
		com.fasterxml.jackson.annotation.JacksonInject.Value value1 = _primary.findInjectableValue(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method com.fasterxml.jackson.annotation.JacksonInject$Value AnnotationIntrospector.findInjectableValue(AnnotatedMember)>
	//    4    8:astore_3        
		com.fasterxml.jackson.annotation.JacksonInject.Value value = value1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(value1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			value = _secondary.findInjectableValue(annotatedmember);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #119 <Method com.fasterxml.jackson.annotation.JacksonInject$Value AnnotationIntrospector.findInjectableValue(AnnotatedMember)>
	//   13   23:astore_2        
		return value;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findInjectableValueId(AnnotatedMember annotatedmember)
	{
		Object obj1 = _primary.findInjectableValueId(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #122 <Method Object AnnotationIntrospector.findInjectableValueId(AnnotatedMember)>
	//    4    8:astore_3        
		Object obj = obj1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(obj1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			obj = _secondary.findInjectableValueId(annotatedmember);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #122 <Method Object AnnotationIntrospector.findInjectableValueId(AnnotatedMember)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findKeyDeserializer(Annotated annotated)
	{
		Object obj = _primary.findKeyDeserializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #125 <Method Object AnnotationIntrospector.findKeyDeserializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/KeyDeserializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #127 <Class com.fasterxml.jackson.databind.KeyDeserializer$None>
	//*   8   13:invokevirtual   #60  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _explicitClassOrOb(_secondary.findKeyDeserializer(annotated), com/fasterxml/jackson/databind/KeyDeserializer$None);
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   15   26:aload_1         
	//   16   27:invokevirtual   #125 <Method Object AnnotationIntrospector.findKeyDeserializer(Annotated)>
	//   17   30:ldc1            #127 <Class com.fasterxml.jackson.databind.KeyDeserializer$None>
	//   18   32:invokevirtual   #62  <Method Object _explicitClassOrOb(Object, Class)>
	//   19   35:areturn         
	}

	public Object findKeySerializer(Annotated annotated)
	{
		Object obj = _primary.findKeySerializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method Object AnnotationIntrospector.findKeySerializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonSerializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #67  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*   8   13:invokevirtual   #60  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _explicitClassOrOb(_secondary.findKeySerializer(annotated), com/fasterxml/jackson/databind/JsonSerializer$None);
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   15   26:aload_1         
	//   16   27:invokevirtual   #130 <Method Object AnnotationIntrospector.findKeySerializer(Annotated)>
	//   17   30:ldc1            #67  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//   18   32:invokevirtual   #62  <Method Object _explicitClassOrOb(Object, Class)>
	//   19   35:areturn         
	}

	public Boolean findMergeInfo(Annotated annotated)
	{
		Boolean boolean2 = _primary.findMergeInfo(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #134 <Method Boolean AnnotationIntrospector.findMergeInfo(Annotated)>
	//    4    8:astore_3        
		Boolean boolean1 = boolean2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(boolean2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			boolean1 = _secondary.findMergeInfo(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #134 <Method Boolean AnnotationIntrospector.findMergeInfo(Annotated)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public PropertyName findNameForDeserialization(Annotated annotated)
	{
		PropertyName propertyname = _primary.findNameForDeserialization(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #138 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//    4    8:astore_3        
		if(propertyname == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       22
			return _secondary.findNameForDeserialization(annotated);
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #138 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//   11   21:areturn         
		Object obj = ((Object) (propertyname));
	//   12   22:aload_3         
	//   13   23:astore_2        
		if(propertyname == PropertyName.USE_DEFAULT)
	//*  14   24:aload_3         
	//*  15   25:getstatic       #144 <Field PropertyName PropertyName.USE_DEFAULT>
	//*  16   28:if_acmpne       48
		{
			annotated = ((Annotated) (_secondary.findNameForDeserialization(annotated)));
	//   17   31:aload_0         
	//   18   32:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #138 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//   21   39:astore_1        
			obj = ((Object) (propertyname));
	//   22   40:aload_3         
	//   23   41:astore_2        
			if(annotated != null)
	//*  24   42:aload_1         
	//*  25   43:ifnull          48
				obj = ((Object) (annotated));
	//   26   46:aload_1         
	//   27   47:astore_2        
		}
		return ((PropertyName) (obj));
	//   28   48:aload_2         
	//   29   49:areturn         
	}

	public PropertyName findNameForSerialization(Annotated annotated)
	{
		PropertyName propertyname = _primary.findNameForSerialization(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//    4    8:astore_3        
		if(propertyname == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       22
			return _secondary.findNameForSerialization(annotated);
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #147 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//   11   21:areturn         
		Object obj = ((Object) (propertyname));
	//   12   22:aload_3         
	//   13   23:astore_2        
		if(propertyname == PropertyName.USE_DEFAULT)
	//*  14   24:aload_3         
	//*  15   25:getstatic       #144 <Field PropertyName PropertyName.USE_DEFAULT>
	//*  16   28:if_acmpne       48
		{
			annotated = ((Annotated) (_secondary.findNameForSerialization(annotated)));
	//   17   31:aload_0         
	//   18   32:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #147 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//   21   39:astore_1        
			obj = ((Object) (propertyname));
	//   22   40:aload_3         
	//   23   41:astore_2        
			if(annotated != null)
	//*  24   42:aload_1         
	//*  25   43:ifnull          48
				obj = ((Object) (annotated));
	//   26   46:aload_1         
	//   27   47:astore_2        
		}
		return ((PropertyName) (obj));
	//   28   48:aload_2         
	//   29   49:areturn         
	}

	public Object findNamingStrategy(AnnotatedClass annotatedclass)
	{
		Object obj1 = _primary.findNamingStrategy(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #151 <Method Object AnnotationIntrospector.findNamingStrategy(AnnotatedClass)>
	//    4    8:astore_3        
		Object obj = obj1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(obj1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			obj = _secondary.findNamingStrategy(annotatedclass);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #151 <Method Object AnnotationIntrospector.findNamingStrategy(AnnotatedClass)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findNullSerializer(Annotated annotated)
	{
		Object obj = _primary.findNullSerializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #154 <Method Object AnnotationIntrospector.findNullSerializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonSerializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #67  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*   8   13:invokevirtual   #60  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _explicitClassOrOb(_secondary.findNullSerializer(annotated), com/fasterxml/jackson/databind/JsonSerializer$None);
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   15   26:aload_1         
	//   16   27:invokevirtual   #154 <Method Object AnnotationIntrospector.findNullSerializer(Annotated)>
	//   17   30:ldc1            #67  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//   18   32:invokevirtual   #62  <Method Object _explicitClassOrOb(Object, Class)>
	//   19   35:areturn         
	}

	public ObjectIdInfo findObjectIdInfo(Annotated annotated)
	{
		ObjectIdInfo objectidinfo1 = _primary.findObjectIdInfo(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(Annotated)>
	//    4    8:astore_3        
		ObjectIdInfo objectidinfo = objectidinfo1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(objectidinfo1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			objectidinfo = _secondary.findObjectIdInfo(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #158 <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(Annotated)>
	//   13   23:astore_2        
		return objectidinfo;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectidinfo)
	{
		objectidinfo = _secondary.findObjectReferenceInfo(annotated, objectidinfo);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #162 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(Annotated, ObjectIdInfo)>
	//    5    9:astore_2        
		return _primary.findObjectReferenceInfo(annotated, objectidinfo);
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field AnnotationIntrospector _primary>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #162 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(Annotated, ObjectIdInfo)>
	//   11   19:areturn         
	}

	public Class findPOJOBuilder(AnnotatedClass annotatedclass)
	{
		Class class2 = _primary.findPOJOBuilder(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #166 <Method Class AnnotationIntrospector.findPOJOBuilder(AnnotatedClass)>
	//    4    8:astore_3        
		Class class1 = class2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(class2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			class1 = _secondary.findPOJOBuilder(annotatedclass);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #166 <Method Class AnnotationIntrospector.findPOJOBuilder(AnnotatedClass)>
	//   13   23:astore_2        
		return class1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedclass)
	{
		com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value1 = _primary.findPOJOBuilderConfig(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #171 <Method com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value AnnotationIntrospector.findPOJOBuilderConfig(AnnotatedClass)>
	//    4    8:astore_3        
		com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value = value1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(value1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			value = _secondary.findPOJOBuilderConfig(annotatedclass);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #171 <Method com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value AnnotationIntrospector.findPOJOBuilderConfig(AnnotatedClass)>
	//   13   23:astore_2        
		return value;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonProperty.Access findPropertyAccess(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonProperty.Access access = _primary.findPropertyAccess(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #175 <Method com.fasterxml.jackson.annotation.JsonProperty$Access AnnotationIntrospector.findPropertyAccess(Annotated)>
	//    4    8:astore_2        
		if(access != null && access != com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO)
	//*   5    9:aload_2         
	//*   6   10:ifnull          22
	//*   7   13:aload_2         
	//*   8   14:getstatic       #181 <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.AUTO>
	//*   9   17:if_acmpeq       22
			return access;
	//   10   20:aload_2         
	//   11   21:areturn         
		annotated = ((Annotated) (_secondary.findPropertyAccess(annotated)));
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #175 <Method com.fasterxml.jackson.annotation.JsonProperty$Access AnnotationIntrospector.findPropertyAccess(Annotated)>
	//   16   30:astore_1        
		if(annotated != null)
	//*  17   31:aload_1         
	//*  18   32:ifnull          37
			return ((com.fasterxml.jackson.annotation.JsonProperty.Access) (annotated));
	//   19   35:aload_1         
	//   20   36:areturn         
		else
			return com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO;
	//   21   37:getstatic       #181 <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.AUTO>
	//   22   40:areturn         
	}

	public List findPropertyAliases(Annotated annotated)
	{
		List list1 = _primary.findPropertyAliases(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #185 <Method List AnnotationIntrospector.findPropertyAliases(Annotated)>
	//    4    8:astore_3        
		List list = list1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(list1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			list = _secondary.findPropertyAliases(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #185 <Method List AnnotationIntrospector.findPropertyAliases(Annotated)>
	//   13   23:astore_2        
		return list;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		TypeResolverBuilder typeresolverbuilder1 = _primary.findPropertyContentTypeResolver(mapperconfig, annotatedmember, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #190 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyContentTypeResolver(MapperConfig, AnnotatedMember, JavaType)>
	//    6   10:astore          5
		TypeResolverBuilder typeresolverbuilder = typeresolverbuilder1;
	//    7   12:aload           5
	//    8   14:astore          4
		if(typeresolverbuilder1 == null)
	//*   9   16:aload           5
	//*  10   18:ifnonnull       33
			typeresolverbuilder = _secondary.findPropertyContentTypeResolver(mapperconfig, annotatedmember, javatype);
	//   11   21:aload_0         
	//   12   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #190 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyContentTypeResolver(MapperConfig, AnnotatedMember, JavaType)>
	//   17   31:astore          4
		return typeresolverbuilder;
	//   18   33:aload           4
	//   19   35:areturn         
	}

	public String findPropertyDefaultValue(Annotated annotated)
	{
		String s;
label0:
		{
			String s1 = _primary.findPropertyDefaultValue(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #195 <Method String AnnotationIntrospector.findPropertyDefaultValue(Annotated)>
	//    4    8:astore_3        
			if(s1 != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          22
			{
				s = s1;
	//    7   13:aload_3         
	//    8   14:astore_2        
				if(!s1.isEmpty())
					break label0;
	//    9   15:aload_3         
	//   10   16:invokevirtual   #201 <Method boolean String.isEmpty()>
	//   11   19:ifeq            31
			}
			s = _secondary.findPropertyDefaultValue(annotated);
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #195 <Method String AnnotationIntrospector.findPropertyDefaultValue(Annotated)>
	//   16   30:astore_2        
		}
		return s;
	//   17   31:aload_2         
	//   18   32:areturn         
	}

	public String findPropertyDescription(Annotated annotated)
	{
		String s1 = _primary.findPropertyDescription(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #204 <Method String AnnotationIntrospector.findPropertyDescription(Annotated)>
	//    4    8:astore_3        
		String s = s1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(s1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			s = _secondary.findPropertyDescription(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #204 <Method String AnnotationIntrospector.findPropertyDescription(Annotated)>
	//   13   23:astore_2        
		return s;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value value = _secondary.findPropertyIgnorals(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #208 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value AnnotationIntrospector.findPropertyIgnorals(Annotated)>
	//    4    8:astore_2        
		annotated = ((Annotated) (_primary.findPropertyIgnorals(annotated)));
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field AnnotationIntrospector _primary>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #208 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value AnnotationIntrospector.findPropertyIgnorals(Annotated)>
	//    9   17:astore_1        
		if(value == null)
	//*  10   18:aload_2         
	//*  11   19:ifnonnull       24
			return ((com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value) (annotated));
	//   12   22:aload_1         
	//   13   23:areturn         
		else
			return value.withOverrides(((com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value) (annotated)));
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #213 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value.withOverrides(com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value)>
	//   17   29:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonInclude.Value value = _secondary.findPropertyInclusion(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #217 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
	//    4    8:astore_2        
		annotated = ((Annotated) (_primary.findPropertyInclusion(annotated)));
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field AnnotationIntrospector _primary>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #217 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
	//    9   17:astore_1        
		if(value == null)
	//*  10   18:aload_2         
	//*  11   19:ifnonnull       24
			return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (annotated));
	//   12   22:aload_1         
	//   13   23:areturn         
		else
			return value.withOverrides(((com.fasterxml.jackson.annotation.JsonInclude.Value) (annotated)));
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #222 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   17   29:areturn         
	}

	public Integer findPropertyIndex(Annotated annotated)
	{
		Integer integer1 = _primary.findPropertyIndex(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #226 <Method Integer AnnotationIntrospector.findPropertyIndex(Annotated)>
	//    4    8:astore_3        
		Integer integer = integer1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(integer1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			integer = _secondary.findPropertyIndex(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #226 <Method Integer AnnotationIntrospector.findPropertyIndex(Annotated)>
	//   13   23:astore_2        
		return integer;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		TypeResolverBuilder typeresolverbuilder1 = _primary.findPropertyTypeResolver(mapperconfig, annotatedmember, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #229 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyTypeResolver(MapperConfig, AnnotatedMember, JavaType)>
	//    6   10:astore          5
		TypeResolverBuilder typeresolverbuilder = typeresolverbuilder1;
	//    7   12:aload           5
	//    8   14:astore          4
		if(typeresolverbuilder1 == null)
	//*   9   16:aload           5
	//*  10   18:ifnonnull       33
			typeresolverbuilder = _secondary.findPropertyTypeResolver(mapperconfig, annotatedmember, javatype);
	//   11   21:aload_0         
	//   12   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #229 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyTypeResolver(MapperConfig, AnnotatedMember, JavaType)>
	//   17   31:astore          4
		return typeresolverbuilder;
	//   18   33:aload           4
	//   19   35:areturn         
	}

	public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
	{
		com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceproperty1 = _primary.findReferenceType(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #233 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty AnnotationIntrospector.findReferenceType(AnnotatedMember)>
	//    4    8:astore_3        
		com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceproperty = referenceproperty1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(referenceproperty1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			referenceproperty = _secondary.findReferenceType(annotatedmember);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #233 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty AnnotationIntrospector.findReferenceType(AnnotatedMember)>
	//   13   23:astore_2        
		return referenceproperty;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public PropertyName findRootName(AnnotatedClass annotatedclass)
	{
		PropertyName propertyname = _primary.findRootName(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #237 <Method PropertyName AnnotationIntrospector.findRootName(AnnotatedClass)>
	//    4    8:astore_2        
		if(propertyname == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       22
			return _secondary.findRootName(annotatedclass);
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #237 <Method PropertyName AnnotationIntrospector.findRootName(AnnotatedClass)>
	//   11   21:areturn         
		if(propertyname.hasSimpleName())
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #240 <Method boolean PropertyName.hasSimpleName()>
	//*  14   26:ifeq            31
			return propertyname;
	//   15   29:aload_2         
	//   16   30:areturn         
		PropertyName propertyname1 = _secondary.findRootName(annotatedclass);
	//   17   31:aload_0         
	//   18   32:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #237 <Method PropertyName AnnotationIntrospector.findRootName(AnnotatedClass)>
	//   21   39:astore_3        
		annotatedclass = ((AnnotatedClass) (propertyname1));
	//   22   40:aload_3         
	//   23   41:astore_1        
		if(propertyname1 == null)
	//*  24   42:aload_3         
	//*  25   43:ifnonnull       48
			annotatedclass = ((AnnotatedClass) (propertyname));
	//   26   46:aload_2         
	//   27   47:astore_1        
		return ((PropertyName) (annotatedclass));
	//   28   48:aload_1         
	//   29   49:areturn         
	}

	public Object findSerializationContentConverter(AnnotatedMember annotatedmember)
	{
		Object obj1 = _primary.findSerializationContentConverter(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #243 <Method Object AnnotationIntrospector.findSerializationContentConverter(AnnotatedMember)>
	//    4    8:astore_3        
		Object obj = obj1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(obj1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			obj = _secondary.findSerializationContentConverter(annotatedmember);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #243 <Method Object AnnotationIntrospector.findSerializationContentConverter(AnnotatedMember)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findSerializationConverter(Annotated annotated)
	{
		Object obj1 = _primary.findSerializationConverter(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #246 <Method Object AnnotationIntrospector.findSerializationConverter(Annotated)>
	//    4    8:astore_3        
		Object obj = obj1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(obj1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			obj = _secondary.findSerializationConverter(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #246 <Method Object AnnotationIntrospector.findSerializationConverter(Annotated)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
	{
		String as1[] = _primary.findSerializationPropertyOrder(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #250 <Method String[] AnnotationIntrospector.findSerializationPropertyOrder(AnnotatedClass)>
	//    4    8:astore_3        
		String as[] = as1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(as1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			as = _secondary.findSerializationPropertyOrder(annotatedclass);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #250 <Method String[] AnnotationIntrospector.findSerializationPropertyOrder(AnnotatedClass)>
	//   13   23:astore_2        
		return as;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Boolean findSerializationSortAlphabetically(Annotated annotated)
	{
		Boolean boolean2 = _primary.findSerializationSortAlphabetically(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #253 <Method Boolean AnnotationIntrospector.findSerializationSortAlphabetically(Annotated)>
	//    4    8:astore_3        
		Boolean boolean1 = boolean2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(boolean2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			boolean1 = _secondary.findSerializationSortAlphabetically(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #253 <Method Boolean AnnotationIntrospector.findSerializationSortAlphabetically(Annotated)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
	{
		com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing1 = _primary.findSerializationTyping(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #257 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(Annotated)>
	//    4    8:astore_3        
		com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing = typing1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(typing1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			typing = _secondary.findSerializationTyping(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #257 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(Annotated)>
	//   13   23:astore_2        
		return typing;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findSerializer(Annotated annotated)
	{
		Object obj = _primary.findSerializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #260 <Method Object AnnotationIntrospector.findSerializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonSerializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #67  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*   8   13:invokevirtual   #60  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _explicitClassOrOb(_secondary.findSerializer(annotated), com/fasterxml/jackson/databind/JsonSerializer$None);
	//   12   21:aload_0         
	//   13   22:aload_0         
	//   14   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   15   26:aload_1         
	//   16   27:invokevirtual   #260 <Method Object AnnotationIntrospector.findSerializer(Annotated)>
	//   17   30:ldc1            #67  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//   18   32:invokevirtual   #62  <Method Object _explicitClassOrOb(Object, Class)>
	//   19   35:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonSetter.Value findSetterInfo(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonSetter.Value value = _secondary.findSetterInfo(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #264 <Method com.fasterxml.jackson.annotation.JsonSetter$Value AnnotationIntrospector.findSetterInfo(Annotated)>
	//    4    8:astore_2        
		annotated = ((Annotated) (_primary.findSetterInfo(annotated)));
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field AnnotationIntrospector _primary>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #264 <Method com.fasterxml.jackson.annotation.JsonSetter$Value AnnotationIntrospector.findSetterInfo(Annotated)>
	//    9   17:astore_1        
		if(value == null)
	//*  10   18:aload_2         
	//*  11   19:ifnonnull       24
			return ((com.fasterxml.jackson.annotation.JsonSetter.Value) (annotated));
	//   12   22:aload_1         
	//   13   23:areturn         
		else
			return value.withOverrides(((com.fasterxml.jackson.annotation.JsonSetter.Value) (annotated)));
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #269 <Method com.fasterxml.jackson.annotation.JsonSetter$Value com.fasterxml.jackson.annotation.JsonSetter$Value.withOverrides(com.fasterxml.jackson.annotation.JsonSetter$Value)>
	//   17   29:areturn         
	}

	public List findSubtypes(Annotated annotated)
	{
		List list = _primary.findSubtypes(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #272 <Method List AnnotationIntrospector.findSubtypes(Annotated)>
	//    4    8:astore_2        
		annotated = ((Annotated) (_secondary.findSubtypes(annotated)));
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #272 <Method List AnnotationIntrospector.findSubtypes(Annotated)>
	//    9   17:astore_1        
		if(list != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          85
		{
			if(list.isEmpty())
	//*  12   22:aload_2         
	//*  13   23:invokeinterface #275 <Method boolean List.isEmpty()>
	//*  14   28:ifeq            33
				return ((List) (annotated));
	//   15   31:aload_1         
	//   16   32:areturn         
			if(annotated != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          83
			{
				if(((List) (annotated)).isEmpty())
	//*  19   37:aload_1         
	//*  20   38:invokeinterface #275 <Method boolean List.isEmpty()>
	//*  21   43:ifeq            48
				{
					return list;
	//   22   46:aload_2         
	//   23   47:areturn         
				} else
				{
					ArrayList arraylist = new ArrayList(list.size() + ((List) (annotated)).size());
	//   24   48:new             #277 <Class ArrayList>
	//   25   51:dup             
	//   26   52:aload_2         
	//   27   53:invokeinterface #281 <Method int List.size()>
	//   28   58:aload_1         
	//   29   59:invokeinterface #281 <Method int List.size()>
	//   30   64:iadd            
	//   31   65:invokespecial   #284 <Method void ArrayList(int)>
	//   32   68:astore_3        
					arraylist.addAll(((java.util.Collection) (list)));
	//   33   69:aload_3         
	//   34   70:aload_2         
	//   35   71:invokevirtual   #288 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   36   74:pop             
					arraylist.addAll(((java.util.Collection) (annotated)));
	//   37   75:aload_3         
	//   38   76:aload_1         
	//   39   77:invokevirtual   #288 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   40   80:pop             
					return ((List) (arraylist));
	//   41   81:aload_3         
	//   42   82:areturn         
				}
			} else
			{
				return list;
	//   43   83:aload_2         
	//   44   84:areturn         
			}
		} else
		{
			return ((List) (annotated));
	//   45   85:aload_1         
	//   46   86:areturn         
		}
	}

	public String findTypeName(AnnotatedClass annotatedclass)
	{
		String s;
label0:
		{
			String s1 = _primary.findTypeName(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #293 <Method String AnnotationIntrospector.findTypeName(AnnotatedClass)>
	//    4    8:astore_3        
			if(s1 != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          22
			{
				s = s1;
	//    7   13:aload_3         
	//    8   14:astore_2        
				if(s1.length() != 0)
					break label0;
	//    9   15:aload_3         
	//   10   16:invokevirtual   #296 <Method int String.length()>
	//   11   19:ifne            31
			}
			s = _secondary.findTypeName(annotatedclass);
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #293 <Method String AnnotationIntrospector.findTypeName(AnnotatedClass)>
	//   16   30:astore_2        
		}
		return s;
	//   17   31:aload_2         
	//   18   32:areturn         
	}

	public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
	{
		TypeResolverBuilder typeresolverbuilder1 = _primary.findTypeResolver(mapperconfig, annotatedclass, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #300 <Method TypeResolverBuilder AnnotationIntrospector.findTypeResolver(MapperConfig, AnnotatedClass, JavaType)>
	//    6   10:astore          5
		TypeResolverBuilder typeresolverbuilder = typeresolverbuilder1;
	//    7   12:aload           5
	//    8   14:astore          4
		if(typeresolverbuilder1 == null)
	//*   9   16:aload           5
	//*  10   18:ifnonnull       33
			typeresolverbuilder = _secondary.findTypeResolver(mapperconfig, annotatedclass, javatype);
	//   11   21:aload_0         
	//   12   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #300 <Method TypeResolverBuilder AnnotationIntrospector.findTypeResolver(MapperConfig, AnnotatedClass, JavaType)>
	//   17   31:astore          4
		return typeresolverbuilder;
	//   18   33:aload           4
	//   19   35:areturn         
	}

	public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedmember)
	{
		NameTransformer nametransformer1 = _primary.findUnwrappingNameTransformer(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #305 <Method NameTransformer AnnotationIntrospector.findUnwrappingNameTransformer(AnnotatedMember)>
	//    4    8:astore_3        
		NameTransformer nametransformer = nametransformer1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(nametransformer1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			nametransformer = _secondary.findUnwrappingNameTransformer(annotatedmember);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #305 <Method NameTransformer AnnotationIntrospector.findUnwrappingNameTransformer(AnnotatedMember)>
	//   13   23:astore_2        
		return nametransformer;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findValueInstantiator(AnnotatedClass annotatedclass)
	{
		Object obj1 = _primary.findValueInstantiator(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #308 <Method Object AnnotationIntrospector.findValueInstantiator(AnnotatedClass)>
	//    4    8:astore_3        
		Object obj = obj1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(obj1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			obj = _secondary.findValueInstantiator(annotatedclass);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #308 <Method Object AnnotationIntrospector.findValueInstantiator(AnnotatedClass)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Class[] findViews(Annotated annotated)
	{
		Class aclass1[] = _primary.findViews(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #312 <Method Class[] AnnotationIntrospector.findViews(Annotated)>
	//    4    8:astore_3        
		Class aclass[] = aclass1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(aclass1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			aclass = _secondary.findViews(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #312 <Method Class[] AnnotationIntrospector.findViews(Annotated)>
	//   13   23:astore_2        
		return aclass;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public PropertyName findWrapperName(Annotated annotated)
	{
		PropertyName propertyname = _primary.findWrapperName(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #316 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//    4    8:astore_3        
		if(propertyname == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       22
			return _secondary.findWrapperName(annotated);
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #316 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//   11   21:areturn         
		Object obj = ((Object) (propertyname));
	//   12   22:aload_3         
	//   13   23:astore_2        
		if(propertyname == PropertyName.USE_DEFAULT)
	//*  14   24:aload_3         
	//*  15   25:getstatic       #144 <Field PropertyName PropertyName.USE_DEFAULT>
	//*  16   28:if_acmpne       48
		{
			annotated = ((Annotated) (_secondary.findWrapperName(annotated)));
	//   17   31:aload_0         
	//   18   32:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   19   35:aload_1         
	//   20   36:invokevirtual   #316 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//   21   39:astore_1        
			obj = ((Object) (propertyname));
	//   22   40:aload_3         
	//   23   41:astore_2        
			if(annotated != null)
	//*  24   42:aload_1         
	//*  25   43:ifnull          48
				obj = ((Object) (annotated));
	//   26   46:aload_1         
	//   27   47:astore_2        
		}
		return ((PropertyName) (obj));
	//   28   48:aload_2         
	//   29   49:areturn         
	}

	public Boolean hasAnyGetter(Annotated annotated)
	{
		Boolean boolean2 = _primary.hasAnyGetter(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #319 <Method Boolean AnnotationIntrospector.hasAnyGetter(Annotated)>
	//    4    8:astore_3        
		Boolean boolean1 = boolean2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(boolean2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			boolean1 = _secondary.hasAnyGetter(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #319 <Method Boolean AnnotationIntrospector.hasAnyGetter(Annotated)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
	{
		return _primary.hasAnyGetterAnnotation(annotatedmethod) || _secondary.hasAnyGetterAnnotation(annotatedmethod);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #323 <Method boolean AnnotationIntrospector.hasAnyGetterAnnotation(AnnotatedMethod)>
	//    4    8:ifne            27
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #323 <Method boolean AnnotationIntrospector.hasAnyGetterAnnotation(AnnotatedMethod)>
	//    9   19:ifeq            25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	public Boolean hasAnySetter(Annotated annotated)
	{
		Boolean boolean2 = _primary.hasAnySetter(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #326 <Method Boolean AnnotationIntrospector.hasAnySetter(Annotated)>
	//    4    8:astore_3        
		Boolean boolean1 = boolean2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(boolean2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			boolean1 = _secondary.hasAnySetter(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #326 <Method Boolean AnnotationIntrospector.hasAnySetter(Annotated)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Boolean hasAsValue(Annotated annotated)
	{
		Boolean boolean2 = _primary.hasAsValue(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #329 <Method Boolean AnnotationIntrospector.hasAsValue(Annotated)>
	//    4    8:astore_3        
		Boolean boolean1 = boolean2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(boolean2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			boolean1 = _secondary.hasAsValue(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #329 <Method Boolean AnnotationIntrospector.hasAsValue(Annotated)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
	{
		return _primary.hasAsValueAnnotation(annotatedmethod) || _secondary.hasAsValueAnnotation(annotatedmethod);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #332 <Method boolean AnnotationIntrospector.hasAsValueAnnotation(AnnotatedMethod)>
	//    4    8:ifne            27
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #332 <Method boolean AnnotationIntrospector.hasAsValueAnnotation(AnnotatedMethod)>
	//    9   19:ifeq            25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	public boolean hasCreatorAnnotation(Annotated annotated)
	{
		return _primary.hasCreatorAnnotation(annotated) || _secondary.hasCreatorAnnotation(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #336 <Method boolean AnnotationIntrospector.hasCreatorAnnotation(Annotated)>
	//    4    8:ifne            27
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #336 <Method boolean AnnotationIntrospector.hasCreatorAnnotation(Annotated)>
	//    9   19:ifeq            25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
	{
		return _primary.hasIgnoreMarker(annotatedmember) || _secondary.hasIgnoreMarker(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #340 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//    4    8:ifne            27
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #340 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//    9   19:ifeq            25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	public Boolean hasRequiredMarker(AnnotatedMember annotatedmember)
	{
		Boolean boolean2 = _primary.hasRequiredMarker(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #344 <Method Boolean AnnotationIntrospector.hasRequiredMarker(AnnotatedMember)>
	//    4    8:astore_3        
		Boolean boolean1 = boolean2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(boolean2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			boolean1 = _secondary.hasRequiredMarker(annotatedmember);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #344 <Method Boolean AnnotationIntrospector.hasRequiredMarker(AnnotatedMember)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public boolean isAnnotationBundle(Annotation annotation)
	{
		return _primary.isAnnotationBundle(annotation) || _secondary.isAnnotationBundle(annotation);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #348 <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//    4    8:ifne            27
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #348 <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//    9   19:ifeq            25
	//   10   22:goto            27
	//   11   25:iconst_0        
	//   12   26:ireturn         
	//   13   27:iconst_1        
	//   14   28:ireturn         
	}

	public Boolean isIgnorableType(AnnotatedClass annotatedclass)
	{
		Boolean boolean2 = _primary.isIgnorableType(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #352 <Method Boolean AnnotationIntrospector.isIgnorableType(AnnotatedClass)>
	//    4    8:astore_3        
		Boolean boolean1 = boolean2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(boolean2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			boolean1 = _secondary.isIgnorableType(annotatedclass);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #352 <Method Boolean AnnotationIntrospector.isIgnorableType(AnnotatedClass)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Boolean isTypeId(AnnotatedMember annotatedmember)
	{
		Boolean boolean2 = _primary.isTypeId(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #355 <Method Boolean AnnotationIntrospector.isTypeId(AnnotatedMember)>
	//    4    8:astore_3        
		Boolean boolean1 = boolean2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(boolean2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			boolean1 = _secondary.isTypeId(annotatedmember);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #355 <Method Boolean AnnotationIntrospector.isTypeId(AnnotatedMember)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public JavaType refineDeserializationType(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
		throws JsonMappingException
	{
		javatype = _secondary.refineDeserializationType(mapperconfig, annotated, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #361 <Method JavaType AnnotationIntrospector.refineDeserializationType(MapperConfig, Annotated, JavaType)>
	//    6   10:astore_3        
		return _primary.refineDeserializationType(mapperconfig, annotated, javatype);
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field AnnotationIntrospector _primary>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #361 <Method JavaType AnnotationIntrospector.refineDeserializationType(MapperConfig, Annotated, JavaType)>
	//   13   21:areturn         
	}

	public JavaType refineSerializationType(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
		throws JsonMappingException
	{
		javatype = _secondary.refineSerializationType(mapperconfig, annotated, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #366 <Method JavaType AnnotationIntrospector.refineSerializationType(MapperConfig, Annotated, JavaType)>
	//    6   10:astore_3        
		return _primary.refineSerializationType(mapperconfig, annotated, javatype);
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field AnnotationIntrospector _primary>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #366 <Method JavaType AnnotationIntrospector.refineSerializationType(MapperConfig, Annotated, JavaType)>
	//   13   21:areturn         
	}

	public AnnotatedMethod resolveSetterConflict(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, AnnotatedMethod annotatedmethod1)
	{
		AnnotatedMethod annotatedmethod3 = _primary.resolveSetterConflict(mapperconfig, annotatedmethod, annotatedmethod1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #370 <Method AnnotatedMethod AnnotationIntrospector.resolveSetterConflict(MapperConfig, AnnotatedMethod, AnnotatedMethod)>
	//    6   10:astore          5
		AnnotatedMethod annotatedmethod2 = annotatedmethod3;
	//    7   12:aload           5
	//    8   14:astore          4
		if(annotatedmethod3 == null)
	//*   9   16:aload           5
	//*  10   18:ifnonnull       33
			annotatedmethod2 = _secondary.resolveSetterConflict(mapperconfig, annotatedmethod, annotatedmethod1);
	//   11   21:aload_0         
	//   12   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #370 <Method AnnotatedMethod AnnotationIntrospector.resolveSetterConflict(MapperConfig, AnnotatedMethod, AnnotatedMethod)>
	//   17   31:astore          4
		return annotatedmethod2;
	//   18   33:aload           4
	//   19   35:areturn         
	}

	public Version version()
	{
		return _primary.version();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:invokevirtual   #375 <Method Version AnnotationIntrospector.version()>
	//    3    7:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotationIntrospector _primary;
	protected final AnnotationIntrospector _secondary;
}
