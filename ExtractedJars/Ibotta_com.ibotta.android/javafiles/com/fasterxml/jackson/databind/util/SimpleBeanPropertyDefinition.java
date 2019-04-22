// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

public class SimpleBeanPropertyDefinition extends BeanPropertyDefinition
{

	protected SimpleBeanPropertyDefinition(AnnotationIntrospector annotationintrospector, AnnotatedMember annotatedmember, PropertyName propertyname, PropertyMetadata propertymetadata, com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BeanPropertyDefinition()>
		_annotationIntrospector = annotationintrospector;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AnnotationIntrospector _annotationIntrospector>
		_member = annotatedmember;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field AnnotatedMember _member>
		_fullName = propertyname;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field PropertyName _fullName>
		annotationintrospector = ((AnnotationIntrospector) (propertymetadata));
	//   11   19:aload           4
	//   12   21:astore_1        
		if(propertymetadata == null)
	//*  13   22:aload           4
	//*  14   24:ifnonnull       31
			annotationintrospector = ((AnnotationIntrospector) (PropertyMetadata.STD_OPTIONAL));
	//   15   27:getstatic       #30  <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//   16   30:astore_1        
		_metadata = ((PropertyMetadata) (annotationintrospector));
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:putfield        #32  <Field PropertyMetadata _metadata>
		_inclusion = value;
	//   20   36:aload_0         
	//   21   37:aload           5
	//   22   39:putfield        #34  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _inclusion>
	//   23   42:return          
	}

