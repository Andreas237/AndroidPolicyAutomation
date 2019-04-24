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

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			SerializerFactory, Serializers, BeanSerializerModifier, ContainerSerializer

public abstract class BasicSerializerFactory extends SerializerFactory
	implements Serializable
{

	protected BasicSerializerFactory(SerializerFactoryConfig serializerfactoryconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #154 <Method void SerializerFactory()>
		SerializerFactoryConfig serializerfactoryconfig1 = serializerfactoryconfig;
	//    2    4:aload_1         
	//    3    5:astore_2        
		if(serializerfactoryconfig == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       18
			serializerfactoryconfig1 = new SerializerFactoryConfig();
	//    6   10:new             #156 <Class SerializerFactoryConfig>
	//    7   13:dup             
	//    8   14:invokespecial   #157 <Method void SerializerFactoryConfig()>
	//    9   17:astore_2        
		_factoryConfig = serializerfactoryconfig1;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//   13   23:return          
	}

	protected JsonSerializer _findContentSerializer(SerializerProvider serializerprovider, Annotated annotated)
		throws JsonMappingException
	{
		Object obj = serializerprovider.getAnnotationIntrospector().findContentSerializer(annotated);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #169 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #175 <Method Object AnnotationIntrospector.findContentSerializer(Annotated)>
	//    4    8:astore_3        
		if(obj != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          20
			return serializerprovider.serializerInstance(annotated, obj);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #179 <Method JsonSerializer SerializerProvider.serializerInstance(Annotated, Object)>
	//   11   19:areturn         
		else
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
	}

	protected JsonSerializer _findKeySerializer(SerializerProvider serializerprovider, Annotated annotated)
		throws JsonMappingException
	{
		Object obj = serializerprovider.getAnnotationIntrospector().findKeySerializer(annotated);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #169 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #186 <Method Object AnnotationIntrospector.findKeySerializer(Annotated)>
	//    4    8:astore_3        
		if(obj != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          20
			return serializerprovider.serializerInstance(annotated, obj);
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #179 <Method JsonSerializer SerializerProvider.serializerInstance(Annotated, Object)>
	//   11   19:areturn         
		else
			return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
	}

	protected Class _verifyAsClass(Object obj, String s, Class class1)
	{
		if(obj != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       8
_L1:
		obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
_L4:
		return ((Class) (obj));
	//    4    6:aload_1         
	//    5    7:areturn         
_L2:
		if(!(obj instanceof Class))
	//*   6    8:aload_1         
	//*   7    9:instanceof      #26  <Class Class>
	//*   8   12:ifne            62
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector.").append(s).append("() returned value of type ").append(obj.getClass().getName()).append(": expected type JsonSerializer or Class<JsonSerializer> instead").toString());
	//    9   15:new             #124 <Class IllegalStateException>
	//   10   18:dup             
	//   11   19:new             #47  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #125 <Method void StringBuilder()>
	//   14   26:ldc1            #190 <String "AnnotationIntrospector.">
	//   15   28:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:aload_2         
	//   17   32:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:ldc1            #192 <String "() returned value of type ">
	//   19   37:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #137 <Method Class Object.getClass()>
	//   22   44:invokevirtual   #30  <Method String Class.getName()>
	//   23   47:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   24   50:ldc1            #194 <String ": expected type JsonSerializer or Class<JsonSerializer> instead">
	//   25   52:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   26   55:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   27   58:invokespecial   #143 <Method void IllegalStateException(String)>
	//   28   61:athrow          
		s = ((String) ((Class)obj));
	//   29   62:aload_1         
	//   30   63:checkcast       #26  <Class Class>
	//   31   66:astore_2        
		if(s == class1)
			break; /* Loop/switch isn't completed */
	//   32   67:aload_2         
	//   33   68:aload_3         
	//   34   69:if_acmpeq       81
		obj = ((Object) (s));
	//   35   72:aload_2         
	//   36   73:astore_1        
		if(!ClassUtil.isBogusClass(((Class) (s)))) goto _L4; else goto _L3
	//   37   74:aload_2         
	//   38   75:invokestatic    #200 <Method boolean ClassUtil.isBogusClass(Class)>
	//   39   78:ifeq            6
_L3:
		return null;
	//   40   81:aconst_null     
	//   41   82:areturn         
	}

	protected JsonSerializer buildArraySerializer(SerializerProvider serializerprovider, ArrayType arraytype, BeanDescription beandescription, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		SerializationConfig serializationconfig = serializerprovider.getConfig();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore          8
		Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore          7
		Iterator iterator = customSerializers().iterator();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #211 <Method Iterable customSerializers()>
	//    7   13:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//    8   18:astore          9
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
	//   14   37:checkcast       #216 <Class Serializers>
	//   15   40:aload           8
	//   16   42:aload_2         
	//   17   43:aload_3         
	//   18   44:aload           5
	//   19   46:aload           6
	//   20   48:invokeinterface #220 <Method JsonSerializer Serializers.findArraySerializer(SerializationConfig, ArrayType, BeanDescription, TypeSerializer, JsonSerializer)>
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
	//*  31   69:ifnonnull       127
		{
			serializerprovider = ((SerializerProvider) (arraytype.getRawClass()));
	//   32   72:aload_2         
	//   33   73:invokevirtual   #225 <Method Class ArrayType.getRawClass()>
	//   34   76:astore_1        
			if(jsonserializer == null || ClassUtil.isJacksonStdImpl(((Object) (jsonserializer))))
	//*  35   77:aload           6
	//*  36   79:ifnull          90
	//*  37   82:aload           6
	//*  38   84:invokestatic    #229 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//*  39   87:ifeq            101
				if([Ljava/lang/String; == serializerprovider)
	//*  40   90:ldc1            #231 <Class String[]>
	//*  41   92:aload_1         
	//*  42   93:if_acmpne       189
					obj = ((Object) (StringArraySerializer.instance));
	//   43   96:getstatic       #236 <Field StringArraySerializer StringArraySerializer.instance>
	//   44   99:astore          7
				else
	//*  45  101:aload           7
	//*  46  103:astore_1        
	//*  47  104:aload           7
	//*  48  106:ifnonnull       127
	//*  49  109:new             #238 <Class ObjectArraySerializer>
	//*  50  112:dup             
	//*  51  113:aload_2         
	//*  52  114:invokevirtual   #242 <Method JavaType ArrayType.getContentType()>
	//*  53  117:iload           4
	//*  54  119:aload           5
	//*  55  121:aload           6
	//*  56  123:invokespecial   #245 <Method void ObjectArraySerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//*  57  126:astore_1        
	//*  58  127:aload_1         
	//*  59  128:astore          5
	//*  60  130:aload_0         
	//*  61  131:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//*  62  134:invokevirtual   #248 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  63  137:ifeq            198
	//*  64  140:aload_0         
	//*  65  141:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//*  66  144:invokevirtual   #251 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//*  67  147:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//*  68  152:astore          6
	//*  69  154:aload_1         
	//*  70  155:astore          5
	//*  71  157:aload           6
	//*  72  159:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//*  73  164:ifeq            198
	//*  74  167:aload           6
	//*  75  169:invokeinterface #112 <Method Object Iterator.next()>
	//*  76  174:checkcast       #253 <Class BeanSerializerModifier>
	//*  77  177:aload           8
	//*  78  179:aload_2         
	//*  79  180:aload_3         
	//*  80  181:aload_1         
	//*  81  182:invokevirtual   #257 <Method JsonSerializer BeanSerializerModifier.modifyArraySerializer(SerializationConfig, ArrayType, BeanDescription, JsonSerializer)>
	//*  82  185:astore_1        
	//*  83  186:goto            154
					obj = ((Object) (StdArraySerializers.findStandardImpl(((Class) (serializerprovider)))));
	//   84  189:aload_1         
	//   85  190:invokestatic    #263 <Method JsonSerializer StdArraySerializers.findStandardImpl(Class)>
	//   86  193:astore          7
			serializerprovider = ((SerializerProvider) (obj));
			if(obj == null)
				serializerprovider = ((SerializerProvider) (new ObjectArraySerializer(arraytype.getContentType(), flag, typeserializer, jsonserializer)));
		}
		typeserializer = ((TypeSerializer) (serializerprovider));
		if(_factoryConfig.hasSerializerModifiers())
		{
			jsonserializer = ((JsonSerializer) (_factoryConfig.serializerModifiers().iterator()));
			do
			{
				typeserializer = ((TypeSerializer) (serializerprovider));
				if(!((Iterator) (jsonserializer)).hasNext())
					break;
				serializerprovider = ((SerializerProvider) (((BeanSerializerModifier)((Iterator) (jsonserializer)).next()).modifyArraySerializer(serializationconfig, arraytype, beandescription, ((JsonSerializer) (serializerprovider)))));
			} while(true);
		}
	//*  87  195:goto            101
		return ((JsonSerializer) (typeserializer));
	//   88  198:aload           5
	//   89  200:areturn         
	}

	protected JsonSerializer buildCollectionSerializer(SerializerProvider serializerprovider, CollectionType collectiontype, BeanDescription beandescription, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		Object obj;
		JsonSerializer jsonserializer1;
		SerializationConfig serializationconfig;
		serializationconfig = serializerprovider.getConfig();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore          9
		obj = null;
	//    3    6:aconst_null     
	//    4    7:astore          7
		Iterator iterator = customSerializers().iterator();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #211 <Method Iterable customSerializers()>
	//    7   13:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//    8   18:astore          10
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
	//   16   41:checkcast       #216 <Class Serializers>
	//   17   44:aload           9
	//   18   46:aload_2         
	//   19   47:aload_3         
	//   20   48:aload           5
	//   21   50:aload           6
	//   22   52:invokeinterface #270 <Method JsonSerializer Serializers.findCollectionSerializer(SerializationConfig, CollectionType, BeanDescription, TypeSerializer, JsonSerializer)>
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
		if(jsonserializer1 != null) goto _L2; else goto _L1
	//   30   72:aload           8
	//   31   74:ifnonnull       158
_L1:
		jsonserializer1 = findSerializerByAnnotations(serializerprovider, ((JavaType) (collectiontype)), beandescription);
	//   32   77:aload_0         
	//   33   78:aload_1         
	//   34   79:aload_2         
	//   35   80:aload_3         
	//   36   81:invokevirtual   #274 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//   37   84:astore          8
		obj = ((Object) (jsonserializer1));
	//   38   86:aload           8
	//   39   88:astore          7
		if(jsonserializer1 != null) goto _L2; else goto _L3
	//   40   90:aload           8
	//   41   92:ifnonnull       158
_L3:
		serializerprovider = ((SerializerProvider) (beandescription.findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null)))));
	//   42   95:aload_3         
	//   43   96:aconst_null     
	//   44   97:invokevirtual   #280 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   45  100:astore_1        
		if(serializerprovider != null && ((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT)
	//*  46  101:aload_1         
	//*  47  102:ifnull          117
	//*  48  105:aload_1         
	//*  49  106:invokevirtual   #286 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//*  50  109:getstatic       #292 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
	//*  51  112:if_acmpne       117
			return null;
	//   52  115:aconst_null     
	//   53  116:areturn         
		serializerprovider = ((SerializerProvider) (collectiontype.getRawClass()));
	//   54  117:aload_2         
	//   55  118:invokevirtual   #295 <Method Class CollectionType.getRawClass()>
	//   56  121:astore_1        
		if(!((Class) (java/util/EnumSet)).isAssignableFrom(((Class) (serializerprovider)))) goto _L5; else goto _L4
	//   57  122:ldc2            #297 <Class EnumSet>
	//   58  125:aload_1         
	//   59  126:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//   60  129:ifeq            222
_L4:
		typeserializer = ((TypeSerializer) (collectiontype.getContentType()));
	//   61  132:aload_2         
	//   62  133:invokevirtual   #301 <Method JavaType CollectionType.getContentType()>
	//   63  136:astore          5
		serializerprovider = ((SerializerProvider) (typeserializer));
	//   64  138:aload           5
	//   65  140:astore_1        
		if(!((JavaType) (typeserializer)).isEnumType())
	//*  66  141:aload           5
	//*  67  143:invokevirtual   #306 <Method boolean JavaType.isEnumType()>
	//*  68  146:ifne            151
			serializerprovider = null;
	//   69  149:aconst_null     
	//   70  150:astore_1        
		obj = ((Object) (buildEnumSetSerializer(((JavaType) (serializerprovider)))));
	//   71  151:aload_0         
	//   72  152:aload_1         
	//   73  153:invokevirtual   #310 <Method JsonSerializer buildEnumSetSerializer(JavaType)>
	//   74  156:astore          7
_L2:
		serializerprovider = ((SerializerProvider) (obj));
	//   75  158:aload           7
	//   76  160:astore_1        
		if(_factoryConfig.hasSerializerModifiers())
	//*  77  161:aload_0         
	//*  78  162:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//*  79  165:invokevirtual   #248 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  80  168:ifeq            343
		{
			typeserializer = ((TypeSerializer) (_factoryConfig.serializerModifiers().iterator()));
	//   81  171:aload_0         
	//   82  172:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//   83  175:invokevirtual   #251 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//   84  178:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//   85  183:astore          5
			do
			{
				serializerprovider = ((SerializerProvider) (obj));
	//   86  185:aload           7
	//   87  187:astore_1        
				if(!((Iterator) (typeserializer)).hasNext())
					break;
	//   88  188:aload           5
	//   89  190:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   90  195:ifeq            343
				obj = ((Object) (((BeanSerializerModifier)((Iterator) (typeserializer)).next()).modifyCollectionSerializer(serializationconfig, collectiontype, beandescription, ((JsonSerializer) (obj)))));
	//   91  198:aload           5
	//   92  200:invokeinterface #112 <Method Object Iterator.next()>
	//   93  205:checkcast       #253 <Class BeanSerializerModifier>
	//   94  208:aload           9
	//   95  210:aload_2         
	//   96  211:aload_3         
	//   97  212:aload           7
	//   98  214:invokevirtual   #314 <Method JsonSerializer BeanSerializerModifier.modifyCollectionSerializer(SerializationConfig, CollectionType, BeanDescription, JsonSerializer)>
	//   99  217:astore          7
			} while(true);
	//  100  219:goto            185
		}
		  goto _L6
_L5:
		obj = ((Object) (collectiontype.getContentType().getRawClass()));
	//  101  222:aload_2         
	//  102  223:invokevirtual   #301 <Method JavaType CollectionType.getContentType()>
	//  103  226:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//  104  229:astore          7
		if(!isIndexedList(((Class) (serializerprovider)))) goto _L8; else goto _L7
	//  105  231:aload_0         
	//  106  232:aload_1         
	//  107  233:invokevirtual   #318 <Method boolean isIndexedList(Class)>
	//  108  236:ifeq            310
_L7:
		if(obj != java/lang/String) goto _L10; else goto _L9
	//  109  239:aload           7
	//  110  241:ldc1            #24  <Class String>
	//  111  243:if_acmpne       292
_L9:
label0:
		{
			if(jsonserializer != null)
	//* 112  246:aload           6
	//* 113  248:ifnull          262
			{
				serializerprovider = ((SerializerProvider) (jsonserializer1));
	//  114  251:aload           8
	//  115  253:astore_1        
				if(!ClassUtil.isJacksonStdImpl(((Object) (jsonserializer))))
					break label0;
	//  116  254:aload           6
	//  117  256:invokestatic    #229 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//  118  259:ifeq            266
			}
			serializerprovider = ((SerializerProvider) (IndexedStringListSerializer.instance));
	//  119  262:getstatic       #323 <Field IndexedStringListSerializer IndexedStringListSerializer.instance>
	//  120  265:astore_1        
		}
_L11:
		obj = ((Object) (serializerprovider));
	//  121  266:aload_1         
	//  122  267:astore          7
		if(serializerprovider == null)
	//* 123  269:aload_1         
	//* 124  270:ifnonnull       158
			obj = ((Object) (buildCollectionSerializer(collectiontype.getContentType(), flag, typeserializer, jsonserializer)));
	//  125  273:aload_0         
	//  126  274:aload_2         
	//  127  275:invokevirtual   #301 <Method JavaType CollectionType.getContentType()>
	//  128  278:iload           4
	//  129  280:aload           5
	//  130  282:aload           6
	//  131  284:invokevirtual   #326 <Method ContainerSerializer buildCollectionSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//  132  287:astore          7
		continue; /* Loop/switch isn't completed */
	//  133  289:goto            158
_L10:
		serializerprovider = ((SerializerProvider) (buildIndexedListSerializer(collectiontype.getContentType(), flag, typeserializer, jsonserializer)));
	//  134  292:aload_0         
	//  135  293:aload_2         
	//  136  294:invokevirtual   #301 <Method JavaType CollectionType.getContentType()>
	//  137  297:iload           4
	//  138  299:aload           5
	//  139  301:aload           6
	//  140  303:invokevirtual   #329 <Method ContainerSerializer buildIndexedListSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//  141  306:astore_1        
		continue; /* Loop/switch isn't completed */
	//  142  307:goto            266
_L8:
		serializerprovider = ((SerializerProvider) (jsonserializer1));
	//  143  310:aload           8
	//  144  312:astore_1        
		if(obj != java/lang/String)
			continue; /* Loop/switch isn't completed */
	//  145  313:aload           7
	//  146  315:ldc1            #24  <Class String>
	//  147  317:if_acmpne       266
		if(jsonserializer != null)
	//* 148  320:aload           6
	//* 149  322:ifnull          336
		{
			serializerprovider = ((SerializerProvider) (jsonserializer1));
	//  150  325:aload           8
	//  151  327:astore_1        
			if(!ClassUtil.isJacksonStdImpl(((Object) (jsonserializer))))
				continue; /* Loop/switch isn't completed */
	//  152  328:aload           6
	//  153  330:invokestatic    #229 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//  154  333:ifeq            266
		}
		serializerprovider = ((SerializerProvider) (StringCollectionSerializer.instance));
	//  155  336:getstatic       #334 <Field StringCollectionSerializer StringCollectionSerializer.instance>
	//  156  339:astore_1        
		if(true) goto _L11; else goto _L6
	//  157  340:goto            266
_L6:
		return ((JsonSerializer) (serializerprovider));
	//  158  343:aload_1         
	//  159  344:areturn         
		if(true) goto _L2; else goto _L12
_L12:
	}

	public ContainerSerializer buildCollectionSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return ((ContainerSerializer) (new CollectionSerializer(javatype, flag, typeserializer, jsonserializer)));
	//    0    0:new             #337 <Class CollectionSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #338 <Method void CollectionSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    7   12:areturn         
	}

	protected JsonSerializer buildContainerSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		boolean flag1;
		SerializationConfig serializationconfig;
		TypeSerializer typeserializer;
		JsonSerializer jsonserializer3;
label0:
		{
			serializationconfig = serializerprovider.getConfig();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore          8
			flag1 = flag;
	//    3    6:iload           4
	//    4    8:istore          5
			if(flag)
				break label0;
	//    5   10:iload           4
	//    6   12:ifne            52
			flag1 = flag;
	//    7   15:iload           4
	//    8   17:istore          5
			if(!javatype.useStaticType())
				break label0;
	//    9   19:aload_2         
	//   10   20:invokevirtual   #344 <Method boolean JavaType.useStaticType()>
	//   11   23:ifeq            52
			if(javatype.isContainerType())
	//*  12   26:aload_2         
	//*  13   27:invokevirtual   #347 <Method boolean JavaType.isContainerType()>
	//*  14   30:ifeq            49
			{
				flag1 = flag;
	//   15   33:iload           4
	//   16   35:istore          5
				if(javatype.getContentType().getRawClass() == java/lang/Object)
					break label0;
	//   17   37:aload_2         
	//   18   38:invokevirtual   #348 <Method JavaType JavaType.getContentType()>
	//   19   41:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//   20   44:ldc1            #133 <Class Object>
	//   21   46:if_acmpeq       52
			}
			flag1 = true;
	//   22   49:iconst_1        
	//   23   50:istore          5
		}
		typeserializer = createTypeSerializer(serializationconfig, javatype.getContentType());
	//   24   52:aload_0         
	//   25   53:aload           8
	//   26   55:aload_2         
	//   27   56:invokevirtual   #348 <Method JavaType JavaType.getContentType()>
	//   28   59:invokevirtual   #352 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   29   62:astore          9
		if(typeserializer != null)
	//*  30   64:aload           9
	//*  31   66:ifnull          72
			flag1 = false;
	//   32   69:iconst_0        
	//   33   70:istore          5
		jsonserializer3 = _findContentSerializer(serializerprovider, ((Annotated) (beandescription.getClassInfo())));
	//   34   72:aload_0         
	//   35   73:aload_1         
	//   36   74:aload_3         
	//   37   75:invokevirtual   #356 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   38   78:invokevirtual   #358 <Method JsonSerializer _findContentSerializer(SerializerProvider, Annotated)>
	//   39   81:astore          10
		if(!javatype.isMapLikeType()) goto _L2; else goto _L1
	//   40   83:aload_2         
	//   41   84:invokevirtual   #361 <Method boolean JavaType.isMapLikeType()>
	//   42   87:ifeq            296
_L1:
		MapLikeType mapliketype;
		JsonSerializer jsonserializer4;
		mapliketype = (MapLikeType)javatype;
	//   43   90:aload_2         
	//   44   91:checkcast       #363 <Class MapLikeType>
	//   45   94:astore          6
		jsonserializer4 = _findKeySerializer(serializerprovider, ((Annotated) (beandescription.getClassInfo())));
	//   46   96:aload_0         
	//   47   97:aload_1         
	//   48   98:aload_3         
	//   49   99:invokevirtual   #356 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   50  102:invokevirtual   #365 <Method JsonSerializer _findKeySerializer(SerializerProvider, Annotated)>
	//   51  105:astore          12
		if(!mapliketype.isTrueMapType()) goto _L4; else goto _L3
	//   52  107:aload           6
	//   53  109:invokevirtual   #368 <Method boolean MapLikeType.isTrueMapType()>
	//   54  112:ifeq            137
_L3:
		serializerprovider = ((SerializerProvider) (buildMapSerializer(serializerprovider, (MapType)mapliketype, beandescription, flag1, jsonserializer4, typeserializer, jsonserializer3)));
	//   55  115:aload_0         
	//   56  116:aload_1         
	//   57  117:aload           6
	//   58  119:checkcast       #370 <Class MapType>
	//   59  122:aload_3         
	//   60  123:iload           5
	//   61  125:aload           12
	//   62  127:aload           9
	//   63  129:aload           10
	//   64  131:invokevirtual   #374 <Method JsonSerializer buildMapSerializer(SerializerProvider, MapType, BeanDescription, boolean, JsonSerializer, TypeSerializer, JsonSerializer)>
	//   65  134:astore_1        
_L6:
		return ((JsonSerializer) (serializerprovider));
	//   66  135:aload_1         
	//   67  136:areturn         
_L4:
		JsonSerializer jsonserializer = null;
	//   68  137:aconst_null     
	//   69  138:astore          6
		MapLikeType mapliketype1 = (MapLikeType)javatype;
	//   70  140:aload_2         
	//   71  141:checkcast       #363 <Class MapLikeType>
	//   72  144:astore          11
		Iterator iterator1 = customSerializers().iterator();
	//   73  146:aload_0         
	//   74  147:invokevirtual   #211 <Method Iterable customSerializers()>
	//   75  150:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//   76  155:astore          13
		JsonSerializer jsonserializer1;
		do
		{
			jsonserializer1 = jsonserializer;
	//   77  157:aload           6
	//   78  159:astore          7
			if(!iterator1.hasNext())
				break;
	//   79  161:aload           13
	//   80  163:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   81  168:ifeq            208
			jsonserializer1 = ((Serializers)iterator1.next()).findMapLikeSerializer(serializationconfig, mapliketype1, beandescription, jsonserializer4, typeserializer, jsonserializer3);
	//   82  171:aload           13
	//   83  173:invokeinterface #112 <Method Object Iterator.next()>
	//   84  178:checkcast       #216 <Class Serializers>
	//   85  181:aload           8
	//   86  183:aload           11
	//   87  185:aload_3         
	//   88  186:aload           12
	//   89  188:aload           9
	//   90  190:aload           10
	//   91  192:invokeinterface #378 <Method JsonSerializer Serializers.findMapLikeSerializer(SerializationConfig, MapLikeType, BeanDescription, JsonSerializer, TypeSerializer, JsonSerializer)>
	//   92  197:astore          7
			jsonserializer = jsonserializer1;
	//   93  199:aload           7
	//   94  201:astore          6
		} while(jsonserializer1 == null);
	//   95  203:aload           7
	//   96  205:ifnull          157
		jsonserializer = jsonserializer1;
	//   97  208:aload           7
	//   98  210:astore          6
		if(jsonserializer1 == null)
	//*  99  212:aload           7
	//* 100  214:ifnonnull       226
			jsonserializer = findSerializerByAnnotations(serializerprovider, javatype, beandescription);
	//  101  217:aload_0         
	//  102  218:aload_1         
	//  103  219:aload_2         
	//  104  220:aload_3         
	//  105  221:invokevirtual   #274 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//  106  224:astore          6
		serializerprovider = ((SerializerProvider) (jsonserializer));
	//  107  226:aload           6
	//  108  228:astore_1        
		if(jsonserializer == null)
			continue; /* Loop/switch isn't completed */
	//  109  229:aload           6
	//  110  231:ifnull          135
		serializerprovider = ((SerializerProvider) (jsonserializer));
	//  111  234:aload           6
	//  112  236:astore_1        
		if(!_factoryConfig.hasSerializerModifiers())
			continue; /* Loop/switch isn't completed */
	//  113  237:aload_0         
	//  114  238:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//  115  241:invokevirtual   #248 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//  116  244:ifeq            135
		javatype = ((JavaType) (_factoryConfig.serializerModifiers().iterator()));
	//  117  247:aload_0         
	//  118  248:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//  119  251:invokevirtual   #251 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  120  254:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//  121  259:astore_2        
		do
		{
			serializerprovider = ((SerializerProvider) (jsonserializer));
	//  122  260:aload           6
	//  123  262:astore_1        
			if(!((Iterator) (javatype)).hasNext())
				continue; /* Loop/switch isn't completed */
	//  124  263:aload_2         
	//  125  264:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//  126  269:ifeq            135
			jsonserializer = ((BeanSerializerModifier)((Iterator) (javatype)).next()).modifyMapLikeSerializer(serializationconfig, mapliketype1, beandescription, jsonserializer);
	//  127  272:aload_2         
	//  128  273:invokeinterface #112 <Method Object Iterator.next()>
	//  129  278:checkcast       #253 <Class BeanSerializerModifier>
	//  130  281:aload           8
	//  131  283:aload           11
	//  132  285:aload_3         
	//  133  286:aload           6
	//  134  288:invokevirtual   #382 <Method JsonSerializer BeanSerializerModifier.modifyMapLikeSerializer(SerializationConfig, MapLikeType, BeanDescription, JsonSerializer)>
	//  135  291:astore          6
		} while(true);
	//  136  293:goto            260
_L2:
label1:
		{
			if(!javatype.isCollectionLikeType())
				break label1;
	//  137  296:aload_2         
	//  138  297:invokevirtual   #385 <Method boolean JavaType.isCollectionLikeType()>
	//  139  300:ifeq            492
			Object obj = ((Object) ((CollectionLikeType)javatype));
	//  140  303:aload_2         
	//  141  304:checkcast       #387 <Class CollectionLikeType>
	//  142  307:astore          6
			if(((CollectionLikeType) (obj)).isTrueCollectionType())
	//* 143  309:aload           6
	//* 144  311:invokevirtual   #390 <Method boolean CollectionLikeType.isTrueCollectionType()>
	//* 145  314:ifeq            335
				return buildCollectionSerializer(serializerprovider, (CollectionType)obj, beandescription, flag1, typeserializer, jsonserializer3);
	//  146  317:aload_0         
	//  147  318:aload_1         
	//  148  319:aload           6
	//  149  321:checkcast       #294 <Class CollectionType>
	//  150  324:aload_3         
	//  151  325:iload           5
	//  152  327:aload           9
	//  153  329:aload           10
	//  154  331:invokevirtual   #392 <Method JsonSerializer buildCollectionSerializer(SerializerProvider, CollectionType, BeanDescription, boolean, TypeSerializer, JsonSerializer)>
	//  155  334:areturn         
			obj = null;
	//  156  335:aconst_null     
	//  157  336:astore          6
			CollectionLikeType collectionliketype = (CollectionLikeType)javatype;
	//  158  338:aload_2         
	//  159  339:checkcast       #387 <Class CollectionLikeType>
	//  160  342:astore          11
			Iterator iterator = customSerializers().iterator();
	//  161  344:aload_0         
	//  162  345:invokevirtual   #211 <Method Iterable customSerializers()>
	//  163  348:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//  164  353:astore          12
			JsonSerializer jsonserializer2;
			do
			{
				jsonserializer2 = ((JsonSerializer) (obj));
	//  165  355:aload           6
	//  166  357:astore          7
				if(!iterator.hasNext())
					break;
	//  167  359:aload           12
	//  168  361:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//  169  366:ifeq            404
				jsonserializer2 = ((Serializers)iterator.next()).findCollectionLikeSerializer(serializationconfig, collectionliketype, beandescription, typeserializer, jsonserializer3);
	//  170  369:aload           12
	//  171  371:invokeinterface #112 <Method Object Iterator.next()>
	//  172  376:checkcast       #216 <Class Serializers>
	//  173  379:aload           8
	//  174  381:aload           11
	//  175  383:aload_3         
	//  176  384:aload           9
	//  177  386:aload           10
	//  178  388:invokeinterface #396 <Method JsonSerializer Serializers.findCollectionLikeSerializer(SerializationConfig, CollectionLikeType, BeanDescription, TypeSerializer, JsonSerializer)>
	//  179  393:astore          7
				obj = ((Object) (jsonserializer2));
	//  180  395:aload           7
	//  181  397:astore          6
			} while(jsonserializer2 == null);
	//  182  399:aload           7
	//  183  401:ifnull          355
			obj = ((Object) (jsonserializer2));
	//  184  404:aload           7
	//  185  406:astore          6
			if(jsonserializer2 == null)
	//* 186  408:aload           7
	//* 187  410:ifnonnull       422
				obj = ((Object) (findSerializerByAnnotations(serializerprovider, javatype, beandescription)));
	//  188  413:aload_0         
	//  189  414:aload_1         
	//  190  415:aload_2         
	//  191  416:aload_3         
	//  192  417:invokevirtual   #274 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//  193  420:astore          6
			serializerprovider = ((SerializerProvider) (obj));
	//  194  422:aload           6
	//  195  424:astore_1        
			if(obj != null)
	//* 196  425:aload           6
	//* 197  427:ifnull          135
			{
				serializerprovider = ((SerializerProvider) (obj));
	//  198  430:aload           6
	//  199  432:astore_1        
				if(_factoryConfig.hasSerializerModifiers())
	//* 200  433:aload_0         
	//* 201  434:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//* 202  437:invokevirtual   #248 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//* 203  440:ifeq            135
				{
					javatype = ((JavaType) (_factoryConfig.serializerModifiers().iterator()));
	//  204  443:aload_0         
	//  205  444:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//  206  447:invokevirtual   #251 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  207  450:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//  208  455:astore_2        
					do
					{
						serializerprovider = ((SerializerProvider) (obj));
	//  209  456:aload           6
	//  210  458:astore_1        
						if(!((Iterator) (javatype)).hasNext())
							break;
	//  211  459:aload_2         
	//  212  460:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//  213  465:ifeq            135
						obj = ((Object) (((BeanSerializerModifier)((Iterator) (javatype)).next()).modifyCollectionLikeSerializer(serializationconfig, collectionliketype, beandescription, ((JsonSerializer) (obj)))));
	//  214  468:aload_2         
	//  215  469:invokeinterface #112 <Method Object Iterator.next()>
	//  216  474:checkcast       #253 <Class BeanSerializerModifier>
	//  217  477:aload           8
	//  218  479:aload           11
	//  219  481:aload_3         
	//  220  482:aload           6
	//  221  484:invokevirtual   #400 <Method JsonSerializer BeanSerializerModifier.modifyCollectionLikeSerializer(SerializationConfig, CollectionLikeType, BeanDescription, JsonSerializer)>
	//  222  487:astore          6
					} while(true);
	//  223  489:goto            456
				}
			}
		}
		if(true) goto _L6; else goto _L5
_L5:
		if(javatype.isArrayType())
	//* 224  492:aload_2         
	//* 225  493:invokevirtual   #403 <Method boolean JavaType.isArrayType()>
	//* 226  496:ifeq            516
			return buildArraySerializer(serializerprovider, (ArrayType)javatype, beandescription, flag1, typeserializer, jsonserializer3);
	//  227  499:aload_0         
	//  228  500:aload_1         
	//  229  501:aload_2         
	//  230  502:checkcast       #222 <Class ArrayType>
	//  231  505:aload_3         
	//  232  506:iload           5
	//  233  508:aload           9
	//  234  510:aload           10
	//  235  512:invokevirtual   #405 <Method JsonSerializer buildArraySerializer(SerializerProvider, ArrayType, BeanDescription, boolean, TypeSerializer, JsonSerializer)>
	//  236  515:areturn         
		else
			return null;
	//  237  516:aconst_null     
	//  238  517:areturn         
	}

	protected JsonSerializer buildEnumSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException
	{
		Object obj;
		Object obj1;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		obj1 = ((Object) (beandescription.findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null)))));
	//    2    3:aload_3         
	//    3    4:aconst_null     
	//    4    5:invokevirtual   #280 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//    5    8:astore          5
		if(obj1 == null || ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).getShape() != com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT) goto _L2; else goto _L1
	//    6   10:aload           5
	//    7   12:ifnull          40
	//    8   15:aload           5
	//    9   17:invokevirtual   #286 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//   10   20:getstatic       #292 <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
	//   11   23:if_acmpne       40
