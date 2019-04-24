// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package io.fabric.sdk.android:
//			Fabric

class Fabric$1 extends ifecycleManager.Callbacks
{

	public void onActivityCreated(Activity activity, Bundle bundle)
	{
		setCurrentActivity(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Fabric this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method Fabric Fabric.setCurrentActivity(Activity)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onActivityResumed(Activity activity)
	{
		setCurrentActivity(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Fabric this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method Fabric Fabric.setCurrentActivity(Activity)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onActivityStarted(Activity activity)
	{
		setCurrentActivity(activity);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Fabric this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method Fabric Fabric.setCurrentActivity(Activity)>
	//    4    8:pop             
	//    5    9:return          
	}

	final Fabric this$0;

	Fabric$1()
	{
		this$0 = Fabric.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field Fabric this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void ActivityLifecycleManager$Callbacks()>
	//    5    9:return          
	}
}
