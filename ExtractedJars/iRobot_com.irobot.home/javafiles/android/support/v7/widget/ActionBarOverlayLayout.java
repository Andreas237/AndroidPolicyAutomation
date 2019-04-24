// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.view.*;
import android.widget.OverScroller;

// Referenced classes of package android.support.v7.widget:
//			u, v, Toolbar, ActionBarContainer, 
//			ContentFrameLayout, bd

public class ActionBarOverlayLayout extends ViewGroup
	implements l, u
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public LayoutParams(int i1, int j1)
		{
			super(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #11  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		//    4    6:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		//    4    6:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #18  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		//    3    5:return          
		}
	}

	public static interface a
	{

		public abstract void d(int i1);

		public abstract void g(boolean flag);

		public abstract void j();

		public abstract void k();

		public abstract void l();

		public abstract void m();
	}


	public ActionBarOverlayLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #78  <Method void ActionBarOverlayLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #79  <Method void ViewGroup(Context, AttributeSet)>
		g = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #81  <Field int g>
		q = new Rect();
	//    7   11:aload_0         
	//    8   12:new             #83  <Class Rect>
	//    9   15:dup             
	//   10   16:invokespecial   #85  <Method void Rect()>
	//   11   19:putfield        #87  <Field Rect q>
		r = new Rect();
	//   12   22:aload_0         
	//   13   23:new             #83  <Class Rect>
	//   14   26:dup             
	//   15   27:invokespecial   #85  <Method void Rect()>
	//   16   30:putfield        #89  <Field Rect r>
		s = new Rect();
	//   17   33:aload_0         
	//   18   34:new             #83  <Class Rect>
	//   19   37:dup             
	//   20   38:invokespecial   #85  <Method void Rect()>
	//   21   41:putfield        #91  <Field Rect s>
		t = new Rect();
	//   22   44:aload_0         
	//   23   45:new             #83  <Class Rect>
	//   24   48:dup             
	//   25   49:invokespecial   #85  <Method void Rect()>
	//   26   52:putfield        #93  <Field Rect t>
		u = new Rect();
	//   27   55:aload_0         
	//   28   56:new             #83  <Class Rect>
	//   29   59:dup             
	//   30   60:invokespecial   #85  <Method void Rect()>
	//   31   63:putfield        #95  <Field Rect u>
		v = new Rect();
	//   32   66:aload_0         
	//   33   67:new             #83  <Class Rect>
	//   34   70:dup             
	//   35   71:invokespecial   #85  <Method void Rect()>
	//   36   74:putfield        #97  <Field Rect v>
		w = new Rect();
	//   37   77:aload_0         
	//   38   78:new             #83  <Class Rect>
	//   39   81:dup             
	//   40   82:invokespecial   #85  <Method void Rect()>
	//   41   85:putfield        #99  <Field Rect w>
		y = 600;
	//   42   88:aload_0         
	//   43   89:sipush          600
	//   44   92:putfield        #101 <Field int y>
		d = ((AnimatorListenerAdapter) (new AnimatorListenerAdapter() {

			public void onAnimationCancel(Animator animator)
			{
				a.c = null;
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field ActionBarOverlayLayout a>
			//    2    4:aconst_null     
			//    3    5:putfield        #22  <Field ViewPropertyAnimator ActionBarOverlayLayout.c>
				a.b = false;
			//    4    8:aload_0         
			//    5    9:getfield        #12  <Field ActionBarOverlayLayout a>
			//    6   12:iconst_0        
			//    7   13:putfield        #26  <Field boolean ActionBarOverlayLayout.b>
			//    8   16:return          
			}

			public void onAnimationEnd(Animator animator)
			{
				a.c = null;
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field ActionBarOverlayLayout a>
			//    2    4:aconst_null     
			//    3    5:putfield        #22  <Field ViewPropertyAnimator ActionBarOverlayLayout.c>
				a.b = false;
			//    4    8:aload_0         
			//    5    9:getfield        #12  <Field ActionBarOverlayLayout a>
			//    6   12:iconst_0        
			//    7   13:putfield        #26  <Field boolean ActionBarOverlayLayout.b>
			//    8   16:return          
			}

			final ActionBarOverlayLayout a;

			
			{
				a = ActionBarOverlayLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ActionBarOverlayLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
));
	//   45   95:aload_0         
	//   46   96:new             #10  <Class ActionBarOverlayLayout$1>
	//   47   99:dup             
	//   48  100:aload_0         
	//   49  101:invokespecial   #104 <Method void ActionBarOverlayLayout$1(ActionBarOverlayLayout)>
	//   50  104:putfield        #106 <Field AnimatorListenerAdapter d>
		A = new Runnable() {

			public void run()
			{
				a.d();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActionBarOverlayLayout a>
			//    2    4:invokevirtual   #22  <Method void ActionBarOverlayLayout.d()>
				a.c = a.a.animate().translationY(0.0F).setListener(((android.animation.Animator.AnimatorListener) (a.d)));
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field ActionBarOverlayLayout a>
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field ActionBarOverlayLayout a>
			//    7   15:getfield        #25  <Field ActionBarContainer ActionBarOverlayLayout.a>
			//    8   18:invokevirtual   #31  <Method ViewPropertyAnimator ActionBarContainer.animate()>
			//    9   21:fconst_0        
			//   10   22:invokevirtual   #37  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
			//   11   25:aload_0         
			//   12   26:getfield        #14  <Field ActionBarOverlayLayout a>
			//   13   29:getfield        #40  <Field AnimatorListenerAdapter ActionBarOverlayLayout.d>
			//   14   32:invokevirtual   #44  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
			//   15   35:putfield        #48  <Field ViewPropertyAnimator ActionBarOverlayLayout.c>
			//   16   38:return          
			}

			final ActionBarOverlayLayout a;

			
			{
				a = ActionBarOverlayLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActionBarOverlayLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   51  107:aload_0         
	//   52  108:new             #12  <Class ActionBarOverlayLayout$2>
	//   53  111:dup             
	//   54  112:aload_0         
	//   55  113:invokespecial   #107 <Method void ActionBarOverlayLayout$2(ActionBarOverlayLayout)>
	//   56  116:putfield        #109 <Field Runnable A>
		B = new Runnable() {

			public void run()
			{
				a.d();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActionBarOverlayLayout a>
			//    2    4:invokevirtual   #22  <Method void ActionBarOverlayLayout.d()>
				a.c = a.a.animate().translationY(-a.a.getHeight()).setListener(((android.animation.Animator.AnimatorListener) (a.d)));
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field ActionBarOverlayLayout a>
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field ActionBarOverlayLayout a>
			//    7   15:getfield        #25  <Field ActionBarContainer ActionBarOverlayLayout.a>
			//    8   18:invokevirtual   #31  <Method ViewPropertyAnimator ActionBarContainer.animate()>
			//    9   21:aload_0         
			//   10   22:getfield        #14  <Field ActionBarOverlayLayout a>
			//   11   25:getfield        #25  <Field ActionBarContainer ActionBarOverlayLayout.a>
			//   12   28:invokevirtual   #35  <Method int ActionBarContainer.getHeight()>
			//   13   31:ineg            
			//   14   32:i2f             
			//   15   33:invokevirtual   #41  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
			//   16   36:aload_0         
			//   17   37:getfield        #14  <Field ActionBarOverlayLayout a>
			//   18   40:getfield        #44  <Field AnimatorListenerAdapter ActionBarOverlayLayout.d>
			//   19   43:invokevirtual   #48  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
			//   20   46:putfield        #52  <Field ViewPropertyAnimator ActionBarOverlayLayout.c>
			//   21   49:return          
			}

			final ActionBarOverlayLayout a;

			
			{
				a = ActionBarOverlayLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActionBarOverlayLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   57  119:aload_0         
	//   58  120:new             #14  <Class ActionBarOverlayLayout$3>
	//   59  123:dup             
	//   60  124:aload_0         
	//   61  125:invokespecial   #110 <Method void ActionBarOverlayLayout$3(ActionBarOverlayLayout)>
	//   62  128:putfield        #112 <Field Runnable B>
		a(context);
	//   63  131:aload_0         
	//   64  132:aload_1         
	//   65  133:invokespecial   #114 <Method void a(Context)>
		C = new n(((ViewGroup) (this)));
	//   66  136:aload_0         
	//   67  137:new             #116 <Class n>
	//   68  140:dup             
	//   69  141:aload_0         
	//   70  142:invokespecial   #119 <Method void n(ViewGroup)>
	//   71  145:putfield        #121 <Field n C>
	//   72  148:return          
	}

	private v a(View view)
	{
		if(view instanceof v)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #124 <Class v>
	//*   2    4:ifeq            12
			return (v)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #124 <Class v>
	//    5   11:areturn         
		if(view instanceof Toolbar)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #126 <Class Toolbar>
	//*   8   16:ifeq            27
		{
			return ((Toolbar)view).getWrapper();
	//    9   19:aload_1         
	//   10   20:checkcast       #126 <Class Toolbar>
	//   11   23:invokevirtual   #130 <Method v Toolbar.getWrapper()>
	//   12   26:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #132 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #133 <Method void StringBuilder()>
	//   16   34:astore_2        
			stringbuilder.append("Can't make a decor toolbar out of ");
	//   17   35:aload_2         
	//   18   36:ldc1            #135 <String "Can't make a decor toolbar out of ">
	//   19   38:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			stringbuilder.append(((Object) (view)).getClass().getSimpleName());
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #145 <Method Class Object.getClass()>
	//   24   47:invokevirtual   #151 <Method String Class.getSimpleName()>
	//   25   50:invokevirtual   #139 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   27   54:new             #153 <Class IllegalStateException>
	//   28   57:dup             
	//   29   58:aload_2         
	//   30   59:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   31   62:invokespecial   #159 <Method void IllegalStateException(String)>
	//   32   65:athrow          
		}
	}

	private void a(Context context)
	{
		TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(e);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #163 <Method Context getContext()>
	//    2    4:invokevirtual   #169 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    3    7:getstatic       #72  <Field int[] e>
	//    4   10:invokevirtual   #175 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(int[])>
	//    5   13:astore          4
		boolean flag1 = false;
	//    6   15:iconst_0        
	//    7   16:istore_3        
		f = typedarray.getDimensionPixelSize(0, 0);
	//    8   17:aload_0         
	//    9   18:aload           4
	//   10   20:iconst_0        
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #181 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   13   25:putfield        #183 <Field int f>
		j = typedarray.getDrawable(1);
	//   14   28:aload_0         
	//   15   29:aload           4
	//   16   31:iconst_1        
	//   17   32:invokevirtual   #187 <Method Drawable TypedArray.getDrawable(int)>
	//   18   35:putfield        #189 <Field Drawable j>
		boolean flag;
		if(j == null)
	//*  19   38:aload_0         
	//*  20   39:getfield        #189 <Field Drawable j>
	//*  21   42:ifnonnull       50
			flag = true;
	//   22   45:iconst_1        
	//   23   46:istore_2        
		else
	//*  24   47:goto            52
			flag = false;
	//   25   50:iconst_0        
	//   26   51:istore_2        
		setWillNotDraw(flag);
	//   27   52:aload_0         
	//   28   53:iload_2         
	//   29   54:invokevirtual   #193 <Method void setWillNotDraw(boolean)>
		typedarray.recycle();
	//   30   57:aload           4
	//   31   59:invokevirtual   #196 <Method void TypedArray.recycle()>
		flag = flag1;
	//   32   62:iload_3         
	//   33   63:istore_2        
		if(context.getApplicationInfo().targetSdkVersion < 19)
	//*  34   64:aload_1         
	//*  35   65:invokevirtual   #200 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  36   68:getfield        #205 <Field int ApplicationInfo.targetSdkVersion>
	//*  37   71:bipush          19
	//*  38   73:icmpge          78
			flag = true;
	//   39   76:iconst_1        
	//   40   77:istore_2        
		k = flag;
	//   41   78:aload_0         
	//   42   79:iload_2         
	//   43   80:putfield        #207 <Field boolean k>
		z = new OverScroller(context);
	//   44   83:aload_0         
	//   45   84:new             #209 <Class OverScroller>
	//   46   87:dup             
	//   47   88:aload_1         
	//   48   89:invokespecial   #211 <Method void OverScroller(Context)>
	//   49   92:putfield        #213 <Field OverScroller z>
	//   50   95:return          
	}

	private boolean a(float f1, float f2)
	{
		z.fling(0, 0, 0, (int)f2, 0, 0, 0x80000000, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field OverScroller z>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:fload_2         
	//    6    8:f2i             
	//    7    9:iconst_0        
	//    8   10:iconst_0        
	//    9   11:ldc1            #215 <Int 0x80000000>
	//   10   13:ldc1            #216 <Int 0x7fffffff>
	//   11   15:invokevirtual   #220 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		return z.getFinalY() > a.getHeight();
	//   12   18:aload_0         
	//   13   19:getfield        #213 <Field OverScroller z>
	//   14   22:invokevirtual   #224 <Method int OverScroller.getFinalY()>
	//   15   25:aload_0         
	//   16   26:getfield        #226 <Field ActionBarContainer a>
	//   17   29:invokevirtual   #231 <Method int ActionBarContainer.getHeight()>
	//   18   32:icmple          37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	private boolean a(View view, Rect rect, boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		view = ((View) ((LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #238 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #16  <Class ActionBarOverlayLayout$LayoutParams>
	//    3    7:astore_1        
		boolean flag4;
		if(flag && ((LayoutParams) (view)).leftMargin != rect.left)
	//*   4    8:iload_3         
	//*   5    9:ifeq            37
	//*   6   12:aload_1         
	//*   7   13:getfield        #241 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//*   8   16:aload_2         
	//*   9   17:getfield        #244 <Field int Rect.left>
	//*  10   20:icmpeq          37
		{
			view.leftMargin = rect.left;
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:getfield        #244 <Field int Rect.left>
	//   14   28:putfield        #241 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
			flag4 = true;
	//   15   31:iconst_1        
	//   16   32:istore          7
		} else
	//*  17   34:goto            40
		{
			flag4 = false;
	//   18   37:iconst_0        
	//   19   38:istore          7
		}
		flag = flag4;
	//   20   40:iload           7
	//   21   42:istore_3        
		if(flag1)
	//*  22   43:iload           4
	//*  23   45:ifeq            72
		{
			flag = flag4;
	//   24   48:iload           7
	//   25   50:istore_3        
			if(((LayoutParams) (view)).topMargin != rect.top)
	//*  26   51:aload_1         
	//*  27   52:getfield        #247 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//*  28   55:aload_2         
	//*  29   56:getfield        #250 <Field int Rect.top>
	//*  30   59:icmpeq          72
			{
				view.topMargin = rect.top;
	//   31   62:aload_1         
	//   32   63:aload_2         
	//   33   64:getfield        #250 <Field int Rect.top>
	//   34   67:putfield        #247 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
				flag = true;
	//   35   70:iconst_1        
	//   36   71:istore_3        
			}
		}
		flag1 = flag;
	//   37   72:iload_3         
	//   38   73:istore          4
		if(flag3)
	//*  39   75:iload           6
	//*  40   77:ifeq            105
		{
			flag1 = flag;
	//   41   80:iload_3         
	//   42   81:istore          4
			if(((LayoutParams) (view)).rightMargin != rect.right)
	//*  43   83:aload_1         
	//*  44   84:getfield        #253 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//*  45   87:aload_2         
	//*  46   88:getfield        #256 <Field int Rect.right>
	//*  47   91:icmpeq          105
			{
				view.rightMargin = rect.right;
	//   48   94:aload_1         
	//   49   95:aload_2         
	//   50   96:getfield        #256 <Field int Rect.right>
	//   51   99:putfield        #253 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
				flag1 = true;
	//   52  102:iconst_1        
	//   53  103:istore          4
			}
		}
		flag = flag1;
	//   54  105:iload           4
	//   55  107:istore_3        
		if(flag2)
	//*  56  108:iload           5
	//*  57  110:ifeq            137
		{
			flag = flag1;
	//   58  113:iload           4
	//   59  115:istore_3        
			if(((LayoutParams) (view)).bottomMargin != rect.bottom)
	//*  60  116:aload_1         
	//*  61  117:getfield        #259 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//*  62  120:aload_2         
	//*  63  121:getfield        #262 <Field int Rect.bottom>
	//*  64  124:icmpeq          137
			{
				view.bottomMargin = rect.bottom;
	//   65  127:aload_1         
	//   66  128:aload_2         
	//   67  129:getfield        #262 <Field int Rect.bottom>
	//   68  132:putfield        #259 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
				flag = true;
	//   69  135:iconst_1        
	//   70  136:istore_3        
			}
		}
		return flag;
	//   71  137:iload_3         
	//   72  138:ireturn         
	}

	private void l()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method void d()>
		postDelayed(A, 600L);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #109 <Field Runnable A>
	//    5    9:ldc2w           #265 <Long 600L>
	//    6   12:invokevirtual   #270 <Method boolean postDelayed(Runnable, long)>
	//    7   15:pop             
	//    8   16:return          
	}

	private void m()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method void d()>
		postDelayed(B, 600L);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field Runnable B>
	//    5    9:ldc2w           #265 <Long 600L>
	//    6   12:invokevirtual   #270 <Method boolean postDelayed(Runnable, long)>
	//    7   15:pop             
	//    8   16:return          
	}

	private void n()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method void d()>
		A.run();
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field Runnable A>
	//    4    8:invokeinterface #275 <Method void Runnable.run()>
	//    5   13:return          
	}

	private void o()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method void d()>
		B.run();
	//    2    4:aload_0         
	//    3    5:getfield        #112 <Field Runnable B>
	//    4    8:invokeinterface #275 <Method void Runnable.run()>
	//    5   13:return          
	}

	public LayoutParams a(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #16  <Class ActionBarOverlayLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #163 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #277 <Method void ActionBarOverlayLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	public void a(int i1)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		if(i1 != 2)
	//*   2    4:iload_1         
	//*   3    5:iconst_2        
	//*   4    6:icmpeq          37
		{
			if(i1 != 5)
	//*   5    9:iload_1         
	//*   6   10:iconst_5        
	//*   7   11:icmpeq          27
			{
				if(i1 != 109)
	//*   8   14:iload_1         
	//*   9   15:bipush          109
	//*  10   17:icmpeq          21
				{
					return;
	//   11   20:return          
				} else
				{
					setOverlayMode(true);
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:invokevirtual   #283 <Method void setOverlayMode(boolean)>
					return;
	//   15   26:return          
				}
			} else
			{
				i.g();
	//   16   27:aload_0         
	//   17   28:getfield        #285 <Field v i>
	//   18   31:invokeinterface #287 <Method void v.g()>
				return;
	//   19   36:return          
			}
		} else
		{
			i.f();
	//   20   37:aload_0         
	//   21   38:getfield        #285 <Field v i>
	//   22   41:invokeinterface #289 <Method void v.f()>
			return;
	//   23   46:return          
		}
	}

	public void a(Menu menu, android.support.v7.view.menu.o.a a1)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		i.a(menu, a1);
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #292 <Method void v.a(Menu, android.support.v7.view.menu.o$a)>
	//    7   15:return          
	}

	public boolean a()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #295 <Field boolean l>
	//    2    4:ireturn         
	}

	protected LayoutParams b()
	{
		return new LayoutParams(-1, -1);
	//    0    0:new             #16  <Class ActionBarOverlayLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #299 <Method void ActionBarOverlayLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	void c()
	{
		if(h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #301 <Field ContentFrameLayout h>
	//*   2    4:ifnonnull       50
		{
			h = (ContentFrameLayout)findViewById(android.support.v7.a.a.f.action_bar_activity_content);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getstatic       #306 <Field int android.support.v7.a.a$f.action_bar_activity_content>
	//    6   12:invokevirtual   #310 <Method View findViewById(int)>
	//    7   15:checkcast       #312 <Class ContentFrameLayout>
	//    8   18:putfield        #301 <Field ContentFrameLayout h>
			a = (ActionBarContainer)findViewById(android.support.v7.a.a.f.action_bar_container);
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getstatic       #315 <Field int android.support.v7.a.a$f.action_bar_container>
	//   12   26:invokevirtual   #310 <Method View findViewById(int)>
	//   13   29:checkcast       #228 <Class ActionBarContainer>
	//   14   32:putfield        #226 <Field ActionBarContainer a>
			i = a(findViewById(android.support.v7.a.a.f.action_bar));
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getstatic       #318 <Field int android.support.v7.a.a$f.action_bar>
	//   19   41:invokevirtual   #310 <Method View findViewById(int)>
	//   20   44:invokespecial   #320 <Method v a(View)>
	//   21   47:putfield        #285 <Field v i>
		}
	//   22   50:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #16  <Class ActionBarOverlayLayout$LayoutParams>
	//    2    4:ireturn         
	}

	void d()
	{
		removeCallbacks(A);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #109 <Field Runnable A>
	//    3    5:invokevirtual   #326 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		removeCallbacks(B);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #112 <Field Runnable B>
	//    8   14:invokevirtual   #326 <Method boolean removeCallbacks(Runnable)>
	//    9   17:pop             
		if(c != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #328 <Field ViewPropertyAnimator c>
	//*  12   22:ifnull          32
			c.cancel();
	//   13   25:aload_0         
	//   14   26:getfield        #328 <Field ViewPropertyAnimator c>
	//   15   29:invokevirtual   #333 <Method void ViewPropertyAnimator.cancel()>
	//   16   32:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #337 <Method void ViewGroup.draw(Canvas)>
		if(j != null && !k)
	//*   3    5:aload_0         
	//*   4    6:getfield        #189 <Field Drawable j>
	//*   5    9:ifnull          86
	//*   6   12:aload_0         
	//*   7   13:getfield        #207 <Field boolean k>
	//*   8   16:ifne            86
		{
			int i1;
			if(a.getVisibility() == 0)
	//*   9   19:aload_0         
	//*  10   20:getfield        #226 <Field ActionBarContainer a>
	//*  11   23:invokevirtual   #340 <Method int ActionBarContainer.getVisibility()>
	//*  12   26:ifne            54
				i1 = (int)((float)a.getBottom() + a.getTranslationY() + 0.5F);
	//   13   29:aload_0         
	//   14   30:getfield        #226 <Field ActionBarContainer a>
	//   15   33:invokevirtual   #343 <Method int ActionBarContainer.getBottom()>
	//   16   36:i2f             
	//   17   37:aload_0         
	//   18   38:getfield        #226 <Field ActionBarContainer a>
	//   19   41:invokevirtual   #347 <Method float ActionBarContainer.getTranslationY()>
	//   20   44:fadd            
	//   21   45:ldc2            #348 <Float 0.5F>
	//   22   48:fadd            
	//   23   49:f2i             
	//   24   50:istore_2        
			else
	//*  25   51:goto            56
				i1 = 0;
	//   26   54:iconst_0        
	//   27   55:istore_2        
			j.setBounds(0, i1, getWidth(), j.getIntrinsicHeight() + i1);
	//   28   56:aload_0         
	//   29   57:getfield        #189 <Field Drawable j>
	//   30   60:iconst_0        
	//   31   61:iload_2         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #351 <Method int getWidth()>
	//   34   66:aload_0         
	//   35   67:getfield        #189 <Field Drawable j>
	//   36   70:invokevirtual   #356 <Method int Drawable.getIntrinsicHeight()>
	//   37   73:iload_2         
	//   38   74:iadd            
	//   39   75:invokevirtual   #360 <Method void Drawable.setBounds(int, int, int, int)>
			j.draw(canvas);
	//   40   78:aload_0         
	//   41   79:getfield        #189 <Field Drawable j>
	//   42   82:aload_1         
	//   43   83:invokevirtual   #361 <Method void Drawable.draw(Canvas)>
		}
	//   44   86:return          
	}

	public boolean e()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		return i.h();
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:invokeinterface #363 <Method boolean v.h()>
	//    5   13:ireturn         
	}

	public boolean f()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		return i.i();
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:invokeinterface #365 <Method boolean v.i()>
	//    5   13:ireturn         
	}

	protected boolean fitSystemWindows(Rect rect)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		android.support.v4.view.s.o(((View) (this)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #372 <Method int s.o(View)>
	//    4    8:pop             
		boolean flag = a(((View) (a)), rect, true, true, false, true);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #226 <Field ActionBarContainer a>
	//    8   14:aload_1         
	//    9   15:iconst_1        
	//   10   16:iconst_1        
	//   11   17:iconst_0        
	//   12   18:iconst_1        
	//   13   19:invokespecial   #374 <Method boolean a(View, Rect, boolean, boolean, boolean, boolean)>
	//   14   22:istore_2        
		t.set(rect);
	//   15   23:aload_0         
	//   16   24:getfield        #93  <Field Rect t>
	//   17   27:aload_1         
	//   18   28:invokevirtual   #378 <Method void Rect.set(Rect)>
		bd.a(((View) (this)), t, q);
	//   19   31:aload_0         
	//   20   32:aload_0         
	//   21   33:getfield        #93  <Field Rect t>
	//   22   36:aload_0         
	//   23   37:getfield        #87  <Field Rect q>
	//   24   40:invokestatic    #383 <Method void bd.a(View, Rect, Rect)>
		if(!u.equals(((Object) (t))))
	//*  25   43:aload_0         
	//*  26   44:getfield        #95  <Field Rect u>
	//*  27   47:aload_0         
	//*  28   48:getfield        #93  <Field Rect t>
	//*  29   51:invokevirtual   #387 <Method boolean Rect.equals(Object)>
	//*  30   54:ifne            70
		{
			u.set(t);
	//   31   57:aload_0         
	//   32   58:getfield        #95  <Field Rect u>
	//   33   61:aload_0         
	//   34   62:getfield        #93  <Field Rect t>
	//   35   65:invokevirtual   #378 <Method void Rect.set(Rect)>
			flag = true;
	//   36   68:iconst_1        
	//   37   69:istore_2        
		}
		if(!r.equals(((Object) (q))))
	//*  38   70:aload_0         
	//*  39   71:getfield        #89  <Field Rect r>
	//*  40   74:aload_0         
	//*  41   75:getfield        #87  <Field Rect q>
	//*  42   78:invokevirtual   #387 <Method boolean Rect.equals(Object)>
	//*  43   81:ifne            97
		{
			r.set(q);
	//   44   84:aload_0         
	//   45   85:getfield        #89  <Field Rect r>
	//   46   88:aload_0         
	//   47   89:getfield        #87  <Field Rect q>
	//   48   92:invokevirtual   #378 <Method void Rect.set(Rect)>
			flag = true;
	//   49   95:iconst_1        
	//   50   96:istore_2        
		}
		if(flag)
	//*  51   97:iload_2         
	//*  52   98:ifeq            105
			requestLayout();
	//   53  101:aload_0         
	//   54  102:invokevirtual   #390 <Method void requestLayout()>
		return true;
	//   55  105:iconst_1        
	//   56  106:ireturn         
	}

	public boolean g()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		return i.j();
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:invokeinterface #392 <Method boolean v.j()>
	//    5   13:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #395 <Method ActionBarOverlayLayout$LayoutParams b()>
	//    2    4:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #399 <Method ActionBarOverlayLayout$LayoutParams a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    0    0:new             #16  <Class ActionBarOverlayLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #403 <Method void ActionBarOverlayLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public int getActionBarHideOffset()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field ActionBarContainer a>
	//*   2    4:ifnull          17
			return -(int)a.getTranslationY();
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field ActionBarContainer a>
	//    5   11:invokevirtual   #347 <Method float ActionBarContainer.getTranslationY()>
	//    6   14:f2i             
	//    7   15:ineg            
	//    8   16:ireturn         
		else
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public int getNestedScrollAxes()
	{
		return C.a();
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field n C>
	//    2    4:invokevirtual   #407 <Method int n.a()>
	//    3    7:ireturn         
	}

	public CharSequence getTitle()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		return i.e();
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:invokeinterface #411 <Method CharSequence v.e()>
	//    5   13:areturn         
	}

	public boolean h()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		return i.k();
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:invokeinterface #413 <Method boolean v.k()>
	//    5   13:ireturn         
	}

	public boolean i()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		return i.l();
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:invokeinterface #415 <Method boolean android.support.v7.widget.v.l()>
	//    5   13:ireturn         
	}

	public void j()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		i.m();
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:invokeinterface #417 <Method void v.m()>
	//    5   13:return          
	}

	public void k()
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		i.n();
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:invokeinterface #419 <Method void android.support.v7.widget.v.n()>
	//    5   13:return          
	}

	protected void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #423 <Method void ViewGroup.onConfigurationChanged(Configuration)>
		a(getContext());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #163 <Method Context getContext()>
	//    6   10:invokespecial   #114 <Method void a(Context)>
		android.support.v4.view.s.p(((View) (this)));
	//    7   13:aload_0         
	//    8   14:invokestatic    #426 <Method void s.p(View)>
	//    9   17:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #429 <Method void ViewGroup.onDetachedFromWindow()>
		d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #264 <Method void d()>
	//    4    8:return          
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #434 <Method int getChildCount()>
	//    2    4:istore_3        
		k1 = getPaddingLeft();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #437 <Method int getPaddingLeft()>
	//    5    9:istore          4
		getPaddingRight();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #440 <Method int getPaddingRight()>
	//    8   15:pop             
		l1 = getPaddingTop();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #443 <Method int getPaddingTop()>
	//   11   20:istore          5
		getPaddingBottom();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #446 <Method int getPaddingBottom()>
	//   14   26:pop             
		for(i1 = 0; i1 < j1; i1++)
	//*  15   27:iconst_0        
	//*  16   28:istore_2        
	//*  17   29:iload_2         
	//*  18   30:iload_3         
	//*  19   31:icmpge          121
		{
			View view = getChildAt(i1);
	//   20   34:aload_0         
	//   21   35:iload_2         
	//   22   36:invokevirtual   #449 <Method View getChildAt(int)>
	//   23   39:astore          10
			if(view.getVisibility() != 8)
	//*  24   41:aload           10
	//*  25   43:invokevirtual   #450 <Method int View.getVisibility()>
	//*  26   46:bipush          8
	//*  27   48:icmpeq          114
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   28   51:aload           10
	//   29   53:invokevirtual   #238 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   56:checkcast       #16  <Class ActionBarOverlayLayout$LayoutParams>
	//   31   59:astore          11
				int i2 = view.getMeasuredWidth();
	//   32   61:aload           10
	//   33   63:invokevirtual   #453 <Method int View.getMeasuredWidth()>
	//   34   66:istore          6
				int j2 = view.getMeasuredHeight();
	//   35   68:aload           10
	//   36   70:invokevirtual   #456 <Method int View.getMeasuredHeight()>
	//   37   73:istore          7
				int k2 = layoutparams.leftMargin + k1;
	//   38   75:aload           11
	//   39   77:getfield        #241 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//   40   80:iload           4
	//   41   82:iadd            
	//   42   83:istore          8
				int l2 = layoutparams.topMargin + l1;
	//   43   85:aload           11
	//   44   87:getfield        #247 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//   45   90:iload           5
	//   46   92:iadd            
	//   47   93:istore          9
				view.layout(k2, l2, i2 + k2, j2 + l2);
	//   48   95:aload           10
	//   49   97:iload           8
	//   50   99:iload           9
	//   51  101:iload           6
	//   52  103:iload           8
	//   53  105:iadd            
	//   54  106:iload           7
	//   55  108:iload           9
	//   56  110:iadd            
	//   57  111:invokevirtual   #459 <Method void View.layout(int, int, int, int)>
			}
		}

	//   58  114:iload_2         
	//   59  115:iconst_1        
	//   60  116:iadd            
	//   61  117:istore_2        
	//*  62  118:goto            29
	//   63  121:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		measureChildWithMargins(((View) (a)), i1, 0, j1, 0);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #226 <Field ActionBarContainer a>
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #464 <Method void measureChildWithMargins(View, int, int, int, int)>
		Object obj = ((Object) ((LayoutParams)a.getLayoutParams()));
	//   10   16:aload_0         
	//   11   17:getfield        #226 <Field ActionBarContainer a>
	//   12   20:invokevirtual   #465 <Method android.view.ViewGroup$LayoutParams ActionBarContainer.getLayoutParams()>
	//   13   23:checkcast       #16  <Class ActionBarOverlayLayout$LayoutParams>
	//   14   26:astore          9
		int i3 = Math.max(0, a.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
	//   15   28:iconst_0        
	//   16   29:aload_0         
	//   17   30:getfield        #226 <Field ActionBarContainer a>
	//   18   33:invokevirtual   #466 <Method int ActionBarContainer.getMeasuredWidth()>
	//   19   36:aload           9
	//   20   38:getfield        #241 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//   21   41:iadd            
	//   22   42:aload           9
	//   23   44:getfield        #253 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//   24   47:iadd            
	//   25   48:invokestatic    #471 <Method int Math.max(int, int)>
	//   26   51:istore          8
		int l2 = Math.max(0, a.getMeasuredHeight() + ((LayoutParams) (obj)).topMargin + ((LayoutParams) (obj)).bottomMargin);
	//   27   53:iconst_0        
	//   28   54:aload_0         
	//   29   55:getfield        #226 <Field ActionBarContainer a>
	//   30   58:invokevirtual   #472 <Method int ActionBarContainer.getMeasuredHeight()>
	//   31   61:aload           9
	//   32   63:getfield        #247 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//   33   66:iadd            
	//   34   67:aload           9
	//   35   69:getfield        #259 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//   36   72:iadd            
	//   37   73:invokestatic    #471 <Method int Math.max(int, int)>
	//   38   76:istore          7
		int k2 = View.combineMeasuredStates(0, a.getMeasuredState());
	//   39   78:iconst_0        
	//   40   79:aload_0         
	//   41   80:getfield        #226 <Field ActionBarContainer a>
	//   42   83:invokevirtual   #475 <Method int ActionBarContainer.getMeasuredState()>
	//   43   86:invokestatic    #478 <Method int View.combineMeasuredStates(int, int)>
	//   44   89:istore          6
		boolean flag;
		if((android.support.v4.view.s.o(((View) (this))) & 0x100) != 0)
	//*  45   91:aload_0         
	//*  46   92:invokestatic    #372 <Method int s.o(View)>
	//*  47   95:sipush          256
	//*  48   98:iand            
	//*  49   99:ifeq            108
			flag = true;
	//   50  102:iconst_1        
	//   51  103:istore          4
		else
	//*  52  105:goto            111
			flag = false;
	//   53  108:iconst_0        
	//   54  109:istore          4
		int k1;
		if(flag)
	//*  55  111:iload           4
	//*  56  113:ifeq            156
		{
			int i2 = f;
	//   57  116:aload_0         
	//   58  117:getfield        #183 <Field int f>
	//   59  120:istore          5
			k1 = i2;
	//   60  122:iload           5
	//   61  124:istore_3        
			if(m)
	//*  62  125:aload_0         
	//*  63  126:getfield        #480 <Field boolean m>
	//*  64  129:ifeq            181
			{
				k1 = i2;
	//   65  132:iload           5
	//   66  134:istore_3        
				if(a.getTabContainer() != null)
	//*  67  135:aload_0         
	//*  68  136:getfield        #226 <Field ActionBarContainer a>
	//*  69  139:invokevirtual   #484 <Method View ActionBarContainer.getTabContainer()>
	//*  70  142:ifnull          181
					k1 = i2 + f;
	//   71  145:iload           5
	//   72  147:aload_0         
	//   73  148:getfield        #183 <Field int f>
	//   74  151:iadd            
	//   75  152:istore_3        
			}
		} else
	//*  76  153:goto            181
		if(a.getVisibility() != 8)
	//*  77  156:aload_0         
	//*  78  157:getfield        #226 <Field ActionBarContainer a>
	//*  79  160:invokevirtual   #340 <Method int ActionBarContainer.getVisibility()>
	//*  80  163:bipush          8
	//*  81  165:icmpeq          179
			k1 = a.getMeasuredHeight();
	//   82  168:aload_0         
	//   83  169:getfield        #226 <Field ActionBarContainer a>
	//   84  172:invokevirtual   #472 <Method int ActionBarContainer.getMeasuredHeight()>
	//   85  175:istore_3        
		else
	//*  86  176:goto            181
			k1 = 0;
	//   87  179:iconst_0        
	//   88  180:istore_3        
		s.set(q);
	//   89  181:aload_0         
	//   90  182:getfield        #91  <Field Rect s>
	//   91  185:aload_0         
	//   92  186:getfield        #87  <Field Rect q>
	//   93  189:invokevirtual   #378 <Method void Rect.set(Rect)>
		v.set(t);
	//   94  192:aload_0         
	//   95  193:getfield        #97  <Field Rect v>
	//   96  196:aload_0         
	//   97  197:getfield        #93  <Field Rect t>
	//   98  200:invokevirtual   #378 <Method void Rect.set(Rect)>
		if(!l && !flag)
	//*  99  203:aload_0         
	//* 100  204:getfield        #295 <Field boolean l>
	//* 101  207:ifne            242
	//* 102  210:iload           4
	//* 103  212:ifne            242
		{
			obj = ((Object) (s));
	//  104  215:aload_0         
	//  105  216:getfield        #91  <Field Rect s>
	//  106  219:astore          9
			obj.top = ((Rect) (obj)).top + k1;
	//  107  221:aload           9
	//  108  223:aload           9
	//  109  225:getfield        #250 <Field int Rect.top>
	//  110  228:iload_3         
	//  111  229:iadd            
	//  112  230:putfield        #250 <Field int Rect.top>
			obj = ((Object) (s));
	//  113  233:aload_0         
	//  114  234:getfield        #91  <Field Rect s>
	//  115  237:astore          9
		} else
	//* 116  239:goto            266
		{
			obj = ((Object) (v));
	//  117  242:aload_0         
	//  118  243:getfield        #97  <Field Rect v>
	//  119  246:astore          9
			obj.top = ((Rect) (obj)).top + k1;
	//  120  248:aload           9
	//  121  250:aload           9
	//  122  252:getfield        #250 <Field int Rect.top>
	//  123  255:iload_3         
	//  124  256:iadd            
	//  125  257:putfield        #250 <Field int Rect.top>
			obj = ((Object) (v));
	//  126  260:aload_0         
	//  127  261:getfield        #97  <Field Rect v>
	//  128  264:astore          9
		}
		obj.bottom = ((Rect) (obj)).bottom + 0;
	//  129  266:aload           9
	//  130  268:aload           9
	//  131  270:getfield        #262 <Field int Rect.bottom>
	//  132  273:iconst_0        
	//  133  274:iadd            
	//  134  275:putfield        #262 <Field int Rect.bottom>
		a(((View) (h)), s, true, true, true, true);
	//  135  278:aload_0         
	//  136  279:aload_0         
	//  137  280:getfield        #301 <Field ContentFrameLayout h>
	//  138  283:aload_0         
	//  139  284:getfield        #91  <Field Rect s>
	//  140  287:iconst_1        
	//  141  288:iconst_1        
	//  142  289:iconst_1        
	//  143  290:iconst_1        
	//  144  291:invokespecial   #374 <Method boolean a(View, Rect, boolean, boolean, boolean, boolean)>
	//  145  294:pop             
		if(!w.equals(((Object) (v))))
	//* 146  295:aload_0         
	//* 147  296:getfield        #99  <Field Rect w>
	//* 148  299:aload_0         
	//* 149  300:getfield        #97  <Field Rect v>
	//* 150  303:invokevirtual   #387 <Method boolean Rect.equals(Object)>
	//* 151  306:ifne            331
		{
			w.set(v);
	//  152  309:aload_0         
	//  153  310:getfield        #99  <Field Rect w>
	//  154  313:aload_0         
	//  155  314:getfield        #97  <Field Rect v>
	//  156  317:invokevirtual   #378 <Method void Rect.set(Rect)>
			h.a(v);
	//  157  320:aload_0         
	//  158  321:getfield        #301 <Field ContentFrameLayout h>
	//  159  324:aload_0         
	//  160  325:getfield        #97  <Field Rect v>
	//  161  328:invokevirtual   #486 <Method void ContentFrameLayout.a(Rect)>
		}
		measureChildWithMargins(((View) (h)), i1, 0, j1, 0);
	//  162  331:aload_0         
	//  163  332:aload_0         
	//  164  333:getfield        #301 <Field ContentFrameLayout h>
	//  165  336:iload_1         
	//  166  337:iconst_0        
	//  167  338:iload_2         
	//  168  339:iconst_0        
	//  169  340:invokevirtual   #464 <Method void measureChildWithMargins(View, int, int, int, int)>
		obj = ((Object) ((LayoutParams)h.getLayoutParams()));
	//  170  343:aload_0         
	//  171  344:getfield        #301 <Field ContentFrameLayout h>
	//  172  347:invokevirtual   #487 <Method android.view.ViewGroup$LayoutParams ContentFrameLayout.getLayoutParams()>
	//  173  350:checkcast       #16  <Class ActionBarOverlayLayout$LayoutParams>
	//  174  353:astore          9
		k1 = Math.max(i3, h.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
	//  175  355:iload           8
	//  176  357:aload_0         
	//  177  358:getfield        #301 <Field ContentFrameLayout h>
	//  178  361:invokevirtual   #488 <Method int ContentFrameLayout.getMeasuredWidth()>
	//  179  364:aload           9
	//  180  366:getfield        #241 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//  181  369:iadd            
	//  182  370:aload           9
	//  183  372:getfield        #253 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//  184  375:iadd            
	//  185  376:invokestatic    #471 <Method int Math.max(int, int)>
	//  186  379:istore_3        
		int l1 = Math.max(l2, h.getMeasuredHeight() + ((LayoutParams) (obj)).topMargin + ((LayoutParams) (obj)).bottomMargin);
	//  187  380:iload           7
	//  188  382:aload_0         
	//  189  383:getfield        #301 <Field ContentFrameLayout h>
	//  190  386:invokevirtual   #489 <Method int ContentFrameLayout.getMeasuredHeight()>
	//  191  389:aload           9
	//  192  391:getfield        #247 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//  193  394:iadd            
	//  194  395:aload           9
	//  195  397:getfield        #259 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//  196  400:iadd            
	//  197  401:invokestatic    #471 <Method int Math.max(int, int)>
	//  198  404:istore          4
		int j2 = View.combineMeasuredStates(k2, h.getMeasuredState());
	//  199  406:iload           6
	//  200  408:aload_0         
	//  201  409:getfield        #301 <Field ContentFrameLayout h>
	//  202  412:invokevirtual   #490 <Method int ContentFrameLayout.getMeasuredState()>
	//  203  415:invokestatic    #478 <Method int View.combineMeasuredStates(int, int)>
	//  204  418:istore          5
		k2 = getPaddingLeft();
	//  205  420:aload_0         
	//  206  421:invokevirtual   #437 <Method int getPaddingLeft()>
	//  207  424:istore          6
		l2 = getPaddingRight();
	//  208  426:aload_0         
	//  209  427:invokevirtual   #440 <Method int getPaddingRight()>
	//  210  430:istore          7
		l1 = Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
	//  211  432:iload           4
	//  212  434:aload_0         
	//  213  435:invokevirtual   #443 <Method int getPaddingTop()>
	//  214  438:aload_0         
	//  215  439:invokevirtual   #446 <Method int getPaddingBottom()>
	//  216  442:iadd            
	//  217  443:iadd            
	//  218  444:aload_0         
	//  219  445:invokevirtual   #493 <Method int getSuggestedMinimumHeight()>
	//  220  448:invokestatic    #471 <Method int Math.max(int, int)>
	//  221  451:istore          4
		setMeasuredDimension(View.resolveSizeAndState(Math.max(k1 + (k2 + l2), getSuggestedMinimumWidth()), i1, j2), View.resolveSizeAndState(l1, j1, j2 << 16));
	//  222  453:aload_0         
	//  223  454:iload_3         
	//  224  455:iload           6
	//  225  457:iload           7
	//  226  459:iadd            
	//  227  460:iadd            
	//  228  461:aload_0         
	//  229  462:invokevirtual   #496 <Method int getSuggestedMinimumWidth()>
	//  230  465:invokestatic    #471 <Method int Math.max(int, int)>
	//  231  468:iload_1         
	//  232  469:iload           5
	//  233  471:invokestatic    #500 <Method int View.resolveSizeAndState(int, int, int)>
	//  234  474:iload           4
	//  235  476:iload_2         
	//  236  477:iload           5
	//  237  479:bipush          16
	//  238  481:ishl            
	//  239  482:invokestatic    #500 <Method int View.resolveSizeAndState(int, int, int)>
	//  240  485:invokevirtual   #503 <Method void setMeasuredDimension(int, int)>
	//  241  488:return          
	}

	public boolean onNestedFling(View view, float f1, float f2, boolean flag)
	{
		if(n && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #507 <Field boolean n>
	//*   2    4:ifeq            42
	//*   3    7:iload           4
	//*   4    9:ifne            15
	//*   5   12:goto            42
		{
			if(a(f1, f2))
	//*   6   15:aload_0         
	//*   7   16:fload_2         
	//*   8   17:fload_3         
	//*   9   18:invokespecial   #509 <Method boolean a(float, float)>
	//*  10   21:ifeq            31
				o();
	//   11   24:aload_0         
	//   12   25:invokespecial   #511 <Method void o()>
			else
	//*  13   28:goto            35
				n();
	//   14   31:aload_0         
	//   15   32:invokespecial   #512 <Method void n()>
			b = true;
	//   16   35:aload_0         
	//   17   36:iconst_1        
	//   18   37:putfield        #514 <Field boolean b>
			return true;
	//   19   40:iconst_1        
	//   20   41:ireturn         
		} else
		{
			return false;
	//   21   42:iconst_0        
	//   22   43:ireturn         
		}
	}

	public boolean onNestedPreFling(View view, float f1, float f2)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onNestedPreScroll(View view, int i1, int j1, int ai[])
	{
	//    0    0:return          
	}

	public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
	{
		o = o + j1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #521 <Field int o>
	//    3    5:iload_3         
	//    4    6:iadd            
	//    5    7:putfield        #521 <Field int o>
		setActionBarHideOffset(o);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #521 <Field int o>
	//    9   15:invokevirtual   #524 <Method void setActionBarHideOffset(int)>
	//   10   18:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i1)
	{
		C.a(view, view1, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field n C>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #528 <Method void n.a(View, View, int)>
		o = getActionBarHideOffset();
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #530 <Method int getActionBarHideOffset()>
	//    9   15:putfield        #521 <Field int o>
		d();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #264 <Method void d()>
		if(x != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//*  14   26:ifnull          38
			x.l();
	//   15   29:aload_0         
	//   16   30:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//   17   33:invokeinterface #534 <Method void android.support.v7.widget.ActionBarOverlayLayout$a.l()>
	//   18   38:return          
	}

	public boolean onStartNestedScroll(View view, View view1, int i1)
	{
		if((i1 & 2) != 0 && a.getVisibility() == 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            24
	//*   4    6:aload_0         
	//*   5    7:getfield        #226 <Field ActionBarContainer a>
	//*   6   10:invokevirtual   #340 <Method int ActionBarContainer.getVisibility()>
	//*   7   13:ifeq            19
	//*   8   16:goto            24
			return n;
	//    9   19:aload_0         
	//   10   20:getfield        #507 <Field boolean n>
	//   11   23:ireturn         
		else
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		if(n && !b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #507 <Field boolean n>
	//*   2    4:ifeq            39
	//*   3    7:aload_0         
	//*   4    8:getfield        #514 <Field boolean b>
	//*   5   11:ifne            39
			if(o <= a.getHeight())
	//*   6   14:aload_0         
	//*   7   15:getfield        #521 <Field int o>
	//*   8   18:aload_0         
	//*   9   19:getfield        #226 <Field ActionBarContainer a>
	//*  10   22:invokevirtual   #231 <Method int ActionBarContainer.getHeight()>
	//*  11   25:icmpgt          35
				l();
	//   12   28:aload_0         
	//   13   29:invokespecial   #538 <Method void l()>
			else
	//*  14   32:goto            39
				m();
	//   15   35:aload_0         
	//   16   36:invokespecial   #539 <Method void m()>
		if(x != null)
	//*  17   39:aload_0         
	//*  18   40:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//*  19   43:ifnull          55
			x.m();
	//   20   46:aload_0         
	//   21   47:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//   22   50:invokeinterface #540 <Method void ActionBarOverlayLayout$a.m()>
	//   23   55:return          
	}

	public void onWindowSystemUiVisibilityChanged(int i1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #546 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			super.onWindowSystemUiVisibilityChanged(i1);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokespecial   #548 <Method void ViewGroup.onWindowSystemUiVisibilityChanged(int)>
		c();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #280 <Method void c()>
		int j1 = p;
	//    8   17:aload_0         
	//    9   18:getfield        #550 <Field int p>
	//   10   21:istore          4
		p = i1;
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:putfield        #550 <Field int p>
		boolean flag1 = false;
	//   14   28:iconst_0        
	//   15   29:istore_3        
		boolean flag;
		if((i1 & 4) == 0)
	//*  16   30:iload_1         
	//*  17   31:iconst_4        
	//*  18   32:iand            
	//*  19   33:ifne            41
			flag = true;
	//   20   36:iconst_1        
	//   21   37:istore_2        
		else
	//*  22   38:goto            43
			flag = false;
	//   23   41:iconst_0        
	//   24   42:istore_2        
		if((i1 & 0x100) != 0)
	//*  25   43:iload_1         
	//*  26   44:sipush          256
	//*  27   47:iand            
	//*  28   48:ifeq            53
			flag1 = true;
	//   29   51:iconst_1        
	//   30   52:istore_3        
		if(x != null)
	//*  31   53:aload_0         
	//*  32   54:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//*  33   57:ifnull          104
		{
			x.g(flag1 ^ true);
	//   34   60:aload_0         
	//   35   61:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//   36   64:iload_3         
	//   37   65:iconst_1        
	//   38   66:ixor            
	//   39   67:invokeinterface #552 <Method void ActionBarOverlayLayout$a.g(boolean)>
			if(!flag && flag1)
	//*  40   72:iload_2         
	//*  41   73:ifne            95
	//*  42   76:iload_3         
	//*  43   77:ifne            83
	//*  44   80:goto            95
				x.k();
	//   45   83:aload_0         
	//   46   84:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//   47   87:invokeinterface #554 <Method void ActionBarOverlayLayout$a.k()>
			else
	//*  48   92:goto            104
				x.j();
	//   49   95:aload_0         
	//   50   96:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//   51   99:invokeinterface #556 <Method void ActionBarOverlayLayout$a.j()>
		}
		if(((j1 ^ i1) & 0x100) != 0 && x != null)
	//*  52  104:iload           4
	//*  53  106:iload_1         
	//*  54  107:ixor            
	//*  55  108:sipush          256
	//*  56  111:iand            
	//*  57  112:ifeq            126
	//*  58  115:aload_0         
	//*  59  116:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//*  60  119:ifnull          126
			android.support.v4.view.s.p(((View) (this)));
	//   61  122:aload_0         
	//   62  123:invokestatic    #426 <Method void s.p(View)>
	//   63  126:return          
	}

	protected void onWindowVisibilityChanged(int i1)
	{
		super.onWindowVisibilityChanged(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #559 <Method void ViewGroup.onWindowVisibilityChanged(int)>
		g = i1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #81  <Field int g>
		if(x != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//*   8   14:ifnull          27
			x.d(i1);
	//    9   17:aload_0         
	//   10   18:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//   11   21:iload_1         
	//   12   22:invokeinterface #561 <Method void ActionBarOverlayLayout$a.d(int)>
	//   13   27:return          
	}

	public void setActionBarHideOffset(int i1)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method void d()>
		i1 = Math.max(0, Math.min(i1, a.getHeight()));
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #226 <Field ActionBarContainer a>
	//    6   10:invokevirtual   #231 <Method int ActionBarContainer.getHeight()>
	//    7   13:invokestatic    #564 <Method int Math.min(int, int)>
	//    8   16:invokestatic    #471 <Method int Math.max(int, int)>
	//    9   19:istore_1        
		a.setTranslationY(-i1);
	//   10   20:aload_0         
	//   11   21:getfield        #226 <Field ActionBarContainer a>
	//   12   24:iload_1         
	//   13   25:ineg            
	//   14   26:i2f             
	//   15   27:invokevirtual   #568 <Method void ActionBarContainer.setTranslationY(float)>
	//   16   30:return          
	}

	public void setActionBarVisibilityCallback(a a1)
	{
		x = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #532 <Field ActionBarOverlayLayout$a x>
		if(getWindowToken() != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #574 <Method android.os.IBinder getWindowToken()>
	//*   5    9:ifnull          44
		{
			x.d(g);
	//    6   12:aload_0         
	//    7   13:getfield        #532 <Field ActionBarOverlayLayout$a x>
	//    8   16:aload_0         
	//    9   17:getfield        #81  <Field int g>
	//   10   20:invokeinterface #561 <Method void ActionBarOverlayLayout$a.d(int)>
			if(p != 0)
	//*  11   25:aload_0         
	//*  12   26:getfield        #550 <Field int p>
	//*  13   29:ifeq            44
			{
				onWindowSystemUiVisibilityChanged(p);
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #550 <Field int p>
	//   17   37:invokevirtual   #575 <Method void onWindowSystemUiVisibilityChanged(int)>
				android.support.v4.view.s.p(((View) (this)));
	//   18   40:aload_0         
	//   19   41:invokestatic    #426 <Method void s.p(View)>
			}
		}
	//   20   44:return          
	}

	public void setHasNonEmbeddedTabs(boolean flag)
	{
		m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #480 <Field boolean m>
	//    3    5:return          
	}

	public void setHideOnContentScrollEnabled(boolean flag)
	{
		if(flag != n)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #507 <Field boolean n>
	//*   3    5:icmpeq          26
		{
			n = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #507 <Field boolean n>
			if(!flag)
	//*   7   13:iload_1         
	//*   8   14:ifne            26
			{
				d();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #264 <Method void d()>
				setActionBarHideOffset(0);
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #524 <Method void setActionBarHideOffset(int)>
			}
		}
	//   14   26:return          
	}

	public void setIcon(int i1)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		i.a(i1);
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:iload_1         
	//    5    9:invokeinterface #580 <Method void v.a(int)>
	//    6   14:return          
	}

	public void setIcon(Drawable drawable)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		i.a(drawable);
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:aload_1         
	//    5    9:invokeinterface #583 <Method void v.a(Drawable)>
	//    6   14:return          
	}

	public void setLogo(int i1)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		i.b(i1);
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:iload_1         
	//    5    9:invokeinterface #586 <Method void v.b(int)>
	//    6   14:return          
	}

	public void setOverlayMode(boolean flag)
	{
		l = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #295 <Field boolean l>
		if(flag && getContext().getApplicationInfo().targetSdkVersion < 19)
	//*   3    5:iload_1         
	//*   4    6:ifeq            29
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #163 <Method Context getContext()>
	//*   7   13:invokevirtual   #200 <Method ApplicationInfo Context.getApplicationInfo()>
	//*   8   16:getfield        #205 <Field int ApplicationInfo.targetSdkVersion>
	//*   9   19:bipush          19
	//*  10   21:icmpge          29
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_1        
		else
	//*  13   26:goto            31
			flag = false;
	//   14   29:iconst_0        
	//   15   30:istore_1        
		k = flag;
	//   16   31:aload_0         
	//   17   32:iload_1         
	//   18   33:putfield        #207 <Field boolean k>
	//   19   36:return          
	}

	public void setShowingForActionMode(boolean flag)
	{
	//    0    0:return          
	}

	public void setUiOptions(int i1)
	{
	//    0    0:return          
	}

	public void setWindowCallback(android.view.Window.Callback callback)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		i.a(callback);
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:aload_1         
	//    5    9:invokeinterface #592 <Method void v.a(android.view.Window$Callback)>
	//    6   14:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void c()>
		i.a(charsequence);
	//    2    4:aload_0         
	//    3    5:getfield        #285 <Field v i>
	//    4    8:aload_1         
	//    5    9:invokeinterface #596 <Method void v.a(CharSequence)>
	//    6   14:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	static final int e[];
	private final Runnable A;
	private final Runnable B;
	private final n C;
	ActionBarContainer a;
	boolean b;
	ViewPropertyAnimator c;
	final AnimatorListenerAdapter d;
	private int f;
	private int g;
	private ContentFrameLayout h;
	private v i;
	private Drawable j;
	private boolean k;
	private boolean l;
	private boolean m;
	private boolean n;
	private int o;
	private int p;
	private final Rect q;
	private final Rect r;
	private final Rect s;
	private final Rect t;
	private final Rect u;
	private final Rect v;
	private final Rect w;
	private a x;
	private final int y;
	private OverScroller z;

	static 
	{
		e = (new int[] {
			android.support.v7.a.a.a.actionBarSize, 0x1010059
		});
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:getstatic       #69  <Field int android.support.v7.a.a$a.actionBarSize>
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #70  <Int 0x1010059>
	//    9   13:iastore         
	//   10   14:putstatic       #72  <Field int[] e>
	//*  11   17:return          
	}
}
