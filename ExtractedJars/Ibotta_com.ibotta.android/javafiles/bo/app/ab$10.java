// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.Appboy;
import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			ab, ap

class ab$10
	implements IEventSubscriber
{

	public void a(ap ap1)
	{
		ab.a(a, ap1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ab a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #26  <Method void ab.a(ab, ap)>
		Appboy.getInstance(ab.h(a)).requestImmediateDataFlush();
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field ab a>
	//    6   12:invokestatic    #30  <Method android.content.Context ab.h(ab)>
	//    7   15:invokestatic    #36  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    8   18:invokevirtual   #39  <Method void Appboy.requestImmediateDataFlush()>
	//    9   21:return          
	}

	public void trigger(Object obj)
	{
		a((ap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #43  <Class ap>
	//    3    5:invokevirtual   #45  <Method void a(ap)>
	//    4    8:return          
	}

	final ab a;

	ab$10(ab ab1)
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
