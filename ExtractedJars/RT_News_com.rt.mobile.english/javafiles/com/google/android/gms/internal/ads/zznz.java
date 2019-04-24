// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzoa, zzane

public final class zznz
	implements CustomRenderedAd
{

	public zznz(zzoa zzoa1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzbgv = zzoa1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field zzoa zzbgv>
	//    5    9:return          
	}

	public final String getBaseUrl()
	{
		String s;
		try
		{
			s = zzbgv.zzjn();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzoa zzbgv>
	//    2    4:invokeinterface #26  <Method String zzoa.zzjn()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #28  <String "#007 Could not call remote method.">
	//    8   15:aload_1         
	//    9   16:invokestatic    #34  <Method void zzane.zzd(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final String getContent()
	{
		String s;
		try
		{
			s = zzbgv.getContent();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzoa zzbgv>
	//    2    4:invokeinterface #37  <Method String zzoa.getContent()>
	//    3    9:astore_1        
		}
	//*   4   10:aload_1         
	//*   5   11:areturn         
		catch(RemoteException remoteexception)
	//*   6   12:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    7   13:ldc1            #28  <String "#007 Could not call remote method.">
	//    8   15:aload_1         
	//    9   16:invokestatic    #34  <Method void zzane.zzd(String, Throwable)>
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		}
		return s;
	}

	public final void onAdRendered(View view)
	{
		zzoa zzoa1 = zzbgv;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzoa zzbgv>
	//    2    4:astore_2        
		if(view == null) goto _L2; else goto _L1
	//    3    5:aload_1         
	//    4    6:ifnull          33
_L1:
		view = ((View) (ObjectWrapper.wrap(((Object) (view)))));
	//    5    9:aload_1         
	//    6   10:invokestatic    #45  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    7   13:astore_1        
	//*   8   14:goto            17
_L4:
		try
		{
			zzoa1.zzg(((com.google.android.gms.dynamic.IObjectWrapper) (view)));
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokeinterface #49  <Method void zzoa.zzg(com.google.android.gms.dynamic.IObjectWrapper)>
			return;
	//   12   24:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  13   25:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (view)));
	//   14   26:ldc1            #28  <String "#007 Could not call remote method.">
	//   15   28:aload_1         
	//   16   29:invokestatic    #34  <Method void zzane.zzd(String, Throwable)>
		}
		return;
	//   17   32:return          
_L2:
		view = null;
	//   18   33:aconst_null     
	//   19   34:astore_1        
		if(true) goto _L4; else goto _L3
	//   20   35:goto            17
_L3:
	}

	public final void recordClick()
	{
		try
		{
			zzbgv.recordClick();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzoa zzbgv>
	//    2    4:invokeinterface #52  <Method void zzoa.recordClick()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #28  <String "#007 Could not call remote method.">
	//    6   13:aload_1         
	//    7   14:invokestatic    #34  <Method void zzane.zzd(String, Throwable)>
		}
	//    8   17:return          
	}

	public final void recordImpression()
	{
		try
		{
			zzbgv.recordImpression();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzoa zzbgv>
	//    2    4:invokeinterface #55  <Method void zzoa.recordImpression()>
			return;
	//    3    9:return          
		}
		catch(RemoteException remoteexception)
	//*   4   10:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (remoteexception)));
	//    5   11:ldc1            #28  <String "#007 Could not call remote method.">
	//    6   13:aload_1         
	//    7   14:invokestatic    #34  <Method void zzane.zzd(String, Throwable)>
		}
	//    8   17:return          
	}

	private final zzoa zzbgv;
}
