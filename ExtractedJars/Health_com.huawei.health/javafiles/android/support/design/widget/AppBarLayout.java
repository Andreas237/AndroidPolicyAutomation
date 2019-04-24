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
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
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
import o.*;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout

public class AppBarLayout extends LinearLayout
{
	public static class Behavior extends s
	{

		private void animateOffsetTo(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, float f)
		{
			int k = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:iload_3         
		//    3    5:isub            
		//    4    6:invokestatic    #64  <Method int Math.abs(int)>
		//    5    9:istore          5
			f = Math.abs(f);
		//    6   11:fload           4
		//    7   13:invokestatic    #67  <Method float Math.abs(float)>
		//    8   16:fstore          4
			if(f > 0.0F)
		//*   9   18:fload           4
		//*  10   20:fconst_0        
		//*  11   21:fcmpl           
		//*  12   22:ifle            44
				k = Math.round(((float)k / f) * 1000F) * 3;
		//   13   25:iload           5
		//   14   27:i2f             
		//   15   28:fload           4
		//   16   30:fdiv            
		//   17   31:ldc1            #68  <Float 1000F>
		//   18   33:fmul            
		//   19   34:invokestatic    #72  <Method int Math.round(float)>
		//   20   37:iconst_3        
		//   21   38:imul            
		//   22   39:istore          5
			else
		//*  23   41:goto            61
				k = (int)((1.0F + (float)k / (float)appbarlayout.getHeight()) * 150F);
		//   24   44:fconst_1        
		//   25   45:iload           5
		//   26   47:i2f             
		//   27   48:aload_2         
		//   28   49:invokevirtual   #75  <Method int AppBarLayout.getHeight()>
		//   29   52:i2f             
		//   30   53:fdiv            
		//   31   54:fadd            
		//   32   55:ldc1            #76  <Float 150F>
		//   33   57:fmul            
		//   34   58:f2i             
		//   35   59:istore          5
			animateOffsetWithDuration(coordinatorlayout, appbarlayout, i, k);
		//   36   61:aload_0         
		//   37   62:aload_1         
		//   38   63:aload_2         
		//   39   64:iload_3         
		//   40   65:iload           5
		//   41   67:invokespecial   #80  <Method void animateOffsetWithDuration(CoordinatorLayout, AppBarLayout, int, int)>
		//   42   70:return          
		}

		private void animateOffsetWithDuration(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int k)
		{
			int l = getTopBottomOffsetForScrollingSibling();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:istore          5
			if(l == i)
		//*   3    6:iload           5
		//*   4    8:iload_3         
		//*   5    9:icmpne          37
			{
				if(mOffsetAnimator != null && mOffsetAnimator.isRunning())
		//*   6   12:aload_0         
		//*   7   13:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//*   8   16:ifnull          36
		//*   9   19:aload_0         
		//*  10   20:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//*  11   23:invokevirtual   #88  <Method boolean ValueAnimator.isRunning()>
		//*  12   26:ifeq            36
					mOffsetAnimator.cancel();
		//   13   29:aload_0         
		//   14   30:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//   15   33:invokevirtual   #91  <Method void ValueAnimator.cancel()>
				return;
		//   16   36:return          
			}
			if(mOffsetAnimator == null)
		//*  17   37:aload_0         
		//*  18   38:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//*  19   41:ifnonnull       85
			{
				mOffsetAnimator = new ValueAnimator();
		//   20   44:aload_0         
		//   21   45:new             #84  <Class ValueAnimator>
		//   22   48:dup             
		//   23   49:invokespecial   #92  <Method void ValueAnimator()>
		//   24   52:putfield        #82  <Field ValueAnimator mOffsetAnimator>
				mOffsetAnimator.setInterpolator(((android.animation.TimeInterpolator) (p.d)));
		//   25   55:aload_0         
		//   26   56:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//   27   59:getstatic       #98  <Field Interpolator p.d>
		//   28   62:invokevirtual   #102 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
				mOffsetAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(this, coordinatorlayout, appbarlayout) {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						b.setHeaderTopBottomOffset(a, ((View) (d)), ((Integer)valueanimator.getAnimatedValue()).intValue());
					//    0    0:aload_0         
					//    1    1:getfield        #24  <Field AppBarLayout$Behavior b>
					//    2    4:aload_0         
					//    3    5:getfield        #26  <Field CoordinatorLayout a>
					//    4    8:aload_0         
					//    5    9:getfield        #28  <Field AppBarLayout d>
					//    6   12:aload_1         
					//    7   13:invokevirtual   #40  <Method Object ValueAnimator.getAnimatedValue()>
					//    8   16:checkcast       #42  <Class Integer>
					//    9   19:invokevirtual   #46  <Method int Integer.intValue()>
					//   10   22:invokevirtual   #50  <Method int AppBarLayout$Behavior.setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
					//   11   25:pop             
					//   12   26:return          
					}

					final CoordinatorLayout a;
					final Behavior b;
					final AppBarLayout d;

			
			{
				b = behavior;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field AppBarLayout$Behavior b>
				a = coordinatorlayout;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field CoordinatorLayout a>
				d = appbarlayout;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #28  <Field AppBarLayout d>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #31  <Method void Object()>
			//   11   19:return          
			}
				}
);
		//   29   65:aload_0         
		//   30   66:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//   31   69:new             #10  <Class AppBarLayout$Behavior$5>
		//   32   72:dup             
		//   33   73:aload_0         
		//   34   74:aload_1         
		//   35   75:aload_2         
		//   36   76:invokespecial   #105 <Method void AppBarLayout$Behavior$5(AppBarLayout$Behavior, CoordinatorLayout, AppBarLayout)>
		//   37   79:invokevirtual   #109 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			} else
		//*  38   82:goto            92
			{
				mOffsetAnimator.cancel();
		//   39   85:aload_0         
		//   40   86:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//   41   89:invokevirtual   #91  <Method void ValueAnimator.cancel()>
			}
			mOffsetAnimator.setDuration(Math.min(k, 600));
		//   42   92:aload_0         
		//   43   93:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//   44   96:iload           4
		//   45   98:sipush          600
		//   46  101:invokestatic    #113 <Method int Math.min(int, int)>
		//   47  104:i2l             
		//   48  105:invokevirtual   #117 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//   49  108:pop             
			mOffsetAnimator.setIntValues(new int[] {
				l, i
			});
		//   50  109:aload_0         
		//   51  110:getfield        #82  <Field ValueAnimator mOffsetAnimator>
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
		//   62  125:invokevirtual   #121 <Method void ValueAnimator.setIntValues(int[])>
			mOffsetAnimator.start();
		//   63  128:aload_0         
		//   64  129:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//   65  132:invokevirtual   #124 <Method void ValueAnimator.start()>
		//   66  135:return          
		}

