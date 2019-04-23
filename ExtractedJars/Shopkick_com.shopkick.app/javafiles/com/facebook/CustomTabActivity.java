// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;

// Referenced classes of package com.facebook:
//			CustomTabMainActivity

public class CustomTabActivity extends Activity
{

	public CustomTabActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Activity()>
	//    2    4:return          
	}

	protected void onActivityResult(int i, int j, Intent intent)
	{
		super.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #48  <Method void Activity.onActivityResult(int, int, Intent)>
		if(j == 0)
	//*   5    7:iload_2         
	//*   6    8:ifne            79
		{
			intent = new Intent(CUSTOM_TAB_REDIRECT_ACTION);
	//    7   11:new             #50  <Class Intent>
	//    8   14:dup             
	//    9   15:getstatic       #38  <Field String CUSTOM_TAB_REDIRECT_ACTION>
	//   10   18:invokespecial   #53  <Method void Intent(String)>
	//   11   21:astore_3        
			intent.putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
	//   12   22:aload_3         
	//   13   23:getstatic       #58  <Field String CustomTabMainActivity.EXTRA_URL>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #62  <Method Intent getIntent()>
	//   16   30:invokevirtual   #65  <Method String Intent.getDataString()>
	//   17   33:invokevirtual   #69  <Method Intent Intent.putExtra(String, String)>
	//   18   36:pop             
			LocalBroadcastManager.getInstance(((Context) (this))).sendBroadcast(intent);
	//   19   37:aload_0         
	//   20   38:invokestatic    #75  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   21   41:aload_3         
	//   22   42:invokevirtual   #79  <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   23   45:pop             
			closeReceiver = ((BroadcastReceiver) (new BroadcastReceiver() {

				public void onReceive(Context context, Intent intent1)
				{
					finish();
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field CustomTabActivity this$0>
				//    2    4:invokevirtual   #24  <Method void CustomTabActivity.finish()>
				//    3    7:return          
				}

				final CustomTabActivity this$0;

			
			{
				this$0 = CustomTabActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CustomTabActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
			}
));
	//   24   46:aload_0         
	//   25   47:new             #6   <Class CustomTabActivity$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #82  <Method void CustomTabActivity$1(CustomTabActivity)>
	//   29   55:putfield        #84  <Field BroadcastReceiver closeReceiver>
			LocalBroadcastManager.getInstance(((Context) (this))).registerReceiver(closeReceiver, new IntentFilter(DESTROY_ACTION));
	//   30   58:aload_0         
	//   31   59:invokestatic    #75  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   32   62:aload_0         
	//   33   63:getfield        #84  <Field BroadcastReceiver closeReceiver>
	//   34   66:new             #86  <Class IntentFilter>
	//   35   69:dup             
	//   36   70:getstatic       #42  <Field String DESTROY_ACTION>
	//   37   73:invokespecial   #87  <Method void IntentFilter(String)>
	//   38   76:invokevirtual   #91  <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
		}
	//   39   79:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #95  <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (new Intent(((Context) (this)), com/facebook/CustomTabMainActivity)));
	//    3    5:new             #50  <Class Intent>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:ldc1            #55  <Class CustomTabMainActivity>
	//    7   12:invokespecial   #98  <Method void Intent(Context, Class)>
	//    8   15:astore_1        
		((Intent) (bundle)).setAction(CUSTOM_TAB_REDIRECT_ACTION);
	//    9   16:aload_1         
	//   10   17:getstatic       #38  <Field String CUSTOM_TAB_REDIRECT_ACTION>
	//   11   20:invokevirtual   #102 <Method Intent Intent.setAction(String)>
	//   12   23:pop             
		((Intent) (bundle)).putExtra(CustomTabMainActivity.EXTRA_URL, getIntent().getDataString());
	//   13   24:aload_1         
	//   14   25:getstatic       #58  <Field String CustomTabMainActivity.EXTRA_URL>
	//   15   28:aload_0         
	//   16   29:invokevirtual   #62  <Method Intent getIntent()>
	//   17   32:invokevirtual   #65  <Method String Intent.getDataString()>
	//   18   35:invokevirtual   #69  <Method Intent Intent.putExtra(String, String)>
	//   19   38:pop             
		((Intent) (bundle)).addFlags(0x24000000);
	//   20   39:aload_1         
	//   21   40:ldc1            #103 <Int 0x24000000>
	//   22   42:invokevirtual   #107 <Method Intent Intent.addFlags(int)>
	//   23   45:pop             
		startActivityForResult(((Intent) (bundle)), 2);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:iconst_2        
	//   27   49:invokevirtual   #111 <Method void startActivityForResult(Intent, int)>
	//   28   52:return          
	}

	protected void onDestroy()
	{
		LocalBroadcastManager.getInstance(((Context) (this))).unregisterReceiver(closeReceiver);
	//    0    0:aload_0         
	//    1    1:invokestatic    #75  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field BroadcastReceiver closeReceiver>
	//    4    8:invokevirtual   #116 <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
		super.onDestroy();
	//    5   11:aload_0         
	//    6   12:invokespecial   #118 <Method void Activity.onDestroy()>
	//    7   15:return          
	}

	public static final String CUSTOM_TAB_REDIRECT_ACTION;
	private static final int CUSTOM_TAB_REDIRECT_REQUEST_CODE = 2;
	public static final String DESTROY_ACTION;
	private BroadcastReceiver closeReceiver;

	static 
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #18  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabActivity)).getSimpleName());
	//    4    8:aload_0         
	//    5    9:ldc1            #2   <Class CustomTabActivity>
	//    6   11:invokevirtual   #27  <Method String Class.getSimpleName()>
	//    7   14:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(".action_customTabRedirect");
	//    9   18:aload_0         
	//   10   19:ldc1            #33  <String ".action_customTabRedirect">
	//   11   21:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		CUSTOM_TAB_REDIRECT_ACTION = stringbuilder.toString();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   15   29:putstatic       #38  <Field String CUSTOM_TAB_REDIRECT_ACTION>
		stringbuilder = new StringBuilder();
	//   16   32:new             #18  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #21  <Method void StringBuilder()>
	//   19   39:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabActivity)).getSimpleName());
	//   20   40:aload_0         
	//   21   41:ldc1            #2   <Class CustomTabActivity>
	//   22   43:invokevirtual   #27  <Method String Class.getSimpleName()>
	//   23   46:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		stringbuilder.append(".action_destroy");
	//   25   50:aload_0         
	//   26   51:ldc1            #40  <String ".action_destroy">
	//   27   53:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		DESTROY_ACTION = stringbuilder.toString();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #36  <Method String StringBuilder.toString()>
	//   31   61:putstatic       #42  <Field String DESTROY_ACTION>
	//*  32   64:return          
	}
}
