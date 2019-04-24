// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzoa
	extends IInterface
{

	public abstract String getContent()
		throws RemoteException;

	public abstract void recordClick()
		throws RemoteException;

	public abstract void recordImpression()
		throws RemoteException;

	public abstract void zzg(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract String zzjn()
		throws RemoteException;
}
