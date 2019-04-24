// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlo, zzps, zzpw

public interface zzqo
	extends IInterface
{

	public abstract void destroy()
		throws RemoteException;

	public abstract String getAdvertiser()
		throws RemoteException;

	public abstract String getBody()
		throws RemoteException;

	public abstract String getCallToAction()
		throws RemoteException;

	public abstract Bundle getExtras()
		throws RemoteException;

	public abstract String getHeadline()
		throws RemoteException;

	public abstract List getImages()
		throws RemoteException;

	public abstract String getMediationAdapterClassName()
		throws RemoteException;

	public abstract zzlo getVideoController()
		throws RemoteException;

	public abstract void performClick(Bundle bundle)
		throws RemoteException;

	public abstract boolean recordImpression(Bundle bundle)
		throws RemoteException;

	public abstract void reportTouchEvent(Bundle bundle)
		throws RemoteException;

	public abstract IObjectWrapper zzka()
		throws RemoteException;

	public abstract IObjectWrapper zzke()
		throws RemoteException;

	public abstract zzps zzkf()
		throws RemoteException;

	public abstract zzpw zzkg()
		throws RemoteException;
}
