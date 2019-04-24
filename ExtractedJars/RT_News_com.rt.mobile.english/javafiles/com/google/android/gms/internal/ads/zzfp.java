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
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzamj, 
//			zzfu, zzakq, zzakk, zzfq, 
//			zzfr, zzamq, zzakb, zzajm, 
//			zzfs, zzft

public final class zzfp
	implements android.app.Application.ActivityLifecycleCallbacks, android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

	public zzfp(Context context, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #85  <Method void Object()>
		zzadz = new zzamj(zzagc);
	//    2    4:aload_0         
	//    3    5:new             #87  <Class zzamj>
	//    4    8:dup             
	//    5    9:getstatic       #80  <Field long zzagc>
	//    6   12:invokespecial   #90  <Method void zzamj(long)>
	//    7   15:putfield        #92  <Field zzamj zzadz>
		zzafd = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #94  <Field boolean zzafd>
		zzagh = -1;
	//   11   23:aload_0         
	//   12   24:iconst_m1       
	//   13   25:putfield        #96  <Field int zzagh>
	//   14   28:aload_0         
	//   15   29:new             #98  <Class HashSet>
	//   16   32:dup             
	//   17   33:invokespecial   #99  <Method void HashSet()>
	//   18   36:putfield        #101 <Field HashSet zzagi>
		zzaeo = context.getApplicationContext();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #107 <Method Context Context.getApplicationContext()>
	//   22   44:putfield        #109 <Field Context zzaeo>
		zzaeu = (WindowManager)context.getSystemService("window");
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:ldc1            #111 <String "window">
	//   26   51:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   27   54:checkcast       #117 <Class WindowManager>
	//   28   57:putfield        #119 <Field WindowManager zzaeu>
		zzaev = (PowerManager)zzaeo.getSystemService("power");
	//   29   60:aload_0         
	//   30   61:aload_0         
	//   31   62:getfield        #109 <Field Context zzaeo>
	//   32   65:ldc1            #121 <String "power">
	//   33   67:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   34   70:checkcast       #123 <Class PowerManager>
	//   35   73:putfield        #125 <Field PowerManager zzaev>
		zzaew = (KeyguardManager)context.getSystemService("keyguard");
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:ldc1            #127 <String "keyguard">
	//   39   80:invokevirtual   #115 <Method Object Context.getSystemService(String)>
	//   40   83:checkcast       #129 <Class KeyguardManager>
	//   41   86:putfield        #131 <Field KeyguardManager zzaew>
		if(zzaeo instanceof Application)
	//*  42   89:aload_0         
	//*  43   90:getfield        #109 <Field Context zzaeo>
	//*  44   93:instanceof      #133 <Class Application>
	//*  45   96:ifeq            129
		{
			zzagd = (Application)zzaeo;
	//   46   99:aload_0         
	//   47  100:aload_0         
	//   48  101:getfield        #109 <Field Context zzaeo>
	//   49  104:checkcast       #133 <Class Application>
	//   50  107:putfield        #135 <Field Application zzagd>
			zzagg = new zzfu((Application)zzaeo, ((android.app.Application.ActivityLifecycleCallbacks) (this)));
	//   51  110:aload_0         
	//   52  111:new             #137 <Class zzfu>
	//   53  114:dup             
	//   54  115:aload_0         
	//   55  116:getfield        #109 <Field Context zzaeo>
	//   56  119:checkcast       #133 <Class Application>
	//   57  122:aload_0         
	//   58  123:invokespecial   #140 <Method void zzfu(Application, android.app.Application$ActivityLifecycleCallbacks)>
	//   59  126:putfield        #142 <Field zzfu zzagg>
		}
		zzagj = context.getResources().getDisplayMetrics();
	//   60  129:aload_0         
	//   61  130:aload_1         
	//   62  131:invokevirtual   #146 <Method Resources Context.getResources()>
	//   63  134:invokevirtual   #152 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   64  137:putfield        #154 <Field DisplayMetrics zzagj>
	//   65  140:aload_0         
	//   66  141:new             #156 <Class Rect>
	//   67  144:dup             
	//   68  145:invokespecial   #157 <Method void Rect()>
	//   69  148:putfield        #159 <Field Rect zzafh>
		zzafh.right = zzaeu.getDefaultDisplay().getWidth();
	//   70  151:aload_0         
	//   71  152:getfield        #159 <Field Rect zzafh>
	//   72  155:aload_0         
	//   73  156:getfield        #119 <Field WindowManager zzaeu>
	//   74  159:invokeinterface #163 <Method Display WindowManager.getDefaultDisplay()>
	//   75  164:invokevirtual   #169 <Method int Display.getWidth()>
	//   76  167:putfield        #172 <Field int Rect.right>
		zzafh.bottom = zzaeu.getDefaultDisplay().getHeight();
	//   77  170:aload_0         
	//   78  171:getfield        #159 <Field Rect zzafh>
	//   79  174:aload_0         
	//   80  175:getfield        #119 <Field WindowManager zzaeu>
	//   81  178:invokeinterface #163 <Method Display WindowManager.getDefaultDisplay()>
	//   82  183:invokevirtual   #175 <Method int Display.getHeight()>
	//   83  186:putfield        #178 <Field int Rect.bottom>
		if(zzagf != null)
	//*  84  189:aload_0         
	//*  85  190:getfield        #180 <Field WeakReference zzagf>
	//*  86  193:ifnull          210
			context = ((Context) ((View)zzagf.get()));
	//   87  196:aload_0         
	//   88  197:getfield        #180 <Field WeakReference zzagf>
	//   89  200:invokevirtual   #186 <Method Object WeakReference.get()>
	//   90  203:checkcast       #188 <Class View>
	//   91  206:astore_1        
		else
	//*  92  207:goto            212
			context = null;
	//   93  210:aconst_null     
	//   94  211:astore_1        
		if(context != null)
	//*  95  212:aload_1         
	//*  96  213:ifnull          226
		{
			((View) (context)).removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   97  216:aload_1         
	//   98  217:aload_0         
	//   99  218:invokevirtual   #192 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			zzf(((View) (context)));
	//  100  221:aload_0         
	//  101  222:aload_1         
	//  102  223:invokespecial   #196 <Method void zzf(View)>
		}
		zzagf = new WeakReference(((Object) (view)));
	//  103  226:aload_0         
	//  104  227:new             #182 <Class WeakReference>
	//  105  230:dup             
	//  106  231:aload_2         
	//  107  232:invokespecial   #199 <Method void WeakReference(Object)>
	//  108  235:putfield        #180 <Field WeakReference zzagf>
		if(view != null)
	//* 109  238:aload_2         
	//* 110  239:ifnull          262
		{
			if(zzbv.zzem().isAttachedToWindow(view))
	//* 111  242:invokestatic    #205 <Method zzakq zzbv.zzem()>
	//* 112  245:aload_2         
	//* 113  246:invokevirtual   #211 <Method boolean zzakq.isAttachedToWindow(View)>
	//* 114  249:ifeq            257
				zze(view);
	//  115  252:aload_0         
	//  116  253:aload_2         
	//  117  254:invokespecial   #214 <Method void zze(View)>
			view.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//  118  257:aload_2         
	//  119  258:aload_0         
	//  120  259:invokevirtual   #217 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		}
	//  121  262:return          
	}

	private final Rect zza(Rect rect)
	{
		return new Rect(zzn(rect.left), zzn(rect.top), zzn(rect.right), zzn(rect.bottom));
	//    0    0:new             #156 <Class Rect>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #222 <Field int Rect.left>
	//    5    9:invokespecial   #226 <Method int zzn(int)>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #229 <Field int Rect.top>
	//    9   17:invokespecial   #226 <Method int zzn(int)>
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #172 <Field int Rect.right>
	//   13   25:invokespecial   #226 <Method int zzn(int)>
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #178 <Field int Rect.bottom>
	//   17   33:invokespecial   #226 <Method int zzn(int)>
	//   18   36:invokespecial   #232 <Method void Rect(int, int, int, int)>
	//   19   39:areturn         
	}

	private final void zza(Activity activity, int i)
	{
		if(zzagf == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field WeakReference zzagf>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		activity = ((Activity) (activity.getWindow()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #239 <Method Window Activity.getWindow()>
	//    6   12:astore_1        
		if(activity == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       18
			return;
	//    9   17:return          
		activity = ((Activity) (((Window) (activity)).peekDecorView()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #245 <Method View Window.peekDecorView()>
	//   12   22:astore_1        
		View view = (View)zzagf.get();
	//   13   23:aload_0         
	//   14   24:getfield        #180 <Field WeakReference zzagf>
	//   15   27:invokevirtual   #186 <Method Object WeakReference.get()>
	//   16   30:checkcast       #188 <Class View>
	//   17   33:astore_3        
		if(view != null && activity != null && view.getRootView() == ((View) (activity)).getRootView())
	//*  18   34:aload_3         
	//*  19   35:ifnull          58
	//*  20   38:aload_1         
	//*  21   39:ifnull          58
	//*  22   42:aload_3         
	//*  23   43:invokevirtual   #248 <Method View View.getRootView()>
	//*  24   46:aload_1         
	//*  25   47:invokevirtual   #248 <Method View View.getRootView()>
	//*  26   50:if_acmpne       58
			zzagh = i;
	//   27   53:aload_0         
	//   28   54:iload_2         
	//   29   55:putfield        #96  <Field int zzagh>
	//   30   58:return          
	}

	static void zza(zzfp zzfp1, int i)
	{
		zzfp1.zzm(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #253 <Method void zzm(int)>
	//    3    5:return          
	}

	private final void zzao()
	{
		zzbv.zzek();
	//    0    0:invokestatic    #258 <Method zzakk zzbv.zzek()>
	//    1    3:pop             
		zzakk.zzcrm.post(((Runnable) (new zzfq(this))));
	//    2    4:getstatic       #264 <Field Handler zzakk.zzcrm>
	//    3    7:new             #266 <Class zzfq>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #269 <Method void zzfq(zzfp)>
	//    7   15:invokevirtual   #275 <Method boolean Handler.post(Runnable)>
	//    8   18:pop             
	//    9   19:return          
	}

	private final void zze(View view)
	{
		view = ((View) (view.getViewTreeObserver()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #281 <Method ViewTreeObserver View.getViewTreeObserver()>
	//    2    4:astore_1        
		if(((ViewTreeObserver) (view)).isAlive())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #287 <Method boolean ViewTreeObserver.isAlive()>
	//*   5    9:ifeq            34
		{
			zzage = new WeakReference(((Object) (view)));
	//    6   12:aload_0         
	//    7   13:new             #182 <Class WeakReference>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #199 <Method void WeakReference(Object)>
	//   11   21:putfield        #289 <Field WeakReference zzage>
			((ViewTreeObserver) (view)).addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #293 <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
			((ViewTreeObserver) (view)).addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #297 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		if(zzafe == null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #299 <Field BroadcastReceiver zzafe>
	//*  20   38:ifnonnull       97
		{
			view = ((View) (new IntentFilter()));
	//   21   41:new             #301 <Class IntentFilter>
	//   22   44:dup             
	//   23   45:invokespecial   #302 <Method void IntentFilter()>
	//   24   48:astore_1        
			((IntentFilter) (view)).addAction("android.intent.action.SCREEN_ON");
	//   25   49:aload_1         
	//   26   50:ldc2            #304 <String "android.intent.action.SCREEN_ON">
	//   27   53:invokevirtual   #308 <Method void IntentFilter.addAction(String)>
			((IntentFilter) (view)).addAction("android.intent.action.SCREEN_OFF");
	//   28   56:aload_1         
	//   29   57:ldc2            #310 <String "android.intent.action.SCREEN_OFF">
	//   30   60:invokevirtual   #308 <Method void IntentFilter.addAction(String)>
			((IntentFilter) (view)).addAction("android.intent.action.USER_PRESENT");
	//   31   63:aload_1         
	//   32   64:ldc2            #312 <String "android.intent.action.USER_PRESENT">
	//   33   67:invokevirtual   #308 <Method void IntentFilter.addAction(String)>
			zzafe = ((BroadcastReceiver) (new zzfr(this)));
	//   34   70:aload_0         
	//   35   71:new             #314 <Class zzfr>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:invokespecial   #315 <Method void zzfr(zzfp)>
	//   39   79:putfield        #299 <Field BroadcastReceiver zzafe>
			zzbv.zzfk().zza(zzaeo, zzafe, ((IntentFilter) (view)));
	//   40   82:invokestatic    #319 <Method zzamq zzbv.zzfk()>
	//   41   85:aload_0         
	//   42   86:getfield        #109 <Field Context zzaeo>
	//   43   89:aload_0         
	//   44   90:getfield        #299 <Field BroadcastReceiver zzafe>
	//   45   93:aload_1         
	//   46   94:invokevirtual   #324 <Method void zzamq.zza(Context, BroadcastReceiver, IntentFilter)>
		}
		if(zzagd != null)
	//*  47   97:aload_0         
	//*  48   98:getfield        #135 <Field Application zzagd>
	//*  49  101:ifnull          124
			try
			{
				zzagd.registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (zzagg)));
	//   50  104:aload_0         
	//   51  105:getfield        #135 <Field Application zzagd>
	//   52  108:aload_0         
	//   53  109:getfield        #142 <Field zzfu zzagg>
	//   54  112:invokevirtual   #328 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
				return;
	//   55  115:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  56  116:astore_1        
			{
				zzakb.zzb("Error registering activity lifecycle callbacks.", ((Throwable) (view)));
	//   57  117:ldc2            #330 <String "Error registering activity lifecycle callbacks.">
	//   58  120:aload_1         
	//   59  121:invokestatic    #336 <Method void zzakb.zzb(String, Throwable)>
			}
	//   60  124:return          
	}

	private final void zzf(View view)
	{
		ViewTreeObserver viewtreeobserver;
		if(zzage == null)
			break MISSING_BLOCK_LABEL_55;
	//    0    0:aload_0         
	//    1    1:getfield        #289 <Field WeakReference zzage>
	//    2    4:ifnull          55
		viewtreeobserver = (ViewTreeObserver)zzage.get();
	//    3    7:aload_0         
	//    4    8:getfield        #289 <Field WeakReference zzage>
	//    5   11:invokevirtual   #186 <Method Object WeakReference.get()>
	//    6   14:checkcast       #283 <Class ViewTreeObserver>
	//    7   17:astore_2        
		if(viewtreeobserver == null)
			break MISSING_BLOCK_LABEL_39;
	//    8   18:aload_2         
	//    9   19:ifnull          39
		if(viewtreeobserver.isAlive())
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #287 <Method boolean ViewTreeObserver.isAlive()>
	//*  12   26:ifeq            39
		{
			viewtreeobserver.removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   13   29:aload_2         
	//   14   30:aload_0         
	//   15   31:invokevirtual   #341 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
			viewtreeobserver.removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:invokevirtual   #344 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		zzage = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #289 <Field WeakReference zzage>
		break MISSING_BLOCK_LABEL_55;
	//   22   44:goto            55
		Exception exception;
		exception;
	//   23   47:astore_2        
		zzakb.zzb("Error while unregistering listeners from the last ViewTreeObserver.", ((Throwable) (exception)));
	//   24   48:ldc2            #346 <String "Error while unregistering listeners from the last ViewTreeObserver.">
	//   25   51:aload_2         
	//   26   52:invokestatic    #336 <Method void zzakb.zzb(String, Throwable)>
		try
		{
			view = ((View) (view.getViewTreeObserver()));
	//   27   55:aload_1         
	//   28   56:invokevirtual   #281 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   29   59:astore_1        
			if(((ViewTreeObserver) (view)).isAlive())
	//*  30   60:aload_1         
	//*  31   61:invokevirtual   #287 <Method boolean ViewTreeObserver.isAlive()>
	//*  32   64:ifeq            88
			{
				((ViewTreeObserver) (view)).removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   33   67:aload_1         
	//   34   68:aload_0         
	//   35   69:invokevirtual   #341 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
				((ViewTreeObserver) (view)).removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:invokevirtual   #344 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
		}
	//*  39   77:goto            88
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  40   80:astore_1        
		{
			zzakb.zzb("Error while unregistering listeners from the ViewTreeObserver.", ((Throwable) (view)));
	//   41   81:ldc2            #348 <String "Error while unregistering listeners from the ViewTreeObserver.">
	//   42   84:aload_1         
	//   43   85:invokestatic    #336 <Method void zzakb.zzb(String, Throwable)>
		}
		if(zzafe != null)
	//*  44   88:aload_0         
	//*  45   89:getfield        #299 <Field BroadcastReceiver zzafe>
	//*  46   92:ifnull          139
		{
			try
			{
				zzbv.zzfk().zza(zzaeo, zzafe);
	//   47   95:invokestatic    #319 <Method zzamq zzbv.zzfk()>
	//   48   98:aload_0         
	//   49   99:getfield        #109 <Field Context zzaeo>
	//   50  102:aload_0         
	//   51  103:getfield        #299 <Field BroadcastReceiver zzafe>
	//   52  106:invokevirtual   #351 <Method void zzamq.zza(Context, BroadcastReceiver)>
			}
	//*  53  109:goto            134
	//*  54  112:astore_1        
	//*  55  113:invokestatic    #355 <Method zzajm zzbv.zzeo()>
	//*  56  116:aload_1         
	//*  57  117:ldc2            #357 <String "ActiveViewUnit.stopScreenStatusMonitoring">
	//*  58  120:invokevirtual   #362 <Method void zzajm.zza(Throwable, String)>
	//*  59  123:goto            134
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  60  126:astore_1        
			{
				zzakb.zzb("Failed trying to unregister the receiver", ((Throwable) (view)));
	//   61  127:ldc2            #364 <String "Failed trying to unregister the receiver">
	//   62  130:aload_1         
	//   63  131:invokestatic    #336 <Method void zzakb.zzb(String, Throwable)>
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				zzbv.zzeo().zza(((Throwable) (view)), "ActiveViewUnit.stopScreenStatusMonitoring");
			}
			zzafe = null;
	//   64  134:aload_0         
	//   65  135:aconst_null     
	//   66  136:putfield        #299 <Field BroadcastReceiver zzafe>
		}
		if(zzagd != null)
	//*  67  139:aload_0         
	//*  68  140:getfield        #135 <Field Application zzagd>
	//*  69  143:ifnull          166
			try
			{
				zzagd.unregisterActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (zzagg)));
	//   70  146:aload_0         
	//   71  147:getfield        #135 <Field Application zzagd>
	//   72  150:aload_0         
	//   73  151:getfield        #142 <Field zzfu zzagg>
	//   74  154:invokevirtual   #367 <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
				return;
	//   75  157:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  76  158:astore_1        
			{
				zzakb.zzb("Error registering activity lifecycle callbacks.", ((Throwable) (view)));
	//   77  159:ldc2            #330 <String "Error registering activity lifecycle callbacks.">
	//   78  162:aload_1         
	//   79  163:invokestatic    #336 <Method void zzakb.zzb(String, Throwable)>
			}
		return;
	//   80  166:return          
	}

	private final void zzm(int i)
	{
		if(zzagi.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field HashSet zzagi>
	//*   2    4:invokevirtual   #370 <Method int HashSet.size()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(zzagf == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #180 <Field WeakReference zzagf>
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		Object obj = ((Object) ((View)zzagf.get()));
	//    9   19:aload_0         
	//   10   20:getfield        #180 <Field WeakReference zzagf>
	//   11   23:invokevirtual   #186 <Method Object WeakReference.get()>
	//   12   26:checkcast       #188 <Class View>
	//   13   29:astore          12
		boolean flag5 = false;
	//   14   31:iconst_0        
	//   15   32:istore          8
		boolean flag;
		if(i == 1)
	//*  16   34:iload_1         
	//*  17   35:iconst_1        
	//*  18   36:icmpne          44
			flag = true;
	//   19   39:iconst_1        
	//   20   40:istore_3        
		else
	//*  21   41:goto            46
			flag = false;
	//   22   44:iconst_0        
	//   23   45:istore_3        
		boolean flag1;
		if(obj == null)
	//*  24   46:aload           12
	//*  25   48:ifnonnull       57
			flag1 = true;
	//   26   51:iconst_1        
	//   27   52:istore          4
		else
	//*  28   54:goto            60
			flag1 = false;
	//   29   57:iconst_0        
	//   30   58:istore          4
		Rect rect = new Rect();
	//   31   60:new             #156 <Class Rect>
	//   32   63:dup             
	//   33   64:invokespecial   #157 <Method void Rect()>
	//   34   67:astore          13
		Rect rect1 = new Rect();
	//   35   69:new             #156 <Class Rect>
	//   36   72:dup             
	//   37   73:invokespecial   #157 <Method void Rect()>
	//   38   76:astore          14
		Rect rect2 = new Rect();
	//   39   78:new             #156 <Class Rect>
	//   40   81:dup             
	//   41   82:invokespecial   #157 <Method void Rect()>
	//   42   85:astore          15
		Rect rect3 = new Rect();
	//   43   87:new             #156 <Class Rect>
	//   44   90:dup             
	//   45   91:invokespecial   #157 <Method void Rect()>
	//   46   94:astore          16
		int ai[] = new int[2];
	//   47   96:iconst_2        
	//   48   97:newarray        int[]
	//   49   99:astore          17
		int ai1[] = new int[2];
	//   50  101:iconst_2        
	//   51  102:newarray        int[]
	//   52  104:astore          18
		boolean flag2;
		boolean flag3;
		if(obj != null)
	//*  53  106:aload           12
	//*  54  108:ifnull          216
		{
			flag2 = ((View) (obj)).getGlobalVisibleRect(rect1);
	//   55  111:aload           12
	//   56  113:aload           14
	//   57  115:invokevirtual   #374 <Method boolean View.getGlobalVisibleRect(Rect)>
	//   58  118:istore          5
			flag3 = ((View) (obj)).getLocalVisibleRect(rect2);
	//   59  120:aload           12
	//   60  122:aload           15
	//   61  124:invokevirtual   #377 <Method boolean View.getLocalVisibleRect(Rect)>
	//   62  127:istore          6
			((View) (obj)).getHitRect(rect3);
	//   63  129:aload           12
	//   64  131:aload           16
	//   65  133:invokevirtual   #381 <Method void View.getHitRect(Rect)>
			try
			{
				((View) (obj)).getLocationOnScreen(ai);
	//   66  136:aload           12
	//   67  138:aload           17
	//   68  140:invokevirtual   #385 <Method void View.getLocationOnScreen(int[])>
				((View) (obj)).getLocationInWindow(ai1);
	//   69  143:aload           12
	//   70  145:aload           18
	//   71  147:invokevirtual   #388 <Method void View.getLocationInWindow(int[])>
			}
	//*  72  150:goto            163
			catch(Exception exception)
	//*  73  153:astore          18
			{
				zzakb.zzb("Failure getting view location.", ((Throwable) (exception)));
	//   74  155:ldc2            #390 <String "Failure getting view location.">
	//   75  158:aload           18
	//   76  160:invokestatic    #336 <Method void zzakb.zzb(String, Throwable)>
			}
			rect.left = ai[0];
	//   77  163:aload           13
	//   78  165:aload           17
	//   79  167:iconst_0        
	//   80  168:iaload          
	//   81  169:putfield        #222 <Field int Rect.left>
			rect.top = ai[1];
	//   82  172:aload           13
	//   83  174:aload           17
	//   84  176:iconst_1        
	//   85  177:iaload          
	//   86  178:putfield        #229 <Field int Rect.top>
			rect.right = rect.left + ((View) (obj)).getWidth();
	//   87  181:aload           13
	//   88  183:aload           13
	//   89  185:getfield        #222 <Field int Rect.left>
	//   90  188:aload           12
	//   91  190:invokevirtual   #391 <Method int View.getWidth()>
	//   92  193:iadd            
	//   93  194:putfield        #172 <Field int Rect.right>
			rect.bottom = rect.top + ((View) (obj)).getHeight();
	//   94  197:aload           13
	//   95  199:aload           13
	//   96  201:getfield        #229 <Field int Rect.top>
	//   97  204:aload           12
	//   98  206:invokevirtual   #392 <Method int View.getHeight()>
	//   99  209:iadd            
	//  100  210:putfield        #178 <Field int Rect.bottom>
		} else
	//* 101  213:goto            223
		{
			flag2 = false;
	//  102  216:iconst_0        
	//  103  217:istore          5
			flag3 = flag2;
	//  104  219:iload           5
	//  105  221:istore          6
		}
		int j;
		if(obj != null)
	//* 106  223:aload           12
	//* 107  225:ifnull          237
			j = ((View) (obj)).getWindowVisibility();
	//  108  228:aload           12
	//  109  230:invokevirtual   #395 <Method int View.getWindowVisibility()>
	//  110  233:istore_2        
		else
	//* 111  234:goto            240
			j = 8;
	//  112  237:bipush          8
	//  113  239:istore_2        
		if(zzagh != -1)
	//* 114  240:aload_0         
	//* 115  241:getfield        #96  <Field int zzagh>
	//* 116  244:iconst_m1       
	//* 117  245:icmpeq          253
			j = zzagh;
	//  118  248:aload_0         
	//  119  249:getfield        #96  <Field int zzagh>
	//  120  252:istore_2        
		boolean flag4;
		if(!flag1 && zzbv.zzek().zza(((View) (obj)), zzaev, zzaew) && flag2 && flag3 && j == 0)
	//* 121  253:iload           4
	//* 122  255:ifne            297
	//* 123  258:invokestatic    #258 <Method zzakk zzbv.zzek()>
	//* 124  261:aload           12
	//* 125  263:aload_0         
	//* 126  264:getfield        #125 <Field PowerManager zzaev>
	//* 127  267:aload_0         
	//* 128  268:getfield        #131 <Field KeyguardManager zzaew>
	//* 129  271:invokevirtual   #398 <Method boolean zzakk.zza(View, PowerManager, KeyguardManager)>
	//* 130  274:ifeq            297
	//* 131  277:iload           5
	//* 132  279:ifeq            297
	//* 133  282:iload           6
	//* 134  284:ifeq            297
	//* 135  287:iload_2         
	//* 136  288:ifne            297
			flag4 = true;
	//  137  291:iconst_1        
	//  138  292:istore          7
		else
	//* 139  294:goto            300
			flag4 = false;
	//  140  297:iconst_0        
	//  141  298:istore          7
		if(flag && !zzadz.tryAcquire() && flag4 == zzafd)
	//* 142  300:iload_3         
	//* 143  301:ifeq            324
	//* 144  304:aload_0         
	//* 145  305:getfield        #92  <Field zzamj zzadz>
	//* 146  308:invokevirtual   #401 <Method boolean zzamj.tryAcquire()>
	//* 147  311:ifne            324
	//* 148  314:iload           7
	//* 149  316:aload_0         
	//* 150  317:getfield        #94  <Field boolean zzafd>
	//* 151  320:icmpne          324
			return;
	//  152  323:return          
		if(!flag4 && !zzafd && i == 1)
	//* 153  324:iload           7
	//* 154  326:ifne            342
	//* 155  329:aload_0         
	//* 156  330:getfield        #94  <Field boolean zzafd>
	//* 157  333:ifne            342
	//* 158  336:iload_1         
	//* 159  337:iconst_1        
	//* 160  338:icmpne          342
			return;
	//  161  341:return          
		long l = zzbv.zzer().elapsedRealtime();
	//  162  342:invokestatic    #405 <Method Clock zzbv.zzer()>
	//  163  345:invokeinterface #410 <Method long Clock.elapsedRealtime()>
	//  164  350:lstore          10
		boolean flag6 = zzaev.isScreenOn();
	//  165  352:aload_0         
	//  166  353:getfield        #125 <Field PowerManager zzaev>
	//  167  356:invokevirtual   #413 <Method boolean PowerManager.isScreenOn()>
	//  168  359:istore          9
		if(obj != null)
	//* 169  361:aload           12
	//* 170  363:ifnull          376
			flag5 = zzbv.zzem().isAttachedToWindow(((View) (obj)));
	//  171  366:invokestatic    #205 <Method zzakq zzbv.zzem()>
	//  172  369:aload           12
	//  173  371:invokevirtual   #211 <Method boolean zzakq.isAttachedToWindow(View)>
	//  174  374:istore          8
		if(obj != null)
	//* 175  376:aload           12
	//* 176  378:ifnull          390
			i = ((View) (obj)).getWindowVisibility();
	//  177  381:aload           12
	//  178  383:invokevirtual   #395 <Method int View.getWindowVisibility()>
	//  179  386:istore_1        
		else
	//* 180  387:goto            393
			i = 8;
	//  181  390:bipush          8
	//  182  392:istore_1        
		obj = ((Object) (new zzfs(l, flag6, flag5, i, zza(zzafh), zza(rect), zza(rect1), flag2, zza(rect2), flag3, zza(rect3), zzagj.density, flag4)));
	//  183  393:new             #415 <Class zzfs>
	//  184  396:dup             
	//  185  397:lload           10
	//  186  399:iload           9
	//  187  401:iload           8
	//  188  403:iload_1         
	//  189  404:aload_0         
	//  190  405:aload_0         
	//  191  406:getfield        #159 <Field Rect zzafh>
	//  192  409:invokespecial   #417 <Method Rect zza(Rect)>
	//  193  412:aload_0         
	//  194  413:aload           13
	//  195  415:invokespecial   #417 <Method Rect zza(Rect)>
	//  196  418:aload_0         
	//  197  419:aload           14
	//  198  421:invokespecial   #417 <Method Rect zza(Rect)>
	//  199  424:iload           5
	//  200  426:aload_0         
	//  201  427:aload           15
	//  202  429:invokespecial   #417 <Method Rect zza(Rect)>
	//  203  432:iload           6
	//  204  434:aload_0         
	//  205  435:aload           16
	//  206  437:invokespecial   #417 <Method Rect zza(Rect)>
	//  207  440:aload_0         
	//  208  441:getfield        #154 <Field DisplayMetrics zzagj>
	//  209  444:getfield        #423 <Field float DisplayMetrics.density>
	//  210  447:iload           7
	//  211  449:invokespecial   #426 <Method void zzfs(long, boolean, boolean, int, Rect, Rect, Rect, boolean, Rect, boolean, Rect, float, boolean)>
	//  212  452:astore          12
		for(Iterator iterator = zzagi.iterator(); iterator.hasNext(); ((zzft)iterator.next()).zza(((zzfs) (obj))));
	//  213  454:aload_0         
	//  214  455:getfield        #101 <Field HashSet zzagi>
	//  215  458:invokevirtual   #430 <Method Iterator HashSet.iterator()>
	//  216  461:astore          13
	//  217  463:aload           13
	//  218  465:invokeinterface #435 <Method boolean Iterator.hasNext()>
	//  219  470:ifeq            493
	//  220  473:aload           13
	//  221  475:invokeinterface #438 <Method Object Iterator.next()>
	//  222  480:checkcast       #440 <Class zzft>
	//  223  483:aload           12
	//  224  485:invokeinterface #443 <Method void zzft.zza(zzfs)>
	//* 225  490:goto            463
		zzafd = flag4;
	//  226  493:aload_0         
	//  227  494:iload           7
	//  228  496:putfield        #94  <Field boolean zzafd>
	//  229  499:return          
	}

	private final int zzn(int i)
	{
		float f = zzagj.density;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field DisplayMetrics zzagj>
	//    2    4:getfield        #423 <Field float DisplayMetrics.density>
	//    3    7:fstore_2        
		return (int)((float)i / f);
	//    4    8:iload_1         
	//    5    9:i2f             
	//    6   10:fload_2         
	//    7   11:fdiv            
	//    8   12:f2i             
	//    9   13:ireturn         
	}

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
		zza(activity, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #447 <Method void zza(Activity, int)>
		zzm(3);
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #253 <Method void zzm(int)>
		zzao();
	//    7   11:aload_0         
	//    8   12:invokespecial   #449 <Method void zzao()>
	//    9   15:return          
	}

	public final void onActivityDestroyed(Activity activity)
	{
		zzm(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #253 <Method void zzm(int)>
		zzao();
	//    3    5:aload_0         
	//    4    6:invokespecial   #449 <Method void zzao()>
	//    5    9:return          
	}

	public final void onActivityPaused(Activity activity)
	{
		zza(activity, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:invokespecial   #447 <Method void zza(Activity, int)>
		zzm(3);
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #253 <Method void zzm(int)>
		zzao();
	//    7   11:aload_0         
	//    8   12:invokespecial   #449 <Method void zzao()>
	//    9   15:return          
	}

	public final void onActivityResumed(Activity activity)
	{
		zza(activity, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #447 <Method void zza(Activity, int)>
		zzm(3);
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #253 <Method void zzm(int)>
		zzao();
	//    7   11:aload_0         
	//    8   12:invokespecial   #449 <Method void zzao()>
	//    9   15:return          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		zzm(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #253 <Method void zzm(int)>
		zzao();
	//    3    5:aload_0         
	//    4    6:invokespecial   #449 <Method void zzao()>
	//    5    9:return          
	}

	public final void onActivityStarted(Activity activity)
	{
		zza(activity, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #447 <Method void zza(Activity, int)>
		zzm(3);
	//    4    6:aload_0         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #253 <Method void zzm(int)>
		zzao();
	//    7   11:aload_0         
	//    8   12:invokespecial   #449 <Method void zzao()>
	//    9   15:return          
	}

	public final void onActivityStopped(Activity activity)
	{
		zzm(3);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:invokespecial   #253 <Method void zzm(int)>
		zzao();
	//    3    5:aload_0         
	//    4    6:invokespecial   #449 <Method void zzao()>
	//    5    9:return          
	}

	public final void onGlobalLayout()
	{
		zzm(2);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:invokespecial   #253 <Method void zzm(int)>
		zzao();
	//    3    5:aload_0         
	//    4    6:invokespecial   #449 <Method void zzao()>
	//    5    9:return          
	}

	public final void onScrollChanged()
	{
		zzm(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #253 <Method void zzm(int)>
	//    3    5:return          
	}

	public final void onViewAttachedToWindow(View view)
	{
		zzagh = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #96  <Field int zzagh>
		zze(view);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #214 <Method void zze(View)>
		zzm(3);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:invokespecial   #253 <Method void zzm(int)>
	//    9   15:return          
	}

	public final void onViewDetachedFromWindow(View view)
	{
		zzagh = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #96  <Field int zzagh>
		zzm(3);
	//    3    5:aload_0         
	//    4    6:iconst_3        
	//    5    7:invokespecial   #253 <Method void zzm(int)>
		zzao();
	//    6   10:aload_0         
	//    7   11:invokespecial   #449 <Method void zzao()>
		zzf(view);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #196 <Method void zzf(View)>
	//   11   19:return          
	}

	public final void zza(zzft zzft1)
	{
		zzagi.add(((Object) (zzft1)));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field HashSet zzagi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #465 <Method boolean HashSet.add(Object)>
	//    4    8:pop             
		zzm(3);
	//    5    9:aload_0         
	//    6   10:iconst_3        
	//    7   11:invokespecial   #253 <Method void zzm(int)>
	//    8   14:return          
	}

	public final void zzb(zzft zzft1)
	{
		zzagi.remove(((Object) (zzft1)));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field HashSet zzagi>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #468 <Method boolean HashSet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public final void zzgm()
	{
		zzm(4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:invokespecial   #253 <Method void zzm(int)>
	//    3    5:return          
	}

	private static final long zzagc;
	private zzamj zzadz;
	private final Context zzaeo;
	private final WindowManager zzaeu;
	private final PowerManager zzaev;
	private final KeyguardManager zzaew;
	private boolean zzafd;
	private BroadcastReceiver zzafe;
	private final Rect zzafh = new Rect();
	private Application zzagd;
	private WeakReference zzage;
	private WeakReference zzagf;
	private zzfu zzagg;
	private int zzagh;
	private final HashSet zzagi = new HashSet();
	private final DisplayMetrics zzagj;

	static 
	{
		zzna zzna = zznk.zzazt;
	//    0    0:getstatic       #60  <Field zzna zznk.zzazt>
	//    1    3:astore_0        
		zzagc = ((Long)zzkb.zzik().zzd(zzna)).longValue();
	//    2    4:invokestatic    #66  <Method zzni zzkb.zzik()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #72  <Method Object zzni.zzd(zzna)>
	//    5   11:checkcast       #74  <Class Long>
	//    6   14:invokevirtual   #78  <Method long Long.longValue()>
	//    7   17:putstatic       #80  <Field long zzagc>
	//*   8   20:return          
	}
}
