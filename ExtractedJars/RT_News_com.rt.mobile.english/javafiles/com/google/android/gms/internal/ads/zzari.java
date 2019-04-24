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
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.*;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqw, zzakk, zzakb, zzang, 
//			zzakq, zzaro, zzamt, zzash, 
//			zznw, zznx, zznq, zzajm, 
//			zzaqx, zzkb, zzamu, zzaal, 
//			zzasi, zznn, zzaqg, zzaor, 
//			zzasg, zznk, zzni, zzarl, 
//			zzarj, zzhs, zzox, zzci, 
//			zzfs, zzarx, zzalb, zzark, 
//			zznv, zzapn, zzasc

final class zzari extends WebView
	implements android.view.ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzaqw
{

	private zzari(zzash zzash1, zzasi zzasi1, String s, boolean flag, boolean flag1, zzci zzci1, zzang zzang1, 
			zznx zznx1, zzbo zzbo1, zzw zzw, zzhs zzhs1)
	{
		super(((Context) (zzash1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void WebView(Context)>
		zzddd = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #94  <Field boolean zzddd>
		zzdde = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #96  <Field boolean zzdde>
		zzddn = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #98  <Field boolean zzddn>
		zzddo = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #100 <Field boolean zzddo>
		zzchp = "";
	//   15   25:aload_0         
	//   16   26:ldc1            #102 <String "">
	//   17   28:putfield        #104 <Field String zzchp>
		zzbwz = -1;
	//   18   31:aload_0         
	//   19   32:iconst_m1       
	//   20   33:putfield        #106 <Field int zzbwz>
		zzbwy = -1;
	//   21   36:aload_0         
	//   22   37:iconst_m1       
	//   23   38:putfield        #108 <Field int zzbwy>
		zzbxb = -1;
	//   24   41:aload_0         
	//   25   42:iconst_m1       
	//   26   43:putfield        #110 <Field int zzbxb>
		zzbxc = -1;
	//   27   46:aload_0         
	//   28   47:iconst_m1       
	//   29   48:putfield        #112 <Field int zzbxc>
		zzdda = zzash1;
	//   30   51:aload_0         
	//   31   52:aload_1         
	//   32   53:putfield        #114 <Field zzash zzdda>
		zzddh = zzasi1;
	//   33   56:aload_0         
	//   34   57:aload_2         
	//   35   58:putfield        #116 <Field zzasi zzddh>
		zzus = s;
	//   36   61:aload_0         
	//   37   62:aload_3         
	//   38   63:putfield        #118 <Field String zzus>
		zzddk = flag;
	//   39   66:aload_0         
	//   40   67:iload           4
	//   41   69:putfield        #120 <Field boolean zzddk>
		zzddm = -1;
	//   42   72:aload_0         
	//   43   73:iconst_m1       
	//   44   74:putfield        #122 <Field int zzddm>
		zzbjc = zzci1;
	//   45   77:aload_0         
	//   46   78:aload           6
	//   47   80:putfield        #124 <Field zzci zzbjc>
		zzyf = zzang1;
	//   48   83:aload_0         
	//   49   84:aload           7
	//   50   86:putfield        #126 <Field zzang zzyf>
		zzddb = zzbo1;
	//   51   89:aload_0         
	//   52   90:aload           9
	//   53   92:putfield        #128 <Field zzbo zzddb>
		zzwc = zzw;
	//   54   95:aload_0         
	//   55   96:aload           10
	//   56   98:putfield        #130 <Field zzw zzwc>
	//   57  101:aload_0         
	//   58  102:aload_0         
	//   59  103:invokevirtual   #134 <Method Context getContext()>
	//   60  106:ldc1            #136 <String "window">
	//   61  108:invokevirtual   #142 <Method Object Context.getSystemService(String)>
	//   62  111:checkcast       #144 <Class WindowManager>
	//   63  114:putfield        #146 <Field WindowManager zzaeu>
		zzbv.zzek();
	//   64  117:invokestatic    #152 <Method zzakk zzbv.zzek()>
	//   65  120:pop             
		zzagj = zzakk.zza(zzaeu);
	//   66  121:aload_0         
	//   67  122:aload_0         
	//   68  123:getfield        #146 <Field WindowManager zzaeu>
	//   69  126:invokestatic    #158 <Method DisplayMetrics zzakk.zza(WindowManager)>
	//   70  129:putfield        #160 <Field DisplayMetrics zzagj>
		zzddc = zzagj.density;
	//   71  132:aload_0         
	//   72  133:aload_0         
	//   73  134:getfield        #160 <Field DisplayMetrics zzagj>
	//   74  137:getfield        #165 <Field float DisplayMetrics.density>
	//   75  140:putfield        #167 <Field float zzddc>
		zzcch = zzhs1;
	//   76  143:aload_0         
	//   77  144:aload           11
	//   78  146:putfield        #169 <Field zzhs zzcch>
		setBackgroundColor(0);
	//   79  149:aload_0         
	//   80  150:iconst_0        
	//   81  151:invokevirtual   #173 <Method void setBackgroundColor(int)>
		zzasi1 = ((zzasi) (getSettings()));
	//   82  154:aload_0         
	//   83  155:invokevirtual   #177 <Method WebSettings getSettings()>
	//   84  158:astore_2        
		((WebSettings) (zzasi1)).setAllowFileAccess(false);
	//   85  159:aload_2         
	//   86  160:iconst_0        
	//   87  161:invokevirtual   #183 <Method void WebSettings.setAllowFileAccess(boolean)>
		try
		{
			((WebSettings) (zzasi1)).setJavaScriptEnabled(true);
	//   88  164:aload_2         
	//   89  165:iconst_1        
	//   90  166:invokevirtual   #186 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		}
	//*  91  169:goto            179
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  92  172:astore_3        
		{
			zzakb.zzb("Unable to enable Javascript.", ((Throwable) (s)));
	//   93  173:ldc1            #188 <String "Unable to enable Javascript.">
	//   94  175:aload_3         
	//   95  176:invokestatic    #194 <Method void zzakb.zzb(String, Throwable)>
		}
		((WebSettings) (zzasi1)).setSavePassword(false);
	//   96  179:aload_2         
	//   97  180:iconst_0        
	//   98  181:invokevirtual   #197 <Method void WebSettings.setSavePassword(boolean)>
		((WebSettings) (zzasi1)).setSupportMultipleWindows(true);
	//   99  184:aload_2         
	//  100  185:iconst_1        
	//  101  186:invokevirtual   #200 <Method void WebSettings.setSupportMultipleWindows(boolean)>
		((WebSettings) (zzasi1)).setJavaScriptCanOpenWindowsAutomatically(true);
	//  102  189:aload_2         
	//  103  190:iconst_1        
	//  104  191:invokevirtual   #203 <Method void WebSettings.setJavaScriptCanOpenWindowsAutomatically(boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 105  194:getstatic       #208 <Field int android.os.Build$VERSION.SDK_INT>
	//* 106  197:bipush          21
	//* 107  199:icmplt          207
			((WebSettings) (zzasi1)).setMixedContentMode(2);
	//  108  202:aload_2         
	//  109  203:iconst_2        
	//  110  204:invokevirtual   #211 <Method void WebSettings.setMixedContentMode(int)>
		zzbv.zzek().zza(((Context) (zzash1)), zzang1.zzcw, ((WebSettings) (zzasi1)));
	//  111  207:invokestatic    #152 <Method zzakk zzbv.zzek()>
	//  112  210:aload_1         
	//  113  211:aload           7
	//  114  213:getfield        #216 <Field String zzang.zzcw>
	//  115  216:aload_2         
	//  116  217:invokevirtual   #219 <Method void zzakk.zza(Context, String, WebSettings)>
		zzbv.zzem().zza(getContext(), ((WebSettings) (zzasi1)));
	//  117  220:invokestatic    #223 <Method zzakq zzbv.zzem()>
	//  118  223:aload_0         
	//  119  224:invokevirtual   #134 <Method Context getContext()>
	//  120  227:aload_2         
	//  121  228:invokevirtual   #228 <Method boolean zzakq.zza(Context, WebSettings)>
	//  122  231:pop             
		setDownloadListener(((DownloadListener) (this)));
	//  123  232:aload_0         
	//  124  233:aload_0         
	//  125  234:invokevirtual   #232 <Method void setDownloadListener(DownloadListener)>
		zzvk();
	//  126  237:aload_0         
	//  127  238:invokespecial   #236 <Method void zzvk()>
		if(PlatformVersion.isAtLeastJellyBeanMR1())
	//* 128  241:invokestatic    #242 <Method boolean PlatformVersion.isAtLeastJellyBeanMR1()>
	//* 129  244:ifeq            257
			addJavascriptInterface(((Object) (zzaro.zzk(((zzaqw) (this))))), "googleAdsJsInterface");
	//  130  247:aload_0         
	//  131  248:aload_0         
	//  132  249:invokestatic    #248 <Method zzaro zzaro.zzk(zzaqw)>
	//  133  252:ldc1            #250 <String "googleAdsJsInterface">
	//  134  254:invokevirtual   #254 <Method void addJavascriptInterface(Object, String)>
		if(PlatformVersion.isAtLeastHoneycomb())
	//* 135  257:invokestatic    #257 <Method boolean PlatformVersion.isAtLeastHoneycomb()>
	//* 136  260:ifeq            277
		{
			removeJavascriptInterface("accessibility");
	//  137  263:aload_0         
	//  138  264:ldc2            #259 <String "accessibility">
	//  139  267:invokevirtual   #263 <Method void removeJavascriptInterface(String)>
			removeJavascriptInterface("accessibilityTraversal");
	//  140  270:aload_0         
	//  141  271:ldc2            #265 <String "accessibilityTraversal">
	//  142  274:invokevirtual   #263 <Method void removeJavascriptInterface(String)>
		}
		zzaee = new zzamt(zzdda.zzto(), ((View) (this)), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)), ((android.view.ViewTreeObserver.OnScrollChangedListener) (null)));
	//  143  277:aload_0         
	//  144  278:new             #267 <Class zzamt>
	//  145  281:dup             
	//  146  282:aload_0         
	//  147  283:getfield        #114 <Field zzash zzdda>
	//  148  286:invokevirtual   #273 <Method Activity zzash.zzto()>
	//  149  289:aload_0         
	//  150  290:aload_0         
	//  151  291:aconst_null     
	//  152  292:invokespecial   #276 <Method void zzamt(Activity, View, android.view.ViewTreeObserver$OnGlobalLayoutListener, android.view.ViewTreeObserver$OnScrollChangedListener)>
	//  153  295:putfield        #278 <Field zzamt zzaee>
		zzvo();
	//  154  298:aload_0         
	//  155  299:invokespecial   #281 <Method void zzvo()>
		zzddx = new zznw(new zznx(true, "make_wv", zzus));
	//  156  302:aload_0         
	//  157  303:new             #283 <Class zznw>
	//  158  306:dup             
	//  159  307:new             #285 <Class zznx>
	//  160  310:dup             
	//  161  311:iconst_1        
	//  162  312:ldc2            #287 <String "make_wv">
	//  163  315:aload_0         
	//  164  316:getfield        #118 <Field String zzus>
	//  165  319:invokespecial   #290 <Method void zznx(boolean, String, String)>
	//  166  322:invokespecial   #293 <Method void zznw(zznx)>
	//  167  325:putfield        #295 <Field zznw zzddx>
		zzddx.zzji().zzc(zznx1);
	//  168  328:aload_0         
	//  169  329:getfield        #295 <Field zznw zzddx>
	//  170  332:invokevirtual   #299 <Method zznx zznw.zzji()>
	//  171  335:aload           8
	//  172  337:invokevirtual   #302 <Method void com.google.android.gms.internal.ads.zznx.zzc(zznx)>
		zzdad = zznq.zzb(zzddx.zzji());
	//  173  340:aload_0         
	//  174  341:aload_0         
	//  175  342:getfield        #295 <Field zznw zzddx>
	//  176  345:invokevirtual   #299 <Method zznx zznw.zzji()>
	//  177  348:invokestatic    #307 <Method zznv zznq.zzb(zznx)>
	//  178  351:putfield        #309 <Field zznv zzdad>
		zzddx.zza("native:view_create", zzdad);
	//  179  354:aload_0         
	//  180  355:getfield        #295 <Field zznw zzddx>
	//  181  358:ldc2            #311 <String "native:view_create">
	//  182  361:aload_0         
	//  183  362:getfield        #309 <Field zznv zzdad>
	//  184  365:invokevirtual   #314 <Method void zznw.zza(String, zznv)>
		zzddw = null;
	//  185  368:aload_0         
	//  186  369:aconst_null     
	//  187  370:putfield        #316 <Field zznv zzddw>
		zzddv = null;
	//  188  373:aload_0         
	//  189  374:aconst_null     
	//  190  375:putfield        #318 <Field zznv zzddv>
		zzbv.zzem().zzaw(((Context) (zzash1)));
	//  191  378:invokestatic    #223 <Method zzakq zzbv.zzem()>
	//  192  381:aload_1         
	//  193  382:invokevirtual   #321 <Method void zzakq.zzaw(Context)>
		zzbv.zzeo().zzqe();
	//  194  385:invokestatic    #325 <Method zzajm zzbv.zzeo()>
	//  195  388:invokevirtual   #330 <Method void zzajm.zzqe()>
	//  196  391:return          
	}

	static int zza(zzari zzari1)
	{
		return zzari1.zzddu;
	//    0    0:aload_0         
	//    1    1:getfield        #336 <Field int zzddu>
	//    2    4:ireturn         
	}

	static int zza(zzari zzari1, int i)
	{
		zzari1.zzddu = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #336 <Field int zzddu>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private final void zza(Boolean boolean1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzcpp = boolean1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #340 <Field Boolean zzcpp>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		zzbv.zzeo().zza(boolean1);
	//    7    9:invokestatic    #325 <Method zzajm zzbv.zzeo()>
	//    8   12:aload_1         
	//    9   13:invokevirtual   #342 <Method void zzajm.zza(Boolean)>
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

	private final void zza(String s, ValueCallback valuecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isDestroyed())
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #348 <Method boolean isDestroyed()>
	//    4    6:ifne            18
		evaluateJavascript(s, ((ValueCallback) (null)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:invokevirtual   #351 <Method void evaluateJavascript(String, ValueCallback)>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//   12   18:ldc2            #353 <String "#004 The webview is destroyed. Ignoring action.">
	//   13   21:invokestatic    #356 <Method void zzakb.zzdk(String)>
		this;
	//   14   24:aload_0         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return;
	//   16   26:return          
		s;
	//   17   27:astore_1        
	//*  18   28:aload_0         
		throw s;
	//   19   29:monitorexit     
	//   20   30:aload_1         
	//   21   31:athrow          
	}

	private final void zzal(boolean flag)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #361 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #363 <Method void HashMap()>
	//    3    7:astore_3        
		String s;
		if(flag)
	//*   4    8:iload_1         
	//*   5    9:ifeq            19
			s = "1";
	//    6   12:ldc2            #365 <String "1">
	//    7   15:astore_2        
		else
	//*   8   16:goto            23
			s = "0";
	//    9   19:ldc2            #367 <String "0">
	//   10   22:astore_2        
		((Map) (hashmap)).put("isVisible", ((Object) (s)));
	//   11   23:aload_3         
	//   12   24:ldc2            #369 <String "isVisible">
	//   13   27:aload_2         
	//   14   28:invokeinterface #375 <Method Object Map.put(Object, Object)>
	//   15   33:pop             
		zza("onAdVisibilityChanged", ((Map) (hashmap)));
	//   16   34:aload_0         
	//   17   35:ldc2            #377 <String "onAdVisibilityChanged">
	//   18   38:aload_3         
	//   19   39:invokevirtual   #380 <Method void zza(String, Map)>
	//   20   42:return          
	}

	static zzari zzb(Context context, zzasi zzasi1, String s, boolean flag, boolean flag1, zzci zzci1, zzang zzang1, zznx zznx1, 
			zzbo zzbo1, zzw zzw, zzhs zzhs1)
	{
		return new zzari(new zzash(context), zzasi1, s, flag, flag1, zzci1, zzang1, zznx1, zzbo1, zzw, zzhs1);
	//    0    0:new             #2   <Class zzari>
	//    1    3:dup             
	//    2    4:new             #269 <Class zzash>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #382 <Method void zzash(Context)>
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
	//   16   29:invokespecial   #384 <Method void zzari(zzash, zzasi, String, boolean, boolean, zzci, zzang, zznx, zzbo, zzw, zzhs)>
	//   17   32:areturn         
	}

	static void zzb(zzari zzari1)
	{
		((WebView) (zzari1)).WebView.destroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #388 <Method void WebView.destroy()>
	//    2    4:return          
	}

	private final void zzds(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isDestroyed())
			break MISSING_BLOCK_LABEL_17;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #348 <Method boolean isDestroyed()>
	//    4    6:ifne            17
		loadUrl(s);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #392 <Method void loadUrl(String)>
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//   11   17:ldc2            #353 <String "#004 The webview is destroyed. Ignoring action.">
	//   12   20:invokestatic    #356 <Method void zzakb.zzdk(String)>
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		s;
	//   16   26:astore_1        
	//*  17   27:aload_0         
		throw s;
	//   18   28:monitorexit     
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	private final void zzdt(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.loadUrl(s);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #402 <Method void WebView.loadUrl(String)>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		s;
	//    8   10:astore_1        
		break MISSING_BLOCK_LABEL_36;
	//    9   11:goto            35
		s;
	//   10   14:astore_1        
		zzbv.zzeo().zza(((Throwable) (s)), "AdWebViewImpl.loadUrlUnsafe");
	//   11   15:invokestatic    #325 <Method zzajm zzbv.zzeo()>
	//   12   18:aload_1         
	//   13   19:ldc2            #404 <String "AdWebViewImpl.loadUrlUnsafe">
	//   14   22:invokevirtual   #407 <Method void zzajm.zza(Throwable, String)>
		com.google.android.gms.internal.ads.zzakb.zzc("Could not call loadUrl. ", ((Throwable) (s)));
	//   15   25:ldc2            #409 <String "Could not call loadUrl. ">
	//   16   28:aload_1         
	//   17   29:invokestatic    #411 <Method void com.google.android.gms.internal.ads.zzakb.zzc(String, Throwable)>
		this;
	//   18   32:aload_0         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return;
	//   20   34:return          
	//*  21   35:aload_0         
		throw s;
	//   22   36:monitorexit     
	//   23   37:aload_1         
	//   24   38:athrow          
	}

	private final void zzdu(String s)
	{
		if(PlatformVersion.isAtLeastKitKat())
	//*   0    0:invokestatic    #415 <Method boolean PlatformVersion.isAtLeastKitKat()>
	//*   1    3:ifeq            74
		{
			if(zzpz() == null)
	//*   2    6:aload_0         
	//*   3    7:invokespecial   #419 <Method Boolean zzpz()>
	//*   4   10:ifnonnull       17
				zzvi();
	//    5   13:aload_0         
	//    6   14:invokespecial   #422 <Method void zzvi()>
			if(zzpz().booleanValue())
	//*   7   17:aload_0         
	//*   8   18:invokespecial   #419 <Method Boolean zzpz()>
	//*   9   21:invokevirtual   #427 <Method boolean Boolean.booleanValue()>
	//*  10   24:ifeq            34
			{
				zza(s, ((ValueCallback) (null)));
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:aconst_null     
	//   14   30:invokespecial   #429 <Method void zza(String, ValueCallback)>
				return;
	//   15   33:return          
			}
			s = String.valueOf(((Object) (s)));
	//   16   34:aload_1         
	//   17   35:invokestatic    #435 <Method String String.valueOf(Object)>
	//   18   38:astore_1        
			if(s.length() != 0)
	//*  19   39:aload_1         
	//*  20   40:invokevirtual   #439 <Method int String.length()>
	//*  21   43:ifeq            57
				s = "javascript:".concat(s);
	//   22   46:ldc2            #441 <String "javascript:">
	//   23   49:aload_1         
	//   24   50:invokevirtual   #445 <Method String String.concat(String)>
	//   25   53:astore_1        
			else
	//*  26   54:goto            68
				s = new String("javascript:");
	//   27   57:new             #431 <Class String>
	//   28   60:dup             
	//   29   61:ldc2            #441 <String "javascript:">
	//   30   64:invokespecial   #447 <Method void String(String)>
	//   31   67:astore_1        
			zzds(s);
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:invokespecial   #449 <Method void zzds(String)>
			return;
	//   35   73:return          
		}
		s = String.valueOf(((Object) (s)));
	//   36   74:aload_1         
	//   37   75:invokestatic    #435 <Method String String.valueOf(Object)>
	//   38   78:astore_1        
		if(s.length() != 0)
	//*  39   79:aload_1         
	//*  40   80:invokevirtual   #439 <Method int String.length()>
	//*  41   83:ifeq            97
			s = "javascript:".concat(s);
	//   42   86:ldc2            #441 <String "javascript:">
	//   43   89:aload_1         
	//   44   90:invokevirtual   #445 <Method String String.concat(String)>
	//   45   93:astore_1        
		else
	//*  46   94:goto            108
			s = new String("javascript:");
	//   47   97:new             #431 <Class String>
	//   48  100:dup             
	//   49  101:ldc2            #441 <String "javascript:">
	//   50  104:invokespecial   #447 <Method void String(String)>
	//   51  107:astore_1        
		zzds(s);
	//   52  108:aload_0         
	//   53  109:aload_1         
	//   54  110:invokespecial   #449 <Method void zzds(String)>
	//   55  113:return          
	}

	private final Boolean zzpz()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Boolean boolean1 = zzcpp;
	//    2    2:aload_0         
	//    3    3:getfield        #340 <Field Boolean zzcpp>
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

	private final void zzqf()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzdea)
	//*   2    2:aload_0         
	//*   3    3:getfield        #452 <Field boolean zzdea>
	//*   4    6:ifne            20
		{
			zzdea = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #452 <Field boolean zzdea>
			zzbv.zzeo().zzqf();
	//    8   14:invokestatic    #325 <Method zzajm zzbv.zzeo()>
	//    9   17:invokevirtual   #454 <Method void zzajm.zzqf()>
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

	private final boolean zzvh()
	{
		boolean flag1 = ((zzaqx)zzddf).zzfz();
	//    0    0:aload_0         
	//    1    1:getfield        #457 <Field zzaqx zzddf>
	//    2    4:checkcast       #459 <Class zzaqx>
	//    3    7:invokevirtual   #462 <Method boolean zzaqx.zzfz()>
	//    4   10:istore          6
		boolean flag = false;
	//    5   12:iconst_0        
	//    6   13:istore          5
		if(!flag1 && !((zzaqx)zzddf).zzuu())
	//*   7   15:iload           6
	//*   8   17:ifne            35
	//*   9   20:aload_0         
	//*  10   21:getfield        #457 <Field zzaqx zzddf>
	//*  11   24:checkcast       #459 <Class zzaqx>
	//*  12   27:invokevirtual   #465 <Method boolean zzaqx.zzuu()>
	//*  13   30:ifne            35
			return false;
	//   14   33:iconst_0        
	//   15   34:ireturn         
		zzkb.zzif();
	//   16   35:invokestatic    #471 <Method zzamu zzkb.zzif()>
	//   17   38:pop             
		int k = zzamu.zzb(zzagj, zzagj.widthPixels);
	//   18   39:aload_0         
	//   19   40:getfield        #160 <Field DisplayMetrics zzagj>
	//   20   43:aload_0         
	//   21   44:getfield        #160 <Field DisplayMetrics zzagj>
	//   22   47:getfield        #474 <Field int DisplayMetrics.widthPixels>
	//   23   50:invokestatic    #479 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   24   53:istore_3        
		zzkb.zzif();
	//   25   54:invokestatic    #471 <Method zzamu zzkb.zzif()>
	//   26   57:pop             
		int l = zzamu.zzb(zzagj, zzagj.heightPixels);
	//   27   58:aload_0         
	//   28   59:getfield        #160 <Field DisplayMetrics zzagj>
	//   29   62:aload_0         
	//   30   63:getfield        #160 <Field DisplayMetrics zzagj>
	//   31   66:getfield        #482 <Field int DisplayMetrics.heightPixels>
	//   32   69:invokestatic    #479 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   33   72:istore          4
		Activity activity = zzdda.zzto();
	//   34   74:aload_0         
	//   35   75:getfield        #114 <Field zzash zzdda>
	//   36   78:invokevirtual   #273 <Method Activity zzash.zzto()>
	//   37   81:astore          7
		int i;
		int j;
		if(activity != null && activity.getWindow() != null)
	//*  38   83:aload           7
	//*  39   85:ifnull          145
	//*  40   88:aload           7
	//*  41   90:invokevirtual   #488 <Method android.view.Window Activity.getWindow()>
	//*  42   93:ifnonnull       99
	//*  43   96:goto            145
		{
			zzbv.zzek();
	//   44   99:invokestatic    #152 <Method zzakk zzbv.zzek()>
	//   45  102:pop             
			int ai[] = zzakk.zzf(activity);
	//   46  103:aload           7
	//   47  105:invokestatic    #492 <Method int[] zzakk.zzf(Activity)>
	//   48  108:astore          7
			zzkb.zzif();
	//   49  110:invokestatic    #471 <Method zzamu zzkb.zzif()>
	//   50  113:pop             
			i = zzamu.zzb(zzagj, ai[0]);
	//   51  114:aload_0         
	//   52  115:getfield        #160 <Field DisplayMetrics zzagj>
	//   53  118:aload           7
	//   54  120:iconst_0        
	//   55  121:iaload          
	//   56  122:invokestatic    #479 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   57  125:istore_1        
			zzkb.zzif();
	//   58  126:invokestatic    #471 <Method zzamu zzkb.zzif()>
	//   59  129:pop             
			j = zzamu.zzb(zzagj, ai[1]);
	//   60  130:aload_0         
	//   61  131:getfield        #160 <Field DisplayMetrics zzagj>
	//   62  134:aload           7
	//   63  136:iconst_1        
	//   64  137:iaload          
	//   65  138:invokestatic    #479 <Method int zzamu.zzb(DisplayMetrics, int)>
	//   66  141:istore_2        
		} else
	//*  67  142:goto            150
		{
			i = k;
	//   68  145:iload_3         
	//   69  146:istore_1        
			j = l;
	//   70  147:iload           4
	//   71  149:istore_2        
		}
		if(zzbwy == k && zzbwz == l && zzbxb == i && zzbxc == j)
	//*  72  150:aload_0         
	//*  73  151:getfield        #108 <Field int zzbwy>
	//*  74  154:iload_3         
	//*  75  155:icmpne          185
	//*  76  158:aload_0         
	//*  77  159:getfield        #106 <Field int zzbwz>
	//*  78  162:iload           4
	//*  79  164:icmpne          185
	//*  80  167:aload_0         
	//*  81  168:getfield        #110 <Field int zzbxb>
	//*  82  171:iload_1         
	//*  83  172:icmpne          185
	//*  84  175:aload_0         
	//*  85  176:getfield        #112 <Field int zzbxc>
	//*  86  179:iload_2         
	//*  87  180:icmpne          185
			return false;
	//   88  183:iconst_0        
	//   89  184:ireturn         
		if(zzbwy != k || zzbwz != l)
	//*  90  185:aload_0         
	//*  91  186:getfield        #108 <Field int zzbwy>
	//*  92  189:iload_3         
	//*  93  190:icmpne          202
	//*  94  193:aload_0         
	//*  95  194:getfield        #106 <Field int zzbwz>
	//*  96  197:iload           4
	//*  97  199:icmpeq          205
			flag = true;
	//   98  202:iconst_1        
	//   99  203:istore          5
		zzbwy = k;
	//  100  205:aload_0         
	//  101  206:iload_3         
	//  102  207:putfield        #108 <Field int zzbwy>
		zzbwz = l;
	//  103  210:aload_0         
	//  104  211:iload           4
	//  105  213:putfield        #106 <Field int zzbwz>
		zzbxb = i;
	//  106  216:aload_0         
	//  107  217:iload_1         
	//  108  218:putfield        #110 <Field int zzbxb>
		zzbxc = j;
	//  109  221:aload_0         
	//  110  222:iload_2         
	//  111  223:putfield        #112 <Field int zzbxc>
		(new zzaal(((zzaqw) (this)))).zza(k, l, i, j, zzagj.density, zzaeu.getDefaultDisplay().getRotation());
	//  112  226:new             #494 <Class zzaal>
	//  113  229:dup             
	//  114  230:aload_0         
	//  115  231:invokespecial   #497 <Method void zzaal(zzaqw)>
	//  116  234:iload_3         
	//  117  235:iload           4
	//  118  237:iload_1         
	//  119  238:iload_2         
	//  120  239:aload_0         
	//  121  240:getfield        #160 <Field DisplayMetrics zzagj>
	//  122  243:getfield        #165 <Field float DisplayMetrics.density>
	//  123  246:aload_0         
	//  124  247:getfield        #146 <Field WindowManager zzaeu>
	//  125  250:invokeinterface #501 <Method Display WindowManager.getDefaultDisplay()>
	//  126  255:invokevirtual   #506 <Method int Display.getRotation()>
	//  127  258:invokevirtual   #509 <Method void zzaal.zza(int, int, int, int, float, int)>
		return flag;
	//  128  261:iload           5
	//  129  263:ireturn         
	}

	private final void zzvi()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Boolean boolean1;
		zzcpp = zzbv.zzeo().zzpz();
	//    2    2:aload_0         
	//    3    3:invokestatic    #325 <Method zzajm zzbv.zzeo()>
	//    4    6:invokevirtual   #512 <Method Boolean zzajm.zzpz()>
	//    5    9:putfield        #340 <Field Boolean zzcpp>
		boolean1 = zzcpp;
	//    6   12:aload_0         
	//    7   13:getfield        #340 <Field Boolean zzcpp>
	//    8   16:astore_1        
		if(boolean1 != null) goto _L2; else goto _L1
	//    9   17:aload_1         
	//   10   18:ifnonnull       48
_L1:
		evaluateJavascript("(function(){})()", ((ValueCallback) (null)));
	//   11   21:aload_0         
	//   12   22:ldc2            #514 <String "(function(){})()">
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #351 <Method void evaluateJavascript(String, ValueCallback)>
		zza(Boolean.valueOf(true));
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:invokestatic    #517 <Method Boolean Boolean.valueOf(boolean)>
	//   18   34:invokespecial   #518 <Method void zza(Boolean)>
		this;
	//   19   37:aload_0         
		JVM INSTR monitorexit ;
	//   20   38:monitorexit     
		return;
	//   21   39:return          
_L4:
		zza(Boolean.valueOf(false));
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:invokestatic    #517 <Method Boolean Boolean.valueOf(boolean)>
	//   25   45:invokespecial   #518 <Method void zza(Boolean)>
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

	private final void zzvj()
	{
		zznq.zza(zzddx.zzji(), zzdad, new String[] {
			"aeh2"
		});
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field zznw zzddx>
	//    2    4:invokevirtual   #299 <Method zznx zznw.zzji()>
	//    3    7:aload_0         
	//    4    8:getfield        #309 <Field zznv zzdad>
	//    5   11:iconst_1        
	//    6   12:anewarray       String[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:ldc2            #521 <String "aeh2">
	//   10   20:aastore         
	//   11   21:invokestatic    #524 <Method boolean zznq.zza(zznx, zznv, String[])>
	//   12   24:pop             
	//   13   25:return          
	}

	private final void zzvk()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzddk || zzddh.zzvs())
	//*   2    2:aload_0         
	//*   3    3:getfield        #120 <Field boolean zzddk>
	//*   4    6:ifne            56
	//*   5    9:aload_0         
	//*   6   10:getfield        #116 <Field zzasi zzddh>
	//*   7   13:invokevirtual   #529 <Method boolean zzasi.zzvs()>
	//*   8   16:ifeq            22
			break MISSING_BLOCK_LABEL_56;
	//    9   19:goto            56
		if(android.os.Build.VERSION.SDK_INT >= 18)
			break MISSING_BLOCK_LABEL_43;
	//   10   22:getstatic       #208 <Field int android.os.Build$VERSION.SDK_INT>
	//   11   25:bipush          18
	//   12   27:icmpge          43
		zzakb.zzck("Disabling hardware acceleration on an AdView.");
	//   13   30:ldc2            #531 <String "Disabling hardware acceleration on an AdView.">
	//   14   33:invokestatic    #534 <Method void zzakb.zzck(String)>
		zzvl();
	//   15   36:aload_0         
	//   16   37:invokespecial   #537 <Method void zzvl()>
		this;
	//   17   40:aload_0         
		JVM INSTR monitorexit ;
	//   18   41:monitorexit     
		return;
	//   19   42:return          
		zzakb.zzck("Enabling hardware acceleration on an AdView.");
	//   20   43:ldc2            #539 <String "Enabling hardware acceleration on an AdView.">
	//   21   46:invokestatic    #534 <Method void zzakb.zzck(String)>
		zzvm();
	//   22   49:aload_0         
	//   23   50:invokespecial   #542 <Method void zzvm()>
		this;
	//   24   53:aload_0         
		JVM INSTR monitorexit ;
	//   25   54:monitorexit     
		return;
	//   26   55:return          
		zzakb.zzck("Enabling hardware acceleration on an overlay.");
	//   27   56:ldc2            #544 <String "Enabling hardware acceleration on an overlay.">
	//   28   59:invokestatic    #534 <Method void zzakb.zzck(String)>
		zzvm();
	//   29   62:aload_0         
	//   30   63:invokespecial   #542 <Method void zzvm()>
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

	private final void zzvl()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzddl)
	//*   2    2:aload_0         
	//*   3    3:getfield        #546 <Field boolean zzddl>
	//*   4    6:ifne            17
			zzbv.zzem().zzz(((View) (this)));
	//    5    9:invokestatic    #223 <Method zzakq zzbv.zzem()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #550 <Method boolean zzakq.zzz(View)>
	//    8   16:pop             
		zzddl = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #546 <Field boolean zzddl>
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

	private final void zzvm()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzddl)
	//*   2    2:aload_0         
	//*   3    3:getfield        #546 <Field boolean zzddl>
	//*   4    6:ifeq            17
			zzbv.zzem().zzy(((View) (this)));
	//    5    9:invokestatic    #223 <Method zzakq zzbv.zzem()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #553 <Method boolean zzakq.zzy(View)>
	//    8   16:pop             
		zzddl = false;
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:putfield        #546 <Field boolean zzddl>
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

	private final void zzvn()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzdeb = null;
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:putfield        #556 <Field Map zzdeb>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw exception;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	private final void zzvo()
	{
		if(zzddx == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #295 <Field zznw zzddx>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		zznx zznx1 = zzddx.zzji();
	//    4    8:aload_0         
	//    5    9:getfield        #295 <Field zznw zzddx>
	//    6   12:invokevirtual   #299 <Method zznx zznw.zzji()>
	//    7   15:astore_1        
		if(zznx1 != null && zzbv.zzeo().zzpy() != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          40
	//*  10   20:invokestatic    #325 <Method zzajm zzbv.zzeo()>
	//*  11   23:invokevirtual   #560 <Method zznn zzajm.zzpy()>
	//*  12   26:ifnull          40
			zzbv.zzeo().zzpy().zza(zznx1);
	//   13   29:invokestatic    #325 <Method zzajm zzbv.zzeo()>
	//   14   32:invokevirtual   #560 <Method zznn zzajm.zzpy()>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #565 <Method boolean zznn.zza(zznx)>
	//   17   39:pop             
	//   18   40:return          
	}

	public final void destroy()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		zzvo();
	//    2    2:aload_0         
	//    3    3:invokespecial   #281 <Method void zzvo()>
		zzaee.zzsd();
	//    4    6:aload_0         
	//    5    7:getfield        #278 <Field zzamt zzaee>
	//    6   10:invokevirtual   #568 <Method void zzamt.zzsd()>
		if(zzddg != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #570 <Field zzd zzddg>
	//*   9   17:ifnull          39
		{
			zzddg.close();
	//   10   20:aload_0         
	//   11   21:getfield        #570 <Field zzd zzddg>
	//   12   24:invokevirtual   #575 <Method void zzd.close()>
			zzddg.onDestroy();
	//   13   27:aload_0         
	//   14   28:getfield        #570 <Field zzd zzddg>
	//   15   31:invokevirtual   #578 <Method void zzd.onDestroy()>
			zzddg = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #570 <Field zzd zzddg>
		}
		zzddf.reset();
	//   19   39:aload_0         
	//   20   40:getfield        #457 <Field zzaqx zzddf>
	//   21   43:invokevirtual   #581 <Method void zzaqx.reset()>
		flag = zzddj;
	//   22   46:aload_0         
	//   23   47:getfield        #583 <Field boolean zzddj>
	//   24   50:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_58;
	//   25   51:iload_1         
	//   26   52:ifeq            58
		this;
	//   27   55:aload_0         
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return;
	//   29   57:return          
		zzbv.zzff();
	//   30   58:invokestatic    #587 <Method zzaqg zzbv.zzff()>
	//   31   61:pop             
		zzaqg.zzb(((zzapw) (this)));
	//   32   62:aload_0         
	//   33   63:invokestatic    #592 <Method boolean zzaqg.zzb(zzapw)>
	//   34   66:pop             
		zzvn();
	//   35   67:aload_0         
	//   36   68:invokespecial   #594 <Method void zzvn()>
		zzddj = true;
	//   37   71:aload_0         
	//   38   72:iconst_1        
	//   39   73:putfield        #583 <Field boolean zzddj>
		zzakb.v("Initiating WebView self destruct sequence in 3...");
	//   40   76:ldc2            #596 <String "Initiating WebView self destruct sequence in 3...">
	//   41   79:invokestatic    #599 <Method void zzakb.v(String)>
		zzakb.v("Loading blank page in WebView, 2...");
	//   42   82:ldc2            #601 <String "Loading blank page in WebView, 2...">
	//   43   85:invokestatic    #599 <Method void zzakb.v(String)>
		zzdt("about:blank");
	//   44   88:aload_0         
	//   45   89:ldc2            #603 <String "about:blank">
	//   46   92:invokespecial   #605 <Method void zzdt(String)>
		this;
	//   47   95:aload_0         
		JVM INSTR monitorexit ;
	//   48   96:monitorexit     
		return;
	//   49   97:return          
		Exception exception;
		exception;
	//   50   98:astore_2        
	//*  51   99:aload_0         
		throw exception;
	//   52  100:monitorexit     
	//   53  101:aload_2         
	//   54  102:athrow          
	}

	public final void evaluateJavascript(String s, ValueCallback valuecallback)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!isDestroyed())
			break MISSING_BLOCK_LABEL_29;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #348 <Method boolean isDestroyed()>
	//    4    6:ifeq            29
		zzakb.zzdm("#004 The webview is destroyed. Ignoring action.");
	//    5    9:ldc2            #353 <String "#004 The webview is destroyed. Ignoring action.">
	//    6   12:invokestatic    #608 <Method void zzakb.zzdm(String)>
		if(valuecallback == null)
			break MISSING_BLOCK_LABEL_26;
	//    7   15:aload_2         
	//    8   16:ifnull          26
		valuecallback.onReceiveValue(((Object) (null)));
	//    9   19:aload_2         
	//   10   20:aconst_null     
	//   11   21:invokeinterface #614 <Method void ValueCallback.onReceiveValue(Object)>
		this;
	//   12   26:aload_0         
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return;
	//   14   28:return          
		super.evaluateJavascript(s, valuecallback);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokespecial   #615 <Method void WebView.evaluateJavascript(String, ValueCallback)>
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return;
	//   21   37:return          
		s;
	//   22   38:astore_1        
	//*  23   39:aload_0         
		throw s;
	//   24   40:monitorexit     
	//   25   41:aload_1         
	//   26   42:athrow          
	}

	protected final void finalize()
		throws Throwable
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!zzddj)
	//*   2    2:aload_0         
	//*   3    3:getfield        #583 <Field boolean zzddj>
	//*   4    6:ifne            33
		{
			zzddf.reset();
	//    5    9:aload_0         
	//    6   10:getfield        #457 <Field zzaqx zzddf>
	//    7   13:invokevirtual   #581 <Method void zzaqx.reset()>
			zzbv.zzff();
	//    8   16:invokestatic    #587 <Method zzaqg zzbv.zzff()>
	//    9   19:pop             
			zzaqg.zzb(((zzapw) (this)));
	//   10   20:aload_0         
	//   11   21:invokestatic    #592 <Method boolean zzaqg.zzb(zzapw)>
	//   12   24:pop             
			zzvn();
	//   13   25:aload_0         
	//   14   26:invokespecial   #594 <Method void zzvn()>
			zzqf();
	//   15   29:aload_0         
	//   16   30:invokespecial   #619 <Method void zzqf()>
		}
		this;
	//   17   33:aload_0         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		((Object)this).finalize();
	//   19   35:aload_0         
	//   20   36:invokespecial   #623 <Method void Object.finalize()>
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
	//   29   47:invokespecial   #623 <Method void Object.finalize()>
		throw exception;
	//   30   50:aload_1         
	//   31   51:athrow          
	}

	public final android.view.View.OnClickListener getOnClickListener()
	{
		return (android.view.View.OnClickListener)zzddy.get();
	//    0    0:aload_0         
	//    1    1:getfield        #628 <Field WeakReference zzddy>
	//    2    4:invokevirtual   #634 <Method Object WeakReference.get()>
	//    3    7:checkcast       #636 <Class android.view.View$OnClickListener>
	//    4   10:areturn         
	}

	public final int getRequestedOrientation()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = zzddm;
	//    2    2:aload_0         
	//    3    3:getfield        #122 <Field int zzddm>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return i;
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

	public final boolean isDestroyed()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzddj;
	//    2    2:aload_0         
	//    3    3:getfield        #583 <Field boolean zzddj>
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

	public final void loadData(String s, String s1, String s2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isDestroyed())
			break MISSING_BLOCK_LABEL_19;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #348 <Method boolean isDestroyed()>
	//    4    6:ifne            19
		super.loadData(s, s1, s2);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #645 <Method void WebView.loadData(String, String, String)>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//   13   19:ldc2            #353 <String "#004 The webview is destroyed. Ignoring action.">
	//   14   22:invokestatic    #356 <Method void zzakb.zzdk(String)>
		this;
	//   15   25:aload_0         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		return;
	//   17   27:return          
		s;
	//   18   28:astore_1        
	//*  19   29:aload_0         
		throw s;
	//   20   30:monitorexit     
	//   21   31:aload_1         
	//   22   32:athrow          
	}

	public final void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(isDestroyed())
			break MISSING_BLOCK_LABEL_23;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #348 <Method boolean isDestroyed()>
	//    4    6:ifne            23
		super.loadDataWithBaseURL(s, s1, s2, s3, s4);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:aload           4
	//   10   15:aload           5
	//   11   17:invokespecial   #649 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return;
	//   14   22:return          
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//   15   23:ldc2            #353 <String "#004 The webview is destroyed. Ignoring action.">
	//   16   26:invokestatic    #356 <Method void zzakb.zzdk(String)>
		this;
	//   17   29:aload_0         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return;
	//   19   31:return          
		s;
	//   20   32:astore_1        
	//*  21   33:aload_0         
		throw s;
	//   22   34:monitorexit     
	//   23   35:aload_1         
	//   24   36:athrow          
	}

	public final void loadUrl(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = isDestroyed();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #348 <Method boolean isDestroyed()>
	//    4    6:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_40;
	//    5    7:iload_2         
	//    6    8:ifne            40
		super.loadUrl(s);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokespecial   #402 <Method void WebView.loadUrl(String)>
		this;
	//   10   16:aload_0         
		JVM INSTR monitorexit ;
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		s;
	//   13   19:astore_1        
		zzbv.zzeo().zza(((Throwable) (s)), "AdWebViewImpl.loadUrl");
	//   14   20:invokestatic    #325 <Method zzajm zzbv.zzeo()>
	//   15   23:aload_1         
	//   16   24:ldc2            #651 <String "AdWebViewImpl.loadUrl">
	//   17   27:invokevirtual   #407 <Method void zzajm.zza(Throwable, String)>
		com.google.android.gms.internal.ads.zzakb.zzc("Could not call loadUrl. ", ((Throwable) (s)));
	//   18   30:ldc2            #409 <String "Could not call loadUrl. ">
	//   19   33:aload_1         
	//   20   34:invokestatic    #411 <Method void com.google.android.gms.internal.ads.zzakb.zzc(String, Throwable)>
		this;
	//   21   37:aload_0         
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		return;
	//   23   39:return          
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//   24   40:ldc2            #353 <String "#004 The webview is destroyed. Ignoring action.">
	//   25   43:invokestatic    #356 <Method void zzakb.zzdk(String)>
		this;
	//   26   46:aload_0         
		JVM INSTR monitorexit ;
	//   27   47:monitorexit     
		return;
	//   28   48:return          
		s;
	//   29   49:astore_1        
	//*  30   50:aload_0         
		throw s;
	//   31   51:monitorexit     
	//   32   52:aload_1         
	//   33   53:athrow          
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
	//    3    3:invokespecial   #654 <Method void WebView.onAttachedToWindow()>
		if(!isDestroyed())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #348 <Method boolean isDestroyed()>
	//*   6   10:ifne            20
			zzaee.onAttachedToWindow();
	//    7   13:aload_0         
	//    8   14:getfield        #278 <Field zzamt zzaee>
	//    9   17:invokevirtual   #655 <Method void zzamt.onAttachedToWindow()>
		flag1 = zzddq;
	//   10   20:aload_0         
	//   11   21:getfield        #657 <Field boolean zzddq>
	//   12   24:istore_2        
		boolean flag = flag1;
	//   13   25:iload_2         
	//   14   26:istore_1        
		if((zzaqx)zzddf == null)
			break MISSING_BLOCK_LABEL_131;
	//   15   27:aload_0         
	//   16   28:getfield        #457 <Field zzaqx zzddf>
	//   17   31:checkcast       #459 <Class zzaqx>
	//   18   34:ifnull          131
		flag = flag1;
	//   19   37:iload_2         
	//   20   38:istore_1        
		Object obj;
		if(!((zzaqx)zzddf).zzuu())
			break MISSING_BLOCK_LABEL_131;
	//   21   39:aload_0         
	//   22   40:getfield        #457 <Field zzaqx zzddf>
	//   23   43:checkcast       #459 <Class zzaqx>
	//   24   46:invokevirtual   #465 <Method boolean zzaqx.zzuu()>
	//   25   49:ifeq            131
		if(zzddr)
			break MISSING_BLOCK_LABEL_124;
	//   26   52:aload_0         
	//   27   53:getfield        #659 <Field boolean zzddr>
	//   28   56:ifne            124
		obj = ((Object) (((zzaqx)zzddf).zzuv()));
	//   29   59:aload_0         
	//   30   60:getfield        #457 <Field zzaqx zzddf>
	//   31   63:checkcast       #459 <Class zzaqx>
	//   32   66:invokevirtual   #663 <Method android.view.ViewTreeObserver$OnGlobalLayoutListener zzaqx.zzuv()>
	//   33   69:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_89;
	//   34   70:aload_3         
	//   35   71:ifnull          89
		zzbv.zzfg();
	//   36   74:invokestatic    #667 <Method zzaor zzbv.zzfg()>
	//   37   77:pop             
		if(this != null)
			break MISSING_BLOCK_LABEL_84;
	//   38   78:aload_0         
	//   39   79:ifnonnull       84
		throw null;
	//   40   82:aconst_null     
	//   41   83:athrow          
		zzaor.zza(((View) (this)), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (obj)));
	//   42   84:aload_0         
	//   43   85:aload_3         
	//   44   86:invokestatic    #672 <Method void zzaor.zza(View, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		obj = ((Object) (((zzaqx)zzddf).zzuw()));
	//   45   89:aload_0         
	//   46   90:getfield        #457 <Field zzaqx zzddf>
	//   47   93:checkcast       #459 <Class zzaqx>
	//   48   96:invokevirtual   #676 <Method android.view.ViewTreeObserver$OnScrollChangedListener zzaqx.zzuw()>
	//   49   99:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_119;
	//   50  100:aload_3         
	//   51  101:ifnull          119
		zzbv.zzfg();
	//   52  104:invokestatic    #667 <Method zzaor zzbv.zzfg()>
	//   53  107:pop             
		if(this != null)
			break MISSING_BLOCK_LABEL_114;
	//   54  108:aload_0         
	//   55  109:ifnonnull       114
		throw null;
	//   56  112:aconst_null     
	//   57  113:athrow          
		zzaor.zza(((View) (this)), ((android.view.ViewTreeObserver.OnScrollChangedListener) (obj)));
	//   58  114:aload_0         
	//   59  115:aload_3         
	//   60  116:invokestatic    #679 <Method void zzaor.zza(View, android.view.ViewTreeObserver$OnScrollChangedListener)>
		zzddr = true;
	//   61  119:aload_0         
	//   62  120:iconst_1        
	//   63  121:putfield        #659 <Field boolean zzddr>
		zzvh();
	//   64  124:aload_0         
	//   65  125:invokespecial   #681 <Method boolean zzvh()>
	//   66  128:pop             
		flag = true;
	//   67  129:iconst_1        
	//   68  130:istore_1        
		zzal(flag);
	//   69  131:aload_0         
	//   70  132:iload_1         
	//   71  133:invokespecial   #683 <Method void zzal(boolean)>
		this;
	//   72  136:aload_0         
		JVM INSTR monitorexit ;
	//   73  137:monitorexit     
		return;
	//   74  138:return          
		Exception exception;
		exception;
	//   75  139:astore_3        
	//*  76  140:aload_0         
		throw exception;
	//   77  141:monitorexit     
	//   78  142:aload_3         
	//   79  143:athrow          
	}

	protected final void onDetachedFromWindow()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj;
		if(!isDestroyed())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #348 <Method boolean isDestroyed()>
	//*   4    6:ifne            16
			zzaee.onDetachedFromWindow();
	//    5    9:aload_0         
	//    6   10:getfield        #278 <Field zzamt zzaee>
	//    7   13:invokevirtual   #686 <Method void zzamt.onDetachedFromWindow()>
		super.onDetachedFromWindow();
	//    8   16:aload_0         
	//    9   17:invokespecial   #687 <Method void WebView.onDetachedFromWindow()>
		if(!zzddr || (zzaqx)zzddf == null || !((zzaqx)zzddf).zzuu() || getViewTreeObserver() == null || !getViewTreeObserver().isAlive())
			break MISSING_BLOCK_LABEL_121;
	//   10   20:aload_0         
	//   11   21:getfield        #659 <Field boolean zzddr>
	//   12   24:ifeq            121
	//   13   27:aload_0         
	//   14   28:getfield        #457 <Field zzaqx zzddf>
	//   15   31:checkcast       #459 <Class zzaqx>
	//   16   34:ifnull          121
	//   17   37:aload_0         
	//   18   38:getfield        #457 <Field zzaqx zzddf>
	//   19   41:checkcast       #459 <Class zzaqx>
	//   20   44:invokevirtual   #465 <Method boolean zzaqx.zzuu()>
	//   21   47:ifeq            121
	//   22   50:aload_0         
	//   23   51:invokevirtual   #691 <Method ViewTreeObserver getViewTreeObserver()>
	//   24   54:ifnull          121
	//   25   57:aload_0         
	//   26   58:invokevirtual   #691 <Method ViewTreeObserver getViewTreeObserver()>
	//   27   61:invokevirtual   #696 <Method boolean ViewTreeObserver.isAlive()>
	//   28   64:ifeq            121
		obj = ((Object) (((zzaqx)zzddf).zzuv()));
	//   29   67:aload_0         
	//   30   68:getfield        #457 <Field zzaqx zzddf>
	//   31   71:checkcast       #459 <Class zzaqx>
	//   32   74:invokevirtual   #663 <Method android.view.ViewTreeObserver$OnGlobalLayoutListener zzaqx.zzuv()>
	//   33   77:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_93;
	//   34   78:aload_1         
	//   35   79:ifnull          93
		zzbv.zzem().zza(getViewTreeObserver(), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (obj)));
	//   36   82:invokestatic    #223 <Method zzakq zzbv.zzem()>
	//   37   85:aload_0         
	//   38   86:invokevirtual   #691 <Method ViewTreeObserver getViewTreeObserver()>
	//   39   89:aload_1         
	//   40   90:invokevirtual   #699 <Method void zzakq.zza(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		obj = ((Object) (((zzaqx)zzddf).zzuw()));
	//   41   93:aload_0         
	//   42   94:getfield        #457 <Field zzaqx zzddf>
	//   43   97:checkcast       #459 <Class zzaqx>
	//   44  100:invokevirtual   #676 <Method android.view.ViewTreeObserver$OnScrollChangedListener zzaqx.zzuw()>
	//   45  103:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_116;
	//   46  104:aload_1         
	//   47  105:ifnull          116
		getViewTreeObserver().removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (obj)));
	//   48  108:aload_0         
	//   49  109:invokevirtual   #691 <Method ViewTreeObserver getViewTreeObserver()>
	//   50  112:aload_1         
	//   51  113:invokevirtual   #703 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
		zzddr = false;
	//   52  116:aload_0         
	//   53  117:iconst_0        
	//   54  118:putfield        #659 <Field boolean zzddr>
		this;
	//   55  121:aload_0         
		JVM INSTR monitorexit ;
	//   56  122:monitorexit     
		zzal(false);
	//   57  123:aload_0         
	//   58  124:iconst_0        
	//   59  125:invokespecial   #683 <Method void zzal(boolean)>
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

	public final void onDownloadStart(String s, String s1, String s2, String s3, long l)
	{
		try
		{
			s1 = ((String) (new Intent("android.intent.action.VIEW")));
	//    0    0:new             #709 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #711 <String "android.intent.action.VIEW">
	//    3    7:invokespecial   #712 <Method void Intent(String)>
	//    4   10:astore_2        
			((Intent) (s1)).setDataAndType(Uri.parse(s), s3);
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokestatic    #718 <Method Uri Uri.parse(String)>
	//    8   16:aload           4
	//    9   18:invokevirtual   #722 <Method Intent Intent.setDataAndType(Uri, String)>
	//   10   21:pop             
			zzbv.zzek();
	//   11   22:invokestatic    #152 <Method zzakk zzbv.zzek()>
	//   12   25:pop             
			zzakk.zza(getContext(), ((Intent) (s1)));
	//   13   26:aload_0         
	//   14   27:invokevirtual   #134 <Method Context getContext()>
	//   15   30:aload_2         
	//   16   31:invokestatic    #725 <Method void zzakk.zza(Context, Intent)>
			return;
	//   17   34:return          
		}
	//*  18   35:new             #727 <Class StringBuilder>
	//*  19   38:dup             
	//*  20   39:bipush          51
	//*  21   41:aload_1         
	//*  22   42:invokestatic    #435 <Method String String.valueOf(Object)>
	//*  23   45:invokevirtual   #439 <Method int String.length()>
	//*  24   48:iadd            
	//*  25   49:aload           4
	//*  26   51:invokestatic    #435 <Method String String.valueOf(Object)>
	//*  27   54:invokevirtual   #439 <Method int String.length()>
	//*  28   57:iadd            
	//*  29   58:invokespecial   #729 <Method void StringBuilder(int)>
	//*  30   61:astore_2        
	//*  31   62:aload_2         
	//*  32   63:ldc2            #731 <String "Couldn't find an Activity to view url/mimetype: ">
	//*  33   66:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//*  34   69:pop             
	//*  35   70:aload_2         
	//*  36   71:aload_1         
	//*  37   72:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//*  38   75:pop             
	//*  39   76:aload_2         
	//*  40   77:ldc2            #737 <String " / ">
	//*  41   80:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//*  42   83:pop             
	//*  43   84:aload_2         
	//*  44   85:aload           4
	//*  45   87:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//*  46   90:pop             
	//*  47   91:aload_2         
	//*  48   92:invokevirtual   #741 <Method String StringBuilder.toString()>
	//*  49   95:invokestatic    #534 <Method void zzakb.zzck(String)>
	//*  50   98:return          
		// Misplaced declaration of an exception variable
		catch(String s1)
		{
			s1 = ((String) (new StringBuilder(51 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s3))).length())));
		}
		((StringBuilder) (s1)).append("Couldn't find an Activity to view url/mimetype: ");
		((StringBuilder) (s1)).append(s);
		((StringBuilder) (s1)).append(" / ");
		((StringBuilder) (s1)).append(s3);
		zzakb.zzck(((StringBuilder) (s1)).toString());
	//*  51   99:astore_2        
	//*  52  100:goto            35
	}

	protected final void onDraw(Canvas canvas)
	{
		if(isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #348 <Method boolean isDestroyed()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(android.os.Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow())
	//*   4    8:getstatic       #208 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmpne          31
	//*   7   16:aload_1         
	//*   8   17:invokevirtual   #749 <Method boolean Canvas.isHardwareAccelerated()>
	//*   9   20:ifeq            31
	//*  10   23:aload_0         
	//*  11   24:invokevirtual   #752 <Method boolean isAttachedToWindow()>
	//*  12   27:ifne            31
			return;
	//   13   30:return          
		super.onDraw(canvas);
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:invokespecial   #754 <Method void WebView.onDraw(Canvas)>
		if((zzaqx)zzddf != null && ((zzaqx)zzddf).zzve() != null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #457 <Field zzaqx zzddf>
	//*  19   40:checkcast       #459 <Class zzaqx>
	//*  20   43:ifnull          74
	//*  21   46:aload_0         
	//*  22   47:getfield        #457 <Field zzaqx zzddf>
	//*  23   50:checkcast       #459 <Class zzaqx>
	//*  24   53:invokevirtual   #758 <Method zzasg zzaqx.zzve()>
	//*  25   56:ifnull          74
			((zzaqx)zzddf).zzve().zzda();
	//   26   59:aload_0         
	//   27   60:getfield        #457 <Field zzaqx zzddf>
	//   28   63:checkcast       #459 <Class zzaqx>
	//   29   66:invokevirtual   #758 <Method zzasg zzaqx.zzve()>
	//   30   69:invokeinterface #763 <Method void zzasg.zzda()>
	//   31   74:return          
	}

	public final boolean onGenericMotionEvent(MotionEvent motionevent)
	{
		zzna zzna = zznk.zzaxx;
	//    0    0:getstatic       #771 <Field zzna zznk.zzaxx>
	//    1    3:astore          4
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    5:invokestatic    #775 <Method zzni zzkb.zzik()>
	//*   3    8:aload           4
	//*   4   10:invokevirtual   #781 <Method Object com.google.android.gms.internal.ads.zzni.zzd(zzna)>
	//*   5   13:checkcast       #424 <Class Boolean>
	//*   6   16:invokevirtual   #427 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            103
		{
			float f = motionevent.getAxisValue(9);
	//    8   22:aload_1         
	//    9   23:bipush          9
	//   10   25:invokevirtual   #787 <Method float MotionEvent.getAxisValue(int)>
	//   11   28:fstore_2        
			float f1 = motionevent.getAxisValue(10);
	//   12   29:aload_1         
	//   13   30:bipush          10
	//   14   32:invokevirtual   #787 <Method float MotionEvent.getAxisValue(int)>
	//   15   35:fstore_3        
			if(motionevent.getActionMasked() == 8 && (f > 0.0F && !canScrollVertically(-1) || f < 0.0F && !canScrollVertically(1) || f1 > 0.0F && !canScrollHorizontally(-1) || f1 < 0.0F && !canScrollHorizontally(1)))
	//*  16   36:aload_1         
	//*  17   37:invokevirtual   #790 <Method int MotionEvent.getActionMasked()>
	//*  18   40:bipush          8
	//*  19   42:icmpne          103
	//*  20   45:fload_2         
	//*  21   46:fconst_0        
	//*  22   47:fcmpl           
	//*  23   48:ifle            59
	//*  24   51:aload_0         
	//*  25   52:iconst_m1       
	//*  26   53:invokevirtual   #794 <Method boolean canScrollVertically(int)>
	//*  27   56:ifeq            101
	//*  28   59:fload_2         
	//*  29   60:fconst_0        
	//*  30   61:fcmpg           
	//*  31   62:ifge            73
	//*  32   65:aload_0         
	//*  33   66:iconst_1        
	//*  34   67:invokevirtual   #794 <Method boolean canScrollVertically(int)>
	//*  35   70:ifeq            101
	//*  36   73:fload_3         
	//*  37   74:fconst_0        
	//*  38   75:fcmpl           
	//*  39   76:ifle            87
	//*  40   79:aload_0         
	//*  41   80:iconst_m1       
	//*  42   81:invokevirtual   #797 <Method boolean canScrollHorizontally(int)>
	//*  43   84:ifeq            101
	//*  44   87:fload_3         
	//*  45   88:fconst_0        
	//*  46   89:fcmpg           
	//*  47   90:ifge            103
	//*  48   93:aload_0         
	//*  49   94:iconst_1        
	//*  50   95:invokevirtual   #797 <Method boolean canScrollHorizontally(int)>
	//*  51   98:ifne            103
				return false;
	//   52  101:iconst_0        
	//   53  102:ireturn         
		}
		return super.onGenericMotionEvent(motionevent);
	//   54  103:aload_0         
	//   55  104:aload_1         
	//   56  105:invokespecial   #799 <Method boolean WebView.onGenericMotionEvent(MotionEvent)>
	//   57  108:ireturn         
	}

	public final void onGlobalLayout()
	{
		boolean flag = zzvh();
	//    0    0:aload_0         
	//    1    1:invokespecial   #681 <Method boolean zzvh()>
	//    2    4:istore_1        
		zzd zzd1 = zzub();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #804 <Method zzd zzub()>
	//    5    9:astore_2        
		if(zzd1 != null && flag)
	//*   6   10:aload_2         
	//*   7   11:ifnull          22
	//*   8   14:iload_1         
	//*   9   15:ifeq            22
			zzd1.zznn();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #807 <Method void zzd.zznn()>
	//   12   22:return          
	}

	protected final void onMeasure(int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!isDestroyed())
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #348 <Method boolean isDestroyed()>
	//    4    6:ifeq            18
		setMeasuredDimension(0, 0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #814 <Method void setMeasuredDimension(int, int)>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		if(!isInEditMode() && !zzddk && !zzddh.zzvt()) goto _L2; else goto _L1
	//   12   18:aload_0         
	//   13   19:invokevirtual   #817 <Method boolean isInEditMode()>
	//   14   22:ifne            773
	//   15   25:aload_0         
	//   16   26:getfield        #120 <Field boolean zzddk>
	//   17   29:ifne            773
	//   18   32:aload_0         
	//   19   33:getfield        #116 <Field zzasi zzddh>
	//   20   36:invokevirtual   #820 <Method boolean zzasi.zzvt()>
	//   21   39:ifeq            45
	//*  22   42:goto            773
_L2:
		if(!zzddh.zzvu()) goto _L4; else goto _L3
	//   23   45:aload_0         
	//   24   46:getfield        #116 <Field zzasi zzddh>
	//   25   49:invokevirtual   #823 <Method boolean zzasi.zzvu()>
	//   26   52:ifeq            220
_L3:
		zzarl zzarl1 = zztm();
	//   27   55:aload_0         
	//   28   56:invokevirtual   #827 <Method zzarl zztm()>
	//   29   59:astore          10
		if(zzarl1 == null) goto _L6; else goto _L5
	//   30   61:aload           10
	//   31   63:ifnull          789
_L5:
		float f = zzarl1.getAspectRatio();
	//   32   66:aload           10
	//   33   68:invokevirtual   #833 <Method float zzarl.getAspectRatio()>
	//   34   71:fstore_3        
	//*  35   72:goto            75
_L10:
		if(f != 0.0F)
			break MISSING_BLOCK_LABEL_90;
	//   36   75:fload_3         
	//   37   76:fconst_0        
	//   38   77:fcmpl           
	//   39   78:ifne            90
		super.onMeasure(i, j);
	//   40   81:aload_0         
	//   41   82:iload_1         
	//   42   83:iload_2         
	//   43   84:invokespecial   #835 <Method void WebView.onMeasure(int, int)>
		this;
	//   44   87:aload_0         
		JVM INSTR monitorexit ;
	//   45   88:monitorexit     
		return;
	//   46   89:return          
		int l1;
		int i2;
		l1 = android.view.View.MeasureSpec.getSize(i);
	//   47   90:iload_1         
	//   48   91:invokestatic    #841 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   49   94:istore          8
		i2 = android.view.View.MeasureSpec.getSize(j);
	//   50   96:iload_2         
	//   51   97:invokestatic    #841 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   52  100:istore          9
		i = (int)((float)i2 * f);
	//   53  102:iload           9
	//   54  104:i2f             
	//   55  105:fload_3         
	//   56  106:fmul            
	//   57  107:f2i             
	//   58  108:istore_1        
		j = (int)((float)l1 / f);
	//   59  109:iload           8
	//   60  111:i2f             
	//   61  112:fload_3         
	//   62  113:fdiv            
	//   63  114:f2i             
	//   64  115:istore_2        
		int k;
		int i1;
		int j1;
		int k1;
		if(i2 == 0 && j != 0)
	//*  65  116:iload           9
	//*  66  118:ifne            145
	//*  67  121:iload_2         
	//*  68  122:ifeq            145
		{
			j1 = (int)((float)j * f);
	//   69  125:iload_2         
	//   70  126:i2f             
	//   71  127:fload_3         
	//   72  128:fmul            
	//   73  129:f2i             
	//   74  130:istore          6
			i1 = j;
	//   75  132:iload_2         
	//   76  133:istore          5
			k1 = j;
	//   77  135:iload_2         
	//   78  136:istore          7
			k = l1;
	//   79  138:iload           8
	//   80  140:istore          4
			break MISSING_BLOCK_LABEL_199;
	//   81  142:goto            199
		}
		j1 = i;
	//   82  145:iload_1         
	//   83  146:istore          6
		k1 = j;
	//   84  148:iload_2         
	//   85  149:istore          7
		k = l1;
	//   86  151:iload           8
	//   87  153:istore          4
		i1 = i2;
	//   88  155:iload           9
	//   89  157:istore          5
		if(l1 != 0)
			break MISSING_BLOCK_LABEL_199;
	//   90  159:iload           8
	//   91  161:ifne            199
		j1 = i;
	//   92  164:iload_1         
	//   93  165:istore          6
		k1 = j;
	//   94  167:iload_2         
	//   95  168:istore          7
		k = l1;
	//   96  170:iload           8
	//   97  172:istore          4
		i1 = i2;
	//   98  174:iload           9
	//   99  176:istore          5
		if(i == 0)
			break MISSING_BLOCK_LABEL_199;
	//  100  178:iload_1         
	//  101  179:ifeq            199
		k1 = (int)((float)i / f);
	//  102  182:iload_1         
	//  103  183:i2f             
	//  104  184:fload_3         
	//  105  185:fdiv            
	//  106  186:f2i             
	//  107  187:istore          7
		k = i;
	//  108  189:iload_1         
	//  109  190:istore          4
		i1 = i2;
	//  110  192:iload           9
	//  111  194:istore          5
		j1 = i;
	//  112  196:iload_1         
	//  113  197:istore          6
		setMeasuredDimension(Math.min(j1, k), Math.min(k1, i1));
	//  114  199:aload_0         
	//  115  200:iload           6
	//  116  202:iload           4
	//  117  204:invokestatic    #847 <Method int Math.min(int, int)>
	//  118  207:iload           7
	//  119  209:iload           5
	//  120  211:invokestatic    #847 <Method int Math.min(int, int)>
	//  121  214:invokevirtual   #814 <Method void setMeasuredDimension(int, int)>
		this;
	//  122  217:aload_0         
		JVM INSTR monitorexit ;
	//  123  218:monitorexit     
		return;
	//  124  219:return          
_L4:
		if(!zzddh.isFluid())
			break MISSING_BLOCK_LABEL_341;
	//  125  220:aload_0         
	//  126  221:getfield        #116 <Field zzasi zzddh>
	//  127  224:invokevirtual   #850 <Method boolean zzasi.isFluid()>
	//  128  227:ifeq            341
		zzna zzna = zznk.zzbch;
	//  129  230:getstatic       #853 <Field zzna zznk.zzbch>
	//  130  233:astore          10
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() || !PlatformVersion.isAtLeastJellyBeanMR1())
	//* 131  235:invokestatic    #775 <Method zzni zzkb.zzik()>
	//* 132  238:aload           10
	//* 133  240:invokevirtual   #781 <Method Object com.google.android.gms.internal.ads.zzni.zzd(zzna)>
	//* 134  243:checkcast       #424 <Class Boolean>
	//* 135  246:invokevirtual   #427 <Method boolean Boolean.booleanValue()>
	//* 136  249:ifne            332
	//* 137  252:invokestatic    #242 <Method boolean PlatformVersion.isAtLeastJellyBeanMR1()>
	//* 138  255:ifne            261
			break MISSING_BLOCK_LABEL_332;
	//  139  258:goto            332
		zza("/contentHeight", ((zzv) (new zzarj(this))));
	//  140  261:aload_0         
	//  141  262:ldc2            #855 <String "/contentHeight">
	//  142  265:new             #857 <Class zzarj>
	//  143  268:dup             
	//  144  269:aload_0         
	//  145  270:invokespecial   #859 <Method void zzarj(zzari)>
	//  146  273:invokevirtual   #862 <Method void zza(String, zzv)>
		zzdu("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
	//  147  276:aload_0         
	//  148  277:ldc2            #864 <String "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();">
	//  149  280:invokespecial   #866 <Method void zzdu(String)>
		f = zzagj.density;
	//  150  283:aload_0         
	//  151  284:getfield        #160 <Field DisplayMetrics zzagj>
	//  152  287:getfield        #165 <Field float DisplayMetrics.density>
	//  153  290:fstore_3        
		k = android.view.View.MeasureSpec.getSize(i);
	//  154  291:iload_1         
	//  155  292:invokestatic    #841 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  156  295:istore          4
		if(zzddu != -1)
	//* 157  297:aload_0         
	//* 158  298:getfield        #336 <Field int zzddu>
	//* 159  301:iconst_m1       
	//* 160  302:icmpeq          317
		{
			i = (int)((float)zzddu * f);
	//  161  305:aload_0         
	//  162  306:getfield        #336 <Field int zzddu>
	//  163  309:i2f             
	//  164  310:fload_3         
	//  165  311:fmul            
	//  166  312:f2i             
	//  167  313:istore_1        
			break MISSING_BLOCK_LABEL_322;
	//  168  314:goto            322
		}
		i = android.view.View.MeasureSpec.getSize(j);
	//  169  317:iload_2         
	//  170  318:invokestatic    #841 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  171  321:istore_1        
		setMeasuredDimension(k, i);
	//  172  322:aload_0         
	//  173  323:iload           4
	//  174  325:iload_1         
	//  175  326:invokevirtual   #814 <Method void setMeasuredDimension(int, int)>
		this;
	//  176  329:aload_0         
		JVM INSTR monitorexit ;
	//  177  330:monitorexit     
		return;
	//  178  331:return          
		super.onMeasure(i, j);
	//  179  332:aload_0         
	//  180  333:iload_1         
	//  181  334:iload_2         
	//  182  335:invokespecial   #835 <Method void WebView.onMeasure(int, int)>
		this;
	//  183  338:aload_0         
		JVM INSTR monitorexit ;
	//  184  339:monitorexit     
		return;
	//  185  340:return          
		if(!zzddh.zzvs())
			break MISSING_BLOCK_LABEL_372;
	//  186  341:aload_0         
	//  187  342:getfield        #116 <Field zzasi zzddh>
	//  188  345:invokevirtual   #529 <Method boolean zzasi.zzvs()>
	//  189  348:ifeq            372
		setMeasuredDimension(zzagj.widthPixels, zzagj.heightPixels);
	//  190  351:aload_0         
	//  191  352:aload_0         
	//  192  353:getfield        #160 <Field DisplayMetrics zzagj>
	//  193  356:getfield        #474 <Field int DisplayMetrics.widthPixels>
	//  194  359:aload_0         
	//  195  360:getfield        #160 <Field DisplayMetrics zzagj>
	//  196  363:getfield        #482 <Field int DisplayMetrics.heightPixels>
	//  197  366:invokevirtual   #814 <Method void setMeasuredDimension(int, int)>
		this;
	//  198  369:aload_0         
		JVM INSTR monitorexit ;
	//  199  370:monitorexit     
		return;
	//  200  371:return          
		k1 = android.view.View.MeasureSpec.getMode(i);
	//  201  372:iload_1         
	//  202  373:invokestatic    #869 <Method int android.view.View$MeasureSpec.getMode(int)>
	//  203  376:istore          7
		i1 = android.view.View.MeasureSpec.getSize(i);
	//  204  378:iload_1         
	//  205  379:invokestatic    #841 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  206  382:istore          5
		i = android.view.View.MeasureSpec.getMode(j);
	//  207  384:iload_2         
	//  208  385:invokestatic    #869 <Method int android.view.View$MeasureSpec.getMode(int)>
	//  209  388:istore_1        
		j1 = android.view.View.MeasureSpec.getSize(j);
	//  210  389:iload_2         
	//  211  390:invokestatic    #841 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  212  393:istore          6
		break MISSING_BLOCK_LABEL_395;
	//* 213  395:ldc2            #870 <Int 0x7fffffff>
	//* 214  398:istore          4
	//* 215  400:iload           7
	//* 216  402:ldc2            #871 <Int 0x80000000>
	//* 217  405:icmpeq          801
	//* 218  408:iload           7
	//* 219  410:ldc2            #872 <Int 0x40000000>
	//* 220  413:icmpne          794
	//* 221  416:goto            801
_L11:
		if(zzddh.widthPixels <= j && zzddh.heightPixels <= l)
	//* 222  419:aload_0         
	//* 223  420:getfield        #116 <Field zzasi zzddh>
	//* 224  423:getfield        #873 <Field int zzasi.widthPixels>
	//* 225  426:iload_2         
	//* 226  427:icmpgt          830
	//* 227  430:aload_0         
	//* 228  431:getfield        #116 <Field zzasi zzddh>
	//* 229  434:getfield        #874 <Field int zzasi.heightPixels>
	//* 230  437:iload           4
	//* 231  439:icmple          825
	//* 232  442:goto            830
	//* 233  445:getstatic       #877 <Field zzna zznk.zzbfe>
	//* 234  448:astore          10
	//* 235  450:invokestatic    #775 <Method zzni zzkb.zzik()>
	//* 236  453:aload           10
	//* 237  455:invokevirtual   #781 <Method Object com.google.android.gms.internal.ads.zzni.zzd(zzna)>
	//* 238  458:checkcast       #424 <Class Boolean>
	//* 239  461:invokevirtual   #427 <Method boolean Boolean.booleanValue()>
	//* 240  464:ifeq            844
	//* 241  467:aload_0         
	//* 242  468:getfield        #116 <Field zzasi zzddh>
	//* 243  471:getfield        #873 <Field int zzasi.widthPixels>
	//* 244  474:i2f             
	//* 245  475:aload_0         
	//* 246  476:getfield        #167 <Field float zzddc>
	//* 247  479:fdiv            
	//* 248  480:iload_2         
	//* 249  481:i2f             
	//* 250  482:aload_0         
	//* 251  483:getfield        #167 <Field float zzddc>
	//* 252  486:fdiv            
	//* 253  487:fcmpl           
	//* 254  488:ifgt            835
	//* 255  491:aload_0         
	//* 256  492:getfield        #116 <Field zzasi zzddh>
	//* 257  495:getfield        #874 <Field int zzasi.heightPixels>
	//* 258  498:i2f             
	//* 259  499:aload_0         
	//* 260  500:getfield        #167 <Field float zzddc>
	//* 261  503:fdiv            
	//* 262  504:iload           4
	//* 263  506:i2f             
	//* 264  507:aload_0         
	//* 265  508:getfield        #167 <Field float zzddc>
	//* 266  511:fdiv            
	//* 267  512:fcmpl           
	//* 268  513:ifgt            835
	//* 269  516:iconst_1        
	//* 270  517:istore_2        
	//* 271  518:goto            837
	//* 272  521:iload_2         
	//* 273  522:ifeq            716
	//* 274  525:aload_0         
	//* 275  526:getfield        #116 <Field zzasi zzddh>
	//* 276  529:getfield        #873 <Field int zzasi.widthPixels>
	//* 277  532:i2f             
	//* 278  533:aload_0         
	//* 279  534:getfield        #167 <Field float zzddc>
	//* 280  537:fdiv            
	//* 281  538:f2i             
	//* 282  539:istore_1        
	//* 283  540:aload_0         
	//* 284  541:getfield        #116 <Field zzasi zzddh>
	//* 285  544:getfield        #874 <Field int zzasi.heightPixels>
	//* 286  547:i2f             
	//* 287  548:aload_0         
	//* 288  549:getfield        #167 <Field float zzddc>
	//* 289  552:fdiv            
	//* 290  553:f2i             
	//* 291  554:istore_2        
	//* 292  555:iload           5
	//* 293  557:i2f             
	//* 294  558:aload_0         
	//* 295  559:getfield        #167 <Field float zzddc>
	//* 296  562:fdiv            
	//* 297  563:f2i             
	//* 298  564:istore          4
	//* 299  566:iload           6
	//* 300  568:i2f             
	//* 301  569:aload_0         
	//* 302  570:getfield        #167 <Field float zzddc>
	//* 303  573:fdiv            
	//* 304  574:f2i             
	//* 305  575:istore          5
	//* 306  577:new             #727 <Class StringBuilder>
	//* 307  580:dup             
	//* 308  581:bipush          103
	//* 309  583:invokespecial   #729 <Method void StringBuilder(int)>
	//* 310  586:astore          10
	//* 311  588:aload           10
	//* 312  590:ldc2            #879 <String "Not enough space to show ad. Needs ">
	//* 313  593:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//* 314  596:pop             
	//* 315  597:aload           10
	//* 316  599:iload_1         
	//* 317  600:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 318  603:pop             
	//* 319  604:aload           10
	//* 320  606:ldc2            #884 <String "x">
	//* 321  609:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//* 322  612:pop             
	//* 323  613:aload           10
	//* 324  615:iload_2         
	//* 325  616:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 326  619:pop             
	//* 327  620:aload           10
	//* 328  622:ldc2            #886 <String " dp, but only has ">
	//* 329  625:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//* 330  628:pop             
	//* 331  629:aload           10
	//* 332  631:iload           4
	//* 333  633:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 334  636:pop             
	//* 335  637:aload           10
	//* 336  639:ldc2            #884 <String "x">
	//* 337  642:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//* 338  645:pop             
	//* 339  646:aload           10
	//* 340  648:iload           5
	//* 341  650:invokevirtual   #882 <Method StringBuilder StringBuilder.append(int)>
	//* 342  653:pop             
	//* 343  654:aload           10
	//* 344  656:ldc2            #888 <String " dp.">
	//* 345  659:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//* 346  662:pop             
	//* 347  663:aload           10
	//* 348  665:invokevirtual   #741 <Method String StringBuilder.toString()>
	//* 349  668:invokestatic    #356 <Method void zzakb.zzdk(String)>
	//* 350  671:aload_0         
	//* 351  672:invokevirtual   #891 <Method int getVisibility()>
	//* 352  675:bipush          8
	//* 353  677:icmpeq          685
	//* 354  680:aload_0         
	//* 355  681:iconst_4        
	//* 356  682:invokevirtual   #894 <Method void setVisibility(int)>
	//* 357  685:aload_0         
	//* 358  686:iconst_0        
	//* 359  687:iconst_0        
	//* 360  688:invokevirtual   #814 <Method void setMeasuredDimension(int, int)>
	//* 361  691:aload_0         
	//* 362  692:getfield        #94  <Field boolean zzddd>
	//* 363  695:ifne            770
	//* 364  698:aload_0         
	//* 365  699:getfield        #169 <Field zzhs zzcch>
	//* 366  702:getstatic       #900 <Field zzhu$zza$zzb zzhu$zza$zzb.zzalj>
	//* 367  705:invokevirtual   #905 <Method void zzhs.zza(zzhu$zza$zzb)>
	//* 368  708:aload_0         
	//* 369  709:iconst_1        
	//* 370  710:putfield        #94  <Field boolean zzddd>
	//* 371  713:aload_0         
	//* 372  714:monitorexit     
	//* 373  715:return          
	//* 374  716:aload_0         
	//* 375  717:invokevirtual   #891 <Method int getVisibility()>
	//* 376  720:bipush          8
	//* 377  722:icmpeq          730
	//* 378  725:aload_0         
	//* 379  726:iconst_0        
	//* 380  727:invokevirtual   #894 <Method void setVisibility(int)>
	//* 381  730:aload_0         
	//* 382  731:getfield        #96  <Field boolean zzdde>
	//* 383  734:ifne            752
	//* 384  737:aload_0         
	//* 385  738:getfield        #169 <Field zzhs zzcch>
	//* 386  741:getstatic       #908 <Field zzhu$zza$zzb zzhu$zza$zzb.zzalk>
	//* 387  744:invokevirtual   #905 <Method void zzhs.zza(zzhu$zza$zzb)>
	//* 388  747:aload_0         
	//* 389  748:iconst_1        
	//* 390  749:putfield        #96  <Field boolean zzdde>
	//* 391  752:aload_0         
	//* 392  753:aload_0         
	//* 393  754:getfield        #116 <Field zzasi zzddh>
	//* 394  757:getfield        #873 <Field int zzasi.widthPixels>
	//* 395  760:aload_0         
	//* 396  761:getfield        #116 <Field zzasi zzddh>
	//* 397  764:getfield        #874 <Field int zzasi.heightPixels>
	//* 398  767:invokevirtual   #814 <Method void setMeasuredDimension(int, int)>
	//* 399  770:aload_0         
	//* 400  771:monitorexit     
	//* 401  772:return          
	//* 402  773:aload_0         
	//* 403  774:iload_1         
	//* 404  775:iload_2         
	//* 405  776:invokespecial   #835 <Method void WebView.onMeasure(int, int)>
	//* 406  779:aload_0         
	//* 407  780:monitorexit     
	//* 408  781:return          
	//* 409  782:astore          10
	//* 410  784:aload_0         
	//* 411  785:monitorexit     
	//* 412  786:aload           10
	//* 413  788:athrow          
	//* 414  789:fconst_0        
	//* 415  790:fstore_3        
	//* 416  791:goto            75
	//* 417  794:ldc2            #870 <Int 0x7fffffff>
	//* 418  797:istore_2        
	//* 419  798:goto            804
	//* 420  801:iload           5
	//* 421  803:istore_2        
	//* 422  804:iload_1         
	//* 423  805:ldc2            #871 <Int 0x80000000>
	//* 424  808:icmpeq          818
	//* 425  811:iload_1         
	//* 426  812:ldc2            #872 <Int 0x40000000>
	//* 427  815:icmpne          419
	//* 428  818:iload           6
	//* 429  820:istore          4
	//* 430  822:goto            419
			i = 0;
	//  431  825:iconst_0        
	//  432  826:istore_1        
		else
	//* 433  827:goto            445
			i = 1;
	//  434  830:iconst_1        
	//  435  831:istore_1        
		zzna1 = zznk.zzbfe;
		if(!((Boolean)zzkb.zzik().zzd(zzna1)).booleanValue()) goto _L8; else goto _L7
_L7:
		if((float)zzddh.widthPixels / zzddc <= (float)j / zzddc && (float)zzddh.heightPixels / zzddc <= (float)l / zzddc)
			j = 1;
		else
	//* 436  832:goto            445
			j = 0;
	//  437  835:iconst_0        
	//  438  836:istore_2        
		  goto _L9
_L12:
		if(j == 0)
			break MISSING_BLOCK_LABEL_716;
		i = (int)((float)zzddh.widthPixels / zzddc);
		j = (int)((float)zzddh.heightPixels / zzddc);
		l = (int)((float)i1 / zzddc);
		i1 = (int)((float)j1 / zzddc);
		StringBuilder stringbuilder = new StringBuilder(103);
		stringbuilder.append("Not enough space to show ad. Needs ");
		stringbuilder.append(i);
		stringbuilder.append("x");
		stringbuilder.append(j);
		stringbuilder.append(" dp, but only has ");
		stringbuilder.append(l);
		stringbuilder.append("x");
		stringbuilder.append(i1);
		stringbuilder.append(" dp.");
		zzakb.zzdk(stringbuilder.toString());
		if(getVisibility() != 8)
			setVisibility(4);
		setMeasuredDimension(0, 0);
		if(zzddd)
			break MISSING_BLOCK_LABEL_770;
		zzcch.zza(zzhu.zza.zzb.zzalj);
		zzddd = true;
		return;
		if(getVisibility() != 8)
			setVisibility(0);
		if(!zzdde)
		{
			zzcch.zza(zzhu.zza.zzb.zzalk);
			zzdde = true;
		}
		setMeasuredDimension(zzddh.widthPixels, zzddh.heightPixels);
		this;
		JVM INSTR monitorexit ;
		return;
_L1:
		super.onMeasure(i, j);
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
_L6:
		f = 0.0F;
		  goto _L10
		int l = 0x7fffffff;
		zzna zzna1;
		Exception exception;
		if(k1 != 0x80000000 && k1 != 0x40000000)
			j = 0x7fffffff;
		else
			j = i1;
		if(i == 0x80000000 || i == 0x40000000)
			l = j1;
		  goto _L11
_L9:
		if(i == 0) goto _L8; else goto _L12
	//  439  837:iload_1         
	//  440  838:ifeq            844
	//* 441  841:goto            521
_L8:
		j = i;
	//  442  844:iload_1         
	//  443  845:istore_2        
		  goto _L12
	//* 444  846:goto            521
	}

	public final void onPause()
	{
		if(isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #348 <Method boolean isDestroyed()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			if(PlatformVersion.isAtLeastHoneycomb())
	//*   4    8:invokestatic    #257 <Method boolean PlatformVersion.isAtLeastHoneycomb()>
	//*   5   11:ifeq            18
				super.onPause();
	//    6   14:aload_0         
	//    7   15:invokespecial   #911 <Method void WebView.onPause()>
			return;
	//    8   18:return          
		}
		catch(Exception exception)
	//*   9   19:astore_1        
		{
			zzakb.zzb("Could not pause webview.", ((Throwable) (exception)));
	//   10   20:ldc2            #913 <String "Could not pause webview.">
	//   11   23:aload_1         
	//   12   24:invokestatic    #194 <Method void zzakb.zzb(String, Throwable)>
		}
	//   13   27:return          
	}

	public final void onResume()
	{
		if(isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #348 <Method boolean isDestroyed()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			if(PlatformVersion.isAtLeastHoneycomb())
	//*   4    8:invokestatic    #257 <Method boolean PlatformVersion.isAtLeastHoneycomb()>
	//*   5   11:ifeq            18
				super.onResume();
	//    6   14:aload_0         
	//    7   15:invokespecial   #916 <Method void WebView.onResume()>
			return;
	//    8   18:return          
		}
		catch(Exception exception)
	//*   9   19:astore_1        
		{
			zzakb.zzb("Could not resume webview.", ((Throwable) (exception)));
	//   10   20:ldc2            #918 <String "Could not resume webview.">
	//   11   23:aload_1         
	//   12   24:invokestatic    #194 <Method void zzakb.zzb(String, Throwable)>
		}
	//   13   27:return          
	}

	public final boolean onTouchEvent(MotionEvent motionevent)
	{
		if(!((zzaqx)zzddf).zzuu())
			break MISSING_BLOCK_LABEL_42;
	//    0    0:aload_0         
	//    1    1:getfield        #457 <Field zzaqx zzddf>
	//    2    4:checkcast       #459 <Class zzaqx>
	//    3    7:invokevirtual   #465 <Method boolean zzaqx.zzuu()>
	//    4   10:ifeq            42
		this;
	//    5   13:aload_0         
		JVM INSTR monitorenter ;
	//    6   14:monitorenter    
		if(zzdds != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #921 <Field zzox zzdds>
	//*   9   19:ifnull          32
			zzdds.zzc(motionevent);
	//   10   22:aload_0         
	//   11   23:getfield        #921 <Field zzox zzdds>
	//   12   26:aload_1         
	//   13   27:invokeinterface #926 <Method void com.google.android.gms.internal.ads.zzox.zzc(MotionEvent)>
		this;
	//   14   32:aload_0         
		JVM INSTR monitorexit ;
	//   15   33:monitorexit     
		break MISSING_BLOCK_LABEL_57;
	//   16   34:goto            57
		motionevent;
	//   17   37:astore_1        
		this;
	//   18   38:aload_0         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		throw motionevent;
	//   20   40:aload_1         
	//   21   41:athrow          
		if(zzbjc != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #124 <Field zzci zzbjc>
	//*  24   46:ifnull          57
			zzbjc.zza(motionevent);
	//   25   49:aload_0         
	//   26   50:getfield        #124 <Field zzci zzbjc>
	//   27   53:aload_1         
	//   28   54:invokevirtual   #930 <Method void zzci.zza(MotionEvent)>
		if(isDestroyed())
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #348 <Method boolean isDestroyed()>
	//*  31   61:ifeq            66
			return false;
	//   32   64:iconst_0        
	//   33   65:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokespecial   #932 <Method boolean WebView.onTouchEvent(MotionEvent)>
	//   37   71:ireturn         
	}

	public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		zzddy = new WeakReference(((Object) (onclicklistener)));
	//    0    0:aload_0         
	//    1    1:new             #630 <Class WeakReference>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #936 <Method void WeakReference(Object)>
	//    5    9:putfield        #628 <Field WeakReference zzddy>
		super.setOnClickListener(onclicklistener);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #938 <Method void WebView.setOnClickListener(android.view.View$OnClickListener)>
	//    9   17:return          
	}

	public final void setRequestedOrientation(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzddm = i;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #122 <Field int zzddm>
		if(zzddg != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #570 <Field zzd zzddg>
	//*   7   11:ifnull          25
			zzddg.setRequestedOrientation(zzddm);
	//    8   14:aload_0         
	//    9   15:getfield        #570 <Field zzd zzddg>
	//   10   18:aload_0         
	//   11   19:getfield        #122 <Field int zzddm>
	//   12   22:invokevirtual   #941 <Method void zzd.setRequestedOrientation(int)>
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
	//    2    2:invokespecial   #945 <Method void WebView.setWebViewClient(WebViewClient)>
		if(webviewclient instanceof zzaqx)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #459 <Class zzaqx>
	//*   5    9:ifeq            20
			zzddf = (zzaqx)webviewclient;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #459 <Class zzaqx>
	//    9   17:putfield        #457 <Field zzaqx zzddf>
	//   10   20:return          
	}

	public final void stopLoading()
	{
		if(isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #348 <Method boolean isDestroyed()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		try
		{
			super.stopLoading();
	//    4    8:aload_0         
	//    5    9:invokespecial   #948 <Method void WebView.stopLoading()>
			return;
	//    6   12:return          
		}
		catch(Exception exception)
	//*   7   13:astore_1        
		{
			zzakb.zzb("Could not stop loading webview.", ((Throwable) (exception)));
	//    8   14:ldc2            #950 <String "Could not stop loading webview.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #194 <Method void zzakb.zzb(String, Throwable)>
		}
	//   11   21:return          
	}

	public final void zza(zzc zzc1)
	{
		zzddf.zza(zzc1);
	//    0    0:aload_0         
	//    1    1:getfield        #457 <Field zzaqx zzddf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #953 <Method void zzaqx.zza(zzc)>
	//    4    8:return          
	}

	public final void zza(zzd zzd1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzddg = zzd1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #570 <Field zzd zzddg>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		zzd1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw zzd1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final void zza(zzarl zzarl1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzddp == null)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #957 <Field zzarl zzddp>
	//    4    6:ifnull          18
		zzakb.e("Attempt to create multiple AdWebViewVideoControllers.");
	//    5    9:ldc2            #959 <String "Attempt to create multiple AdWebViewVideoControllers.">
	//    6   12:invokestatic    #962 <Method void zzakb.e(String)>
		this;
	//    7   15:aload_0         
		JVM INSTR monitorexit ;
	//    8   16:monitorexit     
		return;
	//    9   17:return          
		zzddp = zzarl1;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:putfield        #957 <Field zzarl zzddp>
		this;
	//   13   23:aload_0         
		JVM INSTR monitorexit ;
	//   14   24:monitorexit     
		return;
	//   15   25:return          
		zzarl1;
	//   16   26:astore_1        
	//*  17   27:aload_0         
		throw zzarl1;
	//   18   28:monitorexit     
	//   19   29:aload_1         
	//   20   30:athrow          
	}

	public final void zza(zzasi zzasi1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzddh = zzasi1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #116 <Field zzasi zzddh>
		requestLayout();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #966 <Method void requestLayout()>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		zzasi1;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw zzasi1;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public final void zza(zzfs zzfs1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzddq = zzfs1.zztg;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:getfield        #972 <Field boolean zzfs.zztg>
	//    5    7:putfield        #657 <Field boolean zzddq>
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		zzal(zzfs1.zztg);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:getfield        #972 <Field boolean zzfs.zztg>
	//   11   17:invokespecial   #683 <Method void zzal(boolean)>
		return;
	//   12   20:return          
		zzfs1;
	//   13   21:astore_1        
		this;
	//   14   22:aload_0         
		JVM INSTR monitorexit ;
	//   15   23:monitorexit     
		throw zzfs1;
	//   16   24:aload_1         
	//   17   25:athrow          
	}

	public final void zza(String s, zzv zzv)
	{
		if(zzddf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #457 <Field zzaqx zzddf>
	//*   2    4:ifnull          16
			zzddf.zza(s, zzv);
	//    3    7:aload_0         
	//    4    8:getfield        #457 <Field zzaqx zzddf>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #973 <Method void zzaqx.zza(String, zzv)>
	//    8   16:return          
	}

	public final void zza(String s, Predicate predicate)
	{
		if(zzddf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #457 <Field zzaqx zzddf>
	//*   2    4:ifnull          16
			zzddf.zza(s, predicate);
	//    3    7:aload_0         
	//    4    8:getfield        #457 <Field zzaqx zzddf>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #977 <Method void zzaqx.zza(String, Predicate)>
	//    8   16:return          
	}

	public final void zza(String s, Map map)
	{
		try
		{
			map = ((Map) (zzbv.zzek().zzn(map)));
	//    0    0:invokestatic    #152 <Method zzakk zzbv.zzek()>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #984 <Method JSONObject zzakk.zzn(Map)>
	//    3    7:astore_2        
		}
	//*   4    8:aload_0         
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:invokevirtual   #987 <Method void zza(String, JSONObject)>
	//*   8   14:return          
	//*   9   15:ldc2            #989 <String "Could not convert parameters to JSON.">
	//*  10   18:invokestatic    #356 <Method void zzakb.zzdk(String)>
	//*  11   21:return          
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			zzakb.zzdk("Could not convert parameters to JSON.");
			return;
		}
		zza(s, ((JSONObject) (map)));
	//*  12   22:astore_1        
	//*  13   23:goto            15
	}

	public final void zza(String s, JSONObject jsonobject)
	{
		Object obj = ((Object) (jsonobject));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonobject == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new JSONObject()));
	//    4    6:new             #992 <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #993 <Method void JSONObject()>
	//    7   13:astore_3        
		obj = ((Object) (((JSONObject) (obj)).toString()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #994 <Method String JSONObject.toString()>
	//   10   18:astore_3        
		jsonobject = ((JSONObject) (new StringBuilder()));
	//   11   19:new             #727 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #995 <Method void StringBuilder()>
	//   14   26:astore_2        
		((StringBuilder) (jsonobject)).append("(window.AFMA_ReceiveMessage || function() {})('");
	//   15   27:aload_2         
	//   16   28:ldc2            #997 <String "(window.AFMA_ReceiveMessage || function() {})('">
	//   17   31:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		((StringBuilder) (jsonobject)).append(s);
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		((StringBuilder) (jsonobject)).append("'");
	//   23   41:aload_2         
	//   24   42:ldc2            #999 <String "'">
	//   25   45:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		((StringBuilder) (jsonobject)).append(",");
	//   27   49:aload_2         
	//   28   50:ldc2            #1001 <String ",">
	//   29   53:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
		((StringBuilder) (jsonobject)).append(((String) (obj)));
	//   31   57:aload_2         
	//   32   58:aload_3         
	//   33   59:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		((StringBuilder) (jsonobject)).append(");");
	//   35   63:aload_2         
	//   36   64:ldc2            #1003 <String ");">
	//   37   67:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   38   70:pop             
		s = String.valueOf(((Object) (((StringBuilder) (jsonobject)).toString())));
	//   39   71:aload_2         
	//   40   72:invokevirtual   #741 <Method String StringBuilder.toString()>
	//   41   75:invokestatic    #435 <Method String String.valueOf(Object)>
	//   42   78:astore_1        
		if(s.length() != 0)
	//*  43   79:aload_1         
	//*  44   80:invokevirtual   #439 <Method int String.length()>
	//*  45   83:ifeq            97
			s = "Dispatching AFMA event: ".concat(s);
	//   46   86:ldc2            #1005 <String "Dispatching AFMA event: ">
	//   47   89:aload_1         
	//   48   90:invokevirtual   #445 <Method String String.concat(String)>
	//   49   93:astore_1        
		else
	//*  50   94:goto            108
			s = new String("Dispatching AFMA event: ");
	//   51   97:new             #431 <Class String>
	//   52  100:dup             
	//   53  101:ldc2            #1005 <String "Dispatching AFMA event: ">
	//   54  104:invokespecial   #447 <Method void String(String)>
	//   55  107:astore_1        
		zzakb.zzck(s);
	//   56  108:aload_1         
	//   57  109:invokestatic    #534 <Method void zzakb.zzck(String)>
		zzdu(((StringBuilder) (jsonobject)).toString());
	//   58  112:aload_0         
	//   59  113:aload_2         
	//   60  114:invokevirtual   #741 <Method String StringBuilder.toString()>
	//   61  117:invokespecial   #866 <Method void zzdu(String)>
	//   62  120:return          
	}

	public final void zza(boolean flag, int i)
	{
		zzddf.zza(flag, i);
	//    0    0:aload_0         
	//    1    1:getfield        #457 <Field zzaqx zzddf>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #1008 <Method void zzaqx.zza(boolean, int)>
	//    5    9:return          
	}

	public final void zza(boolean flag, int i, String s)
	{
		zzddf.zza(flag, i, s);
	//    0    0:aload_0         
	//    1    1:getfield        #457 <Field zzaqx zzddf>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #1011 <Method void zzaqx.zza(boolean, int, String)>
	//    6   10:return          
	}

	public final void zza(boolean flag, int i, String s, String s1)
	{
		zzddf.zza(flag, i, s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #457 <Field zzaqx zzddf>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #1014 <Method void zzaqx.zza(boolean, int, String, String)>
	//    7   12:return          
	}

	public final void zzah(boolean flag)
	{
		((zzaqx)zzddf).zzah(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #457 <Field zzaqx zzddf>
	//    2    4:checkcast       #459 <Class zzaqx>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #1017 <Method void zzaqx.zzah(boolean)>
	//    5   11:return          
	}

	public final void zzai(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            29
			zznq.zza(zzddx.zzji(), zzdad, new String[] {
				"aebb2"
			});
	//    2    4:aload_0         
	//    3    5:getfield        #295 <Field zznw zzddx>
	//    4    8:invokevirtual   #299 <Method zznx zznw.zzji()>
	//    5   11:aload_0         
	//    6   12:getfield        #309 <Field zznv zzdad>
	//    7   15:iconst_1        
	//    8   16:anewarray       String[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:ldc2            #1020 <String "aebb2">
	//   12   24:aastore         
	//   13   25:invokestatic    #524 <Method boolean zznq.zza(zznx, zznv, String[])>
	//   14   28:pop             
		zzvj();
	//   15   29:aload_0         
	//   16   30:invokespecial   #1022 <Method void zzvj()>
		if(zzddx.zzji() != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #295 <Field zznw zzddx>
	//*  19   37:invokevirtual   #299 <Method zznx zznw.zzji()>
	//*  20   40:ifnull          60
			zzddx.zzji().zze("close_type", String.valueOf(i));
	//   21   43:aload_0         
	//   22   44:getfield        #295 <Field zznw zzddx>
	//   23   47:invokevirtual   #299 <Method zznx zznw.zzji()>
	//   24   50:ldc2            #1024 <String "close_type">
	//   25   53:iload_1         
	//   26   54:invokestatic    #1027 <Method String String.valueOf(int)>
	//   27   57:invokevirtual   #1031 <Method void zznx.zze(String, String)>
		HashMap hashmap = new HashMap(2);
	//   28   60:new             #361 <Class HashMap>
	//   29   63:dup             
	//   30   64:iconst_2        
	//   31   65:invokespecial   #1032 <Method void HashMap(int)>
	//   32   68:astore_2        
		hashmap.put("closetype", ((Object) (String.valueOf(i))));
	//   33   69:aload_2         
	//   34   70:ldc2            #1034 <String "closetype">
	//   35   73:iload_1         
	//   36   74:invokestatic    #1027 <Method String String.valueOf(int)>
	//   37   77:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   38   80:pop             
		hashmap.put("version", ((Object) (zzyf.zzcw)));
	//   39   81:aload_2         
	//   40   82:ldc2            #1037 <String "version">
	//   41   85:aload_0         
	//   42   86:getfield        #126 <Field zzang zzyf>
	//   43   89:getfield        #216 <Field String zzang.zzcw>
	//   44   92:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   45   95:pop             
		zza("onhide", ((Map) (hashmap)));
	//   46   96:aload_0         
	//   47   97:ldc2            #1039 <String "onhide">
	//   48  100:aload_2         
	//   49  101:invokevirtual   #380 <Method void zza(String, Map)>
	//   50  104:return          
	}

	public final void zzai(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag1;
		Object obj;
		zzaal zzaal1;
		if(flag != zzddk)
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #120 <Field boolean zzddk>
	//*   5    7:icmpeq          63
			flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore_2        
		else
	//*   8   12:goto            15
	//*   9   15:aload_0         
	//*  10   16:iload_1         
	//*  11   17:putfield        #120 <Field boolean zzddk>
	//*  12   20:aload_0         
	//*  13   21:invokespecial   #236 <Method void zzvk()>
	//*  14   24:iload_2         
	//*  15   25:ifeq            55
	//*  16   28:new             #494 <Class zzaal>
	//*  17   31:dup             
	//*  18   32:aload_0         
	//*  19   33:invokespecial   #497 <Method void zzaal(zzaqw)>
	//*  20   36:astore          4
	//*  21   38:iload_1         
	//*  22   39:ifeq            68
	//*  23   42:ldc2            #1041 <String "expanded">
	//*  24   45:astore_3        
	//*  25   46:goto            49
	//*  26   49:aload           4
	//*  27   51:aload_3         
	//*  28   52:invokevirtual   #1044 <Method void zzaal.zzby(String)>
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
		zzddk = flag;
		zzvk();
		if(!flag1)
			break MISSING_BLOCK_LABEL_55;
		zzaal1 = new zzaal(((zzaqw) (this)));
		if(flag)
			obj = "expanded";
		else
	//*  39   65:goto            15
			obj = "default";
	//   40   68:ldc2            #1046 <String "default">
	//   41   71:astore_3        
		zzaal1.zzby(((String) (obj)));
		this;
		JVM INSTR monitorexit ;
		return;
		obj;
		throw obj;
	//*  42   72:goto            49
	}

	public final void zzaj(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzddn = flag;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #98  <Field boolean zzddn>
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

	public final void zzak(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j = zzddt;
	//    2    2:aload_0         
	//    3    3:getfield        #1050 <Field int zzddt>
	//    4    6:istore_3        
		int i;
		Exception exception;
		if(flag)
	//*   5    7:iload_1         
	//*   6    8:ifeq            54
			i = 1;
	//    7   11:iconst_1        
	//    8   12:istore_2        
		else
	//*   9   13:goto            16
	//*  10   16:aload_0         
	//*  11   17:iload_3         
	//*  12   18:iload_2         
	//*  13   19:iadd            
	//*  14   20:putfield        #1050 <Field int zzddt>
	//*  15   23:aload_0         
	//*  16   24:getfield        #1050 <Field int zzddt>
	//*  17   27:ifgt            44
	//*  18   30:aload_0         
	//*  19   31:getfield        #570 <Field zzd zzddg>
	//*  20   34:ifnull          44
	//*  21   37:aload_0         
	//*  22   38:getfield        #570 <Field zzd zzddg>
	//*  23   41:invokevirtual   #1053 <Method void zzd.zznq()>
	//*  24   44:aload_0         
	//*  25   45:monitorexit     
	//*  26   46:return          
	//*  27   47:astore          4
	//*  28   49:aload_0         
	//*  29   50:monitorexit     
	//*  30   51:aload           4
	//*  31   53:athrow          
			i = -1;
	//   32   54:iconst_m1       
	//   33   55:istore_2        
		zzddt = j + i;
		if(zzddt <= 0 && zzddg != null)
			zzddg.zznq();
		this;
		JVM INSTR monitorexit ;
		return;
		exception;
		throw exception;
	//*  34   56:goto            16
	}

	public final void zzb(zzd zzd1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzddz = zzd1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #1055 <Field zzd zzddz>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		zzd1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw zzd1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final void zzb(zzox zzox1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzdds = zzox1;
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:putfield        #921 <Field zzox zzdds>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		zzox1;
	//    8   10:astore_1        
	//*   9   11:aload_0         
		throw zzox1;
	//   10   12:monitorexit     
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	public final void zzb(String s, zzv zzv)
	{
		if(zzddf != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #457 <Field zzaqx zzddf>
	//*   2    4:ifnull          16
			zzddf.zzb(s, zzv);
	//    3    7:aload_0         
	//    4    8:getfield        #457 <Field zzaqx zzddf>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #1058 <Method void zzaqx.zzb(String, zzv)>
	//    8   16:return          
	}

	public final void zzb(String s, JSONObject jsonobject)
	{
		Object obj = ((Object) (jsonobject));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonobject == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       14
			obj = ((Object) (new JSONObject()));
	//    4    6:new             #992 <Class JSONObject>
	//    5    9:dup             
	//    6   10:invokespecial   #993 <Method void JSONObject()>
	//    7   13:astore_3        
		jsonobject = ((JSONObject) (((JSONObject) (obj)).toString()));
	//    8   14:aload_3         
	//    9   15:invokevirtual   #994 <Method String JSONObject.toString()>
	//   10   18:astore_2        
		obj = ((Object) (new StringBuilder(3 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (jsonobject))).length())));
	//   11   19:new             #727 <Class StringBuilder>
	//   12   22:dup             
	//   13   23:iconst_3        
	//   14   24:aload_1         
	//   15   25:invokestatic    #435 <Method String String.valueOf(Object)>
	//   16   28:invokevirtual   #439 <Method int String.length()>
	//   17   31:iadd            
	//   18   32:aload_2         
	//   19   33:invokestatic    #435 <Method String String.valueOf(Object)>
	//   20   36:invokevirtual   #439 <Method int String.length()>
	//   21   39:iadd            
	//   22   40:invokespecial   #729 <Method void StringBuilder(int)>
	//   23   43:astore_3        
		((StringBuilder) (obj)).append(s);
	//   24   44:aload_3         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
		((StringBuilder) (obj)).append("(");
	//   28   50:aload_3         
	//   29   51:ldc2            #1060 <String "(">
	//   30   54:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
		((StringBuilder) (obj)).append(((String) (jsonobject)));
	//   32   58:aload_3         
	//   33   59:aload_2         
	//   34   60:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
		((StringBuilder) (obj)).append(");");
	//   36   64:aload_3         
	//   37   65:ldc2            #1003 <String ");">
	//   38   68:invokevirtual   #735 <Method StringBuilder StringBuilder.append(String)>
	//   39   71:pop             
		zzdu(((StringBuilder) (obj)).toString());
	//   40   72:aload_0         
	//   41   73:aload_3         
	//   42   74:invokevirtual   #741 <Method String StringBuilder.toString()>
	//   43   77:invokespecial   #866 <Method void zzdu(String)>
	//   44   80:return          
	}

	public final void zzbe(String s)
	{
		zzdu(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #866 <Method void zzdu(String)>
	//    3    5:return          
	}

	public final zzw zzbi()
	{
		return zzwc;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field zzw zzwc>
	//    2    4:areturn         
	}

	public final void zzbm(Context context)
	{
		zzdda.setBaseContext(context);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field zzash zzdda>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1067 <Method void zzash.setBaseContext(Context)>
		zzaee.zzi(zzdda.zzto());
	//    4    8:aload_0         
	//    5    9:getfield        #278 <Field zzamt zzaee>
	//    6   12:aload_0         
	//    7   13:getfield        #114 <Field zzash zzdda>
	//    8   16:invokevirtual   #273 <Method Activity zzash.zzto()>
	//    9   19:invokevirtual   #1071 <Method void zzamt.zzi(Activity)>
	//   10   22:return          
	}

	public final void zzc(String s, String s1, String s2)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzna zzna;
		if(isDestroyed())
			break MISSING_BLOCK_LABEL_67;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #348 <Method boolean isDestroyed()>
	//    4    6:ifne            67
		zzna = zznk.zzaya;
	//    5    9:getstatic       #1074 <Field zzna zznk.zzaya>
	//    6   12:astore          5
		String s3 = s1;
	//    7   14:aload_2         
	//    8   15:astore          4
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   9   17:invokestatic    #775 <Method zzni zzkb.zzik()>
	//*  10   20:aload           5
	//*  11   22:invokevirtual   #781 <Method Object com.google.android.gms.internal.ads.zzni.zzd(zzna)>
	//*  12   25:checkcast       #424 <Class Boolean>
	//*  13   28:invokevirtual   #427 <Method boolean Boolean.booleanValue()>
	//*  14   31:ifeq            50
			s3 = zzarx.zzb(s1, new String[] {
				zzarx.zzvp()
			});
	//   15   34:aload_2         
	//   16   35:iconst_1        
	//   17   36:anewarray       String[]
	//   18   39:dup             
	//   19   40:iconst_0        
	//   20   41:invokestatic    #1079 <Method String zzarx.zzvp()>
	//   21   44:aastore         
	//   22   45:invokestatic    #1082 <Method String zzarx.zzb(String, String[])>
	//   23   48:astore          4
		super.loadDataWithBaseURL(s, s3, "text/html", "UTF-8", s2);
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:aload           4
	//   27   54:ldc2            #1084 <String "text/html">
	//   28   57:ldc2            #1086 <String "UTF-8">
	//   29   60:aload_3         
	//   30   61:invokespecial   #649 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
		this;
	//   31   64:aload_0         
		JVM INSTR monitorexit ;
	//   32   65:monitorexit     
		return;
	//   33   66:return          
		zzakb.zzdk("#004 The webview is destroyed. Ignoring action.");
	//   34   67:ldc2            #353 <String "#004 The webview is destroyed. Ignoring action.">
	//   35   70:invokestatic    #356 <Method void zzakb.zzdk(String)>
		this;
	//   36   73:aload_0         
		JVM INSTR monitorexit ;
	//   37   74:monitorexit     
		return;
	//   38   75:return          
		s;
	//   39   76:astore_1        
	//*  40   77:aload_0         
		throw s;
	//   41   78:monitorexit     
	//   42   79:aload_1         
	//   43   80:athrow          
	}

	public final void zzcl()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzddo = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #100 <Field boolean zzddo>
		if(zzddb != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #128 <Field zzbo zzddb>
	//*   7   11:ifnull          23
			zzddb.zzcl();
	//    8   14:aload_0         
	//    9   15:getfield        #128 <Field zzbo zzddb>
	//   10   18:invokeinterface #1091 <Method void zzbo.zzcl()>
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

	public final void zzcm()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzddo = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #100 <Field boolean zzddo>
		if(zzddb != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #128 <Field zzbo zzddb>
	//*   7   11:ifnull          23
			zzddb.zzcm();
	//    8   14:aload_0         
	//    9   15:getfield        #128 <Field zzbo zzddb>
	//   10   18:invokeinterface #1094 <Method void zzbo.zzcm()>
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

	public final void zzdr(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s1;
		s1 = s;
	//    2    2:aload_1         
	//    3    3:astore_2        
		if(s == null)
	//*   4    4:aload_1         
	//*   5    5:ifnonnull       14
			s1 = "";
	//    6    8:ldc1            #102 <String "">
	//    7   10:astore_2        
	//*   8   11:goto            14
		zzchp = s1;
	//    9   14:aload_0         
	//   10   15:aload_2         
	//   11   16:putfield        #104 <Field String zzchp>
		this;
	//   12   19:aload_0         
		JVM INSTR monitorexit ;
	//   13   20:monitorexit     
		return;
	//   14   21:return          
	//*  15   22:aload_0         
_L2:
		throw s;
	//   16   23:monitorexit     
	//   17   24:aload_1         
	//   18   25:athrow          
		s;
	//   19   26:astore_1        
		if(true) goto _L2; else goto _L1
_L1:
	//*  20   27:goto            22
	}

	public final void zzno()
	{
		if(zzddv == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field zznv zzddv>
	//*   2    4:ifnonnull       60
		{
			zznq.zza(zzddx.zzji(), zzdad, new String[] {
				"aes2"
			});
	//    3    7:aload_0         
	//    4    8:getfield        #295 <Field zznw zzddx>
	//    5   11:invokevirtual   #299 <Method zznx zznw.zzji()>
	//    6   14:aload_0         
	//    7   15:getfield        #309 <Field zznv zzdad>
	//    8   18:iconst_1        
	//    9   19:anewarray       String[]
	//   10   22:dup             
	//   11   23:iconst_0        
	//   12   24:ldc2            #1098 <String "aes2">
	//   13   27:aastore         
	//   14   28:invokestatic    #524 <Method boolean zznq.zza(zznx, zznv, String[])>
	//   15   31:pop             
			zzddv = zznq.zzb(zzddx.zzji());
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #295 <Field zznw zzddx>
	//   19   37:invokevirtual   #299 <Method zznx zznw.zzji()>
	//   20   40:invokestatic    #307 <Method zznv zznq.zzb(zznx)>
	//   21   43:putfield        #318 <Field zznv zzddv>
			zzddx.zza("native:view_show", zzddv);
	//   22   46:aload_0         
	//   23   47:getfield        #295 <Field zznw zzddx>
	//   24   50:ldc2            #1100 <String "native:view_show">
	//   25   53:aload_0         
	//   26   54:getfield        #318 <Field zznv zzddv>
	//   27   57:invokevirtual   #314 <Method void zznw.zza(String, zznv)>
		}
		HashMap hashmap = new HashMap(1);
	//   28   60:new             #361 <Class HashMap>
	//   29   63:dup             
	//   30   64:iconst_1        
	//   31   65:invokespecial   #1032 <Method void HashMap(int)>
	//   32   68:astore_1        
		hashmap.put("version", ((Object) (zzyf.zzcw)));
	//   33   69:aload_1         
	//   34   70:ldc2            #1037 <String "version">
	//   35   73:aload_0         
	//   36   74:getfield        #126 <Field zzang zzyf>
	//   37   77:getfield        #216 <Field String zzang.zzcw>
	//   38   80:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   39   83:pop             
		zza("onshow", ((Map) (hashmap)));
	//   40   84:aload_0         
	//   41   85:ldc2            #1102 <String "onshow">
	//   42   88:aload_1         
	//   43   89:invokevirtual   #380 <Method void zza(String, Map)>
	//   44   92:return          
	}

	public final void zznp()
	{
		zzd zzd1 = zzub();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #804 <Method zzd zzub()>
	//    2    4:astore_1        
		if(zzd1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			zzd1.zznp();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1105 <Method void zzd.zznp()>
	//    7   13:return          
	}

	public final String zzol()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s = zzchp;
	//    2    2:aload_0         
	//    3    3:getfield        #104 <Field String zzchp>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return s;
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

	public final zzapn zztl()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final zzarl zztm()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzarl zzarl1 = zzddp;
	//    2    2:aload_0         
	//    3    3:getfield        #957 <Field zzarl zzddp>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return zzarl1;
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

	public final zznv zztn()
	{
		return zzdad;
	//    0    0:aload_0         
	//    1    1:getfield        #309 <Field zznv zzdad>
	//    2    4:areturn         
	}

	public final Activity zzto()
	{
		return zzdda.zzto();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field zzash zzdda>
	//    2    4:invokevirtual   #273 <Method Activity zzash.zzto()>
	//    3    7:areturn         
	}

	public final zznw zztp()
	{
		return zzddx;
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field zznw zzddx>
	//    2    4:areturn         
	}

	public final zzang zztq()
	{
		return zzyf;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field zzang zzyf>
	//    2    4:areturn         
	}

	public final int zztr()
	{
		return getMeasuredHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1118 <Method int getMeasuredHeight()>
	//    2    4:ireturn         
	}

	public final int zzts()
	{
		return getMeasuredWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1122 <Method int getMeasuredWidth()>
	//    2    4:ireturn         
	}

	public final void zzty()
	{
		zzvj();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1022 <Method void zzvj()>
		HashMap hashmap = new HashMap(1);
	//    2    4:new             #361 <Class HashMap>
	//    3    7:dup             
	//    4    8:iconst_1        
	//    5    9:invokespecial   #1032 <Method void HashMap(int)>
	//    6   12:astore_1        
		hashmap.put("version", ((Object) (zzyf.zzcw)));
	//    7   13:aload_1         
	//    8   14:ldc2            #1037 <String "version">
	//    9   17:aload_0         
	//   10   18:getfield        #126 <Field zzang zzyf>
	//   11   21:getfield        #216 <Field String zzang.zzcw>
	//   12   24:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
		zza("onhide", ((Map) (hashmap)));
	//   14   28:aload_0         
	//   15   29:ldc2            #1039 <String "onhide">
	//   16   32:aload_1         
	//   17   33:invokevirtual   #380 <Method void zza(String, Map)>
	//   18   36:return          
	}

	public final void zztz()
	{
		HashMap hashmap = new HashMap(3);
	//    0    0:new             #361 <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:invokespecial   #1032 <Method void HashMap(int)>
	//    4    8:astore_1        
		hashmap.put("app_muted", ((Object) (String.valueOf(zzbv.zzfj().zzdp()))));
	//    5    9:aload_1         
	//    6   10:ldc2            #1126 <String "app_muted">
	//    7   13:invokestatic    #1130 <Method zzalb zzbv.zzfj()>
	//    8   16:invokevirtual   #1135 <Method boolean zzalb.zzdp()>
	//    9   19:invokestatic    #1138 <Method String String.valueOf(boolean)>
	//   10   22:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   11   25:pop             
		hashmap.put("app_volume", ((Object) (String.valueOf(zzbv.zzfj().zzdo()))));
	//   12   26:aload_1         
	//   13   27:ldc2            #1140 <String "app_volume">
	//   14   30:invokestatic    #1130 <Method zzalb zzbv.zzfj()>
	//   15   33:invokevirtual   #1143 <Method float zzalb.zzdo()>
	//   16   36:invokestatic    #1146 <Method String String.valueOf(float)>
	//   17   39:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   18   42:pop             
		hashmap.put("device_volume", ((Object) (String.valueOf(zzalb.zzay(getContext())))));
	//   19   43:aload_1         
	//   20   44:ldc2            #1148 <String "device_volume">
	//   21   47:aload_0         
	//   22   48:invokevirtual   #134 <Method Context getContext()>
	//   23   51:invokestatic    #1152 <Method float zzalb.zzay(Context)>
	//   24   54:invokestatic    #1146 <Method String String.valueOf(float)>
	//   25   57:invokevirtual   #1035 <Method Object HashMap.put(Object, Object)>
	//   26   60:pop             
		zza("volume", ((Map) (hashmap)));
	//   27   61:aload_0         
	//   28   62:ldc2            #1154 <String "volume">
	//   29   65:aload_1         
	//   30   66:invokevirtual   #380 <Method void zza(String, Map)>
	//   31   69:return          
	}

	public final void zzu(boolean flag)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzddg == null)
			break MISSING_BLOCK_LABEL_27;
	//    2    2:aload_0         
	//    3    3:getfield        #570 <Field zzd zzddg>
	//    4    6:ifnull          27
		zzddg.zza(zzddf.zzfz(), flag);
	//    5    9:aload_0         
	//    6   10:getfield        #570 <Field zzd zzddg>
	//    7   13:aload_0         
	//    8   14:getfield        #457 <Field zzaqx zzddf>
	//    9   17:invokevirtual   #462 <Method boolean zzaqx.zzfz()>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #1158 <Method void zzd.zza(boolean, boolean)>
		this;
	//   12   24:aload_0         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		return;
	//   14   26:return          
		zzddi = flag;
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:putfield        #1160 <Field boolean zzddi>
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

	public final Context zzua()
	{
		return zzdda.zzua();
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field zzash zzdda>
	//    2    4:invokevirtual   #1163 <Method Context zzash.zzua()>
	//    3    7:areturn         
	}

	public final zzd zzub()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzd zzd1 = zzddg;
	//    2    2:aload_0         
	//    3    3:getfield        #570 <Field zzd zzddg>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return zzd1;
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

	public final zzd zzuc()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzd zzd1 = zzddz;
	//    2    2:aload_0         
	//    3    3:getfield        #1055 <Field zzd zzddz>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return zzd1;
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

	public final zzasi zzud()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzasi zzasi1 = zzddh;
	//    2    2:aload_0         
	//    3    3:getfield        #116 <Field zzasi zzddh>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return zzasi1;
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

	public final String zzue()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s = zzus;
	//    2    2:aload_0         
	//    3    3:getfield        #118 <Field String zzus>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return s;
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

	public final zzasc zzuf()
	{
		return ((zzasc) (zzddf));
	//    0    0:aload_0         
	//    1    1:getfield        #457 <Field zzaqx zzddf>
	//    2    4:areturn         
	}

	public final WebViewClient zzug()
	{
		return ((WebViewClient) (zzddf));
	//    0    0:aload_0         
	//    1    1:getfield        #457 <Field zzaqx zzddf>
	//    2    4:areturn         
	}

	public final boolean zzuh()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzddi;
	//    2    2:aload_0         
	//    3    3:getfield        #1160 <Field boolean zzddi>
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

	public final zzci zzui()
	{
		return zzbjc;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field zzci zzbjc>
	//    2    4:areturn         
	}

	public final boolean zzuj()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzddk;
	//    2    2:aload_0         
	//    3    3:getfield        #120 <Field boolean zzddk>
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

	public final void zzuk()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzakb.v("Destroying WebView!");
	//    2    2:ldc2            #1178 <String "Destroying WebView!">
	//    3    5:invokestatic    #599 <Method void zzakb.v(String)>
		zzqf();
	//    4    8:aload_0         
	//    5    9:invokespecial   #619 <Method void zzqf()>
		zzakk.zzcrm.post(((Runnable) (new zzark(this))));
	//    6   12:getstatic       #1182 <Field Handler zzakk.zzcrm>
	//    7   15:new             #1184 <Class zzark>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #1185 <Method void zzark(zzari)>
	//   11   23:invokevirtual   #1191 <Method boolean Handler.post(Runnable)>
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

	public final boolean zzul()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzddn;
	//    2    2:aload_0         
	//    3    3:getfield        #98  <Field boolean zzddn>
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

	public final boolean zzum()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = zzddo;
	//    2    2:aload_0         
	//    3    3:getfield        #100 <Field boolean zzddo>
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

	public final boolean zzun()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = zzddt;
	//    2    2:aload_0         
	//    3    3:getfield        #1050 <Field int zzddt>
	//    4    6:istore_1        
		boolean flag;
		if(i > 0)
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

	public final void zzuo()
	{
		zzaee.zzsc();
	//    0    0:aload_0         
	//    1    1:getfield        #278 <Field zzamt zzaee>
	//    2    4:invokevirtual   #1198 <Method void zzamt.zzsc()>
	//    3    7:return          
	}

	public final void zzup()
	{
		if(zzddw == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #316 <Field zznv zzddw>
	//*   2    4:ifnonnull       35
		{
			zzddw = zznq.zzb(zzddx.zzji());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #295 <Field zznw zzddx>
	//    6   12:invokevirtual   #299 <Method zznx zznw.zzji()>
	//    7   15:invokestatic    #307 <Method zznv zznq.zzb(zznx)>
	//    8   18:putfield        #316 <Field zznv zzddw>
			zzddx.zza("native:view_load", zzddw);
	//    9   21:aload_0         
	//   10   22:getfield        #295 <Field zznw zzddx>
	//   11   25:ldc2            #1201 <String "native:view_load">
	//   12   28:aload_0         
	//   13   29:getfield        #316 <Field zznv zzddw>
	//   14   32:invokevirtual   #314 <Method void zznw.zza(String, zznv)>
		}
	//   15   35:return          
	}

	public final zzox zzuq()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzox zzox1 = zzdds;
	//    2    2:aload_0         
	//    3    3:getfield        #921 <Field zzox zzdds>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return zzox1;
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

	public final void zzur()
	{
		setBackgroundColor(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #173 <Method void setBackgroundColor(int)>
	//    3    5:return          
	}

	public final void zzus()
	{
		zzakb.v("Cannot add text view to inner AdWebView");
	//    0    0:ldc2            #1206 <String "Cannot add text view to inner AdWebView">
	//    1    3:invokestatic    #599 <Method void zzakb.v(String)>
	//    2    6:return          
	}

	private zzamt zzaee;
	private final WindowManager zzaeu = (WindowManager)getContext().getSystemService("window");
	private final DisplayMetrics zzagj;
	private final zzci zzbjc;
	private int zzbwy;
	private int zzbwz;
	private int zzbxb;
	private int zzbxc;
	private final zzhs zzcch;
	private String zzchp;
	private Boolean zzcpp;
	private zznv zzdad;
	private final zzash zzdda;
	private final zzbo zzddb;
	private final float zzddc;
	private boolean zzddd;
	private boolean zzdde;
	private zzaqx zzddf;
	private zzd zzddg;
	private zzasi zzddh;
	private boolean zzddi;
	private boolean zzddj;
	private boolean zzddk;
	private boolean zzddl;
	private int zzddm;
	private boolean zzddn;
	private boolean zzddo;
	private zzarl zzddp;
	private boolean zzddq;
	private boolean zzddr;
	private zzox zzdds;
	private int zzddt;
	private int zzddu;
	private zznv zzddv;
	private zznv zzddw;
	private zznw zzddx;
	private WeakReference zzddy;
	private zzd zzddz;
	private boolean zzdea;
	private Map zzdeb;
	private String zzus;
	private final zzw zzwc;
	private final zzang zzyf;
}
