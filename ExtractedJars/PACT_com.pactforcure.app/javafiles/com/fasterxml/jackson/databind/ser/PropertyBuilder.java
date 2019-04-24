// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BeanPropertyWriter

public class PropertyBuilder
{

	public PropertyBuilder(SerializationConfig serializationconfig, BeanDescription beandescription)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		_config = serializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field SerializationConfig _config>
		_beanDesc = beandescription;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field BeanDescription _beanDesc>
		_defaultInclusion = beandescription.findPropertyInclusion(serializationconfig.getDefaultPropertyInclusion());
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #42  <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializationConfig.getDefaultPropertyInclusion()>
	//   12   20:invokevirtual   #48  <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanDescription.findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   13   23:putfield        #50  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _defaultInclusion>
		_annotationIntrospector = _config.getAnnotationIntrospector();
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #34  <Field SerializationConfig _config>
	//   17   31:invokevirtual   #54  <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//   18   34:putfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   19   37:return          
	}

	protected Object _throwWrapped(Exception exception, String s, Object obj)
	{
		for(; ((Throwable) (exception)).getCause() != null; exception = ((Exception) (((Throwable) (exception)).getCause())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #64  <Method Throwable Throwable.getCause()>
	//    2    4:ifnull          15
	//    3    7:aload_1         
	//    4    8:invokevirtual   #64  <Method Throwable Throwable.getCause()>
	//    5   11:astore_1        
	//*   6   12:goto            0
		if(exception instanceof Error)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #66  <Class Error>
	//*   9   19:ifeq            27
			throw (Error)exception;
	//   10   22:aload_1         
	//   11   23:checkcast       #66  <Class Error>
	//   12   26:athrow          
		if(exception instanceof RuntimeException)
	//*  13   27:aload_1         
	//*  14   28:instanceof      #68  <Class RuntimeException>
	//*  15   31:ifeq            39
			throw (RuntimeException)exception;
	//   16   34:aload_1         
	//   17   35:checkcast       #68  <Class RuntimeException>
	//   18   38:athrow          
		else
			throw new IllegalArgumentException((new StringBuilder()).append("Failed to get property '").append(s).append("' of default ").append(obj.getClass().getName()).append(" instance").toString());
	//   19   39:new             #70  <Class IllegalArgumentException>
	//   20   42:dup             
	//   21   43:new             #72  <Class StringBuilder>
	//   22   46:dup             
	//   23   47:invokespecial   #73  <Method void StringBuilder()>
	//   24   50:ldc1            #75  <String "Failed to get property '">
	//   25   52:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:aload_2         
	//   27   56:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   28   59:ldc1            #81  <String "' of default ">
	//   29   61:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   30   64:aload_3         
	//   31   65:invokevirtual   #85  <Method Class Object.getClass()>
	//   32   68:invokevirtual   #91  <Method String Class.getName()>
	//   33   71:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   34   74:ldc1            #93  <String " instance">
	//   35   76:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   36   79:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   37   82:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//   38   85:athrow          
	}

	protected BeanPropertyWriter buildWriter(SerializerProvider serializerprovider, BeanPropertyDefinition beanpropertydefinition, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, TypeSerializer typeserializer1, AnnotatedMember annotatedmember, 
			boolean flag)
		throws JsonMappingException
	{
		boolean flag1;
		JavaType javatype1;
		Object obj;
		obj = ((Object) (findSerializationType(((Annotated) (annotatedmember)), flag, javatype)));
	//    0    0:aload_0         
	//    1    1:aload           7
	//    2    3:iload           8
	//    3    5:aload_3         
	//    4    6:invokevirtual   #107 <Method JavaType findSerializationType(Annotated, boolean, JavaType)>
	//    5    9:astore          11
		javatype1 = ((JavaType) (obj));
	//    6   11:aload           11
	//    7   13:astore          10
		if(typeserializer1 != null)
	//*   8   15:aload           6
	//*   9   17:ifnull          115
		{
			javatype1 = ((JavaType) (obj));
	//   10   20:aload           11
	//   11   22:astore          10
			if(obj == null)
	//*  12   24:aload           11
	//*  13   26:ifnonnull       32
				javatype1 = javatype;
	//   14   29:aload_3         
	//   15   30:astore          10
			if(javatype1.getContentType() == null)
	//*  16   32:aload           10
	//*  17   34:invokevirtual   #113 <Method JavaType JavaType.getContentType()>
	//*  18   37:ifnonnull       100
				throw new IllegalStateException((new StringBuilder()).append("Problem trying to create BeanPropertyWriter for property '").append(beanpropertydefinition.getName()).append("' (of type ").append(((Object) (_beanDesc.getType()))).append("); serialization type ").append(((Object) (javatype1))).append(" has no content").toString());
	//   19   40:new             #115 <Class IllegalStateException>
	//   20   43:dup             
	//   21   44:new             #72  <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #73  <Method void StringBuilder()>
	//   24   51:ldc1            #117 <String "Problem trying to create BeanPropertyWriter for property '">
	//   25   53:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   26   56:aload_2         
	//   27   57:invokevirtual   #120 <Method String BeanPropertyDefinition.getName()>
	//   28   60:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:ldc1            #122 <String "' (of type ">
	//   30   65:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   31   68:aload_0         
	//   32   69:getfield        #36  <Field BeanDescription _beanDesc>
	//   33   72:invokevirtual   #125 <Method JavaType BeanDescription.getType()>
	//   34   75:invokevirtual   #128 <Method StringBuilder StringBuilder.append(Object)>
	//   35   78:ldc1            #130 <String "); serialization type ">
	//   36   80:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   37   83:aload           10
	//   38   85:invokevirtual   #128 <Method StringBuilder StringBuilder.append(Object)>
	//   39   88:ldc1            #132 <String " has no content">
	//   40   90:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//   41   93:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   42   96:invokespecial   #133 <Method void IllegalStateException(String)>
	//   43   99:athrow          
			javatype1 = javatype1.withContentTypeHandler(((Object) (typeserializer1)));
	//   44  100:aload           10
	//   45  102:aload           6
	//   46  104:invokevirtual   #137 <Method JavaType JavaType.withContentTypeHandler(Object)>
	//   47  107:astore          10
			javatype1.getContentType();
	//   48  109:aload           10
	//   49  111:invokevirtual   #113 <Method JavaType JavaType.getContentType()>
	//   50  114:pop             
		}
		obj = null;
	//   51  115:aconst_null     
	//   52  116:astore          11
		flag1 = false;
	//   53  118:iconst_0        
	//   54  119:istore          9
		flag = false;
	//   55  121:iconst_0        
	//   56  122:istore          8
		com.fasterxml.jackson.annotation.JsonInclude.Include include = _defaultInclusion.withOverrides(beanpropertydefinition.findInclusion()).getValueInclusion();
	//   57  124:aload_0         
	//   58  125:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _defaultInclusion>
	//   59  128:aload_2         
	//   60  129:invokevirtual   #140 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanPropertyDefinition.findInclusion()>
	//   61  132:invokevirtual   #145 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   62  135:invokevirtual   #149 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//   63  138:astore          12
		typeserializer1 = ((TypeSerializer) (include));
	//   64  140:aload           12
	//   65  142:astore          6
		if(include == com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*  66  144:aload           12
	//*  67  146:getstatic       #155 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  68  149:if_acmpne       157
			typeserializer1 = ((TypeSerializer) (com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS));
	//   69  152:getstatic       #158 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//   70  155:astore          6
		static class _cls1
		{

			static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[];

			static 
			{
				$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[com.fasterxml.jackson.annotation.JsonInclude.Include.values().length];
			//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.annotation.JsonInclude$Include[] com.fasterxml.jackson.annotation.JsonInclude$Include.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
			//    5   12:getstatic       #24  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
			//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
			//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_ABSENT>
			//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
			//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
			//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
			//*  20   45:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
			//*  21   48:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
			//*  25   56:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
			//*  26   59:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
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
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  39   80:goto            20
			}
		}

		_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Include) (typeserializer1)).ordinal()];
	//   71  157:getstatic       #162 <Field int[] PropertyBuilder$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//   72  160:aload           6
	//   73  162:invokevirtual   #166 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//   74  165:iaload          
		JVM INSTR tableswitch 1 4: default 196
	//	               1 323
	//	               2 424
	//	               3 454
	//	               4 465;
	//   75  166:tableswitch     1 4: default 196
	//	               1 323
	//	               2 424
	//	               3 454
	//	               4 465
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		flag1 = flag;
	//   76  196:iload           8
	//   77  198:istore          9
_L8:
		flag = flag1;
	//   78  200:iload           9
	//   79  202:istore          8
		typeserializer1 = ((TypeSerializer) (obj));
	//   80  204:aload           11
	//   81  206:astore          6
		if(javatype.isContainerType())
	//*  82  208:aload_3         
	//*  83  209:invokevirtual   #170 <Method boolean JavaType.isContainerType()>
	//*  84  212:ifeq            245
		{
			flag = flag1;
	//   85  215:iload           9
	//   86  217:istore          8
			typeserializer1 = ((TypeSerializer) (obj));
	//   87  219:aload           11
	//   88  221:astore          6
			if(!_config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS))
	//*  89  223:aload_0         
	//*  90  224:getfield        #34  <Field SerializationConfig _config>
	//*  91  227:getstatic       #176 <Field SerializationFeature SerializationFeature.WRITE_EMPTY_JSON_ARRAYS>
	//*  92  230:invokevirtual   #180 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  93  233:ifne            245
			{
				typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
	//   94  236:getstatic       #185 <Field Object BeanPropertyWriter.MARKER_FOR_EMPTY>
	//   95  239:astore          6
				flag = flag1;
	//   96  241:iload           9
	//   97  243:istore          8
			}
		}
