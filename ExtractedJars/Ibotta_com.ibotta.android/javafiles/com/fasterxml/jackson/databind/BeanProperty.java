// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Named;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonMappingException, SerializerProvider, AnnotationIntrospector, PropertyName, 
//			PropertyMetadata, JavaType

public interface BeanProperty
	extends Named
{
	public static class Bogus
		implements BeanProperty
	{

		public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
			throws JsonMappingException
		{
		//    0    0:return          
		}

		public List findAliases(MapperConfig mapperconfig)
		{
			return Collections.emptyList();
		//    0    0:invokestatic    #25  <Method List Collections.emptyList()>
		//    1    3:areturn         
		}

		public com.fasterxml.jackson.annotation.JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationintrospector)
		{
			return com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
		//    0    0:invokestatic    #36  <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.empty()>
		//    1    3:areturn         
		}

		public com.fasterxml.jackson.annotation.JsonFormat.Value findPropertyFormat(MapperConfig mapperconfig, Class class1)
		{
			return com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
		//    0    0:invokestatic    #36  <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.empty()>
		//    1    3:areturn         
		}

		public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(MapperConfig mapperconfig, Class class1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Annotation getAnnotation(Class class1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Annotation getContextAnnotation(Class class1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public PropertyName getFullName()
		{
			return PropertyName.NO_NAME;
		//    0    0:getstatic       #55  <Field PropertyName PropertyName.NO_NAME>
		//    1    3:areturn         
		}

		public AnnotatedMember getMember()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public PropertyMetadata getMetadata()
		{
			return PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
		//    0    0:getstatic       #65  <Field PropertyMetadata PropertyMetadata.STD_REQUIRED_OR_OPTIONAL>
		//    1    3:areturn         
		}

		public String getName()
		{
			return "";
		//    0    0:ldc1            #69  <String "">
		//    1    2:areturn         
		}

		public JavaType getType()
		{
			return TypeFactory.unknownType();
		//    0    0:invokestatic    #76  <Method JavaType TypeFactory.unknownType()>
		//    1    3:areturn         
		}

		public PropertyName getWrapperName()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public boolean isRequired()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isVirtual()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Bogus()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class Std
		implements BeanProperty, Serializable
	{

		public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		{
			jsonobjectformatvisitor = ((JsonObjectFormatVisitor) (new StringBuilder()));
		//    0    0:new             #42  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #43  <Method void StringBuilder()>
		//    3    7:astore_1        
			((StringBuilder) (jsonobjectformatvisitor)).append("Instances of ");
		//    4    8:aload_1         
		//    5    9:ldc1            #45  <String "Instances of ">
		//    6   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			((StringBuilder) (jsonobjectformatvisitor)).append(((Object)this).getClass().getName());
		//    8   15:aload_1         
		//    9   16:aload_0         
		//   10   17:invokevirtual   #53  <Method Class Object.getClass()>
		//   11   20:invokevirtual   #59  <Method String Class.getName()>
		//   12   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			((StringBuilder) (jsonobjectformatvisitor)).append(" should not get visited");
		//   14   27:aload_1         
		//   15   28:ldc1            #61  <String " should not get visited">
		//   16   30:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
		//   17   33:pop             
			throw new UnsupportedOperationException(((StringBuilder) (jsonobjectformatvisitor)).toString());
		//   18   34:new             #63  <Class UnsupportedOperationException>
		//   19   37:dup             
		//   20   38:aload_1         
		//   21   39:invokevirtual   #66  <Method String StringBuilder.toString()>
		//   22   42:invokespecial   #69  <Method void UnsupportedOperationException(String)>
		//   23   45:athrow          
		}

		public List findAliases(MapperConfig mapperconfig)
		{
			return Collections.emptyList();
		//    0    0:invokestatic    #77  <Method List Collections.emptyList()>
		//    1    3:areturn         
		}

		public com.fasterxml.jackson.annotation.JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationintrospector)
		{
			AnnotatedMember annotatedmember = _member;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field AnnotatedMember _member>
		//    2    4:astore_2        
			if(annotatedmember != null && annotationintrospector != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          25
		//*   5    9:aload_1         
		//*   6   10:ifnull          25
			{
				annotationintrospector = ((AnnotationIntrospector) (annotationintrospector.findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)))));
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:invokevirtual   #88  <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(com.fasterxml.jackson.databind.introspect.Annotated)>
		//   10   18:astore_1        
				if(annotationintrospector != null)
		//*  11   19:aload_1         
		//*  12   20:ifnull          25
					return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (annotationintrospector));
		//   13   23:aload_1         
		//   14   24:areturn         
			}
			return EMPTY_FORMAT;
		//   15   25:getstatic       #92  <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
		//   16   28:areturn         
		}

		public com.fasterxml.jackson.annotation.JsonFormat.Value findPropertyFormat(MapperConfig mapperconfig, Class class1)
		{
			class1 = ((Class) (mapperconfig.getDefaultPropertyFormat(class1)));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #101 <Method com.fasterxml.jackson.annotation.JsonFormat$Value MapperConfig.getDefaultPropertyFormat(Class)>
		//    3    5:astore_2        
			mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
		//    4    6:aload_1         
		//    5    7:invokevirtual   #105 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
		//    6   10:astore_1        
			if(mapperconfig != null)
		//*   7   11:aload_1         
		//*   8   12:ifnull          44
			{
				AnnotatedMember annotatedmember = _member;
		//    9   15:aload_0         
		//   10   16:getfield        #37  <Field AnnotatedMember _member>
		//   11   19:astore_3        
				if(annotatedmember == null)
		//*  12   20:aload_3         
		//*  13   21:ifnonnull       26
					return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (class1));
		//   14   24:aload_2         
		//   15   25:areturn         
				mapperconfig = ((MapperConfig) (((AnnotationIntrospector) (mapperconfig)).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)))));
		//   16   26:aload_1         
		//   17   27:aload_3         
		//   18   28:invokevirtual   #88  <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(com.fasterxml.jackson.databind.introspect.Annotated)>
		//   19   31:astore_1        
				if(mapperconfig == null)
		//*  20   32:aload_1         
		//*  21   33:ifnonnull       38
					return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (class1));
		//   22   36:aload_2         
		//   23   37:areturn         
				else
					return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (class1)).withOverrides(((com.fasterxml.jackson.annotation.JsonFormat.Value) (mapperconfig)));
		//   24   38:aload_2         
		//   25   39:aload_1         
		//   26   40:invokevirtual   #111 <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.withOverrides(com.fasterxml.jackson.annotation.JsonFormat$Value)>
		//   27   43:areturn         
			} else
			{
				return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (class1));
		//   28   44:aload_2         
		//   29   45:areturn         
			}
		}

		public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(MapperConfig mapperconfig, Class class1)
		{
			class1 = ((Class) (mapperconfig.getDefaultInclusion(class1, _type.getRawClass())));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_0         
		//    3    3:getfield        #31  <Field JavaType _type>
		//    4    6:invokevirtual   #119 <Method Class JavaType.getRawClass()>
		//    5    9:invokevirtual   #123 <Method com.fasterxml.jackson.annotation.JsonInclude$Value MapperConfig.getDefaultInclusion(Class, Class)>
		//    6   12:astore_2        
			mapperconfig = ((MapperConfig) (mapperconfig.getAnnotationIntrospector()));
		//    7   13:aload_1         
		//    8   14:invokevirtual   #105 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
		//    9   17:astore_1        
			if(mapperconfig != null)
		//*  10   18:aload_1         
		//*  11   19:ifnull          51
			{
				AnnotatedMember annotatedmember = _member;
		//   12   22:aload_0         
		//   13   23:getfield        #37  <Field AnnotatedMember _member>
		//   14   26:astore_3        
				if(annotatedmember == null)
		//*  15   27:aload_3         
		//*  16   28:ifnonnull       33
					return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1));
		//   17   31:aload_2         
		//   18   32:areturn         
				mapperconfig = ((MapperConfig) (((AnnotationIntrospector) (mapperconfig)).findPropertyInclusion(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)))));
		//   19   33:aload_1         
		//   20   34:aload_3         
		//   21   35:invokevirtual   #126 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(com.fasterxml.jackson.databind.introspect.Annotated)>
		//   22   38:astore_1        
				if(mapperconfig == null)
		//*  23   39:aload_1         
		//*  24   40:ifnonnull       45
					return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1));
		//   25   43:aload_2         
		//   26   44:areturn         
				else
					return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1)).withOverrides(((com.fasterxml.jackson.annotation.JsonInclude.Value) (mapperconfig)));
		//   27   45:aload_2         
		//   28   46:aload_1         
		//   29   47:invokevirtual   #131 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
		//   30   50:areturn         
			} else
			{
				return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1));
		//   31   51:aload_2         
		//   32   52:areturn         
			}
		}

		public Annotation getAnnotation(Class class1)
		{
			AnnotatedMember annotatedmember = _member;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field AnnotatedMember _member>
		//    2    4:astore_2        
			if(annotatedmember == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return annotatedmember.getAnnotation(class1);
		//    7   11:aload_2         
		//    8   12:aload_1         
		//    9   13:invokevirtual   #138 <Method Annotation AnnotatedMember.getAnnotation(Class)>
		//   10   16:areturn         
		}

		public Annotation getContextAnnotation(Class class1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public PropertyName getFullName()
		{
			return _name;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field PropertyName _name>
		//    2    4:areturn         
		}

		public AnnotatedMember getMember()
		{
			return _member;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field AnnotatedMember _member>
		//    2    4:areturn         
		}

		public PropertyMetadata getMetadata()
		{
			return _metadata;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field PropertyMetadata _metadata>
		//    2    4:areturn         
		}

		public String getName()
		{
			return _name.getSimpleName();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field PropertyName _name>
		//    2    4:invokevirtual   #151 <Method String PropertyName.getSimpleName()>
		//    3    7:areturn         
		}

		public JavaType getType()
		{
			return _type;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field JavaType _type>
		//    2    4:areturn         
		}

		public PropertyName getWrapperName()
		{
			return _wrapperName;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field PropertyName _wrapperName>
		//    2    4:areturn         
		}

		public boolean isRequired()
		{
			return _metadata.isRequired();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field PropertyMetadata _metadata>
		//    2    4:invokevirtual   #160 <Method boolean PropertyMetadata.isRequired()>
		//    3    7:ireturn         
		}

		public boolean isVirtual()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		private static final long serialVersionUID = 1L;
		protected final AnnotatedMember _member;
		protected final PropertyMetadata _metadata;
		protected final PropertyName _name;
		protected final JavaType _type;
		protected final PropertyName _wrapperName;

		public Std(PropertyName propertyname, JavaType javatype, PropertyName propertyname1, AnnotatedMember annotatedmember, PropertyMetadata propertymetadata)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			_name = propertyname;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #29  <Field PropertyName _name>
			_type = javatype;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #31  <Field JavaType _type>
			_wrapperName = propertyname1;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #33  <Field PropertyName _wrapperName>
			_metadata = propertymetadata;
		//   11   19:aload_0         
		//   12   20:aload           5
		//   13   22:putfield        #35  <Field PropertyMetadata _metadata>
			_member = annotatedmember;
		//   14   25:aload_0         
		//   15   26:aload           4
		//   16   28:putfield        #37  <Field AnnotatedMember _member>
		//   17   31:return          
		}
	}


	public abstract void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException;

	public abstract List findAliases(MapperConfig mapperconfig);

	public abstract com.fasterxml.jackson.annotation.JsonFormat.Value findFormatOverrides(AnnotationIntrospector annotationintrospector);

	public abstract com.fasterxml.jackson.annotation.JsonFormat.Value findPropertyFormat(MapperConfig mapperconfig, Class class1);

	public abstract com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(MapperConfig mapperconfig, Class class1);

	public abstract Annotation getAnnotation(Class class1);

	public abstract Annotation getContextAnnotation(Class class1);

	public abstract PropertyName getFullName();

	public abstract AnnotatedMember getMember();

	public abstract PropertyMetadata getMetadata();

	public abstract String getName();

	public abstract JavaType getType();

	public abstract PropertyName getWrapperName();

	public abstract boolean isRequired();

	public abstract boolean isVirtual();

	public static final com.fasterxml.jackson.annotation.JsonFormat.Value EMPTY_FORMAT = new com.fasterxml.jackson.annotation.JsonFormat.Value();
	public static final com.fasterxml.jackson.annotation.JsonInclude.Value EMPTY_INCLUDE = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();

	/* static  */
	/* { */
	//    0    0:new             #20  <Class com.fasterxml.jackson.annotation.JsonFormat$Value>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void com.fasterxml.jackson.annotation.JsonFormat$Value()>
	//    3    7:putstatic       #25  <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
	//    4   10:invokestatic    #31  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//    5   13:putstatic       #33  <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//*   6   16:return          
	/* } */
}
