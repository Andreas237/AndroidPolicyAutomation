// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.*;
import java.util.concurrent.atomic.AtomicBoolean;

class DevicePowerStateListener
{

	public DevicePowerStateListener(Context context1)
	{
		int i = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_2        
		super();
	//    2    2:aload_0         
	//    3    3:invokespecial   #45  <Method void Object()>
		context = context1;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #47  <Field Context context>
		Intent intent = context1.registerReceiver(((BroadcastReceiver) (null)), FILTER_BATTERY_CHANGED);
	//    7   11:aload_1         
	//    8   12:aconst_null     
	//    9   13:getstatic       #33  <Field IntentFilter FILTER_BATTERY_CHANGED>
	//   10   16:invokevirtual   #53  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   11   19:astore          4
		if(intent != null)
	//*  12   21:aload           4
	//*  13   23:ifnull          35
			i = intent.getIntExtra("status", -1);
	//   14   26:aload           4
	//   15   28:ldc1            #55  <String "status">
	//   16   30:iconst_m1       
	//   17   31:invokevirtual   #61  <Method int Intent.getIntExtra(String, int)>
	//   18   34:istore_2        
		boolean flag;
		if(i == 2 || i == 5)
	//*  19   35:iload_2         
	//*  20   36:iconst_2        
	//*  21   37:icmpeq          45
	//*  22   40:iload_2         
	//*  23   41:iconst_5        
	//*  24   42:icmpne          113
			flag = true;
	//   25   45:iconst_1        
	//   26   46:istore_3        
		else
	//*  27   47:aload_0         
	//*  28   48:iload_3         
	//*  29   49:putfield        #63  <Field boolean isPowerConnected>
	//*  30   52:aload_0         
	//*  31   53:new             #6   <Class DevicePowerStateListener$1>
	//*  32   56:dup             
	//*  33   57:aload_0         
	//*  34   58:invokespecial   #66  <Method void DevicePowerStateListener$1(DevicePowerStateListener)>
	//*  35   61:putfield        #68  <Field BroadcastReceiver powerConnectedReceiver>
	//*  36   64:aload_0         
	//*  37   65:new             #8   <Class DevicePowerStateListener$2>
	//*  38   68:dup             
	//*  39   69:aload_0         
	//*  40   70:invokespecial   #69  <Method void DevicePowerStateListener$2(DevicePowerStateListener)>
	//*  41   73:putfield        #71  <Field BroadcastReceiver powerDisconnectedReceiver>
	//*  42   76:aload_1         
	//*  43   77:aload_0         
	//*  44   78:getfield        #68  <Field BroadcastReceiver powerConnectedReceiver>
	//*  45   81:getstatic       #37  <Field IntentFilter FILTER_POWER_CONNECTED>
	//*  46   84:invokevirtual   #53  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//*  47   87:pop             
	//*  48   88:aload_1         
	//*  49   89:aload_0         
	//*  50   90:getfield        #71  <Field BroadcastReceiver powerDisconnectedReceiver>
	//*  51   93:getstatic       #41  <Field IntentFilter FILTER_POWER_DISCONNECTED>
	//*  52   96:invokevirtual   #53  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//*  53   99:pop             
	//*  54  100:aload_0         
	//*  55  101:new             #73  <Class AtomicBoolean>
	//*  56  104:dup             
	//*  57  105:iconst_1        
	//*  58  106:invokespecial   #76  <Method void AtomicBoolean(boolean)>
	//*  59  109:putfield        #78  <Field AtomicBoolean receiversRegistered>
	//*  60  112:return          
			flag = false;
	//   61  113:iconst_0        
	//   62  114:istore_3        
		isPowerConnected = flag;
		context1.registerReceiver(powerConnectedReceiver, FILTER_POWER_CONNECTED);
		context1.registerReceiver(powerDisconnectedReceiver, FILTER_POWER_DISCONNECTED);
	//*  63  115:goto            47
	}

