// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.util.*;
import java.beans.ConstructorProperties;
import java.beans.Transient;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;
import java.util.logging.Logger;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			VirtualAnnotatedMember, AnnotatedClass, AnnotatedParameter, VisibilityChecker, 
//			AnnotatedMethod, AnnotatedMember, ObjectIdInfo, Annotated, 
//			AnnotatedConstructor, AnnotatedWithParams

public class JacksonAnnotationIntrospector extends AnnotationIntrospector
	implements Serializable
{
	private static class Java7Support
	{

		public PropertyName findConstructorName(AnnotatedParameter annotatedparameter)
		{
			Object obj = ((Object) (annotatedparameter.getOwner()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method AnnotatedWithParams AnnotatedParameter.getOwner()>
		//    2    4:astore_3        
			if(obj != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          48
			{
				obj = ((Object) ((ConstructorProperties)((AnnotatedWithParams) (obj)).getAnnotation(java/beans/ConstructorProperties)));
		//    5    9:aload_3         
		//    6   10:ldc1            #16  <Class ConstructorProperties>
		//    7   12:invokevirtual   #33  <Method Annotation AnnotatedWithParams.getAnnotation(Class)>
		//    8   15:checkcast       #16  <Class ConstructorProperties>
		//    9   18:astore_3        
				if(obj != null)
		//*  10   19:aload_3         
		//*  11   20:ifnull          48
				{
					String as[] = ((ConstructorProperties) (obj)).value();
		//   12   23:aload_3         
		//   13   24:invokeinterface #37  <Method String[] ConstructorProperties.value()>
		//   14   29:astore_3        
					int i = annotatedparameter.getIndex();
		//   15   30:aload_1         
		//   16   31:invokevirtual   #41  <Method int AnnotatedParameter.getIndex()>
		//   17   34:istore_2        
					if(i < as.length)
		//*  18   35:iload_2         
		//*  19   36:aload_3         
		//*  20   37:arraylength     
		//*  21   38:icmpge          48
						return PropertyName.construct(as[i]);
		//   22   41:aload_3         
		//   23   42:iload_2         
		//   24   43:aaload          
		//   25   44:invokestatic    #47  <Method PropertyName PropertyName.construct(String)>
		//   26   47:areturn         
				}
			}
			return null;
		//   27   48:aconst_null     
		//   28   49:areturn         
		}

		public Boolean findTransient(Annotated annotated)
		{
			annotated = ((Annotated) ((Transient)annotated.getAnnotation(java/beans/Transient)));
		//    0    0:aload_1         
		//    1    1:ldc1            #51  <Class Transient>
		//    2    3:invokevirtual   #54  <Method Annotation Annotated.getAnnotation(Class)>
		//    3    6:checkcast       #51  <Class Transient>
		//    4    9:astore_1        
			if(annotated != null)
		//*   5   10:aload_1         
		//*   6   11:ifnull          24
				return Boolean.valueOf(((Transient) (annotated)).value());
		//    7   14:aload_1         
		//    8   15:invokeinterface #57  <Method boolean Transient.value()>
		//    9   20:invokestatic    #63  <Method Boolean Boolean.valueOf(boolean)>
		//   10   23:areturn         
			else
				return null;
		//   11   24:aconst_null     
		//   12   25:areturn         
		}

		public Boolean hasCreatorAnnotation(Annotated annotated)
		{
			if((ConstructorProperties)annotated.getAnnotation(java/beans/ConstructorProperties) != null)
		//*   0    0:aload_1         
		//*   1    1:ldc1            #16  <Class ConstructorProperties>
		//*   2    3:invokevirtual   #54  <Method Annotation Annotated.getAnnotation(Class)>
		//*   3    6:checkcast       #16  <Class ConstructorProperties>
		//*   4    9:ifnull          16
				return Boolean.TRUE;
		//    5   12:getstatic       #68  <Field Boolean Boolean.TRUE>
		//    6   15:areturn         
			else
				return null;
		//    7   16:aconst_null     
		//    8   17:areturn         
		}

		private final Class _bogus = java/beans/ConstructorProperties;

		public Java7Support()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:ldc1            #16  <Class ConstructorProperties>
		//    4    7:putfield        #18  <Field Class _bogus>
		//    5   10:return          
		}
	}


	public JacksonAnnotationIntrospector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void AnnotationIntrospector()>
		_annotationsInside = new LRUMap(48, 48);
	//    2    4:aload_0         
	//    3    5:new             #81  <Class LRUMap>
	//    4    8:dup             
	//    5    9:bipush          48
	//    6   11:bipush          48
	//    7   13:invokespecial   #84  <Method void LRUMap(int, int)>
	//    8   16:putfield        #86  <Field LRUMap _annotationsInside>
	//    9   19:return          
	}

	private final Boolean _findSortAlpha(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonPropertyOrder)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonPropertyOrder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #90  <Class JsonPropertyOrder>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #90  <Class JsonPropertyOrder>
	//    5   10:astore_1        
		if(annotated != null && ((JsonPropertyOrder) (annotated)).alphabetic())
	//*   6   11:aload_1         
	//*   7   12:ifnull          28
	//*   8   15:aload_1         
	//*   9   16:invokeinterface #98  <Method boolean JsonPropertyOrder.alphabetic()>
	//*  10   21:ifeq            28
			return Boolean.TRUE;
	//   11   24:getstatic       #104 <Field Boolean Boolean.TRUE>
	//   12   27:areturn         
		else
			return null;
	//   13   28:aconst_null     
	//   14   29:areturn         
	}

	protected Class _classIfExplicit(Class class1)
	{
		Class class2;
label0:
		{
			if(class1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          13
			{
				class2 = class1;
	//    2    4:aload_1         
	//    3    5:astore_2        
				if(!ClassUtil.isBogusClass(class1))
					break label0;
	//    4    6:aload_1         
	//    5    7:invokestatic    #112 <Method boolean ClassUtil.isBogusClass(Class)>
	//    6   10:ifeq            15
			}
			class2 = null;
	//    7   13:aconst_null     
	//    8   14:astore_2        
		}
		return class2;
	//    9   15:aload_2         
	//   10   16:areturn         
	}

	protected Class _classIfExplicit(Class class1, Class class2)
	{
label0:
		{
			Class class3 = _classIfExplicit(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #117 <Method Class _classIfExplicit(Class)>
	//    3    5:astore_3        
			if(class3 != null)
	//*   4    6:aload_3         
	//*   5    7:ifnull          17
			{
				class1 = class3;
	//    6   10:aload_3         
	//    7   11:astore_1        
				if(class3 != class2)
					break label0;
	//    8   12:aload_3         
	//    9   13:aload_2         
	//   10   14:if_acmpne       19
			}
			class1 = null;
	//   11   17:aconst_null     
	//   12   18:astore_1        
		}
		return class1;
	//   13   19:aload_1         
	//   14   20:areturn         
	}

	protected StdTypeResolverBuilder _constructNoTypeResolverBuilder()
	{
		return StdTypeResolverBuilder.noTypeInfoBuilder();
	//    0    0:invokestatic    #125 <Method StdTypeResolverBuilder StdTypeResolverBuilder.noTypeInfoBuilder()>
	//    1    3:areturn         
	}

	protected StdTypeResolverBuilder _constructStdTypeResolverBuilder()
	{
		return new StdTypeResolverBuilder();
	//    0    0:new             #122 <Class StdTypeResolverBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void StdTypeResolverBuilder()>
	//    3    7:areturn         
	}

	protected BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend.Attr attr, MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
	{
		PropertyMetadata propertymetadata;
		PropertyName propertyname;
		PropertyName propertyname1;
		String s;
		if(attr.required())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #134 <Method boolean com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.required()>
	//*   2    6:ifeq            104
			propertymetadata = PropertyMetadata.STD_REQUIRED;
	//    3    9:getstatic       #140 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//    4   12:astore          5
		else
	//*   5   14:aload_1         
	//*   6   15:invokeinterface #143 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.value()>
	//*   7   20:astore          8
	//*   8   22:aload_0         
	//*   9   23:aload_1         
	//*  10   24:invokeinterface #146 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.propName()>
	//*  11   29:aload_1         
	//*  12   30:invokeinterface #149 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.propNamespace()>
	//*  13   35:invokevirtual   #153 <Method PropertyName _propertyName(String, String)>
	//*  14   38:astore          7
	//*  15   40:aload           7
	//*  16   42:astore          6
	//*  17   44:aload           7
	//*  18   46:invokevirtual   #158 <Method boolean PropertyName.hasSimpleName()>
	//*  19   49:ifne            59
	//*  20   52:aload           8
	//*  21   54:invokestatic    #162 <Method PropertyName PropertyName.construct(String)>
	//*  22   57:astore          6
	//*  23   59:aload           8
	//*  24   61:aload_2         
	//*  25   62:new             #164 <Class VirtualAnnotatedMember>
	//*  26   65:dup             
	//*  27   66:aload_3         
	//*  28   67:aload_3         
	//*  29   68:invokevirtual   #170 <Method Class AnnotatedClass.getRawType()>
	//*  30   71:aload           8
	//*  31   73:aload           4
	//*  32   75:invokevirtual   #175 <Method Class JavaType.getRawClass()>
	//*  33   78:invokespecial   #178 <Method void VirtualAnnotatedMember(TypeResolutionContext, Class, String, Class)>
	//*  34   81:aload           6
	//*  35   83:aload           5
	//*  36   85:aload_1         
	//*  37   86:invokeinterface #182 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.include()>
	//*  38   91:invokestatic    #187 <Method SimpleBeanPropertyDefinition SimpleBeanPropertyDefinition.construct(MapperConfig, AnnotatedMember, PropertyName, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//*  39   94:aload_3         
	//*  40   95:invokevirtual   #191 <Method com.fasterxml.jackson.databind.util.Annotations AnnotatedClass.getAnnotations()>
	//*  41   98:aload           4
	//*  42  100:invokestatic    #196 <Method AttributePropertyWriter AttributePropertyWriter.construct(String, BeanPropertyDefinition, com.fasterxml.jackson.databind.util.Annotations, JavaType)>
	//*  43  103:areturn         
			propertymetadata = PropertyMetadata.STD_OPTIONAL;
	//   44  104:getstatic       #199 <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//   45  107:astore          5
		s = attr.value();
		propertyname1 = _propertyName(attr.propName(), attr.propNamespace());
		propertyname = propertyname1;
		if(!propertyname1.hasSimpleName())
			propertyname = PropertyName.construct(s);
		return ((BeanPropertyWriter) (AttributePropertyWriter.construct(s, ((BeanPropertyDefinition) (SimpleBeanPropertyDefinition.construct(mapperconfig, ((AnnotatedMember) (new VirtualAnnotatedMember(((TypeResolutionContext) (annotatedclass)), annotatedclass.getRawType(), s, javatype.getRawClass()))), propertyname, propertymetadata, attr.include()))), annotatedclass.getAnnotations(), javatype)));
	//*  46  109:goto            14
	}

	protected BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend.Prop prop, MapperConfig mapperconfig, AnnotatedClass annotatedclass)
	{
		Object obj;
		JavaType javatype;
		Object obj1;
		Class class1;
		if(prop.required())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #204 <Method boolean com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.required()>
	//*   2    6:ifeq            134
			obj = ((Object) (PropertyMetadata.STD_REQUIRED));
	//    3    9:getstatic       #140 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//    4   12:astore          4
		else
	//*   5   14:aload_0         
	//*   6   15:aload_1         
	//*   7   16:invokeinterface #207 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.name()>
	//*   8   21:aload_1         
	//*   9   22:invokeinterface #210 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.namespace()>
	//*  10   27:invokevirtual   #153 <Method PropertyName _propertyName(String, String)>
	//*  11   30:astore          6
	//*  12   32:aload_2         
	//*  13   33:aload_1         
	//*  14   34:invokeinterface #213 <Method Class com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.type()>
	//*  15   39:invokevirtual   #219 <Method JavaType MapperConfig.constructType(Class)>
	//*  16   42:astore          5
	//*  17   44:aload_2         
	//*  18   45:new             #164 <Class VirtualAnnotatedMember>
	//*  19   48:dup             
	//*  20   49:aload_3         
	//*  21   50:aload_3         
	//*  22   51:invokevirtual   #170 <Method Class AnnotatedClass.getRawType()>
	//*  23   54:aload           6
	//*  24   56:invokevirtual   #222 <Method String PropertyName.getSimpleName()>
	//*  25   59:aload           5
	//*  26   61:invokevirtual   #175 <Method Class JavaType.getRawClass()>
	//*  27   64:invokespecial   #178 <Method void VirtualAnnotatedMember(TypeResolutionContext, Class, String, Class)>
	//*  28   67:aload           6
	//*  29   69:aload           4
	//*  30   71:aload_1         
	//*  31   72:invokeinterface #223 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.include()>
	//*  32   77:invokestatic    #187 <Method SimpleBeanPropertyDefinition SimpleBeanPropertyDefinition.construct(MapperConfig, AnnotatedMember, PropertyName, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//*  33   80:astore          6
	//*  34   82:aload_1         
	//*  35   83:invokeinterface #225 <Method Class com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.value()>
	//*  36   88:astore          7
	//*  37   90:aload_2         
	//*  38   91:invokevirtual   #229 <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//*  39   94:astore_1        
	//*  40   95:aload_1         
	//*  41   96:ifnonnull       142
	//*  42   99:aconst_null     
	//*  43  100:astore_1        
	//*  44  101:aload_1         
	//*  45  102:astore          4
	//*  46  104:aload_1         
	//*  47  105:ifnonnull       122
	//*  48  108:aload           7
	//*  49  110:aload_2         
	//*  50  111:invokevirtual   #232 <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//*  51  114:invokestatic    #236 <Method Object ClassUtil.createInstance(Class, boolean)>
	//*  52  117:checkcast       #238 <Class VirtualBeanPropertyWriter>
	//*  53  120:astore          4
	//*  54  122:aload           4
	//*  55  124:aload_2         
	//*  56  125:aload_3         
	//*  57  126:aload           6
	//*  58  128:aload           5
	//*  59  130:invokevirtual   #242 <Method VirtualBeanPropertyWriter VirtualBeanPropertyWriter.withConfig(MapperConfig, AnnotatedClass, BeanPropertyDefinition, JavaType)>
	//*  60  133:areturn         
			obj = ((Object) (PropertyMetadata.STD_OPTIONAL));
	//   61  134:getstatic       #199 <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//   62  137:astore          4
		obj1 = ((Object) (_propertyName(prop.name(), prop.namespace())));
		javatype = mapperconfig.constructType(prop.type());
		obj1 = ((Object) (SimpleBeanPropertyDefinition.construct(mapperconfig, ((AnnotatedMember) (new VirtualAnnotatedMember(((TypeResolutionContext) (annotatedclass)), annotatedclass.getRawType(), ((PropertyName) (obj1)).getSimpleName(), javatype.getRawClass()))), ((PropertyName) (obj1)), ((PropertyMetadata) (obj)), prop.include())));
		class1 = prop.value();
		prop = ((com.fasterxml.jackson.databind.annotation.JsonAppend.Prop) (mapperconfig.getHandlerInstantiator()));
		if(prop == null)
			prop = null;
		else
	//*  63  139:goto            14
			prop = ((com.fasterxml.jackson.databind.annotation.JsonAppend.Prop) (((HandlerInstantiator) (prop)).virtualPropertyWriterInstance(mapperconfig, class1)));
	//   64  142:aload_1         
	//   65  143:aload_2         
	//   66  144:aload           7
	//   67  146:invokevirtual   #248 <Method VirtualBeanPropertyWriter HandlerInstantiator.virtualPropertyWriterInstance(MapperConfig, Class)>
	//   68  149:astore_1        
		obj = ((Object) (prop));
		if(prop == null)
			obj = ((Object) ((VirtualBeanPropertyWriter)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers())));
		return ((BeanPropertyWriter) (((VirtualBeanPropertyWriter) (obj)).withConfig(mapperconfig, annotatedclass, ((BeanPropertyDefinition) (obj1)), javatype)));
	//*  69  150:goto            101
	}

	protected PropertyName _findConstructorName(Annotated annotated)
	{
		if(annotated instanceof AnnotatedParameter)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #253 <Class AnnotatedParameter>
	//*   2    4:ifeq            39
		{
			annotated = ((Annotated) ((AnnotatedParameter)annotated));
	//    3    7:aload_1         
	//    4    8:checkcast       #253 <Class AnnotatedParameter>
	//    5   11:astore_1        
			if(((AnnotatedParameter) (annotated)).getOwner() != null && _jdk7Helper != null)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #257 <Method AnnotatedWithParams AnnotatedParameter.getOwner()>
	//*   8   16:ifnull          39
	//*   9   19:getstatic       #59  <Field JacksonAnnotationIntrospector$Java7Support _jdk7Helper>
	//*  10   22:ifnull          39
			{
				annotated = ((Annotated) (_jdk7Helper.findConstructorName(((AnnotatedParameter) (annotated)))));
	//   11   25:getstatic       #59  <Field JacksonAnnotationIntrospector$Java7Support _jdk7Helper>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #261 <Method PropertyName JacksonAnnotationIntrospector$Java7Support.findConstructorName(AnnotatedParameter)>
	//   14   32:astore_1        
				if(annotated != null)
	//*  15   33:aload_1         
	//*  16   34:ifnull          39
					return ((PropertyName) (annotated));
	//   17   37:aload_1         
	//   18   38:areturn         
			}
		}
		return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
	}

	protected TypeResolverBuilder _findTypeResolver(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
	{
		JsonTypeInfo jsontypeinfo = (JsonTypeInfo)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonTypeInfo);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc1            #38  <Class JsonTypeInfo>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #38  <Class JsonTypeInfo>
	//    5   10:astore          5
		Object obj = ((Object) ((JsonTypeResolver)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonTypeResolver)));
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:ldc2            #265 <Class JsonTypeResolver>
	//    9   17:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//   10   20:checkcast       #265 <Class JsonTypeResolver>
	//   11   23:astore          4
		JsonTypeIdResolver jsontypeidresolver;
		if(obj != null)
	//*  12   25:aload           4
	//*  13   27:ifnull          198
		{
			if(jsontypeinfo == null)
	//*  14   30:aload           5
	//*  15   32:ifnonnull       37
				return null;
	//   16   35:aconst_null     
	//   17   36:areturn         
			obj = ((Object) (mapperconfig.typeResolverBuilderInstance(annotated, ((JsonTypeResolver) (obj)).value())));
	//   18   37:aload_1         
	//   19   38:aload_2         
	//   20   39:aload           4
	//   21   41:invokeinterface #266 <Method Class JsonTypeResolver.value()>
	//   22   46:invokevirtual   #270 <Method TypeResolverBuilder MapperConfig.typeResolverBuilderInstance(Annotated, Class)>
	//   23   49:astore          4
		} else
	//*  24   51:aload_0         
	//*  25   52:aload_2         
	//*  26   53:ldc2            #272 <Class JsonTypeIdResolver>
	//*  27   56:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//*  28   59:checkcast       #272 <Class JsonTypeIdResolver>
	//*  29   62:astore          6
	//*  30   64:aload           6
	//*  31   66:ifnonnull       232
	//*  32   69:aconst_null     
	//*  33   70:astore_1        
	//*  34   71:aload_1         
	//*  35   72:ifnull          82
	//*  36   75:aload_1         
	//*  37   76:aload_3         
	//*  38   77:invokeinterface #278 <Method void TypeIdResolver.init(JavaType)>
	//*  39   82:aload           4
	//*  40   84:aload           5
	//*  41   86:invokeinterface #282 <Method com.fasterxml.jackson.annotation.JsonTypeInfo$Id JsonTypeInfo.use()>
	//*  42   91:aload_1         
	//*  43   92:invokeinterface #287 <Method TypeResolverBuilder TypeResolverBuilder.init(com.fasterxml.jackson.annotation.JsonTypeInfo$Id, TypeIdResolver)>
	//*  44   97:astore          4
	//*  45   99:aload           5
	//*  46  101:invokeinterface #290 <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As JsonTypeInfo.include()>
	//*  47  106:astore_3        
	//*  48  107:aload_3         
	//*  49  108:astore_1        
	//*  50  109:aload_3         
	//*  51  110:getstatic       #296 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
	//*  52  113:if_acmpne       129
	//*  53  116:aload_3         
	//*  54  117:astore_1        
	//*  55  118:aload_2         
	//*  56  119:instanceof      #166 <Class AnnotatedClass>
	//*  57  122:ifeq            129
	//*  58  125:getstatic       #299 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
	//*  59  128:astore_1        
	//*  60  129:aload           4
	//*  61  131:aload_1         
	//*  62  132:invokeinterface #303 <Method TypeResolverBuilder TypeResolverBuilder.inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//*  63  137:aload           5
	//*  64  139:invokeinterface #306 <Method String JsonTypeInfo.property()>
	//*  65  144:invokeinterface #310 <Method TypeResolverBuilder TypeResolverBuilder.typeProperty(String)>
	//*  66  149:astore_2        
	//*  67  150:aload           5
	//*  68  152:invokeinterface #313 <Method Class JsonTypeInfo.defaultImpl()>
	//*  69  157:astore_3        
	//*  70  158:aload_2         
	//*  71  159:astore_1        
	//*  72  160:aload_3         
	//*  73  161:ldc2            #315 <Class com.fasterxml.jackson.annotation.JsonTypeInfo$None>
	//*  74  164:if_acmpeq       184
	//*  75  167:aload_2         
	//*  76  168:astore_1        
	//*  77  169:aload_3         
	//*  78  170:invokevirtual   #318 <Method boolean Class.isAnnotation()>
	//*  79  173:ifne            184
	//*  80  176:aload_2         
	//*  81  177:aload_3         
	//*  82  178:invokeinterface #321 <Method TypeResolverBuilder TypeResolverBuilder.defaultImpl(Class)>
	//*  83  183:astore_1        
	//*  84  184:aload_1         
	//*  85  185:aload           5
	//*  86  187:invokeinterface #324 <Method boolean JsonTypeInfo.visible()>
	//*  87  192:invokeinterface #328 <Method TypeResolverBuilder TypeResolverBuilder.typeIdVisibility(boolean)>
	//*  88  197:areturn         
		{
			if(jsontypeinfo == null)
	//*  89  198:aload           5
	//*  90  200:ifnonnull       205
				return null;
	//   91  203:aconst_null     
	//   92  204:areturn         
			if(jsontypeinfo.use() == com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE)
	//*  93  205:aload           5
	//*  94  207:invokeinterface #282 <Method com.fasterxml.jackson.annotation.JsonTypeInfo$Id JsonTypeInfo.use()>
	//*  95  212:getstatic       #334 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NONE>
	//*  96  215:if_acmpne       223
				return ((TypeResolverBuilder) (_constructNoTypeResolverBuilder()));
	//   97  218:aload_0         
	//   98  219:invokevirtual   #336 <Method StdTypeResolverBuilder _constructNoTypeResolverBuilder()>
	//   99  222:areturn         
			obj = ((Object) (_constructStdTypeResolverBuilder()));
	//  100  223:aload_0         
	//  101  224:invokevirtual   #338 <Method StdTypeResolverBuilder _constructStdTypeResolverBuilder()>
	//  102  227:astore          4
		}
		jsontypeidresolver = (JsonTypeIdResolver)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonTypeIdResolver);
		if(jsontypeidresolver == null)
			mapperconfig = null;
		else
	//* 103  229:goto            51
			mapperconfig = ((MapperConfig) (mapperconfig.typeIdResolverInstance(annotated, jsontypeidresolver.value())));
	//  104  232:aload_1         
	//  105  233:aload_2         
	//  106  234:aload           6
	//  107  236:invokeinterface #339 <Method Class JsonTypeIdResolver.value()>
	//  108  241:invokevirtual   #343 <Method TypeIdResolver MapperConfig.typeIdResolverInstance(Annotated, Class)>
	//  109  244:astore_1        
		if(mapperconfig != null)
			((TypeIdResolver) (mapperconfig)).init(javatype);
		obj = ((Object) (((TypeResolverBuilder) (obj)).init(jsontypeinfo.use(), ((TypeIdResolver) (mapperconfig)))));
		javatype = ((JavaType) (jsontypeinfo.include()));
		mapperconfig = ((MapperConfig) (javatype));
		if(javatype == com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY)
		{
			mapperconfig = ((MapperConfig) (javatype));
			if(annotated instanceof AnnotatedClass)
				mapperconfig = ((MapperConfig) (com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
		}
		annotated = ((Annotated) (((TypeResolverBuilder) (obj)).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As) (mapperconfig))).typeProperty(jsontypeinfo.property())));
		javatype = ((JavaType) (jsontypeinfo.defaultImpl()));
		mapperconfig = ((MapperConfig) (annotated));
		if(javatype != com/fasterxml/jackson/annotation/JsonTypeInfo$None)
		{
			mapperconfig = ((MapperConfig) (annotated));
			if(!((Class) (javatype)).isAnnotation())
				mapperconfig = ((MapperConfig) (((TypeResolverBuilder) (annotated)).defaultImpl(((Class) (javatype)))));
		}
		return ((TypeResolverBuilder) (mapperconfig)).typeIdVisibility(jsontypeinfo.visible());
	//* 110  245:goto            71
	}

	protected boolean _isIgnorable(Annotated annotated)
	{
		JsonIgnore jsonignore = (JsonIgnore)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIgnore);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #348 <Class JsonIgnore>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #348 <Class JsonIgnore>
	//    5   11:astore_2        
		if(jsonignore != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          23
			return jsonignore.value();
	//    8   16:aload_2         
	//    9   17:invokeinterface #350 <Method boolean JsonIgnore.value()>
	//   10   22:ireturn         
		if(_jdk7Helper != null)
	//*  11   23:getstatic       #59  <Field JacksonAnnotationIntrospector$Java7Support _jdk7Helper>
	//*  12   26:ifnull          46
		{
			annotated = ((Annotated) (_jdk7Helper.findTransient(annotated)));
	//   13   29:getstatic       #59  <Field JacksonAnnotationIntrospector$Java7Support _jdk7Helper>
	//   14   32:aload_1         
	//   15   33:invokevirtual   #353 <Method Boolean JacksonAnnotationIntrospector$Java7Support.findTransient(Annotated)>
	//   16   36:astore_1        
			if(annotated != null)
	//*  17   37:aload_1         
	//*  18   38:ifnull          46
				return ((Boolean) (annotated)).booleanValue();
	//   19   41:aload_1         
	//   20   42:invokevirtual   #356 <Method boolean Boolean.booleanValue()>
	//   21   45:ireturn         
		}
		return false;
	//   22   46:iconst_0        
	//   23   47:ireturn         
	}

	protected PropertyName _propertyName(String s, String s1)
	{
		if(s.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #361 <Method boolean String.isEmpty()>
	//*   2    4:ifeq            11
			return PropertyName.USE_DEFAULT;
	//    3    7:getstatic       #365 <Field PropertyName PropertyName.USE_DEFAULT>
	//    4   10:areturn         
		if(s1 == null || s1.isEmpty())
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #361 <Method boolean String.isEmpty()>
	//*   9   19:ifeq            27
			return PropertyName.construct(s);
	//   10   22:aload_1         
	//   11   23:invokestatic    #162 <Method PropertyName PropertyName.construct(String)>
	//   12   26:areturn         
		else
			return PropertyName.construct(s, s1);
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokestatic    #367 <Method PropertyName PropertyName.construct(String, String)>
	//   16   32:areturn         
	}

	public void findAndAddVirtualProperties(MapperConfig mapperconfig, AnnotatedClass annotatedclass, List list)
	{
		JsonAppend jsonappend = (JsonAppend)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonAppend);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc2            #371 <Class JsonAppend>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #371 <Class JsonAppend>
	//    5   11:astore          9
		if(jsonappend != null)
	//*   6   13:aload           9
	//*   7   15:ifnonnull       19
	//*   8   18:return          
		{
			boolean flag = jsonappend.prepend();
	//    9   19:aload           9
	//   10   21:invokeinterface #374 <Method boolean JsonAppend.prepend()>
	//   11   26:istore          6
			Object obj = null;
	//   12   28:aconst_null     
	//   13   29:astore          8
			com.fasterxml.jackson.databind.annotation.JsonAppend.Attr aattr[] = jsonappend.attrs();
	//   14   31:aload           9
	//   15   33:invokeinterface #378 <Method com.fasterxml.jackson.databind.annotation.JsonAppend$Attr[] JsonAppend.attrs()>
	//   16   38:astore          10
			int i = 0;
	//   17   40:iconst_0        
	//   18   41:istore          4
			int j = aattr.length;
	//   19   43:aload           10
	//   20   45:arraylength     
	//   21   46:istore          5
			while(i < j) 
	//*  22   48:iload           4
	//*  23   50:iload           5
	//*  24   52:icmpge          128
			{
				JavaType javatype = ((JavaType) (obj));
	//   25   55:aload           8
	//   26   57:astore          7
				if(obj == null)
	//*  27   59:aload           8
	//*  28   61:ifnonnull       73
					javatype = mapperconfig.constructType(java/lang/Object);
	//   29   64:aload_1         
	//   30   65:ldc2            #380 <Class Object>
	//   31   68:invokevirtual   #219 <Method JavaType MapperConfig.constructType(Class)>
	//   32   71:astore          7
				obj = ((Object) (_constructVirtualProperty(aattr[i], mapperconfig, annotatedclass, javatype)));
	//   33   73:aload_0         
	//   34   74:aload           10
	//   35   76:iload           4
	//   36   78:aaload          
	//   37   79:aload_1         
	//   38   80:aload_2         
	//   39   81:aload           7
	//   40   83:invokevirtual   #382 <Method BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend$Attr, MapperConfig, AnnotatedClass, JavaType)>
	//   41   86:astore          8
				if(flag)
	//*  42   88:iload           6
	//*  43   90:ifeq            116
					list.add(i, obj);
	//   44   93:aload_3         
	//   45   94:iload           4
	//   46   96:aload           8
	//   47   98:invokeinterface #388 <Method void List.add(int, Object)>
				else
	//*  48  103:iload           4
	//*  49  105:iconst_1        
	//*  50  106:iadd            
	//*  51  107:istore          4
	//*  52  109:aload           7
	//*  53  111:astore          8
	//*  54  113:goto            48
					list.add(obj);
	//   55  116:aload_3         
	//   56  117:aload           8
	//   57  119:invokeinterface #391 <Method boolean List.add(Object)>
	//   58  124:pop             
				i++;
				obj = ((Object) (javatype));
			}
	//*  59  125:goto            103
			com.fasterxml.jackson.databind.annotation.JsonAppend.Prop aprop[] = jsonappend.props();
	//   60  128:aload           9
	//   61  130:invokeinterface #395 <Method com.fasterxml.jackson.databind.annotation.JsonAppend$Prop[] JsonAppend.props()>
	//   62  135:astore          7
			i = 0;
	//   63  137:iconst_0        
	//   64  138:istore          4
			j = aprop.length;
	//   65  140:aload           7
	//   66  142:arraylength     
	//   67  143:istore          5
			while(i < j) 
	//*  68  145:iload           4
	//*  69  147:iload           5
	//*  70  149:icmpge          18
			{
				BeanPropertyWriter beanpropertywriter = _constructVirtualProperty(aprop[i], mapperconfig, annotatedclass);
	//   71  152:aload_0         
	//   72  153:aload           7
	//   73  155:iload           4
	//   74  157:aaload          
	//   75  158:aload_1         
	//   76  159:aload_2         
	//   77  160:invokevirtual   #397 <Method BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend$Prop, MapperConfig, AnnotatedClass)>
	//   78  163:astore          8
				if(flag)
	//*  79  165:iload           6
	//*  80  167:ifeq            189
					list.add(i, ((Object) (beanpropertywriter)));
	//   81  170:aload_3         
	//   82  171:iload           4
	//   83  173:aload           8
	//   84  175:invokeinterface #388 <Method void List.add(int, Object)>
				else
	//*  85  180:iload           4
	//*  86  182:iconst_1        
	//*  87  183:iadd            
	//*  88  184:istore          4
	//*  89  186:goto            145
					list.add(((Object) (beanpropertywriter)));
	//   90  189:aload_3         
	//   91  190:aload           8
	//   92  192:invokeinterface #391 <Method boolean List.add(Object)>
	//   93  197:pop             
				i++;
			}
		}
	//*  94  198:goto            180
	}

	public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
	{
		annotatedclass = ((AnnotatedClass) ((JsonAutoDetect)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonAutoDetect)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #402 <Class JsonAutoDetect>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #402 <Class JsonAutoDetect>
	//    5   11:astore_1        
		if(annotatedclass == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return visibilitychecker;
	//    8   16:aload_2         
	//    9   17:areturn         
		else
			return visibilitychecker.with(((JsonAutoDetect) (annotatedclass)));
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokeinterface #408 <Method VisibilityChecker VisibilityChecker.with(JsonAutoDetect)>
	//   13   25:areturn         
	}

	public String findClassDescription(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonClassDescription)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonClassDescription)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #413 <Class JsonClassDescription>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #413 <Class JsonClassDescription>
	//    5   11:astore_1        
		if(annotatedclass == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((JsonClassDescription) (annotatedclass)).value();
	//   10   18:aload_1         
	//   11   19:invokeinterface #414 <Method String JsonClassDescription.value()>
	//   12   24:areturn         
	}

	public Object findContentDeserializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #51  <Class JsonDeserialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #51  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonDeserialize) (annotated)).contentUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #419 <Method Class JsonDeserialize.contentUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonDeserializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #421 <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//*  13   26:if_acmpeq       31
				return ((Object) (annotated));
	//   14   29:aload_1         
	//   15   30:areturn         
		}
		return ((Object) (null));
	//   16   31:aconst_null     
	//   17   32:areturn         
	}

	public Object findContentSerializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonSerialize) (annotated)).contentUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #423 <Method Class JsonSerialize.contentUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonSerializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #425 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*  13   26:if_acmpeq       31
				return ((Object) (annotated));
	//   14   29:aload_1         
	//   15   30:areturn         
		}
		return ((Object) (null));
	//   16   31:aconst_null     
	//   17   32:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorBinding(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonCreator)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonCreator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #429 <Class JsonCreator>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #429 <Class JsonCreator>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((JsonCreator) (annotated)).mode();
	//   10   18:aload_1         
	//   11   19:invokeinterface #433 <Method com.fasterxml.jackson.annotation.JsonCreator$Mode JsonCreator.mode()>
	//   12   24:areturn         
	}

	public Object findDeserializationContentConverter(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) ((JsonDeserialize)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #51  <Class JsonDeserialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #51  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotatedmember == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return ((Object) (null));
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return ((Object) (_classIfExplicit(((JsonDeserialize) (annotatedmember)).contentConverter(), com/fasterxml/jackson/databind/util/Converter$None)));
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #438 <Method Class JsonDeserialize.contentConverter()>
	//   13   24:ldc2            #440 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//   14   27:invokevirtual   #442 <Method Class _classIfExplicit(Class, Class)>
	//   15   30:areturn         
	}

	public Class findDeserializationContentType(Annotated annotated, JavaType javatype)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #51  <Class JsonDeserialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #51  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return _classIfExplicit(((JsonDeserialize) (annotated)).contentAs());
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #448 <Method Class JsonDeserialize.contentAs()>
	//   13   24:invokevirtual   #117 <Method Class _classIfExplicit(Class)>
	//   14   27:areturn         
	}

	public Object findDeserializationConverter(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #51  <Class JsonDeserialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #51  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return ((Object) (null));
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return ((Object) (_classIfExplicit(((JsonDeserialize) (annotated)).converter(), com/fasterxml/jackson/databind/util/Converter$None)));
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #454 <Method Class JsonDeserialize.converter()>
	//   13   24:ldc2            #440 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//   14   27:invokevirtual   #442 <Method Class _classIfExplicit(Class, Class)>
	//   15   30:areturn         
	}

	public Class findDeserializationKeyType(Annotated annotated, JavaType javatype)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #51  <Class JsonDeserialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #51  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return _classIfExplicit(((JsonDeserialize) (annotated)).keyAs());
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #458 <Method Class JsonDeserialize.keyAs()>
	//   13   24:invokevirtual   #117 <Method Class _classIfExplicit(Class)>
	//   14   27:areturn         
	}

	public Class findDeserializationType(Annotated annotated, JavaType javatype)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #51  <Class JsonDeserialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #51  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return _classIfExplicit(((JsonDeserialize) (annotated)).as());
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #462 <Method Class JsonDeserialize.as()>
	//   13   24:invokevirtual   #117 <Method Class _classIfExplicit(Class)>
	//   14   27:areturn         
	}

	public Object findDeserializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #51  <Class JsonDeserialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #51  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonDeserialize) (annotated)).using()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #466 <Method Class JsonDeserialize.using()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonDeserializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #421 <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//*  13   26:if_acmpeq       31
				return ((Object) (annotated));
	//   14   29:aload_1         
	//   15   30:areturn         
		}
		return ((Object) (null));
	//   16   31:aconst_null     
	//   17   32:areturn         
	}

	public String findEnumValue(Enum enum)
	{
		Object obj = ((Object) (((Object) (enum)).getClass().getField(enum.name())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #475 <Method Class Object.getClass()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #478 <Method String Enum.name()>
	//    4    8:invokevirtual   #482 <Method Field Class.getField(String)>
	//    5   11:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_54;
	//    6   12:aload_3         
	//    7   13:ifnull          54
		obj = ((Object) ((JsonProperty)((Field) (obj)).getAnnotation(com/fasterxml/jackson/annotation/JsonProperty)));
	//    8   16:aload_3         
	//    9   17:ldc2            #484 <Class JsonProperty>
	//   10   20:invokevirtual   #490 <Method Annotation Field.getAnnotation(Class)>
	//   11   23:checkcast       #484 <Class JsonProperty>
	//   12   26:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_54;
	//   13   27:aload_3         
	//   14   28:ifnull          54
		obj = ((Object) (((JsonProperty) (obj)).value()));
	//   15   31:aload_3         
	//   16   32:invokeinterface #491 <Method String JsonProperty.value()>
	//   17   37:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_54;
	//   18   38:aload_3         
	//   19   39:ifnull          54
		boolean flag = ((String) (obj)).isEmpty();
	//   20   42:aload_3         
	//   21   43:invokevirtual   #361 <Method boolean String.isEmpty()>
	//   22   46:istore_2        
		if(!flag)
	//*  23   47:iload_2         
	//*  24   48:ifne            54
			return ((String) (obj));
	//   25   51:aload_3         
	//   26   52:areturn         
		break MISSING_BLOCK_LABEL_54;
		Object obj1;
		obj1;
	//   27   53:astore_3        
_L2:
		return enum.name();
	//   28   54:aload_1         
	//   29   55:invokevirtual   #478 <Method String Enum.name()>
	//   30   58:areturn         
		obj1;
	//   31   59:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  32   60:goto            54
	}

	public String[] findEnumValues(Class class1, Enum aenum[], String as[])
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		Field afield[] = ClassUtil.getDeclaredFields(class1);
	//    2    3:aload_1         
	//    3    4:invokestatic    #498 <Method Field[] ClassUtil.getDeclaredFields(Class)>
	//    4    7:astore          7
		int k = afield.length;
	//    5    9:aload           7
	//    6   11:arraylength     
	//    7   12:istore          5
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore          4
		class1 = ((Class) (obj));
	//   10   17:aload           6
	//   11   19:astore_1        
		while(i < k) 
	//*  12   20:iload           4
	//*  13   22:iload           5
	//*  14   24:icmpge          130
		{
			Field field = afield[i];
	//   15   27:aload           7
	//   16   29:iload           4
	//   17   31:aaload          
	//   18   32:astore          8
			Object obj1;
			if(!field.isEnumConstant())
	//*  19   34:aload           8
	//*  20   36:invokevirtual   #501 <Method boolean Field.isEnumConstant()>
	//*  21   39:ifne            57
			{
				obj1 = ((Object) (class1));
	//   22   42:aload_1         
	//   23   43:astore          6
			} else
	//*  24   45:iload           4
	//*  25   47:iconst_1        
	//*  26   48:iadd            
	//*  27   49:istore          4
	//*  28   51:aload           6
	//*  29   53:astore_1        
	//*  30   54:goto            20
			{
				Object obj2 = ((Object) ((JsonProperty)field.getAnnotation(com/fasterxml/jackson/annotation/JsonProperty)));
	//   31   57:aload           8
	//   32   59:ldc2            #484 <Class JsonProperty>
	//   33   62:invokevirtual   #490 <Method Annotation Field.getAnnotation(Class)>
	//   34   65:checkcast       #484 <Class JsonProperty>
	//   35   68:astore          9
				obj1 = ((Object) (class1));
	//   36   70:aload_1         
	//   37   71:astore          6
				if(obj2 != null)
	//*  38   73:aload           9
	//*  39   75:ifnull          45
				{
					obj2 = ((Object) (((JsonProperty) (obj2)).value()));
	//   40   78:aload           9
	//   41   80:invokeinterface #491 <Method String JsonProperty.value()>
	//   42   85:astore          9
					obj1 = ((Object) (class1));
	//   43   87:aload_1         
	//   44   88:astore          6
					if(!((String) (obj2)).isEmpty())
	//*  45   90:aload           9
	//*  46   92:invokevirtual   #361 <Method boolean String.isEmpty()>
	//*  47   95:ifne            45
					{
						obj1 = ((Object) (class1));
	//   48   98:aload_1         
	//   49   99:astore          6
						if(class1 == null)
	//*  50  101:aload_1         
	//*  51  102:ifnonnull       114
							obj1 = ((Object) (new HashMap()));
	//   52  105:new             #503 <Class HashMap>
	//   53  108:dup             
	//   54  109:invokespecial   #504 <Method void HashMap()>
	//   55  112:astore          6
						((HashMap) (obj1)).put(((Object) (field.getName())), obj2);
	//   56  114:aload           6
	//   57  116:aload           8
	//   58  118:invokevirtual   #505 <Method String Field.getName()>
	//   59  121:aload           9
	//   60  123:invokevirtual   #509 <Method Object HashMap.put(Object, Object)>
	//   61  126:pop             
					}
				}
			}
			i++;
			class1 = ((Class) (obj1));
		}
	//*  62  127:goto            45
		if(class1 != null)
	//*  63  130:aload_1         
	//*  64  131:ifnull          175
		{
			int j = 0;
	//   65  134:iconst_0        
	//   66  135:istore          4
			for(int l = aenum.length; j < l; j++)
	//*  67  137:aload_2         
	//*  68  138:arraylength     
	//*  69  139:istore          5
	//*  70  141:iload           4
	//*  71  143:iload           5
	//*  72  145:icmpge          175
				as[j] = (String)((HashMap) (class1)).get(((Object) (aenum[j].name())));
	//   73  148:aload_3         
	//   74  149:iload           4
	//   75  151:aload_1         
	//   76  152:aload_2         
	//   77  153:iload           4
	//   78  155:aaload          
	//   79  156:invokevirtual   #478 <Method String Enum.name()>
	//   80  159:invokevirtual   #513 <Method Object HashMap.get(Object)>
	//   81  162:checkcast       #358 <Class String>
	//   82  165:aastore         

	//   83  166:iload           4
	//   84  168:iconst_1        
	//   85  169:iadd            
	//   86  170:istore          4
		}
	//*  87  172:goto            141
		return as;
	//   88  175:aload_3         
	//   89  176:areturn         
	}

	public Object findFilterId(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonFilter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonFilter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #517 <Class JsonFilter>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #517 <Class JsonFilter>
	//    5   11:astore_1        
		if(annotated != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          32
		{
			annotated = ((Annotated) (((JsonFilter) (annotated)).value()));
	//    8   16:aload_1         
	//    9   17:invokeinterface #518 <Method String JsonFilter.value()>
	//   10   22:astore_1        
			if(((String) (annotated)).length() > 0)
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #522 <Method int String.length()>
	//*  13   27:ifle            32
				return ((Object) (annotated));
	//   14   30:aload_1         
	//   15   31:areturn         
		}
		return ((Object) (null));
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findFormat(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonFormat)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonFormat)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #36  <Class JsonFormat>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #36  <Class JsonFormat>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return new com.fasterxml.jackson.annotation.JsonFormat.Value(((JsonFormat) (annotated)));
	//   10   17:new             #526 <Class com.fasterxml.jackson.annotation.JsonFormat$Value>
	//   11   20:dup             
	//   12   21:aload_1         
	//   13   22:invokespecial   #529 <Method void com.fasterxml.jackson.annotation.JsonFormat$Value(JsonFormat)>
	//   14   25:areturn         
	}

	public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonIgnoreProperties)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonIgnoreProperties)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #533 <Class JsonIgnoreProperties>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #533 <Class JsonIgnoreProperties>
	//    5   11:astore_1        
		if(annotatedclass == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return Boolean.valueOf(((JsonIgnoreProperties) (annotatedclass)).ignoreUnknown());
	//   10   18:aload_1         
	//   11   19:invokeinterface #536 <Method boolean JsonIgnoreProperties.ignoreUnknown()>
	//   12   24:invokestatic    #540 <Method Boolean Boolean.valueOf(boolean)>
	//   13   27:areturn         
	}

	public String findImplicitPropertyName(AnnotatedMember annotatedmember)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object findInjectableValueId(AnnotatedMember annotatedmember)
	{
		Object obj = ((Object) ((JacksonInject)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JacksonInject)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #545 <Class JacksonInject>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #545 <Class JacksonInject>
	//    5   11:astore_2        
		if(obj == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       20
		{
			obj = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		} else
	//*  10   18:aload_2         
	//*  11   19:areturn         
		{
			String s = ((JacksonInject) (obj)).value();
	//   12   20:aload_2         
	//   13   21:invokeinterface #546 <Method String JacksonInject.value()>
	//   14   26:astore_3        
			obj = ((Object) (s));
	//   15   27:aload_3         
	//   16   28:astore_2        
			if(s.length() == 0)
	//*  17   29:aload_3         
	//*  18   30:invokevirtual   #522 <Method int String.length()>
	//*  19   33:ifne            18
			{
				if(!(annotatedmember instanceof AnnotatedMethod))
	//*  20   36:aload_1         
	//*  21   37:instanceof      #548 <Class AnnotatedMethod>
	//*  22   40:ifne            51
					return ((Object) (annotatedmember.getRawType().getName()));
	//   23   43:aload_1         
	//   24   44:invokevirtual   #551 <Method Class AnnotatedMember.getRawType()>
	//   25   47:invokevirtual   #63  <Method String Class.getName()>
	//   26   50:areturn         
				AnnotatedMethod annotatedmethod = (AnnotatedMethod)annotatedmember;
	//   27   51:aload_1         
	//   28   52:checkcast       #548 <Class AnnotatedMethod>
	//   29   55:astore_2        
				if(annotatedmethod.getParameterCount() == 0)
	//*  30   56:aload_2         
	//*  31   57:invokevirtual   #554 <Method int AnnotatedMethod.getParameterCount()>
	//*  32   60:ifne            71
					return ((Object) (annotatedmember.getRawType().getName()));
	//   33   63:aload_1         
	//   34   64:invokevirtual   #551 <Method Class AnnotatedMember.getRawType()>
	//   35   67:invokevirtual   #63  <Method String Class.getName()>
	//   36   70:areturn         
				else
					return ((Object) (annotatedmethod.getRawParameterType(0).getName()));
	//   37   71:aload_2         
	//   38   72:iconst_0        
	//   39   73:invokevirtual   #558 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//   40   76:invokevirtual   #63  <Method String Class.getName()>
	//   41   79:areturn         
			}
		}
		return obj;
	}

	public Object findKeyDeserializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #51  <Class JsonDeserialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #51  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonDeserialize) (annotated)).keyUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #562 <Method Class JsonDeserialize.keyUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/KeyDeserializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #564 <Class com.fasterxml.jackson.databind.KeyDeserializer$None>
	//*  13   26:if_acmpeq       31
				return ((Object) (annotated));
	//   14   29:aload_1         
	//   15   30:areturn         
		}
		return ((Object) (null));
	//   16   31:aconst_null     
	//   17   32:areturn         
	}

	public Object findKeySerializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonSerialize) (annotated)).keyUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #566 <Method Class JsonSerialize.keyUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonSerializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #425 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*  13   26:if_acmpeq       31
				return ((Object) (annotated));
	//   14   29:aload_1         
	//   15   30:areturn         
		}
		return ((Object) (null));
	//   16   31:aconst_null     
	//   17   32:areturn         
	}

	public PropertyName findNameForDeserialization(Annotated annotated)
	{
		Object obj = ((Object) ((JsonSetter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonSetter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #569 <Class JsonSetter>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #569 <Class JsonSetter>
	//    5   11:astore_2        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          28
		{
			obj = ((Object) (PropertyName.construct(((JsonSetter) (obj)).value())));
	//    8   16:aload_2         
	//    9   17:invokeinterface #570 <Method String JsonSetter.value()>
	//   10   22:invokestatic    #162 <Method PropertyName PropertyName.construct(String)>
	//   11   25:astore_2        
		} else
	//*  12   26:aload_2         
	//*  13   27:areturn         
		{
			obj = ((Object) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:ldc2            #484 <Class JsonProperty>
	//   17   33:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//   18   36:checkcast       #484 <Class JsonProperty>
	//   19   39:astore_2        
			if(obj != null)
	//*  20   40:aload_2         
	//*  21   41:ifnull          54
				return PropertyName.construct(((JsonProperty) (obj)).value());
	//   22   44:aload_2         
	//   23   45:invokeinterface #491 <Method String JsonProperty.value()>
	//   24   50:invokestatic    #162 <Method PropertyName PropertyName.construct(String)>
	//   25   53:areturn         
			PropertyName propertyname = _findConstructorName(annotated);
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokevirtual   #572 <Method PropertyName _findConstructorName(Annotated)>
	//   29   59:astore_3        
			obj = ((Object) (propertyname));
	//   30   60:aload_3         
	//   31   61:astore_2        
			if(propertyname == null)
	//*  32   62:aload_3         
	//*  33   63:ifnonnull       26
				if(_hasOneOf(annotated, ANNOTATIONS_TO_INFER_DESER))
	//*  34   66:aload_0         
	//*  35   67:aload_1         
	//*  36   68:getstatic       #53  <Field Class[] ANNOTATIONS_TO_INFER_DESER>
	//*  37   71:invokevirtual   #576 <Method boolean _hasOneOf(Annotated, Class[])>
	//*  38   74:ifeq            81
					return PropertyName.USE_DEFAULT;
	//   39   77:getstatic       #365 <Field PropertyName PropertyName.USE_DEFAULT>
	//   40   80:areturn         
				else
					return null;
	//   41   81:aconst_null     
	//   42   82:areturn         
		}
		return ((PropertyName) (obj));
	}

	public PropertyName findNameForSerialization(Annotated annotated)
	{
		Object obj = ((Object) ((JsonGetter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonGetter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #579 <Class JsonGetter>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #579 <Class JsonGetter>
	//    5   11:astore_2        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          28
		{
			obj = ((Object) (PropertyName.construct(((JsonGetter) (obj)).value())));
	//    8   16:aload_2         
	//    9   17:invokeinterface #580 <Method String JsonGetter.value()>
	//   10   22:invokestatic    #162 <Method PropertyName PropertyName.construct(String)>
	//   11   25:astore_2        
		} else
	//*  12   26:aload_2         
	//*  13   27:areturn         
		{
			obj = ((Object) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:ldc2            #484 <Class JsonProperty>
	//   17   33:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//   18   36:checkcast       #484 <Class JsonProperty>
	//   19   39:astore_2        
			if(obj != null)
	//*  20   40:aload_2         
	//*  21   41:ifnull          54
				return PropertyName.construct(((JsonProperty) (obj)).value());
	//   22   44:aload_2         
	//   23   45:invokeinterface #491 <Method String JsonProperty.value()>
	//   24   50:invokestatic    #162 <Method PropertyName PropertyName.construct(String)>
	//   25   53:areturn         
			PropertyName propertyname = _findConstructorName(annotated);
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokevirtual   #572 <Method PropertyName _findConstructorName(Annotated)>
	//   29   59:astore_3        
			obj = ((Object) (propertyname));
	//   30   60:aload_3         
	//   31   61:astore_2        
			if(propertyname == null)
	//*  32   62:aload_3         
	//*  33   63:ifnonnull       26
				if(_hasOneOf(annotated, ANNOTATIONS_TO_INFER_SER))
	//*  34   66:aload_0         
	//*  35   67:aload_1         
	//*  36   68:getstatic       #49  <Field Class[] ANNOTATIONS_TO_INFER_SER>
	//*  37   71:invokevirtual   #576 <Method boolean _hasOneOf(Annotated, Class[])>
	//*  38   74:ifeq            81
					return PropertyName.USE_DEFAULT;
	//   39   77:getstatic       #365 <Field PropertyName PropertyName.USE_DEFAULT>
	//   40   80:areturn         
				else
					return null;
	//   41   81:aconst_null     
	//   42   82:areturn         
		}
		return ((PropertyName) (obj));
	}

	public Object findNamingStrategy(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonNaming)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonNaming)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #584 <Class JsonNaming>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #584 <Class JsonNaming>
	//    5   11:astore_1        
		if(annotatedclass == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return ((Object) (null));
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((Object) (((JsonNaming) (annotatedclass)).value()));
	//   10   18:aload_1         
	//   11   19:invokeinterface #585 <Method Class JsonNaming.value()>
	//   12   24:areturn         
	}

	public Object findNullSerializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonSerialize) (annotated)).nullsUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #589 <Method Class JsonSerialize.nullsUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonSerializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #425 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*  13   26:if_acmpeq       31
				return ((Object) (annotated));
	//   14   29:aload_1         
	//   15   30:areturn         
		}
		return ((Object) (null));
	//   16   31:aconst_null     
	//   17   32:areturn         
	}

	public ObjectIdInfo findObjectIdInfo(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonIdentityInfo)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIdentityInfo)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #593 <Class JsonIdentityInfo>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #593 <Class JsonIdentityInfo>
	//    5   11:astore_1        
		if(annotated == null || ((JsonIdentityInfo) (annotated)).generator() == com/fasterxml/jackson/annotation/ObjectIdGenerators$None)
	//*   6   12:aload_1         
	//*   7   13:ifnull          28
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #596 <Method Class JsonIdentityInfo.generator()>
	//*  10   22:ldc2            #598 <Class com.fasterxml.jackson.annotation.ObjectIdGenerators$None>
	//*  11   25:if_acmpne       30
			return null;
	//   12   28:aconst_null     
	//   13   29:areturn         
		else
			return new ObjectIdInfo(PropertyName.construct(((JsonIdentityInfo) (annotated)).property()), ((JsonIdentityInfo) (annotated)).scope(), ((JsonIdentityInfo) (annotated)).generator(), ((JsonIdentityInfo) (annotated)).resolver());
	//   14   30:new             #600 <Class ObjectIdInfo>
	//   15   33:dup             
	//   16   34:aload_1         
	//   17   35:invokeinterface #601 <Method String JsonIdentityInfo.property()>
	//   18   40:invokestatic    #162 <Method PropertyName PropertyName.construct(String)>
	//   19   43:aload_1         
	//   20   44:invokeinterface #604 <Method Class JsonIdentityInfo.scope()>
	//   21   49:aload_1         
	//   22   50:invokeinterface #596 <Method Class JsonIdentityInfo.generator()>
	//   23   55:aload_1         
	//   24   56:invokeinterface #607 <Method Class JsonIdentityInfo.resolver()>
	//   25   61:invokespecial   #610 <Method void ObjectIdInfo(PropertyName, Class, Class, Class)>
	//   26   64:areturn         
	}

	public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectidinfo)
	{
		JsonIdentityReference jsonidentityreference = (JsonIdentityReference)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIdentityReference);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #614 <Class JsonIdentityReference>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #614 <Class JsonIdentityReference>
	//    5   11:astore_3        
		annotated = ((Annotated) (objectidinfo));
	//    6   12:aload_2         
	//    7   13:astore_1        
		if(jsonidentityreference != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          29
			annotated = ((Annotated) (objectidinfo.withAlwaysAsId(jsonidentityreference.alwaysAsId())));
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokeinterface #617 <Method boolean JsonIdentityReference.alwaysAsId()>
	//   13   25:invokevirtual   #621 <Method ObjectIdInfo ObjectIdInfo.withAlwaysAsId(boolean)>
	//   14   28:astore_1        
		return ((ObjectIdInfo) (annotated));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public Class findPOJOBuilder(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonDeserialize)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #51  <Class JsonDeserialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #51  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotatedclass == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return _classIfExplicit(((JsonDeserialize) (annotatedclass)).builder());
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #626 <Method Class JsonDeserialize.builder()>
	//   13   24:invokevirtual   #117 <Method Class _classIfExplicit(Class)>
	//   14   27:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonPOJOBuilder)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonPOJOBuilder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #631 <Class JsonPOJOBuilder>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #631 <Class JsonPOJOBuilder>
	//    5   11:astore_1        
		if(annotatedclass == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return new com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value(((JsonPOJOBuilder) (annotatedclass)));
	//   10   18:new             #633 <Class com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:invokespecial   #636 <Method void com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value(JsonPOJOBuilder)>
	//   14   26:areturn         
	}

	public String[] findPropertiesToIgnore(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonIgnoreProperties)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIgnoreProperties)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #533 <Class JsonIgnoreProperties>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #533 <Class JsonIgnoreProperties>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((JsonIgnoreProperties) (annotated)).value();
	//   10   18:aload_1         
	//   11   19:invokeinterface #641 <Method String[] JsonIgnoreProperties.value()>
	//   12   24:areturn         
	}

	public String[] findPropertiesToIgnore(Annotated annotated, boolean flag)
	{
		annotated = ((Annotated) ((JsonIgnoreProperties)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIgnoreProperties)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #533 <Class JsonIgnoreProperties>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #533 <Class JsonIgnoreProperties>
	//    5   11:astore_1        
		if(annotated != null) goto _L2; else goto _L1
	//    6   12:aload_1         
	//    7   13:ifnonnull       18
_L1:
		return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
_L2:
		if(!flag) goto _L4; else goto _L3
	//   10   18:iload_2         
	//   11   19:ifeq            38
_L3:
		if(((JsonIgnoreProperties) (annotated)).allowGetters()) goto _L1; else goto _L5
	//   12   22:aload_1         
	//   13   23:invokeinterface #645 <Method boolean JsonIgnoreProperties.allowGetters()>
	//   14   28:ifne            16
_L5:
		return ((JsonIgnoreProperties) (annotated)).value();
	//   15   31:aload_1         
	//   16   32:invokeinterface #641 <Method String[] JsonIgnoreProperties.value()>
	//   17   37:areturn         
_L4:
		if(((JsonIgnoreProperties) (annotated)).allowSetters())
	//*  18   38:aload_1         
	//*  19   39:invokeinterface #648 <Method boolean JsonIgnoreProperties.allowSetters()>
	//*  20   44:ifeq            31
			return null;
	//   21   47:aconst_null     
	//   22   48:areturn         
		if(true) goto _L5; else goto _L6
_L6:
	}

	public com.fasterxml.jackson.annotation.JsonProperty.Access findPropertyAccess(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #484 <Class JsonProperty>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #484 <Class JsonProperty>
	//    5   11:astore_1        
		if(annotated != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
			return ((JsonProperty) (annotated)).access();
	//    8   16:aload_1         
	//    9   17:invokeinterface #654 <Method com.fasterxml.jackson.annotation.JsonProperty$Access JsonProperty.access()>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		if(javatype.getContentType() == null)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #660 <Method JavaType JavaType.getContentType()>
	//*   2    4:ifnonnull       41
			throw new IllegalArgumentException((new StringBuilder()).append("Must call method with a container or reference type (got ").append(((Object) (javatype))).append(")").toString());
	//    3    7:new             #662 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:new             #664 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #665 <Method void StringBuilder()>
	//    8   18:ldc2            #667 <String "Must call method with a container or reference type (got ">
	//    9   21:invokevirtual   #671 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_3         
	//   11   25:invokevirtual   #674 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:ldc2            #676 <String ")">
	//   13   31:invokevirtual   #671 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #679 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #681 <Method void IllegalArgumentException(String)>
	//   16   40:athrow          
		else
			return _findTypeResolver(mapperconfig, ((Annotated) (annotatedmember)), javatype);
	//   17   41:aload_0         
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:aload_3         
	//   21   45:invokevirtual   #683 <Method TypeResolverBuilder _findTypeResolver(MapperConfig, Annotated, JavaType)>
	//   22   48:areturn         
	}

	public String findPropertyDefaultValue(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #484 <Class JsonProperty>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #484 <Class JsonProperty>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		String s = ((JsonProperty) (annotated)).defaultValue();
	//   10   18:aload_1         
	//   11   19:invokeinterface #689 <Method String JsonProperty.defaultValue()>
	//   12   24:astore_2        
		annotated = ((Annotated) (s));
	//   13   25:aload_2         
	//   14   26:astore_1        
		if(s.isEmpty())
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #361 <Method boolean String.isEmpty()>
	//*  17   31:ifeq            36
			annotated = null;
	//   18   34:aconst_null     
	//   19   35:astore_1        
		return ((String) (annotated));
	//   20   36:aload_1         
	//   21   37:areturn         
	}

	public String findPropertyDescription(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonPropertyDescription)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonPropertyDescription)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #692 <Class JsonPropertyDescription>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #692 <Class JsonPropertyDescription>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((JsonPropertyDescription) (annotated)).value();
	//   10   18:aload_1         
	//   11   19:invokeinterface #693 <Method String JsonPropertyDescription.value()>
	//   12   24:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(Annotated annotated)
	{
		com.fasterxml.jackson.annotation.JsonInclude.Include include;
		JsonInclude jsoninclude;
		jsoninclude = (JsonInclude)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonInclude);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #697 <Class JsonInclude>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #697 <Class JsonInclude>
	//    5   11:astore          4
		static class _cls1
		{

			static final int $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[];

			static 
			{
				$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion = new int[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.values().length];
			//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion[] com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion>
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion>
			//    5   12:getstatic       #24  <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.ALWAYS>
			//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion>
			//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.NON_NULL>
			//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion>
			//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.NON_DEFAULT>
			//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion>
			//*  20   45:getstatic       #37  <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.NON_EMPTY>
			//*  21   48:invokevirtual   #28  <Method int com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion>
			//*  25   56:getstatic       #40  <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.DEFAULT_INCLUSION>
			//*  26   59:invokevirtual   #28  <Method int com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
			//*  30   65:astore_0        
			//*  31   66:return          
			//*  32   67:astore_0        
			//*  33   68:goto            53
			//*  34   71:astore_0        
			//*  35   72:goto            42
			//*  36   75:astore_0        
			//*  37   76:goto            31
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   79:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  39   80:goto            20
			}
		}

		com.fasterxml.jackson.annotation.JsonInclude.Include include1;
		if(jsoninclude == null)
	//*   6   13:aload           4
	//*   7   15:ifnonnull       109
			include1 = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS;
	//    8   18:getstatic       #703 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//    9   21:astore_3        
		else
	//*  10   22:aload_3         
	//*  11   23:astore_2        
	//*  12   24:aload_3         
	//*  13   25:getstatic       #703 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  14   28:if_acmpne       94
	//*  15   31:aload_0         
	//*  16   32:aload_1         
	//*  17   33:ldc1            #32  <Class JsonSerialize>
	//*  18   35:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//*  19   38:checkcast       #32  <Class JsonSerialize>
	//*  20   41:astore_1        
	//*  21   42:aload_3         
	//*  22   43:astore_2        
	//*  23   44:aload_1         
	//*  24   45:ifnull          94
	//*  25   48:aload_1         
	//*  26   49:invokeinterface #706 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion JsonSerialize.include()>
	//*  27   54:astore_1        
	//*  28   55:getstatic       #710 <Field int[] JacksonAnnotationIntrospector$1.$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion>
	//*  29   58:aload_1         
	//*  30   59:invokevirtual   #715 <Method int com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.ordinal()>
	//*  31   62:iaload          
	//*  32   63:tableswitch     1 4: default 92
	//	               1 120
	//	               2 127
	//	               3 134
	//	               4 141
	//*  33   92:aload_3         
	//*  34   93:astore_2        
	//*  35   94:aload           4
	//*  36   96:ifnonnull       148
	//*  37   99:getstatic       #703 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  38  102:astore_1        
	//*  39  103:aload_2         
	//*  40  104:aload_1         
	//*  41  105:invokestatic    #720 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.construct(com.fasterxml.jackson.annotation.JsonInclude$Include, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//*  42  108:areturn         
			include1 = jsoninclude.value();
	//   43  109:aload           4
	//   44  111:invokeinterface #722 <Method com.fasterxml.jackson.annotation.JsonInclude$Include JsonInclude.value()>
	//   45  116:astore_3        
		include = include1;
		if(include1 != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS) goto _L2; else goto _L1
_L1:
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
		include = include1;
		if(annotated == null) goto _L2; else goto _L3
_L3:
		annotated = ((Annotated) (((JsonSerialize) (annotated)).include()));
		_cls1..SwitchMap.com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion[((com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion) (annotated)).ordinal()];
		JVM INSTR tableswitch 1 4: default 92
	//	               1 120
	//	               2 127
	//	               3 134
	//	               4 141;
		   goto _L4 _L5 _L6 _L7 _L8
_L8:
		break MISSING_BLOCK_LABEL_141;
_L4:
		include = include1;
_L2:
		if(jsoninclude == null)
			annotated = ((Annotated) (com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS));
		else
	//*  46  117:goto            22
	//*  47  120:getstatic       #725 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*  48  123:astore_2        
	//*  49  124:goto            94
	//*  50  127:getstatic       #728 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//*  51  130:astore_2        
	//*  52  131:goto            94
	//*  53  134:getstatic       #731 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
	//*  54  137:astore_2        
	//*  55  138:goto            94
	//*  56  141:getstatic       #734 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//*  57  144:astore_2        
	//*  58  145:goto            94
			annotated = ((Annotated) (jsoninclude.content()));
	//   59  148:aload           4
	//   60  150:invokeinterface #737 <Method com.fasterxml.jackson.annotation.JsonInclude$Include JsonInclude.content()>
	//   61  155:astore_1        
		return com.fasterxml.jackson.annotation.JsonInclude.Value.construct(include, ((com.fasterxml.jackson.annotation.JsonInclude.Include) (annotated)));
_L5:
		include = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;
		  goto _L2
_L6:
		include = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
		  goto _L2
_L7:
		include = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
		  goto _L2
		include = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
		  goto _L2
	//*  62  156:goto            103
	}

	public Integer findPropertyIndex(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #484 <Class JsonProperty>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #484 <Class JsonProperty>
	//    5   11:astore_1        
		if(annotated != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          33
		{
			int i = ((JsonProperty) (annotated)).index();
	//    8   16:aload_1         
	//    9   17:invokeinterface #742 <Method int JsonProperty.index()>
	//   10   22:istore_2        
			if(i != -1)
	//*  11   23:iload_2         
	//*  12   24:iconst_m1       
	//*  13   25:icmpeq          33
				return Integer.valueOf(i);
	//   14   28:iload_2         
	//   15   29:invokestatic    #747 <Method Integer Integer.valueOf(int)>
	//   16   32:areturn         
		}
		return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
	}

	public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		if(javatype.isContainerType())
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #751 <Method boolean JavaType.isContainerType()>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _findTypeResolver(mapperconfig, ((Annotated) (annotatedmember)), javatype);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #683 <Method TypeResolverBuilder _findTypeResolver(MapperConfig, Annotated, JavaType)>
	//   10   16:areturn         
	}

	public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
	{
		JsonManagedReference jsonmanagedreference = (JsonManagedReference)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonManagedReference);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #46  <Class JsonManagedReference>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #46  <Class JsonManagedReference>
	//    5   10:astore_2        
		if(jsonmanagedreference != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          25
			return com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.managed(jsonmanagedreference.value());
	//    8   15:aload_2         
	//    9   16:invokeinterface #754 <Method String JsonManagedReference.value()>
	//   10   21:invokestatic    #760 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.managed(String)>
	//   11   24:areturn         
		annotatedmember = ((AnnotatedMember) ((JsonBackReference)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonBackReference)));
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:ldc1            #44  <Class JsonBackReference>
	//   15   29:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//   16   32:checkcast       #44  <Class JsonBackReference>
	//   17   35:astore_1        
		if(annotatedmember != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          50
			return com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.back(((JsonBackReference) (annotatedmember)).value());
	//   20   40:aload_1         
	//   21   41:invokeinterface #761 <Method String JsonBackReference.value()>
	//   22   46:invokestatic    #764 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.back(String)>
	//   23   49:areturn         
		else
			return null;
	//   24   50:aconst_null     
	//   25   51:areturn         
	}

	public PropertyName findRootName(AnnotatedClass annotatedclass)
	{
		JsonRootName jsonrootname = (JsonRootName)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonRootName);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #768 <Class JsonRootName>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #768 <Class JsonRootName>
	//    5   11:astore_3        
		if(jsonrootname == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		String s = jsonrootname.namespace();
	//   10   18:aload_3         
	//   11   19:invokeinterface #769 <Method String JsonRootName.namespace()>
	//   12   24:astore_2        
		annotatedclass = ((AnnotatedClass) (s));
	//   13   25:aload_2         
	//   14   26:astore_1        
		if(s != null)
	//*  15   27:aload_2         
	//*  16   28:ifnull          42
		{
			annotatedclass = ((AnnotatedClass) (s));
	//   17   31:aload_2         
	//   18   32:astore_1        
			if(s.length() == 0)
	//*  19   33:aload_2         
	//*  20   34:invokevirtual   #522 <Method int String.length()>
	//*  21   37:ifne            42
				annotatedclass = null;
	//   22   40:aconst_null     
	//   23   41:astore_1        
		}
		return PropertyName.construct(jsonrootname.value(), ((String) (annotatedclass)));
	//   24   42:aload_3         
	//   25   43:invokeinterface #770 <Method String JsonRootName.value()>
	//   26   48:aload_1         
	//   27   49:invokestatic    #367 <Method PropertyName PropertyName.construct(String, String)>
	//   28   52:areturn         
	}

	public Object findSerializationContentConverter(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) ((JsonSerialize)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotatedmember == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return ((Object) (null));
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return ((Object) (_classIfExplicit(((JsonSerialize) (annotatedmember)).contentConverter(), com/fasterxml/jackson/databind/util/Converter$None)));
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #772 <Method Class JsonSerialize.contentConverter()>
	//   13   24:ldc2            #440 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//   14   27:invokevirtual   #442 <Method Class _classIfExplicit(Class, Class)>
	//   15   30:areturn         
	}

	public Class findSerializationContentType(Annotated annotated, JavaType javatype)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return _classIfExplicit(((JsonSerialize) (annotated)).contentAs());
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #774 <Method Class JsonSerialize.contentAs()>
	//   13   24:invokevirtual   #117 <Method Class _classIfExplicit(Class)>
	//   14   27:areturn         
	}

	public Object findSerializationConverter(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return ((Object) (null));
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return ((Object) (_classIfExplicit(((JsonSerialize) (annotated)).converter(), com/fasterxml/jackson/databind/util/Converter$None)));
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #776 <Method Class JsonSerialize.converter()>
	//   13   24:ldc2            #440 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//   14   27:invokevirtual   #442 <Method Class _classIfExplicit(Class, Class)>
	//   15   30:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusion(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		Object obj = ((Object) ((JsonInclude)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonInclude)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #697 <Class JsonInclude>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #697 <Class JsonInclude>
	//    5   11:astore_3        
		if(obj != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          32
		{
			obj = ((Object) (((JsonInclude) (obj)).value()));
	//    8   16:aload_3         
	//    9   17:invokeinterface #722 <Method com.fasterxml.jackson.annotation.JsonInclude$Include JsonInclude.value()>
	//   10   22:astore_3        
			if(obj != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*  11   23:aload_3         
	//*  12   24:getstatic       #703 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  13   27:if_acmpeq       32
				return ((com.fasterxml.jackson.annotation.JsonInclude.Include) (obj));
	//   14   30:aload_3         
	//   15   31:areturn         
		}
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:ldc1            #32  <Class JsonSerialize>
	//   19   36:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//   20   39:checkcast       #32  <Class JsonSerialize>
	//   21   42:astore_1        
		if(annotated == null) goto _L2; else goto _L1
	//   22   43:aload_1         
	//   23   44:ifnull          92
_L1:
		annotated = ((Annotated) (((JsonSerialize) (annotated)).include()));
	//   24   47:aload_1         
	//   25   48:invokeinterface #706 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion JsonSerialize.include()>
	//   26   53:astore_1        
		_cls1..SwitchMap.com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion[((com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion) (annotated)).ordinal()];
	//   27   54:getstatic       #710 <Field int[] JacksonAnnotationIntrospector$1.$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion>
	//   28   57:aload_1         
	//   29   58:invokevirtual   #715 <Method int com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.ordinal()>
	//   30   61:iaload          
		JVM INSTR tableswitch 1 4: default 92
	//	               1 94
	//	               2 98
	//	               3 102
	//	               4 106;
	//   31   62:tableswitch     1 4: default 92
	//	               1 94
	//	               2 98
	//	               3 102
	//	               4 106
		   goto _L2 _L3 _L4 _L5 _L6
_L2:
		return include;
	//   32   92:aload_2         
	//   33   93:areturn         
_L3:
		return com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;
	//   34   94:getstatic       #725 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//   35   97:areturn         
_L4:
		return com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
	//   36   98:getstatic       #728 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//   37  101:areturn         
_L5:
		return com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
	//   38  102:getstatic       #731 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
	//   39  105:areturn         
_L6:
		return com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
	//   40  106:getstatic       #734 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//   41  109:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Include findSerializationInclusionForContent(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		annotated = ((Annotated) ((JsonInclude)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonInclude)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #697 <Class JsonInclude>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #697 <Class JsonInclude>
	//    5   11:astore_1        
		if(annotated != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          32
		{
			annotated = ((Annotated) (((JsonInclude) (annotated)).content()));
	//    8   16:aload_1         
	//    9   17:invokeinterface #737 <Method com.fasterxml.jackson.annotation.JsonInclude$Include JsonInclude.content()>
	//   10   22:astore_1        
			if(annotated != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*  11   23:aload_1         
	//*  12   24:getstatic       #703 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  13   27:if_acmpeq       32
				return ((com.fasterxml.jackson.annotation.JsonInclude.Include) (annotated));
	//   14   30:aload_1         
	//   15   31:areturn         
		}
		return include;
	//   16   32:aload_2         
	//   17   33:areturn         
	}

	public Class findSerializationKeyType(Annotated annotated, JavaType javatype)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return _classIfExplicit(((JsonSerialize) (annotated)).keyAs());
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #781 <Method Class JsonSerialize.keyAs()>
	//   13   24:invokevirtual   #117 <Method Class _classIfExplicit(Class)>
	//   14   27:areturn         
	}

	public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonPropertyOrder)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonPropertyOrder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #90  <Class JsonPropertyOrder>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #90  <Class JsonPropertyOrder>
	//    5   10:astore_1        
		if(annotatedclass == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return ((JsonPropertyOrder) (annotatedclass)).value();
	//   10   17:aload_1         
	//   11   18:invokeinterface #784 <Method String[] JsonPropertyOrder.value()>
	//   12   23:areturn         
	}

	public Boolean findSerializationSortAlphabetically(Annotated annotated)
	{
		return _findSortAlpha(annotated);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #787 <Method Boolean _findSortAlpha(Annotated)>
	//    3    5:areturn         
	}

	public Class findSerializationType(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return _classIfExplicit(((JsonSerialize) (annotated)).as());
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokeinterface #790 <Method Class JsonSerialize.as()>
	//   13   24:invokevirtual   #117 <Method Class _classIfExplicit(Class)>
	//   14   27:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return ((JsonSerialize) (annotated)).typing();
	//   10   17:aload_1         
	//   11   18:invokeinterface #797 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing JsonSerialize.typing()>
	//   12   23:areturn         
	}

	public Object findSerializer(Annotated annotated)
	{
		Object obj = ((Object) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #32  <Class JsonSerialize>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #32  <Class JsonSerialize>
	//    5   10:astore_2        
		if(obj != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          31
		{
			obj = ((Object) (((JsonSerialize) (obj)).using()));
	//    8   15:aload_2         
	//    9   16:invokeinterface #799 <Method Class JsonSerialize.using()>
	//   10   21:astore_2        
			if(obj != com/fasterxml/jackson/databind/JsonSerializer$None)
	//*  11   22:aload_2         
	//*  12   23:ldc2            #425 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*  13   26:if_acmpeq       31
				return obj;
	//   14   29:aload_2         
	//   15   30:areturn         
		}
		obj = ((Object) ((JsonRawValue)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonRawValue)));
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:ldc1            #40  <Class JsonRawValue>
	//   19   35:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//   20   38:checkcast       #40  <Class JsonRawValue>
	//   21   41:astore_2        
		if(obj != null && ((JsonRawValue) (obj)).value())
	//*  22   42:aload_2         
	//*  23   43:ifnull          67
	//*  24   46:aload_2         
	//*  25   47:invokeinterface #800 <Method boolean JsonRawValue.value()>
	//*  26   52:ifeq            67
			return ((Object) (new RawSerializer(annotated.getRawType())));
	//   27   55:new             #802 <Class RawSerializer>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:invokevirtual   #805 <Method Class Annotated.getRawType()>
	//   31   63:invokespecial   #808 <Method void RawSerializer(Class)>
	//   32   66:areturn         
		else
			return ((Object) (null));
	//   33   67:aconst_null     
	//   34   68:areturn         
	}

	public List findSubtypes(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSubTypes)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonSubTypes)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #812 <Class JsonSubTypes>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #812 <Class JsonSubTypes>
	//    5   11:astore_1        
		if(annotated != null) goto _L2; else goto _L1
	//    6   12:aload_1         
	//    7   13:ifnonnull       20
_L1:
		annotated = null;
	//    8   16:aconst_null     
	//    9   17:astore_1        
_L4:
		return ((List) (annotated));
	//   10   18:aload_1         
	//   11   19:areturn         
_L2:
		com.fasterxml.jackson.annotation.JsonSubTypes.Type atype[] = ((JsonSubTypes) (annotated)).value();
	//   12   20:aload_1         
	//   13   21:invokeinterface #815 <Method com.fasterxml.jackson.annotation.JsonSubTypes$Type[] JsonSubTypes.value()>
	//   14   26:astore          5
		ArrayList arraylist = new ArrayList(atype.length);
	//   15   28:new             #817 <Class ArrayList>
	//   16   31:dup             
	//   17   32:aload           5
	//   18   34:arraylength     
	//   19   35:invokespecial   #820 <Method void ArrayList(int)>
	//   20   38:astore          4
		int j = atype.length;
	//   21   40:aload           5
	//   22   42:arraylength     
	//   23   43:istore_3        
		int i = 0;
	//   24   44:iconst_0        
	//   25   45:istore_2        
		do
		{
			annotated = ((Annotated) (arraylist));
	//   26   46:aload           4
	//   27   48:astore_1        
			if(i >= j)
				continue;
	//   28   49:iload_2         
	//   29   50:iload_3         
	//   30   51:icmpge          18
			annotated = ((Annotated) (atype[i]));
	//   31   54:aload           5
	//   32   56:iload_2         
	//   33   57:aaload          
	//   34   58:astore_1        
			arraylist.add(((Object) (new NamedType(((com.fasterxml.jackson.annotation.JsonSubTypes.Type) (annotated)).value(), ((com.fasterxml.jackson.annotation.JsonSubTypes.Type) (annotated)).name()))));
	//   35   59:aload           4
	//   36   61:new             #822 <Class NamedType>
	//   37   64:dup             
	//   38   65:aload_1         
	//   39   66:invokeinterface #825 <Method Class com.fasterxml.jackson.annotation.JsonSubTypes$Type.value()>
	//   40   71:aload_1         
	//   41   72:invokeinterface #826 <Method String com.fasterxml.jackson.annotation.JsonSubTypes$Type.name()>
	//   42   77:invokespecial   #829 <Method void NamedType(Class, String)>
	//   43   80:invokevirtual   #830 <Method boolean ArrayList.add(Object)>
	//   44   83:pop             
			i++;
	//   45   84:iload_2         
	//   46   85:iconst_1        
	//   47   86:iadd            
	//   48   87:istore_2        
		} while(true);
	//   49   88:goto            46
		if(true) goto _L4; else goto _L3
_L3:
	}

	public String findTypeName(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonTypeName)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonTypeName)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #834 <Class JsonTypeName>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #834 <Class JsonTypeName>
	//    5   11:astore_1        
		if(annotatedclass == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((JsonTypeName) (annotatedclass)).value();
	//   10   18:aload_1         
	//   11   19:invokeinterface #835 <Method String JsonTypeName.value()>
	//   12   24:areturn         
	}

	public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
	{
		return _findTypeResolver(mapperconfig, ((Annotated) (annotatedclass)), javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #683 <Method TypeResolverBuilder _findTypeResolver(MapperConfig, Annotated, JavaType)>
	//    5    7:areturn         
	}

	public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) ((JsonUnwrapped)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonUnwrapped)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #42  <Class JsonUnwrapped>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #42  <Class JsonUnwrapped>
	//    5   10:astore_1        
		if(annotatedmember == null || !((JsonUnwrapped) (annotatedmember)).enabled())
	//*   6   11:aload_1         
	//*   7   12:ifnull          24
	//*   8   15:aload_1         
	//*   9   16:invokeinterface #843 <Method boolean JsonUnwrapped.enabled()>
	//*  10   21:ifne            26
			return null;
	//   11   24:aconst_null     
	//   12   25:areturn         
		else
			return NameTransformer.simpleTransformer(((JsonUnwrapped) (annotatedmember)).prefix(), ((JsonUnwrapped) (annotatedmember)).suffix());
	//   13   26:aload_1         
	//   14   27:invokeinterface #846 <Method String JsonUnwrapped.prefix()>
	//   15   32:aload_1         
	//   16   33:invokeinterface #849 <Method String JsonUnwrapped.suffix()>
	//   17   38:invokestatic    #855 <Method NameTransformer NameTransformer.simpleTransformer(String, String)>
	//   18   41:areturn         
	}

	public Object findValueInstantiator(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonValueInstantiator)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonValueInstantiator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #858 <Class JsonValueInstantiator>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #858 <Class JsonValueInstantiator>
	//    5   11:astore_1        
		if(annotatedclass == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return ((Object) (null));
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return ((Object) (((JsonValueInstantiator) (annotatedclass)).value()));
	//   10   18:aload_1         
	//   11   19:invokeinterface #859 <Method Class JsonValueInstantiator.value()>
	//   12   24:areturn         
	}

	public Class[] findViews(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonView)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonView)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #34  <Class JsonView>
	//    3    4:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #34  <Class JsonView>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return ((JsonView) (annotated)).value();
	//   10   17:aload_1         
	//   11   18:invokeinterface #864 <Method Class[] JsonView.value()>
	//   12   23:areturn         
	}

	public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
	{
		return _hasAnnotation(((Annotated) (annotatedmethod)), com/fasterxml/jackson/annotation/JsonAnyGetter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #869 <Class JsonAnyGetter>
	//    3    5:invokevirtual   #873 <Method boolean _hasAnnotation(Annotated, Class)>
	//    4    8:ireturn         
	}

	public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedmethod)
	{
		return _hasAnnotation(((Annotated) (annotatedmethod)), com/fasterxml/jackson/annotation/JsonAnySetter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #876 <Class JsonAnySetter>
	//    3    5:invokevirtual   #873 <Method boolean _hasAnnotation(Annotated, Class)>
	//    4    8:ireturn         
	}

	public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
	{
		annotatedmethod = ((AnnotatedMethod) ((JsonValue)_findAnnotation(((Annotated) (annotatedmethod)), com/fasterxml/jackson/annotation/JsonValue)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #879 <Class JsonValue>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #879 <Class JsonValue>
	//    5   11:astore_1        
		return annotatedmethod != null && ((JsonValue) (annotatedmethod)).value();
	//    6   12:aload_1         
	//    7   13:ifnull          27
	//    8   16:aload_1         
	//    9   17:invokeinterface #880 <Method boolean JsonValue.value()>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public boolean hasCreatorAnnotation(Annotated annotated)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		JsonCreator jsoncreator = (JsonCreator)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonCreator);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:ldc2            #429 <Class JsonCreator>
	//    5    7:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    6   10:checkcast       #429 <Class JsonCreator>
	//    7   13:astore          4
		boolean flag;
		if(jsoncreator != null)
	//*   8   15:aload           4
	//*   9   17:ifnull          39
		{
			flag = flag1;
	//   10   20:iload_3         
	//   11   21:istore_2        
			if(jsoncreator.mode() != com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED)
	//*  12   22:aload           4
	//*  13   24:invokeinterface #433 <Method com.fasterxml.jackson.annotation.JsonCreator$Mode JsonCreator.mode()>
	//*  14   29:getstatic       #887 <Field com.fasterxml.jackson.annotation.JsonCreator$Mode com.fasterxml.jackson.annotation.JsonCreator$Mode.DISABLED>
	//*  15   32:if_acmpeq       37
				flag = true;
	//   16   35:iconst_1        
	//   17   36:istore_2        
		} else
	//*  18   37:iload_2         
	//*  19   38:ireturn         
		{
			flag = flag1;
	//   20   39:iload_3         
	//   21   40:istore_2        
			if(annotated instanceof AnnotatedConstructor)
	//*  22   41:aload_1         
	//*  23   42:instanceof      #889 <Class AnnotatedConstructor>
	//*  24   45:ifeq            37
			{
				flag = flag1;
	//   25   48:iload_3         
	//   26   49:istore_2        
				if(_jdk7Helper != null)
	//*  27   50:getstatic       #59  <Field JacksonAnnotationIntrospector$Java7Support _jdk7Helper>
	//*  28   53:ifnull          37
				{
					annotated = ((Annotated) (_jdk7Helper.hasCreatorAnnotation(annotated)));
	//   29   56:getstatic       #59  <Field JacksonAnnotationIntrospector$Java7Support _jdk7Helper>
	//   30   59:aload_1         
	//   31   60:invokevirtual   #891 <Method Boolean JacksonAnnotationIntrospector$Java7Support.hasCreatorAnnotation(Annotated)>
	//   32   63:astore_1        
					flag = flag1;
	//   33   64:iload_3         
	//   34   65:istore_2        
					if(annotated != null)
	//*  35   66:aload_1         
	//*  36   67:ifnull          37
						return ((Boolean) (annotated)).booleanValue();
	//   37   70:aload_1         
	//   38   71:invokevirtual   #356 <Method boolean Boolean.booleanValue()>
	//   39   74:ireturn         
				}
			}
		}
		return flag;
	}

	public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
	{
		return _isIgnorable(((Annotated) (annotatedmember)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #895 <Method boolean _isIgnorable(Annotated)>
	//    3    5:ireturn         
	}

	public Boolean hasRequiredMarker(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) ((JsonProperty)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonProperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #484 <Class JsonProperty>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #484 <Class JsonProperty>
	//    5   11:astore_1        
		if(annotatedmember != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          26
			return Boolean.valueOf(((JsonProperty) (annotatedmember)).required());
	//    8   16:aload_1         
	//    9   17:invokeinterface #898 <Method boolean JsonProperty.required()>
	//   10   22:invokestatic    #540 <Method Boolean Boolean.valueOf(boolean)>
	//   11   25:areturn         
		else
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
	}

	public boolean isAnnotationBundle(Annotation annotation)
	{
		Class class1 = annotation.annotationType();
	//    0    0:aload_1         
	//    1    1:invokeinterface #905 <Method Class Annotation.annotationType()>
	//    2    6:astore          4
		Boolean boolean1 = (Boolean)_annotationsInside.get(((Object) (class1)));
	//    3    8:aload_0         
	//    4    9:getfield        #86  <Field LRUMap _annotationsInside>
	//    5   12:aload           4
	//    6   14:invokevirtual   #906 <Method Object LRUMap.get(Object)>
	//    7   17:checkcast       #100 <Class Boolean>
	//    8   20:astore_3        
		annotation = ((Annotation) (boolean1));
	//    9   21:aload_3         
	//   10   22:astore_1        
		if(boolean1 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       56
		{
			boolean flag;
			if(class1.getAnnotation(com/fasterxml/jackson/annotation/JacksonAnnotationsInside) != null)
	//*  13   27:aload           4
	//*  14   29:ldc2            #908 <Class JacksonAnnotationsInside>
	//*  15   32:invokevirtual   #909 <Method Annotation Class.getAnnotation(Class)>
	//*  16   35:ifnull          61
				flag = true;
	//   17   38:iconst_1        
	//   18   39:istore_2        
			else
	//*  19   40:iload_2         
	//*  20   41:invokestatic    #540 <Method Boolean Boolean.valueOf(boolean)>
	//*  21   44:astore_1        
	//*  22   45:aload_0         
	//*  23   46:getfield        #86  <Field LRUMap _annotationsInside>
	//*  24   49:aload           4
	//*  25   51:aload_1         
	//*  26   52:invokevirtual   #912 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//*  27   55:pop             
	//*  28   56:aload_1         
	//*  29   57:invokevirtual   #356 <Method boolean Boolean.booleanValue()>
	//*  30   60:ireturn         
				flag = false;
	//   31   61:iconst_0        
	//   32   62:istore_2        
			annotation = ((Annotation) (Boolean.valueOf(flag)));
			_annotationsInside.putIfAbsent(((Object) (class1)), ((Object) (annotation)));
		}
		return ((Boolean) (annotation)).booleanValue();
	//*  33   63:goto            40
	}

	public Boolean isIgnorableType(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonIgnoreType)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonIgnoreType)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #915 <Class JsonIgnoreType>
	//    3    5:invokevirtual   #94  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #915 <Class JsonIgnoreType>
	//    5   11:astore_1        
		if(annotatedclass == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return Boolean.valueOf(((JsonIgnoreType) (annotatedclass)).value());
	//   10   18:aload_1         
	//   11   19:invokeinterface #916 <Method boolean JsonIgnoreType.value()>
	//   12   24:invokestatic    #540 <Method Boolean Boolean.valueOf(boolean)>
	//   13   27:areturn         
	}

	public Boolean isTypeId(AnnotatedMember annotatedmember)
	{
		return Boolean.valueOf(_hasAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonTypeId));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #919 <Class JsonTypeId>
	//    3    5:invokevirtual   #873 <Method boolean _hasAnnotation(Annotated, Class)>
	//    4    8:invokestatic    #540 <Method Boolean Boolean.valueOf(boolean)>
	//    5   11:areturn         
	}

	protected Object readResolve()
	{
		if(_annotationsInside == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field LRUMap _annotationsInside>
	//*   2    4:ifnonnull       22
			_annotationsInside = new LRUMap(48, 48);
	//    3    7:aload_0         
	//    4    8:new             #81  <Class LRUMap>
	//    5   11:dup             
	//    6   12:bipush          48
	//    7   14:bipush          48
	//    8   16:invokespecial   #84  <Method void LRUMap(int, int)>
	//    9   19:putfield        #86  <Field LRUMap _annotationsInside>
		return ((Object) (this));
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	public AnnotatedMethod resolveSetterConflict(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, AnnotatedMethod annotatedmethod1)
	{
		Class class1;
		mapperconfig = ((MapperConfig) (annotatedmethod.getRawParameterType(0)));
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #558 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//    3    5:astore_1        
		class1 = annotatedmethod1.getRawParameterType(0);
	//    4    6:aload_3         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #558 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//    7   11:astore          4
		if(!((Class) (mapperconfig)).isPrimitive()) goto _L2; else goto _L1
	//    8   13:aload_1         
	//    9   14:invokevirtual   #925 <Method boolean Class.isPrimitive()>
	//   10   17:ifeq            30
_L1:
		if(class1.isPrimitive()) goto _L4; else goto _L3
	//   11   20:aload           4
	//   12   22:invokevirtual   #925 <Method boolean Class.isPrimitive()>
	//   13   25:ifne            40
_L3:
		return annotatedmethod;
	//   14   28:aload_2         
	//   15   29:areturn         
_L2:
		if(class1.isPrimitive())
	//*  16   30:aload           4
	//*  17   32:invokevirtual   #925 <Method boolean Class.isPrimitive()>
	//*  18   35:ifeq            40
			return annotatedmethod1;
	//   19   38:aload_3         
	//   20   39:areturn         
_L4:
		if(mapperconfig != java/lang/String) goto _L6; else goto _L5
	//   21   40:aload_1         
	//   22   41:ldc2            #358 <Class String>
	//   23   44:if_acmpne       57
_L5:
		if(class1 != java/lang/String) goto _L3; else goto _L7
	//   24   47:aload           4
	//   25   49:ldc2            #358 <Class String>
	//   26   52:if_acmpne       28
_L7:
		return null;
	//   27   55:aconst_null     
	//   28   56:areturn         
_L6:
		if(class1 == java/lang/String)
	//*  29   57:aload           4
	//*  30   59:ldc2            #358 <Class String>
	//*  31   62:if_acmpne       55
			return annotatedmethod1;
	//   32   65:aload_3         
	//   33   66:areturn         
		if(true) goto _L7; else goto _L8
_L8:
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #934 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	private static final Class ANNOTATIONS_TO_INFER_DESER[];
	private static final Class ANNOTATIONS_TO_INFER_SER[];
	private static final Java7Support _jdk7Helper;
	private static final long serialVersionUID = 1L;
	protected transient LRUMap _annotationsInside;

	static 
	{
		Java7Support java7support;
		ANNOTATIONS_TO_INFER_SER = (Class[])(new Class[] {
			com/fasterxml/jackson/databind/annotation/JsonSerialize, com/fasterxml/jackson/annotation/JsonView, com/fasterxml/jackson/annotation/JsonFormat, com/fasterxml/jackson/annotation/JsonTypeInfo, com/fasterxml/jackson/annotation/JsonRawValue, com/fasterxml/jackson/annotation/JsonUnwrapped, com/fasterxml/jackson/annotation/JsonBackReference, com/fasterxml/jackson/annotation/JsonManagedReference
		});
	//    0    0:bipush          8
	//    1    2:anewarray       Class[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #32  <Class JsonSerialize>
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #34  <Class JsonView>
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #36  <Class JsonFormat>
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #38  <Class JsonTypeInfo>
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #40  <Class JsonRawValue>
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #42  <Class JsonUnwrapped>
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #44  <Class JsonBackReference>
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #46  <Class JsonManagedReference>
	//   33   46:aastore         
	//   34   47:checkcast       #47  <Class Class[]>
	//   35   50:putstatic       #49  <Field Class[] ANNOTATIONS_TO_INFER_SER>
		ANNOTATIONS_TO_INFER_DESER = (Class[])(new Class[] {
			com/fasterxml/jackson/databind/annotation/JsonDeserialize, com/fasterxml/jackson/annotation/JsonView, com/fasterxml/jackson/annotation/JsonFormat, com/fasterxml/jackson/annotation/JsonTypeInfo, com/fasterxml/jackson/annotation/JsonUnwrapped, com/fasterxml/jackson/annotation/JsonBackReference, com/fasterxml/jackson/annotation/JsonManagedReference
		});
	//   36   53:bipush          7
	//   37   55:anewarray       Class[]
	//   38   58:dup             
	//   39   59:iconst_0        
	//   40   60:ldc1            #51  <Class JsonDeserialize>
	//   41   62:aastore         
	//   42   63:dup             
	//   43   64:iconst_1        
	//   44   65:ldc1            #34  <Class JsonView>
	//   45   67:aastore         
	//   46   68:dup             
	//   47   69:iconst_2        
	//   48   70:ldc1            #36  <Class JsonFormat>
	//   49   72:aastore         
	//   50   73:dup             
	//   51   74:iconst_3        
	//   52   75:ldc1            #38  <Class JsonTypeInfo>
	//   53   77:aastore         
	//   54   78:dup             
	//   55   79:iconst_4        
	//   56   80:ldc1            #42  <Class JsonUnwrapped>
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:iconst_5        
	//   60   85:ldc1            #44  <Class JsonBackReference>
	//   61   87:aastore         
	//   62   88:dup             
	//   63   89:bipush          6
	//   64   91:ldc1            #46  <Class JsonManagedReference>
	//   65   93:aastore         
	//   66   94:checkcast       #47  <Class Class[]>
	//   67   97:putstatic       #53  <Field Class[] ANNOTATIONS_TO_INFER_DESER>
		java7support = null;
	//   68  100:aconst_null     
	//   69  101:astore_0        
		Java7Support java7support1 = (Java7Support)((Class) (com/fasterxml/jackson/databind/introspect/JacksonAnnotationIntrospector$Java7Support)).newInstance();
	//   70  102:ldc1            #10  <Class JacksonAnnotationIntrospector$Java7Support>
	//   71  104:invokevirtual   #57  <Method Object Class.newInstance()>
	//   72  107:checkcast       #10  <Class JacksonAnnotationIntrospector$Java7Support>
	//   73  110:astore_1        
		java7support = java7support1;
	//   74  111:aload_1         
	//   75  112:astore_0        
_L2:
		_jdk7Helper = java7support;
	//   76  113:aload_0         
	//   77  114:putstatic       #59  <Field JacksonAnnotationIntrospector$Java7Support _jdk7Helper>
		return;
	//   78  117:return          
		Throwable throwable;
		throwable;
	//   79  118:astore_1        
		Logger.getLogger(((Class) (com/fasterxml/jackson/databind/introspect/JacksonAnnotationIntrospector)).getName()).warning("Unable to load JDK7 annotation types; will have to skip");
	//   80  119:ldc1            #2   <Class JacksonAnnotationIntrospector>
	//   81  121:invokevirtual   #63  <Method String Class.getName()>
	//   82  124:invokestatic    #69  <Method Logger Logger.getLogger(String)>
	//   83  127:ldc1            #71  <String "Unable to load JDK7 annotation types; will have to skip">
	//   84  129:invokevirtual   #75  <Method void Logger.warning(String)>
		if(true) goto _L2; else goto _L1
	//   85  132:goto            113
_L1:
	}
}
