// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.content.res.*;
import android.database.DataSetObserver;
import android.graphics.*;
import android.graphics.drawable.*;
import android.support.design.animation.AnimationUtils;
import android.support.design.internal.ThemeEnforcement;
import android.support.design.internal.ViewUtils;
import android.support.design.resources.MaterialResources;
import android.support.design.ripple.RippleUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.*;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.TooltipCompat;
import android.text.*;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.*;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.widget:
//			TabItem

public class TabLayout extends HorizontalScrollView
{
	private class AdapterChangeListener
		implements android.support.v4.view.ViewPager.OnAdapterChangeListener
	{

		public void onAdapterChanged(ViewPager viewpager, PagerAdapter pageradapter, PagerAdapter pageradapter1)
		{
			if(viewPager == viewpager)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field TabLayout this$0>
		//*   2    4:getfield        #29  <Field ViewPager TabLayout.viewPager>
		//*   3    7:aload_1         
		//*   4    8:if_acmpne       23
				setPagerAdapter(pageradapter1, autoRefresh);
		//    5   11:aload_0         
		//    6   12:getfield        #17  <Field TabLayout this$0>
		//    7   15:aload_3         
		//    8   16:aload_0         
		//    9   17:getfield        #31  <Field boolean autoRefresh>
		//   10   20:invokevirtual   #35  <Method void TabLayout.setPagerAdapter(PagerAdapter, boolean)>
		//   11   23:return          
		}

		void setAutoRefresh(boolean flag)
		{
			autoRefresh = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #31  <Field boolean autoRefresh>
		//    3    5:return          
		}

		private boolean autoRefresh;
		final TabLayout this$0;

		AdapterChangeListener()
		{
			this$0 = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field TabLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}
	}

	public static interface BaseOnTabSelectedListener
	{

		public abstract void onTabReselected(Tab tab);

		public abstract void onTabSelected(Tab tab);

		public abstract void onTabUnselected(Tab tab);
	}

	public static interface Mode
		extends Annotation
	{
	}

	public static interface OnTabSelectedListener
		extends BaseOnTabSelectedListener
	{
	}

	private class PagerAdapterObserver extends DataSetObserver
	{

		public void onChanged()
		{
			populateFromPagerAdapter();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field TabLayout this$0>
		//    2    4:invokevirtual   #21  <Method void TabLayout.populateFromPagerAdapter()>
		//    3    7:return          
		}

		public void onInvalidated()
		{
			populateFromPagerAdapter();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field TabLayout this$0>
		//    2    4:invokevirtual   #21  <Method void TabLayout.populateFromPagerAdapter()>
		//    3    7:return          
		}

		final TabLayout this$0;

		PagerAdapterObserver()
		{
			this$0 = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field TabLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void DataSetObserver()>
		//    5    9:return          
		}
	}

	private class SlidingTabIndicator extends LinearLayout
	{

		private void calculateTabViewContentBounds(TabView tabview, RectF rectf)
		{
			int j = tabview.getContentWidth();
		//    0    0:aload_1         
		//    1    1:invokestatic    #67  <Method int TabLayout$TabView.access$500(TabLayout$TabView)>
		//    2    4:istore          4
			int i = j;
		//    3    6:iload           4
		//    4    8:istore_3        
			if(j < dpToPx(24))
		//*   5    9:iload           4
		//*   6   11:aload_0         
		//*   7   12:getfield        #31  <Field TabLayout this$0>
		//*   8   15:bipush          24
		//*   9   17:invokevirtual   #71  <Method int TabLayout.dpToPx(int)>
		//*  10   20:icmpge          33
				i = dpToPx(24);
		//   11   23:aload_0         
		//   12   24:getfield        #31  <Field TabLayout this$0>
		//   13   27:bipush          24
		//   14   29:invokevirtual   #71  <Method int TabLayout.dpToPx(int)>
		//   15   32:istore_3        
			j = (tabview.getLeft() + tabview.getRight()) / 2;
		//   16   33:aload_1         
		//   17   34:invokevirtual   #75  <Method int TabLayout$TabView.getLeft()>
		//   18   37:aload_1         
		//   19   38:invokevirtual   #78  <Method int TabLayout$TabView.getRight()>
		//   20   41:iadd            
		//   21   42:iconst_2        
		//   22   43:idiv            
		//   23   44:istore          4
			i /= 2;
		//   24   46:iload_3         
		//   25   47:iconst_2        
		//   26   48:idiv            
		//   27   49:istore_3        
			rectf.set(j - i, 0.0F, j + i, 0.0F);
		//   28   50:aload_2         
		//   29   51:iload           4
		//   30   53:iload_3         
		//   31   54:isub            
		//   32   55:i2f             
		//   33   56:fconst_0        
		//   34   57:iload           4
		//   35   59:iload_3         
		//   36   60:iadd            
		//   37   61:i2f             
		//   38   62:fconst_0        
		//   39   63:invokevirtual   #84  <Method void RectF.set(float, float, float, float)>
		//   40   66:return          
		}

		private void updateIndicatorPosition()
		{
			View view = getChildAt(selectedPosition);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #36  <Field int selectedPosition>
		//    3    5:invokevirtual   #89  <Method View getChildAt(int)>
		//    4    8:astore          8
			int k;
			int l;
			if(view != null && view.getWidth() > 0)
		//*   5   10:aload           8
		//*   6   12:ifnull          283
		//*   7   15:aload           8
		//*   8   17:invokevirtual   #94  <Method int View.getWidth()>
		//*   9   20:ifle            283
			{
				k = view.getLeft();
		//   10   23:aload           8
		//   11   25:invokevirtual   #95  <Method int View.getLeft()>
		//   12   28:istore          4
				l = view.getRight();
		//   13   30:aload           8
		//   14   32:invokevirtual   #96  <Method int View.getRight()>
		//   15   35:istore          5
				int j = k;
		//   16   37:iload           4
		//   17   39:istore_3        
				int i = l;
		//   18   40:iload           5
		//   19   42:istore_2        
				if(!tabIndicatorFullWidth)
		//*  20   43:aload_0         
		//*  21   44:getfield        #31  <Field TabLayout this$0>
		//*  22   47:getfield        #100 <Field boolean TabLayout.tabIndicatorFullWidth>
		//*  23   50:ifne            107
				{
					j = k;
		//   24   53:iload           4
		//   25   55:istore_3        
					i = l;
		//   26   56:iload           5
		//   27   58:istore_2        
					if(view instanceof TabView)
		//*  28   59:aload           8
		//*  29   61:instanceof      #63  <Class TabLayout$TabView>
		//*  30   64:ifeq            107
					{
						calculateTabViewContentBounds((TabView)view, tabViewContentBounds);
		//   31   67:aload_0         
		//   32   68:aload           8
		//   33   70:checkcast       #63  <Class TabLayout$TabView>
		//   34   73:aload_0         
		//   35   74:getfield        #31  <Field TabLayout this$0>
		//   36   77:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
		//   37   80:invokespecial   #106 <Method void calculateTabViewContentBounds(TabLayout$TabView, RectF)>
						j = (int)tabViewContentBounds.left;
		//   38   83:aload_0         
		//   39   84:getfield        #31  <Field TabLayout this$0>
		//   40   87:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
		//   41   90:getfield        #109 <Field float RectF.left>
		//   42   93:f2i             
		//   43   94:istore_3        
						i = (int)tabViewContentBounds.right;
		//   44   95:aload_0         
		//   45   96:getfield        #31  <Field TabLayout this$0>
		//   46   99:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
		//   47  102:getfield        #112 <Field float RectF.right>
		//   48  105:f2i             
		//   49  106:istore_2        
					}
				}
				k = j;
		//   50  107:iload_3         
		//   51  108:istore          4
				l = i;
		//   52  110:iload_2         
		//   53  111:istore          5
				if(selectionOffset > 0.0F)
		//*  54  113:aload_0         
		//*  55  114:getfield        #114 <Field float selectionOffset>
		//*  56  117:fconst_0        
		//*  57  118:fcmpl           
		//*  58  119:ifle            289
				{
					k = j;
		//   59  122:iload_3         
		//   60  123:istore          4
					l = i;
		//   61  125:iload_2         
		//   62  126:istore          5
					if(selectedPosition < getChildCount() - 1)
		//*  63  128:aload_0         
		//*  64  129:getfield        #36  <Field int selectedPosition>
		//*  65  132:aload_0         
		//*  66  133:invokevirtual   #117 <Method int getChildCount()>
		//*  67  136:iconst_1        
		//*  68  137:isub            
		//*  69  138:icmpge          289
					{
						View view1 = getChildAt(selectedPosition + 1);
		//   70  141:aload_0         
		//   71  142:aload_0         
		//   72  143:getfield        #36  <Field int selectedPosition>
		//   73  146:iconst_1        
		//   74  147:iadd            
		//   75  148:invokevirtual   #89  <Method View getChildAt(int)>
		//   76  151:astore          8
						int i1 = view1.getLeft();
		//   77  153:aload           8
		//   78  155:invokevirtual   #95  <Method int View.getLeft()>
		//   79  158:istore          6
						int j1 = view1.getRight();
		//   80  160:aload           8
		//   81  162:invokevirtual   #96  <Method int View.getRight()>
		//   82  165:istore          7
						l = i1;
		//   83  167:iload           6
		//   84  169:istore          5
						k = j1;
		//   85  171:iload           7
		//   86  173:istore          4
						if(!tabIndicatorFullWidth)
		//*  87  175:aload_0         
		//*  88  176:getfield        #31  <Field TabLayout this$0>
		//*  89  179:getfield        #100 <Field boolean TabLayout.tabIndicatorFullWidth>
		//*  90  182:ifne            243
						{
							l = i1;
		//   91  185:iload           6
		//   92  187:istore          5
							k = j1;
		//   93  189:iload           7
		//   94  191:istore          4
							if(view1 instanceof TabView)
		//*  95  193:aload           8
		//*  96  195:instanceof      #63  <Class TabLayout$TabView>
		//*  97  198:ifeq            243
							{
								calculateTabViewContentBounds((TabView)view1, tabViewContentBounds);
		//   98  201:aload_0         
		//   99  202:aload           8
		//  100  204:checkcast       #63  <Class TabLayout$TabView>
		//  101  207:aload_0         
		//  102  208:getfield        #31  <Field TabLayout this$0>
		//  103  211:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
		//  104  214:invokespecial   #106 <Method void calculateTabViewContentBounds(TabLayout$TabView, RectF)>
								l = (int)tabViewContentBounds.left;
		//  105  217:aload_0         
		//  106  218:getfield        #31  <Field TabLayout this$0>
		//  107  221:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
		//  108  224:getfield        #109 <Field float RectF.left>
		//  109  227:f2i             
		//  110  228:istore          5
								k = (int)tabViewContentBounds.right;
		//  111  230:aload_0         
		//  112  231:getfield        #31  <Field TabLayout this$0>
		//  113  234:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
		//  114  237:getfield        #112 <Field float RectF.right>
		//  115  240:f2i             
		//  116  241:istore          4
							}
						}
						float f = selectionOffset;
		//  117  243:aload_0         
		//  118  244:getfield        #114 <Field float selectionOffset>
		//  119  247:fstore_1        
						j = (int)((float)l * f + (1.0F - f) * (float)j);
		//  120  248:iload           5
		//  121  250:i2f             
		//  122  251:fload_1         
		//  123  252:fmul            
		//  124  253:fconst_1        
		//  125  254:fload_1         
		//  126  255:fsub            
		//  127  256:iload_3         
		//  128  257:i2f             
		//  129  258:fmul            
		//  130  259:fadd            
		//  131  260:f2i             
		//  132  261:istore_3        
						l = (int)((float)k * f + (1.0F - f) * (float)i);
		//  133  262:iload           4
		//  134  264:i2f             
		//  135  265:fload_1         
		//  136  266:fmul            
		//  137  267:fconst_1        
		//  138  268:fload_1         
		//  139  269:fsub            
		//  140  270:iload_2         
		//  141  271:i2f             
		//  142  272:fmul            
		//  143  273:fadd            
		//  144  274:f2i             
		//  145  275:istore          5
						k = j;
		//  146  277:iload_3         
		//  147  278:istore          4
					}
				}
			} else
		//* 148  280:goto            289
			{
				k = -1;
		//  149  283:iconst_m1       
		//  150  284:istore          4
				l = -1;
		//  151  286:iconst_m1       
		//  152  287:istore          5
			}
			setIndicatorPosition(k, l);
		//  153  289:aload_0         
		//  154  290:iload           4
		//  155  292:iload           5
		//  156  294:invokevirtual   #121 <Method void setIndicatorPosition(int, int)>
		//  157  297:return          
		}

