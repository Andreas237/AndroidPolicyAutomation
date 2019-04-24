// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.content.*;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.webkit.*;
import com.irobot.home.util.j;
import com.irobot.home.view.WebViewLanguageCompat;

// Referenced classes of package com.irobot.home:
//			BasePushNotificationActivity

public class WebViewActivity extends BasePushNotificationActivity
{

	public WebViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void BasePushNotificationActivity()>
		c = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean c>
	//    5    9:return          
	}

	void e()
	{
		if(!c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean c>
	//*   2    4:ifne            12
		{
			f();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #27  <Method void f()>
			return;
	//    5   11:return          
		} else
		{
			g();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #30  <Method void g()>
			return;
	//    8   16:return          
		}
	}

	public void f()
	{
		WifiInfo wifiinfo = ((WifiManager)getApplicationContext().getSystemService("wifi")).getConnectionInfo();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method Context getApplicationContext()>
	//    2    4:ldc1            #36  <String "wifi">
	//    3    6:invokevirtual   #42  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #44  <Class WifiManager>
	//    5   12:invokevirtual   #48  <Method WifiInfo WifiManager.getConnectionInfo()>
	//    6   15:astore_1        
		if(j.a() && !j.j(wifiinfo.getSSID()))
	//*   7   16:invokestatic    #53  <Method boolean j.a()>
	//*   8   19:ifeq            37
	//*   9   22:aload_1         
	//*  10   23:invokevirtual   #59  <Method String WifiInfo.getSSID()>
	//*  11   26:invokestatic    #63  <Method boolean j.j(String)>
	//*  12   29:ifne            37
		{
			g();
	//   13   32:aload_0         
	//   14   33:invokevirtual   #30  <Method void g()>
			return;
	//   15   36:return          
		} else
		{
			h();
	//   16   37:aload_0         
	//   17   38:invokevirtual   #66  <Method void h()>
			return;
	//   18   41:return          
		}
	}

	public void g()
	{
		a.setWebViewClient(((WebViewClient) (new WebViewClient() {

			public boolean shouldOverrideUrlLoading(WebView webview, String s1)
			{
				if(Uri.parse(s1).getScheme().equals("market"))
			//*   0    0:aload_2         
			//*   1    1:invokestatic    #28  <Method Uri Uri.parse(String)>
			//*   2    4:invokevirtual   #32  <Method String Uri.getScheme()>
			//*   3    7:ldc1            #34  <String "market">
			//*   4    9:invokevirtual   #40  <Method boolean String.equals(Object)>
			//*   5   12:ifeq            47
				{
					try
					{
						Intent intent = new Intent("android.intent.action.VIEW");
			//    6   15:new             #42  <Class Intent>
			//    7   18:dup             
			//    8   19:ldc1            #44  <String "android.intent.action.VIEW">
			//    9   21:invokespecial   #47  <Method void Intent(String)>
			//   10   24:astore_3        
						intent.setData(Uri.parse(s1));
			//   11   25:aload_3         
			//   12   26:aload_2         
			//   13   27:invokestatic    #28  <Method Uri Uri.parse(String)>
			//   14   30:invokevirtual   #51  <Method Intent Intent.setData(Uri)>
			//   15   33:pop             
						((Activity)webview.getContext()).startActivity(intent);
			//   16   34:aload_1         
			//   17   35:invokevirtual   #57  <Method Context WebView.getContext()>
			//   18   38:checkcast       #59  <Class Activity>
			//   19   41:aload_3         
			//   20   42:invokevirtual   #63  <Method void Activity.startActivity(Intent)>
					}
			//*  21   45:iconst_1        
			//*  22   46:ireturn         
			//*  23   47:iconst_0        
			//*  24   48:ireturn         
					// Misplaced declaration of an exception variable
					catch(WebView webview)
			//*  25   49:astore_1        
					{
						return false;
			//   26   50:iconst_0        
			//   27   51:ireturn         
					}
					return true;
				} else
				{
					return false;
				}
			}

			final WebViewActivity a;

			
			{
				a = WebViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WebViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void WebViewClient()>
			//    5    9:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field WebViewLanguageCompat a>
	//    2    4:new             #6   <Class WebViewActivity$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #71  <Method void WebViewActivity$1(WebViewActivity)>
	//    6   12:invokevirtual   #77  <Method void WebViewLanguageCompat.setWebViewClient(WebViewClient)>
		a.getSettings().setJavaScriptEnabled(true);
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field WebViewLanguageCompat a>
	//    9   19:invokevirtual   #81  <Method WebSettings WebViewLanguageCompat.getSettings()>
	//   10   22:iconst_1        
	//   11   23:invokevirtual   #87  <Method void WebSettings.setJavaScriptEnabled(boolean)>
		a.getSettings().setLoadWithOverviewMode(true);
	//   12   26:aload_0         
	//   13   27:getfield        #68  <Field WebViewLanguageCompat a>
	//   14   30:invokevirtual   #81  <Method WebSettings WebViewLanguageCompat.getSettings()>
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #90  <Method void WebSettings.setLoadWithOverviewMode(boolean)>
		a.getSettings().setUseWideViewPort(true);
	//   17   37:aload_0         
	//   18   38:getfield        #68  <Field WebViewLanguageCompat a>
	//   19   41:invokevirtual   #81  <Method WebSettings WebViewLanguageCompat.getSettings()>
	//   20   44:iconst_1        
	//   21   45:invokevirtual   #93  <Method void WebSettings.setUseWideViewPort(boolean)>
		a.getSettings().setBuiltInZoomControls(true);
	//   22   48:aload_0         
	//   23   49:getfield        #68  <Field WebViewLanguageCompat a>
	//   24   52:invokevirtual   #81  <Method WebSettings WebViewLanguageCompat.getSettings()>
	//   25   55:iconst_1        
	//   26   56:invokevirtual   #96  <Method void WebSettings.setBuiltInZoomControls(boolean)>
		String as[] = "3.4.1-release".split("-");
	//   27   59:ldc1            #98  <String "3.4.1-release">
	//   28   61:ldc1            #100 <String "-">
	//   29   63:invokevirtual   #106 <Method String[] String.split(String)>
	//   30   66:astore_1        
		Object obj;
		if(as != null && as.length > 1)
	//*  31   67:aload_1         
	//*  32   68:ifnull          84
	//*  33   71:aload_1         
	//*  34   72:arraylength     
	//*  35   73:iconst_1        
	//*  36   74:icmple          84
			obj = ((Object) (as[0]));
	//   37   77:aload_1         
	//   38   78:iconst_0        
	//   39   79:aaload          
	//   40   80:astore_1        
		else
	//*  41   81:goto            87
			obj = "0.0.0";
	//   42   84:ldc1            #108 <String "0.0.0">
	//   43   86:astore_1        
		obj = ((Object) (String.format(" iRbt/%s (UserType=HomeApp)", new Object[] {
			obj
		})));
	//   44   87:ldc1            #110 <String " iRbt/%s (UserType=HomeApp)">
	//   45   89:iconst_1        
	//   46   90:anewarray       Object[]
	//   47   93:dup             
	//   48   94:iconst_0        
	//   49   95:aload_1         
	//   50   96:aastore         
	//   51   97:invokestatic    #116 <Method String String.format(String, Object[])>
	//   52  100:astore_1        
		WebSettings websettings = a.getSettings();
	//   53  101:aload_0         
	//   54  102:getfield        #68  <Field WebViewLanguageCompat a>
	//   55  105:invokevirtual   #81  <Method WebSettings WebViewLanguageCompat.getSettings()>
	//   56  108:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   57  109:new             #118 <Class StringBuilder>
	//   58  112:dup             
	//   59  113:invokespecial   #119 <Method void StringBuilder()>
	//   60  116:astore_3        
		stringbuilder.append(a.getSettings().getUserAgentString());
	//   61  117:aload_3         
	//   62  118:aload_0         
	//   63  119:getfield        #68  <Field WebViewLanguageCompat a>
	//   64  122:invokevirtual   #81  <Method WebSettings WebViewLanguageCompat.getSettings()>
	//   65  125:invokevirtual   #122 <Method String WebSettings.getUserAgentString()>
	//   66  128:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   67  131:pop             
		stringbuilder.append(((String) (obj)));
	//   68  132:aload_3         
	//   69  133:aload_1         
	//   70  134:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
		websettings.setUserAgentString(stringbuilder.toString());
	//   72  138:aload_2         
	//   73  139:aload_3         
	//   74  140:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   75  143:invokevirtual   #133 <Method void WebSettings.setUserAgentString(String)>
		obj = ((Object) (CookieManager.getInstance()));
	//   76  146:invokestatic    #139 <Method CookieManager CookieManager.getInstance()>
	//   77  149:astore_1        
		((CookieManager) (obj)).setAcceptCookie(true);
	//   78  150:aload_1         
	//   79  151:iconst_1        
	//   80  152:invokevirtual   #142 <Method void CookieManager.setAcceptCookie(boolean)>
		if(j.i(b))
	//*  81  155:aload_0         
	//*  82  156:getfield        #144 <Field String b>
	//*  83  159:invokestatic    #147 <Method boolean j.i(String)>
	//*  84  162:ifeq            193
		{
			String s = j.s(b);
	//   85  165:aload_0         
	//   86  166:getfield        #144 <Field String b>
	//   87  169:invokestatic    #151 <Method String j.s(String)>
	//   88  172:astore_2        
			if(s != null)
	//*  89  173:aload_2         
	//*  90  174:ifnull          193
			{
				((CookieManager) (obj)).setCookie(j.t(b), s);
	//   91  177:aload_1         
	//   92  178:aload_0         
	//   93  179:getfield        #144 <Field String b>
	//   94  182:invokestatic    #154 <Method String j.t(String)>
	//   95  185:aload_2         
	//   96  186:invokevirtual   #158 <Method void CookieManager.setCookie(String, String)>
				((CookieManager) (obj)).flush();
	//   97  189:aload_1         
	//   98  190:invokevirtual   #161 <Method void CookieManager.flush()>
			}
		}
		a.loadUrl(b);
	//   99  193:aload_0         
	//  100  194:getfield        #68  <Field WebViewLanguageCompat a>
	//  101  197:aload_0         
	//  102  198:getfield        #144 <Field String b>
	//  103  201:invokevirtual   #164 <Method void WebViewLanguageCompat.loadUrl(String)>
	//  104  204:return          
	}

	public void h()
	{
		(new android.app.AlertDialog.Builder(((Context) (this)))).setMessage(0x7f0f04db).setPositiveButton(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				a.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WebViewActivity a>
			//    2    4:invokevirtual   #25  <Method void WebViewActivity.finish()>
			//    3    7:return          
			}

			final WebViewActivity a;

			
			{
				a = WebViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    0    0:new             #166 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #169 <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:ldc1            #170 <Int 0x7f0f04db>
	//    5   10:invokevirtual   #174 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//    6   13:ldc1            #175 <Int 0x7f0f05bb>
	//    7   15:new             #8   <Class WebViewActivity$2>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #176 <Method void WebViewActivity$2(WebViewActivity)>
	//   11   23:invokevirtual   #180 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   12   26:invokevirtual   #184 <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   13   29:pop             
	//   14   30:return          
	}

	public void onBackPressed()
	{
		if(a.canGoBack())
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field WebViewLanguageCompat a>
	//*   2    4:invokevirtual   #188 <Method boolean WebViewLanguageCompat.canGoBack()>
	//*   3    7:ifeq            18
		{
			a.goBack();
	//    4   10:aload_0         
	//    5   11:getfield        #68  <Field WebViewLanguageCompat a>
	//    6   14:invokevirtual   #191 <Method void WebViewLanguageCompat.goBack()>
			return;
	//    7   17:return          
		} else
		{
			super.onBackPressed();
	//    8   18:aload_0         
	//    9   19:invokespecial   #193 <Method void BasePushNotificationActivity.onBackPressed()>
			return;
	//   10   22:return          
		}
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #196 <Method void BasePushNotificationActivity.onPause()>
		a.onPause();
	//    2    4:aload_0         
	//    3    5:getfield        #68  <Field WebViewLanguageCompat a>
	//    4    8:invokevirtual   #197 <Method void WebViewLanguageCompat.onPause()>
	//    5   11:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #200 <Method void BasePushNotificationActivity.onPostResume()>
		int i;
		if(d != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #202 <Field Integer d>
	//*   4    8:ifnull          22
			i = d.intValue();
	//    5   11:aload_0         
	//    6   12:getfield        #202 <Field Integer d>
	//    7   15:invokevirtual   #208 <Method int Integer.intValue()>
	//    8   18:istore_1        
		else
	//*   9   19:goto            25
			i = 0x7f0f01ff;
	//   10   22:ldc1            #209 <Int 0x7f0f01ff>
	//   11   24:istore_1        
		b(i);
	//   12   25:aload_0         
	//   13   26:iload_1         
	//   14   27:invokevirtual   #212 <Method void b(int)>
	//   15   30:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #215 <Method void BasePushNotificationActivity.onResume()>
		a.onResume();
	//    2    4:aload_0         
	//    3    5:getfield        #68  <Field WebViewLanguageCompat a>
	//    4    8:invokevirtual   #216 <Method void WebViewLanguageCompat.onResume()>
	//    5   11:return          
	}

	WebViewLanguageCompat a;
	String b;
	boolean c;
	Integer d;
}
