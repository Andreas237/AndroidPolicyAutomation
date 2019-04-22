// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			q, aa, aq

class q$2
	implements IEventSubscriber
{

	public void a(aq aq1)
	{
		q.a(a, aa.a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field q a>
	//    2    4:getstatic       #27  <Field aa aa.a>
	//    3    7:invokestatic    #30  <Method aa q.a(q, aa)>
	//    4   10:pop             
		a.c();
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field q a>
	//    7   15:invokevirtual   #33  <Method void q.c()>
	//    8   18:return          
	}

	public void trigger(Object obj)
	{
		a((aq)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #37  <Class aq>
	//    3    5:invokevirtual   #39  <Method void a(aq)>
	//    4    8:return          
	}

	final q a;

	q$2(q q1)
	{
		a = q1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field q a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
