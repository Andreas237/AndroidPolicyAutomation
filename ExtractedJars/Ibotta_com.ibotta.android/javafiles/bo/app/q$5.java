// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			q, dj, ah

class q$5
	implements IEventSubscriber
{

	public void a(ah ah1)
	{
		if(q.c(a).b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field q a>
	//*   2    4:invokestatic    #26  <Method dj q.c(q)>
	//*   3    7:invokevirtual   #32  <Method boolean dj.b()>
	//*   4   10:ifeq            76
		{
			q.c(a).a();
	//    5   13:aload_0         
	//    6   14:getfield        #17  <Field q a>
	//    7   17:invokestatic    #26  <Method dj q.c(q)>
	//    8   20:invokevirtual   #34  <Method void dj.a()>
			ah1 = ((ah) (q.f()));
	//    9   23:invokestatic    #38  <Method String q.f()>
	//   10   26:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   11   27:new             #40  <Class StringBuilder>
	//   12   30:dup             
	//   13   31:invokespecial   #41  <Method void StringBuilder()>
	//   14   34:astore_2        
			stringbuilder.append("Received successful request flush. Default flush interval reset to ");
	//   15   35:aload_2         
	//   16   36:ldc1            #43  <String "Received successful request flush. Default flush interval reset to ">
	//   17   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   18   41:pop             
			stringbuilder.append(q.b(a));
	//   19   42:aload_2         
	//   20   43:aload_0         
	//   21   44:getfield        #17  <Field q a>
	//   22   47:invokestatic    #50  <Method long q.b(q)>
	//   23   50:invokevirtual   #53  <Method StringBuilder StringBuilder.append(long)>
	//   24   53:pop             
			AppboyLogger.d(((String) (ah1)), stringbuilder.toString());
	//   25   54:aload_1         
	//   26   55:aload_2         
	//   27   56:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   28   59:invokestatic    #62  <Method int AppboyLogger.d(String, String)>
	//   29   62:pop             
			ah1 = ((ah) (a));
	//   30   63:aload_0         
	//   31   64:getfield        #17  <Field q a>
	//   32   67:astore_1        
			((q) (ah1)).a(q.b(((q) (ah1))));
	//   33   68:aload_1         
	//   34   69:aload_1         
	//   35   70:invokestatic    #50  <Method long q.b(q)>
	//   36   73:invokevirtual   #65  <Method void q.a(long)>
		}
	//   37   76:return          
	}

	public void trigger(Object obj)
	{
		a((ah)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #69  <Class ah>
	//    3    5:invokevirtual   #71  <Method void a(ah)>
	//    4    8:return          
	}

	final q a;

	q$5(q q1)
	{
		a = q1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field q a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
