// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.*;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			POJOPropertiesCollector, BeanPropertyDefinition, AnnotatedMember, AnnotatedMethod, 
//			AnnotatedWithParams, AnnotatedClass, AnnotatedConstructor, ObjectIdInfo, 
//			AnnotatedParameter

public class BasicBeanDescription extends BeanDescription
{

	protected BasicBeanDescription(MapperConfig mapperconfig, JavaType javatype, AnnotatedClass annotatedclass, List list)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		super(javatype);
	//    2    3:aload_0         
	//    3    4:aload_2         
	//    4    5:invokespecial   #25  <Method void BeanDescription(JavaType)>
		_propCollector = null;
	//    5    8:aload_0         
	//    6    9:aconst_null     
	//    7   10:putfield        #27  <Field POJOPropertiesCollector _propCollector>
		_config = mapperconfig;
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:putfield        #29  <Field MapperConfig _config>
		if(_config == null)
	//*  11   18:aload_0         
	//*  12   19:getfield        #29  <Field MapperConfig _config>
	//*  13   22:ifnonnull       45
			mapperconfig = ((MapperConfig) (obj));
	//   14   25:aload           5
	//   15   27:astore_1        
		else
	//*  16   28:aload_0         
	//*  17   29:aload_1         
	//*  18   30:putfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*  19   33:aload_0         
	//*  20   34:aload_3         
	//*  21   35:putfield        #33  <Field AnnotatedClass _classInfo>
	//*  22   38:aload_0         
	//*  23   39:aload           4
	//*  24   41:putfield        #35  <Field List _properties>
	//*  25   44:return          
			mapperconfig = ((MapperConfig) (_config.getAnnotationIntrospector()));
	//   26   45:aload_0         
	//   27   46:getfield        #29  <Field MapperConfig _config>
	//   28   49:invokevirtual   #41  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   29   52:astore_1        
		_annotationIntrospector = ((AnnotationIntrospector) (mapperconfig));
		_classInfo = annotatedclass;
		_properties = list;
	//*  30   53:goto            28
	}

	protected BasicBeanDescription(POJOPropertiesCollector pojopropertiescollector)
	{
		this(pojopropertiescollector, pojopropertiescollector.getType(), pojopropertiescollector.getClassDef());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #51  <Method JavaType POJOPropertiesCollector.getType()>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #55  <Method AnnotatedClass POJOPropertiesCollector.getClassDef()>
	//    6   10:invokespecial   #58  <Method void BasicBeanDescription(POJOPropertiesCollector, JavaType, AnnotatedClass)>
		_objectIdInfo = pojopropertiescollector.getObjectIdInfo();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #62  <Method ObjectIdInfo POJOPropertiesCollector.getObjectIdInfo()>
	//   10   18:putfield        #64  <Field ObjectIdInfo _objectIdInfo>
	//   11   21:return          
	}

	protected BasicBeanDescription(POJOPropertiesCollector pojopropertiescollector, JavaType javatype, AnnotatedClass annotatedclass)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #25  <Method void BeanDescription(JavaType)>
		_propCollector = pojopropertiescollector;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #27  <Field POJOPropertiesCollector _propCollector>
		_config = pojopropertiescollector.getConfig();
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #68  <Method MapperConfig POJOPropertiesCollector.getConfig()>
	//    9   15:putfield        #29  <Field MapperConfig _config>
		if(_config == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #29  <Field MapperConfig _config>
	//*  12   22:ifnonnull       38
			pojopropertiescollector = null;
	//   13   25:aconst_null     
	//   14   26:astore_1        
		else
	//*  15   27:aload_0         
	//*  16   28:aload_1         
	//*  17   29:putfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*  18   32:aload_0         
	//*  19   33:aload_3         
	//*  20   34:putfield        #33  <Field AnnotatedClass _classInfo>
	//*  21   37:return          
			pojopropertiescollector = ((POJOPropertiesCollector) (_config.getAnnotationIntrospector()));
	//   22   38:aload_0         
	//   23   39:getfield        #29  <Field MapperConfig _config>
	//   24   42:invokevirtual   #41  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   25   45:astore_1        
		_annotationIntrospector = ((AnnotationIntrospector) (pojopropertiescollector));
		_classInfo = annotatedclass;
	//*  26   46:goto            27
	}

	public static BasicBeanDescription forDeserialization(POJOPropertiesCollector pojopropertiescollector)
	{
		return new BasicBeanDescription(pojopropertiescollector);
	//    0    0:new             #2   <Class BasicBeanDescription>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #72  <Method void BasicBeanDescription(POJOPropertiesCollector)>
	//    4    8:areturn         
	}

	public static BasicBeanDescription forOtherUse(MapperConfig mapperconfig, JavaType javatype, AnnotatedClass annotatedclass)
	{
		return new BasicBeanDescription(mapperconfig, javatype, annotatedclass, Collections.emptyList());
	//    0    0:new             #2   <Class BasicBeanDescription>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokestatic    #80  <Method List Collections.emptyList()>
	//    6   10:invokespecial   #82  <Method void BasicBeanDescription(MapperConfig, JavaType, AnnotatedClass, List)>
	//    7   13:areturn         
	}

	public static BasicBeanDescription forSerialization(POJOPropertiesCollector pojopropertiescollector)
	{
		return new BasicBeanDescription(pojopropertiescollector);
	//    0    0:new             #2   <Class BasicBeanDescription>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #72  <Method void BasicBeanDescription(POJOPropertiesCollector)>
	//    4    8:areturn         
	}

	public Converter _createConverter(Object obj)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(obj == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		if(obj instanceof Converter)
	//*   6    8:aload_1         
	//*   7    9:instanceof      #88  <Class Converter>
	//*   8   12:ifeq            20
			return (Converter)obj;
	//    9   15:aload_1         
	//   10   16:checkcast       #88  <Class Converter>
	//   11   19:areturn         
		if(!(obj instanceof Class))
	//*  12   20:aload_1         
	//*  13   21:instanceof      #90  <Class Class>
	//*  14   24:ifne            65
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Converter definition of type ").append(obj.getClass().getName()).append("; expected type Converter or Class<Converter> instead").toString());
	//   15   27:new             #92  <Class IllegalStateException>
	//   16   30:dup             
	//   17   31:new             #94  <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #97  <Method void StringBuilder()>
	//   20   38:ldc1            #99  <String "AnnotationIntrospector returned Converter definition of type ">
	//   21   40:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:aload_1         
	//   23   44:invokevirtual   #109 <Method Class Object.getClass()>
	//   24   47:invokevirtual   #113 <Method String Class.getName()>
	//   25   50:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:ldc1            #115 <String "; expected type Converter or Class<Converter> instead">
	//   27   55:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   28   58:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   29   61:invokespecial   #121 <Method void IllegalStateException(String)>
	//   30   64:athrow          
		Class class1 = (Class)obj;
	//   31   65:aload_1         
	//   32   66:checkcast       #90  <Class Class>
	//   33   69:astore_3        
		if(class1 == com/fasterxml/jackson/databind/util/Converter$None || ClassUtil.isBogusClass(class1))
	//*  34   70:aload_3         
	//*  35   71:ldc1            #123 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//*  36   73:if_acmpeq       83
	//*  37   76:aload_3         
	//*  38   77:invokestatic    #129 <Method boolean ClassUtil.isBogusClass(Class)>
	//*  39   80:ifeq            85
			return null;
	//   40   83:aconst_null     
	//   41   84:areturn         
		if(!((Class) (com/fasterxml/jackson/databind/util/Converter)).isAssignableFrom(class1))
	//*  42   85:ldc1            #88  <Class Converter>
	//*  43   87:aload_3         
	//*  44   88:invokevirtual   #132 <Method boolean Class.isAssignableFrom(Class)>
	//*  45   91:ifne            129
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(class1.getName()).append("; expected Class<Converter>").toString());
	//   46   94:new             #92  <Class IllegalStateException>
	//   47   97:dup             
	//   48   98:new             #94  <Class StringBuilder>
	//   49  101:dup             
	//   50  102:invokespecial   #97  <Method void StringBuilder()>
	//   51  105:ldc1            #134 <String "AnnotationIntrospector returned Class ">
	//   52  107:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   53  110:aload_3         
	//   54  111:invokevirtual   #113 <Method String Class.getName()>
	//   55  114:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   56  117:ldc1            #136 <String "; expected Class<Converter>">
	//   57  119:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   58  122:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   59  125:invokespecial   #121 <Method void IllegalStateException(String)>
	//   60  128:athrow          
		obj = ((Object) (_config.getHandlerInstantiator()));
	//   61  129:aload_0         
	//   62  130:getfield        #29  <Field MapperConfig _config>
	//   63  133:invokevirtual   #140 <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//   64  136:astore_1        
		if(obj == null)
	//*  65  137:aload_1         
	//*  66  138:ifnonnull       166
			obj = obj1;
	//   67  141:aload_2         
	//   68  142:astore_1        
		else
	//*  69  143:aload_1         
	//*  70  144:astore_2        
	//*  71  145:aload_1         
	//*  72  146:ifnonnull       164
	//*  73  149:aload_3         
	//*  74  150:aload_0         
	//*  75  151:getfield        #29  <Field MapperConfig _config>
	//*  76  154:invokevirtual   #144 <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//*  77  157:invokestatic    #148 <Method Object ClassUtil.createInstance(Class, boolean)>
	//*  78  160:checkcast       #88  <Class Converter>
	//*  79  163:astore_2        
	//*  80  164:aload_2         
	//*  81  165:areturn         
			obj = ((Object) (((HandlerInstantiator) (obj)).converterInstance(_config, ((Annotated) (_classInfo)), class1)));
	//   82  166:aload_1         
	//   83  167:aload_0         
	//   84  168:getfield        #29  <Field MapperConfig _config>
	//   85  171:aload_0         
	//   86  172:getfield        #33  <Field AnnotatedClass _classInfo>
	//   87  175:aload_3         
	//   88  176:invokevirtual   #154 <Method Converter HandlerInstantiator.converterInstance(MapperConfig, Annotated, Class)>
	//   89  179:astore_1        
		obj1 = obj;
		if(obj == null)
			obj1 = ((Object) ((Converter)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers())));
		return ((Converter) (obj1));
	//*  90  180:goto            143
	}

	protected PropertyName _findCreatorPropertyName(AnnotatedParameter annotatedparameter)
	{
		PropertyName propertyname;
label0:
		{
			PropertyName propertyname1 = _annotationIntrospector.findNameForDeserialization(((Annotated) (annotatedparameter)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #163 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//    4    8:astore_3        
			if(propertyname1 != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          22
			{
				propertyname = propertyname1;
	//    7   13:aload_3         
	//    8   14:astore_2        
				if(!propertyname1.isEmpty())
					break label0;
	//    9   15:aload_3         
	//   10   16:invokevirtual   #168 <Method boolean PropertyName.isEmpty()>
	//   11   19:ifeq            51
			}
			annotatedparameter = ((AnnotatedParameter) (_annotationIntrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedparameter)))));
	//   12   22:aload_0         
	//   13   23:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #172 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//   16   30:astore_1        
			propertyname = propertyname1;
	//   17   31:aload_3         
	//   18   32:astore_2        
			if(annotatedparameter != null)
	//*  19   33:aload_1         
	//*  20   34:ifnull          51
			{
				propertyname = propertyname1;
	//   21   37:aload_3         
	//   22   38:astore_2        
				if(!((String) (annotatedparameter)).isEmpty())
	//*  23   39:aload_1         
	//*  24   40:invokevirtual   #175 <Method boolean String.isEmpty()>
	//*  25   43:ifne            51
					propertyname = PropertyName.construct(((String) (annotatedparameter)));
	//   26   46:aload_1         
	//   27   47:invokestatic    #179 <Method PropertyName PropertyName.construct(String)>
	//   28   50:astore_2        
			}
		}
		return propertyname;
	//   29   51:aload_2         
	//   30   52:areturn         
	}

	public LinkedHashMap _findPropertyFields(Collection collection, boolean flag)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #184 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #185 <Method void LinkedHashMap()>
	//    3    7:astore_3        
		Iterator iterator = _properties().iterator();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #187 <Method List _properties()>
	//    6   12:invokeinterface #193 <Method Iterator List.iterator()>
	//    7   17:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   19:aload           4
	//    9   21:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            87
			Object obj = ((Object) ((BeanPropertyDefinition)iterator.next()));
	//   11   29:aload           4
	//   12   31:invokeinterface #202 <Method Object Iterator.next()>
	//   13   36:checkcast       #204 <Class BeanPropertyDefinition>
	//   14   39:astore          6
			AnnotatedField annotatedfield = ((BeanPropertyDefinition) (obj)).getField();
	//   15   41:aload           6
	//   16   43:invokevirtual   #208 <Method AnnotatedField BeanPropertyDefinition.getField()>
	//   17   46:astore          5
			if(annotatedfield != null)
	//*  18   48:aload           5
	//*  19   50:ifnull          19
			{
				obj = ((Object) (((BeanPropertyDefinition) (obj)).getName()));
	//   20   53:aload           6
	//   21   55:invokevirtual   #209 <Method String BeanPropertyDefinition.getName()>
	//   22   58:astore          6
				if(collection == null || !collection.contains(obj))
	//*  23   60:aload_1         
	//*  24   61:ifnull          75
	//*  25   64:aload_1         
	//*  26   65:aload           6
	//*  27   67:invokeinterface #215 <Method boolean Collection.contains(Object)>
	//*  28   72:ifne            19
					linkedhashmap.put(obj, ((Object) (annotatedfield)));
	//   29   75:aload_3         
	//   30   76:aload           6
	//   31   78:aload           5
	//   32   80:invokevirtual   #219 <Method Object LinkedHashMap.put(Object, Object)>
	//   33   83:pop             
			}
		} while(true);
	//   34   84:goto            19
		return linkedhashmap;
	//   35   87:aload_3         
	//   36   88:areturn         
	}

	protected List _properties()
	{
		if(_properties == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field List _properties>
	//*   2    4:ifnonnull       18
			_properties = _propCollector.getProperties();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//    6   12:invokevirtual   #224 <Method List POJOPropertiesCollector.getProperties()>
	//    7   15:putfield        #35  <Field List _properties>
		return _properties;
	//    8   18:aload_0         
	//    9   19:getfield        #35  <Field List _properties>
	//   10   22:areturn         
	}

	public boolean addProperty(BeanPropertyDefinition beanpropertydefinition)
	{
		if(hasProperty(beanpropertydefinition.getFullName()))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #231 <Method PropertyName BeanPropertyDefinition.getFullName()>
	//*   3    5:invokevirtual   #235 <Method boolean hasProperty(PropertyName)>
	//*   4    8:ifeq            13
		{
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		} else
		{
			_properties().add(((Object) (beanpropertydefinition)));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #187 <Method List _properties()>
	//    9   17:aload_1         
	//   10   18:invokeinterface #238 <Method boolean List.add(Object)>
	//   11   23:pop             
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		}
	}

	public TypeBindings bindingsForBeanType()
	{
		return _type.getBindings();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field JavaType _type>
	//    2    4:invokevirtual   #249 <Method TypeBindings JavaType.getBindings()>
	//    3    7:areturn         
	}

	public AnnotatedMember findAnyGetter()
		throws IllegalArgumentException
	{
		AnnotatedMember annotatedmember;
		if(_propCollector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//*   2    4:ifnonnull       62
			annotatedmember = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:aload_1         
	//*   6   10:ifnull          73
	//*   7   13:ldc1            #255 <Class Map>
	//*   8   15:aload_1         
	//*   9   16:invokevirtual   #260 <Method Class AnnotatedMember.getRawType()>
	//*  10   19:invokevirtual   #132 <Method boolean Class.isAssignableFrom(Class)>
	//*  11   22:ifne            73
	//*  12   25:new             #253 <Class IllegalArgumentException>
	//*  13   28:dup             
	//*  14   29:new             #94  <Class StringBuilder>
	//*  15   32:dup             
	//*  16   33:invokespecial   #97  <Method void StringBuilder()>
	//*  17   36:ldc2            #262 <String "Invalid 'any-getter' annotation on method ">
	//*  18   39:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  19   42:aload_1         
	//*  20   43:invokevirtual   #263 <Method String AnnotatedMember.getName()>
	//*  21   46:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  22   49:ldc2            #265 <String "(): return type is not instance of java.util.Map">
	//*  23   52:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  24   55:invokevirtual   #118 <Method String StringBuilder.toString()>
	//*  25   58:invokespecial   #266 <Method void IllegalArgumentException(String)>
	//*  26   61:athrow          
			annotatedmember = _propCollector.getAnyGetter();
	//   27   62:aload_0         
	//   28   63:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//   29   66:invokevirtual   #269 <Method AnnotatedMember POJOPropertiesCollector.getAnyGetter()>
	//   30   69:astore_1        
		if(annotatedmember != null && !((Class) (java/util/Map)).isAssignableFrom(annotatedmember.getRawType()))
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid 'any-getter' annotation on method ").append(annotatedmember.getName()).append("(): return type is not instance of java.util.Map").toString());
		else
	//*  31   70:goto            9
			return annotatedmember;
	//   32   73:aload_1         
	//   33   74:areturn         
	}

	public AnnotatedMethod findAnySetter()
		throws IllegalArgumentException
	{
		AnnotatedMethod annotatedmethod;
		if(_propCollector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//*   2    4:ifnonnull       75
			annotatedmethod = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:aload_1         
	//*   6   10:ifnull          86
	//*   7   13:aload_1         
	//*   8   14:iconst_0        
	//*   9   15:invokevirtual   #278 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//*  10   18:astore_2        
	//*  11   19:aload_2         
	//*  12   20:ldc1            #174 <Class String>
	//*  13   22:if_acmpeq       86
	//*  14   25:aload_2         
	//*  15   26:ldc1            #105 <Class Object>
	//*  16   28:if_acmpeq       86
	//*  17   31:new             #253 <Class IllegalArgumentException>
	//*  18   34:dup             
	//*  19   35:new             #94  <Class StringBuilder>
	//*  20   38:dup             
	//*  21   39:invokespecial   #97  <Method void StringBuilder()>
	//*  22   42:ldc2            #280 <String "Invalid 'any-setter' annotation on method ">
	//*  23   45:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  24   48:aload_1         
	//*  25   49:invokevirtual   #281 <Method String AnnotatedMethod.getName()>
	//*  26   52:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  27   55:ldc2            #283 <String "(): first argument not of type String or Object, but ">
	//*  28   58:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  29   61:aload_2         
	//*  30   62:invokevirtual   #113 <Method String Class.getName()>
	//*  31   65:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//*  32   68:invokevirtual   #118 <Method String StringBuilder.toString()>
	//*  33   71:invokespecial   #266 <Method void IllegalArgumentException(String)>
	//*  34   74:athrow          
			annotatedmethod = _propCollector.getAnySetterMethod();
	//   35   75:aload_0         
	//   36   76:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//   37   79:invokevirtual   #286 <Method AnnotatedMethod POJOPropertiesCollector.getAnySetterMethod()>
	//   38   82:astore_1        
		if(annotatedmethod != null)
		{
			Class class1 = annotatedmethod.getRawParameterType(0);
			if(class1 != java/lang/String && class1 != java/lang/Object)
				throw new IllegalArgumentException((new StringBuilder()).append("Invalid 'any-setter' annotation on method ").append(annotatedmethod.getName()).append("(): first argument not of type String or Object, but ").append(class1.getName()).toString());
		}
	//*  39   83:goto            9
		return annotatedmethod;
	//   40   86:aload_1         
	//   41   87:areturn         
	}

	public Map findBackReferenceProperties()
	{
		HashMap hashmap = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		for(Iterator iterator = _properties().iterator(); iterator.hasNext();)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #187 <Method List _properties()>
	//*   4    6:invokeinterface #193 <Method Iterator List.iterator()>
	//*   5   11:astore_3        
	//*   6   12:aload_3         
	//*   7   13:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            133
		{
			AnnotatedMember annotatedmember = ((BeanPropertyDefinition)iterator.next()).getMutator();
	//    9   21:aload_3         
	//   10   22:invokeinterface #202 <Method Object Iterator.next()>
	//   11   27:checkcast       #204 <Class BeanPropertyDefinition>
	//   12   30:invokevirtual   #291 <Method AnnotatedMember BeanPropertyDefinition.getMutator()>
	//   13   33:astore          4
			if(annotatedmember != null)
	//*  14   35:aload           4
	//*  15   37:ifnull          12
			{
				Object obj = ((Object) (_annotationIntrospector.findReferenceType(annotatedmember)));
	//   16   40:aload_0         
	//   17   41:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//   18   44:aload           4
	//   19   46:invokevirtual   #295 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty AnnotationIntrospector.findReferenceType(AnnotatedMember)>
	//   20   49:astore          5
				if(obj != null && ((com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty) (obj)).isBackReference())
	//*  21   51:aload           5
	//*  22   53:ifnull          12
	//*  23   56:aload           5
	//*  24   58:invokevirtual   #300 <Method boolean com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.isBackReference()>
	//*  25   61:ifeq            12
				{
					HashMap hashmap1 = hashmap;
	//   26   64:aload_1         
	//   27   65:astore_2        
					if(hashmap == null)
	//*  28   66:aload_1         
	//*  29   67:ifnonnull       78
						hashmap1 = new HashMap();
	//   30   70:new             #302 <Class HashMap>
	//   31   73:dup             
	//   32   74:invokespecial   #303 <Method void HashMap()>
	//   33   77:astore_2        
					obj = ((Object) (((com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty) (obj)).getName()));
	//   34   78:aload           5
	//   35   80:invokevirtual   #304 <Method String com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.getName()>
	//   36   83:astore          5
					hashmap = hashmap1;
	//   37   85:aload_2         
	//   38   86:astore_1        
					if(hashmap1.put(obj, ((Object) (annotatedmember))) != null)
	//*  39   87:aload_2         
	//*  40   88:aload           5
	//*  41   90:aload           4
	//*  42   92:invokevirtual   #305 <Method Object HashMap.put(Object, Object)>
	//*  43   95:ifnull          12
						throw new IllegalArgumentException((new StringBuilder()).append("Multiple back-reference properties with name '").append(((String) (obj))).append("'").toString());
	//   44   98:new             #253 <Class IllegalArgumentException>
	//   45  101:dup             
	//   46  102:new             #94  <Class StringBuilder>
	//   47  105:dup             
	//   48  106:invokespecial   #97  <Method void StringBuilder()>
	//   49  109:ldc2            #307 <String "Multiple back-reference properties with name '">
	//   50  112:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   51  115:aload           5
	//   52  117:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   53  120:ldc2            #309 <String "'">
	//   54  123:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   55  126:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   56  129:invokespecial   #266 <Method void IllegalArgumentException(String)>
	//   57  132:athrow          
				}
			}
		}

		return ((Map) (hashmap));
	//   58  133:aload_1         
	//   59  134:areturn         
	}

	public String findClassDescription()
	{
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _annotationIntrospector.findClassDescription(_classInfo);
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field AnnotatedClass _classInfo>
	//    9   17:invokevirtual   #314 <Method String AnnotationIntrospector.findClassDescription(AnnotatedClass)>
	//   10   20:areturn         
	}

	public List findCreatorParameterNames()
	{
		Object obj;
label0:
		{
			int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
			do
			{
				if(i >= 2)
					break;
	//    2    2:iload_1         
	//    3    3:iconst_2        
	//    4    4:icmpge          147
				Iterator iterator;
				if(i == 0)
	//*   5    7:iload_1         
	//*   6    8:ifne            132
					obj = ((Object) (getConstructors()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #318 <Method List getConstructors()>
	//    9   15:astore_3        
				else
	//*  10   16:aload_3         
	//*  11   17:invokeinterface #193 <Method Iterator List.iterator()>
	//*  12   22:astore          4
	//*  13   24:aload           4
	//*  14   26:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//*  15   31:ifeq            140
	//*  16   34:aload           4
	//*  17   36:invokeinterface #202 <Method Object Iterator.next()>
	//*  18   41:checkcast       #320 <Class AnnotatedWithParams>
	//*  19   44:astore          5
	//*  20   46:aload           5
	//*  21   48:invokevirtual   #324 <Method int AnnotatedWithParams.getParameterCount()>
	//*  22   51:istore_2        
	//*  23   52:iload_2         
	//*  24   53:iconst_1        
	//*  25   54:icmplt          24
	//*  26   57:aload_0         
	//*  27   58:aload           5
	//*  28   60:iconst_0        
	//*  29   61:invokevirtual   #328 <Method AnnotatedParameter AnnotatedWithParams.getParameter(int)>
	//*  30   64:invokevirtual   #330 <Method PropertyName _findCreatorPropertyName(AnnotatedParameter)>
	//*  31   67:astore_3        
	//*  32   68:aload_3         
	//*  33   69:ifnull          24
	//*  34   72:aload_3         
	//*  35   73:invokevirtual   #168 <Method boolean PropertyName.isEmpty()>
	//*  36   76:ifne            24
	//*  37   79:new             #332 <Class ArrayList>
	//*  38   82:dup             
	//*  39   83:invokespecial   #333 <Method void ArrayList()>
	//*  40   86:astore          4
	//*  41   88:aload           4
	//*  42   90:aload_3         
	//*  43   91:invokeinterface #238 <Method boolean List.add(Object)>
	//*  44   96:pop             
	//*  45   97:iconst_1        
	//*  46   98:istore_1        
	//*  47   99:aload           4
	//*  48  101:astore_3        
	//*  49  102:iload_1         
	//*  50  103:iload_2         
	//*  51  104:icmpge          151
	//*  52  107:aload           4
	//*  53  109:aload_0         
	//*  54  110:aload           5
	//*  55  112:iload_1         
	//*  56  113:invokevirtual   #328 <Method AnnotatedParameter AnnotatedWithParams.getParameter(int)>
	//*  57  116:invokevirtual   #330 <Method PropertyName _findCreatorPropertyName(AnnotatedParameter)>
	//*  58  119:invokeinterface #238 <Method boolean List.add(Object)>
	//*  59  124:pop             
	//*  60  125:iload_1         
	//*  61  126:iconst_1        
	//*  62  127:iadd            
	//*  63  128:istore_1        
	//*  64  129:goto            99
					obj = ((Object) (getFactoryMethods()));
	//   65  132:aload_0         
	//   66  133:invokevirtual   #336 <Method List getFactoryMethods()>
	//   67  136:astore_3        
				for(iterator = ((List) (obj)).iterator(); iterator.hasNext();)
				{
					AnnotatedWithParams annotatedwithparams = (AnnotatedWithParams)iterator.next();
					int j = annotatedwithparams.getParameterCount();
					if(j >= 1)
					{
						obj = ((Object) (_findCreatorPropertyName(annotatedwithparams.getParameter(0))));
						if(obj != null && !((PropertyName) (obj)).isEmpty())
						{
							ArrayList arraylist = new ArrayList();
							((List) (arraylist)).add(obj);
							i = 1;
							do
							{
								obj = ((Object) (arraylist));
								if(i >= j)
									break;
								((List) (arraylist)).add(((Object) (_findCreatorPropertyName(annotatedwithparams.getParameter(i)))));
								i++;
							} while(true);
							break label0;
						}
					}
				}

	//*  68  137:goto            16
				i++;
	//   69  140:iload_1         
	//   70  141:iconst_1        
	//   71  142:iadd            
	//   72  143:istore_1        
			} while(true);
	//   73  144:goto            2
			obj = ((Object) (Collections.emptyList()));
	//   74  147:invokestatic    #80  <Method List Collections.emptyList()>
	//   75  150:astore_3        
		}
		return ((List) (obj));
	//   76  151:aload_3         
	//   77  152:areturn         
	}

	public List findCreatorPropertyNames()
	{
		Object obj = ((Object) (findCreatorParameterNames()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #340 <Method List findCreatorParameterNames()>
	//    2    4:astore_1        
		if(!((List) (obj)).isEmpty()) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:invokeinterface #341 <Method boolean List.isEmpty()>
	//    5   11:ifeq            20
_L1:
		obj = ((Object) (Collections.emptyList()));
	//    6   14:invokestatic    #80  <Method List Collections.emptyList()>
	//    7   17:astore_1        
_L4:
		return ((List) (obj));
	//    8   18:aload_1         
	//    9   19:areturn         
_L2:
		ArrayList arraylist = new ArrayList(((List) (obj)).size());
	//   10   20:new             #332 <Class ArrayList>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokeinterface #344 <Method int List.size()>
	//   14   30:invokespecial   #347 <Method void ArrayList(int)>
	//   15   33:astore_2        
		Iterator iterator = ((List) (obj)).iterator();
	//   16   34:aload_1         
	//   17   35:invokeinterface #193 <Method Iterator List.iterator()>
	//   18   40:astore_3        
		do
		{
			obj = ((Object) (arraylist));
	//   19   41:aload_2         
	//   20   42:astore_1        
			if(!iterator.hasNext())
				continue;
	//   21   43:aload_3         
	//   22   44:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//   23   49:ifeq            18
			((List) (arraylist)).add(((Object) (((PropertyName)iterator.next()).getSimpleName())));
	//   24   52:aload_2         
	//   25   53:aload_3         
	//   26   54:invokeinterface #202 <Method Object Iterator.next()>
	//   27   59:checkcast       #165 <Class PropertyName>
	//   28   62:invokevirtual   #350 <Method String PropertyName.getSimpleName()>
	//   29   65:invokeinterface #238 <Method boolean List.add(Object)>
	//   30   70:pop             
		} while(true);
	//   31   71:goto            41
		if(true) goto _L4; else goto _L3
_L3:
	}

	public AnnotatedConstructor findDefaultConstructor()
	{
		return _classInfo.getDefaultConstructor();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #358 <Method AnnotatedConstructor AnnotatedClass.getDefaultConstructor()>
	//    3    7:areturn         
	}

	public Converter findDeserializationConverter()
	{
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _createConverter(_annotationIntrospector.findDeserializationConverter(((Annotated) (_classInfo))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//    8   14:aload_0         
	//    9   15:getfield        #33  <Field AnnotatedClass _classInfo>
	//   10   18:invokevirtual   #363 <Method Object AnnotationIntrospector.findDeserializationConverter(Annotated)>
	//   11   21:invokevirtual   #365 <Method Converter _createConverter(Object)>
	//   12   24:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value value)
	{
		if(_annotationIntrospector != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnull          25
		{
			com.fasterxml.jackson.annotation.JsonFormat.Value value1 = _annotationIntrospector.findFormat(((Annotated) (_classInfo)));
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field AnnotatedClass _classInfo>
	//    7   15:invokevirtual   #372 <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
	//    8   18:astore_2        
			if(value1 != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          25
				return value1;
	//   11   23:aload_2         
	//   12   24:areturn         
		}
		return value;
	//   13   25:aload_1         
	//   14   26:areturn         
	}

	public transient Method findFactoryMethod(Class aclass[])
	{
		Iterator iterator = _classInfo.getStaticMethods().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #377 <Method List AnnotatedClass.getStaticMethods()>
	//    3    7:invokeinterface #193 <Method Iterator List.iterator()>
	//    4   12:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   14:aload           4
	//    6   16:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            87
			AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
	//    8   24:aload           4
	//    9   26:invokeinterface #202 <Method Object Iterator.next()>
	//   10   31:checkcast       #274 <Class AnnotatedMethod>
	//   11   34:astore          5
			if(isFactoryMethod(annotatedmethod))
	//*  12   36:aload_0         
	//*  13   37:aload           5
	//*  14   39:invokevirtual   #381 <Method boolean isFactoryMethod(AnnotatedMethod)>
	//*  15   42:ifeq            14
			{
				Class class1 = annotatedmethod.getRawParameterType(0);
	//   16   45:aload           5
	//   17   47:iconst_0        
	//   18   48:invokevirtual   #278 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//   19   51:astore          6
				int j = aclass.length;
	//   20   53:aload_1         
	//   21   54:arraylength     
	//   22   55:istore_3        
				int i = 0;
	//   23   56:iconst_0        
	//   24   57:istore_2        
				while(i < j) 
	//*  25   58:iload_2         
	//*  26   59:iload_3         
	//*  27   60:icmpge          14
				{
					if(class1.isAssignableFrom(aclass[i]))
	//*  28   63:aload           6
	//*  29   65:aload_1         
	//*  30   66:iload_2         
	//*  31   67:aaload          
	//*  32   68:invokevirtual   #132 <Method boolean Class.isAssignableFrom(Class)>
	//*  33   71:ifeq            80
						return annotatedmethod.getAnnotated();
	//   34   74:aload           5
	//   35   76:invokevirtual   #385 <Method Method AnnotatedMethod.getAnnotated()>
	//   36   79:areturn         
					i++;
	//   37   80:iload_2         
	//   38   81:iconst_1        
	//   39   82:iadd            
	//   40   83:istore_2        
				}
			}
		} while(true);
	//   41   84:goto            58
		return null;
	//   42   87:aconst_null     
	//   43   88:areturn         
	}

	public Map findInjectables()
	{
		if(_propCollector != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//*   2    4:ifnull          15
			return _propCollector.getInjectables();
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//    5   11:invokevirtual   #390 <Method Map POJOPropertiesCollector.getInjectables()>
	//    6   14:areturn         
		else
			return Collections.emptyMap();
	//    7   15:invokestatic    #393 <Method Map Collections.emptyMap()>
	//    8   18:areturn         
	}

	public AnnotatedMethod findJsonValueMethod()
	{
		if(_propCollector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _propCollector.getJsonValueMethod();
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//    7   13:invokevirtual   #398 <Method AnnotatedMethod POJOPropertiesCollector.getJsonValueMethod()>
	//    8   16:areturn         
	}

	public AnnotatedMethod findMethod(String s, Class aclass[])
	{
		return _classInfo.findMethod(s, aclass);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #402 <Method AnnotatedMethod AnnotatedClass.findMethod(String, Class[])>
	//    5    9:areturn         
	}

	public Class findPOJOBuilder()
	{
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _annotationIntrospector.findPOJOBuilder(_classInfo);
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field AnnotatedClass _classInfo>
	//    9   17:invokevirtual   #407 <Method Class AnnotationIntrospector.findPOJOBuilder(AnnotatedClass)>
	//   10   20:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig()
	{
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _annotationIntrospector.findPOJOBuilderConfig(_classInfo);
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field AnnotatedClass _classInfo>
	//    9   17:invokevirtual   #413 <Method com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value AnnotationIntrospector.findPOJOBuilderConfig(AnnotatedClass)>
	//   10   20:areturn         
	}

	public List findProperties()
	{
		return _properties();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #187 <Method List _properties()>
	//    2    4:areturn         
	}

	public BeanPropertyDefinition findProperty(PropertyName propertyname)
	{
		for(Iterator iterator = _properties().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #187 <Method List _properties()>
	//*   2    4:invokeinterface #193 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
		{
			BeanPropertyDefinition beanpropertydefinition = (BeanPropertyDefinition)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #202 <Method Object Iterator.next()>
	//    9   25:checkcast       #204 <Class BeanPropertyDefinition>
	//   10   28:astore_3        
			if(beanpropertydefinition.hasName(propertyname))
	//*  11   29:aload_3         
	//*  12   30:aload_1         
	//*  13   31:invokevirtual   #419 <Method boolean BeanPropertyDefinition.hasName(PropertyName)>
	//*  14   34:ifeq            10
				return beanpropertydefinition;
	//   15   37:aload_3         
	//   16   38:areturn         
		}

		return null;
	//   17   39:aconst_null     
	//   18   40:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value findPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		com.fasterxml.jackson.annotation.JsonInclude.Value value1 = value;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(_annotationIntrospector != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*   4    6:ifnull          33
		{
			com.fasterxml.jackson.annotation.JsonInclude.Value value2 = _annotationIntrospector.findPropertyInclusion(((Annotated) (_classInfo)));
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field AnnotatedClass _classInfo>
	//    9   17:invokevirtual   #424 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
	//   10   20:astore_3        
			value1 = value;
	//   11   21:aload_1         
	//   12   22:astore_2        
			if(value2 != null)
	//*  13   23:aload_3         
	//*  14   24:ifnull          33
				value1 = value.withOverrides(value2);
	//   15   27:aload_1         
	//   16   28:aload_3         
	//   17   29:invokevirtual   #429 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   18   32:astore_2        
		}
		return value1;
	//   19   33:aload_2         
	//   20   34:areturn         
	}

	public Converter findSerializationConverter()
	{
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _createConverter(_annotationIntrospector.findSerializationConverter(((Annotated) (_classInfo))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//    8   14:aload_0         
	//    9   15:getfield        #33  <Field AnnotatedClass _classInfo>
	//   10   18:invokevirtual   #432 <Method Object AnnotationIntrospector.findSerializationConverter(Annotated)>
	//   11   21:invokevirtual   #365 <Method Converter _createConverter(Object)>
	//   12   24:areturn         
	}

	public transient Constructor findSingleArgConstructor(Class aclass[])
	{
		Iterator iterator = _classInfo.getConstructors().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #435 <Method List AnnotatedClass.getConstructors()>
	//    3    7:invokeinterface #193 <Method Iterator List.iterator()>
	//    4   12:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   14:aload           4
	//    6   16:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            84
			AnnotatedConstructor annotatedconstructor = (AnnotatedConstructor)iterator.next();
	//    8   24:aload           4
	//    9   26:invokeinterface #202 <Method Object Iterator.next()>
	//   10   31:checkcast       #437 <Class AnnotatedConstructor>
	//   11   34:astore          5
			if(annotatedconstructor.getParameterCount() == 1)
	//*  12   36:aload           5
	//*  13   38:invokevirtual   #438 <Method int AnnotatedConstructor.getParameterCount()>
	//*  14   41:iconst_1        
	//*  15   42:icmpne          14
			{
				Class class1 = annotatedconstructor.getRawParameterType(0);
	//   16   45:aload           5
	//   17   47:iconst_0        
	//   18   48:invokevirtual   #439 <Method Class AnnotatedConstructor.getRawParameterType(int)>
	//   19   51:astore          6
				int j = aclass.length;
	//   20   53:aload_1         
	//   21   54:arraylength     
	//   22   55:istore_3        
				int i = 0;
	//   23   56:iconst_0        
	//   24   57:istore_2        
				while(i < j) 
	//*  25   58:iload_2         
	//*  26   59:iload_3         
	//*  27   60:icmpge          14
				{
					if(aclass[i] == class1)
	//*  28   63:aload_1         
	//*  29   64:iload_2         
	//*  30   65:aaload          
	//*  31   66:aload           6
	//*  32   68:if_acmpne       77
						return annotatedconstructor.getAnnotated();
	//   33   71:aload           5
	//   34   73:invokevirtual   #442 <Method Constructor AnnotatedConstructor.getAnnotated()>
	//   35   76:areturn         
					i++;
	//   36   77:iload_2         
	//   37   78:iconst_1        
	//   38   79:iadd            
	//   39   80:istore_2        
				}
			}
		} while(true);
	//   40   81:goto            58
		return null;
	//   41   84:aconst_null     
	//   42   85:areturn         
	}

	public Annotations getClassAnnotations()
	{
		return _classInfo.getAnnotations();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #448 <Method Annotations AnnotatedClass.getAnnotations()>
	//    3    7:areturn         
	}

	public AnnotatedClass getClassInfo()
	{
		return _classInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:areturn         
	}

	public List getConstructors()
	{
		return _classInfo.getConstructors();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #435 <Method List AnnotatedClass.getConstructors()>
	//    3    7:areturn         
	}

	public List getFactoryMethods()
	{
		Object obj = ((Object) (_classInfo.getStaticMethods()));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #377 <Method List AnnotatedClass.getStaticMethods()>
	//    3    7:astore_2        
		if(((List) (obj)).isEmpty())
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #341 <Method boolean List.isEmpty()>
	//*   6   14:ifeq            19
			return ((List) (obj));
	//    7   17:aload_2         
	//    8   18:areturn         
		ArrayList arraylist = new ArrayList();
	//    9   19:new             #332 <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #333 <Method void ArrayList()>
	//   12   26:astore_1        
		obj = ((Object) (((List) (obj)).iterator()));
	//   13   27:aload_2         
	//   14   28:invokeinterface #193 <Method Iterator List.iterator()>
	//   15   33:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   16   34:aload_2         
	//   17   35:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            70
			AnnotatedMethod annotatedmethod = (AnnotatedMethod)((Iterator) (obj)).next();
	//   19   43:aload_2         
	//   20   44:invokeinterface #202 <Method Object Iterator.next()>
	//   21   49:checkcast       #274 <Class AnnotatedMethod>
	//   22   52:astore_3        
			if(isFactoryMethod(annotatedmethod))
	//*  23   53:aload_0         
	//*  24   54:aload_3         
	//*  25   55:invokevirtual   #381 <Method boolean isFactoryMethod(AnnotatedMethod)>
	//*  26   58:ifeq            34
				arraylist.add(((Object) (annotatedmethod)));
	//   27   61:aload_1         
	//   28   62:aload_3         
	//   29   63:invokevirtual   #451 <Method boolean ArrayList.add(Object)>
	//   30   66:pop             
		} while(true);
	//   31   67:goto            34
		return ((List) (arraylist));
	//   32   70:aload_1         
	//   33   71:areturn         
	}

	public Set getIgnoredPropertyNames()
	{
		Set set;
		Set set1;
		if(_propCollector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//*   2    4:ifnonnull       21
			set = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:aload_1         
	//*   6   10:astore_2        
	//*   7   11:aload_1         
	//*   8   12:ifnonnull       19
	//*   9   15:invokestatic    #457 <Method Set Collections.emptySet()>
	//*  10   18:astore_2        
	//*  11   19:aload_2         
	//*  12   20:areturn         
			set = _propCollector.getIgnoredPropertyNames();
	//   13   21:aload_0         
	//   14   22:getfield        #27  <Field POJOPropertiesCollector _propCollector>
	//   15   25:invokevirtual   #459 <Method Set POJOPropertiesCollector.getIgnoredPropertyNames()>
	//   16   28:astore_1        
		set1 = set;
		if(set == null)
			set1 = Collections.emptySet();
		return set1;
	//*  17   29:goto            9
	}

	public ObjectIdInfo getObjectIdInfo()
	{
		return _objectIdInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ObjectIdInfo _objectIdInfo>
	//    2    4:areturn         
	}

	public boolean hasKnownClassAnnotations()
	{
		return _classInfo.hasAnnotations();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #464 <Method boolean AnnotatedClass.hasAnnotations()>
	//    3    7:ireturn         
	}

	public boolean hasProperty(PropertyName propertyname)
	{
		return findProperty(propertyname) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #466 <Method BeanPropertyDefinition findProperty(PropertyName)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public Object instantiateBean(boolean flag)
	{
		Object obj = ((Object) (_classInfo.getDefaultConstructor()));
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #358 <Method AnnotatedConstructor AnnotatedClass.getDefaultConstructor()>
	//    3    7:astore_2        
		if(obj == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       14
			return ((Object) (null));
	//    6   12:aconst_null     
	//    7   13:areturn         
		if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            32
			((AnnotatedConstructor) (obj)).fixAccess(_config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #29  <Field MapperConfig _config>
	//   13   23:getstatic       #476 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   14   26:invokevirtual   #480 <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//   15   29:invokevirtual   #484 <Method void AnnotatedConstructor.fixAccess(boolean)>
		try
		{
			obj = ((AnnotatedConstructor) (obj)).getAnnotated().newInstance(new Object[0]);
	//   16   32:aload_2         
	//   17   33:invokevirtual   #442 <Method Constructor AnnotatedConstructor.getAnnotated()>
	//   18   36:iconst_0        
	//   19   37:anewarray       Object[]
	//   20   40:invokevirtual   #490 <Method Object Constructor.newInstance(Object[])>
	//   21   43:astore_2        
		}
	//*  22   44:aload_2         
	//*  23   45:areturn         
		catch(Object obj1)
	//*  24   46:astore_2        
		{
			for(; ((Throwable) (obj1)).getCause() != null; obj1 = ((Object) (((Throwable) (obj1)).getCause())));
	//   25   47:aload_2         
	//   26   48:invokevirtual   #496 <Method Throwable Throwable.getCause()>
	//   27   51:ifnull          62
	//   28   54:aload_2         
	//   29   55:invokevirtual   #496 <Method Throwable Throwable.getCause()>
	//   30   58:astore_2        
	//*  31   59:goto            47
			if(obj1 instanceof Error)
	//*  32   62:aload_2         
	//*  33   63:instanceof      #498 <Class Error>
	//*  34   66:ifeq            74
				throw (Error)obj1;
	//   35   69:aload_2         
	//   36   70:checkcast       #498 <Class Error>
	//   37   73:athrow          
			if(obj1 instanceof RuntimeException)
	//*  38   74:aload_2         
	//*  39   75:instanceof      #500 <Class RuntimeException>
	//*  40   78:ifeq            86
				throw (RuntimeException)obj1;
	//   41   81:aload_2         
	//   42   82:checkcast       #500 <Class RuntimeException>
	//   43   85:athrow          
			else
				throw new IllegalArgumentException((new StringBuilder()).append("Failed to instantiate bean of type ").append(_classInfo.getAnnotated().getName()).append(": (").append(obj1.getClass().getName()).append(") ").append(((Throwable) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
	//   44   86:new             #253 <Class IllegalArgumentException>
	//   45   89:dup             
	//   46   90:new             #94  <Class StringBuilder>
	//   47   93:dup             
	//   48   94:invokespecial   #97  <Method void StringBuilder()>
	//   49   97:ldc2            #502 <String "Failed to instantiate bean of type ">
	//   50  100:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   51  103:aload_0         
	//   52  104:getfield        #33  <Field AnnotatedClass _classInfo>
	//   53  107:invokevirtual   #504 <Method Class AnnotatedClass.getAnnotated()>
	//   54  110:invokevirtual   #113 <Method String Class.getName()>
	//   55  113:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   56  116:ldc2            #506 <String ": (">
	//   57  119:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   58  122:aload_2         
	//   59  123:invokevirtual   #109 <Method Class Object.getClass()>
	//   60  126:invokevirtual   #113 <Method String Class.getName()>
	//   61  129:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   62  132:ldc2            #508 <String ") ">
	//   63  135:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   64  138:aload_2         
	//   65  139:invokevirtual   #511 <Method String Throwable.getMessage()>
	//   66  142:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   67  145:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   68  148:aload_2         
	//   69  149:invokespecial   #514 <Method void IllegalArgumentException(String, Throwable)>
	//   70  152:athrow          
		}
		return obj;
	}

	protected boolean isFactoryMethod(AnnotatedMethod annotatedmethod)
	{
		Class class1 = annotatedmethod.getRawReturnType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #517 <Method Class AnnotatedMethod.getRawReturnType()>
	//    2    4:astore_2        
		if(getBeanClass().isAssignableFrom(class1))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #520 <Method Class getBeanClass()>
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #132 <Method boolean Class.isAssignableFrom(Class)>
	//*   7   13:ifne            18
	//*   8   16:iconst_0        
	//*   9   17:ireturn         
		{
			if(_annotationIntrospector.hasCreatorAnnotation(((Annotated) (annotatedmethod))))
	//*  10   18:aload_0         
	//*  11   19:getfield        #31  <Field AnnotationIntrospector _annotationIntrospector>
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #524 <Method boolean AnnotationIntrospector.hasCreatorAnnotation(Annotated)>
	//*  14   26:ifeq            31
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
			String s = annotatedmethod.getName();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #281 <Method String AnnotatedMethod.getName()>
	//   19   35:astore_2        
			if("valueOf".equals(((Object) (s))))
	//*  20   36:ldc2            #526 <String "valueOf">
	//*  21   39:aload_2         
	//*  22   40:invokevirtual   #529 <Method boolean String.equals(Object)>
	//*  23   43:ifeq            48
				return true;
	//   24   46:iconst_1        
	//   25   47:ireturn         
			if("fromString".equals(((Object) (s))) && 1 == annotatedmethod.getParameterCount())
	//*  26   48:ldc2            #531 <String "fromString">
	//*  27   51:aload_2         
	//*  28   52:invokevirtual   #529 <Method boolean String.equals(Object)>
	//*  29   55:ifeq            16
	//*  30   58:iconst_1        
	//*  31   59:aload_1         
	//*  32   60:invokevirtual   #532 <Method int AnnotatedMethod.getParameterCount()>
	//*  33   63:icmpne          16
			{
				annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getRawParameterType(0)));
	//   34   66:aload_1         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #278 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//   37   71:astore_1        
				if(annotatedmethod == java/lang/String || ((Class) (java/lang/CharSequence)).isAssignableFrom(((Class) (annotatedmethod))))
	//*  38   72:aload_1         
	//*  39   73:ldc1            #174 <Class String>
	//*  40   75:if_acmpeq       88
	//*  41   78:ldc2            #534 <Class CharSequence>
	//*  42   81:aload_1         
	//*  43   82:invokevirtual   #132 <Method boolean Class.isAssignableFrom(Class)>
	//*  44   85:ifeq            16
					return true;
	//   45   88:iconst_1        
	//   46   89:ireturn         
			}
		}
		return false;
	}

	public boolean removeProperty(String s)
	{
		for(Iterator iterator = _properties().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #187 <Method List _properties()>
	//*   2    4:invokeinterface #193 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #198 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            46
			if(((BeanPropertyDefinition)iterator.next()).getName().equals(((Object) (s))))
	//*   7   19:aload_2         
	//*   8   20:invokeinterface #202 <Method Object Iterator.next()>
	//*   9   25:checkcast       #204 <Class BeanPropertyDefinition>
	//*  10   28:invokevirtual   #209 <Method String BeanPropertyDefinition.getName()>
	//*  11   31:aload_1         
	//*  12   32:invokevirtual   #529 <Method boolean String.equals(Object)>
	//*  13   35:ifeq            10
			{
				iterator.remove();
	//   14   38:aload_2         
	//   15   39:invokeinterface #539 <Method void Iterator.remove()>
				return true;
	//   16   44:iconst_1        
	//   17   45:ireturn         
			}

		return false;
	//   18   46:iconst_0        
	//   19   47:ireturn         
	}

	public JavaType resolveType(Type type)
	{
		if(type == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return _config.getTypeFactory().constructType(type, _type.getBindings());
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field MapperConfig _config>
	//    6   10:invokevirtual   #545 <Method TypeFactory MapperConfig.getTypeFactory()>
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #244 <Field JavaType _type>
	//   10   18:invokevirtual   #249 <Method TypeBindings JavaType.getBindings()>
	//   11   21:invokevirtual   #551 <Method JavaType TypeFactory.constructType(Type, TypeBindings)>
	//   12   24:areturn         
	}

	protected final AnnotationIntrospector _annotationIntrospector;
	protected TypeBindings _bindings;
	protected final AnnotatedClass _classInfo;
	protected final MapperConfig _config;
	protected ObjectIdInfo _objectIdInfo;
	protected final POJOPropertiesCollector _propCollector;
	protected List _properties;
}
