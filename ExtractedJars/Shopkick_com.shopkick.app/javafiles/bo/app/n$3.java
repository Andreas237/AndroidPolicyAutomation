// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			n, x, al

class n$3
	implements IEventSubscriber
{

	public void a(al al1)
	{
		n.a(a, x.b);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field n a>
	//    2    4:getstatic       #28  <Field x x.b>
	//    3    7:invokestatic    #31  <Method x n.a(n, x)>
	//    4   10:pop             
		a.c();
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field n a>
	//    7   15:invokevirtual   #34  <Method void n.c()>
	//    8   18:return          
	}

	public void trigger(Object obj)
	{
		a((al)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #38  <Class al>
	//    3    5:invokevirtual   #40  <Method void a(al)>
	//    4    8:return          
	}

	final n a;

	n$3(n n1)
	{
		a = n1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field n a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
