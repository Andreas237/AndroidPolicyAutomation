// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.app.Activity;
import bo.app.bf;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$26
	implements Runnable
{

	public void run()
	{
		try
		{
			if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Activity a>
	//*   2    4:ifnonnull       17
			{
				AppboyLogger.w(Appboy.b(), "Cannot open session with null activity.");
	//    3    7:invokestatic    #31  <Method String Appboy.b()>
	//    4   10:ldc1            #33  <String "Cannot open session with null activity.">
	//    5   12:invokestatic    #39  <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
				return;
	//    7   16:return          
			}
		}
	//*   8   17:aload_0         
	//*   9   18:getfield        #19  <Field Appboy b>
	//*  10   21:getfield        #43  <Field bf Appboy.g>
	//*  11   24:aload_0         
	//*  12   25:getfield        #21  <Field Activity a>
	//*  13   28:invokevirtual   #48  <Method bo.app.by bf.a(Activity)>
	//*  14   31:pop             
	//*  15   32:return          
		catch(Exception exception)
	//*  16   33:astore_1        
		{
			AppboyLogger.e(Appboy.b(), "Failed to open session.", ((Throwable) (exception)));
	//   17   34:invokestatic    #31  <Method String Appboy.b()>
	//   18   37:ldc1            #50  <String "Failed to open session.">
	//   19   39:aload_1         
	//   20   40:invokestatic    #54  <Method int AppboyLogger.e(String, String, Throwable)>
	//   21   43:pop             
			Appboy.a(b, ((Throwable) (exception)));
	//   22   44:aload_0         
	//   23   45:getfield        #19  <Field Appboy b>
	//   24   48:aload_1         
	//   25   49:invokestatic    #57  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   26   52:return          
		}
		b.g.a(a);
		return;
	}

	final Activity a;
	final Appboy b;

	Appboy$26(Appboy appboy, Activity activity)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Appboy b>
		a = activity;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Activity a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
