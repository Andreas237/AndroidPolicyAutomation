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
		//*  12   22:ifle            51
				j = Math.round(1000F * ((float)j / f)) * 3;
		//   13   25:ldc1            #66  <Float 1000F>
		//   14   27:iload           5
		//   15   29:i2f             
		//   16   30:fload           4
		//   17   32:fdiv            
		//   18   33:fmul            
		//   19   34:invokestatic    #70  <Method int Math.round(float)>
		//   20   37:iconst_3        
		//   21   38:imul            
		//   22   39:istore          5
			else
		//*  23   41:aload_0         
		//*  24   42:aload_1         
		//*  25   43:aload_2         
		//*  26   44:iload_3         
		//*  27   45:iload           5
		//*  28   47:invokespecial   #74  <Method void animateOffsetWithDuration(CoordinatorLayout, AppBarLayout, int, int)>
		//*  29   50:return          
				j = (int)((1.0F + (float)j / (float)appbarlayout.getHeight()) * 150F);
		//   30   51:fconst_1        
		//   31   52:iload           5
		//   32   54:i2f             
		//   33   55:aload_2         
		//   34   56:invokevirtual   #77  <Method int AppBarLayout.getHeight()>
		//   35   59:i2f             
		//   36   60:fdiv            
		//   37   61:fadd            
		//   38   62:ldc1            #78  <Float 150F>
		//   39   64:fmul            
		//   40   65:f2i             
		//   41   66:istore          5
			animateOffsetWithDuration(coordinatorlayout, appbarlayout, i, j);
		//*  42   68:goto            41
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
		//*  19   41:ifnonnull       126
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
		//*  38   82:aload_0         
		//*  39   83:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//*  40   86:iload           4
		//*  41   88:sipush          600
		//*  42   91:invokestatic    #111 <Method int Math.min(int, int)>
		//*  43   94:i2l             
		//*  44   95:invokevirtual   #115 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//*  45   98:pop             
		//*  46   99:aload_0         
		//*  47  100:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//*  48  103:iconst_2        
		//*  49  104:newarray        int[]
		//*  50  106:dup             
		//*  51  107:iconst_0        
		//*  52  108:iload           5
		//*  53  110:iastore         
		//*  54  111:dup             
		//*  55  112:iconst_1        
		//*  56  113:iload_3         
		//*  57  114:iastore         
		//*  58  115:invokevirtual   #119 <Method void ValueAnimator.setIntValues(int[])>
		//*  59  118:aload_0         
		//*  60  119:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//*  61  122:invokevirtual   #122 <Method void ValueAnimator.start()>
		//*  62  125:return          
			{
				mOffsetAnimator.cancel();
		//   63  126:aload_0         
		//   64  127:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//   65  130:invokevirtual   #89  <Method void ValueAnimator.cancel()>
			}
			mOffsetAnimator.setDuration(Math.min(j, 600));
			mOffsetAnimator.setIntValues(new int[] {
				k, i
			});
			mOffsetAnimator.start();
		//*  66  133:goto            82
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
			i = 0;
		//    3    5:iconst_0        
		//    4    6:istore_1        
			for(int k = appbarlayout.getChildCount(); i < k; i++)
		//*   5    7:aload_0         
		//*   6    8:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
		//*   7   11:istore_3        
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
			int j = 0;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			for(int k = appbarlayout.getChildCount(); j < k; j++)
		//*   2    2:aload_1         
		//*   3    3:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
		//*   4    6:istore          4
		//*   5    8:iload_3         
		//*   6    9:iload           4
		//*   7   11:icmpge          50
			{
				View view = appbarlayout.getChildAt(j);
		//    8   14:aload_1         
		//    9   15:iload_3         
		//   10   16:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
		//   11   19:astore          5
				if(view.getTop() <= -i && view.getBottom() >= -i)
		//*  12   21:aload           5
		//*  13   23:invokevirtual   #138 <Method int View.getTop()>
		//*  14   26:iload_2         
		//*  15   27:ineg            
		//*  16   28:icmpgt          43
		//*  17   31:aload           5
		//*  18   33:invokevirtual   #141 <Method int View.getBottom()>
		//*  19   36:iload_2         
		//*  20   37:ineg            
		//*  21   38:icmplt          43
					return j;
		//   22   41:iload_3         
		//   23   42:ireturn         
			}

		//   24   43:iload_3         
		//   25   44:iconst_1        
		//   26   45:iadd            
		//   27   46:istore_3        
		//*  28   47:goto            8
			return -1;
		//   29   50:iconst_m1       
		//   30   51:ireturn         
		}

		private int interpolateOffset(AppBarLayout appbarlayout, int i)
		{
			int l = Math.abs(i);
		//    0    0:iload_2         
		//    1    1:invokestatic    #62  <Method int Math.abs(int)>
		//    2    4:istore          5
			int k = 0;
		//    3    6:iconst_0        
		//    4    7:istore          4
			int i1 = appbarlayout.getChildCount();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
		//    7   13:istore          6
			do
			{
label0:
				{
					int j = i;
		//    8   15:iload_2         
		//    9   16:istore_3        
					if(k < i1)
		//*  10   17:iload           4
		//*  11   19:iload           6
		//*  12   21:icmpge          201
					{
						View view = appbarlayout.getChildAt(k);
		//   13   24:aload_1         
		//   14   25:iload           4
		//   15   27:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
		//   16   30:astore          7
						LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   17   32:aload           7
		//   18   34:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   19   37:checkcast       #150 <Class AppBarLayout$LayoutParams>
		//   20   40:astore          8
						Interpolator interpolator = layoutparams.getScrollInterpolator();
		//   21   42:aload           8
		//   22   44:invokevirtual   #154 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
		//   23   47:astore          9
						if(l < view.getTop() || l > view.getBottom())
							break label0;
		//   24   49:iload           5
		//   25   51:aload           7
		//   26   53:invokevirtual   #138 <Method int View.getTop()>
		//   27   56:icmplt          203
		//   28   59:iload           5
		//   29   61:aload           7
		//   30   63:invokevirtual   #141 <Method int View.getBottom()>
		//   31   66:icmpgt          203
						j = i;
		//   32   69:iload_2         
		//   33   70:istore_3        
						if(interpolator != null)
		//*  34   71:aload           9
		//*  35   73:ifnull          201
						{
							j = 0;
		//   36   76:iconst_0        
		//   37   77:istore_3        
							int j1 = layoutparams.getScrollFlags();
		//   38   78:aload           8
		//   39   80:invokevirtual   #157 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//   40   83:istore          6
							if((j1 & 1) != 0)
		//*  41   85:iload           6
		//*  42   87:iconst_1        
		//*  43   88:iand            
		//*  44   89:ifeq            132
							{
								k = 0 + (view.getHeight() + layoutparams.topMargin + layoutparams.bottomMargin);
		//   45   92:iconst_0        
		//   46   93:aload           7
		//   47   95:invokevirtual   #158 <Method int View.getHeight()>
		//   48   98:aload           8
		//   49  100:getfield        #161 <Field int AppBarLayout$LayoutParams.topMargin>
		//   50  103:iadd            
		//   51  104:aload           8
		//   52  106:getfield        #164 <Field int AppBarLayout$LayoutParams.bottomMargin>
		//   53  109:iadd            
		//   54  110:iadd            
		//   55  111:istore          4
								j = k;
		//   56  113:iload           4
		//   57  115:istore_3        
								if((j1 & 2) != 0)
		//*  58  116:iload           6
		//*  59  118:iconst_2        
		//*  60  119:iand            
		//*  61  120:ifeq            132
									j = k - ViewCompat.getMinimumHeight(view);
		//   62  123:iload           4
		//   63  125:aload           7
		//   64  127:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//   65  130:isub            
		//   66  131:istore_3        
							}
							k = j;
		//   67  132:iload_3         
		//   68  133:istore          4
							if(ViewCompat.getFitsSystemWindows(view))
		//*  69  135:aload           7
		//*  70  137:invokestatic    #174 <Method boolean ViewCompat.getFitsSystemWindows(View)>
		//*  71  140:ifeq            151
								k = j - appbarlayout.getTopInset();
		//   72  143:iload_3         
		//   73  144:aload_1         
		//   74  145:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
		//   75  148:isub            
		//   76  149:istore          4
							j = i;
		//   77  151:iload_2         
		//   78  152:istore_3        
							if(k > 0)
		//*  79  153:iload           4
		//*  80  155:ifle            201
							{
								j = view.getTop();
		//   81  158:aload           7
		//   82  160:invokevirtual   #138 <Method int View.getTop()>
		//   83  163:istore_3        
								j = Math.round((float)k * interpolator.getInterpolation((float)(l - j) / (float)k));
		//   84  164:iload           4
		//   85  166:i2f             
		//   86  167:aload           9
		//   87  169:iload           5
		//   88  171:iload_3         
		//   89  172:isub            
		//   90  173:i2f             
		//   91  174:iload           4
		//   92  176:i2f             
		//   93  177:fdiv            
		//   94  178:invokeinterface #182 <Method float Interpolator.getInterpolation(float)>
		//   95  183:fmul            
		//   96  184:invokestatic    #70  <Method int Math.round(float)>
		//   97  187:istore_3        
								j = Integer.signum(i) * (view.getTop() + j);
		//   98  188:iload_2         
		//   99  189:invokestatic    #187 <Method int Integer.signum(int)>
		//  100  192:aload           7
		//  101  194:invokevirtual   #138 <Method int View.getTop()>
		//  102  197:iload_3         
		//  103  198:iadd            
		//  104  199:imul            
		//  105  200:istore_3        
							}
						}
					}
					return j;
		//  106  201:iload_3         
		//  107  202:ireturn         
				}
				k++;
		//  108  203:iload           4
		//  109  205:iconst_1        
		//  110  206:iadd            
		//  111  207:istore          4
			} while(true);
		//  112  209:goto            15
		}

		private boolean shouldJumpElevationState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore          6
			coordinatorlayout = ((CoordinatorLayout) (coordinatorlayout.getDependents(((View) (appbarlayout)))));
		//    2    3:aload_1         
		//    3    4:aload_2         
		//    4    5:invokevirtual   #195 <Method List CoordinatorLayout.getDependents(View)>
		//    5    8:astore_1        
			int i = 0;
		//    6    9:iconst_0        
		//    7   10:istore_3        
			int j = ((List) (coordinatorlayout)).size();
		//    8   11:aload_1         
		//    9   12:invokeinterface #200 <Method int List.size()>
		//   10   17:istore          4
			do
			{
label0:
				{
					boolean flag = flag1;
		//   11   19:iload           6
		//   12   21:istore          5
					if(i < j)
		//*  13   23:iload_3         
		//*  14   24:iload           4
		//*  15   26:icmpge          73
					{
						appbarlayout = ((AppBarLayout) (((CoordinatorLayout.LayoutParams)((View)((List) (coordinatorlayout)).get(i)).getLayoutParams()).getBehavior()));
		//   16   29:aload_1         
		//   17   30:iload_3         
		//   18   31:invokeinterface #204 <Method Object List.get(int)>
		//   19   36:checkcast       #135 <Class View>
		//   20   39:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   21   42:checkcast       #206 <Class CoordinatorLayout$LayoutParams>
		//   22   45:invokevirtual   #210 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
		//   23   48:astore_2        
						if(!(appbarlayout instanceof ScrollingViewBehavior))
							break label0;
		//   24   49:aload_2         
		//   25   50:instanceof      #212 <Class AppBarLayout$ScrollingViewBehavior>
		//   26   53:ifeq            76
						flag = flag1;
		//   27   56:iload           6
		//   28   58:istore          5
						if(((ScrollingViewBehavior)appbarlayout).getOverlayTop() != 0)
		//*  29   60:aload_2         
		//*  30   61:checkcast       #212 <Class AppBarLayout$ScrollingViewBehavior>
		//*  31   64:invokevirtual   #215 <Method int AppBarLayout$ScrollingViewBehavior.getOverlayTop()>
		//*  32   67:ifeq            73
							flag = true;
		//   33   70:iconst_1        
		//   34   71:istore          5
					}
					return flag;
		//   35   73:iload           5
		//   36   75:ireturn         
				}
				i++;
		//   37   76:iload_3         
		//   38   77:iconst_1        
		//   39   78:iadd            
		//   40   79:istore_3        
			} while(true);
		//   41   80:goto            19
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
		//*   9   17:iflt            138
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
		//*  23   48:icmpne          138
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
		//*  48   94:ifeq            139
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
		//*  56  110:iload           7
		//*  57  112:iload_3         
		//*  58  113:iload           5
		//*  59  115:iadd            
		//*  60  116:iconst_2        
		//*  61  117:idiv            
		//*  62  118:icmpge          186
		//*  63  121:aload_0         
		//*  64  122:aload_1         
		//*  65  123:aload_2         
		//*  66  124:iload_3         
		//*  67  125:aload_2         
		//*  68  126:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
		//*  69  129:ineg            
		//*  70  130:iconst_0        
		//*  71  131:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
		//*  72  134:fconst_0        
		//*  73  135:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
		//*  74  138:return          
					{
						i = j;
		//   75  139:iload           4
		//   76  141:istore_3        
						k = l;
		//   77  142:iload           6
		//   78  144:istore          5
						if(checkFlag(j1, 5))
		//*  79  146:iload           8
		//*  80  148:iconst_5        
		//*  81  149:invokestatic    #221 <Method boolean checkFlag(int, int)>
		//*  82  152:ifeq            110
						{
							i = j + ViewCompat.getMinimumHeight(view);
		//   83  155:iload           4
		//   84  157:aload           9
		//   85  159:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//   86  162:iadd            
		//   87  163:istore_3        
							if(i1 < i)
		//*  88  164:iload           7
		//*  89  166:iload_3         
		//*  90  167:icmpge          179
							{
								k = i;
		//   91  170:iload_3         
		//   92  171:istore          5
								i = j;
		//   93  173:iload           4
		//   94  175:istore_3        
							} else
		//*  95  176:goto            110
							{
								k = l;
		//   96  179:iload           6
		//   97  181:istore          5
							}
						}
					}
					if(i1 >= (i + k) / 2)
		//*  98  183:goto            110
						i = k;
		//   99  186:iload           5
		//  100  188:istore_3        
					animateOffsetTo(coordinatorlayout, appbarlayout, MathUtils.clamp(i, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
				}
			}
		//* 101  189:goto            121
		}

		private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, boolean flag)
		{
			View view = getAppBarChildOnOffset(appbarlayout, i);
		//    0    0:aload_2         
		//    1    1:iload_3         
		//    2    2:invokestatic    #236 <Method View getAppBarChildOnOffset(AppBarLayout, int)>
		//    3    5:astore          10
			if(view == null) goto _L2; else goto _L1
		//    4    7:aload           10
		//    5    9:ifnull          119
_L1:
			int k;
			boolean flag1;
			boolean flag2;
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
			if((k & 1) == 0) goto _L4; else goto _L3
		//   15   32:iload           6
		//   16   34:iconst_1        
		//   17   35:iand            
		//   18   36:ifeq            80
_L3:
			int l = ViewCompat.getMinimumHeight(view);
		//   19   39:aload           10
		//   20   41:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//   21   44:istore          7
			if(j <= 0 || (k & 0xc) == 0) goto _L6; else goto _L5
		//   22   46:iload           4
		//   23   48:ifle            126
		//   24   51:iload           6
		//   25   53:bipush          12
		//   26   55:iand            
		//   27   56:ifeq            126
_L5:
			if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
		//*  28   59:iload_3         
		//*  29   60:ineg            
		//*  30   61:aload           10
		//*  31   63:invokevirtual   #141 <Method int View.getBottom()>
		//*  32   66:iload           7
		//*  33   68:isub            
		//*  34   69:aload_2         
		//*  35   70:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
		//*  36   73:isub            
		//*  37   74:icmplt          120
				flag1 = true;
		//   38   77:iconst_1        
		//   39   78:istore          8
			else
		//*  40   80:aload_2         
		//*  41   81:iload           8
		//*  42   83:invokevirtual   #240 <Method boolean AppBarLayout.setCollapsedState(boolean)>
		//*  43   86:istore          8
		//*  44   88:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
		//*  45   91:bipush          11
		//*  46   93:icmplt          119
		//*  47   96:iload           5
		//*  48   98:ifne            115
		//*  49  101:iload           8
		//*  50  103:ifeq            119
		//*  51  106:aload_0         
		//*  52  107:aload_1         
		//*  53  108:aload_2         
		//*  54  109:invokespecial   #247 <Method boolean shouldJumpElevationState(CoordinatorLayout, AppBarLayout)>
		//*  55  112:ifeq            119
		//*  56  115:aload_2         
		//*  57  116:invokevirtual   #250 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
		//*  58  119:return          
				flag1 = false;
		//   59  120:iconst_0        
		//   60  121:istore          8
_L4:
			flag1 = appbarlayout.setCollapsedState(flag1);
			if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && shouldJumpElevationState(coordinatorlayout, appbarlayout)))
				appbarlayout.jumpDrawablesToCurrentState();