	public void dispose()
	{
		if(!receiversRegistered.getAndSet(false))
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field AtomicBoolean receiversRegistered>
	//*   2    4:iconst_0        
	//*   3    5:invokevirtual   #85  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   4    8:ifne            12
		{
			return;
	//    5   11:return          
		} else
		{
			context.unregisterReceiver(powerConnectedReceiver);
	//    6   12:aload_0         
	//    7   13:getfield        #47  <Field Context context>
	//    8   16:aload_0         
	//    9   17:getfield        #68  <Field BroadcastReceiver powerConnectedReceiver>
	//   10   20:invokevirtual   #89  <Method void Context.unregisterReceiver(BroadcastReceiver)>
			context.unregisterReceiver(powerDisconnectedReceiver);
	//   11   23:aload_0         
	//   12   24:getfield        #47  <Field Context context>
	//   13   27:aload_0         
	//   14   28:getfield        #71  <Field BroadcastReceiver powerDisconnectedReceiver>
	//   15   31:invokevirtual   #89  <Method void Context.unregisterReceiver(BroadcastReceiver)>
			return;
	//   16   34:return          
		}
	}

	public boolean isPowerConnected()
	{
		return isPowerConnected;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean isPowerConnected>
	//    2    4:ireturn         
	}

	private static final IntentFilter FILTER_BATTERY_CHANGED = new IntentFilter("android.intent.action.BATTERY_CHANGED");
	private static final IntentFilter FILTER_POWER_CONNECTED = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
	private static final IntentFilter FILTER_POWER_DISCONNECTED = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
	private final Context context;
	private boolean isPowerConnected;
	private final BroadcastReceiver powerConnectedReceiver = new BroadcastReceiver() {

		public void onReceive(Context context2, Intent intent1)
		{
			isPowerConnected = true;
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field DevicePowerStateListener this$0>
		//    2    4:iconst_1        
		//    3    5:invokestatic    #24  <Method boolean DevicePowerStateListener.access$002(DevicePowerStateListener, boolean)>
		//    4    8:pop             
		//    5    9:return          
		}

		final DevicePowerStateListener this$0;

			
			{
				this$0 = DevicePowerStateListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field DevicePowerStateListener this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
	}
;
	private final BroadcastReceiver powerDisconnectedReceiver = new BroadcastReceiver() {

		public void onReceive(Context context2, Intent intent1)
		{
			isPowerConnected = false;
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field DevicePowerStateListener this$0>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #24  <Method boolean DevicePowerStateListener.access$002(DevicePowerStateListener, boolean)>
		//    4    8:pop             
		//    5    9:return          
		}

		final DevicePowerStateListener this$0;

			
			{
				this$0 = DevicePowerStateListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field DevicePowerStateListener this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
	}
;
	private final AtomicBoolean receiversRegistered = new AtomicBoolean(true);

	static 
	{
	//    0    0:new             #25  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #27  <String "android.intent.action.BATTERY_CHANGED">
	//    3    6:invokespecial   #31  <Method void IntentFilter(String)>
	//    4    9:putstatic       #33  <Field IntentFilter FILTER_BATTERY_CHANGED>
	//    5   12:new             #25  <Class IntentFilter>
	//    6   15:dup             
	//    7   16:ldc1            #35  <String "android.intent.action.ACTION_POWER_CONNECTED">
	//    8   18:invokespecial   #31  <Method void IntentFilter(String)>
	//    9   21:putstatic       #37  <Field IntentFilter FILTER_POWER_CONNECTED>
	//   10   24:new             #25  <Class IntentFilter>
	//   11   27:dup             
	//   12   28:ldc1            #39  <String "android.intent.action.ACTION_POWER_DISCONNECTED">
	//   13   30:invokespecial   #31  <Method void IntentFilter(String)>
	//   14   33:putstatic       #41  <Field IntentFilter FILTER_POWER_DISCONNECTED>
	//*  15   36:return          
	}


/*
	static boolean access$002(DevicePowerStateListener devicepowerstatelistener, boolean flag)
	{
		devicepowerstatelistener.isPowerConnected = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field boolean isPowerConnected>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
