// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.dynamic.IObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkt, zzane, zzamu, zzmk, 
//			zzkh, zzlo, zzaaw, zzabc, 
//			zzahe, zzjn, zzke, zzkx, 
//			zzla, zzlg, zzlu, zzmu, 
//			zzod, zzjj

public final class zzmj extends zzkt
{

	public zzmj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void zzkt()>
	//    2    4:return          
	}

	static zzkh zza(zzmj zzmj1)
	{
		return zzmj1.zzxs;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzkh zzxs>
	//    2    4:areturn         
	}

	public final void destroy()
	{
	//    0    0:return          
	}

	public final String getAdUnitId()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final String getMediationAdapterClassName()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final zzlo getVideoController()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean isLoading()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isReady()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void pause()
	{
	//    0    0:return          
	}

	public final void resume()
	{
	//    0    0:return          
	}

	public final void setImmersiveMode(boolean flag)
	{
	//    0    0:return          
	}

	public final void setManualImpressionsEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public final void setUserId(String s)
	{
	//    0    0:return          
	}

	public final void showInterstitial()
	{
	//    0    0:return          
	}

	public final void stopLoading()
	{
	//    0    0:return          
	}

	public final void zza(zzaaw zzaaw)
	{
	//    0    0:return          
	}

	public final void zza(zzabc zzabc, String s)
	{
	//    0    0:return          
	}

	public final void zza(zzahe zzahe)
	{
	//    0    0:return          
	}

	public final void zza(zzjn zzjn)
	{
	//    0    0:return          
	}

	public final void zza(zzke zzke)
	{
	//    0    0:return          
	}

	public final void zza(zzkh zzkh)
	{
		zzxs = zzkh;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzkh zzxs>
	//    3    5:return          
	}

	public final void zza(zzkx zzkx)
	{
	//    0    0:return          
	}

	public final void zza(zzla zzla)
	{
	//    0    0:return          
	}

	public final void zza(zzlg zzlg)
	{
	//    0    0:return          
	}

	public final void zza(zzlu zzlu)
	{
	//    0    0:return          
	}

	public final void zza(zzmu zzmu)
	{
	//    0    0:return          
	}

	public final void zza(zzod zzod)
	{
	//    0    0:return          
	}

	public final boolean zzb(zzjj zzjj)
	{
		zzane.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
	//    0    0:ldc1            #49  <String "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.">
	//    1    2:invokestatic    #54  <Method void zzane.e(String)>
		zzamu.zzsy.post(((Runnable) (new zzmk(this))));
	//    2    5:getstatic       #60  <Field Handler zzamu.zzsy>
	//    3    8:new             #62  <Class zzmk>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #65  <Method void zzmk(zzmj)>
	//    7   16:invokevirtual   #71  <Method boolean Handler.post(Runnable)>
	//    8   19:pop             
		return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
	}

	public final Bundle zzba()
	{
		return new Bundle();
	//    0    0:new             #75  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #76  <Method void Bundle()>
	//    3    7:areturn         
	}

	public final IObjectWrapper zzbj()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final zzjn zzbk()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final void zzbm()
	{
	//    0    0:return          
	}

	public final zzla zzbw()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final zzkh zzbx()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final String zzck()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private zzkh zzxs;
}
