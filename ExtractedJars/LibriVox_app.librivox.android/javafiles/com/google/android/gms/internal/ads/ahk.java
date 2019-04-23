// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.*;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
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
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ahp, afn, hf, zu, 
//			aha, zzbbi, xg, agg, 
//			ahm, ab, ad, v, 
//			xo, ahc, bwk, zv, 
//			ni, ahb, wx, aeq, 
//			wi, s, hg, bpx, 
//			p, m, agq, aep, 
//			abw, agz, agd, ahl, 
//			bf, bad, ya, aa, 
//			acu, agv

final class ahk extends ahp
	implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, afn, hf
{

	protected ahk(aha aha1, ahc ahc1, ahb ahb1, String s1, boolean flag, boolean flag1, bad bad1, 
			zzbbi zzbbi1, ad ad1, ap ap1, bs bs)
	{
		super(((Context) (aha1)), ((ahn) (ahc1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #78  <Method void ahp(Context, ahn)>
		n = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #80  <Field boolean n>
		o = false;
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:putfield        #82  <Field boolean o>
		p = "";
	//   10   16:aload_0         
	//   11   17:ldc1            #84  <String "">
	//   12   19:putfield        #86  <Field String p>
	//   13   22:aload_0         
	//   14   23:new             #88  <Class AtomicReference>
	//   15   26:dup             
	//   16   27:invokespecial   #91  <Method void AtomicReference()>
	//   17   30:putfield        #93  <Field AtomicReference D>
		E = -1;
	//   18   33:aload_0         
	//   19   34:iconst_m1       
	//   20   35:putfield        #95  <Field int E>
		F = -1;
	//   21   38:aload_0         
	//   22   39:iconst_m1       
	//   23   40:putfield        #97  <Field int F>
		G = -1;
	//   24   43:aload_0         
	//   25   44:iconst_m1       
	//   26   45:putfield        #99  <Field int G>
		H = -1;
	//   27   48:aload_0         
	//   28   49:iconst_m1       
	//   29   50:putfield        #101 <Field int H>
		a = aha1;
	//   30   53:aload_0         
	//   31   54:aload_1         
	//   32   55:putfield        #103 <Field aha a>
		b = ahc1;
	//   33   58:aload_0         
	//   34   59:aload_2         
	//   35   60:putfield        #105 <Field ahc b>
		h = ahb1;
	//   36   63:aload_0         
	//   37   64:aload_3         
	//   38   65:putfield        #107 <Field ahb h>
		i = s1;
	//   39   68:aload_0         
	//   40   69:aload           4
	//   41   71:putfield        #109 <Field String i>
		k = flag;
	//   42   74:aload_0         
	//   43   75:iload           5
	//   44   77:putfield        #111 <Field boolean k>
		m = -1;
	//   45   80:aload_0         
	//   46   81:iconst_m1       
	//   47   82:putfield        #113 <Field int m>
		c = bad1;
	//   48   85:aload_0         
	//   49   86:aload           7
	//   50   88:putfield        #115 <Field bad c>
		d = zzbbi1;
	//   51   91:aload_0         
	//   52   92:aload           8
	//   53   94:putfield        #117 <Field zzbbi d>
		e = ap1;
	//   54   97:aload_0         
	//   55   98:aload           10
	//   56  100:putfield        #119 <Field ap e>
		f = bs;
	//   57  103:aload_0         
	//   58  104:aload           11
	//   59  106:putfield        #121 <Field bs f>
	//   60  109:aload_0         
	//   61  110:aload_0         
	//   62  111:invokevirtual   #125 <Method Context getContext()>
	//   63  114:ldc1            #127 <String "window">
	//   64  116:invokevirtual   #133 <Method Object Context.getSystemService(String)>
	//   65  119:checkcast       #135 <Class WindowManager>
	//   66  122:putfield        #137 <Field WindowManager K>
		C = new zu(a.a(), ((View) (this)), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)), ((android.view.ViewTreeObserver.OnScrollChangedListener) (null)));
	//   67  125:aload_0         
	//   68  126:new             #139 <Class zu>
	//   69  129:dup             
	//   70  130:aload_0         
	//   71  131:getfield        #103 <Field aha a>
	//   72  134:invokevirtual   #144 <Method Activity com.google.android.gms.internal.ads.aha.a()>
	//   73  137:aload_0         
	//   74  138:aload_0         
	//   75  139:aconst_null     
	//   76  140:invokespecial   #147 <Method void zu(Activity, View, android.view.ViewTreeObserver$OnGlobalLayoutListener, android.view.ViewTreeObserver$OnScrollChangedListener)>
	//   77  143:putfield        #149 <Field zu C>
		aw.e().a(((Context) (aha1)), zzbbi1.a, getSettings());
	//   78  146:invokestatic    #154 <Method xg aw.e()>
	//   79  149:aload_1         
	//   80  150:aload           8
	//   81  152:getfield        #158 <Field String com.google.android.gms.internal.ads.zzbbi.a>
	//   82  155:aload_0         
	//   83  156:invokevirtual   #162 <Method android.webkit.WebSettings getSettings()>
	//   84  159:invokevirtual   #167 <Method void com.google.android.gms.internal.ads.xg.a(Context, String, android.webkit.WebSettings)>
		setDownloadListener(((DownloadListener) (this)));
	//   85  162:aload_0         
	//   86  163:aload_0         
	//   87  164:invokevirtual   #171 <Method void setDownloadListener(DownloadListener)>
		I = aha1.getResources().getDisplayMetrics().density;
	//   88  167:aload_0         
	//   89  168:aload_1         
	//   90  169:invokevirtual   #175 <Method Resources aha.getResources()>
	//   91  172:invokevirtual   #181 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   92  175:getfield        #186 <Field float DisplayMetrics.density>
	//   93  178:putfield        #188 <Field float I>
		P();
	//   94  181:aload_0         
	//   95  182:invokespecial   #191 <Method void P()>
		if(com.google.android.gms.common.util.o.d())
	//*  96  185:invokestatic    #196 <Method boolean o.d()>
	//*  97  188:ifeq            201
			((ahm)this).addJavascriptInterface(((Object) (com.google.android.gms.internal.ads.agg.a(((afn) (this))))), "googleAdsJsInterface");
	//   98  191:aload_0         
	//   99  192:aload_0         
	//  100  193:invokestatic    #201 <Method agg com.google.android.gms.internal.ads.agg.a(afn)>
	//  101  196:ldc1            #203 <String "googleAdsJsInterface">
	//  102  198:invokevirtual   #209 <Method void ahm.addJavascriptInterface(Object, String)>
		T();
	//  103  201:aload_0         
	//  104  202:invokespecial   #212 <Method void T()>
		z = new ab(new ad(true, "make_wv", i));
	//  105  205:aload_0         
	//  106  206:new             #214 <Class ab>
	//  107  209:dup             
	//  108  210:new             #216 <Class ad>
	//  109  213:dup             
	//  110  214:iconst_1        
	//  111  215:ldc1            #218 <String "make_wv">
	//  112  217:aload_0         
	//  113  218:getfield        #109 <Field String i>
	//  114  221:invokespecial   #221 <Method void ad(boolean, String, String)>
	//  115  224:invokespecial   #224 <Method void ab(ad)>
	//  116  227:putfield        #226 <Field ab z>
		z.a().a(ad1);
	//  117  230:aload_0         
	//  118  231:getfield        #226 <Field ab z>
	//  119  234:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//  120  237:aload           9
	//  121  239:invokevirtual   #231 <Method void com.google.android.gms.internal.ads.ad.a(ad)>
		x = com.google.android.gms.internal.ads.v.a(z.a());
	//  122  242:aload_0         
	//  123  243:aload_0         
	//  124  244:getfield        #226 <Field ab z>
	//  125  247:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//  126  250:invokestatic    #236 <Method aa com.google.android.gms.internal.ads.v.a(ad)>
	//  127  253:putfield        #238 <Field aa x>
		z.a("native:view_create", x);
	//  128  256:aload_0         
	//  129  257:getfield        #226 <Field ab z>
	//  130  260:ldc1            #240 <String "native:view_create">
	//  131  262:aload_0         
	//  132  263:getfield        #238 <Field aa x>
	//  133  266:invokevirtual   #243 <Method void com.google.android.gms.internal.ads.ab.a(String, aa)>
		y = null;
	//  134  269:aload_0         
	//  135  270:aconst_null     
	//  136  271:putfield        #245 <Field aa y>
		w = null;
	//  137  274:aload_0         
	//  138  275:aconst_null     
	//  139  276:putfield        #247 <Field aa w>
		aw.g().b(((Context) (aha1)));
	//  140  279:invokestatic    #250 <Method xo aw.g()>
	//  141  282:aload_1         
	//  142  283:invokevirtual   #255 <Method void xo.b(Context)>
	//  143  286:return          
	}

	private final boolean N()
	{
		boolean flag1 = ((ahc)b).b();
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:checkcast       #259 <Class ahc>
	//    3    7:invokevirtual   #261 <Method boolean ahc.b()>
	//    4   10:istore          6
		boolean flag = false;
	//    5   12:iconst_0        
	//    6   13:istore          5
		if(!flag1 && !((ahc)b).c())
	//*   7   15:iload           6
	//*   8   17:ifne            35
	//*   9   20:aload_0         
	//*  10   21:getfield        #105 <Field ahc b>
	//*  11   24:checkcast       #259 <Class ahc>
	//*  12   27:invokevirtual   #263 <Method boolean com.google.android.gms.internal.ads.ahc.c()>
	//*  13   30:ifne            35
			return false;
	//   14   33:iconst_0        
	//   15   34:ireturn         
		aw.e();
	//   16   35:invokestatic    #154 <Method xg aw.e()>
	//   17   38:pop             
		DisplayMetrics displaymetrics = com.google.android.gms.internal.ads.xg.a(K);
	//   18   39:aload_0         
	//   19   40:getfield        #137 <Field WindowManager K>
	//   20   43:invokestatic    #266 <Method DisplayMetrics com.google.android.gms.internal.ads.xg.a(WindowManager)>
	//   21   46:astore          7
		com.google.android.gms.internal.ads.bwk.a();
	//   22   48:invokestatic    #271 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   23   51:pop             
		int k1 = zv.b(displaymetrics, displaymetrics.widthPixels);
	//   24   52:aload           7
	//   25   54:aload           7
	//   26   56:getfield        #274 <Field int DisplayMetrics.widthPixels>
	//   27   59:invokestatic    #279 <Method int zv.b(DisplayMetrics, int)>
	//   28   62:istore_3        
		com.google.android.gms.internal.ads.bwk.a();
	//   29   63:invokestatic    #271 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   30   66:pop             
		int l1 = zv.b(displaymetrics, displaymetrics.heightPixels);
	//   31   67:aload           7
	//   32   69:aload           7
	//   33   71:getfield        #282 <Field int DisplayMetrics.heightPixels>
	//   34   74:invokestatic    #279 <Method int zv.b(DisplayMetrics, int)>
	//   35   77:istore          4
		Activity activity = a.a();
	//   36   79:aload_0         
	//   37   80:getfield        #103 <Field aha a>
	//   38   83:invokevirtual   #144 <Method Activity com.google.android.gms.internal.ads.aha.a()>
	//   39   86:astore          8
		int i1;
		int j1;
		if(activity != null && activity.getWindow() != null)
	//*  40   88:aload           8
	//*  41   90:ifnull          146
	//*  42   93:aload           8
	//*  43   95:invokevirtual   #288 <Method android.view.Window Activity.getWindow()>
	//*  44   98:ifnonnull       104
	//*  45  101:goto            146
		{
			aw.e();
	//   46  104:invokestatic    #154 <Method xg aw.e()>
	//   47  107:pop             
			int ai[] = com.google.android.gms.internal.ads.xg.a(activity);
	//   48  108:aload           8
	//   49  110:invokestatic    #291 <Method int[] com.google.android.gms.internal.ads.xg.a(Activity)>
	//   50  113:astore          8
			com.google.android.gms.internal.ads.bwk.a();
	//   51  115:invokestatic    #271 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   52  118:pop             
			i1 = zv.b(displaymetrics, ai[0]);
	//   53  119:aload           7
	//   54  121:aload           8
	//   55  123:iconst_0        
	//   56  124:iaload          
	//   57  125:invokestatic    #279 <Method int zv.b(DisplayMetrics, int)>
	//   58  128:istore_1        
			com.google.android.gms.internal.ads.bwk.a();
	//   59  129:invokestatic    #271 <Method zv com.google.android.gms.internal.ads.bwk.a()>
	//   60  132:pop             
			j1 = zv.b(displaymetrics, ai[1]);
	//   61  133:aload           7
	//   62  135:aload           8
	//   63  137:iconst_1        
	//   64  138:iaload          
	//   65  139:invokestatic    #279 <Method int zv.b(DisplayMetrics, int)>
	//   66  142:istore_2        
		} else
	//*  67  143:goto            151
		{
			i1 = k1;
	//   68  146:iload_3         
	//   69  147:istore_1        
			j1 = l1;
	//   70  148:iload           4
	//   71  150:istore_2        
		}
		if(F == k1 && E == l1 && G == i1 && H == j1)
	//*  72  151:aload_0         
	//*  73  152:getfield        #97  <Field int F>
	//*  74  155:iload_3         
	//*  75  156:icmpne          186
	//*  76  159:aload_0         
	//*  77  160:getfield        #95  <Field int E>
	//*  78  163:iload           4
	//*  79  165:icmpne          186
	//*  80  168:aload_0         
	//*  81  169:getfield        #99  <Field int G>
	//*  82  172:iload_1         
	//*  83  173:icmpne          186
	//*  84  176:aload_0         
	//*  85  177:getfield        #101 <Field int H>
	//*  86  180:iload_2         
	//*  87  181:icmpne          186
			return false;
	//   88  184:iconst_0        
	//   89  185:ireturn         
		if(F != k1 || E != l1)
	//*  90  186:aload_0         
	//*  91  187:getfield        #97  <Field int F>
	//*  92  190:iload_3         
	//*  93  191:icmpne          203
	//*  94  194:aload_0         
	//*  95  195:getfield        #95  <Field int E>
	//*  96  198:iload           4
	//*  97  200:icmpeq          206
			flag = true;
	//   98  203:iconst_1        
	//   99  204:istore          5
		F = k1;
	//  100  206:aload_0         
	//  101  207:iload_3         
	//  102  208:putfield        #97  <Field int F>
		E = l1;
	//  103  211:aload_0         
	//  104  212:iload           4
	//  105  214:putfield        #95  <Field int E>
		G = i1;
	//  106  217:aload_0         
	//  107  218:iload_1         
	//  108  219:putfield        #99  <Field int G>
		H = j1;
	//  109  222:aload_0         
	//  110  223:iload_2         
	//  111  224:putfield        #101 <Field int H>
		(new ni(((afn) (this)))).a(k1, l1, i1, j1, displaymetrics.density, K.getDefaultDisplay().getRotation());
	//  112  227:new             #293 <Class ni>
	//  113  230:dup             
	//  114  231:aload_0         
	//  115  232:invokespecial   #296 <Method void ni(afn)>
	//  116  235:iload_3         
	//  117  236:iload           4
	//  118  238:iload_1         
	//  119  239:iload_2         
	//  120  240:aload           7
	//  121  242:getfield        #186 <Field float DisplayMetrics.density>
	//  122  245:aload_0         
	//  123  246:getfield        #137 <Field WindowManager K>
	//  124  249:invokeinterface #300 <Method Display WindowManager.getDefaultDisplay()>
	//  125  254:invokevirtual   #306 <Method int Display.getRotation()>
	//  126  257:invokevirtual   #309 <Method void com.google.android.gms.internal.ads.ni.a(int, int, int, int, float, int)>
		return flag;
	//  127  260:iload           5
	//  128  262:ireturn         
	}

	private final void O()
	{
		com.google.android.gms.internal.ads.v.a(z.a(), x, new String[] {
			"aeh2"
		});
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field ab z>
	//    2    4:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    3    7:aload_0         
	//    4    8:getfield        #238 <Field aa x>
	//    5   11:iconst_1        
	//    6   12:anewarray       String[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:ldc2            #314 <String "aeh2">
	//   10   20:aastore         
	//   11   21:invokestatic    #317 <Method boolean com.google.android.gms.internal.ads.v.a(ad, aa, String[])>
	//   12   24:pop             
	//   13   25:return          
	}

	private final void P()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(k || h.e())
	//*   2    2:aload_0         
	//*   3    3:getfield        #111 <Field boolean k>
	//*   4    6:ifne            56
	//*   5    9:aload_0         
	//*   6   10:getfield        #107 <Field ahb h>
	//*   7   13:invokevirtual   #321 <Method boolean ahb.e()>
	//*   8   16:ifeq            22
			break MISSING_BLOCK_LABEL_56;
	//    9   19:goto            56
		if(android.os.Build.VERSION.SDK_INT >= 18)
			break MISSING_BLOCK_LABEL_43;
	//   10   22:getstatic       #326 <Field int android.os.Build$VERSION.SDK_INT>
	//   11   25:bipush          18
	//   12   27:icmpge          43
		wx.b("Disabling hardware acceleration on an AdView.");
	//   13   30:ldc2            #328 <String "Disabling hardware acceleration on an AdView.">
	//   14   33:invokestatic    #333 <Method void wx.b(String)>
		Q();
	//   15   36:aload_0         
	//   16   37:invokespecial   #336 <Method void Q()>
		this;
	//   17   40:aload_0         
		JVM INSTR monitorexit ;
	//   18   41:monitorexit     
		return;
	//   19   42:return          
		wx.b("Enabling hardware acceleration on an AdView.");
	//   20   43:ldc2            #338 <String "Enabling hardware acceleration on an AdView.">
	//   21   46:invokestatic    #333 <Method void wx.b(String)>
		R();
	//   22   49:aload_0         
	//   23   50:invokespecial   #341 <Method void R()>
		this;
	//   24   53:aload_0         
		JVM INSTR monitorexit ;
	//   25   54:monitorexit     
		return;
	//   26   55:return          
		wx.b("Enabling hardware acceleration on an overlay.");
	//   27   56:ldc2            #343 <String "Enabling hardware acceleration on an overlay.">
	//   28   59:invokestatic    #333 <Method void wx.b(String)>
		R();
	//   29   62:aload_0         
	//   30   63:invokespecial   #341 <Method void R()>
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

	private final void Q()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!l)
	//*   2    2:aload_0         
	//*   3    3:getfield        #345 <Field boolean l>
	//*   4    6:ifne            17
			aw.g().c(((View) (this)));
	//    5    9:invokestatic    #250 <Method xo aw.g()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #348 <Method boolean com.google.android.gms.internal.ads.xo.c(View)>
	//    8   16:pop             
		l = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #345 <Field boolean l>
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

