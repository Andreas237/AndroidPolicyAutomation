// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.*;
import android.content.*;
import android.graphics.Rect;
import android.os.*;
import android.view.*;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bav, bai, bbg, bbh, 
//			bbd

public final class bbf
	implements android.app.Application.ActivityLifecycleCallbacks, android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener
{

	public bbf(bav bav1, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
		k = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #59  <Field boolean k>
		l = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #61  <Field int l>
		m = -3L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #62  <Long -3L>
	//   10   18:putfield        #65  <Field long m>
		f = bav1;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #67  <Field bav f>
		b = bav1.a;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #71  <Field Context bav.a>
	//   17   31:putfield        #73  <Field Context b>
		d = (PowerManager)b.getSystemService("power");
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #73  <Field Context b>
	//   21   39:ldc1            #75  <String "power">
	//   22   41:invokevirtual   #81  <Method Object Context.getSystemService(String)>
	//   23   44:checkcast       #83  <Class PowerManager>
	//   24   47:putfield        #85  <Field PowerManager d>
		e = (KeyguardManager)b.getSystemService("keyguard");
	//   25   50:aload_0         
	//   26   51:aload_0         
	//   27   52:getfield        #73  <Field Context b>
	//   28   55:ldc1            #87  <String "keyguard">
	//   29   57:invokevirtual   #81  <Method Object Context.getSystemService(String)>
	//   30   60:checkcast       #89  <Class KeyguardManager>
	//   31   63:putfield        #91  <Field KeyguardManager e>
		bav1 = ((bav) (b));
	//   32   66:aload_0         
	//   33   67:getfield        #73  <Field Context b>
	//   34   70:astore_1        
		if(bav1 instanceof Application)
	//*  35   71:aload_1         
	//*  36   72:instanceof      #93  <Class Application>
	//*  37   75:ifeq            102
		{
			c = (Application)bav1;
	//   38   78:aload_0         
	//   39   79:aload_1         
	//   40   80:checkcast       #93  <Class Application>
	//   41   83:putfield        #95  <Field Application c>
			j = new bai((Application)bav1, ((android.app.Application.ActivityLifecycleCallbacks) (this)));
	//   42   86:aload_0         
	//   43   87:new             #97  <Class bai>
	//   44   90:dup             
	//   45   91:aload_1         
	//   46   92:checkcast       #93  <Class Application>
	//   47   95:aload_0         
	//   48   96:invokespecial   #100 <Method void bai(Application, android.app.Application$ActivityLifecycleCallbacks)>
	//   49   99:putfield        #102 <Field bai j>
		}
		a(view);
	//   50  102:aload_0         
	//   51  103:aload_2         
	//   52  104:invokevirtual   #105 <Method void a(View)>
	//   53  107:return          
	}

	private final void a(Activity activity, int i1)
	{
		if(i == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field WeakReference i>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		activity = ((Activity) (activity.getWindow()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #114 <Method Window Activity.getWindow()>
	//    6   12:astore_1        
		if(activity == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       18
			return;
	//    9   17:return          
		activity = ((Activity) (((Window) (activity)).peekDecorView()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #120 <Method View Window.peekDecorView()>
	//   12   22:astore_1        
		View view = (View)i.get();
	//   13   23:aload_0         
	//   14   24:getfield        #108 <Field WeakReference i>
	//   15   27:invokevirtual   #126 <Method Object WeakReference.get()>
	//   16   30:checkcast       #128 <Class View>
	//   17   33:astore_3        
		if(view != null && activity != null && view.getRootView() == ((View) (activity)).getRootView())
	//*  18   34:aload_3         
	//*  19   35:ifnull          58
	//*  20   38:aload_1         
	//*  21   39:ifnull          58
	//*  22   42:aload_3         
	//*  23   43:invokevirtual   #131 <Method View View.getRootView()>
	//*  24   46:aload_1         
	//*  25   47:invokevirtual   #131 <Method View View.getRootView()>
	//*  26   50:if_acmpne       58
			l = i1;
	//   27   53:aload_0         
	//   28   54:iload_2         
	//   29   55:putfield        #61  <Field int l>
	//   30   58:return          
	}

	static void a(bbf bbf1)
	{
		bbf1.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void c()>
	//    2    4:return          
	}

	private final void b()
	{
		a.post(((Runnable) (new bbg(this))));
	//    0    0:getstatic       #53  <Field Handler a>
	//    1    3:new             #136 <Class bbg>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:invokespecial   #138 <Method void bbg(bbf)>
	//    5   11:invokevirtual   #142 <Method boolean Handler.post(Runnable)>
	//    6   14:pop             
	//    7   15:return          
	}

	private final void b(View view)
	{
		view = ((View) (view.getViewTreeObserver()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #148 <Method ViewTreeObserver View.getViewTreeObserver()>
	//    2    4:astore_1        
		if(((ViewTreeObserver) (view)).isAlive())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #154 <Method boolean ViewTreeObserver.isAlive()>
	//*   5    9:ifeq            34
		{
			h = new WeakReference(((Object) (view)));
	//    6   12:aload_0         
	//    7   13:new             #122 <Class WeakReference>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #157 <Method void WeakReference(Object)>
	//   11   21:putfield        #159 <Field WeakReference h>
			((ViewTreeObserver) (view)).addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #163 <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
			((ViewTreeObserver) (view)).addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #167 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		if(g == null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #169 <Field BroadcastReceiver g>
	//*  20   38:ifnonnull       92
		{
			view = ((View) (new IntentFilter()));
	//   21   41:new             #171 <Class IntentFilter>
	//   22   44:dup             
	//   23   45:invokespecial   #172 <Method void IntentFilter()>
	//   24   48:astore_1        
			((IntentFilter) (view)).addAction("android.intent.action.SCREEN_ON");
	//   25   49:aload_1         
	//   26   50:ldc1            #174 <String "android.intent.action.SCREEN_ON">
	//   27   52:invokevirtual   #178 <Method void IntentFilter.addAction(String)>
			((IntentFilter) (view)).addAction("android.intent.action.SCREEN_OFF");
	//   28   55:aload_1         
	//   29   56:ldc1            #180 <String "android.intent.action.SCREEN_OFF">
	//   30   58:invokevirtual   #178 <Method void IntentFilter.addAction(String)>
			((IntentFilter) (view)).addAction("android.intent.action.USER_PRESENT");
	//   31   61:aload_1         
	//   32   62:ldc1            #182 <String "android.intent.action.USER_PRESENT">
	//   33   64:invokevirtual   #178 <Method void IntentFilter.addAction(String)>
			g = ((BroadcastReceiver) (new bbh(this)));
	//   34   67:aload_0         
	//   35   68:new             #184 <Class bbh>
	//   36   71:dup             
	//   37   72:aload_0         
	//   38   73:invokespecial   #185 <Method void bbh(bbf)>
	//   39   76:putfield        #169 <Field BroadcastReceiver g>
			b.registerReceiver(g, ((IntentFilter) (view)));
	//   40   79:aload_0         
	//   41   80:getfield        #73  <Field Context b>
	//   42   83:aload_0         
	//   43   84:getfield        #169 <Field BroadcastReceiver g>
	//   44   87:aload_1         
	//   45   88:invokevirtual   #189 <Method android.content.Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   46   91:pop             
		}
		view = ((View) (c));
	//   47   92:aload_0         
	//   48   93:getfield        #95  <Field Application c>
	//   49   96:astore_1        
		if(view != null)
	//*  50   97:aload_1         
	//*  51   98:ifnull          110
			try
			{
				((Application) (view)).registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (j)));
	//   52  101:aload_1         
	//   53  102:aload_0         
	//   54  103:getfield        #102 <Field bai j>
	//   55  106:invokevirtual   #193 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
				return;
	//   56  109:return          
			}
	//*  57  110:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  58  111:astore_1        
			{
				return;
	//   59  112:return          
			}
		else
			return;
	}

	private final void c()
	{
		boolean flag1;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		View view;
label0:
		{
label1:
			{
label2:
				{
					boolean flag;
label3:
					{
						Object obj = ((Object) (i));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field WeakReference i>
	//    2    4:astore          10
						if(obj == null)
	//*   3    6:aload           10
	//*   4    8:ifnonnull       12
							return;
	//    5   11:return          
						view = (View)((WeakReference) (obj)).get();
	//    6   12:aload           10
	//    7   14:invokevirtual   #126 <Method Object WeakReference.get()>
	//    8   17:checkcast       #128 <Class View>
	//    9   20:astore          11
						flag3 = false;
	//   10   22:iconst_0        
	//   11   23:istore          5
						if(view == null)
	//*  12   25:aload           11
	//*  13   27:ifnonnull       43
						{
							m = -3L;
	//   14   30:aload_0         
	//   15   31:ldc2w           #62  <Long -3L>
	//   16   34:putfield        #65  <Field long m>
							k = false;
	//   17   37:aload_0         
	//   18   38:iconst_0        
	//   19   39:putfield        #59  <Field boolean k>
							return;
	//   20   42:return          
						}
						flag4 = view.getGlobalVisibleRect(new Rect());
	//   21   43:aload           11
	//   22   45:new             #195 <Class Rect>
	//   23   48:dup             
	//   24   49:invokespecial   #196 <Method void Rect()>
	//   25   52:invokevirtual   #200 <Method boolean View.getGlobalVisibleRect(Rect)>
	//   26   55:istore          6
						flag5 = view.getLocalVisibleRect(new Rect());
	//   27   57:aload           11
	//   28   59:new             #195 <Class Rect>
	//   29   62:dup             
	//   30   63:invokespecial   #196 <Method void Rect()>
	//   31   66:invokevirtual   #203 <Method boolean View.getLocalVisibleRect(Rect)>
	//   32   69:istore          7
						if(f.j())
							break label1;
	//   33   71:aload_0         
	//   34   72:getfield        #67  <Field bav f>
	//   35   75:invokevirtual   #205 <Method boolean bav.j()>
	//   36   78:ifne            163
						if(!e.inKeyguardRestrictedInputMode())
							break label2;
	//   37   81:aload_0         
	//   38   82:getfield        #91  <Field KeyguardManager e>
	//   39   85:invokevirtual   #208 <Method boolean KeyguardManager.inKeyguardRestrictedInputMode()>
	//   40   88:ifeq            158
						obj = ((Object) (bbd.a(view)));
	//   41   91:aload           11
	//   42   93:invokestatic    #213 <Method Activity bbd.a(View)>
	//   43   96:astore          10
						if(obj != null)
	//*  44   98:aload           10
	//*  45  100:ifnull          149
						{
							obj = ((Object) (((Activity) (obj)).getWindow()));
	//   46  103:aload           10
	//   47  105:invokevirtual   #114 <Method Window Activity.getWindow()>
	//   48  108:astore          10
							if(obj == null)
	//*  49  110:aload           10
	//*  50  112:ifnonnull       121
								obj = null;
	//   51  115:aconst_null     
	//   52  116:astore          10
							else
	//*  53  118:goto            128
								obj = ((Object) (((Window) (obj)).getAttributes()));
	//   54  121:aload           10
	//   55  123:invokevirtual   #217 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   56  126:astore          10
							if(obj != null && (((android.view.WindowManager.LayoutParams) (obj)).flags & 0x80000) != 0)
	//*  57  128:aload           10
	//*  58  130:ifnull          149
	//*  59  133:aload           10
	//*  60  135:getfield        #222 <Field int android.view.WindowManager$LayoutParams.flags>
	//*  61  138:ldc1            #223 <Int 0x80000>
	//*  62  140:iand            
	//*  63  141:ifeq            149
							{
								flag = true;
	//   64  144:iconst_1        
	//   65  145:istore_1        
								break label3;
	//   66  146:goto            151
							}
						}
						flag = false;
	//   67  149:iconst_0        
	//   68  150:istore_1        
					}
					if(flag)
	//*  69  151:iload_1         
	//*  70  152:ifeq            158
						break label1;
	//   71  155:goto            163
				}
				flag1 = false;
	//   72  158:iconst_0        
	//   73  159:istore_1        
				break label0;
	//   74  160:goto            165
			}
			flag1 = true;
	//   75  163:iconst_1        
	//   76  164:istore_1        
		}
		int i1 = view.getWindowVisibility();
	//   77  165:aload           11
	//   78  167:invokevirtual   #227 <Method int View.getWindowVisibility()>
	//   79  170:istore_2        
		int j1 = l;
	//   80  171:aload_0         
	//   81  172:getfield        #61  <Field int l>
	//   82  175:istore_3        
		if(j1 != -1)
	//*  83  176:iload_3         
	//*  84  177:iconst_m1       
	//*  85  178:icmpeq          183
			i1 = j1;
	//   86  181:iload_3         
	//   87  182:istore_2        
		boolean flag2 = flag3;
	//   88  183:iload           5
	//   89  185:istore          4
		if(view.getVisibility() == 0)
	//*  90  187:aload           11
	//*  91  189:invokevirtual   #230 <Method int View.getVisibility()>
	//*  92  192:ifne            258
		{
			flag2 = flag3;
	//   93  195:iload           5
	//   94  197:istore          4
			if(view.isShown())
	//*  95  199:aload           11
	//*  96  201:invokevirtual   #233 <Method boolean View.isShown()>
	//*  97  204:ifeq            258
			{
				flag2 = flag3;
	//   98  207:iload           5
	//   99  209:istore          4
				if(d.isScreenOn())
	//* 100  211:aload_0         
	//* 101  212:getfield        #85  <Field PowerManager d>
	//* 102  215:invokevirtual   #236 <Method boolean PowerManager.isScreenOn()>
	//* 103  218:ifeq            258
				{
					flag2 = flag3;
	//  104  221:iload           5
	//  105  223:istore          4
					if(flag1)
	//* 106  225:iload_1         
	//* 107  226:ifeq            258
					{
						flag2 = flag3;
	//  108  229:iload           5
	//  109  231:istore          4
						if(flag5)
	//* 110  233:iload           7
	//* 111  235:ifeq            258
						{
							flag2 = flag3;
	//  112  238:iload           5
	//  113  240:istore          4
							if(flag4)
	//* 114  242:iload           6
	//* 115  244:ifeq            258
							{
								flag2 = flag3;
	//  116  247:iload           5
	//  117  249:istore          4
								if(i1 == 0)
	//* 118  251:iload_2         
	//* 119  252:ifne            258
									flag2 = true;
	//  120  255:iconst_1        
	//  121  256:istore          4
							}
						}
					}
				}
			}
		}
		if(k != flag2)
	//* 122  258:aload_0         
	//* 123  259:getfield        #59  <Field boolean k>
	//* 124  262:iload           4
	//* 125  264:icmpeq          297
		{
			long l1;
			if(flag2)
	//* 126  267:iload           4
	//* 127  269:ifeq            280
				l1 = SystemClock.elapsedRealtime();
	//  128  272:invokestatic    #242 <Method long SystemClock.elapsedRealtime()>
	//  129  275:lstore          8
			else
	//* 130  277:goto            285
				l1 = -2L;
	//  131  280:ldc2w           #243 <Long -2L>
	//  132  283:lstore          8
			m = l1;
	//  133  285:aload_0         
	//  134  286:lload           8
	//  135  288:putfield        #65  <Field long m>
			k = flag2;
	//  136  291:aload_0         
	//  137  292:iload           4
	//  138  294:putfield        #59  <Field boolean k>
		}
	//  139  297:return          
	}

	private final void c(View view)
	{
		ViewTreeObserver viewtreeobserver;
		if(h == null)
			break MISSING_BLOCK_LABEL_44;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field WeakReference h>
	//    2    4:ifnull          44
		viewtreeobserver = (ViewTreeObserver)h.get();
	//    3    7:aload_0         
	//    4    8:getfield        #159 <Field WeakReference h>
	//    5   11:invokevirtual   #126 <Method Object WeakReference.get()>
	//    6   14:checkcast       #150 <Class ViewTreeObserver>
	//    7   17:astore_2        
		if(viewtreeobserver == null)
			break MISSING_BLOCK_LABEL_39;
	//    8   18:aload_2         
	//    9   19:ifnull          39
		if(viewtreeobserver.isAlive())
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #154 <Method boolean ViewTreeObserver.isAlive()>
	//*  12   26:ifeq            39
		{
			viewtreeobserver.removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   13   29:aload_2         
	//   14   30:aload_0         
	//   15   31:invokevirtual   #247 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
			viewtreeobserver.removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   16   34:aload_2         
	//   17   35:aload_0         
	//   18   36:invokevirtual   #250 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		}
		h = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #159 <Field WeakReference h>
_L1:
		try
		{
			view = ((View) (view.getViewTreeObserver()));
	//   22   44:aload_1         
	//   23   45:invokevirtual   #148 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   24   48:astore_1        
			if(((ViewTreeObserver) (view)).isAlive())
	//*  25   49:aload_1         
	//*  26   50:invokevirtual   #154 <Method boolean ViewTreeObserver.isAlive()>
	//*  27   53:ifeq            66
			{
				((ViewTreeObserver) (view)).removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:invokevirtual   #247 <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
				((ViewTreeObserver) (view)).removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
	//   31   61:aload_1         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #250 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
		}
	//*  34   66:aload_0         
	//*  35   67:getfield        #169 <Field BroadcastReceiver g>
	//*  36   70:astore_1        
	//*  37   71:aload_1         
	//*  38   72:ifnull          88
	//*  39   75:aload_0         
	//*  40   76:getfield        #73  <Field Context b>
	//*  41   79:aload_1         
	//*  42   80:invokevirtual   #254 <Method void Context.unregisterReceiver(BroadcastReceiver)>
	//*  43   83:aload_0         
	//*  44   84:aconst_null     
	//*  45   85:putfield        #169 <Field BroadcastReceiver g>
	//*  46   88:aload_0         
	//*  47   89:getfield        #95  <Field Application c>
	//*  48   92:astore_1        
	//*  49   93:aload_1         
	//*  50   94:ifnull          106
	//*  51   97:aload_1         
	//*  52   98:aload_0         
	//*  53   99:getfield        #102 <Field bai j>
	//*  54  102:invokevirtual   #257 <Method void Application.unregisterActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//*  55  105:return          
	//*  56  106:return          
	//*  57  107:astore_2        
	//*  58  108:goto            44
		// Misplaced declaration of an exception variable
		catch(View view) { }
	//   59  111:astore_1        
		view = ((View) (g));
		if(view != null)
		{
			Exception exception;
			try
			{
				b.unregisterReceiver(((BroadcastReceiver) (view)));
			}
	//*  60  112:goto            66
			// Misplaced declaration of an exception variable
			catch(View view) { }
	//   61  115:astore_1        
			g = null;
		}
		view = ((View) (c));
		if(view != null)
			try
			{
				((Application) (view)).unregisterActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (j)));
				return;
			}
	//*  62  116:goto            83
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  63  119:astore_1        
			{
				return;
	//   64  120:return          
			}
		else
			return;
		exception;
		  goto _L1
	}

	public final long a()
	{
		if(m == -2L && i.get() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field long m>
	//*   2    4:ldc2w           #243 <Long -2L>
	//*   3    7:lcmp            
	//*   4    8:ifne            28
	//*   5   11:aload_0         
	//*   6   12:getfield        #108 <Field WeakReference i>
	//*   7   15:invokevirtual   #126 <Method Object WeakReference.get()>
	//*   8   18:ifnonnull       28
			m = -3L;
	//    9   21:aload_0         
	//   10   22:ldc2w           #62  <Long -3L>
	//   11   25:putfield        #65  <Field long m>
		return m;
	//   12   28:aload_0         
	//   13   29:getfield        #65  <Field long m>
	//   14   32:lreturn         
	}

	final void a(View view)
	{
		Object obj = ((Object) (i));
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field WeakReference i>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          20
			obj = ((Object) ((View)((WeakReference) (obj)).get()));
	//    5    9:aload_3         
	//    6   10:invokevirtual   #126 <Method Object WeakReference.get()>
	//    7   13:checkcast       #128 <Class View>
	//    8   16:astore_3        
		else
	//*   9   17:goto            22
			obj = null;
	//   10   20:aconst_null     
	//   11   21:astore_3        
		if(obj != null)
	//*  12   22:aload_3         
	//*  13   23:ifnull          36
		{
			((View) (obj)).removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #261 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			c(((View) (obj)));
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:invokespecial   #263 <Method void c(View)>
		}
		i = new WeakReference(((Object) (view)));
	//   20   36:aload_0         
	//   21   37:new             #122 <Class WeakReference>
	//   22   40:dup             
	//   23   41:aload_1         
	//   24   42:invokespecial   #157 <Method void WeakReference(Object)>
	//   25   45:putfield        #108 <Field WeakReference i>
		if(view != null)
	//*  26   48:aload_1         
	//*  27   49:ifnull          100
		{
			boolean flag;
			if(view.getWindowToken() == null && view.getWindowVisibility() == 8)
	//*  28   52:aload_1         
	//*  29   53:invokevirtual   #267 <Method android.os.IBinder View.getWindowToken()>
	//*  30   56:ifnonnull       76
	//*  31   59:aload_1         
	//*  32   60:invokevirtual   #227 <Method int View.getWindowVisibility()>
	//*  33   63:bipush          8
	//*  34   65:icmpeq          71
	//*  35   68:goto            76
				flag = false;
	//   36   71:iconst_0        
	//   37   72:istore_2        
			else
	//*  38   73:goto            78
				flag = true;
	//   39   76:iconst_1        
	//   40   77:istore_2        
			if(flag)
	//*  41   78:iload_2         
	//*  42   79:ifeq            87
				b(view);
	//   43   82:aload_0         
	//   44   83:aload_1         
	//   45   84:invokespecial   #269 <Method void b(View)>
			view.addOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
	//   46   87:aload_1         
	//   47   88:aload_0         
	//   48   89:invokevirtual   #272 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			m = -2L;
	//   49   92:aload_0         
	//   50   93:ldc2w           #243 <Long -2L>
	//   51   96:putfield        #65  <Field long m>
			return;
	//   52   99:return          
		} else
		{
			m = -3L;
	//   53  100:aload_0         
	//   54  101:ldc2w           #62  <Long -3L>
	//   55  104:putfield        #65  <Field long m>
			return;
	//   56  107:return          
		}
	}

	public final void onActivityCreated(Activity activity, Bundle bundle)
	{
		a(activity, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #276 <Method void a(Activity, int)>
		c();
	//    4    6:aload_0         
	//    5    7:invokespecial   #134 <Method void c()>
	//    6   10:return          
	}

	public final void onActivityDestroyed(Activity activity)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void c()>
	//    2    4:return          
	}

	public final void onActivityPaused(Activity activity)
	{
		a(activity, 4);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_4        
	//    3    3:invokespecial   #276 <Method void a(Activity, int)>
		c();
	//    4    6:aload_0         
	//    5    7:invokespecial   #134 <Method void c()>
	//    6   10:return          
	}

	public final void onActivityResumed(Activity activity)
	{
		a(activity, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #276 <Method void a(Activity, int)>
		c();
	//    4    6:aload_0         
	//    5    7:invokespecial   #134 <Method void c()>
		b();
	//    6   10:aload_0         
	//    7   11:invokespecial   #282 <Method void b()>
	//    8   14:return          
	}

	public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void c()>
	//    2    4:return          
	}

	public final void onActivityStarted(Activity activity)
	{
		a(activity, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #276 <Method void a(Activity, int)>
		c();
	//    4    6:aload_0         
	//    5    7:invokespecial   #134 <Method void c()>
	//    6   10:return          
	}

	public final void onActivityStopped(Activity activity)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void c()>
	//    2    4:return          
	}

	public final void onGlobalLayout()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void c()>
	//    2    4:return          
	}

	public final void onScrollChanged()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #134 <Method void c()>
	//    2    4:return          
	}

	public final void onViewAttachedToWindow(View view)
	{
		l = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #61  <Field int l>
		b(view);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #269 <Method void b(View)>
		c();
	//    6   10:aload_0         
	//    7   11:invokespecial   #134 <Method void c()>
	//    8   14:return          
	}

	public final void onViewDetachedFromWindow(View view)
	{
		l = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #61  <Field int l>
		c();
	//    3    5:aload_0         
	//    4    6:invokespecial   #134 <Method void c()>
		b();
	//    5    9:aload_0         
	//    6   10:invokespecial   #282 <Method void b()>
		c(view);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #263 <Method void c(View)>
	//   10   18:return          
	}

	private static final Handler a = new Handler(Looper.getMainLooper());
	private final Context b;
	private Application c;
	private final PowerManager d;
	private final KeyguardManager e;
	private final bav f;
	private BroadcastReceiver g;
	private WeakReference h;
	private WeakReference i;
	private bai j;
	private boolean k;
	private int l;
	private long m;

	static 
	{
	//    0    0:new             #41  <Class Handler>
	//    1    3:dup             
	//    2    4:invokestatic    #47  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #51  <Method void Handler(Looper)>
	//    4   10:putstatic       #53  <Field Handler a>
	//*   5   13:return          
	}
}
