// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//			Api

public static interface Api$ApiOptions
{
	public static interface HasOptions
		extends Api.ApiOptions
	{
	}

	public static final class NoOptions
		implements NotRequiredOptions
	{

		private NoOptions()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface NotRequiredOptions
		extends Api.ApiOptions
	{
	}

	public static interface Optional
		extends HasOptions, NotRequiredOptions
	{
	}

}
