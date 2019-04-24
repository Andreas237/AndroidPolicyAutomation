// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

public abstract class ConcreteBeanPropertyBase
	implements BeanProperty, Serializable
{

	protected ConcreteBeanPropertyBase(PropertyMetadata propertymetadata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		PropertyMetadata propertymetadata1 = propertymetadata;
	//    2    4:aload_1         
	//    3    5:astore_2        
		if(propertymetadata == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       14
			propertymetadata1 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
	//    6   10:getstatic       #26  <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//    7   13:astore_2        
		_metadata = propertymetadata1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #28  <Field PropertyMetadata _metadata>
	//   11   19:return          
	}

	protected ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concretebeanpropertybase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		_metadata = concretebeanpropertybase._metadata;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #28  <Field PropertyMetadata _metadata>
	//    5    9:putfield        #28  <Field PropertyMetadata _metadata>
		_format = concretebeanpropertybase._format;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #32  <Field com.fasterxml.jackson.annotation.JsonFormat$Value _format>
	//    9   17:putfield        #32  <Field com.fasterxml.jackson.annotation.JsonFormat$Value _format>
	//   10   20:return          
	}

	public final com.fasterxml.jackson.annotation.JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationintrospector)
	{
		com.fasterxml.jackson.annotation.JsonFormat.Value value1 = _format;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field com.fasterxml.jackson.annotation.JsonFormat$Value _format>
	//    2    4:astore          4
		Object obj = ((Object) (value1));
	//    3    6:aload           4
	//    4    8:astore_3        
		if(value1 == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       49
		{
			com.fasterxml.jackson.annotation.JsonFormat.Value value = value1;
	//    7   14:aload           4
	//    8   16:astore_2        
			if(annotationintrospector != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          39
			{
				obj = ((Object) (getMember()));
	//   11   21:aload_0         
	//   12   22:invokevirtual   #39  <Method AnnotatedMember getMember()>
	//   13   25:astore_3        
				value = value1;
	//   14   26:aload           4
	//   15   28:astore_2        
				if(obj != null)
	//*  16   29:aload_3         
	//*  17   30:ifnull          39
					value = annotationintrospector.findFormat(((Annotated) (obj)));
	//   18   33:aload_1         
	//   19   34:aload_3         
	//   20   35:invokevirtual   #45  <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
	//   21   38:astore_2        
			}
			obj = ((Object) (value));
	//   22   39:aload_2         
	//   23   40:astore_3        
			if(value == null)
	//*  24   41:aload_2         
	//*  25   42:ifnonnull       49
				obj = ((Object) (EMPTY_FORMAT));
	//   26   45:getstatic       #48  <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
	//   27   48:astore_3        
		}
		return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj));
	//   28   49:aload_3         
	//   29   50:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findPropertyFormat(MapperConfig mapperconfig, Class class1)
	{
		class1 = ((Class) (mapperconfig.getDefaultPropertyFormat(class1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #57  <Method com.fasterxml.jackson.annotation.JsonFormat$Value MapperConfig.getDefaultPropertyFormat(Class)>
	//    3    5:astore_2        
		mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #61  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    6   10:astore_1        
		AnnotatedMember annotatedmember = getMember();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #39  <Method AnnotatedMember getMember()>
	//    9   15:astore_3        
		if(mapperconfig != null && annotatedmember != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          24
	//*  12   20:aload_3         
	//*  13   21:ifnonnull       26
	//*  14   24:aload_2         
	//*  15   25:areturn         
	//*  16   26:aload_1         
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #45  <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
	//*  19   31:astore_1        
			if((mapperconfig = ((MapperConfig) (((AnnotationIntrospector) (mapperconfig)).findFormat(((Annotated) (annotatedmember)))))) != null)
	//*  20   32:aload_1         
	//*  21   33:ifnull          24
				return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (class1)).withOverrides(((com.fasterxml.jackson.annotation.JsonFormat.Value) (mapperconfig)));
	//   22   36:aload_2         
	//   23   37:aload_1         
	//   24   38:invokevirtual   #67  <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.withOverrides(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   25   41:areturn         
		return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (class1));
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(MapperConfig mapperconfig, Class class1)
	{
		class1 = ((Class) (mapperconfig.getDefaultPropertyInclusion(class1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #75  <Method com.fasterxml.jackson.annotation.JsonInclude$Value MapperConfig.getDefaultPropertyInclusion(Class)>
	//    3    5:astore_2        
		mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #61  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    6   10:astore_1        
		AnnotatedMember annotatedmember = getMember();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #39  <Method AnnotatedMember getMember()>
	//    9   15:astore_3        
		if(mapperconfig != null && annotatedmember != null)
	//*  10   16:aload_1         
	//*  11   17:ifnull          24
	//*  12   20:aload_3         
	//*  13   21:ifnonnull       26
	//*  14   24:aload_2         
	//*  15   25:areturn         
	//*  16   26:aload_1         
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #78  <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
	//*  19   31:astore_1        
			if((mapperconfig = ((MapperConfig) (((AnnotationIntrospector) (mapperconfig)).findPropertyInclusion(((Annotated) (annotatedmember)))))) != null)
	//*  20   32:aload_1         
	//*  21   33:ifnull          24
				return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1)).withOverrides(((com.fasterxml.jackson.annotation.JsonInclude.Value) (mapperconfig)));
	//   22   36:aload_2         
	//   23   37:aload_1         
	//   24   38:invokevirtual   #83  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   25   41:areturn         
		return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1));
	}

	public PropertyMetadata getMetadata()
	{
		return _metadata;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PropertyMetadata _metadata>
	//    2    4:areturn         
	}

	public boolean isRequired()
	{
		return _metadata.isRequired();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field PropertyMetadata _metadata>
	//    2    4:invokevirtual   #90  <Method boolean PropertyMetadata.isRequired()>
	//    3    7:ireturn         
	}

	public boolean isVirtual()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected transient com.fasterxml.jackson.annotation.JsonFormat.Value _format;
	protected final PropertyMetadata _metadata;
}
