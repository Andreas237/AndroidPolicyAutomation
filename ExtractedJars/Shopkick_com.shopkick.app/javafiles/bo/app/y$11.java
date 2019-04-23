// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package bo.app:
//			y, bl, am

class y$11
	implements IEventSubscriber
{

	public void a(am am1)
	{
		y.k(a).set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field y a>
	//    2    4:invokestatic    #27  <Method AtomicBoolean y.k(y)>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
		y.a(a, am1);
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field y a>
	//    7   15:aload_1         
	//    8   16:invokestatic    #36  <Method am y.a(y, am)>
	//    9   19:pop             
		AppboyLogger.i(y.o(), "Requesting trigger update due to trigger-eligible push click event");
	//   10   20:invokestatic    #40  <Method String y.o()>
	//   11   23:ldc1            #42  <String "Requesting trigger update due to trigger-eligible push click event">
	//   12   25:invokestatic    #48  <Method int AppboyLogger.i(String, String)>
	//   13   28:pop             
		y.f(a).a((new cg$a()).b());
	//   14   29:aload_0         
	//   15   30:getfield        #18  <Field y a>
	//   16   33:invokestatic    #52  <Method bl y.f(y)>
	//   17   36:new             #54  <Class cg$a>
	//   18   39:dup             
	//   19   40:invokespecial   #55  <Method void cg$a()>
	//   20   43:invokevirtual   #59  <Method cg$a cg$a.b()>
	//   21   46:invokeinterface #64  <Method void bl.a(cg$a)>
	//   22   51:return          
	}

	public void trigger(Object obj)
	{
		a((am)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #68  <Class am>
	//    3    5:invokevirtual   #70  <Method void a(am)>
	//    4    8:return          
	}

	final y a;

	y$11(y y1)
	{
		a = y1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field y a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
