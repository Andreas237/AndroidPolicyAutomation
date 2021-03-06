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
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9, TwilightManager, ResourcesFlusher, AppCompatCallback

class AppCompatDelegateImplV14 extends AppCompatDelegateImplV9
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
	//    4    4:invokespecial   #30  <Method void AppCompatDelegateImplV9(Context, Window, AppCompatCallback)>
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
		boolean flag1 = mApplyDayNightCalled;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean mApplyDayNightCalled>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(flag1 && (mContext instanceof Activity))
	//*   5    7:iload_3         
	//*   6    8:ifeq            84
	//*   7   11:aload_0         
	//*   8   12:getfield        #43  <Field Context mContext>
	//*   9   15:instanceof      #65  <Class Activity>
	//*  10   18:ifeq            84
		{
			PackageManager packagemanager = mContext.getPackageManager();
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field Context mContext>
	//   13   25:invokevirtual   #71  <Method PackageManager Context.getPackageManager()>
	//   14   28:astore          4
			int i;
			try
			{
				i = packagemanager.getActivityInfo(new ComponentName(mContext, ((Object) (mContext)).getClass()), 0).configChanges;
	//   15   30:aload           4
	//   16   32:new             #73  <Class ComponentName>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:getfield        #43  <Field Context mContext>
	//   20   40:aload_0         
	//   21   41:getfield        #43  <Field Context mContext>
	//   22   44:invokevirtual   #79  <Method Class Object.getClass()>
	//   23   47:invokespecial   #82  <Method void ComponentName(Context, Class)>
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #88  <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//   26   54:getfield        #93  <Field int ActivityInfo.configChanges>
	//   27   57:istore_1        
			}
	//*  28   58:iload_1         
	//*  29   59:sipush          512
	//*  30   62:iand            
	//*  31   63:ifne            68
	//*  32   66:iconst_1        
	//*  33   67:istore_2        
	//*  34   68:iload_2         
	//*  35   69:ireturn         
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  36   70:astore          4
			{
				Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", ((Throwable) (namenotfoundexception)));
	//   37   72:ldc1            #95  <String "AppCompatDelegate">
	//   38   74:ldc1            #97  <String "Exception while getting ActivityInfo">
	//   39   76:aload           4
	//   40   78:invokestatic    #103 <Method int Log.d(String, String, Throwable)>
	//   41   81:pop             
				return true;
	//   42   82:iconst_1        
	//   43   83:ireturn         
			}
			if((i & 0x200) == 0)
				flag = true;
			return flag;
		} else
		{
			return false;
	//   44   84:iconst_0        
	//   45   85:ireturn         
		}
	}

	private boolean updateForNightMode(int i)
	{
		Resources resources = mContext.getResources();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Context mContext>
	//    2    4:invokevirtual   #109 <Method Resources Context.getResources()>
	//    3    7:astore_3        
		Configuration configuration = resources.getConfiguration();
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
	//*  12   22:icmpne          31
			i = 32;
	//   13   25:bipush          32
	//   14   27:istore_1        
		else
	//*  15   28:goto            34
			i = 16;
	//   16   31:bipush          16
	//   17   33:istore_1        
		if((j & 0x30) != i)
	//*  18   34:iload_2         
	//*  19   35:bipush          48
	//*  20   37:iand            
	//*  21   38:iload_1         
	//*  22   39:icmpeq          117
		{
			if(shouldRecreateOnNightModeChange())
	//*  23   42:aload_0         
	//*  24   43:invokespecial   #122 <Method boolean shouldRecreateOnNightModeChange()>
	//*  25   46:ifeq            62
			{
				((Activity)mContext).recreate();
	//   26   49:aload_0         
	//   27   50:getfield        #43  <Field Context mContext>
	//   28   53:checkcast       #65  <Class Activity>
	//   29   56:invokevirtual   #125 <Method void Activity.recreate()>
			} else
	//*  30   59:goto            115
			{
				configuration = new Configuration(configuration);
	//   31   62:new             #117 <Class Configuration>
	//   32   65:dup             
	//   33   66:aload           4
	//   34   68:invokespecial   #128 <Method void Configuration(Configuration)>
	//   35   71:astore          4
				android.util.DisplayMetrics displaymetrics = resources.getDisplayMetrics();
	//   36   73:aload_3         
	//   37   74:invokevirtual   #132 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   38   77:astore          5
				configuration.uiMode = i | configuration.uiMode & 0xffffffcf;
	//   39   79:aload           4
	//   40   81:iload_1         
	//   41   82:aload           4
	//   42   84:getfield        #120 <Field int Configuration.uiMode>
	//   43   87:bipush          -49
	//   44   89:iand            
	//   45   90:ior             
	//   46   91:putfield        #120 <Field int Configuration.uiMode>
				resources.updateConfiguration(configuration, displaymetrics);
	//   47   94:aload_3         
	//   48   95:aload           4
	//   49   97:aload           5
	//   50   99:invokevirtual   #136 <Method void Resources.updateConfiguration(Configuration, android.util.DisplayMetrics)>
				if(android.os.Build.VERSION.SDK_INT < 26)
	//*  51  102:getstatic       #141 <Field int android.os.Build$VERSION.SDK_INT>
	//*  52  105:bipush          26
	//*  53  107:icmpge          115
					ResourcesFlusher.flush(resources);
	//   54  110:aload_3         
	//   55  111:invokestatic    #147 <Method boolean ResourcesFlusher.flush(Resources)>
	//   56  114:pop             
			}
			return true;
	//   57  115:iconst_1        
	//   58  116:ireturn         
		} else
		{
			return false;
	//   59  117:iconst_0        
	//   60  118:ireturn         
		}
	}

	public boolean applyDayNight()
	{
		int i = getNightMode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #150 <Method int getNightMode()>
	//    2    4:istore_1        
		int j = mapNightMode(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #154 <Method int mapNightMode(int)>
	//    6   10:istore_2        
		boolean flag;
		if(j != -1)
	//*   7   11:iload_2         
	//*   8   12:iconst_m1       
	//*   9   13:icmpeq          25
			flag = updateForNightMode(j);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:invokespecial   #156 <Method boolean updateForNightMode(int)>
	//   13   21:istore_3        
		else
	//*  14   22:goto            27
			flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_3        
		if(i == 0)
	//*  17   27:iload_1         
	//*  18   28:ifne            42
		{
			ensureAutoNightModeManager();
	//   19   31:aload_0         
	//   20   32:invokespecial   #158 <Method void ensureAutoNightModeManager()>
			mAutoNightModeManager.setup();
	//   21   35:aload_0         
	//   22   36:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//   23   39:invokevirtual   #161 <Method void AppCompatDelegateImplV14$AutoNightModeManager.setup()>
		}
		mApplyDayNightCalled = true;
	//   24   42:aload_0         
	//   25   43:iconst_1        
	//   26   44:putfield        #63  <Field boolean mApplyDayNightCalled>
		return flag;
	//   27   47:iload_3         
	//   28   48:ireturn         
	}

	View callActivityOnCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
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

	public boolean hasWindowFeature(int i)
	{
		return super.hasWindowFeature(i) || mWindow.hasFeature(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #170 <Method boolean AppCompatDelegateImplV9.hasWindowFeature(int)>
	//    3    5:ifne            24
	//    4    8:aload_0         
	//    5    9:getfield        #174 <Field Window mWindow>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #179 <Method boolean Window.hasFeature(int)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
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
		if(i != -100)
	//*   0    0:iload_1         
	//*   1    1:bipush          -100
	//*   2    3:icmpeq          24
		{
			if(i != 0)
	//*   3    6:iload_1         
	//*   4    7:ifeq            12
			{
				return i;
	//    5   10:iload_1         
	//    6   11:ireturn         
			} else
			{
				ensureAutoNightModeManager();
	//    7   12:aload_0         
	//    8   13:invokespecial   #158 <Method void ensureAutoNightModeManager()>
				return mAutoNightModeManager.getApplyableNightMode();
	//    9   16:aload_0         
	//   10   17:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//   11   20:invokevirtual   #183 <Method int AppCompatDelegateImplV14$AutoNightModeManager.getApplyableNightMode()>
	//   12   23:ireturn         
			}
		} else
		{
			return -1;
	//   13   24:iconst_m1       
	//   14   25:ireturn         
		}
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #187 <Method void AppCompatDelegateImplV9.onCreate(Bundle)>
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
	//   13   24:invokevirtual   #193 <Method int Bundle.getInt(String, int)>
	//   14   27:putfield        #32  <Field int mLocalNightMode>
	//   15   30:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #196 <Method void AppCompatDelegateImplV9.onDestroy()>
		if(mAutoNightModeManager != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//*   4    8:ifnull          18
			mAutoNightModeManager.cleanup();
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//    7   15:invokevirtual   #199 <Method void AppCompatDelegateImplV14$AutoNightModeManager.cleanup()>
	//    8   18:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #202 <Method void AppCompatDelegateImplV9.onSaveInstanceState(Bundle)>
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
	//   11   21:invokevirtual   #206 <Method void Bundle.putInt(String, int)>
	//   12   24:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #209 <Method void AppCompatDelegateImplV9.onStart()>
		applyDayNight();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #211 <Method boolean applyDayNight()>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method void AppCompatDelegateImplV9.onStop()>
		if(mAutoNightModeManager != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//*   4    8:ifnull          18
			mAutoNightModeManager.cleanup();
	//    5   11:aload_0         
	//    6   12:getfield        #39  <Field AppCompatDelegateImplV14$AutoNightModeManager mAutoNightModeManager>
	//    7   15:invokevirtual   #199 <Method void AppCompatDelegateImplV14$AutoNightModeManager.cleanup()>
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
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     -1 2: default 32
	//	               -1 41
	//	               0 41
	//	               1 41
	//	               2 41
		default:
			Log.i("AppCompatDelegate", "setLocalNightMode() called with an unknown mode");
	//    2   32:ldc1            #95  <String "AppCompatDelegate">
	//    3   34:ldc1            #220 <String "setLocalNightMode() called with an unknown mode">
	//    4   36:invokestatic    #224 <Method int Log.i(String, String)>
	//    5   39:pop             
			return;
	//    6   40:return          

		case -1: 
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			break;
		}
		if(mLocalNightMode != i)
	//*   7   41:aload_0         
	//*   8   42:getfield        #32  <Field int mLocalNightMode>
	//*   9   45:iload_1         
	//*  10   46:icmpeq          66
		{
			mLocalNightMode = i;
	//   11   49:aload_0         
	//   12   50:iload_1         
	//   13   51:putfield        #32  <Field int mLocalNightMode>
			if(mApplyDayNightCalled)
	//*  14   54:aload_0         
	//*  15   55:getfield        #63  <Field boolean mApplyDayNightCalled>
	//*  16   58:ifeq            66
				applyDayNight();
	//   17   61:aload_0         
	//   18   62:invokevirtual   #211 <Method boolean applyDayNight()>
	//   19   65:pop             
		}
	//   20   66:return          
	}

	android.view.Window.Callback wrapWindowCallback(android.view.Window.Callback callback)
	{
		return ((android.view.Window.Callback) (new AppCompatWindowCallbackV14(callback)));
	//    0    0:new             #6   <Class AppCompatDelegateImplV14$AppCompatWindowCallbackV14>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #229 <Method void AppCompatDelegateImplV14$AppCompatWindowCallbackV14(AppCompatDelegateImplV14, android.view.Window$Callback)>
	//    5    9:areturn         
	}

	private static final String KEY_LOCAL_NIGHT_MODE = "appcompat:local_night_mode";
	private boolean mApplyDayNightCalled;
	private AutoNightModeManager mAutoNightModeManager;
	private boolean mHandleNativeActionModes;
	private int mLocalNightMode;
}
