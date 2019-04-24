// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzpw
	extends IInterface
{

	public abstract double getScale()
		throws RemoteException;

	public abstract Uri getUri()
		throws RemoteException;

	public abstract IObjectWrapper zzjy()
		throws RemoteException;
}
