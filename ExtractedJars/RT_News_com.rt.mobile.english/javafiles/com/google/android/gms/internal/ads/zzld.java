// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxn, zzkn, zzaap, zzjn, 
//			zzks, zzaaz, zzqa, zzqf, 
//			zzagz, zzlj

public interface zzld
	extends IInterface
{

	public abstract zzkn createAdLoaderBuilder(IObjectWrapper iobjectwrapper, String s, zzxn zzxn, int i)
		throws RemoteException;

	public abstract zzaap createAdOverlay(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract zzks createBannerAdManager(IObjectWrapper iobjectwrapper, zzjn zzjn, String s, zzxn zzxn, int i)
		throws RemoteException;

	public abstract zzaaz createInAppPurchaseManager(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract zzks createInterstitialAdManager(IObjectWrapper iobjectwrapper, zzjn zzjn, String s, zzxn zzxn, int i)
		throws RemoteException;

	public abstract zzqa createNativeAdViewDelegate(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1)
		throws RemoteException;

	public abstract zzqf createNativeAdViewHolderDelegate(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2)
		throws RemoteException;

	public abstract zzagz createRewardedVideoAd(IObjectWrapper iobjectwrapper, zzxn zzxn, int i)
		throws RemoteException;

	public abstract zzks createSearchAdManager(IObjectWrapper iobjectwrapper, zzjn zzjn, String s, int i)
		throws RemoteException;

	public abstract zzlj getMobileAdsSettingsManager(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract zzlj getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iobjectwrapper, int i)
		throws RemoteException;
}
