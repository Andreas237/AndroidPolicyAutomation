// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzen
	extends IInterface
{

	public abstract void zza(IObjectWrapper iobjectwrapper, String s)
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, String s, String s1)
		throws RemoteException;

	public abstract void zza(int ai[])
		throws RemoteException;

	public abstract void zzbd()
		throws RemoteException;

	public abstract void zzc(byte abyte0[])
		throws RemoteException;

	public abstract void zzg(int i)
		throws RemoteException;

	public abstract void zzh(int i)
		throws RemoteException;
}
