// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;


// Referenced classes of package com.google.android.gms.cast:
//			CastRemoteDisplayLocalService

public static class CastRemoteDisplayLocalService$Options
{

	public int getConfigPreset()
	{
		return zzbb;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int zzbb>
	//    2    4:ireturn         
	}

	public void setConfigPreset(int i)
	{
		zzbb = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #16  <Field int zzbb>
	//    3    5:return          
	}

	private int zzbb;

	public CastRemoteDisplayLocalService$Options()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzbb = 2;
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:putfield        #16  <Field int zzbb>
	//    5    9:return          
	}
}
