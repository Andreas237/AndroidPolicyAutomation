// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			y, af

class y$7
	implements IEventSubscriber
{

	public void a(af af1)
	{
		a.m();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field y a>
	//    2    4:invokevirtual   #26  <Method void y.m()>
	//    3    7:return          
	}

	public void trigger(Object obj)
	{
		a((af)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class af>
	//    3    5:invokevirtual   #32  <Method void a(af)>
	//    4    8:return          
	}

	final y a;

	y$7(y y1)
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
