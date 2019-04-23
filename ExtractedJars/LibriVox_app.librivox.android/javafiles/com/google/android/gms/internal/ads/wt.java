// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			yb, wu, xe, abi, 
//			abe

public abstract class wt
	implements yb
{

	public wt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = ((Runnable) (new wu(this)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class wu>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #22  <Method void wu(wt)>
	//    7   13:putfield        #24  <Field Runnable a>
		c = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #26  <Field boolean c>
	//   11   21:return          
	}

	public wt(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		a = ((Runnable) (new wu(this)));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class wu>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #22  <Method void wu(wt)>
	//    7   13:putfield        #24  <Field Runnable a>
		c = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #26  <Field boolean c>
	//   11   21:return          
	}

	static Thread a(wt wt1, Thread thread)
	{
		wt1.b = thread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field Thread b>
		return thread;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public abstract void a();

	public final void b()
	{
		b_();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method void b_()>
		if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #31  <Field Thread b>
	//*   4    8:ifnull          18
			b.interrupt();
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field Thread b>
	//    7   15:invokevirtual   #39  <Method void Thread.interrupt()>
	//    8   18:return          
	}

	public abstract void b_();

	public final Object c()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean c>
	//*   2    4:ifeq            22
		{
			Runnable runnable = a;
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field Runnable a>
	//    5   11:astore_1        
			return ((Object) (xe.b.a(runnable)));
	//    6   12:getstatic       #45  <Field abi xe.b>
	//    7   15:aload_1         
	//    8   16:invokeinterface #50  <Method abe abi.a(Runnable)>
	//    9   21:areturn         
		} else
		{
			return ((Object) (xe.a(a)));
	//   10   22:aload_0         
	//   11   23:getfield        #24  <Field Runnable a>
	//   12   26:invokestatic    #51  <Method abe xe.a(Runnable)>
	//   13   29:areturn         
		}
	}

	public final abe h()
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean c>
	//*   2    4:ifeq            22
		{
			Runnable runnable = a;
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field Runnable a>
	//    5   11:astore_1        
			return xe.b.a(runnable);
	//    6   12:getstatic       #45  <Field abi xe.b>
	//    7   15:aload_1         
	//    8   16:invokeinterface #50  <Method abe abi.a(Runnable)>
	//    9   21:areturn         
		} else
		{
			return xe.a(a);
	//   10   22:aload_0         
	//   11   23:getfield        #24  <Field Runnable a>
	//   12   26:invokestatic    #51  <Method abe xe.a(Runnable)>
	//   13   29:areturn         
		}
	}

	private final Runnable a;
	private volatile Thread b;
	private boolean c;
}
