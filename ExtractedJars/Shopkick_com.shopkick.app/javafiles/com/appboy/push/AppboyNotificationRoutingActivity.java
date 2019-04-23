// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.support.AppboyLogger;

// Referenced classes of package com.appboy.push:
//			AppboyNotificationUtils

public class AppboyNotificationRoutingActivity extends Activity
{

	public AppboyNotificationRoutingActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Activity()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (getIntent()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #29  <Method Intent getIntent()>
	//    5    9:astore_1        
		if(bundle == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       28
		{
			AppboyLogger.d(TAG, "Notification routing activity received null intent. Doing nothing.");
	//    8   14:getstatic       #16  <Field String TAG>
	//    9   17:ldc1            #31  <String "Notification routing activity received null intent. Doing nothing.">
	//   10   19:invokestatic    #35  <Method int AppboyLogger.d(String, String)>
	//   11   22:pop             
			finish();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #38  <Method void finish()>
			return;
	//   14   27:return          
		}
		Object obj = ((Object) (((Intent) (bundle)).getAction()));
	//   15   28:aload_1         
	//   16   29:invokevirtual   #44  <Method String Intent.getAction()>
	//   17   32:astore_2        
		if(obj == null)
	//*  18   33:aload_2         
	//*  19   34:ifnonnull       51
		{
			AppboyLogger.d(TAG, "Notification routing activity received intent with null action. Doing nothing.");
	//   20   37:getstatic       #16  <Field String TAG>
	//   21   40:ldc1            #46  <String "Notification routing activity received intent with null action. Doing nothing.">
	//   22   42:invokestatic    #35  <Method int AppboyLogger.d(String, String)>
	//   23   45:pop             
			finish();
	//   24   46:aload_0         
	//   25   47:invokevirtual   #38  <Method void finish()>
			return;
	//   26   50:return          
		} else
		{
			Object obj1 = ((Object) (TAG));
	//   27   51:getstatic       #16  <Field String TAG>
	//   28   54:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//   29   55:new             #48  <Class StringBuilder>
	//   30   58:dup             
	//   31   59:invokespecial   #49  <Method void StringBuilder()>
	//   32   62:astore          4
			stringbuilder.append("Notification routing activity received intent: ");
	//   33   64:aload           4
	//   34   66:ldc1            #51  <String "Notification routing activity received intent: ">
	//   35   68:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
			stringbuilder.append(((Intent) (bundle)).toString());
	//   37   72:aload           4
	//   38   74:aload_1         
	//   39   75:invokevirtual   #58  <Method String Intent.toString()>
	//   40   78:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   41   81:pop             
			AppboyLogger.i(((String) (obj1)), stringbuilder.toString());
	//   42   82:aload_3         
	//   43   83:aload           4
	//   44   85:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   45   88:invokestatic    #62  <Method int AppboyLogger.i(String, String)>
	//   46   91:pop             
			obj1 = ((Object) (getApplicationContext()));
	//   47   92:aload_0         
	//   48   93:invokevirtual   #66  <Method Context getApplicationContext()>
	//   49   96:astore_3        
			obj = ((Object) ((new Intent(((String) (obj)))).setClass(((Context) (obj1)), AppboyNotificationUtils.getNotificationReceiverClass())));
	//   50   97:new             #40  <Class Intent>
	//   51  100:dup             
	//   52  101:aload_2         
	//   53  102:invokespecial   #69  <Method void Intent(String)>
	//   54  105:aload_3         
	//   55  106:invokestatic    #75  <Method Class AppboyNotificationUtils.getNotificationReceiverClass()>
	//   56  109:invokevirtual   #79  <Method Intent Intent.setClass(Context, Class)>
	//   57  112:astore_2        
			((Intent) (obj)).putExtras(((Intent) (bundle)).getExtras());
	//   58  113:aload_2         
	//   59  114:aload_1         
	//   60  115:invokevirtual   #83  <Method Bundle Intent.getExtras()>
	//   61  118:invokevirtual   #87  <Method Intent Intent.putExtras(Bundle)>
	//   62  121:pop             
			((Context) (obj1)).sendBroadcast(((Intent) (obj)));
	//   63  122:aload_3         
	//   64  123:aload_2         
	//   65  124:invokevirtual   #93  <Method void Context.sendBroadcast(Intent)>
			finish();
	//   66  127:aload_0         
	//   67  128:invokevirtual   #38  <Method void finish()>
			return;
	//   68  131:return          
		}
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/push/AppboyNotificationRoutingActivity);

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyNotificationRoutingActivity>
	//    1    2:invokestatic    #14  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #16  <Field String TAG>
	//*   3    8:return          
	}
}
