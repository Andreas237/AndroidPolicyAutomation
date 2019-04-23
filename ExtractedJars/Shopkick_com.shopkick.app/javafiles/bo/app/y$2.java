// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			y, an, fl

class y$2
	implements IEventSubscriber
{

	public void a(an an1)
	{
		y.l(a).a(an1.a());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field y a>
	//    2    4:invokestatic    #26  <Method fl y.l(y)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #31  <Method fb an.a()>
	//    5   11:invokeinterface #36  <Method void fl.a(fb)>
	//    6   16:return          
	}

	public void trigger(Object obj)
	{
		a((an)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class an>
	//    3    5:invokevirtual   #40  <Method void a(an)>
	//    4    8:return          
	}

	final y a;

	y$2(y y1)
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
