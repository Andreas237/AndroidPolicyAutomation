// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzmz

public final class zzmy
	implements zzmz
{

	public zzmy()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final List zzf(List list)
	{
		List list1 = list;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(list == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			list1 = Collections.emptyList();
	//    4    6:invokestatic    #20  <Method List Collections.emptyList()>
	//    5    9:astore_2        
		return list1;
	//    6   10:aload_2         
	//    7   11:areturn         
	}
}