_L6:
		beanpropertydefinition = ((BeanPropertyDefinition) (new BeanPropertyWriter(beanpropertydefinition, annotatedmember, _beanDesc.getClassAnnotations(), javatype, jsonserializer, typeserializer, javatype1, flag, ((Object) (typeserializer1)))));
	//   98  245:new             #182 <Class BeanPropertyWriter>
	//   99  248:dup             
	//  100  249:aload_2         
	//  101  250:aload           7
	//  102  252:aload_0         
	//  103  253:getfield        #36  <Field BeanDescription _beanDesc>
	//  104  256:invokevirtual   #189 <Method Annotations BeanDescription.getClassAnnotations()>
	//  105  259:aload_3         
	//  106  260:aload           4
	//  107  262:aload           5
	//  108  264:aload           10
	//  109  266:iload           8
	//  110  268:aload           6
	//  111  270:invokespecial   #192 <Method void BeanPropertyWriter(BeanPropertyDefinition, AnnotatedMember, Annotations, JavaType, JsonSerializer, TypeSerializer, JavaType, boolean, Object)>
	//  112  273:astore_2        
		javatype = ((JavaType) (_annotationIntrospector.findNullSerializer(((Annotated) (annotatedmember)))));
	//  113  274:aload_0         
	//  114  275:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//  115  278:aload           7
	//  116  280:invokevirtual   #198 <Method Object AnnotationIntrospector.findNullSerializer(Annotated)>
	//  117  283:astore_3        
		if(javatype != null)
	//* 118  284:aload_3         
	//* 119  285:ifnull          299
			((BeanPropertyWriter) (beanpropertydefinition)).assignNullSerializer(serializerprovider.serializerInstance(((Annotated) (annotatedmember)), ((Object) (javatype))));
	//  120  288:aload_2         
	//  121  289:aload_1         
	//  122  290:aload           7
	//  123  292:aload_3         
	//  124  293:invokevirtual   #204 <Method JsonSerializer SerializerProvider.serializerInstance(Annotated, Object)>
	//  125  296:invokevirtual   #208 <Method void BeanPropertyWriter.assignNullSerializer(JsonSerializer)>
		javatype = ((JavaType) (_annotationIntrospector.findUnwrappingNameTransformer(annotatedmember)));
	//  126  299:aload_0         
	//  127  300:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//  128  303:aload           7
	//  129  305:invokevirtual   #212 <Method com.fasterxml.jackson.databind.util.NameTransformer AnnotationIntrospector.findUnwrappingNameTransformer(AnnotatedMember)>
	//  130  308:astore_3        
		serializerprovider = ((SerializerProvider) (beanpropertydefinition));
	//  131  309:aload_2         
	//  132  310:astore_1        
		if(javatype != null)
	//* 133  311:aload_3         
	//* 134  312:ifnull          321
			serializerprovider = ((SerializerProvider) (((BeanPropertyWriter) (beanpropertydefinition)).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer) (javatype)))));
	//  135  315:aload_2         
	//  136  316:aload_3         
	//  137  317:invokevirtual   #216 <Method BeanPropertyWriter BeanPropertyWriter.unwrappingWriter(com.fasterxml.jackson.databind.util.NameTransformer)>
	//  138  320:astore_1        
		return ((BeanPropertyWriter) (serializerprovider));
	//  139  321:aload_1         
	//  140  322:areturn         
