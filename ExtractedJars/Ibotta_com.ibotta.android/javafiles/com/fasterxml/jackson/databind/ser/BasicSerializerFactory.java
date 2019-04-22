// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			SerializerFactory, Serializers, BeanSerializerModifier, ContainerSerializer

public abstract class BasicSerializerFactory extends SerializerFactory
	implements Serializable
{

	protected BasicSerializerFactory(SerializerFactoryConfig serializerfactoryconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void SerializerFactory()>
		SerializerFactoryConfig serializerfactoryconfig1 = serializerfactoryconfig;
	//    2    4:aload_1         
	//    3    5:astore_2        
		if(serializerfactoryconfig == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       18
			serializerfactoryconfig1 = new SerializerFactoryConfig();
	//    6   10:new             #135 <Class SerializerFactoryConfig>
	//    7   13:dup             
	//    8   14:invokespecial   #136 <Method void SerializerFactoryConfig()>
	//    9   17:astore_2        
		_factoryConfig = serializerfactoryconfig1;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//   13   23:return          
	}

	protected MapSerializer _checkMapContentInclusion(SerializerProvider serializerprovider, BeanDescription beandescription, MapSerializer mapserializer)
		throws JsonMappingException
	{
		JavaType javatype = mapserializer.getContentType();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #148 <Method JavaType MapSerializer.getContentType()>
	//    2    4:astore          7
		com.fasterxml.jackson.annotation.JsonInclude.Value value = _findInclusionWithContent(serializerprovider, beandescription, javatype, java/util/Map);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:aload           7
	//    7   11:ldc1            #150 <Class Map>
	//    8   13:invokevirtual   #154 <Method com.fasterxml.jackson.annotation.JsonInclude$Value _findInclusionWithContent(SerializerProvider, BeanDescription, JavaType, Class)>
	//    9   16:astore          8
		if(value == null)
	//*  10   18:aload           8
	//*  11   20:ifnonnull       30
			beandescription = ((BeanDescription) (com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS));
	//   12   23:getstatic       #160 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//   13   26:astore_2        
		else
	//*  14   27:goto            36
			beandescription = ((BeanDescription) (value.getContentInclusion()));
	//   15   30:aload           8
	//   16   32:invokevirtual   #166 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getContentInclusion()>
	//   17   35:astore_2        
		com.fasterxml.jackson.annotation.JsonInclude.Include include = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS;
	//   18   36:getstatic       #160 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//   19   39:astore          9
		boolean flag1 = true;
	//   20   41:iconst_1        
	//   21   42:istore          5
		Object obj = null;
	//   22   44:aconst_null     
	//   23   45:astore          6
		if(beandescription != include && beandescription != com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	//*  24   47:aload_2         
	//*  25   48:aload           9
	//*  26   50:if_acmpeq       232
	//*  27   53:aload_2         
	//*  28   54:getstatic       #169 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*  29   57:if_acmpne       63
	//*  30   60:goto            232
		{
			static class _cls1
			{

				static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];
				static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[];

				static 
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[com.fasterxml.jackson.annotation.JsonInclude.Include.values().length];
				//    0    0:invokestatic    #19  <Method com.fasterxml.jackson.annotation.JsonInclude$Include[] com.fasterxml.jackson.annotation.JsonInclude$Include.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
				//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//    5   12:getstatic       #25  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
				//    6   15:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  10   23:getstatic       #32  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_ABSENT>
				//*  11   26:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  15   34:getstatic       #35  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
				//*  16   37:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  20   45:getstatic       #38  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.CUSTOM>
				//*  21   48:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  25   56:getstatic       #41  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
				//*  26   59:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  30   67:getstatic       #44  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
				//*  31   70:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  32   73:bipush          6
				//*  33   75:iastore         
				//*  34   76:invokestatic    #49  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape[] com.fasterxml.jackson.annotation.JsonFormat$Shape.values()>
				//*  35   79:arraylength     
				//*  36   80:newarray        int[]
				//*  37   82:putstatic       #51  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
				//*  38   85:getstatic       #51  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
				//*  39   88:getstatic       #55  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
				//*  40   91:invokevirtual   #56  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
				//*  41   94:iconst_1        
				//*  42   95:iastore         
				//*  43   96:getstatic       #51  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
				//*  44   99:getstatic       #59  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
				//*  45  102:invokevirtual   #56  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
				//*  46  105:iconst_2        
				//*  47  106:iastore         
				//*  48  107:getstatic       #51  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
				//*  49  110:getstatic       #62  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ARRAY>
				//*  50  113:invokevirtual   #56  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
				//*  51  116:iconst_3        
				//*  52  117:iastore         
				//*  53  118:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   54  119:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
					}
				//*  55  120:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   56  123:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
					}
				//*  57  124:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   58  127:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM.ordinal()] = 4;
					}
				//*  59  128:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   60  131:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL.ordinal()] = 5;
					}
				//*  61  132:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   62  135:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS.ordinal()] = 6;
					}
				//*  63  136:goto            64
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   64  139:astore_0        
					$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
					}
				//*  65  140:goto            76
					catch(NoSuchFieldError nosuchfielderror6) { }
				//   66  143:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT.ordinal()] = 2;
					}
				//*  67  144:goto            96
					catch(NoSuchFieldError nosuchfielderror7) { }
				//   68  147:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY.ordinal()] = 3;
					}
				//*  69  148:goto            107
					catch(NoSuchFieldError nosuchfielderror8) { }
				//   70  151:astore_0        
				//*  71  152:return          
				}
			}

			boolean flag;
			switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Include) (beandescription)).ordinal()])
	//*  31   63:getstatic       #173 <Field int[] BasicSerializerFactory$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//*  32   66:aload_2         
	//*  33   67:invokevirtual   #177 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//*  34   70:iaload          
			{
	//*  35   71:tableswitch     1 4: default 100
	//	               1 183
	//	               2 157
	//	               3 146
	//	               4 110
			default:
				flag = flag1;
	//   36  100:iload           5
	//   37  102:istore          4
				serializerprovider = ((SerializerProvider) (obj));
	//   38  104:aload           6
	//   39  106:astore_1        
				break;
	//   40  107:goto            224

			case 4: // '\004'
				beandescription = ((BeanDescription) (serializerprovider.includeFilterInstance(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) (null)), value.getContentFilter())));
	//   41  110:aload_1         
	//   42  111:aconst_null     
	//   43  112:aload           8
	//   44  114:invokevirtual   #181 <Method Class com.fasterxml.jackson.annotation.JsonInclude$Value.getContentFilter()>
	//   45  117:invokevirtual   #187 <Method Object SerializerProvider.includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, Class)>
	//   46  120:astore_2        
				if(beandescription == null)
	//*  47  121:aload_2         
	//*  48  122:ifnonnull       134
				{
					flag = flag1;
	//   49  125:iload           5
	//   50  127:istore          4
					serializerprovider = ((SerializerProvider) (beandescription));
	//   51  129:aload_2         
	//   52  130:astore_1        
				} else
	//*  53  131:goto            224
				{
					flag = serializerprovider.includeFilterSuppressNulls(((Object) (beandescription)));
	//   54  134:aload_1         
	//   55  135:aload_2         
	//   56  136:invokevirtual   #191 <Method boolean SerializerProvider.includeFilterSuppressNulls(Object)>
	//   57  139:istore          4
					serializerprovider = ((SerializerProvider) (beandescription));
	//   58  141:aload_2         
	//   59  142:astore_1        
				}
				break;
	//   60  143:goto            224

			case 3: // '\003'
				serializerprovider = ((SerializerProvider) (MapSerializer.MARKER_FOR_EMPTY));
	//   61  146:getstatic       #195 <Field Object MapSerializer.MARKER_FOR_EMPTY>
	//   62  149:astore_1        
				flag = flag1;
	//   63  150:iload           5
	//   64  152:istore          4
				break;
	//   65  154:goto            224

			case 2: // '\002'
				flag = flag1;
	//   66  157:iload           5
	//   67  159:istore          4
				serializerprovider = ((SerializerProvider) (obj));
	//   68  161:aload           6
	//   69  163:astore_1        
				if(javatype.isReferenceType())
	//*  70  164:aload           7
	//*  71  166:invokevirtual   #200 <Method boolean JavaType.isReferenceType()>
	//*  72  169:ifeq            224
				{
					serializerprovider = ((SerializerProvider) (MapSerializer.MARKER_FOR_EMPTY));
	//   73  172:getstatic       #195 <Field Object MapSerializer.MARKER_FOR_EMPTY>
	//   74  175:astore_1        
					flag = flag1;
	//   75  176:iload           5
	//   76  178:istore          4
				}
				break;
	//   77  180:goto            224

			case 1: // '\001'
				beandescription = ((BeanDescription) (BeanUtil.getDefaultValue(javatype)));
	//   78  183:aload           7
	//   79  185:invokestatic    #206 <Method Object BeanUtil.getDefaultValue(JavaType)>
	//   80  188:astore_2        
				flag = flag1;
	//   81  189:iload           5
	//   82  191:istore          4
				serializerprovider = ((SerializerProvider) (beandescription));
	//   83  193:aload_2         
	//   84  194:astore_1        
				if(beandescription == null)
					break;
	//   85  195:aload_2         
	//   86  196:ifnull          224
				flag = flag1;
	//   87  199:iload           5
	//   88  201:istore          4
				serializerprovider = ((SerializerProvider) (beandescription));
	//   89  203:aload_2         
	//   90  204:astore_1        
				if(((Object) (beandescription)).getClass().isArray())
	//*  91  205:aload_2         
	//*  92  206:invokevirtual   #211 <Method Class Object.getClass()>
	//*  93  209:invokevirtual   #214 <Method boolean Class.isArray()>
	//*  94  212:ifeq            224
				{
					serializerprovider = ((SerializerProvider) (ArrayBuilders.getArrayComparator(((Object) (beandescription)))));
	//   95  215:aload_2         
	//   96  216:invokestatic    #220 <Method Object ArrayBuilders.getArrayComparator(Object)>
	//   97  219:astore_1        
					flag = flag1;
	//   98  220:iload           5
	//   99  222:istore          4
				}
				break;
			}
			return mapserializer.withContentInclusion(((Object) (serializerprovider)), flag);
	//  100  224:aload_3         
	//  101  225:aload_1         
	//  102  226:iload           4
	//  103  228:invokevirtual   #224 <Method MapSerializer MapSerializer.withContentInclusion(Object, boolean)>
	//  104  231:areturn         
		}
		if(!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
	//* 105  232:aload_1         
	//* 106  233:getstatic       #230 <Field SerializationFeature SerializationFeature.WRITE_NULL_MAP_VALUES>
	//* 107  236:invokevirtual   #234 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//* 108  239:ifne            249
			return mapserializer.withContentInclusion(((Object) (null)), true);
	//  109  242:aload_3         
	//  110  243:aconst_null     
	//  111  244:iconst_1        
	//  112  245:invokevirtual   #224 <Method MapSerializer MapSerializer.withContentInclusion(Object, boolean)>
	//  113  248:areturn         
		else
			return mapserializer;
	//  114  249:aload_3         
	//  115  250:areturn         
	}

	protected JsonSerializer _findContentSerializer(SerializerProvider serializerprovider, Annotated annotated)
		throws JsonMappingException
	{
		Object obj = serializerprovider.getAnnotationIntrospector().findContentSerializer(annotated);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #241 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #247 <Method Object AnnotationIntrospector.findContentSerializer(Annotated)>
	//    4    8:astore_3        
		if(obj != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          20
			return serializerprovider.serializerInstance(annotated, obj);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #251 <Method JsonSerializer SerializerProvider.serializerInstance(Annotated, Object)>
	//   11   19:areturn         
		else
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
	}

	protected com.fasterxml.jackson.annotation.JsonInclude.Value _findInclusionWithContent(SerializerProvider serializerprovider, BeanDescription beandescription, JavaType javatype, Class class1)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (serializerprovider.getConfig()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #257 <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore_1        
		beandescription = ((BeanDescription) (((SerializationConfig) (serializerprovider)).getDefaultPropertyInclusion(class1, beandescription.findPropertyInclusion(((SerializationConfig) (serializerprovider)).getDefaultPropertyInclusion()))));
	//    3    5:aload_1         
	//    4    6:aload           4
	//    5    8:aload_2         
	//    6    9:aload_1         
	//    7   10:invokevirtual   #263 <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializationConfig.getDefaultPropertyInclusion()>
	//    8   13:invokevirtual   #269 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanDescription.findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    9   16:invokevirtual   #272 <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializationConfig.getDefaultPropertyInclusion(Class, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   10   19:astore_2        
		javatype = ((JavaType) (((SerializationConfig) (serializerprovider)).getDefaultPropertyInclusion(javatype.getRawClass(), ((com.fasterxml.jackson.annotation.JsonInclude.Value) (null)))));
	//   11   20:aload_1         
	//   12   21:aload_3         
	//   13   22:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//   14   25:aconst_null     
	//   15   26:invokevirtual   #272 <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializationConfig.getDefaultPropertyInclusion(Class, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   16   29:astore_3        
		serializerprovider = ((SerializerProvider) (beandescription));
	//   17   30:aload_2         
	//   18   31:astore_1        
		if(javatype != null)
	//*  19   32:aload_3         
	//*  20   33:ifnull          82
		{
			int i = _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Value) (javatype)).getValueInclusion().ordinal()];
	//   21   36:getstatic       #173 <Field int[] BasicSerializerFactory$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//   22   39:aload_3         
	//   23   40:invokevirtual   #278 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//   24   43:invokevirtual   #177 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//   25   46:iaload          
	//   26   47:istore          5
			if(i != 4)
	//*  27   49:iload           5
	//*  28   51:iconst_4        
	//*  29   52:icmpeq          73
			{
				serializerprovider = ((SerializerProvider) (beandescription));
	//   30   55:aload_2         
	//   31   56:astore_1        
				if(i != 6)
	//*  32   57:iload           5
	//*  33   59:bipush          6
	//*  34   61:icmpeq          82
					return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (beandescription)).withContentInclusion(((com.fasterxml.jackson.annotation.JsonInclude.Value) (javatype)).getValueInclusion());
	//   35   64:aload_2         
	//   36   65:aload_3         
	//   37   66:invokevirtual   #278 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//   38   69:invokevirtual   #281 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withContentInclusion(com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   39   72:areturn         
			} else
			{
				serializerprovider = ((SerializerProvider) (((com.fasterxml.jackson.annotation.JsonInclude.Value) (beandescription)).withContentFilter(((com.fasterxml.jackson.annotation.JsonInclude.Value) (javatype)).getContentFilter())));
	//   40   73:aload_2         
	//   41   74:aload_3         
	//   42   75:invokevirtual   #181 <Method Class com.fasterxml.jackson.annotation.JsonInclude$Value.getContentFilter()>
	//   43   78:invokevirtual   #285 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withContentFilter(Class)>
	//   44   81:astore_1        
			}
		}
		return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (serializerprovider));
	//   45   82:aload_1         
	//   46   83:areturn         
	}

	protected JsonSerializer _findKeySerializer(SerializerProvider serializerprovider, Annotated annotated)
		throws JsonMappingException
	{
		Object obj = serializerprovider.getAnnotationIntrospector().findKeySerializer(annotated);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #241 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #290 <Method Object AnnotationIntrospector.findKeySerializer(Annotated)>
	//    4    8:astore_3        
		if(obj != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          20
			return serializerprovider.serializerInstance(annotated, obj);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #251 <Method JsonSerializer SerializerProvider.serializerInstance(Annotated, Object)>
	//   11   19:areturn         
		else
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
	}

	protected JsonSerializer buildArraySerializer(SerializerProvider serializerprovider, ArrayType arraytype, BeanDescription beandescription, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		SerializationConfig serializationconfig = serializerprovider.getConfig();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #257 <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore          8
		Iterator iterator = customSerializers().iterator();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #296 <Method Iterable customSerializers()>
	//    5   10:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//    6   15:astore          9
		Object obj = null;
	//    7   17:aconst_null     
	//    8   18:astore          7
		do
		{
			if(!iterator.hasNext())
				break;
	//    9   20:aload           9
	//   10   22:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            64
			serializerprovider = ((SerializerProvider) (((Serializers)iterator.next()).findArraySerializer(serializationconfig, arraytype, beandescription, typeserializer, jsonserializer)));
	//   12   30:aload           9
	//   13   32:invokeinterface #112 <Method Object Iterator.next()>
	//   14   37:checkcast       #301 <Class Serializers>
	//   15   40:aload           8
	//   16   42:aload_2         
	//   17   43:aload_3         
	//   18   44:aload           5
	//   19   46:aload           6
	//   20   48:invokeinterface #305 <Method JsonSerializer Serializers.findArraySerializer(SerializationConfig, ArrayType, BeanDescription, TypeSerializer, JsonSerializer)>
	//   21   53:astore_1        
			obj = ((Object) (serializerprovider));
	//   22   54:aload_1         
	//   23   55:astore          7
			if(serializerprovider == null)
				continue;
	//   24   57:aload_1         
	//   25   58:ifnull          20
			obj = ((Object) (serializerprovider));
	//   26   61:aload_1         
	//   27   62:astore          7
			break;
		} while(true);
		serializerprovider = ((SerializerProvider) (obj));
	//   28   64:aload           7
	//   29   66:astore_1        
		if(obj == null)
	//*  30   67:aload           7
	//*  31   69:ifnonnull       137
		{
			serializerprovider = ((SerializerProvider) (arraytype.getRawClass()));
	//   32   72:aload_2         
	//   33   73:invokevirtual   #308 <Method Class ArrayType.getRawClass()>
	//   34   76:astore_1        
			if(jsonserializer == null || ClassUtil.isJacksonStdImpl(((Object) (jsonserializer))))
	//*  35   77:aload           6
	//*  36   79:ifnull          90
	//*  37   82:aload           6
	//*  38   84:invokestatic    #313 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//*  39   87:ifeq            111
				if([Ljava/lang/String; == serializerprovider)
	//*  40   90:ldc2            #315 <Class String[]>
	//*  41   93:aload_1         
	//*  42   94:if_acmpne       105
					obj = ((Object) (StringArraySerializer.instance));
	//   43   97:getstatic       #320 <Field StringArraySerializer StringArraySerializer.instance>
	//   44  100:astore          7
				else
	//*  45  102:goto            111
					obj = ((Object) (StdArraySerializers.findStandardImpl(((Class) (serializerprovider)))));
	//   46  105:aload_1         
	//   47  106:invokestatic    #326 <Method JsonSerializer StdArraySerializers.findStandardImpl(Class)>
	//   48  109:astore          7
			serializerprovider = ((SerializerProvider) (obj));
	//   49  111:aload           7
	//   50  113:astore_1        
			if(obj == null)
	//*  51  114:aload           7
	//*  52  116:ifnonnull       137
				serializerprovider = ((SerializerProvider) (new ObjectArraySerializer(arraytype.getContentType(), flag, typeserializer, jsonserializer)));
	//   53  119:new             #328 <Class ObjectArraySerializer>
	//   54  122:dup             
	//   55  123:aload_2         
	//   56  124:invokevirtual   #329 <Method JavaType ArrayType.getContentType()>
	//   57  127:iload           4
	//   58  129:aload           5
	//   59  131:aload           6
	//   60  133:invokespecial   #332 <Method void ObjectArraySerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//   61  136:astore_1        
		}
		typeserializer = ((TypeSerializer) (serializerprovider));
	//   62  137:aload_1         
	//   63  138:astore          5
		if(_factoryConfig.hasSerializerModifiers())
	//*  64  140:aload_0         
	//*  65  141:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//*  66  144:invokevirtual   #335 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  67  147:ifeq            199
		{
			jsonserializer = ((JsonSerializer) (_factoryConfig.serializerModifiers().iterator()));
	//   68  150:aload_0         
	//   69  151:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//   70  154:invokevirtual   #338 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//   71  157:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//   72  162:astore          6
			do
			{
				typeserializer = ((TypeSerializer) (serializerprovider));
	//   73  164:aload_1         
	//   74  165:astore          5
				if(!((Iterator) (jsonserializer)).hasNext())
					break;
	//   75  167:aload           6
	//   76  169:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   77  174:ifeq            199
				serializerprovider = ((SerializerProvider) (((BeanSerializerModifier)((Iterator) (jsonserializer)).next()).modifyArraySerializer(serializationconfig, arraytype, beandescription, ((JsonSerializer) (serializerprovider)))));
	//   78  177:aload           6
	//   79  179:invokeinterface #112 <Method Object Iterator.next()>
	//   80  184:checkcast       #340 <Class BeanSerializerModifier>
	//   81  187:aload           8
	//   82  189:aload_2         
	//   83  190:aload_3         
	//   84  191:aload_1         
	//   85  192:invokevirtual   #344 <Method JsonSerializer BeanSerializerModifier.modifyArraySerializer(SerializationConfig, ArrayType, BeanDescription, JsonSerializer)>
	//   86  195:astore_1        
			} while(true);
	//   87  196:goto            164
		}
		return ((JsonSerializer) (typeserializer));
	//   88  199:aload           5
	//   89  201:areturn         
	}

	protected JsonSerializer buildAtomicReferenceSerializer(SerializerProvider serializerprovider, ReferenceType referencetype, BeanDescription beandescription, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		JavaType javatype = referencetype.getReferencedType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #352 <Method JavaType ReferenceType.getReferencedType()>
	//    2    4:astore          10
		com.fasterxml.jackson.annotation.JsonInclude.Value value = _findInclusionWithContent(serializerprovider, beandescription, javatype, java/util/concurrent/atomic/AtomicReference);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_3         
	//    6    9:aload           10
	//    7   11:ldc2            #354 <Class AtomicReference>
	//    8   14:invokevirtual   #154 <Method com.fasterxml.jackson.annotation.JsonInclude$Value _findInclusionWithContent(SerializerProvider, BeanDescription, JavaType, Class)>
	//    9   17:astore          11
		if(value == null)
	//*  10   19:aload           11
	//*  11   21:ifnonnull       31
			beandescription = ((BeanDescription) (com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS));
	//   12   24:getstatic       #160 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//   13   27:astore_3        
		else
	//*  14   28:goto            37
			beandescription = ((BeanDescription) (value.getContentInclusion()));
	//   15   31:aload           11
	//   16   33:invokevirtual   #166 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getContentInclusion()>
	//   17   36:astore_3        
		com.fasterxml.jackson.annotation.JsonInclude.Include include = com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS;
	//   18   37:getstatic       #160 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//   19   40:astore          12
		boolean flag2 = true;
	//   20   42:iconst_1        
	//   21   43:istore          8
		Object obj = null;
	//   22   45:aconst_null     
	//   23   46:astore          9
		boolean flag1;
		if(beandescription != include && beandescription != com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	//*  24   48:aload_3         
	//*  25   49:aload           12
	//*  26   51:if_acmpeq       231
	//*  27   54:aload_3         
	//*  28   55:getstatic       #169 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*  29   58:if_acmpne       64
	//*  30   61:goto            231
		{
			switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Include) (beandescription)).ordinal()])
	//*  31   64:getstatic       #173 <Field int[] BasicSerializerFactory$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//*  32   67:aload_3         
	//*  33   68:invokevirtual   #177 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//*  34   71:iaload          
			{
	//*  35   72:tableswitch     1 4: default 104
	//	               1 187
	//	               2 161
	//	               3 150
	//	               4 114
			default:
				flag1 = flag2;
	//   36  104:iload           8
	//   37  106:istore          7
				serializerprovider = ((SerializerProvider) (obj));
	//   38  108:aload           9
	//   39  110:astore_1        
				break;

	//*  40  111:goto            237
			case 4: // '\004'
				beandescription = ((BeanDescription) (serializerprovider.includeFilterInstance(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) (null)), value.getContentFilter())));
	//   41  114:aload_1         
	//   42  115:aconst_null     
	//   43  116:aload           11
	//   44  118:invokevirtual   #181 <Method Class com.fasterxml.jackson.annotation.JsonInclude$Value.getContentFilter()>
	//   45  121:invokevirtual   #187 <Method Object SerializerProvider.includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, Class)>
	//   46  124:astore_3        
				if(beandescription == null)
	//*  47  125:aload_3         
	//*  48  126:ifnonnull       138
				{
					flag1 = flag2;
	//   49  129:iload           8
	//   50  131:istore          7
					serializerprovider = ((SerializerProvider) (beandescription));
	//   51  133:aload_3         
	//   52  134:astore_1        
				} else
	//*  53  135:goto            237
				{
					flag1 = serializerprovider.includeFilterSuppressNulls(((Object) (beandescription)));
	//   54  138:aload_1         
	//   55  139:aload_3         
	//   56  140:invokevirtual   #191 <Method boolean SerializerProvider.includeFilterSuppressNulls(Object)>
	//   57  143:istore          7
					serializerprovider = ((SerializerProvider) (beandescription));
	//   58  145:aload_3         
	//   59  146:astore_1        
				}
				break;

	//*  60  147:goto            237
			case 3: // '\003'
				serializerprovider = ((SerializerProvider) (MapSerializer.MARKER_FOR_EMPTY));
	//   61  150:getstatic       #195 <Field Object MapSerializer.MARKER_FOR_EMPTY>
	//   62  153:astore_1        
				flag1 = flag2;
	//   63  154:iload           8
	//   64  156:istore          7
				break;

	//*  65  158:goto            237
			case 2: // '\002'
				flag1 = flag2;
	//   66  161:iload           8
	//   67  163:istore          7
				serializerprovider = ((SerializerProvider) (obj));
	//   68  165:aload           9
	//   69  167:astore_1        
				if(javatype.isReferenceType())
	//*  70  168:aload           10
	//*  71  170:invokevirtual   #200 <Method boolean JavaType.isReferenceType()>
	//*  72  173:ifeq            237
				{
					serializerprovider = ((SerializerProvider) (MapSerializer.MARKER_FOR_EMPTY));
	//   73  176:getstatic       #195 <Field Object MapSerializer.MARKER_FOR_EMPTY>
	//   74  179:astore_1        
					flag1 = flag2;
	//   75  180:iload           8
	//   76  182:istore          7
				}
				break;

	//*  77  184:goto            237
			case 1: // '\001'
				beandescription = ((BeanDescription) (BeanUtil.getDefaultValue(javatype)));
	//   78  187:aload           10
	//   79  189:invokestatic    #206 <Method Object BeanUtil.getDefaultValue(JavaType)>
	//   80  192:astore_3        
				flag1 = flag2;
	//   81  193:iload           8
	//   82  195:istore          7
				serializerprovider = ((SerializerProvider) (beandescription));
	//   83  197:aload_3         
	//   84  198:astore_1        
				if(beandescription != null)
	//*  85  199:aload_3         
	//*  86  200:ifnull          237
				{
					flag1 = flag2;
	//   87  203:iload           8
	//   88  205:istore          7
					serializerprovider = ((SerializerProvider) (beandescription));
	//   89  207:aload_3         
	//   90  208:astore_1        
					if(((Object) (beandescription)).getClass().isArray())
	//*  91  209:aload_3         
	//*  92  210:invokevirtual   #211 <Method Class Object.getClass()>
	//*  93  213:invokevirtual   #214 <Method boolean Class.isArray()>
	//*  94  216:ifeq            237
					{
						serializerprovider = ((SerializerProvider) (ArrayBuilders.getArrayComparator(((Object) (beandescription)))));
	//   95  219:aload_3         
	//   96  220:invokestatic    #220 <Method Object ArrayBuilders.getArrayComparator(Object)>
	//   97  223:astore_1        
						flag1 = flag2;
	//   98  224:iload           8
	//   99  226:istore          7
					}
				}
				break;
			}
		} else
	//* 100  228:goto            237
		{
			flag1 = false;
	//  101  231:iconst_0        
	//  102  232:istore          7
			serializerprovider = ((SerializerProvider) (obj));
	//  103  234:aload           9
	//  104  236:astore_1        
		}
		return ((JsonSerializer) ((new AtomicReferenceSerializer(referencetype, flag, typeserializer, jsonserializer)).withContentInclusion(((Object) (serializerprovider)), flag1)));
	//  105  237:new             #356 <Class AtomicReferenceSerializer>
	//  106  240:dup             
	//  107  241:aload_2         
	//  108  242:iload           4
	//  109  244:aload           5
	//  110  246:aload           6
	//  111  248:invokespecial   #359 <Method void AtomicReferenceSerializer(ReferenceType, boolean, TypeSerializer, JsonSerializer)>
	//  112  251:aload_1         
	//  113  252:iload           7
	//  114  254:invokevirtual   #362 <Method com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer AtomicReferenceSerializer.withContentInclusion(Object, boolean)>
	//  115  257:areturn         
	}

	protected JsonSerializer buildCollectionSerializer(SerializerProvider serializerprovider, CollectionType collectiontype, BeanDescription beandescription, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		SerializationConfig serializationconfig = serializerprovider.getConfig();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #257 <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore          9
		Iterator iterator = customSerializers().iterator();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #296 <Method Iterable customSerializers()>
	//    5   10:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//    6   15:astore          10
		Object obj = null;
	//    7   17:aconst_null     
	//    8   18:astore          7
		JsonSerializer jsonserializer1;
		do
		{
			jsonserializer1 = ((JsonSerializer) (obj));
	//    9   20:aload           7
	//   10   22:astore          8
			if(!iterator.hasNext())
				break;
	//   11   24:aload           10
	//   12   26:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            68
			jsonserializer1 = ((Serializers)iterator.next()).findCollectionSerializer(serializationconfig, collectiontype, beandescription, typeserializer, jsonserializer);
	//   14   34:aload           10
	//   15   36:invokeinterface #112 <Method Object Iterator.next()>
	//   16   41:checkcast       #301 <Class Serializers>
	//   17   44:aload           9
	//   18   46:aload_2         
	//   19   47:aload_3         
	//   20   48:aload           5
	//   21   50:aload           6
	//   22   52:invokeinterface #369 <Method JsonSerializer Serializers.findCollectionSerializer(SerializationConfig, CollectionType, BeanDescription, TypeSerializer, JsonSerializer)>
	//   23   57:astore          8
			obj = ((Object) (jsonserializer1));
	//   24   59:aload           8
	//   25   61:astore          7
		} while(jsonserializer1 == null);
	//   26   63:aload           8
	//   27   65:ifnull          20
		obj = ((Object) (jsonserializer1));
	//   28   68:aload           8
	//   29   70:astore          7
		if(jsonserializer1 == null)
	//*  30   72:aload           8
	//*  31   74:ifnonnull       269
		{
			JsonSerializer jsonserializer2 = findSerializerByAnnotations(serializerprovider, ((JavaType) (collectiontype)), beandescription);
	//   32   77:aload_0         
	//   33   78:aload_1         
	//   34   79:aload_2         
	//   35   80:aload_3         
	//   36   81:invokevirtual   #373 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//   37   84:astore          8
			obj = ((Object) (jsonserializer2));
	//   38   86:aload           8
	//   39   88:astore          7
			if(jsonserializer2 == null)
	//*  40   90:aload           8
	//*  41   92:ifnonnull       269
			{
				serializerprovider = ((SerializerProvider) (beandescription.findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null)))));
	//   42   95:aload_3         
	//   43   96:aconst_null     
	//   44   97:invokevirtual   #377 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   45  100:astore_1        
				if(serializerprovider != null && ((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT)
	//*  46  101:aload_1         
	//*  47  102:ifnull          117
	//*  48  105:aload_1         
	//*  49  106:invokevirtual   #383 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  50  109:getstatic       #389 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
	//*  51  112:if_acmpne       117
					return null;
	//   52  115:aconst_null     
	//   53  116:areturn         
				serializerprovider = ((SerializerProvider) (collectiontype.getRawClass()));
	//   54  117:aload_2         
	//   55  118:invokevirtual   #392 <Method Class CollectionType.getRawClass()>
	//   56  121:astore_1        
				if(((Class) (java/util/EnumSet)).isAssignableFrom(((Class) (serializerprovider))))
	//*  57  122:ldc2            #394 <Class EnumSet>
	//*  58  125:aload_1         
	//*  59  126:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  60  129:ifeq            161
				{
					typeserializer = ((TypeSerializer) (collectiontype.getContentType()));
	//   61  132:aload_2         
	//   62  133:invokevirtual   #399 <Method JavaType CollectionType.getContentType()>
	//   63  136:astore          5
					serializerprovider = ((SerializerProvider) (typeserializer));
	//   64  138:aload           5
	//   65  140:astore_1        
					if(!((JavaType) (typeserializer)).isEnumType())
	//*  66  141:aload           5
	//*  67  143:invokevirtual   #402 <Method boolean JavaType.isEnumType()>
	//*  68  146:ifne            151
						serializerprovider = null;
	//   69  149:aconst_null     
	//   70  150:astore_1        
					obj = ((Object) (buildEnumSetSerializer(((JavaType) (serializerprovider)))));
	//   71  151:aload_0         
	//   72  152:aload_1         
	//   73  153:invokevirtual   #406 <Method JsonSerializer buildEnumSetSerializer(JavaType)>
	//   74  156:astore          7
				} else
	//*  75  158:goto            269
				{
					obj = ((Object) (collectiontype.getContentType().getRawClass()));
	//   76  161:aload_2         
	//   77  162:invokevirtual   #399 <Method JavaType CollectionType.getContentType()>
	//   78  165:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//   79  168:astore          7
					if(isIndexedList(((Class) (serializerprovider))))
	//*  80  170:aload_0         
	//*  81  171:aload_1         
	//*  82  172:invokevirtual   #409 <Method boolean isIndexedList(Class)>
	//*  83  175:ifeq            221
					{
						if(obj == java/lang/String)
	//*  84  178:aload           7
	//*  85  180:ldc1            #24  <Class String>
	//*  86  182:if_acmpne       203
						{
							serializerprovider = ((SerializerProvider) (jsonserializer2));
	//   87  185:aload           8
	//   88  187:astore_1        
							if(ClassUtil.isJacksonStdImpl(((Object) (jsonserializer))))
	//*  89  188:aload           6
	//*  90  190:invokestatic    #313 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//*  91  193:ifeq            246
								serializerprovider = ((SerializerProvider) (IndexedStringListSerializer.instance));
	//   92  196:getstatic       #414 <Field IndexedStringListSerializer IndexedStringListSerializer.instance>
	//   93  199:astore_1        
						} else
	//*  94  200:goto            246
						{
							serializerprovider = ((SerializerProvider) (buildIndexedListSerializer(collectiontype.getContentType(), flag, typeserializer, jsonserializer)));
	//   95  203:aload_0         
	//   96  204:aload_2         
	//   97  205:invokevirtual   #399 <Method JavaType CollectionType.getContentType()>
	//   98  208:iload           4
	//   99  210:aload           5
	//  100  212:aload           6
	//  101  214:invokevirtual   #418 <Method ContainerSerializer buildIndexedListSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//  102  217:astore_1        
						}
					} else
	//* 103  218:goto            246
					{
						serializerprovider = ((SerializerProvider) (jsonserializer2));
	//  104  221:aload           8
	//  105  223:astore_1        
						if(obj == java/lang/String)
	//* 106  224:aload           7
	//* 107  226:ldc1            #24  <Class String>
	//* 108  228:if_acmpne       246
						{
							serializerprovider = ((SerializerProvider) (jsonserializer2));
	//  109  231:aload           8
	//  110  233:astore_1        
							if(ClassUtil.isJacksonStdImpl(((Object) (jsonserializer))))
	//* 111  234:aload           6
	//* 112  236:invokestatic    #313 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//* 113  239:ifeq            246
								serializerprovider = ((SerializerProvider) (StringCollectionSerializer.instance));
	//  114  242:getstatic       #423 <Field StringCollectionSerializer StringCollectionSerializer.instance>
	//  115  245:astore_1        
						}
					}
					obj = ((Object) (serializerprovider));
	//  116  246:aload_1         
	//  117  247:astore          7
					if(serializerprovider == null)
	//* 118  249:aload_1         
	//* 119  250:ifnonnull       269
						obj = ((Object) (buildCollectionSerializer(collectiontype.getContentType(), flag, typeserializer, jsonserializer)));
	//  120  253:aload_0         
	//  121  254:aload_2         
	//  122  255:invokevirtual   #399 <Method JavaType CollectionType.getContentType()>
	//  123  258:iload           4
	//  124  260:aload           5
	//  125  262:aload           6
	//  126  264:invokevirtual   #425 <Method ContainerSerializer buildCollectionSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//  127  267:astore          7
				}
			}
		}
		serializerprovider = ((SerializerProvider) (obj));
	//  128  269:aload           7
	//  129  271:astore_1        
		if(_factoryConfig.hasSerializerModifiers())
	//* 130  272:aload_0         
	//* 131  273:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//* 132  276:invokevirtual   #335 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//* 133  279:ifeq            333
		{
			typeserializer = ((TypeSerializer) (_factoryConfig.serializerModifiers().iterator()));
	//  134  282:aload_0         
	//  135  283:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//  136  286:invokevirtual   #338 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  137  289:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//  138  294:astore          5
			do
			{
				serializerprovider = ((SerializerProvider) (obj));
	//  139  296:aload           7
	//  140  298:astore_1        
				if(!((Iterator) (typeserializer)).hasNext())
					break;
	//  141  299:aload           5
	//  142  301:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//  143  306:ifeq            333
				obj = ((Object) (((BeanSerializerModifier)((Iterator) (typeserializer)).next()).modifyCollectionSerializer(serializationconfig, collectiontype, beandescription, ((JsonSerializer) (obj)))));
	//  144  309:aload           5
	//  145  311:invokeinterface #112 <Method Object Iterator.next()>
	//  146  316:checkcast       #340 <Class BeanSerializerModifier>
	//  147  319:aload           9
	//  148  321:aload_2         
	//  149  322:aload_3         
	//  150  323:aload           7
	//  151  325:invokevirtual   #429 <Method JsonSerializer BeanSerializerModifier.modifyCollectionSerializer(SerializationConfig, CollectionType, BeanDescription, JsonSerializer)>
	//  152  328:astore          7
			} while(true);
	//  153  330:goto            296
		}
		return ((JsonSerializer) (serializerprovider));
	//  154  333:aload_1         
	//  155  334:areturn         
	}

	public ContainerSerializer buildCollectionSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return ((ContainerSerializer) (new CollectionSerializer(javatype, flag, typeserializer, jsonserializer)));
	//    0    0:new             #432 <Class CollectionSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #433 <Method void CollectionSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    7   12:areturn         
	}

	protected JsonSerializer buildContainerSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		TypeSerializer typeserializer;
		JsonSerializer jsonserializer3;
