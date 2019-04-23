// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package bo.app:
//			bb, dd, bu, q

class bb$1
	implements Runnable
{

	public void run()
	{
		AppboyLogger.d(bb.b(), "Started offline AppboyEvent recovery task.");
	//    0    0:invokestatic    #28  <Method String bb.b()>
	//    1    3:ldc1            #30  <String "Started offline AppboyEvent recovery task.">
	//    2    5:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		bu bu1;
		for(Iterator iterator = bb.a(b).a().iterator(); iterator.hasNext(); a.a(bu1))
	//*   4    9:aload_0         
	//*   5   10:getfield        #18  <Field bb b>
	//*   6   13:invokestatic    #39  <Method dd bb.a(bb)>
	//*   7   16:invokeinterface #44  <Method Collection dd.a()>
	//*   8   21:invokeinterface #50  <Method Iterator Collection.iterator()>
	//*   9   26:astore_1        
	//*  10   27:aload_1         
	//*  11   28:invokeinterface #56  <Method boolean Iterator.hasNext()>
	//*  12   33:ifeq            59
			bu1 = (bu)iterator.next();
	//   13   36:aload_1         
	//   14   37:invokeinterface #60  <Method Object Iterator.next()>
	//   15   42:checkcast       #62  <Class bu>
	//   16   45:astore_2        

	//   17   46:aload_0         
	//   18   47:getfield        #20  <Field q a>
	//   19   50:aload_2         
	//   20   51:invokeinterface #67  <Method void q.a(bu)>
	//*  21   56:goto            27
	//   22   59:return          
	}

	final q a;
	final bb b;

	bb$1(bb bb1, q q1)
	{
		b = bb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field bb b>
		a = q1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field q a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
