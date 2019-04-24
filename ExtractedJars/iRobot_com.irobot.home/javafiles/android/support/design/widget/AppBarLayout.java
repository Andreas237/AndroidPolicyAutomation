// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.f.i;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			n, r, HeaderBehavior, a, 
//			CoordinatorLayout, HeaderScrollingViewBehavior

public class AppBarLayout extends LinearLayout
{
	public static class Behavior extends HeaderBehavior
	{

		static int a(Behavior behavior)
		{
			return behavior.b;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field int b>
		//    2    4:ireturn         
		}

		private int a(AppBarLayout appbarlayout, int k)
		{
			int i1 = appbarlayout.getChildCount();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
		//    2    4:istore          4
			for(int l = 0; l < i1; l++)
		//*   3    6:iconst_0        
		//*   4    7:istore_3        
		//*   5    8:iload_3         
		//*   6    9:iload           4
		//*   7   11:icmpge          58
			{
				View view = appbarlayout.getChildAt(l);
		//    8   14:aload_1         
		//    9   15:iload_3         
		//   10   16:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
		//   11   19:astore          7
				int j1 = view.getTop();
		//   12   21:aload           7
		//   13   23:invokevirtual   #59  <Method int View.getTop()>
		//   14   26:istore          5
				int k1 = -k;
		//   15   28:iload_2         
		//   16   29:ineg            
		//   17   30:istore          6
				if(j1 <= k1 && view.getBottom() >= k1)
		//*  18   32:iload           5
		//*  19   34:iload           6
		//*  20   36:icmpgt          51
		//*  21   39:aload           7
		//*  22   41:invokevirtual   #62  <Method int View.getBottom()>
		//*  23   44:iload           6
		//*  24   46:icmplt          51
					return l;
		//   25   49:iload_3         
		//   26   50:ireturn         
			}

		//   27   51:iload_3         
		//   28   52:iconst_1        
		//   29   53:iadd            
		//   30   54:istore_3        
		//*  31   55:goto            8
			return -1;
		//   32   58:iconst_m1       
		//   33   59:ireturn         
		}

		private void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int k, float f1)
		{
			int l = Math.abs(a() - k);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #65  <Method int a()>
		//    2    4:iload_3         
		//    3    5:isub            
		//    4    6:invokestatic    #71  <Method int Math.abs(int)>
		//    5    9:istore          5
			f1 = Math.abs(f1);
		//    6   11:fload           4
		//    7   13:invokestatic    #74  <Method float Math.abs(float)>
		//    8   16:fstore          4
			if(f1 > 0.0F)
		//*   9   18:fload           4
		//*  10   20:fconst_0        
		//*  11   21:fcmpl           
		//*  12   22:ifle            44
				l = Math.round(((float)l / f1) * 1000F) * 3;
		//   13   25:iload           5
		//   14   27:i2f             
		//   15   28:fload           4
		//   16   30:fdiv            
		//   17   31:ldc1            #75  <Float 1000F>
		//   18   33:fmul            
		//   19   34:invokestatic    #79  <Method int Math.round(float)>
		//   20   37:iconst_3        
		//   21   38:imul            
		//   22   39:istore          5
			else
		//*  23   41:goto            61
				l = (int)(((float)l / (float)appbarlayout.getHeight() + 1.0F) * 150F);
		//   24   44:iload           5
		//   25   46:i2f             
		//   26   47:aload_2         
		//   27   48:invokevirtual   #82  <Method int AppBarLayout.getHeight()>
		//   28   51:i2f             
		//   29   52:fdiv            
		//   30   53:fconst_1        
		//   31   54:fadd            
		//   32   55:ldc1            #83  <Float 150F>
		//   33   57:fmul            
		//   34   58:f2i             
		//   35   59:istore          5
			a(coordinatorlayout, appbarlayout, k, l);
		//   36   61:aload_0         
		//   37   62:aload_1         
		//   38   63:aload_2         
		//   39   64:iload_3         
		//   40   65:iload           5
		//   41   67:invokespecial   #86  <Method void a(CoordinatorLayout, AppBarLayout, int, int)>
		//   42   70:return          
		}

