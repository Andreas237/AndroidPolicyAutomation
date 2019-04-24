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
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonMappingException, JavaType, PropertyName

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

		public Type getType()
		{
			return _type;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field AnnotationIntrospector$ReferenceProperty$Type _type>
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

	public static AnnotationIntrospector pair(AnnotationIntrospector annotationintrospector, AnnotationIntrospector annotationintrospector1)
	{
		return ((AnnotationIntrospector) (new AnnotationIntrospectorPair(annotationintrospector, annotationintrospector1)));
	//    0    0:new             #31  <Class AnnotationIntrospectorPair>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #34  <Method void AnnotationIntrospectorPair(AnnotationIntrospector, AnnotationIntrospector)>
	//    5    9:areturn         
	}

	protected Annotation _findAnnotation(Annotated annotated, Class class1)
	{
		return annotated.getAnnotation(class1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #42  <Method Annotation Annotated.getAnnotation(Class)>
	//    3    5:areturn         
	}

	protected boolean _hasAnnotation(Annotated annotated, Class class1)
	{
		return annotated.hasAnnotation(class1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #50  <Method boolean Annotated.hasAnnotation(Class)>
	//    3    5:ireturn         
	}

	protected boolean _hasOneOf(Annotated annotated, Class aclass[])
	{
		return annotated.hasOneOf(aclass);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #57  <Method boolean Annotated.hasOneOf(Class[])>
	//    3    5:ireturn         
	}

	public Collection allIntrospectors()
	{
		return ((Collection) (Collections.singletonList(((Object) (this)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #66  <Method List Collections.singletonList(Object)>
	//    2    4:areturn         
	}

	public Collection allIntrospectors(Collection collection)
	{
		collection.add(((Object) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #74  <Method boolean Collection.add(Object)>
	//    3    7:pop             
		return collection;
	//    4    8:aload_1         
	//    5    9:areturn         
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

	public String findClassDescription(AnnotatedClass annotatedclass)
	{
		return null;
	//    0    0:aconst_null     
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

	public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorBinding(Annotated annotated)
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

	public Class findDeserializationContentType(Annotated annotated, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findDeserializationConverter(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class findDeserializationKeyType(Annotated annotated, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class findDeserializationType(Annotated annotated, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findDeserializer(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String findEnumValue(Enum enum)
	{
		return enum.name();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #107 <Method String Enum.name()>
	//    2    4:areturn         
	}

	public String[] findEnumValues(Class class1, Enum aenum[], String as[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		for(int j = aenum.length; i < j; i++)
	//*   2    3:aload_2         
	//*   3    4:arraylength     
	//*   4    5:istore          5
	//*   5    7:iload           4
	//*   6    9:iload           5
	//*   7   11:icmpge          35
			as[i] = findEnumValue(aenum[i]);
	//    8   14:aload_3         
	//    9   15:iload           4
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:iload           4
	//   13   21:aaload          
	//   14   22:invokevirtual   #112 <Method String findEnumValue(Enum)>
	//   15   25:aastore         

	//   16   26:iload           4
	//   17   28:iconst_1        
	//   18   29:iadd            
	//   19   30:istore          4
	//*  20   32:goto            7
		return as;
	//   21   35:aload_3         
	//   22   36:areturn         
	}

	public Object findFilterId(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findFormat(Annotated annotated)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String findImplicitPropertyName(AnnotatedMember annotatedmember)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
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

	public String[] findPropertiesToIgnore(Annotated annotated)
	{
		return findPropertiesToIgnore(annotated, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #143 <Method String[] findPropertiesToIgnore(Annotated, boolean)>
	//    4    6:areturn         
	}

	public String[] findPropertiesToIgnore(Annotated annotated, boolean flag)
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

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(Annotated annotated)
	{
		return com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
	//    0    0:invokestatic    #159 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
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

	public Class findSerializationContentType(Annotated annotated, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findSerializationConverter(Annotated annotated)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusion(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		return include;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusionForContent(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		return include;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
	{
		return null;
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

	public Class findSerializationType(Annotated annotated)
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

	public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
		TypeFactory typefactory = mapperconfig.getTypeFactory();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #223 <Method TypeFactory MapperConfig.getTypeFactory()>
	//    2    4:astore          4
		Class class1 = findDeserializationType(annotated, javatype);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:aload_3         
	//    6    9:invokevirtual   #225 <Method Class findDeserializationType(Annotated, JavaType)>
	//    7   12:astore          5
		mapperconfig = ((MapperConfig) (javatype));
	//    8   14:aload_3         
	//    9   15:astore_1        
		if(class1 != null)
	//*  10   16:aload           5
	//*  11   18:ifnull          41
		{
			mapperconfig = ((MapperConfig) (javatype));
	//   12   21:aload_3         
	//   13   22:astore_1        
			JavaType javatype1;
			if(!javatype.hasRawClass(class1))
	//*  14   23:aload_3         
	//*  15   24:aload           5
	//*  16   26:invokevirtual   #230 <Method boolean JavaType.hasRawClass(Class)>
	//*  17   29:ifne            41
				try
				{
					mapperconfig = ((MapperConfig) (typefactory.constructSpecializedType(javatype, class1)));
	//   18   32:aload           4
	//   19   34:aload_3         
	//   20   35:aload           5
	//   21   37:invokevirtual   #236 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//   22   40:astore_1        
				}
	//*  23   41:aload_1         
	//*  24   42:astore_3        
	//*  25   43:aload_1         
	//*  26   44:invokevirtual   #240 <Method boolean JavaType.isMapLikeType()>
	//*  27   47:ifeq            91
	//*  28   50:aload_1         
	//*  29   51:invokevirtual   #244 <Method JavaType JavaType.getKeyType()>
	//*  30   54:astore          6
	//*  31   56:aload_0         
	//*  32   57:aload_2         
	//*  33   58:aload           6
	//*  34   60:invokevirtual   #246 <Method Class findDeserializationKeyType(Annotated, JavaType)>
	//*  35   63:astore          5
	//*  36   65:aload_1         
	//*  37   66:astore_3        
	//*  38   67:aload           5
	//*  39   69:ifnull          91
	//*  40   72:aload           4
	//*  41   74:aload           6
	//*  42   76:aload           5
	//*  43   78:invokevirtual   #236 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//*  44   81:astore_3        
	//*  45   82:aload_1         
	//*  46   83:checkcast       #248 <Class MapLikeType>
	//*  47   86:aload_3         
	//*  48   87:invokevirtual   #252 <Method MapLikeType MapLikeType.withKeyType(JavaType)>
	//*  49   90:astore_3        
	//*  50   91:aload_3         
	//*  51   92:invokevirtual   #255 <Method JavaType JavaType.getContentType()>
	//*  52   95:astore          6
	//*  53   97:aload_3         
	//*  54   98:astore_1        
	//*  55   99:aload           6
	//*  56  101:ifnull          134
	//*  57  104:aload_0         
	//*  58  105:aload_2         
	//*  59  106:aload           6
	//*  60  108:invokevirtual   #257 <Method Class findDeserializationContentType(Annotated, JavaType)>
	//*  61  111:astore          5
	//*  62  113:aload_3         
	//*  63  114:astore_1        
	//*  64  115:aload           5
	//*  65  117:ifnull          134
	//*  66  120:aload_3         
	//*  67  121:aload           4
	//*  68  123:aload           6
	//*  69  125:aload           5
	//*  70  127:invokevirtual   #236 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//*  71  130:invokevirtual   #261 <Method JavaType JavaType.withContentType(JavaType)>
	//*  72  133:astore_1        
	//*  73  134:aload_1         
	//*  74  135:areturn         
				// Misplaced declaration of an exception variable
				catch(MapperConfig mapperconfig)
	//*  75  136:astore_1        
				{
					throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", new Object[] {
						javatype, class1.getName(), annotated.getName(), ((IllegalArgumentException) (mapperconfig)).getMessage()
					}), ((Throwable) (mapperconfig)));
	//   76  137:new             #215 <Class JsonMappingException>
	//   77  140:dup             
	//   78  141:aconst_null     
	//   79  142:ldc2            #263 <String "Failed to narrow type %s with annotation (value %s), from '%s': %s">
	//   80  145:iconst_4        
	//   81  146:anewarray       Object[]
	//   82  149:dup             
	//   83  150:iconst_0        
	//   84  151:aload_3         
	//   85  152:aastore         
	//   86  153:dup             
	//   87  154:iconst_1        
	//   88  155:aload           5
	//   89  157:invokevirtual   #268 <Method String Class.getName()>
	//   90  160:aastore         
	//   91  161:dup             
	//   92  162:iconst_2        
	//   93  163:aload_2         
	//   94  164:invokevirtual   #269 <Method String Annotated.getName()>
	//   95  167:aastore         
	//   96  168:dup             
	//   97  169:iconst_3        
	//   98  170:aload_1         
	//   99  171:invokevirtual   #272 <Method String IllegalArgumentException.getMessage()>
	//  100  174:aastore         
	//  101  175:invokestatic    #278 <Method String String.format(String, Object[])>
	//  102  178:aload_1         
	//  103  179:invokespecial   #281 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  104  182:athrow          
				}
		}
		javatype = ((JavaType) (mapperconfig));
		if(((JavaType) (mapperconfig)).isMapLikeType())
		{
			javatype1 = ((JavaType) (mapperconfig)).getKeyType();
			class1 = findDeserializationKeyType(annotated, javatype1);
			javatype = ((JavaType) (mapperconfig));
			if(class1 != null)
				try
				{
					javatype = typefactory.constructSpecializedType(javatype1, class1);
					javatype = ((JavaType) (((MapLikeType)mapperconfig).withKeyType(javatype)));
				}
				// Misplaced declaration of an exception variable
				catch(JavaType javatype)
	//* 105  183:astore_3        
				{
					throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[] {
						mapperconfig, class1.getName(), annotated.getName(), ((IllegalArgumentException) (javatype)).getMessage()
					}), ((Throwable) (javatype)));
	//  106  184:new             #215 <Class JsonMappingException>
	//  107  187:dup             
	//  108  188:aconst_null     
	//  109  189:ldc2            #283 <String "Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s">
	//  110  192:iconst_4        
	//  111  193:anewarray       Object[]
	//  112  196:dup             
	//  113  197:iconst_0        
	//  114  198:aload_1         
	//  115  199:aastore         
	//  116  200:dup             
	//  117  201:iconst_1        
	//  118  202:aload           5
	//  119  204:invokevirtual   #268 <Method String Class.getName()>
	//  120  207:aastore         
	//  121  208:dup             
	//  122  209:iconst_2        
	//  123  210:aload_2         
	//  124  211:invokevirtual   #269 <Method String Annotated.getName()>
	//  125  214:aastore         
	//  126  215:dup             
	//  127  216:iconst_3        
	//  128  217:aload_3         
	//  129  218:invokevirtual   #272 <Method String IllegalArgumentException.getMessage()>
	//  130  221:aastore         
	//  131  222:invokestatic    #278 <Method String String.format(String, Object[])>
	//  132  225:aload_3         
	//  133  226:invokespecial   #281 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  134  229:athrow          
				}
		}
		javatype1 = javatype.getContentType();
		mapperconfig = ((MapperConfig) (javatype));
		if(javatype1 != null)
		{
			class1 = findDeserializationContentType(annotated, javatype1);
			mapperconfig = ((MapperConfig) (javatype));
			if(class1 != null)
				try
				{
					mapperconfig = ((MapperConfig) (javatype.withContentType(typefactory.constructSpecializedType(javatype1, class1))));
				}
				// Misplaced declaration of an exception variable
				catch(MapperConfig mapperconfig)
	//* 135  230:astore_1        
				{
					throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[] {
						javatype, class1.getName(), annotated.getName(), ((IllegalArgumentException) (mapperconfig)).getMessage()
					}), ((Throwable) (mapperconfig)));
	//  136  231:new             #215 <Class JsonMappingException>
	//  137  234:dup             
	//  138  235:aconst_null     
	//  139  236:ldc2            #285 <String "Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s">
	//  140  239:iconst_4        
	//  141  240:anewarray       Object[]
	//  142  243:dup             
	//  143  244:iconst_0        
	//  144  245:aload_3         
	//  145  246:aastore         
	//  146  247:dup             
	//  147  248:iconst_1        
	//  148  249:aload           5
	//  149  251:invokevirtual   #268 <Method String Class.getName()>
	//  150  254:aastore         
	//  151  255:dup             
	//  152  256:iconst_2        
	//  153  257:aload_2         
	//  154  258:invokevirtual   #269 <Method String Annotated.getName()>
	//  155  261:aastore         
	//  156  262:dup             
	//  157  263:iconst_3        
	//  158  264:aload_1         
	//  159  265:invokevirtual   #272 <Method String IllegalArgumentException.getMessage()>
	//  160  268:aastore         
	//  161  269:invokestatic    #278 <Method String String.format(String, Object[])>
	//  162  272:aload_1         
	//  163  273:invokespecial   #281 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  164  276:athrow          
				}
		}
		return ((JavaType) (mapperconfig));
	}

	public JavaType refineSerializationType(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
		throws JsonMappingException
	{
		TypeFactory typefactory = mapperconfig.getTypeFactory();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #223 <Method TypeFactory MapperConfig.getTypeFactory()>
	//    2    4:astore          4
		Class class1 = findSerializationType(annotated);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokevirtual   #290 <Method Class findSerializationType(Annotated)>
	//    6   11:astore          5
		mapperconfig = ((MapperConfig) (javatype));
	//    7   13:aload_3         
	//    8   14:astore_1        
		JavaType javatype1;
		if(class1 != null)
	//*   9   15:aload           5
	//*  10   17:ifnull          34
			if(javatype.hasRawClass(class1))
	//*  11   20:aload_3         
	//*  12   21:aload           5
	//*  13   23:invokevirtual   #230 <Method boolean JavaType.hasRawClass(Class)>
	//*  14   26:ifeq            143
				mapperconfig = ((MapperConfig) (javatype.withStaticTyping()));
	//   15   29:aload_3         
	//   16   30:invokevirtual   #293 <Method JavaType JavaType.withStaticTyping()>
	//   17   33:astore_1        
			else
	//*  18   34:aload_1         
	//*  19   35:astore_3        
	//*  20   36:aload_1         
	//*  21   37:invokevirtual   #240 <Method boolean JavaType.isMapLikeType()>
	//*  22   40:ifeq            90
	//*  23   43:aload_1         
	//*  24   44:invokevirtual   #244 <Method JavaType JavaType.getKeyType()>
	//*  25   47:astore          6
	//*  26   49:aload_0         
	//*  27   50:aload_2         
	//*  28   51:aload           6
	//*  29   53:invokevirtual   #295 <Method Class findSerializationKeyType(Annotated, JavaType)>
	//*  30   56:astore          5
	//*  31   58:aload_1         
	//*  32   59:astore_3        
	//*  33   60:aload           5
	//*  34   62:ifnull          90
	//*  35   65:aload           6
	//*  36   67:aload           5
	//*  37   69:invokevirtual   #230 <Method boolean JavaType.hasRawClass(Class)>
	//*  38   72:ifeq            202
	//*  39   75:aload           6
	//*  40   77:invokevirtual   #293 <Method JavaType JavaType.withStaticTyping()>
	//*  41   80:astore_3        
	//*  42   81:aload_1         
	//*  43   82:checkcast       #248 <Class MapLikeType>
	//*  44   85:aload_3         
	//*  45   86:invokevirtual   #252 <Method MapLikeType MapLikeType.withKeyType(JavaType)>
	//*  46   89:astore_3        
	//*  47   90:aload_3         
	//*  48   91:invokevirtual   #255 <Method JavaType JavaType.getContentType()>
	//*  49   94:astore          6
	//*  50   96:aload_3         
	//*  51   97:astore_1        
	//*  52   98:aload           6
	//*  53  100:ifnull          141
	//*  54  103:aload_0         
	//*  55  104:aload_2         
	//*  56  105:aload           6
	//*  57  107:invokevirtual   #297 <Method Class findSerializationContentType(Annotated, JavaType)>
	//*  58  110:astore          5
	//*  59  112:aload_3         
	//*  60  113:astore_1        
	//*  61  114:aload           5
	//*  62  116:ifnull          141
	//*  63  119:aload           6
	//*  64  121:aload           5
	//*  65  123:invokevirtual   #230 <Method boolean JavaType.hasRawClass(Class)>
	//*  66  126:ifeq            262
	//*  67  129:aload           6
	//*  68  131:invokevirtual   #293 <Method JavaType JavaType.withStaticTyping()>
	//*  69  134:astore_1        
	//*  70  135:aload_3         
	//*  71  136:aload_1         
	//*  72  137:invokevirtual   #261 <Method JavaType JavaType.withContentType(JavaType)>
	//*  73  140:astore_1        
	//*  74  141:aload_1         
	//*  75  142:areturn         
				try
				{
					mapperconfig = ((MapperConfig) (typefactory.constructGeneralizedType(javatype, class1)));
	//   76  143:aload           4
	//   77  145:aload_3         
	//   78  146:aload           5
	//   79  148:invokevirtual   #300 <Method JavaType TypeFactory.constructGeneralizedType(JavaType, Class)>
	//   80  151:astore_1        
				}
	//*  81  152:goto            34
				// Misplaced declaration of an exception variable
				catch(MapperConfig mapperconfig)
	//*  82  155:astore_1        
				{
					throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", new Object[] {
						javatype, class1.getName(), annotated.getName(), ((IllegalArgumentException) (mapperconfig)).getMessage()
					}), ((Throwable) (mapperconfig)));
	//   83  156:new             #215 <Class JsonMappingException>
	//   84  159:dup             
	//   85  160:aconst_null     
	//   86  161:ldc2            #302 <String "Failed to widen type %s with annotation (value %s), from '%s': %s">
	//   87  164:iconst_4        
	//   88  165:anewarray       Object[]
	//   89  168:dup             
	//   90  169:iconst_0        
	//   91  170:aload_3         
	//   92  171:aastore         
	//   93  172:dup             
	//   94  173:iconst_1        
	//   95  174:aload           5
	//   96  176:invokevirtual   #268 <Method String Class.getName()>
	//   97  179:aastore         
	//   98  180:dup             
	//   99  181:iconst_2        
	//  100  182:aload_2         
	//  101  183:invokevirtual   #269 <Method String Annotated.getName()>
	//  102  186:aastore         
	//  103  187:dup             
	//  104  188:iconst_3        
	//  105  189:aload_1         
	//  106  190:invokevirtual   #272 <Method String IllegalArgumentException.getMessage()>
	//  107  193:aastore         
	//  108  194:invokestatic    #278 <Method String String.format(String, Object[])>
	//  109  197:aload_1         
	//  110  198:invokespecial   #281 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  111  201:athrow          
				}
		javatype = ((JavaType) (mapperconfig));
		if(((JavaType) (mapperconfig)).isMapLikeType())
		{
			javatype1 = ((JavaType) (mapperconfig)).getKeyType();
			class1 = findSerializationKeyType(annotated, javatype1);
			javatype = ((JavaType) (mapperconfig));
			if(class1 != null)
			{
				if(javatype1.hasRawClass(class1))
					javatype = javatype1.withStaticTyping();
				else
					try
					{
						javatype = typefactory.constructGeneralizedType(javatype1, class1);
	//  112  202:aload           4
	//  113  204:aload           6
	//  114  206:aload           5
	//  115  208:invokevirtual   #300 <Method JavaType TypeFactory.constructGeneralizedType(JavaType, Class)>
	//  116  211:astore_3        
					}
	//* 117  212:goto            81
					// Misplaced declaration of an exception variable
					catch(JavaType javatype)
	//* 118  215:astore_3        
					{
						throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[] {
							mapperconfig, class1.getName(), annotated.getName(), ((IllegalArgumentException) (javatype)).getMessage()
						}), ((Throwable) (javatype)));
	//  119  216:new             #215 <Class JsonMappingException>
	//  120  219:dup             
	//  121  220:aconst_null     
	//  122  221:ldc2            #304 <String "Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s">
	//  123  224:iconst_4        
	//  124  225:anewarray       Object[]
	//  125  228:dup             
	//  126  229:iconst_0        
	//  127  230:aload_1         
	//  128  231:aastore         
	//  129  232:dup             
	//  130  233:iconst_1        
	//  131  234:aload           5
	//  132  236:invokevirtual   #268 <Method String Class.getName()>
	//  133  239:aastore         
	//  134  240:dup             
	//  135  241:iconst_2        
	//  136  242:aload_2         
	//  137  243:invokevirtual   #269 <Method String Annotated.getName()>
	//  138  246:aastore         
	//  139  247:dup             
	//  140  248:iconst_3        
	//  141  249:aload_3         
	//  142  250:invokevirtual   #272 <Method String IllegalArgumentException.getMessage()>
	//  143  253:aastore         
	//  144  254:invokestatic    #278 <Method String String.format(String, Object[])>
	//  145  257:aload_3         
	//  146  258:invokespecial   #281 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  147  261:athrow          
					}
				javatype = ((JavaType) (((MapLikeType)mapperconfig).withKeyType(javatype)));
			}
		}
		javatype1 = javatype.getContentType();
		mapperconfig = ((MapperConfig) (javatype));
		if(javatype1 != null)
		{
			class1 = findSerializationContentType(annotated, javatype1);
			mapperconfig = ((MapperConfig) (javatype));
			if(class1 != null)
			{
				if(javatype1.hasRawClass(class1))
					mapperconfig = ((MapperConfig) (javatype1.withStaticTyping()));
				else
					try
					{
						mapperconfig = ((MapperConfig) (typefactory.constructGeneralizedType(javatype1, class1)));
	//  148  262:aload           4
	//  149  264:aload           6
	//  150  266:aload           5
	//  151  268:invokevirtual   #300 <Method JavaType TypeFactory.constructGeneralizedType(JavaType, Class)>
	//  152  271:astore_1        
					}
	//* 153  272:goto            135
					// Misplaced declaration of an exception variable
					catch(MapperConfig mapperconfig)
	//* 154  275:astore_1        
					{
						throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to widen value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[] {
							javatype, class1.getName(), annotated.getName(), ((IllegalArgumentException) (mapperconfig)).getMessage()
						}), ((Throwable) (mapperconfig)));
	//  155  276:new             #215 <Class JsonMappingException>
	//  156  279:dup             
	//  157  280:aconst_null     
	//  158  281:ldc2            #306 <String "Failed to widen value type of %s with concrete-type annotation (value %s), from '%s': %s">
	//  159  284:iconst_4        
	//  160  285:anewarray       Object[]
	//  161  288:dup             
	//  162  289:iconst_0        
	//  163  290:aload_3         
	//  164  291:aastore         
	//  165  292:dup             
	//  166  293:iconst_1        
	//  167  294:aload           5
	//  168  296:invokevirtual   #268 <Method String Class.getName()>
	//  169  299:aastore         
	//  170  300:dup             
	//  171  301:iconst_2        
	//  172  302:aload_2         
	//  173  303:invokevirtual   #269 <Method String Annotated.getName()>
	//  174  306:aastore         
	//  175  307:dup             
	//  176  308:iconst_3        
	//  177  309:aload_1         
	//  178  310:invokevirtual   #272 <Method String IllegalArgumentException.getMessage()>
	//  179  313:aastore         
	//  180  314:invokestatic    #278 <Method String String.format(String, Object[])>
	//  181  317:aload_1         
	//  182  318:invokespecial   #281 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  183  321:athrow          
					}
				mapperconfig = ((MapperConfig) (javatype.withContentType(((JavaType) (mapperconfig)))));
			}
		}
		return ((JavaType) (mapperconfig));
	}

	public AnnotatedMethod resolveSetterConflict(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, AnnotatedMethod annotatedmethod1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract Version version();
}
