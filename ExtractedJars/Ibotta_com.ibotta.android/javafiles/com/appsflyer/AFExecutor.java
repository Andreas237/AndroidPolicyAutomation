// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import java.util.concurrent.*;

// Referenced classes of package com.appsflyer:
//			AFLogger

public class AFExecutor
{

	private AFExecutor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static AFExecutor getInstance()
	{
		if(_fld02CE == null)
	//*   0    0:getstatic       #19  <Field AFExecutor _fld02CE>
	//*   1    3:ifnonnull       16
			_fld02CE = new AFExecutor();
	//    2    6:new             #2   <Class AFExecutor>
	//    3    9:dup             
	//    4   10:invokespecial   #20  <Method void AFExecutor()>
	//    5   13:putstatic       #19  <Field AFExecutor _fld02CE>
		return _fld02CE;
	//    6   16:getstatic       #19  <Field AFExecutor _fld02CE>
	//    7   19:areturn         
	}

	private static void _mth02CF(ExecutorService executorservice)
	{
		AFLogger.afRDLog("shut downing executor ...");
	//    0    0:ldc1            #25  <String "shut downing executor ...">
	//    1    2:invokestatic    #31  <Method void AFLogger.afRDLog(String)>
		executorservice.shutdown();
	//    2    5:aload_0         
	//    3    6:invokeinterface #36  <Method void ExecutorService.shutdown()>
		executorservice.awaitTermination(10L, TimeUnit.SECONDS);
	//    4   11:aload_0         
	//    5   12:ldc2w           #37  <Long 10L>
	//    6   15:getstatic       #44  <Field TimeUnit TimeUnit.SECONDS>
	//    7   18:invokeinterface #48  <Method boolean ExecutorService.awaitTermination(long, TimeUnit)>
	//    8   23:pop             
		if(!executorservice.isTerminated())
	//*   9   24:aload_0         
	//*  10   25:invokeinterface #52  <Method boolean ExecutorService.isTerminated()>
	//*  11   30:ifne            38
			AFLogger.afRDLog("killing non-finished tasks");
	//   12   33:ldc1            #54  <String "killing non-finished tasks">
	//   13   35:invokestatic    #31  <Method void AFLogger.afRDLog(String)>
		executorservice.shutdownNow();
	//   14   38:aload_0         
	//   15   39:invokeinterface #58  <Method java.util.List ExecutorService.shutdownNow()>
	//   16   44:pop             
		return;
	//   17   45:return          
		Object obj;
		obj;
	//   18   46:astore_1        
		  goto _L1
	//*  19   47:goto            77
_L3:
		AFLogger.afRDLog("InterruptedException!!!");
	//   20   50:ldc1            #60  <String "InterruptedException!!!">
	//   21   52:invokestatic    #31  <Method void AFLogger.afRDLog(String)>
		if(!executorservice.isTerminated())
	//*  22   55:aload_0         
	//*  23   56:invokeinterface #52  <Method boolean ExecutorService.isTerminated()>
	//*  24   61:ifne            69
			AFLogger.afRDLog("killing non-finished tasks");
	//   25   64:ldc1            #54  <String "killing non-finished tasks">
	//   26   66:invokestatic    #31  <Method void AFLogger.afRDLog(String)>
		executorservice.shutdownNow();
	//   27   69:aload_0         
	//   28   70:invokeinterface #58  <Method java.util.List ExecutorService.shutdownNow()>
	//   29   75:pop             
		return;
	//   30   76:return          
_L1:
		if(!executorservice.isTerminated())
	//*  31   77:aload_0         
	//*  32   78:invokeinterface #52  <Method boolean ExecutorService.isTerminated()>
	//*  33   83:ifne            91
			AFLogger.afRDLog("killing non-finished tasks");
	//   34   86:ldc1            #54  <String "killing non-finished tasks">
	//   35   88:invokestatic    #31  <Method void AFLogger.afRDLog(String)>
		executorservice.shutdownNow();
	//   36   91:aload_0         
	//   37   92:invokeinterface #58  <Method java.util.List ExecutorService.shutdownNow()>
	//   38   97:pop             
		throw obj;
	//   39   98:aload_1         
	//   40   99:athrow          
		obj;
	//   41  100:astore_1        
		if(true) goto _L3; else goto _L2
_L2:
	//*  42  101:goto            50
	}

