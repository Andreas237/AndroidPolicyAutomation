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
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field Context context>
	//    5    9:aload_0         
	//    6   10:new             #6   <Class DevicePowerStateListener$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #50  <Method void DevicePowerStateListener$1(DevicePowerStateListener)>
	//   10   18:putfield        #52  <Field BroadcastReceiver powerConnectedReceiver>
	//   11   21:aload_0         
	//   12   22:new             #8   <Class DevicePowerStateListener$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #53  <Method void DevicePowerStateListener$2(DevicePowerStateListener)>
	//   16   30:putfield        #55  <Field BroadcastReceiver powerDisconnectedReceiver>
	//   17   33:aload_0         
	//   18   34:new             #57  <Class AtomicBoolean>
	//   19   37:dup             
	//   20   38:iconst_0        
	//   21   39:invokespecial   #60  <Method void AtomicBoolean(boolean)>
	//   22   42:putfield        #62  <Field AtomicBoolean receiversRegistered>
	//   23   45:return          
	}

	public void dispose()
	{
		if(!receiversRegistered.getAndSet(false))
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field AtomicBoolean receiversRegistered>
	//*   2    4:iconst_0        
	//*   3    5:invokevirtual   #71  <Method boolean AtomicBoolean.getAndSet(boolean)>
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
	//    9   17:getfield        #52  <Field BroadcastReceiver powerConnectedReceiver>
	//   10   20:invokevirtual   #77  <Method void Context.unregisterReceiver(BroadcastReceiver)>
			context.unregisterReceiver(powerDisconnectedReceiver);
	//   11   23:aload_0         
	//   12   24:getfield        #47  <Field Context context>
	//   13   27:aload_0         
	//   14   28:getfield        #55  <Field BroadcastReceiver powerDisconnectedReceiver>
	//   15   31:invokevirtual   #77  <Method void Context.unregisterReceiver(BroadcastReceiver)>
			return;
	//   16   34:return          
		}
	}

	public void initialize()
	{
		Object obj = ((Object) (receiversRegistered));
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field AtomicBoolean receiversRegistered>
	//    2    4:astore          4
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore_3        
		if(((AtomicBoolean) (obj)).getAndSet(true))
	//*   5    8:aload           4
	//*   6   10:iconst_1        
	//*   7   11:invokevirtual   #71  <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*   8   14:ifeq            18
			return;
	//    9   17:return          
		obj = ((Object) (context.registerReceiver(((BroadcastReceiver) (null)), FILTER_BATTERY_CHANGED)));
	//   10   18:aload_0         
	//   11   19:getfield        #47  <Field Context context>
	//   12   22:aconst_null     
	//   13   23:getstatic       #33  <Field IntentFilter FILTER_BATTERY_CHANGED>
	//   14   26:invokevirtual   #82  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   15   29:astore          4
		int i = -1;
	//   16   31:iconst_m1       
	//   17   32:istore_1        
		if(obj != null)
	//*  18   33:aload           4
	//*  19   35:ifnull          47
			i = ((Intent) (obj)).getIntExtra("status", -1);
	//   20   38:aload           4
	//   21   40:ldc1            #84  <String "status">
	//   22   42:iconst_m1       
	//   23   43:invokevirtual   #90  <Method int Intent.getIntExtra(String, int)>
	//   24   46:istore_1        
		boolean flag = flag1;
	//   25   47:iload_3         
	//   26   48:istore_2        
		if(i != 2)
	//*  27   49:iload_1         
	//*  28   50:iconst_2        
	//*  29   51:icmpeq          66
			if(i == 5)
	//*  30   54:iload_1         
	//*  31   55:iconst_5        
	//*  32   56:icmpne          64
				flag = flag1;
	//   33   59:iload_3         
	//   34   60:istore_2        
			else
	//*  35   61:goto            66
				flag = false;
	//   36   64:iconst_0        
	//   37   65:istore_2        
		isPowerConnected = flag;
	//   38   66:aload_0         
	//   39   67:iload_2         
	//   40   68:putfield        #66  <Field boolean isPowerConnected>
		context.registerReceiver(powerConnectedReceiver, FILTER_POWER_CONNECTED);
	//   41   71:aload_0         
	//   42   72:getfield        #47  <Field Context context>
	//   43   75:aload_0         
	//   44   76:getfield        #52  <Field BroadcastReceiver powerConnectedReceiver>
	//   45   79:getstatic       #37  <Field IntentFilter FILTER_POWER_CONNECTED>
	//   46   82:invokevirtual   #82  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   47   85:pop             
		context.registerReceiver(powerDisconnectedReceiver, FILTER_POWER_DISCONNECTED);
	//   48   86:aload_0         
	//   49   87:getfield        #47  <Field Context context>
	//   50   90:aload_0         
	//   51   91:getfield        #55  <Field BroadcastReceiver powerDisconnectedReceiver>
	//   52   94:getstatic       #41  <Field IntentFilter FILTER_POWER_DISCONNECTED>
	//   53   97:invokevirtual   #82  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   54  100:pop             
	//   55  101:return          
	}

	public boolean isPowerConnected()
	{
		return isPowerConnected;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field boolean isPowerConnected>
	//    2    4:ireturn         
	}

	private static final IntentFilter FILTER_BATTERY_CHANGED = new IntentFilter("android.intent.action.BATTERY_CHANGED");
	private static final IntentFilter FILTER_POWER_CONNECTED = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
	private static final IntentFilter FILTER_POWER_DISCONNECTED = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
	private final Context context;
	private boolean isPowerConnected;
	private final BroadcastReceiver powerConnectedReceiver = new BroadcastReceiver() {

		public void onReceive(Context context2, Intent intent)
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

		public void onReceive(Context context2, Intent intent)
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
	private final AtomicBoolean receiversRegistered = new AtomicBoolean(false);

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
	//    2    2:putfield        #66  <Field boolean isPowerConnected>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
