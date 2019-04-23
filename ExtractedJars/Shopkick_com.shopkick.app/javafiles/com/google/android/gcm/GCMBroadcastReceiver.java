// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gcm;

import android.content.*;
import android.util.Log;

// Referenced classes of package com.google.android.gcm:
//			GCMRegistrar, GCMBaseIntentService

public class GCMBroadcastReceiver extends BroadcastReceiver
{

	public GCMBroadcastReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	static final String getDefaultIntentServiceClassName(Context context)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(context.getPackageName());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #28  <Method String Context.getPackageName()>
	//    7   13:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(".GCMIntentService");
	//    9   17:aload_1         
	//   10   18:ldc1            #34  <String ".GCMIntentService">
	//   11   20:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #37  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	protected String getGCMIntentServiceClassName(Context context)
	{
		return getDefaultIntentServiceClassName(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method String getDefaultIntentServiceClassName(Context)>
	//    2    4:areturn         
	}

	public final void onReceive(Context context, Intent intent)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append("onReceive: ");
	//    4    8:aload_3         
	//    5    9:ldc1            #44  <String "onReceive: ">
	//    6   11:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (obj)).append(intent.getAction());
	//    8   15:aload_3         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #49  <Method String Intent.getAction()>
	//   11   20:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		Log.v("GCMBroadcastReceiver", ((StringBuilder) (obj)).toString());
	//   13   24:ldc1            #8   <String "GCMBroadcastReceiver">
	//   14   26:aload_3         
	//   15   27:invokevirtual   #37  <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #55  <Method int Log.v(String, String)>
	//   17   33:pop             
		if(!mReceiverSet)
	//*  18   34:getstatic       #57  <Field boolean mReceiverSet>
	//*  19   37:ifne            68
		{
			mReceiverSet = true;
	//   20   40:iconst_1        
	//   21   41:putstatic       #57  <Field boolean mReceiverSet>
			obj = ((Object) (((Object)this).getClass().getName()));
	//   22   44:aload_0         
	//   23   45:invokevirtual   #63  <Method Class Object.getClass()>
	//   24   48:invokevirtual   #68  <Method String Class.getName()>
	//   25   51:astore_3        
			if(!((String) (obj)).equals(((Object) (((Class) (com/google/android/gcm/GCMBroadcastReceiver)).getName()))))
	//*  26   52:aload_3         
	//*  27   53:ldc1            #2   <Class GCMBroadcastReceiver>
	//*  28   55:invokevirtual   #68  <Method String Class.getName()>
	//*  29   58:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  30   61:ifne            68
				GCMRegistrar.setRetryReceiverClassName(((String) (obj)));
	//   31   64:aload_3         
	//   32   65:invokestatic    #80  <Method void GCMRegistrar.setRetryReceiverClassName(String)>
		}
		obj = ((Object) (getGCMIntentServiceClassName(context)));
	//   33   68:aload_0         
	//   34   69:aload_1         
	//   35   70:invokevirtual   #82  <Method String getGCMIntentServiceClassName(Context)>
	//   36   73:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   37   74:new             #21  <Class StringBuilder>
	//   38   77:dup             
	//   39   78:invokespecial   #22  <Method void StringBuilder()>
	//   40   81:astore          4
		stringbuilder.append("GCM IntentService class: ");
	//   41   83:aload           4
	//   42   85:ldc1            #84  <String "GCM IntentService class: ">
	//   43   87:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		stringbuilder.append(((String) (obj)));
	//   45   91:aload           4
	//   46   93:aload_3         
	//   47   94:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//   48   97:pop             
		Log.v("GCMBroadcastReceiver", stringbuilder.toString());
	//   49   98:ldc1            #8   <String "GCMBroadcastReceiver">
	//   50  100:aload           4
	//   51  102:invokevirtual   #37  <Method String StringBuilder.toString()>
	//   52  105:invokestatic    #55  <Method int Log.v(String, String)>
	//   53  108:pop             
		GCMBaseIntentService.runIntentInService(context, intent, ((String) (obj)));
	//   54  109:aload_1         
	//   55  110:aload_2         
	//   56  111:aload_3         
	//   57  112:invokestatic    #90  <Method void GCMBaseIntentService.runIntentInService(Context, Intent, String)>
		setResult(-1, ((String) (null)), ((android.os.Bundle) (null)));
	//   58  115:aload_0         
	//   59  116:iconst_m1       
	//   60  117:aconst_null     
	//   61  118:aconst_null     
	//   62  119:invokevirtual   #94  <Method void setResult(int, String, android.os.Bundle)>
	//   63  122:return          
	}

	private static final String TAG = "GCMBroadcastReceiver";
	private static boolean mReceiverSet = false;

	static 
	{
	//    0    0:return          
	}
}