	public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember, PropertyName propertyname)
	{
		return construct(mapperconfig, annotatedmember, propertyname, ((PropertyMetadata) (null)), EMPTY_INCLUDE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//    5    7:invokestatic    #43  <Method SimpleBeanPropertyDefinition construct(MapperConfig, AnnotatedMember, PropertyName, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    6   10:areturn         
	}

	public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember, PropertyName propertyname, PropertyMetadata propertymetadata, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		if(include != null && include != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*   0    0:aload           4
	//*   1    2:ifnull          27
	//*   2    5:aload           4
	//*   3    7:getstatic       #52  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*   4   10:if_acmpne       16
	//*   5   13:goto            27
			include = ((com.fasterxml.jackson.annotation.JsonInclude.Include) (com.fasterxml.jackson.annotation.JsonInclude.Value.construct(include, ((com.fasterxml.jackson.annotation.JsonInclude.Include) (null)))));
	//    6   16:aload           4
	//    7   18:aconst_null     
	//    8   19:invokestatic    #57  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.construct(com.fasterxml.jackson.annotation.JsonInclude$Include, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//    9   22:astore          4
		else
	//*  10   24:goto            32
			include = ((com.fasterxml.jackson.annotation.JsonInclude.Include) (EMPTY_INCLUDE));
	//   11   27:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//   12   30:astore          4
		return new SimpleBeanPropertyDefinition(mapperconfig.getAnnotationIntrospector(), annotatedmember, propertyname, propertymetadata, ((com.fasterxml.jackson.annotation.JsonInclude.Value) (include)));
	//   13   32:new             #2   <Class SimpleBeanPropertyDefinition>
	//   14   35:dup             
	//   15   36:aload_0         
	//   16   37:invokevirtual   #63  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   17   40:aload_1         
	//   18   41:aload_2         
	//   19   42:aload_3         
	//   20   43:aload           4
	//   21   45:invokespecial   #65  <Method void SimpleBeanPropertyDefinition(AnnotationIntrospector, AnnotatedMember, PropertyName, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   22   48:areturn         
	}

	public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember, PropertyName propertyname, PropertyMetadata propertymetadata, com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		return new SimpleBeanPropertyDefinition(mapperconfig.getAnnotationIntrospector(), annotatedmember, propertyname, propertymetadata, value);
	//    0    0:new             #2   <Class SimpleBeanPropertyDefinition>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #63  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #65  <Method void SimpleBeanPropertyDefinition(AnnotationIntrospector, AnnotatedMember, PropertyName, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    9   16:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findInclusion()
	{
		return _inclusion;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _inclusion>
	//    2    4:areturn         
	}

	public AnnotatedParameter getConstructorParameter()
	{
		AnnotatedMember annotatedmember = _member;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedMember _member>
	//    2    4:astore_1        
		if(annotatedmember instanceof AnnotatedParameter)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #73  <Class AnnotatedParameter>
	//*   5    9:ifeq            17
			return (AnnotatedParameter)annotatedmember;
	//    6   12:aload_1         
	//    7   13:checkcast       #73  <Class AnnotatedParameter>
	//    8   16:areturn         
		else
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	public Iterator getConstructorParameters()
	{
		AnnotatedParameter annotatedparameter = getConstructorParameter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method AnnotatedParameter getConstructorParameter()>
	//    2    4:astore_1        
		if(annotatedparameter == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return ClassUtil.emptyIterator();
	//    5    9:invokestatic    #82  <Method Iterator ClassUtil.emptyIterator()>
	//    6   12:areturn         
		else
			return Collections.singleton(((Object) (annotatedparameter))).iterator();
	//    7   13:aload_1         
	//    8   14:invokestatic    #88  <Method Set Collections.singleton(Object)>
	//    9   17:invokeinterface #93  <Method Iterator Set.iterator()>
	//   10   22:areturn         
	}

	public AnnotatedField getField()
	{
		AnnotatedMember annotatedmember = _member;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedMember _member>
	//    2    4:astore_1        
		if(annotatedmember instanceof AnnotatedField)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #98  <Class AnnotatedField>
	//*   5    9:ifeq            17
			return (AnnotatedField)annotatedmember;
	//    6   12:aload_1         
	//    7   13:checkcast       #98  <Class AnnotatedField>
	//    8   16:areturn         
		else
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	public PropertyName getFullName()
	{
		return _fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field PropertyName _fullName>
	//    2    4:areturn         
	}

	public AnnotatedMethod getGetter()
	{
		AnnotatedMember annotatedmember = _member;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedMember _member>
	//    2    4:astore_1        
		if((annotatedmember instanceof AnnotatedMethod) && ((AnnotatedMethod)annotatedmember).getParameterCount() == 0)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #104 <Class AnnotatedMethod>
	//*   5    9:ifeq            30
	//*   6   12:aload_1         
	//*   7   13:checkcast       #104 <Class AnnotatedMethod>
	//*   8   16:invokevirtual   #108 <Method int AnnotatedMethod.getParameterCount()>
	//*   9   19:ifne            30
			return (AnnotatedMethod)_member;
	//   10   22:aload_0         
	//   11   23:getfield        #23  <Field AnnotatedMember _member>
	//   12   26:checkcast       #104 <Class AnnotatedMethod>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	public PropertyMetadata getMetadata()
	{
		return _metadata;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field PropertyMetadata _metadata>
	//    2    4:areturn         
	}

	public String getName()
	{
		return _fullName.getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field PropertyName _fullName>
	//    2    4:invokevirtual   #117 <Method String PropertyName.getSimpleName()>
	//    3    7:areturn         
	}

	public AnnotatedMember getPrimaryMember()
	{
		return _member;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedMember _member>
	//    2    4:areturn         
	}

	public JavaType getPrimaryType()
	{
		AnnotatedMember annotatedmember = _member;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedMember _member>
	//    2    4:astore_1        
		if(annotatedmember == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return TypeFactory.unknownType();
	//    5    9:invokestatic    #126 <Method JavaType TypeFactory.unknownType()>
	//    6   12:areturn         
		else
			return annotatedmember.getType();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #131 <Method JavaType AnnotatedMember.getType()>
	//    9   17:areturn         
	}

	public Class getRawPrimaryType()
	{
		AnnotatedMember annotatedmember = _member;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedMember _member>
	//    2    4:astore_1        
		if(annotatedmember == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       12
			return java/lang/Object;
	//    5    9:ldc1            #135 <Class Object>
	//    6   11:areturn         
		else
			return annotatedmember.getRawType();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #138 <Method Class AnnotatedMember.getRawType()>
	//    9   16:areturn         
	}

	public AnnotatedMethod getSetter()
	{
		AnnotatedMember annotatedmember = _member;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedMember _member>
	//    2    4:astore_1        
		if((annotatedmember instanceof AnnotatedMethod) && ((AnnotatedMethod)annotatedmember).getParameterCount() == 1)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #104 <Class AnnotatedMethod>
	//*   5    9:ifeq            31
	//*   6   12:aload_1         
	//*   7   13:checkcast       #104 <Class AnnotatedMethod>
	//*   8   16:invokevirtual   #108 <Method int AnnotatedMethod.getParameterCount()>
	//*   9   19:iconst_1        
	//*  10   20:icmpne          31
			return (AnnotatedMethod)_member;
	//   11   23:aload_0         
	//   12   24:getfield        #23  <Field AnnotatedMember _member>
	//   13   27:checkcast       #104 <Class AnnotatedMethod>
	//   14   30:areturn         
		else
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
	}

	public PropertyName getWrapperName()
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_1        
		if(annotationintrospector != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
		{
			AnnotatedMember annotatedmember = _member;
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field AnnotatedMember _member>
	//    7   13:astore_2        
			if(annotatedmember != null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       21
	//*  10   18:goto            27
				return annotationintrospector.findWrapperName(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)));
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #147 <Method PropertyName AnnotationIntrospector.findWrapperName(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   14   26:areturn         
		}
		return null;
	//   15   27:aconst_null     
	//   16   28:areturn         
	}

	public boolean hasConstructorParameter()
	{
		return _member instanceof AnnotatedParameter;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedMember _member>
	//    2    4:instanceof      #73  <Class AnnotatedParameter>
	//    3    7:ireturn         
	}

	public boolean hasField()
	{
		return _member instanceof AnnotatedField;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AnnotatedMember _member>
	//    2    4:instanceof      #98  <Class AnnotatedField>
	//    3    7:ireturn         
	}

	public boolean hasName(PropertyName propertyname)
	{
		return _fullName.equals(((Object) (propertyname)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field PropertyName _fullName>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method boolean PropertyName.equals(Object)>
	//    4    8:ireturn         
	}

	public boolean hasSetter()
	{
		return getSetter() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method AnnotatedMethod getSetter()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isExplicitlyIncluded()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isExplicitlyNamed()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final AnnotationIntrospector _annotationIntrospector;
	protected final PropertyName _fullName;
	protected final com.fasterxml.jackson.annotation.JsonInclude.Value _inclusion;
	protected final AnnotatedMember _member;
	protected final PropertyMetadata _metadata;
}
