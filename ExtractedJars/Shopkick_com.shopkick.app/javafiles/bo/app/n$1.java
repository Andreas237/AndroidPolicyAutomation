// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.*;
import android.net.ConnectivityManager;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			n, p, aa

class n$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		try
		{
			context = ((Context) ((ConnectivityManager)context.getSystemService("connectivity")));
	//    0    0:aload_1         
	//    1    1:ldc1            #28  <String "connectivity">
	//    2    3:invokevirtual   #34  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #36  <Class ConnectivityManager>
	//    4    9:astore_1        
			n.a(b).a(intent, ((ConnectivityManager) (context)));
	//    5   10:aload_0         
	//    6   11:getfield        #16  <Field n b>
	//    7   14:invokestatic    #39  <Method p n.a(n)>
	//    8   17:aload_2         
	//    9   18:aload_1         
	//   10   19:invokeinterface #44  <Method void p.a(Intent, ConnectivityManager)>
			b.c();
	//   11   24:aload_0         
	//   12   25:getfield        #16  <Field n b>
	//   13   28:invokevirtual   #47  <Method void n.c()>
			return;
	//   14   31:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  15   32:astore_1        
		{
			AppboyLogger.e(n.f(), "Failed to process connectivity event.", ((Throwable) (context)));
	//   16   33:invokestatic    #51  <Method String n.f()>
	//   17   36:ldc1            #53  <String "Failed to process connectivity event.">
	//   18   38:aload_1         
	//   19   39:invokestatic    #59  <Method int AppboyLogger.e(String, String, Throwable)>
	//   20   42:pop             
		}
		n.a(b, a, ((Throwable) (context)));
	//   21   43:aload_0         
	//   22   44:getfield        #16  <Field n b>
	//   23   47:aload_0         
	//   24   48:getfield        #18  <Field aa a>
	//   25   51:aload_1         
	//   26   52:invokestatic    #62  <Method void n.a(n, aa, Throwable)>
	//   27   55:return          
	}

	final aa a;
	final n b;

	n$1(n n1, aa aa)
	{
		b = n1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field n b>
		a = aa;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field aa a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void BroadcastReceiver()>
	//    8   14:return          
	}
}
