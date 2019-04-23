// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.answers.AppMeasurementEventLogger;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.*;
import io.fabric.sdk.android.services.concurrency.*;
import io.fabric.sdk.android.services.network.*;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.*;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsBackgroundWorker, CrashlyticsListener, CrashlyticsController, CrashTest, 
//			CrashlyticsFileMarker, CrashlyticsNdkDataProvider, PreferenceManager, CrashlyticsPinningInfoProvider, 
//			AppData, ResourceUnityVersionProvider, ManifestUnityVersionProvider, DefaultAppMeasurementEventListenerRegistrar, 
//			PinningInfoProvider, CrashlyticsNdkData

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
			if(f > 0.0F)
		//*   0    0:fload_1         
		//*   1    1:fconst_0        
		//*   2    2:fcmpg           
		//*   3    3:ifle            32
			{
				if(delay <= 0.0F)
		//*   4    6:aload_0         
		//*   5    7:getfield        #22  <Field float delay>
		//*   6   10:fconst_0        
		//*   7   11:fcmpl           
		//*   8   12:ifgt            22
				{
					delay = f;
		//    9   15:aload_0         
		//   10   16:fload_1         
		//   11   17:putfield        #22  <Field float delay>
					return this;
		//   12   20:aload_0         
		//   13   21:areturn         
				} else
				{
					throw new IllegalStateException("delay already set.");
		//   14   22:new             #37  <Class IllegalStateException>
		//   15   25:dup             
		//   16   26:ldc1            #39  <String "delay already set.">
		//   17   28:invokespecial   #42  <Method void IllegalStateException(String)>
		//   18   31:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("delay must be greater than 0");
		//   19   32:new             #44  <Class IllegalArgumentException>
		//   20   35:dup             
		//   21   36:ldc1            #46  <String "delay must be greater than 0">
		//   22   38:invokespecial   #47  <Method void IllegalArgumentException(String)>
		//   23   41:athrow          
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
			if(crashlyticslistener != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          28
			{
				if(listener == null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #29  <Field CrashlyticsListener listener>
		//*   4    8:ifnonnull       18
				{
					listener = crashlyticslistener;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #29  <Field CrashlyticsListener listener>
					return this;
		//    8   16:aload_0         
		//    9   17:areturn         
				} else
				{
					throw new IllegalStateException("listener already set.");
		//   10   18:new             #37  <Class IllegalStateException>
		//   11   21:dup             
		//   12   22:ldc1            #51  <String "listener already set.">
		//   13   24:invokespecial   #42  <Method void IllegalStateException(String)>
		//   14   27:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("listener must not be null.");
		//   15   28:new             #44  <Class IllegalArgumentException>
		//   16   31:dup             
		//   17   32:ldc1            #53  <String "listener must not be null.">
		//   18   34:invokespecial   #47  <Method void IllegalArgumentException(String)>
		//   19   37:athrow          
			}
		}

		public Builder pinningInfo(PinningInfoProvider pinninginfoprovider)
		{
			if(pinninginfoprovider != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          28
			{
				if(pinningInfoProvider == null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #31  <Field PinningInfoProvider pinningInfoProvider>
		//*   4    8:ifnonnull       18
				{
					pinningInfoProvider = pinninginfoprovider;
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:putfield        #31  <Field PinningInfoProvider pinningInfoProvider>
					return this;
		//    8   16:aload_0         
		//    9   17:areturn         
				} else
				{
					throw new IllegalStateException("pinningInfoProvider already set.");
		//   10   18:new             #37  <Class IllegalStateException>
		//   11   21:dup             
		//   12   22:ldc1            #58  <String "pinningInfoProvider already set.">
		//   13   24:invokespecial   #42  <Method void IllegalStateException(String)>
		//   14   27:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("pinningInfoProvider must not be null.");
		//   15   28:new             #44  <Class IllegalArgumentException>
		//   16   31:dup             
		//   17   32:ldc1            #60  <String "pinningInfoProvider must not be null.">
		//   18   34:invokespecial   #47  <Method void IllegalArgumentException(String)>
		//   19   37:athrow          
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
	//    5    5:invokespecial   #84  <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean)>
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
	//    5    6:ldc1            #87  <String "Crashlytics Exception Handler">
	//    6    8:invokestatic    #93  <Method ExecutorService ExecutorUtils.buildSingleThreadExecutorService(String)>
	//    7   11:invokespecial   #96  <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean, ExecutorService)>
	//    8   14:return          
	}

	CrashlyticsCore(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag, ExecutorService executorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Kit()>
		userId = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #100 <Field String userId>
		userEmail = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #102 <Field String userEmail>
		userName = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #104 <Field String userName>
		delay = f;
	//   11   19:aload_0         
	//   12   20:fload_1         
	//   13   21:putfield        #106 <Field float delay>
		if(crashlyticslistener == null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          31
	//*  16   28:goto            40
			crashlyticslistener = ((CrashlyticsListener) (new NoOpListener()));
	//   17   31:new             #19  <Class CrashlyticsCore$NoOpListener>
	//   18   34:dup             
	//   19   35:aconst_null     
	//   20   36:invokespecial   #109 <Method void CrashlyticsCore$NoOpListener(CrashlyticsCore$1)>
	//   21   39:astore_2        
		listener = crashlyticslistener;
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:putfield        #111 <Field CrashlyticsListener listener>
		pinningInfo = pinninginfoprovider;
	//   25   45:aload_0         
	//   26   46:aload_3         
	//   27   47:putfield        #113 <Field PinningInfoProvider pinningInfo>
		disabled = flag;
	//   28   50:aload_0         
	//   29   51:iload           4
	//   30   53:putfield        #115 <Field boolean disabled>
		backgroundWorker = new CrashlyticsBackgroundWorker(executorservice);
	//   31   56:aload_0         
	//   32   57:new             #117 <Class CrashlyticsBackgroundWorker>
	//   33   60:dup             
	//   34   61:aload           5
	//   35   63:invokespecial   #120 <Method void CrashlyticsBackgroundWorker(ExecutorService)>
	//   36   66:putfield        #122 <Field CrashlyticsBackgroundWorker backgroundWorker>
		attributes = new ConcurrentHashMap();
	//   37   69:aload_0         
	//   38   70:new             #124 <Class ConcurrentHashMap>
	//   39   73:dup             
	//   40   74:invokespecial   #125 <Method void ConcurrentHashMap()>
	//   41   77:putfield        #127 <Field ConcurrentHashMap attributes>
		startTime = System.currentTimeMillis();
	//   42   80:aload_0         
	//   43   81:invokestatic    #133 <Method long System.currentTimeMillis()>
	//   44   84:putfield        #135 <Field long startTime>
	//   45   87:return          
	}

	private void checkForPreviousCrash()
	{
		Boolean boolean1 = (Boolean)backgroundWorker.submitAndWait(((Callable) (new CrashMarkerCheck(crashMarker))));
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #16  <Class CrashlyticsCore$CrashMarkerCheck>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #144 <Field CrashlyticsFileMarker crashMarker>
	//    6   12:invokespecial   #147 <Method void CrashlyticsCore$CrashMarkerCheck(CrashlyticsFileMarker)>
	//    7   15:invokevirtual   #151 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    8   18:checkcast       #153 <Class Boolean>
	//    9   21:astore_1        
		if(!Boolean.TRUE.equals(((Object) (boolean1))))
	//*  10   22:getstatic       #157 <Field Boolean Boolean.TRUE>
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #161 <Method boolean Boolean.equals(Object)>
	//*  13   29:ifne            33
			return;
	//   14   32:return          
		try
		{
			listener.crashlyticsDidDetectCrashDuringPreviousExecution();
	//   15   33:aload_0         
	//   16   34:getfield        #111 <Field CrashlyticsListener listener>
	//   17   37:invokeinterface #166 <Method void CrashlyticsListener.crashlyticsDidDetectCrashDuringPreviousExecution()>
			return;
	//   18   42:return          
		}
		catch(Exception exception)
	//*  19   43:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", ((Throwable) (exception)));
	//   20   44:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   21   47:ldc1            #55  <String "CrashlyticsCore">
	//   22   49:ldc1            #174 <String "Exception thrown by CrashlyticsListener while notifying of previous crash.">
	//   23   51:aload_1         
	//   24   52:invokeinterface #180 <Method void Logger.e(String, String, Throwable)>
		}
	//   25   57:return          
	}

	private void doLog(int i, String s, String s1)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to logging messages."))
	//*   4    8:ldc1            #184 <String "prior to logging messages.">
	//*   5   10:invokestatic    #188 <Method boolean ensureFabricWithCalled(String)>
	//*   6   13:ifne            17
		{
			return;
	//    7   16:return          
		} else
		{
			long l = System.currentTimeMillis();
	//    8   17:invokestatic    #133 <Method long System.currentTimeMillis()>
	//    9   20:lstore          4
			long l1 = startTime;
	//   10   22:aload_0         
	//   11   23:getfield        #135 <Field long startTime>
	//   12   26:lstore          6
			controller.writeToLog(l - l1, formatLogMessage(i, s, s1));
	//   13   28:aload_0         
	//   14   29:getfield        #190 <Field CrashlyticsController controller>
	//   15   32:lload           4
	//   16   34:lload           6
	//   17   36:lsub            
	//   18   37:iload_1         
	//   19   38:aload_2         
	//   20   39:aload_3         
	//   21   40:invokestatic    #194 <Method String formatLogMessage(int, String, String)>
	//   22   43:invokevirtual   #200 <Method void CrashlyticsController.writeToLog(long, String)>
			return;
	//   23   46:return          
		}
	}

	private static boolean ensureFabricWithCalled(String s)
	{
		CrashlyticsCore crashlyticscore = getInstance();
	//    0    0:invokestatic    #204 <Method CrashlyticsCore getInstance()>
	//    1    3:astore_1        
		if(crashlyticscore != null && crashlyticscore.controller != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          20
	//*   4    8:aload_1         
	//*   5    9:getfield        #190 <Field CrashlyticsController controller>
	//*   6   12:ifnonnull       18
	//*   7   15:goto            20
		{
			return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
		} else
		{
			Logger logger = Fabric.getLogger();
	//   10   20:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   11   23:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #206 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #207 <Method void StringBuilder()>
	//   15   31:astore_2        
			stringbuilder.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
	//   16   32:aload_2         
	//   17   33:ldc1            #209 <String "Crashlytics must be initialized by calling Fabric.with(Context) ">
	//   18   35:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(s);
	//   20   39:aload_2         
	//   21   40:aload_0         
	//   22   41:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			logger.e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   24   45:aload_1         
	//   25   46:ldc1            #55  <String "CrashlyticsCore">
	//   26   48:aload_2         
	//   27   49:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   28   52:aconst_null     
	//   29   53:invokeinterface #180 <Method void Logger.e(String, String, Throwable)>
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
	//    3    5:invokespecial   #227 <Method void CrashlyticsCore$1(CrashlyticsCore)>
	//    4    8:astore_1        
		for(Iterator iterator = getDependencies().iterator(); iterator.hasNext(); ((PriorityCallable) (obj)).addDependency((Task)iterator.next()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #231 <Method Collection getDependencies()>
	//    7   13:invokeinterface #237 <Method Iterator Collection.iterator()>
	//    8   18:astore_2        
	//    9   19:aload_2         
	//   10   20:invokeinterface #243 <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            44
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokeinterface #247 <Method Object Iterator.next()>
	//   15   35:checkcast       #249 <Class Task>
	//   16   38:invokevirtual   #255 <Method void PriorityCallable.addDependency(Task)>
	//*  17   41:goto            19
		obj = ((Object) (getFabric().getExecutorService().submit(((Callable) (obj)))));
	//   18   44:aload_0         
	//   19   45:invokevirtual   #259 <Method Fabric getFabric()>
	//   20   48:invokevirtual   #263 <Method ExecutorService Fabric.getExecutorService()>
	//   21   51:aload_1         
	//   22   52:invokeinterface #269 <Method Future ExecutorService.submit(Callable)>
	//   23   57:astore_1        
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
	//   24   58:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   25   61:ldc1            #55  <String "CrashlyticsCore">
	//   26   63:ldc2            #271 <String "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.">
	//   27   66:invokeinterface #275 <Method void Logger.d(String, String)>
		try
		{
			((Future) (obj)).get(4L, TimeUnit.SECONDS);
	//   28   71:aload_1         
	//   29   72:ldc2w           #276 <Long 4L>
	//   30   75:getstatic       #283 <Field TimeUnit TimeUnit.SECONDS>
	//   31   78:invokeinterface #289 <Method Object Future.get(long, TimeUnit)>
	//   32   83:pop             
			return;
	//   33   84:return          
		}
	//*  34   85:astore_1        
	//*  35   86:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//*  36   89:ldc1            #55  <String "CrashlyticsCore">
	//*  37   91:ldc2            #291 <String "Crashlytics timed out during initialization.">
	//*  38   94:aload_1         
	//*  39   95:invokeinterface #180 <Method void Logger.e(String, String, Throwable)>
	//*  40  100:return          
	//*  41  101:astore_1        
	//*  42  102:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//*  43  105:ldc1            #55  <String "CrashlyticsCore">
	//*  44  107:ldc2            #293 <String "Problem encountered during Crashlytics initialization.">
	//*  45  110:aload_1         
	//*  46  111:invokeinterface #180 <Method void Logger.e(String, String, Throwable)>
	//*  47  116:return          
		catch(InterruptedException interruptedexception)
	//*  48  117:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Crashlytics was interrupted during initialization.", ((Throwable) (interruptedexception)));
	//   49  118:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   50  121:ldc1            #55  <String "CrashlyticsCore">
	//   51  123:ldc2            #295 <String "Crashlytics was interrupted during initialization.">
	//   52  126:aload_1         
	//   53  127:invokeinterface #180 <Method void Logger.e(String, String, Throwable)>
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
	//    0    0:new             #206 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #207 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(CommonUtils.logPriorityToString(i));
	//    4    8:aload_3         
	//    5    9:iload_0         
	//    6   10:invokestatic    #301 <Method String CommonUtils.logPriorityToString(int)>
	//    7   13:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("/");
	//    9   17:aload_3         
	//   10   18:ldc2            #303 <String "/">
	//   11   21:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(s);
	//   13   25:aload_3         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(" ");
	//   17   31:aload_3         
	//   18   32:ldc2            #305 <String " ">
	//   19   35:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append(s1);
	//   21   39:aload_3         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
		return stringbuilder.toString();
	//   25   45:aload_3         
	//   26   46:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   27   49:areturn         
	}

	public static CrashlyticsCore getInstance()
	{
		return (CrashlyticsCore)Fabric.getKit(com/crashlytics/android/core/CrashlyticsCore);
	//    0    0:ldc1            #2   <Class CrashlyticsCore>
	//    1    2:invokestatic    #309 <Method Kit Fabric.getKit(Class)>
	//    2    5:checkcast       #2   <Class CrashlyticsCore>
	//    3    8:areturn         
	}

	static boolean isBuildIdValid(String s, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            19
		{
			Fabric.getLogger().d("CrashlyticsCore", "Configured not to require a build ID.");
	//    2    4:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//    3    7:ldc1            #55  <String "CrashlyticsCore">
	//    4    9:ldc2            #313 <String "Configured not to require a build ID.">
	//    5   12:invokeinterface #275 <Method void Logger.d(String, String)>
			return true;
	//    6   17:iconst_1        
	//    7   18:ireturn         
		}
		if(!CommonUtils.isNullOrEmpty(s))
	//*   8   19:aload_0         
	//*   9   20:invokestatic    #316 <Method boolean CommonUtils.isNullOrEmpty(String)>
	//*  10   23:ifne            28
		{
			return true;
	//   11   26:iconst_1        
	//   12   27:ireturn         
		} else
		{
			Log.e("CrashlyticsCore", ".");
	//   13   28:ldc1            #55  <String "CrashlyticsCore">
	//   14   30:ldc2            #318 <String ".">
	//   15   33:invokestatic    #323 <Method int Log.e(String, String)>
	//   16   36:pop             
			Log.e("CrashlyticsCore", ".     |  | ");
	//   17   37:ldc1            #55  <String "CrashlyticsCore">
	//   18   39:ldc2            #325 <String ".     |  | ">
	//   19   42:invokestatic    #323 <Method int Log.e(String, String)>
	//   20   45:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   21   46:ldc1            #55  <String "CrashlyticsCore">
	//   22   48:ldc2            #327 <String ".     |  |">
	//   23   51:invokestatic    #323 <Method int Log.e(String, String)>
	//   24   54:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   25   55:ldc1            #55  <String "CrashlyticsCore">
	//   26   57:ldc2            #327 <String ".     |  |">
	//   27   60:invokestatic    #323 <Method int Log.e(String, String)>
	//   28   63:pop             
			Log.e("CrashlyticsCore", ".   \\ |  | /");
	//   29   64:ldc1            #55  <String "CrashlyticsCore">
	//   30   66:ldc2            #329 <String ".   \\ |  | /">
	//   31   69:invokestatic    #323 <Method int Log.e(String, String)>
	//   32   72:pop             
			Log.e("CrashlyticsCore", ".    \\    /");
	//   33   73:ldc1            #55  <String "CrashlyticsCore">
	//   34   75:ldc2            #331 <String ".    \\    /">
	//   35   78:invokestatic    #323 <Method int Log.e(String, String)>
	//   36   81:pop             
			Log.e("CrashlyticsCore", ".     \\  /");
	//   37   82:ldc1            #55  <String "CrashlyticsCore">
	//   38   84:ldc2            #333 <String ".     \\  /">
	//   39   87:invokestatic    #323 <Method int Log.e(String, String)>
	//   40   90:pop             
			Log.e("CrashlyticsCore", ".      \\/");
	//   41   91:ldc1            #55  <String "CrashlyticsCore">
	//   42   93:ldc2            #335 <String ".      \\/">
	//   43   96:invokestatic    #323 <Method int Log.e(String, String)>
	//   44   99:pop             
			Log.e("CrashlyticsCore", ".");
	//   45  100:ldc1            #55  <String "CrashlyticsCore">
	//   46  102:ldc2            #318 <String ".">
	//   47  105:invokestatic    #323 <Method int Log.e(String, String)>
	//   48  108:pop             
			Log.e("CrashlyticsCore", "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
	//   49  109:ldc1            #55  <String "CrashlyticsCore">
	//   50  111:ldc1            #49  <String "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.">
	//   51  113:invokestatic    #323 <Method int Log.e(String, String)>
	//   52  116:pop             
			Log.e("CrashlyticsCore", ".");
	//   53  117:ldc1            #55  <String "CrashlyticsCore">
	//   54  119:ldc2            #318 <String ".">
	//   55  122:invokestatic    #323 <Method int Log.e(String, String)>
	//   56  125:pop             
			Log.e("CrashlyticsCore", ".      /\\");
	//   57  126:ldc1            #55  <String "CrashlyticsCore">
	//   58  128:ldc2            #337 <String ".      /\\">
	//   59  131:invokestatic    #323 <Method int Log.e(String, String)>
	//   60  134:pop             
			Log.e("CrashlyticsCore", ".     /  \\");
	//   61  135:ldc1            #55  <String "CrashlyticsCore">
	//   62  137:ldc2            #339 <String ".     /  \\">
	//   63  140:invokestatic    #323 <Method int Log.e(String, String)>
	//   64  143:pop             
			Log.e("CrashlyticsCore", ".    /    \\");
	//   65  144:ldc1            #55  <String "CrashlyticsCore">
	//   66  146:ldc2            #341 <String ".    /    \\">
	//   67  149:invokestatic    #323 <Method int Log.e(String, String)>
	//   68  152:pop             
			Log.e("CrashlyticsCore", ".   / |  | \\");
	//   69  153:ldc1            #55  <String "CrashlyticsCore">
	//   70  155:ldc2            #343 <String ".   / |  | \\">
	//   71  158:invokestatic    #323 <Method int Log.e(String, String)>
	//   72  161:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   73  162:ldc1            #55  <String "CrashlyticsCore">
	//   74  164:ldc2            #327 <String ".     |  |">
	//   75  167:invokestatic    #323 <Method int Log.e(String, String)>
	//   76  170:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   77  171:ldc1            #55  <String "CrashlyticsCore">
	//   78  173:ldc2            #327 <String ".     |  |">
	//   79  176:invokestatic    #323 <Method int Log.e(String, String)>
	//   80  179:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   81  180:ldc1            #55  <String "CrashlyticsCore">
	//   82  182:ldc2            #327 <String ".     |  |">
	//   83  185:invokestatic    #323 <Method int Log.e(String, String)>
	//   84  188:pop             
			Log.e("CrashlyticsCore", ".");
	//   85  189:ldc1            #55  <String "CrashlyticsCore">
	//   86  191:ldc2            #318 <String ".">
	//   87  194:invokestatic    #323 <Method int Log.e(String, String)>
	//   88  197:pop             
			return false;
	//   89  198:iconst_0        
	//   90  199:ireturn         
		}
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
	//    5    7:invokevirtual   #350 <Method String String.trim()>
	//    6   10:astore_0        
			s1 = s;
	//    7   11:aload_0         
	//    8   12:astore_1        
			if(s.length() > 1024)
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #354 <Method int String.length()>
	//*  11   17:sipush          1024
	//*  12   20:icmple          32
				s1 = s.substring(0, 1024);
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:sipush          1024
	//   16   28:invokevirtual   #358 <Method String String.substring(int, int)>
	//   17   31:astore_1        
		}
		return s1;
	//   18   32:aload_1         
	//   19   33:areturn         
	}

	public void crash()
	{
		(new CrashTest()).indexOutOfBounds();
	//    0    0:new             #361 <Class CrashTest>
	//    1    3:dup             
	//    2    4:invokespecial   #362 <Method void CrashTest()>
	//    3    7:invokevirtual   #365 <Method void CrashTest.indexOutOfBounds()>
	//    4   10:return          
	}

	void createCrashMarker()
	{
		crashMarker.create();
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field CrashlyticsFileMarker crashMarker>
	//    2    4:invokevirtual   #371 <Method boolean CrashlyticsFileMarker.create()>
	//    3    7:pop             
	//    4    8:return          
	}

	boolean didPreviousInitializationFail()
	{
		return initializationMarker.isPresent();
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field CrashlyticsFileMarker initializationMarker>
	//    2    4:invokevirtual   #375 <Method boolean CrashlyticsFileMarker.isPresent()>
	//    3    7:ireturn         
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #379 <Method Void doInBackground()>
	//    2    4:areturn         
	}

	protected Void doInBackground()
	{
		markInitializationStarted();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #382 <Method void markInitializationStarted()>
		controller.cleanInvalidTempFiles();
	//    2    4:aload_0         
	//    3    5:getfield        #190 <Field CrashlyticsController controller>
	//    4    8:invokevirtual   #385 <Method void CrashlyticsController.cleanInvalidTempFiles()>
		SettingsData settingsdata;
		controller.registerDevicePowerStateListener();
	//    5   11:aload_0         
	//    6   12:getfield        #190 <Field CrashlyticsController controller>
	//    7   15:invokevirtual   #388 <Method void CrashlyticsController.registerDevicePowerStateListener()>
		settingsdata = Settings.getInstance().awaitSettingsData();
	//    8   18:invokestatic    #393 <Method Settings Settings.getInstance()>
	//    9   21:invokevirtual   #397 <Method SettingsData Settings.awaitSettingsData()>
	//   10   24:astore_1        
		if(settingsdata != null)
			break MISSING_BLOCK_LABEL_48;
	//   11   25:aload_1         
	//   12   26:ifnonnull       48
		Fabric.getLogger().w("CrashlyticsCore", "Received null settings, skipping report submission!");
	//   13   29:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   14   32:ldc1            #55  <String "CrashlyticsCore">
	//   15   34:ldc2            #399 <String "Received null settings, skipping report submission!">
	//   16   37:invokeinterface #402 <Method void Logger.w(String, String)>
		markInitializationComplete();
	//   17   42:aload_0         
	//   18   43:invokevirtual   #405 <Method void markInitializationComplete()>
		return null;
	//   19   46:aconst_null     
	//   20   47:areturn         
		controller.registerAnalyticsEventListener(settingsdata);
	//   21   48:aload_0         
	//   22   49:getfield        #190 <Field CrashlyticsController controller>
	//   23   52:aload_1         
	//   24   53:invokevirtual   #409 <Method void CrashlyticsController.registerAnalyticsEventListener(SettingsData)>
		if(settingsdata.featuresData.collectReports)
			break MISSING_BLOCK_LABEL_85;
	//   25   56:aload_1         
	//   26   57:getfield        #415 <Field FeaturesSettingsData SettingsData.featuresData>
	//   27   60:getfield        #420 <Field boolean FeaturesSettingsData.collectReports>
	//   28   63:ifne            85
		Fabric.getLogger().d("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
	//   29   66:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   30   69:ldc1            #55  <String "CrashlyticsCore">
	//   31   71:ldc2            #422 <String "Collection of crash reports disabled in Crashlytics settings.">
	//   32   74:invokeinterface #275 <Method void Logger.d(String, String)>
		markInitializationComplete();
	//   33   79:aload_0         
	//   34   80:invokevirtual   #405 <Method void markInitializationComplete()>
		return null;
	//   35   83:aconst_null     
	//   36   84:areturn         
		if(DataCollectionArbiter.getInstance(getContext()).isDataCollectionEnabled())
			break MISSING_BLOCK_LABEL_117;
	//   37   85:aload_0         
	//   38   86:invokevirtual   #426 <Method Context getContext()>
	//   39   89:invokestatic    #431 <Method DataCollectionArbiter DataCollectionArbiter.getInstance(Context)>
	//   40   92:invokevirtual   #434 <Method boolean DataCollectionArbiter.isDataCollectionEnabled()>
	//   41   95:ifne            117
		Fabric.getLogger().d("CrashlyticsCore", "Automatic collection of crash reports disabled by Firebase settings.");
	//   42   98:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   43  101:ldc1            #55  <String "CrashlyticsCore">
	//   44  103:ldc2            #436 <String "Automatic collection of crash reports disabled by Firebase settings.">
	//   45  106:invokeinterface #275 <Method void Logger.d(String, String)>
		markInitializationComplete();
	//   46  111:aload_0         
	//   47  112:invokevirtual   #405 <Method void markInitializationComplete()>
		return null;
	//   48  115:aconst_null     
	//   49  116:areturn         
		CrashlyticsNdkData crashlyticsndkdata = getNativeCrashData();
	//   50  117:aload_0         
	//   51  118:invokevirtual   #440 <Method CrashlyticsNdkData getNativeCrashData()>
	//   52  121:astore_2        
		if(crashlyticsndkdata == null)
			break MISSING_BLOCK_LABEL_150;
	//   53  122:aload_2         
	//   54  123:ifnull          150
		if(!controller.finalizeNativeReport(crashlyticsndkdata))
	//*  55  126:aload_0         
	//*  56  127:getfield        #190 <Field CrashlyticsController controller>
	//*  57  130:aload_2         
	//*  58  131:invokevirtual   #444 <Method boolean CrashlyticsController.finalizeNativeReport(CrashlyticsNdkData)>
	//*  59  134:ifne            150
			Fabric.getLogger().d("CrashlyticsCore", "Could not finalize previous NDK sessions.");
	//   60  137:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   61  140:ldc1            #55  <String "CrashlyticsCore">
	//   62  142:ldc2            #446 <String "Could not finalize previous NDK sessions.">
	//   63  145:invokeinterface #275 <Method void Logger.d(String, String)>
		if(!controller.finalizeSessions(settingsdata.sessionData))
	//*  64  150:aload_0         
	//*  65  151:getfield        #190 <Field CrashlyticsController controller>
	//*  66  154:aload_1         
	//*  67  155:getfield        #450 <Field io.fabric.sdk.android.services.settings.SessionSettingsData SettingsData.sessionData>
	//*  68  158:invokevirtual   #454 <Method boolean CrashlyticsController.finalizeSessions(io.fabric.sdk.android.services.settings.SessionSettingsData)>
	//*  69  161:ifne            177
			Fabric.getLogger().d("CrashlyticsCore", "Could not finalize previous sessions.");
	//   70  164:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   71  167:ldc1            #55  <String "CrashlyticsCore">
	//   72  169:ldc2            #456 <String "Could not finalize previous sessions.">
	//   73  172:invokeinterface #275 <Method void Logger.d(String, String)>
		controller.submitAllReports(delay, settingsdata);
	//   74  177:aload_0         
	//   75  178:getfield        #190 <Field CrashlyticsController controller>
	//   76  181:aload_0         
	//   77  182:getfield        #106 <Field float delay>
	//   78  185:aload_1         
	//   79  186:invokevirtual   #460 <Method void CrashlyticsController.submitAllReports(float, SettingsData)>
		break MISSING_BLOCK_LABEL_211;
	//   80  189:goto            211
		Object obj;
		obj;
	//   81  192:astore_1        
		break MISSING_BLOCK_LABEL_217;
	//   82  193:goto            217
		obj;
	//   83  196:astore_1        
		Fabric.getLogger().e("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", ((Throwable) (obj)));
	//   84  197:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   85  200:ldc1            #55  <String "CrashlyticsCore">
	//   86  202:ldc2            #462 <String "Crashlytics encountered a problem during asynchronous initialization.">
	//   87  205:aload_1         
	//   88  206:invokeinterface #180 <Method void Logger.e(String, String, Throwable)>
		markInitializationComplete();
	//   89  211:aload_0         
	//   90  212:invokevirtual   #405 <Method void markInitializationComplete()>
		return null;
	//   91  215:aconst_null     
	//   92  216:areturn         
		markInitializationComplete();
	//   93  217:aload_0         
	//   94  218:invokevirtual   #405 <Method void markInitializationComplete()>
		throw obj;
	//   95  221:aload_1         
	//   96  222:athrow          
	}

	Map getAttributes()
	{
		return Collections.unmodifiableMap(((Map) (attributes)));
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field ConcurrentHashMap attributes>
	//    2    4:invokestatic    #470 <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	CrashlyticsController getController()
	{
		return controller;
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field CrashlyticsController controller>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android.crashlytics-core";
	//    0    0:ldc2            #477 <String "com.crashlytics.sdk.android.crashlytics-core">
	//    1    3:areturn         
	}

	CrashlyticsNdkData getNativeCrashData()
	{
		CrashlyticsNdkDataProvider crashlyticsndkdataprovider = crashlyticsNdkDataProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #479 <Field CrashlyticsNdkDataProvider crashlyticsNdkDataProvider>
	//    2    4:astore_1        
		if(crashlyticsndkdataprovider != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return crashlyticsndkdataprovider.getCrashlyticsNdkData();
	//    5    9:aload_1         
	//    6   10:invokeinterface #484 <Method CrashlyticsNdkData CrashlyticsNdkDataProvider.getCrashlyticsNdkData()>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public PinningInfoProvider getPinningInfoProvider()
	{
		if(!disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean disabled>
	//*   2    4:ifne            12
			return pinningInfo;
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field PinningInfoProvider pinningInfo>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	String getUserEmail()
	{
		if(getIdManager().canCollectUserIds())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #491 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #496 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userEmail;
	//    4   10:aload_0         
	//    5   11:getfield        #102 <Field String userEmail>
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
	//*   1    1:invokevirtual   #491 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #496 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userId;
	//    4   10:aload_0         
	//    5   11:getfield        #100 <Field String userId>
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
	//*   1    1:invokevirtual   #491 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #496 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userName;
	//    4   10:aload_0         
	//    5   11:getfield        #104 <Field String userName>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public String getVersion()
	{
		return "2.6.6.29";
	//    0    0:ldc2            #501 <String "2.6.6.29">
	//    1    3:areturn         
	}

	boolean internalVerifyPinning(URL url)
	{
		if(getPinningInfoProvider() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #505 <Method PinningInfoProvider getPinningInfoProvider()>
	//*   2    4:ifnull          42
		{
			url = ((URL) (httpRequestFactory.buildHttpRequest(HttpMethod.GET, url.toString())));
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field HttpRequestFactory httpRequestFactory>
	//    5   11:getstatic       #513 <Field HttpMethod HttpMethod.GET>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #516 <Method String URL.toString()>
	//    8   18:invokeinterface #522 <Method HttpRequest HttpRequestFactory.buildHttpRequest(HttpMethod, String)>
	//    9   23:astore_1        
			((HttpsURLConnection)((HttpRequest) (url)).getConnection()).setInstanceFollowRedirects(false);
	//   10   24:aload_1         
	//   11   25:invokevirtual   #528 <Method java.net.HttpURLConnection HttpRequest.getConnection()>
	//   12   28:checkcast       #530 <Class HttpsURLConnection>
	//   13   31:iconst_0        
	//   14   32:invokevirtual   #534 <Method void HttpsURLConnection.setInstanceFollowRedirects(boolean)>
			((HttpRequest) (url)).code();
	//   15   35:aload_1         
	//   16   36:invokevirtual   #537 <Method int HttpRequest.code()>
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
	//    4    4:invokespecial   #540 <Method void doLog(int, String, String)>
		Logger logger = Fabric.getLogger();
	//    5    7:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//    6   10:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    7   12:new             #206 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #207 <Method void StringBuilder()>
	//   10   19:astore          5
		stringbuilder.append("");
	//   11   21:aload           5
	//   12   23:ldc2            #542 <String "">
	//   13   26:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(s);
	//   15   30:aload           5
	//   16   32:aload_2         
	//   17   33:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		s = stringbuilder.toString();
	//   19   37:aload           5
	//   20   39:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   21   42:astore_2        
		stringbuilder = new StringBuilder();
	//   22   43:new             #206 <Class StringBuilder>
	//   23   46:dup             
	//   24   47:invokespecial   #207 <Method void StringBuilder()>
	//   25   50:astore          5
		stringbuilder.append("");
	//   26   52:aload           5
	//   27   54:ldc2            #542 <String "">
	//   28   57:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		stringbuilder.append(s1);
	//   30   61:aload           5
	//   31   63:aload_3         
	//   32   64:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
		logger.log(i, s, stringbuilder.toString(), true);
	//   34   68:aload           4
	//   35   70:iload_1         
	//   36   71:aload_2         
	//   37   72:aload           5
	//   38   74:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   39   77:iconst_1        
	//   40   78:invokeinterface #545 <Method void Logger.log(int, String, String, boolean)>
	//   41   83:return          
	}

	public void log(String s)
	{
		doLog(3, "CrashlyticsCore", s);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:ldc1            #55  <String "CrashlyticsCore">
	//    3    4:aload_1         
	//    4    5:invokespecial   #540 <Method void doLog(int, String, String)>
	//    5    8:return          
	}

	public void logException(Throwable throwable)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to logging exceptions."))
	//*   4    8:ldc2            #550 <String "prior to logging exceptions.">
	//*   5   11:invokestatic    #188 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
			return;
	//    7   17:return          
		if(throwable == null)
	//*   8   18:aload_1         
	//*   9   19:ifnonnull       37
		{
			Fabric.getLogger().log(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
	//   10   22:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   11   25:iconst_5        
	//   12   26:ldc1            #55  <String "CrashlyticsCore">
	//   13   28:ldc2            #552 <String "Crashlytics is ignoring a request to log a null exception.">
	//   14   31:invokeinterface #554 <Method void Logger.log(int, String, String)>
			return;
	//   15   36:return          
		} else
		{
			controller.writeNonFatalException(Thread.currentThread(), throwable);
	//   16   37:aload_0         
	//   17   38:getfield        #190 <Field CrashlyticsController controller>
	//   18   41:invokestatic    #560 <Method Thread Thread.currentThread()>
	//   19   44:aload_1         
	//   20   45:invokevirtual   #564 <Method void CrashlyticsController.writeNonFatalException(Thread, Throwable)>
			return;
	//   21   48:return          
		}
	}

	void markInitializationComplete()
	{
		backgroundWorker.submit(new Callable() {

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
	//    1    1:getfield        #122 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #11  <Class CrashlyticsCore$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #565 <Method void CrashlyticsCore$3(CrashlyticsCore)>
	//    6   12:invokevirtual   #566 <Method Future CrashlyticsBackgroundWorker.submit(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void markInitializationStarted()
	{
		backgroundWorker.submitAndWait(new Callable() {

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
	//    1    1:getfield        #122 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #9   <Class CrashlyticsCore$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #567 <Method void CrashlyticsCore$2(CrashlyticsCore)>
	//    6   12:invokevirtual   #151 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected boolean onPreExecute()
	{
		return onPreExecute(super.getContext());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #569 <Method Context Kit.getContext()>
	//    3    5:invokevirtual   #572 <Method boolean onPreExecute(Context)>
	//    4    8:ireturn         
	}

	boolean onPreExecute(Context context)
	{
		Object obj2;
		Object obj3;
		if(!DataCollectionArbiter.getInstance(context).isDataCollectionEnabled())
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #431 <Method DataCollectionArbiter DataCollectionArbiter.getInstance(Context)>
	//*   2    4:invokevirtual   #434 <Method boolean DataCollectionArbiter.isDataCollectionEnabled()>
	//*   3    7:ifne            28
		{
			Fabric.getLogger().d("CrashlyticsCore", "Crashlytics is disabled, because data collection is disabled by Firebase.");
	//    4   10:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//    5   13:ldc1            #55  <String "CrashlyticsCore">
	//    6   15:ldc2            #574 <String "Crashlytics is disabled, because data collection is disabled by Firebase.">
	//    7   18:invokeinterface #275 <Method void Logger.d(String, String)>
			disabled = true;
	//    8   23:aload_0         
	//    9   24:iconst_1        
	//   10   25:putfield        #115 <Field boolean disabled>
		}
		if(disabled)
	//*  11   28:aload_0         
	//*  12   29:getfield        #115 <Field boolean disabled>
	//*  13   32:ifeq            37
			return false;
	//   14   35:iconst_0        
	//   15   36:ireturn         
		obj2 = ((Object) ((new ApiKey()).getValue(context)));
	//   16   37:new             #576 <Class ApiKey>
	//   17   40:dup             
	//   18   41:invokespecial   #577 <Method void ApiKey()>
	//   19   44:aload_1         
	//   20   45:invokevirtual   #581 <Method String ApiKey.getValue(Context)>
	//   21   48:astore          7
		if(obj2 == null)
	//*  22   50:aload           7
	//*  23   52:ifnonnull       57
			return false;
	//   24   55:iconst_0        
	//   25   56:ireturn         
		obj3 = ((Object) (CommonUtils.resolveBuildId(context)));
	//   26   57:aload_1         
	//   27   58:invokestatic    #584 <Method String CommonUtils.resolveBuildId(Context)>
	//   28   61:astore          8
		if(!isBuildIdValid(((String) (obj3)), CommonUtils.getBooleanResourceValue(context, "com.crashlytics.RequireBuildId", true))) goto _L2; else goto _L1
	//   29   63:aload           8
	//   30   65:aload_1         
	//   31   66:ldc1            #30  <String "com.crashlytics.RequireBuildId">
	//   32   68:iconst_1        
	//   33   69:invokestatic    #588 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//   34   72:invokestatic    #590 <Method boolean isBuildIdValid(String, boolean)>
	//   35   75:ifeq            466
_L1:
		Object obj1;
		PreferenceManager preferencemanager;
		Logger logger = Fabric.getLogger();
	//   36   78:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   37   81:astore          4
		obj1 = ((Object) (new StringBuilder()));
	//   38   83:new             #206 <Class StringBuilder>
	//   39   86:dup             
	//   40   87:invokespecial   #207 <Method void StringBuilder()>
	//   41   90:astore          5
		((StringBuilder) (obj1)).append("Initializing Crashlytics ");
	//   42   92:aload           5
	//   43   94:ldc2            #592 <String "Initializing Crashlytics ">
	//   44   97:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   45  100:pop             
		((StringBuilder) (obj1)).append(getVersion());
	//   46  101:aload           5
	//   47  103:aload_0         
	//   48  104:invokevirtual   #594 <Method String getVersion()>
	//   49  107:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//   50  110:pop             
		logger.i("CrashlyticsCore", ((StringBuilder) (obj1)).toString());
	//   51  111:aload           4
	//   52  113:ldc1            #55  <String "CrashlyticsCore">
	//   53  115:aload           5
	//   54  117:invokevirtual   #217 <Method String StringBuilder.toString()>
	//   55  120:invokeinterface #597 <Method void Logger.i(String, String)>
		obj1 = ((Object) (new FileStoreImpl(((Kit) (this)))));
	//   56  125:new             #599 <Class FileStoreImpl>
	//   57  128:dup             
	//   58  129:aload_0         
	//   59  130:invokespecial   #602 <Method void FileStoreImpl(Kit)>
	//   60  133:astore          5
		crashMarker = new CrashlyticsFileMarker("crash_marker", ((io.fabric.sdk.android.services.persistence.FileStore) (obj1)));
	//   61  135:aload_0         
	//   62  136:new             #368 <Class CrashlyticsFileMarker>
	//   63  139:dup             
	//   64  140:ldc1            #36  <String "crash_marker">
	//   65  142:aload           5
	//   66  144:invokespecial   #605 <Method void CrashlyticsFileMarker(String, io.fabric.sdk.android.services.persistence.FileStore)>
	//   67  147:putfield        #144 <Field CrashlyticsFileMarker crashMarker>
		initializationMarker = new CrashlyticsFileMarker("initialization_marker", ((io.fabric.sdk.android.services.persistence.FileStore) (obj1)));
	//   68  150:aload_0         
	//   69  151:new             #368 <Class CrashlyticsFileMarker>
	//   70  154:dup             
	//   71  155:ldc1            #42  <String "initialization_marker">
	//   72  157:aload           5
	//   73  159:invokespecial   #605 <Method void CrashlyticsFileMarker(String, io.fabric.sdk.android.services.persistence.FileStore)>
	//   74  162:putfield        #139 <Field CrashlyticsFileMarker initializationMarker>
		preferencemanager = PreferenceManager.create(((io.fabric.sdk.android.services.persistence.PreferenceStore) (new PreferenceStoreImpl(getContext(), "com.crashlytics.android.core.CrashlyticsCore"))), this);
	//   75  165:new             #607 <Class PreferenceStoreImpl>
	//   76  168:dup             
	//   77  169:aload_0         
	//   78  170:invokevirtual   #426 <Method Context getContext()>
	//   79  173:ldc1            #52  <String "com.crashlytics.android.core.CrashlyticsCore">
	//   80  175:invokespecial   #610 <Method void PreferenceStoreImpl(Context, String)>
	//   81  178:aload_0         
	//   82  179:invokestatic    #615 <Method PreferenceManager PreferenceManager.create(io.fabric.sdk.android.services.persistence.PreferenceStore, CrashlyticsCore)>
	//   83  182:astore          6
		if(pinningInfo == null) goto _L4; else goto _L3
	//   84  184:aload_0         
	//   85  185:getfield        #113 <Field PinningInfoProvider pinningInfo>
	//   86  188:ifnull          476
_L3:
		Object obj = ((Object) (new CrashlyticsPinningInfoProvider(pinningInfo)));
	//   87  191:new             #617 <Class CrashlyticsPinningInfoProvider>
	//   88  194:dup             
	//   89  195:aload_0         
	//   90  196:getfield        #113 <Field PinningInfoProvider pinningInfo>
	//   91  199:invokespecial   #620 <Method void CrashlyticsPinningInfoProvider(PinningInfoProvider)>
	//   92  202:astore          4
	//*  93  204:goto            207
_L6:
		boolean flag;
		try
		{
			httpRequestFactory = ((HttpRequestFactory) (new DefaultHttpRequestFactory(Fabric.getLogger())));
	//   94  207:aload_0         
	//   95  208:new             #622 <Class DefaultHttpRequestFactory>
	//   96  211:dup             
	//   97  212:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   98  215:invokespecial   #625 <Method void DefaultHttpRequestFactory(Logger)>
	//   99  218:putfield        #507 <Field HttpRequestFactory httpRequestFactory>
			httpRequestFactory.setPinningInfoProvider(((io.fabric.sdk.android.services.network.PinningInfoProvider) (obj)));
	//  100  221:aload_0         
	//  101  222:getfield        #507 <Field HttpRequestFactory httpRequestFactory>
	//  102  225:aload           4
	//  103  227:invokeinterface #629 <Method void HttpRequestFactory.setPinningInfoProvider(io.fabric.sdk.android.services.network.PinningInfoProvider)>
			obj = ((Object) (getIdManager()));
	//  104  232:aload_0         
	//  105  233:invokevirtual   #491 <Method IdManager getIdManager()>
	//  106  236:astore          4
			obj2 = ((Object) (AppData.create(context, ((IdManager) (obj)), ((String) (obj2)), ((String) (obj3)))));
	//  107  238:aload_1         
	//  108  239:aload           4
	//  109  241:aload           7
	//  110  243:aload           8
	//  111  245:invokestatic    #634 <Method AppData AppData.create(Context, IdManager, String, String)>
	//  112  248:astore          7
			obj3 = ((Object) (new ResourceUnityVersionProvider(context, ((UnityVersionProvider) (new ManifestUnityVersionProvider(context, ((AppData) (obj2)).packageName))))));
	//  113  250:new             #636 <Class ResourceUnityVersionProvider>
	//  114  253:dup             
	//  115  254:aload_1         
	//  116  255:new             #638 <Class ManifestUnityVersionProvider>
	//  117  258:dup             
	//  118  259:aload_1         
	//  119  260:aload           7
	//  120  262:getfield        #641 <Field String AppData.packageName>
	//  121  265:invokespecial   #642 <Method void ManifestUnityVersionProvider(Context, String)>
	//  122  268:invokespecial   #645 <Method void ResourceUnityVersionProvider(Context, UnityVersionProvider)>
	//  123  271:astore          8
			AppMeasurementEventListenerRegistrar appmeasurementeventlistenerregistrar = DefaultAppMeasurementEventListenerRegistrar.instanceFrom(this);
	//  124  273:aload_0         
	//  125  274:invokestatic    #651 <Method AppMeasurementEventListenerRegistrar DefaultAppMeasurementEventListenerRegistrar.instanceFrom(CrashlyticsCore)>
	//  126  277:astore          9
			com.crashlytics.android.answers.EventLogger eventlogger = AppMeasurementEventLogger.getEventLogger(context);
	//  127  279:aload_1         
	//  128  280:invokestatic    #657 <Method com.crashlytics.android.answers.EventLogger AppMeasurementEventLogger.getEventLogger(Context)>
	//  129  283:astore          10
			Logger logger1 = Fabric.getLogger();
	//  130  285:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//  131  288:astore          11
			StringBuilder stringbuilder = new StringBuilder();
	//  132  290:new             #206 <Class StringBuilder>
	//  133  293:dup             
	//  134  294:invokespecial   #207 <Method void StringBuilder()>
	//  135  297:astore          12
			stringbuilder.append("Installer package name is: ");
	//  136  299:aload           12
	//  137  301:ldc2            #659 <String "Installer package name is: ">
	//  138  304:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  139  307:pop             
			stringbuilder.append(((AppData) (obj2)).installerPackageName);
	//  140  308:aload           12
	//  141  310:aload           7
	//  142  312:getfield        #662 <Field String AppData.installerPackageName>
	//  143  315:invokevirtual   #213 <Method StringBuilder StringBuilder.append(String)>
	//  144  318:pop             
			logger1.d("CrashlyticsCore", stringbuilder.toString());
	//  145  319:aload           11
	//  146  321:ldc1            #55  <String "CrashlyticsCore">
	//  147  323:aload           12
	//  148  325:invokevirtual   #217 <Method String StringBuilder.toString()>
	//  149  328:invokeinterface #275 <Method void Logger.d(String, String)>
			controller = new CrashlyticsController(this, backgroundWorker, httpRequestFactory, ((IdManager) (obj)), preferencemanager, ((io.fabric.sdk.android.services.persistence.FileStore) (obj1)), ((AppData) (obj2)), ((UnityVersionProvider) (obj3)), appmeasurementeventlistenerregistrar, eventlogger);
	//  150  333:aload_0         
	//  151  334:new             #196 <Class CrashlyticsController>
	//  152  337:dup             
	//  153  338:aload_0         
	//  154  339:aload_0         
	//  155  340:getfield        #122 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//  156  343:aload_0         
	//  157  344:getfield        #507 <Field HttpRequestFactory httpRequestFactory>
	//  158  347:aload           4
	//  159  349:aload           6
	//  160  351:aload           5
	//  161  353:aload           7
	//  162  355:aload           8
	//  163  357:aload           9
	//  164  359:aload           10
	//  165  361:invokespecial   #665 <Method void CrashlyticsController(CrashlyticsCore, CrashlyticsBackgroundWorker, HttpRequestFactory, IdManager, PreferenceManager, io.fabric.sdk.android.services.persistence.FileStore, AppData, UnityVersionProvider, AppMeasurementEventListenerRegistrar, com.crashlytics.android.answers.EventLogger)>
	//  166  364:putfield        #190 <Field CrashlyticsController controller>
			flag = didPreviousInitializationFail();
	//  167  367:aload_0         
	//  168  368:invokevirtual   #667 <Method boolean didPreviousInitializationFail()>
	//  169  371:istore_2        
			checkForPreviousCrash();
	//  170  372:aload_0         
	//  171  373:invokespecial   #669 <Method void checkForPreviousCrash()>
			boolean flag1 = (new FirebaseInfo()).isFirebaseCrashlyticsEnabled(context);
	//  172  376:new             #671 <Class FirebaseInfo>
	//  173  379:dup             
	//  174  380:invokespecial   #672 <Method void FirebaseInfo()>
	//  175  383:aload_1         
	//  176  384:invokevirtual   #675 <Method boolean FirebaseInfo.isFirebaseCrashlyticsEnabled(Context)>
	//  177  387:istore_3        
			controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler(), flag1);
	//  178  388:aload_0         
	//  179  389:getfield        #190 <Field CrashlyticsController controller>
	//  180  392:invokestatic    #679 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//  181  395:iload_3         
	//  182  396:invokevirtual   #683 <Method void CrashlyticsController.enableExceptionHandling(Thread$UncaughtExceptionHandler, boolean)>
		}
	//* 183  399:iload_2         
	//* 184  400:ifeq            429
	//* 185  403:aload_1         
	//* 186  404:invokestatic    #686 <Method boolean CommonUtils.canTryConnection(Context)>
	//* 187  407:ifeq            429
	//* 188  410:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//* 189  413:ldc1            #55  <String "CrashlyticsCore">
	//* 190  415:ldc2            #688 <String "Crashlytics did not finish previous background initialization. Initializing synchronously.">
	//* 191  418:invokeinterface #275 <Method void Logger.d(String, String)>
	//* 192  423:aload_0         
	//* 193  424:invokespecial   #690 <Method void finishInitSynchronously()>
	//* 194  427:iconst_0        
	//* 195  428:ireturn         
	//* 196  429:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//* 197  432:ldc1            #55  <String "CrashlyticsCore">
	//* 198  434:ldc2            #692 <String "Exception handling initialization successful">
	//* 199  437:invokeinterface #275 <Method void Logger.d(String, String)>
	//* 200  442:iconst_1        
	//* 201  443:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 202  444:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", ((Throwable) (context)));
	//  203  445:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//  204  448:ldc1            #55  <String "CrashlyticsCore">
	//  205  450:ldc2            #694 <String "Crashlytics was not started due to an exception during initialization">
	//  206  453:aload_1         
	//  207  454:invokeinterface #180 <Method void Logger.e(String, String, Throwable)>
			controller = null;
	//  208  459:aload_0         
	//  209  460:aconst_null     
	//  210  461:putfield        #190 <Field CrashlyticsController controller>
			return false;
	//  211  464:iconst_0        
	//  212  465:ireturn         
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_429;
		if(!CommonUtils.canTryConnection(context))
			break MISSING_BLOCK_LABEL_429;
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics did not finish previous background initialization. Initializing synchronously.");
		finishInitSynchronously();
		return false;
		Fabric.getLogger().d("CrashlyticsCore", "Exception handling initialization successful");
		return true;
_L2:
		throw new UnmetDependencyException("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
	//  213  466:new             #696 <Class UnmetDependencyException>
	//  214  469:dup             
	//  215  470:ldc1            #49  <String "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.">
	//  216  472:invokespecial   #698 <Method void UnmetDependencyException(String)>
	//  217  475:athrow          
_L4:
		obj = null;
	//  218  476:aconst_null     
	//  219  477:astore          4
		if(true) goto _L6; else goto _L5
	//  220  479:goto            207
_L5:
	}

	public void setBool(String s, boolean flag)
	{
		setString(s, Boolean.toString(flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #703 <Method String Boolean.toString(boolean)>
	//    4    6:invokevirtual   #706 <Method void setString(String, String)>
	//    5    9:return          
	}

	void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider crashlyticsndkdataprovider)
	{
		crashlyticsNdkDataProvider = crashlyticsndkdataprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #479 <Field CrashlyticsNdkDataProvider crashlyticsNdkDataProvider>
	//    3    5:return          
	}

	public void setDouble(String s, double d)
	{
		setString(s, Double.toString(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #715 <Method String Double.toString(double)>
	//    4    6:invokevirtual   #706 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setFloat(String s, float f)
	{
		setString(s, Float.toString(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #722 <Method String Float.toString(float)>
	//    4    6:invokevirtual   #706 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setInt(String s, int i)
	{
		setString(s, Integer.toString(i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #728 <Method String Integer.toString(int)>
	//    4    6:invokevirtual   #706 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setListener(CrashlyticsListener crashlyticslistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Fabric.getLogger().w("CrashlyticsCore", "Use of setListener is deprecated.");
	//    2    2:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//    3    5:ldc1            #55  <String "CrashlyticsCore">
	//    4    7:ldc2            #733 <String "Use of setListener is deprecated.">
	//    5   10:invokeinterface #402 <Method void Logger.w(String, String)>
		if(crashlyticslistener == null)
			break MISSING_BLOCK_LABEL_27;
	//    6   15:aload_1         
	//    7   16:ifnull          27
		listener = crashlyticslistener;
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:putfield        #111 <Field CrashlyticsListener listener>
		this;
	//   11   24:aload_0         
		JVM INSTR monitorexit ;
	//   12   25:monitorexit     
		return;
	//   13   26:return          
		throw new IllegalArgumentException("listener must not be null.");
	//   14   27:new             #735 <Class IllegalArgumentException>
	//   15   30:dup             
	//   16   31:ldc2            #737 <String "listener must not be null.">
	//   17   34:invokespecial   #738 <Method void IllegalArgumentException(String)>
	//   18   37:athrow          
		crashlyticslistener;
	//   19   38:astore_1        
		this;
	//   20   39:aload_0         
		JVM INSTR monitorexit ;
	//   21   40:monitorexit     
		throw crashlyticslistener;
	//   22   41:aload_1         
	//   23   42:athrow          
	}

	public void setLong(String s, long l)
	{
		setString(s, Long.toString(l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #746 <Method String Long.toString(long)>
	//    4    6:invokevirtual   #706 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setString(String s, String s1)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to setting keys."))
	//*   4    8:ldc2            #748 <String "prior to setting keys.">
	//*   5   11:invokestatic    #188 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
			return;
	//    7   17:return          
		if(s == null)
	//*   8   18:aload_1         
	//*   9   19:ifnonnull       67
		{
			s = ((String) (getContext()));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #426 <Method Context getContext()>
	//   12   26:astore_1        
			if(s != null && CommonUtils.isAppDebuggable(((Context) (s))))
	//*  13   27:aload_1         
	//*  14   28:ifnull          52
	//*  15   31:aload_1         
	//*  16   32:invokestatic    #751 <Method boolean CommonUtils.isAppDebuggable(Context)>
	//*  17   35:ifne            41
	//*  18   38:goto            52
			{
				throw new IllegalArgumentException("Custom attribute key must not be null.");
	//   19   41:new             #735 <Class IllegalArgumentException>
	//   20   44:dup             
	//   21   45:ldc2            #753 <String "Custom attribute key must not be null.">
	//   22   48:invokespecial   #738 <Method void IllegalArgumentException(String)>
	//   23   51:athrow          
			} else
			{
				Fabric.getLogger().e("CrashlyticsCore", "Attempting to set custom attribute with null key, ignoring.", ((Throwable) (null)));
	//   24   52:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   25   55:ldc1            #55  <String "CrashlyticsCore">
	//   26   57:ldc2            #755 <String "Attempting to set custom attribute with null key, ignoring.">
	//   27   60:aconst_null     
	//   28   61:invokeinterface #180 <Method void Logger.e(String, String, Throwable)>
				return;
	//   29   66:return          
			}
		}
		String s2 = sanitizeAttribute(s);
	//   30   67:aload_1         
	//   31   68:invokestatic    #757 <Method String sanitizeAttribute(String)>
	//   32   71:astore_3        
		if(attributes.size() >= 64 && !attributes.containsKey(((Object) (s2))))
	//*  33   72:aload_0         
	//*  34   73:getfield        #127 <Field ConcurrentHashMap attributes>
	//*  35   76:invokevirtual   #760 <Method int ConcurrentHashMap.size()>
	//*  36   79:bipush          64
	//*  37   81:icmplt          109
	//*  38   84:aload_0         
	//*  39   85:getfield        #127 <Field ConcurrentHashMap attributes>
	//*  40   88:aload_3         
	//*  41   89:invokevirtual   #763 <Method boolean ConcurrentHashMap.containsKey(Object)>
	//*  42   92:ifne            109
		{
			Fabric.getLogger().d("CrashlyticsCore", "Exceeded maximum number of custom attributes (64)");
	//   43   95:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//   44   98:ldc1            #55  <String "CrashlyticsCore">
	//   45  100:ldc2            #765 <String "Exceeded maximum number of custom attributes (64)">
	//   46  103:invokeinterface #275 <Method void Logger.d(String, String)>
			return;
	//   47  108:return          
		}
		if(s1 == null)
	//*  48  109:aload_2         
	//*  49  110:ifnonnull       120
			s = "";
	//   50  113:ldc2            #542 <String "">
	//   51  116:astore_1        
		else
	//*  52  117:goto            125
			s = sanitizeAttribute(s1);
	//   53  120:aload_2         
	//   54  121:invokestatic    #757 <Method String sanitizeAttribute(String)>
	//   55  124:astore_1        
		attributes.put(((Object) (s2)), ((Object) (s)));
	//   56  125:aload_0         
	//   57  126:getfield        #127 <Field ConcurrentHashMap attributes>
	//   58  129:aload_3         
	//   59  130:aload_1         
	//   60  131:invokevirtual   #769 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   61  134:pop             
		controller.cacheKeyData(((Map) (attributes)));
	//   62  135:aload_0         
	//   63  136:getfield        #190 <Field CrashlyticsController controller>
	//   64  139:aload_0         
	//   65  140:getfield        #127 <Field ConcurrentHashMap attributes>
	//   66  143:invokevirtual   #773 <Method void CrashlyticsController.cacheKeyData(Map)>
	//   67  146:return          
	}

	public void setUserEmail(String s)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to setting user data."))
	//*   4    8:ldc2            #776 <String "prior to setting user data.">
	//*   5   11:invokestatic    #188 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
		{
			return;
	//    7   17:return          
		} else
		{
			userEmail = sanitizeAttribute(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #757 <Method String sanitizeAttribute(String)>
	//   11   23:putfield        #102 <Field String userEmail>
			controller.cacheUserData(userId, userName, userEmail);
	//   12   26:aload_0         
	//   13   27:getfield        #190 <Field CrashlyticsController controller>
	//   14   30:aload_0         
	//   15   31:getfield        #100 <Field String userId>
	//   16   34:aload_0         
	//   17   35:getfield        #104 <Field String userName>
	//   18   38:aload_0         
	//   19   39:getfield        #102 <Field String userEmail>
	//   20   42:invokevirtual   #780 <Method void CrashlyticsController.cacheUserData(String, String, String)>
			return;
	//   21   45:return          
		}
	}

	public void setUserIdentifier(String s)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to setting user data."))
	//*   4    8:ldc2            #776 <String "prior to setting user data.">
	//*   5   11:invokestatic    #188 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
		{
			return;
	//    7   17:return          
		} else
		{
			userId = sanitizeAttribute(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #757 <Method String sanitizeAttribute(String)>
	//   11   23:putfield        #100 <Field String userId>
			controller.cacheUserData(userId, userName, userEmail);
	//   12   26:aload_0         
	//   13   27:getfield        #190 <Field CrashlyticsController controller>
	//   14   30:aload_0         
	//   15   31:getfield        #100 <Field String userId>
	//   16   34:aload_0         
	//   17   35:getfield        #104 <Field String userName>
	//   18   38:aload_0         
	//   19   39:getfield        #102 <Field String userEmail>
	//   20   42:invokevirtual   #780 <Method void CrashlyticsController.cacheUserData(String, String, String)>
			return;
	//   21   45:return          
		}
	}

	public void setUserName(String s)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to setting user data."))
	//*   4    8:ldc2            #776 <String "prior to setting user data.">
	//*   5   11:invokestatic    #188 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
		{
			return;
	//    7   17:return          
		} else
		{
			userName = sanitizeAttribute(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #757 <Method String sanitizeAttribute(String)>
	//   11   23:putfield        #104 <Field String userName>
			controller.cacheUserData(userId, userName, userEmail);
	//   12   26:aload_0         
	//   13   27:getfield        #190 <Field CrashlyticsController controller>
	//   14   30:aload_0         
	//   15   31:getfield        #100 <Field String userId>
	//   16   34:aload_0         
	//   17   35:getfield        #104 <Field String userName>
	//   18   38:aload_0         
	//   19   39:getfield        #102 <Field String userEmail>
	//   20   42:invokevirtual   #780 <Method void CrashlyticsController.cacheUserData(String, String, String)>
			return;
	//   21   45:return          
		}
	}

	public boolean verifyPinning(URL url)
	{
		boolean flag;
		try
		{
			flag = internalVerifyPinning(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #785 <Method boolean internalVerifyPinning(URL)>
	//    3    5:istore_2        
		}
	//*   4    6:iload_2         
	//*   5    7:ireturn         
		// Misplaced declaration of an exception variable
		catch(URL url)
	//*   6    8:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Could not verify SSL pinning", ((Throwable) (url)));
	//    7    9:invokestatic    #172 <Method Logger Fabric.getLogger()>
	//    8   12:ldc1            #55  <String "CrashlyticsCore">
	//    9   14:ldc2            #787 <String "Could not verify SSL pinning">
	//   10   17:aload_1         
	//   11   18:invokeinterface #180 <Method void Logger.e(String, String, Throwable)>
			return false;
	//   12   23:iconst_0        
	//   13   24:ireturn         
		}
		return flag;
	}

	static final float CLS_DEFAULT_PROCESS_DELAY = 1F;
	static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
	static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
	static final String CRASH_MARKER_FILE_NAME = "crash_marker";
	static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
	private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
	static final int MAX_ATTRIBUTES = 64;
	static final int MAX_ATTRIBUTE_SIZE = 1024;
	private static final String MISSING_BUILD_ID_MSG = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
	private static final String PREFERENCE_STORE_NAME = "com.crashlytics.android.core.CrashlyticsCore";
	public static final String TAG = "CrashlyticsCore";
	private final ConcurrentHashMap attributes;
	private CrashlyticsBackgroundWorker backgroundWorker;
	private CrashlyticsController controller;
	private CrashlyticsFileMarker crashMarker;
	private CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
	private float delay;
	private boolean disabled;
	private HttpRequestFactory httpRequestFactory;
	private CrashlyticsFileMarker initializationMarker;
	private CrashlyticsListener listener;
	private final PinningInfoProvider pinningInfo;
	private final long startTime;
	private String userEmail;
	private String userId;
	private String userName;


/*
	static CrashlyticsFileMarker access$100(CrashlyticsCore crashlyticscore)
	{
		return crashlyticscore.initializationMarker;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field CrashlyticsFileMarker initializationMarker>
	//    2    4:areturn         
	}

*/
}
