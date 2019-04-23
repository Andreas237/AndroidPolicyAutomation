// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.ArraySet;
import java.util.*;

public final class CollectionUtils
{

	private CollectionUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static boolean isEmpty(Collection collection)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		else
			return collection.isEmpty();
	//    4    6:aload_0         
	//    5    7:invokeinterface #18  <Method boolean Collection.isEmpty()>
	//    6   12:ireturn         
	}

	public static List listOf()
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #30  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public static List listOf(Object obj)
	{
		return Collections.singletonList(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #36  <Method List Collections.singletonList(Object)>
	//    2    4:areturn         
	}

	public static transient List listOf(Object aobj[])
	{
		switch(aobj.length)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
		{
	//*   2    2:tableswitch     0 1: default 24
	//	               0 39
	//	               1 32
		default:
			return Collections.unmodifiableList(Arrays.asList(aobj));
	//    3   24:aload_0         
	//    4   25:invokestatic    #43  <Method List Arrays.asList(Object[])>
	//    5   28:invokestatic    #47  <Method List Collections.unmodifiableList(List)>
	//    6   31:areturn         

		case 1: // '\001'
			return listOf(aobj[0]);
	//    7   32:aload_0         
	//    8   33:iconst_0        
	//    9   34:aaload          
	//   10   35:invokestatic    #49  <Method List listOf(Object)>
	//   11   38:areturn         

		case 0: // '\0'
			return listOf();
	//   12   39:invokestatic    #51  <Method List listOf()>
	//   13   42:areturn         
		}
	}

	public static Map mapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		Map map = zzb(3, false);
	//    0    0:iconst_3        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #58  <Method Map zzb(int, boolean)>
	//    3    5:astore          6
		map.put(obj, obj1);
	//    4    7:aload           6
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		map.put(obj2, obj3);
	//    9   17:aload           6
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		map.put(obj4, obj5);
	//   14   27:aload           6
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
		return Collections.unmodifiableMap(map);
	//   19   39:aload           6
	//   20   41:invokestatic    #68  <Method Map Collections.unmodifiableMap(Map)>
	//   21   44:areturn         
	}

	public static Map mapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
			Object obj8, Object obj9, Object obj10, Object obj11)
	{
		Map map = zzb(6, false);
	//    0    0:bipush          6
	//    1    2:iconst_0        
	//    2    3:invokestatic    #58  <Method Map zzb(int, boolean)>
	//    3    6:astore          12
		map.put(obj, obj1);
	//    4    8:aload           12
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//    8   17:pop             
		map.put(obj2, obj3);
	//    9   18:aload           12
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   13   27:pop             
		map.put(obj4, obj5);
	//   14   28:aload           12
	//   15   30:aload           4
	//   16   32:aload           5
	//   17   34:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   18   39:pop             
		map.put(obj6, obj7);
	//   19   40:aload           12
	//   20   42:aload           6
	//   21   44:aload           7
	//   22   46:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   23   51:pop             
		map.put(obj8, obj9);
	//   24   52:aload           12
	//   25   54:aload           8
	//   26   56:aload           9
	//   27   58:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   28   63:pop             
		map.put(obj10, obj11);
	//   29   64:aload           12
	//   30   66:aload           10
	//   31   68:aload           11
	//   32   70:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   33   75:pop             
		return Collections.unmodifiableMap(map);
	//   34   76:aload           12
	//   35   78:invokestatic    #68  <Method Map Collections.unmodifiableMap(Map)>
	//   36   81:areturn         
	}

	public static Map mapOfKeyValueArrays(Object aobj[], Object aobj1[])
	{
		if(aobj.length == aobj1.length)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:icmpne          94
		{
			int k = aobj.length;
	//    5    7:aload_0         
	//    6    8:arraylength     
	//    7    9:istore_3        
			int i = 0;
	//    8   10:iconst_0        
	//    9   11:istore_2        
			Map map;
			switch(k)
	//*  10   12:iload_3         
			{
	//*  11   13:tableswitch     0 1: default 36
	//	               0 57
	//	               1 47
			default:
				map = zzb(aobj.length, false);
	//   12   36:aload_0         
	//   13   37:arraylength     
	//   14   38:iconst_0        
	//   15   39:invokestatic    #58  <Method Map zzb(int, boolean)>
	//   16   42:astore          4
				break;

	//*  17   44:goto            61
			case 1: // '\001'
				return Collections.singletonMap(aobj[0], aobj1[0]);
	//   18   47:aload_0         
	//   19   48:iconst_0        
	//   20   49:aaload          
	//   21   50:aload_1         
	//   22   51:iconst_0        
	//   23   52:aaload          
	//   24   53:invokestatic    #77  <Method Map Collections.singletonMap(Object, Object)>
	//   25   56:areturn         

			case 0: // '\0'
				return Collections.emptyMap();
	//   26   57:invokestatic    #81  <Method Map Collections.emptyMap()>
	//   27   60:areturn         
			}
			for(; i < aobj.length; i++)
	//*  28   61:iload_2         
	//*  29   62:aload_0         
	//*  30   63:arraylength     
	//*  31   64:icmpge          88
				map.put(aobj[i], aobj1[i]);
	//   32   67:aload           4
	//   33   69:aload_0         
	//   34   70:iload_2         
	//   35   71:aaload          
	//   36   72:aload_1         
	//   37   73:iload_2         
	//   38   74:aaload          
	//   39   75:invokeinterface #64  <Method Object Map.put(Object, Object)>
	//   40   80:pop             

	//   41   81:iload_2         
	//   42   82:iconst_1        
	//   43   83:iadd            
	//   44   84:istore_2        
	//*  45   85:goto            61
			return Collections.unmodifiableMap(map);
	//   46   88:aload           4
	//   47   90:invokestatic    #68  <Method Map Collections.unmodifiableMap(Map)>
	//   48   93:areturn         
		} else
		{
			int j = aobj.length;
	//   49   94:aload_0         
	//   50   95:arraylength     
	//   51   96:istore_2        
			int l = aobj1.length;
	//   52   97:aload_1         
	//   53   98:arraylength     
	//   54   99:istore_3        
			aobj = ((Object []) (new StringBuilder(66)));
	//   55  100:new             #83  <Class StringBuilder>
	//   56  103:dup             
	//   57  104:bipush          66
	//   58  106:invokespecial   #86  <Method void StringBuilder(int)>
	//   59  109:astore_0        
			((StringBuilder) (aobj)).append("Key and values array lengths not equal: ");
	//   60  110:aload_0         
	//   61  111:ldc1            #88  <String "Key and values array lengths not equal: ">
	//   62  113:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   63  116:pop             
			((StringBuilder) (aobj)).append(j);
	//   64  117:aload_0         
	//   65  118:iload_2         
	//   66  119:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   67  122:pop             
			((StringBuilder) (aobj)).append(" != ");
	//   68  123:aload_0         
	//   69  124:ldc1            #97  <String " != ">
	//   70  126:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   71  129:pop             
			((StringBuilder) (aobj)).append(l);
	//   72  130:aload_0         
	//   73  131:iload_3         
	//   74  132:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   75  135:pop             
			throw new IllegalArgumentException(((StringBuilder) (aobj)).toString());
	//   76  136:new             #99  <Class IllegalArgumentException>
	//   77  139:dup             
	//   78  140:aload_0         
	//   79  141:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   80  144:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   81  147:athrow          
		}
	}

	public static Set mutableSetOfWithSize(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            12
			return ((Set) (new ArraySet()));
	//    2    4:new             #111 <Class ArraySet>
	//    3    7:dup             
	//    4    8:invokespecial   #112 <Method void ArraySet()>
	//    5   11:areturn         
		else
			return zza(i, true);
	//    6   12:iload_0         
	//    7   13:iconst_1        
	//    8   14:invokestatic    #116 <Method Set zza(int, boolean)>
	//    9   17:areturn         
	}

	public static Set setOf(Object obj, Object obj1, Object obj2)
	{
		Set set = zza(3, false);
	//    0    0:iconst_3        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #116 <Method Set zza(int, boolean)>
	//    3    5:astore_3        
		set.add(obj);
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:invokeinterface #125 <Method boolean Set.add(Object)>
	//    7   13:pop             
		set.add(obj1);
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:invokeinterface #125 <Method boolean Set.add(Object)>
	//   11   21:pop             
		set.add(obj2);
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokeinterface #125 <Method boolean Set.add(Object)>
	//   15   29:pop             
		return Collections.unmodifiableSet(set);
	//   16   30:aload_3         
	//   17   31:invokestatic    #129 <Method Set Collections.unmodifiableSet(Set)>
	//   18   34:areturn         
	}

	public static transient Set setOf(Object aobj[])
	{
		switch(aobj.length)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
		{
	//*   2    2:tableswitch     0 4: default 36
	//	               0 174
	//	               1 167
	//	               2 132
	//	               3 119
	//	               4 54
		default:
			Set set = zza(aobj.length, false);
	//    3   36:aload_0         
	//    4   37:arraylength     
	//    5   38:iconst_0        
	//    6   39:invokestatic    #116 <Method Set zza(int, boolean)>
	//    7   42:astore_1        
			Collections.addAll(((Collection) (set)), aobj);
	//    8   43:aload_1         
	//    9   44:aload_0         
	//   10   45:invokestatic    #135 <Method boolean Collections.addAll(Collection, Object[])>
	//   11   48:pop             
			return Collections.unmodifiableSet(set);
	//   12   49:aload_1         
	//   13   50:invokestatic    #129 <Method Set Collections.unmodifiableSet(Set)>
	//   14   53:areturn         

		case 4: // '\004'
			Object obj = aobj[0];
	//   15   54:aload_0         
	//   16   55:iconst_0        
	//   17   56:aaload          
	//   18   57:astore_1        
			Object obj2 = aobj[1];
	//   19   58:aload_0         
	//   20   59:iconst_1        
	//   21   60:aaload          
	//   22   61:astore_2        
			Object obj3 = aobj[2];
	//   23   62:aload_0         
	//   24   63:iconst_2        
	//   25   64:aaload          
	//   26   65:astore_3        
			aobj = ((Object []) (aobj[3]));
	//   27   66:aload_0         
	//   28   67:iconst_3        
	//   29   68:aaload          
	//   30   69:astore_0        
			Set set2 = zza(4, false);
	//   31   70:iconst_4        
	//   32   71:iconst_0        
	//   33   72:invokestatic    #116 <Method Set zza(int, boolean)>
	//   34   75:astore          4
			set2.add(obj);
	//   35   77:aload           4
	//   36   79:aload_1         
	//   37   80:invokeinterface #125 <Method boolean Set.add(Object)>
	//   38   85:pop             
			set2.add(obj2);
	//   39   86:aload           4
	//   40   88:aload_2         
	//   41   89:invokeinterface #125 <Method boolean Set.add(Object)>
	//   42   94:pop             
			set2.add(obj3);
	//   43   95:aload           4
	//   44   97:aload_3         
	//   45   98:invokeinterface #125 <Method boolean Set.add(Object)>
	//   46  103:pop             
			set2.add(((Object) (aobj)));
	//   47  104:aload           4
	//   48  106:aload_0         
	//   49  107:invokeinterface #125 <Method boolean Set.add(Object)>
	//   50  112:pop             
			return Collections.unmodifiableSet(set2);
	//   51  113:aload           4
	//   52  115:invokestatic    #129 <Method Set Collections.unmodifiableSet(Set)>
	//   53  118:areturn         

		case 3: // '\003'
			return setOf(aobj[0], aobj[1], aobj[2]);
	//   54  119:aload_0         
	//   55  120:iconst_0        
	//   56  121:aaload          
	//   57  122:aload_0         
	//   58  123:iconst_1        
	//   59  124:aaload          
	//   60  125:aload_0         
	//   61  126:iconst_2        
	//   62  127:aaload          
	//   63  128:invokestatic    #137 <Method Set setOf(Object, Object, Object)>
	//   64  131:areturn         

		case 2: // '\002'
			Object obj1 = aobj[0];
	//   65  132:aload_0         
	//   66  133:iconst_0        
	//   67  134:aaload          
	//   68  135:astore_1        
			aobj = ((Object []) (aobj[1]));
	//   69  136:aload_0         
	//   70  137:iconst_1        
	//   71  138:aaload          
	//   72  139:astore_0        
			Set set1 = zza(2, false);
	//   73  140:iconst_2        
	//   74  141:iconst_0        
	//   75  142:invokestatic    #116 <Method Set zza(int, boolean)>
	//   76  145:astore_2        
			set1.add(obj1);
	//   77  146:aload_2         
	//   78  147:aload_1         
	//   79  148:invokeinterface #125 <Method boolean Set.add(Object)>
	//   80  153:pop             
			set1.add(((Object) (aobj)));
	//   81  154:aload_2         
	//   82  155:aload_0         
	//   83  156:invokeinterface #125 <Method boolean Set.add(Object)>
	//   84  161:pop             
			return Collections.unmodifiableSet(set1);
	//   85  162:aload_2         
	//   86  163:invokestatic    #129 <Method Set Collections.unmodifiableSet(Set)>
	//   87  166:areturn         

		case 1: // '\001'
			return Collections.singleton(aobj[0]);
	//   88  167:aload_0         
	//   89  168:iconst_0        
	//   90  169:aaload          
	//   91  170:invokestatic    #141 <Method Set Collections.singleton(Object)>
	//   92  173:areturn         

		case 0: // '\0'
			return Collections.emptySet();
	//   93  174:invokestatic    #145 <Method Set Collections.emptySet()>
	//   94  177:areturn         
		}
	}

	private static Set zza(int i, boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			f = 0.75F;
	//    2    4:ldc1            #147 <Float 0.75F>
	//    3    6:fstore_2        
		else
	//*   4    7:goto            12
			f = 1.0F;
	//    5   10:fconst_1        
	//    6   11:fstore_2        
		char c;
		if(flag)
	//*   7   12:iload_1         
	//*   8   13:ifeq            23
			c = '\200';
	//    9   16:sipush          128
	//   10   19:istore_3        
		else
	//*  11   20:goto            27
			c = '\u0100';
	//   12   23:sipush          256
	//   13   26:istore_3        
		if(i <= c)
	//*  14   27:iload_0         
	//*  15   28:iload_3         
	//*  16   29:icmpgt          41
			return ((Set) (new ArraySet(i)));
	//   17   32:new             #111 <Class ArraySet>
	//   18   35:dup             
	//   19   36:iload_0         
	//   20   37:invokespecial   #148 <Method void ArraySet(int)>
	//   21   40:areturn         
		else
			return ((Set) (new HashSet(i, f)));
	//   22   41:new             #150 <Class HashSet>
	//   23   44:dup             
	//   24   45:iload_0         
	//   25   46:fload_2         
	//   26   47:invokespecial   #153 <Method void HashSet(int, float)>
	//   27   50:areturn         
	}

	private static Map zzb(int i, boolean flag)
	{
		if(i <= 256)
	//*   0    0:iload_0         
	//*   1    1:sipush          256
	//*   2    4:icmpgt          16
			return ((Map) (new ArrayMap(i)));
	//    3    7:new             #156 <Class ArrayMap>
	//    4   10:dup             
	//    5   11:iload_0         
	//    6   12:invokespecial   #157 <Method void ArrayMap(int)>
	//    7   15:areturn         
		else
			return ((Map) (new HashMap(i, 1.0F)));
	//    8   16:new             #159 <Class HashMap>
	//    9   19:dup             
	//   10   20:iload_0         
	//   11   21:fconst_1        
	//   12   22:invokespecial   #160 <Method void HashMap(int, float)>
	//   13   25:areturn         
	}
}
