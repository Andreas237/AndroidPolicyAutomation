// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import java.util.List;

public interface zzdd
	extends IInterface
{

	public abstract void zza(IStatusCallback istatuscallback, String as[], String s, List list)
		throws RemoteException;
}
