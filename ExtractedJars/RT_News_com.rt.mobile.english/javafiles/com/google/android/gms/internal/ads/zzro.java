// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

public interface zzro
	extends IInterface
{

	public abstract void onUnconfirmedClickCancelled()
		throws RemoteException;

	public abstract void onUnconfirmedClickReceived(String s)
		throws RemoteException;
}
