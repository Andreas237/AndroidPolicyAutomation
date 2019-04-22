// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import com.appboy.Appboy;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			bq

class bq$1
	implements Runnable
{

	public void run()
	{
		AppboyLogger.d(bq.h(), "Requesting data flush on internal session close flush timer.");
	//    0    0:invokestatic    #29  <Method String bq.h()>
	//    1    3:ldc1            #31  <String "Requesting data flush on internal session close flush timer.">
	//    2    5:invokestatic    #37  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		Appboy.getInstance(a).requestImmediateDataFlush();
	//    4    9:aload_0         
	//    5   10:getfield        #20  <Field Context a>
	//    6   13:invokestatic    #43  <Method Appboy Appboy.getInstance(Context)>
	//    7   16:invokevirtual   #46  <Method void Appboy.requestImmediateDataFlush()>
	//    8   19:return          
	}

	final Context a;
	final bq b;

	bq$1(bq bq1, Context context)
	{
		b = bq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field bq b>
		a = context;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field Context a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