		void animateIndicatorToPosition(int i, int j)
		{
			Object obj = ((Object) (indicatorAnimator));
		//    0    0:aload_0         
		//    1    1:getfield        #124 <Field ValueAnimator indicatorAnimator>
		//    2    4:astore          7
			if(obj != null && ((ValueAnimator) (obj)).isRunning())
		//*   3    6:aload           7
		//*   4    8:ifnull          26
		//*   5   11:aload           7
		//*   6   13:invokevirtual   #130 <Method boolean ValueAnimator.isRunning()>
		//*   7   16:ifeq            26
				indicatorAnimator.cancel();
		//    8   19:aload_0         
		//    9   20:getfield        #124 <Field ValueAnimator indicatorAnimator>
		//   10   23:invokevirtual   #133 <Method void ValueAnimator.cancel()>
			obj = ((Object) (getChildAt(i)));
		//   11   26:aload_0         
		//   12   27:iload_1         
		//   13   28:invokevirtual   #89  <Method View getChildAt(int)>
		//   14   31:astore          7
			if(obj == null)
		//*  15   33:aload           7
		//*  16   35:ifnonnull       43
			{
				updateIndicatorPosition();
		//   17   38:aload_0         
		//   18   39:invokespecial   #135 <Method void updateIndicatorPosition()>
				return;
		//   19   42:return          
			}
			final int finalTargetLeft = ((View) (obj)).getLeft();
		//   20   43:aload           7
		//   21   45:invokevirtual   #95  <Method int View.getLeft()>
		//   22   48:istore_3        
			int k = ((View) (obj)).getRight();
		//   23   49:aload           7
		//   24   51:invokevirtual   #96  <Method int View.getRight()>
		//   25   54:istore          4
			if(!tabIndicatorFullWidth && (obj instanceof TabView))
		//*  26   56:aload_0         
		//*  27   57:getfield        #31  <Field TabLayout this$0>
		//*  28   60:getfield        #100 <Field boolean TabLayout.tabIndicatorFullWidth>
		//*  29   63:ifne            118
		//*  30   66:aload           7
		//*  31   68:instanceof      #63  <Class TabLayout$TabView>
		//*  32   71:ifeq            118
			{
				calculateTabViewContentBounds((TabView)obj, tabViewContentBounds);
		//   33   74:aload_0         
		//   34   75:aload           7
		//   35   77:checkcast       #63  <Class TabLayout$TabView>
		//   36   80:aload_0         
		//   37   81:getfield        #31  <Field TabLayout this$0>
		//   38   84:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
		//   39   87:invokespecial   #106 <Method void calculateTabViewContentBounds(TabLayout$TabView, RectF)>
				finalTargetLeft = (int)tabViewContentBounds.left;
		//   40   90:aload_0         
		//   41   91:getfield        #31  <Field TabLayout this$0>
		//   42   94:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
		//   43   97:getfield        #109 <Field float RectF.left>
		//   44  100:f2i             
		//   45  101:istore_3        
				k = (int)tabViewContentBounds.right;
		//   46  102:aload_0         
		//   47  103:getfield        #31  <Field TabLayout this$0>
		//   48  106:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
		//   49  109:getfield        #112 <Field float RectF.right>
		//   50  112:f2i             
		//   51  113:istore          4
			}
		//*  52  115:goto            118
			final int startLeft = indicatorLeft;
		//   53  118:aload_0         
		//   54  119:getfield        #40  <Field int indicatorLeft>
		//   55  122:istore          5
			final int startRight = indicatorRight;
		//   56  124:aload_0         
		//   57  125:getfield        #42  <Field int indicatorRight>
		//   58  128:istore          6
			if(startLeft != finalTargetLeft || startRight != k)
		//*  59  130:iload           5
		//*  60  132:iload_3         
		//*  61  133:icmpne          143
		//*  62  136:iload           6
		//*  63  138:iload           4
		//*  64  140:icmpeq          229
			{
				ValueAnimator valueanimator = new ValueAnimator();
		//   65  143:new             #126 <Class ValueAnimator>
		//   66  146:dup             
		//   67  147:invokespecial   #136 <Method void ValueAnimator()>
		//   68  150:astore          7
				indicatorAnimator = valueanimator;
		//   69  152:aload_0         
		//   70  153:aload           7
		//   71  155:putfield        #124 <Field ValueAnimator indicatorAnimator>
				valueanimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
		//   72  158:aload           7
		//   73  160:getstatic       #142 <Field android.animation.TimeInterpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
		//   74  163:invokevirtual   #146 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
				valueanimator.setDuration(j);
		//   75  166:aload           7
		//   76  168:iload_2         
		//   77  169:i2l             
		//   78  170:invokevirtual   #150 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//   79  173:pop             
				valueanimator.setFloatValues(new float[] {
					0.0F, 1.0F
				});
		//   80  174:aload           7
		//   81  176:iconst_2        
		//   82  177:newarray        float[]
		//   83  179:dup             
		//   84  180:iconst_0        
		//   85  181:fconst_0        
		//   86  182:fastore         
		//   87  183:dup             
		//   88  184:iconst_1        
		//   89  185:fconst_1        
		//   90  186:fastore         
		//   91  187:invokevirtual   #154 <Method void ValueAnimator.setFloatValues(float[])>
				valueanimator.addUpdateListener(((_cls1) (k)). new android.animation.ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						float f = valueanimator.getAnimatedFraction();
					//    0    0:aload_1         
					//    1    1:invokevirtual   #45  <Method float ValueAnimator.getAnimatedFraction()>
					//    2    4:fstore_2        
						setIndicatorPosition(AnimationUtils.lerp(startLeft, finalTargetLeft, f), AnimationUtils.lerp(startRight, finalTargetRight, f));
					//    3    5:aload_0         
					//    4    6:getfield        #25  <Field TabLayout$SlidingTabIndicator this$1>
					//    5    9:aload_0         
					//    6   10:getfield        #27  <Field int val$startLeft>
					//    7   13:aload_0         
					//    8   14:getfield        #29  <Field int val$finalTargetLeft>
					//    9   17:fload_2         
					//   10   18:invokestatic    #51  <Method int AnimationUtils.lerp(int, int, float)>
					//   11   21:aload_0         
					//   12   22:getfield        #31  <Field int val$startRight>
					//   13   25:aload_0         
					//   14   26:getfield        #33  <Field int val$finalTargetRight>
					//   15   29:fload_2         
					//   16   30:invokestatic    #51  <Method int AnimationUtils.lerp(int, int, float)>
					//   17   33:invokevirtual   #54  <Method void TabLayout$SlidingTabIndicator.setIndicatorPosition(int, int)>
					//   18   36:return          
					}

					final SlidingTabIndicator this$1;
					final int val$finalTargetLeft;
					final int val$finalTargetRight;
					final int val$startLeft;
					final int val$startRight;

			
			{
				this$1 = final_slidingtabindicator;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field TabLayout$SlidingTabIndicator this$1>
				startLeft = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field int val$startLeft>
				finalTargetLeft = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #29  <Field int val$finalTargetLeft>
				startRight = k;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #31  <Field int val$startRight>
				finalTargetRight = I.this;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #33  <Field int val$finalTargetRight>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
				}
);
		//   92  190:aload           7
		//   93  192:new             #9   <Class TabLayout$SlidingTabIndicator$1>
		//   94  195:dup             
		//   95  196:aload_0         
		//   96  197:iload           5
		//   97  199:iload_3         
		//   98  200:iload           6
		//   99  202:iload           4
		//  100  204:invokespecial   #157 <Method void TabLayout$SlidingTabIndicator$1(TabLayout$SlidingTabIndicator, int, int, int, int)>
		//  101  207:invokevirtual   #161 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
				valueanimator.addListener(((android.animation.Animator.AnimatorListener) (((_cls2) (i)). new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator)
					{
						animator = ((Animator) (SlidingTabIndicator.this));
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field TabLayout$SlidingTabIndicator this$1>
					//    2    4:astore_1        
						animator.selectedPosition = position;
					//    3    5:aload_1         
					//    4    6:aload_0         
					//    5    7:getfield        #22  <Field int val$position>
					//    6   10:putfield        #31  <Field int TabLayout$SlidingTabIndicator.selectedPosition>
						animator.selectionOffset = 0.0F;
					//    7   13:aload_1         
					//    8   14:fconst_0        
					//    9   15:putfield        #35  <Field float TabLayout$SlidingTabIndicator.selectionOffset>
					//   10   18:return          
					}

					final SlidingTabIndicator this$1;
					final int val$position;

			
			{
				this$1 = final_slidingtabindicator;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field TabLayout$SlidingTabIndicator this$1>
				position = I.this;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$position>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
				}
)));
		//  102  210:aload           7
		//  103  212:new             #11  <Class TabLayout$SlidingTabIndicator$2>
		//  104  215:dup             
		//  105  216:aload_0         
		//  106  217:iload_1         
		//  107  218:invokespecial   #164 <Method void TabLayout$SlidingTabIndicator$2(TabLayout$SlidingTabIndicator, int)>
		//  108  221:invokevirtual   #168 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
				valueanimator.start();
		//  109  224:aload           7
		//  110  226:invokevirtual   #171 <Method void ValueAnimator.start()>
			}
		//  111  229:return          
		}

		boolean childrenNeedLayout()
		{
			int j = getChildCount();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #117 <Method int getChildCount()>
		//    2    4:istore_2        
			for(int i = 0; i < j; i++)
		//*   3    5:iconst_0        
		//*   4    6:istore_1        
		//*   5    7:iload_1         
		//*   6    8:iload_2         
		//*   7    9:icmpge          32
				if(getChildAt(i).getWidth() <= 0)
		//*   8   12:aload_0         
		//*   9   13:iload_1         
		//*  10   14:invokevirtual   #89  <Method View getChildAt(int)>
		//*  11   17:invokevirtual   #94  <Method int View.getWidth()>
		//*  12   20:ifgt            25
					return true;
		//   13   23:iconst_1        
		//   14   24:ireturn         

		//   15   25:iload_1         
		//   16   26:iconst_1        
		//   17   27:iadd            
		//   18   28:istore_1        
		//*  19   29:goto            7
			return false;
		//   20   32:iconst_0        
		//   21   33:ireturn         
		}

		public void draw(Canvas canvas)
		{
			Drawable drawable = tabSelectedIndicator;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field TabLayout this$0>
		//    2    4:getfield        #178 <Field Drawable TabLayout.tabSelectedIndicator>
		//    3    7:astore          6
			boolean flag = false;
		//    4    9:iconst_0        
		//    5   10:istore          5
			int j;
			if(drawable != null)
		//*   6   12:aload           6
		//*   7   14:ifnull          31
				j = tabSelectedIndicator.getIntrinsicHeight();
		//    8   17:aload_0         
		//    9   18:getfield        #31  <Field TabLayout this$0>
		//   10   21:getfield        #178 <Field Drawable TabLayout.tabSelectedIndicator>
		//   11   24:invokevirtual   #183 <Method int Drawable.getIntrinsicHeight()>
		//   12   27:istore_3        
			else
		//*  13   28:goto            33
				j = 0;
		//   14   31:iconst_0        
		//   15   32:istore_3        
			int i = selectedIndicatorHeight;
		//   16   33:aload_0         
		//   17   34:getfield        #185 <Field int selectedIndicatorHeight>
		//   18   37:istore_2        
			if(i >= 0)
		//*  19   38:iload_2         
		//*  20   39:iflt            44
				j = i;
		//   21   42:iload_2         
		//   22   43:istore_3        
			i = j;
		//   23   44:iload_3         
		//   24   45:istore_2        
			int k = ((int) (flag));
		//   25   46:iload           5
		//   26   48:istore          4
			switch(tabIndicatorGravity)
		//*  27   50:aload_0         
		//*  28   51:getfield        #31  <Field TabLayout this$0>
		//*  29   54:getfield        #188 <Field int TabLayout.tabIndicatorGravity>
			{
		//*  30   57:tableswitch     0 3: default 88
		//		               0 131
		//		               1 109
		//		               2 144
		//		               3 97
			default:
				i = 0;
		//   31   88:iconst_0        
		//   32   89:istore_2        
				k = ((int) (flag));
		//   33   90:iload           5
		//   34   92:istore          4
				break;

		//*  35   94:goto            144
			case 3: // '\003'
				i = getHeight();
		//   36   97:aload_0         
		//   37   98:invokevirtual   #191 <Method int getHeight()>
		//   38  101:istore_2        
				k = ((int) (flag));
		//   39  102:iload           5
		//   40  104:istore          4
				break;

		//*  41  106:goto            144
			case 1: // '\001'
				k = (getHeight() - j) / 2;
		//   42  109:aload_0         
		//   43  110:invokevirtual   #191 <Method int getHeight()>
		//   44  113:iload_3         
		//   45  114:isub            
		//   46  115:iconst_2        
		//   47  116:idiv            
		//   48  117:istore          4
				i = (getHeight() + j) / 2;
		//   49  119:aload_0         
		//   50  120:invokevirtual   #191 <Method int getHeight()>
		//   51  123:iload_3         
		//   52  124:iadd            
		//   53  125:iconst_2        
		//   54  126:idiv            
		//   55  127:istore_2        
				break;

		//*  56  128:goto            144
			case 0: // '\0'
				k = getHeight() - j;
		//   57  131:aload_0         
		//   58  132:invokevirtual   #191 <Method int getHeight()>
		//   59  135:iload_3         
		//   60  136:isub            
		//   61  137:istore          4
				i = getHeight();
		//   62  139:aload_0         
		//   63  140:invokevirtual   #191 <Method int getHeight()>
		//   64  143:istore_2        
				break;

			case 2: // '\002'
				break;
			}
			j = indicatorLeft;
		//   65  144:aload_0         
		//   66  145:getfield        #40  <Field int indicatorLeft>
		//   67  148:istore_3        
			if(j >= 0 && indicatorRight > j)
		//*  68  149:iload_3         
		//*  69  150:iflt            263
		//*  70  153:aload_0         
		//*  71  154:getfield        #42  <Field int indicatorRight>
		//*  72  157:iload_3         
		//*  73  158:icmple          263
			{
				Object obj;
				if(tabSelectedIndicator != null)
		//*  74  161:aload_0         
		//*  75  162:getfield        #31  <Field TabLayout this$0>
		//*  76  165:getfield        #178 <Field Drawable TabLayout.tabSelectedIndicator>
		//*  77  168:ifnull          183
					obj = ((Object) (tabSelectedIndicator));
		//   78  171:aload_0         
		//   79  172:getfield        #31  <Field TabLayout this$0>
		//   80  175:getfield        #178 <Field Drawable TabLayout.tabSelectedIndicator>
		//   81  178:astore          6
				else
		//*  82  180:goto            189
					obj = ((Object) (defaultSelectionIndicator));
		//   83  183:aload_0         
		//   84  184:getfield        #58  <Field GradientDrawable defaultSelectionIndicator>
		//   85  187:astore          6
				obj = ((Object) (DrawableCompat.wrap(((Drawable) (obj)))));
		//   86  189:aload           6
		//   87  191:invokestatic    #197 <Method Drawable DrawableCompat.wrap(Drawable)>
		//   88  194:astore          6
				((Drawable) (obj)).setBounds(indicatorLeft, k, indicatorRight, i);
		//   89  196:aload           6
		//   90  198:aload_0         
		//   91  199:getfield        #40  <Field int indicatorLeft>
		//   92  202:iload           4
		//   93  204:aload_0         
		//   94  205:getfield        #42  <Field int indicatorRight>
		//   95  208:iload_2         
		//   96  209:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
				if(selectedIndicatorPaint != null)
		//*  97  212:aload_0         
		//*  98  213:getfield        #53  <Field Paint selectedIndicatorPaint>
		//*  99  216:ifnull          257
					if(android.os.Build.VERSION.SDK_INT == 21)
		//* 100  219:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
		//* 101  222:bipush          21
		//* 102  224:icmpne          245
						((Drawable) (obj)).setColorFilter(selectedIndicatorPaint.getColor(), android.graphics.PorterDuff.Mode.SRC_IN);
		//  103  227:aload           6
		//  104  229:aload_0         
		//  105  230:getfield        #53  <Field Paint selectedIndicatorPaint>
		//  106  233:invokevirtual   #209 <Method int Paint.getColor()>
		//  107  236:getstatic       #215 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
		//  108  239:invokevirtual   #219 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
					else
		//* 109  242:goto            257
						DrawableCompat.setTint(((Drawable) (obj)), selectedIndicatorPaint.getColor());
		//  110  245:aload           6
		//  111  247:aload_0         
		//  112  248:getfield        #53  <Field Paint selectedIndicatorPaint>
		//  113  251:invokevirtual   #209 <Method int Paint.getColor()>
		//  114  254:invokestatic    #223 <Method void DrawableCompat.setTint(Drawable, int)>
				((Drawable) (obj)).draw(canvas);
		//  115  257:aload           6
		//  116  259:aload_1         
		//  117  260:invokevirtual   #225 <Method void Drawable.draw(Canvas)>
			}
			super.draw(canvas);
		//  118  263:aload_0         
		//  119  264:aload_1         
		//  120  265:invokespecial   #226 <Method void LinearLayout.draw(Canvas)>
		//  121  268:return          
		}

		float getIndicatorPosition()
		{
			return (float)selectedPosition + selectionOffset;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field int selectedPosition>
		//    2    4:i2f             
		//    3    5:aload_0         
		//    4    6:getfield        #114 <Field float selectionOffset>
		//    5    9:fadd            
		//    6   10:freturn         
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
		//    6    8:invokespecial   #232 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
			ValueAnimator valueanimator = indicatorAnimator;
		//    7   11:aload_0         
		//    8   12:getfield        #124 <Field ValueAnimator indicatorAnimator>
		//    9   15:astore          8
			if(valueanimator != null && valueanimator.isRunning())
		//*  10   17:aload           8
		//*  11   19:ifnull          71
		//*  12   22:aload           8
		//*  13   24:invokevirtual   #130 <Method boolean ValueAnimator.isRunning()>
		//*  14   27:ifeq            71
			{
				indicatorAnimator.cancel();
		//   15   30:aload_0         
		//   16   31:getfield        #124 <Field ValueAnimator indicatorAnimator>
		//   17   34:invokevirtual   #133 <Method void ValueAnimator.cancel()>
				long l1 = indicatorAnimator.getDuration();
		//   18   37:aload_0         
		//   19   38:getfield        #124 <Field ValueAnimator indicatorAnimator>
		//   20   41:invokevirtual   #236 <Method long ValueAnimator.getDuration()>
		//   21   44:lstore          6
				animateIndicatorToPosition(selectedPosition, Math.round((1.0F - indicatorAnimator.getAnimatedFraction()) * (float)l1));
		//   22   46:aload_0         
		//   23   47:aload_0         
		//   24   48:getfield        #36  <Field int selectedPosition>
		//   25   51:fconst_1        
		//   26   52:aload_0         
		//   27   53:getfield        #124 <Field ValueAnimator indicatorAnimator>
		//   28   56:invokevirtual   #239 <Method float ValueAnimator.getAnimatedFraction()>
		//   29   59:fsub            
		//   30   60:lload           6
		//   31   62:l2f             
		//   32   63:fmul            
		//   33   64:invokestatic    #245 <Method int Math.round(float)>
		//   34   67:invokevirtual   #247 <Method void animateIndicatorToPosition(int, int)>
				return;
		//   35   70:return          
			} else
			{
				updateIndicatorPosition();
		//   36   71:aload_0         
		//   37   72:invokespecial   #135 <Method void updateIndicatorPosition()>
				return;
		//   38   75:return          
			}
		}

		protected void onMeasure(int i, int j)
		{
			super.onMeasure(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #250 <Method void LinearLayout.onMeasure(int, int)>
			if(android.view.View.MeasureSpec.getMode(i) != 0x40000000)
		//*   4    6:iload_1         
		//*   5    7:invokestatic    #255 <Method int android.view.View$MeasureSpec.getMode(int)>
		//*   6   10:ldc2            #256 <Int 0x40000000>
		//*   7   13:icmpeq          17
				return;
		//    8   16:return          
			int k = mode;
		//    9   17:aload_0         
		//   10   18:getfield        #31  <Field TabLayout this$0>
		//   11   21:getfield        #259 <Field int TabLayout.mode>
		//   12   24:istore_3        
			boolean flag2 = true;
		//   13   25:iconst_1        
		//   14   26:istore          7
			if(k == 1 && tabGravity == 1)
		//*  15   28:iload_3         
		//*  16   29:iconst_1        
		//*  17   30:icmpne          243
		//*  18   33:aload_0         
		//*  19   34:getfield        #31  <Field TabLayout this$0>
		//*  20   37:getfield        #262 <Field int TabLayout.tabGravity>
		//*  21   40:iconst_1        
		//*  22   41:icmpne          243
			{
				int l1 = getChildCount();
		//   23   44:aload_0         
		//   24   45:invokevirtual   #117 <Method int getChildCount()>
		//   25   48:istore          8
				boolean flag1 = false;
		//   26   50:iconst_0        
		//   27   51:istore          6
				int l = 0;
		//   28   53:iconst_0        
		//   29   54:istore_3        
				int i1;
				int j1;
				for(i1 = l; l < l1; i1 = j1)
		//*  30   55:iload_3         
		//*  31   56:istore          4
		//*  32   58:iload_3         
		//*  33   59:iload           8
		//*  34   61:icmpge          106
				{
					View view = getChildAt(l);
		//   35   64:aload_0         
		//   36   65:iload_3         
		//   37   66:invokevirtual   #89  <Method View getChildAt(int)>
		//   38   69:astore          9
					j1 = i1;
		//   39   71:iload           4
		//   40   73:istore          5
					if(view.getVisibility() == 0)
		//*  41   75:aload           9
		//*  42   77:invokevirtual   #265 <Method int View.getVisibility()>
		//*  43   80:ifne            95
						j1 = Math.max(i1, view.getMeasuredWidth());
		//   44   83:iload           4
		//   45   85:aload           9
		//   46   87:invokevirtual   #268 <Method int View.getMeasuredWidth()>
		//   47   90:invokestatic    #272 <Method int Math.max(int, int)>
		//   48   93:istore          5
					l++;
		//   49   95:iload_3         
		//   50   96:iconst_1        
		//   51   97:iadd            
		//   52   98:istore_3        
				}

		//   53   99:iload           5
		//   54  101:istore          4
		//*  55  103:goto            58
				if(i1 <= 0)
		//*  56  106:iload           4
		//*  57  108:ifgt            112
					return;
		//   58  111:return          
				l = dpToPx(16);
		//   59  112:aload_0         
		//   60  113:getfield        #31  <Field TabLayout this$0>
		//   61  116:bipush          16
		//   62  118:invokevirtual   #71  <Method int TabLayout.dpToPx(int)>
		//   63  121:istore_3        
				boolean flag;
				if(i1 * l1 <= getMeasuredWidth() - l * 2)
		//*  64  122:iload           4
		//*  65  124:iload           8
		//*  66  126:imul            
		//*  67  127:aload_0         
		//*  68  128:invokevirtual   #273 <Method int getMeasuredWidth()>
		//*  69  131:iload_3         
		//*  70  132:iconst_2        
		//*  71  133:imul            
		//*  72  134:isub            
		//*  73  135:icmpgt          212
				{
					flag = false;
		//   74  138:iconst_0        
		//   75  139:istore_3        
					for(int k1 = ((int) (flag1)); k1 < l1; k1++)
		//*  76  140:iload           6
		//*  77  142:istore          5
		//*  78  144:iload           5
		//*  79  146:iload           8
		//*  80  148:icmpge          209
					{
						android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)getChildAt(k1).getLayoutParams();
		//   81  151:aload_0         
		//   82  152:iload           5
		//   83  154:invokevirtual   #89  <Method View getChildAt(int)>
		//   84  157:invokevirtual   #277 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   85  160:checkcast       #279 <Class android.widget.LinearLayout$LayoutParams>
		//   86  163:astore          9
						if(layoutparams.width != i1 || layoutparams.weight != 0.0F)
		//*  87  165:aload           9
		//*  88  167:getfield        #282 <Field int android.widget.LinearLayout$LayoutParams.width>
		//*  89  170:iload           4
		//*  90  172:icmpne          185
		//*  91  175:aload           9
		//*  92  177:getfield        #285 <Field float android.widget.LinearLayout$LayoutParams.weight>
		//*  93  180:fconst_0        
		//*  94  181:fcmpl           
		//*  95  182:ifeq            200
						{
							layoutparams.width = i1;
		//   96  185:aload           9
		//   97  187:iload           4
		//   98  189:putfield        #282 <Field int android.widget.LinearLayout$LayoutParams.width>
							layoutparams.weight = 0.0F;
		//   99  192:aload           9
		//  100  194:fconst_0        
		//  101  195:putfield        #285 <Field float android.widget.LinearLayout$LayoutParams.weight>
							flag = true;
		//  102  198:iconst_1        
		//  103  199:istore_3        
						}
					}

		//  104  200:iload           5
		//  105  202:iconst_1        
		//  106  203:iadd            
		//  107  204:istore          5
				} else
		//* 108  206:goto            144
		//* 109  209:goto            233
				{
					TabLayout tablayout = TabLayout.this;
		//  110  212:aload_0         
		//  111  213:getfield        #31  <Field TabLayout this$0>
		//  112  216:astore          9
					tablayout.tabGravity = 0;
		//  113  218:aload           9
		//  114  220:iconst_0        
		//  115  221:putfield        #262 <Field int TabLayout.tabGravity>
					tablayout.updateTabViews(false);
		//  116  224:aload           9
		//  117  226:iconst_0        
		//  118  227:invokevirtual   #288 <Method void TabLayout.updateTabViews(boolean)>
					flag = flag2;
		//  119  230:iload           7
		//  120  232:istore_3        
				}
				if(flag)
		//* 121  233:iload_3         
		//* 122  234:ifeq            243
					super.onMeasure(i, j);
		//  123  237:aload_0         
		//  124  238:iload_1         
		//  125  239:iload_2         
		//  126  240:invokespecial   #250 <Method void LinearLayout.onMeasure(int, int)>
			}
		//  127  243:return          
		}

		public void onRtlPropertiesChanged(int i)
		{
			super.onRtlPropertiesChanged(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #292 <Method void LinearLayout.onRtlPropertiesChanged(int)>
			if(android.os.Build.VERSION.SDK_INT < 23 && layoutDirection != i)
		//*   3    5:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
		//*   4    8:bipush          23
		//*   5   10:icmpge          30
		//*   6   13:aload_0         
		//*   7   14:getfield        #38  <Field int layoutDirection>
		//*   8   17:iload_1         
		//*   9   18:icmpeq          30
			{
				requestLayout();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #295 <Method void requestLayout()>
				layoutDirection = i;
		//   12   25:aload_0         
		//   13   26:iload_1         
		//   14   27:putfield        #38  <Field int layoutDirection>
			}
		//   15   30:return          
		}

		void setIndicatorPosition(int i, int j)
		{
			if(i != indicatorLeft || j != indicatorRight)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #40  <Field int indicatorLeft>
		//*   3    5:icmpne          16
		//*   4    8:iload_2         
		//*   5    9:aload_0         
		//*   6   10:getfield        #42  <Field int indicatorRight>
		//*   7   13:icmpeq          30
			{
				indicatorLeft = i;
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:putfield        #40  <Field int indicatorLeft>
				indicatorRight = j;
		//   11   21:aload_0         
		//   12   22:iload_2         
		//   13   23:putfield        #42  <Field int indicatorRight>
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
		//   14   26:aload_0         
		//   15   27:invokestatic    #301 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
		//   16   30:return          
		}

		void setIndicatorPositionFromTabPosition(int i, float f)
		{
			ValueAnimator valueanimator = indicatorAnimator;
		//    0    0:aload_0         
		//    1    1:getfield        #124 <Field ValueAnimator indicatorAnimator>
		//    2    4:astore_3        
			if(valueanimator != null && valueanimator.isRunning())
		//*   3    5:aload_3         
		//*   4    6:ifnull          23
		//*   5    9:aload_3         
		//*   6   10:invokevirtual   #130 <Method boolean ValueAnimator.isRunning()>
		//*   7   13:ifeq            23
				indicatorAnimator.cancel();
		//    8   16:aload_0         
		//    9   17:getfield        #124 <Field ValueAnimator indicatorAnimator>
		//   10   20:invokevirtual   #133 <Method void ValueAnimator.cancel()>
			selectedPosition = i;
		//   11   23:aload_0         
		//   12   24:iload_1         
		//   13   25:putfield        #36  <Field int selectedPosition>
			selectionOffset = f;
		//   14   28:aload_0         
		//   15   29:fload_2         
		//   16   30:putfield        #114 <Field float selectionOffset>
			updateIndicatorPosition();
		//   17   33:aload_0         
		//   18   34:invokespecial   #135 <Method void updateIndicatorPosition()>
		//   19   37:return          
		}

		void setSelectedIndicatorColor(int i)
		{
			if(selectedIndicatorPaint.getColor() != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #53  <Field Paint selectedIndicatorPaint>
		//*   2    4:invokevirtual   #209 <Method int Paint.getColor()>
		//*   3    7:iload_1         
		//*   4    8:icmpeq          23
			{
				selectedIndicatorPaint.setColor(i);
		//    5   11:aload_0         
		//    6   12:getfield        #53  <Field Paint selectedIndicatorPaint>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #307 <Method void Paint.setColor(int)>
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
		//    9   19:aload_0         
		//   10   20:invokestatic    #301 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
		//   11   23:return          
		}

		void setSelectedIndicatorHeight(int i)
		{
			if(selectedIndicatorHeight != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #185 <Field int selectedIndicatorHeight>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				selectedIndicatorHeight = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #185 <Field int selectedIndicatorHeight>
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
		//    7   13:aload_0         
		//    8   14:invokestatic    #301 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
		//    9   17:return          
		}

		private final GradientDrawable defaultSelectionIndicator = new GradientDrawable();
		private ValueAnimator indicatorAnimator;
		private int indicatorLeft;
		private int indicatorRight;
		private int layoutDirection;
		private int selectedIndicatorHeight;
		private final Paint selectedIndicatorPaint = new Paint();
		int selectedPosition;
		float selectionOffset;
		final TabLayout this$0;

		SlidingTabIndicator(Context context)
		{
			this$0 = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field TabLayout this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #34  <Method void LinearLayout(Context)>
			selectedPosition = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #36  <Field int selectedPosition>
			layoutDirection = -1;
		//    9   15:aload_0         
		//   10   16:iconst_m1       
		//   11   17:putfield        #38  <Field int layoutDirection>
			indicatorLeft = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #40  <Field int indicatorLeft>
			indicatorRight = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #42  <Field int indicatorRight>
			setWillNotDraw(false);
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:invokevirtual   #46  <Method void setWillNotDraw(boolean)>
		//   21   35:aload_0         
		//   22   36:new             #48  <Class Paint>
		//   23   39:dup             
		//   24   40:invokespecial   #51  <Method void Paint()>
		//   25   43:putfield        #53  <Field Paint selectedIndicatorPaint>
		//   26   46:aload_0         
		//   27   47:new             #55  <Class GradientDrawable>
		//   28   50:dup             
		//   29   51:invokespecial   #56  <Method void GradientDrawable()>
		//   30   54:putfield        #58  <Field GradientDrawable defaultSelectionIndicator>
		//   31   57:return          
		}
	}

	public static class Tab
	{

		public CharSequence getContentDescription()
		{
			TabView tabview = view;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field TabLayout$TabView view>
		//    2    4:astore_1        
			if(tabview == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return tabview.getContentDescription();
		//    7   11:aload_1         
		//    8   12:invokevirtual   #47  <Method CharSequence TabLayout$TabView.getContentDescription()>
		//    9   15:areturn         
		}

		public View getCustomView()
		{
			return customView;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field View customView>
		//    2    4:areturn         
		}

		public Drawable getIcon()
		{
			return icon;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Drawable icon>
		//    2    4:areturn         
		}

		public int getPosition()
		{
			return position;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int position>
		//    2    4:ireturn         
		}

		public Object getTag()
		{
			return tag;
		//    0    0:aload_0         
		//    1    1:getfield        #62  <Field Object tag>
		//    2    4:areturn         
		}

		public CharSequence getText()
		{
			return text;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field CharSequence text>
		//    2    4:areturn         
		}

		public boolean isSelected()
		{
			TabLayout tablayout = parent;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field TabLayout parent>
		//    2    4:astore_1        
			if(tablayout != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          24
				return tablayout.getSelectedTabPosition() == position;
		//    5    9:aload_1         
		//    6   10:invokevirtual   #70  <Method int TabLayout.getSelectedTabPosition()>
		//    7   13:aload_0         
		//    8   14:getfield        #30  <Field int position>
		//    9   17:icmpne          22
		//   10   20:iconst_1        
		//   11   21:ireturn         
		//   12   22:iconst_0        
		//   13   23:ireturn         
			else
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//   14   24:new             #72  <Class IllegalArgumentException>
		//   15   27:dup             
		//   16   28:ldc1            #74  <String "Tab not attached to a TabLayout">
		//   17   30:invokespecial   #77  <Method void IllegalArgumentException(String)>
		//   18   33:athrow          
		}

		void reset()
		{
			parent = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #67  <Field TabLayout parent>
			view = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #43  <Field TabLayout$TabView view>
			tag = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #62  <Field Object tag>
			icon = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #56  <Field Drawable icon>
			text = null;
		//   12   20:aload_0         
		//   13   21:aconst_null     
		//   14   22:putfield        #38  <Field CharSequence text>
			contentDesc = null;
		//   15   25:aload_0         
		//   16   26:aconst_null     
		//   17   27:putfield        #35  <Field CharSequence contentDesc>
			position = -1;
		//   18   30:aload_0         
		//   19   31:iconst_m1       
		//   20   32:putfield        #30  <Field int position>
			customView = null;
		//   21   35:aload_0         
		//   22   36:aconst_null     
		//   23   37:putfield        #52  <Field View customView>
		//   24   40:return          
		}

		public void select()
		{
			TabLayout tablayout = parent;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field TabLayout parent>
		//    2    4:astore_1        
			if(tablayout != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          15
			{
				tablayout.selectTab(this);
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:invokevirtual   #83  <Method void TabLayout.selectTab(TabLayout$Tab)>
				return;
		//    8   14:return          
			} else
			{
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    9   15:new             #72  <Class IllegalArgumentException>
		//   10   18:dup             
		//   11   19:ldc1            #74  <String "Tab not attached to a TabLayout">
		//   12   21:invokespecial   #77  <Method void IllegalArgumentException(String)>
		//   13   24:athrow          
			}
		}

		public Tab setContentDescription(int i)
		{
			TabLayout tablayout = parent;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field TabLayout parent>
		//    2    4:astore_2        
			if(tablayout != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          22
				return setContentDescription(tablayout.getResources().getText(i));
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #91  <Method Resources TabLayout.getResources()>
		//    8   14:iload_1         
		//    9   15:invokevirtual   #96  <Method CharSequence Resources.getText(int)>
		//   10   18:invokevirtual   #99  <Method TabLayout$Tab setContentDescription(CharSequence)>
		//   11   21:areturn         
			else
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//   12   22:new             #72  <Class IllegalArgumentException>
		//   13   25:dup             
		//   14   26:ldc1            #74  <String "Tab not attached to a TabLayout">
		//   15   28:invokespecial   #77  <Method void IllegalArgumentException(String)>
		//   16   31:athrow          
		}

		public Tab setContentDescription(CharSequence charsequence)
		{
			contentDesc = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field CharSequence contentDesc>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #103 <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Tab setCustomView(int i)
		{
			return setCustomView(LayoutInflater.from(view.getContext()).inflate(i, ((ViewGroup) (view)), false));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #43  <Field TabLayout$TabView view>
		//    3    5:invokevirtual   #109 <Method Context TabLayout$TabView.getContext()>
		//    4    8:invokestatic    #115 <Method LayoutInflater LayoutInflater.from(Context)>
		//    5   11:iload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #43  <Field TabLayout$TabView view>
		//    8   16:iconst_0        
		//    9   17:invokevirtual   #119 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   10   20:invokevirtual   #122 <Method TabLayout$Tab setCustomView(View)>
		//   11   23:areturn         
		}

		public Tab setCustomView(View view1)
		{
			customView = view1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field View customView>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #103 <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Tab setIcon(int i)
		{
			TabLayout tablayout = parent;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field TabLayout parent>
		//    2    4:astore_2        
			if(tablayout != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          22
				return setIcon(AppCompatResources.getDrawable(tablayout.getContext(), i));
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #125 <Method Context TabLayout.getContext()>
		//    8   14:iload_1         
		//    9   15:invokestatic    #131 <Method Drawable AppCompatResources.getDrawable(Context, int)>
		//   10   18:invokevirtual   #134 <Method TabLayout$Tab setIcon(Drawable)>
		//   11   21:areturn         
			else
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//   12   22:new             #72  <Class IllegalArgumentException>
		//   13   25:dup             
		//   14   26:ldc1            #74  <String "Tab not attached to a TabLayout">
		//   15   28:invokespecial   #77  <Method void IllegalArgumentException(String)>
		//   16   31:athrow          
		}

		public Tab setIcon(Drawable drawable)
		{
			icon = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #56  <Field Drawable icon>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #103 <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		void setPosition(int i)
		{
			position = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #30  <Field int position>
		//    3    5:return          
		}

		public Tab setTag(Object obj)
		{
			tag = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #62  <Field Object tag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Tab setText(int i)
		{
			TabLayout tablayout = parent;
		//    0    0:aload_0         
		//    1    1:getfield        #67  <Field TabLayout parent>
		//    2    4:astore_2        
			if(tablayout != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          22
				return setText(tablayout.getResources().getText(i));
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:invokevirtual   #91  <Method Resources TabLayout.getResources()>
		//    8   14:iload_1         
		//    9   15:invokevirtual   #96  <Method CharSequence Resources.getText(int)>
		//   10   18:invokevirtual   #141 <Method TabLayout$Tab setText(CharSequence)>
		//   11   21:areturn         
			else
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//   12   22:new             #72  <Class IllegalArgumentException>
		//   13   25:dup             
		//   14   26:ldc1            #74  <String "Tab not attached to a TabLayout">
		//   15   28:invokespecial   #77  <Method void IllegalArgumentException(String)>
		//   16   31:athrow          
		}

		public Tab setText(CharSequence charsequence)
		{
			if(TextUtils.isEmpty(contentDesc) && !TextUtils.isEmpty(charsequence))
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field CharSequence contentDesc>
		//*   2    4:invokestatic    #147 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   3    7:ifeq            25
		//*   4   10:aload_1         
		//*   5   11:invokestatic    #147 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   6   14:ifne            25
				view.setContentDescription(charsequence);
		//    7   17:aload_0         
		//    8   18:getfield        #43  <Field TabLayout$TabView view>
		//    9   21:aload_1         
		//   10   22:invokevirtual   #150 <Method void TabLayout$TabView.setContentDescription(CharSequence)>
			text = charsequence;
		//   11   25:aload_0         
		//   12   26:aload_1         
		//   13   27:putfield        #38  <Field CharSequence text>
			updateView();
		//   14   30:aload_0         
		//   15   31:invokevirtual   #103 <Method void updateView()>
			return this;
		//   16   34:aload_0         
		//   17   35:areturn         
		}

		void updateView()
		{
			TabView tabview = view;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field TabLayout$TabView view>
		//    2    4:astore_1        
			if(tabview != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          13
				tabview.update();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #153 <Method void TabLayout$TabView.update()>
		//    7   13:return          
		}

		public static final int INVALID_POSITION = -1;
		private CharSequence contentDesc;
		private View customView;
		private Drawable icon;
		public TabLayout parent;
		private int position;
		private Object tag;
		private CharSequence text;
		public TabView view;


/*
		static CharSequence access$100(Tab tab)
		{
			return tab.contentDesc;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field CharSequence contentDesc>
		//    2    4:areturn         
		}

*/


/*
		static CharSequence access$200(Tab tab)
		{
			return tab.text;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field CharSequence text>
		//    2    4:areturn         
		}

*/

		public Tab()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			position = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #30  <Field int position>
		//    5    9:return          
		}
	}

	public static interface TabGravity
		extends Annotation
	{
	}

	public static interface TabIndicatorGravity
		extends Annotation
	{
	}

	public static class TabLayoutOnPageChangeListener
		implements android.support.v4.view.ViewPager.OnPageChangeListener
	{

		public void onPageScrollStateChanged(int i)
		{
			previousScrollState = scrollState;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #32  <Field int scrollState>
		//    3    5:putfield        #34  <Field int previousScrollState>
			scrollState = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #32  <Field int scrollState>
		//    7   13:return          
		}

		public void onPageScrolled(int i, float f, int j)
		{
			TabLayout tablayout = (TabLayout)tabLayoutRef.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference tabLayoutRef>
		//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class TabLayout>
		//    4   10:astore          6
			if(tablayout != null)
		//*   5   12:aload           6
		//*   6   14:ifnull          79
			{
				j = scrollState;
		//    7   17:aload_0         
		//    8   18:getfield        #32  <Field int scrollState>
		//    9   21:istore_3        
				boolean flag1 = false;
		//   10   22:iconst_0        
		//   11   23:istore          5
				boolean flag;
				if(j == 2 && previousScrollState != 1)
		//*  12   25:iload_3         
		//*  13   26:iconst_2        
		//*  14   27:icmpne          47
		//*  15   30:aload_0         
		//*  16   31:getfield        #34  <Field int previousScrollState>
		//*  17   34:iconst_1        
		//*  18   35:icmpne          41
		//*  19   38:goto            47
					flag = false;
		//   20   41:iconst_0        
		//   21   42:istore          4
				else
		//*  22   44:goto            50
					flag = true;
		//   23   47:iconst_1        
		//   24   48:istore          4
				if(scrollState != 2 || previousScrollState != 0)
		//*  25   50:aload_0         
		//*  26   51:getfield        #32  <Field int scrollState>
		//*  27   54:iconst_2        
		//*  28   55:icmpne          65
		//*  29   58:aload_0         
		//*  30   59:getfield        #34  <Field int previousScrollState>
		//*  31   62:ifeq            68
					flag1 = true;
		//   32   65:iconst_1        
		//   33   66:istore          5
				tablayout.setScrollPosition(i, f, flag, flag1);
		//   34   68:aload           6
		//   35   70:iload_1         
		//   36   71:fload_2         
		//   37   72:iload           4
		//   38   74:iload           5
		//   39   76:invokevirtual   #44  <Method void TabLayout.setScrollPosition(int, float, boolean, boolean)>
			}
		//   40   79:return          
		}

		public void onPageSelected(int i)
		{
			TabLayout tablayout = (TabLayout)tabLayoutRef.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference tabLayoutRef>
		//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class TabLayout>
		//    4   10:astore          4
			if(tablayout != null && tablayout.getSelectedTabPosition() != i && i < tablayout.getTabCount())
		//*   5   12:aload           4
		//*   6   14:ifnull          78
		//*   7   17:aload           4
		//*   8   19:invokevirtual   #49  <Method int TabLayout.getSelectedTabPosition()>
		//*   9   22:iload_1         
		//*  10   23:icmpeq          78
		//*  11   26:iload_1         
		//*  12   27:aload           4
		//*  13   29:invokevirtual   #52  <Method int TabLayout.getTabCount()>
		//*  14   32:icmpge          78
			{
				int j = scrollState;
		//   15   35:aload_0         
		//   16   36:getfield        #32  <Field int scrollState>
		//   17   39:istore_2        
				boolean flag;
				if(j != 0 && (j != 2 || previousScrollState != 0))
		//*  18   40:iload_2         
		//*  19   41:ifeq            64
		//*  20   44:iload_2         
		//*  21   45:iconst_2        
		//*  22   46:icmpne          59
		//*  23   49:aload_0         
		//*  24   50:getfield        #34  <Field int previousScrollState>
		//*  25   53:ifne            59
		//*  26   56:goto            64
					flag = false;
		//   27   59:iconst_0        
		//   28   60:istore_3        
				else
		//*  29   61:goto            66
					flag = true;
		//   30   64:iconst_1        
		//   31   65:istore_3        
				tablayout.selectTab(tablayout.getTabAt(i), flag);
		//   32   66:aload           4
		//   33   68:aload           4
		//   34   70:iload_1         
		//   35   71:invokevirtual   #56  <Method TabLayout$Tab TabLayout.getTabAt(int)>
		//   36   74:iload_3         
		//   37   75:invokevirtual   #60  <Method void TabLayout.selectTab(TabLayout$Tab, boolean)>
			}
		//   38   78:return          
		}

		void reset()
		{
			scrollState = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #32  <Field int scrollState>
			previousScrollState = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #34  <Field int previousScrollState>
		//    6   10:return          
		}

		private int previousScrollState;
		private int scrollState;
		private final WeakReference tabLayoutRef;

		public TabLayoutOnPageChangeListener(TabLayout tablayout)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			tabLayoutRef = new WeakReference(((Object) (tablayout)));
		//    2    4:aload_0         
		//    3    5:new             #22  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
		//    7   13:putfield        #27  <Field WeakReference tabLayoutRef>
		//    8   16:return          
		}
	}

	class TabView extends LinearLayout
	{

		private float approximateLineWidth(Layout layout, int i, float f)
		{
			return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #106 <Method float Layout.getLineWidth(int)>
		//    3    5:fload_3         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #110 <Method TextPaint Layout.getPaint()>
		//    6   10:invokevirtual   #116 <Method float TextPaint.getTextSize()>
		//    7   13:fdiv            
		//    8   14:fmul            
		//    9   15:freturn         
		}

		private void drawBackground(Canvas canvas)
		{
			Drawable drawable = baseBackgroundDrawable;
		//    0    0:aload_0         
		//    1    1:getfield        #118 <Field Drawable baseBackgroundDrawable>
		//    2    4:astore_2        
			if(drawable != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          37
			{
				drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
		//    5    9:aload_2         
		//    6   10:aload_0         
		//    7   11:invokevirtual   #121 <Method int getLeft()>
		//    8   14:aload_0         
		//    9   15:invokevirtual   #124 <Method int getTop()>
		//   10   18:aload_0         
		//   11   19:invokevirtual   #127 <Method int getRight()>
		//   12   22:aload_0         
		//   13   23:invokevirtual   #130 <Method int getBottom()>
		//   14   26:invokevirtual   #136 <Method void Drawable.setBounds(int, int, int, int)>
				baseBackgroundDrawable.draw(canvas);
		//   15   29:aload_0         
		//   16   30:getfield        #118 <Field Drawable baseBackgroundDrawable>
		//   17   33:aload_1         
		//   18   34:invokevirtual   #139 <Method void Drawable.draw(Canvas)>
			}
		//   19   37:return          
		}

		private int getContentWidth()
		{
			View aview[] = new View[3];
		//    0    0:iconst_3        
		//    1    1:anewarray       View[]
		//    2    4:astore          9
			TextView textview = textView;
		//    3    6:aload_0         
		//    4    7:getfield        #143 <Field TextView textView>
		//    5   10:astore          10
			int k = 0;
		//    6   12:iconst_0        
		//    7   13:istore_3        
			aview[0] = ((View) (textview));
		//    8   14:aload           9
		//    9   16:iconst_0        
		//   10   17:aload           10
		//   11   19:aastore         
			aview[1] = ((View) (iconView));
		//   12   20:aload           9
		//   13   22:iconst_1        
		//   14   23:aload_0         
		//   15   24:getfield        #145 <Field ImageView iconView>
		//   16   27:aastore         
			aview[2] = customView;
		//   17   28:aload           9
		//   18   30:iconst_2        
		//   19   31:aload_0         
		//   20   32:getfield        #147 <Field View customView>
		//   21   35:aastore         
			int k1 = aview.length;
		//   22   36:aload           9
		//   23   38:arraylength     
		//   24   39:istore          8
			int l = 0;
		//   25   41:iconst_0        
		//   26   42:istore          4
			int i = l;
		//   27   44:iload           4
		//   28   46:istore_1        
			boolean flag;
			for(int j = i; k < k1; j = ((int) (flag)))
		//*  29   47:iload_1         
		//*  30   48:istore_2        
		//*  31   49:iload_3         
		//*  32   50:iload           8
		//*  33   52:icmpge          167
			{
				View view = aview[k];
		//   34   55:aload           9
		//   35   57:iload_3         
		//   36   58:aaload          
		//   37   59:astore          10
				int j1 = l;
		//   38   61:iload           4
		//   39   63:istore          7
				int i1 = i;
		//   40   65:iload_1         
		//   41   66:istore          6
				flag = ((boolean) (j));
		//   42   68:iload_2         
		//   43   69:istore          5
				if(view != null)
		//*  44   71:aload           10
		//*  45   73:ifnull          150
				{
					j1 = l;
		//   46   76:iload           4
		//   47   78:istore          7
					i1 = i;
		//   48   80:iload_1         
		//   49   81:istore          6
					flag = ((boolean) (j));
		//   50   83:iload_2         
		//   51   84:istore          5
					if(view.getVisibility() == 0)
		//*  52   86:aload           10
		//*  53   88:invokevirtual   #150 <Method int View.getVisibility()>
		//*  54   91:ifne            150
					{
						if(j != 0)
		//*  55   94:iload_2         
		//*  56   95:ifeq            111
							i = Math.min(i, view.getLeft());
		//   57   98:iload_1         
		//   58   99:aload           10
		//   59  101:invokevirtual   #151 <Method int View.getLeft()>
		//   60  104:invokestatic    #157 <Method int Math.min(int, int)>
		//   61  107:istore_1        
						else
		//*  62  108:goto            117
							i = view.getLeft();
		//   63  111:aload           10
		//   64  113:invokevirtual   #151 <Method int View.getLeft()>
		//   65  116:istore_1        
						if(j != 0)
		//*  66  117:iload_2         
		//*  67  118:ifeq            135
							j = Math.max(l, view.getRight());
		//   68  121:iload           4
		//   69  123:aload           10
		//   70  125:invokevirtual   #158 <Method int View.getRight()>
		//   71  128:invokestatic    #161 <Method int Math.max(int, int)>
		//   72  131:istore_2        
						else
		//*  73  132:goto            141
							j = view.getRight();
		//   74  135:aload           10
		//   75  137:invokevirtual   #158 <Method int View.getRight()>
		//   76  140:istore_2        
						flag = true;
		//   77  141:iconst_1        
		//   78  142:istore          5
						i1 = i;
		//   79  144:iload_1         
		//   80  145:istore          6
						j1 = j;
		//   81  147:iload_2         
		//   82  148:istore          7
					}
				}
				k++;
		//   83  150:iload_3         
		//   84  151:iconst_1        
		//   85  152:iadd            
		//   86  153:istore_3        
				l = j1;
		//   87  154:iload           7
		//   88  156:istore          4
				i = i1;
		//   89  158:iload           6
		//   90  160:istore_1        
			}

		//   91  161:iload           5
		//   92  163:istore_2        
		//*  93  164:goto            49
			return l - i;
		//   94  167:iload           4
		//   95  169:iload_1         
		//   96  170:isub            
		//   97  171:ireturn         
		}

		private void updateBackgroundDrawable(Context context)
		{
			if(tabBackgroundResId != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field TabLayout this$0>
		//*   2    4:getfield        #164 <Field int TabLayout.tabBackgroundResId>
		//*   3    7:ifeq            56
			{
				baseBackgroundDrawable = AppCompatResources.getDrawable(context, tabBackgroundResId);
		//    4   10:aload_0         
		//    5   11:aload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field TabLayout this$0>
		//    8   16:getfield        #164 <Field int TabLayout.tabBackgroundResId>
		//    9   19:invokestatic    #170 <Method Drawable AppCompatResources.getDrawable(Context, int)>
		//   10   22:putfield        #118 <Field Drawable baseBackgroundDrawable>
				context = ((Context) (baseBackgroundDrawable));
		//   11   25:aload_0         
		//   12   26:getfield        #118 <Field Drawable baseBackgroundDrawable>
		//   13   29:astore_1        
				if(context != null && ((Drawable) (context)).isStateful())
		//*  14   30:aload_1         
		//*  15   31:ifnull          61
		//*  16   34:aload_1         
		//*  17   35:invokevirtual   #174 <Method boolean Drawable.isStateful()>
		//*  18   38:ifeq            61
					baseBackgroundDrawable.setState(getDrawableState());
		//   19   41:aload_0         
		//   20   42:getfield        #118 <Field Drawable baseBackgroundDrawable>
		//   21   45:aload_0         
		//   22   46:invokevirtual   #178 <Method int[] getDrawableState()>
		//   23   49:invokevirtual   #182 <Method boolean Drawable.setState(int[])>
		//   24   52:pop             
			} else
		//*  25   53:goto            61
			{
				baseBackgroundDrawable = null;
		//   26   56:aload_0         
		//   27   57:aconst_null     
		//   28   58:putfield        #118 <Field Drawable baseBackgroundDrawable>
			}
			GradientDrawable gradientdrawable = new GradientDrawable();
		//   29   61:new             #184 <Class GradientDrawable>
		//   30   64:dup             
		//   31   65:invokespecial   #187 <Method void GradientDrawable()>
		//   32   68:astore_2        
			((GradientDrawable)gradientdrawable).setColor(0);
		//   33   69:aload_2         
		//   34   70:checkcast       #184 <Class GradientDrawable>
		//   35   73:iconst_0        
		//   36   74:invokevirtual   #190 <Method void GradientDrawable.setColor(int)>
			context = ((Context) (gradientdrawable));
		//   37   77:aload_2         
		//   38   78:astore_1        
			if(tabRippleColorStateList != null)
		//*  39   79:aload_0         
		//*  40   80:getfield        #28  <Field TabLayout this$0>
		//*  41   83:getfield        #194 <Field ColorStateList TabLayout.tabRippleColorStateList>
		//*  42   86:ifnull          195
			{
				context = ((Context) (new GradientDrawable()));
		//   43   89:new             #184 <Class GradientDrawable>
		//   44   92:dup             
		//   45   93:invokespecial   #187 <Method void GradientDrawable()>
		//   46   96:astore_1        
				((GradientDrawable) (context)).setCornerRadius(1E-05F);
		//   47   97:aload_1         
		//   48   98:ldc1            #195 <Float 1E-05F>
		//   49  100:invokevirtual   #199 <Method void GradientDrawable.setCornerRadius(float)>
				((GradientDrawable) (context)).setColor(-1);
		//   50  103:aload_1         
		//   51  104:iconst_m1       
		//   52  105:invokevirtual   #190 <Method void GradientDrawable.setColor(int)>
				ColorStateList colorstatelist = RippleUtils.convertToRippleDrawableColor(tabRippleColorStateList);
		//   53  108:aload_0         
		//   54  109:getfield        #28  <Field TabLayout this$0>
		//   55  112:getfield        #194 <Field ColorStateList TabLayout.tabRippleColorStateList>
		//   56  115:invokestatic    #205 <Method ColorStateList RippleUtils.convertToRippleDrawableColor(ColorStateList)>
		//   57  118:astore_3        
				if(android.os.Build.VERSION.SDK_INT >= 21)
		//*  58  119:getstatic       #210 <Field int android.os.Build$VERSION.SDK_INT>
		//*  59  122:bipush          21
		//*  60  124:icmplt          165
				{
					if(unboundedRipple)
		//*  61  127:aload_0         
		//*  62  128:getfield        #28  <Field TabLayout this$0>
		//*  63  131:getfield        #213 <Field boolean TabLayout.unboundedRipple>
		//*  64  134:ifeq            139
						gradientdrawable = null;
		//   65  137:aconst_null     
		//   66  138:astore_2        
					if(unboundedRipple)
		//*  67  139:aload_0         
		//*  68  140:getfield        #28  <Field TabLayout this$0>
		//*  69  143:getfield        #213 <Field boolean TabLayout.unboundedRipple>
		//*  70  146:ifeq            151
						context = null;
		//   71  149:aconst_null     
		//   72  150:astore_1        
					context = ((Context) (new RippleDrawable(colorstatelist, ((Drawable) (gradientdrawable)), ((Drawable) (context)))));
		//   73  151:new             #215 <Class RippleDrawable>
		//   74  154:dup             
		//   75  155:aload_3         
		//   76  156:aload_2         
		//   77  157:aload_1         
		//   78  158:invokespecial   #218 <Method void RippleDrawable(ColorStateList, Drawable, Drawable)>
		//   79  161:astore_1        
				} else
		//*  80  162:goto            195
				{
					context = ((Context) (DrawableCompat.wrap(((Drawable) (context)))));
		//   81  165:aload_1         
		//   82  166:invokestatic    #224 <Method Drawable DrawableCompat.wrap(Drawable)>
		//   83  169:astore_1        
					DrawableCompat.setTintList(((Drawable) (context)), colorstatelist);
		//   84  170:aload_1         
		//   85  171:aload_3         
		//   86  172:invokestatic    #228 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
					context = ((Context) (new LayerDrawable(new Drawable[] {
						gradientdrawable, context
					})));
		//   87  175:new             #230 <Class LayerDrawable>
		//   88  178:dup             
		//   89  179:iconst_2        
		//   90  180:anewarray       Drawable[]
		//   91  183:dup             
		//   92  184:iconst_0        
		//   93  185:aload_2         
		//   94  186:aastore         
		//   95  187:dup             
		//   96  188:iconst_1        
		//   97  189:aload_1         
		//   98  190:aastore         
		//   99  191:invokespecial   #233 <Method void LayerDrawable(Drawable[])>
		//  100  194:astore_1        
				}
			}
			ViewCompat.setBackground(((View) (this)), ((Drawable) (context)));
		//  101  195:aload_0         
		//  102  196:aload_1         
		//  103  197:invokestatic    #237 <Method void ViewCompat.setBackground(View, Drawable)>
			invalidate();
		//  104  200:aload_0         
		//  105  201:getfield        #28  <Field TabLayout this$0>
		//  106  204:invokevirtual   #240 <Method void TabLayout.invalidate()>
		//  107  207:return          
		}

		private void updateTextAndIcon(TextView textview, ImageView imageview)
		{
			Object obj = ((Object) (tab));
		//    0    0:aload_0         
		//    1    1:getfield        #244 <Field TabLayout$Tab tab>
		//    2    4:astore          5
			if(obj != null && ((Tab) (obj)).getIcon() != null)
		//*   3    6:aload           5
		//*   4    8:ifnull          37
		//*   5   11:aload           5
		//*   6   13:invokevirtual   #250 <Method Drawable TabLayout$Tab.getIcon()>
		//*   7   16:ifnull          37
				obj = ((Object) (DrawableCompat.wrap(tab.getIcon()).mutate()));
		//    8   19:aload_0         
		//    9   20:getfield        #244 <Field TabLayout$Tab tab>
		//   10   23:invokevirtual   #250 <Method Drawable TabLayout$Tab.getIcon()>
		//   11   26:invokestatic    #224 <Method Drawable DrawableCompat.wrap(Drawable)>
		//   12   29:invokevirtual   #253 <Method Drawable Drawable.mutate()>
		//   13   32:astore          5
			else
		//*  14   34:goto            40
				obj = null;
		//   15   37:aconst_null     
		//   16   38:astore          5
			Object obj1 = ((Object) (tab));
		//   17   40:aload_0         
		//   18   41:getfield        #244 <Field TabLayout$Tab tab>
		//   19   44:astore          6
			if(obj1 != null)
		//*  20   46:aload           6
		//*  21   48:ifnull          61
				obj1 = ((Object) (((Tab) (obj1)).getText()));
		//   22   51:aload           6
		//   23   53:invokevirtual   #257 <Method CharSequence TabLayout$Tab.getText()>
		//   24   56:astore          6
			else
		//*  25   58:goto            64
				obj1 = null;
		//   26   61:aconst_null     
		//   27   62:astore          6
			if(imageview != null)
		//*  28   64:aload_2         
		//*  29   65:ifnull          103
				if(obj != null)
		//*  30   68:aload           5
		//*  31   70:ifnull          92
				{
					imageview.setImageDrawable(((Drawable) (obj)));
		//   32   73:aload_2         
		//   33   74:aload           5
		//   34   76:invokevirtual   #263 <Method void ImageView.setImageDrawable(Drawable)>
					imageview.setVisibility(0);
		//   35   79:aload_2         
		//   36   80:iconst_0        
		//   37   81:invokevirtual   #266 <Method void ImageView.setVisibility(int)>
					setVisibility(0);
		//   38   84:aload_0         
		//   39   85:iconst_0        
		//   40   86:invokevirtual   #267 <Method void setVisibility(int)>
				} else
		//*  41   89:goto            103
				{
					imageview.setVisibility(8);
		//   42   92:aload_2         
		//   43   93:bipush          8
		//   44   95:invokevirtual   #266 <Method void ImageView.setVisibility(int)>
					imageview.setImageDrawable(((Drawable) (null)));
		//   45   98:aload_2         
		//   46   99:aconst_null     
		//   47  100:invokevirtual   #263 <Method void ImageView.setImageDrawable(Drawable)>
				}
			boolean flag = TextUtils.isEmpty(((CharSequence) (obj1))) ^ true;
		//   48  103:aload           6
		//   49  105:invokestatic    #273 <Method boolean TextUtils.isEmpty(CharSequence)>
		//   50  108:iconst_1        
		//   51  109:ixor            
		//   52  110:istore          4
			if(textview != null)
		//*  53  112:aload_1         
		//*  54  113:ifnull          151
				if(flag)
		//*  55  116:iload           4
		//*  56  118:ifeq            140
				{
					textview.setText(((CharSequence) (obj1)));
		//   57  121:aload_1         
		//   58  122:aload           6
		//   59  124:invokevirtual   #279 <Method void TextView.setText(CharSequence)>
					textview.setVisibility(0);
		//   60  127:aload_1         
		//   61  128:iconst_0        
		//   62  129:invokevirtual   #280 <Method void TextView.setVisibility(int)>
					setVisibility(0);
		//   63  132:aload_0         
		//   64  133:iconst_0        
		//   65  134:invokevirtual   #267 <Method void setVisibility(int)>
				} else
		//*  66  137:goto            151
				{
					textview.setVisibility(8);
		//   67  140:aload_1         
		//   68  141:bipush          8
		//   69  143:invokevirtual   #280 <Method void TextView.setVisibility(int)>
					textview.setText(((CharSequence) (null)));
		//   70  146:aload_1         
		//   71  147:aconst_null     
		//   72  148:invokevirtual   #279 <Method void TextView.setText(CharSequence)>
				}
			if(imageview != null)
		//*  73  151:aload_2         
		//*  74  152:ifnull          257
			{
				textview = ((TextView) ((android.view.ViewGroup.MarginLayoutParams)imageview.getLayoutParams()));
		//   75  155:aload_2         
		//   76  156:invokevirtual   #284 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
		//   77  159:checkcast       #286 <Class android.view.ViewGroup$MarginLayoutParams>
		//   78  162:astore_1        
				int i;
				if(flag && imageview.getVisibility() == 0)
		//*  79  163:iload           4
		//*  80  165:ifeq            188
		//*  81  168:aload_2         
		//*  82  169:invokevirtual   #287 <Method int ImageView.getVisibility()>
		//*  83  172:ifne            188
					i = dpToPx(8);
		//   84  175:aload_0         
		//   85  176:getfield        #28  <Field TabLayout this$0>
		//   86  179:bipush          8
		//   87  181:invokevirtual   #291 <Method int TabLayout.dpToPx(int)>
		//   88  184:istore_3        
				else
		//*  89  185:goto            190
					i = 0;
		//   90  188:iconst_0        
		//   91  189:istore_3        
				if(inlineLabel)
		//*  92  190:aload_0         
		//*  93  191:getfield        #28  <Field TabLayout this$0>
		//*  94  194:getfield        #62  <Field boolean TabLayout.inlineLabel>
		//*  95  197:ifeq            230
				{
					if(i != MarginLayoutParamsCompat.getMarginEnd(((android.view.ViewGroup.MarginLayoutParams) (textview))))
		//*  96  200:iload_3         
		//*  97  201:aload_1         
		//*  98  202:invokestatic    #297 <Method int MarginLayoutParamsCompat.getMarginEnd(android.view.ViewGroup$MarginLayoutParams)>
		//*  99  205:icmpeq          257
					{
						MarginLayoutParamsCompat.setMarginEnd(((android.view.ViewGroup.MarginLayoutParams) (textview)), i);
		//  100  208:aload_1         
		//  101  209:iload_3         
		//  102  210:invokestatic    #301 <Method void MarginLayoutParamsCompat.setMarginEnd(android.view.ViewGroup$MarginLayoutParams, int)>
						textview.bottomMargin = 0;
		//  103  213:aload_1         
		//  104  214:iconst_0        
		//  105  215:putfield        #304 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
						imageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (textview)));
		//  106  218:aload_2         
		//  107  219:aload_1         
		//  108  220:invokevirtual   #308 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
						imageview.requestLayout();
		//  109  223:aload_2         
		//  110  224:invokevirtual   #311 <Method void ImageView.requestLayout()>
					}
				} else
		//* 111  227:goto            257
				if(i != ((android.view.ViewGroup.MarginLayoutParams) (textview)).bottomMargin)
		//* 112  230:iload_3         
		//* 113  231:aload_1         
		//* 114  232:getfield        #304 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//* 115  235:icmpeq          257
				{
					textview.bottomMargin = i;
		//  116  238:aload_1         
		//  117  239:iload_3         
		//  118  240:putfield        #304 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
					MarginLayoutParamsCompat.setMarginEnd(((android.view.ViewGroup.MarginLayoutParams) (textview)), 0);
		//  119  243:aload_1         
		//  120  244:iconst_0        
		//  121  245:invokestatic    #301 <Method void MarginLayoutParamsCompat.setMarginEnd(android.view.ViewGroup$MarginLayoutParams, int)>
					imageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (textview)));
		//  122  248:aload_2         
		//  123  249:aload_1         
		//  124  250:invokevirtual   #308 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					imageview.requestLayout();
		//  125  253:aload_2         
		//  126  254:invokevirtual   #311 <Method void ImageView.requestLayout()>
				}
			}
			textview = ((TextView) (tab));
		//  127  257:aload_0         
		//  128  258:getfield        #244 <Field TabLayout$Tab tab>
		//  129  261:astore_1        
			if(textview != null)
		//* 130  262:aload_1         
		//* 131  263:ifnull          274
				textview = ((TextView) (((Tab) (textview)).contentDesc));
		//  132  266:aload_1         
		//  133  267:invokestatic    #315 <Method CharSequence TabLayout$Tab.access$100(TabLayout$Tab)>
		//  134  270:astore_1        
			else
		//* 135  271:goto            276
				textview = null;
		//  136  274:aconst_null     
		//  137  275:astore_1        
			if(flag)
		//* 138  276:iload           4
		//* 139  278:ifeq            283
				textview = null;
		//  140  281:aconst_null     
		//  141  282:astore_1        
			TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (textview)));
		//  142  283:aload_0         
		//  143  284:aload_1         
		//  144  285:invokestatic    #321 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		//  145  288:return          
		}

		protected void drawableStateChanged()
		{
			super.drawableStateChanged();
		//    0    0:aload_0         
		//    1    1:invokespecial   #325 <Method void LinearLayout.drawableStateChanged()>
			int ai[] = getDrawableState();
		//    2    4:aload_0         
		//    3    5:invokevirtual   #178 <Method int[] getDrawableState()>
		//    4    8:astore_3        
			Drawable drawable = baseBackgroundDrawable;
		//    5    9:aload_0         
		//    6   10:getfield        #118 <Field Drawable baseBackgroundDrawable>
		//    7   13:astore          4
			boolean flag1 = false;
		//    8   15:iconst_0        
		//    9   16:istore_2        
			boolean flag = flag1;
		//   10   17:iload_2         
		//   11   18:istore_1        
			if(drawable != null)
		//*  12   19:aload           4
		//*  13   21:ifnull          45
			{
				flag = flag1;
		//   14   24:iload_2         
		//   15   25:istore_1        
				if(drawable.isStateful())
		//*  16   26:aload           4
		//*  17   28:invokevirtual   #174 <Method boolean Drawable.isStateful()>
		//*  18   31:ifeq            45
					flag = false | baseBackgroundDrawable.setState(ai);
		//   19   34:iconst_0        
		//   20   35:aload_0         
		//   21   36:getfield        #118 <Field Drawable baseBackgroundDrawable>
		//   22   39:aload_3         
		//   23   40:invokevirtual   #182 <Method boolean Drawable.setState(int[])>
		//   24   43:ior             
		//   25   44:istore_1        
			}
			if(flag)
		//*  26   45:iload_1         
		//*  27   46:ifeq            60
			{
				invalidate();
		//   28   49:aload_0         
		//   29   50:invokevirtual   #326 <Method void invalidate()>
				invalidate();
		//   30   53:aload_0         
		//   31   54:getfield        #28  <Field TabLayout this$0>
		//   32   57:invokevirtual   #240 <Method void TabLayout.invalidate()>
			}
		//   33   60:return          
		}

		public Tab getTab()
		{
			return tab;
		//    0    0:aload_0         
		//    1    1:getfield        #244 <Field TabLayout$Tab tab>
		//    2    4:areturn         
		}

		public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #332 <Method void LinearLayout.onInitializeAccessibilityEvent(AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc2            #334 <Class android.support.v7.app.ActionBar$Tab>
		//    5    9:invokevirtual   #340 <Method String Class.getName()>
		//    6   12:invokevirtual   #345 <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    7   15:return          
		}

		public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #352 <Method void LinearLayout.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc2            #334 <Class android.support.v7.app.ActionBar$Tab>
		//    5    9:invokevirtual   #340 <Method String Class.getName()>
		//    6   12:invokevirtual   #355 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		//    7   15:return          
		}

		public void onMeasure(int i, int j)
		{
			int k;
label0:
			{
				int l = android.view.View.MeasureSpec.getSize(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #363 <Method int android.view.View$MeasureSpec.getSize(int)>
		//    2    4:istore          6
				int j1 = android.view.View.MeasureSpec.getMode(i);
		//    3    6:iload_1         
		//    4    7:invokestatic    #366 <Method int android.view.View$MeasureSpec.getMode(int)>
		//    5   10:istore          7
				int k1 = getTabMaxWidth();
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field TabLayout this$0>
		//    8   16:invokevirtual   #369 <Method int TabLayout.getTabMaxWidth()>
		//    9   19:istore          8
				k = i;
		//   10   21:iload_1         
		//   11   22:istore          5
				if(k1 <= 0)
					break label0;
		//   12   24:iload           8
		//   13   26:ifle            59
				if(j1 != 0)
		//*  14   29:iload           7
		//*  15   31:ifeq            44
				{
					k = i;
		//   16   34:iload_1         
		//   17   35:istore          5
					if(l <= k1)
						break label0;
		//   18   37:iload           6
		//   19   39:iload           8
		//   20   41:icmple          59
				}
				k = android.view.View.MeasureSpec.makeMeasureSpec(tabMaxWidth, 0x80000000);
		//   21   44:aload_0         
		//   22   45:getfield        #28  <Field TabLayout this$0>
		//   23   48:getfield        #372 <Field int TabLayout.tabMaxWidth>
		//   24   51:ldc2            #373 <Int 0x80000000>
		//   25   54:invokestatic    #376 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   26   57:istore          5
			}
label1:
			{
				float f;
				boolean flag;
label2:
				{
					super.onMeasure(k, j);
		//   27   59:aload_0         
		//   28   60:iload           5
		//   29   62:iload_2         
		//   30   63:invokespecial   #378 <Method void LinearLayout.onMeasure(int, int)>
					if(textView == null)
						break label1;
		//   31   66:aload_0         
		//   32   67:getfield        #143 <Field TextView textView>
		//   33   70:ifnull          321
					float f1 = tabTextSize;
		//   34   73:aload_0         
		//   35   74:getfield        #28  <Field TabLayout this$0>
		//   36   77:getfield        #382 <Field float TabLayout.tabTextSize>
		//   37   80:fstore          4
					int i1 = defaultMaxLines;
		//   38   82:aload_0         
		//   39   83:getfield        #33  <Field int defaultMaxLines>
		//   40   86:istore          6
					Object obj = ((Object) (iconView));
		//   41   88:aload_0         
		//   42   89:getfield        #145 <Field ImageView iconView>
		//   43   92:astore          10
					boolean flag1 = true;
		//   44   94:iconst_1        
		//   45   95:istore          7
					if(obj != null && ((ImageView) (obj)).getVisibility() == 0)
		//*  46   97:aload           10
		//*  47   99:ifnull          118
		//*  48  102:aload           10
		//*  49  104:invokevirtual   #287 <Method int ImageView.getVisibility()>
		//*  50  107:ifne            118
					{
						i = 1;
		//   51  110:iconst_1        
		//   52  111:istore_1        
						f = f1;
		//   53  112:fload           4
		//   54  114:fstore_3        
					} else
		//*  55  115:goto            161
					{
						obj = ((Object) (textView));
		//   56  118:aload_0         
		//   57  119:getfield        #143 <Field TextView textView>
		//   58  122:astore          10
						f = f1;
		//   59  124:fload           4
		//   60  126:fstore_3        
						i = i1;
		//   61  127:iload           6
		//   62  129:istore_1        
						if(obj != null)
		//*  63  130:aload           10
		//*  64  132:ifnull          161
						{
							f = f1;
		//   65  135:fload           4
		//   66  137:fstore_3        
							i = i1;
		//   67  138:iload           6
		//   68  140:istore_1        
							if(((TextView) (obj)).getLineCount() > 1)
		//*  69  141:aload           10
		//*  70  143:invokevirtual   #385 <Method int TextView.getLineCount()>
		//*  71  146:iconst_1        
		//*  72  147:icmple          161
							{
								f = tabTextMultiLineSize;
		//   73  150:aload_0         
		//   74  151:getfield        #28  <Field TabLayout this$0>
		//   75  154:getfield        #388 <Field float TabLayout.tabTextMultiLineSize>
		//   76  157:fstore_3        
								i = i1;
		//   77  158:iload           6
		//   78  160:istore_1        
							}
						}
					}
					f1 = textView.getTextSize();
		//   79  161:aload_0         
		//   80  162:getfield        #143 <Field TextView textView>
		//   81  165:invokevirtual   #389 <Method float TextView.getTextSize()>
		//   82  168:fstore          4
					int l1 = textView.getLineCount();
		//   83  170:aload_0         
		//   84  171:getfield        #143 <Field TextView textView>
		//   85  174:invokevirtual   #385 <Method int TextView.getLineCount()>
		//   86  177:istore          8
					i1 = TextViewCompat.getMaxLines(textView);
		//   87  179:aload_0         
		//   88  180:getfield        #143 <Field TextView textView>
		//   89  183:invokestatic    #395 <Method int TextViewCompat.getMaxLines(TextView)>
		//   90  186:istore          6
					int i2 = f != f1;
		//   91  188:fload_3         
		//   92  189:fload           4
		//   93  191:fcmpl           
		//   94  192:istore          9
					if(i2 == 0 && (i1 < 0 || i == i1))
						break label1;
		//   95  194:iload           9
		//   96  196:ifne            210
		//   97  199:iload           6
		//   98  201:iflt            321
		//   99  204:iload_1         
		//  100  205:iload           6
		//  101  207:icmpeq          321
					flag = flag1;
		//  102  210:iload           7
		//  103  212:istore          6
					if(mode != 1)
						break label2;
		//  104  214:aload_0         
		//  105  215:getfield        #28  <Field TabLayout this$0>
		//  106  218:getfield        #398 <Field int TabLayout.mode>
		//  107  221:iconst_1        
		//  108  222:icmpne          292
					flag = flag1;
		//  109  225:iload           7
		//  110  227:istore          6
					if(i2 <= 0)
						break label2;
		//  111  229:iload           9
		//  112  231:ifle            292
					flag = flag1;
		//  113  234:iload           7
		//  114  236:istore          6
					if(l1 != 1)
						break label2;
		//  115  238:iload           8
		//  116  240:iconst_1        
		//  117  241:icmpne          292
					obj = ((Object) (textView.getLayout()));
		//  118  244:aload_0         
		//  119  245:getfield        #143 <Field TextView textView>
		//  120  248:invokevirtual   #402 <Method Layout TextView.getLayout()>
		//  121  251:astore          10
					if(obj != null)
		//* 122  253:aload           10
		//* 123  255:ifnull          289
					{
						flag = flag1;
		//  124  258:iload           7
		//  125  260:istore          6
						if(approximateLineWidth(((Layout) (obj)), 0, f) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
							break label2;
		//  126  262:aload_0         
		//  127  263:aload           10
		//  128  265:iconst_0        
		//  129  266:fload_3         
		//  130  267:invokespecial   #404 <Method float approximateLineWidth(Layout, int, float)>
		//  131  270:aload_0         
		//  132  271:invokevirtual   #407 <Method int getMeasuredWidth()>
		//  133  274:aload_0         
		//  134  275:invokevirtual   #410 <Method int getPaddingLeft()>
		//  135  278:isub            
		//  136  279:aload_0         
		//  137  280:invokevirtual   #413 <Method int getPaddingRight()>
		//  138  283:isub            
		//  139  284:i2f             
		//  140  285:fcmpl           
		//  141  286:ifle            292
					}
					flag = false;
		//  142  289:iconst_0        
		//  143  290:istore          6
				}
				if(flag)
		//* 144  292:iload           6
		//* 145  294:ifeq            321
				{
					textView.setTextSize(0, f);
		//  146  297:aload_0         
		//  147  298:getfield        #143 <Field TextView textView>
		//  148  301:iconst_0        
		//  149  302:fload_3         
		//  150  303:invokevirtual   #417 <Method void TextView.setTextSize(int, float)>
					textView.setMaxLines(i);
		//  151  306:aload_0         
		//  152  307:getfield        #143 <Field TextView textView>
		//  153  310:iload_1         
		//  154  311:invokevirtual   #420 <Method void TextView.setMaxLines(int)>
					super.onMeasure(k, j);
		//  155  314:aload_0         
		//  156  315:iload           5
		//  157  317:iload_2         
		//  158  318:invokespecial   #378 <Method void LinearLayout.onMeasure(int, int)>
				}
			}
		//  159  321:return          
		}

		public boolean performClick()
		{
			boolean flag = super.performClick();
		//    0    0:aload_0         
		//    1    1:invokespecial   #423 <Method boolean LinearLayout.performClick()>
		//    2    4:istore_1        
			if(tab != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #244 <Field TabLayout$Tab tab>
		//*   5    9:ifnull          30
			{
				if(!flag)
		//*   6   12:iload_1         
		//*   7   13:ifne            21
					playSoundEffect(0);
		//    8   16:aload_0         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #426 <Method void playSoundEffect(int)>
				tab.select();
		//   11   21:aload_0         
		//   12   22:getfield        #244 <Field TabLayout$Tab tab>
		//   13   25:invokevirtual   #429 <Method void TabLayout$Tab.select()>
				return true;
		//   14   28:iconst_1        
		//   15   29:ireturn         
			} else
			{
				return flag;
		//   16   30:iload_1         
		//   17   31:ireturn         
			}
		}

		void reset()
		{
			setTab(((Tab) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokevirtual   #434 <Method void setTab(TabLayout$Tab)>
			setSelected(false);
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #437 <Method void setSelected(boolean)>
		//    6   10:return          
		}

		public void setSelected(boolean flag)
		{
			boolean flag1;
			if(isSelected() != flag)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #440 <Method boolean isSelected()>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          13
				flag1 = true;
		//    4    8:iconst_1        
		//    5    9:istore_2        
			else
		//*   6   10:goto            15
				flag1 = false;
		//    7   13:iconst_0        
		//    8   14:istore_2        
			super.setSelected(flag);
		//    9   15:aload_0         
		//   10   16:iload_1         
		//   11   17:invokespecial   #441 <Method void LinearLayout.setSelected(boolean)>
			if(flag1 && flag && android.os.Build.VERSION.SDK_INT < 16)
		//*  12   20:iload_2         
		//*  13   21:ifeq            41
		//*  14   24:iload_1         
		//*  15   25:ifeq            41
		//*  16   28:getstatic       #210 <Field int android.os.Build$VERSION.SDK_INT>
		//*  17   31:bipush          16
		//*  18   33:icmpge          41
				sendAccessibilityEvent(4);
		//   19   36:aload_0         
		//   20   37:iconst_4        
		//   21   38:invokevirtual   #444 <Method void sendAccessibilityEvent(int)>
			Object obj = ((Object) (textView));
		//   22   41:aload_0         
		//   23   42:getfield        #143 <Field TextView textView>
		//   24   45:astore_3        
			if(obj != null)
		//*  25   46:aload_3         
		//*  26   47:ifnull          55
				((TextView) (obj)).setSelected(flag);
		//   27   50:aload_3         
		//   28   51:iload_1         
		//   29   52:invokevirtual   #445 <Method void TextView.setSelected(boolean)>
			obj = ((Object) (iconView));
		//   30   55:aload_0         
		//   31   56:getfield        #145 <Field ImageView iconView>
		//   32   59:astore_3        
			if(obj != null)
		//*  33   60:aload_3         
		//*  34   61:ifnull          69
				((ImageView) (obj)).setSelected(flag);
		//   35   64:aload_3         
		//   36   65:iload_1         
		//   37   66:invokevirtual   #446 <Method void ImageView.setSelected(boolean)>
			obj = ((Object) (customView));
		//   38   69:aload_0         
		//   39   70:getfield        #147 <Field View customView>
		//   40   73:astore_3        
			if(obj != null)
		//*  41   74:aload_3         
		//*  42   75:ifnull          83
				((View) (obj)).setSelected(flag);
		//   43   78:aload_3         
		//   44   79:iload_1         
		//   45   80:invokevirtual   #447 <Method void View.setSelected(boolean)>
		//   46   83:return          
		}

		void setTab(Tab tab1)
		{
			if(tab1 != tab)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #244 <Field TabLayout$Tab tab>
		//*   3    5:if_acmpeq       17
			{
				tab = tab1;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #244 <Field TabLayout$Tab tab>
				update();
		//    7   13:aload_0         
		//    8   14:invokevirtual   #450 <Method void update()>
			}
		//    9   17:return          
		}

		final void update()
		{
			Tab tab1 = tab;
		//    0    0:aload_0         
		//    1    1:getfield        #244 <Field TabLayout$Tab tab>
		//    2    4:astore          5
			Object obj = null;
		//    3    6:aconst_null     
		//    4    7:astore          4
			View view;
			if(tab1 != null)
		//*   5    9:aload           5
		//*   6   11:ifnull          23
				view = tab1.getCustomView();
		//    7   14:aload           5
		//    8   16:invokevirtual   #454 <Method View TabLayout$Tab.getCustomView()>
		//    9   19:astore_3        
			else
		//*  10   20:goto            25
				view = null;
		//   11   23:aconst_null     
		//   12   24:astore_3        
			if(view != null)
		//*  13   25:aload_3         
		//*  14   26:ifnull          160
			{
				Object obj1 = ((Object) (view.getParent()));
		//   15   29:aload_3         
		//   16   30:invokevirtual   #458 <Method android.view.ViewParent View.getParent()>
		//   17   33:astore          6
				if(obj1 != this)
		//*  18   35:aload           6
		//*  19   37:aload_0         
		//*  20   38:if_acmpeq       60
				{
					if(obj1 != null)
		//*  21   41:aload           6
		//*  22   43:ifnull          55
						((ViewGroup)obj1).removeView(view);
		//   23   46:aload           6
		//   24   48:checkcast       #460 <Class ViewGroup>
		//   25   51:aload_3         
		//   26   52:invokevirtual   #464 <Method void ViewGroup.removeView(View)>
					addView(view);
		//   27   55:aload_0         
		//   28   56:aload_3         
		//   29   57:invokevirtual   #467 <Method void addView(View)>
				}
				customView = view;
		//   30   60:aload_0         
		//   31   61:aload_3         
		//   32   62:putfield        #147 <Field View customView>
				obj1 = ((Object) (textView));
		//   33   65:aload_0         
		//   34   66:getfield        #143 <Field TextView textView>
		//   35   69:astore          6
				if(obj1 != null)
		//*  36   71:aload           6
		//*  37   73:ifnull          83
					((TextView) (obj1)).setVisibility(8);
		//   38   76:aload           6
		//   39   78:bipush          8
		//   40   80:invokevirtual   #280 <Method void TextView.setVisibility(int)>
				obj1 = ((Object) (iconView));
		//   41   83:aload_0         
		//   42   84:getfield        #145 <Field ImageView iconView>
		//   43   87:astore          6
				if(obj1 != null)
		//*  44   89:aload           6
		//*  45   91:ifnull          109
				{
					((ImageView) (obj1)).setVisibility(8);
		//   46   94:aload           6
		//   47   96:bipush          8
		//   48   98:invokevirtual   #266 <Method void ImageView.setVisibility(int)>
					iconView.setImageDrawable(((Drawable) (null)));
		//   49  101:aload_0         
		//   50  102:getfield        #145 <Field ImageView iconView>
		//   51  105:aconst_null     
		//   52  106:invokevirtual   #263 <Method void ImageView.setImageDrawable(Drawable)>
				}
				customTextView = (TextView)view.findViewById(0x1020014);
		//   53  109:aload_0         
		//   54  110:aload_3         
		//   55  111:ldc2            #468 <Int 0x1020014>
		//   56  114:invokevirtual   #472 <Method View View.findViewById(int)>
		//   57  117:checkcast       #275 <Class TextView>
		//   58  120:putfield        #474 <Field TextView customTextView>
				obj1 = ((Object) (customTextView));
		//   59  123:aload_0         
		//   60  124:getfield        #474 <Field TextView customTextView>
		//   61  127:astore          6
				if(obj1 != null)
		//*  62  129:aload           6
		//*  63  131:ifnull          143
					defaultMaxLines = TextViewCompat.getMaxLines(((TextView) (obj1)));
		//   64  134:aload_0         
		//   65  135:aload           6
		//   66  137:invokestatic    #395 <Method int TextViewCompat.getMaxLines(TextView)>
		//   67  140:putfield        #33  <Field int defaultMaxLines>
				customIconView = (ImageView)view.findViewById(0x1020006);
		//   68  143:aload_0         
		//   69  144:aload_3         
		//   70  145:ldc2            #475 <Int 0x1020006>
		//   71  148:invokevirtual   #472 <Method View View.findViewById(int)>
		//   72  151:checkcast       #259 <Class ImageView>
		//   73  154:putfield        #477 <Field ImageView customIconView>
			} else
		//*  74  157:goto            189
			{
				view = customView;
		//   75  160:aload_0         
		//   76  161:getfield        #147 <Field View customView>
		//   77  164:astore_3        
				if(view != null)
		//*  78  165:aload_3         
		//*  79  166:ifnull          179
				{
					removeView(view);
		//   80  169:aload_0         
		//   81  170:aload_3         
		//   82  171:invokevirtual   #478 <Method void removeView(View)>
					customView = null;
		//   83  174:aload_0         
		//   84  175:aconst_null     
		//   85  176:putfield        #147 <Field View customView>
				}
				customTextView = null;
		//   86  179:aload_0         
		//   87  180:aconst_null     
		//   88  181:putfield        #474 <Field TextView customTextView>
				customIconView = null;
		//   89  184:aload_0         
		//   90  185:aconst_null     
		//   91  186:putfield        #477 <Field ImageView customIconView>
			}
			view = customView;
		//   92  189:aload_0         
		//   93  190:getfield        #147 <Field View customView>
		//   94  193:astore_3        
			boolean flag1 = false;
		//   95  194:iconst_0        
		//   96  195:istore_2        
			if(view == null)
		//*  97  196:aload_3         
		//*  98  197:ifnonnull       404
			{
				if(iconView == null)
		//*  99  200:aload_0         
		//* 100  201:getfield        #145 <Field ImageView iconView>
		//* 101  204:ifnonnull       237
				{
					ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_icon, ((ViewGroup) (this)), false);
		//  102  207:aload_0         
		//  103  208:invokevirtual   #73  <Method Context getContext()>
		//  104  211:invokestatic    #484 <Method LayoutInflater LayoutInflater.from(Context)>
		//  105  214:getstatic       #489 <Field int android.support.design.R$layout.design_layout_tab_icon>
		//  106  217:aload_0         
		//  107  218:iconst_0        
		//  108  219:invokevirtual   #493 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//  109  222:checkcast       #259 <Class ImageView>
		//  110  225:astore_3        
					addView(((View) (imageview)), 0);
		//  111  226:aload_0         
		//  112  227:aload_3         
		//  113  228:iconst_0        
		//  114  229:invokevirtual   #496 <Method void addView(View, int)>
					iconView = imageview;
		//  115  232:aload_0         
		//  116  233:aload_3         
		//  117  234:putfield        #145 <Field ImageView iconView>
				}
				Drawable drawable = ((Drawable) (obj));
		//  118  237:aload           4
		//  119  239:astore_3        
				if(tab1 != null)
		//* 120  240:aload           5
		//* 121  242:ifnull          268
				{
					drawable = ((Drawable) (obj));
		//  122  245:aload           4
		//  123  247:astore_3        
					if(tab1.getIcon() != null)
		//* 124  248:aload           5
		//* 125  250:invokevirtual   #250 <Method Drawable TabLayout$Tab.getIcon()>
		//* 126  253:ifnull          268
						drawable = DrawableCompat.wrap(tab1.getIcon()).mutate();
		//  127  256:aload           5
		//  128  258:invokevirtual   #250 <Method Drawable TabLayout$Tab.getIcon()>
		//  129  261:invokestatic    #224 <Method Drawable DrawableCompat.wrap(Drawable)>
		//  130  264:invokevirtual   #253 <Method Drawable Drawable.mutate()>
		//  131  267:astore_3        
				}
				if(drawable != null)
		//* 132  268:aload_3         
		//* 133  269:ifnull          304
				{
					DrawableCompat.setTintList(drawable, tabIconTint);
		//  134  272:aload_3         
		//  135  273:aload_0         
		//  136  274:getfield        #28  <Field TabLayout this$0>
		//  137  277:getfield        #499 <Field ColorStateList TabLayout.tabIconTint>
		//  138  280:invokestatic    #228 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
					if(tabIconTintMode != null)
		//* 139  283:aload_0         
		//* 140  284:getfield        #28  <Field TabLayout this$0>
		//* 141  287:getfield        #503 <Field android.graphics.PorterDuff$Mode TabLayout.tabIconTintMode>
		//* 142  290:ifnull          304
						DrawableCompat.setTintMode(drawable, tabIconTintMode);
		//  143  293:aload_3         
		//  144  294:aload_0         
		//  145  295:getfield        #28  <Field TabLayout this$0>
		//  146  298:getfield        #503 <Field android.graphics.PorterDuff$Mode TabLayout.tabIconTintMode>
		//  147  301:invokestatic    #507 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
				}
				if(textView == null)
		//* 148  304:aload_0         
		//* 149  305:getfield        #143 <Field TextView textView>
		//* 150  308:ifnonnull       351
				{
					TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_text, ((ViewGroup) (this)), false);
		//  151  311:aload_0         
		//  152  312:invokevirtual   #73  <Method Context getContext()>
		//  153  315:invokestatic    #484 <Method LayoutInflater LayoutInflater.from(Context)>
		//  154  318:getstatic       #510 <Field int android.support.design.R$layout.design_layout_tab_text>
		//  155  321:aload_0         
		//  156  322:iconst_0        
		//  157  323:invokevirtual   #493 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//  158  326:checkcast       #275 <Class TextView>
		//  159  329:astore_3        
					addView(((View) (textview)));
		//  160  330:aload_0         
		//  161  331:aload_3         
		//  162  332:invokevirtual   #467 <Method void addView(View)>
					textView = textview;
		//  163  335:aload_0         
		//  164  336:aload_3         
		//  165  337:putfield        #143 <Field TextView textView>
					defaultMaxLines = TextViewCompat.getMaxLines(textView);
		//  166  340:aload_0         
		//  167  341:aload_0         
		//  168  342:getfield        #143 <Field TextView textView>
		//  169  345:invokestatic    #395 <Method int TextViewCompat.getMaxLines(TextView)>
		//  170  348:putfield        #33  <Field int defaultMaxLines>
				}
				TextViewCompat.setTextAppearance(textView, tabTextAppearance);
		//  171  351:aload_0         
		//  172  352:getfield        #143 <Field TextView textView>
		//  173  355:aload_0         
		//  174  356:getfield        #28  <Field TabLayout this$0>
		//  175  359:getfield        #513 <Field int TabLayout.tabTextAppearance>
		//  176  362:invokestatic    #517 <Method void TextViewCompat.setTextAppearance(TextView, int)>
				if(tabTextColors != null)
		//* 177  365:aload_0         
		//* 178  366:getfield        #28  <Field TabLayout this$0>
		//* 179  369:getfield        #520 <Field ColorStateList TabLayout.tabTextColors>
		//* 180  372:ifnull          389
					textView.setTextColor(tabTextColors);
		//  181  375:aload_0         
		//  182  376:getfield        #143 <Field TextView textView>
		//  183  379:aload_0         
		//  184  380:getfield        #28  <Field TabLayout this$0>
		//  185  383:getfield        #520 <Field ColorStateList TabLayout.tabTextColors>
		//  186  386:invokevirtual   #524 <Method void TextView.setTextColor(ColorStateList)>
				updateTextAndIcon(textView, iconView);
		//  187  389:aload_0         
		//  188  390:aload_0         
		//  189  391:getfield        #143 <Field TextView textView>
		//  190  394:aload_0         
		//  191  395:getfield        #145 <Field ImageView iconView>
		//  192  398:invokespecial   #526 <Method void updateTextAndIcon(TextView, ImageView)>
			} else
		//* 193  401:goto            430
			if(customTextView != null || customIconView != null)
		//* 194  404:aload_0         
		//* 195  405:getfield        #474 <Field TextView customTextView>
		//* 196  408:ifnonnull       418
		//* 197  411:aload_0         
		//* 198  412:getfield        #477 <Field ImageView customIconView>
		//* 199  415:ifnull          430
				updateTextAndIcon(customTextView, customIconView);
		//  200  418:aload_0         
		//  201  419:aload_0         
		//  202  420:getfield        #474 <Field TextView customTextView>
		//  203  423:aload_0         
		//  204  424:getfield        #477 <Field ImageView customIconView>
		//  205  427:invokespecial   #526 <Method void updateTextAndIcon(TextView, ImageView)>
			if(tab1 != null && !TextUtils.isEmpty(tab1.contentDesc))
		//* 206  430:aload           5
		//* 207  432:ifnull          455
		//* 208  435:aload           5
		//* 209  437:invokestatic    #315 <Method CharSequence TabLayout$Tab.access$100(TabLayout$Tab)>
		//* 210  440:invokestatic    #273 <Method boolean TextUtils.isEmpty(CharSequence)>
		//* 211  443:ifne            455
				setContentDescription(tab1.contentDesc);
		//  212  446:aload_0         
		//  213  447:aload           5
		//  214  449:invokestatic    #315 <Method CharSequence TabLayout$Tab.access$100(TabLayout$Tab)>
		//  215  452:invokevirtual   #529 <Method void setContentDescription(CharSequence)>
			boolean flag = flag1;
		//  216  455:iload_2         
		//  217  456:istore_1        
			if(tab1 != null)
		//* 218  457:aload           5
		//* 219  459:ifnull          474
			{
				flag = flag1;
		//  220  462:iload_2         
		//  221  463:istore_1        
				if(tab1.isSelected())
		//* 222  464:aload           5
		//* 223  466:invokevirtual   #530 <Method boolean TabLayout$Tab.isSelected()>
		//* 224  469:ifeq            474
					flag = true;
		//  225  472:iconst_1        
		//  226  473:istore_1        
			}
			setSelected(flag);
		//  227  474:aload_0         
		//  228  475:iload_1         
		//  229  476:invokevirtual   #437 <Method void setSelected(boolean)>
		//  230  479:return          
		}

		final void updateOrientation()
		{
			setOrientation(((int) (inlineLabel ^ true)));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #28  <Field TabLayout this$0>
		//    3    5:getfield        #62  <Field boolean TabLayout.inlineLabel>
		//    4    8:iconst_1        
		//    5    9:ixor            
		//    6   10:invokevirtual   #65  <Method void setOrientation(int)>
			if(customTextView == null && customIconView == null)
		//*   7   13:aload_0         
		//*   8   14:getfield        #474 <Field TextView customTextView>
		//*   9   17:ifnonnull       43
		//*  10   20:aload_0         
		//*  11   21:getfield        #477 <Field ImageView customIconView>
		//*  12   24:ifnull          30
		//*  13   27:goto            43
			{
				updateTextAndIcon(textView, iconView);
		//   14   30:aload_0         
		//   15   31:aload_0         
		//   16   32:getfield        #143 <Field TextView textView>
		//   17   35:aload_0         
		//   18   36:getfield        #145 <Field ImageView iconView>
		//   19   39:invokespecial   #526 <Method void updateTextAndIcon(TextView, ImageView)>
				return;
		//   20   42:return          
			} else
			{
				updateTextAndIcon(customTextView, customIconView);
		//   21   43:aload_0         
		//   22   44:aload_0         
		//   23   45:getfield        #474 <Field TextView customTextView>
		//   24   48:aload_0         
		//   25   49:getfield        #477 <Field ImageView customIconView>
		//   26   52:invokespecial   #526 <Method void updateTextAndIcon(TextView, ImageView)>
				return;
		//   27   55:return          
			}
		}

		private Drawable baseBackgroundDrawable;
		private ImageView customIconView;
		private TextView customTextView;
		private View customView;
		private int defaultMaxLines;
		private ImageView iconView;
		private Tab tab;
		private TextView textView;
		final TabLayout this$0;


/*
		static void access$000(TabView tabview, Context context)
		{
			tabview.updateBackgroundDrawable(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void updateBackgroundDrawable(Context)>
			return;
		//    3    5:return          
		}

*/


/*
		static void access$300(TabView tabview, Canvas canvas)
		{
			tabview.drawBackground(canvas);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #92  <Method void drawBackground(Canvas)>
			return;
		//    3    5:return          
		}

*/


/*
		static int access$500(TabView tabview)
		{
			return tabview.getContentWidth();
		//    0    0:aload_0         
		//    1    1:invokespecial   #98  <Method int getContentWidth()>
		//    2    4:ireturn         
		}

*/

		public TabView(Context context)
		{
			this$0 = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field TabLayout this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #31  <Method void LinearLayout(Context)>
			defaultMaxLines = 2;
		//    6   10:aload_0         
		//    7   11:iconst_2        
		//    8   12:putfield        #33  <Field int defaultMaxLines>
			updateBackgroundDrawable(context);
		//    9   15:aload_0         
		//   10   16:aload_2         
		//   11   17:invokespecial   #36  <Method void updateBackgroundDrawable(Context)>
			ViewCompat.setPaddingRelative(((View) (this)), tabPaddingStart, tabPaddingTop, tabPaddingEnd, tabPaddingBottom);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:getfield        #39  <Field int TabLayout.tabPaddingStart>
		//   15   25:aload_1         
		//   16   26:getfield        #42  <Field int TabLayout.tabPaddingTop>
		//   17   29:aload_1         
		//   18   30:getfield        #45  <Field int TabLayout.tabPaddingEnd>
		//   19   33:aload_1         
		//   20   34:getfield        #48  <Field int TabLayout.tabPaddingBottom>
		//   21   37:invokestatic    #54  <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
			setGravity(17);
		//   22   40:aload_0         
		//   23   41:bipush          17
		//   24   43:invokevirtual   #58  <Method void setGravity(int)>
			setOrientation(((int) (inlineLabel ^ true)));
		//   25   46:aload_0         
		//   26   47:aload_1         
		//   27   48:getfield        #62  <Field boolean TabLayout.inlineLabel>
		//   28   51:iconst_1        
		//   29   52:ixor            
		//   30   53:invokevirtual   #65  <Method void setOrientation(int)>
			setClickable(true);
		//   31   56:aload_0         
		//   32   57:iconst_1        
		//   33   58:invokevirtual   #69  <Method void setClickable(boolean)>
			ViewCompat.setPointerIcon(((View) (this)), PointerIconCompat.getSystemIcon(getContext(), 1002));
		//   34   61:aload_0         
		//   35   62:aload_0         
		//   36   63:invokevirtual   #73  <Method Context getContext()>
		//   37   66:sipush          1002
		//   38   69:invokestatic    #79  <Method PointerIconCompat PointerIconCompat.getSystemIcon(Context, int)>
		//   39   72:invokestatic    #83  <Method void ViewCompat.setPointerIcon(View, PointerIconCompat)>
		//   40   75:return          
		}
	}

	public static class ViewPagerOnTabSelectedListener
		implements OnTabSelectedListener
	{

		public void onTabReselected(Tab tab)
		{
		//    0    0:return          
		}

		public void onTabSelected(Tab tab)
		{
			viewPager.setCurrentItem(tab.getPosition());
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ViewPager viewPager>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method int TabLayout$Tab.getPosition()>
		//    4    8:invokevirtual   #34  <Method void ViewPager.setCurrentItem(int)>
		//    5   11:return          
		}

		public void onTabUnselected(Tab tab)
		{
		//    0    0:return          
		}

		private final ViewPager viewPager;

		public ViewPagerOnTabSelectedListener(ViewPager viewpager)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			viewPager = viewpager;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ViewPager viewPager>
		//    5    9:return          
		}
	}


	public TabLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #156 <Method void TabLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TabLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.design.R.attr.tabStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #161 <Field int android.support.design.R$attr.tabStyle>
	//    4    6:invokespecial   #164 <Method void TabLayout(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public TabLayout(Context context, AttributeSet attributeset, int i)
	{
		TypedArray typedarray;
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #165 <Method void HorizontalScrollView(Context, AttributeSet, int)>
		tabs = new ArrayList();
	//    5    7:aload_0         
	//    6    8:new             #167 <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #169 <Method void ArrayList()>
	//    9   15:putfield        #171 <Field ArrayList tabs>
		tabViewContentBounds = new RectF();
	//   10   18:aload_0         
	//   11   19:new             #173 <Class RectF>
	//   12   22:dup             
	//   13   23:invokespecial   #174 <Method void RectF()>
	//   14   26:putfield        #176 <Field RectF tabViewContentBounds>
		tabMaxWidth = 0x7fffffff;
	//   15   29:aload_0         
	//   16   30:ldc1            #177 <Int 0x7fffffff>
	//   17   32:putfield        #179 <Field int tabMaxWidth>
		selectedListeners = new ArrayList();
	//   18   35:aload_0         
	//   19   36:new             #167 <Class ArrayList>
	//   20   39:dup             
	//   21   40:invokespecial   #169 <Method void ArrayList()>
	//   22   43:putfield        #181 <Field ArrayList selectedListeners>
		tabViewPool = ((android.support.v4.util.Pools.Pool) (new android.support.v4.util.Pools.SimplePool(12)));
	//   23   46:aload_0         
	//   24   47:new             #183 <Class android.support.v4.util.Pools$SimplePool>
	//   25   50:dup             
	//   26   51:bipush          12
	//   27   53:invokespecial   #184 <Method void android.support.v4.util.Pools$SimplePool(int)>
	//   28   56:putfield        #186 <Field android.support.v4.util.Pools$Pool tabViewPool>
		setHorizontalScrollBarEnabled(false);
	//   29   59:aload_0         
	//   30   60:iconst_0        
	//   31   61:invokevirtual   #190 <Method void setHorizontalScrollBarEnabled(boolean)>
		slidingTabIndicator = new SlidingTabIndicator(context);
	//   32   64:aload_0         
	//   33   65:new             #23  <Class TabLayout$SlidingTabIndicator>
	//   34   68:dup             
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:invokespecial   #193 <Method void TabLayout$SlidingTabIndicator(TabLayout, Context)>
	//   38   74:putfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
		super.addView(((View) (slidingTabIndicator)), 0, ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -1))));
	//   39   77:aload_0         
	//   40   78:aload_0         
	//   41   79:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   42   82:iconst_0        
	//   43   83:new             #197 <Class android.widget.FrameLayout$LayoutParams>
	//   44   86:dup             
	//   45   87:bipush          -2
	//   46   89:iconst_m1       
	//   47   90:invokespecial   #200 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   48   93:invokespecial   #204 <Method void HorizontalScrollView.addView(View, int, android.view.ViewGroup$LayoutParams)>
		typedarray = ThemeEnforcement.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.TabLayout, i, android.support.design.R.style.Widget_Design_TabLayout, new int[] {
			android.support.design.R.styleable.TabLayout_tabTextAppearance
		});
	//   49   96:aload_1         
	//   50   97:aload_2         
	//   51   98:getstatic       #210 <Field int[] android.support.design.R$styleable.TabLayout>
	//   52  101:iload_3         
	//   53  102:getstatic       #215 <Field int android.support.design.R$style.Widget_Design_TabLayout>
	//   54  105:iconst_1        
	//   55  106:newarray        int[]
	//   56  108:dup             
	//   57  109:iconst_0        
	//   58  110:getstatic       #218 <Field int android.support.design.R$styleable.TabLayout_tabTextAppearance>
	//   59  113:iastore         
	//   60  114:invokestatic    #224 <Method TypedArray ThemeEnforcement.obtainStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   61  117:astore          4
		slidingTabIndicator.setSelectedIndicatorHeight(typedarray.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabIndicatorHeight, -1));
	//   62  119:aload_0         
	//   63  120:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   64  123:aload           4
	//   65  125:getstatic       #227 <Field int android.support.design.R$styleable.TabLayout_tabIndicatorHeight>
	//   66  128:iconst_m1       
	//   67  129:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   68  132:invokevirtual   #236 <Method void TabLayout$SlidingTabIndicator.setSelectedIndicatorHeight(int)>
		slidingTabIndicator.setSelectedIndicatorColor(typedarray.getColor(android.support.design.R.styleable.TabLayout_tabIndicatorColor, 0));
	//   69  135:aload_0         
	//   70  136:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   71  139:aload           4
	//   72  141:getstatic       #239 <Field int android.support.design.R$styleable.TabLayout_tabIndicatorColor>
	//   73  144:iconst_0        
	//   74  145:invokevirtual   #242 <Method int TypedArray.getColor(int, int)>
	//   75  148:invokevirtual   #245 <Method void TabLayout$SlidingTabIndicator.setSelectedIndicatorColor(int)>
		setSelectedTabIndicator(MaterialResources.getDrawable(context, typedarray, android.support.design.R.styleable.TabLayout_tabIndicator));
	//   76  151:aload_0         
	//   77  152:aload_1         
	//   78  153:aload           4
	//   79  155:getstatic       #248 <Field int android.support.design.R$styleable.TabLayout_tabIndicator>
	//   80  158:invokestatic    #254 <Method Drawable MaterialResources.getDrawable(Context, TypedArray, int)>
	//   81  161:invokevirtual   #258 <Method void setSelectedTabIndicator(Drawable)>
		setSelectedTabIndicatorGravity(typedarray.getInt(android.support.design.R.styleable.TabLayout_tabIndicatorGravity, 0));
	//   82  164:aload_0         
	//   83  165:aload           4
	//   84  167:getstatic       #261 <Field int android.support.design.R$styleable.TabLayout_tabIndicatorGravity>
	//   85  170:iconst_0        
	//   86  171:invokevirtual   #264 <Method int TypedArray.getInt(int, int)>
	//   87  174:invokevirtual   #267 <Method void setSelectedTabIndicatorGravity(int)>
		setTabIndicatorFullWidth(typedarray.getBoolean(android.support.design.R.styleable.TabLayout_tabIndicatorFullWidth, true));
	//   88  177:aload_0         
	//   89  178:aload           4
	//   90  180:getstatic       #270 <Field int android.support.design.R$styleable.TabLayout_tabIndicatorFullWidth>
	//   91  183:iconst_1        
	//   92  184:invokevirtual   #274 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   93  187:invokevirtual   #277 <Method void setTabIndicatorFullWidth(boolean)>
		i = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPadding, 0);
	//   94  190:aload           4
	//   95  192:getstatic       #280 <Field int android.support.design.R$styleable.TabLayout_tabPadding>
	//   96  195:iconst_0        
	//   97  196:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   98  199:istore_3        
		tabPaddingBottom = i;
	//   99  200:aload_0         
	//  100  201:iload_3         
	//  101  202:putfield        #282 <Field int tabPaddingBottom>
		tabPaddingEnd = i;
	//  102  205:aload_0         
	//  103  206:iload_3         
	//  104  207:putfield        #284 <Field int tabPaddingEnd>
		tabPaddingTop = i;
	//  105  210:aload_0         
	//  106  211:iload_3         
	//  107  212:putfield        #286 <Field int tabPaddingTop>
		tabPaddingStart = i;
	//  108  215:aload_0         
	//  109  216:iload_3         
	//  110  217:putfield        #288 <Field int tabPaddingStart>
		tabPaddingStart = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingStart, tabPaddingStart);
	//  111  220:aload_0         
	//  112  221:aload           4
	//  113  223:getstatic       #291 <Field int android.support.design.R$styleable.TabLayout_tabPaddingStart>
	//  114  226:aload_0         
	//  115  227:getfield        #288 <Field int tabPaddingStart>
	//  116  230:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  117  233:putfield        #288 <Field int tabPaddingStart>
		tabPaddingTop = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingTop, tabPaddingTop);
	//  118  236:aload_0         
	//  119  237:aload           4
	//  120  239:getstatic       #294 <Field int android.support.design.R$styleable.TabLayout_tabPaddingTop>
	//  121  242:aload_0         
	//  122  243:getfield        #286 <Field int tabPaddingTop>
	//  123  246:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  124  249:putfield        #286 <Field int tabPaddingTop>
		tabPaddingEnd = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingEnd, tabPaddingEnd);
	//  125  252:aload_0         
	//  126  253:aload           4
	//  127  255:getstatic       #297 <Field int android.support.design.R$styleable.TabLayout_tabPaddingEnd>
	//  128  258:aload_0         
	//  129  259:getfield        #284 <Field int tabPaddingEnd>
	//  130  262:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  131  265:putfield        #284 <Field int tabPaddingEnd>
		tabPaddingBottom = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingBottom, tabPaddingBottom);
	//  132  268:aload_0         
	//  133  269:aload           4
	//  134  271:getstatic       #300 <Field int android.support.design.R$styleable.TabLayout_tabPaddingBottom>
	//  135  274:aload_0         
	//  136  275:getfield        #282 <Field int tabPaddingBottom>
	//  137  278:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  138  281:putfield        #282 <Field int tabPaddingBottom>
		tabTextAppearance = typedarray.getResourceId(android.support.design.R.styleable.TabLayout_tabTextAppearance, android.support.design.R.style.TextAppearance_Design_Tab);
	//  139  284:aload_0         
	//  140  285:aload           4
	//  141  287:getstatic       #218 <Field int android.support.design.R$styleable.TabLayout_tabTextAppearance>
	//  142  290:getstatic       #303 <Field int android.support.design.R$style.TextAppearance_Design_Tab>
	//  143  293:invokevirtual   #306 <Method int TypedArray.getResourceId(int, int)>
	//  144  296:putfield        #308 <Field int tabTextAppearance>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(tabTextAppearance, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//  145  299:aload_1         
	//  146  300:aload_0         
	//  147  301:getfield        #308 <Field int tabTextAppearance>
	//  148  304:getstatic       #313 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  149  307:invokevirtual   #318 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//  150  310:astore_2        
		tabTextSize = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
	//  151  311:aload_0         
	//  152  312:aload_2         
	//  153  313:getstatic       #321 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//  154  316:iconst_0        
	//  155  317:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  156  320:i2f             
	//  157  321:putfield        #323 <Field float tabTextSize>
		tabTextColors = MaterialResources.getColorStateList(context, ((TypedArray) (attributeset)), android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//  158  324:aload_0         
	//  159  325:aload_1         
	//  160  326:aload_2         
	//  161  327:getstatic       #326 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  162  330:invokestatic    #330 <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//  163  333:putfield        #332 <Field ColorStateList tabTextColors>
		((TypedArray) (attributeset)).recycle();
	//  164  336:aload_2         
	//  165  337:invokevirtual   #335 <Method void TypedArray.recycle()>
		if(typedarray.hasValue(android.support.design.R.styleable.TabLayout_tabTextColor))
	//* 166  340:aload           4
	//* 167  342:getstatic       #338 <Field int android.support.design.R$styleable.TabLayout_tabTextColor>
	//* 168  345:invokevirtual   #342 <Method boolean TypedArray.hasValue(int)>
	//* 169  348:ifeq            364
			tabTextColors = MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.TabLayout_tabTextColor);
	//  170  351:aload_0         
	//  171  352:aload_1         
	//  172  353:aload           4
	//  173  355:getstatic       #338 <Field int android.support.design.R$styleable.TabLayout_tabTextColor>
	//  174  358:invokestatic    #330 <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//  175  361:putfield        #332 <Field ColorStateList tabTextColors>
		if(typedarray.hasValue(android.support.design.R.styleable.TabLayout_tabSelectedTextColor))
	//* 176  364:aload           4
	//* 177  366:getstatic       #345 <Field int android.support.design.R$styleable.TabLayout_tabSelectedTextColor>
	//* 178  369:invokevirtual   #342 <Method boolean TypedArray.hasValue(int)>
	//* 179  372:ifeq            400
		{
			i = typedarray.getColor(android.support.design.R.styleable.TabLayout_tabSelectedTextColor, 0);
	//  180  375:aload           4
	//  181  377:getstatic       #345 <Field int android.support.design.R$styleable.TabLayout_tabSelectedTextColor>
	//  182  380:iconst_0        
	//  183  381:invokevirtual   #242 <Method int TypedArray.getColor(int, int)>
	//  184  384:istore_3        
			tabTextColors = createColorStateList(tabTextColors.getDefaultColor(), i);
	//  185  385:aload_0         
	//  186  386:aload_0         
	//  187  387:getfield        #332 <Field ColorStateList tabTextColors>
	//  188  390:invokevirtual   #351 <Method int ColorStateList.getDefaultColor()>
	//  189  393:iload_3         
	//  190  394:invokestatic    #355 <Method ColorStateList createColorStateList(int, int)>
	//  191  397:putfield        #332 <Field ColorStateList tabTextColors>
		}
		tabIconTint = MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.TabLayout_tabIconTint);
	//  192  400:aload_0         
	//  193  401:aload_1         
	//  194  402:aload           4
	//  195  404:getstatic       #358 <Field int android.support.design.R$styleable.TabLayout_tabIconTint>
	//  196  407:invokestatic    #330 <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//  197  410:putfield        #360 <Field ColorStateList tabIconTint>
		tabIconTintMode = ViewUtils.parseTintMode(typedarray.getInt(android.support.design.R.styleable.TabLayout_tabIconTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//  198  413:aload_0         
	//  199  414:aload           4
	//  200  416:getstatic       #363 <Field int android.support.design.R$styleable.TabLayout_tabIconTintMode>
	//  201  419:iconst_m1       
	//  202  420:invokevirtual   #264 <Method int TypedArray.getInt(int, int)>
	//  203  423:aconst_null     
	//  204  424:invokestatic    #369 <Method android.graphics.PorterDuff$Mode ViewUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  205  427:putfield        #371 <Field android.graphics.PorterDuff$Mode tabIconTintMode>
		tabRippleColorStateList = MaterialResources.getColorStateList(context, typedarray, android.support.design.R.styleable.TabLayout_tabRippleColor);
	//  206  430:aload_0         
	//  207  431:aload_1         
	//  208  432:aload           4
	//  209  434:getstatic       #374 <Field int android.support.design.R$styleable.TabLayout_tabRippleColor>
	//  210  437:invokestatic    #330 <Method ColorStateList MaterialResources.getColorStateList(Context, TypedArray, int)>
	//  211  440:putfield        #376 <Field ColorStateList tabRippleColorStateList>
		tabIndicatorAnimationDuration = typedarray.getInt(android.support.design.R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
	//  212  443:aload_0         
	//  213  444:aload           4
	//  214  446:getstatic       #379 <Field int android.support.design.R$styleable.TabLayout_tabIndicatorAnimationDuration>
	//  215  449:sipush          300
	//  216  452:invokevirtual   #264 <Method int TypedArray.getInt(int, int)>
	//  217  455:putfield        #381 <Field int tabIndicatorAnimationDuration>
		requestedTabMinWidth = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMinWidth, -1);
	//  218  458:aload_0         
	//  219  459:aload           4
	//  220  461:getstatic       #384 <Field int android.support.design.R$styleable.TabLayout_tabMinWidth>
	//  221  464:iconst_m1       
	//  222  465:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  223  468:putfield        #386 <Field int requestedTabMinWidth>
		requestedTabMaxWidth = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMaxWidth, -1);
	//  224  471:aload_0         
	//  225  472:aload           4
	//  226  474:getstatic       #389 <Field int android.support.design.R$styleable.TabLayout_tabMaxWidth>
	//  227  477:iconst_m1       
	//  228  478:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  229  481:putfield        #391 <Field int requestedTabMaxWidth>
		tabBackgroundResId = typedarray.getResourceId(android.support.design.R.styleable.TabLayout_tabBackground, 0);
	//  230  484:aload_0         
	//  231  485:aload           4
	//  232  487:getstatic       #394 <Field int android.support.design.R$styleable.TabLayout_tabBackground>
	//  233  490:iconst_0        
	//  234  491:invokevirtual   #306 <Method int TypedArray.getResourceId(int, int)>
	//  235  494:putfield        #396 <Field int tabBackgroundResId>
		contentInsetStart = typedarray.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabContentStart, 0);
	//  236  497:aload_0         
	//  237  498:aload           4
	//  238  500:getstatic       #399 <Field int android.support.design.R$styleable.TabLayout_tabContentStart>
	//  239  503:iconst_0        
	//  240  504:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  241  507:putfield        #401 <Field int contentInsetStart>
		mode = typedarray.getInt(android.support.design.R.styleable.TabLayout_tabMode, 1);
	//  242  510:aload_0         
	//  243  511:aload           4
	//  244  513:getstatic       #404 <Field int android.support.design.R$styleable.TabLayout_tabMode>
	//  245  516:iconst_1        
	//  246  517:invokevirtual   #264 <Method int TypedArray.getInt(int, int)>
	//  247  520:putfield        #406 <Field int mode>
		tabGravity = typedarray.getInt(android.support.design.R.styleable.TabLayout_tabGravity, 0);
	//  248  523:aload_0         
	//  249  524:aload           4
	//  250  526:getstatic       #409 <Field int android.support.design.R$styleable.TabLayout_tabGravity>
	//  251  529:iconst_0        
	//  252  530:invokevirtual   #264 <Method int TypedArray.getInt(int, int)>
	//  253  533:putfield        #411 <Field int tabGravity>
		inlineLabel = typedarray.getBoolean(android.support.design.R.styleable.TabLayout_tabInlineLabel, false);
	//  254  536:aload_0         
	//  255  537:aload           4
	//  256  539:getstatic       #414 <Field int android.support.design.R$styleable.TabLayout_tabInlineLabel>
	//  257  542:iconst_0        
	//  258  543:invokevirtual   #274 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  259  546:putfield        #416 <Field boolean inlineLabel>
		unboundedRipple = typedarray.getBoolean(android.support.design.R.styleable.TabLayout_tabUnboundedRipple, false);
	//  260  549:aload_0         
	//  261  550:aload           4
	//  262  552:getstatic       #419 <Field int android.support.design.R$styleable.TabLayout_tabUnboundedRipple>
	//  263  555:iconst_0        
	//  264  556:invokevirtual   #274 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  265  559:putfield        #421 <Field boolean unboundedRipple>
		typedarray.recycle();
	//  266  562:aload           4
	//  267  564:invokevirtual   #335 <Method void TypedArray.recycle()>
		context = ((Context) (getResources()));
	//  268  567:aload_0         
	//  269  568:invokevirtual   #425 <Method Resources getResources()>
	//  270  571:astore_1        
		tabTextMultiLineSize = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_tab_text_size_2line);
	//  271  572:aload_0         
	//  272  573:aload_1         
	//  273  574:getstatic       #430 <Field int android.support.design.R$dimen.design_tab_text_size_2line>
	//  274  577:invokevirtual   #435 <Method int Resources.getDimensionPixelSize(int)>
	//  275  580:i2f             
	//  276  581:putfield        #437 <Field float tabTextMultiLineSize>
		scrollableTabMinWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_tab_scrollable_min_width);
	//  277  584:aload_0         
	//  278  585:aload_1         
	//  279  586:getstatic       #440 <Field int android.support.design.R$dimen.design_tab_scrollable_min_width>
	//  280  589:invokevirtual   #435 <Method int Resources.getDimensionPixelSize(int)>
	//  281  592:putfield        #442 <Field int scrollableTabMinWidth>
		applyModeAndGravity();
	//  282  595:aload_0         
	//  283  596:invokespecial   #445 <Method void applyModeAndGravity()>
		return;
	//  284  599:return          
		context;
	//  285  600:astore_1        
		((TypedArray) (attributeset)).recycle();
	//  286  601:aload_2         
	//  287  602:invokevirtual   #335 <Method void TypedArray.recycle()>
		throw context;
	//  288  605:aload_1         
	//  289  606:athrow          
	}

	private void addTabFromItemView(TabItem tabitem)
	{
		Tab tab = newTab();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #454 <Method TabLayout$Tab newTab()>
	//    2    4:astore_2        
		if(tabitem.text != null)
	//*   3    5:aload_1         
	//*   4    6:getfield        #460 <Field CharSequence TabItem.text>
	//*   5    9:ifnull          21
			tab.setText(tabitem.text);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:getfield        #460 <Field CharSequence TabItem.text>
	//    9   17:invokevirtual   #464 <Method TabLayout$Tab TabLayout$Tab.setText(CharSequence)>
	//   10   20:pop             
		if(tabitem.icon != null)
	//*  11   21:aload_1         
	//*  12   22:getfield        #467 <Field Drawable TabItem.icon>
	//*  13   25:ifnull          37
			tab.setIcon(tabitem.icon);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:getfield        #467 <Field Drawable TabItem.icon>
	//   17   33:invokevirtual   #471 <Method TabLayout$Tab TabLayout$Tab.setIcon(Drawable)>
	//   18   36:pop             
		if(tabitem.customLayout != 0)
	//*  19   37:aload_1         
	//*  20   38:getfield        #474 <Field int TabItem.customLayout>
	//*  21   41:ifeq            53
			tab.setCustomView(tabitem.customLayout);
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:getfield        #474 <Field int TabItem.customLayout>
	//   25   49:invokevirtual   #478 <Method TabLayout$Tab TabLayout$Tab.setCustomView(int)>
	//   26   52:pop             
		if(!TextUtils.isEmpty(tabitem.getContentDescription()))
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #482 <Method CharSequence TabItem.getContentDescription()>
	//*  29   57:invokestatic    #488 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   60:ifne            72
			tab.setContentDescription(tabitem.getContentDescription());
	//   31   63:aload_2         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #482 <Method CharSequence TabItem.getContentDescription()>
	//   34   68:invokevirtual   #491 <Method TabLayout$Tab TabLayout$Tab.setContentDescription(CharSequence)>
	//   35   71:pop             
		addTab(tab);
	//   36   72:aload_0         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #495 <Method void addTab(TabLayout$Tab)>
	//   39   77:return          
	}

	private void addTabView(Tab tab)
	{
		TabView tabview = tab.view;
	//    0    0:aload_1         
	//    1    1:getfield        #501 <Field TabLayout$TabView TabLayout$Tab.view>
	//    2    4:astore_2        
		slidingTabIndicator.addView(((View) (tabview)), tab.getPosition(), ((android.view.ViewGroup.LayoutParams) (createLayoutParamsForTabs())));
	//    3    5:aload_0         
	//    4    6:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #504 <Method int TabLayout$Tab.getPosition()>
	//    8   14:aload_0         
	//    9   15:invokespecial   #508 <Method android.widget.LinearLayout$LayoutParams createLayoutParamsForTabs()>
	//   10   18:invokevirtual   #509 <Method void TabLayout$SlidingTabIndicator.addView(View, int, android.view.ViewGroup$LayoutParams)>
	//   11   21:return          
	}

	private void addViewInternal(View view)
	{
		if(view instanceof TabItem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #456 <Class TabItem>
	//*   2    4:ifeq            16
		{
			addTabFromItemView((TabItem)view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #456 <Class TabItem>
	//    6   12:invokespecial   #513 <Method void addTabFromItemView(TabItem)>
			return;
	//    7   15:return          
		} else
		{
			throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
	//    8   16:new             #515 <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc2            #517 <String "Only TabItem instances can be added to TabLayout">
	//   11   23:invokespecial   #520 <Method void IllegalArgumentException(String)>
	//   12   26:athrow          
		}
	}

	private void animateToTab(int i)
	{
		if(i == -1)
	//*   0    0:iload_1         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          6
			return;
	//    3    5:return          
		if(getWindowToken() != null && ViewCompat.isLaidOut(((View) (this))) && !slidingTabIndicator.childrenNeedLayout())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #525 <Method android.os.IBinder getWindowToken()>
	//*   6   10:ifnull          92
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #531 <Method boolean ViewCompat.isLaidOut(View)>
	//*   9   17:ifeq            92
	//*  10   20:aload_0         
	//*  11   21:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//*  12   24:invokevirtual   #535 <Method boolean TabLayout$SlidingTabIndicator.childrenNeedLayout()>
	//*  13   27:ifeq            33
	//*  14   30:goto            92
		{
			int j = getScrollX();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #538 <Method int getScrollX()>
	//   17   37:istore_2        
			int k = calculateScrollXForTab(i, 0.0F);
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:fconst_0        
	//   21   41:invokespecial   #542 <Method int calculateScrollXForTab(int, float)>
	//   22   44:istore_3        
			if(j != k)
	//*  23   45:iload_2         
	//*  24   46:iload_3         
	//*  25   47:icmpeq          79
			{
				ensureScrollAnimator();
	//   26   50:aload_0         
	//   27   51:invokespecial   #545 <Method void ensureScrollAnimator()>
				scrollAnimator.setIntValues(new int[] {
					j, k
				});
	//   28   54:aload_0         
	//   29   55:getfield        #547 <Field ValueAnimator scrollAnimator>
	//   30   58:iconst_2        
	//   31   59:newarray        int[]
	//   32   61:dup             
	//   33   62:iconst_0        
	//   34   63:iload_2         
	//   35   64:iastore         
	//   36   65:dup             
	//   37   66:iconst_1        
	//   38   67:iload_3         
	//   39   68:iastore         
	//   40   69:invokevirtual   #553 <Method void ValueAnimator.setIntValues(int[])>
				scrollAnimator.start();
	//   41   72:aload_0         
	//   42   73:getfield        #547 <Field ValueAnimator scrollAnimator>
	//   43   76:invokevirtual   #556 <Method void ValueAnimator.start()>
			}
			slidingTabIndicator.animateIndicatorToPosition(i, tabIndicatorAnimationDuration);
	//   44   79:aload_0         
	//   45   80:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   46   83:iload_1         
	//   47   84:aload_0         
	//   48   85:getfield        #381 <Field int tabIndicatorAnimationDuration>
	//   49   88:invokevirtual   #559 <Method void TabLayout$SlidingTabIndicator.animateIndicatorToPosition(int, int)>
			return;
	//   50   91:return          
		} else
		{
			setScrollPosition(i, 0.0F, true);
	//   51   92:aload_0         
	//   52   93:iload_1         
	//   53   94:fconst_0        
	//   54   95:iconst_1        
	//   55   96:invokevirtual   #563 <Method void setScrollPosition(int, float, boolean)>
			return;
	//   56   99:return          
		}
	}

	private void applyModeAndGravity()
	{
		int i;
		if(mode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field int mode>
	//*   2    4:ifne            24
			i = Math.max(0, contentInsetStart - tabPaddingStart);
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #401 <Field int contentInsetStart>
	//    6   12:aload_0         
	//    7   13:getfield        #288 <Field int tabPaddingStart>
	//    8   16:isub            
	//    9   17:invokestatic    #568 <Method int Math.max(int, int)>
	//   10   20:istore_1        
		else
	//*  11   21:goto            26
			i = 0;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		ViewCompat.setPaddingRelative(((View) (slidingTabIndicator)), i, 0, 0, 0);
	//   14   26:aload_0         
	//   15   27:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   16   30:iload_1         
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:iconst_0        
	//   20   34:invokestatic    #572 <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
		switch(mode)
	//*  21   37:aload_0         
	//*  22   38:getfield        #406 <Field int mode>
		{
	//*  23   41:tableswitch     0 1: default 64
	//	               0 78
	//	               1 67
	//*  24   64:goto            88
		case 1: // '\001'
			slidingTabIndicator.setGravity(1);
	//   25   67:aload_0         
	//   26   68:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   27   71:iconst_1        
	//   28   72:invokevirtual   #575 <Method void TabLayout$SlidingTabIndicator.setGravity(int)>
			break;

	//*  29   75:goto            88
		case 0: // '\0'
			slidingTabIndicator.setGravity(0x800003);
	//   30   78:aload_0         
	//   31   79:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   32   82:ldc2            #576 <Int 0x800003>
	//   33   85:invokevirtual   #575 <Method void TabLayout$SlidingTabIndicator.setGravity(int)>
			break;
		}
		updateTabViews(true);
	//   34   88:aload_0         
	//   35   89:iconst_1        
	//   36   90:invokevirtual   #579 <Method void updateTabViews(boolean)>
	//   37   93:return          
	}

	private int calculateScrollXForTab(int i, float f)
	{
		int k = mode;
	//    0    0:aload_0         
	//    1    1:getfield        #406 <Field int mode>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(k == 0)
	//*   5    8:iload           4
	//*   6   10:ifne            128
		{
			View view1 = slidingTabIndicator.getChildAt(i);
	//    7   13:aload_0         
	//    8   14:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #583 <Method View TabLayout$SlidingTabIndicator.getChildAt(int)>
	//   11   21:astore          6
			i++;
	//   12   23:iload_1         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:istore_1        
			View view;
			if(i < slidingTabIndicator.getChildCount())
	//*  16   27:iload_1         
	//*  17   28:aload_0         
	//*  18   29:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//*  19   32:invokevirtual   #586 <Method int TabLayout$SlidingTabIndicator.getChildCount()>
	//*  20   35:icmpge          51
				view = slidingTabIndicator.getChildAt(i);
	//   21   38:aload_0         
	//   22   39:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   23   42:iload_1         
	//   24   43:invokevirtual   #583 <Method View TabLayout$SlidingTabIndicator.getChildAt(int)>
	//   25   46:astore          5
			else
	//*  26   48:goto            54
				view = null;
	//   27   51:aconst_null     
	//   28   52:astore          5
			if(view1 != null)
	//*  29   54:aload           6
	//*  30   56:ifnull          68
				i = view1.getWidth();
	//   31   59:aload           6
	//   32   61:invokevirtual   #591 <Method int View.getWidth()>
	//   33   64:istore_1        
			else
	//*  34   65:goto            70
				i = 0;
	//   35   68:iconst_0        
	//   36   69:istore_1        
			if(view != null)
	//*  37   70:aload           5
	//*  38   72:ifnull          81
				j = view.getWidth();
	//   39   75:aload           5
	//   40   77:invokevirtual   #591 <Method int View.getWidth()>
	//   41   80:istore_3        
			int l = (view1.getLeft() + i / 2) - getWidth() / 2;
	//   42   81:aload           6
	//   43   83:invokevirtual   #594 <Method int View.getLeft()>
	//   44   86:iload_1         
	//   45   87:iconst_2        
	//   46   88:idiv            
	//   47   89:iadd            
	//   48   90:aload_0         
	//   49   91:invokevirtual   #595 <Method int getWidth()>
	//   50   94:iconst_2        
	//   51   95:idiv            
	//   52   96:isub            
	//   53   97:istore          4
			i = (int)((float)(i + j) * 0.5F * f);
	//   54   99:iload_1         
	//   55  100:iload_3         
	//   56  101:iadd            
	//   57  102:i2f             
	//   58  103:ldc2            #596 <Float 0.5F>
	//   59  106:fmul            
	//   60  107:fload_2         
	//   61  108:fmul            
	//   62  109:f2i             
	//   63  110:istore_1        
			if(ViewCompat.getLayoutDirection(((View) (this))) == 0)
	//*  64  111:aload_0         
	//*  65  112:invokestatic    #600 <Method int ViewCompat.getLayoutDirection(View)>
	//*  66  115:ifne            123
				return l + i;
	//   67  118:iload           4
	//   68  120:iload_1         
	//   69  121:iadd            
	//   70  122:ireturn         
			else
				return l - i;
	//   71  123:iload           4
	//   72  125:iload_1         
	//   73  126:isub            
	//   74  127:ireturn         
		} else
		{
			return 0;
	//   75  128:iconst_0        
	//   76  129:ireturn         
		}
	}

	private void configureTab(Tab tab, int i)
	{
		tab.setPosition(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #605 <Method void TabLayout$Tab.setPosition(int)>
		tabs.add(i, ((Object) (tab)));
	//    3    5:aload_0         
	//    4    6:getfield        #171 <Field ArrayList tabs>
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #609 <Method void ArrayList.add(int, Object)>
		int j = tabs.size();
	//    8   14:aload_0         
	//    9   15:getfield        #171 <Field ArrayList tabs>
	//   10   18:invokevirtual   #612 <Method int ArrayList.size()>
	//   11   21:istore_3        
		do
		{
			i++;
	//   12   22:iload_2         
	//   13   23:iconst_1        
	//   14   24:iadd            
	//   15   25:istore_2        
			if(i < j)
	//*  16   26:iload_2         
	//*  17   27:iload_3         
	//*  18   28:icmpge          49
				((Tab)tabs.get(i)).setPosition(i);
	//   19   31:aload_0         
	//   20   32:getfield        #171 <Field ArrayList tabs>
	//   21   35:iload_2         
	//   22   36:invokevirtual   #616 <Method Object ArrayList.get(int)>
	//   23   39:checkcast       #30  <Class TabLayout$Tab>
	//   24   42:iload_2         
	//   25   43:invokevirtual   #605 <Method void TabLayout$Tab.setPosition(int)>
			else
	//*  26   46:goto            22
				return;
	//   27   49:return          
		} while(true);
	}

	private static ColorStateList createColorStateList(int i, int j)
	{
		return new ColorStateList(new int[][] {
			SELECTED_STATE_SET, EMPTY_STATE_SET
		}, new int[] {
			j, i
		});
	//    0    0:new             #347 <Class ColorStateList>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:anewarray       int[][]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #620 <Field int[] SELECTED_STATE_SET>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:getstatic       #623 <Field int[] EMPTY_STATE_SET>
	//   11   19:aastore         
	//   12   20:iconst_2        
	//   13   21:newarray        int[]
	//   14   23:dup             
	//   15   24:iconst_0        
	//   16   25:iload_1         
	//   17   26:iastore         
	//   18   27:dup             
	//   19   28:iconst_1        
	//   20   29:iload_0         
	//   21   30:iastore         
	//   22   31:invokespecial   #626 <Method void ColorStateList(int[][], int[])>
	//   23   34:areturn         
	}

	private android.widget.LinearLayout.LayoutParams createLayoutParamsForTabs()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -1);
	//    0    0:new             #628 <Class android.widget.LinearLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:iconst_m1       
	//    4    7:invokespecial   #629 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//    5   10:astore_1        
		updateTabViewLayoutParams(layoutparams);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokespecial   #633 <Method void updateTabViewLayoutParams(android.widget.LinearLayout$LayoutParams)>
		return layoutparams;
	//    9   16:aload_1         
	//   10   17:areturn         
	}

	private TabView createTabView(Tab tab)
	{
		Object obj = ((Object) (tabViewPool));
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field android.support.v4.util.Pools$Pool tabViewPool>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
			obj = ((Object) ((TabView)((android.support.v4.util.Pools.Pool) (obj)).acquire()));
	//    5    9:aload_2         
	//    6   10:invokeinterface #641 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    7   15:checkcast       #42  <Class TabLayout$TabView>
	//    8   18:astore_2        
		else
	//*   9   19:goto            24
			obj = null;
	//   10   22:aconst_null     
	//   11   23:astore_2        
		TabView tabview = ((TabView) (obj));
	//   12   24:aload_2         
	//   13   25:astore_3        
		if(obj == null)
	//*  14   26:aload_2         
	//*  15   27:ifnonnull       43
			tabview = new TabView(getContext());
	//   16   30:new             #42  <Class TabLayout$TabView>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #645 <Method Context getContext()>
	//   21   39:invokespecial   #646 <Method void TabLayout$TabView(TabLayout, Context)>
	//   22   42:astore_3        
		tabview.setTab(tab);
	//   23   43:aload_3         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #649 <Method void TabLayout$TabView.setTab(TabLayout$Tab)>
		tabview.setFocusable(true);
	//   26   48:aload_3         
	//   27   49:iconst_1        
	//   28   50:invokevirtual   #652 <Method void TabLayout$TabView.setFocusable(boolean)>
		tabview.setMinimumWidth(getTabMinWidth());
	//   29   53:aload_3         
	//   30   54:aload_0         
	//   31   55:invokespecial   #655 <Method int getTabMinWidth()>
	//   32   58:invokevirtual   #658 <Method void TabLayout$TabView.setMinimumWidth(int)>
		if(TextUtils.isEmpty(tab.contentDesc))
	//*  33   61:aload_1         
	//*  34   62:invokestatic    #662 <Method CharSequence TabLayout$Tab.access$100(TabLayout$Tab)>
	//*  35   65:invokestatic    #488 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  36   68:ifeq            81
		{
			tabview.setContentDescription(tab.text);
	//   37   71:aload_3         
	//   38   72:aload_1         
	//   39   73:invokestatic    #665 <Method CharSequence TabLayout$Tab.access$200(TabLayout$Tab)>
	//   40   76:invokevirtual   #668 <Method void TabLayout$TabView.setContentDescription(CharSequence)>
			return tabview;
	//   41   79:aload_3         
	//   42   80:areturn         
		} else
		{
			tabview.setContentDescription(tab.contentDesc);
	//   43   81:aload_3         
	//   44   82:aload_1         
	//   45   83:invokestatic    #662 <Method CharSequence TabLayout$Tab.access$100(TabLayout$Tab)>
	//   46   86:invokevirtual   #668 <Method void TabLayout$TabView.setContentDescription(CharSequence)>
			return tabview;
	//   47   89:aload_3         
	//   48   90:areturn         
		}
	}

	private void dispatchTabReselected(Tab tab)
	{
		for(int i = selectedListeners.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field ArrayList selectedListeners>
	//*   2    4:invokevirtual   #612 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((BaseOnTabSelectedListener)selectedListeners.get(i)).onTabReselected(tab);
	//    8   14:aload_0         
	//    9   15:getfield        #181 <Field ArrayList selectedListeners>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #616 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #11  <Class TabLayout$BaseOnTabSelectedListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #672 <Method void TabLayout$BaseOnTabSelectedListener.onTabReselected(TabLayout$Tab)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void dispatchTabSelected(Tab tab)
	{
		for(int i = selectedListeners.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field ArrayList selectedListeners>
	//*   2    4:invokevirtual   #612 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((BaseOnTabSelectedListener)selectedListeners.get(i)).onTabSelected(tab);
	//    8   14:aload_0         
	//    9   15:getfield        #181 <Field ArrayList selectedListeners>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #616 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #11  <Class TabLayout$BaseOnTabSelectedListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #676 <Method void TabLayout$BaseOnTabSelectedListener.onTabSelected(TabLayout$Tab)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void dispatchTabUnselected(Tab tab)
	{
		for(int i = selectedListeners.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field ArrayList selectedListeners>
	//*   2    4:invokevirtual   #612 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((BaseOnTabSelectedListener)selectedListeners.get(i)).onTabUnselected(tab);
	//    8   14:aload_0         
	//    9   15:getfield        #181 <Field ArrayList selectedListeners>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #616 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #11  <Class TabLayout$BaseOnTabSelectedListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #680 <Method void TabLayout$BaseOnTabSelectedListener.onTabUnselected(TabLayout$Tab)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void ensureScrollAnimator()
	{
		if(scrollAnimator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #547 <Field ValueAnimator scrollAnimator>
	//*   2    4:ifnonnull       56
		{
			scrollAnimator = new ValueAnimator();
	//    3    7:aload_0         
	//    4    8:new             #549 <Class ValueAnimator>
	//    5   11:dup             
	//    6   12:invokespecial   #681 <Method void ValueAnimator()>
	//    7   15:putfield        #547 <Field ValueAnimator scrollAnimator>
			scrollAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
	//    8   18:aload_0         
	//    9   19:getfield        #547 <Field ValueAnimator scrollAnimator>
	//   10   22:getstatic       #687 <Field android.animation.TimeInterpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   11   25:invokevirtual   #691 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			scrollAnimator.setDuration(tabIndicatorAnimationDuration);
	//   12   28:aload_0         
	//   13   29:getfield        #547 <Field ValueAnimator scrollAnimator>
	//   14   32:aload_0         
	//   15   33:getfield        #381 <Field int tabIndicatorAnimationDuration>
	//   16   36:i2l             
	//   17   37:invokevirtual   #695 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   18   40:pop             
			scrollAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					scrollTo(((Integer)valueanimator.getAnimatedValue()).intValue(), 0);
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field TabLayout this$0>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #28  <Method Object ValueAnimator.getAnimatedValue()>
				//    4    8:checkcast       #30  <Class Integer>
				//    5   11:invokevirtual   #34  <Method int Integer.intValue()>
				//    6   14:iconst_0        
				//    7   15:invokevirtual   #38  <Method void TabLayout.scrollTo(int, int)>
				//    8   18:return          
				}

				final TabLayout this$0;

			
			{
				this$0 = TabLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field TabLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   19   41:aload_0         
	//   20   42:getfield        #547 <Field ValueAnimator scrollAnimator>
	//   21   45:new             #6   <Class TabLayout$1>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokespecial   #698 <Method void TabLayout$1(TabLayout)>
	//   25   53:invokevirtual   #702 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
	//   26   56:return          
	}

	private int getDefaultHeight()
	{
		int j = tabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field ArrayList tabs>
	//    2    4:invokevirtual   #612 <Method int ArrayList.size()>
	//    3    7:istore          4
		boolean flag1 = false;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//    8   13:iload_3         
	//    9   14:istore_2        
			if(i >= j)
				break;
	//   10   15:iload_1         
	//   11   16:iload           4
	//   12   18:icmpge          70
			Tab tab = (Tab)tabs.get(i);
	//   13   21:aload_0         
	//   14   22:getfield        #171 <Field ArrayList tabs>
	//   15   25:iload_1         
	//   16   26:invokevirtual   #616 <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #30  <Class TabLayout$Tab>
	//   18   32:astore          5
			if(tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText()))
	//*  19   34:aload           5
	//*  20   36:ifnull          63
	//*  21   39:aload           5
	//*  22   41:invokevirtual   #707 <Method Drawable TabLayout$Tab.getIcon()>
	//*  23   44:ifnull          63
	//*  24   47:aload           5
	//*  25   49:invokevirtual   #710 <Method CharSequence TabLayout$Tab.getText()>
	//*  26   52:invokestatic    #488 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   55:ifne            63
			{
				flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_2        
				break;
	//   30   60:goto            70
			}
			i++;
	//   31   63:iload_1         
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore_1        
		} while(true);
	//   35   67:goto            13
		return !flag || inlineLabel ? 48 : 72;
	//   36   70:iload_2         
	//   37   71:ifeq            84
	//   38   74:aload_0         
	//   39   75:getfield        #416 <Field boolean inlineLabel>
	//   40   78:ifne            84
	//   41   81:bipush          72
	//   42   83:ireturn         
	//   43   84:bipush          48
	//   44   86:ireturn         
	}

	private int getTabMinWidth()
	{
		int i = requestedTabMinWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #386 <Field int requestedTabMinWidth>
	//    2    4:istore_1        
		if(i != -1)
	//*   3    5:iload_1         
	//*   4    6:iconst_m1       
	//*   5    7:icmpeq          12
			return i;
	//    6   10:iload_1         
	//    7   11:ireturn         
		if(mode == 0)
	//*   8   12:aload_0         
	//*   9   13:getfield        #406 <Field int mode>
	//*  10   16:ifne            24
			return scrollableTabMinWidth;
	//   11   19:aload_0         
	//   12   20:getfield        #442 <Field int scrollableTabMinWidth>
	//   13   23:ireturn         
		else
			return 0;
	//   14   24:iconst_0        
	//   15   25:ireturn         
	}

	private int getTabScrollRange()
	{
		return Math.max(0, slidingTabIndicator.getWidth() - getWidth() - getPaddingLeft() - getPaddingRight());
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    3    5:invokevirtual   #713 <Method int TabLayout$SlidingTabIndicator.getWidth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #595 <Method int getWidth()>
	//    6   12:isub            
	//    7   13:aload_0         
	//    8   14:invokevirtual   #716 <Method int getPaddingLeft()>
	//    9   17:isub            
	//   10   18:aload_0         
	//   11   19:invokevirtual   #719 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:invokestatic    #568 <Method int Math.max(int, int)>
	//   14   26:ireturn         
	}

	private void removeTabViewAt(int i)
	{
		TabView tabview = (TabView)slidingTabIndicator.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #583 <Method View TabLayout$SlidingTabIndicator.getChildAt(int)>
	//    4    8:checkcast       #42  <Class TabLayout$TabView>
	//    5   11:astore_2        
		slidingTabIndicator.removeViewAt(i);
	//    6   12:aload_0         
	//    7   13:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #723 <Method void TabLayout$SlidingTabIndicator.removeViewAt(int)>
		if(tabview != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          39
		{
			tabview.reset();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #726 <Method void TabLayout$TabView.reset()>
			tabViewPool.release(((Object) (tabview)));
	//   14   28:aload_0         
	//   15   29:getfield        #186 <Field android.support.v4.util.Pools$Pool tabViewPool>
	//   16   32:aload_2         
	//   17   33:invokeinterface #730 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   18   38:pop             
		}
		requestLayout();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #733 <Method void requestLayout()>
	//   21   43:return          
	}

	private void setSelectedTabView(int i)
	{
		int k = slidingTabIndicator.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    2    4:invokevirtual   #586 <Method int TabLayout$SlidingTabIndicator.getChildCount()>
	//    3    7:istore_3        
		if(i < k)
	//*   4    8:iload_1         
	//*   5    9:iload_3         
	//*   6   10:icmpge          83
		{
			for(int j = 0; j < k; j++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          83
			{
				View view = slidingTabIndicator.getChildAt(j);
	//   12   20:aload_0         
	//   13   21:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #583 <Method View TabLayout$SlidingTabIndicator.getChildAt(int)>
	//   16   28:astore          6
				boolean flag1 = true;
	//   17   30:iconst_1        
	//   18   31:istore          5
				boolean flag;
				if(j == i)
	//*  19   33:iload_2         
	//*  20   34:iload_1         
	//*  21   35:icmpne          44
					flag = true;
	//   22   38:iconst_1        
	//   23   39:istore          4
				else
	//*  24   41:goto            47
					flag = false;
	//   25   44:iconst_0        
	//   26   45:istore          4
				view.setSelected(flag);
	//   27   47:aload           6
	//   28   49:iload           4
	//   29   51:invokevirtual   #737 <Method void View.setSelected(boolean)>
				if(j == i)
	//*  30   54:iload_2         
	//*  31   55:iload_1         
	//*  32   56:icmpne          66
					flag = flag1;
	//   33   59:iload           5
	//   34   61:istore          4
				else
	//*  35   63:goto            69
					flag = false;
	//   36   66:iconst_0        
	//   37   67:istore          4
				view.setActivated(flag);
	//   38   69:aload           6
	//   39   71:iload           4
	//   40   73:invokevirtual   #740 <Method void View.setActivated(boolean)>
			}

	//   41   76:iload_2         
	//   42   77:iconst_1        
	//   43   78:iadd            
	//   44   79:istore_2        
		}
	//*  45   80:goto            15
	//   46   83:return          
	}

	private void setupWithViewPager(ViewPager viewpager, boolean flag, boolean flag1)
	{
		Object obj = ((Object) (viewPager));
	//    0    0:aload_0         
	//    1    1:getfield        #744 <Field ViewPager viewPager>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          49
		{
			TabLayoutOnPageChangeListener tablayoutonpagechangelistener = pageChangeListener;
	//    5   11:aload_0         
	//    6   12:getfield        #746 <Field TabLayout$TabLayoutOnPageChangeListener pageChangeListener>
	//    7   15:astore          5
			if(tablayoutonpagechangelistener != null)
	//*   8   17:aload           5
	//*   9   19:ifnull          29
				((ViewPager) (obj)).removeOnPageChangeListener(((android.support.v4.view.ViewPager.OnPageChangeListener) (tablayoutonpagechangelistener)));
	//   10   22:aload           4
	//   11   24:aload           5
	//   12   26:invokevirtual   #752 <Method void ViewPager.removeOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
			obj = ((Object) (adapterChangeListener));
	//   13   29:aload_0         
	//   14   30:getfield        #754 <Field TabLayout$AdapterChangeListener adapterChangeListener>
	//   15   33:astore          4
			if(obj != null)
	//*  16   35:aload           4
	//*  17   37:ifnull          49
				viewPager.removeOnAdapterChangeListener(((android.support.v4.view.ViewPager.OnAdapterChangeListener) (obj)));
	//   18   40:aload_0         
	//   19   41:getfield        #744 <Field ViewPager viewPager>
	//   20   44:aload           4
	//   21   46:invokevirtual   #758 <Method void ViewPager.removeOnAdapterChangeListener(android.support.v4.view.ViewPager$OnAdapterChangeListener)>
		}
		obj = ((Object) (currentVpSelectedListener));
	//   22   49:aload_0         
	//   23   50:getfield        #760 <Field TabLayout$BaseOnTabSelectedListener currentVpSelectedListener>
	//   24   53:astore          4
		if(obj != null)
	//*  25   55:aload           4
	//*  26   57:ifnull          71
		{
			removeOnTabSelectedListener(((BaseOnTabSelectedListener) (obj)));
	//   27   60:aload_0         
	//   28   61:aload           4
	//   29   63:invokevirtual   #764 <Method void removeOnTabSelectedListener(TabLayout$BaseOnTabSelectedListener)>
			currentVpSelectedListener = null;
	//   30   66:aload_0         
	//   31   67:aconst_null     
	//   32   68:putfield        #760 <Field TabLayout$BaseOnTabSelectedListener currentVpSelectedListener>
		}
		if(viewpager != null)
	//*  33   71:aload_1         
	//*  34   72:ifnull          200
		{
			viewPager = viewpager;
	//   35   75:aload_0         
	//   36   76:aload_1         
	//   37   77:putfield        #744 <Field ViewPager viewPager>
			if(pageChangeListener == null)
	//*  38   80:aload_0         
	//*  39   81:getfield        #746 <Field TabLayout$TabLayoutOnPageChangeListener pageChangeListener>
	//*  40   84:ifnonnull       99
				pageChangeListener = new TabLayoutOnPageChangeListener(this);
	//   41   87:aload_0         
	//   42   88:new             #39  <Class TabLayout$TabLayoutOnPageChangeListener>
	//   43   91:dup             
	//   44   92:aload_0         
	//   45   93:invokespecial   #765 <Method void TabLayout$TabLayoutOnPageChangeListener(TabLayout)>
	//   46   96:putfield        #746 <Field TabLayout$TabLayoutOnPageChangeListener pageChangeListener>
			pageChangeListener.reset();
	//   47   99:aload_0         
	//   48  100:getfield        #746 <Field TabLayout$TabLayoutOnPageChangeListener pageChangeListener>
	//   49  103:invokevirtual   #766 <Method void TabLayout$TabLayoutOnPageChangeListener.reset()>
			viewpager.addOnPageChangeListener(((android.support.v4.view.ViewPager.OnPageChangeListener) (pageChangeListener)));
	//   50  106:aload_1         
	//   51  107:aload_0         
	//   52  108:getfield        #746 <Field TabLayout$TabLayoutOnPageChangeListener pageChangeListener>
	//   53  111:invokevirtual   #769 <Method void ViewPager.addOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
			currentVpSelectedListener = ((BaseOnTabSelectedListener) (new ViewPagerOnTabSelectedListener(viewpager)));
	//   54  114:aload_0         
	//   55  115:new             #45  <Class TabLayout$ViewPagerOnTabSelectedListener>
	//   56  118:dup             
	//   57  119:aload_1         
	//   58  120:invokespecial   #772 <Method void TabLayout$ViewPagerOnTabSelectedListener(ViewPager)>
	//   59  123:putfield        #760 <Field TabLayout$BaseOnTabSelectedListener currentVpSelectedListener>
			addOnTabSelectedListener(currentVpSelectedListener);
	//   60  126:aload_0         
	//   61  127:aload_0         
	//   62  128:getfield        #760 <Field TabLayout$BaseOnTabSelectedListener currentVpSelectedListener>
	//   63  131:invokevirtual   #775 <Method void addOnTabSelectedListener(TabLayout$BaseOnTabSelectedListener)>
			PagerAdapter pageradapter = viewpager.getAdapter();
	//   64  134:aload_1         
	//   65  135:invokevirtual   #779 <Method PagerAdapter ViewPager.getAdapter()>
	//   66  138:astore          4
			if(pageradapter != null)
	//*  67  140:aload           4
	//*  68  142:ifnull          152
				setPagerAdapter(pageradapter, flag);
	//   69  145:aload_0         
	//   70  146:aload           4
	//   71  148:iload_2         
	//   72  149:invokevirtual   #783 <Method void setPagerAdapter(PagerAdapter, boolean)>
			if(adapterChangeListener == null)
	//*  73  152:aload_0         
	//*  74  153:getfield        #754 <Field TabLayout$AdapterChangeListener adapterChangeListener>
	//*  75  156:ifnonnull       171
				adapterChangeListener = new AdapterChangeListener();
	//   76  159:aload_0         
	//   77  160:new             #8   <Class TabLayout$AdapterChangeListener>
	//   78  163:dup             
	//   79  164:aload_0         
	//   80  165:invokespecial   #784 <Method void TabLayout$AdapterChangeListener(TabLayout)>
	//   81  168:putfield        #754 <Field TabLayout$AdapterChangeListener adapterChangeListener>
			adapterChangeListener.setAutoRefresh(flag);
	//   82  171:aload_0         
	//   83  172:getfield        #754 <Field TabLayout$AdapterChangeListener adapterChangeListener>
	//   84  175:iload_2         
	//   85  176:invokevirtual   #787 <Method void TabLayout$AdapterChangeListener.setAutoRefresh(boolean)>
			viewpager.addOnAdapterChangeListener(((android.support.v4.view.ViewPager.OnAdapterChangeListener) (adapterChangeListener)));
	//   86  179:aload_1         
	//   87  180:aload_0         
	//   88  181:getfield        #754 <Field TabLayout$AdapterChangeListener adapterChangeListener>
	//   89  184:invokevirtual   #790 <Method void ViewPager.addOnAdapterChangeListener(android.support.v4.view.ViewPager$OnAdapterChangeListener)>
			setScrollPosition(viewpager.getCurrentItem(), 0.0F, true);
	//   90  187:aload_0         
	//   91  188:aload_1         
	//   92  189:invokevirtual   #793 <Method int ViewPager.getCurrentItem()>
	//   93  192:fconst_0        
	//   94  193:iconst_1        
	//   95  194:invokevirtual   #563 <Method void setScrollPosition(int, float, boolean)>
		} else
	//*  96  197:goto            211
		{
			viewPager = null;
	//   97  200:aload_0         
	//   98  201:aconst_null     
	//   99  202:putfield        #744 <Field ViewPager viewPager>
			setPagerAdapter(((PagerAdapter) (null)), false);
	//  100  205:aload_0         
	//  101  206:aconst_null     
	//  102  207:iconst_0        
	//  103  208:invokevirtual   #783 <Method void setPagerAdapter(PagerAdapter, boolean)>
		}
		setupViewPagerImplicitly = flag1;
	//  104  211:aload_0         
	//  105  212:iload_3         
	//  106  213:putfield        #795 <Field boolean setupViewPagerImplicitly>
	//  107  216:return          
	}

	private void updateAllTabs()
	{
		int j = tabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field ArrayList tabs>
	//    2    4:invokevirtual   #612 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((Tab)tabs.get(i)).updateView();
	//    9   15:aload_0         
	//   10   16:getfield        #171 <Field ArrayList tabs>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #616 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #30  <Class TabLayout$Tab>
	//   14   26:invokevirtual   #799 <Method void TabLayout$Tab.updateView()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
	//   20   36:return          
	}

	private void updateTabViewLayoutParams(android.widget.LinearLayout.LayoutParams layoutparams)
	{
		if(mode == 1 && tabGravity == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #406 <Field int mode>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          26
	//*   4    8:aload_0         
	//*   5    9:getfield        #411 <Field int tabGravity>
	//*   6   12:ifne            26
		{
			layoutparams.width = 0;
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:putfield        #802 <Field int android.widget.LinearLayout$LayoutParams.width>
			layoutparams.weight = 1.0F;
	//   10   20:aload_1         
	//   11   21:fconst_1        
	//   12   22:putfield        #805 <Field float android.widget.LinearLayout$LayoutParams.weight>
			return;
	//   13   25:return          
		} else
		{
			layoutparams.width = -2;
	//   14   26:aload_1         
	//   15   27:bipush          -2
	//   16   29:putfield        #802 <Field int android.widget.LinearLayout$LayoutParams.width>
			layoutparams.weight = 0.0F;
	//   17   32:aload_1         
	//   18   33:fconst_0        
	//   19   34:putfield        #805 <Field float android.widget.LinearLayout$LayoutParams.weight>
			return;
	//   20   37:return          
		}
	}

	public void addOnTabSelectedListener(BaseOnTabSelectedListener baseontabselectedlistener)
	{
		if(!selectedListeners.contains(((Object) (baseontabselectedlistener))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field ArrayList selectedListeners>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #808 <Method boolean ArrayList.contains(Object)>
	//*   4    8:ifne            20
			selectedListeners.add(((Object) (baseontabselectedlistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #181 <Field ArrayList selectedListeners>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #810 <Method boolean ArrayList.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void addTab(Tab tab)
	{
		addTab(tab, tabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #171 <Field ArrayList tabs>
	//    4    6:invokevirtual   #812 <Method boolean ArrayList.isEmpty()>
	//    5    9:invokevirtual   #815 <Method void addTab(TabLayout$Tab, boolean)>
	//    6   12:return          
	}

	public void addTab(Tab tab, int i)
	{
		addTab(tab, i, tabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #171 <Field ArrayList tabs>
	//    5    7:invokevirtual   #812 <Method boolean ArrayList.isEmpty()>
	//    6   10:invokevirtual   #818 <Method void addTab(TabLayout$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addTab(Tab tab, int i, boolean flag)
	{
		if(tab.parent == this)
	//*   0    0:aload_1         
	//*   1    1:getfield        #822 <Field TabLayout TabLayout$Tab.parent>
	//*   2    4:aload_0         
	//*   3    5:if_acmpne       28
		{
			configureTab(tab, i);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokespecial   #824 <Method void configureTab(TabLayout$Tab, int)>
			addTabView(tab);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #826 <Method void addTabView(TabLayout$Tab)>
			if(flag)
	//*  11   19:iload_3         
	//*  12   20:ifeq            27
				tab.select();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #829 <Method void TabLayout$Tab.select()>
			return;
	//   15   27:return          
		} else
		{
			throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
	//   16   28:new             #515 <Class IllegalArgumentException>
	//   17   31:dup             
	//   18   32:ldc2            #831 <String "Tab belongs to a different TabLayout.">
	//   19   35:invokespecial   #520 <Method void IllegalArgumentException(String)>
	//   20   38:athrow          
		}
	}

	public void addTab(Tab tab, boolean flag)
	{
		addTab(tab, tabs.size(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #171 <Field ArrayList tabs>
	//    4    6:invokevirtual   #612 <Method int ArrayList.size()>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #818 <Method void addTab(TabLayout$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addView(View view)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #833 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void addView(View view, int i)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #833 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #833 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #833 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void clearOnTabSelectedListeners()
	{
		selectedListeners.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ArrayList selectedListeners>
	//    2    4:invokevirtual   #839 <Method void ArrayList.clear()>
	//    3    7:return          
	}

	protected Tab createTabFromPool()
	{
		Tab tab1 = (Tab)tabPool.acquire();
	//    0    0:getstatic       #151 <Field android.support.v4.util.Pools$Pool tabPool>
	//    1    3:invokeinterface #641 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #30  <Class TabLayout$Tab>
	//    3   11:astore_2        
		Tab tab = tab1;
	//    4   12:aload_2         
	//    5   13:astore_1        
		if(tab1 == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       26
			tab = new Tab();
	//    8   18:new             #30  <Class TabLayout$Tab>
	//    9   21:dup             
	//   10   22:invokespecial   #841 <Method void TabLayout$Tab()>
	//   11   25:astore_1        
		return tab;
	//   12   26:aload_1         
	//   13   27:areturn         
	}

	int dpToPx(int i)
	{
		return Math.round(getResources().getDisplayMetrics().density * (float)i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #425 <Method Resources getResources()>
	//    2    4:invokevirtual   #846 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:getfield        #851 <Field float DisplayMetrics.density>
	//    4   10:iload_1         
	//    5   11:i2f             
	//    6   12:fmul            
	//    7   13:invokestatic    #855 <Method int Math.round(float)>
	//    8   16:ireturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #860 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #864 <Method android.widget.FrameLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public int getSelectedTabPosition()
	{
		Tab tab = selectedTab;
	//    0    0:aload_0         
	//    1    1:getfield        #867 <Field TabLayout$Tab selectedTab>
	//    2    4:astore_1        
		if(tab != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return tab.getPosition();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #504 <Method int TabLayout$Tab.getPosition()>
	//    7   13:ireturn         
		else
			return -1;
	//    8   14:iconst_m1       
	//    9   15:ireturn         
	}

	public Tab getTabAt(int i)
	{
		if(i >= 0 && i < getTabCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            27
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #871 <Method int getTabCount()>
	//*   5    9:icmplt          15
	//*   6   12:goto            27
			return (Tab)tabs.get(i);
	//    7   15:aload_0         
	//    8   16:getfield        #171 <Field ArrayList tabs>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #616 <Method Object ArrayList.get(int)>
	//   11   23:checkcast       #30  <Class TabLayout$Tab>
	//   12   26:areturn         
		else
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
	}

	public int getTabCount()
	{
		return tabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field ArrayList tabs>
	//    2    4:invokevirtual   #612 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public int getTabGravity()
	{
		return tabGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #411 <Field int tabGravity>
	//    2    4:ireturn         
	}

	public ColorStateList getTabIconTint()
	{
		return tabIconTint;
	//    0    0:aload_0         
	//    1    1:getfield        #360 <Field ColorStateList tabIconTint>
	//    2    4:areturn         
	}

	public int getTabIndicatorGravity()
	{
		return tabIndicatorGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #877 <Field int tabIndicatorGravity>
	//    2    4:ireturn         
	}

	int getTabMaxWidth()
	{
		return tabMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field int tabMaxWidth>
	//    2    4:ireturn         
	}

	public int getTabMode()
	{
		return mode;
	//    0    0:aload_0         
	//    1    1:getfield        #406 <Field int mode>
	//    2    4:ireturn         
	}

	public ColorStateList getTabRippleColor()
	{
		return tabRippleColorStateList;
	//    0    0:aload_0         
	//    1    1:getfield        #376 <Field ColorStateList tabRippleColorStateList>
	//    2    4:areturn         
	}

	public Drawable getTabSelectedIndicator()
	{
		return tabSelectedIndicator;
	//    0    0:aload_0         
	//    1    1:getfield        #883 <Field Drawable tabSelectedIndicator>
	//    2    4:areturn         
	}

	public ColorStateList getTabTextColors()
	{
		return tabTextColors;
	//    0    0:aload_0         
	//    1    1:getfield        #332 <Field ColorStateList tabTextColors>
	//    2    4:areturn         
	}

	public boolean hasUnboundedRipple()
	{
		return unboundedRipple;
	//    0    0:aload_0         
	//    1    1:getfield        #421 <Field boolean unboundedRipple>
	//    2    4:ireturn         
	}

	public boolean isInlineLabel()
	{
		return inlineLabel;
	//    0    0:aload_0         
	//    1    1:getfield        #416 <Field boolean inlineLabel>
	//    2    4:ireturn         
	}

	public boolean isTabIndicatorFullWidth()
	{
		return tabIndicatorFullWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #889 <Field boolean tabIndicatorFullWidth>
	//    2    4:ireturn         
	}

	public Tab newTab()
	{
		Tab tab = createTabFromPool();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #891 <Method TabLayout$Tab createTabFromPool()>
	//    2    4:astore_1        
		tab.parent = this;
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:putfield        #822 <Field TabLayout TabLayout$Tab.parent>
		tab.view = createTabView(tab);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokespecial   #893 <Method TabLayout$TabView createTabView(TabLayout$Tab)>
	//   10   16:putfield        #501 <Field TabLayout$TabView TabLayout$Tab.view>
		return tab;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #896 <Method void HorizontalScrollView.onAttachedToWindow()>
		if(viewPager == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #744 <Field ViewPager viewPager>
	//*   4    8:ifnonnull       33
		{
			android.view.ViewParent viewparent = getParent();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #900 <Method android.view.ViewParent getParent()>
	//    7   15:astore_1        
			if(viewparent instanceof ViewPager)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #748 <Class ViewPager>
	//*  10   20:ifeq            33
				setupWithViewPager((ViewPager)viewparent, true, true);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:checkcast       #748 <Class ViewPager>
	//   14   28:iconst_1        
	//   15   29:iconst_1        
	//   16   30:invokespecial   #902 <Method void setupWithViewPager(ViewPager, boolean, boolean)>
		}
	//   17   33:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #905 <Method void HorizontalScrollView.onDetachedFromWindow()>
		if(setupViewPagerImplicitly)
	//*   2    4:aload_0         
	//*   3    5:getfield        #795 <Field boolean setupViewPagerImplicitly>
	//*   4    8:ifeq            21
		{
			setupWithViewPager(((ViewPager) (null)));
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #907 <Method void setupWithViewPager(ViewPager)>
			setupViewPagerImplicitly = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #795 <Field boolean setupViewPagerImplicitly>
		}
	//   11   21:return          
	}

	protected void onDraw(Canvas canvas)
	{
		for(int i = 0; i < slidingTabIndicator.getChildCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//*   5    7:invokevirtual   #586 <Method int TabLayout$SlidingTabIndicator.getChildCount()>
	//*   6   10:icmpge          44
		{
			View view = slidingTabIndicator.getChildAt(i);
	//    7   13:aload_0         
	//    8   14:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #583 <Method View TabLayout$SlidingTabIndicator.getChildAt(int)>
	//   11   21:astore_3        
			if(view instanceof TabView)
	//*  12   22:aload_3         
	//*  13   23:instanceof      #42  <Class TabLayout$TabView>
	//*  14   26:ifeq            37
				((TabView)view).drawBackground(canvas);
	//   15   29:aload_3         
	//   16   30:checkcast       #42  <Class TabLayout$TabView>
	//   17   33:aload_1         
	//   18   34:invokestatic    #913 <Method void TabLayout$TabView.access$300(TabLayout$TabView, Canvas)>
		}

	//   19   37:iload_2         
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:istore_2        
	//*  23   41:goto            2
		super.onDraw(canvas);
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:invokespecial   #915 <Method void HorizontalScrollView.onDraw(Canvas)>
	//   27   49:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #918 <Method int getDefaultHeight()>
	//    3    5:invokevirtual   #920 <Method int dpToPx(int)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #923 <Method int getPaddingTop()>
	//    6   12:iadd            
	//    7   13:aload_0         
	//    8   14:invokevirtual   #926 <Method int getPaddingBottom()>
	//    9   17:iadd            
	//   10   18:istore_3        
		int i1 = android.view.View.MeasureSpec.getMode(j);
	//   11   19:iload_2         
	//   12   20:invokestatic    #931 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   13   23:istore          4
		if(i1 != 0x80000000)
	//*  14   25:iload           4
	//*  15   27:ldc2            #932 <Int 0x80000000>
	//*  16   30:icmpeq          52
		{
			if(i1 == 0)
	//*  17   33:iload           4
	//*  18   35:ifeq            41
	//*  19   38:goto            67
				j = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
	//   20   41:iload_3         
	//   21   42:ldc2            #933 <Int 0x40000000>
	//   22   45:invokestatic    #936 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   48:istore_2        
		} else
	//*  24   49:goto            67
		{
			j = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k, android.view.View.MeasureSpec.getSize(j)), 0x40000000);
	//   25   52:iload_3         
	//   26   53:iload_2         
	//   27   54:invokestatic    #939 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   28   57:invokestatic    #942 <Method int Math.min(int, int)>
	//   29   60:ldc2            #933 <Int 0x40000000>
	//   30   63:invokestatic    #936 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   31   66:istore_2        
		}
		i1 = android.view.View.MeasureSpec.getSize(i);
	//   32   67:iload_1         
	//   33   68:invokestatic    #939 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   34   71:istore          4
		if(android.view.View.MeasureSpec.getMode(i) != 0)
	//*  35   73:iload_1         
	//*  36   74:invokestatic    #931 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  37   77:ifeq            107
		{
			int l = requestedTabMaxWidth;
	//   38   80:aload_0         
	//   39   81:getfield        #391 <Field int requestedTabMaxWidth>
	//   40   84:istore_3        
			if(l <= 0)
	//*  41   85:iload_3         
	//*  42   86:ifle            92
	//*  43   89:goto            102
				l = i1 - dpToPx(56);
	//   44   92:iload           4
	//   45   94:aload_0         
	//   46   95:bipush          56
	//   47   97:invokevirtual   #920 <Method int dpToPx(int)>
	//   48  100:isub            
	//   49  101:istore_3        
			tabMaxWidth = l;
	//   50  102:aload_0         
	//   51  103:iload_3         
	//   52  104:putfield        #179 <Field int tabMaxWidth>
		}
		super.onMeasure(i, j);
	//   53  107:aload_0         
	//   54  108:iload_1         
	//   55  109:iload_2         
	//   56  110:invokespecial   #944 <Method void HorizontalScrollView.onMeasure(int, int)>
		if(getChildCount() == 1)
	//*  57  113:aload_0         
	//*  58  114:invokevirtual   #945 <Method int getChildCount()>
	//*  59  117:iconst_1        
	//*  60  118:icmpne          232
		{
			i = 0;
	//   61  121:iconst_0        
	//   62  122:istore_1        
			View view = getChildAt(0);
	//   63  123:aload_0         
	//   64  124:iconst_0        
	//   65  125:invokevirtual   #946 <Method View getChildAt(int)>
	//   66  128:astore          5
			switch(mode)
	//*  67  130:aload_0         
	//*  68  131:getfield        #406 <Field int mode>
			{
	//*  69  134:tableswitch     0 1: default 156
	//	               0 176
	//	               1 159
	//*  70  156:goto            190
			case 1: // '\001'
				if(view.getMeasuredWidth() != getMeasuredWidth())
	//*  71  159:aload           5
	//*  72  161:invokevirtual   #949 <Method int View.getMeasuredWidth()>
	//*  73  164:aload_0         
	//*  74  165:invokevirtual   #950 <Method int getMeasuredWidth()>
	//*  75  168:icmpeq          190
					i = 1;
	//   76  171:iconst_1        
	//   77  172:istore_1        
				break;

	//*  78  173:goto            190
			case 0: // '\0'
				if(view.getMeasuredWidth() < getMeasuredWidth())
	//*  79  176:aload           5
	//*  80  178:invokevirtual   #949 <Method int View.getMeasuredWidth()>
	//*  81  181:aload_0         
	//*  82  182:invokevirtual   #950 <Method int getMeasuredWidth()>
	//*  83  185:icmpge          190
					i = 1;
	//   84  188:iconst_1        
	//   85  189:istore_1        
				break;
			}
			if(i != 0)
	//*  86  190:iload_1         
	//*  87  191:ifeq            232
			{
				i = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height);
	//   88  194:iload_2         
	//   89  195:aload_0         
	//   90  196:invokevirtual   #923 <Method int getPaddingTop()>
	//   91  199:aload_0         
	//   92  200:invokevirtual   #926 <Method int getPaddingBottom()>
	//   93  203:iadd            
	//   94  204:aload           5
	//   95  206:invokevirtual   #954 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   96  209:getfield        #959 <Field int android.view.ViewGroup$LayoutParams.height>
	//   97  212:invokestatic    #963 <Method int getChildMeasureSpec(int, int, int)>
	//   98  215:istore_1        
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000), i);
	//   99  216:aload           5
	//  100  218:aload_0         
	//  101  219:invokevirtual   #950 <Method int getMeasuredWidth()>
	//  102  222:ldc2            #933 <Int 0x40000000>
	//  103  225:invokestatic    #936 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  104  228:iload_1         
	//  105  229:invokevirtual   #966 <Method void View.measure(int, int)>
			}
		}
	//  106  232:return          
	}

	void populateFromPagerAdapter()
	{
		removeAllTabs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #970 <Method void removeAllTabs()>
		Object obj = ((Object) (pagerAdapter));
	//    2    4:aload_0         
	//    3    5:getfield        #972 <Field PagerAdapter pagerAdapter>
	//    4    8:astore_3        
		if(obj != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          95
		{
			int k = ((PagerAdapter) (obj)).getCount();
	//    7   13:aload_3         
	//    8   14:invokevirtual   #977 <Method int PagerAdapter.getCount()>
	//    9   17:istore_2        
			for(int i = 0; i < k; i++)
	//*  10   18:iconst_0        
	//*  11   19:istore_1        
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpge          52
				addTab(newTab().setText(pagerAdapter.getPageTitle(i)), false);
	//   15   25:aload_0         
	//   16   26:aload_0         
	//   17   27:invokevirtual   #454 <Method TabLayout$Tab newTab()>
	//   18   30:aload_0         
	//   19   31:getfield        #972 <Field PagerAdapter pagerAdapter>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #981 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//   22   38:invokevirtual   #464 <Method TabLayout$Tab TabLayout$Tab.setText(CharSequence)>
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #815 <Method void addTab(TabLayout$Tab, boolean)>

	//   25   45:iload_1         
	//   26   46:iconst_1        
	//   27   47:iadd            
	//   28   48:istore_1        
	//*  29   49:goto            20
			obj = ((Object) (viewPager));
	//   30   52:aload_0         
	//   31   53:getfield        #744 <Field ViewPager viewPager>
	//   32   56:astore_3        
			if(obj != null && k > 0)
	//*  33   57:aload_3         
	//*  34   58:ifnull          95
	//*  35   61:iload_2         
	//*  36   62:ifle            95
			{
				int j = ((ViewPager) (obj)).getCurrentItem();
	//   37   65:aload_3         
	//   38   66:invokevirtual   #793 <Method int ViewPager.getCurrentItem()>
	//   39   69:istore_1        
				if(j != getSelectedTabPosition() && j < getTabCount())
	//*  40   70:iload_1         
	//*  41   71:aload_0         
	//*  42   72:invokevirtual   #983 <Method int getSelectedTabPosition()>
	//*  43   75:icmpeq          95
	//*  44   78:iload_1         
	//*  45   79:aload_0         
	//*  46   80:invokevirtual   #871 <Method int getTabCount()>
	//*  47   83:icmpge          95
					selectTab(getTabAt(j));
	//   48   86:aload_0         
	//   49   87:aload_0         
	//   50   88:iload_1         
	//   51   89:invokevirtual   #985 <Method TabLayout$Tab getTabAt(int)>
	//   52   92:invokevirtual   #988 <Method void selectTab(TabLayout$Tab)>
			}
		}
	//   53   95:return          
	}

	protected boolean releaseFromTabPool(Tab tab)
	{
		return tabPool.release(((Object) (tab)));
	//    0    0:getstatic       #151 <Field android.support.v4.util.Pools$Pool tabPool>
	//    1    3:aload_1         
	//    2    4:invokeinterface #730 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    3    9:ireturn         
	}

	public void removeAllTabs()
	{
		for(int i = slidingTabIndicator.getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//*   2    4:invokevirtual   #586 <Method int TabLayout$SlidingTabIndicator.getChildCount()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            26
			removeTabViewAt(i);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokespecial   #992 <Method void removeTabViewAt(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            10
		Tab tab;
		for(Iterator iterator = tabs.iterator(); iterator.hasNext(); releaseFromTabPool(tab))
	//*  16   26:aload_0         
	//*  17   27:getfield        #171 <Field ArrayList tabs>
	//*  18   30:invokevirtual   #996 <Method Iterator ArrayList.iterator()>
	//*  19   33:astore_2        
	//*  20   34:aload_2         
	//*  21   35:invokeinterface #1001 <Method boolean Iterator.hasNext()>
	//*  22   40:ifeq            72
		{
			tab = (Tab)iterator.next();
	//   23   43:aload_2         
	//   24   44:invokeinterface #1004 <Method Object Iterator.next()>
	//   25   49:checkcast       #30  <Class TabLayout$Tab>
	//   26   52:astore_3        
			iterator.remove();
	//   27   53:aload_2         
	//   28   54:invokeinterface #1007 <Method void Iterator.remove()>
			tab.reset();
	//   29   59:aload_3         
	//   30   60:invokevirtual   #1008 <Method void TabLayout$Tab.reset()>
		}

	//   31   63:aload_0         
	//   32   64:aload_3         
	//   33   65:invokevirtual   #1010 <Method boolean releaseFromTabPool(TabLayout$Tab)>
	//   34   68:pop             
	//*  35   69:goto            34
		selectedTab = null;
	//   36   72:aload_0         
	//   37   73:aconst_null     
	//   38   74:putfield        #867 <Field TabLayout$Tab selectedTab>
	//   39   77:return          
	}

	public void removeOnTabSelectedListener(BaseOnTabSelectedListener baseontabselectedlistener)
	{
		selectedListeners.remove(((Object) (baseontabselectedlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ArrayList selectedListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1012 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTab(Tab tab)
	{
		if(tab.parent == this)
	//*   0    0:aload_1         
	//*   1    1:getfield        #822 <Field TabLayout TabLayout$Tab.parent>
	//*   2    4:aload_0         
	//*   3    5:if_acmpne       17
		{
			removeTabAt(tab.getPosition());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #504 <Method int TabLayout$Tab.getPosition()>
	//    7   13:invokevirtual   #1016 <Method void removeTabAt(int)>
			return;
	//    8   16:return          
		} else
		{
			throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
	//    9   17:new             #515 <Class IllegalArgumentException>
	//   10   20:dup             
	//   11   21:ldc2            #1018 <String "Tab does not belong to this TabLayout.">
	//   12   24:invokespecial   #520 <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		}
	}

	public void removeTabAt(int i)
	{
		Tab tab = selectedTab;
	//    0    0:aload_0         
	//    1    1:getfield        #867 <Field TabLayout$Tab selectedTab>
	//    2    4:astore          5
		int j;
		if(tab != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          20
			j = tab.getPosition();
	//    5   11:aload           5
	//    6   13:invokevirtual   #504 <Method int TabLayout$Tab.getPosition()>
	//    7   16:istore_2        
		else
	//*   8   17:goto            22
			j = 0;
	//    9   20:iconst_0        
	//   10   21:istore_2        
		removeTabViewAt(i);
	//   11   22:aload_0         
	//   12   23:iload_1         
	//   13   24:invokespecial   #992 <Method void removeTabViewAt(int)>
		tab = (Tab)tabs.remove(i);
	//   14   27:aload_0         
	//   15   28:getfield        #171 <Field ArrayList tabs>
	//   16   31:iload_1         
	//   17   32:invokevirtual   #1020 <Method Object ArrayList.remove(int)>
	//   18   35:checkcast       #30  <Class TabLayout$Tab>
	//   19   38:astore          5
		if(tab != null)
	//*  20   40:aload           5
	//*  21   42:ifnull          57
		{
			tab.reset();
	//   22   45:aload           5
	//   23   47:invokevirtual   #1008 <Method void TabLayout$Tab.reset()>
			releaseFromTabPool(tab);
	//   24   50:aload_0         
	//   25   51:aload           5
	//   26   53:invokevirtual   #1010 <Method boolean releaseFromTabPool(TabLayout$Tab)>
	//   27   56:pop             
		}
		int l = tabs.size();
	//   28   57:aload_0         
	//   29   58:getfield        #171 <Field ArrayList tabs>
	//   30   61:invokevirtual   #612 <Method int ArrayList.size()>
	//   31   64:istore          4
		for(int k = i; k < l; k++)
	//*  32   66:iload_1         
	//*  33   67:istore_3        
	//*  34   68:iload_3         
	//*  35   69:iload           4
	//*  36   71:icmpge          96
			((Tab)tabs.get(k)).setPosition(k);
	//   37   74:aload_0         
	//   38   75:getfield        #171 <Field ArrayList tabs>
	//   39   78:iload_3         
	//   40   79:invokevirtual   #616 <Method Object ArrayList.get(int)>
	//   41   82:checkcast       #30  <Class TabLayout$Tab>
	//   42   85:iload_3         
	//   43   86:invokevirtual   #605 <Method void TabLayout$Tab.setPosition(int)>

	//   44   89:iload_3         
	//   45   90:iconst_1        
	//   46   91:iadd            
	//   47   92:istore_3        
	//*  48   93:goto            68
		if(j == i)
	//*  49   96:iload_2         
	//*  50   97:iload_1         
	//*  51   98:icmpne          142
		{
			Tab tab1;
			if(tabs.isEmpty())
	//*  52  101:aload_0         
	//*  53  102:getfield        #171 <Field ArrayList tabs>
	//*  54  105:invokevirtual   #812 <Method boolean ArrayList.isEmpty()>
	//*  55  108:ifeq            117
				tab1 = null;
	//   56  111:aconst_null     
	//   57  112:astore          5
			else
	//*  58  114:goto            136
				tab1 = (Tab)tabs.get(Math.max(0, i - 1));
	//   59  117:aload_0         
	//   60  118:getfield        #171 <Field ArrayList tabs>
	//   61  121:iconst_0        
	//   62  122:iload_1         
	//   63  123:iconst_1        
	//   64  124:isub            
	//   65  125:invokestatic    #568 <Method int Math.max(int, int)>
	//   66  128:invokevirtual   #616 <Method Object ArrayList.get(int)>
	//   67  131:checkcast       #30  <Class TabLayout$Tab>
	//   68  134:astore          5
			selectTab(tab1);
	//   69  136:aload_0         
	//   70  137:aload           5
	//   71  139:invokevirtual   #988 <Method void selectTab(TabLayout$Tab)>
		}
	//   72  142:return          
	}

	void selectTab(Tab tab)
	{
		selectTab(tab, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #1022 <Method void selectTab(TabLayout$Tab, boolean)>
	//    4    6:return          
	}

	void selectTab(Tab tab, boolean flag)
	{
		Tab tab1 = selectedTab;
	//    0    0:aload_0         
	//    1    1:getfield        #867 <Field TabLayout$Tab selectedTab>
	//    2    4:astore          4
		if(tab1 == tab)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpne       31
		{
			if(tab1 != null)
	//*   6   12:aload           4
	//*   7   14:ifnull          118
			{
				dispatchTabReselected(tab);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #1024 <Method void dispatchTabReselected(TabLayout$Tab)>
				animateToTab(tab.getPosition());
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #504 <Method int TabLayout$Tab.getPosition()>
	//   14   27:invokespecial   #1026 <Method void animateToTab(int)>
				return;
	//   15   30:return          
			}
		} else
		{
			int i;
			if(tab != null)
	//*  16   31:aload_1         
	//*  17   32:ifnull          43
				i = tab.getPosition();
	//   18   35:aload_1         
	//   19   36:invokevirtual   #504 <Method int TabLayout$Tab.getPosition()>
	//   20   39:istore_3        
			else
	//*  21   40:goto            45
				i = -1;
	//   22   43:iconst_m1       
	//   23   44:istore_3        
			if(flag)
	//*  24   45:iload_2         
	//*  25   46:ifeq            93
			{
				if((tab1 == null || tab1.getPosition() == -1) && i != -1)
	//*  26   49:aload           4
	//*  27   51:ifnull          63
	//*  28   54:aload           4
	//*  29   56:invokevirtual   #504 <Method int TabLayout$Tab.getPosition()>
	//*  30   59:iconst_m1       
	//*  31   60:icmpne          78
	//*  32   63:iload_3         
	//*  33   64:iconst_m1       
	//*  34   65:icmpeq          78
					setScrollPosition(i, 0.0F, true);
	//   35   68:aload_0         
	//   36   69:iload_3         
	//   37   70:fconst_0        
	//   38   71:iconst_1        
	//   39   72:invokevirtual   #563 <Method void setScrollPosition(int, float, boolean)>
				else
	//*  40   75:goto            83
					animateToTab(i);
	//   41   78:aload_0         
	//   42   79:iload_3         
	//   43   80:invokespecial   #1026 <Method void animateToTab(int)>
				if(i != -1)
	//*  44   83:iload_3         
	//*  45   84:iconst_m1       
	//*  46   85:icmpeq          93
					setSelectedTabView(i);
	//   47   88:aload_0         
	//   48   89:iload_3         
	//   49   90:invokespecial   #1028 <Method void setSelectedTabView(int)>
			}
			selectedTab = tab;
	//   50   93:aload_0         
	//   51   94:aload_1         
	//   52   95:putfield        #867 <Field TabLayout$Tab selectedTab>
			if(tab1 != null)
	//*  53   98:aload           4
	//*  54  100:ifnull          109
				dispatchTabUnselected(tab1);
	//   55  103:aload_0         
	//   56  104:aload           4
	//   57  106:invokespecial   #1030 <Method void dispatchTabUnselected(TabLayout$Tab)>
			if(tab != null)
	//*  58  109:aload_1         
	//*  59  110:ifnull          118
				dispatchTabSelected(tab);
	//   60  113:aload_0         
	//   61  114:aload_1         
	//   62  115:invokespecial   #1032 <Method void dispatchTabSelected(TabLayout$Tab)>
		}
	//   63  118:return          
	}

	public void setInlineLabel(boolean flag)
	{
		if(inlineLabel != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #416 <Field boolean inlineLabel>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          60
		{
			inlineLabel = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #416 <Field boolean inlineLabel>
			for(int i = 0; i < slidingTabIndicator.getChildCount(); i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:aload_0         
	//*  11   17:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//*  12   20:invokevirtual   #586 <Method int TabLayout$SlidingTabIndicator.getChildCount()>
	//*  13   23:icmpge          56
			{
				View view = slidingTabIndicator.getChildAt(i);
	//   14   26:aload_0         
	//   15   27:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   16   30:iload_2         
	//   17   31:invokevirtual   #583 <Method View TabLayout$SlidingTabIndicator.getChildAt(int)>
	//   18   34:astore_3        
				if(view instanceof TabView)
	//*  19   35:aload_3         
	//*  20   36:instanceof      #42  <Class TabLayout$TabView>
	//*  21   39:ifeq            49
					((TabView)view).updateOrientation();
	//   22   42:aload_3         
	//   23   43:checkcast       #42  <Class TabLayout$TabView>
	//   24   46:invokevirtual   #1036 <Method void TabLayout$TabView.updateOrientation()>
			}

	//   25   49:iload_2         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_2        
	//*  29   53:goto            15
			applyModeAndGravity();
	//   30   56:aload_0         
	//   31   57:invokespecial   #445 <Method void applyModeAndGravity()>
		}
	//   32   60:return          
	}

	public void setInlineLabelResource(int i)
	{
		setInlineLabel(getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #425 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #1040 <Method boolean Resources.getBoolean(int)>
	//    5    9:invokevirtual   #1042 <Method void setInlineLabel(boolean)>
	//    6   12:return          
	}

	public void setOnTabSelectedListener(BaseOnTabSelectedListener baseontabselectedlistener)
	{
		BaseOnTabSelectedListener baseontabselectedlistener1 = selectedListener;
	//    0    0:aload_0         
	//    1    1:getfield        #1046 <Field TabLayout$BaseOnTabSelectedListener selectedListener>
	//    2    4:astore_2        
		if(baseontabselectedlistener1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			removeOnTabSelectedListener(baseontabselectedlistener1);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #764 <Method void removeOnTabSelectedListener(TabLayout$BaseOnTabSelectedListener)>
		selectedListener = baseontabselectedlistener;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #1046 <Field TabLayout$BaseOnTabSelectedListener selectedListener>
		if(baseontabselectedlistener != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          28
			addOnTabSelectedListener(baseontabselectedlistener);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #775 <Method void addOnTabSelectedListener(TabLayout$BaseOnTabSelectedListener)>
	//   16   28:return          
	}

	void setPagerAdapter(PagerAdapter pageradapter, boolean flag)
	{
		PagerAdapter pageradapter1 = pagerAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #972 <Field PagerAdapter pagerAdapter>
	//    2    4:astore_3        
		if(pageradapter1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          26
		{
			DataSetObserver datasetobserver = pagerAdapterObserver;
	//    5    9:aload_0         
	//    6   10:getfield        #1049 <Field DataSetObserver pagerAdapterObserver>
	//    7   13:astore          4
			if(datasetobserver != null)
	//*   8   15:aload           4
	//*   9   17:ifnull          26
				pageradapter1.unregisterDataSetObserver(datasetobserver);
	//   10   20:aload_3         
	//   11   21:aload           4
	//   12   23:invokevirtual   #1053 <Method void PagerAdapter.unregisterDataSetObserver(DataSetObserver)>
		}
		pagerAdapter = pageradapter;
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:putfield        #972 <Field PagerAdapter pagerAdapter>
		if(flag && pageradapter != null)
	//*  16   31:iload_2         
	//*  17   32:ifeq            66
	//*  18   35:aload_1         
	//*  19   36:ifnull          66
		{
			if(pagerAdapterObserver == null)
	//*  20   39:aload_0         
	//*  21   40:getfield        #1049 <Field DataSetObserver pagerAdapterObserver>
	//*  22   43:ifnonnull       58
				pagerAdapterObserver = ((DataSetObserver) (new PagerAdapterObserver()));
	//   23   46:aload_0         
	//   24   47:new             #20  <Class TabLayout$PagerAdapterObserver>
	//   25   50:dup             
	//   26   51:aload_0         
	//   27   52:invokespecial   #1054 <Method void TabLayout$PagerAdapterObserver(TabLayout)>
	//   28   55:putfield        #1049 <Field DataSetObserver pagerAdapterObserver>
			pageradapter.registerDataSetObserver(pagerAdapterObserver);
	//   29   58:aload_1         
	//   30   59:aload_0         
	//   31   60:getfield        #1049 <Field DataSetObserver pagerAdapterObserver>
	//   32   63:invokevirtual   #1057 <Method void PagerAdapter.registerDataSetObserver(DataSetObserver)>
		}
		populateFromPagerAdapter();
	//   33   66:aload_0         
	//   34   67:invokevirtual   #1059 <Method void populateFromPagerAdapter()>
	//   35   70:return          
	}

	void setScrollAnimatorListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		ensureScrollAnimator();
	//    0    0:aload_0         
	//    1    1:invokespecial   #545 <Method void ensureScrollAnimator()>
		scrollAnimator.addListener(animatorlistener);
	//    2    4:aload_0         
	//    3    5:getfield        #547 <Field ValueAnimator scrollAnimator>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1064 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
	//    6   12:return          
	}

	public void setScrollPosition(int i, float f, boolean flag)
	{
		setScrollPosition(i, f, flag, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:iconst_1        
	//    5    5:invokevirtual   #1067 <Method void setScrollPosition(int, float, boolean, boolean)>
	//    6    8:return          
	}

	void setScrollPosition(int i, float f, boolean flag, boolean flag1)
	{
		int j = Math.round((float)i + f);
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:fload_2         
	//    3    3:fadd            
	//    4    4:invokestatic    #855 <Method int Math.round(float)>
	//    5    7:istore          5
		if(j >= 0)
	//*   6    9:iload           5
	//*   7   11:iflt            89
		{
			if(j >= slidingTabIndicator.getChildCount())
	//*   8   14:iload           5
	//*   9   16:aload_0         
	//*  10   17:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//*  11   20:invokevirtual   #586 <Method int TabLayout$SlidingTabIndicator.getChildCount()>
	//*  12   23:icmplt          27
				return;
	//   13   26:return          
			if(flag1)
	//*  14   27:iload           4
	//*  15   29:ifeq            41
				slidingTabIndicator.setIndicatorPositionFromTabPosition(i, f);
	//   16   32:aload_0         
	//   17   33:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   18   36:iload_1         
	//   19   37:fload_2         
	//   20   38:invokevirtual   #1071 <Method void TabLayout$SlidingTabIndicator.setIndicatorPositionFromTabPosition(int, float)>
			ValueAnimator valueanimator = scrollAnimator;
	//   21   41:aload_0         
	//   22   42:getfield        #547 <Field ValueAnimator scrollAnimator>
	//   23   45:astore          6
			if(valueanimator != null && valueanimator.isRunning())
	//*  24   47:aload           6
	//*  25   49:ifnull          67
	//*  26   52:aload           6
	//*  27   54:invokevirtual   #1074 <Method boolean ValueAnimator.isRunning()>
	//*  28   57:ifeq            67
				scrollAnimator.cancel();
	//   29   60:aload_0         
	//   30   61:getfield        #547 <Field ValueAnimator scrollAnimator>
	//   31   64:invokevirtual   #1077 <Method void ValueAnimator.cancel()>
			scrollTo(calculateScrollXForTab(i, f), 0);
	//   32   67:aload_0         
	//   33   68:aload_0         
	//   34   69:iload_1         
	//   35   70:fload_2         
	//   36   71:invokespecial   #542 <Method int calculateScrollXForTab(int, float)>
	//   37   74:iconst_0        
	//   38   75:invokevirtual   #1080 <Method void scrollTo(int, int)>
			if(flag)
	//*  39   78:iload_3         
	//*  40   79:ifeq            88
				setSelectedTabView(j);
	//   41   82:aload_0         
	//   42   83:iload           5
	//   43   85:invokespecial   #1028 <Method void setSelectedTabView(int)>
			return;
	//   44   88:return          
		} else
		{
			return;
	//   45   89:return          
		}
	}

	public void setSelectedTabIndicator(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            17
		{
			setSelectedTabIndicator(AppCompatResources.getDrawable(getContext(), i));
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #645 <Method Context getContext()>
	//    5    9:iload_1         
	//    6   10:invokestatic    #1086 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    7   13:invokevirtual   #258 <Method void setSelectedTabIndicator(Drawable)>
			return;
	//    8   16:return          
		} else
		{
			setSelectedTabIndicator(((Drawable) (null)));
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #258 <Method void setSelectedTabIndicator(Drawable)>
			return;
	//   12   22:return          
		}
	}

	public void setSelectedTabIndicator(Drawable drawable)
	{
		if(tabSelectedIndicator != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #883 <Field Drawable tabSelectedIndicator>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       20
		{
			tabSelectedIndicator = drawable;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #883 <Field Drawable tabSelectedIndicator>
			ViewCompat.postInvalidateOnAnimation(((View) (slidingTabIndicator)));
	//    7   13:aload_0         
	//    8   14:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    9   17:invokestatic    #1089 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   10   20:return          
	}

	public void setSelectedTabIndicatorColor(int i)
	{
		slidingTabIndicator.setSelectedIndicatorColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #245 <Method void TabLayout$SlidingTabIndicator.setSelectedIndicatorColor(int)>
	//    4    8:return          
	}

	public void setSelectedTabIndicatorGravity(int i)
	{
		if(tabIndicatorGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #877 <Field int tabIndicatorGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          20
		{
			tabIndicatorGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #877 <Field int tabIndicatorGravity>
			ViewCompat.postInvalidateOnAnimation(((View) (slidingTabIndicator)));
	//    7   13:aload_0         
	//    8   14:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    9   17:invokestatic    #1089 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   10   20:return          
	}

	public void setSelectedTabIndicatorHeight(int i)
	{
		slidingTabIndicator.setSelectedIndicatorHeight(i);
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #236 <Method void TabLayout$SlidingTabIndicator.setSelectedIndicatorHeight(int)>
	//    4    8:return          
	}

	public void setTabGravity(int i)
	{
		if(tabGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #411 <Field int tabGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			tabGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #411 <Field int tabGravity>
			applyModeAndGravity();
	//    7   13:aload_0         
	//    8   14:invokespecial   #445 <Method void applyModeAndGravity()>
		}
	//    9   17:return          
	}

	public void setTabIconTint(ColorStateList colorstatelist)
	{
		if(tabIconTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #360 <Field ColorStateList tabIconTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			tabIconTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #360 <Field ColorStateList tabIconTint>
			updateAllTabs();
	//    7   13:aload_0         
	//    8   14:invokespecial   #1097 <Method void updateAllTabs()>
		}
	//    9   17:return          
	}

	public void setTabIconTintResource(int i)
	{
		setTabIconTint(AppCompatResources.getColorStateList(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #645 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1102 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #1104 <Method void setTabIconTint(ColorStateList)>
	//    6   12:return          
	}

	public void setTabIndicatorFullWidth(boolean flag)
	{
		tabIndicatorFullWidth = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #889 <Field boolean tabIndicatorFullWidth>
		ViewCompat.postInvalidateOnAnimation(((View) (slidingTabIndicator)));
	//    3    5:aload_0         
	//    4    6:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    5    9:invokestatic    #1089 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//    6   12:return          
	}

	public void setTabMode(int i)
	{
		if(i != mode)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #406 <Field int mode>
	//*   3    5:icmpeq          17
		{
			mode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #406 <Field int mode>
			applyModeAndGravity();
	//    7   13:aload_0         
	//    8   14:invokespecial   #445 <Method void applyModeAndGravity()>
		}
	//    9   17:return          
	}

	public void setTabRippleColor(ColorStateList colorstatelist)
	{
		if(tabRippleColorStateList != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #376 <Field ColorStateList tabRippleColorStateList>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       60
		{
			tabRippleColorStateList = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #376 <Field ColorStateList tabRippleColorStateList>
			for(int i = 0; i < slidingTabIndicator.getChildCount(); i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:aload_0         
	//*  11   17:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//*  12   20:invokevirtual   #586 <Method int TabLayout$SlidingTabIndicator.getChildCount()>
	//*  13   23:icmpge          60
			{
				colorstatelist = ((ColorStateList) (slidingTabIndicator.getChildAt(i)));
	//   14   26:aload_0         
	//   15   27:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   16   30:iload_2         
	//   17   31:invokevirtual   #583 <Method View TabLayout$SlidingTabIndicator.getChildAt(int)>
	//   18   34:astore_1        
				if(colorstatelist instanceof TabView)
	//*  19   35:aload_1         
	//*  20   36:instanceof      #42  <Class TabLayout$TabView>
	//*  21   39:ifeq            53
					((TabView)colorstatelist).updateBackgroundDrawable(getContext());
	//   22   42:aload_1         
	//   23   43:checkcast       #42  <Class TabLayout$TabView>
	//   24   46:aload_0         
	//   25   47:invokevirtual   #645 <Method Context getContext()>
	//   26   50:invokestatic    #1110 <Method void TabLayout$TabView.access$000(TabLayout$TabView, Context)>
			}

	//   27   53:iload_2         
	//   28   54:iconst_1        
	//   29   55:iadd            
	//   30   56:istore_2        
		}
	//*  31   57:goto            15
	//   32   60:return          
	}

	public void setTabRippleColorResource(int i)
	{
		setTabRippleColor(AppCompatResources.getColorStateList(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #645 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #1102 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//    5    9:invokevirtual   #1113 <Method void setTabRippleColor(ColorStateList)>
	//    6   12:return          
	}

	public void setTabTextColors(int i, int j)
	{
		setTabTextColors(createColorStateList(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #355 <Method ColorStateList createColorStateList(int, int)>
	//    4    6:invokevirtual   #1116 <Method void setTabTextColors(ColorStateList)>
	//    5    9:return          
	}

	public void setTabTextColors(ColorStateList colorstatelist)
	{
		if(tabTextColors != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #332 <Field ColorStateList tabTextColors>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			tabTextColors = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #332 <Field ColorStateList tabTextColors>
			updateAllTabs();
	//    7   13:aload_0         
	//    8   14:invokespecial   #1097 <Method void updateAllTabs()>
		}
	//    9   17:return          
	}

	public void setTabsFromPagerAdapter(PagerAdapter pageradapter)
	{
		setPagerAdapter(pageradapter, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #783 <Method void setPagerAdapter(PagerAdapter, boolean)>
	//    4    6:return          
	}

	public void setUnboundedRipple(boolean flag)
	{
		if(unboundedRipple != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #421 <Field boolean unboundedRipple>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          60
		{
			unboundedRipple = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #421 <Field boolean unboundedRipple>
			for(int i = 0; i < slidingTabIndicator.getChildCount(); i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:aload_0         
	//*  11   17:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//*  12   20:invokevirtual   #586 <Method int TabLayout$SlidingTabIndicator.getChildCount()>
	//*  13   23:icmpge          60
			{
				View view = slidingTabIndicator.getChildAt(i);
	//   14   26:aload_0         
	//   15   27:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//   16   30:iload_2         
	//   17   31:invokevirtual   #583 <Method View TabLayout$SlidingTabIndicator.getChildAt(int)>
	//   18   34:astore_3        
				if(view instanceof TabView)
	//*  19   35:aload_3         
	//*  20   36:instanceof      #42  <Class TabLayout$TabView>
	//*  21   39:ifeq            53
					((TabView)view).updateBackgroundDrawable(getContext());
	//   22   42:aload_3         
	//   23   43:checkcast       #42  <Class TabLayout$TabView>
	//   24   46:aload_0         
	//   25   47:invokevirtual   #645 <Method Context getContext()>
	//   26   50:invokestatic    #1110 <Method void TabLayout$TabView.access$000(TabLayout$TabView, Context)>
			}

	//   27   53:iload_2         
	//   28   54:iconst_1        
	//   29   55:iadd            
	//   30   56:istore_2        
		}
	//*  31   57:goto            15
	//   32   60:return          
	}

	public void setUnboundedRippleResource(int i)
	{
		setUnboundedRipple(getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #425 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #1040 <Method boolean Resources.getBoolean(int)>
	//    5    9:invokevirtual   #1122 <Method void setUnboundedRipple(boolean)>
	//    6   12:return          
	}

	public void setupWithViewPager(ViewPager viewpager)
	{
		setupWithViewPager(viewpager, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #1125 <Method void setupWithViewPager(ViewPager, boolean)>
	//    4    6:return          
	}

	public void setupWithViewPager(ViewPager viewpager, boolean flag)
	{
		setupWithViewPager(viewpager, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #902 <Method void setupWithViewPager(ViewPager, boolean, boolean)>
	//    5    7:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return getTabScrollRange() > 0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #1128 <Method int getTabScrollRange()>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	void updateTabViews(boolean flag)
	{
		for(int i = 0; i < slidingTabIndicator.getChildCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//*   5    7:invokevirtual   #586 <Method int TabLayout$SlidingTabIndicator.getChildCount()>
	//*   6   10:icmpge          56
		{
			View view = slidingTabIndicator.getChildAt(i);
	//    7   13:aload_0         
	//    8   14:getfield        #195 <Field TabLayout$SlidingTabIndicator slidingTabIndicator>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #583 <Method View TabLayout$SlidingTabIndicator.getChildAt(int)>
	//   11   21:astore_3        
			view.setMinimumWidth(getTabMinWidth());
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:invokespecial   #655 <Method int getTabMinWidth()>
	//   15   27:invokevirtual   #1129 <Method void View.setMinimumWidth(int)>
			updateTabViewLayoutParams((android.widget.LinearLayout.LayoutParams)view.getLayoutParams());
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #954 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   35:checkcast       #628 <Class android.widget.LinearLayout$LayoutParams>
	//   20   38:invokespecial   #633 <Method void updateTabViewLayoutParams(android.widget.LinearLayout$LayoutParams)>
			if(flag)
	//*  21   41:iload_1         
	//*  22   42:ifeq            49
				view.requestLayout();
	//   23   45:aload_3         
	//   24   46:invokevirtual   #1130 <Method void View.requestLayout()>
		}

	//   25   49:iload_2         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:istore_2        
	//*  29   53:goto            2
	//   30   56:return          
	}

	private static final int ANIMATION_DURATION = 300;
	static final int DEFAULT_GAP_TEXT_ICON = 8;
	private static final int DEFAULT_HEIGHT = 48;
	private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
	static final int FIXED_WRAP_GUTTER_MIN = 16;
	public static final int GRAVITY_CENTER = 1;
	public static final int GRAVITY_FILL = 0;
	public static final int INDICATOR_GRAVITY_BOTTOM = 0;
	public static final int INDICATOR_GRAVITY_CENTER = 1;
	public static final int INDICATOR_GRAVITY_STRETCH = 3;
	public static final int INDICATOR_GRAVITY_TOP = 2;
	private static final int INVALID_WIDTH = -1;
	private static final int MIN_INDICATOR_WIDTH = 24;
	public static final int MODE_FIXED = 1;
	public static final int MODE_SCROLLABLE = 0;
	private static final int TAB_MIN_WIDTH_MARGIN = 56;
	private static final android.support.v4.util.Pools.Pool tabPool = new android.support.v4.util.Pools.SynchronizedPool(16);
	private AdapterChangeListener adapterChangeListener;
	private int contentInsetStart;
	private BaseOnTabSelectedListener currentVpSelectedListener;
	boolean inlineLabel;
	int mode;
	private TabLayoutOnPageChangeListener pageChangeListener;
	private PagerAdapter pagerAdapter;
	private DataSetObserver pagerAdapterObserver;
	private final int requestedTabMaxWidth;
	private final int requestedTabMinWidth;
	private ValueAnimator scrollAnimator;
	private final int scrollableTabMinWidth;
	private BaseOnTabSelectedListener selectedListener;
	private final ArrayList selectedListeners;
	private Tab selectedTab;
	private boolean setupViewPagerImplicitly;
	private final SlidingTabIndicator slidingTabIndicator;
	final int tabBackgroundResId;
	int tabGravity;
	ColorStateList tabIconTint;
	android.graphics.PorterDuff.Mode tabIconTintMode;
	int tabIndicatorAnimationDuration;
	boolean tabIndicatorFullWidth;
	int tabIndicatorGravity;
	int tabMaxWidth;
	int tabPaddingBottom;
	int tabPaddingEnd;
	int tabPaddingStart;
	int tabPaddingTop;
	ColorStateList tabRippleColorStateList;
	Drawable tabSelectedIndicator;
	int tabTextAppearance;
	ColorStateList tabTextColors;
	float tabTextMultiLineSize;
	float tabTextSize;
	private final RectF tabViewContentBounds;
	private final android.support.v4.util.Pools.Pool tabViewPool;
	private final ArrayList tabs;
	boolean unboundedRipple;
	ViewPager viewPager;

	static 
	{
	//    0    0:new             #145 <Class android.support.v4.util.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #149 <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//    4    9:putstatic       #151 <Field android.support.v4.util.Pools$Pool tabPool>
	//*   5   12:return          
	}


/*
	static RectF access$400(TabLayout tablayout)
	{
		return tablayout.tabViewContentBounds;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field RectF tabViewContentBounds>
	//    2    4:areturn         
	}

*/
}
