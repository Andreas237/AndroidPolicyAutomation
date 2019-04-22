// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.content.*;
import androidx.work.Logger;

// Referenced classes of package androidx.work.impl.constraints.trackers:
//			BroadcastReceiverConstraintTracker

public class BatteryChargingTracker extends BroadcastReceiverConstraintTracker
{

	public BatteryChargingTracker(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void BroadcastReceiverConstraintTracker(Context)>
	//    3    5:return          
	}

	private boolean isBatteryChangedIntentCharging(Intent intent)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		boolean flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_3        
		if(i >= 23)
	//*   4    6:iload_2         
	//*   5    7:bipush          23
	//*   6    9:icmplt          34
		{
			int j = intent.getIntExtra("status", -1);
	//    7   12:aload_1         
	//    8   13:ldc1            #24  <String "status">
	//    9   15:iconst_m1       
	//   10   16:invokevirtual   #30  <Method int Intent.getIntExtra(String, int)>
	//   11   19:istore_2        
			if(j != 2)
	//*  12   20:iload_2         
	//*  13   21:iconst_2        
	//*  14   22:icmpeq          48
				return j == 5;
	//   15   25:iload_2         
	//   16   26:iconst_5        
	//   17   27:icmpne          32
	//   18   30:iconst_1        
	//   19   31:ireturn         
	//   20   32:iconst_0        
	//   21   33:ireturn         
		} else
		{
			if(intent.getIntExtra("plugged", 0) != 0)
	//*  22   34:aload_1         
	//*  23   35:ldc1            #32  <String "plugged">
	//*  24   37:iconst_0        
	//*  25   38:invokevirtual   #30  <Method int Intent.getIntExtra(String, int)>
	//*  26   41:ifeq            46
				return true;
	//   27   44:iconst_1        
	//   28   45:ireturn         
			flag = false;
	//   29   46:iconst_0        
	//   30   47:istore_3        
		}
		return flag;
	//   31   48:iload_3         
	//   32   49:ireturn         
	}

	public Boolean getInitialState()
	{
		Object obj = ((Object) (new IntentFilter("android.intent.action.BATTERY_CHANGED")));
	//    0    0:new             #36  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #38  <String "android.intent.action.BATTERY_CHANGED">
	//    3    6:invokespecial   #41  <Method void IntentFilter(String)>
	//    4    9:astore_1        
		obj = ((Object) (mAppContext.registerReceiver(((android.content.BroadcastReceiver) (null)), ((IntentFilter) (obj)))));
	//    5   10:aload_0         
	//    6   11:getfield        #45  <Field Context mAppContext>
	//    7   14:aconst_null     
	//    8   15:aload_1         
	//    9   16:invokevirtual   #51  <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   10   19:astore_1        
		if(obj == null)
	//*  11   20:aload_1         
	//*  12   21:ifnonnull       37
		{
			Logger.error("BatteryChrgTracker", "getInitialState - null intent received", new Throwable[0]);
	//   13   24:ldc1            #53  <String "BatteryChrgTracker">
	//   14   26:ldc1            #55  <String "getInitialState - null intent received">
	//   15   28:iconst_0        
	//   16   29:anewarray       Throwable[]
	//   17   32:invokestatic    #63  <Method void Logger.error(String, String, Throwable[])>
			return null;
	//   18   35:aconst_null     
	//   19   36:areturn         
		} else
		{
			return Boolean.valueOf(isBatteryChangedIntentCharging(((Intent) (obj))));
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:invokespecial   #65  <Method boolean isBatteryChangedIntentCharging(Intent)>
	//   23   42:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   24   45:areturn         
		}
	}

	public volatile Object getInitialState()
	{
		return ((Object) (getInitialState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #74  <Method Boolean getInitialState()>
	//    2    4:areturn         
	}

	public IntentFilter getIntentFilter()
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #36  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void IntentFilter()>
	//    3    7:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   4    8:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          30
		{
			intentfilter.addAction("android.os.action.CHARGING");
	//    7   16:aload_1         
	//    8   17:ldc1            #81  <String "android.os.action.CHARGING">
	//    9   19:invokevirtual   #84  <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.os.action.DISCHARGING");
	//   10   22:aload_1         
	//   11   23:ldc1            #86  <String "android.os.action.DISCHARGING">
	//   12   25:invokevirtual   #84  <Method void IntentFilter.addAction(String)>
			return intentfilter;
	//   13   28:aload_1         
	//   14   29:areturn         
		} else
		{
			intentfilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
	//   15   30:aload_1         
	//   16   31:ldc1            #88  <String "android.intent.action.ACTION_POWER_CONNECTED">
	//   17   33:invokevirtual   #84  <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
	//   18   36:aload_1         
	//   19   37:ldc1            #90  <String "android.intent.action.ACTION_POWER_DISCONNECTED">
	//   20   39:invokevirtual   #84  <Method void IntentFilter.addAction(String)>
			return intentfilter;
	//   21   42:aload_1         
	//   22   43:areturn         
		}
	}

	public void onBroadcastReceive(Context context, Intent intent)
	{
		int i;
label0:
		{
			context = ((Context) (intent.getAction()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #97  <Method String Intent.getAction()>
	//    2    4:astore_1        
			if(context == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
				return;
	//    5    9:return          
			Logger.debug("BatteryChrgTracker", String.format("Received %s", new Object[] {
				context
			}), new Throwable[0]);
	//    6   10:ldc1            #53  <String "BatteryChrgTracker">
	//    7   12:ldc1            #99  <String "Received %s">
	//    8   14:iconst_1        
	//    9   15:anewarray       Object[]
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:aload_1         
	//   13   21:aastore         
	//   14   22:invokestatic    #107 <Method String String.format(String, Object[])>
	//   15   25:iconst_0        
	//   16   26:anewarray       Throwable[]
	//   17   29:invokestatic    #110 <Method void Logger.debug(String, String, Throwable[])>
			i = ((String) (context)).hashCode();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #114 <Method int String.hashCode()>
	//   20   36:istore_3        
			if(i != 0x8f8c06d9)
	//*  21   37:iload_3         
	//*  22   38:ldc1            #115 <Int 0x8f8c06d9>
	//*  23   40:icmpeq          106
			{
				if(i != 0xfcb9a332)
	//*  24   43:iload_3         
	//*  25   44:ldc1            #116 <Int 0xfcb9a332>
	//*  26   46:icmpeq          92
				{
					if(i != 0x388694fe)
	//*  27   49:iload_3         
	//*  28   50:ldc1            #117 <Int 0x388694fe>
	//*  29   52:icmpeq          78
					{
						if(i == 0x3cbf870b && ((String) (context)).equals("android.intent.action.ACTION_POWER_CONNECTED"))
	//*  30   55:iload_3         
	//*  31   56:ldc1            #118 <Int 0x3cbf870b>
	//*  32   58:icmpeq          64
	//*  33   61:goto            120
	//*  34   64:aload_1         
	//*  35   65:ldc1            #88  <String "android.intent.action.ACTION_POWER_CONNECTED">
	//*  36   67:invokevirtual   #122 <Method boolean String.equals(Object)>
	//*  37   70:ifeq            120
						{
							i = 2;
	//   38   73:iconst_2        
	//   39   74:istore_3        
							break label0;
	//   40   75:goto            122
						}
					} else
					if(((String) (context)).equals("android.os.action.CHARGING"))
	//*  41   78:aload_1         
	//*  42   79:ldc1            #81  <String "android.os.action.CHARGING">
	//*  43   81:invokevirtual   #122 <Method boolean String.equals(Object)>
	//*  44   84:ifeq            120
					{
						i = 0;
	//   45   87:iconst_0        
	//   46   88:istore_3        
						break label0;
	//   47   89:goto            122
					}
				} else
				if(((String) (context)).equals("android.os.action.DISCHARGING"))
	//*  48   92:aload_1         
	//*  49   93:ldc1            #86  <String "android.os.action.DISCHARGING">
	//*  50   95:invokevirtual   #122 <Method boolean String.equals(Object)>
	//*  51   98:ifeq            120
				{
					i = 1;
	//   52  101:iconst_1        
	//   53  102:istore_3        
					break label0;
	//   54  103:goto            122
				}
			} else
			if(((String) (context)).equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
	//*  55  106:aload_1         
	//*  56  107:ldc1            #90  <String "android.intent.action.ACTION_POWER_DISCONNECTED">
	//*  57  109:invokevirtual   #122 <Method boolean String.equals(Object)>
	//*  58  112:ifeq            120
			{
				i = 3;
	//   59  115:iconst_3        
	//   60  116:istore_3        
				break label0;
	//   61  117:goto            122
			}
			i = -1;
	//   62  120:iconst_m1       
	//   63  121:istore_3        
		}
		switch(i)
	//*  64  122:iload_3         
		{
	//*  65  123:tableswitch     0 3: default 152
	//	               0 180
	//	               1 171
	//	               2 162
	//	               3 153
		default:
			return;
	//   66  152:return          

		case 3: // '\003'
			setState(((Object) (Boolean.valueOf(false))));
	//   67  153:aload_0         
	//   68  154:iconst_0        
	//   69  155:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   70  158:invokevirtual   #126 <Method void setState(Object)>
			return;
	//   71  161:return          

		case 2: // '\002'
			setState(((Object) (Boolean.valueOf(true))));
	//   72  162:aload_0         
	//   73  163:iconst_1        
	//   74  164:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   75  167:invokevirtual   #126 <Method void setState(Object)>
			return;
	//   76  170:return          

		case 1: // '\001'
			setState(((Object) (Boolean.valueOf(false))));
	//   77  171:aload_0         
	//   78  172:iconst_0        
	//   79  173:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   80  176:invokevirtual   #126 <Method void setState(Object)>
			return;
	//   81  179:return          

		case 0: // '\0'
			setState(((Object) (Boolean.valueOf(true))));
	//   82  180:aload_0         
	//   83  181:iconst_1        
	//   84  182:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//   85  185:invokevirtual   #126 <Method void setState(Object)>
			return;
	//   86  188:return          
		}
	}
}
