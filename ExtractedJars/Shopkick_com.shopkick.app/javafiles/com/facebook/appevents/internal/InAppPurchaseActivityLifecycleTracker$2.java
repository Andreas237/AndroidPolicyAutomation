// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.*;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.appevents.internal:
//			InAppPurchaseActivityLifecycleTracker, InAppPurchaseEventManager, SubscriptionType

static final class InAppPurchaseActivityLifecycleTracker$2
	implements android.app.Application.ActivityLifecycleCallbacks
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
	//    0    0:return          
	}

	public void onActivityResumed(Activity activity)
	{
		FacebookSdk.getExecutor().execute(new Runnable() {

			public void run()
			{
				android.content.Context context = FacebookSdk.getApplicationContext();
			//    0    0:invokestatic    #28  <Method android.content.Context FacebookSdk.getApplicationContext()>
			//    1    3:astore_1        
				InAppPurchaseActivityLifecycleTracker.access$100(context, InAppPurchaseEventManager.getPurchasesInapp(context, InAppPurchaseActivityLifecycleTracker.access$000()));
			//    2    4:aload_1         
			//    3    5:aload_1         
			//    4    6:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
			//    5    9:invokestatic    #40  <Method ArrayList InAppPurchaseEventManager.getPurchasesInapp(android.content.Context, Object)>
			//    6   12:invokestatic    #44  <Method void InAppPurchaseActivityLifecycleTracker.access$100(android.content.Context, ArrayList)>
				Map map = InAppPurchaseEventManager.getPurchasesSubs(context, InAppPurchaseActivityLifecycleTracker.access$000());
			//    7   15:aload_1         
			//    8   16:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
			//    9   19:invokestatic    #48  <Method Map InAppPurchaseEventManager.getPurchasesSubs(android.content.Context, Object)>
			//   10   22:astore_2        
				for(Iterator iterator = InAppPurchaseEventManager.getPurchasesSubsExpire(context, InAppPurchaseActivityLifecycleTracker.access$000()).iterator(); iterator.hasNext(); map.put(((Object) ((String)iterator.next())), ((Object) (SubscriptionType.EXPIRE))));
			//   11   23:aload_1         
			//   12   24:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
			//   13   27:invokestatic    #51  <Method ArrayList InAppPurchaseEventManager.getPurchasesSubsExpire(android.content.Context, Object)>
			//   14   30:invokevirtual   #57  <Method Iterator ArrayList.iterator()>
			//   15   33:astore_3        
			//   16   34:aload_3         
			//   17   35:invokeinterface #63  <Method boolean Iterator.hasNext()>
			//   18   40:ifeq            65
			//   19   43:aload_2         
			//   20   44:aload_3         
			//   21   45:invokeinterface #66  <Method Object Iterator.next()>
			//   22   50:checkcast       #68  <Class String>
			//   23   53:getstatic       #74  <Field SubscriptionType SubscriptionType.EXPIRE>
			//   24   56:invokeinterface #80  <Method Object Map.put(Object, Object)>
			//   25   61:pop             
			//*  26   62:goto            34
				InAppPurchaseActivityLifecycleTracker.access$200(context, map);
			//   27   65:aload_1         
			//   28   66:aload_2         
			//   29   67:invokestatic    #84  <Method void InAppPurchaseActivityLifecycleTracker.access$200(android.content.Context, Map)>
			//   30   70:return          
			}

			final InAppPurchaseActivityLifecycleTracker._cls2 this$0;

			
			{
				this$0 = InAppPurchaseActivityLifecycleTracker._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppPurchaseActivityLifecycleTracker$2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:invokestatic    #31  <Method Executor FacebookSdk.getExecutor()>
	//    1    3:new             #13  <Class InAppPurchaseActivityLifecycleTracker$2$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #34  <Method void InAppPurchaseActivityLifecycleTracker$2$1(InAppPurchaseActivityLifecycleTracker$2)>
	//    5   11:invokeinterface #40  <Method void Executor.execute(Runnable)>
	//    6   16:return          
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
		if(InAppPurchaseActivityLifecycleTracker.access$300().booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity"))
	//*   0    0:invokestatic    #47  <Method Boolean InAppPurchaseActivityLifecycleTracker.access$300()>
	//*   1    3:invokevirtual   #53  <Method boolean Boolean.booleanValue()>
	//*   2    6:ifeq            37
	//*   3    9:aload_1         
	//*   4   10:invokevirtual   #59  <Method String Activity.getLocalClassName()>
	//*   5   13:ldc1            #61  <String "com.android.billingclient.api.ProxyBillingActivity">
	//*   6   15:invokevirtual   #67  <Method boolean String.equals(Object)>
	//*   7   18:ifeq            37
			FacebookSdk.getExecutor().execute(new Runnable() {

				public void run()
				{
					android.content.Context context = FacebookSdk.getApplicationContext();
				//    0    0:invokestatic    #28  <Method android.content.Context FacebookSdk.getApplicationContext()>
				//    1    3:astore_3        
					ArrayList arraylist1 = InAppPurchaseEventManager.getPurchasesInapp(context, InAppPurchaseActivityLifecycleTracker.access$000());
				//    2    4:aload_3         
				//    3    5:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
				//    4    8:invokestatic    #40  <Method ArrayList InAppPurchaseEventManager.getPurchasesInapp(android.content.Context, Object)>
				//    5   11:astore_2        
					ArrayList arraylist = arraylist1;
				//    6   12:aload_2         
				//    7   13:astore_1        
					if(arraylist1.isEmpty())
				//*   8   14:aload_2         
				//*   9   15:invokevirtual   #46  <Method boolean ArrayList.isEmpty()>
				//*  10   18:ifeq            29
						arraylist = InAppPurchaseEventManager.getPurchaseHistoryInapp(context, InAppPurchaseActivityLifecycleTracker.access$000());
				//   11   21:aload_3         
				//   12   22:invokestatic    #34  <Method Object InAppPurchaseActivityLifecycleTracker.access$000()>
				//   13   25:invokestatic    #49  <Method ArrayList InAppPurchaseEventManager.getPurchaseHistoryInapp(android.content.Context, Object)>
				//   14   28:astore_1        
					InAppPurchaseActivityLifecycleTracker.access$100(context, arraylist);
				//   15   29:aload_3         
				//   16   30:aload_1         
				//   17   31:invokestatic    #53  <Method void InAppPurchaseActivityLifecycleTracker.access$100(android.content.Context, ArrayList)>
				//   18   34:return          
				}

				final InAppPurchaseActivityLifecycleTracker._cls2 this$0;

			
			{
				this$0 = InAppPurchaseActivityLifecycleTracker._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InAppPurchaseActivityLifecycleTracker$2 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    8   21:invokestatic    #31  <Method Executor FacebookSdk.getExecutor()>
	//    9   24:new             #15  <Class InAppPurchaseActivityLifecycleTracker$2$2>
	//   10   27:dup             
	//   11   28:aload_0         
	//   12   29:invokespecial   #68  <Method void InAppPurchaseActivityLifecycleTracker$2$2(InAppPurchaseActivityLifecycleTracker$2)>
	//   13   32:invokeinterface #40  <Method void Executor.execute(Runnable)>
	//   14   37:return          
	}

	InAppPurchaseActivityLifecycleTracker$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}
}
