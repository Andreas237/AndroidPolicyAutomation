// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.content.*;
import androidx.work.Logger;

// Referenced classes of package androidx.work.impl.constraints.trackers:
//			BroadcastReceiverConstraintTracker

public class BatteryNotLowTracker extends BroadcastReceiverConstraintTracker
{

	public BatteryNotLowTracker(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void BroadcastReceiverConstraintTracker(Context)>
	//    3    5:return          
	}

	public Boolean getInitialState()
	{
		Object obj = ((Object) (new IntentFilter("android.intent.action.BATTERY_CHANGED")));
	//    0    0:new             #18  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "android.intent.action.BATTERY_CHANGED">
	//    3    6:invokespecial   #23  <Method void IntentFilter(String)>
	//    4    9:astore          8
		obj = ((Object) (mAppContext.registerReceiver(((android.content.BroadcastReceiver) (null)), ((IntentFilter) (obj)))));
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field Context mAppContext>
	//    7   15:aconst_null     
	//    8   16:aload           8
	//    9   18:invokevirtual   #33  <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   10   21:astore          8
		if(obj == null)
	//*  11   23:aload           8
	//*  12   25:ifnonnull       41
		{
			Logger.error("BatteryNotLowTracker", "getInitialState - null intent received", new Throwable[0]);
	//   13   28:ldc1            #35  <String "BatteryNotLowTracker">
	//   14   30:ldc1            #37  <String "getInitialState - null intent received">
	//   15   32:iconst_0        
	//   16   33:anewarray       Throwable[]
	//   17   36:invokestatic    #45  <Method void Logger.error(String, String, Throwable[])>
			return null;
	//   18   39:aconst_null     
	//   19   40:areturn         
		}
		int i = ((Intent) (obj)).getIntExtra("plugged", 0);
	//   20   41:aload           8
	//   21   43:ldc1            #47  <String "plugged">
	//   22   45:iconst_0        
	//   23   46:invokevirtual   #53  <Method int Intent.getIntExtra(String, int)>
	//   24   49:istore_2        
		int j = ((Intent) (obj)).getIntExtra("status", -1);
	//   25   50:aload           8
	//   26   52:ldc1            #55  <String "status">
	//   27   54:iconst_m1       
	//   28   55:invokevirtual   #53  <Method int Intent.getIntExtra(String, int)>
	//   29   58:istore_3        
		int k = ((Intent) (obj)).getIntExtra("level", -1);
	//   30   59:aload           8
	//   31   61:ldc1            #57  <String "level">
	//   32   63:iconst_m1       
	//   33   64:invokevirtual   #53  <Method int Intent.getIntExtra(String, int)>
	//   34   67:istore          4
		int l = ((Intent) (obj)).getIntExtra("scale", -1);
	//   35   69:aload           8
	//   36   71:ldc1            #59  <String "scale">
	//   37   73:iconst_m1       
	//   38   74:invokevirtual   #53  <Method int Intent.getIntExtra(String, int)>
	//   39   77:istore          5
		float f = (float)k / (float)l;
	//   40   79:iload           4
	//   41   81:i2f             
	//   42   82:iload           5
	//   43   84:i2f             
	//   44   85:fdiv            
	//   45   86:fstore_1        
		boolean flag1 = true;
	//   46   87:iconst_1        
	//   47   88:istore          7
		boolean flag = flag1;
	//   48   90:iload           7
	//   49   92:istore          6
		if(i == 0)
	//*  50   94:iload_2         
	//*  51   95:ifne            124
		{
			flag = flag1;
	//   52   98:iload           7
	//   53  100:istore          6
			if(j != 1)
	//*  54  102:iload_3         
	//*  55  103:iconst_1        
	//*  56  104:icmpeq          124
				if(f > 0.15F)
	//*  57  107:fload_1         
	//*  58  108:ldc1            #60  <Float 0.15F>
	//*  59  110:fcmpl           
	//*  60  111:ifle            121
					flag = flag1;
	//   61  114:iload           7
	//   62  116:istore          6
				else
	//*  63  118:goto            124
					flag = false;
	//   64  121:iconst_0        
	//   65  122:istore          6
		}
		return Boolean.valueOf(flag);
	//   66  124:iload           6
	//   67  126:invokestatic    #66  <Method Boolean Boolean.valueOf(boolean)>
	//   68  129:areturn         
	}

