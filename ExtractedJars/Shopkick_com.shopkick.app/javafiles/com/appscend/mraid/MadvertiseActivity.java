// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.*;
import android.widget.*;

public class MadvertiseActivity extends Activity
{

	public MadvertiseActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Activity()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		ActivityNotFoundException activitynotfoundexception;
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #40  <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (new RelativeLayout(((android.content.Context) (this)))));
	//    3    5:new             #42  <Class RelativeLayout>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #45  <Method void RelativeLayout(android.content.Context)>
	//    7   13:astore_1        
		final WebView webView = new WebView(((android.content.Context) (this)));
	//    8   14:new             #47  <Class WebView>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #48  <Method void WebView(android.content.Context)>
	//   12   22:astore_2        
		getWindow().requestFeature(2);
	//   13   23:aload_0         
	//   14   24:invokevirtual   #52  <Method Window getWindow()>
	//   15   27:iconst_2        
	//   16   28:invokevirtual   #58  <Method boolean Window.requestFeature(int)>
	//   17   31:pop             
		getWindow().setFeatureInt(2, -1);
	//   18   32:aload_0         
	//   19   33:invokevirtual   #52  <Method Window getWindow()>
	//   20   36:iconst_2        
	//   21   37:iconst_m1       
	//   22   38:invokevirtual   #62  <Method void Window.setFeatureInt(int, int)>
		Object obj = ((Object) (new LinearLayout(((android.content.Context) (this)))));
	//   23   41:new             #64  <Class LinearLayout>
	//   24   44:dup             
	//   25   45:aload_0         
	//   26   46:invokespecial   #65  <Method void LinearLayout(android.content.Context)>
	//   27   49:astore_3        
		((LinearLayout) (obj)).setOrientation(0);
	//   28   50:aload_3         
	//   29   51:iconst_0        
	//   30   52:invokevirtual   #69  <Method void LinearLayout.setOrientation(int)>
		((LinearLayout) (obj)).setId(42);
	//   31   55:aload_3         
	//   32   56:bipush          42
	//   33   58:invokevirtual   #72  <Method void LinearLayout.setId(int)>
		((LinearLayout) (obj)).setWeightSum(100F);
	//   34   61:aload_3         
	//   35   62:ldc1            #73  <Float 100F>
	//   36   64:invokevirtual   #77  <Method void LinearLayout.setWeightSum(float)>
		final ImageButton forward = ((ImageButton) (new android.widget.RelativeLayout.LayoutParams(-1, -1)));
	//   37   67:new             #79  <Class android.widget.RelativeLayout$LayoutParams>
	//   38   70:dup             
	//   39   71:iconst_m1       
	//   40   72:iconst_m1       
	//   41   73:invokespecial   #81  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   42   76:astore          4
		((android.widget.RelativeLayout.LayoutParams) (forward)).addRule(2, 42);
	//   43   78:aload           4
	//   44   80:iconst_2        
	//   45   81:bipush          42
	//   46   83:invokevirtual   #84  <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
		((RelativeLayout) (bundle)).addView(((View) (webView)), ((android.view.ViewGroup.LayoutParams) (forward)));
	//   47   86:aload_1         
	//   48   87:aload_2         
	//   49   88:aload           4
	//   50   90:invokevirtual   #88  <Method void RelativeLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		forward = ((ImageButton) (new android.widget.RelativeLayout.LayoutParams(-1, -2)));
	//   51   93:new             #79  <Class android.widget.RelativeLayout$LayoutParams>
	//   52   96:dup             
	//   53   97:iconst_m1       
	//   54   98:bipush          -2
	//   55  100:invokespecial   #81  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   56  103:astore          4
		((android.widget.RelativeLayout.LayoutParams) (forward)).addRule(12);
	//   57  105:aload           4
	//   58  107:bipush          12
	//   59  109:invokevirtual   #90  <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		((RelativeLayout) (bundle)).addView(((View) (obj)), ((android.view.ViewGroup.LayoutParams) (forward)));
	//   60  112:aload_1         
	//   61  113:aload_3         
	//   62  114:aload           4
	//   63  116:invokevirtual   #88  <Method void RelativeLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		forward = ((ImageButton) (new android.widget.LinearLayout.LayoutParams(-2, -1)));
	//   64  119:new             #92  <Class android.widget.LinearLayout$LayoutParams>
	//   65  122:dup             
	//   66  123:bipush          -2
	//   67  125:iconst_m1       
	//   68  126:invokespecial   #93  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   69  129:astore          4
		forward.weight = 25F;
	//   70  131:aload           4
	//   71  133:ldc1            #94  <Float 25F>
	//   72  135:putfield        #98  <Field float android.widget.LinearLayout$LayoutParams.weight>
		forward.gravity = 16;
	//   73  138:aload           4
	//   74  140:bipush          16
	//   75  142:putfield        #102 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		Object obj1 = ((Object) (new ImageButton(((android.content.Context) (this)))));
	//   76  145:new             #104 <Class ImageButton>
	//   77  148:dup             
	//   78  149:aload_0         
	//   79  150:invokespecial   #105 <Method void ImageButton(android.content.Context)>
	//   80  153:astore          5
		((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (forward)));
	//   81  155:aload_3         
	//   82  156:aload           5
	//   83  158:aload           4
	//   84  160:invokevirtual   #106 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		if(!getIntent().getBooleanExtra("open_show_back", true))
	//*  85  163:aload_0         
	//*  86  164:invokevirtual   #110 <Method Intent getIntent()>
	//*  87  167:ldc1            #23  <String "open_show_back">
	//*  88  169:iconst_1        
	//*  89  170:invokevirtual   #116 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*  90  173:ifne            183
			((ImageButton) (obj1)).setVisibility(8);
	//   91  176:aload           5
	//   92  178:bipush          8
	//   93  180:invokevirtual   #119 <Method void ImageButton.setVisibility(int)>
		((ImageButton) (obj1)).setImageResource(com.appscend.vastplayer.R.drawable.back);
	//   94  183:aload           5
	//   95  185:getstatic       #124 <Field int com.appscend.vastplayer.R$drawable.back>
	//   96  188:invokevirtual   #127 <Method void ImageButton.setImageResource(int)>
		((ImageButton) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				if(webView.canGoBack())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field WebView val$webView>
			//*   2    4:invokevirtual   #33  <Method boolean WebView.canGoBack()>
			//*   3    7:ifeq            18
				{
					webView.goBack();
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field WebView val$webView>
			//    6   14:invokevirtual   #36  <Method void WebView.goBack()>
					return;
			//    7   17:return          
				} else
				{
					finish();
			//    8   18:aload_0         
			//    9   19:getfield        #19  <Field MadvertiseActivity this$0>
			//   10   22:invokevirtual   #39  <Method void MadvertiseActivity.finish()>
					return;
			//   11   25:return          
				}
			}

