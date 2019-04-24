// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlo, zzzm, zzzf, zzxt, 
//			zzjn, zzzh, zzzt

public interface zzzj
	extends IInterface
{

	public abstract zzlo getVideoController()
		throws RemoteException;

	public abstract void showInterstitial()
		throws RemoteException;

	public abstract void zza(IObjectWrapper iobjectwrapper, String s, Bundle bundle, zzzm zzzm)
		throws RemoteException;

	public abstract void zza(byte abyte0[], String s, Bundle bundle, IObjectWrapper iobjectwrapper, zzzf zzzf, zzxt zzxt, zzjn zzjn)
		throws RemoteException;

	public abstract void zza(byte abyte0[], String s, Bundle bundle, IObjectWrapper iobjectwrapper, zzzh zzzh, zzxt zzxt)
		throws RemoteException;

	public abstract zzzt zznc()
		throws RemoteException;

	public abstract zzzt zznd()
		throws RemoteException;
}
