// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.content.*;
import androidx.work.Logger;

// Referenced classes of package androidx.work.impl.constraints.trackers:
//			BroadcastReceiverConstraintTracker

public class StorageNotLowTracker extends BroadcastReceiverConstraintTracker
{

	public StorageNotLowTracker(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void BroadcastReceiverConstraintTracker(Context)>
	//    3    5:return          
	}

	public Boolean getInitialState()
	{
		Object obj = ((Object) (mAppContext.registerReceiver(((android.content.BroadcastReceiver) (null)), getIntentFilter())));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Context mAppContext>
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:invokevirtual   #24  <Method IntentFilter getIntentFilter()>
	//    5    9:invokevirtual   #30  <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//    6   12:astore_3        
		if(obj != null && ((Intent) (obj)).getAction() != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          116
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #36  <Method String Intent.getAction()>
	//*  11   21:ifnonnull       27
	//*  12   24:goto            116
		{
			obj = ((Object) (((Intent) (obj)).getAction()));
	//   13   27:aload_3         
	//   14   28:invokevirtual   #36  <Method String Intent.getAction()>
	//   15   31:astore_3        
			byte byte0 = -1;
	//   16   32:iconst_m1       
	//   17   33:istore_1        
			int i = ((String) (obj)).hashCode();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #42  <Method int String.hashCode()>
	//   20   38:istore_2        
			if(i != 0xb998e06c)
	//*  21   39:iload_2         
	//*  22   40:ldc1            #43  <Int 0xb998e06c>
	//*  23   42:icmpeq          68
			{
				if(i == 0xd47049a4 && ((String) (obj)).equals("android.intent.action.DEVICE_STORAGE_OK"))
	//*  24   45:iload_2         
	//*  25   46:ldc1            #44  <Int 0xd47049a4>
	//*  26   48:icmpeq          54
	//*  27   51:goto            79
	//*  28   54:aload_3         
	//*  29   55:ldc1            #46  <String "android.intent.action.DEVICE_STORAGE_OK">
	//*  30   57:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  31   60:ifeq            79
					byte0 = 0;
	//   32   63:iconst_0        
	//   33   64:istore_1        
			} else
	//*  34   65:goto            79
			if(((String) (obj)).equals("android.intent.action.DEVICE_STORAGE_LOW"))
	//*  35   68:aload_3         
	//*  36   69:ldc1            #52  <String "android.intent.action.DEVICE_STORAGE_LOW">
	//*  37   71:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  38   74:ifeq            79
				byte0 = 1;
	//   39   77:iconst_1        
	//   40   78:istore_1        
			switch(byte0)
	//*  41   79:iload_1         
			{
	//*  42   80:tableswitch     0 1: default 104
	//	               0 111
	//	               1 106
			default:
				return null;
	//   43  104:aconst_null     
	//   44  105:areturn         

			case 1: // '\001'
				return Boolean.valueOf(false);
	//   45  106:iconst_0        
	//   46  107:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   47  110:areturn         

			case 0: // '\0'
				return Boolean.valueOf(true);
	//   48  111:iconst_1        
	//   49  112:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   50  115:areturn         
			}
		} else
		{
			return Boolean.valueOf(true);
	//   51  116:iconst_1        
	//   52  117:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   53  120:areturn         
		}
	}

	public volatile Object getInitialState()
	{
		return ((Object) (getInitialState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method Boolean getInitialState()>
	//    2    4:areturn         
	}

	public IntentFilter getIntentFilter()
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #63  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void IntentFilter()>
	//    3    7:astore_1        
		intentfilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
	//    4    8:aload_1         
	//    5    9:ldc1            #46  <String "android.intent.action.DEVICE_STORAGE_OK">
	//    6   11:invokevirtual   #70  <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
	//    7   14:aload_1         
	//    8   15:ldc1            #52  <String "android.intent.action.DEVICE_STORAGE_LOW">
	//    9   17:invokevirtual   #70  <Method void IntentFilter.addAction(String)>
		return intentfilter;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public void onBroadcastReceive(Context context, Intent intent)
	{
		if(intent.getAction() == null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #36  <Method String Intent.getAction()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Logger.debug("StorageNotLowTracker", String.format("Received %s", new Object[] {
			intent.getAction()
		}), new Throwable[0]);
	//    4    8:ldc1            #75  <String "StorageNotLowTracker">
	//    5   10:ldc1            #77  <String "Received %s">
	//    6   12:iconst_1        
	//    7   13:anewarray       Object[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:aload_2         
	//   11   19:invokevirtual   #36  <Method String Intent.getAction()>
	//   12   22:aastore         
	//   13   23:invokestatic    #83  <Method String String.format(String, Object[])>
	//   14   26:iconst_0        
	//   15   27:anewarray       Throwable[]
	//   16   30:invokestatic    #91  <Method void Logger.debug(String, String, Throwable[])>
		context = ((Context) (intent.getAction()));
	//   17   33:aload_2         
	//   18   34:invokevirtual   #36  <Method String Intent.getAction()>
	//   19   37:astore_1        
		byte byte0 = -1;
	//   20   38:iconst_m1       
	//   21   39:istore_3        
		int i = ((String) (context)).hashCode();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #42  <Method int String.hashCode()>
	//   24   44:istore          4
		if(i != 0xb998e06c)
	//*  25   46:iload           4
	//*  26   48:ldc1            #43  <Int 0xb998e06c>
	//*  27   50:icmpeq          77
		{
			if(i == 0xd47049a4 && ((String) (context)).equals("android.intent.action.DEVICE_STORAGE_OK"))
	//*  28   53:iload           4
	//*  29   55:ldc1            #44  <Int 0xd47049a4>
	//*  30   57:icmpeq          63
	//*  31   60:goto            88
	//*  32   63:aload_1         
	//*  33   64:ldc1            #46  <String "android.intent.action.DEVICE_STORAGE_OK">
	//*  34   66:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  35   69:ifeq            88
				byte0 = 0;
	//   36   72:iconst_0        
	//   37   73:istore_3        
		} else
	//*  38   74:goto            88
		if(((String) (context)).equals("android.intent.action.DEVICE_STORAGE_LOW"))
	//*  39   77:aload_1         
	//*  40   78:ldc1            #52  <String "android.intent.action.DEVICE_STORAGE_LOW">
	//*  41   80:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  42   83:ifeq            88
			byte0 = 1;
	//   43   86:iconst_1        
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
	//   50  115:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   51  118:invokevirtual   #95  <Method void setState(Object)>
			return;
	//   52  121:return          

		case 0: // '\0'
			setState(((Object) (Boolean.valueOf(true))));
	//   53  122:aload_0         
	//   54  123:iconst_1        
	//   55  124:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
	//   56  127:invokevirtual   #95  <Method void setState(Object)>
			return;
	//   57  130:return          
		}
	}
}