		private void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int k, int l)
		{
			int i1 = a();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #65  <Method int a()>
		//    2    4:istore          5
			if(i1 == k)
		//*   3    6:iload           5
		//*   4    8:iload_3         
		//*   5    9:icmpne          37
			{
				if(c != null && c.isRunning())
		//*   6   12:aload_0         
		//*   7   13:getfield        #88  <Field ValueAnimator c>
		//*   8   16:ifnull          36
		//*   9   19:aload_0         
		//*  10   20:getfield        #88  <Field ValueAnimator c>
		//*  11   23:invokevirtual   #94  <Method boolean ValueAnimator.isRunning()>
		//*  12   26:ifeq            36
					c.cancel();
		//   13   29:aload_0         
		//   14   30:getfield        #88  <Field ValueAnimator c>
		//   15   33:invokevirtual   #97  <Method void ValueAnimator.cancel()>
				return;
		//   16   36:return          
			}
			if(c == null)
		//*  17   37:aload_0         
		//*  18   38:getfield        #88  <Field ValueAnimator c>
		//*  19   41:ifnonnull       85
			{
				c = new ValueAnimator();
		//   20   44:aload_0         
		//   21   45:new             #90  <Class ValueAnimator>
		//   22   48:dup             
		//   23   49:invokespecial   #98  <Method void ValueAnimator()>
		//   24   52:putfield        #88  <Field ValueAnimator c>
				c.setInterpolator(((android.animation.TimeInterpolator) (android.support.design.widget.a.e)));
		//   25   55:aload_0         
		//   26   56:getfield        #88  <Field ValueAnimator c>
		//   27   59:getstatic       #103 <Field Interpolator a.e>
		//   28   62:invokevirtual   #107 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
				c.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this, coordinatorlayout, appbarlayout) {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						c.a_(a, ((View) (b)), ((Integer)valueanimator.getAnimatedValue()).intValue());
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field AppBarLayout$Behavior c>
					//    2    4:aload_0         
					//    3    5:getfield        #25  <Field CoordinatorLayout a>
					//    4    8:aload_0         
					//    5    9:getfield        #27  <Field AppBarLayout b>
					//    6   12:aload_1         
					//    7   13:invokevirtual   #39  <Method Object ValueAnimator.getAnimatedValue()>
					//    8   16:checkcast       #41  <Class Integer>
					//    9   19:invokevirtual   #45  <Method int Integer.intValue()>
					//   10   22:invokevirtual   #49  <Method int AppBarLayout$Behavior.a_(CoordinatorLayout, View, int)>
					//   11   25:pop             
					//   12   26:return          
					}

					final CoordinatorLayout a;
					final AppBarLayout b;
					final Behavior c;

			
			{
				c = behavior;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field AppBarLayout$Behavior c>
				a = coordinatorlayout;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field CoordinatorLayout a>
				b = appbarlayout;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field AppBarLayout b>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
				}
);
		//   29   65:aload_0         
		//   30   66:getfield        #88  <Field ValueAnimator c>
		//   31   69:new             #10  <Class AppBarLayout$Behavior$1>
		//   32   72:dup             
		//   33   73:aload_0         
		//   34   74:aload_1         
		//   35   75:aload_2         
		//   36   76:invokespecial   #110 <Method void AppBarLayout$Behavior$1(AppBarLayout$Behavior, CoordinatorLayout, AppBarLayout)>
		//   37   79:invokevirtual   #114 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			} else
		//*  38   82:goto            92
			{
				c.cancel();
		//   39   85:aload_0         
		//   40   86:getfield        #88  <Field ValueAnimator c>
		//   41   89:invokevirtual   #97  <Method void ValueAnimator.cancel()>
			}
			c.setDuration(Math.min(l, 600));
		//   42   92:aload_0         
		//   43   93:getfield        #88  <Field ValueAnimator c>
		//   44   96:iload           4
		//   45   98:sipush          600
		//   46  101:invokestatic    #118 <Method int Math.min(int, int)>
		//   47  104:i2l             
		//   48  105:invokevirtual   #122 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//   49  108:pop             
			c.setIntValues(new int[] {
				i1, k
			});
		//   50  109:aload_0         
		//   51  110:getfield        #88  <Field ValueAnimator c>
		//   52  113:iconst_2        
		//   53  114:newarray        int[]
		//   54  116:dup             
		//   55  117:iconst_0        
		//   56  118:iload           5
		//   57  120:iastore         
		//   58  121:dup             
		//   59  122:iconst_1        
		//   60  123:iload_3         
		//   61  124:iastore         
		//   62  125:invokevirtual   #126 <Method void ValueAnimator.setIntValues(int[])>
			c.start();
		//   63  128:aload_0         
		//   64  129:getfield        #88  <Field ValueAnimator c>
		//   65  132:invokevirtual   #129 <Method void ValueAnimator.start()>
		//   66  135:return          
		}

		private void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int k, int l, boolean flag)
		{
			int i1;
			boolean flag1;
			boolean flag2;
			View view;
			view = c(appbarlayout, k);
		//    0    0:aload_2         
		//    1    1:iload_3         
		//    2    2:invokestatic    #133 <Method View c(AppBarLayout, int)>
		//    3    5:astore          10
			if(view == null)
				break MISSING_BLOCK_LABEL_162;
		//    4    7:aload           10
		//    5    9:ifnull          162
			i1 = ((LayoutParams)view.getLayoutParams()).a();
		//    6   12:aload           10
		//    7   14:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    8   17:checkcast       #139 <Class AppBarLayout$LayoutParams>
		//    9   20:invokevirtual   #140 <Method int AppBarLayout$LayoutParams.a()>
		//   10   23:istore          6
			flag2 = false;
		//   11   25:iconst_0        
		//   12   26:istore          9
			flag1 = flag2;
		//   13   28:iload           9
		//   14   30:istore          8
			if((i1 & 1) == 0) goto _L2; else goto _L1
		//   15   32:iload           6
		//   16   34:iconst_1        
		//   17   35:iand            
		//   18   36:ifeq            123
_L1:
			int j1 = s.j(view);
		//   19   39:aload           10
		//   20   41:invokestatic    #146 <Method int s.j(View)>
		//   21   44:istore          7
			if(l <= 0 || (i1 & 0xc) == 0) goto _L4; else goto _L3
		//   22   46:iload           4
		//   23   48:ifle            87
		//   24   51:iload           6
		//   25   53:bipush          12
		//   26   55:iand            
		//   27   56:ifeq            87
_L3:
			flag1 = flag2;
		//   28   59:iload           9
		//   29   61:istore          8
			if(-k < view.getBottom() - j1 - appbarlayout.getTopInset()) goto _L2; else goto _L5
		//   30   63:iload_3         
		//   31   64:ineg            
		//   32   65:aload           10
		//   33   67:invokevirtual   #62  <Method int View.getBottom()>
		//   34   70:iload           7
		//   35   72:isub            
		//   36   73:aload_2         
		//   37   74:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
		//   38   77:isub            
		//   39   78:icmplt          123
_L5:
			flag1 = true;
		//   40   81:iconst_1        
		//   41   82:istore          8
			break; /* Loop/switch isn't completed */
		//   42   84:goto            123
_L4:
			flag1 = flag2;
		//   43   87:iload           9
		//   44   89:istore          8
			if((i1 & 2) == 0)
				break; /* Loop/switch isn't completed */
		//   45   91:iload           6
		//   46   93:iconst_2        
		//   47   94:iand            
		//   48   95:ifeq            123
			flag1 = flag2;
		//   49   98:iload           9
		//   50  100:istore          8
			if(-k < view.getBottom() - j1 - appbarlayout.getTopInset()) goto _L2; else goto _L5
		//   51  102:iload_3         
		//   52  103:ineg            
		//   53  104:aload           10
		//   54  106:invokevirtual   #62  <Method int View.getBottom()>
		//   55  109:iload           7
		//   56  111:isub            
		//   57  112:aload_2         
		//   58  113:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
		//   59  116:isub            
		//   60  117:icmplt          123
		//*  61  120:goto            81
_L2:
			flag1 = appbarlayout.a(flag1);
		//   62  123:aload_2         
		//   63  124:iload           8
		//   64  126:invokevirtual   #152 <Method boolean AppBarLayout.a(boolean)>
		//   65  129:istore          8
			if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && d(coordinatorlayout, appbarlayout)))
		//*  66  131:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
		//*  67  134:bipush          11
		//*  68  136:icmplt          162
		//*  69  139:iload           5
		//*  70  141:ifne            158
		//*  71  144:iload           8
		//*  72  146:ifeq            162
		//*  73  149:aload_0         
		//*  74  150:aload_1         
		//*  75  151:aload_2         
		//*  76  152:invokespecial   #160 <Method boolean d(CoordinatorLayout, AppBarLayout)>
		//*  77  155:ifeq            162
				appbarlayout.jumpDrawablesToCurrentState();
		//   78  158:aload_2         
		//   79  159:invokevirtual   #163 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
		//   80  162:return          
		}

		private static boolean a(int k, int l)
		{
			return (k & l) == l;
		//    0    0:iload_0         
		//    1    1:iload_1         
		//    2    2:iand            
		//    3    3:iload_1         
		//    4    4:icmpne          9
		//    5    7:iconst_1        
		//    6    8:ireturn         
		//    7    9:iconst_0        
		//    8   10:ireturn         
		}

		private int b(AppBarLayout appbarlayout, int k)
		{
			int j1 = Math.abs(k);
		//    0    0:iload_2         
		//    1    1:invokestatic    #71  <Method int Math.abs(int)>
		//    2    4:istore          6
			int k1 = appbarlayout.getChildCount();
		//    3    6:aload_1         
		//    4    7:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
		//    5   10:istore          7
			int i1 = 0;
		//    6   12:iconst_0        
		//    7   13:istore          5
			int l = 0;
		//    8   15:iconst_0        
		//    9   16:istore          4
			do
			{
				if(l >= k1)
					break;
		//   10   18:iload           4
		//   11   20:iload           7
		//   12   22:icmpge          217
				View view = appbarlayout.getChildAt(l);
		//   13   25:aload_1         
		//   14   26:iload           4
		//   15   28:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
		//   16   31:astore          8
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   17   33:aload           8
		//   18   35:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   19   38:checkcast       #139 <Class AppBarLayout$LayoutParams>
		//   20   41:astore          9
				Interpolator interpolator = layoutparams.b();
		//   21   43:aload           9
		//   22   45:invokevirtual   #167 <Method Interpolator AppBarLayout$LayoutParams.b()>
		//   23   48:astore          10
				if(j1 >= view.getTop() && j1 <= view.getBottom())
		//*  24   50:iload           6
		//*  25   52:aload           8
		//*  26   54:invokevirtual   #59  <Method int View.getTop()>
		//*  27   57:icmplt          208
		//*  28   60:iload           6
		//*  29   62:aload           8
		//*  30   64:invokevirtual   #62  <Method int View.getBottom()>
		//*  31   67:icmpgt          208
				{
					if(interpolator != null)
		//*  32   70:aload           10
		//*  33   72:ifnull          217
					{
						int l1 = layoutparams.a();
		//   34   75:aload           9
		//   35   77:invokevirtual   #140 <Method int AppBarLayout$LayoutParams.a()>
		//   36   80:istore          7
						l = i1;
		//   37   82:iload           5
		//   38   84:istore          4
						if((l1 & 1) != 0)
		//*  39   86:iload           7
		//*  40   88:iconst_1        
		//*  41   89:iand            
		//*  42   90:ifeq            135
						{
							i1 = 0 + (view.getHeight() + layoutparams.topMargin + layoutparams.bottomMargin);
		//   43   93:iconst_0        
		//   44   94:aload           8
		//   45   96:invokevirtual   #168 <Method int View.getHeight()>
		//   46   99:aload           9
		//   47  101:getfield        #171 <Field int AppBarLayout$LayoutParams.topMargin>
		//   48  104:iadd            
		//   49  105:aload           9
		//   50  107:getfield        #174 <Field int AppBarLayout$LayoutParams.bottomMargin>
		//   51  110:iadd            
		//   52  111:iadd            
		//   53  112:istore          5
							l = i1;
		//   54  114:iload           5
		//   55  116:istore          4
							if((l1 & 2) != 0)
		//*  56  118:iload           7
		//*  57  120:iconst_2        
		//*  58  121:iand            
		//*  59  122:ifeq            135
								l = i1 - s.j(view);
		//   60  125:iload           5
		//   61  127:aload           8
		//   62  129:invokestatic    #146 <Method int s.j(View)>
		//   63  132:isub            
		//   64  133:istore          4
						}
						i1 = l;
		//   65  135:iload           4
		//   66  137:istore          5
						if(s.q(view))
		//*  67  139:aload           8
		//*  68  141:invokestatic    #178 <Method boolean s.q(View)>
		//*  69  144:ifeq            156
							i1 = l - appbarlayout.getTopInset();
		//   70  147:iload           4
		//   71  149:aload_1         
		//   72  150:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
		//   73  153:isub            
		//   74  154:istore          5
						if(i1 > 0)
		//*  75  156:iload           5
		//*  76  158:ifle            217
						{
							l = view.getTop();
		//   77  161:aload           8
		//   78  163:invokevirtual   #59  <Method int View.getTop()>
		//   79  166:istore          4
							float f1 = i1;
		//   80  168:iload           5
		//   81  170:i2f             
		//   82  171:fstore_3        
							l = Math.round(f1 * interpolator.getInterpolation((float)(j1 - l) / f1));
		//   83  172:fload_3         
		//   84  173:aload           10
		//   85  175:iload           6
		//   86  177:iload           4
		//   87  179:isub            
		//   88  180:i2f             
		//   89  181:fload_3         
		//   90  182:fdiv            
		//   91  183:invokeinterface #183 <Method float Interpolator.getInterpolation(float)>
		//   92  188:fmul            
		//   93  189:invokestatic    #79  <Method int Math.round(float)>
		//   94  192:istore          4
							return Integer.signum(k) * (view.getTop() + l);
		//   95  194:iload_2         
		//   96  195:invokestatic    #188 <Method int Integer.signum(int)>
		//   97  198:aload           8
		//   98  200:invokevirtual   #59  <Method int View.getTop()>
		//   99  203:iload           4
		//  100  205:iadd            
		//  101  206:imul            
		//  102  207:ireturn         
						}
					}
					break;
				}
				l++;
		//  103  208:iload           4
		//  104  210:iconst_1        
		//  105  211:iadd            
		//  106  212:istore          4
			} while(true);
		//  107  214:goto            18
			return k;
		//  108  217:iload_2         
		//  109  218:ireturn         
		}

		private static View c(AppBarLayout appbarlayout, int k)
		{
			int l = Math.abs(k);
		//    0    0:iload_1         
		//    1    1:invokestatic    #71  <Method int Math.abs(int)>
		//    2    4:istore_2        
			int i1 = appbarlayout.getChildCount();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
		//    5    9:istore_3        
			for(k = 0; k < i1; k++)
		//*   6   10:iconst_0        
		//*   7   11:istore_1        
		//*   8   12:iload_1         
		//*   9   13:iload_3         
		//*  10   14:icmpge          52
			{
				View view = appbarlayout.getChildAt(k);
		//   11   17:aload_0         
		//   12   18:iload_1         
		//   13   19:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
		//   14   22:astore          4
				if(l >= view.getTop() && l <= view.getBottom())
		//*  15   24:iload_2         
		//*  16   25:aload           4
		//*  17   27:invokevirtual   #59  <Method int View.getTop()>
		//*  18   30:icmplt          45
		//*  19   33:iload_2         
		//*  20   34:aload           4
		//*  21   36:invokevirtual   #62  <Method int View.getBottom()>
		//*  22   39:icmpgt          45
					return view;
		//   23   42:aload           4
		//   24   44:areturn         
			}

		//   25   45:iload_1         
		//   26   46:iconst_1        
		//   27   47:iadd            
		//   28   48:istore_1        
		//*  29   49:goto            12
			return null;
		//   30   52:aconst_null     
		//   31   53:areturn         
		}

		private void c(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			int k1 = a();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #65  <Method int a()>
		//    2    4:istore          7
			int i1 = a(appbarlayout, k1);
		//    3    6:aload_0         
		//    4    7:aload_2         
		//    5    8:iload           7
		//    6   10:invokespecial   #191 <Method int a(AppBarLayout, int)>
		//    7   13:istore          5
			if(i1 >= 0)
		//*   8   15:iload           5
		//*   9   17:iflt            193
			{
				View view = appbarlayout.getChildAt(i1);
		//   10   20:aload_2         
		//   11   21:iload           5
		//   12   23:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
		//   13   26:astore          9
				int l1 = ((LayoutParams)view.getLayoutParams()).a();
		//   14   28:aload           9
		//   15   30:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   16   33:checkcast       #139 <Class AppBarLayout$LayoutParams>
		//   17   36:invokevirtual   #140 <Method int AppBarLayout$LayoutParams.a()>
		//   18   39:istore          8
				if((l1 & 0x11) == 17)
		//*  19   41:iload           8
		//*  20   43:bipush          17
		//*  21   45:iand            
		//*  22   46:bipush          17
		//*  23   48:icmpne          193
				{
					int j1 = -view.getTop();
		//   24   51:aload           9
		//   25   53:invokevirtual   #59  <Method int View.getTop()>
		//   26   56:ineg            
		//   27   57:istore          6
					int k = -view.getBottom();
		//   28   59:aload           9
		//   29   61:invokevirtual   #62  <Method int View.getBottom()>
		//   30   64:ineg            
		//   31   65:istore_3        
					int l = k;
		//   32   66:iload_3         
		//   33   67:istore          4
					if(i1 == appbarlayout.getChildCount() - 1)
		//*  34   69:iload           5
		//*  35   71:aload_2         
		//*  36   72:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
		//*  37   75:iconst_1        
		//*  38   76:isub            
		//*  39   77:icmpne          88
						l = k + appbarlayout.getTopInset();
		//   40   80:iload_3         
		//   41   81:aload_2         
		//   42   82:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
		//   43   85:iadd            
		//   44   86:istore          4
					if(a(l1, 2))
		//*  45   88:iload           8
		//*  46   90:iconst_2        
		//*  47   91:invokestatic    #193 <Method boolean a(int, int)>
		//*  48   94:ifeq            113
					{
						k = l + s.j(view);
		//   49   97:iload           4
		//   50   99:aload           9
		//   51  101:invokestatic    #146 <Method int s.j(View)>
		//   52  104:iadd            
		//   53  105:istore_3        
						i1 = j1;
		//   54  106:iload           6
		//   55  108:istore          5
					} else
		//*  56  110:goto            157
					{
						i1 = j1;
		//   57  113:iload           6
		//   58  115:istore          5
						k = l;
		//   59  117:iload           4
		//   60  119:istore_3        
						if(a(l1, 5))
		//*  61  120:iload           8
		//*  62  122:iconst_5        
		//*  63  123:invokestatic    #193 <Method boolean a(int, int)>
		//*  64  126:ifeq            157
						{
							k = s.j(view) + l;
		//   65  129:aload           9
		//   66  131:invokestatic    #146 <Method int s.j(View)>
		//   67  134:iload           4
		//   68  136:iadd            
		//   69  137:istore_3        
							if(k1 < k)
		//*  70  138:iload           7
		//*  71  140:iload_3         
		//*  72  141:icmpge          153
							{
								i1 = k;
		//   73  144:iload_3         
		//   74  145:istore          5
								k = l;
		//   75  147:iload           4
		//   76  149:istore_3        
							} else
		//*  77  150:goto            157
							{
								i1 = j1;
		//   78  153:iload           6
		//   79  155:istore          5
							}
						}
					}
					l = i1;
		//   80  157:iload           5
		//   81  159:istore          4
					if(k1 < (k + i1) / 2)
		//*  82  161:iload           7
		//*  83  163:iload_3         
		//*  84  164:iload           5
		//*  85  166:iadd            
		//*  86  167:iconst_2        
		//*  87  168:idiv            
		//*  88  169:icmpge          175
						l = k;
		//   89  172:iload_3         
		//   90  173:istore          4
					a(coordinatorlayout, appbarlayout, android.support.v4.c.a.a(l, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
		//   91  175:aload_0         
		//   92  176:aload_1         
		//   93  177:aload_2         
		//   94  178:iload           4
		//   95  180:aload_2         
		//   96  181:invokevirtual   #196 <Method int AppBarLayout.getTotalScrollRange()>
		//   97  184:ineg            
		//   98  185:iconst_0        
		//   99  186:invokestatic    #201 <Method int android.support.v4.c.a.a(int, int, int)>
		//  100  189:fconst_0        
		//  101  190:invokespecial   #203 <Method void a(CoordinatorLayout, AppBarLayout, int, float)>
				}
			}
		//  102  193:return          
		}

		private boolean d(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			coordinatorlayout = ((CoordinatorLayout) (coordinatorlayout.d(((View) (appbarlayout)))));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #208 <Method List CoordinatorLayout.d(View)>
		//    3    5:astore_1        
			int l = ((List) (coordinatorlayout)).size();
		//    4    6:aload_1         
		//    5    7:invokeinterface #213 <Method int List.size()>
		//    6   12:istore          4
			boolean flag = false;
		//    7   14:iconst_0        
		//    8   15:istore          5
			for(int k = 0; k < l; k++)
		//*   9   17:iconst_0        
		//*  10   18:istore_3        
		//*  11   19:iload_3         
		//*  12   20:iload           4
		//*  13   22:icmpge          75
			{
				appbarlayout = ((AppBarLayout) (((CoordinatorLayout.c)((View)((List) (coordinatorlayout)).get(k)).getLayoutParams()).b()));
		//   14   25:aload_1         
		//   15   26:iload_3         
		//   16   27:invokeinterface #217 <Method Object List.get(int)>
		//   17   32:checkcast       #56  <Class View>
		//   18   35:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   19   38:checkcast       #219 <Class CoordinatorLayout$c>
		//   20   41:invokevirtual   #222 <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
		//   21   44:astore_2        
				if(appbarlayout instanceof ScrollingViewBehavior)
		//*  22   45:aload_2         
		//*  23   46:instanceof      #224 <Class AppBarLayout$ScrollingViewBehavior>
		//*  24   49:ifeq            68
				{
					if(((ScrollingViewBehavior)appbarlayout).d() != 0)
		//*  25   52:aload_2         
		//*  26   53:checkcast       #224 <Class AppBarLayout$ScrollingViewBehavior>
		//*  27   56:invokevirtual   #226 <Method int AppBarLayout$ScrollingViewBehavior.d()>
		//*  28   59:ifeq            65
						flag = true;
		//   29   62:iconst_1        
		//   30   63:istore          5
					return flag;
		//   31   65:iload           5
		//   32   67:ireturn         
				}
			}

		//   33   68:iload_3         
		//   34   69:iconst_1        
		//   35   70:iadd            
		//   36   71:istore_3        
		//*  37   72:goto            19
			return false;
		//   38   75:iconst_0        
		//   39   76:ireturn         
		}

		int a()
		{
			return b() + b;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #228 <Method int b()>
		//    2    4:aload_0         
		//    3    5:getfield        #45  <Field int b>
		//    4    8:iadd            
		//    5    9:ireturn         
		}

		int a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int k, int l, int i1)
		{
			int j1 = a();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #65  <Method int a()>
		//    2    4:istore          6
			if(l != 0 && j1 >= l && j1 <= i1)
		//*   3    6:iload           4
		//*   4    8:ifeq            133
		//*   5   11:iload           6
		//*   6   13:iload           4
		//*   7   15:icmplt          133
		//*   8   18:iload           6
		//*   9   20:iload           5
		//*  10   22:icmpgt          133
			{
				l = android.support.v4.c.a.a(k, l, i1);
		//   11   25:iload_3         
		//   12   26:iload           4
		//   13   28:iload           5
		//   14   30:invokestatic    #201 <Method int android.support.v4.c.a.a(int, int, int)>
		//   15   33:istore          4
				if(j1 != l)
		//*  16   35:iload           6
		//*  17   37:iload           4
		//*  18   39:icmpeq          138
				{
					if(appbarlayout.b())
		//*  19   42:aload_2         
		//*  20   43:invokevirtual   #231 <Method boolean AppBarLayout.b()>
		//*  21   46:ifeq            60
						k = b(appbarlayout, l);
		//   22   49:aload_0         
		//   23   50:aload_2         
		//   24   51:iload           4
		//   25   53:invokespecial   #233 <Method int b(AppBarLayout, int)>
		//   26   56:istore_3        
					else
		//*  27   57:goto            63
						k = l;
		//   28   60:iload           4
		//   29   62:istore_3        
					boolean flag = a(k);
		//   30   63:aload_0         
		//   31   64:iload_3         
		//   32   65:invokevirtual   #236 <Method boolean a(int)>
		//   33   68:istore          7
					b = l - k;
		//   34   70:aload_0         
		//   35   71:iload           4
		//   36   73:iload_3         
		//   37   74:isub            
		//   38   75:putfield        #45  <Field int b>
					if(!flag && appbarlayout.b())
		//*  39   78:iload           7
		//*  40   80:ifne            95
		//*  41   83:aload_2         
		//*  42   84:invokevirtual   #231 <Method boolean AppBarLayout.b()>
		//*  43   87:ifeq            95
						coordinatorlayout.b(((View) (appbarlayout)));
		//   44   90:aload_1         
		//   45   91:aload_2         
		//   46   92:invokevirtual   #239 <Method void CoordinatorLayout.b(View)>
					appbarlayout.a(b());
		//   47   95:aload_2         
		//   48   96:aload_0         
		//   49   97:invokevirtual   #228 <Method int b()>
		//   50  100:invokevirtual   #242 <Method void AppBarLayout.a(int)>
					if(l < j1)
		//*  51  103:iload           4
		//*  52  105:iload           6
		//*  53  107:icmpge          115
						k = -1;
		//   54  110:iconst_m1       
		//   55  111:istore_3        
					else
		//*  56  112:goto            117
						k = 1;
		//   57  115:iconst_1        
		//   58  116:istore_3        
					a(coordinatorlayout, appbarlayout, l, k, false);
		//   59  117:aload_0         
		//   60  118:aload_1         
		//   61  119:aload_2         
		//   62  120:iload           4
		//   63  122:iload_3         
		//   64  123:iconst_0        
		//   65  124:invokespecial   #244 <Method void a(CoordinatorLayout, AppBarLayout, int, int, boolean)>
					return j1 - l;
		//   66  127:iload           6
		//   67  129:iload           4
		//   68  131:isub            
		//   69  132:ireturn         
				}
			} else
			{
				b = 0;
		//   70  133:aload_0         
		//   71  134:iconst_0        
		//   72  135:putfield        #45  <Field int b>
			}
			return 0;
		//   73  138:iconst_0        
		//   74  139:ireturn         
		}

		volatile int a(CoordinatorLayout coordinatorlayout, View view, int k, int l, int i1)
		{
			return a(coordinatorlayout, (AppBarLayout)view, k, l, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:iload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:invokevirtual   #247 <Method int a(CoordinatorLayout, AppBarLayout, int, int, int)>
		//    8   14:ireturn         
		}

		int a(View view)
		{
			return c((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #250 <Method int c(AppBarLayout)>
		//    4    8:ireturn         
		}

		void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			c(coordinatorlayout, appbarlayout);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #252 <Method void c(CoordinatorLayout, AppBarLayout)>
		//    4    6:return          
		}

		public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, Parcelable parcelable)
		{
			if(parcelable instanceof SavedState)
		//*   0    0:aload_3         
		//*   1    1:instanceof      #12  <Class AppBarLayout$Behavior$SavedState>
		//*   2    4:ifeq            47
			{
				parcelable = ((Parcelable) ((SavedState)parcelable));
		//    3    7:aload_3         
		//    4    8:checkcast       #12  <Class AppBarLayout$Behavior$SavedState>
		//    5   11:astore_3        
				super.a(coordinatorlayout, ((View) (appbarlayout)), ((SavedState) (parcelable)).a());
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:aload_3         
		//   10   16:invokevirtual   #256 <Method Parcelable AppBarLayout$Behavior$SavedState.a()>
		//   11   19:invokespecial   #259 <Method void HeaderBehavior.a(CoordinatorLayout, View, Parcelable)>
				d = ((SavedState) (parcelable)).a;
		//   12   22:aload_0         
		//   13   23:aload_3         
		//   14   24:getfield        #261 <Field int AppBarLayout$Behavior$SavedState.a>
		//   15   27:putfield        #38  <Field int d>
				f = ((SavedState) (parcelable)).b;
		//   16   30:aload_0         
		//   17   31:aload_3         
		//   18   32:getfield        #263 <Field float AppBarLayout$Behavior$SavedState.b>
		//   19   35:putfield        #265 <Field float f>
				e = ((SavedState) (parcelable)).c;
		//   20   38:aload_0         
		//   21   39:aload_3         
		//   22   40:getfield        #267 <Field boolean AppBarLayout$Behavior$SavedState.c>
		//   23   43:putfield        #269 <Field boolean e>
				return;
		//   24   46:return          
			} else
			{
				super.a(coordinatorlayout, ((View) (appbarlayout)), parcelable);
		//   25   47:aload_0         
		//   26   48:aload_1         
		//   27   49:aload_2         
		//   28   50:aload_3         
		//   29   51:invokespecial   #259 <Method void HeaderBehavior.a(CoordinatorLayout, View, Parcelable)>
				d = -1;
		//   30   54:aload_0         
		//   31   55:iconst_m1       
		//   32   56:putfield        #38  <Field int d>
				return;
		//   33   59:return          
			}
		}

		public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int k)
		{
			if(k == 0)
		//*   0    0:iload           4
		//*   1    2:ifne            11
				c(coordinatorlayout, appbarlayout);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokespecial   #252 <Method void c(CoordinatorLayout, AppBarLayout)>
			g = new WeakReference(((Object) (view)));
		//    6   11:aload_0         
		//    7   12:new             #272 <Class WeakReference>
		//    8   15:dup             
		//    9   16:aload_3         
		//   10   17:invokespecial   #275 <Method void WeakReference(Object)>
		//   11   20:putfield        #277 <Field WeakReference g>
		//   12   23:return          
		}

		public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int k, int l, int i1, int j1, 
				int k1)
		{
			if(j1 < 0)
		//*   0    0:iload           7
		//*   1    2:ifge            20
				b(coordinatorlayout, ((View) (appbarlayout)), j1, -appbarlayout.getDownNestedScrollRange(), 0);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:iload           7
		//    6   10:aload_2         
		//    7   11:invokevirtual   #281 <Method int AppBarLayout.getDownNestedScrollRange()>
		//    8   14:ineg            
		//    9   15:iconst_0        
		//   10   16:invokevirtual   #283 <Method int b(CoordinatorLayout, View, int, int, int)>
		//   11   19:pop             
		//   12   20:return          
		}

		public void a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int k, int l, int ai[], int i1)
		{
			if(l != 0)
		//*   0    0:iload           5
		//*   1    2:ifeq            70
			{
				if(l < 0)
		//*   2    5:iload           5
		//*   3    7:ifge            37
				{
					i1 = -appbarlayout.getTotalScrollRange();
		//    4   10:aload_2         
		//    5   11:invokevirtual   #196 <Method int AppBarLayout.getTotalScrollRange()>
		//    6   14:ineg            
		//    7   15:istore          7
					int j1 = appbarlayout.getDownNestedPreScrollRange();
		//    8   17:aload_2         
		//    9   18:invokevirtual   #287 <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   10   21:istore          8
					k = i1;
		//   11   23:iload           7
		//   12   25:istore          4
					i1 = j1 + i1;
		//   13   27:iload           8
		//   14   29:iload           7
		//   15   31:iadd            
		//   16   32:istore          7
				} else
		//*  17   34:goto            47
				{
					k = -appbarlayout.getUpNestedPreScrollRange();
		//   18   37:aload_2         
		//   19   38:invokevirtual   #290 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   20   41:ineg            
		//   21   42:istore          4
					i1 = 0;
		//   22   44:iconst_0        
		//   23   45:istore          7
				}
				if(k != i1)
		//*  24   47:iload           4
		//*  25   49:iload           7
		//*  26   51:icmpeq          70
					ai[1] = b(coordinatorlayout, ((View) (appbarlayout)), l, k, i1);
		//   27   54:aload           6
		//   28   56:iconst_1        
		//   29   57:aload_0         
		//   30   58:aload_1         
		//   31   59:aload_2         
		//   32   60:iload           5
		//   33   62:iload           4
		//   34   64:iload           7
		//   35   66:invokevirtual   #283 <Method int b(CoordinatorLayout, View, int, int, int)>
		//   36   69:iastore         
			}
		//   37   70:return          
		}

		volatile void a(CoordinatorLayout coordinatorlayout, View view)
		{
			a(coordinatorlayout, (AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:invokevirtual   #293 <Method void a(CoordinatorLayout, AppBarLayout)>
		//    5    9:return          
		}

		public volatile void a(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
		{
			a(coordinatorlayout, (AppBarLayout)view, parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #295 <Method void a(CoordinatorLayout, AppBarLayout, Parcelable)>
		//    6   10:return          
		}

		public volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1, int k)
		{
			a(coordinatorlayout, (AppBarLayout)view, view1, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:invokevirtual   #298 <Method void a(CoordinatorLayout, AppBarLayout, View, int)>
		//    7   12:return          
		}

		public volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1, int k, int l, int i1, int j1, 
				int k1)
		{
			a(coordinatorlayout, (AppBarLayout)view, view1, k, l, i1, j1, k1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:iload           6
		//    8   13:iload           7
		//    9   15:iload           8
		//   10   17:invokevirtual   #301 <Method void a(CoordinatorLayout, AppBarLayout, View, int, int, int, int, int)>
		//   11   20:return          
		}

		public volatile void a(CoordinatorLayout coordinatorlayout, View view, View view1, int k, int l, int ai[], int i1)
		{
			a(coordinatorlayout, (AppBarLayout)view, view1, k, l, ai, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:aload           6
		//    8   13:iload           7
		//    9   15:invokevirtual   #304 <Method void a(CoordinatorLayout, AppBarLayout, View, int, int, int[], int)>
		//   10   18:return          
		}

		public volatile boolean a(int k)
		{
			return super.a(k);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #305 <Method boolean HeaderBehavior.a(int)>
		//    3    5:ireturn         
		}

		boolean a(AppBarLayout appbarlayout)
		{
			if(h != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #308 <Field AppBarLayout$Behavior$a h>
		//*   2    4:ifnull          16
				return h.a(appbarlayout);
		//    3    7:aload_0         
		//    4    8:getfield        #308 <Field AppBarLayout$Behavior$a h>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #310 <Method boolean AppBarLayout$Behavior$a.a(AppBarLayout)>
		//    7   15:ireturn         
			appbarlayout = ((AppBarLayout) (g));
		//    8   16:aload_0         
		//    9   17:getfield        #277 <Field WeakReference g>
		//   10   20:astore_1        
			boolean flag = true;
		//   11   21:iconst_1        
		//   12   22:istore_2        
			if(appbarlayout != null)
		//*  13   23:aload_1         
		//*  14   24:ifnull          61
			{
				appbarlayout = ((AppBarLayout) ((View)g.get()));
		//   15   27:aload_0         
		//   16   28:getfield        #277 <Field WeakReference g>
		//   17   31:invokevirtual   #313 <Method Object WeakReference.get()>
		//   18   34:checkcast       #56  <Class View>
		//   19   37:astore_1        
				if(appbarlayout != null && ((View) (appbarlayout)).isShown() && !((View) (appbarlayout)).canScrollVertically(-1))
		//*  20   38:aload_1         
		//*  21   39:ifnull          59
		//*  22   42:aload_1         
		//*  23   43:invokevirtual   #316 <Method boolean View.isShown()>
		//*  24   46:ifeq            59
		//*  25   49:aload_1         
		//*  26   50:iconst_m1       
		//*  27   51:invokevirtual   #319 <Method boolean View.canScrollVertically(int)>
		//*  28   54:ifne            59
					return true;
		//   29   57:iconst_1        
		//   30   58:ireturn         
				flag = false;
		//   31   59:iconst_0        
		//   32   60:istore_2        
			}
			return flag;
		//   33   61:iload_2         
		//   34   62:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int k)
		{
			boolean flag = super.a(coordinatorlayout, ((View) (appbarlayout)), k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #323 <Method boolean HeaderBehavior.a(CoordinatorLayout, View, int)>
		//    5    7:istore          5
			int l = appbarlayout.getPendingAction();
		//    6    9:aload_2         
		//    7   10:invokevirtual   #326 <Method int AppBarLayout.getPendingAction()>
		//    8   13:istore          4
			if(d >= 0 && (l & 8) == 0)
		//*   9   15:aload_0         
		//*  10   16:getfield        #38  <Field int d>
		//*  11   19:iflt            101
		//*  12   22:iload           4
		//*  13   24:bipush          8
		//*  14   26:iand            
		//*  15   27:ifne            101
			{
				View view = appbarlayout.getChildAt(d);
		//   16   30:aload_2         
		//   17   31:aload_0         
		//   18   32:getfield        #38  <Field int d>
		//   19   35:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
		//   20   38:astore          6
				l = -view.getBottom();
		//   21   40:aload           6
		//   22   42:invokevirtual   #62  <Method int View.getBottom()>
		//   23   45:ineg            
		//   24   46:istore          4
				if(e)
		//*  25   48:aload_0         
		//*  26   49:getfield        #269 <Field boolean e>
		//*  27   52:ifeq            69
					k = s.j(view) + appbarlayout.getTopInset();
		//   28   55:aload           6
		//   29   57:invokestatic    #146 <Method int s.j(View)>
		//   30   60:aload_2         
		//   31   61:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
		//   32   64:iadd            
		//   33   65:istore_3        
				else
		//*  34   66:goto            87
					k = Math.round((float)view.getHeight() * f);
		//   35   69:aload           6
		//   36   71:invokevirtual   #168 <Method int View.getHeight()>
		//   37   74:i2f             
		//   38   75:aload_0         
		//   39   76:getfield        #265 <Field float f>
		//   40   79:fmul            
		//   41   80:invokestatic    #79  <Method int Math.round(float)>
		//   42   83:istore_3        
		//*  43   84:goto            66
				a_(coordinatorlayout, ((View) (appbarlayout)), l + k);
		//   44   87:aload_0         
		//   45   88:aload_1         
		//   46   89:aload_2         
		//   47   90:iload           4
		//   48   92:iload_3         
		//   49   93:iadd            
		//   50   94:invokevirtual   #330 <Method int a_(CoordinatorLayout, View, int)>
		//   51   97:pop             
			} else
		//*  52   98:goto            192
			if(l != 0)
		//*  53  101:iload           4
		//*  54  103:ifeq            192
			{
				if((l & 4) != 0)
		//*  55  106:iload           4
		//*  56  108:iconst_4        
		//*  57  109:iand            
		//*  58  110:ifeq            118
					k = 1;
		//   59  113:iconst_1        
		//   60  114:istore_3        
				else
		//*  61  115:goto            120
					k = 0;
		//   62  118:iconst_0        
		//   63  119:istore_3        
				if((l & 2) != 0)
		//*  64  120:iload           4
		//*  65  122:iconst_2        
		//*  66  123:iand            
		//*  67  124:ifeq            162
				{
					l = -appbarlayout.getUpNestedPreScrollRange();
		//   68  127:aload_2         
		//   69  128:invokevirtual   #290 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   70  131:ineg            
		//   71  132:istore          4
					if(k != 0)
		//*  72  134:iload_3         
		//*  73  135:ifeq            150
						a(coordinatorlayout, appbarlayout, l, 0.0F);
		//   74  138:aload_0         
		//   75  139:aload_1         
		//   76  140:aload_2         
		//   77  141:iload           4
		//   78  143:fconst_0        
		//   79  144:invokespecial   #203 <Method void a(CoordinatorLayout, AppBarLayout, int, float)>
					else
		//*  80  147:goto            192
						a_(coordinatorlayout, ((View) (appbarlayout)), l);
		//   81  150:aload_0         
		//   82  151:aload_1         
		//   83  152:aload_2         
		//   84  153:iload           4
		//   85  155:invokevirtual   #330 <Method int a_(CoordinatorLayout, View, int)>
		//   86  158:pop             
				} else
		//*  87  159:goto            192
				if((l & 1) != 0)
		//*  88  162:iload           4
		//*  89  164:iconst_1        
		//*  90  165:iand            
		//*  91  166:ifeq            192
					if(k != 0)
		//*  92  169:iload_3         
		//*  93  170:ifeq            184
						a(coordinatorlayout, appbarlayout, 0, 0.0F);
		//   94  173:aload_0         
		//   95  174:aload_1         
		//   96  175:aload_2         
		//   97  176:iconst_0        
		//   98  177:fconst_0        
		//   99  178:invokespecial   #203 <Method void a(CoordinatorLayout, AppBarLayout, int, float)>
					else
		//* 100  181:goto            192
						a_(coordinatorlayout, ((View) (appbarlayout)), 0);
		//  101  184:aload_0         
		//  102  185:aload_1         
		//  103  186:aload_2         
		//  104  187:iconst_0        
		//  105  188:invokevirtual   #330 <Method int a_(CoordinatorLayout, View, int)>
		//  106  191:pop             
			}
			appbarlayout.d();
		//  107  192:aload_2         
		//  108  193:invokevirtual   #332 <Method void AppBarLayout.d()>
			d = -1;
		//  109  196:aload_0         
		//  110  197:iconst_m1       
		//  111  198:putfield        #38  <Field int d>
			a(android.support.v4.c.a.a(b(), -appbarlayout.getTotalScrollRange(), 0));
		//  112  201:aload_0         
		//  113  202:aload_0         
		//  114  203:invokevirtual   #228 <Method int b()>
		//  115  206:aload_2         
		//  116  207:invokevirtual   #196 <Method int AppBarLayout.getTotalScrollRange()>
		//  117  210:ineg            
		//  118  211:iconst_0        
		//  119  212:invokestatic    #201 <Method int android.support.v4.c.a.a(int, int, int)>
		//  120  215:invokevirtual   #236 <Method boolean a(int)>
		//  121  218:pop             
			a(coordinatorlayout, appbarlayout, b(), 0, true);
		//  122  219:aload_0         
		//  123  220:aload_1         
		//  124  221:aload_2         
		//  125  222:aload_0         
		//  126  223:invokevirtual   #228 <Method int b()>
		//  127  226:iconst_0        
		//  128  227:iconst_1        
		//  129  228:invokespecial   #244 <Method void a(CoordinatorLayout, AppBarLayout, int, int, boolean)>
			appbarlayout.a(b());
		//  130  231:aload_2         
		//  131  232:aload_0         
		//  132  233:invokevirtual   #228 <Method int b()>
		//  133  236:invokevirtual   #242 <Method void AppBarLayout.a(int)>
			return flag;
		//  134  239:iload           5
		//  135  241:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int k, int l, int i1, int j1)
		{
			if(((CoordinatorLayout.c)appbarlayout.getLayoutParams()).height == -2)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
		//*   2    4:checkcast       #219 <Class CoordinatorLayout$c>
		//*   3    7:getfield        #337 <Field int CoordinatorLayout$c.height>
		//*   4   10:bipush          -2
		//*   5   12:icmpne          32
			{
				coordinatorlayout.a(((View) (appbarlayout)), k, l, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), j1);
		//    6   15:aload_1         
		//    7   16:aload_2         
		//    8   17:iload_3         
		//    9   18:iload           4
		//   10   20:iconst_0        
		//   11   21:iconst_0        
		//   12   22:invokestatic    #342 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   13   25:iload           6
		//   14   27:invokevirtual   #345 <Method void CoordinatorLayout.a(View, int, int, int, int)>
				return true;
		//   15   30:iconst_1        
		//   16   31:ireturn         
			} else
			{
				return super.a(coordinatorlayout, ((View) (appbarlayout)), k, l, i1, j1);
		//   17   32:aload_0         
		//   18   33:aload_1         
		//   19   34:aload_2         
		//   20   35:iload_3         
		//   21   36:iload           4
		//   22   38:iload           5
		//   23   40:iload           6
		//   24   42:invokespecial   #348 <Method boolean HeaderBehavior.a(CoordinatorLayout, View, int, int, int, int)>
		//   25   45:ireturn         
			}
		}

		public boolean a(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int k, int l)
		{
			boolean flag;
			if((k & 2) != 0 && appbarlayout.c() && coordinatorlayout.getHeight() - view.getHeight() <= appbarlayout.getHeight())
		//*   0    0:iload           5
		//*   1    2:iconst_2        
		//*   2    3:iand            
		//*   3    4:ifeq            36
		//*   4    7:aload_2         
		//*   5    8:invokevirtual   #351 <Method boolean AppBarLayout.c()>
		//*   6   11:ifeq            36
		//*   7   14:aload_1         
		//*   8   15:invokevirtual   #352 <Method int CoordinatorLayout.getHeight()>
		//*   9   18:aload_3         
		//*  10   19:invokevirtual   #168 <Method int View.getHeight()>
		//*  11   22:isub            
		//*  12   23:aload_2         
		//*  13   24:invokevirtual   #82  <Method int AppBarLayout.getHeight()>
		//*  14   27:icmpgt          36
				flag = true;
		//   15   30:iconst_1        
		//   16   31:istore          7
			else
		//*  17   33:goto            39
				flag = false;
		//   18   36:iconst_0        
		//   19   37:istore          7
			if(flag && c != null)
		//*  20   39:iload           7
		//*  21   41:ifeq            58
		//*  22   44:aload_0         
		//*  23   45:getfield        #88  <Field ValueAnimator c>
		//*  24   48:ifnull          58
				c.cancel();
		//   25   51:aload_0         
		//   26   52:getfield        #88  <Field ValueAnimator c>
		//   27   55:invokevirtual   #97  <Method void ValueAnimator.cancel()>
			g = null;
		//   28   58:aload_0         
		//   29   59:aconst_null     
		//   30   60:putfield        #277 <Field WeakReference g>
			return flag;
		//   31   63:iload           7
		//   32   65:ireturn         
		}

		public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int k)
		{
			return a(coordinatorlayout, (AppBarLayout)view, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:iload_3         
		//    5    7:invokevirtual   #354 <Method boolean a(CoordinatorLayout, AppBarLayout, int)>
		//    6   10:ireturn         
		}

		public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int k, int l, int i1, int j1)
		{
			return a(coordinatorlayout, (AppBarLayout)view, k, l, i1, j1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:iload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:iload           6
		//    8   13:invokevirtual   #356 <Method boolean a(CoordinatorLayout, AppBarLayout, int, int, int, int)>
		//    9   16:ireturn         
		}

		public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int k, int l)
		{
			return a(coordinatorlayout, (AppBarLayout)view, view1, view2, k, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:iload           5
		//    7   11:iload           6
		//    8   13:invokevirtual   #359 <Method boolean a(CoordinatorLayout, AppBarLayout, View, View, int, int)>
		//    9   16:ireturn         
		}

		public volatile int b()
		{
			return super.b();
		//    0    0:aload_0         
		//    1    1:invokespecial   #360 <Method int HeaderBehavior.b()>
		//    2    4:ireturn         
		}

		int b(AppBarLayout appbarlayout)
		{
			return -appbarlayout.getDownNestedScrollRange();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #281 <Method int AppBarLayout.getDownNestedScrollRange()>
		//    2    4:ineg            
		//    3    5:ireturn         
		}

		volatile int b(View view)
		{
			return b((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #362 <Method int b(AppBarLayout)>
		//    4    8:ireturn         
		}

		public Parcelable b(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			Object obj = ((Object) (super.b(coordinatorlayout, ((View) (appbarlayout)))));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #366 <Method Parcelable HeaderBehavior.b(CoordinatorLayout, View)>
		//    4    6:astore          8
			int l = b();
		//    5    8:aload_0         
		//    6    9:invokevirtual   #228 <Method int b()>
		//    7   12:istore          4
			int i1 = appbarlayout.getChildCount();
		//    8   14:aload_2         
		//    9   15:invokevirtual   #50  <Method int AppBarLayout.getChildCount()>
		//   10   18:istore          5
			boolean flag = false;
		//   11   20:iconst_0        
		//   12   21:istore          7
			for(int k = 0; k < i1; k++)
		//*  13   23:iconst_0        
		//*  14   24:istore_3        
		//*  15   25:iload_3         
		//*  16   26:iload           5
		//*  17   28:icmpge          126
			{
				coordinatorlayout = ((CoordinatorLayout) (appbarlayout.getChildAt(k)));
		//   18   31:aload_2         
		//   19   32:iload_3         
		//   20   33:invokevirtual   #54  <Method View AppBarLayout.getChildAt(int)>
		//   21   36:astore_1        
				int j1 = ((View) (coordinatorlayout)).getBottom() + l;
		//   22   37:aload_1         
		//   23   38:invokevirtual   #62  <Method int View.getBottom()>
		//   24   41:iload           4
		//   25   43:iadd            
		//   26   44:istore          6
				if(((View) (coordinatorlayout)).getTop() + l <= 0 && j1 >= 0)
		//*  27   46:aload_1         
		//*  28   47:invokevirtual   #59  <Method int View.getTop()>
		//*  29   50:iload           4
		//*  30   52:iadd            
		//*  31   53:ifgt            119
		//*  32   56:iload           6
		//*  33   58:iflt            119
				{
					obj = ((Object) (new SavedState(((Parcelable) (obj)))));
		//   34   61:new             #12  <Class AppBarLayout$Behavior$SavedState>
		//   35   64:dup             
		//   36   65:aload           8
		//   37   67:invokespecial   #369 <Method void AppBarLayout$Behavior$SavedState(Parcelable)>
		//   38   70:astore          8
					obj.a = k;
		//   39   72:aload           8
		//   40   74:iload_3         
		//   41   75:putfield        #261 <Field int AppBarLayout$Behavior$SavedState.a>
					if(j1 == s.j(((View) (coordinatorlayout))) + appbarlayout.getTopInset())
		//*  42   78:iload           6
		//*  43   80:aload_1         
		//*  44   81:invokestatic    #146 <Method int s.j(View)>
		//*  45   84:aload_2         
		//*  46   85:invokevirtual   #149 <Method int AppBarLayout.getTopInset()>
		//*  47   88:iadd            
		//*  48   89:icmpne          95
						flag = true;
		//   49   92:iconst_1        
		//   50   93:istore          7
					obj.c = flag;
		//   51   95:aload           8
		//   52   97:iload           7
		//   53   99:putfield        #267 <Field boolean AppBarLayout$Behavior$SavedState.c>
					obj.b = (float)j1 / (float)((View) (coordinatorlayout)).getHeight();
		//   54  102:aload           8
		//   55  104:iload           6
		//   56  106:i2f             
		//   57  107:aload_1         
		//   58  108:invokevirtual   #168 <Method int View.getHeight()>
		//   59  111:i2f             
		//   60  112:fdiv            
		//   61  113:putfield        #263 <Field float AppBarLayout$Behavior$SavedState.b>
					return ((Parcelable) (obj));
		//   62  116:aload           8
		//   63  118:areturn         
				}
			}

		//   64  119:iload_3         
		//   65  120:iconst_1        
		//   66  121:iadd            
		//   67  122:istore_3        
		//*  68  123:goto            25
			return ((Parcelable) (obj));
		//   69  126:aload           8
		//   70  128:areturn         
		}

		public volatile Parcelable b(CoordinatorLayout coordinatorlayout, View view)
		{
			return b(coordinatorlayout, (AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:invokevirtual   #371 <Method Parcelable b(CoordinatorLayout, AppBarLayout)>
		//    5    9:areturn         
		}

		int c(AppBarLayout appbarlayout)
		{
			return appbarlayout.getTotalScrollRange();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #196 <Method int AppBarLayout.getTotalScrollRange()>
		//    2    4:ireturn         
		}

		boolean c(View view)
		{
			return a((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #372 <Method boolean a(AppBarLayout)>
		//    4    8:ireturn         
		}

		private int b;
		private ValueAnimator c;
		private int d;
		private boolean e;
		private float f;
		private WeakReference g;
		private a h;

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void HeaderBehavior()>
			d = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #38  <Field int d>
		//    5    9:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #42  <Method void HeaderBehavior(Context, AttributeSet)>
			d = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #38  <Field int d>
		//    7   11:return          
		}
	}

	protected static class Behavior.SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int k)
		{
			super.writeToParcel(parcel, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #59  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(a);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #40  <Field int a>
		//    7   11:invokevirtual   #63  <Method void Parcel.writeInt(int)>
			parcel.writeFloat(b);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #46  <Field float b>
		//   11   19:invokevirtual   #67  <Method void Parcel.writeFloat(float)>
			parcel.writeByte((byte)c);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #52  <Field boolean c>
		//   15   27:int2byte        
		//   16   28:invokevirtual   #71  <Method void Parcel.writeByte(byte)>
		//   17   31:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public Behavior.SavedState a(Parcel parcel)
			{
				return new Behavior.SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public Behavior.SavedState a(Parcel parcel, ClassLoader classloader)
			{
				return new Behavior.SavedState(parcel, classloader);
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public Behavior.SavedState[] a(int k)
			{
				return new Behavior.SavedState[k];
			//    0    0:iload_1         
			//    1    1:anewarray       Behavior.SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel)
			{
				return ((Object) (a(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #31  <Method AppBarLayout$Behavior$SavedState a(Parcel)>
			//    3    5:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (a(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #34  <Method AppBarLayout$Behavior$SavedState a(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int k)
			{
				return ((Object []) (a(k)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #38  <Method AppBarLayout$Behavior$SavedState[] a(int)>
			//    3    5:areturn         
			}

		}
;
		int a;
		float b;
		boolean c;

		static 
		{
		//    0    0:new             #12  <Class AppBarLayout$Behavior$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void AppBarLayout$Behavior$SavedState$1()>
		//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public Behavior.SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #32  <Method void AbsSavedState(Parcel, ClassLoader)>
			a = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #38  <Method int Parcel.readInt()>
		//    7   11:putfield        #40  <Field int a>
			b = parcel.readFloat();
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #44  <Method float Parcel.readFloat()>
		//   11   19:putfield        #46  <Field float b>
			boolean flag;
			if(parcel.readByte() != 0)
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #50  <Method byte Parcel.readByte()>
		//*  14   26:ifeq            34
				flag = true;
		//   15   29:iconst_1        
		//   16   30:istore_3        
			else
		//*  17   31:goto            36
				flag = false;
		//   18   34:iconst_0        
		//   19   35:istore_3        
			c = flag;
		//   20   36:aload_0         
		//   21   37:iload_3         
		//   22   38:putfield        #52  <Field boolean c>
		//   23   41:return          
		}

		public Behavior.SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #55  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static abstract class Behavior.a
	{

		public abstract boolean a(AppBarLayout appbarlayout);
	}

	public static class LayoutParams extends android.widget.LinearLayout.LayoutParams
	{

		public int a()
		{
			return a;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int a>
		//    2    4:ireturn         
		}

		public Interpolator b()
		{
			return b;
		//    0    0:aload_0         
		//    1    1:getfield        #60  <Field Interpolator b>
		//    2    4:areturn         
		}

		boolean c()
		{
			return (a & 1) == 1 && (a & 0xa) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field int a>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
		//    5    7:icmpne          22
		//    6   10:aload_0         
		//    7   11:getfield        #17  <Field int a>
		//    8   14:bipush          10
		//    9   16:iand            
		//   10   17:ifeq            22
		//   11   20:iconst_1        
		//   12   21:ireturn         
		//   13   22:iconst_0        
		//   14   23:ireturn         
		}

		int a;
		Interpolator b;

		public LayoutParams(int k, int l)
		{
			super(k, l);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #15  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
			a = 1;
		//    4    6:aload_0         
		//    5    7:iconst_1        
		//    6    8:putfield        #17  <Field int a>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void android.widget.LinearLayout$LayoutParams(Context, AttributeSet)>
			a = 1;
		//    4    6:aload_0         
		//    5    7:iconst_1        
		//    6    8:putfield        #17  <Field int a>
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.AppBarLayout_Layout)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #27  <Field int[] android.support.design.a$k.AppBarLayout_Layout>
		//   10   16:invokevirtual   #33  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_2        
			a = ((TypedArray) (attributeset)).getInt(android.support.design.a.k.AppBarLayout_Layout_layout_scrollFlags, 0);
		//   12   20:aload_0         
		//   13   21:aload_2         
		//   14   22:getstatic       #36  <Field int android.support.design.a$k.AppBarLayout_Layout_layout_scrollFlags>
		//   15   25:iconst_0        
		//   16   26:invokevirtual   #42  <Method int TypedArray.getInt(int, int)>
		//   17   29:putfield        #17  <Field int a>
			if(((TypedArray) (attributeset)).hasValue(android.support.design.a.k.AppBarLayout_Layout_layout_scrollInterpolator))
		//*  18   32:aload_2         
		//*  19   33:getstatic       #45  <Field int android.support.design.a$k.AppBarLayout_Layout_layout_scrollInterpolator>
		//*  20   36:invokevirtual   #49  <Method boolean TypedArray.hasValue(int)>
		//*  21   39:ifeq            58
				b = AnimationUtils.loadInterpolator(context, ((TypedArray) (attributeset)).getResourceId(android.support.design.a.k.AppBarLayout_Layout_layout_scrollInterpolator, 0));
		//   22   42:aload_0         
		//   23   43:aload_1         
		//   24   44:aload_2         
		//   25   45:getstatic       #45  <Field int android.support.design.a$k.AppBarLayout_Layout_layout_scrollInterpolator>
		//   26   48:iconst_0        
		//   27   49:invokevirtual   #52  <Method int TypedArray.getResourceId(int, int)>
		//   28   52:invokestatic    #58  <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
		//   29   55:putfield        #60  <Field Interpolator b>
			((TypedArray) (attributeset)).recycle();
		//   30   58:aload_2         
		//   31   59:invokevirtual   #64  <Method void TypedArray.recycle()>
		//   32   62:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #67  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
			a = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #17  <Field int a>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #70  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			a = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #17  <Field int a>
		//    6   10:return          
		}

		public LayoutParams(android.widget.LinearLayout.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #73  <Method void android.widget.LinearLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
			a = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #17  <Field int a>
		//    6   10:return          
		}
	}

	public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior
	{

		private static int a(AppBarLayout appbarlayout)
		{
			appbarlayout = ((AppBarLayout) (((CoordinatorLayout.c)appbarlayout.getLayoutParams()).b()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
		//    2    4:checkcast       #52  <Class CoordinatorLayout$c>
		//    3    7:invokevirtual   #55  <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
		//    4   10:astore_0        
			if(appbarlayout instanceof Behavior)
		//*   5   11:aload_0         
		//*   6   12:instanceof      #57  <Class AppBarLayout$Behavior>
		//*   7   15:ifeq            26
				return ((Behavior)appbarlayout).a();
		//    8   18:aload_0         
		//    9   19:checkcast       #57  <Class AppBarLayout$Behavior>
		//   10   22:invokevirtual   #60  <Method int AppBarLayout$Behavior.a()>
		//   11   25:ireturn         
			else
				return 0;
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		private void e(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			coordinatorlayout = ((CoordinatorLayout) (((CoordinatorLayout.c)view1.getLayoutParams()).b()));
		//    0    0:aload_3         
		//    1    1:invokevirtual   #65  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #52  <Class CoordinatorLayout$c>
		//    3    7:invokevirtual   #55  <Method CoordinatorLayout$Behavior CoordinatorLayout$c.b()>
		//    4   10:astore_1        
			if(coordinatorlayout instanceof Behavior)
		//*   5   11:aload_1         
		//*   6   12:instanceof      #57  <Class AppBarLayout$Behavior>
		//*   7   15:ifeq            52
			{
				coordinatorlayout = ((CoordinatorLayout) ((Behavior)coordinatorlayout));
		//    8   18:aload_1         
		//    9   19:checkcast       #57  <Class AppBarLayout$Behavior>
		//   10   22:astore_1        
				s.c(view, ((view1.getBottom() - view.getTop()) + Behavior.a(((Behavior) (coordinatorlayout))) + a()) - c(view1));
		//   11   23:aload_2         
		//   12   24:aload_3         
		//   13   25:invokevirtual   #68  <Method int View.getBottom()>
		//   14   28:aload_2         
		//   15   29:invokevirtual   #71  <Method int View.getTop()>
		//   16   32:isub            
		//   17   33:aload_1         
		//   18   34:invokestatic    #74  <Method int AppBarLayout$Behavior.a(AppBarLayout$Behavior)>
		//   19   37:iadd            
		//   20   38:aload_0         
		//   21   39:invokevirtual   #75  <Method int a()>
		//   22   42:iadd            
		//   23   43:aload_0         
		//   24   44:aload_3         
		//   25   45:invokevirtual   #79  <Method int c(View)>
		//   26   48:isub            
		//   27   49:invokestatic    #84  <Method void s.c(View, int)>
			}
		//   28   52:return          
		}

		float a(View view)
		{
			if(view instanceof AppBarLayout)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #6   <Class AppBarLayout>
		//*   2    4:ifeq            60
			{
				view = ((View) ((AppBarLayout)view));
		//    3    7:aload_1         
		//    4    8:checkcast       #6   <Class AppBarLayout>
		//    5   11:astore_1        
				int l = ((AppBarLayout) (view)).getTotalScrollRange();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #88  <Method int AppBarLayout.getTotalScrollRange()>
		//    8   16:istore_3        
				int i1 = ((AppBarLayout) (view)).getDownNestedPreScrollRange();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #91  <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   11   21:istore          4
				int k = a(((AppBarLayout) (view)));
		//   12   23:aload_1         
		//   13   24:invokestatic    #93  <Method int a(AppBarLayout)>
		//   14   27:istore_2        
				if(i1 != 0 && l + k <= i1)
		//*  15   28:iload           4
		//*  16   30:ifeq            43
		//*  17   33:iload_3         
		//*  18   34:iload_2         
		//*  19   35:iadd            
		//*  20   36:iload           4
		//*  21   38:icmpgt          43
					return 0.0F;
		//   22   41:fconst_0        
		//   23   42:freturn         
				l -= i1;
		//   24   43:iload_3         
		//   25   44:iload           4
		//   26   46:isub            
		//   27   47:istore_3        
				if(l != 0)
		//*  28   48:iload_3         
		//*  29   49:ifeq            60
					return (float)k / (float)l + 1.0F;
		//   30   52:iload_2         
		//   31   53:i2f             
		//   32   54:iload_3         
		//   33   55:i2f             
		//   34   56:fdiv            
		//   35   57:fconst_1        
		//   36   58:fadd            
		//   37   59:freturn         
			}
			return 0.0F;
		//   38   60:fconst_0        
		//   39   61:freturn         
		}

		AppBarLayout a(List list)
		{
			int l = list.size();
		//    0    0:aload_1         
		//    1    1:invokeinterface #99  <Method int List.size()>
		//    2    6:istore_3        
			for(int k = 0; k < l; k++)
		//*   3    7:iconst_0        
		//*   4    8:istore_2        
		//*   5    9:iload_2         
		//*   6   10:iload_3         
		//*   7   11:icmpge          47
			{
				View view = (View)list.get(k);
		//    8   14:aload_1         
		//    9   15:iload_2         
		//   10   16:invokeinterface #103 <Method Object List.get(int)>
		//   11   21:checkcast       #64  <Class View>
		//   12   24:astore          4
				if(view instanceof AppBarLayout)
		//*  13   26:aload           4
		//*  14   28:instanceof      #6   <Class AppBarLayout>
		//*  15   31:ifeq            40
					return (AppBarLayout)view;
		//   16   34:aload           4
		//   17   36:checkcast       #6   <Class AppBarLayout>
		//   18   39:areturn         
			}

		//   19   40:iload_2         
		//   20   41:iconst_1        
		//   21   42:iadd            
		//   22   43:istore_2        
		//*  23   44:goto            9
			return null;
		//   24   47:aconst_null     
		//   25   48:areturn         
		}

		public volatile boolean a(int k)
		{
			return super.a(k);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #108 <Method boolean HeaderScrollingViewBehavior.a(int)>
		//    3    5:ireturn         
		}

		public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int k)
		{
			return super.a(coordinatorlayout, view, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #111 <Method boolean HeaderScrollingViewBehavior.a(CoordinatorLayout, View, int)>
		//    5    7:ireturn         
		}

		public volatile boolean a(CoordinatorLayout coordinatorlayout, View view, int k, int l, int i1, int j1)
		{
			return super.a(coordinatorlayout, view, k, l, i1, j1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:iload           4
		//    5    6:iload           5
		//    6    8:iload           6
		//    7   10:invokespecial   #114 <Method boolean HeaderScrollingViewBehavior.a(CoordinatorLayout, View, int, int, int, int)>
		//    8   13:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, Rect rect, boolean flag)
		{
			AppBarLayout appbarlayout = a(coordinatorlayout.c(view));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #120 <Method List CoordinatorLayout.c(View)>
		//    4    6:invokevirtual   #122 <Method AppBarLayout a(List)>
		//    5    9:astore          5
			if(appbarlayout != null)
		//*   6   11:aload           5
		//*   7   13:ifnull          67
			{
				rect.offset(view.getLeft(), view.getTop());
		//    8   16:aload_3         
		//    9   17:aload_2         
		//   10   18:invokevirtual   #125 <Method int View.getLeft()>
		//   11   21:aload_2         
		//   12   22:invokevirtual   #71  <Method int View.getTop()>
		//   13   25:invokevirtual   #131 <Method void Rect.offset(int, int)>
				view = ((View) (a));
		//   14   28:aload_0         
		//   15   29:getfield        #134 <Field Rect a>
		//   16   32:astore_2        
				((Rect) (view)).set(0, 0, coordinatorlayout.getWidth(), coordinatorlayout.getHeight());
		//   17   33:aload_2         
		//   18   34:iconst_0        
		//   19   35:iconst_0        
		//   20   36:aload_1         
		//   21   37:invokevirtual   #137 <Method int CoordinatorLayout.getWidth()>
		//   22   40:aload_1         
		//   23   41:invokevirtual   #140 <Method int CoordinatorLayout.getHeight()>
		//   24   44:invokevirtual   #144 <Method void Rect.set(int, int, int, int)>
				if(!((Rect) (view)).contains(rect))
		//*  25   47:aload_2         
		//*  26   48:aload_3         
		//*  27   49:invokevirtual   #148 <Method boolean Rect.contains(Rect)>
		//*  28   52:ifne            67
				{
					appbarlayout.a(false, flag ^ true);
		//   29   55:aload           5
		//   30   57:iconst_0        
		//   31   58:iload           4
		//   32   60:iconst_1        
		//   33   61:ixor            
		//   34   62:invokevirtual   #151 <Method void AppBarLayout.a(boolean, boolean)>
					return true;
		//   35   65:iconst_1        
		//   36   66:ireturn         
				}
			}
			return false;
		//   37   67:iconst_0        
		//   38   68:ireturn         
		}

		public boolean a(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			return view1 instanceof AppBarLayout;
		//    0    0:aload_3         
		//    1    1:instanceof      #6   <Class AppBarLayout>
		//    2    4:ireturn         
		}

		public volatile int b()
		{
			return super.b();
		//    0    0:aload_0         
		//    1    1:invokespecial   #154 <Method int HeaderScrollingViewBehavior.b()>
		//    2    4:ireturn         
		}

		int b(View view)
		{
			if(view instanceof AppBarLayout)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #6   <Class AppBarLayout>
		//*   2    4:ifeq            15
				return ((AppBarLayout)view).getTotalScrollRange();
		//    3    7:aload_1         
		//    4    8:checkcast       #6   <Class AppBarLayout>
		//    5   11:invokevirtual   #88  <Method int AppBarLayout.getTotalScrollRange()>
		//    6   14:ireturn         
			else
				return super.b(view);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokespecial   #156 <Method int HeaderScrollingViewBehavior.b(View)>
		//   10   20:ireturn         
		}

		View b(List list)
		{
			return ((View) (a(list)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #122 <Method AppBarLayout a(List)>
		//    3    5:areturn         
		}

		public boolean b(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			e(coordinatorlayout, view, view1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #159 <Method void e(CoordinatorLayout, View, View)>
			return false;
		//    5    7:iconst_0        
		//    6    8:ireturn         
		}

		public ScrollingViewBehavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void HeaderScrollingViewBehavior()>
		//    2    4:return          
		}

		public ScrollingViewBehavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void HeaderScrollingViewBehavior(Context, AttributeSet)>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.ScrollingViewBehavior_Layout)));
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #21  <Field int[] android.support.design.a$k.ScrollingViewBehavior_Layout>
		//    7   11:invokevirtual   #27  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//    8   14:astore_1        
			b(((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:getstatic       #31  <Field int android.support.design.a$k.ScrollingViewBehavior_Layout_behavior_overlapTop>
		//   12   20:iconst_0        
		//   13   21:invokevirtual   #37  <Method int TypedArray.getDimensionPixelSize(int, int)>
		//   14   24:invokevirtual   #41  <Method void b(int)>
			((TypedArray) (context)).recycle();
		//   15   27:aload_1         
		//   16   28:invokevirtual   #44  <Method void TypedArray.recycle()>
		//   17   31:return          
		}
	}

	public static interface a
	{

		public abstract void a(AppBarLayout appbarlayout, int k);
	}


	public AppBarLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #49  <Method void AppBarLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppBarLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #51  <Method void LinearLayout(Context, AttributeSet)>
		a = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #53  <Field int a>
		b = -1;
	//    7   11:aload_0         
	//    8   12:iconst_m1       
	//    9   13:putfield        #55  <Field int b>
		c = -1;
	//   10   16:aload_0         
	//   11   17:iconst_m1       
	//   12   18:putfield        #57  <Field int c>
		e = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #59  <Field int e>
		setOrientation(1);
	//   16   26:aload_0         
	//   17   27:iconst_1        
	//   18   28:invokevirtual   #63  <Method void setOrientation(int)>
		n.a(context);
	//   19   31:aload_1         
	//   20   32:invokestatic    #67  <Method void n.a(Context)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  21   35:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   38:bipush          21
	//*  23   40:icmplt          56
		{
			r.a(((View) (this)));
	//   24   43:aload_0         
	//   25   44:invokestatic    #77  <Method void r.a(View)>
			r.a(((View) (this)), attributeset, 0, android.support.design.a.j.Widget_Design_AppBarLayout);
	//   26   47:aload_0         
	//   27   48:aload_2         
	//   28   49:iconst_0        
	//   29   50:getstatic       #82  <Field int android.support.design.a$j.Widget_Design_AppBarLayout>
	//   30   53:invokestatic    #85  <Method void r.a(View, AttributeSet, int, int)>
		}
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.a.k.AppBarLayout, 0, android.support.design.a.j.Widget_Design_AppBarLayout)));
	//   31   56:aload_1         
	//   32   57:aload_2         
	//   33   58:getstatic       #90  <Field int[] android.support.design.a$k.AppBarLayout>
	//   34   61:iconst_0        
	//   35   62:getstatic       #82  <Field int android.support.design.a$j.Widget_Design_AppBarLayout>
	//   36   65:invokevirtual   #96  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   37   68:astore_1        
		s.a(((View) (this)), ((TypedArray) (context)).getDrawable(android.support.design.a.k.AppBarLayout_android_background));
	//   38   69:aload_0         
	//   39   70:aload_1         
	//   40   71:getstatic       #99  <Field int android.support.design.a$k.AppBarLayout_android_background>
	//   41   74:invokevirtual   #105 <Method android.graphics.drawable.Drawable TypedArray.getDrawable(int)>
	//   42   77:invokestatic    #110 <Method void s.a(View, android.graphics.drawable.Drawable)>
		if(((TypedArray) (context)).hasValue(android.support.design.a.k.AppBarLayout_expanded))
	//*  43   80:aload_1         
	//*  44   81:getstatic       #113 <Field int android.support.design.a$k.AppBarLayout_expanded>
	//*  45   84:invokevirtual   #117 <Method boolean TypedArray.hasValue(int)>
	//*  46   87:ifeq            104
			a(((TypedArray) (context)).getBoolean(android.support.design.a.k.AppBarLayout_expanded, false), false, false);
	//   47   90:aload_0         
	//   48   91:aload_1         
	//   49   92:getstatic       #113 <Field int android.support.design.a$k.AppBarLayout_expanded>
	//   50   95:iconst_0        
	//   51   96:invokevirtual   #121 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   52   99:iconst_0        
	//   53  100:iconst_0        
	//   54  101:invokespecial   #124 <Method void a(boolean, boolean, boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 21 && ((TypedArray) (context)).hasValue(android.support.design.a.k.AppBarLayout_elevation))
	//*  55  104:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  107:bipush          21
	//*  57  109:icmplt          135
	//*  58  112:aload_1         
	//*  59  113:getstatic       #127 <Field int android.support.design.a$k.AppBarLayout_elevation>
	//*  60  116:invokevirtual   #117 <Method boolean TypedArray.hasValue(int)>
	//*  61  119:ifeq            135
			r.a(((View) (this)), ((TypedArray) (context)).getDimensionPixelSize(android.support.design.a.k.AppBarLayout_elevation, 0));
	//   62  122:aload_0         
	//   63  123:aload_1         
	//   64  124:getstatic       #127 <Field int android.support.design.a$k.AppBarLayout_elevation>
	//   65  127:iconst_0        
	//   66  128:invokevirtual   #131 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   67  131:i2f             
	//   68  132:invokestatic    #134 <Method void r.a(View, float)>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  69  135:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*  70  138:bipush          26
	//*  71  140:icmplt          187
		{
			if(((TypedArray) (context)).hasValue(android.support.design.a.k.AppBarLayout_android_keyboardNavigationCluster))
	//*  72  143:aload_1         
	//*  73  144:getstatic       #137 <Field int android.support.design.a$k.AppBarLayout_android_keyboardNavigationCluster>
	//*  74  147:invokevirtual   #117 <Method boolean TypedArray.hasValue(int)>
	//*  75  150:ifeq            165
				setKeyboardNavigationCluster(((TypedArray) (context)).getBoolean(android.support.design.a.k.AppBarLayout_android_keyboardNavigationCluster, false));
	//   76  153:aload_0         
	//   77  154:aload_1         
	//   78  155:getstatic       #137 <Field int android.support.design.a$k.AppBarLayout_android_keyboardNavigationCluster>
	//   79  158:iconst_0        
	//   80  159:invokevirtual   #121 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   81  162:invokevirtual   #141 <Method void setKeyboardNavigationCluster(boolean)>
			if(((TypedArray) (context)).hasValue(android.support.design.a.k.AppBarLayout_android_touchscreenBlocksFocus))
	//*  82  165:aload_1         
	//*  83  166:getstatic       #144 <Field int android.support.design.a$k.AppBarLayout_android_touchscreenBlocksFocus>
	//*  84  169:invokevirtual   #117 <Method boolean TypedArray.hasValue(int)>
	//*  85  172:ifeq            187
				setTouchscreenBlocksFocus(((TypedArray) (context)).getBoolean(android.support.design.a.k.AppBarLayout_android_touchscreenBlocksFocus, false));
	//   86  175:aload_0         
	//   87  176:aload_1         
	//   88  177:getstatic       #144 <Field int android.support.design.a$k.AppBarLayout_android_touchscreenBlocksFocus>
	//   89  180:iconst_0        
	//   90  181:invokevirtual   #121 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   91  184:invokevirtual   #147 <Method void setTouchscreenBlocksFocus(boolean)>
		}
		((TypedArray) (context)).recycle();
	//   92  187:aload_1         
	//   93  188:invokevirtual   #151 <Method void TypedArray.recycle()>
		s.a(((View) (this)), new o() {

			public aa a(View view, aa aa1)
			{
				return a.a(aa1);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field AppBarLayout a>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #24  <Method aa AppBarLayout.a(aa)>
			//    4    8:areturn         
			}

			final AppBarLayout a;

			
			{
				a = AppBarLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppBarLayout a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   94  191:aload_0         
	//   95  192:new             #6   <Class AppBarLayout$1>
	//   96  195:dup             
	//   97  196:aload_0         
	//   98  197:invokespecial   #154 <Method void AppBarLayout$1(AppBarLayout)>
	//   99  200:invokestatic    #157 <Method void s.a(View, o)>
	//  100  203:return          
	}

	private void a(boolean flag, boolean flag1, boolean flag2)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			byte0 = 1;
	//    2    4:iconst_1        
	//    3    5:istore          4
		else
	//*   4    7:goto            13
			byte0 = 2;
	//    5   10:iconst_2        
	//    6   11:istore          4
		byte byte2 = 0;
	//    7   13:iconst_0        
	//    8   14:istore          6
		byte byte1;
		if(flag1)
	//*   9   16:iload_2         
	//*  10   17:ifeq            26
			byte1 = 4;
	//   11   20:iconst_4        
	//   12   21:istore          5
		else
	//*  13   23:goto            29
			byte1 = 0;
	//   14   26:iconst_0        
	//   15   27:istore          5
		if(flag2)
	//*  16   29:iload_3         
	//*  17   30:ifeq            37
			byte2 = 8;
	//   18   33:bipush          8
	//   19   35:istore          6
		e = byte0 | byte1 | byte2;
	//   20   37:aload_0         
	//   21   38:iload           4
	//   22   40:iload           5
	//   23   42:ior             
	//   24   43:iload           6
	//   25   45:ior             
	//   26   46:putfield        #59  <Field int e>
		requestLayout();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #160 <Method void requestLayout()>
	//   29   53:return          
	}

	private boolean b(boolean flag)
	{
		if(h != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #163 <Field boolean h>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			h = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #163 <Field boolean h>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #166 <Method void refreshDrawableState()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	private void e()
	{
		int l = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #170 <Method int getChildCount()>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		int k = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//    7   10:iload           4
	//    8   12:istore_3        
			if(k >= l)
				break;
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:icmpge          47
			if(((LayoutParams)getChildAt(k).getLayoutParams()).c())
	//*  12   18:aload_0         
	//*  13   19:iload_1         
	//*  14   20:invokevirtual   #174 <Method View getChildAt(int)>
	//*  15   23:invokevirtual   #180 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  16   26:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//*  17   29:invokevirtual   #183 <Method boolean AppBarLayout$LayoutParams.c()>
	//*  18   32:ifeq            40
			{
				flag = true;
	//   19   35:iconst_1        
	//   20   36:istore_3        
				break;
	//   21   37:goto            47
			}
			k++;
	//   22   40:iload_1         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_1        
		} while(true);
	//   26   44:goto            10
		b(flag);
	//   27   47:aload_0         
	//   28   48:iload_3         
	//   29   49:invokespecial   #185 <Method boolean b(boolean)>
	//   30   52:pop             
	//   31   53:return          
	}

	private void f()
	{
		a = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #53  <Field int a>
		b = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #55  <Field int b>
		c = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #57  <Field int c>
	//    9   15:return          
	}

	protected LayoutParams a()
	{
		return new LayoutParams(-1, -2);
	//    0    0:new             #21  <Class AppBarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:bipush          -2
	//    4    7:invokespecial   #189 <Method void AppBarLayout$LayoutParams(int, int)>
	//    5   10:areturn         
	}

	public LayoutParams a(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #21  <Class AppBarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #194 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #195 <Method void AppBarLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19 && (layoutparams instanceof android.widget.LinearLayout.LayoutParams))
	//*   0    0:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          27
	//*   3    8:aload_1         
	//*   4    9:instanceof      #198 <Class android.widget.LinearLayout$LayoutParams>
	//*   5   12:ifeq            27
			return new LayoutParams((android.widget.LinearLayout.LayoutParams)layoutparams);
	//    6   15:new             #21  <Class AppBarLayout$LayoutParams>
	//    7   18:dup             
	//    8   19:aload_1         
	//    9   20:checkcast       #198 <Class android.widget.LinearLayout$LayoutParams>
	//   10   23:invokespecial   #201 <Method void AppBarLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
	//   11   26:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  12   27:aload_1         
	//*  13   28:instanceof      #203 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  14   31:ifeq            46
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   15   34:new             #21  <Class AppBarLayout$LayoutParams>
	//   16   37:dup             
	//   17   38:aload_1         
	//   18   39:checkcast       #203 <Class android.view.ViewGroup$MarginLayoutParams>
	//   19   42:invokespecial   #206 <Method void AppBarLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   20   45:areturn         
		else
			return new LayoutParams(layoutparams);
	//   21   46:new             #21  <Class AppBarLayout$LayoutParams>
	//   22   49:dup             
	//   23   50:aload_1         
	//   24   51:invokespecial   #209 <Method void AppBarLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   25   54:areturn         
	}

	aa a(aa aa1)
	{
		aa aa2;
		if(s.q(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #214 <Method boolean s.q(View)>
	//*   2    4:ifeq            12
			aa2 = aa1;
	//    3    7:aload_1         
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			aa2 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		if(!android.support.v4.f.i.a(((Object) (f)), ((Object) (aa2))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #216 <Field aa f>
	//*  10   18:aload_2         
	//*  11   19:invokestatic    #221 <Method boolean i.a(Object, Object)>
	//*  12   22:ifne            34
		{
			f = aa2;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #216 <Field aa f>
			f();
	//   16   30:aload_0         
	//   17   31:invokespecial   #223 <Method void f()>
		}
		return aa1;
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	void a(int k)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field List g>
	//*   2    4:ifnull          60
		{
			int l = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(int i1 = g.size(); l < i1; l++)
	//*   5    9:aload_0         
	//*   6   10:getfield        #225 <Field List g>
	//*   7   13:invokeinterface #230 <Method int List.size()>
	//*   8   18:istore_3        
	//*   9   19:iload_2         
	//*  10   20:iload_3         
	//*  11   21:icmpge          60
			{
				a a1 = (a)g.get(l);
	//   12   24:aload_0         
	//   13   25:getfield        #225 <Field List g>
	//   14   28:iload_2         
	//   15   29:invokeinterface #234 <Method Object List.get(int)>
	//   16   34:checkcast       #27  <Class AppBarLayout$a>
	//   17   37:astore          4
				if(a1 != null)
	//*  18   39:aload           4
	//*  19   41:ifnull          53
					a1.a(this, k);
	//   20   44:aload           4
	//   21   46:aload_0         
	//   22   47:iload_1         
	//   23   48:invokeinterface #237 <Method void AppBarLayout$a.a(AppBarLayout, int)>
			}

	//   24   53:iload_2         
	//   25   54:iconst_1        
	//   26   55:iadd            
	//   27   56:istore_2        
		}
	//*  28   57:goto            19
	//   29   60:return          
	}

	public void a(a a1)
	{
		if(g == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field List g>
	//*   2    4:ifnonnull       18
			g = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #240 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #242 <Method void ArrayList()>
	//    7   15:putfield        #225 <Field List g>
		if(a1 != null && !g.contains(((Object) (a1))))
	//*   8   18:aload_1         
	//*   9   19:ifnull          46
	//*  10   22:aload_0         
	//*  11   23:getfield        #225 <Field List g>
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #246 <Method boolean List.contains(Object)>
	//*  14   32:ifne            46
			g.add(((Object) (a1)));
	//   15   35:aload_0         
	//   16   36:getfield        #225 <Field List g>
	//   17   39:aload_1         
	//   18   40:invokeinterface #249 <Method boolean List.add(Object)>
	//   19   45:pop             
	//   20   46:return          
	}

	public void a(boolean flag, boolean flag1)
	{
		a(flag, flag1, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #124 <Method void a(boolean, boolean, boolean)>
	//    5    7:return          
	}

	boolean a(boolean flag)
	{
		if(i != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #252 <Field boolean i>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			i = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #252 <Field boolean i>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #166 <Method void refreshDrawableState()>
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		} else
		{
			return false;
	//   11   19:iconst_0        
	//   12   20:ireturn         
		}
	}

	public void b(a a1)
	{
		if(g != null && a1 != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field List g>
	//*   2    4:ifnull          22
	//*   3    7:aload_1         
	//*   4    8:ifnull          22
			g.remove(((Object) (a1)));
	//    5   11:aload_0         
	//    6   12:getfield        #225 <Field List g>
	//    7   15:aload_1         
	//    8   16:invokeinterface #255 <Method boolean List.remove(Object)>
	//    9   21:pop             
	//   10   22:return          
	}

	boolean b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field boolean d>
	//    2    4:ireturn         
	}

	boolean c()
	{
		return getTotalScrollRange() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #260 <Method int getTotalScrollRange()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #21  <Class AppBarLayout$LayoutParams>
	//    2    4:ireturn         
	}

	void d()
	{
		e = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #59  <Field int e>
	//    3    5:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #265 <Method AppBarLayout$LayoutParams a()>
	//    2    4:areturn         
	}

	protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.widget.LinearLayout.LayoutParams) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #265 <Method AppBarLayout$LayoutParams a()>
	//    2    4:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #270 <Method AppBarLayout$LayoutParams a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #273 <Method AppBarLayout$LayoutParams a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.widget.LinearLayout.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #270 <Method AppBarLayout$LayoutParams a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.widget.LinearLayout.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #273 <Method AppBarLayout$LayoutParams a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	int getDownNestedPreScrollRange()
	{
		if(b != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int b>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return b;
	//    4    8:aload_0         
	//    5    9:getfield        #55  <Field int b>
	//    6   12:ireturn         
		int i1 = getChildCount() - 1;
	//    7   13:aload_0         
	//    8   14:invokevirtual   #170 <Method int getChildCount()>
	//    9   17:iconst_1        
	//   10   18:isub            
	//   11   19:istore_2        
		int k;
		int j1;
		for(j1 = 0; i1 >= 0; j1 = k)
	//*  12   20:iconst_0        
	//*  13   21:istore_3        
	//*  14   22:iload_2         
	//*  15   23:iflt            143
		{
			View view = getChildAt(i1);
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:invokevirtual   #174 <Method View getChildAt(int)>
	//   19   31:astore          5
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   20   33:aload           5
	//   21   35:invokevirtual   #180 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   38:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   23   41:astore          6
			int k1 = view.getMeasuredHeight();
	//   24   43:aload           5
	//   25   45:invokevirtual   #279 <Method int View.getMeasuredHeight()>
	//   26   48:istore          4
			k = layoutparams.a;
	//   27   50:aload           6
	//   28   52:getfield        #280 <Field int AppBarLayout$LayoutParams.a>
	//   29   55:istore_1        
			if((k & 5) == 5)
	//*  30   56:iload_1         
	//*  31   57:iconst_5        
	//*  32   58:iand            
	//*  33   59:iconst_5        
	//*  34   60:icmpne          125
			{
				j1 += layoutparams.topMargin + layoutparams.bottomMargin;
	//   35   63:iload_3         
	//   36   64:aload           6
	//   37   66:getfield        #283 <Field int AppBarLayout$LayoutParams.topMargin>
	//   38   69:aload           6
	//   39   71:getfield        #286 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   40   74:iadd            
	//   41   75:iadd            
	//   42   76:istore_3        
				if((k & 8) != 0)
	//*  43   77:iload_1         
	//*  44   78:bipush          8
	//*  45   80:iand            
	//*  46   81:ifeq            95
				{
					k = j1 + s.j(view);
	//   47   84:iload_3         
	//   48   85:aload           5
	//   49   87:invokestatic    #289 <Method int s.j(View)>
	//   50   90:iadd            
	//   51   91:istore_1        
				} else
	//*  52   92:goto            134
				{
					if((k & 2) != 0)
	//*  53   95:iload_1         
	//*  54   96:iconst_2        
	//*  55   97:iand            
	//*  56   98:ifeq            117
						k = s.j(view);
	//   57  101:aload           5
	//   58  103:invokestatic    #289 <Method int s.j(View)>
	//   59  106:istore_1        
					else
	//*  60  107:iload_3         
	//*  61  108:iload           4
	//*  62  110:iload_1         
	//*  63  111:isub            
	//*  64  112:iadd            
	//*  65  113:istore_1        
	//*  66  114:goto            134
						k = getTopInset();
	//   67  117:aload_0         
	//   68  118:invokevirtual   #292 <Method int getTopInset()>
	//   69  121:istore_1        
					k = j1 + (k1 - k);
				}
			} else
	//*  70  122:goto            107
			{
				k = j1;
	//   71  125:iload_3         
	//   72  126:istore_1        
				if(j1 > 0)
	//*  73  127:iload_3         
	//*  74  128:ifle            134
					break;
	//   75  131:goto            143
			}
			i1--;
	//   76  134:iload_2         
	//   77  135:iconst_1        
	//   78  136:isub            
	//   79  137:istore_2        
		}

	//   80  138:iload_1         
	//   81  139:istore_3        
	//*  82  140:goto            22
		int l = Math.max(0, j1);
	//   83  143:iconst_0        
	//   84  144:iload_3         
	//   85  145:invokestatic    #297 <Method int Math.max(int, int)>
	//   86  148:istore_1        
		b = l;
	//   87  149:aload_0         
	//   88  150:iload_1         
	//   89  151:putfield        #55  <Field int b>
		return l;
	//   90  154:iload_1         
	//   91  155:ireturn         
	}

	int getDownNestedScrollRange()
	{
		if(c != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field int c>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return c;
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field int c>
	//    6   12:ireturn         
		int j1 = getChildCount();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #170 <Method int getChildCount()>
	//    9   17:istore          4
		int l = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		int k = 0;
	//   12   21:iconst_0        
	//   13   22:istore_1        
		int i1;
		do
		{
			i1 = k;
	//   14   23:iload_1         
	//   15   24:istore_3        
			if(l >= j1)
				break;
	//   16   25:iload_2         
	//   17   26:iload           4
	//   18   28:icmpge          126
			View view = getChildAt(l);
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #174 <Method View getChildAt(int)>
	//   22   36:astore          9
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   38:aload           9
	//   24   40:invokevirtual   #180 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   43:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   26   46:astore          10
			int l1 = view.getMeasuredHeight();
	//   27   48:aload           9
	//   28   50:invokevirtual   #279 <Method int View.getMeasuredHeight()>
	//   29   53:istore          6
			int i2 = layoutparams.topMargin;
	//   30   55:aload           10
	//   31   57:getfield        #283 <Field int AppBarLayout$LayoutParams.topMargin>
	//   32   60:istore          7
			int j2 = layoutparams.bottomMargin;
	//   33   62:aload           10
	//   34   64:getfield        #286 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   35   67:istore          8
			int k1 = layoutparams.a;
	//   36   69:aload           10
	//   37   71:getfield        #280 <Field int AppBarLayout$LayoutParams.a>
	//   38   74:istore          5
			i1 = k;
	//   39   76:iload_1         
	//   40   77:istore_3        
			if((k1 & 1) == 0)
				break;
	//   41   78:iload           5
	//   42   80:iconst_1        
	//   43   81:iand            
	//   44   82:ifeq            126
			k += l1 + (i2 + j2);
	//   45   85:iload_1         
	//   46   86:iload           6
	//   47   88:iload           7
	//   48   90:iload           8
	//   49   92:iadd            
	//   50   93:iadd            
	//   51   94:iadd            
	//   52   95:istore_1        
			if((k1 & 2) != 0)
	//*  53   96:iload           5
	//*  54   98:iconst_2        
	//*  55   99:iand            
	//*  56  100:ifeq            119
			{
				i1 = k - (s.j(view) + getTopInset());
	//   57  103:iload_1         
	//   58  104:aload           9
	//   59  106:invokestatic    #289 <Method int s.j(View)>
	//   60  109:aload_0         
	//   61  110:invokevirtual   #292 <Method int getTopInset()>
	//   62  113:iadd            
	//   63  114:isub            
	//   64  115:istore_3        
				break;
	//   65  116:goto            126
			}
			l++;
	//   66  119:iload_2         
	//   67  120:iconst_1        
	//   68  121:iadd            
	//   69  122:istore_2        
		} while(true);
	//   70  123:goto            23
		k = Math.max(0, i1);
	//   71  126:iconst_0        
	//   72  127:iload_3         
	//   73  128:invokestatic    #297 <Method int Math.max(int, int)>
	//   74  131:istore_1        
		c = k;
	//   75  132:aload_0         
	//   76  133:iload_1         
	//   77  134:putfield        #57  <Field int c>
		return k;
	//   78  137:iload_1         
	//   79  138:ireturn         
	}

	final int getMinimumHeightForVisibleOverlappingContent()
	{
		int l = getTopInset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #292 <Method int getTopInset()>
	//    2    4:istore_2        
		int k = s.j(((View) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #289 <Method int s.j(View)>
	//    5    9:istore_1        
		if(k == 0)
	//*   6   10:iload_1         
	//*   7   11:ifeq            20
	//*   8   14:iload_1         
	//*   9   15:iconst_2        
	//*  10   16:imul            
	//*  11   17:iload_2         
	//*  12   18:iadd            
	//*  13   19:ireturn         
		{
			k = getChildCount();
	//   14   20:aload_0         
	//   15   21:invokevirtual   #170 <Method int getChildCount()>
	//   16   24:istore_1        
			if(k >= 1)
	//*  17   25:iload_1         
	//*  18   26:iconst_1        
	//*  19   27:icmplt          44
				k = s.j(getChildAt(k - 1));
	//   20   30:aload_0         
	//   21   31:iload_1         
	//   22   32:iconst_1        
	//   23   33:isub            
	//   24   34:invokevirtual   #174 <Method View getChildAt(int)>
	//   25   37:invokestatic    #289 <Method int s.j(View)>
	//   26   40:istore_1        
			else
	//*  27   41:goto            46
				k = 0;
	//   28   44:iconst_0        
	//   29   45:istore_1        
			if(k == 0)
	//*  30   46:iload_1         
	//*  31   47:ifeq            53
	//*  32   50:goto            14
				return getHeight() / 3;
	//   33   53:aload_0         
	//   34   54:invokevirtual   #302 <Method int getHeight()>
	//   35   57:iconst_3        
	//   36   58:idiv            
	//   37   59:ireturn         
		}
		return k * 2 + l;
	}

	int getPendingAction()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int e>
	//    2    4:ireturn         
	}

	public float getTargetElevation()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	final int getTopInset()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #216 <Field aa f>
	//*   2    4:ifnull          15
			return f.b();
	//    3    7:aload_0         
	//    4    8:getfield        #216 <Field aa f>
	//    5   11:invokevirtual   #311 <Method int aa.b()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public final int getTotalScrollRange()
	{
		if(a != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field int a>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return a;
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field int a>
	//    6   12:ireturn         
		int j1 = getChildCount();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #170 <Method int getChildCount()>
	//    9   17:istore          4
		int l = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		int k = 0;
	//   12   21:iconst_0        
	//   13   22:istore_1        
		int i1;
		do
		{
			i1 = k;
	//   14   23:iload_1         
	//   15   24:istore_3        
			if(l >= j1)
				break;
	//   16   25:iload_2         
	//   17   26:iload           4
	//   18   28:icmpge          113
			View view = getChildAt(l);
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #174 <Method View getChildAt(int)>
	//   22   36:astore          7
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   38:aload           7
	//   24   40:invokevirtual   #180 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   43:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   26   46:astore          8
			int l1 = view.getMeasuredHeight();
	//   27   48:aload           7
	//   28   50:invokevirtual   #279 <Method int View.getMeasuredHeight()>
	//   29   53:istore          6
			int k1 = layoutparams.a;
	//   30   55:aload           8
	//   31   57:getfield        #280 <Field int AppBarLayout$LayoutParams.a>
	//   32   60:istore          5
			i1 = k;
	//   33   62:iload_1         
	//   34   63:istore_3        
			if((k1 & 1) == 0)
				break;
	//   35   64:iload           5
	//   36   66:iconst_1        
	//   37   67:iand            
	//   38   68:ifeq            113
			k += l1 + layoutparams.topMargin + layoutparams.bottomMargin;
	//   39   71:iload_1         
	//   40   72:iload           6
	//   41   74:aload           8
	//   42   76:getfield        #283 <Field int AppBarLayout$LayoutParams.topMargin>
	//   43   79:iadd            
	//   44   80:aload           8
	//   45   82:getfield        #286 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   46   85:iadd            
	//   47   86:iadd            
	//   48   87:istore_1        
			if((k1 & 2) != 0)
	//*  49   88:iload           5
	//*  50   90:iconst_2        
	//*  51   91:iand            
	//*  52   92:ifeq            106
			{
				i1 = k - s.j(view);
	//   53   95:iload_1         
	//   54   96:aload           7
	//   55   98:invokestatic    #289 <Method int s.j(View)>
	//   56  101:isub            
	//   57  102:istore_3        
				break;
	//   58  103:goto            113
			}
			l++;
	//   59  106:iload_2         
	//   60  107:iconst_1        
	//   61  108:iadd            
	//   62  109:istore_2        
		} while(true);
	//   63  110:goto            23
		k = Math.max(0, i1 - getTopInset());
	//   64  113:iconst_0        
	//   65  114:iload_3         
	//   66  115:aload_0         
	//   67  116:invokevirtual   #292 <Method int getTopInset()>
	//   68  119:isub            
	//   69  120:invokestatic    #297 <Method int Math.max(int, int)>
	//   70  123:istore_1        
		a = k;
	//   71  124:aload_0         
	//   72  125:iload_1         
	//   73  126:putfield        #53  <Field int a>
		return k;
	//   74  129:iload_1         
	//   75  130:ireturn         
	}

	int getUpNestedPreScrollRange()
	{
		return getTotalScrollRange();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #260 <Method int getTotalScrollRange()>
	//    2    4:ireturn         
	}

	protected int[] onCreateDrawableState(int k)
	{
		if(j == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #316 <Field int[] j>
	//*   2    4:ifnonnull       14
			j = new int[2];
	//    3    7:aload_0         
	//    4    8:iconst_2        
	//    5    9:newarray        int[]
	//    6   11:putfield        #316 <Field int[] j>
		int ai[] = j;
	//    7   14:aload_0         
	//    8   15:getfield        #316 <Field int[] j>
	//    9   18:astore_2        
		int ai1[] = super.onCreateDrawableState(k + ai.length);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:aload_2         
	//   13   22:arraylength     
	//   14   23:iadd            
	//   15   24:invokespecial   #318 <Method int[] LinearLayout.onCreateDrawableState(int)>
	//   16   27:astore_3        
		if(h)
	//*  17   28:aload_0         
	//*  18   29:getfield        #163 <Field boolean h>
	//*  19   32:ifeq            42
			k = android.support.design.a.b.state_collapsible;
	//   20   35:getstatic       #323 <Field int android.support.design.a$b.state_collapsible>
	//   21   38:istore_1        
		else
	//*  22   39:goto            47
			k = -android.support.design.a.b.state_collapsible;
	//   23   42:getstatic       #323 <Field int android.support.design.a$b.state_collapsible>
	//   24   45:ineg            
	//   25   46:istore_1        
		ai[0] = k;
	//   26   47:aload_2         
	//   27   48:iconst_0        
	//   28   49:iload_1         
	//   29   50:iastore         
		if(h && i)
	//*  30   51:aload_0         
	//*  31   52:getfield        #163 <Field boolean h>
	//*  32   55:ifeq            72
	//*  33   58:aload_0         
	//*  34   59:getfield        #252 <Field boolean i>
	//*  35   62:ifeq            72
			k = android.support.design.a.b.state_collapsed;
	//   36   65:getstatic       #326 <Field int android.support.design.a$b.state_collapsed>
	//   37   68:istore_1        
		else
	//*  38   69:goto            77
			k = -android.support.design.a.b.state_collapsed;
	//   39   72:getstatic       #326 <Field int android.support.design.a$b.state_collapsed>
	//   40   75:ineg            
	//   41   76:istore_1        
		ai[1] = k;
	//   42   77:aload_2         
	//   43   78:iconst_1        
	//   44   79:iload_1         
	//   45   80:iastore         
		return mergeDrawableStates(ai1, ai);
	//   46   81:aload_3         
	//   47   82:aload_2         
	//   48   83:invokestatic    #330 <Method int[] mergeDrawableStates(int[], int[])>
	//   49   86:areturn         
	}

	protected void onLayout(boolean flag, int k, int l, int i1, int j1)
	{
		super.onLayout(flag, k, l, i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #334 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		f();
	//    7   11:aload_0         
	//    8   12:invokespecial   #223 <Method void f()>
		k = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		d = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #257 <Field boolean d>
		l = getChildCount();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #170 <Method int getChildCount()>
	//   16   26:istore_3        
		do
		{
			if(k >= l)
				break;
	//   17   27:iload_2         
	//   18   28:iload_3         
	//   19   29:icmpge          64
			if(((LayoutParams)getChildAt(k).getLayoutParams()).b() != null)
	//*  20   32:aload_0         
	//*  21   33:iload_2         
	//*  22   34:invokevirtual   #174 <Method View getChildAt(int)>
	//*  23   37:invokevirtual   #180 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  24   40:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//*  25   43:invokevirtual   #337 <Method Interpolator AppBarLayout$LayoutParams.b()>
	//*  26   46:ifnull          57
			{
				d = true;
	//   27   49:aload_0         
	//   28   50:iconst_1        
	//   29   51:putfield        #257 <Field boolean d>
				break;
	//   30   54:goto            64
			}
			k++;
	//   31   57:iload_2         
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore_2        
		} while(true);
	//   35   61:goto            27
		e();
	//   36   64:aload_0         
	//   37   65:invokespecial   #339 <Method void e()>
	//   38   68:return          
	}

	protected void onMeasure(int k, int l)
	{
		super.onMeasure(k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #342 <Method void LinearLayout.onMeasure(int, int)>
		f();
	//    4    6:aload_0         
	//    5    7:invokespecial   #223 <Method void f()>
	//    6   10:return          
	}

	public void setExpanded(boolean flag)
	{
		a(flag, s.x(((View) (this))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #346 <Method boolean s.x(View)>
	//    4    6:invokevirtual   #348 <Method void a(boolean, boolean)>
	//    5    9:return          
	}

	public void setOrientation(int k)
	{
		if(k != 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          16
		{
			throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
	//    3    5:new             #350 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc2            #352 <String "AppBarLayout is always vertical and does not support horizontal orientation">
	//    6   12:invokespecial   #355 <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		} else
		{
			super.setOrientation(k);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #356 <Method void LinearLayout.setOrientation(int)>
			return;
	//   11   21:return          
		}
	}

	public void setTargetElevation(float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			r.a(((View) (this)), f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:invokestatic    #134 <Method void r.a(View, float)>
	//    6   13:return          
	}

	private int a;
	private int b;
	private int c;
	private boolean d;
	private int e;
	private aa f;
	private List g;
	private boolean h;
	private boolean i;
	private int j[];
}
