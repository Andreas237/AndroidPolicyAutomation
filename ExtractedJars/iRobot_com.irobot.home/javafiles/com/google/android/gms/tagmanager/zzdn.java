// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.*;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfm

class zzdn extends BroadcastReceiver
{

	zzdn(zzfm zzfm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void BroadcastReceiver()>
		zzbdp = zzfm1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field zzfm zzbdp>
	//    5    9:return          
	}

	public static void zzw(Context context)
	{
		Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
	//    0    0:new             #24  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #26  <String "com.google.analytics.RADIO_POWERED">
	//    3    6:invokespecial   #29  <Method void Intent(String)>
	//    4    9:astore_1        
		intent.addCategory(context.getPackageName());
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #35  <Method String Context.getPackageName()>
	//    8   15:invokevirtual   #39  <Method Intent Intent.addCategory(String)>
	//    9   18:pop             
		intent.putExtra(zzabi, true);
	//   10   19:aload_1         
	//   11   20:getstatic       #41  <Field String zzabi>
	//   12   23:iconst_1        
	//   13   24:invokevirtual   #45  <Method Intent Intent.putExtra(String, boolean)>
	//   14   27:pop             
		context.sendBroadcast(intent);
	//   15   28:aload_0         
	//   16   29:aload_1         
	//   17   30:invokevirtual   #49  <Method void Context.sendBroadcast(Intent)>
	//   18   33:return          
	}

	public void onReceive(Context context, Intent intent)
	{
		context = ((Context) (intent.getAction()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #54  <Method String Intent.getAction()>
	//    2    4:astore_1        
		if("android.net.conn.CONNECTIVITY_CHANGE".equals(((Object) (context))))
	//*   3    5:ldc1            #56  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//*   4    7:aload_1         
	//*   5    8:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*   6   11:ifeq            54
		{
			Bundle bundle = intent.getExtras();
	//    7   14:aload_2         
	//    8   15:invokevirtual   #66  <Method Bundle Intent.getExtras()>
	//    9   18:astore_3        
			context = ((Context) (Boolean.FALSE));
	//   10   19:getstatic       #72  <Field Boolean Boolean.FALSE>
	//   11   22:astore_1        
			if(bundle != null)
	//*  12   23:aload_3         
	//*  13   24:ifnull          40
				context = ((Context) (Boolean.valueOf(intent.getExtras().getBoolean("noConnectivity"))));
	//   14   27:aload_2         
	//   15   28:invokevirtual   #66  <Method Bundle Intent.getExtras()>
	//   16   31:ldc1            #74  <String "noConnectivity">
	//   17   33:invokevirtual   #80  <Method boolean Bundle.getBoolean(String)>
	//   18   36:invokestatic    #84  <Method Boolean Boolean.valueOf(boolean)>
	//   19   39:astore_1        
			zzbdp.zzp(((Boolean) (context)).booleanValue() ^ true);
	//   20   40:aload_0         
	//   21   41:getfield        #20  <Field zzfm zzbdp>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #88  <Method boolean Boolean.booleanValue()>
	//   24   48:iconst_1        
	//   25   49:ixor            
	//   26   50:invokevirtual   #94  <Method void zzfm.zzp(boolean)>
			return;
	//   27   53:return          
		}
		if("com.google.analytics.RADIO_POWERED".equals(((Object) (context))) && !intent.hasExtra(zzabi))
	//*  28   54:ldc1            #26  <String "com.google.analytics.RADIO_POWERED">
	//*  29   56:aload_1         
	//*  30   57:invokevirtual   #62  <Method boolean String.equals(Object)>
	//*  31   60:ifeq            80
	//*  32   63:aload_2         
	//*  33   64:getstatic       #41  <Field String zzabi>
	//*  34   67:invokevirtual   #97  <Method boolean Intent.hasExtra(String)>
	//*  35   70:ifne            80
			zzbdp.zzqd();
	//   36   73:aload_0         
	//   37   74:getfield        #20  <Field zzfm zzbdp>
	//   38   77:invokevirtual   #100 <Method void zzfm.zzqd()>
	//   39   80:return          
	}

	private static final String zzabi = "com.google.android.gms.tagmanager.zzdn";
	private final zzfm zzbdp;

	static 
	{
	//    0    0:return          
	}
}
