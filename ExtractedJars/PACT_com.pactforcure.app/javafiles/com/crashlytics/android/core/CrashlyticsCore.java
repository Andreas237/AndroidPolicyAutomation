// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.core.internal.CrashEventDataProvider;
import com.crashlytics.android.core.internal.models.SessionEventData;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.*;
import io.fabric.sdk.android.services.concurrency.*;
import io.fabric.sdk.android.services.network.*;
import io.fabric.sdk.android.services.persistence.*;
import io.fabric.sdk.android.services.settings.*;
import java.io.File;
import java.net.URL;
import java.util.*;
import java.util.concurrent.*;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsExecutorServiceWrapper, CrashlyticsListener, CrashlyticsUncaughtExceptionHandler, CrashPromptDialog, 
//			CrashlyticsPinningInfoProvider, CrashTest, CrashlyticsFileMarker, ReportUploader, 
//			DefaultCreateReportSpiCall, ManifestUnityVersionProvider, PinningInfoProvider, UnityVersionProvider, 
//			CreateReportSpiCall

public class CrashlyticsCore extends Kit
{
	public static class Builder
	{

		public CrashlyticsCore build()
		{
			if(delay < 0.0F)
		//*   0    0:aload_0         
		//*   1    1:getfield        #22  <Field float delay>
		//*   2    4:fconst_0        
		//*   3    5:fcmpg           
		//*   4    6:ifge            14
				delay = 1.0F;
		//    5    9:aload_0         
		//    6   10:fconst_1        
		//    7   11:putfield        #22  <Field float delay>
			return new CrashlyticsCore(delay, listener, pinningInfoProvider, disabled);
		//    8   14:new             #6   <Class CrashlyticsCore>
		//    9   17:dup             
		//   10   18:aload_0         
		//   11   19:getfield        #22  <Field float delay>
		//   12   22:aload_0         
		//   13   23:getfield        #29  <Field CrashlyticsListener listener>
		//   14   26:aload_0         
		//   15   27:getfield        #31  <Field PinningInfoProvider pinningInfoProvider>
		//   16   30:aload_0         
		//   17   31:getfield        #24  <Field boolean disabled>
		//   18   34:invokespecial   #34  <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean)>
		//   19   37:areturn         
		}

		public Builder delay(float f)
		{
			if(f <= 0.0F)
		//*   0    0:fload_1         
		//*   1    1:fconst_0        
		//*   2    2:fcmpg           
		//*   3    3:ifgt            16
				throw new IllegalArgumentException("delay must be greater than 0");
		//    4    6:new             #37  <Class IllegalArgumentException>
		//    5    9:dup             
		//    6   10:ldc1            #39  <String "delay must be greater than 0">
		//    7   12:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//    8   15:athrow          
			if(delay > 0.0F)
		//*   9   16:aload_0         
		//*  10   17:getfield        #22  <Field float delay>
		//*  11   20:fconst_0        
		//*  12   21:fcmpl           
		//*  13   22:ifle            35
			{
				throw new IllegalStateException("delay already set.");
		//   14   25:new             #44  <Class IllegalStateException>
		//   15   28:dup             
		//   16   29:ldc1            #46  <String "delay already set.">
		//   17   31:invokespecial   #47  <Method void IllegalStateException(String)>
		//   18   34:athrow          
			} else
			{
				delay = f;
		//   19   35:aload_0         
		//   20   36:fload_1         
		//   21   37:putfield        #22  <Field float delay>
				return this;
		//   22   40:aload_0         
		//   23   41:areturn         
			}
		}

