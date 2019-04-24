// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaha, zzane, zzamu, zzmp, 
//			zzahe, zzagx, zzahk, zzkx

public final class zzmo extends zzaha
{

	public zzmo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void zzaha()>
	//    2    4:return          
	}

	static zzahe zza(zzmo zzmo1)
	{
		return zzmo1.zzatl;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzahe zzatl>
	//    2    4:areturn         
	}

	public final void destroy()
		throws RemoteException
	{
	//    0    0:return          
	}

	public final String getMediationAdapterClassName()
		throws RemoteException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean isLoaded()
		throws RemoteException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void pause()
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void resume()
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void setImmersiveMode(boolean flag)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void setUserId(String s)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void show()
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void zza(zzagx zzagx)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void zza(zzahe zzahe)
		throws RemoteException
	{
		zzatl = zzahe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzahe zzatl>
	//    3    5:return          
	}

	public final void zza(zzahk zzahk)
		throws RemoteException
	{
		zzane.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
	//    0    0:ldc1            #35  <String "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.">
	//    1    2:invokestatic    #40  <Method void zzane.e(String)>
		zzamu.zzsy.post(((Runnable) (new zzmp(this))));
	//    2    5:getstatic       #46  <Field Handler zzamu.zzsy>
	//    3    8:new             #48  <Class zzmp>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #51  <Method void zzmp(zzmo)>
	//    7   16:invokevirtual   #57  <Method boolean Handler.post(Runnable)>
	//    8   19:pop             
	//    9   20:return          
	}

	public final void zza(zzkx zzkx)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final Bundle zzba()
		throws RemoteException
	{
		return new Bundle();
	//    0    0:new             #62  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #63  <Method void Bundle()>
	//    3    7:areturn         
	}

	public final void zzd(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void zze(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
	//    0    0:return          
	}

	public final void zzf(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
	//    0    0:return          
	}

	private zzahe zzatl;
}
