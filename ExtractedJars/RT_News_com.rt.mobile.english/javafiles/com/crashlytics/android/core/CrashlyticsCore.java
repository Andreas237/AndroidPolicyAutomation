// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.app.Activity;
import android.content.*;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
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
//			CrashlyticsExecutorServiceWrapper, CrashlyticsListener, CrashlyticsUncaughtExceptionHandler, DialogStringResolver, 
//			CrashlyticsPinningInfoProvider, BuildIdValidator, CrashTest, CrashlyticsFileMarker, 
//			ReportUploader, DefaultCreateReportSpiCall, CrashlyticsMissingDependencyException, ManifestUnityVersionProvider, 
//			PinningInfoProvider, UnityVersionProvider, CreateReportSpiCall

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

	private static class OptInLatch
	{

		void await()
		{
			try
			{
				latch.await();
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field CountDownLatch latch>
		//    2    4:invokevirtual   #32  <Method void CountDownLatch.await()>
				return;
		//    3    7:return          
			}
			catch(InterruptedException interruptedexception)
		//*   4    8:astore_1        
			{
				return;
		//    5    9:return          
			}
		}

		boolean getOptIn()
		{
			return send;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field boolean send>
		//    2    4:ireturn         
		}

		void setOptIn(boolean flag)
		{
			send = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #17  <Field boolean send>
			latch.countDown();
		//    3    5:aload_0         
		//    4    6:getfield        #24  <Field CountDownLatch latch>
		//    5    9:invokevirtual   #39  <Method void CountDownLatch.countDown()>
		//    6   12:return          
		}

		private final CountDownLatch latch;
		private boolean send;

		private OptInLatch()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
			send = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #17  <Field boolean send>
			latch = new CountDownLatch(1);
		//    5    9:aload_0         
		//    6   10:new             #19  <Class CountDownLatch>
		//    7   13:dup             
		//    8   14:iconst_1        
		//    9   15:invokespecial   #22  <Method void CountDownLatch(int)>
		//   10   18:putfield        #24  <Field CountDownLatch latch>
		//   11   21:return          
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
	//    5    5:invokespecial   #119 <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean)>
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
	//    5    6:ldc1            #122 <String "Crashlytics Exception Handler">
	//    6    8:invokestatic    #128 <Method ExecutorService ExecutorUtils.buildSingleThreadExecutorService(String)>
	//    7   11:invokespecial   #131 <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean, ExecutorService)>
	//    8   14:return          
	}

	CrashlyticsCore(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag, ExecutorService executorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void Kit()>
		userId = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #135 <Field String userId>
		userEmail = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #137 <Field String userEmail>
		userName = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #139 <Field String userName>
		delay = f;
	//   11   19:aload_0         
	//   12   20:fload_1         
	//   13   21:putfield        #141 <Field float delay>
		if(crashlyticslistener == null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          31
	//*  16   28:goto            40
			crashlyticslistener = ((CrashlyticsListener) (new NoOpListener()));
	//   17   31:new             #33  <Class CrashlyticsCore$NoOpListener>
	//   18   34:dup             
	//   19   35:aconst_null     
	//   20   36:invokespecial   #144 <Method void CrashlyticsCore$NoOpListener(CrashlyticsCore$1)>
	//   21   39:astore_2        
		listener = crashlyticslistener;
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:putfield        #146 <Field CrashlyticsListener listener>
		pinningInfo = pinninginfoprovider;
	//   25   45:aload_0         
	//   26   46:aload_3         
	//   27   47:putfield        #148 <Field PinningInfoProvider pinningInfo>
		disabled = flag;
	//   28   50:aload_0         
	//   29   51:iload           4
	//   30   53:putfield        #150 <Field boolean disabled>
		executorServiceWrapper = new CrashlyticsExecutorServiceWrapper(executorservice);
	//   31   56:aload_0         
	//   32   57:new             #152 <Class CrashlyticsExecutorServiceWrapper>
	//   33   60:dup             
	//   34   61:aload           5
	//   35   63:invokespecial   #155 <Method void CrashlyticsExecutorServiceWrapper(ExecutorService)>
	//   36   66:putfield        #157 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
		attributes = new ConcurrentHashMap();
	//   37   69:aload_0         
	//   38   70:new             #159 <Class ConcurrentHashMap>
	//   39   73:dup             
	//   40   74:invokespecial   #160 <Method void ConcurrentHashMap()>
	//   41   77:putfield        #162 <Field ConcurrentHashMap attributes>
		startTime = System.currentTimeMillis();
	//   42   80:aload_0         
	//   43   81:invokestatic    #168 <Method long System.currentTimeMillis()>
	//   44   84:putfield        #170 <Field long startTime>
	//   45   87:return          
	}

	private void checkForPreviousCrash()
	{
		Boolean boolean1 = (Boolean)executorServiceWrapper.executeSyncLoggingException(((Callable) (new CrashMarkerCheck(crashMarker))));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #30  <Class CrashlyticsCore$CrashMarkerCheck>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #190 <Field CrashlyticsFileMarker crashMarker>
	//    6   12:invokespecial   #193 <Method void CrashlyticsCore$CrashMarkerCheck(CrashlyticsFileMarker)>
	//    7   15:invokevirtual   #197 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//    8   18:checkcast       #199 <Class Boolean>
	//    9   21:astore_1        
		if(!Boolean.TRUE.equals(((Object) (boolean1))))
	//*  10   22:getstatic       #203 <Field Boolean Boolean.TRUE>
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #207 <Method boolean Boolean.equals(Object)>
	//*  13   29:ifne            33
			return;
	//   14   32:return          
		try
		{
			listener.crashlyticsDidDetectCrashDuringPreviousExecution();
	//   15   33:aload_0         
	//   16   34:getfield        #146 <Field CrashlyticsListener listener>
	//   17   37:invokeinterface #212 <Method void CrashlyticsListener.crashlyticsDidDetectCrashDuringPreviousExecution()>
			return;
	//   18   42:return          
		}
		catch(Exception exception)
	//*  19   43:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", ((Throwable) (exception)));
	//   20   44:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   21   47:ldc1            #80  <String "CrashlyticsCore">
	//   22   49:ldc1            #220 <String "Exception thrown by CrashlyticsListener while notifying of previous crash.">
	//   23   51:aload_1         
	//   24   52:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
		}
	//   25   57:return          
	}

	private static int dipsToPixels(float f, int i)
	{
		return (int)(f * (float)i);
	//    0    0:fload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:fmul            
	//    4    4:f2i             
	//    5    5:ireturn         
	}

	private void doLog(int i, String s, String s1)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to logging messages."))
	//*   4    8:ldc1            #230 <String "prior to logging messages.">
	//*   5   10:invokestatic    #234 <Method boolean ensureFabricWithCalled(String)>
	//*   6   13:ifne            17
		{
			return;
	//    7   16:return          
		} else
		{
			long l = System.currentTimeMillis();
	//    8   17:invokestatic    #168 <Method long System.currentTimeMillis()>
	//    9   20:lstore          4
			long l1 = startTime;
	//   10   22:aload_0         
	//   11   23:getfield        #170 <Field long startTime>
	//   12   26:lstore          6
			handler.writeToLog(l - l1, formatLogMessage(i, s, s1));
	//   13   28:aload_0         
	//   14   29:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   15   32:lload           4
	//   16   34:lload           6
	//   17   36:lsub            
	//   18   37:iload_1         
	//   19   38:aload_2         
	//   20   39:aload_3         
	//   21   40:invokestatic    #240 <Method String formatLogMessage(int, String, String)>
	//   22   43:invokevirtual   #246 <Method void CrashlyticsUncaughtExceptionHandler.writeToLog(long, String)>
			return;
	//   23   46:return          
		}
	}

	private static boolean ensureFabricWithCalled(String s)
	{
		CrashlyticsCore crashlyticscore = getInstance();
	//    0    0:invokestatic    #250 <Method CrashlyticsCore getInstance()>
	//    1    3:astore_1        
		if(crashlyticscore != null && crashlyticscore.handler != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          20
	//*   4    8:aload_1         
	//*   5    9:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//*   6   12:ifnonnull       18
	//*   7   15:goto            20
		{
			return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
		} else
		{
			Logger logger = Fabric.getLogger();
	//   10   20:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   11   23:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #252 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #253 <Method void StringBuilder()>
	//   15   31:astore_2        
			stringbuilder.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
	//   16   32:aload_2         
	//   17   33:ldc1            #255 <String "Crashlytics must be initialized by calling Fabric.with(Context) ">
	//   18   35:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(s);
	//   20   39:aload_2         
	//   21   40:aload_0         
	//   22   41:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			logger.e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   24   45:aload_1         
	//   25   46:ldc1            #80  <String "CrashlyticsCore">
	//   26   48:aload_2         
	//   27   49:invokevirtual   #263 <Method String StringBuilder.toString()>
	//   28   52:aconst_null     
	//   29   53:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
			return false;
	//   30   58:iconst_0        
	//   31   59:ireturn         
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
	//    3    5:invokespecial   #273 <Method void CrashlyticsCore$1(CrashlyticsCore)>
	//    4    8:astore_1        
		for(Iterator iterator = getDependencies().iterator(); iterator.hasNext(); ((PriorityCallable) (obj)).addDependency((Task)iterator.next()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #277 <Method Collection getDependencies()>
	//    7   13:invokeinterface #283 <Method Iterator Collection.iterator()>
	//    8   18:astore_2        
	//    9   19:aload_2         
	//   10   20:invokeinterface #289 <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            44
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokeinterface #293 <Method Object Iterator.next()>
	//   15   35:checkcast       #295 <Class Task>
	//   16   38:invokevirtual   #301 <Method void PriorityCallable.addDependency(Task)>
	//*  17   41:goto            19
		obj = ((Object) (getFabric().getExecutorService().submit(((Callable) (obj)))));
	//   18   44:aload_0         
	//   19   45:invokevirtual   #305 <Method Fabric getFabric()>
	//   20   48:invokevirtual   #309 <Method ExecutorService Fabric.getExecutorService()>
	//   21   51:aload_1         
	//   22   52:invokeinterface #315 <Method Future ExecutorService.submit(Callable)>
	//   23   57:astore_1        
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
	//   24   58:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   25   61:ldc1            #80  <String "CrashlyticsCore">
	//   26   63:ldc2            #317 <String "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.">
	//   27   66:invokeinterface #321 <Method void Logger.d(String, String)>
		try
		{
			((Future) (obj)).get(4L, TimeUnit.SECONDS);
	//   28   71:aload_1         
	//   29   72:ldc2w           #322 <Long 4L>
	//   30   75:getstatic       #329 <Field TimeUnit TimeUnit.SECONDS>
	//   31   78:invokeinterface #335 <Method Object Future.get(long, TimeUnit)>
	//   32   83:pop             
			return;
	//   33   84:return          
		}
	//*  34   85:astore_1        
	//*  35   86:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//*  36   89:ldc1            #80  <String "CrashlyticsCore">
	//*  37   91:ldc2            #337 <String "Crashlytics timed out during initialization.">
	//*  38   94:aload_1         
	//*  39   95:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
	//*  40  100:return          
	//*  41  101:astore_1        
	//*  42  102:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//*  43  105:ldc1            #80  <String "CrashlyticsCore">
	//*  44  107:ldc2            #339 <String "Problem encountered during Crashlytics initialization.">
	//*  45  110:aload_1         
	//*  46  111:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
	//*  47  116:return          
		catch(InterruptedException interruptedexception)
	//*  48  117:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Crashlytics was interrupted during initialization.", ((Throwable) (interruptedexception)));
	//   49  118:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   50  121:ldc1            #80  <String "CrashlyticsCore">
	//   51  123:ldc2            #341 <String "Crashlytics was interrupted during initialization.">
	//   52  126:aload_1         
	//   53  127:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
		}
		catch(ExecutionException executionexception)
		{
			Fabric.getLogger().e("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", ((Throwable) (executionexception)));
			return;
		}
		catch(TimeoutException timeoutexception)
		{
			Fabric.getLogger().e("CrashlyticsCore", "Crashlytics timed out during initialization.", ((Throwable) (timeoutexception)));
			return;
		}
	//   54  132:return          
	}

	private static String formatLogMessage(int i, String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #252 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #253 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(CommonUtils.logPriorityToString(i));
	//    4    8:aload_3         
	//    5    9:iload_0         
	//    6   10:invokestatic    #347 <Method String CommonUtils.logPriorityToString(int)>
	//    7   13:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("/");
	//    9   17:aload_3         
	//   10   18:ldc2            #349 <String "/">
	//   11   21:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(s);
	//   13   25:aload_3         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(" ");
	//   17   31:aload_3         
	//   18   32:ldc2            #351 <String " ">
	//   19   35:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append(s1);
	//   21   39:aload_3         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
		return stringbuilder.toString();
	//   25   45:aload_3         
	//   26   46:invokevirtual   #263 <Method String StringBuilder.toString()>
	//   27   49:areturn         
	}

	public static CrashlyticsCore getInstance()
	{
		return (CrashlyticsCore)Fabric.getKit(com/crashlytics/android/core/CrashlyticsCore);
	//    0    0:ldc1            #2   <Class CrashlyticsCore>
	//    1    2:invokestatic    #355 <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class CrashlyticsCore>
	//    3    8:areturn         
	}

	private boolean getSendDecisionFromUser(final Activity activity, final PromptSettingsData promptData)
	{
		final DialogStringResolver stringResolver = new DialogStringResolver(((Context) (activity)), promptData);
	//    0    0:new             #357 <Class DialogStringResolver>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #360 <Method void DialogStringResolver(Context, PromptSettingsData)>
	//    5    9:astore_3        
		final OptInLatch latch = new OptInLatch();
	//    6   10:new             #36  <Class CrashlyticsCore$OptInLatch>
	//    7   13:dup             
	//    8   14:aconst_null     
	//    9   15:invokespecial   #361 <Method void CrashlyticsCore$OptInLatch(CrashlyticsCore$1)>
	//   10   18:astore          4
		activity.runOnUiThread(new Runnable() {

			public void run()
			{
				android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (activity)));
			//    0    0:new             #46  <Class android.app.AlertDialog$Builder>
			//    1    3:dup             
			//    2    4:aload_0         
			//    3    5:getfield        #33  <Field Activity val$activity>
			//    4    8:invokespecial   #49  <Method void android.app.AlertDialog$Builder(Context)>
			//    5   11:astore_3        
				android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialoginterface, int i)
					{
						latch.setOptIn(true);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field CrashlyticsCore$7 this$1>
					//    2    4:getfield        #26  <Field CrashlyticsCore$OptInLatch CrashlyticsCore$7.val$latch>
					//    3    7:iconst_1        
					//    4    8:invokevirtual   #32  <Method void CrashlyticsCore$OptInLatch.setOptIn(boolean)>
						dialoginterface.dismiss();
					//    5   11:aload_1         
					//    6   12:invokeinterface #37  <Method void DialogInterface.dismiss()>
					//    7   17:return          
					}

					final _cls7 this$1;

			
			{
				this$1 = _cls7.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CrashlyticsCore$7 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
;
			//    6   12:new             #13  <Class CrashlyticsCore$7$1>
			//    7   15:dup             
			//    8   16:aload_0         
			//    9   17:invokespecial   #52  <Method void CrashlyticsCore$7$1(CrashlyticsCore$7)>
			//   10   20:astore          4
				float f = activity.getResources().getDisplayMetrics().density;
			//   11   22:aload_0         
			//   12   23:getfield        #33  <Field Activity val$activity>
			//   13   26:invokevirtual   #58  <Method Resources Activity.getResources()>
			//   14   29:invokevirtual   #64  <Method DisplayMetrics Resources.getDisplayMetrics()>
			//   15   32:getfield        #70  <Field float DisplayMetrics.density>
			//   16   35:fstore_1        
				int i = CrashlyticsCore.dipsToPixels(f, 5);
			//   17   36:fload_1         
			//   18   37:iconst_5        
			//   19   38:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
			//   20   41:istore_2        
				TextView textview = new TextView(((Context) (activity)));
			//   21   42:new             #76  <Class TextView>
			//   22   45:dup             
			//   23   46:aload_0         
			//   24   47:getfield        #33  <Field Activity val$activity>
			//   25   50:invokespecial   #77  <Method void TextView(Context)>
			//   26   53:astore          5
				textview.setAutoLinkMask(15);
			//   27   55:aload           5
			//   28   57:bipush          15
			//   29   59:invokevirtual   #81  <Method void TextView.setAutoLinkMask(int)>
				textview.setText(((CharSequence) (stringResolver.getMessage())));
			//   30   62:aload           5
			//   31   64:aload_0         
			//   32   65:getfield        #37  <Field DialogStringResolver val$stringResolver>
			//   33   68:invokevirtual   #87  <Method String DialogStringResolver.getMessage()>
			//   34   71:invokevirtual   #91  <Method void TextView.setText(CharSequence)>
				textview.setTextAppearance(((Context) (activity)), 0x1030044);
			//   35   74:aload           5
			//   36   76:aload_0         
			//   37   77:getfield        #33  <Field Activity val$activity>
			//   38   80:ldc1            #92  <Int 0x1030044>
			//   39   82:invokevirtual   #96  <Method void TextView.setTextAppearance(Context, int)>
				textview.setPadding(i, i, i, i);
			//   40   85:aload           5
			//   41   87:iload_2         
			//   42   88:iload_2         
			//   43   89:iload_2         
			//   44   90:iload_2         
			//   45   91:invokevirtual   #100 <Method void TextView.setPadding(int, int, int, int)>
				textview.setFocusable(false);
			//   46   94:aload           5
			//   47   96:iconst_0        
			//   48   97:invokevirtual   #104 <Method void TextView.setFocusable(boolean)>
				ScrollView scrollview = new ScrollView(((Context) (activity)));
			//   49  100:new             #106 <Class ScrollView>
			//   50  103:dup             
			//   51  104:aload_0         
			//   52  105:getfield        #33  <Field Activity val$activity>
			//   53  108:invokespecial   #107 <Method void ScrollView(Context)>
			//   54  111:astore          6
				scrollview.setPadding(CrashlyticsCore.dipsToPixels(f, 14), CrashlyticsCore.dipsToPixels(f, 2), CrashlyticsCore.dipsToPixels(f, 10), CrashlyticsCore.dipsToPixels(f, 12));
			//   55  113:aload           6
			//   56  115:fload_1         
			//   57  116:bipush          14
			//   58  118:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
			//   59  121:fload_1         
			//   60  122:iconst_2        
			//   61  123:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
			//   62  126:fload_1         
			//   63  127:bipush          10
			//   64  129:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
			//   65  132:fload_1         
			//   66  133:bipush          12
			//   67  135:invokestatic    #74  <Method int CrashlyticsCore.access$400(float, int)>
			//   68  138:invokevirtual   #108 <Method void ScrollView.setPadding(int, int, int, int)>
				scrollview.addView(((android.view.View) (textview)));
			//   69  141:aload           6
			//   70  143:aload           5
			//   71  145:invokevirtual   #112 <Method void ScrollView.addView(android.view.View)>
				builder.setView(((android.view.View) (scrollview))).setTitle(((CharSequence) (stringResolver.getTitle()))).setCancelable(false).setNeutralButton(((CharSequence) (stringResolver.getSendButtonTitle())), onclicklistener);
			//   72  148:aload_3         
			//   73  149:aload           6
			//   74  151:invokevirtual   #116 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(android.view.View)>
			//   75  154:aload_0         
			//   76  155:getfield        #37  <Field DialogStringResolver val$stringResolver>
			//   77  158:invokevirtual   #119 <Method String DialogStringResolver.getTitle()>
			//   78  161:invokevirtual   #123 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
			//   79  164:iconst_0        
			//   80  165:invokevirtual   #127 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setCancelable(boolean)>
			//   81  168:aload_0         
			//   82  169:getfield        #37  <Field DialogStringResolver val$stringResolver>
			//   83  172:invokevirtual   #130 <Method String DialogStringResolver.getSendButtonTitle()>
			//   84  175:aload           4
			//   85  177:invokevirtual   #134 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNeutralButton(CharSequence, android.content.DialogInterface$OnClickListener)>
			//   86  180:pop             
				if(promptData.showCancelButton)
			//*  87  181:aload_0         
			//*  88  182:getfield        #39  <Field PromptSettingsData val$promptData>
			//*  89  185:getfield        #140 <Field boolean PromptSettingsData.showCancelButton>
			//*  90  188:ifeq            215
				{
					android.content.DialogInterface.OnClickListener onclicklistener1 = new android.content.DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialoginterface, int i)
						{
							latch.setOptIn(false);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field CrashlyticsCore$7 this$1>
						//    2    4:getfield        #26  <Field CrashlyticsCore$OptInLatch CrashlyticsCore$7.val$latch>
						//    3    7:iconst_0        
						//    4    8:invokevirtual   #32  <Method void CrashlyticsCore$OptInLatch.setOptIn(boolean)>
							dialoginterface.dismiss();
						//    5   11:aload_1         
						//    6   12:invokeinterface #37  <Method void DialogInterface.dismiss()>
						//    7   17:return          
						}

						final _cls7 this$1;

			
			{
				this$1 = _cls7.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CrashlyticsCore$7 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
;
			//   91  191:new             #15  <Class CrashlyticsCore$7$2>
			//   92  194:dup             
			//   93  195:aload_0         
			//   94  196:invokespecial   #141 <Method void CrashlyticsCore$7$2(CrashlyticsCore$7)>
			//   95  199:astore          4
					builder.setNegativeButton(((CharSequence) (stringResolver.getCancelButtonTitle())), onclicklistener1);
			//   96  201:aload_3         
			//   97  202:aload_0         
			//   98  203:getfield        #37  <Field DialogStringResolver val$stringResolver>
			//   99  206:invokevirtual   #144 <Method String DialogStringResolver.getCancelButtonTitle()>
			//  100  209:aload           4
			//  101  211:invokevirtual   #147 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
			//  102  214:pop             
				}
				if(promptData.showAlwaysSendButton)
			//* 103  215:aload_0         
			//* 104  216:getfield        #39  <Field PromptSettingsData val$promptData>
			//* 105  219:getfield        #150 <Field boolean PromptSettingsData.showAlwaysSendButton>
			//* 106  222:ifeq            249
				{
					android.content.DialogInterface.OnClickListener onclicklistener2 = new android.content.DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialoginterface, int i)
						{
							setShouldSendUserReportsWithoutPrompting(true);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field CrashlyticsCore$7 this$1>
						//    2    4:getfield        #26  <Field CrashlyticsCore CrashlyticsCore$7.this$0>
						//    3    7:iconst_1        
						//    4    8:invokevirtual   #32  <Method void CrashlyticsCore.setShouldSendUserReportsWithoutPrompting(boolean)>
							latch.setOptIn(true);
						//    5   11:aload_0         
						//    6   12:getfield        #17  <Field CrashlyticsCore$7 this$1>
						//    7   15:getfield        #36  <Field CrashlyticsCore$OptInLatch CrashlyticsCore$7.val$latch>
						//    8   18:iconst_1        
						//    9   19:invokevirtual   #41  <Method void CrashlyticsCore$OptInLatch.setOptIn(boolean)>
							dialoginterface.dismiss();
						//   10   22:aload_1         
						//   11   23:invokeinterface #46  <Method void DialogInterface.dismiss()>
						//   12   28:return          
						}

						final _cls7 this$1;

			
			{
				this$1 = _cls7.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CrashlyticsCore$7 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
;
			//  107  225:new             #17  <Class CrashlyticsCore$7$3>
			//  108  228:dup             
			//  109  229:aload_0         
			//  110  230:invokespecial   #151 <Method void CrashlyticsCore$7$3(CrashlyticsCore$7)>
			//  111  233:astore          4
					builder.setPositiveButton(((CharSequence) (stringResolver.getAlwaysSendButtonTitle())), onclicklistener2);
			//  112  235:aload_3         
			//  113  236:aload_0         
			//  114  237:getfield        #37  <Field DialogStringResolver val$stringResolver>
			//  115  240:invokevirtual   #154 <Method String DialogStringResolver.getAlwaysSendButtonTitle()>
			//  116  243:aload           4
			//  117  245:invokevirtual   #157 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
			//  118  248:pop             
				}
				builder.show();
			//  119  249:aload_3         
			//  120  250:invokevirtual   #161 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
			//  121  253:pop             
			//  122  254:return          
			}

			final CrashlyticsCore this$0;
			final Activity val$activity;
			final OptInLatch val$latch;
			final PromptSettingsData val$promptData;
			final DialogStringResolver val$stringResolver;

			
			{
				this$0 = CrashlyticsCore.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #31  <Field CrashlyticsCore this$0>
				activity = activity1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #33  <Field Activity val$activity>
				latch = optinlatch;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #35  <Field CrashlyticsCore$OptInLatch val$latch>
				stringResolver = dialogstringresolver;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #37  <Field DialogStringResolver val$stringResolver>
				promptData = promptsettingsdata;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #39  <Field PromptSettingsData val$promptData>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #42  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//   11   20:aload_1         
	//   12   21:new             #19  <Class CrashlyticsCore$7>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:aload           4
	//   17   29:aload_3         
	//   18   30:aload_2         
	//   19   31:invokespecial   #364 <Method void CrashlyticsCore$7(CrashlyticsCore, Activity, CrashlyticsCore$OptInLatch, DialogStringResolver, PromptSettingsData)>
	//   20   34:invokevirtual   #370 <Method void Activity.runOnUiThread(Runnable)>
		Fabric.getLogger().d("CrashlyticsCore", "Waiting for user opt-in.");
	//   21   37:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   22   40:ldc1            #80  <String "CrashlyticsCore">
	//   23   42:ldc2            #372 <String "Waiting for user opt-in.">
	//   24   45:invokeinterface #321 <Method void Logger.d(String, String)>
		latch.await();
	//   25   50:aload           4
	//   26   52:invokevirtual   #375 <Method void CrashlyticsCore$OptInLatch.await()>
		return latch.getOptIn();
	//   27   55:aload           4
	//   28   57:invokevirtual   #378 <Method boolean CrashlyticsCore$OptInLatch.getOptIn()>
	//   29   60:ireturn         
	}

	static SessionSettingsData getSessionSettingsData()
	{
		SettingsData settingsdata = Settings.getInstance().awaitSettingsData();
	//    0    0:invokestatic    #385 <Method Settings Settings.getInstance()>
	//    1    3:invokevirtual   #389 <Method SettingsData Settings.awaitSettingsData()>
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
	//    8   14:getfield        #395 <Field SessionSettingsData SettingsData.sessionData>
	//    9   17:areturn         
	}

	private void installExceptionHandler(UnityVersionProvider unityversionprovider)
	{
		try
		{
			Fabric.getLogger().d("CrashlyticsCore", "Installing exception handler...");
	//    0    0:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//    1    3:ldc1            #80  <String "CrashlyticsCore">
	//    2    5:ldc2            #399 <String "Installing exception handler...">
	//    3    8:invokeinterface #321 <Method void Logger.d(String, String)>
			handler = new CrashlyticsUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler(), executorServiceWrapper, getIdManager(), unityversionprovider, fileStore, this);
	//    4   13:aload_0         
	//    5   14:new             #242 <Class CrashlyticsUncaughtExceptionHandler>
	//    6   17:dup             
	//    7   18:invokestatic    #405 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//    8   21:aload_0         
	//    9   22:getfield        #157 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//   10   25:aload_0         
	//   11   26:invokevirtual   #409 <Method IdManager getIdManager()>
	//   12   29:aload_1         
	//   13   30:aload_0         
	//   14   31:getfield        #411 <Field FileStore fileStore>
	//   15   34:aload_0         
	//   16   35:invokespecial   #414 <Method void CrashlyticsUncaughtExceptionHandler(Thread$UncaughtExceptionHandler, CrashlyticsExecutorServiceWrapper, IdManager, UnityVersionProvider, FileStore, CrashlyticsCore)>
	//   17   38:putfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
			handler.openSession();
	//   18   41:aload_0         
	//   19   42:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   20   45:invokevirtual   #417 <Method void CrashlyticsUncaughtExceptionHandler.openSession()>
			Thread.setDefaultUncaughtExceptionHandler(((Thread.UncaughtExceptionHandler) (handler)));
	//   21   48:aload_0         
	//   22   49:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   23   52:invokestatic    #421 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
			Fabric.getLogger().d("CrashlyticsCore", "Successfully installed exception handler.");
	//   24   55:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   25   58:ldc1            #80  <String "CrashlyticsCore">
	//   26   60:ldc2            #423 <String "Successfully installed exception handler.">
	//   27   63:invokeinterface #321 <Method void Logger.d(String, String)>
			return;
	//   28   68:return          
		}
		// Misplaced declaration of an exception variable
		catch(UnityVersionProvider unityversionprovider)
	//*  29   69:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "There was a problem installing the exception handler.", ((Throwable) (unityversionprovider)));
	//   30   70:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   31   73:ldc1            #80  <String "CrashlyticsCore">
	//   32   75:ldc2            #425 <String "There was a problem installing the exception handler.">
	//   33   78:aload_1         
	//   34   79:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
		}
	//   35   84:return          
	}

	private static boolean isRequiringBuildId(Context context)
	{
		return CommonUtils.getBooleanResourceValue(context, "com.crashlytics.RequireBuildId", true);
	//    0    0:aload_0         
	//    1    1:ldc1            #56  <String "com.crashlytics.RequireBuildId">
	//    2    3:iconst_1        
	//    3    4:invokestatic    #431 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//    4    7:ireturn         
	}

	static void recordFatalExceptionEvent(String s)
	{
		Answers answers = (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
	//    0    0:ldc2            #435 <Class Answers>
	//    1    3:invokestatic    #355 <Method Kit Fabric.getKit(Class)>
	//    2    6:checkcast       #435 <Class Answers>
	//    3    9:astore_1        
		if(answers != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          26
			answers.onException(new io.fabric.sdk.android.services.common.Crash.FatalException(s));
	//    6   14:aload_1         
	//    7   15:new             #437 <Class io.fabric.sdk.android.services.common.Crash$FatalException>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #439 <Method void io.fabric.sdk.android.services.common.Crash$FatalException(String)>
	//   11   23:invokevirtual   #443 <Method void Answers.onException(io.fabric.sdk.android.services.common.Crash$FatalException)>
	//   12   26:return          
	}

	static void recordLoggedExceptionEvent(String s)
	{
		Answers answers = (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
	//    0    0:ldc2            #435 <Class Answers>
	//    1    3:invokestatic    #355 <Method Kit Fabric.getKit(Class)>
	//    2    6:checkcast       #435 <Class Answers>
	//    3    9:astore_1        
		if(answers != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          26
			answers.onException(new io.fabric.sdk.android.services.common.Crash.LoggedException(s));
	//    6   14:aload_1         
	//    7   15:new             #446 <Class io.fabric.sdk.android.services.common.Crash$LoggedException>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #447 <Method void io.fabric.sdk.android.services.common.Crash$LoggedException(String)>
	//   11   23:invokevirtual   #450 <Method void Answers.onException(io.fabric.sdk.android.services.common.Crash$LoggedException)>
	//   12   26:return          
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
	//    5    7:invokevirtual   #457 <Method String String.trim()>
	//    6   10:astore_0        
			s1 = s;
	//    7   11:aload_0         
	//    8   12:astore_1        
			if(s.length() > 1024)
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #461 <Method int String.length()>
	//*  11   17:sipush          1024
	//*  12   20:icmple          32
				s1 = s.substring(0, 1024);
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:sipush          1024
	//   16   28:invokevirtual   #465 <Method String String.substring(int, int)>
	//   17   31:astore_1        
		}
		return s1;
	//   18   32:aload_1         
	//   19   33:areturn         
	}

	private void setAndValidateKitProperties(Context context, String s)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		Object obj;
		if(pinningInfo != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field PinningInfoProvider pinningInfo>
	//*   2    4:ifnull          22
			obj = ((Object) (new CrashlyticsPinningInfoProvider(pinningInfo)));
	//    3    7:new             #471 <Class CrashlyticsPinningInfoProvider>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #148 <Field PinningInfoProvider pinningInfo>
	//    7   15:invokespecial   #474 <Method void CrashlyticsPinningInfoProvider(PinningInfoProvider)>
	//    8   18:astore_3        
		else
	//*   9   19:goto            24
			obj = null;
	//   10   22:aconst_null     
	//   11   23:astore_3        
		httpRequestFactory = ((HttpRequestFactory) (new DefaultHttpRequestFactory(Fabric.getLogger())));
	//   12   24:aload_0         
	//   13   25:new             #476 <Class DefaultHttpRequestFactory>
	//   14   28:dup             
	//   15   29:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   16   32:invokespecial   #479 <Method void DefaultHttpRequestFactory(Logger)>
	//   17   35:putfield        #481 <Field HttpRequestFactory httpRequestFactory>
		httpRequestFactory.setPinningInfoProvider(((io.fabric.sdk.android.services.network.PinningInfoProvider) (obj)));
	//   18   38:aload_0         
	//   19   39:getfield        #481 <Field HttpRequestFactory httpRequestFactory>
	//   20   42:aload_3         
	//   21   43:invokeinterface #487 <Method void HttpRequestFactory.setPinningInfoProvider(io.fabric.sdk.android.services.network.PinningInfoProvider)>
		packageName = context.getPackageName();
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:invokevirtual   #492 <Method String Context.getPackageName()>
	//   25   53:putfield        #494 <Field String packageName>
		installerPackageName = getIdManager().getInstallerPackageName();
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:invokevirtual   #409 <Method IdManager getIdManager()>
	//   29   61:invokevirtual   #499 <Method String IdManager.getInstallerPackageName()>
	//   30   64:putfield        #501 <Field String installerPackageName>
		obj = ((Object) (Fabric.getLogger()));
	//   31   67:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   32   70:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   33   71:new             #252 <Class StringBuilder>
	//   34   74:dup             
	//   35   75:invokespecial   #253 <Method void StringBuilder()>
	//   36   78:astore          4
		stringbuilder.append("Installer package name is: ");
	//   37   80:aload           4
	//   38   82:ldc2            #503 <String "Installer package name is: ">
	//   39   85:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   40   88:pop             
		stringbuilder.append(installerPackageName);
	//   41   89:aload           4
	//   42   91:aload_0         
	//   43   92:getfield        #501 <Field String installerPackageName>
	//   44   95:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
		((Logger) (obj)).d("CrashlyticsCore", stringbuilder.toString());
	//   46   99:aload_3         
	//   47  100:ldc1            #80  <String "CrashlyticsCore">
	//   48  102:aload           4
	//   49  104:invokevirtual   #263 <Method String StringBuilder.toString()>
	//   50  107:invokeinterface #321 <Method void Logger.d(String, String)>
		obj = ((Object) (context.getPackageManager().getPackageInfo(packageName, 0)));
	//   51  112:aload_1         
	//   52  113:invokevirtual   #507 <Method PackageManager Context.getPackageManager()>
	//   53  116:aload_0         
	//   54  117:getfield        #494 <Field String packageName>
	//   55  120:iconst_0        
	//   56  121:invokevirtual   #513 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   57  124:astore_3        
		versionCode = Integer.toString(((PackageInfo) (obj)).versionCode);
	//   58  125:aload_0         
	//   59  126:aload_3         
	//   60  127:getfield        #517 <Field int PackageInfo.versionCode>
	//   61  130:invokestatic    #521 <Method String Integer.toString(int)>
	//   62  133:putfield        #523 <Field String versionCode>
		if(((PackageInfo) (obj)).versionName == null)
	//*  63  136:aload_3         
	//*  64  137:getfield        #525 <Field String PackageInfo.versionName>
	//*  65  140:ifnonnull       150
			obj = "0.0";
	//   66  143:ldc2            #527 <String "0.0">
	//   67  146:astore_3        
		else
	//*  68  147:goto            155
			obj = ((Object) (((PackageInfo) (obj)).versionName));
	//   69  150:aload_3         
	//   70  151:getfield        #525 <Field String PackageInfo.versionName>
	//   71  154:astore_3        
		versionName = ((String) (obj));
	//   72  155:aload_0         
	//   73  156:aload_3         
	//   74  157:putfield        #528 <Field String versionName>
		buildId = CommonUtils.resolveBuildId(context);
	//   75  160:aload_0         
	//   76  161:aload_1         
	//   77  162:invokestatic    #532 <Method String CommonUtils.resolveBuildId(Context)>
	//   78  165:putfield        #534 <Field String buildId>
		getBuildIdValidator(buildId, isRequiringBuildId(context)).validate(s, packageName);
	//   79  168:aload_0         
	//   80  169:aload_0         
	//   81  170:getfield        #534 <Field String buildId>
	//   82  173:aload_1         
	//   83  174:invokestatic    #536 <Method boolean isRequiringBuildId(Context)>
	//   84  177:invokevirtual   #540 <Method BuildIdValidator getBuildIdValidator(String, boolean)>
	//   85  180:aload_2         
	//   86  181:aload_0         
	//   87  182:getfield        #494 <Field String packageName>
	//   88  185:invokevirtual   #545 <Method void BuildIdValidator.validate(String, String)>
	//   89  188:return          
	}

	boolean canSendWithUserApproval()
	{
		return ((Boolean)Settings.getInstance().withSettings(new io.fabric.sdk.android.services.settings.Settings.SettingsAccess() {

			public Boolean usingSettings(SettingsData settingsdata)
			{
				Activity activity = getFabric().getCurrentActivity();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
			//    2    4:invokevirtual   #28  <Method Fabric CrashlyticsCore.getFabric()>
			//    3    7:invokevirtual   #34  <Method Activity Fabric.getCurrentActivity()>
			//    4   10:astore_3        
				boolean flag;
				if(activity != null && !activity.isFinishing() && shouldPromptUserBeforeSendingCrashReports())
			//*   5   11:aload_3         
			//*   6   12:ifnull          48
			//*   7   15:aload_3         
			//*   8   16:invokevirtual   #39  <Method boolean Activity.isFinishing()>
			//*   9   19:ifne            48
			//*  10   22:aload_0         
			//*  11   23:getfield        #18  <Field CrashlyticsCore this$0>
			//*  12   26:invokevirtual   #42  <Method boolean CrashlyticsCore.shouldPromptUserBeforeSendingCrashReports()>
			//*  13   29:ifeq            48
					flag = getSendDecisionFromUser(activity, settingsdata.promptData);
			//   14   32:aload_0         
			//   15   33:getfield        #18  <Field CrashlyticsCore this$0>
			//   16   36:aload_3         
			//   17   37:aload_1         
			//   18   38:getfield        #48  <Field PromptSettingsData SettingsData.promptData>
			//   19   41:invokestatic    #52  <Method boolean CrashlyticsCore.access$200(CrashlyticsCore, Activity, PromptSettingsData)>
			//   20   44:istore_2        
				else
			//*  21   45:goto            50
					flag = true;
			//   22   48:iconst_1        
			//   23   49:istore_2        
				return Boolean.valueOf(flag);
			//   24   50:iload_2         
			//   25   51:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
			//   26   54:areturn         
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
	//    0    0:invokestatic    #385 <Method Settings Settings.getInstance()>
	//    1    3:new             #17  <Class CrashlyticsCore$6>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #548 <Method void CrashlyticsCore$6(CrashlyticsCore)>
	//    5   11:iconst_1        
	//    6   12:invokestatic    #552 <Method Boolean Boolean.valueOf(boolean)>
	//    7   15:invokevirtual   #556 <Method Object Settings.withSettings(io.fabric.sdk.android.services.settings.Settings$SettingsAccess, Object)>
	//    8   18:checkcast       #199 <Class Boolean>
	//    9   21:invokevirtual   #559 <Method boolean Boolean.booleanValue()>
	//   10   24:ireturn         
	}

	public void crash()
	{
		(new CrashTest()).indexOutOfBounds();
	//    0    0:new             #562 <Class CrashTest>
	//    1    3:dup             
	//    2    4:invokespecial   #563 <Method void CrashTest()>
	//    3    7:invokevirtual   #566 <Method void CrashTest.indexOutOfBounds()>
	//    4   10:return          
	}

	void createCrashMarker()
	{
		crashMarker.create();
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field CrashlyticsFileMarker crashMarker>
	//    2    4:invokevirtual   #572 <Method boolean CrashlyticsFileMarker.create()>
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
	//    1    1:getfield        #157 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #13  <Class CrashlyticsCore$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #574 <Method void CrashlyticsCore$4(CrashlyticsCore)>
	//    6   12:invokevirtual   #197 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//    7   15:checkcast       #199 <Class Boolean>
	//    8   18:invokevirtual   #559 <Method boolean Boolean.booleanValue()>
	//    9   21:ireturn         
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #578 <Method Void doInBackground()>
	//    2    4:areturn         
	}

	protected Void doInBackground()
	{
		markInitializationStarted();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #581 <Method void markInitializationStarted()>
		handler.cleanInvalidTempFiles();
	//    2    4:aload_0         
	//    3    5:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//    4    8:invokevirtual   #584 <Method void CrashlyticsUncaughtExceptionHandler.cleanInvalidTempFiles()>
		Object obj = ((Object) (Settings.getInstance().awaitSettingsData()));
	//    5   11:invokestatic    #385 <Method Settings Settings.getInstance()>
	//    6   14:invokevirtual   #389 <Method SettingsData Settings.awaitSettingsData()>
	//    7   17:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_41;
	//    8   18:aload_1         
	//    9   19:ifnonnull       41
		Fabric.getLogger().w("CrashlyticsCore", "Received null settings, skipping initialization!");
	//   10   22:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   11   25:ldc1            #80  <String "CrashlyticsCore">
	//   12   27:ldc2            #586 <String "Received null settings, skipping initialization!">
	//   13   30:invokeinterface #589 <Method void Logger.w(String, String)>
		markInitializationComplete();
	//   14   35:aload_0         
	//   15   36:invokevirtual   #592 <Method void markInitializationComplete()>
		return null;
	//   16   39:aconst_null     
	//   17   40:areturn         
		if(((SettingsData) (obj)).featuresData.collectReports)
			break MISSING_BLOCK_LABEL_70;
	//   18   41:aload_1         
	//   19   42:getfield        #596 <Field FeaturesSettingsData SettingsData.featuresData>
	//   20   45:getfield        #601 <Field boolean FeaturesSettingsData.collectReports>
	//   21   48:ifne            70
		Fabric.getLogger().d("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
	//   22   51:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   23   54:ldc1            #80  <String "CrashlyticsCore">
	//   24   56:ldc2            #603 <String "Collection of crash reports disabled in Crashlytics settings.">
	//   25   59:invokeinterface #321 <Method void Logger.d(String, String)>
		markInitializationComplete();
	//   26   64:aload_0         
	//   27   65:invokevirtual   #592 <Method void markInitializationComplete()>
		return null;
	//   28   68:aconst_null     
	//   29   69:areturn         
		handler.finalizeSessions();
	//   30   70:aload_0         
	//   31   71:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   32   74:invokevirtual   #606 <Method boolean CrashlyticsUncaughtExceptionHandler.finalizeSessions()>
	//   33   77:pop             
		obj = ((Object) (getCreateReportSpiCall(((SettingsData) (obj)))));
	//   34   78:aload_0         
	//   35   79:aload_1         
	//   36   80:invokevirtual   #610 <Method CreateReportSpiCall getCreateReportSpiCall(SettingsData)>
	//   37   83:astore_1        
		if(obj != null)
			break MISSING_BLOCK_LABEL_107;
	//   38   84:aload_1         
	//   39   85:ifnonnull       107
		Fabric.getLogger().w("CrashlyticsCore", "Unable to create a call to upload reports.");
	//   40   88:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   41   91:ldc1            #80  <String "CrashlyticsCore">
	//   42   93:ldc2            #612 <String "Unable to create a call to upload reports.">
	//   43   96:invokeinterface #589 <Method void Logger.w(String, String)>
		markInitializationComplete();
	//   44  101:aload_0         
	//   45  102:invokevirtual   #592 <Method void markInitializationComplete()>
		return null;
	//   46  105:aconst_null     
	//   47  106:areturn         
		Object obj1;
		try
		{
			(new ReportUploader(((CreateReportSpiCall) (obj)))).uploadReports(delay);
	//   48  107:new             #614 <Class ReportUploader>
	//   49  110:dup             
	//   50  111:aload_1         
	//   51  112:invokespecial   #617 <Method void ReportUploader(CreateReportSpiCall)>
	//   52  115:aload_0         
	//   53  116:getfield        #141 <Field float delay>
	//   54  119:invokevirtual   #621 <Method void ReportUploader.uploadReports(float)>
			break MISSING_BLOCK_LABEL_144;
	//   55  122:goto            144
		}
	//*  56  125:astore_1        
	//*  57  126:goto            150
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
	//   58  129:astore_1        
		break MISSING_BLOCK_LABEL_130;
		obj1;
		break MISSING_BLOCK_LABEL_150;
		Fabric.getLogger().e("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", ((Throwable) (obj1)));
	//   59  130:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   60  133:ldc1            #80  <String "CrashlyticsCore">
	//   61  135:ldc2            #623 <String "Crashlytics encountered a problem during asynchronous initialization.">
	//   62  138:aload_1         
	//   63  139:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
		markInitializationComplete();
	//   64  144:aload_0         
	//   65  145:invokevirtual   #592 <Method void markInitializationComplete()>
		return null;
	//   66  148:aconst_null     
	//   67  149:areturn         
		markInitializationComplete();
	//   68  150:aload_0         
	//   69  151:invokevirtual   #592 <Method void markInitializationComplete()>
		throw obj1;
	//   70  154:aload_1         
	//   71  155:athrow          
	}

	String getApiKey()
	{
		return apiKey;
	//    0    0:aload_0         
	//    1    1:getfield        #626 <Field String apiKey>
	//    2    4:areturn         
	}

	Map getAttributes()
	{
		return Collections.unmodifiableMap(((Map) (attributes)));
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field ConcurrentHashMap attributes>
	//    2    4:invokestatic    #634 <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	String getBuildId()
	{
		return buildId;
	//    0    0:aload_0         
	//    1    1:getfield        #534 <Field String buildId>
	//    2    4:areturn         
	}

	BuildIdValidator getBuildIdValidator(String s, boolean flag)
	{
		return new BuildIdValidator(s, flag);
	//    0    0:new             #542 <Class BuildIdValidator>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #640 <Method void BuildIdValidator(String, boolean)>
	//    5    9:areturn         
	}

	CreateReportSpiCall getCreateReportSpiCall(SettingsData settingsdata)
	{
		if(settingsdata != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
			return ((CreateReportSpiCall) (new DefaultCreateReportSpiCall(((Kit) (this)), getOverridenSpiEndpoint(), settingsdata.appData.reportsUrl, httpRequestFactory)));
	//    2    4:new             #642 <Class DefaultCreateReportSpiCall>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #645 <Method String getOverridenSpiEndpoint()>
	//    7   13:aload_1         
	//    8   14:getfield        #649 <Field AppSettingsData SettingsData.appData>
	//    9   17:getfield        #654 <Field String AppSettingsData.reportsUrl>
	//   10   20:aload_0         
	//   11   21:getfield        #481 <Field HttpRequestFactory httpRequestFactory>
	//   12   24:invokespecial   #657 <Method void DefaultCreateReportSpiCall(Kit, String, String, HttpRequestFactory)>
	//   13   27:areturn         
		else
			return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	SessionEventData getExternalCrashEventData()
	{
		if(externalCrashEventDataProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #661 <Field CrashEventDataProvider externalCrashEventDataProvider>
	//*   2    4:ifnull          17
			return externalCrashEventDataProvider.getCrashEventData();
	//    3    7:aload_0         
	//    4    8:getfield        #661 <Field CrashEventDataProvider externalCrashEventDataProvider>
	//    5   11:invokeinterface #666 <Method SessionEventData CrashEventDataProvider.getCrashEventData()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	CrashlyticsUncaughtExceptionHandler getHandler()
	{
		return handler;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android.crashlytics-core";
	//    0    0:ldc2            #671 <String "com.crashlytics.sdk.android.crashlytics-core">
	//    1    3:areturn         
	}

	String getInstallerPackageName()
	{
		return installerPackageName;
	//    0    0:aload_0         
	//    1    1:getfield        #501 <Field String installerPackageName>
	//    2    4:areturn         
	}

	String getOverridenSpiEndpoint()
	{
		return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #675 <Method Context getContext()>
	//    2    4:ldc1            #53  <String "com.crashlytics.ApiEndpoint">
	//    3    6:invokestatic    #679 <Method String CommonUtils.getStringsFileValue(Context, String)>
	//    4    9:areturn         
	}

	String getPackageName()
	{
		return packageName;
	//    0    0:aload_0         
	//    1    1:getfield        #494 <Field String packageName>
	//    2    4:areturn         
	}

	public PinningInfoProvider getPinningInfoProvider()
	{
		if(!disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field boolean disabled>
	//*   2    4:ifne            12
			return pinningInfo;
	//    3    7:aload_0         
	//    4    8:getfield        #148 <Field PinningInfoProvider pinningInfo>
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
	//*   1    1:getfield        #685 <Field File sdkDir>
	//*   2    4:ifnonnull       22
			sdkDir = (new FileStoreImpl(((Kit) (this)))).getFilesDir();
	//    3    7:aload_0         
	//    4    8:new             #687 <Class FileStoreImpl>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #690 <Method void FileStoreImpl(Kit)>
	//    8   16:invokevirtual   #693 <Method File FileStoreImpl.getFilesDir()>
	//    9   19:putfield        #685 <Field File sdkDir>
		return sdkDir;
	//   10   22:aload_0         
	//   11   23:getfield        #685 <Field File sdkDir>
	//   12   26:areturn         
	}

	String getUserEmail()
	{
		if(getIdManager().canCollectUserIds())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #409 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #697 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userEmail;
	//    4   10:aload_0         
	//    5   11:getfield        #137 <Field String userEmail>
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
	//*   1    1:invokevirtual   #409 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #697 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userId;
	//    4   10:aload_0         
	//    5   11:getfield        #135 <Field String userId>
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
	//*   1    1:invokevirtual   #409 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #697 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userName;
	//    4   10:aload_0         
	//    5   11:getfield        #139 <Field String userName>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public String getVersion()
	{
		return "2.3.8.97";
	//    0    0:ldc2            #702 <String "2.3.8.97">
	//    1    3:areturn         
	}

	String getVersionCode()
	{
		return versionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #523 <Field String versionCode>
	//    2    4:areturn         
	}

	String getVersionName()
	{
		return versionName;
	//    0    0:aload_0         
	//    1    1:getfield        #528 <Field String versionName>
	//    2    4:areturn         
	}

	boolean internalVerifyPinning(URL url)
	{
		if(getPinningInfoProvider() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #708 <Method PinningInfoProvider getPinningInfoProvider()>
	//*   2    4:ifnull          42
		{
			url = ((URL) (httpRequestFactory.buildHttpRequest(HttpMethod.GET, url.toString())));
	//    3    7:aload_0         
	//    4    8:getfield        #481 <Field HttpRequestFactory httpRequestFactory>
	//    5   11:getstatic       #714 <Field HttpMethod HttpMethod.GET>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #717 <Method String URL.toString()>
	//    8   18:invokeinterface #721 <Method HttpRequest HttpRequestFactory.buildHttpRequest(HttpMethod, String)>
	//    9   23:astore_1        
			((HttpsURLConnection)((HttpRequest) (url)).getConnection()).setInstanceFollowRedirects(false);
	//   10   24:aload_1         
	//   11   25:invokevirtual   #727 <Method java.net.HttpURLConnection HttpRequest.getConnection()>
	//   12   28:checkcast       #729 <Class HttpsURLConnection>
	//   13   31:iconst_0        
	//   14   32:invokevirtual   #733 <Method void HttpsURLConnection.setInstanceFollowRedirects(boolean)>
			((HttpRequest) (url)).code();
	//   15   35:aload_1         
	//   16   36:invokevirtual   #736 <Method int HttpRequest.code()>
	//   17   39:pop             
			return true;
	//   18   40:iconst_1        
	//   19   41:ireturn         
		} else
		{
			return false;
	//   20   42:iconst_0        
	//   21   43:ireturn         
		}
	}

	public void log(int i, String s, String s1)
	{
		doLog(i, s, s1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #739 <Method void doLog(int, String, String)>
		Logger logger = Fabric.getLogger();
	//    5    7:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//    6   10:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    7   12:new             #252 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #253 <Method void StringBuilder()>
	//   10   19:astore          5
		stringbuilder.append("");
	//   11   21:aload           5
	//   12   23:ldc2            #741 <String "">
	//   13   26:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(s);
	//   15   30:aload           5
	//   16   32:aload_2         
	//   17   33:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		s = stringbuilder.toString();
	//   19   37:aload           5
	//   20   39:invokevirtual   #263 <Method String StringBuilder.toString()>
	//   21   42:astore_2        
		stringbuilder = new StringBuilder();
	//   22   43:new             #252 <Class StringBuilder>
	//   23   46:dup             
	//   24   47:invokespecial   #253 <Method void StringBuilder()>
	//   25   50:astore          5
		stringbuilder.append("");
	//   26   52:aload           5
	//   27   54:ldc2            #741 <String "">
	//   28   57:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		stringbuilder.append(s1);
	//   30   61:aload           5
	//   31   63:aload_3         
	//   32   64:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
		logger.log(i, s, stringbuilder.toString(), true);
	//   34   68:aload           4
	//   35   70:iload_1         
	//   36   71:aload_2         
	//   37   72:aload           5
	//   38   74:invokevirtual   #263 <Method String StringBuilder.toString()>
	//   39   77:iconst_1        
	//   40   78:invokeinterface #744 <Method void Logger.log(int, String, String, boolean)>
	//   41   83:return          
	}

	public void log(String s)
	{
		doLog(3, "CrashlyticsCore", s);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:ldc1            #80  <String "CrashlyticsCore">
	//    3    4:aload_1         
	//    4    5:invokespecial   #739 <Method void doLog(int, String, String)>
	//    5    8:return          
	}

	public void logException(Throwable throwable)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to logging exceptions."))
	//*   4    8:ldc2            #748 <String "prior to logging exceptions.">
	//*   5   11:invokestatic    #234 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
			return;
	//    7   17:return          
		if(throwable == null)
	//*   8   18:aload_1         
	//*   9   19:ifnonnull       37
		{
			Fabric.getLogger().log(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
	//   10   22:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   11   25:iconst_5        
	//   12   26:ldc1            #80  <String "CrashlyticsCore">
	//   13   28:ldc2            #750 <String "Crashlytics is ignoring a request to log a null exception.">
	//   14   31:invokeinterface #752 <Method void Logger.log(int, String, String)>
			return;
	//   15   36:return          
		} else
		{
			handler.writeNonFatalException(Thread.currentThread(), throwable);
	//   16   37:aload_0         
	//   17   38:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   18   41:invokestatic    #756 <Method Thread Thread.currentThread()>
	//   19   44:aload_1         
	//   20   45:invokevirtual   #760 <Method void CrashlyticsUncaughtExceptionHandler.writeNonFatalException(Thread, Throwable)>
			return;
	//   21   48:return          
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
					Logger logger = Fabric.getLogger();
			//    5   11:invokestatic    #41  <Method Logger Fabric.getLogger()>
			//    6   14:astore_2        
					StringBuilder stringbuilder = new StringBuilder();
			//    7   15:new             #43  <Class StringBuilder>
			//    8   18:dup             
			//    9   19:invokespecial   #44  <Method void StringBuilder()>
			//   10   22:astore_3        
					stringbuilder.append("Initialization marker file removed: ");
			//   11   23:aload_3         
			//   12   24:ldc1            #46  <String "Initialization marker file removed: ">
			//   13   26:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
			//   14   29:pop             
					stringbuilder.append(flag);
			//   15   30:aload_3         
			//   16   31:iload_1         
			//   17   32:invokevirtual   #53  <Method StringBuilder StringBuilder.append(boolean)>
			//   18   35:pop             
					logger.d("CrashlyticsCore", stringbuilder.toString());
			//   19   36:aload_2         
			//   20   37:ldc1            #55  <String "CrashlyticsCore">
			//   21   39:aload_3         
			//   22   40:invokevirtual   #59  <Method String StringBuilder.toString()>
			//   23   43:invokeinterface #65  <Method void Logger.d(String, String)>
				}
			//*  24   48:iload_1         
			//*  25   49:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
			//*  26   52:areturn         
				catch(Exception exception)
			//*  27   53:astore_2        
				{
					Fabric.getLogger().e("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", ((Throwable) (exception)));
			//   28   54:invokestatic    #41  <Method Logger Fabric.getLogger()>
			//   29   57:ldc1            #55  <String "CrashlyticsCore">
			//   30   59:ldc1            #73  <String "Problem encountered deleting Crashlytics initialization marker.">
			//   31   61:aload_2         
			//   32   62:invokeinterface #77  <Method void Logger.e(String, String, Throwable)>
					return Boolean.valueOf(false);
			//   33   67:iconst_0        
			//   34   68:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
			//   35   71:areturn         
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
	//    1    1:getfield        #157 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #11  <Class CrashlyticsCore$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #761 <Method void CrashlyticsCore$3(CrashlyticsCore)>
	//    6   12:invokevirtual   #764 <Method Future CrashlyticsExecutorServiceWrapper.executeAsync(Callable)>
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
	//    1    1:getfield        #157 <Field CrashlyticsExecutorServiceWrapper executorServiceWrapper>
	//    2    4:new             #9   <Class CrashlyticsCore$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #765 <Method void CrashlyticsCore$2(CrashlyticsCore)>
	//    6   12:invokevirtual   #197 <Method Object CrashlyticsExecutorServiceWrapper.executeSyncLoggingException(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected boolean onPreExecute()
	{
		return onPreExecute(super.getContext());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #767 <Method Context Kit.getContext()>
	//    3    5:invokevirtual   #769 <Method boolean onPreExecute(Context)>
	//    4    8:ireturn         
	}

	boolean onPreExecute(Context context)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field boolean disabled>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		apiKey = (new ApiKey()).getValue(context);
	//    5    9:aload_0         
	//    6   10:new             #773 <Class ApiKey>
	//    7   13:dup             
	//    8   14:invokespecial   #774 <Method void ApiKey()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #777 <Method String ApiKey.getValue(Context)>
	//   11   21:putfield        #626 <Field String apiKey>
		if(apiKey == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #626 <Field String apiKey>
	//*  14   28:ifnonnull       33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		Logger logger = Fabric.getLogger();
	//   17   33:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   18   36:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   19   37:new             #252 <Class StringBuilder>
	//   20   40:dup             
	//   21   41:invokespecial   #253 <Method void StringBuilder()>
	//   22   44:astore          4
		stringbuilder.append("Initializing Crashlytics ");
	//   23   46:aload           4
	//   24   48:ldc2            #779 <String "Initializing Crashlytics ">
	//   25   51:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		stringbuilder.append(getVersion());
	//   27   55:aload           4
	//   28   57:aload_0         
	//   29   58:invokevirtual   #781 <Method String getVersion()>
	//   30   61:invokevirtual   #259 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		logger.i("CrashlyticsCore", stringbuilder.toString());
	//   32   65:aload_3         
	//   33   66:ldc1            #80  <String "CrashlyticsCore">
	//   34   68:aload           4
	//   35   70:invokevirtual   #263 <Method String StringBuilder.toString()>
	//   36   73:invokeinterface #784 <Method void Logger.i(String, String)>
		fileStore = ((FileStore) (new FileStoreImpl(((Kit) (this)))));
	//   37   78:aload_0         
	//   38   79:new             #687 <Class FileStoreImpl>
	//   39   82:dup             
	//   40   83:aload_0         
	//   41   84:invokespecial   #690 <Method void FileStoreImpl(Kit)>
	//   42   87:putfield        #411 <Field FileStore fileStore>
		crashMarker = new CrashlyticsFileMarker("crash_marker", fileStore);
	//   43   90:aload_0         
	//   44   91:new             #569 <Class CrashlyticsFileMarker>
	//   45   94:dup             
	//   46   95:ldc1            #62  <String "crash_marker">
	//   47   97:aload_0         
	//   48   98:getfield        #411 <Field FileStore fileStore>
	//   49  101:invokespecial   #787 <Method void CrashlyticsFileMarker(String, FileStore)>
	//   50  104:putfield        #190 <Field CrashlyticsFileMarker crashMarker>
		initializationMarker = new CrashlyticsFileMarker("initialization_marker", fileStore);
	//   51  107:aload_0         
	//   52  108:new             #569 <Class CrashlyticsFileMarker>
	//   53  111:dup             
	//   54  112:ldc1            #68  <String "initialization_marker">
	//   55  114:aload_0         
	//   56  115:getfield        #411 <Field FileStore fileStore>
	//   57  118:invokespecial   #787 <Method void CrashlyticsFileMarker(String, FileStore)>
	//   58  121:putfield        #174 <Field CrashlyticsFileMarker initializationMarker>
		boolean flag;
		try
		{
			setAndValidateKitProperties(context, apiKey);
	//   59  124:aload_0         
	//   60  125:aload_1         
	//   61  126:aload_0         
	//   62  127:getfield        #626 <Field String apiKey>
	//   63  130:invokespecial   #789 <Method void setAndValidateKitProperties(Context, String)>
			ManifestUnityVersionProvider manifestunityversionprovider = new ManifestUnityVersionProvider(context, getPackageName());
	//   64  133:new             #791 <Class ManifestUnityVersionProvider>
	//   65  136:dup             
	//   66  137:aload_1         
	//   67  138:aload_0         
	//   68  139:invokevirtual   #792 <Method String getPackageName()>
	//   69  142:invokespecial   #794 <Method void ManifestUnityVersionProvider(Context, String)>
	//   70  145:astore_3        
			flag = didPreviousInitializationFail();
	//   71  146:aload_0         
	//   72  147:invokevirtual   #796 <Method boolean didPreviousInitializationFail()>
	//   73  150:istore_2        
			checkForPreviousCrash();
	//   74  151:aload_0         
	//   75  152:invokespecial   #798 <Method void checkForPreviousCrash()>
			installExceptionHandler(((UnityVersionProvider) (manifestunityversionprovider)));
	//   76  155:aload_0         
	//   77  156:aload_3         
	//   78  157:invokespecial   #800 <Method void installExceptionHandler(UnityVersionProvider)>
		}
	//*  79  160:iload_2         
	//*  80  161:ifeq            177
	//*  81  164:aload_1         
	//*  82  165:invokestatic    #803 <Method boolean CommonUtils.canTryConnection(Context)>
	//*  83  168:ifeq            177
	//*  84  171:aload_0         
	//*  85  172:invokespecial   #805 <Method void finishInitSynchronously()>
	//*  86  175:iconst_0        
	//*  87  176:ireturn         
	//*  88  177:iconst_1        
	//*  89  178:ireturn         
	//*  90  179:astore_1        
	//*  91  180:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//*  92  183:ldc1            #80  <String "CrashlyticsCore">
	//*  93  185:ldc2            #807 <String "Crashlytics was not started due to an exception during initialization">
	//*  94  188:aload_1         
	//*  95  189:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
	//*  96  194:iconst_0        
	//*  97  195:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  98  196:astore_1        
		{
			throw new UnmetDependencyException(((Throwable) (context)));
	//   99  197:new             #809 <Class UnmetDependencyException>
	//  100  200:dup             
	//  101  201:aload_1         
	//  102  202:invokespecial   #811 <Method void UnmetDependencyException(Throwable)>
	//  103  205:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Fabric.getLogger().e("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", ((Throwable) (context)));
			return false;
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_177;
		if(!CommonUtils.canTryConnection(context))
			break MISSING_BLOCK_LABEL_177;
		finishInitSynchronously();
		return false;
		return true;
	}

	public void setBool(String s, boolean flag)
	{
		setString(s, Boolean.toString(flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #815 <Method String Boolean.toString(boolean)>
	//    4    6:invokevirtual   #818 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setDouble(String s, double d)
	{
		setString(s, Double.toString(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #825 <Method String Double.toString(double)>
	//    4    6:invokevirtual   #818 <Method void setString(String, String)>
	//    5    9:return          
	}

	void setExternalCrashEventDataProvider(CrashEventDataProvider crasheventdataprovider)
	{
		externalCrashEventDataProvider = crasheventdataprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #661 <Field CrashEventDataProvider externalCrashEventDataProvider>
	//    3    5:return          
	}

	public void setFloat(String s, float f)
	{
		setString(s, Float.toString(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #834 <Method String Float.toString(float)>
	//    4    6:invokevirtual   #818 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setInt(String s, int i)
	{
		setString(s, Integer.toString(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #521 <Method String Integer.toString(int)>
	//    4    6:invokevirtual   #818 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setListener(CrashlyticsListener crashlyticslistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Fabric.getLogger().w("CrashlyticsCore", "Use of setListener is deprecated.");
	//    2    2:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//    3    5:ldc1            #80  <String "CrashlyticsCore">
	//    4    7:ldc2            #841 <String "Use of setListener is deprecated.">
	//    5   10:invokeinterface #589 <Method void Logger.w(String, String)>
		if(crashlyticslistener != null)
			break MISSING_BLOCK_LABEL_30;
	//    6   15:aload_1         
	//    7   16:ifnonnull       30
		throw new IllegalArgumentException("listener must not be null.");
	//    8   19:new             #843 <Class IllegalArgumentException>
	//    9   22:dup             
	//   10   23:ldc2            #845 <String "listener must not be null.">
	//   11   26:invokespecial   #846 <Method void IllegalArgumentException(String)>
	//   12   29:athrow          
		listener = crashlyticslistener;
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:putfield        #146 <Field CrashlyticsListener listener>
		this;
	//   16   35:aload_0         
		JVM INSTR monitorexit ;
	//   17   36:monitorexit     
		return;
	//   18   37:return          
		crashlyticslistener;
	//   19   38:astore_1        
	//*  20   39:aload_0         
		throw crashlyticslistener;
	//   21   40:monitorexit     
	//   22   41:aload_1         
	//   23   42:athrow          
	}

	public void setLong(String s, long l)
	{
		setString(s, Long.toString(l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #854 <Method String Long.toString(long)>
	//    4    6:invokevirtual   #818 <Method void setString(String, String)>
	//    5    9:return          
	}

	void setShouldSendUserReportsWithoutPrompting(boolean flag)
	{
		PreferenceStoreImpl preferencestoreimpl = new PreferenceStoreImpl(((Kit) (this)));
	//    0    0:new             #859 <Class PreferenceStoreImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #860 <Method void PreferenceStoreImpl(Kit)>
	//    4    8:astore_2        
		((PreferenceStore) (preferencestoreimpl)).save(((PreferenceStore) (preferencestoreimpl)).edit().putBoolean("always_send_reports_opt_in", flag));
	//    5    9:aload_2         
	//    6   10:aload_2         
	//    7   11:invokeinterface #866 <Method android.content.SharedPreferences$Editor PreferenceStore.edit()>
	//    8   16:ldc1            #75  <String "always_send_reports_opt_in">
	//    9   18:iload_1         
	//   10   19:invokeinterface #872 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   11   24:invokeinterface #876 <Method boolean PreferenceStore.save(android.content.SharedPreferences$Editor)>
	//   12   29:pop             
	//   13   30:return          
	}

	public void setString(String s, String s1)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(s == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       54
		{
			s = ((String) (getContext()));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #675 <Method Context getContext()>
	//    8   16:astore_1        
			if(s != null && CommonUtils.isAppDebuggable(((Context) (s))))
	//*   9   17:aload_1         
	//*  10   18:ifnull          39
	//*  11   21:aload_1         
	//*  12   22:invokestatic    #880 <Method boolean CommonUtils.isAppDebuggable(Context)>
	//*  13   25:ifeq            39
			{
				throw new IllegalArgumentException("Custom attribute key must not be null.");
	//   14   28:new             #843 <Class IllegalArgumentException>
	//   15   31:dup             
	//   16   32:ldc2            #882 <String "Custom attribute key must not be null.">
	//   17   35:invokespecial   #846 <Method void IllegalArgumentException(String)>
	//   18   38:athrow          
			} else
			{
				Fabric.getLogger().e("CrashlyticsCore", "Attempting to set custom attribute with null key, ignoring.", ((Throwable) (null)));
	//   19   39:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   20   42:ldc1            #80  <String "CrashlyticsCore">
	//   21   44:ldc2            #884 <String "Attempting to set custom attribute with null key, ignoring.">
	//   22   47:aconst_null     
	//   23   48:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
				return;
	//   24   53:return          
			}
		}
		String s2 = sanitizeAttribute(s);
	//   25   54:aload_1         
	//   26   55:invokestatic    #886 <Method String sanitizeAttribute(String)>
	//   27   58:astore_3        
		if(attributes.size() >= 64 && !attributes.containsKey(((Object) (s2))))
	//*  28   59:aload_0         
	//*  29   60:getfield        #162 <Field ConcurrentHashMap attributes>
	//*  30   63:invokevirtual   #889 <Method int ConcurrentHashMap.size()>
	//*  31   66:bipush          64
	//*  32   68:icmplt          96
	//*  33   71:aload_0         
	//*  34   72:getfield        #162 <Field ConcurrentHashMap attributes>
	//*  35   75:aload_3         
	//*  36   76:invokevirtual   #892 <Method boolean ConcurrentHashMap.containsKey(Object)>
	//*  37   79:ifne            96
		{
			Fabric.getLogger().d("CrashlyticsCore", "Exceeded maximum number of custom attributes (64)");
	//   38   82:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//   39   85:ldc1            #80  <String "CrashlyticsCore">
	//   40   87:ldc2            #894 <String "Exceeded maximum number of custom attributes (64)">
	//   41   90:invokeinterface #321 <Method void Logger.d(String, String)>
			return;
	//   42   95:return          
		}
		if(s1 == null)
	//*  43   96:aload_2         
	//*  44   97:ifnonnull       107
			s = "";
	//   45  100:ldc2            #741 <String "">
	//   46  103:astore_1        
		else
	//*  47  104:goto            112
			s = sanitizeAttribute(s1);
	//   48  107:aload_2         
	//   49  108:invokestatic    #886 <Method String sanitizeAttribute(String)>
	//   50  111:astore_1        
		attributes.put(((Object) (s2)), ((Object) (s)));
	//   51  112:aload_0         
	//   52  113:getfield        #162 <Field ConcurrentHashMap attributes>
	//   53  116:aload_3         
	//   54  117:aload_1         
	//   55  118:invokevirtual   #898 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   56  121:pop             
		handler.cacheKeyData(((Map) (attributes)));
	//   57  122:aload_0         
	//   58  123:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   59  126:aload_0         
	//   60  127:getfield        #162 <Field ConcurrentHashMap attributes>
	//   61  130:invokevirtual   #902 <Method void CrashlyticsUncaughtExceptionHandler.cacheKeyData(Map)>
	//   62  133:return          
	}

	public void setUserEmail(String s)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field boolean disabled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			userEmail = sanitizeAttribute(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #886 <Method String sanitizeAttribute(String)>
	//    7   13:putfield        #137 <Field String userEmail>
			handler.cacheUserData(userId, userName, userEmail);
	//    8   16:aload_0         
	//    9   17:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   10   20:aload_0         
	//   11   21:getfield        #135 <Field String userId>
	//   12   24:aload_0         
	//   13   25:getfield        #139 <Field String userName>
	//   14   28:aload_0         
	//   15   29:getfield        #137 <Field String userEmail>
	//   16   32:invokevirtual   #907 <Method void CrashlyticsUncaughtExceptionHandler.cacheUserData(String, String, String)>
			return;
	//   17   35:return          
		}
	}

	public void setUserIdentifier(String s)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field boolean disabled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			userId = sanitizeAttribute(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #886 <Method String sanitizeAttribute(String)>
	//    7   13:putfield        #135 <Field String userId>
			handler.cacheUserData(userId, userName, userEmail);
	//    8   16:aload_0         
	//    9   17:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   10   20:aload_0         
	//   11   21:getfield        #135 <Field String userId>
	//   12   24:aload_0         
	//   13   25:getfield        #139 <Field String userName>
	//   14   28:aload_0         
	//   15   29:getfield        #137 <Field String userEmail>
	//   16   32:invokevirtual   #907 <Method void CrashlyticsUncaughtExceptionHandler.cacheUserData(String, String, String)>
			return;
	//   17   35:return          
		}
	}

	public void setUserName(String s)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field boolean disabled>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			userName = sanitizeAttribute(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokestatic    #886 <Method String sanitizeAttribute(String)>
	//    7   13:putfield        #139 <Field String userName>
			handler.cacheUserData(userId, userName, userEmail);
	//    8   16:aload_0         
	//    9   17:getfield        #236 <Field CrashlyticsUncaughtExceptionHandler handler>
	//   10   20:aload_0         
	//   11   21:getfield        #135 <Field String userId>
	//   12   24:aload_0         
	//   13   25:getfield        #139 <Field String userName>
	//   14   28:aload_0         
	//   15   29:getfield        #137 <Field String userEmail>
	//   16   32:invokevirtual   #907 <Method void CrashlyticsUncaughtExceptionHandler.cacheUserData(String, String, String)>
			return;
	//   17   35:return          
		}
	}

	boolean shouldPromptUserBeforeSendingCrashReports()
	{
		return ((Boolean)Settings.getInstance().withSettings(new io.fabric.sdk.android.services.settings.Settings.SettingsAccess() {

			public Boolean usingSettings(SettingsData settingsdata)
			{
				if(settingsdata.featuresData.promptEnabled)
			//*   0    0:aload_1         
			//*   1    1:getfield        #30  <Field FeaturesSettingsData SettingsData.featuresData>
			//*   2    4:getfield        #36  <Field boolean FeaturesSettingsData.promptEnabled>
			//*   3    7:ifeq            23
					return Boolean.valueOf(shouldSendReportsWithoutPrompting() ^ true);
			//    4   10:aload_0         
			//    5   11:getfield        #18  <Field CrashlyticsCore this$0>
			//    6   14:invokevirtual   #39  <Method boolean CrashlyticsCore.shouldSendReportsWithoutPrompting()>
			//    7   17:iconst_1        
			//    8   18:ixor            
			//    9   19:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
			//   10   22:areturn         
				else
					return Boolean.valueOf(false);
			//   11   23:iconst_0        
			//   12   24:invokestatic    #45  <Method Boolean Boolean.valueOf(boolean)>
			//   13   27:areturn         
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
	//    0    0:invokestatic    #385 <Method Settings Settings.getInstance()>
	//    1    3:new             #15  <Class CrashlyticsCore$5>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #911 <Method void CrashlyticsCore$5(CrashlyticsCore)>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #552 <Method Boolean Boolean.valueOf(boolean)>
	//    7   15:invokevirtual   #556 <Method Object Settings.withSettings(io.fabric.sdk.android.services.settings.Settings$SettingsAccess, Object)>
	//    8   18:checkcast       #199 <Class Boolean>
	//    9   21:invokevirtual   #559 <Method boolean Boolean.booleanValue()>
	//   10   24:ireturn         
	}

	boolean shouldSendReportsWithoutPrompting()
	{
		return ((PreferenceStore) (new PreferenceStoreImpl(((Kit) (this))))).get().getBoolean("always_send_reports_opt_in", false);
	//    0    0:new             #859 <Class PreferenceStoreImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #860 <Method void PreferenceStoreImpl(Kit)>
	//    4    8:invokeinterface #915 <Method SharedPreferences PreferenceStore.get()>
	//    5   13:ldc1            #75  <String "always_send_reports_opt_in">
	//    6   15:iconst_0        
	//    7   16:invokeinterface #921 <Method boolean SharedPreferences.getBoolean(String, boolean)>
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
	//    2    2:invokevirtual   #924 <Method boolean internalVerifyPinning(URL)>
	//    3    5:istore_2        
		}
	//*   4    6:iload_2         
	//*   5    7:ireturn         
		// Misplaced declaration of an exception variable
		catch(URL url)
	//*   6    8:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Could not verify SSL pinning", ((Throwable) (url)));
	//    7    9:invokestatic    #218 <Method Logger Fabric.getLogger()>
	//    8   12:ldc1            #80  <String "CrashlyticsCore">
	//    9   14:ldc2            #926 <String "Could not verify SSL pinning">
	//   10   17:aload_1         
	//   11   18:invokeinterface #226 <Method void Logger.e(String, String, Throwable)>
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
	//    1    1:getfield        #174 <Field CrashlyticsFileMarker initializationMarker>
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
	//    3    3:invokespecial   #180 <Method boolean getSendDecisionFromUser(Activity, PromptSettingsData)>
	//    4    6:ireturn         
	}

*/


/*
	static int access$400(float f, int i)
	{
		return dipsToPixels(f, i);
	//    0    0:fload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #185 <Method int dipsToPixels(float, int)>
	//    3    5:ireturn         
	}

*/
}
