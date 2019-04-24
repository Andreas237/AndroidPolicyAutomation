// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import b.a.a.a.a.b.n;
import b.a.a.a.a.b.o;
import b.a.a.a.a.b.p;
import b.a.a.a.a.c.g;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.a.f.b;
import b.a.a.a.a.g.m;
import b.a.a.a.a.g.q;
import b.a.a.a.a.g.t;
import b.a.a.a.c;
import b.a.a.a.i;
import b.a.a.a.l;
import com.crashlytics.android.answers.AppMeasurementEventLogger;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsBackgroundWorker, CrashlyticsListener, CrashlyticsController, CrashTest, 
//			CrashlyticsFileMarker, CrashlyticsNdkDataProvider, PreferenceManager, CrashlyticsPinningInfoProvider, 
//			AppData, ManifestUnityVersionProvider, DefaultAppMeasurementEventListenerRegistrar, PinningInfoProvider, 
//			CrashlyticsNdkData

public class CrashlyticsCore extends i
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
		{
			if(!crashMarker.isPresent())
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field CrashlyticsFileMarker crashMarker>
		//*   2    4:invokevirtual   #28  <Method boolean CrashlyticsFileMarker.isPresent()>
		//*   3    7:ifne            14
			{
				return Boolean.FALSE;
		//    4   10:getstatic       #34  <Field Boolean Boolean.FALSE>
		//    5   13:areturn         
			} else
			{
				c.g().a("CrashlyticsCore", "Found previous crash marker.");
		//    6   14:invokestatic    #40  <Method l c.g()>
		//    7   17:ldc1            #42  <String "CrashlyticsCore">
		//    8   19:ldc1            #44  <String "Found previous crash marker.">
		//    9   21:invokeinterface #50  <Method void l.a(String, String)>
				crashMarker.remove();
		//   10   26:aload_0         
		//   11   27:getfield        #19  <Field CrashlyticsFileMarker crashMarker>
		//   12   30:invokevirtual   #53  <Method boolean CrashlyticsFileMarker.remove()>
		//   13   33:pop             
				return Boolean.TRUE;
		//   14   34:getstatic       #56  <Field Boolean Boolean.TRUE>
		//   15   37:areturn         
			}
		}

		public volatile Object call()
		{
			return ((Object) (call()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #59  <Method Boolean call()>
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
		this(f, crashlyticslistener, pinninginfoprovider, flag, n.a("Crashlytics Exception Handler"));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:ldc1            #87  <String "Crashlytics Exception Handler">
	//    6    8:invokestatic    #92  <Method ExecutorService n.a(String)>
	//    7   11:invokespecial   #95  <Method void CrashlyticsCore(float, CrashlyticsListener, PinningInfoProvider, boolean, ExecutorService)>
	//    8   14:return          
	}

	CrashlyticsCore(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag, ExecutorService executorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #97  <Method void i()>
		userId = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #99  <Field String userId>
		userEmail = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #101 <Field String userEmail>
		userName = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #103 <Field String userName>
		delay = f;
	//   11   19:aload_0         
	//   12   20:fload_1         
	//   13   21:putfield        #105 <Field float delay>
		if(crashlyticslistener == null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          31
	//*  16   28:goto            40
			crashlyticslistener = ((CrashlyticsListener) (new NoOpListener()));
	//   17   31:new             #19  <Class CrashlyticsCore$NoOpListener>
	//   18   34:dup             
	//   19   35:aconst_null     
	//   20   36:invokespecial   #108 <Method void CrashlyticsCore$NoOpListener(CrashlyticsCore$1)>
	//   21   39:astore_2        
		listener = crashlyticslistener;
	//   22   40:aload_0         
	//   23   41:aload_2         
	//   24   42:putfield        #110 <Field CrashlyticsListener listener>
		pinningInfo = pinninginfoprovider;
	//   25   45:aload_0         
	//   26   46:aload_3         
	//   27   47:putfield        #112 <Field PinningInfoProvider pinningInfo>
		disabled = flag;
	//   28   50:aload_0         
	//   29   51:iload           4
	//   30   53:putfield        #114 <Field boolean disabled>
		backgroundWorker = new CrashlyticsBackgroundWorker(executorservice);
	//   31   56:aload_0         
	//   32   57:new             #116 <Class CrashlyticsBackgroundWorker>
	//   33   60:dup             
	//   34   61:aload           5
	//   35   63:invokespecial   #119 <Method void CrashlyticsBackgroundWorker(ExecutorService)>
	//   36   66:putfield        #121 <Field CrashlyticsBackgroundWorker backgroundWorker>
		attributes = new ConcurrentHashMap();
	//   37   69:aload_0         
	//   38   70:new             #123 <Class ConcurrentHashMap>
	//   39   73:dup             
	//   40   74:invokespecial   #124 <Method void ConcurrentHashMap()>
	//   41   77:putfield        #126 <Field ConcurrentHashMap attributes>
		startTime = System.currentTimeMillis();
	//   42   80:aload_0         
	//   43   81:invokestatic    #132 <Method long System.currentTimeMillis()>
	//   44   84:putfield        #134 <Field long startTime>
	//   45   87:return          
	}

	private void checkForPreviousCrash()
	{
		Boolean boolean1 = (Boolean)backgroundWorker.submitAndWait(((Callable) (new CrashMarkerCheck(crashMarker))));
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #16  <Class CrashlyticsCore$CrashMarkerCheck>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #143 <Field CrashlyticsFileMarker crashMarker>
	//    6   12:invokespecial   #146 <Method void CrashlyticsCore$CrashMarkerCheck(CrashlyticsFileMarker)>
	//    7   15:invokevirtual   #150 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    8   18:checkcast       #152 <Class Boolean>
	//    9   21:astore_1        
		if(!Boolean.TRUE.equals(((Object) (boolean1))))
	//*  10   22:getstatic       #156 <Field Boolean Boolean.TRUE>
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #160 <Method boolean Boolean.equals(Object)>
	//*  13   29:ifne            33
			return;
	//   14   32:return          
		try
		{
			listener.crashlyticsDidDetectCrashDuringPreviousExecution();
	//   15   33:aload_0         
	//   16   34:getfield        #110 <Field CrashlyticsListener listener>
	//   17   37:invokeinterface #165 <Method void CrashlyticsListener.crashlyticsDidDetectCrashDuringPreviousExecution()>
			return;
	//   18   42:return          
		}
		catch(Exception exception)
	//*  19   43:astore_1        
		{
			c.g().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", ((Throwable) (exception)));
	//   20   44:invokestatic    #171 <Method l c.g()>
	//   21   47:ldc1            #55  <String "CrashlyticsCore">
	//   22   49:ldc1            #173 <String "Exception thrown by CrashlyticsListener while notifying of previous crash.">
	//   23   51:aload_1         
	//   24   52:invokeinterface #179 <Method void l.e(String, String, Throwable)>
		}
	//   25   57:return          
	}

	private void doLog(int j, String s, String s1)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to logging messages."))
	//*   4    8:ldc1            #183 <String "prior to logging messages.">
	//*   5   10:invokestatic    #187 <Method boolean ensureFabricWithCalled(String)>
	//*   6   13:ifne            17
		{
			return;
	//    7   16:return          
		} else
		{
			long l1 = System.currentTimeMillis();
	//    8   17:invokestatic    #132 <Method long System.currentTimeMillis()>
	//    9   20:lstore          4
			long l2 = startTime;
	//   10   22:aload_0         
	//   11   23:getfield        #134 <Field long startTime>
	//   12   26:lstore          6
			controller.writeToLog(l1 - l2, formatLogMessage(j, s, s1));
	//   13   28:aload_0         
	//   14   29:getfield        #189 <Field CrashlyticsController controller>
	//   15   32:lload           4
	//   16   34:lload           6
	//   17   36:lsub            
	//   18   37:iload_1         
	//   19   38:aload_2         
	//   20   39:aload_3         
	//   21   40:invokestatic    #193 <Method String formatLogMessage(int, String, String)>
	//   22   43:invokevirtual   #199 <Method void CrashlyticsController.writeToLog(long, String)>
			return;
	//   23   46:return          
		}
	}

	private static boolean ensureFabricWithCalled(String s)
	{
		CrashlyticsCore crashlyticscore = getInstance();
	//    0    0:invokestatic    #203 <Method CrashlyticsCore getInstance()>
	//    1    3:astore_1        
		if(crashlyticscore != null && crashlyticscore.controller != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          20
	//*   4    8:aload_1         
	//*   5    9:getfield        #189 <Field CrashlyticsController controller>
	//*   6   12:ifnonnull       18
	//*   7   15:goto            20
		{
			return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
		} else
		{
			l l1 = c.g();
	//   10   20:invokestatic    #171 <Method l c.g()>
	//   11   23:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #205 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #206 <Method void StringBuilder()>
	//   15   31:astore_2        
			stringbuilder.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
	//   16   32:aload_2         
	//   17   33:ldc1            #208 <String "Crashlytics must be initialized by calling Fabric.with(Context) ">
	//   18   35:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(s);
	//   20   39:aload_2         
	//   21   40:aload_0         
	//   22   41:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			l1.e("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (null)));
	//   24   45:aload_1         
	//   25   46:ldc1            #55  <String "CrashlyticsCore">
	//   26   48:aload_2         
	//   27   49:invokevirtual   #216 <Method String StringBuilder.toString()>
	//   28   52:aconst_null     
	//   29   53:invokeinterface #179 <Method void l.e(String, String, Throwable)>
			return false;
	//   30   58:iconst_0        
	//   31   59:ireturn         
		}
	}

	private void finishInitSynchronously()
	{
		Object obj;
		obj = ((Object) (new g() {

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #24  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
			{
				return doInBackground();
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CrashlyticsCore this$0>
			//    2    4:invokevirtual   #27  <Method Void CrashlyticsCore.doInBackground()>
			//    3    7:areturn         
			}

			public b.a.a.a.a.c.e getPriority()
			{
				return b.a.a.a.a.c.e.IMMEDIATE;
			//    0    0:getstatic       #35  <Field b.a.a.a.a.c.e b.a.a.a.a.c.e.IMMEDIATE>
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
			//    4    6:invokespecial   #18  <Method void g()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #7   <Class CrashlyticsCore$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #226 <Method void CrashlyticsCore$1(CrashlyticsCore)>
	//    4    8:astore_1        
		for(Iterator iterator = getDependencies().iterator(); iterator.hasNext(); ((g) (obj)).addDependency((b.a.a.a.a.c.l)iterator.next()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #230 <Method Collection getDependencies()>
	//    7   13:invokeinterface #236 <Method Iterator Collection.iterator()>
	//    8   18:astore_2        
	//    9   19:aload_2         
	//   10   20:invokeinterface #242 <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            44
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokeinterface #246 <Method Object Iterator.next()>
	//   15   35:checkcast       #248 <Class b.a.a.a.a.c.l>
	//   16   38:invokevirtual   #254 <Method void g.addDependency(b.a.a.a.a.c.l)>
	//*  17   41:goto            19
		obj = ((Object) (getFabric().e().submit(((Callable) (obj)))));
	//   18   44:aload_0         
	//   19   45:invokevirtual   #258 <Method c getFabric()>
	//   20   48:invokevirtual   #261 <Method ExecutorService c.e()>
	//   21   51:aload_1         
	//   22   52:invokeinterface #267 <Method Future ExecutorService.submit(Callable)>
	//   23   57:astore_1        
		c.g().a("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
	//   24   58:invokestatic    #171 <Method l c.g()>
	//   25   61:ldc1            #55  <String "CrashlyticsCore">
	//   26   63:ldc2            #269 <String "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.">
	//   27   66:invokeinterface #272 <Method void l.a(String, String)>
		((Future) (obj)).get(4L, TimeUnit.SECONDS);
	//   28   71:aload_1         
	//   29   72:ldc2w           #273 <Long 4L>
	//   30   75:getstatic       #280 <Field TimeUnit TimeUnit.SECONDS>
	//   31   78:invokeinterface #286 <Method Object Future.get(long, TimeUnit)>
	//   32   83:pop             
		return;
	//   33   84:return          
		Object obj1;
		obj1;
	//   34   85:astore_1        
		l l1;
		String s;
		l1 = c.g();
	//   35   86:invokestatic    #171 <Method l c.g()>
	//   36   89:astore_2        
		s = "Crashlytics timed out during initialization.";
	//   37   90:ldc2            #288 <String "Crashlytics timed out during initialization.">
	//   38   93:astore_3        
		break MISSING_BLOCK_LABEL_118;
	//   39   94:goto            118
		obj1;
	//   40   97:astore_1        
		l1 = c.g();
	//   41   98:invokestatic    #171 <Method l c.g()>
	//   42  101:astore_2        
		s = "Problem encountered during Crashlytics initialization.";
	//   43  102:ldc2            #290 <String "Problem encountered during Crashlytics initialization.">
	//   44  105:astore_3        
		break MISSING_BLOCK_LABEL_118;
	//   45  106:goto            118
		obj1;
	//   46  109:astore_1        
		l1 = c.g();
	//   47  110:invokestatic    #171 <Method l c.g()>
	//   48  113:astore_2        
		s = "Crashlytics was interrupted during initialization.";
	//   49  114:ldc2            #292 <String "Crashlytics was interrupted during initialization.">
	//   50  117:astore_3        
		l1.e("CrashlyticsCore", s, ((Throwable) (obj1)));
	//   51  118:aload_2         
	//   52  119:ldc1            #55  <String "CrashlyticsCore">
	//   53  121:aload_3         
	//   54  122:aload_1         
	//   55  123:invokeinterface #179 <Method void l.e(String, String, Throwable)>
		return;
	//   56  128:return          
	}

	private static String formatLogMessage(int j, String s, String s1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #205 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #206 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append(b.a.a.a.a.b.i.b(j));
	//    4    8:aload_3         
	//    5    9:iload_0         
	//    6   10:invokestatic    #298 <Method String b.a.a.a.a.b.i.b(int)>
	//    7   13:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append("/");
	//    9   17:aload_3         
	//   10   18:ldc2            #300 <String "/">
	//   11   21:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(s);
	//   13   25:aload_3         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(" ");
	//   17   31:aload_3         
	//   18   32:ldc2            #302 <String " ">
	//   19   35:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append(s1);
	//   21   39:aload_3         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
		return stringbuilder.toString();
	//   25   45:aload_3         
	//   26   46:invokevirtual   #216 <Method String StringBuilder.toString()>
	//   27   49:areturn         
	}

	public static CrashlyticsCore getInstance()
	{
		return (CrashlyticsCore)c.a(com/crashlytics/android/core/CrashlyticsCore);
	//    0    0:ldc1            #2   <Class CrashlyticsCore>
	//    1    2:invokestatic    #305 <Method i c.a(Class)>
	//    2    5:checkcast       #2   <Class CrashlyticsCore>
	//    3    8:areturn         
	}

	static boolean isBuildIdValid(String s, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            19
		{
			c.g().a("CrashlyticsCore", "Configured not to require a build ID.");
	//    2    4:invokestatic    #171 <Method l c.g()>
	//    3    7:ldc1            #55  <String "CrashlyticsCore">
	//    4    9:ldc2            #309 <String "Configured not to require a build ID.">
	//    5   12:invokeinterface #272 <Method void l.a(String, String)>
			return true;
	//    6   17:iconst_1        
	//    7   18:ireturn         
		}
		if(!b.a.a.a.a.b.i.d(s))
	//*   8   19:aload_0         
	//*   9   20:invokestatic    #312 <Method boolean b.a.a.a.a.b.i.d(String)>
	//*  10   23:ifne            28
		{
			return true;
	//   11   26:iconst_1        
	//   12   27:ireturn         
		} else
		{
			Log.e("CrashlyticsCore", ".");
	//   13   28:ldc1            #55  <String "CrashlyticsCore">
	//   14   30:ldc2            #314 <String ".">
	//   15   33:invokestatic    #319 <Method int Log.e(String, String)>
	//   16   36:pop             
			Log.e("CrashlyticsCore", ".     |  | ");
	//   17   37:ldc1            #55  <String "CrashlyticsCore">
	//   18   39:ldc2            #321 <String ".     |  | ">
	//   19   42:invokestatic    #319 <Method int Log.e(String, String)>
	//   20   45:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   21   46:ldc1            #55  <String "CrashlyticsCore">
	//   22   48:ldc2            #323 <String ".     |  |">
	//   23   51:invokestatic    #319 <Method int Log.e(String, String)>
	//   24   54:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   25   55:ldc1            #55  <String "CrashlyticsCore">
	//   26   57:ldc2            #323 <String ".     |  |">
	//   27   60:invokestatic    #319 <Method int Log.e(String, String)>
	//   28   63:pop             
			Log.e("CrashlyticsCore", ".   \\ |  | /");
	//   29   64:ldc1            #55  <String "CrashlyticsCore">
	//   30   66:ldc2            #325 <String ".   \\ |  | /">
	//   31   69:invokestatic    #319 <Method int Log.e(String, String)>
	//   32   72:pop             
			Log.e("CrashlyticsCore", ".    \\    /");
	//   33   73:ldc1            #55  <String "CrashlyticsCore">
	//   34   75:ldc2            #327 <String ".    \\    /">
	//   35   78:invokestatic    #319 <Method int Log.e(String, String)>
	//   36   81:pop             
			Log.e("CrashlyticsCore", ".     \\  /");
	//   37   82:ldc1            #55  <String "CrashlyticsCore">
	//   38   84:ldc2            #329 <String ".     \\  /">
	//   39   87:invokestatic    #319 <Method int Log.e(String, String)>
	//   40   90:pop             
			Log.e("CrashlyticsCore", ".      \\/");
	//   41   91:ldc1            #55  <String "CrashlyticsCore">
	//   42   93:ldc2            #331 <String ".      \\/">
	//   43   96:invokestatic    #319 <Method int Log.e(String, String)>
	//   44   99:pop             
			Log.e("CrashlyticsCore", ".");
	//   45  100:ldc1            #55  <String "CrashlyticsCore">
	//   46  102:ldc2            #314 <String ".">
	//   47  105:invokestatic    #319 <Method int Log.e(String, String)>
	//   48  108:pop             
			Log.e("CrashlyticsCore", "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
	//   49  109:ldc1            #55  <String "CrashlyticsCore">
	//   50  111:ldc1            #49  <String "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.">
	//   51  113:invokestatic    #319 <Method int Log.e(String, String)>
	//   52  116:pop             
			Log.e("CrashlyticsCore", ".");
	//   53  117:ldc1            #55  <String "CrashlyticsCore">
	//   54  119:ldc2            #314 <String ".">
	//   55  122:invokestatic    #319 <Method int Log.e(String, String)>
	//   56  125:pop             
			Log.e("CrashlyticsCore", ".      /\\");
	//   57  126:ldc1            #55  <String "CrashlyticsCore">
	//   58  128:ldc2            #333 <String ".      /\\">
	//   59  131:invokestatic    #319 <Method int Log.e(String, String)>
	//   60  134:pop             
			Log.e("CrashlyticsCore", ".     /  \\");
	//   61  135:ldc1            #55  <String "CrashlyticsCore">
	//   62  137:ldc2            #335 <String ".     /  \\">
	//   63  140:invokestatic    #319 <Method int Log.e(String, String)>
	//   64  143:pop             
			Log.e("CrashlyticsCore", ".    /    \\");
	//   65  144:ldc1            #55  <String "CrashlyticsCore">
	//   66  146:ldc2            #337 <String ".    /    \\">
	//   67  149:invokestatic    #319 <Method int Log.e(String, String)>
	//   68  152:pop             
			Log.e("CrashlyticsCore", ".   / |  | \\");
	//   69  153:ldc1            #55  <String "CrashlyticsCore">
	//   70  155:ldc2            #339 <String ".   / |  | \\">
	//   71  158:invokestatic    #319 <Method int Log.e(String, String)>
	//   72  161:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   73  162:ldc1            #55  <String "CrashlyticsCore">
	//   74  164:ldc2            #323 <String ".     |  |">
	//   75  167:invokestatic    #319 <Method int Log.e(String, String)>
	//   76  170:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   77  171:ldc1            #55  <String "CrashlyticsCore">
	//   78  173:ldc2            #323 <String ".     |  |">
	//   79  176:invokestatic    #319 <Method int Log.e(String, String)>
	//   80  179:pop             
			Log.e("CrashlyticsCore", ".     |  |");
	//   81  180:ldc1            #55  <String "CrashlyticsCore">
	//   82  182:ldc2            #323 <String ".     |  |">
	//   83  185:invokestatic    #319 <Method int Log.e(String, String)>
	//   84  188:pop             
			Log.e("CrashlyticsCore", ".");
	//   85  189:ldc1            #55  <String "CrashlyticsCore">
	//   86  191:ldc2            #314 <String ".">
	//   87  194:invokestatic    #319 <Method int Log.e(String, String)>
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
	//    5    7:invokevirtual   #346 <Method String String.trim()>
	//    6   10:astore_0        
			s1 = s;
	//    7   11:aload_0         
	//    8   12:astore_1        
			if(s.length() > 1024)
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #350 <Method int String.length()>
	//*  11   17:sipush          1024
	//*  12   20:icmple          32
				s1 = s.substring(0, 1024);
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:sipush          1024
	//   16   28:invokevirtual   #354 <Method String String.substring(int, int)>
	//   17   31:astore_1        
		}
		return s1;
	//   18   32:aload_1         
	//   19   33:areturn         
	}

	public void crash()
	{
		(new CrashTest()).indexOutOfBounds();
	//    0    0:new             #357 <Class CrashTest>
	//    1    3:dup             
	//    2    4:invokespecial   #358 <Method void CrashTest()>
	//    3    7:invokevirtual   #361 <Method void CrashTest.indexOutOfBounds()>
	//    4   10:return          
	}

	void createCrashMarker()
	{
		crashMarker.create();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field CrashlyticsFileMarker crashMarker>
	//    2    4:invokevirtual   #367 <Method boolean CrashlyticsFileMarker.create()>
	//    3    7:pop             
	//    4    8:return          
	}

	boolean didPreviousInitializationFail()
	{
		return initializationMarker.isPresent();
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field CrashlyticsFileMarker initializationMarker>
	//    2    4:invokevirtual   #371 <Method boolean CrashlyticsFileMarker.isPresent()>
	//    3    7:ireturn         
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #375 <Method Void doInBackground()>
	//    2    4:areturn         
	}

	protected Void doInBackground()
	{
		markInitializationStarted();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #378 <Method void markInitializationStarted()>
		controller.cleanInvalidTempFiles();
	//    2    4:aload_0         
	//    3    5:getfield        #189 <Field CrashlyticsController controller>
	//    4    8:invokevirtual   #381 <Method void CrashlyticsController.cleanInvalidTempFiles()>
		t t1;
		controller.registerDevicePowerStateListener();
	//    5   11:aload_0         
	//    6   12:getfield        #189 <Field CrashlyticsController controller>
	//    7   15:invokevirtual   #384 <Method void CrashlyticsController.registerDevicePowerStateListener()>
		t1 = q.a().b();
	//    8   18:invokestatic    #389 <Method q q.a()>
	//    9   21:invokevirtual   #392 <Method t q.b()>
	//   10   24:astore_1        
		if(t1 != null)
			break MISSING_BLOCK_LABEL_48;
	//   11   25:aload_1         
	//   12   26:ifnonnull       48
		c.g().d("CrashlyticsCore", "Received null settings, skipping report submission!");
	//   13   29:invokestatic    #171 <Method l c.g()>
	//   14   32:ldc1            #55  <String "CrashlyticsCore">
	//   15   34:ldc2            #394 <String "Received null settings, skipping report submission!">
	//   16   37:invokeinterface #396 <Method void l.d(String, String)>
		markInitializationComplete();
	//   17   42:aload_0         
	//   18   43:invokevirtual   #399 <Method void markInitializationComplete()>
		return null;
	//   19   46:aconst_null     
	//   20   47:areturn         
		controller.registerAnalyticsEventListener(t1);
	//   21   48:aload_0         
	//   22   49:getfield        #189 <Field CrashlyticsController controller>
	//   23   52:aload_1         
	//   24   53:invokevirtual   #403 <Method void CrashlyticsController.registerAnalyticsEventListener(t)>
		if(t1.d.c)
			break MISSING_BLOCK_LABEL_85;
	//   25   56:aload_1         
	//   26   57:getfield        #408 <Field m t.d>
	//   27   60:getfield        #413 <Field boolean m.c>
	//   28   63:ifne            85
		c.g().a("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
	//   29   66:invokestatic    #171 <Method l c.g()>
	//   30   69:ldc1            #55  <String "CrashlyticsCore">
	//   31   71:ldc2            #415 <String "Collection of crash reports disabled in Crashlytics settings.">
	//   32   74:invokeinterface #272 <Method void l.a(String, String)>
		markInitializationComplete();
	//   33   79:aload_0         
	//   34   80:invokevirtual   #399 <Method void markInitializationComplete()>
		return null;
	//   35   83:aconst_null     
	//   36   84:areturn         
		CrashlyticsNdkData crashlyticsndkdata = getNativeCrashData();
	//   37   85:aload_0         
	//   38   86:invokevirtual   #419 <Method CrashlyticsNdkData getNativeCrashData()>
	//   39   89:astore_2        
		if(crashlyticsndkdata == null)
			break MISSING_BLOCK_LABEL_118;
	//   40   90:aload_2         
	//   41   91:ifnull          118
		if(!controller.finalizeNativeReport(crashlyticsndkdata))
	//*  42   94:aload_0         
	//*  43   95:getfield        #189 <Field CrashlyticsController controller>
	//*  44   98:aload_2         
	//*  45   99:invokevirtual   #423 <Method boolean CrashlyticsController.finalizeNativeReport(CrashlyticsNdkData)>
	//*  46  102:ifne            118
			c.g().a("CrashlyticsCore", "Could not finalize previous NDK sessions.");
	//   47  105:invokestatic    #171 <Method l c.g()>
	//   48  108:ldc1            #55  <String "CrashlyticsCore">
	//   49  110:ldc2            #425 <String "Could not finalize previous NDK sessions.">
	//   50  113:invokeinterface #272 <Method void l.a(String, String)>
		if(!controller.finalizeSessions(t1.b))
	//*  51  118:aload_0         
	//*  52  119:getfield        #189 <Field CrashlyticsController controller>
	//*  53  122:aload_1         
	//*  54  123:getfield        #428 <Field b.a.a.a.a.g.p t.b>
	//*  55  126:invokevirtual   #432 <Method boolean CrashlyticsController.finalizeSessions(b.a.a.a.a.g.p)>
	//*  56  129:ifne            145
			c.g().a("CrashlyticsCore", "Could not finalize previous sessions.");
	//   57  132:invokestatic    #171 <Method l c.g()>
	//   58  135:ldc1            #55  <String "CrashlyticsCore">
	//   59  137:ldc2            #434 <String "Could not finalize previous sessions.">
	//   60  140:invokeinterface #272 <Method void l.a(String, String)>
		controller.submitAllReports(delay, t1);
	//   61  145:aload_0         
	//   62  146:getfield        #189 <Field CrashlyticsController controller>
	//   63  149:aload_0         
	//   64  150:getfield        #105 <Field float delay>
	//   65  153:aload_1         
	//   66  154:invokevirtual   #438 <Method void CrashlyticsController.submitAllReports(float, t)>
		break MISSING_BLOCK_LABEL_179;
	//   67  157:goto            179
		Object obj;
		obj;
	//   68  160:astore_1        
		break MISSING_BLOCK_LABEL_185;
	//   69  161:goto            185
		obj;
	//   70  164:astore_1        
		c.g().e("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", ((Throwable) (obj)));
	//   71  165:invokestatic    #171 <Method l c.g()>
	//   72  168:ldc1            #55  <String "CrashlyticsCore">
	//   73  170:ldc2            #440 <String "Crashlytics encountered a problem during asynchronous initialization.">
	//   74  173:aload_1         
	//   75  174:invokeinterface #179 <Method void l.e(String, String, Throwable)>
		markInitializationComplete();
	//   76  179:aload_0         
	//   77  180:invokevirtual   #399 <Method void markInitializationComplete()>
		return null;
	//   78  183:aconst_null     
	//   79  184:areturn         
		markInitializationComplete();
	//   80  185:aload_0         
	//   81  186:invokevirtual   #399 <Method void markInitializationComplete()>
		throw obj;
	//   82  189:aload_1         
	//   83  190:athrow          
	}

	Map getAttributes()
	{
		return Collections.unmodifiableMap(((Map) (attributes)));
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field ConcurrentHashMap attributes>
	//    2    4:invokestatic    #448 <Method Map Collections.unmodifiableMap(Map)>
	//    3    7:areturn         
	}

	CrashlyticsController getController()
	{
		return controller;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field CrashlyticsController controller>
	//    2    4:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android.crashlytics-core";
	//    0    0:ldc2            #455 <String "com.crashlytics.sdk.android.crashlytics-core">
	//    1    3:areturn         
	}

	CrashlyticsNdkData getNativeCrashData()
	{
		if(crashlyticsNdkDataProvider != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #457 <Field CrashlyticsNdkDataProvider crashlyticsNdkDataProvider>
	//*   2    4:ifnull          17
			return crashlyticsNdkDataProvider.getCrashlyticsNdkData();
	//    3    7:aload_0         
	//    4    8:getfield        #457 <Field CrashlyticsNdkDataProvider crashlyticsNdkDataProvider>
	//    5   11:invokeinterface #462 <Method CrashlyticsNdkData CrashlyticsNdkDataProvider.getCrashlyticsNdkData()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	public PinningInfoProvider getPinningInfoProvider()
	{
		if(!disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean disabled>
	//*   2    4:ifne            12
			return pinningInfo;
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field PinningInfoProvider pinningInfo>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	String getUserEmail()
	{
		if(getIdManager().a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #469 <Method p getIdManager()>
	//*   2    4:invokevirtual   #473 <Method boolean p.a()>
	//*   3    7:ifeq            15
			return userEmail;
	//    4   10:aload_0         
	//    5   11:getfield        #101 <Field String userEmail>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	String getUserIdentifier()
	{
		if(getIdManager().a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #469 <Method p getIdManager()>
	//*   2    4:invokevirtual   #473 <Method boolean p.a()>
	//*   3    7:ifeq            15
			return userId;
	//    4   10:aload_0         
	//    5   11:getfield        #99  <Field String userId>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	String getUserName()
	{
		if(getIdManager().a())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #469 <Method p getIdManager()>
	//*   2    4:invokevirtual   #473 <Method boolean p.a()>
	//*   3    7:ifeq            15
			return userName;
	//    4   10:aload_0         
	//    5   11:getfield        #103 <Field String userName>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public String getVersion()
	{
		return "2.6.3.25";
	//    0    0:ldc2            #478 <String "2.6.3.25">
	//    1    3:areturn         
	}

	boolean internalVerifyPinning(URL url)
	{
		if(getPinningInfoProvider() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #482 <Method PinningInfoProvider getPinningInfoProvider()>
	//*   2    4:ifnull          42
		{
			url = ((URL) (httpRequestFactory.a(b.a.a.a.a.e.c.GET, url.toString())));
	//    3    7:aload_0         
	//    4    8:getfield        #484 <Field e httpRequestFactory>
	//    5   11:getstatic       #490 <Field b.a.a.a.a.e.c b.a.a.a.a.e.c.GET>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #493 <Method String URL.toString()>
	//    8   18:invokeinterface #498 <Method d e.a(b.a.a.a.a.e.c, String)>
	//    9   23:astore_1        
			((HttpsURLConnection)((d) (url)).a()).setInstanceFollowRedirects(false);
	//   10   24:aload_1         
	//   11   25:invokevirtual   #503 <Method java.net.HttpURLConnection d.a()>
	//   12   28:checkcast       #505 <Class HttpsURLConnection>
	//   13   31:iconst_0        
	//   14   32:invokevirtual   #509 <Method void HttpsURLConnection.setInstanceFollowRedirects(boolean)>
			((d) (url)).b();
	//   15   35:aload_1         
	//   16   36:invokevirtual   #511 <Method int d.b()>
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

	public void log(int j, String s, String s1)
	{
		doLog(j, s, s1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #514 <Method void doLog(int, String, String)>
		l l1 = c.g();
	//    5    7:invokestatic    #171 <Method l c.g()>
	//    6   10:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    7   12:new             #205 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #206 <Method void StringBuilder()>
	//   10   19:astore          5
		stringbuilder.append("");
	//   11   21:aload           5
	//   12   23:ldc2            #516 <String "">
	//   13   26:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(s);
	//   15   30:aload           5
	//   16   32:aload_2         
	//   17   33:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		s = stringbuilder.toString();
	//   19   37:aload           5
	//   20   39:invokevirtual   #216 <Method String StringBuilder.toString()>
	//   21   42:astore_2        
		stringbuilder = new StringBuilder();
	//   22   43:new             #205 <Class StringBuilder>
	//   23   46:dup             
	//   24   47:invokespecial   #206 <Method void StringBuilder()>
	//   25   50:astore          5
		stringbuilder.append("");
	//   26   52:aload           5
	//   27   54:ldc2            #516 <String "">
	//   28   57:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		stringbuilder.append(s1);
	//   30   61:aload           5
	//   31   63:aload_3         
	//   32   64:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
		l1.a(j, s, stringbuilder.toString(), true);
	//   34   68:aload           4
	//   35   70:iload_1         
	//   36   71:aload_2         
	//   37   72:aload           5
	//   38   74:invokevirtual   #216 <Method String StringBuilder.toString()>
	//   39   77:iconst_1        
	//   40   78:invokeinterface #519 <Method void l.a(int, String, String, boolean)>
	//   41   83:return          
	}

	public void log(String s)
	{
		doLog(3, "CrashlyticsCore", s);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:ldc1            #55  <String "CrashlyticsCore">
	//    3    4:aload_1         
	//    4    5:invokespecial   #514 <Method void doLog(int, String, String)>
	//    5    8:return          
	}

	public void logException(Throwable throwable)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to logging exceptions."))
	//*   4    8:ldc2            #524 <String "prior to logging exceptions.">
	//*   5   11:invokestatic    #187 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
			return;
	//    7   17:return          
		if(throwable == null)
	//*   8   18:aload_1         
	//*   9   19:ifnonnull       37
		{
			c.g().a(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
	//   10   22:invokestatic    #171 <Method l c.g()>
	//   11   25:iconst_5        
	//   12   26:ldc1            #55  <String "CrashlyticsCore">
	//   13   28:ldc2            #526 <String "Crashlytics is ignoring a request to log a null exception.">
	//   14   31:invokeinterface #528 <Method void l.a(int, String, String)>
			return;
	//   15   36:return          
		} else
		{
			controller.writeNonFatalException(Thread.currentThread(), throwable);
	//   16   37:aload_0         
	//   17   38:getfield        #189 <Field CrashlyticsController controller>
	//   18   41:invokestatic    #534 <Method Thread Thread.currentThread()>
	//   19   44:aload_1         
	//   20   45:invokevirtual   #538 <Method void CrashlyticsController.writeNonFatalException(Thread, Throwable)>
			return;
	//   21   48:return          
		}
	}

	void markInitializationComplete()
	{
		backgroundWorker.submit(new Callable() {

			public Boolean call()
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
					l l1 = c.g();
			//    5   11:invokestatic    #41  <Method l c.g()>
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
					l1.a("CrashlyticsCore", stringbuilder.toString());
			//   19   36:aload_2         
			//   20   37:ldc1            #55  <String "CrashlyticsCore">
			//   21   39:aload_3         
			//   22   40:invokevirtual   #59  <Method String StringBuilder.toString()>
			//   23   43:invokeinterface #65  <Method void l.a(String, String)>
				}
			//*  24   48:iload_1         
			//*  25   49:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
			//*  26   52:areturn         
				catch(Exception exception)
			//*  27   53:astore_2        
				{
					c.g().e("CrashlyticsCore", "Problem encountered deleting Crashlytics initialization marker.", ((Throwable) (exception)));
			//   28   54:invokestatic    #41  <Method l c.g()>
			//   29   57:ldc1            #55  <String "CrashlyticsCore">
			//   30   59:ldc1            #73  <String "Problem encountered deleting Crashlytics initialization marker.">
			//   31   61:aload_2         
			//   32   62:invokeinterface #77  <Method void l.e(String, String, Throwable)>
					return Boolean.valueOf(false);
			//   33   67:iconst_0        
			//   34   68:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
			//   35   71:areturn         
				}
				return Boolean.valueOf(flag);
			}

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #80  <Method Boolean call()>
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
	//    1    1:getfield        #121 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #11  <Class CrashlyticsCore$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #539 <Method void CrashlyticsCore$3(CrashlyticsCore)>
	//    6   12:invokevirtual   #540 <Method Future CrashlyticsBackgroundWorker.submit(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	void markInitializationStarted()
	{
		backgroundWorker.submitAndWait(new Callable() {

			public volatile Object call()
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #26  <Method Void call()>
			//    2    4:areturn         
			}

			public Void call()
			{
				initializationMarker.create();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
			//    2    4:invokestatic    #30  <Method CrashlyticsFileMarker CrashlyticsCore.access$100(CrashlyticsCore)>
			//    3    7:invokevirtual   #36  <Method boolean CrashlyticsFileMarker.create()>
			//    4   10:pop             
				c.g().a("CrashlyticsCore", "Initialization marker file created.");
			//    5   11:invokestatic    #42  <Method l c.g()>
			//    6   14:ldc1            #44  <String "CrashlyticsCore">
			//    7   16:ldc1            #46  <String "Initialization marker file created.">
			//    8   18:invokeinterface #52  <Method void l.a(String, String)>
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
	//    1    1:getfield        #121 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//    2    4:new             #9   <Class CrashlyticsCore$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #541 <Method void CrashlyticsCore$2(CrashlyticsCore)>
	//    6   12:invokevirtual   #150 <Method Object CrashlyticsBackgroundWorker.submitAndWait(Callable)>
	//    7   15:pop             
	//    8   16:return          
	}

	protected boolean onPreExecute()
	{
		return onPreExecute(super.getContext());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #546 <Method Context i.getContext()>
	//    3    5:invokevirtual   #549 <Method boolean onPreExecute(Context)>
	//    4    8:ireturn         
	}

	boolean onPreExecute(Context context)
	{
		Object obj2;
		Object obj3;
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean disabled>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj2 = ((Object) ((new b.a.a.a.a.b.g()).a(context)));
	//    5    9:new             #551 <Class b.a.a.a.a.b.g>
	//    6   12:dup             
	//    7   13:invokespecial   #552 <Method void b.a.a.a.a.b.g()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #555 <Method String b.a.a.a.a.b.g.a(Context)>
	//   10   20:astore          7
		if(obj2 == null)
	//*  11   22:aload           7
	//*  12   24:ifnonnull       29
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
		obj3 = ((Object) (b.a.a.a.a.b.i.m(context)));
	//   15   29:aload_1         
	//   16   30:invokestatic    #558 <Method String b.a.a.a.a.b.i.m(Context)>
	//   17   33:astore          8
		if(!isBuildIdValid(((String) (obj3)), b.a.a.a.a.b.i.a(context, "com.crashlytics.RequireBuildId", true)))
	//*  18   35:aload           8
	//*  19   37:aload_1         
	//*  20   38:ldc1            #30  <String "com.crashlytics.RequireBuildId">
	//*  21   40:iconst_1        
	//*  22   41:invokestatic    #561 <Method boolean b.a.a.a.a.b.i.a(Context, String, boolean)>
	//*  23   44:invokestatic    #563 <Method boolean isBuildIdValid(String, boolean)>
	//*  24   47:ifne            60
			throw new b.a.a.a.a.c.m("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
	//   25   50:new             #565 <Class b.a.a.a.a.c.m>
	//   26   53:dup             
	//   27   54:ldc1            #49  <String "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.">
	//   28   56:invokespecial   #567 <Method void b.a.a.a.a.c.m(String)>
	//   29   59:athrow          
		Object obj1;
		PreferenceManager preferencemanager;
		l l1 = c.g();
	//   30   60:invokestatic    #171 <Method l c.g()>
	//   31   63:astore          4
		obj1 = ((Object) (new StringBuilder()));
	//   32   65:new             #205 <Class StringBuilder>
	//   33   68:dup             
	//   34   69:invokespecial   #206 <Method void StringBuilder()>
	//   35   72:astore          5
		((StringBuilder) (obj1)).append("Initializing Crashlytics ");
	//   36   74:aload           5
	//   37   76:ldc2            #569 <String "Initializing Crashlytics ">
	//   38   79:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   39   82:pop             
		((StringBuilder) (obj1)).append(getVersion());
	//   40   83:aload           5
	//   41   85:aload_0         
	//   42   86:invokevirtual   #571 <Method String getVersion()>
	//   43   89:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//   44   92:pop             
		l1.c("CrashlyticsCore", ((StringBuilder) (obj1)).toString());
	//   45   93:aload           4
	//   46   95:ldc1            #55  <String "CrashlyticsCore">
	//   47   97:aload           5
	//   48   99:invokevirtual   #216 <Method String StringBuilder.toString()>
	//   49  102:invokeinterface #573 <Method void l.c(String, String)>
		obj1 = ((Object) (new b(((i) (this)))));
	//   50  107:new             #575 <Class b>
	//   51  110:dup             
	//   52  111:aload_0         
	//   53  112:invokespecial   #578 <Method void b(i)>
	//   54  115:astore          5
		crashMarker = new CrashlyticsFileMarker("crash_marker", ((b.a.a.a.a.f.a) (obj1)));
	//   55  117:aload_0         
	//   56  118:new             #364 <Class CrashlyticsFileMarker>
	//   57  121:dup             
	//   58  122:ldc1            #36  <String "crash_marker">
	//   59  124:aload           5
	//   60  126:invokespecial   #581 <Method void CrashlyticsFileMarker(String, b.a.a.a.a.f.a)>
	//   61  129:putfield        #143 <Field CrashlyticsFileMarker crashMarker>
		initializationMarker = new CrashlyticsFileMarker("initialization_marker", ((b.a.a.a.a.f.a) (obj1)));
	//   62  132:aload_0         
	//   63  133:new             #364 <Class CrashlyticsFileMarker>
	//   64  136:dup             
	//   65  137:ldc1            #42  <String "initialization_marker">
	//   66  139:aload           5
	//   67  141:invokespecial   #581 <Method void CrashlyticsFileMarker(String, b.a.a.a.a.f.a)>
	//   68  144:putfield        #138 <Field CrashlyticsFileMarker initializationMarker>
		preferencemanager = PreferenceManager.create(((b.a.a.a.a.f.c) (new b.a.a.a.a.f.d(getContext(), "com.crashlytics.android.core.CrashlyticsCore"))), this);
	//   69  147:new             #583 <Class b.a.a.a.a.f.d>
	//   70  150:dup             
	//   71  151:aload_0         
	//   72  152:invokevirtual   #584 <Method Context getContext()>
	//   73  155:ldc1            #52  <String "com.crashlytics.android.core.CrashlyticsCore">
	//   74  157:invokespecial   #587 <Method void b.a.a.a.a.f.d(Context, String)>
	//   75  160:aload_0         
	//   76  161:invokestatic    #592 <Method PreferenceManager PreferenceManager.create(b.a.a.a.a.f.c, CrashlyticsCore)>
	//   77  164:astore          6
		if(pinningInfo == null) goto _L2; else goto _L1
	//   78  166:aload_0         
	//   79  167:getfield        #112 <Field PinningInfoProvider pinningInfo>
	//   80  170:ifnull          440
_L1:
		Object obj = ((Object) (new CrashlyticsPinningInfoProvider(pinningInfo)));
	//   81  173:new             #594 <Class CrashlyticsPinningInfoProvider>
	//   82  176:dup             
	//   83  177:aload_0         
	//   84  178:getfield        #112 <Field PinningInfoProvider pinningInfo>
	//   85  181:invokespecial   #597 <Method void CrashlyticsPinningInfoProvider(PinningInfoProvider)>
	//   86  184:astore          4
	//*  87  186:goto            189
_L4:
		boolean flag;
		try
		{
			httpRequestFactory = ((e) (new b.a.a.a.a.e.b(c.g())));
	//   88  189:aload_0         
	//   89  190:new             #599 <Class b.a.a.a.a.e.b>
	//   90  193:dup             
	//   91  194:invokestatic    #171 <Method l c.g()>
	//   92  197:invokespecial   #602 <Method void b.a.a.a.a.e.b(l)>
	//   93  200:putfield        #484 <Field e httpRequestFactory>
			httpRequestFactory.a(((b.a.a.a.a.e.g) (obj)));
	//   94  203:aload_0         
	//   95  204:getfield        #484 <Field e httpRequestFactory>
	//   96  207:aload           4
	//   97  209:invokeinterface #605 <Method void e.a(b.a.a.a.a.e.g)>
			obj = ((Object) (getIdManager()));
	//   98  214:aload_0         
	//   99  215:invokevirtual   #469 <Method p getIdManager()>
	//  100  218:astore          4
			obj2 = ((Object) (AppData.create(context, ((p) (obj)), ((String) (obj2)), ((String) (obj3)))));
	//  101  220:aload_1         
	//  102  221:aload           4
	//  103  223:aload           7
	//  104  225:aload           8
	//  105  227:invokestatic    #610 <Method AppData AppData.create(Context, p, String, String)>
	//  106  230:astore          7
			obj3 = ((Object) (new ManifestUnityVersionProvider(context, ((AppData) (obj2)).packageName)));
	//  107  232:new             #612 <Class ManifestUnityVersionProvider>
	//  108  235:dup             
	//  109  236:aload_1         
	//  110  237:aload           7
	//  111  239:getfield        #615 <Field String AppData.packageName>
	//  112  242:invokespecial   #616 <Method void ManifestUnityVersionProvider(Context, String)>
	//  113  245:astore          8
			AppMeasurementEventListenerRegistrar appmeasurementeventlistenerregistrar = DefaultAppMeasurementEventListenerRegistrar.instanceFrom(this);
	//  114  247:aload_0         
	//  115  248:invokestatic    #622 <Method AppMeasurementEventListenerRegistrar DefaultAppMeasurementEventListenerRegistrar.instanceFrom(CrashlyticsCore)>
	//  116  251:astore          9
			com.crashlytics.android.answers.EventLogger eventlogger = AppMeasurementEventLogger.getEventLogger(context);
	//  117  253:aload_1         
	//  118  254:invokestatic    #628 <Method com.crashlytics.android.answers.EventLogger AppMeasurementEventLogger.getEventLogger(Context)>
	//  119  257:astore          10
			l l2 = c.g();
	//  120  259:invokestatic    #171 <Method l c.g()>
	//  121  262:astore          11
			StringBuilder stringbuilder = new StringBuilder();
	//  122  264:new             #205 <Class StringBuilder>
	//  123  267:dup             
	//  124  268:invokespecial   #206 <Method void StringBuilder()>
	//  125  271:astore          12
			stringbuilder.append("Installer package name is: ");
	//  126  273:aload           12
	//  127  275:ldc2            #630 <String "Installer package name is: ">
	//  128  278:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  129  281:pop             
			stringbuilder.append(((AppData) (obj2)).installerPackageName);
	//  130  282:aload           12
	//  131  284:aload           7
	//  132  286:getfield        #633 <Field String AppData.installerPackageName>
	//  133  289:invokevirtual   #212 <Method StringBuilder StringBuilder.append(String)>
	//  134  292:pop             
			l2.a("CrashlyticsCore", stringbuilder.toString());
	//  135  293:aload           11
	//  136  295:ldc1            #55  <String "CrashlyticsCore">
	//  137  297:aload           12
	//  138  299:invokevirtual   #216 <Method String StringBuilder.toString()>
	//  139  302:invokeinterface #272 <Method void l.a(String, String)>
			controller = new CrashlyticsController(this, backgroundWorker, httpRequestFactory, ((p) (obj)), preferencemanager, ((b.a.a.a.a.f.a) (obj1)), ((AppData) (obj2)), ((UnityVersionProvider) (obj3)), appmeasurementeventlistenerregistrar, eventlogger);
	//  140  307:aload_0         
	//  141  308:new             #195 <Class CrashlyticsController>
	//  142  311:dup             
	//  143  312:aload_0         
	//  144  313:aload_0         
	//  145  314:getfield        #121 <Field CrashlyticsBackgroundWorker backgroundWorker>
	//  146  317:aload_0         
	//  147  318:getfield        #484 <Field e httpRequestFactory>
	//  148  321:aload           4
	//  149  323:aload           6
	//  150  325:aload           5
	//  151  327:aload           7
	//  152  329:aload           8
	//  153  331:aload           9
	//  154  333:aload           10
	//  155  335:invokespecial   #636 <Method void CrashlyticsController(CrashlyticsCore, CrashlyticsBackgroundWorker, e, p, PreferenceManager, b.a.a.a.a.f.a, AppData, UnityVersionProvider, AppMeasurementEventListenerRegistrar, com.crashlytics.android.answers.EventLogger)>
	//  156  338:putfield        #189 <Field CrashlyticsController controller>
			flag = didPreviousInitializationFail();
	//  157  341:aload_0         
	//  158  342:invokevirtual   #638 <Method boolean didPreviousInitializationFail()>
	//  159  345:istore_2        
			checkForPreviousCrash();
	//  160  346:aload_0         
	//  161  347:invokespecial   #640 <Method void checkForPreviousCrash()>
			boolean flag1 = (new o()).b(context);
	//  162  350:new             #642 <Class o>
	//  163  353:dup             
	//  164  354:invokespecial   #643 <Method void o()>
	//  165  357:aload_1         
	//  166  358:invokevirtual   #645 <Method boolean o.b(Context)>
	//  167  361:istore_3        
			controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler(), flag1);
	//  168  362:aload_0         
	//  169  363:getfield        #189 <Field CrashlyticsController controller>
	//  170  366:invokestatic    #649 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//  171  369:iload_3         
	//  172  370:invokevirtual   #653 <Method void CrashlyticsController.enableExceptionHandling(Thread$UncaughtExceptionHandler, boolean)>
		}
	//* 173  373:iload_2         
	//* 174  374:ifeq            403
	//* 175  377:aload_1         
	//* 176  378:invokestatic    #656 <Method boolean b.a.a.a.a.b.i.n(Context)>
	//* 177  381:ifeq            403
	//* 178  384:invokestatic    #171 <Method l c.g()>
	//* 179  387:ldc1            #55  <String "CrashlyticsCore">
	//* 180  389:ldc2            #658 <String "Crashlytics did not finish previous background initialization. Initializing synchronously.">
	//* 181  392:invokeinterface #272 <Method void l.a(String, String)>
	//* 182  397:aload_0         
	//* 183  398:invokespecial   #660 <Method void finishInitSynchronously()>
	//* 184  401:iconst_0        
	//* 185  402:ireturn         
	//* 186  403:invokestatic    #171 <Method l c.g()>
	//* 187  406:ldc1            #55  <String "CrashlyticsCore">
	//* 188  408:ldc2            #662 <String "Exception handling initialization successful">
	//* 189  411:invokeinterface #272 <Method void l.a(String, String)>
	//* 190  416:iconst_1        
	//* 191  417:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 192  418:astore_1        
		{
			c.g().e("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", ((Throwable) (context)));
	//  193  419:invokestatic    #171 <Method l c.g()>
	//  194  422:ldc1            #55  <String "CrashlyticsCore">
	//  195  424:ldc2            #664 <String "Crashlytics was not started due to an exception during initialization">
	//  196  427:aload_1         
	//  197  428:invokeinterface #179 <Method void l.e(String, String, Throwable)>
			controller = null;
	//  198  433:aload_0         
	//  199  434:aconst_null     
	//  200  435:putfield        #189 <Field CrashlyticsController controller>
			return false;
	//  201  438:iconst_0        
	//  202  439:ireturn         
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_403;
		if(!b.a.a.a.a.b.i.n(context))
			break MISSING_BLOCK_LABEL_403;
		c.g().a("CrashlyticsCore", "Crashlytics did not finish previous background initialization. Initializing synchronously.");
		finishInitSynchronously();
		return false;
		c.g().a("CrashlyticsCore", "Exception handling initialization successful");
		return true;
_L2:
		obj = null;
	//  203  440:aconst_null     
	//  204  441:astore          4
		if(true) goto _L4; else goto _L3
	//  205  443:goto            189
_L3:
	}

	public void setBool(String s, boolean flag)
	{
		setString(s, Boolean.toString(flag));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #669 <Method String Boolean.toString(boolean)>
	//    4    6:invokevirtual   #672 <Method void setString(String, String)>
	//    5    9:return          
	}

	void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider crashlyticsndkdataprovider)
	{
		crashlyticsNdkDataProvider = crashlyticsndkdataprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #457 <Field CrashlyticsNdkDataProvider crashlyticsNdkDataProvider>
	//    3    5:return          
	}

	public void setDouble(String s, double d1)
	{
		setString(s, Double.toString(d1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #681 <Method String Double.toString(double)>
	//    4    6:invokevirtual   #672 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setFloat(String s, float f)
	{
		setString(s, Float.toString(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #688 <Method String Float.toString(float)>
	//    4    6:invokevirtual   #672 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setInt(String s, int j)
	{
		setString(s, Integer.toString(j));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #694 <Method String Integer.toString(int)>
	//    4    6:invokevirtual   #672 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setListener(CrashlyticsListener crashlyticslistener)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c.g().d("CrashlyticsCore", "Use of setListener is deprecated.");
	//    2    2:invokestatic    #171 <Method l c.g()>
	//    3    5:ldc1            #55  <String "CrashlyticsCore">
	//    4    7:ldc2            #699 <String "Use of setListener is deprecated.">
	//    5   10:invokeinterface #396 <Method void l.d(String, String)>
		if(crashlyticslistener != null)
			break MISSING_BLOCK_LABEL_30;
	//    6   15:aload_1         
	//    7   16:ifnonnull       30
		throw new IllegalArgumentException("listener must not be null.");
	//    8   19:new             #701 <Class IllegalArgumentException>
	//    9   22:dup             
	//   10   23:ldc2            #703 <String "listener must not be null.">
	//   11   26:invokespecial   #704 <Method void IllegalArgumentException(String)>
	//   12   29:athrow          
		listener = crashlyticslistener;
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:putfield        #110 <Field CrashlyticsListener listener>
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

	public void setLong(String s, long l1)
	{
		setString(s, Long.toString(l1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #712 <Method String Long.toString(long)>
	//    4    6:invokevirtual   #672 <Method void setString(String, String)>
	//    5    9:return          
	}

	public void setString(String s, String s1)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to setting keys."))
	//*   4    8:ldc2            #714 <String "prior to setting keys.">
	//*   5   11:invokestatic    #187 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
			return;
	//    7   17:return          
		if(s == null)
	//*   8   18:aload_1         
	//*   9   19:ifnonnull       64
		{
			s = ((String) (getContext()));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #584 <Method Context getContext()>
	//   12   26:astore_1        
			if(s != null && b.a.a.a.a.b.i.i(((Context) (s))))
	//*  13   27:aload_1         
	//*  14   28:ifnull          49
	//*  15   31:aload_1         
	//*  16   32:invokestatic    #717 <Method boolean b.a.a.a.a.b.i.i(Context)>
	//*  17   35:ifeq            49
			{
				throw new IllegalArgumentException("Custom attribute key must not be null.");
	//   18   38:new             #701 <Class IllegalArgumentException>
	//   19   41:dup             
	//   20   42:ldc2            #719 <String "Custom attribute key must not be null.">
	//   21   45:invokespecial   #704 <Method void IllegalArgumentException(String)>
	//   22   48:athrow          
			} else
			{
				c.g().e("CrashlyticsCore", "Attempting to set custom attribute with null key, ignoring.", ((Throwable) (null)));
	//   23   49:invokestatic    #171 <Method l c.g()>
	//   24   52:ldc1            #55  <String "CrashlyticsCore">
	//   25   54:ldc2            #721 <String "Attempting to set custom attribute with null key, ignoring.">
	//   26   57:aconst_null     
	//   27   58:invokeinterface #179 <Method void l.e(String, String, Throwable)>
				return;
	//   28   63:return          
			}
		}
		String s2 = sanitizeAttribute(s);
	//   29   64:aload_1         
	//   30   65:invokestatic    #723 <Method String sanitizeAttribute(String)>
	//   31   68:astore_3        
		if(attributes.size() >= 64 && !attributes.containsKey(((Object) (s2))))
	//*  32   69:aload_0         
	//*  33   70:getfield        #126 <Field ConcurrentHashMap attributes>
	//*  34   73:invokevirtual   #726 <Method int ConcurrentHashMap.size()>
	//*  35   76:bipush          64
	//*  36   78:icmplt          106
	//*  37   81:aload_0         
	//*  38   82:getfield        #126 <Field ConcurrentHashMap attributes>
	//*  39   85:aload_3         
	//*  40   86:invokevirtual   #729 <Method boolean ConcurrentHashMap.containsKey(Object)>
	//*  41   89:ifne            106
		{
			c.g().a("CrashlyticsCore", "Exceeded maximum number of custom attributes (64)");
	//   42   92:invokestatic    #171 <Method l c.g()>
	//   43   95:ldc1            #55  <String "CrashlyticsCore">
	//   44   97:ldc2            #731 <String "Exceeded maximum number of custom attributes (64)">
	//   45  100:invokeinterface #272 <Method void l.a(String, String)>
			return;
	//   46  105:return          
		}
		if(s1 == null)
	//*  47  106:aload_2         
	//*  48  107:ifnonnull       117
			s = "";
	//   49  110:ldc2            #516 <String "">
	//   50  113:astore_1        
		else
	//*  51  114:goto            122
			s = sanitizeAttribute(s1);
	//   52  117:aload_2         
	//   53  118:invokestatic    #723 <Method String sanitizeAttribute(String)>
	//   54  121:astore_1        
		attributes.put(((Object) (s2)), ((Object) (s)));
	//   55  122:aload_0         
	//   56  123:getfield        #126 <Field ConcurrentHashMap attributes>
	//   57  126:aload_3         
	//   58  127:aload_1         
	//   59  128:invokevirtual   #735 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   60  131:pop             
		controller.cacheKeyData(((Map) (attributes)));
	//   61  132:aload_0         
	//   62  133:getfield        #189 <Field CrashlyticsController controller>
	//   63  136:aload_0         
	//   64  137:getfield        #126 <Field ConcurrentHashMap attributes>
	//   65  140:invokevirtual   #739 <Method void CrashlyticsController.cacheKeyData(Map)>
	//   66  143:return          
	}

	public void setUserEmail(String s)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to setting user data."))
	//*   4    8:ldc2            #742 <String "prior to setting user data.">
	//*   5   11:invokestatic    #187 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
		{
			return;
	//    7   17:return          
		} else
		{
			userEmail = sanitizeAttribute(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #723 <Method String sanitizeAttribute(String)>
	//   11   23:putfield        #101 <Field String userEmail>
			controller.cacheUserData(userId, userName, userEmail);
	//   12   26:aload_0         
	//   13   27:getfield        #189 <Field CrashlyticsController controller>
	//   14   30:aload_0         
	//   15   31:getfield        #99  <Field String userId>
	//   16   34:aload_0         
	//   17   35:getfield        #103 <Field String userName>
	//   18   38:aload_0         
	//   19   39:getfield        #101 <Field String userEmail>
	//   20   42:invokevirtual   #746 <Method void CrashlyticsController.cacheUserData(String, String, String)>
			return;
	//   21   45:return          
		}
	}

	public void setUserIdentifier(String s)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to setting user data."))
	//*   4    8:ldc2            #742 <String "prior to setting user data.">
	//*   5   11:invokestatic    #187 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
		{
			return;
	//    7   17:return          
		} else
		{
			userId = sanitizeAttribute(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #723 <Method String sanitizeAttribute(String)>
	//   11   23:putfield        #99  <Field String userId>
			controller.cacheUserData(userId, userName, userEmail);
	//   12   26:aload_0         
	//   13   27:getfield        #189 <Field CrashlyticsController controller>
	//   14   30:aload_0         
	//   15   31:getfield        #99  <Field String userId>
	//   16   34:aload_0         
	//   17   35:getfield        #103 <Field String userName>
	//   18   38:aload_0         
	//   19   39:getfield        #101 <Field String userEmail>
	//   20   42:invokevirtual   #746 <Method void CrashlyticsController.cacheUserData(String, String, String)>
			return;
	//   21   45:return          
		}
	}

	public void setUserName(String s)
	{
		if(disabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field boolean disabled>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(!ensureFabricWithCalled("prior to setting user data."))
	//*   4    8:ldc2            #742 <String "prior to setting user data.">
	//*   5   11:invokestatic    #187 <Method boolean ensureFabricWithCalled(String)>
	//*   6   14:ifne            18
		{
			return;
	//    7   17:return          
		} else
		{
			userName = sanitizeAttribute(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokestatic    #723 <Method String sanitizeAttribute(String)>
	//   11   23:putfield        #103 <Field String userName>
			controller.cacheUserData(userId, userName, userEmail);
	//   12   26:aload_0         
	//   13   27:getfield        #189 <Field CrashlyticsController controller>
	//   14   30:aload_0         
	//   15   31:getfield        #99  <Field String userId>
	//   16   34:aload_0         
	//   17   35:getfield        #103 <Field String userName>
	//   18   38:aload_0         
	//   19   39:getfield        #101 <Field String userEmail>
	//   20   42:invokevirtual   #746 <Method void CrashlyticsController.cacheUserData(String, String, String)>
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
	//    2    2:invokevirtual   #751 <Method boolean internalVerifyPinning(URL)>
	//    3    5:istore_2        
		}
	//*   4    6:iload_2         
	//*   5    7:ireturn         
		// Misplaced declaration of an exception variable
		catch(URL url)
	//*   6    8:astore_1        
		{
			c.g().e("CrashlyticsCore", "Could not verify SSL pinning", ((Throwable) (url)));
	//    7    9:invokestatic    #171 <Method l c.g()>
	//    8   12:ldc1            #55  <String "CrashlyticsCore">
	//    9   14:ldc2            #753 <String "Could not verify SSL pinning">
	//   10   17:aload_1         
	//   11   18:invokeinterface #179 <Method void l.e(String, String, Throwable)>
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
	private e httpRequestFactory;
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
	//    1    1:getfield        #138 <Field CrashlyticsFileMarker initializationMarker>
	//    2    4:areturn         
	}

*/
}
