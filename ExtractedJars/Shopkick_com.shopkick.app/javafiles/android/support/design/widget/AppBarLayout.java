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
import android.support.design.animation.AnimationUtils;
import android.support.design.internal.ThemeEnforcement;
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			ViewUtilsLollipop, HeaderBehavior, CoordinatorLayout, HeaderScrollingViewBehavior

public class AppBarLayout extends LinearLayout
{
	protected static class BaseBehavior extends HeaderBehavior
	{

		private void animateOffsetTo(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, float f)
		{
			int j = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #57  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:iload_3         
		//    3    5:isub            
		//    4    6:invokestatic    #63  <Method int Math.abs(int)>
		//    5    9:istore          5
			f = Math.abs(f);
		//    6   11:fload           4
		//    7   13:invokestatic    #66  <Method float Math.abs(float)>
		//    8   16:fstore          4
			if(f > 0.0F)
		//*   9   18:fload           4
		//*  10   20:fconst_0        
		//*  11   21:fcmpl           
		//*  12   22:ifle            44
				j = Math.round(((float)j / f) * 1000F) * 3;
		//   13   25:iload           5
		//   14   27:i2f             
		//   15   28:fload           4
		//   16   30:fdiv            
		//   17   31:ldc1            #67  <Float 1000F>
		//   18   33:fmul            
		//   19   34:invokestatic    #71  <Method int Math.round(float)>
		//   20   37:iconst_3        
		//   21   38:imul            
		//   22   39:istore          5
			else
		//*  23   41:goto            61
				j = (int)(((float)j / (float)appbarlayout.getHeight() + 1.0F) * 150F);
		//   24   44:iload           5
		//   25   46:i2f             
		//   26   47:aload_2         
		//   27   48:invokevirtual   #74  <Method int AppBarLayout.getHeight()>
		//   28   51:i2f             
		//   29   52:fdiv            
		//   30   53:fconst_1        
		//   31   54:fadd            
		//   32   55:ldc1            #75  <Float 150F>
		//   33   57:fmul            
		//   34   58:f2i             
		//   35   59:istore          5
			animateOffsetWithDuration(coordinatorlayout, appbarlayout, i, j);
		//   36   61:aload_0         
		//   37   62:aload_1         
		//   38   63:aload_2         
		//   39   64:iload_3         
		//   40   65:iload           5
		//   41   67:invokespecial   #79  <Method void animateOffsetWithDuration(CoordinatorLayout, AppBarLayout, int, int)>
		//   42   70:return          
		}

		private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, AppBarLayout appbarlayout, int i, int j)
		{
			int k = getTopBottomOffsetForScrollingSibling();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #57  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:istore          5
			if(k == i)
		//*   3    6:iload           5
		//*   4    8:iload_3         
		//*   5    9:icmpne          36
			{
				coordinatorLayout = ((CoordinatorLayout) (offsetAnimator));
		//    6   12:aload_0         
		//    7   13:getfield        #83  <Field ValueAnimator offsetAnimator>
		//    8   16:astore_1        
				if(coordinatorLayout != null && ((ValueAnimator) (coordinatorLayout)).isRunning())
		//*   9   17:aload_1         
		//*  10   18:ifnull          35
		//*  11   21:aload_1         
		//*  12   22:invokevirtual   #89  <Method boolean ValueAnimator.isRunning()>
		//*  13   25:ifeq            35
					offsetAnimator.cancel();
		//   14   28:aload_0         
		//   15   29:getfield        #83  <Field ValueAnimator offsetAnimator>
		//   16   32:invokevirtual   #92  <Method void ValueAnimator.cancel()>
				return;
		//   17   35:return          
			}
			ValueAnimator valueanimator = offsetAnimator;
		//   18   36:aload_0         
		//   19   37:getfield        #83  <Field ValueAnimator offsetAnimator>
		//   20   40:astore          6
			if(valueanimator == null)
		//*  21   42:aload           6
		//*  22   44:ifnonnull       88
			{
				offsetAnimator = new ValueAnimator();
		//   23   47:aload_0         
		//   24   48:new             #85  <Class ValueAnimator>
		//   25   51:dup             
		//   26   52:invokespecial   #93  <Method void ValueAnimator()>
		//   27   55:putfield        #83  <Field ValueAnimator offsetAnimator>
				offsetAnimator.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
		//   28   58:aload_0         
		//   29   59:getfield        #83  <Field ValueAnimator offsetAnimator>
		//   30   62:getstatic       #99  <Field android.animation.TimeInterpolator AnimationUtils.DECELERATE_INTERPOLATOR>
		//   31   65:invokevirtual   #103 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
				offsetAnimator.addUpdateListener(((_cls1) (appbarlayout)). new android.animation.ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						setHeaderTopBottomOffset(coordinatorLayout, ((View) (child)), ((Integer)valueanimator.getAnimatedValue()).intValue());
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field AppBarLayout$BaseBehavior this$0>
					//    2    4:aload_0         
					//    3    5:getfield        #26  <Field CoordinatorLayout val$coordinatorLayout>
					//    4    8:aload_0         
					//    5    9:getfield        #28  <Field AppBarLayout val$child>
					//    6   12:aload_1         
					//    7   13:invokevirtual   #40  <Method Object ValueAnimator.getAnimatedValue()>
					//    8   16:checkcast       #42  <Class Integer>
					//    9   19:invokevirtual   #46  <Method int Integer.intValue()>
					//   10   22:invokevirtual   #50  <Method int AppBarLayout$BaseBehavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
					//   11   25:pop             
					//   12   26:return          
					}

					final BaseBehavior this$0;
					final AppBarLayout val$child;
					final CoordinatorLayout val$coordinatorLayout;

			
			{
				this$0 = final_basebehavior;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field AppBarLayout$BaseBehavior this$0>
				coordinatorLayout = coordinatorlayout;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field CoordinatorLayout val$coordinatorLayout>
				child = AppBarLayout.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field AppBarLayout val$child>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
				}
);
		//   32   68:aload_0         
		//   33   69:getfield        #83  <Field ValueAnimator offsetAnimator>
		//   34   72:new             #10  <Class AppBarLayout$BaseBehavior$1>
		//   35   75:dup             
		//   36   76:aload_0         
		//   37   77:aload_1         
		//   38   78:aload_2         
		//   39   79:invokespecial   #106 <Method void AppBarLayout$BaseBehavior$1(AppBarLayout$BaseBehavior, CoordinatorLayout, AppBarLayout)>
		//   40   82:invokevirtual   #110 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			} else
		//*  41   85:goto            93
			{
				valueanimator.cancel();
		//   42   88:aload           6
		//   43   90:invokevirtual   #92  <Method void ValueAnimator.cancel()>
			}
			offsetAnimator.setDuration(Math.min(j, 600));
		//   44   93:aload_0         
		//   45   94:getfield        #83  <Field ValueAnimator offsetAnimator>
		//   46   97:iload           4
		//   47   99:sipush          600
		//   48  102:invokestatic    #114 <Method int Math.min(int, int)>
		//   49  105:i2l             
		//   50  106:invokevirtual   #118 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//   51  109:pop             
			offsetAnimator.setIntValues(new int[] {
				k, i
			});
		//   52  110:aload_0         
		//   53  111:getfield        #83  <Field ValueAnimator offsetAnimator>
		//   54  114:iconst_2        
		//   55  115:newarray        int[]
		//   56  117:dup             
		//   57  118:iconst_0        
		//   58  119:iload           5
		//   59  121:iastore         
		//   60  122:dup             
		//   61  123:iconst_1        
		//   62  124:iload_3         
		//   63  125:iastore         
		//   64  126:invokevirtual   #122 <Method void ValueAnimator.setIntValues(int[])>
			offsetAnimator.start();
		//   65  129:aload_0         
		//   66  130:getfield        #83  <Field ValueAnimator offsetAnimator>
		//   67  133:invokevirtual   #125 <Method void ValueAnimator.start()>
		//   68  136:return          
		}

		private boolean canScrollChildren(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view)
		{
			return appbarlayout.hasScrollableChildren() && coordinatorlayout.getHeight() - view.getHeight() <= appbarlayout.getHeight();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #131 <Method boolean AppBarLayout.hasScrollableChildren()>
		//    2    4:ifeq            25
		//    3    7:aload_1         
		//    4    8:invokevirtual   #134 <Method int CoordinatorLayout.getHeight()>
		//    5   11:aload_3         
		//    6   12:invokevirtual   #137 <Method int View.getHeight()>
		//    7   15:isub            
		//    8   16:aload_2         
		//    9   17:invokevirtual   #74  <Method int AppBarLayout.getHeight()>
		//   10   20:icmpgt          25
		//   11   23:iconst_1        
		//   12   24:ireturn         
		//   13   25:iconst_0        
		//   14   26:ireturn         
		}

