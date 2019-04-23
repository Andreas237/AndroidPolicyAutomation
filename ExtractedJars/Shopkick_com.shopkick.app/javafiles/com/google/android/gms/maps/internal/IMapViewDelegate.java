// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IGoogleMapDelegate, zzap

public interface IMapViewDelegate
	extends IInterface
{

	public abstract IGoogleMapDelegate getMap()
		throws RemoteException;

	public abstract void getMapAsync(zzap zzap)
		throws RemoteException;

	public abstract IObjectWrapper getView()
		throws RemoteException;

	public abstract void onCreate(Bundle bundle)
		throws RemoteException;

	public abstract void onDestroy()
		throws RemoteException;

	public abstract void onEnterAmbient(Bundle bundle)
		throws RemoteException;

	public abstract void onExitAmbient()
		throws RemoteException;

	public abstract void onLowMemory()
		throws RemoteException;

	public abstract void onPause()
		throws RemoteException;

	public abstract void onResume()
		throws RemoteException;

	public abstract void onSaveInstanceState(Bundle bundle)
		throws RemoteException;

	public abstract void onStart()
		throws RemoteException;

	public abstract void onStop()
		throws RemoteException;
}
