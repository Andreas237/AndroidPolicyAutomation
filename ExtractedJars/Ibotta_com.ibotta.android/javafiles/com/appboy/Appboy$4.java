// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bo;
import bo.app.ci;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$4
	implements Runnable
{

	public void run()
	{
		try
		{
			if(StringUtils.isNullOrBlank(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field String a>
	//*   2    4:invokestatic    #34  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    7:ifeq            20
			{
				AppboyLogger.w(Appboy.b(), "Campaign ID cannot be null or blank for push delivery event.");
	//    4   10:invokestatic    #37  <Method String Appboy.b()>
	//    5   13:ldc1            #39  <String "Campaign ID cannot be null or blank for push delivery event.">
	//    6   15:invokestatic    #45  <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
				return;
	//    8   19:return          
			}
		}
	//*   9   20:aload_0         
	//*  10   21:getfield        #19  <Field Appboy b>
	//*  11   24:getfield        #49  <Field bo Appboy.g>
	//*  12   27:aload_0         
	//*  13   28:getfield        #21  <Field String a>
	//*  14   31:invokestatic    #55  <Method ci ci.j(String)>
	//*  15   34:invokevirtual   #60  <Method boolean bo.a(bo.app.cc)>
	//*  16   37:pop             
	//*  17   38:return          
		catch(Exception exception)
	//*  18   39:astore_1        
		{
			AppboyLogger.w(Appboy.b(), "Failed to log push delivery event.", ((Throwable) (exception)));
	//   19   40:invokestatic    #37  <Method String Appboy.b()>
	//   20   43:ldc1            #62  <String "Failed to log push delivery event.">
	//   21   45:aload_1         
	//   22   46:invokestatic    #65  <Method int AppboyLogger.w(String, String, Throwable)>
	//   23   49:pop             
			Appboy.a(b, ((Throwable) (exception)));
	//   24   50:aload_0         
	//   25   51:getfield        #19  <Field Appboy b>
	//   26   54:aload_1         
	//   27   55:invokestatic    #68  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   28   58:return          
		}
		b.g.a(((bo.app.cc) (ci.j(a))));
		return;
	}

	final String a;
	final Appboy b;

	Appboy$4(Appboy appboy, String s)
	{
		b = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Appboy b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
