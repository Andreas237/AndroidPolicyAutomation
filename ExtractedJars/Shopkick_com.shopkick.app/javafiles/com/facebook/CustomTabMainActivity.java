// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.internal.CustomTab;

// Referenced classes of package com.facebook:
//			FacebookSdk, CustomTabActivity

public class CustomTabMainActivity extends Activity
{

	public CustomTabMainActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Activity()>
		shouldCloseCustomTab = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #58  <Field boolean shouldCloseCustomTab>
	//    5    9:return          
	}

	public static final String getRedirectUrl()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append("fb");
	//    4    8:aload_0         
	//    5    9:ldc1            #61  <String "fb">
	//    6   11:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(FacebookSdk.getApplicationId());
	//    8   15:aload_0         
	//    9   16:invokestatic    #66  <Method String FacebookSdk.getApplicationId()>
	//   10   19:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		stringbuilder.append("://authorize");
	//   12   23:aload_0         
	//   13   24:ldc1            #68  <String "://authorize">
	//   14   26:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		return stringbuilder.toString();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   18   34:areturn         
	}

	private void sendResult(int i, Intent intent)
	{
		LocalBroadcastManager.getInstance(((Context) (this))).unregisterReceiver(redirectReceiver);
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field BroadcastReceiver redirectReceiver>
	//    4    8:invokevirtual   #82  <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
		if(intent != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          24
			setResult(i, intent);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #85  <Method void setResult(int, Intent)>
		else
	//*  11   21:goto            29
			setResult(i);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokevirtual   #88  <Method void setResult(int)>
		finish();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #91  <Method void finish()>
	//   17   33:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #95  <Method void Activity.onCreate(Bundle)>
		if(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION.equals(((Object) (getIntent().getAction()))))
	//*   3    5:getstatic       #100 <Field String CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION>
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #104 <Method Intent getIntent()>
	//*   6   12:invokevirtual   #109 <Method String Intent.getAction()>
	//*   7   15:invokevirtual   #115 <Method boolean String.equals(Object)>
	//*   8   18:ifeq            31
		{
			setResult(0);
	//    9   21:aload_0         
	//   10   22:iconst_0        
	//   11   23:invokevirtual   #88  <Method void setResult(int)>
			finish();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #91  <Method void finish()>
			return;
	//   14   30:return          
		}
		if(bundle == null)
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       110
		{
			bundle = getIntent().getBundleExtra(EXTRA_PARAMS);
	//   17   35:aload_0         
	//   18   36:invokevirtual   #104 <Method Intent getIntent()>
	//   19   39:getstatic       #42  <Field String EXTRA_PARAMS>
	//   20   42:invokevirtual   #119 <Method Bundle Intent.getBundleExtra(String)>
	//   21   45:astore_1        
			String s = getIntent().getStringExtra(EXTRA_CHROME_PACKAGE);
	//   22   46:aload_0         
	//   23   47:invokevirtual   #104 <Method Intent getIntent()>
	//   24   50:getstatic       #46  <Field String EXTRA_CHROME_PACKAGE>
	//   25   53:invokevirtual   #123 <Method String Intent.getStringExtra(String)>
	//   26   56:astore_2        
			(new CustomTab("oauth", bundle)).openCustomTab(((Activity) (this)), s);
	//   27   57:new             #125 <Class CustomTab>
	//   28   60:dup             
	//   29   61:ldc1            #13  <String "oauth">
	//   30   63:aload_1         
	//   31   64:invokespecial   #128 <Method void CustomTab(String, Bundle)>
	//   32   67:aload_0         
	//   33   68:aload_2         
	//   34   69:invokevirtual   #132 <Method void CustomTab.openCustomTab(Activity, String)>
			shouldCloseCustomTab = false;
	//   35   72:aload_0         
	//   36   73:iconst_0        
	//   37   74:putfield        #58  <Field boolean shouldCloseCustomTab>
			redirectReceiver = ((BroadcastReceiver) (new BroadcastReceiver() {

				public void onReceive(Context context, Intent intent)
				{
					context = ((Context) (new Intent(((Context) (CustomTabMainActivity.this)), com/facebook/CustomTabMainActivity)));
				//    0    0:new             #23  <Class Intent>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:getfield        #15  <Field CustomTabMainActivity this$0>
				//    4    8:ldc1            #6   <Class CustomTabMainActivity>
				//    5   10:invokespecial   #26  <Method void Intent(Context, Class)>
				//    6   13:astore_1        
					((Intent) (context)).setAction(CustomTabMainActivity.REFRESH_ACTION);
				//    7   14:aload_1         
				//    8   15:getstatic       #30  <Field String CustomTabMainActivity.REFRESH_ACTION>
				//    9   18:invokevirtual   #34  <Method Intent Intent.setAction(String)>
				//   10   21:pop             
					((Intent) (context)).putExtra(CustomTabMainActivity.EXTRA_URL, intent.getStringExtra(CustomTabMainActivity.EXTRA_URL));
				//   11   22:aload_1         
				//   12   23:getstatic       #37  <Field String CustomTabMainActivity.EXTRA_URL>
				//   13   26:aload_2         
				//   14   27:getstatic       #37  <Field String CustomTabMainActivity.EXTRA_URL>
				//   15   30:invokevirtual   #41  <Method String Intent.getStringExtra(String)>
				//   16   33:invokevirtual   #45  <Method Intent Intent.putExtra(String, String)>
				//   17   36:pop             
					((Intent) (context)).addFlags(0x24000000);
				//   18   37:aload_1         
				//   19   38:ldc1            #46  <Int 0x24000000>
				//   20   40:invokevirtual   #50  <Method Intent Intent.addFlags(int)>
				//   21   43:pop             
					startActivity(((Intent) (context)));
				//   22   44:aload_0         
				//   23   45:getfield        #15  <Field CustomTabMainActivity this$0>
				//   24   48:aload_1         
				//   25   49:invokevirtual   #54  <Method void CustomTabMainActivity.startActivity(Intent)>
				//   26   52:return          
				}

				final CustomTabMainActivity this$0;

			
			{
				this$0 = CustomTabMainActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CustomTabMainActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
			}
));
	//   38   77:aload_0         
	//   39   78:new             #6   <Class CustomTabMainActivity$1>
	//   40   81:dup             
	//   41   82:aload_0         
	//   42   83:invokespecial   #135 <Method void CustomTabMainActivity$1(CustomTabMainActivity)>
	//   43   86:putfield        #78  <Field BroadcastReceiver redirectReceiver>
			LocalBroadcastManager.getInstance(((Context) (this))).registerReceiver(redirectReceiver, new IntentFilter(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION));
	//   44   89:aload_0         
	//   45   90:invokestatic    #76  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   46   93:aload_0         
	//   47   94:getfield        #78  <Field BroadcastReceiver redirectReceiver>
	//   48   97:new             #137 <Class IntentFilter>
	//   49  100:dup             
	//   50  101:getstatic       #100 <Field String CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION>
	//   51  104:invokespecial   #140 <Method void IntentFilter(String)>
	//   52  107:invokevirtual   #144 <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
		}
	//   53  110:return          
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void Activity.onNewIntent(Intent)>
		if(REFRESH_ACTION.equals(((Object) (intent.getAction()))))
	//*   3    5:getstatic       #54  <Field String REFRESH_ACTION>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #109 <Method String Intent.getAction()>
	//*   6   12:invokevirtual   #115 <Method boolean String.equals(Object)>
	//*   7   15:ifeq            45
		{
			Intent intent1 = new Intent(CustomTabActivity.DESTROY_ACTION);
	//    8   18:new             #106 <Class Intent>
	//    9   21:dup             
	//   10   22:getstatic       #151 <Field String CustomTabActivity.DESTROY_ACTION>
	//   11   25:invokespecial   #152 <Method void Intent(String)>
	//   12   28:astore_2        
			LocalBroadcastManager.getInstance(((Context) (this))).sendBroadcast(intent1);
	//   13   29:aload_0         
	//   14   30:invokestatic    #76  <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #156 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   17   37:pop             
			sendResult(-1, intent);
	//   18   38:aload_0         
	//   19   39:iconst_m1       
	//   20   40:aload_1         
	//   21   41:invokespecial   #158 <Method void sendResult(int, Intent)>
			return;
	//   22   44:return          
		}
		if(CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION.equals(((Object) (intent.getAction()))))
	//*  23   45:getstatic       #100 <Field String CustomTabActivity.CUSTOM_TAB_REDIRECT_ACTION>
	//*  24   48:aload_1         
	//*  25   49:invokevirtual   #109 <Method String Intent.getAction()>
	//*  26   52:invokevirtual   #115 <Method boolean String.equals(Object)>
	//*  27   55:ifeq            64
			sendResult(-1, intent);
	//   28   58:aload_0         
	//   29   59:iconst_m1       
	//   30   60:aload_1         
	//   31   61:invokespecial   #158 <Method void sendResult(int, Intent)>
	//   32   64:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #161 <Method void Activity.onResume()>
		if(shouldCloseCustomTab)
	//*   2    4:aload_0         
	//*   3    5:getfield        #58  <Field boolean shouldCloseCustomTab>
	//*   4    8:ifeq            17
			sendResult(0, ((Intent) (null)));
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:aconst_null     
	//    8   14:invokespecial   #158 <Method void sendResult(int, Intent)>
		shouldCloseCustomTab = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #58  <Field boolean shouldCloseCustomTab>
	//   12   22:return          
	}

	public static final String EXTRA_CHROME_PACKAGE;
	public static final String EXTRA_PARAMS;
	public static final String EXTRA_URL;
	private static final String OAUTH_DIALOG = "oauth";
	public static final String REFRESH_ACTION;
	private BroadcastReceiver redirectReceiver;
	private boolean shouldCloseCustomTab;

	static 
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #22  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringBuilder()>
	//    3    7:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabMainActivity)).getSimpleName());
	//    4    8:aload_0         
	//    5    9:ldc1            #2   <Class CustomTabMainActivity>
	//    6   11:invokevirtual   #31  <Method String Class.getSimpleName()>
	//    7   14:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(".extra_params");
	//    9   18:aload_0         
	//   10   19:ldc1            #37  <String ".extra_params">
	//   11   21:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		EXTRA_PARAMS = stringbuilder.toString();
	//   13   25:aload_0         
	//   14   26:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   15   29:putstatic       #42  <Field String EXTRA_PARAMS>
		stringbuilder = new StringBuilder();
	//   16   32:new             #22  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #25  <Method void StringBuilder()>
	//   19   39:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabMainActivity)).getSimpleName());
	//   20   40:aload_0         
	//   21   41:ldc1            #2   <Class CustomTabMainActivity>
	//   22   43:invokevirtual   #31  <Method String Class.getSimpleName()>
	//   23   46:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		stringbuilder.append(".extra_chromePackage");
	//   25   50:aload_0         
	//   26   51:ldc1            #44  <String ".extra_chromePackage">
	//   27   53:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		EXTRA_CHROME_PACKAGE = stringbuilder.toString();
	//   29   57:aload_0         
	//   30   58:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   31   61:putstatic       #46  <Field String EXTRA_CHROME_PACKAGE>
		stringbuilder = new StringBuilder();
	//   32   64:new             #22  <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #25  <Method void StringBuilder()>
	//   35   71:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabMainActivity)).getSimpleName());
	//   36   72:aload_0         
	//   37   73:ldc1            #2   <Class CustomTabMainActivity>
	//   38   75:invokevirtual   #31  <Method String Class.getSimpleName()>
	//   39   78:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   40   81:pop             
		stringbuilder.append(".extra_url");
	//   41   82:aload_0         
	//   42   83:ldc1            #48  <String ".extra_url">
	//   43   85:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   44   88:pop             
		EXTRA_URL = stringbuilder.toString();
	//   45   89:aload_0         
	//   46   90:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   47   93:putstatic       #50  <Field String EXTRA_URL>
		stringbuilder = new StringBuilder();
	//   48   96:new             #22  <Class StringBuilder>
	//   49   99:dup             
	//   50  100:invokespecial   #25  <Method void StringBuilder()>
	//   51  103:astore_0        
		stringbuilder.append(((Class) (com/facebook/CustomTabMainActivity)).getSimpleName());
	//   52  104:aload_0         
	//   53  105:ldc1            #2   <Class CustomTabMainActivity>
	//   54  107:invokevirtual   #31  <Method String Class.getSimpleName()>
	//   55  110:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   56  113:pop             
		stringbuilder.append(".action_refresh");
	//   57  114:aload_0         
	//   58  115:ldc1            #52  <String ".action_refresh">
	//   59  117:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   60  120:pop             
		REFRESH_ACTION = stringbuilder.toString();
	//   61  121:aload_0         
	//   62  122:invokevirtual   #40  <Method String StringBuilder.toString()>
	//   63  125:putstatic       #54  <Field String REFRESH_ACTION>
	//*  64  128:return          
	}
}
