// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.streaming;

import java.util.*;

public class StreamSenseUtils
{

	public StreamSenseUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void filterMap(Map map, Set set)
	{
		Iterator iterator = map.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:invokeinterface #17  <Method Set Map.keySet()>
	//    2    6:invokeinterface #23  <Method Iterator Set.iterator()>
	//    3   11:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   12:aload_2         
	//    5   13:invokeinterface #29  <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            52
			String s = (String)iterator.next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #33  <Method Object Iterator.next()>
	//    9   27:checkcast       #35  <Class String>
	//   10   30:astore_3        
			if(!set.contains(((Object) (s))))
	//*  11   31:aload_1         
	//*  12   32:aload_3         
	//*  13   33:invokeinterface #39  <Method boolean Set.contains(Object)>
	//*  14   38:ifne            12
				map.remove(((Object) (s)));
	//   15   41:aload_0         
	//   16   42:aload_3         
	//   17   43:invokeinterface #43  <Method Object Map.remove(Object)>
	//   18   48:pop             
		} while(true);
	//   19   49:goto            12
	//   20   52:return          
	}
}
