// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.g.t;
import b.a.a.a.c;
import b.a.a.a.l;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsUncaughtExceptionHandler
	implements Thread.UncaughtExceptionHandler
{
	static interface CrashListener
	{

		public abstract void onUncaughtException(SettingsDataProvider settingsdataprovider, Thread thread, Throwable throwable, boolean flag);
	}

	static interface SettingsDataProvider
	{

		public abstract t getSettingsData();
	}


	public CrashlyticsUncaughtExceptionHandler(CrashListener crashlistener, SettingsDataProvider settingsdataprovider, boolean flag, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		crashListener = crashlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field CrashlyticsUncaughtExceptionHandler$CrashListener crashListener>
		settingsDataProvider = settingsdataprovider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field CrashlyticsUncaughtExceptionHandler$SettingsDataProvider settingsDataProvider>
		firebaseCrashlyticsClientFlag = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #33  <Field boolean firebaseCrashlyticsClientFlag>
		defaultHandler = uncaughtexceptionhandler;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #35  <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   14   25:aload_0         
	//   15   26:new             #37  <Class AtomicBoolean>
	//   16   29:dup             
	//   17   30:iconst_0        
	//   18   31:invokespecial   #40  <Method void AtomicBoolean(boolean)>
	//   19   34:putfield        #42  <Field AtomicBoolean isHandlingException>
	//   20   37:return          
	}

	boolean isHandlingException()
	{
		return isHandlingException.get();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AtomicBoolean isHandlingException>
	//    2    4:invokevirtual   #47  <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	public void uncaughtException(Thread thread, Throwable throwable)
	{
		isHandlingException.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AtomicBoolean isHandlingException>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #54  <Method void AtomicBoolean.set(boolean)>
		crashListener.onUncaughtException(settingsDataProvider, thread, throwable, firebaseCrashlyticsClientFlag);
	//    4    8:aload_0         
	//    5    9:getfield        #29  <Field CrashlyticsUncaughtExceptionHandler$CrashListener crashListener>
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field CrashlyticsUncaughtExceptionHandler$SettingsDataProvider settingsDataProvider>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #33  <Field boolean firebaseCrashlyticsClientFlag>
	//   12   22:invokeinterface #58  <Method void CrashlyticsUncaughtExceptionHandler$CrashListener.onUncaughtException(CrashlyticsUncaughtExceptionHandler$SettingsDataProvider, Thread, Throwable, boolean)>
_L2:
		c.g().a("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//   13   27:invokestatic    #64  <Method l c.g()>
	//   14   30:ldc1            #66  <String "CrashlyticsCore">
	//   15   32:ldc1            #68  <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   16   34:invokeinterface #74  <Method void l.a(String, String)>
		defaultHandler.uncaughtException(thread, throwable);
	//   17   39:aload_0         
	//   18   40:getfield        #35  <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:invokeinterface #76  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		isHandlingException.set(false);
	//   22   50:aload_0         
	//   23   51:getfield        #42  <Field AtomicBoolean isHandlingException>
	//   24   54:iconst_0        
	//   25   55:invokevirtual   #54  <Method void AtomicBoolean.set(boolean)>
		return;
	//   26   58:return          
		Object obj;
		obj;
	//   27   59:astore_3        
		break; /* Loop/switch isn't completed */
	//   28   60:goto            80
		obj;
	//   29   63:astore_3        
		c.g().e("CrashlyticsCore", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
	//   30   64:invokestatic    #64  <Method l c.g()>
	//   31   67:ldc1            #66  <String "CrashlyticsCore">
	//   32   69:ldc1            #78  <String "An error occurred in the uncaught exception handler">
	//   33   71:aload_3         
	//   34   72:invokeinterface #82  <Method void l.e(String, String, Throwable)>
		if(true) goto _L2; else goto _L1
	//   35   77:goto            27
_L1:
		c.g().a("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
	//   36   80:invokestatic    #64  <Method l c.g()>
	//   37   83:ldc1            #66  <String "CrashlyticsCore">
	//   38   85:ldc1            #68  <String "Crashlytics completed exception processing. Invoking default exception handler.">
	//   39   87:invokeinterface #74  <Method void l.a(String, String)>
		defaultHandler.uncaughtException(thread, throwable);
	//   40   92:aload_0         
	//   41   93:getfield        #35  <Field Thread$UncaughtExceptionHandler defaultHandler>
	//   42   96:aload_1         
	//   43   97:aload_2         
	//   44   98:invokeinterface #76  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		isHandlingException.set(false);
	//   45  103:aload_0         
	//   46  104:getfield        #42  <Field AtomicBoolean isHandlingException>
	//   47  107:iconst_0        
	//   48  108:invokevirtual   #54  <Method void AtomicBoolean.set(boolean)>
		throw obj;
	//   49  111:aload_3         
	//   50  112:athrow          
	}

	private final CrashListener crashListener;
	private final Thread.UncaughtExceptionHandler defaultHandler;
	private final boolean firebaseCrashlyticsClientFlag;
	private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
	private final SettingsDataProvider settingsDataProvider;
}
