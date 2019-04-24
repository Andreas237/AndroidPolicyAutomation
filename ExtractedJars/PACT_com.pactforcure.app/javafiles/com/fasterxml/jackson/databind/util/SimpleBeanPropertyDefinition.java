// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

public class SimpleBeanPropertyDefinition extends BeanPropertyDefinition
{

	protected SimpleBeanPropertyDefinition(AnnotatedMember annotatedmember, PropertyName propertyname, AnnotationIntrospector annotationintrospector, PropertyMetadata propertymetadata, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		if(include == null || include == com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*   0    0:aload           5
	//*   1    2:ifnull          13
	//*   2    5:aload           5
	//*   3    7:getstatic       #25  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*   4   10:if_acmpne       30
			include = ((com.fasterxml.jackson.annotation.JsonInclude.Include) (EMPTY_INCLUDE));
	//    5   13:getstatic       #28  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//    6   16:astore          5
		else
	//*   7   18:aload_0         
	//*   8   19:aload_1         
	//*   9   20:aload_2         
	//*  10   21:aload_3         
	//*  11   22:aload           4
	//*  12   24:aload           5
	//*  13   26:invokespecial   #31  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//*  14   29:return          
			include = ((com.fasterxml.jackson.annotation.JsonInclude.Include) (com.fasterxml.jackson.annotation.JsonInclude.Value.construct(include, ((com.fasterxml.jackson.annotation.JsonInclude.Include) (null)))));
	//   15   30:aload           5
	//   16   32:aconst_null     
	//   17   33:invokestatic    #37  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.construct(com.fasterxml.jackson.annotation.JsonInclude$Include, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   18   36:astore          5
		this(annotatedmember, propertyname, annotationintrospector, propertymetadata, ((com.fasterxml.jackson.annotation.JsonInclude.Value) (include)));
	//*  19   38:goto            18
	}

	protected SimpleBeanPropertyDefinition(AnnotatedMember annotatedmember, PropertyName propertyname, AnnotationIntrospector annotationintrospector, PropertyMetadata propertymetadata, com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void BeanPropertyDefinition()>
		_introspector = annotationintrospector;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #43  <Field AnnotationIntrospector _introspector>
		_member = annotatedmember;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #45  <Field AnnotatedMember _member>
		_fullName = propertyname;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #47  <Field PropertyName _fullName>
		_name = propertyname.getSimpleName();
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #53  <Method String PropertyName.getSimpleName()>
	//   14   24:putfield        #55  <Field String _name>
		annotatedmember = ((AnnotatedMember) (propertymetadata));
	//   15   27:aload           4
	//   16   29:astore_1        
		if(propertymetadata == null)
	//*  17   30:aload           4
	//*  18   32:ifnonnull       39
			annotatedmember = ((AnnotatedMember) (PropertyMetadata.STD_OPTIONAL));
	//   19   35:getstatic       #60  <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//   20   38:astore_1        
		_metadata = ((PropertyMetadata) (annotatedmember));
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:putfield        #62  <Field PropertyMetadata _metadata>
		_inclusion = value;
	//   24   44:aload_0         
	//   25   45:aload           5
	//   26   47:putfield        #64  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _inclusion>
	//   27   50:return          
	}

	protected SimpleBeanPropertyDefinition(AnnotatedMember annotatedmember, String s, AnnotationIntrospector annotationintrospector)
	{
		this(annotatedmember, new PropertyName(s), annotationintrospector, ((PropertyMetadata) (null)), EMPTY_INCLUDE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #49  <Class PropertyName>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #68  <Method void PropertyName(String)>
	//    6   10:aload_3         
	//    7   11:aconst_null     
	//    8   12:getstatic       #28  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//    9   15:invokespecial   #31  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   10   18:return          
	}

	public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember)
	{
		PropertyName propertyname = PropertyName.construct(annotatedmember.getName());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #75  <Method String AnnotatedMember.getName()>
	//    2    4:invokestatic    #78  <Method PropertyName PropertyName.construct(String)>
	//    3    7:astore_2        
		if(mapperconfig == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       29
			mapperconfig = null;
	//    6   12:aconst_null     
	//    7   13:astore_0        
		else
	//*   8   14:new             #2   <Class SimpleBeanPropertyDefinition>
	//*   9   17:dup             
	//*  10   18:aload_1         
	//*  11   19:aload_2         
	//*  12   20:aload_0         
	//*  13   21:aconst_null     
	//*  14   22:getstatic       #28  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//*  15   25:invokespecial   #31  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//*  16   28:areturn         
			mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//   17   29:aload_0         
	//   18   30:invokevirtual   #84  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   19   33:astore_0        
		return new SimpleBeanPropertyDefinition(annotatedmember, propertyname, ((AnnotationIntrospector) (mapperconfig)), ((PropertyMetadata) (null)), EMPTY_INCLUDE);
	//*  20   34:goto            14
	}

	public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember, PropertyName propertyname)
	{
		return construct(mapperconfig, annotatedmember, propertyname, ((PropertyMetadata) (null)), EMPTY_INCLUDE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:getstatic       #28  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//    5    7:invokestatic    #90  <Method SimpleBeanPropertyDefinition construct(MapperConfig, AnnotatedMember, PropertyName, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    6   10:areturn         
	}

	public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember, PropertyName propertyname, PropertyMetadata propertymetadata, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		if(mapperconfig == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       20
			mapperconfig = null;
	//    2    4:aconst_null     
	//    3    5:astore_0        
		else
	//*   4    6:new             #2   <Class SimpleBeanPropertyDefinition>
	//*   5    9:dup             
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:aload_0         
	//*   9   13:aload_3         
	//*  10   14:aload           4
	//*  11   16:invokespecial   #94  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//*  12   19:areturn         
			mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//   13   20:aload_0         
	//   14   21:invokevirtual   #84  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   15   24:astore_0        
		return new SimpleBeanPropertyDefinition(annotatedmember, propertyname, ((AnnotationIntrospector) (mapperconfig)), propertymetadata, include);
	//*  16   25:goto            6
	}

	public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember, PropertyName propertyname, PropertyMetadata propertymetadata, com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		if(mapperconfig == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       20
			mapperconfig = null;
	//    2    4:aconst_null     
	//    3    5:astore_0        
		else
	//*   4    6:new             #2   <Class SimpleBeanPropertyDefinition>
	//*   5    9:dup             
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:aload_0         
	//*   9   13:aload_3         
	//*  10   14:aload           4
	//*  11   16:invokespecial   #31  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//*  12   19:areturn         
			mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//   13   20:aload_0         
	//   14   21:invokevirtual   #84  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   15   24:astore_0        
		return new SimpleBeanPropertyDefinition(annotatedmember, propertyname, ((AnnotationIntrospector) (mapperconfig)), propertymetadata, value);
	//*  16   25:goto            6
	}

	public static SimpleBeanPropertyDefinition construct(MapperConfig mapperconfig, AnnotatedMember annotatedmember, String s)
	{
		s = ((String) (PropertyName.construct(s)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #78  <Method PropertyName PropertyName.construct(String)>
	//    2    4:astore_2        
		if(mapperconfig == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       26
			mapperconfig = null;
	//    5    9:aconst_null     
	//    6   10:astore_0        
		else
	//*   7   11:new             #2   <Class SimpleBeanPropertyDefinition>
	//*   8   14:dup             
	//*   9   15:aload_1         
	//*  10   16:aload_2         
	//*  11   17:aload_0         
	//*  12   18:aconst_null     
	//*  13   19:getstatic       #28  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//*  14   22:invokespecial   #31  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//*  15   25:areturn         
			mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//   16   26:aload_0         
	//   17   27:invokevirtual   #84  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   18   30:astore_0        
		return new SimpleBeanPropertyDefinition(annotatedmember, ((PropertyName) (s)), ((AnnotationIntrospector) (mapperconfig)), ((PropertyMetadata) (null)), EMPTY_INCLUDE);
	//*  19   31:goto            11
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findInclusion()
	{
		return _inclusion;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _inclusion>
	//    2    4:areturn         
	}

	public AnnotatedMember getAccessor()
	{
		AnnotatedMethod annotatedmethod = getGetter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method AnnotatedMethod getGetter()>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedmethod));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedmethod == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			obj = ((Object) (getField()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #110 <Method AnnotatedField getField()>
	//    9   15:astore_1        
		return ((AnnotatedMember) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public AnnotatedParameter getConstructorParameter()
	{
		if(_member instanceof AnnotatedParameter)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field AnnotatedMember _member>
	//*   2    4:instanceof      #114 <Class AnnotatedParameter>
	//*   3    7:ifeq            18
			return (AnnotatedParameter)_member;
	//    4   10:aload_0         
	//    5   11:getfield        #45  <Field AnnotatedMember _member>
	//    6   14:checkcast       #114 <Class AnnotatedParameter>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public Iterator getConstructorParameters()
	{
		AnnotatedParameter annotatedparameter = getConstructorParameter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method AnnotatedParameter getConstructorParameter()>
	//    2    4:astore_1        
		if(annotatedparameter == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       13
			return ClassUtil.emptyIterator();
	//    5    9:invokestatic    #123 <Method Iterator ClassUtil.emptyIterator()>
	//    6   12:areturn         
		else
			return Collections.singleton(((Object) (annotatedparameter))).iterator();
	//    7   13:aload_1         
	//    8   14:invokestatic    #129 <Method Set Collections.singleton(Object)>
	//    9   17:invokeinterface #134 <Method Iterator Set.iterator()>
	//   10   22:areturn         
	}

	public AnnotatedField getField()
	{
		if(_member instanceof AnnotatedField)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field AnnotatedMember _member>
	//*   2    4:instanceof      #137 <Class AnnotatedField>
	//*   3    7:ifeq            18
			return (AnnotatedField)_member;
	//    4   10:aload_0         
	//    5   11:getfield        #45  <Field AnnotatedMember _member>
	//    6   14:checkcast       #137 <Class AnnotatedField>
	//    7   17:areturn         
		else
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
	}

	public PropertyName getFullName()
	{
		return _fullName;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field PropertyName _fullName>
	//    2    4:areturn         
	}

	public AnnotatedMethod getGetter()
	{
		if((_member instanceof AnnotatedMethod) && ((AnnotatedMethod)_member).getParameterCount() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field AnnotatedMember _member>
	//*   2    4:instanceof      #141 <Class AnnotatedMethod>
	//*   3    7:ifeq            31
	//*   4   10:aload_0         
	//*   5   11:getfield        #45  <Field AnnotatedMember _member>
	//*   6   14:checkcast       #141 <Class AnnotatedMethod>
	//*   7   17:invokevirtual   #145 <Method int AnnotatedMethod.getParameterCount()>
	//*   8   20:ifne            31
			return (AnnotatedMethod)_member;
	//    9   23:aload_0         
	//   10   24:getfield        #45  <Field AnnotatedMember _member>
	//   11   27:checkcast       #141 <Class AnnotatedMethod>
	//   12   30:areturn         
		else
			return null;
	//   13   31:aconst_null     
	//   14   32:areturn         
	}

	public String getInternalName()
	{
		return getName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method String getName()>
	//    2    4:areturn         
	}

	public PropertyMetadata getMetadata()
	{
		return _metadata;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field PropertyMetadata _metadata>
	//    2    4:areturn         
	}

	public AnnotatedMember getMutator()
	{
		AnnotatedParameter annotatedparameter = getConstructorParameter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #118 <Method AnnotatedParameter getConstructorParameter()>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedparameter));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedparameter == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       27
		{
			AnnotatedMethod annotatedmethod = getSetter();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #153 <Method AnnotatedMethod getSetter()>
	//    9   15:astore_2        
			obj = ((Object) (annotatedmethod));
	//   10   16:aload_2         
	//   11   17:astore_1        
			if(annotatedmethod == null)
	//*  12   18:aload_2         
	//*  13   19:ifnonnull       27
				obj = ((Object) (getField()));
	//   14   22:aload_0         
	//   15   23:invokevirtual   #110 <Method AnnotatedField getField()>
	//   16   26:astore_1        
		}
		return ((AnnotatedMember) (obj));
	//   17   27:aload_1         
	//   18   28:areturn         
	}

	public String getName()
	{
		return _fullName.getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field PropertyName _fullName>
	//    2    4:invokevirtual   #53  <Method String PropertyName.getSimpleName()>
	//    3    7:areturn         
	}

	public AnnotatedMember getNonConstructorMutator()
	{
		AnnotatedMethod annotatedmethod = getSetter();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #153 <Method AnnotatedMethod getSetter()>
	//    2    4:astore_2        
		Object obj = ((Object) (annotatedmethod));
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(annotatedmethod == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			obj = ((Object) (getField()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #110 <Method AnnotatedField getField()>
	//    9   15:astore_1        
		return ((AnnotatedMember) (obj));
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public AnnotatedMember getPrimaryMember()
	{
		return _member;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AnnotatedMember _member>
	//    2    4:areturn         
	}

	public AnnotatedMethod getSetter()
	{
		if((_member instanceof AnnotatedMethod) && ((AnnotatedMethod)_member).getParameterCount() == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field AnnotatedMember _member>
	//*   2    4:instanceof      #141 <Class AnnotatedMethod>
	//*   3    7:ifeq            32
	//*   4   10:aload_0         
	//*   5   11:getfield        #45  <Field AnnotatedMember _member>
	//*   6   14:checkcast       #141 <Class AnnotatedMethod>
	//*   7   17:invokevirtual   #145 <Method int AnnotatedMethod.getParameterCount()>
	//*   8   20:iconst_1        
	//*   9   21:icmpne          32
			return (AnnotatedMethod)_member;
	//   10   24:aload_0         
	//   11   25:getfield        #45  <Field AnnotatedMember _member>
	//   12   28:checkcast       #141 <Class AnnotatedMethod>
	//   13   31:areturn         
		else
			return null;
	//   14   32:aconst_null     
	//   15   33:areturn         
	}

	public PropertyName getWrapperName()
	{
		if(_introspector == null && _member != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field AnnotationIntrospector _introspector>
	//*   2    4:ifnonnull       16
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field AnnotatedMember _member>
	//*   5   11:ifnull          16
			return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
		else
			return _introspector.findWrapperName(((com.fasterxml.jackson.databind.introspect.Annotated) (_member)));
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field AnnotationIntrospector _introspector>
	//   10   20:aload_0         
	//   11   21:getfield        #45  <Field AnnotatedMember _member>
	//   12   24:invokevirtual   #162 <Method PropertyName AnnotationIntrospector.findWrapperName(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   13   27:areturn         
	}

	public boolean hasConstructorParameter()
	{
		return _member instanceof AnnotatedParameter;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AnnotatedMember _member>
	//    2    4:instanceof      #114 <Class AnnotatedParameter>
	//    3    7:ireturn         
	}

	public boolean hasField()
	{
		return _member instanceof AnnotatedField;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AnnotatedMember _member>
	//    2    4:instanceof      #137 <Class AnnotatedField>
	//    3    7:ireturn         
	}

	public boolean hasGetter()
	{
		return getGetter() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #106 <Method AnnotatedMethod getGetter()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasName(PropertyName propertyname)
	{
		return _fullName.equals(((Object) (propertyname)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field PropertyName _fullName>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #172 <Method boolean PropertyName.equals(Object)>
	//    4    8:ireturn         
	}

	public boolean hasSetter()
	{
		return getSetter() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #153 <Method AnnotatedMethod getSetter()>
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

	public BeanPropertyDefinition withInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		if(_inclusion == value)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _inclusion>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((BeanPropertyDefinition) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((BeanPropertyDefinition) (new SimpleBeanPropertyDefinition(_member, _fullName, _introspector, _metadata, value)));
	//    6   10:new             #2   <Class SimpleBeanPropertyDefinition>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field AnnotatedMember _member>
	//   10   18:aload_0         
	//   11   19:getfield        #47  <Field PropertyName _fullName>
	//   12   22:aload_0         
	//   13   23:getfield        #43  <Field AnnotationIntrospector _introspector>
	//   14   26:aload_0         
	//   15   27:getfield        #62  <Field PropertyMetadata _metadata>
	//   16   30:aload_1         
	//   17   31:invokespecial   #31  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   18   34:areturn         
	}

	public BeanPropertyDefinition withMetadata(PropertyMetadata propertymetadata)
	{
		if(((Object) (propertymetadata)).equals(((Object) (_metadata))))
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #62  <Field PropertyMetadata _metadata>
	//*   3    5:invokevirtual   #182 <Method boolean Object.equals(Object)>
	//*   4    8:ifeq            13
			return ((BeanPropertyDefinition) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return ((BeanPropertyDefinition) (new SimpleBeanPropertyDefinition(_member, _fullName, _introspector, propertymetadata, _inclusion)));
	//    7   13:new             #2   <Class SimpleBeanPropertyDefinition>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field AnnotatedMember _member>
	//   11   21:aload_0         
	//   12   22:getfield        #47  <Field PropertyName _fullName>
	//   13   25:aload_0         
	//   14   26:getfield        #43  <Field AnnotationIntrospector _introspector>
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _inclusion>
	//   18   34:invokespecial   #31  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   19   37:areturn         
	}

	public BeanPropertyDefinition withName(PropertyName propertyname)
	{
		if(_fullName.equals(((Object) (propertyname))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field PropertyName _fullName>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #172 <Method boolean PropertyName.equals(Object)>
	//*   4    8:ifeq            13
			return ((BeanPropertyDefinition) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return ((BeanPropertyDefinition) (new SimpleBeanPropertyDefinition(_member, propertyname, _introspector, _metadata, _inclusion)));
	//    7   13:new             #2   <Class SimpleBeanPropertyDefinition>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field AnnotatedMember _member>
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:getfield        #43  <Field AnnotationIntrospector _introspector>
	//   14   26:aload_0         
	//   15   27:getfield        #62  <Field PropertyMetadata _metadata>
	//   16   30:aload_0         
	//   17   31:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _inclusion>
	//   18   34:invokespecial   #31  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   19   37:areturn         
	}

	public BeanPropertyDefinition withName(String s)
	{
		return withSimpleName(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #188 <Method BeanPropertyDefinition withSimpleName(String)>
	//    3    5:areturn         
	}

	public BeanPropertyDefinition withSimpleName(String s)
	{
		if(_fullName.hasSimpleName(s) && !_fullName.hasNamespace())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field PropertyName _fullName>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #192 <Method boolean PropertyName.hasSimpleName(String)>
	//*   4    8:ifeq            23
	//*   5   11:aload_0         
	//*   6   12:getfield        #47  <Field PropertyName _fullName>
	//*   7   15:invokevirtual   #195 <Method boolean PropertyName.hasNamespace()>
	//*   8   18:ifne            23
			return ((BeanPropertyDefinition) (this));
	//    9   21:aload_0         
	//   10   22:areturn         
		else
			return ((BeanPropertyDefinition) (new SimpleBeanPropertyDefinition(_member, new PropertyName(s), _introspector, _metadata, _inclusion)));
	//   11   23:new             #2   <Class SimpleBeanPropertyDefinition>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:getfield        #45  <Field AnnotatedMember _member>
	//   15   31:new             #49  <Class PropertyName>
	//   16   34:dup             
	//   17   35:aload_1         
	//   18   36:invokespecial   #68  <Method void PropertyName(String)>
	//   19   39:aload_0         
	//   20   40:getfield        #43  <Field AnnotationIntrospector _introspector>
	//   21   43:aload_0         
	//   22   44:getfield        #62  <Field PropertyMetadata _metadata>
	//   23   47:aload_0         
	//   24   48:getfield        #64  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _inclusion>
	//   25   51:invokespecial   #31  <Method void SimpleBeanPropertyDefinition(AnnotatedMember, PropertyName, AnnotationIntrospector, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   26   54:areturn         
	}

	protected final PropertyName _fullName;
	protected final com.fasterxml.jackson.annotation.JsonInclude.Value _inclusion;
	protected final AnnotationIntrospector _introspector;
	protected final AnnotatedMember _member;
	protected final PropertyMetadata _metadata;
	protected final String _name;
}
