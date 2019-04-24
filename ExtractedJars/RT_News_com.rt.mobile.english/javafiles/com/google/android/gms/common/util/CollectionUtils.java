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
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Map inOrderMapOf()
	{
		return mapOf();
	//    0    0:invokestatic    #14  <Method Map mapOf()>
	//    1    3:areturn         
	}

	public static Map inOrderMapOf(Object obj, Object obj1)
	{
		return mapOf(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #19  <Method Map mapOf(Object, Object)>
	//    3    5:areturn         
	}

	public static Map inOrderMapOf(Object obj, Object obj1, Object obj2, Object obj3)
	{
		Map map = zzg(2, false);
	//    0    0:iconst_2        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    3    5:astore          4
		map.put(obj, obj1);
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		map.put(obj2, obj3);
	//    9   17:aload           4
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		return Collections.unmodifiableMap(map);
	//   14   27:aload           4
	//   15   29:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   16   32:areturn         
	}

	public static Map inOrderMapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		Map map = zzg(3, false);
	//    0    0:iconst_3        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    3    5:astore          6
		map.put(obj, obj1);
	//    4    7:aload           6
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		map.put(obj2, obj3);
	//    9   17:aload           6
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		map.put(obj4, obj5);
	//   14   27:aload           6
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
		return Collections.unmodifiableMap(map);
	//   19   39:aload           6
	//   20   41:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   21   44:areturn         
	}

	public static Map inOrderMapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
	{
		Map map = zzg(4, false);
	//    0    0:iconst_4        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    3    5:astore          8
		map.put(obj, obj1);
	//    4    7:aload           8
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		map.put(obj2, obj3);
	//    9   17:aload           8
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		map.put(obj4, obj5);
	//   14   27:aload           8
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
		map.put(obj6, obj7);
	//   19   39:aload           8
	//   20   41:aload           6
	//   21   43:aload           7
	//   22   45:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   23   50:pop             
		return Collections.unmodifiableMap(map);
	//   24   51:aload           8
	//   25   53:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   26   56:areturn         
	}

	public static Map inOrderMapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
			Object obj8, Object obj9)
	{
		Map map = zzg(5, false);
	//    0    0:iconst_5        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    3    5:astore          10
		map.put(obj, obj1);
	//    4    7:aload           10
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		map.put(obj2, obj3);
	//    9   17:aload           10
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		map.put(obj4, obj5);
	//   14   27:aload           10
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
		map.put(obj6, obj7);
	//   19   39:aload           10
	//   20   41:aload           6
	//   21   43:aload           7
	//   22   45:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   23   50:pop             
		map.put(obj8, obj9);
	//   24   51:aload           10
	//   25   53:aload           8
	//   26   55:aload           9
	//   27   57:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   28   62:pop             
		return Collections.unmodifiableMap(map);
	//   29   63:aload           10
	//   30   65:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   31   68:areturn         
	}

	public static Map inOrderMapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
			Object obj8, Object obj9, Object obj10, Object obj11)
	{
		Map map = zzg(6, false);
	//    0    0:bipush          6
	//    1    2:iconst_0        
	//    2    3:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    3    6:astore          12
		map.put(obj, obj1);
	//    4    8:aload           12
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   17:pop             
		map.put(obj2, obj3);
	//    9   18:aload           12
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   27:pop             
		map.put(obj4, obj5);
	//   14   28:aload           12
	//   15   30:aload           4
	//   16   32:aload           5
	//   17   34:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   18   39:pop             
		map.put(obj6, obj7);
	//   19   40:aload           12
	//   20   42:aload           6
	//   21   44:aload           7
	//   22   46:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   23   51:pop             
		map.put(obj8, obj9);
	//   24   52:aload           12
	//   25   54:aload           8
	//   26   56:aload           9
	//   27   58:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   28   63:pop             
		map.put(obj10, obj11);
	//   29   64:aload           12
	//   30   66:aload           10
	//   31   68:aload           11
	//   32   70:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   33   75:pop             
		return Collections.unmodifiableMap(map);
	//   34   76:aload           12
	//   35   78:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   36   81:areturn         
	}

	public static Map inOrderMapOfKeyValueArrays(Object aobj[], Object aobj1[])
	{
		zza(aobj, aobj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #52  <Method void zza(Object[], Object[])>
		int i = aobj.length;
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:istore_2        
		switch(i)
	//*   6    8:iload_2         
		{
	//*   7    9:tableswitch     0 1: default 32
	//	               0 53
	//	               1 43
		default:
			return Collections.unmodifiableMap(zzb(i, false, aobj, aobj1));
	//    8   32:iload_2         
	//    9   33:iconst_0        
	//   10   34:aload_0         
	//   11   35:aload_1         
	//   12   36:invokestatic    #56  <Method Map zzb(int, boolean, Object[], Object[])>
	//   13   39:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   14   42:areturn         

		case 1: // '\001'
			return inOrderMapOf(aobj[0], aobj1[0]);
	//   15   43:aload_0         
	//   16   44:iconst_0        
	//   17   45:aaload          
	//   18   46:aload_1         
	//   19   47:iconst_0        
	//   20   48:aaload          
	//   21   49:invokestatic    #58  <Method Map inOrderMapOf(Object, Object)>
	//   22   52:areturn         

		case 0: // '\0'
			return inOrderMapOf();
	//   23   53:invokestatic    #60  <Method Map inOrderMapOf()>
	//   24   56:areturn         
		}
	}

	public static Set inOrderSetOf()
	{
		return setOf();
	//    0    0:invokestatic    #66  <Method Set setOf()>
	//    1    3:areturn         
	}

	public static Set inOrderSetOf(Object obj)
	{
		return setOf(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #70  <Method Set setOf(Object)>
	//    2    4:areturn         
	}

	public static Set inOrderSetOf(Object obj, Object obj1)
	{
		Set set = zze(2, false);
	//    0    0:iconst_2        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #76  <Method Set zze(int, boolean)>
	//    3    5:astore_2        
		set.add(obj);
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokeinterface #82  <Method boolean Set.add(Object)>
	//    7   13:pop             
		set.add(obj1);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokeinterface #82  <Method boolean Set.add(Object)>
	//   11   21:pop             
		return Collections.unmodifiableSet(set);
	//   12   22:aload_2         
	//   13   23:invokestatic    #86  <Method Set Collections.unmodifiableSet(Set)>
	//   14   26:areturn         
	}

	public static Set inOrderSetOf(Object obj, Object obj1, Object obj2)
	{
		Set set = zze(3, false);
	//    0    0:iconst_3        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #76  <Method Set zze(int, boolean)>
	//    3    5:astore_3        
		set.add(obj);
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:invokeinterface #82  <Method boolean Set.add(Object)>
	//    7   13:pop             
		set.add(obj1);
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:invokeinterface #82  <Method boolean Set.add(Object)>
	//   11   21:pop             
		set.add(obj2);
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokeinterface #82  <Method boolean Set.add(Object)>
	//   15   29:pop             
		return Collections.unmodifiableSet(set);
	//   16   30:aload_3         
	//   17   31:invokestatic    #86  <Method Set Collections.unmodifiableSet(Set)>
	//   18   34:areturn         
	}

	public static Set inOrderSetOf(Object obj, Object obj1, Object obj2, Object obj3)
	{
		Set set = zze(4, false);
	//    0    0:iconst_4        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #76  <Method Set zze(int, boolean)>
	//    3    5:astore          4
		set.add(obj);
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:invokeinterface #82  <Method boolean Set.add(Object)>
	//    7   15:pop             
		set.add(obj1);
	//    8   16:aload           4
	//    9   18:aload_1         
	//   10   19:invokeinterface #82  <Method boolean Set.add(Object)>
	//   11   24:pop             
		set.add(obj2);
	//   12   25:aload           4
	//   13   27:aload_2         
	//   14   28:invokeinterface #82  <Method boolean Set.add(Object)>
	//   15   33:pop             
		set.add(obj3);
	//   16   34:aload           4
	//   17   36:aload_3         
	//   18   37:invokeinterface #82  <Method boolean Set.add(Object)>
	//   19   42:pop             
		return Collections.unmodifiableSet(set);
	//   20   43:aload           4
	//   21   45:invokestatic    #86  <Method Set Collections.unmodifiableSet(Set)>
	//   22   48:areturn         
	}

	public static transient Set inOrderSetOf(Object aobj[])
	{
		switch(aobj.length)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
		{
	//*   2    2:tableswitch     0 4: default 36
	//	               0 93
	//	               1 86
	//	               2 76
	//	               3 63
	//	               4 47
		default:
			return Collections.unmodifiableSet(zzb(aobj.length, false, aobj));
	//    3   36:aload_0         
	//    4   37:arraylength     
	//    5   38:iconst_0        
	//    6   39:aload_0         
	//    7   40:invokestatic    #95  <Method Set zzb(int, boolean, Object[])>
	//    8   43:invokestatic    #86  <Method Set Collections.unmodifiableSet(Set)>
	//    9   46:areturn         

		case 4: // '\004'
			return inOrderSetOf(aobj[0], aobj[1], aobj[2], aobj[3]);
	//   10   47:aload_0         
	//   11   48:iconst_0        
	//   12   49:aaload          
	//   13   50:aload_0         
	//   14   51:iconst_1        
	//   15   52:aaload          
	//   16   53:aload_0         
	//   17   54:iconst_2        
	//   18   55:aaload          
	//   19   56:aload_0         
	//   20   57:iconst_3        
	//   21   58:aaload          
	//   22   59:invokestatic    #97  <Method Set inOrderSetOf(Object, Object, Object, Object)>
	//   23   62:areturn         

		case 3: // '\003'
			return inOrderSetOf(aobj[0], aobj[1], aobj[2]);
	//   24   63:aload_0         
	//   25   64:iconst_0        
	//   26   65:aaload          
	//   27   66:aload_0         
	//   28   67:iconst_1        
	//   29   68:aaload          
	//   30   69:aload_0         
	//   31   70:iconst_2        
	//   32   71:aaload          
	//   33   72:invokestatic    #99  <Method Set inOrderSetOf(Object, Object, Object)>
	//   34   75:areturn         

		case 2: // '\002'
			return inOrderSetOf(aobj[0], aobj[1]);
	//   35   76:aload_0         
	//   36   77:iconst_0        
	//   37   78:aaload          
	//   38   79:aload_0         
	//   39   80:iconst_1        
	//   40   81:aaload          
	//   41   82:invokestatic    #101 <Method Set inOrderSetOf(Object, Object)>
	//   42   85:areturn         

		case 1: // '\001'
			return inOrderSetOf(aobj[0]);
	//   43   86:aload_0         
	//   44   87:iconst_0        
	//   45   88:aaload          
	//   46   89:invokestatic    #103 <Method Set inOrderSetOf(Object)>
	//   47   92:areturn         

		case 0: // '\0'
			return inOrderSetOf();
	//   48   93:invokestatic    #105 <Method Set inOrderSetOf()>
	//   49   96:areturn         
		}
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
	//    5    7:invokeinterface #114 <Method boolean Collection.isEmpty()>
	//    6   12:ireturn         
	}

	public static boolean isEmpty(Map map)
	{
		if(map == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		else
			return map.isEmpty();
	//    4    6:aload_0         
	//    5    7:invokeinterface #118 <Method boolean Map.isEmpty()>
	//    6   12:ireturn         
	}

	public static List listOf()
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #125 <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public static List listOf(Object obj)
	{
		return Collections.singletonList(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #131 <Method List Collections.singletonList(Object)>
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
	//    4   25:invokestatic    #138 <Method List Arrays.asList(Object[])>
	//    5   28:invokestatic    #142 <Method List Collections.unmodifiableList(List)>
	//    6   31:areturn         

		case 1: // '\001'
			return listOf(aobj[0]);
	//    7   32:aload_0         
	//    8   33:iconst_0        
	//    9   34:aaload          
	//   10   35:invokestatic    #144 <Method List listOf(Object)>
	//   11   38:areturn         

		case 0: // '\0'
			return listOf();
	//   12   39:invokestatic    #146 <Method List listOf()>
	//   13   42:areturn         
		}
	}

	public static Map mapOf()
	{
		return Collections.emptyMap();
	//    0    0:invokestatic    #150 <Method Map Collections.emptyMap()>
	//    1    3:areturn         
	}

	public static Map mapOf(Object obj, Object obj1)
	{
		return Collections.singletonMap(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #153 <Method Map Collections.singletonMap(Object, Object)>
	//    3    5:areturn         
	}

	public static Map mapOf(Object obj, Object obj1, Object obj2, Object obj3)
	{
		Map map = zzf(2, false);
	//    0    0:iconst_2        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    3    5:astore          4
		map.put(obj, obj1);
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		map.put(obj2, obj3);
	//    9   17:aload           4
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		return Collections.unmodifiableMap(map);
	//   14   27:aload           4
	//   15   29:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   16   32:areturn         
	}

	public static Map mapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		Map map = zzf(3, false);
	//    0    0:iconst_3        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    3    5:astore          6
		map.put(obj, obj1);
	//    4    7:aload           6
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		map.put(obj2, obj3);
	//    9   17:aload           6
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		map.put(obj4, obj5);
	//   14   27:aload           6
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
		return Collections.unmodifiableMap(map);
	//   19   39:aload           6
	//   20   41:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   21   44:areturn         
	}

	public static Map mapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
	{
		Map map = zzf(4, false);
	//    0    0:iconst_4        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    3    5:astore          8
		map.put(obj, obj1);
	//    4    7:aload           8
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		map.put(obj2, obj3);
	//    9   17:aload           8
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		map.put(obj4, obj5);
	//   14   27:aload           8
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
		map.put(obj6, obj7);
	//   19   39:aload           8
	//   20   41:aload           6
	//   21   43:aload           7
	//   22   45:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   23   50:pop             
		return Collections.unmodifiableMap(map);
	//   24   51:aload           8
	//   25   53:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   26   56:areturn         
	}

	public static Map mapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
			Object obj8, Object obj9)
	{
		Map map = zzf(5, false);
	//    0    0:iconst_5        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    3    5:astore          10
		map.put(obj, obj1);
	//    4    7:aload           10
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   16:pop             
		map.put(obj2, obj3);
	//    9   17:aload           10
	//   10   19:aload_2         
	//   11   20:aload_3         
	//   12   21:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   26:pop             
		map.put(obj4, obj5);
	//   14   27:aload           10
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   18   38:pop             
		map.put(obj6, obj7);
	//   19   39:aload           10
	//   20   41:aload           6
	//   21   43:aload           7
	//   22   45:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   23   50:pop             
		map.put(obj8, obj9);
	//   24   51:aload           10
	//   25   53:aload           8
	//   26   55:aload           9
	//   27   57:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   28   62:pop             
		return Collections.unmodifiableMap(map);
	//   29   63:aload           10
	//   30   65:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   31   68:areturn         
	}

	public static Map mapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
			Object obj8, Object obj9, Object obj10, Object obj11)
	{
		Map map = zzf(6, false);
	//    0    0:bipush          6
	//    1    2:iconst_0        
	//    2    3:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    3    6:astore          12
		map.put(obj, obj1);
	//    4    8:aload           12
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//    8   17:pop             
		map.put(obj2, obj3);
	//    9   18:aload           12
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   13   27:pop             
		map.put(obj4, obj5);
	//   14   28:aload           12
	//   15   30:aload           4
	//   16   32:aload           5
	//   17   34:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   18   39:pop             
		map.put(obj6, obj7);
	//   19   40:aload           12
	//   20   42:aload           6
	//   21   44:aload           7
	//   22   46:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   23   51:pop             
		map.put(obj8, obj9);
	//   24   52:aload           12
	//   25   54:aload           8
	//   26   56:aload           9
	//   27   58:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   28   63:pop             
		map.put(obj10, obj11);
	//   29   64:aload           12
	//   30   66:aload           10
	//   31   68:aload           11
	//   32   70:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   33   75:pop             
		return Collections.unmodifiableMap(map);
	//   34   76:aload           12
	//   35   78:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   36   81:areturn         
	}

	public static Map mapOfKeyValueArrays(Object aobj[], Object aobj1[])
	{
		zza(aobj, aobj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #52  <Method void zza(Object[], Object[])>
		switch(aobj.length)
	//*   3    5:aload_0         
	//*   4    6:arraylength     
		{
	//*   5    7:tableswitch     0 1: default 28
	//	               0 50
	//	               1 40
		default:
			return Collections.unmodifiableMap(zza(aobj.length, false, aobj, aobj1));
	//    6   28:aload_0         
	//    7   29:arraylength     
	//    8   30:iconst_0        
	//    9   31:aload_0         
	//   10   32:aload_1         
	//   11   33:invokestatic    #159 <Method Map zza(int, boolean, Object[], Object[])>
	//   12   36:invokestatic    #37  <Method Map Collections.unmodifiableMap(Map)>
	//   13   39:areturn         

		case 1: // '\001'
			return mapOf(aobj[0], aobj1[0]);
	//   14   40:aload_0         
	//   15   41:iconst_0        
	//   16   42:aaload          
	//   17   43:aload_1         
	//   18   44:iconst_0        
	//   19   45:aaload          
	//   20   46:invokestatic    #19  <Method Map mapOf(Object, Object)>
	//   21   49:areturn         

		case 0: // '\0'
			return mapOf();
	//   22   50:invokestatic    #14  <Method Map mapOf()>
	//   23   53:areturn         
		}
	}

	public static Map mutableInOrderMapOf()
	{
		return ((Map) (new LinkedHashMap()));
	//    0    0:new             #162 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #163 <Method void LinkedHashMap()>
	//    3    7:areturn         
	}

	public static Map mutableInOrderMapOf(Object obj, Object obj1)
	{
		return mutableInOrderMapOfWithSize(1, obj, obj1);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #167 <Method Map mutableInOrderMapOfWithSize(int, Object, Object)>
	//    4    6:areturn         
	}

	public static Map mutableInOrderMapOf(Object obj, Object obj1, Object obj2, Object obj3)
	{
		return mutableInOrderMapOfWithSize(2, obj, obj1, obj2, obj3);
	//    0    0:iconst_2        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokestatic    #170 <Method Map mutableInOrderMapOfWithSize(int, Object, Object, Object, Object)>
	//    6    8:areturn         
	}

	public static Map mutableInOrderMapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		return mutableInOrderMapOfWithSize(3, obj, obj1, obj2, obj3, obj4, obj5);
	//    0    0:iconst_3        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:aload           5
	//    7    9:invokestatic    #173 <Method Map mutableInOrderMapOfWithSize(int, Object, Object, Object, Object, Object, Object)>
	//    8   12:areturn         
	}

	public static Map mutableInOrderMapOfKeyValueArrays(Object aobj[], Object aobj1[])
	{
		zza(aobj, aobj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #52  <Method void zza(Object[], Object[])>
		int i = aobj.length;
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:istore_2        
		if(i == 0)
	//*   6    8:iload_2         
	//*   7    9:ifne            16
			return mutableInOrderMapOf();
	//    8   12:invokestatic    #176 <Method Map mutableInOrderMapOf()>
	//    9   15:areturn         
		else
			return zzb(i, true, aobj, aobj1);
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokestatic    #56  <Method Map zzb(int, boolean, Object[], Object[])>
	//   15   23:areturn         
	}

	public static Map mutableInOrderMapOfKeyValueArraysWithSize(int i, Object aobj[], Object aobj1[])
	{
		zza(aobj, aobj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #52  <Method void zza(Object[], Object[])>
		int j = Math.max(i, aobj.length);
	//    3    5:iload_0         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokestatic    #184 <Method int Math.max(int, int)>
	//    7   11:istore_3        
		if(j == 0)
	//*   8   12:iload_3         
	//*   9   13:ifne            20
			return mutableInOrderMapOf();
	//   10   16:invokestatic    #176 <Method Map mutableInOrderMapOf()>
	//   11   19:areturn         
		if(aobj.length == 0)
	//*  12   20:aload_1         
	//*  13   21:arraylength     
	//*  14   22:ifne            30
			return mutableInOrderMapOfWithSize(j);
	//   15   25:iload_3         
	//   16   26:invokestatic    #187 <Method Map mutableInOrderMapOfWithSize(int)>
	//   17   29:areturn         
		else
			return zzb(i, true, aobj, aobj1);
	//   18   30:iload_0         
	//   19   31:iconst_1        
	//   20   32:aload_1         
	//   21   33:aload_2         
	//   22   34:invokestatic    #56  <Method Map zzb(int, boolean, Object[], Object[])>
	//   23   37:areturn         
	}

	public static Map mutableInOrderMapOfWithSize(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            8
			return mutableInOrderMapOf();
	//    2    4:invokestatic    #176 <Method Map mutableInOrderMapOf()>
	//    3    7:areturn         
		else
			return zzg(i, true);
	//    4    8:iload_0         
	//    5    9:iconst_1        
	//    6   10:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    7   13:areturn         
	}

	public static Map mutableInOrderMapOfWithSize(int i, Object obj, Object obj1)
	{
		Map map = zzg(Math.max(i, 1), true);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    5    9:astore_3        
		map.put(obj, obj1);
	//    6   10:aload_3         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   10   18:pop             
		return map;
	//   11   19:aload_3         
	//   12   20:areturn         
	}

	public static Map mutableInOrderMapOfWithSize(int i, Object obj, Object obj1, Object obj2, Object obj3)
	{
		Map map = zzg(Math.max(i, 2), true);
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    5    9:astore          5
		map.put(obj, obj1);
	//    6   11:aload           5
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   10   20:pop             
		map.put(obj2, obj3);
	//   11   21:aload           5
	//   12   23:aload_3         
	//   13   24:aload           4
	//   14   26:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   15   31:pop             
		return map;
	//   16   32:aload           5
	//   17   34:areturn         
	}

	public static Map mutableInOrderMapOfWithSize(int i, Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		Map map = zzg(Math.max(i, 3), true);
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    5    9:astore          7
		map.put(obj, obj1);
	//    6   11:aload           7
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   10   20:pop             
		map.put(obj2, obj3);
	//   11   21:aload           7
	//   12   23:aload_3         
	//   13   24:aload           4
	//   14   26:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   15   31:pop             
		map.put(obj4, obj5);
	//   16   32:aload           7
	//   17   34:aload           5
	//   18   36:aload           6
	//   19   38:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   20   43:pop             
		return map;
	//   21   44:aload           7
	//   22   46:areturn         
	}

	public static Set mutableInOrderSetOf()
	{
		return ((Set) (new LinkedHashSet()));
	//    0    0:new             #195 <Class LinkedHashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #196 <Method void LinkedHashSet()>
	//    3    7:areturn         
	}

	public static Set mutableInOrderSetOf(Object obj)
	{
		return mutableInOrderSetOfWithSize(1, obj);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #200 <Method Set mutableInOrderSetOfWithSize(int, Object)>
	//    3    5:areturn         
	}

	public static Set mutableInOrderSetOf(Object obj, Object obj1)
	{
		return mutableInOrderSetOfWithSize(2, obj, obj1);
	//    0    0:iconst_2        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #203 <Method Set mutableInOrderSetOfWithSize(int, Object, Object)>
	//    4    6:areturn         
	}

	public static transient Set mutableInOrderSetOf(Object aobj[])
	{
		if(aobj.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            9
			return mutableInOrderSetOf();
	//    3    5:invokestatic    #205 <Method Set mutableInOrderSetOf()>
	//    4    8:areturn         
		else
			return zzb(aobj.length, true, aobj);
	//    5    9:aload_0         
	//    6   10:arraylength     
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:invokestatic    #95  <Method Set zzb(int, boolean, Object[])>
	//   10   16:areturn         
	}

	public static Set mutableInOrderSetOfWithSize(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            8
			return mutableInOrderSetOf();
	//    2    4:invokestatic    #205 <Method Set mutableInOrderSetOf()>
	//    3    7:areturn         
		else
			return zze(i, true);
	//    4    8:iload_0         
	//    5    9:iconst_1        
	//    6   10:invokestatic    #76  <Method Set zze(int, boolean)>
	//    7   13:areturn         
	}

	public static Set mutableInOrderSetOfWithSize(int i, Object obj)
	{
		Set set = zze(Math.max(i, 1), true);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #76  <Method Set zze(int, boolean)>
	//    5    9:astore_2        
		set.add(obj);
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokeinterface #82  <Method boolean Set.add(Object)>
	//    9   17:pop             
		return set;
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	public static Set mutableInOrderSetOfWithSize(int i, Object obj, Object obj1)
	{
		Set set = zze(Math.max(i, 2), true);
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #76  <Method Set zze(int, boolean)>
	//    5    9:astore_3        
		set.add(obj);
	//    6   10:aload_3         
	//    7   11:aload_1         
	//    8   12:invokeinterface #82  <Method boolean Set.add(Object)>
	//    9   17:pop             
		set.add(obj1);
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokeinterface #82  <Method boolean Set.add(Object)>
	//   13   25:pop             
		return set;
	//   14   26:aload_3         
	//   15   27:areturn         
	}

	public static transient Set mutableInOrderSetOfWithSize(int i, Object aobj[])
	{
		int j = Math.max(i, aobj.length);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:invokestatic    #184 <Method int Math.max(int, int)>
	//    4    6:istore_2        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            15
			return mutableSetOf();
	//    7   11:invokestatic    #213 <Method Set mutableSetOf()>
	//    8   14:areturn         
		if(aobj.length == 0)
	//*   9   15:aload_1         
	//*  10   16:arraylength     
	//*  11   17:ifne            25
			return mutableInOrderSetOfWithSize(i);
	//   12   20:iload_0         
	//   13   21:invokestatic    #215 <Method Set mutableInOrderSetOfWithSize(int)>
	//   14   24:areturn         
		else
			return zzb(j, true, aobj);
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:aload_1         
	//   18   28:invokestatic    #95  <Method Set zzb(int, boolean, Object[])>
	//   19   31:areturn         
	}

	public static List mutableListOf()
	{
		return ((List) (new ArrayList()));
	//    0    0:new             #219 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #220 <Method void ArrayList()>
	//    3    7:areturn         
	}

	public static List mutableListOf(Object obj)
	{
		return mutableListOfWithSize(1, obj);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #224 <Method List mutableListOfWithSize(int, Object)>
	//    3    5:areturn         
	}

	public static List mutableListOf(Object obj, Object obj1)
	{
		return mutableListOfWithSize(2, obj, obj1);
	//    0    0:iconst_2        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #228 <Method List mutableListOfWithSize(int, Object, Object)>
	//    4    6:areturn         
	}

	public static transient List mutableListOf(Object aobj[])
	{
		if(aobj.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            9
			return mutableListOf();
	//    3    5:invokestatic    #231 <Method List mutableListOf()>
	//    4    8:areturn         
		else
			return ((List) (new ArrayList(((Collection) (Arrays.asList(aobj))))));
	//    5    9:new             #219 <Class ArrayList>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokestatic    #138 <Method List Arrays.asList(Object[])>
	//    9   17:invokespecial   #234 <Method void ArrayList(Collection)>
	//   10   20:areturn         
	}

	public static List mutableListOfWithSize(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            8
			return mutableListOf();
	//    2    4:invokestatic    #231 <Method List mutableListOf()>
	//    3    7:areturn         
		else
			return zzc(i, true);
	//    4    8:iload_0         
	//    5    9:iconst_1        
	//    6   10:invokestatic    #239 <Method List zzc(int, boolean)>
	//    7   13:areturn         
	}

	public static List mutableListOfWithSize(int i, Object obj)
	{
		List list = zzc(Math.max(i, 1), true);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #239 <Method List zzc(int, boolean)>
	//    5    9:astore_2        
		list.add(obj);
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokeinterface #243 <Method boolean List.add(Object)>
	//    9   17:pop             
		return list;
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	public static List mutableListOfWithSize(int i, Object obj, Object obj1)
	{
		List list = zzc(Math.max(i, 2), true);
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #239 <Method List zzc(int, boolean)>
	//    5    9:astore_3        
		list.add(obj);
	//    6   10:aload_3         
	//    7   11:aload_1         
	//    8   12:invokeinterface #243 <Method boolean List.add(Object)>
	//    9   17:pop             
		list.add(obj1);
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokeinterface #243 <Method boolean List.add(Object)>
	//   13   25:pop             
		return list;
	//   14   26:aload_3         
	//   15   27:areturn         
	}

	public static transient List mutableListOfWithSize(int i, Object aobj[])
	{
		int j = Math.max(i, aobj.length);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:invokestatic    #184 <Method int Math.max(int, int)>
	//    4    6:istore_2        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            15
			return mutableListOf();
	//    7   11:invokestatic    #231 <Method List mutableListOf()>
	//    8   14:areturn         
		if(aobj.length == 0)
	//*   9   15:aload_1         
	//*  10   16:arraylength     
	//*  11   17:ifne            25
			return mutableListOfWithSize(i);
	//   12   20:iload_0         
	//   13   21:invokestatic    #248 <Method List mutableListOfWithSize(int)>
	//   14   24:areturn         
		if(aobj.length == j)
	//*  15   25:aload_1         
	//*  16   26:arraylength     
	//*  17   27:iload_2         
	//*  18   28:icmpne          43
		{
			return ((List) (new ArrayList(((Collection) (Arrays.asList(aobj))))));
	//   19   31:new             #219 <Class ArrayList>
	//   20   34:dup             
	//   21   35:aload_1         
	//   22   36:invokestatic    #138 <Method List Arrays.asList(Object[])>
	//   23   39:invokespecial   #234 <Method void ArrayList(Collection)>
	//   24   42:areturn         
		} else
		{
			List list = zzc(j, true);
	//   25   43:iload_2         
	//   26   44:iconst_1        
	//   27   45:invokestatic    #239 <Method List zzc(int, boolean)>
	//   28   48:astore_3        
			list.addAll(((Collection) (Arrays.asList(aobj))));
	//   29   49:aload_3         
	//   30   50:aload_1         
	//   31   51:invokestatic    #138 <Method List Arrays.asList(Object[])>
	//   32   54:invokeinterface #251 <Method boolean List.addAll(Collection)>
	//   33   59:pop             
			return list;
	//   34   60:aload_3         
	//   35   61:areturn         
		}
	}

	public static Map mutableMapOf()
	{
		return ((Map) (new ArrayMap()));
	//    0    0:new             #255 <Class ArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #256 <Method void ArrayMap()>
	//    3    7:areturn         
	}

	public static Map mutableMapOf(Object obj, Object obj1)
	{
		return mutableMapOfWithSize(1, obj, obj1);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #259 <Method Map mutableMapOfWithSize(int, Object, Object)>
	//    4    6:areturn         
	}

	public static Map mutableMapOf(Object obj, Object obj1, Object obj2, Object obj3)
	{
		return mutableMapOfWithSize(2, obj, obj1, obj2, obj3);
	//    0    0:iconst_2        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokestatic    #261 <Method Map mutableMapOfWithSize(int, Object, Object, Object, Object)>
	//    6    8:areturn         
	}

	public static Map mutableMapOf(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		return mutableMapOfWithSize(3, obj, obj1, obj2, obj3, obj4, obj5);
	//    0    0:iconst_3        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:aload           5
	//    7    9:invokestatic    #263 <Method Map mutableMapOfWithSize(int, Object, Object, Object, Object, Object, Object)>
	//    8   12:areturn         
	}

	public static Map mutableMapOfKeyValueArrays(Object aobj[], Object aobj1[])
	{
		zza(aobj, aobj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #52  <Method void zza(Object[], Object[])>
		int i = aobj.length;
	//    3    5:aload_0         
	//    4    6:arraylength     
	//    5    7:istore_2        
		if(i == 0)
	//*   6    8:iload_2         
	//*   7    9:ifne            16
			return mutableMapOf();
	//    8   12:invokestatic    #266 <Method Map mutableMapOf()>
	//    9   15:areturn         
		else
			return zza(i, true, aobj, aobj1);
	//   10   16:iload_2         
	//   11   17:iconst_1        
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:invokestatic    #159 <Method Map zza(int, boolean, Object[], Object[])>
	//   15   23:areturn         
	}

	public static Map mutableMapOfKeyValueArraysWithSize(int i, Object aobj[], Object aobj1[])
	{
		zza(aobj, aobj1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #52  <Method void zza(Object[], Object[])>
		int j = Math.max(i, aobj.length);
	//    3    5:iload_0         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokestatic    #184 <Method int Math.max(int, int)>
	//    7   11:istore_3        
		if(j == 0)
	//*   8   12:iload_3         
	//*   9   13:ifne            20
			return mutableMapOf();
	//   10   16:invokestatic    #266 <Method Map mutableMapOf()>
	//   11   19:areturn         
		if(aobj.length == 0)
	//*  12   20:aload_1         
	//*  13   21:arraylength     
	//*  14   22:ifne            30
			return mutableMapOfWithSize(i);
	//   15   25:iload_0         
	//   16   26:invokestatic    #269 <Method Map mutableMapOfWithSize(int)>
	//   17   29:areturn         
		else
			return zza(j, true, aobj, aobj1);
	//   18   30:iload_3         
	//   19   31:iconst_1        
	//   20   32:aload_1         
	//   21   33:aload_2         
	//   22   34:invokestatic    #159 <Method Map zza(int, boolean, Object[], Object[])>
	//   23   37:areturn         
	}

	public static Map mutableMapOfWithSize(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            8
			return mutableMapOf();
	//    2    4:invokestatic    #266 <Method Map mutableMapOf()>
	//    3    7:areturn         
		else
			return zzf(i, true);
	//    4    8:iload_0         
	//    5    9:iconst_1        
	//    6   10:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    7   13:areturn         
	}

	public static Map mutableMapOfWithSize(int i, Object obj, Object obj1)
	{
		Map map = zzf(Math.max(i, 1), true);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    5    9:astore_3        
		map.put(obj, obj1);
	//    6   10:aload_3         
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   10   18:pop             
		return map;
	//   11   19:aload_3         
	//   12   20:areturn         
	}

	public static Map mutableMapOfWithSize(int i, Object obj, Object obj1, Object obj2, Object obj3)
	{
		Map map = zzf(Math.max(i, 2), true);
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    5    9:astore          5
		map.put(obj, obj1);
	//    6   11:aload           5
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   10   20:pop             
		map.put(obj2, obj3);
	//   11   21:aload           5
	//   12   23:aload_3         
	//   13   24:aload           4
	//   14   26:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   15   31:pop             
		return map;
	//   16   32:aload           5
	//   17   34:areturn         
	}

	public static Map mutableMapOfWithSize(int i, Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
	{
		Map map = zzf(Math.max(i, 3), true);
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    5    9:astore          7
		map.put(obj, obj1);
	//    6   11:aload           7
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   10   20:pop             
		map.put(obj2, obj3);
	//   11   21:aload           7
	//   12   23:aload_3         
	//   13   24:aload           4
	//   14   26:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   15   31:pop             
		map.put(obj4, obj5);
	//   16   32:aload           7
	//   17   34:aload           5
	//   18   36:aload           6
	//   19   38:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   20   43:pop             
		return map;
	//   21   44:aload           7
	//   22   46:areturn         
	}

	public static Set mutableSetOf()
	{
		return ((Set) (new ArraySet()));
	//    0    0:new             #271 <Class ArraySet>
	//    1    3:dup             
	//    2    4:invokespecial   #272 <Method void ArraySet()>
	//    3    7:areturn         
	}

	public static Set mutableSetOf(Object obj)
	{
		return mutableSetOfWithSize(1, obj);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:invokestatic    #275 <Method Set mutableSetOfWithSize(int, Object)>
	//    3    5:areturn         
	}

	public static Set mutableSetOf(Object obj, Object obj1)
	{
		return mutableSetOfWithSize(2, obj, obj1);
	//    0    0:iconst_2        
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #277 <Method Set mutableSetOfWithSize(int, Object, Object)>
	//    4    6:areturn         
	}

	public static transient Set mutableSetOf(Object aobj[])
	{
		if(aobj.length == 0)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:ifne            9
			return mutableSetOf();
	//    3    5:invokestatic    #213 <Method Set mutableSetOf()>
	//    4    8:areturn         
		else
			return zza(aobj.length, true, aobj);
	//    5    9:aload_0         
	//    6   10:arraylength     
	//    7   11:iconst_1        
	//    8   12:aload_0         
	//    9   13:invokestatic    #279 <Method Set zza(int, boolean, Object[])>
	//   10   16:areturn         
	}

	public static Set mutableSetOfWithSize(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            8
			return mutableSetOf();
	//    2    4:invokestatic    #213 <Method Set mutableSetOf()>
	//    3    7:areturn         
		else
			return zzd(i, true);
	//    4    8:iload_0         
	//    5    9:iconst_1        
	//    6   10:invokestatic    #282 <Method Set zzd(int, boolean)>
	//    7   13:areturn         
	}

	public static Set mutableSetOfWithSize(int i, Object obj)
	{
		Set set = zzd(Math.max(i, 1), true);
	//    0    0:iload_0         
	//    1    1:iconst_1        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #282 <Method Set zzd(int, boolean)>
	//    5    9:astore_2        
		set.add(obj);
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokeinterface #82  <Method boolean Set.add(Object)>
	//    9   17:pop             
		return set;
	//   10   18:aload_2         
	//   11   19:areturn         
	}

	public static Set mutableSetOfWithSize(int i, Object obj, Object obj1)
	{
		Set set = zzd(Math.max(i, 2), true);
	//    0    0:iload_0         
	//    1    1:iconst_2        
	//    2    2:invokestatic    #184 <Method int Math.max(int, int)>
	//    3    5:iconst_1        
	//    4    6:invokestatic    #282 <Method Set zzd(int, boolean)>
	//    5    9:astore_3        
		set.add(obj);
	//    6   10:aload_3         
	//    7   11:aload_1         
	//    8   12:invokeinterface #82  <Method boolean Set.add(Object)>
	//    9   17:pop             
		set.add(obj1);
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokeinterface #82  <Method boolean Set.add(Object)>
	//   13   25:pop             
		return set;
	//   14   26:aload_3         
	//   15   27:areturn         
	}

	public static transient Set mutableSetOfWithSize(int i, Object aobj[])
	{
		int j = Math.max(i, aobj.length);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:arraylength     
	//    3    3:invokestatic    #184 <Method int Math.max(int, int)>
	//    4    6:istore_2        
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            15
			return mutableSetOf();
	//    7   11:invokestatic    #213 <Method Set mutableSetOf()>
	//    8   14:areturn         
		if(aobj.length == 0)
	//*   9   15:aload_1         
	//*  10   16:arraylength     
	//*  11   17:ifne            25
			return mutableSetOfWithSize(i);
	//   12   20:iload_0         
	//   13   21:invokestatic    #284 <Method Set mutableSetOfWithSize(int)>
	//   14   24:areturn         
		else
			return zza(j, true, aobj);
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:aload_1         
	//   18   28:invokestatic    #279 <Method Set zza(int, boolean, Object[])>
	//   19   31:areturn         
	}

	public static Set setOf()
	{
		return Collections.emptySet();
	//    0    0:invokestatic    #287 <Method Set Collections.emptySet()>
	//    1    3:areturn         
	}

	public static Set setOf(Object obj)
	{
		return Collections.singleton(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #290 <Method Set Collections.singleton(Object)>
	//    2    4:areturn         
	}

	public static Set setOf(Object obj, Object obj1)
	{
		Set set = zzd(2, false);
	//    0    0:iconst_2        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #282 <Method Set zzd(int, boolean)>
	//    3    5:astore_2        
		set.add(obj);
	//    4    6:aload_2         
	//    5    7:aload_0         
	//    6    8:invokeinterface #82  <Method boolean Set.add(Object)>
	//    7   13:pop             
		set.add(obj1);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokeinterface #82  <Method boolean Set.add(Object)>
	//   11   21:pop             
		return Collections.unmodifiableSet(set);
	//   12   22:aload_2         
	//   13   23:invokestatic    #86  <Method Set Collections.unmodifiableSet(Set)>
	//   14   26:areturn         
	}

	public static Set setOf(Object obj, Object obj1, Object obj2)
	{
		Set set = zzd(3, false);
	//    0    0:iconst_3        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #282 <Method Set zzd(int, boolean)>
	//    3    5:astore_3        
		set.add(obj);
	//    4    6:aload_3         
	//    5    7:aload_0         
	//    6    8:invokeinterface #82  <Method boolean Set.add(Object)>
	//    7   13:pop             
		set.add(obj1);
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:invokeinterface #82  <Method boolean Set.add(Object)>
	//   11   21:pop             
		set.add(obj2);
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokeinterface #82  <Method boolean Set.add(Object)>
	//   15   29:pop             
		return Collections.unmodifiableSet(set);
	//   16   30:aload_3         
	//   17   31:invokestatic    #86  <Method Set Collections.unmodifiableSet(Set)>
	//   18   34:areturn         
	}

	public static Set setOf(Object obj, Object obj1, Object obj2, Object obj3)
	{
		Set set = zzd(4, false);
	//    0    0:iconst_4        
	//    1    1:iconst_0        
	//    2    2:invokestatic    #282 <Method Set zzd(int, boolean)>
	//    3    5:astore          4
		set.add(obj);
	//    4    7:aload           4
	//    5    9:aload_0         
	//    6   10:invokeinterface #82  <Method boolean Set.add(Object)>
	//    7   15:pop             
		set.add(obj1);
	//    8   16:aload           4
	//    9   18:aload_1         
	//   10   19:invokeinterface #82  <Method boolean Set.add(Object)>
	//   11   24:pop             
		set.add(obj2);
	//   12   25:aload           4
	//   13   27:aload_2         
	//   14   28:invokeinterface #82  <Method boolean Set.add(Object)>
	//   15   33:pop             
		set.add(obj3);
	//   16   34:aload           4
	//   17   36:aload_3         
	//   18   37:invokeinterface #82  <Method boolean Set.add(Object)>
	//   19   42:pop             
		return Collections.unmodifiableSet(set);
	//   20   43:aload           4
	//   21   45:invokestatic    #86  <Method Set Collections.unmodifiableSet(Set)>
	//   22   48:areturn         
	}

	public static transient Set setOf(Object aobj[])
	{
		switch(aobj.length)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
		{
	//*   2    2:tableswitch     0 4: default 36
	//	               0 93
	//	               1 86
	//	               2 76
	//	               3 63
	//	               4 47
		default:
			return Collections.unmodifiableSet(zza(aobj.length, false, aobj));
	//    3   36:aload_0         
	//    4   37:arraylength     
	//    5   38:iconst_0        
	//    6   39:aload_0         
	//    7   40:invokestatic    #279 <Method Set zza(int, boolean, Object[])>
	//    8   43:invokestatic    #86  <Method Set Collections.unmodifiableSet(Set)>
	//    9   46:areturn         

		case 4: // '\004'
			return setOf(aobj[0], aobj[1], aobj[2], aobj[3]);
	//   10   47:aload_0         
	//   11   48:iconst_0        
	//   12   49:aaload          
	//   13   50:aload_0         
	//   14   51:iconst_1        
	//   15   52:aaload          
	//   16   53:aload_0         
	//   17   54:iconst_2        
	//   18   55:aaload          
	//   19   56:aload_0         
	//   20   57:iconst_3        
	//   21   58:aaload          
	//   22   59:invokestatic    #292 <Method Set setOf(Object, Object, Object, Object)>
	//   23   62:areturn         

		case 3: // '\003'
			return setOf(aobj[0], aobj[1], aobj[2]);
	//   24   63:aload_0         
	//   25   64:iconst_0        
	//   26   65:aaload          
	//   27   66:aload_0         
	//   28   67:iconst_1        
	//   29   68:aaload          
	//   30   69:aload_0         
	//   31   70:iconst_2        
	//   32   71:aaload          
	//   33   72:invokestatic    #294 <Method Set setOf(Object, Object, Object)>
	//   34   75:areturn         

		case 2: // '\002'
			return setOf(aobj[0], aobj[1]);
	//   35   76:aload_0         
	//   36   77:iconst_0        
	//   37   78:aaload          
	//   38   79:aload_0         
	//   39   80:iconst_1        
	//   40   81:aaload          
	//   41   82:invokestatic    #296 <Method Set setOf(Object, Object)>
	//   42   85:areturn         

		case 1: // '\001'
			return setOf(aobj[0]);
	//   43   86:aload_0         
	//   44   87:iconst_0        
	//   45   88:aaload          
	//   46   89:invokestatic    #70  <Method Set setOf(Object)>
	//   47   92:areturn         

		case 0: // '\0'
			return setOf();
	//   48   93:invokestatic    #66  <Method Set setOf()>
	//   49   96:areturn         
		}
	}

	private static Map zza(int i, boolean flag, Object aobj[], Object aobj1[])
	{
		Map map = zzf(i, flag);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #156 <Method Map zzf(int, boolean)>
	//    3    5:astore          4
		zza(map, aobj, aobj1);
	//    4    7:aload           4
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokestatic    #299 <Method void zza(Map, Object[], Object[])>
		return map;
	//    8   14:aload           4
	//    9   16:areturn         
	}

	private static Set zza(int i, boolean flag, Object aobj[])
	{
		Set set = zzd(i, flag);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #282 <Method Set zzd(int, boolean)>
	//    3    5:astore_3        
		Collections.addAll(((Collection) (set)), aobj);
	//    4    6:aload_3         
	//    5    7:aload_2         
	//    6    8:invokestatic    #303 <Method boolean Collections.addAll(Collection, Object[])>
	//    7   11:pop             
		return set;
	//    8   12:aload_3         
	//    9   13:areturn         
	}

	private static void zza(Map map, Object aobj[], Object aobj1[])
	{
		for(int i = 0; i < aobj.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:arraylength     
	//*   5    5:icmpge          28
			map.put(aobj[i], aobj1[i]);
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:iload_3         
	//    9   11:aaload          
	//   10   12:aload_2         
	//   11   13:iload_3         
	//   12   14:aaload          
	//   13   15:invokeinterface #31  <Method Object Map.put(Object, Object)>
	//   14   20:pop             

	//   15   21:iload_3         
	//   16   22:iconst_1        
	//   17   23:iadd            
	//   18   24:istore_3        
	//*  19   25:goto            2
	//   20   28:return          
	}

	private static void zza(Object aobj[], Object aobj1[])
	{
		if(aobj.length != aobj1.length)
	//*   0    0:aload_0         
	//*   1    1:arraylength     
	//*   2    2:aload_1         
	//*   3    3:arraylength     
	//*   4    4:icmpeq          63
		{
			int i = aobj.length;
	//    5    7:aload_0         
	//    6    8:arraylength     
	//    7    9:istore_2        
			int j = aobj1.length;
	//    8   10:aload_1         
	//    9   11:arraylength     
	//   10   12:istore_3        
			aobj = ((Object []) (new StringBuilder(66)));
	//   11   13:new             #307 <Class StringBuilder>
	//   12   16:dup             
	//   13   17:bipush          66
	//   14   19:invokespecial   #310 <Method void StringBuilder(int)>
	//   15   22:astore_0        
			((StringBuilder) (aobj)).append("Key and values array lengths not equal: ");
	//   16   23:aload_0         
	//   17   24:ldc2            #312 <String "Key and values array lengths not equal: ">
	//   18   27:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   19   30:pop             
			((StringBuilder) (aobj)).append(i);
	//   20   31:aload_0         
	//   21   32:iload_2         
	//   22   33:invokevirtual   #319 <Method StringBuilder StringBuilder.append(int)>
	//   23   36:pop             
			((StringBuilder) (aobj)).append(" != ");
	//   24   37:aload_0         
	//   25   38:ldc2            #321 <String " != ">
	//   26   41:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//   27   44:pop             
			((StringBuilder) (aobj)).append(j);
	//   28   45:aload_0         
	//   29   46:iload_3         
	//   30   47:invokevirtual   #319 <Method StringBuilder StringBuilder.append(int)>
	//   31   50:pop             
			throw new IllegalArgumentException(((StringBuilder) (aobj)).toString());
	//   32   51:new             #323 <Class IllegalArgumentException>
	//   33   54:dup             
	//   34   55:aload_0         
	//   35   56:invokevirtual   #327 <Method String StringBuilder.toString()>
	//   36   59:invokespecial   #330 <Method void IllegalArgumentException(String)>
	//   37   62:athrow          
		} else
		{
			return;
	//   38   63:return          
		}
	}

	private static Map zzb(int i, boolean flag, Object aobj[], Object aobj1[])
	{
		Map map = zzg(i, flag);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #25  <Method Map zzg(int, boolean)>
	//    3    5:astore          4
		zza(map, aobj, aobj1);
	//    4    7:aload           4
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokestatic    #299 <Method void zza(Map, Object[], Object[])>
		return map;
	//    8   14:aload           4
	//    9   16:areturn         
	}

	private static Set zzb(int i, boolean flag, Object aobj[])
	{
		Set set = zze(i, flag);
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #76  <Method Set zze(int, boolean)>
	//    3    5:astore_3        
		Collections.addAll(((Collection) (set)), aobj);
	//    4    6:aload_3         
	//    5    7:aload_2         
	//    6    8:invokestatic    #303 <Method boolean Collections.addAll(Collection, Object[])>
	//    7   11:pop             
		return set;
	//    8   12:aload_3         
	//    9   13:areturn         
	}

	private static List zzc(int i, boolean flag)
	{
		return ((List) (new ArrayList(i)));
	//    0    0:new             #219 <Class ArrayList>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #332 <Method void ArrayList(int)>
	//    4    8:areturn         
	}

	private static Set zzd(int i, boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			f = 0.75F;
	//    2    4:ldc2            #334 <Float 0.75F>
	//    3    7:fstore_2        
		else
	//*   4    8:goto            13
			f = 1.0F;
	//    5   11:fconst_1        
	//    6   12:fstore_2        
		char c;
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            24
			c = '\200';
	//    9   17:sipush          128
	//   10   20:istore_3        
		else
	//*  11   21:goto            28
			c = '\u0100';
	//   12   24:sipush          256
	//   13   27:istore_3        
		if(i <= c)
	//*  14   28:iload_0         
	//*  15   29:iload_3         
	//*  16   30:icmpgt          42
			return ((Set) (new ArraySet(i)));
	//   17   33:new             #271 <Class ArraySet>
	//   18   36:dup             
	//   19   37:iload_0         
	//   20   38:invokespecial   #335 <Method void ArraySet(int)>
	//   21   41:areturn         
		else
			return ((Set) (new HashSet(i, f)));
	//   22   42:new             #337 <Class HashSet>
	//   23   45:dup             
	//   24   46:iload_0         
	//   25   47:fload_2         
	//   26   48:invokespecial   #340 <Method void HashSet(int, float)>
	//   27   51:areturn         
	}

	private static Set zze(int i, boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			f = 0.75F;
	//    2    4:ldc2            #334 <Float 0.75F>
	//    3    7:fstore_2        
		else
	//*   4    8:goto            13
			f = 1.0F;
	//    5   11:fconst_1        
	//    6   12:fstore_2        
		return ((Set) (new LinkedHashSet(i, f)));
	//    7   13:new             #195 <Class LinkedHashSet>
	//    8   16:dup             
	//    9   17:iload_0         
	//   10   18:fload_2         
	//   11   19:invokespecial   #342 <Method void LinkedHashSet(int, float)>
	//   12   22:areturn         
	}

	private static Map zzf(int i, boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			f = 0.75F;
	//    2    4:ldc2            #334 <Float 0.75F>
	//    3    7:fstore_2        
		else
	//*   4    8:goto            13
			f = 1.0F;
	//    5   11:fconst_1        
	//    6   12:fstore_2        
		char c;
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            24
			c = '\200';
	//    9   17:sipush          128
	//   10   20:istore_3        
		else
	//*  11   21:goto            28
			c = '\u0100';
	//   12   24:sipush          256
	//   13   27:istore_3        
		if(i <= c)
	//*  14   28:iload_0         
	//*  15   29:iload_3         
	//*  16   30:icmpgt          42
			return ((Map) (new ArrayMap(i)));
	//   17   33:new             #255 <Class ArrayMap>
	//   18   36:dup             
	//   19   37:iload_0         
	//   20   38:invokespecial   #343 <Method void ArrayMap(int)>
	//   21   41:areturn         
		else
			return ((Map) (new HashMap(i, f)));
	//   22   42:new             #345 <Class HashMap>
	//   23   45:dup             
	//   24   46:iload_0         
	//   25   47:fload_2         
	//   26   48:invokespecial   #346 <Method void HashMap(int, float)>
	//   27   51:areturn         
	}

	private static Map zzg(int i, boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			f = 0.75F;
	//    2    4:ldc2            #334 <Float 0.75F>
	//    3    7:fstore_2        
		else
	//*   4    8:goto            13
			f = 1.0F;
	//    5   11:fconst_1        
	//    6   12:fstore_2        
		return ((Map) (new LinkedHashMap(i, f)));
	//    7   13:new             #162 <Class LinkedHashMap>
	//    8   16:dup             
	//    9   17:iload_0         
	//   10   18:fload_2         
	//   11   19:invokespecial   #348 <Method void LinkedHashMap(int, float)>
	//   12   22:areturn         
	}
}