label0:
		{
			JsonSerializer jsonserializer2;
			BeanDescription beandescription1;
			SerializationConfig serializationconfig;
			CollectionLikeType collectionliketype;
label1:
			{
				beandescription1 = beandescription;
	//    0    0:aload_3         
	//    1    1:astore          8
				serializationconfig = serializerprovider.getConfig();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #257 <Method SerializationConfig SerializerProvider.getConfig()>
	//    4    7:astore          9
				if(!flag && javatype.useStaticType() && (!javatype.isContainerType() || !javatype.getContentType().isJavaLangObject()))
	//*   5    9:iload           4
	//*   6   11:ifne            44
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #439 <Method boolean JavaType.useStaticType()>
	//*   9   18:ifeq            44
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #442 <Method boolean JavaType.isContainerType()>
	//*  12   25:ifeq            38
	//*  13   28:aload_2         
	//*  14   29:invokevirtual   #443 <Method JavaType JavaType.getContentType()>
	//*  15   32:invokevirtual   #446 <Method boolean JavaType.isJavaLangObject()>
	//*  16   35:ifne            44
					flag = true;
	//   17   38:iconst_1        
	//   18   39:istore          4
	//*  19   41:goto            44
				typeserializer = createTypeSerializer(serializationconfig, javatype.getContentType());
	//   20   44:aload_0         
	//   21   45:aload           9
	//   22   47:aload_2         
	//   23   48:invokevirtual   #443 <Method JavaType JavaType.getContentType()>
	//   24   51:invokevirtual   #450 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   25   54:astore          10
				if(typeserializer != null)
	//*  26   56:aload           10
	//*  27   58:ifnull          67
					flag = false;
	//   28   61:iconst_0        
	//   29   62:istore          4
	//*  30   64:goto            67
				jsonserializer3 = _findContentSerializer(serializerprovider, ((Annotated) (beandescription.getClassInfo())));
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:aload_3         
	//   34   70:invokevirtual   #454 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   35   73:invokevirtual   #456 <Method JsonSerializer _findContentSerializer(SerializerProvider, Annotated)>
	//   36   76:astore          11
				boolean flag1 = javatype.isMapLikeType();
	//   37   78:aload_2         
	//   38   79:invokevirtual   #459 <Method boolean JavaType.isMapLikeType()>
	//   39   82:istore          5
				jsonserializer2 = null;
	//   40   84:aconst_null     
	//   41   85:astore          7
				JsonSerializer jsonserializer = null;
	//   42   87:aconst_null     
	//   43   88:astore          6
				if(flag1)
	//*  44   90:iload           5
	//*  45   92:ifeq            293
				{
					MapLikeType mapliketype = (MapLikeType)javatype;
	//   46   95:aload_2         
	//   47   96:checkcast       #461 <Class MapLikeType>
	//   48   99:astore          12
					JsonSerializer jsonserializer4 = _findKeySerializer(serializerprovider, ((Annotated) (beandescription.getClassInfo())));
	//   49  101:aload_0         
	//   50  102:aload_1         
	//   51  103:aload_3         
	//   52  104:invokevirtual   #454 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   53  107:invokevirtual   #463 <Method JsonSerializer _findKeySerializer(SerializerProvider, Annotated)>
	//   54  110:astore          13
					if(mapliketype.isTrueMapType())
	//*  55  112:aload           12
	//*  56  114:invokevirtual   #466 <Method boolean MapLikeType.isTrueMapType()>
	//*  57  117:ifeq            140
						return buildMapSerializer(serializerprovider, (MapType)mapliketype, beandescription, flag, jsonserializer4, typeserializer, jsonserializer3);
	//   58  120:aload_0         
	//   59  121:aload_1         
	//   60  122:aload           12
	//   61  124:checkcast       #468 <Class MapType>
	//   62  127:aload_3         
	//   63  128:iload           4
	//   64  130:aload           13
	//   65  132:aload           10
	//   66  134:aload           11
	//   67  136:invokevirtual   #472 <Method JsonSerializer buildMapSerializer(SerializerProvider, MapType, BeanDescription, boolean, JsonSerializer, TypeSerializer, JsonSerializer)>
	//   68  139:areturn         
					Iterator iterator1 = customSerializers().iterator();
	//   69  140:aload_0         
	//   70  141:invokevirtual   #296 <Method Iterable customSerializers()>
	//   71  144:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//   72  149:astore          14
					do
					{
						jsonserializer2 = jsonserializer;
	//   73  151:aload           6
	//   74  153:astore          7
						if(!iterator1.hasNext())
							break;
	//   75  155:aload           14
	//   76  157:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   77  162:ifeq            202
						jsonserializer2 = ((Serializers)iterator1.next()).findMapLikeSerializer(serializationconfig, mapliketype, beandescription, jsonserializer4, typeserializer, jsonserializer3);
	//   78  165:aload           14
	//   79  167:invokeinterface #112 <Method Object Iterator.next()>
	//   80  172:checkcast       #301 <Class Serializers>
	//   81  175:aload           9
	//   82  177:aload           12
	//   83  179:aload_3         
	//   84  180:aload           13
	//   85  182:aload           10
	//   86  184:aload           11
	//   87  186:invokeinterface #476 <Method JsonSerializer Serializers.findMapLikeSerializer(SerializationConfig, MapLikeType, BeanDescription, JsonSerializer, TypeSerializer, JsonSerializer)>
	//   88  191:astore          7
						jsonserializer = jsonserializer2;
	//   89  193:aload           7
	//   90  195:astore          6
					} while(jsonserializer2 == null);
	//   91  197:aload           7
	//   92  199:ifnull          151
					jsonserializer = jsonserializer2;
	//   93  202:aload           7
	//   94  204:astore          6
					if(jsonserializer2 == null)
	//*  95  206:aload           7
	//*  96  208:ifnonnull       220
						jsonserializer = findSerializerByAnnotations(serializerprovider, javatype, beandescription);
	//   97  211:aload_0         
	//   98  212:aload_1         
	//   99  213:aload_2         
	//  100  214:aload_3         
	//  101  215:invokevirtual   #373 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//  102  218:astore          6
					serializerprovider = ((SerializerProvider) (jsonserializer));
	//  103  220:aload           6
	//  104  222:astore_1        
					if(jsonserializer != null)
	//* 105  223:aload           6
	//* 106  225:ifnull          291
					{
						serializerprovider = ((SerializerProvider) (jsonserializer));
	//  107  228:aload           6
	//  108  230:astore_1        
						if(_factoryConfig.hasSerializerModifiers())
	//* 109  231:aload_0         
	//* 110  232:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//* 111  235:invokevirtual   #335 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//* 112  238:ifeq            291
						{
							javatype = ((JavaType) (_factoryConfig.serializerModifiers().iterator()));
	//  113  241:aload_0         
	//  114  242:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//  115  245:invokevirtual   #338 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  116  248:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//  117  253:astore_2        
							do
							{
								serializerprovider = ((SerializerProvider) (jsonserializer));
	//  118  254:aload           6
	//  119  256:astore_1        
								if(!((Iterator) (javatype)).hasNext())
									break;
	//  120  257:aload_2         
	//  121  258:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//  122  263:ifeq            291
								jsonserializer = ((BeanSerializerModifier)((Iterator) (javatype)).next()).modifyMapLikeSerializer(serializationconfig, mapliketype, beandescription1, jsonserializer);
	//  123  266:aload_2         
	//  124  267:invokeinterface #112 <Method Object Iterator.next()>
	//  125  272:checkcast       #340 <Class BeanSerializerModifier>
	//  126  275:aload           9
	//  127  277:aload           12
	//  128  279:aload           8
	//  129  281:aload           6
	//  130  283:invokevirtual   #480 <Method JsonSerializer BeanSerializerModifier.modifyMapLikeSerializer(SerializationConfig, MapLikeType, BeanDescription, JsonSerializer)>
	//  131  286:astore          6
							} while(true);
	//  132  288:goto            254
						}
					}
					return ((JsonSerializer) (serializerprovider));
	//  133  291:aload_1         
	//  134  292:areturn         
				}
				if(!javatype.isCollectionLikeType())
					break label0;
	//  135  293:aload_2         
	//  136  294:invokevirtual   #483 <Method boolean JavaType.isCollectionLikeType()>
	//  137  297:ifeq            493
				collectionliketype = (CollectionLikeType)javatype;
	//  138  300:aload_2         
	//  139  301:checkcast       #485 <Class CollectionLikeType>
	//  140  304:astore          12
				if(collectionliketype.isTrueCollectionType())
	//* 141  306:aload           12
	//* 142  308:invokevirtual   #488 <Method boolean CollectionLikeType.isTrueCollectionType()>
	//* 143  311:ifeq            332
					return buildCollectionSerializer(serializerprovider, (CollectionType)collectionliketype, beandescription, flag, typeserializer, jsonserializer3);
	//  144  314:aload_0         
	//  145  315:aload_1         
	//  146  316:aload           12
	//  147  318:checkcast       #391 <Class CollectionType>
	//  148  321:aload_3         
	//  149  322:iload           4
	//  150  324:aload           10
	//  151  326:aload           11
	//  152  328:invokevirtual   #490 <Method JsonSerializer buildCollectionSerializer(SerializerProvider, CollectionType, BeanDescription, boolean, TypeSerializer, JsonSerializer)>
	//  153  331:areturn         
				Iterator iterator = customSerializers().iterator();
	//  154  332:aload_0         
	//  155  333:invokevirtual   #296 <Method Iterable customSerializers()>
	//  156  336:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//  157  341:astore          13
				jsonserializer = jsonserializer2;
	//  158  343:aload           7
	//  159  345:astore          6
				while(iterator.hasNext()) 
	//* 160  347:aload           13
	//* 161  349:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//* 162  354:ifeq            398
				{
					jsonserializer = ((Serializers)iterator.next()).findCollectionLikeSerializer(serializationconfig, collectionliketype, beandescription, typeserializer, jsonserializer3);
	//  163  357:aload           13
	//  164  359:invokeinterface #112 <Method Object Iterator.next()>
	//  165  364:checkcast       #301 <Class Serializers>
	//  166  367:aload           9
	//  167  369:aload           12
	//  168  371:aload_3         
	//  169  372:aload           10
	//  170  374:aload           11
	//  171  376:invokeinterface #494 <Method JsonSerializer Serializers.findCollectionLikeSerializer(SerializationConfig, CollectionLikeType, BeanDescription, TypeSerializer, JsonSerializer)>
	//  172  381:astore          6
					if(jsonserializer != null)
	//* 173  383:aload           6
	//* 174  385:ifnull          395
					{
						jsonserializer2 = jsonserializer;
	//  175  388:aload           6
	//  176  390:astore          7
						break label1;
	//  177  392:goto            402
					}
				}
	//* 178  395:goto            347
				jsonserializer2 = jsonserializer;
	//  179  398:aload           6
	//  180  400:astore          7
			}
			JsonSerializer jsonserializer1 = jsonserializer2;
	//  181  402:aload           7
	//  182  404:astore          6
			if(jsonserializer2 == null)
	//* 183  406:aload           7
	//* 184  408:ifnonnull       420
				jsonserializer1 = findSerializerByAnnotations(serializerprovider, javatype, beandescription);
	//  185  411:aload_0         
	//  186  412:aload_1         
	//  187  413:aload_2         
	//  188  414:aload_3         
	//  189  415:invokevirtual   #373 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//  190  418:astore          6
			serializerprovider = ((SerializerProvider) (jsonserializer1));
	//  191  420:aload           6
	//  192  422:astore_1        
			if(jsonserializer1 != null)
	//* 193  423:aload           6
	//* 194  425:ifnull          491
			{
				serializerprovider = ((SerializerProvider) (jsonserializer1));
	//  195  428:aload           6
	//  196  430:astore_1        
				if(_factoryConfig.hasSerializerModifiers())
	//* 197  431:aload_0         
	//* 198  432:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//* 199  435:invokevirtual   #335 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//* 200  438:ifeq            491
				{
					javatype = ((JavaType) (_factoryConfig.serializerModifiers().iterator()));
	//  201  441:aload_0         
	//  202  442:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//  203  445:invokevirtual   #338 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  204  448:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//  205  453:astore_2        
					do
					{
						serializerprovider = ((SerializerProvider) (jsonserializer1));
	//  206  454:aload           6
	//  207  456:astore_1        
						if(!((Iterator) (javatype)).hasNext())
							break;
	//  208  457:aload_2         
	//  209  458:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//  210  463:ifeq            491
						jsonserializer1 = ((BeanSerializerModifier)((Iterator) (javatype)).next()).modifyCollectionLikeSerializer(serializationconfig, collectionliketype, beandescription1, jsonserializer1);
	//  211  466:aload_2         
	//  212  467:invokeinterface #112 <Method Object Iterator.next()>
	//  213  472:checkcast       #340 <Class BeanSerializerModifier>
	//  214  475:aload           9
	//  215  477:aload           12
	//  216  479:aload           8
	//  217  481:aload           6
	//  218  483:invokevirtual   #498 <Method JsonSerializer BeanSerializerModifier.modifyCollectionLikeSerializer(SerializationConfig, CollectionLikeType, BeanDescription, JsonSerializer)>
	//  219  486:astore          6
					} while(true);
	//  220  488:goto            454
				}
			}
			return ((JsonSerializer) (serializerprovider));
	//  221  491:aload_1         
	//  222  492:areturn         
		}
		if(javatype.isArrayType())
	//* 223  493:aload_2         
	//* 224  494:invokevirtual   #501 <Method boolean JavaType.isArrayType()>
	//* 225  497:ifeq            517
			return buildArraySerializer(serializerprovider, (ArrayType)javatype, beandescription, flag, typeserializer, jsonserializer3);
	//  226  500:aload_0         
	//  227  501:aload_1         
	//  228  502:aload_2         
	//  229  503:checkcast       #307 <Class ArrayType>
	//  230  506:aload_3         
	//  231  507:iload           4
	//  232  509:aload           10
	//  233  511:aload           11
	//  234  513:invokevirtual   #503 <Method JsonSerializer buildArraySerializer(SerializerProvider, ArrayType, BeanDescription, boolean, TypeSerializer, JsonSerializer)>
	//  235  516:areturn         
		else
			return null;
	//  236  517:aconst_null     
	//  237  518:areturn         
	}

	protected JsonSerializer buildEnumSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException
	{
		Object obj = ((Object) (beandescription.findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null)))));
	//    0    0:aload_3         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #377 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//    3    5:astore          4
		if(obj != null && ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)).getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT)
	//*   4    7:aload           4
	//*   5    9:ifnull          36
	//*   6   12:aload           4
	//*   7   14:invokevirtual   #383 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*   8   17:getstatic       #389 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
	//*   9   20:if_acmpne       36
		{
			((BasicBeanDescription)beandescription).removeProperty("declaringClass");
	//   10   23:aload_3         
	//   11   24:checkcast       #508 <Class BasicBeanDescription>
	//   12   27:ldc2            #510 <String "declaringClass">
	//   13   30:invokevirtual   #514 <Method boolean BasicBeanDescription.removeProperty(String)>
	//   14   33:pop             
			return null;
	//   15   34:aconst_null     
	//   16   35:areturn         
		}
		obj = ((Object) (EnumSerializer.construct(javatype.getRawClass(), serializationconfig, beandescription, ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)))));
	//   17   36:aload_2         
	//   18   37:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//   19   40:aload_1         
	//   20   41:aload_3         
	//   21   42:aload           4
	//   22   44:invokestatic    #520 <Method EnumSerializer EnumSerializer.construct(Class, SerializationConfig, BeanDescription, com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   23   47:astore          4
		EnumSerializer enumserializer = ((EnumSerializer) (obj));
	//   24   49:aload           4
	//   25   51:astore          5
		if(_factoryConfig.hasSerializerModifiers())
	//*  26   53:aload_0         
	//*  27   54:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//*  28   57:invokevirtual   #335 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  29   60:ifeq            114
		{
			Iterator iterator = _factoryConfig.serializerModifiers().iterator();
	//   30   63:aload_0         
	//   31   64:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//   32   67:invokevirtual   #338 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//   33   70:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//   34   75:astore          6
			do
			{
				enumserializer = ((EnumSerializer) (obj));
	//   35   77:aload           4
	//   36   79:astore          5
				if(!iterator.hasNext())
					break;
	//   37   81:aload           6
	//   38   83:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   39   88:ifeq            114
				obj = ((Object) (((BeanSerializerModifier)iterator.next()).modifyEnumSerializer(serializationconfig, javatype, beandescription, ((JsonSerializer) (obj)))));
	//   40   91:aload           6
	//   41   93:invokeinterface #112 <Method Object Iterator.next()>
	//   42   98:checkcast       #340 <Class BeanSerializerModifier>
	//   43  101:aload_1         
	//   44  102:aload_2         
	//   45  103:aload_3         
	//   46  104:aload           4
	//   47  106:invokevirtual   #524 <Method JsonSerializer BeanSerializerModifier.modifyEnumSerializer(SerializationConfig, JavaType, BeanDescription, JsonSerializer)>
	//   48  109:astore          4
			} while(true);
	//   49  111:goto            77
		}
		return ((JsonSerializer) (enumserializer));
	//   50  114:aload           5
	//   51  116:areturn         
	}

	public JsonSerializer buildEnumSetSerializer(JavaType javatype)
	{
		return ((JsonSerializer) (new EnumSetSerializer(javatype)));
	//    0    0:new             #527 <Class EnumSetSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #530 <Method void EnumSetSerializer(JavaType)>
	//    4    8:areturn         
	}

	public ContainerSerializer buildIndexedListSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return ((ContainerSerializer) (new IndexedListSerializer(javatype, flag, typeserializer, jsonserializer)));
	//    0    0:new             #533 <Class IndexedListSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #534 <Method void IndexedListSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    7   12:areturn         
	}

	protected JsonSerializer buildIterableSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag, JavaType javatype1)
		throws JsonMappingException
	{
		return ((JsonSerializer) (new IterableSerializer(javatype1, flag, createTypeSerializer(serializationconfig, javatype1))));
	//    0    0:new             #538 <Class IterableSerializer>
	//    1    3:dup             
	//    2    4:aload           5
	//    3    6:iload           4
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload           5
	//    7   12:invokevirtual   #450 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//    8   15:invokespecial   #541 <Method void IterableSerializer(JavaType, boolean, TypeSerializer)>
	//    9   18:areturn         
	}

	protected JsonSerializer buildIteratorSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag, JavaType javatype1)
		throws JsonMappingException
	{
		return ((JsonSerializer) (new IteratorSerializer(javatype1, flag, createTypeSerializer(serializationconfig, javatype1))));
	//    0    0:new             #545 <Class IteratorSerializer>
	//    1    3:dup             
	//    2    4:aload           5
	//    3    6:iload           4
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload           5
	//    7   12:invokevirtual   #450 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//    8   15:invokespecial   #546 <Method void IteratorSerializer(JavaType, boolean, TypeSerializer)>
	//    9   18:areturn         
	}

	protected JsonSerializer buildMapEntrySerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag, JavaType javatype1, JavaType javatype2)
		throws JsonMappingException
	{
		javatype = ((JavaType) (serializerprovider.getDefaultPropertyFormat(java/util/Map$Entry)));
	//    0    0:aload_1         
	//    1    1:ldc1            #114 <Class java.util.Map$Entry>
	//    2    3:invokevirtual   #552 <Method com.fasterxml.jackson.annotation.JsonFormat$Value SerializerProvider.getDefaultPropertyFormat(Class)>
	//    3    6:astore_2        
		Object obj = null;
	//    4    7:aconst_null     
	//    5    8:astore          9
		if(com.fasterxml.jackson.annotation.JsonFormat.Value.merge(beandescription.findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null))), ((com.fasterxml.jackson.annotation.JsonFormat.Value) (javatype))).getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT)
	//*   6   10:aload_3         
	//*   7   11:aconst_null     
	//*   8   12:invokevirtual   #377 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//*   9   15:aload_2         
	//*  10   16:invokestatic    #556 <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.merge(com.fasterxml.jackson.annotation.JsonFormat$Value, com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//*  11   19:invokevirtual   #383 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  12   22:getstatic       #389 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
	//*  13   25:if_acmpne       30
			return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
		javatype1 = ((JavaType) (new MapEntrySerializer(javatype2, javatype1, javatype2, flag, createTypeSerializer(serializerprovider.getConfig(), javatype2), ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
	//   16   30:new             #558 <Class MapEntrySerializer>
	//   17   33:dup             
	//   18   34:aload           6
	//   19   36:aload           5
	//   20   38:aload           6
	//   21   40:iload           4
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #257 <Method SerializationConfig SerializerProvider.getConfig()>
	//   25   47:aload           6
	//   26   49:invokevirtual   #450 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   27   52:aconst_null     
	//   28   53:invokespecial   #561 <Method void MapEntrySerializer(JavaType, JavaType, JavaType, boolean, TypeSerializer, com.fasterxml.jackson.databind.BeanProperty)>
	//   29   56:astore          5
		javatype2 = ((MapEntrySerializer) (javatype1)).getContentType();
	//   30   58:aload           5
	//   31   60:invokevirtual   #562 <Method JavaType MapEntrySerializer.getContentType()>
	//   32   63:astore          6
		beandescription = ((BeanDescription) (_findInclusionWithContent(serializerprovider, beandescription, javatype2, java/util/Map$Entry)));
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:aload_3         
	//   36   68:aload           6
	//   37   70:ldc1            #114 <Class java.util.Map$Entry>
	//   38   72:invokevirtual   #154 <Method com.fasterxml.jackson.annotation.JsonInclude$Value _findInclusionWithContent(SerializerProvider, BeanDescription, JavaType, Class)>
	//   39   75:astore_3        
		if(beandescription == null)
	//*  40   76:aload_3         
	//*  41   77:ifnonnull       87
			javatype = ((JavaType) (com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS));
	//   42   80:getstatic       #160 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//   43   83:astore_2        
		else
	//*  44   84:goto            92
			javatype = ((JavaType) (((com.fasterxml.jackson.annotation.JsonInclude.Value) (beandescription)).getContentInclusion()));
	//   45   87:aload_3         
	//   46   88:invokevirtual   #166 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getContentInclusion()>
	//   47   91:astore_2        
		if(javatype != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*  48   92:aload_2         
	//*  49   93:getstatic       #160 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  50   96:if_acmpeq       288
		{
			if(javatype == com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	//*  51   99:aload_2         
	//*  52  100:getstatic       #169 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*  53  103:if_acmpne       109
				return ((JsonSerializer) (javatype1));
	//   54  106:aload           5
	//   55  108:areturn         
			int i = _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Include) (javatype)).ordinal()];
	//   56  109:getstatic       #173 <Field int[] BasicSerializerFactory$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//   57  112:aload_2         
	//   58  113:invokevirtual   #177 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//   59  116:iaload          
	//   60  117:istore          7
			boolean flag1 = true;
	//   61  119:iconst_1        
	//   62  120:istore          8
			switch(i)
	//*  63  122:iload           7
			{
	//*  64  124:tableswitch     1 4: default 156
	//	               1 238
	//	               2 212
	//	               3 201
	//	               4 166
			default:
				serializerprovider = ((SerializerProvider) (obj));
	//   65  156:aload           9
	//   66  158:astore_1        
				flag = flag1;
	//   67  159:iload           8
	//   68  161:istore          4
				break;
	//   69  163:goto            279

			case 4: // '\004'
				javatype = ((JavaType) (serializerprovider.includeFilterInstance(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) (null)), ((com.fasterxml.jackson.annotation.JsonInclude.Value) (beandescription)).getContentFilter())));
	//   70  166:aload_1         
	//   71  167:aconst_null     
	//   72  168:aload_3         
	//   73  169:invokevirtual   #181 <Method Class com.fasterxml.jackson.annotation.JsonInclude$Value.getContentFilter()>
	//   74  172:invokevirtual   #187 <Method Object SerializerProvider.includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, Class)>
	//   75  175:astore_2        
				if(javatype == null)
	//*  76  176:aload_2         
	//*  77  177:ifnonnull       189
				{
					serializerprovider = ((SerializerProvider) (javatype));
	//   78  180:aload_2         
	//   79  181:astore_1        
					flag = flag1;
	//   80  182:iload           8
	//   81  184:istore          4
				} else
	//*  82  186:goto            279
				{
					flag = serializerprovider.includeFilterSuppressNulls(((Object) (javatype)));
	//   83  189:aload_1         
	//   84  190:aload_2         
	//   85  191:invokevirtual   #191 <Method boolean SerializerProvider.includeFilterSuppressNulls(Object)>
	//   86  194:istore          4
					serializerprovider = ((SerializerProvider) (javatype));
	//   87  196:aload_2         
	//   88  197:astore_1        
				}
				break;
	//   89  198:goto            279

			case 3: // '\003'
				serializerprovider = ((SerializerProvider) (MapSerializer.MARKER_FOR_EMPTY));
	//   90  201:getstatic       #195 <Field Object MapSerializer.MARKER_FOR_EMPTY>
	//   91  204:astore_1        
				flag = flag1;
	//   92  205:iload           8
	//   93  207:istore          4
				break;
	//   94  209:goto            279

			case 2: // '\002'
				serializerprovider = ((SerializerProvider) (obj));
	//   95  212:aload           9
	//   96  214:astore_1        
				flag = flag1;
	//   97  215:iload           8
	//   98  217:istore          4
				if(javatype2.isReferenceType())
	//*  99  219:aload           6
	//* 100  221:invokevirtual   #200 <Method boolean JavaType.isReferenceType()>
	//* 101  224:ifeq            279
				{
					serializerprovider = ((SerializerProvider) (MapSerializer.MARKER_FOR_EMPTY));
	//  102  227:getstatic       #195 <Field Object MapSerializer.MARKER_FOR_EMPTY>
	//  103  230:astore_1        
					flag = flag1;
	//  104  231:iload           8
	//  105  233:istore          4
				}
				break;
	//  106  235:goto            279

			case 1: // '\001'
				javatype = ((JavaType) (BeanUtil.getDefaultValue(javatype2)));
	//  107  238:aload           6
	//  108  240:invokestatic    #206 <Method Object BeanUtil.getDefaultValue(JavaType)>
	//  109  243:astore_2        
				serializerprovider = ((SerializerProvider) (javatype));
	//  110  244:aload_2         
	//  111  245:astore_1        
				flag = flag1;
	//  112  246:iload           8
	//  113  248:istore          4
				if(javatype == null)
					break;
	//  114  250:aload_2         
	//  115  251:ifnull          279
				serializerprovider = ((SerializerProvider) (javatype));
	//  116  254:aload_2         
	//  117  255:astore_1        
				flag = flag1;
	//  118  256:iload           8
	//  119  258:istore          4
				if(((Object) (javatype)).getClass().isArray())
	//* 120  260:aload_2         
	//* 121  261:invokevirtual   #211 <Method Class Object.getClass()>
	//* 122  264:invokevirtual   #214 <Method boolean Class.isArray()>
	//* 123  267:ifeq            279
				{
					serializerprovider = ((SerializerProvider) (ArrayBuilders.getArrayComparator(((Object) (javatype)))));
	//  124  270:aload_2         
	//  125  271:invokestatic    #220 <Method Object ArrayBuilders.getArrayComparator(Object)>
	//  126  274:astore_1        
					flag = flag1;
	//  127  275:iload           8
	//  128  277:istore          4
				}
				break;
			}
			return ((JsonSerializer) (((MapEntrySerializer) (javatype1)).withContentInclusion(((Object) (serializerprovider)), flag)));
	//  129  279:aload           5
	//  130  281:aload_1         
	//  131  282:iload           4
	//  132  284:invokevirtual   #565 <Method MapEntrySerializer MapEntrySerializer.withContentInclusion(Object, boolean)>
	//  133  287:areturn         
		} else
		{
			return ((JsonSerializer) (javatype1));
	//  134  288:aload           5
	//  135  290:areturn         
		}
	}

	protected JsonSerializer buildMapSerializer(SerializerProvider serializerprovider, MapType maptype, BeanDescription beandescription, boolean flag, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
		throws JsonMappingException
	{
		Object obj2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          10
		Object obj = ((Object) (beandescription.findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null)))));
	//    2    3:aload_3         
	//    3    4:aconst_null     
	//    4    5:invokevirtual   #377 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//    5    8:astore          8
		if(obj != null && ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)).getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT)
	//*   6   10:aload           8
	//*   7   12:ifnull          28
	//*   8   15:aload           8
	//*   9   17:invokevirtual   #383 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  10   20:getstatic       #389 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
	//*  11   23:if_acmpne       28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		SerializationConfig serializationconfig = serializerprovider.getConfig();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #257 <Method SerializationConfig SerializerProvider.getConfig()>
	//   16   32:astore          11
		Iterator iterator = customSerializers().iterator();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #296 <Method Iterable customSerializers()>
	//   19   38:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//   20   43:astore          12
		obj = null;
	//   21   45:aconst_null     
	//   22   46:astore          8
		JsonSerializer jsonserializer2;
		do
		{
			jsonserializer2 = ((JsonSerializer) (obj));
	//   23   48:aload           8
	//   24   50:astore          9
			if(!iterator.hasNext())
				break;
	//   25   52:aload           12
	//   26   54:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   27   59:ifeq            98
			jsonserializer2 = ((Serializers)iterator.next()).findMapSerializer(serializationconfig, maptype, beandescription, jsonserializer, typeserializer, jsonserializer1);
	//   28   62:aload           12
	//   29   64:invokeinterface #112 <Method Object Iterator.next()>
	//   30   69:checkcast       #301 <Class Serializers>
	//   31   72:aload           11
	//   32   74:aload_2         
	//   33   75:aload_3         
	//   34   76:aload           5
	//   35   78:aload           6
	//   36   80:aload           7
	//   37   82:invokeinterface #570 <Method JsonSerializer Serializers.findMapSerializer(SerializationConfig, MapType, BeanDescription, JsonSerializer, TypeSerializer, JsonSerializer)>
	//   38   87:astore          9
			obj = ((Object) (jsonserializer2));
	//   39   89:aload           9
	//   40   91:astore          8
		} while(jsonserializer2 == null);
	//   41   93:aload           9
	//   42   95:ifnull          48
		obj = ((Object) (jsonserializer2));
	//   43   98:aload           9
	//   44  100:astore          8
		if(jsonserializer2 == null)
	//*  45  102:aload           9
	//*  46  104:ifnonnull       190
		{
			JsonSerializer jsonserializer3 = findSerializerByAnnotations(serializerprovider, ((JavaType) (maptype)), beandescription);
	//   47  107:aload_0         
	//   48  108:aload_1         
	//   49  109:aload_2         
	//   50  110:aload_3         
	//   51  111:invokevirtual   #373 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//   52  114:astore          9
			obj = ((Object) (jsonserializer3));
	//   53  116:aload           9
	//   54  118:astore          8
			if(jsonserializer3 == null)
	//*  55  120:aload           9
	//*  56  122:ifnonnull       190
			{
				Object obj1 = findFilterId(serializationconfig, beandescription);
	//   57  125:aload_0         
	//   58  126:aload           11
	//   59  128:aload_3         
	//   60  129:invokevirtual   #574 <Method Object findFilterId(SerializationConfig, BeanDescription)>
	//   61  132:astore          9
				obj = ((Object) (serializationconfig.getDefaultPropertyIgnorals(java/util/Map, beandescription.getClassInfo())));
	//   62  134:aload           11
	//   63  136:ldc1            #150 <Class Map>
	//   64  138:aload_3         
	//   65  139:invokevirtual   #454 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   66  142:invokevirtual   #578 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value SerializationConfig.getDefaultPropertyIgnorals(Class, com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   67  145:astore          8
				if(obj == null)
	//*  68  147:aload           8
	//*  69  149:ifnonnull       159
					obj = ((Object) (obj2));
	//   70  152:aload           10
	//   71  154:astore          8
				else
	//*  72  156:goto            166
					obj = ((Object) (((com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value) (obj)).findIgnoredForSerialization()));
	//   73  159:aload           8
	//   74  161:invokevirtual   #584 <Method java.util.Set com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value.findIgnoredForSerialization()>
	//   75  164:astore          8
				obj = ((Object) (_checkMapContentInclusion(serializerprovider, beandescription, MapSerializer.construct(((java.util.Set) (obj)), ((JavaType) (maptype)), flag, typeserializer, jsonserializer, jsonserializer1, obj1))));
	//   76  166:aload_0         
	//   77  167:aload_1         
	//   78  168:aload_3         
	//   79  169:aload           8
	//   80  171:aload_2         
	//   81  172:iload           4
	//   82  174:aload           6
	//   83  176:aload           5
	//   84  178:aload           7
	//   85  180:aload           9
	//   86  182:invokestatic    #587 <Method MapSerializer MapSerializer.construct(java.util.Set, JavaType, boolean, TypeSerializer, JsonSerializer, JsonSerializer, Object)>
	//   87  185:invokevirtual   #589 <Method MapSerializer _checkMapContentInclusion(SerializerProvider, BeanDescription, MapSerializer)>
	//   88  188:astore          8
			}
		}
		serializerprovider = ((SerializerProvider) (obj));
	//   89  190:aload           8
	//   90  192:astore_1        
		if(_factoryConfig.hasSerializerModifiers())
	//*  91  193:aload_0         
	//*  92  194:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//*  93  197:invokevirtual   #335 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  94  200:ifeq            254
		{
			jsonserializer = ((JsonSerializer) (_factoryConfig.serializerModifiers().iterator()));
	//   95  203:aload_0         
	//   96  204:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//   97  207:invokevirtual   #338 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//   98  210:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//   99  215:astore          5
			do
			{
				serializerprovider = ((SerializerProvider) (obj));
	//  100  217:aload           8
	//  101  219:astore_1        
				if(!((Iterator) (jsonserializer)).hasNext())
					break;
	//  102  220:aload           5
	//  103  222:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//  104  227:ifeq            254
				obj = ((Object) (((BeanSerializerModifier)((Iterator) (jsonserializer)).next()).modifyMapSerializer(serializationconfig, maptype, beandescription, ((JsonSerializer) (obj)))));
	//  105  230:aload           5
	//  106  232:invokeinterface #112 <Method Object Iterator.next()>
	//  107  237:checkcast       #340 <Class BeanSerializerModifier>
	//  108  240:aload           11
	//  109  242:aload_2         
	//  110  243:aload_3         
	//  111  244:aload           8
	//  112  246:invokevirtual   #593 <Method JsonSerializer BeanSerializerModifier.modifyMapSerializer(SerializationConfig, MapType, BeanDescription, JsonSerializer)>
	//  113  249:astore          8
			} while(true);
	//  114  251:goto            217
		}
		return ((JsonSerializer) (serializerprovider));
	//  115  254:aload_1         
	//  116  255:areturn         
	}

	public JsonSerializer createKeySerializer(SerializationConfig serializationconfig, JavaType javatype, JsonSerializer jsonserializer)
	{
		Object obj;
		BeanDescription beandescription1;
label0:
		{
			beandescription1 = serializationconfig.introspectClassAnnotations(javatype.getRawClass());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//    3    5:invokevirtual   #600 <Method BeanDescription SerializationConfig.introspectClassAnnotations(Class)>
	//    4    8:astore          7
			boolean flag = _factoryConfig.hasKeySerializers();
	//    5   10:aload_0         
	//    6   11:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//    7   14:invokevirtual   #603 <Method boolean SerializerFactoryConfig.hasKeySerializers()>
	//    8   17:istore          4
			obj = null;
	//    9   19:aconst_null     
	//   10   20:astore          5
			JsonSerializer jsonserializer1 = null;
	//   11   22:aconst_null     
	//   12   23:astore          6
			if(!flag)
				break label0;
	//   13   25:iload           4
	//   14   27:ifeq            92
			Iterator iterator1 = _factoryConfig.keySerializers().iterator();
	//   15   30:aload_0         
	//   16   31:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//   17   34:invokevirtual   #606 <Method Iterable SerializerFactoryConfig.keySerializers()>
	//   18   37:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//   19   42:astore          8
			obj = ((Object) (jsonserializer1));
	//   20   44:aload           6
	//   21   46:astore          5
			do
			{
				if(!iterator1.hasNext())
					break label0;
	//   22   48:aload           8
	//   23   50:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   24   55:ifeq            92
				jsonserializer1 = ((Serializers)iterator1.next()).findSerializer(serializationconfig, javatype, beandescription1);
	//   25   58:aload           8
	//   26   60:invokeinterface #112 <Method Object Iterator.next()>
	//   27   65:checkcast       #301 <Class Serializers>
	//   28   68:aload_1         
	//   29   69:aload_2         
	//   30   70:aload           7
	//   31   72:invokeinterface #609 <Method JsonSerializer Serializers.findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//   32   77:astore          6
				obj = ((Object) (jsonserializer1));
	//   33   79:aload           6
	//   34   81:astore          5
			} while(jsonserializer1 == null);
	//   35   83:aload           6
	//   36   85:ifnull          48
			obj = ((Object) (jsonserializer1));
	//   37   88:aload           6
	//   38   90:astore          5
		}
		BeanDescription beandescription;
		if(obj == null)
	//*  39   92:aload           5
	//*  40   94:ifnonnull       206
		{
			beandescription = beandescription1;
	//   41   97:aload           7
	//   42   99:astore          6
			obj = ((Object) (jsonserializer));
	//   43  101:aload_3         
	//   44  102:astore          5
			if(jsonserializer == null)
	//*  45  104:aload_3         
	//*  46  105:ifnonnull       210
			{
				jsonserializer = StdKeySerializers.getStdKeySerializer(serializationconfig, javatype.getRawClass(), false);
	//   47  108:aload_1         
	//   48  109:aload_2         
	//   49  110:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//   50  113:iconst_0        
	//   51  114:invokestatic    #615 <Method JsonSerializer StdKeySerializers.getStdKeySerializer(SerializationConfig, Class, boolean)>
	//   52  117:astore_3        
				beandescription = beandescription1;
	//   53  118:aload           7
	//   54  120:astore          6
				obj = ((Object) (jsonserializer));
	//   55  122:aload_3         
	//   56  123:astore          5
				if(jsonserializer == null)
	//*  57  125:aload_3         
	//*  58  126:ifnonnull       210
				{
					beandescription = serializationconfig.introspect(javatype);
	//   59  129:aload_1         
	//   60  130:aload_2         
	//   61  131:invokevirtual   #619 <Method BeanDescription SerializationConfig.introspect(JavaType)>
	//   62  134:astore          6
					jsonserializer = ((JsonSerializer) (beandescription.findJsonValueAccessor()));
	//   63  136:aload           6
	//   64  138:invokevirtual   #623 <Method AnnotatedMember BeanDescription.findJsonValueAccessor()>
	//   65  141:astore_3        
					if(jsonserializer != null)
	//*  66  142:aload_3         
	//*  67  143:ifnull          193
					{
						obj = ((Object) (StdKeySerializers.getStdKeySerializer(serializationconfig, ((AnnotatedMember) (jsonserializer)).getRawType(), true)));
	//   68  146:aload_1         
	//   69  147:aload_3         
	//   70  148:invokevirtual   #628 <Method Class AnnotatedMember.getRawType()>
	//   71  151:iconst_1        
	//   72  152:invokestatic    #615 <Method JsonSerializer StdKeySerializers.getStdKeySerializer(SerializationConfig, Class, boolean)>
	//   73  155:astore          5
						if(serializationconfig.canOverrideAccessModifiers())
	//*  74  157:aload_1         
	//*  75  158:invokevirtual   #631 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//*  76  161:ifeq            178
							ClassUtil.checkAndFixAccess(((AnnotatedMember) (jsonserializer)).getMember(), serializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//   77  164:aload_3         
	//   78  165:invokevirtual   #635 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//   79  168:aload_1         
	//   80  169:getstatic       #641 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   81  172:invokevirtual   #644 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//   82  175:invokestatic    #648 <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
						obj = ((Object) (new JsonValueSerializer(((AnnotatedMember) (jsonserializer)), ((JsonSerializer) (obj)))));
	//   83  178:new             #650 <Class JsonValueSerializer>
	//   84  181:dup             
	//   85  182:aload_3         
	//   86  183:aload           5
	//   87  185:invokespecial   #653 <Method void JsonValueSerializer(AnnotatedMember, JsonSerializer)>
	//   88  188:astore          5
					} else
	//*  89  190:goto            210
					{
						obj = ((Object) (StdKeySerializers.getFallbackKeySerializer(serializationconfig, javatype.getRawClass())));
	//   90  193:aload_1         
	//   91  194:aload_2         
	//   92  195:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//   93  198:invokestatic    #657 <Method JsonSerializer StdKeySerializers.getFallbackKeySerializer(SerializationConfig, Class)>
	//   94  201:astore          5
					}
				}
			}
		} else
	//*  95  203:goto            210
		{
			beandescription = beandescription1;
	//   96  206:aload           7
	//   97  208:astore          6
		}
		jsonserializer = ((JsonSerializer) (obj));
	//   98  210:aload           5
	//   99  212:astore_3        
		if(_factoryConfig.hasSerializerModifiers())
	//* 100  213:aload_0         
	//* 101  214:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//* 102  217:invokevirtual   #335 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//* 103  220:ifeq            274
		{
			Iterator iterator = _factoryConfig.serializerModifiers().iterator();
	//  104  223:aload_0         
	//  105  224:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//  106  227:invokevirtual   #338 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  107  230:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//  108  235:astore          7
			do
			{
				jsonserializer = ((JsonSerializer) (obj));
	//  109  237:aload           5
	//  110  239:astore_3        
				if(!iterator.hasNext())
					break;
	//  111  240:aload           7
	//  112  242:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//  113  247:ifeq            274
				obj = ((Object) (((BeanSerializerModifier)iterator.next()).modifyKeySerializer(serializationconfig, javatype, beandescription, ((JsonSerializer) (obj)))));
	//  114  250:aload           7
	//  115  252:invokeinterface #112 <Method Object Iterator.next()>
	//  116  257:checkcast       #340 <Class BeanSerializerModifier>
	//  117  260:aload_1         
	//  118  261:aload_2         
	//  119  262:aload           6
	//  120  264:aload           5
	//  121  266:invokevirtual   #660 <Method JsonSerializer BeanSerializerModifier.modifyKeySerializer(SerializationConfig, JavaType, BeanDescription, JsonSerializer)>
	//  122  269:astore          5
			} while(true);
	//  123  271:goto            237
		}
		return jsonserializer;
	//  124  274:aload_3         
	//  125  275:areturn         
	}

	public TypeSerializer createTypeSerializer(SerializationConfig serializationconfig, JavaType javatype)
	{
		Object obj = ((Object) (serializationconfig.introspectClassAnnotations(javatype.getRawClass()).getClassInfo()));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//    3    5:invokevirtual   #600 <Method BeanDescription SerializationConfig.introspectClassAnnotations(Class)>
	//    4    8:invokevirtual   #454 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//    5   11:astore_3        
		TypeResolverBuilder typeresolverbuilder = serializationconfig.getAnnotationIntrospector().findTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj)), javatype);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #662 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:aload_2         
	//   11   19:invokevirtual   #666 <Method TypeResolverBuilder AnnotationIntrospector.findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, JavaType)>
	//   12   22:astore          4
		if(typeresolverbuilder == null)
	//*  13   24:aload           4
	//*  14   26:ifnonnull       41
		{
			typeresolverbuilder = serializationconfig.getDefaultTyper(javatype);
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #670 <Method TypeResolverBuilder SerializationConfig.getDefaultTyper(JavaType)>
	//   18   34:astore          4
			obj = null;
	//   19   36:aconst_null     
	//   20   37:astore_3        
		} else
	//*  21   38:goto            51
		{
			obj = ((Object) (serializationconfig.getSubtypeResolver().collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj)))));
	//   22   41:aload_1         
	//   23   42:invokevirtual   #674 <Method SubtypeResolver SerializationConfig.getSubtypeResolver()>
	//   24   45:aload_1         
	//   25   46:aload_3         
	//   26   47:invokevirtual   #680 <Method Collection SubtypeResolver.collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   27   50:astore_3        
		}
		if(typeresolverbuilder == null)
	//*  28   51:aload           4
	//*  29   53:ifnonnull       58
			return null;
	//   30   56:aconst_null     
	//   31   57:areturn         
		else
			return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, ((Collection) (obj)));
	//   32   58:aload           4
	//   33   60:aload_1         
	//   34   61:aload_2         
	//   35   62:aload_3         
	//   36   63:invokeinterface #686 <Method TypeSerializer TypeResolverBuilder.buildTypeSerializer(SerializationConfig, JavaType, Collection)>
	//   37   68:areturn         
	}

	protected abstract Iterable customSerializers();

	protected Converter findConverter(SerializerProvider serializerprovider, Annotated annotated)
		throws JsonMappingException
	{
		Object obj = serializerprovider.getAnnotationIntrospector().findSerializationConverter(annotated);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #241 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #691 <Method Object AnnotationIntrospector.findSerializationConverter(Annotated)>
	//    4    8:astore_3        
		if(obj == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return serializerprovider.converterInstance(annotated, obj);
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:aload_3         
	//   12   18:invokevirtual   #695 <Method Converter SerializerProvider.converterInstance(Annotated, Object)>
	//   13   21:areturn         
	}

	protected JsonSerializer findConvertingSerializer(SerializerProvider serializerprovider, Annotated annotated, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		annotated = ((Annotated) (findConverter(serializerprovider, annotated)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #700 <Method Converter findConverter(SerializerProvider, Annotated)>
	//    4    6:astore_2        
		if(annotated == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return jsonserializer;
	//    7   11:aload_3         
	//    8   12:areturn         
		else
			return ((JsonSerializer) (new StdDelegatingSerializer(((Converter) (annotated)), ((Converter) (annotated)).getOutputType(serializerprovider.getTypeFactory()), jsonserializer)));
	//    9   13:new             #702 <Class StdDelegatingSerializer>
	//   10   16:dup             
	//   11   17:aload_2         
	//   12   18:aload_2         
	//   13   19:aload_1         
	//   14   20:invokevirtual   #706 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//   15   23:invokeinterface #712 <Method JavaType Converter.getOutputType(TypeFactory)>
	//   16   28:aload_3         
	//   17   29:invokespecial   #715 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//   18   32:areturn         
	}

	protected Object findFilterId(SerializationConfig serializationconfig, BeanDescription beandescription)
	{
		return serializationconfig.getAnnotationIntrospector().findFilterId(((Annotated) (beandescription.getClassInfo())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #662 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #454 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//    4    8:invokevirtual   #718 <Method Object AnnotationIntrospector.findFilterId(Annotated)>
	//    5   11:areturn         
	}

	protected JsonSerializer findOptionalStdSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		return OptionalHandlerFactory.instance.findSerializer(serializerprovider.getConfig(), javatype, beandescription);
	//    0    0:getstatic       #724 <Field OptionalHandlerFactory OptionalHandlerFactory.instance>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #257 <Method SerializationConfig SerializerProvider.getConfig()>
	//    3    7:aload_2         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #725 <Method JsonSerializer OptionalHandlerFactory.findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//    6   12:areturn         
	}

	public JsonSerializer findReferenceSerializer(SerializerProvider serializerprovider, ReferenceType referencetype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		Object obj = ((Object) (referencetype.getContentType()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #728 <Method JavaType ReferenceType.getContentType()>
	//    2    4:astore          7
		TypeSerializer typeserializer = (TypeSerializer)((JavaType) (obj)).getTypeHandler();
	//    3    6:aload           7
	//    4    8:invokevirtual   #731 <Method Object JavaType.getTypeHandler()>
	//    5   11:checkcast       #733 <Class TypeSerializer>
	//    6   14:astore          5
		SerializationConfig serializationconfig = serializerprovider.getConfig();
	//    7   16:aload_1         
	//    8   17:invokevirtual   #257 <Method SerializationConfig SerializerProvider.getConfig()>
	//    9   20:astore          6
		if(typeserializer == null)
	//*  10   22:aload           5
	//*  11   24:ifnonnull       40
			typeserializer = createTypeSerializer(serializationconfig, ((JavaType) (obj)));
	//   12   27:aload_0         
	//   13   28:aload           6
	//   14   30:aload           7
	//   15   32:invokevirtual   #450 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   16   35:astore          5
	//*  17   37:goto            40
		obj = ((Object) ((JsonSerializer)((JavaType) (obj)).getValueHandler()));
	//   18   40:aload           7
	//   19   42:invokevirtual   #736 <Method Object JavaType.getValueHandler()>
	//   20   45:checkcast       #119 <Class JsonSerializer>
	//   21   48:astore          7
		for(Iterator iterator = customSerializers().iterator(); iterator.hasNext();)
	//*  22   50:aload_0         
	//*  23   51:invokevirtual   #296 <Method Iterable customSerializers()>
	//*  24   54:invokeinterface #299 <Method Iterator Iterable.iterator()>
	//*  25   59:astore          8
	//*  26   61:aload           8
	//*  27   63:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  28   68:ifeq            104
		{
			JsonSerializer jsonserializer = ((Serializers)iterator.next()).findReferenceSerializer(serializationconfig, referencetype, beandescription, typeserializer, ((JsonSerializer) (obj)));
	//   29   71:aload           8
	//   30   73:invokeinterface #112 <Method Object Iterator.next()>
	//   31   78:checkcast       #301 <Class Serializers>
	//   32   81:aload           6
	//   33   83:aload_2         
	//   34   84:aload_3         
	//   35   85:aload           5
	//   36   87:aload           7
	//   37   89:invokeinterface #739 <Method JsonSerializer Serializers.findReferenceSerializer(SerializationConfig, ReferenceType, BeanDescription, TypeSerializer, JsonSerializer)>
	//   38   94:astore          9
			if(jsonserializer != null)
	//*  39   96:aload           9
	//*  40   98:ifnull          61
				return jsonserializer;
	//   41  101:aload           9
	//   42  103:areturn         
		}

		if(referencetype.isTypeOrSubTypeOf(java/util/concurrent/atomic/AtomicReference))
	//*  43  104:aload_2         
	//*  44  105:ldc2            #354 <Class AtomicReference>
	//*  45  108:invokevirtual   #742 <Method boolean ReferenceType.isTypeOrSubTypeOf(Class)>
	//*  46  111:ifeq            128
			return buildAtomicReferenceSerializer(serializerprovider, referencetype, beandescription, flag, typeserializer, ((JsonSerializer) (obj)));
	//   47  114:aload_0         
	//   48  115:aload_1         
	//   49  116:aload_2         
	//   50  117:aload_3         
	//   51  118:iload           4
	//   52  120:aload           5
	//   53  122:aload           7
	//   54  124:invokevirtual   #744 <Method JsonSerializer buildAtomicReferenceSerializer(SerializerProvider, ReferenceType, BeanDescription, boolean, TypeSerializer, JsonSerializer)>
	//   55  127:areturn         
		else
			return null;
	//   56  128:aconst_null     
	//   57  129:areturn         
	}

	protected final JsonSerializer findSerializerByAddonType(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		Object obj = ((Object) (javatype.getRawClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//    2    4:astore          5
		if(((Class) (java/util/Iterator)).isAssignableFrom(((Class) (obj))))
	//*   3    6:ldc1            #104 <Class Iterator>
	//*   4    8:aload           5
	//*   5   10:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*   6   13:ifeq            69
		{
			obj = ((Object) (serializationconfig.getTypeFactory().findTypeParameters(javatype, java/util/Iterator)));
	//    7   16:aload_1         
	//    8   17:invokevirtual   #748 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//    9   20:aload_2         
	//   10   21:ldc1            #104 <Class Iterator>
	//   11   23:invokevirtual   #754 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//   12   26:astore          5
			if(obj != null && obj.length == 1)
	//*  13   28:aload           5
	//*  14   30:ifnull          52
	//*  15   33:aload           5
	//*  16   35:arraylength     
	//*  17   36:iconst_1        
	//*  18   37:icmpeq          43
	//*  19   40:goto            52
				obj = ((Object) (obj[0]));
	//   20   43:aload           5
	//   21   45:iconst_0        
	//   22   46:aaload          
	//   23   47:astore          5
			else
	//*  24   49:goto            57
				obj = ((Object) (TypeFactory.unknownType()));
	//   25   52:invokestatic    #757 <Method JavaType TypeFactory.unknownType()>
	//   26   55:astore          5
			return buildIteratorSerializer(serializationconfig, javatype, beandescription, flag, ((JavaType) (obj)));
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:aload_2         
	//   30   60:aload_3         
	//   31   61:iload           4
	//   32   63:aload           5
	//   33   65:invokevirtual   #759 <Method JsonSerializer buildIteratorSerializer(SerializationConfig, JavaType, BeanDescription, boolean, JavaType)>
	//   34   68:areturn         
		}
		if(((Class) (java/lang/Iterable)).isAssignableFrom(((Class) (obj))))
	//*  35   69:ldc2            #298 <Class Iterable>
	//*  36   72:aload           5
	//*  37   74:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  38   77:ifeq            134
		{
			obj = ((Object) (serializationconfig.getTypeFactory().findTypeParameters(javatype, java/lang/Iterable)));
	//   39   80:aload_1         
	//   40   81:invokevirtual   #748 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//   41   84:aload_2         
	//   42   85:ldc2            #298 <Class Iterable>
	//   43   88:invokevirtual   #754 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//   44   91:astore          5
			if(obj != null && obj.length == 1)
	//*  45   93:aload           5
	//*  46   95:ifnull          117
	//*  47   98:aload           5
	//*  48  100:arraylength     
	//*  49  101:iconst_1        
	//*  50  102:icmpeq          108
	//*  51  105:goto            117
				obj = ((Object) (obj[0]));
	//   52  108:aload           5
	//   53  110:iconst_0        
	//   54  111:aaload          
	//   55  112:astore          5
			else
	//*  56  114:goto            122
				obj = ((Object) (TypeFactory.unknownType()));
	//   57  117:invokestatic    #757 <Method JavaType TypeFactory.unknownType()>
	//   58  120:astore          5
			return buildIterableSerializer(serializationconfig, javatype, beandescription, flag, ((JavaType) (obj)));
	//   59  122:aload_0         
	//   60  123:aload_1         
	//   61  124:aload_2         
	//   62  125:aload_3         
	//   63  126:iload           4
	//   64  128:aload           5
	//   65  130:invokevirtual   #761 <Method JsonSerializer buildIterableSerializer(SerializationConfig, JavaType, BeanDescription, boolean, JavaType)>
	//   66  133:areturn         
		}
		if(((Class) (java/lang/CharSequence)).isAssignableFrom(((Class) (obj))))
	//*  67  134:ldc2            #763 <Class CharSequence>
	//*  68  137:aload           5
	//*  69  139:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  70  142:ifeq            149
			return ((JsonSerializer) (ToStringSerializer.instance));
	//   71  145:getstatic       #43  <Field ToStringSerializer ToStringSerializer.instance>
	//   72  148:areturn         
		else
			return null;
	//   73  149:aconst_null     
	//   74  150:areturn         
	}

	protected final JsonSerializer findSerializerByAnnotations(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException
	{
		if(((Class) (com/fasterxml/jackson/databind/JsonSerializable)).isAssignableFrom(javatype.getRawClass()))
	//*   0    0:ldc2            #766 <Class JsonSerializable>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//*   3    7:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*   4   10:ifeq            17
			return ((JsonSerializer) (SerializableSerializer.instance));
	//    5   13:getstatic       #771 <Field SerializableSerializer SerializableSerializer.instance>
	//    6   16:areturn         
		javatype = ((JavaType) (beandescription.findJsonValueAccessor()));
	//    7   17:aload_3         
	//    8   18:invokevirtual   #623 <Method AnnotatedMember BeanDescription.findJsonValueAccessor()>
	//    9   21:astore_2        
		if(javatype != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          62
		{
			if(serializerprovider.canOverrideAccessModifiers())
	//*  12   26:aload_1         
	//*  13   27:invokevirtual   #772 <Method boolean SerializerProvider.canOverrideAccessModifiers()>
	//*  14   30:ifeq            47
				ClassUtil.checkAndFixAccess(((AnnotatedMember) (javatype)).getMember(), serializerprovider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//   15   33:aload_2         
	//   16   34:invokevirtual   #635 <Method java.lang.reflect.Member AnnotatedMember.getMember()>
	//   17   37:aload_1         
	//   18   38:getstatic       #641 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   19   41:invokevirtual   #773 <Method boolean SerializerProvider.isEnabled(MapperFeature)>
	//   20   44:invokestatic    #648 <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
			return ((JsonSerializer) (new JsonValueSerializer(((AnnotatedMember) (javatype)), findSerializerFromAnnotation(serializerprovider, ((Annotated) (javatype))))));
	//   21   47:new             #650 <Class JsonValueSerializer>
	//   22   50:dup             
	//   23   51:aload_2         
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:aload_2         
	//   27   55:invokevirtual   #776 <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, Annotated)>
	//   28   58:invokespecial   #653 <Method void JsonValueSerializer(AnnotatedMember, JsonSerializer)>
	//   29   61:areturn         
		} else
		{
			return null;
	//   30   62:aconst_null     
	//   31   63:areturn         
		}
	}

	protected final JsonSerializer findSerializerByLookup(JavaType javatype, SerializationConfig serializationconfig, BeanDescription beandescription, boolean flag)
	{
		serializationconfig = ((SerializationConfig) (javatype.getRawClass().getName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//    2    4:invokevirtual   #30  <Method String Class.getName()>
	//    3    7:astore_2        
		javatype = ((JavaType) ((JsonSerializer)_concrete.get(((Object) (serializationconfig)))));
	//    4    8:getstatic       #128 <Field HashMap _concrete>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #782 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #119 <Class JsonSerializer>
	//    8   18:astore_1        
		if(javatype == null)
	//*   9   19:aload_1         
	//*  10   20:ifnonnull       47
		{
			serializationconfig = ((SerializationConfig) ((Class)_concreteLazy.get(((Object) (serializationconfig)))));
	//   11   23:getstatic       #130 <Field HashMap _concreteLazy>
	//   12   26:aload_2         
	//   13   27:invokevirtual   #782 <Method Object HashMap.get(Object)>
	//   14   30:checkcast       #26  <Class Class>
	//   15   33:astore_2        
			if(serializationconfig != null)
	//*  16   34:aload_2         
	//*  17   35:ifnull          47
				return (JsonSerializer)ClassUtil.createInstance(((Class) (serializationconfig)), false);
	//   18   38:aload_2         
	//   19   39:iconst_0        
	//   20   40:invokestatic    #786 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   21   43:checkcast       #119 <Class JsonSerializer>
	//   22   46:areturn         
		}
		return ((JsonSerializer) (javatype));
	//   23   47:aload_1         
	//   24   48:areturn         
	}

	protected final JsonSerializer findSerializerByPrimaryType(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		Object obj = ((Object) (javatype.getRawClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #275 <Method Class JavaType.getRawClass()>
	//    2    4:astore          5
		JsonSerializer jsonserializer = findOptionalStdSerializer(serializerprovider, javatype, beandescription, flag);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:iload           4
	//    8   12:invokevirtual   #790 <Method JsonSerializer findOptionalStdSerializer(SerializerProvider, JavaType, BeanDescription, boolean)>
	//    9   15:astore          6
		if(jsonserializer != null)
	//*  10   17:aload           6
	//*  11   19:ifnull          25
			return jsonserializer;
	//   12   22:aload           6
	//   13   24:areturn         
		if(((Class) (java/util/Calendar)).isAssignableFrom(((Class) (obj))))
	//*  14   25:ldc1            #78  <Class Calendar>
	//*  15   27:aload           5
	//*  16   29:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  17   32:ifeq            39
			return ((JsonSerializer) (CalendarSerializer.instance));
	//   18   35:getstatic       #83  <Field CalendarSerializer CalendarSerializer.instance>
	//   19   38:areturn         
		if(((Class) (java/util/Date)).isAssignableFrom(((Class) (obj))))
	//*  20   39:ldc1            #85  <Class Date>
	//*  21   41:aload           5
	//*  22   43:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  23   46:ifeq            53
			return ((JsonSerializer) (DateSerializer.instance));
	//   24   49:getstatic       #90  <Field DateSerializer DateSerializer.instance>
	//   25   52:areturn         
		if(((Class) (java/util/Map$Entry)).isAssignableFrom(((Class) (obj))))
	//*  26   53:ldc1            #114 <Class java.util.Map$Entry>
	//*  27   55:aload           5
	//*  28   57:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   60:ifeq            93
		{
			obj = ((Object) (javatype.findSuperType(java/util/Map$Entry)));
	//   30   63:aload_2         
	//   31   64:ldc1            #114 <Class java.util.Map$Entry>
	//   32   66:invokevirtual   #794 <Method JavaType JavaType.findSuperType(Class)>
	//   33   69:astore          5
			return buildMapEntrySerializer(serializerprovider, javatype, beandescription, flag, ((JavaType) (obj)).containedTypeOrUnknown(0), ((JavaType) (obj)).containedTypeOrUnknown(1));
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:aload_2         
	//   37   74:aload_3         
	//   38   75:iload           4
	//   39   77:aload           5
	//   40   79:iconst_0        
	//   41   80:invokevirtual   #798 <Method JavaType JavaType.containedTypeOrUnknown(int)>
	//   42   83:aload           5
	//   43   85:iconst_1        
	//   44   86:invokevirtual   #798 <Method JavaType JavaType.containedTypeOrUnknown(int)>
	//   45   89:invokevirtual   #800 <Method JsonSerializer buildMapEntrySerializer(SerializerProvider, JavaType, BeanDescription, boolean, JavaType, JavaType)>
	//   46   92:areturn         
		}
		if(((Class) (java/nio/ByteBuffer)).isAssignableFrom(((Class) (obj))))
	//*  47   93:ldc2            #802 <Class ByteBuffer>
	//*  48   96:aload           5
	//*  49   98:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  50  101:ifeq            112
			return ((JsonSerializer) (new ByteBufferSerializer()));
	//   51  104:new             #804 <Class ByteBufferSerializer>
	//   52  107:dup             
	//   53  108:invokespecial   #805 <Method void ByteBufferSerializer()>
	//   54  111:areturn         
		if(((Class) (java/net/InetAddress)).isAssignableFrom(((Class) (obj))))
	//*  55  112:ldc2            #807 <Class InetAddress>
	//*  56  115:aload           5
	//*  57  117:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  58  120:ifeq            131
			return ((JsonSerializer) (new InetAddressSerializer()));
	//   59  123:new             #809 <Class InetAddressSerializer>
	//   60  126:dup             
	//   61  127:invokespecial   #810 <Method void InetAddressSerializer()>
	//   62  130:areturn         
		if(((Class) (java/net/InetSocketAddress)).isAssignableFrom(((Class) (obj))))
	//*  63  131:ldc2            #812 <Class InetSocketAddress>
	//*  64  134:aload           5
	//*  65  136:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  66  139:ifeq            150
			return ((JsonSerializer) (new InetSocketAddressSerializer()));
	//   67  142:new             #814 <Class InetSocketAddressSerializer>
	//   68  145:dup             
	//   69  146:invokespecial   #815 <Method void InetSocketAddressSerializer()>
	//   70  149:areturn         
		if(((Class) (java/util/TimeZone)).isAssignableFrom(((Class) (obj))))
	//*  71  150:ldc2            #817 <Class TimeZone>
	//*  72  153:aload           5
	//*  73  155:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  74  158:ifeq            169
			return ((JsonSerializer) (new TimeZoneSerializer()));
	//   75  161:new             #819 <Class TimeZoneSerializer>
	//   76  164:dup             
	//   77  165:invokespecial   #820 <Method void TimeZoneSerializer()>
	//   78  168:areturn         
		if(((Class) (java/nio/charset/Charset)).isAssignableFrom(((Class) (obj))))
	//*  79  169:ldc2            #822 <Class Charset>
	//*  80  172:aload           5
	//*  81  174:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  82  177:ifeq            184
			return ((JsonSerializer) (ToStringSerializer.instance));
	//   83  180:getstatic       #43  <Field ToStringSerializer ToStringSerializer.instance>
	//   84  183:areturn         
		if(((Class) (java/lang/Number)).isAssignableFrom(((Class) (obj))))
	//*  85  184:ldc2            #824 <Class Number>
	//*  86  187:aload           5
	//*  87  189:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//*  88  192:ifeq            257
		{
			serializerprovider = ((SerializerProvider) (beandescription.findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null)))));
	//   89  195:aload_3         
	//   90  196:aconst_null     
	//   91  197:invokevirtual   #377 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   92  200:astore_1        
			if(serializerprovider != null)
	//*  93  201:aload_1         
	//*  94  202:ifnull          253
				switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape().ordinal()])
	//*  95  205:getstatic       #827 <Field int[] BasicSerializerFactory$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//*  96  208:aload_1         
	//*  97  209:invokevirtual   #383 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  98  212:invokevirtual   #828 <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//*  99  215:iaload          
				{
	//* 100  216:tableswitch     1 3: default 244
	//	               1 249
	//	               2 247
	//	               3 247
	//* 101  244:goto            253
				case 2: // '\002'
				case 3: // '\003'
					return null;
	//  102  247:aconst_null     
	//  103  248:areturn         

				case 1: // '\001'
					return ((JsonSerializer) (ToStringSerializer.instance));
	//  104  249:getstatic       #43  <Field ToStringSerializer ToStringSerializer.instance>
	//  105  252:areturn         
				}
			return ((JsonSerializer) (NumberSerializer.instance));
	//  106  253:getstatic       #831 <Field NumberSerializer NumberSerializer.instance>
	//  107  256:areturn         
		}
		if(((Class) (java/lang/Enum)).isAssignableFrom(((Class) (obj))))
	//* 108  257:ldc2            #833 <Class Enum>
	//* 109  260:aload           5
	//* 110  262:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//* 111  265:ifeq            279
			return buildEnumSerializer(serializerprovider.getConfig(), javatype, beandescription);
	//  112  268:aload_0         
	//  113  269:aload_1         
	//  114  270:invokevirtual   #257 <Method SerializationConfig SerializerProvider.getConfig()>
	//  115  273:aload_2         
	//  116  274:aload_3         
	//  117  275:invokevirtual   #835 <Method JsonSerializer buildEnumSerializer(SerializationConfig, JavaType, BeanDescription)>
	//  118  278:areturn         
		else
			return null;
	//  119  279:aconst_null     
	//  120  280:areturn         
	}

	protected JsonSerializer findSerializerFromAnnotation(SerializerProvider serializerprovider, Annotated annotated)
		throws JsonMappingException
	{
		Object obj = serializerprovider.getAnnotationIntrospector().findSerializer(annotated);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #241 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #837 <Method Object AnnotationIntrospector.findSerializer(Annotated)>
	//    4    8:astore_3        
		if(obj == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		else
			return findConvertingSerializer(serializerprovider, annotated, serializerprovider.serializerInstance(annotated, obj));
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:aload_2         
	//   12   18:aload_1         
	//   13   19:aload_2         
	//   14   20:aload_3         
	//   15   21:invokevirtual   #251 <Method JsonSerializer SerializerProvider.serializerInstance(Annotated, Object)>
	//   16   24:invokevirtual   #839 <Method JsonSerializer findConvertingSerializer(SerializerProvider, Annotated, JsonSerializer)>
	//   17   27:areturn         
	}

	protected boolean isIndexedList(Class class1)
	{
		return ((Class) (java/util/RandomAccess)).isAssignableFrom(class1);
	//    0    0:ldc2            #841 <Class RandomAccess>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #398 <Method boolean Class.isAssignableFrom(Class)>
	//    3    7:ireturn         
	}

	protected boolean usesStaticTyping(SerializationConfig serializationconfig, BeanDescription beandescription, TypeSerializer typeserializer)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(typeserializer != null)
	//*   2    3:aload_3         
	//*   3    4:ifnull          9
			return false;
	//    4    7:iconst_0        
	//    5    8:ireturn         
		beandescription = ((BeanDescription) (serializationconfig.getAnnotationIntrospector().findSerializationTyping(((Annotated) (beandescription.getClassInfo())))));
	//    6    9:aload_1         
	//    7   10:invokevirtual   #662 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    8   13:aload_2         
	//    9   14:invokevirtual   #454 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   10   17:invokevirtual   #848 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(Annotated)>
	//   11   20:astore_2        
		if(beandescription != null && beandescription != com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DEFAULT_TYPING)
	//*  12   21:aload_2         
	//*  13   22:ifnull          45
	//*  14   25:aload_2         
	//*  15   26:getstatic       #854 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.DEFAULT_TYPING>
	//*  16   29:if_acmpeq       45
		{
			if(beandescription == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC)
	//*  17   32:aload_2         
	//*  18   33:getstatic       #857 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.STATIC>
	//*  19   36:if_acmpne       42
				flag = true;
	//   20   39:iconst_1        
	//   21   40:istore          4
			return flag;
	//   22   42:iload           4
	//   23   44:ireturn         
		} else
		{
			return serializationconfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
	//   24   45:aload_1         
	//   25   46:getstatic       #860 <Field MapperFeature MapperFeature.USE_STATIC_TYPING>
	//   26   49:invokevirtual   #644 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//   27   52:ireturn         
		}
	}

	public final SerializerFactory withAdditionalKeySerializers(Serializers serializers)
	{
		return withConfig(_factoryConfig.withAdditionalKeySerializers(serializers));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #865 <Method SerializerFactoryConfig SerializerFactoryConfig.withAdditionalKeySerializers(Serializers)>
	//    5    9:invokevirtual   #869 <Method SerializerFactory withConfig(SerializerFactoryConfig)>
	//    6   12:areturn         
	}

	public final SerializerFactory withAdditionalSerializers(Serializers serializers)
	{
		return withConfig(_factoryConfig.withAdditionalSerializers(serializers));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #872 <Method SerializerFactoryConfig SerializerFactoryConfig.withAdditionalSerializers(Serializers)>
	//    5    9:invokevirtual   #869 <Method SerializerFactory withConfig(SerializerFactoryConfig)>
	//    6   12:areturn         
	}

	public abstract SerializerFactory withConfig(SerializerFactoryConfig serializerfactoryconfig);

	public final SerializerFactory withSerializerModifier(BeanSerializerModifier beanserializermodifier)
	{
		return withConfig(_factoryConfig.withSerializerModifier(beanserializermodifier));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #138 <Field SerializerFactoryConfig _factoryConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #877 <Method SerializerFactoryConfig SerializerFactoryConfig.withSerializerModifier(BeanSerializerModifier)>
	//    5    9:invokevirtual   #869 <Method SerializerFactory withConfig(SerializerFactoryConfig)>
	//    6   12:areturn         
	}

	protected static final HashMap _concrete;
	protected static final HashMap _concreteLazy;
	protected final SerializerFactoryConfig _factoryConfig;

	static 
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #19  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void HashMap()>
	//    3    7:astore_0        
		HashMap hashmap1 = new HashMap();
	//    4    8:new             #19  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #22  <Method void HashMap()>
	//    7   15:astore_1        
		hashmap1.put(((Object) (((Class) (java/lang/String)).getName())), ((Object) (new StringSerializer())));
	//    8   16:aload_1         
	//    9   17:ldc1            #24  <Class String>
	//   10   19:invokevirtual   #30  <Method String Class.getName()>
	//   11   22:new             #32  <Class StringSerializer>
	//   12   25:dup             
	//   13   26:invokespecial   #33  <Method void StringSerializer()>
	//   14   29:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   15   32:pop             
		ToStringSerializer tostringserializer = ToStringSerializer.instance;
	//   16   33:getstatic       #43  <Field ToStringSerializer ToStringSerializer.instance>
	//   17   36:astore_2        
		hashmap1.put(((Object) (((Class) (java/lang/StringBuffer)).getName())), ((Object) (tostringserializer)));
	//   18   37:aload_1         
	//   19   38:ldc1            #45  <Class StringBuffer>
	//   20   40:invokevirtual   #30  <Method String Class.getName()>
	//   21   43:aload_2         
	//   22   44:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   23   47:pop             
		hashmap1.put(((Object) (((Class) (java/lang/StringBuilder)).getName())), ((Object) (tostringserializer)));
	//   24   48:aload_1         
	//   25   49:ldc1            #47  <Class StringBuilder>
	//   26   51:invokevirtual   #30  <Method String Class.getName()>
	//   27   54:aload_2         
	//   28   55:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   29   58:pop             
		hashmap1.put(((Object) (((Class) (java/lang/Character)).getName())), ((Object) (tostringserializer)));
	//   30   59:aload_1         
	//   31   60:ldc1            #49  <Class Character>
	//   32   62:invokevirtual   #30  <Method String Class.getName()>
	//   33   65:aload_2         
	//   34   66:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   35   69:pop             
		hashmap1.put(((Object) (Character.TYPE.getName())), ((Object) (tostringserializer)));
	//   36   70:aload_1         
	//   37   71:getstatic       #53  <Field Class Character.TYPE>
	//   38   74:invokevirtual   #30  <Method String Class.getName()>
	//   39   77:aload_2         
	//   40   78:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   41   81:pop             
		NumberSerializers.addAll(((Map) (hashmap1)));
	//   42   82:aload_1         
	//   43   83:invokestatic    #59  <Method void NumberSerializers.addAll(Map)>
		hashmap1.put(((Object) (Boolean.TYPE.getName())), ((Object) (new BooleanSerializer(true))));
	//   44   86:aload_1         
	//   45   87:getstatic       #62  <Field Class Boolean.TYPE>
	//   46   90:invokevirtual   #30  <Method String Class.getName()>
	//   47   93:new             #64  <Class BooleanSerializer>
	//   48   96:dup             
	//   49   97:iconst_1        
	//   50   98:invokespecial   #67  <Method void BooleanSerializer(boolean)>
	//   51  101:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   52  104:pop             
		hashmap1.put(((Object) (((Class) (java/lang/Boolean)).getName())), ((Object) (new BooleanSerializer(false))));
	//   53  105:aload_1         
	//   54  106:ldc1            #61  <Class Boolean>
	//   55  108:invokevirtual   #30  <Method String Class.getName()>
	//   56  111:new             #64  <Class BooleanSerializer>
	//   57  114:dup             
	//   58  115:iconst_0        
	//   59  116:invokespecial   #67  <Method void BooleanSerializer(boolean)>
	//   60  119:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   61  122:pop             
		hashmap1.put(((Object) (((Class) (java/math/BigInteger)).getName())), ((Object) (new NumberSerializer(java/math/BigInteger))));
	//   62  123:aload_1         
	//   63  124:ldc1            #69  <Class BigInteger>
	//   64  126:invokevirtual   #30  <Method String Class.getName()>
	//   65  129:new             #71  <Class NumberSerializer>
	//   66  132:dup             
	//   67  133:ldc1            #69  <Class BigInteger>
	//   68  135:invokespecial   #74  <Method void NumberSerializer(Class)>
	//   69  138:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   70  141:pop             
		hashmap1.put(((Object) (((Class) (java/math/BigDecimal)).getName())), ((Object) (new NumberSerializer(java/math/BigDecimal))));
	//   71  142:aload_1         
	//   72  143:ldc1            #76  <Class BigDecimal>
	//   73  145:invokevirtual   #30  <Method String Class.getName()>
	//   74  148:new             #71  <Class NumberSerializer>
	//   75  151:dup             
	//   76  152:ldc1            #76  <Class BigDecimal>
	//   77  154:invokespecial   #74  <Method void NumberSerializer(Class)>
	//   78  157:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   79  160:pop             
		hashmap1.put(((Object) (((Class) (java/util/Calendar)).getName())), ((Object) (CalendarSerializer.instance)));
	//   80  161:aload_1         
	//   81  162:ldc1            #78  <Class Calendar>
	//   82  164:invokevirtual   #30  <Method String Class.getName()>
	//   83  167:getstatic       #83  <Field CalendarSerializer CalendarSerializer.instance>
	//   84  170:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   85  173:pop             
		hashmap1.put(((Object) (((Class) (java/util/Date)).getName())), ((Object) (DateSerializer.instance)));
	//   86  174:aload_1         
	//   87  175:ldc1            #85  <Class Date>
	//   88  177:invokevirtual   #30  <Method String Class.getName()>
	//   89  180:getstatic       #90  <Field DateSerializer DateSerializer.instance>
	//   90  183:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//   91  186:pop             
		for(Iterator iterator = StdJdkSerializers.all().iterator(); iterator.hasNext();)
	//*  92  187:invokestatic    #96  <Method Collection StdJdkSerializers.all()>
	//*  93  190:invokeinterface #102 <Method Iterator Collection.iterator()>
	//*  94  195:astore_2        
	//*  95  196:aload_2         
	//*  96  197:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  97  202:ifeq            285
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   98  205:aload_2         
	//   99  206:invokeinterface #112 <Method Object Iterator.next()>
	//  100  211:checkcast       #114 <Class java.util.Map$Entry>
	//  101  214:astore_3        
			Object obj = entry.getValue();
	//  102  215:aload_3         
	//  103  216:invokeinterface #117 <Method Object java.util.Map$Entry.getValue()>
	//  104  221:astore          4
			if(obj instanceof JsonSerializer)
	//* 105  223:aload           4
	//* 106  225:instanceof      #119 <Class JsonSerializer>
	//* 107  228:ifeq            256
			{
				hashmap1.put(((Object) (((Class)entry.getKey()).getName())), ((Object) ((JsonSerializer)obj)));
	//  108  231:aload_1         
	//  109  232:aload_3         
	//  110  233:invokeinterface #122 <Method Object java.util.Map$Entry.getKey()>
	//  111  238:checkcast       #26  <Class Class>
	//  112  241:invokevirtual   #30  <Method String Class.getName()>
	//  113  244:aload           4
	//  114  246:checkcast       #119 <Class JsonSerializer>
	//  115  249:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//  116  252:pop             
			} else
	//* 117  253:goto            196
			{
				obj = ((Object) ((Class)obj));
	//  118  256:aload           4
	//  119  258:checkcast       #26  <Class Class>
	//  120  261:astore          4
				hashmap.put(((Object) (((Class)entry.getKey()).getName())), obj);
	//  121  263:aload_0         
	//  122  264:aload_3         
	//  123  265:invokeinterface #122 <Method Object java.util.Map$Entry.getKey()>
	//  124  270:checkcast       #26  <Class Class>
	//  125  273:invokevirtual   #30  <Method String Class.getName()>
	//  126  276:aload           4
	//  127  278:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//  128  281:pop             
			}
		}

	//* 129  282:goto            196
		hashmap.put(((Object) (((Class) (com/fasterxml/jackson/databind/util/TokenBuffer)).getName())), com/fasterxml/jackson/databind/ser/std/TokenBufferSerializer);
	//  130  285:aload_0         
	//  131  286:ldc1            #124 <Class TokenBuffer>
	//  132  288:invokevirtual   #30  <Method String Class.getName()>
	//  133  291:ldc1            #126 <Class TokenBufferSerializer>
	//  134  293:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//  135  296:pop             
		_concrete = hashmap1;
	//  136  297:aload_1         
	//  137  298:putstatic       #128 <Field HashMap _concrete>
		_concreteLazy = hashmap;
	//  138  301:aload_0         
	//  139  302:putstatic       #130 <Field HashMap _concreteLazy>
	//* 140  305:return          
	}
}