_L2:
		if(javatype1 == null)
	//* 141  323:aload           10
	//* 142  325:ifnonnull       373
			typeserializer1 = ((TypeSerializer) (javatype));
	//  143  328:aload_3         
	//  144  329:astore          6
		else
	//* 145  331:aload_0         
	//* 146  332:getfield        #50  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _defaultInclusion>
	//* 147  335:invokevirtual   #149 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//* 148  338:getstatic       #219 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
	//* 149  341:if_acmpne       380
	//* 150  344:aload_0         
	//* 151  345:aload_2         
	//* 152  346:invokevirtual   #120 <Method String BeanPropertyDefinition.getName()>
	//* 153  349:aload           7
	//* 154  351:aload           6
	//* 155  353:invokevirtual   #223 <Method Object getPropertyDefaultValue(String, AnnotatedMember, JavaType)>
	//* 156  356:astore          11
	//* 157  358:aload           11
	//* 158  360:ifnonnull       391
	//* 159  363:iconst_1        
	//* 160  364:istore          8
	//* 161  366:aload           11
	//* 162  368:astore          6
	//* 163  370:goto            245
			typeserializer1 = ((TypeSerializer) (javatype1));
	//  164  373:aload           10
	//  165  375:astore          6
		if(_defaultInclusion.getValueInclusion() == com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT)
			obj = getPropertyDefaultValue(beanpropertydefinition.getName(), annotatedmember, ((JavaType) (typeserializer1)));
		else
	//* 166  377:goto            331
			obj = getDefaultValue(((JavaType) (typeserializer1)));
	//  167  380:aload_0         
	//  168  381:aload           6
	//  169  383:invokevirtual   #227 <Method Object getDefaultValue(JavaType)>
	//  170  386:astore          11
		if(obj == null)
		{
			flag = true;
			typeserializer1 = ((TypeSerializer) (obj));
		} else
	//* 171  388:goto            358
		{
			flag = flag1;
	//  172  391:iload           9
	//  173  393:istore          8
			typeserializer1 = ((TypeSerializer) (obj));
	//  174  395:aload           11
	//  175  397:astore          6
			if(obj.getClass().isArray())
	//* 176  399:aload           11
	//* 177  401:invokevirtual   #85  <Method Class Object.getClass()>
	//* 178  404:invokevirtual   #230 <Method boolean Class.isArray()>
	//* 179  407:ifeq            245
			{
				typeserializer1 = ((TypeSerializer) (ArrayBuilders.getArrayComparator(obj)));
	//  180  410:aload           11
	//  181  412:invokestatic    #236 <Method Object ArrayBuilders.getArrayComparator(Object)>
	//  182  415:astore          6
				flag = flag1;
	//  183  417:iload           9
	//  184  419:istore          8
			}
		}
		continue; /* Loop/switch isn't completed */
	//  185  421:goto            245
