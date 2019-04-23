// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.*;

// Referenced classes of package android.support.v7.app:
//			TwilightManager, AppCompatDelegateImpl

final class AppCompatDelegateImpl$AutoNightModeManager
{

	void cleanup()
	{
		if(mAutoTimeChangeReceiver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field BroadcastReceiver mAutoTimeChangeReceiver>
	//*   2    4:ifnull          26
		{
			mContext.unregisterReceiver(mAutoTimeChangeReceiver);
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field AppCompatDelegateImpl this$0>
	//    5   11:getfield        #41  <Field Context AppCompatDelegateImpl.mContext>
	//    6   14:aload_0         
	//    7   15:getfield        #35  <Field BroadcastReceiver mAutoTimeChangeReceiver>
	//    8   18:invokevirtual   #47  <Method void Context.unregisterReceiver(BroadcastReceiver)>
			mAutoTimeChangeReceiver = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #35  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		}
	//   12   26:return          
	}

	void dispatchTimeChanged()
	{
		boolean flag = mTwilightManager.isNight();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field TwilightManager mTwilightManager>
	//    2    4:invokevirtual   #29  <Method boolean TwilightManager.isNight()>
	//    3    7:istore_1        
		if(flag != mIsNight)
	//*   4    8:iload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #31  <Field boolean mIsNight>
	//*   7   13:icmpeq          29
		{
			mIsNight = flag;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #31  <Field boolean mIsNight>
			applyDayNight();
	//   11   21:aload_0         
	//   12   22:getfield        #18  <Field AppCompatDelegateImpl this$0>
	//   13   25:invokevirtual   #51  <Method boolean AppCompatDelegateImpl.applyDayNight()>
	//   14   28:pop             
		}
	//   15   29:return          
	}

	int getApplyableNightMode()
	{
		mIsNight = mTwilightManager.isNight();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field TwilightManager mTwilightManager>
	//    3    5:invokevirtual   #29  <Method boolean TwilightManager.isNight()>
	//    4    8:putfield        #31  <Field boolean mIsNight>
		return !mIsNight ? 1 : 2;
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field boolean mIsNight>
	//    7   15:ifeq            20
	//    8   18:iconst_2        
	//    9   19:ireturn         
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	void setup()
	{
		cleanup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method void cleanup()>
		class _cls1 extends BroadcastReceiver
		{

			public void onReceive(Context context, Intent intent)
			{
				dispatchTimeChanged();
			//    0    0:aload_0         
			//    1    1:getfield        #10  <Field AppCompatDelegateImpl$AutoNightModeManager this$1>
			//    2    4:invokevirtual   #21  <Method void AppCompatDelegateImpl$AutoNightModeManager.dispatchTimeChanged()>
			//    3    7:return          
			}

			final AppCompatDelegateImpl.AutoNightModeManager this$1;

			_cls1()
			{
				this$1 = AppCompatDelegateImpl.AutoNightModeManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #10  <Field AppCompatDelegateImpl$AutoNightModeManager this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #13  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}

		if(mAutoTimeChangeReceiver == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #35  <Field BroadcastReceiver mAutoTimeChangeReceiver>
	//*   4    8:ifnonnull       23
			mAutoTimeChangeReceiver = ((BroadcastReceiver) (new _cls1()));
	//    5   11:aload_0         
	//    6   12:new             #58  <Class AppCompatDelegateImpl$AutoNightModeManager$1>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #61  <Method void AppCompatDelegateImpl$AutoNightModeManager$1(AppCompatDelegateImpl$AutoNightModeManager)>
	//   10   20:putfield        #35  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		if(mAutoTimeChangeReceiverFilter == null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #63  <Field IntentFilter mAutoTimeChangeReceiverFilter>
	//*  13   27:ifnonnull       68
		{
			mAutoTimeChangeReceiverFilter = new IntentFilter();
	//   14   30:aload_0         
	//   15   31:new             #65  <Class IntentFilter>
	//   16   34:dup             
	//   17   35:invokespecial   #66  <Method void IntentFilter()>
	//   18   38:putfield        #63  <Field IntentFilter mAutoTimeChangeReceiverFilter>
			mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIME_SET");
	//   19   41:aload_0         
	//   20   42:getfield        #63  <Field IntentFilter mAutoTimeChangeReceiverFilter>
	//   21   45:ldc1            #68  <String "android.intent.action.TIME_SET">
	//   22   47:invokevirtual   #72  <Method void IntentFilter.addAction(String)>
			mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
	//   23   50:aload_0         
	//   24   51:getfield        #63  <Field IntentFilter mAutoTimeChangeReceiverFilter>
	//   25   54:ldc1            #74  <String "android.intent.action.TIMEZONE_CHANGED">
	//   26   56:invokevirtual   #72  <Method void IntentFilter.addAction(String)>
			mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIME_TICK");
	//   27   59:aload_0         
	//   28   60:getfield        #63  <Field IntentFilter mAutoTimeChangeReceiverFilter>
	//   29   63:ldc1            #76  <String "android.intent.action.TIME_TICK">
	//   30   65:invokevirtual   #72  <Method void IntentFilter.addAction(String)>
		}
		mContext.registerReceiver(mAutoTimeChangeReceiver, mAutoTimeChangeReceiverFilter);
	//   31   68:aload_0         
	//   32   69:getfield        #18  <Field AppCompatDelegateImpl this$0>
	//   33   72:getfield        #41  <Field Context AppCompatDelegateImpl.mContext>
	//   34   75:aload_0         
	//   35   76:getfield        #35  <Field BroadcastReceiver mAutoTimeChangeReceiver>
	//   36   79:aload_0         
	//   37   80:getfield        #63  <Field IntentFilter mAutoTimeChangeReceiverFilter>
	//   38   83:invokevirtual   #80  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   39   86:pop             
	//   40   87:return          
	}

	private BroadcastReceiver mAutoTimeChangeReceiver;
	private IntentFilter mAutoTimeChangeReceiverFilter;
	private boolean mIsNight;
	private TwilightManager mTwilightManager;
	final AppCompatDelegateImpl this$0;

	AppCompatDelegateImpl$AutoNightModeManager(TwilightManager twilightmanager)
	{
		this$0 = AppCompatDelegateImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AppCompatDelegateImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		mTwilightManager = twilightmanager;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field TwilightManager mTwilightManager>
		mIsNight = twilightmanager.isNight();
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #29  <Method boolean TwilightManager.isNight()>
	//   11   19:putfield        #31  <Field boolean mIsNight>
	//   12   22:return          
	}
}
