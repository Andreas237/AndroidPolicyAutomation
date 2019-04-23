// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzbs
	extends IInterface
{

	public abstract void onSnapshotReady(Bitmap bitmap)
		throws RemoteException;

	public abstract void zzb(IObjectWrapper iobjectwrapper)
		throws RemoteException;
}
