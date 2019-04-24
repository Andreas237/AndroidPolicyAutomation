// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.gigya.socialize.GSObject;

// Referenced classes of package com.gigya.socialize.android:
//			GSPluginFragment, GSWebBridge

class GSPluginFragment$2 extends WebViewClient
{

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		if(GSPluginFragment.access$800(GSPluginFragment.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field GSPluginFragment this$0>
	//*   2    4:invokestatic    #25  <Method boolean GSPluginFragment.access$800(GSPluginFragment)>
	//*   3    7:ifeq            21
			GSPluginFragment.access$100(GSPluginFragment.this).setVisibility(0);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field GSPluginFragment this$0>
	//    6   14:invokestatic    #29  <Method ProgressBar GSPluginFragment.access$100(GSPluginFragment)>
	//    7   17:iconst_0        
	//    8   18:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
	//    9   21:return          
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
		webview = ((WebView) (new GSObject()));
	//    0    0:new             #39  <Class GSObject>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void GSObject()>
	//    3    7:astore_1        
		((GSObject) (webview)).put("errorCode", 0x7a140);
	//    4    8:aload_1         
	//    5    9:ldc1            #42  <String "errorCode">
	//    6   11:ldc1            #43  <Int 0x7a140>
	//    7   13:invokevirtual   #47  <Method void GSObject.put(String, int)>
		s = ((String) (new StringBuilder()));
	//    8   16:new             #49  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #50  <Method void StringBuilder()>
	//   11   23:astore_3        
		((StringBuilder) (s)).append("Failed loading ");
	//   12   24:aload_3         
	//   13   25:ldc1            #52  <String "Failed loading ">
	//   14   27:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		((StringBuilder) (s)).append(s1);
	//   16   31:aload_3         
	//   17   32:aload           4
	//   18   34:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		((GSObject) (webview)).put("description", ((StringBuilder) (s)).toString());
	//   20   38:aload_1         
	//   21   39:ldc1            #58  <String "description">
	//   22   41:aload_3         
	//   23   42:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   24   45:invokevirtual   #65  <Method void GSObject.put(String, String)>
		((GSObject) (webview)).put("eventName", "error");
	//   25   48:aload_1         
	//   26   49:ldc1            #67  <String "eventName">
	//   27   51:ldc1            #69  <String "error">
	//   28   53:invokevirtual   #65  <Method void GSObject.put(String, String)>
		GSPluginFragment.access$700(GSPluginFragment.this, ((GSObject) (webview)));
	//   29   56:aload_0         
	//   30   57:getfield        #15  <Field GSPluginFragment this$0>
	//   31   60:aload_1         
	//   32   61:invokestatic    #73  <Method void GSPluginFragment.access$700(GSPluginFragment, GSObject)>
	//   33   64:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		Uri uri = Uri.parse(s);
	//    0    0:aload_2         
	//    1    1:invokestatic    #81  <Method Uri Uri.parse(String)>
	//    2    4:astore_3        
		if(uri.getScheme().equals("gsapi") && uri.getHost().equals("on_js_load_error"))
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #84  <Method String Uri.getScheme()>
	//*   5    9:ldc1            #86  <String "gsapi">
	//*   6   11:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*   7   14:ifeq            72
	//*   8   17:aload_3         
	//*   9   18:invokevirtual   #95  <Method String Uri.getHost()>
	//*  10   21:ldc1            #97  <String "on_js_load_error">
	//*  11   23:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  12   26:ifeq            72
		{
			webview = ((WebView) (new GSObject()));
	//   13   29:new             #39  <Class GSObject>
	//   14   32:dup             
	//   15   33:invokespecial   #40  <Method void GSObject()>
	//   16   36:astore_1        
			((GSObject) (webview)).put("errorCode", 0x7a140);
	//   17   37:aload_1         
	//   18   38:ldc1            #42  <String "errorCode">
	//   19   40:ldc1            #43  <Int 0x7a140>
	//   20   42:invokevirtual   #47  <Method void GSObject.put(String, int)>
			((GSObject) (webview)).put("description", "Failed loading socialize.js");
	//   21   45:aload_1         
	//   22   46:ldc1            #58  <String "description">
	//   23   48:ldc1            #99  <String "Failed loading socialize.js">
	//   24   50:invokevirtual   #65  <Method void GSObject.put(String, String)>
			((GSObject) (webview)).put("eventName", "error");
	//   25   53:aload_1         
	//   26   54:ldc1            #67  <String "eventName">
	//   27   56:ldc1            #69  <String "error">
	//   28   58:invokevirtual   #65  <Method void GSObject.put(String, String)>
			GSPluginFragment.access$700(GSPluginFragment.this, ((GSObject) (webview)));
	//   29   61:aload_0         
	//   30   62:getfield        #15  <Field GSPluginFragment this$0>
	//   31   65:aload_1         
	//   32   66:invokestatic    #73  <Method void GSPluginFragment.access$700(GSPluginFragment, GSObject)>
		} else
	//*  33   69:goto            198
		if(uri.getScheme().equals("gsapi") && uri.getHost().equals("on_js_exception"))
	//*  34   72:aload_3         
	//*  35   73:invokevirtual   #84  <Method String Uri.getScheme()>
	//*  36   76:ldc1            #86  <String "gsapi">
	//*  37   78:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  38   81:ifeq            171
	//*  39   84:aload_3         
	//*  40   85:invokevirtual   #95  <Method String Uri.getHost()>
	//*  41   88:ldc1            #101 <String "on_js_exception">
	//*  42   90:invokevirtual   #92  <Method boolean String.equals(Object)>
	//*  43   93:ifeq            171
		{
			webview = ((WebView) (new GSObject()));
	//   44   96:new             #39  <Class GSObject>
	//   45   99:dup             
	//   46  100:invokespecial   #40  <Method void GSObject()>
	//   47  103:astore_1        
			((GSObject) (webview)).parseQueryString(uri.getQuery());
	//   48  104:aload_1         
	//   49  105:aload_3         
	//   50  106:invokevirtual   #104 <Method String Uri.getQuery()>
	//   51  109:invokevirtual   #108 <Method void GSObject.parseQueryString(String)>
			webview = ((WebView) (((GSObject) (webview)).getString("ex", "")));
	//   52  112:aload_1         
	//   53  113:ldc1            #110 <String "ex">
	//   54  115:ldc1            #112 <String "">
	//   55  117:invokevirtual   #116 <Method String GSObject.getString(String, String)>
	//   56  120:astore_1        
			s = ((String) (new GSObject()));
	//   57  121:new             #39  <Class GSObject>
	//   58  124:dup             
	//   59  125:invokespecial   #40  <Method void GSObject()>
	//   60  128:astore_2        
			((GSObject) (s)).put("errorCode", 0x62e09);
	//   61  129:aload_2         
	//   62  130:ldc1            #42  <String "errorCode">
	//   63  132:ldc1            #117 <Int 0x62e09>
	//   64  134:invokevirtual   #47  <Method void GSObject.put(String, int)>
			((GSObject) (s)).put("description", "Javascript error while loading plugin. Please make sure the plugin name is correct.");
	//   65  137:aload_2         
	//   66  138:ldc1            #58  <String "description">
	//   67  140:ldc1            #119 <String "Javascript error while loading plugin. Please make sure the plugin name is correct.">
	//   68  142:invokevirtual   #65  <Method void GSObject.put(String, String)>
			((GSObject) (s)).put("jsError", ((String) (webview)));
	//   69  145:aload_2         
	//   70  146:ldc1            #121 <String "jsError">
	//   71  148:aload_1         
	//   72  149:invokevirtual   #65  <Method void GSObject.put(String, String)>
			((GSObject) (s)).put("eventName", "error");
	//   73  152:aload_2         
	//   74  153:ldc1            #67  <String "eventName">
	//   75  155:ldc1            #69  <String "error">
	//   76  157:invokevirtual   #65  <Method void GSObject.put(String, String)>
			GSPluginFragment.access$700(GSPluginFragment.this, ((GSObject) (s)));
	//   77  160:aload_0         
	//   78  161:getfield        #15  <Field GSPluginFragment this$0>
	//   79  164:aload_2         
	//   80  165:invokestatic    #73  <Method void GSPluginFragment.access$700(GSPluginFragment, GSObject)>
		} else
	//*  81  168:goto            198
		if(!GSWebBridge.handleUrl(webview, s))
	//*  82  171:aload_1         
	//*  83  172:aload_2         
	//*  84  173:invokestatic    #126 <Method boolean GSWebBridge.handleUrl(WebView, String)>
	//*  85  176:ifne            198
		{
			webview = ((WebView) (new Intent("android.intent.action.VIEW", uri)));
	//   86  179:new             #128 <Class Intent>
	//   87  182:dup             
	//   88  183:ldc1            #130 <String "android.intent.action.VIEW">
	//   89  185:aload_3         
	//   90  186:invokespecial   #133 <Method void Intent(String, Uri)>
	//   91  189:astore_1        
			startActivity(((Intent) (webview)));
	//   92  190:aload_0         
	//   93  191:getfield        #15  <Field GSPluginFragment this$0>
	//   94  194:aload_1         
	//   95  195:invokevirtual   #137 <Method void GSPluginFragment.startActivity(Intent)>
		}
		return true;
	//   96  198:iconst_1        
	//   97  199:ireturn         
	}

	final GSPluginFragment this$0;

	GSPluginFragment$2()
	{
		this$0 = GSPluginFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field GSPluginFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebViewClient()>
	//    5    9:return          
	}
}
