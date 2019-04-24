// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.util.LinkedList;

// Referenced classes of package o:
//			ea

public final class ec
{

	public ec()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #22  <Field Thread b>
		a = new LinkedList();
	//    5    9:aload_0         
	//    6   10:new             #24  <Class LinkedList>
	//    7   13:dup             
	//    8   14:invokespecial   #25  <Method void LinkedList()>
	//    9   17:putfield        #27  <Field LinkedList a>
	//   10   20:return          
	}

	static Thread a(ec ec1)
	{
		ec1.b = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #22  <Field Thread b>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static LinkedList b(ec ec1)
	{
		return ec1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field LinkedList a>
	//    2    4:areturn         
	}

	public static ec d()
	{
		return d;
	//    0    0:getstatic       #18  <Field ec d>
	//    1    3:areturn         
	}

	public final void c(Runnable runnable)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		a.add(((Object) (runnable)));
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field LinkedList a>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #36  <Method boolean LinkedList.add(Object)>
	//    6   10:pop             
		if(b == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #22  <Field Thread b>
	//*   9   15:ifnonnull       44
		{
			b = new Thread(((Runnable) (new ea(this))));
	//   10   18:aload_0         
	//   11   19:new             #38  <Class Thread>
	//   12   22:dup             
	//   13   23:new             #40  <Class ea>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:invokespecial   #43  <Method void ea(ec)>
	//   17   31:invokespecial   #45  <Method void Thread(Runnable)>
	//   18   34:putfield        #22  <Field Thread b>
			b.start();
	//   19   37:aload_0         
	//   20   38:getfield        #22  <Field Thread b>
	//   21   41:invokevirtual   #48  <Method void Thread.start()>
		}
		this;
	//   22   44:aload_0         
		JVM INSTR monitorexit ;
	//   23   45:monitorexit     
		return;
	//   24   46:return          
		runnable;
	//   25   47:astore_1        
	//*  26   48:aload_0         
		throw runnable;
	//   27   49:monitorexit     
	//   28   50:aload_1         
	//   29   51:athrow          
	}

	private static ec d = new ec();
	private LinkedList a;
	private Thread b;

	static 
	{
	//    0    0:new             #2   <Class ec>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void ec()>
	//    3    7:putstatic       #18  <Field ec d>
	//*   4   10:return          
	}
}
