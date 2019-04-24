// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzaap
	extends IInterface
{

	public abstract void onActivityResult(int i, int j, Intent intent)
		throws RemoteException;

	public abstract void onBackPressed()
		throws RemoteException;

	public abstract void onCreate(Bundle bundle)
		throws RemoteException;

	public abstract void onDestroy()
		throws RemoteException;

	public abstract void onPause()
		throws RemoteException;

	public abstract void onRestart()
		throws RemoteException;

	public abstract void onResume()
		throws RemoteException;

	public abstract void onSaveInstanceState(Bundle bundle)
		throws RemoteException;

	public abstract void onStart()
		throws RemoteException;

	public abstract void onStop()
		throws RemoteException;

	public abstract void zzax()
		throws RemoteException;

	public abstract boolean zznj()
		throws RemoteException;

	public abstract void zzo(IObjectWrapper iobjectwrapper)
		throws RemoteException;
}
