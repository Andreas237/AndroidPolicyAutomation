// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			ab, au, gb

class ab$5
	implements IEventSubscriber
{

	public void a(au au1)
	{
		ab.l(a).a(au1.a(), au1.b());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ab a>
	//    2    4:invokestatic    #27  <Method gb ab.l(ab)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method fr au.a()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #36  <Method er au.b()>
	//    7   15:invokeinterface #41  <Method void gb.a(fr, er)>
	//    8   20:return          
	}

	public void trigger(Object obj)
	{
		a((au)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class au>
	//    3    5:invokevirtual   #45  <Method void a(au)>
	//    4    8:return          
	}

	final ab a;

	ab$5(ab ab1)
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