		private static boolean checkFlag(int i, int k)
		{
			return (i & k) == k;
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
			int k = Math.abs(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #64  <Method int Math.abs(int)>
		//    2    4:istore_2        
			i = 0;
		//    3    5:iconst_0        
		//    4    6:istore_1        
			for(int l = appbarlayout.getChildCount(); i < l; i++)
		//*   5    7:aload_0         
		//*   6    8:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
		//*   7   11:istore_3        
		//*   8   12:iload_1         
		//*   9   13:iload_3         
		//*  10   14:icmpge          52
			{
				View view = appbarlayout.getChildAt(i);
		//   11   17:aload_0         
		//   12   18:iload_1         
		//   13   19:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
		//   14   22:astore          4
				if(k >= view.getTop() && k <= view.getBottom())
		//*  15   24:iload_2         
		//*  16   25:aload           4
		//*  17   27:invokevirtual   #140 <Method int View.getTop()>
		//*  18   30:icmplt          45
		//*  19   33:iload_2         
		//*  20   34:aload           4
		//*  21   36:invokevirtual   #143 <Method int View.getBottom()>
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
			int k = 0;
		//    0    0:iconst_0        
		//    1    1:istore_3        
			for(int l = appbarlayout.getChildCount(); k < l; k++)
		//*   2    2:aload_1         
		//*   3    3:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
		//*   4    6:istore          4
		//*   5    8:iload_3         
		//*   6    9:iload           4
		//*   7   11:icmpge          50
			{
				View view = appbarlayout.getChildAt(k);
		//    8   14:aload_1         
		//    9   15:iload_3         
		//   10   16:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
		//   11   19:astore          5
				if(view.getTop() <= -i && view.getBottom() >= -i)
		//*  12   21:aload           5
		//*  13   23:invokevirtual   #140 <Method int View.getTop()>
		//*  14   26:iload_2         
		//*  15   27:ineg            
		//*  16   28:icmpgt          43
		//*  17   31:aload           5
		//*  18   33:invokevirtual   #143 <Method int View.getBottom()>
		//*  19   36:iload_2         
		//*  20   37:ineg            
		//*  21   38:icmplt          43
					return k;
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
			int k1 = Math.abs(i);
		//    0    0:iload_2         
		//    1    1:invokestatic    #64  <Method int Math.abs(int)>
		//    2    4:istore          5
			int k = 0;
		//    3    6:iconst_0        
		//    4    7:istore_3        
			int l = appbarlayout.getChildCount();
		//    5    8:aload_1         
		//    6    9:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
		//    7   12:istore          4
			do
			{
				if(k >= l)
					break;
		//    8   14:iload_3         
		//    9   15:iload           4
		//   10   17:icmpge          201
				View view = appbarlayout.getChildAt(k);
		//   11   20:aload_1         
		//   12   21:iload_3         
		//   13   22:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
		//   14   25:astore          7
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   15   27:aload           7
		//   16   29:invokevirtual   #150 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   17   32:checkcast       #152 <Class AppBarLayout$LayoutParams>
		//   18   35:astore          8
				Interpolator interpolator = layoutparams.getScrollInterpolator();
		//   19   37:aload           8
		//   20   39:invokevirtual   #156 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
		//   21   42:astore          9
				if(k1 >= view.getTop() && k1 <= view.getBottom())
		//*  22   44:iload           5
		//*  23   46:aload           7
		//*  24   48:invokevirtual   #140 <Method int View.getTop()>
		//*  25   51:icmplt          194
		//*  26   54:iload           5
		//*  27   56:aload           7
		//*  28   58:invokevirtual   #143 <Method int View.getBottom()>
		//*  29   61:icmpgt          194
				{
					if(interpolator != null)
		//*  30   64:aload           9
		//*  31   66:ifnull          201
					{
						k = 0;
		//   32   69:iconst_0        
		//   33   70:istore_3        
						int l1 = layoutparams.getScrollFlags();
		//   34   71:aload           8
		//   35   73:invokevirtual   #159 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//   36   76:istore          6
						if((l1 & 1) != 0)
		//*  37   78:iload           6
		//*  38   80:iconst_1        
		//*  39   81:iand            
		//*  40   82:ifeq            125
						{
							int i1 = view.getHeight() + layoutparams.topMargin + layoutparams.bottomMargin + 0;
		//   41   85:aload           7
		//   42   87:invokevirtual   #160 <Method int View.getHeight()>
		//   43   90:aload           8
		//   44   92:getfield        #163 <Field int AppBarLayout$LayoutParams.topMargin>
		//   45   95:iadd            
		//   46   96:aload           8
		//   47   98:getfield        #166 <Field int AppBarLayout$LayoutParams.bottomMargin>
		//   48  101:iadd            
		//   49  102:iconst_0        
		//   50  103:iadd            
		//   51  104:istore          4
							k = i1;
		//   52  106:iload           4
		//   53  108:istore_3        
							if((l1 & 2) != 0)
		//*  54  109:iload           6
		//*  55  111:iconst_2        
		//*  56  112:iand            
		//*  57  113:ifeq            125
								k = i1 - ViewCompat.getMinimumHeight(view);
		//   58  116:iload           4
		//   59  118:aload           7
		//   60  120:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
		//   61  123:isub            
		//   62  124:istore_3        
						}
						int j1 = k;
		//   63  125:iload_3         
		//   64  126:istore          4
						if(ViewCompat.getFitsSystemWindows(view))
		//*  65  128:aload           7
		//*  66  130:invokestatic    #176 <Method boolean ViewCompat.getFitsSystemWindows(View)>
		//*  67  133:ifeq            144
							j1 = k - appbarlayout.getTopInset();
		//   68  136:iload_3         
		//   69  137:aload_1         
		//   70  138:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
		//   71  141:isub            
		//   72  142:istore          4
						if(j1 > 0)
		//*  73  144:iload           4
		//*  74  146:ifle            192
						{
							k = view.getTop();
		//   75  149:aload           7
		//   76  151:invokevirtual   #140 <Method int View.getTop()>
		//   77  154:istore_3        
							k = Math.round((float)j1 * interpolator.getInterpolation((float)(k1 - k) / (float)j1));
		//   78  155:iload           4
		//   79  157:i2f             
		//   80  158:aload           9
		//   81  160:iload           5
		//   82  162:iload_3         
		//   83  163:isub            
		//   84  164:i2f             
		//   85  165:iload           4
		//   86  167:i2f             
		//   87  168:fdiv            
		//   88  169:invokeinterface #184 <Method float Interpolator.getInterpolation(float)>
		//   89  174:fmul            
		//   90  175:invokestatic    #72  <Method int Math.round(float)>
		//   91  178:istore_3        
							return Integer.signum(i) * (view.getTop() + k);
		//   92  179:iload_2         
		//   93  180:invokestatic    #189 <Method int Integer.signum(int)>
		//   94  183:aload           7
		//   95  185:invokevirtual   #140 <Method int View.getTop()>
		//   96  188:iload_3         
		//   97  189:iadd            
		//   98  190:imul            
		//   99  191:ireturn         
						} else
						{
							return i;
		//  100  192:iload_2         
		//  101  193:ireturn         
						}
					}
					break;
				}
				k++;
		//  102  194:iload_3         
		//  103  195:iconst_1        
		//  104  196:iadd            
		//  105  197:istore_3        
			} while(true);
		//  106  198:goto            14
			return i;
		//  107  201:iload_2         
		//  108  202:ireturn         
		}

		private boolean shouldJumpElevationState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			coordinatorlayout = ((CoordinatorLayout) (coordinatorlayout.getDependents(((View) (appbarlayout)))));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #197 <Method List CoordinatorLayout.getDependents(View)>
		//    3    5:astore_1        
			int i = 0;
		//    4    6:iconst_0        
		//    5    7:istore_3        
			for(int k = ((List) (coordinatorlayout)).size(); i < k; i++)
		//*   6    8:aload_1         
		//*   7    9:invokeinterface #202 <Method int List.size()>
		//*   8   14:istore          4
		//*   9   16:iload_3         
		//*  10   17:iload           4
		//*  11   19:icmpge          70
			{
				appbarlayout = ((AppBarLayout) (((CoordinatorLayout.LayoutParams)((View)((List) (coordinatorlayout)).get(i)).getLayoutParams()).getBehavior()));
		//   12   22:aload_1         
		//   13   23:iload_3         
		//   14   24:invokeinterface #206 <Method Object List.get(int)>
		//   15   29:checkcast       #137 <Class View>
		//   16   32:invokevirtual   #150 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   17   35:checkcast       #208 <Class CoordinatorLayout$LayoutParams>
		//   18   38:invokevirtual   #212 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
		//   19   41:astore_2        
				if(appbarlayout instanceof ScrollingViewBehavior)
		//*  20   42:aload_2         
		//*  21   43:instanceof      #214 <Class AppBarLayout$ScrollingViewBehavior>
		//*  22   46:ifeq            63
					return ((ScrollingViewBehavior)appbarlayout).getOverlayTop() != 0;
		//   23   49:aload_2         
		//   24   50:checkcast       #214 <Class AppBarLayout$ScrollingViewBehavior>
		//   25   53:invokevirtual   #217 <Method int AppBarLayout$ScrollingViewBehavior.getOverlayTop()>
		//   26   56:ifeq            61
		//   27   59:iconst_1        
		//   28   60:ireturn         
		//   29   61:iconst_0        
		//   30   62:ireturn         
			}

		//   31   63:iload_3         
		//   32   64:iconst_1        
		//   33   65:iadd            
		//   34   66:istore_3        
		//*  35   67:goto            16
			return false;
		//   36   70:iconst_0        
		//   37   71:ireturn         
		}

		private void snapToChildIfNeeded(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			int j1 = getTopBottomOffsetForScrollingSibling();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:istore          7
			int l = getChildIndexOnOffset(appbarlayout, j1);
		//    3    6:aload_0         
		//    4    7:aload_2         
		//    5    8:iload           7
		//    6   10:invokespecial   #221 <Method int getChildIndexOnOffset(AppBarLayout, int)>
		//    7   13:istore          5
			if(l >= 0)
		//*   8   15:iload           5
		//*   9   17:iflt            191
			{
				View view = appbarlayout.getChildAt(l);
		//   10   20:aload_2         
		//   11   21:iload           5
		//   12   23:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
		//   13   26:astore          9
				int k1 = ((LayoutParams)view.getLayoutParams()).getScrollFlags();
		//   14   28:aload           9
		//   15   30:invokevirtual   #150 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   16   33:checkcast       #152 <Class AppBarLayout$LayoutParams>
		//   17   36:invokevirtual   #159 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//   18   39:istore          8
				if((k1 & 0x11) == 17)
		//*  19   41:iload           8
		//*  20   43:bipush          17
		//*  21   45:iand            
		//*  22   46:bipush          17
		//*  23   48:icmpne          191
				{
					int i1 = -view.getTop();
		//   24   51:aload           9
		//   25   53:invokevirtual   #140 <Method int View.getTop()>
		//   26   56:ineg            
		//   27   57:istore          6
					int i = -view.getBottom();
		//   28   59:aload           9
		//   29   61:invokevirtual   #143 <Method int View.getBottom()>
		//   30   64:ineg            
		//   31   65:istore_3        
					int k = i;
		//   32   66:iload_3         
		//   33   67:istore          4
					if(l == appbarlayout.getChildCount() - 1)
		//*  34   69:iload           5
		//*  35   71:aload_2         
		//*  36   72:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
		//*  37   75:iconst_1        
		//*  38   76:isub            
		//*  39   77:icmpne          88
						k = i + appbarlayout.getTopInset();
		//   40   80:iload_3         
		//   41   81:aload_2         
		//   42   82:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
		//   43   85:iadd            
		//   44   86:istore          4
					if(checkFlag(k1, 2))
		//*  45   88:iload           8
		//*  46   90:iconst_2        
		//*  47   91:invokestatic    #223 <Method boolean checkFlag(int, int)>
		//*  48   94:ifeq            113
					{
						i = k + ViewCompat.getMinimumHeight(view);
		//   49   97:iload           4
		//   50   99:aload           9
		//   51  101:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
		//   52  104:iadd            
		//   53  105:istore_3        
						l = i1;
		//   54  106:iload           6
		//   55  108:istore          5
					} else
		//*  56  110:goto            157
					{
						l = i1;
		//   57  113:iload           6
		//   58  115:istore          5
						i = k;
		//   59  117:iload           4
		//   60  119:istore_3        
						if(checkFlag(k1, 5))
		//*  61  120:iload           8
		//*  62  122:iconst_5        
		//*  63  123:invokestatic    #223 <Method boolean checkFlag(int, int)>
		//*  64  126:ifeq            157
						{
							i = k + ViewCompat.getMinimumHeight(view);
		//   65  129:iload           4
		//   66  131:aload           9
		//   67  133:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
		//   68  136:iadd            
		//   69  137:istore_3        
							if(j1 < i)
		//*  70  138:iload           7
		//*  71  140:iload_3         
		//*  72  141:icmpge          153
							{
								l = i;
		//   73  144:iload_3         
		//   74  145:istore          5
								i = k;
		//   75  147:iload           4
		//   76  149:istore_3        
							} else
		//*  77  150:goto            157
							{
								l = i1;
		//   78  153:iload           6
		//   79  155:istore          5
							}
						}
					}
					if(j1 >= (i + l) / 2)
		//*  80  157:iload           7
		//*  81  159:iload_3         
		//*  82  160:iload           5
		//*  83  162:iadd            
		//*  84  163:iconst_2        
		//*  85  164:idiv            
		//*  86  165:icmpge          171
		//*  87  168:goto            174
						i = l;
		//   88  171:iload           5
		//   89  173:istore_3        
					animateOffsetTo(coordinatorlayout, appbarlayout, w.b(i, -appbarlayout.getTotalScrollRange(), 0), 0.0F);
		//   90  174:aload_0         
		//   91  175:aload_1         
		//   92  176:aload_2         
		//   93  177:iload_3         
		//   94  178:aload_2         
		//   95  179:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
		//   96  182:ineg            
		//   97  183:iconst_0        
		//   98  184:invokestatic    #232 <Method int w.b(int, int, int)>
		//   99  187:fconst_0        
		//  100  188:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
				}
			}
		//  101  191:return          
		}

		private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int k, boolean flag)
		{
			View view = getAppBarChildOnOffset(appbarlayout, i);
		//    0    0:aload_2         
		//    1    1:iload_3         
		//    2    2:invokestatic    #238 <Method View getAppBarChildOnOffset(AppBarLayout, int)>
		//    3    5:astore          10
			if(view != null)
		//*   4    7:aload           10
		//*   5    9:ifnull          166
			{
				int l = ((LayoutParams)view.getLayoutParams()).getScrollFlags();
		//    6   12:aload           10
		//    7   14:invokevirtual   #150 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    8   17:checkcast       #152 <Class AppBarLayout$LayoutParams>
		//    9   20:invokevirtual   #159 <Method int AppBarLayout$LayoutParams.getScrollFlags()>
		//   10   23:istore          6
				boolean flag2 = false;
		//   11   25:iconst_0        
		//   12   26:istore          9
				boolean flag1 = flag2;
		//   13   28:iload           9
		//   14   30:istore          8
				if((l & 1) != 0)
		//*  15   32:iload           6
		//*  16   34:iconst_1        
		//*  17   35:iand            
		//*  18   36:ifeq            127
				{
					int i1 = ViewCompat.getMinimumHeight(view);
		//   19   39:aload           10
		//   20   41:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
		//   21   44:istore          7
					if(k > 0 && (l & 0xc) != 0)
		//*  22   46:iload           4
		//*  23   48:ifle            89
		//*  24   51:iload           6
		//*  25   53:bipush          12
		//*  26   55:iand            
		//*  27   56:ifeq            89
					{
						if(-i >= view.getBottom() - i1 - appbarlayout.getTopInset())
		//*  28   59:iload_3         
		//*  29   60:ineg            
		//*  30   61:aload           10
		//*  31   63:invokevirtual   #143 <Method int View.getBottom()>
		//*  32   66:iload           7
		//*  33   68:isub            
		//*  34   69:aload_2         
		//*  35   70:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
		//*  36   73:isub            
		//*  37   74:icmplt          83
							flag1 = true;
		//   38   77:iconst_1        
		//   39   78:istore          8
						else
		//*  40   80:goto            86
							flag1 = false;
		//   41   83:iconst_0        
		//   42   84:istore          8
					} else
		//*  43   86:goto            127
					{
						flag1 = flag2;
		//   44   89:iload           9
		//   45   91:istore          8
						if((l & 2) != 0)
		//*  46   93:iload           6
		//*  47   95:iconst_2        
		//*  48   96:iand            
		//*  49   97:ifeq            127
							if(-i >= view.getBottom() - i1 - appbarlayout.getTopInset())
		//*  50  100:iload_3         
		//*  51  101:ineg            
		//*  52  102:aload           10
		//*  53  104:invokevirtual   #143 <Method int View.getBottom()>
		//*  54  107:iload           7
		//*  55  109:isub            
		//*  56  110:aload_2         
		//*  57  111:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
		//*  58  114:isub            
		//*  59  115:icmplt          124
								flag1 = true;
		//   60  118:iconst_1        
		//   61  119:istore          8
							else
		//*  62  121:goto            127
								flag1 = false;
		//   63  124:iconst_0        
		//   64  125:istore          8
					}
				}
				flag1 = appbarlayout.setCollapsedState(flag1);
		//   65  127:aload_2         
		//   66  128:iload           8
		//   67  130:invokevirtual   #242 <Method boolean AppBarLayout.setCollapsedState(boolean)>
		//   68  133:istore          8
				if(android.os.Build.VERSION.SDK_INT >= 11 && (flag || flag1 && shouldJumpElevationState(coordinatorlayout, appbarlayout)))
		//*  69  135:getstatic       #247 <Field int android.os.Build$VERSION.SDK_INT>
		//*  70  138:bipush          11
		//*  71  140:icmplt          166
		//*  72  143:iload           5
		//*  73  145:ifne            162
		//*  74  148:iload           8
		//*  75  150:ifeq            166
		//*  76  153:aload_0         
		//*  77  154:aload_1         
		//*  78  155:aload_2         
		//*  79  156:invokespecial   #249 <Method boolean shouldJumpElevationState(CoordinatorLayout, AppBarLayout)>
		//*  80  159:ifeq            166
					appbarlayout.jumpDrawablesToCurrentState();
		//   81  162:aload_2         
		//   82  163:invokevirtual   #252 <Method void AppBarLayout.jumpDrawablesToCurrentState()>
			}
		//   83  166:return          
		}

		boolean canDragView(AppBarLayout appbarlayout)
		{
			if(mOnDragCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #256 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
		//*   2    4:ifnull          16
				return mOnDragCallback.canDrag(appbarlayout);
		//    3    7:aload_0         
		//    4    8:getfield        #256 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
		//    5   11:aload_1         
		//    6   12:invokevirtual   #259 <Method boolean AppBarLayout$Behavior$DragCallback.canDrag(AppBarLayout)>
		//    7   15:ireturn         
			if(mLastNestedScrollingChildRef != null)
		//*   8   16:aload_0         
		//*   9   17:getfield        #261 <Field WeakReference mLastNestedScrollingChildRef>
		//*  10   20:ifnull          57
			{
				appbarlayout = ((AppBarLayout) ((View)mLastNestedScrollingChildRef.get()));
		//   11   23:aload_0         
		//   12   24:getfield        #261 <Field WeakReference mLastNestedScrollingChildRef>
		//   13   27:invokevirtual   #266 <Method Object WeakReference.get()>
		//   14   30:checkcast       #137 <Class View>
		//   15   33:astore_1        
				return appbarlayout != null && ((View) (appbarlayout)).isShown() && !ViewCompat.canScrollVertically(((View) (appbarlayout)), -1);
		//   16   34:aload_1         
		//   17   35:ifnull          55
		//   18   38:aload_1         
		//   19   39:invokevirtual   #269 <Method boolean View.isShown()>
		//   20   42:ifeq            55
		//   21   45:aload_1         
		//   22   46:iconst_m1       
		//   23   47:invokestatic    #273 <Method boolean ViewCompat.canScrollVertically(View, int)>
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

		public volatile boolean canDragView(View view)
		{
			return canDragView((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #275 <Method boolean canDragView(AppBarLayout)>
		//    4    8:ireturn         
		}

		public volatile int getLeftAndRightOffset()
		{
			return super.getLeftAndRightOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #278 <Method int s.getLeftAndRightOffset()>
		//    2    4:ireturn         
		}

		int getMaxDragOffset(AppBarLayout appbarlayout)
		{
			return -appbarlayout.getDownNestedScrollRange();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #283 <Method int AppBarLayout.getDownNestedScrollRange()>
		//    2    4:ineg            
		//    3    5:ireturn         
		}

		public volatile int getMaxDragOffset(View view)
		{
			return getMaxDragOffset((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #285 <Method int getMaxDragOffset(AppBarLayout)>
		//    4    8:ireturn         
		}

		int getScrollRangeForDragFling(AppBarLayout appbarlayout)
		{
			return appbarlayout.getTotalScrollRange();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
		//    2    4:ireturn         
		}

		public volatile int getScrollRangeForDragFling(View view)
		{
			return getScrollRangeForDragFling((AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class AppBarLayout>
		//    3    5:invokevirtual   #288 <Method int getScrollRangeForDragFling(AppBarLayout)>
		//    4    8:ireturn         
		}

		public volatile int getTopAndBottomOffset()
		{
			return super.getTopAndBottomOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #291 <Method int s.getTopAndBottomOffset()>
		//    2    4:ireturn         
		}

		public int getTopBottomOffsetForScrollingSibling()
		{
			return getTopAndBottomOffset() + mOffsetDelta;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #292 <Method int getTopAndBottomOffset()>
		//    2    4:aload_0         
		//    3    5:getfield        #52  <Field int mOffsetDelta>
		//    4    8:iadd            
		//    5    9:ireturn         
		}

		boolean isOffsetAnimatorRunning()
		{
			return mOffsetAnimator != null && mOffsetAnimator.isRunning();
		//    0    0:aload_0         
		//    1    1:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//    2    4:ifnull          19
		//    3    7:aload_0         
		//    4    8:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//    5   11:invokevirtual   #88  <Method boolean ValueAnimator.isRunning()>
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
		//    3    3:invokespecial   #298 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
		//    4    6:return          
		}

		public volatile void onFlingFinished(CoordinatorLayout coordinatorlayout, View view)
		{
			onFlingFinished(coordinatorlayout, (AppBarLayout)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:invokevirtual   #301 <Method void onFlingFinished(CoordinatorLayout, AppBarLayout)>
		//    5    9:return          
		}

		public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
		{
			boolean flag = super.onLayoutChild(coordinatorlayout, ((View) (appbarlayout)), i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #306 <Method boolean s.onLayoutChild(CoordinatorLayout, View, int)>
		//    5    7:istore          5
			int k = appbarlayout.getPendingAction();
		//    6    9:aload_2         
		//    7   10:invokevirtual   #309 <Method int AppBarLayout.getPendingAction()>
		//    8   13:istore          4
			if(mOffsetToChildIndexOnLayout >= 0 && (k & 8) == 0)
		//*   9   15:aload_0         
		//*  10   16:getfield        #44  <Field int mOffsetToChildIndexOnLayout>
		//*  11   19:iflt            98
		//*  12   22:iload           4
		//*  13   24:bipush          8
		//*  14   26:iand            
		//*  15   27:ifne            98
			{
				View view = appbarlayout.getChildAt(mOffsetToChildIndexOnLayout);
		//   16   30:aload_2         
		//   17   31:aload_0         
		//   18   32:getfield        #44  <Field int mOffsetToChildIndexOnLayout>
		//   19   35:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
		//   20   38:astore          6
				i = -view.getBottom();
		//   21   40:aload           6
		//   22   42:invokevirtual   #143 <Method int View.getBottom()>
		//   23   45:ineg            
		//   24   46:istore_3        
				if(mOffsetToChildIndexOnLayoutIsMinHeight)
		//*  25   47:aload_0         
		//*  26   48:getfield        #311 <Field boolean mOffsetToChildIndexOnLayoutIsMinHeight>
		//*  27   51:ifeq            70
					i += ViewCompat.getMinimumHeight(view) + appbarlayout.getTopInset();
		//   28   54:iload_3         
		//   29   55:aload           6
		//   30   57:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
		//   31   60:aload_2         
		//   32   61:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
		//   33   64:iadd            
		//   34   65:iadd            
		//   35   66:istore_3        
				else
		//*  36   67:goto            87
					i += Math.round((float)view.getHeight() * mOffsetToChildIndexOnLayoutPerc);
		//   37   70:iload_3         
		//   38   71:aload           6
		//   39   73:invokevirtual   #160 <Method int View.getHeight()>
		//   40   76:i2f             
		//   41   77:aload_0         
		//   42   78:getfield        #313 <Field float mOffsetToChildIndexOnLayoutPerc>
		//   43   81:fmul            
		//   44   82:invokestatic    #72  <Method int Math.round(float)>
		//   45   85:iadd            
		//   46   86:istore_3        
				setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), i);
		//   47   87:aload_0         
		//   48   88:aload_1         
		//   49   89:aload_2         
		//   50   90:iload_3         
		//   51   91:invokevirtual   #317 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//   52   94:pop             
			} else
		//*  53   95:goto            189
			if(k != 0)
		//*  54   98:iload           4
		//*  55  100:ifeq            189
			{
				if((k & 4) != 0)
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
				if((k & 2) != 0)
		//*  65  117:iload           4
		//*  66  119:iconst_2        
		//*  67  120:iand            
		//*  68  121:ifeq            159
				{
					k = -appbarlayout.getUpNestedPreScrollRange();
		//   69  124:aload_2         
		//   70  125:invokevirtual   #320 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   71  128:ineg            
		//   72  129:istore          4
					if(i != 0)
		//*  73  131:iload_3         
		//*  74  132:ifeq            147
						animateOffsetTo(coordinatorlayout, appbarlayout, k, 0.0F);
		//   75  135:aload_0         
		//   76  136:aload_1         
		//   77  137:aload_2         
		//   78  138:iload           4
		//   79  140:fconst_0        
		//   80  141:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
					else
		//*  81  144:goto            156
						setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), k);
		//   82  147:aload_0         
		//   83  148:aload_1         
		//   84  149:aload_2         
		//   85  150:iload           4
		//   86  152:invokevirtual   #317 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//   87  155:pop             
				} else
		//*  88  156:goto            189
				if((k & 1) != 0)
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
		//  100  175:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
					else
		//* 101  178:goto            189
						setHeaderTopBottomOffset(coordinatorlayout, ((View) (appbarlayout)), 0);
		//  102  181:aload_0         
		//  103  182:aload_1         
		//  104  183:aload_2         
		//  105  184:iconst_0        
		//  106  185:invokevirtual   #317 <Method int setHeaderTopBottomOffset(CoordinatorLayout, View, int)>
		//  107  188:pop             
			}
			appbarlayout.resetPendingAction();
		//  108  189:aload_2         
		//  109  190:invokevirtual   #323 <Method void AppBarLayout.resetPendingAction()>
			mOffsetToChildIndexOnLayout = -1;
		//  110  193:aload_0         
		//  111  194:iconst_m1       
		//  112  195:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
			setTopAndBottomOffset(w.b(getTopAndBottomOffset(), -appbarlayout.getTotalScrollRange(), 0));
		//  113  198:aload_0         
		//  114  199:aload_0         
		//  115  200:invokevirtual   #292 <Method int getTopAndBottomOffset()>
		//  116  203:aload_2         
		//  117  204:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
		//  118  207:ineg            
		//  119  208:iconst_0        
		//  120  209:invokestatic    #232 <Method int w.b(int, int, int)>
		//  121  212:invokevirtual   #327 <Method boolean setTopAndBottomOffset(int)>
		//  122  215:pop             
			updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, getTopAndBottomOffset(), 0, true);
		//  123  216:aload_0         
		//  124  217:aload_1         
		//  125  218:aload_2         
		//  126  219:aload_0         
		//  127  220:invokevirtual   #292 <Method int getTopAndBottomOffset()>
		//  128  223:iconst_0        
		//  129  224:iconst_1        
		//  130  225:invokespecial   #329 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
			appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
		//  131  228:aload_2         
		//  132  229:aload_0         
		//  133  230:invokevirtual   #292 <Method int getTopAndBottomOffset()>
		//  134  233:invokevirtual   #333 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
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
		//    5    7:invokevirtual   #335 <Method boolean onLayoutChild(CoordinatorLayout, AppBarLayout, int)>
		//    6   10:ireturn         
		}

		public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int k, int l, int i1)
		{
			if(((CoordinatorLayout.LayoutParams)appbarlayout.getLayoutParams()).height == -2)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #338 <Method android.view.ViewGroup$LayoutParams AppBarLayout.getLayoutParams()>
		//*   2    4:checkcast       #208 <Class CoordinatorLayout$LayoutParams>
		//*   3    7:getfield        #341 <Field int CoordinatorLayout$LayoutParams.height>
		//*   4   10:bipush          -2
		//*   5   12:icmpne          32
			{
				coordinatorlayout.onMeasureChild(((View) (appbarlayout)), i, k, android.view.View.MeasureSpec.makeMeasureSpec(0, 0), i1);
		//    6   15:aload_1         
		//    7   16:aload_2         
		//    8   17:iload_3         
		//    9   18:iload           4
		//   10   20:iconst_0        
		//   11   21:iconst_0        
		//   12   22:invokestatic    #346 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   13   25:iload           6
		//   14   27:invokevirtual   #349 <Method void CoordinatorLayout.onMeasureChild(View, int, int, int, int)>
				return true;
		//   15   30:iconst_1        
		//   16   31:ireturn         
			} else
			{
				return super.onMeasureChild(coordinatorlayout, ((View) (appbarlayout)), i, k, l, i1);
		//   17   32:aload_0         
		//   18   33:aload_1         
		//   19   34:aload_2         
		//   20   35:iload_3         
		//   21   36:iload           4
		//   22   38:iload           5
		//   23   40:iload           6
		//   24   42:invokespecial   #352 <Method boolean s.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
		//   25   45:ireturn         
			}
		}

		public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int k, int l, int i1)
		{
			return onMeasureChild(coordinatorlayout, (AppBarLayout)view, i, k, l, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:iload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:iload           6
		//    8   13:invokevirtual   #354 <Method boolean onMeasureChild(CoordinatorLayout, AppBarLayout, int, int, int, int)>
		//    9   16:ireturn         
		}

		public boolean onNestedFling(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, float f, float f1, boolean flag)
		{
			boolean flag2 = false;
		//    0    0:iconst_0        
		//    1    1:istore          9
			boolean flag1 = false;
		//    2    3:iconst_0        
		//    3    4:istore          8
			if(!flag)
		//*   4    6:iload           6
		//*   5    8:ifne            31
				flag = fling(coordinatorlayout, ((View) (appbarlayout)), -appbarlayout.getTotalScrollRange(), 0, -f1);
		//    6   11:aload_0         
		//    7   12:aload_1         
		//    8   13:aload_2         
		//    9   14:aload_2         
		//   10   15:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
		//   11   18:ineg            
		//   12   19:iconst_0        
		//   13   20:fload           5
		//   14   22:fneg            
		//   15   23:invokevirtual   #360 <Method boolean fling(CoordinatorLayout, View, int, int, float)>
		//   16   26:istore          6
			else
		//*  17   28:goto            112
			if(f1 < 0.0F)
		//*  18   31:fload           5
		//*  19   33:fconst_0        
		//*  20   34:fcmpg           
		//*  21   35:ifge            79
			{
				int i = -appbarlayout.getTotalScrollRange() + appbarlayout.getDownNestedPreScrollRange();
		//   22   38:aload_2         
		//   23   39:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
		//   24   42:ineg            
		//   25   43:aload_2         
		//   26   44:invokevirtual   #363 <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   27   47:iadd            
		//   28   48:istore          7
				flag = flag1;
		//   29   50:iload           8
		//   30   52:istore          6
				if(getTopBottomOffsetForScrollingSibling() < i)
		//*  31   54:aload_0         
		//*  32   55:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
		//*  33   58:iload           7
		//*  34   60:icmpge          76
				{
					animateOffsetTo(coordinatorlayout, appbarlayout, i, f1);
		//   35   63:aload_0         
		//   36   64:aload_1         
		//   37   65:aload_2         
		//   38   66:iload           7
		//   39   68:fload           5
		//   40   70:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
					flag = true;
		//   41   73:iconst_1        
		//   42   74:istore          6
				}
			} else
		//*  43   76:goto            112
			{
				int k = -appbarlayout.getUpNestedPreScrollRange();
		//   44   79:aload_2         
		//   45   80:invokevirtual   #320 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   46   83:ineg            
		//   47   84:istore          7
				flag = flag2;
		//   48   86:iload           9
		//   49   88:istore          6
				if(getTopBottomOffsetForScrollingSibling() > k)
		//*  50   90:aload_0         
		//*  51   91:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
		//*  52   94:iload           7
		//*  53   96:icmple          112
				{
					animateOffsetTo(coordinatorlayout, appbarlayout, k, f1);
		//   54   99:aload_0         
		//   55  100:aload_1         
		//   56  101:aload_2         
		//   57  102:iload           7
		//   58  104:fload           5
		//   59  106:invokespecial   #234 <Method void animateOffsetTo(CoordinatorLayout, AppBarLayout, int, float)>
					flag = true;
		//   60  109:iconst_1        
		//   61  110:istore          6
				}
			}
			mWasNestedFlung = flag;
		//   62  112:aload_0         
		//   63  113:iload           6
		//   64  115:putfield        #365 <Field boolean mWasNestedFlung>
			return flag;
		//   65  118:iload           6
		//   66  120:ireturn         
		}

		public volatile boolean onNestedFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1, boolean flag)
		{
			return onNestedFling(coordinatorlayout, (AppBarLayout)view, view1, f, f1, flag);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:fload           4
		//    6    9:fload           5
		//    7   11:iload           6
		//    8   13:invokevirtual   #368 <Method boolean onNestedFling(CoordinatorLayout, AppBarLayout, View, float, float, boolean)>
		//    9   16:ireturn         
		}

		public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int k, int ai[])
		{
			if(k != 0 && !mSkipNestedPreScroll)
		//*   0    0:iload           5
		//*   1    2:ifeq            62
		//*   2    5:aload_0         
		//*   3    6:getfield        #372 <Field boolean mSkipNestedPreScroll>
		//*   4    9:ifne            62
			{
				int l;
				if(k < 0)
		//*   5   12:iload           5
		//*   6   14:ifge            36
				{
					i = -appbarlayout.getTotalScrollRange();
		//    7   17:aload_2         
		//    8   18:invokevirtual   #226 <Method int AppBarLayout.getTotalScrollRange()>
		//    9   21:ineg            
		//   10   22:istore          4
					l = i + appbarlayout.getDownNestedPreScrollRange();
		//   11   24:iload           4
		//   12   26:aload_2         
		//   13   27:invokevirtual   #363 <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   14   30:iadd            
		//   15   31:istore          7
				} else
		//*  16   33:goto            46
				{
					i = -appbarlayout.getUpNestedPreScrollRange();
		//   17   36:aload_2         
		//   18   37:invokevirtual   #320 <Method int AppBarLayout.getUpNestedPreScrollRange()>
		//   19   40:ineg            
		//   20   41:istore          4
					l = 0;
		//   21   43:iconst_0        
		//   22   44:istore          7
				}
				ai[1] = scroll(coordinatorlayout, ((View) (appbarlayout)), k, i, l);
		//   23   46:aload           6
		//   24   48:iconst_1        
		//   25   49:aload_0         
		//   26   50:aload_1         
		//   27   51:aload_2         
		//   28   52:iload           5
		//   29   54:iload           4
		//   30   56:iload           7
		//   31   58:invokevirtual   #376 <Method int scroll(CoordinatorLayout, View, int, int, int)>
		//   32   61:iastore         
			}
		//   33   62:return          
		}

		public volatile void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int k, int ai[])
		{
			onNestedPreScroll(coordinatorlayout, (AppBarLayout)view, view1, i, k, ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:aload           6
		//    8   13:invokevirtual   #379 <Method void onNestedPreScroll(CoordinatorLayout, AppBarLayout, View, int, int, int[])>
		//    9   16:return          
		}

		public void onNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int k, int l, int i1)
		{
			if(i1 < 0)
		//*   0    0:iload           7
		//*   1    2:ifge            26
			{
				scroll(coordinatorlayout, ((View) (appbarlayout)), i1, -appbarlayout.getDownNestedScrollRange(), 0);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:iload           7
		//    6   10:aload_2         
		//    7   11:invokevirtual   #283 <Method int AppBarLayout.getDownNestedScrollRange()>
		//    8   14:ineg            
		//    9   15:iconst_0        
		//   10   16:invokevirtual   #376 <Method int scroll(CoordinatorLayout, View, int, int, int)>
		//   11   19:pop             
				mSkipNestedPreScroll = true;
		//   12   20:aload_0         
		//   13   21:iconst_1        
		//   14   22:putfield        #372 <Field boolean mSkipNestedPreScroll>
				return;
		//   15   25:return          
			} else
			{
				mSkipNestedPreScroll = false;
		//   16   26:aload_0         
		//   17   27:iconst_0        
		//   18   28:putfield        #372 <Field boolean mSkipNestedPreScroll>
				return;
		//   19   31:return          
			}
		}

		public volatile void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int k, int l, int i1)
		{
			onNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, i, k, l, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:iload           6
		//    8   13:iload           7
		//    9   15:invokevirtual   #384 <Method void onNestedScroll(CoordinatorLayout, AppBarLayout, View, int, int, int, int)>
		//   10   18:return          
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
		//   10   16:invokevirtual   #390 <Method Parcelable AppBarLayout$Behavior$SavedState.getSuperState()>
		//   11   19:invokespecial   #393 <Method void s.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
				mOffsetToChildIndexOnLayout = ((SavedState) (parcelable)).firstVisibleChildIndex;
		//   12   22:aload_0         
		//   13   23:aload_3         
		//   14   24:getfield        #396 <Field int AppBarLayout$Behavior$SavedState.firstVisibleChildIndex>
		//   15   27:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
				mOffsetToChildIndexOnLayoutPerc = ((SavedState) (parcelable)).firstVisibleChildPercentageShown;
		//   16   30:aload_0         
		//   17   31:aload_3         
		//   18   32:getfield        #399 <Field float AppBarLayout$Behavior$SavedState.firstVisibleChildPercentageShown>
		//   19   35:putfield        #313 <Field float mOffsetToChildIndexOnLayoutPerc>
				mOffsetToChildIndexOnLayoutIsMinHeight = ((SavedState) (parcelable)).firstVisibleChildAtMinimumHeight;
		//   20   38:aload_0         
		//   21   39:aload_3         
		//   22   40:getfield        #402 <Field boolean AppBarLayout$Behavior$SavedState.firstVisibleChildAtMinimumHeight>
		//   23   43:putfield        #311 <Field boolean mOffsetToChildIndexOnLayoutIsMinHeight>
				return;
		//   24   46:return          
			} else
			{
				super.onRestoreInstanceState(coordinatorlayout, ((View) (appbarlayout)), parcelable);
		//   25   47:aload_0         
		//   26   48:aload_1         
		//   27   49:aload_2         
		//   28   50:aload_3         
		//   29   51:invokespecial   #393 <Method void s.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
				mOffsetToChildIndexOnLayout = -1;
		//   30   54:aload_0         
		//   31   55:iconst_m1       
		//   32   56:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
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
		//    5    7:invokevirtual   #404 <Method void onRestoreInstanceState(CoordinatorLayout, AppBarLayout, Parcelable)>
		//    6   10:return          
		}

		public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
		{
			Object obj = ((Object) (super.onSaveInstanceState(coordinatorlayout, ((View) (appbarlayout)))));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #409 <Method Parcelable s.onSaveInstanceState(CoordinatorLayout, View)>
		//    4    6:astore          8
			int k = getTopAndBottomOffset();
		//    5    8:aload_0         
		//    6    9:invokevirtual   #292 <Method int getTopAndBottomOffset()>
		//    7   12:istore          4
			int i = 0;
		//    8   14:iconst_0        
		//    9   15:istore_3        
			for(int l = appbarlayout.getChildCount(); i < l; i++)
		//*  10   16:aload_2         
		//*  11   17:invokevirtual   #131 <Method int AppBarLayout.getChildCount()>
		//*  12   20:istore          5
		//*  13   22:iload_3         
		//*  14   23:iload           5
		//*  15   25:icmpge          129
			{
				coordinatorlayout = ((CoordinatorLayout) (appbarlayout.getChildAt(i)));
		//   16   28:aload_2         
		//   17   29:iload_3         
		//   18   30:invokevirtual   #135 <Method View AppBarLayout.getChildAt(int)>
		//   19   33:astore_1        
				int i1 = ((View) (coordinatorlayout)).getBottom() + k;
		//   20   34:aload_1         
		//   21   35:invokevirtual   #143 <Method int View.getBottom()>
		//   22   38:iload           4
		//   23   40:iadd            
		//   24   41:istore          6
				if(((View) (coordinatorlayout)).getTop() + k <= 0 && i1 >= 0)
		//*  25   43:aload_1         
		//*  26   44:invokevirtual   #140 <Method int View.getTop()>
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
		//   35   64:invokespecial   #412 <Method void AppBarLayout$Behavior$SavedState(Parcelable)>
		//   36   67:astore          8
					obj.firstVisibleChildIndex = i;
		//   37   69:aload           8
		//   38   71:iload_3         
		//   39   72:putfield        #396 <Field int AppBarLayout$Behavior$SavedState.firstVisibleChildIndex>
					boolean flag;
					if(i1 == ViewCompat.getMinimumHeight(((View) (coordinatorlayout))) + appbarlayout.getTopInset())
		//*  40   75:iload           6
		//*  41   77:aload_1         
		//*  42   78:invokestatic    #172 <Method int ViewCompat.getMinimumHeight(View)>
		//*  43   81:aload_2         
		//*  44   82:invokevirtual   #179 <Method int AppBarLayout.getTopInset()>
		//*  45   85:iadd            
		//*  46   86:icmpne          95
						flag = true;
		//   47   89:iconst_1        
		//   48   90:istore          7
					else
		//*  49   92:goto            98
						flag = false;
		//   50   95:iconst_0        
		//   51   96:istore          7
					obj.firstVisibleChildAtMinimumHeight = flag;
		//   52   98:aload           8
		//   53  100:iload           7
		//   54  102:putfield        #402 <Field boolean AppBarLayout$Behavior$SavedState.firstVisibleChildAtMinimumHeight>
					obj.firstVisibleChildPercentageShown = (float)i1 / (float)((View) (coordinatorlayout)).getHeight();
		//   55  105:aload           8
		//   56  107:iload           6
		//   57  109:i2f             
		//   58  110:aload_1         
		//   59  111:invokevirtual   #160 <Method int View.getHeight()>
		//   60  114:i2f             
		//   61  115:fdiv            
		//   62  116:putfield        #399 <Field float AppBarLayout$Behavior$SavedState.firstVisibleChildPercentageShown>
					return ((Parcelable) (obj));
		//   63  119:aload           8
		//   64  121:areturn         
				}
			}

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
		//    4    6:invokevirtual   #414 <Method Parcelable onSaveInstanceState(CoordinatorLayout, AppBarLayout)>
		//    5    9:areturn         
		}

		public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i)
		{
			boolean flag;
			if((i & 2) != 0 && appbarlayout.hasScrollableChildren() && coordinatorlayout.getHeight() - view.getHeight() <= appbarlayout.getHeight())
		//*   0    0:iload           5
		//*   1    2:iconst_2        
		//*   2    3:iand            
		//*   3    4:ifeq            36
		//*   4    7:aload_2         
		//*   5    8:invokevirtual   #419 <Method boolean AppBarLayout.hasScrollableChildren()>
		//*   6   11:ifeq            36
		//*   7   14:aload_1         
		//*   8   15:invokevirtual   #420 <Method int CoordinatorLayout.getHeight()>
		//*   9   18:aload_3         
		//*  10   19:invokevirtual   #160 <Method int View.getHeight()>
		//*  11   22:isub            
		//*  12   23:aload_2         
		//*  13   24:invokevirtual   #75  <Method int AppBarLayout.getHeight()>
		//*  14   27:icmpgt          36
				flag = true;
		//   15   30:iconst_1        
		//   16   31:istore          6
			else
		//*  17   33:goto            39
				flag = false;
		//   18   36:iconst_0        
		//   19   37:istore          6
			if(flag && mOffsetAnimator != null)
		//*  20   39:iload           6
		//*  21   41:ifeq            58
		//*  22   44:aload_0         
		//*  23   45:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//*  24   48:ifnull          58
				mOffsetAnimator.cancel();
		//   25   51:aload_0         
		//   26   52:getfield        #82  <Field ValueAnimator mOffsetAnimator>
		//   27   55:invokevirtual   #91  <Method void ValueAnimator.cancel()>
			mLastNestedScrollingChildRef = null;
		//   28   58:aload_0         
		//   29   59:aconst_null     
		//   30   60:putfield        #261 <Field WeakReference mLastNestedScrollingChildRef>
			return flag;
		//   31   63:iload           6
		//   32   65:ireturn         
		}

