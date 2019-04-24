// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzcd, zzcv

public interface zzdb
	extends IInterface
{

	public abstract void onApplicationDisconnected(int i)
		throws RemoteException;

	public abstract void zza(ApplicationMetadata applicationmetadata, String s, String s1, boolean flag)
		throws RemoteException;

	public abstract void zza(String s, double d, boolean flag)
		throws RemoteException;

	public abstract void zza(String s, long l)
		throws RemoteException;

	public abstract void zza(String s, long l, int i)
		throws RemoteException;

	public abstract void zza(String s, byte abyte0[])
		throws RemoteException;

	public abstract void zzb(zzcd zzcd)
		throws RemoteException;

	public abstract void zzb(zzcv zzcv)
		throws RemoteException;

	public abstract void zzb(String s, String s1)
		throws RemoteException;

	public abstract void zzf(int i)
		throws RemoteException;

	public abstract void zzn(int i)
		throws RemoteException;

	public abstract void zzo(int i)
		throws RemoteException;

	public abstract void zzp(int i)
		throws RemoteException;
}
