// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.*;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.*;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.lang.ref.WeakReference;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zk, bov, zzwf, wd, 
//			bpa, xo, wx, xg, 
//			bpt, bpe, ya, bqi, 
//			boy, zr, wi, bou, 
//			zzbbi

public final class box
	implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

	public box(Context context, zzwf zzwf1, wd wd1, zzbbi zzbbi, bqi bqi1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void Object()>
	//    6   12:putfield        #58  <Field Object b>
		m = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #60  <Field boolean m>
		n = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #62  <Field boolean n>
	//   13   25:aload_0         
	//   14   26:new             #64  <Class HashSet>
	//   15   29:dup             
	//   16   30:invokespecial   #65  <Method void HashSet()>
	//   17   33:putfield        #67  <Field HashSet s>
	//   18   36:aload_0         
	//   19   37:new             #64  <Class HashSet>
	//   20   40:dup             
	//   21   41:invokespecial   #65  <Method void HashSet()>
	//   22   44:putfield        #69  <Field HashSet u>
	//   23   47:aload_0         
	//   24   48:new             #71  <Class Rect>
	//   25   51:dup             
	//   26   52:invokespecial   #72  <Method void Rect()>
	//   27   55:putfield        #74  <Field Rect v>
		c = new WeakReference(((Object) (wd1)));
	//   28   58:aload_0         
	//   29   59:new             #76  <Class WeakReference>
	//   30   62:dup             
	//   31   63:aload_3         
	//   32   64:invokespecial   #79  <Method void WeakReference(Object)>
	//   33   67:putfield        #81  <Field WeakReference c>
		e = bqi1;
	//   34   70:aload_0         
	//   35   71:aload           5
	//   36   73:putfield        #83  <Field bqi e>
		d = new WeakReference(((Object) (null)));
	//   37   76:aload_0         
	//   38   77:new             #76  <Class WeakReference>
	//   39   80:dup             
	//   40   81:aconst_null     
	//   41   82:invokespecial   #79  <Method void WeakReference(Object)>
	//   42   85:putfield        #85  <Field WeakReference d>
		o = true;
	//   43   88:aload_0         
	//   44   89:iconst_1        
	//   45   90:putfield        #87  <Field boolean o>
		q = false;
	//   46   93:aload_0         
	//   47   94:iconst_0        
	//   48   95:putfield        #89  <Field boolean q>
		t = new zk(200L);
	//   49   98:aload_0         
	//   50   99:new             #91  <Class zk>
	//   51  102:dup             
	//   52  103:ldc2w           #92  <Long 200L>
	//   53  106:invokespecial   #96  <Method void zk(long)>
	//   54  109:putfield        #98  <Field zk t>
		a = new bov(UUID.randomUUID().toString(), zzbbi, zzwf1.a, wd1.k, wd1.a(), zzwf1.h);
	//   55  112:aload_0         
	//   56  113:new             #100 <Class bov>
	//   57  116:dup             
	//   58  117:invokestatic    #106 <Method UUID UUID.randomUUID()>
	//   59  120:invokevirtual   #110 <Method String UUID.toString()>
	//   60  123:aload           4
	//   61  125:aload_2         
	//   62  126:getfield        #115 <Field String zzwf.a>
	//   63  129:aload_3         
	//   64  130:getfield        #120 <Field JSONObject wd.k>
	//   65  133:aload_3         
	//   66  134:invokevirtual   #123 <Method boolean wd.a()>
	//   67  137:aload_2         
	//   68  138:getfield        #125 <Field boolean zzwf.h>
	//   69  141:invokespecial   #128 <Method void bov(String, zzbbi, String, JSONObject, boolean, boolean)>
	//   70  144:putfield        #130 <Field bov a>
		g = (WindowManager)context.getSystemService("window");
	//   71  147:aload_0         
	//   72  148:aload_1         
	//   73  149:ldc1            #132 <String "window">
	//   74  151:invokevirtual   #138 <Method Object Context.getSystemService(String)>
	//   75  154:checkcast       #140 <Class WindowManager>
	//   76  157:putfield        #142 <Field WindowManager g>
		h = (PowerManager)context.getApplicationContext().getSystemService("power");
	//   77  160:aload_0         
	//   78  161:aload_1         
	//   79  162:invokevirtual   #146 <Method Context Context.getApplicationContext()>
	//   80  165:ldc1            #148 <String "power">
	//   81  167:invokevirtual   #138 <Method Object Context.getSystemService(String)>
	//   82  170:checkcast       #150 <Class PowerManager>
	//   83  173:putfield        #152 <Field PowerManager h>
		i = (KeyguardManager)context.getSystemService("keyguard");
	//   84  176:aload_0         
	//   85  177:aload_1         
	//   86  178:ldc1            #154 <String "keyguard">
	//   87  180:invokevirtual   #138 <Method Object Context.getSystemService(String)>
	//   88  183:checkcast       #156 <Class KeyguardManager>
	//   89  186:putfield        #158 <Field KeyguardManager i>
		f = context;
	//   90  189:aload_0         
	//   91  190:aload_1         
	//   92  191:putfield        #160 <Field Context f>
	//   93  194:aload_0         
	//   94  195:new             #162 <Class bpa>
	//   95  198:dup             
	//   96  199:aload_0         
	//   97  200:new             #164 <Class Handler>
	//   98  203:dup             
	//   99  204:invokespecial   #165 <Method void Handler()>
	//  100  207:invokespecial   #168 <Method void bpa(box, Handler)>
	//  101  210:putfield        #170 <Field bpa w>
		f.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, ((android.database.ContentObserver) (w)));
	//  102  213:aload_0         
	//  103  214:getfield        #160 <Field Context f>
	//  104  217:invokevirtual   #174 <Method ContentResolver Context.getContentResolver()>
	//  105  220:getstatic       #180 <Field android.net.Uri android.provider.Settings$System.CONTENT_URI>
	//  106  223:iconst_1        
	//  107  224:aload_0         
	//  108  225:getfield        #170 <Field bpa w>
	//  109  228:invokevirtual   #186 <Method void ContentResolver.registerContentObserver(android.net.Uri, boolean, android.database.ContentObserver)>
		j = context.getResources().getDisplayMetrics();
	//  110  231:aload_0         
	//  111  232:aload_1         
	//  112  233:invokevirtual   #190 <Method Resources Context.getResources()>
	//  113  236:invokevirtual   #196 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  114  239:putfield        #198 <Field DisplayMetrics j>
		context = ((Context) (g.getDefaultDisplay()));
	//  115  242:aload_0         
	//  116  243:getfield        #142 <Field WindowManager g>
	//  117  246:invokeinterface #202 <Method Display WindowManager.getDefaultDisplay()>
	//  118  251:astore_1        
		v.right = ((Display) (context)).getWidth();
	//  119  252:aload_0         
	//  120  253:getfield        #74  <Field Rect v>
	//  121  256:aload_1         
	//  122  257:invokevirtual   #208 <Method int Display.getWidth()>
	//  123  260:putfield        #212 <Field int Rect.right>
		v.bottom = ((Display) (context)).getHeight();
	//  124  263:aload_0         
	//  125  264:getfield        #74  <Field Rect v>
	//  126  267:aload_1         
	//  127  268:invokevirtual   #215 <Method int Display.getHeight()>
	//  128  271:putfield        #218 <Field int Rect.bottom>
		a();
	//  129  274:aload_0         
	//  130  275:invokevirtual   #220 <Method void a()>
	//  131  278:return          
	}

	private static int a(int i1, DisplayMetrics displaymetrics)
	{
		float f1 = displaymetrics.density;
	//    0    0:aload_1         
	//    1    1:getfield        #227 <Field float DisplayMetrics.density>
	//    2    4:fstore_2        
		return (int)((float)i1 / f1);
	//    3    5:iload_0         
	//    4    6:i2f             
	//    5    7:fload_2         
	//    6    8:fdiv            
	//    7    9:f2i             
	//    8   10:ireturn         
	}

	private final JSONObject a(View view, Boolean boolean1)
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       30
			return i().put("isAttachedToWindow", false).put("isScreenOn", j()).put("isVisible", false);
	//    2    4:aload_0         
	//    3    5:invokespecial   #233 <Method JSONObject i()>
	//    4    8:ldc1            #235 <String "isAttachedToWindow">
	//    5   10:iconst_0        
	//    6   11:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//    7   14:ldc1            #243 <String "isScreenOn">
	//    8   16:aload_0         
	//    9   17:invokespecial   #245 <Method boolean j()>
	//   10   20:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   11   23:ldc1            #247 <String "isVisible">
	//   12   25:iconst_0        
	//   13   26:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   14   29:areturn         
		boolean flag = aw.g().a(view);
	//   15   30:invokestatic    #252 <Method xo aw.g()>
	//   16   33:aload_1         
	//   17   34:invokevirtual   #257 <Method boolean xo.a(View)>
	//   18   37:istore_3        
		int ai1[] = new int[2];
	//   19   38:iconst_2        
	//   20   39:newarray        int[]
	//   21   41:astore          7
		int ai[] = new int[2];
	//   22   43:iconst_2        
	//   23   44:newarray        int[]
	//   24   46:astore          6
		try
		{
			view.getLocationOnScreen(ai1);
	//   25   48:aload_1         
	//   26   49:aload           7
	//   27   51:invokevirtual   #263 <Method void View.getLocationOnScreen(int[])>
			view.getLocationInWindow(ai);
	//   28   54:aload_1         
	//   29   55:aload           6
	//   30   57:invokevirtual   #266 <Method void View.getLocationInWindow(int[])>
		}
	//*  31   60:goto            73
		catch(Exception exception)
	//*  32   63:astore          6
		{
			wx.b("Failure getting view location.", ((Throwable) (exception)));
	//   33   65:ldc2            #268 <String "Failure getting view location.">
	//   34   68:aload           6
	//   35   70:invokestatic    #273 <Method void wx.b(String, Throwable)>
		}
		Object obj = ((Object) (new Rect()));
	//   36   73:new             #71  <Class Rect>
	//   37   76:dup             
	//   38   77:invokespecial   #72  <Method void Rect()>
	//   39   80:astore          6
		obj.left = ai1[0];
	//   40   82:aload           6
	//   41   84:aload           7
	//   42   86:iconst_0        
	//   43   87:iaload          
	//   44   88:putfield        #276 <Field int Rect.left>
		obj.top = ai1[1];
	//   45   91:aload           6
	//   46   93:aload           7
	//   47   95:iconst_1        
	//   48   96:iaload          
	//   49   97:putfield        #279 <Field int Rect.top>
		obj.right = ((Rect) (obj)).left + view.getWidth();
	//   50  100:aload           6
	//   51  102:aload           6
	//   52  104:getfield        #276 <Field int Rect.left>
	//   53  107:aload_1         
	//   54  108:invokevirtual   #280 <Method int View.getWidth()>
	//   55  111:iadd            
	//   56  112:putfield        #212 <Field int Rect.right>
		obj.bottom = ((Rect) (obj)).top + view.getHeight();
	//   57  115:aload           6
	//   58  117:aload           6
	//   59  119:getfield        #279 <Field int Rect.top>
	//   60  122:aload_1         
	//   61  123:invokevirtual   #281 <Method int View.getHeight()>
	//   62  126:iadd            
	//   63  127:putfield        #218 <Field int Rect.bottom>
		Rect rect = new Rect();
	//   64  130:new             #71  <Class Rect>
	//   65  133:dup             
	//   66  134:invokespecial   #72  <Method void Rect()>
	//   67  137:astore          8
		boolean flag1 = view.getGlobalVisibleRect(rect, ((android.graphics.Point) (null)));
	//   68  139:aload_1         
	//   69  140:aload           8
	//   70  142:aconst_null     
	//   71  143:invokevirtual   #285 <Method boolean View.getGlobalVisibleRect(Rect, android.graphics.Point)>
	//   72  146:istore          4
		Rect rect1 = new Rect();
	//   73  148:new             #71  <Class Rect>
	//   74  151:dup             
	//   75  152:invokespecial   #72  <Method void Rect()>
	//   76  155:astore          9
		boolean flag2 = view.getLocalVisibleRect(rect1);
	//   77  157:aload_1         
	//   78  158:aload           9
	//   79  160:invokevirtual   #289 <Method boolean View.getLocalVisibleRect(Rect)>
	//   80  163:istore          5
		Rect rect2 = new Rect();
	//   81  165:new             #71  <Class Rect>
	//   82  168:dup             
	//   83  169:invokespecial   #72  <Method void Rect()>
	//   84  172:astore          10
		view.getHitRect(rect2);
	//   85  174:aload_1         
	//   86  175:aload           10
	//   87  177:invokevirtual   #293 <Method void View.getHitRect(Rect)>
		JSONObject jsonobject = i();
	//   88  180:aload_0         
	//   89  181:invokespecial   #233 <Method JSONObject i()>
	//   90  184:astore          7
		jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", flag).put("viewBox", ((Object) ((new JSONObject()).put("top", a(v.top, j)).put("bottom", a(v.bottom, j)).put("left", a(v.left, j)).put("right", a(v.right, j))))).put("adBox", ((Object) ((new JSONObject()).put("top", a(((Rect) (obj)).top, j)).put("bottom", a(((Rect) (obj)).bottom, j)).put("left", a(((Rect) (obj)).left, j)).put("right", a(((Rect) (obj)).right, j))))).put("globalVisibleBox", ((Object) ((new JSONObject()).put("top", a(rect.top, j)).put("bottom", a(rect.bottom, j)).put("left", a(rect.left, j)).put("right", a(rect.right, j))))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", ((Object) ((new JSONObject()).put("top", a(rect1.top, j)).put("bottom", a(rect1.bottom, j)).put("left", a(rect1.left, j)).put("right", a(rect1.right, j))))).put("localVisibleBoxVisible", flag2).put("hitBox", ((Object) ((new JSONObject()).put("top", a(rect2.top, j)).put("bottom", a(rect2.bottom, j)).put("left", a(rect2.left, j)).put("right", a(rect2.right, j))))).put("screenDensity", j.density);
	//   91  186:aload           7
	//   92  188:ldc2            #295 <String "windowVisibility">
	//   93  191:aload_1         
	//   94  192:invokevirtual   #298 <Method int View.getWindowVisibility()>
	//   95  195:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//   96  198:ldc1            #235 <String "isAttachedToWindow">
	//   97  200:iload_3         
	//   98  201:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   99  204:ldc2            #303 <String "viewBox">
	//  100  207:new             #237 <Class JSONObject>
	//  101  210:dup             
	//  102  211:invokespecial   #304 <Method void JSONObject()>
	//  103  214:ldc2            #305 <String "top">
	//  104  217:aload_0         
	//  105  218:getfield        #74  <Field Rect v>
	//  106  221:getfield        #279 <Field int Rect.top>
	//  107  224:aload_0         
	//  108  225:getfield        #198 <Field DisplayMetrics j>
	//  109  228:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  110  231:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  111  234:ldc2            #308 <String "bottom">
	//  112  237:aload_0         
	//  113  238:getfield        #74  <Field Rect v>
	//  114  241:getfield        #218 <Field int Rect.bottom>
	//  115  244:aload_0         
	//  116  245:getfield        #198 <Field DisplayMetrics j>
	//  117  248:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  118  251:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  119  254:ldc2            #309 <String "left">
	//  120  257:aload_0         
	//  121  258:getfield        #74  <Field Rect v>
	//  122  261:getfield        #276 <Field int Rect.left>
	//  123  264:aload_0         
	//  124  265:getfield        #198 <Field DisplayMetrics j>
	//  125  268:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  126  271:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  127  274:ldc2            #310 <String "right">
	//  128  277:aload_0         
	//  129  278:getfield        #74  <Field Rect v>
	//  130  281:getfield        #212 <Field int Rect.right>
	//  131  284:aload_0         
	//  132  285:getfield        #198 <Field DisplayMetrics j>
	//  133  288:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  134  291:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  135  294:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//  136  297:ldc2            #315 <String "adBox">
	//  137  300:new             #237 <Class JSONObject>
	//  138  303:dup             
	//  139  304:invokespecial   #304 <Method void JSONObject()>
	//  140  307:ldc2            #305 <String "top">
	//  141  310:aload           6
	//  142  312:getfield        #279 <Field int Rect.top>
	//  143  315:aload_0         
	//  144  316:getfield        #198 <Field DisplayMetrics j>
	//  145  319:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  146  322:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  147  325:ldc2            #308 <String "bottom">
	//  148  328:aload           6
	//  149  330:getfield        #218 <Field int Rect.bottom>
	//  150  333:aload_0         
	//  151  334:getfield        #198 <Field DisplayMetrics j>
	//  152  337:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  153  340:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  154  343:ldc2            #309 <String "left">
	//  155  346:aload           6
	//  156  348:getfield        #276 <Field int Rect.left>
	//  157  351:aload_0         
	//  158  352:getfield        #198 <Field DisplayMetrics j>
	//  159  355:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  160  358:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  161  361:ldc2            #310 <String "right">
	//  162  364:aload           6
	//  163  366:getfield        #212 <Field int Rect.right>
	//  164  369:aload_0         
	//  165  370:getfield        #198 <Field DisplayMetrics j>
	//  166  373:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  167  376:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  168  379:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//  169  382:ldc2            #317 <String "globalVisibleBox">
	//  170  385:new             #237 <Class JSONObject>
	//  171  388:dup             
	//  172  389:invokespecial   #304 <Method void JSONObject()>
	//  173  392:ldc2            #305 <String "top">
	//  174  395:aload           8
	//  175  397:getfield        #279 <Field int Rect.top>
	//  176  400:aload_0         
	//  177  401:getfield        #198 <Field DisplayMetrics j>
	//  178  404:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  179  407:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  180  410:ldc2            #308 <String "bottom">
	//  181  413:aload           8
	//  182  415:getfield        #218 <Field int Rect.bottom>
	//  183  418:aload_0         
	//  184  419:getfield        #198 <Field DisplayMetrics j>
	//  185  422:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  186  425:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  187  428:ldc2            #309 <String "left">
	//  188  431:aload           8
	//  189  433:getfield        #276 <Field int Rect.left>
	//  190  436:aload_0         
	//  191  437:getfield        #198 <Field DisplayMetrics j>
	//  192  440:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  193  443:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  194  446:ldc2            #310 <String "right">
	//  195  449:aload           8
	//  196  451:getfield        #212 <Field int Rect.right>
	//  197  454:aload_0         
	//  198  455:getfield        #198 <Field DisplayMetrics j>
	//  199  458:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  200  461:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  201  464:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//  202  467:ldc2            #319 <String "globalVisibleBoxVisible">
	//  203  470:iload           4
	//  204  472:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//  205  475:ldc2            #321 <String "localVisibleBox">
	//  206  478:new             #237 <Class JSONObject>
	//  207  481:dup             
	//  208  482:invokespecial   #304 <Method void JSONObject()>
	//  209  485:ldc2            #305 <String "top">
	//  210  488:aload           9
	//  211  490:getfield        #279 <Field int Rect.top>
	//  212  493:aload_0         
	//  213  494:getfield        #198 <Field DisplayMetrics j>
	//  214  497:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  215  500:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  216  503:ldc2            #308 <String "bottom">
	//  217  506:aload           9
	//  218  508:getfield        #218 <Field int Rect.bottom>
	//  219  511:aload_0         
	//  220  512:getfield        #198 <Field DisplayMetrics j>
	//  221  515:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  222  518:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  223  521:ldc2            #309 <String "left">
	//  224  524:aload           9
	//  225  526:getfield        #276 <Field int Rect.left>
	//  226  529:aload_0         
	//  227  530:getfield        #198 <Field DisplayMetrics j>
	//  228  533:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  229  536:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  230  539:ldc2            #310 <String "right">
	//  231  542:aload           9
	//  232  544:getfield        #212 <Field int Rect.right>
	//  233  547:aload_0         
	//  234  548:getfield        #198 <Field DisplayMetrics j>
	//  235  551:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  236  554:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  237  557:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//  238  560:ldc2            #323 <String "localVisibleBoxVisible">
	//  239  563:iload           5
	//  240  565:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//  241  568:ldc2            #325 <String "hitBox">
	//  242  571:new             #237 <Class JSONObject>
	//  243  574:dup             
	//  244  575:invokespecial   #304 <Method void JSONObject()>
	//  245  578:ldc2            #305 <String "top">
	//  246  581:aload           10
	//  247  583:getfield        #279 <Field int Rect.top>
	//  248  586:aload_0         
	//  249  587:getfield        #198 <Field DisplayMetrics j>
	//  250  590:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  251  593:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  252  596:ldc2            #308 <String "bottom">
	//  253  599:aload           10
	//  254  601:getfield        #218 <Field int Rect.bottom>
	//  255  604:aload_0         
	//  256  605:getfield        #198 <Field DisplayMetrics j>
	//  257  608:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  258  611:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  259  614:ldc2            #309 <String "left">
	//  260  617:aload           10
	//  261  619:getfield        #276 <Field int Rect.left>
	//  262  622:aload_0         
	//  263  623:getfield        #198 <Field DisplayMetrics j>
	//  264  626:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  265  629:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  266  632:ldc2            #310 <String "right">
	//  267  635:aload           10
	//  268  637:getfield        #212 <Field int Rect.right>
	//  269  640:aload_0         
	//  270  641:getfield        #198 <Field DisplayMetrics j>
	//  271  644:invokestatic    #307 <Method int a(int, DisplayMetrics)>
	//  272  647:invokevirtual   #301 <Method JSONObject JSONObject.put(String, int)>
	//  273  650:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//  274  653:ldc2            #327 <String "screenDensity">
	//  275  656:aload_0         
	//  276  657:getfield        #198 <Field DisplayMetrics j>
	//  277  660:getfield        #227 <Field float DisplayMetrics.density>
	//  278  663:f2d             
	//  279  664:invokevirtual   #330 <Method JSONObject JSONObject.put(String, double)>
	//  280  667:pop             
		obj = ((Object) (boolean1));
	//  281  668:aload_2         
	//  282  669:astore          6
		if(boolean1 == null)
	//* 283  671:aload_2         
	//* 284  672:ifnonnull       695
			obj = ((Object) (Boolean.valueOf(aw.e().a(view, h, i))));
	//  285  675:invokestatic    #333 <Method xg aw.e()>
	//  286  678:aload_1         
	//  287  679:aload_0         
	//  288  680:getfield        #152 <Field PowerManager h>
	//  289  683:aload_0         
	//  290  684:getfield        #158 <Field KeyguardManager i>
	//  291  687:invokevirtual   #338 <Method boolean xg.a(View, PowerManager, KeyguardManager)>
	//  292  690:invokestatic    #344 <Method Boolean Boolean.valueOf(boolean)>
	//  293  693:astore          6
		jsonobject.put("isVisible", ((Boolean) (obj)).booleanValue());
	//  294  695:aload           7
	//  295  697:ldc1            #247 <String "isVisible">
	//  296  699:aload           6
	//  297  701:invokevirtual   #347 <Method boolean Boolean.booleanValue()>
	//  298  704:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//  299  707:pop             
		return jsonobject;
	//  300  708:aload           7
	//  301  710:areturn         
	}

	private static JSONObject a(JSONObject jsonobject)
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #350 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #351 <Method void JSONArray()>
	//    3    7:astore_1        
		JSONObject jsonobject1 = new JSONObject();
	//    4    8:new             #237 <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #304 <Method void JSONObject()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (jsonobject)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #354 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject1.put("units", ((Object) (jsonarray)));
	//   12   22:aload_2         
	//   13   23:ldc2            #356 <String "units">
	//   14   26:aload_1         
	//   15   27:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return jsonobject1;
	//   17   31:aload_2         
	//   18   32:areturn         
	}

	private final void a(JSONObject jsonobject, boolean flag)
	{
		int i1;
		int j1;
		ArrayList arraylist;
		Object obj;
		try
		{
			jsonobject = a(jsonobject);
	//    0    0:aload_1         
	//    1    1:invokestatic    #361 <Method JSONObject a(JSONObject)>
	//    2    4:astore_1        
			arraylist = (ArrayList)new ArrayList(((java.util.Collection) (u)));
	//    3    5:new             #363 <Class ArrayList>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field HashSet u>
	//    7   13:invokespecial   #366 <Method void ArrayList(java.util.Collection)>
	//    8   16:checkcast       #363 <Class ArrayList>
	//    9   19:astore          5
			j1 = arraylist.size();
	//   10   21:aload           5
	//   11   23:invokevirtual   #369 <Method int ArrayList.size()>
	//   12   26:istore          4
		}
	//*  13   28:iconst_0        
	//*  14   29:istore_3        
	//*  15   30:iload_3         
	//*  16   31:iload           4
	//*  17   33:icmpge          63
	//*  18   36:aload           5
	//*  19   38:iload_3         
	//*  20   39:invokevirtual   #373 <Method Object ArrayList.get(int)>
	//*  21   42:astore          6
	//*  22   44:iload_3         
	//*  23   45:iconst_1        
	//*  24   46:iadd            
	//*  25   47:istore_3        
	//*  26   48:aload           6
	//*  27   50:checkcast       #375 <Class bpt>
	//*  28   53:aload_1         
	//*  29   54:iload_2         
	//*  30   55:invokeinterface #377 <Method void bpt.a(JSONObject, boolean)>
	//*  31   60:goto            30
	//*  32   63:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  33   64:astore_1        
		{
			wx.b("Skipping active view message.", ((Throwable) (jsonobject)));
	//   34   65:ldc2            #379 <String "Skipping active view message.">
	//   35   68:aload_1         
	//   36   69:invokestatic    #273 <Method void wx.b(String, Throwable)>
			return;
	//   37   72:return          
		}
		i1 = 0;
		if(i1 >= j1)
			break; /* Loop/switch isn't completed */
		obj = arraylist.get(i1);
		i1++;
		((bpt)obj).a(jsonobject, flag);
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_30;
_L1:
	}

	private final void g()
	{
		bpe bpe1 = k;
	//    0    0:aload_0         
	//    1    1:getfield        #381 <Field bpe k>
	//    2    4:astore_1        
		if(bpe1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			bpe1.a(this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokeinterface #386 <Method void bpe.a(box)>
	//    8   16:return          
	}

	private final void h()
	{
		ViewTreeObserver viewtreeobserver = (ViewTreeObserver)d.get();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field WeakReference d>
	//    2    4:invokevirtual   #389 <Method Object WeakReference.get()>
	//    3    7:checkcast       #391 <Class ViewTreeObserver>
	//    4   10:astore_1        
		if(viewtreeobserver != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          34
		{
			if(!viewtreeobserver.isAlive())
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #394 <Method boolean ViewTreeObserver.isAlive()>
	//*   9   19:ifne            23
			{
				return;
	//   10   22:return          
			} else
			{
				viewtreeobserver.removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #398 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
				viewtreeobserver.removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #402 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				return;
	//   17   33:return          
			}
		} else
		{
			return;
	//   18   34:return          
		}
	}

	private final JSONObject i()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #237 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #304 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("afmaVersion", ((Object) (a.b()))).put("activeViewJSON", ((Object) (a.c()))).put("timestamp", aw.l().b()).put("adFormat", ((Object) (a.a()))).put("hashCode", ((Object) (a.d()))).put("isMraid", a.e()).put("isStopped", n).put("isPaused", m).put("isNative", a.f()).put("isScreenOn", j()).put("appMuted", aw.j().b()).put("appVolume", aw.j().a()).put("deviceVolume", x);
	//    4    8:aload_1         
	//    5    9:ldc2            #404 <String "afmaVersion">
	//    6   12:aload_0         
	//    7   13:getfield        #130 <Field bov a>
	//    8   16:invokevirtual   #406 <Method String bov.b()>
	//    9   19:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//   10   22:ldc2            #408 <String "activeViewJSON">
	//   11   25:aload_0         
	//   12   26:getfield        #130 <Field bov a>
	//   13   29:invokevirtual   #410 <Method JSONObject bov.c()>
	//   14   32:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//   15   35:ldc2            #412 <String "timestamp">
	//   16   38:invokestatic    #415 <Method e aw.l()>
	//   17   41:invokeinterface #420 <Method long e.b()>
	//   18   46:invokevirtual   #423 <Method JSONObject JSONObject.put(String, long)>
	//   19   49:ldc2            #425 <String "adFormat">
	//   20   52:aload_0         
	//   21   53:getfield        #130 <Field bov a>
	//   22   56:invokevirtual   #427 <Method String bov.a()>
	//   23   59:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//   24   62:ldc2            #429 <String "hashCode">
	//   25   65:aload_0         
	//   26   66:getfield        #130 <Field bov a>
	//   27   69:invokevirtual   #431 <Method String bov.d()>
	//   28   72:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//   29   75:ldc2            #433 <String "isMraid">
	//   30   78:aload_0         
	//   31   79:getfield        #130 <Field bov a>
	//   32   82:invokevirtual   #435 <Method boolean com.google.android.gms.internal.ads.bov.e()>
	//   33   85:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   34   88:ldc2            #437 <String "isStopped">
	//   35   91:aload_0         
	//   36   92:getfield        #62  <Field boolean n>
	//   37   95:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   38   98:ldc2            #439 <String "isPaused">
	//   39  101:aload_0         
	//   40  102:getfield        #60  <Field boolean m>
	//   41  105:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   42  108:ldc2            #441 <String "isNative">
	//   43  111:aload_0         
	//   44  112:getfield        #130 <Field bov a>
	//   45  115:invokevirtual   #443 <Method boolean bov.f()>
	//   46  118:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   47  121:ldc1            #243 <String "isScreenOn">
	//   48  123:aload_0         
	//   49  124:invokespecial   #245 <Method boolean j()>
	//   50  127:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   51  130:ldc2            #445 <String "appMuted">
	//   52  133:invokestatic    #448 <Method ya aw.j()>
	//   53  136:invokevirtual   #452 <Method boolean ya.b()>
	//   54  139:invokevirtual   #241 <Method JSONObject JSONObject.put(String, boolean)>
	//   55  142:ldc2            #454 <String "appVolume">
	//   56  145:invokestatic    #448 <Method ya aw.j()>
	//   57  148:invokevirtual   #457 <Method float ya.a()>
	//   58  151:f2d             
	//   59  152:invokevirtual   #330 <Method JSONObject JSONObject.put(String, double)>
	//   60  155:ldc2            #459 <String "deviceVolume">
	//   61  158:aload_0         
	//   62  159:getfield        #461 <Field float x>
	//   63  162:f2d             
	//   64  163:invokevirtual   #330 <Method JSONObject JSONObject.put(String, double)>
	//   65  166:pop             
		return jsonobject;
	//   66  167:aload_1         
	//   67  168:areturn         
	}

	private final boolean j()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #466 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          16
			return h.isInteractive();
	//    3    8:aload_0         
	//    4    9:getfield        #152 <Field PowerManager h>
	//    5   12:invokevirtual   #469 <Method boolean PowerManager.isInteractive()>
	//    6   15:ireturn         
		else
			return h.isScreenOn();
	//    7   16:aload_0         
	//    8   17:getfield        #152 <Field PowerManager h>
	//    9   20:invokevirtual   #471 <Method boolean PowerManager.isScreenOn()>
	//   10   23:ireturn         
	}

	public final void a()
	{
		x = ya.a(f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #160 <Field Context f>
	//    3    5:invokestatic    #474 <Method float ya.a(Context)>
	//    4    8:putfield        #461 <Field float x>
	//    5   11:return          
	}

	protected final void a(int i1)
	{
		Object obj2 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object b>
	//    2    4:astore          6
		obj2;
	//    3    6:aload           6
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj = ((Object) (u.iterator()));
	//    5    9:aload_0         
	//    6   10:getfield        #69  <Field HashSet u>
	//    7   13:invokevirtual   #483 <Method Iterator HashSet.iterator()>
	//    8   16:astore          5
_L4:
		if(!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
	//    9   18:aload           5
	//   10   20:invokeinterface #488 <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            365
_L1:
		if(!((bpt)((Iterator) (obj)).next()).a()) goto _L4; else goto _L3
	//   12   28:aload           5
	//   13   30:invokeinterface #491 <Method Object Iterator.next()>
	//   14   35:checkcast       #375 <Class bpt>
	//   15   38:invokeinterface #492 <Method boolean bpt.a()>
	//   16   43:ifeq            18
_L3:
		boolean flag = true;
	//   17   46:iconst_1        
	//   18   47:istore_2        
	//*  19   48:goto            51
_L11:
		if(!flag) goto _L6; else goto _L5
	//   20   51:iload_2         
	//   21   52:ifeq            353
_L5:
		if(o) goto _L7; else goto _L6
	//   22   55:aload_0         
	//   23   56:getfield        #87  <Field boolean o>
	//   24   59:ifne            65
	//*  25   62:goto            353
_L7:
		obj = ((Object) (e.a()));
	//   26   65:aload_0         
	//   27   66:getfield        #83  <Field bqi e>
	//   28   69:invokeinterface #497 <Method View bqi.a()>
	//   29   74:astore          5
		if(obj == null) goto _L9; else goto _L8
	//   30   76:aload           5
	//   31   78:ifnull          370
_L8:
		if(!aw.e().a(((View) (obj)), h, i)) goto _L9; else goto _L10
	//   32   81:invokestatic    #333 <Method xg aw.e()>
	//   33   84:aload           5
	//   34   86:aload_0         
	//   35   87:getfield        #152 <Field PowerManager h>
	//   36   90:aload_0         
	//   37   91:getfield        #158 <Field KeyguardManager i>
	//   38   94:invokevirtual   #338 <Method boolean xg.a(View, PowerManager, KeyguardManager)>
	//   39   97:ifeq            370
_L10:
		boolean flag1 = true;
	//   40  100:iconst_1        
	//   41  101:istore_3        
	//*  42  102:goto            105
_L12:
		if(obj == null || !flag1)
			break MISSING_BLOCK_LABEL_375;
	//   43  105:aload           5
	//   44  107:ifnull          375
	//   45  110:iload_3         
	//   46  111:ifeq            375
		if(!((View) (obj)).getGlobalVisibleRect(new Rect(), ((android.graphics.Point) (null))))
			break MISSING_BLOCK_LABEL_375;
	//   47  114:aload           5
	//   48  116:new             #71  <Class Rect>
	//   49  119:dup             
	//   50  120:invokespecial   #72  <Method void Rect()>
	//   51  123:aconst_null     
	//   52  124:invokevirtual   #285 <Method boolean View.getGlobalVisibleRect(Rect, android.graphics.Point)>
	//   53  127:ifeq            375
		boolean flag2 = true;
	//   54  130:iconst_1        
	//   55  131:istore          4
	//*  56  133:goto            136
_L13:
		if(!e.b())
			break MISSING_BLOCK_LABEL_156;
	//   57  136:aload_0         
	//   58  137:getfield        #83  <Field bqi e>
	//   59  140:invokeinterface #498 <Method boolean bqi.b()>
	//   60  145:ifeq            156
		b();
	//   61  148:aload_0         
	//   62  149:invokevirtual   #500 <Method void b()>
		obj2;
	//   63  152:aload           6
		JVM INSTR monitorexit ;
	//   64  154:monitorexit     
		return;
	//   65  155:return          
		if(i1 != 1)
			break MISSING_BLOCK_LABEL_184;
	//   66  156:iload_1         
	//   67  157:iconst_1        
	//   68  158:icmpne          184
		if(t.a() || flag2 != q)
			break MISSING_BLOCK_LABEL_184;
	//   69  161:aload_0         
	//   70  162:getfield        #98  <Field zk t>
	//   71  165:invokevirtual   #501 <Method boolean zk.a()>
	//   72  168:ifne            184
	//   73  171:iload           4
	//   74  173:aload_0         
	//   75  174:getfield        #89  <Field boolean q>
	//   76  177:icmpne          184
		obj2;
	//   77  180:aload           6
		JVM INSTR monitorexit ;
	//   78  182:monitorexit     
		return;
	//   79  183:return          
		if(flag2)
			break MISSING_BLOCK_LABEL_205;
	//   80  184:iload           4
	//   81  186:ifne            205
		if(q || i1 != 1)
			break MISSING_BLOCK_LABEL_205;
	//   82  189:aload_0         
	//   83  190:getfield        #89  <Field boolean q>
	//   84  193:ifne            205
	//   85  196:iload_1         
	//   86  197:iconst_1        
	//   87  198:icmpne          205
		obj2;
	//   88  201:aload           6
		JVM INSTR monitorexit ;
	//   89  203:monitorexit     
		return;
	//   90  204:return          
		a(a(((View) (obj)), Boolean.valueOf(flag1)), false);
	//   91  205:aload_0         
	//   92  206:aload_0         
	//   93  207:aload           5
	//   94  209:iload_3         
	//   95  210:invokestatic    #344 <Method Boolean Boolean.valueOf(boolean)>
	//   96  213:invokespecial   #503 <Method JSONObject a(View, Boolean)>
	//   97  216:iconst_0        
	//   98  217:invokespecial   #504 <Method void a(JSONObject, boolean)>
		q = flag2;
	//   99  220:aload_0         
	//  100  221:iload           4
	//  101  223:putfield        #89  <Field boolean q>
		break MISSING_BLOCK_LABEL_244;
	//  102  226:goto            244
		Object obj1;
		obj1;
	//  103  229:astore          5
		break MISSING_BLOCK_LABEL_236;
	//  104  231:goto            236
		obj1;
	//  105  234:astore          5
		wx.a("Active view update failed.", ((Throwable) (obj1)));
	//  106  236:ldc2            #506 <String "Active view update failed.">
	//  107  239:aload           5
	//  108  241:invokestatic    #508 <Method void wx.a(String, Throwable)>
		Object obj3 = ((Object) (e.c().a()));
	//  109  244:aload_0         
	//  110  245:getfield        #83  <Field bqi e>
	//  111  248:invokeinterface #511 <Method bqi bqi.c()>
	//  112  253:invokeinterface #497 <Method View bqi.a()>
	//  113  258:astore          7
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_345;
	//  114  260:aload           7
	//  115  262:ifnull          345
		obj1 = ((Object) ((ViewTreeObserver)d.get()));
	//  116  265:aload_0         
	//  117  266:getfield        #85  <Field WeakReference d>
	//  118  269:invokevirtual   #389 <Method Object WeakReference.get()>
	//  119  272:checkcast       #391 <Class ViewTreeObserver>
	//  120  275:astore          5
		obj3 = ((Object) (((View) (obj3)).getViewTreeObserver()));
	//  121  277:aload           7
	//  122  279:invokevirtual   #515 <Method ViewTreeObserver View.getViewTreeObserver()>
	//  123  282:astore          7
		if(obj3 == obj1)
			break MISSING_BLOCK_LABEL_345;
	//  124  284:aload           7
	//  125  286:aload           5
	//  126  288:if_acmpeq       345
		h();
	//  127  291:aload_0         
	//  128  292:invokespecial   #517 <Method void h()>
		if(!l)
			break MISSING_BLOCK_LABEL_315;
	//  129  295:aload_0         
	//  130  296:getfield        #519 <Field boolean l>
	//  131  299:ifeq            315
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_332;
	//  132  302:aload           5
	//  133  304:ifnull          332
		if(!((ViewTreeObserver) (obj1)).isAlive())
			break MISSING_BLOCK_LABEL_332;
	//  134  307:aload           5
	//  135  309:invokevirtual   #394 <Method boolean ViewTreeObserver.isAlive()>
	//  136  312:ifeq            332
		l = true;
	//  137  315:aload_0         
	//  138  316:iconst_1        
	//  139  317:putfield        #519 <Field boolean l>
		((ViewTreeObserver) (obj3)).addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//  140  320:aload           7
	//  141  322:aload_0         
	//  142  323:invokevirtual   #522 <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
		((ViewTreeObserver) (obj3)).addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//  143  326:aload           7
	//  144  328:aload_0         
	//  145  329:invokevirtual   #525 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		d = new WeakReference(obj3);
	//  146  332:aload_0         
	//  147  333:new             #76  <Class WeakReference>
	//  148  336:dup             
	//  149  337:aload           7
	//  150  339:invokespecial   #79  <Method void WeakReference(Object)>
	//  151  342:putfield        #85  <Field WeakReference d>
		g();
	//  152  345:aload_0         
	//  153  346:invokespecial   #527 <Method void g()>
		obj2;
	//  154  349:aload           6
		JVM INSTR monitorexit ;
	//  155  351:monitorexit     
		return;
	//  156  352:return          
_L6:
		obj2;
	//  157  353:aload           6
		JVM INSTR monitorexit ;
	//  158  355:monitorexit     
		return;
	//  159  356:return          
		obj1;
	//  160  357:astore          5
		obj2;
	//  161  359:aload           6
		JVM INSTR monitorexit ;
	//  162  361:monitorexit     
		throw obj1;
	//  163  362:aload           5
	//  164  364:athrow          
_L2:
		flag = false;
	//  165  365:iconst_0        
	//  166  366:istore_2        
		  goto _L11
	//* 167  367:goto            51
_L9:
		flag1 = false;
	//  168  370:iconst_0        
	//  169  371:istore_3        
		  goto _L12
	//* 170  372:goto            105
		flag2 = false;
	//  171  375:iconst_0        
	//  172  376:istore          4
		  goto _L13
	//* 173  378:goto            136
	}

	public final void a(bpe bpe1)
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			k = bpe1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #381 <Field bpe k>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		bpe1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw bpe1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void a(bpt bpt1)
	{
		if(!u.isEmpty())
			break MISSING_BLOCK_LABEL_93;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field HashSet u>
	//    2    4:invokevirtual   #532 <Method boolean HashSet.isEmpty()>
	//    3    7:ifeq            93
		Object obj = b;
	//    4   10:aload_0         
	//    5   11:getfield        #58  <Field Object b>
	//    6   14:astore_2        
		obj;
	//    7   15:aload_2         
		JVM INSTR monitorenter ;
	//    8   16:monitorenter    
		if(r == null) goto _L2; else goto _L1
	//    9   17:aload_0         
	//   10   18:getfield        #534 <Field BroadcastReceiver r>
	//   11   21:ifnull          29
	//*  12   24:aload_2         
	//*  13   25:monitorexit     
	//*  14   26:goto            80
_L2:
		IntentFilter intentfilter = new IntentFilter();
	//   15   29:new             #536 <Class IntentFilter>
	//   16   32:dup             
	//   17   33:invokespecial   #537 <Method void IntentFilter()>
	//   18   36:astore_3        
		intentfilter.addAction("android.intent.action.SCREEN_ON");
	//   19   37:aload_3         
	//   20   38:ldc2            #539 <String "android.intent.action.SCREEN_ON">
	//   21   41:invokevirtual   #543 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.SCREEN_OFF");
	//   22   44:aload_3         
	//   23   45:ldc2            #545 <String "android.intent.action.SCREEN_OFF">
	//   24   48:invokevirtual   #543 <Method void IntentFilter.addAction(String)>
		r = ((BroadcastReceiver) (new boy(this)));
	//   25   51:aload_0         
	//   26   52:new             #547 <Class boy>
	//   27   55:dup             
	//   28   56:aload_0         
	//   29   57:invokespecial   #549 <Method void boy(box)>
	//   30   60:putfield        #534 <Field BroadcastReceiver r>
		aw.B().a(f, r, intentfilter);
	//   31   63:invokestatic    #553 <Method zr aw.B()>
	//   32   66:aload_0         
	//   33   67:getfield        #160 <Field Context f>
	//   34   70:aload_0         
	//   35   71:getfield        #534 <Field BroadcastReceiver r>
	//   36   74:aload_3         
	//   37   75:invokevirtual   #558 <Method void zr.a(Context, BroadcastReceiver, IntentFilter)>
		obj;
	//   38   78:aload_2         
		JVM INSTR monitorexit ;
	//   39   79:monitorexit     
_L1:
		a(3);
	//   40   80:aload_0         
	//   41   81:iconst_3        
	//   42   82:invokevirtual   #560 <Method void a(int)>
		break MISSING_BLOCK_LABEL_93;
	//   43   85:goto            93
		bpt1;
	//   44   88:astore_1        
		obj;
	//   45   89:aload_2         
		JVM INSTR monitorexit ;
	//   46   90:monitorexit     
		throw bpt1;
	//   47   91:aload_1         
	//   48   92:athrow          
		u.add(((Object) (bpt1)));
	//   49   93:aload_0         
	//   50   94:getfield        #69  <Field HashSet u>
	//   51   97:aload_1         
	//   52   98:invokevirtual   #564 <Method boolean HashSet.add(Object)>
	//   53  101:pop             
		try
		{
			bpt1.a(a(a(e.a(), ((Boolean) (null)))), false);
	//   54  102:aload_1         
	//   55  103:aload_0         
	//   56  104:aload_0         
	//   57  105:getfield        #83  <Field bqi e>
	//   58  108:invokeinterface #497 <Method View bqi.a()>
	//   59  113:aconst_null     
	//   60  114:invokespecial   #503 <Method JSONObject a(View, Boolean)>
	//   61  117:invokestatic    #361 <Method JSONObject a(JSONObject)>
	//   62  120:iconst_0        
	//   63  121:invokeinterface #377 <Method void bpt.a(JSONObject, boolean)>
			return;
	//   64  126:return          
		}
		// Misplaced declaration of an exception variable
		catch(bpt bpt1)
	//*  65  127:astore_1        
		{
			wx.b("Skipping measurement update for new client.", ((Throwable) (bpt1)));
	//   66  128:ldc2            #566 <String "Skipping measurement update for new client.">
	//   67  131:aload_1         
	//   68  132:invokestatic    #273 <Method void wx.b(String, Throwable)>
		}
		return;
	//   69  135:return          
	}

	final void a(bpt bpt1, Map map)
	{
		map = ((Map) (String.valueOf(((Object) (a.d())))));
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field bov a>
	//    2    4:invokevirtual   #431 <Method String bov.d()>
	//    3    7:invokestatic    #572 <Method String String.valueOf(Object)>
	//    4   10:astore_2        
		if(((String) (map)).length() != 0)
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #575 <Method int String.length()>
	//*   7   15:ifeq            29
			map = ((Map) ("Received request to untrack: ".concat(((String) (map)))));
	//    8   18:ldc2            #577 <String "Received request to untrack: ">
	//    9   21:aload_2         
	//   10   22:invokevirtual   #581 <Method String String.concat(String)>
	//   11   25:astore_2        
		else
	//*  12   26:goto            40
			map = ((Map) (new String("Received request to untrack: ")));
	//   13   29:new             #569 <Class String>
	//   14   32:dup             
	//   15   33:ldc2            #577 <String "Received request to untrack: ">
	//   16   36:invokespecial   #583 <Method void String(String)>
	//   17   39:astore_2        
		wx.b(((String) (map)));
	//   18   40:aload_2         
	//   19   41:invokestatic    #585 <Method void wx.b(String)>
		b(bpt1);
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:invokevirtual   #587 <Method void b(bpt)>
	//   23   49:return          
	}

	final boolean a(Map map)
	{
		if(map == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		map = ((Map) ((String)map.get("hashCode")));
	//    4    6:aload_1         
	//    5    7:ldc2            #429 <String "hashCode">
	//    6   10:invokeinterface #593 <Method Object Map.get(Object)>
	//    7   15:checkcast       #569 <Class String>
	//    8   18:astore_1        
		return !TextUtils.isEmpty(((CharSequence) (map))) && ((String) (map)).equals(((Object) (a.d())));
	//    9   19:aload_1         
	//   10   20:invokestatic    #598 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   11   23:ifne            42
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #130 <Field bov a>
	//   15   31:invokevirtual   #431 <Method String bov.d()>
	//   16   34:invokevirtual   #601 <Method boolean String.equals(Object)>
	//   17   37:ifeq            42
	//   18   40:iconst_1        
	//   19   41:ireturn         
	//   20   42:iconst_0        
	//   21   43:ireturn         
	}

	public final void b()
	{
		Object obj1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object b>
	//    2    4:astore_2        
		obj1;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!o)
			break MISSING_BLOCK_LABEL_107;
	//    5    7:aload_0         
	//    6    8:getfield        #87  <Field boolean o>
	//    7   11:ifeq            107
		p = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #603 <Field boolean p>
		JSONObject jsonobject = i();
	//   11   19:aload_0         
	//   12   20:invokespecial   #233 <Method JSONObject i()>
	//   13   23:astore_1        
		jsonobject.put("doneReasonCode", "u");
	//   14   24:aload_1         
	//   15   25:ldc2            #605 <String "doneReasonCode">
	//   16   28:ldc2            #606 <String "u">
	//   17   31:invokevirtual   #313 <Method JSONObject JSONObject.put(String, Object)>
	//   18   34:pop             
		a(jsonobject, true);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:iconst_1        
	//   22   38:invokespecial   #504 <Method void a(JSONObject, boolean)>
		break MISSING_BLOCK_LABEL_63;
	//   23   41:goto            63
		Object obj;
		obj;
	//   24   44:astore_1        
		wx.b("Failure while processing active view data.", ((Throwable) (obj)));
	//   25   45:ldc2            #608 <String "Failure while processing active view data.">
	//   26   48:aload_1         
	//   27   49:invokestatic    #273 <Method void wx.b(String, Throwable)>
		break MISSING_BLOCK_LABEL_63;
	//   28   52:goto            63
		obj;
	//   29   55:astore_1        
		wx.b("JSON failure while processing active view data.", ((Throwable) (obj)));
	//   30   56:ldc2            #610 <String "JSON failure while processing active view data.">
	//   31   59:aload_1         
	//   32   60:invokestatic    #273 <Method void wx.b(String, Throwable)>
		String s1;
		s1 = String.valueOf(((Object) (a.d())));
	//   33   63:aload_0         
	//   34   64:getfield        #130 <Field bov a>
	//   35   67:invokevirtual   #431 <Method String bov.d()>
	//   36   70:invokestatic    #572 <Method String String.valueOf(Object)>
	//   37   73:astore_1        
		if(s1.length() != 0)
	//*  38   74:aload_1         
	//*  39   75:invokevirtual   #575 <Method int String.length()>
	//*  40   78:ifeq            92
		{
			s1 = "Untracking ad unit: ".concat(s1);
	//   41   81:ldc2            #612 <String "Untracking ad unit: ">
	//   42   84:aload_1         
	//   43   85:invokevirtual   #581 <Method String String.concat(String)>
	//   44   88:astore_1        
			break MISSING_BLOCK_LABEL_103;
	//   45   89:goto            103
		}
		s1 = new String("Untracking ad unit: ");
	//   46   92:new             #569 <Class String>
	//   47   95:dup             
	//   48   96:ldc2            #612 <String "Untracking ad unit: ">
	//   49   99:invokespecial   #583 <Method void String(String)>
	//   50  102:astore_1        
		wx.b(s1);
	//   51  103:aload_1         
	//   52  104:invokestatic    #585 <Method void wx.b(String)>
		obj1;
	//   53  107:aload_2         
		JVM INSTR monitorexit ;
	//   54  108:monitorexit     
		return;
	//   55  109:return          
		s1;
	//   56  110:astore_1        
		obj1;
	//   57  111:aload_2         
		JVM INSTR monitorexit ;
	//   58  112:monitorexit     
		throw s1;
	//   59  113:aload_1         
	//   60  114:athrow          
	}

	public final void b(bpt bpt1)
	{
		u.remove(((Object) (bpt1)));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field HashSet u>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #617 <Method boolean HashSet.remove(Object)>
	//    4    8:pop             
		bpt1.b();
	//    5    9:aload_1         
	//    6   10:invokeinterface #618 <Method void bpt.b()>
		if(!u.isEmpty())
			break MISSING_BLOCK_LABEL_201;
	//    7   15:aload_0         
	//    8   16:getfield        #69  <Field HashSet u>
	//    9   19:invokevirtual   #532 <Method boolean HashSet.isEmpty()>
	//   10   22:ifeq            201
		bpt1 = ((bpt) (b));
	//   11   25:aload_0         
	//   12   26:getfield        #58  <Field Object b>
	//   13   29:astore_1        
		bpt1;
	//   14   30:aload_1         
		JVM INSTR monitorenter ;
	//   15   31:monitorenter    
		h();
	//   16   32:aload_0         
	//   17   33:invokespecial   #517 <Method void h()>
		Object obj = b;
	//   18   36:aload_0         
	//   19   37:getfield        #58  <Field Object b>
	//   20   40:astore          4
		obj;
	//   21   42:aload           4
		JVM INSTR monitorenter ;
	//   22   44:monitorenter    
		Object obj1 = ((Object) (r));
	//   23   45:aload_0         
	//   24   46:getfield        #534 <Field BroadcastReceiver r>
	//   25   49:astore          5
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_104;
	//   26   51:aload           5
	//   27   53:ifnull          104
		aw.B().a(f, r);
	//   28   56:invokestatic    #553 <Method zr aw.B()>
	//   29   59:aload_0         
	//   30   60:getfield        #160 <Field Context f>
	//   31   63:aload_0         
	//   32   64:getfield        #534 <Field BroadcastReceiver r>
	//   33   67:invokevirtual   #621 <Method void zr.a(Context, BroadcastReceiver)>
		break MISSING_BLOCK_LABEL_99;
	//   34   70:goto            99
		Object obj2;
		obj2;
	//   35   73:astore          5
		aw.i().a(((Throwable) (obj2)), "ActiveViewUnit.stopScreenStatusMonitoring");
	//   36   75:invokestatic    #624 <Method wi aw.i()>
	//   37   78:aload           5
	//   38   80:ldc2            #626 <String "ActiveViewUnit.stopScreenStatusMonitoring">
	//   39   83:invokevirtual   #631 <Method void wi.a(Throwable, String)>
		break MISSING_BLOCK_LABEL_99;
	//   40   86:goto            99
		obj2;
	//   41   89:astore          5
		wx.b("Failed trying to unregister the receiver", ((Throwable) (obj2)));
	//   42   91:ldc2            #633 <String "Failed trying to unregister the receiver">
	//   43   94:aload           5
	//   44   96:invokestatic    #273 <Method void wx.b(String, Throwable)>
		r = null;
	//   45   99:aload_0         
	//   46  100:aconst_null     
	//   47  101:putfield        #534 <Field BroadcastReceiver r>
		obj;
	//   48  104:aload           4
		JVM INSTR monitorexit ;
	//   49  106:monitorexit     
		f.getContentResolver().unregisterContentObserver(((android.database.ContentObserver) (w)));
	//   50  107:aload_0         
	//   51  108:getfield        #160 <Field Context f>
	//   52  111:invokevirtual   #174 <Method ContentResolver Context.getContentResolver()>
	//   53  114:aload_0         
	//   54  115:getfield        #170 <Field bpa w>
	//   55  118:invokevirtual   #637 <Method void ContentResolver.unregisterContentObserver(android.database.ContentObserver)>
		int i1 = 0;
	//   56  121:iconst_0        
	//   57  122:istore_2        
		int j1;
		o = false;
	//   58  123:aload_0         
	//   59  124:iconst_0        
	//   60  125:putfield        #87  <Field boolean o>
		g();
	//   61  128:aload_0         
	//   62  129:invokespecial   #527 <Method void g()>
		obj = ((Object) ((ArrayList)new ArrayList(((java.util.Collection) (u)))));
	//   63  132:new             #363 <Class ArrayList>
	//   64  135:dup             
	//   65  136:aload_0         
	//   66  137:getfield        #69  <Field HashSet u>
	//   67  140:invokespecial   #366 <Method void ArrayList(java.util.Collection)>
	//   68  143:checkcast       #363 <Class ArrayList>
	//   69  146:astore          4
		j1 = ((ArrayList) (obj)).size();
	//   70  148:aload           4
	//   71  150:invokevirtual   #369 <Method int ArrayList.size()>
	//   72  153:istore_3        
_L1:
		if(i1 >= j1)
			break MISSING_BLOCK_LABEL_183;
	//   73  154:iload_2         
	//   74  155:iload_3         
	//   75  156:icmpge          183
		obj2 = ((ArrayList) (obj)).get(i1);
	//   76  159:aload           4
	//   77  161:iload_2         
	//   78  162:invokevirtual   #373 <Method Object ArrayList.get(int)>
	//   79  165:astore          5
		i1++;
	//   80  167:iload_2         
	//   81  168:iconst_1        
	//   82  169:iadd            
	//   83  170:istore_2        
		b((bpt)obj2);
	//   84  171:aload_0         
	//   85  172:aload           5
	//   86  174:checkcast       #375 <Class bpt>
	//   87  177:invokevirtual   #587 <Method void b(bpt)>
		  goto _L1
	//*  88  180:goto            154
		bpt1;
	//   89  183:aload_1         
		JVM INSTR monitorexit ;
	//   90  184:monitorexit     
		return;
	//   91  185:return          
		obj2;
	//   92  186:astore          5
		obj;
	//   93  188:aload           4
		JVM INSTR monitorexit ;
	//   94  190:monitorexit     
		throw obj2;
	//   95  191:aload           5
	//   96  193:athrow          
		Exception exception;
		exception;
	//   97  194:astore          4
		bpt1;
	//   98  196:aload_1         
		JVM INSTR monitorexit ;
	//   99  197:monitorexit     
		throw exception;
	//  100  198:aload           4
	//  101  200:athrow          
	//  102  201:return          
	}

	final void b(Map map)
	{
		a(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokevirtual   #560 <Method void a(int)>
	//    3    5:return          
	}

	final void c(Map map)
	{
		if(!map.containsKey("isVisible"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #247 <String "isVisible">
	//*   2    3:invokeinterface #641 <Method boolean Map.containsKey(Object)>
	//*   3    8:ifne            12
			return;
	//    4   11:return          
		boolean flag;
		if(!"1".equals(map.get("isVisible")) && !"true".equals(map.get("isVisible")))
	//*   5   12:ldc2            #643 <String "1">
	//*   6   15:aload_1         
	//*   7   16:ldc1            #247 <String "isVisible">
	//*   8   18:invokeinterface #593 <Method Object Map.get(Object)>
	//*   9   23:invokevirtual   #601 <Method boolean String.equals(Object)>
	//*  10   26:ifne            54
	//*  11   29:ldc2            #645 <String "true">
	//*  12   32:aload_1         
	//*  13   33:ldc1            #247 <String "isVisible">
	//*  14   35:invokeinterface #593 <Method Object Map.get(Object)>
	//*  15   40:invokevirtual   #601 <Method boolean String.equals(Object)>
	//*  16   43:ifeq            49
	//*  17   46:goto            54
			flag = false;
	//   18   49:iconst_0        
	//   19   50:istore_2        
		else
	//*  20   51:goto            56
			flag = true;
	//   21   54:iconst_1        
	//   22   55:istore_2        
		for(map = ((Map) (s.iterator())); ((Iterator) (map)).hasNext(); ((bou)((Iterator) (map)).next()).a(this, flag));
	//   23   56:aload_0         
	//   24   57:getfield        #67  <Field HashSet s>
	//   25   60:invokevirtual   #483 <Method Iterator HashSet.iterator()>
	//   26   63:astore_1        
	//   27   64:aload_1         
	//   28   65:invokeinterface #488 <Method boolean Iterator.hasNext()>
	//   29   70:ifeq            92
	//   30   73:aload_1         
	//   31   74:invokeinterface #491 <Method Object Iterator.next()>
	//   32   79:checkcast       #647 <Class bou>
	//   33   82:aload_0         
	//   34   83:iload_2         
	//   35   84:invokeinterface #650 <Method void bou.a(box, boolean)>
	//*  36   89:goto            64
	//   37   92:return          
	}

	public final boolean c()
	{
		boolean flag;
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object b>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = o;
	//    5    7:aload_0         
	//    6    8:getfield        #87  <Field boolean o>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public final void d()
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			n = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #62  <Field boolean n>
			a(3);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:invokevirtual   #560 <Method void a(int)>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void e()
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			m = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #60  <Field boolean m>
			a(3);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:invokevirtual   #560 <Method void a(int)>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void f()
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			m = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #60  <Field boolean m>
			a(3);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:invokevirtual   #560 <Method void a(int)>
		}
	//   11   17:aload_1         
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		exception;
	//   14   20:astore_2        
		obj;
	//   15   21:aload_1         
		JVM INSTR monitorexit ;
	//   16   22:monitorexit     
		throw exception;
	//   17   23:aload_2         
	//   18   24:athrow          
	}

	public final void onGlobalLayout()
	{
		a(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #560 <Method void a(int)>
	//    3    5:return          
	}

	public final void onScrollChanged()
	{
		a(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #560 <Method void a(int)>
	//    3    5:return          
	}

	protected final bov a;
	private final Object b = new Object();
	private final WeakReference c;
	private WeakReference d;
	private final bqi e;
	private final Context f;
	private final WindowManager g;
	private final PowerManager h;
	private final KeyguardManager i;
	private final DisplayMetrics j;
	private bpe k;
	private boolean l;
	private boolean m;
	private boolean n;
	private boolean o;
	private boolean p;
	private boolean q;
	private BroadcastReceiver r;
	private final HashSet s = new HashSet();
	private zk t;
	private final HashSet u = new HashSet();
	private final Rect v = new Rect();
	private final bpa w = new bpa(this, new Handler());
	private float x;
}
