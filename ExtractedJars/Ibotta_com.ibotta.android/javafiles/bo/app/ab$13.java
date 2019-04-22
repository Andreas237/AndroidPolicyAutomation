// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;
import com.appboy.support.AppboyLogger;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package bo.app:
//			ab, bt, as

class ab$13
	implements IEventSubscriber
{

	public void a(as as1)
	{
		ab.k(a).set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ab a>
	//    2    4:invokestatic    #27  <Method AtomicBoolean ab.k(ab)>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #33  <Method void AtomicBoolean.set(boolean)>
		ab.a(a, as1);
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field ab a>
	//    7   15:aload_1         
	//    8   16:invokestatic    #36  <Method as ab.a(ab, as)>
	//    9   19:pop             
		AppboyLogger.i(ab.q(), "Requesting trigger update due to trigger-eligible push click event");
	//   10   20:invokestatic    #40  <Method String ab.q()>
	//   11   23:ldc1            #42  <String "Requesting trigger update due to trigger-eligible push click event">
	//   12   25:invokestatic    #48  <Method int AppboyLogger.i(String, String)>
	//   13   28:pop             
		ab.f(a).a((new cm.a()).b());
	//   14   29:aload_0         
	//   15   30:getfield        #18  <Field ab a>
	//   16   33:invokestatic    #52  <Method bt ab.f(ab)>
	//   17   36:new             #54  <Class cm$a>
	//   18   39:dup             
	//   19   40:invokespecial   #55  <Method void cm$a()>
	//   20   43:invokevirtual   #59  <Method cm$a cm$a.b()>
	//   21   46:invokeinterface #64  <Method void bt.a(cm$a)>
	//   22   51:return          
	}

	public void trigger(Object obj)
	{
		a((as)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #68  <Class as>
	//    3    5:invokevirtual   #70  <Method void a(as)>
	//    4    8:return          
	}

	final ab a;

	ab$13(ab ab1)
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
