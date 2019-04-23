// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			y, ah, bo, bc, 
//			br

class y$9
	implements IEventSubscriber
{

	public void a(ah ah1)
	{
		y.g(a).a(ah1.a());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field y a>
	//    2    4:invokestatic    #27  <Method bo y.g(y)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method bz ah.a()>
	//    5   11:invokeinterface #37  <Method void bo.a(bz)>
		y.i(a).a(ah1.a());
	//    6   16:aload_0         
	//    7   17:getfield        #18  <Field y a>
	//    8   20:invokestatic    #41  <Method bc y.i(y)>
	//    9   23:aload_1         
	//   10   24:invokevirtual   #32  <Method bz ah.a()>
	//   11   27:invokevirtual   #44  <Method void bc.a(bz)>
		y.j(a).a(ah1.a());
	//   12   30:aload_0         
	//   13   31:getfield        #18  <Field y a>
	//   14   34:invokestatic    #48  <Method br y.j(y)>
	//   15   37:aload_1         
	//   16   38:invokevirtual   #32  <Method bz ah.a()>
	//   17   41:invokevirtual   #51  <Method void br.a(bz)>
	//   18   44:return          
	}

	public void trigger(Object obj)
	{
		a((ah)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class ah>
	//    3    5:invokevirtual   #55  <Method void a(ah)>
	//    4    8:return          
	}

	final y a;

	y$9(y y1)
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
