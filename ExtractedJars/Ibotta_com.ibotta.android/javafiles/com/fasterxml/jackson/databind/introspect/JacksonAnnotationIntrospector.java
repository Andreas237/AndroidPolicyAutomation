// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.cfg.*;
import com.fasterxml.jackson.databind.ext.Java7Support;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.*;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			VirtualAnnotatedMember, AnnotatedClass, AnnotatedParameter, VisibilityChecker, 
//			AnnotatedConstructor, AnnotatedMethod, AnnotatedMember, ObjectIdInfo, 
//			Annotated

public class JacksonAnnotationIntrospector extends AnnotationIntrospector
	implements Serializable
{

	public JacksonAnnotationIntrospector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void AnnotationIntrospector()>
		_annotationsInside = new LRUMap(48, 48);
	//    2    4:aload_0         
	//    3    5:new             #68  <Class LRUMap>
	//    4    8:dup             
	//    5    9:bipush          48
	//    6   11:bipush          48
	//    7   13:invokespecial   #71  <Method void LRUMap(int, int)>
	//    8   16:putfield        #73  <Field LRUMap _annotationsInside>
		_cfgConstructorPropertiesImpliesCreator = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #75  <Field boolean _cfgConstructorPropertiesImpliesCreator>
	//   12   24:return          
	}

	private final Boolean _findSortAlpha(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonPropertyOrder)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonPropertyOrder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #79  <Class JsonPropertyOrder>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #79  <Class JsonPropertyOrder>
	//    5   10:astore_1        
		if(annotated != null && ((JsonPropertyOrder) (annotated)).alphabetic())
	//*   6   11:aload_1         
	//*   7   12:ifnull          28
	//*   8   15:aload_1         
	//*   9   16:invokeinterface #87  <Method boolean JsonPropertyOrder.alphabetic()>
	//*  10   21:ifeq            28
			return Boolean.TRUE;
	//   11   24:getstatic       #93  <Field Boolean Boolean.TRUE>
	//   12   27:areturn         
		else
			return null;
	//   13   28:aconst_null     
	//   14   29:areturn         
	}

	private boolean _primitiveAndWrapper(JavaType javatype, Class class1)
	{
		if(javatype.isPrimitive())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #100 <Method boolean JavaType.isPrimitive()>
	//*   2    4:ifeq            16
			return javatype.hasRawClass(ClassUtil.primitiveType(class1));
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokestatic    #106 <Method Class ClassUtil.primitiveType(Class)>
	//    6   12:invokevirtual   #110 <Method boolean JavaType.hasRawClass(Class)>
	//    7   15:ireturn         
		boolean flag1 = class1.isPrimitive();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #111 <Method boolean Class.isPrimitive()>
	//   10   20:istore          4
		boolean flag = false;
	//   11   22:iconst_0        
	//   12   23:istore_3        
		if(flag1)
	//*  13   24:iload           4
	//*  14   26:ifeq            44
		{
			if(class1 == ClassUtil.primitiveType(javatype.getRawClass()))
	//*  15   29:aload_2         
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #115 <Method Class JavaType.getRawClass()>
	//*  18   34:invokestatic    #106 <Method Class ClassUtil.primitiveType(Class)>
	//*  19   37:if_acmpne       42
				flag = true;
	//   20   40:iconst_1        
	//   21   41:istore_3        
			return flag;
	//   22   42:iload_3         
	//   23   43:ireturn         
		} else
		{
			return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
		}
	}

	private boolean _primitiveAndWrapper(Class class1, Class class2)
	{
		if(class1.isPrimitive())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #111 <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            19
			return class1 == ClassUtil.primitiveType(class2);
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokestatic    #106 <Method Class ClassUtil.primitiveType(Class)>
	//    6   12:if_acmpne       17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
		if(class2.isPrimitive())
	//*  11   19:aload_2         
	//*  12   20:invokevirtual   #111 <Method boolean Class.isPrimitive()>
	//*  13   23:ifeq            38
			return class2 == ClassUtil.primitiveType(class1);
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:invokestatic    #106 <Method Class ClassUtil.primitiveType(Class)>
	//   17   31:if_acmpne       36
	//   18   34:iconst_1        
	//   19   35:ireturn         
	//   20   36:iconst_0        
	//   21   37:ireturn         
		else
			return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
	}

	private com.fasterxml.jackson.annotation.JsonInclude.Value _refinePropertyInclusion(Annotated annotated, com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #31  <Class JsonSerialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #31  <Class JsonSerialize>
	//    5   10:astore_1        
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
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          94
			switch(_cls1..SwitchMap.com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion[((JsonSerialize) (annotated)).include().ordinal()])
	//*   8   15:getstatic       #125 <Field int[] JacksonAnnotationIntrospector$1.$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion>
	//*   9   18:aload_1         
	//*  10   19:invokeinterface #129 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion JsonSerialize.include()>
	//*  11   24:invokevirtual   #135 <Method int com.fasterxml.jackson.databind.annotation.JsonSerialize$Inclusion.ordinal()>
	//*  12   27:iaload          
			{
	//*  13   28:tableswitch     1 4: default 60
	//	               1 86
	//	               2 78
	//	               3 70
	//	               4 62
			default:
				return value;
	//   14   60:aload_2         
	//   15   61:areturn         

			case 4: // '\004'
				return value.withValueInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY);
	//   16   62:aload_2         
	//   17   63:getstatic       #141 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//   18   66:invokevirtual   #147 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withValueInclusion(com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   19   69:areturn         

			case 3: // '\003'
				return value.withValueInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT);
	//   20   70:aload_2         
	//   21   71:getstatic       #150 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
	//   22   74:invokevirtual   #147 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withValueInclusion(com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   23   77:areturn         

			case 2: // '\002'
				return value.withValueInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL);
	//   24   78:aload_2         
	//   25   79:getstatic       #153 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//   26   82:invokevirtual   #147 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withValueInclusion(com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   27   85:areturn         

			case 1: // '\001'
				return value.withValueInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS);
	//   28   86:aload_2         
	//   29   87:getstatic       #156 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//   30   90:invokevirtual   #147 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withValueInclusion(com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   31   93:areturn         
			}
		else
			return value;
	//   32   94:aload_2         
	//   33   95:areturn         
	}

	protected Class _classIfExplicit(Class class1)
	{
		if(class1 != null && !ClassUtil.isBogusClass(class1))
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #160 <Method boolean ClassUtil.isBogusClass(Class)>
	//*   4    8:ifeq            14
	//*   5   11:goto            16
			return class1;
	//    6   14:aload_1         
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	protected Class _classIfExplicit(Class class1, Class class2)
	{
label0:
		{
			Class class3 = _classIfExplicit(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #164 <Method Class _classIfExplicit(Class)>
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
	//    0    0:invokestatic    #172 <Method StdTypeResolverBuilder StdTypeResolverBuilder.noTypeInfoBuilder()>
	//    1    3:areturn         
	}

	protected StdTypeResolverBuilder _constructStdTypeResolverBuilder()
	{
		return new StdTypeResolverBuilder();
	//    0    0:new             #169 <Class StdTypeResolverBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #174 <Method void StdTypeResolverBuilder()>
	//    3    7:areturn         
	}

	protected BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend.Attr attr, MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
	{
		PropertyMetadata propertymetadata;
		if(attr.required())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #181 <Method boolean com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.required()>
	//*   2    6:ifeq            17
			propertymetadata = PropertyMetadata.STD_REQUIRED;
	//    3    9:getstatic       #187 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//    4   12:astore          5
		else
	//*   5   14:goto            22
			propertymetadata = PropertyMetadata.STD_OPTIONAL;
	//    6   17:getstatic       #190 <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//    7   20:astore          5
		String s = attr.value();
	//    8   22:aload_1         
	//    9   23:invokeinterface #194 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.value()>
	//   10   28:astore          8
		PropertyName propertyname1 = _propertyName(attr.propName(), attr.propNamespace());
	//   11   30:aload_0         
	//   12   31:aload_1         
	//   13   32:invokeinterface #197 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.propName()>
	//   14   37:aload_1         
	//   15   38:invokeinterface #200 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.propNamespace()>
	//   16   43:invokevirtual   #204 <Method PropertyName _propertyName(String, String)>
	//   17   46:astore          7
		PropertyName propertyname = propertyname1;
	//   18   48:aload           7
	//   19   50:astore          6
		if(!propertyname1.hasSimpleName())
	//*  20   52:aload           7
	//*  21   54:invokevirtual   #209 <Method boolean PropertyName.hasSimpleName()>
	//*  22   57:ifne            67
			propertyname = PropertyName.construct(s);
	//   23   60:aload           8
	//   24   62:invokestatic    #213 <Method PropertyName PropertyName.construct(String)>
	//   25   65:astore          6
		return ((BeanPropertyWriter) (AttributePropertyWriter.construct(s, ((BeanPropertyDefinition) (SimpleBeanPropertyDefinition.construct(mapperconfig, ((AnnotatedMember) (new VirtualAnnotatedMember(((TypeResolutionContext) (annotatedclass)), annotatedclass.getRawType(), s, javatype))), propertyname, propertymetadata, attr.include()))), annotatedclass.getAnnotations(), javatype)));
	//   26   67:aload           8
	//   27   69:aload_2         
	//   28   70:new             #215 <Class VirtualAnnotatedMember>
	//   29   73:dup             
	//   30   74:aload_3         
	//   31   75:aload_3         
	//   32   76:invokevirtual   #220 <Method Class AnnotatedClass.getRawType()>
	//   33   79:aload           8
	//   34   81:aload           4
	//   35   83:invokespecial   #223 <Method void VirtualAnnotatedMember(TypeResolutionContext, Class, String, JavaType)>
	//   36   86:aload           6
	//   37   88:aload           5
	//   38   90:aload_1         
	//   39   91:invokeinterface #226 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.databind.annotation.JsonAppend$Attr.include()>
	//   40   96:invokestatic    #231 <Method SimpleBeanPropertyDefinition SimpleBeanPropertyDefinition.construct(MapperConfig, AnnotatedMember, PropertyName, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   41   99:aload_3         
	//   42  100:invokevirtual   #235 <Method com.fasterxml.jackson.databind.util.Annotations AnnotatedClass.getAnnotations()>
	//   43  103:aload           4
	//   44  105:invokestatic    #240 <Method AttributePropertyWriter AttributePropertyWriter.construct(String, BeanPropertyDefinition, com.fasterxml.jackson.databind.util.Annotations, JavaType)>
	//   45  108:areturn         
	}

	protected BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend.Prop prop, MapperConfig mapperconfig, AnnotatedClass annotatedclass)
	{
		Object obj;
		if(prop.required())
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #245 <Method boolean com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.required()>
	//*   2    6:ifeq            17
			obj = ((Object) (PropertyMetadata.STD_REQUIRED));
	//    3    9:getstatic       #187 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//    4   12:astore          4
		else
	//*   5   14:goto            22
			obj = ((Object) (PropertyMetadata.STD_OPTIONAL));
	//    6   17:getstatic       #190 <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//    7   20:astore          4
		Object obj1 = ((Object) (_propertyName(prop.name(), prop.namespace())));
	//    8   22:aload_0         
	//    9   23:aload_1         
	//   10   24:invokeinterface #248 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.name()>
	//   11   29:aload_1         
	//   12   30:invokeinterface #251 <Method String com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.namespace()>
	//   13   35:invokevirtual   #204 <Method PropertyName _propertyName(String, String)>
	//   14   38:astore          6
		JavaType javatype = mapperconfig.constructType(prop.type());
	//   15   40:aload_2         
	//   16   41:aload_1         
	//   17   42:invokeinterface #254 <Method Class com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.type()>
	//   18   47:invokevirtual   #260 <Method JavaType MapperConfig.constructType(Class)>
	//   19   50:astore          5
		obj1 = ((Object) (SimpleBeanPropertyDefinition.construct(mapperconfig, ((AnnotatedMember) (new VirtualAnnotatedMember(((TypeResolutionContext) (annotatedclass)), annotatedclass.getRawType(), ((PropertyName) (obj1)).getSimpleName(), javatype))), ((PropertyName) (obj1)), ((PropertyMetadata) (obj)), prop.include())));
	//   20   52:aload_2         
	//   21   53:new             #215 <Class VirtualAnnotatedMember>
	//   22   56:dup             
	//   23   57:aload_3         
	//   24   58:aload_3         
	//   25   59:invokevirtual   #220 <Method Class AnnotatedClass.getRawType()>
	//   26   62:aload           6
	//   27   64:invokevirtual   #263 <Method String PropertyName.getSimpleName()>
	//   28   67:aload           5
	//   29   69:invokespecial   #223 <Method void VirtualAnnotatedMember(TypeResolutionContext, Class, String, JavaType)>
	//   30   72:aload           6
	//   31   74:aload           4
	//   32   76:aload_1         
	//   33   77:invokeinterface #264 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.include()>
	//   34   82:invokestatic    #231 <Method SimpleBeanPropertyDefinition SimpleBeanPropertyDefinition.construct(MapperConfig, AnnotatedMember, PropertyName, PropertyMetadata, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   35   85:astore          6
		Class class1 = prop.value();
	//   36   87:aload_1         
	//   37   88:invokeinterface #266 <Method Class com.fasterxml.jackson.databind.annotation.JsonAppend$Prop.value()>
	//   38   93:astore          7
		prop = ((com.fasterxml.jackson.databind.annotation.JsonAppend.Prop) (mapperconfig.getHandlerInstantiator()));
	//   39   95:aload_2         
	//   40   96:invokevirtual   #270 <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//   41   99:astore_1        
		if(prop == null)
	//*  42  100:aload_1         
	//*  43  101:ifnonnull       109
			prop = null;
	//   44  104:aconst_null     
	//   45  105:astore_1        
		else
	//*  46  106:goto            117
			prop = ((com.fasterxml.jackson.databind.annotation.JsonAppend.Prop) (((HandlerInstantiator) (prop)).virtualPropertyWriterInstance(mapperconfig, class1)));
	//   47  109:aload_1         
	//   48  110:aload_2         
	//   49  111:aload           7
	//   50  113:invokevirtual   #276 <Method VirtualBeanPropertyWriter HandlerInstantiator.virtualPropertyWriterInstance(MapperConfig, Class)>
	//   51  116:astore_1        
		obj = ((Object) (prop));
	//   52  117:aload_1         
	//   53  118:astore          4
		if(prop == null)
	//*  54  120:aload_1         
	//*  55  121:ifnonnull       138
			obj = ((Object) ((VirtualBeanPropertyWriter)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers())));
	//   56  124:aload           7
	//   57  126:aload_2         
	//   58  127:invokevirtual   #279 <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//   59  130:invokestatic    #283 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   60  133:checkcast       #285 <Class VirtualBeanPropertyWriter>
	//   61  136:astore          4
		return ((BeanPropertyWriter) (((VirtualBeanPropertyWriter) (obj)).withConfig(mapperconfig, annotatedclass, ((BeanPropertyDefinition) (obj1)), javatype)));
	//   62  138:aload           4
	//   63  140:aload_2         
	//   64  141:aload_3         
	//   65  142:aload           6
	//   66  144:aload           5
	//   67  146:invokevirtual   #289 <Method VirtualBeanPropertyWriter VirtualBeanPropertyWriter.withConfig(MapperConfig, AnnotatedClass, BeanPropertyDefinition, JavaType)>
	//   68  149:areturn         
	}

	protected PropertyName _findConstructorName(Annotated annotated)
	{
		if(annotated instanceof AnnotatedParameter)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #294 <Class AnnotatedParameter>
	//*   2    4:ifeq            39
		{
			annotated = ((Annotated) ((AnnotatedParameter)annotated));
	//    3    7:aload_1         
	//    4    8:checkcast       #294 <Class AnnotatedParameter>
	//    5   11:astore_1        
			if(((AnnotatedParameter) (annotated)).getOwner() != null)
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #298 <Method AnnotatedWithParams AnnotatedParameter.getOwner()>
	//*   8   16:ifnull          39
			{
				Java7Support java7support = _java7Helper;
	//    9   19:getstatic       #62  <Field Java7Support _java7Helper>
	//   10   22:astore_2        
				if(java7support != null)
	//*  11   23:aload_2         
	//*  12   24:ifnull          39
				{
					annotated = ((Annotated) (java7support.findConstructorName(((AnnotatedParameter) (annotated)))));
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #302 <Method PropertyName Java7Support.findConstructorName(AnnotatedParameter)>
	//   16   32:astore_1        
					if(annotated != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          39
						return ((PropertyName) (annotated));
	//   19   37:aload_1         
	//   20   38:areturn         
				}
			}
		}
		return null;
	//   21   39:aconst_null     
	//   22   40:areturn         
	}

	protected TypeResolverBuilder _findTypeResolver(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
	{
		JsonTypeInfo jsontypeinfo = (JsonTypeInfo)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonTypeInfo);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc1            #37  <Class JsonTypeInfo>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #37  <Class JsonTypeInfo>
	//    5   10:astore          6
		Object obj = ((Object) ((JsonTypeResolver)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonTypeResolver)));
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:ldc2            #306 <Class JsonTypeResolver>
	//    9   17:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//   10   20:checkcast       #306 <Class JsonTypeResolver>
	//   11   23:astore          4
		Object obj1 = null;
	//   12   25:aconst_null     
	//   13   26:astore          5
		if(obj != null)
	//*  14   28:aload           4
	//*  15   30:ifnull          57
		{
			if(jsontypeinfo == null)
	//*  16   33:aload           6
	//*  17   35:ifnonnull       40
				return null;
	//   18   38:aconst_null     
	//   19   39:areturn         
			obj = ((Object) (mapperconfig.typeResolverBuilderInstance(annotated, ((JsonTypeResolver) (obj)).value())));
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:aload           4
	//   23   44:invokeinterface #307 <Method Class JsonTypeResolver.value()>
	//   24   49:invokevirtual   #311 <Method TypeResolverBuilder MapperConfig.typeResolverBuilderInstance(Annotated, Class)>
	//   25   52:astore          4
		} else
	//*  26   54:goto            88
		{
			if(jsontypeinfo == null)
	//*  27   57:aload           6
	//*  28   59:ifnonnull       64
				return null;
	//   29   62:aconst_null     
	//   30   63:areturn         
			if(jsontypeinfo.use() == com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NONE)
	//*  31   64:aload           6
	//*  32   66:invokeinterface #315 <Method com.fasterxml.jackson.annotation.JsonTypeInfo$Id JsonTypeInfo.use()>
	//*  33   71:getstatic       #321 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NONE>
	//*  34   74:if_acmpne       82
				return ((TypeResolverBuilder) (_constructNoTypeResolverBuilder()));
	//   35   77:aload_0         
	//   36   78:invokevirtual   #323 <Method StdTypeResolverBuilder _constructNoTypeResolverBuilder()>
	//   37   81:areturn         
			obj = ((Object) (_constructStdTypeResolverBuilder()));
	//   38   82:aload_0         
	//   39   83:invokevirtual   #325 <Method StdTypeResolverBuilder _constructStdTypeResolverBuilder()>
	//   40   86:astore          4
		}
		JsonTypeIdResolver jsontypeidresolver = (JsonTypeIdResolver)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonTypeIdResolver);
	//   41   88:aload_0         
	//   42   89:aload_2         
	//   43   90:ldc2            #327 <Class JsonTypeIdResolver>
	//   44   93:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//   45   96:checkcast       #327 <Class JsonTypeIdResolver>
	//   46   99:astore          7
		if(jsontypeidresolver == null)
	//*  47  101:aload           7
	//*  48  103:ifnonnull       112
			mapperconfig = ((MapperConfig) (obj1));
	//   49  106:aload           5
	//   50  108:astore_1        
		else
	//*  51  109:goto            125
			mapperconfig = ((MapperConfig) (mapperconfig.typeIdResolverInstance(annotated, jsontypeidresolver.value())));
	//   52  112:aload_1         
	//   53  113:aload_2         
	//   54  114:aload           7
	//   55  116:invokeinterface #328 <Method Class JsonTypeIdResolver.value()>
	//   56  121:invokevirtual   #332 <Method TypeIdResolver MapperConfig.typeIdResolverInstance(Annotated, Class)>
	//   57  124:astore_1        
		if(mapperconfig != null)
	//*  58  125:aload_1         
	//*  59  126:ifnull          136
			((TypeIdResolver) (mapperconfig)).init(javatype);
	//   60  129:aload_1         
	//   61  130:aload_3         
	//   62  131:invokeinterface #338 <Method void TypeIdResolver.init(JavaType)>
		obj = ((Object) (((TypeResolverBuilder) (obj)).init(jsontypeinfo.use(), ((TypeIdResolver) (mapperconfig)))));
	//   63  136:aload           4
	//   64  138:aload           6
	//   65  140:invokeinterface #315 <Method com.fasterxml.jackson.annotation.JsonTypeInfo$Id JsonTypeInfo.use()>
	//   66  145:aload_1         
	//   67  146:invokeinterface #343 <Method TypeResolverBuilder TypeResolverBuilder.init(com.fasterxml.jackson.annotation.JsonTypeInfo$Id, TypeIdResolver)>
	//   68  151:astore          4
		javatype = ((JavaType) (jsontypeinfo.include()));
	//   69  153:aload           6
	//   70  155:invokeinterface #346 <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As JsonTypeInfo.include()>
	//   71  160:astore_3        
		mapperconfig = ((MapperConfig) (javatype));
	//   72  161:aload_3         
	//   73  162:astore_1        
		if(javatype == com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY)
	//*  74  163:aload_3         
	//*  75  164:getstatic       #352 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
	//*  76  167:if_acmpne       183
		{
			mapperconfig = ((MapperConfig) (javatype));
	//   77  170:aload_3         
	//   78  171:astore_1        
			if(annotated instanceof AnnotatedClass)
	//*  79  172:aload_2         
	//*  80  173:instanceof      #217 <Class AnnotatedClass>
	//*  81  176:ifeq            183
				mapperconfig = ((MapperConfig) (com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY));
	//   82  179:getstatic       #355 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
	//   83  182:astore_1        
		}
		annotated = ((Annotated) (((TypeResolverBuilder) (obj)).inclusion(((com.fasterxml.jackson.annotation.JsonTypeInfo.As) (mapperconfig))).typeProperty(jsontypeinfo.property())));
	//   84  183:aload           4
	//   85  185:aload_1         
	//   86  186:invokeinterface #359 <Method TypeResolverBuilder TypeResolverBuilder.inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//   87  191:aload           6
	//   88  193:invokeinterface #362 <Method String JsonTypeInfo.property()>
	//   89  198:invokeinterface #366 <Method TypeResolverBuilder TypeResolverBuilder.typeProperty(String)>
	//   90  203:astore_2        
		javatype = ((JavaType) (jsontypeinfo.defaultImpl()));
	//   91  204:aload           6
	//   92  206:invokeinterface #369 <Method Class JsonTypeInfo.defaultImpl()>
	//   93  211:astore_3        
		mapperconfig = ((MapperConfig) (annotated));
	//   94  212:aload_2         
	//   95  213:astore_1        
		if(javatype != com/fasterxml/jackson/annotation/JsonTypeInfo$None)
	//*  96  214:aload_3         
	//*  97  215:ldc2            #371 <Class com.fasterxml.jackson.annotation.JsonTypeInfo$None>
	//*  98  218:if_acmpeq       238
		{
			mapperconfig = ((MapperConfig) (annotated));
	//   99  221:aload_2         
	//  100  222:astore_1        
			if(!((Class) (javatype)).isAnnotation())
	//* 101  223:aload_3         
	//* 102  224:invokevirtual   #374 <Method boolean Class.isAnnotation()>
	//* 103  227:ifne            238
				mapperconfig = ((MapperConfig) (((TypeResolverBuilder) (annotated)).defaultImpl(((Class) (javatype)))));
	//  104  230:aload_2         
	//  105  231:aload_3         
	//  106  232:invokeinterface #377 <Method TypeResolverBuilder TypeResolverBuilder.defaultImpl(Class)>
	//  107  237:astore_1        
		}
		return ((TypeResolverBuilder) (mapperconfig)).typeIdVisibility(jsontypeinfo.visible());
	//  108  238:aload_1         
	//  109  239:aload           6
	//  110  241:invokeinterface #380 <Method boolean JsonTypeInfo.visible()>
	//  111  246:invokeinterface #384 <Method TypeResolverBuilder TypeResolverBuilder.typeIdVisibility(boolean)>
	//  112  251:areturn         
	}

	protected boolean _isIgnorable(Annotated annotated)
	{
		Object obj = ((Object) ((JsonIgnore)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIgnore)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #389 <Class JsonIgnore>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #389 <Class JsonIgnore>
	//    5   11:astore_2        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          23
			return ((JsonIgnore) (obj)).value();
	//    8   16:aload_2         
	//    9   17:invokeinterface #391 <Method boolean JsonIgnore.value()>
	//   10   22:ireturn         
		obj = ((Object) (_java7Helper));
	//   11   23:getstatic       #62  <Field Java7Support _java7Helper>
	//   12   26:astore_2        
		if(obj != null)
	//*  13   27:aload_2         
	//*  14   28:ifnull          46
		{
			annotated = ((Annotated) (((Java7Support) (obj)).findTransient(annotated)));
	//   15   31:aload_2         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #394 <Method Boolean Java7Support.findTransient(Annotated)>
	//   18   36:astore_1        
			if(annotated != null)
	//*  19   37:aload_1         
	//*  20   38:ifnull          46
				return ((Boolean) (annotated)).booleanValue();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #397 <Method boolean Boolean.booleanValue()>
	//   23   45:ireturn         
		}
		return false;
	//   24   46:iconst_0        
	//   25   47:ireturn         
	}

	protected PropertyName _propertyName(String s, String s1)
	{
		if(s.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #402 <Method boolean String.isEmpty()>
	//*   2    4:ifeq            11
			return PropertyName.USE_DEFAULT;
	//    3    7:getstatic       #406 <Field PropertyName PropertyName.USE_DEFAULT>
	//    4   10:areturn         
		if(s1 != null && !s1.isEmpty())
	//*   5   11:aload_2         
	//*   6   12:ifnull          31
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #402 <Method boolean String.isEmpty()>
	//*   9   19:ifeq            25
	//*  10   22:goto            31
			return PropertyName.construct(s, s1);
	//   11   25:aload_1         
	//   12   26:aload_2         
	//   13   27:invokestatic    #408 <Method PropertyName PropertyName.construct(String, String)>
	//   14   30:areturn         
		else
			return PropertyName.construct(s);
	//   15   31:aload_1         
	//   16   32:invokestatic    #213 <Method PropertyName PropertyName.construct(String)>
	//   17   35:areturn         
	}

	public void findAndAddVirtualProperties(MapperConfig mapperconfig, AnnotatedClass annotatedclass, List list)
	{
		JsonAppend jsonappend = (JsonAppend)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonAppend);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc2            #412 <Class JsonAppend>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #412 <Class JsonAppend>
	//    5   11:astore          10
		if(jsonappend == null)
	//*   6   13:aload           10
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		boolean flag1 = jsonappend.prepend();
	//    9   19:aload           10
	//   10   21:invokeinterface #415 <Method boolean JsonAppend.prepend()>
	//   11   26:istore          7
		com.fasterxml.jackson.databind.annotation.JsonAppend.Attr aattr[] = jsonappend.attrs();
	//   12   28:aload           10
	//   13   30:invokeinterface #419 <Method com.fasterxml.jackson.databind.annotation.JsonAppend$Attr[] JsonAppend.attrs()>
	//   14   35:astore          11
		int k = aattr.length;
	//   15   37:aload           11
	//   16   39:arraylength     
	//   17   40:istore          6
		boolean flag = false;
	//   18   42:iconst_0        
	//   19   43:istore          5
		Object obj = null;
	//   20   45:aconst_null     
	//   21   46:astore          9
		for(int i = 0; i < k;)
	//*  22   48:iconst_0        
	//*  23   49:istore          4
	//*  24   51:iload           4
	//*  25   53:iload           6
	//*  26   55:icmpge          131
		{
			JavaType javatype = ((JavaType) (obj));
	//   27   58:aload           9
	//   28   60:astore          8
			if(obj == null)
	//*  29   62:aload           9
	//*  30   64:ifnonnull       76
				javatype = mapperconfig.constructType(java/lang/Object);
	//   31   67:aload_1         
	//   32   68:ldc2            #421 <Class Object>
	//   33   71:invokevirtual   #260 <Method JavaType MapperConfig.constructType(Class)>
	//   34   74:astore          8
			obj = ((Object) (_constructVirtualProperty(aattr[i], mapperconfig, annotatedclass, javatype)));
	//   35   76:aload_0         
	//   36   77:aload           11
	//   37   79:iload           4
	//   38   81:aaload          
	//   39   82:aload_1         
	//   40   83:aload_2         
	//   41   84:aload           8
	//   42   86:invokevirtual   #423 <Method BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend$Attr, MapperConfig, AnnotatedClass, JavaType)>
	//   43   89:astore          9
			if(flag1)
	//*  44   91:iload           7
	//*  45   93:ifeq            109
				list.add(i, obj);
	//   46   96:aload_3         
	//   47   97:iload           4
	//   48   99:aload           9
	//   49  101:invokeinterface #429 <Method void List.add(int, Object)>
			else
	//*  50  106:goto            118
				list.add(obj);
	//   51  109:aload_3         
	//   52  110:aload           9
	//   53  112:invokeinterface #432 <Method boolean List.add(Object)>
	//   54  117:pop             
			i++;
	//   55  118:iload           4
	//   56  120:iconst_1        
	//   57  121:iadd            
	//   58  122:istore          4
			obj = ((Object) (javatype));
	//   59  124:aload           8
	//   60  126:astore          9
		}

	//*  61  128:goto            51
		com.fasterxml.jackson.databind.annotation.JsonAppend.Prop aprop[] = jsonappend.props();
	//   62  131:aload           10
	//   63  133:invokeinterface #436 <Method com.fasterxml.jackson.databind.annotation.JsonAppend$Prop[] JsonAppend.props()>
	//   64  138:astore          8
		k = aprop.length;
	//   65  140:aload           8
	//   66  142:arraylength     
	//   67  143:istore          6
		for(int j = ((int) (flag)); j < k; j++)
	//*  68  145:iload           5
	//*  69  147:istore          4
	//*  70  149:iload           4
	//*  71  151:iload           6
	//*  72  153:icmpge          205
		{
			BeanPropertyWriter beanpropertywriter = _constructVirtualProperty(aprop[j], mapperconfig, annotatedclass);
	//   73  156:aload_0         
	//   74  157:aload           8
	//   75  159:iload           4
	//   76  161:aaload          
	//   77  162:aload_1         
	//   78  163:aload_2         
	//   79  164:invokevirtual   #438 <Method BeanPropertyWriter _constructVirtualProperty(com.fasterxml.jackson.databind.annotation.JsonAppend$Prop, MapperConfig, AnnotatedClass)>
	//   80  167:astore          9
			if(flag1)
	//*  81  169:iload           7
	//*  82  171:ifeq            187
				list.add(j, ((Object) (beanpropertywriter)));
	//   83  174:aload_3         
	//   84  175:iload           4
	//   85  177:aload           9
	//   86  179:invokeinterface #429 <Method void List.add(int, Object)>
			else
	//*  87  184:goto            196
				list.add(((Object) (beanpropertywriter)));
	//   88  187:aload_3         
	//   89  188:aload           9
	//   90  190:invokeinterface #432 <Method boolean List.add(Object)>
	//   91  195:pop             
		}

	//   92  196:iload           4
	//   93  198:iconst_1        
	//   94  199:iadd            
	//   95  200:istore          4
	//*  96  202:goto            149
	//   97  205:return          
	}

	public VisibilityChecker findAutoDetectVisibility(AnnotatedClass annotatedclass, VisibilityChecker visibilitychecker)
	{
		annotatedclass = ((AnnotatedClass) ((JsonAutoDetect)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonAutoDetect)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #443 <Class JsonAutoDetect>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #443 <Class JsonAutoDetect>
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
	//   12   20:invokeinterface #449 <Method VisibilityChecker VisibilityChecker.with(JsonAutoDetect)>
	//   13   25:areturn         
	}

	public Object findContentDeserializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #50  <Class JsonDeserialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #50  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonDeserialize) (annotated)).contentUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #455 <Method Class JsonDeserialize.contentUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonDeserializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #457 <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
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
	//    2    2:ldc1            #31  <Class JsonSerialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #31  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonSerialize) (annotated)).contentUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #459 <Method Class JsonSerialize.contentUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonSerializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #461 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*  13   26:if_acmpeq       31
				return ((Object) (annotated));
	//   14   29:aload_1         
	//   15   30:areturn         
		}
		return ((Object) (null));
	//   16   31:aconst_null     
	//   17   32:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorAnnotation(MapperConfig mapperconfig, Annotated annotated)
	{
		JsonCreator jsoncreator = (JsonCreator)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonCreator);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:ldc2            #465 <Class JsonCreator>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #465 <Class JsonCreator>
	//    5   11:astore_3        
		if(jsoncreator != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          23
			return jsoncreator.mode();
	//    8   16:aload_3         
	//    9   17:invokeinterface #469 <Method com.fasterxml.jackson.annotation.JsonCreator$Mode JsonCreator.mode()>
	//   10   22:areturn         
		if(_cfgConstructorPropertiesImpliesCreator && mapperconfig.isEnabled(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES) && (annotated instanceof AnnotatedConstructor))
	//*  11   23:aload_0         
	//*  12   24:getfield        #75  <Field boolean _cfgConstructorPropertiesImpliesCreator>
	//*  13   27:ifeq            76
	//*  14   30:aload_1         
	//*  15   31:getstatic       #475 <Field MapperFeature MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES>
	//*  16   34:invokevirtual   #479 <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//*  17   37:ifeq            76
	//*  18   40:aload_2         
	//*  19   41:instanceof      #481 <Class AnnotatedConstructor>
	//*  20   44:ifeq            76
		{
			mapperconfig = ((MapperConfig) (_java7Helper));
	//   21   47:getstatic       #62  <Field Java7Support _java7Helper>
	//   22   50:astore_1        
			if(mapperconfig != null)
	//*  23   51:aload_1         
	//*  24   52:ifnull          76
			{
				mapperconfig = ((MapperConfig) (((Java7Support) (mapperconfig)).hasCreatorAnnotation(annotated)));
	//   25   55:aload_1         
	//   26   56:aload_2         
	//   27   57:invokevirtual   #484 <Method Boolean Java7Support.hasCreatorAnnotation(Annotated)>
	//   28   60:astore_1        
				if(mapperconfig != null && ((Boolean) (mapperconfig)).booleanValue())
	//*  29   61:aload_1         
	//*  30   62:ifnull          76
	//*  31   65:aload_1         
	//*  32   66:invokevirtual   #397 <Method boolean Boolean.booleanValue()>
	//*  33   69:ifeq            76
					return com.fasterxml.jackson.annotation.JsonCreator.Mode.PROPERTIES;
	//   34   72:getstatic       #490 <Field com.fasterxml.jackson.annotation.JsonCreator$Mode com.fasterxml.jackson.annotation.JsonCreator$Mode.PROPERTIES>
	//   35   75:areturn         
			}
		}
		return null;
	//   36   76:aconst_null     
	//   37   77:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonCreator.Mode findCreatorBinding(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonCreator)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonCreator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #465 <Class JsonCreator>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #465 <Class JsonCreator>
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
	//   11   19:invokeinterface #469 <Method com.fasterxml.jackson.annotation.JsonCreator$Mode JsonCreator.mode()>
	//   12   24:areturn         
	}

	public Enum findDefaultEnumValue(Class class1)
	{
		return ClassUtil.findFirstAnnotatedEnumValue(class1, com/fasterxml/jackson/annotation/JsonEnumDefaultValue);
	//    0    0:aload_1         
	//    1    1:ldc2            #499 <Class JsonEnumDefaultValue>
	//    2    4:invokestatic    #503 <Method Enum ClassUtil.findFirstAnnotatedEnumValue(Class, Class)>
	//    3    7:areturn         
	}

	public Object findDeserializationContentConverter(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) ((JsonDeserialize)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #50  <Class JsonDeserialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #50  <Class JsonDeserialize>
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
	//   12   19:invokeinterface #509 <Method Class JsonDeserialize.contentConverter()>
	//   13   24:ldc2            #511 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//   14   27:invokevirtual   #513 <Method Class _classIfExplicit(Class, Class)>
	//   15   30:areturn         
	}

	public Object findDeserializationConverter(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #50  <Class JsonDeserialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #50  <Class JsonDeserialize>
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
	//   12   19:invokeinterface #517 <Method Class JsonDeserialize.converter()>
	//   13   24:ldc2            #511 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//   14   27:invokevirtual   #513 <Method Class _classIfExplicit(Class, Class)>
	//   15   30:areturn         
	}

	public Object findDeserializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #50  <Class JsonDeserialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #50  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonDeserialize) (annotated)).using()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #521 <Method Class JsonDeserialize.using()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonDeserializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #457 <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//*  13   26:if_acmpeq       31
				return ((Object) (annotated));
	//   14   29:aload_1         
	//   15   30:areturn         
		}
		return ((Object) (null));
	//   16   31:aconst_null     
	//   17   32:areturn         
	}

	public String[] findEnumValues(Class class1, Enum aenum[], String as[])
	{
		Field afield[] = ClassUtil.getDeclaredFields(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #527 <Method Field[] ClassUtil.getDeclaredFields(Class)>
	//    2    4:astore          8
		int k = afield.length;
	//    3    6:aload           8
	//    4    8:arraylength     
	//    5    9:istore          6
		boolean flag = false;
	//    6   11:iconst_0        
	//    7   12:istore          5
		class1 = null;
	//    8   14:aconst_null     
	//    9   15:astore_1        
		for(int i = 0; i < k; i++)
	//*  10   16:iconst_0        
	//*  11   17:istore          4
	//*  12   19:iload           4
	//*  13   21:iload           6
	//*  14   23:icmpge          126
		{
			Field field = afield[i];
	//   15   26:aload           8
	//   16   28:iload           4
	//   17   30:aaload          
	//   18   31:astore          9
			if(!field.isEnumConstant())
	//*  19   33:aload           9
	//*  20   35:invokevirtual   #532 <Method boolean Field.isEnumConstant()>
	//*  21   38:ifne            44
				continue;
	//   22   41:goto            117
			Object obj = ((Object) ((JsonProperty)field.getAnnotation(com/fasterxml/jackson/annotation/JsonProperty)));
	//   23   44:aload           9
	//   24   46:ldc2            #534 <Class JsonProperty>
	//   25   49:invokevirtual   #538 <Method Annotation Field.getAnnotation(Class)>
	//   26   52:checkcast       #534 <Class JsonProperty>
	//   27   55:astore          7
			if(obj == null)
	//*  28   57:aload           7
	//*  29   59:ifnonnull       65
				continue;
	//   30   62:goto            117
			String s1 = ((JsonProperty) (obj)).value();
	//   31   65:aload           7
	//   32   67:invokeinterface #539 <Method String JsonProperty.value()>
	//   33   72:astore          10
			if(s1.isEmpty())
	//*  34   74:aload           10
	//*  35   76:invokevirtual   #402 <Method boolean String.isEmpty()>
	//*  36   79:ifeq            85
				continue;
	//   37   82:goto            117
			obj = ((Object) (class1));
	//   38   85:aload_1         
	//   39   86:astore          7
			if(class1 == null)
	//*  40   88:aload_1         
	//*  41   89:ifnonnull       101
				obj = ((Object) (new HashMap()));
	//   42   92:new             #541 <Class HashMap>
	//   43   95:dup             
	//   44   96:invokespecial   #542 <Method void HashMap()>
	//   45   99:astore          7
			((HashMap) (obj)).put(((Object) (field.getName())), ((Object) (s1)));
	//   46  101:aload           7
	//   47  103:aload           9
	//   48  105:invokevirtual   #545 <Method String Field.getName()>
	//   49  108:aload           10
	//   50  110:invokevirtual   #549 <Method Object HashMap.put(Object, Object)>
	//   51  113:pop             
			class1 = ((Class) (obj));
	//   52  114:aload           7
	//   53  116:astore_1        
		}

	//   54  117:iload           4
	//   55  119:iconst_1        
	//   56  120:iadd            
	//   57  121:istore          4
	//*  58  123:goto            19
		if(class1 != null)
	//*  59  126:aload_1         
	//*  60  127:ifnull          181
		{
			int l = aenum.length;
	//   61  130:aload_2         
	//   62  131:arraylength     
	//   63  132:istore          6
			for(int j = ((int) (flag)); j < l; j++)
	//*  64  134:iload           5
	//*  65  136:istore          4
	//*  66  138:iload           4
	//*  67  140:iload           6
	//*  68  142:icmpge          181
			{
				String s = (String)((HashMap) (class1)).get(((Object) (aenum[j].name())));
	//   69  145:aload_1         
	//   70  146:aload_2         
	//   71  147:iload           4
	//   72  149:aaload          
	//   73  150:invokevirtual   #552 <Method String Enum.name()>
	//   74  153:invokevirtual   #556 <Method Object HashMap.get(Object)>
	//   75  156:checkcast       #399 <Class String>
	//   76  159:astore          7
				if(s != null)
	//*  77  161:aload           7
	//*  78  163:ifnull          172
					as[j] = s;
	//   79  166:aload_3         
	//   80  167:iload           4
	//   81  169:aload           7
	//   82  171:aastore         
			}

	//   83  172:iload           4
	//   84  174:iconst_1        
	//   85  175:iadd            
	//   86  176:istore          4
		}
	//*  87  178:goto            138
		return as;
	//   88  181:aload_3         
	//   89  182:areturn         
	}

	public Object findFilterId(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonFilter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonFilter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #560 <Class JsonFilter>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #560 <Class JsonFilter>
	//    5   11:astore_1        
		if(annotated != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          32
		{
			annotated = ((Annotated) (((JsonFilter) (annotated)).value()));
	//    8   16:aload_1         
	//    9   17:invokeinterface #561 <Method String JsonFilter.value()>
	//   10   22:astore_1        
			if(((String) (annotated)).length() > 0)
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #564 <Method int String.length()>
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
	//    2    2:ldc1            #35  <Class JsonFormat>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #35  <Class JsonFormat>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return new com.fasterxml.jackson.annotation.JsonFormat.Value(((JsonFormat) (annotated)));
	//   10   17:new             #568 <Class com.fasterxml.jackson.annotation.JsonFormat$Value>
	//   11   20:dup             
	//   12   21:aload_1         
	//   13   22:invokespecial   #571 <Method void com.fasterxml.jackson.annotation.JsonFormat$Value(JsonFormat)>
	//   14   25:areturn         
	}

	public String findImplicitPropertyName(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) (_findConstructorName(((Annotated) (annotatedmember)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #575 <Method PropertyName _findConstructorName(Annotated)>
	//    3    5:astore_1        
		if(annotatedmember == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return ((PropertyName) (annotatedmember)).getSimpleName();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #263 <Method String PropertyName.getSimpleName()>
	//   10   16:areturn         
	}

	public com.fasterxml.jackson.annotation.JacksonInject.Value findInjectableValue(AnnotatedMember annotatedmember)
	{
		Object obj = ((Object) ((JacksonInject)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JacksonInject)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #579 <Class JacksonInject>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #579 <Class JacksonInject>
	//    5   11:astore_2        
		if(obj == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		com.fasterxml.jackson.annotation.JacksonInject.Value value = com.fasterxml.jackson.annotation.JacksonInject.Value.from(((JacksonInject) (obj)));
	//   10   18:aload_2         
	//   11   19:invokestatic    #585 <Method com.fasterxml.jackson.annotation.JacksonInject$Value com.fasterxml.jackson.annotation.JacksonInject$Value.from(JacksonInject)>
	//   12   22:astore_3        
		obj = ((Object) (value));
	//   13   23:aload_3         
	//   14   24:astore_2        
		if(!value.hasId())
	//*  15   25:aload_3         
	//*  16   26:invokevirtual   #588 <Method boolean com.fasterxml.jackson.annotation.JacksonInject$Value.hasId()>
	//*  17   29:ifne            88
		{
			if(!(annotatedmember instanceof AnnotatedMethod))
	//*  18   32:aload_1         
	//*  19   33:instanceof      #590 <Class AnnotatedMethod>
	//*  20   36:ifne            50
			{
				annotatedmember = ((AnnotatedMember) (annotatedmember.getRawType().getName()));
	//   21   39:aload_1         
	//   22   40:invokevirtual   #593 <Method Class AnnotatedMember.getRawType()>
	//   23   43:invokevirtual   #594 <Method String Class.getName()>
	//   24   46:astore_1        
			} else
	//*  25   47:goto            82
			{
				obj = ((Object) ((AnnotatedMethod)annotatedmember));
	//   26   50:aload_1         
	//   27   51:checkcast       #590 <Class AnnotatedMethod>
	//   28   54:astore_2        
				if(((AnnotatedMethod) (obj)).getParameterCount() == 0)
	//*  29   55:aload_2         
	//*  30   56:invokevirtual   #597 <Method int AnnotatedMethod.getParameterCount()>
	//*  31   59:ifne            73
					annotatedmember = ((AnnotatedMember) (annotatedmember.getRawType().getName()));
	//   32   62:aload_1         
	//   33   63:invokevirtual   #593 <Method Class AnnotatedMember.getRawType()>
	//   34   66:invokevirtual   #594 <Method String Class.getName()>
	//   35   69:astore_1        
				else
	//*  36   70:goto            82
					annotatedmember = ((AnnotatedMember) (((AnnotatedMethod) (obj)).getRawParameterType(0).getName()));
	//   37   73:aload_2         
	//   38   74:iconst_0        
	//   39   75:invokevirtual   #601 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//   40   78:invokevirtual   #594 <Method String Class.getName()>
	//   41   81:astore_1        
			}
			obj = ((Object) (value.withId(((Object) (annotatedmember)))));
	//   42   82:aload_3         
	//   43   83:aload_1         
	//   44   84:invokevirtual   #605 <Method com.fasterxml.jackson.annotation.JacksonInject$Value com.fasterxml.jackson.annotation.JacksonInject$Value.withId(Object)>
	//   45   87:astore_2        
		}
		return ((com.fasterxml.jackson.annotation.JacksonInject.Value) (obj));
	//   46   88:aload_2         
	//   47   89:areturn         
	}

	public Object findInjectableValueId(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) (findInjectableValue(annotatedmember)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #608 <Method com.fasterxml.jackson.annotation.JacksonInject$Value findInjectableValue(AnnotatedMember)>
	//    3    5:astore_1        
		if(annotatedmember == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return ((Object) (null));
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return ((com.fasterxml.jackson.annotation.JacksonInject.Value) (annotatedmember)).getId();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #612 <Method Object com.fasterxml.jackson.annotation.JacksonInject$Value.getId()>
	//   10   16:areturn         
	}

	public Object findKeyDeserializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #50  <Class JsonDeserialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #50  <Class JsonDeserialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonDeserialize) (annotated)).keyUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #616 <Method Class JsonDeserialize.keyUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/KeyDeserializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #618 <Class com.fasterxml.jackson.databind.KeyDeserializer$None>
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
	//    2    2:ldc1            #31  <Class JsonSerialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #31  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonSerialize) (annotated)).keyUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #620 <Method Class JsonSerialize.keyUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonSerializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #461 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*  13   26:if_acmpeq       31
				return ((Object) (annotated));
	//   14   29:aload_1         
	//   15   30:areturn         
		}
		return ((Object) (null));
	//   16   31:aconst_null     
	//   17   32:areturn         
	}

	public Boolean findMergeInfo(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonMerge)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonMerge)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #52  <Class JsonMerge>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #52  <Class JsonMerge>
	//    5   10:astore_1        
		if(annotated == null)
	//*   6   11:aload_1         
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return ((JsonMerge) (annotated)).value().asBoolean();
	//   10   17:aload_1         
	//   11   18:invokeinterface #624 <Method OptBoolean JsonMerge.value()>
	//   12   23:invokevirtual   #630 <Method Boolean OptBoolean.asBoolean()>
	//   13   26:areturn         
	}

	public PropertyName findNameForDeserialization(Annotated annotated)
	{
		Object obj = ((Object) ((JsonSetter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonSetter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #633 <Class JsonSetter>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #633 <Class JsonSetter>
	//    5   11:astore_2        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          26
			return PropertyName.construct(((JsonSetter) (obj)).value());
	//    8   16:aload_2         
	//    9   17:invokeinterface #634 <Method String JsonSetter.value()>
	//   10   22:invokestatic    #213 <Method PropertyName PropertyName.construct(String)>
	//   11   25:areturn         
		obj = ((Object) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:ldc2            #534 <Class JsonProperty>
	//   15   31:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//   16   34:checkcast       #534 <Class JsonProperty>
	//   17   37:astore_2        
		if(obj != null)
	//*  18   38:aload_2         
	//*  19   39:ifnull          52
			return PropertyName.construct(((JsonProperty) (obj)).value());
	//   20   42:aload_2         
	//   21   43:invokeinterface #539 <Method String JsonProperty.value()>
	//   22   48:invokestatic    #213 <Method PropertyName PropertyName.construct(String)>
	//   23   51:areturn         
		if(_hasOneOf(annotated, ANNOTATIONS_TO_INFER_DESER))
	//*  24   52:aload_0         
	//*  25   53:aload_1         
	//*  26   54:getstatic       #54  <Field Class[] ANNOTATIONS_TO_INFER_DESER>
	//*  27   57:invokevirtual   #638 <Method boolean _hasOneOf(Annotated, Class[])>
	//*  28   60:ifeq            67
			return PropertyName.USE_DEFAULT;
	//   29   63:getstatic       #406 <Field PropertyName PropertyName.USE_DEFAULT>
	//   30   66:areturn         
		else
			return null;
	//   31   67:aconst_null     
	//   32   68:areturn         
	}

	public PropertyName findNameForSerialization(Annotated annotated)
	{
		Object obj = ((Object) ((JsonGetter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonGetter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #641 <Class JsonGetter>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #641 <Class JsonGetter>
	//    5   11:astore_2        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          26
			return PropertyName.construct(((JsonGetter) (obj)).value());
	//    8   16:aload_2         
	//    9   17:invokeinterface #642 <Method String JsonGetter.value()>
	//   10   22:invokestatic    #213 <Method PropertyName PropertyName.construct(String)>
	//   11   25:areturn         
		obj = ((Object) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:ldc2            #534 <Class JsonProperty>
	//   15   31:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//   16   34:checkcast       #534 <Class JsonProperty>
	//   17   37:astore_2        
		if(obj != null)
	//*  18   38:aload_2         
	//*  19   39:ifnull          52
			return PropertyName.construct(((JsonProperty) (obj)).value());
	//   20   42:aload_2         
	//   21   43:invokeinterface #539 <Method String JsonProperty.value()>
	//   22   48:invokestatic    #213 <Method PropertyName PropertyName.construct(String)>
	//   23   51:areturn         
		if(_hasOneOf(annotated, ANNOTATIONS_TO_INFER_SER))
	//*  24   52:aload_0         
	//*  25   53:aload_1         
	//*  26   54:getstatic       #48  <Field Class[] ANNOTATIONS_TO_INFER_SER>
	//*  27   57:invokevirtual   #638 <Method boolean _hasOneOf(Annotated, Class[])>
	//*  28   60:ifeq            67
			return PropertyName.USE_DEFAULT;
	//   29   63:getstatic       #406 <Field PropertyName PropertyName.USE_DEFAULT>
	//   30   66:areturn         
		else
			return null;
	//   31   67:aconst_null     
	//   32   68:areturn         
	}

	public Object findNamingStrategy(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonNaming)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonNaming)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #646 <Class JsonNaming>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #646 <Class JsonNaming>
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
	//   11   19:invokeinterface #647 <Method Class JsonNaming.value()>
	//   12   24:areturn         
	}

	public Object findNullSerializer(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #31  <Class JsonSerialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #31  <Class JsonSerialize>
	//    5   10:astore_1        
		if(annotated != null)
	//*   6   11:aload_1         
	//*   7   12:ifnull          31
		{
			annotated = ((Annotated) (((JsonSerialize) (annotated)).nullsUsing()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #651 <Method Class JsonSerialize.nullsUsing()>
	//   10   21:astore_1        
			if(annotated != com/fasterxml/jackson/databind/JsonSerializer$None)
	//*  11   22:aload_1         
	//*  12   23:ldc2            #461 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
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
	//    2    2:ldc2            #655 <Class JsonIdentityInfo>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #655 <Class JsonIdentityInfo>
	//    5   11:astore_1        
		if(annotated != null && ((JsonIdentityInfo) (annotated)).generator() != com/fasterxml/jackson/annotation/ObjectIdGenerators$None)
	//*   6   12:aload_1         
	//*   7   13:ifnull          66
	//*   8   16:aload_1         
	//*   9   17:invokeinterface #658 <Method Class JsonIdentityInfo.generator()>
	//*  10   22:ldc2            #660 <Class com.fasterxml.jackson.annotation.ObjectIdGenerators$None>
	//*  11   25:if_acmpne       31
	//*  12   28:goto            66
			return new ObjectIdInfo(PropertyName.construct(((JsonIdentityInfo) (annotated)).property()), ((JsonIdentityInfo) (annotated)).scope(), ((JsonIdentityInfo) (annotated)).generator(), ((JsonIdentityInfo) (annotated)).resolver());
	//   13   31:new             #662 <Class ObjectIdInfo>
	//   14   34:dup             
	//   15   35:aload_1         
	//   16   36:invokeinterface #663 <Method String JsonIdentityInfo.property()>
	//   17   41:invokestatic    #213 <Method PropertyName PropertyName.construct(String)>
	//   18   44:aload_1         
	//   19   45:invokeinterface #666 <Method Class JsonIdentityInfo.scope()>
	//   20   50:aload_1         
	//   21   51:invokeinterface #658 <Method Class JsonIdentityInfo.generator()>
	//   22   56:aload_1         
	//   23   57:invokeinterface #669 <Method Class JsonIdentityInfo.resolver()>
	//   24   62:invokespecial   #672 <Method void ObjectIdInfo(PropertyName, Class, Class, Class)>
	//   25   65:areturn         
		else
			return null;
	//   26   66:aconst_null     
	//   27   67:areturn         
	}

	public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectidinfo)
	{
		JsonIdentityReference jsonidentityreference = (JsonIdentityReference)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIdentityReference);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #676 <Class JsonIdentityReference>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #676 <Class JsonIdentityReference>
	//    5   11:astore_3        
		if(jsonidentityreference == null)
	//*   6   12:aload_3         
	//*   7   13:ifnonnull       18
			return objectidinfo;
	//    8   16:aload_2         
	//    9   17:areturn         
		annotated = ((Annotated) (objectidinfo));
	//   10   18:aload_2         
	//   11   19:astore_1        
		if(objectidinfo == null)
	//*  12   20:aload_2         
	//*  13   21:ifnonnull       28
			annotated = ((Annotated) (ObjectIdInfo.empty()));
	//   14   24:invokestatic    #680 <Method ObjectIdInfo ObjectIdInfo.empty()>
	//   15   27:astore_1        
		return ((ObjectIdInfo) (annotated)).withAlwaysAsId(jsonidentityreference.alwaysAsId());
	//   16   28:aload_1         
	//   17   29:aload_3         
	//   18   30:invokeinterface #683 <Method boolean JsonIdentityReference.alwaysAsId()>
	//   19   35:invokevirtual   #687 <Method ObjectIdInfo ObjectIdInfo.withAlwaysAsId(boolean)>
	//   20   38:areturn         
	}

	public Class findPOJOBuilder(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonDeserialize)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonDeserialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #50  <Class JsonDeserialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #50  <Class JsonDeserialize>
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
	//   12   19:invokeinterface #692 <Method Class JsonDeserialize.builder()>
	//   13   24:invokevirtual   #164 <Method Class _classIfExplicit(Class)>
	//   14   27:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonPOJOBuilder)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonPOJOBuilder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #697 <Class JsonPOJOBuilder>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #697 <Class JsonPOJOBuilder>
	//    5   11:astore_1        
		if(annotatedclass == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return new com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value(((JsonPOJOBuilder) (annotatedclass)));
	//   10   18:new             #699 <Class com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:invokespecial   #702 <Method void com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value(JsonPOJOBuilder)>
	//   14   26:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonProperty.Access findPropertyAccess(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #534 <Class JsonProperty>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #534 <Class JsonProperty>
	//    5   11:astore_1        
		if(annotated != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
			return ((JsonProperty) (annotated)).access();
	//    8   16:aload_1         
	//    9   17:invokeinterface #708 <Method com.fasterxml.jackson.annotation.JsonProperty$Access JsonProperty.access()>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public List findPropertyAliases(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonAlias)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonAlias)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #712 <Class JsonAlias>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #712 <Class JsonAlias>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		annotated = ((Annotated) (((JsonAlias) (annotated)).value()));
	//   10   18:aload_1         
	//   11   19:invokeinterface #715 <Method String[] JsonAlias.value()>
	//   12   24:astore_1        
		int j = annotated.length;
	//   13   25:aload_1         
	//   14   26:arraylength     
	//   15   27:istore_3        
		if(j == 0)
	//*  16   28:iload_3         
	//*  17   29:ifne            36
			return Collections.emptyList();
	//   18   32:invokestatic    #721 <Method List Collections.emptyList()>
	//   19   35:areturn         
		ArrayList arraylist = new ArrayList(j);
	//   20   36:new             #723 <Class ArrayList>
	//   21   39:dup             
	//   22   40:iload_3         
	//   23   41:invokespecial   #726 <Method void ArrayList(int)>
	//   24   44:astore          4
		for(int i = 0; i < j; i++)
	//*  25   46:iconst_0        
	//*  26   47:istore_2        
	//*  27   48:iload_2         
	//*  28   49:iload_3         
	//*  29   50:icmpge          74
			((List) (arraylist)).add(((Object) (PropertyName.construct(((String) (annotated[i]))))));
	//   30   53:aload           4
	//   31   55:aload_1         
	//   32   56:iload_2         
	//   33   57:aaload          
	//   34   58:invokestatic    #213 <Method PropertyName PropertyName.construct(String)>
	//   35   61:invokeinterface #432 <Method boolean List.add(Object)>
	//   36   66:pop             

	//   37   67:iload_2         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_2        
	//*  41   71:goto            48
		return ((List) (arraylist));
	//   42   74:aload           4
	//   43   76:areturn         
	}

	public TypeResolverBuilder findPropertyContentTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		if(javatype.getContentType() != null)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #733 <Method JavaType JavaType.getContentType()>
	//*   2    4:ifnull          15
		{
			return _findTypeResolver(mapperconfig, ((Annotated) (annotatedmember)), javatype);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #735 <Method TypeResolverBuilder _findTypeResolver(MapperConfig, Annotated, JavaType)>
	//    8   14:areturn         
		} else
		{
			mapperconfig = ((MapperConfig) (new StringBuilder()));
	//    9   15:new             #737 <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #738 <Method void StringBuilder()>
	//   12   22:astore_1        
			((StringBuilder) (mapperconfig)).append("Must call method with a container or reference type (got ");
	//   13   23:aload_1         
	//   14   24:ldc2            #740 <String "Must call method with a container or reference type (got ">
	//   15   27:invokevirtual   #744 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
			((StringBuilder) (mapperconfig)).append(((Object) (javatype)));
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:invokevirtual   #747 <Method StringBuilder StringBuilder.append(Object)>
	//   20   36:pop             
			((StringBuilder) (mapperconfig)).append(")");
	//   21   37:aload_1         
	//   22   38:ldc2            #749 <String ")">
	//   23   41:invokevirtual   #744 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
			throw new IllegalArgumentException(((StringBuilder) (mapperconfig)).toString());
	//   25   45:new             #751 <Class IllegalArgumentException>
	//   26   48:dup             
	//   27   49:aload_1         
	//   28   50:invokevirtual   #754 <Method String StringBuilder.toString()>
	//   29   53:invokespecial   #757 <Method void IllegalArgumentException(String)>
	//   30   56:athrow          
		}
	}

	public String findPropertyDefaultValue(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #534 <Class JsonProperty>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #534 <Class JsonProperty>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		String s = ((JsonProperty) (annotated)).defaultValue();
	//   10   18:aload_1         
	//   11   19:invokeinterface #763 <Method String JsonProperty.defaultValue()>
	//   12   24:astore_2        
		annotated = ((Annotated) (s));
	//   13   25:aload_2         
	//   14   26:astore_1        
		if(s.isEmpty())
	//*  15   27:aload_2         
	//*  16   28:invokevirtual   #402 <Method boolean String.isEmpty()>
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
	//    2    2:ldc2            #766 <Class JsonPropertyDescription>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #766 <Class JsonPropertyDescription>
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
	//   11   19:invokeinterface #767 <Method String JsonPropertyDescription.value()>
	//   12   24:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonIgnoreProperties)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonIgnoreProperties)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #771 <Class JsonIgnoreProperties>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #771 <Class JsonIgnoreProperties>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       20
			return com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value.empty();
	//    8   16:invokestatic    #776 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value.empty()>
	//    9   19:areturn         
		else
			return com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value.from(((JsonIgnoreProperties) (annotated)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #779 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value.from(JsonIgnoreProperties)>
	//   12   24:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(Annotated annotated)
	{
		Object obj = ((Object) ((JsonInclude)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonInclude)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #783 <Class JsonInclude>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #783 <Class JsonInclude>
	//    5   11:astore_2        
		if(obj == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       23
			obj = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Value.empty()));
	//    8   16:invokestatic    #786 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//    9   19:astore_2        
		else
	//*  10   20:goto            28
			obj = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Value.from(((JsonInclude) (obj)))));
	//   11   23:aload_2         
	//   12   24:invokestatic    #789 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.from(JsonInclude)>
	//   13   27:astore_2        
		Object obj1 = obj;
	//   14   28:aload_2         
	//   15   29:astore_3        
		if(((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj)).getValueInclusion() == com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*  16   30:aload_2         
	//*  17   31:invokevirtual   #792 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//*  18   34:getstatic       #795 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  19   37:if_acmpne       47
			obj1 = ((Object) (_refinePropertyInclusion(annotated, ((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj)))));
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:invokespecial   #797 <Method com.fasterxml.jackson.annotation.JsonInclude$Value _refinePropertyInclusion(Annotated, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   24   46:astore_3        
		return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj1));
	//   25   47:aload_3         
	//   26   48:areturn         
	}

	public Integer findPropertyIndex(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonProperty)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonProperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #534 <Class JsonProperty>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #534 <Class JsonProperty>
	//    5   11:astore_1        
		if(annotated != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          33
		{
			int i = ((JsonProperty) (annotated)).index();
	//    8   16:aload_1         
	//    9   17:invokeinterface #802 <Method int JsonProperty.index()>
	//   10   22:istore_2        
			if(i != -1)
	//*  11   23:iload_2         
	//*  12   24:iconst_m1       
	//*  13   25:icmpeq          33
				return Integer.valueOf(i);
	//   14   28:iload_2         
	//   15   29:invokestatic    #808 <Method Integer Integer.valueOf(int)>
	//   16   32:areturn         
		}
		return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
	}

	public TypeResolverBuilder findPropertyTypeResolver(MapperConfig mapperconfig, AnnotatedMember annotatedmember, JavaType javatype)
	{
		if(!javatype.isContainerType() && !javatype.isReferenceType())
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #812 <Method boolean JavaType.isContainerType()>
	//*   2    4:ifne            25
	//*   3    7:aload_3         
	//*   4    8:invokevirtual   #815 <Method boolean JavaType.isReferenceType()>
	//*   5   11:ifeq            17
	//*   6   14:goto            25
			return _findTypeResolver(mapperconfig, ((Annotated) (annotatedmember)), javatype);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:invokevirtual   #735 <Method TypeResolverBuilder _findTypeResolver(MapperConfig, Annotated, JavaType)>
	//   12   24:areturn         
		else
			return null;
	//   13   25:aconst_null     
	//   14   26:areturn         
	}

	public com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedmember)
	{
		JsonManagedReference jsonmanagedreference = (JsonManagedReference)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonManagedReference);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #45  <Class JsonManagedReference>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #45  <Class JsonManagedReference>
	//    5   10:astore_2        
		if(jsonmanagedreference != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          25
			return com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.managed(jsonmanagedreference.value());
	//    8   15:aload_2         
	//    9   16:invokeinterface #818 <Method String JsonManagedReference.value()>
	//   10   21:invokestatic    #824 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.managed(String)>
	//   11   24:areturn         
		annotatedmember = ((AnnotatedMember) ((JsonBackReference)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonBackReference)));
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:ldc1            #43  <Class JsonBackReference>
	//   15   29:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//   16   32:checkcast       #43  <Class JsonBackReference>
	//   17   35:astore_1        
		if(annotatedmember != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          50
			return com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.back(((JsonBackReference) (annotatedmember)).value());
	//   20   40:aload_1         
	//   21   41:invokeinterface #825 <Method String JsonBackReference.value()>
	//   22   46:invokestatic    #828 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.back(String)>
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
	//    2    2:ldc2            #832 <Class JsonRootName>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #832 <Class JsonRootName>
	//    5   11:astore_3        
		annotatedclass = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		if(jsonrootname == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		String s = jsonrootname.namespace();
	//   12   20:aload_3         
	//   13   21:invokeinterface #833 <Method String JsonRootName.namespace()>
	//   14   26:astore_2        
		if(s == null || s.length() != 0)
	//*  15   27:aload_2         
	//*  16   28:ifnull          41
	//*  17   31:aload_2         
	//*  18   32:invokevirtual   #564 <Method int String.length()>
	//*  19   35:ifne            41
	//*  20   38:goto            43
			annotatedclass = ((AnnotatedClass) (s));
	//   21   41:aload_2         
	//   22   42:astore_1        
		return PropertyName.construct(jsonrootname.value(), ((String) (annotatedclass)));
	//   23   43:aload_3         
	//   24   44:invokeinterface #834 <Method String JsonRootName.value()>
	//   25   49:aload_1         
	//   26   50:invokestatic    #408 <Method PropertyName PropertyName.construct(String, String)>
	//   27   53:areturn         
	}

	public Object findSerializationContentConverter(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) ((JsonSerialize)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #31  <Class JsonSerialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #31  <Class JsonSerialize>
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
	//   12   19:invokeinterface #836 <Method Class JsonSerialize.contentConverter()>
	//   13   24:ldc2            #511 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//   14   27:invokevirtual   #513 <Method Class _classIfExplicit(Class, Class)>
	//   15   30:areturn         
	}

	public Object findSerializationConverter(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #31  <Class JsonSerialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #31  <Class JsonSerialize>
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
	//   12   19:invokeinterface #838 <Method Class JsonSerialize.converter()>
	//   13   24:ldc2            #511 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//   14   27:invokevirtual   #513 <Method Class _classIfExplicit(Class, Class)>
	//   15   30:areturn         
	}

	public String[] findSerializationPropertyOrder(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonPropertyOrder)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonPropertyOrder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #79  <Class JsonPropertyOrder>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #79  <Class JsonPropertyOrder>
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
	//   11   18:invokeinterface #841 <Method String[] JsonPropertyOrder.value()>
	//   12   23:areturn         
	}

	public Boolean findSerializationSortAlphabetically(Annotated annotated)
	{
		return _findSortAlpha(annotated);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #844 <Method Boolean _findSortAlpha(Annotated)>
	//    3    5:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing findSerializationTyping(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #31  <Class JsonSerialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #31  <Class JsonSerialize>
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
	//   11   18:invokeinterface #850 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing JsonSerialize.typing()>
	//   12   23:areturn         
	}

	public Object findSerializer(Annotated annotated)
	{
		Object obj = ((Object) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #31  <Class JsonSerialize>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #31  <Class JsonSerialize>
	//    5   10:astore_2        
		if(obj != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          31
		{
			obj = ((Object) (((JsonSerialize) (obj)).using()));
	//    8   15:aload_2         
	//    9   16:invokeinterface #852 <Method Class JsonSerialize.using()>
	//   10   21:astore_2        
			if(obj != com/fasterxml/jackson/databind/JsonSerializer$None)
	//*  11   22:aload_2         
	//*  12   23:ldc2            #461 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//*  13   26:if_acmpeq       31
				return obj;
	//   14   29:aload_2         
	//   15   30:areturn         
		}
		obj = ((Object) ((JsonRawValue)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonRawValue)));
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:ldc1            #39  <Class JsonRawValue>
	//   19   35:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//   20   38:checkcast       #39  <Class JsonRawValue>
	//   21   41:astore_2        
		if(obj != null && ((JsonRawValue) (obj)).value())
	//*  22   42:aload_2         
	//*  23   43:ifnull          67
	//*  24   46:aload_2         
	//*  25   47:invokeinterface #853 <Method boolean JsonRawValue.value()>
	//*  26   52:ifeq            67
			return ((Object) (new RawSerializer(annotated.getRawType())));
	//   27   55:new             #855 <Class RawSerializer>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:invokevirtual   #858 <Method Class Annotated.getRawType()>
	//   31   63:invokespecial   #861 <Method void RawSerializer(Class)>
	//   32   66:areturn         
		else
			return ((Object) (null));
	//   33   67:aconst_null     
	//   34   68:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonSetter.Value findSetterInfo(Annotated annotated)
	{
		return com.fasterxml.jackson.annotation.JsonSetter.Value.from((JsonSetter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonSetter));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #633 <Class JsonSetter>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #633 <Class JsonSetter>
	//    5   11:invokestatic    #868 <Method com.fasterxml.jackson.annotation.JsonSetter$Value com.fasterxml.jackson.annotation.JsonSetter$Value.from(JsonSetter)>
	//    6   14:areturn         
	}

	public List findSubtypes(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonSubTypes)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonSubTypes)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #871 <Class JsonSubTypes>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #871 <Class JsonSubTypes>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		annotated = ((Annotated) (((JsonSubTypes) (annotated)).value()));
	//   10   18:aload_1         
	//   11   19:invokeinterface #874 <Method com.fasterxml.jackson.annotation.JsonSubTypes$Type[] JsonSubTypes.value()>
	//   12   24:astore_1        
		ArrayList arraylist = new ArrayList(annotated.length);
	//   13   25:new             #723 <Class ArrayList>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:arraylength     
	//   17   31:invokespecial   #726 <Method void ArrayList(int)>
	//   18   34:astore          4
		int j = annotated.length;
	//   19   36:aload_1         
	//   20   37:arraylength     
	//   21   38:istore_3        
		for(int i = 0; i < j; i++)
	//*  22   39:iconst_0        
	//*  23   40:istore_2        
	//*  24   41:iload_2         
	//*  25   42:iload_3         
	//*  26   43:icmpge          85
		{
			com.fasterxml.jackson.annotation.JsonSubTypes.Type type = ((com.fasterxml.jackson.annotation.JsonSubTypes.Type) (annotated[i]));
	//   27   46:aload_1         
	//   28   47:iload_2         
	//   29   48:aaload          
	//   30   49:astore          5
			arraylist.add(((Object) (new NamedType(type.value(), type.name()))));
	//   31   51:aload           4
	//   32   53:new             #876 <Class NamedType>
	//   33   56:dup             
	//   34   57:aload           5
	//   35   59:invokeinterface #879 <Method Class com.fasterxml.jackson.annotation.JsonSubTypes$Type.value()>
	//   36   64:aload           5
	//   37   66:invokeinterface #880 <Method String com.fasterxml.jackson.annotation.JsonSubTypes$Type.name()>
	//   38   71:invokespecial   #883 <Method void NamedType(Class, String)>
	//   39   74:invokevirtual   #884 <Method boolean ArrayList.add(Object)>
	//   40   77:pop             
		}

	//   41   78:iload_2         
	//   42   79:iconst_1        
	//   43   80:iadd            
	//   44   81:istore_2        
	//*  45   82:goto            41
		return ((List) (arraylist));
	//   46   85:aload           4
	//   47   87:areturn         
	}

	public String findTypeName(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonTypeName)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonTypeName)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #889 <Class JsonTypeName>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #889 <Class JsonTypeName>
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
	//   11   19:invokeinterface #890 <Method String JsonTypeName.value()>
	//   12   24:areturn         
	}

	public TypeResolverBuilder findTypeResolver(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype)
	{
		return _findTypeResolver(mapperconfig, ((Annotated) (annotatedclass)), javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #735 <Method TypeResolverBuilder _findTypeResolver(MapperConfig, Annotated, JavaType)>
	//    5    7:areturn         
	}

	public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) ((JsonUnwrapped)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonUnwrapped)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #41  <Class JsonUnwrapped>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #41  <Class JsonUnwrapped>
	//    5   10:astore_1        
		if(annotatedmember != null && ((JsonUnwrapped) (annotatedmember)).enabled())
	//*   6   11:aload_1         
	//*   7   12:ifnull          43
	//*   8   15:aload_1         
	//*   9   16:invokeinterface #898 <Method boolean JsonUnwrapped.enabled()>
	//*  10   21:ifne            27
	//*  11   24:goto            43
			return NameTransformer.simpleTransformer(((JsonUnwrapped) (annotatedmember)).prefix(), ((JsonUnwrapped) (annotatedmember)).suffix());
	//   12   27:aload_1         
	//   13   28:invokeinterface #901 <Method String JsonUnwrapped.prefix()>
	//   14   33:aload_1         
	//   15   34:invokeinterface #904 <Method String JsonUnwrapped.suffix()>
	//   16   39:invokestatic    #910 <Method NameTransformer NameTransformer.simpleTransformer(String, String)>
	//   17   42:areturn         
		else
			return null;
	//   18   43:aconst_null     
	//   19   44:areturn         
	}

	public Object findValueInstantiator(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonValueInstantiator)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/databind/annotation/JsonValueInstantiator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #913 <Class JsonValueInstantiator>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #913 <Class JsonValueInstantiator>
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
	//   11   19:invokeinterface #914 <Method Class JsonValueInstantiator.value()>
	//   12   24:areturn         
	}

	public Class[] findViews(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonView)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonView)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #33  <Class JsonView>
	//    3    4:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    7:checkcast       #33  <Class JsonView>
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
	//   11   18:invokeinterface #919 <Method Class[] JsonView.value()>
	//   12   23:areturn         
	}

	public Boolean hasAnyGetter(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonAnyGetter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonAnyGetter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #923 <Class JsonAnyGetter>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #923 <Class JsonAnyGetter>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return Boolean.valueOf(((JsonAnyGetter) (annotated)).enabled());
	//   10   18:aload_1         
	//   11   19:invokeinterface #924 <Method boolean JsonAnyGetter.enabled()>
	//   12   24:invokestatic    #927 <Method Boolean Boolean.valueOf(boolean)>
	//   13   27:areturn         
	}

	public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedmethod)
	{
		return _hasAnnotation(((Annotated) (annotatedmethod)), com/fasterxml/jackson/annotation/JsonAnyGetter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #923 <Class JsonAnyGetter>
	//    3    5:invokevirtual   #933 <Method boolean _hasAnnotation(Annotated, Class)>
	//    4    8:ireturn         
	}

	public Boolean hasAnySetter(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonAnySetter)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonAnySetter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #936 <Class JsonAnySetter>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #936 <Class JsonAnySetter>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return Boolean.valueOf(((JsonAnySetter) (annotated)).enabled());
	//   10   18:aload_1         
	//   11   19:invokeinterface #937 <Method boolean JsonAnySetter.enabled()>
	//   12   24:invokestatic    #927 <Method Boolean Boolean.valueOf(boolean)>
	//   13   27:areturn         
	}

	public Boolean hasAsValue(Annotated annotated)
	{
		annotated = ((Annotated) ((JsonValue)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonValue)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #940 <Class JsonValue>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #940 <Class JsonValue>
	//    5   11:astore_1        
		if(annotated == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       18
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
		else
			return Boolean.valueOf(((JsonValue) (annotated)).value());
	//   10   18:aload_1         
	//   11   19:invokeinterface #941 <Method boolean JsonValue.value()>
	//   12   24:invokestatic    #927 <Method Boolean Boolean.valueOf(boolean)>
	//   13   27:areturn         
	}

	public boolean hasAsValueAnnotation(AnnotatedMethod annotatedmethod)
	{
		annotatedmethod = ((AnnotatedMethod) ((JsonValue)_findAnnotation(((Annotated) (annotatedmethod)), com/fasterxml/jackson/annotation/JsonValue)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #940 <Class JsonValue>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #940 <Class JsonValue>
	//    5   11:astore_1        
		return annotatedmethod != null && ((JsonValue) (annotatedmethod)).value();
	//    6   12:aload_1         
	//    7   13:ifnull          27
	//    8   16:aload_1         
	//    9   17:invokeinterface #941 <Method boolean JsonValue.value()>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public boolean hasCreatorAnnotation(Annotated annotated)
	{
		JsonCreator jsoncreator = (JsonCreator)_findAnnotation(annotated, com/fasterxml/jackson/annotation/JsonCreator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #465 <Class JsonCreator>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #465 <Class JsonCreator>
	//    5   11:astore_3        
		boolean flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		if(jsoncreator != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          34
		{
			if(jsoncreator.mode() != com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED)
	//*  10   18:aload_3         
	//*  11   19:invokeinterface #469 <Method com.fasterxml.jackson.annotation.JsonCreator$Mode JsonCreator.mode()>
	//*  12   24:getstatic       #945 <Field com.fasterxml.jackson.annotation.JsonCreator$Mode com.fasterxml.jackson.annotation.JsonCreator$Mode.DISABLED>
	//*  13   27:if_acmpeq       32
				flag = true;
	//   14   30:iconst_1        
	//   15   31:istore_2        
			return flag;
	//   16   32:iload_2         
	//   17   33:ireturn         
		}
		if(_cfgConstructorPropertiesImpliesCreator && (annotated instanceof AnnotatedConstructor))
	//*  18   34:aload_0         
	//*  19   35:getfield        #75  <Field boolean _cfgConstructorPropertiesImpliesCreator>
	//*  20   38:ifeq            71
	//*  21   41:aload_1         
	//*  22   42:instanceof      #481 <Class AnnotatedConstructor>
	//*  23   45:ifeq            71
		{
			Java7Support java7support = _java7Helper;
	//   24   48:getstatic       #62  <Field Java7Support _java7Helper>
	//   25   51:astore_3        
			if(java7support != null)
	//*  26   52:aload_3         
	//*  27   53:ifnull          71
			{
				annotated = ((Annotated) (java7support.hasCreatorAnnotation(annotated)));
	//   28   56:aload_3         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #484 <Method Boolean Java7Support.hasCreatorAnnotation(Annotated)>
	//   31   61:astore_1        
				if(annotated != null)
	//*  32   62:aload_1         
	//*  33   63:ifnull          71
					return ((Boolean) (annotated)).booleanValue();
	//   34   66:aload_1         
	//   35   67:invokevirtual   #397 <Method boolean Boolean.booleanValue()>
	//   36   70:ireturn         
			}
		}
		return false;
	//   37   71:iconst_0        
	//   38   72:ireturn         
	}

	public boolean hasIgnoreMarker(AnnotatedMember annotatedmember)
	{
		return _isIgnorable(((Annotated) (annotatedmember)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #949 <Method boolean _isIgnorable(Annotated)>
	//    3    5:ireturn         
	}

	public Boolean hasRequiredMarker(AnnotatedMember annotatedmember)
	{
		annotatedmember = ((AnnotatedMember) ((JsonProperty)_findAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonProperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #534 <Class JsonProperty>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #534 <Class JsonProperty>
	//    5   11:astore_1        
		if(annotatedmember != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          26
			return Boolean.valueOf(((JsonProperty) (annotatedmember)).required());
	//    8   16:aload_1         
	//    9   17:invokeinterface #952 <Method boolean JsonProperty.required()>
	//   10   22:invokestatic    #927 <Method Boolean Boolean.valueOf(boolean)>
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
	//    1    1:invokeinterface #959 <Method Class Annotation.annotationType()>
	//    2    6:astore          4
		Boolean boolean1 = (Boolean)_annotationsInside.get(((Object) (class1)));
	//    3    8:aload_0         
	//    4    9:getfield        #73  <Field LRUMap _annotationsInside>
	//    5   12:aload           4
	//    6   14:invokevirtual   #960 <Method Object LRUMap.get(Object)>
	//    7   17:checkcast       #89  <Class Boolean>
	//    8   20:astore_3        
		annotation = ((Annotation) (boolean1));
	//    9   21:aload_3         
	//   10   22:astore_1        
		if(boolean1 == null)
	//*  11   23:aload_3         
	//*  12   24:ifnonnull       61
		{
			boolean flag;
			if(class1.getAnnotation(com/fasterxml/jackson/annotation/JacksonAnnotationsInside) != null)
	//*  13   27:aload           4
	//*  14   29:ldc2            #962 <Class JacksonAnnotationsInside>
	//*  15   32:invokevirtual   #963 <Method Annotation Class.getAnnotation(Class)>
	//*  16   35:ifnull          43
				flag = true;
	//   17   38:iconst_1        
	//   18   39:istore_2        
			else
	//*  19   40:goto            45
				flag = false;
	//   20   43:iconst_0        
	//   21   44:istore_2        
			annotation = ((Annotation) (Boolean.valueOf(flag)));
	//   22   45:iload_2         
	//   23   46:invokestatic    #927 <Method Boolean Boolean.valueOf(boolean)>
	//   24   49:astore_1        
			_annotationsInside.putIfAbsent(((Object) (class1)), ((Object) (annotation)));
	//   25   50:aload_0         
	//   26   51:getfield        #73  <Field LRUMap _annotationsInside>
	//   27   54:aload           4
	//   28   56:aload_1         
	//   29   57:invokevirtual   #966 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//   30   60:pop             
		}
		return ((Boolean) (annotation)).booleanValue();
	//   31   61:aload_1         
	//   32   62:invokevirtual   #397 <Method boolean Boolean.booleanValue()>
	//   33   65:ireturn         
	}

	public Boolean isIgnorableType(AnnotatedClass annotatedclass)
	{
		annotatedclass = ((AnnotatedClass) ((JsonIgnoreType)_findAnnotation(((Annotated) (annotatedclass)), com/fasterxml/jackson/annotation/JsonIgnoreType)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #970 <Class JsonIgnoreType>
	//    3    5:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    4    8:checkcast       #970 <Class JsonIgnoreType>
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
	//   11   19:invokeinterface #971 <Method boolean JsonIgnoreType.value()>
	//   12   24:invokestatic    #927 <Method Boolean Boolean.valueOf(boolean)>
	//   13   27:areturn         
	}

	public Boolean isTypeId(AnnotatedMember annotatedmember)
	{
		return Boolean.valueOf(_hasAnnotation(((Annotated) (annotatedmember)), com/fasterxml/jackson/annotation/JsonTypeId));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #974 <Class JsonTypeId>
	//    3    5:invokevirtual   #933 <Method boolean _hasAnnotation(Annotated, Class)>
	//    4    8:invokestatic    #927 <Method Boolean Boolean.valueOf(boolean)>
	//    5   11:areturn         
	}

	protected Object readResolve()
	{
		if(_annotationsInside == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field LRUMap _annotationsInside>
	//*   2    4:ifnonnull       22
			_annotationsInside = new LRUMap(48, 48);
	//    3    7:aload_0         
	//    4    8:new             #68  <Class LRUMap>
	//    5   11:dup             
	//    6   12:bipush          48
	//    7   14:bipush          48
	//    8   16:invokespecial   #71  <Method void LRUMap(int, int)>
	//    9   19:putfield        #73  <Field LRUMap _annotationsInside>
		return ((Object) (this));
	//   10   22:aload_0         
	//   11   23:areturn         
	}

	public JavaType refineDeserializationType(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
		throws JsonMappingException
	{
		TypeFactory typefactory = mapperconfig.getTypeFactory();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #983 <Method TypeFactory MapperConfig.getTypeFactory()>
	//    2    4:astore          5
		JsonDeserialize jsondeserialize = (JsonDeserialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonDeserialize);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:ldc1            #50  <Class JsonDeserialize>
	//    6   10:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    7   13:checkcast       #50  <Class JsonDeserialize>
	//    8   16:astore          6
		Object obj;
		if(jsondeserialize == null)
	//*   9   18:aload           6
	//*  10   20:ifnonnull       29
			obj = null;
	//   11   23:aconst_null     
	//   12   24:astore          4
		else
	//*  13   26:goto            42
			obj = ((Object) (_classIfExplicit(jsondeserialize.as())));
	//   14   29:aload_0         
	//   15   30:aload           6
	//   16   32:invokeinterface #986 <Method Class JsonDeserialize.as()>
	//   17   37:invokevirtual   #164 <Method Class _classIfExplicit(Class)>
	//   18   40:astore          4
		mapperconfig = ((MapperConfig) (javatype));
	//   19   42:aload_3         
	//   20   43:astore_1        
		if(obj != null)
	//*  21   44:aload           4
	//*  22   46:ifnull          131
		{
			mapperconfig = ((MapperConfig) (javatype));
	//   23   49:aload_3         
	//   24   50:astore_1        
			if(!javatype.hasRawClass(((Class) (obj))))
	//*  25   51:aload_3         
	//*  26   52:aload           4
	//*  27   54:invokevirtual   #110 <Method boolean JavaType.hasRawClass(Class)>
	//*  28   57:ifne            131
			{
				mapperconfig = ((MapperConfig) (javatype));
	//   29   60:aload_3         
	//   30   61:astore_1        
				if(!_primitiveAndWrapper(javatype, ((Class) (obj))))
	//*  31   62:aload_0         
	//*  32   63:aload_3         
	//*  33   64:aload           4
	//*  34   66:invokespecial   #988 <Method boolean _primitiveAndWrapper(JavaType, Class)>
	//*  35   69:ifne            131
					try
					{
						mapperconfig = ((MapperConfig) (typefactory.constructSpecializedType(javatype, ((Class) (obj)))));
	//   36   72:aload           5
	//   37   74:aload_3         
	//   38   75:aload           4
	//   39   77:invokevirtual   #994 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//   40   80:astore_1        
					}
	//*  41   81:goto            131
					// Misplaced declaration of an exception variable
					catch(MapperConfig mapperconfig)
	//*  42   84:astore_1        
					{
						throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", new Object[] {
							javatype, ((Class) (obj)).getName(), annotated.getName(), ((IllegalArgumentException) (mapperconfig)).getMessage()
						}), ((Throwable) (mapperconfig)));
	//   43   85:new             #979 <Class JsonMappingException>
	//   44   88:dup             
	//   45   89:aconst_null     
	//   46   90:ldc2            #996 <String "Failed to narrow type %s with annotation (value %s), from '%s': %s">
	//   47   93:iconst_4        
	//   48   94:anewarray       Object[]
	//   49   97:dup             
	//   50   98:iconst_0        
	//   51   99:aload_3         
	//   52  100:aastore         
	//   53  101:dup             
	//   54  102:iconst_1        
	//   55  103:aload           4
	//   56  105:invokevirtual   #594 <Method String Class.getName()>
	//   57  108:aastore         
	//   58  109:dup             
	//   59  110:iconst_2        
	//   60  111:aload_2         
	//   61  112:invokevirtual   #997 <Method String Annotated.getName()>
	//   62  115:aastore         
	//   63  116:dup             
	//   64  117:iconst_3        
	//   65  118:aload_1         
	//   66  119:invokevirtual   #1000 <Method String IllegalArgumentException.getMessage()>
	//   67  122:aastore         
	//   68  123:invokestatic    #1004 <Method String String.format(String, Object[])>
	//   69  126:aload_1         
	//   70  127:invokespecial   #1007 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//   71  130:athrow          
					}
			}
		}
		javatype = ((JavaType) (mapperconfig));
	//   72  131:aload_1         
	//   73  132:astore_3        
		if(((JavaType) (mapperconfig)).isMapLikeType())
	//*  74  133:aload_1         
	//*  75  134:invokevirtual   #1010 <Method boolean JavaType.isMapLikeType()>
	//*  76  137:ifeq            259
		{
			JavaType javatype1 = ((JavaType) (mapperconfig)).getKeyType();
	//   77  140:aload_1         
	//   78  141:invokevirtual   #1013 <Method JavaType JavaType.getKeyType()>
	//   79  144:astore          7
			if(jsondeserialize == null)
	//*  80  146:aload           6
	//*  81  148:ifnonnull       157
				obj = null;
	//   82  151:aconst_null     
	//   83  152:astore          4
			else
	//*  84  154:goto            170
				obj = ((Object) (_classIfExplicit(jsondeserialize.keyAs())));
	//   85  157:aload_0         
	//   86  158:aload           6
	//   87  160:invokeinterface #1016 <Method Class JsonDeserialize.keyAs()>
	//   88  165:invokevirtual   #164 <Method Class _classIfExplicit(Class)>
	//   89  168:astore          4
			javatype = ((JavaType) (mapperconfig));
	//   90  170:aload_1         
	//   91  171:astore_3        
			if(obj != null)
	//*  92  172:aload           4
	//*  93  174:ifnull          259
			{
				javatype = ((JavaType) (mapperconfig));
	//   94  177:aload_1         
	//   95  178:astore_3        
				if(!_primitiveAndWrapper(javatype1, ((Class) (obj))))
	//*  96  179:aload_0         
	//*  97  180:aload           7
	//*  98  182:aload           4
	//*  99  184:invokespecial   #988 <Method boolean _primitiveAndWrapper(JavaType, Class)>
	//* 100  187:ifne            259
					try
					{
						javatype = typefactory.constructSpecializedType(javatype1, ((Class) (obj)));
	//  101  190:aload           5
	//  102  192:aload           7
	//  103  194:aload           4
	//  104  196:invokevirtual   #994 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//  105  199:astore_3        
						javatype = ((JavaType) (((MapLikeType)mapperconfig).withKeyType(javatype)));
	//  106  200:aload_1         
	//  107  201:checkcast       #1018 <Class MapLikeType>
	//  108  204:aload_3         
	//  109  205:invokevirtual   #1022 <Method MapLikeType MapLikeType.withKeyType(JavaType)>
	//  110  208:astore_3        
					}
	//* 111  209:goto            259
					// Misplaced declaration of an exception variable
					catch(JavaType javatype)
	//* 112  212:astore_3        
					{
						throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[] {
							mapperconfig, ((Class) (obj)).getName(), annotated.getName(), ((IllegalArgumentException) (javatype)).getMessage()
						}), ((Throwable) (javatype)));
	//  113  213:new             #979 <Class JsonMappingException>
	//  114  216:dup             
	//  115  217:aconst_null     
	//  116  218:ldc2            #1024 <String "Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s">
	//  117  221:iconst_4        
	//  118  222:anewarray       Object[]
	//  119  225:dup             
	//  120  226:iconst_0        
	//  121  227:aload_1         
	//  122  228:aastore         
	//  123  229:dup             
	//  124  230:iconst_1        
	//  125  231:aload           4
	//  126  233:invokevirtual   #594 <Method String Class.getName()>
	//  127  236:aastore         
	//  128  237:dup             
	//  129  238:iconst_2        
	//  130  239:aload_2         
	//  131  240:invokevirtual   #997 <Method String Annotated.getName()>
	//  132  243:aastore         
	//  133  244:dup             
	//  134  245:iconst_3        
	//  135  246:aload_3         
	//  136  247:invokevirtual   #1000 <Method String IllegalArgumentException.getMessage()>
	//  137  250:aastore         
	//  138  251:invokestatic    #1004 <Method String String.format(String, Object[])>
	//  139  254:aload_3         
	//  140  255:invokespecial   #1007 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  141  258:athrow          
					}
			}
		}
		obj = ((Object) (javatype.getContentType()));
	//  142  259:aload_3         
	//  143  260:invokevirtual   #733 <Method JavaType JavaType.getContentType()>
	//  144  263:astore          4
		if(obj != null)
	//* 145  265:aload           4
	//* 146  267:ifnull          372
		{
			if(jsondeserialize == null)
	//* 147  270:aload           6
	//* 148  272:ifnonnull       280
				mapperconfig = null;
	//  149  275:aconst_null     
	//  150  276:astore_1        
			else
	//* 151  277:goto            292
				mapperconfig = ((MapperConfig) (_classIfExplicit(jsondeserialize.contentAs())));
	//  152  280:aload_0         
	//  153  281:aload           6
	//  154  283:invokeinterface #1027 <Method Class JsonDeserialize.contentAs()>
	//  155  288:invokevirtual   #164 <Method Class _classIfExplicit(Class)>
	//  156  291:astore_1        
			if(mapperconfig != null && !_primitiveAndWrapper(((JavaType) (obj)), ((Class) (mapperconfig))))
	//* 157  292:aload_1         
	//* 158  293:ifnull          372
	//* 159  296:aload_0         
	//* 160  297:aload           4
	//* 161  299:aload_1         
	//* 162  300:invokespecial   #988 <Method boolean _primitiveAndWrapper(JavaType, Class)>
	//* 163  303:ifne            372
			{
				try
				{
					obj = ((Object) (javatype.withContentType(typefactory.constructSpecializedType(((JavaType) (obj)), ((Class) (mapperconfig))))));
	//  164  306:aload_3         
	//  165  307:aload           5
	//  166  309:aload           4
	//  167  311:aload_1         
	//  168  312:invokevirtual   #994 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//  169  315:invokevirtual   #1031 <Method JavaType JavaType.withContentType(JavaType)>
	//  170  318:astore          4
				}
	//* 171  320:aload           4
	//* 172  322:areturn         
				catch(IllegalArgumentException illegalargumentexception)
	//* 173  323:astore          4
				{
					throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[] {
						javatype, ((Class) (mapperconfig)).getName(), annotated.getName(), illegalargumentexception.getMessage()
					}), ((Throwable) (illegalargumentexception)));
	//  174  325:new             #979 <Class JsonMappingException>
	//  175  328:dup             
	//  176  329:aconst_null     
	//  177  330:ldc2            #1033 <String "Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s">
	//  178  333:iconst_4        
	//  179  334:anewarray       Object[]
	//  180  337:dup             
	//  181  338:iconst_0        
	//  182  339:aload_3         
	//  183  340:aastore         
	//  184  341:dup             
	//  185  342:iconst_1        
	//  186  343:aload_1         
	//  187  344:invokevirtual   #594 <Method String Class.getName()>
	//  188  347:aastore         
	//  189  348:dup             
	//  190  349:iconst_2        
	//  191  350:aload_2         
	//  192  351:invokevirtual   #997 <Method String Annotated.getName()>
	//  193  354:aastore         
	//  194  355:dup             
	//  195  356:iconst_3        
	//  196  357:aload           4
	//  197  359:invokevirtual   #1000 <Method String IllegalArgumentException.getMessage()>
	//  198  362:aastore         
	//  199  363:invokestatic    #1004 <Method String String.format(String, Object[])>
	//  200  366:aload           4
	//  201  368:invokespecial   #1007 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  202  371:athrow          
				}
				return ((JavaType) (obj));
			}
		}
		return javatype;
	//  203  372:aload_3         
	//  204  373:areturn         
	}

	public JavaType refineSerializationType(MapperConfig mapperconfig, Annotated annotated, JavaType javatype)
		throws JsonMappingException
	{
		Object obj;
		TypeFactory typefactory;
		Object obj1;
		typefactory = mapperconfig.getTypeFactory();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #983 <Method TypeFactory MapperConfig.getTypeFactory()>
	//    2    4:astore          5
		obj1 = ((Object) ((JsonSerialize)_findAnnotation(annotated, com/fasterxml/jackson/databind/annotation/JsonSerialize)));
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:ldc1            #31  <Class JsonSerialize>
	//    6   10:invokevirtual   #83  <Method Annotation _findAnnotation(Annotated, Class)>
	//    7   13:checkcast       #31  <Class JsonSerialize>
	//    8   16:astore          6
		if(obj1 == null)
	//*   9   18:aload           6
	//*  10   20:ifnonnull       29
			obj = null;
	//   11   23:aconst_null     
	//   12   24:astore          4
		else
	//*  13   26:goto            42
			obj = ((Object) (_classIfExplicit(((JsonSerialize) (obj1)).as())));
	//   14   29:aload_0         
	//   15   30:aload           6
	//   16   32:invokeinterface #1037 <Method Class JsonSerialize.as()>
	//   17   37:invokevirtual   #164 <Method Class _classIfExplicit(Class)>
	//   18   40:astore          4
		mapperconfig = ((MapperConfig) (javatype));
	//   19   42:aload_3         
	//   20   43:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_209;
	//   21   44:aload           4
	//   22   46:ifnull          209
		if(javatype.hasRawClass(((Class) (obj))))
	//*  23   49:aload_3         
	//*  24   50:aload           4
	//*  25   52:invokevirtual   #110 <Method boolean JavaType.hasRawClass(Class)>
	//*  26   55:ifeq            66
		{
			mapperconfig = ((MapperConfig) (javatype.withStaticTyping()));
	//   27   58:aload_3         
	//   28   59:invokevirtual   #1040 <Method JavaType JavaType.withStaticTyping()>
	//   29   62:astore_1        
			break MISSING_BLOCK_LABEL_209;
	//   30   63:goto            209
		}
		mapperconfig = ((MapperConfig) (javatype.getRawClass()));
	//   31   66:aload_3         
	//   32   67:invokevirtual   #115 <Method Class JavaType.getRawClass()>
	//   33   70:astore_1        
		if(((Class) (obj)).isAssignableFrom(((Class) (mapperconfig))))
	//*  34   71:aload           4
	//*  35   73:aload_1         
	//*  36   74:invokevirtual   #1043 <Method boolean Class.isAssignableFrom(Class)>
	//*  37   77:ifeq            92
		{
			mapperconfig = ((MapperConfig) (typefactory.constructGeneralizedType(javatype, ((Class) (obj)))));
	//   38   80:aload           5
	//   39   82:aload_3         
	//   40   83:aload           4
	//   41   85:invokevirtual   #1046 <Method JavaType TypeFactory.constructGeneralizedType(JavaType, Class)>
	//   42   88:astore_1        
			break MISSING_BLOCK_LABEL_209;
	//   43   89:goto            209
		}
		if(((Class) (mapperconfig)).isAssignableFrom(((Class) (obj))))
	//*  44   92:aload_1         
	//*  45   93:aload           4
	//*  46   95:invokevirtual   #1043 <Method boolean Class.isAssignableFrom(Class)>
	//*  47   98:ifeq            113
		{
			mapperconfig = ((MapperConfig) (typefactory.constructSpecializedType(javatype, ((Class) (obj)))));
	//   48  101:aload           5
	//   49  103:aload_3         
	//   50  104:aload           4
	//   51  106:invokevirtual   #994 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//   52  109:astore_1        
			break MISSING_BLOCK_LABEL_209;
	//   53  110:goto            209
		}
		if(_primitiveAndWrapper(((Class) (mapperconfig)), ((Class) (obj))))
	//*  54  113:aload_0         
	//*  55  114:aload_1         
	//*  56  115:aload           4
	//*  57  117:invokespecial   #1048 <Method boolean _primitiveAndWrapper(Class, Class)>
	//*  58  120:ifeq            131
		{
			mapperconfig = ((MapperConfig) (javatype.withStaticTyping()));
	//   59  123:aload_3         
	//   60  124:invokevirtual   #1040 <Method JavaType JavaType.withStaticTyping()>
	//   61  127:astore_1        
			break MISSING_BLOCK_LABEL_209;
	//   62  128:goto            209
		} else
		{
			try
			{
				throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Cannot refine serialization type %s into %s; types not related", new Object[] {
					javatype, ((Class) (obj)).getName()
				}));
	//   63  131:new             #979 <Class JsonMappingException>
	//   64  134:dup             
	//   65  135:aconst_null     
	//   66  136:ldc2            #1050 <String "Cannot refine serialization type %s into %s; types not related">
	//   67  139:iconst_2        
	//   68  140:anewarray       Object[]
	//   69  143:dup             
	//   70  144:iconst_0        
	//   71  145:aload_3         
	//   72  146:aastore         
	//   73  147:dup             
	//   74  148:iconst_1        
	//   75  149:aload           4
	//   76  151:invokevirtual   #594 <Method String Class.getName()>
	//   77  154:aastore         
	//   78  155:invokestatic    #1004 <Method String String.format(String, Object[])>
	//   79  158:invokespecial   #1053 <Method void JsonMappingException(java.io.Closeable, String)>
	//   80  161:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(MapperConfig mapperconfig)
	//*  81  162:astore_1        
			{
				throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", new Object[] {
					javatype, ((Class) (obj)).getName(), annotated.getName(), ((IllegalArgumentException) (mapperconfig)).getMessage()
				}), ((Throwable) (mapperconfig)));
	//   82  163:new             #979 <Class JsonMappingException>
	//   83  166:dup             
	//   84  167:aconst_null     
	//   85  168:ldc2            #1055 <String "Failed to widen type %s with annotation (value %s), from '%s': %s">
	//   86  171:iconst_4        
	//   87  172:anewarray       Object[]
	//   88  175:dup             
	//   89  176:iconst_0        
	//   90  177:aload_3         
	//   91  178:aastore         
	//   92  179:dup             
	//   93  180:iconst_1        
	//   94  181:aload           4
	//   95  183:invokevirtual   #594 <Method String Class.getName()>
	//   96  186:aastore         
	//   97  187:dup             
	//   98  188:iconst_2        
	//   99  189:aload_2         
	//  100  190:invokevirtual   #997 <Method String Annotated.getName()>
	//  101  193:aastore         
	//  102  194:dup             
	//  103  195:iconst_3        
	//  104  196:aload_1         
	//  105  197:invokevirtual   #1000 <Method String IllegalArgumentException.getMessage()>
	//  106  200:aastore         
	//  107  201:invokestatic    #1004 <Method String String.format(String, Object[])>
	//  108  204:aload_1         
	//  109  205:invokespecial   #1007 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  110  208:athrow          
			}
		}
		JavaType javatype1;
		javatype = ((JavaType) (mapperconfig));
	//  111  209:aload_1         
	//  112  210:astore_3        
		if(!((JavaType) (mapperconfig)).isMapLikeType())
			break MISSING_BLOCK_LABEL_431;
	//  113  211:aload_1         
	//  114  212:invokevirtual   #1010 <Method boolean JavaType.isMapLikeType()>
	//  115  215:ifeq            431
		javatype1 = ((JavaType) (mapperconfig)).getKeyType();
	//  116  218:aload_1         
	//  117  219:invokevirtual   #1013 <Method JavaType JavaType.getKeyType()>
	//  118  222:astore          7
		if(obj1 == null)
	//* 119  224:aload           6
	//* 120  226:ifnonnull       235
			obj = null;
	//  121  229:aconst_null     
	//  122  230:astore          4
		else
	//* 123  232:goto            248
			obj = ((Object) (_classIfExplicit(((JsonSerialize) (obj1)).keyAs())));
	//  124  235:aload_0         
	//  125  236:aload           6
	//  126  238:invokeinterface #1056 <Method Class JsonSerialize.keyAs()>
	//  127  243:invokevirtual   #164 <Method Class _classIfExplicit(Class)>
	//  128  246:astore          4
		javatype = ((JavaType) (mapperconfig));
	//  129  248:aload_1         
	//  130  249:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_431;
	//  131  250:aload           4
	//  132  252:ifnull          431
		if(javatype1.hasRawClass(((Class) (obj))))
	//* 133  255:aload           7
	//* 134  257:aload           4
	//* 135  259:invokevirtual   #110 <Method boolean JavaType.hasRawClass(Class)>
	//* 136  262:ifeq            274
		{
			javatype = javatype1.withStaticTyping();
	//  137  265:aload           7
	//  138  267:invokevirtual   #1040 <Method JavaType JavaType.withStaticTyping()>
	//  139  270:astore_3        
			break MISSING_BLOCK_LABEL_340;
	//  140  271:goto            340
		}
		javatype = ((JavaType) (javatype1.getRawClass()));
	//  141  274:aload           7
	//  142  276:invokevirtual   #115 <Method Class JavaType.getRawClass()>
	//  143  279:astore_3        
		if(((Class) (obj)).isAssignableFrom(((Class) (javatype))))
	//* 144  280:aload           4
	//* 145  282:aload_3         
	//* 146  283:invokevirtual   #1043 <Method boolean Class.isAssignableFrom(Class)>
	//* 147  286:ifeq            302
		{
			javatype = typefactory.constructGeneralizedType(javatype1, ((Class) (obj)));
	//  148  289:aload           5
	//  149  291:aload           7
	//  150  293:aload           4
	//  151  295:invokevirtual   #1046 <Method JavaType TypeFactory.constructGeneralizedType(JavaType, Class)>
	//  152  298:astore_3        
			break MISSING_BLOCK_LABEL_340;
	//  153  299:goto            340
		}
		if(((Class) (javatype)).isAssignableFrom(((Class) (obj))))
	//* 154  302:aload_3         
	//* 155  303:aload           4
	//* 156  305:invokevirtual   #1043 <Method boolean Class.isAssignableFrom(Class)>
	//* 157  308:ifeq            324
		{
			javatype = typefactory.constructSpecializedType(javatype1, ((Class) (obj)));
	//  158  311:aload           5
	//  159  313:aload           7
	//  160  315:aload           4
	//  161  317:invokevirtual   #994 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//  162  320:astore_3        
			break MISSING_BLOCK_LABEL_340;
	//  163  321:goto            340
		}
		if(!_primitiveAndWrapper(((Class) (javatype)), ((Class) (obj))))
			break MISSING_BLOCK_LABEL_352;
	//  164  324:aload_0         
	//  165  325:aload_3         
	//  166  326:aload           4
	//  167  328:invokespecial   #1048 <Method boolean _primitiveAndWrapper(Class, Class)>
	//  168  331:ifeq            352
		javatype = javatype1.withStaticTyping();
	//  169  334:aload           7
	//  170  336:invokevirtual   #1040 <Method JavaType JavaType.withStaticTyping()>
	//  171  339:astore_3        
		javatype = ((JavaType) (((MapLikeType)mapperconfig).withKeyType(javatype)));
	//  172  340:aload_1         
	//  173  341:checkcast       #1018 <Class MapLikeType>
	//  174  344:aload_3         
	//  175  345:invokevirtual   #1022 <Method MapLikeType MapLikeType.withKeyType(JavaType)>
	//  176  348:astore_3        
		break MISSING_BLOCK_LABEL_431;
	//  177  349:goto            431
		try
		{
			throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Cannot refine serialization key type %s into %s; types not related", new Object[] {
				javatype1, ((Class) (obj)).getName()
			}));
	//  178  352:new             #979 <Class JsonMappingException>
	//  179  355:dup             
	//  180  356:aconst_null     
	//  181  357:ldc2            #1058 <String "Cannot refine serialization key type %s into %s; types not related">
	//  182  360:iconst_2        
	//  183  361:anewarray       Object[]
	//  184  364:dup             
	//  185  365:iconst_0        
	//  186  366:aload           7
	//  187  368:aastore         
	//  188  369:dup             
	//  189  370:iconst_1        
	//  190  371:aload           4
	//  191  373:invokevirtual   #594 <Method String Class.getName()>
	//  192  376:aastore         
	//  193  377:invokestatic    #1004 <Method String String.format(String, Object[])>
	//  194  380:invokespecial   #1053 <Method void JsonMappingException(java.io.Closeable, String)>
	//  195  383:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(JavaType javatype)
	//* 196  384:astore_3        
		{
			throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[] {
				mapperconfig, ((Class) (obj)).getName(), annotated.getName(), ((IllegalArgumentException) (javatype)).getMessage()
			}), ((Throwable) (javatype)));
	//  197  385:new             #979 <Class JsonMappingException>
	//  198  388:dup             
	//  199  389:aconst_null     
	//  200  390:ldc2            #1060 <String "Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s">
	//  201  393:iconst_4        
	//  202  394:anewarray       Object[]
	//  203  397:dup             
	//  204  398:iconst_0        
	//  205  399:aload_1         
	//  206  400:aastore         
	//  207  401:dup             
	//  208  402:iconst_1        
	//  209  403:aload           4
	//  210  405:invokevirtual   #594 <Method String Class.getName()>
	//  211  408:aastore         
	//  212  409:dup             
	//  213  410:iconst_2        
	//  214  411:aload_2         
	//  215  412:invokevirtual   #997 <Method String Annotated.getName()>
	//  216  415:aastore         
	//  217  416:dup             
	//  218  417:iconst_3        
	//  219  418:aload_3         
	//  220  419:invokevirtual   #1000 <Method String IllegalArgumentException.getMessage()>
	//  221  422:aastore         
	//  222  423:invokestatic    #1004 <Method String String.format(String, Object[])>
	//  223  426:aload_3         
	//  224  427:invokespecial   #1007 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  225  430:athrow          
		}
		obj = ((Object) (javatype.getContentType()));
	//  226  431:aload_3         
	//  227  432:invokevirtual   #733 <Method JavaType JavaType.getContentType()>
	//  228  435:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_649;
	//  229  437:aload           4
	//  230  439:ifnull          649
		if(obj1 == null)
	//* 231  442:aload           6
	//* 232  444:ifnonnull       452
			mapperconfig = null;
	//  233  447:aconst_null     
	//  234  448:astore_1        
		else
	//* 235  449:goto            464
			mapperconfig = ((MapperConfig) (_classIfExplicit(((JsonSerialize) (obj1)).contentAs())));
	//  236  452:aload_0         
	//  237  453:aload           6
	//  238  455:invokeinterface #1061 <Method Class JsonSerialize.contentAs()>
	//  239  460:invokevirtual   #164 <Method Class _classIfExplicit(Class)>
	//  240  463:astore_1        
		if(mapperconfig == null)
			break MISSING_BLOCK_LABEL_649;
	//  241  464:aload_1         
	//  242  465:ifnull          649
		if(((JavaType) (obj)).hasRawClass(((Class) (mapperconfig))))
	//* 243  468:aload           4
	//* 244  470:aload_1         
	//* 245  471:invokevirtual   #110 <Method boolean JavaType.hasRawClass(Class)>
	//* 246  474:ifeq            486
		{
			mapperconfig = ((MapperConfig) (((JavaType) (obj)).withStaticTyping()));
	//  247  477:aload           4
	//  248  479:invokevirtual   #1040 <Method JavaType JavaType.withStaticTyping()>
	//  249  482:astore_1        
			break MISSING_BLOCK_LABEL_563;
	//  250  483:goto            563
		}
		obj1 = ((Object) (((JavaType) (obj)).getRawClass()));
	//  251  486:aload           4
	//  252  488:invokevirtual   #115 <Method Class JavaType.getRawClass()>
	//  253  491:astore          6
		if(!((Class) (mapperconfig)).isAssignableFrom(((Class) (obj1))))
			break MISSING_BLOCK_LABEL_518;
	//  254  493:aload_1         
	//  255  494:aload           6
	//  256  496:invokevirtual   #1043 <Method boolean Class.isAssignableFrom(Class)>
	//  257  499:ifeq            518
		obj = ((Object) (typefactory.constructGeneralizedType(((JavaType) (obj)), ((Class) (mapperconfig)))));
	//  258  502:aload           5
	//  259  504:aload           4
	//  260  506:aload_1         
	//  261  507:invokevirtual   #1046 <Method JavaType TypeFactory.constructGeneralizedType(JavaType, Class)>
	//  262  510:astore          4
		mapperconfig = ((MapperConfig) (obj));
	//  263  512:aload           4
	//  264  514:astore_1        
		break MISSING_BLOCK_LABEL_563;
	//  265  515:goto            563
		if(!((Class) (obj1)).isAssignableFrom(((Class) (mapperconfig))))
			break MISSING_BLOCK_LABEL_543;
	//  266  518:aload           6
	//  267  520:aload_1         
	//  268  521:invokevirtual   #1043 <Method boolean Class.isAssignableFrom(Class)>
	//  269  524:ifeq            543
		obj = ((Object) (typefactory.constructSpecializedType(((JavaType) (obj)), ((Class) (mapperconfig)))));
	//  270  527:aload           5
	//  271  529:aload           4
	//  272  531:aload_1         
	//  273  532:invokevirtual   #994 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//  274  535:astore          4
		mapperconfig = ((MapperConfig) (obj));
	//  275  537:aload           4
	//  276  539:astore_1        
		break MISSING_BLOCK_LABEL_563;
	//  277  540:goto            563
		if(!_primitiveAndWrapper(((Class) (obj1)), ((Class) (mapperconfig))))
			break MISSING_BLOCK_LABEL_569;
	//  278  543:aload_0         
	//  279  544:aload           6
	//  280  546:aload_1         
	//  281  547:invokespecial   #1048 <Method boolean _primitiveAndWrapper(Class, Class)>
	//  282  550:ifeq            569
		obj = ((Object) (((JavaType) (obj)).withStaticTyping()));
	//  283  553:aload           4
	//  284  555:invokevirtual   #1040 <Method JavaType JavaType.withStaticTyping()>
	//  285  558:astore          4
		mapperconfig = ((MapperConfig) (obj));
	//  286  560:aload           4
	//  287  562:astore_1        
		return javatype.withContentType(((JavaType) (mapperconfig)));
	//  288  563:aload_3         
	//  289  564:aload_1         
	//  290  565:invokevirtual   #1031 <Method JavaType JavaType.withContentType(JavaType)>
	//  291  568:areturn         
		try
		{
			throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Cannot refine serialization content type %s into %s; types not related", new Object[] {
				obj, ((Class) (mapperconfig)).getName()
			}));
	//  292  569:new             #979 <Class JsonMappingException>
	//  293  572:dup             
	//  294  573:aconst_null     
	//  295  574:ldc2            #1063 <String "Cannot refine serialization content type %s into %s; types not related">
	//  296  577:iconst_2        
	//  297  578:anewarray       Object[]
	//  298  581:dup             
	//  299  582:iconst_0        
	//  300  583:aload           4
	//  301  585:aastore         
	//  302  586:dup             
	//  303  587:iconst_1        
	//  304  588:aload_1         
	//  305  589:invokevirtual   #594 <Method String Class.getName()>
	//  306  592:aastore         
	//  307  593:invokestatic    #1004 <Method String String.format(String, Object[])>
	//  308  596:invokespecial   #1053 <Method void JsonMappingException(java.io.Closeable, String)>
	//  309  599:athrow          
		}
		catch(IllegalArgumentException illegalargumentexception)
	//* 310  600:astore          4
		{
			throw new JsonMappingException(((java.io.Closeable) (null)), String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", new Object[] {
				javatype, ((Class) (mapperconfig)).getName(), annotated.getName(), illegalargumentexception.getMessage()
			}), ((Throwable) (illegalargumentexception)));
	//  311  602:new             #979 <Class JsonMappingException>
	//  312  605:dup             
	//  313  606:aconst_null     
	//  314  607:ldc2            #1065 <String "Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s">
	//  315  610:iconst_4        
	//  316  611:anewarray       Object[]
	//  317  614:dup             
	//  318  615:iconst_0        
	//  319  616:aload_3         
	//  320  617:aastore         
	//  321  618:dup             
	//  322  619:iconst_1        
	//  323  620:aload_1         
	//  324  621:invokevirtual   #594 <Method String Class.getName()>
	//  325  624:aastore         
	//  326  625:dup             
	//  327  626:iconst_2        
	//  328  627:aload_2         
	//  329  628:invokevirtual   #997 <Method String Annotated.getName()>
	//  330  631:aastore         
	//  331  632:dup             
	//  332  633:iconst_3        
	//  333  634:aload           4
	//  334  636:invokevirtual   #1000 <Method String IllegalArgumentException.getMessage()>
	//  335  639:aastore         
	//  336  640:invokestatic    #1004 <Method String String.format(String, Object[])>
	//  337  643:aload           4
	//  338  645:invokespecial   #1007 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//  339  648:athrow          
		}
		return javatype;
	//  340  649:aload_3         
	//  341  650:areturn         
	}

	public AnnotatedMethod resolveSetterConflict(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, AnnotatedMethod annotatedmethod1)
	{
		mapperconfig = ((MapperConfig) (annotatedmethod.getRawParameterType(0)));
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #601 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//    3    5:astore_1        
		Class class1 = annotatedmethod1.getRawParameterType(0);
	//    4    6:aload_3         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #601 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//    7   11:astore          4
		if(((Class) (mapperconfig)).isPrimitive())
	//*   8   13:aload_1         
	//*   9   14:invokevirtual   #111 <Method boolean Class.isPrimitive()>
	//*  10   17:ifeq            30
		{
			if(!class1.isPrimitive())
	//*  11   20:aload           4
	//*  12   22:invokevirtual   #111 <Method boolean Class.isPrimitive()>
	//*  13   25:ifne            40
				return annotatedmethod;
	//   14   28:aload_2         
	//   15   29:areturn         
		} else
		if(class1.isPrimitive())
	//*  16   30:aload           4
	//*  17   32:invokevirtual   #111 <Method boolean Class.isPrimitive()>
	//*  18   35:ifeq            40
			return annotatedmethod1;
	//   19   38:aload_3         
	//   20   39:areturn         
		if(mapperconfig == java/lang/String)
	//*  21   40:aload_1         
	//*  22   41:ldc2            #399 <Class String>
	//*  23   44:if_acmpne       57
		{
			if(class1 != java/lang/String)
	//*  24   47:aload           4
	//*  25   49:ldc2            #399 <Class String>
	//*  26   52:if_acmpeq       67
				return annotatedmethod;
	//   27   55:aload_2         
	//   28   56:areturn         
		} else
		if(class1 == java/lang/String)
	//*  29   57:aload           4
	//*  30   59:ldc2            #399 <Class String>
	//*  31   62:if_acmpne       67
			return annotatedmethod1;
	//   32   65:aload_3         
	//   33   66:areturn         
		return null;
	//   34   67:aconst_null     
	//   35   68:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #1076 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	private static final Class ANNOTATIONS_TO_INFER_DESER[] = (Class[])(new Class[] {
		com/fasterxml/jackson/databind/annotation/JsonDeserialize, com/fasterxml/jackson/annotation/JsonView, com/fasterxml/jackson/annotation/JsonFormat, com/fasterxml/jackson/annotation/JsonTypeInfo, com/fasterxml/jackson/annotation/JsonUnwrapped, com/fasterxml/jackson/annotation/JsonBackReference, com/fasterxml/jackson/annotation/JsonManagedReference, com/fasterxml/jackson/annotation/JsonMerge
	});
	private static final Class ANNOTATIONS_TO_INFER_SER[] = (Class[])(new Class[] {
		com/fasterxml/jackson/databind/annotation/JsonSerialize, com/fasterxml/jackson/annotation/JsonView, com/fasterxml/jackson/annotation/JsonFormat, com/fasterxml/jackson/annotation/JsonTypeInfo, com/fasterxml/jackson/annotation/JsonRawValue, com/fasterxml/jackson/annotation/JsonUnwrapped, com/fasterxml/jackson/annotation/JsonBackReference, com/fasterxml/jackson/annotation/JsonManagedReference
	});
	private static final Java7Support _java7Helper;
	private static final long serialVersionUID = 1L;
	protected transient LRUMap _annotationsInside;
	protected boolean _cfgConstructorPropertiesImpliesCreator;

	static 
	{
		Throwable throwable;
	//    0    0:bipush          8
	//    1    2:anewarray       Class[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #31  <Class JsonSerialize>
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #33  <Class JsonView>
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #35  <Class JsonFormat>
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #37  <Class JsonTypeInfo>
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #39  <Class JsonRawValue>
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #41  <Class JsonUnwrapped>
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #43  <Class JsonBackReference>
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #45  <Class JsonManagedReference>
	//   33   46:aastore         
	//   34   47:checkcast       #46  <Class Class[]>
	//   35   50:putstatic       #48  <Field Class[] ANNOTATIONS_TO_INFER_SER>
	//   36   53:bipush          8
	//   37   55:anewarray       Class[]
	//   38   58:dup             
	//   39   59:iconst_0        
	//   40   60:ldc1            #50  <Class JsonDeserialize>
	//   41   62:aastore         
	//   42   63:dup             
	//   43   64:iconst_1        
	//   44   65:ldc1            #33  <Class JsonView>
	//   45   67:aastore         
	//   46   68:dup             
	//   47   69:iconst_2        
	//   48   70:ldc1            #35  <Class JsonFormat>
	//   49   72:aastore         
	//   50   73:dup             
	//   51   74:iconst_3        
	//   52   75:ldc1            #37  <Class JsonTypeInfo>
	//   53   77:aastore         
	//   54   78:dup             
	//   55   79:iconst_4        
	//   56   80:ldc1            #41  <Class JsonUnwrapped>
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:iconst_5        
	//   60   85:ldc1            #43  <Class JsonBackReference>
	//   61   87:aastore         
	//   62   88:dup             
	//   63   89:bipush          6
	//   64   91:ldc1            #45  <Class JsonManagedReference>
	//   65   93:aastore         
	//   66   94:dup             
	//   67   95:bipush          7
	//   68   97:ldc1            #52  <Class JsonMerge>
	//   69   99:aastore         
	//   70  100:checkcast       #46  <Class Class[]>
	//   71  103:putstatic       #54  <Field Class[] ANNOTATIONS_TO_INFER_DESER>
		Java7Support java7support;
		try
		{
			java7support = Java7Support.instance();
	//   72  106:invokestatic    #60  <Method Java7Support Java7Support.instance()>
	//   73  109:astore_0        
		}
	//*  74  110:goto            115
	//*  75  113:aconst_null     
	//*  76  114:astore_0        
	//*  77  115:aload_0         
	//*  78  116:putstatic       #62  <Field Java7Support _java7Helper>
	//*  79  119:return          
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			java7support = null;
		}
		_java7Helper = java7support;
	//*  80  120:astore_0        
	//*  81  121:goto            113
	}
}
