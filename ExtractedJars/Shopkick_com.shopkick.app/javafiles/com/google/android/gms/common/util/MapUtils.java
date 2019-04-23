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
	//    7   16:astore_3        
		boolean flag = true;
	//    8   17:iconst_1        
	//    9   18:istore_2        
		while(iterator.hasNext()) 
	//*  10   19:aload_3         
	//*  11   20:invokeinterface #38  <Method boolean Iterator.hasNext()>
	//*  12   25:ifeq            126
		{
			String s = (String)iterator.next();
	//   13   28:aload_3         
	//   14   29:invokeinterface #42  <Method Object Iterator.next()>
	//   15   34:checkcast       #44  <Class String>
	//   16   37:astore          4
			if(!flag)
	//*  17   39:iload_2         
	//*  18   40:ifne            53
				stringbuilder.append(",");
	//   19   43:aload_0         
	//   20   44:ldc1            #46  <String ",">
	//   21   46:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
			else
	//*  23   50:goto            55
				flag = false;
	//   24   53:iconst_0        
	//   25   54:istore_2        
			String s1 = (String)hashmap.get(((Object) (s)));
	//   26   55:aload_1         
	//   27   56:aload           4
	//   28   58:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//   29   61:checkcast       #44  <Class String>
	//   30   64:astore          5
			stringbuilder.append("\"");
	//   31   66:aload_0         
	//   32   67:ldc1            #52  <String "\"">
	//   33   69:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
			stringbuilder.append(s);
	//   35   73:aload_0         
	//   36   74:aload           4
	//   37   76:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
			stringbuilder.append("\":");
	//   39   80:aload_0         
	//   40   81:ldc1            #54  <String "\":">
	//   41   83:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
			if(s1 == null)
	//*  43   87:aload           5
	//*  44   89:ifnonnull       102
			{
				stringbuilder.append("null");
	//   45   92:aload_0         
	//   46   93:ldc1            #56  <String "null">
	//   47   95:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   48   98:pop             
			} else
	//*  49   99:goto            19
			{
				stringbuilder.append("\"");
	//   50  102:aload_0         
	//   51  103:ldc1            #52  <String "\"">
	//   52  105:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   53  108:pop             
				stringbuilder.append(s1);
	//   54  109:aload_0         
	//   55  110:aload           5
	//   56  112:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   57  115:pop             
				stringbuilder.append("\"");
	//   58  116:aload_0         
	//   59  117:ldc1            #52  <String "\"">
	//   60  119:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   61  122:pop             
			}
		}
	//*  62  123:goto            19
		stringbuilder.append("}");
	//   63  126:aload_0         
	//   64  127:ldc1            #58  <String "}">
	//   65  129:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   66  132:pop             
	//   67  133:return          
	}
}
