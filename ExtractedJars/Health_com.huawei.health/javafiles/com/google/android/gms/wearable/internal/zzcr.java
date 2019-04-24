// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.WearableStatusCodes;

public final class zzcr
{

	public static Status zzik(int i)
	{
		return new Status(i, WearableStatusCodes.getStatusCodeString(i));
	//    0    0:new             #8   <Class Status>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:iload_0         
	//    4    6:invokestatic    #14  <Method String WearableStatusCodes.getStatusCodeString(int)>
	//    5    9:invokespecial   #18  <Method void Status(int, String)>
	//    6   12:areturn         
	}
}
