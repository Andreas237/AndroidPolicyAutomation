// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;


// Referenced classes of package com.adjust.sdk:
//			ActivityHandler, AdjustConfig, OnAttributionChangedListener

class ActivityHandler$1
	implements Runnable
{

	public void run()
	{
		ActivityHandler.access$100(ActivityHandler.this).onAttributionChangedListener.onAttributionChanged(ActivityHandler.access$000(ActivityHandler.this));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActivityHandler this$0>
	//    2    4:invokestatic    #25  <Method AdjustConfig ActivityHandler.access$100(ActivityHandler)>
	//    3    7:getfield        #31  <Field OnAttributionChangedListener AdjustConfig.onAttributionChangedListener>
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field ActivityHandler this$0>
	//    6   14:invokestatic    #35  <Method AdjustAttribution ActivityHandler.access$000(ActivityHandler)>
	//    7   17:invokeinterface #41  <Method void OnAttributionChangedListener.onAttributionChanged(AdjustAttribution)>
	//    8   22:return          
	}

	final ActivityHandler this$0;

	ActivityHandler$1()
	{
		this$0 = ActivityHandler.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ActivityHandler this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
