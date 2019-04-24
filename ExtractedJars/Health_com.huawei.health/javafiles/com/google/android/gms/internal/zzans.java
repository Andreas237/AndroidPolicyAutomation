// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

public class zzans
{

	public static boolean zza(List list, List list1)
	{
		if(list.size() != list1.size())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #12  <Method int List.size()>
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #12  <Method int List.size()>
	//*   4   12:icmpeq          17
			return false;
	//    5   15:iconst_0        
	//    6   16:ireturn         
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   7   17:aload_0         
	//*   8   18:invokeinterface #16  <Method Iterator List.iterator()>
	//*   9   23:astore_0        
	//*  10   24:aload_0         
	//*  11   25:invokeinterface #22  <Method boolean Iterator.hasNext()>
	//*  12   30:ifeq            53
			if(!list1.contains(((Iterator) (list)).next()))
	//*  13   33:aload_1         
	//*  14   34:aload_0         
	//*  15   35:invokeinterface #26  <Method Object Iterator.next()>
	//*  16   40:invokeinterface #30  <Method boolean List.contains(Object)>
	//*  17   45:ifne            50
				return false;
	//   18   48:iconst_0        
	//   19   49:ireturn         

	//*  20   50:goto            24
		return true;
	//   21   53:iconst_1        
	//   22   54:ireturn         
	}
}
