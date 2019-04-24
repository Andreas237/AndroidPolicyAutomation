// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.*;
import java.io.Serializable;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BasicSerializerFactory, PropertyBuilder, ResolvableSerializer, BeanSerializerModifier, 
//			Serializers, BeanSerializerBuilder, AnyGetterWriter, BeanPropertyWriter, 
//			SerializerFactory

public class BeanSerializerFactory extends BasicSerializerFactory
	implements Serializable
{

	protected BeanSerializerFactory(SerializerFactoryConfig serializerfactoryconfig)
	{
		super(serializerfactoryconfig);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void BasicSerializerFactory(SerializerFactoryConfig)>
	//    3    5:return          
	}

	protected BeanPropertyWriter _constructWriter(SerializerProvider serializerprovider, BeanPropertyDefinition beanpropertydefinition, PropertyBuilder propertybuilder, boolean flag, AnnotatedMember annotatedmember)
		throws JsonMappingException
	{
		Object obj = ((Object) (beanpropertydefinition.getFullName()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #32  <Method PropertyName BeanPropertyDefinition.getFullName()>
	//    2    4:astore          6
		if(serializerprovider.canOverrideAccessModifiers())
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #38  <Method boolean SerializerProvider.canOverrideAccessModifiers()>
	//*   5   10:ifeq            25
			annotatedmember.fixAccess(serializerprovider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//    6   13:aload           5
	//    7   15:aload_1         
	//    8   16:getstatic       #44  <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//    9   19:invokevirtual   #48  <Method boolean SerializerProvider.isEnabled(MapperFeature)>
	//   10   22:invokevirtual   #54  <Method void AnnotatedMember.fixAccess(boolean)>
		JavaType javatype = annotatedmember.getType();
	//   11   25:aload           5
	//   12   27:invokevirtual   #58  <Method JavaType AnnotatedMember.getType()>
	//   13   30:astore          7
		obj = ((Object) (new com.fasterxml.jackson.databind.BeanProperty.Std(((PropertyName) (obj)), javatype, beanpropertydefinition.getWrapperName(), propertybuilder.getClassAnnotations(), annotatedmember, beanpropertydefinition.getMetadata())));
	//   14   32:new             #60  <Class com.fasterxml.jackson.databind.BeanProperty$Std>
	//   15   35:dup             
	//   16   36:aload           6
	//   17   38:aload           7
	//   18   40:aload_2         
	//   19   41:invokevirtual   #63  <Method PropertyName BeanPropertyDefinition.getWrapperName()>
	//   20   44:aload_3         
	//   21   45:invokevirtual   #69  <Method com.fasterxml.jackson.databind.util.Annotations PropertyBuilder.getClassAnnotations()>
	//   22   48:aload           5
	//   23   50:aload_2         
	//   24   51:invokevirtual   #73  <Method PropertyMetadata BeanPropertyDefinition.getMetadata()>
	//   25   54:invokespecial   #76  <Method void com.fasterxml.jackson.databind.BeanProperty$Std(PropertyName, JavaType, PropertyName, com.fasterxml.jackson.databind.util.Annotations, AnnotatedMember, PropertyMetadata)>
	//   26   57:astore          6
		JsonSerializer jsonserializer = findSerializerFromAnnotation(serializerprovider, ((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)));
	//   27   59:aload_0         
	//   28   60:aload_1         
	//   29   61:aload           5
	//   30   63:invokevirtual   #80  <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)>
	//   31   66:astore          8
		if(jsonserializer instanceof ResolvableSerializer)
	//*  32   68:aload           8
	//*  33   70:instanceof      #82  <Class ResolvableSerializer>
	//*  34   73:ifeq            87
			((ResolvableSerializer)jsonserializer).resolve(serializerprovider);
	//   35   76:aload           8
	//   36   78:checkcast       #82  <Class ResolvableSerializer>
	//   37   81:aload_1         
	//   38   82:invokeinterface #86  <Method void ResolvableSerializer.resolve(SerializerProvider)>
		jsonserializer = serializerprovider.handlePrimaryContextualization(jsonserializer, ((com.fasterxml.jackson.databind.BeanProperty) (obj)));
	//   39   87:aload_1         
	//   40   88:aload           8
	//   41   90:aload           6
	//   42   92:invokevirtual   #90  <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, com.fasterxml.jackson.databind.BeanProperty)>
	//   43   95:astore          8
		obj = null;
	//   44   97:aconst_null     
	//   45   98:astore          6
		if(ClassUtil.isCollectionMapOrArray(javatype.getRawClass()) || javatype.isCollectionLikeType() || javatype.isMapLikeType())
	//*  46  100:aload           7
	//*  47  102:invokevirtual   #96  <Method Class JavaType.getRawClass()>
	//*  48  105:invokestatic    #102 <Method boolean ClassUtil.isCollectionMapOrArray(Class)>
	//*  49  108:ifne            127
	//*  50  111:aload           7
	//*  51  113:invokevirtual   #105 <Method boolean JavaType.isCollectionLikeType()>
	//*  52  116:ifne            127
	//*  53  119:aload           7
	//*  54  121:invokevirtual   #108 <Method boolean JavaType.isMapLikeType()>
	//*  55  124:ifeq            141
			obj = ((Object) (findPropertyContentTypeSerializer(javatype, serializerprovider.getConfig(), annotatedmember)));
	//   56  127:aload_0         
	//   57  128:aload           7
	//   58  130:aload_1         
	//   59  131:invokevirtual   #112 <Method SerializationConfig SerializerProvider.getConfig()>
	//   60  134:aload           5
	//   61  136:invokevirtual   #116 <Method TypeSerializer findPropertyContentTypeSerializer(JavaType, SerializationConfig, AnnotatedMember)>
	//   62  139:astore          6
		return propertybuilder.buildWriter(serializerprovider, beanpropertydefinition, javatype, jsonserializer, findPropertyTypeSerializer(javatype, serializerprovider.getConfig(), annotatedmember), ((TypeSerializer) (obj)), annotatedmember, flag);
	//   63  141:aload_3         
	//   64  142:aload_1         
	//   65  143:aload_2         
	//   66  144:aload           7
	//   67  146:aload           8
	//   68  148:aload_0         
	//   69  149:aload           7
	//   70  151:aload_1         
	//   71  152:invokevirtual   #112 <Method SerializationConfig SerializerProvider.getConfig()>
	//   72  155:aload           5
	//   73  157:invokevirtual   #119 <Method TypeSerializer findPropertyTypeSerializer(JavaType, SerializationConfig, AnnotatedMember)>
	//   74  160:aload           6
	//   75  162:aload           5
	//   76  164:iload           4
	//   77  166:invokevirtual   #123 <Method BeanPropertyWriter PropertyBuilder.buildWriter(SerializerProvider, BeanPropertyDefinition, JavaType, JsonSerializer, TypeSerializer, TypeSerializer, AnnotatedMember, boolean)>
	//   78  169:areturn         
	}

	protected JsonSerializer _createSerializer2(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		Object obj;
		SerializationConfig serializationconfig;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		serializationconfig = serializerprovider.getConfig();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #112 <Method SerializationConfig SerializerProvider.getConfig()>
	//    4    7:astore          8
		if(!javatype.isContainerType()) goto _L2; else goto _L1
	//    5    9:aload_2         
	//    6   10:invokevirtual   #129 <Method boolean JavaType.isContainerType()>
	//    7   13:ifeq            58
_L1:
		boolean flag1;
		JsonSerializer jsonserializer;
		flag1 = flag;
	//    8   16:iload           4
	//    9   18:istore          5
		if(!flag)
	//*  10   20:iload           4
	//*  11   22:ifne            35
			flag1 = usesStaticTyping(serializationconfig, beandescription, ((TypeSerializer) (null)));
	//   12   25:aload_0         
	//   13   26:aload           8
	//   14   28:aload_3         
	//   15   29:aconst_null     
	//   16   30:invokevirtual   #133 <Method boolean usesStaticTyping(SerializationConfig, BeanDescription, TypeSerializer)>
	//   17   33:istore          5
		obj = ((Object) (buildContainerSerializer(serializerprovider, javatype, beandescription, flag1)));
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:aload_2         
	//   21   38:aload_3         
	//   22   39:iload           5
	//   23   41:invokevirtual   #136 <Method JsonSerializer buildContainerSerializer(SerializerProvider, JavaType, BeanDescription, boolean)>
	//   24   44:astore          6
		jsonserializer = ((JsonSerializer) (obj));
	//   25   46:aload           6
	//   26   48:astore          7
		if(obj != null)
	//*  27   50:aload           6
	//*  28   52:ifnull          105
			return ((JsonSerializer) (obj));
	//   29   55:aload           6
	//   30   57:areturn         
		  goto _L3
_L2:
		if(!javatype.isReferenceType()) goto _L5; else goto _L4
	//   31   58:aload_2         
	//   32   59:invokevirtual   #139 <Method boolean JavaType.isReferenceType()>
	//   33   62:ifeq            269
_L4:
		obj = ((Object) (findReferenceSerializer(serializerprovider, (ReferenceType)javatype, beandescription, flag)));
	//   34   65:aload_0         
	//   35   66:aload_1         
	//   36   67:aload_2         
	//   37   68:checkcast       #141 <Class ReferenceType>
	//   38   71:aload_3         
	//   39   72:iload           4
	//   40   74:invokevirtual   #145 <Method JsonSerializer findReferenceSerializer(SerializerProvider, ReferenceType, BeanDescription, boolean)>
	//   41   77:astore          6
_L7:
		jsonserializer = ((JsonSerializer) (obj));
	//   42   79:aload           6
	//   43   81:astore          7
		flag1 = flag;
	//   44   83:iload           4
	//   45   85:istore          5
		if(obj == null)
	//*  46   87:aload           6
	//*  47   89:ifnonnull       105
		{
			jsonserializer = findSerializerByAnnotations(serializerprovider, javatype, beandescription);
	//   48   92:aload_0         
	//   49   93:aload_1         
	//   50   94:aload_2         
	//   51   95:aload_3         
	//   52   96:invokevirtual   #149 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//   53   99:astore          7
			flag1 = flag;
	//   54  101:iload           4
	//   55  103:istore          5
		}
_L3:
		obj = ((Object) (jsonserializer));
	//   56  105:aload           7
	//   57  107:astore          6
		if(jsonserializer == null)
	//*  58  109:aload           7
	//*  59  111:ifnonnull       201
		{
			JsonSerializer jsonserializer1 = findSerializerByLookup(javatype, serializationconfig, beandescription, flag1);
	//   60  114:aload_0         
	//   61  115:aload_2         
	//   62  116:aload           8
	//   63  118:aload_3         
	//   64  119:iload           5
	//   65  121:invokevirtual   #153 <Method JsonSerializer findSerializerByLookup(JavaType, SerializationConfig, BeanDescription, boolean)>
	//   66  124:astore          7
			obj = ((Object) (jsonserializer1));
	//   67  126:aload           7
	//   68  128:astore          6
			if(jsonserializer1 == null)
	//*  69  130:aload           7
	//*  70  132:ifnonnull       201
			{
				JsonSerializer jsonserializer2 = findSerializerByPrimaryType(serializerprovider, javatype, beandescription, flag1);
	//   71  135:aload_0         
	//   72  136:aload_1         
	//   73  137:aload_2         
	//   74  138:aload_3         
	//   75  139:iload           5
	//   76  141:invokevirtual   #156 <Method JsonSerializer findSerializerByPrimaryType(SerializerProvider, JavaType, BeanDescription, boolean)>
	//   77  144:astore          7
				obj = ((Object) (jsonserializer2));
	//   78  146:aload           7
	//   79  148:astore          6
				if(jsonserializer2 == null)
	//*  80  150:aload           7
	//*  81  152:ifnonnull       201
				{
					JsonSerializer jsonserializer3 = findBeanSerializer(serializerprovider, javatype, beandescription);
	//   82  155:aload_0         
	//   83  156:aload_1         
	//   84  157:aload_2         
	//   85  158:aload_3         
	//   86  159:invokevirtual   #159 <Method JsonSerializer findBeanSerializer(SerializerProvider, JavaType, BeanDescription)>
	//   87  162:astore          7
					obj = ((Object) (jsonserializer3));
	//   88  164:aload           7
	//   89  166:astore          6
					if(jsonserializer3 == null)
	//*  90  168:aload           7
	//*  91  170:ifnonnull       201
					{
						javatype = ((JavaType) (findSerializerByAddonType(serializationconfig, javatype, beandescription, flag1)));
	//   92  173:aload_0         
	//   93  174:aload           8
	//   94  176:aload_2         
	//   95  177:aload_3         
	//   96  178:iload           5
	//   97  180:invokevirtual   #163 <Method JsonSerializer findSerializerByAddonType(SerializationConfig, JavaType, BeanDescription, boolean)>
	//   98  183:astore_2        
						obj = ((Object) (javatype));
	//   99  184:aload_2         
	//  100  185:astore          6
						if(javatype == null)
	//* 101  187:aload_2         
	//* 102  188:ifnonnull       201
							obj = ((Object) (serializerprovider.getUnknownTypeSerializer(beandescription.getBeanClass())));
	//  103  191:aload_1         
	//  104  192:aload_3         
	//  105  193:invokevirtual   #168 <Method Class BeanDescription.getBeanClass()>
	//  106  196:invokevirtual   #172 <Method JsonSerializer SerializerProvider.getUnknownTypeSerializer(Class)>
	//  107  199:astore          6
					}
				}
			}
		}
		serializerprovider = ((SerializerProvider) (obj));
	//  108  201:aload           6
	//  109  203:astore_1        
		if(obj != null)
	//* 110  204:aload           6
	//* 111  206:ifnull          327
		{
			serializerprovider = ((SerializerProvider) (obj));
	//  112  209:aload           6
	//  113  211:astore_1        
			if(_factoryConfig.hasSerializerModifiers())
	//* 114  212:aload_0         
	//* 115  213:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//* 116  216:invokevirtual   #181 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//* 117  219:ifeq            327
			{
				javatype = ((JavaType) (_factoryConfig.serializerModifiers().iterator()));
	//  118  222:aload_0         
	//  119  223:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//  120  226:invokevirtual   #185 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  121  229:invokeinterface #191 <Method Iterator Iterable.iterator()>
	//  122  234:astore_2        
				do
				{
					serializerprovider = ((SerializerProvider) (obj));
	//  123  235:aload           6
	//  124  237:astore_1        
					if(!((Iterator) (javatype)).hasNext())
						break;
	//  125  238:aload_2         
	//  126  239:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//  127  244:ifeq            327
					obj = ((Object) (((BeanSerializerModifier)((Iterator) (javatype)).next()).modifySerializer(serializationconfig, beandescription, ((JsonSerializer) (obj)))));
	//  128  247:aload_2         
	//  129  248:invokeinterface #200 <Method Object Iterator.next()>
	//  130  253:checkcast       #202 <Class BeanSerializerModifier>
	//  131  256:aload           8
	//  132  258:aload_3         
	//  133  259:aload           6
	//  134  261:invokevirtual   #206 <Method JsonSerializer BeanSerializerModifier.modifySerializer(SerializationConfig, BeanDescription, JsonSerializer)>
	//  135  264:astore          6
				} while(true);
	//  136  266:goto            235
			}
		}
		break; /* Loop/switch isn't completed */
_L5:
		Iterator iterator = customSerializers().iterator();
	//  137  269:aload_0         
	//  138  270:invokevirtual   #209 <Method Iterable customSerializers()>
	//  139  273:invokeinterface #191 <Method Iterator Iterable.iterator()>
	//  140  278:astore          9
		JsonSerializer jsonserializer4;
		do
		{
			if(!iterator.hasNext())
				continue; /* Loop/switch isn't completed */
	//  141  280:aload           9
	//  142  282:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//  143  287:ifeq            79
			jsonserializer4 = ((Serializers)iterator.next()).findSerializer(serializationconfig, javatype, beandescription);
	//  144  290:aload           9
	//  145  292:invokeinterface #200 <Method Object Iterator.next()>
	//  146  297:checkcast       #211 <Class Serializers>
	//  147  300:aload           8
	//  148  302:aload_2         
	//  149  303:aload_3         
	//  150  304:invokeinterface #215 <Method JsonSerializer Serializers.findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//  151  309:astore          7
			obj = ((Object) (jsonserializer4));
	//  152  311:aload           7
	//  153  313:astore          6
		} while(jsonserializer4 == null);
	//  154  315:aload           7
	//  155  317:ifnull          280
		obj = ((Object) (jsonserializer4));
	//  156  320:aload           7
	//  157  322:astore          6
		if(true) goto _L7; else goto _L6
	//  158  324:goto            79
_L6:
		return ((JsonSerializer) (serializerprovider));
	//  159  327:aload_1         
	//  160  328:areturn         
	}

	protected JsonSerializer constructBeanSerializer(SerializerProvider serializerprovider, BeanDescription beandescription)
		throws JsonMappingException
	{
		if(beandescription.getBeanClass() == java/lang/Object)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #168 <Method Class BeanDescription.getBeanClass()>
	//*   2    4:ldc1            #221 <Class Object>
	//*   3    6:if_acmpne       18
		{
			serializerprovider = ((SerializerProvider) (serializerprovider.getUnknownTypeSerializer(java/lang/Object)));
	//    4    9:aload_1         
	//    5   10:ldc1            #221 <Class Object>
	//    6   12:invokevirtual   #172 <Method JsonSerializer SerializerProvider.getUnknownTypeSerializer(Class)>
	//    7   15:astore_1        
		} else
	//*   8   16:aload_1         
	//*   9   17:areturn         
		{
			SerializationConfig serializationconfig = serializerprovider.getConfig();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #112 <Method SerializationConfig SerializerProvider.getConfig()>
	//   12   22:astore          7
			Object obj1 = ((Object) (constructBeanSerializerBuilder(beandescription)));
	//   13   24:aload_0         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #225 <Method BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription)>
	//   16   29:astore          5
			((BeanSerializerBuilder) (obj1)).setConfig(serializationconfig);
	//   17   31:aload           5
	//   18   33:aload           7
	//   19   35:invokevirtual   #231 <Method void BeanSerializerBuilder.setConfig(SerializationConfig)>
			Object obj = ((Object) (findBeanProperties(serializerprovider, beandescription, ((BeanSerializerBuilder) (obj1)))));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:aload_2         
	//   23   41:aload           5
	//   24   43:invokevirtual   #235 <Method List findBeanProperties(SerializerProvider, BeanDescription, BeanSerializerBuilder)>
	//   25   46:astore          4
			Object obj2;
			if(obj == null)
	//*  26   48:aload           4
	//*  27   50:ifnonnull       142
				obj = ((Object) (new ArrayList()));
	//   28   53:new             #237 <Class ArrayList>
	//   29   56:dup             
	//   30   57:invokespecial   #239 <Method void ArrayList()>
	//   31   60:astore          4
			else
	//*  32   62:aload_1         
	//*  33   63:invokevirtual   #243 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//*  34   66:aload           7
	//*  35   68:aload_2         
	//*  36   69:invokevirtual   #247 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//*  37   72:aload           4
	//*  38   74:invokevirtual   #253 <Method void AnnotationIntrospector.findAndAddVirtualProperties(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, List)>
	//*  39   77:aload           4
	//*  40   79:astore          6
	//*  41   81:aload_0         
	//*  42   82:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//*  43   85:invokevirtual   #181 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  44   88:ifeq            157
	//*  45   91:aload_0         
	//*  46   92:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//*  47   95:invokevirtual   #185 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//*  48   98:invokeinterface #191 <Method Iterator Iterable.iterator()>
	//*  49  103:astore          8
	//*  50  105:aload           4
	//*  51  107:astore          6
	//*  52  109:aload           8
	//*  53  111:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//*  54  116:ifeq            157
	//*  55  119:aload           8
	//*  56  121:invokeinterface #200 <Method Object Iterator.next()>
	//*  57  126:checkcast       #202 <Class BeanSerializerModifier>
	//*  58  129:aload           7
	//*  59  131:aload_2         
	//*  60  132:aload           4
	//*  61  134:invokevirtual   #257 <Method List BeanSerializerModifier.changeProperties(SerializationConfig, BeanDescription, List)>
	//*  62  137:astore          4
	//*  63  139:goto            105
				obj = ((Object) (removeOverlappingTypeIds(serializerprovider, beandescription, ((BeanSerializerBuilder) (obj1)), ((List) (obj)))));
	//   64  142:aload_0         
	//   65  143:aload_1         
	//   66  144:aload_2         
	//   67  145:aload           5
	//   68  147:aload           4
	//   69  149:invokevirtual   #261 <Method List removeOverlappingTypeIds(SerializerProvider, BeanDescription, BeanSerializerBuilder, List)>
	//   70  152:astore          4
			serializerprovider.getAnnotationIntrospector().findAndAddVirtualProperties(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), beandescription.getClassInfo(), ((List) (obj)));
			obj2 = obj;
			if(_factoryConfig.hasSerializerModifiers())
			{
				Iterator iterator1 = _factoryConfig.serializerModifiers().iterator();
				do
				{
					obj2 = obj;
					if(!iterator1.hasNext())
						break;
					obj = ((Object) (((BeanSerializerModifier)iterator1.next()).changeProperties(serializationconfig, beandescription, ((List) (obj)))));
				} while(true);
			}
	//*  71  154:goto            62
			obj = ((Object) (filterBeanProperties(serializationconfig, beandescription, ((List) (obj2)))));
	//   72  157:aload_0         
	//   73  158:aload           7
	//   74  160:aload_2         
	//   75  161:aload           6
	//   76  163:invokevirtual   #264 <Method List filterBeanProperties(SerializationConfig, BeanDescription, List)>
	//   77  166:astore          4
			obj2 = obj;
	//   78  168:aload           4
	//   79  170:astore          6
			if(_factoryConfig.hasSerializerModifiers())
	//*  80  172:aload_0         
	//*  81  173:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//*  82  176:invokevirtual   #181 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  83  179:ifeq            233
			{
				Iterator iterator2 = _factoryConfig.serializerModifiers().iterator();
	//   84  182:aload_0         
	//   85  183:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//   86  186:invokevirtual   #185 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//   87  189:invokeinterface #191 <Method Iterator Iterable.iterator()>
	//   88  194:astore          8
				do
				{
					obj2 = obj;
	//   89  196:aload           4
	//   90  198:astore          6
					if(!iterator2.hasNext())
						break;
	//   91  200:aload           8
	//   92  202:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   93  207:ifeq            233
					obj = ((Object) (((BeanSerializerModifier)iterator2.next()).orderProperties(serializationconfig, beandescription, ((List) (obj)))));
	//   94  210:aload           8
	//   95  212:invokeinterface #200 <Method Object Iterator.next()>
	//   96  217:checkcast       #202 <Class BeanSerializerModifier>
	//   97  220:aload           7
	//   98  222:aload_2         
	//   99  223:aload           4
	//  100  225:invokevirtual   #267 <Method List BeanSerializerModifier.orderProperties(SerializationConfig, BeanDescription, List)>
	//  101  228:astore          4
				} while(true);
	//  102  230:goto            196
			}
			((BeanSerializerBuilder) (obj1)).setObjectIdWriter(constructObjectIdHandler(serializerprovider, beandescription, ((List) (obj2))));
	//  103  233:aload           5
	//  104  235:aload_0         
	//  105  236:aload_1         
	//  106  237:aload_2         
	//  107  238:aload           6
	//  108  240:invokevirtual   #271 <Method ObjectIdWriter constructObjectIdHandler(SerializerProvider, BeanDescription, List)>
	//  109  243:invokevirtual   #275 <Method void BeanSerializerBuilder.setObjectIdWriter(ObjectIdWriter)>
			((BeanSerializerBuilder) (obj1)).setProperties(((List) (obj2)));
	//  110  246:aload           5
	//  111  248:aload           6
	//  112  250:invokevirtual   #279 <Method void BeanSerializerBuilder.setProperties(List)>
			((BeanSerializerBuilder) (obj1)).setFilterId(findFilterId(serializationconfig, beandescription));
	//  113  253:aload           5
	//  114  255:aload_0         
	//  115  256:aload           7
	//  116  258:aload_2         
	//  117  259:invokevirtual   #283 <Method Object findFilterId(SerializationConfig, BeanDescription)>
	//  118  262:invokevirtual   #287 <Method void BeanSerializerBuilder.setFilterId(Object)>
			obj2 = ((Object) (beandescription.findAnyGetter()));
	//  119  265:aload_2         
	//  120  266:invokevirtual   #291 <Method AnnotatedMember BeanDescription.findAnyGetter()>
	//  121  269:astore          6
			if(obj2 != null)
	//* 122  271:aload           6
	//* 123  273:ifnull          402
			{
				if(serializationconfig.canOverrideAccessModifiers())
	//* 124  276:aload           7
	//* 125  278:invokevirtual   #294 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//* 126  281:ifeq            297
					((AnnotatedMember) (obj2)).fixAccess(serializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//  127  284:aload           6
	//  128  286:aload           7
	//  129  288:getstatic       #44  <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//  130  291:invokevirtual   #295 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//  131  294:invokevirtual   #54  <Method void AnnotatedMember.fixAccess(boolean)>
				JavaType javatype1 = ((AnnotatedMember) (obj2)).getType();
	//  132  297:aload           6
	//  133  299:invokevirtual   #58  <Method JavaType AnnotatedMember.getType()>
	//  134  302:astore          9
				boolean flag = serializationconfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
	//  135  304:aload           7
	//  136  306:getstatic       #298 <Field MapperFeature MapperFeature.USE_STATIC_TYPING>
	//  137  309:invokevirtual   #295 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//  138  312:istore_3        
				JavaType javatype = javatype1.getContentType();
	//  139  313:aload           9
	//  140  315:invokevirtual   #301 <Method JavaType JavaType.getContentType()>
	//  141  318:astore          8
				TypeSerializer typeserializer = createTypeSerializer(serializationconfig, javatype);
	//  142  320:aload_0         
	//  143  321:aload           7
	//  144  323:aload           8
	//  145  325:invokevirtual   #305 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//  146  328:astore          10
				obj = ((Object) (findSerializerFromAnnotation(serializerprovider, ((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)))));
	//  147  330:aload_0         
	//  148  331:aload_1         
	//  149  332:aload           6
	//  150  334:invokevirtual   #80  <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)>
	//  151  337:astore          4
				serializerprovider = ((SerializerProvider) (obj));
	//  152  339:aload           4
	//  153  341:astore_1        
				if(obj == null)
	//* 154  342:aload           4
	//* 155  344:ifnonnull       360
					serializerprovider = ((SerializerProvider) (MapSerializer.construct(((String []) (null)), javatype1, flag, typeserializer, ((JsonSerializer) (null)), ((JsonSerializer) (null)), ((Object) (null)))));
	//  156  347:aconst_null     
	//  157  348:aload           9
	//  158  350:iload_3         
	//  159  351:aload           10
	//  160  353:aconst_null     
	//  161  354:aconst_null     
	//  162  355:aconst_null     
	//  163  356:invokestatic    #311 <Method MapSerializer MapSerializer.construct(String[], JavaType, boolean, TypeSerializer, JsonSerializer, JsonSerializer, Object)>
	//  164  359:astore_1        
				((BeanSerializerBuilder) (obj1)).setAnyGetter(new AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty) (new com.fasterxml.jackson.databind.BeanProperty.Std(PropertyName.construct(((AnnotatedMember) (obj2)).getName()), javatype, ((PropertyName) (null)), beandescription.getClassAnnotations(), ((AnnotatedMember) (obj2)), PropertyMetadata.STD_OPTIONAL))), ((AnnotatedMember) (obj2)), ((JsonSerializer) (serializerprovider))));
	//  165  360:aload           5
	//  166  362:new             #313 <Class AnyGetterWriter>
	//  167  365:dup             
	//  168  366:new             #60  <Class com.fasterxml.jackson.databind.BeanProperty$Std>
	//  169  369:dup             
	//  170  370:aload           6
	//  171  372:invokevirtual   #317 <Method String AnnotatedMember.getName()>
	//  172  375:invokestatic    #322 <Method PropertyName PropertyName.construct(String)>
	//  173  378:aload           8
	//  174  380:aconst_null     
	//  175  381:aload_2         
	//  176  382:invokevirtual   #323 <Method com.fasterxml.jackson.databind.util.Annotations BeanDescription.getClassAnnotations()>
	//  177  385:aload           6
	//  178  387:getstatic       #329 <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//  179  390:invokespecial   #76  <Method void com.fasterxml.jackson.databind.BeanProperty$Std(PropertyName, JavaType, PropertyName, com.fasterxml.jackson.databind.util.Annotations, AnnotatedMember, PropertyMetadata)>
	//  180  393:aload           6
	//  181  395:aload_1         
	//  182  396:invokespecial   #332 <Method void AnyGetterWriter(com.fasterxml.jackson.databind.BeanProperty, AnnotatedMember, JsonSerializer)>
	//  183  399:invokevirtual   #336 <Method void BeanSerializerBuilder.setAnyGetter(AnyGetterWriter)>
			}
			processViews(serializationconfig, ((BeanSerializerBuilder) (obj1)));
	//  184  402:aload_0         
	//  185  403:aload           7
	//  186  405:aload           5
	//  187  407:invokevirtual   #340 <Method void processViews(SerializationConfig, BeanSerializerBuilder)>
			obj = obj1;
	//  188  410:aload           5
	//  189  412:astore          4
			if(_factoryConfig.hasSerializerModifiers())
	//* 190  414:aload_0         
	//* 191  415:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//* 192  418:invokevirtual   #181 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//* 193  421:ifeq            475
			{
				Iterator iterator = _factoryConfig.serializerModifiers().iterator();
	//  194  424:aload_0         
	//  195  425:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//  196  428:invokevirtual   #185 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  197  431:invokeinterface #191 <Method Iterator Iterable.iterator()>
	//  198  436:astore          6
				serializerprovider = ((SerializerProvider) (obj1));
	//  199  438:aload           5
	//  200  440:astore_1        
				do
				{
					obj = ((Object) (serializerprovider));
	//  201  441:aload_1         
	//  202  442:astore          4
					if(!iterator.hasNext())
						break;
	//  203  444:aload           6
	//  204  446:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//  205  451:ifeq            475
					serializerprovider = ((SerializerProvider) (((BeanSerializerModifier)iterator.next()).updateBuilder(serializationconfig, beandescription, ((BeanSerializerBuilder) (serializerprovider)))));
	//  206  454:aload           6
	//  207  456:invokeinterface #200 <Method Object Iterator.next()>
	//  208  461:checkcast       #202 <Class BeanSerializerModifier>
	//  209  464:aload           7
	//  210  466:aload_2         
	//  211  467:aload_1         
	//  212  468:invokevirtual   #344 <Method BeanSerializerBuilder BeanSerializerModifier.updateBuilder(SerializationConfig, BeanDescription, BeanSerializerBuilder)>
	//  213  471:astore_1        
				} while(true);
	//  214  472:goto            441
			}
			obj1 = ((Object) (((BeanSerializerBuilder) (obj)).build()));
	//  215  475:aload           4
	//  216  477:invokevirtual   #348 <Method JsonSerializer BeanSerializerBuilder.build()>
	//  217  480:astore          5
			serializerprovider = ((SerializerProvider) (obj1));
	//  218  482:aload           5
	//  219  484:astore_1        
			if(obj1 == null)
	//* 220  485:aload           5
	//* 221  487:ifnonnull       16
			{
				serializerprovider = ((SerializerProvider) (obj1));
	//  222  490:aload           5
	//  223  492:astore_1        
				if(beandescription.hasKnownClassAnnotations())
	//* 224  493:aload_2         
	//* 225  494:invokevirtual   #351 <Method boolean BeanDescription.hasKnownClassAnnotations()>
	//* 226  497:ifeq            16
					return ((JsonSerializer) (((BeanSerializerBuilder) (obj)).createDummy()));
	//  227  500:aload           4
	//  228  502:invokevirtual   #355 <Method BeanSerializer BeanSerializerBuilder.createDummy()>
	//  229  505:areturn         
			}
		}
		return ((JsonSerializer) (serializerprovider));
	}

	protected BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription beandescription)
	{
		return new BeanSerializerBuilder(beandescription);
	//    0    0:new             #227 <Class BeanSerializerBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #359 <Method void BeanSerializerBuilder(BeanDescription)>
	//    4    8:areturn         
	}

	protected BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanpropertywriter, Class aclass[])
	{
		return FilteredBeanPropertyWriter.constructViewBased(beanpropertywriter, aclass);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #366 <Method BeanPropertyWriter FilteredBeanPropertyWriter.constructViewBased(BeanPropertyWriter, Class[])>
	//    3    5:areturn         
	}

	protected ObjectIdWriter constructObjectIdHandler(SerializerProvider serializerprovider, BeanDescription beandescription, List list)
		throws JsonMappingException
	{
		ObjectIdInfo objectidinfo = beandescription.getObjectIdInfo();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #371 <Method ObjectIdInfo BeanDescription.getObjectIdInfo()>
	//    2    4:astore          6
		if(objectidinfo == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		Object obj = ((Object) (objectidinfo.getGeneratorType()));
	//    7   13:aload           6
	//    8   15:invokevirtual   #376 <Method Class ObjectIdInfo.getGeneratorType()>
	//    9   18:astore          7
		if(obj == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
	//*  10   20:aload           7
	//*  11   22:ldc2            #378 <Class com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator>
	//*  12   25:if_acmpne       193
		{
			obj = ((Object) (objectidinfo.getPropertyName().getSimpleName()));
	//   13   28:aload           6
	//   14   30:invokevirtual   #381 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//   15   33:invokevirtual   #384 <Method String PropertyName.getSimpleName()>
	//   16   36:astore          7
			int i = 0;
	//   17   38:iconst_0        
	//   18   39:istore          4
			int j = list.size();
	//   19   41:aload_3         
	//   20   42:invokeinterface #390 <Method int List.size()>
	//   21   47:istore          5
			do
			{
				if(i == j)
	//*  22   49:iload           4
	//*  23   51:iload           5
	//*  24   53:icmpne          107
					throw new IllegalArgumentException((new StringBuilder()).append("Invalid Object Id definition for ").append(beandescription.getBeanClass().getName()).append(": can not find property with name '").append(((String) (obj))).append("'").toString());
	//   25   56:new             #392 <Class IllegalArgumentException>
	//   26   59:dup             
	//   27   60:new             #394 <Class StringBuilder>
	//   28   63:dup             
	//   29   64:invokespecial   #395 <Method void StringBuilder()>
	//   30   67:ldc2            #397 <String "Invalid Object Id definition for ">
	//   31   70:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   32   73:aload_2         
	//   33   74:invokevirtual   #168 <Method Class BeanDescription.getBeanClass()>
	//   34   77:invokevirtual   #404 <Method String Class.getName()>
	//   35   80:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   36   83:ldc2            #406 <String ": can not find property with name '">
	//   37   86:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   38   89:aload           7
	//   39   91:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   40   94:ldc2            #408 <String "'">
	//   41   97:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   42  100:invokevirtual   #411 <Method String StringBuilder.toString()>
	//   43  103:invokespecial   #414 <Method void IllegalArgumentException(String)>
	//   44  106:athrow          
				serializerprovider = ((SerializerProvider) ((BeanPropertyWriter)list.get(i)));
	//   45  107:aload_3         
	//   46  108:iload           4
	//   47  110:invokeinterface #418 <Method Object List.get(int)>
	//   48  115:checkcast       #420 <Class BeanPropertyWriter>
	//   49  118:astore_1        
				if(((String) (obj)).equals(((Object) (((BeanPropertyWriter) (serializerprovider)).getName()))))
	//*  50  119:aload           7
	//*  51  121:aload_1         
	//*  52  122:invokevirtual   #421 <Method String BeanPropertyWriter.getName()>
	//*  53  125:invokevirtual   #427 <Method boolean String.equals(Object)>
	//*  54  128:ifeq            184
				{
					if(i > 0)
	//*  55  131:iload           4
	//*  56  133:ifle            153
					{
						list.remove(i);
	//   57  136:aload_3         
	//   58  137:iload           4
	//   59  139:invokeinterface #430 <Method Object List.remove(int)>
	//   60  144:pop             
						list.add(0, ((Object) (serializerprovider)));
	//   61  145:aload_3         
	//   62  146:iconst_0        
	//   63  147:aload_1         
	//   64  148:invokeinterface #434 <Method void List.add(int, Object)>
					}
					beandescription = ((BeanDescription) (((BeanPropertyWriter) (serializerprovider)).getType()));
	//   65  153:aload_1         
	//   66  154:invokevirtual   #435 <Method JavaType BeanPropertyWriter.getType()>
	//   67  157:astore_2        
					serializerprovider = ((SerializerProvider) (new PropertyBasedObjectIdGenerator(objectidinfo, ((BeanPropertyWriter) (serializerprovider)))));
	//   68  158:new             #437 <Class PropertyBasedObjectIdGenerator>
	//   69  161:dup             
	//   70  162:aload           6
	//   71  164:aload_1         
	//   72  165:invokespecial   #440 <Method void PropertyBasedObjectIdGenerator(ObjectIdInfo, BeanPropertyWriter)>
	//   73  168:astore_1        
					return ObjectIdWriter.construct(((JavaType) (beandescription)), (PropertyName)null, ((ObjectIdGenerator) (serializerprovider)), objectidinfo.getAlwaysAsId());
	//   74  169:aload_2         
	//   75  170:aconst_null     
	//   76  171:checkcast       #319 <Class PropertyName>
	//   77  174:aload_1         
	//   78  175:aload           6
	//   79  177:invokevirtual   #443 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//   80  180:invokestatic    #448 <Method ObjectIdWriter ObjectIdWriter.construct(JavaType, PropertyName, ObjectIdGenerator, boolean)>
	//   81  183:areturn         
				}
				i++;
	//   82  184:iload           4
	//   83  186:iconst_1        
	//   84  187:iadd            
	//   85  188:istore          4
			} while(true);
	//   86  190:goto            49
		} else
		{
			list = ((List) (serializerprovider.constructType(((java.lang.reflect.Type) (obj)))));
	//   87  193:aload_1         
	//   88  194:aload           7
	//   89  196:invokevirtual   #452 <Method JavaType SerializerProvider.constructType(java.lang.reflect.Type)>
	//   90  199:astore_3        
			list = ((List) (serializerprovider.getTypeFactory().findTypeParameters(((JavaType) (list)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0]));
	//   91  200:aload_1         
	//   92  201:invokevirtual   #456 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//   93  204:aload_3         
	//   94  205:ldc2            #458 <Class ObjectIdGenerator>
	//   95  208:invokevirtual   #464 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//   96  211:iconst_0        
	//   97  212:aaload          
	//   98  213:astore_3        
			serializerprovider = ((SerializerProvider) (serializerprovider.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (beandescription.getClassInfo())), objectidinfo)));
	//   99  214:aload_1         
	//  100  215:aload_2         
	//  101  216:invokevirtual   #247 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//  102  219:aload           6
	//  103  221:invokevirtual   #468 <Method ObjectIdGenerator SerializerProvider.objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//  104  224:astore_1        
			return ObjectIdWriter.construct(((JavaType) (list)), objectidinfo.getPropertyName(), ((ObjectIdGenerator) (serializerprovider)), objectidinfo.getAlwaysAsId());
	//  105  225:aload_3         
	//  106  226:aload           6
	//  107  228:invokevirtual   #381 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//  108  231:aload_1         
	//  109  232:aload           6
	//  110  234:invokevirtual   #443 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//  111  237:invokestatic    #448 <Method ObjectIdWriter ObjectIdWriter.construct(JavaType, PropertyName, ObjectIdGenerator, boolean)>
	//  112  240:areturn         
		}
	}

	protected PropertyBuilder constructPropertyBuilder(SerializationConfig serializationconfig, BeanDescription beandescription)
	{
		return new PropertyBuilder(serializationconfig, beandescription);
	//    0    0:new             #65  <Class PropertyBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #474 <Method void PropertyBuilder(SerializationConfig, BeanDescription)>
	//    5    9:areturn         
	}

	public JsonSerializer createSerializer(SerializerProvider serializerprovider, JavaType javatype)
		throws JsonMappingException
	{
		boolean flag;
		BeanDescription beandescription;
		Object obj;
		JsonSerializer jsonserializer;
		SerializationConfig serializationconfig;
		Converter converter;
		serializationconfig = serializerprovider.getConfig();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #112 <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore          8
		beandescription = serializationconfig.introspect(javatype);
	//    3    6:aload           8
	//    4    8:aload_2         
	//    5    9:invokevirtual   #480 <Method BeanDescription SerializationConfig.introspect(JavaType)>
	//    6   12:astore          5
		jsonserializer = findSerializerFromAnnotation(serializerprovider, ((com.fasterxml.jackson.databind.introspect.Annotated) (beandescription.getClassInfo())));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload           5
	//   10   18:invokevirtual   #247 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   11   21:invokevirtual   #80  <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)>
	//   12   24:astore          7
		if(jsonserializer != null)
	//*  13   26:aload           7
	//*  14   28:ifnull          34
			return jsonserializer;
	//   15   31:aload           7
	//   16   33:areturn         
		obj = ((Object) (serializationconfig.getAnnotationIntrospector()));
	//   17   34:aload           8
	//   18   36:invokevirtual   #481 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//   19   39:astore          6
		if(obj == null)
	//*  20   41:aload           6
	//*  21   43:ifnonnull       80
			obj = ((Object) (javatype));
	//   22   46:aload_2         
	//   23   47:astore          6
		else
	//*  24   49:aload           6
	//*  25   51:aload_2         
	//*  26   52:if_acmpne       98
	//*  27   55:iconst_0        
	//*  28   56:istore_3        
	//*  29   57:aload           5
	//*  30   59:invokevirtual   #485 <Method Converter BeanDescription.findSerializationConverter()>
	//*  31   62:astore          9
	//*  32   64:aload           9
	//*  33   66:ifnonnull       131
	//*  34   69:aload_0         
	//*  35   70:aload_1         
	//*  36   71:aload           6
	//*  37   73:aload           5
	//*  38   75:iload_3         
	//*  39   76:invokevirtual   #487 <Method JsonSerializer _createSerializer2(SerializerProvider, JavaType, BeanDescription, boolean)>
	//*  40   79:areturn         
			obj = ((Object) (((AnnotationIntrospector) (obj)).refineSerializationType(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), ((com.fasterxml.jackson.databind.introspect.Annotated) (beandescription.getClassInfo())), javatype)));
	//   41   80:aload           6
	//   42   82:aload           8
	//   43   84:aload           5
	//   44   86:invokevirtual   #247 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   45   89:aload_2         
	//   46   90:invokevirtual   #491 <Method JavaType AnnotationIntrospector.refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, JavaType)>
	//   47   93:astore          6
		if(obj != javatype) goto _L2; else goto _L1
_L1:
		flag = false;
_L4:
		converter = beandescription.findSerializationConverter();
		if(converter == null)
			return _createSerializer2(serializerprovider, ((JavaType) (obj)), beandescription, flag);
		break; /* Loop/switch isn't completed */
	//*  48   95:goto            49
_L2:
		boolean flag1 = true;
	//   49   98:iconst_1        
	//   50   99:istore          4
		flag = flag1;
	//   51  101:iload           4
	//   52  103:istore_3        
		if(!((JavaType) (obj)).hasRawClass(javatype.getRawClass()))
	//*  53  104:aload           6
	//*  54  106:aload_2         
	//*  55  107:invokevirtual   #96  <Method Class JavaType.getRawClass()>
	//*  56  110:invokevirtual   #494 <Method boolean JavaType.hasRawClass(Class)>
	//*  57  113:ifne            57
		{
			beandescription = serializationconfig.introspect(((JavaType) (obj)));
	//   58  116:aload           8
	//   59  118:aload           6
	//   60  120:invokevirtual   #480 <Method BeanDescription SerializationConfig.introspect(JavaType)>
	//   61  123:astore          5
			flag = flag1;
	//   62  125:iload           4
	//   63  127:istore_3        
		}
		if(true) goto _L4; else goto _L3
	//   64  128:goto            57
_L3:
		JavaType javatype1 = converter.getOutputType(serializerprovider.getTypeFactory());
	//   65  131:aload           9
	//   66  133:aload_1         
	//   67  134:invokevirtual   #456 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//   68  137:invokeinterface #500 <Method JavaType Converter.getOutputType(TypeFactory)>
	//   69  142:astore          10
		javatype = ((JavaType) (jsonserializer));
	//   70  144:aload           7
	//   71  146:astore_2        
		if(!javatype1.hasRawClass(((JavaType) (obj)).getRawClass()))
	//*  72  147:aload           10
	//*  73  149:aload           6
	//*  74  151:invokevirtual   #96  <Method Class JavaType.getRawClass()>
	//*  75  154:invokevirtual   #494 <Method boolean JavaType.hasRawClass(Class)>
	//*  76  157:ifne            180
		{
			beandescription = serializationconfig.introspect(javatype1);
	//   77  160:aload           8
	//   78  162:aload           10
	//   79  164:invokevirtual   #480 <Method BeanDescription SerializationConfig.introspect(JavaType)>
	//   80  167:astore          5
			javatype = ((JavaType) (findSerializerFromAnnotation(serializerprovider, ((com.fasterxml.jackson.databind.introspect.Annotated) (beandescription.getClassInfo())))));
	//   81  169:aload_0         
	//   82  170:aload_1         
	//   83  171:aload           5
	//   84  173:invokevirtual   #247 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   85  176:invokevirtual   #80  <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)>
	//   86  179:astore_2        
		}
		obj = ((Object) (javatype));
	//   87  180:aload_2         
	//   88  181:astore          6
		if(javatype == null)
	//*  89  183:aload_2         
	//*  90  184:ifnonnull       210
		{
			obj = ((Object) (javatype));
	//   91  187:aload_2         
	//   92  188:astore          6
			if(!javatype1.isJavaLangObject())
	//*  93  190:aload           10
	//*  94  192:invokevirtual   #503 <Method boolean JavaType.isJavaLangObject()>
	//*  95  195:ifne            210
				obj = ((Object) (_createSerializer2(serializerprovider, javatype1, beandescription, true)));
	//   96  198:aload_0         
	//   97  199:aload_1         
	//   98  200:aload           10
	//   99  202:aload           5
	//  100  204:iconst_1        
	//  101  205:invokevirtual   #487 <Method JsonSerializer _createSerializer2(SerializerProvider, JavaType, BeanDescription, boolean)>
	//  102  208:astore          6
		}
		return ((JsonSerializer) (new StdDelegatingSerializer(converter, javatype1, ((JsonSerializer) (obj)))));
	//  103  210:new             #505 <Class StdDelegatingSerializer>
	//  104  213:dup             
	//  105  214:aload           9
	//  106  216:aload           10
	//  107  218:aload           6
	//  108  220:invokespecial   #508 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//  109  223:areturn         
	}

	protected Iterable customSerializers()
	{
		return _factoryConfig.serializers();
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//    2    4:invokevirtual   #512 <Method Iterable SerializerFactoryConfig.serializers()>
	//    3    7:areturn         
	}

	protected List filterBeanProperties(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
	{
		serializationconfig = ((SerializationConfig) (serializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (beandescription.getClassInfo())), true)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #481 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #247 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #517 <Method String[] AnnotationIntrospector.findPropertiesToIgnore(com.fasterxml.jackson.databind.introspect.Annotated, boolean)>
	//    6   12:astore_1        
		if(serializationconfig != null && serializationconfig.length > 0)
	//*   7   13:aload_1         
	//*   8   14:ifnull          71
	//*   9   17:aload_1         
	//*  10   18:arraylength     
	//*  11   19:ifle            71
		{
			serializationconfig = ((SerializationConfig) (ArrayBuilders.arrayToSet(((Object []) (serializationconfig)))));
	//   12   22:aload_1         
	//   13   23:invokestatic    #523 <Method HashSet ArrayBuilders.arrayToSet(Object[])>
	//   14   26:astore_1        
			beandescription = ((BeanDescription) (list.iterator()));
	//   15   27:aload_3         
	//   16   28:invokeinterface #524 <Method Iterator List.iterator()>
	//   17   33:astore_2        
			do
			{
				if(!((Iterator) (beandescription)).hasNext())
					break;
	//   18   34:aload_2         
	//   19   35:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   20   40:ifeq            71
				if(((HashSet) (serializationconfig)).contains(((Object) (((BeanPropertyWriter)((Iterator) (beandescription)).next()).getName()))))
	//*  21   43:aload_1         
	//*  22   44:aload_2         
	//*  23   45:invokeinterface #200 <Method Object Iterator.next()>
	//*  24   50:checkcast       #420 <Class BeanPropertyWriter>
	//*  25   53:invokevirtual   #421 <Method String BeanPropertyWriter.getName()>
	//*  26   56:invokevirtual   #529 <Method boolean HashSet.contains(Object)>
	//*  27   59:ifeq            34
					((Iterator) (beandescription)).remove();
	//   28   62:aload_2         
	//   29   63:invokeinterface #531 <Method void Iterator.remove()>
			} while(true);
	//   30   68:goto            34
		}
		return list;
	//   31   71:aload_3         
	//   32   72:areturn         
	}

	protected List findBeanProperties(SerializerProvider serializerprovider, BeanDescription beandescription, BeanSerializerBuilder beanserializerbuilder)
		throws JsonMappingException
	{
		Object obj;
		SerializationConfig serializationconfig;
		obj = ((Object) (beandescription.findProperties()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #536 <Method List BeanDescription.findProperties()>
	//    2    4:astore          9
		serializationconfig = serializerprovider.getConfig();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #112 <Method SerializationConfig SerializerProvider.getConfig()>
	//    5   10:astore          10
		removeIgnorableTypes(serializationconfig, beandescription, ((List) (obj)));
	//    6   12:aload_0         
	//    7   13:aload           10
	//    8   15:aload_2         
	//    9   16:aload           9
	//   10   18:invokevirtual   #540 <Method void removeIgnorableTypes(SerializationConfig, BeanDescription, List)>
		if(serializationconfig.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS))
	//*  11   21:aload           10
	//*  12   23:getstatic       #543 <Field MapperFeature MapperFeature.REQUIRE_SETTERS_FOR_GETTERS>
	//*  13   26:invokevirtual   #295 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//*  14   29:ifeq            41
			removeSetterlessGetters(serializationconfig, beandescription, ((List) (obj)));
	//   15   32:aload_0         
	//   16   33:aload           10
	//   17   35:aload_2         
	//   18   36:aload           9
	//   19   38:invokevirtual   #546 <Method void removeSetterlessGetters(SerializationConfig, BeanDescription, List)>
		if(!((List) (obj)).isEmpty()) goto _L2; else goto _L1
	//   20   41:aload           9
	//   21   43:invokeinterface #549 <Method boolean List.isEmpty()>
	//   22   48:ifeq            55
_L1:
		beandescription = null;
	//   23   51:aconst_null     
	//   24   52:astore_2        
_L4:
		return ((List) (beandescription));
	//   25   53:aload_2         
	//   26   54:areturn         
_L2:
		boolean flag1;
		ArrayList arraylist;
		PropertyBuilder propertybuilder;
		flag1 = usesStaticTyping(serializationconfig, beandescription, ((TypeSerializer) (null)));
	//   27   55:aload_0         
	//   28   56:aload           10
	//   29   58:aload_2         
	//   30   59:aconst_null     
	//   31   60:invokevirtual   #133 <Method boolean usesStaticTyping(SerializationConfig, BeanDescription, TypeSerializer)>
	//   32   63:istore          5
		propertybuilder = constructPropertyBuilder(serializationconfig, beandescription);
	//   33   65:aload_0         
	//   34   66:aload           10
	//   35   68:aload_2         
	//   36   69:invokevirtual   #551 <Method PropertyBuilder constructPropertyBuilder(SerializationConfig, BeanDescription)>
	//   37   72:astore          8
		arraylist = new ArrayList(((List) (obj)).size());
	//   38   74:new             #237 <Class ArrayList>
	//   39   77:dup             
	//   40   78:aload           9
	//   41   80:invokeinterface #390 <Method int List.size()>
	//   42   85:invokespecial   #554 <Method void ArrayList(int)>
	//   43   88:astore          7
		boolean flag2 = serializationconfig.canOverrideAccessModifiers();
	//   44   90:aload           10
	//   45   92:invokevirtual   #294 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//   46   95:istore          6
		boolean flag;
		if(flag2 && serializationconfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))
	//*  47   97:iload           6
	//*  48   99:ifeq            188
	//*  49  102:aload           10
	//*  50  104:getstatic       #44  <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//*  51  107:invokevirtual   #295 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//*  52  110:ifeq            188
			flag = true;
	//   53  113:iconst_1        
	//   54  114:istore          4
		else
	//*  55  116:aload           9
	//*  56  118:invokeinterface #524 <Method Iterator List.iterator()>
	//*  57  123:astore          9
	//*  58  125:aload           7
	//*  59  127:astore_2        
	//*  60  128:aload           9
	//*  61  130:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//*  62  135:ifeq            53
	//*  63  138:aload           9
	//*  64  140:invokeinterface #200 <Method Object Iterator.next()>
	//*  65  145:checkcast       #28  <Class BeanPropertyDefinition>
	//*  66  148:astore_2        
	//*  67  149:aload_2         
	//*  68  150:invokevirtual   #557 <Method AnnotatedMember BeanPropertyDefinition.getAccessor()>
	//*  69  153:astore          10
	//*  70  155:aload_2         
	//*  71  156:invokevirtual   #560 <Method boolean BeanPropertyDefinition.isTypeId()>
	//*  72  159:ifeq            194
	//*  73  162:aload           10
	//*  74  164:ifnull          125
	//*  75  167:iload           6
	//*  76  169:ifeq            179
	//*  77  172:aload           10
	//*  78  174:iload           4
	//*  79  176:invokevirtual   #54  <Method void AnnotatedMember.fixAccess(boolean)>
	//*  80  179:aload_3         
	//*  81  180:aload           10
	//*  82  182:invokevirtual   #564 <Method void BeanSerializerBuilder.setTypeId(AnnotatedMember)>
	//*  83  185:goto            125
			flag = false;
	//   84  188:iconst_0        
	//   85  189:istore          4
		obj = ((Object) (((List) (obj)).iterator()));
		beandescription = ((BeanDescription) (arraylist));
		if(((Iterator) (obj)).hasNext())
		{
			beandescription = ((BeanDescription) ((BeanPropertyDefinition)((Iterator) (obj)).next()));
			AnnotatedMember annotatedmember = ((BeanPropertyDefinition) (beandescription)).getAccessor();
			if(((BeanPropertyDefinition) (beandescription)).isTypeId())
			{
				if(annotatedmember != null)
				{
					if(flag2)
						annotatedmember.fixAccess(flag);
					beanserializerbuilder.setTypeId(annotatedmember);
				}
			} else
	//*  86  191:goto            116
			{
				com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceproperty = ((BeanPropertyDefinition) (beandescription)).findReferenceType();
	//   87  194:aload_2         
	//   88  195:invokevirtual   #568 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty BeanPropertyDefinition.findReferenceType()>
	//   89  198:astore          11
				if(referenceproperty == null || !referenceproperty.isBackReference())
	//*  90  200:aload           11
	//*  91  202:ifnull          213
	//*  92  205:aload           11
	//*  93  207:invokevirtual   #573 <Method boolean com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.isBackReference()>
	//*  94  210:ifne            125
					if(annotatedmember instanceof AnnotatedMethod)
	//*  95  213:aload           10
	//*  96  215:instanceof      #575 <Class AnnotatedMethod>
	//*  97  218:ifeq            245
						arraylist.add(((Object) (_constructWriter(serializerprovider, ((BeanPropertyDefinition) (beandescription)), propertybuilder, flag1, ((AnnotatedMember) ((AnnotatedMethod)annotatedmember))))));
	//   98  221:aload           7
	//   99  223:aload_0         
	//  100  224:aload_1         
	//  101  225:aload_2         
	//  102  226:aload           8
	//  103  228:iload           5
	//  104  230:aload           10
	//  105  232:checkcast       #575 <Class AnnotatedMethod>
	//  106  235:invokevirtual   #577 <Method BeanPropertyWriter _constructWriter(SerializerProvider, BeanPropertyDefinition, PropertyBuilder, boolean, AnnotatedMember)>
	//  107  238:invokevirtual   #579 <Method boolean ArrayList.add(Object)>
	//  108  241:pop             
					else
	//* 109  242:goto            125
						arraylist.add(((Object) (_constructWriter(serializerprovider, ((BeanPropertyDefinition) (beandescription)), propertybuilder, flag1, ((AnnotatedMember) ((AnnotatedField)annotatedmember))))));
	//  110  245:aload           7
	//  111  247:aload_0         
	//  112  248:aload_1         
	//  113  249:aload_2         
	//  114  250:aload           8
	//  115  252:iload           5
	//  116  254:aload           10
	//  117  256:checkcast       #581 <Class AnnotatedField>
	//  118  259:invokevirtual   #577 <Method BeanPropertyWriter _constructWriter(SerializerProvider, BeanPropertyDefinition, PropertyBuilder, boolean, AnnotatedMember)>
	//  119  262:invokevirtual   #579 <Method boolean ArrayList.add(Object)>
	//  120  265:pop             
			}
			break MISSING_BLOCK_LABEL_125;
	//  121  266:goto            125
		}
		continue; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L3
_L3:
	}

	public JsonSerializer findBeanSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException
	{
		if(!isPotentialBeanType(javatype.getRawClass()) && !javatype.isEnumType())
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #96  <Method Class JavaType.getRawClass()>
	//*   3    5:invokevirtual   #585 <Method boolean isPotentialBeanType(Class)>
	//*   4    8:ifne            20
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #588 <Method boolean JavaType.isEnumType()>
	//*   7   15:ifne            20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		else
			return constructBeanSerializer(serializerprovider, beandescription);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #590 <Method JsonSerializer constructBeanSerializer(SerializerProvider, BeanDescription)>
	//   14   26:areturn         
	}

	public TypeSerializer findPropertyContentTypeSerializer(JavaType javatype, SerializationConfig serializationconfig, AnnotatedMember annotatedmember)
		throws JsonMappingException
	{
		JavaType javatype1 = javatype.getContentType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #301 <Method JavaType JavaType.getContentType()>
	//    2    4:astore          4
		javatype = ((JavaType) (serializationconfig.getAnnotationIntrospector().findPropertyContentTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedmember, javatype)));
	//    3    6:aload_2         
	//    4    7:invokevirtual   #481 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload_1         
	//    8   13:invokevirtual   #595 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, AnnotatedMember, JavaType)>
	//    9   16:astore_1        
		if(javatype == null)
	//*  10   17:aload_1         
	//*  11   18:ifnonnull       29
			return createTypeSerializer(serializationconfig, javatype1);
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:aload           4
	//   15   25:invokevirtual   #305 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   16   28:areturn         
		else
			return ((TypeResolverBuilder) (javatype)).buildTypeSerializer(serializationconfig, javatype1, serializationconfig.getSubtypeResolver().collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedmember, javatype1));
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:aload           4
	//   20   33:aload_2         
	//   21   34:invokevirtual   #599 <Method SubtypeResolver SerializationConfig.getSubtypeResolver()>
	//   22   37:aload_2         
	//   23   38:aload_3         
	//   24   39:aload           4
	//   25   41:invokevirtual   #605 <Method java.util.Collection SubtypeResolver.collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig, AnnotatedMember, JavaType)>
	//   26   44:invokeinterface #611 <Method TypeSerializer TypeResolverBuilder.buildTypeSerializer(SerializationConfig, JavaType, java.util.Collection)>
	//   27   49:areturn         
	}

	public TypeSerializer findPropertyTypeSerializer(JavaType javatype, SerializationConfig serializationconfig, AnnotatedMember annotatedmember)
		throws JsonMappingException
	{
		TypeResolverBuilder typeresolverbuilder = serializationconfig.getAnnotationIntrospector().findPropertyTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedmember, javatype);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #481 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #614 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, AnnotatedMember, JavaType)>
	//    6   10:astore          4
		if(typeresolverbuilder == null)
	//*   7   12:aload           4
	//*   8   14:ifnonnull       24
			return createTypeSerializer(serializationconfig, javatype);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #305 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   13   23:areturn         
		else
			return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, serializationconfig.getSubtypeResolver().collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedmember, javatype));
	//   14   24:aload           4
	//   15   26:aload_2         
	//   16   27:aload_1         
	//   17   28:aload_2         
	//   18   29:invokevirtual   #599 <Method SubtypeResolver SerializationConfig.getSubtypeResolver()>
	//   19   32:aload_2         
	//   20   33:aload_3         
	//   21   34:aload_1         
	//   22   35:invokevirtual   #605 <Method java.util.Collection SubtypeResolver.collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig, AnnotatedMember, JavaType)>
	//   23   38:invokeinterface #611 <Method TypeSerializer TypeResolverBuilder.buildTypeSerializer(SerializationConfig, JavaType, java.util.Collection)>
	//   24   43:areturn         
	}

	public JsonSerializer findReferenceSerializer(SerializerProvider serializerprovider, ReferenceType referencetype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		JavaType javatype = referencetype.getContentType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #615 <Method JavaType ReferenceType.getContentType()>
	//    2    4:astore          7
		Object obj = ((Object) ((TypeSerializer)javatype.getTypeHandler()));
	//    3    6:aload           7
	//    4    8:invokevirtual   #618 <Method Object JavaType.getTypeHandler()>
	//    5   11:checkcast       #620 <Class TypeSerializer>
	//    6   14:astore          5
		SerializationConfig serializationconfig = serializerprovider.getConfig();
	//    7   16:aload_1         
	//    8   17:invokevirtual   #112 <Method SerializationConfig SerializerProvider.getConfig()>
	//    9   20:astore          6
		serializerprovider = ((SerializerProvider) (obj));
	//   10   22:aload           5
	//   11   24:astore_1        
		if(obj == null)
	//*  12   25:aload           5
	//*  13   27:ifnonnull       39
			serializerprovider = ((SerializerProvider) (createTypeSerializer(serializationconfig, javatype)));
	//   14   30:aload_0         
	//   15   31:aload           6
	//   16   33:aload           7
	//   17   35:invokevirtual   #305 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   18   38:astore_1        
		obj = ((Object) ((JsonSerializer)javatype.getValueHandler()));
	//   19   39:aload           7
	//   20   41:invokevirtual   #623 <Method Object JavaType.getValueHandler()>
	//   21   44:checkcast       #625 <Class JsonSerializer>
	//   22   47:astore          5
		for(Iterator iterator = customSerializers().iterator(); iterator.hasNext();)
	//*  23   49:aload_0         
	//*  24   50:invokevirtual   #209 <Method Iterable customSerializers()>
	//*  25   53:invokeinterface #191 <Method Iterator Iterable.iterator()>
	//*  26   58:astore          7
	//*  27   60:aload           7
	//*  28   62:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//*  29   67:ifeq            102
		{
			JsonSerializer jsonserializer = ((Serializers)iterator.next()).findReferenceSerializer(serializationconfig, referencetype, beandescription, ((TypeSerializer) (serializerprovider)), ((JsonSerializer) (obj)));
	//   30   70:aload           7
	//   31   72:invokeinterface #200 <Method Object Iterator.next()>
	//   32   77:checkcast       #211 <Class Serializers>
	//   33   80:aload           6
	//   34   82:aload_2         
	//   35   83:aload_3         
	//   36   84:aload_1         
	//   37   85:aload           5
	//   38   87:invokeinterface #628 <Method JsonSerializer Serializers.findReferenceSerializer(SerializationConfig, ReferenceType, BeanDescription, TypeSerializer, JsonSerializer)>
	//   39   92:astore          8
			if(jsonserializer != null)
	//*  40   94:aload           8
	//*  41   96:ifnull          60
				return jsonserializer;
	//   42   99:aload           8
	//   43  101:areturn         
		}

		if(referencetype.isTypeOrSubTypeOf(java/util/concurrent/atomic/AtomicReference))
	//*  44  102:aload_2         
	//*  45  103:ldc2            #630 <Class AtomicReference>
	//*  46  106:invokevirtual   #633 <Method boolean ReferenceType.isTypeOrSubTypeOf(Class)>
	//*  47  109:ifeq            126
			return ((JsonSerializer) (new AtomicReferenceSerializer(referencetype, flag, ((TypeSerializer) (serializerprovider)), ((JsonSerializer) (obj)))));
	//   48  112:new             #635 <Class AtomicReferenceSerializer>
	//   49  115:dup             
	//   50  116:aload_2         
	//   51  117:iload           4
	//   52  119:aload_1         
	//   53  120:aload           5
	//   54  122:invokespecial   #638 <Method void AtomicReferenceSerializer(ReferenceType, boolean, TypeSerializer, JsonSerializer)>
	//   55  125:areturn         
		else
			return null;
	//   56  126:aconst_null     
	//   57  127:areturn         
	}

	protected boolean isPotentialBeanType(Class class1)
	{
		return ClassUtil.canBeABeanType(class1) == null && !ClassUtil.isProxyType(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #643 <Method String ClassUtil.canBeABeanType(Class)>
	//    2    4:ifnonnull       16
	//    3    7:aload_1         
	//    4    8:invokestatic    #646 <Method boolean ClassUtil.isProxyType(Class)>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected void processViews(SerializationConfig serializationconfig, BeanSerializerBuilder beanserializerbuilder)
	{
		List list = beanserializerbuilder.getProperties();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #650 <Method List BeanSerializerBuilder.getProperties()>
	//    2    4:astore          8
		boolean flag = serializationconfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
	//    3    6:aload_1         
	//    4    7:getstatic       #653 <Field MapperFeature MapperFeature.DEFAULT_VIEW_INCLUSION>
	//    5   10:invokevirtual   #295 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//    6   13:istore          7
		int l = list.size();
	//    7   15:aload           8
	//    8   17:invokeinterface #390 <Method int List.size()>
	//    9   22:istore          6
		int j = 0;
	//   10   24:iconst_0        
	//   11   25:istore          4
		serializationconfig = ((SerializationConfig) (new BeanPropertyWriter[l]));
	//   12   27:iload           6
	//   13   29:anewarray       BeanPropertyWriter[]
	//   14   32:astore_1        
		int i = 0;
	//   15   33:iconst_0        
	//   16   34:istore_3        
		while(i < l) 
	//*  17   35:iload_3         
	//*  18   36:iload           6
	//*  19   38:icmpge          115
		{
			BeanPropertyWriter beanpropertywriter = (BeanPropertyWriter)list.get(i);
	//   20   41:aload           8
	//   21   43:iload_3         
	//   22   44:invokeinterface #418 <Method Object List.get(int)>
	//   23   49:checkcast       #420 <Class BeanPropertyWriter>
	//   24   52:astore          9
			Class aclass[] = beanpropertywriter.getViews();
	//   25   54:aload           9
	//   26   56:invokevirtual   #657 <Method Class[] BeanPropertyWriter.getViews()>
	//   27   59:astore          10
			int k;
			if(aclass == null)
	//*  28   61:aload           10
	//*  29   63:ifnonnull       95
			{
				k = j;
	//   30   66:iload           4
	//   31   68:istore          5
				if(flag)
	//*  32   70:iload           7
	//*  33   72:ifeq            84
				{
					serializationconfig[i] = ((/*<invalid signature>*/java.lang.Object) (beanpropertywriter));
	//   34   75:aload_1         
	//   35   76:iload_3         
	//   36   77:aload           9
	//   37   79:aastore         
					k = j;
	//   38   80:iload           4
	//   39   82:istore          5
				}
			} else
	//*  40   84:iload_3         
	//*  41   85:iconst_1        
	//*  42   86:iadd            
	//*  43   87:istore_3        
	//*  44   88:iload           5
	//*  45   90:istore          4
	//*  46   92:goto            35
			{
				k = j + 1;
	//   47   95:iload           4
	//   48   97:iconst_1        
	//   49   98:iadd            
	//   50   99:istore          5
				serializationconfig[i] = ((/*<invalid signature>*/java.lang.Object) (constructFilteredBeanWriter(beanpropertywriter, aclass)));
	//   51  101:aload_1         
	//   52  102:iload_3         
	//   53  103:aload_0         
	//   54  104:aload           9
	//   55  106:aload           10
	//   56  108:invokevirtual   #659 <Method BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter, Class[])>
	//   57  111:aastore         
			}
			i++;
			j = k;
		}
	//*  58  112:goto            84
		if(flag && j == 0)
	//*  59  115:iload           7
	//*  60  117:ifeq            126
	//*  61  120:iload           4
	//*  62  122:ifne            126
		{
			return;
	//   63  125:return          
		} else
		{
			beanserializerbuilder.setFilteredProperties(((BeanPropertyWriter []) (serializationconfig)));
	//   64  126:aload_2         
	//   65  127:aload_1         
	//   66  128:invokevirtual   #663 <Method void BeanSerializerBuilder.setFilteredProperties(BeanPropertyWriter[])>
			return;
	//   67  131:return          
		}
	}

	protected void removeIgnorableTypes(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
	{
		AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #481 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    2    4:astore          4
		HashMap hashmap = new HashMap();
	//    3    6:new             #665 <Class HashMap>
	//    4    9:dup             
	//    5   10:invokespecial   #666 <Method void HashMap()>
	//    6   13:astore          5
		Iterator iterator = list.iterator();
	//    7   15:aload_3         
	//    8   16:invokeinterface #524 <Method Iterator List.iterator()>
	//    9   21:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   23:aload           6
	//   11   25:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            135
			beandescription = ((BeanDescription) (((BeanPropertyDefinition)iterator.next()).getAccessor()));
	//   13   33:aload           6
	//   14   35:invokeinterface #200 <Method Object Iterator.next()>
	//   15   40:checkcast       #28  <Class BeanPropertyDefinition>
	//   16   43:invokevirtual   #557 <Method AnnotatedMember BeanPropertyDefinition.getAccessor()>
	//   17   46:astore_2        
			if(beandescription == null)
	//*  18   47:aload_2         
	//*  19   48:ifnonnull       61
			{
				iterator.remove();
	//   20   51:aload           6
	//   21   53:invokeinterface #531 <Method void Iterator.remove()>
			} else
	//*  22   58:goto            23
			{
				Class class1 = ((AnnotatedMember) (beandescription)).getRawType();
	//   23   61:aload_2         
	//   24   62:invokevirtual   #669 <Method Class AnnotatedMember.getRawType()>
	//   25   65:astore          7
				list = ((List) ((Boolean)hashmap.get(((Object) (class1)))));
	//   26   67:aload           5
	//   27   69:aload           7
	//   28   71:invokevirtual   #672 <Method Object HashMap.get(Object)>
	//   29   74:checkcast       #674 <Class Boolean>
	//   30   77:astore_3        
				beandescription = ((BeanDescription) (list));
	//   31   78:aload_3         
	//   32   79:astore_2        
				if(list == null)
	//*  33   80:aload_3         
	//*  34   81:ifnonnull       118
				{
					list = ((List) (annotationintrospector.isIgnorableType(serializationconfig.introspectClassAnnotations(class1).getClassInfo())));
	//   35   84:aload           4
	//   36   86:aload_1         
	//   37   87:aload           7
	//   38   89:invokevirtual   #678 <Method BeanDescription SerializationConfig.introspectClassAnnotations(Class)>
	//   39   92:invokevirtual   #247 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   40   95:invokevirtual   #682 <Method Boolean AnnotationIntrospector.isIgnorableType(com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   41   98:astore_3        
					beandescription = ((BeanDescription) (list));
	//   42   99:aload_3         
	//   43  100:astore_2        
					if(list == null)
	//*  44  101:aload_3         
	//*  45  102:ifnonnull       109
						beandescription = ((BeanDescription) (Boolean.FALSE));
	//   46  105:getstatic       #686 <Field Boolean Boolean.FALSE>
	//   47  108:astore_2        
					hashmap.put(((Object) (class1)), ((Object) (beandescription)));
	//   48  109:aload           5
	//   49  111:aload           7
	//   50  113:aload_2         
	//   51  114:invokevirtual   #690 <Method Object HashMap.put(Object, Object)>
	//   52  117:pop             
				}
				if(((Boolean) (beandescription)).booleanValue())
	//*  53  118:aload_2         
	//*  54  119:invokevirtual   #693 <Method boolean Boolean.booleanValue()>
	//*  55  122:ifeq            23
					iterator.remove();
	//   56  125:aload           6
	//   57  127:invokeinterface #531 <Method void Iterator.remove()>
			}
		} while(true);
	//   58  132:goto            23
	//   59  135:return          
	}

	protected List removeOverlappingTypeIds(SerializerProvider serializerprovider, BeanDescription beandescription, BeanSerializerBuilder beanserializerbuilder, List list)
	{
		int i;
		int j;
		i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		j = list.size();
	//    2    3:aload           4
	//    3    5:invokeinterface #390 <Method int List.size()>
	//    4   10:istore          6
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_119;
	//    5   12:iload           5
	//    6   14:iload           6
	//    7   16:icmpge          119
		serializerprovider = ((SerializerProvider) ((BeanPropertyWriter)list.get(i)));
	//    8   19:aload           4
	//    9   21:iload           5
	//   10   23:invokeinterface #418 <Method Object List.get(int)>
	//   11   28:checkcast       #420 <Class BeanPropertyWriter>
	//   12   31:astore_1        
		beandescription = ((BeanDescription) (((BeanPropertyWriter) (serializerprovider)).getTypeSerializer()));
	//   13   32:aload_1         
	//   14   33:invokevirtual   #698 <Method TypeSerializer BeanPropertyWriter.getTypeSerializer()>
	//   15   36:astore_2        
		if(beandescription != null && ((TypeSerializer) (beandescription)).getTypeInclusion() == com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY)
			break; /* Loop/switch isn't completed */
	//   16   37:aload_2         
	//   17   38:ifnull          51
	//   18   41:aload_2         
	//   19   42:invokevirtual   #702 <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As TypeSerializer.getTypeInclusion()>
	//   20   45:getstatic       #708 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
	//   21   48:if_acmpeq       60
_L4:
		i++;
	//   22   51:iload           5
	//   23   53:iconst_1        
	//   24   54:iadd            
	//   25   55:istore          5
		if(true) goto _L2; else goto _L1
	//   26   57:goto            12
_L1:
		beandescription = ((BeanDescription) (PropertyName.construct(((TypeSerializer) (beandescription)).getPropertyName())));
	//   27   60:aload_2         
	//   28   61:invokevirtual   #710 <Method String TypeSerializer.getPropertyName()>
	//   29   64:invokestatic    #322 <Method PropertyName PropertyName.construct(String)>
	//   30   67:astore_2        
		beanserializerbuilder = ((BeanSerializerBuilder) (list.iterator()));
	//   31   68:aload           4
	//   32   70:invokeinterface #524 <Method Iterator List.iterator()>
	//   33   75:astore_3        
_L6:
		if(!((Iterator) (beanserializerbuilder)).hasNext()) goto _L4; else goto _L3
	//   34   76:aload_3         
	//   35   77:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//   36   82:ifeq            51
_L3:
		BeanPropertyWriter beanpropertywriter = (BeanPropertyWriter)((Iterator) (beanserializerbuilder)).next();
	//   37   85:aload_3         
	//   38   86:invokeinterface #200 <Method Object Iterator.next()>
	//   39   91:checkcast       #420 <Class BeanPropertyWriter>
	//   40   94:astore          7
		if(beanpropertywriter == serializerprovider || !beanpropertywriter.wouldConflictWithName(((PropertyName) (beandescription)))) goto _L6; else goto _L5
	//   41   96:aload           7
	//   42   98:aload_1         
	//   43   99:if_acmpeq       76
	//   44  102:aload           7
	//   45  104:aload_2         
	//   46  105:invokevirtual   #714 <Method boolean BeanPropertyWriter.wouldConflictWithName(PropertyName)>
	//   47  108:ifeq            76
_L5:
		((BeanPropertyWriter) (serializerprovider)).assignTypeSerializer(((TypeSerializer) (null)));
	//   48  111:aload_1         
	//   49  112:aconst_null     
	//   50  113:invokevirtual   #718 <Method void BeanPropertyWriter.assignTypeSerializer(TypeSerializer)>
		  goto _L4
	//*  51  116:goto            51
		return list;
	//   52  119:aload           4
	//   53  121:areturn         
	}

	protected void removeSetterlessGetters(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
	{
		serializationconfig = ((SerializationConfig) (list.iterator()));
	//    0    0:aload_3         
	//    1    1:invokeinterface #524 <Method Iterator List.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (serializationconfig)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #196 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            49
			beandescription = ((BeanDescription) ((BeanPropertyDefinition)((Iterator) (serializationconfig)).next()));
	//    6   16:aload_1         
	//    7   17:invokeinterface #200 <Method Object Iterator.next()>
	//    8   22:checkcast       #28  <Class BeanPropertyDefinition>
	//    9   25:astore_2        
			if(!((BeanPropertyDefinition) (beandescription)).couldDeserialize() && !((BeanPropertyDefinition) (beandescription)).isExplicitlyIncluded())
	//*  10   26:aload_2         
	//*  11   27:invokevirtual   #722 <Method boolean BeanPropertyDefinition.couldDeserialize()>
	//*  12   30:ifne            7
	//*  13   33:aload_2         
	//*  14   34:invokevirtual   #725 <Method boolean BeanPropertyDefinition.isExplicitlyIncluded()>
	//*  15   37:ifne            7
				((Iterator) (serializationconfig)).remove();
	//   16   40:aload_1         
	//   17   41:invokeinterface #531 <Method void Iterator.remove()>
		} while(true);
	//   18   46:goto            7
	//   19   49:return          
	}

	public SerializerFactory withConfig(SerializerFactoryConfig serializerfactoryconfig)
	{
		if(_factoryConfig == serializerfactoryconfig)
	//*   0    0:aload_0         
	//*   1    1:getfield        #176 <Field SerializerFactoryConfig _factoryConfig>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((SerializerFactory) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		if(((Object)this).getClass() != com/fasterxml/jackson/databind/ser/BeanSerializerFactory)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #730 <Method Class Object.getClass()>
	//*   8   14:ldc1            #2   <Class BeanSerializerFactory>
	//*   9   16:if_acmpeq       65
			throw new IllegalStateException((new StringBuilder()).append("Subtype of BeanSerializerFactory (").append(((Object)this).getClass().getName()).append(") has not properly overridden method 'withAdditionalSerializers': can not instantiate subtype with ").append("additional serializer definitions").toString());
	//   10   19:new             #732 <Class IllegalStateException>
	//   11   22:dup             
	//   12   23:new             #394 <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #395 <Method void StringBuilder()>
	//   15   30:ldc2            #734 <String "Subtype of BeanSerializerFactory (">
	//   16   33:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   17   36:aload_0         
	//   18   37:invokevirtual   #730 <Method Class Object.getClass()>
	//   19   40:invokevirtual   #404 <Method String Class.getName()>
	//   20   43:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   21   46:ldc2            #736 <String ") has not properly overridden method 'withAdditionalSerializers': can not instantiate subtype with ">
	//   22   49:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:ldc2            #738 <String "additional serializer definitions">
	//   24   55:invokevirtual   #401 <Method StringBuilder StringBuilder.append(String)>
	//   25   58:invokevirtual   #411 <Method String StringBuilder.toString()>
	//   26   61:invokespecial   #739 <Method void IllegalStateException(String)>
	//   27   64:athrow          
		else
			return ((SerializerFactory) (new BeanSerializerFactory(serializerfactoryconfig)));
	//   28   65:new             #2   <Class BeanSerializerFactory>
	//   29   68:dup             
	//   30   69:aload_1         
	//   31   70:invokespecial   #18  <Method void BeanSerializerFactory(SerializerFactoryConfig)>
	//   32   73:areturn         
	}

	public static final BeanSerializerFactory instance = new BeanSerializerFactory(((SerializerFactoryConfig) (null)));
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class BeanSerializerFactory>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #18  <Method void BeanSerializerFactory(SerializerFactoryConfig)>
	//    4    8:putstatic       #20  <Field BeanSerializerFactory instance>
	//*   5   11:return          
	}
}
