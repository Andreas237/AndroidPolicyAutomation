// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzaf;

public interface zzcz
	extends IInterface
{

	public abstract void disconnect()
		throws RemoteException;

	public abstract void requestStatus()
		throws RemoteException;

	public abstract void zza(double d, double d1, boolean flag)
		throws RemoteException;

	public abstract void zza(String s, String s1, long l)
		throws RemoteException;

	public abstract void zza(String s, String s1, zzaf zzaf)
		throws RemoteException;

	public abstract void zza(boolean flag, double d, boolean flag1)
		throws RemoteException;

	public abstract void zzb(String s, LaunchOptions launchoptions)
		throws RemoteException;

	public abstract void zzcx()
		throws RemoteException;

	public abstract void zzi(String s)
		throws RemoteException;

	public abstract void zzr(String s)
		throws RemoteException;

	public abstract void zzs(String s)
		throws RemoteException;
}
