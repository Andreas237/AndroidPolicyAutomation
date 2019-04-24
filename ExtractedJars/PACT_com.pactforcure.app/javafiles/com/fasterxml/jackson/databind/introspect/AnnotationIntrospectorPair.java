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
import java.util.*;

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

	protected boolean _isExplicitClassOrOb(Object obj, Class class1)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(obj != null) goto _L2; else goto _L1
	//    2    3:aload_1         
	//    3    4:ifnonnull       11
_L1:
		boolean flag = false;
	//    4    7:iconst_0        
	//    5    8:istore_3        
_L4:
		return flag;
	//    6    9:iload_3         
	//    7   10:ireturn         
_L2:
		flag = flag1;
	//    8   11:iload           4
	//    9   13:istore_3        
		if(!(obj instanceof Class)) goto _L4; else goto _L3
	//   10   14:aload_1         
	//   11   15:instanceof      #31  <Class Class>
	//   12   18:ifeq            9
_L3:
		obj = ((Object) ((Class)obj));
	//   13   21:aload_1         
	//   14   22:checkcast       #31  <Class Class>
	//   15   25:astore_1        
		if(obj == class1)
			break; /* Loop/switch isn't completed */
	//   16   26:aload_1         
	//   17   27:aload_2         
	//   18   28:if_acmpeq       41
		flag = flag1;
	//   19   31:iload           4
	//   20   33:istore_3        
		if(!ClassUtil.isBogusClass(((Class) (obj)))) goto _L4; else goto _L5
	//   21   34:aload_1         
	//   22   35:invokestatic    #37  <Method boolean ClassUtil.isBogusClass(Class)>
	//   23   38:ifeq            9
