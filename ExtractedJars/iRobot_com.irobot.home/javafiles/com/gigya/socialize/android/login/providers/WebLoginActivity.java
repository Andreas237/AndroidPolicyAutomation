// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;

public class WebLoginActivity extends Activity
{
	protected static interface WebLoginActivityCallback
	{

		public abstract void onResponse(GSObject gsobject);
	}


	public WebLoginActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Activity()>
	//    2    4:return          
	}

	public static void setCallback(WebLoginActivityCallback webloginactivitycallback)
	{
		callback = webloginactivitycallback;
	//    0    0:aload_0         
	//    1    1:putstatic       #22  <Field WebLoginActivity$WebLoginActivityCallback callback>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void Activity.onCreate(Bundle)>
		justCreated = Boolean.valueOf(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokestatic    #32  <Method Boolean Boolean.valueOf(boolean)>
	//    6   10:putfield        #34  <Field Boolean justCreated>
		if(bundle == null && getIntent() != null && getIntent().getExtras() != null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       90
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #38  <Method Intent getIntent()>
	//*  11   21:ifnull          90
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #38  <Method Intent getIntent()>
	//*  14   28:invokevirtual   #44  <Method Bundle Intent.getExtras()>
	//*  15   31:ifnull          90
		{
			bundle = ((Bundle) (getIntent().getExtras().getString("url")));
	//   16   34:aload_0         
	//   17   35:invokevirtual   #38  <Method Intent getIntent()>
	//   18   38:invokevirtual   #44  <Method Bundle Intent.getExtras()>
	//   19   41:ldc1            #46  <String "url">
	//   20   43:invokevirtual   #52  <Method String Bundle.getString(String)>
	//   21   46:astore_1        
			if(bundle != null)
	//*  22   47:aload_1         
	//*  23   48:ifnull          86
			{
				loginUrl = Uri.parse(((String) (bundle)));
	//   24   51:aload_0         
	//   25   52:aload_1         
	//   26   53:invokestatic    #58  <Method Uri Uri.parse(String)>
	//   27   56:putfield        #60  <Field Uri loginUrl>
				bundle = ((Bundle) (new Intent("android.intent.action.VIEW", loginUrl)));
	//   28   59:new             #40  <Class Intent>
	//   29   62:dup             
	//   30   63:ldc1            #62  <String "android.intent.action.VIEW">
	//   31   65:aload_0         
	//   32   66:getfield        #60  <Field Uri loginUrl>
	//   33   69:invokespecial   #65  <Method void Intent(String, Uri)>
	//   34   72:astore_1        
				((Intent) (bundle)).setFlags(0x40000000);
	//   35   73:aload_1         
	//   36   74:ldc1            #66  <Int 0x40000000>
	//   37   76:invokevirtual   #70  <Method Intent Intent.setFlags(int)>
	//   38   79:pop             
				startActivity(((Intent) (bundle)));
	//   39   80:aload_0         
	//   40   81:aload_1         
	//   41   82:invokevirtual   #74  <Method void startActivity(Intent)>
				return;
	//   42   85:return          
			}
			finish();
	//   43   86:aload_0         
	//   44   87:invokevirtual   #77  <Method void finish()>
		}
	//   45   90:return          
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #80  <Method void Activity.onNewIntent(Intent)>
		String s = GSAPI.getInstance().getContext().getPackageName();
	//    3    5:invokestatic    #86  <Method GSAPI GSAPI.getInstance()>
	//    4    8:invokevirtual   #90  <Method Context GSAPI.getContext()>
	//    5   11:invokevirtual   #96  <Method String Context.getPackageName()>
	//    6   14:astore_2        
		intent = ((Intent) (intent.getData()));
	//    7   15:aload_1         
	//    8   16:invokevirtual   #100 <Method Uri Intent.getData()>
	//    9   19:astore_1        
		if(intent != null && ((Uri) (intent)).getScheme().equals(((Object) (s))) && ((Uri) (intent)).getHost().equals("gsapi") && callback != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          82
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #103 <Method String Uri.getScheme()>
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #109 <Method boolean String.equals(Object)>
	//*  16   32:ifeq            82
	//*  17   35:aload_1         
	//*  18   36:invokevirtual   #112 <Method String Uri.getHost()>
	//*  19   39:ldc1            #114 <String "gsapi">
	//*  20   41:invokevirtual   #109 <Method boolean String.equals(Object)>
	//*  21   44:ifeq            82
	//*  22   47:getstatic       #22  <Field WebLoginActivity$WebLoginActivityCallback callback>
	//*  23   50:ifnull          82
		{
			GSObject gsobject = new GSObject();
	//   24   53:new             #116 <Class GSObject>
	//   25   56:dup             
	//   26   57:invokespecial   #117 <Method void GSObject()>
	//   27   60:astore_2        
			gsobject.parseQueryString(((Uri) (intent)).getEncodedFragment());
	//   28   61:aload_2         
	//   29   62:aload_1         
	//   30   63:invokevirtual   #120 <Method String Uri.getEncodedFragment()>
	//   31   66:invokevirtual   #124 <Method void GSObject.parseQueryString(String)>
			callback.onResponse(gsobject);
	//   32   69:getstatic       #22  <Field WebLoginActivity$WebLoginActivityCallback callback>
	//   33   72:aload_2         
	//   34   73:invokeinterface #128 <Method void WebLoginActivity$WebLoginActivityCallback.onResponse(GSObject)>
			finish();
	//   35   78:aload_0         
	//   36   79:invokevirtual   #77  <Method void finish()>
		}
	//   37   82:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void Activity.onResume()>
		if(!justCreated.booleanValue())
	//*   2    4:aload_0         
	//*   3    5:getfield        #34  <Field Boolean justCreated>
	//*   4    8:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//*   5   11:ifne            58
		{
			if(callback != null)
	//*   6   14:getstatic       #22  <Field WebLoginActivity$WebLoginActivityCallback callback>
	//*   7   17:ifnull          53
			{
				GSObject gsobject = new GSObject();
	//    8   20:new             #116 <Class GSObject>
	//    9   23:dup             
	//   10   24:invokespecial   #117 <Method void GSObject()>
	//   11   27:astore_1        
				gsobject.put("errorCode", 0x30d41);
	//   12   28:aload_1         
	//   13   29:ldc1            #137 <String "errorCode">
	//   14   31:ldc1            #138 <Int 0x30d41>
	//   15   33:invokevirtual   #142 <Method void GSObject.put(String, int)>
				gsobject.put("errorMessage", "Login process did not complete");
	//   16   36:aload_1         
	//   17   37:ldc1            #144 <String "errorMessage">
	//   18   39:ldc1            #146 <String "Login process did not complete">
	//   19   41:invokevirtual   #149 <Method void GSObject.put(String, String)>
				callback.onResponse(gsobject);
	//   20   44:getstatic       #22  <Field WebLoginActivity$WebLoginActivityCallback callback>
	//   21   47:aload_1         
	//   22   48:invokeinterface #128 <Method void WebLoginActivity$WebLoginActivityCallback.onResponse(GSObject)>
			}
			finish();
	//   23   53:aload_0         
	//   24   54:invokevirtual   #77  <Method void finish()>
			return;
	//   25   57:return          
		} else
		{
			justCreated = Boolean.valueOf(false);
	//   26   58:aload_0         
	//   27   59:iconst_0        
	//   28   60:invokestatic    #32  <Method Boolean Boolean.valueOf(boolean)>
	//   29   63:putfield        #34  <Field Boolean justCreated>
			return;
	//   30   66:return          
		}
	}

	protected static WebLoginActivityCallback callback;
	private Boolean justCreated;
	private Uri loginUrl;
}
