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

class Appboy$18
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
				AppboyLogger.e(Appboy.b(), "Card ID cannot be null or blank.");
	//    4   10:invokestatic    #37  <Method String Appboy.b()>
	//    5   13:ldc1            #39  <String "Card ID cannot be null or blank.">
	//    6   15:invokestatic    #45  <Method int AppboyLogger.e(String, String)>
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
	//*  14   31:invokestatic    #55  <Method ci ci.d(String)>
	//*  15   34:invokevirtual   #60  <Method boolean bo.a(bo.app.cc)>
	//*  16   37:pop             
	//*  17   38:return          
		catch(Exception exception)
	//*  18   39:astore_1        
		{
			String s = Appboy.b();
	//   19   40:invokestatic    #37  <Method String Appboy.b()>
	//   20   43:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   21   44:new             #62  <Class StringBuilder>
	//   22   47:dup             
	//   23   48:invokespecial   #63  <Method void StringBuilder()>
	//   24   51:astore_3        
			stringbuilder.append("Failed to log feed card clicked. Card id: ");
	//   25   52:aload_3         
	//   26   53:ldc1            #65  <String "Failed to log feed card clicked. Card id: ">
	//   27   55:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
			stringbuilder.append(a);
	//   29   59:aload_3         
	//   30   60:aload_0         
	//   31   61:getfield        #21  <Field String a>
	//   32   64:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   34   68:aload_2         
	//   35   69:aload_3         
	//   36   70:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   37   73:aload_1         
	//   38   74:invokestatic    #76  <Method int AppboyLogger.w(String, String, Throwable)>
	//   39   77:pop             
			Appboy.a(b, ((Throwable) (exception)));
	//   40   78:aload_0         
	//   41   79:getfield        #19  <Field Appboy b>
	//   42   82:aload_1         
	//   43   83:invokestatic    #79  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   44   86:return          
		}
		b.g.a(((bo.app.cc) (ci.d(a))));
		return;
	}

	final String a;
	final Appboy b;

	Appboy$18(Appboy appboy, String s)
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
