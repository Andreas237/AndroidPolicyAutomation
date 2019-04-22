// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.content.*;
import androidx.work.Logger;

// Referenced classes of package androidx.work.impl.constraints.trackers:
//			ConstraintTracker

public abstract class BroadcastReceiverConstraintTracker extends ConstraintTracker
{

	public BroadcastReceiverConstraintTracker(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void ConstraintTracker(Context)>
	//    3    5:aload_0         
	//    4    6:new             #7   <Class BroadcastReceiverConstraintTracker$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void BroadcastReceiverConstraintTracker$1(BroadcastReceiverConstraintTracker)>
	//    8   14:putfield        #22  <Field BroadcastReceiver mBroadcastReceiver>
	//    9   17:return          
	}

	public abstract IntentFilter getIntentFilter();

	public abstract void onBroadcastReceive(Context context, Intent intent);

	public void startTracking()
	{
		Logger.debug("BrdcstRcvrCnstrntTrckr", String.format("%s: registering receiver", new Object[] {
			((Object)this).getClass().getSimpleName()
		}), new Throwable[0]);
	//    0    0:ldc1            #32  <String "BrdcstRcvrCnstrntTrckr">
	//    1    2:ldc1            #34  <String "%s: registering receiver">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #40  <Method Class Object.getClass()>
	//    8   14:invokevirtual   #46  <Method String Class.getSimpleName()>
	//    9   17:aastore         
	//   10   18:invokestatic    #52  <Method String String.format(String, Object[])>
	//   11   21:iconst_0        
	//   12   22:anewarray       Throwable[]
	//   13   25:invokestatic    #60  <Method void Logger.debug(String, String, Throwable[])>
		mAppContext.registerReceiver(mBroadcastReceiver, getIntentFilter());
	//   14   28:aload_0         
	//   15   29:getfield        #64  <Field Context mAppContext>
	//   16   32:aload_0         
	//   17   33:getfield        #22  <Field BroadcastReceiver mBroadcastReceiver>
	//   18   36:aload_0         
	//   19   37:invokevirtual   #66  <Method IntentFilter getIntentFilter()>
	//   20   40:invokevirtual   #72  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   21   43:pop             
	//   22   44:return          
	}

	public void stopTracking()
	{
		Logger.debug("BrdcstRcvrCnstrntTrckr", String.format("%s: unregistering receiver", new Object[] {
			((Object)this).getClass().getSimpleName()
		}), new Throwable[0]);
	//    0    0:ldc1            #32  <String "BrdcstRcvrCnstrntTrckr">
	//    1    2:ldc1            #75  <String "%s: unregistering receiver">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #40  <Method Class Object.getClass()>
	//    8   14:invokevirtual   #46  <Method String Class.getSimpleName()>
	//    9   17:aastore         
	//   10   18:invokestatic    #52  <Method String String.format(String, Object[])>
	//   11   21:iconst_0        
	//   12   22:anewarray       Throwable[]
	//   13   25:invokestatic    #60  <Method void Logger.debug(String, String, Throwable[])>
		mAppContext.unregisterReceiver(mBroadcastReceiver);
	//   14   28:aload_0         
	//   15   29:getfield        #64  <Field Context mAppContext>
	//   16   32:aload_0         
	//   17   33:getfield        #22  <Field BroadcastReceiver mBroadcastReceiver>
	//   18   36:invokevirtual   #79  <Method void Context.unregisterReceiver(BroadcastReceiver)>
	//   19   39:return          
	}

	private final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() {

		public void onReceive(Context context1, Intent intent)
		{
			if(intent != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          13
				onBroadcastReceive(context1, intent);
		//    2    4:aload_0         
		//    3    5:getfield        #12  <Field BroadcastReceiverConstraintTracker this$0>
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #21  <Method void BroadcastReceiverConstraintTracker.onBroadcastReceive(Context, Intent)>
		//    7   13:return          
		}

		final BroadcastReceiverConstraintTracker this$0;

			
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
;
}
