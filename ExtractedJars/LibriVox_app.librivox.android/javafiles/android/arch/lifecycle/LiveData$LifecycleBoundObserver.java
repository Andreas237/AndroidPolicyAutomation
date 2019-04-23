// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			q, GenericLifecycleObserver, j, f, 
//			h, LiveData, t, g

class LiveData$LifecycleBoundObserver extends q
	implements GenericLifecycleObserver
{

	public void a(j j1, g g)
	{
		if(a.getLifecycle().a() == h.a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field j a>
	//*   2    4:invokeinterface #27  <Method f j.getLifecycle()>
	//*   3    9:invokevirtual   #32  <Method h f.a()>
	//*   4   12:getstatic       #37  <Field h h.a>
	//*   5   15:if_acmpne       30
		{
			b.a(c);
	//    6   18:aload_0         
	//    7   19:getfield        #14  <Field LiveData b>
	//    8   22:aload_0         
	//    9   23:getfield        #41  <Field t c>
	//   10   26:invokevirtual   #46  <Method void LiveData.a(t)>
			return;
	//   11   29:return          
		} else
		{
			a(a());
	//   12   30:aload_0         
	//   13   31:aload_0         
	//   14   32:invokevirtual   #49  <Method boolean a()>
	//   15   35:invokevirtual   #52  <Method void a(boolean)>
			return;
	//   16   38:return          
		}
	}

	boolean a()
	{
		return a.getLifecycle().a().a(h.d);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field j a>
	//    2    4:invokeinterface #27  <Method f j.getLifecycle()>
	//    3    9:invokevirtual   #32  <Method h f.a()>
	//    4   12:getstatic       #55  <Field h h.d>
	//    5   15:invokevirtual   #58  <Method boolean h.a(h)>
	//    6   18:ireturn         
	}

	boolean a(j j1)
	{
		return a == j1;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field j a>
	//    2    4:aload_1         
	//    3    5:if_acmpne       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	void b()
	{
		a.getLifecycle().b(((i) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field j a>
	//    2    4:invokeinterface #27  <Method f j.getLifecycle()>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #63  <Method void f.b(i)>
	//    5   13:return          
	}

	final j a;
	final LiveData b;

	LiveData$LifecycleBoundObserver(LiveData livedata, j j1, t t)
	{
		b = livedata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field LiveData b>
		super(livedata, t);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_3         
	//    6    8:invokespecial   #17  <Method void q(LiveData, t)>
		a = j1;
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:putfield        #19  <Field j a>
	//   10   16:return          
	}
}
