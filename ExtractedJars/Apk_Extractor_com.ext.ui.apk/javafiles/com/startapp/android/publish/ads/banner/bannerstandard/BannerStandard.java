// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.bannerstandard;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.startapp.android.publish.ads.banner.Banner;
import com.startapp.android.publish.ads.banner.BannerBase;
import com.startapp.android.publish.ads.banner.BannerInterface;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.Utils.i;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import com.startapp.android.publish.adsCommon.adinformation.b;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdPreferences;
import com.startapp.android.publish.html.JsInterface;
import com.startapp.common.a.c;
import com.startapp.common.a.g;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.startapp.android.publish.ads.banner.bannerstandard:
//			a

public class BannerStandard extends BannerBase
	implements BannerInterface, AdEventListener
{
	class MyWebViewClient extends WebViewClient
	{

		public boolean shouldOverrideUrlLoading(WebView webview, String s)
		{
			boolean flag;
			webview = null;
		//    0    0:aconst_null     
		//    1    1:astore_1        
			if(jsTag && !webViewTouched)
		//*   2    2:aload_0         
		//*   3    3:getfield        #15  <Field BannerStandard this$0>
		//*   4    6:invokestatic    #29  <Method boolean BannerStandard.access$200(BannerStandard)>
		//*   5    9:ifeq            24
		//*   6   12:aload_0         
		//*   7   13:getfield        #15  <Field BannerStandard this$0>
		//*   8   16:invokestatic    #32  <Method boolean BannerStandard.access$000(BannerStandard)>
		//*   9   19:ifne            24
				return false;
		//   10   22:iconst_0        
		//   11   23:ireturn         
			if(!callbackSent)
		//*  12   24:aload_0         
		//*  13   25:getfield        #20  <Field boolean callbackSent>
		//*  14   28:ifne            62
			{
				callbackSent = true;
		//   15   31:aload_0         
		//   16   32:iconst_1        
		//   17   33:putfield        #20  <Field boolean callbackSent>
				if(listener != null)
		//*  18   36:aload_0         
		//*  19   37:getfield        #15  <Field BannerStandard this$0>
		//*  20   40:getfield        #36  <Field BannerListener BannerStandard.listener>
		//*  21   43:ifnull          62
					listener.onClick(((View) (BannerStandard.this)));
		//   22   46:aload_0         
		//   23   47:getfield        #15  <Field BannerStandard this$0>
		//   24   50:getfield        #36  <Field BannerListener BannerStandard.listener>
		//   25   53:aload_0         
		//   26   54:getfield        #15  <Field BannerStandard this$0>
		//   27   57:invokeinterface #42  <Method void BannerListener.onClick(View)>
			}
			cancelScheduledImpression(true);
		//   28   62:aload_0         
		//   29   63:getfield        #15  <Field BannerStandard this$0>
		//   30   66:iconst_1        
		//   31   67:invokevirtual   #46  <Method void BannerStandard.cancelScheduledImpression(boolean)>
			flag = com.startapp.android.publish.adsCommon.c.a(getContext(), com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_BANNER);
		//   32   70:aload_0         
		//   33   71:getfield        #15  <Field BannerStandard this$0>
		//   34   74:invokevirtual   #50  <Method Context BannerStandard.getContext()>
		//   35   77:getstatic       #56  <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_BANNER>
		//   36   80:invokestatic    #62  <Method boolean com.startapp.android.publish.adsCommon.c.a(Context, com.startapp.android.publish.common.model.AdPreferences$Placement)>
		//   37   83:istore          4
			if(jsTag || !s.contains("index="))
				break MISSING_BLOCK_LABEL_382;
		//   38   85:aload_0         
		//   39   86:getfield        #15  <Field BannerStandard this$0>
		//   40   89:invokestatic    #29  <Method boolean BannerStandard.access$200(BannerStandard)>
		//   41   92:ifne            382
		//   42   95:aload_2         
		//   43   96:ldc1            #64  <String "index=">
		//   44   98:invokevirtual   #70  <Method boolean String.contains(CharSequence)>
		//   45  101:ifeq            382
			int j = com.startapp.android.publish.adsCommon.c.a(s);
		//   46  104:aload_2         
		//   47  105:invokestatic    #73  <Method int com.startapp.android.publish.adsCommon.c.a(String)>
		//   48  108:istore_3        
			if(!adHtml.d(j) || flag) goto _L2; else goto _L1
		//   49  109:aload_0         
		//   50  110:getfield        #15  <Field BannerStandard this$0>
		//   51  113:getfield        #77  <Field a BannerStandard.adHtml>
		//   52  116:iload_3         
		//   53  117:invokevirtual   #83  <Method boolean com.startapp.android.publish.ads.banner.bannerstandard.a.d(int)>
		//   54  120:ifeq            274
		//   55  123:iload           4
		//   56  125:ifne            274
_L1:
			Object obj1 = ((Object) (getContext()));
		//   57  128:aload_0         
		//   58  129:getfield        #15  <Field BannerStandard this$0>
		//   59  132:invokevirtual   #50  <Method Context BannerStandard.getContext()>
		//   60  135:astore          6
			if(j >= adHtml.m().length) goto _L4; else goto _L3
		//   61  137:iload_3         
		//   62  138:aload_0         
		//   63  139:getfield        #15  <Field BannerStandard this$0>
		//   64  142:getfield        #77  <Field a BannerStandard.adHtml>
		//   65  145:invokevirtual   #87  <Method String[] a.m()>
		//   66  148:arraylength     
		//   67  149:icmpge          263
_L3:
			webview = ((WebView) (adHtml.m()[j]));
		//   68  152:aload_0         
		//   69  153:getfield        #15  <Field BannerStandard this$0>
		//   70  156:getfield        #77  <Field a BannerStandard.adHtml>
		//   71  159:invokevirtual   #87  <Method String[] a.m()>
		//   72  162:iload_3         
		//   73  163:aaload          
		//   74  164:astore_1        
_L7:
			if(j >= adHtml.o().length) goto _L6; else goto _L5
		//   75  165:iload_3         
		//   76  166:aload_0         
		//   77  167:getfield        #15  <Field BannerStandard this$0>
		//   78  170:getfield        #77  <Field a BannerStandard.adHtml>
		//   79  173:invokevirtual   #90  <Method String[] a.o()>
		//   80  176:arraylength     
		//   81  177:icmpge          268
_L5:
			Object obj = ((Object) (adHtml.o()[j]));
		//   82  180:aload_0         
		//   83  181:getfield        #15  <Field BannerStandard this$0>
		//   84  184:getfield        #77  <Field a BannerStandard.adHtml>
		//   85  187:invokevirtual   #90  <Method String[] a.o()>
		//   86  190:iload_3         
		//   87  191:aaload          
		//   88  192:astore          5
_L8:
			com.startapp.android.publish.adsCommon.c.a(((Context) (obj1)), s, ((String) (webview)), ((String) (obj)), new com.startapp.android.publish.adsCommon.d.b(getAdTag()), 5000L, adHtml.e(j), adHtml.f(j), false);
		//   89  194:aload           6
		//   90  196:aload_2         
		//   91  197:aload_1         
		//   92  198:aload           5
		//   93  200:new             #92  <Class com.startapp.android.publish.adsCommon.d.b>
		//   94  203:dup             
		//   95  204:aload_0         
		//   96  205:getfield        #15  <Field BannerStandard this$0>
		//   97  208:invokestatic    #96  <Method String BannerStandard.access$300(BannerStandard)>
		//   98  211:invokespecial   #99  <Method void com.startapp.android.publish.adsCommon.d.b(String)>
		//   99  214:ldc2w           #100 <Long 5000L>
		//  100  217:aload_0         
		//  101  218:getfield        #15  <Field BannerStandard this$0>
		//  102  221:getfield        #77  <Field a BannerStandard.adHtml>
		//  103  224:iload_3         
		//  104  225:invokevirtual   #104 <Method boolean a.e(int)>
		//  105  228:aload_0         
		//  106  229:getfield        #15  <Field BannerStandard this$0>
		//  107  232:getfield        #77  <Field a BannerStandard.adHtml>
		//  108  235:iload_3         
		//  109  236:invokevirtual   #108 <Method Boolean com.startapp.android.publish.ads.banner.bannerstandard.a.f(int)>
		//  110  239:iconst_0        
		//  111  240:invokestatic    #111 <Method void com.startapp.android.publish.adsCommon.c.a(Context, String, String, String, com.startapp.android.publish.adsCommon.d.b, long, boolean, Boolean, boolean)>
_L9:
			webView.stopLoading();
		//  112  243:aload_0         
		//  113  244:getfield        #15  <Field BannerStandard this$0>
		//  114  247:getfield        #115 <Field WebView BannerStandard.webView>
		//  115  250:invokevirtual   #120 <Method void WebView.stopLoading()>
			setClicked(true);
		//  116  253:aload_0         
		//  117  254:getfield        #15  <Field BannerStandard this$0>
		//  118  257:iconst_1        
		//  119  258:invokevirtual   #123 <Method void BannerStandard.setClicked(boolean)>
			return true;
		//  120  261:iconst_1        
		//  121  262:ireturn         
_L4:
			webview = null;
		//  122  263:aconst_null     
		//  123  264:astore_1        
			  goto _L7
		//* 124  265:goto            165
_L6:
			obj = null;
		//  125  268:aconst_null     
		//  126  269:astore          5
			  goto _L8
		//* 127  271:goto            194
_L2:
			obj = ((Object) (getContext()));
		//  128  274:aload_0         
		//  129  275:getfield        #15  <Field BannerStandard this$0>
		//  130  278:invokevirtual   #50  <Method Context BannerStandard.getContext()>
		//  131  281:astore          5
			if(j < adHtml.m().length)
		//* 132  283:iload_3         
		//* 133  284:aload_0         
		//* 134  285:getfield        #15  <Field BannerStandard this$0>
		//* 135  288:getfield        #77  <Field a BannerStandard.adHtml>
		//* 136  291:invokevirtual   #87  <Method String[] a.m()>
		//* 137  294:arraylength     
		//* 138  295:icmpge          311
				webview = ((WebView) (adHtml.m()[j]));
		//  139  298:aload_0         
		//  140  299:getfield        #15  <Field BannerStandard this$0>
		//  141  302:getfield        #77  <Field a BannerStandard.adHtml>
		//  142  305:invokevirtual   #87  <Method String[] a.m()>
		//  143  308:iload_3         
		//  144  309:aaload          
		//  145  310:astore_1        
			obj1 = ((Object) (new com.startapp.android.publish.adsCommon.d.b(getAdTag())));
		//  146  311:new             #92  <Class com.startapp.android.publish.adsCommon.d.b>
		//  147  314:dup             
		//  148  315:aload_0         
		//  149  316:getfield        #15  <Field BannerStandard this$0>
		//  150  319:invokestatic    #126 <Method String BannerStandard.access$400(BannerStandard)>
		//  151  322:invokespecial   #99  <Method void com.startapp.android.publish.adsCommon.d.b(String)>
		//  152  325:astore          6
			if(adHtml.e(j) && !flag)
		//* 153  327:aload_0         
		//* 154  328:getfield        #15  <Field BannerStandard this$0>
		//* 155  331:getfield        #77  <Field a BannerStandard.adHtml>
		//* 156  334:iload_3         
		//* 157  335:invokevirtual   #104 <Method boolean a.e(int)>
		//* 158  338:ifeq            376
		//* 159  341:iload           4
		//* 160  343:ifne            376
				flag = true;
		//  161  346:iconst_1        
		//  162  347:istore          4
			else
		//* 163  349:aload           5
		//* 164  351:aload_2         
		//* 165  352:aload_1         
		//* 166  353:aload           6
		//* 167  355:iload           4
		//* 168  357:iconst_0        
		//* 169  358:invokestatic    #129 <Method void com.startapp.android.publish.adsCommon.c.a(Context, String, String, com.startapp.android.publish.adsCommon.d.b, boolean, boolean)>
		//* 170  361:goto            243
		//* 171  364:astore_1        
		//* 172  365:ldc1            #131 <String "BannerHtml">
		//* 173  367:bipush          6
		//* 174  369:ldc1            #133 <String "Error while trying parsing index from url">
		//* 175  371:invokestatic    #138 <Method void g.a(String, int, String)>
		//* 176  374:iconst_0        
		//* 177  375:ireturn         
				flag = false;
		//  178  376:iconst_0        
		//  179  377:istore          4
			try
			{
				com.startapp.android.publish.adsCommon.c.a(((Context) (obj)), s, ((String) (webview)), ((com.startapp.android.publish.adsCommon.d.b) (obj1)), flag, false);
			}
			// Misplaced declaration of an exception variable
			catch(WebView webview)
			{
				g.a("BannerHtml", 6, "Error while trying parsing index from url");
				return false;
			}
			  goto _L9
		//* 180  379:goto            349
			if(adHtml.d(0) && !flag)
		//* 181  382:aload_0         
		//* 182  383:getfield        #15  <Field BannerStandard this$0>
		//* 183  386:getfield        #77  <Field a BannerStandard.adHtml>
		//* 184  389:iconst_0        
		//* 185  390:invokevirtual   #83  <Method boolean com.startapp.android.publish.ads.banner.bannerstandard.a.d(int)>
		//* 186  393:ifeq            479
		//* 187  396:iload           4
		//* 188  398:ifne            479
			{
				com.startapp.android.publish.adsCommon.c.a(getContext(), s, adHtml.m()[0], adHtml.o()[0], new com.startapp.android.publish.adsCommon.d.b(getAdTag()), 5000L, adHtml.e(0), adHtml.f(0), false);
		//  189  401:aload_0         
		//  190  402:getfield        #15  <Field BannerStandard this$0>
		//  191  405:invokevirtual   #50  <Method Context BannerStandard.getContext()>
		//  192  408:aload_2         
		//  193  409:aload_0         
		//  194  410:getfield        #15  <Field BannerStandard this$0>
		//  195  413:getfield        #77  <Field a BannerStandard.adHtml>
		//  196  416:invokevirtual   #87  <Method String[] a.m()>
		//  197  419:iconst_0        
		//  198  420:aaload          
		//  199  421:aload_0         
		//  200  422:getfield        #15  <Field BannerStandard this$0>
		//  201  425:getfield        #77  <Field a BannerStandard.adHtml>
		//  202  428:invokevirtual   #90  <Method String[] a.o()>
		//  203  431:iconst_0        
		//  204  432:aaload          
		//  205  433:new             #92  <Class com.startapp.android.publish.adsCommon.d.b>
		//  206  436:dup             
		//  207  437:aload_0         
		//  208  438:getfield        #15  <Field BannerStandard this$0>
		//  209  441:invokestatic    #141 <Method String BannerStandard.access$500(BannerStandard)>
		//  210  444:invokespecial   #99  <Method void com.startapp.android.publish.adsCommon.d.b(String)>
		//  211  447:ldc2w           #100 <Long 5000L>
		//  212  450:aload_0         
		//  213  451:getfield        #15  <Field BannerStandard this$0>
		//  214  454:getfield        #77  <Field a BannerStandard.adHtml>
		//  215  457:iconst_0        
		//  216  458:invokevirtual   #104 <Method boolean a.e(int)>
		//  217  461:aload_0         
		//  218  462:getfield        #15  <Field BannerStandard this$0>
		//  219  465:getfield        #77  <Field a BannerStandard.adHtml>
		//  220  468:iconst_0        
		//  221  469:invokevirtual   #108 <Method Boolean com.startapp.android.publish.ads.banner.bannerstandard.a.f(int)>
		//  222  472:iconst_0        
		//  223  473:invokestatic    #111 <Method void com.startapp.android.publish.adsCommon.c.a(Context, String, String, String, com.startapp.android.publish.adsCommon.d.b, long, boolean, Boolean, boolean)>
			} else
		//* 224  476:goto            243
			{
				webview = ((WebView) (getContext()));
		//  225  479:aload_0         
		//  226  480:getfield        #15  <Field BannerStandard this$0>
		//  227  483:invokevirtual   #50  <Method Context BannerStandard.getContext()>
		//  228  486:astore_1        
				String s1 = adHtml.m()[0];
		//  229  487:aload_0         
		//  230  488:getfield        #15  <Field BannerStandard this$0>
		//  231  491:getfield        #77  <Field a BannerStandard.adHtml>
		//  232  494:invokevirtual   #87  <Method String[] a.m()>
		//  233  497:iconst_0        
		//  234  498:aaload          
		//  235  499:astore          5
				com.startapp.android.publish.adsCommon.d.b b1 = new com.startapp.android.publish.adsCommon.d.b(getAdTag());
		//  236  501:new             #92  <Class com.startapp.android.publish.adsCommon.d.b>
		//  237  504:dup             
		//  238  505:aload_0         
		//  239  506:getfield        #15  <Field BannerStandard this$0>
		//  240  509:invokestatic    #144 <Method String BannerStandard.access$600(BannerStandard)>
		//  241  512:invokespecial   #99  <Method void com.startapp.android.publish.adsCommon.d.b(String)>
		//  242  515:astore          6
				if(adHtml.e(0) && !flag)
		//* 243  517:aload_0         
		//* 244  518:getfield        #15  <Field BannerStandard this$0>
		//* 245  521:getfield        #77  <Field a BannerStandard.adHtml>
		//* 246  524:iconst_0        
		//* 247  525:invokevirtual   #104 <Method boolean a.e(int)>
		//* 248  528:ifeq            554
		//* 249  531:iload           4
		//* 250  533:ifne            554
					flag = true;
		//  251  536:iconst_1        
		//  252  537:istore          4
				else
		//* 253  539:aload_1         
		//* 254  540:aload_2         
		//* 255  541:aload           5
		//* 256  543:aload           6
		//* 257  545:iload           4
		//* 258  547:iconst_0        
		//* 259  548:invokestatic    #129 <Method void com.startapp.android.publish.adsCommon.c.a(Context, String, String, com.startapp.android.publish.adsCommon.d.b, boolean, boolean)>
		//* 260  551:goto            243
					flag = false;
		//  261  554:iconst_0        
		//  262  555:istore          4
				com.startapp.android.publish.adsCommon.c.a(((Context) (webview)), s, s1, b1, flag, false);
			}
			  goto _L9
		//* 263  557:goto            539
		}

		private boolean callbackSent;
		final BannerStandard this$0;

		MyWebViewClient()
		{
			this$0 = BannerStandard.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field BannerStandard this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void WebViewClient()>
			callbackSent = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #20  <Field boolean callbackSent>
		//    8   14:return          
		}
	}


	public BannerStandard(Activity activity)
	{
		this(((Context) (activity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #61  <Method void BannerStandard(Context)>
	//    3    5:return          
	}

	public BannerStandard(Activity activity, AttributeSet attributeset)
	{
		this(((Context) (activity)), attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #66  <Method void BannerStandard(Context, AttributeSet)>
	//    4    6:return          
	}

	public BannerStandard(Activity activity, AttributeSet attributeset, int j)
	{
		this(((Context) (activity)), attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #70  <Method void BannerStandard(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BannerStandard(Activity activity, BannerListener bannerlistener)
	{
		this(((Context) (activity)), bannerlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #74  <Method void BannerStandard(Context, BannerListener)>
	//    4    6:return          
	}

	public BannerStandard(Activity activity, AdPreferences adpreferences)
	{
		this(((Context) (activity)), adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #78  <Method void BannerStandard(Context, AdPreferences)>
	//    4    6:return          
	}

	public BannerStandard(Activity activity, AdPreferences adpreferences, BannerListener bannerlistener)
	{
		this(((Context) (activity)), adpreferences, bannerlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #82  <Method void BannerStandard(Context, AdPreferences, BannerListener)>
	//    5    7:return          
	}

	public BannerStandard(Activity activity, boolean flag)
	{
		this(((Context) (activity)), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #86  <Method void BannerStandard(Context, boolean)>
	//    4    6:return          
	}

	public BannerStandard(Activity activity, boolean flag, AdPreferences adpreferences)
	{
		this(((Context) (activity)), flag, adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #90  <Method void BannerStandard(Context, boolean, AdPreferences)>
	//    5    7:return          
	}

	public BannerStandard(Context context)
	{
		this(context, true, ((AdPreferences) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aconst_null     
	//    4    4:invokespecial   #90  <Method void BannerStandard(Context, boolean, AdPreferences)>
	//    5    7:return          
	}

	public BannerStandard(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #70  <Method void BannerStandard(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BannerStandard(Context context, AttributeSet attributeset, int j)
	{
		super(context, attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #95  <Method void BannerBase(Context, AttributeSet, int)>
		loaded = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #97  <Field boolean loaded>
		webViewTouched = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #99  <Field boolean webViewTouched>
		jsTag = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #101 <Field boolean jsTag>
		defaultLoad = true;
	//   14   22:aload_0         
	//   15   23:iconst_1        
	//   16   24:putfield        #103 <Field boolean defaultLoad>
		visible = true;
	//   17   27:aload_0         
	//   18   28:iconst_1        
	//   19   29:putfield        #105 <Field boolean visible>
		initBannerCalled = false;
	//   20   32:aload_0         
	//   21   33:iconst_0        
	//   22   34:putfield        #107 <Field boolean initBannerCalled>
		callbackSent = false;
	//   23   37:aload_0         
	//   24   38:iconst_0        
	//   25   39:putfield        #109 <Field boolean callbackSent>
		adInformationLayout = null;
	//   26   42:aload_0         
	//   27   43:aconst_null     
	//   28   44:putfield        #111 <Field b adInformationLayout>
		adInformationContatiner = null;
	//   29   47:aload_0         
	//   30   48:aconst_null     
	//   31   49:putfield        #113 <Field RelativeLayout adInformationContatiner>
		try
		{
			init();
	//   32   52:aload_0         
	//   33   53:invokevirtual   #117 <Method void init()>
			return;
	//   34   56:return          
		}
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset)
	//*  35   57:astore_2        
		{
			f.a(context, d.b, "BannerStandard.constructor - unexpected error occurd", ((Exception) (attributeset)).getMessage(), "");
	//   36   58:aload_1         
	//   37   59:getstatic       #123 <Field d d.b>
	//   38   62:ldc1            #125 <String "BannerStandard.constructor - unexpected error occurd">
	//   39   64:aload_2         
	//   40   65:invokevirtual   #129 <Method String Exception.getMessage()>
	//   41   68:ldc1            #131 <String "">
	//   42   70:invokestatic    #137 <Method void f.a(Context, d, String, String, String)>
		}
	//   43   73:return          
	}

	public BannerStandard(Context context, BannerListener bannerlistener)
	{
		this(context, true, ((AdPreferences) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aconst_null     
	//    4    4:invokespecial   #90  <Method void BannerStandard(Context, boolean, AdPreferences)>
		setBannerListener(bannerlistener);
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #141 <Method void setBannerListener(BannerListener)>
	//    8   12:return          
	}

	public BannerStandard(Context context, AdPreferences adpreferences)
	{
		this(context, true, adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aload_2         
	//    4    4:invokespecial   #90  <Method void BannerStandard(Context, boolean, AdPreferences)>
	//    5    7:return          
	}

	public BannerStandard(Context context, AdPreferences adpreferences, BannerListener bannerlistener)
	{
		this(context, true, adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:aload_2         
	//    4    4:invokespecial   #90  <Method void BannerStandard(Context, boolean, AdPreferences)>
		setBannerListener(bannerlistener);
	//    5    7:aload_0         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #141 <Method void setBannerListener(BannerListener)>
	//    8   12:return          
	}

	public BannerStandard(Context context, boolean flag)
	{
		this(context, flag, ((AdPreferences) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #90  <Method void BannerStandard(Context, boolean, AdPreferences)>
	//    5    7:return          
	}

	public BannerStandard(Context context, boolean flag, AdPreferences adpreferences)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #142 <Method void BannerBase(Context)>
		loaded = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #97  <Field boolean loaded>
		webViewTouched = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #99  <Field boolean webViewTouched>
		jsTag = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #101 <Field boolean jsTag>
		defaultLoad = true;
	//   12   20:aload_0         
	//   13   21:iconst_1        
	//   14   22:putfield        #103 <Field boolean defaultLoad>
		visible = true;
	//   15   25:aload_0         
	//   16   26:iconst_1        
	//   17   27:putfield        #105 <Field boolean visible>
		initBannerCalled = false;
	//   18   30:aload_0         
	//   19   31:iconst_0        
	//   20   32:putfield        #107 <Field boolean initBannerCalled>
		callbackSent = false;
	//   21   35:aload_0         
	//   22   36:iconst_0        
	//   23   37:putfield        #109 <Field boolean callbackSent>
		adInformationLayout = null;
	//   24   40:aload_0         
	//   25   41:aconst_null     
	//   26   42:putfield        #111 <Field b adInformationLayout>
		adInformationContatiner = null;
	//   27   45:aload_0         
	//   28   46:aconst_null     
	//   29   47:putfield        #113 <Field RelativeLayout adInformationContatiner>
		try
		{
			defaultLoad = flag;
	//   30   50:aload_0         
	//   31   51:iload_2         
	//   32   52:putfield        #103 <Field boolean defaultLoad>
			adPreferences = adpreferences;
	//   33   55:aload_0         
	//   34   56:aload_3         
	//   35   57:putfield        #144 <Field AdPreferences adPreferences>
			init();
	//   36   60:aload_0         
	//   37   61:invokevirtual   #117 <Method void init()>
			return;
	//   38   64:return          
		}
		// Misplaced declaration of an exception variable
		catch(AdPreferences adpreferences)
	//*  39   65:astore_3        
		{
			f.a(context, d.b, "BannerStandard.constructor - unexpected error occurd", ((Exception) (adpreferences)).getMessage(), "");
	//   40   66:aload_1         
	//   41   67:getstatic       #123 <Field d d.b>
	//   42   70:ldc1            #125 <String "BannerStandard.constructor - unexpected error occurd">
	//   43   72:aload_3         
	//   44   73:invokevirtual   #129 <Method String Exception.getMessage()>
	//   45   76:ldc1            #131 <String "">
	//   46   78:invokestatic    #137 <Method void f.a(Context, d, String, String, String)>
		}
	//   47   81:return          
	}

	private void addAdInformationLayout()
	{
		android.widget.RelativeLayout.LayoutParams layoutparams;
		layoutparams = new android.widget.RelativeLayout.LayoutParams(getSuggestedMinimumWidth(), getSuggestedMinimumHeight());
	//    0    0:new             #166 <Class android.widget.RelativeLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #170 <Method int getSuggestedMinimumWidth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #173 <Method int getSuggestedMinimumHeight()>
	//    6   12:invokespecial   #176 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//    7   15:astore_1        
		layoutparams.addRule(13);
	//    8   16:aload_1         
	//    9   17:bipush          13
	//   10   19:invokevirtual   #180 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		if(adInformationLayout == null && adInformationContatiner == null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #111 <Field b adInformationLayout>
	//*  13   26:ifnonnull       90
	//*  14   29:aload_0         
	//*  15   30:getfield        #113 <Field RelativeLayout adInformationContatiner>
	//*  16   33:ifnonnull       90
		{
			adInformationContatiner = new RelativeLayout(getContext());
	//   17   36:aload_0         
	//   18   37:new             #182 <Class RelativeLayout>
	//   19   40:dup             
	//   20   41:aload_0         
	//   21   42:invokevirtual   #186 <Method Context getContext()>
	//   22   45:invokespecial   #187 <Method void RelativeLayout(Context)>
	//   23   48:putfield        #113 <Field RelativeLayout adInformationContatiner>
			adInformationLayout = new b(getContext(), com.startapp.android.publish.adsCommon.adinformation.b.b.a, com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_BANNER, adHtml.getAdInfoOverride());
	//   24   51:aload_0         
	//   25   52:new             #189 <Class b>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:invokevirtual   #186 <Method Context getContext()>
	//   29   60:getstatic       #194 <Field com.startapp.android.publish.adsCommon.adinformation.b$b com.startapp.android.publish.adsCommon.adinformation.b$b.a>
	//   30   63:getstatic       #200 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_BANNER>
	//   31   66:aload_0         
	//   32   67:getfield        #202 <Field a adHtml>
	//   33   70:invokevirtual   #208 <Method com.startapp.android.publish.adsCommon.adinformation.c a.getAdInfoOverride()>
	//   34   73:invokespecial   #211 <Method void b(Context, com.startapp.android.publish.adsCommon.adinformation.b$b, com.startapp.android.publish.common.model.AdPreferences$Placement, com.startapp.android.publish.adsCommon.adinformation.c)>
	//   35   76:putfield        #111 <Field b adInformationLayout>
			adInformationLayout.a(adInformationContatiner);
	//   36   79:aload_0         
	//   37   80:getfield        #111 <Field b adInformationLayout>
	//   38   83:aload_0         
	//   39   84:getfield        #113 <Field RelativeLayout adInformationContatiner>
	//   40   87:invokevirtual   #214 <Method void b.a(RelativeLayout)>
		}
		ViewGroup viewgroup = (ViewGroup)adInformationContatiner.getParent();
	//   41   90:aload_0         
	//   42   91:getfield        #113 <Field RelativeLayout adInformationContatiner>
	//   43   94:invokevirtual   #218 <Method android.view.ViewParent RelativeLayout.getParent()>
	//   44   97:checkcast       #220 <Class ViewGroup>
	//   45  100:astore_2        
		if(viewgroup != null)
	//*  46  101:aload_2         
	//*  47  102:ifnull          113
			try
			{
				viewgroup.removeView(((View) (adInformationContatiner)));
	//   48  105:aload_2         
	//   49  106:aload_0         
	//   50  107:getfield        #113 <Field RelativeLayout adInformationContatiner>
	//   51  110:invokevirtual   #224 <Method void ViewGroup.removeView(View)>
			}
	//*  52  113:aload_0         
	//*  53  114:aload_0         
	//*  54  115:getfield        #113 <Field RelativeLayout adInformationContatiner>
	//*  55  118:aload_1         
	//*  56  119:invokevirtual   #228 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
	//*  57  122:return          
			catch(Exception exception) { }
	//   58  123:astore_2        
		addView(((View) (adInformationContatiner)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
		return;
	//*  59  124:goto            113
	}

	private void determineSizeByScreen(Point point, View view)
	{
		setPointWidthIfNotSet(point, h.b(getContext(), view.getMeasuredWidth()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #186 <Method Context getContext()>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #235 <Method int View.getMeasuredWidth()>
	//    6   10:invokestatic    #240 <Method int h.b(Context, int)>
	//    7   13:invokespecial   #244 <Method void setPointWidthIfNotSet(Point, int)>
		setPointHeightIfNotSet(point, h.b(getContext(), view.getMeasuredHeight()));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #186 <Method Context getContext()>
	//   12   22:aload_2         
	//   13   23:invokevirtual   #247 <Method int View.getMeasuredHeight()>
	//   14   26:invokestatic    #240 <Method int h.b(Context, int)>
	//   15   29:invokespecial   #250 <Method void setPointHeightIfNotSet(Point, int)>
	//   16   32:return          
	}

	private Point getAvailableSize()
	{
		Point point;
		point = new Point();
	//    0    0:new             #254 <Class Point>
	//    1    3:dup             
	//    2    4:invokespecial   #256 <Method void Point()>
	//    3    7:astore_3        
		if(getLayoutParams() != null && getLayoutParams().width > 0)
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*   6   12:ifnull          45
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*   9   19:getfield        #265 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  10   22:ifle            45
			point.x = h.b(getContext(), getLayoutParams().width + 1);
	//   11   25:aload_3         
	//   12   26:aload_0         
	//   13   27:invokevirtual   #186 <Method Context getContext()>
	//   14   30:aload_0         
	//   15   31:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   16   34:getfield        #265 <Field int android.view.ViewGroup$LayoutParams.width>
	//   17   37:iconst_1        
	//   18   38:iadd            
	//   19   39:invokestatic    #240 <Method int h.b(Context, int)>
	//   20   42:putfield        #268 <Field int Point.x>
		if(getLayoutParams() != null && getLayoutParams().height > 0)
	//*  21   45:aload_0         
	//*  22   46:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  23   49:ifnull          82
	//*  24   52:aload_0         
	//*  25   53:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  26   56:getfield        #271 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  27   59:ifle            82
			point.y = h.b(getContext(), getLayoutParams().height + 1);
	//   28   62:aload_3         
	//   29   63:aload_0         
	//   30   64:invokevirtual   #186 <Method Context getContext()>
	//   31   67:aload_0         
	//   32   68:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   33   71:getfield        #271 <Field int android.view.ViewGroup$LayoutParams.height>
	//   34   74:iconst_1        
	//   35   75:iadd            
	//   36   76:invokestatic    #240 <Method int h.b(Context, int)>
	//   37   79:putfield        #274 <Field int Point.y>
		if(getLayoutParams() != null && getLayoutParams().width > 0 && getLayoutParams().height > 0)
	//*  38   82:aload_0         
	//*  39   83:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  40   86:ifnull          117
	//*  41   89:aload_0         
	//*  42   90:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  43   93:getfield        #265 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  44   96:ifle            117
	//*  45   99:aload_0         
	//*  46  100:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  47  103:getfield        #271 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  48  106:ifle            117
			adHtml.a(true);
	//   49  109:aload_0         
	//   50  110:getfield        #202 <Field a adHtml>
	//   51  113:iconst_1        
	//   52  114:invokevirtual   #277 <Method void a.a(boolean)>
		if(getLayoutParams() != null && getLayoutParams().width > 0 && getLayoutParams().height > 0) goto _L2; else goto _L1
	//   53  117:aload_0         
	//   54  118:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   55  121:ifnull          144
	//   56  124:aload_0         
	//   57  125:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   58  128:getfield        #265 <Field int android.view.ViewGroup$LayoutParams.width>
	//   59  131:ifle            144
	//   60  134:aload_0         
	//   61  135:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   62  138:getfield        #271 <Field int android.view.ViewGroup$LayoutParams.height>
	//   63  141:ifgt            305
_L1:
		Object obj = ((Object) (getContext()));
	//   64  144:aload_0         
	//   65  145:invokevirtual   #186 <Method Context getContext()>
	//   66  148:astore_1        
		if(!(obj instanceof Activity)) goto _L4; else goto _L3
	//   67  149:aload_1         
	//   68  150:instanceof      #279 <Class Activity>
	//   69  153:ifeq            421
_L3:
		View view = ((Activity)obj).getWindow().getDecorView();
	//   70  156:aload_1         
	//   71  157:checkcast       #279 <Class Activity>
	//   72  160:invokevirtual   #283 <Method Window Activity.getWindow()>
	//   73  163:invokevirtual   #289 <Method View Window.getDecorView()>
	//   74  166:astore          4
		Object obj1 = ((Object) ((View)getParent()));
	//   75  168:aload_0         
	//   76  169:invokevirtual   #290 <Method android.view.ViewParent getParent()>
	//   77  172:checkcast       #232 <Class View>
	//   78  175:astore_2        
		obj = obj1;
	//   79  176:aload_2         
	//   80  177:astore_1        
		if(obj1 instanceof Banner)
	//*  81  178:aload_2         
	//*  82  179:instanceof      #292 <Class Banner>
	//*  83  182:ifeq            196
			obj = ((Object) ((View)(View)((View) (obj1)).getParent()));
	//   84  185:aload_2         
	//   85  186:invokevirtual   #293 <Method android.view.ViewParent View.getParent()>
	//   86  189:checkcast       #232 <Class View>
	//   87  192:checkcast       #232 <Class View>
	//   88  195:astore_1        
_L6:
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   89  196:aload_1         
	//   90  197:ifnull          294
		if(((View) (obj)).getMeasuredWidth() > 0 && ((View) (obj)).getMeasuredHeight() > 0)
			break; /* Loop/switch isn't completed */
	//   91  200:aload_1         
	//   92  201:invokevirtual   #235 <Method int View.getMeasuredWidth()>
	//   93  204:ifle            214
	//   94  207:aload_1         
	//   95  208:invokevirtual   #247 <Method int View.getMeasuredHeight()>
	//   96  211:ifgt            294
		if(((View) (obj)).getMeasuredWidth() > 0)
	//*  97  214:aload_1         
	//*  98  215:invokevirtual   #235 <Method int View.getMeasuredWidth()>
	//*  99  218:ifle            247
			setPointWidthIfNotSet(point, h.b(getContext(), ((View) (obj)).getMeasuredWidth() - ((View) (obj)).getPaddingLeft() - ((View) (obj)).getPaddingRight()));
	//  100  221:aload_0         
	//  101  222:aload_3         
	//  102  223:aload_0         
	//  103  224:invokevirtual   #186 <Method Context getContext()>
	//  104  227:aload_1         
	//  105  228:invokevirtual   #235 <Method int View.getMeasuredWidth()>
	//  106  231:aload_1         
	//  107  232:invokevirtual   #296 <Method int View.getPaddingLeft()>
	//  108  235:isub            
	//  109  236:aload_1         
	//  110  237:invokevirtual   #299 <Method int View.getPaddingRight()>
	//  111  240:isub            
	//  112  241:invokestatic    #240 <Method int h.b(Context, int)>
	//  113  244:invokespecial   #244 <Method void setPointWidthIfNotSet(Point, int)>
		if(((View) (obj)).getMeasuredHeight() > 0)
	//* 114  247:aload_1         
	//* 115  248:invokevirtual   #247 <Method int View.getMeasuredHeight()>
	//* 116  251:ifle            280
			setPointHeightIfNotSet(point, h.b(getContext(), ((View) (obj)).getMeasuredHeight() - ((View) (obj)).getPaddingBottom() - ((View) (obj)).getPaddingTop()));
	//  117  254:aload_0         
	//  118  255:aload_3         
	//  119  256:aload_0         
	//  120  257:invokevirtual   #186 <Method Context getContext()>
	//  121  260:aload_1         
	//  122  261:invokevirtual   #247 <Method int View.getMeasuredHeight()>
	//  123  264:aload_1         
	//  124  265:invokevirtual   #302 <Method int View.getPaddingBottom()>
	//  125  268:isub            
	//  126  269:aload_1         
	//  127  270:invokevirtual   #305 <Method int View.getPaddingTop()>
	//  128  273:isub            
	//  129  274:invokestatic    #240 <Method int h.b(Context, int)>
	//  130  277:invokespecial   #250 <Method void setPointHeightIfNotSet(Point, int)>
		obj = ((Object) ((View)(View)((View) (obj)).getParent()));
	//  131  280:aload_1         
	//  132  281:invokevirtual   #293 <Method android.view.ViewParent View.getParent()>
	//  133  284:checkcast       #232 <Class View>
	//  134  287:checkcast       #232 <Class View>
	//  135  290:astore_1        
		if(true) goto _L6; else goto _L5
	//  136  291:goto            196
_L5:
		if(obj != null) goto _L8; else goto _L7
	//  137  294:aload_1         
	//  138  295:ifnonnull       355
_L7:
		try
		{
			determineSizeByScreen(point, view);
	//  139  298:aload_0         
	//  140  299:aload_3         
	//  141  300:aload           4
	//  142  302:invokespecial   #307 <Method void determineSizeByScreen(Point, View)>
		}
	//* 143  305:ldc1            #28  <String "BannerHtml">
	//* 144  307:iconst_3        
	//* 145  308:new             #309 <Class StringBuilder>
	//* 146  311:dup             
	//* 147  312:invokespecial   #310 <Method void StringBuilder()>
	//* 148  315:ldc2            #312 <String "============ exit Application Size [">
	//* 149  318:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//* 150  321:aload_3         
	//* 151  322:getfield        #268 <Field int Point.x>
	//* 152  325:invokevirtual   #319 <Method StringBuilder StringBuilder.append(int)>
	//* 153  328:ldc2            #321 <String ",">
	//* 154  331:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//* 155  334:aload_3         
	//* 156  335:getfield        #274 <Field int Point.y>
	//* 157  338:invokevirtual   #319 <Method StringBuilder StringBuilder.append(int)>
	//* 158  341:ldc2            #323 <String "] =========">
	//* 159  344:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//* 160  347:invokevirtual   #326 <Method String StringBuilder.toString()>
	//* 161  350:invokestatic    #331 <Method void g.a(String, int, String)>
	//* 162  353:aload_3         
	//* 163  354:areturn         
	//* 164  355:aload_0         
	//* 165  356:aload_3         
	//* 166  357:aload_0         
	//* 167  358:invokevirtual   #186 <Method Context getContext()>
	//* 168  361:aload_1         
	//* 169  362:invokevirtual   #235 <Method int View.getMeasuredWidth()>
	//* 170  365:aload_1         
	//* 171  366:invokevirtual   #296 <Method int View.getPaddingLeft()>
	//* 172  369:isub            
	//* 173  370:aload_1         
	//* 174  371:invokevirtual   #299 <Method int View.getPaddingRight()>
	//* 175  374:isub            
	//* 176  375:invokestatic    #240 <Method int h.b(Context, int)>
	//* 177  378:invokespecial   #244 <Method void setPointWidthIfNotSet(Point, int)>
	//* 178  381:aload_0         
	//* 179  382:aload_3         
	//* 180  383:aload_0         
	//* 181  384:invokevirtual   #186 <Method Context getContext()>
	//* 182  387:aload_1         
	//* 183  388:invokevirtual   #247 <Method int View.getMeasuredHeight()>
	//* 184  391:aload_1         
	//* 185  392:invokevirtual   #302 <Method int View.getPaddingBottom()>
	//* 186  395:isub            
	//* 187  396:aload_1         
	//* 188  397:invokevirtual   #305 <Method int View.getPaddingTop()>
	//* 189  400:isub            
	//* 190  401:invokestatic    #240 <Method int h.b(Context, int)>
	//* 191  404:invokespecial   #250 <Method void setPointHeightIfNotSet(Point, int)>
	//* 192  407:goto            305
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//* 193  410:astore_1        
		{
			determineSizeByScreen(point, view);
	//  194  411:aload_0         
	//  195  412:aload_3         
	//  196  413:aload           4
	//  197  415:invokespecial   #307 <Method void determineSizeByScreen(Point, View)>
		}
_L2:
		g.a("BannerHtml", 3, (new StringBuilder()).append("============ exit Application Size [").append(point.x).append(",").append(point.y).append("] =========").toString());
		return point;
_L8:
		setPointWidthIfNotSet(point, h.b(getContext(), ((View) (obj)).getMeasuredWidth() - ((View) (obj)).getPaddingLeft() - ((View) (obj)).getPaddingRight()));
		setPointHeightIfNotSet(point, h.b(getContext(), ((View) (obj)).getMeasuredHeight() - ((View) (obj)).getPaddingBottom() - ((View) (obj)).getPaddingTop()));
		continue; /* Loop/switch isn't completed */
	//* 198  418:goto            305
_L4:
		obj1 = ((Object) ((WindowManager)getContext().getSystemService("window")));
	//  199  421:aload_0         
	//  200  422:invokevirtual   #186 <Method Context getContext()>
	//  201  425:ldc2            #333 <String "window">
	//  202  428:invokevirtual   #339 <Method Object Context.getSystemService(String)>
	//  203  431:checkcast       #341 <Class WindowManager>
	//  204  434:astore_2        
		setPointWidthIfNotSet(point, getWidthInDp());
	//  205  435:aload_0         
	//  206  436:aload_3         
	//  207  437:aload_0         
	//  208  438:invokevirtual   #344 <Method int getWidthInDp()>
	//  209  441:invokespecial   #244 <Method void setPointWidthIfNotSet(Point, int)>
		setPointHeightIfNotSet(point, getHeightInDp());
	//  210  444:aload_0         
	//  211  445:aload_3         
	//  212  446:aload_0         
	//  213  447:invokevirtual   #347 <Method int getHeightInDp()>
	//  214  450:invokespecial   #250 <Method void setPointHeightIfNotSet(Point, int)>
		if(obj1 != null && obj != null)
	//* 215  453:aload_2         
	//* 216  454:ifnull          305
	//* 217  457:aload_1         
	//* 218  458:ifnull          305
			try
			{
				h.a(((Context) (obj)), ((WindowManager) (obj1)), point);
	//  219  461:aload_1         
	//  220  462:aload_2         
	//  221  463:aload_3         
	//  222  464:invokestatic    #350 <Method void h.a(Context, WindowManager, Point)>
			}
	//* 223  467:goto            305
			catch(Exception exception)
	//* 224  470:astore_2        
			{
				f.a(((Context) (obj)), d.b, "BannerStandard.getAvailableSize - system service failed", exception.getMessage(), "");
	//  225  471:aload_1         
	//  226  472:getstatic       #123 <Field d d.b>
	//  227  475:ldc2            #352 <String "BannerStandard.getAvailableSize - system service failed">
	//  228  478:aload_2         
	//  229  479:invokevirtual   #129 <Method String Exception.getMessage()>
	//  230  482:ldc1            #131 <String "">
	//  231  484:invokestatic    #137 <Method void f.a(Context, d, String, String, String)>
			}
		if(true) goto _L2; else goto _L9
	//  232  487:goto            305
_L9:
	}

	private long getImpressionDelayMillis()
	{
		if(adHtml.p() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #202 <Field a adHtml>
	//*   2    4:invokevirtual   #358 <Method Long a.p()>
	//*   3    7:ifnull          27
			return TimeUnit.SECONDS.toMillis(adHtml.p().longValue());
	//    4   10:getstatic       #364 <Field TimeUnit TimeUnit.SECONDS>
	//    5   13:aload_0         
	//    6   14:getfield        #202 <Field a adHtml>
	//    7   17:invokevirtual   #358 <Method Long a.p()>
	//    8   20:invokevirtual   #369 <Method long Long.longValue()>
	//    9   23:invokevirtual   #373 <Method long TimeUnit.toMillis(long)>
	//   10   26:lreturn         
		else
			return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
	//   11   27:getstatic       #364 <Field TimeUnit TimeUnit.SECONDS>
	//   12   30:invokestatic    #379 <Method MetaData MetaData.getInstance()>
	//   13   33:invokevirtual   #382 <Method long MetaData.getIABDisplayImpressionDelayInSeconds()>
	//   14   36:invokevirtual   #373 <Method long TimeUnit.toMillis(long)>
	//   15   39:lreturn         
	}

	private void loadHtml()
	{
		i.a(getContext(), webView, adHtml.f());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #186 <Method Context getContext()>
	//    2    4:aload_0         
	//    3    5:getfield        #385 <Field WebView webView>
	//    4    8:aload_0         
	//    5    9:getfield        #202 <Field a adHtml>
	//    6   12:invokevirtual   #388 <Method String com.startapp.android.publish.ads.banner.bannerstandard.a.f()>
	//    7   15:invokestatic    #393 <Method void i.a(Context, WebView, String)>
	//    8   18:return          
	}

	private void onFailedToReceiveBanner(String s)
	{
		setErrorMessage(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #398 <Method void setErrorMessage(String)>
		if(listener != null && !callbackSent)
	//*   3    5:aload_0         
	//*   4    6:getfield        #400 <Field BannerListener listener>
	//*   5    9:ifnull          34
	//*   6   12:aload_0         
	//*   7   13:getfield        #109 <Field boolean callbackSent>
	//*   8   16:ifne            34
		{
			callbackSent = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #109 <Field boolean callbackSent>
			listener.onFailedToReceiveAd(((View) (this)));
	//   12   24:aload_0         
	//   13   25:getfield        #400 <Field BannerListener listener>
	//   14   28:aload_0         
	//   15   29:invokeinterface #405 <Method void BannerListener.onFailedToReceiveAd(View)>
		}
	//   16   34:return          
	}

	private void onPause()
	{
		if(webView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #385 <Field WebView webView>
	//*   2    4:ifnull          14
			c.b(webView);
	//    3    7:aload_0         
	//    4    8:getfield        #385 <Field WebView webView>
	//    5   11:invokestatic    #411 <Method void c.b(WebView)>
	//    6   14:return          
	}

	private void onResume()
	{
		if(webView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #385 <Field WebView webView>
	//*   2    4:ifnull          14
			c.c(webView);
	//    3    7:aload_0         
	//    4    8:getfield        #385 <Field WebView webView>
	//    5   11:invokestatic    #415 <Method void c.c(WebView)>
	//    6   14:return          
	}

	private void setPointHeightIfNotSet(Point point, int j)
	{
		if(point.y <= 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #274 <Field int Point.y>
	//*   2    4:ifgt            12
			point.y = j;
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:putfield        #274 <Field int Point.y>
	//    6   12:return          
	}

	private void setPointWidthIfNotSet(Point point, int j)
	{
		if(point.x <= 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #268 <Field int Point.x>
	//*   2    4:ifgt            12
			point.x = j;
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:putfield        #268 <Field int Point.x>
	//    6   12:return          
	}

	private boolean setSize(int j, int k)
	{
		Object obj = ((Object) (getAvailableSize()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #419 <Method Point getAvailableSize()>
	//    2    4:astore_3        
		if(((Point) (obj)).x >= j && ((Point) (obj)).y >= k)
	//*   3    5:aload_3         
	//*   4    6:getfield        #268 <Field int Point.x>
	//*   5    9:iload_1         
	//*   6   10:icmplt          115
	//*   7   13:aload_3         
	//*   8   14:getfield        #274 <Field int Point.y>
	//*   9   17:iload_2         
	//*  10   18:icmplt          115
		{
			size.a(j, k);
	//   11   21:aload_0         
	//   12   22:getfield        #421 <Field com.startapp.android.publish.ads.banner.d size>
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #425 <Method void com.startapp.android.publish.ads.banner.d.a(int, int)>
			j = h.a(getContext(), size.a());
	//   16   30:aload_0         
	//   17   31:invokevirtual   #186 <Method Context getContext()>
	//   18   34:aload_0         
	//   19   35:getfield        #421 <Field com.startapp.android.publish.ads.banner.d size>
	//   20   38:invokevirtual   #427 <Method int com.startapp.android.publish.ads.banner.d.a()>
	//   21   41:invokestatic    #429 <Method int h.a(Context, int)>
	//   22   44:istore_1        
			k = h.a(getContext(), size.b());
	//   23   45:aload_0         
	//   24   46:invokevirtual   #186 <Method Context getContext()>
	//   25   49:aload_0         
	//   26   50:getfield        #421 <Field com.startapp.android.publish.ads.banner.d size>
	//   27   53:invokevirtual   #431 <Method int com.startapp.android.publish.ads.banner.d.b()>
	//   28   56:invokestatic    #429 <Method int h.a(Context, int)>
	//   29   59:istore_2        
			setMinimumWidth(j);
	//   30   60:aload_0         
	//   31   61:iload_1         
	//   32   62:invokevirtual   #434 <Method void setMinimumWidth(int)>
			setMinimumHeight(k);
	//   33   65:aload_0         
	//   34   66:iload_2         
	//   35   67:invokevirtual   #437 <Method void setMinimumHeight(int)>
			obj = ((Object) (webView.getLayoutParams()));
	//   36   70:aload_0         
	//   37   71:getfield        #385 <Field WebView webView>
	//   38   74:invokevirtual   #440 <Method android.view.ViewGroup$LayoutParams WebView.getLayoutParams()>
	//   39   77:astore_3        
			if(obj == null)
	//*  40   78:aload_3         
	//*  41   79:ifnonnull       102
			{
				obj = ((Object) (new android.widget.RelativeLayout.LayoutParams(j, k)));
	//   42   82:new             #166 <Class android.widget.RelativeLayout$LayoutParams>
	//   43   85:dup             
	//   44   86:iload_1         
	//   45   87:iload_2         
	//   46   88:invokespecial   #176 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   47   91:astore_3        
			} else
	//*  48   92:aload_0         
	//*  49   93:getfield        #385 <Field WebView webView>
	//*  50   96:aload_3         
	//*  51   97:invokevirtual   #444 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  52  100:iconst_1        
	//*  53  101:ireturn         
			{
				obj.width = j;
	//   54  102:aload_3         
	//   55  103:iload_1         
	//   56  104:putfield        #265 <Field int android.view.ViewGroup$LayoutParams.width>
				obj.height = k;
	//   57  107:aload_3         
	//   58  108:iload_2         
	//   59  109:putfield        #271 <Field int android.view.ViewGroup$LayoutParams.height>
			}
			webView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
			return true;
		}
	//*  60  112:goto            92
		Point point = new Point(0, 0);
	//   61  115:new             #254 <Class Point>
	//   62  118:dup             
	//   63  119:iconst_0        
	//   64  120:iconst_0        
	//   65  121:invokespecial   #445 <Method void Point(int, int)>
	//   66  124:astore          4
		obj = ((Object) (webView.getLayoutParams()));
	//   67  126:aload_0         
	//   68  127:getfield        #385 <Field WebView webView>
	//   69  130:invokevirtual   #440 <Method android.view.ViewGroup$LayoutParams WebView.getLayoutParams()>
	//   70  133:astore_3        
		if(obj == null)
	//*  71  134:aload_3         
	//*  72  135:ifnonnull       166
		{
			obj = ((Object) (new android.widget.RelativeLayout.LayoutParams(point.x, point.y)));
	//   73  138:new             #166 <Class android.widget.RelativeLayout$LayoutParams>
	//   74  141:dup             
	//   75  142:aload           4
	//   76  144:getfield        #268 <Field int Point.x>
	//   77  147:aload           4
	//   78  149:getfield        #274 <Field int Point.y>
	//   79  152:invokespecial   #176 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   80  155:astore_3        
		} else
	//*  81  156:aload_0         
	//*  82  157:getfield        #385 <Field WebView webView>
	//*  83  160:aload_3         
	//*  84  161:invokevirtual   #444 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  85  164:iconst_0        
	//*  86  165:ireturn         
		{
			obj.width = point.x;
	//   87  166:aload_3         
	//   88  167:aload           4
	//   89  169:getfield        #268 <Field int Point.x>
	//   90  172:putfield        #265 <Field int android.view.ViewGroup$LayoutParams.width>
			obj.height = point.y;
	//   91  175:aload_3         
	//   92  176:aload           4
	//   93  178:getfield        #274 <Field int Point.y>
	//   94  181:putfield        #271 <Field int android.view.ViewGroup$LayoutParams.height>
		}
		webView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
		return false;
	//*  95  184:goto            156
	}

	protected void cancelScheduledImpression(boolean flag)
	{
		if(scheduledImpression != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #448 <Field com.startapp.android.publish.adsCommon.i scheduledImpression>
	//*   2    4:ifnull          15
			scheduledImpression.a(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #448 <Field com.startapp.android.publish.adsCommon.i scheduledImpression>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #451 <Method void com.startapp.android.publish.adsCommon.i.a(boolean)>
	//    7   15:return          
	}

	protected int getBannerId()
	{
		return innerBannerStandardId;
	//    0    0:aload_0         
	//    1    1:getfield        #455 <Field int innerBannerStandardId>
	//    2    4:ireturn         
	}

	protected String getBannerName()
	{
		return "StartApp Banner";
	//    0    0:ldc2            #458 <String "StartApp Banner">
	//    1    3:areturn         
	}

	protected int getBannerType()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected int getHeightInDp()
	{
		return 50;
	//    0    0:bipush          50
	//    1    2:ireturn         
	}

	protected int getOffset()
	{
		if(adHtml == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #202 <Field a adHtml>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return adHtml.a();
	//    5    9:aload_0         
	//    6   10:getfield        #202 <Field a adHtml>
	//    7   13:invokevirtual   #461 <Method int a.a()>
	//    8   16:ireturn         
	}

	protected int getRefreshRate()
	{
		return options.i();
	//    0    0:aload_0         
	//    1    1:getfield        #464 <Field BannerOptions options>
	//    2    4:invokevirtual   #469 <Method int BannerOptions.i()>
	//    3    7:ireturn         
	}

	protected int getWidthInDp()
	{
		return 300;
	//    0    0:sipush          300
	//    1    3:ireturn         
	}

	public void hideBanner()
	{
		visible = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #105 <Field boolean visible>
		setVisibility(8);
	//    3    5:aload_0         
	//    4    6:bipush          8
	//    5    8:invokevirtual   #473 <Method void setVisibility(int)>
	//    6   11:return          
	}

	protected void initBanner()
	{
		if(initBannerCalled || webView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field boolean initBannerCalled>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #385 <Field WebView webView>
	//*   5   11:ifnonnull       15
			return;
	//    6   14:return          
		g.a("BannerHtml", 3, "Initializing BannerHtml");
	//    7   15:ldc1            #28  <String "BannerHtml">
	//    8   17:iconst_3        
	//    9   18:ldc2            #476 <String "Initializing BannerHtml">
	//   10   21:invokestatic    #331 <Method void g.a(String, int, String)>
		initBannerCalled = true;
	//   11   24:aload_0         
	//   12   25:iconst_1        
	//   13   26:putfield        #107 <Field boolean initBannerCalled>
		int j = h.a(getContext(), size.a());
	//   14   29:aload_0         
	//   15   30:invokevirtual   #186 <Method Context getContext()>
	//   16   33:aload_0         
	//   17   34:getfield        #421 <Field com.startapp.android.publish.ads.banner.d size>
	//   18   37:invokevirtual   #427 <Method int com.startapp.android.publish.ads.banner.d.a()>
	//   19   40:invokestatic    #429 <Method int h.a(Context, int)>
	//   20   43:istore_1        
		int k = h.a(getContext(), size.b());
	//   21   44:aload_0         
	//   22   45:invokevirtual   #186 <Method Context getContext()>
	//   23   48:aload_0         
	//   24   49:getfield        #421 <Field com.startapp.android.publish.ads.banner.d size>
	//   25   52:invokevirtual   #431 <Method int com.startapp.android.publish.ads.banner.d.b()>
	//   26   55:invokestatic    #429 <Method int h.a(Context, int)>
	//   27   58:istore_2        
		setMinimumWidth(j);
	//   28   59:aload_0         
	//   29   60:iload_1         
	//   30   61:invokevirtual   #434 <Method void setMinimumWidth(int)>
		setMinimumHeight(k);
	//   31   64:aload_0         
	//   32   65:iload_2         
	//   33   66:invokevirtual   #437 <Method void setMinimumHeight(int)>
		webView.addJavascriptInterface(((Object) (new JsInterface(getContext(), new Runnable() {

			public void run()
			{
			//    0    0:return          
			}

			final BannerStandard this$0;

			
			{
				this$0 = BannerStandard.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BannerStandard this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, new com.startapp.android.publish.adsCommon.d.b(getAdTag()), adHtml.e(0)))), "startappwall");
	//   34   69:aload_0         
	//   35   70:getfield        #385 <Field WebView webView>
	//   36   73:new             #478 <Class JsInterface>
	//   37   76:dup             
	//   38   77:aload_0         
	//   39   78:invokevirtual   #186 <Method Context getContext()>
	//   40   81:new             #18  <Class BannerStandard$5>
	//   41   84:dup             
	//   42   85:aload_0         
	//   43   86:invokespecial   #481 <Method void BannerStandard$5(BannerStandard)>
	//   44   89:new             #483 <Class com.startapp.android.publish.adsCommon.d.b>
	//   45   92:dup             
	//   46   93:aload_0         
	//   47   94:invokevirtual   #160 <Method String getAdTag()>
	//   48   97:invokespecial   #485 <Method void com.startapp.android.publish.adsCommon.d.b(String)>
	//   49  100:aload_0         
	//   50  101:getfield        #202 <Field a adHtml>
	//   51  104:iconst_0        
	//   52  105:invokevirtual   #489 <Method boolean a.e(int)>
	//   53  108:invokespecial   #492 <Method void JsInterface(Context, Runnable, com.startapp.android.publish.adsCommon.d.b, boolean)>
	//   54  111:ldc2            #494 <String "startappwall">
	//   55  114:invokevirtual   #498 <Method void WebView.addJavascriptInterface(Object, String)>
		webView.setWebViewClient(((WebViewClient) (new MyWebViewClient())));
	//   56  117:aload_0         
	//   57  118:getfield        #385 <Field WebView webView>
	//   58  121:new             #20  <Class BannerStandard$MyWebViewClient>
	//   59  124:dup             
	//   60  125:aload_0         
	//   61  126:invokespecial   #499 <Method void BannerStandard$MyWebViewClient(BannerStandard)>
	//   62  129:invokevirtual   #503 <Method void WebView.setWebViewClient(WebViewClient)>
		RelativeLayout relativelayout;
		android.widget.RelativeLayout.LayoutParams layoutparams;
		if(!loaded)
	//*  63  132:aload_0         
	//*  64  133:getfield        #97  <Field boolean loaded>
	//*  65  136:ifne            235
		{
			if(defaultLoad)
	//*  66  139:aload_0         
	//*  67  140:getfield        #103 <Field boolean defaultLoad>
	//*  68  143:ifeq            150
				loadBanner();
	//   69  146:aload_0         
	//   70  147:invokevirtual   #506 <Method void loadBanner()>
		} else
	//*  71  150:new             #166 <Class android.widget.RelativeLayout$LayoutParams>
	//*  72  153:dup             
	//*  73  154:iload_1         
	//*  74  155:iload_2         
	//*  75  156:invokespecial   #176 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//*  76  159:astore          4
	//*  77  161:aload           4
	//*  78  163:bipush          13
	//*  79  165:invokevirtual   #180 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//*  80  168:new             #182 <Class RelativeLayout>
	//*  81  171:dup             
	//*  82  172:aload_0         
	//*  83  173:invokevirtual   #186 <Method Context getContext()>
	//*  84  176:invokespecial   #187 <Method void RelativeLayout(Context)>
	//*  85  179:astore_3        
	//*  86  180:aload_3         
	//*  87  181:aload_0         
	//*  88  182:getfield        #385 <Field WebView webView>
	//*  89  185:aload           4
	//*  90  187:invokevirtual   #507 <Method void RelativeLayout.addView(View, android.view.ViewGroup$LayoutParams)>
	//*  91  190:aload_0         
	//*  92  191:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  93  194:ifnull          255
	//*  94  197:new             #166 <Class android.widget.RelativeLayout$LayoutParams>
	//*  95  200:dup             
	//*  96  201:aload_0         
	//*  97  202:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//*  98  205:getfield        #265 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  99  208:aload_0         
	//* 100  209:invokevirtual   #260 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//* 101  212:getfield        #271 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 102  215:invokespecial   #176 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//* 103  218:astore          4
	//* 104  220:aload           4
	//* 105  222:bipush          13
	//* 106  224:invokevirtual   #180 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//* 107  227:aload_0         
	//* 108  228:aload_3         
	//* 109  229:aload           4
	//* 110  231:invokevirtual   #228 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
	//* 111  234:return          
		{
			g.a("BannerHtml", 3, "BannerHTML already Loaded");
	//  112  235:ldc1            #28  <String "BannerHtml">
	//  113  237:iconst_3        
	//  114  238:ldc2            #509 <String "BannerHTML already Loaded">
	//  115  241:invokestatic    #331 <Method void g.a(String, int, String)>
			onReceiveAd(((Ad) (adHtml)));
	//  116  244:aload_0         
	//  117  245:aload_0         
	//  118  246:getfield        #202 <Field a adHtml>
	//  119  249:invokevirtual   #513 <Method void onReceiveAd(Ad)>
		}
		layoutparams = new android.widget.RelativeLayout.LayoutParams(j, k);
		layoutparams.addRule(13);
		relativelayout = new RelativeLayout(getContext());
		relativelayout.addView(((View) (webView)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
		if(getLayoutParams() != null)
		{
			android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(getLayoutParams().width, getLayoutParams().height);
			layoutparams1.addRule(13);
			addView(((View) (relativelayout)), ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
			return;
		} else
	//* 120  252:goto            150
		{
			addView(((View) (relativelayout)));
	//  121  255:aload_0         
	//  122  256:aload_3         
	//  123  257:invokevirtual   #515 <Method void addView(View)>
			return;
	//  124  260:return          
		}
	}

	protected void initRuntime()
	{
		try
		{
			options = new BannerOptions();
	//    0    0:aload_0         
	//    1    1:new             #466 <Class BannerOptions>
	//    2    4:dup             
	//    3    5:invokespecial   #517 <Method void BannerOptions()>
	//    4    8:putfield        #464 <Field BannerOptions options>
			adHtml = new a(getContext(), getOffset());
	//    5   11:aload_0         
	//    6   12:new             #204 <Class a>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #186 <Method Context getContext()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #519 <Method int getOffset()>
	//   12   24:invokespecial   #522 <Method void a(Context, int)>
	//   13   27:putfield        #202 <Field a adHtml>
			if(adPreferences == null)
	//*  14   30:aload_0         
	//*  15   31:getfield        #144 <Field AdPreferences adPreferences>
	//*  16   34:ifnonnull       48
				adPreferences = new AdPreferences();
	//   17   37:aload_0         
	//   18   38:new             #524 <Class AdPreferences>
	//   19   41:dup             
	//   20   42:invokespecial   #525 <Method void AdPreferences()>
	//   21   45:putfield        #144 <Field AdPreferences adPreferences>
			size = new com.startapp.android.publish.ads.banner.d(getWidthInDp(), getHeightInDp());
	//   22   48:aload_0         
	//   23   49:new             #423 <Class com.startapp.android.publish.ads.banner.d>
	//   24   52:dup             
	//   25   53:aload_0         
	//   26   54:invokevirtual   #344 <Method int getWidthInDp()>
	//   27   57:aload_0         
	//   28   58:invokevirtual   #347 <Method int getHeightInDp()>
	//   29   61:invokespecial   #526 <Method void com.startapp.android.publish.ads.banner.d(int, int)>
	//   30   64:putfield        #421 <Field com.startapp.android.publish.ads.banner.d size>
			webView = new WebView(getContext());
	//   31   67:aload_0         
	//   32   68:new             #439 <Class WebView>
	//   33   71:dup             
	//   34   72:aload_0         
	//   35   73:invokevirtual   #186 <Method Context getContext()>
	//   36   76:invokespecial   #527 <Method void WebView(Context)>
	//   37   79:putfield        #385 <Field WebView webView>
			if(getId() == -1)
	//*  38   82:aload_0         
	//*  39   83:invokevirtual   #530 <Method int getId()>
	//*  40   86:iconst_m1       
	//*  41   87:icmpne          98
				setId(getBannerId());
	//   42   90:aload_0         
	//   43   91:aload_0         
	//   44   92:invokevirtual   #532 <Method int getBannerId()>
	//   45   95:invokevirtual   #535 <Method void setId(int)>
			webView.setId(0x9876541);
	//   46   98:aload_0         
	//   47   99:getfield        #385 <Field WebView webView>
	//   48  102:ldc1            #24  <Int 0x9876541>
	//   49  104:invokevirtual   #536 <Method void WebView.setId(int)>
			setVisibility(8);
	//   50  107:aload_0         
	//   51  108:bipush          8
	//   52  110:invokevirtual   #473 <Method void setVisibility(int)>
			webView.setBackgroundColor(0);
	//   53  113:aload_0         
	//   54  114:getfield        #385 <Field WebView webView>
	//   55  117:iconst_0        
	//   56  118:invokevirtual   #539 <Method void WebView.setBackgroundColor(int)>
			webView.setHorizontalScrollBarEnabled(false);
	//   57  121:aload_0         
	//   58  122:getfield        #385 <Field WebView webView>
	//   59  125:iconst_0        
	//   60  126:invokevirtual   #542 <Method void WebView.setHorizontalScrollBarEnabled(boolean)>
			webView.getSettings().setJavaScriptEnabled(true);
	//   61  129:aload_0         
	//   62  130:getfield        #385 <Field WebView webView>
	//   63  133:invokevirtual   #546 <Method WebSettings WebView.getSettings()>
	//   64  136:iconst_1        
	//   65  137:invokevirtual   #551 <Method void WebSettings.setJavaScriptEnabled(boolean)>
			webView.setVerticalScrollBarEnabled(false);
	//   66  140:aload_0         
	//   67  141:getfield        #385 <Field WebView webView>
	//   68  144:iconst_0        
	//   69  145:invokevirtual   #554 <Method void WebView.setVerticalScrollBarEnabled(boolean)>
			webView.setOnTouchListener(new android.view.View.OnTouchListener() {

				public boolean onTouch(View view, MotionEvent motionevent)
				{
					webViewTouched = true;
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BannerStandard this$0>
				//    2    4:iconst_1        
				//    3    5:invokestatic    #26  <Method boolean BannerStandard.access$002(BannerStandard, boolean)>
				//    4    8:pop             
					return motionevent.getAction() == 2;
				//    5    9:aload_2         
				//    6   10:invokevirtual   #32  <Method int MotionEvent.getAction()>
				//    7   13:iconst_2        
				//    8   14:icmpne          19
				//    9   17:iconst_1        
				//   10   18:ireturn         
				//   11   19:iconst_0        
				//   12   20:ireturn         
				}

				final BannerStandard this$0;

			
			{
				this$0 = BannerStandard.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BannerStandard this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   70  148:aload_0         
	//   71  149:getfield        #385 <Field WebView webView>
	//   72  152:new             #10  <Class BannerStandard$1>
	//   73  155:dup             
	//   74  156:aload_0         
	//   75  157:invokespecial   #555 <Method void BannerStandard$1(BannerStandard)>
	//   76  160:invokevirtual   #559 <Method void WebView.setOnTouchListener(android.view.View$OnTouchListener)>
			webView.setOnLongClickListener(new android.view.View.OnLongClickListener() {

				public boolean onLongClick(View view)
				{
					return true;
				//    0    0:iconst_1        
				//    1    1:ireturn         
				}

				final BannerStandard this$0;

			
			{
				this$0 = BannerStandard.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BannerStandard this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   77  163:aload_0         
	//   78  164:getfield        #385 <Field WebView webView>
	//   79  167:new             #12  <Class BannerStandard$2>
	//   80  170:dup             
	//   81  171:aload_0         
	//   82  172:invokespecial   #560 <Method void BannerStandard$2(BannerStandard)>
	//   83  175:invokevirtual   #564 <Method void WebView.setOnLongClickListener(android.view.View$OnLongClickListener)>
			webView.setLongClickable(false);
	//   84  178:aload_0         
	//   85  179:getfield        #385 <Field WebView webView>
	//   86  182:iconst_0        
	//   87  183:invokevirtual   #567 <Method void WebView.setLongClickable(boolean)>
			options = com.startapp.android.publish.ads.banner.c.a().c();
	//   88  186:aload_0         
	//   89  187:invokestatic    #572 <Method com.startapp.android.publish.ads.banner.c com.startapp.android.publish.ads.banner.c.a()>
	//   90  190:invokevirtual   #575 <Method BannerOptions com.startapp.android.publish.ads.banner.c.c()>
	//   91  193:putfield        #464 <Field BannerOptions options>
			getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

				public void onGlobalLayout()
				{
					c.a(getViewTreeObserver(), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BannerStandard this$0>
				//    2    4:invokevirtual   #25  <Method ViewTreeObserver BannerStandard.getViewTreeObserver()>
				//    3    7:aload_0         
				//    4    8:invokestatic    #31  <Method void c.a(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					setHardwareAcceleration(adPreferences);
				//    5   11:aload_0         
				//    6   12:getfield        #17  <Field BannerStandard this$0>
				//    7   15:aload_0         
				//    8   16:getfield        #17  <Field BannerStandard this$0>
				//    9   19:getfield        #35  <Field AdPreferences BannerStandard.adPreferences>
				//   10   22:invokestatic    #39  <Method void BannerStandard.access$100(BannerStandard, AdPreferences)>
					initBanner();
				//   11   25:aload_0         
				//   12   26:getfield        #17  <Field BannerStandard this$0>
				//   13   29:invokevirtual   #42  <Method void BannerStandard.initBanner()>
				//   14   32:return          
				}

				final BannerStandard this$0;

			
			{
				this$0 = BannerStandard.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BannerStandard this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   92  196:aload_0         
	//   93  197:invokevirtual   #579 <Method ViewTreeObserver getViewTreeObserver()>
	//   94  200:new             #14  <Class BannerStandard$3>
	//   95  203:dup             
	//   96  204:aload_0         
	//   97  205:invokespecial   #580 <Method void BannerStandard$3(BannerStandard)>
	//   98  208:invokevirtual   #586 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			return;
	//   99  211:return          
		}
		catch(Exception exception)
	//* 100  212:astore_1        
		{
			f.a(getContext(), d.b, "BannerStandard.init - webview failed", exception.getMessage(), "");
	//  101  213:aload_0         
	//  102  214:invokevirtual   #186 <Method Context getContext()>
	//  103  217:getstatic       #123 <Field d d.b>
	//  104  220:ldc2            #588 <String "BannerStandard.init - webview failed">
	//  105  223:aload_1         
	//  106  224:invokevirtual   #129 <Method String Exception.getMessage()>
	//  107  227:ldc1            #131 <String "">
	//  108  229:invokestatic    #137 <Method void f.a(Context, d, String, String, String)>
		}
		g.a("BannerHtml", 6, "webVIew exception");
	//  109  232:ldc1            #28  <String "BannerHtml">
	//  110  234:bipush          6
	//  111  236:ldc2            #590 <String "webVIew exception">
	//  112  239:invokestatic    #331 <Method void g.a(String, int, String)>
		hideBanner();
	//  113  242:aload_0         
	//  114  243:invokevirtual   #592 <Method void hideBanner()>
		onFailedToReceiveBanner("BannerStandard.init - webview failed");
	//  115  246:aload_0         
	//  116  247:ldc2            #588 <String "BannerStandard.init - webview failed">
	//  117  250:invokespecial   #594 <Method void onFailedToReceiveBanner(String)>
	//  118  253:return          
	}

	protected void makeImpression()
	{
		g.a("BannerHtml", 3, "BannerStandard Scheduling visibility check");
	//    0    0:ldc1            #28  <String "BannerHtml">
	//    1    2:iconst_3        
	//    2    3:ldc2            #597 <String "BannerStandard Scheduling visibility check">
	//    3    6:invokestatic    #331 <Method void g.a(String, int, String)>
		scheduledImpression = new com.startapp.android.publish.adsCommon.i(getContext(), adHtml.l(), new com.startapp.android.publish.adsCommon.d.b(getAdTag()), getImpressionDelayMillis());
	//    4    9:aload_0         
	//    5   10:new             #450 <Class com.startapp.android.publish.adsCommon.i>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:invokevirtual   #186 <Method Context getContext()>
	//    9   18:aload_0         
	//   10   19:getfield        #202 <Field a adHtml>
	//   11   22:invokevirtual   #601 <Method String[] a.l()>
	//   12   25:new             #483 <Class com.startapp.android.publish.adsCommon.d.b>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokevirtual   #160 <Method String getAdTag()>
	//   16   33:invokespecial   #485 <Method void com.startapp.android.publish.adsCommon.d.b(String)>
	//   17   36:aload_0         
	//   18   37:invokespecial   #603 <Method long getImpressionDelayMillis()>
	//   19   40:invokespecial   #606 <Method void com.startapp.android.publish.adsCommon.i(Context, String[], com.startapp.android.publish.adsCommon.d.b, long)>
	//   20   43:putfield        #448 <Field com.startapp.android.publish.adsCommon.i scheduledImpression>
		startVisibilityRunnable(scheduledImpression);
	//   21   46:aload_0         
	//   22   47:aload_0         
	//   23   48:getfield        #448 <Field com.startapp.android.publish.adsCommon.i scheduledImpression>
	//   24   51:invokevirtual   #610 <Method void startVisibilityRunnable(com.startapp.android.publish.adsCommon.i)>
	//   25   54:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #613 <Method void BannerBase.onAttachedToWindow()>
		onResume();
	//    2    4:aload_0         
	//    3    5:invokespecial   #615 <Method void onResume()>
	//    4    8:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #618 <Method void BannerBase.onDetachedFromWindow()>
		onPause();
	//    2    4:aload_0         
	//    3    5:invokespecial   #620 <Method void onPause()>
		cancelScheduledImpression(false);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #622 <Method void cancelScheduledImpression(boolean)>
	//    7   13:return          
	}

	public void onFailedToReceiveAd(Ad ad)
	{
		onFailedToReceiveBanner(ad.getErrorMessage());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #627 <Method String Ad.getErrorMessage()>
	//    3    5:invokespecial   #594 <Method void onFailedToReceiveBanner(String)>
	//    4    8:return          
	}

	public void onReceiveAd(Ad ad)
	{
		String s;
		g.a("BannerHtml", 3, " Html Ad Recievied OK");
	//    0    0:ldc1            #28  <String "BannerHtml">
	//    1    2:iconst_3        
	//    2    3:ldc2            #631 <String " Html Ad Recievied OK">
	//    3    6:invokestatic    #331 <Method void g.a(String, int, String)>
		webViewTouched = false;
	//    4    9:aload_0         
	//    5   10:iconst_0        
	//    6   11:putfield        #99  <Field boolean webViewTouched>
		removeView(((View) (adInformationContatiner)));
	//    7   14:aload_0         
	//    8   15:aload_0         
	//    9   16:getfield        #113 <Field RelativeLayout adInformationContatiner>
	//   10   19:invokevirtual   #632 <Method void removeView(View)>
		if(adHtml == null || adHtml.f() == null || adHtml.f().compareTo("") == 0)
			break MISSING_BLOCK_LABEL_268;
	//   11   22:aload_0         
	//   12   23:getfield        #202 <Field a adHtml>
	//   13   26:ifnull          268
	//   14   29:aload_0         
	//   15   30:getfield        #202 <Field a adHtml>
	//   16   33:invokevirtual   #388 <Method String com.startapp.android.publish.ads.banner.bannerstandard.a.f()>
	//   17   36:ifnull          268
	//   18   39:aload_0         
	//   19   40:getfield        #202 <Field a adHtml>
	//   20   43:invokevirtual   #388 <Method String com.startapp.android.publish.ads.banner.bannerstandard.a.f()>
	//   21   46:ldc1            #131 <String "">
	//   22   48:invokevirtual   #638 <Method int String.compareTo(String)>
	//   23   51:ifeq            268
		jsTag = "true".equals(((Object) (i.a(adHtml.f(), "@jsTag@", "@jsTag@"))));
	//   24   54:aload_0         
	//   25   55:ldc2            #640 <String "true">
	//   26   58:aload_0         
	//   27   59:getfield        #202 <Field a adHtml>
	//   28   62:invokevirtual   #388 <Method String com.startapp.android.publish.ads.banner.bannerstandard.a.f()>
	//   29   65:ldc2            #642 <String "@jsTag@">
	//   30   68:ldc2            #642 <String "@jsTag@">
	//   31   71:invokestatic    #645 <Method String i.a(String, String, String)>
	//   32   74:invokevirtual   #649 <Method boolean String.equals(Object)>
	//   33   77:putfield        #101 <Field boolean jsTag>
		loadHtml();
	//   34   80:aload_0         
	//   35   81:invokespecial   #651 <Method void loadHtml()>
		ad = ((Ad) (i.a(adHtml.f(), "@width@", "@width@")));
	//   36   84:aload_0         
	//   37   85:getfield        #202 <Field a adHtml>
	//   38   88:invokevirtual   #388 <Method String com.startapp.android.publish.ads.banner.bannerstandard.a.f()>
	//   39   91:ldc2            #653 <String "@width@">
	//   40   94:ldc2            #653 <String "@width@">
	//   41   97:invokestatic    #645 <Method String i.a(String, String, String)>
	//   42  100:astore_1        
		s = i.a(adHtml.f(), "@height@", "@height@");
	//   43  101:aload_0         
	//   44  102:getfield        #202 <Field a adHtml>
	//   45  105:invokevirtual   #388 <Method String com.startapp.android.publish.ads.banner.bannerstandard.a.f()>
	//   46  108:ldc2            #655 <String "@height@">
	//   47  111:ldc2            #655 <String "@height@">
	//   48  114:invokestatic    #645 <Method String i.a(String, String, String)>
	//   49  117:astore_2        
		if(setSize(Integer.parseInt(((String) (ad))), Integer.parseInt(s)))
	//*  50  118:aload_0         
	//*  51  119:aload_1         
	//*  52  120:invokestatic    #660 <Method int Integer.parseInt(String)>
	//*  53  123:aload_2         
	//*  54  124:invokestatic    #660 <Method int Integer.parseInt(String)>
	//*  55  127:invokespecial   #662 <Method boolean setSize(int, int)>
	//*  56  130:ifeq            201
		{
			loaded = true;
	//   57  133:aload_0         
	//   58  134:iconst_1        
	//   59  135:putfield        #97  <Field boolean loaded>
			addAdInformationLayout();
	//   60  138:aload_0         
	//   61  139:invokespecial   #664 <Method void addAdInformationLayout()>
			makeImpression();
	//   62  142:aload_0         
	//   63  143:invokevirtual   #666 <Method void makeImpression()>
			addDisplayEventOnLoad();
	//   64  146:aload_0         
	//   65  147:invokevirtual   #669 <Method void addDisplayEventOnLoad()>
			if(listener != null && !callbackSent)
	//*  66  150:aload_0         
	//*  67  151:getfield        #400 <Field BannerListener listener>
	//*  68  154:ifnull          179
	//*  69  157:aload_0         
	//*  70  158:getfield        #109 <Field boolean callbackSent>
	//*  71  161:ifne            179
			{
				callbackSent = true;
	//   72  164:aload_0         
	//   73  165:iconst_1        
	//   74  166:putfield        #109 <Field boolean callbackSent>
				listener.onReceiveAd(((View) (this)));
	//   75  169:aload_0         
	//   76  170:getfield        #400 <Field BannerListener listener>
	//   77  173:aload_0         
	//   78  174:invokeinterface #671 <Method void BannerListener.onReceiveAd(View)>
			}
			if(visible)
	//*  79  179:aload_0         
	//*  80  180:getfield        #105 <Field boolean visible>
	//*  81  183:ifeq            191
				setVisibility(0);
	//   82  186:aload_0         
	//   83  187:iconst_0        
	//   84  188:invokevirtual   #473 <Method void setVisibility(int)>
			g.a("BannerHtml", 3, "Done Loading HTML Banner");
	//   85  191:ldc1            #28  <String "BannerHtml">
	//   86  193:iconst_3        
	//   87  194:ldc2            #673 <String "Done Loading HTML Banner">
	//   88  197:invokestatic    #331 <Method void g.a(String, int, String)>
			return;
	//   89  200:return          
		}
		try
		{
			onFailedToReceiveBanner("Banner cannot be displayed (not enough room)");
	//   90  201:aload_0         
	//   91  202:ldc2            #675 <String "Banner cannot be displayed (not enough room)">
	//   92  205:invokespecial   #594 <Method void onFailedToReceiveBanner(String)>
			return;
	//   93  208:return          
		}
		// Misplaced declaration of an exception variable
		catch(Ad ad)
	//*  94  209:astore_1        
		{
			g.a("BannerHtml", 6, "Error Casting width & height from HTML");
	//   95  210:ldc1            #28  <String "BannerHtml">
	//   96  212:bipush          6
	//   97  214:ldc2            #677 <String "Error Casting width & height from HTML">
	//   98  217:invokestatic    #331 <Method void g.a(String, int, String)>
			onFailedToReceiveBanner("Error Casting width & height from HTML");
	//   99  220:aload_0         
	//  100  221:ldc2            #677 <String "Error Casting width & height from HTML">
	//  101  224:invokespecial   #594 <Method void onFailedToReceiveBanner(String)>
			return;
	//  102  227:return          
		}
		// Misplaced declaration of an exception variable
		catch(Ad ad)
	//* 103  228:astore_1        
		{
			g.a("BannerHtml", 6, (new StringBuilder()).append("Unknown error occurred ").append(((Exception) (ad)).getMessage()).toString());
	//  104  229:ldc1            #28  <String "BannerHtml">
	//  105  231:bipush          6
	//  106  233:new             #309 <Class StringBuilder>
	//  107  236:dup             
	//  108  237:invokespecial   #310 <Method void StringBuilder()>
	//  109  240:ldc2            #679 <String "Unknown error occurred ">
	//  110  243:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  111  246:aload_1         
	//  112  247:invokevirtual   #129 <Method String Exception.getMessage()>
	//  113  250:invokevirtual   #316 <Method StringBuilder StringBuilder.append(String)>
	//  114  253:invokevirtual   #326 <Method String StringBuilder.toString()>
	//  115  256:invokestatic    #331 <Method void g.a(String, int, String)>
		}
		onFailedToReceiveBanner(((Exception) (ad)).getMessage());
	//  116  259:aload_0         
	//  117  260:aload_1         
	//  118  261:invokevirtual   #129 <Method String Exception.getMessage()>
	//  119  264:invokespecial   #594 <Method void onFailedToReceiveBanner(String)>
		return;
	//  120  267:return          
		g.a("BannerHtml", 6, "No Banner recieved");
	//  121  268:ldc1            #28  <String "BannerHtml">
	//  122  270:bipush          6
	//  123  272:ldc2            #681 <String "No Banner recieved">
	//  124  275:invokestatic    #331 <Method void g.a(String, int, String)>
		onFailedToReceiveBanner("No Banner received");
	//  125  278:aload_0         
	//  126  279:ldc2            #683 <String "No Banner received">
	//  127  282:invokespecial   #594 <Method void onFailedToReceiveBanner(String)>
		return;
	//  128  285:return          
	}

	public void onWindowFocusChanged(boolean flag)
	{
		super.onWindowFocusChanged(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #686 <Method void BannerBase.onWindowFocusChanged(boolean)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
		{
			onResume();
	//    5    9:aload_0         
	//    6   10:invokespecial   #615 <Method void onResume()>
			return;
	//    7   13:return          
		} else
		{
			onPause();
	//    8   14:aload_0         
	//    9   15:invokespecial   #620 <Method void onPause()>
			return;
	//   10   18:return          
		}
	}

	protected void reload()
	{
		g.a("BannerHtml", 3, "Loading from network");
	//    0    0:ldc1            #28  <String "BannerHtml">
	//    1    2:iconst_3        
	//    2    3:ldc2            #689 <String "Loading from network">
	//    3    6:invokestatic    #331 <Method void g.a(String, int, String)>
		if(adPreferences == null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #144 <Field AdPreferences adPreferences>
	//*   6   13:ifnonnull       27
			adPreferences = new AdPreferences();
	//    7   16:aload_0         
	//    8   17:new             #524 <Class AdPreferences>
	//    9   20:dup             
	//   10   21:invokespecial   #525 <Method void AdPreferences()>
	//   11   24:putfield        #144 <Field AdPreferences adPreferences>
		Point point = getAvailableSize();
	//   12   27:aload_0         
	//   13   28:invokespecial   #419 <Method Point getAvailableSize()>
	//   14   31:astore_1        
		adHtml.setState(com.startapp.android.publish.adsCommon.Ad.AdState.UN_INITIALIZED);
	//   15   32:aload_0         
	//   16   33:getfield        #202 <Field a adHtml>
	//   17   36:getstatic       #695 <Field com.startapp.android.publish.adsCommon.Ad$AdState com.startapp.android.publish.adsCommon.Ad$AdState.UN_INITIALIZED>
	//   18   39:invokevirtual   #699 <Method void a.setState(com.startapp.android.publish.adsCommon.Ad$AdState)>
		adHtml.a(point.x, point.y);
	//   19   42:aload_0         
	//   20   43:getfield        #202 <Field a adHtml>
	//   21   46:aload_1         
	//   22   47:getfield        #268 <Field int Point.x>
	//   23   50:aload_1         
	//   24   51:getfield        #274 <Field int Point.y>
	//   25   54:invokevirtual   #700 <Method void a.a(int, int)>
		adHtml.a(getBannerType());
	//   26   57:aload_0         
	//   27   58:getfield        #202 <Field a adHtml>
	//   28   61:aload_0         
	//   29   62:invokevirtual   #702 <Method int getBannerType()>
	//   30   65:invokevirtual   #704 <Method void a.a(int)>
		adHtml.load(adPreferences, ((AdEventListener) (this)));
	//   31   68:aload_0         
	//   32   69:getfield        #202 <Field a adHtml>
	//   33   72:aload_0         
	//   34   73:getfield        #144 <Field AdPreferences adPreferences>
	//   35   76:aload_0         
	//   36   77:invokevirtual   #708 <Method boolean a.load(AdPreferences, AdEventListener)>
	//   37   80:pop             
	//   38   81:return          
	}

	public void setAdTag(String s)
	{
		adTag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #712 <Field String adTag>
	//    3    5:return          
	}

	protected void setBannerId(int j)
	{
		innerBannerStandardId = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #455 <Field int innerBannerStandardId>
	//    3    5:return          
	}

	public void setBannerListener(BannerListener bannerlistener)
	{
		listener = bannerlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #400 <Field BannerListener listener>
	//    3    5:return          
	}

	public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setLayoutParams(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #714 <Method void BannerBase.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		if(layoutparams.width > 0 && layoutparams.height > 0)
	//*   3    5:aload_1         
	//*   4    6:getfield        #265 <Field int android.view.ViewGroup$LayoutParams.width>
	//*   5    9:ifle            38
	//*   6   12:aload_1         
	//*   7   13:getfield        #271 <Field int android.view.ViewGroup$LayoutParams.height>
	//*   8   16:ifle            38
			(new Handler()).post(new Runnable() {

				public void run()
				{
					initBanner();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BannerStandard this$0>
				//    2    4:invokevirtual   #25  <Method void BannerStandard.initBanner()>
				//    3    7:return          
				}

				final BannerStandard this$0;

			
			{
				this$0 = BannerStandard.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BannerStandard this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    9   19:new             #716 <Class Handler>
	//   10   22:dup             
	//   11   23:invokespecial   #717 <Method void Handler()>
	//   12   26:new             #16  <Class BannerStandard$4>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:invokespecial   #718 <Method void BannerStandard$4(BannerStandard)>
	//   16   34:invokevirtual   #722 <Method boolean Handler.post(Runnable)>
	//   17   37:pop             
	//   18   38:return          
	}

	public void showBanner()
	{
		visible = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #105 <Field boolean visible>
		setVisibility(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #473 <Method void setVisibility(int)>
	//    6   10:return          
	}

	private static final int ID_WEBVIEW = 0x9876541;
	private static final String TAG = "BannerHtml";
	private static final int TIMEOUT_SMART_REDIRECT = 5000;
	protected a adHtml;
	private RelativeLayout adInformationContatiner;
	private b adInformationLayout;
	protected AdPreferences adPreferences;
	private boolean callbackSent;
	private boolean defaultLoad;
	private boolean initBannerCalled;
	private boolean jsTag;
	protected BannerListener listener;
	private boolean loaded;
	private BannerOptions options;
	private com.startapp.android.publish.adsCommon.i scheduledImpression;
	private com.startapp.android.publish.ads.banner.d size;
	private boolean visible;
	protected WebView webView;
	private boolean webViewTouched;


/*
	static boolean access$000(BannerStandard bannerstandard)
	{
		return bannerstandard.webViewTouched;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean webViewTouched>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$002(BannerStandard bannerstandard, boolean flag)
	{
		bannerstandard.webViewTouched = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field boolean webViewTouched>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$100(BannerStandard bannerstandard, AdPreferences adpreferences)
	{
		bannerstandard.setHardwareAcceleration(adpreferences);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #154 <Method void setHardwareAcceleration(AdPreferences)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$200(BannerStandard bannerstandard)
	{
		return bannerstandard.jsTag;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field boolean jsTag>
	//    2    4:ireturn         
	}

*/


/*
	static String access$300(BannerStandard bannerstandard)
	{
		return bannerstandard.getAdTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method String getAdTag()>
	//    2    4:areturn         
	}

*/


/*
	static String access$400(BannerStandard bannerstandard)
	{
		return bannerstandard.getAdTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method String getAdTag()>
	//    2    4:areturn         
	}

*/


/*
	static String access$500(BannerStandard bannerstandard)
	{
		return bannerstandard.getAdTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method String getAdTag()>
	//    2    4:areturn         
	}

*/


/*
	static String access$600(BannerStandard bannerstandard)
	{
		return bannerstandard.getAdTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method String getAdTag()>
	//    2    4:areturn         
	}

*/
}
