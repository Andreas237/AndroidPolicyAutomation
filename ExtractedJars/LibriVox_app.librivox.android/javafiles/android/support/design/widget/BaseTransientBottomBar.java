// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.support.design.a.a;
import android.support.design.c;
import android.support.v4.view.ac;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			f, g, h, s, 
//			bs, am, i, SwipeDismissBehavior, 
//			j, l, o, m, 
//			n, bu

public abstract class BaseTransientBottomBar
{

	static android.support.design.h.a a(BaseTransientBottomBar basetransientbottombar)
	{
		return basetransientbottombar.g;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field android.support.design.h.a g>
	//    2    4:areturn         
	}

	private void d(int k)
	{
		ValueAnimator valueanimator = new ValueAnimator();
	//    0    0:new             #66  <Class ValueAnimator>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void ValueAnimator()>
	//    3    7:astore_2        
		valueanimator.setIntValues(new int[] {
			0, h()
		});
	//    4    8:aload_2         
	//    5    9:iconst_2        
	//    6   10:newarray        int[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:iconst_0        
	//   10   15:iastore         
	//   11   16:dup             
	//   12   17:iconst_1        
	//   13   18:aload_0         
	//   14   19:invokespecial   #70  <Method int h()>
	//   15   22:iastore         
	//   16   23:invokevirtual   #74  <Method void ValueAnimator.setIntValues(int[])>
		valueanimator.setInterpolator(a.b);
	//   17   26:aload_2         
	//   18   27:getstatic       #79  <Field android.animation.TimeInterpolator a.b>
	//   19   30:invokevirtual   #83  <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		valueanimator.setDuration(250L);
	//   20   33:aload_2         
	//   21   34:ldc2w           #84  <Long 250L>
	//   22   37:invokevirtual   #89  <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   23   40:pop             
		valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new g(this, k))));
	//   24   41:aload_2         
	//   25   42:new             #91  <Class g>
	//   26   45:dup             
	//   27   46:aload_0         
	//   28   47:iload_1         
	//   29   48:invokespecial   #94  <Method void g(BaseTransientBottomBar, int)>
	//   30   51:invokevirtual   #98  <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		valueanimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (new h(this))));
	//   31   54:aload_2         
	//   32   55:new             #100 <Class h>
	//   33   58:dup             
	//   34   59:aload_0         
	//   35   60:invokespecial   #103 <Method void h(BaseTransientBottomBar)>
	//   36   63:invokevirtual   #107 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		valueanimator.start();
	//   37   66:aload_2         
	//   38   67:invokevirtual   #110 <Method void ValueAnimator.start()>
	//   39   70:return          
	}

	static boolean g()
	{
		return d;
	//    0    0:getstatic       #34  <Field boolean d>
	//    1    3:ireturn         
	}

	private int h()
	{
		int i1 = b.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field s b>
	//    2    4:invokevirtual   #118 <Method int s.getHeight()>
	//    3    7:istore_2        
		android.view.ViewGroup.LayoutParams layoutparams = b.getLayoutParams();
	//    4    8:aload_0         
	//    5    9:getfield        #113 <Field s b>
	//    6   12:invokevirtual   #122 <Method android.view.ViewGroup$LayoutParams s.getLayoutParams()>
	//    7   15:astore_3        
		int k = i1;
	//    8   16:iload_2         
	//    9   17:istore_1        
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  10   18:aload_3         
	//*  11   19:instanceof      #124 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  12   22:ifeq            35
			k = i1 + ((android.view.ViewGroup.MarginLayoutParams)layoutparams).bottomMargin;
	//   13   25:iload_2         
	//   14   26:aload_3         
	//   15   27:checkcast       #124 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   30:getfield        #127 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   17   33:iadd            
	//   18   34:istore_1        
		return k;
	//   19   35:iload_1         
	//   20   36:ireturn         
	}

	protected void a(int k)
	{
		android.support.design.widget.bs.a().a(c, k);
	//    0    0:invokestatic    #132 <Method bs android.support.design.widget.bs.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #134 <Field bu c>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #137 <Method void android.support.design.widget.bs.a(bu, int)>
	//    5   11:return          
	}

	public boolean a()
	{
		return android.support.design.widget.bs.a().e(c);
	//    0    0:invokestatic    #132 <Method bs android.support.design.widget.bs.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #134 <Field bu c>
	//    3    7:invokevirtual   #140 <Method boolean bs.e(bu)>
	//    4   10:ireturn         
	}

	protected SwipeDismissBehavior b()
	{
		return ((SwipeDismissBehavior) (new Behavior()));
	//    0    0:new             #143 <Class BaseTransientBottomBar$Behavior>
	//    1    3:dup             
	//    2    4:invokespecial   #144 <Method void BaseTransientBottomBar$Behavior()>
	//    3    7:areturn         
	}

	final void b(int k)
	{
		if(f() && b.getVisibility() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #146 <Method boolean f()>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:getfield        #113 <Field s b>
	//*   5   11:invokevirtual   #149 <Method int s.getVisibility()>
	//*   6   14:ifne            23
		{
			d(k);
	//    7   17:aload_0         
	//    8   18:iload_1         
	//    9   19:invokespecial   #151 <Method void d(int)>
			return;
	//   10   22:return          
		} else
		{
			c(k);
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:invokevirtual   #153 <Method void c(int)>
			return;
	//   14   28:return          
		}
	}

	final void c()
	{
		if(b.getParent() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field s b>
	//*   2    4:invokevirtual   #157 <Method android.view.ViewParent s.getParent()>
	//*   3    7:ifnonnull       95
		{
			Object obj = ((Object) (b.getLayoutParams()));
	//    4   10:aload_0         
	//    5   11:getfield        #113 <Field s b>
	//    6   14:invokevirtual   #122 <Method android.view.ViewGroup$LayoutParams s.getLayoutParams()>
	//    7   17:astore_1        
			if(obj instanceof am)
	//*   8   18:aload_1         
	//*   9   19:instanceof      #159 <Class am>
	//*  10   22:ifeq            84
			{
				am am1 = (am)obj;
	//   11   25:aload_1         
	//   12   26:checkcast       #159 <Class am>
	//   13   29:astore_3        
				Behavior behavior = i;
	//   14   30:aload_0         
	//   15   31:getfield        #161 <Field BaseTransientBottomBar$Behavior i>
	//   16   34:astore_2        
				obj = ((Object) (behavior));
	//   17   35:aload_2         
	//   18   36:astore_1        
				if(behavior == null)
	//*  19   37:aload_2         
	//*  20   38:ifnonnull       46
					obj = ((Object) (b()));
	//   21   41:aload_0         
	//   22   42:invokevirtual   #163 <Method SwipeDismissBehavior b()>
	//   23   45:astore_1        
				if(obj instanceof Behavior)
	//*  24   46:aload_1         
	//*  25   47:instanceof      #143 <Class BaseTransientBottomBar$Behavior>
	//*  26   50:ifeq            61
					android.support.design.widget.Behavior.a((Behavior)obj, this);
	//   27   53:aload_1         
	//   28   54:checkcast       #143 <Class BaseTransientBottomBar$Behavior>
	//   29   57:aload_0         
	//   30   58:invokestatic    #166 <Method void android.support.design.widget.BaseTransientBottomBar$Behavior.a(BaseTransientBottomBar$Behavior, BaseTransientBottomBar)>
				((SwipeDismissBehavior) (obj)).a(((ca) (new i(this))));
	//   31   61:aload_1         
	//   32   62:new             #168 <Class i>
	//   33   65:dup             
	//   34   66:aload_0         
	//   35   67:invokespecial   #169 <Method void i(BaseTransientBottomBar)>
	//   36   70:invokevirtual   #174 <Method void android.support.design.widget.SwipeDismissBehavior.a(ca)>
				am1.a(((aj) (obj)));
	//   37   73:aload_3         
	//   38   74:aload_1         
	//   39   75:invokevirtual   #177 <Method void android.support.design.widget.am.a(aj)>
				am1.g = 80;
	//   40   78:aload_3         
	//   41   79:bipush          80
	//   42   81:putfield        #179 <Field int am.g>
			}
			f.addView(((View) (b)));
	//   43   84:aload_0         
	//   44   85:getfield        #181 <Field ViewGroup f>
	//   45   88:aload_0         
	//   46   89:getfield        #113 <Field s b>
	//   47   92:invokevirtual   #187 <Method void ViewGroup.addView(View)>
		}
		b.setOnAttachStateChangeListener(((q) (new j(this))));
	//   48   95:aload_0         
	//   49   96:getfield        #113 <Field s b>
	//   50   99:new             #189 <Class j>
	//   51  102:dup             
	//   52  103:aload_0         
	//   53  104:invokespecial   #190 <Method void j(BaseTransientBottomBar)>
	//   54  107:invokevirtual   #194 <Method void s.setOnAttachStateChangeListener(q)>
		if(ac.x(((View) (b))))
	//*  55  110:aload_0         
	//*  56  111:getfield        #113 <Field s b>
	//*  57  114:invokestatic    #200 <Method boolean ac.x(View)>
	//*  58  117:ifeq            137
		{
			if(f())
	//*  59  120:aload_0         
	//*  60  121:invokevirtual   #146 <Method boolean f()>
	//*  61  124:ifeq            132
			{
				d();
	//   62  127:aload_0         
	//   63  128:invokevirtual   #202 <Method void d()>
				return;
	//   64  131:return          
			} else
			{
				e();
	//   65  132:aload_0         
	//   66  133:invokevirtual   #204 <Method void e()>
				return;
	//   67  136:return          
			}
		} else
		{
			b.setOnLayoutChangeListener(((r) (new l(this))));
	//   68  137:aload_0         
	//   69  138:getfield        #113 <Field s b>
	//   70  141:new             #206 <Class l>
	//   71  144:dup             
	//   72  145:aload_0         
	//   73  146:invokespecial   #207 <Method void l(BaseTransientBottomBar)>
	//   74  149:invokevirtual   #211 <Method void s.setOnLayoutChangeListener(r)>
			return;
	//   75  152:return          
		}
	}

	void c(int k)
	{
		android.support.design.widget.bs.a().a(c);
	//    0    0:invokestatic    #132 <Method bs android.support.design.widget.bs.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #134 <Field bu c>
	//    3    7:invokevirtual   #214 <Method void android.support.design.widget.bs.a(bu)>
		Object obj = ((Object) (h));
	//    4   10:aload_0         
	//    5   11:getfield        #216 <Field List h>
	//    6   14:astore_3        
		if(obj != null)
	//*   7   15:aload_3         
	//*   8   16:ifnull          57
		{
			for(int i1 = ((List) (obj)).size() - 1; i1 >= 0; i1--)
	//*   9   19:aload_3         
	//*  10   20:invokeinterface #221 <Method int List.size()>
	//*  11   25:iconst_1        
	//*  12   26:isub            
	//*  13   27:istore_2        
	//*  14   28:iload_2         
	//*  15   29:iflt            57
				((o)h.get(i1)).a(((Object) (this)), k);
	//   16   32:aload_0         
	//   17   33:getfield        #216 <Field List h>
	//   18   36:iload_2         
	//   19   37:invokeinterface #225 <Method Object List.get(int)>
	//   20   42:checkcast       #227 <Class o>
	//   21   45:aload_0         
	//   22   46:iload_1         
	//   23   47:invokevirtual   #230 <Method void android.support.design.widget.o.a(Object, int)>

	//   24   50:iload_2         
	//   25   51:iconst_1        
	//   26   52:isub            
	//   27   53:istore_2        
		}
	//*  28   54:goto            28
		obj = ((Object) (b.getParent()));
	//   29   57:aload_0         
	//   30   58:getfield        #113 <Field s b>
	//   31   61:invokevirtual   #157 <Method android.view.ViewParent s.getParent()>
	//   32   64:astore_3        
		if(obj instanceof ViewGroup)
	//*  33   65:aload_3         
	//*  34   66:instanceof      #183 <Class ViewGroup>
	//*  35   69:ifeq            83
			((ViewGroup)obj).removeView(((View) (b)));
	//   36   72:aload_3         
	//   37   73:checkcast       #183 <Class ViewGroup>
	//   38   76:aload_0         
	//   39   77:getfield        #113 <Field s b>
	//   40   80:invokevirtual   #233 <Method void ViewGroup.removeView(View)>
	//   41   83:return          
	}

	void d()
	{
		int k = h();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method int h()>
	//    2    4:istore_1        
		if(d)
	//*   3    5:getstatic       #34  <Field boolean d>
	//*   4    8:ifeq            22
			ac.e(((View) (b)), k);
	//    5   11:aload_0         
	//    6   12:getfield        #113 <Field s b>
	//    7   15:iload_1         
	//    8   16:invokestatic    #236 <Method void ac.e(View, int)>
		else
	//*   9   19:goto            31
			b.setTranslationY(k);
	//   10   22:aload_0         
	//   11   23:getfield        #113 <Field s b>
	//   12   26:iload_1         
	//   13   27:i2f             
	//   14   28:invokevirtual   #240 <Method void s.setTranslationY(float)>
		ValueAnimator valueanimator = new ValueAnimator();
	//   15   31:new             #66  <Class ValueAnimator>
	//   16   34:dup             
	//   17   35:invokespecial   #67  <Method void ValueAnimator()>
	//   18   38:astore_2        
		valueanimator.setIntValues(new int[] {
			k, 0
		});
	//   19   39:aload_2         
	//   20   40:iconst_2        
	//   21   41:newarray        int[]
	//   22   43:dup             
	//   23   44:iconst_0        
	//   24   45:iload_1         
	//   25   46:iastore         
	//   26   47:dup             
	//   27   48:iconst_1        
	//   28   49:iconst_0        
	//   29   50:iastore         
	//   30   51:invokevirtual   #74  <Method void ValueAnimator.setIntValues(int[])>
		valueanimator.setInterpolator(a.b);
	//   31   54:aload_2         
	//   32   55:getstatic       #79  <Field android.animation.TimeInterpolator a.b>
	//   33   58:invokevirtual   #83  <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		valueanimator.setDuration(250L);
	//   34   61:aload_2         
	//   35   62:ldc2w           #84  <Long 250L>
	//   36   65:invokevirtual   #89  <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   37   68:pop             
		valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new m(this))));
	//   38   69:aload_2         
	//   39   70:new             #242 <Class m>
	//   40   73:dup             
	//   41   74:aload_0         
	//   42   75:invokespecial   #243 <Method void m(BaseTransientBottomBar)>
	//   43   78:invokevirtual   #98  <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		valueanimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (new n(this, k))));
	//   44   81:aload_2         
	//   45   82:new             #245 <Class n>
	//   46   85:dup             
	//   47   86:aload_0         
	//   48   87:iload_1         
	//   49   88:invokespecial   #246 <Method void n(BaseTransientBottomBar, int)>
	//   50   91:invokevirtual   #107 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		valueanimator.start();
	//   51   94:aload_2         
	//   52   95:invokevirtual   #110 <Method void ValueAnimator.start()>
	//   53   98:return          
	}

	void e()
	{
		android.support.design.widget.bs.a().b(c);
	//    0    0:invokestatic    #132 <Method bs android.support.design.widget.bs.a()>
	//    1    3:aload_0         
	//    2    4:getfield        #134 <Field bu c>
	//    3    7:invokevirtual   #248 <Method void bs.b(bu)>
		List list = h;
	//    4   10:aload_0         
	//    5   11:getfield        #216 <Field List h>
	//    6   14:astore_2        
		if(list != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          56
		{
			for(int k = list.size() - 1; k >= 0; k--)
	//*   9   19:aload_2         
	//*  10   20:invokeinterface #221 <Method int List.size()>
	//*  11   25:iconst_1        
	//*  12   26:isub            
	//*  13   27:istore_1        
	//*  14   28:iload_1         
	//*  15   29:iflt            56
				((o)h.get(k)).a(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:getfield        #216 <Field List h>
	//   18   36:iload_1         
	//   19   37:invokeinterface #225 <Method Object List.get(int)>
	//   20   42:checkcast       #227 <Class o>
	//   21   45:aload_0         
	//   22   46:invokevirtual   #251 <Method void android.support.design.widget.o.a(Object)>

	//   23   49:iload_1         
	//   24   50:iconst_1        
	//   25   51:isub            
	//   26   52:istore_1        
		}
	//*  27   53:goto            28
	//   28   56:return          
	}

	boolean f()
	{
		List list = j.getEnabledAccessibilityServiceList(1);
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field AccessibilityManager j>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #259 <Method List AccessibilityManager.getEnabledAccessibilityServiceList(int)>
	//    4    8:astore_1        
		return list != null && list.isEmpty();
	//    5    9:aload_1         
	//    6   10:ifnull          24
	//    7   13:aload_1         
	//    8   14:invokeinterface #262 <Method boolean List.isEmpty()>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	static final Handler a = new Handler(Looper.getMainLooper(), ((android.os.Handler.Callback) (new f())));
	private static final boolean d;
	private static final int e[];
	protected final s b;
	final bu c;
	private final ViewGroup f;
	private final android.support.design.h.a g;
	private List h;
	private Behavior i;
	private final AccessibilityManager j;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 16 && android.os.Build.VERSION.SDK_INT <= 19)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          21
	//*   3    8:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   11:bipush          19
	//*   5   13:icmpgt          21
			flag = true;
	//    6   16:iconst_1        
	//    7   17:istore_0        
		else
	//*   8   18:goto            23
			flag = false;
	//    9   21:iconst_0        
	//   10   22:istore_0        
		d = flag;
	//   11   23:iload_0         
	//   12   24:putstatic       #34  <Field boolean d>
		e = (new int[] {
			c.snackbarStyle
		});
	//   13   27:iconst_1        
	//   14   28:newarray        int[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:getstatic       #39  <Field int c.snackbarStyle>
	//   18   35:iastore         
	//   19   36:putstatic       #41  <Field int[] e>
	//   20   39:new             #43  <Class Handler>
	//   21   42:dup             
	//   22   43:invokestatic    #49  <Method Looper Looper.getMainLooper()>
	//   23   46:new             #51  <Class f>
	//   24   49:dup             
	//   25   50:invokespecial   #54  <Method void f()>
	//   26   53:invokespecial   #57  <Method void Handler(Looper, android.os.Handler$Callback)>
	//   27   56:putstatic       #59  <Field Handler a>
	//*  28   59:return          
	}

	private class Behavior extends SwipeDismissBehavior
	{

		static void a(Behavior behavior, BaseTransientBottomBar basetransientbottombar)
		{
			behavior.a(basetransientbottombar);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void a(BaseTransientBottomBar)>
		//    3    5:return          
		}

		private void a(BaseTransientBottomBar basetransientbottombar)
		{
			g.a(basetransientbottombar);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field p g>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #24  <Method void android.support.design.widget.p.a(BaseTransientBottomBar)>
		//    4    8:return          
		}

		public boolean a(View view)
		{
			return g.a(view);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field p g>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #27  <Method boolean android.support.design.widget.p.a(View)>
		//    4    8:ireturn         
		}

		public boolean b(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
		{
			g.a(coordinatorlayout, view, motionevent);
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field p g>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #32  <Method void android.support.design.widget.p.a(CoordinatorLayout, View, MotionEvent)>
			return super.b(coordinatorlayout, view, motionevent);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:aload_3         
		//   10   14:invokespecial   #34  <Method boolean SwipeDismissBehavior.b(CoordinatorLayout, View, MotionEvent)>
		//   11   17:ireturn         
		}

		private final p g = new p(((SwipeDismissBehavior) (this)));

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #10  <Method void SwipeDismissBehavior()>
		//    2    4:aload_0         
		//    3    5:new             #12  <Class p>
		//    4    8:dup             
		//    5    9:aload_0         
		//    6   10:invokespecial   #15  <Method void p(SwipeDismissBehavior)>
		//    7   13:putfield        #17  <Field p g>
		//    8   16:return          
		}
	}

}
