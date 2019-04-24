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
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			ThemeUtils, ViewUtilsLollipop, HeaderBehavior, AnimationUtils, 
//			CoordinatorLayout, HeaderScrollingViewBehavior

public class AppBarLayout extends LinearLayout
{
	public static class Behavior extends HeaderBehavior
	{

		private void animateOffsetTo(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, float f)
		{
			int j = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:iload_3         
		//    3    5:isub            
		//    4    6:invokestatic    #62  <Method int Math.abs(int)>
		//    5    9:istore          5
			f = Math.abs(f);
		//    6   11:fload           4
		//    7   13:invokestatic    #65  <Method float Math.abs(float)>
		//    8   16:fstore          4
			if(f > 0.0F)
		//*   9   18:fload           4
		//*  10   20:fconst_0        
		//*  11   21:fcmpl           
		//*  12   22:ifle            44
				j = 3 * Math.round(1000F * ((float)j / f));
		//   13   25:iconst_3        
		//   14   26:ldc1            #66  <Float 1000F>
		//   15   28:iload           5
		//   16   30:i2f             
		//   17   31:fload           4
		//   18   33:fdiv            
		//   19   34:fmul            
		//   20   35:invokestatic    #70  <Method int Math.round(float)>
		//   21   38:imul            
		//   22   39:istore          5
			else
		//*  23   41:goto            61
				j = (int)(((float)j / (float)appbarlayout.getHeight() + 1.0F) * 150F);
		//   24   44:iload           5
		//   25   46:i2f             
		//   26   47:aload_2         
		//   27   48:invokevirtual   #73  <Method int AppBarLayout.getHeight()>
		//   28   51:i2f             
		//   29   52:fdiv            
		//   30   53:fconst_1        
		//   31   54:fadd            
		//   32   55:ldc1            #74  <Float 150F>
		//   33   57:fmul            
		//   34   58:f2i             
		//   35   59:istore          5
			animateOffsetWithDuration(coordinatorlayout, appbarlayout, i, j);
		//   36   61:aload_0         
		//   37   62:aload_1         
		//   38   63:aload_2         
		//   39   64:iload_3         
		//   40   65:iload           5
		//   41   67:invokespecial   #78  <Method void animateOffsetWithDuration(CoordinatorLayout, AppBarLayout, int, int)>
		//   42   70:return          
		}

