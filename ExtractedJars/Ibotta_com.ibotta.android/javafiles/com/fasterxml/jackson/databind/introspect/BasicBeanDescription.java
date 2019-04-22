// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			POJOPropertiesCollector, BeanPropertyDefinition, AnnotatedMember, AnnotatedMethod, 
//			AnnotatedClass, AnnotatedConstructor, ObjectIdInfo

public class BasicBeanDescription extends BeanDescription
{

	protected BasicBeanDescription(MapperConfig mapperconfig, JavaType javatype, AnnotatedClass annotatedclass, List list)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #36  <Method void BeanDescription(JavaType)>
		_propCollector = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #38  <Field POJOPropertiesCollector _propCollector>
		_config = mapperconfig;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #40  <Field MapperConfig _config>
		mapperconfig = _config;
	//    9   15:aload_0         
	//   10   16:getfield        #40  <Field MapperConfig _config>
	//   11   19:astore_1        
		if(mapperconfig == null)
	//*  12   20:aload_1         
	//*  13   21:ifnonnull       32
			_annotationIntrospector = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
		else
	//*  17   29:goto            40
			_annotationIntrospector = mapperconfig.getAnnotationIntrospector();
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #48  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   21   37:putfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
		_classInfo = annotatedclass;
	//   22   40:aload_0         
	//   23   41:aload_3         
	//   24   42:putfield        #50  <Field AnnotatedClass _classInfo>
		_properties = list;
	//   25   45:aload_0         
	//   26   46:aload           4
	//   27   48:putfield        #52  <Field List _properties>
	//   28   51:return          
	}

	protected BasicBeanDescription(POJOPropertiesCollector pojopropertiescollector)
	{
		this(pojopropertiescollector, pojopropertiescollector.getType(), pojopropertiescollector.getClassDef());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #61  <Method JavaType POJOPropertiesCollector.getType()>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #65  <Method AnnotatedClass POJOPropertiesCollector.getClassDef()>
	//    6   10:invokespecial   #68  <Method void BasicBeanDescription(POJOPropertiesCollector, JavaType, AnnotatedClass)>
		_objectIdInfo = pojopropertiescollector.getObjectIdInfo();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #72  <Method ObjectIdInfo POJOPropertiesCollector.getObjectIdInfo()>
	//   10   18:putfield        #74  <Field ObjectIdInfo _objectIdInfo>
	//   11   21:return          
	}

	protected BasicBeanDescription(POJOPropertiesCollector pojopropertiescollector, JavaType javatype, AnnotatedClass annotatedclass)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #36  <Method void BeanDescription(JavaType)>
		_propCollector = pojopropertiescollector;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #38  <Field POJOPropertiesCollector _propCollector>
		_config = pojopropertiescollector.getConfig();
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #78  <Method MapperConfig POJOPropertiesCollector.getConfig()>
	//    9   15:putfield        #40  <Field MapperConfig _config>
		pojopropertiescollector = ((POJOPropertiesCollector) (_config));
	//   10   18:aload_0         
	//   11   19:getfield        #40  <Field MapperConfig _config>
	//   12   22:astore_1        
		if(pojopropertiescollector == null)
	//*  13   23:aload_1         
	//*  14   24:ifnonnull       35
			_annotationIntrospector = null;
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:putfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
		else
	//*  18   32:goto            43
			_annotationIntrospector = ((MapperConfig) (pojopropertiescollector)).getAnnotationIntrospector();
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #48  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   22   40:putfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
		_classInfo = annotatedclass;
	//   23   43:aload_0         
	//   24   44:aload_3         
	//   25   45:putfield        #50  <Field AnnotatedClass _classInfo>
	//   26   48:return          
	}

	public static BasicBeanDescription forDeserialization(POJOPropertiesCollector pojopropertiescollector)
	{
		return new BasicBeanDescription(pojopropertiescollector);
	//    0    0:new             #2   <Class BasicBeanDescription>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #82  <Method void BasicBeanDescription(POJOPropertiesCollector)>
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
	//    5    7:invokestatic    #90  <Method List Collections.emptyList()>
	//    6   10:invokespecial   #92  <Method void BasicBeanDescription(MapperConfig, JavaType, AnnotatedClass, List)>
	//    7   13:areturn         
	}

	public static BasicBeanDescription forSerialization(POJOPropertiesCollector pojopropertiescollector)
	{
		return new BasicBeanDescription(pojopropertiescollector);
	//    0    0:new             #2   <Class BasicBeanDescription>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #82  <Method void BasicBeanDescription(POJOPropertiesCollector)>
	//    4    8:areturn         
	}

	protected Converter _createConverter(Object obj)
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
	//*   7    9:instanceof      #98  <Class Converter>
	//*   8   12:ifeq            20
			return (Converter)obj;
	//    9   15:aload_1         
	//   10   16:checkcast       #98  <Class Converter>
	//   11   19:areturn         
		if(obj instanceof Class)
	//*  12   20:aload_1         
	//*  13   21:instanceof      #28  <Class Class>
	//*  14   24:ifeq            155
		{
			Class class1 = (Class)obj;
	//   15   27:aload_1         
	//   16   28:checkcast       #28  <Class Class>
	//   17   31:astore_3        
			if(class1 != com/fasterxml/jackson/databind/util/Converter$None)
	//*  18   32:aload_3         
	//*  19   33:ldc1            #100 <Class com.fasterxml.jackson.databind.util.Converter$None>
	//*  20   35:if_acmpeq       153
			{
				if(ClassUtil.isBogusClass(class1))
	//*  21   38:aload_3         
	//*  22   39:invokestatic    #106 <Method boolean ClassUtil.isBogusClass(Class)>
	//*  23   42:ifeq            47
					return null;
	//   24   45:aconst_null     
	//   25   46:areturn         
				if(((Class) (com/fasterxml/jackson/databind/util/Converter)).isAssignableFrom(class1))
	//*  26   47:ldc1            #98  <Class Converter>
	//*  27   49:aload_3         
	//*  28   50:invokevirtual   #109 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   53:ifeq            110
				{
					obj = ((Object) (_config.getHandlerInstantiator()));
	//   30   56:aload_0         
	//   31   57:getfield        #40  <Field MapperConfig _config>
	//   32   60:invokevirtual   #113 <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//   33   63:astore_1        
					if(obj == null)
	//*  34   64:aload_1         
	//*  35   65:ifnonnull       73
						obj = obj1;
	//   36   68:aload_2         
	//   37   69:astore_1        
					else
	//*  38   70:goto            87
						obj = ((Object) (((HandlerInstantiator) (obj)).converterInstance(_config, ((Annotated) (_classInfo)), class1)));
	//   39   73:aload_1         
	//   40   74:aload_0         
	//   41   75:getfield        #40  <Field MapperConfig _config>
	//   42   78:aload_0         
	//   43   79:getfield        #50  <Field AnnotatedClass _classInfo>
	//   44   82:aload_3         
	//   45   83:invokevirtual   #119 <Method Converter HandlerInstantiator.converterInstance(MapperConfig, Annotated, Class)>
	//   46   86:astore_1        
					obj1 = obj;
	//   47   87:aload_1         
	//   48   88:astore_2        
					if(obj == null)
	//*  49   89:aload_1         
	//*  50   90:ifnonnull       108
						obj1 = ((Object) ((Converter)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers())));
	//   51   93:aload_3         
	//   52   94:aload_0         
	//   53   95:getfield        #40  <Field MapperConfig _config>
	//   54   98:invokevirtual   #123 <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//   55  101:invokestatic    #127 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   56  104:checkcast       #98  <Class Converter>
	//   57  107:astore_2        
					return ((Converter) (obj1));
	//   58  108:aload_2         
	//   59  109:areturn         
				} else
				{
					obj = ((Object) (new StringBuilder()));
	//   60  110:new             #129 <Class StringBuilder>
	//   61  113:dup             
	//   62  114:invokespecial   #131 <Method void StringBuilder()>
	//   63  117:astore_1        
					((StringBuilder) (obj)).append("AnnotationIntrospector returned Class ");
	//   64  118:aload_1         
	//   65  119:ldc1            #133 <String "AnnotationIntrospector returned Class ">
	//   66  121:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   67  124:pop             
					((StringBuilder) (obj)).append(class1.getName());
	//   68  125:aload_1         
	//   69  126:aload_3         
	//   70  127:invokevirtual   #141 <Method String Class.getName()>
	//   71  130:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   72  133:pop             
					((StringBuilder) (obj)).append("; expected Class<Converter>");
	//   73  134:aload_1         
	//   74  135:ldc1            #143 <String "; expected Class<Converter>">
	//   75  137:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   76  140:pop             
					throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   77  141:new             #145 <Class IllegalStateException>
	//   78  144:dup             
	//   79  145:aload_1         
	//   80  146:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   81  149:invokespecial   #151 <Method void IllegalStateException(String)>
	//   82  152:athrow          
				}
			} else
			{
				return null;
	//   83  153:aconst_null     
	//   84  154:areturn         
			}
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   85  155:new             #129 <Class StringBuilder>
	//   86  158:dup             
	//   87  159:invokespecial   #131 <Method void StringBuilder()>
	//   88  162:astore_2        
			stringbuilder.append("AnnotationIntrospector returned Converter definition of type ");
	//   89  163:aload_2         
	//   90  164:ldc1            #153 <String "AnnotationIntrospector returned Converter definition of type ">
	//   91  166:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   92  169:pop             
			stringbuilder.append(obj.getClass().getName());
	//   93  170:aload_2         
	//   94  171:aload_1         
	//   95  172:invokevirtual   #159 <Method Class Object.getClass()>
	//   96  175:invokevirtual   #141 <Method String Class.getName()>
	//   97  178:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   98  181:pop             
			stringbuilder.append("; expected type Converter or Class<Converter> instead");
	//   99  182:aload_2         
	//  100  183:ldc1            #161 <String "; expected type Converter or Class<Converter> instead">
	//  101  185:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//  102  188:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//  103  189:new             #145 <Class IllegalStateException>
	//  104  192:dup             
	//  105  193:aload_2         
	//  106  194:invokevirtual   #148 <Method String StringBuilder.toString()>
	//  107  197:invokespecial   #151 <Method void IllegalStateException(String)>
	//  108  200:athrow          
		}
	}

	protected List _properties()
	{
		if(_properties == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field List _properties>
	//*   2    4:ifnonnull       18
			_properties = _propCollector.getProperties();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field POJOPropertiesCollector _propCollector>
	//    6   12:invokevirtual   #165 <Method List POJOPropertiesCollector.getProperties()>
	//    7   15:putfield        #52  <Field List _properties>
		return _properties;
	//    8   18:aload_0         
	//    9   19:getfield        #52  <Field List _properties>
	//   10   22:areturn         
	}

	public boolean addProperty(BeanPropertyDefinition beanpropertydefinition)
	{
		if(hasProperty(beanpropertydefinition.getFullName()))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #174 <Method PropertyName BeanPropertyDefinition.getFullName()>
	//*   3    5:invokevirtual   #178 <Method boolean hasProperty(PropertyName)>
	//*   4    8:ifeq            13
		{
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		} else
		{
			_properties().add(((Object) (beanpropertydefinition)));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #180 <Method List _properties()>
	//    9   17:aload_1         
	//   10   18:invokeinterface #186 <Method boolean List.add(Object)>
	//   11   23:pop             
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		}
	}

	public AnnotatedMember findAnyGetter()
		throws IllegalArgumentException
	{
		Object obj = ((Object) (_propCollector));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field POJOPropertiesCollector _propCollector>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:goto            19
			obj = ((Object) (((POJOPropertiesCollector) (obj)).getAnyGetter()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #193 <Method AnnotatedMember POJOPropertiesCollector.getAnyGetter()>
	//   10   18:astore_1        
		if(obj != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          80
		{
			if(((Class) (java/util/Map)).isAssignableFrom(((AnnotatedMember) (obj)).getRawType()))
	//*  13   23:ldc1            #195 <Class Map>
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #200 <Method Class AnnotatedMember.getRawType()>
	//*  16   29:invokevirtual   #109 <Method boolean Class.isAssignableFrom(Class)>
	//*  17   32:ifeq            37
			{
				return ((AnnotatedMember) (obj));
	//   18   35:aload_1         
	//   19   36:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   20   37:new             #129 <Class StringBuilder>
	//   21   40:dup             
	//   22   41:invokespecial   #131 <Method void StringBuilder()>
	//   23   44:astore_2        
				stringbuilder.append("Invalid 'any-getter' annotation on method ");
	//   24   45:aload_2         
	//   25   46:ldc1            #202 <String "Invalid 'any-getter' annotation on method ">
	//   26   48:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
				stringbuilder.append(((AnnotatedMember) (obj)).getName());
	//   28   52:aload_2         
	//   29   53:aload_1         
	//   30   54:invokevirtual   #203 <Method String AnnotatedMember.getName()>
	//   31   57:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   32   60:pop             
				stringbuilder.append("(): return type is not instance of java.util.Map");
	//   33   61:aload_2         
	//   34   62:ldc1            #205 <String "(): return type is not instance of java.util.Map">
	//   35   64:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   36   67:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   37   68:new             #190 <Class IllegalArgumentException>
	//   38   71:dup             
	//   39   72:aload_2         
	//   40   73:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   41   76:invokespecial   #206 <Method void IllegalArgumentException(String)>
	//   42   79:athrow          
			}
		} else
		{
			return ((AnnotatedMember) (obj));
	//   43   80:aload_1         
	//   44   81:areturn         
		}
	}

	public AnnotatedMember findAnySetterAccessor()
		throws IllegalArgumentException
	{
		Object obj = ((Object) (_propCollector));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field POJOPropertiesCollector _propCollector>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          121
		{
			obj = ((Object) (((POJOPropertiesCollector) (obj)).getAnySetterMethod()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #212 <Method AnnotatedMethod POJOPropertiesCollector.getAnySetterMethod()>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          71
			{
				Class class1 = ((AnnotatedMethod) (obj)).getRawParameterType(0);
	//   10   18:aload_1         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #218 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//   13   23:astore_2        
				if(class1 != java/lang/String)
	//*  14   24:aload_2         
	//*  15   25:ldc1            #220 <Class String>
	//*  16   27:if_acmpeq       69
				{
					if(class1 == java/lang/Object)
	//*  17   30:aload_2         
	//*  18   31:ldc1            #155 <Class Object>
	//*  19   33:if_acmpne       38
						return ((AnnotatedMember) (obj));
	//   20   36:aload_1         
	//   21   37:areturn         
					else
						throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", new Object[] {
							((AnnotatedMethod) (obj)).getName(), class1.getName()
						}));
	//   22   38:new             #190 <Class IllegalArgumentException>
	//   23   41:dup             
	//   24   42:ldc1            #222 <String "Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s">
	//   25   44:iconst_2        
	//   26   45:anewarray       Object[]
	//   27   48:dup             
	//   28   49:iconst_0        
	//   29   50:aload_1         
	//   30   51:invokevirtual   #223 <Method String AnnotatedMethod.getName()>
	//   31   54:aastore         
	//   32   55:dup             
	//   33   56:iconst_1        
	//   34   57:aload_2         
	//   35   58:invokevirtual   #141 <Method String Class.getName()>
	//   36   61:aastore         
	//   37   62:invokestatic    #227 <Method String String.format(String, Object[])>
	//   38   65:invokespecial   #206 <Method void IllegalArgumentException(String)>
	//   39   68:athrow          
				} else
				{
					return ((AnnotatedMember) (obj));
	//   40   69:aload_1         
	//   41   70:areturn         
				}
			}
			obj = ((Object) (_propCollector.getAnySetterField()));
	//   42   71:aload_0         
	//   43   72:getfield        #38  <Field POJOPropertiesCollector _propCollector>
	//   44   75:invokevirtual   #230 <Method AnnotatedMember POJOPropertiesCollector.getAnySetterField()>
	//   45   78:astore_1        
			if(obj != null)
	//*  46   79:aload_1         
	//*  47   80:ifnull          121
				if(((Class) (java/util/Map)).isAssignableFrom(((AnnotatedMember) (obj)).getRawType()))
	//*  48   83:ldc1            #195 <Class Map>
	//*  49   85:aload_1         
	//*  50   86:invokevirtual   #200 <Method Class AnnotatedMember.getRawType()>
	//*  51   89:invokevirtual   #109 <Method boolean Class.isAssignableFrom(Class)>
	//*  52   92:ifeq            97
					return ((AnnotatedMember) (obj));
	//   53   95:aload_1         
	//   54   96:areturn         
				else
					throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", new Object[] {
						((AnnotatedMember) (obj)).getName()
					}));
	//   55   97:new             #190 <Class IllegalArgumentException>
	//   56  100:dup             
	//   57  101:ldc1            #232 <String "Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map">
	//   58  103:iconst_1        
	//   59  104:anewarray       Object[]
	//   60  107:dup             
	//   61  108:iconst_0        
	//   62  109:aload_1         
	//   63  110:invokevirtual   #203 <Method String AnnotatedMember.getName()>
	//   64  113:aastore         
	//   65  114:invokestatic    #227 <Method String String.format(String, Object[])>
	//   66  117:invokespecial   #206 <Method void IllegalArgumentException(String)>
	//   67  120:athrow          
		}
		return null;
	//   68  121:aconst_null     
	//   69  122:areturn         
	}

	public List findBackReferences()
	{
		Object obj;
label0:
		{
			Iterator iterator = _properties().iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method List _properties()>
	//    2    4:invokeinterface #237 <Method Iterator List.iterator()>
	//    3    9:astore_3        
			obj = null;
	//    4   10:aconst_null     
	//    5   11:astore_1        
			HashSet hashset = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
			Object obj1;
			do
			{
				BeanPropertyDefinition beanpropertydefinition;
				do
				{
					if(!iterator.hasNext())
						break label0;
	//    8   14:aload_3         
	//    9   15:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//   10   20:ifeq            158
					beanpropertydefinition = (BeanPropertyDefinition)iterator.next();
	//   11   23:aload_3         
	//   12   24:invokeinterface #246 <Method Object Iterator.next()>
	//   13   29:checkcast       #170 <Class BeanPropertyDefinition>
	//   14   32:astore          4
					obj1 = ((Object) (beanpropertydefinition.findReferenceType()));
	//   15   34:aload           4
	//   16   36:invokevirtual   #250 <Method com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty BeanPropertyDefinition.findReferenceType()>
	//   17   39:astore          5
				} while(obj1 == null || !((com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty) (obj1)).isBackReference());
	//   18   41:aload           5
	//   19   43:ifnull          14
	//   20   46:aload           5
	//   21   48:invokevirtual   #255 <Method boolean com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.isBackReference()>
	//   22   51:ifne            57
	//*  23   54:goto            14
				obj1 = ((Object) (((com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty) (obj1)).getName()));
	//   24   57:aload           5
	//   25   59:invokevirtual   #256 <Method String com.fasterxml.jackson.databind.AnnotationIntrospector$ReferenceProperty.getName()>
	//   26   62:astore          5
				if(obj == null)
	//*  27   64:aload_1         
	//*  28   65:ifnonnull       94
				{
					obj = ((Object) (new ArrayList()));
	//   29   68:new             #258 <Class ArrayList>
	//   30   71:dup             
	//   31   72:invokespecial   #259 <Method void ArrayList()>
	//   32   75:astore_1        
					hashset = new HashSet();
	//   33   76:new             #261 <Class HashSet>
	//   34   79:dup             
	//   35   80:invokespecial   #262 <Method void HashSet()>
	//   36   83:astore_2        
					hashset.add(obj1);
	//   37   84:aload_2         
	//   38   85:aload           5
	//   39   87:invokevirtual   #263 <Method boolean HashSet.add(Object)>
	//   40   90:pop             
				} else
	//*  41   91:goto            103
				if(!hashset.add(obj1))
					break;
	//   42   94:aload_2         
	//   43   95:aload           5
	//   44   97:invokevirtual   #263 <Method boolean HashSet.add(Object)>
	//   45  100:ifeq            115
				((List) (obj)).add(((Object) (beanpropertydefinition)));
	//   46  103:aload_1         
	//   47  104:aload           4
	//   48  106:invokeinterface #186 <Method boolean List.add(Object)>
	//   49  111:pop             
			} while(true);
	//   50  112:goto            14
			obj = ((Object) (new StringBuilder()));
	//   51  115:new             #129 <Class StringBuilder>
	//   52  118:dup             
	//   53  119:invokespecial   #131 <Method void StringBuilder()>
	//   54  122:astore_1        
			((StringBuilder) (obj)).append("Multiple back-reference properties with name '");
	//   55  123:aload_1         
	//   56  124:ldc2            #265 <String "Multiple back-reference properties with name '">
	//   57  127:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   58  130:pop             
			((StringBuilder) (obj)).append(((String) (obj1)));
	//   59  131:aload_1         
	//   60  132:aload           5
	//   61  134:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   62  137:pop             
			((StringBuilder) (obj)).append("'");
	//   63  138:aload_1         
	//   64  139:ldc2            #267 <String "'">
	//   65  142:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   66  145:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   67  146:new             #190 <Class IllegalArgumentException>
	//   68  149:dup             
	//   69  150:aload_1         
	//   70  151:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   71  154:invokespecial   #206 <Method void IllegalArgumentException(String)>
	//   72  157:athrow          
		}
		return ((List) (obj));
	//   73  158:aload_1         
	//   74  159:areturn         
	}

	public AnnotatedConstructor findDefaultConstructor()
	{
		return _classInfo.getDefaultConstructor();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #274 <Method AnnotatedConstructor AnnotatedClass.getDefaultConstructor()>
	//    3    7:areturn         
	}

	public Class[] findDefaultViews()
	{
		if(!_defaultViewsResolved)
	//*   0    0:aload_0         
	//*   1    1:getfield        #278 <Field boolean _defaultViewsResolved>
	//*   2    4:ifne            65
		{
			_defaultViewsResolved = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #278 <Field boolean _defaultViewsResolved>
			Object obj = ((Object) (_annotationIntrospector));
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
	//    8   16:astore_1        
			if(obj == null)
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       26
				obj = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
			else
	//*  13   23:goto            35
				obj = ((Object) (((AnnotationIntrospector) (obj)).findViews(((Annotated) (_classInfo)))));
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #50  <Field AnnotatedClass _classInfo>
	//   17   31:invokevirtual   #284 <Method Class[] AnnotationIntrospector.findViews(Annotated)>
	//   18   34:astore_1        
			Class aclass[] = ((Class []) (obj));
	//   19   35:aload_1         
	//   20   36:astore_2        
			if(obj == null)
	//*  21   37:aload_1         
	//*  22   38:ifnonnull       60
			{
				aclass = ((Class []) (obj));
	//   23   41:aload_1         
	//   24   42:astore_2        
				if(!_config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION))
	//*  25   43:aload_0         
	//*  26   44:getfield        #40  <Field MapperConfig _config>
	//*  27   47:getstatic       #290 <Field MapperFeature MapperFeature.DEFAULT_VIEW_INCLUSION>
	//*  28   50:invokevirtual   #294 <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//*  29   53:ifne            60
					aclass = NO_VIEWS;
	//   30   56:getstatic       #30  <Field Class[] NO_VIEWS>
	//   31   59:astore_2        
			}
			_defaultViews = aclass;
	//   32   60:aload_0         
	//   33   61:aload_2         
	//   34   62:putfield        #296 <Field Class[] _defaultViews>
		}
		return _defaultViews;
	//   35   65:aload_0         
	//   36   66:getfield        #296 <Field Class[] _defaultViews>
	//   37   69:areturn         
	}

	public Converter findDeserializationConverter()
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_1        
		if(annotationintrospector == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return _createConverter(annotationintrospector.findDeserializationConverter(((Annotated) (_classInfo))));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_0         
	//   10   14:getfield        #50  <Field AnnotatedClass _classInfo>
	//   11   17:invokevirtual   #302 <Method Object AnnotationIntrospector.findDeserializationConverter(Annotated)>
	//   12   20:invokevirtual   #304 <Method Converter _createConverter(Object)>
	//   13   23:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value findExpectedFormat(com.fasterxml.jackson.annotation.JsonFormat.Value value)
	{
		Object obj = ((Object) (_annotationIntrospector));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_3        
		com.fasterxml.jackson.annotation.JsonFormat.Value value1 = value;
	//    3    5:aload_1         
	//    4    6:astore_2        
		if(obj != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          41
		{
			obj = ((Object) (((AnnotationIntrospector) (obj)).findFormat(((Annotated) (_classInfo)))));
	//    7   11:aload_3         
	//    8   12:aload_0         
	//    9   13:getfield        #50  <Field AnnotatedClass _classInfo>
	//   10   16:invokevirtual   #311 <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(Annotated)>
	//   11   19:astore_3        
			value1 = value;
	//   12   20:aload_1         
	//   13   21:astore_2        
			if(obj != null)
	//*  14   22:aload_3         
	//*  15   23:ifnull          41
				if(value == null)
	//*  16   26:aload_1         
	//*  17   27:ifnonnull       35
					value1 = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj));
	//   18   30:aload_3         
	//   19   31:astore_2        
				else
	//*  20   32:goto            41
					value1 = value.withOverrides(((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)));
	//   21   35:aload_1         
	//   22   36:aload_3         
	//   23   37:invokevirtual   #316 <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.withOverrides(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   24   40:astore_2        
		}
		obj = ((Object) (_config.getDefaultPropertyFormat(_classInfo.getRawType())));
	//   25   41:aload_0         
	//   26   42:getfield        #40  <Field MapperConfig _config>
	//   27   45:aload_0         
	//   28   46:getfield        #50  <Field AnnotatedClass _classInfo>
	//   29   49:invokevirtual   #317 <Method Class AnnotatedClass.getRawType()>
	//   30   52:invokevirtual   #321 <Method com.fasterxml.jackson.annotation.JsonFormat$Value MapperConfig.getDefaultPropertyFormat(Class)>
	//   31   55:astore_3        
		value = value1;
	//   32   56:aload_2         
	//   33   57:astore_1        
		if(obj != null)
	//*  34   58:aload_3         
	//*  35   59:ifnull          74
		{
			if(value1 == null)
	//*  36   62:aload_2         
	//*  37   63:ifnonnull       68
				return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj));
	//   38   66:aload_3         
	//   39   67:areturn         
			value = value1.withOverrides(((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)));
	//   40   68:aload_2         
	//   41   69:aload_3         
	//   42   70:invokevirtual   #316 <Method com.fasterxml.jackson.annotation.JsonFormat$Value com.fasterxml.jackson.annotation.JsonFormat$Value.withOverrides(com.fasterxml.jackson.annotation.JsonFormat$Value)>
	//   43   73:astore_1        
		}
		return value;
	//   44   74:aload_1         
	//   45   75:areturn         
	}

	public transient Method findFactoryMethod(Class aclass[])
	{
		Iterator iterator = _classInfo.getFactoryMethods().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #326 <Method List AnnotatedClass.getFactoryMethods()>
	//    3    7:invokeinterface #237 <Method Iterator List.iterator()>
	//    4   12:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   14:aload           4
	//    6   16:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            96
			AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
	//    8   24:aload           4
	//    9   26:invokeinterface #246 <Method Object Iterator.next()>
	//   10   31:checkcast       #214 <Class AnnotatedMethod>
	//   11   34:astore          5
			if(isFactoryMethod(annotatedmethod) && annotatedmethod.getParameterCount() == 1)
	//*  12   36:aload_0         
	//*  13   37:aload           5
	//*  14   39:invokevirtual   #330 <Method boolean isFactoryMethod(AnnotatedMethod)>
	//*  15   42:ifeq            14
	//*  16   45:aload           5
	//*  17   47:invokevirtual   #334 <Method int AnnotatedMethod.getParameterCount()>
	//*  18   50:iconst_1        
	//*  19   51:icmpne          14
			{
				int i = 0;
	//   20   54:iconst_0        
	//   21   55:istore_2        
				Class class1 = annotatedmethod.getRawParameterType(0);
	//   22   56:aload           5
	//   23   58:iconst_0        
	//   24   59:invokevirtual   #218 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//   25   62:astore          6
				int j = aclass.length;
	//   26   64:aload_1         
	//   27   65:arraylength     
	//   28   66:istore_3        
				while(i < j) 
	//*  29   67:iload_2         
	//*  30   68:iload_3         
	//*  31   69:icmpge          14
				{
					if(class1.isAssignableFrom(aclass[i]))
	//*  32   72:aload           6
	//*  33   74:aload_1         
	//*  34   75:iload_2         
	//*  35   76:aaload          
	//*  36   77:invokevirtual   #109 <Method boolean Class.isAssignableFrom(Class)>
	//*  37   80:ifeq            89
						return annotatedmethod.getAnnotated();
	//   38   83:aload           5
	//   39   85:invokevirtual   #338 <Method Method AnnotatedMethod.getAnnotated()>
	//   40   88:areturn         
					i++;
	//   41   89:iload_2         
	//   42   90:iconst_1        
	//   43   91:iadd            
	//   44   92:istore_2        
				}
			}
		} while(true);
	//   45   93:goto            67
		return null;
	//   46   96:aconst_null     
	//   47   97:areturn         
	}

	public Map findInjectables()
	{
		POJOPropertiesCollector pojopropertiescollector = _propCollector;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field POJOPropertiesCollector _propCollector>
	//    2    4:astore_1        
		if(pojopropertiescollector != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return pojopropertiescollector.getInjectables();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #344 <Method Map POJOPropertiesCollector.getInjectables()>
	//    7   13:areturn         
		else
			return Collections.emptyMap();
	//    8   14:invokestatic    #347 <Method Map Collections.emptyMap()>
	//    9   17:areturn         
	}

	public AnnotatedMember findJsonValueAccessor()
	{
		POJOPropertiesCollector pojopropertiescollector = _propCollector;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field POJOPropertiesCollector _propCollector>
	//    2    4:astore_1        
		if(pojopropertiescollector == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return pojopropertiescollector.getJsonValueAccessor();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #352 <Method AnnotatedMember POJOPropertiesCollector.getJsonValueAccessor()>
	//    9   15:areturn         
	}

	public AnnotatedMethod findMethod(String s, Class aclass[])
	{
		return _classInfo.findMethod(s, aclass);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #356 <Method AnnotatedMethod AnnotatedClass.findMethod(String, Class[])>
	//    5    9:areturn         
	}

	public Class findPOJOBuilder()
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_1        
		if(annotationintrospector == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return annotationintrospector.findPOJOBuilder(_classInfo);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #50  <Field AnnotatedClass _classInfo>
	//   10   16:invokevirtual   #361 <Method Class AnnotationIntrospector.findPOJOBuilder(AnnotatedClass)>
	//   11   19:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value findPOJOBuilderConfig()
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_1        
		if(annotationintrospector == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return annotationintrospector.findPOJOBuilderConfig(_classInfo);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #50  <Field AnnotatedClass _classInfo>
	//   10   16:invokevirtual   #367 <Method com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value AnnotationIntrospector.findPOJOBuilderConfig(AnnotatedClass)>
	//   11   19:areturn         
	}

	public List findProperties()
	{
		return _properties();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method List _properties()>
	//    2    4:areturn         
	}

	public BeanPropertyDefinition findProperty(PropertyName propertyname)
	{
		for(Iterator iterator = _properties().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #180 <Method List _properties()>
	//*   2    4:invokeinterface #237 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
		{
			BeanPropertyDefinition beanpropertydefinition = (BeanPropertyDefinition)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #246 <Method Object Iterator.next()>
	//    9   25:checkcast       #170 <Class BeanPropertyDefinition>
	//   10   28:astore_3        
			if(beanpropertydefinition.hasName(propertyname))
	//*  11   29:aload_3         
	//*  12   30:aload_1         
	//*  13   31:invokevirtual   #373 <Method boolean BeanPropertyDefinition.hasName(PropertyName)>
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
		Object obj = ((Object) (_annotationIntrospector));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          34
		{
			obj = ((Object) (((AnnotationIntrospector) (obj)).findPropertyInclusion(((Annotated) (_classInfo)))));
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #50  <Field AnnotatedClass _classInfo>
	//    8   14:invokevirtual   #378 <Method com.fasterxml.jackson.annotation.JsonInclude$Value AnnotationIntrospector.findPropertyInclusion(Annotated)>
	//    9   17:astore_2        
			if(obj != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          34
				if(value == null)
	//*  12   22:aload_1         
	//*  13   23:ifnonnull       28
					return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj));
	//   14   26:aload_2         
	//   15   27:areturn         
				else
					return value.withOverrides(((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj)));
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:invokevirtual   #382 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   19   33:areturn         
		}
		return value;
	//   20   34:aload_1         
	//   21   35:areturn         
	}

	public Converter findSerializationConverter()
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_1        
		if(annotationintrospector == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return _createConverter(annotationintrospector.findSerializationConverter(((Annotated) (_classInfo))));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_0         
	//   10   14:getfield        #50  <Field AnnotatedClass _classInfo>
	//   11   17:invokevirtual   #385 <Method Object AnnotationIntrospector.findSerializationConverter(Annotated)>
	//   12   20:invokevirtual   #304 <Method Converter _createConverter(Object)>
	//   13   23:areturn         
	}

	public transient Constructor findSingleArgConstructor(Class aclass[])
	{
		Iterator iterator = _classInfo.getConstructors().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #390 <Method List AnnotatedClass.getConstructors()>
	//    3    7:invokeinterface #237 <Method Iterator List.iterator()>
	//    4   12:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   14:aload           4
	//    6   16:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            84
			AnnotatedConstructor annotatedconstructor = (AnnotatedConstructor)iterator.next();
	//    8   24:aload           4
	//    9   26:invokeinterface #246 <Method Object Iterator.next()>
	//   10   31:checkcast       #392 <Class AnnotatedConstructor>
	//   11   34:astore          5
			if(annotatedconstructor.getParameterCount() == 1)
	//*  12   36:aload           5
	//*  13   38:invokevirtual   #393 <Method int AnnotatedConstructor.getParameterCount()>
	//*  14   41:iconst_1        
	//*  15   42:icmpne          14
			{
				int i = 0;
	//   16   45:iconst_0        
	//   17   46:istore_2        
				Class class1 = annotatedconstructor.getRawParameterType(0);
	//   18   47:aload           5
	//   19   49:iconst_0        
	//   20   50:invokevirtual   #394 <Method Class AnnotatedConstructor.getRawParameterType(int)>
	//   21   53:astore          6
				int j = aclass.length;
	//   22   55:aload_1         
	//   23   56:arraylength     
	//   24   57:istore_3        
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
	//   34   73:invokevirtual   #397 <Method Constructor AnnotatedConstructor.getAnnotated()>
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
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #403 <Method Annotations AnnotatedClass.getAnnotations()>
	//    3    7:areturn         
	}

	public AnnotatedClass getClassInfo()
	{
		return _classInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:areturn         
	}

	public List getConstructors()
	{
		return _classInfo.getConstructors();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #390 <Method List AnnotatedClass.getConstructors()>
	//    3    7:areturn         
	}

	public List getFactoryMethods()
	{
		List list = _classInfo.getFactoryMethods();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #326 <Method List AnnotatedClass.getFactoryMethods()>
	//    3    7:astore_2        
		if(list.isEmpty())
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #408 <Method boolean List.isEmpty()>
	//*   6   14:ifeq            19
			return list;
	//    7   17:aload_2         
	//    8   18:areturn         
		ArrayList arraylist = null;
	//    9   19:aconst_null     
	//   10   20:astore_1        
		Iterator iterator = list.iterator();
	//   11   21:aload_2         
	//   12   22:invokeinterface #237 <Method Iterator List.iterator()>
	//   13   27:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   14   28:aload_3         
	//   15   29:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//   16   34:ifeq            85
			AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
	//   17   37:aload_3         
	//   18   38:invokeinterface #246 <Method Object Iterator.next()>
	//   19   43:checkcast       #214 <Class AnnotatedMethod>
	//   20   46:astore          4
			if(isFactoryMethod(annotatedmethod))
	//*  21   48:aload_0         
	//*  22   49:aload           4
	//*  23   51:invokevirtual   #330 <Method boolean isFactoryMethod(AnnotatedMethod)>
	//*  24   54:ifeq            28
			{
				ArrayList arraylist1 = arraylist;
	//   25   57:aload_1         
	//   26   58:astore_2        
				if(arraylist == null)
	//*  27   59:aload_1         
	//*  28   60:ifnonnull       71
					arraylist1 = new ArrayList();
	//   29   63:new             #258 <Class ArrayList>
	//   30   66:dup             
	//   31   67:invokespecial   #259 <Method void ArrayList()>
	//   32   70:astore_2        
				((List) (arraylist1)).add(((Object) (annotatedmethod)));
	//   33   71:aload_2         
	//   34   72:aload           4
	//   35   74:invokeinterface #186 <Method boolean List.add(Object)>
	//   36   79:pop             
				arraylist = arraylist1;
	//   37   80:aload_2         
	//   38   81:astore_1        
			}
		} while(true);
	//   39   82:goto            28
		if(arraylist == null)
	//*  40   85:aload_1         
	//*  41   86:ifnonnull       93
			return Collections.emptyList();
	//   42   89:invokestatic    #90  <Method List Collections.emptyList()>
	//   43   92:areturn         
		else
			return ((List) (arraylist));
	//   44   93:aload_1         
	//   45   94:areturn         
	}

	public Set getIgnoredPropertyNames()
	{
		Object obj = ((Object) (_propCollector));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field POJOPropertiesCollector _propCollector>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:goto            19
			obj = ((Object) (((POJOPropertiesCollector) (obj)).getIgnoredPropertyNames()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #413 <Method Set POJOPropertiesCollector.getIgnoredPropertyNames()>
	//   10   18:astore_1        
		if(obj == null)
	//*  11   19:aload_1         
	//*  12   20:ifnonnull       27
			return Collections.emptySet();
	//   13   23:invokestatic    #416 <Method Set Collections.emptySet()>
	//   14   26:areturn         
		else
			return ((Set) (obj));
	//   15   27:aload_1         
	//   16   28:areturn         
	}

	public ObjectIdInfo getObjectIdInfo()
	{
		return _objectIdInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field ObjectIdInfo _objectIdInfo>
	//    2    4:areturn         
	}

	public boolean hasKnownClassAnnotations()
	{
		return _classInfo.hasAnnotations();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #421 <Method boolean AnnotatedClass.hasAnnotations()>
	//    3    7:ireturn         
	}

	public boolean hasProperty(PropertyName propertyname)
	{
		return findProperty(propertyname) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #423 <Method BeanPropertyDefinition findProperty(PropertyName)>
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
	//    1    1:getfield        #50  <Field AnnotatedClass _classInfo>
	//    2    4:invokevirtual   #274 <Method AnnotatedConstructor AnnotatedClass.getDefaultConstructor()>
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
	//   12   20:getfield        #40  <Field MapperConfig _config>
	//   13   23:getstatic       #430 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   14   26:invokevirtual   #294 <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//   15   29:invokevirtual   #434 <Method void AnnotatedConstructor.fixAccess(boolean)>
		try
		{
			obj = ((AnnotatedConstructor) (obj)).getAnnotated().newInstance(new Object[0]);
	//   16   32:aload_2         
	//   17   33:invokevirtual   #397 <Method Constructor AnnotatedConstructor.getAnnotated()>
	//   18   36:iconst_0        
	//   19   37:anewarray       Object[]
	//   20   40:invokevirtual   #440 <Method Object Constructor.newInstance(Object[])>
	//   21   43:astore_2        
		}
	//*  22   44:aload_2         
	//*  23   45:areturn         
		catch(Object obj1)
	//*  24   46:astore_2        
		{
			for(; ((Throwable) (obj1)).getCause() != null; obj1 = ((Object) (((Throwable) (obj1)).getCause())));
	//   25   47:aload_2         
	//   26   48:invokevirtual   #446 <Method Throwable Throwable.getCause()>
	//   27   51:ifnull          62
	//   28   54:aload_2         
	//   29   55:invokevirtual   #446 <Method Throwable Throwable.getCause()>
	//   30   58:astore_2        
	//*  31   59:goto            47
			ClassUtil.throwIfError(((Throwable) (obj1)));
	//   32   62:aload_2         
	//   33   63:invokestatic    #450 <Method Throwable ClassUtil.throwIfError(Throwable)>
	//   34   66:pop             
			ClassUtil.throwIfRTE(((Throwable) (obj1)));
	//   35   67:aload_2         
	//   36   68:invokestatic    #453 <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//   37   71:pop             
			StringBuilder stringbuilder = new StringBuilder();
	//   38   72:new             #129 <Class StringBuilder>
	//   39   75:dup             
	//   40   76:invokespecial   #131 <Method void StringBuilder()>
	//   41   79:astore_3        
			stringbuilder.append("Failed to instantiate bean of type ");
	//   42   80:aload_3         
	//   43   81:ldc2            #455 <String "Failed to instantiate bean of type ">
	//   44   84:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   45   87:pop             
			stringbuilder.append(_classInfo.getAnnotated().getName());
	//   46   88:aload_3         
	//   47   89:aload_0         
	//   48   90:getfield        #50  <Field AnnotatedClass _classInfo>
	//   49   93:invokevirtual   #457 <Method Class AnnotatedClass.getAnnotated()>
	//   50   96:invokevirtual   #141 <Method String Class.getName()>
	//   51   99:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   52  102:pop             
			stringbuilder.append(": (");
	//   53  103:aload_3         
	//   54  104:ldc2            #459 <String ": (">
	//   55  107:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   56  110:pop             
			stringbuilder.append(obj1.getClass().getName());
	//   57  111:aload_3         
	//   58  112:aload_2         
	//   59  113:invokevirtual   #159 <Method Class Object.getClass()>
	//   60  116:invokevirtual   #141 <Method String Class.getName()>
	//   61  119:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   62  122:pop             
			stringbuilder.append(") ");
	//   63  123:aload_3         
	//   64  124:ldc2            #461 <String ") ">
	//   65  127:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   66  130:pop             
			stringbuilder.append(((Throwable) (obj1)).getMessage());
	//   67  131:aload_3         
	//   68  132:aload_2         
	//   69  133:invokevirtual   #464 <Method String Throwable.getMessage()>
	//   70  136:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   71  139:pop             
			throw new IllegalArgumentException(stringbuilder.toString(), ((Throwable) (obj1)));
	//   72  140:new             #190 <Class IllegalArgumentException>
	//   73  143:dup             
	//   74  144:aload_3         
	//   75  145:invokevirtual   #148 <Method String StringBuilder.toString()>
	//   76  148:aload_2         
	//   77  149:invokespecial   #467 <Method void IllegalArgumentException(String, Throwable)>
	//   78  152:athrow          
		}
		return obj;
	}

	protected boolean isFactoryMethod(AnnotatedMethod annotatedmethod)
	{
		Object obj = ((Object) (annotatedmethod.getRawReturnType()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #470 <Method Class AnnotatedMethod.getRawReturnType()>
	//    2    4:astore_2        
		if(!getBeanClass().isAssignableFrom(((Class) (obj))))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #473 <Method Class getBeanClass()>
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #109 <Method boolean Class.isAssignableFrom(Class)>
	//*   7   13:ifne            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		obj = ((Object) (_annotationIntrospector.findCreatorAnnotation(_config, ((Annotated) (annotatedmethod)))));
	//   10   18:aload_0         
	//   11   19:getfield        #42  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_0         
	//   13   23:getfield        #40  <Field MapperConfig _config>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #477 <Method com.fasterxml.jackson.annotation.JsonCreator$Mode AnnotationIntrospector.findCreatorAnnotation(MapperConfig, Annotated)>
	//   16   30:astore_2        
		if(obj != null && obj != com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED)
	//*  17   31:aload_2         
	//*  18   32:ifnull          44
	//*  19   35:aload_2         
	//*  20   36:getstatic       #483 <Field com.fasterxml.jackson.annotation.JsonCreator$Mode com.fasterxml.jackson.annotation.JsonCreator$Mode.DISABLED>
	//*  21   39:if_acmpeq       44
			return true;
	//   22   42:iconst_1        
	//   23   43:ireturn         
		obj = ((Object) (annotatedmethod.getName()));
	//   24   44:aload_1         
	//   25   45:invokevirtual   #223 <Method String AnnotatedMethod.getName()>
	//   26   48:astore_2        
		if("valueOf".equals(obj) && annotatedmethod.getParameterCount() == 1)
	//*  27   49:ldc2            #485 <String "valueOf">
	//*  28   52:aload_2         
	//*  29   53:invokevirtual   #488 <Method boolean String.equals(Object)>
	//*  30   56:ifeq            69
	//*  31   59:aload_1         
	//*  32   60:invokevirtual   #334 <Method int AnnotatedMethod.getParameterCount()>
	//*  33   63:iconst_1        
	//*  34   64:icmpne          69
			return true;
	//   35   67:iconst_1        
	//   36   68:ireturn         
		if("fromString".equals(obj) && annotatedmethod.getParameterCount() == 1)
	//*  37   69:ldc2            #490 <String "fromString">
	//*  38   72:aload_2         
	//*  39   73:invokevirtual   #488 <Method boolean String.equals(Object)>
	//*  40   76:ifeq            111
	//*  41   79:aload_1         
	//*  42   80:invokevirtual   #334 <Method int AnnotatedMethod.getParameterCount()>
	//*  43   83:iconst_1        
	//*  44   84:icmpne          111
		{
			annotatedmethod = ((AnnotatedMethod) (annotatedmethod.getRawParameterType(0)));
	//   45   87:aload_1         
	//   46   88:iconst_0        
	//   47   89:invokevirtual   #218 <Method Class AnnotatedMethod.getRawParameterType(int)>
	//   48   92:astore_1        
			if(annotatedmethod == java/lang/String || ((Class) (java/lang/CharSequence)).isAssignableFrom(((Class) (annotatedmethod))))
	//*  49   93:aload_1         
	//*  50   94:ldc1            #220 <Class String>
	//*  51   96:if_acmpeq       109
	//*  52   99:ldc2            #492 <Class CharSequence>
	//*  53  102:aload_1         
	//*  54  103:invokevirtual   #109 <Method boolean Class.isAssignableFrom(Class)>
	//*  55  106:ifeq            111
				return true;
	//   56  109:iconst_1        
	//   57  110:ireturn         
		}
		return false;
	//   58  111:iconst_0        
	//   59  112:ireturn         
	}

	public boolean removeProperty(String s)
	{
		for(Iterator iterator = _properties().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #180 <Method List _properties()>
	//*   2    4:invokeinterface #237 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            46
			if(((BeanPropertyDefinition)iterator.next()).getName().equals(((Object) (s))))
	//*   7   19:aload_2         
	//*   8   20:invokeinterface #246 <Method Object Iterator.next()>
	//*   9   25:checkcast       #170 <Class BeanPropertyDefinition>
	//*  10   28:invokevirtual   #495 <Method String BeanPropertyDefinition.getName()>
	//*  11   31:aload_1         
	//*  12   32:invokevirtual   #488 <Method boolean String.equals(Object)>
	//*  13   35:ifeq            10
			{
				iterator.remove();
	//   14   38:aload_2         
	//   15   39:invokeinterface #498 <Method void Iterator.remove()>
				return true;
	//   16   44:iconst_1        
	//   17   45:ireturn         
			}

		return false;
	//   18   46:iconst_0        
	//   19   47:ireturn         
	}

	private static final Class NO_VIEWS[] = new Class[0];
	protected final AnnotationIntrospector _annotationIntrospector;
	protected final AnnotatedClass _classInfo;
	protected final MapperConfig _config;
	protected Class _defaultViews[];
	protected boolean _defaultViewsResolved;
	protected ObjectIdInfo _objectIdInfo;
	protected final POJOPropertiesCollector _propCollector;
	protected List _properties;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Class[]
	//    2    4:putstatic       #30  <Field Class[] NO_VIEWS>
	//*   3    7:return          
	}
}
