// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.app.Activity;
import android.content.ComponentName;
import com.gigya.socialize.android.lifecycle.GSActivityLifecycleCallbacks;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI

class GSAPI$3 extends GSActivityLifecycleCallbacks
{

	public void onActivityResumed(Activity activity)
	{
		GSAPI.access$202(GSAPI.this, activity.getComponentName().getClassName());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GSAPI this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method ComponentName Activity.getComponentName()>
	//    4    8:invokevirtual   #41  <Method String ComponentName.getClassName()>
	//    5   11:invokestatic    #45  <Method String GSAPI.access$202(GSAPI, String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void onActivityStarted(Activity activity)
	{
		int i = activityReferences + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int activityReferences>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_2        
		activityReferences = i;
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:putfield        #24  <Field int activityReferences>
		if(i == 1 && !isActivityChangingConfigurations)
	//*   8   12:iload_2         
	//*   9   13:iconst_1        
	//*  10   14:icmpne          39
	//*  11   17:aload_0         
	//*  12   18:getfield        #26  <Field boolean isActivityChangingConfigurations>
	//*  13   21:ifne            39
		{
			GigyaLog.d(GSAPI.access$000(), "App enters foreground");
	//   14   24:invokestatic    #49  <Method String GSAPI.access$000()>
	//   15   27:ldc1            #51  <String "App enters foreground">
	//   16   29:invokestatic    #57  <Method void GigyaLog.d(String, String)>
			GSAPI.access$100(GSAPI.this);
	//   17   32:aload_0         
	//   18   33:getfield        #19  <Field GSAPI this$0>
	//   19   36:invokestatic    #60  <Method void GSAPI.access$100(GSAPI)>
		}
	//   20   39:return          
	}

	public void onActivityStopped(Activity activity)
	{
		isActivityChangingConfigurations = activity.isChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method boolean Activity.isChangingConfigurations()>
	//    3    5:putfield        #26  <Field boolean isActivityChangingConfigurations>
		int i = activityReferences - 1;
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field int activityReferences>
	//    6   12:iconst_1        
	//    7   13:isub            
	//    8   14:istore_2        
		activityReferences = i;
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:putfield        #24  <Field int activityReferences>
		if(i == 0 && !isActivityChangingConfigurations)
	//*  12   20:iload_2         
	//*  13   21:ifne            46
	//*  14   24:aload_0         
	//*  15   25:getfield        #26  <Field boolean isActivityChangingConfigurations>
	//*  16   28:ifne            46
		{
			GigyaLog.d(GSAPI.access$000(), "App enters background");
	//   17   31:invokestatic    #49  <Method String GSAPI.access$000()>
	//   18   34:ldc1            #67  <String "App enters background">
	//   19   36:invokestatic    #57  <Method void GigyaLog.d(String, String)>
			GSAPI.access$300(GSAPI.this);
	//   20   39:aload_0         
	//   21   40:getfield        #19  <Field GSAPI this$0>
	//   22   43:invokestatic    #70  <Method void GSAPI.access$300(GSAPI)>
		}
	//   23   46:return          
	}

	private int activityReferences;
	private boolean isActivityChangingConfigurations;
	final GSAPI this$0;

	GSAPI$3()
	{
		this$0 = GSAPI.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GSAPI this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void GSActivityLifecycleCallbacks()>
		activityReferences = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #24  <Field int activityReferences>
		isActivityChangingConfigurations = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field boolean isActivityChangingConfigurations>
	//   11   19:return          
	}
}
