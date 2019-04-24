// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.scheduler;

import android.content.*;
import android.net.*;
import android.os.PowerManager;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Annotation;

public final class Requirements
{
	public static interface NetworkType
		extends Annotation
	{
	}


	public Requirements(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		requirements = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #40  <Field int requirements>
	//    5    9:return          
	}

	public Requirements(int i, boolean flag, boolean flag1)
	{
		byte byte1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		byte byte0;
		if(flag)
	//*   2    3:iload_2         
	//*   3    4:ifeq            14
			byte0 = 16;
	//    4    7:bipush          16
	//    5    9:istore          4
		else
	//*   6   11:goto            17
			byte0 = 0;
	//    7   14:iconst_0        
	//    8   15:istore          4
		if(flag1)
	//*   9   17:iload_3         
	//*  10   18:ifeq            25
			byte1 = 8;
	//   11   21:bipush          8
	//   12   23:istore          5
		this(i | byte0 | byte1);
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:iload           4
	//   16   29:ior             
	//   17   30:iload           5
	//   18   32:ior             
	//   19   33:invokespecial   #43  <Method void Requirements(int)>
	//   20   36:return          
	}

	private boolean checkChargingRequirement(Context context)
	{
		if(!isChargingRequired())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #49  <Method boolean isChargingRequired()>
	//*   2    4:ifne            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		context = ((Context) (context.registerReceiver(((android.content.BroadcastReceiver) (null)), new IntentFilter("android.intent.action.BATTERY_CHANGED"))));
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:new             #51  <Class IntentFilter>
	//    8   14:dup             
	//    9   15:ldc1            #53  <String "android.intent.action.BATTERY_CHANGED">
	//   10   17:invokespecial   #56  <Method void IntentFilter(String)>
	//   11   20:invokevirtual   #62  <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   12   23:astore_1        
		boolean flag = false;
	//   13   24:iconst_0        
	//   14   25:istore_3        
		if(context == null)
	//*  15   26:aload_1         
	//*  16   27:ifnonnull       32
			return false;
	//   17   30:iconst_0        
	//   18   31:ireturn         
		int i = ((Intent) (context)).getIntExtra("status", -1);
	//   19   32:aload_1         
	//   20   33:ldc1            #64  <String "status">
	//   21   35:iconst_m1       
	//   22   36:invokevirtual   #70  <Method int Intent.getIntExtra(String, int)>
	//   23   39:istore_2        
		if(i == 2 || i == 5)
	//*  24   40:iload_2         
	//*  25   41:iconst_2        
	//*  26   42:icmpeq          50
	//*  27   45:iload_2         
	//*  28   46:iconst_5        
	//*  29   47:icmpne          52
			flag = true;
	//   30   50:iconst_1        
	//   31   51:istore_3        
		return flag;
	//   32   52:iload_3         
	//   33   53:ireturn         
	}

	private boolean checkIdleRequirement(Context context)
	{
		if(!isIdleRequired())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #74  <Method boolean isIdleRequired()>
	//*   2    4:ifne            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		context = ((Context) ((PowerManager)context.getSystemService("power")));
	//    5    9:aload_1         
	//    6   10:ldc1            #76  <String "power">
	//    7   12:invokevirtual   #80  <Method Object Context.getSystemService(String)>
	//    8   15:checkcast       #82  <Class PowerManager>
	//    9   18:astore_1        
		if(Util.SDK_INT < 23) goto _L2; else goto _L1
	//   10   19:getstatic       #87  <Field int Util.SDK_INT>
	//   11   22:bipush          23
	//   12   24:icmplt          38
_L1:
		if(!((PowerManager) (context)).isDeviceIdleMode())
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #90  <Method boolean PowerManager.isDeviceIdleMode()>
	//*  15   31:ifne            36
			return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
_L4:
		return false;
	//   18   36:iconst_0        
	//   19   37:ireturn         
_L2:
		if(Util.SDK_INT < 20)
			continue; /* Loop/switch isn't completed */
	//   20   38:getstatic       #87  <Field int Util.SDK_INT>
	//   21   41:bipush          20
	//   22   43:icmplt          55
		if(((PowerManager) (context)).isInteractive()) goto _L4; else goto _L3
	//   23   46:aload_1         
	//   24   47:invokevirtual   #93  <Method boolean PowerManager.isInteractive()>
	//   25   50:ifne            36
_L3:
		return true;
	//   26   53:iconst_1        
	//   27   54:ireturn         
		if(((PowerManager) (context)).isScreenOn()) goto _L4; else goto _L5
	//   28   55:aload_1         
	//   29   56:invokevirtual   #96  <Method boolean PowerManager.isScreenOn()>
	//   30   59:ifne            36
_L5:
		return true;
	//   31   62:iconst_1        
	//   32   63:ireturn         
	}

