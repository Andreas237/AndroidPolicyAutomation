// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpl, zzqw, zzqz, zzri, 
//			zzjn, zzrl, zzrf, zzrc, 
//			zzkh, zzlg, zzkk

public interface zzkn
	extends IInterface
{

	public abstract void zza(PublisherAdViewOptions publisheradviewoptions)
		throws RemoteException;

	public abstract void zza(zzpl zzpl)
		throws RemoteException;

	public abstract void zza(zzqw zzqw)
		throws RemoteException;

	public abstract void zza(zzqz zzqz)
		throws RemoteException;

	public abstract void zza(zzri zzri, zzjn zzjn)
		throws RemoteException;

	public abstract void zza(zzrl zzrl)
		throws RemoteException;

	public abstract void zza(String s, zzrf zzrf, zzrc zzrc)
		throws RemoteException;

	public abstract void zzb(zzkh zzkh)
		throws RemoteException;

	public abstract void zzb(zzlg zzlg)
		throws RemoteException;

	public abstract zzkk zzdh()
		throws RemoteException;
}