_L5:
		return false;
	//   24   41:iconst_0        
	//   25   42:ireturn         
	}

	public Collection allIntrospectors()
	{
		return allIntrospectors(((Collection) (new ArrayList())));
	//    0    0:aload_0         
	//    1    1:new             #43  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #44  <Method void ArrayList()>
	//    4    8:invokevirtual   #47  <Method Collection allIntrospectors(Collection)>
	//    5   11:areturn         
	}

	public Collection allIntrospectors(Collection collection)
	{
		_primary.allIntrospectors(collection);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method Collection AnnotationIntrospector.allIntrospectors(Collection)>
	//    4    8:pop             
		_secondary.allIntrospectors(collection);
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #49  <Method Collection AnnotationIntrospector.allIntrospectors(Collection)>
	//    9   17:pop             
		return collection;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public void findAndAddVirtualProperties(MapperConfig mapperconfig, AnnotatedClass annotatedclass, List list)
	{
		_primary.findAndAddVirtualProperties(mapperconfig, annotatedclass, list);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #54  <Method void AnnotationIntrospector.findAndAddVirtualProperties(MapperConfig, AnnotatedClass, List)>
		_secondary.findAndAddVirtualProperties(mapperconfig, annotatedclass, list);
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #54  <Method void AnnotationIntrospector.findAndAddVirtualProperties(MapperConfig, AnnotatedClass, List)>
	//   12   20:return          
	}

	public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
	{
		visibilitychecker = _secondary.findAutoDetectVisibility(annotatedclass, visibilitychecker);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #59  <Method VisibilityChecker AnnotationIntrospector.findAutoDetectVisibility(AnnotatedClass, VisibilityChecker)>
	//    5    9:astore_2        
		return _primary.findAutoDetectVisibility(annotatedclass, visibilitychecker);
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field AnnotationIntrospector _primary>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #59  <Method VisibilityChecker AnnotationIntrospector.findAutoDetectVisibility(AnnotatedClass, VisibilityChecker)>
	//   11   19:areturn         
	}

	public String findClassDescription(AnnotatedClass annotatedclass)
	{
		String s;
label0:
		{
			String s1 = _primary.findClassDescription(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #64  <Method String AnnotationIntrospector.findClassDescription(AnnotatedClass)>
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
	//   10   16:invokevirtual   #70  <Method boolean String.isEmpty()>
	//   11   19:ifeq            31
			}
			s = _secondary.findClassDescription(annotatedclass);
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #64  <Method String AnnotationIntrospector.findClassDescription(AnnotatedClass)>
	//   16   30:astore_2        
		}
		return s;
	//   17   31:aload_2         
	//   18   32:areturn         
	}

	public Object findContentDeserializer(Annotated annotated)
	{
		Object obj = _primary.findContentDeserializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method Object AnnotationIntrospector.findContentDeserializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonDeserializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #76  <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//*   8   13:invokevirtual   #78  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _secondary.findContentDeserializer(annotated);
	//   12   21:aload_0         
	//   13   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   25:aload_1         
	//   15   26:invokevirtual   #74  <Method Object AnnotationIntrospector.findContentDeserializer(Annotated)>
	//   16   29:areturn         
	}

	public Object findContentSerializer(Annotated annotated)
	{
		Object obj = _primary.findContentSerializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method Object AnnotationIntrospector.findContentSerializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonSerializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #83  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*   8   13:invokevirtual   #78  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _secondary.findContentSerializer(annotated);
	//   12   21:aload_0         
	//   13   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   25:aload_1         
	//   15   26:invokevirtual   #81  <Method Object AnnotationIntrospector.findContentSerializer(Annotated)>
	//   16   29:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorBinding(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonCreator.Mode mode = _primary.findCreatorBinding(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method com.fasterxml.jackson.annotation.JsonCreator$Mode AnnotationIntrospector.findCreatorBinding(Annotated)>
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
	//   12   20:invokevirtual   #87  <Method com.fasterxml.jackson.annotation.JsonCreator$Mode AnnotationIntrospector.findCreatorBinding(Annotated)>
	//   13   23:areturn         
	}

	public Object findDeserializationContentConverter(AnnotatedMember annotatedmember)
	{
		Object obj1 = _primary.findDeserializationContentConverter(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #91  <Method Object AnnotationIntrospector.findDeserializationContentConverter(AnnotatedMember)>
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
	//   12   20:invokevirtual   #91  <Method Object AnnotationIntrospector.findDeserializationContentConverter(AnnotatedMember)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Class findDeserializationContentType(Annotated annotated, JavaType javatype)
	{
		Class class2 = _primary.findDeserializationContentType(annotated, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #96  <Method Class AnnotationIntrospector.findDeserializationContentType(Annotated, JavaType)>
	//    5    9:astore          4
		Class class1 = class2;
	//    6   11:aload           4
	//    7   13:astore_3        
		if(class2 == null)
	//*   8   14:aload           4
	//*   9   16:ifnonnull       29
			class1 = _secondary.findDeserializationContentType(annotated, javatype);
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #96  <Method Class AnnotationIntrospector.findDeserializationContentType(Annotated, JavaType)>
	//   15   28:astore_3        
		return class1;
	//   16   29:aload_3         
	//   17   30:areturn         
	}

	public Object findDeserializationConverter(Annotated annotated)
	{
		Object obj1 = _primary.findDeserializationConverter(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method Object AnnotationIntrospector.findDeserializationConverter(Annotated)>
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
	//   12   20:invokevirtual   #101 <Method Object AnnotationIntrospector.findDeserializationConverter(Annotated)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Class findDeserializationKeyType(Annotated annotated, JavaType javatype)
	{
		Class class2 = _primary.findDeserializationKeyType(annotated, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #104 <Method Class AnnotationIntrospector.findDeserializationKeyType(Annotated, JavaType)>
	//    5    9:astore          4
		Class class1 = class2;
	//    6   11:aload           4
	//    7   13:astore_3        
		if(class2 == null)
	//*   8   14:aload           4
	//*   9   16:ifnonnull       29
			class1 = _secondary.findDeserializationKeyType(annotated, javatype);
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #104 <Method Class AnnotationIntrospector.findDeserializationKeyType(Annotated, JavaType)>
	//   15   28:astore_3        
		return class1;
	//   16   29:aload_3         
	//   17   30:areturn         
	}

	public Class findDeserializationType(Annotated annotated, JavaType javatype)
	{
		Class class1 = _primary.findDeserializationType(annotated, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #107 <Method Class AnnotationIntrospector.findDeserializationType(Annotated, JavaType)>
	//    5    9:astore_3        
		if(class1 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          16
			return class1;
	//    8   14:aload_3         
	//    9   15:areturn         
		else
			return _secondary.findDeserializationType(annotated, javatype);
	//   10   16:aload_0         
	//   11   17:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #107 <Method Class AnnotationIntrospector.findDeserializationType(Annotated, JavaType)>
	//   15   25:areturn         
	}

	public Object findDeserializer(Annotated annotated)
	{
		Object obj = _primary.findDeserializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method Object AnnotationIntrospector.findDeserializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonDeserializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #76  <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//*   8   13:invokevirtual   #78  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _secondary.findDeserializer(annotated);
	//   12   21:aload_0         
	//   13   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   25:aload_1         
	//   15   26:invokevirtual   #110 <Method Object AnnotationIntrospector.findDeserializer(Annotated)>
	//   16   29:areturn         
	}

	public String findEnumValue(Enum enum)
	{
		String s1 = _primary.findEnumValue(enum);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #114 <Method String AnnotationIntrospector.findEnumValue(Enum)>
	//    4    8:astore_3        
		String s = s1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(s1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			s = _secondary.findEnumValue(enum);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #114 <Method String AnnotationIntrospector.findEnumValue(Enum)>
	//   13   23:astore_2        
		return s;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public String[] findEnumValues(Class class1, Enum aenum[], String as[])
	{
		as = _secondary.findEnumValues(class1, aenum, as);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #119 <Method String[] AnnotationIntrospector.findEnumValues(Class, Enum[], String[])>
	//    6   10:astore_3        
		return _primary.findEnumValues(class1, aenum, as);
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field AnnotationIntrospector _primary>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #119 <Method String[] AnnotationIntrospector.findEnumValues(Class, Enum[], String[])>
	//   13   21:areturn         
	}

	public Object findFilterId(Annotated annotated)
	{
		Object obj1 = _primary.findFilterId(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method Object AnnotationIntrospector.findFilterId(Annotated)>
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
	//   12   20:invokevirtual   #123 <Method Object AnnotationIntrospector.findFilterId(Annotated)>
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
	//    3    5:invokevirtual   #127 <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
	//    4    8:astore_2        
		annotated = ((Annotated) (_secondary.findFormat(annotated)));
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #127 <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
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
	//   16   26:invokevirtual   #133 <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.withOverrides(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   17   29:areturn         
	}

	public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
	{
		Boolean boolean2 = _primary.findIgnoreUnknownProperties(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #137 <Method Boolean AnnotationIntrospector.findIgnoreUnknownProperties(AnnotatedClass)>
	//    4    8:astore_3        
		Boolean boolean1 = boolean2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(boolean2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			boolean1 = _secondary.findIgnoreUnknownProperties(annotatedclass);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #137 <Method Boolean AnnotationIntrospector.findIgnoreUnknownProperties(AnnotatedClass)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public String findImplicitPropertyName(AnnotatedMember annotatedmember)
	{
		String s1 = _primary.findImplicitPropertyName(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #141 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
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
	//   12   20:invokevirtual   #141 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//   13   23:astore_2        
		return s;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Object findInjectableValueId(AnnotatedMember annotatedmember)
	{
		Object obj1 = _primary.findInjectableValueId(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method Object AnnotationIntrospector.findInjectableValueId(AnnotatedMember)>
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
	//   12   20:invokevirtual   #144 <Method Object AnnotationIntrospector.findInjectableValueId(AnnotatedMember)>
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
	//    3    5:invokevirtual   #147 <Method Object AnnotationIntrospector.findKeyDeserializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/KeyDeserializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #149 <Class com.fasterxml.jackson.databind.KeyDeserializer$None>
	//*   8   13:invokevirtual   #78  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _secondary.findKeyDeserializer(annotated);
	//   12   21:aload_0         
	//   13   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   25:aload_1         
	//   15   26:invokevirtual   #147 <Method Object AnnotationIntrospector.findKeyDeserializer(Annotated)>
	//   16   29:areturn         
	}

	public Object findKeySerializer(Annotated annotated)
	{
		Object obj = _primary.findKeySerializer(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #152 <Method Object AnnotationIntrospector.findKeySerializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonSerializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #83  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*   8   13:invokevirtual   #78  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _secondary.findKeySerializer(annotated);
	//   12   21:aload_0         
	//   13   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   25:aload_1         
	//   15   26:invokevirtual   #152 <Method Object AnnotationIntrospector.findKeySerializer(Annotated)>
	//   16   29:areturn         
	}

	public PropertyName findNameForDeserialization(Annotated annotated)
	{
		PropertyName propertyname1 = _primary.findNameForDeserialization(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//    4    8:astore_3        
		PropertyName propertyname;
		if(propertyname1 == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       24
		{
			propertyname = _secondary.findNameForDeserialization(annotated);
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #156 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//   11   21:astore_2        
		} else
	//*  12   22:aload_2         
	//*  13   23:areturn         
		{
			propertyname = propertyname1;
	//   14   24:aload_3         
	//   15   25:astore_2        
			if(propertyname1 == PropertyName.USE_DEFAULT)
	//*  16   26:aload_3         
	//*  17   27:getstatic       #162 <Field PropertyName PropertyName.USE_DEFAULT>
	//*  18   30:if_acmpne       22
			{
				annotated = ((Annotated) (_secondary.findNameForDeserialization(annotated)));
	//   19   33:aload_0         
	//   20   34:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #156 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//   23   41:astore_1        
				propertyname = propertyname1;
	//   24   42:aload_3         
	//   25   43:astore_2        
				if(annotated != null)
	//*  26   44:aload_1         
	//*  27   45:ifnull          22
					return ((PropertyName) (annotated));
	//   28   48:aload_1         
	//   29   49:areturn         
			}
		}
		return propertyname;
	}

	public PropertyName findNameForSerialization(Annotated annotated)
	{
		PropertyName propertyname1 = _primary.findNameForSerialization(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #165 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//    4    8:astore_3        
		PropertyName propertyname;
		if(propertyname1 == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       24
		{
			propertyname = _secondary.findNameForSerialization(annotated);
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #165 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//   11   21:astore_2        
		} else
	//*  12   22:aload_2         
	//*  13   23:areturn         
		{
			propertyname = propertyname1;
	//   14   24:aload_3         
	//   15   25:astore_2        
			if(propertyname1 == PropertyName.USE_DEFAULT)
	//*  16   26:aload_3         
	//*  17   27:getstatic       #162 <Field PropertyName PropertyName.USE_DEFAULT>
	//*  18   30:if_acmpne       22
			{
				annotated = ((Annotated) (_secondary.findNameForSerialization(annotated)));
	//   19   33:aload_0         
	//   20   34:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #165 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//   23   41:astore_1        
				propertyname = propertyname1;
	//   24   42:aload_3         
	//   25   43:astore_2        
				if(annotated != null)
	//*  26   44:aload_1         
	//*  27   45:ifnull          22
					return ((PropertyName) (annotated));
	//   28   48:aload_1         
	//   29   49:areturn         
			}
		}
		return propertyname;
	}

	public Object findNamingStrategy(AnnotatedClass annotatedclass)
	{
		Object obj1 = _primary.findNamingStrategy(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #169 <Method Object AnnotationIntrospector.findNamingStrategy(AnnotatedClass)>
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
	//   12   20:invokevirtual   #169 <Method Object AnnotationIntrospector.findNamingStrategy(AnnotatedClass)>
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
	//    3    5:invokevirtual   #172 <Method Object AnnotationIntrospector.findNullSerializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonSerializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #83  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*   8   13:invokevirtual   #78  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _secondary.findNullSerializer(annotated);
	//   12   21:aload_0         
	//   13   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   25:aload_1         
	//   15   26:invokevirtual   #172 <Method Object AnnotationIntrospector.findNullSerializer(Annotated)>
	//   16   29:areturn         
	}

	public ObjectIdInfo findObjectIdInfo(Annotated annotated)
	{
		ObjectIdInfo objectidinfo1 = _primary.findObjectIdInfo(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #176 <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(Annotated)>
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
	//   12   20:invokevirtual   #176 <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(Annotated)>
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
	//    4    6:invokevirtual   #180 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(Annotated, ObjectIdInfo)>
	//    5    9:astore_2        
		return _primary.findObjectReferenceInfo(annotated, objectidinfo);
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field AnnotationIntrospector _primary>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #180 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(Annotated, ObjectIdInfo)>
	//   11   19:areturn         
	}

	public Class findPOJOBuilder(AnnotatedClass annotatedclass)
	{
		Class class2 = _primary.findPOJOBuilder(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #184 <Method Class AnnotationIntrospector.findPOJOBuilder(AnnotatedClass)>
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
	//   12   20:invokevirtual   #184 <Method Class AnnotationIntrospector.findPOJOBuilder(AnnotatedClass)>
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
	//    3    5:invokevirtual   #189 <Method com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value AnnotationIntrospector.findPOJOBuilderConfig(AnnotatedClass)>
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
	//   12   20:invokevirtual   #189 <Method com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value AnnotationIntrospector.findPOJOBuilderConfig(AnnotatedClass)>
	//   13   23:astore_2        
		return value;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public String[] findPropertiesToIgnore(Annotated annotated)
	{
		String as1[] = _primary.findPropertiesToIgnore(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #193 <Method String[] AnnotationIntrospector.findPropertiesToIgnore(Annotated)>
	//    4    8:astore_3        
		String as[] = as1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(as1 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			as = _secondary.findPropertiesToIgnore(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #193 <Method String[] AnnotationIntrospector.findPropertiesToIgnore(Annotated)>
	//   13   23:astore_2        
		return as;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public String[] findPropertiesToIgnore(Annotated annotated, boolean flag)
	{
		String as1[] = _primary.findPropertiesToIgnore(annotated, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #196 <Method String[] AnnotationIntrospector.findPropertiesToIgnore(Annotated, boolean)>
	//    5    9:astore          4
		String as[] = as1;
	//    6   11:aload           4
	//    7   13:astore_3        
		if(as1 == null)
	//*   8   14:aload           4
	//*   9   16:ifnonnull       29
			as = _secondary.findPropertiesToIgnore(annotated, flag);
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   12   23:aload_1         
	//   13   24:iload_2         
	//   14   25:invokevirtual   #196 <Method String[] AnnotationIntrospector.findPropertiesToIgnore(Annotated, boolean)>
	//   15   28:astore_3        
		return as;
	//   16   29:aload_3         
	//   17   30:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonProperty.Access findPropertyAccess(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonProperty.Access access = _primary.findPropertyAccess(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #200 <Method com.fasterxml.jackson.annotation.JsonProperty$Access AnnotationIntrospector.findPropertyAccess(Annotated)>
	//    4    8:astore_2        
		if(access != null && access != com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO)
	//*   5    9:aload_2         
	//*   6   10:ifnull          22
	//*   7   13:aload_2         
	//*   8   14:getstatic       #206 <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.AUTO>
	//*   9   17:if_acmpeq       22
			return access;
	//   10   20:aload_2         
	//   11   21:areturn         
		annotated = ((Annotated) (_secondary.findPropertyAccess(annotated)));
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #200 <Method com.fasterxml.jackson.annotation.JsonProperty$Access AnnotationIntrospector.findPropertyAccess(Annotated)>
	//   16   30:astore_1        
		if(annotated != null)
	//*  17   31:aload_1         
	//*  18   32:ifnull          37
			return ((com.fasterxml.jackson.annotation.JsonProperty.Access) (annotated));
	//   19   35:aload_1         
	//   20   36:areturn         
		else
			return com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO;
	//   21   37:getstatic       #206 <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.AUTO>
	//   22   40:areturn         
	}

	public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		TypeResolverBuilder typeresolverbuilder1 = _primary.findPropertyContentTypeResolver(mapperconfig, annotatedmember, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #210 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyContentTypeResolver(MapperConfig, AnnotatedMember, JavaType)>
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
	//   16   28:invokevirtual   #210 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyContentTypeResolver(MapperConfig, AnnotatedMember, JavaType)>
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
	//    3    5:invokevirtual   #215 <Method String AnnotationIntrospector.findPropertyDefaultValue(Annotated)>
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
	//   10   16:invokevirtual   #70  <Method boolean String.isEmpty()>
	//   11   19:ifeq            31
			}
			s = _secondary.findPropertyDefaultValue(annotated);
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #215 <Method String AnnotationIntrospector.findPropertyDefaultValue(Annotated)>
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
	//    3    5:invokevirtual   #218 <Method String AnnotationIntrospector.findPropertyDescription(Annotated)>
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
	//   12   20:invokevirtual   #218 <Method String AnnotationIntrospector.findPropertyDescription(Annotated)>
	//   13   23:astore_2        
		return s;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonInclude.Value value = _secondary.findPropertyInclusion(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #222 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
	//    4    8:astore_2        
		annotated = ((Annotated) (_primary.findPropertyInclusion(annotated)));
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field AnnotationIntrospector _primary>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #222 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
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
	//   16   26:invokevirtual   #227 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   17   29:areturn         
	}

	public Integer findPropertyIndex(Annotated annotated)
	{
		Integer integer1 = _primary.findPropertyIndex(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #231 <Method Integer AnnotationIntrospector.findPropertyIndex(Annotated)>
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
	//   12   20:invokevirtual   #231 <Method Integer AnnotationIntrospector.findPropertyIndex(Annotated)>
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
	//    5    7:invokevirtual   #234 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyTypeResolver(MapperConfig, AnnotatedMember, JavaType)>
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
	//   16   28:invokevirtual   #234 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyTypeResolver(MapperConfig, AnnotatedMember, JavaType)>
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
	//    3    5:invokevirtual   #238 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty AnnotationIntrospector.findReferenceType(AnnotatedMember)>
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
	//   12   20:invokevirtual   #238 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty AnnotationIntrospector.findReferenceType(AnnotatedMember)>
	//   13   23:astore_2        
		return referenceproperty;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public PropertyName findRootName(AnnotatedClass annotatedclass)
	{
		PropertyName propertyname1 = _primary.findRootName(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #242 <Method PropertyName AnnotationIntrospector.findRootName(AnnotatedClass)>
	//    4    8:astore_3        
		PropertyName propertyname;
		if(propertyname1 == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       24
		{
			propertyname = _secondary.findRootName(annotatedclass);
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #242 <Method PropertyName AnnotationIntrospector.findRootName(AnnotatedClass)>
	//   11   21:astore_2        
		} else
	//*  12   22:aload_2         
	//*  13   23:areturn         
		{
			propertyname = propertyname1;
	//   14   24:aload_3         
	//   15   25:astore_2        
			if(!propertyname1.hasSimpleName())
	//*  16   26:aload_3         
	//*  17   27:invokevirtual   #245 <Method boolean PropertyName.hasSimpleName()>
	//*  18   30:ifne            22
			{
				annotatedclass = ((AnnotatedClass) (_secondary.findRootName(annotatedclass)));
	//   19   33:aload_0         
	//   20   34:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #242 <Method PropertyName AnnotationIntrospector.findRootName(AnnotatedClass)>
	//   23   41:astore_1        
				propertyname = propertyname1;
	//   24   42:aload_3         
	//   25   43:astore_2        
				if(annotatedclass != null)
	//*  26   44:aload_1         
	//*  27   45:ifnull          22
					return ((PropertyName) (annotatedclass));
	//   28   48:aload_1         
	//   29   49:areturn         
			}
		}
		return propertyname;
	}

	public Object findSerializationContentConverter(AnnotatedMember annotatedmember)
	{
		Object obj1 = _primary.findSerializationContentConverter(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #248 <Method Object AnnotationIntrospector.findSerializationContentConverter(AnnotatedMember)>
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
	//   12   20:invokevirtual   #248 <Method Object AnnotationIntrospector.findSerializationContentConverter(AnnotatedMember)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Class findSerializationContentType(Annotated annotated, JavaType javatype)
	{
		Class class2 = _primary.findSerializationContentType(annotated, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #251 <Method Class AnnotationIntrospector.findSerializationContentType(Annotated, JavaType)>
	//    5    9:astore          4
		Class class1 = class2;
	//    6   11:aload           4
	//    7   13:astore_3        
		if(class2 == null)
	//*   8   14:aload           4
	//*   9   16:ifnonnull       29
			class1 = _secondary.findSerializationContentType(annotated, javatype);
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #251 <Method Class AnnotationIntrospector.findSerializationContentType(Annotated, JavaType)>
	//   15   28:astore_3        
		return class1;
	//   16   29:aload_3         
	//   17   30:areturn         
	}

	public Object findSerializationConverter(Annotated annotated)
	{
		Object obj1 = _primary.findSerializationConverter(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #254 <Method Object AnnotationIntrospector.findSerializationConverter(Annotated)>
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
	//   12   20:invokevirtual   #254 <Method Object AnnotationIntrospector.findSerializationConverter(Annotated)>
	//   13   23:astore_2        
		return obj;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusion(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		include = _secondary.findSerializationInclusion(annotated, include);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #258 <Method com.fasterxml.jackson.annotation.JsonInclude$Include AnnotationIntrospector.findSerializationInclusion(Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//    5    9:astore_2        
		return _primary.findSerializationInclusion(annotated, include);
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field AnnotationIntrospector _primary>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #258 <Method com.fasterxml.jackson.annotation.JsonInclude$Include AnnotationIntrospector.findSerializationInclusion(Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   11   19:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusionForContent(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		include = _secondary.findSerializationInclusionForContent(annotated, include);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #261 <Method com.fasterxml.jackson.annotation.JsonInclude$Include AnnotationIntrospector.findSerializationInclusionForContent(Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//    5    9:astore_2        
		return _primary.findSerializationInclusionForContent(annotated, include);
	//    6   10:aload_0         
	//    7   11:getfield        #20  <Field AnnotationIntrospector _primary>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #261 <Method com.fasterxml.jackson.annotation.JsonInclude$Include AnnotationIntrospector.findSerializationInclusionForContent(Annotated, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   11   19:areturn         
	}

	public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
	{
		Class class2 = _primary.findSerializationKeyType(annotated, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #264 <Method Class AnnotationIntrospector.findSerializationKeyType(Annotated, JavaType)>
	//    5    9:astore          4
		Class class1 = class2;
	//    6   11:aload           4
	//    7   13:astore_3        
		if(class2 == null)
	//*   8   14:aload           4
	//*   9   16:ifnonnull       29
			class1 = _secondary.findSerializationKeyType(annotated, javatype);
	//   10   19:aload_0         
	//   11   20:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:invokevirtual   #264 <Method Class AnnotationIntrospector.findSerializationKeyType(Annotated, JavaType)>
	//   15   28:astore_3        
		return class1;
	//   16   29:aload_3         
	//   17   30:areturn         
	}

	public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
	{
		String as1[] = _primary.findSerializationPropertyOrder(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #268 <Method String[] AnnotationIntrospector.findSerializationPropertyOrder(AnnotatedClass)>
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
	//   12   20:invokevirtual   #268 <Method String[] AnnotationIntrospector.findSerializationPropertyOrder(AnnotatedClass)>
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
	//    3    5:invokevirtual   #272 <Method Boolean AnnotationIntrospector.findSerializationSortAlphabetically(Annotated)>
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
	//   12   20:invokevirtual   #272 <Method Boolean AnnotationIntrospector.findSerializationSortAlphabetically(Annotated)>
	//   13   23:astore_2        
		return boolean1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public Class findSerializationType(Annotated annotated)
	{
		Class class2 = _primary.findSerializationType(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #276 <Method Class AnnotationIntrospector.findSerializationType(Annotated)>
	//    4    8:astore_3        
		Class class1 = class2;
	//    5    9:aload_3         
	//    6   10:astore_2        
		if(class2 == null)
	//*   7   11:aload_3         
	//*   8   12:ifnonnull       24
			class1 = _secondary.findSerializationType(annotated);
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   11   19:aload_1         
	//   12   20:invokevirtual   #276 <Method Class AnnotationIntrospector.findSerializationType(Annotated)>
	//   13   23:astore_2        
		return class1;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
	{
		com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing typing1 = _primary.findSerializationTyping(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #281 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(Annotated)>
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
	//   12   20:invokevirtual   #281 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(Annotated)>
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
	//    3    5:invokevirtual   #284 <Method Object AnnotationIntrospector.findSerializer(Annotated)>
	//    4    8:astore_2        
		if(_isExplicitClassOrOb(obj, com/fasterxml/jackson/databind/JsonSerializer$None))
	//*   5    9:aload_0         
	//*   6   10:aload_2         
	//*   7   11:ldc1            #83  <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*   8   13:invokevirtual   #78  <Method boolean _isExplicitClassOrOb(Object, Class)>
	//*   9   16:ifeq            21
			return obj;
	//   10   19:aload_2         
	//   11   20:areturn         
		else
			return _secondary.findSerializer(annotated);
	//   12   21:aload_0         
	//   13   22:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   25:aload_1         
	//   15   26:invokevirtual   #284 <Method Object AnnotationIntrospector.findSerializer(Annotated)>
	//   16   29:areturn         
	}

	public List findSubtypes(Annotated annotated)
	{
		List list = _primary.findSubtypes(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #288 <Method List AnnotationIntrospector.findSubtypes(Annotated)>
	//    4    8:astore_2        
		annotated = ((Annotated) (_secondary.findSubtypes(annotated)));
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #288 <Method List AnnotationIntrospector.findSubtypes(Annotated)>
	//    9   17:astore_1        
		if(list == null || list.isEmpty())
	//*  10   18:aload_2         
	//*  11   19:ifnull          31
	//*  12   22:aload_2         
	//*  13   23:invokeinterface #291 <Method boolean List.isEmpty()>
	//*  14   28:ifeq            33
			return ((List) (annotated));
	//   15   31:aload_1         
	//   16   32:areturn         
		if(annotated == null || ((List) (annotated)).isEmpty())
	//*  17   33:aload_1         
	//*  18   34:ifnull          46
	//*  19   37:aload_1         
	//*  20   38:invokeinterface #291 <Method boolean List.isEmpty()>
	//*  21   43:ifeq            48
		{
			return list;
	//   22   46:aload_2         
	//   23   47:areturn         
		} else
		{
			ArrayList arraylist = new ArrayList(list.size() + ((List) (annotated)).size());
	//   24   48:new             #43  <Class ArrayList>
	//   25   51:dup             
	//   26   52:aload_2         
	//   27   53:invokeinterface #295 <Method int List.size()>
	//   28   58:aload_1         
	//   29   59:invokeinterface #295 <Method int List.size()>
	//   30   64:iadd            
	//   31   65:invokespecial   #298 <Method void ArrayList(int)>
	//   32   68:astore_3        
			arraylist.addAll(((Collection) (list)));
	//   33   69:aload_3         
	//   34   70:aload_2         
	//   35   71:invokevirtual   #302 <Method boolean ArrayList.addAll(Collection)>
	//   36   74:pop             
			arraylist.addAll(((Collection) (annotated)));
	//   37   75:aload_3         
	//   38   76:aload_1         
	//   39   77:invokevirtual   #302 <Method boolean ArrayList.addAll(Collection)>
	//   40   80:pop             
			return ((List) (arraylist));
	//   41   81:aload_3         
	//   42   82:areturn         
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
	//    3    5:invokevirtual   #306 <Method String AnnotationIntrospector.findTypeName(AnnotatedClass)>
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
	//   10   16:invokevirtual   #309 <Method int String.length()>
	//   11   19:ifne            31
			}
			s = _secondary.findTypeName(annotatedclass);
	//   12   22:aload_0         
	//   13   23:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #306 <Method String AnnotationIntrospector.findTypeName(AnnotatedClass)>
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
	//    5    7:invokevirtual   #313 <Method TypeResolverBuilder AnnotationIntrospector.findTypeResolver(MapperConfig, AnnotatedClass, JavaType)>
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
	//   16   28:invokevirtual   #313 <Method TypeResolverBuilder AnnotationIntrospector.findTypeResolver(MapperConfig, AnnotatedClass, JavaType)>
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
	//    3    5:invokevirtual   #318 <Method NameTransformer AnnotationIntrospector.findUnwrappingNameTransformer(AnnotatedMember)>
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
	//   12   20:invokevirtual   #318 <Method NameTransformer AnnotationIntrospector.findUnwrappingNameTransformer(AnnotatedMember)>
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
	//    3    5:invokevirtual   #321 <Method Object AnnotationIntrospector.findValueInstantiator(AnnotatedClass)>
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
	//   12   20:invokevirtual   #321 <Method Object AnnotationIntrospector.findValueInstantiator(AnnotatedClass)>
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
	//    3    5:invokevirtual   #325 <Method Class[] AnnotationIntrospector.findViews(Annotated)>
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
	//   12   20:invokevirtual   #325 <Method Class[] AnnotationIntrospector.findViews(Annotated)>
	//   13   23:astore_2        
		return aclass;
	//   14   24:aload_2         
	//   15   25:areturn         
	}

	public PropertyName findWrapperName(Annotated annotated)
	{
		PropertyName propertyname1 = _primary.findWrapperName(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #329 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//    4    8:astore_3        
		PropertyName propertyname;
		if(propertyname1 == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       24
		{
			propertyname = _secondary.findWrapperName(annotated);
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #329 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//   11   21:astore_2        
		} else
	//*  12   22:aload_2         
	//*  13   23:areturn         
		{
			propertyname = propertyname1;
	//   14   24:aload_3         
	//   15   25:astore_2        
			if(propertyname1 == PropertyName.USE_DEFAULT)
	//*  16   26:aload_3         
	//*  17   27:getstatic       #162 <Field PropertyName PropertyName.USE_DEFAULT>
	//*  18   30:if_acmpne       22
			{
				annotated = ((Annotated) (_secondary.findWrapperName(annotated)));
	//   19   33:aload_0         
	//   20   34:getfield        #22  <Field AnnotationIntrospector _secondary>
	//   21   37:aload_1         
	//   22   38:invokevirtual   #329 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//   23   41:astore_1        
				propertyname = propertyname1;
	//   24   42:aload_3         
	//   25   43:astore_2        
				if(annotated != null)
	//*  26   44:aload_1         
	//*  27   45:ifnull          22
					return ((PropertyName) (annotated));
	//   28   48:aload_1         
	//   29   49:areturn         
			}
		}
		return propertyname;
	}

	public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
	{
		return _primary.hasAnyGetterAnnotation(annotatedmethod) || _secondary.hasAnyGetterAnnotation(annotatedmethod);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #333 <Method boolean AnnotationIntrospector.hasAnyGetterAnnotation(AnnotatedMethod)>
	//    4    8:ifne            22
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #333 <Method boolean AnnotationIntrospector.hasAnyGetterAnnotation(AnnotatedMethod)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
	{
		return _primary.hasAnySetterAnnotation(annotatedmethod) || _secondary.hasAnySetterAnnotation(annotatedmethod);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #336 <Method boolean AnnotationIntrospector.hasAnySetterAnnotation(AnnotatedMethod)>
	//    4    8:ifne            22
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #336 <Method boolean AnnotationIntrospector.hasAnySetterAnnotation(AnnotatedMethod)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
	{
		return _primary.hasAsValueAnnotation(annotatedmethod) || _secondary.hasAsValueAnnotation(annotatedmethod);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #339 <Method boolean AnnotationIntrospector.hasAsValueAnnotation(AnnotatedMethod)>
	//    4    8:ifne            22
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #339 <Method boolean AnnotationIntrospector.hasAsValueAnnotation(AnnotatedMethod)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public boolean hasCreatorAnnotation(Annotated annotated)
	{
		return _primary.hasCreatorAnnotation(annotated) || _secondary.hasCreatorAnnotation(annotated);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #343 <Method boolean AnnotationIntrospector.hasCreatorAnnotation(Annotated)>
	//    4    8:ifne            22
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #343 <Method boolean AnnotationIntrospector.hasCreatorAnnotation(Annotated)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
	{
		return _primary.hasIgnoreMarker(annotatedmember) || _secondary.hasIgnoreMarker(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #347 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//    4    8:ifne            22
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #347 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public Boolean hasRequiredMarker(AnnotatedMember annotatedmember)
	{
		Boolean boolean2 = _primary.hasRequiredMarker(annotatedmember);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #351 <Method Boolean AnnotationIntrospector.hasRequiredMarker(AnnotatedMember)>
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
	//   12   20:invokevirtual   #351 <Method Boolean AnnotationIntrospector.hasRequiredMarker(AnnotatedMember)>
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
	//    3    5:invokevirtual   #355 <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//    4    8:ifne            22
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field AnnotationIntrospector _secondary>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #355 <Method boolean AnnotationIntrospector.isAnnotationBundle(Annotation)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public Boolean isIgnorableType(AnnotatedClass annotatedclass)
	{
		Boolean boolean2 = _primary.isIgnorableType(annotatedclass);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AnnotationIntrospector _primary>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #358 <Method Boolean AnnotationIntrospector.isIgnorableType(AnnotatedClass)>
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
	//   12   20:invokevirtual   #358 <Method Boolean AnnotationIntrospector.isIgnorableType(AnnotatedClass)>
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
	//    3    5:invokevirtual   #361 <Method Boolean AnnotationIntrospector.isTypeId(AnnotatedMember)>
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
	//   12   20:invokevirtual   #361 <Method Boolean AnnotationIntrospector.isTypeId(AnnotatedMember)>
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
	//    5    7:invokevirtual   #367 <Method JavaType AnnotationIntrospector.refineDeserializationType(MapperConfig, Annotated, JavaType)>
	//    6   10:astore_3        
		return _primary.refineDeserializationType(mapperconfig, annotated, javatype);
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field AnnotationIntrospector _primary>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #367 <Method JavaType AnnotationIntrospector.refineDeserializationType(MapperConfig, Annotated, JavaType)>
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
	//    5    7:invokevirtual   #372 <Method JavaType AnnotationIntrospector.refineSerializationType(MapperConfig, Annotated, JavaType)>
	//    6   10:astore_3        
		return _primary.refineSerializationType(mapperconfig, annotated, javatype);
	//    7   11:aload_0         
	//    8   12:getfield        #20  <Field AnnotationIntrospector _primary>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #372 <Method JavaType AnnotationIntrospector.refineSerializationType(MapperConfig, Annotated, JavaType)>
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
	//    5    7:invokevirtual   #376 <Method AnnotatedMethod AnnotationIntrospector.resolveSetterConflict(MapperConfig, AnnotatedMethod, AnnotatedMethod)>
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
	//   16   28:invokevirtual   #376 <Method AnnotatedMethod AnnotationIntrospector.resolveSetterConflict(MapperConfig, AnnotatedMethod, AnnotatedMethod)>
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
	//    2    4:invokevirtual   #381 <Method Version AnnotationIntrospector.version()>
	//    3    7:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final AnnotationIntrospector _primary;
	protected final AnnotationIntrospector _secondary;
}