		private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, AppBarLayout appbarlayout, int i, int j)
		{
			int k = getTopBottomOffsetForScrollingSibling();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:istore          5
			if(k == i)
		//*   3    6:iload           5
		//*   4    8:iload_3         
		//*   5    9:icmpne          37
			{
				if(mOffsetAnimator != null && mOffsetAnimator.isRunning())
		//*   6   12:aload_0         
		//*   7   13:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//*   8   16:ifnull          36
		//*   9   19:aload_0         
		//*  10   20:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//*  11   23:invokevirtual   #86  <Method boolean ValueAnimator.isRunning()>
		//*  12   26:ifeq            36
					mOffsetAnimator.cancel();
		//   13   29:aload_0         
		//   14   30:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//   15   33:invokevirtual   #89  <Method void ValueAnimator.cancel()>
				return;
		//   16   36:return          
			}
			if(mOffsetAnimator == null)
		//*  17   37:aload_0         
		//*  18   38:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//*  19   41:ifnonnull       85
			{
				mOffsetAnimator = new ValueAnimator();
		//   20   44:aload_0         
		//   21   45:new             #82  <Class ValueAnimator>
		//   22   48:dup             
		//   23   49:invokespecial   #90  <Method void ValueAnimator()>
		//   24   52:putfield        #80  <Field ValueAnimator mOffsetAnimator>
				mOffsetAnimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.DECELERATE_INTERPOLATOR)));
		//   25   55:aload_0         
		//   26   56:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//   27   59:getstatic       #96  <Field Interpolator AnimationUtils.DECELERATE_INTERPOLATOR>
		//   28   62:invokevirtual   #100 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
				mOffsetAnimator.addUpdateListener(((_cls1) (appbarlayout)). new android.animation.ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						setHeaderTopBottomOffset(coordinatorLayout, ((View) (child)), ((Integer)valueanimator.getAnimatedValue()).intValue());
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field AppBarLayout$Behavior this$0>
					//    2    4:aload_0         
					//    3    5:getfield        #26  <Field CoordinatorLayout val$coordinatorLayout>
					//    4    8:aload_0         
					//    5    9:getfield        #28  <Field AppBarLayout val$child>
					//    6   12:aload_1         
					//    7   13:invokevirtual   #40  <Method Object ValueAnimator.getAnimatedValue()>
					//    8   16:checkcast       #42  <Class Integer>
					//    9   19:invokevirtual   #46  <Method int Integer.intValue()>
					//   10   22:invokevirtual   #50  <Method int AppBarLayout$Behavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
					//   11   25:pop             
					//   12   26:return          
					}

					final Behavior this$0;
					final AppBarLayout val$child;
					final CoordinatorLayout val$coordinatorLayout;

			
			{
				this$0 = final_behavior;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field AppBarLayout$Behavior this$0>
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
		//   29   65:aload_0         
		//   30   66:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//   31   69:new             #10  <Class AppBarLayout$Behavior$1>
		//   32   72:dup             
		//   33   73:aload_0         
		//   34   74:aload_1         
		//   35   75:aload_2         
		//   36   76:invokespecial   #103 <Method void AppBarLayout$Behavior$1(AppBarLayout$Behavior, CoordinatorLayout, AppBarLayout)>
		//   37   79:invokevirtual   #107 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			} else
		//*  38   82:goto            92
			{
				mOffsetAnimator.cancel();
		//   39   85:aload_0         
		//   40   86:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//   41   89:invokevirtual   #89  <Method void ValueAnimator.cancel()>
			}
			mOffsetAnimator.setDuration(Math.min(j, 600));
		//   42   92:aload_0         
		//   43   93:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//   44   96:iload           4
		//   45   98:sipush          600
		//   46  101:invokestatic    #111 <Method int Math.min(int, int)>
		//   47  104:i2l             
		//   48  105:invokevirtual   #115 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//   49  108:pop             
			mOffsetAnimator.setIntValues(new int[] {
				k, i
			});
		//   50  109:aload_0         
		//   51  110:getfield        #80  <Field ValueAnimator mOffsetAnimator>
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
		//   62  125:invokevirtual   #119 <Method void ValueAnimator.setIntValues(int[])>
			mOffsetAnimator.start();
		//   63  128:aload_0         
		//   64  129:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//   65  132:invokevirtual   #122 <Method void ValueAnimator.start()>
		//   66  135:return          
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

		private static View getAppBarChildOnOffset(AppBarLayout appbarlayout, int i)
		{
			int j = Math.abs(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #62  <Method int Math.abs(int)>
		//    2    4:istore_2        
			int k = appbarlayout.getChildCount();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
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
		//   13   19:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
		//   14   22:astore          4
				if(j >= view.getTop() && j <= view.getBottom())
		//*  15   24:iload_2         
		//*  16   25:aload           4
		//*  17   27:invokevirtual   #138 <Method int View.getTop()>
		//*  18   30:icmplt          45
		//*  19   33:iload_2         
		//*  20   34:aload           4
		//*  21   36:invokevirtual   #141 <Method int View.getBottom()>
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
			int k = appbarlayout.getChildCount();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
		//    2    4:istore          4
			for(int j = 0; j < k; j++)
		//*   3    6:iconst_0        
		//*   4    7:istore_3        
		//*   5    8:iload_3         
		//*   6    9:iload           4
		//*   7   11:icmpge          58
			{
				View view = appbarlayout.getChildAt(j);
		//    8   14:aload_1         
		//    9   15:iload_3         
		//   10   16:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
		//   11   19:astore          7
				int l = view.getTop();
		//   12   21:aload           7
		//   13   23:invokevirtual   #138 <Method int View.getTop()>
		//   14   26:istore          5
				int i1 = -i;
		//   15   28:iload_2         
		//   16   29:ineg            
		//   17   30:istore          6
				if(l <= i1 && view.getBottom() >= i1)
		//*  18   32:iload           5
		//*  19   34:iload           6
		//*  20   36:icmpgt          51
		//*  21   39:aload           7
		//*  22   41:invokevirtual   #141 <Method int View.getBottom()>
		//*  23   44:iload           6
		//*  24   46:icmplt          51
					return j;
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

		private int interpolateOffset(AppBarLayout appbarlayout, int i)
		{
			int l = Math.abs(i);
		//    0    0:iload_2         
		//    1    1:invokestatic    #62  <Method int Math.abs(int)>
		//    2    4:istore          6
			int i1 = appbarlayout.getChildCount();
		//    3    6:aload_1         
		//    4    7:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
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
		//   15   28:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
		//   16   31:astore          8
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   17   33:aload           8
		//   18   35:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   19   38:checkcast       #150 <Class AppBarLayout$LayoutParams>
		//   20   41:astore          9
				Interpolator interpolator = layoutparams.getScrollInterpolator();
		//   21   43:aload           9
		//   22   45:invokevirtual   #154 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
		//   23   48:astore          10
				if(l >= view.getTop() && l <= view.getBottom())
		//*  24   50:iload           6
		//*  25   52:aload           8
		//*  26   54:invokevirtual   #138 <Method int View.getTop()>
		//*  27   57:icmplt          208
		//*  28   60:iload           6
		//*  29   62:aload           8
		//*  30   64:invokevirtual   #141 <Method int View.getBottom()>
		//*  31   67:icmpgt          208
				{
					if(interpolator != null)
		//*  32   70:aload           10
		//*  33   72:ifnull          217
					{
						int j1 = layoutparams.getScrollFlags();
		//   34   75:aload           9
		//   35   77:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
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
		//   45   96:invokevirtual   #158 <Method int View.getHeight()>
		//   46   99:aload           9
		//   47  101:getfield        #161 <Field int AppBarLayout$LayoutParams.topMargin>
		//   48  104:iadd            
		//   49  105:aload           9
		//   50  107:getfield        #164 <Field int AppBarLayout$LayoutParams.bottomMargin>
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
		//   62  129:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//   63  132:isub            
		//   64  133:istore          4
						}
						k = j;
		//   65  135:iload           4
		//   66  137:istore          5
						if(ViewCompat.getFitsSystemWindows(view))
		//*  67  139:aload           8
		//*  68  141:invokestatic    #174 <Method boolean ViewCompat.getFitsSystemWindows(View)>
		//*  69  144:ifeq            156
							k = j - appbarlayout.getTopInset();
		//   70  147:iload           4
		//   71  149:aload_1         
		//   72  150:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
		//   73  153:isub            
		//   74  154:istore          5
						if(k > 0)
		//*  75  156:iload           5
		//*  76  158:ifle            217
						{
							j = view.getTop();
		//   77  161:aload           8
		//   78  163:invokevirtual   #138 <Method int View.getTop()>
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
		//   91  183:invokeinterface #182 <Method float Interpolator.getInterpolation(float)>
		//   92  188:fmul            
		//   93  189:invokestatic    #70  <Method int Math.round(float)>
		//   94  192:istore          4
							return Integer.signum(i) * (view.getTop() + j);
		//   95  194:iload_2         
		//   96  195:invokestatic    #187 <Method int Integer.signum(int)>
		//   97  198:aload           8
		//   98  200:invokevirtual   #138 <Method int View.getTop()>
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
		//    2    2:invokevirtual   #195 <Method List CoordinatorLayout.getDependents(View)>
		//    3    5:astore_1        
			int j = ((List) (coordinatorlayout)).size();
		//    4    6:aload_1         
		//    5    7:invokeinterface #200 <Method int List.size()>
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
		//   16   27:invokeinterface #204 <Method Object List.get(int)>
		//   17   32:checkcast       #135 <Class View>
		//   18   35:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   19   38:checkcast       #206 <Class CoordinatorLayout$LayoutParams>
		//   20   41:invokevirtual   #210 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
		//   21   44:astore_2        
				if(appbarlayout instanceof ScrollingViewBehavior)
		//*  22   45:aload_2         
		//*  23   46:instanceof      #212 <Class AppBarLayout$ScrollingViewBehavior>
		//*  24   49:ifeq            68
				{
					if(((ScrollingViewBehavior)appbarlayout).getOverlayTop() != 0)
		//*  25   52:aload_2         
		//*  26   53:checkcast       #212 <Class AppBarLayout$ScrollingViewBehavior>
		//*  27   56:invokevirtual   #215 <Method int AppBarLayout$ScrollingViewBehavior.getOverlayTop()>
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
		//    1    1:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:istore          7
			int k = getChildIndexOnOffset(appbarlayout, i1);
		//    3    6:aload_0         
		//    4    7:aload_2         
		//    5    8:iload           7
		//    6   10:invokespecial   #219 <Method int getChildIndexOnOffset(AppBarLayout, int)>
		//    7   13:istore          5
			if(k >= 0)
		//*   8   15:iload           5
		//*   9   17:iflt            193
			{
				View view = appbarlayout.getChildAt(k);
		//   10   20:aload_2         
		//   11   21:iload           5
		//   12   23:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
		//   13   26:astore          9
				int j1 = ((LayoutParams)view.getLayoutParams()).getScrollFlags();
		//   14   28:aload           9
		//   15   30:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   16   33:checkcast       #150 <Class AppBarLayout$LayoutParams>
		//   17   36:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//   18   39:istore          8
				if((j1 & 0x11) == 17)
		//*  19   41:iload           8
		//*  20   43:bipush          17
		//*  21   45:iand            
		//*  22   46:bipush          17
		//*  23   48:icmpne          193
				{
					int l = -view.getTop();
		//   24   51:aload           9
		//   25   53:invokevirtual   #138 <Method int View.getTop()>
		//   26   56:ineg            
		//   27   57:istore          6
					int i = -view.getBottom();
		//   28   59:aload           9
		//   29   61:invokevirtual   #141 <Method int View.getBottom()>
		//   30   64:ineg            
		//   31   65:istore_3        
					int j = i;
		//   32   66:iload_3         
		//   33   67:istore          4
					if(k == appbarlayout.getChildCount() - 1)
		//*  34   69:iload           5
		//*  35   71:aload_2         
		//*  36   72:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
		//*  37   75:iconst_1        
		//*  38   76:isub            
		//*  39   77:icmpne          88
						j = i + appbarlayout.getTopInset();
		//   40   80:iload_3         
		//   41   81:aload_2         
		//   42   82:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
		//   43   85:iadd            
		//   44   86:istore          4
					if(checkFlag(j1, 2))
		//*  45   88:iload           8
		//*  46   90:iconst_2        
		//*  47   91:invokestatic    #221 <Method boolean checkFlag(int, int)>
		//*  48   94:ifeq            113
					{
						i = j + ViewCompat.getMinimumHeight(view);
		//   49   97:iload           4
		//   50   99:aload           9
		//   51  101:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//   52  104:iadd            
		//   53  105:istore_3        
						k = l;
		//   54  106:iload           6
		//   55  108:istore          5
					} else
		//*  56  110:goto            157
					{
						k = l;
		//   57  113:iload           6
		//   58  115:istore          5
						i = j;
		//   59  117:iload           4
		//   60  119:istore_3        
						if(checkFlag(j1, 5))
		//*  61  120:iload           8
		//*  62  122:iconst_5        
		//*  63  123:invokestatic    #221 <Method boolean checkFlag(int, int)>
		//*  64  126:ifeq            157
						{
							i = ViewCompat.getMinimumHeight(view) + j;
		//   65  129:aload           9
		//   66  131:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//   67  134:iload           4
		//   68  136:iadd            
		//   69  137:istore_3        
							if(i1 < i)
		//*  70  138:iload           7
		//*  71  140:iload_3         
		//*  72  141:icmpge          153
							{
								k = i;
		//   73  144:iload_3         
		//   74  145:istore          5
								i = j;
		//   75  147:iload           4
		//   76  149:istore_3        
							} else
		//*  77  150:goto            157
							{
								k = l;
		//   78  153:iload           6
		//   79  155:istore          5
							}
						}
					}
					j = k;
		//   80  157:iload           5
		//   81  159:istore          4
					if(i1 < (i + k) / 2)
		//*  82  161:iload           7
		//*  83  163:iload_3         
		//*  84  164:iload           5
		//*  85  166:iadd            
		//*  86  167:iconst_2        
		//*  87  168:idiv            
		//*  88  169:icmpge          175
						j = i;
		//   89  172:iload_3         
		//   90  173:istore          4
					animateOffsetTo(coordinatorlayout, appbarlayout, MathUtils.clamp(j, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
		//   91  175:aload_0         
		//   92  176:aload_1         
		//   93  177:aload_2         
		//   94  178:iload           4
		//   95  180:aload_2         
		//   96  181:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
		//   97  184:ineg            
		//   98  185:iconst_0        
		//   99  186:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
		//  100  189:fconst_0        
		//  101  190:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				}
			}
		//  102  193:return          
		}

		private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, boolean flag)
		{
			int k;
			boolean flag1;
			boolean flag2;
			View view;
			view = getAppBarChildOnOffset(appbarlayout, i);
		//    0    0:aload_2         
		//    1    1:iload_3         
		//    2    2:invokestatic    #236 <Method View getAppBarChildOnOffset(AppBarLayout, int)>
		//    3    5:astore          10
			if(view == null)
				break MISSING_BLOCK_LABEL_162;
		//    4    7:aload           10
		//    5    9:ifnull          162
			k = ((LayoutParams)view.getLayoutParams()).getScrollFlags();
		//    6   12:aload           10
		//    7   14:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    8   17:checkcast       #150 <Class AppBarLayout$LayoutParams>
		//    9   20:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//   10   23:istore          6
			flag2 = false;
		//   11   25:iconst_0        
		//   12   26:istore          9
			flag1 = flag2;
		//   13   28:iload           9
		//   14   30:istore          8
			if((k & 1) == 0) goto _L2; else goto _L1
		//   15   32:iload           6
		//   16   34:iconst_1        
		//   17   35:iand            
		//   18   36:ifeq            123
_L1:
			int l = ViewCompat.getMinimumHeight(view);
		//   19   39:aload           10
		//   20   41:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//   21   44:istore          7
			if(j <= 0 || (k & 0xc) == 0) goto _L4; else goto _L3
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
			if(-i < view.getBottom() - l - appbarlayout.getTopInset()) goto _L2; else goto _L5
		//   30   63:iload_3         
		//   31   64:ineg            
		//   32   65:aload           10
		//   33   67:invokevirtual   #141 <Method int View.getBottom()>
		//   34   70:iload           7
		//   35   72:isub            
		//   36   73:aload_2         
		//   37   74:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
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
			if((k & 2) == 0)
				break; /* Loop/switch isn't completed */
		//   45   91:iload           6
		//   46   93:iconst_2        
		//   47   94:iand            
		//   48   95:ifeq            123
			flag1 = flag2;
		//   49   98:iload           9
		//   50  100:istore          8
			if(-i < view.getBottom() - l - appbarlayout.getTopInset()) goto _L2; else goto _L5
		//   51  102:iload_3         
		//   52  103:ineg            
		//   53  104:aload           10
		//   54  106:invokevirtual   #141 <Method int View.getBottom()>
		//   55  109:iload           7
		//   56  111:isub            
		//   57  112:aload_2         
		//   58  113:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
		//   59  116:isub            
		//   60  117:icmplt          123
		//*  61  120:goto            81
_L2:
			flag1 = appbarlayout.setCollapsedState(flag1);
		//   62  123:aload_2         
		//   63  124:iload           8
		//   64  126:invokevirtual   #240 <Method boolean AppBarLayout.setCollapsedState(boolean)>
		//   65  129:istore          8
			if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && shouldJumpElevationState(coordinatorlayout, appbarlayout)))
		//*  66  131:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
		//*  67  134:bipush          11
		//*  68  136:icmplt          162
		//*  69  139:iload           5
		//*  70  141:ifne            158
		//*  71  144:iload           8
		//*  72  146:ifeq            162
		//*  73  149:aload_0         
		//*  74  150:aload_1         
		//*  75  151:aload_2         
		//*  76  152:invokespecial   #247 <Method boolean shouldJumpElevationState(CoordinatorLayout, AppBarLayout)>
		//*  77  155:ifeq            162
				appbarlayout.jumpDrawablesToCurrentState();
		//   78  158:aload_2         
		//   79  159:invokevirtual   #250 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
		//   80  162:return          
		}

		boolean canDragView(AppBarLayout appbarlayout)
		{
			if(mOnDragCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #254 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
		//*   2    4:ifnull          16
				return mOnDragCallback.canDrag(appbarlayout);
		//    3    7:aload_0         
		//    4    8:getfield        #254 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #257 <Method boolean AppBarLayout$Behavior$DragCallback.canDrag(AppBarLayout)>
		//    7   15:ireturn         
			if(mLastNestedScrollingChildRef != null)
		//*   8   16:aload_0         
		//*   9   17:getfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
		//*  10   20:ifnull          57
			{
				appbarlayout = ((AppBarLayout) ((View)mLastNestedScrollingChildRef.get()));
		//   11   23:aload_0         
		//   12   24:getfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
		//   13   27:invokevirtual   #264 <Method Object WeakReference.get()>
		//   14   30:checkcast       #135 <Class View>
		//   15   33:astore_1        
				return appbarlayout != null && ((View) (appbarlayout)).isShown() && !((View) (appbarlayout)).canScrollVertically(-1);
		//   16   34:aload_1         
		//   17   35:ifnull          55
		//   18   38:aload_1         
		//   19   39:invokevirtual   #267 <Method boolean View.isShown()>
		//   20   42:ifeq            55
		//   21   45:aload_1         
		//   22   46:iconst_m1       
		//   23   47:invokevirtual   #271 <Method boolean View.canScrollVertically(int)>
		//   24   50:ifne            55
		//   25   53:iconst_1        
		//   26   54:ireturn         
		//   27   55:iconst_0        
		//   28   56:ireturn         
			} else
			{
				return true;
		//   29   57:iconst_1        
		//   30   58:ireturn         
			}
		}

		volatile boolean canDragView(View view)
		{
			return canDragView((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #273 <Method boolean canDragView(AppBarLayout)>
		//    4    8:ireturn         
		}

		public volatile int getLeftAndRightOffset()
		{
			return super.getLeftAndRightOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #276 <Method int HeaderBehavior.getLeftAndRightOffset()>
		//    2    4:ireturn         
		}

		int getMaxDragOffset(AppBarLayout appbarlayout)
		{
			return -appbarlayout.getDownNestedScrollRange();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #281 <Method int AppBarLayout.getDownNestedScrollRange()>
		//    2    4:ineg            
		//    3    5:ireturn         
		}

		volatile int getMaxDragOffset(View view)
		{
			return getMaxDragOffset((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #283 <Method int getMaxDragOffset(AppBarLayout)>
		//    4    8:ireturn         
		}

		int getScrollRangeForDragFling(AppBarLayout appbarlayout)
		{
			return appbarlayout.getTotalScrollRange();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
		//    2    4:ireturn         
		}

		volatile int getScrollRangeForDragFling(View view)
		{
			return getScrollRangeForDragFling((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #286 <Method int getScrollRangeForDragFling(AppBarLayout)>
		//    4    8:ireturn         
		}

		public volatile int getTopAndBottomOffset()
		{
			return super.getTopAndBottomOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #289 <Method int HeaderBehavior.getTopAndBottomOffset()>
		//    2    4:ireturn         
		}

		int getTopBottomOffsetForScrollingSibling()
		{
			return getTopAndBottomOffset() + mOffsetDelta;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//    2    4:aload_0         
		//    3    5:getfield        #50  <Field int mOffsetDelta>
		//    4    8:iadd            
		//    5    9:ireturn         
		}

		boolean isOffsetAnimatorRunning()
		{
			return mOffsetAnimator != null && mOffsetAnimator.isRunning();
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//    2    4:ifnull          19
		//    3    7:aload_0         
		//    4    8:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//    5   11:invokevirtual   #86  <Method boolean ValueAnimator.isRunning()>
		//    6   14:ifeq            19
		//    7   17:iconst_1        
		//    8   18:ireturn         
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		void onFlingFinished(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			snapToChildIfNeeded(coordinatorlayout, appbarlayout);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #296 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
		//    4    6:return          
		}

		volatile void onFlingFinished(CoordinatorLayout coordinatorlayout, View view)
		{
			onFlingFinished(coordinatorlayout, (AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:invokevirtual   #299 <Method void onFlingFinished(CoordinatorLayout, AppBarLayout)>
		//    5    9:return          
		}

		public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
		{
			boolean flag = super.onLayoutChild(coordinatorlayout, ((View) (appbarlayout)), i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #304 <Method boolean HeaderBehavior.onLayoutChild(CoordinatorLayout, View, int)>
		//    5    7:istore          5
			int j = appbarlayout.getPendingAction();
		//    6    9:aload_2         
		//    7   10:invokevirtual   #307 <Method int AppBarLayout.getPendingAction()>
		//    8   13:istore          4
			if(mOffsetToChildIndexOnLayout >= 0 && (j & 8) == 0)
		//*   9   15:aload_0         
		//*  10   16:getfield        #42  <Field int mOffsetToChildIndexOnLayout>
		//*  11   19:iflt            98
		//*  12   22:iload           4
		//*  13   24:bipush          8
		//*  14   26:iand            
		//*  15   27:ifne            98
			{
				View view = appbarlayout.getChildAt(mOffsetToChildIndexOnLayout);
		//   16   30:aload_2         
		//   17   31:aload_0         
		//   18   32:getfield        #42  <Field int mOffsetToChildIndexOnLayout>
		//   19   35:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
		//   20   38:astore          6
				i = -view.getBottom();
		//   21   40:aload           6
		//   22   42:invokevirtual   #141 <Method int View.getBottom()>
		//   23   45:ineg            
		//   24   46:istore_3        
				if(mOffsetToChildIndexOnLayoutIsMinHeight)
		//*  25   47:aload_0         
		//*  26   48:getfield        #309 <Field boolean mOffsetToChildIndexOnLayoutIsMinHeight>
		//*  27   51:ifeq            70
					i += ViewCompat.getMinimumHeight(view) + appbarlayout.getTopInset();
		//   28   54:iload_3         
		//   29   55:aload           6
		//   30   57:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//   31   60:aload_2         
		//   32   61:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
		//   33   64:iadd            
		//   34   65:iadd            
		//   35   66:istore_3        
				else
		//*  36   67:goto            87
					i += Math.round((float)view.getHeight() * mOffsetToChildIndexOnLayoutPerc);
		//   37   70:iload_3         
		//   38   71:aload           6
		//   39   73:invokevirtual   #158 <Method int View.getHeight()>
		//   40   76:i2f             
		//   41   77:aload_0         
		//   42   78:getfield        #311 <Field float mOffsetToChildIndexOnLayoutPerc>
		//   43   81:fmul            
		//   44   82:invokestatic    #70  <Method int Math.round(float)>
		//   45   85:iadd            
		//   46   86:istore_3        
				setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), i);
		//   47   87:aload_0         
		//   48   88:aload_1         
		//   49   89:aload_2         
		//   50   90:iload_3         
		//   51   91:invokevirtual   #315 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//   52   94:pop             
			} else
		//*  53   95:goto            189
			if(j != 0)
		//*  54   98:iload           4
		//*  55  100:ifeq            189
			{
				if((j & 4) != 0)
		//*  56  103:iload           4
		//*  57  105:iconst_4        
		//*  58  106:iand            
		//*  59  107:ifeq            115
					i = 1;
		//   60  110:iconst_1        
		//   61  111:istore_3        
				else
		//*  62  112:goto            117
					i = 0;
		//   63  115:iconst_0        
		//   64  116:istore_3        
				if((j & 2) != 0)
		//*  65  117:iload           4
		//*  66  119:iconst_2        
		//*  67  120:iand            
		//*  68  121:ifeq            159
				{
					j = -appbarlayout.getUpNestedPreScrollRange();
		//   69  124:aload_2         
		//   70  125:invokevirtual   #318 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   71  128:ineg            
		//   72  129:istore          4
					if(i != 0)
		//*  73  131:iload_3         
		//*  74  132:ifeq            147
						animateOffsetTo(coordinatorlayout, appbarlayout, j, 0.0F);
		//   75  135:aload_0         
		//   76  136:aload_1         
		//   77  137:aload_2         
		//   78  138:iload           4
		//   79  140:fconst_0        
		//   80  141:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
					else
		//*  81  144:goto            189
						setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), j);
		//   82  147:aload_0         
		//   83  148:aload_1         
		//   84  149:aload_2         
		//   85  150:iload           4
		//   86  152:invokevirtual   #315 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//   87  155:pop             
				} else
		//*  88  156:goto            189
				if((j & 1) != 0)
		//*  89  159:iload           4
		//*  90  161:iconst_1        
		//*  91  162:iand            
		//*  92  163:ifeq            189
					if(i != 0)
		//*  93  166:iload_3         
		//*  94  167:ifeq            181
						animateOffsetTo(coordinatorlayout, appbarlayout, 0, 0.0F);
		//   95  170:aload_0         
		//   96  171:aload_1         
		//   97  172:aload_2         
		//   98  173:iconst_0        
		//   99  174:fconst_0        
		//  100  175:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
					else
		//* 101  178:goto            189
						setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), 0);
		//  102  181:aload_0         
		//  103  182:aload_1         
		//  104  183:aload_2         
		//  105  184:iconst_0        
		//  106  185:invokevirtual   #315 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//  107  188:pop             
			}
			appbarlayout.resetPendingAction();
		//  108  189:aload_2         
		//  109  190:invokevirtual   #321 <Method void AppBarLayout.resetPendingAction()>
			mOffsetToChildIndexOnLayout = -1;
		//  110  193:aload_0         
		//  111  194:iconst_m1       
		//  112  195:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
			setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -appbarlayout.getTotalScrollRange(), 0));
		//  113  198:aload_0         
		//  114  199:aload_0         
		//  115  200:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//  116  203:aload_2         
		//  117  204:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
		//  118  207:ineg            
		//  119  208:iconst_0        
		//  120  209:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
		//  121  212:invokevirtual   #324 <Method boolean setTopAndBottomOffset(int)>
		//  122  215:pop             
			updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, getTopAndBottomOffset(), 0, true);
		//  123  216:aload_0         
		//  124  217:aload_1         
		//  125  218:aload_2         
		//  126  219:aload_0         
		//  127  220:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//  128  223:iconst_0        
		//  129  224:iconst_1        
		//  130  225:invokespecial   #326 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
			appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
		//  131  228:aload_2         
		//  132  229:aload_0         
		//  133  230:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//  134  233:invokevirtual   #330 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
			return flag;
		//  135  236:iload           5
		//  136  238:ireturn         
		}

		public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
		{
			return onLayoutChild(coordinatorlayout, (AppBarLayout)view, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:iload_3         
		//    5    7:invokevirtual   #332 <Method boolean onLayoutChild(CoordinatorLayout, AppBarLayout, int)>
		//    6   10:ireturn         
		}

		public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k, int l)
		{
			if(((CoordinatorLayout.LayoutParams)appbarlayout.getLayoutParams()).height == -2)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #335 <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
		//*   2    4:checkcast       #206 <Class CoordinatorLayout$LayoutParams>
		//*   3    7:getfield        #338 <Field int CoordinatorLayout$LayoutParams.height>
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
		//   12   22:invokestatic    #343 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   13   25:iload           6
		//   14   27:invokevirtual   #346 <Method void CoordinatorLayout.onMeasureChild(View, int, int, int, int)>
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
		//   24   42:invokespecial   #349 <Method boolean HeaderBehavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
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
		//    8   13:invokevirtual   #351 <Method boolean onMeasureChild(CoordinatorLayout, AppBarLayout, int, int, int, int)>
		//    9   16:ireturn         
		}

		public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[], int k)
		{
			if(j != 0)
		//*   0    0:iload           5
		//*   1    2:ifeq            65
			{
				if(j < 0)
		//*   2    5:iload           5
		//*   3    7:ifge            29
				{
					i = -appbarlayout.getTotalScrollRange();
		//    4   10:aload_2         
		//    5   11:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
		//    6   14:ineg            
		//    7   15:istore          4
					k = appbarlayout.getDownNestedPreScrollRange() + i;
		//    8   17:aload_2         
		//    9   18:invokevirtual   #356 <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   10   21:iload           4
		//   11   23:iadd            
		//   12   24:istore          7
				} else
		//*  13   26:goto            42
				{
					i = -appbarlayout.getUpNestedPreScrollRange();
		//   14   29:aload_2         
		//   15   30:invokevirtual   #318 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   16   33:ineg            
		//   17   34:istore          4
					k = 0;
		//   18   36:iconst_0        
		//   19   37:istore          7
				}
		//*  20   39:goto            26
				if(i != k)
		//*  21   42:iload           4
		//*  22   44:iload           7
		//*  23   46:icmpeq          65
					ai[1] = scroll(coordinatorlayout, ((View) (appbarlayout)), j, i, k);
		//   24   49:aload           6
		//   25   51:iconst_1        
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:aload_2         
		//   29   55:iload           5
		//   30   57:iload           4
		//   31   59:iload           7
		//   32   61:invokevirtual   #360 <Method int scroll(CoordinatorLayout, View, int, int, int)>
		//   33   64:iastore         
			}
		//   34   65:return          
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
		//    9   15:invokevirtual   #363 <Method void onNestedPreScroll(CoordinatorLayout, AppBarLayout, View, int, int, int[], int)>
		//   10   18:return          
		}

		public void onNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int k, int l, 
				int i1)
		{
			if(l < 0)
		//*   0    0:iload           7
		//*   1    2:ifge            20
				scroll(coordinatorlayout, ((View) (appbarlayout)), l, -appbarlayout.getDownNestedScrollRange(), 0);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:iload           7
		//    6   10:aload_2         
		//    7   11:invokevirtual   #281 <Method int AppBarLayout.getDownNestedScrollRange()>
		//    8   14:ineg            
		//    9   15:iconst_0        
		//   10   16:invokevirtual   #360 <Method int scroll(CoordinatorLayout, View, int, int, int)>
		//   11   19:pop             
		//   12   20:return          
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
		//   10   17:invokevirtual   #368 <Method void onNestedScroll(CoordinatorLayout, AppBarLayout, View, int, int, int, int, int)>
		//   11   20:return          
		}

		public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, Parcelable parcelable)
		{
			if(parcelable instanceof SavedState)
		//*   0    0:aload_3         
		//*   1    1:instanceof      #15  <Class AppBarLayout$Behavior$SavedState>
		//*   2    4:ifeq            47
			{
				parcelable = ((Parcelable) ((SavedState)parcelable));
		//    3    7:aload_3         
		//    4    8:checkcast       #15  <Class AppBarLayout$Behavior$SavedState>
		//    5   11:astore_3        
				super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), ((SavedState) (parcelable)).getSuperState());
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:aload_3         
		//   10   16:invokevirtual   #374 <Method Parcelable AppBarLayout$Behavior$SavedState.getSuperState()>
		//   11   19:invokespecial   #377 <Method void HeaderBehavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
				mOffsetToChildIndexOnLayout = ((SavedState) (parcelable)).firstVisibleChildIndex;
		//   12   22:aload_0         
		//   13   23:aload_3         
		//   14   24:getfield        #380 <Field int AppBarLayout$Behavior$SavedState.firstVisibleChildIndex>
		//   15   27:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
				mOffsetToChildIndexOnLayoutPerc = ((SavedState) (parcelable)).firstVisibleChildPercentageShown;
		//   16   30:aload_0         
		//   17   31:aload_3         
		//   18   32:getfield        #383 <Field float AppBarLayout$Behavior$SavedState.firstVisibleChildPercentageShown>
		//   19   35:putfield        #311 <Field float mOffsetToChildIndexOnLayoutPerc>
				mOffsetToChildIndexOnLayoutIsMinHeight = ((SavedState) (parcelable)).firstVisibleChildAtMinimumHeight;
		//   20   38:aload_0         
		//   21   39:aload_3         
		//   22   40:getfield        #386 <Field boolean AppBarLayout$Behavior$SavedState.firstVisibleChildAtMinimumHeight>
		//   23   43:putfield        #309 <Field boolean mOffsetToChildIndexOnLayoutIsMinHeight>
				return;
		//   24   46:return          
			} else
			{
				super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), parcelable);
		//   25   47:aload_0         
		//   26   48:aload_1         
		//   27   49:aload_2         
		//   28   50:aload_3         
		//   29   51:invokespecial   #377 <Method void HeaderBehavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
				mOffsetToChildIndexOnLayout = -1;
		//   30   54:aload_0         
		//   31   55:iconst_m1       
		//   32   56:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
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
		//    5    7:invokevirtual   #388 <Method void onRestoreInstanceState(CoordinatorLayout, AppBarLayout, Parcelable)>
		//    6   10:return          
		}

		public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			Object obj = ((Object) (super.onSaveInstanceState(coordinatorlayout, ((View) (appbarlayout)))));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #393 <Method Parcelable HeaderBehavior.onSaveInstanceState(CoordinatorLayout, View)>
		//    4    6:astore          8
			int j = getTopAndBottomOffset();
		//    5    8:aload_0         
		//    6    9:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//    7   12:istore          4
			int k = appbarlayout.getChildCount();
		//    8   14:aload_2         
		//    9   15:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
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
		//   20   33:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
		//   21   36:astore_1        
				int l = ((View) (coordinatorlayout)).getBottom() + j;
		//   22   37:aload_1         
		//   23   38:invokevirtual   #141 <Method int View.getBottom()>
		//   24   41:iload           4
		//   25   43:iadd            
		//   26   44:istore          6
				if(((View) (coordinatorlayout)).getTop() + j <= 0 && l >= 0)
		//*  27   46:aload_1         
		//*  28   47:invokevirtual   #138 <Method int View.getTop()>
		//*  29   50:iload           4
		//*  30   52:iadd            
		//*  31   53:ifgt            119
		//*  32   56:iload           6
		//*  33   58:iflt            119
				{
					obj = ((Object) (new SavedState(((Parcelable) (obj)))));
		//   34   61:new             #15  <Class AppBarLayout$Behavior$SavedState>
		//   35   64:dup             
		//   36   65:aload           8
		//   37   67:invokespecial   #396 <Method void AppBarLayout$Behavior$SavedState(Parcelable)>
		//   38   70:astore          8
					obj.firstVisibleChildIndex = i;
		//   39   72:aload           8
		//   40   74:iload_3         
		//   41   75:putfield        #380 <Field int AppBarLayout$Behavior$SavedState.firstVisibleChildIndex>
					if(l == ViewCompat.getMinimumHeight(((View) (coordinatorlayout))) + appbarlayout.getTopInset())
		//*  42   78:iload           6
		//*  43   80:aload_1         
		//*  44   81:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//*  45   84:aload_2         
		//*  46   85:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
		//*  47   88:iadd            
		//*  48   89:icmpne          95
						flag = true;
		//   49   92:iconst_1        
		//   50   93:istore          7
					obj.firstVisibleChildAtMinimumHeight = flag;
		//   51   95:aload           8
		//   52   97:iload           7
		//   53   99:putfield        #386 <Field boolean AppBarLayout$Behavior$SavedState.firstVisibleChildAtMinimumHeight>
					obj.firstVisibleChildPercentageShown = (float)l / (float)((View) (coordinatorlayout)).getHeight();
		//   54  102:aload           8
		//   55  104:iload           6
		//   56  106:i2f             
		//   57  107:aload_1         
		//   58  108:invokevirtual   #158 <Method int View.getHeight()>
		//   59  111:i2f             
		//   60  112:fdiv            
		//   61  113:putfield        #383 <Field float AppBarLayout$Behavior$SavedState.firstVisibleChildPercentageShown>
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
		//    4    6:invokevirtual   #398 <Method Parcelable onSaveInstanceState(CoordinatorLayout, AppBarLayout)>
		//    5    9:areturn         
		}

		public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i, int j)
		{
			boolean flag;
			if((i & 2) != 0 && appbarlayout.hasScrollableChildren() && coordinatorlayout.getHeight() - view.getHeight() <= appbarlayout.getHeight())
		//*   0    0:iload           5
		//*   1    2:iconst_2        
		//*   2    3:iand            
		//*   3    4:ifeq            36
		//*   4    7:aload_2         
		//*   5    8:invokevirtual   #403 <Method boolean AppBarLayout.hasScrollableChildren()>
		//*   6   11:ifeq            36
		//*   7   14:aload_1         
		//*   8   15:invokevirtual   #404 <Method int CoordinatorLayout.getHeight()>
		//*   9   18:aload_3         
		//*  10   19:invokevirtual   #158 <Method int View.getHeight()>
		//*  11   22:isub            
		//*  12   23:aload_2         
		//*  13   24:invokevirtual   #73  <Method int AppBarLayout.getHeight()>
		//*  14   27:icmpgt          36
				flag = true;
		//   15   30:iconst_1        
		//   16   31:istore          7
			else
		//*  17   33:goto            39
				flag = false;
		//   18   36:iconst_0        
		//   19   37:istore          7
			if(flag && mOffsetAnimator != null)
		//*  20   39:iload           7
		//*  21   41:ifeq            58
		//*  22   44:aload_0         
		//*  23   45:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//*  24   48:ifnull          58
				mOffsetAnimator.cancel();
		//   25   51:aload_0         
		//   26   52:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//   27   55:invokevirtual   #89  <Method void ValueAnimator.cancel()>
			mLastNestedScrollingChildRef = null;
		//   28   58:aload_0         
		//   29   59:aconst_null     
		//   30   60:putfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
			return flag;
		//   31   63:iload           7
		//   32   65:ireturn         
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
		//    8   13:invokevirtual   #407 <Method boolean onStartNestedScroll(CoordinatorLayout, AppBarLayout, View, View, int, int)>
		//    9   16:ireturn         
		}

		public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i)
		{
			if(i == 0)
		//*   0    0:iload           4
		//*   1    2:ifne            11
				snapToChildIfNeeded(coordinatorlayout, appbarlayout);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:invokespecial   #296 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
			mLastNestedScrollingChildRef = new WeakReference(((Object) (view)));
		//    6   11:aload_0         
		//    7   12:new             #261 <Class WeakReference>
		//    8   15:dup             
		//    9   16:aload_3         
		//   10   17:invokespecial   #412 <Method void WeakReference(Object)>
		//   11   20:putfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
		//   12   23:return          
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
		//    6    9:invokevirtual   #415 <Method void onStopNestedScroll(CoordinatorLayout, AppBarLayout, View, int)>
		//    7   12:return          
		}

		public void setDragCallback(DragCallback dragcallback)
		{
			mOnDragCallback = dragcallback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #254 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
		//    3    5:return          
		}

		int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
		{
			int l = getTopBottomOffsetForScrollingSibling();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #56  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:istore          6
			if(j != 0 && l >= j && l <= k)
		//*   3    6:iload           4
		//*   4    8:ifeq            136
		//*   5   11:iload           6
		//*   6   13:iload           4
		//*   7   15:icmplt          136
		//*   8   18:iload           6
		//*   9   20:iload           5
		//*  10   22:icmpgt          136
			{
				j = MathUtils.clamp(i, j, k);
		//   11   25:iload_3         
		//   12   26:iload           4
		//   13   28:iload           5
		//   14   30:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
		//   15   33:istore          4
				if(l != j)
		//*  16   35:iload           6
		//*  17   37:iload           4
		//*  18   39:icmpeq          141
				{
					if(appbarlayout.hasChildWithInterpolator())
		//*  19   42:aload_2         
		//*  20   43:invokevirtual   #423 <Method boolean AppBarLayout.hasChildWithInterpolator()>
		//*  21   46:ifeq            60
						i = interpolateOffset(appbarlayout, j);
		//   22   49:aload_0         
		//   23   50:aload_2         
		//   24   51:iload           4
		//   25   53:invokespecial   #425 <Method int interpolateOffset(AppBarLayout, int)>
		//   26   56:istore_3        
					else
		//*  27   57:goto            63
						i = j;
		//   28   60:iload           4
		//   29   62:istore_3        
					boolean flag = setTopAndBottomOffset(i);
		//   30   63:aload_0         
		//   31   64:iload_3         
		//   32   65:invokevirtual   #324 <Method boolean setTopAndBottomOffset(int)>
		//   33   68:istore          7
					mOffsetDelta = j - i;
		//   34   70:aload_0         
		//   35   71:iload           4
		//   36   73:iload_3         
		//   37   74:isub            
		//   38   75:putfield        #50  <Field int mOffsetDelta>
					if(!flag && appbarlayout.hasChildWithInterpolator())
		//*  39   78:iload           7
		//*  40   80:ifne            95
		//*  41   83:aload_2         
		//*  42   84:invokevirtual   #423 <Method boolean AppBarLayout.hasChildWithInterpolator()>
		//*  43   87:ifeq            95
						coordinatorlayout.dispatchDependentViewsChanged(((View) (appbarlayout)));
		//   44   90:aload_1         
		//   45   91:aload_2         
		//   46   92:invokevirtual   #429 <Method void CoordinatorLayout.dispatchDependentViewsChanged(View)>
					appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
		//   47   95:aload_2         
		//   48   96:aload_0         
		//   49   97:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//   50  100:invokevirtual   #330 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
					if(j < l)
		//*  51  103:iload           4
		//*  52  105:iload           6
		//*  53  107:icmpge          115
						i = -1;
		//   54  110:iconst_m1       
		//   55  111:istore_3        
					else
		//*  56  112:goto            120
						i = 1;
		//   57  115:iconst_1        
		//   58  116:istore_3        
		//*  59  117:goto            112
					updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, j, i, false);
		//   60  120:aload_0         
		//   61  121:aload_1         
		//   62  122:aload_2         
		//   63  123:iload           4
		//   64  125:iload_3         
		//   65  126:iconst_0        
		//   66  127:invokespecial   #326 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
					return l - j;
		//   67  130:iload           6
		//   68  132:iload           4
		//   69  134:isub            
		//   70  135:ireturn         
				}
			} else
			{
				mOffsetDelta = 0;
		//   71  136:aload_0         
		//   72  137:iconst_0        
		//   73  138:putfield        #50  <Field int mOffsetDelta>
			}
			return 0;
		//   74  141:iconst_0        
		//   75  142:ireturn         
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
		//    7   11:invokevirtual   #431 <Method int setHeaderTopBottomOffset(CoordinatorLayout, AppBarLayout, int, int, int)>
		//    8   14:ireturn         
		}

		public volatile boolean setLeftAndRightOffset(int i)
		{
			return super.setLeftAndRightOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #434 <Method boolean HeaderBehavior.setLeftAndRightOffset(int)>
		//    3    5:ireturn         
		}

		public volatile boolean setTopAndBottomOffset(int i)
		{
			return super.setTopAndBottomOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #435 <Method boolean HeaderBehavior.setTopAndBottomOffset(int)>
		//    3    5:ireturn         
		}

		private static final int INVALID_POSITION = -1;
		private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
		private WeakReference mLastNestedScrollingChildRef;
		private ValueAnimator mOffsetAnimator;
		private int mOffsetDelta;
		private int mOffsetToChildIndexOnLayout;
		private boolean mOffsetToChildIndexOnLayoutIsMinHeight;
		private float mOffsetToChildIndexOnLayoutPerc;
		private DragCallback mOnDragCallback;


