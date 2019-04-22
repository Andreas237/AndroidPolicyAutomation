// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.events.IEventSubscriber;

// Referenced classes of package bo.app:
//			q, dj, ag

class q$4
	implements IEventSubscriber
{

	public void a(ag ag1)
	{
		ag1 = ((ag) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field q a>
	//    2    4:astore_1        
		((q) (ag1)).a(q.b(((q) (ag1))) + (long)q.c(a).a((int)q.b(a)));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #26  <Method long q.b(q)>
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field q a>
	//    8   14:invokestatic    #30  <Method dj q.c(q)>
	//    9   17:aload_0         
	//   10   18:getfield        #17  <Field q a>
	//   11   21:invokestatic    #26  <Method long q.b(q)>
	//   12   24:l2i             
	//   13   25:invokevirtual   #35  <Method int dj.a(int)>
	//   14   28:i2l             
	//   15   29:ladd            
	//   16   30:invokevirtual   #38  <Method void q.a(long)>
	//   17   33:return          
	}

	public void trigger(Object obj)
	{
		a((ag)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #42  <Class ag>
	//    3    5:invokevirtual   #44  <Method void a(ag)>
	//    4    8:return          
	}

	final q a;

	q$4(q q1)
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
