// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

public interface zzlr
	extends IInterface
{

	public abstract void onVideoEnd()
		throws RemoteException;

	public abstract void onVideoMute(boolean flag)
		throws RemoteException;

	public abstract void onVideoPause()
		throws RemoteException;

	public abstract void onVideoPlay()
		throws RemoteException;

	public abstract void onVideoStart()
		throws RemoteException;
}
