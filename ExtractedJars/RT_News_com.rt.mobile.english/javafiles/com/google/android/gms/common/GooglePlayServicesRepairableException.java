// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.common:
//			UserRecoverableException

public class GooglePlayServicesRepairableException extends UserRecoverableException
{

	public GooglePlayServicesRepairableException(int i, String s, Intent intent)
	{
		super(s, intent);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #11  <Method void UserRecoverableException(String, Intent)>
		zzbq = i;
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:putfield        #13  <Field int zzbq>
	//    7   11:return          
	}

	public int getConnectionStatusCode()
	{
		return zzbq;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int zzbq>
	//    2    4:ireturn         
	}

	private final int zzbq;
}
