// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.*;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.*;
import android.webkit.*;
import com.google.android.gms.ads.internal.*;
import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.c.a;
import com.google.android.gms.common.util.o;
import com.google.android.gms.common.util.p;
import java.lang.ref.WeakReference;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			afn, xg, wx, zzbbi, 
//			xo, agg, zu, aha, 
//			ab, ad, v, wi, 
//			afo, bwk, zv, ni, 
//			ahb, aeq, s, agc, 
//			bpx, p, m, agq, 
//			aep, abw, agz, agd, 
//			agb, bsj, bse, bf, 
//			bad, ya, aa, acu, 
//			agv

final class aga extends WebView
	implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, afn
{

	private aga(aha aha1, ahb ahb1, String s1, boolean flag, boolean flag1, bad bad1, zzbbi zzbbi1, 
			ad ad1, ap ap1, bs bs, bse bse1)
	{
		super(((Context) (aha1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #88  <Method void WebView(Context)>
		h = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #90  <Field boolean h>
		i = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #92  <Field boolean i>
		u = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #94  <Field boolean u>
		v = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #96  <Field boolean v>
		w = "";
	//   15   25:aload_0         
	//   16   26:ldc1            #98  <String "">
	//   17   28:putfield        #100 <Field String w>
		L = -1;
	//   18   31:aload_0         
	//   19   32:iconst_m1       
	//   20   33:putfield        #102 <Field int L>
		M = -1;
	//   21   36:aload_0         
	//   22   37:iconst_m1       
	//   23   38:putfield        #104 <Field int M>
		N = -1;
	//   24   41:aload_0         
	//   25   42:iconst_m1       
	//   26   43:putfield        #106 <Field int N>
		O = -1;
	//   27   46:aload_0         
	//   28   47:iconst_m1       
	//   29   48:putfield        #108 <Field int O>
		a = aha1;
	//   30   51:aload_0         
	//   31   52:aload_1         
	//   32   53:putfield        #110 <Field aha a>
		m = ahb1;
	//   33   56:aload_0         
	//   34   57:aload_2         
	//   35   58:putfield        #112 <Field ahb m>
		n = s1;
	//   36   61:aload_0         
	//   37   62:aload_3         
	//   38   63:putfield        #114 <Field String n>
		q = flag;
	//   39   66:aload_0         
	//   40   67:iload           4
	//   41   69:putfield        #116 <Field boolean q>
		t = -1;
	//   42   72:aload_0         
	//   43   73:iconst_m1       
	//   44   74:putfield        #118 <Field int t>
		b = bad1;
	//   45   77:aload_0         
	//   46   78:aload           6
	//   47   80:putfield        #120 <Field bad b>
		c = zzbbi1;
	//   48   83:aload_0         
	//   49   84:aload           7
	//   50   86:putfield        #122 <Field zzbbi c>
		d = ap1;
	//   51   89:aload_0         
	//   52   90:aload           9
	//   53   92:putfield        #124 <Field ap d>
		e = bs;
	//   54   95:aload_0         
	//   55   96:aload           10
	//   56   98:putfield        #126 <Field bs e>
	//   57  101:aload_0         
	//   58  102:aload_0         
	//   59  103:invokevirtual   #130 <Method Context getContext()>
	//   60  106:ldc1            #132 <String "window">
	//   61  108:invokevirtual   #138 <Method Object Context.getSystemService(String)>
	//   62  111:checkcast       #140 <Class WindowManager>
	//   63  114:putfield        #142 <Field WindowManager Q>
		aw.e();
	//   64  117:invokestatic    #147 <Method xg aw.e()>
	//   65  120:pop             
		f = com.google.android.gms.internal.ads.xg.a(Q);
	//   66  121:aload_0         
	//   67  122:aload_0         
	//   68  123:getfield        #142 <Field WindowManager Q>
	//   69  126:invokestatic    #152 <Method DisplayMetrics com.google.android.gms.internal.ads.xg.a(WindowManager)>
	//   70  129:putfield        #154 <Field DisplayMetrics f>
		g = f.density;
	//   71  132:aload_0         
	//   72  133:aload_0         
	//   73  134:getfield        #154 <Field DisplayMetrics f>
	//   74  137:getfield        #159 <Field float DisplayMetrics.density>
	//   75  140:putfield        #161 <Field float g>
		R = bse1;
	//   76  143:aload_0         
	//   77  144:aload           11
	//   78  146:putfield        #163 <Field bse R>
		setBackgroundColor(0);
	//   79  149:aload_0         
	//   80  150:iconst_0        
	//   81  151:invokevirtual   #167 <Method void setBackgroundColor(int)>
		ahb1 = ((ahb) (getSettings()));
	//   82  154:aload_0         
	//   83  155:invokevirtual   #171 <Method WebSettings getSettings()>
	//   84  158:astore_2        
		((WebSettings) (ahb1)).setAllowFileAccess(false);
	//   85  159:aload_2         
	//   86  160:iconst_0        
	//   87  161:invokevirtual   #177 <Method void WebSettings.setAllowFileAccess(boolean)>
		try
		{
			((WebSettings) (ahb1)).setJavaScriptEnabled(true);
	//   88  164:aload_2         
	//   89  165:iconst_1        
	//   90  166:invokevirtual   #180 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		}
	//*  91  169:goto            179
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  92  172:astore_3        
		{
			wx.b("Unable to enable Javascript.", ((Throwable) (s1)));
	//   93  173:ldc1            #182 <String "Unable to enable Javascript.">
	//   94  175:aload_3         
	//   95  176:invokestatic    #187 <Method void wx.b(String, Throwable)>
		}
		((WebSettings) (ahb1)).setSavePassword(false);
	//   96  179:aload_2         
	//   97  180:iconst_0        
	//   98  181:invokevirtual   #190 <Method void WebSettings.setSavePassword(boolean)>
		((WebSettings) (ahb1)).setSupportMultipleWindows(true);
	//   99  184:aload_2         
	//  100  185:iconst_1        
	//  101  186:invokevirtual   #193 <Method void WebSettings.setSupportMultipleWindows(boolean)>
		((WebSettings) (ahb1)).setJavaScriptCanOpenWindowsAutomatically(true);
	//  102  189:aload_2         
	//  103  190:iconst_1        
	//  104  191:invokevirtual   #196 <Method void WebSettings.setJavaScriptCanOpenWindowsAutomatically(boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 105  194:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
	//* 106  197:bipush          21
	//* 107  199:icmplt          207
			((WebSettings) (ahb1)).setMixedContentMode(2);
	//  108  202:aload_2         
	//  109  203:iconst_2        
	//  110  204:invokevirtual   #204 <Method void WebSettings.setMixedContentMode(int)>
		aw.e().a(((Context) (aha1)), zzbbi1.a, ((WebSettings) (ahb1)));
	//  111  207:invokestatic    #147 <Method xg aw.e()>
	//  112  210:aload_1         
	//  113  211:aload           7
	//  114  213:getfield        #208 <Field String com.google.android.gms.internal.ads.zzbbi.a>
	//  115  216:aload_2         
	//  116  217:invokevirtual   #211 <Method void com.google.android.gms.internal.ads.xg.a(Context, String, WebSettings)>
		aw.g().a(getContext(), ((WebSettings) (ahb1)));
	//  117  220:invokestatic    #214 <Method xo aw.g()>
	//  118  223:aload_0         
	//  119  224:invokevirtual   #130 <Method Context getContext()>
	//  120  227:aload_2         
	//  121  228:invokevirtual   #219 <Method boolean com.google.android.gms.internal.ads.xo.a(Context, WebSettings)>
	//  122  231:pop             
		setDownloadListener(((DownloadListener) (this)));
	//  123  232:aload_0         
	//  124  233:aload_0         
	//  125  234:invokevirtual   #223 <Method void setDownloadListener(DownloadListener)>
		Q();
	//  126  237:aload_0         
	//  127  238:invokespecial   #226 <Method void Q()>
		if(com.google.android.gms.common.util.o.d())
	//* 128  241:invokestatic    #231 <Method boolean o.d()>
	//* 129  244:ifeq            257
			addJavascriptInterface(((Object) (com.google.android.gms.internal.ads.agg.a(((afn) (this))))), "googleAdsJsInterface");
	//  130  247:aload_0         
	//  131  248:aload_0         
	//  132  249:invokestatic    #236 <Method agg com.google.android.gms.internal.ads.agg.a(afn)>
	//  133  252:ldc1            #238 <String "googleAdsJsInterface">
	//  134  254:invokevirtual   #242 <Method void addJavascriptInterface(Object, String)>
		removeJavascriptInterface("accessibility");
	//  135  257:aload_0         
	//  136  258:ldc1            #244 <String "accessibility">
	//  137  260:invokevirtual   #248 <Method void removeJavascriptInterface(String)>
		removeJavascriptInterface("accessibilityTraversal");
	//  138  263:aload_0         
	//  139  264:ldc1            #250 <String "accessibilityTraversal">
	//  140  266:invokevirtual   #248 <Method void removeJavascriptInterface(String)>
		K = new zu(a.a(), ((View) (this)), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)), ((android.view.ViewTreeObserver.OnScrollChangedListener) (null)));
	//  141  269:aload_0         
	//  142  270:new             #252 <Class zu>
	//  143  273:dup             
	//  144  274:aload_0         
	//  145  275:getfield        #110 <Field aha a>
	//  146  278:invokevirtual   #257 <Method Activity com.google.android.gms.internal.ads.aha.a()>
	//  147  281:aload_0         
	//  148  282:aload_0         
	//  149  283:aconst_null     
	//  150  284:invokespecial   #260 <Method void zu(Activity, View, android.view.ViewTreeObserver$OnGlobalLayoutListener, android.view.ViewTreeObserver$OnScrollChangedListener)>
	//  151  287:putfield        #262 <Field zu K>
		V();
	//  152  290:aload_0         
	//  153  291:invokespecial   #265 <Method void V()>
		G = new ab(new ad(true, "make_wv", n));
	//  154  294:aload_0         
	//  155  295:new             #267 <Class ab>
	//  156  298:dup             
	//  157  299:new             #269 <Class ad>
	//  158  302:dup             
	//  159  303:iconst_1        
	//  160  304:ldc2            #271 <String "make_wv">
	//  161  307:aload_0         
	//  162  308:getfield        #114 <Field String n>
	//  163  311:invokespecial   #274 <Method void ad(boolean, String, String)>
	//  164  314:invokespecial   #277 <Method void ab(ad)>
	//  165  317:putfield        #279 <Field ab G>
		G.a().a(ad1);
	//  166  320:aload_0         
	//  167  321:getfield        #279 <Field ab G>
	//  168  324:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//  169  327:aload           8
	//  170  329:invokevirtual   #284 <Method void com.google.android.gms.internal.ads.ad.a(ad)>
		E = com.google.android.gms.internal.ads.v.a(G.a());
	//  171  332:aload_0         
	//  172  333:aload_0         
	//  173  334:getfield        #279 <Field ab G>
	//  174  337:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//  175  340:invokestatic    #289 <Method aa com.google.android.gms.internal.ads.v.a(ad)>
	//  176  343:putfield        #291 <Field aa E>
		G.a("native:view_create", E);
	//  177  346:aload_0         
	//  178  347:getfield        #279 <Field ab G>
	//  179  350:ldc2            #293 <String "native:view_create">
	//  180  353:aload_0         
	//  181  354:getfield        #291 <Field aa E>
	//  182  357:invokevirtual   #296 <Method void com.google.android.gms.internal.ads.ab.a(String, aa)>
		F = null;
	//  183  360:aload_0         
	//  184  361:aconst_null     
	//  185  362:putfield        #298 <Field aa F>
		D = null;
	//  186  365:aload_0         
	//  187  366:aconst_null     
	//  188  367:putfield        #300 <Field aa D>
		aw.g().b(((Context) (aha1)));
	//  189  370:invokestatic    #214 <Method xo aw.g()>
	//  190  373:aload_1         
	//  191  374:invokevirtual   #302 <Method void xo.b(Context)>
		aw.i().h();
	//  192  377:invokestatic    #305 <Method wi aw.i()>
	//  193  380:invokevirtual   #309 <Method void wi.h()>
	//  194  383:return          
	}

	private final boolean M()
	{
		boolean flag1 = ((afo)j).b();
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:checkcast       #314 <Class afo>
	//    3    7:invokevirtual   #316 <Method boolean afo.b()>
	//    4   10:istore          6
		boolean flag = false;
	//    5   12:iconst_0        
	//    6   13:istore          5
		if(!flag1 && !((afo)j).c())
	//*   7   15:iload           6
	//*   8   17:ifne            35
	//*   9   20:aload_0         
	//*  10   21:getfield        #312 <Field afo j>
	//*  11   24:checkcast       #314 <Class afo>
	//*  12   27:invokevirtual   #318 <Method boolean com.google.android.gms.internal.ads.afo.c()>
	//*  13   30:ifne            35
			return false;
	//   14   33:iconst_0        
	//   15   34:ireturn         
		com.google.android.gms.internal.ads.bwk.a();
	//   16   35:invokestatic    #323 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   17   38:pop             
		Object obj = ((Object) (f));
	//   18   39:aload_0         
	//   19   40:getfield        #154 <Field DisplayMetrics f>
	//   20   43:astore          7
		int k1 = zv.b(((DisplayMetrics) (obj)), ((DisplayMetrics) (obj)).widthPixels);
	//   21   45:aload           7
	//   22   47:aload           7
	//   23   49:getfield        #326 <Field int DisplayMetrics.widthPixels>
	//   24   52:invokestatic    #331 <Method int zv.b(DisplayMetrics, int)>
	//   25   55:istore_3        
		com.google.android.gms.internal.ads.bwk.a();
	//   26   56:invokestatic    #323 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   27   59:pop             
		obj = ((Object) (f));
	//   28   60:aload_0         
	//   29   61:getfield        #154 <Field DisplayMetrics f>
	//   30   64:astore          7
		int l1 = zv.b(((DisplayMetrics) (obj)), ((DisplayMetrics) (obj)).heightPixels);
	//   31   66:aload           7
	//   32   68:aload           7
	//   33   70:getfield        #334 <Field int DisplayMetrics.heightPixels>
	//   34   73:invokestatic    #331 <Method int zv.b(DisplayMetrics, int)>
	//   35   76:istore          4
		obj = ((Object) (a.a()));
	//   36   78:aload_0         
	//   37   79:getfield        #110 <Field aha a>
	//   38   82:invokevirtual   #257 <Method Activity com.google.android.gms.internal.ads.aha.a()>
	//   39   85:astore          7
		int i1;
		int j1;
		if(obj != null && ((Activity) (obj)).getWindow() != null)
	//*  40   87:aload           7
	//*  41   89:ifnull          149
	//*  42   92:aload           7
	//*  43   94:invokevirtual   #340 <Method android.view.Window Activity.getWindow()>
	//*  44   97:ifnonnull       103
	//*  45  100:goto            149
		{
			aw.e();
	//   46  103:invokestatic    #147 <Method xg aw.e()>
	//   47  106:pop             
			int ai[] = com.google.android.gms.internal.ads.xg.a(((Activity) (obj)));
	//   48  107:aload           7
	//   49  109:invokestatic    #343 <Method int[] com.google.android.gms.internal.ads.xg.a(Activity)>
	//   50  112:astore          7
			com.google.android.gms.internal.ads.bwk.a();
	//   51  114:invokestatic    #323 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   52  117:pop             
			i1 = zv.b(f, ai[0]);
	//   53  118:aload_0         
	//   54  119:getfield        #154 <Field DisplayMetrics f>
	//   55  122:aload           7
	//   56  124:iconst_0        
	//   57  125:iaload          
	//   58  126:invokestatic    #331 <Method int zv.b(DisplayMetrics, int)>
	//   59  129:istore_1        
			com.google.android.gms.internal.ads.bwk.a();
	//   60  130:invokestatic    #323 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   61  133:pop             
			j1 = zv.b(f, ai[1]);
	//   62  134:aload_0         
	//   63  135:getfield        #154 <Field DisplayMetrics f>
	//   64  138:aload           7
	//   65  140:iconst_1        
	//   66  141:iaload          
	//   67  142:invokestatic    #331 <Method int zv.b(DisplayMetrics, int)>
	//   68  145:istore_2        
		} else
	//*  69  146:goto            154
		{
			i1 = k1;
	//   70  149:iload_3         
	//   71  150:istore_1        
			j1 = l1;
	//   72  151:iload           4
	//   73  153:istore_2        
		}
		if(M == k1 && L == l1 && N == i1 && O == j1)
	//*  74  154:aload_0         
	//*  75  155:getfield        #104 <Field int M>
	//*  76  158:iload_3         
	//*  77  159:icmpne          189
	//*  78  162:aload_0         
	//*  79  163:getfield        #102 <Field int L>
	//*  80  166:iload           4
	//*  81  168:icmpne          189
	//*  82  171:aload_0         
	//*  83  172:getfield        #106 <Field int N>
	//*  84  175:iload_1         
	//*  85  176:icmpne          189
	//*  86  179:aload_0         
	//*  87  180:getfield        #108 <Field int O>
	//*  88  183:iload_2         
	//*  89  184:icmpne          189
			return false;
	//   90  187:iconst_0        
	//   91  188:ireturn         
		if(M != k1 || L != l1)
	//*  92  189:aload_0         
	//*  93  190:getfield        #104 <Field int M>
	//*  94  193:iload_3         
	//*  95  194:icmpne          206
	//*  96  197:aload_0         
	//*  97  198:getfield        #102 <Field int L>
	//*  98  201:iload           4
	//*  99  203:icmpeq          209
			flag = true;
	//  100  206:iconst_1        
	//  101  207:istore          5
		M = k1;
	//  102  209:aload_0         
	//  103  210:iload_3         
	//  104  211:putfield        #104 <Field int M>
		L = l1;
	//  105  214:aload_0         
	//  106  215:iload           4
	//  107  217:putfield        #102 <Field int L>
		N = i1;
	//  108  220:aload_0         
	//  109  221:iload_1         
	//  110  222:putfield        #106 <Field int N>
		O = j1;
	//  111  225:aload_0         
	//  112  226:iload_2         
	//  113  227:putfield        #108 <Field int O>
		(new ni(((afn) (this)))).a(k1, l1, i1, j1, f.density, Q.getDefaultDisplay().getRotation());
	//  114  230:new             #345 <Class ni>
	//  115  233:dup             
	//  116  234:aload_0         
	//  117  235:invokespecial   #348 <Method void ni(afn)>
	//  118  238:iload_3         
	//  119  239:iload           4
	//  120  241:iload_1         
	//  121  242:iload_2         
	//  122  243:aload_0         
	//  123  244:getfield        #154 <Field DisplayMetrics f>
	//  124  247:getfield        #159 <Field float DisplayMetrics.density>
	//  125  250:aload_0         
	//  126  251:getfield        #142 <Field WindowManager Q>
	//  127  254:invokeinterface #352 <Method Display WindowManager.getDefaultDisplay()>
	//  128  259:invokevirtual   #358 <Method int Display.getRotation()>
	//  129  262:invokevirtual   #361 <Method void com.google.android.gms.internal.ads.ni.a(int, int, int, int, float, int)>
		return flag;
	//  130  265:iload           5
	//  131  267:ireturn         
	}

	private final void N()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Boolean boolean1;
		s = aw.i().b();
	//    2    2:aload_0         
	//    3    3:invokestatic    #305 <Method wi aw.i()>
	//    4    6:invokevirtual   #366 <Method Boolean wi.b()>
	//    5    9:putfield        #368 <Field Boolean s>
		boolean1 = s;
	//    6   12:aload_0         
	//    7   13:getfield        #368 <Field Boolean s>
	//    8   16:astore_1        
		if(boolean1 != null) goto _L2; else goto _L1
	//    9   17:aload_1         
	//   10   18:ifnonnull       48
_L1:
		evaluateJavascript("(function(){})()", ((ValueCallback) (null)));
	//   11   21:aload_0         
	//   12   22:ldc2            #370 <String "(function(){})()">
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #374 <Method void evaluateJavascript(String, ValueCallback)>
		a(Boolean.valueOf(true));
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:invokestatic    #380 <Method Boolean Boolean.valueOf(boolean)>
	//   18   34:invokespecial   #383 <Method void a(Boolean)>
		this;
	//   19   37:aload_0         
		JVM INSTR monitorexit ;
	//   20   38:monitorexit     
		return;
	//   21   39:return          
_L4:
		a(Boolean.valueOf(false));
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:invokestatic    #380 <Method Boolean Boolean.valueOf(boolean)>
	//   25   45:invokespecial   #383 <Method void a(Boolean)>
_L2:
		this;
	//   26   48:aload_0         
		JVM INSTR monitorexit ;
	//   27   49:monitorexit     
		return;
	//   28   50:return          
		Object obj;
		obj;
	//   29   51:astore_1        
	//*  30   52:aload_0         
		throw obj;
	//   31   53:monitorexit     
	//   32   54:aload_1         
	//   33   55:athrow          
		obj;
	//   34   56:astore_1        
		if(true) goto _L4; else goto _L3
_L3:
	//*  35   57:goto            40
	}

	private final Boolean O()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Boolean boolean1 = s;
	//    2    2:aload_0         
	//    3    3:getfield        #368 <Field Boolean s>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return boolean1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	private final void P()
	{
		com.google.android.gms.internal.ads.v.a(G.a(), E, new String[] {
			"aeh2"
		});
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field ab G>
	//    2    4:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    3    7:aload_0         
	//    4    8:getfield        #291 <Field aa E>
	//    5   11:iconst_1        
	//    6   12:anewarray       String[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:ldc2            #387 <String "aeh2">
	//   10   20:aastore         
	//   11   21:invokestatic    #390 <Method boolean com.google.android.gms.internal.ads.v.a(ad, aa, String[])>
	//   12   24:pop             
	//   13   25:return          
	}

	private final void Q()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(q || m.e())
	//*   2    2:aload_0         
	//*   3    3:getfield        #116 <Field boolean q>
	//*   4    6:ifne            56
	//*   5    9:aload_0         
	//*   6   10:getfield        #112 <Field ahb m>
	//*   7   13:invokevirtual   #394 <Method boolean ahb.e()>
	//*   8   16:ifeq            22
			break MISSING_BLOCK_LABEL_56;
	//    9   19:goto            56
		if(android.os.Build.VERSION.SDK_INT >= 18)
			break MISSING_BLOCK_LABEL_43;
	//   10   22:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
	//   11   25:bipush          18
	//   12   27:icmpge          43
		wx.b("Disabling hardware acceleration on an AdView.");
	//   13   30:ldc2            #396 <String "Disabling hardware acceleration on an AdView.">
	//   14   33:invokestatic    #398 <Method void wx.b(String)>
		R();
	//   15   36:aload_0         
	//   16   37:invokespecial   #400 <Method void R()>
		this;
	//   17   40:aload_0         
		JVM INSTR monitorexit ;
	//   18   41:monitorexit     
		return;
	//   19   42:return          
		wx.b("Enabling hardware acceleration on an AdView.");
	//   20   43:ldc2            #402 <String "Enabling hardware acceleration on an AdView.">
	//   21   46:invokestatic    #398 <Method void wx.b(String)>
		S();
	//   22   49:aload_0         
	//   23   50:invokespecial   #405 <Method void S()>
		this;
	//   24   53:aload_0         
		JVM INSTR monitorexit ;
	//   25   54:monitorexit     
		return;
	//   26   55:return          
		wx.b("Enabling hardware acceleration on an overlay.");
	//   27   56:ldc2            #407 <String "Enabling hardware acceleration on an overlay.">
	//   28   59:invokestatic    #398 <Method void wx.b(String)>
		S();
	//   29   62:aload_0         
	//   30   63:invokespecial   #405 <Method void S()>
		this;
	//   31   66:aload_0         
		JVM INSTR monitorexit ;
	//   32   67:monitorexit     
		return;
	//   33   68:return          
		Exception exception;
		exception;
	//   34   69:astore_1        
	//*  35   70:aload_0         
		throw exception;
	//   36   71:monitorexit     
	//   37   72:aload_1         
	//   38   73:athrow          
	}