_L2:
			return;
		//*  61  123:goto            80
_L6:
			flag1 = flag2;
		//   62  126:iload           9
		//   63  128:istore          8
			if((k & 2) != 0)
		//*  64  130:iload           6
		//*  65  132:iconst_2        
		//*  66  133:iand            
		//*  67  134:ifeq            80
				if(-i >= view.getBottom() - l - appbarlayout.getTopInset())
		//*  68  137:iload_3         
		//*  69  138:ineg            
		//*  70  139:aload           10
		//*  71  141:invokevirtual   #141 <Method int View.getBottom()>
		//*  72  144:iload           7
		//*  73  146:isub            
		//*  74  147:aload_2         
		//*  75  148:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
		//*  76  151:isub            
		//*  77  152:icmplt          161
					flag1 = true;
		//   78  155:iconst_1        
		//   79  156:istore          8
				else
		//*  80  158:goto            80
					flag1 = false;
		//   81  161:iconst_0        
		//   82  162:istore          8
			if(true) goto _L4; else goto _L7
		//   83  164:goto            158
_L7:
		}

		boolean canDragView(AppBarLayout appbarlayout)
		{
			boolean flag1 = true;
		//    0    0:iconst_1        
		//    1    1:istore_3        
			if(mOnDragCallback == null) goto _L2; else goto _L1
		//    2    2:aload_0         
		//    3    3:getfield        #254 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
		//    4    6:ifnull          20
_L1:
			boolean flag = mOnDragCallback.canDrag(appbarlayout);
		//    5    9:aload_0         
		//    6   10:getfield        #254 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #257 <Method boolean AppBarLayout$Behavior$DragCallback.canDrag(AppBarLayout)>
		//    9   17:istore_2        
_L4:
			return flag;
		//   10   18:iload_2         
		//   11   19:ireturn         
_L2:
			flag = flag1;
		//   12   20:iload_3         
		//   13   21:istore_2        
			if(mLastNestedScrollingChildRef == null) goto _L4; else goto _L3
		//   14   22:aload_0         
		//   15   23:getfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
		//   16   26:ifnull          18
_L3:
			appbarlayout = ((AppBarLayout) ((View)mLastNestedScrollingChildRef.get()));
		//   17   29:aload_0         
		//   18   30:getfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
		//   19   33:invokevirtual   #264 <Method Object WeakReference.get()>
		//   20   36:checkcast       #135 <Class View>
		//   21   39:astore_1        
			if(appbarlayout == null || !((View) (appbarlayout)).isShown())
				break; /* Loop/switch isn't completed */
		//   22   40:aload_1         
		//   23   41:ifnull          61
		//   24   44:aload_1         
		//   25   45:invokevirtual   #267 <Method boolean View.isShown()>
		//   26   48:ifeq            61
			flag = flag1;
		//   27   51:iload_3         
		//   28   52:istore_2        
			if(!((View) (appbarlayout)).canScrollVertically(-1)) goto _L4; else goto _L5
		//   29   53:aload_1         
		//   30   54:iconst_m1       
		//   31   55:invokevirtual   #271 <Method boolean View.canScrollVertically(int)>
		//   32   58:ifeq            18
_L5:
			return false;
		//   33   61:iconst_0        
		//   34   62:ireturn         
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
			int j;
			boolean flag;
			flag = super.onLayoutChild(coordinatorlayout, ((View) (appbarlayout)), i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #304 <Method boolean HeaderBehavior.onLayoutChild(CoordinatorLayout, View, int)>
		//    5    7:istore          5
			j = appbarlayout.getPendingAction();
		//    6    9:aload_2         
		//    7   10:invokevirtual   #307 <Method int AppBarLayout.getPendingAction()>
		//    8   13:istore          4
			if(mOffsetToChildIndexOnLayout < 0 || (j & 8) != 0) goto _L2; else goto _L1
		//    9   15:aload_0         
		//   10   16:getfield        #42  <Field int mOffsetToChildIndexOnLayout>
		//   11   19:iflt            145
		//   12   22:iload           4
		//   13   24:bipush          8
		//   14   26:iand            
		//   15   27:ifne            145
_L1:
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
		//*  27   51:ifeq            125
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
		//*  36   67:aload_0         
		//*  37   68:aload_1         
		//*  38   69:aload_2         
		//*  39   70:iload_3         
		//*  40   71:invokevirtual   #313 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//*  41   74:pop             
		//*  42   75:aload_2         
		//*  43   76:invokevirtual   #316 <Method void AppBarLayout.resetPendingAction()>
		//*  44   79:aload_0         
		//*  45   80:iconst_m1       
		//*  46   81:putfield        #42  <Field int mOffsetToChildIndexOnLayout>
		//*  47   84:aload_0         
		//*  48   85:aload_0         
		//*  49   86:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//*  50   89:aload_2         
		//*  51   90:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
		//*  52   93:ineg            
		//*  53   94:iconst_0        
		//*  54   95:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
		//*  55   98:invokevirtual   #319 <Method boolean setTopAndBottomOffset(int)>
		//*  56  101:pop             
		//*  57  102:aload_0         
		//*  58  103:aload_1         
		//*  59  104:aload_2         
		//*  60  105:aload_0         
		//*  61  106:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//*  62  109:iconst_0        
		//*  63  110:iconst_1        
		//*  64  111:invokespecial   #321 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
		//*  65  114:aload_2         
		//*  66  115:aload_0         
		//*  67  116:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//*  68  119:invokevirtual   #325 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
		//*  69  122:iload           5
		//*  70  124:ireturn         
				i += Math.round((float)view.getHeight() * mOffsetToChildIndexOnLayoutPerc);
		//   71  125:iload_3         
		//   72  126:aload           6
		//   73  128:invokevirtual   #158 <Method int View.getHeight()>
		//   74  131:i2f             
		//   75  132:aload_0         
		//   76  133:getfield        #327 <Field float mOffsetToChildIndexOnLayoutPerc>
		//   77  136:fmul            
		//   78  137:invokestatic    #70  <Method int Math.round(float)>
		//   79  140:iadd            
		//   80  141:istore_3        
			setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), i);