			final MadvertiseActivity this$0;
			final WebView val$webView;

			
			{
				this$0 = MadvertiseActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MadvertiseActivity this$0>
				webView = webview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field WebView val$webView>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   97  191:aload           5
	//   98  193:new             #6   <Class MadvertiseActivity$1>
	//   99  196:dup             
	//  100  197:aload_0         
	//  101  198:aload_2         
	//  102  199:invokespecial   #130 <Method void MadvertiseActivity$1(MadvertiseActivity, WebView)>
	//  103  202:invokevirtual   #134 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		forward = new ImageButton(((android.content.Context) (this)));
	//  104  205:new             #104 <Class ImageButton>
	//  105  208:dup             
	//  106  209:aload_0         
	//  107  210:invokespecial   #105 <Method void ImageButton(android.content.Context)>
	//  108  213:astore          4
		obj1 = ((Object) (new android.widget.LinearLayout.LayoutParams(-2, -1)));
	//  109  215:new             #92  <Class android.widget.LinearLayout$LayoutParams>
	//  110  218:dup             
	//  111  219:bipush          -2
	//  112  221:iconst_m1       
	//  113  222:invokespecial   #93  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//  114  225:astore          5
		obj1.weight = 25F;
	//  115  227:aload           5
	//  116  229:ldc1            #94  <Float 25F>
	//  117  231:putfield        #98  <Field float android.widget.LinearLayout$LayoutParams.weight>
		obj1.gravity = 16;
	//  118  234:aload           5
	//  119  236:bipush          16
	//  120  238:putfield        #102 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		((LinearLayout) (obj)).addView(((View) (forward)), ((android.view.ViewGroup.LayoutParams) (obj1)));
	//  121  241:aload_3         
	//  122  242:aload           4
	//  123  244:aload           5
	//  124  246:invokevirtual   #106 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		if(!getIntent().getBooleanExtra("open_show_forward", true))
	//* 125  249:aload_0         
	//* 126  250:invokevirtual   #110 <Method Intent getIntent()>
	//* 127  253:ldc1            #26  <String "open_show_forward">
	//* 128  255:iconst_1        
	//* 129  256:invokevirtual   #116 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//* 130  259:ifne            269
			forward.setVisibility(8);
	//  131  262:aload           4
	//  132  264:bipush          8
	//  133  266:invokevirtual   #119 <Method void ImageButton.setVisibility(int)>
		forward.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				webView.goForward();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field WebView val$webView>
			//    2    4:invokevirtual   #32  <Method void WebView.goForward()>
			//    3    7:return          
			}