_L1:
		((BasicBeanDescription)beandescription).removeProperty("declaringClass");
	//   12   26:aload_3         
	//   13   27:checkcast       #410 <Class BasicBeanDescription>
	//   14   30:ldc2            #412 <String "declaringClass">
	//   15   33:invokevirtual   #416 <Method boolean BasicBeanDescription.removeProperty(String)>
	//   16   36:pop             
_L4:
		return ((JsonSerializer) (obj));
	//   17   37:aload           4
	//   18   39:areturn         
_L2:
		obj1 = ((Object) (EnumSerializer.construct(javatype.getRawClass(), serializationconfig, beandescription, ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)))));
	//   19   40:aload_2         
	//   20   41:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//   21   44:aload_1         
	//   22   45:aload_3         
	//   23   46:aload           5
	//   24   48:invokestatic    #422 <Method EnumSerializer EnumSerializer.construct(Class, SerializationConfig, BeanDescription, com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   25   51:astore          5
		obj = obj1;
	//   26   53:aload           5
	//   27   55:astore          4
		if(!_factoryConfig.hasSerializerModifiers())
			continue;
	//   28   57:aload_0         
	//   29   58:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//   30   61:invokevirtual   #248 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//   31   64:ifeq            37
		Iterator iterator = _factoryConfig.serializerModifiers().iterator();
	//   32   67:aload_0         
	//   33   68:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//   34   71:invokevirtual   #251 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//   35   74:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//   36   79:astore          6
		do
		{
			obj = obj1;
	//   37   81:aload           5
	//   38   83:astore          4
			if(!iterator.hasNext())
				continue;
	//   39   85:aload           6
	//   40   87:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   41   92:ifeq            37
			obj1 = ((Object) (((BeanSerializerModifier)iterator.next()).modifyEnumSerializer(serializationconfig, javatype, beandescription, ((JsonSerializer) (obj1)))));
	//   42   95:aload           6
	//   43   97:invokeinterface #112 <Method Object Iterator.next()>
	//   44  102:checkcast       #253 <Class BeanSerializerModifier>
	//   45  105:aload_1         
	//   46  106:aload_2         
	//   47  107:aload_3         
	//   48  108:aload           5
	//   49  110:invokevirtual   #426 <Method JsonSerializer BeanSerializerModifier.modifyEnumSerializer(SerializationConfig, JavaType, BeanDescription, JsonSerializer)>
	//   50  113:astore          5
		} while(true);
	//   51  115:goto            81
		if(true) goto _L4; else goto _L3
