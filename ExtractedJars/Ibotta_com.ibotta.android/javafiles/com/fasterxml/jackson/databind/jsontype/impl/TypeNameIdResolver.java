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

	protected TypeNameIdResolver(MapperConfig mapperconfig, JavaType javatype, Map map, Map map1)
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
		_typeToId = map;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field Map _typeToId>
		_idToType = map1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field Map _idToType>
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
		if(flag != flag1)
	//*   0    0:iload_3         
	//*   1    1:iload           4
	//*   2    3:icmpeq          200
		{
			HashMap hashmap = null;
	//    3    6:aconst_null     
	//    4    7:astore          6
			Object obj;
			if(flag)
	//*   5    9:iload_3         
	//*   6   10:ifeq            25
				obj = ((Object) (new HashMap()));
	//    7   13:new             #55  <Class HashMap>
	//    8   16:dup             
	//    9   17:invokespecial   #58  <Method void HashMap()>
	//   10   20:astore          5
			else
	//*  11   22:goto            28
				obj = null;
	//   12   25:aconst_null     
	//   13   26:astore          5
			if(flag1)
	//*  14   28:iload           4
	//*  15   30:ifeq            51
			{
				hashmap = new HashMap();
	//   16   33:new             #55  <Class HashMap>
	//   17   36:dup             
	//   18   37:invokespecial   #58  <Method void HashMap()>
	//   19   40:astore          6
				obj = ((Object) (new TreeMap()));
	//   20   42:new             #60  <Class TreeMap>
	//   21   45:dup             
	//   22   46:invokespecial   #61  <Method void TreeMap()>
	//   23   49:astore          5
			}
			if(collection != null)
	//*  24   51:aload_2         
	//*  25   52:ifnull          186
			{
				Iterator iterator = collection.iterator();
	//   26   55:aload_2         
	//   27   56:invokeinterface #67  <Method Iterator Collection.iterator()>
	//   28   61:astore          7
				do
				{
					if(!iterator.hasNext())
						break;
	//   29   63:aload           7
	//   30   65:invokeinterface #73  <Method boolean Iterator.hasNext()>
	//   31   70:ifeq            186
					collection = ((Collection) ((NamedType)iterator.next()));
	//   32   73:aload           7
	//   33   75:invokeinterface #77  <Method Object Iterator.next()>
	//   34   80:checkcast       #79  <Class NamedType>
	//   35   83:astore_2        
					Class class1 = ((NamedType) (collection)).getType();
	//   36   84:aload_2         
	//   37   85:invokevirtual   #83  <Method Class NamedType.getType()>
	//   38   88:astore          8
					if(((NamedType) (collection)).hasName())
	//*  39   90:aload_2         
	//*  40   91:invokevirtual   #86  <Method boolean NamedType.hasName()>
	//*  41   94:ifeq            105
						collection = ((Collection) (((NamedType) (collection)).getName()));
	//   42   97:aload_2         
	//   43   98:invokevirtual   #87  <Method String NamedType.getName()>
	//   44  101:astore_2        
					else
	//*  45  102:goto            111
						collection = ((Collection) (_defaultTypeId(class1)));
	//   46  105:aload           8
	//   47  107:invokestatic    #89  <Method String _defaultTypeId(Class)>
	//   48  110:astore_2        
					if(flag)
	//*  49  111:iload_3         
	//*  50  112:ifeq            129
						((Map) (obj)).put(((Object) (class1.getName())), ((Object) (collection)));
	//   51  115:aload           5
	//   52  117:aload           8
	//   53  119:invokevirtual   #40  <Method String Class.getName()>
	//   54  122:aload_2         
	//   55  123:invokeinterface #95  <Method Object Map.put(Object, Object)>
	//   56  128:pop             
					if(flag1)
	//*  57  129:iload           4
	//*  58  131:ifeq            63
					{
						JavaType javatype1 = (JavaType)((Map) (hashmap)).get(((Object) (collection)));
	//   59  134:aload           6
	//   60  136:aload_2         
	//   61  137:invokeinterface #99  <Method Object Map.get(Object)>
	//   62  142:checkcast       #101 <Class JavaType>
	//   63  145:astore          9
						if(javatype1 == null || !class1.isAssignableFrom(javatype1.getRawClass()))
	//*  64  147:aload           9
	//*  65  149:ifnull          168
	//*  66  152:aload           8
	//*  67  154:aload           9
	//*  68  156:invokevirtual   #104 <Method Class JavaType.getRawClass()>
	//*  69  159:invokevirtual   #108 <Method boolean Class.isAssignableFrom(Class)>
	//*  70  162:ifeq            168
	//*  71  165:goto            63
							((Map) (hashmap)).put(((Object) (collection)), ((Object) (mapperconfig.constructType(class1))));
	//   72  168:aload           6
	//   73  170:aload_2         
	//   74  171:aload_0         
	//   75  172:aload           8
	//   76  174:invokevirtual   #112 <Method JavaType MapperConfig.constructType(Class)>
	//   77  177:invokeinterface #95  <Method Object Map.put(Object, Object)>
	//   78  182:pop             
					}
				} while(true);
	//   79  183:goto            63
			}
			return new TypeNameIdResolver(mapperconfig, javatype, ((Map) (obj)), ((Map) (hashmap)));
	//   80  186:new             #2   <Class TypeNameIdResolver>
	//   81  189:dup             
	//   82  190:aload_0         
	//   83  191:aload_1         
	//   84  192:aload           5
	//   85  194:aload           6
	//   86  196:invokespecial   #114 <Method void TypeNameIdResolver(MapperConfig, JavaType, Map, Map)>
	//   87  199:areturn         
		} else
		{
			throw new IllegalArgumentException();
	//   88  200:new             #116 <Class IllegalArgumentException>
	//   89  203:dup             
	//   90  204:invokespecial   #117 <Method void IllegalArgumentException()>
	//   91  207:athrow          
		}
	}

	protected JavaType _typeFromId(String s)
	{
		return (JavaType)_idToType.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Map _idToType>
	//    2    4:aload_1         
	//    3    5:invokeinterface #99  <Method Object Map.get(Object)>
	//    4   10:checkcast       #101 <Class JavaType>
	//    5   13:areturn         
	}

	public String getDescForKnownTypeIds()
	{
		return (new TreeSet(((Collection) (_idToType.keySet())))).toString();
	//    0    0:new             #123 <Class TreeSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field Map _idToType>
	//    4    8:invokeinterface #127 <Method java.util.Set Map.keySet()>
	//    5   13:invokespecial   #130 <Method void TreeSet(Collection)>
	//    6   16:invokevirtual   #133 <Method String TreeSet.toString()>
	//    7   19:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.Id getMechanism()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME;
	//    0    0:getstatic       #141 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.NAME>
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
	//    5    7:getfield        #146 <Field TypeFactory _typeFactory>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #151 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    8   14:invokevirtual   #104 <Method Class JavaType.getRawClass()>
	//    9   17:astore          5
		s = class2.getName();
	//   10   19:aload           5
	//   11   21:invokevirtual   #40  <Method String Class.getName()>
	//   12   24:astore          4
		Map map = _typeToId;
	//   13   26:aload_0         
	//   14   27:getfield        #27  <Field Map _typeToId>
	//   15   30:astore_3        
		map;
	//   16   31:aload_3         
		JVM INSTR monitorenter ;
	//   17   32:monitorenter    
		class1 = ((Class) ((String)_typeToId.get(((Object) (s)))));
	//   18   33:aload_0         
	//   19   34:getfield        #27  <Field Map _typeToId>
	//   20   37:aload           4
	//   21   39:invokeinterface #99  <Method Object Map.get(Object)>
	//   22   44:checkcast       #42  <Class String>
	//   23   47:astore_1        
		Object obj;
		obj = ((Object) (class1));
	//   24   48:aload_1         
	//   25   49:astore_2        
		if(class1 != null)
			break MISSING_BLOCK_LABEL_114;
	//   26   50:aload_1         
	//   27   51:ifnonnull       114
		if(_config.isAnnotationProcessingEnabled())
	//*  28   54:aload_0         
	//*  29   55:getfield        #25  <Field MapperConfig _config>
	//*  30   58:invokevirtual   #154 <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*  31   61:ifeq            89
		{
			class1 = ((Class) (_config.introspectClassAnnotations(class2)));
	//   32   64:aload_0         
	//   33   65:getfield        #25  <Field MapperConfig _config>
	//   34   68:aload           5
	//   35   70:invokevirtual   #158 <Method BeanDescription MapperConfig.introspectClassAnnotations(Class)>
	//   36   73:astore_1        
			class1 = ((Class) (_config.getAnnotationIntrospector().findTypeName(((BeanDescription) (class1)).getClassInfo())));
	//   37   74:aload_0         
	//   38   75:getfield        #25  <Field MapperConfig _config>
	//   39   78:invokevirtual   #162 <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   40   81:aload_1         
	//   41   82:invokevirtual   #168 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//   42   85:invokevirtual   #174 <Method String AnnotationIntrospector.findTypeName(com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   43   88:astore_1        
		}
		obj = ((Object) (class1));
	//   44   89:aload_1         
	//   45   90:astore_2        
		if(class1 != null)
			break MISSING_BLOCK_LABEL_101;
	//   46   91:aload_1         
	//   47   92:ifnonnull       101
		obj = ((Object) (_defaultTypeId(class2)));
	//   48   95:aload           5
	//   49   97:invokestatic    #89  <Method String _defaultTypeId(Class)>
	//   50  100:astore_2        
		_typeToId.put(((Object) (s)), obj);
	//   51  101:aload_0         
	//   52  102:getfield        #27  <Field Map _typeToId>
	//   53  105:aload           4
	//   54  107:aload_2         
	//   55  108:invokeinterface #95  <Method Object Map.put(Object, Object)>
	//   56  113:pop             
		map;
	//   57  114:aload_3         
		JVM INSTR monitorexit ;
	//   58  115:monitorexit     
		return ((String) (obj));
	//   59  116:aload_2         
	//   60  117:areturn         
		class1;
	//   61  118:astore_1        
		map;
	//   62  119:aload_3         
		JVM INSTR monitorexit ;
	//   63  120:monitorexit     
		throw class1;
	//   64  121:aload_1         
	//   65  122:athrow          
	}

	public String idFromValue(Object obj)
	{
		return idFromClass(obj.getClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #181 <Method Class Object.getClass()>
	//    3    5:invokevirtual   #183 <Method String idFromClass(Class)>
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
	//    4    6:invokevirtual   #183 <Method String idFromClass(Class)>
	//    5    9:areturn         
		else
			return idFromValue(obj);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #187 <Method String idFromValue(Object)>
	//    9   15:areturn         
	}

	public String toString()
	{
		return String.format("[%s; id-to-type=%s]", new Object[] {
			((Object)this).getClass().getName(), _idToType
		});
	//    0    0:ldc1            #190 <String "[%s; id-to-type=%s]">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokevirtual   #181 <Method Class Object.getClass()>
	//    7   12:invokevirtual   #40  <Method String Class.getName()>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #29  <Field Map _idToType>
	//   13   22:aastore         
	//   14   23:invokestatic    #194 <Method String String.format(String, Object[])>
	//   15   26:areturn         
	}

	public JavaType typeFromId(DatabindContext databindcontext, String s)
	{
		return _typeFromId(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #198 <Method JavaType _typeFromId(String)>
	//    3    5:areturn         
	}

	protected final MapperConfig _config;
	protected final Map _idToType;
	protected final Map _typeToId;
}
