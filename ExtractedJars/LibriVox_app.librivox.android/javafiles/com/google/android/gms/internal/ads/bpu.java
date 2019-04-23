// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.*;
import android.content.*;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.*;
import android.util.DisplayMetrics;
import android.view.*;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			p, bwk, m, zk, 
//			bpz, xo, wx, xg, 
//			bpx, bpy, bpw, zr, 
//			bpv, wi

public final class bpu
	implements android.app.Application.ActivityLifecycleCallbacks, android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

	public bpu(Context context, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #78  <Method void Object()>
		k = new zk(a);
	//    2    4:aload_0         
	//    3    5:new             #80  <Class zk>
	//    4    8:dup             
	//    5    9:getstatic       #73  <Field long a>
	//    6   12:invokespecial   #83  <Method void zk(long)>
	//    7   15:putfield        #85  <Field zk k>
		l = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #87  <Field boolean l>
		m = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #89  <Field int m>
	//   14   28:aload_0         
	//   15   29:new             #91  <Class HashSet>
	//   16   32:dup             
	//   17   33:invokespecial   #92  <Method void HashSet()>
	//   18   36:putfield        #94  <Field HashSet n>
		b = context.getApplicationContext();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #100 <Method Context Context.getApplicationContext()>
	//   22   44:putfield        #102 <Field Context b>
		d = (WindowManager)context.getSystemService("window");
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:ldc1            #104 <String "window">
	//   26   51:invokevirtual   #108 <Method Object Context.getSystemService(String)>
	//   27   54:checkcast       #110 <Class WindowManager>
	//   28   57:putfield        #112 <Field WindowManager d>
		e = (PowerManager)b.getSystemService("power");
	//   29   60:aload_0         
	//   30   61:aload_0         
	//   31   62:getfield        #102 <Field Context b>
	//   32   65:ldc1            #114 <String "power">
	//   33   67:invokevirtual   #108 <Method Object Context.getSystemService(String)>
	//   34   70:checkcast       #116 <Class PowerManager>
	//   35   73:putfield        #118 <Field PowerManager e>
		f = (KeyguardManager)context.getSystemService("keyguard");
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:ldc1            #120 <String "keyguard">
	//   39   80:invokevirtual   #108 <Method Object Context.getSystemService(String)>
	//   40   83:checkcast       #122 <Class KeyguardManager>
	//   41   86:putfield        #124 <Field KeyguardManager f>
		Context context1 = b;
	//   42   89:aload_0         
	//   43   90:getfield        #102 <Field Context b>
	//   44   93:astore_3        
		if(context1 instanceof Application)
	//*  45   94:aload_3         
	//*  46   95:instanceof      #126 <Class Application>
	//*  47   98:ifeq            125
		{
			c = (Application)context1;
	//   48  101:aload_0         
	//   49  102:aload_3         
	//   50  103:checkcast       #126 <Class Application>
	//   51  106:putfield        #128 <Field Application c>
			j = new bpz((Application)context1, ((android.app.Application.ActivityLifecycleCallbacks) (this)));
	//   52  109:aload_0         
	//   53  110:new             #130 <Class bpz>
	//   54  113:dup             
	//   55  114:aload_3         
	//   56  115:checkcast       #126 <Class Application>
	//   57  118:aload_0         
	//   58  119:invokespecial   #133 <Method void bpz(Application, android.app.Application$ActivityLifecycleCallbacks)>
	//   59  122:putfield        #135 <Field bpz j>
		}
		o = context.getResources().getDisplayMetrics();
	//   60  125:aload_0         
	//   61  126:aload_1         
	//   62  127:invokevirtual   #139 <Method Resources Context.getResources()>
	//   63  130:invokevirtual   #145 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   64  133:putfield        #147 <Field DisplayMetrics o>
	//   65  136:aload_0         
	//   66  137:new             #149 <Class Rect>
	//   67  140:dup             
	//   68  141:invokespecial   #150 <Method void Rect()>
	//   69  144:putfield        #152 <Field Rect p>
		p.right = d.getDefaultDisplay().getWidth();
	//   70  147:aload_0         
	//   71  148:getfield        #152 <Field Rect p>
	//   72  151:aload_0         
	//   73  152:getfield        #112 <Field WindowManager d>
	//   74  155:invokeinterface #156 <Method Display WindowManager.getDefaultDisplay()>
	//   75  160:invokevirtual   #162 <Method int Display.getWidth()>
	//   76  163:putfield        #165 <Field int Rect.right>
		p.bottom = d.getDefaultDisplay().getHeight();
	//   77  166:aload_0         
	//   78  167:getfield        #152 <Field Rect p>
	//   79  170:aload_0         
	//   80  171:getfield        #112 <Field WindowManager d>
	//   81  174:invokeinterface #156 <Method Display WindowManager.getDefaultDisplay()>
	//   82  179:invokevirtual   #168 <Method int Display.getHeight()>
	//   83  182:putfield        #171 <Field int Rect.bottom>
		context = ((Context) (i));
	//   84  185:aload_0         
	//   85  186:getfield        #173 <Field WeakReference i>
	//   86  189:astore_1        
		if(context != null)
	//*  87  190:aload_1         
	//*  88  191:ifnull          205
			context = ((Context) ((View)((WeakReference) (context)).get()));
	//   89  194:aload_1         
	//   90  195:invokevirtual   #179 <Method Object WeakReference.get()>
	//   91  198:checkcast       #181 <Class View>
	//   92  201:astore_1        
		else
	//*  93  202:goto            207
			context = null;
	//   94  205:aconst_null     
	//   95  206:astore_1        
		if(context != null)
	//*  96  207:aload_1         
	//*  97  208:ifnull          221
		{
			((View) (context)).removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   98  211:aload_1         
	//   99  212:aload_0         
	//  100  213:invokevirtual   #185 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			b(((View) (context)));
	//  101  216:aload_0         
	//  102  217:aload_1         
	//  103  218:invokespecial   #188 <Method void b(View)>
		}
		i = new WeakReference(((Object) (view)));
	//  104  221:aload_0         
	//  105  222:new             #175 <Class WeakReference>
	//  106  225:dup             
	//  107  226:aload_2         
	//  108  227:invokespecial   #191 <Method void WeakReference(Object)>
	//  109  230:putfield        #173 <Field WeakReference i>
		if(view != null)
	//* 110  233:aload_2         
	//* 111  234:ifnull          257
		{
			if(aw.g().a(view))
	//* 112  237:invokestatic    #196 <Method xo aw.g()>
	//* 113  240:aload_2         
	//* 114  241:invokevirtual   #201 <Method boolean xo.a(View)>
	//* 115  244:ifeq            252
				a(view);
	//  116  247:aload_0         
	//  117  248:aload_2         
	//  118  249:invokespecial   #203 <Method void a(View)>
			view.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//  119  252:aload_2         
	//  120  253:aload_0         
	//  121  254:invokevirtual   #206 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		}
	//  122  257:return          
	}

	private final Rect a(Rect rect)
	{
		return new Rect(b(rect.left), b(rect.top), b(rect.right), b(rect.bottom));
	//    0    0:new             #149 <Class Rect>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #210 <Field int Rect.left>
	//    5    9:invokespecial   #213 <Method int b(int)>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #216 <Field int Rect.top>
	//    9   17:invokespecial   #213 <Method int b(int)>
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #165 <Field int Rect.right>
	//   13   25:invokespecial   #213 <Method int b(int)>
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #171 <Field int Rect.bottom>
	//   17   33:invokespecial   #213 <Method int b(int)>
	//   18   36:invokespecial   #219 <Method void Rect(int, int, int, int)>
	//   19   39:areturn         
	}

	private final void a(int i1)
	{
		if(n.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field HashSet n>
	//*   2    4:invokevirtual   #225 <Method int HashSet.size()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		Object obj = ((Object) (i));
	//    5   11:aload_0         
	//    6   12:getfield        #173 <Field WeakReference i>
	//    7   15:astore          13
		if(obj == null)
	//*   8   17:aload           13
	//*   9   19:ifnonnull       23
			return;
	//   10   22:return          
		obj = ((Object) ((View)((WeakReference) (obj)).get()));
	//   11   23:aload           13
	//   12   25:invokevirtual   #179 <Method Object WeakReference.get()>
	//   13   28:checkcast       #181 <Class View>
	//   14   31:astore          13
		boolean flag;
		if(i1 == 1)
	//*  15   33:iload_1         
	//*  16   34:iconst_1        
	//*  17   35:icmpne          43
			flag = true;
	//   18   38:iconst_1        
	//   19   39:istore_3        
		else
	//*  20   40:goto            45
			flag = false;
	//   21   43:iconst_0        
	//   22   44:istore_3        
		boolean flag1;
		if(obj == null)
	//*  23   45:aload           13
	//*  24   47:ifnonnull       56
			flag1 = true;
	//   25   50:iconst_1        
	//   26   51:istore          4
		else
	//*  27   53:goto            59
			flag1 = false;
	//   28   56:iconst_0        
	//   29   57:istore          4
		Rect rect = new Rect();
	//   30   59:new             #149 <Class Rect>
	//   31   62:dup             
	//   32   63:invokespecial   #150 <Method void Rect()>
	//   33   66:astore          14
		Rect rect1 = new Rect();
	//   34   68:new             #149 <Class Rect>
	//   35   71:dup             
	//   36   72:invokespecial   #150 <Method void Rect()>
	//   37   75:astore          15
		Rect rect2 = new Rect();
	//   38   77:new             #149 <Class Rect>
	//   39   80:dup             
	//   40   81:invokespecial   #150 <Method void Rect()>
	//   41   84:astore          16
		Rect rect3 = new Rect();
	//   42   86:new             #149 <Class Rect>
	//   43   89:dup             
	//   44   90:invokespecial   #150 <Method void Rect()>
	//   45   93:astore          17
		int ai[] = new int[2];
	//   46   95:iconst_2        
	//   47   96:newarray        int[]
	//   48   98:astore          18
		int ai1[] = new int[2];
	//   49  100:iconst_2        
	//   50  101:newarray        int[]
	//   51  103:astore          19
		boolean flag2;
		boolean flag3;
		if(obj != null)
	//*  52  105:aload           13
	//*  53  107:ifnull          214
		{
			flag2 = ((View) (obj)).getGlobalVisibleRect(rect1);
	//   54  110:aload           13
	//   55  112:aload           15
	//   56  114:invokevirtual   #229 <Method boolean View.getGlobalVisibleRect(Rect)>
	//   57  117:istore          6
			flag3 = ((View) (obj)).getLocalVisibleRect(rect2);
	//   58  119:aload           13
	//   59  121:aload           16
	//   60  123:invokevirtual   #232 <Method boolean View.getLocalVisibleRect(Rect)>
	//   61  126:istore          7
			((View) (obj)).getHitRect(rect3);
	//   62  128:aload           13
	//   63  130:aload           17
	//   64  132:invokevirtual   #236 <Method void View.getHitRect(Rect)>
			try
			{
				((View) (obj)).getLocationOnScreen(ai);
	//   65  135:aload           13
	//   66  137:aload           18
	//   67  139:invokevirtual   #240 <Method void View.getLocationOnScreen(int[])>
				((View) (obj)).getLocationInWindow(ai1);
	//   68  142:aload           13
	//   69  144:aload           19
	//   70  146:invokevirtual   #243 <Method void View.getLocationInWindow(int[])>
			}
	//*  71  149:goto            161
			catch(Exception exception)
	//*  72  152:astore          19
			{
				wx.b("Failure getting view location.", ((Throwable) (exception)));
	//   73  154:ldc1            #245 <String "Failure getting view location.">
	//   74  156:aload           19
	//   75  158:invokestatic    #250 <Method void wx.b(String, Throwable)>
			}
			rect.left = ai[0];
	//   76  161:aload           14
	//   77  163:aload           18
	//   78  165:iconst_0        
	//   79  166:iaload          
	//   80  167:putfield        #210 <Field int Rect.left>
			rect.top = ai[1];
	//   81  170:aload           14
	//   82  172:aload           18
	//   83  174:iconst_1        
	//   84  175:iaload          
	//   85  176:putfield        #216 <Field int Rect.top>
			rect.right = rect.left + ((View) (obj)).getWidth();
	//   86  179:aload           14
	//   87  181:aload           14
	//   88  183:getfield        #210 <Field int Rect.left>
	//   89  186:aload           13
	//   90  188:invokevirtual   #251 <Method int View.getWidth()>
	//   91  191:iadd            
	//   92  192:putfield        #165 <Field int Rect.right>
			rect.bottom = rect.top + ((View) (obj)).getHeight();
	//   93  195:aload           14
	//   94  197:aload           14
	//   95  199:getfield        #216 <Field int Rect.top>
	//   96  202:aload           13
	//   97  204:invokevirtual   #252 <Method int View.getHeight()>
	//   98  207:iadd            
	//   99  208:putfield        #171 <Field int Rect.bottom>
		} else
	//* 100  211:goto            220
		{
			flag2 = false;
	//  101  214:iconst_0        
	//  102  215:istore          6
			flag3 = false;
	//  103  217:iconst_0        
	//  104  218:istore          7
		}
		int j1;
		if(obj != null)
	//* 105  220:aload           13
	//* 106  222:ifnull          234
			j1 = ((View) (obj)).getWindowVisibility();
	//  107  225:aload           13
	//  108  227:invokevirtual   #255 <Method int View.getWindowVisibility()>
	//  109  230:istore_2        
		else
	//* 110  231:goto            237
			j1 = 8;
	//  111  234:bipush          8
	//  112  236:istore_2        
		int k1 = m;
	//  113  237:aload_0         
	//  114  238:getfield        #89  <Field int m>
	//  115  241:istore          5
		if(k1 != -1)
	//* 116  243:iload           5
	//* 117  245:iconst_m1       
	//* 118  246:icmpeq          252
			j1 = k1;
	//  119  249:iload           5
	//  120  251:istore_2        
		boolean flag4;
		if(!flag1 && aw.e().a(((View) (obj)), e, f) && flag2 && flag3 && j1 == 0)
	//* 121  252:iload           4
	//* 122  254:ifne            296
	//* 123  257:invokestatic    #258 <Method xg aw.e()>
	//* 124  260:aload           13
	//* 125  262:aload_0         
	//* 126  263:getfield        #118 <Field PowerManager e>
	//* 127  266:aload_0         
	//* 128  267:getfield        #124 <Field KeyguardManager f>
	//* 129  270:invokevirtual   #263 <Method boolean xg.a(View, PowerManager, KeyguardManager)>
	//* 130  273:ifeq            296
	//* 131  276:iload           6
	//* 132  278:ifeq            296
	//* 133  281:iload           7
	//* 134  283:ifeq            296
	//* 135  286:iload_2         
	//* 136  287:ifne            296
			flag4 = true;
	//  137  290:iconst_1        
	//  138  291:istore          8
		else
	//* 139  293:goto            299
			flag4 = false;
	//  140  296:iconst_0        
	//  141  297:istore          8
		if(flag && !k.a() && flag4 == l)
	//* 142  299:iload_3         
	//* 143  300:ifeq            323
	//* 144  303:aload_0         
	//* 145  304:getfield        #85  <Field zk k>
	//* 146  307:invokevirtual   #266 <Method boolean zk.a()>
	//* 147  310:ifne            323
	//* 148  313:iload           8
	//* 149  315:aload_0         
	//* 150  316:getfield        #87  <Field boolean l>
	//* 151  319:icmpne          323
			return;
	//  152  322:return          
		if(!flag4 && !l && i1 == 1)
	//* 153  323:iload           8
	//* 154  325:ifne            341
	//* 155  328:aload_0         
	//* 156  329:getfield        #87  <Field boolean l>
	//* 157  332:ifne            341
	//* 158  335:iload_1         
	//* 159  336:iconst_1        
	//* 160  337:icmpne          341
			return;
	//  161  340:return          
		long l1 = aw.l().b();
	//  162  341:invokestatic    #269 <Method e aw.l()>
	//  163  344:invokeinterface #273 <Method long e.b()>
	//  164  349:lstore          11
		boolean flag6 = e.isScreenOn();
	//  165  351:aload_0         
	//  166  352:getfield        #118 <Field PowerManager e>
	//  167  355:invokevirtual   #276 <Method boolean PowerManager.isScreenOn()>
	//  168  358:istore          10
		boolean flag5;
		if(obj != null)
	//* 169  360:aload           13
	//* 170  362:ifnull          378
			flag5 = aw.g().a(((View) (obj)));
	//  171  365:invokestatic    #196 <Method xo aw.g()>
	//  172  368:aload           13
	//  173  370:invokevirtual   #201 <Method boolean xo.a(View)>
	//  174  373:istore          9
		else
	//* 175  375:goto            381
			flag5 = false;
	//  176  378:iconst_0        
	//  177  379:istore          9
		if(obj != null)
	//* 178  381:aload           13
	//* 179  383:ifnull          395
			i1 = ((View) (obj)).getWindowVisibility();
	//  180  386:aload           13
	//  181  388:invokevirtual   #255 <Method int View.getWindowVisibility()>
	//  182  391:istore_1        
		else
	//* 183  392:goto            398
			i1 = 8;
	//  184  395:bipush          8
	//  185  397:istore_1        
		obj = ((Object) (new bpx(l1, flag6, flag5, i1, a(p), a(rect), a(rect1), flag2, a(rect2), flag3, a(rect3), o.density, flag4)));
	//  186  398:new             #278 <Class bpx>
	//  187  401:dup             
	//  188  402:lload           11
	//  189  404:iload           10
	//  190  406:iload           9
	//  191  408:iload_1         
	//  192  409:aload_0         
	//  193  410:aload_0         
	//  194  411:getfield        #152 <Field Rect p>
	//  195  414:invokespecial   #280 <Method Rect a(Rect)>
	//  196  417:aload_0         
	//  197  418:aload           14
	//  198  420:invokespecial   #280 <Method Rect a(Rect)>
	//  199  423:aload_0         
	//  200  424:aload           15
	//  201  426:invokespecial   #280 <Method Rect a(Rect)>
	//  202  429:iload           6
	//  203  431:aload_0         
	//  204  432:aload           16
	//  205  434:invokespecial   #280 <Method Rect a(Rect)>
	//  206  437:iload           7
	//  207  439:aload_0         
	//  208  440:aload           17
	//  209  442:invokespecial   #280 <Method Rect a(Rect)>
	//  210  445:aload_0         
	//  211  446:getfield        #147 <Field DisplayMetrics o>
	//  212  449:getfield        #286 <Field float DisplayMetrics.density>
	//  213  452:iload           8
	//  214  454:invokespecial   #289 <Method void bpx(long, boolean, boolean, int, Rect, Rect, Rect, boolean, Rect, boolean, Rect, float, boolean)>
	//  215  457:astore          13
		for(Iterator iterator = n.iterator(); iterator.hasNext(); ((bpy)iterator.next()).a(((bpx) (obj))));
	//  216  459:aload_0         
	//  217  460:getfield        #94  <Field HashSet n>
	//  218  463:invokevirtual   #293 <Method Iterator HashSet.iterator()>
	//  219  466:astore          14
	//  220  468:aload           14
	//  221  470:invokeinterface #298 <Method boolean Iterator.hasNext()>
	//  222  475:ifeq            498
	//  223  478:aload           14
	//  224  480:invokeinterface #301 <Method Object Iterator.next()>
	//  225  485:checkcast       #303 <Class bpy>
	//  226  488:aload           13
	//  227  490:invokeinterface #306 <Method void bpy.a(bpx)>
	//* 228  495:goto            468
		l = flag4;
	//  229  498:aload_0         
	//  230  499:iload           8
	//  231  501:putfield        #87  <Field boolean l>
	//  232  504:return          
	}

	private final void a(Activity activity, int i1)
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field WeakReference i>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		activity = ((Activity) (activity.getWindow()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #313 <Method Window Activity.getWindow()>
	//    6   12:astore_1        
		if(activity == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       18
			return;
	//    9   17:return          
		activity = ((Activity) (((Window) (activity)).peekDecorView()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #319 <Method View Window.peekDecorView()>
	//   12   22:astore_1        
		View view = (View)i.get();
	//   13   23:aload_0         
	//   14   24:getfield        #173 <Field WeakReference i>
	//   15   27:invokevirtual   #179 <Method Object WeakReference.get()>
	//   16   30:checkcast       #181 <Class View>
	//   17   33:astore_3        
		if(view != null && activity != null && view.getRootView() == ((View) (activity)).getRootView())
	//*  18   34:aload_3         
	//*  19   35:ifnull          58
	//*  20   38:aload_1         
	//*  21   39:ifnull          58
	//*  22   42:aload_3         
	//*  23   43:invokevirtual   #322 <Method View View.getRootView()>
	//*  24   46:aload_1         
	//*  25   47:invokevirtual   #322 <Method View View.getRootView()>
	//*  26   50:if_acmpne       58
			m = i1;
	//   27   53:aload_0         
	//   28   54:iload_2         
	//   29   55:putfield        #89  <Field int m>
	//   30   58:return          
	}

	private final void a(View view)
	{
		view = ((View) (view.getViewTreeObserver()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #326 <Method ViewTreeObserver View.getViewTreeObserver()>
	//    2    4:astore_1        
		if(((ViewTreeObserver) (view)).isAlive())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #331 <Method boolean ViewTreeObserver.isAlive()>
	//*   5    9:ifeq            34
		{
			h = new WeakReference(((Object) (view)));
	//    6   12:aload_0         
	//    7   13:new             #175 <Class WeakReference>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #191 <Method void WeakReference(Object)>
	//   11   21:putfield        #333 <Field WeakReference h>
			((ViewTreeObserver) (view)).addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #337 <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
			((ViewTreeObserver) (view)).addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #341 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		if(g == null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #343 <Field BroadcastReceiver g>
	//*  20   38:ifnonnull       97
		{
			view = ((View) (new IntentFilter()));
	//   21   41:new             #345 <Class IntentFilter>
	//   22   44:dup             
	//   23   45:invokespecial   #346 <Method void IntentFilter()>
	//   24   48:astore_1        
			((IntentFilter) (view)).addAction("android.intent.action.SCREEN_ON");
	//   25   49:aload_1         
	//   26   50:ldc2            #348 <String "android.intent.action.SCREEN_ON">
	//   27   53:invokevirtual   #352 <Method void IntentFilter.addAction(String)>
			((IntentFilter) (view)).addAction("android.intent.action.SCREEN_OFF");
	//   28   56:aload_1         
	//   29   57:ldc2            #354 <String "android.intent.action.SCREEN_OFF">
	//   30   60:invokevirtual   #352 <Method void IntentFilter.addAction(String)>
			((IntentFilter) (view)).addAction("android.intent.action.USER_PRESENT");
	//   31   63:aload_1         
	//   32   64:ldc2            #356 <String "android.intent.action.USER_PRESENT">
	//   33   67:invokevirtual   #352 <Method void IntentFilter.addAction(String)>
			g = ((BroadcastReceiver) (new bpw(this)));
	//   34   70:aload_0         
	//   35   71:new             #358 <Class bpw>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:invokespecial   #361 <Method void bpw(bpu)>
	//   39   79:putfield        #343 <Field BroadcastReceiver g>
			aw.B().a(b, g, ((IntentFilter) (view)));
	//   40   82:invokestatic    #365 <Method zr aw.B()>
	//   41   85:aload_0         
	//   42   86:getfield        #102 <Field Context b>
	//   43   89:aload_0         
	//   44   90:getfield        #343 <Field BroadcastReceiver g>
	//   45   93:aload_1         
	//   46   94:invokevirtual   #370 <Method void zr.a(Context, BroadcastReceiver, IntentFilter)>
		}
		view = ((View) (c));
	//   47   97:aload_0         
	//   48   98:getfield        #128 <Field Application c>
	//   49  101:astore_1        
		if(view != null)
	//*  50  102:aload_1         
	//*  51  103:ifnull          123
			try
			{
				((Application) (view)).registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (j)));
	//   52  106:aload_1         
	//   53  107:aload_0         
	//   54  108:getfield        #135 <Field bpz j>
	//   55  111:invokevirtual   #374 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
				return;
	//   56  114:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  57  115:astore_1        
			{
				wx.b("Error registering activity lifecycle callbacks.", ((Throwable) (view)));
	//   58  116:ldc2            #376 <String "Error registering activity lifecycle callbacks.">
	//   59  119:aload_1         
	//   60  120:invokestatic    #250 <Method void wx.b(String, Throwable)>
			}
	//   61  123:return          
	}

	static void a(bpu bpu1, int i1)
	{
		bpu1.a(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #379 <Method void a(int)>
	//    3    5:return          
	}

	private final int b(int i1)
	{
		float f1 = o.density;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field DisplayMetrics o>
	//    2    4:getfield        #286 <Field float DisplayMetrics.density>
	//    3    7:fstore_2        
		return (int)((float)i1 / f1);
	//    4    8:iload_1         
	//    5    9:i2f             
	//    6   10:fload_2         
	//    7   11:fdiv            
	//    8   12:f2i             
	//    9   13:ireturn         
	}

	private final void b()
	{
		aw.e();
	//    0    0:invokestatic    #258 <Method xg aw.e()>
	//    1    3:pop             
		xg.a.post(((Runnable) (new bpv(this))));
	//    2    4:getstatic       #382 <Field Handler xg.a>
	//    3    7:new             #384 <Class bpv>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #385 <Method void bpv(bpu)>
	//    7   15:invokevirtual   #391 <Method boolean Handler.post(Runnable)>
	//    8   18:pop             
	//    9   19:return          
	}

	private final void b(View view)
	{
		ViewTreeObserver viewtreeobserver;
		if(h == null)
			break MISSING_BLOCK_LABEL_55;
	//    0    0:aload_0         
	//    1    1:getfield        #333 <Field WeakReference h>
	//    2    4:ifnull          55
		viewtreeobserver = (ViewTreeObserver)h.get();
	//    3    7:aload_0         
	//    4    8:getfield        #333 <Field WeakReference h>
	//    5   11:invokevirtual   #179 <Method Object WeakReference.get()>
	//    6   14:checkcast       #328 <Class ViewTreeObserver>
	//    7   17:astore_2        
		if(viewtreeobserver == null)
			break MISSING_BLOCK_LABEL_39;
	//    8   18:aload_2         
	//    9   19:ifnull          39
		if(viewtreeobserver.isAlive())
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #331 <Method boolean ViewTreeObserver.isAlive()>
	//*  12   26:ifeq            39
		{
			viewtreeobserver.removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   13   29:aload_2         
	//   14   30:aload_0         
	//   15   31:invokevirtual   #396 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
			viewtreeobserver.removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:invokevirtual   #399 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		h = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #333 <Field WeakReference h>
		break MISSING_BLOCK_LABEL_55;
	//   22   44:goto            55
		Exception exception;
		exception;
	//   23   47:astore_2        
		wx.b("Error while unregistering listeners from the last ViewTreeObserver.", ((Throwable) (exception)));
	//   24   48:ldc2            #401 <String "Error while unregistering listeners from the last ViewTreeObserver.">
	//   25   51:aload_2         
	//   26   52:invokestatic    #250 <Method void wx.b(String, Throwable)>
		try
		{
			view = ((View) (view.getViewTreeObserver()));
	//   27   55:aload_1         
	//   28   56:invokevirtual   #326 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   29   59:astore_1        
			if(((ViewTreeObserver) (view)).isAlive())
	//*  30   60:aload_1         
	//*  31   61:invokevirtual   #331 <Method boolean ViewTreeObserver.isAlive()>
	//*  32   64:ifeq            88
			{
				((ViewTreeObserver) (view)).removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   33   67:aload_1         
	//   34   68:aload_0         
	//   35   69:invokevirtual   #396 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
				((ViewTreeObserver) (view)).removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:invokevirtual   #399 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
		}
	//*  39   77:goto            88
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  40   80:astore_1        
		{
			wx.b("Error while unregistering listeners from the ViewTreeObserver.", ((Throwable) (view)));
	//   41   81:ldc2            #403 <String "Error while unregistering listeners from the ViewTreeObserver.">
	//   42   84:aload_1         
	//   43   85:invokestatic    #250 <Method void wx.b(String, Throwable)>
		}
		if(g != null)
	//*  44   88:aload_0         
	//*  45   89:getfield        #343 <Field BroadcastReceiver g>
	//*  46   92:ifnull          139
		{
			try
			{
				aw.B().a(b, g);
	//   47   95:invokestatic    #365 <Method zr aw.B()>
	//   48   98:aload_0         
	//   49   99:getfield        #102 <Field Context b>
	//   50  102:aload_0         
	//   51  103:getfield        #343 <Field BroadcastReceiver g>
	//   52  106:invokevirtual   #406 <Method void zr.a(Context, BroadcastReceiver)>
			}
	//*  53  109:goto            134
	//*  54  112:astore_1        
	//*  55  113:invokestatic    #409 <Method wi aw.i()>
	//*  56  116:aload_1         
	//*  57  117:ldc2            #411 <String "ActiveViewUnit.stopScreenStatusMonitoring">
	//*  58  120:invokevirtual   #416 <Method void wi.a(Throwable, String)>
	//*  59  123:goto            134
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  60  126:astore_1        
			{
				wx.b("Failed trying to unregister the receiver", ((Throwable) (view)));
	//   61  127:ldc2            #418 <String "Failed trying to unregister the receiver">
	//   62  130:aload_1         
	//   63  131:invokestatic    #250 <Method void wx.b(String, Throwable)>
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				aw.i().a(((Throwable) (view)), "ActiveViewUnit.stopScreenStatusMonitoring");
			}
			g = null;
	//   64  134:aload_0         
	//   65  135:aconst_null     
	//   66  136:putfield        #343 <Field BroadcastReceiver g>
		}
		view = ((View) (c));
	//   67  139:aload_0         
	//   68  140:getfield        #128 <Field Application c>
	//   69  143:astore_1        
		if(view != null)
	//*  70  144:aload_1         
	//*  71  145:ifnull          165
			try
			{
				((Application) (view)).unregisterActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (j)));
	//   72  148:aload_1         
	//   73  149:aload_0         
	//   74  150:getfield        #135 <Field bpz j>
	//   75  153:invokevirtual   #421 <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
				return;
	//   76  156:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  77  157:astore_1        
			{
				wx.b("Error registering activity lifecycle callbacks.", ((Throwable) (view)));
	//   78  158:ldc2            #376 <String "Error registering activity lifecycle callbacks.">
	//   79  161:aload_1         
	//   80  162:invokestatic    #250 <Method void wx.b(String, Throwable)>
			}
		return;
	//   81  165:return          
	}

	public final void a()
	{
		a(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #379 <Method void a(int)>
	//    3    5:return          
	}

	public final void a(bpy bpy1)
	{
		n.add(((Object) (bpy1)));
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field HashSet n>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #426 <Method boolean HashSet.add(Object)>
	//    4    8:pop             
		a(3);
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:invokespecial   #379 <Method void a(int)>
	//    8   14:return          
	}

	public final void b(bpy bpy1)
	{
		n.remove(((Object) (bpy1)));
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field HashSet n>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #429 <Method boolean HashSet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
		a(activity, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #433 <Method void a(Activity, int)>
		a(3);
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #379 <Method void a(int)>
		b();
	//    7   11:aload_0         
	//    8   12:invokespecial   #435 <Method void b()>
	//    9   15:return          
	}

	public final void onActivityDestroyed(Activity activity)
	{
		a(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #379 <Method void a(int)>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #435 <Method void b()>
	//    5    9:return          
	}

	public final void onActivityPaused(Activity activity)
	{
		a(activity, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:invokespecial   #433 <Method void a(Activity, int)>
		a(3);
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #379 <Method void a(int)>
		b();
	//    7   11:aload_0         
	//    8   12:invokespecial   #435 <Method void b()>
	//    9   15:return          
	}

	public final void onActivityResumed(Activity activity)
	{
		a(activity, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #433 <Method void a(Activity, int)>
		a(3);
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #379 <Method void a(int)>
		b();
	//    7   11:aload_0         
	//    8   12:invokespecial   #435 <Method void b()>
	//    9   15:return          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		a(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #379 <Method void a(int)>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #435 <Method void b()>
	//    5    9:return          
	}

	public final void onActivityStarted(Activity activity)
	{
		a(activity, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #433 <Method void a(Activity, int)>
		a(3);
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #379 <Method void a(int)>
		b();
	//    7   11:aload_0         
	//    8   12:invokespecial   #435 <Method void b()>
	//    9   15:return          
	}

	public final void onActivityStopped(Activity activity)
	{
		a(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #379 <Method void a(int)>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #435 <Method void b()>
	//    5    9:return          
	}

	public final void onGlobalLayout()
	{
		a(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #379 <Method void a(int)>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #435 <Method void b()>
	//    5    9:return          
	}

	public final void onScrollChanged()
	{
		a(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #379 <Method void a(int)>
	//    3    5:return          
	}

	public final void onViewAttachedToWindow(View view)
	{
		m = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #89  <Field int m>
		a(view);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #203 <Method void a(View)>
		a(3);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:invokespecial   #379 <Method void a(int)>
	//    9   15:return          
	}

	public final void onViewDetachedFromWindow(View view)
	{
		m = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #89  <Field int m>
		a(3);
	//    3    5:aload_0         
	//    4    6:iconst_3        
	//    5    7:invokespecial   #379 <Method void a(int)>
		b();
	//    6   10:aload_0         
	//    7   11:invokespecial   #435 <Method void b()>
		b(view);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #188 <Method void b(View)>
	//   11   19:return          
	}

	private static final long a;
	private final Context b;
	private Application c;
	private final WindowManager d;
	private final PowerManager e;
	private final KeyguardManager f;
	private BroadcastReceiver g;
	private WeakReference h;
	private WeakReference i;
	private bpz j;
	private zk k;
	private boolean l;
	private int m;
	private final HashSet n = new HashSet();
	private final DisplayMetrics o;
	private final Rect p = new Rect();

	static 
	{
		com.google.android.gms.internal.ads.e e1 = p.aW;
	//    0    0:getstatic       #55  <Field com.google.android.gms.internal.ads.e p.aW>
	//    1    3:astore_0        
		a = ((Long)com.google.android.gms.internal.ads.bwk.e().a(e1)).longValue();
	//    2    4:invokestatic    #60  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #65  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//    5   11:checkcast       #67  <Class Long>
	//    6   14:invokevirtual   #71  <Method long Long.longValue()>
	//    7   17:putstatic       #73  <Field long a>
	//*   8   20:return          
	}
}
