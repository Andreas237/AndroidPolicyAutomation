// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			ac

class ac$2
	implements Runnable
{

	public void run()
	{
		a.trigger(b);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field IEventSubscriber a>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field Object b>
	//    4    8:invokeinterface #35  <Method void IEventSubscriber.trigger(Object)>
	//    5   13:return          
	}

	final IEventSubscriber a;
	final Object b;
	final ac c;

	ac$2(ac ac1, IEventSubscriber ieventsubscriber, Object obj)
	{
		c = ac1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field ac c>
		a = ieventsubscriber;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field IEventSubscriber a>
		b = obj;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field Object b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
