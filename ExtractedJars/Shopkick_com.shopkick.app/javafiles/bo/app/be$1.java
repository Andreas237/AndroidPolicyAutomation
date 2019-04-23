// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.*;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			be

class be$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       14
		{
			AppboyLogger.e(be.d(), "Location broadcast receiver received null intent.");
	//    2    4:invokestatic    #24  <Method String be.d()>
	//    3    7:ldc1            #26  <String "Location broadcast receiver received null intent.">
	//    4    9:invokestatic    #32  <Method int AppboyLogger.e(String, String)>
	//    5   12:pop             
			return;
	//    6   13:return          
		}
		context = ((Context) (intent.getAction()));
	//    7   14:aload_2         
	//    8   15:invokevirtual   #37  <Method String Intent.getAction()>
	//    9   18:astore_1        
		if(((String) (context)).endsWith(".SINGLE_APPBOY_LOCATION_UPDATE"))
	//*  10   19:aload_1         
	//*  11   20:ldc1            #39  <String ".SINGLE_APPBOY_LOCATION_UPDATE">
	//*  12   22:invokevirtual   #45  <Method boolean String.endsWith(String)>
	//*  13   25:ifeq            37
		{
			be.a(a, intent);
	//   14   28:aload_0         
	//   15   29:getfield        #14  <Field be a>
	//   16   32:aload_2         
	//   17   33:invokestatic    #48  <Method void be.a(be, Intent)>
			return;
	//   18   36:return          
		}
		if(((String) (context)).endsWith(".REQUEST_INIT_APPBOY_LOCATION_SERVICE"))
	//*  19   37:aload_1         
	//*  20   38:ldc1            #50  <String ".REQUEST_INIT_APPBOY_LOCATION_SERVICE">
	//*  21   40:invokevirtual   #45  <Method boolean String.endsWith(String)>
	//*  22   43:ifeq            54
			a.c();
	//   23   46:aload_0         
	//   24   47:getfield        #14  <Field be a>
	//   25   50:invokevirtual   #54  <Method boolean be.c()>
	//   26   53:pop             
	//   27   54:return          
	}

	final be a;

	be$1(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