	private final void R()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!r)
	//*   2    2:aload_0         
	//*   3    3:getfield        #409 <Field boolean r>
	//*   4    6:ifne            17
			aw.g().c(((View) (this)));
	//    5    9:invokestatic    #214 <Method xo aw.g()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #412 <Method boolean com.google.android.gms.internal.ads.xo.c(View)>
	//    8   16:pop             
		r = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #409 <Field boolean r>
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		Exception exception;
		exception;
	//   15   25:astore_1        
	//*  16   26:aload_0         
		throw exception;
	//   17   27:monitorexit     
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	private final void S()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(r)
	//*   2    2:aload_0         
	//*   3    3:getfield        #409 <Field boolean r>
	//*   4    6:ifeq            17
			aw.g().b(((View) (this)));
	//    5    9:invokestatic    #214 <Method xo aw.g()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #414 <Method boolean xo.b(View)>
	//    8   16:pop             
		r = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #409 <Field boolean r>
		this;
	//   12   22:aload_0         
		JVM INSTR monitorexit ;
	//   13   23:monitorexit     
		return;
	//   14   24:return          
		Exception exception;
		exception;
	//   15   25:astore_1        
	//*  16   26:aload_0         
		throw exception;
	//   17   27:monitorexit     
	//   18   28:aload_1         
	//   19   29:athrow          
	}

	private final void T()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!J)
	//*   2    2:aload_0         
	//*   3    3:getfield        #417 <Field boolean J>
	//*   4    6:ifne            20
		{
			J = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #417 <Field boolean J>
			aw.i().i();
	//    8   14:invokestatic    #305 <Method wi aw.i()>
	//    9   17:invokevirtual   #419 <Method void wi.i()>
		}
		this;
	//   10   20:aload_0         
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		Exception exception;
		exception;
	//   13   23:astore_1        
	//*  14   24:aload_0         
		throw exception;
	//   15   25:monitorexit     
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	private final void U()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(P != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #422 <Field Map P>
	//*   4    6:ifnull          48
		{
			for(Iterator iterator = P.values().iterator(); iterator.hasNext(); ((aeq)iterator.next()).a());
	//    5    9:aload_0         
	//    6   10:getfield        #422 <Field Map P>
	//    7   13:invokeinterface #428 <Method Collection Map.values()>
	//    8   18:invokeinterface #434 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #439 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #443 <Method Object Iterator.next()>
	//   15   39:checkcast       #445 <Class aeq>
	//   16   42:invokevirtual   #447 <Method void com.google.android.gms.internal.ads.aeq.a()>
		}
	//*  17   45:goto            24
		P = null;
	//   18   48:aload_0         
	//   19   49:aconst_null     
	//   20   50:putfield        #422 <Field Map P>
		this;
	//   21   53:aload_0         
		JVM INSTR monitorexit ;
	//   22   54:monitorexit     
		return;
	//   23   55:return          
		Exception exception;
		exception;
	//   24   56:astore_1        
	//*  25   57:aload_0         
		throw exception;
	//   26   58:monitorexit     
	//   27   59:aload_1         
	//   28   60:athrow          
	}

	private final void V()
	{
		Object obj = ((Object) (G));
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field ab G>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		obj = ((Object) (((ab) (obj)).a()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    8   14:astore_1        
		if(obj != null && aw.i().a() != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          39
	//*  11   19:invokestatic    #305 <Method wi aw.i()>
	//*  12   22:invokevirtual   #450 <Method s com.google.android.gms.internal.ads.wi.a()>
	//*  13   25:ifnull          39
			aw.i().a().a(((ad) (obj)));
	//   14   28:invokestatic    #305 <Method wi aw.i()>
	//   15   31:invokevirtual   #450 <Method s com.google.android.gms.internal.ads.wi.a()>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #455 <Method boolean com.google.android.gms.internal.ads.s.a(ad)>
	//   18   38:pop             
	//   19   39:return          
	}

	static int a(aga aga1)
	{
		return aga1.C;
	//    0    0:aload_0         
	//    1    1:getfield        #458 <Field int C>
	//    2    4:ireturn         
	}

	static int a(aga aga1, int i1)
	{
		aga1.C = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #458 <Field int C>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static aga a(Context context, ahb ahb1, String s1, boolean flag, boolean flag1, bad bad1, zzbbi zzbbi1, ad ad1, 
			ap ap1, bs bs, bse bse1)
	{
		return new aga(new aha(context), ahb1, s1, flag, flag1, bad1, zzbbi1, ad1, ap1, bs, bse1);
	//    0    0:new             #2   <Class aga>
	//    1    3:dup             
	//    2    4:new             #254 <Class aha>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #461 <Method void aha(Context)>
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:iload_3         
	//    9   15:iload           4
	//   10   17:aload           5
	//   11   19:aload           6
	//   12   21:aload           7
	//   13   23:aload           8
	//   14   25:aload           9
	//   15   27:aload           10
	//   16   29:invokespecial   #463 <Method void aga(aha, ahb, String, boolean, boolean, bad, zzbbi, ad, ap, bs, bse)>
	//   17   32:areturn         
	}

	private final void a(Boolean boolean1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = boolean1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #368 <Field Boolean s>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		aw.i().a(boolean1);
	//    7    9:invokestatic    #305 <Method wi aw.i()>
	//    8   12:aload_1         
	//    9   13:invokevirtual   #464 <Method void com.google.android.gms.internal.ads.wi.a(Boolean)>
		return;
	//   10   16:return          
		boolean1;
	//   11   17:astore_1        
		this;
	//   12   18:aload_0         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw boolean1;
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	private final void a(String s1, ValueCallback valuecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(C())
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #468 <Method boolean C()>
	//    4    6:ifne            18
		evaluateJavascript(s1, ((ValueCallback) (null)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #374 <Method void evaluateJavascript(String, ValueCallback)>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//   12   18:ldc2            #470 <String "#004 The webview is destroyed. Ignoring action.">
	//   13   21:invokestatic    #472 <Method void wx.e(String)>
		this;
	//   14   24:aload_0         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return;
	//   16   26:return          
		s1;
	//   17   27:astore_1        
	//*  18   28:aload_0         
		throw s1;
	//   19   29:monitorexit     
	//   20   30:aload_1         
	//   21   31:athrow          
	}

	static void b(aga aga1)
	{
		((WebView) (aga1)).WebView.destroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #477 <Method void WebView.destroy()>
	//    2    4:return          
	}

	private final void c(String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(C())
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #468 <Method boolean C()>
	//    4    6:ifne            17
		loadUrl(s1);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #480 <Method void loadUrl(String)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//   11   17:ldc2            #470 <String "#004 The webview is destroyed. Ignoring action.">
	//   12   20:invokestatic    #472 <Method void wx.e(String)>
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		s1;
	//   16   26:astore_1        
	//*  17   27:aload_0         
		throw s1;
	//   18   28:monitorexit     
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	private final void e(String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.loadUrl(s1);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #489 <Method void WebView.loadUrl(String)>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		s1;
	//    8   10:astore_1        
		break MISSING_BLOCK_LABEL_48;
	//    9   11:goto            47
		s1;
	//   10   14:astore_1        
		break MISSING_BLOCK_LABEL_27;
	//   11   15:goto            27
		s1;
	//   12   18:astore_1        
		break MISSING_BLOCK_LABEL_27;
	//   13   19:goto            27
		s1;
	//   14   22:astore_1        
		break MISSING_BLOCK_LABEL_27;
	//   15   23:goto            27
		s1;
	//   16   26:astore_1        
		aw.i().a(((Throwable) (s1)), "AdWebViewImpl.loadUrlUnsafe");
	//   17   27:invokestatic    #305 <Method wi aw.i()>
	//   18   30:aload_1         
	//   19   31:ldc2            #491 <String "AdWebViewImpl.loadUrlUnsafe">
	//   20   34:invokevirtual   #494 <Method void com.google.android.gms.internal.ads.wi.a(Throwable, String)>
		com.google.android.gms.internal.ads.wx.c("Could not call loadUrl. ", ((Throwable) (s1)));
	//   21   37:ldc2            #496 <String "Could not call loadUrl. ">
	//   22   40:aload_1         
	//   23   41:invokestatic    #498 <Method void com.google.android.gms.internal.ads.wx.c(String, Throwable)>
		this;
	//   24   44:aload_0         
		JVM INSTR monitorexit ;
	//   25   45:monitorexit     
		return;
	//   26   46:return          
	//*  27   47:aload_0         
		throw s1;
	//   28   48:monitorexit     
	//   29   49:aload_1         
	//   30   50:athrow          
	}

	private final void f(String s1)
	{
		if(com.google.android.gms.common.util.o.f())
	//*   0    0:invokestatic    #500 <Method boolean o.f()>
	//*   1    3:ifeq            74
		{
			if(O() == null)
	//*   2    6:aload_0         
	//*   3    7:invokespecial   #502 <Method Boolean O()>
	//*   4   10:ifnonnull       17
				N();
	//    5   13:aload_0         
	//    6   14:invokespecial   #504 <Method void N()>
			if(O().booleanValue())
	//*   7   17:aload_0         
	//*   8   18:invokespecial   #502 <Method Boolean O()>
	//*   9   21:invokevirtual   #507 <Method boolean Boolean.booleanValue()>
	//*  10   24:ifeq            34
			{
				a(s1, ((ValueCallback) (null)));
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:aconst_null     
	//   14   30:invokespecial   #509 <Method void a(String, ValueCallback)>
				return;
	//   15   33:return          
			}
			s1 = String.valueOf(((Object) (s1)));
	//   16   34:aload_1         
	//   17   35:invokestatic    #512 <Method String String.valueOf(Object)>
	//   18   38:astore_1        
			if(s1.length() != 0)
	//*  19   39:aload_1         
	//*  20   40:invokevirtual   #515 <Method int String.length()>
	//*  21   43:ifeq            57
				s1 = "javascript:".concat(s1);
	//   22   46:ldc2            #517 <String "javascript:">
	//   23   49:aload_1         
	//   24   50:invokevirtual   #521 <Method String String.concat(String)>
	//   25   53:astore_1        
			else
	//*  26   54:goto            68
				s1 = new String("javascript:");
	//   27   57:new             #385 <Class String>
	//   28   60:dup             
	//   29   61:ldc2            #517 <String "javascript:">
	//   30   64:invokespecial   #523 <Method void String(String)>
	//   31   67:astore_1        
			c(s1);
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:invokespecial   #525 <Method void c(String)>
			return;
	//   35   73:return          
		}
		s1 = String.valueOf(((Object) (s1)));
	//   36   74:aload_1         
	//   37   75:invokestatic    #512 <Method String String.valueOf(Object)>
	//   38   78:astore_1        
		if(s1.length() != 0)
	//*  39   79:aload_1         
	//*  40   80:invokevirtual   #515 <Method int String.length()>
	//*  41   83:ifeq            97
			s1 = "javascript:".concat(s1);
	//   42   86:ldc2            #517 <String "javascript:">
	//   43   89:aload_1         
	//   44   90:invokevirtual   #521 <Method String String.concat(String)>
	//   45   93:astore_1        
		else
	//*  46   94:goto            108
			s1 = new String("javascript:");
	//   47   97:new             #385 <Class String>
	//   48  100:dup             
	//   49  101:ldc2            #517 <String "javascript:">
	//   50  104:invokespecial   #523 <Method void String(String)>
	//   51  107:astore_1        
		c(s1);
	//   52  108:aload_0         
	//   53  109:aload_1         
	//   54  110:invokespecial   #525 <Method void c(String)>
	//   55  113:return          
	}

	private final void g(boolean flag)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #527 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #529 <Method void HashMap()>
	//    3    7:astore_3        
		String s1;
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            19
			s1 = "1";
	//    6   12:ldc2            #531 <String "1">
	//    7   15:astore_2        
		else
	//*   8   16:goto            23
			s1 = "0";
	//    9   19:ldc2            #533 <String "0">
	//   10   22:astore_2        
		((Map) (hashmap)).put("isVisible", ((Object) (s1)));
	//   11   23:aload_3         
	//   12   24:ldc2            #535 <String "isVisible">
	//   13   27:aload_2         
	//   14   28:invokeinterface #539 <Method Object Map.put(Object, Object)>
	//   15   33:pop             
		a("onAdVisibilityChanged", ((Map) (hashmap)));
	//   16   34:aload_0         
	//   17   35:ldc2            #541 <String "onAdVisibilityChanged">
	//   18   38:aload_3         
	//   19   39:invokevirtual   #544 <Method void a(String, Map)>
	//   20   42:return          
	}

	public final a A()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		a a1 = l;
	//    2    2:aload_0         
	//    3    3:getfield        #547 <Field a l>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return a1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final boolean B()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = q;
	//    2    2:aload_0         
	//    3    3:getfield        #116 <Field boolean q>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public final boolean C()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = p;
	//    2    2:aload_0         
	//    3    3:getfield        #549 <Field boolean p>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public final void D()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		com.google.android.gms.internal.ads.wx.a("Destroying WebView!");
	//    2    2:ldc2            #551 <String "Destroying WebView!">
	//    3    5:invokestatic    #553 <Method void com.google.android.gms.internal.ads.wx.a(String)>
		T();
	//    4    8:aload_0         
	//    5    9:invokespecial   #555 <Method void T()>
		com.google.android.gms.internal.ads.xg.a.post(((Runnable) (new agc(this))));
	//    6   12:getstatic       #558 <Field Handler com.google.android.gms.internal.ads.xg.a>
	//    7   15:new             #560 <Class agc>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #562 <Method void agc(aga)>
	//   11   23:invokevirtual   #568 <Method boolean Handler.post(Runnable)>
	//   12   26:pop             
		this;
	//   13   27:aload_0         
		JVM INSTR monitorexit ;
	//   14   28:monitorexit     
		return;
	//   15   29:return          
		Exception exception;
		exception;
	//   16   30:astore_1        
	//*  17   31:aload_0         
		throw exception;
	//   18   32:monitorexit     
	//   19   33:aload_1         
	//   20   34:athrow          
	}

	public final boolean E()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = u;
	//    2    2:aload_0         
	//    3    3:getfield        #94  <Field boolean u>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public final boolean F()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = v;
	//    2    2:aload_0         
	//    3    3:getfield        #96  <Field boolean v>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public final boolean G()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i1 = B;
	//    2    2:aload_0         
	//    3    3:getfield        #570 <Field int B>
	//    4    6:istore_1        
		boolean flag;
		if(i1 > 0)
	//*   5    7:iload_1         
	//*   6    8:ifle            17
			flag = true;
	//    7   11:iconst_1        
	//    8   12:istore_2        
		else
	//*   9   13:aload_0         
	//*  10   14:monitorexit     
	//*  11   15:iload_2         
	//*  12   16:ireturn         
			flag = false;
	//   13   17:iconst_0        
	//   14   18:istore_2        
		this;
		JVM INSTR monitorexit ;
		return flag;
	//*  15   19:goto            13
		Exception exception;
		exception;
	//   16   22:astore_3        
	//*  17   23:aload_0         
		throw exception;
	//   18   24:monitorexit     
	//   19   25:aload_3         
	//   20   26:athrow          
	}

	public final void H()
	{
		K.a();
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field zu K>
	//    2    4:invokevirtual   #571 <Method void com.google.android.gms.internal.ads.zu.a()>
	//    3    7:return          
	}

	public final void I()
	{
		if(F == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #298 <Field aa F>
	//*   2    4:ifnonnull       35
		{
			F = com.google.android.gms.internal.ads.v.a(G.a());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #279 <Field ab G>
	//    6   12:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    7   15:invokestatic    #289 <Method aa com.google.android.gms.internal.ads.v.a(ad)>
	//    8   18:putfield        #298 <Field aa F>
			G.a("native:view_load", F);
	//    9   21:aload_0         
	//   10   22:getfield        #279 <Field ab G>
	//   11   25:ldc2            #573 <String "native:view_load">
	//   12   28:aload_0         
	//   13   29:getfield        #298 <Field aa F>
	//   14   32:invokevirtual   #296 <Method void com.google.android.gms.internal.ads.ab.a(String, aa)>
		}
	//   15   35:return          
	}

	public final bf J()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		bf bf1 = A;
	//    2    2:aload_0         
	//    3    3:getfield        #576 <Field bf A>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return bf1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final void K()
	{
		setBackgroundColor(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #167 <Method void setBackgroundColor(int)>
	//    3    5:return          
	}

	public final void L()
	{
		com.google.android.gms.internal.ads.wx.a("Cannot add text view to inner AdWebView");
	//    0    0:ldc2            #578 <String "Cannot add text view to inner AdWebView">
	//    1    3:invokestatic    #553 <Method void com.google.android.gms.internal.ads.wx.a(String)>
	//    2    6:return          
	}

	public final acu a()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final aeq a(String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Map map = P;
	//    2    2:aload_0         
	//    3    3:getfield        #422 <Field Map P>
	//    4    6:astore_2        
		if(map != null)
			break MISSING_BLOCK_LABEL_15;
	//    5    7:aload_2         
	//    6    8:ifnonnull       15
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return null;
	//    9   13:aconst_null     
	//   10   14:areturn         
		s1 = ((String) ((aeq)P.get(((Object) (s1)))));
	//   11   15:aload_0         
	//   12   16:getfield        #422 <Field Map P>
	//   13   19:aload_1         
	//   14   20:invokeinterface #584 <Method Object Map.get(Object)>
	//   15   25:checkcast       #445 <Class aeq>
	//   16   28:astore_1        
		this;
	//   17   29:aload_0         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return ((aeq) (s1));
	//   19   31:aload_1         
	//   20   32:areturn         
		s1;
	//   21   33:astore_1        
	//*  22   34:aload_0         
		throw s1;
	//   23   35:monitorexit     
	//   24   36:aload_1         
	//   25   37:athrow          
	}

	public final void a(int i1)
	{
		if(i1 == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            29
			com.google.android.gms.internal.ads.v.a(G.a(), E, new String[] {
				"aebb2"
			});
	//    2    4:aload_0         
	//    3    5:getfield        #279 <Field ab G>
	//    4    8:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    5   11:aload_0         
	//    6   12:getfield        #291 <Field aa E>
	//    7   15:iconst_1        
	//    8   16:anewarray       String[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:ldc2            #586 <String "aebb2">
	//   12   24:aastore         
	//   13   25:invokestatic    #390 <Method boolean com.google.android.gms.internal.ads.v.a(ad, aa, String[])>
	//   14   28:pop             
		P();
	//   15   29:aload_0         
	//   16   30:invokespecial   #588 <Method void P()>
		if(G.a() != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #279 <Field ab G>
	//*  19   37:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//*  20   40:ifnull          60
			G.a().a("close_type", String.valueOf(i1));
	//   21   43:aload_0         
	//   22   44:getfield        #279 <Field ab G>
	//   23   47:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//   24   50:ldc2            #590 <String "close_type">
	//   25   53:iload_1         
	//   26   54:invokestatic    #593 <Method String String.valueOf(int)>
	//   27   57:invokevirtual   #596 <Method void com.google.android.gms.internal.ads.ad.a(String, String)>
		HashMap hashmap = new HashMap(2);
	//   28   60:new             #527 <Class HashMap>
	//   29   63:dup             
	//   30   64:iconst_2        
	//   31   65:invokespecial   #598 <Method void HashMap(int)>
	//   32   68:astore_2        
		hashmap.put("closetype", ((Object) (String.valueOf(i1))));
	//   33   69:aload_2         
	//   34   70:ldc2            #600 <String "closetype">
	//   35   73:iload_1         
	//   36   74:invokestatic    #593 <Method String String.valueOf(int)>
	//   37   77:invokevirtual   #601 <Method Object HashMap.put(Object, Object)>
	//   38   80:pop             
		hashmap.put("version", ((Object) (c.a)));
	//   39   81:aload_2         
	//   40   82:ldc2            #603 <String "version">
	//   41   85:aload_0         
	//   42   86:getfield        #122 <Field zzbbi c>
	//   43   89:getfield        #208 <Field String com.google.android.gms.internal.ads.zzbbi.a>
	//   44   92:invokevirtual   #601 <Method Object HashMap.put(Object, Object)>
	//   45   95:pop             
		a("onhide", ((Map) (hashmap)));
	//   46   96:aload_0         
	//   47   97:ldc2            #605 <String "onhide">
	//   48  100:aload_2         
	//   49  101:invokevirtual   #544 <Method void a(String, Map)>
	//   50  104:return          
	}

	public final void a(Context context)
	{
		a.setBaseContext(context);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field aha a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #608 <Method void aha.setBaseContext(Context)>
		K.a(a.a());
	//    4    8:aload_0         
	//    5    9:getfield        #262 <Field zu K>
	//    6   12:aload_0         
	//    7   13:getfield        #110 <Field aha a>
	//    8   16:invokevirtual   #257 <Method Activity com.google.android.gms.internal.ads.aha.a()>
	//    9   19:invokevirtual   #611 <Method void com.google.android.gms.internal.ads.zu.a(Activity)>
	//   10   22:return          
	}

	public final void a(c c1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		k = c1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #614 <Field c k>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		c1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw c1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final void a(zzc zzc)
	{
		j.a(zzc);
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #617 <Method void com.google.android.gms.internal.ads.afo.a(zzc)>
	//    4    8:return          
	}

	public final void a(a a1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		l = a1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #547 <Field a l>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		a1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw a1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final void a(agd agd1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(x == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #621 <Field agd x>
	//    4    6:ifnull          18
		com.google.android.gms.internal.ads.wx.c("Attempt to create multiple AdWebViewVideoControllers.");
	//    5    9:ldc2            #623 <String "Attempt to create multiple AdWebViewVideoControllers.">
	//    6   12:invokestatic    #624 <Method void com.google.android.gms.internal.ads.wx.c(String)>
		this;
	//    7   15:aload_0         
		JVM INSTR monitorexit ;
	//    8   16:monitorexit     
		return;
	//    9   17:return          
		x = agd1;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #621 <Field agd x>
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		agd1;
	//   16   26:astore_1        
	//*  17   27:aload_0         
		throw agd1;
	//   18   28:monitorexit     
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public final void a(ahb ahb1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		m = ahb1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #112 <Field ahb m>
		requestLayout();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #628 <Method void requestLayout()>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		ahb1;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw ahb1;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public final void a(bf bf1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		A = bf1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #576 <Field bf A>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		bf1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw bf1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final void a(bpx bpx1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		y = bpx1.a;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:getfield        #634 <Field boolean com.google.android.gms.internal.ads.bpx.a>
	//    5    7:putfield        #636 <Field boolean y>
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		g(bpx1.a);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:getfield        #634 <Field boolean com.google.android.gms.internal.ads.bpx.a>
	//   11   17:invokespecial   #638 <Method void g(boolean)>
		return;
	//   12   20:return          
		bpx1;
	//   13   21:astore_1        
		this;
	//   14   22:aload_0         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw bpx1;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public final void a(String s1, ag ag)
	{
		afo afo1 = j;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:astore_3        
		if(afo1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			afo1.a(s1, ag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #641 <Method void com.google.android.gms.internal.ads.afo.a(String, ag)>
	//    9   15:return          
	}

	public final void a(String s1, p p1)
	{
		afo afo1 = j;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:astore_3        
		if(afo1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			afo1.a(s1, p1);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #644 <Method void com.google.android.gms.internal.ads.afo.a(String, p)>
	//    9   15:return          
	}

	public final void a(String s1, aeq aeq1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(P == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #422 <Field Map P>
	//*   4    6:ifnonnull       20
			P = ((Map) (new HashMap()));
	//    5    9:aload_0         
	//    6   10:new             #527 <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #529 <Method void HashMap()>
	//    9   17:putfield        #422 <Field Map P>
		P.put(((Object) (s1)), ((Object) (aeq1)));
	//   10   20:aload_0         
	//   11   21:getfield        #422 <Field Map P>
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokeinterface #539 <Method Object Map.put(Object, Object)>
	//   15   31:pop             
		this;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		s1;
	//   19   35:astore_1        
	//*  20   36:aload_0         
		throw s1;
	//   21   37:monitorexit     
	//   22   38:aload_1         
	//   23   39:athrow          
	}

	public final void a(String s1, String s2, String s3)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(C())
			break MISSING_BLOCK_LABEL_65;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #468 <Method boolean C()>
	//    4    6:ifne            65
		e e1 = p.ao;
	//    5    9:getstatic       #652 <Field e p.ao>
	//    6   12:astore          4
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   7   14:invokestatic    #655 <Method m bwk.e()>
	//*   8   17:aload           4
	//*   9   19:invokevirtual   #660 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*  10   22:checkcast       #376 <Class Boolean>
	//*  11   25:invokevirtual   #507 <Method boolean Boolean.booleanValue()>
	//*  12   28:ifeq            79
			s2 = com.google.android.gms.internal.ads.agq.a(s2, new String[] {
				com.google.android.gms.internal.ads.agq.a()
			});
	//   13   31:aload_2         
	//   14   32:iconst_1        
	//   15   33:anewarray       String[]
	//   16   36:dup             
	//   17   37:iconst_0        
	//   18   38:invokestatic    #665 <Method String com.google.android.gms.internal.ads.agq.a()>
	//   19   41:aastore         
	//   20   42:invokestatic    #668 <Method String com.google.android.gms.internal.ads.agq.a(String, String[])>
	//   21   45:astore_2        
	//*  22   46:goto            49
		super.loadDataWithBaseURL(s1, s2, "text/html", "UTF-8", s3);
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:aload_2         
	//   26   52:ldc2            #670 <String "text/html">
	//   27   55:ldc2            #672 <String "UTF-8">
	//   28   58:aload_3         
	//   29   59:invokespecial   #676 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
		this;
	//   30   62:aload_0         
		JVM INSTR monitorexit ;
	//   31   63:monitorexit     
		return;
	//   32   64:return          
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//   33   65:ldc2            #470 <String "#004 The webview is destroyed. Ignoring action.">
	//   34   68:invokestatic    #472 <Method void wx.e(String)>
		this;
	//   35   71:aload_0         
		JVM INSTR monitorexit ;
	//   36   72:monitorexit     
		return;
	//   37   73:return          
		s1;
	//   38   74:astore_1        
	//*  39   75:aload_0         
		throw s1;
	//   40   76:monitorexit     
	//   41   77:aload_1         
	//   42   78:athrow          
	//*  43   79:goto            49
	}

	public final void a(String s1, Map map)
	{
		try
		{
			map = ((Map) (aw.e().a(map)));
	//    0    0:invokestatic    #147 <Method xg aw.e()>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #681 <Method JSONObject com.google.android.gms.internal.ads.xg.a(Map)>
	//    3    7:astore_2        
		}
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #684 <Method void a(String, JSONObject)>
	//*   8   14:return          
	//*   9   15:ldc2            #686 <String "Could not convert parameters to JSON.">
	//*  10   18:invokestatic    #472 <Method void wx.e(String)>
	//*  11   21:return          
		// Misplaced declaration of an exception variable
		catch(String s1)
		{
			wx.e("Could not convert parameters to JSON.");
			return;
		}
		a(s1, ((JSONObject) (map)));
	//*  12   22:astore_1        
	//*  13   23:goto            15
	}

	public final void a(String s1, JSONObject jsonobject)
	{
		Object obj = ((Object) (jsonobject));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonobject == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new JSONObject()));
	//    4    6:new             #688 <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #689 <Method void JSONObject()>
	//    7   13:astore_3        
		obj = ((Object) (((JSONObject) (obj)).toString()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #692 <Method String JSONObject.toString()>
	//   10   18:astore_3        
		jsonobject = ((JSONObject) (new StringBuilder()));
	//   11   19:new             #694 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #695 <Method void StringBuilder()>
	//   14   26:astore_2        
		((StringBuilder) (jsonobject)).append("(window.AFMA_ReceiveMessage || function() {})('");
	//   15   27:aload_2         
	//   16   28:ldc2            #697 <String "(window.AFMA_ReceiveMessage || function() {})('">
	//   17   31:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		((StringBuilder) (jsonobject)).append(s1);
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		((StringBuilder) (jsonobject)).append("'");
	//   23   41:aload_2         
	//   24   42:ldc2            #703 <String "'">
	//   25   45:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		((StringBuilder) (jsonobject)).append(",");
	//   27   49:aload_2         
	//   28   50:ldc2            #705 <String ",">
	//   29   53:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
		((StringBuilder) (jsonobject)).append(((String) (obj)));
	//   31   57:aload_2         
	//   32   58:aload_3         
	//   33   59:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		((StringBuilder) (jsonobject)).append(");");
	//   35   63:aload_2         
	//   36   64:ldc2            #707 <String ");">
	//   37   67:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   38   70:pop             
		s1 = String.valueOf(((Object) (((StringBuilder) (jsonobject)).toString())));
	//   39   71:aload_2         
	//   40   72:invokevirtual   #708 <Method String StringBuilder.toString()>
	//   41   75:invokestatic    #512 <Method String String.valueOf(Object)>
	//   42   78:astore_1        
		if(s1.length() != 0)
	//*  43   79:aload_1         
	//*  44   80:invokevirtual   #515 <Method int String.length()>
	//*  45   83:ifeq            97
			s1 = "Dispatching AFMA event: ".concat(s1);
	//   46   86:ldc2            #710 <String "Dispatching AFMA event: ">
	//   47   89:aload_1         
	//   48   90:invokevirtual   #521 <Method String String.concat(String)>
	//   49   93:astore_1        
		else
	//*  50   94:goto            108
			s1 = new String("Dispatching AFMA event: ");
	//   51   97:new             #385 <Class String>
	//   52  100:dup             
	//   53  101:ldc2            #710 <String "Dispatching AFMA event: ">
	//   54  104:invokespecial   #523 <Method void String(String)>
	//   55  107:astore_1        
		wx.b(s1);
	//   56  108:aload_1         
	//   57  109:invokestatic    #398 <Method void wx.b(String)>
		f(((StringBuilder) (jsonobject)).toString());
	//   58  112:aload_0         
	//   59  113:aload_2         
	//   60  114:invokevirtual   #708 <Method String StringBuilder.toString()>
	//   61  117:invokespecial   #712 <Method void f(String)>
	//   62  120:return          
	}

	public final void a(boolean flag)
	{
		((afo)j).a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:checkcast       #314 <Class afo>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #714 <Method void com.google.android.gms.internal.ads.afo.a(boolean)>
	//    5   11:return          
	}

	public final void a(boolean flag, int i1)
	{
		j.a(flag, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #717 <Method void com.google.android.gms.internal.ads.afo.a(boolean, int)>
	//    5    9:return          
	}

	public final void a(boolean flag, int i1, String s1)
	{
		j.a(flag, i1, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #720 <Method void com.google.android.gms.internal.ads.afo.a(boolean, int, String)>
	//    6   10:return          
	}

	public final void a(boolean flag, int i1, String s1, String s2)
	{
		j.a(flag, i1, s1, s2);
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #723 <Method void com.google.android.gms.internal.ads.afo.a(boolean, int, String, String)>
	//    7   12:return          
	}

	public final void a(boolean flag, long l1)
	{
		HashMap hashmap = new HashMap(2);
	//    0    0:new             #527 <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:invokespecial   #598 <Method void HashMap(int)>
	//    4    8:astore          5
		String s1;
		if(flag)
	//*   5   10:iload_1         
	//*   6   11:ifeq            22
			s1 = "1";
	//    7   14:ldc2            #531 <String "1">
	//    8   17:astore          4
		else
	//*   9   19:goto            27
			s1 = "0";
	//   10   22:ldc2            #533 <String "0">
	//   11   25:astore          4
		hashmap.put("success", ((Object) (s1)));
	//   12   27:aload           5
	//   13   29:ldc2            #726 <String "success">
	//   14   32:aload           4
	//   15   34:invokevirtual   #601 <Method Object HashMap.put(Object, Object)>
	//   16   37:pop             
		hashmap.put("duration", ((Object) (Long.toString(l1))));
	//   17   38:aload           5
	//   18   40:ldc2            #728 <String "duration">
	//   19   43:lload_2         
	//   20   44:invokestatic    #733 <Method String Long.toString(long)>
	//   21   47:invokevirtual   #601 <Method Object HashMap.put(Object, Object)>
	//   22   50:pop             
		a("onCacheAccessComplete", ((Map) (hashmap)));
	//   23   51:aload_0         
	//   24   52:ldc2            #735 <String "onCacheAccessComplete">
	//   25   55:aload           5
	//   26   57:invokevirtual   #544 <Method void a(String, Map)>
	//   27   60:return          
	}

	public final agd b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		agd agd1 = x;
	//    2    2:aload_0         
	//    3    3:getfield        #621 <Field agd x>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return agd1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final void b(c c1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		I = c1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #738 <Field c I>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		c1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw c1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final void b(String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s2;
		s2 = s1;
	//    2    2:aload_1         
	//    3    3:astore_2        
		if(s1 == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       14
			s2 = "";
	//    6    8:ldc1            #98  <String "">
	//    7   10:astore_2        
	//*   8   11:goto            14
		w = s2;
	//    9   14:aload_0         
	//   10   15:aload_2         
	//   11   16:putfield        #100 <Field String w>
		this;
	//   12   19:aload_0         
		JVM INSTR monitorexit ;
	//   13   20:monitorexit     
		return;
	//   14   21:return          
	//*  15   22:aload_0         
_L2:
		throw s1;
	//   16   23:monitorexit     
	//   17   24:aload_1         
	//   18   25:athrow          
		s1;
	//   19   26:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  20   27:goto            22
	}

	public final void b(String s1, ag ag)
	{
		afo afo1 = j;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:astore_3        
		if(afo1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			afo1.b(s1, ag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #740 <Method void afo.b(String, ag)>
	//    9   15:return          
	}

	public final void b(String s1, JSONObject jsonobject)
	{
		Object obj = ((Object) (jsonobject));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonobject == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new JSONObject()));
	//    4    6:new             #688 <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #689 <Method void JSONObject()>
	//    7   13:astore_3        
		jsonobject = ((JSONObject) (((JSONObject) (obj)).toString()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #692 <Method String JSONObject.toString()>
	//   10   18:astore_2        
		obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s1))).length() + 3 + String.valueOf(((Object) (jsonobject))).length())));
	//   11   19:new             #694 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokestatic    #512 <Method String String.valueOf(Object)>
	//   15   27:invokevirtual   #515 <Method int String.length()>
	//   16   30:iconst_3        
	//   17   31:iadd            
	//   18   32:aload_2         
	//   19   33:invokestatic    #512 <Method String String.valueOf(Object)>
	//   20   36:invokevirtual   #515 <Method int String.length()>
	//   21   39:iadd            
	//   22   40:invokespecial   #741 <Method void StringBuilder(int)>
	//   23   43:astore_3        
		((StringBuilder) (obj)).append(s1);
	//   24   44:aload_3         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
		((StringBuilder) (obj)).append("(");
	//   28   50:aload_3         
	//   29   51:ldc2            #743 <String "(">
	//   30   54:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
		((StringBuilder) (obj)).append(((String) (jsonobject)));
	//   32   58:aload_3         
	//   33   59:aload_2         
	//   34   60:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
		((StringBuilder) (obj)).append(");");
	//   36   64:aload_3         
	//   37   65:ldc2            #707 <String ");">
	//   38   68:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		f(((StringBuilder) (obj)).toString());
	//   40   72:aload_0         
	//   41   73:aload_3         
	//   42   74:invokevirtual   #708 <Method String StringBuilder.toString()>
	//   43   77:invokespecial   #712 <Method void f(String)>
	//   44   80:return          
	}

	public final void b(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1;
		Object obj;
		ni ni1;
		if(flag != q)
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #116 <Field boolean q>
	//*   5    7:icmpeq          63
			flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore_2        
		else
	//*   8   12:goto            15
	//*   9   15:aload_0         
	//*  10   16:iload_1         
	//*  11   17:putfield        #116 <Field boolean q>
	//*  12   20:aload_0         
	//*  13   21:invokespecial   #226 <Method void Q()>
	//*  14   24:iload_2         
	//*  15   25:ifeq            55
	//*  16   28:new             #345 <Class ni>
	//*  17   31:dup             
	//*  18   32:aload_0         
	//*  19   33:invokespecial   #348 <Method void ni(afn)>
	//*  20   36:astore          4
	//*  21   38:iload_1         
	//*  22   39:ifeq            68
	//*  23   42:ldc2            #745 <String "expanded">
	//*  24   45:astore_3        
	//*  25   46:goto            49
	//*  26   49:aload           4
	//*  27   51:aload_3         
	//*  28   52:invokevirtual   #746 <Method void com.google.android.gms.internal.ads.ni.c(String)>
	//*  29   55:aload_0         
	//*  30   56:monitorexit     
	//*  31   57:return          
	//*  32   58:astore_3        
	//*  33   59:aload_0         
	//*  34   60:monitorexit     
	//*  35   61:aload_3         
	//*  36   62:athrow          
			flag1 = false;
	//   37   63:iconst_0        
	//   38   64:istore_2        
		q = flag;
		Q();
		if(!flag1)
			break MISSING_BLOCK_LABEL_55;
		ni1 = new ni(((afn) (this)));
		if(flag)
			obj = "expanded";
		else
	//*  39   65:goto            15
			obj = "default";
	//   40   68:ldc2            #748 <String "default">
	//   41   71:astore_3        
		ni1.c(((String) (obj)));
		this;
		JVM INSTR monitorexit ;
		return;
		obj;
		throw obj;
	//*  42   72:goto            49
	}

	public final aa c()
	{
		return E;
	//    0    0:aload_0         
	//    1    1:getfield        #291 <Field aa E>
	//    2    4:areturn         
	}

	public final void c(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(k == null)
			break MISSING_BLOCK_LABEL_27;
	//    2    2:aload_0         
	//    3    3:getfield        #614 <Field c k>
	//    4    6:ifnull          27
		k.a(j.b(), flag);
	//    5    9:aload_0         
	//    6   10:getfield        #614 <Field c k>
	//    7   13:aload_0         
	//    8   14:getfield        #312 <Field afo j>
	//    9   17:invokevirtual   #316 <Method boolean afo.b()>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #754 <Method void c.a(boolean, boolean)>
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		o = flag;
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:putfield        #756 <Field boolean o>
		this;
	//   18   32:aload_0         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return;
	//   20   34:return          
		Exception exception;
		exception;
	//   21   35:astore_2        
	//*  22   36:aload_0         
		throw exception;
	//   23   37:monitorexit     
	//   24   38:aload_2         
	//   25   39:athrow          
	}

	public final Activity d()
	{
		return a.a();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field aha a>
	//    2    4:invokevirtual   #257 <Method Activity com.google.android.gms.internal.ads.aha.a()>
	//    3    7:areturn         
	}

	public final void d(String s1)
	{
		f(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #712 <Method void f(String)>
	//    3    5:return          
	}

	public final void d(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		u = flag;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #94  <Field boolean u>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_2        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_2         
	//   12   14:athrow          
	}

	public final void destroy()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		V();
	//    2    2:aload_0         
	//    3    3:invokespecial   #265 <Method void V()>
		K.b();
	//    4    6:aload_0         
	//    5    7:getfield        #262 <Field zu K>
	//    6   10:invokevirtual   #758 <Method void zu.b()>
		if(k != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #614 <Field c k>
	//*   9   17:ifnull          39
		{
			k.a();
	//   10   20:aload_0         
	//   11   21:getfield        #614 <Field c k>
	//   12   24:invokevirtual   #759 <Method void c.a()>
			k.k();
	//   13   27:aload_0         
	//   14   28:getfield        #614 <Field c k>
	//   15   31:invokevirtual   #761 <Method void c.k()>
			k = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #614 <Field c k>
		}
		l = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #547 <Field a l>
		j.k();
	//   22   44:aload_0         
	//   23   45:getfield        #312 <Field afo j>
	//   24   48:invokevirtual   #762 <Method void afo.k()>
		flag = p;
	//   25   51:aload_0         
	//   26   52:getfield        #549 <Field boolean p>
	//   27   55:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_63;
	//   28   56:iload_1         
	//   29   57:ifeq            63
		this;
	//   30   60:aload_0         
		JVM INSTR monitorexit ;
	//   31   61:monitorexit     
		return;
	//   32   62:return          
		aw.C();
	//   33   63:invokestatic    #765 <Method aep aw.C()>
	//   34   66:pop             
		com.google.android.gms.internal.ads.aep.a(((add) (this)));
	//   35   67:aload_0         
	//   36   68:invokestatic    #770 <Method boolean com.google.android.gms.internal.ads.aep.a(add)>
	//   37   71:pop             
		U();
	//   38   72:aload_0         
	//   39   73:invokespecial   #772 <Method void U()>
		p = true;
	//   40   76:aload_0         
	//   41   77:iconst_1        
	//   42   78:putfield        #549 <Field boolean p>
		com.google.android.gms.internal.ads.wx.a("Initiating WebView self destruct sequence in 3...");
	//   43   81:ldc2            #774 <String "Initiating WebView self destruct sequence in 3...">
	//   44   84:invokestatic    #553 <Method void com.google.android.gms.internal.ads.wx.a(String)>
		com.google.android.gms.internal.ads.wx.a("Loading blank page in WebView, 2...");
	//   45   87:ldc2            #776 <String "Loading blank page in WebView, 2...">
	//   46   90:invokestatic    #553 <Method void com.google.android.gms.internal.ads.wx.a(String)>
		e("about:blank");
	//   47   93:aload_0         
	//   48   94:ldc2            #778 <String "about:blank">
	//   49   97:invokespecial   #779 <Method void e(String)>
		this;
	//   50  100:aload_0         
		JVM INSTR monitorexit ;
	//   51  101:monitorexit     
		return;
	//   52  102:return          
		Exception exception;
		exception;
	//   53  103:astore_2        
	//*  54  104:aload_0         
		throw exception;
	//   55  105:monitorexit     
	//   56  106:aload_2         
	//   57  107:athrow          
	}

	public final bs e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field bs e>
	//    2    4:areturn         
	}

	public final void e(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j1 = B;
	//    2    2:aload_0         
	//    3    3:getfield        #570 <Field int B>
	//    4    6:istore_3        
		int i1;
		Exception exception;
		if(flag)
	//*   5    7:iload_1         
	//*   6    8:ifeq            54
			i1 = 1;
	//    7   11:iconst_1        
	//    8   12:istore_2        
		else
	//*   9   13:goto            16
	//*  10   16:aload_0         
	//*  11   17:iload_3         
	//*  12   18:iload_2         
	//*  13   19:iadd            
	//*  14   20:putfield        #570 <Field int B>
	//*  15   23:aload_0         
	//*  16   24:getfield        #570 <Field int B>
	//*  17   27:ifgt            44
	//*  18   30:aload_0         
	//*  19   31:getfield        #614 <Field c k>
	//*  20   34:ifnull          44
	//*  21   37:aload_0         
	//*  22   38:getfield        #614 <Field c k>
	//*  23   41:invokevirtual   #782 <Method void c.q()>
	//*  24   44:aload_0         
	//*  25   45:monitorexit     
	//*  26   46:return          
	//*  27   47:astore          4
	//*  28   49:aload_0         
	//*  29   50:monitorexit     
	//*  30   51:aload           4
	//*  31   53:athrow          
			i1 = -1;
	//   32   54:iconst_m1       
	//   33   55:istore_2        
		B = j1 + i1;
		if(B <= 0 && k != null)
			k.q();
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  34   56:goto            16
	}

	public final void evaluateJavascript(String s1, ValueCallback valuecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!C())
			break MISSING_BLOCK_LABEL_29;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #468 <Method boolean C()>
	//    4    6:ifeq            29
		wx.f("#004 The webview is destroyed. Ignoring action.");
	//    5    9:ldc2            #470 <String "#004 The webview is destroyed. Ignoring action.">
	//    6   12:invokestatic    #783 <Method void wx.f(String)>
		if(valuecallback == null)
			break MISSING_BLOCK_LABEL_26;
	//    7   15:aload_2         
	//    8   16:ifnull          26
		valuecallback.onReceiveValue(((Object) (null)));
	//    9   19:aload_2         
	//   10   20:aconst_null     
	//   11   21:invokeinterface #789 <Method void ValueCallback.onReceiveValue(Object)>
		this;
	//   12   26:aload_0         
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return;
	//   14   28:return          
		super.evaluateJavascript(s1, valuecallback);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokespecial   #790 <Method void WebView.evaluateJavascript(String, ValueCallback)>
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return;
	//   21   37:return          
		s1;
	//   22   38:astore_1        
	//*  23   39:aload_0         
		throw s1;
	//   24   40:monitorexit     
	//   25   41:aload_1         
	//   26   42:athrow          
	}

	public final void f()
	{
		c c1 = s();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #793 <Method c s()>
	//    2    4:astore_1        
		if(c1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			c1.p();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #795 <Method void c.p()>
	//    7   13:return          
	}

	public final void f(boolean flag)
	{
		j.b(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #797 <Method void afo.b(boolean)>
	//    4    8:return          
	}

	protected final void finalize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!p)
	//*   2    2:aload_0         
	//*   3    3:getfield        #549 <Field boolean p>
	//*   4    6:ifne            33
		{
			j.k();
	//    5    9:aload_0         
	//    6   10:getfield        #312 <Field afo j>
	//    7   13:invokevirtual   #762 <Method void afo.k()>
			aw.C();
	//    8   16:invokestatic    #765 <Method aep aw.C()>
	//    9   19:pop             
			com.google.android.gms.internal.ads.aep.a(((add) (this)));
	//   10   20:aload_0         
	//   11   21:invokestatic    #770 <Method boolean com.google.android.gms.internal.ads.aep.a(add)>
	//   12   24:pop             
			U();
	//   13   25:aload_0         
	//   14   26:invokespecial   #772 <Method void U()>
			T();
	//   15   29:aload_0         
	//   16   30:invokespecial   #555 <Method void T()>
		}
		this;
	//   17   33:aload_0         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		((Object)this).finalize();
	//   19   35:aload_0         
	//   20   36:invokespecial   #802 <Method void Object.finalize()>
		return;
	//   21   39:return          
		Exception exception;
		exception;
	//   22   40:astore_1        
		this;
	//   23   41:aload_0         
		JVM INSTR monitorexit ;
	//   24   42:monitorexit     
		throw exception;
	//   25   43:aload_1         
	//   26   44:athrow          
		exception;
	//   27   45:astore_1        
		((Object)this).finalize();
	//   28   46:aload_0         
	//   29   47:invokespecial   #802 <Method void Object.finalize()>
		throw exception;
	//   30   50:aload_1         
	//   31   51:athrow          
	}

	public final String g()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1 = w;
	//    2    2:aload_0         
	//    3    3:getfield        #100 <Field String w>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return s1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final android.view.View.OnClickListener getOnClickListener()
	{
		return (android.view.View.OnClickListener)H.get();
	//    0    0:aload_0         
	//    1    1:getfield        #806 <Field WeakReference H>
	//    2    4:invokevirtual   #810 <Method Object WeakReference.get()>
	//    3    7:checkcast       #812 <Class android.view.View$OnClickListener>
	//    4   10:areturn         
	}

	public final int getRequestedOrientation()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i1 = t;
	//    2    2:aload_0         
	//    3    3:getfield        #118 <Field int t>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return i1;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public final View getView()
	{
		return ((View) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final WebView getWebView()
	{
		return ((WebView) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public final void h_()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		v = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #96  <Field boolean v>
		if(d != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #124 <Field ap d>
	//*   7   11:ifnull          23
			d.h_();
	//    8   14:aload_0         
	//    9   15:getfield        #124 <Field ap d>
	//   10   18:invokeinterface #822 <Method void ap.h_()>
		this;
	//   11   23:aload_0         
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		return;
	//   13   25:return          
		Exception exception;
		exception;
	//   14   26:astore_1        
	//*  15   27:aload_0         
		throw exception;
	//   16   28:monitorexit     
	//   17   29:aload_1         
	//   18   30:athrow          
	}

	public final void i_()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		v = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #96  <Field boolean v>
		if(d != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #124 <Field ap d>
	//*   7   11:ifnull          23
			d.i_();
	//    8   14:aload_0         
	//    9   15:getfield        #124 <Field ap d>
	//   10   18:invokeinterface #825 <Method void ap.i_()>
		this;
	//   11   23:aload_0         
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		return;
	//   13   25:return          
		Exception exception;
		exception;
	//   14   26:astore_1        
	//*  15   27:aload_0         
		throw exception;
	//   16   28:monitorexit     
	//   17   29:aload_1         
	//   18   30:athrow          
	}

	public final ab j()
	{
		return G;
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field ab G>
	//    2    4:areturn         
	}

	public final zzbbi k()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field zzbbi c>
	//    2    4:areturn         
	}

	public final int l()
	{
		return getMeasuredHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #830 <Method int getMeasuredHeight()>
	//    2    4:ireturn         
	}

	public final void loadData(String s1, String s2, String s3)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(C())
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #468 <Method boolean C()>
	//    4    6:ifne            19
		super.loadData(s1, s2, s3);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #833 <Method void WebView.loadData(String, String, String)>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//   13   19:ldc2            #470 <String "#004 The webview is destroyed. Ignoring action.">
	//   14   22:invokestatic    #472 <Method void wx.e(String)>
		this;
	//   15   25:aload_0         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		return;
	//   17   27:return          
		s1;
	//   18   28:astore_1        
	//*  19   29:aload_0         
		throw s1;
	//   20   30:monitorexit     
	//   21   31:aload_1         
	//   22   32:athrow          
	}

	public final void loadDataWithBaseURL(String s1, String s2, String s3, String s4, String s5)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(C())
			break MISSING_BLOCK_LABEL_23;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #468 <Method boolean C()>
	//    4    6:ifne            23
		super.loadDataWithBaseURL(s1, s2, s3, s4, s5);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:aload           5
	//   11   17:invokespecial   #676 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//   15   23:ldc2            #470 <String "#004 The webview is destroyed. Ignoring action.">
	//   16   26:invokestatic    #472 <Method void wx.e(String)>
		this;
	//   17   29:aload_0         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return;
	//   19   31:return          
		s1;
	//   20   32:astore_1        
	//*  21   33:aload_0         
		throw s1;
	//   22   34:monitorexit     
	//   23   35:aload_1         
	//   24   36:athrow          
	}

	public final void loadUrl(String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = C();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #468 <Method boolean C()>
	//    4    6:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_48;
	//    5    7:iload_2         
	//    6    8:ifne            48
		super.loadUrl(s1);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokespecial   #489 <Method void WebView.loadUrl(String)>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		s1;
	//   13   19:astore_1        
		break MISSING_BLOCK_LABEL_28;
	//   14   20:goto            28
		s1;
	//   15   23:astore_1        
		break MISSING_BLOCK_LABEL_28;
	//   16   24:goto            28
		s1;
	//   17   27:astore_1        
		aw.i().a(((Throwable) (s1)), "AdWebViewImpl.loadUrl");
	//   18   28:invokestatic    #305 <Method wi aw.i()>
	//   19   31:aload_1         
	//   20   32:ldc2            #835 <String "AdWebViewImpl.loadUrl">
	//   21   35:invokevirtual   #494 <Method void com.google.android.gms.internal.ads.wi.a(Throwable, String)>
		com.google.android.gms.internal.ads.wx.c("Could not call loadUrl. ", ((Throwable) (s1)));
	//   22   38:ldc2            #496 <String "Could not call loadUrl. ">
	//   23   41:aload_1         
	//   24   42:invokestatic    #498 <Method void com.google.android.gms.internal.ads.wx.c(String, Throwable)>
		this;
	//   25   45:aload_0         
		JVM INSTR monitorexit ;
	//   26   46:monitorexit     
		return;
	//   27   47:return          
		wx.e("#004 The webview is destroyed. Ignoring action.");
	//   28   48:ldc2            #470 <String "#004 The webview is destroyed. Ignoring action.">
	//   29   51:invokestatic    #472 <Method void wx.e(String)>
		this;
	//   30   54:aload_0         
		JVM INSTR monitorexit ;
	//   31   55:monitorexit     
		return;
	//   32   56:return          
		s1;
	//   33   57:astore_1        
	//*  34   58:aload_0         
		throw s1;
	//   35   59:monitorexit     
	//   36   60:aload_1         
	//   37   61:athrow          
	}

	public final int m()
	{
		return getMeasuredWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #838 <Method int getMeasuredWidth()>
	//    2    4:ireturn         
	}

	public final void n()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
	//*   2    2:aload_0         
	//    3    3:monitorexit     
	//    4    4:return          
	}

	public final void o()
	{
		P();
	//    0    0:aload_0         
	//    1    1:invokespecial   #588 <Method void P()>
		HashMap hashmap = new HashMap(1);
	//    2    4:new             #527 <Class HashMap>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:invokespecial   #598 <Method void HashMap(int)>
	//    6   12:astore_1        
		hashmap.put("version", ((Object) (c.a)));
	//    7   13:aload_1         
	//    8   14:ldc2            #603 <String "version">
	//    9   17:aload_0         
	//   10   18:getfield        #122 <Field zzbbi c>
	//   11   21:getfield        #208 <Field String com.google.android.gms.internal.ads.zzbbi.a>
	//   12   24:invokevirtual   #601 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
		a("onhide", ((Map) (hashmap)));
	//   14   28:aload_0         
	//   15   29:ldc2            #605 <String "onhide">
	//   16   32:aload_1         
	//   17   33:invokevirtual   #544 <Method void a(String, Map)>
	//   18   36:return          
	}

	protected final void onAttachedToWindow()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1;
		super.onAttachedToWindow();
	//    2    2:aload_0         
	//    3    3:invokespecial   #841 <Method void WebView.onAttachedToWindow()>
		if(!C())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #468 <Method boolean C()>
	//*   6   10:ifne            20
			K.c();
	//    7   13:aload_0         
	//    8   14:getfield        #262 <Field zu K>
	//    9   17:invokevirtual   #843 <Method void com.google.android.gms.internal.ads.zu.c()>
		flag1 = y;
	//   10   20:aload_0         
	//   11   21:getfield        #636 <Field boolean y>
	//   12   24:istore_2        
		boolean flag = flag1;
	//   13   25:iload_2         
	//   14   26:istore_1        
		if((afo)j == null)
			break MISSING_BLOCK_LABEL_119;
	//   15   27:aload_0         
	//   16   28:getfield        #312 <Field afo j>
	//   17   31:checkcast       #314 <Class afo>
	//   18   34:ifnull          119
		flag = flag1;
	//   19   37:iload_2         
	//   20   38:istore_1        
		Object obj;
		if(!((afo)j).c())
			break MISSING_BLOCK_LABEL_119;
	//   21   39:aload_0         
	//   22   40:getfield        #312 <Field afo j>
	//   23   43:checkcast       #314 <Class afo>
	//   24   46:invokevirtual   #318 <Method boolean com.google.android.gms.internal.ads.afo.c()>
	//   25   49:ifeq            119
		if(z)
			break MISSING_BLOCK_LABEL_112;
	//   26   52:aload_0         
	//   27   53:getfield        #845 <Field boolean z>
	//   28   56:ifne            112
		obj = ((Object) (((afo)j).d()));
	//   29   59:aload_0         
	//   30   60:getfield        #312 <Field afo j>
	//   31   63:checkcast       #314 <Class afo>
	//   32   66:invokevirtual   #848 <Method android.view.ViewTreeObserver$OnGlobalLayoutListener afo.d()>
	//   33   69:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_83;
	//   34   70:aload_3         
	//   35   71:ifnull          83
		aw.D();
	//   36   74:invokestatic    #851 <Method abw aw.D()>
	//   37   77:pop             
		com.google.android.gms.internal.ads.abw.a(((View) (this)), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (obj)));
	//   38   78:aload_0         
	//   39   79:aload_3         
	//   40   80:invokestatic    #856 <Method void com.google.android.gms.internal.ads.abw.a(View, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		obj = ((Object) (((afo)j).e()));
	//   41   83:aload_0         
	//   42   84:getfield        #312 <Field afo j>
	//   43   87:checkcast       #314 <Class afo>
	//   44   90:invokevirtual   #859 <Method android.view.ViewTreeObserver$OnScrollChangedListener afo.e()>
	//   45   93:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_107;
	//   46   94:aload_3         
	//   47   95:ifnull          107
		aw.D();
	//   48   98:invokestatic    #851 <Method abw aw.D()>
	//   49  101:pop             
		com.google.android.gms.internal.ads.abw.a(((View) (this)), ((android.view.ViewTreeObserver.OnScrollChangedListener) (obj)));
	//   50  102:aload_0         
	//   51  103:aload_3         
	//   52  104:invokestatic    #862 <Method void com.google.android.gms.internal.ads.abw.a(View, android.view.ViewTreeObserver$OnScrollChangedListener)>
		z = true;
	//   53  107:aload_0         
	//   54  108:iconst_1        
	//   55  109:putfield        #845 <Field boolean z>
		M();
	//   56  112:aload_0         
	//   57  113:invokespecial   #864 <Method boolean M()>
	//   58  116:pop             
		flag = true;
	//   59  117:iconst_1        
	//   60  118:istore_1        
		g(flag);
	//   61  119:aload_0         
	//   62  120:iload_1         
	//   63  121:invokespecial   #638 <Method void g(boolean)>
		this;
	//   64  124:aload_0         
		JVM INSTR monitorexit ;
	//   65  125:monitorexit     
		return;
	//   66  126:return          
		Exception exception;
		exception;
	//   67  127:astore_3        
	//*  68  128:aload_0         
		throw exception;
	//   69  129:monitorexit     
	//   70  130:aload_3         
	//   71  131:athrow          
	}

	protected final void onDetachedFromWindow()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		if(!C())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #468 <Method boolean C()>
	//*   4    6:ifne            16
			K.d();
	//    5    9:aload_0         
	//    6   10:getfield        #262 <Field zu K>
	//    7   13:invokevirtual   #867 <Method void zu.d()>
		super.onDetachedFromWindow();
	//    8   16:aload_0         
	//    9   17:invokespecial   #869 <Method void WebView.onDetachedFromWindow()>
		if(!z || (afo)j == null || !((afo)j).c() || getViewTreeObserver() == null || !getViewTreeObserver().isAlive())
			break MISSING_BLOCK_LABEL_121;
	//   10   20:aload_0         
	//   11   21:getfield        #845 <Field boolean z>
	//   12   24:ifeq            121
	//   13   27:aload_0         
	//   14   28:getfield        #312 <Field afo j>
	//   15   31:checkcast       #314 <Class afo>
	//   16   34:ifnull          121
	//   17   37:aload_0         
	//   18   38:getfield        #312 <Field afo j>
	//   19   41:checkcast       #314 <Class afo>
	//   20   44:invokevirtual   #318 <Method boolean com.google.android.gms.internal.ads.afo.c()>
	//   21   47:ifeq            121
	//   22   50:aload_0         
	//   23   51:invokevirtual   #873 <Method ViewTreeObserver getViewTreeObserver()>
	//   24   54:ifnull          121
	//   25   57:aload_0         
	//   26   58:invokevirtual   #873 <Method ViewTreeObserver getViewTreeObserver()>
	//   27   61:invokevirtual   #878 <Method boolean ViewTreeObserver.isAlive()>
	//   28   64:ifeq            121
		obj = ((Object) (((afo)j).d()));
	//   29   67:aload_0         
	//   30   68:getfield        #312 <Field afo j>
	//   31   71:checkcast       #314 <Class afo>
	//   32   74:invokevirtual   #848 <Method android.view.ViewTreeObserver$OnGlobalLayoutListener afo.d()>
	//   33   77:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_93;
	//   34   78:aload_1         
	//   35   79:ifnull          93
		aw.g().a(getViewTreeObserver(), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (obj)));
	//   36   82:invokestatic    #214 <Method xo aw.g()>
	//   37   85:aload_0         
	//   38   86:invokevirtual   #873 <Method ViewTreeObserver getViewTreeObserver()>
	//   39   89:aload_1         
	//   40   90:invokevirtual   #881 <Method void com.google.android.gms.internal.ads.xo.a(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		obj = ((Object) (((afo)j).e()));
	//   41   93:aload_0         
	//   42   94:getfield        #312 <Field afo j>
	//   43   97:checkcast       #314 <Class afo>
	//   44  100:invokevirtual   #859 <Method android.view.ViewTreeObserver$OnScrollChangedListener afo.e()>
	//   45  103:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_116;
	//   46  104:aload_1         
	//   47  105:ifnull          116
		getViewTreeObserver().removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (obj)));
	//   48  108:aload_0         
	//   49  109:invokevirtual   #873 <Method ViewTreeObserver getViewTreeObserver()>
	//   50  112:aload_1         
	//   51  113:invokevirtual   #885 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
		z = false;
	//   52  116:aload_0         
	//   53  117:iconst_0        
	//   54  118:putfield        #845 <Field boolean z>
		this;
	//   55  121:aload_0         
		JVM INSTR monitorexit ;
	//   56  122:monitorexit     
		g(false);
	//   57  123:aload_0         
	//   58  124:iconst_0        
	//   59  125:invokespecial   #638 <Method void g(boolean)>
		return;
	//   60  128:return          
		Exception exception;
		exception;
	//   61  129:astore_1        
		this;
	//   62  130:aload_0         
		JVM INSTR monitorexit ;
	//   63  131:monitorexit     
		throw exception;
	//   64  132:aload_1         
	//   65  133:athrow          
	}

	public final void onDownloadStart(String s1, String s2, String s3, String s4, long l1)
	{
		try
		{
			s2 = ((String) (new Intent("android.intent.action.VIEW")));
	//    0    0:new             #891 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #893 <String "android.intent.action.VIEW">
	//    3    7:invokespecial   #894 <Method void Intent(String)>
	//    4   10:astore_2        
			((Intent) (s2)).setDataAndType(Uri.parse(s1), s4);
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokestatic    #900 <Method Uri Uri.parse(String)>
	//    8   16:aload           4
	//    9   18:invokevirtual   #904 <Method Intent Intent.setDataAndType(Uri, String)>
	//   10   21:pop             
			aw.e();
	//   11   22:invokestatic    #147 <Method xg aw.e()>
	//   12   25:pop             
			com.google.android.gms.internal.ads.xg.a(getContext(), ((Intent) (s2)));
	//   13   26:aload_0         
	//   14   27:invokevirtual   #130 <Method Context getContext()>
	//   15   30:aload_2         
	//   16   31:invokestatic    #907 <Method void com.google.android.gms.internal.ads.xg.a(Context, Intent)>
			return;
	//   17   34:return          
		}
	//*  18   35:new             #694 <Class StringBuilder>
	//*  19   38:dup             
	//*  20   39:aload_1         
	//*  21   40:invokestatic    #512 <Method String String.valueOf(Object)>
	//*  22   43:invokevirtual   #515 <Method int String.length()>
	//*  23   46:bipush          51
	//*  24   48:iadd            
	//*  25   49:aload           4
	//*  26   51:invokestatic    #512 <Method String String.valueOf(Object)>
	//*  27   54:invokevirtual   #515 <Method int String.length()>
	//*  28   57:iadd            
	//*  29   58:invokespecial   #741 <Method void StringBuilder(int)>
	//*  30   61:astore_2        
	//*  31   62:aload_2         
	//*  32   63:ldc2            #909 <String "Couldn't find an Activity to view url/mimetype: ">
	//*  33   66:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//*  34   69:pop             
	//*  35   70:aload_2         
	//*  36   71:aload_1         
	//*  37   72:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//*  38   75:pop             
	//*  39   76:aload_2         
	//*  40   77:ldc2            #911 <String " / ">
	//*  41   80:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//*  42   83:pop             
	//*  43   84:aload_2         
	//*  44   85:aload           4
	//*  45   87:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//*  46   90:pop             
	//*  47   91:aload_2         
	//*  48   92:invokevirtual   #708 <Method String StringBuilder.toString()>
	//*  49   95:invokestatic    #398 <Method void wx.b(String)>
	//*  50   98:return          
		// Misplaced declaration of an exception variable
		catch(String s2)
		{
			s2 = ((String) (new StringBuilder(String.valueOf(((Object) (s1))).length() + 51 + String.valueOf(((Object) (s4))).length())));
		}
		((StringBuilder) (s2)).append("Couldn't find an Activity to view url/mimetype: ");
		((StringBuilder) (s2)).append(s1);
		((StringBuilder) (s2)).append(" / ");
		((StringBuilder) (s2)).append(s4);
		wx.b(((StringBuilder) (s2)).toString());
	//*  51   99:astore_2        
	//*  52  100:goto            35
	}

	protected final void onDraw(Canvas canvas)
	{
		if(C())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #468 <Method boolean C()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow())
	//*   4    8:getstatic       #201 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmpne          31
	//*   7   16:aload_1         
	//*   8   17:invokevirtual   #919 <Method boolean Canvas.isHardwareAccelerated()>
	//*   9   20:ifeq            31
	//*  10   23:aload_0         
	//*  11   24:invokevirtual   #922 <Method boolean isAttachedToWindow()>
	//*  12   27:ifne            31
			return;
	//   13   30:return          
		super.onDraw(canvas);
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:invokespecial   #924 <Method void WebView.onDraw(Canvas)>
		canvas = ((Canvas) (j));
	//   17   36:aload_0         
	//   18   37:getfield        #312 <Field afo j>
	//   19   40:astore_1        
		if((afo)canvas != null && ((afo)canvas).l() != null)
	//*  20   41:aload_1         
	//*  21   42:checkcast       #314 <Class afo>
	//*  22   45:ifnull          73
	//*  23   48:aload_1         
	//*  24   49:checkcast       #314 <Class afo>
	//*  25   52:invokevirtual   #927 <Method agz afo.l()>
	//*  26   55:ifnull          73
			((afo)j).l().a();
	//   27   58:aload_0         
	//   28   59:getfield        #312 <Field afo j>
	//   29   62:checkcast       #314 <Class afo>
	//   30   65:invokevirtual   #927 <Method agz afo.l()>
	//   31   68:invokeinterface #930 <Method void com.google.android.gms.internal.ads.agz.a()>
	//   32   73:return          
	}

	public final boolean onGenericMotionEvent(MotionEvent motionevent)
	{
		float f1 = motionevent.getAxisValue(9);
	//    0    0:aload_1         
	//    1    1:bipush          9
	//    2    3:invokevirtual   #938 <Method float MotionEvent.getAxisValue(int)>
	//    3    6:fstore_2        
		float f2 = motionevent.getAxisValue(10);
	//    4    7:aload_1         
	//    5    8:bipush          10
	//    6   10:invokevirtual   #938 <Method float MotionEvent.getAxisValue(int)>
	//    7   13:fstore_3        
		if(motionevent.getActionMasked() == 8 && (f1 > 0.0F && !canScrollVertically(-1) || f1 < 0.0F && !canScrollVertically(1) || f2 > 0.0F && !canScrollHorizontally(-1) || f2 < 0.0F && !canScrollHorizontally(1)))
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #941 <Method int MotionEvent.getActionMasked()>
	//*  10   18:bipush          8
	//*  11   20:icmpne          81
	//*  12   23:fload_2         
	//*  13   24:fconst_0        
	//*  14   25:fcmpl           
	//*  15   26:ifle            37
	//*  16   29:aload_0         
	//*  17   30:iconst_m1       
	//*  18   31:invokevirtual   #945 <Method boolean canScrollVertically(int)>
	//*  19   34:ifeq            79
	//*  20   37:fload_2         
	//*  21   38:fconst_0        
	//*  22   39:fcmpg           
	//*  23   40:ifge            51
	//*  24   43:aload_0         
	//*  25   44:iconst_1        
	//*  26   45:invokevirtual   #945 <Method boolean canScrollVertically(int)>
	//*  27   48:ifeq            79
	//*  28   51:fload_3         
	//*  29   52:fconst_0        
	//*  30   53:fcmpl           
	//*  31   54:ifle            65
	//*  32   57:aload_0         
	//*  33   58:iconst_m1       
	//*  34   59:invokevirtual   #948 <Method boolean canScrollHorizontally(int)>
	//*  35   62:ifeq            79
	//*  36   65:fload_3         
	//*  37   66:fconst_0        
	//*  38   67:fcmpg           
	//*  39   68:ifge            81
	//*  40   71:aload_0         
	//*  41   72:iconst_1        
	//*  42   73:invokevirtual   #948 <Method boolean canScrollHorizontally(int)>
	//*  43   76:ifne            81
			return false;
	//   44   79:iconst_0        
	//   45   80:ireturn         
		else
			return super.onGenericMotionEvent(motionevent);
	//   46   81:aload_0         
	//   47   82:aload_1         
	//   48   83:invokespecial   #950 <Method boolean WebView.onGenericMotionEvent(MotionEvent)>
	//   49   86:ireturn         
	}

	public final void onGlobalLayout()
	{
		boolean flag = M();
	//    0    0:aload_0         
	//    1    1:invokespecial   #864 <Method boolean M()>
	//    2    4:istore_1        
		c c1 = s();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #793 <Method c s()>
	//    5    9:astore_2        
		if(c1 != null && flag)
	//*   6   10:aload_2         
	//*   7   11:ifnull          22
	//*   8   14:iload_1         
	//*   9   15:ifeq            22
			c1.o();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #953 <Method void c.o()>
	//   12   22:return          
	}

	protected final void onMeasure(int i1, int j1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!C())
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #468 <Method boolean C()>
	//    4    6:ifeq            18
		setMeasuredDimension(0, 0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #960 <Method void setMeasuredDimension(int, int)>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		if(!isInEditMode() && !q && !m.f()) goto _L2; else goto _L1
	//   12   18:aload_0         
	//   13   19:invokevirtual   #963 <Method boolean isInEditMode()>
	//   14   22:ifne            823
	//   15   25:aload_0         
	//   16   26:getfield        #116 <Field boolean q>
	//   17   29:ifne            823
	//   18   32:aload_0         
	//   19   33:getfield        #112 <Field ahb m>
	//   20   36:invokevirtual   #964 <Method boolean ahb.f()>
	//   21   39:ifeq            45
	//*  22   42:goto            823
_L2:
		if(!m.h())
			break MISSING_BLOCK_LABEL_64;
	//   23   45:aload_0         
	//   24   46:getfield        #112 <Field ahb m>
	//   25   49:invokevirtual   #966 <Method boolean ahb.h()>
	//   26   52:ifeq            64
		super.onMeasure(i1, j1);
	//   27   55:aload_0         
	//   28   56:iload_1         
	//   29   57:iload_2         
	//   30   58:invokespecial   #968 <Method void WebView.onMeasure(int, int)>
		this;
	//   31   61:aload_0         
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		return;
	//   33   63:return          
		if(!m.g()) goto _L4; else goto _L3
	//   34   64:aload_0         
	//   35   65:getfield        #112 <Field ahb m>
	//   36   68:invokevirtual   #970 <Method boolean ahb.g()>
	//   37   71:ifeq            270
_L3:
		e e1 = p.bE;
	//   38   74:getstatic       #973 <Field e p.bE>
	//   39   77:astore          10
		if(!((Boolean)bwk.e().a(e1)).booleanValue())
			break MISSING_BLOCK_LABEL_105;
	//   40   79:invokestatic    #655 <Method m bwk.e()>
	//   41   82:aload           10
	//   42   84:invokevirtual   #660 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//   43   87:checkcast       #376 <Class Boolean>
	//   44   90:invokevirtual   #507 <Method boolean Boolean.booleanValue()>
	//   45   93:ifeq            105
		super.onMeasure(i1, j1);
	//   46   96:aload_0         
	//   47   97:iload_1         
	//   48   98:iload_2         
	//   49   99:invokespecial   #968 <Method void WebView.onMeasure(int, int)>
		this;
	//   50  102:aload_0         
		JVM INSTR monitorexit ;
	//   51  103:monitorexit     
		return;
	//   52  104:return          
		agd agd1 = b();
	//   53  105:aload_0         
	//   54  106:invokevirtual   #975 <Method agd b()>
	//   55  109:astore          10
		if(agd1 == null) goto _L6; else goto _L5
	//   56  111:aload           10
	//   57  113:ifnull          839
_L5:
		float f1 = agd1.h();
	//   58  116:aload           10
	//   59  118:invokevirtual   #980 <Method float agd.h()>
	//   60  121:fstore_3        
	//*  61  122:goto            125
_L10:
		if(f1 != 0.0F)
			break MISSING_BLOCK_LABEL_140;
	//   62  125:fload_3         
	//   63  126:fconst_0        
	//   64  127:fcmpl           
	//   65  128:ifne            140
		super.onMeasure(i1, j1);
	//   66  131:aload_0         
	//   67  132:iload_1         
	//   68  133:iload_2         
	//   69  134:invokespecial   #968 <Method void WebView.onMeasure(int, int)>
		this;
	//   70  137:aload_0         
		JVM INSTR monitorexit ;
	//   71  138:monitorexit     
		return;
	//   72  139:return          
		int l2;
		int i3;
		l2 = android.view.View.MeasureSpec.getSize(i1);
	//   73  140:iload_1         
	//   74  141:invokestatic    #986 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   75  144:istore          8
		i3 = android.view.View.MeasureSpec.getSize(j1);
	//   76  146:iload_2         
	//   77  147:invokestatic    #986 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   78  150:istore          9
		i1 = (int)((float)i3 * f1);
	//   79  152:iload           9
	//   80  154:i2f             
	//   81  155:fload_3         
	//   82  156:fmul            
	//   83  157:f2i             
	//   84  158:istore_1        
		j1 = (int)((float)l2 / f1);
	//   85  159:iload           8
	//   86  161:i2f             
	//   87  162:fload_3         
	//   88  163:fdiv            
	//   89  164:f2i             
	//   90  165:istore_2        
		int k1;
		int i2;
		int j2;
		int k2;
		if(i3 == 0 && j1 != 0)
	//*  91  166:iload           9
	//*  92  168:ifne            195
	//*  93  171:iload_2         
	//*  94  172:ifeq            195
		{
			j2 = (int)((float)j1 * f1);
	//   95  175:iload_2         
	//   96  176:i2f             
	//   97  177:fload_3         
	//   98  178:fmul            
	//   99  179:f2i             
	//  100  180:istore          6
			i2 = j1;
	//  101  182:iload_2         
	//  102  183:istore          5
			k2 = j1;
	//  103  185:iload_2         
	//  104  186:istore          7
			k1 = l2;
	//  105  188:iload           8
	//  106  190:istore          4
			break MISSING_BLOCK_LABEL_249;
	//  107  192:goto            249
		}
		j2 = i1;
	//  108  195:iload_1         
	//  109  196:istore          6
		k2 = j1;
	//  110  198:iload_2         
	//  111  199:istore          7
		k1 = l2;
	//  112  201:iload           8
	//  113  203:istore          4
		i2 = i3;
	//  114  205:iload           9
	//  115  207:istore          5
		if(l2 != 0)
			break MISSING_BLOCK_LABEL_249;
	//  116  209:iload           8
	//  117  211:ifne            249
		j2 = i1;
	//  118  214:iload_1         
	//  119  215:istore          6
		k2 = j1;
	//  120  217:iload_2         
	//  121  218:istore          7
		k1 = l2;
	//  122  220:iload           8
	//  123  222:istore          4
		i2 = i3;
	//  124  224:iload           9
	//  125  226:istore          5
		if(i1 == 0)
			break MISSING_BLOCK_LABEL_249;
	//  126  228:iload_1         
	//  127  229:ifeq            249
		k2 = (int)((float)i1 / f1);
	//  128  232:iload_1         
	//  129  233:i2f             
	//  130  234:fload_3         
	//  131  235:fdiv            
	//  132  236:f2i             
	//  133  237:istore          7
		k1 = i1;
	//  134  239:iload_1         
	//  135  240:istore          4
		i2 = i3;
	//  136  242:iload           9
	//  137  244:istore          5
		j2 = i1;
	//  138  246:iload_1         
	//  139  247:istore          6
		setMeasuredDimension(Math.min(j2, k1), Math.min(k2, i2));
	//  140  249:aload_0         
	//  141  250:iload           6
	//  142  252:iload           4
	//  143  254:invokestatic    #992 <Method int Math.min(int, int)>
	//  144  257:iload           7
	//  145  259:iload           5
	//  146  261:invokestatic    #992 <Method int Math.min(int, int)>
	//  147  264:invokevirtual   #960 <Method void setMeasuredDimension(int, int)>
		this;
	//  148  267:aload_0         
		JVM INSTR monitorexit ;
	//  149  268:monitorexit     
		return;
	//  150  269:return          
_L4:
		if(!m.d())
			break MISSING_BLOCK_LABEL_391;
	//  151  270:aload_0         
	//  152  271:getfield        #112 <Field ahb m>
	//  153  274:invokevirtual   #993 <Method boolean ahb.d()>
	//  154  277:ifeq            391
		e e2 = p.bJ;
	//  155  280:getstatic       #996 <Field e p.bJ>
	//  156  283:astore          10
		if(((Boolean)bwk.e().a(e2)).booleanValue() || !com.google.android.gms.common.util.o.d())
	//* 157  285:invokestatic    #655 <Method m bwk.e()>
	//* 158  288:aload           10
	//* 159  290:invokevirtual   #660 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//* 160  293:checkcast       #376 <Class Boolean>
	//* 161  296:invokevirtual   #507 <Method boolean Boolean.booleanValue()>
	//* 162  299:ifne            382
	//* 163  302:invokestatic    #231 <Method boolean o.d()>
	//* 164  305:ifne            311
			break MISSING_BLOCK_LABEL_382;
	//  165  308:goto            382
		a("/contentHeight", ((ag) (new agb(this))));
	//  166  311:aload_0         
	//  167  312:ldc2            #998 <String "/contentHeight">
	//  168  315:new             #1000 <Class agb>
	//  169  318:dup             
	//  170  319:aload_0         
	//  171  320:invokespecial   #1001 <Method void agb(aga)>
	//  172  323:invokevirtual   #1002 <Method void a(String, ag)>
		f("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
	//  173  326:aload_0         
	//  174  327:ldc2            #1004 <String "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();">
	//  175  330:invokespecial   #712 <Method void f(String)>
		f1 = f.density;
	//  176  333:aload_0         
	//  177  334:getfield        #154 <Field DisplayMetrics f>
	//  178  337:getfield        #159 <Field float DisplayMetrics.density>
	//  179  340:fstore_3        
		k1 = android.view.View.MeasureSpec.getSize(i1);
	//  180  341:iload_1         
	//  181  342:invokestatic    #986 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  182  345:istore          4
		if(C != -1)
	//* 183  347:aload_0         
	//* 184  348:getfield        #458 <Field int C>
	//* 185  351:iconst_m1       
	//* 186  352:icmpeq          367
		{
			i1 = (int)((float)C * f1);
	//  187  355:aload_0         
	//  188  356:getfield        #458 <Field int C>
	//  189  359:i2f             
	//  190  360:fload_3         
	//  191  361:fmul            
	//  192  362:f2i             
	//  193  363:istore_1        
			break MISSING_BLOCK_LABEL_372;
	//  194  364:goto            372
		}
		i1 = android.view.View.MeasureSpec.getSize(j1);
	//  195  367:iload_2         
	//  196  368:invokestatic    #986 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  197  371:istore_1        
		setMeasuredDimension(k1, i1);
	//  198  372:aload_0         
	//  199  373:iload           4
	//  200  375:iload_1         
	//  201  376:invokevirtual   #960 <Method void setMeasuredDimension(int, int)>
		this;
	//  202  379:aload_0         
		JVM INSTR monitorexit ;
	//  203  380:monitorexit     
		return;
	//  204  381:return          
		super.onMeasure(i1, j1);
	//  205  382:aload_0         
	//  206  383:iload_1         
	//  207  384:iload_2         
	//  208  385:invokespecial   #968 <Method void WebView.onMeasure(int, int)>
		this;
	//  209  388:aload_0         
		JVM INSTR monitorexit ;
	//  210  389:monitorexit     
		return;
	//  211  390:return          
		if(!m.e())
			break MISSING_BLOCK_LABEL_422;
	//  212  391:aload_0         
	//  213  392:getfield        #112 <Field ahb m>
	//  214  395:invokevirtual   #394 <Method boolean ahb.e()>
	//  215  398:ifeq            422
		setMeasuredDimension(f.widthPixels, f.heightPixels);
	//  216  401:aload_0         
	//  217  402:aload_0         
	//  218  403:getfield        #154 <Field DisplayMetrics f>
	//  219  406:getfield        #326 <Field int DisplayMetrics.widthPixels>
	//  220  409:aload_0         
	//  221  410:getfield        #154 <Field DisplayMetrics f>
	//  222  413:getfield        #334 <Field int DisplayMetrics.heightPixels>
	//  223  416:invokevirtual   #960 <Method void setMeasuredDimension(int, int)>
		this;
	//  224  419:aload_0         
		JVM INSTR monitorexit ;
	//  225  420:monitorexit     
		return;
	//  226  421:return          
		k2 = android.view.View.MeasureSpec.getMode(i1);
	//  227  422:iload_1         
	//  228  423:invokestatic    #1007 <Method int android.view.View$MeasureSpec.getMode(int)>
	//  229  426:istore          7
		i2 = android.view.View.MeasureSpec.getSize(i1);
	//  230  428:iload_1         
	//  231  429:invokestatic    #986 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  232  432:istore          5
		i1 = android.view.View.MeasureSpec.getMode(j1);
	//  233  434:iload_2         
	//  234  435:invokestatic    #1007 <Method int android.view.View$MeasureSpec.getMode(int)>
	//  235  438:istore_1        
		j2 = android.view.View.MeasureSpec.getSize(j1);
	//  236  439:iload_2         
	//  237  440:invokestatic    #986 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  238  443:istore          6
		break MISSING_BLOCK_LABEL_445;
	//* 239  445:ldc2            #1008 <Int 0x7fffffff>
	//* 240  448:istore          4
	//* 241  450:iload           7
	//* 242  452:ldc2            #1009 <Int 0x80000000>
	//* 243  455:icmpeq          851
	//* 244  458:iload           7
	//* 245  460:ldc2            #1010 <Int 0x40000000>
	//* 246  463:icmpne          844
	//* 247  466:goto            851
_L11:
		if(m.b <= j1 && m.a <= l1)
	//* 248  469:aload_0         
	//* 249  470:getfield        #112 <Field ahb m>
	//* 250  473:getfield        #1012 <Field int ahb.b>
	//* 251  476:iload_2         
	//* 252  477:icmpgt          880
	//* 253  480:aload_0         
	//* 254  481:getfield        #112 <Field ahb m>
	//* 255  484:getfield        #1014 <Field int com.google.android.gms.internal.ads.ahb.a>
	//* 256  487:iload           4
	//* 257  489:icmple          875
	//* 258  492:goto            880
	//* 259  495:getstatic       #1017 <Field e p.cE>
	//* 260  498:astore          10
	//* 261  500:invokestatic    #655 <Method m bwk.e()>
	//* 262  503:aload           10
	//* 263  505:invokevirtual   #660 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//* 264  508:checkcast       #376 <Class Boolean>
	//* 265  511:invokevirtual   #507 <Method boolean Boolean.booleanValue()>
	//* 266  514:ifeq            894
	//* 267  517:aload_0         
	//* 268  518:getfield        #112 <Field ahb m>
	//* 269  521:getfield        #1012 <Field int ahb.b>
	//* 270  524:i2f             
	//* 271  525:aload_0         
	//* 272  526:getfield        #161 <Field float g>
	//* 273  529:fdiv            
	//* 274  530:iload_2         
	//* 275  531:i2f             
	//* 276  532:aload_0         
	//* 277  533:getfield        #161 <Field float g>
	//* 278  536:fdiv            
	//* 279  537:fcmpl           
	//* 280  538:ifgt            885
	//* 281  541:aload_0         
	//* 282  542:getfield        #112 <Field ahb m>
	//* 283  545:getfield        #1014 <Field int com.google.android.gms.internal.ads.ahb.a>
	//* 284  548:i2f             
	//* 285  549:aload_0         
	//* 286  550:getfield        #161 <Field float g>
	//* 287  553:fdiv            
	//* 288  554:iload           4
	//* 289  556:i2f             
	//* 290  557:aload_0         
	//* 291  558:getfield        #161 <Field float g>
	//* 292  561:fdiv            
	//* 293  562:fcmpl           
	//* 294  563:ifgt            885
	//* 295  566:iconst_1        
	//* 296  567:istore_2        
	//* 297  568:goto            887
	//* 298  571:iload_2         
	//* 299  572:ifeq            766
	//* 300  575:aload_0         
	//* 301  576:getfield        #112 <Field ahb m>
	//* 302  579:getfield        #1012 <Field int ahb.b>
	//* 303  582:i2f             
	//* 304  583:aload_0         
	//* 305  584:getfield        #161 <Field float g>
	//* 306  587:fdiv            
	//* 307  588:f2i             
	//* 308  589:istore_1        
	//* 309  590:aload_0         
	//* 310  591:getfield        #112 <Field ahb m>
	//* 311  594:getfield        #1014 <Field int com.google.android.gms.internal.ads.ahb.a>
	//* 312  597:i2f             
	//* 313  598:aload_0         
	//* 314  599:getfield        #161 <Field float g>
	//* 315  602:fdiv            
	//* 316  603:f2i             
	//* 317  604:istore_2        
	//* 318  605:iload           5
	//* 319  607:i2f             
	//* 320  608:aload_0         
	//* 321  609:getfield        #161 <Field float g>
	//* 322  612:fdiv            
	//* 323  613:f2i             
	//* 324  614:istore          4
	//* 325  616:iload           6
	//* 326  618:i2f             
	//* 327  619:aload_0         
	//* 328  620:getfield        #161 <Field float g>
	//* 329  623:fdiv            
	//* 330  624:f2i             
	//* 331  625:istore          5
	//* 332  627:new             #694 <Class StringBuilder>
	//* 333  630:dup             
	//* 334  631:bipush          103
	//* 335  633:invokespecial   #741 <Method void StringBuilder(int)>
	//* 336  636:astore          10
	//* 337  638:aload           10
	//* 338  640:ldc2            #1019 <String "Not enough space to show ad. Needs ">
	//* 339  643:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//* 340  646:pop             
	//* 341  647:aload           10
	//* 342  649:iload_1         
	//* 343  650:invokevirtual   #1022 <Method StringBuilder StringBuilder.append(int)>
	//* 344  653:pop             
	//* 345  654:aload           10
	//* 346  656:ldc2            #1023 <String "x">
	//* 347  659:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//* 348  662:pop             
	//* 349  663:aload           10
	//* 350  665:iload_2         
	//* 351  666:invokevirtual   #1022 <Method StringBuilder StringBuilder.append(int)>
	//* 352  669:pop             
	//* 353  670:aload           10
	//* 354  672:ldc2            #1025 <String " dp, but only has ">
	//* 355  675:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//* 356  678:pop             
	//* 357  679:aload           10
	//* 358  681:iload           4
	//* 359  683:invokevirtual   #1022 <Method StringBuilder StringBuilder.append(int)>
	//* 360  686:pop             
	//* 361  687:aload           10
	//* 362  689:ldc2            #1023 <String "x">
	//* 363  692:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//* 364  695:pop             
	//* 365  696:aload           10
	//* 366  698:iload           5
	//* 367  700:invokevirtual   #1022 <Method StringBuilder StringBuilder.append(int)>
	//* 368  703:pop             
	//* 369  704:aload           10
	//* 370  706:ldc2            #1027 <String " dp.">
	//* 371  709:invokevirtual   #701 <Method StringBuilder StringBuilder.append(String)>
	//* 372  712:pop             
	//* 373  713:aload           10
	//* 374  715:invokevirtual   #708 <Method String StringBuilder.toString()>
	//* 375  718:invokestatic    #472 <Method void wx.e(String)>
	//* 376  721:aload_0         
	//* 377  722:invokevirtual   #1030 <Method int getVisibility()>
	//* 378  725:bipush          8
	//* 379  727:icmpeq          735
	//* 380  730:aload_0         
	//* 381  731:iconst_4        
	//* 382  732:invokevirtual   #1033 <Method void setVisibility(int)>
	//* 383  735:aload_0         
	//* 384  736:iconst_0        
	//* 385  737:iconst_0        
	//* 386  738:invokevirtual   #960 <Method void setMeasuredDimension(int, int)>
	//* 387  741:aload_0         
	//* 388  742:getfield        #90  <Field boolean h>
	//* 389  745:ifne            820
	//* 390  748:aload_0         
	//* 391  749:getfield        #163 <Field bse R>
	//* 392  752:getstatic       #1038 <Field bsj bsj.f>
	//* 393  755:invokevirtual   #1043 <Method void com.google.android.gms.internal.ads.bse.a(bsj)>
	//* 394  758:aload_0         
	//* 395  759:iconst_1        
	//* 396  760:putfield        #90  <Field boolean h>
	//* 397  763:aload_0         
	//* 398  764:monitorexit     
	//* 399  765:return          
	//* 400  766:aload_0         
	//* 401  767:invokevirtual   #1030 <Method int getVisibility()>
	//* 402  770:bipush          8
	//* 403  772:icmpeq          780
	//* 404  775:aload_0         
	//* 405  776:iconst_0        
	//* 406  777:invokevirtual   #1033 <Method void setVisibility(int)>
	//* 407  780:aload_0         
	//* 408  781:getfield        #92  <Field boolean i>
	//* 409  784:ifne            802
	//* 410  787:aload_0         
	//* 411  788:getfield        #163 <Field bse R>
	//* 412  791:getstatic       #1045 <Field bsj bsj.g>
	//* 413  794:invokevirtual   #1043 <Method void com.google.android.gms.internal.ads.bse.a(bsj)>
	//* 414  797:aload_0         
	//* 415  798:iconst_1        
	//* 416  799:putfield        #92  <Field boolean i>
	//* 417  802:aload_0         
	//* 418  803:aload_0         
	//* 419  804:getfield        #112 <Field ahb m>
	//* 420  807:getfield        #1012 <Field int ahb.b>
	//* 421  810:aload_0         
	//* 422  811:getfield        #112 <Field ahb m>
	//* 423  814:getfield        #1014 <Field int com.google.android.gms.internal.ads.ahb.a>
	//* 424  817:invokevirtual   #960 <Method void setMeasuredDimension(int, int)>
	//* 425  820:aload_0         
	//* 426  821:monitorexit     
	//* 427  822:return          
	//* 428  823:aload_0         
	//* 429  824:iload_1         
	//* 430  825:iload_2         
	//* 431  826:invokespecial   #968 <Method void WebView.onMeasure(int, int)>
	//* 432  829:aload_0         
	//* 433  830:monitorexit     
	//* 434  831:return          
	//* 435  832:astore          10
	//* 436  834:aload_0         
	//* 437  835:monitorexit     
	//* 438  836:aload           10
	//* 439  838:athrow          
	//* 440  839:fconst_0        
	//* 441  840:fstore_3        
	//* 442  841:goto            125
	//* 443  844:ldc2            #1008 <Int 0x7fffffff>
	//* 444  847:istore_2        
	//* 445  848:goto            854
	//* 446  851:iload           5
	//* 447  853:istore_2        
	//* 448  854:iload_1         
	//* 449  855:ldc2            #1009 <Int 0x80000000>
	//* 450  858:icmpeq          868
	//* 451  861:iload_1         
	//* 452  862:ldc2            #1010 <Int 0x40000000>
	//* 453  865:icmpne          469
	//* 454  868:iload           6
	//* 455  870:istore          4
	//* 456  872:goto            469
			i1 = 0;
	//  457  875:iconst_0        
	//  458  876:istore_1        
		else
	//* 459  877:goto            495
			i1 = 1;
	//  460  880:iconst_1        
	//  461  881:istore_1        
		e3 = p.cE;
		if(!((Boolean)bwk.e().a(e3)).booleanValue()) goto _L8; else goto _L7
_L7:
		if((float)m.b / g <= (float)j1 / g && (float)m.a / g <= (float)l1 / g)
			j1 = 1;
		else
	//* 462  882:goto            495
			j1 = 0;
	//  463  885:iconst_0        
	//  464  886:istore_2        
		  goto _L9
_L12:
		if(j1 == 0)
			break MISSING_BLOCK_LABEL_766;
		i1 = (int)((float)m.b / g);
		j1 = (int)((float)m.a / g);
		l1 = (int)((float)i2 / g);
		i2 = (int)((float)j2 / g);
		StringBuilder stringbuilder = new StringBuilder(103);
		stringbuilder.append("Not enough space to show ad. Needs ");
		stringbuilder.append(i1);
		stringbuilder.append("x");
		stringbuilder.append(j1);
		stringbuilder.append(" dp, but only has ");
		stringbuilder.append(l1);
		stringbuilder.append("x");
		stringbuilder.append(i2);
		stringbuilder.append(" dp.");
		wx.e(stringbuilder.toString());
		if(getVisibility() != 8)
			setVisibility(4);
		setMeasuredDimension(0, 0);
		if(h)
			break MISSING_BLOCK_LABEL_820;
		R.a(bsj.f);
		h = true;
		return;
		if(getVisibility() != 8)
			setVisibility(0);
		if(!i)
		{
			R.a(bsj.g);
			i = true;
		}
		setMeasuredDimension(m.b, m.a);
		this;
		JVM INSTR monitorexit ;
		return;
_L1:
		super.onMeasure(i1, j1);
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
_L6:
		f1 = 0.0F;
		  goto _L10
		int l1 = 0x7fffffff;
		e e3;
		Exception exception;
		if(k2 != 0x80000000 && k2 != 0x40000000)
			j1 = 0x7fffffff;
		else
			j1 = i2;
		if(i1 == 0x80000000 || i1 == 0x40000000)
			l1 = j2;
		  goto _L11
_L9:
		if(i1 == 0) goto _L8; else goto _L12
	//  465  887:iload_1         
	//  466  888:ifeq            894
	//* 467  891:goto            571
_L8:
		j1 = i1;
	//  468  894:iload_1         
	//  469  895:istore_2        
		  goto _L12
	//* 470  896:goto            571
	}

	public final void onPause()
	{
		if(C())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #468 <Method boolean C()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			super.onPause();
	//    4    8:aload_0         
	//    5    9:invokespecial   #1048 <Method void WebView.onPause()>
			return;
	//    6   12:return          
		}
		catch(Exception exception)
	//*   7   13:astore_1        
		{
			wx.b("Could not pause webview.", ((Throwable) (exception)));
	//    8   14:ldc2            #1050 <String "Could not pause webview.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #187 <Method void wx.b(String, Throwable)>
		}
	//   11   21:return          
	}

	public final void onResume()
	{
		if(C())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #468 <Method boolean C()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			super.onResume();
	//    4    8:aload_0         
	//    5    9:invokespecial   #1053 <Method void WebView.onResume()>
			return;
	//    6   12:return          
		}
		catch(Exception exception)
	//*   7   13:astore_1        
		{
			wx.b("Could not resume webview.", ((Throwable) (exception)));
	//    8   14:ldc2            #1055 <String "Could not resume webview.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #187 <Method void wx.b(String, Throwable)>
		}
	//   11   21:return          
	}

	public final boolean onTouchEvent(MotionEvent motionevent)
	{
		if(!((afo)j).c())
			break MISSING_BLOCK_LABEL_42;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:checkcast       #314 <Class afo>
	//    3    7:invokevirtual   #318 <Method boolean com.google.android.gms.internal.ads.afo.c()>
	//    4   10:ifeq            42
		this;
	//    5   13:aload_0         
		JVM INSTR monitorenter ;
	//    6   14:monitorenter    
		if(A != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #576 <Field bf A>
	//*   9   19:ifnull          32
			A.a(motionevent);
	//   10   22:aload_0         
	//   11   23:getfield        #576 <Field bf A>
	//   12   26:aload_1         
	//   13   27:invokeinterface #1061 <Method void com.google.android.gms.internal.ads.bf.a(MotionEvent)>
		this;
	//   14   32:aload_0         
		JVM INSTR monitorexit ;
	//   15   33:monitorexit     
		break MISSING_BLOCK_LABEL_56;
	//   16   34:goto            56
		motionevent;
	//   17   37:astore_1        
		this;
	//   18   38:aload_0         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		throw motionevent;
	//   20   40:aload_1         
	//   21   41:athrow          
		bad bad1 = b;
	//   22   42:aload_0         
	//   23   43:getfield        #120 <Field bad b>
	//   24   46:astore_2        
		if(bad1 != null)
	//*  25   47:aload_2         
	//*  26   48:ifnull          56
			bad1.a(motionevent);
	//   27   51:aload_2         
	//   28   52:aload_1         
	//   29   53:invokevirtual   #1064 <Method void com.google.android.gms.internal.ads.bad.a(MotionEvent)>
		if(C())
	//*  30   56:aload_0         
	//*  31   57:invokevirtual   #468 <Method boolean C()>
	//*  32   60:ifeq            65
			return false;
	//   33   63:iconst_0        
	//   34   64:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:invokespecial   #1066 <Method boolean WebView.onTouchEvent(MotionEvent)>
	//   38   70:ireturn         
	}

	public final void p()
	{
		if(D == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #300 <Field aa D>
	//*   2    4:ifnonnull       60
		{
			com.google.android.gms.internal.ads.v.a(G.a(), E, new String[] {
				"aes2"
			});
	//    3    7:aload_0         
	//    4    8:getfield        #279 <Field ab G>
	//    5   11:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    6   14:aload_0         
	//    7   15:getfield        #291 <Field aa E>
	//    8   18:iconst_1        
	//    9   19:anewarray       String[]
	//   10   22:dup             
	//   11   23:iconst_0        
	//   12   24:ldc2            #1068 <String "aes2">
	//   13   27:aastore         
	//   14   28:invokestatic    #390 <Method boolean com.google.android.gms.internal.ads.v.a(ad, aa, String[])>
	//   15   31:pop             
			D = com.google.android.gms.internal.ads.v.a(G.a());
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #279 <Field ab G>
	//   19   37:invokevirtual   #282 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//   20   40:invokestatic    #289 <Method aa com.google.android.gms.internal.ads.v.a(ad)>
	//   21   43:putfield        #300 <Field aa D>
			G.a("native:view_show", D);
	//   22   46:aload_0         
	//   23   47:getfield        #279 <Field ab G>
	//   24   50:ldc2            #1070 <String "native:view_show">
	//   25   53:aload_0         
	//   26   54:getfield        #300 <Field aa D>
	//   27   57:invokevirtual   #296 <Method void com.google.android.gms.internal.ads.ab.a(String, aa)>
		}
		HashMap hashmap = new HashMap(1);
	//   28   60:new             #527 <Class HashMap>
	//   29   63:dup             
	//   30   64:iconst_1        
	//   31   65:invokespecial   #598 <Method void HashMap(int)>
	//   32   68:astore_1        
		hashmap.put("version", ((Object) (c.a)));
	//   33   69:aload_1         
	//   34   70:ldc2            #603 <String "version">
	//   35   73:aload_0         
	//   36   74:getfield        #122 <Field zzbbi c>
	//   37   77:getfield        #208 <Field String com.google.android.gms.internal.ads.zzbbi.a>
	//   38   80:invokevirtual   #601 <Method Object HashMap.put(Object, Object)>
	//   39   83:pop             
		a("onshow", ((Map) (hashmap)));
	//   40   84:aload_0         
	//   41   85:ldc2            #1072 <String "onshow">
	//   42   88:aload_1         
	//   43   89:invokevirtual   #544 <Method void a(String, Map)>
	//   44   92:return          
	}

	public final void q()
	{
		HashMap hashmap = new HashMap(3);
	//    0    0:new             #527 <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:invokespecial   #598 <Method void HashMap(int)>
	//    4    8:astore_1        
		hashmap.put("app_muted", ((Object) (String.valueOf(aw.j().b()))));
	//    5    9:aload_1         
	//    6   10:ldc2            #1074 <String "app_muted">
	//    7   13:invokestatic    #1077 <Method ya aw.j()>
	//    8   16:invokevirtual   #1080 <Method boolean ya.b()>
	//    9   19:invokestatic    #1083 <Method String String.valueOf(boolean)>
	//   10   22:invokevirtual   #601 <Method Object HashMap.put(Object, Object)>
	//   11   25:pop             
		hashmap.put("app_volume", ((Object) (String.valueOf(aw.j().a()))));
	//   12   26:aload_1         
	//   13   27:ldc2            #1085 <String "app_volume">
	//   14   30:invokestatic    #1077 <Method ya aw.j()>
	//   15   33:invokevirtual   #1087 <Method float com.google.android.gms.internal.ads.ya.a()>
	//   16   36:invokestatic    #1090 <Method String String.valueOf(float)>
	//   17   39:invokevirtual   #601 <Method Object HashMap.put(Object, Object)>
	//   18   42:pop             
		hashmap.put("device_volume", ((Object) (String.valueOf(com.google.android.gms.internal.ads.ya.a(getContext())))));
	//   19   43:aload_1         
	//   20   44:ldc2            #1092 <String "device_volume">
	//   21   47:aload_0         
	//   22   48:invokevirtual   #130 <Method Context getContext()>
	//   23   51:invokestatic    #1095 <Method float com.google.android.gms.internal.ads.ya.a(Context)>
	//   24   54:invokestatic    #1090 <Method String String.valueOf(float)>
	//   25   57:invokevirtual   #601 <Method Object HashMap.put(Object, Object)>
	//   26   60:pop             
		a("volume", ((Map) (hashmap)));
	//   27   61:aload_0         
	//   28   62:ldc2            #1097 <String "volume">
	//   29   65:aload_1         
	//   30   66:invokevirtual   #544 <Method void a(String, Map)>
	//   31   69:return          
	}

	public final Context r()
	{
		return a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field aha a>
	//    2    4:invokevirtual   #1099 <Method Context aha.b()>
	//    3    7:areturn         
	}

	public final c s()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c c1 = k;
	//    2    2:aload_0         
	//    3    3:getfield        #614 <Field c k>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return c1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		H = new WeakReference(((Object) (onclicklistener)));
	//    0    0:aload_0         
	//    1    1:new             #808 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #1103 <Method void WeakReference(Object)>
	//    5    9:putfield        #806 <Field WeakReference H>
		super.setOnClickListener(onclicklistener);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #1105 <Method void WebView.setOnClickListener(android.view.View$OnClickListener)>
	//    9   17:return          
	}

	public final void setRequestedOrientation(int i1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		t = i1;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #118 <Field int t>
		if(k != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #614 <Field c k>
	//*   7   11:ifnull          25
			k.a(t);
	//    8   14:aload_0         
	//    9   15:getfield        #614 <Field c k>
	//   10   18:aload_0         
	//   11   19:getfield        #118 <Field int t>
	//   12   22:invokevirtual   #1108 <Method void c.a(int)>
		this;
	//   13   25:aload_0         
		JVM INSTR monitorexit ;
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		Exception exception;
		exception;
	//   16   28:astore_2        
	//*  17   29:aload_0         
		throw exception;
	//   18   30:monitorexit     
	//   19   31:aload_2         
	//   20   32:athrow          
	}

	public final void setWebViewClient(WebViewClient webviewclient)
	{
		super.setWebViewClient(webviewclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1112 <Method void WebView.setWebViewClient(WebViewClient)>
		if(webviewclient instanceof afo)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #314 <Class afo>
	//*   5    9:ifeq            20
			j = (afo)webviewclient;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #314 <Class afo>
	//    9   17:putfield        #312 <Field afo j>
	//   10   20:return          
	}

	public final void stopLoading()
	{
		if(C())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #468 <Method boolean C()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			super.stopLoading();
	//    4    8:aload_0         
	//    5    9:invokespecial   #1115 <Method void WebView.stopLoading()>
			return;
	//    6   12:return          
		}
		catch(Exception exception)
	//*   7   13:astore_1        
		{
			wx.b("Could not stop loading webview.", ((Throwable) (exception)));
	//    8   14:ldc2            #1117 <String "Could not stop loading webview.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #187 <Method void wx.b(String, Throwable)>
		}
	//   11   21:return          
	}

	public final c t()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c c1 = I;
	//    2    2:aload_0         
	//    3    3:getfield        #738 <Field c I>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return c1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final ahb u()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ahb ahb1 = m;
	//    2    2:aload_0         
	//    3    3:getfield        #112 <Field ahb m>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return ahb1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final String v()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1 = n;
	//    2    2:aload_0         
	//    3    3:getfield        #114 <Field String n>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return s1;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final agv w()
	{
		return ((agv) (j));
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:areturn         
	}

	public final WebViewClient x()
	{
		return ((WebViewClient) (j));
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field afo j>
	//    2    4:areturn         
	}

	public final boolean y()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = o;
	//    2    2:aload_0         
	//    3    3:getfield        #756 <Field boolean o>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public final bad z()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field bad b>
	//    2    4:areturn         
	}

	private bf A;
	private int B;
	private int C;
	private aa D;
	private aa E;
	private aa F;
	private ab G;
	private WeakReference H;
	private c I;
	private boolean J;
	private zu K;
	private int L;
	private int M;
	private int N;
	private int O;
	private Map P;
	private final WindowManager Q = (WindowManager)getContext().getSystemService("window");
	private final bse R;
	private final aha a;
	private final bad b;
	private final zzbbi c;
	private final ap d;
	private final bs e;
	private final DisplayMetrics f;
	private final float g;
	private boolean h;
	private boolean i;
	private afo j;
	private c k;
	private a l;
	private ahb m;
	private String n;
	private boolean o;
	private boolean p;
	private boolean q;
	private boolean r;
	private Boolean s;
	private int t;
	private boolean u;
	private boolean v;
	private String w;
	private agd x;
	private boolean y;
	private boolean z;
}
