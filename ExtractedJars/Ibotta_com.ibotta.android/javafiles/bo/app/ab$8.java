// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.AppboyInternal;
import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			ab, ci, bt, bw, 
//			ea, ao

class ab$8
	implements IEventSubscriber
{

	public void a(ao ao1)
	{
		AppboyLogger.d(ab.q(), "Session start event for new session received.");
	//    0    0:invokestatic    #27  <Method String ab.q()>
	//    1    3:ldc1            #29  <String "Session start event for new session received.">
	//    2    5:invokestatic    #35  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		ao1 = ((ao) (ci.l()));
	//    4    9:invokestatic    #41  <Method ci ci.l()>
	//    5   12:astore_1        
		ab.f(a).a(((cc) (ao1)));
	//    6   13:aload_0         
	//    7   14:getfield        #18  <Field ab a>
	//    8   17:invokestatic    #45  <Method bt ab.f(ab)>
	//    9   20:aload_1         
	//   10   21:invokeinterface #50  <Method boolean bt.a(cc)>
	//   11   26:pop             
		ab.g(a).a();
	//   12   27:aload_0         
	//   13   28:getfield        #18  <Field ab a>
	//   14   31:invokestatic    #54  <Method bw ab.g(ab)>
	//   15   34:invokeinterface #59  <Method boolean bw.a()>
	//   16   39:pop             
		a.o();
	//   17   40:aload_0         
	//   18   41:getfield        #18  <Field ab a>
	//   19   44:invokevirtual   #62  <Method void ab.o()>
		AppboyInternal.requestGeofenceRefresh(ab.h(a), false);
	//   20   47:aload_0         
	//   21   48:getfield        #18  <Field ab a>
	//   22   51:invokestatic    #66  <Method android.content.Context ab.h(ab)>
	//   23   54:iconst_0        
	//   24   55:invokestatic    #72  <Method void AppboyInternal.requestGeofenceRefresh(android.content.Context, boolean)>
		ab.c(a).d();
	//   25   58:aload_0         
	//   26   59:getfield        #18  <Field ab a>
	//   27   62:invokestatic    #76  <Method ea ab.c(ab)>
	//   28   65:invokevirtual   #80  <Method void ea.d()>
	//   29   68:return          
	}

	public void trigger(Object obj)
	{
		a((ao)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #84  <Class ao>
	//    3    5:invokevirtual   #86  <Method void a(ao)>
	//    4    8:return          
	}

	final ab a;

	ab$8(ab ab1)
	{
		a = ab1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ab a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
