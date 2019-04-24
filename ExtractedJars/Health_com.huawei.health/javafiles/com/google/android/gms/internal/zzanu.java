// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.List;

public class zzanu
{

	public static int zza(Object obj, List list)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		int i = list.indexOf(obj);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:invokeinterface #12  <Method int List.indexOf(Object)>
	//    7   13:istore_2        
		if(i >= 0)
	//*   8   14:iload_2         
	//*   9   15:iflt            20
		{
			return i;
	//   10   18:iload_2         
	//   11   19:ireturn         
		} else
		{
			list.add(obj);
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:invokeinterface #16  <Method boolean List.add(Object)>
	//   15   27:pop             
			return list.size() - 1;
	//   16   28:aload_1         
	//   17   29:invokeinterface #20  <Method int List.size()>
	//   18   34:iconst_1        
	//   19   35:isub            
	//   20   36:ireturn         
		}
	}
}