	private static boolean checkInternetConnectivity(ConnectivityManager connectivitymanager)
	{
		if(Util.SDK_INT < 23)
	//*   0    0:getstatic       #87  <Field int Util.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpge          10
			return true;
	//    3    8:iconst_1        
	//    4    9:ireturn         
		android.net.Network network = connectivitymanager.getActiveNetwork();
	//    5   10:aload_0         
	//    6   11:invokevirtual   #104 <Method android.net.Network ConnectivityManager.getActiveNetwork()>
	//    7   14:astore_2        
		boolean flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_1        
		if(network == null)
	//*  10   17:aload_2         
	//*  11   18:ifnonnull       28
		{
			logd("No active network.");
	//   12   21:ldc1            #106 <String "No active network.">
	//   13   23:invokestatic    #109 <Method void logd(String)>
			return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
		}
		connectivitymanager = ((ConnectivityManager) (connectivitymanager.getNetworkCapabilities(network)));
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:invokevirtual   #113 <Method NetworkCapabilities ConnectivityManager.getNetworkCapabilities(android.net.Network)>
	//   19   33:astore_0        
		if(connectivitymanager == null || !((NetworkCapabilities) (connectivitymanager)).hasCapability(16))
	//*  20   34:aload_0         
	//*  21   35:ifnull          47
	//*  22   38:aload_0         
	//*  23   39:bipush          16
	//*  24   41:invokevirtual   #119 <Method boolean NetworkCapabilities.hasCapability(int)>
	//*  25   44:ifne            49
			flag = true;
	//   26   47:iconst_1        
	//   27   48:istore_1        
		connectivitymanager = ((ConnectivityManager) (new StringBuilder()));
	//   28   49:new             #121 <Class StringBuilder>
	//   29   52:dup             
	//   30   53:invokespecial   #122 <Method void StringBuilder()>
	//   31   56:astore_0        
		((StringBuilder) (connectivitymanager)).append("Network capability validated: ");
	//   32   57:aload_0         
	//   33   58:ldc1            #124 <String "Network capability validated: ">
	//   34   60:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
		((StringBuilder) (connectivitymanager)).append(flag);
	//   36   64:aload_0         
	//   37   65:iload_1         
	//   38   66:invokevirtual   #131 <Method StringBuilder StringBuilder.append(boolean)>
	//   39   69:pop             
		logd(((StringBuilder) (connectivitymanager)).toString());
	//   40   70:aload_0         
	//   41   71:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   42   74:invokestatic    #109 <Method void logd(String)>
		return flag ^ true;
	//   43   77:iload_1         
	//   44   78:iconst_1        
	//   45   79:ixor            
	//   46   80:ireturn         
	}

