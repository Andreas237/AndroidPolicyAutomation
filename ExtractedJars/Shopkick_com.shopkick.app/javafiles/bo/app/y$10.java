// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			y, ae, bc

class y$10
	implements IEventSubscriber
{

	public void a(ae ae1)
	{
		y.i(a).a(ae1.a());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field y a>
	//    2    4:invokestatic    #26  <Method bc y.i(y)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #31  <Method java.util.List ae.a()>
	//    5   11:invokevirtual   #36  <Method void bc.a(java.util.List)>
	//    6   14:return          
	}

	public void trigger(Object obj)
	{
		a((ae)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #28  <Class ae>
	//    3    5:invokevirtual   #40  <Method void a(ae)>
	//    4    8:return          
	}

	final y a;

	y$10(y y1)
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
