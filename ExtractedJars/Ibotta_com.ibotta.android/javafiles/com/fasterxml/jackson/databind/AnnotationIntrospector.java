// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonMappingException, PropertyName, JavaType

public abstract class AnnotationIntrospector
	implements Versioned, Serializable
{
	public static class ReferenceProperty
	{

		public static ReferenceProperty back(String s)
		{
			return new ReferenceProperty(Type.BACK_REFERENCE, s);
		//    0    0:new             #2   <Class AnnotationIntrospector$ReferenceProperty>
		//    1    3:dup             
		//    2    4:getstatic       #29  <Field AnnotationIntrospector$ReferenceProperty$Type AnnotationIntrospector$ReferenceProperty$Type.BACK_REFERENCE>
		//    3    7:aload_0         
		//    4    8:invokespecial   #31  <Method void AnnotationIntrospector$ReferenceProperty(AnnotationIntrospector$ReferenceProperty$Type, String)>
		//    5   11:areturn         
		}

		public static ReferenceProperty managed(String s)
		{
			return new ReferenceProperty(Type.MANAGED_REFERENCE, s);
		//    0    0:new             #2   <Class AnnotationIntrospector$ReferenceProperty>
		//    1    3:dup             
		//    2    4:getstatic       #35  <Field AnnotationIntrospector$ReferenceProperty$Type AnnotationIntrospector$ReferenceProperty$Type.MANAGED_REFERENCE>
		//    3    7:aload_0         
		//    4    8:invokespecial   #31  <Method void AnnotationIntrospector$ReferenceProperty(AnnotationIntrospector$ReferenceProperty$Type, String)>
		//    5   11:areturn         
		}

		public String getName()
		{
			return _name;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String _name>
		//    2    4:areturn         
		}

		public boolean isBackReference()
		{
			return _type == Type.BACK_REFERENCE;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field AnnotationIntrospector$ReferenceProperty$Type _type>
		//    2    4:getstatic       #29  <Field AnnotationIntrospector$ReferenceProperty$Type AnnotationIntrospector$ReferenceProperty$Type.BACK_REFERENCE>
		//    3    7:if_acmpne       12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		public boolean isManagedReference()
		{
			return _type == Type.MANAGED_REFERENCE;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field AnnotationIntrospector$ReferenceProperty$Type _type>
		//    2    4:getstatic       #35  <Field AnnotationIntrospector$ReferenceProperty$Type AnnotationIntrospector$ReferenceProperty$Type.MANAGED_REFERENCE>
		//    3    7:if_acmpne       12
		//    4   10:iconst_1        
		//    5   11:ireturn         
		//    6   12:iconst_0        
		//    7   13:ireturn         
		}

		private final String _name;
		private final Type _type;

		public ReferenceProperty(Type type, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			_type = type;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field AnnotationIntrospector$ReferenceProperty$Type _type>
			_name = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field String _name>
		//    8   14:return          
		}
	}

	public static final class ReferenceProperty.Type extends Enum
	{

		public static ReferenceProperty.Type valueOf(String s)
		{
			return (ReferenceProperty.Type)Enum.valueOf(com/fasterxml/jackson/databind/AnnotationIntrospector$ReferenceProperty$Type, s);
		//    0    0:ldc1            #2   <Class AnnotationIntrospector$ReferenceProperty$Type>
		//    1    2:aload_0         
		//    2    3:invokestatic    #38  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class AnnotationIntrospector$ReferenceProperty$Type>
		//    4    9:areturn         
		}

		public static ReferenceProperty.Type[] values()
		{
			return (ReferenceProperty.Type[])((ReferenceProperty.Type []) ($VALUES)).clone();
		//    0    0:getstatic       #30  <Field AnnotationIntrospector$ReferenceProperty$Type[] $VALUES>
		//    1    3:invokevirtual   #45  <Method Object _5B_Lcom.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty$Type_3B_.clone()>
		//    2    6:checkcast       #41  <Class AnnotationIntrospector$ReferenceProperty$Type[]>
		//    3    9:areturn         
		}

		private static final ReferenceProperty.Type $VALUES[];
		public static final ReferenceProperty.Type BACK_REFERENCE;
		public static final ReferenceProperty.Type MANAGED_REFERENCE;

		static 
		{
			MANAGED_REFERENCE = new ReferenceProperty.Type("MANAGED_REFERENCE", 0);
		//    0    0:new             #2   <Class AnnotationIntrospector$ReferenceProperty$Type>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "MANAGED_REFERENCE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void AnnotationIntrospector$ReferenceProperty$Type(String, int)>
		//    5   10:putstatic       #25  <Field AnnotationIntrospector$ReferenceProperty$Type MANAGED_REFERENCE>
			BACK_REFERENCE = new ReferenceProperty.Type("BACK_REFERENCE", 1);
		//    6   13:new             #2   <Class AnnotationIntrospector$ReferenceProperty$Type>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "BACK_REFERENCE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void AnnotationIntrospector$ReferenceProperty$Type(String, int)>
		//   11   23:putstatic       #28  <Field AnnotationIntrospector$ReferenceProperty$Type BACK_REFERENCE>
			$VALUES = (new ReferenceProperty.Type[] {
				MANAGED_REFERENCE, BACK_REFERENCE
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       ReferenceProperty.Type[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #25  <Field AnnotationIntrospector$ReferenceProperty$Type MANAGED_REFERENCE>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #28  <Field AnnotationIntrospector$ReferenceProperty$Type BACK_REFERENCE>
		//   21   41:aastore         
		//   22   42:putstatic       #30  <Field AnnotationIntrospector$ReferenceProperty$Type[] $VALUES>
		//*  23   45:return          
		}

		private ReferenceProperty.Type(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #32  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public AnnotationIntrospector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static AnnotationIntrospector nopInstance()
	{
		return ((AnnotationIntrospector) (NopAnnotationIntrospector.instance));
	//    0    0:getstatic       #27  <Field NopAnnotationIntrospector NopAnnotationIntrospector.instance>
	//    1    3:areturn         
	}

	protected Annotation _findAnnotation(Annotated annotated, Class class1)
	{
		return annotated.getAnnotation(class1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #35  <Method Annotation Annotated.getAnnotation(Class)>
	//    3    5:areturn         
	}

	protected boolean _hasAnnotation(Annotated annotated, Class class1)
	{
		return annotated.hasAnnotation(class1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #43  <Method boolean Annotated.hasAnnotation(Class)>
	//    3    5:ireturn         
	}

	protected boolean _hasOneOf(Annotated annotated, Class aclass[])
	{
		return annotated.hasOneOf(aclass);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #50  <Method boolean Annotated.hasOneOf(Class[])>
	//    3    5:ireturn         
	}

	public void findAndAddVirtualProperties(MapperConfig mapperconfig, AnnotatedClass annotatedclass, List list)
	{
	//    0    0:return          
	}

	public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
	{
		return visibilitychecker;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public Object findContentDeserializer(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findContentSerializer(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorAnnotation(MapperConfig mapperconfig, Annotated annotated)
	{
		if(hasCreatorAnnotation(annotated))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #66  <Method boolean hasCreatorAnnotation(Annotated)>
	//*   3    5:ifeq            26
		{
			annotated = ((Annotated) (findCreatorBinding(annotated)));
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #70  <Method com.fasterxml.jackson.annotation.JsonCreator$Mode findCreatorBinding(Annotated)>
	//    7   13:astore_2        
			mapperconfig = ((MapperConfig) (annotated));
	//    8   14:aload_2         
	//    9   15:astore_1        
			if(annotated == null)
	//*  10   16:aload_2         
	//*  11   17:ifnonnull       24
				mapperconfig = ((MapperConfig) (com.fasterxml.jackson.annotation.JsonCreator.Mode.DEFAULT));
	//   12   20:getstatic       #76  <Field com.fasterxml.jackson.annotation.JsonCreator$Mode com.fasterxml.jackson.annotation.JsonCreator$Mode.DEFAULT>
	//   13   23:astore_1        
			return ((com.fasterxml.jackson.annotation.JsonCreator.Mode) (mapperconfig));
	//   14   24:aload_1         
	//   15   25:areturn         
		} else
		{
			return null;
	//   16   26:aconst_null     
	//   17   27:areturn         
		}
	}

	public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorBinding(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Enum findDefaultEnumValue(Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findDeserializationContentConverter(AnnotatedMember annotatedmember)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findDeserializationConverter(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findDeserializer(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String[] findEnumValues(Class class1, Enum aenum[], String as[])
	{
		return as;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public Object findFilterId(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findFormat(Annotated annotated)
	{
		return com.fasterxml.jackson.annotation.JsonFormat.Value.empty();
	//    0    0:invokestatic    #98  <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.empty()>
	//    1    3:areturn         
	}

	public String findImplicitPropertyName(AnnotatedMember annotatedmember)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.annotation.JacksonInject.Value findInjectableValue(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) (findInjectableValueId(annotatedmember)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method Object findInjectableValueId(AnnotatedMember)>
	//    3    5:astore_1        
		if(annotatedmember != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          15
			return com.fasterxml.jackson.annotation.JacksonInject.Value.forId(((Object) (annotatedmember)));
	//    6   10:aload_1         
	//    7   11:invokestatic    #111 <Method com.fasterxml.jackson.annotation.JacksonInject$Value com.fasterxml.jackson.annotation.JacksonInject$Value.forId(Object)>
	//    8   14:areturn         
		else
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
	}

	public Object findInjectableValueId(AnnotatedMember annotatedmember)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findKeyDeserializer(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findKeySerializer(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Boolean findMergeInfo(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public PropertyName findNameForDeserialization(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public PropertyName findNameForSerialization(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findNamingStrategy(AnnotatedClass annotatedclass)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findNullSerializer(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ObjectIdInfo findObjectIdInfo(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectidinfo)
	{
		return objectidinfo;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public Class findPOJOBuilder(AnnotatedClass annotatedclass)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedclass)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonProperty.Access findPropertyAccess(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public List findPropertyAliases(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String findPropertyDefaultValue(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String findPropertyDescription(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated)
	{
		return com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value.empty();
	//    0    0:invokestatic    #148 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value.empty()>
	//    1    3:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(Annotated annotated)
	{
		return com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
	//    0    0:invokestatic    #155 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//    1    3:areturn         
	}

	public Integer findPropertyIndex(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public PropertyName findRootName(AnnotatedClass annotatedclass)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findSerializationContentConverter(AnnotatedMember annotatedmember)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findSerializationConverter(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Boolean findSerializationSortAlphabetically(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findSerializer(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonSetter.Value findSetterInfo(Annotated annotated)
	{
		return com.fasterxml.jackson.annotation.JsonSetter.Value.empty();
	//    0    0:invokestatic    #177 <Method com.fasterxml.jackson.annotation.JsonSetter$Value com.fasterxml.jackson.annotation.JsonSetter$Value.empty()>
	//    1    3:areturn         
	}

	public List findSubtypes(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String findTypeName(AnnotatedClass annotatedclass)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedmember)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findValueInstantiator(AnnotatedClass annotatedclass)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class[] findViews(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public PropertyName findWrapperName(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Boolean hasAnyGetter(Annotated annotated)
	{
		if((annotated instanceof AnnotatedMethod) && hasAnyGetterAnnotation((AnnotatedMethod)annotated))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #194 <Class AnnotatedMethod>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:checkcast       #194 <Class AnnotatedMethod>
	//*   6   12:invokevirtual   #198 <Method boolean hasAnyGetterAnnotation(AnnotatedMethod)>
	//*   7   15:ifeq            23
			return Boolean.valueOf(true);
	//    8   18:iconst_1        
	//    9   19:invokestatic    #204 <Method Boolean Boolean.valueOf(boolean)>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Boolean hasAnySetter(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Boolean hasAsValue(Annotated annotated)
	{
		if((annotated instanceof AnnotatedMethod) && hasAsValueAnnotation((AnnotatedMethod)annotated))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #194 <Class AnnotatedMethod>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:checkcast       #194 <Class AnnotatedMethod>
	//*   6   12:invokevirtual   #209 <Method boolean hasAsValueAnnotation(AnnotatedMethod)>
	//*   7   15:ifeq            23
			return Boolean.valueOf(true);
	//    8   18:iconst_1        
	//    9   19:invokestatic    #204 <Method Boolean Boolean.valueOf(boolean)>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean hasCreatorAnnotation(Annotated annotated)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Boolean hasRequiredMarker(AnnotatedMember annotatedmember)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isAnnotationBundle(Annotation annotation)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Boolean isIgnorableType(AnnotatedClass annotatedclass)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Boolean isTypeId(AnnotatedMember annotatedmember)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JavaType refineDeserializationType(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
		throws JsonMappingException
	{
		return javatype;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public JavaType refineSerializationType(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
		throws JsonMappingException
	{
		return javatype;
	//    0    0:aload_3         
	//    1    1:areturn         
	}

	public AnnotatedMethod resolveSetterConflict(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, AnnotatedMethod annotatedmethod1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract Version version();
}
