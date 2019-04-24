// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.Annotations;
import java.lang.annotation.Annotation;

// Referenced classes of package com.fasterxml.jackson.databind:
//			BeanProperty, PropertyName, PropertyMetadata, AnnotationIntrospector, 
//			JavaType, SerializerProvider

public static class BeanProperty$Std
	implements BeanProperty
{

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("Instances of ").append(((Object)this).getClass().getName()).append(" should not get visited").toString());
	//    0    0:new             #59  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #61  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #62  <Method void StringBuilder()>
	//    5   11:ldc1            #64  <String "Instances of ">
	//    6   13:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #72  <Method Class Object.getClass()>
	//    9   20:invokevirtual   #78  <Method String Class.getName()>
	//   10   23:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #80  <String " should not get visited">
	//   12   28:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   14   34:invokespecial   #84  <Method void UnsupportedOperationException(String)>
	//   15   37:athrow          
	}

	public com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(AnnotationIntrospector annotationintrospector)
	{
		if(_member != null && annotationintrospector != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field AnnotatedMember _member>
	//*   2    4:ifnull          26
	//*   3    7:aload_1         
	//*   4    8:ifnull          26
		{
			annotationintrospector = ((AnnotationIntrospector) (annotationintrospector.findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (_member)))));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field AnnotatedMember _member>
	//    8   16:invokevirtual   #92  <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(com.fasterxml.jackson.databind.introspect.Annotated)>
	//    9   19:astore_1        
			if(annotationintrospector != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          26
				return ((com.fasterxml.jackson.annotation.JsonFormat$Value) (annotationintrospector));
	//   12   24:aload_1         
	//   13   25:areturn         
		}
		return EMPTY_FORMAT;
	//   14   26:getstatic       #96  <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
	//   15   29:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat$Value findPropertyFormat(MapperConfig mapperconfig, Class class1)
	{
		class1 = ((Class) (mapperconfig.getDefaultPropertyFormat(class1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #104 <Method com.fasterxml.jackson.annotation.JsonFormat$Value MapperConfig.getDefaultPropertyFormat(Class)>
	//    3    5:astore_2        
		mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #108 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    6   10:astore_1        
		if(mapperconfig != null && _member != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          22
	//*   9   15:aload_0         
	//*  10   16:getfield        #28  <Field AnnotatedMember _member>
	//*  11   19:ifnonnull       24
	//*  12   22:aload_2         
	//*  13   23:areturn         
	//*  14   24:aload_1         
	//*  15   25:aload_0         
	//*  16   26:getfield        #28  <Field AnnotatedMember _member>
	//*  17   29:invokevirtual   #92  <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  18   32:astore_1        
			if((mapperconfig = ((MapperConfig) (((AnnotationIntrospector) (mapperconfig)).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (_member)))))) != null)
	//*  19   33:aload_1         
	//*  20   34:ifnull          22
				return ((com.fasterxml.jackson.annotation.JsonFormat$Value) (class1)).withOverrides(((com.fasterxml.jackson.annotation.JsonFormat$Value) (mapperconfig)));
	//   21   37:aload_2         
	//   22   38:aload_1         
	//   23   39:invokevirtual   #114 <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.withOverrides(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   24   42:areturn         
		return ((com.fasterxml.jackson.annotation.JsonFormat$Value) (class1));
	}

	public com.fasterxml.jackson.annotation. findPropertyInclusion(MapperConfig mapperconfig, Class class1)
	{
		class1 = ((Class) (mapperconfig.getDefaultPropertyInclusion(class1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #122 <Method com.fasterxml.jackson.annotation.JsonInclude$Value MapperConfig.getDefaultPropertyInclusion(Class)>
	//    3    5:astore_2        
		mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #108 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    6   10:astore_1        
		if(mapperconfig != null && _member != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          22
	//*   9   15:aload_0         
	//*  10   16:getfield        #28  <Field AnnotatedMember _member>
	//*  11   19:ifnonnull       24
	//*  12   22:aload_2         
	//*  13   23:areturn         
	//*  14   24:aload_1         
	//*  15   25:aload_0         
	//*  16   26:getfield        #28  <Field AnnotatedMember _member>
	//*  17   29:invokevirtual   #125 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  18   32:astore_1        
			if((mapperconfig = ((MapperConfig) (((AnnotationIntrospector) (mapperconfig)).findPropertyInclusion(((com.fasterxml.jackson.databind.introspect.Annotated) (_member)))))) != null)
	//*  19   33:aload_1         
	//*  20   34:ifnull          22
				return ((com.fasterxml.jackson.annotation.) (class1)).withOverrides(((com.fasterxml.jackson.annotation.) (mapperconfig)));
	//   21   37:aload_2         
	//   22   38:aload_1         
	//   23   39:invokevirtual   #130 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   24   42:areturn         
		return ((com.fasterxml.jackson.annotation.) (class1));
	}

	public Annotation getAnnotation(Class class1)
	{
		if(_member == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field AnnotatedMember _member>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _member.getAnnotation(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field AnnotatedMember _member>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #137 <Method Annotation AnnotatedMember.getAnnotation(Class)>
	//    9   17:areturn         
	}

	public Annotation getContextAnnotation(Class class1)
	{
		if(_contextAnnotations == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Annotations _contextAnnotations>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _contextAnnotations.get(class1);
	//    5    9:aload_0         
	//    6   10:getfield        #26  <Field Annotations _contextAnnotations>
	//    7   13:aload_1         
	//    8   14:invokeinterface #144 <Method Annotation Annotations.get(Class)>
	//    9   19:areturn         
	}

	public PropertyName getFullName()
	{
		return _name;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field PropertyName _name>
	//    2    4:areturn         
	}

	public AnnotatedMember getMember()
	{
		return _member;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field AnnotatedMember _member>
	//    2    4:areturn         
	}

	public PropertyMetadata getMetadata()
	{
		return _metadata;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field PropertyMetadata _metadata>
	//    2    4:areturn         
	}

	public String getName()
	{
		return _name.getSimpleName();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field PropertyName _name>
	//    2    4:invokevirtual   #153 <Method String PropertyName.getSimpleName()>
	//    3    7:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JavaType _type>
	//    2    4:areturn         
	}

	public PropertyName getWrapperName()
	{
		return _wrapperName;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field PropertyName _wrapperName>
	//    2    4:areturn         
	}

	public boolean isRequired()
	{
		return _metadata.isRequired();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field PropertyMetadata _metadata>
	//    2    4:invokevirtual   #160 <Method boolean PropertyMetadata.isRequired()>
	//    3    7:ireturn         
	}

	public boolean isVirtual()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public BeanProperty$Std withType(JavaType javatype)
	{
		return new BeanProperty$Std(this, javatype);
	//    0    0:new             #2   <Class BeanProperty$Std>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #165 <Method void BeanProperty$Std(BeanProperty$Std, JavaType)>
	//    5    9:areturn         
	}

	protected final Annotations _contextAnnotations;
	protected final AnnotatedMember _member;
	protected final PropertyMetadata _metadata;
	protected final PropertyName _name;
	protected final JavaType _type;
	protected final PropertyName _wrapperName;

	public BeanProperty$Std(BeanProperty$Std beanproperty$std, JavaType javatype)
	{
		this(beanproperty$std._name, javatype, beanproperty$std._wrapperName, beanproperty$std._contextAnnotations, beanproperty$std._member, beanproperty$std._metadata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #22  <Field PropertyName _name>
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:getfield        #24  <Field PropertyName _wrapperName>
	//    6   10:aload_1         
	//    7   11:getfield        #26  <Field Annotations _contextAnnotations>
	//    8   14:aload_1         
	//    9   15:getfield        #28  <Field AnnotatedMember _member>
	//   10   18:aload_1         
	//   11   19:getfield        #30  <Field PropertyMetadata _metadata>
	//   12   22:invokespecial   #33  <Method void BeanProperty$Std(PropertyName, JavaType, PropertyName, Annotations, AnnotatedMember, PropertyMetadata)>
	//   13   25:return          
	}

	public BeanProperty$Std(PropertyName propertyname, JavaType javatype, PropertyName propertyname1, Annotations annotations, AnnotatedMember annotatedmember, PropertyMetadata propertymetadata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		_name = propertyname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field PropertyName _name>
		_type = javatype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field JavaType _type>
		_wrapperName = propertyname1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #24  <Field PropertyName _wrapperName>
		_metadata = propertymetadata;
	//   11   19:aload_0         
	//   12   20:aload           6
	//   13   22:putfield        #30  <Field PropertyMetadata _metadata>
		_member = annotatedmember;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #28  <Field AnnotatedMember _member>
		_contextAnnotations = annotations;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #26  <Field Annotations _contextAnnotations>
	//   20   37:return          
	}

	public BeanProperty$Std(String s, JavaType javatype, PropertyName propertyname, Annotations annotations, AnnotatedMember annotatedmember, boolean flag)
	{
		PropertyName propertyname1 = new PropertyName(s);
	//    0    0:new             #43  <Class PropertyName>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #46  <Method void PropertyName(String)>
	//    4    8:astore          7
		if(flag)
	//*   5   10:iload           6
	//*   6   12:ifeq            33
			s = ((String) (PropertyMetadata.STD_REQUIRED));
	//    7   15:getstatic       #51  <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//    8   18:astore_1        
		else
	//*   9   19:aload_0         
	//*  10   20:aload           7
	//*  11   22:aload_2         
	//*  12   23:aload_3         
	//*  13   24:aload           4
	//*  14   26:aload           5
	//*  15   28:aload_1         
	//*  16   29:invokespecial   #33  <Method void BeanProperty$Std(PropertyName, JavaType, PropertyName, Annotations, AnnotatedMember, PropertyMetadata)>
	//*  17   32:return          
			s = ((String) (PropertyMetadata.STD_OPTIONAL));
	//   18   33:getstatic       #54  <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//   19   36:astore_1        
		this(propertyname1, javatype, propertyname, annotations, annotatedmember, ((PropertyMetadata) (s)));
	//*  20   37:goto            19
	}
}
