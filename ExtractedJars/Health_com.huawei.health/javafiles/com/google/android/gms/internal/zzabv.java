// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

public abstract class zzabv
{

	public zzabv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Object()>
	//    2    4:return          
	}

	protected abstract void zza(com.google.android.gms.common.api.Api.zzb zzb, TaskCompletionSource taskcompletionsource)
		throws RemoteException;
}
