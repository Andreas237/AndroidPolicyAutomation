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
	//    2    2:invokespecial   #32  <Method void ConstraintTracker(Context)>
	//    3    5:aload_0         
	//    4    6:new             #7   <Class BroadcastReceiverConstraintTracker$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #35  <Method void BroadcastReceiverConstraintTracker$1(BroadcastReceiverConstraintTracker)>
	//    8   14:putfield        #37  <Field BroadcastReceiver mBroadcastReceiver>
	//    9   17:return          
	}

	public abstract IntentFilter getIntentFilter();

	public abstract void onBroadcastReceive(Context context, Intent intent);

	public void startTracking()
	{
		Logger.get().debug(TAG, String.format("%s: registering receiver", new Object[] {
			((Object)this).getClass().getSimpleName()
		}), new Throwable[0]);
	//    0    0:invokestatic    #47  <Method Logger Logger.get()>
	//    1    3:getstatic       #27  <Field String TAG>
	//    2    6:ldc1            #49  <String "%s: registering receiver">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_0         
	//    8   15:invokevirtual   #55  <Method Class Object.getClass()>
	//    9   18:invokevirtual   #61  <Method String Class.getSimpleName()>
	//   10   21:aastore         
	//   11   22:invokestatic    #67  <Method String String.format(String, Object[])>
	//   12   25:iconst_0        
	//   13   26:anewarray       Throwable[]
	//   14   29:invokevirtual   #73  <Method void Logger.debug(String, String, Throwable[])>
		mAppContext.registerReceiver(mBroadcastReceiver, getIntentFilter());
	//   15   32:aload_0         
	//   16   33:getfield        #77  <Field Context mAppContext>
	//   17   36:aload_0         
	//   18   37:getfield        #37  <Field BroadcastReceiver mBroadcastReceiver>
	//   19   40:aload_0         
	//   20   41:invokevirtual   #79  <Method IntentFilter getIntentFilter()>
	//   21   44:invokevirtual   #85  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   22   47:pop             
	//   23   48:return          
	}

	public void stopTracking()
	{
		Logger.get().debug(TAG, String.format("%s: unregistering receiver", new Object[] {
			((Object)this).getClass().getSimpleName()
		}), new Throwable[0]);
	//    0    0:invokestatic    #47  <Method Logger Logger.get()>
	//    1    3:getstatic       #27  <Field String TAG>
	//    2    6:ldc1            #88  <String "%s: unregistering receiver">
	//    3    8:iconst_1        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_0         
	//    8   15:invokevirtual   #55  <Method Class Object.getClass()>
	//    9   18:invokevirtual   #61  <Method String Class.getSimpleName()>
	//   10   21:aastore         
	//   11   22:invokestatic    #67  <Method String String.format(String, Object[])>
	//   12   25:iconst_0        
	//   13   26:anewarray       Throwable[]
	//   14   29:invokevirtual   #73  <Method void Logger.debug(String, String, Throwable[])>
		mAppContext.unregisterReceiver(mBroadcastReceiver);
	//   15   32:aload_0         
	//   16   33:getfield        #77  <Field Context mAppContext>
	//   17   36:aload_0         
	//   18   37:getfield        #37  <Field BroadcastReceiver mBroadcastReceiver>
	//   19   40:invokevirtual   #92  <Method void Context.unregisterReceiver(BroadcastReceiver)>
	//   20   43:return          
	}

	private static final String TAG = Logger.tagWithPrefix("BrdcstRcvrCnstrntTrckr");
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

	static 
	{
	//    0    0:ldc1            #19  <String "BrdcstRcvrCnstrntTrckr">
	//    1    2:invokestatic    #25  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #27  <Field String TAG>
	//*   3    8:return          
	}
}
