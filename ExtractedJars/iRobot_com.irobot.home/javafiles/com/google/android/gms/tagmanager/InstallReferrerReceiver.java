// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.CampaignTrackingReceiver;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzcw

public final class InstallReferrerReceiver extends CampaignTrackingReceiver
{

	public InstallReferrerReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void CampaignTrackingReceiver()>
	//    2    4:return          
	}

	protected final void zza(Context context, String s)
	{
		zzcw.zzdu(s);
	//    0    0:aload_2         
	//    1    1:invokestatic    #18  <Method void zzcw.zzdu(String)>
		zzcw.zzf(context, s);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #21  <Method void zzcw.zzf(Context, String)>
	//    5    9:return          
	}
}
