// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.scheduler;

import android.content.*;

// Referenced classes of package com.google.android.exoplayer2.scheduler:
//			RequirementsWatcher

private class RequirementsWatcher$DeviceStatusChangeReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(!isInitialStickyBroadcast())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #26  <Method boolean isInitialStickyBroadcast()>
	//*   2    4:ifne            55
		{
			context = ((Context) (new StringBuilder()));
	//    3    7:new             #28  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #29  <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (context)).append(((Object) (RequirementsWatcher.this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #13  <Field RequirementsWatcher this$0>
	//   10   20:invokevirtual   #33  <Method StringBuilder StringBuilder.append(Object)>
	//   11   23:pop             
			((StringBuilder) (context)).append(" received ");
	//   12   24:aload_1         
	//   13   25:ldc1            #35  <String " received ">
	//   14   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			((StringBuilder) (context)).append(intent.getAction());
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:invokevirtual   #44  <Method String Intent.getAction()>
	//   19   36:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			RequirementsWatcher.access$200(((StringBuilder) (context)).toString());
	//   21   40:aload_1         
	//   22   41:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   23   44:invokestatic    #51  <Method void RequirementsWatcher.access$200(String)>
			RequirementsWatcher.access$300(RequirementsWatcher.this, false);
	//   24   47:aload_0         
	//   25   48:getfield        #13  <Field RequirementsWatcher this$0>
	//   26   51:iconst_0        
	//   27   52:invokestatic    #55  <Method void RequirementsWatcher.access$300(RequirementsWatcher, boolean)>
		}
	//   28   55:return          
	}

	final RequirementsWatcher this$0;

	private RequirementsWatcher$DeviceStatusChangeReceiver()
	{
		this$0 = RequirementsWatcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field RequirementsWatcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	RequirementsWatcher$DeviceStatusChangeReceiver(RequirementsWatcher._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void RequirementsWatcher$DeviceStatusChangeReceiver(RequirementsWatcher)>
	//    3    5:return          
	}
}