_L3:
	}

	public JsonSerializer buildEnumSetSerializer(JavaType javatype)
	{
		return ((JsonSerializer) (new EnumSetSerializer(javatype)));
	//    0    0:new             #429 <Class EnumSetSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #432 <Method void EnumSetSerializer(JavaType)>
	//    4    8:areturn         
	}

	public ContainerSerializer buildIndexedListSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		return ((ContainerSerializer) (new IndexedListSerializer(javatype, flag, typeserializer, jsonserializer)));
	//    0    0:new             #435 <Class IndexedListSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #436 <Method void IndexedListSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//    7   12:areturn         
	}

	protected JsonSerializer buildIterableSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		Object obj = ((Object) (serializationconfig.getTypeFactory().findTypeParameters(javatype, java/lang/Iterable)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #445 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//    2    4:aload_2         
	//    3    5:ldc1            #213 <Class Iterable>
	//    4    7:invokevirtual   #451 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//    5   10:astore          5
		if(obj == null || obj.length != 1)
	//*   6   12:aload           5
	//*   7   14:ifnull          24
	//*   8   17:aload           5
	//*   9   19:arraylength     
	//*  10   20:iconst_1        
	//*  11   21:icmpeq          41
			obj = ((Object) (TypeFactory.unknownType()));
	//   12   24:invokestatic    #454 <Method JavaType TypeFactory.unknownType()>
	//   13   27:astore          5
		else
	//*  14   29:aload_0         
	//*  15   30:aload_1         
	//*  16   31:aload_2         
	//*  17   32:aload_3         
	//*  18   33:iload           4
	//*  19   35:aload           5
	//*  20   37:invokevirtual   #457 <Method JsonSerializer buildIterableSerializer(SerializationConfig, JavaType, BeanDescription, boolean, JavaType)>
	//*  21   40:areturn         
			obj = ((Object) (obj[0]));
	//   22   41:aload           5
	//   23   43:iconst_0        
	//   24   44:aaload          
	//   25   45:astore          5
		return buildIterableSerializer(serializationconfig, javatype, beandescription, flag, ((JavaType) (obj)));
	//*  26   47:goto            29
	}

	protected JsonSerializer buildIterableSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag, JavaType javatype1)
		throws JsonMappingException
	{
		return ((JsonSerializer) (new IterableSerializer(javatype1, flag, createTypeSerializer(serializationconfig, javatype1))));
	//    0    0:new             #461 <Class IterableSerializer>
	//    1    3:dup             
	//    2    4:aload           5
	//    3    6:iload           4
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload           5
	//    7   12:invokevirtual   #352 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//    8   15:invokespecial   #464 <Method void IterableSerializer(JavaType, boolean, TypeSerializer)>
	//    9   18:areturn         
	}

	protected JsonSerializer buildIteratorSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		Object obj = ((Object) (serializationconfig.getTypeFactory().findTypeParameters(javatype, java/util/Iterator)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #445 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//    2    4:aload_2         
	//    3    5:ldc1            #104 <Class Iterator>
	//    4    7:invokevirtual   #451 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//    5   10:astore          5
		if(obj == null || obj.length != 1)
	//*   6   12:aload           5
	//*   7   14:ifnull          24
	//*   8   17:aload           5
	//*   9   19:arraylength     
	//*  10   20:iconst_1        
	//*  11   21:icmpeq          41
			obj = ((Object) (TypeFactory.unknownType()));
	//   12   24:invokestatic    #454 <Method JavaType TypeFactory.unknownType()>
	//   13   27:astore          5
		else
	//*  14   29:aload_0         
	//*  15   30:aload_1         
	//*  16   31:aload_2         
	//*  17   32:aload_3         
	//*  18   33:iload           4
	//*  19   35:aload           5
	//*  20   37:invokevirtual   #468 <Method JsonSerializer buildIteratorSerializer(SerializationConfig, JavaType, BeanDescription, boolean, JavaType)>
	//*  21   40:areturn         
			obj = ((Object) (obj[0]));
	//   22   41:aload           5
	//   23   43:iconst_0        
	//   24   44:aaload          
	//   25   45:astore          5
		return buildIteratorSerializer(serializationconfig, javatype, beandescription, flag, ((JavaType) (obj)));
	//*  26   47:goto            29
	}

	protected JsonSerializer buildIteratorSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag, JavaType javatype1)
		throws JsonMappingException
	{
		return ((JsonSerializer) (new IteratorSerializer(javatype1, flag, createTypeSerializer(serializationconfig, javatype1))));
	//    0    0:new             #470 <Class IteratorSerializer>
	//    1    3:dup             
	//    2    4:aload           5
	//    3    6:iload           4
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload           5
	//    7   12:invokevirtual   #352 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//    8   15:invokespecial   #471 <Method void IteratorSerializer(JavaType, boolean, TypeSerializer)>
	//    9   18:areturn         
	}

	protected JsonSerializer buildMapEntrySerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag, JavaType javatype1, JavaType javatype2)
		throws JsonMappingException
	{
		return ((JsonSerializer) (new MapEntrySerializer(javatype2, javatype1, javatype2, flag, createTypeSerializer(serializationconfig, javatype2), ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
	//    0    0:new             #475 <Class MapEntrySerializer>
	//    1    3:dup             
	//    2    4:aload           6
	//    3    6:aload           5
	//    4    8:aload           6
	//    5   10:iload           4
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload           6
	//    9   16:invokevirtual   #352 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   10   19:aconst_null     
	//   11   20:invokespecial   #478 <Method void MapEntrySerializer(JavaType, JavaType, JavaType, boolean, TypeSerializer, com.fasterxml.jackson.databind.BeanProperty)>
	//   12   23:areturn         
	}

	protected JsonSerializer buildMapSerializer(SerializerProvider serializerprovider, MapType maptype, BeanDescription beandescription, boolean flag, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
		throws JsonMappingException
	{
		SerializationConfig serializationconfig = serializerprovider.getConfig();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #207 <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore          10
		Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore          8
		Iterator iterator = customSerializers().iterator();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #211 <Method Iterable customSerializers()>
	//    7   13:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//    8   18:astore          11
		JsonSerializer jsonserializer2;
		do
		{
			jsonserializer2 = ((JsonSerializer) (obj));
	//    9   20:aload           8
	//   10   22:astore          9
			if(!iterator.hasNext())
				break;
	//   11   24:aload           11
	//   12   26:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   13   31:ifeq            70
			jsonserializer2 = ((Serializers)iterator.next()).findMapSerializer(serializationconfig, maptype, beandescription, jsonserializer, typeserializer, jsonserializer1);
	//   14   34:aload           11
	//   15   36:invokeinterface #112 <Method Object Iterator.next()>
	//   16   41:checkcast       #216 <Class Serializers>
	//   17   44:aload           10
	//   18   46:aload_2         
	//   19   47:aload_3         
	//   20   48:aload           5
	//   21   50:aload           6
	//   22   52:aload           7
	//   23   54:invokeinterface #483 <Method JsonSerializer Serializers.findMapSerializer(SerializationConfig, MapType, BeanDescription, JsonSerializer, TypeSerializer, JsonSerializer)>
	//   24   59:astore          9
			obj = ((Object) (jsonserializer2));
	//   25   61:aload           9
	//   26   63:astore          8
		} while(jsonserializer2 == null);
	//   27   65:aload           9
	//   28   67:ifnull          20
		obj = ((Object) (jsonserializer2));
	//   29   70:aload           9
	//   30   72:astore          8
		if(jsonserializer2 == null)
	//*  31   74:aload           9
	//*  32   76:ifnonnull       162
		{
			serializerprovider = ((SerializerProvider) (findSerializerByAnnotations(serializerprovider, ((JavaType) (maptype)), beandescription)));
	//   33   79:aload_0         
	//   34   80:aload_1         
	//   35   81:aload_2         
	//   36   82:aload_3         
	//   37   83:invokevirtual   #274 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//   38   86:astore_1        
			obj = ((Object) (serializerprovider));
	//   39   87:aload_1         
	//   40   88:astore          8
			if(serializerprovider == null)
	//*  41   90:aload_1         
	//*  42   91:ifnonnull       162
			{
				serializerprovider = ((SerializerProvider) (findFilterId(serializationconfig, beandescription)));
	//   43   94:aload_0         
	//   44   95:aload           10
	//   45   97:aload_3         
	//   46   98:invokevirtual   #487 <Method Object findFilterId(SerializationConfig, BeanDescription)>
	//   47  101:astore_1        
				jsonserializer = ((JsonSerializer) (MapSerializer.construct(serializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(((Annotated) (beandescription.getClassInfo())), true), ((JavaType) (maptype)), flag, typeserializer, jsonserializer, jsonserializer1, ((Object) (serializerprovider)))));
	//   48  102:aload           10
	//   49  104:invokevirtual   #488 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//   50  107:aload_3         
	//   51  108:invokevirtual   #356 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   52  111:iconst_1        
	//   53  112:invokevirtual   #492 <Method String[] AnnotationIntrospector.findPropertiesToIgnore(Annotated, boolean)>
	//   54  115:aload_2         
	//   55  116:iload           4
	//   56  118:aload           6
	//   57  120:aload           5
	//   58  122:aload           7
	//   59  124:aload_1         
	//   60  125:invokestatic    #497 <Method MapSerializer MapSerializer.construct(String[], JavaType, boolean, TypeSerializer, JsonSerializer, JsonSerializer, Object)>
	//   61  128:astore          5
				typeserializer = ((TypeSerializer) (findSuppressableContentValue(serializationconfig, maptype.getContentType(), beandescription)));
	//   62  130:aload_0         
	//   63  131:aload           10
	//   64  133:aload_2         
	//   65  134:invokevirtual   #498 <Method JavaType MapType.getContentType()>
	//   66  137:aload_3         
	//   67  138:invokevirtual   #502 <Method Object findSuppressableContentValue(SerializationConfig, JavaType, BeanDescription)>
	//   68  141:astore          6
				serializerprovider = ((SerializerProvider) (jsonserializer));
	//   69  143:aload           5
	//   70  145:astore_1        
				if(typeserializer != null)
	//*  71  146:aload           6
	//*  72  148:ifnull          159
					serializerprovider = ((SerializerProvider) (((MapSerializer) (jsonserializer)).withContentInclusion(((Object) (typeserializer)))));
	//   73  151:aload           5
	//   74  153:aload           6
	//   75  155:invokevirtual   #506 <Method MapSerializer MapSerializer.withContentInclusion(Object)>
	//   76  158:astore_1        
				obj = ((Object) (serializerprovider));
	//   77  159:aload_1         
	//   78  160:astore          8
			}
		}
		serializerprovider = ((SerializerProvider) (obj));
	//   79  162:aload           8
	//   80  164:astore_1        
		if(_factoryConfig.hasSerializerModifiers())
	//*  81  165:aload_0         
	//*  82  166:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//*  83  169:invokevirtual   #248 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  84  172:ifeq            226
		{
			jsonserializer = ((JsonSerializer) (_factoryConfig.serializerModifiers().iterator()));
	//   85  175:aload_0         
	//   86  176:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//   87  179:invokevirtual   #251 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//   88  182:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//   89  187:astore          5
			do
			{
				serializerprovider = ((SerializerProvider) (obj));
	//   90  189:aload           8
	//   91  191:astore_1        
				if(!((Iterator) (jsonserializer)).hasNext())
					break;
	//   92  192:aload           5
	//   93  194:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   94  199:ifeq            226
				obj = ((Object) (((BeanSerializerModifier)((Iterator) (jsonserializer)).next()).modifyMapSerializer(serializationconfig, maptype, beandescription, ((JsonSerializer) (obj)))));
	//   95  202:aload           5
	//   96  204:invokeinterface #112 <Method Object Iterator.next()>
	//   97  209:checkcast       #253 <Class BeanSerializerModifier>
	//   98  212:aload           10
	//   99  214:aload_2         
	//  100  215:aload_3         
	//  101  216:aload           8
	//  102  218:invokevirtual   #510 <Method JsonSerializer BeanSerializerModifier.modifyMapSerializer(SerializationConfig, MapType, BeanDescription, JsonSerializer)>
	//  103  221:astore          8
			} while(true);
	//  104  223:goto            189
		}
		return ((JsonSerializer) (serializerprovider));
	//  105  226:aload_1         
	//  106  227:areturn         
	}

	public JsonSerializer createKeySerializer(SerializationConfig serializationconfig, JavaType javatype, JsonSerializer jsonserializer)
	{
		JsonSerializer jsonserializer2;
		BeanDescription beandescription1;
label0:
		{
			beandescription1 = serializationconfig.introspectClassAnnotations(javatype.getRawClass());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//    3    5:invokevirtual   #517 <Method BeanDescription SerializationConfig.introspectClassAnnotations(Class)>
	//    4    8:astore          7
			jsonserializer2 = null;
	//    5   10:aconst_null     
	//    6   11:astore          5
			JsonSerializer jsonserializer1 = null;
	//    7   13:aconst_null     
	//    8   14:astore          4
			if(!_factoryConfig.hasKeySerializers())
				break label0;
	//    9   16:aload_0         
	//   10   17:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//   11   20:invokevirtual   #520 <Method boolean SerializerFactoryConfig.hasKeySerializers()>
	//   12   23:ifeq            88
			Iterator iterator1 = _factoryConfig.keySerializers().iterator();
	//   13   26:aload_0         
	//   14   27:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//   15   30:invokevirtual   #523 <Method Iterable SerializerFactoryConfig.keySerializers()>
	//   16   33:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//   17   38:astore          6
			jsonserializer2 = jsonserializer1;
	//   18   40:aload           4
	//   19   42:astore          5
			do
			{
				if(!iterator1.hasNext())
					break label0;
	//   20   44:aload           6
	//   21   46:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//   22   51:ifeq            88
				jsonserializer1 = ((Serializers)iterator1.next()).findSerializer(serializationconfig, javatype, beandescription1);
	//   23   54:aload           6
	//   24   56:invokeinterface #112 <Method Object Iterator.next()>
	//   25   61:checkcast       #216 <Class Serializers>
	//   26   64:aload_1         
	//   27   65:aload_2         
	//   28   66:aload           7
	//   29   68:invokeinterface #526 <Method JsonSerializer Serializers.findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//   30   73:astore          4
				jsonserializer2 = jsonserializer1;
	//   31   75:aload           4
	//   32   77:astore          5
			} while(jsonserializer1 == null);
	//   33   79:aload           4
	//   34   81:ifnull          44
			jsonserializer2 = jsonserializer1;
	//   35   84:aload           4
	//   36   86:astore          5
		}
		BeanDescription beandescription = beandescription1;
	//   37   88:aload           7
	//   38   90:astore          6
		Object obj = ((Object) (jsonserializer2));
	//   39   92:aload           5
	//   40   94:astore          4
		if(jsonserializer2 == null)
	//*  41   96:aload           5
	//*  42   98:ifnonnull       201
		{
			beandescription = beandescription1;
	//   43  101:aload           7
	//   44  103:astore          6
			obj = ((Object) (jsonserializer));
	//   45  105:aload_3         
	//   46  106:astore          4
			if(jsonserializer == null)
	//*  47  108:aload_3         
	//*  48  109:ifnonnull       201
			{
				jsonserializer = StdKeySerializers.getStdKeySerializer(serializationconfig, javatype.getRawClass(), false);
	//   49  112:aload_1         
	//   50  113:aload_2         
	//   51  114:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//   52  117:iconst_0        
	//   53  118:invokestatic    #532 <Method JsonSerializer StdKeySerializers.getStdKeySerializer(SerializationConfig, Class, boolean)>
	//   54  121:astore_3        
				beandescription = beandescription1;
	//   55  122:aload           7
	//   56  124:astore          6
				obj = ((Object) (jsonserializer));
	//   57  126:aload_3         
	//   58  127:astore          4
				if(jsonserializer == null)
	//*  59  129:aload_3         
	//*  60  130:ifnonnull       201
				{
					beandescription = serializationconfig.introspect(javatype);
	//   61  133:aload_1         
	//   62  134:aload_2         
	//   63  135:invokevirtual   #536 <Method BeanDescription SerializationConfig.introspect(JavaType)>
	//   64  138:astore          6
					obj = ((Object) (beandescription.findJsonValueMethod()));
	//   65  140:aload           6
	//   66  142:invokevirtual   #540 <Method AnnotatedMethod BeanDescription.findJsonValueMethod()>
	//   67  145:astore          4
					Iterator iterator;
					if(obj != null)
	//*  68  147:aload           4
	//*  69  149:ifnull          265
					{
						jsonserializer = StdKeySerializers.getStdKeySerializer(serializationconfig, ((AnnotatedMethod) (obj)).getRawReturnType(), true);
	//   70  152:aload_1         
	//   71  153:aload           4
	//   72  155:invokevirtual   #545 <Method Class AnnotatedMethod.getRawReturnType()>
	//   73  158:iconst_1        
	//   74  159:invokestatic    #532 <Method JsonSerializer StdKeySerializers.getStdKeySerializer(SerializationConfig, Class, boolean)>
	//   75  162:astore_3        
						obj = ((Object) (((AnnotatedMethod) (obj)).getAnnotated()));
	//   76  163:aload           4
	//   77  165:invokevirtual   #549 <Method java.lang.reflect.Method AnnotatedMethod.getAnnotated()>
	//   78  168:astore          4
						if(serializationconfig.canOverrideAccessModifiers())
	//*  79  170:aload_1         
	//*  80  171:invokevirtual   #552 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//*  81  174:ifeq            189
							ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (obj)), serializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//   82  177:aload           4
	//   83  179:aload_1         
	//   84  180:getstatic       #558 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   85  183:invokevirtual   #562 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//   86  186:invokestatic    #566 <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
						obj = ((Object) (new JsonValueSerializer(((java.lang.reflect.Method) (obj)), jsonserializer)));
	//   87  189:new             #568 <Class JsonValueSerializer>
	//   88  192:dup             
	//   89  193:aload           4
	//   90  195:aload_3         
	//   91  196:invokespecial   #571 <Method void JsonValueSerializer(java.lang.reflect.Method, JsonSerializer)>
	//   92  199:astore          4
					} else
	//*  93  201:aload           4
	//*  94  203:astore_3        
	//*  95  204:aload_0         
	//*  96  205:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//*  97  208:invokevirtual   #248 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  98  211:ifeq            278
	//*  99  214:aload_0         
	//* 100  215:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//* 101  218:invokevirtual   #251 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//* 102  221:invokeinterface #214 <Method Iterator Iterable.iterator()>
	//* 103  226:astore          5
	//* 104  228:aload           4
	//* 105  230:astore_3        
	//* 106  231:aload           5
	//* 107  233:invokeinterface #108 <Method boolean Iterator.hasNext()>
	//* 108  238:ifeq            278
	//* 109  241:aload           5
	//* 110  243:invokeinterface #112 <Method Object Iterator.next()>
	//* 111  248:checkcast       #253 <Class BeanSerializerModifier>
	//* 112  251:aload_1         
	//* 113  252:aload_2         
	//* 114  253:aload           6
	//* 115  255:aload           4
	//* 116  257:invokevirtual   #574 <Method JsonSerializer BeanSerializerModifier.modifyKeySerializer(SerializationConfig, JavaType, BeanDescription, JsonSerializer)>
	//* 117  260:astore          4
	//* 118  262:goto            228
					{
						obj = ((Object) (StdKeySerializers.getFallbackKeySerializer(serializationconfig, javatype.getRawClass())));
	//  119  265:aload_1         
	//  120  266:aload_2         
	//  121  267:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//  122  270:invokestatic    #578 <Method JsonSerializer StdKeySerializers.getFallbackKeySerializer(SerializationConfig, Class)>
	//  123  273:astore          4
					}
				}
			}
		}
		jsonserializer = ((JsonSerializer) (obj));
		if(_factoryConfig.hasSerializerModifiers())
		{
			iterator = _factoryConfig.serializerModifiers().iterator();
			do
			{
				jsonserializer = ((JsonSerializer) (obj));
				if(!iterator.hasNext())
					break;
				obj = ((Object) (((BeanSerializerModifier)iterator.next()).modifyKeySerializer(serializationconfig, javatype, beandescription, ((JsonSerializer) (obj)))));
			} while(true);
		}
	//* 124  275:goto            201
		return jsonserializer;
	//  125  278:aload_3         
	//  126  279:areturn         
	}

	public abstract JsonSerializer createSerializer(SerializerProvider serializerprovider, JavaType javatype)
		throws JsonMappingException;

	public TypeSerializer createTypeSerializer(SerializationConfig serializationconfig, JavaType javatype)
	{
		com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedclass = serializationconfig.introspectClassAnnotations(javatype.getRawClass()).getClassInfo();
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//    3    5:invokevirtual   #517 <Method BeanDescription SerializationConfig.introspectClassAnnotations(Class)>
	//    4    8:invokevirtual   #356 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//    5   11:astore          5
		TypeResolverBuilder typeresolverbuilder = serializationconfig.getAnnotationIntrospector().findTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedclass, javatype);
	//    6   13:aload_1         
	//    7   14:invokevirtual   #488 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    8   17:aload_1         
	//    9   18:aload           5
	//   10   20:aload_2         
	//   11   21:invokevirtual   #585 <Method TypeResolverBuilder AnnotationIntrospector.findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, JavaType)>
	//   12   24:astore_3        
		Collection collection = null;
	//   13   25:aconst_null     
	//   14   26:astore          4
		if(typeresolverbuilder == null)
	//*  15   28:aload_3         
	//*  16   29:ifnonnull       44
			typeresolverbuilder = serializationconfig.getDefaultTyper(javatype);
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:invokevirtual   #589 <Method TypeResolverBuilder SerializationConfig.getDefaultTyper(JavaType)>
	//   20   37:astore_3        
		else
	//*  21   38:aload_3         
	//*  22   39:ifnonnull       59
	//*  23   42:aconst_null     
	//*  24   43:areturn         
			collection = serializationconfig.getSubtypeResolver().collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedclass);
	//   25   44:aload_1         
	//   26   45:invokevirtual   #593 <Method SubtypeResolver SerializationConfig.getSubtypeResolver()>
	//   27   48:aload_1         
	//   28   49:aload           5
	//   29   51:invokevirtual   #599 <Method Collection SubtypeResolver.collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   30   54:astore          4
		if(typeresolverbuilder == null)
			return null;
		else
	//*  31   56:goto            38
			return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, collection);
	//   32   59:aload_3         
	//   33   60:aload_1         
	//   34   61:aload_2         
	//   35   62:aload           4
	//   36   64:invokeinterface #605 <Method TypeSerializer TypeResolverBuilder.buildTypeSerializer(SerializationConfig, JavaType, Collection)>
	//   37   69:areturn         
	}

	protected abstract Iterable customSerializers();

	protected Converter findConverter(SerializerProvider serializerprovider, Annotated annotated)
		throws JsonMappingException
	{
		Object obj = serializerprovider.getAnnotationIntrospector().findSerializationConverter(annotated);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #169 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #610 <Method Object AnnotationIntrospector.findSerializationConverter(Annotated)>
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
	//   12   18:invokevirtual   #614 <Method Converter SerializerProvider.converterInstance(Annotated, Object)>
	//   13   21:areturn         
	}

	protected JsonSerializer findConvertingSerializer(SerializerProvider serializerprovider, Annotated annotated, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		annotated = ((Annotated) (findConverter(serializerprovider, annotated)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #619 <Method Converter findConverter(SerializerProvider, Annotated)>
	//    4    6:astore_2        
		if(annotated == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			return jsonserializer;
	//    7   11:aload_3         
	//    8   12:areturn         
		else
			return ((JsonSerializer) (new StdDelegatingSerializer(((Converter) (annotated)), ((Converter) (annotated)).getOutputType(serializerprovider.getTypeFactory()), jsonserializer)));
	//    9   13:new             #621 <Class StdDelegatingSerializer>
	//   10   16:dup             
	//   11   17:aload_2         
	//   12   18:aload_2         
	//   13   19:aload_1         
	//   14   20:invokevirtual   #622 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//   15   23:invokeinterface #628 <Method JavaType Converter.getOutputType(TypeFactory)>
	//   16   28:aload_3         
	//   17   29:invokespecial   #631 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//   18   32:areturn         
	}

	protected Object findFilterId(SerializationConfig serializationconfig, BeanDescription beandescription)
	{
		return serializationconfig.getAnnotationIntrospector().findFilterId(((Annotated) (beandescription.getClassInfo())));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #488 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #356 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//    4    8:invokevirtual   #634 <Method Object AnnotationIntrospector.findFilterId(Annotated)>
	//    5   11:areturn         
	}

	protected JsonSerializer findOptionalStdSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		return OptionalHandlerFactory.instance.findSerializer(serializerprovider.getConfig(), javatype, beandescription);
	//    0    0:getstatic       #640 <Field OptionalHandlerFactory OptionalHandlerFactory.instance>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #207 <Method SerializationConfig SerializerProvider.getConfig()>
	//    3    7:aload_2         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #641 <Method JsonSerializer OptionalHandlerFactory.findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//    6   12:areturn         
	}

	protected final JsonSerializer findSerializerByAddonType(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		Object obj = ((Object) (javatype.getRawClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//    2    4:astore          5
		if(((Class) (java/util/Iterator)).isAssignableFrom(((Class) (obj))))
	//*   3    6:ldc1            #104 <Class Iterator>
	//*   4    8:aload           5
	//*   5   10:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*   6   13:ifeq            66
		{
			obj = ((Object) (serializationconfig.getTypeFactory().findTypeParameters(javatype, java/util/Iterator)));
	//    7   16:aload_1         
	//    8   17:invokevirtual   #445 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//    9   20:aload_2         
	//   10   21:ldc1            #104 <Class Iterator>
	//   11   23:invokevirtual   #451 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//   12   26:astore          5
			if(obj == null || obj.length != 1)
	//*  13   28:aload           5
	//*  14   30:ifnull          40
	//*  15   33:aload           5
	//*  16   35:arraylength     
	//*  17   36:iconst_1        
	//*  18   37:icmpeq          57
				obj = ((Object) (TypeFactory.unknownType()));
	//   19   40:invokestatic    #454 <Method JavaType TypeFactory.unknownType()>
	//   20   43:astore          5
			else
	//*  21   45:aload_0         
	//*  22   46:aload_1         
	//*  23   47:aload_2         
	//*  24   48:aload_3         
	//*  25   49:iload           4
	//*  26   51:aload           5
	//*  27   53:invokevirtual   #468 <Method JsonSerializer buildIteratorSerializer(SerializationConfig, JavaType, BeanDescription, boolean, JavaType)>
	//*  28   56:areturn         
				obj = ((Object) (obj[0]));
	//   29   57:aload           5
	//   30   59:iconst_0        
	//   31   60:aaload          
	//   32   61:astore          5
			return buildIteratorSerializer(serializationconfig, javatype, beandescription, flag, ((JavaType) (obj)));
		}
	//*  33   63:goto            45
		if(((Class) (java/lang/Iterable)).isAssignableFrom(((Class) (obj))))
	//*  34   66:ldc1            #213 <Class Iterable>
	//*  35   68:aload           5
	//*  36   70:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  37   73:ifeq            126
		{
			obj = ((Object) (serializationconfig.getTypeFactory().findTypeParameters(javatype, java/lang/Iterable)));
	//   38   76:aload_1         
	//   39   77:invokevirtual   #445 <Method TypeFactory SerializationConfig.getTypeFactory()>
	//   40   80:aload_2         
	//   41   81:ldc1            #213 <Class Iterable>
	//   42   83:invokevirtual   #451 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//   43   86:astore          5
			if(obj == null || obj.length != 1)
	//*  44   88:aload           5
	//*  45   90:ifnull          100
	//*  46   93:aload           5
	//*  47   95:arraylength     
	//*  48   96:iconst_1        
	//*  49   97:icmpeq          117
				obj = ((Object) (TypeFactory.unknownType()));
	//   50  100:invokestatic    #454 <Method JavaType TypeFactory.unknownType()>
	//   51  103:astore          5
			else
	//*  52  105:aload_0         
	//*  53  106:aload_1         
	//*  54  107:aload_2         
	//*  55  108:aload_3         
	//*  56  109:iload           4
	//*  57  111:aload           5
	//*  58  113:invokevirtual   #457 <Method JsonSerializer buildIterableSerializer(SerializationConfig, JavaType, BeanDescription, boolean, JavaType)>
	//*  59  116:areturn         
				obj = ((Object) (obj[0]));
	//   60  117:aload           5
	//   61  119:iconst_0        
	//   62  120:aaload          
	//   63  121:astore          5
			return buildIterableSerializer(serializationconfig, javatype, beandescription, flag, ((JavaType) (obj)));
		}
	//*  64  123:goto            105
		if(((Class) (java/lang/CharSequence)).isAssignableFrom(((Class) (obj))))
	//*  65  126:ldc2            #644 <Class CharSequence>
	//*  66  129:aload           5
	//*  67  131:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  68  134:ifeq            141
			return ((JsonSerializer) (ToStringSerializer.instance));
	//   69  137:getstatic       #43  <Field ToStringSerializer ToStringSerializer.instance>
	//   70  140:areturn         
		else
			return null;
	//   71  141:aconst_null     
	//   72  142:areturn         
	}

	protected final JsonSerializer findSerializerByAnnotations(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException
	{
		if(((Class) (com/fasterxml/jackson/databind/JsonSerializable)).isAssignableFrom(javatype.getRawClass()))
	//*   0    0:ldc2            #646 <Class JsonSerializable>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//*   3    7:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*   4   10:ifeq            17
			return ((JsonSerializer) (SerializableSerializer.instance));
	//    5   13:getstatic       #651 <Field SerializableSerializer SerializableSerializer.instance>
	//    6   16:areturn         
		javatype = ((JavaType) (beandescription.findJsonValueMethod()));
	//    7   17:aload_3         
	//    8   18:invokevirtual   #540 <Method AnnotatedMethod BeanDescription.findJsonValueMethod()>
	//    9   21:astore_2        
		if(javatype != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          64
		{
			beandescription = ((BeanDescription) (((AnnotatedMethod) (javatype)).getAnnotated()));
	//   12   26:aload_2         
	//   13   27:invokevirtual   #549 <Method java.lang.reflect.Method AnnotatedMethod.getAnnotated()>
	//   14   30:astore_3        
			if(serializerprovider.canOverrideAccessModifiers())
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #652 <Method boolean SerializerProvider.canOverrideAccessModifiers()>
	//*  17   35:ifeq            49
				ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (beandescription)), serializerprovider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//   18   38:aload_3         
	//   19   39:aload_1         
	//   20   40:getstatic       #558 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   21   43:invokevirtual   #653 <Method boolean SerializerProvider.isEnabled(MapperFeature)>
	//   22   46:invokestatic    #566 <Method void ClassUtil.checkAndFixAccess(java.lang.reflect.Member, boolean)>
			return ((JsonSerializer) (new JsonValueSerializer(((java.lang.reflect.Method) (beandescription)), findSerializerFromAnnotation(serializerprovider, ((Annotated) (javatype))))));
	//   23   49:new             #568 <Class JsonValueSerializer>
	//   24   52:dup             
	//   25   53:aload_3         
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:aload_2         
	//   29   57:invokevirtual   #656 <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, Annotated)>
	//   30   60:invokespecial   #571 <Method void JsonValueSerializer(java.lang.reflect.Method, JsonSerializer)>
	//   31   63:areturn         
		} else
		{
			return null;
	//   32   64:aconst_null     
	//   33   65:areturn         
		}
	}

	protected final JsonSerializer findSerializerByLookup(JavaType javatype, SerializationConfig serializationconfig, BeanDescription beandescription, boolean flag)
	{
		javatype = ((JavaType) (javatype.getRawClass().getName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//    2    4:invokevirtual   #30  <Method String Class.getName()>
	//    3    7:astore_1        
		serializationconfig = ((SerializationConfig) ((JsonSerializer)_concrete.get(((Object) (javatype)))));
	//    4    8:getstatic       #149 <Field HashMap _concrete>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #665 <Method Object HashMap.get(Object)>
	//    7   15:checkcast       #119 <Class JsonSerializer>
	//    8   18:astore_2        
		if(serializationconfig == null)
	//*   9   19:aload_2         
	//*  10   20:ifnonnull       94
		{
			javatype = ((JavaType) ((Class)_concreteLazy.get(((Object) (javatype)))));
	//   11   23:getstatic       #151 <Field HashMap _concreteLazy>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #665 <Method Object HashMap.get(Object)>
	//   14   30:checkcast       #26  <Class Class>
	//   15   33:astore_1        
			if(javatype != null)
	//*  16   34:aload_1         
	//*  17   35:ifnull          94
			{
				try
				{
					serializationconfig = ((SerializationConfig) ((JsonSerializer)((Class) (javatype)).newInstance()));
	//   18   38:aload_1         
	//   19   39:invokevirtual   #668 <Method Object Class.newInstance()>
	//   20   42:checkcast       #119 <Class JsonSerializer>
	//   21   45:astore_2        
				}
	//*  22   46:aload_2         
	//*  23   47:areturn         
				// Misplaced declaration of an exception variable
				catch(SerializationConfig serializationconfig)
	//*  24   48:astore_2        
				{
					throw new IllegalStateException((new StringBuilder()).append("Failed to instantiate standard serializer (of type ").append(((Class) (javatype)).getName()).append("): ").append(((Exception) (serializationconfig)).getMessage()).toString(), ((Throwable) (serializationconfig)));
	//   25   49:new             #124 <Class IllegalStateException>
	//   26   52:dup             
	//   27   53:new             #47  <Class StringBuilder>
	//   28   56:dup             
	//   29   57:invokespecial   #125 <Method void StringBuilder()>
	//   30   60:ldc2            #670 <String "Failed to instantiate standard serializer (of type ">
	//   31   63:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:aload_1         
	//   33   67:invokevirtual   #30  <Method String Class.getName()>
	//   34   70:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   35   73:ldc2            #672 <String "): ">
	//   36   76:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   37   79:aload_2         
	//   38   80:invokevirtual   #675 <Method String Exception.getMessage()>
	//   39   83:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   40   86:invokevirtual   #140 <Method String StringBuilder.toString()>
	//   41   89:aload_2         
	//   42   90:invokespecial   #678 <Method void IllegalStateException(String, Throwable)>
	//   43   93:athrow          
				}
				return ((JsonSerializer) (serializationconfig));
			}
		}
		return ((JsonSerializer) (serializationconfig));
	//   44   94:aload_2         
	//   45   95:areturn         
	}

	protected final JsonSerializer findSerializerByPrimaryType(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		Object obj;
		obj = ((Object) (javatype.getRawClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #315 <Method Class JavaType.getRawClass()>
	//    2    4:astore          5
		JsonSerializer jsonserializer = findOptionalStdSerializer(serializerprovider, javatype, beandescription, flag);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:iload           4
	//    8   12:invokevirtual   #682 <Method JsonSerializer findOptionalStdSerializer(SerializerProvider, JavaType, BeanDescription, boolean)>
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
	//*  16   29:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  17   32:ifeq            39
			return ((JsonSerializer) (CalendarSerializer.instance));
	//   18   35:getstatic       #83  <Field CalendarSerializer CalendarSerializer.instance>
	//   19   38:areturn         
		if(((Class) (java/util/Date)).isAssignableFrom(((Class) (obj))))
	//*  20   39:ldc1            #85  <Class Date>
	//*  21   41:aload           5
	//*  22   43:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  23   46:ifeq            53
			return ((JsonSerializer) (DateSerializer.instance));
	//   24   49:getstatic       #90  <Field DateSerializer DateSerializer.instance>
	//   25   52:areturn         
		if(((Class) (java/util/Map$Entry)).isAssignableFrom(((Class) (obj))))
	//*  26   53:ldc1            #114 <Class java.util.Map$Entry>
	//*  27   55:aload           5
	//*  28   57:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   60:ifeq            132
		{
			JavaType javatype2 = javatype.findSuperType(java/util/Map$Entry);
	//   30   63:aload_2         
	//   31   64:ldc1            #114 <Class java.util.Map$Entry>
	//   32   66:invokevirtual   #686 <Method JavaType JavaType.findSuperType(Class)>
	//   33   69:astore          7
			JavaType javatype1 = javatype2.containedType(0);
	//   34   71:aload           7
	//   35   73:iconst_0        
	//   36   74:invokevirtual   #690 <Method JavaType JavaType.containedType(int)>
	//   37   77:astore          6
			obj = ((Object) (javatype1));
	//   38   79:aload           6
	//   39   81:astore          5
			if(javatype1 == null)
	//*  40   83:aload           6
	//*  41   85:ifnonnull       93
				obj = ((Object) (TypeFactory.unknownType()));
	//   42   88:invokestatic    #454 <Method JavaType TypeFactory.unknownType()>
	//   43   91:astore          5
			javatype2 = javatype2.containedType(1);
	//   44   93:aload           7
	//   45   95:iconst_1        
	//   46   96:invokevirtual   #690 <Method JavaType JavaType.containedType(int)>
	//   47   99:astore          7
			javatype1 = javatype2;
	//   48  101:aload           7
	//   49  103:astore          6
			if(javatype2 == null)
	//*  50  105:aload           7
	//*  51  107:ifnonnull       115
				javatype1 = TypeFactory.unknownType();
	//   52  110:invokestatic    #454 <Method JavaType TypeFactory.unknownType()>
	//   53  113:astore          6
			return buildMapEntrySerializer(serializerprovider.getConfig(), javatype, beandescription, flag, ((JavaType) (obj)), javatype1);
	//   54  115:aload_0         
	//   55  116:aload_1         
	//   56  117:invokevirtual   #207 <Method SerializationConfig SerializerProvider.getConfig()>
	//   57  120:aload_2         
	//   58  121:aload_3         
	//   59  122:iload           4
	//   60  124:aload           5
	//   61  126:aload           6
	//   62  128:invokevirtual   #692 <Method JsonSerializer buildMapEntrySerializer(SerializationConfig, JavaType, BeanDescription, boolean, JavaType, JavaType)>
	//   63  131:areturn         
		}
		if(((Class) (java/nio/ByteBuffer)).isAssignableFrom(((Class) (obj))))
	//*  64  132:ldc2            #694 <Class ByteBuffer>
	//*  65  135:aload           5
	//*  66  137:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  67  140:ifeq            151
			return ((JsonSerializer) (new ByteBufferSerializer()));
	//   68  143:new             #696 <Class ByteBufferSerializer>
	//   69  146:dup             
	//   70  147:invokespecial   #697 <Method void ByteBufferSerializer()>
	//   71  150:areturn         
		if(((Class) (java/net/InetAddress)).isAssignableFrom(((Class) (obj))))
	//*  72  151:ldc2            #699 <Class InetAddress>
	//*  73  154:aload           5
	//*  74  156:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  75  159:ifeq            170
			return ((JsonSerializer) (new InetAddressSerializer()));
	//   76  162:new             #701 <Class InetAddressSerializer>
	//   77  165:dup             
	//   78  166:invokespecial   #702 <Method void InetAddressSerializer()>
	//   79  169:areturn         
		if(((Class) (java/net/InetSocketAddress)).isAssignableFrom(((Class) (obj))))
	//*  80  170:ldc2            #704 <Class InetSocketAddress>
	//*  81  173:aload           5
	//*  82  175:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  83  178:ifeq            189
			return ((JsonSerializer) (new InetSocketAddressSerializer()));
	//   84  181:new             #706 <Class InetSocketAddressSerializer>
	//   85  184:dup             
	//   86  185:invokespecial   #707 <Method void InetSocketAddressSerializer()>
	//   87  188:areturn         
		if(((Class) (java/util/TimeZone)).isAssignableFrom(((Class) (obj))))
	//*  88  189:ldc2            #709 <Class TimeZone>
	//*  89  192:aload           5
	//*  90  194:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  91  197:ifeq            208
			return ((JsonSerializer) (new TimeZoneSerializer()));
	//   92  200:new             #711 <Class TimeZoneSerializer>
	//   93  203:dup             
	//   94  204:invokespecial   #712 <Method void TimeZoneSerializer()>
	//   95  207:areturn         
		if(((Class) (java/nio/charset/Charset)).isAssignableFrom(((Class) (obj))))
	//*  96  208:ldc2            #714 <Class Charset>
	//*  97  211:aload           5
	//*  98  213:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//*  99  216:ifeq            223
			return ((JsonSerializer) (ToStringSerializer.instance));
	//  100  219:getstatic       #43  <Field ToStringSerializer ToStringSerializer.instance>
	//  101  222:areturn         
		if(!((Class) (java/lang/Number)).isAssignableFrom(((Class) (obj)))) goto _L2; else goto _L1
	//  102  223:ldc2            #716 <Class Number>
	//  103  226:aload           5
	//  104  228:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//  105  231:ifeq            290
_L1:
		serializerprovider = ((SerializerProvider) (beandescription.findExpectedFormat(((com.fasterxml.jackson.annotation.JsonFormat.Value) (null)))));
	//  106  234:aload_3         
	//  107  235:aconst_null     
	//  108  236:invokevirtual   #280 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanDescription.findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//  109  239:astore_1        
		if(serializerprovider == null) goto _L4; else goto _L3
	//  110  240:aload_1         
	//  111  241:ifnull          280
_L3:
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
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
			//    5   12:getstatic       #25  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
			//    6   15:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
			//*  10   23:getstatic       #32  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
			//*  11   26:invokevirtual   #29  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:invokestatic    #37  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape[] com.fasterxml.jackson.annotation.JsonFormat$Shape.values()>
			//*  15   34:arraylength     
			//*  16   35:newarray        int[]
			//*  17   37:putstatic       #39  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
			//*  18   40:getstatic       #39  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
			//*  19   43:getstatic       #43  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
			//*  20   46:invokevirtual   #44  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
			//*  21   49:iconst_1        
			//*  22   50:iastore         
			//*  23   51:getstatic       #39  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
			//*  24   54:getstatic       #47  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.OBJECT>
			//*  25   57:invokevirtual   #44  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
			//*  26   60:iconst_2        
			//*  27   61:iastore         
			//*  28   62:getstatic       #39  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
			//*  29   65:getstatic       #50  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ARRAY>
			//*  30   68:invokevirtual   #44  <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
			//*  31   71:iconst_3        
			//*  32   72:iastore         
			//*  33   73:return          
			//*  34   74:astore_0        
			//*  35   75:return          
			//*  36   76:astore_0        
			//*  37   77:goto            62
			//*  38   80:astore_0        
			//*  39   81:goto            51
			//*  40   84:astore_0        
			//*  41   85:goto            31
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   42   88:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  43   89:goto            20
			}
		}

		_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getShape().ordinal()];
	//  112  244:getstatic       #720 <Field int[] BasicSerializerFactory$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape>
	//  113  247:aload_1         
	//  114  248:invokevirtual   #286 <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//  115  251:invokevirtual   #724 <Method int com.fasterxml.jackson.annotation.JsonFormat$Shape.ordinal()>
	//  116  254:iaload          
		JVM INSTR tableswitch 1 3: default 280
	//	               1 284
	//	               2 288
	//	               3 288;
	//  117  255:tableswitch     1 3: default 280
	//	               1 284
	//	               2 288
	//	               3 288
		   goto _L4 _L5 _L6 _L6
_L4:
		return ((JsonSerializer) (NumberSerializer.instance));
	//  118  280:getstatic       #727 <Field NumberSerializer NumberSerializer.instance>
	//  119  283:areturn         
_L5:
		return ((JsonSerializer) (ToStringSerializer.instance));
	//  120  284:getstatic       #43  <Field ToStringSerializer ToStringSerializer.instance>
	//  121  287:areturn         
_L6:
		return null;
	//  122  288:aconst_null     
	//  123  289:areturn         
_L2:
		if(((Class) (java/lang/Enum)).isAssignableFrom(((Class) (obj))))
	//* 124  290:ldc2            #729 <Class Enum>
	//* 125  293:aload           5
	//* 126  295:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//* 127  298:ifeq            312
			return buildEnumSerializer(serializerprovider.getConfig(), javatype, beandescription);
	//  128  301:aload_0         
	//  129  302:aload_1         
	//  130  303:invokevirtual   #207 <Method SerializationConfig SerializerProvider.getConfig()>
	//  131  306:aload_2         
	//  132  307:aload_3         
	//  133  308:invokevirtual   #731 <Method JsonSerializer buildEnumSerializer(SerializationConfig, JavaType, BeanDescription)>
	//  134  311:areturn         
		else
			return null;
	//  135  312:aconst_null     
	//  136  313:areturn         
	}

	protected JsonSerializer findSerializerFromAnnotation(SerializerProvider serializerprovider, Annotated annotated)
		throws JsonMappingException
	{
		Object obj = serializerprovider.getAnnotationIntrospector().findSerializer(annotated);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #169 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #733 <Method Object AnnotationIntrospector.findSerializer(Annotated)>
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
	//   15   21:invokevirtual   #179 <Method JsonSerializer SerializerProvider.serializerInstance(Annotated, Object)>
	//   16   24:invokevirtual   #735 <Method JsonSerializer findConvertingSerializer(SerializerProvider, Annotated, JsonSerializer)>
	//   17   27:areturn         
	}

	protected Object findSuppressableContentValue(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException
	{
		serializationconfig = ((SerializationConfig) (beandescription.findPropertyInclusion(serializationconfig.getDefaultPropertyInclusion())));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #739 <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializationConfig.getDefaultPropertyInclusion()>
	//    3    5:invokevirtual   #743 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanDescription.findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    4    8:astore_1        
		if(serializationconfig != null) goto _L2; else goto _L1
	//    5    9:aload_1         
	//    6   10:ifnonnull       17
_L1:
		serializationconfig = null;
	//    7   13:aconst_null     
	//    8   14:astore_1        
_L4:
		return ((Object) (serializationconfig));
	//    9   15:aload_1         
	//   10   16:areturn         
_L2:
		javatype = ((JavaType) (((com.fasterxml.jackson.annotation.JsonInclude.Value) (serializationconfig)).getContentInclusion()));
	//   11   17:aload_1         
	//   12   18:invokevirtual   #749 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getContentInclusion()>
	//   13   21:astore_2        
		serializationconfig = ((SerializationConfig) (javatype));
	//   14   22:aload_2         
	//   15   23:astore_1        
		switch(_cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Include) (javatype)).ordinal()])
	//*  16   24:getstatic       #752 <Field int[] BasicSerializerFactory$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//*  17   27:aload_2         
	//*  18   28:invokevirtual   #755 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//*  19   31:iaload          
		{
	//*  20   32:tableswitch     1 2: default 56
	//	               1 58
	//	               2 15
		default:
			return ((Object) (javatype));
	//   21   56:aload_2         
	//   22   57:areturn         

		case 1: // '\001'
			return ((Object) (null));
	//   23   58:aconst_null     
	//   24   59:areturn         

		case 2: // '\002'
			break;
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	public SerializerFactoryConfig getFactoryConfig()
	{
		return _factoryConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//    2    4:areturn         
	}

	protected boolean isIndexedList(Class class1)
	{
		return ((Class) (java/util/RandomAccess)).isAssignableFrom(class1);
	//    0    0:ldc2            #759 <Class RandomAccess>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #300 <Method boolean Class.isAssignableFrom(Class)>
	//    3    7:ireturn         
	}

	protected boolean usesStaticTyping(SerializationConfig serializationconfig, BeanDescription beandescription, TypeSerializer typeserializer)
	{
		if(typeserializer == null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          6
	//*   2    4:iconst_0        
	//*   3    5:ireturn         
		{
			beandescription = ((BeanDescription) (serializationconfig.getAnnotationIntrospector().findSerializationTyping(((Annotated) (beandescription.getClassInfo())))));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #488 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #356 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//    8   14:invokevirtual   #766 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(Annotated)>
	//    9   17:astore_2        
			if(beandescription != null && beandescription != com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DEFAULT_TYPING)
	//*  10   18:aload_2         
	//*  11   19:ifnull          38
	//*  12   22:aload_2         
	//*  13   23:getstatic       #772 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.DEFAULT_TYPING>
	//*  14   26:if_acmpeq       38
			{
				if(beandescription == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC)
	//*  15   29:aload_2         
	//*  16   30:getstatic       #775 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.STATIC>
	//*  17   33:if_acmpne       4
					return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
			} else
			{
				return serializationconfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
	//   20   38:aload_1         
	//   21   39:getstatic       #778 <Field MapperFeature MapperFeature.USE_STATIC_TYPING>
	//   22   42:invokevirtual   #562 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//   23   45:ireturn         
			}
		}
		return false;
	}

	public final SerializerFactory withAdditionalKeySerializers(Serializers serializers)
	{
		return withConfig(_factoryConfig.withAdditionalKeySerializers(serializers));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #783 <Method SerializerFactoryConfig SerializerFactoryConfig.withAdditionalKeySerializers(Serializers)>
	//    5    9:invokevirtual   #787 <Method SerializerFactory withConfig(SerializerFactoryConfig)>
	//    6   12:areturn         
	}

	public final SerializerFactory withAdditionalSerializers(Serializers serializers)
	{
		return withConfig(_factoryConfig.withAdditionalSerializers(serializers));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #790 <Method SerializerFactoryConfig SerializerFactoryConfig.withAdditionalSerializers(Serializers)>
	//    5    9:invokevirtual   #787 <Method SerializerFactory withConfig(SerializerFactoryConfig)>
	//    6   12:areturn         
	}

	public abstract SerializerFactory withConfig(SerializerFactoryConfig serializerfactoryconfig);

	public final SerializerFactory withSerializerModifier(BeanSerializerModifier beanserializermodifier)
	{
		return withConfig(_factoryConfig.withSerializerModifier(beanserializermodifier));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #159 <Field SerializerFactoryConfig _factoryConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #795 <Method SerializerFactoryConfig SerializerFactoryConfig.withSerializerModifier(BeanSerializerModifier)>
	//    5    9:invokevirtual   #787 <Method SerializerFactory withConfig(SerializerFactoryConfig)>
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
		NumberSerializers.addAll(((java.util.Map) (hashmap1)));
	//   42   82:aload_1         
	//   43   83:invokestatic    #59  <Method void NumberSerializers.addAll(java.util.Map)>
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
	//*  97  202:ifeq            326
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
			else
	//* 117  253:goto            196
			if(obj instanceof Class)
	//* 118  256:aload           4
	//* 119  258:instanceof      #26  <Class Class>
	//* 120  261:ifeq            293
			{
				obj = ((Object) ((Class)obj));
	//  121  264:aload           4
	//  122  266:checkcast       #26  <Class Class>
	//  123  269:astore          4
				hashmap.put(((Object) (((Class)entry.getKey()).getName())), obj);
	//  124  271:aload_0         
	//  125  272:aload_3         
	//  126  273:invokeinterface #122 <Method Object java.util.Map$Entry.getKey()>
	//  127  278:checkcast       #26  <Class Class>
	//  128  281:invokevirtual   #30  <Method String Class.getName()>
	//  129  284:aload           4
	//  130  286:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//  131  289:pop             
			} else
	//* 132  290:goto            196
			{
				throw new IllegalStateException((new StringBuilder()).append("Internal error: unrecognized value of type ").append(((Object) (entry)).getClass().getName()).toString());
	//  133  293:new             #124 <Class IllegalStateException>
	//  134  296:dup             
	//  135  297:new             #47  <Class StringBuilder>
	//  136  300:dup             
	//  137  301:invokespecial   #125 <Method void StringBuilder()>
	//  138  304:ldc1            #127 <String "Internal error: unrecognized value of type ">
	//  139  306:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  140  309:aload_3         
	//  141  310:invokevirtual   #137 <Method Class Object.getClass()>
	//  142  313:invokevirtual   #30  <Method String Class.getName()>
	//  143  316:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  144  319:invokevirtual   #140 <Method String StringBuilder.toString()>
	//  145  322:invokespecial   #143 <Method void IllegalStateException(String)>
	//  146  325:athrow          
			}
		}

		hashmap.put(((Object) (((Class) (com/fasterxml/jackson/databind/util/TokenBuffer)).getName())), com/fasterxml/jackson/databind/ser/std/TokenBufferSerializer);
	//  147  326:aload_0         
	//  148  327:ldc1            #145 <Class TokenBuffer>
	//  149  329:invokevirtual   #30  <Method String Class.getName()>
	//  150  332:ldc1            #147 <Class TokenBufferSerializer>
	//  151  334:invokevirtual   #37  <Method Object HashMap.put(Object, Object)>
	//  152  337:pop             
		_concrete = hashmap1;
	//  153  338:aload_1         
	//  154  339:putstatic       #149 <Field HashMap _concrete>
		_concreteLazy = hashmap;
	//  155  342:aload_0         
	//  156  343:putstatic       #151 <Field HashMap _concreteLazy>
	//* 157  346:return          
	}
}
