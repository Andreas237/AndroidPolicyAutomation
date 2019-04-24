// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxw, zzqs

public interface zzxt
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

	public abstract void onAppEvent(String s, String s1)
		throws RemoteException;

	public abstract void onVideoEnd()
		throws RemoteException;

	public abstract void zza(zzxw zzxw)
		throws RemoteException;

	public abstract void zzb(zzqs zzqs, String s)
		throws RemoteException;

	public abstract void zzbj(String s)
		throws RemoteException;
}
