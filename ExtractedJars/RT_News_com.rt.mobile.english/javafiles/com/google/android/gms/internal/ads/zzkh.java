// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

public interface zzkh
	extends IInterface
{

	public abstract void onAdClicked()
		throws RemoteException;

	public abstract void onAdClosed()
		throws RemoteException;

	public abstract void onAdFailedToLoad(int i)
		throws RemoteException;

	public abstract void onAdImpression()
		throws RemoteException;

	public abstract void onAdLeftApplication()
		throws RemoteException;

	public abstract void onAdLoaded()
		throws RemoteException;

	public abstract void onAdOpened()
		throws RemoteException;
}
