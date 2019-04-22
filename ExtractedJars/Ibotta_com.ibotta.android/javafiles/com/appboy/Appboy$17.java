// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.*;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$17
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
	//*  14   31:invokestatic    #55  <Method ci ci.c(String)>
	//*  15   34:invokevirtual   #60  <Method boolean bo.a(bo.app.cc)>
	//*  16   37:pop             
	//*  17   38:aload_0         
	//*  18   39:getfield        #19  <Field Appboy b>
	//*  19   42:getfield        #63  <Field dr Appboy.c>
	//*  20   45:aload_0         
	//*  21   46:getfield        #21  <Field String a>
	//*  22   49:invokevirtual   #67  <Method void dr.b(String)>
	//*  23   52:return          
		catch(Exception exception)
	//*  24   53:astore_1        
		{
			String s = Appboy.b();
	//   25   54:invokestatic    #37  <Method String Appboy.b()>
	//   26   57:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   27   58:new             #69  <Class StringBuilder>
	//   28   61:dup             
	//   29   62:invokespecial   #70  <Method void StringBuilder()>
	//   30   65:astore_3        
			stringbuilder.append("Failed to log feed card impression. Card id: ");
	//   31   66:aload_3         
	//   32   67:ldc1            #72  <String "Failed to log feed card impression. Card id: ">
	//   33   69:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
			stringbuilder.append(a);
	//   35   73:aload_3         
	//   36   74:aload_0         
	//   37   75:getfield        #21  <Field String a>
	//   38   78:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   40   82:aload_2         
	//   41   83:aload_3         
	//   42   84:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   43   87:aload_1         
	//   44   88:invokestatic    #83  <Method int AppboyLogger.w(String, String, Throwable)>
	//   45   91:pop             
			Appboy.a(b, ((Throwable) (exception)));
	//   46   92:aload_0         
	//   47   93:getfield        #19  <Field Appboy b>
	//   48   96:aload_1         
	//   49   97:invokestatic    #86  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   50  100:return          
		}
		b.g.a(((bo.app.cc) (ci.c(a))));
		b.c.b(a);
		return;
	}

	final String a;
	final Appboy b;

	Appboy$17(Appboy appboy, String s)
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
