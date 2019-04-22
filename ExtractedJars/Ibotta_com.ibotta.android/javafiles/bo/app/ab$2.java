// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			ab, at, gb

class ab$2
	implements IEventSubscriber
{

	public void a(at at1)
	{
		ab.l(a).a(at1.a());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ab a>
	//    2    4:invokestatic    #26  <Method gb ab.l(ab)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #31  <Method fr at.a()>
	//    5   11:invokeinterface #36  <Method void gb.a(fr)>
	//    6   16:return          
	}

	public void trigger(Object obj)
	{
		a((at)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class at>
	//    3    5:invokevirtual   #40  <Method void a(at)>
	//    4    8:return          
	}

	final ab a;

	ab$2(ab ab1)
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
