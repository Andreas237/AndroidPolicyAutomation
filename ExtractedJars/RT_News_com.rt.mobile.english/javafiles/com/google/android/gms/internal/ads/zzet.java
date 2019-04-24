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
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzamj, zzer, zzjn, zzajh, 
//			zzew, zzakq, zzakb, zzakk, 
//			zzfo, zzfa, zzalb, zzeu, 
//			zzamq, zzgd, zzajm, zzeq, 
//			zzang

public final class zzet
	implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

	public zzet(Context context, zzjn zzjn1, zzajh zzajh1, zzang zzang, zzgd zzgd1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #62  <Method void Object()>
	//    6   12:putfield        #64  <Field Object mLock>
		zzaaq = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #66  <Field boolean zzaaq>
		zzafa = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #68  <Field boolean zzafa>
	//   13   25:aload_0         
	//   14   26:new             #70  <Class HashSet>
	//   15   29:dup             
	//   16   30:invokespecial   #71  <Method void HashSet()>
	//   17   33:putfield        #73  <Field HashSet zzaff>
	//   18   36:aload_0         
	//   19   37:new             #70  <Class HashSet>
	//   20   40:dup             
	//   21   41:invokespecial   #71  <Method void HashSet()>
	//   22   44:putfield        #75  <Field HashSet zzafg>
	//   23   47:aload_0         
	//   24   48:new             #77  <Class Rect>
	//   25   51:dup             
	//   26   52:invokespecial   #78  <Method void Rect()>
	//   27   55:putfield        #80  <Field Rect zzafh>
		zzaeq = new WeakReference(((Object) (zzajh1)));
	//   28   58:aload_0         
	//   29   59:new             #82  <Class WeakReference>
	//   30   62:dup             
	//   31   63:aload_3         
	//   32   64:invokespecial   #85  <Method void WeakReference(Object)>
	//   33   67:putfield        #87  <Field WeakReference zzaeq>
		zzaes = zzgd1;
	//   34   70:aload_0         
	//   35   71:aload           5
	//   36   73:putfield        #89  <Field zzgd zzaes>
		zzaer = new WeakReference(((Object) (null)));
	//   37   76:aload_0         
	//   38   77:new             #82  <Class WeakReference>
	//   39   80:dup             
	//   40   81:aconst_null     
	//   41   82:invokespecial   #85  <Method void WeakReference(Object)>
	//   42   85:putfield        #91  <Field WeakReference zzaer>
		zzafb = true;
	//   43   88:aload_0         
	//   44   89:iconst_1        
	//   45   90:putfield        #93  <Field boolean zzafb>
		zzafd = false;
	//   46   93:aload_0         
	//   47   94:iconst_0        
	//   48   95:putfield        #95  <Field boolean zzafd>
		zzadz = new zzamj(200L);
	//   49   98:aload_0         
	//   50   99:new             #97  <Class zzamj>
	//   51  102:dup             
	//   52  103:ldc2w           #98  <Long 200L>
	//   53  106:invokespecial   #102 <Method void zzamj(long)>
	//   54  109:putfield        #104 <Field zzamj zzadz>
		zzaet = new zzer(UUID.randomUUID().toString(), zzang, zzjn1.zzarb, zzajh1.zzcob, zzajh1.zzfz(), zzjn1.zzare);
	//   55  112:aload_0         
	//   56  113:new             #106 <Class zzer>
	//   57  116:dup             
	//   58  117:invokestatic    #112 <Method UUID UUID.randomUUID()>
	//   59  120:invokevirtual   #116 <Method String UUID.toString()>
	//   60  123:aload           4
	//   61  125:aload_2         
	//   62  126:getfield        #122 <Field String zzjn.zzarb>
	//   63  129:aload_3         
	//   64  130:getfield        #128 <Field JSONObject zzajh.zzcob>
	//   65  133:aload_3         
	//   66  134:invokevirtual   #132 <Method boolean zzajh.zzfz()>
	//   67  137:aload_2         
	//   68  138:getfield        #135 <Field boolean zzjn.zzare>
	//   69  141:invokespecial   #138 <Method void zzer(String, zzang, String, JSONObject, boolean, boolean)>
	//   70  144:putfield        #140 <Field zzer zzaet>
		zzaeu = (WindowManager)context.getSystemService("window");
	//   71  147:aload_0         
	//   72  148:aload_1         
	//   73  149:ldc1            #142 <String "window">
	//   74  151:invokevirtual   #148 <Method Object Context.getSystemService(String)>
	//   75  154:checkcast       #150 <Class WindowManager>
	//   76  157:putfield        #152 <Field WindowManager zzaeu>
		zzaev = (PowerManager)context.getApplicationContext().getSystemService("power");
	//   77  160:aload_0         
	//   78  161:aload_1         
	//   79  162:invokevirtual   #156 <Method Context Context.getApplicationContext()>
	//   80  165:ldc1            #158 <String "power">
	//   81  167:invokevirtual   #148 <Method Object Context.getSystemService(String)>
	//   82  170:checkcast       #160 <Class PowerManager>
	//   83  173:putfield        #162 <Field PowerManager zzaev>
		zzaew = (KeyguardManager)context.getSystemService("keyguard");
	//   84  176:aload_0         
	//   85  177:aload_1         
	//   86  178:ldc1            #164 <String "keyguard">
	//   87  180:invokevirtual   #148 <Method Object Context.getSystemService(String)>
	//   88  183:checkcast       #166 <Class KeyguardManager>
	//   89  186:putfield        #168 <Field KeyguardManager zzaew>
		zzaeo = context;
	//   90  189:aload_0         
	//   91  190:aload_1         
	//   92  191:putfield        #170 <Field Context zzaeo>
	//   93  194:aload_0         
	//   94  195:new             #172 <Class zzew>
	//   95  198:dup             
	//   96  199:aload_0         
	//   97  200:new             #174 <Class Handler>
	//   98  203:dup             
	//   99  204:invokespecial   #175 <Method void Handler()>
	//  100  207:invokespecial   #178 <Method void zzew(zzet, Handler)>
	//  101  210:putfield        #180 <Field zzew zzafi>
		zzaeo.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, ((android.database.ContentObserver) (zzafi)));
	//  102  213:aload_0         
	//  103  214:getfield        #170 <Field Context zzaeo>
	//  104  217:invokevirtual   #184 <Method ContentResolver Context.getContentResolver()>
	//  105  220:getstatic       #190 <Field android.net.Uri android.provider.Settings$System.CONTENT_URI>
	//  106  223:iconst_1        
	//  107  224:aload_0         
	//  108  225:getfield        #180 <Field zzew zzafi>
	//  109  228:invokevirtual   #196 <Method void ContentResolver.registerContentObserver(android.net.Uri, boolean, android.database.ContentObserver)>
		zzaex = context.getResources().getDisplayMetrics();
	//  110  231:aload_0         
	//  111  232:aload_1         
	//  112  233:invokevirtual   #200 <Method Resources Context.getResources()>
	//  113  236:invokevirtual   #206 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//  114  239:putfield        #208 <Field DisplayMetrics zzaex>
		context = ((Context) (zzaeu.getDefaultDisplay()));
	//  115  242:aload_0         
	//  116  243:getfield        #152 <Field WindowManager zzaeu>
	//  117  246:invokeinterface #212 <Method Display WindowManager.getDefaultDisplay()>
	//  118  251:astore_1        
		zzafh.right = ((Display) (context)).getWidth();
	//  119  252:aload_0         
	//  120  253:getfield        #80  <Field Rect zzafh>
	//  121  256:aload_1         
	//  122  257:invokevirtual   #218 <Method int Display.getWidth()>
	//  123  260:putfield        #222 <Field int Rect.right>
		zzafh.bottom = ((Display) (context)).getHeight();
	//  124  263:aload_0         
	//  125  264:getfield        #80  <Field Rect zzafh>
	//  126  267:aload_1         
	//  127  268:invokevirtual   #225 <Method int Display.getHeight()>
	//  128  271:putfield        #228 <Field int Rect.bottom>
		zzgb();
	//  129  274:aload_0         
	//  130  275:invokevirtual   #231 <Method void zzgb()>
	//  131  278:return          
	}

	private final boolean isScreenOn()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #238 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          16
			return zzaev.isInteractive();
	//    3    8:aload_0         
	//    4    9:getfield        #162 <Field PowerManager zzaev>
	//    5   12:invokevirtual   #241 <Method boolean PowerManager.isInteractive()>
	//    6   15:ireturn         
		else
			return zzaev.isScreenOn();
	//    7   16:aload_0         
	//    8   17:getfield        #162 <Field PowerManager zzaev>
	//    9   20:invokevirtual   #243 <Method boolean PowerManager.isScreenOn()>
	//   10   23:ireturn         
	}

	private static int zza(int i, DisplayMetrics displaymetrics)
	{
		float f = displaymetrics.density;
	//    0    0:aload_1         
	//    1    1:getfield        #251 <Field float DisplayMetrics.density>
	//    2    4:fstore_2        
		return (int)((float)i / f);
	//    3    5:iload_0         
	//    4    6:i2f             
	//    5    7:fload_2         
	//    6    8:fdiv            
	//    7    9:f2i             
	//    8   10:ireturn         
	}

	private final JSONObject zza(View view, Boolean boolean1)
		throws JSONException
	{
		if(view == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       33
			return zzgg().put("isAttachedToWindow", false).put("isScreenOn", isScreenOn()).put("isVisible", false);
	//    2    4:aload_0         
	//    3    5:invokespecial   #260 <Method JSONObject zzgg()>
	//    4    8:ldc2            #262 <String "isAttachedToWindow">
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//    7   15:ldc2            #269 <String "isScreenOn">
	//    8   18:aload_0         
	//    9   19:invokespecial   #270 <Method boolean isScreenOn()>
	//   10   22:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//   11   25:ldc2            #272 <String "isVisible">
	//   12   28:iconst_0        
	//   13   29:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//   14   32:areturn         
		boolean flag = zzbv.zzem().isAttachedToWindow(view);
	//   15   33:invokestatic    #278 <Method zzakq zzbv.zzem()>
	//   16   36:aload_1         
	//   17   37:invokevirtual   #283 <Method boolean zzakq.isAttachedToWindow(View)>
	//   18   40:istore_3        
		int ai1[] = new int[2];
	//   19   41:iconst_2        
	//   20   42:newarray        int[]
	//   21   44:astore          7
		int ai[] = new int[2];
	//   22   46:iconst_2        
	//   23   47:newarray        int[]
	//   24   49:astore          6
		try
		{
			view.getLocationOnScreen(ai1);
	//   25   51:aload_1         
	//   26   52:aload           7
	//   27   54:invokevirtual   #289 <Method void View.getLocationOnScreen(int[])>
			view.getLocationInWindow(ai);
	//   28   57:aload_1         
	//   29   58:aload           6
	//   30   60:invokevirtual   #292 <Method void View.getLocationInWindow(int[])>
		}
	//*  31   63:goto            76
		catch(Exception exception)
	//*  32   66:astore          6
		{
			zzakb.zzb("Failure getting view location.", ((Throwable) (exception)));
	//   33   68:ldc2            #294 <String "Failure getting view location.">
	//   34   71:aload           6
	//   35   73:invokestatic    #300 <Method void zzakb.zzb(String, Throwable)>
		}
		Object obj = ((Object) (new Rect()));
	//   36   76:new             #77  <Class Rect>
	//   37   79:dup             
	//   38   80:invokespecial   #78  <Method void Rect()>
	//   39   83:astore          6
		obj.left = ai1[0];
	//   40   85:aload           6
	//   41   87:aload           7
	//   42   89:iconst_0        
	//   43   90:iaload          
	//   44   91:putfield        #303 <Field int Rect.left>
		obj.top = ai1[1];
	//   45   94:aload           6
	//   46   96:aload           7
	//   47   98:iconst_1        
	//   48   99:iaload          
	//   49  100:putfield        #306 <Field int Rect.top>
		obj.right = ((Rect) (obj)).left + view.getWidth();
	//   50  103:aload           6
	//   51  105:aload           6
	//   52  107:getfield        #303 <Field int Rect.left>
	//   53  110:aload_1         
	//   54  111:invokevirtual   #307 <Method int View.getWidth()>
	//   55  114:iadd            
	//   56  115:putfield        #222 <Field int Rect.right>
		obj.bottom = ((Rect) (obj)).top + view.getHeight();
	//   57  118:aload           6
	//   58  120:aload           6
	//   59  122:getfield        #306 <Field int Rect.top>
	//   60  125:aload_1         
	//   61  126:invokevirtual   #308 <Method int View.getHeight()>
	//   62  129:iadd            
	//   63  130:putfield        #228 <Field int Rect.bottom>
		Rect rect = new Rect();
	//   64  133:new             #77  <Class Rect>
	//   65  136:dup             
	//   66  137:invokespecial   #78  <Method void Rect()>
	//   67  140:astore          8
		boolean flag1 = view.getGlobalVisibleRect(rect, ((android.graphics.Point) (null)));
	//   68  142:aload_1         
	//   69  143:aload           8
	//   70  145:aconst_null     
	//   71  146:invokevirtual   #312 <Method boolean View.getGlobalVisibleRect(Rect, android.graphics.Point)>
	//   72  149:istore          4
		Rect rect1 = new Rect();
	//   73  151:new             #77  <Class Rect>
	//   74  154:dup             
	//   75  155:invokespecial   #78  <Method void Rect()>
	//   76  158:astore          9
		boolean flag2 = view.getLocalVisibleRect(rect1);
	//   77  160:aload_1         
	//   78  161:aload           9
	//   79  163:invokevirtual   #316 <Method boolean View.getLocalVisibleRect(Rect)>
	//   80  166:istore          5
		Rect rect2 = new Rect();
	//   81  168:new             #77  <Class Rect>
	//   82  171:dup             
	//   83  172:invokespecial   #78  <Method void Rect()>
	//   84  175:astore          10
		view.getHitRect(rect2);
	//   85  177:aload_1         
	//   86  178:aload           10
	//   87  180:invokevirtual   #320 <Method void View.getHitRect(Rect)>
		JSONObject jsonobject = zzgg();
	//   88  183:aload_0         
	//   89  184:invokespecial   #260 <Method JSONObject zzgg()>
	//   90  187:astore          7
		jsonobject.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", flag).put("viewBox", ((Object) ((new JSONObject()).put("top", zza(zzafh.top, zzaex)).put("bottom", zza(zzafh.bottom, zzaex)).put("left", zza(zzafh.left, zzaex)).put("right", zza(zzafh.right, zzaex))))).put("adBox", ((Object) ((new JSONObject()).put("top", zza(((Rect) (obj)).top, zzaex)).put("bottom", zza(((Rect) (obj)).bottom, zzaex)).put("left", zza(((Rect) (obj)).left, zzaex)).put("right", zza(((Rect) (obj)).right, zzaex))))).put("globalVisibleBox", ((Object) ((new JSONObject()).put("top", zza(rect.top, zzaex)).put("bottom", zza(rect.bottom, zzaex)).put("left", zza(rect.left, zzaex)).put("right", zza(rect.right, zzaex))))).put("globalVisibleBoxVisible", flag1).put("localVisibleBox", ((Object) ((new JSONObject()).put("top", zza(rect1.top, zzaex)).put("bottom", zza(rect1.bottom, zzaex)).put("left", zza(rect1.left, zzaex)).put("right", zza(rect1.right, zzaex))))).put("localVisibleBoxVisible", flag2).put("hitBox", ((Object) ((new JSONObject()).put("top", zza(rect2.top, zzaex)).put("bottom", zza(rect2.bottom, zzaex)).put("left", zza(rect2.left, zzaex)).put("right", zza(rect2.right, zzaex))))).put("screenDensity", zzaex.density);
	//   91  189:aload           7
	//   92  191:ldc2            #322 <String "windowVisibility">
	//   93  194:aload_1         
	//   94  195:invokevirtual   #325 <Method int View.getWindowVisibility()>
	//   95  198:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//   96  201:ldc2            #262 <String "isAttachedToWindow">
	//   97  204:iload_3         
	//   98  205:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//   99  208:ldc2            #330 <String "viewBox">
	//  100  211:new             #264 <Class JSONObject>
	//  101  214:dup             
	//  102  215:invokespecial   #331 <Method void JSONObject()>
	//  103  218:ldc2            #332 <String "top">
	//  104  221:aload_0         
	//  105  222:getfield        #80  <Field Rect zzafh>
	//  106  225:getfield        #306 <Field int Rect.top>
	//  107  228:aload_0         
	//  108  229:getfield        #208 <Field DisplayMetrics zzaex>
	//  109  232:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  110  235:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  111  238:ldc2            #335 <String "bottom">
	//  112  241:aload_0         
	//  113  242:getfield        #80  <Field Rect zzafh>
	//  114  245:getfield        #228 <Field int Rect.bottom>
	//  115  248:aload_0         
	//  116  249:getfield        #208 <Field DisplayMetrics zzaex>
	//  117  252:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  118  255:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  119  258:ldc2            #336 <String "left">
	//  120  261:aload_0         
	//  121  262:getfield        #80  <Field Rect zzafh>
	//  122  265:getfield        #303 <Field int Rect.left>
	//  123  268:aload_0         
	//  124  269:getfield        #208 <Field DisplayMetrics zzaex>
	//  125  272:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  126  275:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  127  278:ldc2            #337 <String "right">
	//  128  281:aload_0         
	//  129  282:getfield        #80  <Field Rect zzafh>
	//  130  285:getfield        #222 <Field int Rect.right>
	//  131  288:aload_0         
	//  132  289:getfield        #208 <Field DisplayMetrics zzaex>
	//  133  292:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  134  295:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  135  298:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//  136  301:ldc2            #342 <String "adBox">
	//  137  304:new             #264 <Class JSONObject>
	//  138  307:dup             
	//  139  308:invokespecial   #331 <Method void JSONObject()>
	//  140  311:ldc2            #332 <String "top">
	//  141  314:aload           6
	//  142  316:getfield        #306 <Field int Rect.top>
	//  143  319:aload_0         
	//  144  320:getfield        #208 <Field DisplayMetrics zzaex>
	//  145  323:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  146  326:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  147  329:ldc2            #335 <String "bottom">
	//  148  332:aload           6
	//  149  334:getfield        #228 <Field int Rect.bottom>
	//  150  337:aload_0         
	//  151  338:getfield        #208 <Field DisplayMetrics zzaex>
	//  152  341:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  153  344:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  154  347:ldc2            #336 <String "left">
	//  155  350:aload           6
	//  156  352:getfield        #303 <Field int Rect.left>
	//  157  355:aload_0         
	//  158  356:getfield        #208 <Field DisplayMetrics zzaex>
	//  159  359:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  160  362:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  161  365:ldc2            #337 <String "right">
	//  162  368:aload           6
	//  163  370:getfield        #222 <Field int Rect.right>
	//  164  373:aload_0         
	//  165  374:getfield        #208 <Field DisplayMetrics zzaex>
	//  166  377:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  167  380:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  168  383:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//  169  386:ldc2            #344 <String "globalVisibleBox">
	//  170  389:new             #264 <Class JSONObject>
	//  171  392:dup             
	//  172  393:invokespecial   #331 <Method void JSONObject()>
	//  173  396:ldc2            #332 <String "top">
	//  174  399:aload           8
	//  175  401:getfield        #306 <Field int Rect.top>
	//  176  404:aload_0         
	//  177  405:getfield        #208 <Field DisplayMetrics zzaex>
	//  178  408:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  179  411:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  180  414:ldc2            #335 <String "bottom">
	//  181  417:aload           8
	//  182  419:getfield        #228 <Field int Rect.bottom>
	//  183  422:aload_0         
	//  184  423:getfield        #208 <Field DisplayMetrics zzaex>
	//  185  426:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  186  429:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  187  432:ldc2            #336 <String "left">
	//  188  435:aload           8
	//  189  437:getfield        #303 <Field int Rect.left>
	//  190  440:aload_0         
	//  191  441:getfield        #208 <Field DisplayMetrics zzaex>
	//  192  444:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  193  447:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  194  450:ldc2            #337 <String "right">
	//  195  453:aload           8
	//  196  455:getfield        #222 <Field int Rect.right>
	//  197  458:aload_0         
	//  198  459:getfield        #208 <Field DisplayMetrics zzaex>
	//  199  462:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  200  465:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  201  468:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//  202  471:ldc2            #346 <String "globalVisibleBoxVisible">
	//  203  474:iload           4
	//  204  476:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//  205  479:ldc2            #348 <String "localVisibleBox">
	//  206  482:new             #264 <Class JSONObject>
	//  207  485:dup             
	//  208  486:invokespecial   #331 <Method void JSONObject()>
	//  209  489:ldc2            #332 <String "top">
	//  210  492:aload           9
	//  211  494:getfield        #306 <Field int Rect.top>
	//  212  497:aload_0         
	//  213  498:getfield        #208 <Field DisplayMetrics zzaex>
	//  214  501:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  215  504:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  216  507:ldc2            #335 <String "bottom">
	//  217  510:aload           9
	//  218  512:getfield        #228 <Field int Rect.bottom>
	//  219  515:aload_0         
	//  220  516:getfield        #208 <Field DisplayMetrics zzaex>
	//  221  519:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  222  522:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  223  525:ldc2            #336 <String "left">
	//  224  528:aload           9
	//  225  530:getfield        #303 <Field int Rect.left>
	//  226  533:aload_0         
	//  227  534:getfield        #208 <Field DisplayMetrics zzaex>
	//  228  537:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  229  540:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  230  543:ldc2            #337 <String "right">
	//  231  546:aload           9
	//  232  548:getfield        #222 <Field int Rect.right>
	//  233  551:aload_0         
	//  234  552:getfield        #208 <Field DisplayMetrics zzaex>
	//  235  555:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  236  558:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  237  561:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//  238  564:ldc2            #350 <String "localVisibleBoxVisible">
	//  239  567:iload           5
	//  240  569:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//  241  572:ldc2            #352 <String "hitBox">
	//  242  575:new             #264 <Class JSONObject>
	//  243  578:dup             
	//  244  579:invokespecial   #331 <Method void JSONObject()>
	//  245  582:ldc2            #332 <String "top">
	//  246  585:aload           10
	//  247  587:getfield        #306 <Field int Rect.top>
	//  248  590:aload_0         
	//  249  591:getfield        #208 <Field DisplayMetrics zzaex>
	//  250  594:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  251  597:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  252  600:ldc2            #335 <String "bottom">
	//  253  603:aload           10
	//  254  605:getfield        #228 <Field int Rect.bottom>
	//  255  608:aload_0         
	//  256  609:getfield        #208 <Field DisplayMetrics zzaex>
	//  257  612:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  258  615:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  259  618:ldc2            #336 <String "left">
	//  260  621:aload           10
	//  261  623:getfield        #303 <Field int Rect.left>
	//  262  626:aload_0         
	//  263  627:getfield        #208 <Field DisplayMetrics zzaex>
	//  264  630:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  265  633:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  266  636:ldc2            #337 <String "right">
	//  267  639:aload           10
	//  268  641:getfield        #222 <Field int Rect.right>
	//  269  644:aload_0         
	//  270  645:getfield        #208 <Field DisplayMetrics zzaex>
	//  271  648:invokestatic    #334 <Method int zza(int, DisplayMetrics)>
	//  272  651:invokevirtual   #328 <Method JSONObject JSONObject.put(String, int)>
	//  273  654:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//  274  657:ldc2            #354 <String "screenDensity">
	//  275  660:aload_0         
	//  276  661:getfield        #208 <Field DisplayMetrics zzaex>
	//  277  664:getfield        #251 <Field float DisplayMetrics.density>
	//  278  667:f2d             
	//  279  668:invokevirtual   #357 <Method JSONObject JSONObject.put(String, double)>
	//  280  671:pop             
		obj = ((Object) (boolean1));
	//  281  672:aload_2         
	//  282  673:astore          6
		if(boolean1 == null)
	//* 283  675:aload_2         
	//* 284  676:ifnonnull       699
			obj = ((Object) (Boolean.valueOf(zzbv.zzek().zza(view, zzaev, zzaew))));
	//  285  679:invokestatic    #361 <Method zzakk zzbv.zzek()>
	//  286  682:aload_1         
	//  287  683:aload_0         
	//  288  684:getfield        #162 <Field PowerManager zzaev>
	//  289  687:aload_0         
	//  290  688:getfield        #168 <Field KeyguardManager zzaew>
	//  291  691:invokevirtual   #366 <Method boolean zzakk.zza(View, PowerManager, KeyguardManager)>
	//  292  694:invokestatic    #372 <Method Boolean Boolean.valueOf(boolean)>
	//  293  697:astore          6
		jsonobject.put("isVisible", ((Boolean) (obj)).booleanValue());
	//  294  699:aload           7
	//  295  701:ldc2            #272 <String "isVisible">
	//  296  704:aload           6
	//  297  706:invokevirtual   #375 <Method boolean Boolean.booleanValue()>
	//  298  709:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//  299  712:pop             
		return jsonobject;
	//  300  713:aload           7
	//  301  715:areturn         
	}

	private static JSONObject zza(JSONObject jsonobject)
		throws JSONException
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #380 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #381 <Method void JSONArray()>
	//    3    7:astore_1        
		JSONObject jsonobject1 = new JSONObject();
	//    4    8:new             #264 <Class JSONObject>
	//    5   11:dup             
	//    6   12:invokespecial   #331 <Method void JSONObject()>
	//    7   15:astore_2        
		jsonarray.put(((Object) (jsonobject)));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #384 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		jsonobject1.put("units", ((Object) (jsonarray)));
	//   12   22:aload_2         
	//   13   23:ldc2            #386 <String "units">
	//   14   26:aload_1         
	//   15   27:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//   16   30:pop             
		return jsonobject1;
	//   17   31:aload_2         
	//   18   32:areturn         
	}

	private final void zza(JSONObject jsonobject, boolean flag)
	{
		int i;
		int j;
		ArrayList arraylist;
		Object obj;
		try
		{
			jsonobject = zza(jsonobject);
	//    0    0:aload_1         
	//    1    1:invokestatic    #391 <Method JSONObject zza(JSONObject)>
	//    2    4:astore_1        
			arraylist = (ArrayList)new ArrayList(((java.util.Collection) (zzafg)));
	//    3    5:new             #393 <Class ArrayList>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #75  <Field HashSet zzafg>
	//    7   13:invokespecial   #396 <Method void ArrayList(java.util.Collection)>
	//    8   16:checkcast       #393 <Class ArrayList>
	//    9   19:astore          5
			j = arraylist.size();
	//   10   21:aload           5
	//   11   23:invokevirtual   #399 <Method int ArrayList.size()>
	//   12   26:istore          4
		}
	//*  13   28:iconst_0        
	//*  14   29:istore_3        
	//*  15   30:iload_3         
	//*  16   31:iload           4
	//*  17   33:icmpge          63
	//*  18   36:aload           5
	//*  19   38:iload_3         
	//*  20   39:invokevirtual   #403 <Method Object ArrayList.get(int)>
	//*  21   42:astore          6
	//*  22   44:iload_3         
	//*  23   45:iconst_1        
	//*  24   46:iadd            
	//*  25   47:istore_3        
	//*  26   48:aload           6
	//*  27   50:checkcast       #405 <Class zzfo>
	//*  28   53:aload_1         
	//*  29   54:iload_2         
	//*  30   55:invokeinterface #407 <Method void zzfo.zzb(JSONObject, boolean)>
	//*  31   60:goto            30
	//*  32   63:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  33   64:astore_1        
		{
			zzakb.zzb("Skipping active view message.", ((Throwable) (jsonobject)));
	//   34   65:ldc2            #409 <String "Skipping active view message.">
	//   35   68:aload_1         
	//   36   69:invokestatic    #300 <Method void zzakb.zzb(String, Throwable)>
			return;
	//   37   72:return          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		obj = arraylist.get(i);
		i++;
		((zzfo)obj).zzb(jsonobject, flag);
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_30;
_L1:
	}

	private final void zzgd()
	{
		if(zzaey != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #412 <Field zzfa zzaey>
	//*   2    4:ifnull          17
			zzaey.zza(this);
	//    3    7:aload_0         
	//    4    8:getfield        #412 <Field zzfa zzaey>
	//    5   11:aload_0         
	//    6   12:invokeinterface #417 <Method void zzfa.zza(zzet)>
	//    7   17:return          
	}

	private final void zzgf()
	{
		ViewTreeObserver viewtreeobserver = (ViewTreeObserver)zzaer.get();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field WeakReference zzaer>
	//    2    4:invokevirtual   #421 <Method Object WeakReference.get()>
	//    3    7:checkcast       #423 <Class ViewTreeObserver>
	//    4   10:astore_1        
		if(viewtreeobserver != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          33
		{
			if(!viewtreeobserver.isAlive())
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #426 <Method boolean ViewTreeObserver.isAlive()>
	//*   9   19:ifne            23
				return;
	//   10   22:return          
			viewtreeobserver.removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #430 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
			viewtreeobserver.removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:invokevirtual   #434 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
	//   17   33:return          
	}

	private final JSONObject zzgg()
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #264 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #331 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("afmaVersion", ((Object) (zzaet.zzfw()))).put("activeViewJSON", ((Object) (zzaet.zzfx()))).put("timestamp", zzbv.zzer().elapsedRealtime()).put("adFormat", ((Object) (zzaet.zzfv()))).put("hashCode", ((Object) (zzaet.zzfy()))).put("isMraid", zzaet.zzfz()).put("isStopped", zzafa).put("isPaused", zzaaq).put("isNative", zzaet.zzga()).put("isScreenOn", isScreenOn()).put("appMuted", zzbv.zzfj().zzdp()).put("appVolume", zzbv.zzfj().zzdo()).put("deviceVolume", zzafj);
	//    4    8:aload_1         
	//    5    9:ldc2            #436 <String "afmaVersion">
	//    6   12:aload_0         
	//    7   13:getfield        #140 <Field zzer zzaet>
	//    8   16:invokevirtual   #439 <Method String zzer.zzfw()>
	//    9   19:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//   10   22:ldc2            #441 <String "activeViewJSON">
	//   11   25:aload_0         
	//   12   26:getfield        #140 <Field zzer zzaet>
	//   13   29:invokevirtual   #444 <Method JSONObject zzer.zzfx()>
	//   14   32:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//   15   35:ldc2            #446 <String "timestamp">
	//   16   38:invokestatic    #450 <Method Clock zzbv.zzer()>
	//   17   41:invokeinterface #456 <Method long Clock.elapsedRealtime()>
	//   18   46:invokevirtual   #459 <Method JSONObject JSONObject.put(String, long)>
	//   19   49:ldc2            #461 <String "adFormat">
	//   20   52:aload_0         
	//   21   53:getfield        #140 <Field zzer zzaet>
	//   22   56:invokevirtual   #464 <Method String zzer.zzfv()>
	//   23   59:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//   24   62:ldc2            #466 <String "hashCode">
	//   25   65:aload_0         
	//   26   66:getfield        #140 <Field zzer zzaet>
	//   27   69:invokevirtual   #469 <Method String zzer.zzfy()>
	//   28   72:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//   29   75:ldc2            #471 <String "isMraid">
	//   30   78:aload_0         
	//   31   79:getfield        #140 <Field zzer zzaet>
	//   32   82:invokevirtual   #472 <Method boolean zzer.zzfz()>
	//   33   85:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//   34   88:ldc2            #474 <String "isStopped">
	//   35   91:aload_0         
	//   36   92:getfield        #68  <Field boolean zzafa>
	//   37   95:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//   38   98:ldc2            #476 <String "isPaused">
	//   39  101:aload_0         
	//   40  102:getfield        #66  <Field boolean zzaaq>
	//   41  105:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//   42  108:ldc2            #478 <String "isNative">
	//   43  111:aload_0         
	//   44  112:getfield        #140 <Field zzer zzaet>
	//   45  115:invokevirtual   #481 <Method boolean zzer.zzga()>
	//   46  118:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//   47  121:ldc2            #269 <String "isScreenOn">
	//   48  124:aload_0         
	//   49  125:invokespecial   #270 <Method boolean isScreenOn()>
	//   50  128:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//   51  131:ldc2            #483 <String "appMuted">
	//   52  134:invokestatic    #487 <Method zzalb zzbv.zzfj()>
	//   53  137:invokevirtual   #492 <Method boolean zzalb.zzdp()>
	//   54  140:invokevirtual   #268 <Method JSONObject JSONObject.put(String, boolean)>
	//   55  143:ldc2            #494 <String "appVolume">
	//   56  146:invokestatic    #487 <Method zzalb zzbv.zzfj()>
	//   57  149:invokevirtual   #498 <Method float zzalb.zzdo()>
	//   58  152:f2d             
	//   59  153:invokevirtual   #357 <Method JSONObject JSONObject.put(String, double)>
	//   60  156:ldc2            #500 <String "deviceVolume">
	//   61  159:aload_0         
	//   62  160:getfield        #502 <Field float zzafj>
	//   63  163:f2d             
	//   64  164:invokevirtual   #357 <Method JSONObject JSONObject.put(String, double)>
	//   65  167:pop             
		return jsonobject;
	//   66  168:aload_1         
	//   67  169:areturn         
	}

	public final void onGlobalLayout()
	{
		zzl(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokevirtual   #507 <Method void zzl(int)>
	//    3    5:return          
	}

	public final void onScrollChanged()
	{
		zzl(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #507 <Method void zzl(int)>
	//    3    5:return          
	}

	public final void pause()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzaaq = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #66  <Field boolean zzaaq>
			zzl(3);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:invokevirtual   #507 <Method void zzl(int)>
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

	public final void resume()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzaaq = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #66  <Field boolean zzaaq>
			zzl(3);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:invokevirtual   #507 <Method void zzl(int)>
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

	public final void stop()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzafa = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #68  <Field boolean zzafa>
			zzl(3);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:invokevirtual   #507 <Method void zzl(int)>
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

	public final void zza(zzfa zzfa1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzaey = zzfa1;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #412 <Field zzfa zzaey>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		zzfa1;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw zzfa1;
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public final void zza(zzfo zzfo1)
	{
		if(!zzafg.isEmpty())
			break MISSING_BLOCK_LABEL_94;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field HashSet zzafg>
	//    2    4:invokevirtual   #516 <Method boolean HashSet.isEmpty()>
	//    3    7:ifeq            94
		Object obj = mLock;
	//    4   10:aload_0         
	//    5   11:getfield        #64  <Field Object mLock>
	//    6   14:astore_2        
		obj;
	//    7   15:aload_2         
		JVM INSTR monitorenter ;
	//    8   16:monitorenter    
		if(zzafe != null)
			break MISSING_BLOCK_LABEL_81;
	//    9   17:aload_0         
	//   10   18:getfield        #518 <Field BroadcastReceiver zzafe>
	//   11   21:ifnull          29
	//*  12   24:aload_2         
	//*  13   25:monitorexit     
	//*  14   26:goto            81
		IntentFilter intentfilter = new IntentFilter();
	//   15   29:new             #520 <Class IntentFilter>
	//   16   32:dup             
	//   17   33:invokespecial   #521 <Method void IntentFilter()>
	//   18   36:astore_3        
		intentfilter.addAction("android.intent.action.SCREEN_ON");
	//   19   37:aload_3         
	//   20   38:ldc2            #523 <String "android.intent.action.SCREEN_ON">
	//   21   41:invokevirtual   #527 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("android.intent.action.SCREEN_OFF");
	//   22   44:aload_3         
	//   23   45:ldc2            #529 <String "android.intent.action.SCREEN_OFF">
	//   24   48:invokevirtual   #527 <Method void IntentFilter.addAction(String)>
		zzafe = ((BroadcastReceiver) (new zzeu(this)));
	//   25   51:aload_0         
	//   26   52:new             #531 <Class zzeu>
	//   27   55:dup             
	//   28   56:aload_0         
	//   29   57:invokespecial   #533 <Method void zzeu(zzet)>
	//   30   60:putfield        #518 <Field BroadcastReceiver zzafe>
		zzbv.zzfk().zza(zzaeo, zzafe, intentfilter);
	//   31   63:invokestatic    #537 <Method zzamq zzbv.zzfk()>
	//   32   66:aload_0         
	//   33   67:getfield        #170 <Field Context zzaeo>
	//   34   70:aload_0         
	//   35   71:getfield        #518 <Field BroadcastReceiver zzafe>
	//   36   74:aload_3         
	//   37   75:invokevirtual   #542 <Method void zzamq.zza(Context, BroadcastReceiver, IntentFilter)>
	//*  38   78:goto            24
		zzl(3);
	//   39   81:aload_0         
	//   40   82:iconst_3        
	//   41   83:invokevirtual   #507 <Method void zzl(int)>
		break MISSING_BLOCK_LABEL_94;
	//   42   86:goto            94
		zzfo1;
	//   43   89:astore_1        
		obj;
	//   44   90:aload_2         
		JVM INSTR monitorexit ;
	//   45   91:monitorexit     
		throw zzfo1;
	//   46   92:aload_1         
	//   47   93:athrow          
		zzafg.add(((Object) (zzfo1)));
	//   48   94:aload_0         
	//   49   95:getfield        #75  <Field HashSet zzafg>
	//   50   98:aload_1         
	//   51   99:invokevirtual   #546 <Method boolean HashSet.add(Object)>
	//   52  102:pop             
		try
		{
			zzfo1.zzb(zza(zza(zzaes.zzgh(), ((Boolean) (null)))), false);
	//   53  103:aload_1         
	//   54  104:aload_0         
	//   55  105:aload_0         
	//   56  106:getfield        #89  <Field zzgd zzaes>
	//   57  109:invokeinterface #552 <Method View zzgd.zzgh()>
	//   58  114:aconst_null     
	//   59  115:invokespecial   #554 <Method JSONObject zza(View, Boolean)>
	//   60  118:invokestatic    #391 <Method JSONObject zza(JSONObject)>
	//   61  121:iconst_0        
	//   62  122:invokeinterface #407 <Method void zzfo.zzb(JSONObject, boolean)>
			return;
	//   63  127:return          
		}
		// Misplaced declaration of an exception variable
		catch(zzfo zzfo1)
	//*  64  128:astore_1        
		{
			zzakb.zzb("Skipping measurement update for new client.", ((Throwable) (zzfo1)));
	//   65  129:ldc2            #556 <String "Skipping measurement update for new client.">
	//   66  132:aload_1         
	//   67  133:invokestatic    #300 <Method void zzakb.zzb(String, Throwable)>
		}
		return;
	//   68  136:return          
	}

	final void zza(zzfo zzfo1, Map map)
	{
		map = ((Map) (String.valueOf(((Object) (zzaet.zzfy())))));
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field zzer zzaet>
	//    2    4:invokevirtual   #469 <Method String zzer.zzfy()>
	//    3    7:invokestatic    #562 <Method String String.valueOf(Object)>
	//    4   10:astore_2        
		if(((String) (map)).length() != 0)
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #565 <Method int String.length()>
	//*   7   15:ifeq            29
			map = ((Map) ("Received request to untrack: ".concat(((String) (map)))));
	//    8   18:ldc2            #567 <String "Received request to untrack: ">
	//    9   21:aload_2         
	//   10   22:invokevirtual   #571 <Method String String.concat(String)>
	//   11   25:astore_2        
		else
	//*  12   26:goto            40
			map = ((Map) (new String("Received request to untrack: ")));
	//   13   29:new             #559 <Class String>
	//   14   32:dup             
	//   15   33:ldc2            #567 <String "Received request to untrack: ">
	//   16   36:invokespecial   #573 <Method void String(String)>
	//   17   39:astore_2        
		zzakb.zzck(((String) (map)));
	//   18   40:aload_2         
	//   19   41:invokestatic    #576 <Method void zzakb.zzck(String)>
		zzb(zzfo1);
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:invokevirtual   #578 <Method void zzb(zzfo)>
	//   23   49:return          
	}

	public final void zzb(zzfo zzfo1)
	{
		zzafg.remove(((Object) (zzfo1)));
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field HashSet zzafg>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #585 <Method boolean HashSet.remove(Object)>
	//    4    8:pop             
		zzfo1.zzgl();
	//    5    9:aload_1         
	//    6   10:invokeinterface #588 <Method void zzfo.zzgl()>
		if(!zzafg.isEmpty())
			break MISSING_BLOCK_LABEL_201;
	//    7   15:aload_0         
	//    8   16:getfield        #75  <Field HashSet zzafg>
	//    9   19:invokevirtual   #516 <Method boolean HashSet.isEmpty()>
	//   10   22:ifeq            201
		zzfo1 = ((zzfo) (mLock));
	//   11   25:aload_0         
	//   12   26:getfield        #64  <Field Object mLock>
	//   13   29:astore_1        
		zzfo1;
	//   14   30:aload_1         
		JVM INSTR monitorenter ;
	//   15   31:monitorenter    
		zzgf();
	//   16   32:aload_0         
	//   17   33:invokespecial   #590 <Method void zzgf()>
		Object obj = mLock;
	//   18   36:aload_0         
	//   19   37:getfield        #64  <Field Object mLock>
	//   20   40:astore          4
		obj;
	//   21   42:aload           4
		JVM INSTR monitorenter ;
	//   22   44:monitorenter    
		Object obj1 = ((Object) (zzafe));
	//   23   45:aload_0         
	//   24   46:getfield        #518 <Field BroadcastReceiver zzafe>
	//   25   49:astore          5
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_104;
	//   26   51:aload           5
	//   27   53:ifnull          104
		zzbv.zzfk().zza(zzaeo, zzafe);
	//   28   56:invokestatic    #537 <Method zzamq zzbv.zzfk()>
	//   29   59:aload_0         
	//   30   60:getfield        #170 <Field Context zzaeo>
	//   31   63:aload_0         
	//   32   64:getfield        #518 <Field BroadcastReceiver zzafe>
	//   33   67:invokevirtual   #593 <Method void zzamq.zza(Context, BroadcastReceiver)>
		break MISSING_BLOCK_LABEL_99;
	//   34   70:goto            99
		Object obj2;
		obj2;
	//   35   73:astore          5
		zzbv.zzeo().zza(((Throwable) (obj2)), "ActiveViewUnit.stopScreenStatusMonitoring");
	//   36   75:invokestatic    #597 <Method zzajm zzbv.zzeo()>
	//   37   78:aload           5
	//   38   80:ldc2            #599 <String "ActiveViewUnit.stopScreenStatusMonitoring">
	//   39   83:invokevirtual   #604 <Method void zzajm.zza(Throwable, String)>
		break MISSING_BLOCK_LABEL_99;
	//   40   86:goto            99
		obj2;
	//   41   89:astore          5
		zzakb.zzb("Failed trying to unregister the receiver", ((Throwable) (obj2)));
	//   42   91:ldc2            #606 <String "Failed trying to unregister the receiver">
	//   43   94:aload           5
	//   44   96:invokestatic    #300 <Method void zzakb.zzb(String, Throwable)>
		zzafe = null;
	//   45   99:aload_0         
	//   46  100:aconst_null     
	//   47  101:putfield        #518 <Field BroadcastReceiver zzafe>
		obj;
	//   48  104:aload           4
		JVM INSTR monitorexit ;
	//   49  106:monitorexit     
		zzaeo.getContentResolver().unregisterContentObserver(((android.database.ContentObserver) (zzafi)));
	//   50  107:aload_0         
	//   51  108:getfield        #170 <Field Context zzaeo>
	//   52  111:invokevirtual   #184 <Method ContentResolver Context.getContentResolver()>
	//   53  114:aload_0         
	//   54  115:getfield        #180 <Field zzew zzafi>
	//   55  118:invokevirtual   #610 <Method void ContentResolver.unregisterContentObserver(android.database.ContentObserver)>
		int i = 0;
	//   56  121:iconst_0        
	//   57  122:istore_2        
		int j;
		zzafb = false;
	//   58  123:aload_0         
	//   59  124:iconst_0        
	//   60  125:putfield        #93  <Field boolean zzafb>
		zzgd();
	//   61  128:aload_0         
	//   62  129:invokespecial   #612 <Method void zzgd()>
		obj = ((Object) ((ArrayList)new ArrayList(((java.util.Collection) (zzafg)))));
	//   63  132:new             #393 <Class ArrayList>
	//   64  135:dup             
	//   65  136:aload_0         
	//   66  137:getfield        #75  <Field HashSet zzafg>
	//   67  140:invokespecial   #396 <Method void ArrayList(java.util.Collection)>
	//   68  143:checkcast       #393 <Class ArrayList>
	//   69  146:astore          4
		j = ((ArrayList) (obj)).size();
	//   70  148:aload           4
	//   71  150:invokevirtual   #399 <Method int ArrayList.size()>
	//   72  153:istore_3        
_L1:
		if(i >= j)
			break MISSING_BLOCK_LABEL_183;
	//   73  154:iload_2         
	//   74  155:iload_3         
	//   75  156:icmpge          183
		obj2 = ((ArrayList) (obj)).get(i);
	//   76  159:aload           4
	//   77  161:iload_2         
	//   78  162:invokevirtual   #403 <Method Object ArrayList.get(int)>
	//   79  165:astore          5
		i++;
	//   80  167:iload_2         
	//   81  168:iconst_1        
	//   82  169:iadd            
	//   83  170:istore_2        
		zzb((zzfo)obj2);
	//   84  171:aload_0         
	//   85  172:aload           5
	//   86  174:checkcast       #405 <Class zzfo>
	//   87  177:invokevirtual   #578 <Method void zzb(zzfo)>
		  goto _L1
	//*  88  180:goto            154
		zzfo1;
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
		zzfo1;
	//   98  196:aload_1         
		JVM INSTR monitorexit ;
	//   99  197:monitorexit     
		throw exception;
	//  100  198:aload           4
	//  101  200:athrow          
	//  102  201:return          
	}

	final boolean zzc(Map map)
	{
		if(map == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		map = ((Map) ((String)map.get("hashCode")));
	//    4    6:aload_1         
	//    5    7:ldc2            #466 <String "hashCode">
	//    6   10:invokeinterface #619 <Method Object Map.get(Object)>
	//    7   15:checkcast       #559 <Class String>
	//    8   18:astore_1        
		return !TextUtils.isEmpty(((CharSequence) (map))) && ((String) (map)).equals(((Object) (zzaet.zzfy())));
	//    9   19:aload_1         
	//   10   20:invokestatic    #624 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   11   23:ifne            42
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #140 <Field zzer zzaet>
	//   15   31:invokevirtual   #469 <Method String zzer.zzfy()>
	//   16   34:invokevirtual   #627 <Method boolean String.equals(Object)>
	//   17   37:ifeq            42
	//   18   40:iconst_1        
	//   19   41:ireturn         
	//   20   42:iconst_0        
	//   21   43:ireturn         
	}

	final void zzd(Map map)
	{
		zzl(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokevirtual   #507 <Method void zzl(int)>
	//    3    5:return          
	}

	final void zze(Map map)
	{
		if(!map.containsKey("isVisible"))
	//*   0    0:aload_1         
	//*   1    1:ldc2            #272 <String "isVisible">
	//*   2    4:invokeinterface #635 <Method boolean Map.containsKey(Object)>
	//*   3    9:ifne            13
			return;
	//    4   12:return          
		boolean flag;
		if(!"1".equals(map.get("isVisible")) && !"true".equals(map.get("isVisible")))
	//*   5   13:ldc2            #637 <String "1">
	//*   6   16:aload_1         
	//*   7   17:ldc2            #272 <String "isVisible">
	//*   8   20:invokeinterface #619 <Method Object Map.get(Object)>
	//*   9   25:invokevirtual   #627 <Method boolean String.equals(Object)>
	//*  10   28:ifne            57
	//*  11   31:ldc2            #639 <String "true">
	//*  12   34:aload_1         
	//*  13   35:ldc2            #272 <String "isVisible">
	//*  14   38:invokeinterface #619 <Method Object Map.get(Object)>
	//*  15   43:invokevirtual   #627 <Method boolean String.equals(Object)>
	//*  16   46:ifeq            52
	//*  17   49:goto            57
			flag = false;
	//   18   52:iconst_0        
	//   19   53:istore_2        
		else
	//*  20   54:goto            59
			flag = true;
	//   21   57:iconst_1        
	//   22   58:istore_2        
		for(map = ((Map) (zzaff.iterator())); ((Iterator) (map)).hasNext(); ((zzeq)((Iterator) (map)).next()).zza(this, flag));
	//   23   59:aload_0         
	//   24   60:getfield        #73  <Field HashSet zzaff>
	//   25   63:invokevirtual   #643 <Method Iterator HashSet.iterator()>
	//   26   66:astore_1        
	//   27   67:aload_1         
	//   28   68:invokeinterface #648 <Method boolean Iterator.hasNext()>
	//   29   73:ifeq            95
	//   30   76:aload_1         
	//   31   77:invokeinterface #651 <Method Object Iterator.next()>
	//   32   82:checkcast       #653 <Class zzeq>
	//   33   85:aload_0         
	//   34   86:iload_2         
	//   35   87:invokeinterface #656 <Method void zzeq.zza(zzet, boolean)>
	//*  36   92:goto            67
	//   37   95:return          
	}

	public final void zzgb()
	{
		zzafj = zzalb.zzay(zzaeo);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #170 <Field Context zzaeo>
	//    3    5:invokestatic    #660 <Method float zzalb.zzay(Context)>
	//    4    8:putfield        #502 <Field float zzafj>
	//    5   11:return          
	}

	public final void zzgc()
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Object mLock>
	//    2    4:astore_3        
		obj1;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(!zzafb) goto _L2; else goto _L1
	//    5    7:aload_0         
	//    6    8:getfield        #93  <Field boolean zzafb>
	//    7   11:ifeq            101
_L1:
		zzafc = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #665 <Field boolean zzafc>
		JSONObject jsonobject = zzgg();
	//   11   19:aload_0         
	//   12   20:invokespecial   #260 <Method JSONObject zzgg()>
	//   13   23:astore_1        
		jsonobject.put("doneReasonCode", "u");
	//   14   24:aload_1         
	//   15   25:ldc2            #667 <String "doneReasonCode">
	//   16   28:ldc2            #669 <String "u">
	//   17   31:invokevirtual   #340 <Method JSONObject JSONObject.put(String, Object)>
	//   18   34:pop             
		zza(jsonobject, true);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:iconst_1        
	//   22   38:invokespecial   #671 <Method void zza(JSONObject, boolean)>
		  goto _L3
	//*  23   41:goto            57
		Object obj;
		obj;
	//   24   44:astore_1        
		String s = "Failure while processing active view data.";
	//   25   45:ldc2            #673 <String "Failure while processing active view data.">
	//   26   48:astore_2        
_L5:
		zzakb.zzb(s, ((Throwable) (obj)));
	//   27   49:aload_2         
	//   28   50:aload_1         
	//   29   51:invokestatic    #300 <Method void zzakb.zzb(String, Throwable)>
	//*  30   54:goto            57
_L3:
		obj = ((Object) (String.valueOf(((Object) (zzaet.zzfy())))));
	//   31   57:aload_0         
	//   32   58:getfield        #140 <Field zzer zzaet>
	//   33   61:invokevirtual   #469 <Method String zzer.zzfy()>
	//   34   64:invokestatic    #562 <Method String String.valueOf(Object)>
	//   35   67:astore_1        
		if(((String) (obj)).length() != 0)
	//*  36   68:aload_1         
	//*  37   69:invokevirtual   #565 <Method int String.length()>
	//*  38   72:ifeq            86
		{
			obj = ((Object) ("Untracking ad unit: ".concat(((String) (obj)))));
	//   39   75:ldc2            #675 <String "Untracking ad unit: ">
	//   40   78:aload_1         
	//   41   79:invokevirtual   #571 <Method String String.concat(String)>
	//   42   82:astore_1        
			break MISSING_BLOCK_LABEL_97;
	//   43   83:goto            97
		}
		obj = ((Object) (new String("Untracking ad unit: ")));
	//   44   86:new             #559 <Class String>
	//   45   89:dup             
	//   46   90:ldc2            #675 <String "Untracking ad unit: ">
	//   47   93:invokespecial   #573 <Method void String(String)>
	//   48   96:astore_1        
		zzakb.zzck(((String) (obj)));
	//   49   97:aload_1         
	//   50   98:invokestatic    #576 <Method void zzakb.zzck(String)>
_L2:
		obj1;
	//   51  101:aload_3         
		JVM INSTR monitorexit ;
	//   52  102:monitorexit     
		return;
	//   53  103:return          
		Exception exception;
		exception;
	//   54  104:astore_1        
		obj1;
	//   55  105:aload_3         
		JVM INSTR monitorexit ;
	//   56  106:monitorexit     
		throw exception;
	//   57  107:aload_1         
	//   58  108:athrow          
		exception;
	//   59  109:astore_1        
		s = "JSON failure while processing active view data.";
	//   60  110:ldc2            #677 <String "JSON failure while processing active view data.">
	//   61  113:astore_2        
		if(true) goto _L5; else goto _L4
	//   62  114:goto            49
_L4:
	}

	public final boolean zzge()
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzafb;
	//    5    7:aload_0         
	//    6    8:getfield        #93  <Field boolean zzafb>
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

	protected final void zzl(int i)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Object mLock>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj1 = ((Object) (zzafg.iterator()));
	//    5    9:aload_0         
	//    6   10:getfield        #75  <Field HashSet zzafg>
	//    7   13:invokevirtual   #643 <Method Iterator HashSet.iterator()>
	//    8   16:astore          6
_L4:
		if(!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
	//    9   18:aload           6
	//   10   20:invokeinterface #648 <Method boolean Iterator.hasNext()>
	//   11   25:ifeq            360
_L1:
		if(!((zzfo)((Iterator) (obj1)).next()).zzgk()) goto _L4; else goto _L3
	//   12   28:aload           6
	//   13   30:invokeinterface #651 <Method Object Iterator.next()>
	//   14   35:checkcast       #405 <Class zzfo>
	//   15   38:invokeinterface #681 <Method boolean zzfo.zzgk()>
	//   16   43:ifeq            18
_L3:
		boolean flag = true;
	//   17   46:iconst_1        
	//   18   47:istore_2        
	//*  19   48:goto            51
_L11:
		if(!flag) goto _L6; else goto _L5
	//   20   51:iload_2         
	//   21   52:ifeq            348
_L5:
		if(zzafb) goto _L7; else goto _L6
	//   22   55:aload_0         
	//   23   56:getfield        #93  <Field boolean zzafb>
	//   24   59:ifne            65
	//*  25   62:goto            348
_L7:
		obj1 = ((Object) (zzaes.zzgh()));
	//   26   65:aload_0         
	//   27   66:getfield        #89  <Field zzgd zzaes>
	//   28   69:invokeinterface #552 <Method View zzgd.zzgh()>
	//   29   74:astore          6
		if(obj1 == null) goto _L9; else goto _L8
	//   30   76:aload           6
	//   31   78:ifnull          365
_L8:
		if(!zzbv.zzek().zza(((View) (obj1)), zzaev, zzaew)) goto _L9; else goto _L10
	//   32   81:invokestatic    #361 <Method zzakk zzbv.zzek()>
	//   33   84:aload           6
	//   34   86:aload_0         
	//   35   87:getfield        #162 <Field PowerManager zzaev>
	//   36   90:aload_0         
	//   37   91:getfield        #168 <Field KeyguardManager zzaew>
	//   38   94:invokevirtual   #366 <Method boolean zzakk.zza(View, PowerManager, KeyguardManager)>
	//   39   97:ifeq            365
_L10:
		boolean flag1 = true;
	//   40  100:iconst_1        
	//   41  101:istore_3        
	//*  42  102:goto            105
_L12:
		if(obj1 == null || !flag1)
			break MISSING_BLOCK_LABEL_370;
	//   43  105:aload           6
	//   44  107:ifnull          370
	//   45  110:iload_3         
	//   46  111:ifeq            370
		if(!((View) (obj1)).getGlobalVisibleRect(new Rect(), ((android.graphics.Point) (null))))
			break MISSING_BLOCK_LABEL_370;
	//   47  114:aload           6
	//   48  116:new             #77  <Class Rect>
	//   49  119:dup             
	//   50  120:invokespecial   #78  <Method void Rect()>
	//   51  123:aconst_null     
	//   52  124:invokevirtual   #312 <Method boolean View.getGlobalVisibleRect(Rect, android.graphics.Point)>
	//   53  127:ifeq            370
		boolean flag2 = true;
	//   54  130:iconst_1        
	//   55  131:istore          4
	//*  56  133:goto            136
_L13:
		if(!zzaes.zzgi())
			break MISSING_BLOCK_LABEL_156;
	//   57  136:aload_0         
	//   58  137:getfield        #89  <Field zzgd zzaes>
	//   59  140:invokeinterface #684 <Method boolean zzgd.zzgi()>
	//   60  145:ifeq            156
		zzgc();
	//   61  148:aload_0         
	//   62  149:invokevirtual   #686 <Method void zzgc()>
		obj;
	//   63  152:aload           5
		JVM INSTR monitorexit ;
	//   64  154:monitorexit     
		return;
	//   65  155:return          
		if(i != 1)
			break MISSING_BLOCK_LABEL_184;
	//   66  156:iload_1         
	//   67  157:iconst_1        
	//   68  158:icmpne          184
		if(zzadz.tryAcquire() || flag2 != zzafd)
			break MISSING_BLOCK_LABEL_184;
	//   69  161:aload_0         
	//   70  162:getfield        #104 <Field zzamj zzadz>
	//   71  165:invokevirtual   #689 <Method boolean zzamj.tryAcquire()>
	//   72  168:ifne            184
	//   73  171:iload           4
	//   74  173:aload_0         
	//   75  174:getfield        #95  <Field boolean zzafd>
	//   76  177:icmpne          184
		obj;
	//   77  180:aload           5
		JVM INSTR monitorexit ;
	//   78  182:monitorexit     
		return;
	//   79  183:return          
		if(flag2)
			break MISSING_BLOCK_LABEL_205;
	//   80  184:iload           4
	//   81  186:ifne            205
		if(zzafd || i != 1)
			break MISSING_BLOCK_LABEL_205;
	//   82  189:aload_0         
	//   83  190:getfield        #95  <Field boolean zzafd>
	//   84  193:ifne            205
	//   85  196:iload_1         
	//   86  197:iconst_1        
	//   87  198:icmpne          205
		obj;
	//   88  201:aload           5
		JVM INSTR monitorexit ;
	//   89  203:monitorexit     
		return;
	//   90  204:return          
		zza(zza(((View) (obj1)), Boolean.valueOf(flag1)), false);
	//   91  205:aload_0         
	//   92  206:aload_0         
	//   93  207:aload           6
	//   94  209:iload_3         
	//   95  210:invokestatic    #372 <Method Boolean Boolean.valueOf(boolean)>
	//   96  213:invokespecial   #554 <Method JSONObject zza(View, Boolean)>
	//   97  216:iconst_0        
	//   98  217:invokespecial   #671 <Method void zza(JSONObject, boolean)>
		zzafd = flag2;
	//   99  220:aload_0         
	//  100  221:iload           4
	//  101  223:putfield        #95  <Field boolean zzafd>
		break MISSING_BLOCK_LABEL_239;
	//  102  226:goto            239
		Object obj2;
		obj2;
	//  103  229:astore          6
		zzakb.zza("Active view update failed.", ((Throwable) (obj2)));
	//  104  231:ldc2            #691 <String "Active view update failed.">
	//  105  234:aload           6
	//  106  236:invokestatic    #693 <Method void zzakb.zza(String, Throwable)>
		Object obj3 = ((Object) (zzaes.zzgj().zzgh()));
	//  107  239:aload_0         
	//  108  240:getfield        #89  <Field zzgd zzaes>
	//  109  243:invokeinterface #697 <Method zzgd zzgd.zzgj()>
	//  110  248:invokeinterface #552 <Method View zzgd.zzgh()>
	//  111  253:astore          7
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_340;
	//  112  255:aload           7
	//  113  257:ifnull          340
		obj2 = ((Object) ((ViewTreeObserver)zzaer.get()));
	//  114  260:aload_0         
	//  115  261:getfield        #91  <Field WeakReference zzaer>
	//  116  264:invokevirtual   #421 <Method Object WeakReference.get()>
	//  117  267:checkcast       #423 <Class ViewTreeObserver>
	//  118  270:astore          6
		obj3 = ((Object) (((View) (obj3)).getViewTreeObserver()));
	//  119  272:aload           7
	//  120  274:invokevirtual   #701 <Method ViewTreeObserver View.getViewTreeObserver()>
	//  121  277:astore          7
		if(obj3 == obj2)
			break MISSING_BLOCK_LABEL_340;
	//  122  279:aload           7
	//  123  281:aload           6
	//  124  283:if_acmpeq       340
		zzgf();
	//  125  286:aload_0         
	//  126  287:invokespecial   #590 <Method void zzgf()>
		if(!zzaez)
			break MISSING_BLOCK_LABEL_310;
	//  127  290:aload_0         
	//  128  291:getfield        #703 <Field boolean zzaez>
	//  129  294:ifeq            310
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_327;
	//  130  297:aload           6
	//  131  299:ifnull          327
		if(!((ViewTreeObserver) (obj2)).isAlive())
			break MISSING_BLOCK_LABEL_327;
	//  132  302:aload           6
	//  133  304:invokevirtual   #426 <Method boolean ViewTreeObserver.isAlive()>
	//  134  307:ifeq            327
		zzaez = true;
	//  135  310:aload_0         
	//  136  311:iconst_1        
	//  137  312:putfield        #703 <Field boolean zzaez>
		((ViewTreeObserver) (obj3)).addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//  138  315:aload           7
	//  139  317:aload_0         
	//  140  318:invokevirtual   #706 <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
		((ViewTreeObserver) (obj3)).addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//  141  321:aload           7
	//  142  323:aload_0         
	//  143  324:invokevirtual   #709 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		zzaer = new WeakReference(obj3);
	//  144  327:aload_0         
	//  145  328:new             #82  <Class WeakReference>
	//  146  331:dup             
	//  147  332:aload           7
	//  148  334:invokespecial   #85  <Method void WeakReference(Object)>
	//  149  337:putfield        #91  <Field WeakReference zzaer>
		zzgd();
	//  150  340:aload_0         
	//  151  341:invokespecial   #612 <Method void zzgd()>
		obj;
	//  152  344:aload           5
		JVM INSTR monitorexit ;
	//  153  346:monitorexit     
		return;
	//  154  347:return          
_L6:
		obj;
	//  155  348:aload           5
		JVM INSTR monitorexit ;
	//  156  350:monitorexit     
		return;
	//  157  351:return          
		obj2;
	//  158  352:astore          6
		obj;
	//  159  354:aload           5
		JVM INSTR monitorexit ;
	//  160  356:monitorexit     
		throw obj2;
	//  161  357:aload           6
	//  162  359:athrow          
_L2:
		flag = false;
	//  163  360:iconst_0        
	//  164  361:istore_2        
		  goto _L11
	//* 165  362:goto            51
_L9:
		flag1 = false;
	//  166  365:iconst_0        
	//  167  366:istore_3        
		  goto _L12
	//* 168  367:goto            105
		flag2 = false;
	//  169  370:iconst_0        
	//  170  371:istore          4
		  goto _L13
	//* 171  373:goto            136
	}

	private final Object mLock = new Object();
	private boolean zzaaq;
	private zzamj zzadz;
	private final Context zzaeo;
	private final WeakReference zzaeq;
	private WeakReference zzaer;
	private final zzgd zzaes;
	protected final zzer zzaet;
	private final WindowManager zzaeu;
	private final PowerManager zzaev;
	private final KeyguardManager zzaew;
	private final DisplayMetrics zzaex;
	private zzfa zzaey;
	private boolean zzaez;
	private boolean zzafa;
	private boolean zzafb;
	private boolean zzafc;
	private boolean zzafd;
	private BroadcastReceiver zzafe;
	private final HashSet zzaff = new HashSet();
	private final HashSet zzafg = new HashSet();
	private final Rect zzafh = new Rect();
	private final zzew zzafi = new zzew(this, new Handler());
	private float zzafj;
}
