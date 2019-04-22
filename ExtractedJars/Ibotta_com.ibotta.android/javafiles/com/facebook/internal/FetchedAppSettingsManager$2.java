// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.internal:
//			FetchedAppSettingsManager

static final class FetchedAppSettingsManager$2
	implements 
{

	public boolean onActivityResult(final int finalResultCode, final Intent finalData)
	{
		FacebookSdk.getExecutor().execute(new Runnable() {

			public void run()
			{
				AutomaticAnalyticsLogger.logInAppPurchaseEvent(context, finalResultCode, finalData);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field FetchedAppSettingsManager$2 this$0>
			//    2    4:getfield        #34  <Field Context FetchedAppSettingsManager$2.val$context>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field int val$finalResultCode>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field Intent val$finalData>
			//    7   15:invokestatic    #40  <Method boolean AutomaticAnalyticsLogger.logInAppPurchaseEvent(Context, int, Intent)>
			//    8   18:pop             
			//    9   19:return          
			}

			final FetchedAppSettingsManager._cls2 this$0;
			final Intent val$finalData;
			final int val$finalResultCode;

			
			{
				this$0 = FetchedAppSettingsManager._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FetchedAppSettingsManager$2 this$0>
				finalResultCode = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int val$finalResultCode>
				finalData = intent;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Intent val$finalData>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:invokestatic    #30  <Method Executor FacebookSdk.getExecutor()>
	//    1    3:new             #13  <Class FetchedAppSettingsManager$2$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #33  <Method void FetchedAppSettingsManager$2$1(FetchedAppSettingsManager$2, int, Intent)>
	//    7   13:invokeinterface #39  <Method void Executor.execute(Runnable)>
		return true;
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	final Context val$context;

	FetchedAppSettingsManager$2(Context context1)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Context val$context>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
