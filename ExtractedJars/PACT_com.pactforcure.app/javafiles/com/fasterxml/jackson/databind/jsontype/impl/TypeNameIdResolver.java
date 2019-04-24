// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			TypeIdResolverBase

public class TypeNameIdResolver extends TypeIdResolverBase
{

	protected TypeNameIdResolver(MapperConfig mapperconfig, JavaType javatype, HashMap hashmap, HashMap hashmap1)
	{
		super(javatype, mapperconfig.getTypeFactory());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #20  <Method TypeFactory MapperConfig.getTypeFactory()>
	//    4    6:invokespecial   #23  <Method void TypeIdResolverBase(JavaType, TypeFactory)>
		_config = mapperconfig;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #25  <Field MapperConfig _config>
		_typeToId = hashmap;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field HashMap _typeToId>
		_idToType = hashmap1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field HashMap _idToType>
	//   14   25:return          
	}

	protected static String _defaultTypeId(Class class1)
	{
		class1 = ((Class) (class1.getName()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method String Class.getName()>
	//    2    4:astore_0        
		int i = ((String) (class1)).lastIndexOf('.');
	//    3    5:aload_0         
	//    4    6:bipush          46
	//    5    8:invokevirtual   #46  <Method int String.lastIndexOf(int)>
	//    6   11:istore_1        
		if(i < 0)
	//*   7   12:iload_1         
	//*   8   13:ifge            18
			return ((String) (class1));
	//    9   16:aload_0         
	//   10   17:areturn         
		else
			return ((String) (class1)).substring(i + 1);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:iconst_1        
	//   14   21:iadd            
	//   15   22:invokevirtual   #50  <Method String String.substring(int)>
	//   16   25:areturn         
	}

	public static TypeNameIdResolver construct(MapperConfig mapperconfig, JavaType javatype, Collection collection, boolean flag, boolean flag1)
	{
		if(flag == flag1)
	//*   0    0:iload_3         
	//*   1    1:iload           4
	//*   2    3:icmpne          14
			throw new IllegalArgumentException();
	//    3    6:new             #55  <Class IllegalArgumentException>
	//    4    9:dup             
	//    5   10:invokespecial   #58  <Method void IllegalArgumentException()>
	//    6   13:athrow          
		HashMap hashmap = null;
	//    7   14:aconst_null     
	//    8   15:astore          5
		HashMap hashmap1 = null;
	//    9   17:aconst_null     
	//   10   18:astore          6
		if(flag)
	//*  11   20:iload_3         
	//*  12   21:ifeq            33
			hashmap = new HashMap();
	//   13   24:new             #60  <Class HashMap>
	//   14   27:dup             
	//   15   28:invokespecial   #61  <Method void HashMap()>
	//   16   31:astore          5
		if(flag1)
	//*  17   33:iload           4
	//*  18   35:ifeq            47
			hashmap1 = new HashMap();
	//   19   38:new             #60  <Class HashMap>
	//   20   41:dup             
	//   21   42:invokespecial   #61  <Method void HashMap()>
	//   22   45:astore          6
		if(collection != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          173
		{
			Iterator iterator = collection.iterator();
	//   25   51:aload_2         
	//   26   52:invokeinterface #67  <Method Iterator Collection.iterator()>
	//   27   57:astore          7
			do
			{
				if(!iterator.hasNext())
					break;
	//   28   59:aload           7
	//   29   61:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//   30   66:ifeq            173
				collection = ((Collection) ((NamedType)iterator.next()));
	//   31   69:aload           7
	//   32   71:invokeinterface #77  <Method Object Iterator.next()>
	//   33   76:checkcast       #79  <Class NamedType>
	//   34   79:astore_2        
				Class class1 = ((NamedType) (collection)).getType();
	//   35   80:aload_2         
	//   36   81:invokevirtual   #83  <Method Class NamedType.getType()>
	//   37   84:astore          8
				if(((NamedType) (collection)).hasName())
	//*  38   86:aload_2         
	//*  39   87:invokevirtual   #86  <Method boolean NamedType.hasName()>
	//*  40   90:ifeq            164
					collection = ((Collection) (((NamedType) (collection)).getName()));
	//   41   93:aload_2         
	//   42   94:invokevirtual   #87  <Method String NamedType.getName()>
	//   43   97:astore_2        
				else
	//*  44   98:iload_3         
	//*  45   99:ifeq            114
	//*  46  102:aload           5
	//*  47  104:aload           8
	//*  48  106:invokevirtual   #40  <Method String Class.getName()>
	//*  49  109:aload_2         
	//*  50  110:invokevirtual   #91  <Method Object HashMap.put(Object, Object)>
	//*  51  113:pop             
	//*  52  114:iload           4
	//*  53  116:ifeq            59
	//*  54  119:aload           6
	//*  55  121:aload_2         
	//*  56  122:invokevirtual   #95  <Method Object HashMap.get(Object)>
	//*  57  125:checkcast       #97  <Class JavaType>
	//*  58  128:astore          9
	//*  59  130:aload           9
	//*  60  132:ifnull          148
	//*  61  135:aload           8
	//*  62  137:aload           9
	//*  63  139:invokevirtual   #100 <Method Class JavaType.getRawClass()>
	//*  64  142:invokevirtual   #104 <Method boolean Class.isAssignableFrom(Class)>
	//*  65  145:ifne            59
	//*  66  148:aload           6
	//*  67  150:aload_2         
	//*  68  151:aload_0         
	//*  69  152:aload           8
	//*  70  154:invokevirtual   #108 <Method JavaType MapperConfig.constructType(Class)>
	//*  71  157:invokevirtual   #91  <Method Object HashMap.put(Object, Object)>
	//*  72  160:pop             
	//*  73  161:goto            59
					collection = ((Collection) (_defaultTypeId(class1)));
	//   74  164:aload           8
	//   75  166:invokestatic    #110 <Method String _defaultTypeId(Class)>
	//   76  169:astore_2        
				if(flag)
					hashmap.put(((Object) (class1.getName())), ((Object) (collection)));
				if(flag1)
				{
					JavaType javatype1 = (JavaType)hashmap1.get(((Object) (collection)));
					if(javatype1 == null || !class1.isAssignableFrom(javatype1.getRawClass()))
						hashmap1.put(((Object) (collection)), ((Object) (mapperconfig.constructType(class1))));
				}
			} while(true);
		}
	//*  77  170:goto            98
		return new TypeNameIdResolver(mapperconfig, javatype, hashmap, hashmap1);
	//   78  173:new             #2   <Class TypeNameIdResolver>
	//   79  176:dup             
	//   80  177:aload_0         
	//   81  178:aload_1         
	//   82  179:aload           5
	//   83  181:aload           6
	//   84  183:invokespecial   #112 <Method void TypeNameIdResolver(MapperConfig, JavaType, HashMap, HashMap)>
	//   85  186:areturn         
	}

	protected JavaType _typeFromId(String s)
	{
		return (JavaType)_idToType.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field HashMap _idToType>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #95  <Method Object HashMap.get(Object)>
	//    4    8:checkcast       #97  <Class JavaType>
	//    5   11:areturn         
	}

	public String getDescForKnownTypeIds()
	{
		return (new TreeSet(((Collection) (_idToType.keySet())))).toString();
	//    0    0:new             #118 <Class TreeSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field HashMap _idToType>
	//    4    8:invokevirtual   #122 <Method java.util.Set HashMap.keySet()>
	//    5   11:invokespecial   #125 <Method void TreeSet(Collection)>
	//    6   14:invokevirtual   #128 <Method String TreeSet.toString()>
	//    7   17:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.Id getMechanism()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
	//    0    0:getstatic       #136 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NAME>
	//    1    3:areturn         
	}

	protected String idFromClass(Class class1)
	{
		String s;
		Class class2;
		if(class1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		class2 = _typeFactory.constructType(((java.lang.reflect.Type) (class1))).getRawClass();
	//    4    6:aload_0         
	//    5    7:getfield        #141 <Field TypeFactory _typeFactory>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #146 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    8   14:invokevirtual   #100 <Method Class JavaType.getRawClass()>
	//    9   17:astore          5
		s = class2.getName();
	//   10   19:aload           5
	//   11   21:invokevirtual   #40  <Method String Class.getName()>
	//   12   24:astore          4
		HashMap hashmap = _typeToId;
	//   13   26:aload_0         
	//   14   27:getfield        #27  <Field HashMap _typeToId>
	//   15   30:astore_3        
		hashmap;
	//   16   31:aload_3         
		JVM INSTR monitorenter ;
	//   17   32:monitorenter    
		class1 = ((Class) ((String)_typeToId.get(((Object) (s)))));
	//   18   33:aload_0         
	//   19   34:getfield        #27  <Field HashMap _typeToId>
	//   20   37:aload           4
	//   21   39:invokevirtual   #95  <Method Object HashMap.get(Object)>
	//   22   42:checkcast       #42  <Class String>
	//   23   45:astore_1        
		Object obj;
		obj = ((Object) (class1));
	//   24   46:aload_1         
	//   25   47:astore_2        
		if(class1 != null)
			break MISSING_BLOCK_LABEL_110;
	//   26   48:aload_1         
	//   27   49:ifnonnull       110
		if(_config.isAnnotationProcessingEnabled())
	//*  28   52:aload_0         
	//*  29   53:getfield        #25  <Field MapperConfig _config>
	//*  30   56:invokevirtual   #149 <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*  31   59:ifeq            87
		{
			class1 = ((Class) (_config.introspectClassAnnotations(class2)));
	//   32   62:aload_0         
	//   33   63:getfield        #25  <Field MapperConfig _config>
	//   34   66:aload           5
	//   35   68:invokevirtual   #153 <Method BeanDescription MapperConfig.introspectClassAnnotations(Class)>
	//   36   71:astore_1        
			class1 = ((Class) (_config.getAnnotationIntrospector().findTypeName(((BeanDescription) (class1)).getClassInfo())));
	//   37   72:aload_0         
	//   38   73:getfield        #25  <Field MapperConfig _config>
	//   39   76:invokevirtual   #157 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   40   79:aload_1         
	//   41   80:invokevirtual   #163 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   42   83:invokevirtual   #169 <Method String AnnotationIntrospector.findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   43   86:astore_1        
		}
		obj = ((Object) (class1));
	//   44   87:aload_1         
	//   45   88:astore_2        
		if(class1 != null)
			break MISSING_BLOCK_LABEL_99;
	//   46   89:aload_1         
	//   47   90:ifnonnull       99
		obj = ((Object) (_defaultTypeId(class2)));
	//   48   93:aload           5
	//   49   95:invokestatic    #110 <Method String _defaultTypeId(Class)>
	//   50   98:astore_2        
		_typeToId.put(((Object) (s)), obj);
	//   51   99:aload_0         
	//   52  100:getfield        #27  <Field HashMap _typeToId>
	//   53  103:aload           4
	//   54  105:aload_2         
	//   55  106:invokevirtual   #91  <Method Object HashMap.put(Object, Object)>
	//   56  109:pop             
		hashmap;
	//   57  110:aload_3         
		JVM INSTR monitorexit ;
	//   58  111:monitorexit     
		return ((String) (obj));
	//   59  112:aload_2         
	//   60  113:areturn         
		class1;
	//   61  114:astore_1        
		hashmap;
	//   62  115:aload_3         
		JVM INSTR monitorexit ;
	//   63  116:monitorexit     
		throw class1;
	//   64  117:aload_1         
	//   65  118:athrow          
	}

	public String idFromValue(Object obj)
	{
		return idFromClass(obj.getClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #176 <Method Class Object.getClass()>
	//    3    5:invokevirtual   #178 <Method String idFromClass(Class)>
	//    4    8:areturn         
	}

	public String idFromValueAndType(Object obj, Class class1)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
			return idFromClass(class1);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #178 <Method String idFromClass(Class)>
	//    5    9:areturn         
		else
			return idFromValue(obj);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #182 <Method String idFromValue(Object)>
	//    9   15:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #185 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #186 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append('[').append(((Object)this).getClass().getName());
	//    4    8:aload_1         
	//    5    9:bipush          91
	//    6   11:invokevirtual   #190 <Method StringBuilder StringBuilder.append(char)>
	//    7   14:aload_0         
	//    8   15:invokevirtual   #176 <Method Class Object.getClass()>
	//    9   18:invokevirtual   #40  <Method String Class.getName()>
	//   10   21:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		stringbuilder.append("; id-to-type=").append(((Object) (_idToType)));
	//   12   25:aload_1         
	//   13   26:ldc1            #195 <String "; id-to-type=">
	//   14   28:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:aload_0         
	//   16   32:getfield        #29  <Field HashMap _idToType>
	//   17   35:invokevirtual   #198 <Method StringBuilder StringBuilder.append(Object)>
	//   18   38:pop             
		stringbuilder.append(']');
	//   19   39:aload_1         
	//   20   40:bipush          93
	//   21   42:invokevirtual   #190 <Method StringBuilder StringBuilder.append(char)>
	//   22   45:pop             
		return stringbuilder.toString();
	//   23   46:aload_1         
	//   24   47:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   25   50:areturn         
	}

	public JavaType typeFromId(DatabindContext databindcontext, String s)
	{
		return _typeFromId(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #203 <Method JavaType _typeFromId(String)>
	//    3    5:areturn         
	}

	public JavaType typeFromId(String s)
	{
		return _typeFromId(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #203 <Method JavaType _typeFromId(String)>
	//    3    5:areturn         
	}

	protected final MapperConfig _config;
	protected final HashMap _idToType;
	protected final HashMap _typeToId;
}
