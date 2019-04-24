// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzlj
	extends IInterface
{

	public abstract void setAppMuted(boolean flag)
		throws RemoteException;

	public abstract void setAppVolume(float f)
		throws RemoteException;

	public abstract void zza()
		throws RemoteException;

	public abstract void zza(String s, IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void zzb(IObjectWrapper iobjectwrapper, String s)
		throws RemoteException;

	public abstract float zzdo()
		throws RemoteException;

	public abstract boolean zzdp()
		throws RemoteException;

	public abstract void zzt(String s)
		throws RemoteException;
}
