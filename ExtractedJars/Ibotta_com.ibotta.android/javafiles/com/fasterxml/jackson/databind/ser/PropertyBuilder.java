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
	//    1    1:invokespecial   #34  <Method void Object()>
		_config = serializationconfig;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field SerializationConfig _config>
		_beanDesc = beandescription;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #38  <Field BeanDescription _beanDesc>
		beandescription = ((BeanDescription) (com.fasterxml.jackson.annotation.JsonInclude.Value.merge(beandescription.findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value.empty()), serializationconfig.getDefaultPropertyInclusion(beandescription.getBeanClass(), com.fasterxml.jackson.annotation.JsonInclude.Value.empty()))));
	//    8   14:aload_2         
	//    9   15:invokestatic    #44  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//   10   18:invokevirtual   #50  <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanDescription.findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #54  <Method Class BeanDescription.getBeanClass()>
	//   14   26:invokestatic    #44  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//   15   29:invokevirtual   #60  <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializationConfig.getDefaultPropertyInclusion(Class, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   16   32:invokestatic    #64  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.merge(com.fasterxml.jackson.annotation.JsonInclude$Value, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   17   35:astore_2        
		_defaultInclusion = com.fasterxml.jackson.annotation.JsonInclude.Value.merge(serializationconfig.getDefaultPropertyInclusion(), ((com.fasterxml.jackson.annotation.JsonInclude.Value) (beandescription)));
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #66  <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializationConfig.getDefaultPropertyInclusion()>
	//   21   41:aload_2         
	//   22   42:invokestatic    #64  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.merge(com.fasterxml.jackson.annotation.JsonInclude$Value, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   23   45:putfield        #68  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _defaultInclusion>
		boolean flag;
		if(((com.fasterxml.jackson.annotation.JsonInclude.Value) (beandescription)).getValueInclusion() == com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT)
	//*  24   48:aload_2         
	//*  25   49:invokevirtual   #72  <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//*  26   52:getstatic       #78  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
	//*  27   55:if_acmpne       63
			flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_3        
		else
	//*  30   60:goto            65
			flag = false;
	//   31   63:iconst_0        
	//   32   64:istore_3        
		_useRealPropertyDefaults = flag;
	//   33   65:aload_0         
	//   34   66:iload_3         
	//   35   67:putfield        #80  <Field boolean _useRealPropertyDefaults>
		_annotationIntrospector = _config.getAnnotationIntrospector();
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:getfield        #36  <Field SerializationConfig _config>
	//   39   75:invokevirtual   #84  <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//   40   78:putfield        #86  <Field AnnotationIntrospector _annotationIntrospector>
	//   41   81:return          
	}

	protected Object _throwWrapped(Exception exception, String s, Object obj)
	{
		for(; ((Throwable) (exception)).getCause() != null; exception = ((Exception) (((Throwable) (exception)).getCause())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #94  <Method Throwable Throwable.getCause()>
	//    2    4:ifnull          15
	//    3    7:aload_1         
	//    4    8:invokevirtual   #94  <Method Throwable Throwable.getCause()>
	//    5   11:astore_1        
	//*   6   12:goto            0
		ClassUtil.throwIfError(((Throwable) (exception)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #100 <Method Throwable ClassUtil.throwIfError(Throwable)>
	//    9   19:pop             
		ClassUtil.throwIfRTE(((Throwable) (exception)));
	//   10   20:aload_1         
	//   11   21:invokestatic    #103 <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//   12   24:pop             
		exception = ((Exception) (new StringBuilder()));
	//   13   25:new             #105 <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #106 <Method void StringBuilder()>
	//   16   32:astore_1        
		((StringBuilder) (exception)).append("Failed to get property '");
	//   17   33:aload_1         
	//   18   34:ldc1            #108 <String "Failed to get property '">
	//   19   36:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
		((StringBuilder) (exception)).append(s);
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		((StringBuilder) (exception)).append("' of default ");
	//   25   46:aload_1         
	//   26   47:ldc1            #114 <String "' of default ">
	//   27   49:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   28   52:pop             
		((StringBuilder) (exception)).append(obj.getClass().getName());
	//   29   53:aload_1         
	//   30   54:aload_3         
	//   31   55:invokevirtual   #117 <Method Class Object.getClass()>
	//   32   58:invokevirtual   #123 <Method String Class.getName()>
	//   33   61:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
		((StringBuilder) (exception)).append(" instance");
	//   35   65:aload_1         
	//   36   66:ldc1            #125 <String " instance">
	//   37   68:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   38   71:pop             
		throw new IllegalArgumentException(((StringBuilder) (exception)).toString());
	//   39   72:new             #127 <Class IllegalArgumentException>
	//   40   75:dup             
	//   41   76:aload_1         
	//   42   77:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   43   80:invokespecial   #133 <Method void IllegalArgumentException(String)>
	//   44   83:athrow          
	}

	protected BeanPropertyWriter buildWriter(SerializerProvider serializerprovider, BeanPropertyDefinition beanpropertydefinition, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, TypeSerializer typeserializer1, AnnotatedMember annotatedmember, 
			boolean flag)
		throws JsonMappingException
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          10
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
			//*  20   45:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.CUSTOM>
			//*  21   48:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
			//*  25   56:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
			//*  26   59:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
			//*  30   67:getstatic       #43  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
			//*  31   70:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   35   77:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
				}
			//*  36   78:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   37   81:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
				}
			//*  38   82:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   39   85:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM.ordinal()] = 4;
				}
			//*  40   86:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   41   89:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL.ordinal()] = 5;
				}
			//*  42   90:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   43   93:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS.ordinal()] = 6;
				}
			//*  44   94:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   97:astore_0        
			//*  46   98:return          
			}
		}

		int i;
		Object obj;
		Object obj1;
		Class aclass[];
		Object obj3;
		com.fasterxml.jackson.annotation.JsonInclude.Include include;
		com.fasterxml.jackson.annotation.JsonInclude.Value value;
		try
		{
			obj1 = ((Object) (findSerializationType(((Annotated) (annotatedmember)), flag, javatype)));
	//    2    3:aload_0         
	//    3    4:aload           7
	//    4    6:iload           8
	//    5    8:aload_3         
	//    6    9:invokevirtual   #143 <Method JavaType findSerializationType(Annotated, boolean, JavaType)>
	//    7   12:astore          12
		}
	//*   8   14:aload           6
	//*   9   16:ifnull          113
	//*  10   19:aload           12
	//*  11   21:astore          11
	//*  12   23:aload           12
	//*  13   25:ifnonnull       31
	//*  14   28:aload_3         
	//*  15   29:astore          11
	//*  16   31:aload           11
	//*  17   33:invokevirtual   #149 <Method JavaType JavaType.getContentType()>
	//*  18   36:ifnonnull       95
	//*  19   39:aload_0         
	//*  20   40:getfield        #38  <Field BeanDescription _beanDesc>
	//*  21   43:astore          12
	//*  22   45:new             #105 <Class StringBuilder>
	//*  23   48:dup             
	//*  24   49:invokespecial   #106 <Method void StringBuilder()>
	//*  25   52:astore          13
	//*  26   54:aload           13
	//*  27   56:ldc1            #151 <String "serialization type ">
	//*  28   58:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//*  29   61:pop             
	//*  30   62:aload           13
	//*  31   64:aload           11
	//*  32   66:invokevirtual   #154 <Method StringBuilder StringBuilder.append(Object)>
	//*  33   69:pop             
	//*  34   70:aload           13
	//*  35   72:ldc1            #156 <String " has no content">
	//*  36   74:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//*  37   77:pop             
	//*  38   78:aload_1         
	//*  39   79:aload           12
	//*  40   81:aload_2         
	//*  41   82:aload           13
	//*  42   84:invokevirtual   #130 <Method String StringBuilder.toString()>
	//*  43   87:iconst_0        
	//*  44   88:anewarray       Object[]
	//*  45   91:invokevirtual   #162 <Method Object SerializerProvider.reportBadPropertyDefinition(BeanDescription, BeanPropertyDefinition, String, Object[])>
	//*  46   94:pop             
	//*  47   95:aload           11
	//*  48   97:aload           6
	//*  49   99:invokevirtual   #166 <Method JavaType JavaType.withContentTypeHandler(Object)>
	//*  50  102:astore          11
	//*  51  104:aload           11
	//*  52  106:invokevirtual   #149 <Method JavaType JavaType.getContentType()>
	//*  53  109:pop             
	//*  54  110:goto            117
	//*  55  113:aload           12
	//*  56  115:astore          11
	//*  57  117:aconst_null     
	//*  58  118:astore          13
	//*  59  120:aload           11
	//*  60  122:ifnonnull       131
	//*  61  125:aload_3         
	//*  62  126:astore          6
	//*  63  128:goto            135
	//*  64  131:aload           11
	//*  65  133:astore          6
	//*  66  135:aload_2         
	//*  67  136:invokevirtual   #172 <Method AnnotatedMember BeanPropertyDefinition.getAccessor()>
	//*  68  139:astore          12
	//*  69  141:aload           12
	//*  70  143:ifnonnull       165
	//*  71  146:aload_1         
	//*  72  147:aload_0         
	//*  73  148:getfield        #38  <Field BeanDescription _beanDesc>
	//*  74  151:aload_2         
	//*  75  152:ldc1            #174 <String "could not determine property type">
	//*  76  154:iconst_0        
	//*  77  155:anewarray       Object[]
	//*  78  158:invokevirtual   #162 <Method Object SerializerProvider.reportBadPropertyDefinition(BeanDescription, BeanPropertyDefinition, String, Object[])>
	//*  79  161:checkcast       #176 <Class BeanPropertyWriter>
	//*  80  164:areturn         
	//*  81  165:aload           12
	//*  82  167:invokevirtual   #181 <Method Class AnnotatedMember.getRawType()>
	//*  83  170:astore          12
	//*  84  172:aload_0         
	//*  85  173:getfield        #36  <Field SerializationConfig _config>
	//*  86  176:aload           6
	//*  87  178:invokevirtual   #184 <Method Class JavaType.getRawClass()>
	//*  88  181:aload           12
	//*  89  183:aload_0         
	//*  90  184:getfield        #68  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _defaultInclusion>
	//*  91  187:invokevirtual   #188 <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializationConfig.getDefaultInclusion(Class, Class, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//*  92  190:aload_2         
	//*  93  191:invokevirtual   #191 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanPropertyDefinition.findInclusion()>
	//*  94  194:invokevirtual   #194 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//*  95  197:astore          15
	//*  96  199:aload           15
	//*  97  201:invokevirtual   #72  <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//*  98  204:astore          14
	//*  99  206:aload           14
	//* 100  208:astore          12
	//* 101  210:aload           14
	//* 102  212:getstatic       #197 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//* 103  215:if_acmpne       223
	//* 104  218:getstatic       #200 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//* 105  221:astore          12
	//* 106  223:getstatic       #204 <Field int[] PropertyBuilder$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//* 107  226:aload           12
	//* 108  228:invokevirtual   #208 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//* 109  231:iaload          
	//* 110  232:istore          9
	//* 111  234:iconst_1        
	//* 112  235:istore          8
	//* 113  237:iload           9
	//* 114  239:tableswitch     1 5: default 272
	//	               1 351
	//	               2 323
	//	               3 312
	//	               4 278
	//	               5 481
	//* 115  272:iconst_0        
	//* 116  273:istore          8
	//* 117  275:goto            481
	//* 118  278:aload_1         
	//* 119  279:aload_2         
	//* 120  280:aload           15
	//* 121  282:invokevirtual   #211 <Method Class com.fasterxml.jackson.annotation.JsonInclude$Value.getValueFilter()>
	//* 122  285:invokevirtual   #215 <Method Object SerializerProvider.includeFilterInstance(BeanPropertyDefinition, Class)>
	//* 123  288:astore          6
	//* 124  290:aload           6
	//* 125  292:ifnonnull       301
	//* 126  295:iconst_1        
	//* 127  296:istore          8
	//* 128  298:goto            513
	//* 129  301:aload_1         
	//* 130  302:aload           6
	//* 131  304:invokevirtual   #219 <Method boolean SerializerProvider.includeFilterSuppressNulls(Object)>
	//* 132  307:istore          8
	//* 133  309:goto            513
	//* 134  312:getstatic       #222 <Field Object BeanPropertyWriter.MARKER_FOR_EMPTY>
	//* 135  315:astore          6
	//* 136  317:iconst_1        
	//* 137  318:istore          8
	//* 138  320:goto            513
	//* 139  323:aload           6
	//* 140  325:invokevirtual   #226 <Method boolean JavaType.isReferenceType()>
	//* 141  328:ifeq            342
	//* 142  331:getstatic       #222 <Field Object BeanPropertyWriter.MARKER_FOR_EMPTY>
	//* 143  334:astore          6
	//* 144  336:iconst_1        
	//* 145  337:istore          8
	//* 146  339:goto            513
	//* 147  342:aconst_null     
	//* 148  343:astore          6
	//* 149  345:iconst_1        
	//* 150  346:istore          8
	//* 151  348:goto            513
	//* 152  351:aload_0         
	//* 153  352:getfield        #80  <Field boolean _useRealPropertyDefaults>
	//* 154  355:ifeq            436
	//* 155  358:aload_0         
	//* 156  359:invokevirtual   #230 <Method Object getDefaultBean()>
	//* 157  362:astore          12
	//* 158  364:aload           12
	//* 159  366:ifnull          436
	//* 160  369:aload_1         
	//* 161  370:getstatic       #236 <Field MapperFeature MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS>
	//* 162  373:invokevirtual   #240 <Method boolean SerializerProvider.isEnabled(MapperFeature)>
	//* 163  376:ifeq            394
	//* 164  379:aload           7
	//* 165  381:aload_0         
	//* 166  382:getfield        #36  <Field SerializationConfig _config>
	//* 167  385:getstatic       #243 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//* 168  388:invokevirtual   #244 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//* 169  391:invokevirtual   #248 <Method void AnnotatedMember.fixAccess(boolean)>
	//* 170  394:aload           7
	//* 171  396:aload           12
	//* 172  398:invokevirtual   #252 <Method Object AnnotatedMember.getValue(Object)>
	//* 173  401:astore          6
	//* 174  403:iload           10
	//* 175  405:istore          8
	//* 176  407:goto            446
	//* 177  410:astore          6
	//* 178  412:aload_0         
	//* 179  413:aload           6
	//* 180  415:aload_2         
	//* 181  416:invokevirtual   #253 <Method String BeanPropertyDefinition.getName()>
	//* 182  419:aload           12
	//* 183  421:invokevirtual   #255 <Method Object _throwWrapped(Exception, String, Object)>
	//* 184  424:pop             
	//* 185  425:iload           10
	//* 186  427:istore          8
	//* 187  429:aload           13
	//* 188  431:astore          6
	//* 189  433:goto            446
	//* 190  436:aload           6
	//* 191  438:invokestatic    #261 <Method Object BeanUtil.getDefaultValue(JavaType)>
	//* 192  441:astore          6
	//* 193  443:iconst_1        
	//* 194  444:istore          8
	//* 195  446:aload           6
	//* 196  448:ifnonnull       457
	//* 197  451:iconst_1        
	//* 198  452:istore          8
	//* 199  454:goto            513
	//* 200  457:aload           6
	//* 201  459:invokevirtual   #117 <Method Class Object.getClass()>
	//* 202  462:invokevirtual   #264 <Method boolean Class.isArray()>
	//* 203  465:ifeq            478
	//* 204  468:aload           6
	//* 205  470:invokestatic    #269 <Method Object ArrayBuilders.getArrayComparator(Object)>
	//* 206  473:astore          6
	//* 207  475:goto            513
	//* 208  478:goto            513
	//* 209  481:aload           6
	//* 210  483:invokevirtual   #272 <Method boolean JavaType.isContainerType()>
	//* 211  486:ifeq            510
	//* 212  489:aload_0         
	//* 213  490:getfield        #36  <Field SerializationConfig _config>
	//* 214  493:getstatic       #278 <Field SerializationFeature SerializationFeature.WRITE_EMPTY_JSON_ARRAYS>
	//* 215  496:invokevirtual   #281 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//* 216  499:ifne            510
	//* 217  502:getstatic       #222 <Field Object BeanPropertyWriter.MARKER_FOR_EMPTY>
	//* 218  505:astore          6
	//* 219  507:goto            513
	//* 220  510:aconst_null     
	//* 221  511:astore          6
	//* 222  513:aload_2         
	//* 223  514:invokevirtual   #285 <Method Class[] BeanPropertyDefinition.findViews()>
	//* 224  517:astore          12
	//* 225  519:aload           12
	//* 226  521:ifnonnull       536
	//* 227  524:aload_0         
	//* 228  525:getfield        #38  <Field BeanDescription _beanDesc>
	//* 229  528:invokevirtual   #288 <Method Class[] BeanDescription.findDefaultViews()>
	//* 230  531:astore          12
	//* 231  533:goto            536
	//* 232  536:new             #176 <Class BeanPropertyWriter>
	//* 233  539:dup             
	//* 234  540:aload_2         
	//* 235  541:aload           7
	//* 236  543:aload_0         
	//* 237  544:getfield        #38  <Field BeanDescription _beanDesc>
	//* 238  547:invokevirtual   #292 <Method com.fasterxml.jackson.databind.util.Annotations BeanDescription.getClassAnnotations()>
	//* 239  550:aload_3         
	//* 240  551:aload           4
	//* 241  553:aload           5
	//* 242  555:aload           11
	//* 243  557:iload           8
	//* 244  559:aload           6
	//* 245  561:aload           12
	//* 246  563:invokespecial   #295 <Method void BeanPropertyWriter(BeanPropertyDefinition, AnnotatedMember, com.fasterxml.jackson.databind.util.Annotations, JavaType, JsonSerializer, TypeSerializer, JavaType, boolean, Object, Class[])>
	//* 247  566:astore_2        
	//* 248  567:aload_0         
	//* 249  568:getfield        #86  <Field AnnotationIntrospector _annotationIntrospector>
	//* 250  571:aload           7
	//* 251  573:invokevirtual   #301 <Method Object AnnotationIntrospector.findNullSerializer(Annotated)>
	//* 252  576:astore_3        
	//* 253  577:aload_3         
	//* 254  578:ifnull          592
	//* 255  581:aload_2         
	//* 256  582:aload_1         
	//* 257  583:aload           7
	//* 258  585:aload_3         
	//* 259  586:invokevirtual   #305 <Method JsonSerializer SerializerProvider.serializerInstance(Annotated, Object)>
	//* 260  589:invokevirtual   #309 <Method void BeanPropertyWriter.assignNullSerializer(JsonSerializer)>
	//* 261  592:aload_0         
	//* 262  593:getfield        #86  <Field AnnotationIntrospector _annotationIntrospector>
	//* 263  596:aload           7
	//* 264  598:invokevirtual   #313 <Method com.fasterxml.jackson.databind.util.NameTransformer AnnotationIntrospector.findUnwrappingNameTransformer(AnnotatedMember)>
	//* 265  601:astore_3        
	//* 266  602:aload_2         
	//* 267  603:astore_1        
	//* 268  604:aload_3         
	//* 269  605:ifnull          614
	//* 270  608:aload_2         
	//* 271  609:aload_3         
	//* 272  610:invokevirtual   #317 <Method BeanPropertyWriter BeanPropertyWriter.unwrappingWriter(com.fasterxml.jackson.databind.util.NameTransformer)>
	//* 273  613:astore_1        
	//* 274  614:aload_1         
	//* 275  615:areturn         
		// Misplaced declaration of an exception variable
		catch(JsonSerializer jsonserializer)
	//* 276  616:astore          4
		{
			if(beanpropertydefinition == null)
	//* 277  618:aload_2         
	//* 278  619:ifnonnull       636
				return (BeanPropertyWriter)serializerprovider.reportBadDefinition(javatype, ((JsonMappingException) (jsonserializer)).getMessage());
	//  279  622:aload_1         
	//  280  623:aload_3         
	//  281  624:aload           4
	//  282  626:invokevirtual   #320 <Method String JsonMappingException.getMessage()>
	//  283  629:invokevirtual   #324 <Method Object SerializerProvider.reportBadDefinition(JavaType, String)>
	//  284  632:checkcast       #176 <Class BeanPropertyWriter>
	//  285  635:areturn         
			else
				return (BeanPropertyWriter)serializerprovider.reportBadPropertyDefinition(_beanDesc, beanpropertydefinition, ((JsonMappingException) (jsonserializer)).getMessage(), new Object[0]);
	//  286  636:aload_1         
	//  287  637:aload_0         
	//  288  638:getfield        #38  <Field BeanDescription _beanDesc>
	//  289  641:aload_2         
	//  290  642:aload           4
	//  291  644:invokevirtual   #320 <Method String JsonMappingException.getMessage()>
	//  292  647:iconst_0        
	//  293  648:anewarray       Object[]
	//  294  651:invokevirtual   #162 <Method Object SerializerProvider.reportBadPropertyDefinition(BeanDescription, BeanPropertyDefinition, String, Object[])>
	//  295  654:checkcast       #176 <Class BeanPropertyWriter>
	//  296  657:areturn         
		}
		if(typeserializer1 != null)
		{
			obj = obj1;
			if(obj1 == null)
				obj = ((Object) (javatype));
			if(((JavaType) (obj)).getContentType() == null)
			{
				obj1 = ((Object) (_beanDesc));
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("serialization type ");
				stringbuilder.append(obj);
				stringbuilder.append(" has no content");
				serializerprovider.reportBadPropertyDefinition(((BeanDescription) (obj1)), beanpropertydefinition, stringbuilder.toString(), new Object[0]);
			}
			obj = ((Object) (((JavaType) (obj)).withContentTypeHandler(((Object) (typeserializer1)))));
			((JavaType) (obj)).getContentType();
		} else
		{
			obj = obj1;
		}
		obj3 = null;
		if(obj == null)
			typeserializer1 = ((TypeSerializer) (javatype));
		else
			typeserializer1 = ((TypeSerializer) (obj));
		obj1 = ((Object) (beanpropertydefinition.getAccessor()));
		if(obj1 == null)
			return (BeanPropertyWriter)serializerprovider.reportBadPropertyDefinition(_beanDesc, beanpropertydefinition, "could not determine property type", new Object[0]);
		obj1 = ((Object) (((AnnotatedMember) (obj1)).getRawType()));
		value = _config.getDefaultInclusion(((JavaType) (typeserializer1)).getRawClass(), ((Class) (obj1)), _defaultInclusion).withOverrides(beanpropertydefinition.findInclusion());
		include = value.getValueInclusion();
		obj1 = ((Object) (include));
		if(include == com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
			obj1 = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS));
		i = _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Include) (obj1)).ordinal()];
		flag = true;
		switch(i)
		{
		case 4: // '\004'
			typeserializer1 = ((TypeSerializer) (serializerprovider.includeFilterInstance(beanpropertydefinition, value.getValueFilter())));
			if(typeserializer1 == null)
				flag = true;
			else
				flag = serializerprovider.includeFilterSuppressNulls(((Object) (typeserializer1)));
			break;

		case 3: // '\003'
			typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
			flag = true;
			break;

		case 2: // '\002'
			if(((JavaType) (typeserializer1)).isReferenceType())
			{
				typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
				flag = true;
			} else
			{
				typeserializer1 = null;
				flag = true;
			}
			break;

		case 1: // '\001'
label0:
			{
				if(_useRealPropertyDefaults)
				{
					Object obj2 = getDefaultBean();
					if(obj2 != null)
					{
						if(serializerprovider.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS))
							annotatedmember.fixAccess(_config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
						try
						{
							typeserializer1 = ((TypeSerializer) (annotatedmember.getValue(obj2)));
						}
						// Misplaced declaration of an exception variable
						catch(TypeSerializer typeserializer1)
						{
							_throwWrapped(((Exception) (typeserializer1)), beanpropertydefinition.getName(), obj2);
							flag = flag1;
							typeserializer1 = ((TypeSerializer) (obj3));
							break label0;
						}
						flag = flag1;
						break label0;
					}
				}
				typeserializer1 = ((TypeSerializer) (BeanUtil.getDefaultValue(((JavaType) (typeserializer1)))));
				flag = true;
			}
			if(typeserializer1 == null)
			{
				flag = true;
				break;
			}
			if(((Object) (typeserializer1)).getClass().isArray())
				typeserializer1 = ((TypeSerializer) (ArrayBuilders.getArrayComparator(((Object) (typeserializer1)))));
			break;

		default:
			flag = false;
			// fall through

		case 5: // '\005'
			if(((JavaType) (typeserializer1)).isContainerType() && !_config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS))
				typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
			else
				typeserializer1 = null;
			break;
		}
		aclass = beanpropertydefinition.findViews();
		if(aclass == null)
			aclass = _beanDesc.findDefaultViews();
		beanpropertydefinition = ((BeanPropertyDefinition) (new BeanPropertyWriter(beanpropertydefinition, annotatedmember, _beanDesc.getClassAnnotations(), javatype, jsonserializer, typeserializer, ((JavaType) (obj)), flag, ((Object) (typeserializer1)), aclass)));
		javatype = ((JavaType) (_annotationIntrospector.findNullSerializer(((Annotated) (annotatedmember)))));
		if(javatype != null)
			((BeanPropertyWriter) (beanpropertydefinition)).assignNullSerializer(serializerprovider.serializerInstance(((Annotated) (annotatedmember)), ((Object) (javatype))));
		javatype = ((JavaType) (_annotationIntrospector.findUnwrappingNameTransformer(annotatedmember)));
		serializerprovider = ((SerializerProvider) (beanpropertydefinition));
		if(javatype != null)
			serializerprovider = ((SerializerProvider) (((BeanPropertyWriter) (beanpropertydefinition)).unwrappingWriter(((com.fasterxml.jackson.databind.util.NameTransformer) (javatype)))));
		return ((BeanPropertyWriter) (serializerprovider));
	}

	protected JavaType findSerializationType(Annotated annotated, boolean flag, JavaType javatype)
		throws JsonMappingException
	{
		JavaType javatype1 = _annotationIntrospector.refineSerializationType(((com.fasterxml.jackson.databind.cfg.MapperConfig) (_config)), annotated, javatype);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field SerializationConfig _config>
	//    4    8:aload_1         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #331 <Method JavaType AnnotationIntrospector.refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, Annotated, JavaType)>
	//    7   13:astore          6
		Object obj = ((Object) (javatype));
	//    8   15:aload_3         
	//    9   16:astore          5
		if(javatype1 != javatype)
	//*  10   18:aload           6
	//*  11   20:aload_3         
	//*  12   21:if_acmpeq       146
		{
			obj = ((Object) (javatype1.getRawClass()));
	//   13   24:aload           6
	//   14   26:invokevirtual   #184 <Method Class JavaType.getRawClass()>
	//   15   29:astore          5
			javatype = ((JavaType) (javatype.getRawClass()));
	//   16   31:aload_3         
	//   17   32:invokevirtual   #184 <Method Class JavaType.getRawClass()>
	//   18   35:astore_3        
			if(((Class) (obj)).isAssignableFrom(((Class) (javatype))) || ((Class) (javatype)).isAssignableFrom(((Class) (obj))))
	//*  19   36:aload           5
	//*  20   38:aload_3         
	//*  21   39:invokevirtual   #335 <Method boolean Class.isAssignableFrom(Class)>
	//*  22   42:ifeq            48
	//*  23   45:goto            57
	//*  24   48:aload_3         
	//*  25   49:aload           5
	//*  26   51:invokevirtual   #335 <Method boolean Class.isAssignableFrom(Class)>
	//*  27   54:ifeq            66
			{
				obj = ((Object) (javatype1));
	//   28   57:aload           6
	//   29   59:astore          5
				flag = true;
	//   30   61:iconst_1        
	//   31   62:istore_2        
			} else
	//*  32   63:goto            146
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   33   66:new             #105 <Class StringBuilder>
	//   34   69:dup             
	//   35   70:invokespecial   #106 <Method void StringBuilder()>
	//   36   73:astore          6
				stringbuilder.append("Illegal concrete-type annotation for method '");
	//   37   75:aload           6
	//   38   77:ldc2            #337 <String "Illegal concrete-type annotation for method '">
	//   39   80:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
				stringbuilder.append(annotated.getName());
	//   41   84:aload           6
	//   42   86:aload_1         
	//   43   87:invokevirtual   #340 <Method String Annotated.getName()>
	//   44   90:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   45   93:pop             
				stringbuilder.append("': class ");
	//   46   94:aload           6
	//   47   96:ldc2            #342 <String "': class ">
	//   48   99:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   49  102:pop             
				stringbuilder.append(((Class) (obj)).getName());
	//   50  103:aload           6
	//   51  105:aload           5
	//   52  107:invokevirtual   #123 <Method String Class.getName()>
	//   53  110:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   54  113:pop             
				stringbuilder.append(" not a super-type of (declared) class ");
	//   55  114:aload           6
	//   56  116:ldc2            #344 <String " not a super-type of (declared) class ">
	//   57  119:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   58  122:pop             
				stringbuilder.append(((Class) (javatype)).getName());
	//   59  123:aload           6
	//   60  125:aload_3         
	//   61  126:invokevirtual   #123 <Method String Class.getName()>
	//   62  129:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   63  132:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   64  133:new             #127 <Class IllegalArgumentException>
	//   65  136:dup             
	//   66  137:aload           6
	//   67  139:invokevirtual   #130 <Method String StringBuilder.toString()>
	//   68  142:invokespecial   #133 <Method void IllegalArgumentException(String)>
	//   69  145:athrow          
			}
		}
		annotated = ((Annotated) (_annotationIntrospector.findSerializationTyping(annotated)));
	//   70  146:aload_0         
	//   71  147:getfield        #86  <Field AnnotationIntrospector _annotationIntrospector>
	//   72  150:aload_1         
	//   73  151:invokevirtual   #348 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(Annotated)>
	//   74  154:astore_1        
		boolean flag1 = flag;
	//   75  155:iload_2         
	//   76  156:istore          4
		if(annotated != null)
	//*  77  158:aload_1         
	//*  78  159:ifnull          188
		{
			flag1 = flag;
	//   79  162:iload_2         
	//   80  163:istore          4
			if(annotated != com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DEFAULT_TYPING)
	//*  81  165:aload_1         
	//*  82  166:getstatic       #354 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.DEFAULT_TYPING>
	//*  83  169:if_acmpeq       188
				if(annotated == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC)
	//*  84  172:aload_1         
	//*  85  173:getstatic       #357 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.STATIC>
	//*  86  176:if_acmpne       185
					flag1 = true;
	//   87  179:iconst_1        
	//   88  180:istore          4
				else
	//*  89  182:goto            188
					flag1 = false;
	//   90  185:iconst_0        
	//   91  186:istore          4
		}
		if(flag1)
	//*  92  188:iload           4
	//*  93  190:ifeq            199
			return ((JavaType) (obj)).withStaticTyping();
	//   94  193:aload           5
	//   95  195:invokevirtual   #360 <Method JavaType JavaType.withStaticTyping()>
	//   96  198:areturn         
		else
			return null;
	//   97  199:aconst_null     
	//   98  200:areturn         
	}

	protected Object getDefaultBean()
	{
		Object obj1 = _defaultBean;
	//    0    0:aload_0         
	//    1    1:getfield        #362 <Field Object _defaultBean>
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
	//    8   12:getfield        #38  <Field BeanDescription _beanDesc>
	//    9   15:aload_0         
	//   10   16:getfield        #36  <Field SerializationConfig _config>
	//   11   19:invokevirtual   #365 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//   12   22:invokevirtual   #369 <Method Object BeanDescription.instantiateBean(boolean)>
	//   13   25:astore_2        
			obj = obj2;
	//   14   26:aload_2         
	//   15   27:astore_1        
			if(obj2 == null)
	//*  16   28:aload_2         
	//*  17   29:ifnonnull       36
				obj = NO_DEFAULT_MARKER;
	//   18   32:getstatic       #29  <Field Object NO_DEFAULT_MARKER>
	//   19   35:astore_1        
			_defaultBean = obj;
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:putfield        #362 <Field Object _defaultBean>
		}
		if(obj == NO_DEFAULT_MARKER)
	//*  23   41:aload_1         
	//*  24   42:getstatic       #29  <Field Object NO_DEFAULT_MARKER>
	//*  25   45:if_acmpne       50
			return ((Object) (null));
	//   26   48:aconst_null     
	//   27   49:areturn         
		else
			return _defaultBean;
	//   28   50:aload_0         
	//   29   51:getfield        #362 <Field Object _defaultBean>
	//   30   54:areturn         
	}

	private static final Object NO_DEFAULT_MARKER;
	protected final AnnotationIntrospector _annotationIntrospector;
	protected final BeanDescription _beanDesc;
	protected final SerializationConfig _config;
	protected Object _defaultBean;
	protected final com.fasterxml.jackson.annotation.JsonInclude.Value _defaultInclusion;
	protected final boolean _useRealPropertyDefaults;

	static 
	{
		NO_DEFAULT_MARKER = ((Object) (Boolean.FALSE));
	//    0    0:getstatic       #27  <Field Boolean Boolean.FALSE>
	//    1    3:putstatic       #29  <Field Object NO_DEFAULT_MARKER>
	//*   2    6:return          
	}
}