	public Executor getThreadPoolExecutor()
	{
		Executor executor = _fld02CB;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Executor _fld02CB>
	//    2    4:astore_2        
		boolean flag;
		if(executor != null && (!(executor instanceof ThreadPoolExecutor) || !((ThreadPoolExecutor)executor).isShutdown() && !((ThreadPoolExecutor)_fld02CB).isTerminated() && !((ThreadPoolExecutor)_fld02CB).isTerminating()))
	//*   3    5:aload_2         
	//*   4    6:ifnull          60
	//*   5    9:aload_2         
	//*   6   10:instanceof      #66  <Class ThreadPoolExecutor>
	//*   7   13:ifeq            55
	//*   8   16:aload_2         
	//*   9   17:checkcast       #66  <Class ThreadPoolExecutor>
	//*  10   20:invokevirtual   #69  <Method boolean ThreadPoolExecutor.isShutdown()>
	//*  11   23:ifne            60
	//*  12   26:aload_0         
	//*  13   27:getfield        #64  <Field Executor _fld02CB>
	//*  14   30:checkcast       #66  <Class ThreadPoolExecutor>
	//*  15   33:invokevirtual   #70  <Method boolean ThreadPoolExecutor.isTerminated()>
	//*  16   36:ifne            60
	//*  17   39:aload_0         
	//*  18   40:getfield        #64  <Field Executor _fld02CB>
	//*  19   43:checkcast       #66  <Class ThreadPoolExecutor>
	//*  20   46:invokevirtual   #73  <Method boolean ThreadPoolExecutor.isTerminating()>
	//*  21   49:ifeq            55
	//*  22   52:goto            60
			flag = false;
	//   23   55:iconst_0        
	//   24   56:istore_1        
		else
	//*  25   57:goto            62
			flag = true;
	//   26   60:iconst_1        
	//   27   61:istore_1        
		if(flag)
	//*  28   62:iload_1         
	//*  29   63:ifeq            89
			if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  30   66:getstatic       #79  <Field int android.os.Build$VERSION.SDK_INT>
	//*  31   69:bipush          11
	//*  32   71:icmplt          85
				_fld02CB = ((Executor) (Executors.newFixedThreadPool(2)));
	//   33   74:aload_0         
	//   34   75:iconst_2        
	//   35   76:invokestatic    #85  <Method ExecutorService Executors.newFixedThreadPool(int)>
	//   36   79:putfield        #64  <Field Executor _fld02CB>
			else
	//*  37   82:goto            89
				return ((Executor) (Executors.newSingleThreadExecutor()));
	//   38   85:invokestatic    #89  <Method ExecutorService Executors.newSingleThreadExecutor()>
	//   39   88:areturn         
		return _fld02CB;
	//   40   89:aload_0         
	//   41   90:getfield        #64  <Field Executor _fld02CB>
	//   42   93:areturn         
	}

	final ScheduledThreadPoolExecutor _mth02CB()
	{
		ScheduledExecutorService scheduledexecutorservice = _fld02CF;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field ScheduledExecutorService _fld02CF>
	//    2    4:astore_2        
		boolean flag;
		if(scheduledexecutorservice != null && !scheduledexecutorservice.isShutdown() && !_fld02CF.isTerminated())
	//*   3    5:aload_2         
	//*   4    6:ifnull          38
	//*   5    9:aload_2         
	//*   6   10:invokeinterface #95  <Method boolean ScheduledExecutorService.isShutdown()>
	//*   7   15:ifne            38
	//*   8   18:aload_0         
	//*   9   19:getfield        #92  <Field ScheduledExecutorService _fld02CF>
	//*  10   22:invokeinterface #96  <Method boolean ScheduledExecutorService.isTerminated()>
	//*  11   27:ifeq            33
	//*  12   30:goto            38
			flag = false;
	//   13   33:iconst_0        
	//   14   34:istore_1        
		else
	//*  15   35:goto            40
			flag = true;
	//   16   38:iconst_1        
	//   17   39:istore_1        
		if(flag)
	//*  18   40:iload_1         
	//*  19   41:ifeq            52
			_fld02CF = Executors.newScheduledThreadPool(2);
	//   20   44:aload_0         
	//   21   45:iconst_2        
	//   22   46:invokestatic    #100 <Method ScheduledExecutorService Executors.newScheduledThreadPool(int)>
	//   23   49:putfield        #92  <Field ScheduledExecutorService _fld02CF>
		return (ScheduledThreadPoolExecutor)_fld02CF;
	//   24   52:aload_0         
	//   25   53:getfield        #92  <Field ScheduledExecutorService _fld02CF>
	//   26   56:checkcast       #102 <Class ScheduledThreadPoolExecutor>
	//   27   59:areturn         
	}

	final void _mth02CF()
	{
		try
		{
			_mth02CF(((ExecutorService) (_fld02CF)));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field ScheduledExecutorService _fld02CF>
	//    2    4:invokestatic    #106 <Method void _mth02CF(ExecutorService)>
			if(_fld02CB instanceof ThreadPoolExecutor)
	//*   3    7:aload_0         
	//*   4    8:getfield        #64  <Field Executor _fld02CB>
	//*   5   11:instanceof      #66  <Class ThreadPoolExecutor>
	//*   6   14:ifeq            27
				_mth02CF(((ExecutorService) ((ThreadPoolExecutor)_fld02CB)));
	//    7   17:aload_0         
	//    8   18:getfield        #64  <Field Executor _fld02CB>
	//    9   21:checkcast       #66  <Class ThreadPoolExecutor>
	//   10   24:invokestatic    #106 <Method void _mth02CF(ExecutorService)>
			return;
	//   11   27:return          
		}
		catch(Throwable throwable)
	//*  12   28:astore_1        
		{
			AFLogger.afErrorLog("failed to stop Executors", throwable);
	//   13   29:ldc1            #108 <String "failed to stop Executors">
	//   14   31:aload_1         
	//   15   32:invokestatic    #112 <Method void AFLogger.afErrorLog(String, Throwable)>
		}
	//   16   35:return          
	}

	private static AFExecutor _fld02CE;
	private Executor _fld02CB;
	private ScheduledExecutorService _fld02CF;
}