	private boolean checkNetworkRequirements(Context context)
	{
		int i = getRequiredNetworkType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method int getRequiredNetworkType()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		context = ((Context) ((ConnectivityManager)context.getSystemService("connectivity")));
	//    7   11:aload_1         
	//    8   12:ldc1            #142 <String "connectivity">
	//    9   14:invokevirtual   #80  <Method Object Context.getSystemService(String)>
	//   10   17:checkcast       #100 <Class ConnectivityManager>
	//   11   20:astore_1        
		NetworkInfo networkinfo = ((ConnectivityManager) (context)).getActiveNetworkInfo();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #146 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//   14   25:astore          4
		if(networkinfo != null && networkinfo.isConnected())
	//*  15   27:aload           4
	//*  16   29:ifnull          161
	//*  17   32:aload           4
	//*  18   34:invokevirtual   #151 <Method boolean NetworkInfo.isConnected()>
	//*  19   37:ifne            43
	//*  20   40:goto            161
		{
			if(!checkInternetConnectivity(((ConnectivityManager) (context))))
	//*  21   43:aload_1         
	//*  22   44:invokestatic    #153 <Method boolean checkInternetConnectivity(ConnectivityManager)>
	//*  23   47:ifne            52
				return false;
	//   24   50:iconst_0        
	//   25   51:ireturn         
			if(i == 1)
	//*  26   52:iload_2         
	//*  27   53:iconst_1        
	//*  28   54:icmpne          59
				return true;
	//   29   57:iconst_1        
	//   30   58:ireturn         
			if(i == 3)
	//*  31   59:iload_2         
	//*  32   60:iconst_3        
	//*  33   61:icmpne          102
			{
				boolean flag = networkinfo.isRoaming();
	//   34   64:aload           4
	//   35   66:invokevirtual   #156 <Method boolean NetworkInfo.isRoaming()>
	//   36   69:istore_3        
				context = ((Context) (new StringBuilder()));
	//   37   70:new             #121 <Class StringBuilder>
	//   38   73:dup             
	//   39   74:invokespecial   #122 <Method void StringBuilder()>
	//   40   77:astore_1        
				((StringBuilder) (context)).append("Roaming: ");
	//   41   78:aload_1         
	//   42   79:ldc1            #158 <String "Roaming: ">
	//   43   81:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
				((StringBuilder) (context)).append(flag);
	//   45   85:aload_1         
	//   46   86:iload_3         
	//   47   87:invokevirtual   #131 <Method StringBuilder StringBuilder.append(boolean)>
	//   48   90:pop             
				logd(((StringBuilder) (context)).toString());
	//   49   91:aload_1         
	//   50   92:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   51   95:invokestatic    #109 <Method void logd(String)>
				return flag ^ true;
	//   52   98:iload_3         
	//   53   99:iconst_1        
	//   54  100:ixor            
	//   55  101:ireturn         
			}
			boolean flag1 = isActiveNetworkMetered(((ConnectivityManager) (context)), networkinfo);
	//   56  102:aload_1         
	//   57  103:aload           4
	//   58  105:invokestatic    #162 <Method boolean isActiveNetworkMetered(ConnectivityManager, NetworkInfo)>
	//   59  108:istore_3        
			context = ((Context) (new StringBuilder()));
	//   60  109:new             #121 <Class StringBuilder>
	//   61  112:dup             
	//   62  113:invokespecial   #122 <Method void StringBuilder()>
	//   63  116:astore_1        
			((StringBuilder) (context)).append("Metered network: ");
	//   64  117:aload_1         
	//   65  118:ldc1            #164 <String "Metered network: ">
	//   66  120:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   67  123:pop             
			((StringBuilder) (context)).append(flag1);
	//   68  124:aload_1         
	//   69  125:iload_3         
	//   70  126:invokevirtual   #131 <Method StringBuilder StringBuilder.append(boolean)>
	//   71  129:pop             
			logd(((StringBuilder) (context)).toString());
	//   72  130:aload_1         
	//   73  131:invokevirtual   #135 <Method String StringBuilder.toString()>
	//   74  134:invokestatic    #109 <Method void logd(String)>
			if(i == 2)
	//*  75  137:iload_2         
	//*  76  138:iconst_2        
	//*  77  139:icmpne          146
				return flag1 ^ true;
	//   78  142:iload_3         
	//   79  143:iconst_1        
	//   80  144:ixor            
	//   81  145:ireturn         
			if(i == 4)
	//*  82  146:iload_2         
	//*  83  147:iconst_4        
	//*  84  148:icmpne          153
				return flag1;
	//   85  151:iload_3         
	//   86  152:ireturn         
			else
				throw new IllegalStateException();
	//   87  153:new             #166 <Class IllegalStateException>
	//   88  156:dup             
	//   89  157:invokespecial   #167 <Method void IllegalStateException()>
	//   90  160:athrow          
		} else
		{
			logd("No network info or no connection.");
	//   91  161:ldc1            #169 <String "No network info or no connection.">
	//   92  163:invokestatic    #109 <Method void logd(String)>
			return false;
	//   93  166:iconst_0        
	//   94  167:ireturn         
		}
	}

