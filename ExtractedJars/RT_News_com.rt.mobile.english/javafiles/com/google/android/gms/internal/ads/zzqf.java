// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzqf
	extends IInterface
{

	public abstract void unregisterNativeAd()
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void zzc(IObjectWrapper iobjectwrapper)
		throws RemoteException;
}
