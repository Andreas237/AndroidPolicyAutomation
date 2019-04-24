// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.content.*;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV11, TwilightManager, ResourcesFlusher, AppCompatCallback

class AppCompatDelegateImplV14 extends AppCompatDelegateImplV11
{
	class AppCompatWindowCallbackV14 extends AppCompatDelegateImplBase.AppCompatWindowCallbackBase
	{

		public ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
		{
			if(isHandleNativeActionModesEnabled())
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field AppCompatDelegateImplV14 this$0>
		//*   2    4:invokevirtual   #23  <Method boolean AppCompatDelegateImplV14.isHandleNativeActionModesEnabled()>
		//*   3    7:ifeq            16
				return startAsSupportActionMode(callback);
		//    4   10:aload_0         
		//    5   11:aload_1         
		//    6   12:invokevirtual   #26  <Method ActionMode startAsSupportActionMode(android.view.ActionMode$Callback)>
		//    7   15:areturn         
			else
				return super.onWindowStartingActionMode(callback);
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #28  <Method ActionMode AppCompatDelegateImplBase$AppCompatWindowCallbackBase.onWindowStartingActionMode(android.view.ActionMode$Callback)>
		//   11   21:areturn         
		}

		final ActionMode startAsSupportActionMode(android.view.ActionMode.Callback callback)
		{
			callback = ((android.view.ActionMode.Callback) (new android.support.v7.view.SupportActionModeWrapper.CallbackWrapper(mContext, callback)));
		//    0    0:new             #30  <Class android.support.v7.view.SupportActionModeWrapper$CallbackWrapper>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #13  <Field AppCompatDelegateImplV14 this$0>
		//    4    8:getfield        #34  <Field Context AppCompatDelegateImplV14.mContext>
		//    5   11:aload_1         
		//    6   12:invokespecial   #37  <Method void android.support.v7.view.SupportActionModeWrapper$CallbackWrapper(Context, android.view.ActionMode$Callback)>
		//    7   15:astore_1        
			android.support.v7.view.ActionMode actionmode = startSupportActionMode(((android.support.v7.view.ActionMode.Callback) (callback)));
		//    8   16:aload_0         
		//    9   17:getfield        #13  <Field AppCompatDelegateImplV14 this$0>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #41  <Method android.support.v7.view.ActionMode AppCompatDelegateImplV14.startSupportActionMode(android.support.v7.view.ActionMode$Callback)>
		//   12   24:astore_2        
			if(actionmode != null)
		//*  13   25:aload_2         
		//*  14   26:ifnull          35
				return ((android.support.v7.view.SupportActionModeWrapper.CallbackWrapper) (callback)).getActionModeWrapper(actionmode);
		//   15   29:aload_1         
		//   16   30:aload_2         
		//   17   31:invokevirtual   #45  <Method ActionMode android.support.v7.view.SupportActionModeWrapper$CallbackWrapper.getActionModeWrapper(android.support.v7.view.ActionMode)>
		//   18   34:areturn         
			else
				return null;
		//   19   35:aconst_null     
		//   20   36:areturn         
		}

		final AppCompatDelegateImplV14 this$0;

		AppCompatWindowCallbackV14(android.view.Window.Callback callback)
		{
			this$0 = AppCompatDelegateImplV14.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppCompatDelegateImplV14 this$0>
			super(((AppCompatDelegateImplBase) (AppCompatDelegateImplV14.this)), callback);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokespecial   #16  <Method void AppCompatDelegateImplBase$AppCompatWindowCallbackBase(AppCompatDelegateImplBase, android.view.Window$Callback)>
		//    7   11:return          
		}
	}

	final class AutoNightModeManager
	{

