// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.scheduler;

import android.content.*;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.scheduler:
//			Requirements

public final class RequirementsWatcher
{
	private final class CapabilityValidatedCallback extends android.net.ConnectivityManager.NetworkCallback
	{

		public void onAvailable(Network network)
		{
			super.onAvailable(network);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #27  <Method void android.net.ConnectivityManager$NetworkCallback.onAvailable(Network)>
			network = ((Network) (new StringBuilder()));
		//    3    5:new             #29  <Class StringBuilder>
		//    4    8:dup             
		//    5    9:invokespecial   #30  <Method void StringBuilder()>
		//    6   12:astore_1        
			((StringBuilder) (network)).append(((Object) (RequirementsWatcher.this)));
		//    7   13:aload_1         
		//    8   14:aload_0         
		//    9   15:getfield        #16  <Field RequirementsWatcher this$0>
		//   10   18:invokevirtual   #34  <Method StringBuilder StringBuilder.append(Object)>
		//   11   21:pop             
			((StringBuilder) (network)).append(" NetworkCallback.onAvailable");
		//   12   22:aload_1         
		//   13   23:ldc1            #36  <String " NetworkCallback.onAvailable">
		//   14   25:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//   15   28:pop             
			RequirementsWatcher.logd(((StringBuilder) (network)).toString());
		//   16   29:aload_1         
		//   17   30:invokevirtual   #43  <Method String StringBuilder.toString()>
		//   18   33:invokestatic    #47  <Method void RequirementsWatcher.access$200(String)>
			checkRequirements(false);
		//   19   36:aload_0         
		//   20   37:getfield        #16  <Field RequirementsWatcher this$0>
		//   21   40:iconst_0        
		//   22   41:invokestatic    #51  <Method void RequirementsWatcher.access$300(RequirementsWatcher, boolean)>
		//   23   44:return          
		}

		public void onLost(Network network)
		{
			super.onLost(network);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #54  <Method void android.net.ConnectivityManager$NetworkCallback.onLost(Network)>
			network = ((Network) (new StringBuilder()));
		//    3    5:new             #29  <Class StringBuilder>
		//    4    8:dup             
		//    5    9:invokespecial   #30  <Method void StringBuilder()>
		//    6   12:astore_1        
			((StringBuilder) (network)).append(((Object) (RequirementsWatcher.this)));
		//    7   13:aload_1         
		//    8   14:aload_0         
		//    9   15:getfield        #16  <Field RequirementsWatcher this$0>
		//   10   18:invokevirtual   #34  <Method StringBuilder StringBuilder.append(Object)>
		//   11   21:pop             
			((StringBuilder) (network)).append(" NetworkCallback.onLost");
		//   12   22:aload_1         
		//   13   23:ldc1            #56  <String " NetworkCallback.onLost">
		//   14   25:invokevirtual   #39  <Method StringBuilder StringBuilder.append(String)>
		//   15   28:pop             
			RequirementsWatcher.logd(((StringBuilder) (network)).toString());
		//   16   29:aload_1         
		//   17   30:invokevirtual   #43  <Method String StringBuilder.toString()>
		//   18   33:invokestatic    #47  <Method void RequirementsWatcher.access$200(String)>
			checkRequirements(false);
		//   19   36:aload_0         
		//   20   37:getfield        #16  <Field RequirementsWatcher this$0>
		//   21   40:iconst_0        
		//   22   41:invokestatic    #51  <Method void RequirementsWatcher.access$300(RequirementsWatcher, boolean)>
		//   23   44:return          
		}

		final RequirementsWatcher this$0;

		private CapabilityValidatedCallback()
		{
			this$0 = RequirementsWatcher.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field RequirementsWatcher this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void android.net.ConnectivityManager$NetworkCallback()>
		//    5    9:return          
		}

	}