			final MadvertiseActivity this$0;
			final WebView val$webView;

			
			{
				this$0 = MadvertiseActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MadvertiseActivity this$0>
				webView = webview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field WebView val$webView>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//  134  269:aload           4
	//  135  271:new             #8   <Class MadvertiseActivity$2>
	//  136  274:dup             
	//  137  275:aload_0         
	//  138  276:aload_2         
	//  139  277:invokespecial   #135 <Method void MadvertiseActivity$2(MadvertiseActivity, WebView)>
	//  140  280:invokevirtual   #134 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		obj1 = ((Object) (new ImageButton(((android.content.Context) (this)))));
	//  141  283:new             #104 <Class ImageButton>
	//  142  286:dup             
	//  143  287:aload_0         
	//  144  288:invokespecial   #105 <Method void ImageButton(android.content.Context)>
	//  145  291:astore          5
		((ImageButton) (obj1)).setImageResource(com.appscend.vastplayer.R.drawable.veeplay_refresh);
	//  146  293:aload           5
	//  147  295:getstatic       #138 <Field int com.appscend.vastplayer.R$drawable.veeplay_refresh>
	//  148  298:invokevirtual   #127 <Method void ImageButton.setImageResource(int)>
		android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
	//  149  301:new             #92  <Class android.widget.LinearLayout$LayoutParams>
	//  150  304:dup             
	//  151  305:bipush          -2
	//  152  307:bipush          -2
	//  153  309:invokespecial   #93  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//  154  312:astore          6
		layoutparams.weight = 25F;
	//  155  314:aload           6
	//  156  316:ldc1            #94  <Float 25F>
	//  157  318:putfield        #98  <Field float android.widget.LinearLayout$LayoutParams.weight>
		layoutparams.gravity = 16;
	//  158  321:aload           6
	//  159  323:bipush          16
	//  160  325:putfield        #102 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  161  328:aload_3         
	//  162  329:aload           5
	//  163  331:aload           6
	//  164  333:invokevirtual   #106 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		if(!getIntent().getBooleanExtra("open_show_refresh", true))
	//* 165  336:aload_0         
	//* 166  337:invokevirtual   #110 <Method Intent getIntent()>
	//* 167  340:ldc1            #29  <String "open_show_refresh">
	//* 168  342:iconst_1        
	//* 169  343:invokevirtual   #116 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//* 170  346:ifne            356
			((ImageButton) (obj1)).setVisibility(8);
	//  171  349:aload           5
	//  172  351:bipush          8
	//  173  353:invokevirtual   #119 <Method void ImageButton.setVisibility(int)>
		((ImageButton) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				webView.reload();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field WebView val$webView>
			//    2    4:invokevirtual   #32  <Method void WebView.reload()>
			//    3    7:return          
			}

			final MadvertiseActivity this$0;
			final WebView val$webView;

			
			{
				this$0 = MadvertiseActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field MadvertiseActivity this$0>
				webView = webview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field WebView val$webView>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//  174  356:aload           5
	//  175  358:new             #10  <Class MadvertiseActivity$3>
	//  176  361:dup             
	//  177  362:aload_0         
	//  178  363:aload_2         
	//  179  364:invokespecial   #139 <Method void MadvertiseActivity$3(MadvertiseActivity, WebView)>
	//  180  367:invokevirtual   #134 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		obj1 = ((Object) (new ImageButton(((android.content.Context) (this)))));
	//  181  370:new             #104 <Class ImageButton>
	//  182  373:dup             
	//  183  374:aload_0         
	//  184  375:invokespecial   #105 <Method void ImageButton(android.content.Context)>
	//  185  378:astore          5
		((ImageButton) (obj1)).setImageResource(0x1080038);
	//  186  380:aload           5
	//  187  382:ldc1            #140 <Int 0x1080038>
	//  188  384:invokevirtual   #127 <Method void ImageButton.setImageResource(int)>
		layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
	//  189  387:new             #92  <Class android.widget.LinearLayout$LayoutParams>
	//  190  390:dup             
	//  191  391:bipush          -2
	//  192  393:bipush          -2
	//  193  395:invokespecial   #93  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//  194  398:astore          6
		layoutparams.weight = 25F;
	//  195  400:aload           6
	//  196  402:ldc1            #94  <Float 25F>
	//  197  404:putfield        #98  <Field float android.widget.LinearLayout$LayoutParams.weight>
		layoutparams.gravity = 16;
	//  198  407:aload           6
	//  199  409:bipush          16
	//  200  411:putfield        #102 <Field int android.widget.LinearLayout$LayoutParams.gravity>
		((LinearLayout) (obj)).addView(((View) (obj1)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  201  414:aload_3         
	//  202  415:aload           5
	//  203  417:aload           6
	//  204  419:invokevirtual   #106 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		((ImageButton) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				finish();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field MadvertiseActivity this$0>
			//    2    4:invokevirtual   #26  <Method void MadvertiseActivity.finish()>
			//    3    7:return          
			}

			final MadvertiseActivity this$0;

			
			{
				this$0 = MadvertiseActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MadvertiseActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  205  422:aload           5
	//  206  424:new             #12  <Class MadvertiseActivity$4>
	//  207  427:dup             
	//  208  428:aload_0         
	//  209  429:invokespecial   #143 <Method void MadvertiseActivity$4(MadvertiseActivity)>
	//  210  432:invokevirtual   #134 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		getWindow().requestFeature(2);
	//  211  435:aload_0         
	//  212  436:invokevirtual   #52  <Method Window getWindow()>
	//  213  439:iconst_2        
	//  214  440:invokevirtual   #58  <Method boolean Window.requestFeature(int)>
	//  215  443:pop             
		CookieSyncManager.createInstance(((android.content.Context) (this)));
	//  216  444:aload_0         
	//  217  445:invokestatic    #149 <Method CookieSyncManager CookieSyncManager.createInstance(android.content.Context)>
	//  218  448:pop             
		CookieSyncManager.getInstance().startSync();
	//  219  449:invokestatic    #153 <Method CookieSyncManager CookieSyncManager.getInstance()>
	//  220  452:invokevirtual   #156 <Method void CookieSyncManager.startSync()>
		webView.getSettings().setJavaScriptEnabled(true);
	//  221  455:aload_2         
	//  222  456:invokevirtual   #160 <Method WebSettings WebView.getSettings()>
	//  223  459:iconst_1        
	//  224  460:invokevirtual   #166 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		obj = ((Object) (getIntent().getDataString()));
	//  225  463:aload_0         
	//  226  464:invokevirtual   #110 <Method Intent getIntent()>
	//  227  467:invokevirtual   #170 <Method String Intent.getDataString()>
	//  228  470:astore_3        
		if(((String) (obj)).startsWith("http") && !((String) (obj)).startsWith("https://market.") && !((String) (obj)).startsWith("https://play."))
	//* 229  471:aload_3         
	//* 230  472:ldc1            #172 <String "http">
	//* 231  474:invokevirtual   #178 <Method boolean String.startsWith(String)>
	//* 232  477:ifeq            515
	//* 233  480:aload_3         
	//* 234  481:ldc1            #180 <String "https://market.">
	//* 235  483:invokevirtual   #178 <Method boolean String.startsWith(String)>
	//* 236  486:ifne            515
	//* 237  489:aload_3         
	//* 238  490:ldc1            #182 <String "https://play.">
	//* 239  492:invokevirtual   #178 <Method boolean String.startsWith(String)>
	//* 240  495:ifeq            501
	//* 241  498:goto            515
			webView.loadUrl(getIntent().getDataString());
	//  242  501:aload_2         
	//  243  502:aload_0         
	//  244  503:invokevirtual   #110 <Method Intent getIntent()>
	//  245  506:invokevirtual   #170 <Method String Intent.getDataString()>
	//  246  509:invokevirtual   #186 <Method void WebView.loadUrl(String)>
		else
	//* 247  512:goto            559
			try
			{
				obj = ((Object) (new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))))));
	//  248  515:new             #112 <Class Intent>
	//  249  518:dup             
	//  250  519:ldc1            #188 <String "android.intent.action.VIEW">
	//  251  521:aload_3         
	//  252  522:invokestatic    #194 <Method Uri Uri.parse(String)>
	//  253  525:invokespecial   #197 <Method void Intent(String, Uri)>
	//  254  528:astore_3        
				((Intent) (obj)).addFlags(0x10000000);
	//  255  529:aload_3         
	//  256  530:ldc1            #198 <Int 0x10000000>
	//  257  532:invokevirtual   #202 <Method Intent Intent.addFlags(int)>
	//  258  535:pop             
				startActivity(((Intent) (obj)));
	//  259  536:aload_0         
	//  260  537:aload_3         
	//  261  538:invokevirtual   #206 <Method void startActivity(Intent)>
				finish();
	//  262  541:aload_0         
	//  263  542:invokevirtual   #209 <Method void finish()>
			}
	//* 264  545:goto            559
	//* 265  548:aload_2         
	//* 266  549:aload_0         
	//* 267  550:invokevirtual   #110 <Method Intent getIntent()>
	//* 268  553:invokevirtual   #170 <Method String Intent.getDataString()>
	//* 269  556:invokevirtual   #186 <Method void WebView.loadUrl(String)>
	//* 270  559:aload_2         
	//* 271  560:new             #14  <Class MadvertiseActivity$5>
	//* 272  563:dup             
	//* 273  564:aload_0         
	//* 274  565:aload           4
	//* 275  567:invokespecial   #212 <Method void MadvertiseActivity$5(MadvertiseActivity, ImageButton)>
	//* 276  570:invokevirtual   #216 <Method void WebView.setWebViewClient(WebViewClient)>
	//* 277  573:aload_0         
	//* 278  574:aload_1         
	//* 279  575:invokevirtual   #220 <Method void setContentView(View)>
	//* 280  578:aload_2         
	//* 281  579:new             #16  <Class MadvertiseActivity$6>
	//* 282  582:dup             
	//* 283  583:aload_0         
	//* 284  584:invokespecial   #221 <Method void MadvertiseActivity$6(MadvertiseActivity)>
	//* 285  587:invokevirtual   #225 <Method void WebView.setWebChromeClient(WebChromeClient)>
	//* 286  590:return          
			// Misplaced declaration of an exception variable
			catch(ActivityNotFoundException activitynotfoundexception)
			{
				webView.loadUrl(getIntent().getDataString());
			}
		webView.setWebViewClient(((WebViewClient) (new WebViewClient() {

			public void onPageFinished(WebView webview, String s)
			{
				super.onPageFinished(webview, s);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #27  <Method void WebViewClient.onPageFinished(WebView, String)>
				if(webview.canGoForward())
			//*   4    6:aload_1         
			//*   5    7:invokevirtual   #33  <Method boolean WebView.canGoForward()>
			//*   6   10:ifeq            22
				{
					forward.setEnabled(true);
			//    7   13:aload_0         
			//    8   14:getfield        #19  <Field ImageButton val$forward>
			//    9   17:iconst_1        
			//   10   18:invokevirtual   #39  <Method void ImageButton.setEnabled(boolean)>
					return;
			//   11   21:return          
				} else
				{
					forward.setEnabled(false);
			//   12   22:aload_0         
			//   13   23:getfield        #19  <Field ImageButton val$forward>
			//   14   26:iconst_0        
			//   15   27:invokevirtual   #39  <Method void ImageButton.setEnabled(boolean)>
					return;
			//   16   30:return          
				}
			}

			public void onPageStarted(WebView webview, String s, Bitmap bitmap)
			{
				super.onPageStarted(webview, s, bitmap);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:aload_3         
			//    4    4:invokespecial   #43  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
				forward.setImageResource(com.appscend.vastplayer.R.drawable.forward);
			//    5    7:aload_0         
			//    6    8:getfield        #19  <Field ImageButton val$forward>
			//    7   11:getstatic       #49  <Field int com.appscend.vastplayer.R$drawable.forward>
			//    8   14:invokevirtual   #53  <Method void ImageButton.setImageResource(int)>
			//    9   17:return          
			}

			public void onReceivedError(WebView webview, int i, String s, String s1)
			{
				webview = ((WebView) ((Activity)webview.getContext()));
			//    0    0:aload_1         
			//    1    1:invokevirtual   #59  <Method android.content.Context WebView.getContext()>
			//    2    4:checkcast       #61  <Class Activity>
			//    3    7:astore_1        
				s1 = ((String) (new StringBuilder()));
			//    4    8:new             #63  <Class StringBuilder>
			//    5   11:dup             
			//    6   12:invokespecial   #64  <Method void StringBuilder()>
			//    7   15:astore          4
				((StringBuilder) (s1)).append("Error:");
			//    8   17:aload           4
			//    9   19:ldc1            #66  <String "Error:">
			//   10   21:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
			//   11   24:pop             
				((StringBuilder) (s1)).append(s);
			//   12   25:aload           4
			//   13   27:aload_3         
			//   14   28:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
			//   15   31:pop             
				Toast.makeText(((android.content.Context) (webview)), ((CharSequence) (((StringBuilder) (s1)).toString())), 0).show();
			//   16   32:aload_1         
			//   17   33:aload           4
			//   18   35:invokevirtual   #74  <Method String StringBuilder.toString()>
			//   19   38:iconst_0        
			//   20   39:invokestatic    #80  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
			//   21   42:invokevirtual   #83  <Method void Toast.show()>
			//   22   45:return          
			}

			public boolean shouldOverrideUrlLoading(WebView webview, String s)
			{
				webview.loadUrl(s);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokevirtual   #89  <Method void WebView.loadUrl(String)>
				return true;
			//    3    5:iconst_1        
			//    4    6:ireturn         
			}

			final MadvertiseActivity this$0;
			final ImageButton val$forward;

			
			{
				this$0 = MadvertiseActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field MadvertiseActivity this$0>
				forward = imagebutton;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field ImageButton val$forward>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void WebViewClient()>
			//    8   14:return          
			}
		}
)));
		setContentView(((View) (bundle)));
		webView.setWebChromeClient(((WebChromeClient) (new WebChromeClient() {

			public void onProgressChanged(WebView webview, int i)
			{
				Activity activity = (Activity)webview.getContext();
			//    0    0:aload_1         
			//    1    1:invokevirtual   #27  <Method android.content.Context WebView.getContext()>
			//    2    4:checkcast       #29  <Class Activity>
			//    3    7:astore_3        
				activity.setTitle("Loading...");
			//    4    8:aload_3         
			//    5    9:ldc1            #31  <String "Loading...">
			//    6   11:invokevirtual   #35  <Method void Activity.setTitle(CharSequence)>
				activity.setProgress(i * 100);
			//    7   14:aload_3         
			//    8   15:iload_2         
			//    9   16:bipush          100
			//   10   18:imul            
			//   11   19:invokevirtual   #39  <Method void Activity.setProgress(int)>
				if(i == 100)
			//*  12   22:iload_2         
			//*  13   23:bipush          100
			//*  14   25:icmpne          36
					activity.setTitle(((CharSequence) (webview.getUrl())));
			//   15   28:aload_3         
			//   16   29:aload_1         
			//   17   30:invokevirtual   #43  <Method String WebView.getUrl()>
			//   18   33:invokevirtual   #35  <Method void Activity.setTitle(CharSequence)>
			//   19   36:return          
			}

			final MadvertiseActivity this$0;

			
			{
				this$0 = MadvertiseActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field MadvertiseActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebChromeClient()>
			//    5    9:return          
			}
		}
)));
	//* 287  591:astore_3        
	//* 288  592:goto            548
	}

	protected void onPause()
	{
		super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #228 <Method void Activity.onPause()>
		CookieSyncManager.getInstance().stopSync();
	//    2    4:invokestatic    #153 <Method CookieSyncManager CookieSyncManager.getInstance()>
	//    3    7:invokevirtual   #231 <Method void CookieSyncManager.stopSync()>
	//    4   10:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #234 <Method void Activity.onResume()>
		CookieSyncManager.getInstance().startSync();
	//    2    4:invokestatic    #153 <Method CookieSyncManager CookieSyncManager.getInstance()>
	//    3    7:invokevirtual   #156 <Method void CookieSyncManager.startSync()>
	//    4   10:return          
	}

	public static final String SHOW_BACK_EXTRA = "open_show_back";
	public static final String SHOW_FORWARD_EXTRA = "open_show_forward";
	public static final String SHOW_REFRESH_EXTRA = "open_show_refresh";
}
