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
	//    2    2:invokespecial   #28  <Method void BroadcastReceiverConstraintTracker(Context)>
	//    3    5:return          
	}

	public Boolean getInitialState()
	{
		Object obj = ((Object) (mAppContext.registerReceiver(((android.content.BroadcastReceiver) (null)), getIntentFilter())));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Context mAppContext>
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:invokevirtual   #38  <Method IntentFilter getIntentFilter()>
	//    5    9:invokevirtual   #44  <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//    6   12:astore_3        
		if(obj != null && ((Intent) (obj)).getAction() != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          116
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #50  <Method String Intent.getAction()>
	//*  11   21:ifnonnull       27
	//*  12   24:goto            116
		{
			obj = ((Object) (((Intent) (obj)).getAction()));
	//   13   27:aload_3         
	//   14   28:invokevirtual   #50  <Method String Intent.getAction()>
	//   15   31:astore_3        
			byte byte0 = -1;
	//   16   32:iconst_m1       
	//   17   33:istore_1        
			int i = ((String) (obj)).hashCode();
	//   18   34:aload_3         
	//   19   35:invokevirtual   #56  <Method int String.hashCode()>
	//   20   38:istore_2        
			if(i != 0xb998e06c)
	//*  21   39:iload_2         
	//*  22   40:ldc1            #57  <Int 0xb998e06c>
	//*  23   42:icmpeq          68
			{
				if(i == 0xd47049a4 && ((String) (obj)).equals("android.intent.action.DEVICE_STORAGE_OK"))
	//*  24   45:iload_2         
	//*  25   46:ldc1            #58  <Int 0xd47049a4>
	//*  26   48:icmpeq          54
	//*  27   51:goto            79
	//*  28   54:aload_3         
	//*  29   55:ldc1            #60  <String "android.intent.action.DEVICE_STORAGE_OK">
	//*  30   57:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  31   60:ifeq            79
					byte0 = 0;
	//   32   63:iconst_0        
	//   33   64:istore_1        
			} else
	//*  34   65:goto            79
			if(((String) (obj)).equals("android.intent.action.DEVICE_STORAGE_LOW"))
	//*  35   68:aload_3         
	//*  36   69:ldc1            #66  <String "android.intent.action.DEVICE_STORAGE_LOW">
	//*  37   71:invokevirtual   #64  <Method boolean String.equals(Object)>
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
	//   46  107:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//   47  110:areturn         

			case 0: // '\0'
				return Boolean.valueOf(true);
	//   48  111:iconst_1        
	//   49  112:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//   50  115:areturn         
			}
		} else
		{
			return Boolean.valueOf(true);
	//   51  116:iconst_1        
	//   52  117:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//   53  120:areturn         
		}
	}

	public volatile Object getInitialState()
	{
		return ((Object) (getInitialState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method Boolean getInitialState()>
	//    2    4:areturn         
	}

	public IntentFilter getIntentFilter()
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #77  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void IntentFilter()>
	//    3    7:astore_1        
		intentfilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
	//    4    8:aload_1         
	//    5    9:ldc1            #60  <String "android.intent.action.DEVICE_STORAGE_OK">
	//    6   11:invokevirtual   #83  <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
	//    7   14:aload_1         
	//    8   15:ldc1            #66  <String "android.intent.action.DEVICE_STORAGE_LOW">
	//    9   17:invokevirtual   #83  <Method void IntentFilter.addAction(String)>
		return intentfilter;
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	public void onBroadcastReceive(Context context, Intent intent)
	{
		if(intent.getAction() == null)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #50  <Method String Intent.getAction()>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Logger.get().debug(TAG, String.format("Received %s", new Object[] {
			intent.getAction()
		}), new Throwable[0]);
	//    4    8:invokestatic    #90  <Method Logger Logger.get()>
	//    5   11:getstatic       #23  <Field String TAG>
	//    6   14:ldc1            #92  <String "Received %s">
	//    7   16:iconst_1        
	//    8   17:anewarray       Object[]
	//    9   20:dup             
	//   10   21:iconst_0        
	//   11   22:aload_2         
	//   12   23:invokevirtual   #50  <Method String Intent.getAction()>
	//   13   26:aastore         
	//   14   27:invokestatic    #98  <Method String String.format(String, Object[])>
	//   15   30:iconst_0        
	//   16   31:anewarray       Throwable[]
	//   17   34:invokevirtual   #104 <Method void Logger.debug(String, String, Throwable[])>
		context = ((Context) (intent.getAction()));
	//   18   37:aload_2         
	//   19   38:invokevirtual   #50  <Method String Intent.getAction()>
	//   20   41:astore_1        
		byte byte0 = -1;
	//   21   42:iconst_m1       
	//   22   43:istore_3        
		int i = ((String) (context)).hashCode();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #56  <Method int String.hashCode()>
	//   25   48:istore          4
		if(i != 0xb998e06c)
	//*  26   50:iload           4
	//*  27   52:ldc1            #57  <Int 0xb998e06c>
	//*  28   54:icmpeq          81
		{
			if(i == 0xd47049a4 && ((String) (context)).equals("android.intent.action.DEVICE_STORAGE_OK"))
	//*  29   57:iload           4
	//*  30   59:ldc1            #58  <Int 0xd47049a4>
	//*  31   61:icmpeq          67
	//*  32   64:goto            92
	//*  33   67:aload_1         
	//*  34   68:ldc1            #60  <String "android.intent.action.DEVICE_STORAGE_OK">
	//*  35   70:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  36   73:ifeq            92
				byte0 = 0;
	//   37   76:iconst_0        
	//   38   77:istore_3        
		} else
	//*  39   78:goto            92
		if(((String) (context)).equals("android.intent.action.DEVICE_STORAGE_LOW"))
	//*  40   81:aload_1         
	//*  41   82:ldc1            #66  <String "android.intent.action.DEVICE_STORAGE_LOW">
	//*  42   84:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  43   87:ifeq            92
			byte0 = 1;
	//   44   90:iconst_1        
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
	//   51  119:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//   52  122:invokevirtual   #108 <Method void setState(Object)>
			return;
	//   53  125:return          

		case 0: // '\0'
			setState(((Object) (Boolean.valueOf(true))));
	//   54  126:aload_0         
	//   55  127:iconst_1        
	//   56  128:invokestatic    #72  <Method Boolean Boolean.valueOf(boolean)>
	//   57  131:invokevirtual   #108 <Method void setState(Object)>
			return;
	//   58  134:return          
		}
	}

	private static final String TAG = Logger.tagWithPrefix("StorageNotLowTracker");

	static 
	{
	//    0    0:ldc1            #15  <String "StorageNotLowTracker">
	//    1    2:invokestatic    #21  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #23  <Field String TAG>
	//*   3    8:return          
	}
}
