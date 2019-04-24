// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.bannerstandard;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.d.b;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.banner.bannerstandard:
//			BannerStandard, a

class BannerStandard$MyWebViewClient extends WebViewClient
{

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		boolean flag;
		webview = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(BannerStandard.access$200(BannerStandard.this) && !BannerStandard.access$000(BannerStandard.this))
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
				listener.onClick(((android.view.View) (BannerStandard.this)));
	//   22   46:aload_0         
	//   23   47:getfield        #15  <Field BannerStandard this$0>
	//   24   50:getfield        #36  <Field BannerListener BannerStandard.listener>
	//   25   53:aload_0         
	//   26   54:getfield        #15  <Field BannerStandard this$0>
	//   27   57:invokeinterface #42  <Method void BannerListener.onClick(android.view.View)>
		}
		cancelScheduledImpression(true);
	//   28   62:aload_0         
	//   29   63:getfield        #15  <Field BannerStandard this$0>
	//   30   66:iconst_1        
	//   31   67:invokevirtual   #46  <Method void BannerStandard.cancelScheduledImpression(boolean)>
		flag = c.a(getContext(), com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_BANNER);
	//   32   70:aload_0         
	//   33   71:getfield        #15  <Field BannerStandard this$0>
	//   34   74:invokevirtual   #50  <Method android.content.Context BannerStandard.getContext()>
	//   35   77:getstatic       #56  <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_BANNER>
	//   36   80:invokestatic    #62  <Method boolean c.a(android.content.Context, com.startapp.android.publish.common.model.AdPreferences$Placement)>
	//   37   83:istore          4
		if(BannerStandard.access$200(BannerStandard.this) || !s.contains("index="))
			break MISSING_BLOCK_LABEL_382;
	//   38   85:aload_0         
	//   39   86:getfield        #15  <Field BannerStandard this$0>
	//   40   89:invokestatic    #29  <Method boolean BannerStandard.access$200(BannerStandard)>
	//   41   92:ifne            382
	//   42   95:aload_2         
	//   43   96:ldc1            #64  <String "index=">
	//   44   98:invokevirtual   #70  <Method boolean String.contains(CharSequence)>
	//   45  101:ifeq            382
		int i = c.a(s);
	//   46  104:aload_2         
	//   47  105:invokestatic    #73  <Method int c.a(String)>
	//   48  108:istore_3        
		if(!adHtml.d(i) || flag) goto _L2; else goto _L1
	//   49  109:aload_0         
	//   50  110:getfield        #15  <Field BannerStandard this$0>
	//   51  113:getfield        #77  <Field a BannerStandard.adHtml>
	//   52  116:iload_3         
	//   53  117:invokevirtual   #83  <Method boolean a.d(int)>
	//   54  120:ifeq            274
	//   55  123:iload           4
	//   56  125:ifne            274
_L1:
		Object obj1 = ((Object) (getContext()));
	//   57  128:aload_0         
	//   58  129:getfield        #15  <Field BannerStandard this$0>
	//   59  132:invokevirtual   #50  <Method android.content.Context BannerStandard.getContext()>
	//   60  135:astore          6
		if(i >= adHtml.m().length) goto _L4; else goto _L3
	//   61  137:iload_3         
	//   62  138:aload_0         
	//   63  139:getfield        #15  <Field BannerStandard this$0>
	//   64  142:getfield        #77  <Field a BannerStandard.adHtml>
	//   65  145:invokevirtual   #87  <Method String[] a.m()>
	//   66  148:arraylength     
	//   67  149:icmpge          263
_L3:
		webview = ((WebView) (adHtml.m()[i]));
	//   68  152:aload_0         
	//   69  153:getfield        #15  <Field BannerStandard this$0>
	//   70  156:getfield        #77  <Field a BannerStandard.adHtml>
	//   71  159:invokevirtual   #87  <Method String[] a.m()>
	//   72  162:iload_3         
	//   73  163:aaload          
	//   74  164:astore_1        
_L7:
		if(i >= adHtml.o().length) goto _L6; else goto _L5
	//   75  165:iload_3         
	//   76  166:aload_0         
	//   77  167:getfield        #15  <Field BannerStandard this$0>
	//   78  170:getfield        #77  <Field a BannerStandard.adHtml>
	//   79  173:invokevirtual   #90  <Method String[] a.o()>
	//   80  176:arraylength     
	//   81  177:icmpge          268
_L5:
		Object obj = ((Object) (adHtml.o()[i]));
	//   82  180:aload_0         
	//   83  181:getfield        #15  <Field BannerStandard this$0>
	//   84  184:getfield        #77  <Field a BannerStandard.adHtml>
	//   85  187:invokevirtual   #90  <Method String[] a.o()>
	//   86  190:iload_3         
	//   87  191:aaload          
	//   88  192:astore          5
