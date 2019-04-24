// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlo, zzpw

public interface zzqs
	extends IInterface
{

	public abstract void destroy()
		throws RemoteException;

	public abstract List getAvailableAssetNames()
		throws RemoteException;

	public abstract String getCustomTemplateId()
		throws RemoteException;

	public abstract zzlo getVideoController()
		throws RemoteException;

	public abstract void performClick(String s)
		throws RemoteException;

	public abstract void recordImpression()
		throws RemoteException;

	public abstract String zzao(String s)
		throws RemoteException;

	public abstract zzpw zzap(String s)
		throws RemoteException;

	public abstract boolean zzh(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract IObjectWrapper zzka()
		throws RemoteException;

	public abstract IObjectWrapper zzkh()
		throws RemoteException;
}
