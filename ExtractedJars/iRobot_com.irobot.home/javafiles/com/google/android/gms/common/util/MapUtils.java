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
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	public static void writeStringMapToJson(StringBuilder stringbuilder, HashMap hashmap)
	{
		stringbuilder.append("{");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "{">
	//    2    3:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    3    6:pop             
		Iterator iterator = hashmap.keySet().iterator();
	//    4    7:aload_1         
	//    5    8:invokevirtual   #26  <Method Set HashMap.keySet()>
	//    6   11:invokeinterface #32  <Method Iterator Set.iterator()>
	//    7   16:astore          4
		boolean flag = true;
	//    8   18:iconst_1        
	//    9   19:istore_2        
		while(iterator.hasNext()) 
	//*  10   20:aload           4
	//*  11   22:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//*  12   27:ifeq            124
		{
			String s = (String)iterator.next();
	//   13   30:aload           4
	//   14   32:invokeinterface #42  <Method Object Iterator.next()>
	//   15   37:checkcast       #44  <Class String>
	//   16   40:astore_3        
			if(!flag)
	//*  17   41:iload_2         
	//*  18   42:ifne            55
				stringbuilder.append(",");
	//   19   45:aload_0         
	//   20   46:ldc1            #46  <String ",">
	//   21   48:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   22   51:pop             
			else
	//*  23   52:goto            57
				flag = false;
	//   24   55:iconst_0        
	//   25   56:istore_2        
			String s1 = (String)hashmap.get(((Object) (s)));
	//   26   57:aload_1         
	//   27   58:aload_3         
	//   28   59:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//   29   62:checkcast       #44  <Class String>
	//   30   65:astore          5
			stringbuilder.append("\"");
	//   31   67:aload_0         
	//   32   68:ldc1            #52  <String "\"">
	//   33   70:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   34   73:pop             
			stringbuilder.append(s);
	//   35   74:aload_0         
	//   36   75:aload_3         
	//   37   76:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
			stringbuilder.append("\":");
	//   39   80:aload_0         
	//   40   81:ldc1            #54  <String "\":">
	//   41   83:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
			if(s1 == null)
	//*  43   87:aload           5
	//*  44   89:ifnonnull       104
			{
				s = "null";
	//   45   92:ldc1            #56  <String "null">
	//   46   94:astore_3        
			} else
	//*  47   95:aload_0         
	//*  48   96:aload_3         
	//*  49   97:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//*  50  100:pop             
	//*  51  101:goto            20
			{
				stringbuilder.append("\"");
	//   52  104:aload_0         
	//   53  105:ldc1            #52  <String "\"">
	//   54  107:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   55  110:pop             
				stringbuilder.append(s1);
	//   56  111:aload_0         
	//   57  112:aload           5
	//   58  114:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   59  117:pop             
				s = "\"";
	//   60  118:ldc1            #52  <String "\"">
	//   61  120:astore_3        
			}
			stringbuilder.append(s);
		}
	//*  62  121:goto            95
		stringbuilder.append("}");
	//   63  124:aload_0         
	//   64  125:ldc1            #58  <String "}">
	//   65  127:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   66  130:pop             
	//   67  131:return          
	}
}
