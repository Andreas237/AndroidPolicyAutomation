// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlo, zzaic, zzjj, zzxt, 
//			zzpl, zzjn, zzxz, zzyc, 
//			zzqs, zzyf

public interface zzxq
	extends IInterface
{

	public abstract void destroy()
		throws RemoteException;

	public abstract Bundle getInterstitialAdapterInfo()
		throws RemoteException;

	public abstract zzlo getVideoController()
		throws RemoteException;

	public abstract IObjectWrapper getView()
		throws RemoteException;

	public abstract boolean isInitialized()
		throws RemoteException;

	public abstract void pause()
		throws RemoteException;

	public abstract void resume()
		throws RemoteException;

	public abstract void setImmersiveMode(boolean flag)
		throws RemoteException;

	public abstract void showInterstitial()
		throws RemoteException;

	public abstract void showVideo()
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, zzaic zzaic, List list)
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, zzjj zzjj, String s, zzaic zzaic, String s1)
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, zzjj zzjj, String s, zzxt zzxt)
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, zzjj zzjj, String s, String s1, zzxt zzxt)
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, zzjj zzjj, String s, String s1, zzxt zzxt, zzpl zzpl, List list)
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, zzjn zzjn, zzjj zzjj, String s, zzxt zzxt)
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, zzjn zzjn, zzjj zzjj, String s, String s1, zzxt zzxt)
		throws RemoteException;

	public abstract void zza(zzjj zzjj, String s, String s1)
		throws RemoteException;

	public abstract void zzc(zzjj zzjj, String s)
		throws RemoteException;

	public abstract void zzi(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract zzxz zzmo()
		throws RemoteException;

	public abstract zzyc zzmp()
		throws RemoteException;

	public abstract Bundle zzmq()
		throws RemoteException;

	public abstract Bundle zzmr()
		throws RemoteException;

	public abstract boolean zzms()
		throws RemoteException;

	public abstract zzqs zzmt()
		throws RemoteException;

	public abstract zzyf zzmu()
		throws RemoteException;
}