_L3:
		flag1 = true;
	//  186  424:iconst_1        
	//  187  425:istore          9
		flag = flag1;
	//  188  427:iload           9
	//  189  429:istore          8
		typeserializer1 = ((TypeSerializer) (obj));
	//  190  431:aload           11
	//  191  433:astore          6
		if(javatype.isReferenceType())
	//* 192  435:aload_3         
	//* 193  436:invokevirtual   #239 <Method boolean JavaType.isReferenceType()>
	//* 194  439:ifeq            245
		{
			typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
	//  195  442:getstatic       #185 <Field Object BeanPropertyWriter.MARKER_FOR_EMPTY>
	//  196  445:astore          6
			flag = flag1;
	//  197  447:iload           9
	//  198  449:istore          8
		}
		continue; /* Loop/switch isn't completed */
	//  199  451:goto            245
_L4:
		flag = true;
	//  200  454:iconst_1        
	//  201  455:istore          8
		typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
	//  202  457:getstatic       #185 <Field Object BeanPropertyWriter.MARKER_FOR_EMPTY>
	//  203  460:astore          6
		if(true) goto _L6; else goto _L5
	//  204  462:goto            245
_L5:
		flag1 = true;
	//  205  465:iconst_1        
	//  206  466:istore          9
		if(true) goto _L8; else goto _L7
	//  207  468:goto            200