_L8:
		c.a(((android.content.Context) (obj1)), s, ((String) (webview)), ((String) (obj)), new b(BannerStandard.access$300(BannerStandard.this)), 5000L, adHtml.e(i), adHtml.f(i), false);
	//   89  194:aload           6
	//   90  196:aload_2         
	//   91  197:aload_1         
	//   92  198:aload           5
	//   93  200:new             #92  <Class b>
	//   94  203:dup             
	//   95  204:aload_0         
	//   96  205:getfield        #15  <Field BannerStandard this$0>
	//   97  208:invokestatic    #96  <Method String BannerStandard.access$300(BannerStandard)>
	//   98  211:invokespecial   #99  <Method void b(String)>
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
	//  109  236:invokevirtual   #108 <Method Boolean a.f(int)>
	//  110  239:iconst_0        
	//  111  240:invokestatic    #111 <Method void c.a(android.content.Context, String, String, String, b, long, boolean, Boolean, boolean)>
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
	//  130  278:invokevirtual   #50  <Method android.content.Context BannerStandard.getContext()>
	//  131  281:astore          5
		if(i < adHtml.m().length)
	//* 132  283:iload_3         
	//* 133  284:aload_0         
	//* 134  285:getfield        #15  <Field BannerStandard this$0>
	//* 135  288:getfield        #77  <Field a BannerStandard.adHtml>
	//* 136  291:invokevirtual   #87  <Method String[] a.m()>
	//* 137  294:arraylength     
	//* 138  295:icmpge          311
			webview = ((WebView) (adHtml.m()[i]));
	//  139  298:aload_0         
	//  140  299:getfield        #15  <Field BannerStandard this$0>
	//  141  302:getfield        #77  <Field a BannerStandard.adHtml>
	//  142  305:invokevirtual   #87  <Method String[] a.m()>
	//  143  308:iload_3         
	//  144  309:aaload          
	//  145  310:astore_1        
		obj1 = ((Object) (new b(BannerStandard.access$400(BannerStandard.this))));
	//  146  311:new             #92  <Class b>
	//  147  314:dup             
	//  148  315:aload_0         
	//  149  316:getfield        #15  <Field BannerStandard this$0>
	//  150  319:invokestatic    #126 <Method String BannerStandard.access$400(BannerStandard)>
	//  151  322:invokespecial   #99  <Method void b(String)>
	//  152  325:astore          6
		if(adHtml.e(i) && !flag)
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
	//* 169  358:invokestatic    #129 <Method void c.a(android.content.Context, String, String, b, boolean, boolean)>
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
			c.a(((android.content.Context) (obj)), s, ((String) (webview)), ((b) (obj1)), flag, false);
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
	//* 185  390:invokevirtual   #83  <Method boolean a.d(int)>
	//* 186  393:ifeq            479
	//* 187  396:iload           4
	//* 188  398:ifne            479
		{
			c.a(getContext(), s, adHtml.m()[0], adHtml.o()[0], new b(BannerStandard.access$500(BannerStandard.this)), 5000L, adHtml.e(0), adHtml.f(0), false);
	//  189  401:aload_0         
	//  190  402:getfield        #15  <Field BannerStandard this$0>
	//  191  405:invokevirtual   #50  <Method android.content.Context BannerStandard.getContext()>
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
	//  205  433:new             #92  <Class b>
	//  206  436:dup             
	//  207  437:aload_0         
	//  208  438:getfield        #15  <Field BannerStandard this$0>
	//  209  441:invokestatic    #141 <Method String BannerStandard.access$500(BannerStandard)>
	//  210  444:invokespecial   #99  <Method void b(String)>
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
	//  221  469:invokevirtual   #108 <Method Boolean a.f(int)>
	//  222  472:iconst_0        
	//  223  473:invokestatic    #111 <Method void c.a(android.content.Context, String, String, String, b, long, boolean, Boolean, boolean)>
		} else
	//* 224  476:goto            243
		{
			webview = ((WebView) (getContext()));
	//  225  479:aload_0         
	//  226  480:getfield        #15  <Field BannerStandard this$0>
	//  227  483:invokevirtual   #50  <Method android.content.Context BannerStandard.getContext()>
	//  228  486:astore_1        
			String s1 = adHtml.m()[0];
	//  229  487:aload_0         
	//  230  488:getfield        #15  <Field BannerStandard this$0>
	//  231  491:getfield        #77  <Field a BannerStandard.adHtml>
	//  232  494:invokevirtual   #87  <Method String[] a.m()>
	//  233  497:iconst_0        
	//  234  498:aaload          
	//  235  499:astore          5
			b b1 = new b(BannerStandard.access$600(BannerStandard.this));
	//  236  501:new             #92  <Class b>
	//  237  504:dup             
	//  238  505:aload_0         
	//  239  506:getfield        #15  <Field BannerStandard this$0>
	//  240  509:invokestatic    #144 <Method String BannerStandard.access$600(BannerStandard)>
	//  241  512:invokespecial   #99  <Method void b(String)>
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
	//* 259  548:invokestatic    #129 <Method void c.a(android.content.Context, String, String, b, boolean, boolean)>
	//* 260  551:goto            243
				flag = false;
	//  261  554:iconst_0        
	//  262  555:istore          4
			c.a(((android.content.Context) (webview)), s, s1, b1, flag, false);
		}
		  goto _L9
	//* 263  557:goto            539
	}

	private boolean callbackSent;
	final BannerStandard this$0;

	BannerStandard$MyWebViewClient()
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
