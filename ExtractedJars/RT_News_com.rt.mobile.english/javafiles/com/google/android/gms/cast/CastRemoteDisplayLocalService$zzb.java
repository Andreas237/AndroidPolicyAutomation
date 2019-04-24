// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.content.*;

// Referenced classes of package com.google.android.gms.cast:
//			CastRemoteDisplayLocalService, zzu

private static final class CastRemoteDisplayLocalService$zzb extends BroadcastReceiver
{

	public final void onReceive(Context context, Intent intent)
	{
		if(intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"))
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #22  <Method String Intent.getAction()>
	//*   2    4:ldc1            #24  <String "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT">
	//*   3    6:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            16
		{
			CastRemoteDisplayLocalService.stopService();
	//    5   12:invokestatic    #33  <Method void CastRemoteDisplayLocalService.stopService()>
			return;
	//    6   15:return          
		}
		if(intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED"))
	//*   7   16:aload_2         
	//*   8   17:invokevirtual   #22  <Method String Intent.getAction()>
	//*   9   20:ldc1            #35  <String "com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED">
	//*  10   22:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  11   25:ifeq            32
			CastRemoteDisplayLocalService.zzd(false);
	//   12   28:iconst_0        
	//   13   29:invokestatic    #39  <Method void CastRemoteDisplayLocalService.zzd(boolean)>
	//   14   32:return          
	}

	private CastRemoteDisplayLocalService$zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	CastRemoteDisplayLocalService$zzb(zzu zzu)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CastRemoteDisplayLocalService$zzb()>
	//    2    4:return          
	}
}
