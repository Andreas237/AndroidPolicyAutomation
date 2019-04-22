// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			ab, al

class ab$9
	implements IEventSubscriber
{

	public void a(al al1)
	{
		a.o();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ab a>
	//    2    4:invokevirtual   #26  <Method void ab.o()>
	//    3    7:return          
	}

	public void trigger(Object obj)
	{
		a((al)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class al>
	//    3    5:invokevirtual   #32  <Method void a(al)>
	//    4    8:return          
	}

	final ab a;

	ab$9(ab ab1)
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
