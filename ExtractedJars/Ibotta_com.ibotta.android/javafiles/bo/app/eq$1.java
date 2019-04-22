// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.support.AppboyLogger;

// Referenced classes of package bo.app:
//			eq, ea, n, q

class eq$1
	implements Runnable
{

	public void run()
	{
		ea ea1 = eq.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field eq a>
	//    2    4:invokestatic    #28  <Method ea eq.a(eq)>
	//    3    7:astore_1        
		ea1;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		if(!eq.a(a).c())
			break MISSING_BLOCK_LABEL_51;
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field eq a>
	//    8   14:invokestatic    #28  <Method ea eq.a(eq)>
	//    9   17:invokevirtual   #34  <Method boolean ea.c()>
	//   10   20:ifeq            51
		AppboyLogger.i(eq.p(), "User cache was locked, waiting.");
	//   11   23:invokestatic    #38  <Method String eq.p()>
	//   12   26:ldc1            #40  <String "User cache was locked, waiting.">
	//   13   28:invokestatic    #46  <Method int AppboyLogger.i(String, String)>
	//   14   31:pop             
		Exception exception1;
		Exception exception2;
		try
		{
			((Object) (eq.a(a))).wait();
	//   15   32:aload_0         
	//   16   33:getfield        #17  <Field eq a>
	//   17   36:invokestatic    #28  <Method ea eq.a(eq)>
	//   18   39:invokevirtual   #49  <Method void Object.wait()>
			AppboyLogger.d(eq.p(), "User cache notified.");
	//   19   42:invokestatic    #38  <Method String eq.p()>
	//   20   45:ldc1            #51  <String "User cache notified.">
	//   21   47:invokestatic    #54  <Method int AppboyLogger.d(String, String)>
	//   22   50:pop             
		}
	//*  23   51:aload_1         
	//*  24   52:monitorexit     
	//*  25   53:aload_0         
	//*  26   54:getfield        #17  <Field eq a>
	//*  27   57:invokestatic    #57  <Method n eq.c(eq)>
	//*  28   60:aload_0         
	//*  29   61:getfield        #17  <Field eq a>
	//*  30   64:invokestatic    #61  <Method ac eq.b(eq)>
	//*  31   67:invokevirtual   #66  <Method void n.a(ac)>
	//*  32   70:goto            89
	//*  33   73:astore_2        
	//*  34   74:aload_1         
	//*  35   75:monitorexit     
	//*  36   76:aload_2         
	//*  37   77:athrow          
	//*  38   78:astore_1        
	//*  39   79:invokestatic    #38  <Method String eq.p()>
	//*  40   82:ldc1            #68  <String "Exception while shutting down dispatch manager. Continuing.">
	//*  41   84:aload_1         
	//*  42   85:invokestatic    #72  <Method int AppboyLogger.w(String, String, Throwable)>
	//*  43   88:pop             
	//*  44   89:aload_0         
	//*  45   90:getfield        #17  <Field eq a>
	//*  46   93:invokestatic    #75  <Method q eq.d(eq)>
	//*  47   96:invokevirtual   #79  <Method boolean q.b()>
	//*  48   99:pop             
	//*  49  100:return          
	//*  50  101:astore_1        
	//*  51  102:invokestatic    #38  <Method String eq.p()>
	//*  52  105:ldc1            #81  <String "Exception while un-registering data refresh broadcast receivers. Continuing.">
	//*  53  107:aload_1         
	//*  54  108:invokestatic    #72  <Method int AppboyLogger.w(String, String, Throwable)>
	//*  55  111:pop             
	//*  56  112:return          
		catch(InterruptedException interruptedexception) { }
	//   57  113:astore_2        
		try
		{
			eq.c(a).a(eq.b(a));
		}
		catch(Exception exception)
		{
			AppboyLogger.w(eq.p(), "Exception while shutting down dispatch manager. Continuing.", ((Throwable) (exception)));
		}
		break MISSING_BLOCK_LABEL_89;
		exception2;
		ea1;
		JVM INSTR monitorexit ;
		throw exception2;
		try
		{
			eq.d(a).b();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Exception exception1)
		{
			AppboyLogger.w(eq.p(), "Exception while un-registering data refresh broadcast receivers. Continuing.", ((Throwable) (exception1)));
		}
		return;
	//*  58  114:goto            51
	}

	final eq a;

	eq$1(eq eq1)
	{
		a = eq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field eq a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
