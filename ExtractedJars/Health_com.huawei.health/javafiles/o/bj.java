// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package o:
//			bl, bi, bk, fsu, 
//			bn, bh

public final class bj
	implements bl, bi
{

	public bj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	private static Map e(Type type)
	{
		do
		{
			if(type == java/util/Properties)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #19  <Class Properties>
	//*   2    3:if_acmpne       14
				return ((Map) (new Properties()));
	//    3    6:new             #19  <Class Properties>
	//    4    9:dup             
	//    5   10:invokespecial   #20  <Method void Properties()>
	//    6   13:areturn         
			if(type == java/util/Hashtable)
	//*   7   14:aload_0         
	//*   8   15:ldc1            #22  <Class Hashtable>
	//*   9   17:if_acmpne       28
				return ((Map) (new Hashtable()));
	//   10   20:new             #22  <Class Hashtable>
	//   11   23:dup             
	//   12   24:invokespecial   #23  <Method void Hashtable()>
	//   13   27:areturn         
			if(type == java/util/IdentityHashMap)
	//*  14   28:aload_0         
	//*  15   29:ldc1            #25  <Class IdentityHashMap>
	//*  16   31:if_acmpne       42
				return ((Map) (new IdentityHashMap()));
	//   17   34:new             #25  <Class IdentityHashMap>
	//   18   37:dup             
	//   19   38:invokespecial   #26  <Method void IdentityHashMap()>
	//   20   41:areturn         
			if(type == java/util/SortedMap || type == java/util/TreeMap)
	//*  21   42:aload_0         
	//*  22   43:ldc1            #28  <Class SortedMap>
	//*  23   45:if_acmpeq       54
	//*  24   48:aload_0         
	//*  25   49:ldc1            #30  <Class TreeMap>
	//*  26   51:if_acmpne       62
				return ((Map) (new TreeMap()));
	//   27   54:new             #30  <Class TreeMap>
	//   28   57:dup             
	//   29   58:invokespecial   #31  <Method void TreeMap()>
	//   30   61:areturn         
			if(type == java/util/concurrent/ConcurrentMap || type == java/util/concurrent/ConcurrentHashMap)
	//*  31   62:aload_0         
	//*  32   63:ldc1            #33  <Class ConcurrentMap>
	//*  33   65:if_acmpeq       74
	//*  34   68:aload_0         
	//*  35   69:ldc1            #35  <Class ConcurrentHashMap>
	//*  36   71:if_acmpne       82
				return ((Map) (new ConcurrentHashMap()));
	//   37   74:new             #35  <Class ConcurrentHashMap>
	//   38   77:dup             
	//   39   78:invokespecial   #36  <Method void ConcurrentHashMap()>
	//   40   81:areturn         
			if(type == java/util/Map || type == java/util/HashMap)
	//*  41   82:aload_0         
	//*  42   83:ldc1            #38  <Class Map>
	//*  43   85:if_acmpeq       94
	//*  44   88:aload_0         
	//*  45   89:ldc1            #40  <Class HashMap>
	//*  46   91:if_acmpne       102
				return ((Map) (new HashMap()));
	//   47   94:new             #40  <Class HashMap>
	//   48   97:dup             
	//   49   98:invokespecial   #41  <Method void HashMap()>
	//   50  101:areturn         
			if(type == java/util/LinkedHashMap)
	//*  51  102:aload_0         
	//*  52  103:ldc1            #43  <Class LinkedHashMap>
	//*  53  105:if_acmpne       116
				return ((Map) (new LinkedHashMap()));
	//   54  108:new             #43  <Class LinkedHashMap>
	//   55  111:dup             
	//   56  112:invokespecial   #44  <Method void LinkedHashMap()>
	//   57  115:areturn         
			if(!(type instanceof ParameterizedType))
				break;
	//   58  116:aload_0         
	//   59  117:instanceof      #46  <Class ParameterizedType>
	//   60  120:ifeq            136
			type = ((ParameterizedType)type).getRawType();
	//   61  123:aload_0         
	//   62  124:checkcast       #46  <Class ParameterizedType>
	//   63  127:invokeinterface #50  <Method Type ParameterizedType.getRawType()>
	//   64  132:astore_0        
		} while(true);
	//   65  133:goto            0
		Object obj = ((Object) ((Class)type));
	//   66  136:aload_0         
	//   67  137:checkcast       #52  <Class Class>
	//   68  140:astore_1        
		if(((Class) (obj)).isInterface())
	//*  69  141:aload_1         
	//*  70  142:invokevirtual   #56  <Method boolean Class.isInterface()>
	//*  71  145:ifeq            172
			throw new IllegalArgumentException((new StringBuilder("unsupport type ")).append(((Object) (type))).toString());
	//   72  148:new             #58  <Class IllegalArgumentException>
	//   73  151:dup             
	//   74  152:new             #60  <Class StringBuilder>
	//   75  155:dup             
	//   76  156:ldc1            #62  <String "unsupport type ">
	//   77  158:invokespecial   #65  <Method void StringBuilder(String)>
	//   78  161:aload_0         
	//   79  162:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
	//   80  165:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   81  168:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//   82  171:athrow          
		try
		{
			obj = ((Object) ((Map)((Class) (obj)).newInstance()));
	//   83  172:aload_1         
	//   84  173:invokevirtual   #78  <Method Object Class.newInstance()>
	//   85  176:checkcast       #38  <Class Map>
	//   86  179:astore_1        
		}
	//*  87  180:aload_1         
	//*  88  181:areturn         
		catch(Exception exception)
	//*  89  182:astore_1        
		{
			throw new IllegalArgumentException((new StringBuilder("unsupport type ")).append(((Object) (type))).toString(), ((Throwable) (exception)));
	//   90  183:new             #58  <Class IllegalArgumentException>
	//   91  186:dup             
	//   92  187:new             #60  <Class StringBuilder>
	//   93  190:dup             
	//   94  191:ldc1            #62  <String "unsupport type ">
	//   95  193:invokespecial   #65  <Method void StringBuilder(String)>
	//   96  196:aload_0         
	//   97  197:invokevirtual   #69  <Method StringBuilder StringBuilder.append(Object)>
	//   98  200:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   99  203:aload_1         
	//  100  204:invokespecial   #81  <Method void IllegalArgumentException(String, Throwable)>
	//  101  207:athrow          
		}
		return ((Map) (obj));
	}

	public final Object b(Object obj)
	{
		TreeMap treemap = new TreeMap();
	//    0    0:new             #30  <Class TreeMap>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void TreeMap()>
	//    3    7:astore_2        
		java.util.Map.Entry entry;
		for(obj = ((Object) (((Map)obj).entrySet().iterator())); ((Iterator) (obj)).hasNext(); ((Map) (treemap)).put(((Object) ((String)entry.getKey())), bk.d(entry.getValue())))
	//*   4    8:aload_1         
	//*   5    9:checkcast       #38  <Class Map>
	//*   6   12:invokeinterface #89  <Method Set Map.entrySet()>
	//*   7   17:invokeinterface #95  <Method Iterator Set.iterator()>
	//*   8   22:astore_1        
	//*   9   23:aload_1         
	//*  10   24:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            92
		{
			entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   12   32:aload_1         
	//   13   33:invokeinterface #103 <Method Object Iterator.next()>
	//   14   38:checkcast       #105 <Class java.util.Map$Entry>
	//   15   41:astore_3        
			if(!(entry.getKey() instanceof String))
	//*  16   42:aload_3         
	//*  17   43:invokeinterface #108 <Method Object java.util.Map$Entry.getKey()>
	//*  18   48:instanceof      #110 <Class String>
	//*  19   51:ifne            64
				throw new IllegalArgumentException("Map key must be String!");
	//   20   54:new             #58  <Class IllegalArgumentException>
	//   21   57:dup             
	//   22   58:ldc1            #112 <String "Map key must be String!">
	//   23   60:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//   24   63:athrow          
		}

	//   25   64:aload_2         
	//   26   65:aload_3         
	//   27   66:invokeinterface #108 <Method Object java.util.Map$Entry.getKey()>
	//   28   71:checkcast       #110 <Class String>
	//   29   74:aload_3         
	//   30   75:invokeinterface #115 <Method Object java.util.Map$Entry.getValue()>
	//   31   80:invokestatic    #120 <Method Object bk.d(Object)>
	//   32   83:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//   33   88:pop             
	//*  34   89:goto            23
		return ((Object) (treemap));
	//   35   92:aload_2         
	//   36   93:areturn         
	}

	public final Object d(Object obj, Type type)
	{
		if(!((Object) (obj.getClass())).equals(o/fsu))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #129 <Method Class Object.getClass()>
	//*   2    4:ldc1            #131 <Class fsu>
	//*   3    6:invokevirtual   #135 <Method boolean Object.equals(Object)>
	//*   4    9:ifne            14
			return ((Object) (null));
	//    5   12:aconst_null     
	//    6   13:areturn         
		obj = ((Object) ((fsu)obj));
	//    7   14:aload_1         
	//    8   15:checkcast       #131 <Class fsu>
	//    9   18:astore_1        
		Map map = e(type);
	//   10   19:aload_2         
	//   11   20:invokestatic    #137 <Method Map e(Type)>
	//   12   23:astore_3        
		if(type instanceof ParameterizedType)
	//*  13   24:aload_2         
	//*  14   25:instanceof      #46  <Class ParameterizedType>
	//*  15   28:ifeq            152
		{
			type = ((Type) ((ParameterizedType)type));
	//   16   31:aload_2         
	//   17   32:checkcast       #46  <Class ParameterizedType>
	//   18   35:astore_2        
			Type type1 = ((ParameterizedType) (type)).getActualTypeArguments()[0];
	//   19   36:aload_2         
	//   20   37:invokeinterface #141 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   21   42:iconst_0        
	//   22   43:aaload          
	//   23   44:astore          4
			type = ((ParameterizedType) (type)).getActualTypeArguments()[1];
	//   24   46:aload_2         
	//   25   47:invokeinterface #141 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   26   52:iconst_1        
	//   27   53:aaload          
	//   28   54:astore_2        
			if(java/lang/String == type1)
	//*  29   55:ldc1            #110 <Class String>
	//*  30   57:aload           4
	//*  31   59:if_acmpne       142
			{
				for(Iterator iterator = ((fsu) (obj)).c(); iterator.hasNext();)
	//*  32   62:aload_1         
	//*  33   63:invokevirtual   #144 <Method Iterator fsu.c()>
	//*  34   66:astore          4
	//*  35   68:aload           4
	//*  36   70:invokeinterface #100 <Method boolean Iterator.hasNext()>
	//*  37   75:ifeq            140
				{
					String s = (String)iterator.next();
	//   38   78:aload           4
	//   39   80:invokeinterface #103 <Method Object Iterator.next()>
	//   40   85:checkcast       #110 <Class String>
	//   41   88:astore          5
					if(bn.e((Class)type))
	//*  42   90:aload_2         
	//*  43   91:checkcast       #52  <Class Class>
	//*  44   94:invokestatic    #149 <Method boolean bn.e(Class)>
	//*  45   97:ifeq            118
						map.put(((Object) (s)), ((fsu) (obj)).e(s));
	//   46  100:aload_3         
	//   47  101:aload           5
	//   48  103:aload_1         
	//   49  104:aload           5
	//   50  106:invokevirtual   #152 <Method Object fsu.e(String)>
	//   51  109:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//   52  114:pop             
					else
	//*  53  115:goto            68
						map.put(((Object) (s)), bh.a(((fsu) (obj)).e(s), type));
	//   54  118:aload_3         
	//   55  119:aload           5
	//   56  121:aload_1         
	//   57  122:aload           5
	//   58  124:invokevirtual   #152 <Method Object fsu.e(String)>
	//   59  127:aload_2         
	//   60  128:invokestatic    #157 <Method Object bh.a(Object, Type)>
	//   61  131:invokeinterface #124 <Method Object Map.put(Object, Object)>
	//   62  136:pop             
				}

	//*  63  137:goto            68
				return ((Object) (map));
	//   64  140:aload_3         
	//   65  141:areturn         
			} else
			{
				throw new IllegalArgumentException("Deserialize Map Key must be String.class");
	//   66  142:new             #58  <Class IllegalArgumentException>
	//   67  145:dup             
	//   68  146:ldc1            #159 <String "Deserialize Map Key must be String.class">
	//   69  148:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//   70  151:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Deserialize Map must be Generics!");
	//   71  152:new             #58  <Class IllegalArgumentException>
	//   72  155:dup             
	//   73  156:ldc1            #161 <String "Deserialize Map must be Generics!">
	//   74  158:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//   75  161:athrow          
		}
	}

	public final boolean e(Class class1)
	{
		return ((Class) (java/util/Map)).isAssignableFrom(class1);
	//    0    0:ldc1            #38  <Class Map>
	//    1    2:aload_1         
	//    2    3:invokevirtual   #164 <Method boolean Class.isAssignableFrom(Class)>
	//    3    6:ireturn         
	}
}