_L4:
			appbarlayout.resetPendingAction();
			mOffsetToChildIndexOnLayout = -1;
			setTopAndBottomOffset(MathUtils.clamp(getTopAndBottomOffset(), -appbarlayout.getTotalScrollRange(), 0));
			updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, getTopAndBottomOffset(), 0, true);
			appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
			return flag;
		//*  81  142:goto            67
_L2:
			if(j != 0)
		//*  82  145:iload           4
		//*  83  147:ifeq            75
			{
				if((j & 4) != 0)
		//*  84  150:iload           4
		//*  85  152:iconst_4        
		//*  86  153:iand            
		//*  87  154:ifeq            189
					i = 1;
		//   88  157:iconst_1        
		//   89  158:istore_3        
				else
		//*  90  159:iload           4
		//*  91  161:iconst_2        
		//*  92  162:iand            
		//*  93  163:ifeq            206
		//*  94  166:aload_2         
		//*  95  167:invokevirtual   #330 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//*  96  170:ineg            
		//*  97  171:istore          4
		//*  98  173:iload_3         
		//*  99  174:ifeq            194
		//* 100  177:aload_0         
		//* 101  178:aload_1         
		//* 102  179:aload_2         
		//* 103  180:iload           4
		//* 104  182:fconst_0        
		//* 105  183:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
		//* 106  186:goto            75
					i = 0;
		//  107  189:iconst_0        
		//  108  190:istore_3        
				if((j & 2) != 0)
				{
					j = -appbarlayout.getUpNestedPreScrollRange();
					if(i != 0)
						animateOffsetTo(coordinatorlayout, appbarlayout, j, 0.0F);
					else
		//* 109  191:goto            159
						setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), j);
		//  110  194:aload_0         
		//  111  195:aload_1         
		//  112  196:aload_2         
		//  113  197:iload           4
		//  114  199:invokevirtual   #313 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//  115  202:pop             
				} else
		//* 116  203:goto            75
				if((j & 1) != 0)
		//* 117  206:iload           4
		//* 118  208:iconst_1        
		//* 119  209:iand            
		//* 120  210:ifeq            75
					if(i != 0)
		//* 121  213:iload_3         
		//* 122  214:ifeq            228
						animateOffsetTo(coordinatorlayout, appbarlayout, 0, 0.0F);
		//  123  217:aload_0         
		//  124  218:aload_1         
		//  125  219:aload_2         
		//  126  220:iconst_0        
		//  127  221:fconst_0        
		//  128  222:invokespecial   #232 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
					else
		//* 129  225:goto            75
						setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), 0);
		//  130  228:aload_0         
		//  131  229:aload_1         
		//  132  230:aload_2         
		//  133  231:iconst_0        
		//  134  232:invokevirtual   #313 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//  135  235:pop             
			}
			if(true) goto _L4; else goto _L3
		//  136  236:goto            75
