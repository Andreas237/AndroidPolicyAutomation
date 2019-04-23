// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.Appboy;
import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			y, aj

class y$8
	implements IEventSubscriber
{

	public void a(aj aj1)
	{
		y.a(a, aj1);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field y a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #26  <Method void y.a(y, aj)>
		Appboy.getInstance(y.h(a)).requestImmediateDataFlush();
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field y a>
	//    6   12:invokestatic    #30  <Method android.content.Context y.h(y)>
	//    7   15:invokestatic    #36  <Method Appboy Appboy.getInstance(android.content.Context)>
	//    8   18:invokevirtual   #39  <Method void Appboy.requestImmediateDataFlush()>
	//    9   21:return          
	}

	public void trigger(Object obj)
	{
		a((aj)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #43  <Class aj>
	//    3    5:invokevirtual   #45  <Method void a(aj)>
	//    4    8:return          
	}

	final y a;

	y$8(y y1)
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
