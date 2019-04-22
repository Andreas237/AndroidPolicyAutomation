// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsUncaughtExceptionHandler
	implements Thread.UncaughtExceptionHandler
{
	static interface CrashListener
	{

		public abstract void onUncaughtException(Thread thread, Throwable throwable);
	}


	public CrashlyticsUncaughtExceptionHandler(CrashListener crashlistener, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		crashListener = crashlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field CrashlyticsUncaughtExceptionHandler$CrashListener crashListener>
		defaultHandler = uncaughtexceptionhandler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field Thread$UncaughtExceptionHandler defaultHandler>
	//    8   14:aload_0         
	//    9   15:new             #26  <Class AtomicBoolean>
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:invokespecial   #29  <Method void AtomicBoolean(boolean)>
	//   13   23:putfield        #31  <Field AtomicBoolean isHandlingException>
	//   14   26:return          
	}

	boolean isHandlingException()
	{
		return isHandlingException.get();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AtomicBoolean isHandlingException>
	//    2    4:invokevirtual   #36  <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		isHandlingException.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AtomicBoolean isHandlingException>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #43  <Method void AtomicBoolean.set(boolean)>
		crashListener.onUncaughtException(thread, throwable);
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field CrashlyticsUncaughtExceptionHandler$CrashListener crashListener>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokeinterface #46  <Method void CrashlyticsUncaughtExceptionHandler$CrashListener.onUncaughtException(Thread, Throwable)>
_L2:
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//    9   19:invokestatic    #52  <Method Logger Fabric.getLogger()>
	//   10   22:ldc1            #54  <String "CrashlyticsCore">
	//   11   24:ldc1            #56  <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   12   26:invokeinterface #62  <Method void Logger.d(String, String)>
		defaultHandler.uncaughtException(thread, throwable);
	//   13   31:aload_0         
	//   14   32:getfield        #24  <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   15   35:aload_1         
	//   16   36:aload_2         
	//   17   37:invokeinterface #64  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		isHandlingException.set(false);
	//   18   42:aload_0         
	//   19   43:getfield        #31  <Field AtomicBoolean isHandlingException>
	//   20   46:iconst_0        
	//   21   47:invokevirtual   #43  <Method void AtomicBoolean.set(boolean)>
		return;
	//   22   50:return          
		Object obj;
		obj;
	//   23   51:astore_3        
		break; /* Loop/switch isn't completed */
	//   24   52:goto            72
		obj;
	//   25   55:astore_3        
		Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
	//   26   56:invokestatic    #52  <Method Logger Fabric.getLogger()>
	//   27   59:ldc1            #54  <String "CrashlyticsCore">
	//   28   61:ldc1            #66  <String "An error occurred in the uncaught exception handler">
	//   29   63:aload_3         
	//   30   64:invokeinterface #70  <Method void Logger.e(String, String, Throwable)>
		if(true) goto _L2; else goto _L1
	//   31   69:goto            19
_L1:
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//   32   72:invokestatic    #52  <Method Logger Fabric.getLogger()>
	//   33   75:ldc1            #54  <String "CrashlyticsCore">
	//   34   77:ldc1            #56  <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   35   79:invokeinterface #62  <Method void Logger.d(String, String)>
		defaultHandler.uncaughtException(thread, throwable);
	//   36   84:aload_0         
	//   37   85:getfield        #24  <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   38   88:aload_1         
	//   39   89:aload_2         
	//   40   90:invokeinterface #64  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		isHandlingException.set(false);
	//   41   95:aload_0         
	//   42   96:getfield        #31  <Field AtomicBoolean isHandlingException>
	//   43   99:iconst_0        
	//   44  100:invokevirtual   #43  <Method void AtomicBoolean.set(boolean)>
		throw obj;
	//   45  103:aload_3         
	//   46  104:athrow          
	}

	private final CrashListener crashListener;
	private final Thread.UncaughtExceptionHandler defaultHandler;
	private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
}