/*
		static int access$000(Behavior behavior)
		{
			return behavior.mOffsetDelta;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field int mOffsetDelta>
		//    2    4:ireturn         
		}

*/

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #40  <Method void HeaderBehavior()>
			mOffsetToChildIndexOnLayout = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
		//    5    9:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #46  <Method void HeaderBehavior(Context, AttributeSet)>
			mOffsetToChildIndexOnLayout = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
		//    7   11:return          
		}
	}

	public static abstract class Behavior.DragCallback
	{

		public abstract boolean canDrag(AppBarLayout appbarlayout);

		public Behavior.DragCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	protected static class Behavior.SavedState extends AbsSavedState
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

			public Behavior.SavedState createFromParcel(Parcel parcel)
			{
				return new Behavior.SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public Behavior.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new Behavior.SavedState(parcel, classloader);
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #29  <Method AppBarLayout$Behavior$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #32  <Method AppBarLayout$Behavior$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Behavior.SavedState[] newArray(int i)
			{
				return new Behavior.SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       Behavior.SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #37  <Method AppBarLayout$Behavior$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		boolean firstVisibleChildAtMinimumHeight;
		int firstVisibleChildIndex;
		float firstVisibleChildPercentageShown;

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

		public Behavior.SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #55  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	public static class LayoutParams extends android.widget.LinearLayout.LayoutParams
	{

		public int getScrollFlags()
		{
			return mScrollFlags;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int mScrollFlags>
		//    2    4:ireturn         
		}

		public Interpolator getScrollInterpolator()
		{
			return mScrollInterpolator;
		//    0    0:aload_0         
		//    1    1:getfield        #82  <Field Interpolator mScrollInterpolator>
		//    2    4:areturn         
		}

		boolean isCollapsible()
		{
			return (mScrollFlags & 1) == 1 && (mScrollFlags & 0xa) != 0;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int mScrollFlags>
		//    2    4:iconst_1        
		//    3    5:iand            
		//    4    6:iconst_1        
		//    5    7:icmpne          22
		//    6   10:aload_0         
		//    7   11:getfield        #36  <Field int mScrollFlags>
		//    8   14:bipush          10
		//    9   16:iand            
		//   10   17:ifeq            22
		//   11   20:iconst_1        
		//   12   21:ireturn         
		//   13   22:iconst_0        
		//   14   23:ireturn         
		}

		public void setScrollFlags(int i)
		{
			mScrollFlags = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #36  <Field int mScrollFlags>
		//    3    5:return          
		}

		public void setScrollInterpolator(Interpolator interpolator)
		{
			mScrollInterpolator = interpolator;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #82  <Field Interpolator mScrollInterpolator>
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
		int mScrollFlags;
		Interpolator mScrollInterpolator;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #34  <Method void android.widget.LinearLayout$LayoutParams(int, int)>
			mScrollFlags = 1;
		//    4    6:aload_0         
		//    5    7:iconst_1        
		//    6    8:putfield        #36  <Field int mScrollFlags>
		//    7   11:return          
		}

		public LayoutParams(int i, int j, float f)
		{
			super(i, j, f);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:fload_3         
		//    4    4:invokespecial   #40  <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
			mScrollFlags = 1;
		//    5    7:aload_0         
		//    6    8:iconst_1        
		//    7    9:putfield        #36  <Field int mScrollFlags>
		//    8   12:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #43  <Method void android.widget.LinearLayout$LayoutParams(Context, AttributeSet)>
			mScrollFlags = 1;
		//    4    6:aload_0         
		//    5    7:iconst_1        
		//    6    8:putfield        #36  <Field int mScrollFlags>
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.AppBarLayout_Layout)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #49  <Field int[] android.support.design.R$styleable.AppBarLayout_Layout>
		//   10   16:invokevirtual   #55  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_2        
			mScrollFlags = ((TypedArray) (attributeset)).getInt(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
		//   12   20:aload_0         
		//   13   21:aload_2         
		//   14   22:getstatic       #58  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollFlags>
		//   15   25:iconst_0        
		//   16   26:invokevirtual   #64  <Method int TypedArray.getInt(int, int)>
		//   17   29:putfield        #36  <Field int mScrollFlags>
			if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator))
		//*  18   32:aload_2         
		//*  19   33:getstatic       #67  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollInterpolator>
		//*  20   36:invokevirtual   #71  <Method boolean TypedArray.hasValue(int)>
		//*  21   39:ifeq            58
				mScrollInterpolator = AnimationUtils.loadInterpolator(context, ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
		//   22   42:aload_0         
		//   23   43:aload_1         
		//   24   44:aload_2         
		//   25   45:getstatic       #67  <Field int android.support.design.R$styleable.AppBarLayout_Layout_layout_scrollInterpolator>
		//   26   48:iconst_0        
		//   27   49:invokevirtual   #74  <Method int TypedArray.getResourceId(int, int)>
		//   28   52:invokestatic    #80  <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
		//   29   55:putfield        #82  <Field Interpolator mScrollInterpolator>
			((TypedArray) (attributeset)).recycle();
		//   30   58:aload_2         
		//   31   59:invokevirtual   #86  <Method void TypedArray.recycle()>
		//   32   62:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.widget.LinearLayout.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #93  <Method void android.widget.LinearLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
			mScrollFlags = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #36  <Field int mScrollFlags>
			mScrollFlags = layoutparams.mScrollFlags;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #36  <Field int mScrollFlags>
		//    9   15:putfield        #36  <Field int mScrollFlags>
			mScrollInterpolator = layoutparams.mScrollInterpolator;
		//   10   18:aload_0         
		//   11   19:aload_1         
		//   12   20:getfield        #82  <Field Interpolator mScrollInterpolator>
		//   13   23:putfield        #82  <Field Interpolator mScrollInterpolator>
		//   14   26:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #97  <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
			mScrollFlags = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #36  <Field int mScrollFlags>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #100 <Method void android.widget.LinearLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			mScrollFlags = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #36  <Field int mScrollFlags>
		//    6   10:return          
		}

		public LayoutParams(android.widget.LinearLayout.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #93  <Method void android.widget.LinearLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
			mScrollFlags = 1;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #36  <Field int mScrollFlags>
		//    6   10:return          
		}
	}

	public static interface LayoutParams.ScrollFlags
		extends Annotation
	{
	}

	public static interface OnOffsetChangedListener
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
			if(appbarlayout instanceof Behavior)
		//*   5   11:aload_0         
		//*   6   12:instanceof      #58  <Class AppBarLayout$Behavior>
		//*   7   15:ifeq            26
				return ((Behavior)appbarlayout).getTopBottomOffsetForScrollingSibling();
		//    8   18:aload_0         
		//    9   19:checkcast       #58  <Class AppBarLayout$Behavior>
		//   10   22:invokevirtual   #62  <Method int AppBarLayout$Behavior.getTopBottomOffsetForScrollingSibling()>
		//   11   25:ireturn         
			else
				return 0;
		//   12   26:iconst_0        
		//   13   27:ireturn         
		}

		private void offsetChildAsNeeded(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			coordinatorlayout = ((CoordinatorLayout) (((CoordinatorLayout.LayoutParams)view1.getLayoutParams()).getBehavior()));
		//    0    0:aload_3         
		//    1    1:invokevirtual   #67  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #52  <Class CoordinatorLayout$LayoutParams>
		//    3    7:invokevirtual   #56  <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
		//    4   10:astore_1        
			if(coordinatorlayout instanceof Behavior)
		//*   5   11:aload_1         
		//*   6   12:instanceof      #58  <Class AppBarLayout$Behavior>
		//*   7   15:ifeq            52
			{
				coordinatorlayout = ((CoordinatorLayout) ((Behavior)coordinatorlayout));
		//    8   18:aload_1         
		//    9   19:checkcast       #58  <Class AppBarLayout$Behavior>
		//   10   22:astore_1        
				ViewCompat.offsetTopAndBottom(view, ((view1.getBottom() - view.getTop()) + ((Behavior) (coordinatorlayout)).mOffsetDelta + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view1));
		//   11   23:aload_2         
		//   12   24:aload_3         
		//   13   25:invokevirtual   #70  <Method int View.getBottom()>
		//   14   28:aload_2         
		//   15   29:invokevirtual   #73  <Method int View.getTop()>
		//   16   32:isub            
		//   17   33:aload_1         
		//   18   34:invokestatic    #77  <Method int AppBarLayout$Behavior.access$000(AppBarLayout$Behavior)>
		//   19   37:iadd            
		//   20   38:aload_0         
		//   21   39:invokevirtual   #80  <Method int getVerticalLayoutGap()>
		//   22   42:iadd            
		//   23   43:aload_0         
		//   24   44:aload_3         
		//   25   45:invokevirtual   #84  <Method int getOverlapPixelsForOffset(View)>
		//   26   48:isub            
		//   27   49:invokestatic    #90  <Method void ViewCompat.offsetTopAndBottom(View, int)>
			}
		//   28   52:return          
		}

		AppBarLayout findFirstDependency(List list)
		{
			int j = list.size();
		//    0    0:aload_1         
		//    1    1:invokeinterface #97  <Method int List.size()>
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
		//   10   16:invokeinterface #101 <Method Object List.get(int)>
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
		//    2    2:invokevirtual   #106 <Method AppBarLayout findFirstDependency(List)>
		//    3    5:areturn         
		}

		public volatile int getLeftAndRightOffset()
		{
			return super.getLeftAndRightOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #109 <Method int HeaderScrollingViewBehavior.getLeftAndRightOffset()>
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
		//    7   13:invokevirtual   #114 <Method int AppBarLayout.getTotalScrollRange()>
		//    8   16:istore_3        
				int k = ((AppBarLayout) (view)).getDownNestedPreScrollRange();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #117 <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   11   21:istore          4
				int i = getAppBarLayoutOffset(((AppBarLayout) (view)));
		//   12   23:aload_1         
		//   13   24:invokestatic    #119 <Method int getAppBarLayoutOffset(AppBarLayout)>
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
					return 1.0F + (float)i / (float)j;
		//   30   52:fconst_1        
		//   31   53:iload_2         
		//   32   54:i2f             
		//   33   55:iload_3         
		//   34   56:i2f             
		//   35   57:fdiv            
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
		//    5   11:invokevirtual   #114 <Method int AppBarLayout.getTotalScrollRange()>
		//    6   14:ireturn         
			else
				return super.getScrollRange(view);
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:invokespecial   #122 <Method int HeaderScrollingViewBehavior.getScrollRange(View)>
		//   10   20:ireturn         
		}

		public volatile int getTopAndBottomOffset()
		{
			return super.getTopAndBottomOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #125 <Method int HeaderScrollingViewBehavior.getTopAndBottomOffset()>
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
			offsetChildAsNeeded(coordinatorlayout, view, view1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #130 <Method void offsetChildAsNeeded(CoordinatorLayout, View, View)>
			return false;
		//    5    7:iconst_0        
		//    6    8:ireturn         
		}

		public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
		{
			return super.onLayoutChild(coordinatorlayout, view, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #134 <Method boolean HeaderScrollingViewBehavior.onLayoutChild(CoordinatorLayout, View, int)>
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
		//    7   10:invokespecial   #138 <Method boolean HeaderScrollingViewBehavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
		//    8   13:ireturn         
		}

		public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorlayout, View view, Rect rect, boolean flag)
		{
			AppBarLayout appbarlayout = findFirstDependency(coordinatorlayout.getDependencies(view));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #146 <Method List CoordinatorLayout.getDependencies(View)>
		//    4    6:invokevirtual   #106 <Method AppBarLayout findFirstDependency(List)>
		//    5    9:astore          5
			if(appbarlayout != null)
		//*   6   11:aload           5
		//*   7   13:ifnull          67
			{
				rect.offset(view.getLeft(), view.getTop());
		//    8   16:aload_3         
		//    9   17:aload_2         
		//   10   18:invokevirtual   #149 <Method int View.getLeft()>
		//   11   21:aload_2         
		//   12   22:invokevirtual   #73  <Method int View.getTop()>
		//   13   25:invokevirtual   #155 <Method void Rect.offset(int, int)>
				view = ((View) (mTempRect1));
		//   14   28:aload_0         
		//   15   29:getfield        #159 <Field Rect mTempRect1>
		//   16   32:astore_2        
				((Rect) (view)).set(0, 0, coordinatorlayout.getWidth(), coordinatorlayout.getHeight());
		//   17   33:aload_2         
		//   18   34:iconst_0        
		//   19   35:iconst_0        
		//   20   36:aload_1         
		//   21   37:invokevirtual   #162 <Method int CoordinatorLayout.getWidth()>
		//   22   40:aload_1         
		//   23   41:invokevirtual   #165 <Method int CoordinatorLayout.getHeight()>
		//   24   44:invokevirtual   #169 <Method void Rect.set(int, int, int, int)>
				if(!((Rect) (view)).contains(rect))
		//*  25   47:aload_2         
		//*  26   48:aload_3         
		//*  27   49:invokevirtual   #173 <Method boolean Rect.contains(Rect)>
		//*  28   52:ifne            67
				{
					appbarlayout.setExpanded(false, flag ^ true);
		//   29   55:aload           5
		//   30   57:iconst_0        
		//   31   58:iload           4
		//   32   60:iconst_1        
		//   33   61:ixor            
		//   34   62:invokevirtual   #177 <Method void AppBarLayout.setExpanded(boolean, boolean)>
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
		//    2    2:invokespecial   #181 <Method boolean HeaderScrollingViewBehavior.setLeftAndRightOffset(int)>
		//    3    5:ireturn         
		}

		public volatile boolean setTopAndBottomOffset(int i)
		{
			return super.setTopAndBottomOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #184 <Method boolean HeaderScrollingViewBehavior.setTopAndBottomOffset(int)>
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
	//    3    3:invokespecial   #67  <Method void AppBarLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppBarLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #69  <Method void LinearLayout(Context, AttributeSet)>
		mTotalScrollRange = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #71  <Field int mTotalScrollRange>
		mDownPreScrollRange = -1;
	//    7   11:aload_0         
	//    8   12:iconst_m1       
	//    9   13:putfield        #73  <Field int mDownPreScrollRange>
		mDownScrollRange = -1;
	//   10   16:aload_0         
	//   11   17:iconst_m1       
	//   12   18:putfield        #75  <Field int mDownScrollRange>
		mPendingAction = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #77  <Field int mPendingAction>
		setOrientation(1);
	//   16   26:aload_0         
	//   17   27:iconst_1        
	//   18   28:invokevirtual   #81  <Method void setOrientation(int)>
		ThemeUtils.checkAppCompatTheme(context);
	//   19   31:aload_1         
	//   20   32:invokestatic    #86  <Method void ThemeUtils.checkAppCompatTheme(Context)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  21   35:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   38:bipush          21
	//*  23   40:icmplt          56
		{
			ViewUtilsLollipop.setBoundsViewOutlineProvider(((View) (this)));
	//   24   43:aload_0         
	//   25   44:invokestatic    #97  <Method void ViewUtilsLollipop.setBoundsViewOutlineProvider(View)>
			ViewUtilsLollipop.setStateListAnimatorFromAttrs(((View) (this)), attributeset, 0, android.support.design.R.style.Widget_Design_AppBarLayout);
	//   26   47:aload_0         
	//   27   48:aload_2         
	//   28   49:iconst_0        
	//   29   50:getstatic       #102 <Field int android.support.design.R$style.Widget_Design_AppBarLayout>
	//   30   53:invokestatic    #106 <Method void ViewUtilsLollipop.setStateListAnimatorFromAttrs(View, AttributeSet, int, int)>
		}
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.AppBarLayout, 0, android.support.design.R.style.Widget_Design_AppBarLayout)));
	//   31   56:aload_1         
	//   32   57:aload_2         
	//   33   58:getstatic       #111 <Field int[] android.support.design.R$styleable.AppBarLayout>
	//   34   61:iconst_0        
	//   35   62:getstatic       #102 <Field int android.support.design.R$style.Widget_Design_AppBarLayout>
	//   36   65:invokevirtual   #117 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   37   68:astore_1        
		ViewCompat.setBackground(((View) (this)), ((TypedArray) (context)).getDrawable(android.support.design.R.styleable.AppBarLayout_android_background));
	//   38   69:aload_0         
	//   39   70:aload_1         
	//   40   71:getstatic       #120 <Field int android.support.design.R$styleable.AppBarLayout_android_background>
	//   41   74:invokevirtual   #126 <Method android.graphics.drawable.Drawable TypedArray.getDrawable(int)>
	//   42   77:invokestatic    #132 <Method void ViewCompat.setBackground(View, android.graphics.drawable.Drawable)>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_expanded))
	//*  43   80:aload_1         
	//*  44   81:getstatic       #135 <Field int android.support.design.R$styleable.AppBarLayout_expanded>
	//*  45   84:invokevirtual   #139 <Method boolean TypedArray.hasValue(int)>
	//*  46   87:ifeq            104
			setExpanded(((TypedArray) (context)).getBoolean(android.support.design.R.styleable.AppBarLayout_expanded, false), false, false);
	//   47   90:aload_0         
	//   48   91:aload_1         
	//   49   92:getstatic       #135 <Field int android.support.design.R$styleable.AppBarLayout_expanded>
	//   50   95:iconst_0        
	//   51   96:invokevirtual   #143 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   52   99:iconst_0        
	//   53  100:iconst_0        
	//   54  101:invokespecial   #147 <Method void setExpanded(boolean, boolean, boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 21 && ((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_elevation))
	//*  55  104:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//*  56  107:bipush          21
	//*  57  109:icmplt          135
	//*  58  112:aload_1         
	//*  59  113:getstatic       #150 <Field int android.support.design.R$styleable.AppBarLayout_elevation>
	//*  60  116:invokevirtual   #139 <Method boolean TypedArray.hasValue(int)>
	//*  61  119:ifeq            135
			ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(((View) (this)), ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.AppBarLayout_elevation, 0));
	//   62  122:aload_0         
	//   63  123:aload_1         
	//   64  124:getstatic       #150 <Field int android.support.design.R$styleable.AppBarLayout_elevation>
	//   65  127:iconst_0        
	//   66  128:invokevirtual   #154 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   67  131:i2f             
	//   68  132:invokestatic    #158 <Method void ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(View, float)>
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*  69  135:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//*  70  138:bipush          26
	//*  71  140:icmplt          187
		{
			if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_android_keyboardNavigationCluster))
	//*  72  143:aload_1         
	//*  73  144:getstatic       #161 <Field int android.support.design.R$styleable.AppBarLayout_android_keyboardNavigationCluster>
	//*  74  147:invokevirtual   #139 <Method boolean TypedArray.hasValue(int)>
	//*  75  150:ifeq            165
				setKeyboardNavigationCluster(((TypedArray) (context)).getBoolean(android.support.design.R.styleable.AppBarLayout_android_keyboardNavigationCluster, false));
	//   76  153:aload_0         
	//   77  154:aload_1         
	//   78  155:getstatic       #161 <Field int android.support.design.R$styleable.AppBarLayout_android_keyboardNavigationCluster>
	//   79  158:iconst_0        
	//   80  159:invokevirtual   #143 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   81  162:invokevirtual   #165 <Method void setKeyboardNavigationCluster(boolean)>
			if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_android_touchscreenBlocksFocus))
	//*  82  165:aload_1         
	//*  83  166:getstatic       #168 <Field int android.support.design.R$styleable.AppBarLayout_android_touchscreenBlocksFocus>
	//*  84  169:invokevirtual   #139 <Method boolean TypedArray.hasValue(int)>
	//*  85  172:ifeq            187
				setTouchscreenBlocksFocus(((TypedArray) (context)).getBoolean(android.support.design.R.styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
	//   86  175:aload_0         
	//   87  176:aload_1         
	//   88  177:getstatic       #168 <Field int android.support.design.R$styleable.AppBarLayout_android_touchscreenBlocksFocus>
	//   89  180:iconst_0        
	//   90  181:invokevirtual   #143 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   91  184:invokevirtual   #171 <Method void setTouchscreenBlocksFocus(boolean)>
		}
		((TypedArray) (context)).recycle();
	//   92  187:aload_1         
	//   93  188:invokevirtual   #175 <Method void TypedArray.recycle()>
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
	//   94  191:aload_0         
	//   95  192:new             #6   <Class AppBarLayout$1>
	//   96  195:dup             
	//   97  196:aload_0         
	//   98  197:invokespecial   #178 <Method void AppBarLayout$1(AppBarLayout)>
	//   99  200:invokestatic    #182 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//  100  203:return          
	}

	private void invalidateScrollRanges()
	{
		mTotalScrollRange = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #71  <Field int mTotalScrollRange>
		mDownPreScrollRange = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #73  <Field int mDownPreScrollRange>
		mDownScrollRange = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #75  <Field int mDownScrollRange>
	//    9   15:return          
	}

	private boolean setCollapsibleState(boolean flag)
	{
		if(mCollapsible != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #187 <Field boolean mCollapsible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			mCollapsible = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #187 <Field boolean mCollapsible>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #190 <Method void refreshDrawableState()>
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
		mPendingAction = byte0 | byte1 | byte2;
	//   20   37:aload_0         
	//   21   38:iload           4
	//   22   40:iload           5
	//   23   42:ior             
	//   24   43:iload           6
	//   25   45:ior             
	//   26   46:putfield        #77  <Field int mPendingAction>
		requestLayout();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #193 <Method void requestLayout()>
	//   29   53:return          
	}

	private void updateCollapsible()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #198 <Method int getChildCount()>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//    7   10:iload           4
	//    8   12:istore_3        
			if(i >= j)
				break;
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:icmpge          47
			if(((LayoutParams)getChildAt(i).getLayoutParams()).isCollapsible())
	//*  12   18:aload_0         
	//*  13   19:iload_1         
	//*  14   20:invokevirtual   #202 <Method View getChildAt(int)>
	//*  15   23:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  16   26:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//*  17   29:invokevirtual   #212 <Method boolean AppBarLayout$LayoutParams.isCollapsible()>
	//*  18   32:ifeq            40
			{
				flag = true;
	//   19   35:iconst_1        
	//   20   36:istore_3        
				break;
	//   21   37:goto            47
			}
			i++;
	//   22   40:iload_1         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_1        
		} while(true);
	//   26   44:goto            10
		setCollapsibleState(flag);
	//   27   47:aload_0         
	//   28   48:iload_3         
	//   29   49:invokespecial   #214 <Method boolean setCollapsibleState(boolean)>
	//   30   52:pop             
	//   31   53:return          
	}

	public void addOnOffsetChangedListener(OnOffsetChangedListener onoffsetchangedlistener)
	{
		if(mListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field List mListeners>
	//*   2    4:ifnonnull       18
			mListeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #220 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #222 <Method void ArrayList()>
	//    7   15:putfield        #218 <Field List mListeners>
		if(onoffsetchangedlistener != null && !mListeners.contains(((Object) (onoffsetchangedlistener))))
	//*   8   18:aload_1         
	//*   9   19:ifnull          46
	//*  10   22:aload_0         
	//*  11   23:getfield        #218 <Field List mListeners>
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #228 <Method boolean List.contains(Object)>
	//*  14   32:ifne            46
			mListeners.add(((Object) (onoffsetchangedlistener)));
	//   15   35:aload_0         
	//   16   36:getfield        #218 <Field List mListeners>
	//   17   39:aload_1         
	//   18   40:invokeinterface #231 <Method boolean List.add(Object)>
	//   19   45:pop             
	//   20   46:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #21  <Class AppBarLayout$LayoutParams>
	//    2    4:ireturn         
	}

	void dispatchOffsetUpdates(int i)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field List mListeners>
	//*   2    4:ifnull          60
		{
			int j = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(int k = mListeners.size(); j < k; j++)
	//*   5    9:aload_0         
	//*   6   10:getfield        #218 <Field List mListeners>
	//*   7   13:invokeinterface #237 <Method int List.size()>
	//*   8   18:istore_3        
	//*   9   19:iload_2         
	//*  10   20:iload_3         
	//*  11   21:icmpge          60
			{
				OnOffsetChangedListener onoffsetchangedlistener = (OnOffsetChangedListener)mListeners.get(j);
	//   12   24:aload_0         
	//   13   25:getfield        #218 <Field List mListeners>
	//   14   28:iload_2         
	//   15   29:invokeinterface #241 <Method Object List.get(int)>
	//   16   34:checkcast       #27  <Class AppBarLayout$OnOffsetChangedListener>
	//   17   37:astore          4
				if(onoffsetchangedlistener != null)
	//*  18   39:aload           4
	//*  19   41:ifnull          53
					onoffsetchangedlistener.onOffsetChanged(this, i);
	//   20   44:aload           4
	//   21   46:aload_0         
	//   22   47:iload_1         
	//   23   48:invokeinterface #245 <Method void AppBarLayout$OnOffsetChangedListener.onOffsetChanged(AppBarLayout, int)>
			}

	//   24   53:iload_2         
	//   25   54:iconst_1        
	//   26   55:iadd            
	//   27   56:istore_2        
		}
	//*  28   57:goto            19
	//   29   60:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-1, -2);
	//    0    0:new             #21  <Class AppBarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:bipush          -2
	//    4    7:invokespecial   #250 <Method void AppBarLayout$LayoutParams(int, int)>
	//    5   10:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method AppBarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	protected volatile android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.widget.LinearLayout.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #252 <Method AppBarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #21  <Class AppBarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #259 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #260 <Method void AppBarLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19 && (layoutparams instanceof android.widget.LinearLayout.LayoutParams))
	//*   0    0:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          27
	//*   3    8:aload_1         
	//*   4    9:instanceof      #263 <Class android.widget.LinearLayout$LayoutParams>
	//*   5   12:ifeq            27
			return new LayoutParams((android.widget.LinearLayout.LayoutParams)layoutparams);
	//    6   15:new             #21  <Class AppBarLayout$LayoutParams>
	//    7   18:dup             
	//    8   19:aload_1         
	//    9   20:checkcast       #263 <Class android.widget.LinearLayout$LayoutParams>
	//   10   23:invokespecial   #266 <Method void AppBarLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
	//   11   26:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  12   27:aload_1         
	//*  13   28:instanceof      #268 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  14   31:ifeq            46
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   15   34:new             #21  <Class AppBarLayout$LayoutParams>
	//   16   37:dup             
	//   17   38:aload_1         
	//   18   39:checkcast       #268 <Class android.view.ViewGroup$MarginLayoutParams>
	//   19   42:invokespecial   #271 <Method void AppBarLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   20   45:areturn         
		else
			return new LayoutParams(layoutparams);
	//   21   46:new             #21  <Class AppBarLayout$LayoutParams>
	//   22   49:dup             
	//   23   50:aload_1         
	//   24   51:invokespecial   #274 <Method void AppBarLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   25   54:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #277 <Method AppBarLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #280 <Method AppBarLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.widget.LinearLayout.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #277 <Method AppBarLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.widget.LinearLayout.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #280 <Method AppBarLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	int getDownNestedPreScrollRange()
	{
		if(mDownPreScrollRange != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int mDownPreScrollRange>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return mDownPreScrollRange;
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field int mDownPreScrollRange>
	//    6   12:ireturn         
		int k = getChildCount() - 1;
	//    7   13:aload_0         
	//    8   14:invokevirtual   #198 <Method int getChildCount()>
	//    9   17:iconst_1        
	//   10   18:isub            
	//   11   19:istore_2        
		int i;
		int l;
		for(l = 0; k >= 0; l = i)
	//*  12   20:iconst_0        
	//*  13   21:istore_3        
	//*  14   22:iload_2         
	//*  15   23:iflt            147
		{
			View view = getChildAt(k);
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:invokevirtual   #202 <Method View getChildAt(int)>
	//   19   31:astore          5
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   20   33:aload           5
	//   21   35:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   38:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   23   41:astore          6
			i = view.getMeasuredHeight();
	//   24   43:aload           5
	//   25   45:invokevirtual   #286 <Method int View.getMeasuredHeight()>
	//   26   48:istore_1        
			int i1 = layoutparams.mScrollFlags;
	//   27   49:aload           6
	//   28   51:getfield        #289 <Field int AppBarLayout$LayoutParams.mScrollFlags>
	//   29   54:istore          4
			if((i1 & 5) == 5)
	//*  30   56:iload           4
	//*  31   58:iconst_5        
	//*  32   59:iand            
	//*  33   60:iconst_5        
	//*  34   61:icmpne          129
			{
				l += layoutparams.topMargin + layoutparams.bottomMargin;
	//   35   64:iload_3         
	//   36   65:aload           6
	//   37   67:getfield        #292 <Field int AppBarLayout$LayoutParams.topMargin>
	//   38   70:aload           6
	//   39   72:getfield        #295 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   40   75:iadd            
	//   41   76:iadd            
	//   42   77:istore_3        
				if((i1 & 8) != 0)
	//*  43   78:iload           4
	//*  44   80:bipush          8
	//*  45   82:iand            
	//*  46   83:ifeq            97
					i = l + ViewCompat.getMinimumHeight(view);
	//   47   86:iload_3         
	//   48   87:aload           5
	//   49   89:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
	//   50   92:iadd            
	//   51   93:istore_1        
				else
	//*  52   94:goto            138
				if((i1 & 2) != 0)
	//*  53   97:iload           4
	//*  54   99:iconst_2        
	//*  55  100:iand            
	//*  56  101:ifeq            117
					i = l + (i - ViewCompat.getMinimumHeight(view));
	//   57  104:iload_3         
	//   58  105:iload_1         
	//   59  106:aload           5
	//   60  108:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
	//   61  111:isub            
	//   62  112:iadd            
	//   63  113:istore_1        
				else
	//*  64  114:goto            138
					i = l + (i - getTopInset());
	//   65  117:iload_3         
	//   66  118:iload_1         
	//   67  119:aload_0         
	//   68  120:invokevirtual   #302 <Method int getTopInset()>
	//   69  123:isub            
	//   70  124:iadd            
	//   71  125:istore_1        
			} else
	//*  72  126:goto            138
			{
				i = l;
	//   73  129:iload_3         
	//   74  130:istore_1        
				if(l > 0)
	//*  75  131:iload_3         
	//*  76  132:ifle            138
					break;
	//   77  135:goto            147
			}
			k--;
	//   78  138:iload_2         
	//   79  139:iconst_1        
	//   80  140:isub            
	//   81  141:istore_2        
		}

	//   82  142:iload_1         
	//   83  143:istore_3        
	//*  84  144:goto            22
		int j = Math.max(0, l);
	//   85  147:iconst_0        
	//   86  148:iload_3         
	//   87  149:invokestatic    #307 <Method int Math.max(int, int)>
	//   88  152:istore_1        
		mDownPreScrollRange = j;
	//   89  153:aload_0         
	//   90  154:iload_1         
	//   91  155:putfield        #73  <Field int mDownPreScrollRange>
		return j;
	//   92  158:iload_1         
	//   93  159:ireturn         
	}

	int getDownNestedScrollRange()
	{
		if(mDownScrollRange != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field int mDownScrollRange>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return mDownScrollRange;
	//    4    8:aload_0         
	//    5    9:getfield        #75  <Field int mDownScrollRange>
	//    6   12:ireturn         
		int l = getChildCount();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #198 <Method int getChildCount()>
	//    9   17:istore          4
		int j = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		int i = j;
	//   12   21:iload_2         
	//   13   22:istore_1        
		int k;
		do
		{
			k = i;
	//   14   23:iload_1         
	//   15   24:istore_3        
			if(j >= l)
				break;
	//   16   25:iload_2         
	//   17   26:iload           4
	//   18   28:icmpge          126
			View view = getChildAt(j);
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #202 <Method View getChildAt(int)>
	//   22   36:astore          9
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   38:aload           9
	//   24   40:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   43:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   26   46:astore          10
			int j1 = view.getMeasuredHeight();
	//   27   48:aload           9
	//   28   50:invokevirtual   #286 <Method int View.getMeasuredHeight()>
	//   29   53:istore          6
			int k1 = layoutparams.topMargin;
	//   30   55:aload           10
	//   31   57:getfield        #292 <Field int AppBarLayout$LayoutParams.topMargin>
	//   32   60:istore          7
			int l1 = layoutparams.bottomMargin;
	//   33   62:aload           10
	//   34   64:getfield        #295 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   35   67:istore          8
			int i1 = layoutparams.mScrollFlags;
	//   36   69:aload           10
	//   37   71:getfield        #289 <Field int AppBarLayout$LayoutParams.mScrollFlags>
	//   38   74:istore          5
			k = i;
	//   39   76:iload_1         
	//   40   77:istore_3        
			if((i1 & 1) == 0)
				break;
	//   41   78:iload           5
	//   42   80:iconst_1        
	//   43   81:iand            
	//   44   82:ifeq            126
			i += j1 + (k1 + l1);
	//   45   85:iload_1         
	//   46   86:iload           6
	//   47   88:iload           7
	//   48   90:iload           8
	//   49   92:iadd            
	//   50   93:iadd            
	//   51   94:iadd            
	//   52   95:istore_1        
			if((i1 & 2) != 0)
	//*  53   96:iload           5
	//*  54   98:iconst_2        
	//*  55   99:iand            
	//*  56  100:ifeq            119
			{
				k = i - (ViewCompat.getMinimumHeight(view) + getTopInset());
	//   57  103:iload_1         
	//   58  104:aload           9
	//   59  106:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
	//   60  109:aload_0         
	//   61  110:invokevirtual   #302 <Method int getTopInset()>
	//   62  113:iadd            
	//   63  114:isub            
	//   64  115:istore_3        
				break;
	//   65  116:goto            126
			}
			j++;
	//   66  119:iload_2         
	//   67  120:iconst_1        
	//   68  121:iadd            
	//   69  122:istore_2        
		} while(true);
	//   70  123:goto            23
		i = Math.max(0, k);
	//   71  126:iconst_0        
	//   72  127:iload_3         
	//   73  128:invokestatic    #307 <Method int Math.max(int, int)>
	//   74  131:istore_1        
		mDownScrollRange = i;
	//   75  132:aload_0         
	//   76  133:iload_1         
	//   77  134:putfield        #75  <Field int mDownScrollRange>
		return i;
	//   78  137:iload_1         
	//   79  138:ireturn         
	}

	final int getMinimumHeightForVisibleOverlappingContent()
	{
		int j = getTopInset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #302 <Method int getTopInset()>
	//    2    4:istore_2        
		int i = ViewCompat.getMinimumHeight(((View) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
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
	//   15   21:invokevirtual   #198 <Method int getChildCount()>
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
	//   24   34:invokevirtual   #202 <Method View getChildAt(int)>
	//   25   37:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
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
	//   39   57:invokevirtual   #312 <Method int getHeight()>
	//   40   60:iconst_3        
	//   41   61:idiv            
	//   42   62:ireturn         
	}

	int getPendingAction()
	{
		return mPendingAction;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int mPendingAction>
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
		if(mLastInsets != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #320 <Field WindowInsetsCompat mLastInsets>
	//*   2    4:ifnull          15
			return mLastInsets.getSystemWindowInsetTop();
	//    3    7:aload_0         
	//    4    8:getfield        #320 <Field WindowInsetsCompat mLastInsets>
	//    5   11:invokevirtual   #325 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public final int getTotalScrollRange()
	{
		if(mTotalScrollRange != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int mTotalScrollRange>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return mTotalScrollRange;
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field int mTotalScrollRange>
	//    6   12:ireturn         
		int l = getChildCount();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #198 <Method int getChildCount()>
	//    9   17:istore          4
		int j = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		int i = j;
	//   12   21:iload_2         
	//   13   22:istore_1        
		int k;
		do
		{
			k = i;
	//   14   23:iload_1         
	//   15   24:istore_3        
			if(j >= l)
				break;
	//   16   25:iload_2         
	//   17   26:iload           4
	//   18   28:icmpge          113
			View view = getChildAt(j);
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #202 <Method View getChildAt(int)>
	//   22   36:astore          7
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   38:aload           7
	//   24   40:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   43:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   26   46:astore          8
			int j1 = view.getMeasuredHeight();
	//   27   48:aload           7
	//   28   50:invokevirtual   #286 <Method int View.getMeasuredHeight()>
	//   29   53:istore          6
			int i1 = layoutparams.mScrollFlags;
	//   30   55:aload           8
	//   31   57:getfield        #289 <Field int AppBarLayout$LayoutParams.mScrollFlags>
	//   32   60:istore          5
			k = i;
	//   33   62:iload_1         
	//   34   63:istore_3        
			if((i1 & 1) == 0)
				break;
	//   35   64:iload           5
	//   36   66:iconst_1        
	//   37   67:iand            
	//   38   68:ifeq            113
			i += j1 + layoutparams.topMargin + layoutparams.bottomMargin;
	//   39   71:iload_1         
	//   40   72:iload           6
	//   41   74:aload           8
	//   42   76:getfield        #292 <Field int AppBarLayout$LayoutParams.topMargin>
	//   43   79:iadd            
	//   44   80:aload           8
	//   45   82:getfield        #295 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   46   85:iadd            
	//   47   86:iadd            
	//   48   87:istore_1        
			if((i1 & 2) != 0)
	//*  49   88:iload           5
	//*  50   90:iconst_2        
	//*  51   91:iand            
	//*  52   92:ifeq            106
			{
				k = i - ViewCompat.getMinimumHeight(view);
	//   53   95:iload_1         
	//   54   96:aload           7
	//   55   98:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
	//   56  101:isub            
	//   57  102:istore_3        
				break;
	//   58  103:goto            113
			}
			j++;
	//   59  106:iload_2         
	//   60  107:iconst_1        
	//   61  108:iadd            
	//   62  109:istore_2        
		} while(true);
	//   63  110:goto            23
		i = Math.max(0, k - getTopInset());
	//   64  113:iconst_0        
	//   65  114:iload_3         
	//   66  115:aload_0         
	//   67  116:invokevirtual   #302 <Method int getTopInset()>
	//   68  119:isub            
	//   69  120:invokestatic    #307 <Method int Math.max(int, int)>
	//   70  123:istore_1        
		mTotalScrollRange = i;
	//   71  124:aload_0         
	//   72  125:iload_1         
	//   73  126:putfield        #71  <Field int mTotalScrollRange>
		return i;
	//   74  129:iload_1         
	//   75  130:ireturn         
	}

	int getUpNestedPreScrollRange()
	{
		return getTotalScrollRange();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method int getTotalScrollRange()>
	//    2    4:ireturn         
	}

	boolean hasChildWithInterpolator()
	{
		return mHaveChildWithInterpolator;
	//    0    0:aload_0         
	//    1    1:getfield        #333 <Field boolean mHaveChildWithInterpolator>
	//    2    4:ireturn         
	}

	boolean hasScrollableChildren()
	{
		return getTotalScrollRange() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method int getTotalScrollRange()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected int[] onCreateDrawableState(int i)
	{
		if(mTmpStatesArray == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #338 <Field int[] mTmpStatesArray>
	//*   2    4:ifnonnull       14
			mTmpStatesArray = new int[2];
	//    3    7:aload_0         
	//    4    8:iconst_2        
	//    5    9:newarray        int[]
	//    6   11:putfield        #338 <Field int[] mTmpStatesArray>
		int ai[] = mTmpStatesArray;
	//    7   14:aload_0         
	//    8   15:getfield        #338 <Field int[] mTmpStatesArray>
	//    9   18:astore_2        
		int ai1[] = super.onCreateDrawableState(i + ai.length);
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:aload_2         
	//   13   22:arraylength     
	//   14   23:iadd            
	//   15   24:invokespecial   #340 <Method int[] LinearLayout.onCreateDrawableState(int)>
	//   16   27:astore_3        
		if(mCollapsible)
	//*  17   28:aload_0         
	//*  18   29:getfield        #187 <Field boolean mCollapsible>
	//*  19   32:ifeq            42
			i = android.support.design.R.attr.state_collapsible;
	//   20   35:getstatic       #345 <Field int android.support.design.R$attr.state_collapsible>
	//   21   38:istore_1        
		else
	//*  22   39:goto            47
			i = -android.support.design.R.attr.state_collapsible;
	//   23   42:getstatic       #345 <Field int android.support.design.R$attr.state_collapsible>
	//   24   45:ineg            
	//   25   46:istore_1        
		ai[0] = i;
	//   26   47:aload_2         
	//   27   48:iconst_0        
	//   28   49:iload_1         
	//   29   50:iastore         
		if(mCollapsible && mCollapsed)
	//*  30   51:aload_0         
	//*  31   52:getfield        #187 <Field boolean mCollapsible>
	//*  32   55:ifeq            72
	//*  33   58:aload_0         
	//*  34   59:getfield        #347 <Field boolean mCollapsed>
	//*  35   62:ifeq            72
			i = android.support.design.R.attr.state_collapsed;
	//   36   65:getstatic       #350 <Field int android.support.design.R$attr.state_collapsed>
	//   37   68:istore_1        
		else
	//*  38   69:goto            77
			i = -android.support.design.R.attr.state_collapsed;
	//   39   72:getstatic       #350 <Field int android.support.design.R$attr.state_collapsed>
	//   40   75:ineg            
	//   41   76:istore_1        
		ai[1] = i;
	//   42   77:aload_2         
	//   43   78:iconst_1        
	//   44   79:iload_1         
	//   45   80:iastore         
		return mergeDrawableStates(ai1, ai);
	//   46   81:aload_3         
	//   47   82:aload_2         
	//   48   83:invokestatic    #354 <Method int[] mergeDrawableStates(int[], int[])>
	//   49   86:areturn         
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
	//    6    8:invokespecial   #358 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		invalidateScrollRanges();
	//    7   11:aload_0         
	//    8   12:invokespecial   #360 <Method void invalidateScrollRanges()>
		i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		mHaveChildWithInterpolator = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #333 <Field boolean mHaveChildWithInterpolator>
		j = getChildCount();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #198 <Method int getChildCount()>
	//   16   26:istore_3        
		do
		{
			if(i >= j)
				break;
	//   17   27:iload_2         
	//   18   28:iload_3         
	//   19   29:icmpge          64
			if(((LayoutParams)getChildAt(i).getLayoutParams()).getScrollInterpolator() != null)
	//*  20   32:aload_0         
	//*  21   33:iload_2         
	//*  22   34:invokevirtual   #202 <Method View getChildAt(int)>
	//*  23   37:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  24   40:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//*  25   43:invokevirtual   #364 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
	//*  26   46:ifnull          57
			{
				mHaveChildWithInterpolator = true;
	//   27   49:aload_0         
	//   28   50:iconst_1        
	//   29   51:putfield        #333 <Field boolean mHaveChildWithInterpolator>
				break;
	//   30   54:goto            64
			}
			i++;
	//   31   57:iload_2         
	//   32   58:iconst_1        
	//   33   59:iadd            
	//   34   60:istore_2        
		} while(true);
	//   35   61:goto            27
		updateCollapsible();
	//   36   64:aload_0         
	//   37   65:invokespecial   #366 <Method void updateCollapsible()>
	//   38   68:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #369 <Method void LinearLayout.onMeasure(int, int)>
		invalidateScrollRanges();
	//    4    6:aload_0         
	//    5    7:invokespecial   #360 <Method void invalidateScrollRanges()>
	//    6   10:return          
	}

	WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat windowinsetscompat)
	{
		WindowInsetsCompat windowinsetscompat1;
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #375 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   2    4:ifeq            12
			windowinsetscompat1 = windowinsetscompat;
	//    3    7:aload_1         
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			windowinsetscompat1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		if(!ObjectsCompat.equals(((Object) (mLastInsets)), ((Object) (windowinsetscompat1))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #320 <Field WindowInsetsCompat mLastInsets>
	//*  10   18:aload_2         
	//*  11   19:invokestatic    #381 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  12   22:ifne            34
		{
			mLastInsets = windowinsetscompat1;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #320 <Field WindowInsetsCompat mLastInsets>
			invalidateScrollRanges();
	//   16   30:aload_0         
	//   17   31:invokespecial   #360 <Method void invalidateScrollRanges()>
		}
		return windowinsetscompat;
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	public void removeOnOffsetChangedListener(OnOffsetChangedListener onoffsetchangedlistener)
	{
		if(mListeners != null && onoffsetchangedlistener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field List mListeners>
	//*   2    4:ifnull          22
	//*   3    7:aload_1         
	//*   4    8:ifnull          22
			mListeners.remove(((Object) (onoffsetchangedlistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #218 <Field List mListeners>
	//    7   15:aload_1         
	//    8   16:invokeinterface #385 <Method boolean List.remove(Object)>
	//    9   21:pop             
	//   10   22:return          
	}

	void resetPendingAction()
	{
		mPendingAction = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #77  <Field int mPendingAction>
	//    3    5:return          
	}

	boolean setCollapsedState(boolean flag)
	{
		if(mCollapsed != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #347 <Field boolean mCollapsed>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			mCollapsed = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #347 <Field boolean mCollapsed>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #190 <Method void refreshDrawableState()>
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

	public void setExpanded(boolean flag)
	{
		setExpanded(flag, ViewCompat.isLaidOut(((View) (this))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokestatic    #390 <Method boolean ViewCompat.isLaidOut(View)>
	//    4    6:invokevirtual   #393 <Method void setExpanded(boolean, boolean)>
	//    5    9:return          
	}

	public void setExpanded(boolean flag, boolean flag1)
	{
		setExpanded(flag, flag1, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:invokespecial   #147 <Method void setExpanded(boolean, boolean, boolean)>
	//    5    7:return          
	}

	public void setOrientation(int i)
	{
		if(i != 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          16
		{
			throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
	//    3    5:new             #395 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc2            #397 <String "AppBarLayout is always vertical and does not support horizontal orientation">
	//    6   12:invokespecial   #400 <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		} else
		{
			super.setOrientation(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #401 <Method void LinearLayout.setOrientation(int)>
			return;
	//   11   21:return          
		}
	}

	public void setTargetElevation(float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(((View) (this)), f);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:invokestatic    #158 <Method void ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(View, float)>
	//    6   13:return          
	}

	private static final int INVALID_SCROLL_RANGE = -1;
	static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
	static final int PENDING_ACTION_COLLAPSED = 2;
	static final int PENDING_ACTION_EXPANDED = 1;
	static final int PENDING_ACTION_FORCE = 8;
	static final int PENDING_ACTION_NONE = 0;
	private boolean mCollapsed;
	private boolean mCollapsible;
	private int mDownPreScrollRange;
	private int mDownScrollRange;
	private boolean mHaveChildWithInterpolator;
	private WindowInsetsCompat mLastInsets;
	private List mListeners;
	private int mPendingAction;
	private int mTmpStatesArray[];
	private int mTotalScrollRange;
}
