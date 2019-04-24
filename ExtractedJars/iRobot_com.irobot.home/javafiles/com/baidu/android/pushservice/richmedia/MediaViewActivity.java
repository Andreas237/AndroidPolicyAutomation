// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.richmedia;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.*;
import android.widget.RelativeLayout;
import com.baidu.android.pushservice.e.a;

public class MediaViewActivity extends Activity
{

	public MediaViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Activity()>
		c = ((WebChromeClient) (new WebChromeClient() {

			public void onHideCustomView()
			{
			//    0    0:return          
			}

			public void onProgressChanged(WebView webview, int i)
			{
			//    0    0:return          
			}

			public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
			{
			//    0    0:return          
			}

			final MediaViewActivity a;

			
			{
				a = MediaViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MediaViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void WebChromeClient()>
			//    5    9:return          
			}
		}
));
	//    2    4:aload_0         
	//    3    5:new             #6   <Class MediaViewActivity$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #23  <Method void MediaViewActivity$1(MediaViewActivity)>
	//    7   13:putfield        #25  <Field WebChromeClient c>
		d = ((WebViewClient) (new WebViewClient() {

			public void onPageFinished(WebView webview, String s)
			{
				super.onPageFinished(webview, s);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #20  <Method void WebViewClient.onPageFinished(WebView, String)>
			//    4    6:return          
			}

			public void onPageStarted(WebView webview, String s, Bitmap bitmap)
			{
				super.onPageStarted(webview, s, bitmap);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:invokespecial   #24  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
			//    5    7:return          
			}

			public boolean shouldOverrideUrlLoading(WebView webview, String s)
			{
				if(!s.startsWith("tel:")) goto _L2; else goto _L1
			//    0    0:aload_2         
			//    1    1:ldc1            #30  <String "tel:">
			//    2    3:invokevirtual   #36  <Method boolean String.startsWith(String)>
			//    3    6:ifeq            108
_L1:
				Intent intent = new Intent("android.intent.action.DIAL");
			//    4    9:new             #38  <Class Intent>
			//    5   12:dup             
			//    6   13:ldc1            #40  <String "android.intent.action.DIAL">
			//    7   15:invokespecial   #43  <Method void Intent(String)>
			//    8   18:astore          4
				intent.setData(Uri.parse(s));
			//    9   20:aload           4
			//   10   22:aload_2         
			//   11   23:invokestatic    #49  <Method Uri Uri.parse(String)>
			//   12   26:invokevirtual   #53  <Method Intent Intent.setData(Uri)>
			//   13   29:pop             
				a.startActivity(intent);
			//   14   30:aload_0         
			//   15   31:getfield        #12  <Field MediaViewActivity a>
			//   16   34:aload           4
			//   17   36:invokevirtual   #57  <Method void MediaViewActivity.startActivity(Intent)>
				  goto _L3
			//*  18   39:goto            430
				ActivityNotFoundException activitynotfoundexception;
				activitynotfoundexception;
			//   19   42:astore          4
				Object obj;
				Object obj1;
				obj = ((Object) (new StringBuilder()));
			//   20   44:new             #59  <Class StringBuilder>
			//   21   47:dup             
			//   22   48:invokespecial   #60  <Method void StringBuilder()>
			//   23   51:astore          5
				obj1 = "Error dialing ";
			//   24   53:ldc1            #62  <String "Error dialing ">
			//   25   55:astore          6
_L6:
				((StringBuilder) (obj)).append(((String) (obj1)));
			//   26   57:aload           5
			//   27   59:aload           6
			//   28   61:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//   29   64:pop             
				((StringBuilder) (obj)).append(s);
			//   30   65:aload           5
			//   31   67:aload_2         
			//   32   68:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//   33   71:pop             
				obj1 = ": ";
			//   34   72:ldc1            #68  <String ": ">
			//   35   74:astore          6
_L4:
				((StringBuilder) (obj)).append(((String) (obj1)));
			//   36   76:aload           5
			//   37   78:aload           6
			//   38   80:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//   39   83:pop             
				((StringBuilder) (obj)).append(activitynotfoundexception.toString());
			//   40   84:aload           5
			//   41   86:aload           4
			//   42   88:invokevirtual   #72  <Method String ActivityNotFoundException.toString()>
			//   43   91:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//   44   94:pop             
				com.baidu.android.pushservice.e.a.e("MediaViewActivity", ((StringBuilder) (obj)).toString());
			//   45   95:ldc1            #74  <String "MediaViewActivity">
			//   46   97:aload           5
			//   47   99:invokevirtual   #75  <Method String StringBuilder.toString()>
			//   48  102:invokestatic    #81  <Method void a.e(String, String)>
				break; /* Loop/switch isn't completed */
			//   49  105:goto            430
_L2:
				if(s.startsWith("geo:"))
			//*  50  108:aload_2         
			//*  51  109:ldc1            #83  <String "geo:">
			//*  52  111:invokevirtual   #36  <Method boolean String.startsWith(String)>
			//*  53  114:ifeq            168
				{
					try
					{
						Intent intent1 = new Intent("android.intent.action.VIEW");
			//   54  117:new             #38  <Class Intent>
			//   55  120:dup             
			//   56  121:ldc1            #85  <String "android.intent.action.VIEW">
			//   57  123:invokespecial   #43  <Method void Intent(String)>
			//   58  126:astore          4
						intent1.setData(Uri.parse(s));
			//   59  128:aload           4
			//   60  130:aload_2         
			//   61  131:invokestatic    #49  <Method Uri Uri.parse(String)>
			//   62  134:invokevirtual   #53  <Method Intent Intent.setData(Uri)>
			//   63  137:pop             
						a.startActivity(intent1);
			//   64  138:aload_0         
			//   65  139:getfield        #12  <Field MediaViewActivity a>
			//   66  142:aload           4
			//   67  144:invokevirtual   #57  <Method void MediaViewActivity.startActivity(Intent)>
						break; /* Loop/switch isn't completed */
			//   68  147:goto            430
					}
					// Misplaced declaration of an exception variable
					catch(Intent intent1)
			//*  69  150:astore          4
					{
						obj = ((Object) (new StringBuilder()));
			//   70  152:new             #59  <Class StringBuilder>
			//   71  155:dup             
			//   72  156:invokespecial   #60  <Method void StringBuilder()>
			//   73  159:astore          5
						obj1 = "Error showing map ";
			//   74  161:ldc1            #87  <String "Error showing map ">
			//   75  163:astore          6
					}
					continue; /* Loop/switch isn't completed */
			//   76  165:goto            57
				}
				if(s.startsWith("mailto:"))
			//*  77  168:aload_2         
			//*  78  169:ldc1            #89  <String "mailto:">
			//*  79  171:invokevirtual   #36  <Method boolean String.startsWith(String)>
			//*  80  174:ifeq            228
				{
					try
					{
						Intent intent2 = new Intent("android.intent.action.VIEW");
			//   81  177:new             #38  <Class Intent>
			//   82  180:dup             
			//   83  181:ldc1            #85  <String "android.intent.action.VIEW">
			//   84  183:invokespecial   #43  <Method void Intent(String)>
			//   85  186:astore          4
						intent2.setData(Uri.parse(s));
			//   86  188:aload           4
			//   87  190:aload_2         
			//   88  191:invokestatic    #49  <Method Uri Uri.parse(String)>
			//   89  194:invokevirtual   #53  <Method Intent Intent.setData(Uri)>
			//   90  197:pop             
						a.startActivity(intent2);
			//   91  198:aload_0         
			//   92  199:getfield        #12  <Field MediaViewActivity a>
			//   93  202:aload           4
			//   94  204:invokevirtual   #57  <Method void MediaViewActivity.startActivity(Intent)>
						break; /* Loop/switch isn't completed */
			//   95  207:goto            430
					}
					// Misplaced declaration of an exception variable
					catch(Intent intent2)
			//*  96  210:astore          4
					{
						obj = ((Object) (new StringBuilder()));
			//   97  212:new             #59  <Class StringBuilder>
			//   98  215:dup             
			//   99  216:invokespecial   #60  <Method void StringBuilder()>
			//  100  219:astore          5
						obj1 = "Error sending email ";
			//  101  221:ldc1            #91  <String "Error sending email ">
			//  102  223:astore          6
					}
					continue; /* Loop/switch isn't completed */
			//  103  225:goto            57
				}
				if(!s.startsWith("sms:"))
					break; /* Loop/switch isn't completed */
			//  104  228:aload_2         
			//  105  229:ldc1            #93  <String "sms:">
			//  106  231:invokevirtual   #36  <Method boolean String.startsWith(String)>
			//  107  234:ifeq            430
				int i;
				obj1 = ((Object) (new Intent("android.intent.action.VIEW")));
			//  108  237:new             #38  <Class Intent>
			//  109  240:dup             
			//  110  241:ldc1            #85  <String "android.intent.action.VIEW">
			//  111  243:invokespecial   #43  <Method void Intent(String)>
			//  112  246:astore          6
				i = s.indexOf('?');
			//  113  248:aload_2         
			//  114  249:bipush          63
			//  115  251:invokevirtual   #97  <Method int String.indexOf(int)>
			//  116  254:istore_3        
				if(i != -1)
					break MISSING_BLOCK_LABEL_270;
			//  117  255:iload_3         
			//  118  256:iconst_m1       
			//  119  257:icmpne          270
				String s1;
				s1 = s.substring(4);
			//  120  260:aload_2         
			//  121  261:iconst_4        
			//  122  262:invokevirtual   #101 <Method String String.substring(int)>
			//  123  265:astore          4
				break MISSING_BLOCK_LABEL_328;
			//  124  267:goto            328
				String s2;
				obj = ((Object) (s.substring(4, i)));
			//  125  270:aload_2         
			//  126  271:iconst_4        
			//  127  272:iload_3         
			//  128  273:invokevirtual   #104 <Method String String.substring(int, int)>
			//  129  276:astore          5
				s2 = Uri.parse(s).getQuery();
			//  130  278:aload_2         
			//  131  279:invokestatic    #49  <Method Uri Uri.parse(String)>
			//  132  282:invokevirtual   #107 <Method String Uri.getQuery()>
			//  133  285:astore          7
				s1 = ((String) (obj));
			//  134  287:aload           5
			//  135  289:astore          4
				if(s2 == null)
					break MISSING_BLOCK_LABEL_328;
			//  136  291:aload           7
			//  137  293:ifnull          328
				s1 = ((String) (obj));
			//  138  296:aload           5
			//  139  298:astore          4
				if(!s2.startsWith("body="))
					break MISSING_BLOCK_LABEL_328;
			//  140  300:aload           7
			//  141  302:ldc1            #109 <String "body=">
			//  142  304:invokevirtual   #36  <Method boolean String.startsWith(String)>
			//  143  307:ifeq            328
				((Intent) (obj1)).putExtra("sms_body", s2.substring(5));
			//  144  310:aload           6
			//  145  312:ldc1            #111 <String "sms_body">
			//  146  314:aload           7
			//  147  316:iconst_5        
			//  148  317:invokevirtual   #101 <Method String String.substring(int)>
			//  149  320:invokevirtual   #115 <Method Intent Intent.putExtra(String, String)>
			//  150  323:pop             
				s1 = ((String) (obj));
			//  151  324:aload           5
			//  152  326:astore          4
				try
				{
					obj = ((Object) (new StringBuilder()));
			//  153  328:new             #59  <Class StringBuilder>
			//  154  331:dup             
			//  155  332:invokespecial   #60  <Method void StringBuilder()>
			//  156  335:astore          5
					((StringBuilder) (obj)).append("sms:");
			//  157  337:aload           5
			//  158  339:ldc1            #93  <String "sms:">
			//  159  341:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//  160  344:pop             
					((StringBuilder) (obj)).append(s1);
			//  161  345:aload           5
			//  162  347:aload           4
			//  163  349:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//  164  352:pop             
					((Intent) (obj1)).setData(Uri.parse(((StringBuilder) (obj)).toString()));
			//  165  353:aload           6
			//  166  355:aload           5
			//  167  357:invokevirtual   #75  <Method String StringBuilder.toString()>
			//  168  360:invokestatic    #49  <Method Uri Uri.parse(String)>
			//  169  363:invokevirtual   #53  <Method Intent Intent.setData(Uri)>
			//  170  366:pop             
					((Intent) (obj1)).putExtra("address", s1);
			//  171  367:aload           6
			//  172  369:ldc1            #117 <String "address">
			//  173  371:aload           4
			//  174  373:invokevirtual   #115 <Method Intent Intent.putExtra(String, String)>
			//  175  376:pop             
					((Intent) (obj1)).setType("vnd.android-dir/mms-sms");
			//  176  377:aload           6
			//  177  379:ldc1            #119 <String "vnd.android-dir/mms-sms">
			//  178  381:invokevirtual   #123 <Method Intent Intent.setType(String)>
			//  179  384:pop             
					a.startActivity(((Intent) (obj1)));
			//  180  385:aload_0         
			//  181  386:getfield        #12  <Field MediaViewActivity a>
			//  182  389:aload           6
			//  183  391:invokevirtual   #57  <Method void MediaViewActivity.startActivity(Intent)>
					break; /* Loop/switch isn't completed */
			//  184  394:goto            430
				}
				// Misplaced declaration of an exception variable
				catch(String s1)
			//* 185  397:astore          4
				{
					obj = ((Object) (new StringBuilder()));
			//  186  399:new             #59  <Class StringBuilder>
			//  187  402:dup             
			//  188  403:invokespecial   #60  <Method void StringBuilder()>
			//  189  406:astore          5
					((StringBuilder) (obj)).append("Error sending sms ");
			//  190  408:aload           5
			//  191  410:ldc1            #125 <String "Error sending sms ">
			//  192  412:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//  193  415:pop             
					((StringBuilder) (obj)).append(s);
			//  194  416:aload           5
			//  195  418:aload_2         
			//  196  419:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//  197  422:pop             
					obj1 = ":";
			//  198  423:ldc1            #127 <String ":">
			//  199  425:astore          6
				}
				if(true) goto _L4; else goto _L3
			//  200  427:goto            76
_L3:
				if(android.os.Build.VERSION.SDK_INT > 17)
			//* 201  430:getstatic       #133 <Field int android.os.Build$VERSION.SDK_INT>
			//* 202  433:bipush          17
			//* 203  435:icmple          507
					try
					{
						webview = ((WebView) (new Intent("android.intent.action.VIEW")));
			//  204  438:new             #38  <Class Intent>
			//  205  441:dup             
			//  206  442:ldc1            #85  <String "android.intent.action.VIEW">
			//  207  444:invokespecial   #43  <Method void Intent(String)>
			//  208  447:astore_1        
						((Intent) (webview)).setData(Uri.parse(s));
			//  209  448:aload_1         
			//  210  449:aload_2         
			//  211  450:invokestatic    #49  <Method Uri Uri.parse(String)>
			//  212  453:invokevirtual   #53  <Method Intent Intent.setData(Uri)>
			//  213  456:pop             
						a.startActivity(((Intent) (webview)));
			//  214  457:aload_0         
			//  215  458:getfield        #12  <Field MediaViewActivity a>
			//  216  461:aload_1         
			//  217  462:invokevirtual   #57  <Method void MediaViewActivity.startActivity(Intent)>
					}
			//* 218  465:goto            512
					// Misplaced declaration of an exception variable
					catch(WebView webview)
			//* 219  468:astore_1        
					{
						StringBuilder stringbuilder = new StringBuilder();
			//  220  469:new             #59  <Class StringBuilder>
			//  221  472:dup             
			//  222  473:invokespecial   #60  <Method void StringBuilder()>
			//  223  476:astore          4
						stringbuilder.append("Error loading url ");
			//  224  478:aload           4
			//  225  480:ldc1            #135 <String "Error loading url ">
			//  226  482:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//  227  485:pop             
						stringbuilder.append(s);
			//  228  486:aload           4
			//  229  488:aload_2         
			//  230  489:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//  231  492:pop             
						com.baidu.android.pushservice.e.a.a("MediaViewActivity", stringbuilder.toString(), ((Throwable) (webview)));
			//  232  493:ldc1            #74  <String "MediaViewActivity">
			//  233  495:aload           4
			//  234  497:invokevirtual   #75  <Method String StringBuilder.toString()>
			//  235  500:aload_1         
			//  236  501:invokestatic    #138 <Method void a.a(String, String, Throwable)>
					}
				else
			//* 237  504:goto            512
					webview.loadUrl(s);
			//  238  507:aload_1         
			//  239  508:aload_2         
			//  240  509:invokevirtual   #143 <Method void WebView.loadUrl(String)>
				return true;
			//  241  512:iconst_1        
			//  242  513:ireturn         
				if(true) goto _L6; else goto _L5
_L5:
			}

			final MediaViewActivity a;

			
			{
				a = MediaViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field MediaViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void WebViewClient()>
			//    5    9:return          
			}
		}
));
	//    8   16:aload_0         
	//    9   17:new             #8   <Class MediaViewActivity$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #26  <Method void MediaViewActivity$2(MediaViewActivity)>
	//   13   25:putfield        #28  <Field WebViewClient d>
	//   14   28:return          
	}

	private void a()
	{
		a.removeJavascriptInterface("searchBoxJavaBridge_");
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field WebView a>
	//    2    4:ldc1            #36  <String "searchBoxJavaBridge_">
	//    3    6:invokevirtual   #42  <Method void WebView.removeJavascriptInterface(String)>
		a.removeJavascriptInterface("accessibility");
	//    4    9:aload_0         
	//    5   10:getfield        #34  <Field WebView a>
	//    6   13:ldc1            #44  <String "accessibility">
	//    7   15:invokevirtual   #42  <Method void WebView.removeJavascriptInterface(String)>
		a.removeJavascriptInterface("accessibilityTraversal");
	//    8   18:aload_0         
	//    9   19:getfield        #34  <Field WebView a>
	//   10   22:ldc1            #46  <String "accessibilityTraversal">
	//   11   24:invokevirtual   #42  <Method void WebView.removeJavascriptInterface(String)>
	//   12   27:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void Activity.onConfigurationChanged(Configuration)>
	//    3    5:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (getIntent()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #61  <Method Intent getIntent()>
	//    5    9:astore_1        
		getWindow().requestFeature(1);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #65  <Method Window getWindow()>
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #71  <Method boolean Window.requestFeature(int)>
	//   10   18:pop             
		Object obj = ((Object) (new android.widget.LinearLayout.LayoutParams(-1, -1, 0.0F)));
	//   11   19:new             #73  <Class android.widget.LinearLayout$LayoutParams>
	//   12   22:dup             
	//   13   23:iconst_m1       
	//   14   24:iconst_m1       
	//   15   25:fconst_0        
	//   16   26:invokespecial   #76  <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   17   29:astore_2        
		b = new RelativeLayout(((android.content.Context) (this)));
	//   18   30:aload_0         
	//   19   31:new             #78  <Class RelativeLayout>
	//   20   34:dup             
	//   21   35:aload_0         
	//   22   36:invokespecial   #81  <Method void RelativeLayout(android.content.Context)>
	//   23   39:putfield        #83  <Field RelativeLayout b>
		b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   24   42:aload_0         
	//   25   43:getfield        #83  <Field RelativeLayout b>
	//   26   46:aload_2         
	//   27   47:invokevirtual   #87  <Method void RelativeLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		b.setGravity(1);
	//   28   50:aload_0         
	//   29   51:getfield        #83  <Field RelativeLayout b>
	//   30   54:iconst_1        
	//   31   55:invokevirtual   #91  <Method void RelativeLayout.setGravity(int)>
		a = new WebView(((android.content.Context) (this)));
	//   32   58:aload_0         
	//   33   59:new             #38  <Class WebView>
	//   34   62:dup             
	//   35   63:aload_0         
	//   36   64:invokespecial   #92  <Method void WebView(android.content.Context)>
	//   37   67:putfield        #34  <Field WebView a>
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  38   70:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   73:bipush          11
	//*  40   75:icmplt          82
			a();
	//   41   78:aload_0         
	//   42   79:invokespecial   #100 <Method void a()>
		a.requestFocusFromTouch();
	//   43   82:aload_0         
	//   44   83:getfield        #34  <Field WebView a>
	//   45   86:invokevirtual   #104 <Method boolean WebView.requestFocusFromTouch()>
	//   46   89:pop             
		a.setLongClickable(true);
	//   47   90:aload_0         
	//   48   91:getfield        #34  <Field WebView a>
	//   49   94:iconst_1        
	//   50   95:invokevirtual   #108 <Method void WebView.setLongClickable(boolean)>
		obj = ((Object) (a.getSettings()));
	//   51   98:aload_0         
	//   52   99:getfield        #34  <Field WebView a>
	//   53  102:invokevirtual   #112 <Method WebSettings WebView.getSettings()>
	//   54  105:astore_2        
		((WebSettings) (obj)).setCacheMode(1);
	//   55  106:aload_2         
	//   56  107:iconst_1        
	//   57  108:invokevirtual   #117 <Method void WebSettings.setCacheMode(int)>
		((WebSettings) (obj)).setDatabaseEnabled(true);
	//   58  111:aload_2         
	//   59  112:iconst_1        
	//   60  113:invokevirtual   #120 <Method void WebSettings.setDatabaseEnabled(boolean)>
		((WebSettings) (obj)).setDomStorageEnabled(true);
	//   61  116:aload_2         
	//   62  117:iconst_1        
	//   63  118:invokevirtual   #123 <Method void WebSettings.setDomStorageEnabled(boolean)>
		((WebSettings) (obj)).setAllowFileAccess(true);
	//   64  121:aload_2         
	//   65  122:iconst_1        
	//   66  123:invokevirtual   #126 <Method void WebSettings.setAllowFileAccess(boolean)>
		((WebSettings) (obj)).setAppCacheEnabled(true);
	//   67  126:aload_2         
	//   68  127:iconst_1        
	//   69  128:invokevirtual   #129 <Method void WebSettings.setAppCacheEnabled(boolean)>
		((WebSettings) (obj)).setJavaScriptEnabled(true);
	//   70  131:aload_2         
	//   71  132:iconst_1        
	//   72  133:invokevirtual   #132 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		((WebSettings) (obj)).setLightTouchEnabled(true);
	//   73  136:aload_2         
	//   74  137:iconst_1        
	//   75  138:invokevirtual   #135 <Method void WebSettings.setLightTouchEnabled(boolean)>
		((WebSettings) (obj)).setDefaultTextEncodingName("utf-8");
	//   76  141:aload_2         
	//   77  142:ldc1            #137 <String "utf-8">
	//   78  144:invokevirtual   #140 <Method void WebSettings.setDefaultTextEncodingName(String)>
		((WebSettings) (obj)).setSavePassword(false);
	//   79  147:aload_2         
	//   80  148:iconst_0        
	//   81  149:invokevirtual   #143 <Method void WebSettings.setSavePassword(boolean)>
		a.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
	//   82  152:aload_0         
	//   83  153:getfield        #34  <Field WebView a>
	//   84  156:new             #145 <Class android.view.ViewGroup$LayoutParams>
	//   85  159:dup             
	//   86  160:iconst_m1       
	//   87  161:iconst_m1       
	//   88  162:invokespecial   #148 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   89  165:invokevirtual   #149 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		a.setWebChromeClient(c);
	//   90  168:aload_0         
	//   91  169:getfield        #34  <Field WebView a>
	//   92  172:aload_0         
	//   93  173:getfield        #25  <Field WebChromeClient c>
	//   94  176:invokevirtual   #153 <Method void WebView.setWebChromeClient(WebChromeClient)>
		a.setWebViewClient(d);
	//   95  179:aload_0         
	//   96  180:getfield        #34  <Field WebView a>
	//   97  183:aload_0         
	//   98  184:getfield        #28  <Field WebViewClient d>
	//   99  187:invokevirtual   #157 <Method void WebView.setWebViewClient(WebViewClient)>
		b.addView(((View) (a)));
	//  100  190:aload_0         
	//  101  191:getfield        #83  <Field RelativeLayout b>
	//  102  194:aload_0         
	//  103  195:getfield        #34  <Field WebView a>
	//  104  198:invokevirtual   #161 <Method void RelativeLayout.addView(View)>
		setContentView(((View) (b)));
	//  105  201:aload_0         
	//  106  202:aload_0         
	//  107  203:getfield        #83  <Field RelativeLayout b>
	//  108  206:invokevirtual   #164 <Method void setContentView(View)>
		if(b == null || a == null)
	//* 109  209:aload_0         
	//* 110  210:getfield        #83  <Field RelativeLayout b>
	//* 111  213:ifnull          223
	//* 112  216:aload_0         
	//* 113  217:getfield        #34  <Field WebView a>
	//* 114  220:ifnonnull       234
		{
			com.baidu.android.pushservice.e.a.e("MediaViewActivity", "Set up Layout error.");
	//  115  223:ldc1            #166 <String "MediaViewActivity">
	//  116  225:ldc1            #168 <String "Set up Layout error.">
	//  117  227:invokestatic    #174 <Method void a.e(String, String)>
			finish();
	//  118  230:aload_0         
	//  119  231:invokevirtual   #177 <Method void finish()>
		}
		obj = ((Object) (new StringBuilder()));
	//  120  234:new             #179 <Class StringBuilder>
	//  121  237:dup             
	//  122  238:invokespecial   #180 <Method void StringBuilder()>
	//  123  241:astore_2        
		((StringBuilder) (obj)).append("uri=");
	//  124  242:aload_2         
	//  125  243:ldc1            #182 <String "uri=">
	//  126  245:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  127  248:pop             
		((StringBuilder) (obj)).append(((Intent) (bundle)).getData().toString());
	//  128  249:aload_2         
	//  129  250:aload_1         
	//  130  251:invokevirtual   #192 <Method Uri Intent.getData()>
	//  131  254:invokevirtual   #198 <Method String Uri.toString()>
	//  132  257:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//  133  260:pop             
		com.baidu.android.pushservice.e.a.c("MediaViewActivity", ((StringBuilder) (obj)).toString());
	//  134  261:ldc1            #166 <String "MediaViewActivity">
	//  135  263:aload_2         
	//  136  264:invokevirtual   #199 <Method String StringBuilder.toString()>
	//  137  267:invokestatic    #201 <Method void a.c(String, String)>
		a.loadUrl(((Intent) (bundle)).getData().toString());
	//  138  270:aload_0         
	//  139  271:getfield        #34  <Field WebView a>
	//  140  274:aload_1         
	//  141  275:invokevirtual   #192 <Method Uri Intent.getData()>
	//  142  278:invokevirtual   #198 <Method String Uri.toString()>
	//  143  281:invokevirtual   #204 <Method void WebView.loadUrl(String)>
	//  144  284:return          
	}

	protected void onNewIntent(Intent intent)
	{
		super.onNewIntent(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #208 <Method void Activity.onNewIntent(Intent)>
		setIntent(intent);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #211 <Method void setIntent(Intent)>
		StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #179 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #180 <Method void StringBuilder()>
	//    9   17:astore_2        
		stringbuilder.append("uri=");
	//   10   18:aload_2         
	//   11   19:ldc1            #182 <String "uri=">
	//   12   21:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		stringbuilder.append(intent.getData().toString());
	//   14   25:aload_2         
	//   15   26:aload_1         
	//   16   27:invokevirtual   #192 <Method Uri Intent.getData()>
	//   17   30:invokevirtual   #198 <Method String Uri.toString()>
	//   18   33:invokevirtual   #186 <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
		com.baidu.android.pushservice.e.a.c("MediaViewActivity", stringbuilder.toString());
	//   20   37:ldc1            #166 <String "MediaViewActivity">
	//   21   39:aload_2         
	//   22   40:invokevirtual   #199 <Method String StringBuilder.toString()>
	//   23   43:invokestatic    #201 <Method void a.c(String, String)>
		a.loadUrl(intent.getData().toString());
	//   24   46:aload_0         
	//   25   47:getfield        #34  <Field WebView a>
	//   26   50:aload_1         
	//   27   51:invokevirtual   #192 <Method Uri Intent.getData()>
	//   28   54:invokevirtual   #198 <Method String Uri.toString()>
	//   29   57:invokevirtual   #204 <Method void WebView.loadUrl(String)>
	//   30   60:return          
	}

	public void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #214 <Method void Activity.onPause()>
	//    2    4:return          
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #217 <Method void Activity.onResume()>
	//    2    4:return          
	}

	public WebView a;
	private RelativeLayout b;
	private WebChromeClient c;
	private WebViewClient d;
}
