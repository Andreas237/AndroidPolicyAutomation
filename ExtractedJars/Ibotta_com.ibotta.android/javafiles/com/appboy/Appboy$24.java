// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.cq;
import bo.app.dn;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$24
	implements Runnable
{

	public void run()
	{
		try
		{
			cq cq1 = new cq(a);
	//    0    0:new             #32  <Class cq>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String a>
	//    4    8:invokespecial   #35  <Method void cq(String)>
	//    5   11:astore_1        
			c.h.a(cq1, b);
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field Appboy c>
	//    8   16:getfield        #39  <Field dn Appboy.h>
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #23  <Field String b>
	//   12   24:invokevirtual   #44  <Method com.appboy.events.ContentCardsUpdatedEvent dn.a(cq, String)>
	//   13   27:pop             
			return;
	//   14   28:return          
		}
		catch(Exception exception)
	//*  15   29:astore_1        
		{
			String s = Appboy.b();
	//   16   30:invokestatic    #47  <Method String Appboy.b()>
	//   17   33:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   18   34:new             #49  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #50  <Method void StringBuilder()>
	//   21   41:astore_3        
			stringbuilder.append("Failed to update ContentCard storage provider with single card update. User id: ");
	//   22   42:aload_3         
	//   23   43:ldc1            #52  <String "Failed to update ContentCard storage provider with single card update. User id: ">
	//   24   45:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
			stringbuilder.append(b);
	//   26   49:aload_3         
	//   27   50:aload_0         
	//   28   51:getfield        #23  <Field String b>
	//   29   54:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   30   57:pop             
			stringbuilder.append(" Serialized json: ");
	//   31   58:aload_3         
	//   32   59:ldc1            #58  <String " Serialized json: ">
	//   33   61:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   34   64:pop             
			stringbuilder.append(a);
	//   35   65:aload_3         
	//   36   66:aload_0         
	//   37   67:getfield        #21  <Field String a>
	//   38   70:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   39   73:pop             
			AppboyLogger.e(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   40   74:aload_2         
	//   41   75:aload_3         
	//   42   76:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   43   79:aload_1         
	//   44   80:invokestatic    #67  <Method int AppboyLogger.e(String, String, Throwable)>
	//   45   83:pop             
			return;
	//   46   84:return          
		}
	}

	final String a;
	final String b;
	final Appboy c;

	Appboy$24(Appboy appboy, String s, String s1)
	{
		c = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Appboy c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #23  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
