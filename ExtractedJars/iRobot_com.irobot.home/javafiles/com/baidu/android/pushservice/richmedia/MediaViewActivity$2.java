// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.richmedia;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.baidu.android.pushservice.e.a;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//			MediaViewActivity

class MediaViewActivity$2 extends WebViewClient
{

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

	MediaViewActivity$2(MediaViewActivity mediaviewactivity)
	{
		a = mediaviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MediaViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void WebViewClient()>
	//    5    9:return          
	}
}
