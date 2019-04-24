// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzagx, zzahe, zzahk, zzkx

public interface zzagz
	extends IInterface
{

	public abstract void destroy()
		throws RemoteException;

	public abstract String getMediationAdapterClassName()
		throws RemoteException;

	public abstract boolean isLoaded()
		throws RemoteException;

	public abstract void pause()
		throws RemoteException;

	public abstract void resume()
		throws RemoteException;

	public abstract void setImmersiveMode(boolean flag)
		throws RemoteException;

	public abstract void setUserId(String s)
		throws RemoteException;

	public abstract void show()
		throws RemoteException;

	public abstract void zza(zzagx zzagx)
		throws RemoteException;

	public abstract void zza(zzahe zzahe)
		throws RemoteException;

	public abstract void zza(zzahk zzahk)
		throws RemoteException;

	public abstract void zza(zzkx zzkx)
		throws RemoteException;

	public abstract Bundle zzba()
		throws RemoteException;

	public abstract void zzd(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void zze(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract void zzf(IObjectWrapper iobjectwrapper)
		throws RemoteException;
}
