// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.*;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BasicSerializerFactory, ResolvableSerializer, PropertyBuilder, Serializers, 
//			BeanSerializerModifier, BeanSerializerBuilder, AnyGetterWriter, BeanPropertyWriter, 
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
		JavaType javatype = annotatedmember.getType();
	//    3    6:aload           5
	//    4    8:invokevirtual   #38  <Method JavaType AnnotatedMember.getType()>
	//    5   11:astore          7
		obj = ((Object) (new com.fasterxml.jackson.databind.BeanProperty.Std(((PropertyName) (obj)), javatype, beanpropertydefinition.getWrapperName(), annotatedmember, beanpropertydefinition.getMetadata())));
	//    6   13:new             #40  <Class com.fasterxml.jackson.databind.BeanProperty$Std>
	//    7   16:dup             
	//    8   17:aload           6
	//    9   19:aload           7
	//   10   21:aload_2         
	//   11   22:invokevirtual   #43  <Method PropertyName BeanPropertyDefinition.getWrapperName()>
	//   12   25:aload           5
	//   13   27:aload_2         
	//   14   28:invokevirtual   #47  <Method PropertyMetadata BeanPropertyDefinition.getMetadata()>
	//   15   31:invokespecial   #50  <Method void com.fasterxml.jackson.databind.BeanProperty$Std(PropertyName, JavaType, PropertyName, AnnotatedMember, PropertyMetadata)>
	//   16   34:astore          6
		JsonSerializer jsonserializer = findSerializerFromAnnotation(serializerprovider, ((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedmember)));
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:aload           5
	//   20   40:invokevirtual   #54  <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)>
	//   21   43:astore          8
		if(jsonserializer instanceof ResolvableSerializer)
	//*  22   45:aload           8
	//*  23   47:instanceof      #56  <Class ResolvableSerializer>
	//*  24   50:ifeq            64
			((ResolvableSerializer)jsonserializer).resolve(serializerprovider);
	//   25   53:aload           8
	//   26   55:checkcast       #56  <Class ResolvableSerializer>
	//   27   58:aload_1         
	//   28   59:invokeinterface #60  <Method void ResolvableSerializer.resolve(SerializerProvider)>
		jsonserializer = serializerprovider.handlePrimaryContextualization(jsonserializer, ((com.fasterxml.jackson.databind.BeanProperty) (obj)));
	//   29   64:aload_1         
	//   30   65:aload           8
	//   31   67:aload           6
	//   32   69:invokevirtual   #66  <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, com.fasterxml.jackson.databind.BeanProperty)>
	//   33   72:astore          8
		if(!javatype.isContainerType() && !javatype.isReferenceType())
	//*  34   74:aload           7
	//*  35   76:invokevirtual   #72  <Method boolean JavaType.isContainerType()>
	//*  36   79:ifne            99
	//*  37   82:aload           7
	//*  38   84:invokevirtual   #75  <Method boolean JavaType.isReferenceType()>
	//*  39   87:ifeq            93
	//*  40   90:goto            99
			obj = null;
	//   41   93:aconst_null     
	//   42   94:astore          6
		else
	//*  43   96:goto            113
			obj = ((Object) (findPropertyContentTypeSerializer(javatype, serializerprovider.getConfig(), annotatedmember)));
	//   44   99:aload_0         
	//   45  100:aload           7
	//   46  102:aload_1         
	//   47  103:invokevirtual   #79  <Method SerializationConfig SerializerProvider.getConfig()>
	//   48  106:aload           5
	//   49  108:invokevirtual   #83  <Method TypeSerializer findPropertyContentTypeSerializer(JavaType, SerializationConfig, AnnotatedMember)>
	//   50  111:astore          6
		return propertybuilder.buildWriter(serializerprovider, beanpropertydefinition, javatype, jsonserializer, findPropertyTypeSerializer(javatype, serializerprovider.getConfig(), annotatedmember), ((TypeSerializer) (obj)), annotatedmember, flag);
	//   51  113:aload_3         
	//   52  114:aload_1         
	//   53  115:aload_2         
	//   54  116:aload           7
	//   55  118:aload           8
	//   56  120:aload_0         
	//   57  121:aload           7
	//   58  123:aload_1         
	//   59  124:invokevirtual   #79  <Method SerializationConfig SerializerProvider.getConfig()>
	//   60  127:aload           5
	//   61  129:invokevirtual   #86  <Method TypeSerializer findPropertyTypeSerializer(JavaType, SerializationConfig, AnnotatedMember)>
	//   62  132:aload           6
	//   63  134:aload           5
	//   64  136:iload           4
	//   65  138:invokevirtual   #92  <Method BeanPropertyWriter PropertyBuilder.buildWriter(SerializerProvider, BeanPropertyDefinition, JavaType, JsonSerializer, TypeSerializer, TypeSerializer, AnnotatedMember, boolean)>
	//   66  141:areturn         
	}

	protected JsonSerializer _createSerializer2(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
		throws JsonMappingException
	{
		boolean flag1;
		JsonSerializer jsonserializer1;
		SerializationConfig serializationconfig;
label0:
		{
			JsonSerializer jsonserializer;
label1:
			{
				serializationconfig = serializerprovider.getConfig();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #79  <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore          8
				flag1 = javatype.isContainerType();
	//    3    6:aload_2         
	//    4    7:invokevirtual   #72  <Method boolean JavaType.isContainerType()>
	//    5   10:istore          5
				jsonserializer = null;
	//    6   12:aconst_null     
	//    7   13:astore          6
				if(flag1)
	//*   8   15:iload           5
	//*   9   17:ifeq            62
				{
					flag1 = flag;
	//   10   20:iload           4
	//   11   22:istore          5
					if(!flag)
	//*  12   24:iload           4
	//*  13   26:ifne            39
						flag1 = usesStaticTyping(serializationconfig, beandescription, ((TypeSerializer) (null)));
	//   14   29:aload_0         
	//   15   30:aload           8
	//   16   32:aload_3         
	//   17   33:aconst_null     
	//   18   34:invokevirtual   #99  <Method boolean usesStaticTyping(SerializationConfig, BeanDescription, TypeSerializer)>
	//   19   37:istore          5
					jsonserializer = buildContainerSerializer(serializerprovider, javatype, beandescription, flag1);
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:aload_3         
	//   24   43:iload           5
	//   25   45:invokevirtual   #102 <Method JsonSerializer buildContainerSerializer(SerializerProvider, JavaType, BeanDescription, boolean)>
	//   26   48:astore          6
					jsonserializer1 = jsonserializer;
	//   27   50:aload           6
	//   28   52:astore          7
					if(jsonserializer != null)
	//*  29   54:aload           6
	//*  30   56:ifnull          170
						return jsonserializer;
	//   31   59:aload           6
	//   32   61:areturn         
					break label0;
				}
				if(javatype.isReferenceType())
	//*  33   62:aload_2         
	//*  34   63:invokevirtual   #75  <Method boolean JavaType.isReferenceType()>
	//*  35   66:ifeq            86
				{
					jsonserializer = findReferenceSerializer(serializerprovider, (ReferenceType)javatype, beandescription, flag);
	//   36   69:aload_0         
	//   37   70:aload_1         
	//   38   71:aload_2         
	//   39   72:checkcast       #104 <Class ReferenceType>
	//   40   75:aload_3         
	//   41   76:iload           4
	//   42   78:invokevirtual   #108 <Method JsonSerializer findReferenceSerializer(SerializerProvider, ReferenceType, BeanDescription, boolean)>
	//   43   81:astore          6
					break label1;
	//   44   83:goto            144
				}
				Iterator iterator = customSerializers().iterator();
	//   45   86:aload_0         
	//   46   87:invokevirtual   #112 <Method Iterable customSerializers()>
	//   47   90:invokeinterface #118 <Method Iterator Iterable.iterator()>
	//   48   95:astore          9
				do
				{
					if(!iterator.hasNext())
						break label1;
	//   49   97:aload           9
	//   50   99:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//   51  104:ifeq            144
					jsonserializer1 = ((Serializers)iterator.next()).findSerializer(serializationconfig, javatype, beandescription);
	//   52  107:aload           9
	//   53  109:invokeinterface #127 <Method Object Iterator.next()>
	//   54  114:checkcast       #129 <Class Serializers>
	//   55  117:aload           8
	//   56  119:aload_2         
	//   57  120:aload_3         
	//   58  121:invokeinterface #133 <Method JsonSerializer Serializers.findSerializer(SerializationConfig, JavaType, BeanDescription)>
	//   59  126:astore          7
					jsonserializer = jsonserializer1;
	//   60  128:aload           7
	//   61  130:astore          6
				} while(jsonserializer1 == null);
	//   62  132:aload           7
	//   63  134:ifnull          97
				jsonserializer = jsonserializer1;
	//   64  137:aload           7
	//   65  139:astore          6
			}
	//*  66  141:goto            144
			jsonserializer1 = jsonserializer;
	//   67  144:aload           6
	//   68  146:astore          7
			flag1 = flag;
	//   69  148:iload           4
	//   70  150:istore          5
			if(jsonserializer == null)
	//*  71  152:aload           6
	//*  72  154:ifnonnull       170
			{
				jsonserializer1 = findSerializerByAnnotations(serializerprovider, javatype, beandescription);
	//   73  157:aload_0         
	//   74  158:aload_1         
	//   75  159:aload_2         
	//   76  160:aload_3         
	//   77  161:invokevirtual   #137 <Method JsonSerializer findSerializerByAnnotations(SerializerProvider, JavaType, BeanDescription)>
	//   78  164:astore          7
				flag1 = flag;
	//   79  166:iload           4
	//   80  168:istore          5
			}
		}
		Object obj = ((Object) (jsonserializer1));
	//   81  170:aload           7
	//   82  172:astore          6
		if(jsonserializer1 == null)
	//*  83  174:aload           7
	//*  84  176:ifnonnull       266
		{
			JsonSerializer jsonserializer2 = findSerializerByLookup(javatype, serializationconfig, beandescription, flag1);
	//   85  179:aload_0         
	//   86  180:aload_2         
	//   87  181:aload           8
	//   88  183:aload_3         
	//   89  184:iload           5
	//   90  186:invokevirtual   #141 <Method JsonSerializer findSerializerByLookup(JavaType, SerializationConfig, BeanDescription, boolean)>
	//   91  189:astore          7
			obj = ((Object) (jsonserializer2));
	//   92  191:aload           7
	//   93  193:astore          6
			if(jsonserializer2 == null)
	//*  94  195:aload           7
	//*  95  197:ifnonnull       266
			{
				JsonSerializer jsonserializer3 = findSerializerByPrimaryType(serializerprovider, javatype, beandescription, flag1);
	//   96  200:aload_0         
	//   97  201:aload_1         
	//   98  202:aload_2         
	//   99  203:aload_3         
	//  100  204:iload           5
	//  101  206:invokevirtual   #144 <Method JsonSerializer findSerializerByPrimaryType(SerializerProvider, JavaType, BeanDescription, boolean)>
	//  102  209:astore          7
				obj = ((Object) (jsonserializer3));
	//  103  211:aload           7
	//  104  213:astore          6
				if(jsonserializer3 == null)
	//* 105  215:aload           7
	//* 106  217:ifnonnull       266
				{
					JsonSerializer jsonserializer4 = findBeanSerializer(serializerprovider, javatype, beandescription);
	//  107  220:aload_0         
	//  108  221:aload_1         
	//  109  222:aload_2         
	//  110  223:aload_3         
	//  111  224:invokevirtual   #147 <Method JsonSerializer findBeanSerializer(SerializerProvider, JavaType, BeanDescription)>
	//  112  227:astore          7
					obj = ((Object) (jsonserializer4));
	//  113  229:aload           7
	//  114  231:astore          6
					if(jsonserializer4 == null)
	//* 115  233:aload           7
	//* 116  235:ifnonnull       266
					{
						javatype = ((JavaType) (findSerializerByAddonType(serializationconfig, javatype, beandescription, flag1)));
	//  117  238:aload_0         
	//  118  239:aload           8
	//  119  241:aload_2         
	//  120  242:aload_3         
	//  121  243:iload           5
	//  122  245:invokevirtual   #151 <Method JsonSerializer findSerializerByAddonType(SerializationConfig, JavaType, BeanDescription, boolean)>
	//  123  248:astore_2        
						obj = ((Object) (javatype));
	//  124  249:aload_2         
	//  125  250:astore          6
						if(javatype == null)
	//* 126  252:aload_2         
	//* 127  253:ifnonnull       266
							obj = ((Object) (serializerprovider.getUnknownTypeSerializer(beandescription.getBeanClass())));
	//  128  256:aload_1         
	//  129  257:aload_3         
	//  130  258:invokevirtual   #157 <Method Class BeanDescription.getBeanClass()>
	//  131  261:invokevirtual   #161 <Method JsonSerializer SerializerProvider.getUnknownTypeSerializer(Class)>
	//  132  264:astore          6
					}
				}
			}
		}
		serializerprovider = ((SerializerProvider) (obj));
	//  133  266:aload           6
	//  134  268:astore_1        
		if(obj != null)
	//* 135  269:aload           6
	//* 136  271:ifnull          334
		{
			serializerprovider = ((SerializerProvider) (obj));
	//  137  274:aload           6
	//  138  276:astore_1        
			if(_factoryConfig.hasSerializerModifiers())
	//* 139  277:aload_0         
	//* 140  278:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//* 141  281:invokevirtual   #170 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//* 142  284:ifeq            334
			{
				javatype = ((JavaType) (_factoryConfig.serializerModifiers().iterator()));
	//  143  287:aload_0         
	//  144  288:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//  145  291:invokevirtual   #173 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  146  294:invokeinterface #118 <Method Iterator Iterable.iterator()>
	//  147  299:astore_2        
				do
				{
					serializerprovider = ((SerializerProvider) (obj));
	//  148  300:aload           6
	//  149  302:astore_1        
					if(!((Iterator) (javatype)).hasNext())
						break;
	//  150  303:aload_2         
	//  151  304:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//  152  309:ifeq            334
					obj = ((Object) (((BeanSerializerModifier)((Iterator) (javatype)).next()).modifySerializer(serializationconfig, beandescription, ((JsonSerializer) (obj)))));
	//  153  312:aload_2         
	//  154  313:invokeinterface #127 <Method Object Iterator.next()>
	//  155  318:checkcast       #175 <Class BeanSerializerModifier>
	//  156  321:aload           8
	//  157  323:aload_3         
	//  158  324:aload           6
	//  159  326:invokevirtual   #179 <Method JsonSerializer BeanSerializerModifier.modifySerializer(SerializationConfig, BeanDescription, JsonSerializer)>
	//  160  329:astore          6
				} while(true);
	//  161  331:goto            300
			}
		}
		return ((JsonSerializer) (serializerprovider));
	//  162  334:aload_1         
	//  163  335:areturn         
	}

	protected JsonSerializer constructBeanSerializer(SerializerProvider serializerprovider, BeanDescription beandescription)
		throws JsonMappingException
	{
		Object obj2;
		Object obj3;
		if(beandescription.getBeanClass() == java/lang/Object)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #157 <Method Class BeanDescription.getBeanClass()>
	//*   2    4:ldc1            #187 <Class Object>
	//*   3    6:if_acmpne       16
			return serializerprovider.getUnknownTypeSerializer(java/lang/Object);
	//    4    9:aload_1         
	//    5   10:ldc1            #187 <Class Object>
	//    6   12:invokevirtual   #161 <Method JsonSerializer SerializerProvider.getUnknownTypeSerializer(Class)>
	//    7   15:areturn         
		SerializationConfig serializationconfig = serializerprovider.getConfig();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #79  <Method SerializationConfig SerializerProvider.getConfig()>
	//   10   20:astore          8
		BeanSerializerBuilder beanserializerbuilder1 = constructBeanSerializerBuilder(beandescription);
	//   11   22:aload_0         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #191 <Method BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription)>
	//   14   27:astore          5
		beanserializerbuilder1.setConfig(serializationconfig);
	//   15   29:aload           5
	//   16   31:aload           8
	//   17   33:invokevirtual   #197 <Method void BeanSerializerBuilder.setConfig(SerializationConfig)>
		Object obj = ((Object) (findBeanProperties(serializerprovider, beandescription, beanserializerbuilder1)));
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:aload           5
	//   22   41:invokevirtual   #201 <Method List findBeanProperties(SerializerProvider, BeanDescription, BeanSerializerBuilder)>
	//   23   44:astore          4
		if(obj == null)
	//*  24   46:aload           4
	//*  25   48:ifnonnull       63
			obj = ((Object) (new ArrayList()));
	//   26   51:new             #203 <Class ArrayList>
	//   27   54:dup             
	//   28   55:invokespecial   #205 <Method void ArrayList()>
	//   29   58:astore          4
		else
	//*  30   60:goto            75
			obj = ((Object) (removeOverlappingTypeIds(serializerprovider, beandescription, beanserializerbuilder1, ((List) (obj)))));
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:aload_2         
	//   34   66:aload           5
	//   35   68:aload           4
	//   36   70:invokevirtual   #209 <Method List removeOverlappingTypeIds(SerializerProvider, BeanDescription, BeanSerializerBuilder, List)>
	//   37   73:astore          4
		serializerprovider.getAnnotationIntrospector().findAndAddVirtualProperties(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), beandescription.getClassInfo(), ((List) (obj)));
	//   38   75:aload_1         
	//   39   76:invokevirtual   #213 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//   40   79:aload           8
	//   41   81:aload_2         
	//   42   82:invokevirtual   #217 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   43   85:aload           4
	//   44   87:invokevirtual   #223 <Method void AnnotationIntrospector.findAndAddVirtualProperties(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, List)>
		obj2 = obj;
	//   45   90:aload           4
	//   46   92:astore          6
		if(_factoryConfig.hasSerializerModifiers())
	//*  47   94:aload_0         
	//*  48   95:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//*  49   98:invokevirtual   #170 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  50  101:ifeq            155
		{
			Iterator iterator = _factoryConfig.serializerModifiers().iterator();
	//   51  104:aload_0         
	//   52  105:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//   53  108:invokevirtual   #173 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//   54  111:invokeinterface #118 <Method Iterator Iterable.iterator()>
	//   55  116:astore          7
			do
			{
				obj2 = obj;
	//   56  118:aload           4
	//   57  120:astore          6
				if(!iterator.hasNext())
					break;
	//   58  122:aload           7
	//   59  124:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//   60  129:ifeq            155
				obj = ((Object) (((BeanSerializerModifier)iterator.next()).changeProperties(serializationconfig, beandescription, ((List) (obj)))));
	//   61  132:aload           7
	//   62  134:invokeinterface #127 <Method Object Iterator.next()>
	//   63  139:checkcast       #175 <Class BeanSerializerModifier>
	//   64  142:aload           8
	//   65  144:aload_2         
	//   66  145:aload           4
	//   67  147:invokevirtual   #227 <Method List BeanSerializerModifier.changeProperties(SerializationConfig, BeanDescription, List)>
	//   68  150:astore          4
			} while(true);
	//   69  152:goto            118
		}
		obj = ((Object) (filterBeanProperties(serializationconfig, beandescription, ((List) (obj2)))));
	//   70  155:aload_0         
	//   71  156:aload           8
	//   72  158:aload_2         
	//   73  159:aload           6
	//   74  161:invokevirtual   #230 <Method List filterBeanProperties(SerializationConfig, BeanDescription, List)>
	//   75  164:astore          4
		obj2 = obj;
	//   76  166:aload           4
	//   77  168:astore          6
		if(_factoryConfig.hasSerializerModifiers())
	//*  78  170:aload_0         
	//*  79  171:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//*  80  174:invokevirtual   #170 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//*  81  177:ifeq            231
		{
			Iterator iterator1 = _factoryConfig.serializerModifiers().iterator();
	//   82  180:aload_0         
	//   83  181:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//   84  184:invokevirtual   #173 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//   85  187:invokeinterface #118 <Method Iterator Iterable.iterator()>
	//   86  192:astore          7
			do
			{
				obj2 = obj;
	//   87  194:aload           4
	//   88  196:astore          6
				if(!iterator1.hasNext())
					break;
	//   89  198:aload           7
	//   90  200:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//   91  205:ifeq            231
				obj = ((Object) (((BeanSerializerModifier)iterator1.next()).orderProperties(serializationconfig, beandescription, ((List) (obj)))));
	//   92  208:aload           7
	//   93  210:invokeinterface #127 <Method Object Iterator.next()>
	//   94  215:checkcast       #175 <Class BeanSerializerModifier>
	//   95  218:aload           8
	//   96  220:aload_2         
	//   97  221:aload           4
	//   98  223:invokevirtual   #233 <Method List BeanSerializerModifier.orderProperties(SerializationConfig, BeanDescription, List)>
	//   99  226:astore          4
			} while(true);
	//  100  228:goto            194
		}
		beanserializerbuilder1.setObjectIdWriter(constructObjectIdHandler(serializerprovider, beandescription, ((List) (obj2))));
	//  101  231:aload           5
	//  102  233:aload_0         
	//  103  234:aload_1         
	//  104  235:aload_2         
	//  105  236:aload           6
	//  106  238:invokevirtual   #237 <Method ObjectIdWriter constructObjectIdHandler(SerializerProvider, BeanDescription, List)>
	//  107  241:invokevirtual   #241 <Method void BeanSerializerBuilder.setObjectIdWriter(ObjectIdWriter)>
		beanserializerbuilder1.setProperties(((List) (obj2)));
	//  108  244:aload           5
	//  109  246:aload           6
	//  110  248:invokevirtual   #245 <Method void BeanSerializerBuilder.setProperties(List)>
		beanserializerbuilder1.setFilterId(findFilterId(serializationconfig, beandescription));
	//  111  251:aload           5
	//  112  253:aload_0         
	//  113  254:aload           8
	//  114  256:aload_2         
	//  115  257:invokevirtual   #249 <Method Object findFilterId(SerializationConfig, BeanDescription)>
	//  116  260:invokevirtual   #253 <Method void BeanSerializerBuilder.setFilterId(Object)>
		obj2 = ((Object) (beandescription.findAnyGetter()));
	//  117  263:aload_2         
	//  118  264:invokevirtual   #257 <Method AnnotatedMember BeanDescription.findAnyGetter()>
	//  119  267:astore          6
		obj3 = null;
	//  120  269:aconst_null     
	//  121  270:astore          7
		if(obj2 != null)
	//* 122  272:aload           6
	//* 123  274:ifnull          383
		{
			JavaType javatype1 = ((AnnotatedMember) (obj2)).getType();
	//  124  277:aload           6
	//  125  279:invokevirtual   #38  <Method JavaType AnnotatedMember.getType()>
	//  126  282:astore          10
			boolean flag = serializationconfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
	//  127  284:aload           8
	//  128  286:getstatic       #263 <Field MapperFeature MapperFeature.USE_STATIC_TYPING>
	//  129  289:invokevirtual   #269 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//  130  292:istore_3        
			JavaType javatype = javatype1.getContentType();
	//  131  293:aload           10
	//  132  295:invokevirtual   #272 <Method JavaType JavaType.getContentType()>
	//  133  298:astore          9
			TypeSerializer typeserializer = createTypeSerializer(serializationconfig, javatype);
	//  134  300:aload_0         
	//  135  301:aload           8
	//  136  303:aload           9
	//  137  305:invokevirtual   #276 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//  138  308:astore          11
			Object obj1 = ((Object) (findSerializerFromAnnotation(serializerprovider, ((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)))));
	//  139  310:aload_0         
	//  140  311:aload_1         
	//  141  312:aload           6
	//  142  314:invokevirtual   #54  <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)>
	//  143  317:astore          4
			if(obj1 == null)
	//* 144  319:aload           4
	//* 145  321:ifnonnull       344
				obj1 = ((Object) (MapSerializer.construct((Set)null, javatype1, flag, typeserializer, ((JsonSerializer) (null)), ((JsonSerializer) (null)), ((Object) (null)))));
	//  146  324:aconst_null     
	//  147  325:checkcast       #278 <Class Set>
	//  148  328:aload           10
	//  149  330:iload_3         
	//  150  331:aload           11
	//  151  333:aconst_null     
	//  152  334:aconst_null     
	//  153  335:aconst_null     
	//  154  336:invokestatic    #284 <Method MapSerializer MapSerializer.construct(Set, JavaType, boolean, TypeSerializer, JsonSerializer, JsonSerializer, Object)>
	//  155  339:astore          4
	//* 156  341:goto            344
			beanserializerbuilder1.setAnyGetter(new AnyGetterWriter(((com.fasterxml.jackson.databind.BeanProperty) (new com.fasterxml.jackson.databind.BeanProperty.Std(PropertyName.construct(((AnnotatedMember) (obj2)).getName()), javatype, ((PropertyName) (null)), ((AnnotatedMember) (obj2)), PropertyMetadata.STD_OPTIONAL))), ((AnnotatedMember) (obj2)), ((JsonSerializer) (obj1))));
	//  157  344:aload           5
	//  158  346:new             #286 <Class AnyGetterWriter>
	//  159  349:dup             
	//  160  350:new             #40  <Class com.fasterxml.jackson.databind.BeanProperty$Std>
	//  161  353:dup             
	//  162  354:aload           6
	//  163  356:invokevirtual   #290 <Method String AnnotatedMember.getName()>
	//  164  359:invokestatic    #295 <Method PropertyName PropertyName.construct(String)>
	//  165  362:aload           9
	//  166  364:aconst_null     
	//  167  365:aload           6
	//  168  367:getstatic       #301 <Field PropertyMetadata PropertyMetadata.STD_OPTIONAL>
	//  169  370:invokespecial   #50  <Method void com.fasterxml.jackson.databind.BeanProperty$Std(PropertyName, JavaType, PropertyName, AnnotatedMember, PropertyMetadata)>
	//  170  373:aload           6
	//  171  375:aload           4
	//  172  377:invokespecial   #304 <Method void AnyGetterWriter(com.fasterxml.jackson.databind.BeanProperty, AnnotatedMember, JsonSerializer)>
	//  173  380:invokevirtual   #308 <Method void BeanSerializerBuilder.setAnyGetter(AnyGetterWriter)>
		}
		processViews(serializationconfig, beanserializerbuilder1);
	//  174  383:aload_0         
	//  175  384:aload           8
	//  176  386:aload           5
	//  177  388:invokevirtual   #312 <Method void processViews(SerializationConfig, BeanSerializerBuilder)>
		obj2 = ((Object) (beanserializerbuilder1));
	//  178  391:aload           5
	//  179  393:astore          6
		if(_factoryConfig.hasSerializerModifiers())
	//* 180  395:aload_0         
	//* 181  396:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//* 182  399:invokevirtual   #170 <Method boolean SerializerFactoryConfig.hasSerializerModifiers()>
	//* 183  402:ifeq            460
		{
			Iterator iterator2 = _factoryConfig.serializerModifiers().iterator();
	//  184  405:aload_0         
	//  185  406:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//  186  409:invokevirtual   #173 <Method Iterable SerializerFactoryConfig.serializerModifiers()>
	//  187  412:invokeinterface #118 <Method Iterator Iterable.iterator()>
	//  188  417:astore          9
			BeanSerializerBuilder beanserializerbuilder = beanserializerbuilder1;
	//  189  419:aload           5
	//  190  421:astore          4
			do
			{
				obj2 = ((Object) (beanserializerbuilder));
	//  191  423:aload           4
	//  192  425:astore          6
				if(!iterator2.hasNext())
					break;
	//  193  427:aload           9
	//  194  429:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//  195  434:ifeq            460
				beanserializerbuilder = ((BeanSerializerModifier)iterator2.next()).updateBuilder(serializationconfig, beandescription, beanserializerbuilder);
	//  196  437:aload           9
	//  197  439:invokeinterface #127 <Method Object Iterator.next()>
	//  198  444:checkcast       #175 <Class BeanSerializerModifier>
	//  199  447:aload           8
	//  200  449:aload_2         
	//  201  450:aload           4
	//  202  452:invokevirtual   #316 <Method BeanSerializerBuilder BeanSerializerModifier.updateBuilder(SerializationConfig, BeanDescription, BeanSerializerBuilder)>
	//  203  455:astore          4
			} while(true);
	//  204  457:goto            423
		}
		JsonSerializer jsonserializer = ((BeanSerializerBuilder) (obj2)).build();
	//  205  460:aload           6
	//  206  462:invokevirtual   #320 <Method JsonSerializer BeanSerializerBuilder.build()>
	//  207  465:astore          4
		serializerprovider = ((SerializerProvider) (jsonserializer));
	//  208  467:aload           4
	//  209  469:astore_1        
		break MISSING_BLOCK_LABEL_517;
	//  210  470:goto            517
		RuntimeException runtimeexception;
		runtimeexception;
	//  211  473:astore          4
		serializerprovider.reportBadTypeDefinition(beandescription, "Failed to construct BeanSerializer for %s: (%s) %s", new Object[] {
			beandescription.getType(), ((Object) (runtimeexception)).getClass().getName(), runtimeexception.getMessage()
		});
	//  212  475:aload_1         
	//  213  476:aload_2         
	//  214  477:ldc2            #322 <String "Failed to construct BeanSerializer for %s: (%s) %s">
	//  215  480:iconst_3        
	//  216  481:anewarray       Object[]
	//  217  484:dup             
	//  218  485:iconst_0        
	//  219  486:aload_2         
	//  220  487:invokevirtual   #323 <Method JavaType BeanDescription.getType()>
	//  221  490:aastore         
	//  222  491:dup             
	//  223  492:iconst_1        
	//  224  493:aload           4
	//  225  495:invokevirtual   #326 <Method Class Object.getClass()>
	//  226  498:invokevirtual   #329 <Method String Class.getName()>
	//  227  501:aastore         
	//  228  502:dup             
	//  229  503:iconst_2        
	//  230  504:aload           4
	//  231  506:invokevirtual   #332 <Method String RuntimeException.getMessage()>
	//  232  509:aastore         
	//  233  510:invokevirtual   #336 <Method Object SerializerProvider.reportBadTypeDefinition(BeanDescription, String, Object[])>
	//  234  513:pop             
		serializerprovider = ((SerializerProvider) (obj3));
	//  235  514:aload           7
	//  236  516:astore_1        
		if(serializerprovider == null && beandescription.hasKnownClassAnnotations())
	//* 237  517:aload_1         
	//* 238  518:ifnonnull       534
	//* 239  521:aload_2         
	//* 240  522:invokevirtual   #339 <Method boolean BeanDescription.hasKnownClassAnnotations()>
	//* 241  525:ifeq            534
			return ((JsonSerializer) (((BeanSerializerBuilder) (obj2)).createDummy()));
	//  242  528:aload           6
	//  243  530:invokevirtual   #343 <Method BeanSerializer BeanSerializerBuilder.createDummy()>
	//  244  533:areturn         
		else
			return ((JsonSerializer) (serializerprovider));
	//  245  534:aload_1         
	//  246  535:areturn         
	}

	protected BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription beandescription)
	{
		return new BeanSerializerBuilder(beandescription);
	//    0    0:new             #193 <Class BeanSerializerBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #347 <Method void BeanSerializerBuilder(BeanDescription)>
	//    4    8:areturn         
	}

	protected BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanpropertywriter, Class aclass[])
	{
		return FilteredBeanPropertyWriter.constructViewBased(beanpropertywriter, aclass);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #354 <Method BeanPropertyWriter FilteredBeanPropertyWriter.constructViewBased(BeanPropertyWriter, Class[])>
	//    3    5:areturn         
	}

	protected ObjectIdWriter constructObjectIdHandler(SerializerProvider serializerprovider, BeanDescription beandescription, List list)
		throws JsonMappingException
	{
		ObjectIdInfo objectidinfo = beandescription.getObjectIdInfo();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #359 <Method ObjectIdInfo BeanDescription.getObjectIdInfo()>
	//    2    4:astore          6
		if(objectidinfo == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		Object obj = ((Object) (objectidinfo.getGeneratorType()));
	//    7   13:aload           6
	//    8   15:invokevirtual   #364 <Method Class ObjectIdInfo.getGeneratorType()>
	//    9   18:astore          7
		if(obj == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
	//*  10   20:aload           7
	//*  11   22:ldc2            #366 <Class com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator>
	//*  12   25:if_acmpne       207
		{
			serializerprovider = ((SerializerProvider) (objectidinfo.getPropertyName().getSimpleName()));
	//   13   28:aload           6
	//   14   30:invokevirtual   #369 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//   15   33:invokevirtual   #372 <Method String PropertyName.getSimpleName()>
	//   16   36:astore_1        
			int j = list.size();
	//   17   37:aload_3         
	//   18   38:invokeinterface #378 <Method int List.size()>
	//   19   43:istore          5
			for(int i = 0; i != j; i++)
	//*  20   45:iconst_0        
	//*  21   46:istore          4
	//*  22   48:iload           4
	//*  23   50:iload           5
	//*  24   52:icmpeq          145
			{
				obj = ((Object) ((BeanPropertyWriter)list.get(i)));
	//   25   55:aload_3         
	//   26   56:iload           4
	//   27   58:invokeinterface #382 <Method Object List.get(int)>
	//   28   63:checkcast       #384 <Class BeanPropertyWriter>
	//   29   66:astore          7
				if(((String) (serializerprovider)).equals(((Object) (((BeanPropertyWriter) (obj)).getName()))))
	//*  30   68:aload_1         
	//*  31   69:aload           7
	//*  32   71:invokevirtual   #385 <Method String BeanPropertyWriter.getName()>
	//*  33   74:invokevirtual   #391 <Method boolean String.equals(Object)>
	//*  34   77:ifeq            136
				{
					if(i > 0)
	//*  35   80:iload           4
	//*  36   82:ifle            103
					{
						list.remove(i);
	//   37   85:aload_3         
	//   38   86:iload           4
	//   39   88:invokeinterface #394 <Method Object List.remove(int)>
	//   40   93:pop             
						list.add(0, obj);
	//   41   94:aload_3         
	//   42   95:iconst_0        
	//   43   96:aload           7
	//   44   98:invokeinterface #398 <Method void List.add(int, Object)>
					}
					serializerprovider = ((SerializerProvider) (((BeanPropertyWriter) (obj)).getType()));
	//   45  103:aload           7
	//   46  105:invokevirtual   #399 <Method JavaType BeanPropertyWriter.getType()>
	//   47  108:astore_1        
					beandescription = ((BeanDescription) (new PropertyBasedObjectIdGenerator(objectidinfo, ((BeanPropertyWriter) (obj)))));
	//   48  109:new             #401 <Class PropertyBasedObjectIdGenerator>
	//   49  112:dup             
	//   50  113:aload           6
	//   51  115:aload           7
	//   52  117:invokespecial   #404 <Method void PropertyBasedObjectIdGenerator(ObjectIdInfo, BeanPropertyWriter)>
	//   53  120:astore_2        
					return ObjectIdWriter.construct(((JavaType) (serializerprovider)), (PropertyName)null, ((ObjectIdGenerator) (beandescription)), objectidinfo.getAlwaysAsId());
	//   54  121:aload_1         
	//   55  122:aconst_null     
	//   56  123:checkcast       #292 <Class PropertyName>
	//   57  126:aload_2         
	//   58  127:aload           6
	//   59  129:invokevirtual   #407 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//   60  132:invokestatic    #412 <Method ObjectIdWriter ObjectIdWriter.construct(JavaType, PropertyName, ObjectIdGenerator, boolean)>
	//   61  135:areturn         
				}
			}

	//   62  136:iload           4
	//   63  138:iconst_1        
	//   64  139:iadd            
	//   65  140:istore          4
	//*  66  142:goto            48
			list = ((List) (new StringBuilder()));
	//   67  145:new             #414 <Class StringBuilder>
	//   68  148:dup             
	//   69  149:invokespecial   #415 <Method void StringBuilder()>
	//   70  152:astore_3        
			((StringBuilder) (list)).append("Invalid Object Id definition for ");
	//   71  153:aload_3         
	//   72  154:ldc2            #417 <String "Invalid Object Id definition for ">
	//   73  157:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   74  160:pop             
			((StringBuilder) (list)).append(beandescription.getBeanClass().getName());
	//   75  161:aload_3         
	//   76  162:aload_2         
	//   77  163:invokevirtual   #157 <Method Class BeanDescription.getBeanClass()>
	//   78  166:invokevirtual   #329 <Method String Class.getName()>
	//   79  169:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   80  172:pop             
			((StringBuilder) (list)).append(": cannot find property with name '");
	//   81  173:aload_3         
	//   82  174:ldc2            #423 <String ": cannot find property with name '">
	//   83  177:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   84  180:pop             
			((StringBuilder) (list)).append(((String) (serializerprovider)));
	//   85  181:aload_3         
	//   86  182:aload_1         
	//   87  183:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   88  186:pop             
			((StringBuilder) (list)).append("'");
	//   89  187:aload_3         
	//   90  188:ldc2            #425 <String "'">
	//   91  191:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   92  194:pop             
			throw new IllegalArgumentException(((StringBuilder) (list)).toString());
	//   93  195:new             #427 <Class IllegalArgumentException>
	//   94  198:dup             
	//   95  199:aload_3         
	//   96  200:invokevirtual   #430 <Method String StringBuilder.toString()>
	//   97  203:invokespecial   #433 <Method void IllegalArgumentException(String)>
	//   98  206:athrow          
		} else
		{
			list = ((List) (serializerprovider.constructType(((java.lang.reflect.Type) (obj)))));
	//   99  207:aload_1         
	//  100  208:aload           7
	//  101  210:invokevirtual   #437 <Method JavaType SerializerProvider.constructType(java.lang.reflect.Type)>
	//  102  213:astore_3        
			list = ((List) (serializerprovider.getTypeFactory().findTypeParameters(((JavaType) (list)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0]));
	//  103  214:aload_1         
	//  104  215:invokevirtual   #441 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//  105  218:aload_3         
	//  106  219:ldc2            #443 <Class ObjectIdGenerator>
	//  107  222:invokevirtual   #449 <Method JavaType[] TypeFactory.findTypeParameters(JavaType, Class)>
	//  108  225:iconst_0        
	//  109  226:aaload          
	//  110  227:astore_3        
			serializerprovider = ((SerializerProvider) (serializerprovider.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (beandescription.getClassInfo())), objectidinfo)));
	//  111  228:aload_1         
	//  112  229:aload_2         
	//  113  230:invokevirtual   #217 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//  114  233:aload           6
	//  115  235:invokevirtual   #453 <Method ObjectIdGenerator SerializerProvider.objectIdGeneratorInstance(com.fasterxml.jackson.databind.introspect.Annotated, ObjectIdInfo)>
	//  116  238:astore_1        
			return ObjectIdWriter.construct(((JavaType) (list)), objectidinfo.getPropertyName(), ((ObjectIdGenerator) (serializerprovider)), objectidinfo.getAlwaysAsId());
	//  117  239:aload_3         
	//  118  240:aload           6
	//  119  242:invokevirtual   #369 <Method PropertyName ObjectIdInfo.getPropertyName()>
	//  120  245:aload_1         
	//  121  246:aload           6
	//  122  248:invokevirtual   #407 <Method boolean ObjectIdInfo.getAlwaysAsId()>
	//  123  251:invokestatic    #412 <Method ObjectIdWriter ObjectIdWriter.construct(JavaType, PropertyName, ObjectIdGenerator, boolean)>
	//  124  254:areturn         
		}
	}

	protected PropertyBuilder constructPropertyBuilder(SerializationConfig serializationconfig, BeanDescription beandescription)
	{
		return new PropertyBuilder(serializationconfig, beandescription);
	//    0    0:new             #88  <Class PropertyBuilder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #459 <Method void PropertyBuilder(SerializationConfig, BeanDescription)>
	//    5    9:areturn         
	}

	public JsonSerializer createSerializer(SerializerProvider serializerprovider, JavaType javatype)
		throws JsonMappingException
	{
		SerializationConfig serializationconfig = serializerprovider.getConfig();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #79  <Method SerializationConfig SerializerProvider.getConfig()>
	//    2    4:astore          7
		Object obj1 = ((Object) (serializationconfig.introspect(javatype)));
	//    3    6:aload           7
	//    4    8:aload_2         
	//    5    9:invokevirtual   #465 <Method BeanDescription SerializationConfig.introspect(JavaType)>
	//    6   12:astore          5
		JsonSerializer jsonserializer = findSerializerFromAnnotation(serializerprovider, ((com.fasterxml.jackson.databind.introspect.Annotated) (((BeanDescription) (obj1)).getClassInfo())));
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload           5
	//   10   18:invokevirtual   #217 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   11   21:invokevirtual   #54  <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)>
	//   12   24:astore          6
		if(jsonserializer != null)
	//*  13   26:aload           6
	//*  14   28:ifnull          34
			return jsonserializer;
	//   15   31:aload           6
	//   16   33:areturn         
		Object obj = ((Object) (serializationconfig.getAnnotationIntrospector()));
	//   17   34:aload           7
	//   18   36:invokevirtual   #466 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//   19   39:astore          4
		boolean flag = false;
	//   20   41:iconst_0        
	//   21   42:istore_3        
		Converter converter;
		JavaType javatype1;
		if(obj == null)
	//*  22   43:aload           4
	//*  23   45:ifnonnull       54
			obj = ((Object) (javatype));
	//   24   48:aload_2         
	//   25   49:astore          4
		else
	//*  26   51:goto            69
			try
			{
				obj = ((Object) (((AnnotationIntrospector) (obj)).refineSerializationType(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), ((com.fasterxml.jackson.databind.introspect.Annotated) (((BeanDescription) (obj1)).getClassInfo())), javatype)));
	//   27   54:aload           4
	//   28   56:aload           7
	//   29   58:aload           5
	//   30   60:invokevirtual   #217 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   31   63:aload_2         
	//   32   64:invokevirtual   #470 <Method JavaType AnnotationIntrospector.refineSerializationType(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.Annotated, JavaType)>
	//   33   67:astore          4
			}
	//*  34   69:aload           4
	//*  35   71:aload_2         
	//*  36   72:if_acmpne       81
	//*  37   75:aload           5
	//*  38   77:astore_2        
	//*  39   78:goto            111
	//*  40   81:aload           4
	//*  41   83:aload_2         
	//*  42   84:invokevirtual   #473 <Method Class JavaType.getRawClass()>
	//*  43   87:invokevirtual   #477 <Method boolean JavaType.hasRawClass(Class)>
	//*  44   90:ifne            106
	//*  45   93:aload           7
	//*  46   95:aload           4
	//*  47   97:invokevirtual   #465 <Method BeanDescription SerializationConfig.introspect(JavaType)>
	//*  48  100:astore_2        
	//*  49  101:iconst_1        
	//*  50  102:istore_3        
	//*  51  103:goto            111
	//*  52  106:iconst_1        
	//*  53  107:istore_3        
	//*  54  108:aload           5
	//*  55  110:astore_2        
	//*  56  111:aload_2         
	//*  57  112:invokevirtual   #481 <Method Converter BeanDescription.findSerializationConverter()>
	//*  58  115:astore          8
	//*  59  117:aload           8
	//*  60  119:ifnonnull       132
	//*  61  122:aload_0         
	//*  62  123:aload_1         
	//*  63  124:aload           4
	//*  64  126:aload_2         
	//*  65  127:iload_3         
	//*  66  128:invokevirtual   #483 <Method JsonSerializer _createSerializer2(SerializerProvider, JavaType, BeanDescription, boolean)>
	//*  67  131:areturn         
	//*  68  132:aload           8
	//*  69  134:aload_1         
	//*  70  135:invokevirtual   #441 <Method TypeFactory SerializerProvider.getTypeFactory()>
	//*  71  138:invokeinterface #489 <Method JavaType Converter.getOutputType(TypeFactory)>
	//*  72  143:astore          9
	//*  73  145:aload_2         
	//*  74  146:astore          5
	//*  75  148:aload           6
	//*  76  150:astore_2        
	//*  77  151:aload           9
	//*  78  153:aload           4
	//*  79  155:invokevirtual   #473 <Method Class JavaType.getRawClass()>
	//*  80  158:invokevirtual   #477 <Method boolean JavaType.hasRawClass(Class)>
	//*  81  161:ifne            184
	//*  82  164:aload           7
	//*  83  166:aload           9
	//*  84  168:invokevirtual   #465 <Method BeanDescription SerializationConfig.introspect(JavaType)>
	//*  85  171:astore          5
	//*  86  173:aload_0         
	//*  87  174:aload_1         
	//*  88  175:aload           5
	//*  89  177:invokevirtual   #217 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//*  90  180:invokevirtual   #54  <Method JsonSerializer findSerializerFromAnnotation(SerializerProvider, com.fasterxml.jackson.databind.introspect.Annotated)>
	//*  91  183:astore_2        
	//*  92  184:aload_2         
	//*  93  185:astore          4
	//*  94  187:aload_2         
	//*  95  188:ifnonnull       214
	//*  96  191:aload_2         
	//*  97  192:astore          4
	//*  98  194:aload           9
	//*  99  196:invokevirtual   #492 <Method boolean JavaType.isJavaLangObject()>
	//* 100  199:ifne            214
	//* 101  202:aload_0         
	//* 102  203:aload_1         
	//* 103  204:aload           9
	//* 104  206:aload           5
	//* 105  208:iconst_1        
	//* 106  209:invokevirtual   #483 <Method JsonSerializer _createSerializer2(SerializerProvider, JavaType, BeanDescription, boolean)>
	//* 107  212:astore          4
	//* 108  214:new             #494 <Class StdDelegatingSerializer>
	//* 109  217:dup             
	//* 110  218:aload           8
	//* 111  220:aload           9
	//* 112  222:aload           4
	//* 113  224:invokespecial   #497 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//* 114  227:areturn         
			// Misplaced declaration of an exception variable
			catch(JavaType javatype)
	//* 115  228:astore_2        
			{
				return (JsonSerializer)serializerprovider.reportBadTypeDefinition(((BeanDescription) (obj1)), ((JsonMappingException) (javatype)).getMessage(), new Object[0]);
	//  116  229:aload_1         
	//  117  230:aload           5
	//  118  232:aload_2         
	//  119  233:invokevirtual   #498 <Method String JsonMappingException.getMessage()>
	//  120  236:iconst_0        
	//  121  237:anewarray       Object[]
	//  122  240:invokevirtual   #336 <Method Object SerializerProvider.reportBadTypeDefinition(BeanDescription, String, Object[])>
	//  123  243:checkcast       #500 <Class JsonSerializer>
	//  124  246:areturn         
			}
		if(obj == javatype)
			javatype = ((JavaType) (obj1));
		else
		if(!((JavaType) (obj)).hasRawClass(javatype.getRawClass()))
		{
			javatype = ((JavaType) (serializationconfig.introspect(((JavaType) (obj)))));
			flag = true;
		} else
		{
			flag = true;
			javatype = ((JavaType) (obj1));
		}
		converter = ((BeanDescription) (javatype)).findSerializationConverter();
		if(converter == null)
			return _createSerializer2(serializerprovider, ((JavaType) (obj)), ((BeanDescription) (javatype)), flag);
		javatype1 = converter.getOutputType(serializerprovider.getTypeFactory());
		obj1 = ((Object) (javatype));
		javatype = ((JavaType) (jsonserializer));
		if(!javatype1.hasRawClass(((JavaType) (obj)).getRawClass()))
		{
			obj1 = ((Object) (serializationconfig.introspect(javatype1)));
			javatype = ((JavaType) (findSerializerFromAnnotation(serializerprovider, ((com.fasterxml.jackson.databind.introspect.Annotated) (((BeanDescription) (obj1)).getClassInfo())))));
		}
		obj = ((Object) (javatype));
		if(javatype == null)
		{
			obj = ((Object) (javatype));
			if(!javatype1.isJavaLangObject())
				obj = ((Object) (_createSerializer2(serializerprovider, javatype1, ((BeanDescription) (obj1)), true)));
		}
		return ((JsonSerializer) (new StdDelegatingSerializer(converter, javatype1, ((JsonSerializer) (obj)))));
	}

	protected Iterable customSerializers()
	{
		return _factoryConfig.serializers();
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//    2    4:invokevirtual   #504 <Method Iterable SerializerFactoryConfig.serializers()>
	//    3    7:areturn         
	}

	protected List filterBeanProperties(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
	{
		serializationconfig = ((SerializationConfig) (serializationconfig.getDefaultPropertyIgnorals(beandescription.getBeanClass(), beandescription.getClassInfo())));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #157 <Method Class BeanDescription.getBeanClass()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #217 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//    5    9:invokevirtual   #509 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value SerializationConfig.getDefaultPropertyIgnorals(Class, com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//    6   12:astore_1        
		if(serializationconfig != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          77
		{
			serializationconfig = ((SerializationConfig) (((com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value) (serializationconfig)).findIgnoredForSerialization()));
	//    9   17:aload_1         
	//   10   18:invokevirtual   #515 <Method Set com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value.findIgnoredForSerialization()>
	//   11   21:astore_1        
			if(!((Set) (serializationconfig)).isEmpty())
	//*  12   22:aload_1         
	//*  13   23:invokeinterface #518 <Method boolean Set.isEmpty()>
	//*  14   28:ifne            77
			{
				beandescription = ((BeanDescription) (list.iterator()));
	//   15   31:aload_3         
	//   16   32:invokeinterface #519 <Method Iterator List.iterator()>
	//   17   37:astore_2        
				do
				{
					if(!((Iterator) (beandescription)).hasNext())
						break;
	//   18   38:aload_2         
	//   19   39:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//   20   44:ifeq            77
					if(((Set) (serializationconfig)).contains(((Object) (((BeanPropertyWriter)((Iterator) (beandescription)).next()).getName()))))
	//*  21   47:aload_1         
	//*  22   48:aload_2         
	//*  23   49:invokeinterface #127 <Method Object Iterator.next()>
	//*  24   54:checkcast       #384 <Class BeanPropertyWriter>
	//*  25   57:invokevirtual   #385 <Method String BeanPropertyWriter.getName()>
	//*  26   60:invokeinterface #522 <Method boolean Set.contains(Object)>
	//*  27   65:ifeq            38
						((Iterator) (beandescription)).remove();
	//   28   68:aload_2         
	//   29   69:invokeinterface #524 <Method void Iterator.remove()>
				} while(true);
	//   30   74:goto            38
			}
		}
		return list;
	//   31   77:aload_3         
	//   32   78:areturn         
	}

	protected List findBeanProperties(SerializerProvider serializerprovider, BeanDescription beandescription, BeanSerializerBuilder beanserializerbuilder)
		throws JsonMappingException
	{
		Object obj1 = ((Object) (beandescription.findProperties()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #529 <Method List BeanDescription.findProperties()>
	//    2    4:astore          6
		Object obj = ((Object) (serializerprovider.getConfig()));
	//    3    6:aload_1         
	//    4    7:invokevirtual   #79  <Method SerializationConfig SerializerProvider.getConfig()>
	//    5   10:astore          5
		removeIgnorableTypes(((SerializationConfig) (obj)), beandescription, ((List) (obj1)));
	//    6   12:aload_0         
	//    7   13:aload           5
	//    8   15:aload_2         
	//    9   16:aload           6
	//   10   18:invokevirtual   #533 <Method void removeIgnorableTypes(SerializationConfig, BeanDescription, List)>
		if(((SerializationConfig) (obj)).isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS))
	//*  11   21:aload           5
	//*  12   23:getstatic       #536 <Field MapperFeature MapperFeature.REQUIRE_SETTERS_FOR_GETTERS>
	//*  13   26:invokevirtual   #269 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//*  14   29:ifeq            41
			removeSetterlessGetters(((SerializationConfig) (obj)), beandescription, ((List) (obj1)));
	//   15   32:aload_0         
	//   16   33:aload           5
	//   17   35:aload_2         
	//   18   36:aload           6
	//   19   38:invokevirtual   #539 <Method void removeSetterlessGetters(SerializationConfig, BeanDescription, List)>
		if(((List) (obj1)).isEmpty())
	//*  20   41:aload           6
	//*  21   43:invokeinterface #540 <Method boolean List.isEmpty()>
	//*  22   48:ifeq            53
			return null;
	//   23   51:aconst_null     
	//   24   52:areturn         
		boolean flag = usesStaticTyping(((SerializationConfig) (obj)), beandescription, ((TypeSerializer) (null)));
	//   25   53:aload_0         
	//   26   54:aload           5
	//   27   56:aload_2         
	//   28   57:aconst_null     
	//   29   58:invokevirtual   #99  <Method boolean usesStaticTyping(SerializationConfig, BeanDescription, TypeSerializer)>
	//   30   61:istore          4
		beandescription = ((BeanDescription) (constructPropertyBuilder(((SerializationConfig) (obj)), beandescription)));
	//   31   63:aload_0         
	//   32   64:aload           5
	//   33   66:aload_2         
	//   34   67:invokevirtual   #542 <Method PropertyBuilder constructPropertyBuilder(SerializationConfig, BeanDescription)>
	//   35   70:astore_2        
		obj = ((Object) (new ArrayList(((List) (obj1)).size())));
	//   36   71:new             #203 <Class ArrayList>
	//   37   74:dup             
	//   38   75:aload           6
	//   39   77:invokeinterface #378 <Method int List.size()>
	//   40   82:invokespecial   #545 <Method void ArrayList(int)>
	//   41   85:astore          5
		obj1 = ((Object) (((List) (obj1)).iterator()));
	//   42   87:aload           6
	//   43   89:invokeinterface #519 <Method Iterator List.iterator()>
	//   44   94:astore          6
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
	//   45   96:aload           6
	//   46   98:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//   47  103:ifeq            226
			BeanPropertyDefinition beanpropertydefinition = (BeanPropertyDefinition)((Iterator) (obj1)).next();
	//   48  106:aload           6
	//   49  108:invokeinterface #127 <Method Object Iterator.next()>
	//   50  113:checkcast       #28  <Class BeanPropertyDefinition>
	//   51  116:astore          7
			AnnotatedMember annotatedmember = beanpropertydefinition.getAccessor();
	//   52  118:aload           7
	//   53  120:invokevirtual   #548 <Method AnnotatedMember BeanPropertyDefinition.getAccessor()>
	//   54  123:astore          8
			if(beanpropertydefinition.isTypeId())
	//*  55  125:aload           7
	//*  56  127:invokevirtual   #551 <Method boolean BeanPropertyDefinition.isTypeId()>
	//*  57  130:ifeq            147
			{
				if(annotatedmember != null)
	//*  58  133:aload           8
	//*  59  135:ifnull          96
					beanserializerbuilder.setTypeId(annotatedmember);
	//   60  138:aload_3         
	//   61  139:aload           8
	//   62  141:invokevirtual   #555 <Method void BeanSerializerBuilder.setTypeId(AnnotatedMember)>
			} else
	//*  63  144:goto            96
			{
				com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty referenceproperty = beanpropertydefinition.findReferenceType();
	//   64  147:aload           7
	//   65  149:invokevirtual   #559 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty BeanPropertyDefinition.findReferenceType()>
	//   66  152:astore          9
				if(referenceproperty == null || !referenceproperty.isBackReference())
	//*  67  154:aload           9
	//*  68  156:ifnull          170
	//*  69  159:aload           9
	//*  70  161:invokevirtual   #564 <Method boolean com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.isBackReference()>
	//*  71  164:ifeq            170
	//*  72  167:goto            96
					if(annotatedmember instanceof AnnotatedMethod)
	//*  73  170:aload           8
	//*  74  172:instanceof      #566 <Class AnnotatedMethod>
	//*  75  175:ifeq            202
						((ArrayList) (obj)).add(((Object) (_constructWriter(serializerprovider, beanpropertydefinition, ((PropertyBuilder) (beandescription)), flag, ((AnnotatedMember) ((AnnotatedMethod)annotatedmember))))));
	//   76  178:aload           5
	//   77  180:aload_0         
	//   78  181:aload_1         
	//   79  182:aload           7
	//   80  184:aload_2         
	//   81  185:iload           4
	//   82  187:aload           8
	//   83  189:checkcast       #566 <Class AnnotatedMethod>
	//   84  192:invokevirtual   #568 <Method BeanPropertyWriter _constructWriter(SerializerProvider, BeanPropertyDefinition, PropertyBuilder, boolean, AnnotatedMember)>
	//   85  195:invokevirtual   #570 <Method boolean ArrayList.add(Object)>
	//   86  198:pop             
					else
	//*  87  199:goto            96
						((ArrayList) (obj)).add(((Object) (_constructWriter(serializerprovider, beanpropertydefinition, ((PropertyBuilder) (beandescription)), flag, ((AnnotatedMember) ((AnnotatedField)annotatedmember))))));
	//   88  202:aload           5
	//   89  204:aload_0         
	//   90  205:aload_1         
	//   91  206:aload           7
	//   92  208:aload_2         
	//   93  209:iload           4
	//   94  211:aload           8
	//   95  213:checkcast       #572 <Class AnnotatedField>
	//   96  216:invokevirtual   #568 <Method BeanPropertyWriter _constructWriter(SerializerProvider, BeanPropertyDefinition, PropertyBuilder, boolean, AnnotatedMember)>
	//   97  219:invokevirtual   #570 <Method boolean ArrayList.add(Object)>
	//   98  222:pop             
			}
		} while(true);
	//   99  223:goto            96
		return ((List) (obj));
	//  100  226:aload           5
	//  101  228:areturn         
	}

	public JsonSerializer findBeanSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription)
		throws JsonMappingException
	{
		if(!isPotentialBeanType(javatype.getRawClass()) && !javatype.isEnumType())
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #473 <Method Class JavaType.getRawClass()>
	//*   3    5:invokevirtual   #576 <Method boolean isPotentialBeanType(Class)>
	//*   4    8:ifne            20
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #579 <Method boolean JavaType.isEnumType()>
	//*   7   15:ifne            20
			return null;
	//    8   18:aconst_null     
	//    9   19:areturn         
		else
			return constructBeanSerializer(serializerprovider, beandescription);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #581 <Method JsonSerializer constructBeanSerializer(SerializerProvider, BeanDescription)>
	//   14   26:areturn         
	}

	public TypeSerializer findPropertyContentTypeSerializer(JavaType javatype, SerializationConfig serializationconfig, AnnotatedMember annotatedmember)
		throws JsonMappingException
	{
		JavaType javatype1 = javatype.getContentType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #272 <Method JavaType JavaType.getContentType()>
	//    2    4:astore          4
		javatype = ((JavaType) (serializationconfig.getAnnotationIntrospector().findPropertyContentTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedmember, javatype)));
	//    3    6:aload_2         
	//    4    7:invokevirtual   #466 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload_1         
	//    8   13:invokevirtual   #586 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyContentTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, AnnotatedMember, JavaType)>
	//    9   16:astore_1        
		if(javatype == null)
	//*  10   17:aload_1         
	//*  11   18:ifnonnull       29
			return createTypeSerializer(serializationconfig, javatype1);
	//   12   21:aload_0         
	//   13   22:aload_2         
	//   14   23:aload           4
	//   15   25:invokevirtual   #276 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   16   28:areturn         
		else
			return ((TypeResolverBuilder) (javatype)).buildTypeSerializer(serializationconfig, javatype1, serializationconfig.getSubtypeResolver().collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedmember, javatype1));
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:aload           4
	//   20   33:aload_2         
	//   21   34:invokevirtual   #590 <Method SubtypeResolver SerializationConfig.getSubtypeResolver()>
	//   22   37:aload_2         
	//   23   38:aload_3         
	//   24   39:aload           4
	//   25   41:invokevirtual   #596 <Method java.util.Collection SubtypeResolver.collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig, AnnotatedMember, JavaType)>
	//   26   44:invokeinterface #602 <Method TypeSerializer TypeResolverBuilder.buildTypeSerializer(SerializationConfig, JavaType, java.util.Collection)>
	//   27   49:areturn         
	}

	public TypeSerializer findPropertyTypeSerializer(JavaType javatype, SerializationConfig serializationconfig, AnnotatedMember annotatedmember)
		throws JsonMappingException
	{
		TypeResolverBuilder typeresolverbuilder = serializationconfig.getAnnotationIntrospector().findPropertyTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedmember, javatype);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #466 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #605 <Method TypeResolverBuilder AnnotationIntrospector.findPropertyTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, AnnotatedMember, JavaType)>
	//    6   10:astore          4
		if(typeresolverbuilder == null)
	//*   7   12:aload           4
	//*   8   14:ifnonnull       24
			return createTypeSerializer(serializationconfig, javatype);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #276 <Method TypeSerializer createTypeSerializer(SerializationConfig, JavaType)>
	//   13   23:areturn         
		else
			return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, serializationconfig.getSubtypeResolver().collectAndResolveSubtypesByClass(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), annotatedmember, javatype));
	//   14   24:aload           4
	//   15   26:aload_2         
	//   16   27:aload_1         
	//   17   28:aload_2         
	//   18   29:invokevirtual   #590 <Method SubtypeResolver SerializationConfig.getSubtypeResolver()>
	//   19   32:aload_2         
	//   20   33:aload_3         
	//   21   34:aload_1         
	//   22   35:invokevirtual   #596 <Method java.util.Collection SubtypeResolver.collectAndResolveSubtypesByClass(com.fasterxml.jackson.databind.cfg.MapperConfig, AnnotatedMember, JavaType)>
	//   23   38:invokeinterface #602 <Method TypeSerializer TypeResolverBuilder.buildTypeSerializer(SerializationConfig, JavaType, java.util.Collection)>
	//   24   43:areturn         
	}

	protected boolean isPotentialBeanType(Class class1)
	{
		return ClassUtil.canBeABeanType(class1) == null && !ClassUtil.isProxyType(class1);
	//    0    0:aload_1         
	//    1    1:invokestatic    #611 <Method String ClassUtil.canBeABeanType(Class)>
	//    2    4:ifnonnull       16
	//    3    7:aload_1         
	//    4    8:invokestatic    #614 <Method boolean ClassUtil.isProxyType(Class)>
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
	//    1    1:invokevirtual   #618 <Method List BeanSerializerBuilder.getProperties()>
	//    2    4:astore          8
		boolean flag = serializationconfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
	//    3    6:aload_1         
	//    4    7:getstatic       #621 <Field MapperFeature MapperFeature.DEFAULT_VIEW_INCLUSION>
	//    5   10:invokevirtual   #269 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//    6   13:istore          7
		int l = list.size();
	//    7   15:aload           8
	//    8   17:invokeinterface #378 <Method int List.size()>
	//    9   22:istore          6
		serializationconfig = ((SerializationConfig) (new BeanPropertyWriter[l]));
	//   10   24:iload           6
	//   11   26:anewarray       BeanPropertyWriter[]
	//   12   29:astore_1        
		int i = 0;
	//   13   30:iconst_0        
	//   14   31:istore_3        
		int j;
		int k;
		for(j = 0; i < l; j = k)
	//*  15   32:iconst_0        
	//*  16   33:istore          4
	//*  17   35:iload_3         
	//*  18   36:iload           6
	//*  19   38:icmpge          115
		{
			BeanPropertyWriter beanpropertywriter = (BeanPropertyWriter)list.get(i);
	//   20   41:aload           8
	//   21   43:iload_3         
	//   22   44:invokeinterface #382 <Method Object List.get(int)>
	//   23   49:checkcast       #384 <Class BeanPropertyWriter>
	//   24   52:astore          9
			Class aclass[] = beanpropertywriter.getViews();
	//   25   54:aload           9
	//   26   56:invokevirtual   #625 <Method Class[] BeanPropertyWriter.getViews()>
	//   27   59:astore          10
			if(aclass == null)
	//*  28   61:aload           10
	//*  29   63:ifnonnull       87
			{
				k = j;
	//   30   66:iload           4
	//   31   68:istore          5
				if(flag)
	//*  32   70:iload           7
	//*  33   72:ifeq            104
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
	//*  40   84:goto            104
			{
				k = j + 1;
	//   41   87:iload           4
	//   42   89:iconst_1        
	//   43   90:iadd            
	//   44   91:istore          5
				serializationconfig[i] = ((/*<invalid signature>*/java.lang.Object) (constructFilteredBeanWriter(beanpropertywriter, aclass)));
	//   45   93:aload_1         
	//   46   94:iload_3         
	//   47   95:aload_0         
	//   48   96:aload           9
	//   49   98:aload           10
	//   50  100:invokevirtual   #627 <Method BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter, Class[])>
	//   51  103:aastore         
			}
			i++;
	//   52  104:iload_3         
	//   53  105:iconst_1        
	//   54  106:iadd            
	//   55  107:istore_3        
		}

	//   56  108:iload           5
	//   57  110:istore          4
	//*  58  112:goto            35
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
	//   66  128:invokevirtual   #631 <Method void BeanSerializerBuilder.setFilteredProperties(BeanPropertyWriter[])>
			return;
	//   67  131:return          
		}
	}

	protected void removeIgnorableTypes(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
	{
		AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #466 <Method AnnotationIntrospector SerializationConfig.getAnnotationIntrospector()>
	//    2    4:astore          4
		HashMap hashmap = new HashMap();
	//    3    6:new             #633 <Class HashMap>
	//    4    9:dup             
	//    5   10:invokespecial   #634 <Method void HashMap()>
	//    6   13:astore          5
		Iterator iterator = list.iterator();
	//    7   15:aload_3         
	//    8   16:invokeinterface #519 <Method Iterator List.iterator()>
	//    9   21:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   23:aload           6
	//   11   25:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            151
			beandescription = ((BeanDescription) ((BeanPropertyDefinition)iterator.next()));
	//   13   33:aload           6
	//   14   35:invokeinterface #127 <Method Object Iterator.next()>
	//   15   40:checkcast       #28  <Class BeanPropertyDefinition>
	//   16   43:astore_2        
			if(((BeanPropertyDefinition) (beandescription)).getAccessor() == null)
	//*  17   44:aload_2         
	//*  18   45:invokevirtual   #548 <Method AnnotatedMember BeanPropertyDefinition.getAccessor()>
	//*  19   48:ifnonnull       61
			{
				iterator.remove();
	//   20   51:aload           6
	//   21   53:invokeinterface #524 <Method void Iterator.remove()>
			} else
	//*  22   58:goto            23
			{
				Class class1 = ((BeanPropertyDefinition) (beandescription)).getRawPrimaryType();
	//   23   61:aload_2         
	//   24   62:invokevirtual   #637 <Method Class BeanPropertyDefinition.getRawPrimaryType()>
	//   25   65:astore          7
				list = ((List) ((Boolean)hashmap.get(((Object) (class1)))));
	//   26   67:aload           5
	//   27   69:aload           7
	//   28   71:invokevirtual   #640 <Method Object HashMap.get(Object)>
	//   29   74:checkcast       #642 <Class Boolean>
	//   30   77:astore_3        
				beandescription = ((BeanDescription) (list));
	//   31   78:aload_3         
	//   32   79:astore_2        
				if(list == null)
	//*  33   80:aload_3         
	//*  34   81:ifnonnull       134
				{
					list = ((List) (serializationconfig.getConfigOverride(class1).getIsIgnoredType()));
	//   35   84:aload_1         
	//   36   85:aload           7
	//   37   87:invokevirtual   #646 <Method ConfigOverride SerializationConfig.getConfigOverride(Class)>
	//   38   90:invokevirtual   #652 <Method Boolean ConfigOverride.getIsIgnoredType()>
	//   39   93:astore_3        
					beandescription = ((BeanDescription) (list));
	//   40   94:aload_3         
	//   41   95:astore_2        
					if(list == null)
	//*  42   96:aload_3         
	//*  43   97:ifnonnull       125
					{
						list = ((List) (annotationintrospector.isIgnorableType(serializationconfig.introspectClassAnnotations(class1).getClassInfo())));
	//   44  100:aload           4
	//   45  102:aload_1         
	//   46  103:aload           7
	//   47  105:invokevirtual   #656 <Method BeanDescription SerializationConfig.introspectClassAnnotations(Class)>
	//   48  108:invokevirtual   #217 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   49  111:invokevirtual   #660 <Method Boolean AnnotationIntrospector.isIgnorableType(com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   50  114:astore_3        
						beandescription = ((BeanDescription) (list));
	//   51  115:aload_3         
	//   52  116:astore_2        
						if(list == null)
	//*  53  117:aload_3         
	//*  54  118:ifnonnull       125
							beandescription = ((BeanDescription) (Boolean.FALSE));
	//   55  121:getstatic       #664 <Field Boolean Boolean.FALSE>
	//   56  124:astore_2        
					}
					hashmap.put(((Object) (class1)), ((Object) (beandescription)));
	//   57  125:aload           5
	//   58  127:aload           7
	//   59  129:aload_2         
	//   60  130:invokevirtual   #668 <Method Object HashMap.put(Object, Object)>
	//   61  133:pop             
				}
				if(((Boolean) (beandescription)).booleanValue())
	//*  62  134:aload_2         
	//*  63  135:invokevirtual   #671 <Method boolean Boolean.booleanValue()>
	//*  64  138:ifeq            23
					iterator.remove();
	//   65  141:aload           6
	//   66  143:invokeinterface #524 <Method void Iterator.remove()>
			}
		} while(true);
	//   67  148:goto            23
	//   68  151:return          
	}

	protected List removeOverlappingTypeIds(SerializerProvider serializerprovider, BeanDescription beandescription, BeanSerializerBuilder beanserializerbuilder, List list)
	{
		int j = list.size();
	//    0    0:aload           4
	//    1    2:invokeinterface #378 <Method int List.size()>
	//    2    7:istore          6
label0:
		for(int i = 0; i < j; i++)
	//*   3    9:iconst_0        
	//*   4   10:istore          5
	//*   5   12:iload           5
	//*   6   14:iload           6
	//*   7   16:icmpge          119
		{
			serializerprovider = ((SerializerProvider) ((BeanPropertyWriter)list.get(i)));
	//    8   19:aload           4
	//    9   21:iload           5
	//   10   23:invokeinterface #382 <Method Object List.get(int)>
	//   11   28:checkcast       #384 <Class BeanPropertyWriter>
	//   12   31:astore_1        
			beandescription = ((BeanDescription) (((BeanPropertyWriter) (serializerprovider)).getTypeSerializer()));
	//   13   32:aload_1         
	//   14   33:invokevirtual   #676 <Method TypeSerializer BeanPropertyWriter.getTypeSerializer()>
	//   15   36:astore_2        
			if(beandescription == null || ((TypeSerializer) (beandescription)).getTypeInclusion() != com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY)
	//*  16   37:aload_2         
	//*  17   38:ifnull          110
	//*  18   41:aload_2         
	//*  19   42:invokevirtual   #682 <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As TypeSerializer.getTypeInclusion()>
	//*  20   45:getstatic       #688 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
	//*  21   48:if_acmpeq       54
				continue;
	//   22   51:goto            110
			beandescription = ((BeanDescription) (PropertyName.construct(((TypeSerializer) (beandescription)).getPropertyName())));
	//   23   54:aload_2         
	//   24   55:invokevirtual   #690 <Method String TypeSerializer.getPropertyName()>
	//   25   58:invokestatic    #295 <Method PropertyName PropertyName.construct(String)>
	//   26   61:astore_2        
			beanserializerbuilder = ((BeanSerializerBuilder) (list.iterator()));
	//   27   62:aload           4
	//   28   64:invokeinterface #519 <Method Iterator List.iterator()>
	//   29   69:astore_3        
			BeanPropertyWriter beanpropertywriter;
			do
			{
				if(!((Iterator) (beanserializerbuilder)).hasNext())
					continue label0;
	//   30   70:aload_3         
	//   31   71:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//   32   76:ifeq            110
				beanpropertywriter = (BeanPropertyWriter)((Iterator) (beanserializerbuilder)).next();
	//   33   79:aload_3         
	//   34   80:invokeinterface #127 <Method Object Iterator.next()>
	//   35   85:checkcast       #384 <Class BeanPropertyWriter>
	//   36   88:astore          7
			} while(beanpropertywriter == serializerprovider || !beanpropertywriter.wouldConflictWithName(((PropertyName) (beandescription))));
	//   37   90:aload           7
	//   38   92:aload_1         
	//   39   93:if_acmpeq       70
	//   40   96:aload           7
	//   41   98:aload_2         
	//   42   99:invokevirtual   #694 <Method boolean BeanPropertyWriter.wouldConflictWithName(PropertyName)>
	//   43  102:ifeq            70
			((BeanPropertyWriter) (serializerprovider)).assignTypeSerializer(((TypeSerializer) (null)));
	//   44  105:aload_1         
	//   45  106:aconst_null     
	//   46  107:invokevirtual   #698 <Method void BeanPropertyWriter.assignTypeSerializer(TypeSerializer)>
		}

	//   47  110:iload           5
	//   48  112:iconst_1        
	//   49  113:iadd            
	//   50  114:istore          5
	//*  51  116:goto            12
		return list;
	//   52  119:aload           4
	//   53  121:areturn         
	}

	protected void removeSetterlessGetters(SerializationConfig serializationconfig, BeanDescription beandescription, List list)
	{
		serializationconfig = ((SerializationConfig) (list.iterator()));
	//    0    0:aload_3         
	//    1    1:invokeinterface #519 <Method Iterator List.iterator()>
	//    2    6:astore_1        
		do
		{
			if(!((Iterator) (serializationconfig)).hasNext())
				break;
	//    3    7:aload_1         
	//    4    8:invokeinterface #123 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            49
			beandescription = ((BeanDescription) ((BeanPropertyDefinition)((Iterator) (serializationconfig)).next()));
	//    6   16:aload_1         
	//    7   17:invokeinterface #127 <Method Object Iterator.next()>
	//    8   22:checkcast       #28  <Class BeanPropertyDefinition>
	//    9   25:astore_2        
			if(!((BeanPropertyDefinition) (beandescription)).couldDeserialize() && !((BeanPropertyDefinition) (beandescription)).isExplicitlyIncluded())
	//*  10   26:aload_2         
	//*  11   27:invokevirtual   #702 <Method boolean BeanPropertyDefinition.couldDeserialize()>
	//*  12   30:ifne            7
	//*  13   33:aload_2         
	//*  14   34:invokevirtual   #705 <Method boolean BeanPropertyDefinition.isExplicitlyIncluded()>
	//*  15   37:ifne            7
				((Iterator) (serializationconfig)).remove();
	//   16   40:aload_1         
	//   17   41:invokeinterface #524 <Method void Iterator.remove()>
		} while(true);
	//   18   46:goto            7
	//   19   49:return          
	}

	public SerializerFactory withConfig(SerializerFactoryConfig serializerfactoryconfig)
	{
		if(_factoryConfig == serializerfactoryconfig)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field SerializerFactoryConfig _factoryConfig>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return ((SerializerFactory) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		if(((Object)this).getClass() == com/fasterxml/jackson/databind/ser/BeanSerializerFactory)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #326 <Method Class Object.getClass()>
	//*   8   14:ldc1            #2   <Class BeanSerializerFactory>
	//*   9   16:if_acmpne       28
		{
			return ((SerializerFactory) (new BeanSerializerFactory(serializerfactoryconfig)));
	//   10   19:new             #2   <Class BeanSerializerFactory>
	//   11   22:dup             
	//   12   23:aload_1         
	//   13   24:invokespecial   #18  <Method void BeanSerializerFactory(SerializerFactoryConfig)>
	//   14   27:areturn         
		} else
		{
			serializerfactoryconfig = ((SerializerFactoryConfig) (new StringBuilder()));
	//   15   28:new             #414 <Class StringBuilder>
	//   16   31:dup             
	//   17   32:invokespecial   #415 <Method void StringBuilder()>
	//   18   35:astore_1        
			((StringBuilder) (serializerfactoryconfig)).append("Subtype of BeanSerializerFactory (");
	//   19   36:aload_1         
	//   20   37:ldc2            #709 <String "Subtype of BeanSerializerFactory (">
	//   21   40:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			((StringBuilder) (serializerfactoryconfig)).append(((Object)this).getClass().getName());
	//   23   44:aload_1         
	//   24   45:aload_0         
	//   25   46:invokevirtual   #326 <Method Class Object.getClass()>
	//   26   49:invokevirtual   #329 <Method String Class.getName()>
	//   27   52:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   28   55:pop             
			((StringBuilder) (serializerfactoryconfig)).append(") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with ");
	//   29   56:aload_1         
	//   30   57:ldc2            #711 <String ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with ">
	//   31   60:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
			((StringBuilder) (serializerfactoryconfig)).append("additional serializer definitions");
	//   33   64:aload_1         
	//   34   65:ldc2            #713 <String "additional serializer definitions">
	//   35   68:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
			throw new IllegalStateException(((StringBuilder) (serializerfactoryconfig)).toString());
	//   37   72:new             #715 <Class IllegalStateException>
	//   38   75:dup             
	//   39   76:aload_1         
	//   40   77:invokevirtual   #430 <Method String StringBuilder.toString()>
	//   41   80:invokespecial   #716 <Method void IllegalStateException(String)>
	//   42   83:athrow          
		}
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
