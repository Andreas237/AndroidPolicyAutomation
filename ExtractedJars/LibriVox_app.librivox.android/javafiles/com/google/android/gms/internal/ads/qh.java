// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			qf, aag

final class qh
	implements Thread.UncaughtExceptionHandler
{

	qh(qf qf1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
	{
		b = qf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field qf b>
		a = uncaughtexceptionhandler;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Thread$UncaughtExceptionHandler a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void uncaughtException(Thread thread, Throwable throwable)
	{
		b.a(thread, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field qf b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #28  <Method void qf.a(Thread, Throwable)>
		Thread.UncaughtExceptionHandler uncaughtexceptionhandler = a;
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field Thread$UncaughtExceptionHandler a>
	//    7   13:astore_3        
		if(uncaughtexceptionhandler != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          54
		{
			uncaughtexceptionhandler.uncaughtException(thread, throwable);
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokeinterface #30  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
			return;
	//   14   26:return          
		}
		  goto _L1
		Object obj;
		obj;
	//   15   27:astore_3        
		  goto _L2
	//*  16   28:goto            55
_L4:
		aag.c("AdMob exception reporter failed reporting the exception.");
	//   17   31:ldc1            #32  <String "AdMob exception reporter failed reporting the exception.">
	//   18   33:invokestatic    #38  <Method void aag.c(String)>
		obj = ((Object) (a));
	//   19   36:aload_0         
	//   20   37:getfield        #16  <Field Thread$UncaughtExceptionHandler a>
	//   21   40:astore_3        
		if(obj != null)
	//*  22   41:aload_3         
	//*  23   42:ifnull          54
		{
			((Thread.UncaughtExceptionHandler) (obj)).uncaughtException(thread, throwable);
	//   24   45:aload_3         
	//   25   46:aload_1         
	//   26   47:aload_2         
	//   27   48:invokeinterface #30  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
			return;
	//   28   53:return          
		}
_L1:
		return;
	//   29   54:return          
_L2:
		Thread.UncaughtExceptionHandler uncaughtexceptionhandler1 = a;
	//   30   55:aload_0         
	//   31   56:getfield        #16  <Field Thread$UncaughtExceptionHandler a>
	//   32   59:astore          4
		if(uncaughtexceptionhandler1 != null)
	//*  33   61:aload           4
	//*  34   63:ifnull          75
			uncaughtexceptionhandler1.uncaughtException(thread, throwable);
	//   35   66:aload           4
	//   36   68:aload_1         
	//   37   69:aload_2         
	//   38   70:invokeinterface #30  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		throw obj;
	//   39   75:aload_3         
	//   40   76:athrow          
		Throwable throwable1;
		throwable1;
	//   41   77:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  42   78:goto            31
	}

	private final Thread.UncaughtExceptionHandler a;
	private final qf b;
}