_L3:
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
		//*   1    2:ifeq            49
			{
				if(j < 0)
		//*   2    5:iload           5
		//*   3    7:ifge            50
				{
					i = -appbarlayout.getTotalScrollRange();
		//    4   10:aload_2         
		//    5   11:invokevirtual   #224 <Method int AppBarLayout.getTotalScrollRange()>
		//    6   14:ineg            
		//    7   15:istore          4
					k = i + appbarlayout.getDownNestedPreScrollRange();
		//    8   17:iload           4
		//    9   19:aload_2         
		//   10   20:invokevirtual   #356 <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   11   23:iadd            
		//   12   24:istore          7
				} else
		//*  13   26:iload           4
		//*  14   28:iload           7
		//*  15   30:icmpeq          49
		//*  16   33:aload           6
		//*  17   35:iconst_1        
		//*  18   36:aload_0         
		//*  19   37:aload_1         
		//*  20   38:aload_2         
		//*  21   39:iload           5
		//*  22   41:iload           4
		//*  23   43:iload           7
		//*  24   45:invokevirtual   #360 <Method int scroll(CoordinatorLayout, View, int, int, int)>
		//*  25   48:iastore         
		//*  26   49:return          
				{
					i = -appbarlayout.getUpNestedPreScrollRange();
		//   27   50:aload_2         
		//   28   51:invokevirtual   #330 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   29   54:ineg            
		//   30   55:istore          4
					k = 0;
		//   31   57:iconst_0        
		//   32   58:istore          7
				}
				if(i != k)
					ai[1] = scroll(coordinatorlayout, ((View) (appbarlayout)), j, i, k);
			}
		//*  33   60:goto            26
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
		//   19   35:putfield        #327 <Field float mOffsetToChildIndexOnLayoutPerc>
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
			int i = 0;
		//    8   14:iconst_0        
		//    9   15:istore_3        
			for(int k = appbarlayout.getChildCount(); i < k; i++)
		//*  10   16:aload_2         
		//*  11   17:invokevirtual   #129 <Method int AppBarLayout.getChildCount()>
		//*  12   20:istore          5
		//*  13   22:iload_3         
		//*  14   23:iload           5
		//*  15   25:icmpge          129
			{
				coordinatorlayout = ((CoordinatorLayout) (appbarlayout.getChildAt(i)));
		//   16   28:aload_2         
		//   17   29:iload_3         
		//   18   30:invokevirtual   #133 <Method View AppBarLayout.getChildAt(int)>
		//   19   33:astore_1        
				int l = ((View) (coordinatorlayout)).getBottom() + j;
		//   20   34:aload_1         
		//   21   35:invokevirtual   #141 <Method int View.getBottom()>
		//   22   38:iload           4
		//   23   40:iadd            
		//   24   41:istore          6
				if(((View) (coordinatorlayout)).getTop() + j <= 0 && l >= 0)
		//*  25   43:aload_1         
		//*  26   44:invokevirtual   #138 <Method int View.getTop()>
		//*  27   47:iload           4
		//*  28   49:iadd            
		//*  29   50:ifgt            122
		//*  30   53:iload           6
		//*  31   55:iflt            122
				{
					obj = ((Object) (new SavedState(((Parcelable) (obj)))));
		//   32   58:new             #15  <Class AppBarLayout$Behavior$SavedState>
		//   33   61:dup             
		//   34   62:aload           8
		//   35   64:invokespecial   #396 <Method void AppBarLayout$Behavior$SavedState(Parcelable)>
		//   36   67:astore          8
					obj.firstVisibleChildIndex = i;
		//   37   69:aload           8
		//   38   71:iload_3         
		//   39   72:putfield        #380 <Field int AppBarLayout$Behavior$SavedState.firstVisibleChildIndex>
					boolean flag;
					if(l == ViewCompat.getMinimumHeight(((View) (coordinatorlayout))) + appbarlayout.getTopInset())
		//*  40   75:iload           6
		//*  41   77:aload_1         
		//*  42   78:invokestatic    #170 <Method int ViewCompat.getMinimumHeight(View)>
		//*  43   81:aload_2         
		//*  44   82:invokevirtual   #177 <Method int AppBarLayout.getTopInset()>
		//*  45   85:iadd            
		//*  46   86:icmpne          116
						flag = true;
		//   47   89:iconst_1        
		//   48   90:istore          7
					else
		//*  49   92:aload           8
		//*  50   94:iload           7
		//*  51   96:putfield        #386 <Field boolean AppBarLayout$Behavior$SavedState.firstVisibleChildAtMinimumHeight>
		//*  52   99:aload           8
		//*  53  101:iload           6
		//*  54  103:i2f             
		//*  55  104:aload_1         
		//*  56  105:invokevirtual   #158 <Method int View.getHeight()>
		//*  57  108:i2f             
		//*  58  109:fdiv            
		//*  59  110:putfield        #383 <Field float AppBarLayout$Behavior$SavedState.firstVisibleChildPercentageShown>
		//*  60  113:aload           8
		//*  61  115:areturn         
						flag = false;
		//   62  116:iconst_0        
		//   63  117:istore          7
					obj.firstVisibleChildAtMinimumHeight = flag;
					obj.firstVisibleChildPercentageShown = (float)l / (float)((View) (coordinatorlayout)).getHeight();
					return ((Parcelable) (obj));
				}
			}

		//   64  119:goto            92
		//   65  122:iload_3         
		//   66  123:iconst_1        
		//   67  124:iadd            
		//   68  125:istore_3        
		//*  69  126:goto            22
			return ((Parcelable) (obj));
		//   70  129:aload           8
		//   71  131:areturn         
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
		//*   3    4:ifeq            60
		//*   4    7:aload_2         
		//*   5    8:invokevirtual   #403 <Method boolean AppBarLayout.hasScrollableChildren()>
		//*   6   11:ifeq            60
		//*   7   14:aload_1         
		//*   8   15:invokevirtual   #404 <Method int CoordinatorLayout.getHeight()>
		//*   9   18:aload_3         
		//*  10   19:invokevirtual   #158 <Method int View.getHeight()>
		//*  11   22:isub            
		//*  12   23:aload_2         
		//*  13   24:invokevirtual   #77  <Method int AppBarLayout.getHeight()>
		//*  14   27:icmpgt          60
				flag = true;
		//   15   30:iconst_1        
		//   16   31:istore          7
			else
		//*  17   33:iload           7
		//*  18   35:ifeq            52
		//*  19   38:aload_0         
		//*  20   39:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//*  21   42:ifnull          52
		//*  22   45:aload_0         
		//*  23   46:getfield        #80  <Field ValueAnimator mOffsetAnimator>
		//*  24   49:invokevirtual   #89  <Method void ValueAnimator.cancel()>
		//*  25   52:aload_0         
		//*  26   53:aconst_null     
		//*  27   54:putfield        #259 <Field WeakReference mLastNestedScrollingChildRef>
		//*  28   57:iload           7
		//*  29   59:ireturn         
				flag = false;
		//   30   60:iconst_0        
		//   31   61:istore          7
			if(flag && mOffsetAnimator != null)
				mOffsetAnimator.cancel();
			mLastNestedScrollingChildRef = null;
			return flag;
		//*  32   63:goto            33
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
		//    2    4:istore          7
			boolean flag = false;
		//    3    6:iconst_0        
		//    4    7:istore          6
			if(j != 0 && l >= j && l <= k)
		//*   5    9:iload           4
		//*   6   11:ifeq            145
		//*   7   14:iload           7
		//*   8   16:iload           4
		//*   9   18:icmplt          145
		//*  10   21:iload           7
		//*  11   23:iload           5
		//*  12   25:icmpgt          145
			{
				j = MathUtils.clamp(i, j, k);
		//   13   28:iload_3         
		//   14   29:iload           4
		//   15   31:iload           5
		//   16   33:invokestatic    #230 <Method int MathUtils.clamp(int, int, int)>
		//   17   36:istore          4
				i = ((int) (flag));
		//   18   38:iload           6
		//   19   40:istore_3        
				if(l != j)
		//*  20   41:iload           7
		//*  21   43:iload           4
		//*  22   45:icmpeq          132
				{
					boolean flag1;
					if(appbarlayout.hasChildWithInterpolator())
		//*  23   48:aload_2         
		//*  24   49:invokevirtual   #423 <Method boolean AppBarLayout.hasChildWithInterpolator()>
		//*  25   52:ifeq            134
						i = interpolateOffset(appbarlayout, j);
		//   26   55:aload_0         
		//   27   56:aload_2         
		//   28   57:iload           4
		//   29   59:invokespecial   #425 <Method int interpolateOffset(AppBarLayout, int)>
		//   30   62:istore_3        
					else
		//*  31   63:aload_0         
		//*  32   64:iload_3         
		//*  33   65:invokevirtual   #319 <Method boolean setTopAndBottomOffset(int)>
		//*  34   68:istore          8
		//*  35   70:iload           7
		//*  36   72:iload           4
		//*  37   74:isub            
		//*  38   75:istore          5
		//*  39   77:aload_0         
		//*  40   78:iload           4
		//*  41   80:iload_3         
		//*  42   81:isub            
		//*  43   82:putfield        #50  <Field int mOffsetDelta>
		//*  44   85:iload           8
		//*  45   87:ifne            102
		//*  46   90:aload_2         
		//*  47   91:invokevirtual   #423 <Method boolean AppBarLayout.hasChildWithInterpolator()>
		//*  48   94:ifeq            102
		//*  49   97:aload_1         
		//*  50   98:aload_2         
		//*  51   99:invokevirtual   #429 <Method void CoordinatorLayout.dispatchDependentViewsChanged(View)>
		//*  52  102:aload_2         
		//*  53  103:aload_0         
		//*  54  104:invokevirtual   #290 <Method int getTopAndBottomOffset()>
		//*  55  107:invokevirtual   #325 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
		//*  56  110:iload           4
		//*  57  112:iload           7
		//*  58  114:icmpge          140
		//*  59  117:iconst_m1       
		//*  60  118:istore_3        
		//*  61  119:aload_0         
		//*  62  120:aload_1         
		//*  63  121:aload_2         
		//*  64  122:iload           4
		//*  65  124:iload_3         
		//*  66  125:iconst_0        
		//*  67  126:invokespecial   #321 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
		//*  68  129:iload           5
		//*  69  131:istore_3        
		//*  70  132:iload_3         
		//*  71  133:ireturn         
						i = j;
		//   72  134:iload           4
		//   73  136:istore_3        
					flag1 = setTopAndBottomOffset(i);
					k = l - j;
					mOffsetDelta = j - i;
					if(!flag1 && appbarlayout.hasChildWithInterpolator())
						coordinatorlayout.dispatchDependentViewsChanged(((View) (appbarlayout)));
					appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
					if(j < l)
						i = -1;
					else
		//*  74  137:goto            63
						i = 1;
		//   75  140:iconst_1        
		//   76  141:istore_3        
					updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, j, i, false);
					i = k;
				}
				return i;
			} else
		//*  77  142:goto            119
			{
				mOffsetDelta = 0;
		//   78  145:aload_0         
		//   79  146:iconst_0        
		//   80  147:putfield        #50  <Field int mOffsetDelta>
				return 0;
		//   81  150:iconst_0        
		//   82  151:ireturn         
			}
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
			if(firstVisibleChildAtMinimumHeight)
		//*  12   22:aload_0         
		//*  13   23:getfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
		//*  14   26:ifeq            38
				i = 1;
		//   15   29:iconst_1        
		//   16   30:istore_2        
			else
		//*  17   31:aload_1         
		//*  18   32:iload_2         
		//*  19   33:int2byte        
		//*  20   34:invokevirtual   #71  <Method void Parcel.writeByte(byte)>
		//*  21   37:return          
				i = 0;
		//   22   38:iconst_0        
		//   23   39:istore_2        
			parcel.writeByte((byte)i);
		//*  24   40:goto            31
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
		//*  14   26:ifeq            37
				flag = true;
		//   15   29:iconst_1        
		//   16   30:istore_3        
			else
		//*  17   31:aload_0         
		//*  18   32:iload_3         
		//*  19   33:putfield        #52  <Field boolean firstVisibleChildAtMinimumHeight>
		//*  20   36:return          
				flag = false;
		//   21   37:iconst_0        
		//   22   38:istore_3        
			firstVisibleChildAtMinimumHeight = flag;
		//*  23   39:goto            31
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
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			for(int j = list.size(); i < j; i++)
		//*   2    2:aload_1         
		//*   3    3:invokeinterface #97  <Method int List.size()>
		//*   4    8:istore_3        
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
		//*   2    4:ifeq            41
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
				if(k == 0 || j + i > k)
		//*  15   28:iload           4
		//*  16   30:ifeq            43
		//*  17   33:iload_3         
		//*  18   34:iload_2         
		//*  19   35:iadd            
		//*  20   36:iload           4
		//*  21   38:icmpgt          43
		//*  22   41:fconst_0        
		//*  23   42:freturn         
		//*  24   43:iload_3         
		//*  25   44:iload           4
		//*  26   46:isub            
		//*  27   47:istore_3        
					if((j -= k) != 0)
		//*  28   48:iload_3         
		//*  29   49:ifeq            41
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
		//*   7   13:ifnull          79
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
		//*  28   52:ifne            79
				{
					if(!flag)
		//*  29   55:iload           4
		//*  30   57:ifne            73
						flag = true;
		//   31   60:iconst_1        
		//   32   61:istore          4
					else
		//*  33   63:aload           5
		//*  34   65:iconst_0        
		//*  35   66:iload           4
		//*  36   68:invokevirtual   #177 <Method void AppBarLayout.setExpanded(boolean, boolean)>
		//*  37   71:iconst_1        
		//*  38   72:ireturn         
						flag = false;
		//   39   73:iconst_0        
		//   40   74:istore          4
					appbarlayout.setExpanded(false, flag);
					return true;
				}
			}
		//*  41   76:goto            63
			return false;
		//   42   79:iconst_0        
		//   43   80:ireturn         
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
		byte byte2 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		byte byte0;
		byte byte1;
		if(flag)
	//*   2    3:iload_1         
	//*   3    4:ifeq            42
			byte0 = 1;
	//    4    7:iconst_1        
	//    5    8:istore          4
		else
	//*   6   10:iload_2         
	//*   7   11:ifeq            48
	//*   8   14:iconst_4        
	//*   9   15:istore          5
	//*  10   17:iload_3         
	//*  11   18:ifeq            25
	//*  12   21:bipush          8
	//*  13   23:istore          6
	//*  14   25:aload_0         
	//*  15   26:iload           6
	//*  16   28:iload           5
	//*  17   30:iload           4
	//*  18   32:ior             
	//*  19   33:ior             
	//*  20   34:putfield        #77  <Field int mPendingAction>
	//*  21   37:aload_0         
	//*  22   38:invokevirtual   #193 <Method void requestLayout()>
	//*  23   41:return          
			byte0 = 2;
	//   24   42:iconst_2        
	//   25   43:istore          4
		if(flag1)
			byte1 = 4;
		else
	//*  26   45:goto            10
			byte1 = 0;
	//   27   48:iconst_0        
	//   28   49:istore          5
		if(flag2)
			byte2 = 8;
		mPendingAction = byte2 | (byte1 | byte0);
		requestLayout();
	//*  29   51:goto            17
	}

	private void updateCollapsible()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_1        
		int j = getChildCount();
	//    4    5:aload_0         
	//    5    6:invokevirtual   #198 <Method int getChildCount()>
	//    6    9:istore_2        
		do
		{
label0:
			{
				boolean flag = flag1;
	//    7   10:iload           4
	//    8   12:istore_3        
				if(i < j)
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          37
				{
					if(!((LayoutParams)getChildAt(i).getLayoutParams()).isCollapsible())
						break label0;
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:invokevirtual   #202 <Method View getChildAt(int)>
	//   15   23:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   26:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   17   29:invokevirtual   #212 <Method boolean AppBarLayout$LayoutParams.isCollapsible()>
	//   18   32:ifeq            44
					flag = true;
	//   19   35:iconst_1        
	//   20   36:istore_3        
				}
				setCollapsibleState(flag);
	//   21   37:aload_0         
	//   22   38:iload_3         
	//   23   39:invokespecial   #214 <Method boolean setCollapsibleState(boolean)>
	//   24   42:pop             
				return;
	//   25   43:return          
			}
			i++;
	//   26   44:iload_1         
	//   27   45:iconst_1        
	//   28   46:iadd            
	//   29   47:istore_1        
		} while(true);
	//   30   48:goto            10
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
		int k;
		int l;
		if(mDownPreScrollRange != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int mDownPreScrollRange>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return mDownPreScrollRange;
	//    4    8:aload_0         
	//    5    9:getfield        #73  <Field int mDownPreScrollRange>
	//    6   12:ireturn         
		l = 0;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		k = getChildCount() - 1;
	//    9   15:aload_0         
	//   10   16:invokevirtual   #198 <Method int getChildCount()>
	//   11   19:iconst_1        
	//   12   20:isub            
	//   13   21:istore_2        
_L5:
		if(k < 0) goto _L2; else goto _L1
	//   14   22:iload_2         
	//   15   23:iflt            141
_L1:
		int i;
		int i1;
		View view;
		LayoutParams layoutparams;
		view = getChildAt(k);
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:invokevirtual   #202 <Method View getChildAt(int)>
	//   19   31:astore          5
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   20   33:aload           5
	//   21   35:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   38:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   23   41:astore          6
		i = view.getMeasuredHeight();
	//   24   43:aload           5
	//   25   45:invokevirtual   #286 <Method int View.getMeasuredHeight()>
	//   26   48:istore_1        
		i1 = layoutparams.mScrollFlags;
	//   27   49:aload           6
	//   28   51:getfield        #289 <Field int AppBarLayout$LayoutParams.mScrollFlags>
	//   29   54:istore          4
		if((i1 & 5) != 5) goto _L4; else goto _L3
	//   30   56:iload           4
	//   31   58:iconst_5        
	//   32   59:iand            
	//   33   60:iconst_5        
	//   34   61:icmpne          135
_L3:
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
	//*  46   83:ifeq            103
			i = l + ViewCompat.getMinimumHeight(view);
	//   47   86:iload_3         
	//   48   87:aload           5
	//   49   89:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
	//   50   92:iadd            
	//   51   93:istore_1        
		else
	//*  52   94:iload_2         
	//*  53   95:iconst_1        
	//*  54   96:isub            
	//*  55   97:istore_2        
	//*  56   98:iload_1         
	//*  57   99:istore_3        
	//*  58  100:goto            22
		if((i1 & 2) != 0)
	//*  59  103:iload           4
	//*  60  105:iconst_2        
	//*  61  106:iand            
	//*  62  107:ifeq            123
			i = l + (i - ViewCompat.getMinimumHeight(view));
	//   63  110:iload_3         
	//   64  111:iload_1         
	//   65  112:aload           5
	//   66  114:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
	//   67  117:isub            
	//   68  118:iadd            
	//   69  119:istore_1        
		else
	//*  70  120:goto            94
			i = l + (i - getTopInset());
	//   71  123:iload_3         
	//   72  124:iload_1         
	//   73  125:aload_0         
	//   74  126:invokevirtual   #302 <Method int getTopInset()>
	//   75  129:isub            
	//   76  130:iadd            
	//   77  131:istore_1        
_L6:
		k--;
		l = i;
		  goto _L5
	//*  78  132:goto            94
_L4:
		i = l;
	//   79  135:iload_3         
	//   80  136:istore_1        
		if(l <= 0) goto _L6; else goto _L2
	//   81  137:iload_3         
	//   82  138:ifle            94
_L2:
		int j = Math.max(0, l);
	//   83  141:iconst_0        
	//   84  142:iload_3         
	//   85  143:invokestatic    #307 <Method int Math.max(int, int)>
	//   86  146:istore_1        
		mDownPreScrollRange = j;
	//   87  147:aload_0         
	//   88  148:iload_1         
	//   89  149:putfield        #73  <Field int mDownPreScrollRange>
		return j;
	//   90  152:iload_1         
	//   91  153:ireturn         
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
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		int j = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		int l = getChildCount();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #198 <Method int getChildCount()>
	//   13   21:istore          4
		do
		{
label0:
			{
				int k = i;
	//   14   23:iload_1         
	//   15   24:istore_3        
				if(j < l)
	//*  16   25:iload_2         
	//*  17   26:iload           4
	//*  18   28:icmpge          116
				{
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
					if((i1 & 1) != 0)
	//*  41   78:iload           5
	//*  42   80:iconst_1        
	//*  43   81:iand            
	//*  44   82:ifeq            116
					{
						i += j1 + (k1 + l1);
	//   45   85:iload_1         
	//   46   86:iload           6
	//   47   88:iload           7
	//   48   90:iload           8
	//   49   92:iadd            
	//   50   93:iadd            
	//   51   94:iadd            
	//   52   95:istore_1        
						if((i1 & 2) == 0)
							break label0;
	//   53   96:iload           5
	//   54   98:iconst_2        
	//   55   99:iand            
	//   56  100:ifeq            129
						k = i - (ViewCompat.getMinimumHeight(view) + getTopInset());
	//   57  103:iload_1         
	//   58  104:aload           9
	//   59  106:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
	//   60  109:aload_0         
	//   61  110:invokevirtual   #302 <Method int getTopInset()>
	//   62  113:iadd            
	//   63  114:isub            
	//   64  115:istore_3        
					}
				}
				i = Math.max(0, k);
	//   65  116:iconst_0        
	//   66  117:iload_3         
	//   67  118:invokestatic    #307 <Method int Math.max(int, int)>
	//   68  121:istore_1        
				mDownScrollRange = i;
	//   69  122:aload_0         
	//   70  123:iload_1         
	//   71  124:putfield        #75  <Field int mDownScrollRange>
				return i;
	//   72  127:iload_1         
	//   73  128:ireturn         
			}
			j++;
	//   74  129:iload_2         
	//   75  130:iconst_1        
	//   76  131:iadd            
	//   77  132:istore_2        
		} while(true);
	//   78  133:goto            23
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
	//*  19   27:icmplt          51
			i = ViewCompat.getMinimumHeight(getChildAt(i - 1));
	//   20   30:aload_0         
	//   21   31:iload_1         
	//   22   32:iconst_1        
	//   23   33:isub            
	//   24   34:invokevirtual   #202 <Method View getChildAt(int)>
	//   25   37:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
	//   26   40:istore_1        
		else
	//*  27   41:iload_1         
	//*  28   42:ifeq            56
	//*  29   45:iload_1         
	//*  30   46:iconst_2        
	//*  31   47:imul            
	//*  32   48:iload_2         
	//*  33   49:iadd            
	//*  34   50:ireturn         
			i = 0;
	//   35   51:iconst_0        
	//   36   52:istore_1        
		if(i != 0)
			return i * 2 + j;
		else
	//*  37   53:goto            41
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
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		int j = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		int l = getChildCount();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #198 <Method int getChildCount()>
	//   13   21:istore          4
		do
		{
label0:
			{
				int k = i;
	//   14   23:iload_1         
	//   15   24:istore_3        
				if(j < l)
	//*  16   25:iload_2         
	//*  17   26:iload           4
	//*  18   28:icmpge          103
				{
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
					if((i1 & 1) != 0)
	//*  35   64:iload           5
	//*  36   66:iconst_1        
	//*  37   67:iand            
	//*  38   68:ifeq            103
					{
						i += layoutparams.topMargin + j1 + layoutparams.bottomMargin;
	//   39   71:iload_1         
	//   40   72:aload           8
	//   41   74:getfield        #292 <Field int AppBarLayout$LayoutParams.topMargin>
	//   42   77:iload           6
	//   43   79:iadd            
	//   44   80:aload           8
	//   45   82:getfield        #295 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   46   85:iadd            
	//   47   86:iadd            
	//   48   87:istore_1        
						if((i1 & 2) == 0)
							break label0;
	//   49   88:iload           5
	//   50   90:iconst_2        
	//   51   91:iand            
	//   52   92:ifeq            121
						k = i - ViewCompat.getMinimumHeight(view);
	//   53   95:iload_1         
	//   54   96:aload           7
	//   55   98:invokestatic    #299 <Method int ViewCompat.getMinimumHeight(View)>
	//   56  101:isub            
	//   57  102:istore_3        
					}
				}
				i = Math.max(0, k - getTopInset());
	//   58  103:iconst_0        
	//   59  104:iload_3         
	//   60  105:aload_0         
	//   61  106:invokevirtual   #302 <Method int getTopInset()>
	//   62  109:isub            
	//   63  110:invokestatic    #307 <Method int Math.max(int, int)>
	//   64  113:istore_1        
				mTotalScrollRange = i;
	//   65  114:aload_0         
	//   66  115:iload_1         
	//   67  116:putfield        #71  <Field int mTotalScrollRange>
				return i;
	//   68  119:iload_1         
	//   69  120:ireturn         
			}
			j++;
	//   70  121:iload_2         
	//   71  122:iconst_1        
	//   72  123:iadd            
	//   73  124:istore_2        
		} while(true);
	//   74  125:goto            23
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
		int ai1[] = super.onCreateDrawableState(ai.length + i);
	//   10   19:aload_0         
	//   11   20:aload_2         
	//   12   21:arraylength     
	//   13   22:iload_1         
	//   14   23:iadd            
	//   15   24:invokespecial   #340 <Method int[] LinearLayout.onCreateDrawableState(int)>
	//   16   27:astore_3        
		if(mCollapsible)
	//*  17   28:aload_0         
	//*  18   29:getfield        #187 <Field boolean mCollapsible>
	//*  19   32:ifeq            71
			i = android.support.design.R.attr.state_collapsible;
	//   20   35:getstatic       #345 <Field int android.support.design.R$attr.state_collapsible>
	//   21   38:istore_1        
		else
	//*  22   39:aload_2         
	//*  23   40:iconst_0        
	//*  24   41:iload_1         
	//*  25   42:iastore         
	//*  26   43:aload_0         
	//*  27   44:getfield        #187 <Field boolean mCollapsible>
	//*  28   47:ifeq            79
	//*  29   50:aload_0         
	//*  30   51:getfield        #347 <Field boolean mCollapsed>
	//*  31   54:ifeq            79
	//*  32   57:getstatic       #350 <Field int android.support.design.R$attr.state_collapsed>
	//*  33   60:istore_1        
	//*  34   61:aload_2         
	//*  35   62:iconst_1        
	//*  36   63:iload_1         
	//*  37   64:iastore         
	//*  38   65:aload_3         
	//*  39   66:aload_2         
	//*  40   67:invokestatic    #354 <Method int[] mergeDrawableStates(int[], int[])>
	//*  41   70:areturn         
			i = -android.support.design.R.attr.state_collapsible;
	//   42   71:getstatic       #345 <Field int android.support.design.R$attr.state_collapsible>
	//   43   74:ineg            
	//   44   75:istore_1        
		ai[0] = i;
		if(mCollapsible && mCollapsed)
			i = android.support.design.R.attr.state_collapsed;
		else
	//*  45   76:goto            39
			i = -android.support.design.R.attr.state_collapsed;
	//   46   79:getstatic       #350 <Field int android.support.design.R$attr.state_collapsed>
	//   47   82:ineg            
	//   48   83:istore_1        
		ai[1] = i;
		return mergeDrawableStates(ai1, ai);
	//*  49   84:goto            61
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
		mHaveChildWithInterpolator = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #333 <Field boolean mHaveChildWithInterpolator>
		i = 0;
	//   12   20:iconst_0        
	//   13   21:istore_2        
		j = getChildCount();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #198 <Method int getChildCount()>
	//   16   26:istore_3        
		do
		{
label0:
			{
				if(i < j)
	//*  17   27:iload_2         
	//*  18   28:iload_3         
	//*  19   29:icmpge          54
				{
					if(((LayoutParams)getChildAt(i).getLayoutParams()).getScrollInterpolator() == null)
						break label0;
	//   20   32:aload_0         
	//   21   33:iload_2         
	//   22   34:invokevirtual   #202 <Method View getChildAt(int)>
	//   23   37:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   40:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   25   43:invokevirtual   #364 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
	//   26   46:ifnull          59
					mHaveChildWithInterpolator = true;
	//   27   49:aload_0         
	//   28   50:iconst_1        
	//   29   51:putfield        #333 <Field boolean mHaveChildWithInterpolator>
				}
				updateCollapsible();
	//   30   54:aload_0         
	//   31   55:invokespecial   #366 <Method void updateCollapsible()>
				return;
	//   32   58:return          
			}
			i++;
	//   33   59:iload_2         
	//   34   60:iconst_1        
	//   35   61:iadd            
	//   36   62:istore_2        
		} while(true);
	//   37   63:goto            27
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
		WindowInsetsCompat windowinsetscompat1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #375 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   4    6:ifeq            11
			windowinsetscompat1 = windowinsetscompat;
	//    5    9:aload_1         
	//    6   10:astore_2        
		if(!ObjectsCompat.equals(((Object) (mLastInsets)), ((Object) (windowinsetscompat1))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #320 <Field WindowInsetsCompat mLastInsets>
	//*   9   15:aload_2         
	//*  10   16:invokestatic    #381 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  11   19:ifne            31
		{
			mLastInsets = windowinsetscompat1;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #320 <Field WindowInsetsCompat mLastInsets>
			invalidateScrollRanges();
	//   15   27:aload_0         
	//   16   28:invokespecial   #360 <Method void invalidateScrollRanges()>
		}
		return windowinsetscompat;
	//   17   31:aload_1         
	//   18   32:areturn         
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