		private static boolean checkFlag(int i, int j)
		{
			return (i & j) == j;
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

		private View findFirstScrollingChild(CoordinatorLayout coordinatorlayout)
		{
			int j = coordinatorlayout.getChildCount();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #146 <Method int CoordinatorLayout.getChildCount()>
		//    2    4:istore_3        
			for(int i = 0; i < j; i++)
		//*   3    5:iconst_0        
		//*   4    6:istore_2        
		//*   5    7:iload_2         
		//*   6    8:iload_3         
		//*   7    9:icmpge          37
			{
				View view = coordinatorlayout.getChildAt(i);
		//    8   12:aload_1         
		//    9   13:iload_2         
		//   10   14:invokevirtual   #150 <Method View CoordinatorLayout.getChildAt(int)>
		//   11   17:astore          4
				if(view instanceof NestedScrollingChild)
		//*  12   19:aload           4
		//*  13   21:instanceof      #152 <Class NestedScrollingChild>
		//*  14   24:ifeq            30
					return view;
		//   15   27:aload           4
		//   16   29:areturn         
			}

		//   17   30:iload_2         
		//   18   31:iconst_1        
		//   19   32:iadd            
		//   20   33:istore_2        
		//*  21   34:goto            7
			return null;
		//   22   37:aconst_null     
		//   23   38:areturn         
		}

		private static View getAppBarChildOnOffset(AppBarLayout appbarlayout, int i)
		{
			int j = Math.abs(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #63  <Method int Math.abs(int)>
		//    2    4:istore_2        
			int k = appbarlayout.getChildCount();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #156 <Method int AppBarLayout.getChildCount()>
		//    5    9:istore_3        
			for(i = 0; i < k; i++)
		//*   6   10:iconst_0        
		//*   7   11:istore_1        
		//*   8   12:iload_1         
		//*   9   13:iload_3         
		//*  10   14:icmpge          52
			{
				View view = appbarlayout.getChildAt(i);
		//   11   17:aload_0         
		//   12   18:iload_1         
		//   13   19:invokevirtual   #157 <Method View AppBarLayout.getChildAt(int)>
		//   14   22:astore          4
				if(j >= view.getTop() && j <= view.getBottom())
		//*  15   24:iload_2         
		//*  16   25:aload           4
		//*  17   27:invokevirtual   #160 <Method int View.getTop()>
		//*  18   30:icmplt          45
		//*  19   33:iload_2         
		//*  20   34:aload           4
		//*  21   36:invokevirtual   #163 <Method int View.getBottom()>
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

		private int getChildIndexOnOffset(AppBarLayout appbarlayout, int i)
		{
			int k1 = appbarlayout.getChildCount();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #156 <Method int AppBarLayout.getChildCount()>
		//    2    4:istore          8
			for(int j = 0; j < k1; j++)
		//*   3    6:iconst_0        
		//*   4    7:istore_3        
		//*   5    8:iload_3         
		//*   6    9:iload           8
		//*   7   11:icmpge          113
			{
				Object obj = ((Object) (appbarlayout.getChildAt(j)));
		//    8   14:aload_1         
		//    9   15:iload_3         
		//   10   16:invokevirtual   #157 <Method View AppBarLayout.getChildAt(int)>
		//   11   19:astore          9
				int j1 = ((View) (obj)).getTop();
		//   12   21:aload           9
		//   13   23:invokevirtual   #160 <Method int View.getTop()>
		//   14   26:istore          7
				int i1 = ((View) (obj)).getBottom();
		//   15   28:aload           9
		//   16   30:invokevirtual   #163 <Method int View.getBottom()>
		//   17   33:istore          6
				obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
		//   18   35:aload           9
		//   19   37:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   20   40:checkcast       #171 <Class AppBarLayout$LayoutParams>
		//   21   43:astore          9
				int l = j1;
		//   22   45:iload           7
		//   23   47:istore          5
				int k = i1;
		//   24   49:iload           6
		//   25   51:istore          4
				if(checkFlag(((LayoutParams) (obj)).getScrollFlags(), 32))
		//*  26   53:aload           9
		//*  27   55:invokevirtual   #174 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//*  28   58:bipush          32
		//*  29   60:invokestatic    #176 <Method boolean checkFlag(int, int)>
		//*  30   63:ifeq            86
				{
					l = j1 - ((LayoutParams) (obj)).topMargin;
		//   31   66:iload           7
		//   32   68:aload           9
		//   33   70:getfield        #179 <Field int AppBarLayout$LayoutParams.topMargin>
		//   34   73:isub            
		//   35   74:istore          5
					k = i1 + ((LayoutParams) (obj)).bottomMargin;
		//   36   76:iload           6
		//   37   78:aload           9
		//   38   80:getfield        #182 <Field int AppBarLayout$LayoutParams.bottomMargin>
		//   39   83:iadd            
		//   40   84:istore          4
				}
				i1 = -i;
		//   41   86:iload_2         
		//   42   87:ineg            
		//   43   88:istore          6
				if(l <= i1 && k >= i1)
		//*  44   90:iload           5
		//*  45   92:iload           6
		//*  46   94:icmpgt          106
		//*  47   97:iload           4
		//*  48   99:iload           6
		//*  49  101:icmplt          106
					return j;
		//   50  104:iload_3         
		//   51  105:ireturn         
			}

		//   52  106:iload_3         
		//   53  107:iconst_1        
		//   54  108:iadd            
		//   55  109:istore_3        
		//*  56  110:goto            8
			return -1;
		//   57  113:iconst_m1       
		//   58  114:ireturn         
		}

		private int interpolateOffset(AppBarLayout appbarlayout, int i)
		{
			int l = Math.abs(i);
		//    0    0:iload_2         
		//    1    1:invokestatic    #63  <Method int Math.abs(int)>
		//    2    4:istore          6
			int i1 = appbarlayout.getChildCount();
		//    3    6:aload_1         
		//    4    7:invokevirtual   #156 <Method int AppBarLayout.getChildCount()>
		//    5   10:istore          7
			int k = 0;
		//    6   12:iconst_0        
		//    7   13:istore          5
			int j = 0;
		//    8   15:iconst_0        
		//    9   16:istore          4
			do
			{
				if(j >= i1)
					break;
		//   10   18:iload           4
		//   11   20:iload           7
		//   12   22:icmpge          217
				View view = appbarlayout.getChildAt(j);
		//   13   25:aload_1         
		//   14   26:iload           4
		//   15   28:invokevirtual   #157 <Method View AppBarLayout.getChildAt(int)>
		//   16   31:astore          8
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   17   33:aload           8
		//   18   35:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   19   38:checkcast       #171 <Class AppBarLayout$LayoutParams>
		//   20   41:astore          9
				Interpolator interpolator = layoutparams.getScrollInterpolator();
		//   21   43:aload           9
		//   22   45:invokevirtual   #188 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
		//   23   48:astore          10
				if(l >= view.getTop() && l <= view.getBottom())
		//*  24   50:iload           6
		//*  25   52:aload           8
		//*  26   54:invokevirtual   #160 <Method int View.getTop()>
		//*  27   57:icmplt          208
		//*  28   60:iload           6
		//*  29   62:aload           8
		//*  30   64:invokevirtual   #163 <Method int View.getBottom()>
		//*  31   67:icmpgt          208
				{
					if(interpolator != null)
		//*  32   70:aload           10
		//*  33   72:ifnull          217
					{
						int j1 = layoutparams.getScrollFlags();
		//   34   75:aload           9
		//   35   77:invokevirtual   #174 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//   36   80:istore          7
						j = k;
		//   37   82:iload           5
		//   38   84:istore          4
						if((j1 & 1) != 0)
		//*  39   86:iload           7
		//*  40   88:iconst_1        
		//*  41   89:iand            
		//*  42   90:ifeq            135
						{
							k = 0 + (view.getHeight() + layoutparams.topMargin + layoutparams.bottomMargin);
		//   43   93:iconst_0        
		//   44   94:aload           8
		//   45   96:invokevirtual   #137 <Method int View.getHeight()>
		//   46   99:aload           9
		//   47  101:getfield        #179 <Field int AppBarLayout$LayoutParams.topMargin>
		//   48  104:iadd            
		//   49  105:aload           9
		//   50  107:getfield        #182 <Field int AppBarLayout$LayoutParams.bottomMargin>
		//   51  110:iadd            
		//   52  111:iadd            
		//   53  112:istore          5
							j = k;
		//   54  114:iload           5
		//   55  116:istore          4
							if((j1 & 2) != 0)
		//*  56  118:iload           7
		//*  57  120:iconst_2        
		//*  58  121:iand            
		//*  59  122:ifeq            135
								j = k - ViewCompat.getMinimumHeight(view);
		//   60  125:iload           5
		//   61  127:aload           8
		//   62  129:invokestatic    #194 <Method int ViewCompat.getMinimumHeight(View)>
		//   63  132:isub            
		//   64  133:istore          4
						}
						k = j;
		//   65  135:iload           4
		//   66  137:istore          5
						if(ViewCompat.getFitsSystemWindows(view))
		//*  67  139:aload           8
		//*  68  141:invokestatic    #198 <Method boolean ViewCompat.getFitsSystemWindows(View)>
		//*  69  144:ifeq            156
							k = j - appbarlayout.getTopInset();
		//   70  147:iload           4
		//   71  149:aload_1         
		//   72  150:invokevirtual   #201 <Method int AppBarLayout.getTopInset()>
		//   73  153:isub            
		//   74  154:istore          5
						if(k > 0)
		//*  75  156:iload           5
		//*  76  158:ifle            217
						{
							j = view.getTop();
		//   77  161:aload           8
		//   78  163:invokevirtual   #160 <Method int View.getTop()>
		//   79  166:istore          4
							float f = k;
		//   80  168:iload           5
		//   81  170:i2f             
		//   82  171:fstore_3        
							j = Math.round(f * interpolator.getInterpolation((float)(l - j) / f));
		//   83  172:fload_3         
		//   84  173:aload           10
		//   85  175:iload           6
		//   86  177:iload           4
		//   87  179:isub            
		//   88  180:i2f             
		//   89  181:fload_3         
		//   90  182:fdiv            
		//   91  183:invokeinterface #206 <Method float Interpolator.getInterpolation(float)>
		//   92  188:fmul            
		//   93  189:invokestatic    #71  <Method int Math.round(float)>
		//   94  192:istore          4
							return Integer.signum(i) * (view.getTop() + j);
		//   95  194:iload_2         
		//   96  195:invokestatic    #211 <Method int Integer.signum(int)>
		//   97  198:aload           8
		//   98  200:invokevirtual   #160 <Method int View.getTop()>
		//   99  203:iload           4
		//  100  205:iadd            
		//  101  206:imul            
		//  102  207:ireturn         
						}
					}
					break;
				}
				j++;
		//  103  208:iload           4
		//  104  210:iconst_1        
		//  105  211:iadd            
		//  106  212:istore          4
			} while(true);
		//  107  214:goto            18
			return i;
		//  108  217:iload_2         
		//  109  218:ireturn         
		}

		private boolean shouldJumpElevationState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			coordinatorlayout = ((CoordinatorLayout) (coordinatorlayout.getDependents(((View) (appbarlayout)))));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #217 <Method List CoordinatorLayout.getDependents(View)>
		//    3    5:astore_1        
			int j = ((List) (coordinatorlayout)).size();
		//    4    6:aload_1         
		//    5    7:invokeinterface #222 <Method int List.size()>
		//    6   12:istore          4
			boolean flag = false;
		//    7   14:iconst_0        
		//    8   15:istore          5
			for(int i = 0; i < j; i++)
		//*   9   17:iconst_0        
		//*  10   18:istore_3        
		//*  11   19:iload_3         
		//*  12   20:iload           4
		//*  13   22:icmpge          75
			{
				appbarlayout = ((AppBarLayout) (((CoordinatorLayout.LayoutParams)((View)((List) (coordinatorlayout)).get(i)).getLayoutParams()).getBehavior()));
		//   14   25:aload_1         
		//   15   26:iload_3         
		//   16   27:invokeinterface #226 <Method Object List.get(int)>
		//   17   32:checkcast       #136 <Class View>
		//   18   35:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   19   38:checkcast       #228 <Class CoordinatorLayout$LayoutParams>
		//   20   41:invokevirtual   #232 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
		//   21   44:astore_2        
				if(appbarlayout instanceof ScrollingViewBehavior)
		//*  22   45:aload_2         
		//*  23   46:instanceof      #234 <Class AppBarLayout$ScrollingViewBehavior>
		//*  24   49:ifeq            68
				{
					if(((ScrollingViewBehavior)appbarlayout).getOverlayTop() != 0)
		//*  25   52:aload_2         
		//*  26   53:checkcast       #234 <Class AppBarLayout$ScrollingViewBehavior>
		//*  27   56:invokevirtual   #237 <Method int AppBarLayout$ScrollingViewBehavior.getOverlayTop()>
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

		private void snapToChildIfNeeded(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			int i1 = getTopBottomOffsetForScrollingSibling();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #57  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:istore          7
			int k = getChildIndexOnOffset(appbarlayout, i1);
		//    3    6:aload_0         
		//    4    7:aload_2         
		//    5    8:iload           7
		//    6   10:invokespecial   #242 <Method int getChildIndexOnOffset(AppBarLayout, int)>
		//    7   13:istore          5
			if(k >= 0)
		//*   8   15:iload           5
		//*   9   17:iflt            232
			{
				View view = appbarlayout.getChildAt(k);
		//   10   20:aload_2         
		//   11   21:iload           5
		//   12   23:invokevirtual   #157 <Method View AppBarLayout.getChildAt(int)>
		//   13   26:astore          9
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   14   28:aload           9
		//   15   30:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   16   33:checkcast       #171 <Class AppBarLayout$LayoutParams>
		//   17   36:astore          10
				int j1 = layoutparams.getScrollFlags();
		//   18   38:aload           10
		//   19   40:invokevirtual   #174 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//   20   43:istore          8
				if((j1 & 0x11) == 17)
		//*  21   45:iload           8
		//*  22   47:bipush          17
		//*  23   49:iand            
		//*  24   50:bipush          17
		//*  25   52:icmpne          232
				{
					int l = -view.getTop();
		//   26   55:aload           9
		//   27   57:invokevirtual   #160 <Method int View.getTop()>
		//   28   60:ineg            
		//   29   61:istore          6
					int i = -view.getBottom();
		//   30   63:aload           9
		//   31   65:invokevirtual   #163 <Method int View.getBottom()>
		//   32   68:ineg            
		//   33   69:istore_3        
					int j = i;
		//   34   70:iload_3         
		//   35   71:istore          4
					if(k == appbarlayout.getChildCount() - 1)
		//*  36   73:iload           5
		//*  37   75:aload_2         
		//*  38   76:invokevirtual   #156 <Method int AppBarLayout.getChildCount()>
		//*  39   79:iconst_1        
		//*  40   80:isub            
		//*  41   81:icmpne          92
						j = i + appbarlayout.getTopInset();
		//   42   84:iload_3         
		//   43   85:aload_2         
		//   44   86:invokevirtual   #201 <Method int AppBarLayout.getTopInset()>
		//   45   89:iadd            
		//   46   90:istore          4
					if(checkFlag(j1, 2))
		//*  47   92:iload           8
		//*  48   94:iconst_2        
		//*  49   95:invokestatic    #176 <Method boolean checkFlag(int, int)>
		//*  50   98:ifeq            117
					{
						i = j + ViewCompat.getMinimumHeight(view);
		//   51  101:iload           4
		//   52  103:aload           9
		//   53  105:invokestatic    #194 <Method int ViewCompat.getMinimumHeight(View)>
		//   54  108:iadd            
		//   55  109:istore_3        
						k = l;
		//   56  110:iload           6
		//   57  112:istore          5
					} else
		//*  58  114:goto            161
					{
						k = l;
		//   59  117:iload           6
		//   60  119:istore          5
						i = j;
		//   61  121:iload           4
		//   62  123:istore_3        
						if(checkFlag(j1, 5))
		//*  63  124:iload           8
		//*  64  126:iconst_5        
		//*  65  127:invokestatic    #176 <Method boolean checkFlag(int, int)>
		//*  66  130:ifeq            161
						{
							i = ViewCompat.getMinimumHeight(view) + j;
		//   67  133:aload           9
		//   68  135:invokestatic    #194 <Method int ViewCompat.getMinimumHeight(View)>
		//   69  138:iload           4
		//   70  140:iadd            
		//   71  141:istore_3        
							if(i1 < i)
		//*  72  142:iload           7
		//*  73  144:iload_3         
		//*  74  145:icmpge          157
							{
								k = i;
		//   75  148:iload_3         
		//   76  149:istore          5
								i = j;
		//   77  151:iload           4
		//   78  153:istore_3        
							} else
		//*  79  154:goto            161
							{
								k = l;
		//   80  157:iload           6
		//   81  159:istore          5
							}
						}
					}
					l = k;
		//   82  161:iload           5
		//   83  163:istore          6
					j = i;
		//   84  165:iload_3         
		//   85  166:istore          4
					if(checkFlag(j1, 32))
		//*  86  168:iload           8
		//*  87  170:bipush          32
		//*  88  172:invokestatic    #176 <Method boolean checkFlag(int, int)>
		//*  89  175:ifeq            197
					{
						l = k + layoutparams.topMargin;
		//   90  178:iload           5
		//   91  180:aload           10
		//   92  182:getfield        #179 <Field int AppBarLayout$LayoutParams.topMargin>
		//   93  185:iadd            
		//   94  186:istore          6
						j = i - layoutparams.bottomMargin;
		//   95  188:iload_3         
		//   96  189:aload           10
		//   97  191:getfield        #182 <Field int AppBarLayout$LayoutParams.bottomMargin>
		//   98  194:isub            
		//   99  195:istore          4
					}
					i = l;
		//  100  197:iload           6
		//  101  199:istore_3        
					if(i1 < (j + l) / 2)
		//* 102  200:iload           7
		//* 103  202:iload           4
		//* 104  204:iload           6
		//* 105  206:iadd            
		//* 106  207:iconst_2        
		//* 107  208:idiv            
		//* 108  209:icmpge          215
						i = j;
		//  109  212:iload           4
		//  110  214:istore_3        
					animateOffsetTo(coordinatorlayout, appbarlayout, MathUtils.clamp(i, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
		//  111  215:aload_0         
		//  112  216:aload_1         
		//  113  217:aload_2         
		//  114  218:iload_3         
		//  115  219:aload_2         
		//  116  220:invokevirtual   #245 <Method int AppBarLayout.getTotalScrollRange()>
		//  117  223:ineg            
		//  118  224:iconst_0        
		//  119  225:invokestatic    #251 <Method int MathUtils.clamp(int, int, int)>
		//  120  228:fconst_0        
		//  121  229:invokespecial   #253 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				}
			}
		//  122  232:return          
		}

		private void stopNestedScrollIfNeeded(int i, AppBarLayout appbarlayout, View view, int j)
		{
			if(j == 1)
		//*   0    0:iload           4
		//*   1    2:iconst_1        
		//*   2    3:icmpne          40
			{
				j = getTopBottomOffsetForScrollingSibling();
		//    3    6:aload_0         
		//    4    7:invokevirtual   #57  <Method int getTopBottomOffsetForScrollingSibling()>
		//    5   10:istore          4
				if(i < 0 && j == 0 || i > 0 && j == -appbarlayout.getDownNestedScrollRange())
		//*   6   12:iload_1         
		//*   7   13:ifge            21
		//*   8   16:iload           4
		//*   9   18:ifeq            35
		//*  10   21:iload_1         
		//*  11   22:ifle            40
		//*  12   25:iload           4
		//*  13   27:aload_2         
		//*  14   28:invokevirtual   #259 <Method int AppBarLayout.getDownNestedScrollRange()>
		//*  15   31:ineg            
		//*  16   32:icmpne          40
					ViewCompat.stopNestedScroll(view, 1);
		//   17   35:aload_3         
		//   18   36:iconst_1        
		//   19   37:invokestatic    #263 <Method void ViewCompat.stopNestedScroll(View, int)>
			}
		//   20   40:return          
		}

		private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, boolean flag)
		{
label0:
			{
				boolean flag1;
label1:
				{
					View view = getAppBarChildOnOffset(appbarlayout, i);
		//    0    0:aload_2         
		//    1    1:iload_3         
		//    2    2:invokestatic    #268 <Method View getAppBarChildOnOffset(AppBarLayout, int)>
		//    3    5:astore          10
					if(view == null)
						break label0;
		//    4    7:aload           10
		//    5    9:ifnull          205
					int k = ((LayoutParams)view.getLayoutParams()).getScrollFlags();
		//    6   12:aload           10
		//    7   14:invokevirtual   #169 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    8   17:checkcast       #171 <Class AppBarLayout$LayoutParams>
		//    9   20:invokevirtual   #174 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//   10   23:istore          6
					if((k & 1) != 0)
		//*  11   25:iload           6
		//*  12   27:iconst_1        
		//*  13   28:iand            
		//*  14   29:ifeq            119
					{
						int l = ViewCompat.getMinimumHeight(view);
		//   15   32:aload           10
		//   16   34:invokestatic    #194 <Method int ViewCompat.getMinimumHeight(View)>
		//   17   37:istore          7
						if(j > 0 && (k & 0xc) != 0)
		//*  18   39:iload           4
		//*  19   41:ifle            82
		//*  20   44:iload           6
		//*  21   46:bipush          12
		//*  22   48:iand            
		//*  23   49:ifeq            82
						{
							if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
		//*  24   52:iload_3         
		//*  25   53:ineg            
		//*  26   54:aload           10
		//*  27   56:invokevirtual   #163 <Method int View.getBottom()>
		//*  28   59:iload           7
		//*  29   61:isub            
		//*  30   62:aload_2         
		//*  31   63:invokevirtual   #201 <Method int AppBarLayout.getTopInset()>
		//*  32   66:isub            
		//*  33   67:icmplt          76
								flag1 = true;
		//   34   70:iconst_1        
		//   35   71:istore          8
							else
		//*  36   73:goto            122
								flag1 = false;
		//   37   76:iconst_0        
		//   38   77:istore          8
							break label1;
		//   39   79:goto            122
						}
						if((k & 2) != 0)
		//*  40   82:iload           6
		//*  41   84:iconst_2        
		//*  42   85:iand            
		//*  43   86:ifeq            119
						{
							if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
		//*  44   89:iload_3         
		//*  45   90:ineg            
		//*  46   91:aload           10
		//*  47   93:invokevirtual   #163 <Method int View.getBottom()>
		//*  48   96:iload           7
		//*  49   98:isub            
		//*  50   99:aload_2         
		//*  51  100:invokevirtual   #201 <Method int AppBarLayout.getTopInset()>
		//*  52  103:isub            
		//*  53  104:icmplt          113
								flag1 = true;
		//   54  107:iconst_1        
		//   55  108:istore          8
							else
		//*  56  110:goto            122
								flag1 = false;
		//   57  113:iconst_0        
		//   58  114:istore          8
							break label1;
		//   59  116:goto            122
						}
					}
					flag1 = false;
		//   60  119:iconst_0        
		//   61  120:istore          8
				}
				boolean flag2 = flag1;
		//   62  122:iload           8
		//   63  124:istore          9
				if(appbarlayout.isLiftOnScroll())
		//*  64  126:aload_2         
		//*  65  127:invokevirtual   #271 <Method boolean AppBarLayout.isLiftOnScroll()>
		//*  66  130:ifeq            166
				{
					View view1 = findFirstScrollingChild(coordinatorlayout);
		//   67  133:aload_0         
		//   68  134:aload_1         
		//   69  135:invokespecial   #273 <Method View findFirstScrollingChild(CoordinatorLayout)>
		//   70  138:astore          10
					flag2 = flag1;
		//   71  140:iload           8
		//   72  142:istore          9
					if(view1 != null)
		//*  73  144:aload           10
		//*  74  146:ifnull          166
						if(view1.getScrollY() > 0)
		//*  75  149:aload           10
		//*  76  151:invokevirtual   #276 <Method int View.getScrollY()>
		//*  77  154:ifle            163
							flag2 = true;
		//   78  157:iconst_1        
		//   79  158:istore          9
						else
		//*  80  160:goto            166
							flag2 = false;
		//   81  163:iconst_0        
		//   82  164:istore          9
				}
				flag1 = appbarlayout.setLiftedState(flag2);
		//   83  166:aload_2         
		//   84  167:iload           9
		//   85  169:invokevirtual   #280 <Method boolean AppBarLayout.setLiftedState(boolean)>
		//   86  172:istore          8
				if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && shouldJumpElevationState(coordinatorlayout, appbarlayout)))
		//*  87  174:getstatic       #285 <Field int android.os.Build$VERSION.SDK_INT>
		//*  88  177:bipush          11
		//*  89  179:icmplt          205
		//*  90  182:iload           5
		//*  91  184:ifne            201
		//*  92  187:iload           8
		//*  93  189:ifeq            205
		//*  94  192:aload_0         
		//*  95  193:aload_1         
		//*  96  194:aload_2         
		//*  97  195:invokespecial   #287 <Method boolean shouldJumpElevationState(CoordinatorLayout, AppBarLayout)>
		//*  98  198:ifeq            205
					appbarlayout.jumpDrawablesToCurrentState();
		//   99  201:aload_2         
		//  100  202:invokevirtual   #290 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
			}
		//  101  205:return          
		}

		boolean canDragView(AppBarLayout appbarlayout)
		{
			BaseDragCallback basedragcallback = onDragCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #295 <Field AppBarLayout$BaseBehavior$BaseDragCallback onDragCallback>
		//    2    4:astore_2        
			if(basedragcallback != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          15
				return basedragcallback.canDrag(appbarlayout);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #298 <Method boolean AppBarLayout$BaseBehavior$BaseDragCallback.canDrag(AppBarLayout)>
		//    8   14:ireturn         
			appbarlayout = ((AppBarLayout) (lastNestedScrollingChildRef));
		//    9   15:aload_0         
		//   10   16:getfield        #300 <Field WeakReference lastNestedScrollingChildRef>
		//   11   19:astore_1        
			if(appbarlayout != null)
		//*  12   20:aload_1         
		//*  13   21:ifnull          55
			{
				appbarlayout = ((AppBarLayout) ((View)((WeakReference) (appbarlayout)).get()));
		//   14   24:aload_1         
		//   15   25:invokevirtual   #305 <Method Object WeakReference.get()>
		//   16   28:checkcast       #136 <Class View>
		//   17   31:astore_1        
				return appbarlayout != null && ((View) (appbarlayout)).isShown() && !((View) (appbarlayout)).canScrollVertically(-1);
		//   18   32:aload_1         
		//   19   33:ifnull          53
		//   20   36:aload_1         
		//   21   37:invokevirtual   #308 <Method boolean View.isShown()>
		//   22   40:ifeq            53
		//   23   43:aload_1         
		//   24   44:iconst_m1       
		//   25   45:invokevirtual   #312 <Method boolean View.canScrollVertically(int)>
		//   26   48:ifne            53
		//   27   51:iconst_1        
		//   28   52:ireturn         
		//   29   53:iconst_0        
		//   30   54:ireturn         
			} else
			{
				return true;
		//   31   55:iconst_1        
		//   32   56:ireturn         
			}
		}

		volatile boolean canDragView(View view)
		{
			return canDragView((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #315 <Method boolean canDragView(AppBarLayout)>
		//    4    8:ireturn         
		}

		int getMaxDragOffset(AppBarLayout appbarlayout)
		{
			return -appbarlayout.getDownNestedScrollRange();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #259 <Method int AppBarLayout.getDownNestedScrollRange()>
		//    2    4:ineg            
		//    3    5:ireturn         
		}

		volatile int getMaxDragOffset(View view)
		{
			return getMaxDragOffset((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #320 <Method int getMaxDragOffset(AppBarLayout)>
		//    4    8:ireturn         
		}

		int getScrollRangeForDragFling(AppBarLayout appbarlayout)
		{
			return appbarlayout.getTotalScrollRange();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #245 <Method int AppBarLayout.getTotalScrollRange()>
		//    2    4:ireturn         
		}

		volatile int getScrollRangeForDragFling(View view)
		{
			return getScrollRangeForDragFling((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #323 <Method int getScrollRangeForDragFling(AppBarLayout)>
		//    4    8:ireturn         
		}

		int getTopBottomOffsetForScrollingSibling()
		{
			return getTopAndBottomOffset() + offsetDelta;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #326 <Method int getTopAndBottomOffset()>
		//    2    4:aload_0         
		//    3    5:getfield        #51  <Field int offsetDelta>
		//    4    8:iadd            
		//    5    9:ireturn         
		}

		boolean isOffsetAnimatorRunning()
		{
			ValueAnimator valueanimator = offsetAnimator;
		//    0    0:aload_0         
		//    1    1:getfield        #83  <Field ValueAnimator offsetAnimator>
		//    2    4:astore_1        
			return valueanimator != null && valueanimator.isRunning();
		//    3    5:aload_1         
		//    4    6:ifnull          18
		//    5    9:aload_1         
		//    6   10:invokevirtual   #89  <Method boolean ValueAnimator.isRunning()>
		//    7   13:ifeq            18
		//    8   16:iconst_1        
		//    9   17:ireturn         
		//   10   18:iconst_0        
		//   11   19:ireturn         
		}

		void onFlingFinished(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			snapToChildIfNeeded(coordinatorlayout, appbarlayout);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #331 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
		//    4    6:return          
		}

		volatile void onFlingFinished(CoordinatorLayout coordinatorlayout, View view)
		{
			onFlingFinished(coordinatorlayout, (AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:invokevirtual   #334 <Method void onFlingFinished(CoordinatorLayout, AppBarLayout)>
		//    5    9:return          
		}

		public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
		{
			boolean flag = super.onLayoutChild(coordinatorlayout, ((View) (appbarlayout)), i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #339 <Method boolean HeaderBehavior.onLayoutChild(CoordinatorLayout, View, int)>
		//    5    7:istore          5
			int j = appbarlayout.getPendingAction();
		//    6    9:aload_2         
		//    7   10:invokevirtual   #342 <Method int AppBarLayout.getPendingAction()>
		//    8   13:istore          4
			i = offsetToChildIndexOnLayout;
		//    9   15:aload_0         
		//   10   16:getfield        #43  <Field int offsetToChildIndexOnLayout>
		//   11   19:istore_3        
			if(i >= 0 && (j & 8) == 0)
		//*  12   20:iload_3         
		//*  13   21:iflt            97
		//*  14   24:iload           4
		//*  15   26:bipush          8
		//*  16   28:iand            
		//*  17   29:ifne            97
			{
				View view = appbarlayout.getChildAt(i);
		//   18   32:aload_2         
		//   19   33:iload_3         
		//   20   34:invokevirtual   #157 <Method View AppBarLayout.getChildAt(int)>
		//   21   37:astore          6
				i = -view.getBottom();
		//   22   39:aload           6
		//   23   41:invokevirtual   #163 <Method int View.getBottom()>
		//   24   44:ineg            
		//   25   45:istore_3        
				if(offsetToChildIndexOnLayoutIsMinHeight)
		//*  26   46:aload_0         
		//*  27   47:getfield        #344 <Field boolean offsetToChildIndexOnLayoutIsMinHeight>
		//*  28   50:ifeq            69
					i += ViewCompat.getMinimumHeight(view) + appbarlayout.getTopInset();
		//   29   53:iload_3         
		//   30   54:aload           6
		//   31   56:invokestatic    #194 <Method int ViewCompat.getMinimumHeight(View)>
		//   32   59:aload_2         
		//   33   60:invokevirtual   #201 <Method int AppBarLayout.getTopInset()>
		//   34   63:iadd            
		//   35   64:iadd            
		//   36   65:istore_3        
				else
		//*  37   66:goto            86
					i += Math.round((float)view.getHeight() * offsetToChildIndexOnLayoutPerc);
		//   38   69:iload_3         
		//   39   70:aload           6
		//   40   72:invokevirtual   #137 <Method int View.getHeight()>
		//   41   75:i2f             
		//   42   76:aload_0         
		//   43   77:getfield        #346 <Field float offsetToChildIndexOnLayoutPerc>
		//   44   80:fmul            
		//   45   81:invokestatic    #71  <Method int Math.round(float)>
		//   46   84:iadd            
		//   47   85:istore_3        
				setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), i);
		//   48   86:aload_0         
		//   49   87:aload_1         
		//   50   88:aload_2         
		//   51   89:iload_3         
		//   52   90:invokevirtual   #350 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//   53   93:pop             
			} else
		//*  54   94:goto            188
			if(j != 0)
		//*  55   97:iload           4
		//*  56   99:ifeq            188
			{
				if((j & 4) != 0)
		//*  57  102:iload           4
		//*  58  104:iconst_4        
		//*  59  105:iand            
		//*  60  106:ifeq            114
					i = 1;
		//   61  109:iconst_1        
		//   62  110:istore_3        
				else
		//*  63  111:goto            116
					i = 0;
		//   64  114:iconst_0        
		//   65  115:istore_3        
				if((j & 2) != 0)
		//*  66  116:iload           4
		//*  67  118:iconst_2        
		//*  68  119:iand            
		//*  69  120:ifeq            158
				{
					j = -appbarlayout.getUpNestedPreScrollRange();
		//   70  123:aload_2         
		//   71  124:invokevirtual   #353 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   72  127:ineg            
		//   73  128:istore          4
					if(i != 0)
		//*  74  130:iload_3         
		//*  75  131:ifeq            146
						animateOffsetTo(coordinatorlayout, appbarlayout, j, 0.0F);
		//   76  134:aload_0         
		//   77  135:aload_1         
		//   78  136:aload_2         
		//   79  137:iload           4
		//   80  139:fconst_0        
		//   81  140:invokespecial   #253 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
					else
		//*  82  143:goto            188
						setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), j);
		//   83  146:aload_0         
		//   84  147:aload_1         
		//   85  148:aload_2         
		//   86  149:iload           4
		//   87  151:invokevirtual   #350 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//   88  154:pop             
				} else
		//*  89  155:goto            188
				if((j & 1) != 0)
		//*  90  158:iload           4
		//*  91  160:iconst_1        
		//*  92  161:iand            
		//*  93  162:ifeq            188
					if(i != 0)
		//*  94  165:iload_3         
		//*  95  166:ifeq            180
						animateOffsetTo(coordinatorlayout, appbarlayout, 0, 0.0F);
		//   96  169:aload_0         
		//   97  170:aload_1         
		//   98  171:aload_2         
		//   99  172:iconst_0        
		//  100  173:fconst_0        
		//  101  174:invokespecial   #253 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
					else
		//* 102  177:goto            188
						setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), 0);
		//  103  180:aload_0         
		//  104  181:aload_1         
		//  105  182:aload_2         
		//  106  183:iconst_0        
		//  107  184:invokevirtual   #350 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//  108  187:pop             
			}
			appbarlayout.resetPendingAction();
		//  109  188:aload_2         
		//  110  189:invokevirtual   #356 <Method void AppBarLayout.resetPendingAction()>
			offsetToChildIndexOnLayout = -1;
		//  111  192:aload_0         
		//  112  193:iconst_m1       
		//  113  194:putfield        #43  <Field int offsetToChildIndexOnLayout>
			setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -appbarlayout.getTotalScrollRange(), 0));
		//  114  197:aload_0         
		//  115  198:aload_0         
		//  116  199:invokevirtual   #326 <Method int getTopAndBottomOffset()>
		//  117  202:aload_2         
		//  118  203:invokevirtual   #245 <Method int AppBarLayout.getTotalScrollRange()>
		//  119  206:ineg            
		//  120  207:iconst_0        
		//  121  208:invokestatic    #251 <Method int MathUtils.clamp(int, int, int)>
		//  122  211:invokevirtual   #359 <Method boolean setTopAndBottomOffset(int)>
		//  123  214:pop             
			updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, getTopAndBottomOffset(), 0, true);
		//  124  215:aload_0         
		//  125  216:aload_1         
		//  126  217:aload_2         
		//  127  218:aload_0         
		//  128  219:invokevirtual   #326 <Method int getTopAndBottomOffset()>
		//  129  222:iconst_0        
		//  130  223:iconst_1        
		//  131  224:invokespecial   #361 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
			appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
		//  132  227:aload_2         
		//  133  228:aload_0         
		//  134  229:invokevirtual   #326 <Method int getTopAndBottomOffset()>
		//  135  232:invokevirtual   #365 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
			return flag;
		//  136  235:iload           5
		//  137  237:ireturn         
		}

		public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
		{
			return onLayoutChild(coordinatorlayout, (AppBarLayout)view, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:iload_3         
		//    5    7:invokevirtual   #368 <Method boolean onLayoutChild(CoordinatorLayout, AppBarLayout, int)>
		//    6   10:ireturn         
		}

		public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k, int l)
		{
			if(((CoordinatorLayout.LayoutParams)appbarlayout.getLayoutParams()).height == -2)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #371 <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
		//*   2    4:checkcast       #228 <Class CoordinatorLayout$LayoutParams>
		//*   3    7:getfield        #374 <Field int CoordinatorLayout$LayoutParams.height>
		//*   4   10:bipush          -2
		//*   5   12:icmpne          32
			{
				coordinatorlayout.onMeasureChild(((View) (appbarlayout)), i, j, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), l);
		//    6   15:aload_1         
		//    7   16:aload_2         
		//    8   17:iload_3         
		//    9   18:iload           4
		//   10   20:iconst_0        
		//   11   21:iconst_0        
		//   12   22:invokestatic    #379 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   13   25:iload           6
		//   14   27:invokevirtual   #382 <Method void CoordinatorLayout.onMeasureChild(View, int, int, int, int)>
				return true;
		//   15   30:iconst_1        
		//   16   31:ireturn         
			} else
			{
				return super.onMeasureChild(coordinatorlayout, ((View) (appbarlayout)), i, j, k, l);
		//   17   32:aload_0         
		//   18   33:aload_1         
		//   19   34:aload_2         
		//   20   35:iload_3         
		//   21   36:iload           4
		//   22   38:iload           5
		//   23   40:iload           6
		//   24   42:invokespecial   #385 <Method boolean HeaderBehavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
		//   25   45:ireturn         
			}
		}

		public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
		{
			return onMeasureChild(coordinatorlayout, (AppBarLayout)view, i, j, k, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:iload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:iload           6
		//    8   13:invokevirtual   #388 <Method boolean onMeasureChild(CoordinatorLayout, AppBarLayout, int, int, int, int)>
		//    9   16:ireturn         
		}

		public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[], int k)
		{
			if(j != 0)
		//*   0    0:iload           5
		//*   1    2:ifeq            80
			{
				int l;
				if(j < 0)
		//*   2    5:iload           5
		//*   3    7:ifge            37
				{
					l = -appbarlayout.getTotalScrollRange();
		//    4   10:aload_2         
		//    5   11:invokevirtual   #245 <Method int AppBarLayout.getTotalScrollRange()>
		//    6   14:ineg            
		//    7   15:istore          8
					int i1 = appbarlayout.getDownNestedPreScrollRange();
		//    8   17:aload_2         
		//    9   18:invokevirtual   #393 <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   10   21:istore          9
					i = l;
		//   11   23:iload           8
		//   12   25:istore          4
					l = i1 + l;
		//   13   27:iload           9
		//   14   29:iload           8
		//   15   31:iadd            
		//   16   32:istore          8
				} else
		//*  17   34:goto            47
				{
					i = -appbarlayout.getUpNestedPreScrollRange();
		//   18   37:aload_2         
		//   19   38:invokevirtual   #353 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   20   41:ineg            
		//   21   42:istore          4
					l = 0;
		//   22   44:iconst_0        
		//   23   45:istore          8
				}
				if(i != l)
		//*  24   47:iload           4
		//*  25   49:iload           8
		//*  26   51:icmpeq          80
				{
					ai[1] = scroll(coordinatorlayout, ((View) (appbarlayout)), j, i, l);
		//   27   54:aload           6
		//   28   56:iconst_1        
		//   29   57:aload_0         
		//   30   58:aload_1         
		//   31   59:aload_2         
		//   32   60:iload           5
		//   33   62:iload           4
		//   34   64:iload           8
		//   35   66:invokevirtual   #397 <Method int scroll(CoordinatorLayout, View, int, int, int)>
		//   36   69:iastore         
					stopNestedScrollIfNeeded(j, appbarlayout, view, k);
		//   37   70:aload_0         
		//   38   71:iload           5
		//   39   73:aload_2         
		//   40   74:aload_3         
		//   41   75:iload           7
		//   42   77:invokespecial   #399 <Method void stopNestedScrollIfNeeded(int, AppBarLayout, View, int)>
				}
			}
		//   43   80:return          
		}

		public volatile void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[], int k)
		{
			onNestedPreScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, ai, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:aload           6
		//    8   13:iload           7
		//    9   15:invokevirtual   #403 <Method void onNestedPreScroll(CoordinatorLayout, AppBarLayout, View, int, int, int[], int)>
		//   10   18:return          
		}

		public void onNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int k, int l, 
				int i1)
		{
			if(l < 0)
		//*   0    0:iload           7
		//*   1    2:ifge            30
			{
				scroll(coordinatorlayout, ((View) (appbarlayout)), l, -appbarlayout.getDownNestedScrollRange(), 0);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:iload           7
		//    6   10:aload_2         
		//    7   11:invokevirtual   #259 <Method int AppBarLayout.getDownNestedScrollRange()>
		//    8   14:ineg            
		//    9   15:iconst_0        
		//   10   16:invokevirtual   #397 <Method int scroll(CoordinatorLayout, View, int, int, int)>
		//   11   19:pop             
				stopNestedScrollIfNeeded(l, appbarlayout, view, i1);
		//   12   20:aload_0         
		//   13   21:iload           7
		//   14   23:aload_2         
		//   15   24:aload_3         
		//   16   25:iload           8
		//   17   27:invokespecial   #399 <Method void stopNestedScrollIfNeeded(int, AppBarLayout, View, int)>
			}
			if(appbarlayout.isLiftOnScroll())
		//*  18   30:aload_2         
		//*  19   31:invokevirtual   #271 <Method boolean AppBarLayout.isLiftOnScroll()>
		//*  20   34:ifeq            60
			{
				boolean flag;
				if(view.getScrollY() > 0)
		//*  21   37:aload_3         
		//*  22   38:invokevirtual   #276 <Method int View.getScrollY()>
		//*  23   41:ifle            50
					flag = true;
		//   24   44:iconst_1        
		//   25   45:istore          9
				else
		//*  26   47:goto            53
					flag = false;
		//   27   50:iconst_0        
		//   28   51:istore          9
				appbarlayout.setLiftedState(flag);
		//   29   53:aload_2         
		//   30   54:iload           9
		//   31   56:invokevirtual   #280 <Method boolean AppBarLayout.setLiftedState(boolean)>
		//   32   59:pop             
			}
		//   33   60:return          
		}

		public volatile void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l, 
				int i1)
		{
			onNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, k, l, i1);
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
		//   10   17:invokevirtual   #409 <Method void onNestedScroll(CoordinatorLayout, AppBarLayout, View, int, int, int, int, int)>
		//   11   20:return          
		}

		public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, Parcelable parcelable)
		{
			if(parcelable instanceof SavedState)
		//*   0    0:aload_3         
		//*   1    1:instanceof      #15  <Class AppBarLayout$BaseBehavior$SavedState>
		//*   2    4:ifeq            47
			{
				parcelable = ((Parcelable) ((SavedState)parcelable));
		//    3    7:aload_3         
		//    4    8:checkcast       #15  <Class AppBarLayout$BaseBehavior$SavedState>
		//    5   11:astore_3        
				super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), ((SavedState) (parcelable)).getSuperState());
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:aload_3         
		//   10   16:invokevirtual   #415 <Method Parcelable AppBarLayout$BaseBehavior$SavedState.getSuperState()>
		//   11   19:invokespecial   #418 <Method void HeaderBehavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
				offsetToChildIndexOnLayout = ((SavedState) (parcelable)).firstVisibleChildIndex;
		//   12   22:aload_0         
		//   13   23:aload_3         
		//   14   24:getfield        #421 <Field int AppBarLayout$BaseBehavior$SavedState.firstVisibleChildIndex>
		//   15   27:putfield        #43  <Field int offsetToChildIndexOnLayout>
				offsetToChildIndexOnLayoutPerc = ((SavedState) (parcelable)).firstVisibleChildPercentageShown;
		//   16   30:aload_0         
		//   17   31:aload_3         
		//   18   32:getfield        #424 <Field float AppBarLayout$BaseBehavior$SavedState.firstVisibleChildPercentageShown>
		//   19   35:putfield        #346 <Field float offsetToChildIndexOnLayoutPerc>
				offsetToChildIndexOnLayoutIsMinHeight = ((SavedState) (parcelable)).firstVisibleChildAtMinimumHeight;
		//   20   38:aload_0         
		//   21   39:aload_3         
		//   22   40:getfield        #427 <Field boolean AppBarLayout$BaseBehavior$SavedState.firstVisibleChildAtMinimumHeight>
		//   23   43:putfield        #344 <Field boolean offsetToChildIndexOnLayoutIsMinHeight>
				return;
		//   24   46:return          
			} else
			{
				super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), parcelable);
		//   25   47:aload_0         
		//   26   48:aload_1         
		//   27   49:aload_2         
		//   28   50:aload_3         
		//   29   51:invokespecial   #418 <Method void HeaderBehavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
				offsetToChildIndexOnLayout = -1;
		//   30   54:aload_0         
		//   31   55:iconst_m1       
		//   32   56:putfield        #43  <Field int offsetToChildIndexOnLayout>
				return;
		//   33   59:return          
			}
		}

		public volatile void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
		{
			onRestoreInstanceState(coordinatorlayout, (AppBarLayout)view, parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #430 <Method void onRestoreInstanceState(CoordinatorLayout, AppBarLayout, Parcelable)>
		//    6   10:return          
		}

		public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			Object obj = ((Object) (super.onSaveInstanceState(coordinatorlayout, ((View) (appbarlayout)))));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #435 <Method Parcelable HeaderBehavior.onSaveInstanceState(CoordinatorLayout, View)>
		//    4    6:astore          8
			int j = getTopAndBottomOffset();
		//    5    8:aload_0         
		//    6    9:invokevirtual   #326 <Method int getTopAndBottomOffset()>
		//    7   12:istore          4
			int k = appbarlayout.getChildCount();
		//    8   14:aload_2         
		//    9   15:invokevirtual   #156 <Method int AppBarLayout.getChildCount()>
		//   10   18:istore          5
			boolean flag = false;
		//   11   20:iconst_0        
		//   12   21:istore          7
			for(int i = 0; i < k; i++)
		//*  13   23:iconst_0        
		//*  14   24:istore_3        
		//*  15   25:iload_3         
		//*  16   26:iload           5
		//*  17   28:icmpge          126
			{
				coordinatorlayout = ((CoordinatorLayout) (appbarlayout.getChildAt(i)));
		//   18   31:aload_2         
		//   19   32:iload_3         
		//   20   33:invokevirtual   #157 <Method View AppBarLayout.getChildAt(int)>
		//   21   36:astore_1        
				int l = ((View) (coordinatorlayout)).getBottom() + j;
		//   22   37:aload_1         
		//   23   38:invokevirtual   #163 <Method int View.getBottom()>
		//   24   41:iload           4
		//   25   43:iadd            
		//   26   44:istore          6
				if(((View) (coordinatorlayout)).getTop() + j <= 0 && l >= 0)
		//*  27   46:aload_1         
		//*  28   47:invokevirtual   #160 <Method int View.getTop()>
		//*  29   50:iload           4
		//*  30   52:iadd            
		//*  31   53:ifgt            119
		//*  32   56:iload           6
		//*  33   58:iflt            119
				{
					obj = ((Object) (new SavedState(((Parcelable) (obj)))));
		//   34   61:new             #15  <Class AppBarLayout$BaseBehavior$SavedState>
		//   35   64:dup             
		//   36   65:aload           8
		//   37   67:invokespecial   #438 <Method void AppBarLayout$BaseBehavior$SavedState(Parcelable)>
		//   38   70:astore          8
					obj.firstVisibleChildIndex = i;
		//   39   72:aload           8
		//   40   74:iload_3         
		//   41   75:putfield        #421 <Field int AppBarLayout$BaseBehavior$SavedState.firstVisibleChildIndex>
					if(l == ViewCompat.getMinimumHeight(((View) (coordinatorlayout))) + appbarlayout.getTopInset())
		//*  42   78:iload           6
		//*  43   80:aload_1         
		//*  44   81:invokestatic    #194 <Method int ViewCompat.getMinimumHeight(View)>
		//*  45   84:aload_2         
		//*  46   85:invokevirtual   #201 <Method int AppBarLayout.getTopInset()>
		//*  47   88:iadd            
		//*  48   89:icmpne          95
						flag = true;
		//   49   92:iconst_1        
		//   50   93:istore          7
					obj.firstVisibleChildAtMinimumHeight = flag;
		//   51   95:aload           8
		//   52   97:iload           7
		//   53   99:putfield        #427 <Field boolean AppBarLayout$BaseBehavior$SavedState.firstVisibleChildAtMinimumHeight>
					obj.firstVisibleChildPercentageShown = (float)l / (float)((View) (coordinatorlayout)).getHeight();
		//   54  102:aload           8
		//   55  104:iload           6
		//   56  106:i2f             
		//   57  107:aload_1         
		//   58  108:invokevirtual   #137 <Method int View.getHeight()>
		//   59  111:i2f             
		//   60  112:fdiv            
		//   61  113:putfield        #424 <Field float AppBarLayout$BaseBehavior$SavedState.firstVisibleChildPercentageShown>
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

		public volatile Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
		{
			return onSaveInstanceState(coordinatorlayout, (AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:invokevirtual   #441 <Method Parcelable onSaveInstanceState(CoordinatorLayout, AppBarLayout)>
		//    5    9:areturn         
		}

		public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i, int j)
		{
			boolean flag;
			if((i & 2) != 0 && (appbarlayout.isLiftOnScroll() || canScrollChildren(coordinatorlayout, appbarlayout, view)))
		//*   0    0:iload           5
		//*   1    2:iconst_2        
		//*   2    3:iand            
		//*   3    4:ifeq            30
		//*   4    7:aload_2         
		//*   5    8:invokevirtual   #271 <Method boolean AppBarLayout.isLiftOnScroll()>
		//*   6   11:ifne            24
		//*   7   14:aload_0         
		//*   8   15:aload_1         
		//*   9   16:aload_2         
		//*  10   17:aload_3         
		//*  11   18:invokespecial   #445 <Method boolean canScrollChildren(CoordinatorLayout, AppBarLayout, View)>
		//*  12   21:ifeq            30
				flag = true;
		//   13   24:iconst_1        
		//   14   25:istore          7
			else
		//*  15   27:goto            33
				flag = false;
		//   16   30:iconst_0        
		//   17   31:istore          7
			if(flag)
		//*  18   33:iload           7
		//*  19   35:ifeq            51
			{
				coordinatorlayout = ((CoordinatorLayout) (offsetAnimator));
		//   20   38:aload_0         
		//   21   39:getfield        #83  <Field ValueAnimator offsetAnimator>
		//   22   42:astore_1        
				if(coordinatorlayout != null)
		//*  23   43:aload_1         
		//*  24   44:ifnull          51
					((ValueAnimator) (coordinatorlayout)).cancel();
		//   25   47:aload_1         
		//   26   48:invokevirtual   #92  <Method void ValueAnimator.cancel()>
			}
			lastNestedScrollingChildRef = null;
		//   27   51:aload_0         
		//   28   52:aconst_null     
		//   29   53:putfield        #300 <Field WeakReference lastNestedScrollingChildRef>
			lastStartedType = j;
		//   30   56:aload_0         
		//   31   57:iload           6
		//   32   59:putfield        #447 <Field int lastStartedType>
			return flag;
		//   33   62:iload           7
		//   34   64:ireturn         
		}

		public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
		{
			return onStartNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, view2, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:iload           5
		//    7   11:iload           6
		//    8   13:invokevirtual   #451 <Method boolean onStartNestedScroll(CoordinatorLayout, AppBarLayout, View, View, int, int)>
		//    9   16:ireturn         
		}

		public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i)
		{
			if(lastStartedType == 0 || i == 1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #447 <Field int lastStartedType>
		//*   2    4:ifeq            13
		//*   3    7:iload           4
		//*   4    9:iconst_1        
		//*   5   10:icmpne          19
				snapToChildIfNeeded(coordinatorlayout, appbarlayout);
		//    6   13:aload_0         
		//    7   14:aload_1         
		//    8   15:aload_2         
		//    9   16:invokespecial   #331 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
			lastNestedScrollingChildRef = new WeakReference(((Object) (view)));
		//   10   19:aload_0         
		//   11   20:new             #302 <Class WeakReference>
		//   12   23:dup             
		//   13   24:aload_3         
		//   14   25:invokespecial   #456 <Method void WeakReference(Object)>
		//   15   28:putfield        #300 <Field WeakReference lastNestedScrollingChildRef>
		//   16   31:return          
		}

		public volatile void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i)
		{
			onStopNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:invokevirtual   #460 <Method void onStopNestedScroll(CoordinatorLayout, AppBarLayout, View, int)>
		//    7   12:return          
		}

		public void setDragCallback(BaseDragCallback basedragcallback)
		{
			onDragCallback = basedragcallback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #295 <Field AppBarLayout$BaseBehavior$BaseDragCallback onDragCallback>
		//    3    5:return          
		}

		int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
		{
			int l = getTopBottomOffsetForScrollingSibling();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #57  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:istore          6
			if(j != 0 && l >= j && l <= k)
		//*   3    6:iload           4
		//*   4    8:ifeq            133
		//*   5   11:iload           6
		//*   6   13:iload           4
		//*   7   15:icmplt          133
		//*   8   18:iload           6
		//*   9   20:iload           5
		//*  10   22:icmpgt          133
			{
				j = MathUtils.clamp(i, j, k);
		//   11   25:iload_3         
		//   12   26:iload           4
		//   13   28:iload           5
		//   14   30:invokestatic    #251 <Method int MathUtils.clamp(int, int, int)>
		//   15   33:istore          4
				if(l != j)
		//*  16   35:iload           6
		//*  17   37:iload           4
		//*  18   39:icmpeq          138
				{
					if(appbarlayout.hasChildWithInterpolator())
		//*  19   42:aload_2         
		//*  20   43:invokevirtual   #467 <Method boolean AppBarLayout.hasChildWithInterpolator()>
		//*  21   46:ifeq            60
						i = interpolateOffset(appbarlayout, j);
		//   22   49:aload_0         
		//   23   50:aload_2         
		//   24   51:iload           4
		//   25   53:invokespecial   #469 <Method int interpolateOffset(AppBarLayout, int)>
		//   26   56:istore_3        
					else
		//*  27   57:goto            63
						i = j;
		//   28   60:iload           4
		//   29   62:istore_3        
					boolean flag = setTopAndBottomOffset(i);
		//   30   63:aload_0         
		//   31   64:iload_3         
		//   32   65:invokevirtual   #359 <Method boolean setTopAndBottomOffset(int)>
		//   33   68:istore          7
					offsetDelta = j - i;
		//   34   70:aload_0         
		//   35   71:iload           4
		//   36   73:iload_3         
		//   37   74:isub            
		//   38   75:putfield        #51  <Field int offsetDelta>
					if(!flag && appbarlayout.hasChildWithInterpolator())
		//*  39   78:iload           7
		//*  40   80:ifne            95
		//*  41   83:aload_2         
		//*  42   84:invokevirtual   #467 <Method boolean AppBarLayout.hasChildWithInterpolator()>
		//*  43   87:ifeq            95
						coordinatorlayout.dispatchDependentViewsChanged(((View) (appbarlayout)));
		//   44   90:aload_1         
		//   45   91:aload_2         
		//   46   92:invokevirtual   #473 <Method void CoordinatorLayout.dispatchDependentViewsChanged(View)>
					appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
		//   47   95:aload_2         
		//   48   96:aload_0         
		//   49   97:invokevirtual   #326 <Method int getTopAndBottomOffset()>
		//   50  100:invokevirtual   #365 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
					if(j < l)
		//*  51  103:iload           4
		//*  52  105:iload           6
		//*  53  107:icmpge          115
						i = -1;
		//   54  110:iconst_m1       
		//   55  111:istore_3        
					else
		//*  56  112:goto            117
						i = 1;
		//   57  115:iconst_1        
		//   58  116:istore_3        
					updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, j, i, false);
		//   59  117:aload_0         
		//   60  118:aload_1         
		//   61  119:aload_2         
		//   62  120:iload           4
		//   63  122:iload_3         
		//   64  123:iconst_0        
		//   65  124:invokespecial   #361 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
					return l - j;
		//   66  127:iload           6
		//   67  129:iload           4
		//   68  131:isub            
		//   69  132:ireturn         
				}
			} else
			{
				offsetDelta = 0;
		//   70  133:aload_0         
		//   71  134:iconst_0        
		//   72  135:putfield        #51  <Field int offsetDelta>
			}
			return 0;
		//   73  138:iconst_0        
		//   74  139:ireturn         
		}

		volatile int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
		{
			return setHeaderTopBottomOffset(coordinatorlayout, (AppBarLayout)view, i, j, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:iload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:invokevirtual   #476 <Method int setHeaderTopBottomOffset(CoordinatorLayout, AppBarLayout, int, int, int)>
		//    8   14:ireturn         
		}

		private static final int INVALID_POSITION = -1;
		private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
		private WeakReference lastNestedScrollingChildRef;
		private int lastStartedType;
		private ValueAnimator offsetAnimator;
		private int offsetDelta;
		private int offsetToChildIndexOnLayout;
		private boolean offsetToChildIndexOnLayoutIsMinHeight;
		private float offsetToChildIndexOnLayoutPerc;
		private BaseDragCallback onDragCallback;


/*
		static int access$000(BaseBehavior basebehavior)
		{
			return basebehavior.offsetDelta;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field int offsetDelta>
		//    2    4:ireturn         
		}

*/

		public BaseBehavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void HeaderBehavior()>
			offsetToChildIndexOnLayout = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #43  <Field int offsetToChildIndexOnLayout>
		//    5    9:return          
		}

		public BaseBehavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #47  <Method void HeaderBehavior(Context, AttributeSet)>
			offsetToChildIndexOnLayout = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #43  <Field int offsetToChildIndexOnLayout>
		//    7   11:return          
		}
	}

	public static abstract class BaseBehavior.BaseDragCallback
	{

		public abstract boolean canDrag(AppBarLayout appbarlayout);

		public BaseBehavior.BaseDragCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	protected static class BaseBehavior.SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #59  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(firstVisibleChildIndex);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #40  <Field int firstVisibleChildIndex>
		//    7   11:invokevirtual   #63  <Method void Parcel.writeInt(int)>
			parcel.writeFloat(firstVisibleChildPercentageShown);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #46  <Field float firstVisibleChildPercentageShown>
		//   11   19:invokevirtual   #67  <Method void Parcel.writeFloat(float)>
			parcel.writeByte((byte)firstVisibleChildAtMinimumHeight);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
		//   15   27:int2byte        
		//   16   28:invokevirtual   #71  <Method void Parcel.writeByte(byte)>
		//   17   31:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public BaseBehavior.SavedState createFromParcel(Parcel parcel)
			{
				return new BaseBehavior.SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class AppBarLayout$BaseBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #25  <Method void AppBarLayout$BaseBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public BaseBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new BaseBehavior.SavedState(parcel, classloader);
			//    0    0:new             #9   <Class AppBarLayout$BaseBehavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #25  <Method void AppBarLayout$BaseBehavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #29  <Method AppBarLayout$BaseBehavior$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #32  <Method AppBarLayout$BaseBehavior$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public BaseBehavior.SavedState[] newArray(int i)
			{
				return new BaseBehavior.SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       BaseBehavior.SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #37  <Method AppBarLayout$BaseBehavior$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean firstVisibleChildAtMinimumHeight;
		int firstVisibleChildIndex;
		float firstVisibleChildPercentageShown;

		static 
		{
		//    0    0:new             #12  <Class AppBarLayout$BaseBehavior$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void AppBarLayout$BaseBehavior$SavedState$1()>
		//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public BaseBehavior.SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #32  <Method void AbsSavedState(Parcel, ClassLoader)>
			firstVisibleChildIndex = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #38  <Method int Parcel.readInt()>
		//    7   11:putfield        #40  <Field int firstVisibleChildIndex>
			firstVisibleChildPercentageShown = parcel.readFloat();
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #44  <Method float Parcel.readFloat()>
		//   11   19:putfield        #46  <Field float firstVisibleChildPercentageShown>
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
			firstVisibleChildAtMinimumHeight = flag;
		//   20   36:aload_0         
		//   21   37:iload_3         
		//   22   38:putfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
		//   23   41:return          
		}

		public BaseBehavior.SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #55  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static interface BaseOnOffsetChangedListener
	{

		public abstract void onOffsetChanged(AppBarLayout appbarlayout, int i);
	}

	public static class Behavior extends BaseBehavior
	{

		public volatile int getLeftAndRightOffset()
		{
			return super.getLeftAndRightOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method int AppBarLayout$BaseBehavior.getLeftAndRightOffset()>
		//    2    4:ireturn         
		}

		public volatile int getTopAndBottomOffset()
		{
			return super.getTopAndBottomOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method int AppBarLayout$BaseBehavior.getTopAndBottomOffset()>
		//    2    4:ireturn         
		}

		public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
		{
			return super.onLayoutChild(coordinatorlayout, appbarlayout, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #30  <Method boolean AppBarLayout$BaseBehavior.onLayoutChild(CoordinatorLayout, AppBarLayout, int)>
		//    5    7:ireturn         
		}

		public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k, int l)
		{
			return super.onMeasureChild(coordinatorlayout, appbarlayout, i, j, k, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:iload           4
		//    5    6:iload           5
		//    6    8:iload           6
		//    7   10:invokespecial   #34  <Method boolean AppBarLayout$BaseBehavior.onMeasureChild(CoordinatorLayout, AppBarLayout, int, int, int, int)>
		//    8   13:ireturn         
		}

		public volatile void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[], int k)
		{
			super.onNestedPreScroll(coordinatorlayout, appbarlayout, view, i, j, ai, k);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:iload           4
		//    5    6:iload           5
		//    6    8:aload           6
		//    7   10:iload           7
		//    8   12:invokespecial   #38  <Method void AppBarLayout$BaseBehavior.onNestedPreScroll(CoordinatorLayout, AppBarLayout, View, int, int, int[], int)>
		//    9   15:return          
		}

		public volatile void onNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int k, int l, 
				int i1)
		{
			super.onNestedScroll(coordinatorlayout, appbarlayout, view, i, j, k, l, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:iload           4
		//    5    6:iload           5
		//    6    8:iload           6
		//    7   10:iload           7
		//    8   12:iload           8
		//    9   14:invokespecial   #42  <Method void AppBarLayout$BaseBehavior.onNestedScroll(CoordinatorLayout, AppBarLayout, View, int, int, int, int, int)>
		//   10   17:return          
		}

		public volatile void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, Parcelable parcelable)
		{
			super.onRestoreInstanceState(coordinatorlayout, appbarlayout, parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #46  <Method void AppBarLayout$BaseBehavior.onRestoreInstanceState(CoordinatorLayout, AppBarLayout, Parcelable)>
		//    5    7:return          
		}

		public volatile Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			return super.onSaveInstanceState(coordinatorlayout, appbarlayout);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #50  <Method Parcelable AppBarLayout$BaseBehavior.onSaveInstanceState(CoordinatorLayout, AppBarLayout)>
		//    4    6:areturn         
		}

		public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i, int j)
		{
			return super.onStartNestedScroll(coordinatorlayout, appbarlayout, view, view1, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:iload           5
		//    6    8:iload           6
		//    7   10:invokespecial   #54  <Method boolean AppBarLayout$BaseBehavior.onStartNestedScroll(CoordinatorLayout, AppBarLayout, View, View, int, int)>
		//    8   13:ireturn         
		}

		public volatile void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i)
		{
			super.onStopNestedScroll(coordinatorlayout, appbarlayout, view, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:iload           4
		//    5    6:invokespecial   #58  <Method void AppBarLayout$BaseBehavior.onStopNestedScroll(CoordinatorLayout, AppBarLayout, View, int)>
		//    6    9:return          
		}

		public volatile void setDragCallback(BaseBehavior.BaseDragCallback basedragcallback)
		{
			super.setDragCallback(basedragcallback);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #63  <Method void AppBarLayout$BaseBehavior.setDragCallback(AppBarLayout$BaseBehavior$BaseDragCallback)>
		//    3    5:return          
		}

		public volatile boolean setLeftAndRightOffset(int i)
		{
			return super.setLeftAndRightOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #68  <Method boolean AppBarLayout$BaseBehavior.setLeftAndRightOffset(int)>
		//    3    5:ireturn         
		}

		public volatile boolean setTopAndBottomOffset(int i)
		{
			return super.setTopAndBottomOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #71  <Method boolean AppBarLayout$BaseBehavior.setTopAndBottomOffset(int)>
		//    3    5:ireturn         
		}

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void AppBarLayout$BaseBehavior()>
		//    2    4:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void AppBarLayout$BaseBehavior(Context, AttributeSet)>
		//    4    6:return          
		}
	}

	public static abstract class Behavior.DragCallback extends BaseBehavior.BaseDragCallback
	{

		public Behavior.DragCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void AppBarLayout$BaseBehavior$BaseDragCallback()>
		//    2    4:return          
		}
	}

	public static class LayoutParams extends android.widget.LinearLayout.LayoutParams
	{

		public int getScrollFlags()
		{
			return scrollFlags;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field int scrollFlags>
		//    2    4:ireturn         
		}

		public Interpolator getScrollInterpolator()
		{
			return scrollInterpolator;
		//    0    0:aload_0         
		//    1    1:getfield        #84  <Field Interpolator scrollInterpolator>
		//    2    4:areturn         
		}

		boolean isCollapsible()
		{
			int i = scrollFlags;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field int scrollFlags>
		//    2    4:istore_1        
			return (i & 1) == 1 && (i & 0xa) != 0;
		//    3    5:iload_1         
		//    4    6:iconst_1        
		//    5    7:iand            
		//    6    8:iconst_1        
		//    7    9:icmpne          21
		//    8   12:iload_1         
		//    9   13:bipush          10
		//   10   15:iand            
		//   11   16:ifeq            21
		//   12   19:iconst_1        
		//   13   20:ireturn         
		//   14   21:iconst_0        
		//   15   22:ireturn         
		}

		public void setScrollFlags(int i)
		{
			scrollFlags = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #38  <Field int scrollFlags>
		//    3    5:return          
		}

		public void setScrollInterpolator(Interpolator interpolator)
		{
			scrollInterpolator = interpolator;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #84  <Field Interpolator scrollInterpolator>
		//    3    5:return          
		}

		static final int COLLAPSIBLE_FLAGS = 10;
		static final int FLAG_QUICK_RETURN = 5;
		static final int FLAG_SNAP = 17;
		public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
		public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
		public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
		public static final int SCROLL_FLAG_SCROLL = 1;
		public static final int SCROLL_FLAG_SNAP = 16;
		public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
		int scrollFlags;
		Interpolator scrollInterpolator;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #36  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
			scrollFlags = 1;
		//    4    6:aload_0         
		//    5    7:iconst_1        
		//    6    8:putfield        #38  <Field int scrollFlags>
		//    7   11:return          
		}

		public LayoutParams(int i, int j, float f)
		{
			super(i, j, f);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:fload_3         
		//    4    4:invokespecial   #42  <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
			scrollFlags = 1;
		//    5    7:aload_0         
		//    6    8:iconst_1        
		//    7    9:putfield        #38  <Field int scrollFlags>
		//    8   12:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #45  <Method void android.widget.LinearLayout$LayoutParams(Context, AttributeSet)>
			scrollFlags = 1;
		//    4    6:aload_0         
		//    5    7:iconst_1        
		//    6    8:putfield        #38  <Field int scrollFlags>
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.AppBarLayout_Layout)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #51  <Field int[] android.support.design.R$styleable.AppBarLayout_Layout>
		//   10   16:invokevirtual   #57  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_2        
			scrollFlags = ((TypedArray) (attributeset)).getInt(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
		//   12   20:aload_0         
		//   13   21:aload_2         
		//   14   22:getstatic       #60  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollFlags>
		//   15   25:iconst_0        
		//   16   26:invokevirtual   #66  <Method int TypedArray.getInt(int, int)>
		//   17   29:putfield        #38  <Field int scrollFlags>
			if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator))
		//*  18   32:aload_2         
		//*  19   33:getstatic       #69  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollInterpolator>
		//*  20   36:invokevirtual   #73  <Method boolean TypedArray.hasValue(int)>
		//*  21   39:ifeq            58
				scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
		//   22   42:aload_0         
		//   23   43:aload_1         
		//   24   44:aload_2         
		//   25   45:getstatic       #69  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollInterpolator>
		//   26   48:iconst_0        
		//   27   49:invokevirtual   #76  <Method int TypedArray.getResourceId(int, int)>
		//   28   52:invokestatic    #82  <Method Interpolator android.view.animation.AnimationUtils.loadInterpolator(Context, int)>
		//   29   55:putfield        #84  <Field Interpolator scrollInterpolator>
			((TypedArray) (attributeset)).recycle();
		//   30   58:aload_2         
		//   31   59:invokevirtual   #88  <Method void TypedArray.recycle()>
		//   32   62:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.widget.LinearLayout.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #95  <Method void android.widget.LinearLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
			scrollFlags = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #38  <Field int scrollFlags>
			scrollFlags = layoutparams.scrollFlags;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #38  <Field int scrollFlags>
		//    9   15:putfield        #38  <Field int scrollFlags>
			scrollInterpolator = layoutparams.scrollInterpolator;
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:getfield        #84  <Field Interpolator scrollInterpolator>
		//   13   23:putfield        #84  <Field Interpolator scrollInterpolator>
		//   14   26:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #99  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
			scrollFlags = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #38  <Field int scrollFlags>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #102 <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			scrollFlags = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #38  <Field int scrollFlags>
		//    6   10:return          
		}

		public LayoutParams(android.widget.LinearLayout.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #95  <Method void android.widget.LinearLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
			scrollFlags = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #38  <Field int scrollFlags>
		//    6   10:return          
		}
	}

	public static interface LayoutParams.ScrollFlags
		extends Annotation
	{
	}

	public static interface OnOffsetChangedListener
		extends BaseOnOffsetChangedListener
	{

		public abstract void onOffsetChanged(AppBarLayout appbarlayout, int i);
	}

	public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior
	{

		private static int getAppBarLayoutOffset(AppBarLayout appbarlayout)
		{
			appbarlayout = ((AppBarLayout) (((CoordinatorLayout.LayoutParams)appbarlayout.getLayoutParams()).getBehavior()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #50  <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
		//    2    4:checkcast       #52  <Class CoordinatorLayout$LayoutParams>
		//    3    7:invokevirtual   #56  <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
		//    4   10:astore_0        
			if(appbarlayout instanceof BaseBehavior)
		//*   5   11:aload_0         
		//*   6   12:instanceof      #58  <Class AppBarLayout$BaseBehavior>
		//*   7   15:ifeq            26
				return ((BaseBehavior)appbarlayout).getTopBottomOffsetForScrollingSibling();
		//    8   18:aload_0         
		//    9   19:checkcast       #58  <Class AppBarLayout$BaseBehavior>
		//   10   22:invokevirtual   #62  <Method int AppBarLayout$BaseBehavior.getTopBottomOffsetForScrollingSibling()>
		//   11   25:ireturn         
			else
				return 0;
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		private void offsetChildAsNeeded(View view, View view1)
		{
			Object obj = ((Object) (((CoordinatorLayout.LayoutParams)view1.getLayoutParams()).getBehavior()));
		//    0    0:aload_2         
		//    1    1:invokevirtual   #67  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #52  <Class CoordinatorLayout$LayoutParams>
		//    3    7:invokevirtual   #56  <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
		//    4   10:astore_3        
			if(obj instanceof BaseBehavior)
		//*   5   11:aload_3         
		//*   6   12:instanceof      #58  <Class AppBarLayout$BaseBehavior>
		//*   7   15:ifeq            52
			{
				obj = ((Object) ((BaseBehavior)obj));
		//    8   18:aload_3         
		//    9   19:checkcast       #58  <Class AppBarLayout$BaseBehavior>
		//   10   22:astore_3        
				ViewCompat.offsetTopAndBottom(view, ((view1.getBottom() - view.getTop()) + ((BaseBehavior) (obj)).offsetDelta + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view1));
		//   11   23:aload_1         
		//   12   24:aload_2         
		//   13   25:invokevirtual   #70  <Method int View.getBottom()>
		//   14   28:aload_1         
		//   15   29:invokevirtual   #73  <Method int View.getTop()>
		//   16   32:isub            
		//   17   33:aload_3         
		//   18   34:invokestatic    #77  <Method int AppBarLayout$BaseBehavior.access$000(AppBarLayout$BaseBehavior)>
		//   19   37:iadd            
		//   20   38:aload_0         
		//   21   39:invokevirtual   #80  <Method int getVerticalLayoutGap()>
		//   22   42:iadd            
		//   23   43:aload_0         
		//   24   44:aload_2         
		//   25   45:invokevirtual   #84  <Method int getOverlapPixelsForOffset(View)>
		//   26   48:isub            
		//   27   49:invokestatic    #90  <Method void ViewCompat.offsetTopAndBottom(View, int)>
			}
		//   28   52:return          
		}

		private void updateLiftedStateIfNeeded(View view, View view1)
		{
			if(view1 instanceof AppBarLayout)
		//*   0    0:aload_2         
		//*   1    1:instanceof      #6   <Class AppBarLayout>
		//*   2    4:ifeq            39
			{
				view1 = ((View) ((AppBarLayout)view1));
		//    3    7:aload_2         
		//    4    8:checkcast       #6   <Class AppBarLayout>
		//    5   11:astore_2        
				if(((AppBarLayout) (view1)).isLiftOnScroll())
		//*   6   12:aload_2         
		//*   7   13:invokevirtual   #95  <Method boolean AppBarLayout.isLiftOnScroll()>
		//*   8   16:ifeq            39
				{
					boolean flag;
					if(view.getScrollY() > 0)
		//*   9   19:aload_1         
		//*  10   20:invokevirtual   #98  <Method int View.getScrollY()>
		//*  11   23:ifle            31
						flag = true;
		//   12   26:iconst_1        
		//   13   27:istore_3        
					else
		//*  14   28:goto            33
						flag = false;
		//   15   31:iconst_0        
		//   16   32:istore_3        
					((AppBarLayout) (view1)).setLiftedState(flag);
		//   17   33:aload_2         
		//   18   34:iload_3         
		//   19   35:invokevirtual   #102 <Method boolean AppBarLayout.setLiftedState(boolean)>
		//   20   38:pop             
				}
			}
		//   21   39:return          
		}

		AppBarLayout findFirstDependency(List list)
		{
			int j = list.size();
		//    0    0:aload_1         
		//    1    1:invokeinterface #109 <Method int List.size()>
		//    2    6:istore_3        
			for(int i = 0; i < j; i++)
		//*   3    7:iconst_0        
		//*   4    8:istore_2        
		//*   5    9:iload_2         
		//*   6   10:iload_3         
		//*   7   11:icmpge          47
			{
				View view = (View)list.get(i);
		//    8   14:aload_1         
		//    9   15:iload_2         
		//   10   16:invokeinterface #113 <Method Object List.get(int)>
		//   11   21:checkcast       #66  <Class View>
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

		volatile View findFirstDependency(List list)
		{
			return ((View) (findFirstDependency(list)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #118 <Method AppBarLayout findFirstDependency(List)>
		//    3    5:areturn         
		}

		public volatile int getLeftAndRightOffset()
		{
			return super.getLeftAndRightOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #121 <Method int HeaderScrollingViewBehavior.getLeftAndRightOffset()>
		//    2    4:ireturn         
		}

		float getOverlapRatioForOffset(View view)
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
				int j = ((AppBarLayout) (view)).getTotalScrollRange();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #126 <Method int AppBarLayout.getTotalScrollRange()>
		//    8   16:istore_3        
				int k = ((AppBarLayout) (view)).getDownNestedPreScrollRange();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #129 <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   11   21:istore          4
				int i = getAppBarLayoutOffset(((AppBarLayout) (view)));
		//   12   23:aload_1         
		//   13   24:invokestatic    #131 <Method int getAppBarLayoutOffset(AppBarLayout)>
		//   14   27:istore_2        
				if(k != 0 && j + i <= k)
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
				j -= k;
		//   24   43:iload_3         
		//   25   44:iload           4
		//   26   46:isub            
		//   27   47:istore_3        
				if(j != 0)
		//*  28   48:iload_3         
		//*  29   49:ifeq            60
					return (float)i / (float)j + 1.0F;
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

		int getScrollRange(View view)
		{
			if(view instanceof AppBarLayout)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #6   <Class AppBarLayout>
		//*   2    4:ifeq            15
				return ((AppBarLayout)view).getTotalScrollRange();
		//    3    7:aload_1         
		//    4    8:checkcast       #6   <Class AppBarLayout>
		//    5   11:invokevirtual   #126 <Method int AppBarLayout.getTotalScrollRange()>
		//    6   14:ireturn         
			else
				return super.getScrollRange(view);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokespecial   #134 <Method int HeaderScrollingViewBehavior.getScrollRange(View)>
		//   10   20:ireturn         
		}

		public volatile int getTopAndBottomOffset()
		{
			return super.getTopAndBottomOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #137 <Method int HeaderScrollingViewBehavior.getTopAndBottomOffset()>
		//    2    4:ireturn         
		}

		public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			return view1 instanceof AppBarLayout;
		//    0    0:aload_3         
		//    1    1:instanceof      #6   <Class AppBarLayout>
		//    2    4:ireturn         
		}

		public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			offsetChildAsNeeded(view, view1);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:invokespecial   #142 <Method void offsetChildAsNeeded(View, View)>
			updateLiftedStateIfNeeded(view, view1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokespecial   #144 <Method void updateLiftedStateIfNeeded(View, View)>
			return false;
		//    8   12:iconst_0        
		//    9   13:ireturn         
		}

		public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
		{
			return super.onLayoutChild(coordinatorlayout, view, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #148 <Method boolean HeaderScrollingViewBehavior.onLayoutChild(CoordinatorLayout, View, int)>
		//    5    7:ireturn         
		}

		public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
		{
			return super.onMeasureChild(coordinatorlayout, view, i, j, k, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:iload           4
		//    5    6:iload           5
		//    6    8:iload           6
		//    7   10:invokespecial   #152 <Method boolean HeaderScrollingViewBehavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
		//    8   13:ireturn         
		}

		public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorlayout, View view, Rect rect, boolean flag)
		{
			AppBarLayout appbarlayout = findFirstDependency(coordinatorlayout.getDependencies(view));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #160 <Method List CoordinatorLayout.getDependencies(View)>
		//    4    6:invokevirtual   #118 <Method AppBarLayout findFirstDependency(List)>
		//    5    9:astore          5
			if(appbarlayout != null)
		//*   6   11:aload           5
		//*   7   13:ifnull          67
			{
				rect.offset(view.getLeft(), view.getTop());
		//    8   16:aload_3         
		//    9   17:aload_2         
		//   10   18:invokevirtual   #163 <Method int View.getLeft()>
		//   11   21:aload_2         
		//   12   22:invokevirtual   #73  <Method int View.getTop()>
		//   13   25:invokevirtual   #169 <Method void Rect.offset(int, int)>
				view = ((View) (tempRect1));
		//   14   28:aload_0         
		//   15   29:getfield        #173 <Field Rect tempRect1>
		//   16   32:astore_2        
				((Rect) (view)).set(0, 0, coordinatorlayout.getWidth(), coordinatorlayout.getHeight());
		//   17   33:aload_2         
		//   18   34:iconst_0        
		//   19   35:iconst_0        
		//   20   36:aload_1         
		//   21   37:invokevirtual   #176 <Method int CoordinatorLayout.getWidth()>
		//   22   40:aload_1         
		//   23   41:invokevirtual   #179 <Method int CoordinatorLayout.getHeight()>
		//   24   44:invokevirtual   #183 <Method void Rect.set(int, int, int, int)>
				if(!((Rect) (view)).contains(rect))
		//*  25   47:aload_2         
		//*  26   48:aload_3         
		//*  27   49:invokevirtual   #187 <Method boolean Rect.contains(Rect)>
		//*  28   52:ifne            67
				{
					appbarlayout.setExpanded(false, flag ^ true);
		//   29   55:aload           5
		//   30   57:iconst_0        
		//   31   58:iload           4
		//   32   60:iconst_1        
		//   33   61:ixor            
		//   34   62:invokevirtual   #191 <Method void AppBarLayout.setExpanded(boolean, boolean)>
					return true;
		//   35   65:iconst_1        
		//   36   66:ireturn         
				}
			}
			return false;
		//   37   67:iconst_0        
		//   38   68:ireturn         
		}

		public volatile boolean setLeftAndRightOffset(int i)
		{
			return super.setLeftAndRightOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #195 <Method boolean HeaderScrollingViewBehavior.setLeftAndRightOffset(int)>
		//    3    5:ireturn         
		}

		public volatile boolean setTopAndBottomOffset(int i)
		{
			return super.setTopAndBottomOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #198 <Method boolean HeaderScrollingViewBehavior.setTopAndBottomOffset(int)>
		//    3    5:ireturn         
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
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.ScrollingViewBehavior_Layout)));
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #21  <Field int[] android.support.design.R$styleable.ScrollingViewBehavior_Layout>
		//    7   11:invokevirtual   #27  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//    8   14:astore_1        
			setOverlayTop(((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:getstatic       #31  <Field int android.support.design.R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop>
		//   12   20:iconst_0        
		//   13   21:invokevirtual   #37  <Method int TypedArray.getDimensionPixelSize(int, int)>
		//   14   24:invokevirtual   #41  <Method void setOverlayTop(int)>
			((TypedArray) (context)).recycle();
		//   15   27:aload_1         
		//   16   28:invokevirtual   #44  <Method void TypedArray.recycle()>
		//   17   31:return          
		}
	}


	public AppBarLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #78  <Method void AppBarLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppBarLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #80  <Method void LinearLayout(Context, AttributeSet)>
		totalScrollRange = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #82  <Field int totalScrollRange>
		downPreScrollRange = -1;
	//    7   11:aload_0         
	//    8   12:iconst_m1       
	//    9   13:putfield        #84  <Field int downPreScrollRange>
		downScrollRange = -1;
	//   10   16:aload_0         
	//   11   17:iconst_m1       
	//   12   18:putfield        #86  <Field int downScrollRange>
		pendingAction = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #88  <Field int pendingAction>
		setOrientation(1);
	//   16   26:aload_0         
	//   17   27:iconst_1        
	//   18   28:invokevirtual   #92  <Method void setOrientation(int)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  19   31:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//*  20   34:bipush          21
	//*  21   36:icmplt          52
		{
			ViewUtilsLollipop.setBoundsViewOutlineProvider(((View) (this)));
	//   22   39:aload_0         
	//   23   40:invokestatic    #103 <Method void ViewUtilsLollipop.setBoundsViewOutlineProvider(View)>
			ViewUtilsLollipop.setStateListAnimatorFromAttrs(((View) (this)), attributeset, 0, android.support.design.R.style.Widget_Design_AppBarLayout);
	//   24   43:aload_0         
	//   25   44:aload_2         
	//   26   45:iconst_0        
	//   27   46:getstatic       #108 <Field int android.support.design.R$style.Widget_Design_AppBarLayout>
	//   28   49:invokestatic    #112 <Method void ViewUtilsLollipop.setStateListAnimatorFromAttrs(View, AttributeSet, int, int)>
		}
		context = ((Context) (ThemeEnforcement.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.AppBarLayout, 0, android.support.design.R.style.Widget_Design_AppBarLayout, new int[0])));
	//   29   52:aload_1         
	//   30   53:aload_2         
	//   31   54:getstatic       #117 <Field int[] android.support.design.R$styleable.AppBarLayout>
	//   32   57:iconst_0        
	//   33   58:getstatic       #108 <Field int android.support.design.R$style.Widget_Design_AppBarLayout>
	//   34   61:iconst_0        
	//   35   62:newarray        int[]
	//   36   64:invokestatic    #123 <Method TypedArray ThemeEnforcement.obtainStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   37   67:astore_1        
		ViewCompat.setBackground(((View) (this)), ((TypedArray) (context)).getDrawable(android.support.design.R.styleable.AppBarLayout_android_background));
	//   38   68:aload_0         
	//   39   69:aload_1         
	//   40   70:getstatic       #126 <Field int android.support.design.R$styleable.AppBarLayout_android_background>
	//   41   73:invokevirtual   #132 <Method android.graphics.drawable.Drawable TypedArray.getDrawable(int)>
	//   42   76:invokestatic    #138 <Method void ViewCompat.setBackground(View, android.graphics.drawable.Drawable)>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_expanded))
	//*  43   79:aload_1         
	//*  44   80:getstatic       #141 <Field int android.support.design.R$styleable.AppBarLayout_expanded>
	//*  45   83:invokevirtual   #145 <Method boolean TypedArray.hasValue(int)>
	//*  46   86:ifeq            103
			setExpanded(((TypedArray) (context)).getBoolean(android.support.design.R.styleable.AppBarLayout_expanded, false), false, false);
	//   47   89:aload_0         
	//   48   90:aload_1         
	//   49   91:getstatic       #141 <Field int android.support.design.R$styleable.AppBarLayout_expanded>
	//   50   94:iconst_0        
	//   51   95:invokevirtual   #149 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   52   98:iconst_0        
	//   53   99:iconst_0        
	//   54  100:invokespecial   #153 <Method void setExpanded(boolean, boolean, boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 21 && ((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_elevation))
	//*  55  103:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  106:bipush          21
	//*  57  108:icmplt          134
	//*  58  111:aload_1         
	//*  59  112:getstatic       #156 <Field int android.support.design.R$styleable.AppBarLayout_elevation>
	//*  60  115:invokevirtual   #145 <Method boolean TypedArray.hasValue(int)>
	//*  61  118:ifeq            134
			ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(((View) (this)), ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.AppBarLayout_elevation, 0));
	//   62  121:aload_0         
	//   63  122:aload_1         
	//   64  123:getstatic       #156 <Field int android.support.design.R$styleable.AppBarLayout_elevation>
	//   65  126:iconst_0        
	//   66  127:invokevirtual   #160 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   67  130:i2f             
	//   68  131:invokestatic    #164 <Method void ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(View, float)>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  69  134:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//*  70  137:bipush          26
	//*  71  139:icmplt          186
		{
			if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_android_keyboardNavigationCluster))
	//*  72  142:aload_1         
	//*  73  143:getstatic       #167 <Field int android.support.design.R$styleable.AppBarLayout_android_keyboardNavigationCluster>
	//*  74  146:invokevirtual   #145 <Method boolean TypedArray.hasValue(int)>
	//*  75  149:ifeq            164
				setKeyboardNavigationCluster(((TypedArray) (context)).getBoolean(android.support.design.R.styleable.AppBarLayout_android_keyboardNavigationCluster, false));
	//   76  152:aload_0         
	//   77  153:aload_1         
	//   78  154:getstatic       #167 <Field int android.support.design.R$styleable.AppBarLayout_android_keyboardNavigationCluster>
	//   79  157:iconst_0        
	//   80  158:invokevirtual   #149 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   81  161:invokevirtual   #171 <Method void setKeyboardNavigationCluster(boolean)>
			if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_android_touchscreenBlocksFocus))
	//*  82  164:aload_1         
	//*  83  165:getstatic       #174 <Field int android.support.design.R$styleable.AppBarLayout_android_touchscreenBlocksFocus>
	//*  84  168:invokevirtual   #145 <Method boolean TypedArray.hasValue(int)>
	//*  85  171:ifeq            186
				setTouchscreenBlocksFocus(((TypedArray) (context)).getBoolean(android.support.design.R.styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
	//   86  174:aload_0         
	//   87  175:aload_1         
	//   88  176:getstatic       #174 <Field int android.support.design.R$styleable.AppBarLayout_android_touchscreenBlocksFocus>
	//   89  179:iconst_0        
	//   90  180:invokevirtual   #149 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   91  183:invokevirtual   #177 <Method void setTouchscreenBlocksFocus(boolean)>
		}
		liftOnScroll = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.AppBarLayout_liftOnScroll, false);
	//   92  186:aload_0         
	//   93  187:aload_1         
	//   94  188:getstatic       #180 <Field int android.support.design.R$styleable.AppBarLayout_liftOnScroll>
	//   95  191:iconst_0        
	//   96  192:invokevirtual   #149 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   97  195:putfield        #182 <Field boolean liftOnScroll>
		((TypedArray) (context)).recycle();
	//   98  198:aload_1         
	//   99  199:invokevirtual   #186 <Method void TypedArray.recycle()>
		ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), new OnApplyWindowInsetsListener() {

			public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
			{
				return onWindowInsetChanged(windowinsetscompat);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field AppBarLayout this$0>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #26  <Method WindowInsetsCompat AppBarLayout.onWindowInsetChanged(WindowInsetsCompat)>
			//    4    8:areturn         
			}

			final AppBarLayout this$0;

			
			{
				this$0 = AppBarLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppBarLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  100  202:aload_0         
	//  101  203:new             #6   <Class AppBarLayout$1>
	//  102  206:dup             
	//  103  207:aload_0         
	//  104  208:invokespecial   #189 <Method void AppBarLayout$1(AppBarLayout)>
	//  105  211:invokestatic    #193 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//  106  214:return          
	}

	private boolean hasCollapsibleChild()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
			if(((LayoutParams)getChildAt(i).getLayoutParams()).isCollapsible())
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #203 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #209 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #30  <Class AppBarLayout$LayoutParams>
	//*  13   23:invokevirtual   #212 <Method boolean AppBarLayout$LayoutParams.isCollapsible()>
	//*  14   26:ifeq            31
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            7
		return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
	}

	private void invalidateScrollRanges()
	{
		totalScrollRange = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #82  <Field int totalScrollRange>
		downPreScrollRange = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #84  <Field int downPreScrollRange>
		downScrollRange = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #86  <Field int downScrollRange>
	//    9   15:return          
	}

	private void setExpanded(boolean flag, boolean flag1, boolean flag2)
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
		pendingAction = byte0 | byte1 | byte2;
	//   20   37:aload_0         
	//   21   38:iload           4
	//   22   40:iload           5
	//   23   42:ior             
	//   24   43:iload           6
	//   25   45:ior             
	//   26   46:putfield        #88  <Field int pendingAction>
		requestLayout();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #216 <Method void requestLayout()>
	//   29   53:return          
	}

	private boolean setLiftableState(boolean flag)
	{
		if(liftable != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field boolean liftable>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			liftable = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #220 <Field boolean liftable>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #223 <Method void refreshDrawableState()>
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

	public void addOnOffsetChangedListener(BaseOnOffsetChangedListener baseonoffsetchangedlistener)
	{
		if(listeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field List listeners>
	//*   2    4:ifnonnull       18
			listeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #229 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #231 <Method void ArrayList()>
	//    7   15:putfield        #227 <Field List listeners>
		if(baseonoffsetchangedlistener != null && !listeners.contains(((Object) (baseonoffsetchangedlistener))))
	//*   8   18:aload_1         
	//*   9   19:ifnull          46
	//*  10   22:aload_0         
	//*  11   23:getfield        #227 <Field List listeners>
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #237 <Method boolean List.contains(Object)>
	//*  14   32:ifne            46
			listeners.add(((Object) (baseonoffsetchangedlistener)));
	//   15   35:aload_0         
	//   16   36:getfield        #227 <Field List listeners>
	//   17   39:aload_1         
	//   18   40:invokeinterface #240 <Method boolean List.add(Object)>
	//   19   45:pop             
	//   20   46:return          
	}

	public void addOnOffsetChangedListener(OnOffsetChangedListener onoffsetchangedlistener)
	{
		addOnOffsetChangedListener(((BaseOnOffsetChangedListener) (onoffsetchangedlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #243 <Method void addOnOffsetChangedListener(AppBarLayout$BaseOnOffsetChangedListener)>
	//    3    5:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #30  <Class AppBarLayout$LayoutParams>
	//    2    4:ireturn         
	}

	void dispatchOffsetUpdates(int i)
	{
		List list = listeners;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field List listeners>
	//    2    4:astore          4
		if(list != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          62
		{
			int j = 0;
	//    5   11:iconst_0        
	//    6   12:istore_2        
			for(int k = list.size(); j < k; j++)
	//*   7   13:aload           4
	//*   8   15:invokeinterface #249 <Method int List.size()>
	//*   9   20:istore_3        
	//*  10   21:iload_2         
	//*  11   22:iload_3         
	//*  12   23:icmpge          62
			{
				BaseOnOffsetChangedListener baseonoffsetchangedlistener = (BaseOnOffsetChangedListener)listeners.get(j);
	//   13   26:aload_0         
	//   14   27:getfield        #227 <Field List listeners>
	//   15   30:iload_2         
	//   16   31:invokeinterface #253 <Method Object List.get(int)>
	//   17   36:checkcast       #21  <Class AppBarLayout$BaseOnOffsetChangedListener>
	//   18   39:astore          4
				if(baseonoffsetchangedlistener != null)
	//*  19   41:aload           4
	//*  20   43:ifnull          55
					baseonoffsetchangedlistener.onOffsetChanged(this, i);
	//   21   46:aload           4
	//   22   48:aload_0         
	//   23   49:iload_1         
	//   24   50:invokeinterface #257 <Method void AppBarLayout$BaseOnOffsetChangedListener.onOffsetChanged(AppBarLayout, int)>
			}

	//   25   55:iload_2         
	//   26   56:iconst_1        
	//   27   57:iadd            
	//   28   58:istore_2        
		}
	//*  29   59:goto            21
	//   30   62:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-1, -2);
	//    0    0:new             #30  <Class AppBarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:bipush          -2
	//    4    7:invokespecial   #262 <Method void AppBarLayout$LayoutParams(int, int)>
	//    5   10:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method AppBarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	protected volatile android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.widget.LinearLayout.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method AppBarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #30  <Class AppBarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #271 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #272 <Method void AppBarLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19 && (layoutparams instanceof android.widget.LinearLayout.LayoutParams))
	//*   0    0:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          27
	//*   3    8:aload_1         
	//*   4    9:instanceof      #275 <Class android.widget.LinearLayout$LayoutParams>
	//*   5   12:ifeq            27
			return new LayoutParams((android.widget.LinearLayout.LayoutParams)layoutparams);
	//    6   15:new             #30  <Class AppBarLayout$LayoutParams>
	//    7   18:dup             
	//    8   19:aload_1         
	//    9   20:checkcast       #275 <Class android.widget.LinearLayout$LayoutParams>
	//   10   23:invokespecial   #278 <Method void AppBarLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
	//   11   26:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  12   27:aload_1         
	//*  13   28:instanceof      #280 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  14   31:ifeq            46
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   15   34:new             #30  <Class AppBarLayout$LayoutParams>
	//   16   37:dup             
	//   17   38:aload_1         
	//   18   39:checkcast       #280 <Class android.view.ViewGroup$MarginLayoutParams>
	//   19   42:invokespecial   #283 <Method void AppBarLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   20   45:areturn         
		else
			return new LayoutParams(layoutparams);
	//   21   46:new             #30  <Class AppBarLayout$LayoutParams>
	//   22   49:dup             
	//   23   50:aload_1         
	//   24   51:invokespecial   #286 <Method void AppBarLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   25   54:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #289 <Method AppBarLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #292 <Method AppBarLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.widget.LinearLayout.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #289 <Method AppBarLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.widget.LinearLayout.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #292 <Method AppBarLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	int getDownNestedPreScrollRange()
	{
		int i = downPreScrollRange;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int downPreScrollRange>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		int j = getChildCount() - 1;
	//    8   12:aload_0         
	//    9   13:invokevirtual   #199 <Method int getChildCount()>
	//   10   16:iconst_1        
	//   11   17:isub            
	//   12   18:istore_2        
		int k;
		for(k = 0; j >= 0; k = i)
	//*  13   19:iconst_0        
	//*  14   20:istore_3        
	//*  15   21:iload_2         
	//*  16   22:iflt            146
		{
			View view = getChildAt(j);
	//   17   25:aload_0         
	//   18   26:iload_2         
	//   19   27:invokevirtual   #203 <Method View getChildAt(int)>
	//   20   30:astore          5
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   21   32:aload           5
	//   22   34:invokevirtual   #209 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   37:checkcast       #30  <Class AppBarLayout$LayoutParams>
	//   24   40:astore          6
			i = view.getMeasuredHeight();
	//   25   42:aload           5
	//   26   44:invokevirtual   #298 <Method int View.getMeasuredHeight()>
	//   27   47:istore_1        
			int l = layoutparams.scrollFlags;
	//   28   48:aload           6
	//   29   50:getfield        #301 <Field int AppBarLayout$LayoutParams.scrollFlags>
	//   30   53:istore          4
			if((l & 5) == 5)
	//*  31   55:iload           4
	//*  32   57:iconst_5        
	//*  33   58:iand            
	//*  34   59:iconst_5        
	//*  35   60:icmpne          128
			{
				k += layoutparams.topMargin + layoutparams.bottomMargin;
	//   36   63:iload_3         
	//   37   64:aload           6
	//   38   66:getfield        #304 <Field int AppBarLayout$LayoutParams.topMargin>
	//   39   69:aload           6
	//   40   71:getfield        #307 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   41   74:iadd            
	//   42   75:iadd            
	//   43   76:istore_3        
				if((l & 8) != 0)
	//*  44   77:iload           4
	//*  45   79:bipush          8
	//*  46   81:iand            
	//*  47   82:ifeq            96
					i = k + ViewCompat.getMinimumHeight(view);
	//   48   85:iload_3         
	//   49   86:aload           5
	//   50   88:invokestatic    #311 <Method int ViewCompat.getMinimumHeight(View)>
	//   51   91:iadd            
	//   52   92:istore_1        
				else
	//*  53   93:goto            137
				if((l & 2) != 0)
	//*  54   96:iload           4
	//*  55   98:iconst_2        
	//*  56   99:iand            
	//*  57  100:ifeq            116
					i = k + (i - ViewCompat.getMinimumHeight(view));
	//   58  103:iload_3         
	//   59  104:iload_1         
	//   60  105:aload           5
	//   61  107:invokestatic    #311 <Method int ViewCompat.getMinimumHeight(View)>
	//   62  110:isub            
	//   63  111:iadd            
	//   64  112:istore_1        
				else
	//*  65  113:goto            137
					i = k + (i - getTopInset());
	//   66  116:iload_3         
	//   67  117:iload_1         
	//   68  118:aload_0         
	//   69  119:invokevirtual   #314 <Method int getTopInset()>
	//   70  122:isub            
	//   71  123:iadd            
	//   72  124:istore_1        
			} else
	//*  73  125:goto            137
			{
				i = k;
	//   74  128:iload_3         
	//   75  129:istore_1        
				if(k > 0)
	//*  76  130:iload_3         
	//*  77  131:ifle            137
					break;
	//   78  134:goto            146
			}
			j--;
	//   79  137:iload_2         
	//   80  138:iconst_1        
	//   81  139:isub            
	//   82  140:istore_2        
		}

	//   83  141:iload_1         
	//   84  142:istore_3        
	//*  85  143:goto            21
		i = Math.max(0, k);
	//   86  146:iconst_0        
	//   87  147:iload_3         
	//   88  148:invokestatic    #319 <Method int Math.max(int, int)>
	//   89  151:istore_1        
		downPreScrollRange = i;
	//   90  152:aload_0         
	//   91  153:iload_1         
	//   92  154:putfield        #84  <Field int downPreScrollRange>
		return i;
	//   93  157:iload_1         
	//   94  158:ireturn         
	}

	int getDownNestedScrollRange()
	{
		int i = downScrollRange;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int downScrollRange>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		int l = getChildCount();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #199 <Method int getChildCount()>
	//   10   16:istore          4
		int j = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
		i = j;
	//   13   20:iload_2         
	//   14   21:istore_1        
		int k;
		do
		{
			k = i;
	//   15   22:iload_1         
	//   16   23:istore_3        
			if(j >= l)
				break;
	//   17   24:iload_2         
	//   18   25:iload           4
	//   19   27:icmpge          125
			View view = getChildAt(j);
	//   20   30:aload_0         
	//   21   31:iload_2         
	//   22   32:invokevirtual   #203 <Method View getChildAt(int)>
	//   23   35:astore          9
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   24   37:aload           9
	//   25   39:invokevirtual   #209 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   42:checkcast       #30  <Class AppBarLayout$LayoutParams>
	//   27   45:astore          10
			int j1 = view.getMeasuredHeight();
	//   28   47:aload           9
	//   29   49:invokevirtual   #298 <Method int View.getMeasuredHeight()>
	//   30   52:istore          6
			int k1 = layoutparams.topMargin;
	//   31   54:aload           10
	//   32   56:getfield        #304 <Field int AppBarLayout$LayoutParams.topMargin>
	//   33   59:istore          7
			int l1 = layoutparams.bottomMargin;
	//   34   61:aload           10
	//   35   63:getfield        #307 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   36   66:istore          8
			int i1 = layoutparams.scrollFlags;
	//   37   68:aload           10
	//   38   70:getfield        #301 <Field int AppBarLayout$LayoutParams.scrollFlags>
	//   39   73:istore          5
			k = i;
	//   40   75:iload_1         
	//   41   76:istore_3        
			if((i1 & 1) == 0)
				break;
	//   42   77:iload           5
	//   43   79:iconst_1        
	//   44   80:iand            
	//   45   81:ifeq            125
			i += j1 + (k1 + l1);
	//   46   84:iload_1         
	//   47   85:iload           6
	//   48   87:iload           7
	//   49   89:iload           8
	//   50   91:iadd            
	//   51   92:iadd            
	//   52   93:iadd            
	//   53   94:istore_1        
			if((i1 & 2) != 0)
	//*  54   95:iload           5
	//*  55   97:iconst_2        
	//*  56   98:iand            
	//*  57   99:ifeq            118
			{
				k = i - (ViewCompat.getMinimumHeight(view) + getTopInset());
	//   58  102:iload_1         
	//   59  103:aload           9
	//   60  105:invokestatic    #311 <Method int ViewCompat.getMinimumHeight(View)>
	//   61  108:aload_0         
	//   62  109:invokevirtual   #314 <Method int getTopInset()>
	//   63  112:iadd            
	//   64  113:isub            
	//   65  114:istore_3        
				break;
	//   66  115:goto            125
			}
			j++;
	//   67  118:iload_2         
	//   68  119:iconst_1        
	//   69  120:iadd            
	//   70  121:istore_2        
		} while(true);
	//   71  122:goto            22
		i = Math.max(0, k);
	//   72  125:iconst_0        
	//   73  126:iload_3         
	//   74  127:invokestatic    #319 <Method int Math.max(int, int)>
	//   75  130:istore_1        
		downScrollRange = i;
	//   76  131:aload_0         
	//   77  132:iload_1         
	//   78  133:putfield        #86  <Field int downScrollRange>
		return i;
	//   79  136:iload_1         
	//   80  137:ireturn         
	}

	public final int getMinimumHeightForVisibleOverlappingContent()
	{
		int j = getTopInset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #314 <Method int getTopInset()>
	//    2    4:istore_2        
		int i = ViewCompat.getMinimumHeight(((View) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #311 <Method int ViewCompat.getMinimumHeight(View)>
	//    5    9:istore_1        
		if(i != 0)
	//*   6   10:iload_1         
	//*   7   11:ifeq            20
			return i * 2 + j;
	//    8   14:iload_1         
	//    9   15:iconst_2        
	//   10   16:imul            
	//   11   17:iload_2         
	//   12   18:iadd            
	//   13   19:ireturn         
		i = getChildCount();
	//   14   20:aload_0         
	//   15   21:invokevirtual   #199 <Method int getChildCount()>
	//   16   24:istore_1        
		if(i >= 1)
	//*  17   25:iload_1         
	//*  18   26:iconst_1        
	//*  19   27:icmplt          44
			i = ViewCompat.getMinimumHeight(getChildAt(i - 1));
	//   20   30:aload_0         
	//   21   31:iload_1         
	//   22   32:iconst_1        
	//   23   33:isub            
	//   24   34:invokevirtual   #203 <Method View getChildAt(int)>
	//   25   37:invokestatic    #311 <Method int ViewCompat.getMinimumHeight(View)>
	//   26   40:istore_1        
		else
	//*  27   41:goto            46
			i = 0;
	//   28   44:iconst_0        
	//   29   45:istore_1        
		if(i != 0)
	//*  30   46:iload_1         
	//*  31   47:ifeq            56
			return i * 2 + j;
	//   32   50:iload_1         
	//   33   51:iconst_2        
	//   34   52:imul            
	//   35   53:iload_2         
	//   36   54:iadd            
	//   37   55:ireturn         
		else
			return getHeight() / 3;
	//   38   56:aload_0         
	//   39   57:invokevirtual   #324 <Method int getHeight()>
	//   40   60:iconst_3        
	//   41   61:idiv            
	//   42   62:ireturn         
	}

	int getPendingAction()
	{
		return pendingAction;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field int pendingAction>
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
		WindowInsetsCompat windowinsetscompat = lastInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field WindowInsetsCompat lastInsets>
	//    2    4:astore_1        
		if(windowinsetscompat != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return windowinsetscompat.getSystemWindowInsetTop();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #337 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final int getTotalScrollRange()
	{
		int i = totalScrollRange;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int totalScrollRange>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		int l = getChildCount();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #199 <Method int getChildCount()>
	//   10   16:istore          4
		int j = 0;
	//   11   18:iconst_0        
	//   12   19:istore_2        
		i = j;
	//   13   20:iload_2         
	//   14   21:istore_1        
		int k;
		do
		{
			k = i;
	//   15   22:iload_1         
	//   16   23:istore_3        
			if(j >= l)
				break;
	//   17   24:iload_2         
	//   18   25:iload           4
	//   19   27:icmpge          112
			View view = getChildAt(j);
	//   20   30:aload_0         
	//   21   31:iload_2         
	//   22   32:invokevirtual   #203 <Method View getChildAt(int)>
	//   23   35:astore          7
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   24   37:aload           7
	//   25   39:invokevirtual   #209 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   42:checkcast       #30  <Class AppBarLayout$LayoutParams>
	//   27   45:astore          8
			int j1 = view.getMeasuredHeight();
	//   28   47:aload           7
	//   29   49:invokevirtual   #298 <Method int View.getMeasuredHeight()>
	//   30   52:istore          6
			int i1 = layoutparams.scrollFlags;
	//   31   54:aload           8
	//   32   56:getfield        #301 <Field int AppBarLayout$LayoutParams.scrollFlags>
	//   33   59:istore          5
			k = i;
	//   34   61:iload_1         
	//   35   62:istore_3        
			if((i1 & 1) == 0)
				break;
	//   36   63:iload           5
	//   37   65:iconst_1        
	//   38   66:iand            
	//   39   67:ifeq            112
			i += j1 + layoutparams.topMargin + layoutparams.bottomMargin;
	//   40   70:iload_1         
	//   41   71:iload           6
	//   42   73:aload           8
	//   43   75:getfield        #304 <Field int AppBarLayout$LayoutParams.topMargin>
	//   44   78:iadd            
	//   45   79:aload           8
	//   46   81:getfield        #307 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   47   84:iadd            
	//   48   85:iadd            
	//   49   86:istore_1        
			if((i1 & 2) != 0)
	//*  50   87:iload           5
	//*  51   89:iconst_2        
	//*  52   90:iand            
	//*  53   91:ifeq            105
			{
				k = i - ViewCompat.getMinimumHeight(view);
	//   54   94:iload_1         
	//   55   95:aload           7
	//   56   97:invokestatic    #311 <Method int ViewCompat.getMinimumHeight(View)>
	//   57  100:isub            
	//   58  101:istore_3        
				break;
	//   59  102:goto            112
			}
			j++;
	//   60  105:iload_2         
	//   61  106:iconst_1        
	//   62  107:iadd            
	//   63  108:istore_2        
		} while(true);
	//   64  109:goto            22
		i = Math.max(0, k - getTopInset());
	//   65  112:iconst_0        
	//   66  113:iload_3         
	//   67  114:aload_0         
	//   68  115:invokevirtual   #314 <Method int getTopInset()>
	//   69  118:isub            
	//   70  119:invokestatic    #319 <Method int Math.max(int, int)>
	//   71  122:istore_1        
		totalScrollRange = i;
	//   72  123:aload_0         
	//   73  124:iload_1         
	//   74  125:putfield        #82  <Field int totalScrollRange>
		return i;
	//   75  128:iload_1         
	//   76  129:ireturn         
	}

	int getUpNestedPreScrollRange()
	{
		return getTotalScrollRange();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #342 <Method int getTotalScrollRange()>
	//    2    4:ireturn         
	}

	boolean hasChildWithInterpolator()
	{
		return haveChildWithInterpolator;
	//    0    0:aload_0         
	//    1    1:getfield        #345 <Field boolean haveChildWithInterpolator>
	//    2    4:ireturn         
	}

	boolean hasScrollableChildren()
	{
		return getTotalScrollRange() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #342 <Method int getTotalScrollRange()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isLiftOnScroll()
	{
		return liftOnScroll;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field boolean liftOnScroll>
	//    2    4:ireturn         
	}

	protected int[] onCreateDrawableState(int i)
	{
		if(tmpStatesArray == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #351 <Field int[] tmpStatesArray>
	//*   2    4:ifnonnull       14
			tmpStatesArray = new int[4];
	//    3    7:aload_0         
	//    4    8:iconst_4        
	//    5    9:newarray        int[]
	//    6   11:putfield        #351 <Field int[] tmpStatesArray>
		int ai[] = tmpStatesArray;
	//    7   14:aload_0         
	//    8   15:getfield        #351 <Field int[] tmpStatesArray>
	//    9   18:astore_2        
		int ai1[] = super.onCreateDrawableState(i + ai.length);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:aload_2         
	//   13   22:arraylength     
	//   14   23:iadd            
	//   15   24:invokespecial   #353 <Method int[] LinearLayout.onCreateDrawableState(int)>
	//   16   27:astore_3        
		if(liftable)
	//*  17   28:aload_0         
	//*  18   29:getfield        #220 <Field boolean liftable>
	//*  19   32:ifeq            42
			i = android.support.design.R.attr.state_liftable;
	//   20   35:getstatic       #358 <Field int android.support.design.R$attr.state_liftable>
	//   21   38:istore_1        
		else
	//*  22   39:goto            47
			i = -android.support.design.R.attr.state_liftable;
	//   23   42:getstatic       #358 <Field int android.support.design.R$attr.state_liftable>
	//   24   45:ineg            
	//   25   46:istore_1        
		ai[0] = i;
	//   26   47:aload_2         
	//   27   48:iconst_0        
	//   28   49:iload_1         
	//   29   50:iastore         
		if(liftable && lifted)
	//*  30   51:aload_0         
	//*  31   52:getfield        #220 <Field boolean liftable>
	//*  32   55:ifeq            72
	//*  33   58:aload_0         
	//*  34   59:getfield        #360 <Field boolean lifted>
	//*  35   62:ifeq            72
			i = android.support.design.R.attr.state_lifted;
	//   36   65:getstatic       #363 <Field int android.support.design.R$attr.state_lifted>
	//   37   68:istore_1        
		else
	//*  38   69:goto            77
			i = -android.support.design.R.attr.state_lifted;
	//   39   72:getstatic       #363 <Field int android.support.design.R$attr.state_lifted>
	//   40   75:ineg            
	//   41   76:istore_1        
		ai[1] = i;
	//   42   77:aload_2         
	//   43   78:iconst_1        
	//   44   79:iload_1         
	//   45   80:iastore         
		if(liftable)
	//*  46   81:aload_0         
	//*  47   82:getfield        #220 <Field boolean liftable>
	//*  48   85:ifeq            95
			i = android.support.design.R.attr.state_collapsible;
	//   49   88:getstatic       #366 <Field int android.support.design.R$attr.state_collapsible>
	//   50   91:istore_1        
		else
	//*  51   92:goto            100
			i = -android.support.design.R.attr.state_collapsible;
	//   52   95:getstatic       #366 <Field int android.support.design.R$attr.state_collapsible>
	//   53   98:ineg            
	//   54   99:istore_1        
		ai[2] = i;
	//   55  100:aload_2         
	//   56  101:iconst_2        
	//   57  102:iload_1         
	//   58  103:iastore         
		if(liftable && lifted)
	//*  59  104:aload_0         
	//*  60  105:getfield        #220 <Field boolean liftable>
	//*  61  108:ifeq            125
	//*  62  111:aload_0         
	//*  63  112:getfield        #360 <Field boolean lifted>
	//*  64  115:ifeq            125
			i = android.support.design.R.attr.state_collapsed;
	//   65  118:getstatic       #369 <Field int android.support.design.R$attr.state_collapsed>
	//   66  121:istore_1        
		else
	//*  67  122:goto            130
			i = -android.support.design.R.attr.state_collapsed;
	//   68  125:getstatic       #369 <Field int android.support.design.R$attr.state_collapsed>
	//   69  128:ineg            
	//   70  129:istore_1        
		ai[3] = i;
	//   71  130:aload_2         
	//   72  131:iconst_3        
	//   73  132:iload_1         
	//   74  133:iastore         
		return mergeDrawableStates(ai1, ai);
	//   75  134:aload_3         
	//   76  135:aload_2         
	//   77  136:invokestatic    #373 <Method int[] mergeDrawableStates(int[], int[])>
	//   78  139:areturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #377 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		invalidateScrollRanges();
	//    7   11:aload_0         
	//    8   12:invokespecial   #379 <Method void invalidateScrollRanges()>
		flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_1        
		haveChildWithInterpolator = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #345 <Field boolean haveChildWithInterpolator>
		j = getChildCount();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #199 <Method int getChildCount()>
	//   16   26:istore_3        
		i = 0;
	//   17   27:iconst_0        
	//   18   28:istore_2        
		do
		{
			if(i >= j)
				break;
	//   19   29:iload_2         
	//   20   30:iload_3         
	//   21   31:icmpge          66
			if(((LayoutParams)getChildAt(i).getLayoutParams()).getScrollInterpolator() != null)
	//*  22   34:aload_0         
	//*  23   35:iload_2         
	//*  24   36:invokevirtual   #203 <Method View getChildAt(int)>
	//*  25   39:invokevirtual   #209 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  26   42:checkcast       #30  <Class AppBarLayout$LayoutParams>
	//*  27   45:invokevirtual   #383 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
	//*  28   48:ifnull          59
			{
				haveChildWithInterpolator = true;
	//   29   51:aload_0         
	//   30   52:iconst_1        
	//   31   53:putfield        #345 <Field boolean haveChildWithInterpolator>
				break;
	//   32   56:goto            66
			}
			i++;
	//   33   59:iload_2         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_2        
		} while(true);
	//   37   63:goto            29
		if(!liftableOverride)
	//*  38   66:aload_0         
	//*  39   67:getfield        #385 <Field boolean liftableOverride>
	//*  40   70:ifne            95
		{
			if(liftOnScroll || hasCollapsibleChild())
	//*  41   73:aload_0         
	//*  42   74:getfield        #182 <Field boolean liftOnScroll>
	//*  43   77:ifne            87
	//*  44   80:aload_0         
	//*  45   81:invokespecial   #387 <Method boolean hasCollapsibleChild()>
	//*  46   84:ifeq            89
				flag = true;
	//   47   87:iconst_1        
	//   48   88:istore_1        
			setLiftableState(flag);
	//   49   89:aload_0         
	//   50   90:iload_1         
	//   51   91:invokespecial   #389 <Method boolean setLiftableState(boolean)>
	//   52   94:pop             
		}
	//   53   95:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #392 <Method void LinearLayout.onMeasure(int, int)>
		invalidateScrollRanges();
	//    4    6:aload_0         
	//    5    7:invokespecial   #379 <Method void invalidateScrollRanges()>
	//    6   10:return          
	}

	WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat windowinsetscompat)
	{
		WindowInsetsCompat windowinsetscompat1;
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #398 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   2    4:ifeq            12
			windowinsetscompat1 = windowinsetscompat;
	//    3    7:aload_1         
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			windowinsetscompat1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		if(!ObjectsCompat.equals(((Object) (lastInsets)), ((Object) (windowinsetscompat1))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #332 <Field WindowInsetsCompat lastInsets>
	//*  10   18:aload_2         
	//*  11   19:invokestatic    #404 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  12   22:ifne            34
		{
			lastInsets = windowinsetscompat1;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #332 <Field WindowInsetsCompat lastInsets>
			invalidateScrollRanges();
	//   16   30:aload_0         
	//   17   31:invokespecial   #379 <Method void invalidateScrollRanges()>
		}
		return windowinsetscompat;
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	public void removeOnOffsetChangedListener(BaseOnOffsetChangedListener baseonoffsetchangedlistener)
	{
		List list = listeners;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field List listeners>
	//    2    4:astore_2        
		if(list != null && baseonoffsetchangedlistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          21
	//*   5    9:aload_1         
	//*   6   10:ifnull          21
			list.remove(((Object) (baseonoffsetchangedlistener)));
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokeinterface #408 <Method boolean List.remove(Object)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void removeOnOffsetChangedListener(OnOffsetChangedListener onoffsetchangedlistener)
	{
		removeOnOffsetChangedListener(((BaseOnOffsetChangedListener) (onoffsetchangedlistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #410 <Method void removeOnOffsetChangedListener(AppBarLayout$BaseOnOffsetChangedListener)>
	//    3    5:return          
	}

	void resetPendingAction()
	{
		pendingAction = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #88  <Field int pendingAction>
	//    3    5:return          
	}

	public void setExpanded(boolean flag)
	{
		setExpanded(flag, ViewCompat.isLaidOut(((View) (this))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #414 <Method boolean ViewCompat.isLaidOut(View)>
	//    4    6:invokevirtual   #417 <Method void setExpanded(boolean, boolean)>
	//    5    9:return          
	}

	public void setExpanded(boolean flag, boolean flag1)
	{
		setExpanded(flag, flag1, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #153 <Method void setExpanded(boolean, boolean, boolean)>
	//    5    7:return          
	}

	public void setLiftOnScroll(boolean flag)
	{
		liftOnScroll = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #182 <Field boolean liftOnScroll>
	//    3    5:return          
	}

	public boolean setLiftable(boolean flag)
	{
		liftableOverride = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #385 <Field boolean liftableOverride>
		return setLiftableState(flag);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #389 <Method boolean setLiftableState(boolean)>
	//    6   10:ireturn         
	}

	public boolean setLifted(boolean flag)
	{
		return setLiftedState(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #423 <Method boolean setLiftedState(boolean)>
	//    3    5:ireturn         
	}

	boolean setLiftedState(boolean flag)
	{
		if(lifted != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #360 <Field boolean lifted>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			lifted = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #360 <Field boolean lifted>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #223 <Method void refreshDrawableState()>
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

	public void setOrientation(int i)
	{
		if(i == 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpne          11
		{
			super.setOrientation(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #424 <Method void LinearLayout.setOrientation(int)>
			return;
	//    6   10:return          
		} else
		{
			throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
	//    7   11:new             #426 <Class IllegalArgumentException>
	//    8   14:dup             
	//    9   15:ldc2            #428 <String "AppBarLayout is always vertical and does not support horizontal orientation">
	//   10   18:invokespecial   #431 <Method void IllegalArgumentException(String)>
	//   11   21:athrow          
		}
	}

	public void setTargetElevation(float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(((View) (this)), f);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:invokestatic    #164 <Method void ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(View, float)>
	//    6   13:return          
	}

	private static final int INVALID_SCROLL_RANGE = -1;
	static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
	static final int PENDING_ACTION_COLLAPSED = 2;
	static final int PENDING_ACTION_EXPANDED = 1;
	static final int PENDING_ACTION_FORCE = 8;
	static final int PENDING_ACTION_NONE = 0;
	private int downPreScrollRange;
	private int downScrollRange;
	private boolean haveChildWithInterpolator;
	private WindowInsetsCompat lastInsets;
	private boolean liftOnScroll;
	private boolean liftable;
	private boolean liftableOverride;
	private boolean lifted;
	private List listeners;
	private int pendingAction;
	private int tmpStatesArray[];
	private int totalScrollRange;
}
