// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.bf;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy:
//			Appboy

class Appboy$28
	implements Runnable
{

	public void run()
	{
		try
		{
			d.g.a(a, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Appboy d>
	//    2    4:getfield        #39  <Field bf Appboy.g>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field String a>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field String b>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field boolean c>
	//    9   19:invokevirtual   #43  <Method void bf.a(String, String, boolean)>
			return;
	//   10   22:return          
		}
		catch(Exception exception)
	//*  11   23:astore_1        
		{
			String s = Appboy.b();
	//   12   24:invokestatic    #46  <Method String Appboy.b()>
	//   13   27:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #48  <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #49  <Method void StringBuilder()>
	//   17   35:astore_3        
			stringbuilder.append("Failed to submit feedback: ");
	//   18   36:aload_3         
	//   19   37:ldc1            #51  <String "Failed to submit feedback: ">
	//   20   39:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			stringbuilder.append(b);
	//   22   43:aload_3         
	//   23   44:aload_0         
	//   24   45:getfield        #26  <Field String b>
	//   25   48:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   27   52:aload_2         
	//   28   53:aload_3         
	//   29   54:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   30   57:aload_1         
	//   31   58:invokestatic    #64  <Method int AppboyLogger.w(String, String, Throwable)>
	//   32   61:pop             
			Appboy.a(d, ((Throwable) (exception)));
	//   33   62:aload_0         
	//   34   63:getfield        #22  <Field Appboy d>
	//   35   66:aload_1         
	//   36   67:invokestatic    #67  <Method void Appboy.a(Appboy, Throwable)>
			return;
	//   37   70:return          
		}
	}

	final String a;
	final String b;
	final boolean c;
	final Appboy d;

	Appboy$28(Appboy appboy, String s, String s1, boolean flag)
	{
		d = appboy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Appboy d>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field String b>
		c = flag;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #28  <Field boolean c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