_L7:
	}

	protected JavaType findSerializationType(Annotated annotated, boolean flag, JavaType javatype)
		throws JsonMappingException
	{
		Object obj;
		JavaType javatype1;
		javatype1 = _annotationIntrospector.refineSerializationType(((com.fasterxml.jackson.databind.cfg.MapperConfig) (_config)), annotated, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:aload_0         
	//    3    5:getfield        #34  <Field SerializationConfig _config>
	//    4    8:aload_1         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #246 <Method JavaType AnnotationIntrospector.refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, Annotated, JavaType)>
	//    7   13:astore          6
		obj = ((Object) (javatype));
	//    8   15:aload_3         
	//    9   16:astore          5
		if(javatype1 == javatype) goto _L2; else goto _L1
	//   10   18:aload           6
	//   11   20:aload_3         
	//   12   21:if_acmpeq       51
_L1:
		obj = ((Object) (javatype1.getRawClass()));
	//   13   24:aload           6
	//   14   26:invokevirtual   #249 <Method Class JavaType.getRawClass()>
	//   15   29:astore          5
		javatype = ((JavaType) (javatype.getRawClass()));
	//   16   31:aload_3         
	//   17   32:invokevirtual   #249 <Method Class JavaType.getRawClass()>
	//   18   35:astore_3        
		  goto _L3
	//*  19   36:aload           5
	//*  20   38:aload_3         
	//*  21   39:invokevirtual   #253 <Method boolean Class.isAssignableFrom(Class)>
	//*  22   42:ifeq            98
_L5:
		flag = true;
	//   23   45:iconst_1        
	//   24   46:istore_2        
		obj = ((Object) (javatype1));
	//   25   47:aload           6
	//   26   49:astore          5
_L2:
		annotated = ((Annotated) (_annotationIntrospector.findSerializationTyping(annotated)));
	//   27   51:aload_0         
	//   28   52:getfield        #56  <Field AnnotationIntrospector _annotationIntrospector>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #257 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(Annotated)>
	//   31   59:astore_1        
		boolean flag1 = flag;
	//   32   60:iload_2         
	//   33   61:istore          4
		if(annotated != null)
	//*  34   63:aload_1         
	//*  35   64:ifnull          87
		{
			flag1 = flag;
	//   36   67:iload_2         
	//   37   68:istore          4
			if(annotated != com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DEFAULT_TYPING)
	//*  38   70:aload_1         
	//*  39   71:getstatic       #263 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.DEFAULT_TYPING>
	//*  40   74:if_acmpeq       87
				if(annotated == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC)
	//*  41   77:aload_1         
	//*  42   78:getstatic       #266 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.STATIC>
	//*  43   81:if_acmpne       165
					flag1 = true;
	//   44   84:iconst_1        
	//   45   85:istore          4
				else
	//*  46   87:iload           4
	//*  47   89:ifeq            171
	//*  48   92:aload           5
	//*  49   94:invokevirtual   #269 <Method JavaType JavaType.withStaticTyping()>
	//*  50   97:areturn         
	//*  51   98:aload_3         
	//*  52   99:aload           5
	//*  53  101:invokevirtual   #253 <Method boolean Class.isAssignableFrom(Class)>
	//*  54  104:ifne            45
	//*  55  107:new             #70  <Class IllegalArgumentException>
	//*  56  110:dup             
	//*  57  111:new             #72  <Class StringBuilder>
	//*  58  114:dup             
	//*  59  115:invokespecial   #73  <Method void StringBuilder()>
	//*  60  118:ldc2            #271 <String "Illegal concrete-type annotation for method '">
	//*  61  121:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  62  124:aload_1         
	//*  63  125:invokevirtual   #274 <Method String Annotated.getName()>
	//*  64  128:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  65  131:ldc2            #276 <String "': class ">
	//*  66  134:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  67  137:aload           5
	//*  68  139:invokevirtual   #91  <Method String Class.getName()>
	//*  69  142:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  70  145:ldc2            #278 <String " not a super-type of (declared) class ">
	//*  71  148:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  72  151:aload_3         
	//*  73  152:invokevirtual   #91  <Method String Class.getName()>
	//*  74  155:invokevirtual   #79  <Method StringBuilder StringBuilder.append(String)>
	//*  75  158:invokevirtual   #96  <Method String StringBuilder.toString()>
	//*  76  161:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//*  77  164:athrow          
					flag1 = false;
	//   78  165:iconst_0        
	//   79  166:istore          4
		}
		if(flag1)
			return ((JavaType) (obj)).withStaticTyping();
		else
	//*  80  168:goto            87
			return null;
	//   81  171:aconst_null     
	//   82  172:areturn         
_L3:
		if(((Class) (obj)).isAssignableFrom(((Class) (javatype))) || ((Class) (javatype)).isAssignableFrom(((Class) (obj)))) goto _L5; else goto _L4
_L4:
		throw new IllegalArgumentException((new StringBuilder()).append("Illegal concrete-type annotation for method '").append(annotated.getName()).append("': class ").append(((Class) (obj)).getName()).append(" not a super-type of (declared) class ").append(((Class) (javatype)).getName()).toString());
	}

	public Annotations getClassAnnotations()
	{
		return _beanDesc.getClassAnnotations();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field BeanDescription _beanDesc>
	//    2    4:invokevirtual   #189 <Method Annotations BeanDescription.getClassAnnotations()>
	//    3    7:areturn         
	}

	protected Object getDefaultBean()
	{
		Object obj1 = _defaultBean;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field Object _defaultBean>
	//    2    4:astore_2        
		Object obj = obj1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(obj1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       41
		{
			Object obj2 = _beanDesc.instantiateBean(_config.canOverrideAccessModifiers());
	//    7   11:aload_0         
	//    8   12:getfield        #36  <Field BeanDescription _beanDesc>
	//    9   15:aload_0         
	//   10   16:getfield        #34  <Field SerializationConfig _config>
	//   11   19:invokevirtual   #285 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//   12   22:invokevirtual   #289 <Method Object BeanDescription.instantiateBean(boolean)>
	//   13   25:astore_2        
			obj = obj2;
	//   14   26:aload_2         
	//   15   27:astore_1        
			if(obj2 == null)
	//*  16   28:aload_2         
	//*  17   29:ifnonnull       36
				obj = NO_DEFAULT_MARKER;
	//   18   32:getstatic       #27  <Field Object NO_DEFAULT_MARKER>
	//   19   35:astore_1        
			_defaultBean = obj;
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:putfield        #282 <Field Object _defaultBean>
		}
		if(obj == NO_DEFAULT_MARKER)
	//*  23   41:aload_1         
	//*  24   42:getstatic       #27  <Field Object NO_DEFAULT_MARKER>
	//*  25   45:if_acmpne       50
			return ((Object) (null));
	//   26   48:aconst_null     
	//   27   49:areturn         
		else
			return _defaultBean;
	//   28   50:aload_0         
	//   29   51:getfield        #282 <Field Object _defaultBean>
	//   30   54:areturn         
	}

	protected Object getDefaultValue(JavaType javatype)
	{
		Class class1 = javatype.getRawClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #249 <Method Class JavaType.getRawClass()>
	//    2    4:astore_2        
		Class class2 = ClassUtil.primitiveType(class1);
	//    3    5:aload_2         
	//    4    6:invokestatic    #295 <Method Class ClassUtil.primitiveType(Class)>
	//    5    9:astore_3        
		if(class2 != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          19
			return ClassUtil.defaultValue(class2);
	//    8   14:aload_3         
	//    9   15:invokestatic    #299 <Method Object ClassUtil.defaultValue(Class)>
	//   10   18:areturn         
		if(javatype.isContainerType() || javatype.isReferenceType())
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #170 <Method boolean JavaType.isContainerType()>
	//*  13   23:ifne            33
	//*  14   26:aload_1         
	//*  15   27:invokevirtual   #239 <Method boolean JavaType.isReferenceType()>
	//*  16   30:ifeq            37
			return ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
	//   17   33:getstatic       #302 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//   18   36:areturn         
		if(class1 == java/lang/String)
	//*  19   37:aload_2         
	//*  20   38:ldc2            #304 <Class String>
	//*  21   41:if_acmpne       48
			return ((Object) (""));
	//   22   44:ldc2            #306 <String "">
	//   23   47:areturn         
		else
			return ((Object) (null));
	//   24   48:aconst_null     
	//   25   49:areturn         
	}

	protected Object getPropertyDefaultValue(String s, AnnotatedMember annotatedmember, JavaType javatype)
	{
		Object obj = getDefaultBean();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #310 <Method Object getDefaultBean()>
	//    2    4:astore          4
		if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       17
			return getDefaultValue(javatype);
	//    5   11:aload_0         
	//    6   12:aload_3         
	//    7   13:invokevirtual   #227 <Method Object getDefaultValue(JavaType)>
	//    8   16:areturn         
		try
		{
			annotatedmember = ((AnnotatedMember) (annotatedmember.getValue(obj)));
	//    9   17:aload_2         
	//   10   18:aload           4
	//   11   20:invokevirtual   #315 <Method Object AnnotatedMember.getValue(Object)>
	//   12   23:astore_2        
		}
	//*  13   24:aload_2         
	//*  14   25:areturn         
		// Misplaced declaration of an exception variable
		catch(AnnotatedMember annotatedmember)
	//*  15   26:astore_2        
		{
			return _throwWrapped(((Exception) (annotatedmember)), s, obj);
	//   16   27:aload_0         
	//   17   28:aload_2         
	//   18   29:aload_1         
	//   19   30:aload           4
	//   20   32:invokevirtual   #317 <Method Object _throwWrapped(Exception, String, Object)>
	//   21   35:areturn         
		}
		return ((Object) (annotatedmember));
	}

	private static final Object NO_DEFAULT_MARKER;
	protected final AnnotationIntrospector _annotationIntrospector;
	protected final BeanDescription _beanDesc;
	protected final SerializationConfig _config;
	protected Object _defaultBean;
	protected final com.fasterxml.jackson.annotation.JsonInclude.Value _defaultInclusion;

	static 
	{
		NO_DEFAULT_MARKER = ((Object) (Boolean.FALSE));
	//    0    0:getstatic       #25  <Field Boolean Boolean.FALSE>
	//    1    3:putstatic       #27  <Field Object NO_DEFAULT_MARKER>
	//*   2    6:return          
	}
}
