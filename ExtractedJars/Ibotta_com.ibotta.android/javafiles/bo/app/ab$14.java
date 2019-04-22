// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			ab, av, gb

class ab$14
	implements IEventSubscriber
{

	public void a(av av1)
	{
		ab.l(a).a(av1.a());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ab a>
	//    2    4:invokestatic    #27  <Method gb ab.l(ab)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method java.util.List av.a()>
	//    5   11:invokeinterface #37  <Method void gb.a(java.util.List)>
		a.c();
	//    6   16:aload_0         
	//    7   17:getfield        #18  <Field ab a>
	//    8   20:invokevirtual   #40  <Method void ab.c()>
		a.d();
	//    9   23:aload_0         
	//   10   24:getfield        #18  <Field ab a>
	//   11   27:invokevirtual   #43  <Method void ab.d()>
	//   12   30:return          
	}

	public void trigger(Object obj)
	{
		a((av)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class av>
	//    3    5:invokevirtual   #47  <Method void a(av)>
	//    4    8:return          
	}

	final ab a;

	ab$14(ab ab1)
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
