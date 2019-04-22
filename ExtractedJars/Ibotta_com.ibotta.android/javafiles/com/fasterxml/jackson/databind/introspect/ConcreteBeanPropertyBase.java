// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedMember

public abstract class ConcreteBeanPropertyBase
	implements BeanProperty, Serializable
{

	protected ConcreteBeanPropertyBase(PropertyMetadata propertymetadata)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		PropertyMetadata propertymetadata1 = propertymetadata;
	//    2    4:aload_1         
	//    3    5:astore_2        
		if(propertymetadata == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       14
			propertymetadata1 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
	//    6   10:getstatic       #29  <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
	//    7   13:astore_2        
		_metadata = propertymetadata1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #31  <Field PropertyMetadata _metadata>
	//   11   19:return          
	}

	protected ConcreteBeanPropertyBase(ConcreteBeanPropertyBase concretebeanpropertybase)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_metadata = concretebeanpropertybase._metadata;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #31  <Field PropertyMetadata _metadata>
	//    5    9:putfield        #31  <Field PropertyMetadata _metadata>
		_propertyFormat = concretebeanpropertybase._propertyFormat;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #35  <Field com.fasterxml.jackson.annotation.JsonFormat$Value _propertyFormat>
	//    9   17:putfield        #35  <Field com.fasterxml.jackson.annotation.JsonFormat$Value _propertyFormat>
	//   10   20:return          
	}

	public List findAliases(MapperConfig mapperconfig)
	{
		Object obj = ((Object) (_aliases));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field List _aliases>
	//    2    4:astore_2        
		Object obj1 = obj;
	//    3    5:aload_2         
	//    4    6:astore_3        
		if(obj == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       48
		{
			obj1 = ((Object) (mapperconfig.getAnnotationIntrospector()));
	//    7   11:aload_1         
	//    8   12:invokevirtual   #45  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    9   15:astore_3        
			mapperconfig = ((MapperConfig) (obj));
	//   10   16:aload_2         
	//   11   17:astore_1        
			if(obj1 != null)
	//*  12   18:aload_3         
	//*  13   19:ifnull          31
				mapperconfig = ((MapperConfig) (((AnnotationIntrospector) (obj1)).findPropertyAliases(((Annotated) (getMember())))));
	//   14   22:aload_3         
	//   15   23:aload_0         
	//   16   24:invokevirtual   #49  <Method AnnotatedMember getMember()>
	//   17   27:invokevirtual   #55  <Method List AnnotationIntrospector.findPropertyAliases(Annotated)>
	//   18   30:astore_1        
			obj = ((Object) (mapperconfig));
	//   19   31:aload_1         
	//   20   32:astore_2        
			if(mapperconfig == null)
	//*  21   33:aload_1         
	//*  22   34:ifnonnull       41
				obj = ((Object) (Collections.emptyList()));
	//   23   37:invokestatic    #61  <Method List Collections.emptyList()>
	//   24   40:astore_2        
			_aliases = ((List) (obj));
	//   25   41:aload_0         
	//   26   42:aload_2         
	//   27   43:putfield        #39  <Field List _aliases>
			obj1 = obj;
	//   28   46:aload_2         
	//   29   47:astore_3        
		}
		return ((List) (obj1));
	//   30   48:aload_3         
	//   31   49:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationintrospector)
	{
label0:
		{
			if(annotationintrospector != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
			{
				AnnotatedMember annotatedmember = getMember();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #49  <Method AnnotatedMember getMember()>
	//    4    8:astore_2        
				if(annotatedmember != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          22
				{
					annotationintrospector = ((AnnotationIntrospector) (annotationintrospector.findFormat(((Annotated) (annotatedmember)))));
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #70  <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
	//   10   18:astore_1        
					break label0;
	//   11   19:goto            24
				}
			}
			annotationintrospector = null;
	//   12   22:aconst_null     
	//   13   23:astore_1        
		}
		Object obj = ((Object) (annotationintrospector));
	//   14   24:aload_1         
	//   15   25:astore_2        
		if(annotationintrospector == null)
	//*  16   26:aload_1         
	//*  17   27:ifnonnull       34
			obj = ((Object) (EMPTY_FORMAT));
	//   18   30:getstatic       #73  <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
	//   19   33:astore_2        
		return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj));
	//   20   34:aload_2         
	//   21   35:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findPropertyFormat(MapperConfig mapperconfig, Class class1)
	{
		com.fasterxml.jackson.annotation.JsonFormat.Value value = _propertyFormat;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field com.fasterxml.jackson.annotation.JsonFormat$Value _propertyFormat>
	//    2    4:astore          4
		Object obj = ((Object) (value));
	//    3    6:aload           4
	//    4    8:astore_3        
		if(value == null)
	//*   5    9:aload           4
	//*   6   11:ifnonnull       95
		{
			obj = ((Object) (mapperconfig.getDefaultPropertyFormat(class1)));
	//    7   14:aload_1         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #80  <Method com.fasterxml.jackson.annotation.JsonFormat$Value MapperConfig.getDefaultPropertyFormat(Class)>
	//   10   19:astore_3        
			Object obj1 = null;
	//   11   20:aconst_null     
	//   12   21:astore          4
			mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
	//   13   23:aload_1         
	//   14   24:invokevirtual   #45  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   15   27:astore_1        
			class1 = ((Class) (obj1));
	//   16   28:aload           4
	//   17   30:astore_2        
			if(mapperconfig != null)
	//*  18   31:aload_1         
	//*  19   32:ifnull          56
			{
				AnnotatedMember annotatedmember = getMember();
	//   20   35:aload_0         
	//   21   36:invokevirtual   #49  <Method AnnotatedMember getMember()>
	//   22   39:astore          5
				class1 = ((Class) (obj1));
	//   23   41:aload           4
	//   24   43:astore_2        
				if(annotatedmember != null)
	//*  25   44:aload           5
	//*  26   46:ifnull          56
					class1 = ((Class) (((AnnotationIntrospector) (mapperconfig)).findFormat(((Annotated) (annotatedmember)))));
	//   27   49:aload_1         
	//   28   50:aload           5
	//   29   52:invokevirtual   #70  <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
	//   30   55:astore_2        
			}
			if(obj == null)
	//*  31   56:aload_3         
	//*  32   57:ifnonnull       73
			{
				mapperconfig = ((MapperConfig) (class1));
	//   33   60:aload_2         
	//   34   61:astore_1        
				if(class1 == null)
	//*  35   62:aload_2         
	//*  36   63:ifnonnull       88
					mapperconfig = ((MapperConfig) (EMPTY_FORMAT));
	//   37   66:getstatic       #73  <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
	//   38   69:astore_1        
			} else
	//*  39   70:goto            88
			if(class1 == null)
	//*  40   73:aload_2         
	//*  41   74:ifnonnull       82
				mapperconfig = ((MapperConfig) (obj));
	//   42   77:aload_3         
	//   43   78:astore_1        
			else
	//*  44   79:goto            88
				mapperconfig = ((MapperConfig) (((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)).withOverrides(((com.fasterxml.jackson.annotation.JsonFormat.Value) (class1)))));
	//   45   82:aload_3         
	//   46   83:aload_2         
	//   47   84:invokevirtual   #86  <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.withOverrides(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   48   87:astore_1        
			_propertyFormat = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (mapperconfig));
	//   49   88:aload_0         
	//   50   89:aload_1         
	//   51   90:putfield        #35  <Field com.fasterxml.jackson.annotation.JsonFormat$Value _propertyFormat>
			obj = ((Object) (mapperconfig));
	//   52   93:aload_1         
	//   53   94:astore_3        
		}
		return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj));
	//   54   95:aload_3         
	//   55   96:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(MapperConfig mapperconfig, Class class1)
	{
		AnnotationIntrospector annotationintrospector = mapperconfig.getAnnotationIntrospector();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//    2    4:astore_3        
		AnnotatedMember annotatedmember = getMember();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #49  <Method AnnotatedMember getMember()>
	//    5    9:astore          4
		if(annotatedmember == null)
	//*   6   11:aload           4
	//*   7   13:ifnonnull       22
			return mapperconfig.getDefaultPropertyInclusion(class1);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #93  <Method com.fasterxml.jackson.annotation.JsonInclude$Value MapperConfig.getDefaultPropertyInclusion(Class)>
	//   11   21:areturn         
		mapperconfig = ((MapperConfig) (mapperconfig.getDefaultInclusion(class1, annotatedmember.getRawType())));
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload           4
	//   15   26:invokevirtual   #99  <Method Class AnnotatedMember.getRawType()>
	//   16   29:invokevirtual   #103 <Method com.fasterxml.jackson.annotation.JsonInclude$Value MapperConfig.getDefaultInclusion(Class, Class)>
	//   17   32:astore_1        
		if(annotationintrospector == null)
	//*  18   33:aload_3         
	//*  19   34:ifnonnull       39
			return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (mapperconfig));
	//   20   37:aload_1         
	//   21   38:areturn         
		class1 = ((Class) (annotationintrospector.findPropertyInclusion(((Annotated) (annotatedmember)))));
	//   22   39:aload_3         
	//   23   40:aload           4
	//   24   42:invokevirtual   #106 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
	//   25   45:astore_2        
		if(mapperconfig == null)
	//*  26   46:aload_1         
	//*  27   47:ifnonnull       52
			return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1));
	//   28   50:aload_2         
	//   29   51:areturn         
		else
			return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (mapperconfig)).withOverrides(((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1)));
	//   30   52:aload_1         
	//   31   53:aload_2         
	//   32   54:invokevirtual   #111 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   33   57:areturn         
	}

	public PropertyMetadata getMetadata()
	{
		return _metadata;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field PropertyMetadata _metadata>
	//    2    4:areturn         
	}

	public boolean isRequired()
	{
		return _metadata.isRequired();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field PropertyMetadata _metadata>
	//    2    4:invokevirtual   #118 <Method boolean PropertyMetadata.isRequired()>
	//    3    7:ireturn         
	}

	public boolean isVirtual()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private static final long serialVersionUID = 1L;
	protected transient List _aliases;
	protected final PropertyMetadata _metadata;
	protected transient com.fasterxml.jackson.annotation.JsonFormat.Value _propertyFormat;
}
