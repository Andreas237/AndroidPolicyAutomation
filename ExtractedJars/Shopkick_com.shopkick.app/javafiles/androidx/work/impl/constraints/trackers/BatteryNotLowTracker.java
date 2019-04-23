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
	//    2    2:invokespecial   #34  <Method void BroadcastReceiverConstraintTracker(Context)>
	//    3    5:return          
	}

	public Boolean getInitialState()
	{
		Object obj = ((Object) (new IntentFilter("android.intent.action.BATTERY_CHANGED")));
	//    0    0:new             #38  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #40  <String "android.intent.action.BATTERY_CHANGED">
	//    3    6:invokespecial   #43  <Method void IntentFilter(String)>
	//    4    9:astore          8
		obj = ((Object) (mAppContext.registerReceiver(((android.content.BroadcastReceiver) (null)), ((IntentFilter) (obj)))));
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field Context mAppContext>
	//    7   15:aconst_null     
	//    8   16:aload           8
	//    9   18:invokevirtual   #53  <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   10   21:astore          8
		if(obj == null)
	//*  11   23:aload           8
	//*  12   25:ifnonnull       45
		{
			Logger.get().error(TAG, "getInitialState - null intent received", new Throwable[0]);
	//   13   28:invokestatic    #57  <Method Logger Logger.get()>
	//   14   31:getstatic       #29  <Field String TAG>
	//   15   34:ldc1            #59  <String "getInitialState - null intent received">
	//   16   36:iconst_0        
	//   17   37:anewarray       Throwable[]
	//   18   40:invokevirtual   #65  <Method void Logger.error(String, String, Throwable[])>
			return null;
	//   19   43:aconst_null     
	//   20   44:areturn         
		}
		int i = ((Intent) (obj)).getIntExtra("plugged", 0);
	//   21   45:aload           8
	//   22   47:ldc1            #67  <String "plugged">
	//   23   49:iconst_0        
	//   24   50:invokevirtual   #73  <Method int Intent.getIntExtra(String, int)>
	//   25   53:istore_2        
		int j = ((Intent) (obj)).getIntExtra("status", -1);
	//   26   54:aload           8
	//   27   56:ldc1            #75  <String "status">
	//   28   58:iconst_m1       
	//   29   59:invokevirtual   #73  <Method int Intent.getIntExtra(String, int)>
	//   30   62:istore_3        
		int k = ((Intent) (obj)).getIntExtra("level", -1);
	//   31   63:aload           8
	//   32   65:ldc1            #77  <String "level">
	//   33   67:iconst_m1       
	//   34   68:invokevirtual   #73  <Method int Intent.getIntExtra(String, int)>
	//   35   71:istore          4
		int l = ((Intent) (obj)).getIntExtra("scale", -1);
	//   36   73:aload           8
	//   37   75:ldc1            #79  <String "scale">
	//   38   77:iconst_m1       
	//   39   78:invokevirtual   #73  <Method int Intent.getIntExtra(String, int)>
	//   40   81:istore          5
		float f = (float)k / (float)l;
	//   41   83:iload           4
	//   42   85:i2f             
	//   43   86:iload           5
	//   44   88:i2f             
	//   45   89:fdiv            
	//   46   90:fstore_1        
		boolean flag1 = true;
	//   47   91:iconst_1        
	//   48   92:istore          7
		boolean flag = flag1;
	//   49   94:iload           7
	//   50   96:istore          6
		if(i == 0)
	//*  51   98:iload_2         
	//*  52   99:ifne            128
		{
			flag = flag1;
	//   53  102:iload           7
	//   54  104:istore          6
			if(j != 1)
	//*  55  106:iload_3         
	//*  56  107:iconst_1        
	//*  57  108:icmpeq          128
				if(f > 0.15F)
	//*  58  111:fload_1         
	//*  59  112:ldc1            #12  <Float 0.15F>
	//*  60  114:fcmpl           
	//*  61  115:ifle            125
					flag = flag1;
	//   62  118:iload           7
	//   63  120:istore          6
				else
	//*  64  122:goto            128
					flag = false;
	//   65  125:iconst_0        
	//   66  126:istore          6
		}
		return Boolean.valueOf(flag);
	//   67  128:iload           6
	//   68  130:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   69  133:areturn         
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
	//    0    0:new             #38  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #92  <Method void IntentFilter()>
	//    3    7:astore_1        
		intentfilter.addAction("android.intent.action.BATTERY_OKAY");
	//    4    8:aload_1         
	//    5    9:ldc1            #94  <String "android.intent.action.BATTERY_OKAY">
	//    6   11:invokevirtual   #97  <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.BATTERY_LOW");
	//    7   14:aload_1         
	//    8   15:ldc1            #99  <String "android.intent.action.BATTERY_LOW">
	//    9   17:invokevirtual   #97  <Method void IntentFilter.addAction(String)>
		return intentfilter;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public void onBroadcastReceive(Context context, Intent intent)
	{
		if(intent.getAction() == null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #106 <Method String Intent.getAction()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Logger.get().debug(TAG, String.format("Received %s", new Object[] {
			intent.getAction()
		}), new Throwable[0]);
	//    4    8:invokestatic    #57  <Method Logger Logger.get()>
	//    5   11:getstatic       #29  <Field String TAG>
	//    6   14:ldc1            #108 <String "Received %s">
	//    7   16:iconst_1        
	//    8   17:anewarray       Object[]
	//    9   20:dup             
	//   10   21:iconst_0        
	//   11   22:aload_2         
	//   12   23:invokevirtual   #106 <Method String Intent.getAction()>
	//   13   26:aastore         
	//   14   27:invokestatic    #116 <Method String String.format(String, Object[])>
	//   15   30:iconst_0        
	//   16   31:anewarray       Throwable[]
	//   17   34:invokevirtual   #119 <Method void Logger.debug(String, String, Throwable[])>
		context = ((Context) (intent.getAction()));
	//   18   37:aload_2         
	//   19   38:invokevirtual   #106 <Method String Intent.getAction()>
	//   20   41:astore_1        
		byte byte0 = -1;
	//   21   42:iconst_m1       
	//   22   43:istore_3        
		int i = ((String) (context)).hashCode();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #123 <Method int String.hashCode()>
	//   25   48:istore          4
		if(i != 0x89f93f6b)
	//*  26   50:iload           4
	//*  27   52:ldc1            #124 <Int 0x89f93f6b>
	//*  28   54:icmpeq          81
		{
			if(i == 0x1d398bfd && ((String) (context)).equals("android.intent.action.BATTERY_LOW"))
	//*  29   57:iload           4
	//*  30   59:ldc1            #125 <Int 0x1d398bfd>
	//*  31   61:icmpeq          67
	//*  32   64:goto            92
	//*  33   67:aload_1         
	//*  34   68:ldc1            #99  <String "android.intent.action.BATTERY_LOW">
	//*  35   70:invokevirtual   #129 <Method boolean String.equals(Object)>
	//*  36   73:ifeq            92
				byte0 = 1;
	//   37   76:iconst_1        
	//   38   77:istore_3        
		} else
	//*  39   78:goto            92
		if(((String) (context)).equals("android.intent.action.BATTERY_OKAY"))
	//*  40   81:aload_1         
	//*  41   82:ldc1            #94  <String "android.intent.action.BATTERY_OKAY">
	//*  42   84:invokevirtual   #129 <Method boolean String.equals(Object)>
	//*  43   87:ifeq            92
			byte0 = 0;
	//   44   90:iconst_0        
	//   45   91:istore_3        
		switch(byte0)
	//*  46   92:iload_3         
		{
	//*  47   93:tableswitch     0 1: default 116
	//	               0 126
	//	               1 117
		default:
			return;
	//   48  116:return          

		case 1: // '\001'
			setState(((Object) (Boolean.valueOf(false))));
	//   49  117:aload_0         
	//   50  118:iconst_0        
	//   51  119:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   52  122:invokevirtual   #133 <Method void setState(Object)>
			return;
	//   53  125:return          

		case 0: // '\0'
			setState(((Object) (Boolean.valueOf(true))));
	//   54  126:aload_0         
	//   55  127:iconst_1        
	//   56  128:invokestatic    #85  <Method Boolean Boolean.valueOf(boolean)>
	//   57  131:invokevirtual   #133 <Method void setState(Object)>
			return;
	//   58  134:return          
		}
	}

	static final float BATTERY_LOW_PERCENTAGE = 0.15F;
	static final int BATTERY_PLUGGED_NONE = 0;
	private static final String TAG = Logger.tagWithPrefix("BatteryNotLowTracker");

	static 
	{
	//    0    0:ldc1            #21  <String "BatteryNotLowTracker">
	//    1    2:invokestatic    #27  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #29  <Field String TAG>
	//*   3    8:return          
	}
}