	public volatile Object getInitialState()
	{
		return ((Object) (getInitialState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #69  <Method Boolean getInitialState()>
	//    2    4:areturn         
	}

	public IntentFilter getIntentFilter()
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #18  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void IntentFilter()>
	//    3    7:astore_1        
		intentfilter.addAction("android.intent.action.BATTERY_OKAY");
	//    4    8:aload_1         
	//    5    9:ldc1            #76  <String "android.intent.action.BATTERY_OKAY">
	//    6   11:invokevirtual   #79  <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.BATTERY_LOW");
	//    7   14:aload_1         
	//    8   15:ldc1            #81  <String "android.intent.action.BATTERY_LOW">
	//    9   17:invokevirtual   #79  <Method void IntentFilter.addAction(String)>
		return intentfilter;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public void onBroadcastReceive(Context context, Intent intent)
	{
		if(intent.getAction() == null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #88  <Method String Intent.getAction()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Logger.debug("BatteryNotLowTracker", String.format("Received %s", new Object[] {
			intent.getAction()
		}), new Throwable[0]);
	//    4    8:ldc1            #35  <String "BatteryNotLowTracker">
	//    5   10:ldc1            #90  <String "Received %s">
	//    6   12:iconst_1        
	//    7   13:anewarray       Object[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:aload_2         
	//   11   19:invokevirtual   #88  <Method String Intent.getAction()>
	//   12   22:aastore         
	//   13   23:invokestatic    #98  <Method String String.format(String, Object[])>
	//   14   26:iconst_0        
	//   15   27:anewarray       Throwable[]
	//   16   30:invokestatic    #101 <Method void Logger.debug(String, String, Throwable[])>
		context = ((Context) (intent.getAction()));
	//   17   33:aload_2         
	//   18   34:invokevirtual   #88  <Method String Intent.getAction()>
	//   19   37:astore_1        
		byte byte0 = -1;
	//   20   38:iconst_m1       
	//   21   39:istore_3        
		int i = ((String) (context)).hashCode();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #105 <Method int String.hashCode()>
	//   24   44:istore          4
		if(i != 0x89f93f6b)
	//*  25   46:iload           4
	//*  26   48:ldc1            #106 <Int 0x89f93f6b>
	//*  27   50:icmpeq          77
		{
			if(i == 0x1d398bfd && ((String) (context)).equals("android.intent.action.BATTERY_LOW"))
	//*  28   53:iload           4
	//*  29   55:ldc1            #107 <Int 0x1d398bfd>
	//*  30   57:icmpeq          63
	//*  31   60:goto            88
	//*  32   63:aload_1         
	//*  33   64:ldc1            #81  <String "android.intent.action.BATTERY_LOW">
	//*  34   66:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  35   69:ifeq            88
				byte0 = 1;
	//   36   72:iconst_1        
	//   37   73:istore_3        
		} else
	//*  38   74:goto            88
		if(((String) (context)).equals("android.intent.action.BATTERY_OKAY"))
	//*  39   77:aload_1         
	//*  40   78:ldc1            #76  <String "android.intent.action.BATTERY_OKAY">
	//*  41   80:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  42   83:ifeq            88
			byte0 = 0;
	//   43   86:iconst_0        
	//   44   87:istore_3        
		switch(byte0)
	//*  45   88:iload_3         
		{
	//*  46   89:tableswitch     0 1: default 112
	//	               0 122
	//	               1 113
		default:
			return;
	//   47  112:return          

		case 1: // '\001'
			setState(((Object) (Boolean.valueOf(false))));
	//   48  113:aload_0         
	//   49  114:iconst_0        
	//   50  115:invokestatic    #66  <Method Boolean Boolean.valueOf(boolean)>
	//   51  118:invokevirtual   #115 <Method void setState(Object)>
			return;
	//   52  121:return          

		case 0: // '\0'
			setState(((Object) (Boolean.valueOf(true))));
	//   53  122:aload_0         
	//   54  123:iconst_1        
	//   55  124:invokestatic    #66  <Method Boolean Boolean.valueOf(boolean)>
	//   56  127:invokevirtual   #115 <Method void setState(Object)>
			return;
	//   57  130:return          
		}
	}
}
