// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjj

public interface zzkk
	extends IInterface
{

	public abstract String getMediationAdapterClassName()
		throws RemoteException;

	public abstract boolean isLoading()
		throws RemoteException;

	public abstract void zza(zzjj zzjj, int i)
		throws RemoteException;

	public abstract String zzck()
		throws RemoteException;

	public abstract void zzd(zzjj zzjj)
		throws RemoteException;
}
