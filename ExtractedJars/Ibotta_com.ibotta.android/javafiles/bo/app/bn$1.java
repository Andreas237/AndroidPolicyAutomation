// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.*;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			bn

class bn$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       14
		{
			AppboyLogger.e(bn.b(), "Location broadcast receiver received null intent.");
	//    2    4:invokestatic    #24  <Method String bn.b()>
	//    3    7:ldc1            #26  <String "Location broadcast receiver received null intent.">
	//    4    9:invokestatic    #32  <Method int AppboyLogger.e(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		}
		if(intent.getAction().endsWith(".SINGLE_APPBOY_LOCATION_UPDATE"))
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #37  <Method String Intent.getAction()>
	//*   9   18:ldc1            #39  <String ".SINGLE_APPBOY_LOCATION_UPDATE">
	//*  10   20:invokevirtual   #45  <Method boolean String.endsWith(String)>
	//*  11   23:ifeq            34
			bn.a(a, intent);
	//   12   26:aload_0         
	//   13   27:getfield        #14  <Field bn a>
	//   14   30:aload_2         
	//   15   31:invokestatic    #48  <Method void bn.a(bn, Intent)>
	//   16   34:return          
	}

	final bn a;

	bn$1(bn bn1)
	{
		a = bn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field bn a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