	private static boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager, NetworkInfo networkinfo)
	{
		if(Util.SDK_INT >= 16)
	//*   0    0:getstatic       #87  <Field int Util.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			return connectivitymanager.isActiveNetworkMetered();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #171 <Method boolean ConnectivityManager.isActiveNetworkMetered()>
	//    5   12:ireturn         
		int i = networkinfo.getType();
	//    6   13:aload_1         
	//    7   14:invokevirtual   #174 <Method int NetworkInfo.getType()>
	//    8   17:istore_2        
		return i != 1 && i != 7 && i != 9;
	//    9   18:iload_2         
	//   10   19:iconst_1        
	//   11   20:icmpeq          37
	//   12   23:iload_2         
	//   13   24:bipush          7
	//   14   26:icmpeq          37
	//   15   29:iload_2         
	//   16   30:bipush          9
	//   17   32:icmpeq          37
	//   18   35:iconst_1        
	//   19   36:ireturn         
	//   20   37:iconst_0        
	//   21   38:ireturn         
	}

	private static void logd(String s)
	{
	//    0    0:return          
	}

	public boolean checkRequirements(Context context)
	{
		return checkNetworkRequirements(context) && checkChargingRequirement(context) && checkIdleRequirement(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #177 <Method boolean checkNetworkRequirements(Context)>
	//    3    5:ifeq            26
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #179 <Method boolean checkChargingRequirement(Context)>
	//    7   13:ifeq            26
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #181 <Method boolean checkIdleRequirement(Context)>
	//   11   21:ifeq            26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public int getRequiredNetworkType()
	{
		return requirements & 7;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int requirements>
	//    2    4:bipush          7
	//    3    6:iand            
	//    4    7:ireturn         
	}

	public int getRequirementsData()
	{
		return requirements;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int requirements>
	//    2    4:ireturn         
	}

	public boolean isChargingRequired()
	{
		return (requirements & 0x10) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int requirements>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public boolean isIdleRequired()
	{
		return (requirements & 8) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int requirements>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public String toString()
	{
		return super.toString();
	//    0    0:aload_0         
	//    1    1:invokespecial   #183 <Method String Object.toString()>
	//    2    4:areturn         
	}

	private static final int DEVICE_CHARGING = 16;
	private static final int DEVICE_IDLE = 8;
	public static final int NETWORK_TYPE_ANY = 1;
	private static final int NETWORK_TYPE_MASK = 7;
	public static final int NETWORK_TYPE_METERED = 4;
	public static final int NETWORK_TYPE_NONE = 0;
	public static final int NETWORK_TYPE_NOT_ROAMING = 3;
	private static final String NETWORK_TYPE_STRINGS[];
	public static final int NETWORK_TYPE_UNMETERED = 2;
	private static final String TAG = "Requirements";
	private final int requirements;

	static 
	{
	//    0    0:return          
	}
}
