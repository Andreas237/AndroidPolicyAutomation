// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.app.Activity;
import bo.app.bo;
import bo.app.cf;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$31
	implements Runnable
{

	public void run()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Activity a>
	//*   2    4:ifnonnull       17
		{
			AppboyLogger.w(Appboy.b(), "Cannot close session with null activity.");
	//    3    7:invokestatic    #31  <Method String Appboy.b()>
	//    4   10:ldc1            #33  <String "Cannot close session with null activity.">
	//    5   12:invokestatic    #39  <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		}
		cf cf1 = b.g.b(a);
	//    8   17:aload_0         
	//    9   18:getfield        #19  <Field Appboy b>
	//   10   21:getfield        #43  <Field bo Appboy.g>
	//   11   24:aload_0         
	//   12   25:getfield        #21  <Field Activity a>
	//   13   28:invokevirtual   #48  <Method cf bo.b(Activity)>
	//   14   31:astore_1        
		if(cf1 != null)
	//*  15   32:aload_1         
	//*  16   33:ifnull          93
			try
			{
				String s = Appboy.b();
	//   17   36:invokestatic    #31  <Method String Appboy.b()>
	//   18   39:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   19   40:new             #50  <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #51  <Method void StringBuilder()>
	//   22   47:astore_3        
				stringbuilder.append("Closed session with ID: ");
	//   23   48:aload_3         
	//   24   49:ldc1            #53  <String "Closed session with ID: ">
	//   25   51:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
				stringbuilder.append(((Object) (cf1.a())));
	//   27   55:aload_3         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #62  <Method bo.app.cg cf.a()>
	//   30   60:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   31   63:pop             
				AppboyLogger.i(s, stringbuilder.toString());
	//   32   64:aload_2         
	//   33   65:aload_3         
	//   34   66:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   35   69:invokestatic    #71  <Method int AppboyLogger.i(String, String)>
	//   36   72:pop             
				return;
	//   37   73:return          
			}
			catch(Exception exception)
	//*  38   74:astore_1        
			{
				AppboyLogger.w(Appboy.b(), "Failed to close session.", ((Throwable) (exception)));
	//   39   75:invokestatic    #31  <Method String Appboy.b()>
	//   40   78:ldc1            #73  <String "Failed to close session.">
	//   41   80:aload_1         
	//   42   81:invokestatic    #76  <Method int AppboyLogger.w(String, String, Throwable)>
	//   43   84:pop             
				Appboy.a(b, ((Throwable) (exception)));
	//   44   85:aload_0         
	//   45   86:getfield        #19  <Field Appboy b>
	//   46   89:aload_1         
	//   47   90:invokestatic    #79  <Method void Appboy.a(Appboy, Throwable)>
			}
		return;
	//   48   93:return          
	}

	final Activity a;
	final Appboy b;

	Appboy$31(Appboy appboy, Activity activity)
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
