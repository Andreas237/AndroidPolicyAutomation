// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlo, zzaaw, zzabc, zzahe, 
//			zzjn, zzke, zzkh, zzkx, 
//			zzla, zzlg, zzlu, zzmu, 
//			zzod, zzjj

public interface zzks
	extends IInterface
{

	public abstract void destroy()
		throws RemoteException;

	public abstract String getAdUnitId()
		throws RemoteException;

	public abstract String getMediationAdapterClassName()
		throws RemoteException;

	public abstract zzlo getVideoController()
		throws RemoteException;

	public abstract boolean isLoading()
		throws RemoteException;

	public abstract boolean isReady()
		throws RemoteException;

	public abstract void pause()
		throws RemoteException;

	public abstract void resume()
		throws RemoteException;

	public abstract void setImmersiveMode(boolean flag)
		throws RemoteException;

	public abstract void setManualImpressionsEnabled(boolean flag)
		throws RemoteException;

	public abstract void setUserId(String s)
		throws RemoteException;

	public abstract void showInterstitial()
		throws RemoteException;

	public abstract void stopLoading()
		throws RemoteException;

	public abstract void zza(zzaaw zzaaw)
		throws RemoteException;

	public abstract void zza(zzabc zzabc, String s)
		throws RemoteException;

	public abstract void zza(zzahe zzahe)
		throws RemoteException;

	public abstract void zza(zzjn zzjn)
		throws RemoteException;

	public abstract void zza(zzke zzke)
		throws RemoteException;

	public abstract void zza(zzkh zzkh)
		throws RemoteException;

	public abstract void zza(zzkx zzkx)
		throws RemoteException;

	public abstract void zza(zzla zzla)
		throws RemoteException;

	public abstract void zza(zzlg zzlg)
		throws RemoteException;

	public abstract void zza(zzlu zzlu)
		throws RemoteException;

	public abstract void zza(zzmu zzmu)
		throws RemoteException;

	public abstract void zza(zzod zzod)
		throws RemoteException;

	public abstract boolean zzb(zzjj zzjj)
		throws RemoteException;

	public abstract Bundle zzba()
		throws RemoteException;

	public abstract IObjectWrapper zzbj()
		throws RemoteException;

	public abstract zzjn zzbk()
		throws RemoteException;

	public abstract void zzbm()
		throws RemoteException;

	public abstract zzla zzbw()
		throws RemoteException;

	public abstract zzkh zzbx()
		throws RemoteException;

	public abstract String zzck()
		throws RemoteException;
}