		public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
		{
			return onStartNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, view2, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:iload           5
		//    7   11:invokevirtual   #423 <Method boolean onStartNestedScroll(CoordinatorLayout, AppBarLayout, View, View, int)>
		//    8   14:ireturn         
		}

		public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view)
		{
			if(!mWasNestedFlung)
		//*   0    0:aload_0         
		//*   1    1:getfield        #365 <Field boolean mWasNestedFlung>
		//*   2    4:ifne            13
				snapToChildIfNeeded(coordinatorlayout, appbarlayout);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokespecial   #298 <Method void snapToChildIfNeeded(CoordinatorLayout, AppBarLayout)>
			mSkipNestedPreScroll = false;
		//    7   13:aload_0         
		//    8   14:iconst_0        
		//    9   15:putfield        #372 <Field boolean mSkipNestedPreScroll>
			mWasNestedFlung = false;
		//   10   18:aload_0         
		//   11   19:iconst_0        
		//   12   20:putfield        #365 <Field boolean mWasNestedFlung>
			mLastNestedScrollingChildRef = new WeakReference(((Object) (view)));
		//   13   23:aload_0         
		//   14   24:new             #263 <Class WeakReference>
		//   15   27:dup             
		//   16   28:aload_3         
		//   17   29:invokespecial   #428 <Method void WeakReference(Object)>
		//   18   32:putfield        #261 <Field WeakReference mLastNestedScrollingChildRef>
		//   19   35:return          
		}

		public volatile void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			onStopNestedScroll(coordinatorlayout, (AppBarLayout)view, view1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:aload_3         
		//    5    7:invokevirtual   #431 <Method void onStopNestedScroll(CoordinatorLayout, AppBarLayout, View)>
		//    6   10:return          
		}

		public void setDragCallback(DragCallback dragcallback)
		{
			mOnDragCallback = dragcallback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #256 <Field AppBarLayout$Behavior$DragCallback mOnDragCallback>
		//    3    5:return          
		}

		int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int k, int l)
		{
			int i1 = getTopBottomOffsetForScrollingSibling();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method int getTopBottomOffsetForScrollingSibling()>
		//    2    4:istore          6
			if(k != 0 && i1 >= k && i1 <= l)
		//*   3    6:iload           4
		//*   4    8:ifeq            133
		//*   5   11:iload           6
		//*   6   13:iload           4
		//*   7   15:icmplt          133
		//*   8   18:iload           6
		//*   9   20:iload           5
		//*  10   22:icmpgt          133
			{
				k = w.b(i, k, l);
		//   11   25:iload_3         
		//   12   26:iload           4
		//   13   28:iload           5
		//   14   30:invokestatic    #232 <Method int w.b(int, int, int)>
		//   15   33:istore          4
				if(i1 != k)
		//*  16   35:iload           6
		//*  17   37:iload           4
		//*  18   39:icmpeq          138
				{
					if(appbarlayout.hasChildWithInterpolator())
		//*  19   42:aload_2         
		//*  20   43:invokevirtual   #439 <Method boolean AppBarLayout.hasChildWithInterpolator()>
		//*  21   46:ifeq            60
						i = interpolateOffset(appbarlayout, k);
		//   22   49:aload_0         
		//   23   50:aload_2         
		//   24   51:iload           4
		//   25   53:invokespecial   #441 <Method int interpolateOffset(AppBarLayout, int)>
		//   26   56:istore_3        
					else
		//*  27   57:goto            63
						i = k;
		//   28   60:iload           4
		//   29   62:istore_3        
					boolean flag = setTopAndBottomOffset(i);
		//   30   63:aload_0         
		//   31   64:iload_3         
		//   32   65:invokevirtual   #327 <Method boolean setTopAndBottomOffset(int)>
		//   33   68:istore          7
					mOffsetDelta = k - i;
		//   34   70:aload_0         
		//   35   71:iload           4
		//   36   73:iload_3         
		//   37   74:isub            
		//   38   75:putfield        #52  <Field int mOffsetDelta>
					if(!flag && appbarlayout.hasChildWithInterpolator())
		//*  39   78:iload           7
		//*  40   80:ifne            95
		//*  41   83:aload_2         
		//*  42   84:invokevirtual   #439 <Method boolean AppBarLayout.hasChildWithInterpolator()>
		//*  43   87:ifeq            95
						coordinatorlayout.dispatchDependentViewsChanged(((View) (appbarlayout)));
		//   44   90:aload_1         
		//   45   91:aload_2         
		//   46   92:invokevirtual   #445 <Method void CoordinatorLayout.dispatchDependentViewsChanged(View)>
					appbarlayout.dispatchOffsetUpdates(getTopAndBottomOffset());
		//   47   95:aload_2         
		//   48   96:aload_0         
		//   49   97:invokevirtual   #292 <Method int getTopAndBottomOffset()>
		//   50  100:invokevirtual   #333 <Method void AppBarLayout.dispatchOffsetUpdates(int)>
					if(k < i1)
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
					updateAppBarLayoutDrawableState(coordinatorlayout, appbarlayout, k, i, false);
		//   59  117:aload_0         
		//   60  118:aload_1         
		//   61  119:aload_2         
		//   62  120:iload           4
		//   63  122:iload_3         
		//   64  123:iconst_0        
		//   65  124:invokespecial   #329 <Method void updateAppBarLayoutDrawableState(CoordinatorLayout, AppBarLayout, int, int, boolean)>
					return i1 - k;
		//   66  127:iload           6
		//   67  129:iload           4
		//   68  131:isub            
		//   69  132:ireturn         
				}
			} else
			{
				mOffsetDelta = 0;
		//   70  133:aload_0         
		//   71  134:iconst_0        
		//   72  135:putfield        #52  <Field int mOffsetDelta>
			}
			return 0;
		//   73  138:iconst_0        
		//   74  139:ireturn         
		}

		public volatile int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i, int k, int l)
		{
			return setHeaderTopBottomOffset(coordinatorlayout, (AppBarLayout)view, i, k, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class AppBarLayout>
		//    4    6:iload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:invokevirtual   #447 <Method int setHeaderTopBottomOffset(CoordinatorLayout, AppBarLayout, int, int, int)>
		//    8   14:ireturn         
		}

		public volatile boolean setLeftAndRightOffset(int i)
		{
			return super.setLeftAndRightOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #450 <Method boolean s.setLeftAndRightOffset(int)>
		//    3    5:ireturn         
		}

		public volatile boolean setTopAndBottomOffset(int i)
		{
			return super.setTopAndBottomOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #451 <Method boolean s.setTopAndBottomOffset(int)>
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
		private boolean mSkipNestedPreScroll;
		private boolean mWasNestedFlung;


/*
		static int access$000(Behavior behavior)
		{
			return behavior.mOffsetDelta;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field int mOffsetDelta>
		//    2    4:ireturn         
		}

*/

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void s()>
			mOffsetToChildIndexOnLayout = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
		//    5    9:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #48  <Method void s(Context, AttributeSet)>
			mOffsetToChildIndexOnLayout = -1;
		//    4    6:aload_0         
		//    5    7:iconst_m1       
		//    6    8:putfield        #44  <Field int mOffsetToChildIndexOnLayout>
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
		//    3    3:invokespecial   #65  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(firstVisibleChildIndex);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #46  <Field int firstVisibleChildIndex>
		//    7   11:invokevirtual   #69  <Method void Parcel.writeInt(int)>
			parcel.writeFloat(firstVisibleChildPercentageShown);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #52  <Field float firstVisibleChildPercentageShown>
		//   11   19:invokevirtual   #73  <Method void Parcel.writeFloat(float)>
			if(firstVisibleChildAtMinimumHeight)
		//*  12   22:aload_0         
		//*  13   23:getfield        #58  <Field boolean firstVisibleChildAtMinimumHeight>
		//*  14   26:ifeq            34
				i = 1;
		//   15   29:iconst_1        
		//   16   30:istore_2        
			else
		//*  17   31:goto            36
				i = 0;
		//   18   34:iconst_0        
		//   19   35:istore_2        
			parcel.writeByte((byte)i);
		//   20   36:aload_1         
		//   21   37:iload_2         
		//   22   38:int2byte        
		//   23   39:invokevirtual   #77  <Method void Parcel.writeByte(byte)>
		//   24   42:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

			public Behavior.SavedState b(Parcel parcel, ClassLoader classloader)
			{
				return new Behavior.SavedState(parcel, classloader);
			//    0    0:new             #9   <Class AppBarLayout$Behavior$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #25  <Method void AppBarLayout$Behavior$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public Behavior.SavedState[] c(int i)
			{
				return new Behavior.SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       Behavior.SavedState[]
			//    2    4:areturn         
			}

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (b(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #31  <Method AppBarLayout$Behavior$SavedState b(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (c(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #35  <Method AppBarLayout$Behavior$SavedState[] c(int)>
			//    3    5:areturn         
			}

		}
);
		boolean firstVisibleChildAtMinimumHeight;
		int firstVisibleChildIndex;
		float firstVisibleChildPercentageShown;

		static 
		{
		//    0    0:new             #12  <Class AppBarLayout$Behavior$SavedState$4>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void AppBarLayout$Behavior$SavedState$4()>
		//    3    7:invokestatic    #32  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		public Behavior.SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #38  <Method void AbsSavedState(Parcel, ClassLoader)>
			firstVisibleChildIndex = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #44  <Method int Parcel.readInt()>
		//    7   11:putfield        #46  <Field int firstVisibleChildIndex>
			firstVisibleChildPercentageShown = parcel.readFloat();
		//    8   14:aload_0         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #50  <Method float Parcel.readFloat()>
		//   11   19:putfield        #52  <Field float firstVisibleChildPercentageShown>
			boolean flag;
			if(parcel.readByte() != 0)
		//*  12   22:aload_1         
		//*  13   23:invokevirtual   #56  <Method byte Parcel.readByte()>
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
		//   22   38:putfield        #58  <Field boolean firstVisibleChildAtMinimumHeight>
		//   23   41:return          
		}

		public Behavior.SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #61  <Method void AbsSavedState(Parcelable)>
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

		public LayoutParams(int i, int k)
		{
			super(i, k);
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

		public LayoutParams(int i, int k, float f)
		{
			super(i, k, f);
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

	public static class ScrollingViewBehavior extends r
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
			for(int k = list.size(); i < k; i++)
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

		public volatile View findFirstDependency(List list)
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
		//    1    1:invokespecial   #109 <Method int r.getLeftAndRightOffset()>
		//    2    4:ireturn         
		}

		public float getOverlapRatioForOffset(View view)
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
				int k = ((AppBarLayout) (view)).getTotalScrollRange();
		//    6   12:aload_1         
		//    7   13:invokevirtual   #114 <Method int AppBarLayout.getTotalScrollRange()>
		//    8   16:istore_3        
				int l = ((AppBarLayout) (view)).getDownNestedPreScrollRange();
		//    9   17:aload_1         
		//   10   18:invokevirtual   #117 <Method int AppBarLayout.getDownNestedPreScrollRange()>
		//   11   21:istore          4
				int i = getAppBarLayoutOffset(((AppBarLayout) (view)));
		//   12   23:aload_1         
		//   13   24:invokestatic    #119 <Method int getAppBarLayoutOffset(AppBarLayout)>
		//   14   27:istore_2        
				if(l != 0 && k + i <= l)
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
				k -= l;
		//   24   43:iload_3         
		//   25   44:iload           4
		//   26   46:isub            
		//   27   47:istore_3        
				if(k != 0)
		//*  28   48:iload_3         
		//*  29   49:ifeq            60
					return (float)i / (float)k + 1.0F;
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

		public int getScrollRange(View view)
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
		//    9   17:invokespecial   #122 <Method int r.getScrollRange(View)>
		//   10   20:ireturn         
		}

		public volatile int getTopAndBottomOffset()
		{
			return super.getTopAndBottomOffset();
		//    0    0:aload_0         
		//    1    1:invokespecial   #125 <Method int r.getTopAndBottomOffset()>
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
		//    4    4:invokespecial   #134 <Method boolean r.onLayoutChild(CoordinatorLayout, View, int)>
		//    5    7:ireturn         
		}

		public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int k, int l, int i1)
		{
			return super.onMeasureChild(coordinatorlayout, view, i, k, l, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:iload           4
		//    5    6:iload           5
		//    6    8:iload           6
		//    7   10:invokespecial   #138 <Method boolean r.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
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
		//*  30   57:ifne            66
						flag = true;
		//   31   60:iconst_1        
		//   32   61:istore          4
					else
		//*  33   63:goto            69
						flag = false;
		//   34   66:iconst_0        
		//   35   67:istore          4
					appbarlayout.setExpanded(false, flag);
		//   36   69:aload           5
		//   37   71:iconst_0        
		//   38   72:iload           4
		//   39   74:invokevirtual   #177 <Method void AppBarLayout.setExpanded(boolean, boolean)>
					return true;
		//   40   77:iconst_1        
		//   41   78:ireturn         
				}
			}
			return false;
		//   42   79:iconst_0        
		//   43   80:ireturn         
		}

		public volatile boolean setLeftAndRightOffset(int i)
		{
			return super.setLeftAndRightOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #181 <Method boolean r.setLeftAndRightOffset(int)>
		//    3    5:ireturn         
		}

		public volatile boolean setTopAndBottomOffset(int i)
		{
			return super.setTopAndBottomOffset(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #184 <Method boolean r.setTopAndBottomOffset(int)>
		//    3    5:ireturn         
		}

		public ScrollingViewBehavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void r()>
		//    2    4:return          
		}

		public ScrollingViewBehavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void r(Context, AttributeSet)>
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
		mTmpStatesArray = new int[2];
	//   16   26:aload_0         
	//   17   27:iconst_2        
	//   18   28:newarray        int[]
	//   19   30:putfield        #79  <Field int[] mTmpStatesArray>
		setOrientation(1);
	//   20   33:aload_0         
	//   21   34:iconst_1        
	//   22   35:invokevirtual   #83  <Method void setOrientation(int)>
		aa.b(context);
	//   23   38:aload_1         
	//   24   39:invokestatic    #88  <Method void aa.b(Context)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  25   42:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*  26   45:bipush          21
	//*  27   47:icmplt          63
		{
			j.b(((View) (this)));
	//   28   50:aload_0         
	//   29   51:invokestatic    #98  <Method void j.b(View)>
			j.b(((View) (this)), attributeset, 0, android.support.design.R.style.Widget_Design_AppBarLayout);
	//   30   54:aload_0         
	//   31   55:aload_2         
	//   32   56:iconst_0        
	//   33   57:getstatic       #103 <Field int android.support.design.R$style.Widget_Design_AppBarLayout>
	//   34   60:invokestatic    #106 <Method void j.b(View, AttributeSet, int, int)>
		}
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.AppBarLayout, 0, android.support.design.R.style.Widget_Design_AppBarLayout)));
	//   35   63:aload_1         
	//   36   64:aload_2         
	//   37   65:getstatic       #111 <Field int[] android.support.design.R$styleable.AppBarLayout>
	//   38   68:iconst_0        
	//   39   69:getstatic       #103 <Field int android.support.design.R$style.Widget_Design_AppBarLayout>
	//   40   72:invokevirtual   #117 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   41   75:astore_1        
		ViewCompat.setBackground(((View) (this)), ((TypedArray) (context)).getDrawable(android.support.design.R.styleable.AppBarLayout_android_background));
	//   42   76:aload_0         
	//   43   77:aload_1         
	//   44   78:getstatic       #120 <Field int android.support.design.R$styleable.AppBarLayout_android_background>
	//   45   81:invokevirtual   #126 <Method android.graphics.drawable.Drawable TypedArray.getDrawable(int)>
	//   46   84:invokestatic    #132 <Method void ViewCompat.setBackground(View, android.graphics.drawable.Drawable)>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_expanded))
	//*  47   87:aload_1         
	//*  48   88:getstatic       #135 <Field int android.support.design.R$styleable.AppBarLayout_expanded>
	//*  49   91:invokevirtual   #139 <Method boolean TypedArray.hasValue(int)>
	//*  50   94:ifeq            111
			setExpanded(((TypedArray) (context)).getBoolean(android.support.design.R.styleable.AppBarLayout_expanded, false), false, false);
	//   51   97:aload_0         
	//   52   98:aload_1         
	//   53   99:getstatic       #135 <Field int android.support.design.R$styleable.AppBarLayout_expanded>
	//   54  102:iconst_0        
	//   55  103:invokevirtual   #143 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   56  106:iconst_0        
	//   57  107:iconst_0        
	//   58  108:invokespecial   #147 <Method void setExpanded(boolean, boolean, boolean)>
		if(android.os.Build.VERSION.SDK_INT >= 21 && ((TypedArray) (context)).hasValue(android.support.design.R.styleable.AppBarLayout_elevation))
	//*  59  111:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*  60  114:bipush          21
	//*  61  116:icmplt          142
	//*  62  119:aload_1         
	//*  63  120:getstatic       #150 <Field int android.support.design.R$styleable.AppBarLayout_elevation>
	//*  64  123:invokevirtual   #139 <Method boolean TypedArray.hasValue(int)>
	//*  65  126:ifeq            142
			j.a(((View) (this)), ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.AppBarLayout_elevation, 0));
	//   66  129:aload_0         
	//   67  130:aload_1         
	//   68  131:getstatic       #150 <Field int android.support.design.R$styleable.AppBarLayout_elevation>
	//   69  134:iconst_0        
	//   70  135:invokevirtual   #154 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   71  138:i2f             
	//   72  139:invokestatic    #158 <Method void j.a(View, float)>
		((TypedArray) (context)).recycle();
	//   73  142:aload_1         
	//   74  143:invokevirtual   #162 <Method void TypedArray.recycle()>
		ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), new OnApplyWindowInsetsListener() {

			public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
			{
				return c.onWindowInsetChanged(windowinsetscompat);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field AppBarLayout c>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #26  <Method WindowInsetsCompat AppBarLayout.onWindowInsetChanged(WindowInsetsCompat)>
			//    4    8:areturn         
			}

			final AppBarLayout c;

			
			{
				c = AppBarLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AppBarLayout c>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   75  146:aload_0         
	//   76  147:new             #6   <Class AppBarLayout$1>
	//   77  150:dup             
	//   78  151:aload_0         
	//   79  152:invokespecial   #165 <Method void AppBarLayout$1(AppBarLayout)>
	//   80  155:invokestatic    #169 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//   81  158:return          
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
	//*   1    1:getfield        #174 <Field boolean mCollapsible>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			mCollapsible = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #174 <Field boolean mCollapsible>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #177 <Method void refreshDrawableState()>
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
		byte byte1;
		if(flag1)
	//*   7   13:iload_2         
	//*   8   14:ifeq            23
			byte1 = 4;
	//    9   17:iconst_4        
	//   10   18:istore          5
		else
	//*  11   20:goto            26
			byte1 = 0;
	//   12   23:iconst_0        
	//   13   24:istore          5
		byte byte2;
		if(flag2)
	//*  14   26:iload_3         
	//*  15   27:ifeq            37
			byte2 = 8;
	//   16   30:bipush          8
	//   17   32:istore          6
		else
	//*  18   34:goto            40
			byte2 = 0;
	//   19   37:iconst_0        
	//   20   38:istore          6
		mPendingAction = byte0 | byte1 | byte2;
	//   21   40:aload_0         
	//   22   41:iload           4
	//   23   43:iload           5
	//   24   45:ior             
	//   25   46:iload           6
	//   26   48:ior             
	//   27   49:putfield        #77  <Field int mPendingAction>
		requestLayout();
	//   28   52:aload_0         
	//   29   53:invokevirtual   #180 <Method void requestLayout()>
	//   30   56:return          
	}

	private void updateCollapsible()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int i = 0;
	//    2    3:iconst_0        
	//    3    4:istore_1        
		int k = getChildCount();
	//    4    5:aload_0         
	//    5    6:invokevirtual   #185 <Method int getChildCount()>
	//    6    9:istore_2        
		boolean flag;
		do
		{
			flag = flag1;
	//    7   10:iload           4
	//    8   12:istore_3        
			if(i >= k)
				break;
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:icmpge          47
			if(((LayoutParams)getChildAt(i).getLayoutParams()).isCollapsible())
	//*  12   18:aload_0         
	//*  13   19:iload_1         
	//*  14   20:invokevirtual   #189 <Method View getChildAt(int)>
	//*  15   23:invokevirtual   #195 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  16   26:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//*  17   29:invokevirtual   #199 <Method boolean AppBarLayout$LayoutParams.isCollapsible()>
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
	//   29   49:invokespecial   #201 <Method boolean setCollapsibleState(boolean)>
	//   30   52:pop             
	//   31   53:return          
	}

	public void addOnOffsetChangedListener(OnOffsetChangedListener onoffsetchangedlistener)
	{
		if(mListeners == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field List mListeners>
	//*   2    4:ifnonnull       18
			mListeners = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #207 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #209 <Method void ArrayList()>
	//    7   15:putfield        #205 <Field List mListeners>
		if(onoffsetchangedlistener != null && !mListeners.contains(((Object) (onoffsetchangedlistener))))
	//*   8   18:aload_1         
	//*   9   19:ifnull          46
	//*  10   22:aload_0         
	//*  11   23:getfield        #205 <Field List mListeners>
	//*  12   26:aload_1         
	//*  13   27:invokeinterface #215 <Method boolean List.contains(Object)>
	//*  14   32:ifne            46
			mListeners.add(((Object) (onoffsetchangedlistener)));
	//   15   35:aload_0         
	//   16   36:getfield        #205 <Field List mListeners>
	//   17   39:aload_1         
	//   18   40:invokeinterface #218 <Method boolean List.add(Object)>
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
	//*   1    1:getfield        #205 <Field List mListeners>
	//*   2    4:ifnull          60
		{
			int k = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(int l = mListeners.size(); k < l; k++)
	//*   5    9:aload_0         
	//*   6   10:getfield        #205 <Field List mListeners>
	//*   7   13:invokeinterface #224 <Method int List.size()>
	//*   8   18:istore_3        
	//*   9   19:iload_2         
	//*  10   20:iload_3         
	//*  11   21:icmpge          60
			{
				OnOffsetChangedListener onoffsetchangedlistener = (OnOffsetChangedListener)mListeners.get(k);
	//   12   24:aload_0         
	//   13   25:getfield        #205 <Field List mListeners>
	//   14   28:iload_2         
	//   15   29:invokeinterface #228 <Method Object List.get(int)>
	//   16   34:checkcast       #27  <Class AppBarLayout$OnOffsetChangedListener>
	//   17   37:astore          4
				if(onoffsetchangedlistener != null)
	//*  18   39:aload           4
	//*  19   41:ifnull          53
					onoffsetchangedlistener.onOffsetChanged(this, i);
	//   20   44:aload           4
	//   21   46:aload_0         
	//   22   47:iload_1         
	//   23   48:invokeinterface #232 <Method void AppBarLayout$OnOffsetChangedListener.onOffsetChanged(AppBarLayout, int)>
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
	//    4    7:invokespecial   #237 <Method void AppBarLayout$LayoutParams(int, int)>
	//    5   10:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method AppBarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	protected volatile android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.widget.LinearLayout.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method AppBarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #21  <Class AppBarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #246 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #247 <Method void AppBarLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19 && (layoutparams instanceof android.widget.LinearLayout.LayoutParams))
	//*   0    0:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          27
	//*   3    8:aload_1         
	//*   4    9:instanceof      #250 <Class android.widget.LinearLayout$LayoutParams>
	//*   5   12:ifeq            27
			return new LayoutParams((android.widget.LinearLayout.LayoutParams)layoutparams);
	//    6   15:new             #21  <Class AppBarLayout$LayoutParams>
	//    7   18:dup             
	//    8   19:aload_1         
	//    9   20:checkcast       #250 <Class android.widget.LinearLayout$LayoutParams>
	//   10   23:invokespecial   #253 <Method void AppBarLayout$LayoutParams(android.widget.LinearLayout$LayoutParams)>
	//   11   26:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  12   27:aload_1         
	//*  13   28:instanceof      #255 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  14   31:ifeq            46
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   15   34:new             #21  <Class AppBarLayout$LayoutParams>
	//   16   37:dup             
	//   17   38:aload_1         
	//   18   39:checkcast       #255 <Class android.view.ViewGroup$MarginLayoutParams>
	//   19   42:invokespecial   #258 <Method void AppBarLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   20   45:areturn         
		else
			return new LayoutParams(layoutparams);
	//   21   46:new             #21  <Class AppBarLayout$LayoutParams>
	//   22   49:dup             
	//   23   50:aload_1         
	//   24   51:invokespecial   #261 <Method void AppBarLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   25   54:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #264 <Method AppBarLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #267 <Method AppBarLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.widget.LinearLayout.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #264 <Method AppBarLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.widget.LinearLayout.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #267 <Method AppBarLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
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
		int i1 = 0;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		for(int l = getChildCount() - 1; l >= 0;)
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #185 <Method int getChildCount()>
	//*  11   19:iconst_1        
	//*  12   20:isub            
	//*  13   21:istore_2        
	//*  14   22:iload_2         
	//*  15   23:iflt            147
		{
			View view = getChildAt(l);
	//   16   26:aload_0         
	//   17   27:iload_2         
	//   18   28:invokevirtual   #189 <Method View getChildAt(int)>
	//   19   31:astore          5
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   20   33:aload           5
	//   21   35:invokevirtual   #195 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   38:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   23   41:astore          6
			int i = view.getMeasuredHeight();
	//   24   43:aload           5
	//   25   45:invokevirtual   #273 <Method int View.getMeasuredHeight()>
	//   26   48:istore_1        
			int j1 = layoutparams.mScrollFlags;
	//   27   49:aload           6
	//   28   51:getfield        #276 <Field int AppBarLayout$LayoutParams.mScrollFlags>
	//   29   54:istore          4
			if((j1 & 5) == 5)
	//*  30   56:iload           4
	//*  31   58:iconst_5        
	//*  32   59:iand            
	//*  33   60:iconst_5        
	//*  34   61:icmpne          129
			{
				i1 += layoutparams.topMargin + layoutparams.bottomMargin;
	//   35   64:iload_3         
	//   36   65:aload           6
	//   37   67:getfield        #279 <Field int AppBarLayout$LayoutParams.topMargin>
	//   38   70:aload           6
	//   39   72:getfield        #282 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   40   75:iadd            
	//   41   76:iadd            
	//   42   77:istore_3        
				if((j1 & 8) != 0)
	//*  43   78:iload           4
	//*  44   80:bipush          8
	//*  45   82:iand            
	//*  46   83:ifeq            97
					i = i1 + ViewCompat.getMinimumHeight(view);
	//   47   86:iload_3         
	//   48   87:aload           5
	//   49   89:invokestatic    #286 <Method int ViewCompat.getMinimumHeight(View)>
	//   50   92:iadd            
	//   51   93:istore_1        
				else
	//*  52   94:goto            138
				if((j1 & 2) != 0)
	//*  53   97:iload           4
	//*  54   99:iconst_2        
	//*  55  100:iand            
	//*  56  101:ifeq            117
					i = i1 + (i - ViewCompat.getMinimumHeight(view));
	//   57  104:iload_3         
	//   58  105:iload_1         
	//   59  106:aload           5
	//   60  108:invokestatic    #286 <Method int ViewCompat.getMinimumHeight(View)>
	//   61  111:isub            
	//   62  112:iadd            
	//   63  113:istore_1        
				else
	//*  64  114:goto            138
					i = i1 + (i - getTopInset());
	//   65  117:iload_3         
	//   66  118:iload_1         
	//   67  119:aload_0         
	//   68  120:invokevirtual   #289 <Method int getTopInset()>
	//   69  123:isub            
	//   70  124:iadd            
	//   71  125:istore_1        
			} else
	//*  72  126:goto            138
			{
				i = i1;
	//   73  129:iload_3         
	//   74  130:istore_1        
				if(i1 > 0)
	//*  75  131:iload_3         
	//*  76  132:ifle            138
					break;
	//   77  135:goto            147
			}
			l--;
	//   78  138:iload_2         
	//   79  139:iconst_1        
	//   80  140:isub            
	//   81  141:istore_2        
			i1 = i;
	//   82  142:iload_1         
	//   83  143:istore_3        
		}

	//*  84  144:goto            22
		int k = Math.max(0, i1);
	//   85  147:iconst_0        
	//   86  148:iload_3         
	//   87  149:invokestatic    #294 <Method int Math.max(int, int)>
	//   88  152:istore_1        
		mDownPreScrollRange = k;
	//   89  153:aload_0         
	//   90  154:iload_1         
	//   91  155:putfield        #73  <Field int mDownPreScrollRange>
		return k;
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
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		int k = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		int i1 = getChildCount();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #185 <Method int getChildCount()>
	//   13   21:istore          4
		int l;
		do
		{
			l = i;
	//   14   23:iload_1         
	//   15   24:istore_3        
			if(k >= i1)
				break;
	//   16   25:iload_2         
	//   17   26:iload           4
	//   18   28:icmpge          126
			View view = getChildAt(k);
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #189 <Method View getChildAt(int)>
	//   22   36:astore          9
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   38:aload           9
	//   24   40:invokevirtual   #195 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   43:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   26   46:astore          10
			int k1 = view.getMeasuredHeight();
	//   27   48:aload           9
	//   28   50:invokevirtual   #273 <Method int View.getMeasuredHeight()>
	//   29   53:istore          6
			int l1 = layoutparams.topMargin;
	//   30   55:aload           10
	//   31   57:getfield        #279 <Field int AppBarLayout$LayoutParams.topMargin>
	//   32   60:istore          7
			int i2 = layoutparams.bottomMargin;
	//   33   62:aload           10
	//   34   64:getfield        #282 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   35   67:istore          8
			int j1 = layoutparams.mScrollFlags;
	//   36   69:aload           10
	//   37   71:getfield        #276 <Field int AppBarLayout$LayoutParams.mScrollFlags>
	//   38   74:istore          5
			l = i;
	//   39   76:iload_1         
	//   40   77:istore_3        
			if((j1 & 1) == 0)
				break;
	//   41   78:iload           5
	//   42   80:iconst_1        
	//   43   81:iand            
	//   44   82:ifeq            126
			i += k1 + (l1 + i2);
	//   45   85:iload_1         
	//   46   86:iload           6
	//   47   88:iload           7
	//   48   90:iload           8
	//   49   92:iadd            
	//   50   93:iadd            
	//   51   94:iadd            
	//   52   95:istore_1        
			if((j1 & 2) != 0)
	//*  53   96:iload           5
	//*  54   98:iconst_2        
	//*  55   99:iand            
	//*  56  100:ifeq            119
			{
				l = i - (ViewCompat.getMinimumHeight(view) + getTopInset());
	//   57  103:iload_1         
	//   58  104:aload           9
	//   59  106:invokestatic    #286 <Method int ViewCompat.getMinimumHeight(View)>
	//   60  109:aload_0         
	//   61  110:invokevirtual   #289 <Method int getTopInset()>
	//   62  113:iadd            
	//   63  114:isub            
	//   64  115:istore_3        
				break;
	//   65  116:goto            126
			}
			k++;
	//   66  119:iload_2         
	//   67  120:iconst_1        
	//   68  121:iadd            
	//   69  122:istore_2        
		} while(true);
	//   70  123:goto            23
		i = Math.max(0, l);
	//   71  126:iconst_0        
	//   72  127:iload_3         
	//   73  128:invokestatic    #294 <Method int Math.max(int, int)>
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
		int k = getTopInset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #289 <Method int getTopInset()>
	//    2    4:istore_2        
		int i = ViewCompat.getMinimumHeight(((View) (this)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #286 <Method int ViewCompat.getMinimumHeight(View)>
	//    5    9:istore_1        
		if(i != 0)
	//*   6   10:iload_1         
	//*   7   11:ifeq            20
			return i * 2 + k;
	//    8   14:iload_1         
	//    9   15:iconst_2        
	//   10   16:imul            
	//   11   17:iload_2         
	//   12   18:iadd            
	//   13   19:ireturn         
		i = getChildCount();
	//   14   20:aload_0         
	//   15   21:invokevirtual   #185 <Method int getChildCount()>
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
	//   24   34:invokevirtual   #189 <Method View getChildAt(int)>
	//   25   37:invokestatic    #286 <Method int ViewCompat.getMinimumHeight(View)>
	//   26   40:istore_1        
		else
	//*  27   41:goto            46
			i = 0;
	//   28   44:iconst_0        
	//   29   45:istore_1        
		if(i != 0)
	//*  30   46:iload_1         
	//*  31   47:ifeq            56
			return i * 2 + k;
	//   32   50:iload_1         
	//   33   51:iconst_2        
	//   34   52:imul            
	//   35   53:iload_2         
	//   36   54:iadd            
	//   37   55:ireturn         
		else
			return getHeight() / 3;
	//   38   56:aload_0         
	//   39   57:invokevirtual   #299 <Method int getHeight()>
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
	//*   1    1:getfield        #307 <Field WindowInsetsCompat mLastInsets>
	//*   2    4:ifnull          15
			return mLastInsets.getSystemWindowInsetTop();
	//    3    7:aload_0         
	//    4    8:getfield        #307 <Field WindowInsetsCompat mLastInsets>
	//    5   11:invokevirtual   #312 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
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
		int k = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		int i1 = getChildCount();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #185 <Method int getChildCount()>
	//   13   21:istore          4
		int l;
		do
		{
			l = i;
	//   14   23:iload_1         
	//   15   24:istore_3        
			if(k >= i1)
				break;
	//   16   25:iload_2         
	//   17   26:iload           4
	//   18   28:icmpge          113
			View view = getChildAt(k);
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #189 <Method View getChildAt(int)>
	//   22   36:astore          7
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   23   38:aload           7
	//   24   40:invokevirtual   #195 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   43:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//   26   46:astore          8
			int k1 = view.getMeasuredHeight();
	//   27   48:aload           7
	//   28   50:invokevirtual   #273 <Method int View.getMeasuredHeight()>
	//   29   53:istore          6
			int j1 = layoutparams.mScrollFlags;
	//   30   55:aload           8
	//   31   57:getfield        #276 <Field int AppBarLayout$LayoutParams.mScrollFlags>
	//   32   60:istore          5
			l = i;
	//   33   62:iload_1         
	//   34   63:istore_3        
			if((j1 & 1) == 0)
				break;
	//   35   64:iload           5
	//   36   66:iconst_1        
	//   37   67:iand            
	//   38   68:ifeq            113
			i += layoutparams.topMargin + k1 + layoutparams.bottomMargin;
	//   39   71:iload_1         
	//   40   72:aload           8
	//   41   74:getfield        #279 <Field int AppBarLayout$LayoutParams.topMargin>
	//   42   77:iload           6
	//   43   79:iadd            
	//   44   80:aload           8
	//   45   82:getfield        #282 <Field int AppBarLayout$LayoutParams.bottomMargin>
	//   46   85:iadd            
	//   47   86:iadd            
	//   48   87:istore_1        
			if((j1 & 2) != 0)
	//*  49   88:iload           5
	//*  50   90:iconst_2        
	//*  51   91:iand            
	//*  52   92:ifeq            106
			{
				l = i - ViewCompat.getMinimumHeight(view);
	//   53   95:iload_1         
	//   54   96:aload           7
	//   55   98:invokestatic    #286 <Method int ViewCompat.getMinimumHeight(View)>
	//   56  101:isub            
	//   57  102:istore_3        
				break;
	//   58  103:goto            113
			}
			k++;
	//   59  106:iload_2         
	//   60  107:iconst_1        
	//   61  108:iadd            
	//   62  109:istore_2        
		} while(true);
	//   63  110:goto            23
		i = Math.max(0, l - getTopInset());
	//   64  113:iconst_0        
	//   65  114:iload_3         
	//   66  115:aload_0         
	//   67  116:invokevirtual   #289 <Method int getTopInset()>
	//   68  119:isub            
	//   69  120:invokestatic    #294 <Method int Math.max(int, int)>
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
	//    1    1:invokevirtual   #317 <Method int getTotalScrollRange()>
	//    2    4:ireturn         
	}

	boolean hasChildWithInterpolator()
	{
		return mHaveChildWithInterpolator;
	//    0    0:aload_0         
	//    1    1:getfield        #320 <Field boolean mHaveChildWithInterpolator>
	//    2    4:ireturn         
	}

	boolean hasScrollableChildren()
	{
		return getTotalScrollRange() != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #317 <Method int getTotalScrollRange()>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected int[] onCreateDrawableState(int i)
	{
		int ai[] = mTmpStatesArray;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int[] mTmpStatesArray>
	//    2    4:astore_2        
		int ai1[] = super.onCreateDrawableState(ai.length + i);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:arraylength     
	//    6    8:iload_1         
	//    7    9:iadd            
	//    8   10:invokespecial   #325 <Method int[] LinearLayout.onCreateDrawableState(int)>
	//    9   13:astore_3        
		if(mCollapsible)
	//*  10   14:aload_0         
	//*  11   15:getfield        #174 <Field boolean mCollapsible>
	//*  12   18:ifeq            28
			i = android.support.design.R.attr.state_collapsible;
	//   13   21:getstatic       #330 <Field int android.support.design.R$attr.state_collapsible>
	//   14   24:istore_1        
		else
	//*  15   25:goto            33
			i = -android.support.design.R.attr.state_collapsible;
	//   16   28:getstatic       #330 <Field int android.support.design.R$attr.state_collapsible>
	//   17   31:ineg            
	//   18   32:istore_1        
		ai[0] = i;
	//   19   33:aload_2         
	//   20   34:iconst_0        
	//   21   35:iload_1         
	//   22   36:iastore         
		if(mCollapsible && mCollapsed)
	//*  23   37:aload_0         
	//*  24   38:getfield        #174 <Field boolean mCollapsible>
	//*  25   41:ifeq            58
	//*  26   44:aload_0         
	//*  27   45:getfield        #332 <Field boolean mCollapsed>
	//*  28   48:ifeq            58
			i = android.support.design.R.attr.state_collapsed;
	//   29   51:getstatic       #335 <Field int android.support.design.R$attr.state_collapsed>
	//   30   54:istore_1        
		else
	//*  31   55:goto            63
			i = -android.support.design.R.attr.state_collapsed;
	//   32   58:getstatic       #335 <Field int android.support.design.R$attr.state_collapsed>
	//   33   61:ineg            
	//   34   62:istore_1        
		ai[1] = i;
	//   35   63:aload_2         
	//   36   64:iconst_1        
	//   37   65:iload_1         
	//   38   66:iastore         
		return mergeDrawableStates(ai1, ai);
	//   39   67:aload_3         
	//   40   68:aload_2         
	//   41   69:invokestatic    #339 <Method int[] mergeDrawableStates(int[], int[])>
	//   42   72:areturn         
	}

	protected void onLayout(boolean flag, int i, int k, int l, int i1)
	{
		super.onLayout(flag, i, k, l, i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #343 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
		invalidateScrollRanges();
	//    7   11:aload_0         
	//    8   12:invokespecial   #345 <Method void invalidateScrollRanges()>
		mHaveChildWithInterpolator = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #320 <Field boolean mHaveChildWithInterpolator>
		i = 0;
	//   12   20:iconst_0        
	//   13   21:istore_2        
		k = getChildCount();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #185 <Method int getChildCount()>
	//   16   26:istore_3        
		do
		{
			if(i >= k)
				break;
	//   17   27:iload_2         
	//   18   28:iload_3         
	//   19   29:icmpge          64
			if(((LayoutParams)getChildAt(i).getLayoutParams()).getScrollInterpolator() != null)
	//*  20   32:aload_0         
	//*  21   33:iload_2         
	//*  22   34:invokevirtual   #189 <Method View getChildAt(int)>
	//*  23   37:invokevirtual   #195 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  24   40:checkcast       #21  <Class AppBarLayout$LayoutParams>
	//*  25   43:invokevirtual   #349 <Method Interpolator AppBarLayout$LayoutParams.getScrollInterpolator()>
	//*  26   46:ifnull          57
			{
				mHaveChildWithInterpolator = true;
	//   27   49:aload_0         
	//   28   50:iconst_1        
	//   29   51:putfield        #320 <Field boolean mHaveChildWithInterpolator>
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
	//   37   65:invokespecial   #351 <Method void updateCollapsible()>
	//   38   68:return          
	}

	protected void onMeasure(int i, int k)
	{
		super.onMeasure(i, k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #354 <Method void LinearLayout.onMeasure(int, int)>
		invalidateScrollRanges();
	//    4    6:aload_0         
	//    5    7:invokespecial   #345 <Method void invalidateScrollRanges()>
	//    6   10:return          
	}

	WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat windowinsetscompat)
	{
		WindowInsetsCompat windowinsetscompat1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #360 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   4    6:ifeq            11
			windowinsetscompat1 = windowinsetscompat;
	//    5    9:aload_1         
	//    6   10:astore_2        
		if(!ad.a(((Object) (mLastInsets)), ((Object) (windowinsetscompat1))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #307 <Field WindowInsetsCompat mLastInsets>
	//*   9   15:aload_2         
	//*  10   16:invokestatic    #365 <Method boolean ad.a(Object, Object)>
	//*  11   19:ifne            31
		{
			mLastInsets = windowinsetscompat1;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #307 <Field WindowInsetsCompat mLastInsets>
			invalidateScrollRanges();
	//   15   27:aload_0         
	//   16   28:invokespecial   #345 <Method void invalidateScrollRanges()>
		}
		return windowinsetscompat;
	//   17   31:aload_1         
	//   18   32:areturn         
	}

	public void removeOnOffsetChangedListener(OnOffsetChangedListener onoffsetchangedlistener)
	{
		if(mListeners != null && onoffsetchangedlistener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field List mListeners>
	//*   2    4:ifnull          22
	//*   3    7:aload_1         
	//*   4    8:ifnull          22
			mListeners.remove(((Object) (onoffsetchangedlistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #205 <Field List mListeners>
	//    7   15:aload_1         
	//    8   16:invokeinterface #369 <Method boolean List.remove(Object)>
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
	//*   1    1:getfield        #332 <Field boolean mCollapsed>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          19
		{
			mCollapsed = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #332 <Field boolean mCollapsed>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #177 <Method void refreshDrawableState()>
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
	//    3    3:invokestatic    #375 <Method boolean ViewCompat.isLaidOut(View)>
	//    4    6:invokevirtual   #378 <Method void setExpanded(boolean, boolean)>
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
	//    3    5:new             #380 <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc2            #382 <String "AppBarLayout is always vertical and does not support horizontal orientation">
	//    6   12:invokespecial   #385 <Method void IllegalArgumentException(String)>
	//    7   15:athrow          
		} else
		{
			super.setOrientation(i);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:invokespecial   #386 <Method void LinearLayout.setOrientation(int)>
			return;
	//   11   21:return          
		}
	}

	public void setTargetElevation(float f)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			j.a(((View) (this)), f);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:invokestatic    #158 <Method void j.a(View, float)>
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
	private final int mTmpStatesArray[];
	private int mTotalScrollRange;
}
