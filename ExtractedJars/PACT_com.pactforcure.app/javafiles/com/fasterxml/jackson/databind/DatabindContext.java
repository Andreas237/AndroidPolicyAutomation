// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JavaType, JsonMappingException, AnnotationIntrospector, MapperFeature

public abstract class DatabindContext
{

	public DatabindContext()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract boolean canOverrideAccessModifiers();

	public JavaType constructSpecializedType(JavaType javatype, Class class1)
	{
		if(javatype.getRawClass() == class1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #19  <Method Class JavaType.getRawClass()>
	//*   2    4:aload_2         
	//*   3    5:if_acmpne       10
			return javatype;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return getConfig().constructSpecializedType(javatype, class1);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #23  <Method MapperConfig getConfig()>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #27  <Method JavaType MapperConfig.constructSpecializedType(JavaType, Class)>
	//   11   19:areturn         
	}

	public JavaType constructType(Type type)
	{
		return getTypeFactory().constructType(type);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method TypeFactory getTypeFactory()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method JavaType TypeFactory.constructType(Type)>
	//    4    8:areturn         
	}

	public Converter converterInstance(Annotated annotated, Object obj)
		throws JsonMappingException
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(obj == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       8
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		if(obj instanceof Converter)
	//*   6    8:aload_2         
	//*   7    9:instanceof      #45  <Class Converter>
	//*   8   12:ifeq            20
			return (Converter)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #45  <Class Converter>
	//   11   19:areturn         
		if(!(obj instanceof Class))
	//*  12   20:aload_2         
	//*  13   21:instanceof      #47  <Class Class>
	//*  14   24:ifne            65
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Converter definition of type ").append(obj.getClass().getName()).append("; expected type Converter or Class<Converter> instead").toString());
	//   15   27:new             #49  <Class IllegalStateException>
	//   16   30:dup             
	//   17   31:new             #51  <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #52  <Method void StringBuilder()>
	//   20   38:ldc1            #54  <String "AnnotationIntrospector returned Converter definition of type ">
	//   21   40:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:aload_2         
	//   23   44:invokevirtual   #61  <Method Class Object.getClass()>
	//   24   47:invokevirtual   #65  <Method String Class.getName()>
	//   25   50:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:ldc1            #67  <String "; expected type Converter or Class<Converter> instead">
	//   27   55:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   29   61:invokespecial   #73  <Method void IllegalStateException(String)>
	//   30   64:athrow          
		Class class1 = (Class)obj;
	//   31   65:aload_2         
	//   32   66:checkcast       #47  <Class Class>
	//   33   69:astore          4
		if(class1 == com/fasterxml/jackson/databind/util/Converter$None || ClassUtil.isBogusClass(class1))
	//*  34   71:aload           4
	//*  35   73:ldc1            #75  <Class com.fasterxml.jackson.databind.util.Converter$None>
	//*  36   75:if_acmpeq       86
	//*  37   78:aload           4
	//*  38   80:invokestatic    #81  <Method boolean ClassUtil.isBogusClass(Class)>
	//*  39   83:ifeq            88
			return null;
	//   40   86:aconst_null     
	//   41   87:areturn         
		if(!((Class) (com/fasterxml/jackson/databind/util/Converter)).isAssignableFrom(class1))
	//*  42   88:ldc1            #45  <Class Converter>
	//*  43   90:aload           4
	//*  44   92:invokevirtual   #84  <Method boolean Class.isAssignableFrom(Class)>
	//*  45   95:ifne            134
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(class1.getName()).append("; expected Class<Converter>").toString());
	//   46   98:new             #49  <Class IllegalStateException>
	//   47  101:dup             
	//   48  102:new             #51  <Class StringBuilder>
	//   49  105:dup             
	//   50  106:invokespecial   #52  <Method void StringBuilder()>
	//   51  109:ldc1            #86  <String "AnnotationIntrospector returned Class ">
	//   52  111:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   53  114:aload           4
	//   54  116:invokevirtual   #65  <Method String Class.getName()>
	//   55  119:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   56  122:ldc1            #88  <String "; expected Class<Converter>">
	//   57  124:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   58  127:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   59  130:invokespecial   #73  <Method void IllegalStateException(String)>
	//   60  133:athrow          
		MapperConfig mapperconfig = getConfig();
	//   61  134:aload_0         
	//   62  135:invokevirtual   #23  <Method MapperConfig getConfig()>
	//   63  138:astore          5
		obj = ((Object) (mapperconfig.getHandlerInstantiator()));
	//   64  140:aload           5
	//   65  142:invokevirtual   #92  <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//   66  145:astore_2        
		if(obj == null)
	//*  67  146:aload_2         
	//*  68  147:ifnonnull       174
			annotated = ((Annotated) (obj1));
	//   69  150:aload_3         
	//   70  151:astore_1        
		else
	//*  71  152:aload_1         
	//*  72  153:astore_2        
	//*  73  154:aload_1         
	//*  74  155:ifnonnull       172
	//*  75  158:aload           4
	//*  76  160:aload           5
	//*  77  162:invokevirtual   #94  <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//*  78  165:invokestatic    #98  <Method Object ClassUtil.createInstance(Class, boolean)>
	//*  79  168:checkcast       #45  <Class Converter>
	//*  80  171:astore_2        
	//*  81  172:aload_2         
	//*  82  173:areturn         
			annotated = ((Annotated) (((HandlerInstantiator) (obj)).converterInstance(mapperconfig, annotated, class1)));
	//   83  174:aload_2         
	//   84  175:aload           5
	//   85  177:aload_1         
	//   86  178:aload           4
	//   87  180:invokevirtual   #103 <Method Converter HandlerInstantiator.converterInstance(MapperConfig, Annotated, Class)>
	//   88  183:astore_1        
		obj = ((Object) (annotated));
		if(annotated == null)
			obj = ((Object) ((Converter)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers())));
		return ((Converter) (obj));
	//*  89  184:goto            152
	}

	public abstract Class getActiveView();

	public abstract AnnotationIntrospector getAnnotationIntrospector();

	public abstract Object getAttribute(Object obj);

	public abstract MapperConfig getConfig();

	public abstract com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class class1);

	public abstract Locale getLocale();

	public abstract TimeZone getTimeZone();

	public abstract TypeFactory getTypeFactory();

	public abstract boolean isEnabled(MapperFeature mapperfeature);

	public ObjectIdGenerator objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectidinfo)
		throws JsonMappingException
	{
		Class class1 = objectidinfo.getGeneratorType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #125 <Method Class ObjectIdInfo.getGeneratorType()>
	//    2    4:astore          4
		MapperConfig mapperconfig = getConfig();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #23  <Method MapperConfig getConfig()>
	//    5   10:astore          5
		Object obj = ((Object) (mapperconfig.getHandlerInstantiator()));
	//    6   12:aload           5
	//    7   14:invokevirtual   #92  <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//    8   17:astore_3        
		if(obj == null)
	//*   9   18:aload_3         
	//*  10   19:ifnonnull       53
			annotated = null;
	//   11   22:aconst_null     
	//   12   23:astore_1        
		else
	//*  13   24:aload_1         
	//*  14   25:astore_3        
	//*  15   26:aload_1         
	//*  16   27:ifnonnull       44
	//*  17   30:aload           4
	//*  18   32:aload           5
	//*  19   34:invokevirtual   #94  <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//*  20   37:invokestatic    #98  <Method Object ClassUtil.createInstance(Class, boolean)>
	//*  21   40:checkcast       #127 <Class ObjectIdGenerator>
	//*  22   43:astore_3        
	//*  23   44:aload_3         
	//*  24   45:aload_2         
	//*  25   46:invokevirtual   #130 <Method Class ObjectIdInfo.getScope()>
	//*  26   49:invokevirtual   #134 <Method ObjectIdGenerator ObjectIdGenerator.forScope(Class)>
	//*  27   52:areturn         
			annotated = ((Annotated) (((HandlerInstantiator) (obj)).objectIdGeneratorInstance(mapperconfig, annotated, class1)));
	//   28   53:aload_3         
	//   29   54:aload           5
	//   30   56:aload_1         
	//   31   57:aload           4
	//   32   59:invokevirtual   #137 <Method ObjectIdGenerator HandlerInstantiator.objectIdGeneratorInstance(MapperConfig, Annotated, Class)>
	//   33   62:astore_1        
		obj = ((Object) (annotated));
		if(annotated == null)
			obj = ((Object) ((ObjectIdGenerator)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers())));
		return ((ObjectIdGenerator) (obj)).forScope(objectidinfo.getScope());
	//*  34   63:goto            24
	}

	public ObjectIdResolver objectIdResolverInstance(Annotated annotated, ObjectIdInfo objectidinfo)
	{
		Class class1 = objectidinfo.getResolverType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #143 <Method Class ObjectIdInfo.getResolverType()>
	//    2    4:astore_3        
		MapperConfig mapperconfig = getConfig();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #23  <Method MapperConfig getConfig()>
	//    5    9:astore          4
		objectidinfo = ((ObjectIdInfo) (mapperconfig.getHandlerInstantiator()));
	//    6   11:aload           4
	//    7   13:invokevirtual   #92  <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//    8   16:astore_2        
		if(objectidinfo == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       44
			annotated = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
		else
	//*  13   23:aload_1         
	//*  14   24:astore_2        
	//*  15   25:aload_1         
	//*  16   26:ifnonnull       42
	//*  17   29:aload_3         
	//*  18   30:aload           4
	//*  19   32:invokevirtual   #94  <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//*  20   35:invokestatic    #98  <Method Object ClassUtil.createInstance(Class, boolean)>
	//*  21   38:checkcast       #145 <Class ObjectIdResolver>
	//*  22   41:astore_2        
	//*  23   42:aload_2         
	//*  24   43:areturn         
			annotated = ((Annotated) (((HandlerInstantiator) (objectidinfo)).resolverIdGeneratorInstance(mapperconfig, annotated, class1)));
	//   25   44:aload_2         
	//   26   45:aload           4
	//   27   47:aload_1         
	//   28   48:aload_3         
	//   29   49:invokevirtual   #149 <Method ObjectIdResolver HandlerInstantiator.resolverIdGeneratorInstance(MapperConfig, Annotated, Class)>
	//   30   52:astore_1        
		objectidinfo = ((ObjectIdInfo) (annotated));
		if(annotated == null)
			objectidinfo = ((ObjectIdInfo) ((ObjectIdResolver)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers())));
		return ((ObjectIdResolver) (objectidinfo));
	//*  31   53:goto            23
	}

	public abstract DatabindContext setAttribute(Object obj, Object obj1);
}
