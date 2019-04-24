// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzagu

public interface zzahe
	extends IInterface
{

	public abstract void onRewardedVideoAdClosed()
		throws RemoteException;

	public abstract void onRewardedVideoAdFailedToLoad(int i)
		throws RemoteException;

	public abstract void onRewardedVideoAdLeftApplication()
		throws RemoteException;

	public abstract void onRewardedVideoAdLoaded()
		throws RemoteException;

	public abstract void onRewardedVideoAdOpened()
		throws RemoteException;

	public abstract void onRewardedVideoCompleted()
		throws RemoteException;

	public abstract void onRewardedVideoStarted()
		throws RemoteException;

	public abstract void zza(zzagu zzagu)
		throws RemoteException;
}
