// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlo, zzpw, zzps

public interface zzyf
	extends IInterface
{

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

	public abstract boolean getOverrideClickHandling()
		throws RemoteException;

	public abstract boolean getOverrideImpressionRecording()
		throws RemoteException;

	public abstract String getPrice()
		throws RemoteException;

	public abstract double getStarRating()
		throws RemoteException;

	public abstract String getStore()
		throws RemoteException;

	public abstract zzlo getVideoController()
		throws RemoteException;

	public abstract void recordImpression()
		throws RemoteException;

	public abstract void zzb(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2)
		throws RemoteException;

	public abstract void zzj(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract zzpw zzjz()
		throws RemoteException;

	public abstract IObjectWrapper zzke()
		throws RemoteException;

	public abstract zzps zzkf()
		throws RemoteException;

	public abstract void zzl(IObjectWrapper iobjectwrapper)
		throws RemoteException;

	public abstract IObjectWrapper zzmv()
		throws RemoteException;

	public abstract IObjectWrapper zzmw()
		throws RemoteException;
}
