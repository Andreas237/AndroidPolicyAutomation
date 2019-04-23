// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

// Referenced classes of package com.google.android.gms.maps.internal:
//			IStreetViewPanoramaDelegate, zzbp

public interface IStreetViewPanoramaFragmentDelegate
	extends IInterface
{

	public abstract IStreetViewPanoramaDelegate getStreetViewPanorama()
		throws RemoteException;

	public abstract void getStreetViewPanoramaAsync(zzbp zzbp)
		throws RemoteException;

	public abstract boolean isReady()
		throws RemoteException;

	public abstract void onCreate(Bundle bundle)
		throws RemoteException;

	public abstract IObjectWrapper onCreateView(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, Bundle bundle)
		throws RemoteException;

	public abstract void onDestroy()
		throws RemoteException;

	public abstract void onDestroyView()
		throws RemoteException;

	public abstract void onInflate(IObjectWrapper iobjectwrapper, StreetViewPanoramaOptions streetviewpanoramaoptions, Bundle bundle)
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
