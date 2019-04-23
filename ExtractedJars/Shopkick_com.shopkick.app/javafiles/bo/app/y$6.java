// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.AppboyInternal;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			y, cc, bl, bo, 
//			dj, ai

class y$6
	implements IEventSubscriber
{

	public void a(ai ai1)
	{
		AppboyLogger.d(y.o(), "Session start event for new session received.");
	//    0    0:invokestatic    #27  <Method String y.o()>
	//    1    3:ldc1            #29  <String "Session start event for new session received.">
	//    2    5:invokestatic    #35  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		ai1 = ((ai) (cc.i()));
	//    4    9:invokestatic    #41  <Method cc cc.i()>
	//    5   12:astore_1        
		y.f(a).a(((bu) (ai1)));
	//    6   13:aload_0         
	//    7   14:getfield        #18  <Field y a>
	//    8   17:invokestatic    #45  <Method bl y.f(y)>
	//    9   20:aload_1         
	//   10   21:invokeinterface #50  <Method boolean bl.a(bu)>
	//   11   26:pop             
		y.g(a).b();
	//   12   27:aload_0         
	//   13   28:getfield        #18  <Field y a>
	//   14   31:invokestatic    #54  <Method bo y.g(y)>
	//   15   34:invokeinterface #60  <Method boolean bo.b()>
	//   16   39:pop             
		y.g(a).c();
	//   17   40:aload_0         
	//   18   41:getfield        #18  <Field y a>
	//   19   44:invokestatic    #54  <Method bo y.g(y)>
	//   20   47:invokeinterface #63  <Method boolean bo.c()>
	//   21   52:pop             
		a.m();
	//   22   53:aload_0         
	//   23   54:getfield        #18  <Field y a>
	//   24   57:invokevirtual   #66  <Method void y.m()>
		AppboyInternal.requestGeofenceRefresh(y.h(a), false);
	//   25   60:aload_0         
	//   26   61:getfield        #18  <Field y a>
	//   27   64:invokestatic    #70  <Method android.content.Context y.h(y)>
	//   28   67:iconst_0        
	//   29   68:invokestatic    #76  <Method void AppboyInternal.requestGeofenceRefresh(android.content.Context, boolean)>
		y.c(a).d();
	//   30   71:aload_0         
	//   31   72:getfield        #18  <Field y a>
	//   32   75:invokestatic    #79  <Method dj y.c(y)>
	//   33   78:invokevirtual   #83  <Method void dj.d()>
	//   34   81:return          
	}

	public void trigger(Object obj)
	{
		a((ai)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #87  <Class ai>
	//    3    5:invokevirtual   #89  <Method void a(ai)>
	//    4    8:return          
	}

	final y a;

	y$6(y y1)
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
