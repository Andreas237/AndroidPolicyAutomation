// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			y, ao, fl

class y$12
	implements IEventSubscriber
{

	public void a(ao ao1)
	{
		y.l(a).a(ao1.a());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field y a>
	//    2    4:invokestatic    #27  <Method fl y.l(y)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method java.util.List ao.a()>
	//    5   11:invokeinterface #37  <Method void fl.a(java.util.List)>
		a.c();
	//    6   16:aload_0         
	//    7   17:getfield        #18  <Field y a>
	//    8   20:invokevirtual   #40  <Method void y.c()>
		a.d();
	//    9   23:aload_0         
	//   10   24:getfield        #18  <Field y a>
	//   11   27:invokevirtual   #43  <Method void y.d()>
	//   12   30:return          
	}

	public void trigger(Object obj)
	{
		a((ao)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class ao>
	//    3    5:invokevirtual   #47  <Method void a(ao)>
	//    4    8:return          
	}

	final y a;

	y$12(y y1)
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
