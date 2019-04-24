// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlr

public interface zzlo
	extends IInterface
{

	public abstract float getAspectRatio()
		throws RemoteException;

	public abstract int getPlaybackState()
		throws RemoteException;

	public abstract boolean isClickToExpandEnabled()
		throws RemoteException;

	public abstract boolean isCustomControlsEnabled()
		throws RemoteException;

	public abstract boolean isMuted()
		throws RemoteException;

	public abstract void mute(boolean flag)
		throws RemoteException;

	public abstract void pause()
		throws RemoteException;

	public abstract void play()
		throws RemoteException;

	public abstract void zza(zzlr zzlr)
		throws RemoteException;

	public abstract float zzim()
		throws RemoteException;

	public abstract float zzin()
		throws RemoteException;

	public abstract zzlr zzio()
		throws RemoteException;
}
