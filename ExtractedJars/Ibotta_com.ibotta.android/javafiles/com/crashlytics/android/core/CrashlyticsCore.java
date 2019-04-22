// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.core.internal.CrashEventDataProvider;
import com.crashlytics.android.core.internal.models.SessionEventData;
import io.fabric.sdk.android.*;
import io.fabric.sdk.android.services.common.*;
import io.fabric.sdk.android.services.concurrency.*;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsBackgroundWorker, CrashlyticsListener, CrashlyticsFileMarker, CrashlyticsController, 
//			PreferenceManager, CrashlyticsPinningInfoProvider, AppData, ManifestUnityVersionProvider, 
//			PinningInfoProvider

public class CrashlyticsCore extends Kit
{
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
	//    5    5:invokespecial   #54  <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean)>
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
	//    5    6:ldc1            #57  <String "Crashlytics Exception Handler">
	//    6    8:invokestatic    #63  <Method ExecutorService ExecutorUtils.buildSingleThreadExecutorService(String)>
	//    7   11:invokespecial   #66  <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean, ExecutorService)>
	//    8   14:return          
	}

	CrashlyticsCore(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag, ExecutorService executorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Kit()>
		userId = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #70  <Field String userId>
		userEmail = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #72  <Field String userEmail>
		userName = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #74  <Field String userName>
		delay = f;
	//   11   19:aload_0         
	//   12   20:fload_1         
	//   13   21:putfield        #76  <Field float delay>
		if(crashlyticslistener == null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          31
	//*  16   28:goto            40
			crashlyticslistener = ((CrashlyticsListener) (new NoOpListener()));
	//   17   31:new             #18  <Class CrashlyticsCore$NoOpListener>
	//   18   34:dup             
	//   19   35:aconst_null     
	//   20   36:invokespecial   #79  <Method void CrashlyticsCore$NoOpListener(CrashlyticsCore$1)>
	//   21   39:astore_2        
		listener = crashlyticslistener;
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:putfield        #81  <Field CrashlyticsListener listener>
		pinningInfo = pinninginfoprovider;
	//   25   45:aload_0         
	//   26   46:aload_3         
	//   27   47:putfield        #83  <Field PinningInfoProvider pinningInfo>
		disabled = flag;
	//   28   50:aload_0         
	//   29   51:iload           4
	//   30   53:putfield        #85  <Field boolean disabled>
		backgroundWorker = new CrashlyticsBackgroundWorker(executorservice);
	//   31   56:aload_0         
	//   32   57:new             #87  <Class CrashlyticsBackgroundWorker>
	//   33   60:dup             
	//   34   61:aload           5
	//   35   63:invokespecial   #90  <Method void CrashlyticsBackgroundWorker(ExecutorService)>
	//   36   66:putfield        #92  <Field CrashlyticsBackgroundWorker backgroundWorker>
		attributes = new ConcurrentHashMap();
	//   37   69:aload_0         
	//   38   70:new             #94  <Class ConcurrentHashMap>
	//   39   73:dup             
	//   40   74:invokespecial   #95  <Method void ConcurrentHashMap()>
	//   41   77:putfield        #97  <Field ConcurrentHashMap attributes>
		startTime = System.currentTimeMillis();
	//   42   80:aload_0         
	//   43   81:invokestatic    #103 <Method long System.currentTimeMillis()>
	//   44   84:putfield        #105 <Field long startTime>
	//   45   87:return          
	}

	private void checkForPreviousCrash()
	{
		Boolean boolean1 = (Boolean)backgroundWorker.submitAndWait(((Callable) (new CrashMarkerCheck(crashMarker))));
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #15  <Class CrashlyticsCore$CrashMarkerCheck>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #114 <Field CrashlyticsFileMarker crashMarker>
	//    6   12:invokespecial   #117 <Method void CrashlyticsCore$CrashMarkerCheck(CrashlyticsFileMarker)>
	//    7   15:invokevirtual   #121 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    8   18:checkcast       #123 <Class Boolean>
	//    9   21:astore_1        
		if(!Boolean.TRUE.equals(((Object) (boolean1))))
	//*  10   22:getstatic       #127 <Field Boolean Boolean.TRUE>
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #131 <Method boolean Boolean.equals(Object)>
	//*  13   29:ifne            33
			return;
	//   14   32:return          
		try
		{
			listener.crashlyticsDidDetectCrashDuringPreviousExecution();
	//   15   33:aload_0         
	//   16   34:getfield        #81  <Field CrashlyticsListener listener>
	//   17   37:invokeinterface #136 <Method void CrashlyticsListener.crashlyticsDidDetectCrashDuringPreviousExecution()>
			return;
	//   18   42:return          
		}
		catch(Exception exception)
	//*  19   43:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", ((Throwable) (exception)));
	//   20   44:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//   21   47:ldc1            #144 <String "CrashlyticsCore">
	//   22   49:ldc1            #146 <String "Exception thrown by CrashlyticsListener while notifying of previous crash.">
	//   23   51:aload_1         
	//   24   52:invokeinterface #152 <Method void Logger.e(String, String, Throwable)>
		}
	//   25   57:return          
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
	//    3    5:invokespecial   #162 <Method void CrashlyticsCore$1(CrashlyticsCore)>
	//    4    8:astore_1        
		for(Iterator iterator = getDependencies().iterator(); iterator.hasNext(); ((PriorityCallable) (obj)).addDependency((Task)iterator.next()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #166 <Method Collection getDependencies()>
	//    7   13:invokeinterface #172 <Method Iterator Collection.iterator()>
	//    8   18:astore_2        
	//    9   19:aload_2         
	//   10   20:invokeinterface #178 <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            44
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokeinterface #182 <Method Object Iterator.next()>
	//   15   35:checkcast       #184 <Class Task>
	//   16   38:invokevirtual   #190 <Method void PriorityCallable.addDependency(Task)>
	//*  17   41:goto            19
		obj = ((Object) (getFabric().getExecutorService().submit(((Callable) (obj)))));
	//   18   44:aload_0         
	//   19   45:invokevirtual   #194 <Method Fabric getFabric()>
	//   20   48:invokevirtual   #198 <Method ExecutorService Fabric.getExecutorService()>
	//   21   51:aload_1         
	//   22   52:invokeinterface #204 <Method Future ExecutorService.submit(Callable)>
	//   23   57:astore_1        
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
	//   24   58:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//   25   61:ldc1            #144 <String "CrashlyticsCore">
	//   26   63:ldc1            #206 <String "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.">
	//   27   65:invokeinterface #210 <Method void Logger.d(String, String)>
		try
		{
			((Future) (obj)).get(4L, TimeUnit.SECONDS);
	//   28   70:aload_1         
	//   29   71:ldc2w           #211 <Long 4L>
	//   30   74:getstatic       #218 <Field TimeUnit TimeUnit.SECONDS>
	//   31   77:invokeinterface #224 <Method Object Future.get(long, TimeUnit)>
	//   32   82:pop             
			return;
	//   33   83:return          
		}
	//*  34   84:astore_1        
	//*  35   85:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//*  36   88:ldc1            #144 <String "CrashlyticsCore">
	//*  37   90:ldc1            #226 <String "Crashlytics timed out during initialization.">
	//*  38   92:aload_1         
	//*  39   93:invokeinterface #152 <Method void Logger.e(String, String, Throwable)>
	//*  40   98:return          
	//*  41   99:astore_1        
	//*  42  100:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//*  43  103:ldc1            #144 <String "CrashlyticsCore">
	//*  44  105:ldc1            #228 <String "Problem encountered during Crashlytics initialization.">
	//*  45  107:aload_1         
	//*  46  108:invokeinterface #152 <Method void Logger.e(String, String, Throwable)>
	//*  47  113:return          
		catch(InterruptedException interruptedexception)
	//*  48  114:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Crashlytics was interrupted during initialization.", ((Throwable) (interruptedexception)));
	//   49  115:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//   50  118:ldc1            #144 <String "CrashlyticsCore">
	//   51  120:ldc1            #230 <String "Crashlytics was interrupted during initialization.">
	//   52  122:aload_1         
	//   53  123:invokeinterface #152 <Method void Logger.e(String, String, Throwable)>
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
	//   54  128:return          
	}

	static boolean isBuildIdValid(String s, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            18
		{
			Fabric.getLogger().d("CrashlyticsCore", "Configured not to require a build ID.");
	//    2    4:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//    3    7:ldc1            #144 <String "CrashlyticsCore">
	//    4    9:ldc1            #234 <String "Configured not to require a build ID.">
	//    5   11:invokeinterface #210 <Method void Logger.d(String, String)>
			return true;
	//    6   16:iconst_1        
	//    7   17:ireturn         
		}
		if(!CommonUtils.isNullOrEmpty(s))
	//*   8   18:aload_0         
	//*   9   19:invokestatic    #240 <Method boolean CommonUtils.isNullOrEmpty(String)>
	//*  10   22:ifne            27
		{
			return true;
	//   11   25:iconst_1        
	//   12   26:ireturn         
		} else
		{
			Log.e("CrashlyticsCore", ".");
	//   13   27:ldc1            #144 <String "CrashlyticsCore">
	//   14   29:ldc1            #242 <String ".">
	//   15   31:invokestatic    #247 <Method int Log.e(String, String)>
	//   16   34:pop             
			Log.e("CrashlyticsCore", ".     |  | ");
	//   17   35:ldc1            #144 <String "CrashlyticsCore">
	//   18   37:ldc1            #249 <String ".     |  | ">
	//   19   39:invokestatic    #247 <Method int Log.e(String, String)>
	//   20   42:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   21   43:ldc1            #144 <String "CrashlyticsCore">
	//   22   45:ldc1            #251 <String ".     |  |">
	//   23   47:invokestatic    #247 <Method int Log.e(String, String)>
	//   24   50:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   25   51:ldc1            #144 <String "CrashlyticsCore">
	//   26   53:ldc1            #251 <String ".     |  |">
	//   27   55:invokestatic    #247 <Method int Log.e(String, String)>
	//   28   58:pop             
			Log.e("CrashlyticsCore", ".   \\ |  | /");
	//   29   59:ldc1            #144 <String "CrashlyticsCore">
	//   30   61:ldc1            #253 <String ".   \\ |  | /">
	//   31   63:invokestatic    #247 <Method int Log.e(String, String)>
	//   32   66:pop             
			Log.e("CrashlyticsCore", ".    \\    /");
	//   33   67:ldc1            #144 <String "CrashlyticsCore">
	//   34   69:ldc1            #255 <String ".    \\    /">
	//   35   71:invokestatic    #247 <Method int Log.e(String, String)>
	//   36   74:pop             
			Log.e("CrashlyticsCore", ".     \\  /");
	//   37   75:ldc1            #144 <String "CrashlyticsCore">
	//   38   77:ldc2            #257 <String ".     \\  /">
	//   39   80:invokestatic    #247 <Method int Log.e(String, String)>
	//   40   83:pop             
			Log.e("CrashlyticsCore", ".      \\/");
	//   41   84:ldc1            #144 <String "CrashlyticsCore">
	//   42   86:ldc2            #259 <String ".      \\/">
	//   43   89:invokestatic    #247 <Method int Log.e(String, String)>
	//   44   92:pop             
			Log.e("CrashlyticsCore", ".");
	//   45   93:ldc1            #144 <String "CrashlyticsCore">
	//   46   95:ldc1            #242 <String ".">
	//   47   97:invokestatic    #247 <Method int Log.e(String, String)>
	//   48  100:pop             
			Log.e("CrashlyticsCore", "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
	//   49  101:ldc1            #144 <String "CrashlyticsCore">
	//   50  103:ldc2            #261 <String "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.">
	//   51  106:invokestatic    #247 <Method int Log.e(String, String)>
	//   52  109:pop             
			Log.e("CrashlyticsCore", ".");
	//   53  110:ldc1            #144 <String "CrashlyticsCore">
	//   54  112:ldc1            #242 <String ".">
	//   55  114:invokestatic    #247 <Method int Log.e(String, String)>
	//   56  117:pop             
			Log.e("CrashlyticsCore", ".      /\\");
	//   57  118:ldc1            #144 <String "CrashlyticsCore">
	//   58  120:ldc2            #263 <String ".      /\\">
	//   59  123:invokestatic    #247 <Method int Log.e(String, String)>
	//   60  126:pop             
			Log.e("CrashlyticsCore", ".     /  \\");
	//   61  127:ldc1            #144 <String "CrashlyticsCore">
	//   62  129:ldc2            #265 <String ".     /  \\">
	//   63  132:invokestatic    #247 <Method int Log.e(String, String)>
	//   64  135:pop             
			Log.e("CrashlyticsCore", ".    /    \\");
	//   65  136:ldc1            #144 <String "CrashlyticsCore">
	//   66  138:ldc2            #267 <String ".    /    \\">
	//   67  141:invokestatic    #247 <Method int Log.e(String, String)>
	//   68  144:pop             
			Log.e("CrashlyticsCore", ".   / |  | \\");
	//   69  145:ldc1            #144 <String "CrashlyticsCore">
	//   70  147:ldc2            #269 <String ".   / |  | \\">
	//   71  150:invokestatic    #247 <Method int Log.e(String, String)>
	//   72  153:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   73  154:ldc1            #144 <String "CrashlyticsCore">
	//   74  156:ldc1            #251 <String ".     |  |">
	//   75  158:invokestatic    #247 <Method int Log.e(String, String)>
	//   76  161:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   77  162:ldc1            #144 <String "CrashlyticsCore">
	//   78  164:ldc1            #251 <String ".     |  |">
	//   79  166:invokestatic    #247 <Method int Log.e(String, String)>
	//   80  169:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   81  170:ldc1            #144 <String "CrashlyticsCore">
	//   82  172:ldc1            #251 <String ".     |  |">
	//   83  174:invokestatic    #247 <Method int Log.e(String, String)>
	//   84  177:pop             
			Log.e("CrashlyticsCore", ".");
	//   85  178:ldc1            #144 <String "CrashlyticsCore">
	//   86  180:ldc1            #242 <String ".">
	//   87  182:invokestatic    #247 <Method int Log.e(String, String)>
	//   88  185:pop             
			return false;
	//   89  186:iconst_0        
	//   90  187:ireturn         
		}
	}

	void createCrashMarker()
	{
		crashMarker.create();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field CrashlyticsFileMarker crashMarker>
	//    2    4:invokevirtual   #275 <Method boolean CrashlyticsFileMarker.create()>
	//    3    7:pop             
	//    4    8:return          
	}

	boolean didPreviousInitializationFail()
	{
		return ((Boolean)backgroundWorker.submitAndWait(new Callable() {

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
	//    1    1:getfield        #92  <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #13  <Class CrashlyticsCore$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #277 <Method void CrashlyticsCore$4(CrashlyticsCore)>
	//    6   12:invokevirtual   #121 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    7   15:checkcast       #123 <Class Boolean>
	//    8   18:invokevirtual   #280 <Method boolean Boolean.booleanValue()>
	//    9   21:ireturn         
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #284 <Method Void doInBackground()>
	//    2    4:areturn         
	}

	protected Void doInBackground()
	{
		markInitializationStarted();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #287 <Method void markInitializationStarted()>
		SessionEventData sessioneventdata = getExternalCrashEventData();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #291 <Method SessionEventData getExternalCrashEventData()>
	//    4    8:astore_1        
		if(sessioneventdata != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			controller.writeExternalCrashEvent(sessioneventdata);
	//    7   13:aload_0         
	//    8   14:getfield        #293 <Field CrashlyticsController controller>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #299 <Method void CrashlyticsController.writeExternalCrashEvent(SessionEventData)>
		controller.cleanInvalidTempFiles();
	//   11   21:aload_0         
	//   12   22:getfield        #293 <Field CrashlyticsController controller>
	//   13   25:invokevirtual   #302 <Method void CrashlyticsController.cleanInvalidTempFiles()>
		SettingsData settingsdata = Settings.getInstance().awaitSettingsData();
	//   14   28:invokestatic    #308 <Method Settings Settings.getInstance()>
	//   15   31:invokevirtual   #312 <Method SettingsData Settings.awaitSettingsData()>
	//   16   34:astore_1        
		if(settingsdata != null)
			break MISSING_BLOCK_LABEL_58;
	//   17   35:aload_1         
	//   18   36:ifnonnull       58
		Fabric.getLogger().w("CrashlyticsCore", "Received null settings, skipping report submission!");
	//   19   39:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//   20   42:ldc1            #144 <String "CrashlyticsCore">
	//   21   44:ldc2            #314 <String "Received null settings, skipping report submission!">
	//   22   47:invokeinterface #317 <Method void Logger.w(String, String)>
		markInitializationComplete();
	//   23   52:aload_0         
	//   24   53:invokevirtual   #320 <Method void markInitializationComplete()>
		return null;
	//   25   56:aconst_null     
	//   26   57:areturn         
		if(settingsdata.featuresData.collectReports)
			break MISSING_BLOCK_LABEL_87;
	//   27   58:aload_1         
	//   28   59:getfield        #326 <Field FeaturesSettingsData SettingsData.featuresData>
	//   29   62:getfield        #331 <Field boolean FeaturesSettingsData.collectReports>
	//   30   65:ifne            87
		Fabric.getLogger().d("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
	//   31   68:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//   32   71:ldc1            #144 <String "CrashlyticsCore">
	//   33   73:ldc2            #333 <String "Collection of crash reports disabled in Crashlytics settings.">
	//   34   76:invokeinterface #210 <Method void Logger.d(String, String)>
		markInitializationComplete();
	//   35   81:aload_0         
	//   36   82:invokevirtual   #320 <Method void markInitializationComplete()>
		return null;
	//   37   85:aconst_null     
	//   38   86:areturn         
		Object obj;
		try
		{
			if(!controller.finalizeSessions(settingsdata.sessionData))
	//*  39   87:aload_0         
	//*  40   88:getfield        #293 <Field CrashlyticsController controller>
	//*  41   91:aload_1         
	//*  42   92:getfield        #337 <Field io.fabric.sdk.android.services.settings.SessionSettingsData SettingsData.sessionData>
	//*  43   95:invokevirtual   #341 <Method boolean CrashlyticsController.finalizeSessions(io.fabric.sdk.android.services.settings.SessionSettingsData)>
	//*  44   98:ifne            114
				Fabric.getLogger().d("CrashlyticsCore", "Could not finalize previous sessions.");
	//   45  101:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//   46  104:ldc1            #144 <String "CrashlyticsCore">
	//   47  106:ldc2            #343 <String "Could not finalize previous sessions.">
	//   48  109:invokeinterface #210 <Method void Logger.d(String, String)>
			controller.submitAllReports(delay, settingsdata);
	//   49  114:aload_0         
	//   50  115:getfield        #293 <Field CrashlyticsController controller>
	//   51  118:aload_0         
	//   52  119:getfield        #76  <Field float delay>
	//   53  122:aload_1         
	//   54  123:invokevirtual   #347 <Method void CrashlyticsController.submitAllReports(float, SettingsData)>
			break MISSING_BLOCK_LABEL_148;
	//   55  126:goto            148
		}
	//*  56  129:astore_1        
	//*  57  130:goto            154
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	//   58  133:astore_1        
		break MISSING_BLOCK_LABEL_134;
		obj;
		break MISSING_BLOCK_LABEL_154;
		Fabric.getLogger().e("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", ((Throwable) (obj)));
	//   59  134:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//   60  137:ldc1            #144 <String "CrashlyticsCore">
	//   61  139:ldc2            #349 <String "Crashlytics encountered a problem during asynchronous initialization.">
	//   62  142:aload_1         
	//   63  143:invokeinterface #152 <Method void Logger.e(String, String, Throwable)>
		markInitializationComplete();
	//   64  148:aload_0         
	//   65  149:invokevirtual   #320 <Method void markInitializationComplete()>
		return null;
	//   66  152:aconst_null     
	//   67  153:areturn         
		markInitializationComplete();
	//   68  154:aload_0         
	//   69  155:invokevirtual   #320 <Method void markInitializationComplete()>
		throw obj;
	//   70  158:aload_1         
	//   71  159:athrow          
	}

	Map getAttributes()
	{
		return Collections.unmodifiableMap(((Map) (attributes)));
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field ConcurrentHashMap attributes>
	//    2    4:invokestatic    #357 <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	SessionEventData getExternalCrashEventData()
	{
		CrashEventDataProvider crasheventdataprovider = externalCrashEventDataProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #361 <Field CrashEventDataProvider externalCrashEventDataProvider>
	//    2    4:astore_1        
		if(crasheventdataprovider != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return crasheventdataprovider.getCrashEventData();
	//    5    9:aload_1         
	//    6   10:invokeinterface #366 <Method SessionEventData CrashEventDataProvider.getCrashEventData()>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android.crashlytics-core";
	//    0    0:ldc2            #370 <String "com.crashlytics.sdk.android.crashlytics-core">
	//    1    3:areturn         
	}

	String getUserEmail()
	{
		if(getIdManager().canCollectUserIds())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #375 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #380 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userEmail;
	//    4   10:aload_0         
	//    5   11:getfield        #72  <Field String userEmail>
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
	//*   1    1:invokevirtual   #375 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #380 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userId;
	//    4   10:aload_0         
	//    5   11:getfield        #70  <Field String userId>
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
	//*   1    1:invokevirtual   #375 <Method IdManager getIdManager()>
	//*   2    4:invokevirtual   #380 <Method boolean IdManager.canCollectUserIds()>
	//*   3    7:ifeq            15
			return userName;
	//    4   10:aload_0         
	//    5   11:getfield        #74  <Field String userName>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public String getVersion()
	{
		return "2.3.17.dev";
	//    0    0:ldc2            #385 <String "2.3.17.dev">
	//    1    3:areturn         
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
	//    1    1:getfield        #92  <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #11  <Class CrashlyticsCore$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #386 <Method void CrashlyticsCore$3(CrashlyticsCore)>
	//    6   12:invokevirtual   #387 <Method Future CrashlyticsBackgroundWorker.submit(Callable)>
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
	//    1    1:getfield        #92  <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #9   <Class CrashlyticsCore$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #388 <Method void CrashlyticsCore$2(CrashlyticsCore)>
	//    6   12:invokevirtual   #121 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected boolean onPreExecute()
	{
		return onPreExecute(super.getContext());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #393 <Method Context Kit.getContext()>
	//    3    5:invokevirtual   #396 <Method boolean onPreExecute(Context)>
	//    4    8:ireturn         
	}

	boolean onPreExecute(Context context)
	{
		Object obj2;
		Object obj3;
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field boolean disabled>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj2 = ((Object) ((new ApiKey()).getValue(context)));
	//    5    9:new             #398 <Class ApiKey>
	//    6   12:dup             
	//    7   13:invokespecial   #399 <Method void ApiKey()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #403 <Method String ApiKey.getValue(Context)>
	//   10   20:astore          6
		if(obj2 == null)
	//*  11   22:aload           6
	//*  12   24:ifnonnull       29
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
		obj3 = ((Object) (CommonUtils.resolveBuildId(context)));
	//   15   29:aload_1         
	//   16   30:invokestatic    #406 <Method String CommonUtils.resolveBuildId(Context)>
	//   17   33:astore          7
		if(!isBuildIdValid(((String) (obj3)), CommonUtils.getBooleanResourceValue(context, "com.crashlytics.RequireBuildId", true))) goto _L2; else goto _L1
	//   18   35:aload           7
	//   19   37:aload_1         
	//   20   38:ldc2            #408 <String "com.crashlytics.RequireBuildId">
	//   21   41:iconst_1        
	//   22   42:invokestatic    #412 <Method boolean CommonUtils.getBooleanResourceValue(Context, String, boolean)>
	//   23   45:invokestatic    #414 <Method boolean isBuildIdValid(String, boolean)>
	//   24   48:ifeq            398
_L1:
		Object obj1;
		PreferenceManager preferencemanager;
		Logger logger = Fabric.getLogger();
	//   25   51:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//   26   54:astore_3        
		obj1 = ((Object) (new StringBuilder()));
	//   27   55:new             #416 <Class StringBuilder>
	//   28   58:dup             
	//   29   59:invokespecial   #417 <Method void StringBuilder()>
	//   30   62:astore          4
		((StringBuilder) (obj1)).append("Initializing Crashlytics ");
	//   31   64:aload           4
	//   32   66:ldc2            #419 <String "Initializing Crashlytics ">
	//   33   69:invokevirtual   #423 <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		((StringBuilder) (obj1)).append(getVersion());
	//   35   73:aload           4
	//   36   75:aload_0         
	//   37   76:invokevirtual   #425 <Method String getVersion()>
	//   38   79:invokevirtual   #423 <Method StringBuilder StringBuilder.append(String)>
	//   39   82:pop             
		logger.i("CrashlyticsCore", ((StringBuilder) (obj1)).toString());
	//   40   83:aload_3         
	//   41   84:ldc1            #144 <String "CrashlyticsCore">
	//   42   86:aload           4
	//   43   88:invokevirtual   #428 <Method String StringBuilder.toString()>
	//   44   91:invokeinterface #431 <Method void Logger.i(String, String)>
		obj1 = ((Object) (new FileStoreImpl(((Kit) (this)))));
	//   45   96:new             #433 <Class FileStoreImpl>
	//   46   99:dup             
	//   47  100:aload_0         
	//   48  101:invokespecial   #436 <Method void FileStoreImpl(Kit)>
	//   49  104:astore          4
		crashMarker = new CrashlyticsFileMarker("crash_marker", ((io.fabric.sdk.android.services.persistence.FileStore) (obj1)));
	//   50  106:aload_0         
	//   51  107:new             #272 <Class CrashlyticsFileMarker>
	//   52  110:dup             
	//   53  111:ldc2            #438 <String "crash_marker">
	//   54  114:aload           4
	//   55  116:invokespecial   #441 <Method void CrashlyticsFileMarker(String, io.fabric.sdk.android.services.persistence.FileStore)>
	//   56  119:putfield        #114 <Field CrashlyticsFileMarker crashMarker>
		initializationMarker = new CrashlyticsFileMarker("initialization_marker", ((io.fabric.sdk.android.services.persistence.FileStore) (obj1)));
	//   57  122:aload_0         
	//   58  123:new             #272 <Class CrashlyticsFileMarker>
	//   59  126:dup             
	//   60  127:ldc2            #443 <String "initialization_marker">
	//   61  130:aload           4
	//   62  132:invokespecial   #441 <Method void CrashlyticsFileMarker(String, io.fabric.sdk.android.services.persistence.FileStore)>
	//   63  135:putfield        #109 <Field CrashlyticsFileMarker initializationMarker>
		preferencemanager = PreferenceManager.create(((io.fabric.sdk.android.services.persistence.PreferenceStore) (new PreferenceStoreImpl(getContext(), "com.crashlytics.android.core.CrashlyticsCore"))), this);
	//   64  138:new             #445 <Class PreferenceStoreImpl>
	//   65  141:dup             
	//   66  142:aload_0         
	//   67  143:invokevirtual   #446 <Method Context getContext()>
	//   68  146:ldc2            #448 <String "com.crashlytics.android.core.CrashlyticsCore">
	//   69  149:invokespecial   #451 <Method void PreferenceStoreImpl(Context, String)>
	//   70  152:aload_0         
	//   71  153:invokestatic    #456 <Method PreferenceManager PreferenceManager.create(io.fabric.sdk.android.services.persistence.PreferenceStore, CrashlyticsCore)>
	//   72  156:astore          5
		if(pinningInfo == null) goto _L4; else goto _L3
	//   73  158:aload_0         
	//   74  159:getfield        #83  <Field PinningInfoProvider pinningInfo>
	//   75  162:ifnull          409
_L3:
		Object obj = ((Object) (new CrashlyticsPinningInfoProvider(pinningInfo)));
	//   76  165:new             #458 <Class CrashlyticsPinningInfoProvider>
	//   77  168:dup             
	//   78  169:aload_0         
	//   79  170:getfield        #83  <Field PinningInfoProvider pinningInfo>
	//   80  173:invokespecial   #461 <Method void CrashlyticsPinningInfoProvider(PinningInfoProvider)>
	//   81  176:astore_3        
	//*  82  177:goto            180
_L6:
		boolean flag;
		try
		{
			httpRequestFactory = ((HttpRequestFactory) (new DefaultHttpRequestFactory(Fabric.getLogger())));
	//   83  180:aload_0         
	//   84  181:new             #463 <Class DefaultHttpRequestFactory>
	//   85  184:dup             
	//   86  185:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//   87  188:invokespecial   #466 <Method void DefaultHttpRequestFactory(Logger)>
	//   88  191:putfield        #468 <Field HttpRequestFactory httpRequestFactory>
			httpRequestFactory.setPinningInfoProvider(((io.fabric.sdk.android.services.network.PinningInfoProvider) (obj)));
	//   89  194:aload_0         
	//   90  195:getfield        #468 <Field HttpRequestFactory httpRequestFactory>
	//   91  198:aload_3         
	//   92  199:invokeinterface #474 <Method void HttpRequestFactory.setPinningInfoProvider(io.fabric.sdk.android.services.network.PinningInfoProvider)>
			obj = ((Object) (getIdManager()));
	//   93  204:aload_0         
	//   94  205:invokevirtual   #375 <Method IdManager getIdManager()>
	//   95  208:astore_3        
			obj2 = ((Object) (AppData.create(context, ((IdManager) (obj)), ((String) (obj2)), ((String) (obj3)))));
	//   96  209:aload_1         
	//   97  210:aload_3         
	//   98  211:aload           6
	//   99  213:aload           7
	//  100  215:invokestatic    #479 <Method AppData AppData.create(Context, IdManager, String, String)>
	//  101  218:astore          6
			obj3 = ((Object) (new ManifestUnityVersionProvider(context, ((AppData) (obj2)).packageName)));
	//  102  220:new             #481 <Class ManifestUnityVersionProvider>
	//  103  223:dup             
	//  104  224:aload_1         
	//  105  225:aload           6
	//  106  227:getfield        #484 <Field String AppData.packageName>
	//  107  230:invokespecial   #485 <Method void ManifestUnityVersionProvider(Context, String)>
	//  108  233:astore          7
			Logger logger1 = Fabric.getLogger();
	//  109  235:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//  110  238:astore          8
			StringBuilder stringbuilder = new StringBuilder();
	//  111  240:new             #416 <Class StringBuilder>
	//  112  243:dup             
	//  113  244:invokespecial   #417 <Method void StringBuilder()>
	//  114  247:astore          9
			stringbuilder.append("Installer package name is: ");
	//  115  249:aload           9
	//  116  251:ldc2            #487 <String "Installer package name is: ">
	//  117  254:invokevirtual   #423 <Method StringBuilder StringBuilder.append(String)>
	//  118  257:pop             
			stringbuilder.append(((AppData) (obj2)).installerPackageName);
	//  119  258:aload           9
	//  120  260:aload           6
	//  121  262:getfield        #490 <Field String AppData.installerPackageName>
	//  122  265:invokevirtual   #423 <Method StringBuilder StringBuilder.append(String)>
	//  123  268:pop             
			logger1.d("CrashlyticsCore", stringbuilder.toString());
	//  124  269:aload           8
	//  125  271:ldc1            #144 <String "CrashlyticsCore">
	//  126  273:aload           9
	//  127  275:invokevirtual   #428 <Method String StringBuilder.toString()>
	//  128  278:invokeinterface #210 <Method void Logger.d(String, String)>
			controller = new CrashlyticsController(this, backgroundWorker, httpRequestFactory, ((IdManager) (obj)), preferencemanager, ((io.fabric.sdk.android.services.persistence.FileStore) (obj1)), ((AppData) (obj2)), ((UnityVersionProvider) (obj3)));
	//  129  283:aload_0         
	//  130  284:new             #295 <Class CrashlyticsController>
	//  131  287:dup             
	//  132  288:aload_0         
	//  133  289:aload_0         
	//  134  290:getfield        #92  <Field CrashlyticsBackgroundWorker backgroundWorker>
	//  135  293:aload_0         
	//  136  294:getfield        #468 <Field HttpRequestFactory httpRequestFactory>
	//  137  297:aload_3         
	//  138  298:aload           5
	//  139  300:aload           4
	//  140  302:aload           6
	//  141  304:aload           7
	//  142  306:invokespecial   #493 <Method void CrashlyticsController(CrashlyticsCore, CrashlyticsBackgroundWorker, HttpRequestFactory, IdManager, PreferenceManager, io.fabric.sdk.android.services.persistence.FileStore, AppData, UnityVersionProvider)>
	//  143  309:putfield        #293 <Field CrashlyticsController controller>
			flag = didPreviousInitializationFail();
	//  144  312:aload_0         
	//  145  313:invokevirtual   #495 <Method boolean didPreviousInitializationFail()>
	//  146  316:istore_2        
			checkForPreviousCrash();
	//  147  317:aload_0         
	//  148  318:invokespecial   #497 <Method void checkForPreviousCrash()>
			controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler());
	//  149  321:aload_0         
	//  150  322:getfield        #293 <Field CrashlyticsController controller>
	//  151  325:invokestatic    #503 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//  152  328:invokevirtual   #507 <Method void CrashlyticsController.enableExceptionHandling(Thread$UncaughtExceptionHandler)>
		}
	//* 153  331:iload_2         
	//* 154  332:ifeq            361
	//* 155  335:aload_1         
	//* 156  336:invokestatic    #510 <Method boolean CommonUtils.canTryConnection(Context)>
	//* 157  339:ifeq            361
	//* 158  342:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//* 159  345:ldc1            #144 <String "CrashlyticsCore">
	//* 160  347:ldc2            #512 <String "Crashlytics did not finish previous background initialization. Initializing synchronously.">
	//* 161  350:invokeinterface #210 <Method void Logger.d(String, String)>
	//* 162  355:aload_0         
	//* 163  356:invokespecial   #514 <Method void finishInitSynchronously()>
	//* 164  359:iconst_0        
	//* 165  360:ireturn         
	//* 166  361:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//* 167  364:ldc1            #144 <String "CrashlyticsCore">
	//* 168  366:ldc2            #516 <String "Exception handling initialization successful">
	//* 169  369:invokeinterface #210 <Method void Logger.d(String, String)>
	//* 170  374:iconst_1        
	//* 171  375:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 172  376:astore_1        
		{
			Fabric.getLogger().e("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", ((Throwable) (context)));
	//  173  377:invokestatic    #142 <Method Logger Fabric.getLogger()>
	//  174  380:ldc1            #144 <String "CrashlyticsCore">
	//  175  382:ldc2            #518 <String "Crashlytics was not started due to an exception during initialization">
	//  176  385:aload_1         
	//  177  386:invokeinterface #152 <Method void Logger.e(String, String, Throwable)>
			controller = null;
	//  178  391:aload_0         
	//  179  392:aconst_null     
	//  180  393:putfield        #293 <Field CrashlyticsController controller>
			return false;
	//  181  396:iconst_0        
	//  182  397:ireturn         
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_361;
		if(!CommonUtils.canTryConnection(context))
			break MISSING_BLOCK_LABEL_361;
		Fabric.getLogger().d("CrashlyticsCore", "Crashlytics did not finish previous background initialization. Initializing synchronously.");
		finishInitSynchronously();
		return false;
		Fabric.getLogger().d("CrashlyticsCore", "Exception handling initialization successful");
		return true;
_L2:
		throw new UnmetDependencyException("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
	//  183  398:new             #520 <Class UnmetDependencyException>
	//  184  401:dup             
	//  185  402:ldc2            #261 <String "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.">
	//  186  405:invokespecial   #523 <Method void UnmetDependencyException(String)>
	//  187  408:athrow          
_L4:
		obj = null;
	//  188  409:aconst_null     
	//  189  410:astore_3        
		if(true) goto _L6; else goto _L5
	//  190  411:goto            180
_L5:
	}

	void setExternalCrashEventDataProvider(CrashEventDataProvider crasheventdataprovider)
	{
		externalCrashEventDataProvider = crasheventdataprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #361 <Field CrashEventDataProvider externalCrashEventDataProvider>
	//    3    5:return          
	}

	private final ConcurrentHashMap attributes;
	private CrashlyticsBackgroundWorker backgroundWorker;
	private CrashlyticsController controller;
	private CrashlyticsFileMarker crashMarker;
	private float delay;
	private boolean disabled;
	private CrashEventDataProvider externalCrashEventDataProvider;
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
	//    1    1:getfield        #109 <Field CrashlyticsFileMarker initializationMarker>
	//    2    4:areturn         
	}

*/
}