		public Builder disabled(boolean flag)
		{
			disabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #24  <Field boolean disabled>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder listener(CrashlyticsListener crashlyticslistener)
		{
			if(crashlyticslistener == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("listener must not be null.");
		//    2    4:new             #37  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #51  <String "listener must not be null.">
		//    5   10:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(listener != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #29  <Field CrashlyticsListener listener>
		//*   9   18:ifnull          31
			{
				throw new IllegalStateException("listener already set.");
		//   10   21:new             #44  <Class IllegalStateException>
		//   11   24:dup             
		//   12   25:ldc1            #53  <String "listener already set.">
		//   13   27:invokespecial   #47  <Method void IllegalStateException(String)>
		//   14   30:athrow          
			} else
			{
				listener = crashlyticslistener;
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:putfield        #29  <Field CrashlyticsListener listener>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		public Builder pinningInfo(PinningInfoProvider pinninginfoprovider)
		{
			if(pinninginfoprovider == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("pinningInfoProvider must not be null.");
		//    2    4:new             #37  <Class IllegalArgumentException>
		//    3    7:dup             
		//    4    8:ldc1            #58  <String "pinningInfoProvider must not be null.">
		//    5   10:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//    6   13:athrow          
			if(pinningInfoProvider != null)
		//*   7   14:aload_0         
		//*   8   15:getfield        #31  <Field PinningInfoProvider pinningInfoProvider>
		//*   9   18:ifnull          31
			{
				throw new IllegalStateException("pinningInfoProvider already set.");
		//   10   21:new             #44  <Class IllegalStateException>
		//   11   24:dup             
		//   12   25:ldc1            #60  <String "pinningInfoProvider already set.">
		//   13   27:invokespecial   #47  <Method void IllegalStateException(String)>
		//   14   30:athrow          
			} else
			{
				pinningInfoProvider = pinninginfoprovider;
		//   15   31:aload_0         
		//   16   32:aload_1         
		//   17   33:putfield        #31  <Field PinningInfoProvider pinningInfoProvider>
				return this;
		//   18   36:aload_0         
		//   19   37:areturn         
			}
		}

		private float delay;
		private boolean disabled;
		private CrashlyticsListener listener;
		private PinningInfoProvider pinningInfoProvider;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			delay = -1F;
		//    2    4:aload_0         
		//    3    5:ldc1            #20  <Float -1F>
		//    4    7:putfield        #22  <Field float delay>
			disabled = false;
		//    5   10:aload_0         
		//    6   11:iconst_0        
		//    7   12:putfield        #24  <Field boolean disabled>
		//    8   15:return          
		}
	}

	private static final class CrashMarkerCheck
		implements Callable
	{

		public Boolean call()
			throws Exception
		{
			if(!crashMarker.isPresent())
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field CrashlyticsFileMarker crashMarker>
		//*   2    4:invokevirtual   #30  <Method boolean CrashlyticsFileMarker.isPresent()>
		//*   3    7:ifne            14
			{
				return Boolean.FALSE;
		//    4   10:getstatic       #36  <Field Boolean Boolean.FALSE>
		//    5   13:areturn         
			} else
			{
				Fabric.getLogger().d("CrashlyticsCore", "Found previous crash marker.");
		//    6   14:invokestatic    #42  <Method Logger Fabric.getLogger()>
		//    7   17:ldc1            #44  <String "CrashlyticsCore">
		//    8   19:ldc1            #46  <String "Found previous crash marker.">
		//    9   21:invokeinterface #52  <Method void Logger.d(String, String)>
				crashMarker.remove();
		//   10   26:aload_0         
		//   11   27:getfield        #19  <Field CrashlyticsFileMarker crashMarker>
		//   12   30:invokevirtual   #55  <Method boolean CrashlyticsFileMarker.remove()>
		//   13   33:pop             
				return Boolean.TRUE;
		//   14   34:getstatic       #58  <Field Boolean Boolean.TRUE>
		//   15   37:areturn         
			}
		}

		public volatile Object call()
			throws Exception
		{
			return ((Object) (call()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #62  <Method Boolean call()>
		//    2    4:areturn         
		}

		private final CrashlyticsFileMarker crashMarker;

		public CrashMarkerCheck(CrashlyticsFileMarker crashlyticsfilemarker)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			crashMarker = crashlyticsfilemarker;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field CrashlyticsFileMarker crashMarker>
		//    5    9:return          
		}
	}

	private static final class NoOpListener
		implements CrashlyticsListener
	{

		public void crashlyticsDidDetectCrashDuringPreviousExecution()
		{
		//    0    0:return          
		}

		private NoOpListener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}


	public CrashlyticsCore()
	{
		this(1.0F, ((CrashlyticsListener) (null)), ((PinningInfoProvider) (null)), false);
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:invokespecial   #115 <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean)>
	//    6    8:return          
	}

	CrashlyticsCore(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag)
	{
		this(f, crashlyticslistener, pinninginfoprovider, flag, ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler"));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:ldc1            #118 <String "Crashlytics Exception Handler">
	//    6    8:invokestatic    #124 <Method ExecutorService ExecutorUtils.buildSingleThreadExecutorService(String)>
	//    7   11:invokespecial   #127 <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean, ExecutorService)>
	//    8   14:return          
	}

	CrashlyticsCore(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag, ExecutorService executorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void Kit()>
		userId = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #131 <Field String userId>
		userEmail = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #133 <Field String userEmail>
		userName = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #135 <Field String userName>
		delay = f;
	//   11   19:aload_0         
	//   12   20:fload_1         
	//   13   21:putfield        #137 <Field float delay>
		if(crashlyticslistener == null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          76
	//*  16   28:aload_0         
	//*  17   29:aload_2         
	//*  18   30:putfield        #139 <Field CrashlyticsListener listener>
	//*  19   33:aload_0         
	//*  20   34:aload_3         
	//*  21   35:putfield        #141 <Field PinningInfoProvider pinningInfo>
	//*  22   38:aload_0         
	//*  23   39:iload           4
	//*  24   41:putfield        #143 <Field boolean disabled>
	//*  25   44:aload_0         
	//*  26   45:new             #145 <Class CrashlyticsExecutorServiceWrapper>
	//*  27   48:dup             
	//*  28   49:aload           5
	//*  29   51:invokespecial   #148 <Method void CrashlyticsExecutorServiceWrapper(ExecutorService)>
	//*  30   54:putfield        #150 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//*  31   57:aload_0         
	//*  32   58:new             #152 <Class ConcurrentHashMap>
	//*  33   61:dup             
	//*  34   62:invokespecial   #153 <Method void ConcurrentHashMap()>
	//*  35   65:putfield        #155 <Field ConcurrentHashMap attributes>
	//*  36   68:aload_0         
	//*  37   69:invokestatic    #161 <Method long System.currentTimeMillis()>
	//*  38   72:putfield        #163 <Field long startTime>
	//*  39   75:return          
			crashlyticslistener = ((CrashlyticsListener) (new NoOpListener()));
	//   40   76:new             #29  <Class CrashlyticsCore$NoOpListener>
	//   41   79:dup             
	//   42   80:aconst_null     
	//   43   81:invokespecial   #166 <Method void CrashlyticsCore$NoOpListener(CrashlyticsCore$1)>
	//   44   84:astore_2        
		listener = crashlyticslistener;
		pinningInfo = pinninginfoprovider;
		disabled = flag;
		executorServiceWrapper = new CrashlyticsExecutorServiceWrapper(executorservice);
		attributes = new ConcurrentHashMap();
		startTime = System.currentTimeMillis();
	//*  45   85:goto            28
	}

	private void checkForPreviousCrash()
	{
		Boolean boolean1 = (Boolean)executorServiceWrapper.executeSyncLoggingException(((Callable) (new CrashMarkerCheck(crashMarker))));
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #26  <Class CrashlyticsCore$CrashMarkerCheck>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #181 <Field CrashlyticsFileMarker crashMarker>
	//    6   12:invokespecial   #184 <Method void CrashlyticsCore$CrashMarkerCheck(CrashlyticsFileMarker)>
	//    7   15:invokevirtual   #188 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//    8   18:checkcast       #190 <Class Boolean>
	//    9   21:astore_1        
		if(!Boolean.TRUE.equals(((Object) (boolean1))))
	//*  10   22:getstatic       #194 <Field Boolean Boolean.TRUE>
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #198 <Method boolean Boolean.equals(Object)>
	//*  13   29:ifne            33
			return;
	//   14   32:return          
		try
		{
			listener.crashlyticsDidDetectCrashDuringPreviousExecution();
	//   15   33:aload_0         
	//   16   34:getfield        #139 <Field CrashlyticsListener listener>
	//   17   37:invokeinterface #203 <Method void CrashlyticsListener.crashlyticsDidDetectCrashDuringPreviousExecution()>
			return;
	//   18   42:return          
		}
		catch(Exception exception)
	//*  19   43:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", ((Throwable) (exception)));
	//   20   44:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   21   47:ldc1            #76  <String "CrashlyticsCore">
	//   22   49:ldc1            #211 <String "Exception thrown by CrashlyticsListener while notifying of previous crash.">
	//   23   51:aload_1         
	//   24   52:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
		}
	//   25   57:return          
	}

	private void doLog(int i, String s, String s1)
	{
		while(disabled || !ensureFabricWithCalled("prior to logging messages.")) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
	//    4    8:ldc1            #221 <String "prior to logging messages.">
	//    5   10:invokestatic    #225 <Method boolean ensureFabricWithCalled(String)>
	//    6   13:ifeq            7
		long l = System.currentTimeMillis();
	//    7   16:invokestatic    #161 <Method long System.currentTimeMillis()>
	//    8   19:lstore          4
		long l1 = startTime;
	//    9   21:aload_0         
	//   10   22:getfield        #163 <Field long startTime>
	//   11   25:lstore          6
		handler.writeToLog(l - l1, formatLogMessage(i, s, s1));
	//   12   27:aload_0         
	//   13   28:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   14   31:lload           4
	//   15   33:lload           6
	//   16   35:lsub            
	//   17   36:iload_1         
	//   18   37:aload_2         
	//   19   38:aload_3         
	//   20   39:invokestatic    #231 <Method String formatLogMessage(int, String, String)>
	//   21   42:invokevirtual   #237 <Method void CrashlyticsUncaughtExceptionHandler.writeToLog(long, String)>
	//   22   45:return          
	}

	private static boolean ensureFabricWithCalled(String s)
	{
		CrashlyticsCore crashlyticscore = getInstance();
	//    0    0:invokestatic    #241 <Method CrashlyticsCore getInstance()>
	//    1    3:astore_1        
		if(crashlyticscore == null || crashlyticscore.handler == null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          15
	//*   4    8:aload_1         
	//*   5    9:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//*   6   12:ifnonnull       47
		{
			Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Crashlytics must be initialized by calling Fabric.with(Context) ").append(s).toString(), ((Throwable) (null)));
	//    7   15:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//    8   18:ldc1            #76  <String "CrashlyticsCore">
	//    9   20:new             #243 <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #244 <Method void StringBuilder()>
	//   12   27:ldc1            #246 <String "Crashlytics must be initialized by calling Fabric.with(Context) ">
	//   13   29:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload_0         
	//   15   33:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   16   36:invokevirtual   #254 <Method String StringBuilder.toString()>
	//   17   39:aconst_null     
	//   18   40:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
			return false;
	//   19   45:iconst_0        
	//   20   46:ireturn         
		} else
		{
			return true;
	//   21   47:iconst_1        
	//   22   48:ireturn         
		}
	}

	private void finishInitSynchronously()
	{
		Object obj = ((Object) (new PriorityCallable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #26  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				return doInBackground();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CrashlyticsCore this$0>
			//    2    4:invokevirtual   #30  <Method Void CrashlyticsCore.doInBackground()>
			//    3    7:areturn         
			}

			public Priority getPriority()
			{
				return Priority.IMMEDIATE;
			//    0    0:getstatic       #38  <Field Priority Priority.IMMEDIATE>
			//    1    3:areturn         
			}

			final CrashlyticsCore this$0;

			
			{
				this$0 = CrashlyticsCore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CrashlyticsCore this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void PriorityCallable()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #7   <Class CrashlyticsCore$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #264 <Method void CrashlyticsCore$1(CrashlyticsCore)>
	//    4    8:astore_1        
		for(Iterator iterator = getDependencies().iterator(); iterator.hasNext(); ((PriorityCallable) (obj)).addDependency((Task)iterator.next()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #268 <Method Collection getDependencies()>
	//    7   13:invokeinterface #274 <Method Iterator Collection.iterator()>
	//    8   18:astore_2        
	//    9   19:aload_2         
	//   10   20:invokeinterface #280 <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            44
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokeinterface #284 <Method Object Iterator.next()>
	//   15   35:checkcast       #286 <Class Task>
	//   16   38:invokevirtual   #292 <Method void PriorityCallable.addDependency(Task)>
	//*  17   41:goto            19
		obj = ((Object) (getFabric().getExecutorService().submit(((Callable) (obj)))));
	//   18   44:aload_0         
	//   19   45:invokevirtual   #296 <Method Fabric getFabric()>
	//   20   48:invokevirtual   #300 <Method ExecutorService Fabric.getExecutorService()>
	//   21   51:aload_1         
	//   22   52:invokeinterface #306 <Method Future ExecutorService.submit(Callable)>
	//   23   57:astore_1        
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
	//   24   58:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   25   61:ldc1            #76  <String "CrashlyticsCore">
	//   26   63:ldc2            #308 <String "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.">
	//   27   66:invokeinterface #312 <Method void Logger.d(String, String)>
		try
		{
			((Future) (obj)).get(4L, TimeUnit.SECONDS);
	//   28   71:aload_1         
	//   29   72:ldc2w           #313 <Long 4L>
	//   30   75:getstatic       #320 <Field TimeUnit TimeUnit.SECONDS>
	//   31   78:invokeinterface #326 <Method Object Future.get(long, TimeUnit)>
	//   32   83:pop             
			return;
	//   33   84:return          
		}
		catch(InterruptedException interruptedexception)
	//*  34   85:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Crashlytics was interrupted during initialization.", ((Throwable) (interruptedexception)));
	//   35   86:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   36   89:ldc1            #76  <String "CrashlyticsCore">
	//   37   91:ldc2            #328 <String "Crashlytics was interrupted during initialization.">
	//   38   94:aload_1         
	//   39   95:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
			return;
	//   40  100:return          
		}
		catch(ExecutionException executionexception)
	//*  41  101:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", ((Throwable) (executionexception)));
	//   42  102:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   43  105:ldc1            #76  <String "CrashlyticsCore">
	//   44  107:ldc2            #330 <String "Problem encountered during Crashlytics initialization.">
	//   45  110:aload_1         
	//   46  111:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
			return;
	//   47  116:return          
		}
		catch(TimeoutException timeoutexception)
	//*  48  117:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Crashlytics timed out during initialization.", ((Throwable) (timeoutexception)));
	//   49  118:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   50  121:ldc1            #76  <String "CrashlyticsCore">
	//   51  123:ldc2            #332 <String "Crashlytics timed out during initialization.">
	//   52  126:aload_1         
	//   53  127:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
		}
	//   54  132:return          
	}

	private static String formatLogMessage(int i, String s, String s1)
	{
		return (new StringBuilder()).append(CommonUtils.logPriorityToString(i)).append("/").append(s).append(" ").append(s1).toString();
	//    0    0:new             #243 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #244 <Method void StringBuilder()>
	//    3    7:iload_0         
	//    4    8:invokestatic    #338 <Method String CommonUtils.logPriorityToString(int)>
	//    5   11:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc2            #340 <String "/">
	//    7   17:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:ldc2            #342 <String " ">
	//   11   27:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   12   30:aload_2         
	//   13   31:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #254 <Method String StringBuilder.toString()>
	//   15   37:areturn         
	}

	public static CrashlyticsCore getInstance()
	{
		return (CrashlyticsCore)Fabric.getKit(com/crashlytics/android/core/CrashlyticsCore);
	//    0    0:ldc1            #2   <Class CrashlyticsCore>
	//    1    2:invokestatic    #346 <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class CrashlyticsCore>
	//    3    8:areturn         
	}

	private boolean getSendDecisionFromUser(Activity activity, final PromptSettingsData dialog)
	{
		dialog = ((PromptSettingsData) (CrashPromptDialog.create(activity, dialog, new CrashPromptDialog.AlwaysSendCallback() {

			public void sendUserReportsWithoutPrompting(boolean flag)
			{
				setShouldSendUserReportsWithoutPrompting(flag);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CrashlyticsCore this$0>
			//    2    4:iload_1         
			//    3    5:invokevirtual   #26  <Method void CrashlyticsCore.setShouldSendUserReportsWithoutPrompting(boolean)>
			//    4    8:return          
			}

			final CrashlyticsCore this$0;

			
			{
				this$0 = CrashlyticsCore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CrashlyticsCore this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:new             #19  <Class CrashlyticsCore$7>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #347 <Method void CrashlyticsCore$7(CrashlyticsCore)>
	//    6   10:invokestatic    #353 <Method CrashPromptDialog CrashPromptDialog.create(Activity, PromptSettingsData, CrashPromptDialog$AlwaysSendCallback)>
	//    7   13:astore_2        
		activity.runOnUiThread(new Runnable() {

			public void run()
			{
				dialog.show();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field CrashPromptDialog val$dialog>
			//    2    4:invokevirtual   #31  <Method void CrashPromptDialog.show()>
			//    3    7:return          
			}

			final CrashlyticsCore this$0;
			final CrashPromptDialog val$dialog;

			
			{
				this$0 = CrashlyticsCore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field CrashlyticsCore this$0>
				dialog = crashpromptdialog;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field CrashPromptDialog val$dialog>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    8   14:aload_1         
	//    9   15:new             #21  <Class CrashlyticsCore$8>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:invokespecial   #356 <Method void CrashlyticsCore$8(CrashlyticsCore, CrashPromptDialog)>
	//   14   24:invokevirtual   #362 <Method void Activity.runOnUiThread(Runnable)>
		Fabric.getLogger().d("CrashlyticsCore", "Waiting for user opt-in.");
	//   15   27:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   16   30:ldc1            #76  <String "CrashlyticsCore">
	//   17   32:ldc2            #364 <String "Waiting for user opt-in.">
	//   18   35:invokeinterface #312 <Method void Logger.d(String, String)>
		((CrashPromptDialog) (dialog)).await();
	//   19   40:aload_2         
	//   20   41:invokevirtual   #367 <Method void CrashPromptDialog.await()>
		return ((CrashPromptDialog) (dialog)).getOptIn();
	//   21   44:aload_2         
	//   22   45:invokevirtual   #370 <Method boolean CrashPromptDialog.getOptIn()>
	//   23   48:ireturn         
	}

	static SessionSettingsData getSessionSettingsData()
	{
		SettingsData settingsdata = Settings.getInstance().awaitSettingsData();
	//    0    0:invokestatic    #377 <Method Settings Settings.getInstance()>
	//    1    3:invokevirtual   #381 <Method SettingsData Settings.awaitSettingsData()>
	//    2    6:astore_0        
		if(settingsdata == null)
	//*   3    7:aload_0         
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		else
			return settingsdata.sessionData;
	//    7   13:aload_0         
	//    8   14:getfield        #387 <Field SessionSettingsData SettingsData.sessionData>
	//    9   17:areturn         
	}

	private boolean installExceptionHandler(UnityVersionProvider unityversionprovider)
	{
		try
		{
			Fabric.getLogger().d("CrashlyticsCore", "Installing exception handler...");
	//    0    0:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #76  <String "CrashlyticsCore">
	//    2    5:ldc2            #391 <String "Installing exception handler...">
	//    3    8:invokeinterface #312 <Method void Logger.d(String, String)>
			handler = new CrashlyticsUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler(), executorServiceWrapper, getIdManager(), unityversionprovider, fileStore, this);
	//    4   13:aload_0         
	//    5   14:new             #233 <Class CrashlyticsUncaughtExceptionHandler>
	//    6   17:dup             
	//    7   18:invokestatic    #397 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//    8   21:aload_0         
	//    9   22:getfield        #150 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//   10   25:aload_0         
	//   11   26:invokevirtual   #401 <Method IdManager getIdManager()>
	//   12   29:aload_1         
	//   13   30:aload_0         
	//   14   31:getfield        #403 <Field FileStore fileStore>
	//   15   34:aload_0         
	//   16   35:invokespecial   #406 <Method void CrashlyticsUncaughtExceptionHandler(Thread$UncaughtExceptionHandler, CrashlyticsExecutorServiceWrapper, IdManager, UnityVersionProvider, FileStore, CrashlyticsCore)>
	//   17   38:putfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
			handler.openSession();
	//   18   41:aload_0         
	//   19   42:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   20   45:invokevirtual   #409 <Method void CrashlyticsUncaughtExceptionHandler.openSession()>
			Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (handler)));
	//   21   48:aload_0         
	//   22   49:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   23   52:invokestatic    #413 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
			Fabric.getLogger().d("CrashlyticsCore", "Successfully installed exception handler.");
	//   24   55:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   25   58:ldc1            #76  <String "CrashlyticsCore">
	//   26   60:ldc2            #415 <String "Successfully installed exception handler.">
	//   27   63:invokeinterface #312 <Method void Logger.d(String, String)>
		}
	//*  28   68:iconst_1        
	//*  29   69:ireturn         
		// Misplaced declaration of an exception variable
		catch(UnityVersionProvider unityversionprovider)
	//*  30   70:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "There was a problem installing the exception handler.", ((Throwable) (unityversionprovider)));
	//   31   71:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   32   74:ldc1            #76  <String "CrashlyticsCore">
	//   33   76:ldc2            #417 <String "There was a problem installing the exception handler.">
	//   34   79:aload_1         
	//   35   80:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
			handler = null;
	//   36   85:aload_0         
	//   37   86:aconst_null     
	//   38   87:putfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
			return false;
	//   39   90:iconst_0        
	//   40   91:ireturn         
		}
		return true;
	}

	static boolean isBuildIdValid(String s, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            19
			Fabric.getLogger().d("CrashlyticsCore", "Configured not to require a build ID.");
	//    2    4:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//    3    7:ldc1            #76  <String "CrashlyticsCore">
	//    4    9:ldc2            #421 <String "Configured not to require a build ID.">
	//    5   12:invokeinterface #312 <Method void Logger.d(String, String)>
		else
	//*   6   17:iconst_1        
	//*   7   18:ireturn         
		if(CommonUtils.isNullOrEmpty(s))
	//*   8   19:aload_0         
	//*   9   20:invokestatic    #424 <Method boolean CommonUtils.isNullOrEmpty(String)>
	//*  10   23:ifeq            17
		{
			Log.e("CrashlyticsCore", ".");
	//   11   26:ldc1            #76  <String "CrashlyticsCore">
	//   12   28:ldc2            #426 <String ".">
	//   13   31:invokestatic    #431 <Method int Log.e(String, String)>
	//   14   34:pop             
			Log.e("CrashlyticsCore", ".     |  | ");
	//   15   35:ldc1            #76  <String "CrashlyticsCore">
	//   16   37:ldc2            #433 <String ".     |  | ">
	//   17   40:invokestatic    #431 <Method int Log.e(String, String)>
	//   18   43:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   19   44:ldc1            #76  <String "CrashlyticsCore">
	//   20   46:ldc2            #435 <String ".     |  |">
	//   21   49:invokestatic    #431 <Method int Log.e(String, String)>
	//   22   52:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   23   53:ldc1            #76  <String "CrashlyticsCore">
	//   24   55:ldc2            #435 <String ".     |  |">
	//   25   58:invokestatic    #431 <Method int Log.e(String, String)>
	//   26   61:pop             
			Log.e("CrashlyticsCore", ".   \\ |  | /");
	//   27   62:ldc1            #76  <String "CrashlyticsCore">
	//   28   64:ldc2            #437 <String ".   \\ |  | /">
	//   29   67:invokestatic    #431 <Method int Log.e(String, String)>
	//   30   70:pop             
			Log.e("CrashlyticsCore", ".    \\    /");
	//   31   71:ldc1            #76  <String "CrashlyticsCore">
	//   32   73:ldc2            #439 <String ".    \\    /">
	//   33   76:invokestatic    #431 <Method int Log.e(String, String)>
	//   34   79:pop             
			Log.e("CrashlyticsCore", ".     \\  /");
	//   35   80:ldc1            #76  <String "CrashlyticsCore">
	//   36   82:ldc2            #441 <String ".     \\  /">
	//   37   85:invokestatic    #431 <Method int Log.e(String, String)>
	//   38   88:pop             
			Log.e("CrashlyticsCore", ".      \\/");
	//   39   89:ldc1            #76  <String "CrashlyticsCore">
	//   40   91:ldc2            #443 <String ".      \\/">
	//   41   94:invokestatic    #431 <Method int Log.e(String, String)>
	//   42   97:pop             
			Log.e("CrashlyticsCore", ".");
	//   43   98:ldc1            #76  <String "CrashlyticsCore">
	//   44  100:ldc2            #426 <String ".">
	//   45  103:invokestatic    #431 <Method int Log.e(String, String)>
	//   46  106:pop             
			Log.e("CrashlyticsCore", "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
	//   47  107:ldc1            #76  <String "CrashlyticsCore">
	//   48  109:ldc1            #68  <String "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.">
	//   49  111:invokestatic    #431 <Method int Log.e(String, String)>
	//   50  114:pop             
			Log.e("CrashlyticsCore", ".");
	//   51  115:ldc1            #76  <String "CrashlyticsCore">
	//   52  117:ldc2            #426 <String ".">
	//   53  120:invokestatic    #431 <Method int Log.e(String, String)>
	//   54  123:pop             
			Log.e("CrashlyticsCore", ".      /\\");
	//   55  124:ldc1            #76  <String "CrashlyticsCore">
	//   56  126:ldc2            #445 <String ".      /\\">
	//   57  129:invokestatic    #431 <Method int Log.e(String, String)>
	//   58  132:pop             
			Log.e("CrashlyticsCore", ".     /  \\");
	//   59  133:ldc1            #76  <String "CrashlyticsCore">
	//   60  135:ldc2            #447 <String ".     /  \\">
	//   61  138:invokestatic    #431 <Method int Log.e(String, String)>
	//   62  141:pop             
			Log.e("CrashlyticsCore", ".    /    \\");
	//   63  142:ldc1            #76  <String "CrashlyticsCore">
	//   64  144:ldc2            #449 <String ".    /    \\">
	//   65  147:invokestatic    #431 <Method int Log.e(String, String)>
	//   66  150:pop             
			Log.e("CrashlyticsCore", ".   / |  | \\");
	//   67  151:ldc1            #76  <String "CrashlyticsCore">
	//   68  153:ldc2            #451 <String ".   / |  | \\">
	//   69  156:invokestatic    #431 <Method int Log.e(String, String)>
	//   70  159:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   71  160:ldc1            #76  <String "CrashlyticsCore">
	//   72  162:ldc2            #435 <String ".     |  |">
	//   73  165:invokestatic    #431 <Method int Log.e(String, String)>
	//   74  168:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   75  169:ldc1            #76  <String "CrashlyticsCore">
	//   76  171:ldc2            #435 <String ".     |  |">
	//   77  174:invokestatic    #431 <Method int Log.e(String, String)>
	//   78  177:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   79  178:ldc1            #76  <String "CrashlyticsCore">
	//   80  180:ldc2            #435 <String ".     |  |">
	//   81  183:invokestatic    #431 <Method int Log.e(String, String)>
	//   82  186:pop             
			Log.e("CrashlyticsCore", ".");
	//   83  187:ldc1            #76  <String "CrashlyticsCore">
	//   84  189:ldc2            #426 <String ".">
	//   85  192:invokestatic    #431 <Method int Log.e(String, String)>
	//   86  195:pop             
			return false;
	//   87  196:iconst_0        
	//   88  197:ireturn         
		}
		return true;
	}

	static void recordFatalExceptionEvent(String s, String s1)
	{
		Answers answers = (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
	//    0    0:ldc2            #454 <Class Answers>
	//    1    3:invokestatic    #346 <Method Kit Fabric.getKit(Class)>
	//    2    6:checkcast       #454 <Class Answers>
	//    3    9:astore_2        
		if(answers != null)
	//*   4   10:aload_2         
	//*   5   11:ifnull          27
			answers.onException(new io.fabric.sdk.android.services.common.Crash.FatalException(s, s1));
	//    6   14:aload_2         
	//    7   15:new             #456 <Class io.fabric.sdk.android.services.common.Crash$FatalException>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #458 <Method void io.fabric.sdk.android.services.common.Crash$FatalException(String, String)>
	//   12   24:invokevirtual   #462 <Method void Answers.onException(io.fabric.sdk.android.services.common.Crash$FatalException)>
	//   13   27:return          
	}

	static void recordLoggedExceptionEvent(String s, String s1)
	{
		Answers answers = (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
	//    0    0:ldc2            #454 <Class Answers>
	//    1    3:invokestatic    #346 <Method Kit Fabric.getKit(Class)>
	//    2    6:checkcast       #454 <Class Answers>
	//    3    9:astore_2        
		if(answers != null)
	//*   4   10:aload_2         
	//*   5   11:ifnull          27
			answers.onException(new io.fabric.sdk.android.services.common.Crash.LoggedException(s, s1));
	//    6   14:aload_2         
	//    7   15:new             #465 <Class io.fabric.sdk.android.services.common.Crash$LoggedException>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #466 <Method void io.fabric.sdk.android.services.common.Crash$LoggedException(String, String)>
	//   12   24:invokevirtual   #469 <Method void Answers.onException(io.fabric.sdk.android.services.common.Crash$LoggedException)>
	//   13   27:return          
	}

	private static String sanitizeAttribute(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s != null)
	//*   2    2:aload_0         
	//*   3    3:ifnull          32
		{
			s = s.trim();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #476 <Method String String.trim()>
	//    6   10:astore_0        
			s1 = s;
	//    7   11:aload_0         
	//    8   12:astore_1        
			if(s.length() > 1024)
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #480 <Method int String.length()>
	//*  11   17:sipush          1024
	//*  12   20:icmple          32
				s1 = s.substring(0, 1024);
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:sipush          1024
	//   16   28:invokevirtual   #484 <Method String String.substring(int, int)>
	//   17   31:astore_1        
		}
		return s1;
	//   18   32:aload_1         
	//   19   33:areturn         
	}

	private void setAndValidateKitProperties(Context context)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		CrashlyticsPinningInfoProvider crashlyticspinninginfoprovider;
		if(pinningInfo != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field PinningInfoProvider pinningInfo>
	//*   2    4:ifnull          136
			crashlyticspinninginfoprovider = new CrashlyticsPinningInfoProvider(pinningInfo);
	//    3    7:new             #490 <Class CrashlyticsPinningInfoProvider>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #141 <Field PinningInfoProvider pinningInfo>
	//    7   15:invokespecial   #493 <Method void CrashlyticsPinningInfoProvider(PinningInfoProvider)>
	//    8   18:astore_2        
		else
	//*   9   19:aload_0         
	//*  10   20:new             #495 <Class DefaultHttpRequestFactory>
	//*  11   23:dup             
	//*  12   24:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//*  13   27:invokespecial   #498 <Method void DefaultHttpRequestFactory(Logger)>
	//*  14   30:putfield        #500 <Field HttpRequestFactory httpRequestFactory>
	//*  15   33:aload_0         
	//*  16   34:getfield        #500 <Field HttpRequestFactory httpRequestFactory>
	//*  17   37:aload_2         
	//*  18   38:invokeinterface #506 <Method void HttpRequestFactory.setPinningInfoProvider(io.fabric.sdk.android.services.network.PinningInfoProvider)>
	//*  19   43:aload_0         
	//*  20   44:aload_1         
	//*  21   45:invokevirtual   #511 <Method String Context.getPackageName()>
	//*  22   48:putfield        #513 <Field String packageName>
	//*  23   51:aload_0         
	//*  24   52:aload_0         
	//*  25   53:invokevirtual   #401 <Method IdManager getIdManager()>
	//*  26   56:invokevirtual   #518 <Method String IdManager.getInstallerPackageName()>
	//*  27   59:putfield        #520 <Field String installerPackageName>
	//*  28   62:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//*  29   65:ldc1            #76  <String "CrashlyticsCore">
	//*  30   67:new             #243 <Class StringBuilder>
	//*  31   70:dup             
	//*  32   71:invokespecial   #244 <Method void StringBuilder()>
	//*  33   74:ldc2            #522 <String "Installer package name is: ">
	//*  34   77:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//*  35   80:aload_0         
	//*  36   81:getfield        #520 <Field String installerPackageName>
	//*  37   84:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//*  38   87:invokevirtual   #254 <Method String StringBuilder.toString()>
	//*  39   90:invokeinterface #312 <Method void Logger.d(String, String)>
	//*  40   95:aload_1         
	//*  41   96:invokevirtual   #526 <Method PackageManager Context.getPackageManager()>
	//*  42   99:aload_0         
	//*  43  100:getfield        #513 <Field String packageName>
	//*  44  103:iconst_0        
	//*  45  104:invokevirtual   #532 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//*  46  107:astore_1        
	//*  47  108:aload_0         
	//*  48  109:aload_1         
	//*  49  110:getfield        #536 <Field int PackageInfo.versionCode>
	//*  50  113:invokestatic    #540 <Method String Integer.toString(int)>
	//*  51  116:putfield        #542 <Field String versionCode>
	//*  52  119:aload_1         
	//*  53  120:getfield        #544 <Field String PackageInfo.versionName>
	//*  54  123:ifnonnull       141
	//*  55  126:ldc2            #546 <String "0.0">
	//*  56  129:astore_1        
	//*  57  130:aload_0         
	//*  58  131:aload_1         
	//*  59  132:putfield        #547 <Field String versionName>
	//*  60  135:return          
			crashlyticspinninginfoprovider = null;
	//   61  136:aconst_null     
	//   62  137:astore_2        
		httpRequestFactory = ((HttpRequestFactory) (new DefaultHttpRequestFactory(Fabric.getLogger())));
		httpRequestFactory.setPinningInfoProvider(((io.fabric.sdk.android.services.network.PinningInfoProvider) (crashlyticspinninginfoprovider)));
		packageName = context.getPackageName();
		installerPackageName = getIdManager().getInstallerPackageName();
		Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Installer package name is: ").append(installerPackageName).toString());
		context = ((Context) (context.getPackageManager().getPackageInfo(packageName, 0)));
		versionCode = Integer.toString(((PackageInfo) (context)).versionCode);
		if(((PackageInfo) (context)).versionName == null)
			context = "0.0";
		else
	//*  63  138:goto            19
			context = ((Context) (((PackageInfo) (context)).versionName));
	//   64  141:aload_1         
	//   65  142:getfield        #544 <Field String PackageInfo.versionName>
	//   66  145:astore_1        
		versionName = ((String) (context));
	//*  67  146:goto            130
	}

	boolean canSendWithUserApproval()
	{
		return ((Boolean)Settings.getInstance().withSettings(new io.fabric.sdk.android.services.settings.Settings.SettingsAccess() {

			public Boolean usingSettings(SettingsData settingsdata)
			{
				boolean flag1 = true;
			//    0    0:iconst_1        
			//    1    1:istore_3        
				Activity activity = getFabric().getCurrentActivity();
			//    2    2:aload_0         
			//    3    3:getfield        #18  <Field CrashlyticsCore this$0>
			//    4    6:invokevirtual   #28  <Method Fabric CrashlyticsCore.getFabric()>
			//    5    9:invokevirtual   #34  <Method Activity Fabric.getCurrentActivity()>
			//    6   12:astore          4
				boolean flag = flag1;
			//    7   14:iload_3         
			//    8   15:istore_2        
				if(activity != null)
			//*   9   16:aload           4
			//*  10   18:ifnull          57
				{
					flag = flag1;
			//   11   21:iload_3         
			//   12   22:istore_2        
					if(!activity.isFinishing())
			//*  13   23:aload           4
			//*  14   25:invokevirtual   #39  <Method boolean Activity.isFinishing()>
			//*  15   28:ifne            57
					{
						flag = flag1;
			//   16   31:iload_3         
			//   17   32:istore_2        
						if(shouldPromptUserBeforeSendingCrashReports())
			//*  18   33:aload_0         
			//*  19   34:getfield        #18  <Field CrashlyticsCore this$0>
			//*  20   37:invokevirtual   #42  <Method boolean CrashlyticsCore.shouldPromptUserBeforeSendingCrashReports()>
			//*  21   40:ifeq            57
							flag = getSendDecisionFromUser(activity, settingsdata.promptData);
			//   22   43:aload_0         
			//   23   44:getfield        #18  <Field CrashlyticsCore this$0>
			//   24   47:aload           4
			//   25   49:aload_1         
			//   26   50:getfield        #48  <Field PromptSettingsData SettingsData.promptData>
			//   27   53:invokestatic    #52  <Method boolean CrashlyticsCore.access$200(CrashlyticsCore, Activity, PromptSettingsData)>
			//   28   56:istore_2        
					}
				}
				return Boolean.valueOf(flag);
			//   29   57:iload_2         
			//   30   58:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
			//   31   61:areturn         
			}

			public volatile Object usingSettings(SettingsData settingsdata)
			{
				return ((Object) (usingSettings(settingsdata)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #61  <Method Boolean usingSettings(SettingsData)>
			//    3    5:areturn         
			}

			final CrashlyticsCore this$0;

			
			{
				this$0 = CrashlyticsCore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
, ((Object) (Boolean.valueOf(true))))).booleanValue();
	//    0    0:invokestatic    #377 <Method Settings Settings.getInstance()>
	//    1    3:new             #17  <Class CrashlyticsCore$6>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #550 <Method void CrashlyticsCore$6(CrashlyticsCore)>
	//    5   11:iconst_1        
	//    6   12:invokestatic    #554 <Method Boolean Boolean.valueOf(boolean)>
	//    7   15:invokevirtual   #558 <Method Object Settings.withSettings(io.fabric.sdk.android.services.settings.Settings$SettingsAccess, Object)>
	//    8   18:checkcast       #190 <Class Boolean>
	//    9   21:invokevirtual   #561 <Method boolean Boolean.booleanValue()>
	//   10   24:ireturn         
	}

	public void crash()
	{
		(new CrashTest()).indexOutOfBounds();
	//    0    0:new             #564 <Class CrashTest>
	//    1    3:dup             
	//    2    4:invokespecial   #565 <Method void CrashTest()>
	//    3    7:invokevirtual   #568 <Method void CrashTest.indexOutOfBounds()>
	//    4   10:return          
	}

	void createCrashMarker()
	{
		crashMarker.create();
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field CrashlyticsFileMarker crashMarker>
	//    2    4:invokevirtual   #573 <Method boolean CrashlyticsFileMarker.create()>
	//    3    7:pop             
	//    4    8:return          
	}

	boolean didPreviousInitializationFail()
	{
		return ((Boolean)executorServiceWrapper.executeSyncLoggingException(new Callable() {

			public Boolean call()
				throws Exception
			{
				return Boolean.valueOf(initializationMarker.isPresent());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
			//    2    4:invokestatic    #30  <Method CrashlyticsFileMarker CrashlyticsCore.access$100(CrashlyticsCore)>
			//    3    7:invokevirtual   #35  <Method boolean CrashlyticsFileMarker.isPresent()>
			//    4   10:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
			//    5   13:areturn         
			}

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #45  <Method Boolean call()>
			//    2    4:areturn         
			}

			final CrashlyticsCore this$0;

			
			{
				this$0 = CrashlyticsCore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
)).booleanValue();
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #13  <Class CrashlyticsCore$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #575 <Method void CrashlyticsCore$4(CrashlyticsCore)>
	//    6   12:invokevirtual   #188 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//    7   15:checkcast       #190 <Class Boolean>
	//    8   18:invokevirtual   #561 <Method boolean Boolean.booleanValue()>
	//    9   21:ireturn         
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #579 <Method Void doInBackground()>
	//    2    4:areturn         
	}

	protected Void doInBackground()
	{
		markInitializationStarted();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #582 <Method void markInitializationStarted()>
		SessionEventData sessioneventdata = getExternalCrashEventData();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #586 <Method SessionEventData getExternalCrashEventData()>
	//    4    8:astore_1        
		if(sessioneventdata != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			handler.writeExternalCrashEvent(sessioneventdata);
	//    7   13:aload_0         
	//    8   14:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #590 <Method void CrashlyticsUncaughtExceptionHandler.writeExternalCrashEvent(SessionEventData)>
		handler.cleanInvalidTempFiles();
	//   11   21:aload_0         
	//   12   22:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   13   25:invokevirtual   #593 <Method void CrashlyticsUncaughtExceptionHandler.cleanInvalidTempFiles()>
		Object obj = ((Object) (Settings.getInstance().awaitSettingsData()));
	//   14   28:invokestatic    #377 <Method Settings Settings.getInstance()>
	//   15   31:invokevirtual   #381 <Method SettingsData Settings.awaitSettingsData()>
	//   16   34:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_58;
	//   17   35:aload_1         
	//   18   36:ifnonnull       58
		Fabric.getLogger().w("CrashlyticsCore", "Received null settings, skipping initialization!");
	//   19   39:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   20   42:ldc1            #76  <String "CrashlyticsCore">
	//   21   44:ldc2            #595 <String "Received null settings, skipping initialization!">
	//   22   47:invokeinterface #598 <Method void Logger.w(String, String)>
		markInitializationComplete();
	//   23   52:aload_0         
	//   24   53:invokevirtual   #601 <Method void markInitializationComplete()>
		return null;
	//   25   56:aconst_null     
	//   26   57:areturn         
		if(((SettingsData) (obj)).featuresData.collectReports)
			break MISSING_BLOCK_LABEL_87;
	//   27   58:aload_1         
	//   28   59:getfield        #605 <Field FeaturesSettingsData SettingsData.featuresData>
	//   29   62:getfield        #610 <Field boolean FeaturesSettingsData.collectReports>
	//   30   65:ifne            87
		Fabric.getLogger().d("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
	//   31   68:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   32   71:ldc1            #76  <String "CrashlyticsCore">
	//   33   73:ldc2            #612 <String "Collection of crash reports disabled in Crashlytics settings.">
	//   34   76:invokeinterface #312 <Method void Logger.d(String, String)>
		markInitializationComplete();
	//   35   81:aload_0         
	//   36   82:invokevirtual   #601 <Method void markInitializationComplete()>
		return null;
	//   37   85:aconst_null     
	//   38   86:areturn         
		handler.finalizeSessions();
	//   39   87:aload_0         
	//   40   88:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   41   91:invokevirtual   #615 <Method boolean CrashlyticsUncaughtExceptionHandler.finalizeSessions()>
	//   42   94:pop             
		obj = ((Object) (getCreateReportSpiCall(((SettingsData) (obj)))));
	//   43   95:aload_0         
	//   44   96:aload_1         
	//   45   97:invokevirtual   #619 <Method CreateReportSpiCall getCreateReportSpiCall(SettingsData)>
	//   46  100:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_124;
	//   47  101:aload_1         
	//   48  102:ifnonnull       124
		Fabric.getLogger().w("CrashlyticsCore", "Unable to create a call to upload reports.");
	//   49  105:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   50  108:ldc1            #76  <String "CrashlyticsCore">
	//   51  110:ldc2            #621 <String "Unable to create a call to upload reports.">
	//   52  113:invokeinterface #598 <Method void Logger.w(String, String)>
		markInitializationComplete();
	//   53  118:aload_0         
	//   54  119:invokevirtual   #601 <Method void markInitializationComplete()>
		return null;
	//   55  122:aconst_null     
	//   56  123:areturn         
		(new ReportUploader(apiKey, ((CreateReportSpiCall) (obj)))).uploadReports(delay);
	//   57  124:new             #623 <Class ReportUploader>
	//   58  127:dup             
	//   59  128:aload_0         
	//   60  129:getfield        #625 <Field String apiKey>
	//   61  132:aload_1         
	//   62  133:invokespecial   #628 <Method void ReportUploader(String, CreateReportSpiCall)>
	//   63  136:aload_0         
	//   64  137:getfield        #137 <Field float delay>
	//   65  140:invokevirtual   #632 <Method void ReportUploader.uploadReports(float)>
		markInitializationComplete();
	//   66  143:aload_0         
	//   67  144:invokevirtual   #601 <Method void markInitializationComplete()>
		return null;
	//   68  147:aconst_null     
	//   69  148:areturn         
		Object obj1;
		obj1;
	//   70  149:astore_1        
		Fabric.getLogger().e("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", ((Throwable) (obj1)));
	//   71  150:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   72  153:ldc1            #76  <String "CrashlyticsCore">
	//   73  155:ldc2            #634 <String "Crashlytics encountered a problem during asynchronous initialization.">
	//   74  158:aload_1         
	//   75  159:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
		markInitializationComplete();
	//   76  164:aload_0         
	//   77  165:invokevirtual   #601 <Method void markInitializationComplete()>
		return null;
	//   78  168:aconst_null     
	//   79  169:areturn         
		obj1;
	//   80  170:astore_1        
		markInitializationComplete();
	//   81  171:aload_0         
	//   82  172:invokevirtual   #601 <Method void markInitializationComplete()>
		throw obj1;
	//   83  175:aload_1         
	//   84  176:athrow          
	}

	String getApiKey()
	{
		return apiKey;
	//    0    0:aload_0         
	//    1    1:getfield        #625 <Field String apiKey>
	//    2    4:areturn         
	}

	Map getAttributes()
	{
		return Collections.unmodifiableMap(((Map) (attributes)));
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field ConcurrentHashMap attributes>
	//    2    4:invokestatic    #643 <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	String getBuildId()
	{
		return buildId;
	//    0    0:aload_0         
	//    1    1:getfield        #648 <Field String buildId>
	//    2    4:areturn         
	}

	CreateReportSpiCall getCreateReportSpiCall(SettingsData settingsdata)
	{
		if(settingsdata != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
			return ((CreateReportSpiCall) (new DefaultCreateReportSpiCall(((Kit) (this)), getOverridenSpiEndpoint(), settingsdata.appData.reportsUrl, httpRequestFactory)));
	//    2    4:new             #650 <Class DefaultCreateReportSpiCall>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #653 <Method String getOverridenSpiEndpoint()>
	//    7   13:aload_1         
	//    8   14:getfield        #657 <Field AppSettingsData SettingsData.appData>
	//    9   17:getfield        #662 <Field String AppSettingsData.reportsUrl>
	//   10   20:aload_0         
	//   11   21:getfield        #500 <Field HttpRequestFactory httpRequestFactory>
	//   12   24:invokespecial   #665 <Method void DefaultCreateReportSpiCall(Kit, String, String, HttpRequestFactory)>
	//   13   27:areturn         
		else
			return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	SessionEventData getExternalCrashEventData()
	{
		SessionEventData sessioneventdata = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(externalCrashEventDataProvider != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #667 <Field CrashEventDataProvider externalCrashEventDataProvider>
	//*   4    6:ifnull          19
			sessioneventdata = externalCrashEventDataProvider.getCrashEventData();
	//    5    9:aload_0         
	//    6   10:getfield        #667 <Field CrashEventDataProvider externalCrashEventDataProvider>
	//    7   13:invokeinterface #672 <Method SessionEventData CrashEventDataProvider.getCrashEventData()>
	//    8   18:astore_1        
		return sessioneventdata;
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	CrashlyticsUncaughtExceptionHandler getHandler()
	{
		return handler;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android.crashlytics-core";
	//    0    0:ldc2            #677 <String "com.crashlytics.sdk.android.crashlytics-core">
	//    1    3:areturn         
	}

	String getInstallerPackageName()
	{
		return installerPackageName;
	//    0    0:aload_0         
	//    1    1:getfield        #520 <Field String installerPackageName>
	//    2    4:areturn         
	}

	String getOverridenSpiEndpoint()
	{
		return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #681 <Method Context getContext()>
	//    2    4:ldc1            #46  <String "com.crashlytics.ApiEndpoint">
	//    3    6:invokestatic    #685 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    4    9:areturn         
	}

	String getPackageName()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #513 <Field String packageName>
	//    2    4:areturn         
	}

	public PinningInfoProvider getPinningInfoProvider()
	{
		if(!disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean disabled>
	//*   2    4:ifne            12
			return pinningInfo;
	//    3    7:aload_0         
	//    4    8:getfield        #141 <Field PinningInfoProvider pinningInfo>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	File getSdkDirectory()
	{
		if(sdkDir == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #691 <Field File sdkDir>
	//*   2    4:ifnonnull       22
			sdkDir = (new FileStoreImpl(((Kit) (this)))).getFilesDir();
	//    3    7:aload_0         
	//    4    8:new             #693 <Class FileStoreImpl>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #696 <Method void FileStoreImpl(Kit)>
	//    8   16:invokevirtual   #699 <Method File FileStoreImpl.getFilesDir()>
	//    9   19:putfield        #691 <Field File sdkDir>
		return sdkDir;
	//   10   22:aload_0         
	//   11   23:getfield        #691 <Field File sdkDir>
	//   12   26:areturn         
	}

	String getUserEmail()
	{
		if(getIdManager().canCollectUserIds())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #401 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #703 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userEmail;
	//    4   10:aload_0         
	//    5   11:getfield        #133 <Field String userEmail>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	String getUserIdentifier()
	{
		if(getIdManager().canCollectUserIds())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #401 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #703 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userId;
	//    4   10:aload_0         
	//    5   11:getfield        #131 <Field String userId>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	String getUserName()
	{
		if(getIdManager().canCollectUserIds())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #401 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #703 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userName;
	//    4   10:aload_0         
	//    5   11:getfield        #135 <Field String userName>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public String getVersion()
	{
		return "2.3.14.151";
	//    0    0:ldc2            #708 <String "2.3.14.151">
	//    1    3:areturn         
	}

	String getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #542 <Field String versionCode>
	//    2    4:areturn         
	}

	String getVersionName()
	{
		return versionName;
	//    0    0:aload_0         
	//    1    1:getfield        #547 <Field String versionName>
	//    2    4:areturn         
	}

	boolean internalVerifyPinning(URL url)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(getPinningInfoProvider() != null)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #714 <Method PinningInfoProvider getPinningInfoProvider()>
	//*   4    6:ifnull          44
		{
			url = ((URL) (httpRequestFactory.buildHttpRequest(HttpMethod.GET, url.toString())));
	//    5    9:aload_0         
	//    6   10:getfield        #500 <Field HttpRequestFactory httpRequestFactory>
	//    7   13:getstatic       #720 <Field HttpMethod HttpMethod.GET>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #723 <Method String URL.toString()>
	//   10   20:invokeinterface #727 <Method HttpRequest HttpRequestFactory.buildHttpRequest(HttpMethod, String)>
	//   11   25:astore_1        
			((HttpsURLConnection)((HttpRequest) (url)).getConnection()).setInstanceFollowRedirects(false);
	//   12   26:aload_1         
	//   13   27:invokevirtual   #733 <Method java.net.HttpURLConnection HttpRequest.getConnection()>
	//   14   30:checkcast       #735 <Class HttpsURLConnection>
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #739 <Method void HttpsURLConnection.setInstanceFollowRedirects(boolean)>
			((HttpRequest) (url)).code();
	//   17   37:aload_1         
	//   18   38:invokevirtual   #742 <Method int HttpRequest.code()>
	//   19   41:pop             
			flag = true;
	//   20   42:iconst_1        
	//   21   43:istore_2        
		}
		return flag;
	//   22   44:iload_2         
	//   23   45:ireturn         
	}

	public void log(int i, String s, String s1)
	{
		doLog(i, s, s1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #745 <Method void doLog(int, String, String)>
		Fabric.getLogger().log(i, (new StringBuilder()).append("").append(s).toString(), (new StringBuilder()).append("").append(s1).toString(), true);
	//    5    7:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//    6   10:iload_1         
	//    7   11:new             #243 <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #244 <Method void StringBuilder()>
	//   10   18:ldc2            #747 <String "">
	//   11   21:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:invokevirtual   #254 <Method String StringBuilder.toString()>
	//   15   31:new             #243 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #244 <Method void StringBuilder()>
	//   18   38:ldc2            #747 <String "">
	//   19   41:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:aload_3         
	//   21   45:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:invokevirtual   #254 <Method String StringBuilder.toString()>
	//   23   51:iconst_1        
	//   24   52:invokeinterface #750 <Method void Logger.log(int, String, String, boolean)>
	//   25   57:return          
	}

	public void log(String s)
	{
		doLog(3, "CrashlyticsCore", s);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:ldc1            #76  <String "CrashlyticsCore">
	//    3    4:aload_1         
	//    4    5:invokespecial   #745 <Method void doLog(int, String, String)>
	//    5    8:return          
	}

	public void logException(Throwable throwable)
	{
		while(disabled || !ensureFabricWithCalled("prior to logging exceptions.")) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
	//    4    8:ldc2            #755 <String "prior to logging exceptions.">
	//    5   11:invokestatic    #225 <Method boolean ensureFabricWithCalled(String)>
	//    6   14:ifeq            7
		if(throwable == null)
	//*   7   17:aload_1         
	//*   8   18:ifnonnull       36
		{
			Fabric.getLogger().log(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
	//    9   21:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   10   24:iconst_5        
	//   11   25:ldc1            #76  <String "CrashlyticsCore">
	//   12   27:ldc2            #757 <String "Crashlytics is ignoring a request to log a null exception.">
	//   13   30:invokeinterface #759 <Method void Logger.log(int, String, String)>
			return;
	//   14   35:return          
		} else
		{
			handler.writeNonFatalException(Thread.currentThread(), throwable);
	//   15   36:aload_0         
	//   16   37:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   17   40:invokestatic    #763 <Method Thread Thread.currentThread()>
	//   18   43:aload_1         
	//   19   44:invokevirtual   #767 <Method void CrashlyticsUncaughtExceptionHandler.writeNonFatalException(Thread, Throwable)>
			return;
	//   20   47:return          
		}
	}

	void markInitializationComplete()
	{
		executorServiceWrapper.executeAsync(new Callable() {

			public Boolean call()
				throws Exception
			{
				boolean flag;
				try
				{
					flag = initializationMarker.remove();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
			//    2    4:invokestatic    #29  <Method CrashlyticsFileMarker CrashlyticsCore.access$100(CrashlyticsCore)>
			//    3    7:invokevirtual   #35  <Method boolean CrashlyticsFileMarker.remove()>
			//    4   10:istore_1        
					Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Initialization marker file removed: ").append(flag).toString());
			//    5   11:invokestatic    #41  <Method Logger Fabric.getLogger()>
			//    6   14:ldc1            #43  <String "CrashlyticsCore">
			//    7   16:new             #45  <Class StringBuilder>
			//    8   19:dup             
			//    9   20:invokespecial   #46  <Method void StringBuilder()>
			//   10   23:ldc1            #48  <String "Initialization marker file removed: ">
			//   11   25:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
			//   12   28:iload_1         
			//   13   29:invokevirtual   #55  <Method StringBuilder StringBuilder.append(boolean)>
			//   14   32:invokevirtual   #59  <Method String StringBuilder.toString()>
			//   15   35:invokeinterface #65  <Method void Logger.d(String, String)>
				}
			//*  16   40:iload_1         
			//*  17   41:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
			//*  18   44:areturn         
				catch(Exception exception)
			//*  19   45:astore_2        
				{
					Fabric.getLogger().e("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", ((Throwable) (exception)));
			//   20   46:invokestatic    #41  <Method Logger Fabric.getLogger()>
			//   21   49:ldc1            #43  <String "CrashlyticsCore">
			//   22   51:ldc1            #73  <String "Problem encountered deleting Crashlytics initialization marker.">
			//   23   53:aload_2         
			//   24   54:invokeinterface #77  <Method void Logger.e(String, String, Throwable)>
					return Boolean.valueOf(false);
			//   25   59:iconst_0        
			//   26   60:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
			//   27   63:areturn         
				}
				return Boolean.valueOf(flag);
			}

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #81  <Method Boolean call()>
			//    2    4:areturn         
			}

			final CrashlyticsCore this$0;

			
			{
				this$0 = CrashlyticsCore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #11  <Class CrashlyticsCore$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #768 <Method void CrashlyticsCore$3(CrashlyticsCore)>
	//    6   12:invokevirtual   #771 <Method Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void markInitializationStarted()
	{
		executorServiceWrapper.executeSyncLoggingException(new Callable() {

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #28  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
				throws Exception
			{
				initializationMarker.create();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
			//    2    4:invokestatic    #33  <Method CrashlyticsFileMarker CrashlyticsCore.access$100(CrashlyticsCore)>
			//    3    7:invokevirtual   #39  <Method boolean CrashlyticsFileMarker.create()>
			//    4   10:pop             
				Fabric.getLogger().d("CrashlyticsCore", "Initialization marker file created.");
			//    5   11:invokestatic    #45  <Method Logger Fabric.getLogger()>
			//    6   14:ldc1            #47  <String "CrashlyticsCore">
			//    7   16:ldc1            #49  <String "Initialization marker file created.">
			//    8   18:invokeinterface #55  <Method void Logger.d(String, String)>
				return null;
			//    9   23:aconst_null     
			//   10   24:areturn         
			}

			final CrashlyticsCore this$0;

			
			{
				this$0 = CrashlyticsCore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #9   <Class CrashlyticsCore$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #772 <Method void CrashlyticsCore$2(CrashlyticsCore)>
	//    6   12:invokevirtual   #188 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected boolean onPreExecute()
	{
		return onPreExecute(super.getContext());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #774 <Method Context Kit.getContext()>
	//    3    5:invokevirtual   #777 <Method boolean onPreExecute(Context)>
	//    4    8:ireturn         
	}

	boolean onPreExecute(Context context)
	{
		if(!disabled) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field boolean disabled>
	//    2    4:ifeq            9
_L1:
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
_L2:
		apiKey = (new ApiKey()).getValue(context);
	//    5    9:aload_0         
	//    6   10:new             #779 <Class ApiKey>
	//    7   13:dup             
	//    8   14:invokespecial   #780 <Method void ApiKey()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #784 <Method String ApiKey.getValue(Context)>
	//   11   21:putfield        #625 <Field String apiKey>
		if(apiKey == null)
			continue; /* Loop/switch isn't completed */
	//   12   24:aload_0         
	//   13   25:getfield        #625 <Field String apiKey>
	//   14   28:ifnull          7
		buildId = CommonUtils.resolveBuildId(context);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokestatic    #787 <Method String CommonUtils.resolveBuildId(Context)>
	//   18   36:putfield        #648 <Field String buildId>
		boolean flag = CommonUtils.getBooleanResourceValue(context, "com.crashlytics.RequireBuildId", true);
	//   19   39:aload_1         
	//   20   40:ldc1            #49  <String "com.crashlytics.RequireBuildId">
	//   21   42:iconst_1        
	//   22   43:invokestatic    #791 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//   23   46:istore_2        
		if(!isBuildIdValid(buildId, flag))
	//*  24   47:aload_0         
	//*  25   48:getfield        #648 <Field String buildId>
	//*  26   51:iload_2         
	//*  27   52:invokestatic    #793 <Method boolean isBuildIdValid(String, boolean)>
	//*  28   55:ifne            68
			throw new UnmetDependencyException("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
	//   29   58:new             #795 <Class UnmetDependencyException>
	//   30   61:dup             
	//   31   62:ldc1            #68  <String "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.">
	//   32   64:invokespecial   #797 <Method void UnmetDependencyException(String)>
	//   33   67:athrow          
		Fabric.getLogger().i("CrashlyticsCore", (new StringBuilder()).append("Initializing Crashlytics ").append(getVersion()).toString());
	//   34   68:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   35   71:ldc1            #76  <String "CrashlyticsCore">
	//   36   73:new             #243 <Class StringBuilder>
	//   37   76:dup             
	//   38   77:invokespecial   #244 <Method void StringBuilder()>
	//   39   80:ldc2            #799 <String "Initializing Crashlytics ">
	//   40   83:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   41   86:aload_0         
	//   42   87:invokevirtual   #801 <Method String getVersion()>
	//   43   90:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   44   93:invokevirtual   #254 <Method String StringBuilder.toString()>
	//   45   96:invokeinterface #804 <Method void Logger.i(String, String)>
		fileStore = ((FileStore) (new FileStoreImpl(((Kit) (this)))));
	//   46  101:aload_0         
	//   47  102:new             #693 <Class FileStoreImpl>
	//   48  105:dup             
	//   49  106:aload_0         
	//   50  107:invokespecial   #696 <Method void FileStoreImpl(Kit)>
	//   51  110:putfield        #403 <Field FileStore fileStore>
		crashMarker = new CrashlyticsFileMarker("crash_marker", fileStore);
	//   52  113:aload_0         
	//   53  114:new             #571 <Class CrashlyticsFileMarker>
	//   54  117:dup             
	//   55  118:ldc1            #55  <String "crash_marker">
	//   56  120:aload_0         
	//   57  121:getfield        #403 <Field FileStore fileStore>
	//   58  124:invokespecial   #807 <Method void CrashlyticsFileMarker(String, FileStore)>
	//   59  127:putfield        #181 <Field CrashlyticsFileMarker crashMarker>
		initializationMarker = new CrashlyticsFileMarker("initialization_marker", fileStore);
	//   60  130:aload_0         
	//   61  131:new             #571 <Class CrashlyticsFileMarker>
	//   62  134:dup             
	//   63  135:ldc1            #61  <String "initialization_marker">
	//   64  137:aload_0         
	//   65  138:getfield        #403 <Field FileStore fileStore>
	//   66  141:invokespecial   #807 <Method void CrashlyticsFileMarker(String, FileStore)>
	//   67  144:putfield        #170 <Field CrashlyticsFileMarker initializationMarker>
		boolean flag1;
		ManifestUnityVersionProvider manifestunityversionprovider;
		setAndValidateKitProperties(context);
	//   68  147:aload_0         
	//   69  148:aload_1         
	//   70  149:invokespecial   #809 <Method void setAndValidateKitProperties(Context)>
		manifestunityversionprovider = new ManifestUnityVersionProvider(context, getPackageName());
	//   71  152:new             #811 <Class ManifestUnityVersionProvider>
	//   72  155:dup             
	//   73  156:aload_1         
	//   74  157:aload_0         
	//   75  158:invokevirtual   #812 <Method String getPackageName()>
	//   76  161:invokespecial   #815 <Method void ManifestUnityVersionProvider(Context, String)>
	//   77  164:astore_3        
		flag1 = didPreviousInitializationFail();
	//   78  165:aload_0         
	//   79  166:invokevirtual   #817 <Method boolean didPreviousInitializationFail()>
	//   80  169:istore_2        
		checkForPreviousCrash();
	//   81  170:aload_0         
	//   82  171:invokespecial   #819 <Method void checkForPreviousCrash()>
		if(installExceptionHandler(((UnityVersionProvider) (manifestunityversionprovider))))
	//*  83  174:aload_0         
	//*  84  175:aload_3         
	//*  85  176:invokespecial   #821 <Method boolean installExceptionHandler(UnityVersionProvider)>
	//*  86  179:ifeq            7
		{
label0:
			{
				if(!flag1)
					break label0;
	//   87  182:iload_2         
	//   88  183:ifeq            216
				try
				{
					if(!CommonUtils.canTryConnection(context))
						break label0;
	//   89  186:aload_1         
	//   90  187:invokestatic    #824 <Method boolean CommonUtils.canTryConnection(Context)>
	//   91  190:ifeq            216
					finishInitSynchronously();
	//   92  193:aload_0         
	//   93  194:invokespecial   #826 <Method void finishInitSynchronously()>
				}
	//*  94  197:iconst_0        
	//*  95  198:ireturn         
				// Misplaced declaration of an exception variable
				catch(Context context)
	//*  96  199:astore_1        
				{
					Fabric.getLogger().e("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", ((Throwable) (context)));
	//   97  200:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   98  203:ldc1            #76  <String "CrashlyticsCore">
	//   99  205:ldc2            #828 <String "Crashlytics was not started due to an exception during initialization">
	//  100  208:aload_1         
	//  101  209:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
					return false;
	//  102  214:iconst_0        
	//  103  215:ireturn         
				}
				return false;
			}
			return true;
	//  104  216:iconst_1        
	//  105  217:ireturn         
		}
		if(true) goto _L1; else goto _L3
_L3:
	}

	public void setBool(String s, boolean flag)
	{
		setString(s, Boolean.toString(flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #833 <Method String Boolean.toString(boolean)>
	//    4    6:invokevirtual   #836 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setDouble(String s, double d)
	{
		setString(s, Double.toString(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #843 <Method String Double.toString(double)>
	//    4    6:invokevirtual   #836 <Method void setString(String, String)>
	//    5    9:return          
	}

	void setExternalCrashEventDataProvider(CrashEventDataProvider crasheventdataprovider)
	{
		externalCrashEventDataProvider = crasheventdataprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #667 <Field CrashEventDataProvider externalCrashEventDataProvider>
	//    3    5:return          
	}

	public void setFloat(String s, float f)
	{
		setString(s, Float.toString(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #852 <Method String Float.toString(float)>
	//    4    6:invokevirtual   #836 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setInt(String s, int i)
	{
		setString(s, Integer.toString(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #540 <Method String Integer.toString(int)>
	//    4    6:invokevirtual   #836 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setListener(CrashlyticsListener crashlyticslistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Fabric.getLogger().w("CrashlyticsCore", "Use of setListener is deprecated.");
	//    2    2:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//    3    5:ldc1            #76  <String "CrashlyticsCore">
	//    4    7:ldc2            #859 <String "Use of setListener is deprecated.">
	//    5   10:invokeinterface #598 <Method void Logger.w(String, String)>
		if(crashlyticslistener != null)
			break MISSING_BLOCK_LABEL_35;
	//    6   15:aload_1         
	//    7   16:ifnonnull       35
		throw new IllegalArgumentException("listener must not be null.");
	//    8   19:new             #861 <Class IllegalArgumentException>
	//    9   22:dup             
	//   10   23:ldc2            #863 <String "listener must not be null.">
	//   11   26:invokespecial   #864 <Method void IllegalArgumentException(String)>
	//   12   29:athrow          
		crashlyticslistener;
	//   13   30:astore_1        
		this;
	//   14   31:aload_0         
		JVM INSTR monitorexit ;
	//   15   32:monitorexit     
		throw crashlyticslistener;
	//   16   33:aload_1         
	//   17   34:athrow          
		listener = crashlyticslistener;
	//   18   35:aload_0         
	//   19   36:aload_1         
	//   20   37:putfield        #139 <Field CrashlyticsListener listener>
		this;
	//   21   40:aload_0         
		JVM INSTR monitorexit ;
	//   22   41:monitorexit     
	//   23   42:return          
	}

	public void setLong(String s, long l)
	{
		setString(s, Long.toString(l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #872 <Method String Long.toString(long)>
	//    4    6:invokevirtual   #836 <Method void setString(String, String)>
	//    5    9:return          
	}

	void setShouldSendUserReportsWithoutPrompting(boolean flag)
	{
		PreferenceStoreImpl preferencestoreimpl = new PreferenceStoreImpl(((Kit) (this)));
	//    0    0:new             #877 <Class PreferenceStoreImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #878 <Method void PreferenceStoreImpl(Kit)>
	//    4    8:astore_2        
		((PreferenceStore) (preferencestoreimpl)).save(((PreferenceStore) (preferencestoreimpl)).edit().putBoolean("always_send_reports_opt_in", flag));
	//    5    9:aload_2         
	//    6   10:aload_2         
	//    7   11:invokeinterface #884 <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    8   16:ldc1            #71  <String "always_send_reports_opt_in">
	//    9   18:iload_1         
	//   10   19:invokeinterface #890 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   11   24:invokeinterface #894 <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   12   29:pop             
	//   13   30:return          
	}

	public void setString(String s, String s1)
	{
		while(disabled || !ensureFabricWithCalled("prior to setting keys.")) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
	//    4    8:ldc2            #897 <String "prior to setting keys.">
	//    5   11:invokestatic    #225 <Method boolean ensureFabricWithCalled(String)>
	//    6   14:ifeq            7
		if(s == null)
	//*   7   17:aload_1         
	//*   8   18:ifnonnull       63
		{
			s = ((String) (getContext()));
	//    9   21:aload_0         
	//   10   22:invokevirtual   #681 <Method Context getContext()>
	//   11   25:astore_1        
			if(s != null && CommonUtils.isAppDebuggable(((Context) (s))))
	//*  12   26:aload_1         
	//*  13   27:ifnull          48
	//*  14   30:aload_1         
	//*  15   31:invokestatic    #900 <Method boolean CommonUtils.isAppDebuggable(Context)>
	//*  16   34:ifeq            48
			{
				throw new IllegalArgumentException("Custom attribute key must not be null.");
	//   17   37:new             #861 <Class IllegalArgumentException>
	//   18   40:dup             
	//   19   41:ldc2            #902 <String "Custom attribute key must not be null.">
	//   20   44:invokespecial   #864 <Method void IllegalArgumentException(String)>
	//   21   47:athrow          
			} else
			{
				Fabric.getLogger().e("CrashlyticsCore", "Attempting to set custom attribute with null key, ignoring.", ((Throwable) (null)));
	//   22   48:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   23   51:ldc1            #76  <String "CrashlyticsCore">
	//   24   53:ldc2            #904 <String "Attempting to set custom attribute with null key, ignoring.">
	//   25   56:aconst_null     
	//   26   57:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
				return;
	//   27   62:return          
			}
		}
		String s2 = sanitizeAttribute(s);
	//   28   63:aload_1         
	//   29   64:invokestatic    #906 <Method String sanitizeAttribute(String)>
	//   30   67:astore_3        
		if(attributes.size() >= 64 && !attributes.containsKey(((Object) (s2))))
	//*  31   68:aload_0         
	//*  32   69:getfield        #155 <Field ConcurrentHashMap attributes>
	//*  33   72:invokevirtual   #909 <Method int ConcurrentHashMap.size()>
	//*  34   75:bipush          64
	//*  35   77:icmplt          105
	//*  36   80:aload_0         
	//*  37   81:getfield        #155 <Field ConcurrentHashMap attributes>
	//*  38   84:aload_3         
	//*  39   85:invokevirtual   #912 <Method boolean ConcurrentHashMap.containsKey(Object)>
	//*  40   88:ifne            105
		{
			Fabric.getLogger().d("CrashlyticsCore", "Exceeded maximum number of custom attributes (64)");
	//   41   91:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//   42   94:ldc1            #76  <String "CrashlyticsCore">
	//   43   96:ldc2            #914 <String "Exceeded maximum number of custom attributes (64)">
	//   44   99:invokeinterface #312 <Method void Logger.d(String, String)>
			return;
	//   45  104:return          
		}
		if(s1 == null)
	//*  46  105:aload_2         
	//*  47  106:ifnonnull       135
			s = "";
	//   48  109:ldc2            #747 <String "">
	//   49  112:astore_1        
		else
	//*  50  113:aload_0         
	//*  51  114:getfield        #155 <Field ConcurrentHashMap attributes>
	//*  52  117:aload_3         
	//*  53  118:aload_1         
	//*  54  119:invokevirtual   #918 <Method Object ConcurrentHashMap.put(Object, Object)>
	//*  55  122:pop             
	//*  56  123:aload_0         
	//*  57  124:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//*  58  127:aload_0         
	//*  59  128:getfield        #155 <Field ConcurrentHashMap attributes>
	//*  60  131:invokevirtual   #922 <Method void CrashlyticsUncaughtExceptionHandler.cacheKeyData(Map)>
	//*  61  134:return          
			s = sanitizeAttribute(s1);
	//   62  135:aload_2         
	//   63  136:invokestatic    #906 <Method String sanitizeAttribute(String)>
	//   64  139:astore_1        
		attributes.put(((Object) (s2)), ((Object) (s)));
		handler.cacheKeyData(((Map) (attributes)));
	//*  65  140:goto            113
	}

	public void setUserEmail(String s)
	{
		while(disabled || !ensureFabricWithCalled("prior to setting user data.")) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
	//    4    8:ldc2            #925 <String "prior to setting user data.">
	//    5   11:invokestatic    #225 <Method boolean ensureFabricWithCalled(String)>
	//    6   14:ifeq            7
		userEmail = sanitizeAttribute(s);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokestatic    #906 <Method String sanitizeAttribute(String)>
	//   10   22:putfield        #133 <Field String userEmail>
		handler.cacheUserData(userId, userName, userEmail);
	//   11   25:aload_0         
	//   12   26:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   13   29:aload_0         
	//   14   30:getfield        #131 <Field String userId>
	//   15   33:aload_0         
	//   16   34:getfield        #135 <Field String userName>
	//   17   37:aload_0         
	//   18   38:getfield        #133 <Field String userEmail>
	//   19   41:invokevirtual   #929 <Method void CrashlyticsUncaughtExceptionHandler.cacheUserData(String, String, String)>
	//   20   44:return          
	}

	public void setUserIdentifier(String s)
	{
		while(disabled || !ensureFabricWithCalled("prior to setting user data.")) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
	//    4    8:ldc2            #925 <String "prior to setting user data.">
	//    5   11:invokestatic    #225 <Method boolean ensureFabricWithCalled(String)>
	//    6   14:ifeq            7
		userId = sanitizeAttribute(s);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokestatic    #906 <Method String sanitizeAttribute(String)>
	//   10   22:putfield        #131 <Field String userId>
		handler.cacheUserData(userId, userName, userEmail);
	//   11   25:aload_0         
	//   12   26:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   13   29:aload_0         
	//   14   30:getfield        #131 <Field String userId>
	//   15   33:aload_0         
	//   16   34:getfield        #135 <Field String userName>
	//   17   37:aload_0         
	//   18   38:getfield        #133 <Field String userEmail>
	//   19   41:invokevirtual   #929 <Method void CrashlyticsUncaughtExceptionHandler.cacheUserData(String, String, String)>
	//   20   44:return          
	}

	public void setUserName(String s)
	{
		while(disabled || !ensureFabricWithCalled("prior to setting user data.")) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
	//    4    8:ldc2            #925 <String "prior to setting user data.">
	//    5   11:invokestatic    #225 <Method boolean ensureFabricWithCalled(String)>
	//    6   14:ifeq            7
		userName = sanitizeAttribute(s);
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokestatic    #906 <Method String sanitizeAttribute(String)>
	//   10   22:putfield        #135 <Field String userName>
		handler.cacheUserData(userId, userName, userEmail);
	//   11   25:aload_0         
	//   12   26:getfield        #227 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   13   29:aload_0         
	//   14   30:getfield        #131 <Field String userId>
	//   15   33:aload_0         
	//   16   34:getfield        #135 <Field String userName>
	//   17   37:aload_0         
	//   18   38:getfield        #133 <Field String userEmail>
	//   19   41:invokevirtual   #929 <Method void CrashlyticsUncaughtExceptionHandler.cacheUserData(String, String, String)>
	//   20   44:return          
	}

	boolean shouldPromptUserBeforeSendingCrashReports()
	{
		return ((Boolean)Settings.getInstance().withSettings(new io.fabric.sdk.android.services.settings.Settings.SettingsAccess() {

			public Boolean usingSettings(SettingsData settingsdata)
			{
				boolean flag = false;
			//    0    0:iconst_0        
			//    1    1:istore_2        
				if(settingsdata.featuresData.promptEnabled)
			//*   2    2:aload_1         
			//*   3    3:getfield        #30  <Field FeaturesSettingsData SettingsData.featuresData>
			//*   4    6:getfield        #36  <Field boolean FeaturesSettingsData.promptEnabled>
			//*   5    9:ifeq            29
				{
					if(!shouldSendReportsWithoutPrompting())
			//*   6   12:aload_0         
			//*   7   13:getfield        #18  <Field CrashlyticsCore this$0>
			//*   8   16:invokevirtual   #39  <Method boolean CrashlyticsCore.shouldSendReportsWithoutPrompting()>
			//*   9   19:ifne            24
						flag = true;
			//   10   22:iconst_1        
			//   11   23:istore_2        
					return Boolean.valueOf(flag);
			//   12   24:iload_2         
			//   13   25:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
			//   14   28:areturn         
				} else
				{
					return Boolean.valueOf(false);
			//   15   29:iconst_0        
			//   16   30:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
			//   17   33:areturn         
				}
			}

			public volatile Object usingSettings(SettingsData settingsdata)
			{
				return ((Object) (usingSettings(settingsdata)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #48  <Method Boolean usingSettings(SettingsData)>
			//    3    5:areturn         
			}

			final CrashlyticsCore this$0;

			
			{
				this$0 = CrashlyticsCore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
, ((Object) (Boolean.valueOf(false))))).booleanValue();
	//    0    0:invokestatic    #377 <Method Settings Settings.getInstance()>
	//    1    3:new             #15  <Class CrashlyticsCore$5>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #933 <Method void CrashlyticsCore$5(CrashlyticsCore)>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #554 <Method Boolean Boolean.valueOf(boolean)>
	//    7   15:invokevirtual   #558 <Method Object Settings.withSettings(io.fabric.sdk.android.services.settings.Settings$SettingsAccess, Object)>
	//    8   18:checkcast       #190 <Class Boolean>
	//    9   21:invokevirtual   #561 <Method boolean Boolean.booleanValue()>
	//   10   24:ireturn         
	}

	boolean shouldSendReportsWithoutPrompting()
	{
		return ((PreferenceStore) (new PreferenceStoreImpl(((Kit) (this))))).get().getBoolean("always_send_reports_opt_in", false);
	//    0    0:new             #877 <Class PreferenceStoreImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #878 <Method void PreferenceStoreImpl(Kit)>
	//    4    8:invokeinterface #937 <Method SharedPreferences PreferenceStore.get()>
	//    5   13:ldc1            #71  <String "always_send_reports_opt_in">
	//    6   15:iconst_0        
	//    7   16:invokeinterface #942 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    8   21:ireturn         
	}

	public boolean verifyPinning(URL url)
	{
		boolean flag;
		try
		{
			flag = internalVerifyPinning(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #945 <Method boolean internalVerifyPinning(URL)>
	//    3    5:istore_2        
		}
	//*   4    6:iload_2         
	//*   5    7:ireturn         
		// Misplaced declaration of an exception variable
		catch(URL url)
	//*   6    8:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Could not verify SSL pinning", ((Throwable) (url)));
	//    7    9:invokestatic    #209 <Method Logger Fabric.getLogger()>
	//    8   12:ldc1            #76  <String "CrashlyticsCore">
	//    9   14:ldc2            #947 <String "Could not verify SSL pinning">
	//   10   17:aload_1         
	//   11   18:invokeinterface #217 <Method void Logger.e(String, String, Throwable)>
			return false;
	//   12   23:iconst_0        
	//   13   24:ireturn         
		}
		return flag;
	}

	static final float CLS_DEFAULT_PROCESS_DELAY = 1F;
	static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
	static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
	static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
	static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
	static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
	static final String CRASH_MARKER_FILE_NAME = "crash_marker";
	static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
	private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
	static final int MAX_ATTRIBUTES = 64;
	static final int MAX_ATTRIBUTE_SIZE = 1024;
	private static final String MISSING_BUILD_ID_MSG = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
	private static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
	private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
	public static final String TAG = "CrashlyticsCore";
	private String apiKey;
	private final ConcurrentHashMap attributes;
	private String buildId;
	private CrashlyticsFileMarker crashMarker;
	private float delay;
	private boolean disabled;
	private CrashlyticsExecutorServiceWrapper executorServiceWrapper;
	private CrashEventDataProvider externalCrashEventDataProvider;
	private FileStore fileStore;
	private CrashlyticsUncaughtExceptionHandler handler;
	private HttpRequestFactory httpRequestFactory;
	private CrashlyticsFileMarker initializationMarker;
	private String installerPackageName;
	private CrashlyticsListener listener;
	private String packageName;
	private final PinningInfoProvider pinningInfo;
	private File sdkDir;
	private final long startTime;
	private String userEmail;
	private String userId;
	private String userName;
	private String versionCode;
	private String versionName;


/*
	static CrashlyticsFileMarker access$100(CrashlyticsCore crashlyticscore)
	{
		return crashlyticscore.initializationMarker;
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field CrashlyticsFileMarker initializationMarker>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200(CrashlyticsCore crashlyticscore, Activity activity, PromptSettingsData promptsettingsdata)
	{
		return crashlyticscore.getSendDecisionFromUser(activity, promptsettingsdata);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #176 <Method boolean getSendDecisionFromUser(Activity, PromptSettingsData)>
	//    4    6:ireturn         
	}

*/
}
