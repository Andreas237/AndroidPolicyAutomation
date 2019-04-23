// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.*;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abw, xo

public final class zu
{

	public zu(Activity activity, View view, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener, android.view.ViewTreeObserver.OnScrollChangedListener onscrollchangedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		b = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Activity b>
		a = view;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field View a>
		f = ongloballayoutlistener;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener f>
		g = onscrollchangedlistener;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener g>
	//   14   25:return          
	}

	private static ViewTreeObserver b(Activity activity)
	{
		if(activity == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		activity = ((Activity) (activity.getWindow()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #38  <Method Window Activity.getWindow()>
	//    6   10:astore_0        
		if(activity == null)
	//*   7   11:aload_0         
	//*   8   12:ifnonnull       17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		activity = ((Activity) (((Window) (activity)).getDecorView()));
	//   11   17:aload_0         
	//   12   18:invokevirtual   #44  <Method View Window.getDecorView()>
	//   13   21:astore_0        
		if(activity == null)
	//*  14   22:aload_0         
	//*  15   23:ifnonnull       28
			return null;
	//   16   26:aconst_null     
	//   17   27:areturn         
		else
			return ((View) (activity)).getViewTreeObserver();
	//   18   28:aload_0         
	//   19   29:invokevirtual   #50  <Method ViewTreeObserver View.getViewTreeObserver()>
	//   20   32:areturn         
	}

	private final void e()
	{
		if(!c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field boolean c>
	//*   2    4:ifne            106
		{
			Object obj = ((Object) (f));
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener f>
	//    5   11:astore_1        
			if(obj != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          54
			{
				Object obj1 = ((Object) (b));
	//    8   16:aload_0         
	//    9   17:getfield        #24  <Field Activity b>
	//   10   20:astore_2        
				if(obj1 != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          39
				{
					obj1 = ((Object) (b(((Activity) (obj1)))));
	//   13   25:aload_2         
	//   14   26:invokestatic    #54  <Method ViewTreeObserver b(Activity)>
	//   15   29:astore_2        
					if(obj1 != null)
	//*  16   30:aload_2         
	//*  17   31:ifnull          39
						((ViewTreeObserver) (obj1)).addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (obj)));
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #60  <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
				}
				aw.D();
	//   21   39:invokestatic    #66  <Method abw aw.D()>
	//   22   42:pop             
				abw.a(a, f);
	//   23   43:aload_0         
	//   24   44:getfield        #26  <Field View a>
	//   25   47:aload_0         
	//   26   48:getfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener f>
	//   27   51:invokestatic    #71  <Method void abw.a(View, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			obj = ((Object) (g));
	//   28   54:aload_0         
	//   29   55:getfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener g>
	//   30   58:astore_1        
			if(obj != null)
	//*  31   59:aload_1         
	//*  32   60:ifnull          101
			{
				Object obj2 = ((Object) (b));
	//   33   63:aload_0         
	//   34   64:getfield        #24  <Field Activity b>
	//   35   67:astore_2        
				if(obj2 != null)
	//*  36   68:aload_2         
	//*  37   69:ifnull          86
				{
					obj2 = ((Object) (b(((Activity) (obj2)))));
	//   38   72:aload_2         
	//   39   73:invokestatic    #54  <Method ViewTreeObserver b(Activity)>
	//   40   76:astore_2        
					if(obj2 != null)
	//*  41   77:aload_2         
	//*  42   78:ifnull          86
						((ViewTreeObserver) (obj2)).addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (obj)));
	//   43   81:aload_2         
	//   44   82:aload_1         
	//   45   83:invokevirtual   #75  <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
				}
				aw.D();
	//   46   86:invokestatic    #66  <Method abw aw.D()>
	//   47   89:pop             
				abw.a(a, g);
	//   48   90:aload_0         
	//   49   91:getfield        #26  <Field View a>
	//   50   94:aload_0         
	//   51   95:getfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener g>
	//   52   98:invokestatic    #78  <Method void abw.a(View, android.view.ViewTreeObserver$OnScrollChangedListener)>
			}
			c = true;
	//   53  101:aload_0         
	//   54  102:iconst_1        
	//   55  103:putfield        #52  <Field boolean c>
		}
	//   56  106:return          
	}

	private final void f()
	{
		Object obj1 = ((Object) (b));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Activity b>
	//    2    4:astore_2        
		if(obj1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		if(c)
	//*   6   10:aload_0         
	//*   7   11:getfield        #52  <Field boolean c>
	//*   8   14:ifeq            74
		{
			Object obj = ((Object) (f));
	//    9   17:aload_0         
	//   10   18:getfield        #28  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener f>
	//   11   21:astore_1        
			if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          43
			{
				obj1 = ((Object) (b(((Activity) (obj1)))));
	//   14   26:aload_2         
	//   15   27:invokestatic    #54  <Method ViewTreeObserver b(Activity)>
	//   16   30:astore_2        
				if(obj1 != null)
	//*  17   31:aload_2         
	//*  18   32:ifnull          43
					aw.g().a(((ViewTreeObserver) (obj1)), ((android.view.ViewTreeObserver.OnGlobalLayoutListener) (obj)));
	//   19   35:invokestatic    #81  <Method xo aw.g()>
	//   20   38:aload_2         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #86  <Method void xo.a(ViewTreeObserver, android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			obj = ((Object) (g));
	//   23   43:aload_0         
	//   24   44:getfield        #30  <Field android.view.ViewTreeObserver$OnScrollChangedListener g>
	//   25   47:astore_1        
			if(obj != null)
	//*  26   48:aload_1         
	//*  27   49:ifnull          69
			{
				ViewTreeObserver viewtreeobserver = b(b);
	//   28   52:aload_0         
	//   29   53:getfield        #24  <Field Activity b>
	//   30   56:invokestatic    #54  <Method ViewTreeObserver b(Activity)>
	//   31   59:astore_2        
				if(viewtreeobserver != null)
	//*  32   60:aload_2         
	//*  33   61:ifnull          69
					viewtreeobserver.removeOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (obj)));
	//   34   64:aload_2         
	//   35   65:aload_1         
	//   36   66:invokevirtual   #89  <Method void ViewTreeObserver.removeOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
			}
			c = false;
	//   37   69:aload_0         
	//   38   70:iconst_0        
	//   39   71:putfield        #52  <Field boolean c>
		}
	//   40   74:return          
	}

	public final void a()
	{
		e = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #91  <Field boolean e>
		if(d)
	//*   3    5:aload_0         
	//*   4    6:getfield        #93  <Field boolean d>
	//*   5    9:ifeq            16
			e();
	//    6   12:aload_0         
	//    7   13:invokespecial   #95  <Method void e()>
	//    8   16:return          
	}

	public final void a(Activity activity)
	{
		b = activity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field Activity b>
	//    3    5:return          
	}

	public final void b()
	{
		e = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #91  <Field boolean e>
		f();
	//    3    5:aload_0         
	//    4    6:invokespecial   #98  <Method void f()>
	//    5    9:return          
	}

	public final void c()
	{
		d = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #93  <Field boolean d>
		if(e)
	//*   3    5:aload_0         
	//*   4    6:getfield        #91  <Field boolean e>
	//*   5    9:ifeq            16
			e();
	//    6   12:aload_0         
	//    7   13:invokespecial   #95  <Method void e()>
	//    8   16:return          
	}

	public final void d()
	{
		d = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #93  <Field boolean d>
		f();
	//    3    5:aload_0         
	//    4    6:invokespecial   #98  <Method void f()>
	//    5    9:return          
	}

	private final View a;
	private Activity b;
	private boolean c;
	private boolean d;
	private boolean e;
	private android.view.ViewTreeObserver.OnGlobalLayoutListener f;
	private android.view.ViewTreeObserver.OnScrollChangedListener g;
}
