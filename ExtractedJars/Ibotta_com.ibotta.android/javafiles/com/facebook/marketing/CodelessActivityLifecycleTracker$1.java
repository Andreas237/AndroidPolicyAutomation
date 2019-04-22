// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing;

import android.app.Activity;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.marketing.internal.MarketingLogger;

// Referenced classes of package com.facebook.marketing:
//			CodelessActivityLifecycleTracker, ViewIndexer, ViewIndexingTrigger

static final class CodelessActivityLifecycleTracker$1
	implements android.app.cks
{

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onActivityDestroyed(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityPaused(Activity activity)
	{
		CodelessActivityLifecycleTracker.access$100().unschedule();
	//    0    0:invokestatic    #27  <Method ViewIndexer CodelessActivityLifecycleTracker.access$100()>
	//    1    3:invokevirtual   #32  <Method void ViewIndexer.unschedule()>
		CodelessActivityLifecycleTracker.access$000().unregisterListener(((android.hardware.SensorEventListener) (CodelessActivityLifecycleTracker.access$200())));
	//    2    6:invokestatic    #36  <Method SensorManager CodelessActivityLifecycleTracker.access$000()>
	//    3    9:invokestatic    #40  <Method ViewIndexingTrigger CodelessActivityLifecycleTracker.access$200()>
	//    4   12:invokevirtual   #46  <Method void SensorManager.unregisterListener(android.hardware.SensorEventListener)>
	//    5   15:return          
	}

	public void onActivityResumed(Activity activity)
	{
		final Context applicationContext = activity.getApplicationContext();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #53  <Method Context Activity.getApplicationContext()>
	//    2    4:astore_2        
		final String appId = FacebookSdk.getApplicationId();
	//    3    5:invokestatic    #59  <Method String FacebookSdk.getApplicationId()>
	//    4    8:astore_3        
		final FetchedAppSettings appSettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(appId);
	//    5    9:aload_3         
	//    6   10:invokestatic    #65  <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//    7   13:astore          4
		SensorManager _tmp = CodelessActivityLifecycleTracker.access$002((SensorManager)applicationContext.getSystemService("sensor"));
	//    8   15:aload_2         
	//    9   16:ldc1            #67  <String "sensor">
	//   10   18:invokevirtual   #73  <Method Object Context.getSystemService(String)>
	//   11   21:checkcast       #42  <Class SensorManager>
	//   12   24:invokestatic    #77  <Method SensorManager CodelessActivityLifecycleTracker.access$002(SensorManager)>
	//   13   27:pop             
		android.hardware.Sensor sensor = CodelessActivityLifecycleTracker.access$000().getDefaultSensor(1);
	//   14   28:invokestatic    #36  <Method SensorManager CodelessActivityLifecycleTracker.access$000()>
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #81  <Method android.hardware.Sensor SensorManager.getDefaultSensor(int)>
	//   17   35:astore          5
		ViewIndexer _tmp1 = CodelessActivityLifecycleTracker.access$102(new ViewIndexer(activity));
	//   18   37:new             #29  <Class ViewIndexer>
	//   19   40:dup             
	//   20   41:aload_1         
	//   21   42:invokespecial   #83  <Method void ViewIndexer(Activity)>
	//   22   45:invokestatic    #87  <Method ViewIndexer CodelessActivityLifecycleTracker.access$102(ViewIndexer)>
	//   23   48:pop             
		CodelessActivityLifecycleTracker.access$200().setOnShakeListener(new ViewIndexingTrigger.OnShakeListener() {

			public void onShake(int i)
			{
				if(i >= 3)
			//*   0    0:iload_1         
			//*   1    1:iconst_3        
			//*   2    2:icmplt          55
				{
					CodelessActivityLifecycleTracker.access$200().resetCount();
			//    3    5:invokestatic    #41  <Method ViewIndexingTrigger CodelessActivityLifecycleTracker.access$200()>
			//    4    8:invokevirtual   #46  <Method void ViewIndexingTrigger.resetCount()>
					MarketingLogger marketinglogger = new MarketingLogger(applicationContext, appId);
			//    5   11:new             #48  <Class MarketingLogger>
			//    6   14:dup             
			//    7   15:aload_0         
			//    8   16:getfield        #25  <Field Context val$applicationContext>
			//    9   19:aload_0         
			//   10   20:getfield        #27  <Field String val$appId>
			//   11   23:invokespecial   #51  <Method void MarketingLogger(Context, String)>
			//   12   26:astore_2        
					marketinglogger.logGestureTriggered();
			//   13   27:aload_2         
			//   14   28:invokevirtual   #54  <Method void MarketingLogger.logGestureTriggered()>
					FetchedAppSettings fetchedappsettings = appSettings;
			//   15   31:aload_0         
			//   16   32:getfield        #29  <Field FetchedAppSettings val$appSettings>
			//   17   35:astore_3        
					if(fetchedappsettings != null && fetchedappsettings.getCodelessEventsEnabled())
			//*  18   36:aload_3         
			//*  19   37:ifnull          55
			//*  20   40:aload_3         
			//*  21   41:invokevirtual   #60  <Method boolean FetchedAppSettings.getCodelessEventsEnabled()>
			//*  22   44:ifeq            55
						CodelessActivityLifecycleTracker.checkCodelessSession(appId, marketinglogger);
			//   23   47:aload_0         
			//   24   48:getfield        #27  <Field String val$appId>
			//   25   51:aload_2         
			//   26   52:invokestatic    #64  <Method void CodelessActivityLifecycleTracker.checkCodelessSession(String, MarketingLogger)>
				}
			//   27   55:return          
			}

			final CodelessActivityLifecycleTracker._cls1 this$0;
			final String val$appId;
			final FetchedAppSettings val$appSettings;
			final Context val$applicationContext;

			
			{
				this$0 = CodelessActivityLifecycleTracker._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CodelessActivityLifecycleTracker$1 this$0>
				applicationContext = context;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field Context val$applicationContext>
				appId = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field String val$appId>
				appSettings = fetchedappsettings;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field FetchedAppSettings val$appSettings>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//   24   49:invokestatic    #40  <Method ViewIndexingTrigger CodelessActivityLifecycleTracker.access$200()>
	//   25   52:new             #13  <Class CodelessActivityLifecycleTracker$1$1>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:aload_2         
	//   29   58:aload_3         
	//   30   59:aload           4
	//   31   61:invokespecial   #90  <Method void CodelessActivityLifecycleTracker$1$1(CodelessActivityLifecycleTracker$1, Context, String, FetchedAppSettings)>
	//   32   64:invokevirtual   #96  <Method void ViewIndexingTrigger.setOnShakeListener(ViewIndexingTrigger$OnShakeListener)>
		CodelessActivityLifecycleTracker.access$000().registerListener(((android.hardware.SensorEventListener) (CodelessActivityLifecycleTracker.access$200())), sensor, 2);
	//   33   67:invokestatic    #36  <Method SensorManager CodelessActivityLifecycleTracker.access$000()>
	//   34   70:invokestatic    #40  <Method ViewIndexingTrigger CodelessActivityLifecycleTracker.access$200()>
	//   35   73:aload           5
	//   36   75:iconst_2        
	//   37   76:invokevirtual   #100 <Method boolean SensorManager.registerListener(android.hardware.SensorEventListener, android.hardware.Sensor, int)>
	//   38   79:pop             
		if(appSettings != null && appSettings.getCodelessEventsEnabled())
	//*  39   80:aload           4
	//*  40   82:ifnull          99
	//*  41   85:aload           4
	//*  42   87:invokevirtual   #106 <Method boolean FetchedAppSettings.getCodelessEventsEnabled()>
	//*  43   90:ifeq            99
			CodelessActivityLifecycleTracker.access$100().schedule();
	//   44   93:invokestatic    #27  <Method ViewIndexer CodelessActivityLifecycleTracker.access$100()>
	//   45   96:invokevirtual   #109 <Method void ViewIndexer.schedule()>
	//   46   99:return          
	}

	public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onActivityStarted(Activity activity)
	{
	//    0    0:return          
	}

	public void onActivityStopped(Activity activity)
	{
	//    0    0:return          
	}

	CodelessActivityLifecycleTracker$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
