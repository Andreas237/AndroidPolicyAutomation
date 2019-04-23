// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//			Api

public static class Api$BaseClientBuilder
{

	public List getImpliedScopes(Object obj)
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #30  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public int getPriority()
	{
		return 0x7fffffff;
	//    0    0:ldc1            #15  <Int 0x7fffffff>
	//    1    2:ireturn         
	}

	public static final int API_PRIORITY_GAMES = 1;
	public static final int API_PRIORITY_OTHER = 0x7fffffff;
	public static final int API_PRIORITY_PLUS = 2;

	public Api$BaseClientBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