		final void cleanup()
		{
			if(mAutoTimeChangeReceiver != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		//*   2    4:ifnull          26
			{
				mContext.unregisterReceiver(mAutoTimeChangeReceiver);
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field AppCompatDelegateImplV14 this$0>
		//    5   11:getfield        #47  <Field Context AppCompatDelegateImplV14.mContext>
		//    6   14:aload_0         
		//    7   15:getfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		//    8   18:invokevirtual   #53  <Method void Context.unregisterReceiver(BroadcastReceiver)>
				mAutoTimeChangeReceiver = null;
		//    9   21:aload_0         
		//   10   22:aconst_null     
		//   11   23:putfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
			}
		//   12   26:return          
		}

		final void dispatchTimeChanged()
		{
			boolean flag = mTwilightManager.isNight();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field TwilightManager mTwilightManager>
		//    2    4:invokevirtual   #36  <Method boolean TwilightManager.isNight()>
		//    3    7:istore_1        
			if(flag != mIsNight)
		//*   4    8:iload_1         
		//*   5    9:aload_0         
		//*   6   10:getfield        #38  <Field boolean mIsNight>
		//*   7   13:icmpeq          29
			{
				mIsNight = flag;
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:putfield        #38  <Field boolean mIsNight>
				applyDayNight();
		//   11   21:aload_0         
		//   12   22:getfield        #25  <Field AppCompatDelegateImplV14 this$0>
		//   13   25:invokevirtual   #57  <Method boolean AppCompatDelegateImplV14.applyDayNight()>
		//   14   28:pop             
			}
		//   15   29:return          
		}

		final int getApplyableNightMode()
		{
			mIsNight = mTwilightManager.isNight();
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field TwilightManager mTwilightManager>
		//    3    5:invokevirtual   #36  <Method boolean TwilightManager.isNight()>
		//    4    8:putfield        #38  <Field boolean mIsNight>
			return !mIsNight ? 1 : 2;
		//    5   11:aload_0         
		//    6   12:getfield        #38  <Field boolean mIsNight>
		//    7   15:ifeq            20
		//    8   18:iconst_2        
		//    9   19:ireturn         
		//   10   20:iconst_1        
		//   11   21:ireturn         
		}

		final void setup()
		{
			cleanup();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #62  <Method void cleanup()>
			if(mAutoTimeChangeReceiver == null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		//*   4    8:ifnonnull       23
				mAutoTimeChangeReceiver = ((BroadcastReceiver) (new BroadcastReceiver() {

					public void onReceive(Context context, Intent intent)
					{
						dispatchTimeChanged();
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field AppCompatDelegateImplV14$AutoNightModeManager this$1>
					//    2    4:invokevirtual   #26  <Method void AppCompatDelegateImplV14$AutoNightModeManager.dispatchTimeChanged()>
					//    3    7:return          
					}

					final AutoNightModeManager this$1;

			
			{
				this$1 = AutoNightModeManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AppCompatDelegateImplV14$AutoNightModeManager this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
				}
));
		//    5   11:aload_0         
		//    6   12:new             #9   <Class AppCompatDelegateImplV14$AutoNightModeManager$1>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:invokespecial   #65  <Method void AppCompatDelegateImplV14$AutoNightModeManager$1(AppCompatDelegateImplV14$AutoNightModeManager)>
		//   10   20:putfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
			if(mAutoTimeChangeReceiverFilter == null)
		//*  11   23:aload_0         
		//*  12   24:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//*  13   27:ifnonnull       68
			{
				mAutoTimeChangeReceiverFilter = new IntentFilter();
		//   14   30:aload_0         
		//   15   31:new             #69  <Class IntentFilter>
		//   16   34:dup             
		//   17   35:invokespecial   #70  <Method void IntentFilter()>
		//   18   38:putfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
				mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIME_SET");
		//   19   41:aload_0         
		//   20   42:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//   21   45:ldc1            #72  <String "android.intent.action.TIME_SET">
		//   22   47:invokevirtual   #76  <Method void IntentFilter.addAction(String)>
				mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
		//   23   50:aload_0         
		//   24   51:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//   25   54:ldc1            #78  <String "android.intent.action.TIMEZONE_CHANGED">
		//   26   56:invokevirtual   #76  <Method void IntentFilter.addAction(String)>
				mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIME_TICK");
		//   27   59:aload_0         
		//   28   60:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//   29   63:ldc1            #80  <String "android.intent.action.TIME_TICK">
		//   30   65:invokevirtual   #76  <Method void IntentFilter.addAction(String)>
			}
			mContext.registerReceiver(mAutoTimeChangeReceiver, mAutoTimeChangeReceiverFilter);
		//   31   68:aload_0         
		//   32   69:getfield        #25  <Field AppCompatDelegateImplV14 this$0>
		//   33   72:getfield        #47  <Field Context AppCompatDelegateImplV14.mContext>
		//   34   75:aload_0         
		//   35   76:getfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		//   36   79:aload_0         
		//   37   80:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//   38   83:invokevirtual   #84  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
		//   39   86:pop             
		//   40   87:return          
		}

		private BroadcastReceiver mAutoTimeChangeReceiver;
		private IntentFilter mAutoTimeChangeReceiverFilter;
		private boolean mIsNight;
		private TwilightManager mTwilightManager;
		final AppCompatDelegateImplV14 this$0;

		AutoNightModeManager(TwilightManager twilightmanager)
		{
			this$0 = AppCompatDelegateImplV14.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field AppCompatDelegateImplV14 this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #28  <Method void Object()>
			mTwilightManager = twilightmanager;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #30  <Field TwilightManager mTwilightManager>
			mIsNight = twilightmanager.isNight();
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #36  <Method boolean TwilightManager.isNight()>
		//   11   19:putfield        #38  <Field boolean mIsNight>
		//   12   22:return          
		}
	}


	AppCompatDelegateImplV14(Context context, Window window, AppCompatCallback appcompatcallback)
	{
		super(context, window, appcompatcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #30  <Method void AppCompatDelegateImplV11(Context, Window, AppCompatCallback)>
		mLocalNightMode = -100;
	//    5    7:aload_0         
	//    6    8:bipush          -100
	//    7   10:putfield        #32  <Field int mLocalNightMode>
		mHandleNativeActionModes = true;
	//    8   13:aload_0         
	//    9   14:iconst_1        
	//   10   15:putfield        #34  <Field boolean mHandleNativeActionModes>
	//   11   18:return          
	}

	private void ensureAutoNightModeManager()
	{
		if(mAutoNightModeManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//*   2    4:ifnonnull       26
			mAutoNightModeManager = new AutoNightModeManager(TwilightManager.getInstance(mContext));
	//    3    7:aload_0         
	//    4    8:new             #9   <Class AppCompatDelegateImplV14$AutoNightModeManager>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #43  <Field Context mContext>
	//    9   17:invokestatic    #49  <Method TwilightManager TwilightManager.getInstance(Context)>
	//   10   20:invokespecial   #52  <Method void AppCompatDelegateImplV14$AutoNightModeManager(AppCompatDelegateImplV14, TwilightManager)>
	//   11   23:putfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//   12   26:return          
	}

	private int getNightMode()
	{
		if(mLocalNightMode != -100)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field int mLocalNightMode>
	//*   2    4:bipush          -100
	//*   3    6:icmpeq          14
			return mLocalNightMode;
	//    4    9:aload_0         
	//    5   10:getfield        #32  <Field int mLocalNightMode>
	//    6   13:ireturn         
		else
			return getDefaultNightMode();
	//    7   14:invokestatic    #57  <Method int getDefaultNightMode()>
	//    8   17:ireturn         
	}

	private boolean shouldRecreateOnNightModeChange()
	{
		if(mApplyDayNightCalled && (mContext instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field boolean mApplyDayNightCalled>
	//*   2    4:ifeq            76
	//*   3    7:aload_0         
	//*   4    8:getfield        #43  <Field Context mContext>
	//*   5   11:instanceof      #65  <Class Activity>
	//*   6   14:ifeq            76
		{
			PackageManager packagemanager = mContext.getPackageManager();
	//    7   17:aload_0         
	//    8   18:getfield        #43  <Field Context mContext>
	//    9   21:invokevirtual   #71  <Method PackageManager Context.getPackageManager()>
	//   10   24:astore_2        
			int i;
			try
			{
				i = packagemanager.getActivityInfo(new ComponentName(mContext, ((Object) (mContext)).getClass()), 0).configChanges;
	//   11   25:aload_2         
	//   12   26:new             #73  <Class ComponentName>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #43  <Field Context mContext>
	//   16   34:aload_0         
	//   17   35:getfield        #43  <Field Context mContext>
	//   18   38:invokevirtual   #79  <Method Class Object.getClass()>
	//   19   41:invokespecial   #82  <Method void ComponentName(Context, Class)>
	//   20   44:iconst_0        
	//   21   45:invokevirtual   #88  <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//   22   48:getfield        #93  <Field int ActivityInfo.configChanges>
	//   23   51:istore_1        
			}
	//*  24   52:iload_1         
	//*  25   53:sipush          512
	//*  26   56:iand            
	//*  27   57:ifne            62
	//*  28   60:iconst_1        
	//*  29   61:ireturn         
	//*  30   62:iconst_0        
	//*  31   63:ireturn         
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  32   64:astore_2        
			{
				Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", ((Throwable) (namenotfoundexception)));
	//   33   65:ldc1            #95  <String "AppCompatDelegate">
	//   34   67:ldc1            #97  <String "Exception while getting ActivityInfo">
	//   35   69:aload_2         
	//   36   70:invokestatic    #103 <Method int Log.d(String, String, Throwable)>
	//   37   73:pop             
				return true;
	//   38   74:iconst_1        
	//   39   75:ireturn         
			}
			return (i & 0x200) == 0;
		} else
		{
			return false;
	//   40   76:iconst_0        
	//   41   77:ireturn         
		}
	}

	private boolean updateForNightMode(int i)
	{
		Resources resources;
		Configuration configuration;
		resources = mContext.getResources();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Context mContext>
	//    2    4:invokevirtual   #109 <Method Resources Context.getResources()>
	//    3    7:astore_3        
		configuration = resources.getConfiguration();
	//    4    8:aload_3         
	//    5    9:invokevirtual   #115 <Method Configuration Resources.getConfiguration()>
	//    6   12:astore          4
		int j = configuration.uiMode;
	//    7   14:aload           4
	//    8   16:getfield        #120 <Field int Configuration.uiMode>
	//    9   19:istore_2        
		if(i == 2)
	//*  10   20:iload_1         
	//*  11   21:iconst_2        
	//*  12   22:icmpne          55
			i = 32;
	//   13   25:bipush          32
	//   14   27:istore_1        
		else
	//*  15   28:iload_2         
	//*  16   29:bipush          48
	//*  17   31:iand            
	//*  18   32:iload_1         
	//*  19   33:icmpeq          117
	//*  20   36:aload_0         
	//*  21   37:invokespecial   #122 <Method boolean shouldRecreateOnNightModeChange()>
	//*  22   40:ifeq            61
	//*  23   43:aload_0         
	//*  24   44:getfield        #43  <Field Context mContext>
	//*  25   47:checkcast       #65  <Class Activity>
	//*  26   50:invokevirtual   #125 <Method void Activity.recreate()>
	//*  27   53:iconst_1        
	//*  28   54:ireturn         
			i = 16;
	//   29   55:bipush          16
	//   30   57:istore_1        
		if((j & 0x30) == i) goto _L2; else goto _L1
_L1:
		if(!shouldRecreateOnNightModeChange()) goto _L4; else goto _L3
_L3:
		((Activity)mContext).recreate();
_L5:
		return true;
	//*  31   58:goto            28
_L4:
		configuration = new Configuration(configuration);
	//   32   61:new             #117 <Class Configuration>
	//   33   64:dup             
	//   34   65:aload           4
	//   35   67:invokespecial   #128 <Method void Configuration(Configuration)>
	//   36   70:astore          4
		android.util.DisplayMetrics displaymetrics = resources.getDisplayMetrics();
	//   37   72:aload_3         
	//   38   73:invokevirtual   #132 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   39   76:astore          5
		configuration.uiMode = i | configuration.uiMode & 0xffffffcf;
	//   40   78:aload           4
	//   41   80:iload_1         
	//   42   81:aload           4
	//   43   83:getfield        #120 <Field int Configuration.uiMode>
	//   44   86:bipush          -49
	//   45   88:iand            
	//   46   89:ior             
	//   47   90:putfield        #120 <Field int Configuration.uiMode>
		resources.updateConfiguration(configuration, displaymetrics);
	//   48   93:aload_3         
	//   49   94:aload           4
	//   50   96:aload           5
	//   51   98:invokevirtual   #136 <Method void Resources.updateConfiguration(Configuration, android.util.DisplayMetrics)>
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*  52  101:getstatic       #141 <Field int android.os.Build$VERSION.SDK_INT>
	//*  53  104:bipush          26
	//*  54  106:icmpge          53
			ResourcesFlusher.flush(resources);
	//   55  109:aload_3         
	//   56  110:invokestatic    #147 <Method boolean ResourcesFlusher.flush(Resources)>
	//   57  113:pop             
		if(true) goto _L5; else goto _L2
	//   58  114:goto            53
_L2:
		return false;
	//   59  117:iconst_0        
	//   60  118:ireturn         
	}

	public boolean applyDayNight()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = getNightMode();
	//    2    2:aload_0         
	//    3    3:invokespecial   #150 <Method int getNightMode()>
	//    4    6:istore_1        
		int j = mapNightMode(i);
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:invokevirtual   #154 <Method int mapNightMode(int)>
	//    8   12:istore_2        
		if(j != -1)
	//*   9   13:iload_2         
	//*  10   14:iconst_m1       
	//*  11   15:icmpeq          24
			flag = updateForNightMode(j);
	//   12   18:aload_0         
	//   13   19:iload_2         
	//   14   20:invokespecial   #156 <Method boolean updateForNightMode(int)>
	//   15   23:istore_3        
		if(i == 0)
	//*  16   24:iload_1         
	//*  17   25:ifne            39
		{
			ensureAutoNightModeManager();
	//   18   28:aload_0         
	//   19   29:invokespecial   #158 <Method void ensureAutoNightModeManager()>
			mAutoNightModeManager.setup();
	//   20   32:aload_0         
	//   21   33:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//   22   36:invokevirtual   #161 <Method void AppCompatDelegateImplV14$AutoNightModeManager.setup()>
		}
		mApplyDayNightCalled = true;
	//   23   39:aload_0         
	//   24   40:iconst_1        
	//   25   41:putfield        #63  <Field boolean mApplyDayNightCalled>
		return flag;
	//   26   44:iload_3         
	//   27   45:ireturn         
	}

	final AutoNightModeManager getAutoNightModeManager()
	{
		ensureAutoNightModeManager();
	//    0    0:aload_0         
	//    1    1:invokespecial   #158 <Method void ensureAutoNightModeManager()>
		return mAutoNightModeManager;
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//    4    8:areturn         
	}

	public boolean isHandleNativeActionModesEnabled()
	{
		return mHandleNativeActionModes;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean mHandleNativeActionModes>
	//    2    4:ireturn         
	}

	int mapNightMode(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               -100: 42
	//	               0: 30
		default:
			return i;
	//    2   28:iload_1         
	//    3   29:ireturn         

		case 0: // '\0'
			ensureAutoNightModeManager();
	//    4   30:aload_0         
	//    5   31:invokespecial   #158 <Method void ensureAutoNightModeManager()>
			return mAutoNightModeManager.getApplyableNightMode();
	//    6   34:aload_0         
	//    7   35:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//    8   38:invokevirtual   #169 <Method int AppCompatDelegateImplV14$AutoNightModeManager.getApplyableNightMode()>
	//    9   41:ireturn         

		case -100: 
			return -1;
	//   10   42:iconst_m1       
	//   11   43:ireturn         
		}
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #173 <Method void AppCompatDelegateImplV11.onCreate(Bundle)>
		if(bundle != null && mLocalNightMode == -100)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #32  <Field int mLocalNightMode>
	//*   7   13:bipush          -100
	//*   8   15:icmpne          30
			mLocalNightMode = bundle.getInt("appcompat:local_night_mode", -100);
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #19  <String "appcompat:local_night_mode">
	//   12   22:bipush          -100
	//   13   24:invokevirtual   #179 <Method int Bundle.getInt(String, int)>
	//   14   27:putfield        #32  <Field int mLocalNightMode>
	//   15   30:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method void AppCompatDelegateImplV11.onDestroy()>
		if(mAutoNightModeManager != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//*   4    8:ifnull          18
			mAutoNightModeManager.cleanup();
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//    7   15:invokevirtual   #185 <Method void AppCompatDelegateImplV14$AutoNightModeManager.cleanup()>
	//    8   18:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #188 <Method void AppCompatDelegateImplV11.onSaveInstanceState(Bundle)>
		if(mLocalNightMode != -100)
	//*   3    5:aload_0         
	//*   4    6:getfield        #32  <Field int mLocalNightMode>
	//*   5    9:bipush          -100
	//*   6   11:icmpeq          24
			bundle.putInt("appcompat:local_night_mode", mLocalNightMode);
	//    7   14:aload_1         
	//    8   15:ldc1            #19  <String "appcompat:local_night_mode">
	//    9   17:aload_0         
	//   10   18:getfield        #32  <Field int mLocalNightMode>
	//   11   21:invokevirtual   #192 <Method void Bundle.putInt(String, int)>
	//   12   24:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #195 <Method void AppCompatDelegateImplV11.onStart()>
		applyDayNight();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #197 <Method boolean applyDayNight()>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #200 <Method void AppCompatDelegateImplV11.onStop()>
		if(mAutoNightModeManager != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//*   4    8:ifnull          18
			mAutoNightModeManager.cleanup();
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//    7   15:invokevirtual   #185 <Method void AppCompatDelegateImplV14$AutoNightModeManager.cleanup()>
	//    8   18:return          
	}

	public void setHandleNativeActionModesEnabled(boolean flag)
	{
		mHandleNativeActionModes = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field boolean mHandleNativeActionModes>
	//    3    5:return          
	}

	public void setLocalNightMode(int i)
	{
		i;
	//    0    0:iload_1         
		JVM INSTR tableswitch -1 2: default 32
	//	               -1 41
	//	               0 41
	//	               1 41
	//	               2 41;
	//    1    1:tableswitch     -1 2: default 32
	//	               -1 41
	//	               0 41
	//	               1 41
	//	               2 41
		   goto _L1 _L2 _L2 _L2 _L2
_L1:
		Log.i("AppCompatDelegate", "setLocalNightMode() called with an unknown mode");
	//    2   32:ldc1            #95  <String "AppCompatDelegate">
	//    3   34:ldc1            #206 <String "setLocalNightMode() called with an unknown mode">
	//    4   36:invokestatic    #210 <Method int Log.i(String, String)>
	//    5   39:pop             
_L4:
		return;
	//    6   40:return          
_L2:
		if(mLocalNightMode != i)
	//*   7   41:aload_0         
	//*   8   42:getfield        #32  <Field int mLocalNightMode>
	//*   9   45:iload_1         
	//*  10   46:icmpeq          40
		{
			mLocalNightMode = i;
	//   11   49:aload_0         
	//   12   50:iload_1         
	//   13   51:putfield        #32  <Field int mLocalNightMode>
			if(mApplyDayNightCalled)
	//*  14   54:aload_0         
	//*  15   55:getfield        #63  <Field boolean mApplyDayNightCalled>
	//*  16   58:ifeq            40
			{
				applyDayNight();
	//   17   61:aload_0         
	//   18   62:invokevirtual   #197 <Method boolean applyDayNight()>
	//   19   65:pop             
				return;
	//   20   66:return          
			}
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	android.view.Window.Callback wrapWindowCallback(android.view.Window.Callback callback)
	{
		return ((android.view.Window.Callback) (new AppCompatWindowCallbackV14(callback)));
	//    0    0:new             #6   <Class AppCompatDelegateImplV14$AppCompatWindowCallbackV14>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #215 <Method void AppCompatDelegateImplV14$AppCompatWindowCallbackV14(AppCompatDelegateImplV14, android.view.Window$Callback)>
	//    5    9:areturn         
	}

	private static final String KEY_LOCAL_NIGHT_MODE = "appcompat:local_night_mode";
	private boolean mApplyDayNightCalled;
	private AutoNightModeManager mAutoNightModeManager;
	private boolean mHandleNativeActionModes;
	private int mLocalNightMode;
}
