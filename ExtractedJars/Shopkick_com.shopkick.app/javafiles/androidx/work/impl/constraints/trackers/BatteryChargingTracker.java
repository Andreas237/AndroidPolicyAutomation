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
	//    2    2:invokespecial   #28  <Method void BroadcastReceiverConstraintTracker(Context)>
	//    3    5:return          
	}

	private boolean isBatteryChangedIntentCharging(Intent intent)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
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
	//    8   13:ldc1            #38  <String "status">
	//    9   15:iconst_m1       
	//   10   16:invokevirtual   #44  <Method int Intent.getIntExtra(String, int)>
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
	//*  23   35:ldc1            #46  <String "plugged">
	//*  24   37:iconst_0        
	//*  25   38:invokevirtual   #44  <Method int Intent.getIntExtra(String, int)>
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
	//    0    0:new             #50  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #52  <String "android.intent.action.BATTERY_CHANGED">
	//    3    6:invokespecial   #55  <Method void IntentFilter(String)>
	//    4    9:astore_1        
		obj = ((Object) (mAppContext.registerReceiver(((android.content.BroadcastReceiver) (null)), ((IntentFilter) (obj)))));
	//    5   10:aload_0         
	//    6   11:getfield        #59  <Field Context mAppContext>
	//    7   14:aconst_null     
	//    8   15:aload_1         
	//    9   16:invokevirtual   #65  <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   10   19:astore_1        
		if(obj == null)
	//*  11   20:aload_1         
	//*  12   21:ifnonnull       41
		{
			Logger.get().error(TAG, "getInitialState - null intent received", new Throwable[0]);
	//   13   24:invokestatic    #69  <Method Logger Logger.get()>
	//   14   27:getstatic       #23  <Field String TAG>
	//   15   30:ldc1            #71  <String "getInitialState - null intent received">
	//   16   32:iconst_0        
	//   17   33:anewarray       Throwable[]
	//   18   36:invokevirtual   #77  <Method void Logger.error(String, String, Throwable[])>
			return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
		} else
		{
			return Boolean.valueOf(isBatteryChangedIntentCharging(((Intent) (obj))));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:invokespecial   #79  <Method boolean isBatteryChangedIntentCharging(Intent)>
	//   24   46:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   25   49:areturn         
		}
	}

	public volatile Object getInitialState()
	{
		return ((Object) (getInitialState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method Boolean getInitialState()>
	//    2    4:areturn         
	}

	public IntentFilter getIntentFilter()
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #50  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void IntentFilter()>
	//    3    7:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   4    8:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          23
	//*   6   13:icmplt          30
		{
			intentfilter.addAction("android.os.action.CHARGING");
	//    7   16:aload_1         
	//    8   17:ldc1            #94  <String "android.os.action.CHARGING">
	//    9   19:invokevirtual   #97  <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.os.action.DISCHARGING");
	//   10   22:aload_1         
	//   11   23:ldc1            #99  <String "android.os.action.DISCHARGING">
	//   12   25:invokevirtual   #97  <Method void IntentFilter.addAction(String)>
			return intentfilter;
	//   13   28:aload_1         
	//   14   29:areturn         
		} else
		{
			intentfilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
	//   15   30:aload_1         
	//   16   31:ldc1            #101 <String "android.intent.action.ACTION_POWER_CONNECTED">
	//   17   33:invokevirtual   #97  <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
	//   18   36:aload_1         
	//   19   37:ldc1            #103 <String "android.intent.action.ACTION_POWER_DISCONNECTED">
	//   20   39:invokevirtual   #97  <Method void IntentFilter.addAction(String)>
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
	//    1    1:invokevirtual   #110 <Method String Intent.getAction()>
	//    2    4:astore_1        
			if(context == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
				return;
	//    5    9:return          
			Logger.get().debug(TAG, String.format("Received %s", new Object[] {
				context
			}), new Throwable[0]);
	//    6   10:invokestatic    #69  <Method Logger Logger.get()>
	//    7   13:getstatic       #23  <Field String TAG>
	//    8   16:ldc1            #112 <String "Received %s">
	//    9   18:iconst_1        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_1         
	//   14   25:aastore         
	//   15   26:invokestatic    #120 <Method String String.format(String, Object[])>
	//   16   29:iconst_0        
	//   17   30:anewarray       Throwable[]
	//   18   33:invokevirtual   #123 <Method void Logger.debug(String, String, Throwable[])>
			i = ((String) (context)).hashCode();
	//   19   36:aload_1         
	//   20   37:invokevirtual   #127 <Method int String.hashCode()>
	//   21   40:istore_3        
			if(i != 0x8f8c06d9)
	//*  22   41:iload_3         
	//*  23   42:ldc1            #128 <Int 0x8f8c06d9>
	//*  24   44:icmpeq          110
			{
				if(i != 0xfcb9a332)
	//*  25   47:iload_3         
	//*  26   48:ldc1            #129 <Int 0xfcb9a332>
	//*  27   50:icmpeq          96
				{
					if(i != 0x388694fe)
	//*  28   53:iload_3         
	//*  29   54:ldc1            #130 <Int 0x388694fe>
	//*  30   56:icmpeq          82
					{
						if(i == 0x3cbf870b && ((String) (context)).equals("android.intent.action.ACTION_POWER_CONNECTED"))
	//*  31   59:iload_3         
	//*  32   60:ldc1            #131 <Int 0x3cbf870b>
	//*  33   62:icmpeq          68
	//*  34   65:goto            124
	//*  35   68:aload_1         
	//*  36   69:ldc1            #101 <String "android.intent.action.ACTION_POWER_CONNECTED">
	//*  37   71:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  38   74:ifeq            124
						{
							i = 2;
	//   39   77:iconst_2        
	//   40   78:istore_3        
							break label0;
	//   41   79:goto            126
						}
					} else
					if(((String) (context)).equals("android.os.action.CHARGING"))
	//*  42   82:aload_1         
	//*  43   83:ldc1            #94  <String "android.os.action.CHARGING">
	//*  44   85:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  45   88:ifeq            124
					{
						i = 0;
	//   46   91:iconst_0        
	//   47   92:istore_3        
						break label0;
	//   48   93:goto            126
					}
				} else
				if(((String) (context)).equals("android.os.action.DISCHARGING"))
	//*  49   96:aload_1         
	//*  50   97:ldc1            #99  <String "android.os.action.DISCHARGING">
	//*  51   99:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  52  102:ifeq            124
				{
					i = 1;
	//   53  105:iconst_1        
	//   54  106:istore_3        
					break label0;
	//   55  107:goto            126
				}
			} else
			if(((String) (context)).equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
	//*  56  110:aload_1         
	//*  57  111:ldc1            #103 <String "android.intent.action.ACTION_POWER_DISCONNECTED">
	//*  58  113:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  59  116:ifeq            124
			{
				i = 3;
	//   60  119:iconst_3        
	//   61  120:istore_3        
				break label0;
	//   62  121:goto            126
			}
			i = -1;
	//   63  124:iconst_m1       
	//   64  125:istore_3        
		}
		switch(i)
	//*  65  126:iload_3         
		{
	//*  66  127:tableswitch     0 3: default 156
	//	               0 184
	//	               1 175
	//	               2 166
	//	               3 157
		default:
			return;
	//   67  156:return          

		case 3: // '\003'
			setState(((Object) (Boolean.valueOf(false))));
	//   68  157:aload_0         
	//   69  158:iconst_0        
	//   70  159:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   71  162:invokevirtual   #139 <Method void setState(Object)>
			return;
	//   72  165:return          

		case 2: // '\002'
			setState(((Object) (Boolean.valueOf(true))));
	//   73  166:aload_0         
	//   74  167:iconst_1        
	//   75  168:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   76  171:invokevirtual   #139 <Method void setState(Object)>
			return;
	//   77  174:return          

		case 1: // '\001'
			setState(((Object) (Boolean.valueOf(false))));
	//   78  175:aload_0         
	//   79  176:iconst_0        
	//   80  177:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   81  180:invokevirtual   #139 <Method void setState(Object)>
			return;
	//   82  183:return          

		case 0: // '\0'
			setState(((Object) (Boolean.valueOf(true))));
	//   83  184:aload_0         
	//   84  185:iconst_1        
	//   85  186:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   86  189:invokevirtual   #139 <Method void setState(Object)>
			return;
	//   87  192:return          
		}
	}

	private static final String TAG = Logger.tagWithPrefix("BatteryChrgTracker");

	static 
	{
	//    0    0:ldc1            #15  <String "BatteryChrgTracker">
	//    1    2:invokestatic    #21  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #23  <Field String TAG>
	//*   3    8:return          
	}
}
