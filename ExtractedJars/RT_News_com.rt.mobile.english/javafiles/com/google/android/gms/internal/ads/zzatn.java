// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzatn
	extends IInterface
{

	public abstract String getVersion()
		throws RemoteException;

	public abstract IObjectWrapper zza(String s, IObjectWrapper iobjectwrapper, String s1, String s2, String s3)
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1)
		throws RemoteException;

	public abstract void zzm(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void zzn(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract boolean zzy(IObjectWrapper iobjectwrapper)
		throws RemoteException;
}