	private class DeviceStatusChangeReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context1, Intent intent)
		{
			if(!isInitialStickyBroadcast())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #26  <Method boolean isInitialStickyBroadcast()>
		//*   2    4:ifne            55
			{
				context1 = ((Context) (new StringBuilder()));
		//    3    7:new             #28  <Class StringBuilder>
		//    4   10:dup             
		//    5   11:invokespecial   #29  <Method void StringBuilder()>
		//    6   14:astore_1        
				((StringBuilder) (context1)).append(((Object) (RequirementsWatcher.this)));
		//    7   15:aload_1         
		//    8   16:aload_0         
		//    9   17:getfield        #13  <Field RequirementsWatcher this$0>
		//   10   20:invokevirtual   #33  <Method StringBuilder StringBuilder.append(Object)>
		//   11   23:pop             
				((StringBuilder) (context1)).append(" received ");
		//   12   24:aload_1         
		//   13   25:ldc1            #35  <String " received ">
		//   14   27:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   15   30:pop             
				((StringBuilder) (context1)).append(intent.getAction());
		//   16   31:aload_1         
		//   17   32:aload_2         
		//   18   33:invokevirtual   #44  <Method String Intent.getAction()>
		//   19   36:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   20   39:pop             
				RequirementsWatcher.logd(((StringBuilder) (context1)).toString());
		//   21   40:aload_1         
		//   22   41:invokevirtual   #47  <Method String StringBuilder.toString()>
		//   23   44:invokestatic    #51  <Method void RequirementsWatcher.access$200(String)>
				checkRequirements(false);
		//   24   47:aload_0         
		//   25   48:getfield        #13  <Field RequirementsWatcher this$0>
		//   26   51:iconst_0        
		//   27   52:invokestatic    #55  <Method void RequirementsWatcher.access$300(RequirementsWatcher, boolean)>
			}
		//   28   55:return          
		}

		final RequirementsWatcher this$0;

		private DeviceStatusChangeReceiver()
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

	}

	public static interface Listener
	{

		public abstract void requirementsMet(RequirementsWatcher requirementswatcher);

		public abstract void requirementsNotMet(RequirementsWatcher requirementswatcher);
	}


	public RequirementsWatcher(Context context1, Listener listener1, Requirements requirements1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		requirements = requirements1;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #38  <Field Requirements requirements>
		listener = listener1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field RequirementsWatcher$Listener listener>
		context = context1.getApplicationContext();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #46  <Method Context Context.getApplicationContext()>
	//   11   19:putfield        #48  <Field Context context>
		context1 = ((Context) (new StringBuilder()));
	//   12   22:new             #50  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #51  <Method void StringBuilder()>
	//   15   29:astore_1        
		((StringBuilder) (context1)).append(((Object) (this)));
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   19   35:pop             
		((StringBuilder) (context1)).append(" created");
	//   20   36:aload_1         
	//   21   37:ldc1            #57  <String " created">
	//   22   39:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
		logd(((StringBuilder) (context1)).toString());
	//   24   43:aload_1         
	//   25   44:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   26   47:invokestatic    #68  <Method void logd(String)>
	//   27   50:return          
	}

	private void checkRequirements(boolean flag)
	{
		boolean flag1 = requirements.checkRequirements(context);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Requirements requirements>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field Context context>
	//    4    8:invokevirtual   #81  <Method boolean Requirements.checkRequirements(Context)>
	//    5   11:istore_2        
		if(!flag && flag1 == requirementsWereMet)
	//*   6   12:iload_1         
	//*   7   13:ifne            53
	//*   8   16:iload_2         
	//*   9   17:aload_0         
	//*  10   18:getfield        #83  <Field boolean requirementsWereMet>
	//*  11   21:icmpne          53
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #50  <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #51  <Method void StringBuilder()>
	//   15   31:astore_3        
			stringbuilder.append("requirementsAreMet is still ");
	//   16   32:aload_3         
	//   17   33:ldc1            #85  <String "requirementsAreMet is still ">
	//   18   35:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(flag1);
	//   20   39:aload_3         
	//   21   40:iload_2         
	//   22   41:invokevirtual   #88  <Method StringBuilder StringBuilder.append(boolean)>
	//   23   44:pop             
			logd(stringbuilder.toString());
	//   24   45:aload_3         
	//   25   46:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   26   49:invokestatic    #68  <Method void logd(String)>
			return;
	//   27   52:return          
		}
		requirementsWereMet = flag1;
	//   28   53:aload_0         
	//   29   54:iload_2         
	//   30   55:putfield        #83  <Field boolean requirementsWereMet>
		if(flag1)
	//*  31   58:iload_2         
	//*  32   59:ifeq            78
		{
			logd("start job");
	//   33   62:ldc1            #90  <String "start job">
	//   34   64:invokestatic    #68  <Method void logd(String)>
			listener.requirementsMet(this);
	//   35   67:aload_0         
	//   36   68:getfield        #40  <Field RequirementsWatcher$Listener listener>
	//   37   71:aload_0         
	//   38   72:invokeinterface #94  <Method void RequirementsWatcher$Listener.requirementsMet(RequirementsWatcher)>
			return;
	//   39   77:return          
		} else
		{
			logd("stop job");
	//   40   78:ldc1            #96  <String "stop job">
	//   41   80:invokestatic    #68  <Method void logd(String)>
			listener.requirementsNotMet(this);
	//   42   83:aload_0         
	//   43   84:getfield        #40  <Field RequirementsWatcher$Listener listener>
	//   44   87:aload_0         
	//   45   88:invokeinterface #99  <Method void RequirementsWatcher$Listener.requirementsNotMet(RequirementsWatcher)>
			return;
	//   46   93:return          
		}
	}

	private static void logd(String s)
	{
	//    0    0:return          
	}

	private void registerNetworkCallbackV23()
	{
		ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Context context>
	//    2    4:ldc1            #105 <String "connectivity">
	//    3    6:invokevirtual   #109 <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #111 <Class ConnectivityManager>
	//    5   12:astore_1        
		android.net.NetworkRequest networkrequest = (new android.net.NetworkRequest.Builder()).addCapability(16).build();
	//    6   13:new             #113 <Class android.net.NetworkRequest$Builder>
	//    7   16:dup             
	//    8   17:invokespecial   #114 <Method void android.net.NetworkRequest$Builder()>
	//    9   20:bipush          16
	//   10   22:invokevirtual   #118 <Method android.net.NetworkRequest$Builder android.net.NetworkRequest$Builder.addCapability(int)>
	//   11   25:invokevirtual   #122 <Method android.net.NetworkRequest android.net.NetworkRequest$Builder.build()>
	//   12   28:astore_2        
		networkCallback = new CapabilityValidatedCallback();
	//   13   29:aload_0         
	//   14   30:new             #8   <Class RequirementsWatcher$CapabilityValidatedCallback>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:invokespecial   #125 <Method void RequirementsWatcher$CapabilityValidatedCallback(RequirementsWatcher, RequirementsWatcher$1)>
	//   19   39:putfield        #127 <Field RequirementsWatcher$CapabilityValidatedCallback networkCallback>
		connectivitymanager.registerNetworkCallback(networkrequest, ((android.net.ConnectivityManager.NetworkCallback) (networkCallback)));
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #127 <Field RequirementsWatcher$CapabilityValidatedCallback networkCallback>
	//   24   48:invokevirtual   #131 <Method void ConnectivityManager.registerNetworkCallback(android.net.NetworkRequest, android.net.ConnectivityManager$NetworkCallback)>
	//   25   51:return          
	}

	private void unregisterNetworkCallback()
	{
		if(Util.SDK_INT >= 21)
	//*   0    0:getstatic       #139 <Field int Util.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          32
		{
			((ConnectivityManager)context.getSystemService("connectivity")).unregisterNetworkCallback(((android.net.ConnectivityManager.NetworkCallback) (networkCallback)));
	//    3    8:aload_0         
	//    4    9:getfield        #48  <Field Context context>
	//    5   12:ldc1            #105 <String "connectivity">
	//    6   14:invokevirtual   #109 <Method Object Context.getSystemService(String)>
	//    7   17:checkcast       #111 <Class ConnectivityManager>
	//    8   20:aload_0         
	//    9   21:getfield        #127 <Field RequirementsWatcher$CapabilityValidatedCallback networkCallback>
	//   10   24:invokevirtual   #142 <Method void ConnectivityManager.unregisterNetworkCallback(android.net.ConnectivityManager$NetworkCallback)>
			networkCallback = null;
	//   11   27:aload_0         
	//   12   28:aconst_null     
	//   13   29:putfield        #127 <Field RequirementsWatcher$CapabilityValidatedCallback networkCallback>
		}
	//   14   32:return          
	}

	public Requirements getRequirements()
	{
		return requirements;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Requirements requirements>
	//    2    4:areturn         
	}

	public void start()
	{
		Assertions.checkNotNull(((Object) (Looper.myLooper())));
	//    0    0:invokestatic    #151 <Method Looper Looper.myLooper()>
	//    1    3:invokestatic    #157 <Method Object Assertions.checkNotNull(Object)>
	//    2    6:pop             
		checkRequirements(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokespecial   #76  <Method void checkRequirements(boolean)>
		Object obj = ((Object) (new IntentFilter()));
	//    6   12:new             #159 <Class IntentFilter>
	//    7   15:dup             
	//    8   16:invokespecial   #160 <Method void IntentFilter()>
	//    9   19:astore_1        
		if(requirements.getRequiredNetworkType() != 0)
	//*  10   20:aload_0         
	//*  11   21:getfield        #38  <Field Requirements requirements>
	//*  12   24:invokevirtual   #164 <Method int Requirements.getRequiredNetworkType()>
	//*  13   27:ifeq            51
			if(Util.SDK_INT >= 23)
	//*  14   30:getstatic       #139 <Field int Util.SDK_INT>
	//*  15   33:bipush          23
	//*  16   35:icmplt          45
				registerNetworkCallbackV23();
	//   17   38:aload_0         
	//   18   39:invokespecial   #166 <Method void registerNetworkCallbackV23()>
			else
	//*  19   42:goto            51
				((IntentFilter) (obj)).addAction("android.net.conn.CONNECTIVITY_CHANGE");
	//   20   45:aload_1         
	//   21   46:ldc1            #168 <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   22   48:invokevirtual   #171 <Method void IntentFilter.addAction(String)>
		if(requirements.isChargingRequired())
	//*  23   51:aload_0         
	//*  24   52:getfield        #38  <Field Requirements requirements>
	//*  25   55:invokevirtual   #175 <Method boolean Requirements.isChargingRequired()>
	//*  26   58:ifeq            73
		{
			((IntentFilter) (obj)).addAction("android.intent.action.ACTION_POWER_CONNECTED");
	//   27   61:aload_1         
	//   28   62:ldc1            #177 <String "android.intent.action.ACTION_POWER_CONNECTED">
	//   29   64:invokevirtual   #171 <Method void IntentFilter.addAction(String)>
			((IntentFilter) (obj)).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
	//   30   67:aload_1         
	//   31   68:ldc1            #179 <String "android.intent.action.ACTION_POWER_DISCONNECTED">
	//   32   70:invokevirtual   #171 <Method void IntentFilter.addAction(String)>
		}
		if(requirements.isIdleRequired())
	//*  33   73:aload_0         
	//*  34   74:getfield        #38  <Field Requirements requirements>
	//*  35   77:invokevirtual   #182 <Method boolean Requirements.isIdleRequired()>
	//*  36   80:ifeq            112
			if(Util.SDK_INT >= 23)
	//*  37   83:getstatic       #139 <Field int Util.SDK_INT>
	//*  38   86:bipush          23
	//*  39   88:icmplt          100
			{
				((IntentFilter) (obj)).addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
	//   40   91:aload_1         
	//   41   92:ldc1            #184 <String "android.os.action.DEVICE_IDLE_MODE_CHANGED">
	//   42   94:invokevirtual   #171 <Method void IntentFilter.addAction(String)>
			} else
	//*  43   97:goto            112
			{
				((IntentFilter) (obj)).addAction("android.intent.action.SCREEN_ON");
	//   44  100:aload_1         
	//   45  101:ldc1            #186 <String "android.intent.action.SCREEN_ON">
	//   46  103:invokevirtual   #171 <Method void IntentFilter.addAction(String)>
				((IntentFilter) (obj)).addAction("android.intent.action.SCREEN_OFF");
	//   47  106:aload_1         
	//   48  107:ldc1            #188 <String "android.intent.action.SCREEN_OFF">
	//   49  109:invokevirtual   #171 <Method void IntentFilter.addAction(String)>
			}
		receiver = new DeviceStatusChangeReceiver();
	//   50  112:aload_0         
	//   51  113:new             #11  <Class RequirementsWatcher$DeviceStatusChangeReceiver>
	//   52  116:dup             
	//   53  117:aload_0         
	//   54  118:aconst_null     
	//   55  119:invokespecial   #189 <Method void RequirementsWatcher$DeviceStatusChangeReceiver(RequirementsWatcher, RequirementsWatcher$1)>
	//   56  122:putfield        #191 <Field RequirementsWatcher$DeviceStatusChangeReceiver receiver>
		context.registerReceiver(((BroadcastReceiver) (receiver)), ((IntentFilter) (obj)), ((String) (null)), new Handler());
	//   57  125:aload_0         
	//   58  126:getfield        #48  <Field Context context>
	//   59  129:aload_0         
	//   60  130:getfield        #191 <Field RequirementsWatcher$DeviceStatusChangeReceiver receiver>
	//   61  133:aload_1         
	//   62  134:aconst_null     
	//   63  135:new             #193 <Class Handler>
	//   64  138:dup             
	//   65  139:invokespecial   #194 <Method void Handler()>
	//   66  142:invokevirtual   #198 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)>
	//   67  145:pop             
		obj = ((Object) (new StringBuilder()));
	//   68  146:new             #50  <Class StringBuilder>
	//   69  149:dup             
	//   70  150:invokespecial   #51  <Method void StringBuilder()>
	//   71  153:astore_1        
		((StringBuilder) (obj)).append(((Object) (this)));
	//   72  154:aload_1         
	//   73  155:aload_0         
	//   74  156:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   75  159:pop             
		((StringBuilder) (obj)).append(" started");
	//   76  160:aload_1         
	//   77  161:ldc1            #200 <String " started">
	//   78  163:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   79  166:pop             
		logd(((StringBuilder) (obj)).toString());
	//   80  167:aload_1         
	//   81  168:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   82  171:invokestatic    #68  <Method void logd(String)>
	//   83  174:return          
	}

	public void stop()
	{
		context.unregisterReceiver(((BroadcastReceiver) (receiver)));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Context context>
	//    2    4:aload_0         
	//    3    5:getfield        #191 <Field RequirementsWatcher$DeviceStatusChangeReceiver receiver>
	//    4    8:invokevirtual   #205 <Method void Context.unregisterReceiver(BroadcastReceiver)>
		receiver = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #191 <Field RequirementsWatcher$DeviceStatusChangeReceiver receiver>
		if(networkCallback != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #127 <Field RequirementsWatcher$CapabilityValidatedCallback networkCallback>
	//*  10   20:ifnull          27
			unregisterNetworkCallback();
	//   11   23:aload_0         
	//   12   24:invokespecial   #207 <Method void unregisterNetworkCallback()>
		StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #50  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #51  <Method void StringBuilder()>
	//   16   34:astore_1        
		stringbuilder.append(((Object) (this)));
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   20   40:pop             
		stringbuilder.append(" stopped");
	//   21   41:aload_1         
	//   22   42:ldc1            #209 <String " stopped">
	//   23   44:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
		logd(stringbuilder.toString());
	//   25   48:aload_1         
	//   26   49:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   27   52:invokestatic    #68  <Method void logd(String)>
	//   28   55:return          
	}

	public String toString()
	{
		return super.toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #210 <Method String Object.toString()>
	//    2    4:areturn         
	}

	private static final String TAG = "RequirementsWatcher";
	private final Context context;
	private final Listener listener;
	private CapabilityValidatedCallback networkCallback;
	private DeviceStatusChangeReceiver receiver;
	private final Requirements requirements;
	private boolean requirementsWereMet;


/*
	static void access$200(String s)
	{
		logd(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #68  <Method void logd(String)>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$300(RequirementsWatcher requirementswatcher, boolean flag)
	{
		requirementswatcher.checkRequirements(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #76  <Method void checkRequirements(boolean)>
		return;
	//    3    5:return          
	}

*/
}
