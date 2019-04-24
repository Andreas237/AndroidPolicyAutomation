// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzcz, zzda

final class zzcz$zza extends BroadcastReceiver
{

	public final void onReceive(Context context, Intent intent)
	{
		if("android.intent.action.USER_PRESENT".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc1            #24  <String "android.intent.action.USER_PRESENT">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #30  <Method String Intent.getAction()>
	//*   3    6:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            22
		{
			zzcz.zza(zzsl, true);
	//    5   12:aload_0         
	//    6   13:getfield        #13  <Field zzcz zzsl>
	//    7   16:iconst_1        
	//    8   17:invokestatic    #39  <Method boolean zzcz.zza(zzcz, boolean)>
	//    9   20:pop             
			return;
	//   10   21:return          
		}
		if("android.intent.action.SCREEN_OFF".equals(((Object) (intent.getAction()))))
	//*  11   22:ldc1            #41  <String "android.intent.action.SCREEN_OFF">
	//*  12   24:aload_2         
	//*  13   25:invokevirtual   #30  <Method String Intent.getAction()>
	//*  14   28:invokevirtual   #36  <Method boolean String.equals(Object)>
	//*  15   31:ifeq            43
			zzcz.zza(zzsl, false);
	//   16   34:aload_0         
	//   17   35:getfield        #13  <Field zzcz zzsl>
	//   18   38:iconst_0        
	//   19   39:invokestatic    #39  <Method boolean zzcz.zza(zzcz, boolean)>
	//   20   42:pop             
	//   21   43:return          
	}

	private final zzcz zzsl;

	private zzcz$zza(zzcz zzcz1)
	{
		zzsl = zzcz1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzcz zzsl>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	zzcz$zza(zzcz zzcz1, zzda zzda)
	{
		this(zzcz1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void zzcz$zza(zzcz)>
	//    3    5:return          
	}
}