	private final void R()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(l)
	//*   2    2:aload_0         
	//*   3    3:getfield        #345 <Field boolean l>
	//*   4    6:ifeq            17
			aw.g().b(((View) (this)));
	//    5    9:invokestatic    #250 <Method xo aw.g()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #350 <Method boolean xo.b(View)>
	//    8   16:pop             
		l = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #345 <Field boolean l>
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
		if(J != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #353 <Field Map J>
	//*   4    6:ifnull          48
		{
			for(Iterator iterator = J.values().iterator(); iterator.hasNext(); ((aeq)iterator.next()).a());
	//    5    9:aload_0         
	//    6   10:getfield        #353 <Field Map J>
	//    7   13:invokeinterface #359 <Method Collection Map.values()>
	//    8   18:invokeinterface #365 <Method Iterator Collection.iterator()>
	//    9   23:astore_1        
	//   10   24:aload_1         
	//   11   25:invokeinterface #370 <Method boolean Iterator.hasNext()>
	//   12   30:ifeq            48
	//   13   33:aload_1         
	//   14   34:invokeinterface #374 <Method Object Iterator.next()>
	//   15   39:checkcast       #376 <Class aeq>
	//   16   42:invokevirtual   #378 <Method void com.google.android.gms.internal.ads.aeq.a()>
		}
	//*  17   45:goto            24
		J = null;
	//   18   48:aload_0         
	//   19   49:aconst_null     
	//   20   50:putfield        #353 <Field Map J>
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

	private final void T()
	{
		Object obj = ((Object) (z));
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field ab z>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		obj = ((Object) (((ab) (obj)).a()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    8   14:astore_1        
		if(obj != null && aw.i().a() != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          39
	//*  11   19:invokestatic    #381 <Method wi aw.i()>
	//*  12   22:invokevirtual   #386 <Method s com.google.android.gms.internal.ads.wi.a()>
	//*  13   25:ifnull          39
			aw.i().a().a(((ad) (obj)));
	//   14   28:invokestatic    #381 <Method wi aw.i()>
	//   15   31:invokevirtual   #386 <Method s com.google.android.gms.internal.ads.wi.a()>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #391 <Method boolean com.google.android.gms.internal.ads.s.a(ad)>
	//   18   38:pop             
	//   19   39:return          
	}

	static int a(ahk ahk1)
	{
		return ahk1.v;
	//    0    0:aload_0         
	//    1    1:getfield        #394 <Field int v>
	//    2    4:ireturn         
	}

	static int a(ahk ahk1, int i1)
	{
		ahk1.v = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #394 <Field int v>
		return i1;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private final void h(boolean flag)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #398 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #399 <Method void HashMap()>
	//    3    7:astore_3        
		String s1;
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            19
			s1 = "1";
	//    6   12:ldc2            #401 <String "1">
	//    7   15:astore_2        
		else
	//*   8   16:goto            23
			s1 = "0";
	//    9   19:ldc2            #403 <String "0">
	//   10   22:astore_2        
		((Map) (hashmap)).put("isVisible", ((Object) (s1)));
	//   11   23:aload_3         
	//   12   24:ldc2            #405 <String "isVisible">
	//   13   27:aload_2         
	//   14   28:invokeinterface #409 <Method Object Map.put(Object, Object)>
	//   15   33:pop             
		com.google.android.gms.internal.ads.hg.a(((hf) (this)), "onAdVisibilityChanged", ((Map) (hashmap)));
	//   16   34:aload_0         
	//   17   35:ldc2            #411 <String "onAdVisibilityChanged">
	//   18   38:aload_3         
	//   19   39:invokestatic    #416 <Method void com.google.android.gms.internal.ads.hg.a(hf, String, Map)>
	//   20   42:return          
	}

	public final a A()
	{
		return (a)D.get();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field AtomicReference D>
	//    2    4:invokevirtual   #420 <Method Object AtomicReference.get()>
	//    3    7:checkcast       #422 <Class a>
	//    4   10:areturn         
	}

	public final boolean B()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = k;
	//    2    2:aload_0         
	//    3    3:getfield        #111 <Field boolean k>
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
	//    0    0:return          
	}

	public final boolean E()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = n;
	//    2    2:aload_0         
	//    3    3:getfield        #80  <Field boolean n>
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
		boolean flag = o;
	//    2    2:aload_0         
	//    3    3:getfield        #82  <Field boolean o>
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
		int i1 = u;
	//    2    2:aload_0         
	//    3    3:getfield        #424 <Field int u>
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
		C.a();
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field zu C>
	//    2    4:invokevirtual   #425 <Method void com.google.android.gms.internal.ads.zu.a()>
	//    3    7:return          
	}

	public final void I()
	{
		if(y == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #245 <Field aa y>
	//*   2    4:ifnonnull       35
		{
			y = com.google.android.gms.internal.ads.v.a(z.a());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #226 <Field ab z>
	//    6   12:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    7   15:invokestatic    #236 <Method aa com.google.android.gms.internal.ads.v.a(ad)>
	//    8   18:putfield        #245 <Field aa y>
			z.a("native:view_load", y);
	//    9   21:aload_0         
	//   10   22:getfield        #226 <Field ab z>
	//   11   25:ldc2            #427 <String "native:view_load">
	//   12   28:aload_0         
	//   13   29:getfield        #245 <Field aa y>
	//   14   32:invokevirtual   #243 <Method void com.google.android.gms.internal.ads.ab.a(String, aa)>
		}
	//   15   35:return          
	}

	public final bf J()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		bf bf1 = t;
	//    2    2:aload_0         
	//    3    3:getfield        #430 <Field bf t>
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
	//    2    2:invokevirtual   #434 <Method void setBackgroundColor(int)>
	//    3    5:return          
	}

	public final void L()
	{
		com.google.android.gms.internal.ads.wx.a("Cannot add text view to inner AdWebView");
	//    0    0:ldc2            #437 <String "Cannot add text view to inner AdWebView">
	//    1    3:invokestatic    #439 <Method void com.google.android.gms.internal.ads.wx.a(String)>
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
		Map map = J;
	//    2    2:aload_0         
	//    3    3:getfield        #353 <Field Map J>
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
		s1 = ((String) ((aeq)J.get(((Object) (s1)))));
	//   11   15:aload_0         
	//   12   16:getfield        #353 <Field Map J>
	//   13   19:aload_1         
	//   14   20:invokeinterface #444 <Method Object Map.get(Object)>
	//   15   25:checkcast       #376 <Class aeq>
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
			com.google.android.gms.internal.ads.v.a(z.a(), x, new String[] {
				"aebb2"
			});
	//    2    4:aload_0         
	//    3    5:getfield        #226 <Field ab z>
	//    4    8:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    5   11:aload_0         
	//    6   12:getfield        #238 <Field aa x>
	//    7   15:iconst_1        
	//    8   16:anewarray       String[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:ldc2            #446 <String "aebb2">
	//   12   24:aastore         
	//   13   25:invokestatic    #317 <Method boolean com.google.android.gms.internal.ads.v.a(ad, aa, String[])>
	//   14   28:pop             
		O();
	//   15   29:aload_0         
	//   16   30:invokespecial   #448 <Method void O()>
		if(z.a() != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #226 <Field ab z>
	//*  19   37:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//*  20   40:ifnull          60
			z.a().a("close_type", String.valueOf(i1));
	//   21   43:aload_0         
	//   22   44:getfield        #226 <Field ab z>
	//   23   47:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//   24   50:ldc2            #450 <String "close_type">
	//   25   53:iload_1         
	//   26   54:invokestatic    #454 <Method String String.valueOf(int)>
	//   27   57:invokevirtual   #457 <Method void com.google.android.gms.internal.ads.ad.a(String, String)>
		HashMap hashmap = new HashMap(2);
	//   28   60:new             #398 <Class HashMap>
	//   29   63:dup             
	//   30   64:iconst_2        
	//   31   65:invokespecial   #459 <Method void HashMap(int)>
	//   32   68:astore_2        
		hashmap.put("closetype", ((Object) (String.valueOf(i1))));
	//   33   69:aload_2         
	//   34   70:ldc2            #461 <String "closetype">
	//   35   73:iload_1         
	//   36   74:invokestatic    #454 <Method String String.valueOf(int)>
	//   37   77:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   38   80:pop             
		hashmap.put("version", ((Object) (d.a)));
	//   39   81:aload_2         
	//   40   82:ldc2            #464 <String "version">
	//   41   85:aload_0         
	//   42   86:getfield        #117 <Field zzbbi d>
	//   43   89:getfield        #158 <Field String com.google.android.gms.internal.ads.zzbbi.a>
	//   44   92:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   45   95:pop             
		com.google.android.gms.internal.ads.hg.a(((hf) (this)), "onhide", ((Map) (hashmap)));
	//   46   96:aload_0         
	//   47   97:ldc2            #466 <String "onhide">
	//   48  100:aload_2         
	//   49  101:invokestatic    #416 <Method void com.google.android.gms.internal.ads.hg.a(hf, String, Map)>
	//   50  104:return          
	}

	public final void a(Context context)
	{
		a.setBaseContext(context);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field aha a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #469 <Method void aha.setBaseContext(Context)>
		C.a(a.a());
	//    4    8:aload_0         
	//    5    9:getfield        #149 <Field zu C>
	//    6   12:aload_0         
	//    7   13:getfield        #103 <Field aha a>
	//    8   16:invokevirtual   #144 <Method Activity com.google.android.gms.internal.ads.aha.a()>
	//    9   19:invokevirtual   #472 <Method void com.google.android.gms.internal.ads.zu.a(Activity)>
	//   10   22:return          
	}

	public final void a(c c1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		g = c1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #475 <Field c g>
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
		b.a(zzc);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #478 <Method void com.google.android.gms.internal.ads.ahc.a(zzc)>
	//    4    8:return          
	}

	public final void a(a a1)
	{
		D.set(((Object) (a1)));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field AtomicReference D>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #483 <Method void AtomicReference.set(Object)>
	//    4    8:return          
	}

	public final void a(agd agd1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(q == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #486 <Field agd q>
	//    4    6:ifnull          18
		com.google.android.gms.internal.ads.wx.c("Attempt to create multiple AdWebViewVideoControllers.");
	//    5    9:ldc2            #488 <String "Attempt to create multiple AdWebViewVideoControllers.">
	//    6   12:invokestatic    #490 <Method void com.google.android.gms.internal.ads.wx.c(String)>
		this;
	//    7   15:aload_0         
		JVM INSTR monitorexit ;
	//    8   16:monitorexit     
		return;
	//    9   17:return          
		q = agd1;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #486 <Field agd q>
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
		h = ahb1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #107 <Field ahb h>
		requestLayout();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #494 <Method void requestLayout()>
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
		t = bf1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #430 <Field bf t>
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
		r = bpx1.a;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:getfield        #500 <Field boolean com.google.android.gms.internal.ads.bpx.a>
	//    5    7:putfield        #502 <Field boolean r>
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		h(bpx1.a);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:getfield        #500 <Field boolean com.google.android.gms.internal.ads.bpx.a>
	//   11   17:invokespecial   #504 <Method void h(boolean)>
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
		ahc ahc1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:astore_3        
		if(ahc1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			ahc1.a(s1, ag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #507 <Method void com.google.android.gms.internal.ads.ahc.a(String, ag)>
	//    9   15:return          
	}

	public final void a(String s1, p p1)
	{
		ahc ahc1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:astore_3        
		if(ahc1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			ahc1.a(s1, p1);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #510 <Method void com.google.android.gms.internal.ads.ahc.a(String, p)>
	//    9   15:return          
	}

	public final void a(String s1, aeq aeq1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(J == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #353 <Field Map J>
	//*   4    6:ifnonnull       20
			J = ((Map) (new HashMap()));
	//    5    9:aload_0         
	//    6   10:new             #398 <Class HashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #399 <Method void HashMap()>
	//    9   17:putfield        #353 <Field Map J>
		J.put(((Object) (s1)), ((Object) (aeq1)));
	//   10   20:aload_0         
	//   11   21:getfield        #353 <Field Map J>
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokeinterface #409 <Method Object Map.put(Object, Object)>
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

	public final void a(String s1, String s2)
	{
		com.google.android.gms.internal.ads.hg.a(((hf) (this)), s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #514 <Method void com.google.android.gms.internal.ads.hg.a(hf, String, String)>
	//    4    6:return          
	}

	public final void a(String s1, String s2, String s3)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		e e1 = p.ao;
	//    2    2:getstatic       #521 <Field e p.ao>
	//    3    5:astore          4
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   4    7:invokestatic    #524 <Method m bwk.e()>
	//*   5   10:aload           4
	//*   6   12:invokevirtual   #529 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//*   7   15:checkcast       #531 <Class Boolean>
	//*   8   18:invokevirtual   #534 <Method boolean Boolean.booleanValue()>
	//*   9   21:ifeq            63
			s2 = com.google.android.gms.internal.ads.agq.a(s2, new String[] {
				com.google.android.gms.internal.ads.agq.a()
			});
	//   10   24:aload_2         
	//   11   25:iconst_1        
	//   12   26:anewarray       String[]
	//   13   29:dup             
	//   14   30:iconst_0        
	//   15   31:invokestatic    #539 <Method String com.google.android.gms.internal.ads.agq.a()>
	//   16   34:aastore         
	//   17   35:invokestatic    #542 <Method String com.google.android.gms.internal.ads.agq.a(String, String[])>
	//   18   38:astore_2        
	//*  19   39:goto            42
		super.loadDataWithBaseURL(s1, s2, "text/html", "UTF-8", s3);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:ldc2            #544 <String "text/html">
	//   24   48:ldc2            #546 <String "UTF-8">
	//   25   51:aload_3         
	//   26   52:invokespecial   #550 <Method void ahp.loadDataWithBaseURL(String, String, String, String, String)>
		this;
	//   27   55:aload_0         
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return;
	//   29   57:return          
		s1;
	//   30   58:astore_1        
	//*  31   59:aload_0         
		throw s1;
	//   32   60:monitorexit     
	//   33   61:aload_1         
	//   34   62:athrow          
	//*  35   63:goto            42
	}

	public final void a(String s1, Map map)
	{
		com.google.android.gms.internal.ads.hg.a(((hf) (this)), s1, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #416 <Method void com.google.android.gms.internal.ads.hg.a(hf, String, Map)>
	//    4    6:return          
	}

	public final void a(String s1, JSONObject jsonobject)
	{
		hg.b(((hf) (this)), s1, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #555 <Method void hg.b(hf, String, JSONObject)>
	//    4    6:return          
	}

	public final void a(boolean flag)
	{
		((ahc)b).a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:checkcast       #259 <Class ahc>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #557 <Method void com.google.android.gms.internal.ads.ahc.a(boolean)>
	//    5   11:return          
	}

	public final void a(boolean flag, int i1)
	{
		b.a(flag, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #560 <Method void com.google.android.gms.internal.ads.ahc.a(boolean, int)>
	//    5    9:return          
	}

	public final void a(boolean flag, int i1, String s1)
	{
		b.a(flag, i1, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #563 <Method void com.google.android.gms.internal.ads.ahc.a(boolean, int, String)>
	//    6   10:return          
	}

	public final void a(boolean flag, int i1, String s1, String s2)
	{
		b.a(flag, i1, s1, s2);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #566 <Method void com.google.android.gms.internal.ads.ahc.a(boolean, int, String, String)>
	//    7   12:return          
	}

	public final void a(boolean flag, long l1)
	{
		HashMap hashmap = new HashMap(2);
	//    0    0:new             #398 <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:invokespecial   #459 <Method void HashMap(int)>
	//    4    8:astore          5
		String s1;
		if(flag)
	//*   5   10:iload_1         
	//*   6   11:ifeq            22
			s1 = "1";
	//    7   14:ldc2            #401 <String "1">
	//    8   17:astore          4
		else
	//*   9   19:goto            27
			s1 = "0";
	//   10   22:ldc2            #403 <String "0">
	//   11   25:astore          4
		hashmap.put("success", ((Object) (s1)));
	//   12   27:aload           5
	//   13   29:ldc2            #569 <String "success">
	//   14   32:aload           4
	//   15   34:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   16   37:pop             
		hashmap.put("duration", ((Object) (Long.toString(l1))));
	//   17   38:aload           5
	//   18   40:ldc2            #571 <String "duration">
	//   19   43:lload_2         
	//   20   44:invokestatic    #577 <Method String Long.toString(long)>
	//   21   47:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   22   50:pop             
		com.google.android.gms.internal.ads.hg.a(((hf) (this)), "onCacheAccessComplete", ((Map) (hashmap)));
	//   23   51:aload_0         
	//   24   52:ldc2            #579 <String "onCacheAccessComplete">
	//   25   55:aload           5
	//   26   57:invokestatic    #416 <Method void com.google.android.gms.internal.ads.hg.a(hf, String, Map)>
	//   27   60:return          
	}

	public final agd b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		agd agd1 = q;
	//    2    2:aload_0         
	//    3    3:getfield        #486 <Field agd q>
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
		B = c1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #582 <Field c B>
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
	//    6    8:ldc1            #84  <String "">
	//    7   10:astore_2        
	//*   8   11:goto            14
		p = s2;
	//    9   14:aload_0         
	//   10   15:aload_2         
	//   11   16:putfield        #86  <Field String p>
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
		ahc ahc1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:astore_3        
		if(ahc1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			ahc1.b(s1, ag);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #584 <Method void ahc.b(String, ag)>
	//    9   15:return          
	}

	public final void b(String s1, JSONObject jsonobject)
	{
		com.google.android.gms.internal.ads.hg.a(((hf) (this)), s1, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #586 <Method void com.google.android.gms.internal.ads.hg.a(hf, String, JSONObject)>
	//    4    6:return          
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
		if(flag != k)
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #111 <Field boolean k>
	//*   5    7:icmpeq          63
			flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore_2        
		else
	//*   8   12:goto            15
	//*   9   15:aload_0         
	//*  10   16:iload_1         
	//*  11   17:putfield        #111 <Field boolean k>
	//*  12   20:aload_0         
	//*  13   21:invokespecial   #191 <Method void P()>
	//*  14   24:iload_2         
	//*  15   25:ifeq            55
	//*  16   28:new             #293 <Class ni>
	//*  17   31:dup             
	//*  18   32:aload_0         
	//*  19   33:invokespecial   #296 <Method void ni(afn)>
	//*  20   36:astore          4
	//*  21   38:iload_1         
	//*  22   39:ifeq            68
	//*  23   42:ldc2            #588 <String "expanded">
	//*  24   45:astore_3        
	//*  25   46:goto            49
	//*  26   49:aload           4
	//*  27   51:aload_3         
	//*  28   52:invokevirtual   #589 <Method void com.google.android.gms.internal.ads.ni.c(String)>
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
		k = flag;
		P();
		if(!flag1)
			break MISSING_BLOCK_LABEL_55;
		ni1 = new ni(((afn) (this)));
		if(flag)
			obj = "expanded";
		else
	//*  39   65:goto            15
			obj = "default";
	//   40   68:ldc2            #591 <String "default">
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
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field aa x>
	//    2    4:areturn         
	}

	public final void c(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(g == null)
			break MISSING_BLOCK_LABEL_27;
	//    2    2:aload_0         
	//    3    3:getfield        #475 <Field c g>
	//    4    6:ifnull          27
		g.a(b.b(), flag);
	//    5    9:aload_0         
	//    6   10:getfield        #475 <Field c g>
	//    7   13:aload_0         
	//    8   14:getfield        #105 <Field ahc b>
	//    9   17:invokevirtual   #261 <Method boolean ahc.b()>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #597 <Method void c.a(boolean, boolean)>
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		j = flag;
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:putfield        #599 <Field boolean j>
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
	//    1    1:getfield        #103 <Field aha a>
	//    2    4:invokevirtual   #144 <Method Activity com.google.android.gms.internal.ads.aha.a()>
	//    3    7:areturn         
	}

	public final void d(String s1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(((ahp)this).C())
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #601 <Method boolean ahp.C()>
	//    4    6:ifne            17
		super.d(s1);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #603 <Method void ahp.d(String)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		wx.e("The webview is destroyed. Ignoring action.");
	//   11   17:ldc2            #605 <String "The webview is destroyed. Ignoring action.">
	//   12   20:invokestatic    #607 <Method void wx.e(String)>
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

	public final void d(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		n = flag;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #80  <Field boolean n>
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

	public final bs e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field bs f>
	//    2    4:areturn         
	}

	public final void e(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j1 = u;
	//    2    2:aload_0         
	//    3    3:getfield        #424 <Field int u>
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
	//*  14   20:putfield        #424 <Field int u>
	//*  15   23:aload_0         
	//*  16   24:getfield        #424 <Field int u>
	//*  17   27:ifgt            44
	//*  18   30:aload_0         
	//*  19   31:getfield        #475 <Field c g>
	//*  20   34:ifnull          44
	//*  21   37:aload_0         
	//*  22   38:getfield        #475 <Field c g>
	//*  23   41:invokevirtual   #610 <Method void c.q()>
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
		u = j1 + i1;
		if(u <= 0 && g != null)
			g.q();
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  34   56:goto            16
	}

	public final void f()
	{
		c c1 = s();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #613 <Method c s()>
	//    2    4:astore_1        
		if(c1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			c1.p();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #615 <Method void c.p()>
	//    7   13:return          
	}

	public final void f(boolean flag)
	{
		((ahc)b).b(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:checkcast       #259 <Class ahc>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #617 <Method void ahc.b(boolean)>
	//    5   11:return          
	}

	public final String g()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1 = p;
	//    2    2:aload_0         
	//    3    3:getfield        #86  <Field String p>
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

	protected final void g(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(flag)
			break MISSING_BLOCK_LABEL_43;
	//    2    2:iload_1         
	//    3    3:ifne            43
		T();
	//    4    6:aload_0         
	//    5    7:invokespecial   #212 <Method void T()>
		C.b();
	//    6   10:aload_0         
	//    7   11:getfield        #149 <Field zu C>
	//    8   14:invokevirtual   #619 <Method void zu.b()>
		if(g != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #475 <Field c g>
	//*  11   21:ifnull          43
		{
			g.a();
	//   12   24:aload_0         
	//   13   25:getfield        #475 <Field c g>
	//   14   28:invokevirtual   #620 <Method void c.a()>
			g.k();
	//   15   31:aload_0         
	//   16   32:getfield        #475 <Field c g>
	//   17   35:invokevirtual   #622 <Method void c.k()>
			g = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #475 <Field c g>
		}
		D.set(((Object) (null)));
	//   21   43:aload_0         
	//   22   44:getfield        #93  <Field AtomicReference D>
	//   23   47:aconst_null     
	//   24   48:invokevirtual   #483 <Method void AtomicReference.set(Object)>
		b.k();
	//   25   51:aload_0         
	//   26   52:getfield        #105 <Field ahc b>
	//   27   55:invokevirtual   #623 <Method void ahc.k()>
		aw.C();
	//   28   58:invokestatic    #626 <Method aep aw.C()>
	//   29   61:pop             
		com.google.android.gms.internal.ads.aep.a(((add) (this)));
	//   30   62:aload_0         
	//   31   63:invokestatic    #631 <Method boolean com.google.android.gms.internal.ads.aep.a(add)>
	//   32   66:pop             
		S();
	//   33   67:aload_0         
	//   34   68:invokespecial   #633 <Method void S()>
		this;
	//   35   71:aload_0         
		JVM INSTR monitorexit ;
	//   36   72:monitorexit     
		return;
	//   37   73:return          
		Exception exception;
		exception;
	//   38   74:astore_2        
	//*  39   75:aload_0         
		throw exception;
	//   40   76:monitorexit     
	//   41   77:aload_2         
	//   42   78:athrow          
	}

	public final android.view.View.OnClickListener getOnClickListener()
	{
		return (android.view.View.OnClickListener)A.get();
	//    0    0:aload_0         
	//    1    1:getfield        #637 <Field WeakReference A>
	//    2    4:invokevirtual   #640 <Method Object WeakReference.get()>
	//    3    7:checkcast       #642 <Class android.view.View$OnClickListener>
	//    4   10:areturn         
	}

	public final int getRequestedOrientation()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i1 = m;
	//    2    2:aload_0         
	//    3    3:getfield        #113 <Field int m>
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
		o = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #82  <Field boolean o>
		if(e != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #119 <Field ap e>
	//*   7   11:ifnull          23
			e.h_();
	//    8   14:aload_0         
	//    9   15:getfield        #119 <Field ap e>
	//   10   18:invokeinterface #652 <Method void ap.h_()>
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
		o = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #82  <Field boolean o>
		if(e != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #119 <Field ap e>
	//*   7   11:ifnull          23
			e.i_();
	//    8   14:aload_0         
	//    9   15:getfield        #119 <Field ap e>
	//   10   18:invokeinterface #655 <Method void ap.i_()>
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
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field ab z>
	//    2    4:areturn         
	}

	public final zzbbi k()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field zzbbi d>
	//    2    4:areturn         
	}

	public final int l()
	{
		return getMeasuredHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #660 <Method int getMeasuredHeight()>
	//    2    4:ireturn         
	}

	public final int m()
	{
		return getMeasuredWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #663 <Method int getMeasuredWidth()>
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
		O();
	//    0    0:aload_0         
	//    1    1:invokespecial   #448 <Method void O()>
		HashMap hashmap = new HashMap(1);
	//    2    4:new             #398 <Class HashMap>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:invokespecial   #459 <Method void HashMap(int)>
	//    6   12:astore_1        
		hashmap.put("version", ((Object) (d.a)));
	//    7   13:aload_1         
	//    8   14:ldc2            #464 <String "version">
	//    9   17:aload_0         
	//   10   18:getfield        #117 <Field zzbbi d>
	//   11   21:getfield        #158 <Field String com.google.android.gms.internal.ads.zzbbi.a>
	//   12   24:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
		com.google.android.gms.internal.ads.hg.a(((hf) (this)), "onhide", ((Map) (hashmap)));
	//   14   28:aload_0         
	//   15   29:ldc2            #466 <String "onhide">
	//   16   32:aload_1         
	//   17   33:invokestatic    #416 <Method void com.google.android.gms.internal.ads.hg.a(hf, String, Map)>
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
	//    3    3:invokespecial   #666 <Method void ahp.onAttachedToWindow()>
		if(!((ahp)this).C())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #601 <Method boolean ahp.C()>
	//*   6   10:ifne            20
			C.c();
	//    7   13:aload_0         
	//    8   14:getfield        #149 <Field zu C>
	//    9   17:invokevirtual   #668 <Method void com.google.android.gms.internal.ads.zu.c()>
		flag1 = r;
	//   10   20:aload_0         
	//   11   21:getfield        #502 <Field boolean r>
	//   12   24:istore_2        
		boolean flag = flag1;
	//   13   25:iload_2         
	//   14   26:istore_1        
		if((ahc)b == null)
			break MISSING_BLOCK_LABEL_119;
	//   15   27:aload_0         
	//   16   28:getfield        #105 <Field ahc b>
	//   17   31:checkcast       #259 <Class ahc>
	//   18   34:ifnull          119
		flag = flag1;
	//   19   37:iload_2         
	//   20   38:istore_1        
		Object obj;
		if(!((ahc)b).c())
			break MISSING_BLOCK_LABEL_119;
	//   21   39:aload_0         
	//   22   40:getfield        #105 <Field ahc b>
	//   23   43:checkcast       #259 <Class ahc>
	//   24   46:invokevirtual   #263 <Method boolean com.google.android.gms.internal.ads.ahc.c()>
	//   25   49:ifeq            119
		if(s)
			break MISSING_BLOCK_LABEL_112;
	//   26   52:aload_0         
	//   27   53:getfield        #670 <Field boolean s>
	//   28   56:ifne            112
		obj = ((Object) (((ahc)b).d()));
	//   29   59:aload_0         
	//   30   60:getfield        #105 <Field ahc b>
	//   31   63:checkcast       #259 <Class ahc>
	//   32   66:invokevirtual   #673 <Method android.view.ViewTreeObserver$OnGlobalLayoutListener ahc.d()>
	//   33   69:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_83;
	//   34   70:aload_3         
	//   35   71:ifnull          83
		aw.D();
	//   36   74:invokestatic    #676 <Method abw aw.D()>
	//   37   77:pop             
		com.google.android.gms.internal.ads.abw.a(((View) (this)), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (obj)));
	//   38   78:aload_0         
	//   39   79:aload_3         
	//   40   80:invokestatic    #681 <Method void com.google.android.gms.internal.ads.abw.a(View, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		obj = ((Object) (((ahc)b).e()));
	//   41   83:aload_0         
	//   42   84:getfield        #105 <Field ahc b>
	//   43   87:checkcast       #259 <Class ahc>
	//   44   90:invokevirtual   #684 <Method android.view.ViewTreeObserver$OnScrollChangedListener ahc.e()>
	//   45   93:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_107;
	//   46   94:aload_3         
	//   47   95:ifnull          107
		aw.D();
	//   48   98:invokestatic    #676 <Method abw aw.D()>
	//   49  101:pop             
		com.google.android.gms.internal.ads.abw.a(((View) (this)), ((android.view.ViewTreeObserver.OnScrollChangedListener) (obj)));
	//   50  102:aload_0         
	//   51  103:aload_3         
	//   52  104:invokestatic    #687 <Method void com.google.android.gms.internal.ads.abw.a(View, android.view.ViewTreeObserver$OnScrollChangedListener)>
		s = true;
	//   53  107:aload_0         
	//   54  108:iconst_1        
	//   55  109:putfield        #670 <Field boolean s>
		N();
	//   56  112:aload_0         
	//   57  113:invokespecial   #689 <Method boolean N()>
	//   58  116:pop             
		flag = true;
	//   59  117:iconst_1        
	//   60  118:istore_1        
		h(flag);
	//   61  119:aload_0         
	//   62  120:iload_1         
	//   63  121:invokespecial   #504 <Method void h(boolean)>
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
		if(!((ahp)this).C())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #601 <Method boolean ahp.C()>
	//*   4    6:ifne            16
			C.d();
	//    5    9:aload_0         
	//    6   10:getfield        #149 <Field zu C>
	//    7   13:invokevirtual   #692 <Method void zu.d()>
		super.onDetachedFromWindow();
	//    8   16:aload_0         
	//    9   17:invokespecial   #694 <Method void ahp.onDetachedFromWindow()>
		if(!s || (ahc)b == null || !((ahc)b).c() || getViewTreeObserver() == null || !getViewTreeObserver().isAlive())
			break MISSING_BLOCK_LABEL_121;
	//   10   20:aload_0         
	//   11   21:getfield        #670 <Field boolean s>
	//   12   24:ifeq            121
	//   13   27:aload_0         
	//   14   28:getfield        #105 <Field ahc b>
	//   15   31:checkcast       #259 <Class ahc>
	//   16   34:ifnull          121
	//   17   37:aload_0         
	//   18   38:getfield        #105 <Field ahc b>
	//   19   41:checkcast       #259 <Class ahc>
	//   20   44:invokevirtual   #263 <Method boolean com.google.android.gms.internal.ads.ahc.c()>
	//   21   47:ifeq            121
	//   22   50:aload_0         
	//   23   51:invokevirtual   #698 <Method ViewTreeObserver getViewTreeObserver()>
	//   24   54:ifnull          121
	//   25   57:aload_0         
	//   26   58:invokevirtual   #698 <Method ViewTreeObserver getViewTreeObserver()>
	//   27   61:invokevirtual   #703 <Method boolean ViewTreeObserver.isAlive()>
	//   28   64:ifeq            121
		obj = ((Object) (((ahc)b).d()));
	//   29   67:aload_0         
	//   30   68:getfield        #105 <Field ahc b>
	//   31   71:checkcast       #259 <Class ahc>
	//   32   74:invokevirtual   #673 <Method android.view.ViewTreeObserver$OnGlobalLayoutListener ahc.d()>
	//   33   77:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_93;
	//   34   78:aload_1         
	//   35   79:ifnull          93
		aw.g().a(getViewTreeObserver(), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (obj)));
	//   36   82:invokestatic    #250 <Method xo aw.g()>
	//   37   85:aload_0         
	//   38   86:invokevirtual   #698 <Method ViewTreeObserver getViewTreeObserver()>
	//   39   89:aload_1         
	//   40   90:invokevirtual   #706 <Method void com.google.android.gms.internal.ads.xo.a(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		obj = ((Object) (((ahc)b).e()));
	//   41   93:aload_0         
	//   42   94:getfield        #105 <Field ahc b>
	//   43   97:checkcast       #259 <Class ahc>
	//   44  100:invokevirtual   #684 <Method android.view.ViewTreeObserver$OnScrollChangedListener ahc.e()>
	//   45  103:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_116;
	//   46  104:aload_1         
	//   47  105:ifnull          116
		getViewTreeObserver().removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (obj)));
	//   48  108:aload_0         
	//   49  109:invokevirtual   #698 <Method ViewTreeObserver getViewTreeObserver()>
	//   50  112:aload_1         
	//   51  113:invokevirtual   #710 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
		s = false;
	//   52  116:aload_0         
	//   53  117:iconst_0        
	//   54  118:putfield        #670 <Field boolean s>
		this;
	//   55  121:aload_0         
		JVM INSTR monitorexit ;
	//   56  122:monitorexit     
		h(false);
	//   57  123:aload_0         
	//   58  124:iconst_0        
	//   59  125:invokespecial   #504 <Method void h(boolean)>
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
	//    0    0:new             #716 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #718 <String "android.intent.action.VIEW">
	//    3    7:invokespecial   #720 <Method void Intent(String)>
	//    4   10:astore_2        
			((Intent) (s2)).setDataAndType(Uri.parse(s1), s4);
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokestatic    #726 <Method Uri Uri.parse(String)>
	//    8   16:aload           4
	//    9   18:invokevirtual   #730 <Method Intent Intent.setDataAndType(Uri, String)>
	//   10   21:pop             
			aw.e();
	//   11   22:invokestatic    #154 <Method xg aw.e()>
	//   12   25:pop             
			com.google.android.gms.internal.ads.xg.a(getContext(), ((Intent) (s2)));
	//   13   26:aload_0         
	//   14   27:invokevirtual   #125 <Method Context getContext()>
	//   15   30:aload_2         
	//   16   31:invokestatic    #733 <Method void com.google.android.gms.internal.ads.xg.a(Context, Intent)>
			return;
	//   17   34:return          
		}
	//*  18   35:new             #735 <Class StringBuilder>
	//*  19   38:dup             
	//*  20   39:aload_1         
	//*  21   40:invokestatic    #738 <Method String String.valueOf(Object)>
	//*  22   43:invokevirtual   #741 <Method int String.length()>
	//*  23   46:bipush          51
	//*  24   48:iadd            
	//*  25   49:aload           4
	//*  26   51:invokestatic    #738 <Method String String.valueOf(Object)>
	//*  27   54:invokevirtual   #741 <Method int String.length()>
	//*  28   57:iadd            
	//*  29   58:invokespecial   #742 <Method void StringBuilder(int)>
	//*  30   61:astore_2        
	//*  31   62:aload_2         
	//*  32   63:ldc2            #744 <String "Couldn't find an Activity to view url/mimetype: ">
	//*  33   66:invokevirtual   #748 <Method StringBuilder StringBuilder.append(String)>
	//*  34   69:pop             
	//*  35   70:aload_2         
	//*  36   71:aload_1         
	//*  37   72:invokevirtual   #748 <Method StringBuilder StringBuilder.append(String)>
	//*  38   75:pop             
	//*  39   76:aload_2         
	//*  40   77:ldc2            #750 <String " / ">
	//*  41   80:invokevirtual   #748 <Method StringBuilder StringBuilder.append(String)>
	//*  42   83:pop             
	//*  43   84:aload_2         
	//*  44   85:aload           4
	//*  45   87:invokevirtual   #748 <Method StringBuilder StringBuilder.append(String)>
	//*  46   90:pop             
	//*  47   91:aload_2         
	//*  48   92:invokevirtual   #752 <Method String StringBuilder.toString()>
	//*  49   95:invokestatic    #333 <Method void wx.b(String)>
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
		if(android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow())
	//*   0    0:getstatic       #326 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpne          23
	//*   3    8:aload_1         
	//*   4    9:invokevirtual   #761 <Method boolean Canvas.isHardwareAccelerated()>
	//*   5   12:ifeq            23
	//*   6   15:aload_0         
	//*   7   16:invokevirtual   #764 <Method boolean isAttachedToWindow()>
	//*   8   19:ifne            23
			return;
	//    9   22:return          
		super.onDraw(canvas);
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:invokespecial   #766 <Method void ahp.onDraw(Canvas)>
		canvas = ((Canvas) (b));
	//   13   28:aload_0         
	//   14   29:getfield        #105 <Field ahc b>
	//   15   32:astore_1        
		if((ahc)canvas != null && ((ahc)canvas).l() != null)
	//*  16   33:aload_1         
	//*  17   34:checkcast       #259 <Class ahc>
	//*  18   37:ifnull          65
	//*  19   40:aload_1         
	//*  20   41:checkcast       #259 <Class ahc>
	//*  21   44:invokevirtual   #769 <Method agz ahc.l()>
	//*  22   47:ifnull          65
			((ahc)b).l().a();
	//   23   50:aload_0         
	//   24   51:getfield        #105 <Field ahc b>
	//   25   54:checkcast       #259 <Class ahc>
	//   26   57:invokevirtual   #769 <Method agz ahc.l()>
	//   27   60:invokeinterface #772 <Method void com.google.android.gms.internal.ads.agz.a()>
	//   28   65:return          
	}

	public final boolean onGenericMotionEvent(MotionEvent motionevent)
	{
		float f1 = motionevent.getAxisValue(9);
	//    0    0:aload_1         
	//    1    1:bipush          9
	//    2    3:invokevirtual   #781 <Method float MotionEvent.getAxisValue(int)>
	//    3    6:fstore_2        
		float f2 = motionevent.getAxisValue(10);
	//    4    7:aload_1         
	//    5    8:bipush          10
	//    6   10:invokevirtual   #781 <Method float MotionEvent.getAxisValue(int)>
	//    7   13:fstore_3        
		if(motionevent.getActionMasked() == 8 && (f1 > 0.0F && !canScrollVertically(-1) || f1 < 0.0F && !canScrollVertically(1) || f2 > 0.0F && !canScrollHorizontally(-1) || f2 < 0.0F && !canScrollHorizontally(1)))
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #784 <Method int MotionEvent.getActionMasked()>
	//*  10   18:bipush          8
	//*  11   20:icmpne          81
	//*  12   23:fload_2         
	//*  13   24:fconst_0        
	//*  14   25:fcmpl           
	//*  15   26:ifle            37
	//*  16   29:aload_0         
	//*  17   30:iconst_m1       
	//*  18   31:invokevirtual   #788 <Method boolean canScrollVertically(int)>
	//*  19   34:ifeq            79
	//*  20   37:fload_2         
	//*  21   38:fconst_0        
	//*  22   39:fcmpg           
	//*  23   40:ifge            51
	//*  24   43:aload_0         
	//*  25   44:iconst_1        
	//*  26   45:invokevirtual   #788 <Method boolean canScrollVertically(int)>
	//*  27   48:ifeq            79
	//*  28   51:fload_3         
	//*  29   52:fconst_0        
	//*  30   53:fcmpl           
	//*  31   54:ifle            65
	//*  32   57:aload_0         
	//*  33   58:iconst_m1       
	//*  34   59:invokevirtual   #791 <Method boolean canScrollHorizontally(int)>
	//*  35   62:ifeq            79
	//*  36   65:fload_3         
	//*  37   66:fconst_0        
	//*  38   67:fcmpg           
	//*  39   68:ifge            81
	//*  40   71:aload_0         
	//*  41   72:iconst_1        
	//*  42   73:invokevirtual   #791 <Method boolean canScrollHorizontally(int)>
	//*  43   76:ifne            81
			return false;
	//   44   79:iconst_0        
	//   45   80:ireturn         
		else
			return super.onGenericMotionEvent(motionevent);
	//   46   81:aload_0         
	//   47   82:aload_1         
	//   48   83:invokespecial   #793 <Method boolean ahp.onGenericMotionEvent(MotionEvent)>
	//   49   86:ireturn         
	}

	public final void onGlobalLayout()
	{
		boolean flag = N();
	//    0    0:aload_0         
	//    1    1:invokespecial   #689 <Method boolean N()>
	//    2    4:istore_1        
		c c1 = s();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #613 <Method c s()>
	//    5    9:astore_2        
		if(c1 != null && flag)
	//*   6   10:aload_2         
	//*   7   11:ifnull          22
	//*   8   14:iload_1         
	//*   9   15:ifeq            22
			c1.o();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #796 <Method void c.o()>
	//   12   22:return          
	}

	protected final void onMeasure(int i1, int j1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!((ahp)this).C())
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #601 <Method boolean ahp.C()>
	//    4    6:ifeq            18
		setMeasuredDimension(0, 0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #803 <Method void setMeasuredDimension(int, int)>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		if(!isInEditMode() && !k && !h.f()) goto _L2; else goto _L1
	//   12   18:aload_0         
	//   13   19:invokevirtual   #806 <Method boolean isInEditMode()>
	//   14   22:ifne            803
	//   15   25:aload_0         
	//   16   26:getfield        #111 <Field boolean k>
	//   17   29:ifne            803
	//   18   32:aload_0         
	//   19   33:getfield        #107 <Field ahb h>
	//   20   36:invokevirtual   #808 <Method boolean ahb.f()>
	//   21   39:ifeq            45
	//*  22   42:goto            803
_L2:
		if(!h.h())
			break MISSING_BLOCK_LABEL_64;
	//   23   45:aload_0         
	//   24   46:getfield        #107 <Field ahb h>
	//   25   49:invokevirtual   #810 <Method boolean ahb.h()>
	//   26   52:ifeq            64
		super.onMeasure(i1, j1);
	//   27   55:aload_0         
	//   28   56:iload_1         
	//   29   57:iload_2         
	//   30   58:invokespecial   #812 <Method void ahp.onMeasure(int, int)>
		this;
	//   31   61:aload_0         
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		return;
	//   33   63:return          
		if(!h.g()) goto _L4; else goto _L3
	//   34   64:aload_0         
	//   35   65:getfield        #107 <Field ahb h>
	//   36   68:invokevirtual   #814 <Method boolean ahb.g()>
	//   37   71:ifeq            270
_L3:
		e e1 = p.bE;
	//   38   74:getstatic       #817 <Field e p.bE>
	//   39   77:astore          10
		if(!((Boolean)bwk.e().a(e1)).booleanValue())
			break MISSING_BLOCK_LABEL_105;
	//   40   79:invokestatic    #524 <Method m bwk.e()>
	//   41   82:aload           10
	//   42   84:invokevirtual   #529 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//   43   87:checkcast       #531 <Class Boolean>
	//   44   90:invokevirtual   #534 <Method boolean Boolean.booleanValue()>
	//   45   93:ifeq            105
		super.onMeasure(i1, j1);
	//   46   96:aload_0         
	//   47   97:iload_1         
	//   48   98:iload_2         
	//   49   99:invokespecial   #812 <Method void ahp.onMeasure(int, int)>
		this;
	//   50  102:aload_0         
		JVM INSTR monitorexit ;
	//   51  103:monitorexit     
		return;
	//   52  104:return          
		agd agd1 = b();
	//   53  105:aload_0         
	//   54  106:invokevirtual   #819 <Method agd b()>
	//   55  109:astore          10
		if(agd1 == null) goto _L6; else goto _L5
	//   56  111:aload           10
	//   57  113:ifnull          819
_L5:
		float f1 = agd1.h();
	//   58  116:aload           10
	//   59  118:invokevirtual   #824 <Method float agd.h()>
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
	//   69  134:invokespecial   #812 <Method void ahp.onMeasure(int, int)>
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
	//   74  141:invokestatic    #830 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   75  144:istore          8
		i3 = android.view.View.MeasureSpec.getSize(j1);
	//   76  146:iload_2         
	//   77  147:invokestatic    #830 <Method int android.view.View$MeasureSpec.getSize(int)>
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
	//  143  254:invokestatic    #836 <Method int Math.min(int, int)>
	//  144  257:iload           7
	//  145  259:iload           5
	//  146  261:invokestatic    #836 <Method int Math.min(int, int)>
	//  147  264:invokevirtual   #803 <Method void setMeasuredDimension(int, int)>
		this;
	//  148  267:aload_0         
		JVM INSTR monitorexit ;
	//  149  268:monitorexit     
		return;
	//  150  269:return          
_L4:
		if(!h.d())
			break MISSING_BLOCK_LABEL_386;
	//  151  270:aload_0         
	//  152  271:getfield        #107 <Field ahb h>
	//  153  274:invokevirtual   #837 <Method boolean ahb.d()>
	//  154  277:ifeq            386
		e e2 = p.bJ;
	//  155  280:getstatic       #840 <Field e p.bJ>
	//  156  283:astore          10
		if(((Boolean)bwk.e().a(e2)).booleanValue() || !com.google.android.gms.common.util.o.d())
	//* 157  285:invokestatic    #524 <Method m bwk.e()>
	//* 158  288:aload           10
	//* 159  290:invokevirtual   #529 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//* 160  293:checkcast       #531 <Class Boolean>
	//* 161  296:invokevirtual   #534 <Method boolean Boolean.booleanValue()>
	//* 162  299:ifne            377
	//* 163  302:invokestatic    #196 <Method boolean o.d()>
	//* 164  305:ifne            311
			break MISSING_BLOCK_LABEL_377;
	//  165  308:goto            377
		a("/contentHeight", ((ag) (new ahl(this))));
	//  166  311:aload_0         
	//  167  312:ldc2            #842 <String "/contentHeight">
	//  168  315:new             #844 <Class ahl>
	//  169  318:dup             
	//  170  319:aload_0         
	//  171  320:invokespecial   #847 <Method void ahl(ahk)>
	//  172  323:invokevirtual   #848 <Method void a(String, ag)>
		((ahm)this).d("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
	//  173  326:aload_0         
	//  174  327:ldc2            #850 <String "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();">
	//  175  330:invokevirtual   #851 <Method void ahm.d(String)>
		k1 = android.view.View.MeasureSpec.getSize(i1);
	//  176  333:iload_1         
	//  177  334:invokestatic    #830 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  178  337:istore          4
		if(v != -1)
	//* 179  339:aload_0         
	//* 180  340:getfield        #394 <Field int v>
	//* 181  343:iconst_m1       
	//* 182  344:icmpeq          362
		{
			i1 = (int)((float)v * I);
	//  183  347:aload_0         
	//  184  348:getfield        #394 <Field int v>
	//  185  351:i2f             
	//  186  352:aload_0         
	//  187  353:getfield        #188 <Field float I>
	//  188  356:fmul            
	//  189  357:f2i             
	//  190  358:istore_1        
			break MISSING_BLOCK_LABEL_367;
	//  191  359:goto            367
		}
		i1 = android.view.View.MeasureSpec.getSize(j1);
	//  192  362:iload_2         
	//  193  363:invokestatic    #830 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  194  366:istore_1        
		setMeasuredDimension(k1, i1);
	//  195  367:aload_0         
	//  196  368:iload           4
	//  197  370:iload_1         
	//  198  371:invokevirtual   #803 <Method void setMeasuredDimension(int, int)>
		this;
	//  199  374:aload_0         
		JVM INSTR monitorexit ;
	//  200  375:monitorexit     
		return;
	//  201  376:return          
		super.onMeasure(i1, j1);
	//  202  377:aload_0         
	//  203  378:iload_1         
	//  204  379:iload_2         
	//  205  380:invokespecial   #812 <Method void ahp.onMeasure(int, int)>
		this;
	//  206  383:aload_0         
		JVM INSTR monitorexit ;
	//  207  384:monitorexit     
		return;
	//  208  385:return          
		if(!h.e())
			break MISSING_BLOCK_LABEL_436;
	//  209  386:aload_0         
	//  210  387:getfield        #107 <Field ahb h>
	//  211  390:invokevirtual   #321 <Method boolean ahb.e()>
	//  212  393:ifeq            436
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//  213  396:new             #183 <Class DisplayMetrics>
	//  214  399:dup             
	//  215  400:invokespecial   #852 <Method void DisplayMetrics()>
	//  216  403:astore          10
		K.getDefaultDisplay().getMetrics(displaymetrics);
	//  217  405:aload_0         
	//  218  406:getfield        #137 <Field WindowManager K>
	//  219  409:invokeinterface #300 <Method Display WindowManager.getDefaultDisplay()>
	//  220  414:aload           10
	//  221  416:invokevirtual   #856 <Method void Display.getMetrics(DisplayMetrics)>
		setMeasuredDimension(displaymetrics.widthPixels, displaymetrics.heightPixels);
	//  222  419:aload_0         
	//  223  420:aload           10
	//  224  422:getfield        #274 <Field int DisplayMetrics.widthPixels>
	//  225  425:aload           10
	//  226  427:getfield        #282 <Field int DisplayMetrics.heightPixels>
	//  227  430:invokevirtual   #803 <Method void setMeasuredDimension(int, int)>
		this;
	//  228  433:aload_0         
		JVM INSTR monitorexit ;
	//  229  434:monitorexit     
		return;
	//  230  435:return          
		i2 = android.view.View.MeasureSpec.getMode(i1);
	//  231  436:iload_1         
	//  232  437:invokestatic    #859 <Method int android.view.View$MeasureSpec.getMode(int)>
	//  233  440:istore          5
		j2 = android.view.View.MeasureSpec.getSize(i1);
	//  234  442:iload_1         
	//  235  443:invokestatic    #830 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  236  446:istore          6
		i1 = android.view.View.MeasureSpec.getMode(j1);
	//  237  448:iload_2         
	//  238  449:invokestatic    #859 <Method int android.view.View$MeasureSpec.getMode(int)>
	//  239  452:istore_1        
		k2 = android.view.View.MeasureSpec.getSize(j1);
	//  240  453:iload_2         
	//  241  454:invokestatic    #830 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  242  457:istore          7
		break MISSING_BLOCK_LABEL_459;
	//* 243  459:ldc2            #860 <Int 0x7fffffff>
	//* 244  462:istore          4
	//* 245  464:iload           5
	//* 246  466:ldc2            #861 <Int 0x80000000>
	//* 247  469:icmpeq          831
	//* 248  472:iload           5
	//* 249  474:ldc2            #862 <Int 0x40000000>
	//* 250  477:icmpne          824
	//* 251  480:goto            831
_L11:
		i1 = h.b;
	//  252  483:aload_0         
	//  253  484:getfield        #107 <Field ahb h>
	//  254  487:getfield        #864 <Field int ahb.b>
	//  255  490:istore_1        
		flag = true;
	//  256  491:iconst_1        
	//  257  492:istore          8
		if(i1 > j1) goto _L8; else goto _L7
	//  258  494:iload_1         
	//  259  495:iload_2         
	//  260  496:icmpgt          860
_L7:
		if(h.a <= l1) goto _L9; else goto _L8
	//  261  499:aload_0         
	//  262  500:getfield        #107 <Field ahb h>
	//  263  503:getfield        #866 <Field int com.google.android.gms.internal.ads.ahb.a>
	//  264  506:iload           4
	//  265  508:icmple          855
	//* 266  511:goto            860
_L12:
		e3 = p.cE;
	//  267  514:getstatic       #869 <Field e p.cE>
	//  268  517:astore          10
		i2 = i1;
	//  269  519:iload_1         
	//  270  520:istore          5
		if(((Boolean)bwk.e().a(e3)).booleanValue())
	//* 271  522:invokestatic    #524 <Method m bwk.e()>
	//* 272  525:aload           10
	//* 273  527:invokevirtual   #529 <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//* 274  530:checkcast       #531 <Class Boolean>
	//* 275  533:invokevirtual   #534 <Method boolean Boolean.booleanValue()>
	//* 276  536:ifeq            594
		{
			StringBuilder stringbuilder;
			Exception exception;
			if((float)h.b / I <= (float)j1 / I && (float)h.a / I <= (float)l1 / I)
	//* 277  539:aload_0         
	//* 278  540:getfield        #107 <Field ahb h>
	//* 279  543:getfield        #864 <Field int ahb.b>
	//* 280  546:i2f             
	//* 281  547:aload_0         
	//* 282  548:getfield        #188 <Field float I>
	//* 283  551:fdiv            
	//* 284  552:iload_2         
	//* 285  553:i2f             
	//* 286  554:aload_0         
	//* 287  555:getfield        #188 <Field float I>
	//* 288  558:fdiv            
	//* 289  559:fcmpl           
	//* 290  560:ifgt            865
	//* 291  563:aload_0         
	//* 292  564:getfield        #107 <Field ahb h>
	//* 293  567:getfield        #866 <Field int com.google.android.gms.internal.ads.ahb.a>
	//* 294  570:i2f             
	//* 295  571:aload_0         
	//* 296  572:getfield        #188 <Field float I>
	//* 297  575:fdiv            
	//* 298  576:iload           4
	//* 299  578:i2f             
	//* 300  579:aload_0         
	//* 301  580:getfield        #188 <Field float I>
	//* 302  583:fdiv            
	//* 303  584:fcmpl           
	//* 304  585:ifgt            865
				j1 = ((int) (flag));
	//  305  588:iload           8
	//  306  590:istore_2        
			else
	//* 307  591:goto            867
	//* 308  594:iload           5
	//* 309  596:ifeq            768
	//* 310  599:aload_0         
	//* 311  600:getfield        #107 <Field ahb h>
	//* 312  603:getfield        #864 <Field int ahb.b>
	//* 313  606:i2f             
	//* 314  607:aload_0         
	//* 315  608:getfield        #188 <Field float I>
	//* 316  611:fdiv            
	//* 317  612:f2i             
	//* 318  613:istore_1        
	//* 319  614:aload_0         
	//* 320  615:getfield        #107 <Field ahb h>
	//* 321  618:getfield        #866 <Field int com.google.android.gms.internal.ads.ahb.a>
	//* 322  621:i2f             
	//* 323  622:aload_0         
	//* 324  623:getfield        #188 <Field float I>
	//* 325  626:fdiv            
	//* 326  627:f2i             
	//* 327  628:istore_2        
	//* 328  629:iload           6
	//* 329  631:i2f             
	//* 330  632:aload_0         
	//* 331  633:getfield        #188 <Field float I>
	//* 332  636:fdiv            
	//* 333  637:f2i             
	//* 334  638:istore          4
	//* 335  640:iload           7
	//* 336  642:i2f             
	//* 337  643:aload_0         
	//* 338  644:getfield        #188 <Field float I>
	//* 339  647:fdiv            
	//* 340  648:f2i             
	//* 341  649:istore          5
	//* 342  651:new             #735 <Class StringBuilder>
	//* 343  654:dup             
	//* 344  655:bipush          103
	//* 345  657:invokespecial   #742 <Method void StringBuilder(int)>
	//* 346  660:astore          10
	//* 347  662:aload           10
	//* 348  664:ldc2            #871 <String "Not enough space to show ad. Needs ">
	//* 349  667:invokevirtual   #748 <Method StringBuilder StringBuilder.append(String)>
	//* 350  670:pop             
	//* 351  671:aload           10
	//* 352  673:iload_1         
	//* 353  674:invokevirtual   #874 <Method StringBuilder StringBuilder.append(int)>
	//* 354  677:pop             
	//* 355  678:aload           10
	//* 356  680:ldc2            #875 <String "x">
	//* 357  683:invokevirtual   #748 <Method StringBuilder StringBuilder.append(String)>
	//* 358  686:pop             
	//* 359  687:aload           10
	//* 360  689:iload_2         
	//* 361  690:invokevirtual   #874 <Method StringBuilder StringBuilder.append(int)>
	//* 362  693:pop             
	//* 363  694:aload           10
	//* 364  696:ldc2            #877 <String " dp, but only has ">
	//* 365  699:invokevirtual   #748 <Method StringBuilder StringBuilder.append(String)>
	//* 366  702:pop             
	//* 367  703:aload           10
	//* 368  705:iload           4
	//* 369  707:invokevirtual   #874 <Method StringBuilder StringBuilder.append(int)>
	//* 370  710:pop             
	//* 371  711:aload           10
	//* 372  713:ldc2            #875 <String "x">
	//* 373  716:invokevirtual   #748 <Method StringBuilder StringBuilder.append(String)>
	//* 374  719:pop             
	//* 375  720:aload           10
	//* 376  722:iload           5
	//* 377  724:invokevirtual   #874 <Method StringBuilder StringBuilder.append(int)>
	//* 378  727:pop             
	//* 379  728:aload           10
	//* 380  730:ldc2            #879 <String " dp.">
	//* 381  733:invokevirtual   #748 <Method StringBuilder StringBuilder.append(String)>
	//* 382  736:pop             
	//* 383  737:aload           10
	//* 384  739:invokevirtual   #752 <Method String StringBuilder.toString()>
	//* 385  742:invokestatic    #607 <Method void wx.e(String)>
	//* 386  745:aload_0         
	//* 387  746:invokevirtual   #882 <Method int getVisibility()>
	//* 388  749:bipush          8
	//* 389  751:icmpeq          759
	//* 390  754:aload_0         
	//* 391  755:iconst_4        
	//* 392  756:invokevirtual   #885 <Method void setVisibility(int)>
	//* 393  759:aload_0         
	//* 394  760:iconst_0        
	//* 395  761:iconst_0        
	//* 396  762:invokevirtual   #803 <Method void setMeasuredDimension(int, int)>
	//* 397  765:aload_0         
	//* 398  766:monitorexit     
	//* 399  767:return          
	//* 400  768:aload_0         
	//* 401  769:invokevirtual   #882 <Method int getVisibility()>
	//* 402  772:bipush          8
	//* 403  774:icmpeq          782
	//* 404  777:aload_0         
	//* 405  778:iconst_0        
	//* 406  779:invokevirtual   #885 <Method void setVisibility(int)>
	//* 407  782:aload_0         
	//* 408  783:aload_0         
	//* 409  784:getfield        #107 <Field ahb h>
	//* 410  787:getfield        #864 <Field int ahb.b>
	//* 411  790:aload_0         
	//* 412  791:getfield        #107 <Field ahb h>
	//* 413  794:getfield        #866 <Field int com.google.android.gms.internal.ads.ahb.a>
	//* 414  797:invokevirtual   #803 <Method void setMeasuredDimension(int, int)>
	//* 415  800:aload_0         
	//* 416  801:monitorexit     
	//* 417  802:return          
	//* 418  803:aload_0         
	//* 419  804:iload_1         
	//* 420  805:iload_2         
	//* 421  806:invokespecial   #812 <Method void ahp.onMeasure(int, int)>
	//* 422  809:aload_0         
	//* 423  810:monitorexit     
	//* 424  811:return          
	//* 425  812:astore          10
	//* 426  814:aload_0         
	//* 427  815:monitorexit     
	//* 428  816:aload           10
	//* 429  818:athrow          
	//* 430  819:fconst_0        
	//* 431  820:fstore_3        
	//* 432  821:goto            125
	//* 433  824:ldc2            #860 <Int 0x7fffffff>
	//* 434  827:istore_2        
	//* 435  828:goto            834
	//* 436  831:iload           6
	//* 437  833:istore_2        
	//* 438  834:iload_1         
	//* 439  835:ldc2            #861 <Int 0x80000000>
	//* 440  838:icmpeq          848
	//* 441  841:iload_1         
	//* 442  842:ldc2            #862 <Int 0x40000000>
	//* 443  845:icmpne          483
	//* 444  848:iload           7
	//* 445  850:istore          4
	//* 446  852:goto            483
	//* 447  855:iconst_0        
	//* 448  856:istore_1        
	//* 449  857:goto            514
	//* 450  860:iconst_1        
	//* 451  861:istore_1        
	//* 452  862:goto            514
				j1 = 0;
	//  453  865:iconst_0        
	//  454  866:istore_2        
			break MISSING_BLOCK_LABEL_867;
		}
_L13:
		if(i2 == 0)
			break MISSING_BLOCK_LABEL_768;
		i1 = (int)((float)h.b / I);
		j1 = (int)((float)h.a / I);
		l1 = (int)((float)j2 / I);
		i2 = (int)((float)k2 / I);
		stringbuilder = new StringBuilder(103);
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
		this;
		JVM INSTR monitorexit ;
		return;
		if(getVisibility() != 8)
			setVisibility(0);
		setMeasuredDimension(h.b, h.a);
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
		boolean flag;
		e e3;
		if(i2 != 0x80000000 && i2 != 0x40000000)
			j1 = 0x7fffffff;
		else
			j1 = j2;
		if(i1 == 0x80000000 || i1 == 0x40000000)
			l1 = k2;
		  goto _L11
_L9:
		i1 = 0;
		  goto _L12
_L8:
		i1 = 1;
		  goto _L12
		i2 = i1;
	//  455  867:iload_1         
	//  456  868:istore          5
		if(i1 != 0)
	//* 457  870:iload_1         
	//* 458  871:ifeq            594
			i2 = j1;
	//  459  874:iload_2         
	//  460  875:istore          5
		  goto _L13
	//* 461  877:goto            594
	}

	public final void onPause()
	{
		try
		{
			super.onPause();
	//    0    0:aload_0         
	//    1    1:invokespecial   #890 <Method void ahp.onPause()>
			return;
	//    2    4:return          
		}
		catch(Exception exception)
	//*   3    5:astore_1        
		{
			wx.b("Could not pause webview.", ((Throwable) (exception)));
	//    4    6:ldc2            #892 <String "Could not pause webview.">
	//    5    9:aload_1         
	//    6   10:invokestatic    #895 <Method void wx.b(String, Throwable)>
		}
	//    7   13:return          
	}

	public final void onResume()
	{
		try
		{
			super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #898 <Method void ahp.onResume()>
			return;
	//    2    4:return          
		}
		catch(Exception exception)
	//*   3    5:astore_1        
		{
			wx.b("Could not resume webview.", ((Throwable) (exception)));
	//    4    6:ldc2            #900 <String "Could not resume webview.">
	//    5    9:aload_1         
	//    6   10:invokestatic    #895 <Method void wx.b(String, Throwable)>
		}
	//    7   13:return          
	}

	public final boolean onTouchEvent(MotionEvent motionevent)
	{
		if(!((ahc)b).c())
			break MISSING_BLOCK_LABEL_42;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:checkcast       #259 <Class ahc>
	//    3    7:invokevirtual   #263 <Method boolean com.google.android.gms.internal.ads.ahc.c()>
	//    4   10:ifeq            42
		this;
	//    5   13:aload_0         
		JVM INSTR monitorenter ;
	//    6   14:monitorenter    
		if(t != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #430 <Field bf t>
	//*   9   19:ifnull          32
			t.a(motionevent);
	//   10   22:aload_0         
	//   11   23:getfield        #430 <Field bf t>
	//   12   26:aload_1         
	//   13   27:invokeinterface #906 <Method void com.google.android.gms.internal.ads.bf.a(MotionEvent)>
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
		bad bad1 = c;
	//   22   42:aload_0         
	//   23   43:getfield        #115 <Field bad c>
	//   24   46:astore_2        
		if(bad1 != null)
	//*  25   47:aload_2         
	//*  26   48:ifnull          56
			bad1.a(motionevent);
	//   27   51:aload_2         
	//   28   52:aload_1         
	//   29   53:invokevirtual   #909 <Method void com.google.android.gms.internal.ads.bad.a(MotionEvent)>
		return super.onTouchEvent(motionevent);
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:invokespecial   #911 <Method boolean ahp.onTouchEvent(MotionEvent)>
	//   33   61:ireturn         
	}

	public final void p()
	{
		if(w == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #247 <Field aa w>
	//*   2    4:ifnonnull       60
		{
			com.google.android.gms.internal.ads.v.a(z.a(), x, new String[] {
				"aes2"
			});
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field ab z>
	//    5   11:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//    6   14:aload_0         
	//    7   15:getfield        #238 <Field aa x>
	//    8   18:iconst_1        
	//    9   19:anewarray       String[]
	//   10   22:dup             
	//   11   23:iconst_0        
	//   12   24:ldc2            #913 <String "aes2">
	//   13   27:aastore         
	//   14   28:invokestatic    #317 <Method boolean com.google.android.gms.internal.ads.v.a(ad, aa, String[])>
	//   15   31:pop             
			w = com.google.android.gms.internal.ads.v.a(z.a());
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #226 <Field ab z>
	//   19   37:invokevirtual   #229 <Method ad com.google.android.gms.internal.ads.ab.a()>
	//   20   40:invokestatic    #236 <Method aa com.google.android.gms.internal.ads.v.a(ad)>
	//   21   43:putfield        #247 <Field aa w>
			z.a("native:view_show", w);
	//   22   46:aload_0         
	//   23   47:getfield        #226 <Field ab z>
	//   24   50:ldc2            #915 <String "native:view_show">
	//   25   53:aload_0         
	//   26   54:getfield        #247 <Field aa w>
	//   27   57:invokevirtual   #243 <Method void com.google.android.gms.internal.ads.ab.a(String, aa)>
		}
		HashMap hashmap = new HashMap(1);
	//   28   60:new             #398 <Class HashMap>
	//   29   63:dup             
	//   30   64:iconst_1        
	//   31   65:invokespecial   #459 <Method void HashMap(int)>
	//   32   68:astore_1        
		hashmap.put("version", ((Object) (d.a)));
	//   33   69:aload_1         
	//   34   70:ldc2            #464 <String "version">
	//   35   73:aload_0         
	//   36   74:getfield        #117 <Field zzbbi d>
	//   37   77:getfield        #158 <Field String com.google.android.gms.internal.ads.zzbbi.a>
	//   38   80:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   39   83:pop             
		com.google.android.gms.internal.ads.hg.a(((hf) (this)), "onshow", ((Map) (hashmap)));
	//   40   84:aload_0         
	//   41   85:ldc2            #917 <String "onshow">
	//   42   88:aload_1         
	//   43   89:invokestatic    #416 <Method void com.google.android.gms.internal.ads.hg.a(hf, String, Map)>
	//   44   92:return          
	}

	public final void q()
	{
		HashMap hashmap = new HashMap(3);
	//    0    0:new             #398 <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:invokespecial   #459 <Method void HashMap(int)>
	//    4    8:astore_1        
		hashmap.put("app_muted", ((Object) (String.valueOf(aw.j().b()))));
	//    5    9:aload_1         
	//    6   10:ldc2            #919 <String "app_muted">
	//    7   13:invokestatic    #922 <Method ya aw.j()>
	//    8   16:invokevirtual   #925 <Method boolean ya.b()>
	//    9   19:invokestatic    #928 <Method String String.valueOf(boolean)>
	//   10   22:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   11   25:pop             
		hashmap.put("app_volume", ((Object) (String.valueOf(aw.j().a()))));
	//   12   26:aload_1         
	//   13   27:ldc2            #930 <String "app_volume">
	//   14   30:invokestatic    #922 <Method ya aw.j()>
	//   15   33:invokevirtual   #932 <Method float com.google.android.gms.internal.ads.ya.a()>
	//   16   36:invokestatic    #935 <Method String String.valueOf(float)>
	//   17   39:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   18   42:pop             
		hashmap.put("device_volume", ((Object) (String.valueOf(com.google.android.gms.internal.ads.ya.a(getContext())))));
	//   19   43:aload_1         
	//   20   44:ldc2            #937 <String "device_volume">
	//   21   47:aload_0         
	//   22   48:invokevirtual   #125 <Method Context getContext()>
	//   23   51:invokestatic    #940 <Method float com.google.android.gms.internal.ads.ya.a(Context)>
	//   24   54:invokestatic    #935 <Method String String.valueOf(float)>
	//   25   57:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   26   60:pop             
		com.google.android.gms.internal.ads.hg.a(((hf) (this)), "volume", ((Map) (hashmap)));
	//   27   61:aload_0         
	//   28   62:ldc2            #942 <String "volume">
	//   29   65:aload_1         
	//   30   66:invokestatic    #416 <Method void com.google.android.gms.internal.ads.hg.a(hf, String, Map)>
	//   31   69:return          
	}

	public final Context r()
	{
		return a.b();
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field aha a>
	//    2    4:invokevirtual   #944 <Method Context aha.b()>
	//    3    7:areturn         
	}

	public final c s()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c c1 = g;
	//    2    2:aload_0         
	//    3    3:getfield        #475 <Field c g>
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
		A = new WeakReference(((Object) (onclicklistener)));
	//    0    0:aload_0         
	//    1    1:new             #639 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #948 <Method void WeakReference(Object)>
	//    5    9:putfield        #637 <Field WeakReference A>
		super.setOnClickListener(onclicklistener);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #950 <Method void ahp.setOnClickListener(android.view.View$OnClickListener)>
	//    9   17:return          
	}

	public final void setRequestedOrientation(int i1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		m = i1;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #113 <Field int m>
		if(g != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #475 <Field c g>
	//*   7   11:ifnull          25
			g.a(m);
	//    8   14:aload_0         
	//    9   15:getfield        #475 <Field c g>
	//   10   18:aload_0         
	//   11   19:getfield        #113 <Field int m>
	//   12   22:invokevirtual   #953 <Method void c.a(int)>
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

	public final void stopLoading()
	{
		try
		{
			super.stopLoading();
	//    0    0:aload_0         
	//    1    1:invokespecial   #956 <Method void ahp.stopLoading()>
			return;
	//    2    4:return          
		}
		catch(Exception exception)
	//*   3    5:astore_1        
		{
			wx.b("Could not stop loading webview.", ((Throwable) (exception)));
	//    4    6:ldc2            #958 <String "Could not stop loading webview.">
	//    5    9:aload_1         
	//    6   10:invokestatic    #895 <Method void wx.b(String, Throwable)>
		}
	//    7   13:return          
	}

	public final c t()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		c c1 = B;
	//    2    2:aload_0         
	//    3    3:getfield        #582 <Field c B>
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
		ahb ahb1 = h;
	//    2    2:aload_0         
	//    3    3:getfield        #107 <Field ahb h>
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
		String s1 = i;
	//    2    2:aload_0         
	//    3    3:getfield        #109 <Field String i>
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
		return ((agv) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:areturn         
	}

	public final WebViewClient x()
	{
		return ((WebViewClient) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ahc b>
	//    2    4:areturn         
	}

	public final boolean y()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = j;
	//    2    2:aload_0         
	//    3    3:getfield        #599 <Field boolean j>
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
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field bad c>
	//    2    4:areturn         
	}

	private WeakReference A;
	private c B;
	private zu C;
	private final AtomicReference D = new AtomicReference();
	private int E;
	private int F;
	private int G;
	private int H;
	private float I;
	private Map J;
	private final WindowManager K = (WindowManager)getContext().getSystemService("window");
	private final aha a;
	private final ahc b;
	private final bad c;
	private final zzbbi d;
	private final ap e;
	private final bs f;
	private c g;
	private ahb h;
	private String i;
	private boolean j;
	private boolean k;
	private boolean l;
	private int m;
	private boolean n;
	private boolean o;
	private String p;
	private agd q;
	private boolean r;
	private boolean s;
	private bf t;
	private int u;
	private int v;
	private aa w;
	private aa x;
	private aa y;
	private ab z;
}
