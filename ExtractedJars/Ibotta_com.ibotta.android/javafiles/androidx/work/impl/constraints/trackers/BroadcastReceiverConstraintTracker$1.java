// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.content.*;

// Referenced classes of package androidx.work.impl.constraints.trackers:
//			BroadcastReceiverConstraintTracker

class BroadcastReceiverConstraintTracker$1 extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(intent != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          13
			onBroadcastReceive(context, intent);
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field BroadcastReceiverConstraintTracker this$0>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #21  <Method void BroadcastReceiverConstraintTracker.onBroadcastReceive(Context, Intent)>
	//    7   13:return          
	}

	final BroadcastReceiverConstraintTracker this$0;

	BroadcastReceiverConstraintTracker$1()
	{
		this$0 = BroadcastReceiverConstraintTracker.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BroadcastReceiverConstraintTracker this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
