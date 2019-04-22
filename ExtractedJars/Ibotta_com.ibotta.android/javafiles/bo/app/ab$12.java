// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			ab, aj, bl

class ab$12
	implements IEventSubscriber
{

	public void a(aj aj1)
	{
		ab.i(a).a(aj1.a());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ab a>
	//    2    4:invokestatic    #26  <Method bl ab.i(ab)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #31  <Method java.util.List aj.a()>
	//    5   11:invokevirtual   #36  <Method void bl.a(java.util.List)>
	//    6   14:return          
	}

	public void trigger(Object obj)
	{
		a((aj)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class aj>
	//    3    5:invokevirtual   #40  <Method void a(aj)>
	//    4    8:return          
	}

	final ab a;

	ab$12(ab ab1)
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
