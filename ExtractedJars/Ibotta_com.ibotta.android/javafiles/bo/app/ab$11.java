// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			ab, an, bl, bz

class ab$11
	implements IEventSubscriber
{

	public void a(an an1)
	{
		ab.i(a).a(an1.a());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ab a>
	//    2    4:invokestatic    #27  <Method bl ab.i(ab)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method ct an.a()>
	//    5   11:invokevirtual   #37  <Method void bl.a(ct)>
		ab.j(a).a(an1.a());
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field ab a>
	//    8   18:invokestatic    #41  <Method bz ab.j(ab)>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #32  <Method ct an.a()>
	//   11   25:invokevirtual   #44  <Method void bz.a(ct)>
	//   12   28:return          
	}

	public void trigger(Object obj)
	{
		a((an)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class an>
	//    3    5:invokevirtual   #48  <Method void a(an)>
	//    4    8:return          
	}

	final ab a;

	ab$11(ab ab1)
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
