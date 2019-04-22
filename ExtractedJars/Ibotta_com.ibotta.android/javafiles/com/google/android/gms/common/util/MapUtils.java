// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import java.util.*;

public class MapUtils
{

	public MapUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Object getKeyFromMap(Map map, Object obj)
	{
label0:
		{
			if(!map.containsKey(obj))
				break label0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #17  <Method boolean Map.containsKey(Object)>
	//    3    7:ifeq            48
			map = ((Map) (map.keySet().iterator()));
	//    4   10:aload_0         
	//    5   11:invokeinterface #21  <Method Set Map.keySet()>
	//    6   16:invokeinterface #27  <Method Iterator Set.iterator()>
	//    7   21:astore_0        
			Object obj1;
			do
			{
				if(!((Iterator) (map)).hasNext())
					break label0;
	//    8   22:aload_0         
	//    9   23:invokeinterface #33  <Method boolean Iterator.hasNext()>
	//   10   28:ifeq            48
				obj1 = ((Iterator) (map)).next();
	//   11   31:aload_0         
	//   12   32:invokeinterface #37  <Method Object Iterator.next()>
	//   13   37:astore_2        
			} while(!obj1.equals(obj));
	//   14   38:aload_2         
	//   15   39:aload_1         
	//   16   40:invokevirtual   #40  <Method boolean Object.equals(Object)>
	//   17   43:ifeq            22
			return obj1;
	//   18   46:aload_2         
	//   19   47:areturn         
		}
		return ((Object) (null));
	//   20   48:aconst_null     
	//   21   49:areturn         
	}

	public static void writeStringMapToJson(StringBuilder stringbuilder, HashMap hashmap)
	{
		stringbuilder.append("{");
	//    0    0:aload_0         
	//    1    1:ldc1            #46  <String "{">
	//    2    3:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		Iterator iterator = hashmap.keySet().iterator();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #55  <Method Set HashMap.keySet()>
	//    6   11:invokeinterface #27  <Method Iterator Set.iterator()>
	//    7   16:astore          4
		boolean flag = true;
	//    8   18:iconst_1        
	//    9   19:istore_2        
		String s;
		for(; iterator.hasNext(); stringbuilder.append(s))
	//*  10   20:aload           4
	//*  11   22:invokeinterface #33  <Method boolean Iterator.hasNext()>
	//*  12   27:ifeq            124
		{
			s = (String)iterator.next();
	//   13   30:aload           4
	//   14   32:invokeinterface #37  <Method Object Iterator.next()>
	//   15   37:checkcast       #57  <Class String>
	//   16   40:astore_3        
			if(!flag)
	//*  17   41:iload_2         
	//*  18   42:ifne            55
				stringbuilder.append(",");
	//   19   45:aload_0         
	//   20   46:ldc1            #59  <String ",">
	//   21   48:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   22   51:pop             
			else
	//*  23   52:goto            57
				flag = false;
	//   24   55:iconst_0        
	//   25   56:istore_2        
			String s1 = (String)hashmap.get(((Object) (s)));
	//   26   57:aload_1         
	//   27   58:aload_3         
	//   28   59:invokevirtual   #63  <Method Object HashMap.get(Object)>
	//   29   62:checkcast       #57  <Class String>
	//   30   65:astore          5
			stringbuilder.append("\"");
	//   31   67:aload_0         
	//   32   68:ldc1            #65  <String "\"">
	//   33   70:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   34   73:pop             
			stringbuilder.append(s);
	//   35   74:aload_0         
	//   36   75:aload_3         
	//   37   76:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
			stringbuilder.append("\":");
	//   39   80:aload_0         
	//   40   81:ldc1            #67  <String "\":">
	//   41   83:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
			if(s1 == null)
	//*  43   87:aload           5
	//*  44   89:ifnonnull       98
			{
				s = "null";
	//   45   92:ldc1            #69  <String "null">
	//   46   94:astore_3        
			} else
	//*  47   95:goto            115
			{
				stringbuilder.append("\"");
	//   48   98:aload_0         
	//   49   99:ldc1            #65  <String "\"">
	//   50  101:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   51  104:pop             
				stringbuilder.append(s1);
	//   52  105:aload_0         
	//   53  106:aload           5
	//   54  108:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   55  111:pop             
				s = "\"";
	//   56  112:ldc1            #65  <String "\"">
	//   57  114:astore_3        
			}
		}

	//   58  115:aload_0         
	//   59  116:aload_3         
	//   60  117:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   61  120:pop             
	//*  62  121:goto            20
		stringbuilder.append("}");
	//   63  124:aload_0         
	//   64  125:ldc1            #71  <String "}">
	//   65  127:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   66  130:pop             
	//   67  131:return          
	}
}
