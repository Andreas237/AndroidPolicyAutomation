// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bf;
import bo.app.cc;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$5
	implements Runnable
{

	public void run()
	{
		try
		{
			if(StringUtils.isNullOrBlank(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field String a>
	//*   2    4:invokestatic    #37  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   3    7:ifeq            20
			{
				AppboyLogger.w(Appboy.b(), "Campaign ID cannot be null or blank. Not logging push notification action clicked.");
	//    4   10:invokestatic    #40  <Method String Appboy.b()>
	//    5   13:ldc1            #42  <String "Campaign ID cannot be null or blank. Not logging push notification action clicked.">
	//    6   15:invokestatic    #48  <Method int AppboyLogger.w(String, String)>
	//    7   18:pop             
				return;
	//    8   19:return          
			}
		}
	//*   9   20:aload_0         
	//*  10   21:getfield        #24  <Field String b>
	//*  11   24:invokestatic    #37  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  12   27:ifeq            40
	//*  13   30:invokestatic    #40  <Method String Appboy.b()>
	//*  14   33:ldc1            #50  <String "Action ID cannot be null or blank">
	//*  15   35:invokestatic    #48  <Method int AppboyLogger.w(String, String)>
	//*  16   38:pop             
	//*  17   39:return          
	//*  18   40:aload_0         
	//*  19   41:getfield        #20  <Field Appboy c>
	//*  20   44:getfield        #54  <Field bf Appboy.g>
	//*  21   47:aload_0         
	//*  22   48:getfield        #22  <Field String a>
	//*  23   51:aload_0         
	//*  24   52:getfield        #24  <Field String b>
	//*  25   55:invokestatic    #59  <Method cc cc.c(String, String)>
	//*  26   58:invokevirtual   #64  <Method boolean bf.a(bo.app.bu)>
	//*  27   61:pop             
	//*  28   62:return          
		catch(Exception exception)
	//*  29   63:astore_1        
		{
			AppboyLogger.w(Appboy.b(), "Failed to log push notification action clicked.", ((Throwable) (exception)));
	//   30   64:invokestatic    #40  <Method String Appboy.b()>
	//   31   67:ldc1            #66  <String "Failed to log push notification action clicked.">
	//   32   69:aload_1         
	//   33   70:invokestatic    #69  <Method int AppboyLogger.w(String, String, Throwable)>
	//   34   73:pop             
			Appboy.a(c, ((Throwable) (exception)));
	//   35   74:aload_0         
	//   36   75:getfield        #20  <Field Appboy c>
	//   37   78:aload_1         
	//   38   79:invokestatic    #72  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   39   82:return          
		}
		if(StringUtils.isNullOrBlank(b))
		{
			AppboyLogger.w(Appboy.b(), "Action ID cannot be null or blank");
			return;
		}
		c.g.a(((bo.app.bu) (cc.c(a, b))));
		return;
	}

	final String a;
	final String b;
	final Appboy c;

	Appboy$5(Appboy appboy, String s, String s1)
	{
		c = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Appboy c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
