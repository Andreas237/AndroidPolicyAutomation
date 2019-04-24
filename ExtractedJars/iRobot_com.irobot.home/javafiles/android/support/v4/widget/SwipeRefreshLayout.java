// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.support.v4.view.*;
import android.util.*;
import android.view.*;
import android.view.animation.*;
import android.widget.AbsListView;
import android.widget.ListView;

// Referenced classes of package android.support.v4.widget:
//			b, c, j

public class SwipeRefreshLayout extends ViewGroup
	implements i, l
{
	public static interface a
	{

		public abstract boolean a(SwipeRefreshLayout swiperefreshlayout, View view);
	}

	public static interface b
	{

		public abstract void a();
	}


	public SwipeRefreshLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #95  <Method void SwipeRefreshLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwipeRefreshLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #96  <Method void ViewGroup(Context, AttributeSet)>
		b = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #98  <Field boolean b>
		p = -1F;
	//    7   11:aload_0         
	//    8   12:ldc1            #99  <Float -1F>
	//    9   14:putfield        #101 <Field float p>
		t = new int[2];
	//   10   17:aload_0         
	//   11   18:iconst_2        
	//   12   19:newarray        int[]
	//   13   21:putfield        #103 <Field int[] t>
		u = new int[2];
	//   14   24:aload_0         
	//   15   25:iconst_2        
	//   16   26:newarray        int[]
	//   17   28:putfield        #105 <Field int[] u>
		A = -1;
	//   18   31:aload_0         
	//   19   32:iconst_m1       
	//   20   33:putfield        #107 <Field int A>
		E = -1;
	//   21   36:aload_0         
	//   22   37:iconst_m1       
	//   23   38:putfield        #109 <Field int E>
	//   24   41:aload_0         
	//   25   42:new             #10  <Class SwipeRefreshLayout$1>
	//   26   45:dup             
	//   27   46:aload_0         
	//   28   47:invokespecial   #112 <Method void SwipeRefreshLayout$1(SwipeRefreshLayout)>
	//   29   50:putfield        #114 <Field android.view.animation.Animation$AnimationListener M>
		N = ((Animation) (new Animation() {

			public void applyTransformation(float f1, Transformation transformation)
			{
				int j1;
				if(!a.l)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field SwipeRefreshLayout a>
			//*   2    4:getfield        #22  <Field boolean android.support.v4.widget.SwipeRefreshLayout.l>
			//*   3    7:ifne            32
					j1 = a.i - Math.abs(a.h);
			//    4   10:aload_0         
			//    5   11:getfield        #12  <Field SwipeRefreshLayout a>
			//    6   14:getfield        #26  <Field int android.support.v4.widget.SwipeRefreshLayout.i>
			//    7   17:aload_0         
			//    8   18:getfield        #12  <Field SwipeRefreshLayout a>
			//    9   21:getfield        #29  <Field int SwipeRefreshLayout.h>
			//   10   24:invokestatic    #35  <Method int Math.abs(int)>
			//   11   27:isub            
			//   12   28:istore_3        
				else
			//*  13   29:goto            40
					j1 = a.i;
			//   14   32:aload_0         
			//   15   33:getfield        #12  <Field SwipeRefreshLayout a>
			//   16   36:getfield        #26  <Field int android.support.v4.widget.SwipeRefreshLayout.i>
			//   17   39:istore_3        
				int k1 = a.f;
			//   18   40:aload_0         
			//   19   41:getfield        #12  <Field SwipeRefreshLayout a>
			//   20   44:getfield        #38  <Field int SwipeRefreshLayout.f>
			//   21   47:istore          4
				j1 = (int)((float)(j1 - a.f) * f1);
			//   22   49:iload_3         
			//   23   50:aload_0         
			//   24   51:getfield        #12  <Field SwipeRefreshLayout a>
			//   25   54:getfield        #38  <Field int SwipeRefreshLayout.f>
			//   26   57:isub            
			//   27   58:i2f             
			//   28   59:fload_1         
			//   29   60:fmul            
			//   30   61:f2i             
			//   31   62:istore_3        
				int l1 = a.e.getTop();
			//   32   63:aload_0         
			//   33   64:getfield        #12  <Field SwipeRefreshLayout a>
			//   34   67:getfield        #42  <Field b SwipeRefreshLayout.e>
			//   35   70:invokevirtual   #48  <Method int b.getTop()>
			//   36   73:istore          5
				a.setTargetOffsetTopAndBottom((k1 + j1) - l1);
			//   37   75:aload_0         
			//   38   76:getfield        #12  <Field SwipeRefreshLayout a>
			//   39   79:iload           4
			//   40   81:iload_3         
			//   41   82:iadd            
			//   42   83:iload           5
			//   43   85:isub            
			//   44   86:invokevirtual   #52  <Method void SwipeRefreshLayout.setTargetOffsetTopAndBottom(int)>
				a.j.b(1.0F - f1);
			//   45   89:aload_0         
			//   46   90:getfield        #12  <Field SwipeRefreshLayout a>
			//   47   93:getfield        #56  <Field c SwipeRefreshLayout.j>
			//   48   96:fconst_1        
			//   49   97:fload_1         
			//   50   98:fsub            
			//   51   99:invokevirtual   #62  <Method void c.b(float)>
			//   52  102:return          
			}

			final SwipeRefreshLayout a;

			
			{
				a = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field SwipeRefreshLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//   30   53:aload_0         
	//   31   54:new             #20  <Class SwipeRefreshLayout$6>
	//   32   57:dup             
	//   33   58:aload_0         
	//   34   59:invokespecial   #115 <Method void SwipeRefreshLayout$6(SwipeRefreshLayout)>
	//   35   62:putfield        #117 <Field Animation N>
		O = ((Animation) (new Animation() {

			public void applyTransformation(float f1, Transformation transformation)
			{
				a.a(f1);
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field SwipeRefreshLayout a>
			//    2    4:fload_1         
			//    3    5:invokevirtual   #21  <Method void android.support.v4.widget.SwipeRefreshLayout.a(float)>
			//    4    8:return          
			}

			final SwipeRefreshLayout a;

			
			{
				a = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field SwipeRefreshLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//   36   65:aload_0         
	//   37   66:new             #22  <Class SwipeRefreshLayout$7>
	//   38   69:dup             
	//   39   70:aload_0         
	//   40   71:invokespecial   #118 <Method void SwipeRefreshLayout$7(SwipeRefreshLayout)>
	//   41   74:putfield        #120 <Field Animation O>
		o = ViewConfiguration.get(context).getScaledTouchSlop();
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:invokestatic    #126 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   45   82:invokevirtual   #130 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   46   85:putfield        #132 <Field int o>
		w = getResources().getInteger(0x10e0001);
	//   47   88:aload_0         
	//   48   89:aload_0         
	//   49   90:invokevirtual   #136 <Method Resources getResources()>
	//   50   93:ldc1            #137 <Int 0x10e0001>
	//   51   95:invokevirtual   #143 <Method int Resources.getInteger(int)>
	//   52   98:putfield        #145 <Field int w>
		setWillNotDraw(false);
	//   53  101:aload_0         
	//   54  102:iconst_0        
	//   55  103:invokevirtual   #149 <Method void setWillNotDraw(boolean)>
		C = new DecelerateInterpolator(2.0F);
	//   56  106:aload_0         
	//   57  107:new             #151 <Class DecelerateInterpolator>
	//   58  110:dup             
	//   59  111:fconst_2        
	//   60  112:invokespecial   #154 <Method void DecelerateInterpolator(float)>
	//   61  115:putfield        #156 <Field DecelerateInterpolator C>
		DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
	//   62  118:aload_0         
	//   63  119:invokevirtual   #136 <Method Resources getResources()>
	//   64  122:invokevirtual   #160 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   65  125:astore          4
		K = (int)(displaymetrics.density * 40F);
	//   66  127:aload_0         
	//   67  128:aload           4
	//   68  130:getfield        #165 <Field float DisplayMetrics.density>
	//   69  133:ldc1            #166 <Float 40F>
	//   70  135:fmul            
	//   71  136:f2i             
	//   72  137:putfield        #168 <Field int K>
		c();
	//   73  140:aload_0         
	//   74  141:invokespecial   #170 <Method void c()>
		android.support.v4.view.s.a(((ViewGroup) (this)), true);
	//   75  144:aload_0         
	//   76  145:iconst_1        
	//   77  146:invokestatic    #175 <Method void s.a(ViewGroup, boolean)>
		i = (int)(displaymetrics.density * 64F);
	//   78  149:aload_0         
	//   79  150:aload           4
	//   80  152:getfield        #165 <Field float DisplayMetrics.density>
	//   81  155:ldc1            #176 <Float 64F>
	//   82  157:fmul            
	//   83  158:f2i             
	//   84  159:putfield        #178 <Field int i>
		p = i;
	//   85  162:aload_0         
	//   86  163:aload_0         
	//   87  164:getfield        #178 <Field int i>
	//   88  167:i2f             
	//   89  168:putfield        #101 <Field float p>
		r = new n(((ViewGroup) (this)));
	//   90  171:aload_0         
	//   91  172:new             #180 <Class n>
	//   92  175:dup             
	//   93  176:aload_0         
	//   94  177:invokespecial   #183 <Method void n(ViewGroup)>
	//   95  180:putfield        #185 <Field n r>
		s = new k(((View) (this)));
	//   96  183:aload_0         
	//   97  184:new             #187 <Class k>
	//   98  187:dup             
	//   99  188:aload_0         
	//  100  189:invokespecial   #190 <Method void k(View)>
	//  101  192:putfield        #192 <Field k s>
		setNestedScrollingEnabled(true);
	//  102  195:aload_0         
	//  103  196:iconst_1        
	//  104  197:invokevirtual   #195 <Method void setNestedScrollingEnabled(boolean)>
		int i1 = -K;
	//  105  200:aload_0         
	//  106  201:getfield        #168 <Field int K>
	//  107  204:ineg            
	//  108  205:istore_3        
		c = i1;
	//  109  206:aload_0         
	//  110  207:iload_3         
	//  111  208:putfield        #197 <Field int c>
		h = i1;
	//  112  211:aload_0         
	//  113  212:iload_3         
	//  114  213:putfield        #199 <Field int h>
		a(1.0F);
	//  115  216:aload_0         
	//  116  217:fconst_1        
	//  117  218:invokevirtual   #201 <Method void a(float)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, D)));
	//  118  221:aload_1         
	//  119  222:aload_2         
	//  120  223:getstatic       #89  <Field int[] D>
	//  121  226:invokevirtual   #207 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//  122  229:astore_1        
		setEnabled(((TypedArray) (context)).getBoolean(0, true));
	//  123  230:aload_0         
	//  124  231:aload_1         
	//  125  232:iconst_0        
	//  126  233:iconst_1        
	//  127  234:invokevirtual   #213 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  128  237:invokevirtual   #216 <Method void setEnabled(boolean)>
		((TypedArray) (context)).recycle();
	//  129  240:aload_1         
	//  130  241:invokevirtual   #219 <Method void TypedArray.recycle()>
	//  131  244:return          
	}

	private Animation a(int i1, int j1)
	{
		Animation animation = new Animation(i1, j1) {

			public void applyTransformation(float f1, Transformation transformation)
			{
				c.j.setAlpha((int)((float)a + (float)(b - a) * f1));
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field SwipeRefreshLayout c>
			//    2    4:getfield        #31  <Field c SwipeRefreshLayout.j>
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field int a>
			//    5   11:i2f             
			//    6   12:aload_0         
			//    7   13:getfield        #21  <Field int b>
			//    8   16:aload_0         
			//    9   17:getfield        #19  <Field int a>
			//   10   20:isub            
			//   11   21:i2f             
			//   12   22:fload_1         
			//   13   23:fmul            
			//   14   24:fadd            
			//   15   25:f2i             
			//   16   26:invokevirtual   #37  <Method void c.setAlpha(int)>
			//   17   29:return          
			}

			final int a;
			final int b;
			final SwipeRefreshLayout c;

			
			{
				c = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SwipeRefreshLayout c>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #19  <Field int a>
				b = j1;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #21  <Field int b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #24  <Method void Animation()>
			//   11   19:return          
			}
		}
;
	//    0    0:new             #16  <Class SwipeRefreshLayout$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #223 <Method void SwipeRefreshLayout$4(SwipeRefreshLayout, int, int)>
	//    6   10:astore_3        
		((Animation) (animation)).setDuration(300L);
	//    7   11:aload_3         
	//    8   12:ldc2w           #224 <Long 300L>
	//    9   15:invokevirtual   #231 <Method void Animation.setDuration(long)>
		e.a(((android.view.animation.Animation.AnimationListener) (null)));
	//   10   18:aload_0         
	//   11   19:getfield        #233 <Field b e>
	//   12   22:aconst_null     
	//   13   23:invokevirtual   #238 <Method void android.support.v4.widget.b.a(android.view.animation.Animation$AnimationListener)>
		e.clearAnimation();
	//   14   26:aload_0         
	//   15   27:getfield        #233 <Field b e>
	//   16   30:invokevirtual   #241 <Method void b.clearAnimation()>
		e.startAnimation(((Animation) (animation)));
	//   17   33:aload_0         
	//   18   34:getfield        #233 <Field b e>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #245 <Method void b.startAnimation(Animation)>
		return ((Animation) (animation));
	//   21   41:aload_3         
	//   22   42:areturn         
	}

	private void a(int i1, android.view.animation.Animation.AnimationListener animationlistener)
	{
		f = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #248 <Field int f>
		N.reset();
	//    3    5:aload_0         
	//    4    6:getfield        #117 <Field Animation N>
	//    5    9:invokevirtual   #251 <Method void Animation.reset()>
		N.setDuration(200L);
	//    6   12:aload_0         
	//    7   13:getfield        #117 <Field Animation N>
	//    8   16:ldc2w           #252 <Long 200L>
	//    9   19:invokevirtual   #231 <Method void Animation.setDuration(long)>
		N.setInterpolator(((android.view.animation.Interpolator) (C)));
	//   10   22:aload_0         
	//   11   23:getfield        #117 <Field Animation N>
	//   12   26:aload_0         
	//   13   27:getfield        #156 <Field DecelerateInterpolator C>
	//   14   30:invokevirtual   #257 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
		if(animationlistener != null)
	//*  15   33:aload_2         
	//*  16   34:ifnull          45
			e.a(animationlistener);
	//   17   37:aload_0         
	//   18   38:getfield        #233 <Field b e>
	//   19   41:aload_2         
	//   20   42:invokevirtual   #238 <Method void android.support.v4.widget.b.a(android.view.animation.Animation$AnimationListener)>
		e.clearAnimation();
	//   21   45:aload_0         
	//   22   46:getfield        #233 <Field b e>
	//   23   49:invokevirtual   #241 <Method void b.clearAnimation()>
		e.startAnimation(N);
	//   24   52:aload_0         
	//   25   53:getfield        #233 <Field b e>
	//   26   56:aload_0         
	//   27   57:getfield        #117 <Field Animation N>
	//   28   60:invokevirtual   #245 <Method void b.startAnimation(Animation)>
	//   29   63:return          
	}

	private void a(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #263 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i1) == A)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #266 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #107 <Field int A>
	//*   8   14:icmpne          37
		{
			if(i1 == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            26
				i1 = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:goto            28
				i1 = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
			A = motionevent.getPointerId(i1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #266 <Method int MotionEvent.getPointerId(int)>
	//   20   34:putfield        #107 <Field int A>
		}
	//   21   37:return          
	}

	private void a(boolean flag, boolean flag1)
	{
		if(b != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field boolean b>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          50
		{
			k = flag1;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #269 <Field boolean k>
			f();
	//    7   13:aload_0         
	//    8   14:invokespecial   #271 <Method void f()>
			b = flag;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #98  <Field boolean b>
			if(b)
	//*  12   22:aload_0         
	//*  13   23:getfield        #98  <Field boolean b>
	//*  14   26:ifeq            42
			{
				a(c, M);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #197 <Field int c>
	//   18   34:aload_0         
	//   19   35:getfield        #114 <Field android.view.animation.Animation$AnimationListener M>
	//   20   38:invokespecial   #273 <Method void a(int, android.view.animation.Animation$AnimationListener)>
				return;
	//   21   41:return          
			}
			a(M);
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #114 <Field android.view.animation.Animation$AnimationListener M>
	//   25   47:invokevirtual   #274 <Method void a(android.view.animation.Animation$AnimationListener)>
		}
	//   26   50:return          
	}

	private boolean a(Animation animation)
	{
		return animation != null && animation.hasStarted() && !animation.hasEnded();
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method boolean Animation.hasStarted()>
	//    4    8:ifeq            20
	//    5   11:aload_1         
	//    6   12:invokevirtual   #282 <Method boolean Animation.hasEnded()>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private void b(float f1)
	{
		j.a(true);
	//    0    0:aload_0         
	//    1    1:getfield        #284 <Field c j>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #288 <Method void android.support.v4.widget.c.a(boolean)>
		float f2 = Math.min(1.0F, Math.abs(f1 / p));
	//    4    8:fconst_1        
	//    5    9:fload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #101 <Field float p>
	//    8   14:fdiv            
	//    9   15:invokestatic    #294 <Method float Math.abs(float)>
	//   10   18:invokestatic    #298 <Method float Math.min(float, float)>
	//   11   21:fstore          4
		float f3 = ((float)Math.max((double)f2 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
	//   12   23:fload           4
	//   13   25:f2d             
	//   14   26:ldc2w           #299 <Double 0.40000000000000002D>
	//   15   29:dsub            
	//   16   30:dconst_0        
	//   17   31:invokestatic    #304 <Method double Math.max(double, double)>
	//   18   34:d2f             
	//   19   35:ldc2            #305 <Float 5F>
	//   20   38:fmul            
	//   21   39:ldc2            #306 <Float 3F>
	//   22   42:fdiv            
	//   23   43:fstore          5
		float f5 = Math.abs(f1);
	//   24   45:fload_1         
	//   25   46:invokestatic    #294 <Method float Math.abs(float)>
	//   26   49:fstore          7
		float f6 = p;
	//   27   51:aload_0         
	//   28   52:getfield        #101 <Field float p>
	//   29   55:fstore          8
		float f4;
		int i1;
		if(l)
	//*  30   57:aload_0         
	//*  31   58:getfield        #308 <Field boolean l>
	//*  32   61:ifeq            83
			i1 = i - h;
	//   33   64:aload_0         
	//   34   65:getfield        #178 <Field int i>
	//   35   68:aload_0         
	//   36   69:getfield        #199 <Field int h>
	//   37   72:isub            
	//   38   73:istore          9
		else
	//*  39   75:iload           9
	//*  40   77:i2f             
	//*  41   78:fstore          6
	//*  42   80:goto            92
			i1 = i;
	//   43   83:aload_0         
	//   44   84:getfield        #178 <Field int i>
	//   45   87:istore          9
		f4 = i1;
	//*  46   89:goto            75
		double d1 = Math.max(0.0F, Math.min(f5 - f6, f4 * 2.0F) / f4) / 4F;
	//   47   92:fconst_0        
	//   48   93:fload           7
	//   49   95:fload           8
	//   50   97:fsub            
	//   51   98:fload           6
	//   52  100:fconst_2        
	//   53  101:fmul            
	//   54  102:invokestatic    #298 <Method float Math.min(float, float)>
	//   55  105:fload           6
	//   56  107:fdiv            
	//   57  108:invokestatic    #310 <Method float Math.max(float, float)>
	//   58  111:ldc2            #311 <Float 4F>
	//   59  114:fdiv            
	//   60  115:f2d             
	//   61  116:dstore_2        
		f5 = (float)(d1 - Math.pow(d1, 2D)) * 2.0F;
	//   62  117:dload_2         
	//   63  118:dload_2         
	//   64  119:ldc2w           #312 <Double 2D>
	//   65  122:invokestatic    #316 <Method double Math.pow(double, double)>
	//   66  125:dsub            
	//   67  126:d2f             
	//   68  127:fconst_2        
	//   69  128:fmul            
	//   70  129:fstore          7
		i1 = h;
	//   71  131:aload_0         
	//   72  132:getfield        #199 <Field int h>
	//   73  135:istore          9
		int j1 = (int)(f4 * f2 + f4 * f5 * 2.0F);
	//   74  137:fload           6
	//   75  139:fload           4
	//   76  141:fmul            
	//   77  142:fload           6
	//   78  144:fload           7
	//   79  146:fmul            
	//   80  147:fconst_2        
	//   81  148:fmul            
	//   82  149:fadd            
	//   83  150:f2i             
	//   84  151:istore          10
		if(e.getVisibility() != 0)
	//*  85  153:aload_0         
	//*  86  154:getfield        #233 <Field b e>
	//*  87  157:invokevirtual   #319 <Method int b.getVisibility()>
	//*  88  160:ifeq            171
			e.setVisibility(0);
	//   89  163:aload_0         
	//   90  164:getfield        #233 <Field b e>
	//   91  167:iconst_0        
	//   92  168:invokevirtual   #323 <Method void b.setVisibility(int)>
		if(!d)
	//*  93  171:aload_0         
	//*  94  172:getfield        #325 <Field boolean d>
	//*  95  175:ifne            194
		{
			e.setScaleX(1.0F);
	//   96  178:aload_0         
	//   97  179:getfield        #233 <Field b e>
	//   98  182:fconst_1        
	//   99  183:invokevirtual   #328 <Method void b.setScaleX(float)>
			e.setScaleY(1.0F);
	//  100  186:aload_0         
	//  101  187:getfield        #233 <Field b e>
	//  102  190:fconst_1        
	//  103  191:invokevirtual   #331 <Method void b.setScaleY(float)>
		}
		if(d)
	//* 104  194:aload_0         
	//* 105  195:getfield        #325 <Field boolean d>
	//* 106  198:ifeq            215
			setAnimationProgress(Math.min(1.0F, f1 / p));
	//  107  201:aload_0         
	//  108  202:fconst_1        
	//  109  203:fload_1         
	//  110  204:aload_0         
	//  111  205:getfield        #101 <Field float p>
	//  112  208:fdiv            
	//  113  209:invokestatic    #298 <Method float Math.min(float, float)>
	//  114  212:invokevirtual   #334 <Method void setAnimationProgress(float)>
		if(f1 < p)
	//* 115  215:fload_1         
	//* 116  216:aload_0         
	//* 117  217:getfield        #101 <Field float p>
	//* 118  220:fcmpg           
	//* 119  221:ifge            254
		{
			if(j.getAlpha() > 76 && !a(H))
	//* 120  224:aload_0         
	//* 121  225:getfield        #284 <Field c j>
	//* 122  228:invokevirtual   #337 <Method int c.getAlpha()>
	//* 123  231:bipush          76
	//* 124  233:icmple          282
	//* 125  236:aload_0         
	//* 126  237:aload_0         
	//* 127  238:getfield        #339 <Field Animation H>
	//* 128  241:invokespecial   #341 <Method boolean a(Animation)>
	//* 129  244:ifne            282
				d();
	//  130  247:aload_0         
	//  131  248:invokespecial   #343 <Method void d()>
		} else
	//* 132  251:goto            282
		if(j.getAlpha() < 255 && !a(I))
	//* 133  254:aload_0         
	//* 134  255:getfield        #284 <Field c j>
	//* 135  258:invokevirtual   #337 <Method int c.getAlpha()>
	//* 136  261:sipush          255
	//* 137  264:icmpge          282
	//* 138  267:aload_0         
	//* 139  268:aload_0         
	//* 140  269:getfield        #345 <Field Animation I>
	//* 141  272:invokespecial   #341 <Method boolean a(Animation)>
	//* 142  275:ifne            282
			e();
	//  143  278:aload_0         
	//  144  279:invokespecial   #347 <Method void e()>
		j.a(0.0F, Math.min(0.8F, f3 * 0.8F));
	//  145  282:aload_0         
	//  146  283:getfield        #284 <Field c j>
	//  147  286:fconst_0        
	//  148  287:ldc2            #348 <Float 0.8F>
	//  149  290:fload           5
	//  150  292:ldc2            #348 <Float 0.8F>
	//  151  295:fmul            
	//  152  296:invokestatic    #298 <Method float Math.min(float, float)>
	//  153  299:invokevirtual   #351 <Method void android.support.v4.widget.c.a(float, float)>
		j.b(Math.min(1.0F, f3));
	//  154  302:aload_0         
	//  155  303:getfield        #284 <Field c j>
	//  156  306:fconst_1        
	//  157  307:fload           5
	//  158  309:invokestatic    #298 <Method float Math.min(float, float)>
	//  159  312:invokevirtual   #353 <Method void c.b(float)>
		j.c(((f3 * 0.4F - 0.25F) + f5 * 2.0F) * 0.5F);
	//  160  315:aload_0         
	//  161  316:getfield        #284 <Field c j>
	//  162  319:fload           5
	//  163  321:ldc2            #354 <Float 0.4F>
	//  164  324:fmul            
	//  165  325:ldc2            #355 <Float 0.25F>
	//  166  328:fsub            
	//  167  329:fload           7
	//  168  331:fconst_2        
	//  169  332:fmul            
	//  170  333:fadd            
	//  171  334:ldc2            #356 <Float 0.5F>
	//  172  337:fmul            
	//  173  338:invokevirtual   #358 <Method void c.c(float)>
		setTargetOffsetTopAndBottom((i1 + j1) - c);
	//  174  341:aload_0         
	//  175  342:iload           9
	//  176  344:iload           10
	//  177  346:iadd            
	//  178  347:aload_0         
	//  179  348:getfield        #197 <Field int c>
	//  180  351:isub            
	//  181  352:invokevirtual   #361 <Method void setTargetOffsetTopAndBottom(int)>
	//  182  355:return          
	}

	private void b(int i1, android.view.animation.Animation.AnimationListener animationlistener)
	{
		if(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #325 <Field boolean d>
	//*   2    4:ifeq            14
		{
			c(i1, animationlistener);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #363 <Method void c(int, android.view.animation.Animation$AnimationListener)>
			return;
	//    7   13:return          
		}
		f = i1;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #248 <Field int f>
		O.reset();
	//   11   19:aload_0         
	//   12   20:getfield        #120 <Field Animation O>
	//   13   23:invokevirtual   #251 <Method void Animation.reset()>
		O.setDuration(200L);
	//   14   26:aload_0         
	//   15   27:getfield        #120 <Field Animation O>
	//   16   30:ldc2w           #252 <Long 200L>
	//   17   33:invokevirtual   #231 <Method void Animation.setDuration(long)>
		O.setInterpolator(((android.view.animation.Interpolator) (C)));
	//   18   36:aload_0         
	//   19   37:getfield        #120 <Field Animation O>
	//   20   40:aload_0         
	//   21   41:getfield        #156 <Field DecelerateInterpolator C>
	//   22   44:invokevirtual   #257 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
		if(animationlistener != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          59
			e.a(animationlistener);
	//   25   51:aload_0         
	//   26   52:getfield        #233 <Field b e>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #238 <Method void android.support.v4.widget.b.a(android.view.animation.Animation$AnimationListener)>
		e.clearAnimation();
	//   29   59:aload_0         
	//   30   60:getfield        #233 <Field b e>
	//   31   63:invokevirtual   #241 <Method void b.clearAnimation()>
		e.startAnimation(O);
	//   32   66:aload_0         
	//   33   67:getfield        #233 <Field b e>
	//   34   70:aload_0         
	//   35   71:getfield        #120 <Field Animation O>
	//   36   74:invokevirtual   #245 <Method void b.startAnimation(Animation)>
	//   37   77:return          
	}

	private void b(android.view.animation.Animation.AnimationListener animationlistener)
	{
		e.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field b e>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #323 <Method void b.setVisibility(int)>
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   4    8:getstatic       #368 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          11
	//*   6   13:icmplt          26
			j.setAlpha(255);
	//    7   16:aload_0         
	//    8   17:getfield        #284 <Field c j>
	//    9   20:sipush          255
	//   10   23:invokevirtual   #371 <Method void c.setAlpha(int)>
		F = ((Animation) (new Animation() {

			public void applyTransformation(float f1, Transformation transformation)
			{
				a.setAnimationProgress(f1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SwipeRefreshLayout a>
			//    2    4:fload_1         
			//    3    5:invokevirtual   #25  <Method void SwipeRefreshLayout.setAnimationProgress(float)>
			//    4    8:return          
			}

			final SwipeRefreshLayout a;

			
			{
				a = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SwipeRefreshLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//   11   26:aload_0         
	//   12   27:new             #12  <Class SwipeRefreshLayout$2>
	//   13   30:dup             
	//   14   31:aload_0         
	//   15   32:invokespecial   #372 <Method void SwipeRefreshLayout$2(SwipeRefreshLayout)>
	//   16   35:putfield        #374 <Field Animation F>
		F.setDuration(w);
	//   17   38:aload_0         
	//   18   39:getfield        #374 <Field Animation F>
	//   19   42:aload_0         
	//   20   43:getfield        #145 <Field int w>
	//   21   46:i2l             
	//   22   47:invokevirtual   #231 <Method void Animation.setDuration(long)>
		if(animationlistener != null)
	//*  23   50:aload_1         
	//*  24   51:ifnull          62
			e.a(animationlistener);
	//   25   54:aload_0         
	//   26   55:getfield        #233 <Field b e>
	//   27   58:aload_1         
	//   28   59:invokevirtual   #238 <Method void android.support.v4.widget.b.a(android.view.animation.Animation$AnimationListener)>
		e.clearAnimation();
	//   29   62:aload_0         
	//   30   63:getfield        #233 <Field b e>
	//   31   66:invokevirtual   #241 <Method void b.clearAnimation()>
		e.startAnimation(F);
	//   32   69:aload_0         
	//   33   70:getfield        #233 <Field b e>
	//   34   73:aload_0         
	//   35   74:getfield        #374 <Field Animation F>
	//   36   77:invokevirtual   #245 <Method void b.startAnimation(Animation)>
	//   37   80:return          
	}

	private void c()
	{
		e = new android.support.v4.widget.b(getContext(), 0xfffafafa);
	//    0    0:aload_0         
	//    1    1:new             #235 <Class b>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #378 <Method Context getContext()>
	//    5    9:ldc2            #379 <Int 0xfffafafa>
	//    6   12:invokespecial   #382 <Method void b(Context, int)>
	//    7   15:putfield        #233 <Field b e>
		j = new c(getContext());
	//    8   18:aload_0         
	//    9   19:new             #286 <Class c>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokevirtual   #378 <Method Context getContext()>
	//   13   27:invokespecial   #384 <Method void c(Context)>
	//   14   30:putfield        #284 <Field c j>
		j.a(1);
	//   15   33:aload_0         
	//   16   34:getfield        #284 <Field c j>
	//   17   37:iconst_1        
	//   18   38:invokevirtual   #386 <Method void android.support.v4.widget.c.a(int)>
		e.setImageDrawable(((Drawable) (j)));
	//   19   41:aload_0         
	//   20   42:getfield        #233 <Field b e>
	//   21   45:aload_0         
	//   22   46:getfield        #284 <Field c j>
	//   23   49:invokevirtual   #390 <Method void b.setImageDrawable(Drawable)>
		e.setVisibility(8);
	//   24   52:aload_0         
	//   25   53:getfield        #233 <Field b e>
	//   26   56:bipush          8
	//   27   58:invokevirtual   #323 <Method void b.setVisibility(int)>
		addView(((View) (e)));
	//   28   61:aload_0         
	//   29   62:aload_0         
	//   30   63:getfield        #233 <Field b e>
	//   31   66:invokevirtual   #393 <Method void addView(View)>
	//   32   69:return          
	}

	private void c(float f1)
	{
		if(f1 > p)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #101 <Field float p>
	//*   3    5:fcmpl           
	//*   4    6:ifle            16
		{
			a(true, true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:iconst_1        
	//    8   12:invokespecial   #395 <Method void a(boolean, boolean)>
			return;
	//    9   15:return          
		}
		b = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #98  <Field boolean b>
		j.a(0.0F, 0.0F);
	//   13   21:aload_0         
	//   14   22:getfield        #284 <Field c j>
	//   15   25:fconst_0        
	//   16   26:fconst_0        
	//   17   27:invokevirtual   #351 <Method void android.support.v4.widget.c.a(float, float)>
		android.view.animation.Animation.AnimationListener animationlistener = null;
	//   18   30:aconst_null     
	//   19   31:astore_2        
		if(!d)
	//*  20   32:aload_0         
	//*  21   33:getfield        #325 <Field boolean d>
	//*  22   36:ifne            48
			animationlistener = new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
					if(!a.d)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field SwipeRefreshLayout a>
				//*   2    4:getfield        #27  <Field boolean SwipeRefreshLayout.d>
				//*   3    7:ifne            18
						a.a(((android.view.animation.Animation.AnimationListener) (null)));
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field SwipeRefreshLayout a>
				//    6   14:aconst_null     
				//    7   15:invokevirtual   #30  <Method void android.support.v4.widget.SwipeRefreshLayout.a(android.view.animation.Animation$AnimationListener)>
				//    8   18:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
				//    0    0:return          
				}

				final SwipeRefreshLayout a;

			
			{
				a = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SwipeRefreshLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   23   39:new             #18  <Class SwipeRefreshLayout$5>
	//   24   42:dup             
	//   25   43:aload_0         
	//   26   44:invokespecial   #396 <Method void SwipeRefreshLayout$5(SwipeRefreshLayout)>
	//   27   47:astore_2        
		b(c, animationlistener);
	//   28   48:aload_0         
	//   29   49:aload_0         
	//   30   50:getfield        #197 <Field int c>
	//   31   53:aload_2         
	//   32   54:invokespecial   #398 <Method void b(int, android.view.animation.Animation$AnimationListener)>
		j.a(false);
	//   33   57:aload_0         
	//   34   58:getfield        #284 <Field c j>
	//   35   61:iconst_0        
	//   36   62:invokevirtual   #288 <Method void android.support.v4.widget.c.a(boolean)>
	//   37   65:return          
	}

	private void c(int i1, android.view.animation.Animation.AnimationListener animationlistener)
	{
		f = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #248 <Field int f>
		g = e.getScaleX();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #233 <Field b e>
	//    6   10:invokevirtual   #402 <Method float b.getScaleX()>
	//    7   13:putfield        #404 <Field float g>
		J = ((Animation) (new Animation() {

			public void applyTransformation(float f1, Transformation transformation)
			{
				float f2 = a.g;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SwipeRefreshLayout a>
			//    2    4:getfield        #25  <Field float SwipeRefreshLayout.g>
			//    3    7:fstore_3        
				float f3 = -a.g;
			//    4    8:aload_0         
			//    5    9:getfield        #15  <Field SwipeRefreshLayout a>
			//    6   12:getfield        #25  <Field float SwipeRefreshLayout.g>
			//    7   15:fneg            
			//    8   16:fstore          4
				a.setAnimationProgress(f2 + f3 * f1);
			//    9   18:aload_0         
			//   10   19:getfield        #15  <Field SwipeRefreshLayout a>
			//   11   22:fload_3         
			//   12   23:fload           4
			//   13   25:fload_1         
			//   14   26:fmul            
			//   15   27:fadd            
			//   16   28:invokevirtual   #29  <Method void SwipeRefreshLayout.setAnimationProgress(float)>
				a.a(f1);
			//   17   31:aload_0         
			//   18   32:getfield        #15  <Field SwipeRefreshLayout a>
			//   19   35:fload_1         
			//   20   36:invokevirtual   #31  <Method void android.support.v4.widget.SwipeRefreshLayout.a(float)>
			//   21   39:return          
			}

			final SwipeRefreshLayout a;

			
			{
				a = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SwipeRefreshLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//    8   16:aload_0         
	//    9   17:new             #24  <Class SwipeRefreshLayout$8>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #405 <Method void SwipeRefreshLayout$8(SwipeRefreshLayout)>
	//   13   25:putfield        #407 <Field Animation J>
		J.setDuration(150L);
	//   14   28:aload_0         
	//   15   29:getfield        #407 <Field Animation J>
	//   16   32:ldc2w           #408 <Long 150L>
	//   17   35:invokevirtual   #231 <Method void Animation.setDuration(long)>
		if(animationlistener != null)
	//*  18   38:aload_2         
	//*  19   39:ifnull          50
			e.a(animationlistener);
	//   20   42:aload_0         
	//   21   43:getfield        #233 <Field b e>
	//   22   46:aload_2         
	//   23   47:invokevirtual   #238 <Method void android.support.v4.widget.b.a(android.view.animation.Animation$AnimationListener)>
		e.clearAnimation();
	//   24   50:aload_0         
	//   25   51:getfield        #233 <Field b e>
	//   26   54:invokevirtual   #241 <Method void b.clearAnimation()>
		e.startAnimation(J);
	//   27   57:aload_0         
	//   28   58:getfield        #233 <Field b e>
	//   29   61:aload_0         
	//   30   62:getfield        #407 <Field Animation J>
	//   31   65:invokevirtual   #245 <Method void b.startAnimation(Animation)>
	//   32   68:return          
	}

	private void d()
	{
		H = a(j.getAlpha(), 76);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #284 <Field c j>
	//    4    6:invokevirtual   #337 <Method int c.getAlpha()>
	//    5    9:bipush          76
	//    6   11:invokespecial   #411 <Method Animation a(int, int)>
	//    7   14:putfield        #339 <Field Animation H>
	//    8   17:return          
	}

	private void d(float f1)
	{
		if(f1 - y > (float)o && !z)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #413 <Field float y>
	//*   3    5:fsub            
	//*   4    6:aload_0         
	//*   5    7:getfield        #132 <Field int o>
	//*   6   10:i2f             
	//*   7   11:fcmpl           
	//*   8   12:ifle            50
	//*   9   15:aload_0         
	//*  10   16:getfield        #415 <Field boolean z>
	//*  11   19:ifne            50
		{
			x = y + (float)o;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #413 <Field float y>
	//   15   27:aload_0         
	//   16   28:getfield        #132 <Field int o>
	//   17   31:i2f             
	//   18   32:fadd            
	//   19   33:putfield        #417 <Field float x>
			z = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #415 <Field boolean z>
			j.setAlpha(76);
	//   23   41:aload_0         
	//   24   42:getfield        #284 <Field c j>
	//   25   45:bipush          76
	//   26   47:invokevirtual   #371 <Method void c.setAlpha(int)>
		}
	//   27   50:return          
	}

	private void e()
	{
		I = a(j.getAlpha(), 255);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #284 <Field c j>
	//    4    6:invokevirtual   #337 <Method int c.getAlpha()>
	//    5    9:sipush          255
	//    6   12:invokespecial   #411 <Method Animation a(int, int)>
	//    7   15:putfield        #345 <Field Animation I>
	//    8   18:return          
	}

	private void f()
	{
		if(n == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #419 <Field View n>
	//*   2    4:ifnonnull       47
		{
			for(int i1 = 0; i1 < getChildCount(); i1++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #422 <Method int getChildCount()>
	//*   8   14:icmpge          47
			{
				View view = getChildAt(i1);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #426 <Method View getChildAt(int)>
	//   12   22:astore_2        
				if(!((Object) (view)).equals(((Object) (e))))
	//*  13   23:aload_2         
	//*  14   24:aload_0         
	//*  15   25:getfield        #233 <Field b e>
	//*  16   28:invokevirtual   #432 <Method boolean Object.equals(Object)>
	//*  17   31:ifne            40
				{
					n = view;
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #419 <Field View n>
					return;
	//   21   39:return          
				}
			}

	//   22   40:iload_1         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_1        
		}
	//*  26   44:goto            9
	//   27   47:return          
	}

	private void setColorViewAlpha(int i1)
	{
		e.getBackground().setAlpha(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field b e>
	//    2    4:invokevirtual   #437 <Method Drawable b.getBackground()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #440 <Method void Drawable.setAlpha(int)>
		j.setAlpha(i1);
	//    5   11:aload_0         
	//    6   12:getfield        #284 <Field c j>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #371 <Method void c.setAlpha(int)>
	//    9   19:return          
	}

	void a()
	{
		e.clearAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field b e>
	//    2    4:invokevirtual   #241 <Method void b.clearAnimation()>
		j.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #284 <Field c j>
	//    5   11:invokevirtual   #443 <Method void c.stop()>
		e.setVisibility(8);
	//    6   14:aload_0         
	//    7   15:getfield        #233 <Field b e>
	//    8   18:bipush          8
	//    9   20:invokevirtual   #323 <Method void b.setVisibility(int)>
		setColorViewAlpha(255);
	//   10   23:aload_0         
	//   11   24:sipush          255
	//   12   27:invokespecial   #445 <Method void setColorViewAlpha(int)>
		if(d)
	//*  13   30:aload_0         
	//*  14   31:getfield        #325 <Field boolean d>
	//*  15   34:ifeq            45
			setAnimationProgress(0.0F);
	//   16   37:aload_0         
	//   17   38:fconst_0        
	//   18   39:invokevirtual   #334 <Method void setAnimationProgress(float)>
		else
	//*  19   42:goto            58
			setTargetOffsetTopAndBottom(h - c);
	//   20   45:aload_0         
	//   21   46:aload_0         
	//   22   47:getfield        #199 <Field int h>
	//   23   50:aload_0         
	//   24   51:getfield        #197 <Field int c>
	//   25   54:isub            
	//   26   55:invokevirtual   #361 <Method void setTargetOffsetTopAndBottom(int)>
		c = e.getTop();
	//   27   58:aload_0         
	//   28   59:aload_0         
	//   29   60:getfield        #233 <Field b e>
	//   30   63:invokevirtual   #448 <Method int b.getTop()>
	//   31   66:putfield        #197 <Field int c>
	//   32   69:return          
	}

	void a(float f1)
	{
		setTargetOffsetTopAndBottom((f + (int)((float)(h - f) * f1)) - e.getTop());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #248 <Field int f>
	//    3    5:aload_0         
	//    4    6:getfield        #199 <Field int h>
	//    5    9:aload_0         
	//    6   10:getfield        #248 <Field int f>
	//    7   13:isub            
	//    8   14:i2f             
	//    9   15:fload_1         
	//   10   16:fmul            
	//   11   17:f2i             
	//   12   18:iadd            
	//   13   19:aload_0         
	//   14   20:getfield        #233 <Field b e>
	//   15   23:invokevirtual   #448 <Method int b.getTop()>
	//   16   26:isub            
	//   17   27:invokevirtual   #361 <Method void setTargetOffsetTopAndBottom(int)>
	//   18   30:return          
	}

	void a(android.view.animation.Animation.AnimationListener animationlistener)
	{
		G = ((Animation) (new Animation() {

			public void applyTransformation(float f1, Transformation transformation)
			{
				a.setAnimationProgress(1.0F - f1);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field SwipeRefreshLayout a>
			//    2    4:fconst_1        
			//    3    5:fload_1         
			//    4    6:fsub            
			//    5    7:invokevirtual   #24  <Method void SwipeRefreshLayout.setAnimationProgress(float)>
			//    6   10:return          
			}

			final SwipeRefreshLayout a;

			
			{
				a = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SwipeRefreshLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//    0    0:aload_0         
	//    1    1:new             #14  <Class SwipeRefreshLayout$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #449 <Method void SwipeRefreshLayout$3(SwipeRefreshLayout)>
	//    5    9:putfield        #451 <Field Animation G>
		G.setDuration(150L);
	//    6   12:aload_0         
	//    7   13:getfield        #451 <Field Animation G>
	//    8   16:ldc2w           #408 <Long 150L>
	//    9   19:invokevirtual   #231 <Method void Animation.setDuration(long)>
		e.a(animationlistener);
	//   10   22:aload_0         
	//   11   23:getfield        #233 <Field b e>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #238 <Method void android.support.v4.widget.b.a(android.view.animation.Animation$AnimationListener)>
		e.clearAnimation();
	//   14   30:aload_0         
	//   15   31:getfield        #233 <Field b e>
	//   16   34:invokevirtual   #241 <Method void b.clearAnimation()>
		e.startAnimation(G);
	//   17   37:aload_0         
	//   18   38:getfield        #233 <Field b e>
	//   19   41:aload_0         
	//   20   42:getfield        #451 <Field Animation G>
	//   21   45:invokevirtual   #245 <Method void b.startAnimation(Animation)>
	//   22   48:return          
	}

	public boolean b()
	{
		if(L != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #453 <Field SwipeRefreshLayout$a L>
	//*   2    4:ifnull          22
			return L.a(this, n);
	//    3    7:aload_0         
	//    4    8:getfield        #453 <Field SwipeRefreshLayout$a L>
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #419 <Field View n>
	//    8   16:invokeinterface #456 <Method boolean android.support.v4.widget.SwipeRefreshLayout$a.a(SwipeRefreshLayout, View)>
	//    9   21:ireturn         
		if(n instanceof ListView)
	//*  10   22:aload_0         
	//*  11   23:getfield        #419 <Field View n>
	//*  12   26:instanceof      #458 <Class ListView>
	//*  13   29:ifeq            44
			return android.support.v4.widget.j.b((ListView)n, -1);
	//   14   32:aload_0         
	//   15   33:getfield        #419 <Field View n>
	//   16   36:checkcast       #458 <Class ListView>
	//   17   39:iconst_m1       
	//   18   40:invokestatic    #463 <Method boolean j.b(ListView, int)>
	//   19   43:ireturn         
		else
			return n.canScrollVertically(-1);
	//   20   44:aload_0         
	//   21   45:getfield        #419 <Field View n>
	//   22   48:iconst_m1       
	//   23   49:invokevirtual   #469 <Method boolean View.canScrollVertically(int)>
	//   24   52:ireturn         
	}

	public boolean dispatchNestedFling(float f1, float f2, boolean flag)
	{
		return s.a(f1, f2, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field k s>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #473 <Method boolean k.a(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f1, float f2)
	{
		return s.a(f1, f2);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field k s>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #477 <Method boolean k.a(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i1, int j1, int ai[], int ai1[])
	{
		return s.a(i1, j1, ai, ai1);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field k s>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #481 <Method boolean k.a(int, int, int[], int[])>
	//    7   12:ireturn         
	}

	public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai[])
	{
		return s.a(i1, j1, k1, l1, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field k s>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #485 <Method boolean k.a(int, int, int, int, int[])>
	//    8   14:ireturn         
	}

	protected int getChildDrawingOrder(int i1, int j1)
	{
		if(E < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field int E>
	//*   2    4:ifge            9
			return j1;
	//    3    7:iload_2         
	//    4    8:ireturn         
		if(j1 == i1 - 1)
	//*   5    9:iload_2         
	//*   6   10:iload_1         
	//*   7   11:iconst_1        
	//*   8   12:isub            
	//*   9   13:icmpne          21
			return E;
	//   10   16:aload_0         
	//   11   17:getfield        #109 <Field int E>
	//   12   20:ireturn         
		i1 = j1;
	//   13   21:iload_2         
	//   14   22:istore_1        
		if(j1 >= E)
	//*  15   23:iload_2         
	//*  16   24:aload_0         
	//*  17   25:getfield        #109 <Field int E>
	//*  18   28:icmplt          35
			i1 = j1 + 1;
	//   19   31:iload_2         
	//   20   32:iconst_1        
	//   21   33:iadd            
	//   22   34:istore_1        
		return i1;
	//   23   35:iload_1         
	//   24   36:ireturn         
	}

	public int getNestedScrollAxes()
	{
		return r.a();
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field n r>
	//    2    4:invokevirtual   #490 <Method int n.a()>
	//    3    7:ireturn         
	}

	public int getProgressCircleDiameter()
	{
		return K;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field int K>
	//    2    4:ireturn         
	}

	public int getProgressViewEndOffset()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #178 <Field int i>
	//    2    4:ireturn         
	}

	public int getProgressViewStartOffset()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field int h>
	//    2    4:ireturn         
	}

	public boolean hasNestedScrollingParent()
	{
		return s.b();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field k s>
	//    2    4:invokevirtual   #496 <Method boolean k.b()>
	//    3    7:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return s.a();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field k s>
	//    2    4:invokevirtual   #499 <Method boolean k.a()>
	//    3    7:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #502 <Method void ViewGroup.onDetachedFromWindow()>
		a();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #504 <Method void a()>
	//    4    8:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #271 <Method void f()>
		int i1 = motionevent.getActionMasked();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #509 <Method int MotionEvent.getActionMasked()>
	//    4    8:istore_2        
		if(B && i1 == 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #511 <Field boolean B>
	//*   7   13:ifeq            25
	//*   8   16:iload_2         
	//*   9   17:ifne            25
			B = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #511 <Field boolean B>
		if(isEnabled() && !B && !b() && !b)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #514 <Method boolean isEnabled()>
	//*  15   29:ifeq            230
	//*  16   32:aload_0         
	//*  17   33:getfield        #511 <Field boolean B>
	//*  18   36:ifne            230
	//*  19   39:aload_0         
	//*  20   40:invokevirtual   #515 <Method boolean b()>
	//*  21   43:ifne            230
	//*  22   46:aload_0         
	//*  23   47:getfield        #98  <Field boolean b>
	//*  24   50:ifne            230
		{
			if(v)
	//*  25   53:aload_0         
	//*  26   54:getfield        #517 <Field boolean v>
	//*  27   57:ifeq            62
				return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
			if(i1 != 6)
	//*  30   62:iload_2         
	//*  31   63:bipush          6
	//*  32   65:icmpeq          220
				switch(i1)
	//*  33   68:iload_2         
				{
	//*  34   69:tableswitch     0 3: default 100
	//	               0 163
	//	               1 150
	//	               2 103
	//	               3 150
	//*  35  100:goto            225
				case 2: // '\002'
					if(A == -1)
	//*  36  103:aload_0         
	//*  37  104:getfield        #107 <Field int A>
	//*  38  107:iconst_m1       
	//*  39  108:icmpne          123
					{
						Log.e(m, "Got ACTION_MOVE event but don't have an active pointer id.");
	//   40  111:getstatic       #519 <Field String m>
	//   41  114:ldc2            #521 <String "Got ACTION_MOVE event but don't have an active pointer id.">
	//   42  117:invokestatic    #526 <Method int Log.e(String, String)>
	//   43  120:pop             
						return false;
	//   44  121:iconst_0        
	//   45  122:ireturn         
					}
					int j1 = motionevent.findPointerIndex(A);
	//   46  123:aload_1         
	//   47  124:aload_0         
	//   48  125:getfield        #107 <Field int A>
	//   49  128:invokevirtual   #529 <Method int MotionEvent.findPointerIndex(int)>
	//   50  131:istore_2        
					if(j1 < 0)
	//*  51  132:iload_2         
	//*  52  133:ifge            138
						return false;
	//   53  136:iconst_0        
	//   54  137:ireturn         
					d(motionevent.getY(j1));
	//   55  138:aload_0         
	//   56  139:aload_1         
	//   57  140:iload_2         
	//   58  141:invokevirtual   #533 <Method float MotionEvent.getY(int)>
	//   59  144:invokespecial   #535 <Method void d(float)>
					break;

	//*  60  147:goto            225
				case 1: // '\001'
				case 3: // '\003'
					z = false;
	//   61  150:aload_0         
	//   62  151:iconst_0        
	//   63  152:putfield        #415 <Field boolean z>
					A = -1;
	//   64  155:aload_0         
	//   65  156:iconst_m1       
	//   66  157:putfield        #107 <Field int A>
					break;

	//*  67  160:goto            225
				case 0: // '\0'
					setTargetOffsetTopAndBottom(h - e.getTop());
	//   68  163:aload_0         
	//   69  164:aload_0         
	//   70  165:getfield        #199 <Field int h>
	//   71  168:aload_0         
	//   72  169:getfield        #233 <Field b e>
	//   73  172:invokevirtual   #448 <Method int b.getTop()>
	//   74  175:isub            
	//   75  176:invokevirtual   #361 <Method void setTargetOffsetTopAndBottom(int)>
					A = motionevent.getPointerId(0);
	//   76  179:aload_0         
	//   77  180:aload_1         
	//   78  181:iconst_0        
	//   79  182:invokevirtual   #266 <Method int MotionEvent.getPointerId(int)>
	//   80  185:putfield        #107 <Field int A>
					z = false;
	//   81  188:aload_0         
	//   82  189:iconst_0        
	//   83  190:putfield        #415 <Field boolean z>
					int k1 = motionevent.findPointerIndex(A);
	//   84  193:aload_1         
	//   85  194:aload_0         
	//   86  195:getfield        #107 <Field int A>
	//   87  198:invokevirtual   #529 <Method int MotionEvent.findPointerIndex(int)>
	//   88  201:istore_2        
					if(k1 < 0)
	//*  89  202:iload_2         
	//*  90  203:ifge            208
						return false;
	//   91  206:iconst_0        
	//   92  207:ireturn         
					y = motionevent.getY(k1);
	//   93  208:aload_0         
	//   94  209:aload_1         
	//   95  210:iload_2         
	//   96  211:invokevirtual   #533 <Method float MotionEvent.getY(int)>
	//   97  214:putfield        #413 <Field float y>
					break;
				}
			else
	//*  98  217:goto            225
				a(motionevent);
	//   99  220:aload_0         
	//  100  221:aload_1         
	//  101  222:invokespecial   #537 <Method void a(MotionEvent)>
			return z;
	//  102  225:aload_0         
	//  103  226:getfield        #415 <Field boolean z>
	//  104  229:ireturn         
		} else
		{
			return false;
	//  105  230:iconst_0        
	//  106  231:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		i1 = getMeasuredWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #542 <Method int getMeasuredWidth()>
	//    2    4:istore_2        
		j1 = getMeasuredHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #545 <Method int getMeasuredHeight()>
	//    5    9:istore_3        
		if(getChildCount() == 0)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #422 <Method int getChildCount()>
	//*   8   14:ifne            18
			return;
	//    9   17:return          
		if(n == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #419 <Field View n>
	//*  12   22:ifnonnull       29
			f();
	//   13   25:aload_0         
	//   14   26:invokespecial   #271 <Method void f()>
		if(n == null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #419 <Field View n>
	//*  17   33:ifnonnull       37
		{
			return;
	//   18   36:return          
		} else
		{
			Object obj = ((Object) (n));
	//   19   37:aload_0         
	//   20   38:getfield        #419 <Field View n>
	//   21   41:astore          6
			k1 = getPaddingLeft();
	//   22   43:aload_0         
	//   23   44:invokevirtual   #548 <Method int getPaddingLeft()>
	//   24   47:istore          4
			l1 = getPaddingTop();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #551 <Method int getPaddingTop()>
	//   27   53:istore          5
			((View) (obj)).layout(k1, l1, (i1 - getPaddingLeft() - getPaddingRight()) + k1, (j1 - getPaddingTop() - getPaddingBottom()) + l1);
	//   28   55:aload           6
	//   29   57:iload           4
	//   30   59:iload           5
	//   31   61:iload_2         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #548 <Method int getPaddingLeft()>
	//   34   66:isub            
	//   35   67:aload_0         
	//   36   68:invokevirtual   #554 <Method int getPaddingRight()>
	//   37   71:isub            
	//   38   72:iload           4
	//   39   74:iadd            
	//   40   75:iload_3         
	//   41   76:aload_0         
	//   42   77:invokevirtual   #551 <Method int getPaddingTop()>
	//   43   80:isub            
	//   44   81:aload_0         
	//   45   82:invokevirtual   #557 <Method int getPaddingBottom()>
	//   46   85:isub            
	//   47   86:iload           5
	//   48   88:iadd            
	//   49   89:invokevirtual   #561 <Method void View.layout(int, int, int, int)>
			k1 = e.getMeasuredWidth();
	//   50   92:aload_0         
	//   51   93:getfield        #233 <Field b e>
	//   52   96:invokevirtual   #562 <Method int b.getMeasuredWidth()>
	//   53   99:istore          4
			j1 = e.getMeasuredHeight();
	//   54  101:aload_0         
	//   55  102:getfield        #233 <Field b e>
	//   56  105:invokevirtual   #563 <Method int b.getMeasuredHeight()>
	//   57  108:istore_3        
			obj = ((Object) (e));
	//   58  109:aload_0         
	//   59  110:getfield        #233 <Field b e>
	//   60  113:astore          6
			i1 /= 2;
	//   61  115:iload_2         
	//   62  116:iconst_2        
	//   63  117:idiv            
	//   64  118:istore_2        
			k1 /= 2;
	//   65  119:iload           4
	//   66  121:iconst_2        
	//   67  122:idiv            
	//   68  123:istore          4
			((android.support.v4.widget.b) (obj)).layout(i1 - k1, c, i1 + k1, c + j1);
	//   69  125:aload           6
	//   70  127:iload_2         
	//   71  128:iload           4
	//   72  130:isub            
	//   73  131:aload_0         
	//   74  132:getfield        #197 <Field int c>
	//   75  135:iload_2         
	//   76  136:iload           4
	//   77  138:iadd            
	//   78  139:aload_0         
	//   79  140:getfield        #197 <Field int c>
	//   80  143:iload_3         
	//   81  144:iadd            
	//   82  145:invokevirtual   #564 <Method void b.layout(int, int, int, int)>
			return;
	//   83  148:return          
		}
	}

	public void onMeasure(int i1, int j1)
	{
		super.onMeasure(i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #568 <Method void ViewGroup.onMeasure(int, int)>
		if(n == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #419 <Field View n>
	//*   6   10:ifnonnull       17
			f();
	//    7   13:aload_0         
	//    8   14:invokespecial   #271 <Method void f()>
		if(n == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #419 <Field View n>
	//*  11   21:ifnonnull       25
			return;
	//   12   24:return          
		n.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
	//   13   25:aload_0         
	//   14   26:getfield        #419 <Field View n>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #542 <Method int getMeasuredWidth()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #548 <Method int getPaddingLeft()>
	//   19   37:isub            
	//   20   38:aload_0         
	//   21   39:invokevirtual   #554 <Method int getPaddingRight()>
	//   22   42:isub            
	//   23   43:ldc2            #569 <Int 0x40000000>
	//   24   46:invokestatic    #574 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #545 <Method int getMeasuredHeight()>
	//   27   53:aload_0         
	//   28   54:invokevirtual   #551 <Method int getPaddingTop()>
	//   29   57:isub            
	//   30   58:aload_0         
	//   31   59:invokevirtual   #557 <Method int getPaddingBottom()>
	//   32   62:isub            
	//   33   63:ldc2            #569 <Int 0x40000000>
	//   34   66:invokestatic    #574 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   35   69:invokevirtual   #577 <Method void View.measure(int, int)>
		e.measure(android.view.View.MeasureSpec.makeMeasureSpec(K, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(K, 0x40000000));
	//   36   72:aload_0         
	//   37   73:getfield        #233 <Field b e>
	//   38   76:aload_0         
	//   39   77:getfield        #168 <Field int K>
	//   40   80:ldc2            #569 <Int 0x40000000>
	//   41   83:invokestatic    #574 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   42   86:aload_0         
	//   43   87:getfield        #168 <Field int K>
	//   44   90:ldc2            #569 <Int 0x40000000>
	//   45   93:invokestatic    #574 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   46   96:invokevirtual   #578 <Method void b.measure(int, int)>
		E = -1;
	//   47   99:aload_0         
	//   48  100:iconst_m1       
	//   49  101:putfield        #109 <Field int E>
		for(i1 = 0; i1 < getChildCount(); i1++)
	//*  50  104:iconst_0        
	//*  51  105:istore_1        
	//*  52  106:iload_1         
	//*  53  107:aload_0         
	//*  54  108:invokevirtual   #422 <Method int getChildCount()>
	//*  55  111:icmpge          139
			if(getChildAt(i1) == e)
	//*  56  114:aload_0         
	//*  57  115:iload_1         
	//*  58  116:invokevirtual   #426 <Method View getChildAt(int)>
	//*  59  119:aload_0         
	//*  60  120:getfield        #233 <Field b e>
	//*  61  123:if_acmpne       132
			{
				E = i1;
	//   62  126:aload_0         
	//   63  127:iload_1         
	//   64  128:putfield        #109 <Field int E>
				return;
	//   65  131:return          
			}

	//   66  132:iload_1         
	//   67  133:iconst_1        
	//   68  134:iadd            
	//   69  135:istore_1        
	//*  70  136:goto            106
	//   71  139:return          
	}

	public boolean onNestedFling(View view, float f1, float f2, boolean flag)
	{
		return dispatchNestedFling(f1, f2, flag);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:iload           4
	//    4    5:invokevirtual   #582 <Method boolean dispatchNestedFling(float, float, boolean)>
	//    5    8:ireturn         
	}

	public boolean onNestedPreFling(View view, float f1, float f2)
	{
		return dispatchNestedPreFling(f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #586 <Method boolean dispatchNestedPreFling(float, float)>
	//    4    6:ireturn         
	}

	public void onNestedPreScroll(View view, int i1, int j1, int ai[])
	{
		if(j1 > 0 && q > 0.0F)
	//*   0    0:iload_3         
	//*   1    1:ifle            70
	//*   2    4:aload_0         
	//*   3    5:getfield        #590 <Field float q>
	//*   4    8:fconst_0        
	//*   5    9:fcmpl           
	//*   6   10:ifle            70
		{
			float f1 = j1;
	//    7   13:iload_3         
	//    8   14:i2f             
	//    9   15:fstore          5
			if(f1 > q)
	//*  10   17:fload           5
	//*  11   19:aload_0         
	//*  12   20:getfield        #590 <Field float q>
	//*  13   23:fcmpl           
	//*  14   24:ifle            46
			{
				ai[1] = j1 - (int)q;
	//   15   27:aload           4
	//   16   29:iconst_1        
	//   17   30:iload_3         
	//   18   31:aload_0         
	//   19   32:getfield        #590 <Field float q>
	//   20   35:f2i             
	//   21   36:isub            
	//   22   37:iastore         
				q = 0.0F;
	//   23   38:aload_0         
	//   24   39:fconst_0        
	//   25   40:putfield        #590 <Field float q>
			} else
	//*  26   43:goto            62
			{
				q = q - f1;
	//   27   46:aload_0         
	//   28   47:aload_0         
	//   29   48:getfield        #590 <Field float q>
	//   30   51:fload           5
	//   31   53:fsub            
	//   32   54:putfield        #590 <Field float q>
				ai[1] = j1;
	//   33   57:aload           4
	//   34   59:iconst_1        
	//   35   60:iload_3         
	//   36   61:iastore         
			}
			b(q);
	//   37   62:aload_0         
	//   38   63:aload_0         
	//   39   64:getfield        #590 <Field float q>
	//   40   67:invokespecial   #591 <Method void b(float)>
		}
		if(l && j1 > 0 && q == 0.0F && Math.abs(j1 - ai[1]) > 0)
	//*  41   70:aload_0         
	//*  42   71:getfield        #308 <Field boolean l>
	//*  43   74:ifeq            111
	//*  44   77:iload_3         
	//*  45   78:ifle            111
	//*  46   81:aload_0         
	//*  47   82:getfield        #590 <Field float q>
	//*  48   85:fconst_0        
	//*  49   86:fcmpl           
	//*  50   87:ifne            111
	//*  51   90:iload_3         
	//*  52   91:aload           4
	//*  53   93:iconst_1        
	//*  54   94:iaload          
	//*  55   95:isub            
	//*  56   96:invokestatic    #593 <Method int Math.abs(int)>
	//*  57   99:ifle            111
			e.setVisibility(8);
	//   58  102:aload_0         
	//   59  103:getfield        #233 <Field b e>
	//   60  106:bipush          8
	//   61  108:invokevirtual   #323 <Method void b.setVisibility(int)>
		view = ((View) (t));
	//   62  111:aload_0         
	//   63  112:getfield        #103 <Field int[] t>
	//   64  115:astore_1        
		if(dispatchNestedPreScroll(i1 - ai[0], j1 - ai[1], ((int []) (view)), ((int []) (null))))
	//*  65  116:aload_0         
	//*  66  117:iload_2         
	//*  67  118:aload           4
	//*  68  120:iconst_0        
	//*  69  121:iaload          
	//*  70  122:isub            
	//*  71  123:iload_3         
	//*  72  124:aload           4
	//*  73  126:iconst_1        
	//*  74  127:iaload          
	//*  75  128:isub            
	//*  76  129:aload_1         
	//*  77  130:aconst_null     
	//*  78  131:invokevirtual   #595 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//*  79  134:ifeq            161
		{
			ai[0] = ai[0] + view[0];
	//   80  137:aload           4
	//   81  139:iconst_0        
	//   82  140:aload           4
	//   83  142:iconst_0        
	//   84  143:iaload          
	//   85  144:aload_1         
	//   86  145:iconst_0        
	//   87  146:iaload          
	//   88  147:iadd            
	//   89  148:iastore         
			ai[1] = ai[1] + view[1];
	//   90  149:aload           4
	//   91  151:iconst_1        
	//   92  152:aload           4
	//   93  154:iconst_1        
	//   94  155:iaload          
	//   95  156:aload_1         
	//   96  157:iconst_1        
	//   97  158:iaload          
	//   98  159:iadd            
	//   99  160:iastore         
		}
	//  100  161:return          
	}

	public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
	{
		dispatchNestedScroll(i1, j1, k1, l1, u);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:aload_0         
	//    6    8:getfield        #105 <Field int[] u>
	//    7   11:invokevirtual   #599 <Method boolean dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:pop             
		i1 = l1 + u[1];
	//    9   15:iload           5
	//   10   17:aload_0         
	//   11   18:getfield        #105 <Field int[] u>
	//   12   21:iconst_1        
	//   13   22:iaload          
	//   14   23:iadd            
	//   15   24:istore_2        
		if(i1 < 0 && !b())
	//*  16   25:iload_2         
	//*  17   26:ifge            58
	//*  18   29:aload_0         
	//*  19   30:invokevirtual   #515 <Method boolean b()>
	//*  20   33:ifne            58
		{
			q = q + (float)Math.abs(i1);
	//   21   36:aload_0         
	//   22   37:aload_0         
	//   23   38:getfield        #590 <Field float q>
	//   24   41:iload_2         
	//   25   42:invokestatic    #593 <Method int Math.abs(int)>
	//   26   45:i2f             
	//   27   46:fadd            
	//   28   47:putfield        #590 <Field float q>
			b(q);
	//   29   50:aload_0         
	//   30   51:aload_0         
	//   31   52:getfield        #590 <Field float q>
	//   32   55:invokespecial   #591 <Method void b(float)>
		}
	//   33   58:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i1)
	{
		r.a(view, view1, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field n r>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #603 <Method void n.a(View, View, int)>
		startNestedScroll(i1 & 2);
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:iconst_2        
	//    9   13:iand            
	//   10   14:invokevirtual   #606 <Method boolean startNestedScroll(int)>
	//   11   17:pop             
		q = 0.0F;
	//   12   18:aload_0         
	//   13   19:fconst_0        
	//   14   20:putfield        #590 <Field float q>
		v = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #517 <Field boolean v>
	//   18   28:return          
	}

	public boolean onStartNestedScroll(View view, View view1, int i1)
	{
		return isEnabled() && !B && !b && (i1 & 2) != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #514 <Method boolean isEnabled()>
	//    2    4:ifeq            29
	//    3    7:aload_0         
	//    4    8:getfield        #511 <Field boolean B>
	//    5   11:ifne            29
	//    6   14:aload_0         
	//    7   15:getfield        #98  <Field boolean b>
	//    8   18:ifne            29
	//    9   21:iload_3         
	//   10   22:iconst_2        
	//   11   23:iand            
	//   12   24:ifeq            29
	//   13   27:iconst_1        
	//   14   28:ireturn         
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		r.a(view);
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field n r>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #611 <Method void n.a(View)>
		v = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #517 <Field boolean v>
		if(q > 0.0F)
	//*   7   13:aload_0         
	//*   8   14:getfield        #590 <Field float q>
	//*   9   17:fconst_0        
	//*  10   18:fcmpl           
	//*  11   19:ifle            35
		{
			c(q);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #590 <Field float q>
	//   15   27:invokespecial   #612 <Method void c(float)>
			q = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #590 <Field float q>
		}
		stopNestedScroll();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #615 <Method void stopNestedScroll()>
	//   21   39:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i1 = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #509 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		if(B && i1 == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #511 <Field boolean B>
	//*   5   10:ifeq            23
	//*   6   13:iload           4
	//*   7   15:ifne            23
			B = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #511 <Field boolean B>
		if(isEnabled() && !B && !b() && !b)
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #514 <Method boolean isEnabled()>
	//*  13   27:ifeq            311
	//*  14   30:aload_0         
	//*  15   31:getfield        #511 <Field boolean B>
	//*  16   34:ifne            311
	//*  17   37:aload_0         
	//*  18   38:invokevirtual   #515 <Method boolean b()>
	//*  19   41:ifne            311
	//*  20   44:aload_0         
	//*  21   45:getfield        #98  <Field boolean b>
	//*  22   48:ifne            311
		{
			if(v)
	//*  23   51:aload_0         
	//*  24   52:getfield        #517 <Field boolean v>
	//*  25   55:ifeq            60
				return false;
	//   26   58:iconst_0        
	//   27   59:ireturn         
			switch(i1)
	//*  28   60:iload           4
			{
			case 4: // '\004'
			default:
				break;

	//*  29   62:tableswitch     0 6: default 104
	//	               0 295
	//	               1 226
	//	               2 153
	//	               3 151
	//	               4 104
	//	               5 115
	//	               6 107
	//*  30  104:goto            309
			case 6: // '\006'
				a(motionevent);
	//   31  107:aload_0         
	//   32  108:aload_1         
	//   33  109:invokespecial   #537 <Method void a(MotionEvent)>
				break;
	//   34  112:goto            309

			case 5: // '\005'
				int j1 = motionevent.getActionIndex();
	//   35  115:aload_1         
	//   36  116:invokevirtual   #263 <Method int MotionEvent.getActionIndex()>
	//   37  119:istore          4
				if(j1 < 0)
	//*  38  121:iload           4
	//*  39  123:ifge            138
				{
					Log.e(m, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
	//   40  126:getstatic       #519 <Field String m>
	//   41  129:ldc2            #618 <String "Got ACTION_POINTER_DOWN event but have an invalid action index.">
	//   42  132:invokestatic    #526 <Method int Log.e(String, String)>
	//   43  135:pop             
					return false;
	//   44  136:iconst_0        
	//   45  137:ireturn         
				}
				A = motionevent.getPointerId(j1);
	//   46  138:aload_0         
	//   47  139:aload_1         
	//   48  140:iload           4
	//   49  142:invokevirtual   #266 <Method int MotionEvent.getPointerId(int)>
	//   50  145:putfield        #107 <Field int A>
				break;
	//   51  148:goto            309

			case 3: // '\003'
				return false;
	//   52  151:iconst_0        
	//   53  152:ireturn         

			case 2: // '\002'
				int k1 = motionevent.findPointerIndex(A);
	//   54  153:aload_1         
	//   55  154:aload_0         
	//   56  155:getfield        #107 <Field int A>
	//   57  158:invokevirtual   #529 <Method int MotionEvent.findPointerIndex(int)>
	//   58  161:istore          4
				if(k1 < 0)
	//*  59  163:iload           4
	//*  60  165:ifge            180
				{
					Log.e(m, "Got ACTION_MOVE event but have an invalid active pointer id.");
	//   61  168:getstatic       #519 <Field String m>
	//   62  171:ldc2            #620 <String "Got ACTION_MOVE event but have an invalid active pointer id.">
	//   63  174:invokestatic    #526 <Method int Log.e(String, String)>
	//   64  177:pop             
					return false;
	//   65  178:iconst_0        
	//   66  179:ireturn         
				}
				float f1 = motionevent.getY(k1);
	//   67  180:aload_1         
	//   68  181:iload           4
	//   69  183:invokevirtual   #533 <Method float MotionEvent.getY(int)>
	//   70  186:fstore_2        
				d(f1);
	//   71  187:aload_0         
	//   72  188:fload_2         
	//   73  189:invokespecial   #535 <Method void d(float)>
				if(!z)
					break;
	//   74  192:aload_0         
	//   75  193:getfield        #415 <Field boolean z>
	//   76  196:ifeq            309
				f1 = (f1 - x) * 0.5F;
	//   77  199:fload_2         
	//   78  200:aload_0         
	//   79  201:getfield        #417 <Field float x>
	//   80  204:fsub            
	//   81  205:ldc2            #356 <Float 0.5F>
	//   82  208:fmul            
	//   83  209:fstore_2        
				if(f1 > 0.0F)
	//*  84  210:fload_2         
	//*  85  211:fconst_0        
	//*  86  212:fcmpl           
	//*  87  213:ifle            224
					b(f1);
	//   88  216:aload_0         
	//   89  217:fload_2         
	//   90  218:invokespecial   #591 <Method void b(float)>
				else
	//*  91  221:goto            309
					return false;
	//   92  224:iconst_0        
	//   93  225:ireturn         
				break;

			case 1: // '\001'
				int l1 = motionevent.findPointerIndex(A);
	//   94  226:aload_1         
	//   95  227:aload_0         
	//   96  228:getfield        #107 <Field int A>
	//   97  231:invokevirtual   #529 <Method int MotionEvent.findPointerIndex(int)>
	//   98  234:istore          4
				if(l1 < 0)
	//*  99  236:iload           4
	//* 100  238:ifge            253
				{
					Log.e(m, "Got ACTION_UP event but don't have an active pointer id.");
	//  101  241:getstatic       #519 <Field String m>
	//  102  244:ldc2            #622 <String "Got ACTION_UP event but don't have an active pointer id.">
	//  103  247:invokestatic    #526 <Method int Log.e(String, String)>
	//  104  250:pop             
					return false;
	//  105  251:iconst_0        
	//  106  252:ireturn         
				}
				if(z)
	//* 107  253:aload_0         
	//* 108  254:getfield        #415 <Field boolean z>
	//* 109  257:ifeq            288
				{
					float f2 = motionevent.getY(l1);
	//  110  260:aload_1         
	//  111  261:iload           4
	//  112  263:invokevirtual   #533 <Method float MotionEvent.getY(int)>
	//  113  266:fstore_2        
					float f3 = x;
	//  114  267:aload_0         
	//  115  268:getfield        #417 <Field float x>
	//  116  271:fstore_3        
					z = false;
	//  117  272:aload_0         
	//  118  273:iconst_0        
	//  119  274:putfield        #415 <Field boolean z>
					c((f2 - f3) * 0.5F);
	//  120  277:aload_0         
	//  121  278:fload_2         
	//  122  279:fload_3         
	//  123  280:fsub            
	//  124  281:ldc2            #356 <Float 0.5F>
	//  125  284:fmul            
	//  126  285:invokespecial   #612 <Method void c(float)>
				}
				A = -1;
	//  127  288:aload_0         
	//  128  289:iconst_m1       
	//  129  290:putfield        #107 <Field int A>
				return false;
	//  130  293:iconst_0        
	//  131  294:ireturn         

			case 0: // '\0'
				A = motionevent.getPointerId(0);
	//  132  295:aload_0         
	//  133  296:aload_1         
	//  134  297:iconst_0        
	//  135  298:invokevirtual   #266 <Method int MotionEvent.getPointerId(int)>
	//  136  301:putfield        #107 <Field int A>
				z = false;
	//  137  304:aload_0         
	//  138  305:iconst_0        
	//  139  306:putfield        #415 <Field boolean z>
				break;
			}
			return true;
	//  140  309:iconst_1        
	//  141  310:ireturn         
		} else
		{
			return false;
	//  142  311:iconst_0        
	//  143  312:ireturn         
		}
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 || !(n instanceof AbsListView))
	//*   0    0:getstatic       #368 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          18
	//*   3    8:aload_0         
	//*   4    9:getfield        #419 <Field View n>
	//*   5   12:instanceof      #625 <Class AbsListView>
	//*   6   15:ifne            41
		{
			if(n != null && !android.support.v4.view.s.v(n))
	//*   7   18:aload_0         
	//*   8   19:getfield        #419 <Field View n>
	//*   9   22:ifnull          36
	//*  10   25:aload_0         
	//*  11   26:getfield        #419 <Field View n>
	//*  12   29:invokestatic    #628 <Method boolean s.v(View)>
	//*  13   32:ifne            36
				return;
	//   14   35:return          
			super.requestDisallowInterceptTouchEvent(flag);
	//   15   36:aload_0         
	//   16   37:iload_1         
	//   17   38:invokespecial   #630 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		}
	//   18   41:return          
	}

	void setAnimationProgress(float f1)
	{
		e.setScaleX(f1);
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field b e>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #328 <Method void b.setScaleX(float)>
		e.setScaleY(f1);
	//    4    8:aload_0         
	//    5    9:getfield        #233 <Field b e>
	//    6   12:fload_1         
	//    7   13:invokevirtual   #331 <Method void b.setScaleY(float)>
	//    8   16:return          
	}

	public transient void setColorScheme(int ai[])
	{
		setColorSchemeResources(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #636 <Method void setColorSchemeResources(int[])>
	//    3    5:return          
	}

	public transient void setColorSchemeColors(int ai[])
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #271 <Method void f()>
		j.a(ai);
	//    2    4:aload_0         
	//    3    5:getfield        #284 <Field c j>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #640 <Method void android.support.v4.widget.c.a(int[])>
	//    6   12:return          
	}

	public transient void setColorSchemeResources(int ai[])
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #378 <Method Context getContext()>
	//    2    4:astore_3        
		int ai1[] = new int[ai.length];
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:newarray        int[]
	//    6    9:astore          4
		for(int i1 = 0; i1 < ai.length; i1++)
	//*   7   11:iconst_0        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_1         
	//*  11   15:arraylength     
	//*  12   16:icmpge          37
			ai1[i1] = android.support.v4.content.a.getColor(context, ai[i1]);
	//   13   19:aload           4
	//   14   21:iload_2         
	//   15   22:aload_3         
	//   16   23:aload_1         
	//   17   24:iload_2         
	//   18   25:iaload          
	//   19   26:invokestatic    #646 <Method int a.getColor(Context, int)>
	//   20   29:iastore         

	//   21   30:iload_2         
	//   22   31:iconst_1        
	//   23   32:iadd            
	//   24   33:istore_2        
	//*  25   34:goto            13
		setColorSchemeColors(ai1);
	//   26   37:aload_0         
	//   27   38:aload           4
	//   28   40:invokevirtual   #648 <Method void setColorSchemeColors(int[])>
	//   29   43:return          
	}

	public void setDistanceToTriggerSync(int i1)
	{
		p = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:putfield        #101 <Field float p>
	//    4    6:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #650 <Method void ViewGroup.setEnabled(boolean)>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
			a();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #504 <Method void a()>
	//    7   13:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		s.a(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field k s>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #651 <Method void k.a(boolean)>
	//    4    8:return          
	}

	public void setOnChildScrollUpCallback(a a1)
	{
		L = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #453 <Field SwipeRefreshLayout$a L>
	//    3    5:return          
	}

	public void setOnRefreshListener(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #657 <Field SwipeRefreshLayout$b a>
	//    3    5:return          
	}

	public void setProgressBackgroundColor(int i1)
	{
		setProgressBackgroundColorSchemeResource(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #661 <Method void setProgressBackgroundColorSchemeResource(int)>
	//    3    5:return          
	}

	public void setProgressBackgroundColorSchemeColor(int i1)
	{
		e.setBackgroundColor(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field b e>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #665 <Method void b.setBackgroundColor(int)>
	//    4    8:return          
	}

	public void setProgressBackgroundColorSchemeResource(int i1)
	{
		setProgressBackgroundColorSchemeColor(android.support.v4.content.a.getColor(getContext(), i1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #378 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #646 <Method int a.getColor(Context, int)>
	//    5    9:invokevirtual   #667 <Method void setProgressBackgroundColorSchemeColor(int)>
	//    6   12:return          
	}

	public void setRefreshing(boolean flag)
	{
		if(flag && b != flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            66
	//*   2    4:aload_0         
	//*   3    5:getfield        #98  <Field boolean b>
	//*   4    8:iload_1         
	//*   5    9:icmpeq          66
		{
			b = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #98  <Field boolean b>
			int i1;
			if(!l)
	//*   9   17:aload_0         
	//*  10   18:getfield        #308 <Field boolean l>
	//*  11   21:ifne            37
				i1 = i + h;
	//   12   24:aload_0         
	//   13   25:getfield        #178 <Field int i>
	//   14   28:aload_0         
	//   15   29:getfield        #199 <Field int h>
	//   16   32:iadd            
	//   17   33:istore_2        
			else
	//*  18   34:goto            42
				i1 = i;
	//   19   37:aload_0         
	//   20   38:getfield        #178 <Field int i>
	//   21   41:istore_2        
			setTargetOffsetTopAndBottom(i1 - c);
	//   22   42:aload_0         
	//   23   43:iload_2         
	//   24   44:aload_0         
	//   25   45:getfield        #197 <Field int c>
	//   26   48:isub            
	//   27   49:invokevirtual   #361 <Method void setTargetOffsetTopAndBottom(int)>
			k = false;
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:putfield        #269 <Field boolean k>
			b(M);
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #114 <Field android.view.animation.Animation$AnimationListener M>
	//   34   62:invokespecial   #670 <Method void b(android.view.animation.Animation$AnimationListener)>
			return;
	//   35   65:return          
		} else
		{
			a(flag, false);
	//   36   66:aload_0         
	//   37   67:iload_1         
	//   38   68:iconst_0        
	//   39   69:invokespecial   #395 <Method void a(boolean, boolean)>
			return;
	//   40   72:return          
		}
	}

	public void setSize(int i1)
	{
		if(i1 != 0 && i1 != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          10
			return;
	//    5    9:return          
		DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #136 <Method Resources getResources()>
	//    8   14:invokevirtual   #160 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    9   17:astore_3        
		float f1;
		if(i1 == 0)
	//*  10   18:iload_1         
	//*  11   19:ifne            40
			f1 = 56F;
	//   12   22:ldc2            #672 <Float 56F>
	//   13   25:fstore_2        
		else
	//*  14   26:aload_0         
	//*  15   27:aload_3         
	//*  16   28:getfield        #165 <Field float DisplayMetrics.density>
	//*  17   31:fload_2         
	//*  18   32:fmul            
	//*  19   33:f2i             
	//*  20   34:putfield        #168 <Field int K>
	//*  21   37:goto            46
			f1 = 40F;
	//   22   40:ldc1            #166 <Float 40F>
	//   23   42:fstore_2        
		K = (int)(displaymetrics.density * f1);
	//*  24   43:goto            26
		e.setImageDrawable(((Drawable) (null)));
	//   25   46:aload_0         
	//   26   47:getfield        #233 <Field b e>
	//   27   50:aconst_null     
	//   28   51:invokevirtual   #390 <Method void b.setImageDrawable(Drawable)>
		j.a(i1);
	//   29   54:aload_0         
	//   30   55:getfield        #284 <Field c j>
	//   31   58:iload_1         
	//   32   59:invokevirtual   #386 <Method void android.support.v4.widget.c.a(int)>
		e.setImageDrawable(((Drawable) (j)));
	//   33   62:aload_0         
	//   34   63:getfield        #233 <Field b e>
	//   35   66:aload_0         
	//   36   67:getfield        #284 <Field c j>
	//   37   70:invokevirtual   #390 <Method void b.setImageDrawable(Drawable)>
	//   38   73:return          
	}

	void setTargetOffsetTopAndBottom(int i1)
	{
		e.bringToFront();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field b e>
	//    2    4:invokevirtual   #675 <Method void b.bringToFront()>
		android.support.v4.view.s.c(((View) (e)), i1);
	//    3    7:aload_0         
	//    4    8:getfield        #233 <Field b e>
	//    5   11:iload_1         
	//    6   12:invokestatic    #678 <Method void s.c(View, int)>
		c = e.getTop();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #233 <Field b e>
	//   10   20:invokevirtual   #448 <Method int b.getTop()>
	//   11   23:putfield        #197 <Field int c>
	//   12   26:return          
	}

	public boolean startNestedScroll(int i1)
	{
		return s.b(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field k s>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #680 <Method boolean k.b(int)>
	//    4    8:ireturn         
	}

	public void stopNestedScroll()
	{
		s.c();
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field k s>
	//    2    4:invokevirtual   #681 <Method void k.c()>
	//    3    7:return          
	}

	private static final int D[] = {
		0x101000e
	};
	private static final String m = "SwipeRefreshLayout";
	private int A;
	private boolean B;
	private final DecelerateInterpolator C;
	private int E;
	private Animation F;
	private Animation G;
	private Animation H;
	private Animation I;
	private Animation J;
	private int K;
	private a L;
	private android.view.animation.Animation.AnimationListener M = new android.view.animation.Animation.AnimationListener() {

		public void onAnimationEnd(Animation animation)
		{
			if(a.b)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field SwipeRefreshLayout a>
		//*   2    4:getfield        #24  <Field boolean SwipeRefreshLayout.b>
		//*   3    7:ifeq            83
			{
				a.j.setAlpha(255);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field SwipeRefreshLayout a>
		//    6   14:getfield        #28  <Field c SwipeRefreshLayout.j>
		//    7   17:sipush          255
		//    8   20:invokevirtual   #34  <Method void c.setAlpha(int)>
				a.j.start();
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field SwipeRefreshLayout a>
		//   11   27:getfield        #28  <Field c SwipeRefreshLayout.j>
		//   12   30:invokevirtual   #37  <Method void c.start()>
				if(a.k && a.a != null)
		//*  13   33:aload_0         
		//*  14   34:getfield        #14  <Field SwipeRefreshLayout a>
		//*  15   37:getfield        #40  <Field boolean android.support.v4.widget.SwipeRefreshLayout.k>
		//*  16   40:ifeq            65
		//*  17   43:aload_0         
		//*  18   44:getfield        #14  <Field SwipeRefreshLayout a>
		//*  19   47:getfield        #43  <Field SwipeRefreshLayout$b android.support.v4.widget.SwipeRefreshLayout.a>
		//*  20   50:ifnull          65
					a.a.a();
		//   21   53:aload_0         
		//   22   54:getfield        #14  <Field SwipeRefreshLayout a>
		//   23   57:getfield        #43  <Field SwipeRefreshLayout$b android.support.v4.widget.SwipeRefreshLayout.a>
		//   24   60:invokeinterface #47  <Method void android.support.v4.widget.SwipeRefreshLayout$b.a()>
				a.c = a.e.getTop();
		//   25   65:aload_0         
		//   26   66:getfield        #14  <Field SwipeRefreshLayout a>
		//   27   69:aload_0         
		//   28   70:getfield        #14  <Field SwipeRefreshLayout a>
		//   29   73:getfield        #51  <Field b SwipeRefreshLayout.e>
		//   30   76:invokevirtual   #57  <Method int b.getTop()>
		//   31   79:putfield        #61  <Field int SwipeRefreshLayout.c>
				return;
		//   32   82:return          
			} else
			{
				a.a();
		//   33   83:aload_0         
		//   34   84:getfield        #14  <Field SwipeRefreshLayout a>
		//   35   87:invokevirtual   #62  <Method void android.support.v4.widget.SwipeRefreshLayout.a()>
				return;
		//   36   90:return          
			}
		}

		public void onAnimationRepeat(Animation animation)
		{
		//    0    0:return          
		}

		public void onAnimationStart(Animation animation)
		{
		//    0    0:return          
		}

		final SwipeRefreshLayout a;

			
			{
				a = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SwipeRefreshLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private final Animation N;
	private final Animation O;
	b a;
	boolean b;
	int c;
	boolean d;
	android.support.v4.widget.b e;
	protected int f;
	float g;
	protected int h;
	int i;
	c j;
	boolean k;
	boolean l;
	private View n;
	private int o;
	private float p;
	private float q;
	private final n r;
	private final k s;
	private final int t[];
	private final int u[];
	private boolean v;
	private int w;
	private float x;
	private float y;
	private boolean z;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #87  <Int 0x101000e>
	//    5    7:iastore         
	//    6    8:putstatic       #89  <Field int[] D>
	//*   7   11:return          
	}
}
