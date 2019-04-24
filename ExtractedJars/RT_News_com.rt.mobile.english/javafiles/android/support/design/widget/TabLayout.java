// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.content.res.*;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
//			ThemeUtils, TabItem, AnimationUtils

public class TabLayout extends HorizontalScrollView
{
	private class AdapterChangeListener
		implements android.support.v4.view.ViewPager.OnAdapterChangeListener
	{

		public void onAdapterChanged(ViewPager viewpager, PagerAdapter pageradapter, PagerAdapter pageradapter1)
		{
			if(mViewPager == viewpager)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field TabLayout this$0>
		//*   2    4:getfield        #29  <Field ViewPager TabLayout.mViewPager>
		//*   3    7:aload_1         
		//*   4    8:if_acmpne       23
				setPagerAdapter(pageradapter1, mAutoRefresh);
		//    5   11:aload_0         
		//    6   12:getfield        #17  <Field TabLayout this$0>
		//    7   15:aload_3         
		//    8   16:aload_0         
		//    9   17:getfield        #31  <Field boolean mAutoRefresh>
		//   10   20:invokevirtual   #35  <Method void TabLayout.setPagerAdapter(PagerAdapter, boolean)>
		//   11   23:return          
		}

		void setAutoRefresh(boolean flag)
		{
			mAutoRefresh = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #31  <Field boolean mAutoRefresh>
		//    3    5:return          
		}

		private boolean mAutoRefresh;
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

	public static interface Mode
		extends Annotation
	{
	}

	public static interface OnTabSelectedListener
	{

		public abstract void onTabReselected(Tab tab);

		public abstract void onTabSelected(Tab tab);

		public abstract void onTabUnselected(Tab tab);
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

	private class SlidingTabStrip extends LinearLayout
	{

		private void updateIndicatorPosition()
		{
			View view = getChildAt(mSelectedPosition);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #34  <Field int mSelectedPosition>
		//    3    5:invokevirtual   #57  <Method View getChildAt(int)>
		//    4    8:astore          5
			int i;
			int j;
			if(view != null && view.getWidth() > 0)
		//*   5   10:aload           5
		//*   6   12:ifnull          130
		//*   7   15:aload           5
		//*   8   17:invokevirtual   #63  <Method int View.getWidth()>
		//*   9   20:ifle            130
			{
				int l = view.getLeft();
		//   10   23:aload           5
		//   11   25:invokevirtual   #66  <Method int View.getLeft()>
		//   12   28:istore          4
				int k = view.getRight();
		//   13   30:aload           5
		//   14   32:invokevirtual   #69  <Method int View.getRight()>
		//   15   35:istore_3        
				i = k;
		//   16   36:iload_3         
		//   17   37:istore_1        
				j = l;
		//   18   38:iload           4
		//   19   40:istore_2        
				if(mSelectionOffset > 0.0F)
		//*  20   41:aload_0         
		//*  21   42:getfield        #71  <Field float mSelectionOffset>
		//*  22   45:fconst_0        
		//*  23   46:fcmpl           
		//*  24   47:ifle            134
				{
					i = k;
		//   25   50:iload_3         
		//   26   51:istore_1        
					j = l;
		//   27   52:iload           4
		//   28   54:istore_2        
					if(mSelectedPosition < getChildCount() - 1)
		//*  29   55:aload_0         
		//*  30   56:getfield        #34  <Field int mSelectedPosition>
		//*  31   59:aload_0         
		//*  32   60:invokevirtual   #74  <Method int getChildCount()>
		//*  33   63:iconst_1        
		//*  34   64:isub            
		//*  35   65:icmpge          134
					{
						View view1 = getChildAt(mSelectedPosition + 1);
		//   36   68:aload_0         
		//   37   69:aload_0         
		//   38   70:getfield        #34  <Field int mSelectedPosition>
		//   39   73:iconst_1        
		//   40   74:iadd            
		//   41   75:invokevirtual   #57  <Method View getChildAt(int)>
		//   42   78:astore          5
						j = (int)(mSelectionOffset * (float)view1.getLeft() + (1.0F - mSelectionOffset) * (float)l);
		//   43   80:aload_0         
		//   44   81:getfield        #71  <Field float mSelectionOffset>
		//   45   84:aload           5
		//   46   86:invokevirtual   #66  <Method int View.getLeft()>
		//   47   89:i2f             
		//   48   90:fmul            
		//   49   91:fconst_1        
		//   50   92:aload_0         
		//   51   93:getfield        #71  <Field float mSelectionOffset>
		//   52   96:fsub            
		//   53   97:iload           4
		//   54   99:i2f             
		//   55  100:fmul            
		//   56  101:fadd            
		//   57  102:f2i             
		//   58  103:istore_2        
						i = (int)(mSelectionOffset * (float)view1.getRight() + (1.0F - mSelectionOffset) * (float)k);
		//   59  104:aload_0         
		//   60  105:getfield        #71  <Field float mSelectionOffset>
		//   61  108:aload           5
		//   62  110:invokevirtual   #69  <Method int View.getRight()>
		//   63  113:i2f             
		//   64  114:fmul            
		//   65  115:fconst_1        
		//   66  116:aload_0         
		//   67  117:getfield        #71  <Field float mSelectionOffset>
		//   68  120:fsub            
		//   69  121:iload_3         
		//   70  122:i2f             
		//   71  123:fmul            
		//   72  124:fadd            
		//   73  125:f2i             
		//   74  126:istore_1        
					}
				}
			} else
		//*  75  127:goto            134
			{
				j = -1;
		//   76  130:iconst_m1       
		//   77  131:istore_2        
				i = -1;
		//   78  132:iconst_m1       
		//   79  133:istore_1        
			}
			setIndicatorPosition(j, i);
		//   80  134:aload_0         
		//   81  135:iload_2         
		//   82  136:iload_1         
		//   83  137:invokevirtual   #78  <Method void setIndicatorPosition(int, int)>
		//   84  140:return          
		}

		void animateIndicatorToPosition(int i, int j)
		{
			if(mIndicatorAnimator != null && mIndicatorAnimator.isRunning())
		//*   0    0:aload_0         
		//*   1    1:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//*   2    4:ifnull          24
		//*   3    7:aload_0         
		//*   4    8:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//*   5   11:invokevirtual   #87  <Method boolean ValueAnimator.isRunning()>
		//*   6   14:ifeq            24
				mIndicatorAnimator.cancel();
		//    7   17:aload_0         
		//    8   18:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//    9   21:invokevirtual   #90  <Method void ValueAnimator.cancel()>
			final int startLeft;
			if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
		//*  10   24:aload_0         
		//*  11   25:invokestatic    #96  <Method int ViewCompat.getLayoutDirection(View)>
		//*  12   28:iconst_1        
		//*  13   29:icmpne          37
				startLeft = 1;
		//   14   32:iconst_1        
		//   15   33:istore_3        
			else
		//*  16   34:goto            39
				startLeft = 0;
		//   17   37:iconst_0        
		//   18   38:istore_3        
			View view = getChildAt(i);
		//   19   39:aload_0         
		//   20   40:iload_1         
		//   21   41:invokevirtual   #57  <Method View getChildAt(int)>
		//   22   44:astore          7
			if(view == null)
		//*  23   46:aload           7
		//*  24   48:ifnonnull       56
			{
				updateIndicatorPosition();
		//   25   51:aload_0         
		//   26   52:invokespecial   #98  <Method void updateIndicatorPosition()>
				return;
		//   27   55:return          
			}
			final int targetLeft = view.getLeft();
		//   28   56:aload           7
		//   29   58:invokevirtual   #66  <Method int View.getLeft()>
		//   30   61:istore          5
			int k = view.getRight();
		//   31   63:aload           7
		//   32   65:invokevirtual   #69  <Method int View.getRight()>
		//   33   68:istore          6
			final int startRight;
			if(Math.abs(i - mSelectedPosition) <= 1)
		//*  34   70:iload_1         
		//*  35   71:aload_0         
		//*  36   72:getfield        #34  <Field int mSelectedPosition>
		//*  37   75:isub            
		//*  38   76:invokestatic    #104 <Method int Math.abs(int)>
		//*  39   79:iconst_1        
		//*  40   80:icmpgt          97
			{
				startLeft = mIndicatorLeft;
		//   41   83:aload_0         
		//   42   84:getfield        #38  <Field int mIndicatorLeft>
		//   43   87:istore_3        
				startRight = mIndicatorRight;
		//   44   88:aload_0         
		//   45   89:getfield        #40  <Field int mIndicatorRight>
		//   46   92:istore          4
			} else
		//*  47   94:goto            163
			{
				startRight = dpToPx(24);
		//   48   97:aload_0         
		//   49   98:getfield        #29  <Field TabLayout this$0>
		//   50  101:bipush          24
		//   51  103:invokevirtual   #107 <Method int TabLayout.dpToPx(int)>
		//   52  106:istore          4
				if(i < mSelectedPosition)
		//*  53  108:iload_1         
		//*  54  109:aload_0         
		//*  55  110:getfield        #34  <Field int mSelectedPosition>
		//*  56  113:icmpge          141
				{
					if(startLeft != 0)
		//*  57  116:iload_3         
		//*  58  117:ifeq            132
						startLeft = targetLeft - startRight;
		//   59  120:iload           5
		//   60  122:iload           4
		//   61  124:isub            
		//   62  125:istore_3        
					else
		//*  63  126:iload_3         
		//*  64  127:istore          4
		//*  65  129:goto            163
						startLeft = startRight + k;
		//   66  132:iload           4
		//   67  134:iload           6
		//   68  136:iadd            
		//   69  137:istore_3        
				} else
		//*  70  138:goto            126
				if(startLeft != 0)
		//*  71  141:iload_3         
		//*  72  142:ifeq            154
					startLeft = startRight + k;
		//   73  145:iload           4
		//   74  147:iload           6
		//   75  149:iadd            
		//   76  150:istore_3        
				else
		//*  77  151:goto            138
					startLeft = targetLeft - startRight;
		//   78  154:iload           5
		//   79  156:iload           4
		//   80  158:isub            
		//   81  159:istore_3        
				startRight = startLeft;
			}
		//*  82  160:goto            126
			if(startLeft != targetLeft || startRight != k)
		//*  83  163:iload_3         
		//*  84  164:iload           5
		//*  85  166:icmpne          176
		//*  86  169:iload           4
		//*  87  171:iload           6
		//*  88  173:icmpeq          262
			{
				ValueAnimator valueanimator = new ValueAnimator();
		//   89  176:new             #83  <Class ValueAnimator>
		//   90  179:dup             
		//   91  180:invokespecial   #108 <Method void ValueAnimator()>
		//   92  183:astore          7
				mIndicatorAnimator = valueanimator;
		//   93  185:aload_0         
		//   94  186:aload           7
		//   95  188:putfield        #81  <Field ValueAnimator mIndicatorAnimator>
				valueanimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
		//   96  191:aload           7
		//   97  193:getstatic       #114 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
		//   98  196:invokevirtual   #118 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
				valueanimator.setDuration(j);
		//   99  199:aload           7
		//  100  201:iload_2         
		//  101  202:i2l             
		//  102  203:invokevirtual   #122 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//  103  206:pop             
				valueanimator.setFloatValues(new float[] {
					0.0F, 1.0F
				});
		//  104  207:aload           7
		//  105  209:iconst_2        
		//  106  210:newarray        float[]
		//  107  212:dup             
		//  108  213:iconst_0        
		//  109  214:fconst_0        
		//  110  215:fastore         
		//  111  216:dup             
		//  112  217:iconst_1        
		//  113  218:fconst_1        
		//  114  219:fastore         
		//  115  220:invokevirtual   #126 <Method void ValueAnimator.setFloatValues(float[])>
				valueanimator.addUpdateListener(((_cls1) (k)). new android.animation.ValueAnimator.AnimatorUpdateListener() {

					public void onAnimationUpdate(ValueAnimator valueanimator)
					{
						float f = valueanimator.getAnimatedFraction();
					//    0    0:aload_1         
					//    1    1:invokevirtual   #45  <Method float ValueAnimator.getAnimatedFraction()>
					//    2    4:fstore_2        
						setIndicatorPosition(AnimationUtils.lerp(startLeft, targetLeft, f), AnimationUtils.lerp(startRight, targetRight, f));
					//    3    5:aload_0         
					//    4    6:getfield        #25  <Field TabLayout$SlidingTabStrip this$1>
					//    5    9:aload_0         
					//    6   10:getfield        #27  <Field int val$startLeft>
					//    7   13:aload_0         
					//    8   14:getfield        #29  <Field int val$targetLeft>
					//    9   17:fload_2         
					//   10   18:invokestatic    #51  <Method int AnimationUtils.lerp(int, int, float)>
					//   11   21:aload_0         
					//   12   22:getfield        #31  <Field int val$startRight>
					//   13   25:aload_0         
					//   14   26:getfield        #33  <Field int val$targetRight>
					//   15   29:fload_2         
					//   16   30:invokestatic    #51  <Method int AnimationUtils.lerp(int, int, float)>
					//   17   33:invokevirtual   #54  <Method void TabLayout$SlidingTabStrip.setIndicatorPosition(int, int)>
					//   18   36:return          
					}

					final SlidingTabStrip this$1;
					final int val$startLeft;
					final int val$startRight;
					final int val$targetLeft;
					final int val$targetRight;

			
			{
				this$1 = final_slidingtabstrip;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field TabLayout$SlidingTabStrip this$1>
				startLeft = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #27  <Field int val$startLeft>
				targetLeft = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #29  <Field int val$targetLeft>
				startRight = k;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #31  <Field int val$startRight>
				targetRight = I.this;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #33  <Field int val$targetRight>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
				}
);
		//  116  223:aload           7
		//  117  225:new             #9   <Class TabLayout$SlidingTabStrip$1>
		//  118  228:dup             
		//  119  229:aload_0         
		//  120  230:iload_3         
		//  121  231:iload           5
		//  122  233:iload           4
		//  123  235:iload           6
		//  124  237:invokespecial   #129 <Method void TabLayout$SlidingTabStrip$1(TabLayout$SlidingTabStrip, int, int, int, int)>
		//  125  240:invokevirtual   #133 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
				valueanimator.addListener(((android.animation.Animator.AnimatorListener) (((_cls2) (i)). new AnimatorListenerAdapter() {

					public void onAnimationEnd(Animator animator)
					{
						mSelectedPosition = position;
					//    0    0:aload_0         
					//    1    1:getfield        #20  <Field TabLayout$SlidingTabStrip this$1>
					//    2    4:aload_0         
					//    3    5:getfield        #22  <Field int val$position>
					//    4    8:putfield        #31  <Field int TabLayout$SlidingTabStrip.mSelectedPosition>
						mSelectionOffset = 0.0F;
					//    5   11:aload_0         
					//    6   12:getfield        #20  <Field TabLayout$SlidingTabStrip this$1>
					//    7   15:fconst_0        
					//    8   16:putfield        #35  <Field float TabLayout$SlidingTabStrip.mSelectionOffset>
					//    9   19:return          
					}

					final SlidingTabStrip this$1;
					final int val$position;

			
			{
				this$1 = final_slidingtabstrip;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field TabLayout$SlidingTabStrip this$1>
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
		//  126  243:aload           7
		//  127  245:new             #11  <Class TabLayout$SlidingTabStrip$2>
		//  128  248:dup             
		//  129  249:aload_0         
		//  130  250:iload_1         
		//  131  251:invokespecial   #136 <Method void TabLayout$SlidingTabStrip$2(TabLayout$SlidingTabStrip, int)>
		//  132  254:invokevirtual   #140 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
				valueanimator.start();
		//  133  257:aload           7
		//  134  259:invokevirtual   #143 <Method void ValueAnimator.start()>
			}
		//  135  262:return          
		}

		boolean childrenNeedLayout()
		{
			int j = getChildCount();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #74  <Method int getChildCount()>
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
		//*  10   14:invokevirtual   #57  <Method View getChildAt(int)>
		//*  11   17:invokevirtual   #63  <Method int View.getWidth()>
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
			super.draw(canvas);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #148 <Method void LinearLayout.draw(Canvas)>
			if(mIndicatorLeft >= 0 && mIndicatorRight > mIndicatorLeft)
		//*   3    5:aload_0         
		//*   4    6:getfield        #38  <Field int mIndicatorLeft>
		//*   5    9:iflt            56
		//*   6   12:aload_0         
		//*   7   13:getfield        #40  <Field int mIndicatorRight>
		//*   8   16:aload_0         
		//*   9   17:getfield        #38  <Field int mIndicatorLeft>
		//*  10   20:icmple          56
				canvas.drawRect(mIndicatorLeft, getHeight() - mSelectedIndicatorHeight, mIndicatorRight, getHeight(), mSelectedIndicatorPaint);
		//   11   23:aload_1         
		//   12   24:aload_0         
		//   13   25:getfield        #38  <Field int mIndicatorLeft>
		//   14   28:i2f             
		//   15   29:aload_0         
		//   16   30:invokevirtual   #151 <Method int getHeight()>
		//   17   33:aload_0         
		//   18   34:getfield        #153 <Field int mSelectedIndicatorHeight>
		//   19   37:isub            
		//   20   38:i2f             
		//   21   39:aload_0         
		//   22   40:getfield        #40  <Field int mIndicatorRight>
		//   23   43:i2f             
		//   24   44:aload_0         
		//   25   45:invokevirtual   #151 <Method int getHeight()>
		//   26   48:i2f             
		//   27   49:aload_0         
		//   28   50:getfield        #51  <Field Paint mSelectedIndicatorPaint>
		//   29   53:invokevirtual   #159 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		//   30   56:return          
		}

		float getIndicatorPosition()
		{
			return (float)mSelectedPosition + mSelectionOffset;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field int mSelectedPosition>
		//    2    4:i2f             
		//    3    5:aload_0         
		//    4    6:getfield        #71  <Field float mSelectionOffset>
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
		//    6    8:invokespecial   #165 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
			if(mIndicatorAnimator != null && mIndicatorAnimator.isRunning())
		//*   7   11:aload_0         
		//*   8   12:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//*   9   15:ifnull          69
		//*  10   18:aload_0         
		//*  11   19:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//*  12   22:invokevirtual   #87  <Method boolean ValueAnimator.isRunning()>
		//*  13   25:ifeq            69
			{
				mIndicatorAnimator.cancel();
		//   14   28:aload_0         
		//   15   29:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//   16   32:invokevirtual   #90  <Method void ValueAnimator.cancel()>
				long l1 = mIndicatorAnimator.getDuration();
		//   17   35:aload_0         
		//   18   36:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//   19   39:invokevirtual   #169 <Method long ValueAnimator.getDuration()>
		//   20   42:lstore          6
				animateIndicatorToPosition(mSelectedPosition, Math.round((1.0F - mIndicatorAnimator.getAnimatedFraction()) * (float)l1));
		//   21   44:aload_0         
		//   22   45:aload_0         
		//   23   46:getfield        #34  <Field int mSelectedPosition>
		//   24   49:fconst_1        
		//   25   50:aload_0         
		//   26   51:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//   27   54:invokevirtual   #172 <Method float ValueAnimator.getAnimatedFraction()>
		//   28   57:fsub            
		//   29   58:lload           6
		//   30   60:l2f             
		//   31   61:fmul            
		//   32   62:invokestatic    #176 <Method int Math.round(float)>
		//   33   65:invokevirtual   #178 <Method void animateIndicatorToPosition(int, int)>
				return;
		//   34   68:return          
			} else
			{
				updateIndicatorPosition();
		//   35   69:aload_0         
		//   36   70:invokespecial   #98  <Method void updateIndicatorPosition()>
				return;
		//   37   73:return          
			}
		}

		protected void onMeasure(int i, int j)
		{
			super.onMeasure(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #181 <Method void LinearLayout.onMeasure(int, int)>
			if(android.view.View.MeasureSpec.getMode(i) != 0x40000000)
		//*   4    6:iload_1         
		//*   5    7:invokestatic    #186 <Method int android.view.View$MeasureSpec.getMode(int)>
		//*   6   10:ldc1            #187 <Int 0x40000000>
		//*   7   12:icmpeq          16
				return;
		//    8   15:return          
			int k = mMode;
		//    9   16:aload_0         
		//   10   17:getfield        #29  <Field TabLayout this$0>
		//   11   20:getfield        #190 <Field int TabLayout.mMode>
		//   12   23:istore_3        
			boolean flag2 = true;
		//   13   24:iconst_1        
		//   14   25:istore          7
			if(k == 1 && mTabGravity == 1)
		//*  15   27:iload_3         
		//*  16   28:iconst_1        
		//*  17   29:icmpne          240
		//*  18   32:aload_0         
		//*  19   33:getfield        #29  <Field TabLayout this$0>
		//*  20   36:getfield        #193 <Field int TabLayout.mTabGravity>
		//*  21   39:iconst_1        
		//*  22   40:icmpne          240
			{
				int l1 = getChildCount();
		//   23   43:aload_0         
		//   24   44:invokevirtual   #74  <Method int getChildCount()>
		//   25   47:istore          8
				boolean flag1 = false;
		//   26   49:iconst_0        
		//   27   50:istore          6
				int l = 0;
		//   28   52:iconst_0        
		//   29   53:istore_3        
				int i1;
				int j1;
				for(i1 = l; l < l1; i1 = j1)
		//*  30   54:iload_3         
		//*  31   55:istore          4
		//*  32   57:iload_3         
		//*  33   58:iload           8
		//*  34   60:icmpge          105
				{
					View view = getChildAt(l);
		//   35   63:aload_0         
		//   36   64:iload_3         
		//   37   65:invokevirtual   #57  <Method View getChildAt(int)>
		//   38   68:astore          9
					j1 = i1;
		//   39   70:iload           4
		//   40   72:istore          5
					if(view.getVisibility() == 0)
		//*  41   74:aload           9
		//*  42   76:invokevirtual   #196 <Method int View.getVisibility()>
		//*  43   79:ifne            94
						j1 = Math.max(i1, view.getMeasuredWidth());
		//   44   82:iload           4
		//   45   84:aload           9
		//   46   86:invokevirtual   #199 <Method int View.getMeasuredWidth()>
		//   47   89:invokestatic    #203 <Method int Math.max(int, int)>
		//   48   92:istore          5
					l++;
		//   49   94:iload_3         
		//   50   95:iconst_1        
		//   51   96:iadd            
		//   52   97:istore_3        
				}

		//   53   98:iload           5
		//   54  100:istore          4
		//*  55  102:goto            57
				if(i1 <= 0)
		//*  56  105:iload           4
		//*  57  107:ifgt            111
					return;
		//   58  110:return          
				l = dpToPx(16);
		//   59  111:aload_0         
		//   60  112:getfield        #29  <Field TabLayout this$0>
		//   61  115:bipush          16
		//   62  117:invokevirtual   #107 <Method int TabLayout.dpToPx(int)>
		//   63  120:istore_3        
				boolean flag;
				if(i1 * l1 <= getMeasuredWidth() - l * 2)
		//*  64  121:iload           4
		//*  65  123:iload           8
		//*  66  125:imul            
		//*  67  126:aload_0         
		//*  68  127:invokevirtual   #204 <Method int getMeasuredWidth()>
		//*  69  130:iload_3         
		//*  70  131:iconst_2        
		//*  71  132:imul            
		//*  72  133:isub            
		//*  73  134:icmpgt          211
				{
					flag = false;
		//   74  137:iconst_0        
		//   75  138:istore_3        
					for(int k1 = ((int) (flag1)); k1 < l1; k1++)
		//*  76  139:iload           6
		//*  77  141:istore          5
		//*  78  143:iload           5
		//*  79  145:iload           8
		//*  80  147:icmpge          208
					{
						android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)getChildAt(k1).getLayoutParams();
		//   81  150:aload_0         
		//   82  151:iload           5
		//   83  153:invokevirtual   #57  <Method View getChildAt(int)>
		//   84  156:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   85  159:checkcast       #210 <Class android.widget.LinearLayout$LayoutParams>
		//   86  162:astore          9
						if(layoutparams.width != i1 || layoutparams.weight != 0.0F)
		//*  87  164:aload           9
		//*  88  166:getfield        #213 <Field int android.widget.LinearLayout$LayoutParams.width>
		//*  89  169:iload           4
		//*  90  171:icmpne          184
		//*  91  174:aload           9
		//*  92  176:getfield        #216 <Field float android.widget.LinearLayout$LayoutParams.weight>
		//*  93  179:fconst_0        
		//*  94  180:fcmpl           
		//*  95  181:ifeq            199
						{
							layoutparams.width = i1;
		//   96  184:aload           9
		//   97  186:iload           4
		//   98  188:putfield        #213 <Field int android.widget.LinearLayout$LayoutParams.width>
							layoutparams.weight = 0.0F;
		//   99  191:aload           9
		//  100  193:fconst_0        
		//  101  194:putfield        #216 <Field float android.widget.LinearLayout$LayoutParams.weight>
							flag = true;
		//  102  197:iconst_1        
		//  103  198:istore_3        
						}
					}

		//  104  199:iload           5
		//  105  201:iconst_1        
		//  106  202:iadd            
		//  107  203:istore          5
				} else
		//* 108  205:goto            143
		//* 109  208:goto            230
				{
					mTabGravity = 0;
		//  110  211:aload_0         
		//  111  212:getfield        #29  <Field TabLayout this$0>
		//  112  215:iconst_0        
		//  113  216:putfield        #193 <Field int TabLayout.mTabGravity>
					updateTabViews(false);
		//  114  219:aload_0         
		//  115  220:getfield        #29  <Field TabLayout this$0>
		//  116  223:iconst_0        
		//  117  224:invokevirtual   #219 <Method void TabLayout.updateTabViews(boolean)>
					flag = flag2;
		//  118  227:iload           7
		//  119  229:istore_3        
				}
				if(flag)
		//* 120  230:iload_3         
		//* 121  231:ifeq            240
					super.onMeasure(i, j);
		//  122  234:aload_0         
		//  123  235:iload_1         
		//  124  236:iload_2         
		//  125  237:invokespecial   #181 <Method void LinearLayout.onMeasure(int, int)>
			}
		//  126  240:return          
		}

		public void onRtlPropertiesChanged(int i)
		{
			super.onRtlPropertiesChanged(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #223 <Method void LinearLayout.onRtlPropertiesChanged(int)>
			if(android.os.Build.VERSION.SDK_INT < 23 && mLayoutDirection != i)
		//*   3    5:getstatic       #228 <Field int android.os.Build$VERSION.SDK_INT>
		//*   4    8:bipush          23
		//*   5   10:icmpge          30
		//*   6   13:aload_0         
		//*   7   14:getfield        #36  <Field int mLayoutDirection>
		//*   8   17:iload_1         
		//*   9   18:icmpeq          30
			{
				requestLayout();
		//   10   21:aload_0         
		//   11   22:invokevirtual   #231 <Method void requestLayout()>
				mLayoutDirection = i;
		//   12   25:aload_0         
		//   13   26:iload_1         
		//   14   27:putfield        #36  <Field int mLayoutDirection>
			}
		//   15   30:return          
		}

		void setIndicatorPosition(int i, int j)
		{
			if(i != mIndicatorLeft || j != mIndicatorRight)
		//*   0    0:iload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #38  <Field int mIndicatorLeft>
		//*   3    5:icmpne          16
		//*   4    8:iload_2         
		//*   5    9:aload_0         
		//*   6   10:getfield        #40  <Field int mIndicatorRight>
		//*   7   13:icmpeq          30
			{
				mIndicatorLeft = i;
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:putfield        #38  <Field int mIndicatorLeft>
				mIndicatorRight = j;
		//   11   21:aload_0         
		//   12   22:iload_2         
		//   13   23:putfield        #40  <Field int mIndicatorRight>
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
		//   14   26:aload_0         
		//   15   27:invokestatic    #235 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
		//   16   30:return          
		}

		void setIndicatorPositionFromTabPosition(int i, float f)
		{
			if(mIndicatorAnimator != null && mIndicatorAnimator.isRunning())
		//*   0    0:aload_0         
		//*   1    1:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//*   2    4:ifnull          24
		//*   3    7:aload_0         
		//*   4    8:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//*   5   11:invokevirtual   #87  <Method boolean ValueAnimator.isRunning()>
		//*   6   14:ifeq            24
				mIndicatorAnimator.cancel();
		//    7   17:aload_0         
		//    8   18:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//    9   21:invokevirtual   #90  <Method void ValueAnimator.cancel()>
			mSelectedPosition = i;
		//   10   24:aload_0         
		//   11   25:iload_1         
		//   12   26:putfield        #34  <Field int mSelectedPosition>
			mSelectionOffset = f;
		//   13   29:aload_0         
		//   14   30:fload_2         
		//   15   31:putfield        #71  <Field float mSelectionOffset>
			updateIndicatorPosition();
		//   16   34:aload_0         
		//   17   35:invokespecial   #98  <Method void updateIndicatorPosition()>
		//   18   38:return          
		}

		void setSelectedIndicatorColor(int i)
		{
			if(mSelectedIndicatorPaint.getColor() != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #51  <Field Paint mSelectedIndicatorPaint>
		//*   2    4:invokevirtual   #241 <Method int Paint.getColor()>
		//*   3    7:iload_1         
		//*   4    8:icmpeq          23
			{
				mSelectedIndicatorPaint.setColor(i);
		//    5   11:aload_0         
		//    6   12:getfield        #51  <Field Paint mSelectedIndicatorPaint>
		//    7   15:iload_1         
		//    8   16:invokevirtual   #244 <Method void Paint.setColor(int)>
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
		//    9   19:aload_0         
		//   10   20:invokestatic    #235 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
		//   11   23:return          
		}

		void setSelectedIndicatorHeight(int i)
		{
			if(mSelectedIndicatorHeight != i)
		//*   0    0:aload_0         
		//*   1    1:getfield        #153 <Field int mSelectedIndicatorHeight>
		//*   2    4:iload_1         
		//*   3    5:icmpeq          17
			{
				mSelectedIndicatorHeight = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #153 <Field int mSelectedIndicatorHeight>
				ViewCompat.postInvalidateOnAnimation(((View) (this)));
		//    7   13:aload_0         
		//    8   14:invokestatic    #235 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
		//    9   17:return          
		}

		private ValueAnimator mIndicatorAnimator;
		private int mIndicatorLeft;
		private int mIndicatorRight;
		private int mLayoutDirection;
		private int mSelectedIndicatorHeight;
		private final Paint mSelectedIndicatorPaint = new Paint();
		int mSelectedPosition;
		float mSelectionOffset;
		final TabLayout this$0;

		SlidingTabStrip(Context context)
		{
			this$0 = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field TabLayout this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #32  <Method void LinearLayout(Context)>
			mSelectedPosition = -1;
		//    6   10:aload_0         
		//    7   11:iconst_m1       
		//    8   12:putfield        #34  <Field int mSelectedPosition>
			mLayoutDirection = -1;
		//    9   15:aload_0         
		//   10   16:iconst_m1       
		//   11   17:putfield        #36  <Field int mLayoutDirection>
			mIndicatorLeft = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #38  <Field int mIndicatorLeft>
			mIndicatorRight = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #40  <Field int mIndicatorRight>
			setWillNotDraw(false);
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:invokevirtual   #44  <Method void setWillNotDraw(boolean)>
		//   21   35:aload_0         
		//   22   36:new             #46  <Class Paint>
		//   23   39:dup             
		//   24   40:invokespecial   #49  <Method void Paint()>
		//   25   43:putfield        #51  <Field Paint mSelectedIndicatorPaint>
		//   26   46:return          
		}
	}

	public static final class Tab
	{

		public CharSequence getContentDescription()
		{
			return mContentDesc;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field CharSequence mContentDesc>
		//    2    4:areturn         
		}

		public View getCustomView()
		{
			return mCustomView;
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field View mCustomView>
		//    2    4:areturn         
		}

		public Drawable getIcon()
		{
			return mIcon;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Drawable mIcon>
		//    2    4:areturn         
		}

		public int getPosition()
		{
			return mPosition;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field int mPosition>
		//    2    4:ireturn         
		}

		public Object getTag()
		{
			return mTag;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field Object mTag>
		//    2    4:areturn         
		}

		public CharSequence getText()
		{
			return mText;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field CharSequence mText>
		//    2    4:areturn         
		}

		public boolean isSelected()
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			return mParent.getSelectedTabPosition() == mPosition;
		//    8   17:aload_0         
		//    9   18:getfield        #58  <Field TabLayout mParent>
		//   10   21:invokevirtual   #68  <Method int TabLayout.getSelectedTabPosition()>
		//   11   24:aload_0         
		//   12   25:getfield        #30  <Field int mPosition>
		//   13   28:icmpne          33
		//   14   31:iconst_1        
		//   15   32:ireturn         
		//   16   33:iconst_0        
		//   17   34:ireturn         
		}

		void reset()
		{
			mParent = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #58  <Field TabLayout mParent>
			mView = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #71  <Field TabLayout$TabView mView>
			mTag = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #51  <Field Object mTag>
			mIcon = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #45  <Field Drawable mIcon>
			mText = null;
		//   12   20:aload_0         
		//   13   21:aconst_null     
		//   14   22:putfield        #54  <Field CharSequence mText>
			mContentDesc = null;
		//   15   25:aload_0         
		//   16   26:aconst_null     
		//   17   27:putfield        #36  <Field CharSequence mContentDesc>
			mPosition = -1;
		//   18   30:aload_0         
		//   19   31:iconst_m1       
		//   20   32:putfield        #30  <Field int mPosition>
			mCustomView = null;
		//   21   35:aload_0         
		//   22   36:aconst_null     
		//   23   37:putfield        #41  <Field View mCustomView>
		//   24   40:return          
		}

		public void select()
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
			{
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			} else
			{
				mParent.selectTab(this);
		//    8   17:aload_0         
		//    9   18:getfield        #58  <Field TabLayout mParent>
		//   10   21:aload_0         
		//   11   22:invokevirtual   #76  <Method void TabLayout.selectTab(TabLayout$Tab)>
				return;
		//   12   25:return          
			}
		}

		public Tab setContentDescription(int i)
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			else
				return setContentDescription(mParent.getResources().getText(i));
		//    8   17:aload_0         
		//    9   18:aload_0         
		//   10   19:getfield        #58  <Field TabLayout mParent>
		//   11   22:invokevirtual   #84  <Method Resources TabLayout.getResources()>
		//   12   25:iload_1         
		//   13   26:invokevirtual   #89  <Method CharSequence Resources.getText(int)>
		//   14   29:invokevirtual   #92  <Method TabLayout$Tab setContentDescription(CharSequence)>
		//   15   32:areturn         
		}

		public Tab setContentDescription(CharSequence charsequence)
		{
			mContentDesc = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field CharSequence mContentDesc>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #96  <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Tab setCustomView(int i)
		{
			return setCustomView(LayoutInflater.from(mView.getContext()).inflate(i, ((ViewGroup) (mView)), false));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #71  <Field TabLayout$TabView mView>
		//    3    5:invokevirtual   #104 <Method Context TabLayout$TabView.getContext()>
		//    4    8:invokestatic    #110 <Method LayoutInflater LayoutInflater.from(Context)>
		//    5   11:iload_1         
		//    6   12:aload_0         
		//    7   13:getfield        #71  <Field TabLayout$TabView mView>
		//    8   16:iconst_0        
		//    9   17:invokevirtual   #114 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//   10   20:invokevirtual   #117 <Method TabLayout$Tab setCustomView(View)>
		//   11   23:areturn         
		}

		public Tab setCustomView(View view)
		{
			mCustomView = view;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field View mCustomView>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #96  <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public Tab setIcon(int i)
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			else
				return setIcon(AppCompatResources.getDrawable(mParent.getContext(), i));
		//    8   17:aload_0         
		//    9   18:aload_0         
		//   10   19:getfield        #58  <Field TabLayout mParent>
		//   11   22:invokevirtual   #120 <Method Context TabLayout.getContext()>
		//   12   25:iload_1         
		//   13   26:invokestatic    #126 <Method Drawable AppCompatResources.getDrawable(Context, int)>
		//   14   29:invokevirtual   #129 <Method TabLayout$Tab setIcon(Drawable)>
		//   15   32:areturn         
		}

		public Tab setIcon(Drawable drawable)
		{
			mIcon = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #45  <Field Drawable mIcon>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #96  <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		void setPosition(int i)
		{
			mPosition = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #30  <Field int mPosition>
		//    3    5:return          
		}

		public Tab setTag(Object obj)
		{
			mTag = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #51  <Field Object mTag>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Tab setText(int i)
		{
			if(mParent == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #58  <Field TabLayout mParent>
		//*   2    4:ifnonnull       17
				throw new IllegalArgumentException("Tab not attached to a TabLayout");
		//    3    7:new             #60  <Class IllegalArgumentException>
		//    4   10:dup             
		//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
		//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
		//    7   16:athrow          
			else
				return setText(mParent.getResources().getText(i));
		//    8   17:aload_0         
		//    9   18:aload_0         
		//   10   19:getfield        #58  <Field TabLayout mParent>
		//   11   22:invokevirtual   #84  <Method Resources TabLayout.getResources()>
		//   12   25:iload_1         
		//   13   26:invokevirtual   #89  <Method CharSequence Resources.getText(int)>
		//   14   29:invokevirtual   #136 <Method TabLayout$Tab setText(CharSequence)>
		//   15   32:areturn         
		}

		public Tab setText(CharSequence charsequence)
		{
			mText = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field CharSequence mText>
			updateView();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #96  <Method void updateView()>
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		void updateView()
		{
			if(mView != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #71  <Field TabLayout$TabView mView>
		//*   2    4:ifnull          14
				mView.update();
		//    3    7:aload_0         
		//    4    8:getfield        #71  <Field TabLayout$TabView mView>
		//    5   11:invokevirtual   #139 <Method void TabLayout$TabView.update()>
		//    6   14:return          
		}

		public static final int INVALID_POSITION = -1;
		private CharSequence mContentDesc;
		private View mCustomView;
		private Drawable mIcon;
		TabLayout mParent;
		private int mPosition;
		private Object mTag;
		private CharSequence mText;
		TabView mView;

		Tab()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			mPosition = -1;
		//    2    4:aload_0         
		//    3    5:iconst_m1       
		//    4    6:putfield        #30  <Field int mPosition>
		//    5    9:return          
		}
	}

	public static interface TabGravity
		extends Annotation
	{
	}

	public static class TabLayoutOnPageChangeListener
		implements android.support.v4.view.ViewPager.OnPageChangeListener
	{

		public void onPageScrollStateChanged(int i)
		{
			mPreviousScrollState = mScrollState;
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #32  <Field int mScrollState>
		//    3    5:putfield        #34  <Field int mPreviousScrollState>
			mScrollState = i;
		//    4    8:aload_0         
		//    5    9:iload_1         
		//    6   10:putfield        #32  <Field int mScrollState>
		//    7   13:return          
		}

		public void onPageScrolled(int i, float f, int j)
		{
			TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mTabLayoutRef>
		//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class TabLayout>
		//    4   10:astore          6
			if(tablayout != null)
		//*   5   12:aload           6
		//*   6   14:ifnull          79
			{
				j = mScrollState;
		//    7   17:aload_0         
		//    8   18:getfield        #32  <Field int mScrollState>
		//    9   21:istore_3        
				boolean flag1 = false;
		//   10   22:iconst_0        
		//   11   23:istore          5
				boolean flag;
				if(j == 2 && mPreviousScrollState != 1)
		//*  12   25:iload_3         
		//*  13   26:iconst_2        
		//*  14   27:icmpne          47
		//*  15   30:aload_0         
		//*  16   31:getfield        #34  <Field int mPreviousScrollState>
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
				if(mScrollState != 2 || mPreviousScrollState != 0)
		//*  25   50:aload_0         
		//*  26   51:getfield        #32  <Field int mScrollState>
		//*  27   54:iconst_2        
		//*  28   55:icmpne          65
		//*  29   58:aload_0         
		//*  30   59:getfield        #34  <Field int mPreviousScrollState>
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
			TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WeakReference mTabLayoutRef>
		//    2    4:invokevirtual   #40  <Method Object WeakReference.get()>
		//    3    7:checkcast       #8   <Class TabLayout>
		//    4   10:astore_3        
			if(tablayout != null && tablayout.getSelectedTabPosition() != i && i < tablayout.getTabCount())
		//*   5   11:aload_3         
		//*   6   12:ifnull          73
		//*   7   15:aload_3         
		//*   8   16:invokevirtual   #49  <Method int TabLayout.getSelectedTabPosition()>
		//*   9   19:iload_1         
		//*  10   20:icmpeq          73
		//*  11   23:iload_1         
		//*  12   24:aload_3         
		//*  13   25:invokevirtual   #52  <Method int TabLayout.getTabCount()>
		//*  14   28:icmpge          73
			{
				boolean flag;
				if(mScrollState != 0 && (mScrollState != 2 || mPreviousScrollState != 0))
		//*  15   31:aload_0         
		//*  16   32:getfield        #32  <Field int mScrollState>
		//*  17   35:ifeq            61
		//*  18   38:aload_0         
		//*  19   39:getfield        #32  <Field int mScrollState>
		//*  20   42:iconst_2        
		//*  21   43:icmpne          56
		//*  22   46:aload_0         
		//*  23   47:getfield        #34  <Field int mPreviousScrollState>
		//*  24   50:ifne            56
		//*  25   53:goto            61
					flag = false;
		//   26   56:iconst_0        
		//   27   57:istore_2        
				else
		//*  28   58:goto            63
					flag = true;
		//   29   61:iconst_1        
		//   30   62:istore_2        
				tablayout.selectTab(tablayout.getTabAt(i), flag);
		//   31   63:aload_3         
		//   32   64:aload_3         
		//   33   65:iload_1         
		//   34   66:invokevirtual   #56  <Method TabLayout$Tab TabLayout.getTabAt(int)>
		//   35   69:iload_2         
		//   36   70:invokevirtual   #60  <Method void TabLayout.selectTab(TabLayout$Tab, boolean)>
			}
		//   37   73:return          
		}

		void reset()
		{
			mScrollState = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #32  <Field int mScrollState>
			mPreviousScrollState = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #34  <Field int mPreviousScrollState>
		//    6   10:return          
		}

		private int mPreviousScrollState;
		private int mScrollState;
		private final WeakReference mTabLayoutRef;

		public TabLayoutOnPageChangeListener(TabLayout tablayout)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			mTabLayoutRef = new WeakReference(((Object) (tablayout)));
		//    2    4:aload_0         
		//    3    5:new             #22  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #25  <Method void WeakReference(Object)>
		//    7   13:putfield        #27  <Field WeakReference mTabLayoutRef>
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
		//    2    2:invokevirtual   #95  <Method float Layout.getLineWidth(int)>
		//    3    5:fload_3         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #99  <Method TextPaint Layout.getPaint()>
		//    6   10:invokevirtual   #105 <Method float TextPaint.getTextSize()>
		//    7   13:fdiv            
		//    8   14:fmul            
		//    9   15:freturn         
		}

		private void updateTextAndIcon(TextView textview, ImageView imageview)
		{
			Object obj = ((Object) (mTab));
		//    0    0:aload_0         
		//    1    1:getfield        #110 <Field TabLayout$Tab mTab>
		//    2    4:astore          6
			Object obj1 = null;
		//    3    6:aconst_null     
		//    4    7:astore          9
			Drawable drawable;
			if(obj != null)
		//*   5    9:aload           6
		//*   6   11:ifnull          26
				drawable = mTab.getIcon();
		//    7   14:aload_0         
		//    8   15:getfield        #110 <Field TabLayout$Tab mTab>
		//    9   18:invokevirtual   #116 <Method Drawable TabLayout$Tab.getIcon()>
		//   10   21:astore          7
			else
		//*  11   23:goto            29
				drawable = null;
		//   12   26:aconst_null     
		//   13   27:astore          7
			CharSequence charsequence;
			if(mTab != null)
		//*  14   29:aload_0         
		//*  15   30:getfield        #110 <Field TabLayout$Tab mTab>
		//*  16   33:ifnull          48
				charsequence = mTab.getText();
		//   17   36:aload_0         
		//   18   37:getfield        #110 <Field TabLayout$Tab mTab>
		//   19   40:invokevirtual   #120 <Method CharSequence TabLayout$Tab.getText()>
		//   20   43:astore          8
			else
		//*  21   45:goto            51
				charsequence = null;
		//   22   48:aconst_null     
		//   23   49:astore          8
			if(mTab != null)
		//*  24   51:aload_0         
		//*  25   52:getfield        #110 <Field TabLayout$Tab mTab>
		//*  26   55:ifnull          70
				obj = ((Object) (mTab.getContentDescription()));
		//   27   58:aload_0         
		//   28   59:getfield        #110 <Field TabLayout$Tab mTab>
		//   29   62:invokevirtual   #123 <Method CharSequence TabLayout$Tab.getContentDescription()>
		//   30   65:astore          6
			else
		//*  31   67:goto            73
				obj = null;
		//   32   70:aconst_null     
		//   33   71:astore          6
			boolean flag = false;
		//   34   73:iconst_0        
		//   35   74:istore          4
			if(imageview != null)
		//*  36   76:aload_2         
		//*  37   77:ifnull          121
			{
				if(drawable != null)
		//*  38   80:aload           7
		//*  39   82:ifnull          104
				{
					imageview.setImageDrawable(drawable);
		//   40   85:aload_2         
		//   41   86:aload           7
		//   42   88:invokevirtual   #129 <Method void ImageView.setImageDrawable(Drawable)>
					imageview.setVisibility(0);
		//   43   91:aload_2         
		//   44   92:iconst_0        
		//   45   93:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
					setVisibility(0);
		//   46   96:aload_0         
		//   47   97:iconst_0        
		//   48   98:invokevirtual   #133 <Method void setVisibility(int)>
				} else
		//*  49  101:goto            115
				{
					imageview.setVisibility(8);
		//   50  104:aload_2         
		//   51  105:bipush          8
		//   52  107:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
					imageview.setImageDrawable(((Drawable) (null)));
		//   53  110:aload_2         
		//   54  111:aconst_null     
		//   55  112:invokevirtual   #129 <Method void ImageView.setImageDrawable(Drawable)>
				}
				imageview.setContentDescription(((CharSequence) (obj)));
		//   56  115:aload_2         
		//   57  116:aload           6
		//   58  118:invokevirtual   #137 <Method void ImageView.setContentDescription(CharSequence)>
			}
			boolean flag1 = TextUtils.isEmpty(charsequence) ^ true;
		//   59  121:aload           8
		//   60  123:invokestatic    #143 <Method boolean TextUtils.isEmpty(CharSequence)>
		//   61  126:iconst_1        
		//   62  127:ixor            
		//   63  128:istore          5
			if(textview != null)
		//*  64  130:aload_1         
		//*  65  131:ifnull          175
			{
				if(flag1)
		//*  66  134:iload           5
		//*  67  136:ifeq            158
				{
					textview.setText(charsequence);
		//   68  139:aload_1         
		//   69  140:aload           8
		//   70  142:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
					textview.setVisibility(0);
		//   71  145:aload_1         
		//   72  146:iconst_0        
		//   73  147:invokevirtual   #149 <Method void TextView.setVisibility(int)>
					setVisibility(0);
		//   74  150:aload_0         
		//   75  151:iconst_0        
		//   76  152:invokevirtual   #133 <Method void setVisibility(int)>
				} else
		//*  77  155:goto            169
				{
					textview.setVisibility(8);
		//   78  158:aload_1         
		//   79  159:bipush          8
		//   80  161:invokevirtual   #149 <Method void TextView.setVisibility(int)>
					textview.setText(((CharSequence) (null)));
		//   81  164:aload_1         
		//   82  165:aconst_null     
		//   83  166:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
				}
				textview.setContentDescription(((CharSequence) (obj)));
		//   84  169:aload_1         
		//   85  170:aload           6
		//   86  172:invokevirtual   #150 <Method void TextView.setContentDescription(CharSequence)>
			}
			if(imageview != null)
		//*  87  175:aload_2         
		//*  88  176:ifnull          232
			{
				textview = ((TextView) ((android.view.ViewGroup.MarginLayoutParams)imageview.getLayoutParams()));
		//   89  179:aload_2         
		//   90  180:invokevirtual   #154 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
		//   91  183:checkcast       #156 <Class android.view.ViewGroup$MarginLayoutParams>
		//   92  186:astore_1        
				int i = ((int) (flag));
		//   93  187:iload           4
		//   94  189:istore_3        
				if(flag1)
		//*  95  190:iload           5
		//*  96  192:ifeq            215
				{
					i = ((int) (flag));
		//   97  195:iload           4
		//   98  197:istore_3        
					if(imageview.getVisibility() == 0)
		//*  99  198:aload_2         
		//* 100  199:invokevirtual   #160 <Method int ImageView.getVisibility()>
		//* 101  202:ifne            215
						i = dpToPx(8);
		//  102  205:aload_0         
		//  103  206:getfield        #25  <Field TabLayout this$0>
		//  104  209:bipush          8
		//  105  211:invokevirtual   #164 <Method int TabLayout.dpToPx(int)>
		//  106  214:istore_3        
				}
				if(i != ((android.view.ViewGroup.MarginLayoutParams) (textview)).bottomMargin)
		//* 107  215:iload_3         
		//* 108  216:aload_1         
		//* 109  217:getfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//* 110  220:icmpeq          232
				{
					textview.bottomMargin = i;
		//  111  223:aload_1         
		//  112  224:iload_3         
		//  113  225:putfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
					imageview.requestLayout();
		//  114  228:aload_2         
		//  115  229:invokevirtual   #171 <Method void ImageView.requestLayout()>
				}
			}
			if(flag1)
		//* 116  232:iload           5
		//* 117  234:ifeq            244
				obj = ((Object) (obj1));
		//  118  237:aload           9
		//  119  239:astore          6
		//* 120  241:goto            244
			TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (obj)));
		//  121  244:aload_0         
		//  122  245:aload           6
		//  123  247:invokestatic    #177 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		//  124  250:return          
		}

		public Tab getTab()
		{
			return mTab;
		//    0    0:aload_0         
		//    1    1:getfield        #110 <Field TabLayout$Tab mTab>
		//    2    4:areturn         
		}

		public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #184 <Method void LinearLayout.onInitializeAccessibilityEvent(AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc1            #186 <Class android.support.v7.app.ActionBar$Tab>
		//    5    8:invokevirtual   #192 <Method String Class.getName()>
		//    6   11:invokevirtual   #197 <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    7   14:return          
		}

		public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #201 <Method void LinearLayout.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/support/v7/app/ActionBar$Tab)).getName())));
		//    3    5:aload_1         
		//    4    6:ldc1            #186 <Class android.support.v7.app.ActionBar$Tab>
		//    5    8:invokevirtual   #192 <Method String Class.getName()>
		//    6   11:invokevirtual   #204 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		//    7   14:return          
		}

		public void onMeasure(int i, int j)
		{
			int k;
label0:
			{
				int l = android.view.View.MeasureSpec.getSize(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #211 <Method int android.view.View$MeasureSpec.getSize(int)>
		//    2    4:istore          6
				int j1 = android.view.View.MeasureSpec.getMode(i);
		//    3    6:iload_1         
		//    4    7:invokestatic    #214 <Method int android.view.View$MeasureSpec.getMode(int)>
		//    5   10:istore          7
				int k1 = getTabMaxWidth();
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field TabLayout this$0>
		//    8   16:invokevirtual   #217 <Method int TabLayout.getTabMaxWidth()>
		//    9   19:istore          8
				k = i;
		//   10   21:iload_1         
		//   11   22:istore          5
				if(k1 <= 0)
					break label0;
		//   12   24:iload           8
		//   13   26:ifle            58
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
		//   20   41:icmple          58
				}
				k = android.view.View.MeasureSpec.makeMeasureSpec(mTabMaxWidth, 0x80000000);
		//   21   44:aload_0         
		//   22   45:getfield        #25  <Field TabLayout this$0>
		//   23   48:getfield        #220 <Field int TabLayout.mTabMaxWidth>
		//   24   51:ldc1            #221 <Int 0x80000000>
		//   25   53:invokestatic    #225 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   26   56:istore          5
			}
label1:
			{
				float f;
				boolean flag;
label2:
				{
					super.onMeasure(k, j);
		//   27   58:aload_0         
		//   28   59:iload           5
		//   29   61:iload_2         
		//   30   62:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
					if(mTextView == null)
						break label1;
		//   31   65:aload_0         
		//   32   66:getfield        #229 <Field TextView mTextView>
		//   33   69:ifnull          323
					getResources();
		//   34   72:aload_0         
		//   35   73:invokevirtual   #233 <Method Resources getResources()>
		//   36   76:pop             
					float f1 = mTabTextSize;
		//   37   77:aload_0         
		//   38   78:getfield        #25  <Field TabLayout this$0>
		//   39   81:getfield        #237 <Field float TabLayout.mTabTextSize>
		//   40   84:fstore          4
					int i1 = mDefaultMaxLines;
		//   41   86:aload_0         
		//   42   87:getfield        #30  <Field int mDefaultMaxLines>
		//   43   90:istore          6
					Object obj = ((Object) (mIconView));
		//   44   92:aload_0         
		//   45   93:getfield        #239 <Field ImageView mIconView>
		//   46   96:astore          9
					boolean flag1 = true;
		//   47   98:iconst_1        
		//   48   99:istore          7
					if(obj != null && mIconView.getVisibility() == 0)
		//*  49  101:aload           9
		//*  50  103:ifnull          124
		//*  51  106:aload_0         
		//*  52  107:getfield        #239 <Field ImageView mIconView>
		//*  53  110:invokevirtual   #160 <Method int ImageView.getVisibility()>
		//*  54  113:ifne            124
					{
						i = 1;
		//   55  116:iconst_1        
		//   56  117:istore_1        
						f = f1;
		//   57  118:fload           4
		//   58  120:fstore_3        
					} else
		//*  59  121:goto            165
					{
						f = f1;
		//   60  124:fload           4
		//   61  126:fstore_3        
						i = i1;
		//   62  127:iload           6
		//   63  129:istore_1        
						if(mTextView != null)
		//*  64  130:aload_0         
		//*  65  131:getfield        #229 <Field TextView mTextView>
		//*  66  134:ifnull          165
						{
							f = f1;
		//   67  137:fload           4
		//   68  139:fstore_3        
							i = i1;
		//   69  140:iload           6
		//   70  142:istore_1        
							if(mTextView.getLineCount() > 1)
		//*  71  143:aload_0         
		//*  72  144:getfield        #229 <Field TextView mTextView>
		//*  73  147:invokevirtual   #242 <Method int TextView.getLineCount()>
		//*  74  150:iconst_1        
		//*  75  151:icmple          165
							{
								f = mTabTextMultiLineSize;
		//   76  154:aload_0         
		//   77  155:getfield        #25  <Field TabLayout this$0>
		//   78  158:getfield        #245 <Field float TabLayout.mTabTextMultiLineSize>
		//   79  161:fstore_3        
								i = i1;
		//   80  162:iload           6
		//   81  164:istore_1        
							}
						}
					}
					f1 = mTextView.getTextSize();
		//   82  165:aload_0         
		//   83  166:getfield        #229 <Field TextView mTextView>
		//   84  169:invokevirtual   #246 <Method float TextView.getTextSize()>
		//   85  172:fstore          4
					int l1 = mTextView.getLineCount();
		//   86  174:aload_0         
		//   87  175:getfield        #229 <Field TextView mTextView>
		//   88  178:invokevirtual   #242 <Method int TextView.getLineCount()>
		//   89  181:istore          8
					i1 = TextViewCompat.getMaxLines(mTextView);
		//   90  183:aload_0         
		//   91  184:getfield        #229 <Field TextView mTextView>
		//   92  187:invokestatic    #252 <Method int TextViewCompat.getMaxLines(TextView)>
		//   93  190:istore          6
					if(f == f1 && (i1 < 0 || i == i1))
						break label1;
		//   94  192:fload_3         
		//   95  193:fload           4
		//   96  195:fcmpl           
		//   97  196:ifne            210
		//   98  199:iload           6
		//   99  201:iflt            323
		//  100  204:iload_1         
		//  101  205:iload           6
		//  102  207:icmpeq          323
					flag = flag1;
		//  103  210:iload           7
		//  104  212:istore          6
					if(mMode != 1)
						break label2;
		//  105  214:aload_0         
		//  106  215:getfield        #25  <Field TabLayout this$0>
		//  107  218:getfield        #255 <Field int TabLayout.mMode>
		//  108  221:iconst_1        
		//  109  222:icmpne          294
					flag = flag1;
		//  110  225:iload           7
		//  111  227:istore          6
					if(f <= f1)
						break label2;
		//  112  229:fload_3         
		//  113  230:fload           4
		//  114  232:fcmpl           
		//  115  233:ifle            294
					flag = flag1;
		//  116  236:iload           7
		//  117  238:istore          6
					if(l1 != 1)
						break label2;
		//  118  240:iload           8
		//  119  242:iconst_1        
		//  120  243:icmpne          294
					obj = ((Object) (mTextView.getLayout()));
		//  121  246:aload_0         
		//  122  247:getfield        #229 <Field TextView mTextView>
		//  123  250:invokevirtual   #259 <Method Layout TextView.getLayout()>
		//  124  253:astore          9
					if(obj != null)
		//* 125  255:aload           9
		//* 126  257:ifnull          291
					{
						flag = flag1;
		//  127  260:iload           7
		//  128  262:istore          6
						if(approximateLineWidth(((Layout) (obj)), 0, f) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
							break label2;
		//  129  264:aload_0         
		//  130  265:aload           9
		//  131  267:iconst_0        
		//  132  268:fload_3         
		//  133  269:invokespecial   #261 <Method float approximateLineWidth(Layout, int, float)>
		//  134  272:aload_0         
		//  135  273:invokevirtual   #264 <Method int getMeasuredWidth()>
		//  136  276:aload_0         
		//  137  277:invokevirtual   #267 <Method int getPaddingLeft()>
		//  138  280:isub            
		//  139  281:aload_0         
		//  140  282:invokevirtual   #270 <Method int getPaddingRight()>
		//  141  285:isub            
		//  142  286:i2f             
		//  143  287:fcmpl           
		//  144  288:ifle            294
					}
					flag = false;
		//  145  291:iconst_0        
		//  146  292:istore          6
				}
				if(flag)
		//* 147  294:iload           6
		//* 148  296:ifeq            323
				{
					mTextView.setTextSize(0, f);
		//  149  299:aload_0         
		//  150  300:getfield        #229 <Field TextView mTextView>
		//  151  303:iconst_0        
		//  152  304:fload_3         
		//  153  305:invokevirtual   #274 <Method void TextView.setTextSize(int, float)>
					mTextView.setMaxLines(i);
		//  154  308:aload_0         
		//  155  309:getfield        #229 <Field TextView mTextView>
		//  156  312:iload_1         
		//  157  313:invokevirtual   #277 <Method void TextView.setMaxLines(int)>
					super.onMeasure(k, j);
		//  158  316:aload_0         
		//  159  317:iload           5
		//  160  319:iload_2         
		//  161  320:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
				}
			}
		//  162  323:return          
		}

		public boolean performClick()
		{
			boolean flag = super.performClick();
		//    0    0:aload_0         
		//    1    1:invokespecial   #281 <Method boolean LinearLayout.performClick()>
		//    2    4:istore_1        
			if(mTab != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #110 <Field TabLayout$Tab mTab>
		//*   5    9:ifnull          30
			{
				if(!flag)
		//*   6   12:iload_1         
		//*   7   13:ifne            21
					playSoundEffect(0);
		//    8   16:aload_0         
		//    9   17:iconst_0        
		//   10   18:invokevirtual   #284 <Method void playSoundEffect(int)>
				mTab.select();
		//   11   21:aload_0         
		//   12   22:getfield        #110 <Field TabLayout$Tab mTab>
		//   13   25:invokevirtual   #287 <Method void TabLayout$Tab.select()>
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
		//    2    2:invokevirtual   #292 <Method void setTab(TabLayout$Tab)>
			setSelected(false);
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:invokevirtual   #295 <Method void setSelected(boolean)>
		//    6   10:return          
		}

		public void setSelected(boolean flag)
		{
			boolean flag1;
			if(isSelected() != flag)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #298 <Method boolean isSelected()>
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
		//   11   17:invokespecial   #299 <Method void LinearLayout.setSelected(boolean)>
			if(flag1 && flag && android.os.Build.VERSION.SDK_INT < 16)
		//*  12   20:iload_2         
		//*  13   21:ifeq            41
		//*  14   24:iload_1         
		//*  15   25:ifeq            41
		//*  16   28:getstatic       #304 <Field int android.os.Build$VERSION.SDK_INT>
		//*  17   31:bipush          16
		//*  18   33:icmpge          41
				sendAccessibilityEvent(4);
		//   19   36:aload_0         
		//   20   37:iconst_4        
		//   21   38:invokevirtual   #307 <Method void sendAccessibilityEvent(int)>
			if(mTextView != null)
		//*  22   41:aload_0         
		//*  23   42:getfield        #229 <Field TextView mTextView>
		//*  24   45:ifnull          56
				mTextView.setSelected(flag);
		//   25   48:aload_0         
		//   26   49:getfield        #229 <Field TextView mTextView>
		//   27   52:iload_1         
		//   28   53:invokevirtual   #308 <Method void TextView.setSelected(boolean)>
			if(mIconView != null)
		//*  29   56:aload_0         
		//*  30   57:getfield        #239 <Field ImageView mIconView>
		//*  31   60:ifnull          71
				mIconView.setSelected(flag);
		//   32   63:aload_0         
		//   33   64:getfield        #239 <Field ImageView mIconView>
		//   34   67:iload_1         
		//   35   68:invokevirtual   #309 <Method void ImageView.setSelected(boolean)>
			if(mCustomView != null)
		//*  36   71:aload_0         
		//*  37   72:getfield        #311 <Field View mCustomView>
		//*  38   75:ifnull          86
				mCustomView.setSelected(flag);
		//   39   78:aload_0         
		//   40   79:getfield        #311 <Field View mCustomView>
		//   41   82:iload_1         
		//   42   83:invokevirtual   #314 <Method void View.setSelected(boolean)>
		//   43   86:return          
		}

		void setTab(Tab tab)
		{
			if(tab != mTab)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #110 <Field TabLayout$Tab mTab>
		//*   3    5:if_acmpeq       17
			{
				mTab = tab;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:putfield        #110 <Field TabLayout$Tab mTab>
				update();
		//    7   13:aload_0         
		//    8   14:invokevirtual   #317 <Method void update()>
			}
		//    9   17:return          
		}

		final void update()
		{
			Tab tab = mTab;
		//    0    0:aload_0         
		//    1    1:getfield        #110 <Field TabLayout$Tab mTab>
		//    2    4:astore          4
			View view;
			if(tab != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          20
				view = tab.getCustomView();
		//    5   11:aload           4
		//    6   13:invokevirtual   #321 <Method View TabLayout$Tab.getCustomView()>
		//    7   16:astore_3        
			else
		//*   8   17:goto            22
				view = null;
		//    9   20:aconst_null     
		//   10   21:astore_3        
			if(view != null)
		//*  11   22:aload_3         
		//*  12   23:ifnull          151
			{
				android.view.ViewParent viewparent = view.getParent();
		//   13   26:aload_3         
		//   14   27:invokevirtual   #325 <Method android.view.ViewParent View.getParent()>
		//   15   30:astore          5
				if(viewparent != this)
		//*  16   32:aload           5
		//*  17   34:aload_0         
		//*  18   35:if_acmpeq       57
				{
					if(viewparent != null)
		//*  19   38:aload           5
		//*  20   40:ifnull          52
						((ViewGroup)viewparent).removeView(view);
		//   21   43:aload           5
		//   22   45:checkcast       #327 <Class ViewGroup>
		//   23   48:aload_3         
		//   24   49:invokevirtual   #331 <Method void ViewGroup.removeView(View)>
					addView(view);
		//   25   52:aload_0         
		//   26   53:aload_3         
		//   27   54:invokevirtual   #334 <Method void addView(View)>
				}
				mCustomView = view;
		//   28   57:aload_0         
		//   29   58:aload_3         
		//   30   59:putfield        #311 <Field View mCustomView>
				if(mTextView != null)
		//*  31   62:aload_0         
		//*  32   63:getfield        #229 <Field TextView mTextView>
		//*  33   66:ifnull          78
					mTextView.setVisibility(8);
		//   34   69:aload_0         
		//   35   70:getfield        #229 <Field TextView mTextView>
		//   36   73:bipush          8
		//   37   75:invokevirtual   #149 <Method void TextView.setVisibility(int)>
				if(mIconView != null)
		//*  38   78:aload_0         
		//*  39   79:getfield        #239 <Field ImageView mIconView>
		//*  40   82:ifnull          102
				{
					mIconView.setVisibility(8);
		//   41   85:aload_0         
		//   42   86:getfield        #239 <Field ImageView mIconView>
		//   43   89:bipush          8
		//   44   91:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
					mIconView.setImageDrawable(((Drawable) (null)));
		//   45   94:aload_0         
		//   46   95:getfield        #239 <Field ImageView mIconView>
		//   47   98:aconst_null     
		//   48   99:invokevirtual   #129 <Method void ImageView.setImageDrawable(Drawable)>
				}
				mCustomTextView = (TextView)view.findViewById(0x1020014);
		//   49  102:aload_0         
		//   50  103:aload_3         
		//   51  104:ldc2            #335 <Int 0x1020014>
		//   52  107:invokevirtual   #339 <Method View View.findViewById(int)>
		//   53  110:checkcast       #145 <Class TextView>
		//   54  113:putfield        #341 <Field TextView mCustomTextView>
				if(mCustomTextView != null)
		//*  55  116:aload_0         
		//*  56  117:getfield        #341 <Field TextView mCustomTextView>
		//*  57  120:ifnull          134
					mDefaultMaxLines = TextViewCompat.getMaxLines(mCustomTextView);
		//   58  123:aload_0         
		//   59  124:aload_0         
		//   60  125:getfield        #341 <Field TextView mCustomTextView>
		//   61  128:invokestatic    #252 <Method int TextViewCompat.getMaxLines(TextView)>
		//   62  131:putfield        #30  <Field int mDefaultMaxLines>
				mCustomIconView = (ImageView)view.findViewById(0x1020006);
		//   63  134:aload_0         
		//   64  135:aload_3         
		//   65  136:ldc2            #342 <Int 0x1020006>
		//   66  139:invokevirtual   #339 <Method View View.findViewById(int)>
		//   67  142:checkcast       #125 <Class ImageView>
		//   68  145:putfield        #344 <Field ImageView mCustomIconView>
			} else
		//*  69  148:goto            181
			{
				if(mCustomView != null)
		//*  70  151:aload_0         
		//*  71  152:getfield        #311 <Field View mCustomView>
		//*  72  155:ifnull          171
				{
					removeView(mCustomView);
		//   73  158:aload_0         
		//   74  159:aload_0         
		//   75  160:getfield        #311 <Field View mCustomView>
		//   76  163:invokevirtual   #345 <Method void removeView(View)>
					mCustomView = null;
		//   77  166:aload_0         
		//   78  167:aconst_null     
		//   79  168:putfield        #311 <Field View mCustomView>
				}
				mCustomTextView = null;
		//   80  171:aload_0         
		//   81  172:aconst_null     
		//   82  173:putfield        #341 <Field TextView mCustomTextView>
				mCustomIconView = null;
		//   83  176:aload_0         
		//   84  177:aconst_null     
		//   85  178:putfield        #344 <Field ImageView mCustomIconView>
			}
			view = mCustomView;
		//   86  181:aload_0         
		//   87  182:getfield        #311 <Field View mCustomView>
		//   88  185:astore_3        
			boolean flag1 = false;
		//   89  186:iconst_0        
		//   90  187:istore_2        
			if(view == null)
		//*  91  188:aload_3         
		//*  92  189:ifnonnull       329
			{
				if(mIconView == null)
		//*  93  192:aload_0         
		//*  94  193:getfield        #239 <Field ImageView mIconView>
		//*  95  196:ifnonnull       229
				{
					ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_icon, ((ViewGroup) (this)), false);
		//   96  199:aload_0         
		//   97  200:invokevirtual   #76  <Method Context getContext()>
		//   98  203:invokestatic    #351 <Method LayoutInflater LayoutInflater.from(Context)>
		//   99  206:getstatic       #356 <Field int android.support.design.R$layout.design_layout_tab_icon>
		//  100  209:aload_0         
		//  101  210:iconst_0        
		//  102  211:invokevirtual   #360 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//  103  214:checkcast       #125 <Class ImageView>
		//  104  217:astore_3        
					addView(((View) (imageview)), 0);
		//  105  218:aload_0         
		//  106  219:aload_3         
		//  107  220:iconst_0        
		//  108  221:invokevirtual   #363 <Method void addView(View, int)>
					mIconView = imageview;
		//  109  224:aload_0         
		//  110  225:aload_3         
		//  111  226:putfield        #239 <Field ImageView mIconView>
				}
				if(mTextView == null)
		//* 112  229:aload_0         
		//* 113  230:getfield        #229 <Field TextView mTextView>
		//* 114  233:ifnonnull       276
				{
					TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_text, ((ViewGroup) (this)), false);
		//  115  236:aload_0         
		//  116  237:invokevirtual   #76  <Method Context getContext()>
		//  117  240:invokestatic    #351 <Method LayoutInflater LayoutInflater.from(Context)>
		//  118  243:getstatic       #366 <Field int android.support.design.R$layout.design_layout_tab_text>
		//  119  246:aload_0         
		//  120  247:iconst_0        
		//  121  248:invokevirtual   #360 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//  122  251:checkcast       #145 <Class TextView>
		//  123  254:astore_3        
					addView(((View) (textview)));
		//  124  255:aload_0         
		//  125  256:aload_3         
		//  126  257:invokevirtual   #334 <Method void addView(View)>
					mTextView = textview;
		//  127  260:aload_0         
		//  128  261:aload_3         
		//  129  262:putfield        #229 <Field TextView mTextView>
					mDefaultMaxLines = TextViewCompat.getMaxLines(mTextView);
		//  130  265:aload_0         
		//  131  266:aload_0         
		//  132  267:getfield        #229 <Field TextView mTextView>
		//  133  270:invokestatic    #252 <Method int TextViewCompat.getMaxLines(TextView)>
		//  134  273:putfield        #30  <Field int mDefaultMaxLines>
				}
				TextViewCompat.setTextAppearance(mTextView, mTabTextAppearance);
		//  135  276:aload_0         
		//  136  277:getfield        #229 <Field TextView mTextView>
		//  137  280:aload_0         
		//  138  281:getfield        #25  <Field TabLayout this$0>
		//  139  284:getfield        #369 <Field int TabLayout.mTabTextAppearance>
		//  140  287:invokestatic    #373 <Method void TextViewCompat.setTextAppearance(TextView, int)>
				if(mTabTextColors != null)
		//* 141  290:aload_0         
		//* 142  291:getfield        #25  <Field TabLayout this$0>
		//* 143  294:getfield        #377 <Field ColorStateList TabLayout.mTabTextColors>
		//* 144  297:ifnull          314
					mTextView.setTextColor(mTabTextColors);
		//  145  300:aload_0         
		//  146  301:getfield        #229 <Field TextView mTextView>
		//  147  304:aload_0         
		//  148  305:getfield        #25  <Field TabLayout this$0>
		//  149  308:getfield        #377 <Field ColorStateList TabLayout.mTabTextColors>
		//  150  311:invokevirtual   #381 <Method void TextView.setTextColor(ColorStateList)>
				updateTextAndIcon(mTextView, mIconView);
		//  151  314:aload_0         
		//  152  315:aload_0         
		//  153  316:getfield        #229 <Field TextView mTextView>
		//  154  319:aload_0         
		//  155  320:getfield        #239 <Field ImageView mIconView>
		//  156  323:invokespecial   #383 <Method void updateTextAndIcon(TextView, ImageView)>
			} else
		//* 157  326:goto            355
			if(mCustomTextView != null || mCustomIconView != null)
		//* 158  329:aload_0         
		//* 159  330:getfield        #341 <Field TextView mCustomTextView>
		//* 160  333:ifnonnull       343
		//* 161  336:aload_0         
		//* 162  337:getfield        #344 <Field ImageView mCustomIconView>
		//* 163  340:ifnull          355
				updateTextAndIcon(mCustomTextView, mCustomIconView);
		//  164  343:aload_0         
		//  165  344:aload_0         
		//  166  345:getfield        #341 <Field TextView mCustomTextView>
		//  167  348:aload_0         
		//  168  349:getfield        #344 <Field ImageView mCustomIconView>
		//  169  352:invokespecial   #383 <Method void updateTextAndIcon(TextView, ImageView)>
			boolean flag = flag1;
		//  170  355:iload_2         
		//  171  356:istore_1        
			if(tab != null)
		//* 172  357:aload           4
		//* 173  359:ifnull          374
			{
				flag = flag1;
		//  174  362:iload_2         
		//  175  363:istore_1        
				if(tab.isSelected())
		//* 176  364:aload           4
		//* 177  366:invokevirtual   #384 <Method boolean TabLayout$Tab.isSelected()>
		//* 178  369:ifeq            374
					flag = true;
		//  179  372:iconst_1        
		//  180  373:istore_1        
			}
			setSelected(flag);
		//  181  374:aload_0         
		//  182  375:iload_1         
		//  183  376:invokevirtual   #295 <Method void setSelected(boolean)>
		//  184  379:return          
		}

		private ImageView mCustomIconView;
		private TextView mCustomTextView;
		private View mCustomView;
		private int mDefaultMaxLines;
		private ImageView mIconView;
		private Tab mTab;
		private TextView mTextView;
		final TabLayout this$0;

		public TabView(Context context)
		{
			this$0 = TabLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field TabLayout this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #28  <Method void LinearLayout(Context)>
			mDefaultMaxLines = 2;
		//    6   10:aload_0         
		//    7   11:iconst_2        
		//    8   12:putfield        #30  <Field int mDefaultMaxLines>
			if(mTabBackgroundResId != 0)
		//*   9   15:aload_1         
		//*  10   16:getfield        #33  <Field int TabLayout.mTabBackgroundResId>
		//*  11   19:ifeq            34
				ViewCompat.setBackground(((View) (this)), AppCompatResources.getDrawable(context, mTabBackgroundResId));
		//   12   22:aload_0         
		//   13   23:aload_2         
		//   14   24:aload_1         
		//   15   25:getfield        #33  <Field int TabLayout.mTabBackgroundResId>
		//   16   28:invokestatic    #39  <Method Drawable AppCompatResources.getDrawable(Context, int)>
		//   17   31:invokestatic    #45  <Method void ViewCompat.setBackground(View, Drawable)>
			ViewCompat.setPaddingRelative(((View) (this)), mTabPaddingStart, mTabPaddingTop, mTabPaddingEnd, mTabPaddingBottom);
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:getfield        #48  <Field int TabLayout.mTabPaddingStart>
		//   21   39:aload_1         
		//   22   40:getfield        #51  <Field int TabLayout.mTabPaddingTop>
		//   23   43:aload_1         
		//   24   44:getfield        #54  <Field int TabLayout.mTabPaddingEnd>
		//   25   47:aload_1         
		//   26   48:getfield        #57  <Field int TabLayout.mTabPaddingBottom>
		//   27   51:invokestatic    #61  <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
			setGravity(17);
		//   28   54:aload_0         
		//   29   55:bipush          17
		//   30   57:invokevirtual   #65  <Method void setGravity(int)>
			setOrientation(1);
		//   31   60:aload_0         
		//   32   61:iconst_1        
		//   33   62:invokevirtual   #68  <Method void setOrientation(int)>
			setClickable(true);
		//   34   65:aload_0         
		//   35   66:iconst_1        
		//   36   67:invokevirtual   #72  <Method void setClickable(boolean)>
			ViewCompat.setPointerIcon(((View) (this)), PointerIconCompat.getSystemIcon(getContext(), 1002));
		//   37   70:aload_0         
		//   38   71:aload_0         
		//   39   72:invokevirtual   #76  <Method Context getContext()>
		//   40   75:sipush          1002
		//   41   78:invokestatic    #82  <Method PointerIconCompat PointerIconCompat.getSystemIcon(Context, int)>
		//   42   81:invokestatic    #86  <Method void ViewCompat.setPointerIcon(View, PointerIconCompat)>
		//   43   84:return          
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
			mViewPager.setCurrentItem(tab.getPosition());
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field ViewPager mViewPager>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method int TabLayout$Tab.getPosition()>
		//    4    8:invokevirtual   #34  <Method void ViewPager.setCurrentItem(int)>
		//    5   11:return          
		}

		public void onTabUnselected(Tab tab)
		{
		//    0    0:return          
		}

		private final ViewPager mViewPager;

		public ViewPagerOnTabSelectedListener(ViewPager viewpager)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mViewPager = viewpager;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ViewPager mViewPager>
		//    5    9:return          
		}
	}


	public TabLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #128 <Method void TabLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public TabLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #131 <Method void TabLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public TabLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #132 <Method void HorizontalScrollView(Context, AttributeSet, int)>
		mTabs = new ArrayList();
	//    5    7:aload_0         
	//    6    8:new             #134 <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #136 <Method void ArrayList()>
	//    9   15:putfield        #138 <Field ArrayList mTabs>
		mTabMaxWidth = 0x7fffffff;
	//   10   18:aload_0         
	//   11   19:ldc1            #139 <Int 0x7fffffff>
	//   12   21:putfield        #141 <Field int mTabMaxWidth>
		mSelectedListeners = new ArrayList();
	//   13   24:aload_0         
	//   14   25:new             #134 <Class ArrayList>
	//   15   28:dup             
	//   16   29:invokespecial   #136 <Method void ArrayList()>
	//   17   32:putfield        #143 <Field ArrayList mSelectedListeners>
		mTabViewPool = ((android.support.v4.util.Pools.Pool) (new android.support.v4.util.Pools.SimplePool(12)));
	//   18   35:aload_0         
	//   19   36:new             #145 <Class android.support.v4.util.Pools$SimplePool>
	//   20   39:dup             
	//   21   40:bipush          12
	//   22   42:invokespecial   #146 <Method void android.support.v4.util.Pools$SimplePool(int)>
	//   23   45:putfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
		ThemeUtils.checkAppCompatTheme(context);
	//   24   48:aload_1         
	//   25   49:invokestatic    #153 <Method void ThemeUtils.checkAppCompatTheme(Context)>
		setHorizontalScrollBarEnabled(false);
	//   26   52:aload_0         
	//   27   53:iconst_0        
	//   28   54:invokevirtual   #157 <Method void setHorizontalScrollBarEnabled(boolean)>
		mTabStrip = new SlidingTabStrip(context);
	//   29   57:aload_0         
	//   30   58:new             #20  <Class TabLayout$SlidingTabStrip>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:invokespecial   #160 <Method void TabLayout$SlidingTabStrip(TabLayout, Context)>
	//   35   67:putfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
		super.addView(((View) (mTabStrip)), 0, ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -1))));
	//   36   70:aload_0         
	//   37   71:aload_0         
	//   38   72:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   39   75:iconst_0        
	//   40   76:new             #164 <Class android.widget.FrameLayout$LayoutParams>
	//   41   79:dup             
	//   42   80:bipush          -2
	//   43   82:iconst_m1       
	//   44   83:invokespecial   #167 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   45   86:invokespecial   #171 <Method void HorizontalScrollView.addView(View, int, android.view.ViewGroup$LayoutParams)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.TabLayout, i, android.support.design.R.style.Widget_Design_TabLayout)));
	//   46   89:aload_1         
	//   47   90:aload_2         
	//   48   91:getstatic       #177 <Field int[] android.support.design.R$styleable.TabLayout>
	//   49   94:iload_3         
	//   50   95:getstatic       #182 <Field int android.support.design.R$style.Widget_Design_TabLayout>
	//   51   98:invokevirtual   #188 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   52  101:astore_2        
		mTabStrip.setSelectedIndicatorHeight(((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabIndicatorHeight, 0));
	//   53  102:aload_0         
	//   54  103:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   55  106:aload_2         
	//   56  107:getstatic       #191 <Field int android.support.design.R$styleable.TabLayout_tabIndicatorHeight>
	//   57  110:iconst_0        
	//   58  111:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   59  114:invokevirtual   #200 <Method void TabLayout$SlidingTabStrip.setSelectedIndicatorHeight(int)>
		mTabStrip.setSelectedIndicatorColor(((TypedArray) (attributeset)).getColor(android.support.design.R.styleable.TabLayout_tabIndicatorColor, 0));
	//   60  117:aload_0         
	//   61  118:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   62  121:aload_2         
	//   63  122:getstatic       #203 <Field int android.support.design.R$styleable.TabLayout_tabIndicatorColor>
	//   64  125:iconst_0        
	//   65  126:invokevirtual   #206 <Method int TypedArray.getColor(int, int)>
	//   66  129:invokevirtual   #209 <Method void TabLayout$SlidingTabStrip.setSelectedIndicatorColor(int)>
		i = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPadding, 0);
	//   67  132:aload_2         
	//   68  133:getstatic       #212 <Field int android.support.design.R$styleable.TabLayout_tabPadding>
	//   69  136:iconst_0        
	//   70  137:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   71  140:istore_3        
		mTabPaddingBottom = i;
	//   72  141:aload_0         
	//   73  142:iload_3         
	//   74  143:putfield        #214 <Field int mTabPaddingBottom>
		mTabPaddingEnd = i;
	//   75  146:aload_0         
	//   76  147:iload_3         
	//   77  148:putfield        #216 <Field int mTabPaddingEnd>
		mTabPaddingTop = i;
	//   78  151:aload_0         
	//   79  152:iload_3         
	//   80  153:putfield        #218 <Field int mTabPaddingTop>
		mTabPaddingStart = i;
	//   81  156:aload_0         
	//   82  157:iload_3         
	//   83  158:putfield        #220 <Field int mTabPaddingStart>
		mTabPaddingStart = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingStart, mTabPaddingStart);
	//   84  161:aload_0         
	//   85  162:aload_2         
	//   86  163:getstatic       #223 <Field int android.support.design.R$styleable.TabLayout_tabPaddingStart>
	//   87  166:aload_0         
	//   88  167:getfield        #220 <Field int mTabPaddingStart>
	//   89  170:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   90  173:putfield        #220 <Field int mTabPaddingStart>
		mTabPaddingTop = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingTop, mTabPaddingTop);
	//   91  176:aload_0         
	//   92  177:aload_2         
	//   93  178:getstatic       #226 <Field int android.support.design.R$styleable.TabLayout_tabPaddingTop>
	//   94  181:aload_0         
	//   95  182:getfield        #218 <Field int mTabPaddingTop>
	//   96  185:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   97  188:putfield        #218 <Field int mTabPaddingTop>
		mTabPaddingEnd = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingEnd, mTabPaddingEnd);
	//   98  191:aload_0         
	//   99  192:aload_2         
	//  100  193:getstatic       #229 <Field int android.support.design.R$styleable.TabLayout_tabPaddingEnd>
	//  101  196:aload_0         
	//  102  197:getfield        #216 <Field int mTabPaddingEnd>
	//  103  200:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  104  203:putfield        #216 <Field int mTabPaddingEnd>
		mTabPaddingBottom = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingBottom, mTabPaddingBottom);
	//  105  206:aload_0         
	//  106  207:aload_2         
	//  107  208:getstatic       #232 <Field int android.support.design.R$styleable.TabLayout_tabPaddingBottom>
	//  108  211:aload_0         
	//  109  212:getfield        #214 <Field int mTabPaddingBottom>
	//  110  215:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  111  218:putfield        #214 <Field int mTabPaddingBottom>
		mTabTextAppearance = ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TabLayout_tabTextAppearance, android.support.design.R.style.TextAppearance_Design_Tab);
	//  112  221:aload_0         
	//  113  222:aload_2         
	//  114  223:getstatic       #235 <Field int android.support.design.R$styleable.TabLayout_tabTextAppearance>
	//  115  226:getstatic       #238 <Field int android.support.design.R$style.TextAppearance_Design_Tab>
	//  116  229:invokevirtual   #241 <Method int TypedArray.getResourceId(int, int)>
	//  117  232:putfield        #243 <Field int mTabTextAppearance>
		context = ((Context) (context.obtainStyledAttributes(mTabTextAppearance, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//  118  235:aload_1         
	//  119  236:aload_0         
	//  120  237:getfield        #243 <Field int mTabTextAppearance>
	//  121  240:getstatic       #248 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  122  243:invokevirtual   #251 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//  123  246:astore_1        
		mTabTextSize = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
	//  124  247:aload_0         
	//  125  248:aload_1         
	//  126  249:getstatic       #254 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//  127  252:iconst_0        
	//  128  253:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  129  256:i2f             
	//  130  257:putfield        #256 <Field float mTabTextSize>
		mTabTextColors = ((TypedArray) (context)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//  131  260:aload_0         
	//  132  261:aload_1         
	//  133  262:getstatic       #259 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  134  265:invokevirtual   #263 <Method ColorStateList TypedArray.getColorStateList(int)>
	//  135  268:putfield        #265 <Field ColorStateList mTabTextColors>
		((TypedArray) (context)).recycle();
	//  136  271:aload_1         
	//  137  272:invokevirtual   #268 <Method void TypedArray.recycle()>
		if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.TabLayout_tabTextColor))
	//* 138  275:aload_2         
	//* 139  276:getstatic       #271 <Field int android.support.design.R$styleable.TabLayout_tabTextColor>
	//* 140  279:invokevirtual   #275 <Method boolean TypedArray.hasValue(int)>
	//* 141  282:ifeq            296
			mTabTextColors = ((TypedArray) (attributeset)).getColorStateList(android.support.design.R.styleable.TabLayout_tabTextColor);
	//  142  285:aload_0         
	//  143  286:aload_2         
	//  144  287:getstatic       #271 <Field int android.support.design.R$styleable.TabLayout_tabTextColor>
	//  145  290:invokevirtual   #263 <Method ColorStateList TypedArray.getColorStateList(int)>
	//  146  293:putfield        #265 <Field ColorStateList mTabTextColors>
		if(((TypedArray) (attributeset)).hasValue(android.support.design.R.styleable.TabLayout_tabSelectedTextColor))
	//* 147  296:aload_2         
	//* 148  297:getstatic       #278 <Field int android.support.design.R$styleable.TabLayout_tabSelectedTextColor>
	//* 149  300:invokevirtual   #275 <Method boolean TypedArray.hasValue(int)>
	//* 150  303:ifeq            330
		{
			i = ((TypedArray) (attributeset)).getColor(android.support.design.R.styleable.TabLayout_tabSelectedTextColor, 0);
	//  151  306:aload_2         
	//  152  307:getstatic       #278 <Field int android.support.design.R$styleable.TabLayout_tabSelectedTextColor>
	//  153  310:iconst_0        
	//  154  311:invokevirtual   #206 <Method int TypedArray.getColor(int, int)>
	//  155  314:istore_3        
			mTabTextColors = createColorStateList(mTabTextColors.getDefaultColor(), i);
	//  156  315:aload_0         
	//  157  316:aload_0         
	//  158  317:getfield        #265 <Field ColorStateList mTabTextColors>
	//  159  320:invokevirtual   #284 <Method int ColorStateList.getDefaultColor()>
	//  160  323:iload_3         
	//  161  324:invokestatic    #288 <Method ColorStateList createColorStateList(int, int)>
	//  162  327:putfield        #265 <Field ColorStateList mTabTextColors>
		}
		mRequestedTabMinWidth = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMinWidth, -1);
	//  163  330:aload_0         
	//  164  331:aload_2         
	//  165  332:getstatic       #291 <Field int android.support.design.R$styleable.TabLayout_tabMinWidth>
	//  166  335:iconst_m1       
	//  167  336:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  168  339:putfield        #293 <Field int mRequestedTabMinWidth>
		mRequestedTabMaxWidth = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMaxWidth, -1);
	//  169  342:aload_0         
	//  170  343:aload_2         
	//  171  344:getstatic       #296 <Field int android.support.design.R$styleable.TabLayout_tabMaxWidth>
	//  172  347:iconst_m1       
	//  173  348:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  174  351:putfield        #298 <Field int mRequestedTabMaxWidth>
		mTabBackgroundResId = ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.TabLayout_tabBackground, 0);
	//  175  354:aload_0         
	//  176  355:aload_2         
	//  177  356:getstatic       #301 <Field int android.support.design.R$styleable.TabLayout_tabBackground>
	//  178  359:iconst_0        
	//  179  360:invokevirtual   #241 <Method int TypedArray.getResourceId(int, int)>
	//  180  363:putfield        #303 <Field int mTabBackgroundResId>
		mContentInsetStart = ((TypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabContentStart, 0);
	//  181  366:aload_0         
	//  182  367:aload_2         
	//  183  368:getstatic       #306 <Field int android.support.design.R$styleable.TabLayout_tabContentStart>
	//  184  371:iconst_0        
	//  185  372:invokevirtual   #197 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  186  375:putfield        #308 <Field int mContentInsetStart>
		mMode = ((TypedArray) (attributeset)).getInt(android.support.design.R.styleable.TabLayout_tabMode, 1);
	//  187  378:aload_0         
	//  188  379:aload_2         
	//  189  380:getstatic       #311 <Field int android.support.design.R$styleable.TabLayout_tabMode>
	//  190  383:iconst_1        
	//  191  384:invokevirtual   #314 <Method int TypedArray.getInt(int, int)>
	//  192  387:putfield        #316 <Field int mMode>
		mTabGravity = ((TypedArray) (attributeset)).getInt(android.support.design.R.styleable.TabLayout_tabGravity, 0);
	//  193  390:aload_0         
	//  194  391:aload_2         
	//  195  392:getstatic       #319 <Field int android.support.design.R$styleable.TabLayout_tabGravity>
	//  196  395:iconst_0        
	//  197  396:invokevirtual   #314 <Method int TypedArray.getInt(int, int)>
	//  198  399:putfield        #321 <Field int mTabGravity>
		((TypedArray) (attributeset)).recycle();
	//  199  402:aload_2         
	//  200  403:invokevirtual   #268 <Method void TypedArray.recycle()>
		context = ((Context) (getResources()));
	//  201  406:aload_0         
	//  202  407:invokevirtual   #325 <Method Resources getResources()>
	//  203  410:astore_1        
		mTabTextMultiLineSize = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_tab_text_size_2line);
	//  204  411:aload_0         
	//  205  412:aload_1         
	//  206  413:getstatic       #330 <Field int android.support.design.R$dimen.design_tab_text_size_2line>
	//  207  416:invokevirtual   #335 <Method int Resources.getDimensionPixelSize(int)>
	//  208  419:i2f             
	//  209  420:putfield        #337 <Field float mTabTextMultiLineSize>
		mScrollableTabMinWidth = ((Resources) (context)).getDimensionPixelSize(android.support.design.R.dimen.design_tab_scrollable_min_width);
	//  210  423:aload_0         
	//  211  424:aload_1         
	//  212  425:getstatic       #340 <Field int android.support.design.R$dimen.design_tab_scrollable_min_width>
	//  213  428:invokevirtual   #335 <Method int Resources.getDimensionPixelSize(int)>
	//  214  431:putfield        #342 <Field int mScrollableTabMinWidth>
		applyModeAndGravity();
	//  215  434:aload_0         
	//  216  435:invokespecial   #345 <Method void applyModeAndGravity()>
		return;
	//  217  438:return          
		attributeset;
	//  218  439:astore_2        
		((TypedArray) (context)).recycle();
	//  219  440:aload_1         
	//  220  441:invokevirtual   #268 <Method void TypedArray.recycle()>
		throw attributeset;
	//  221  444:aload_2         
	//  222  445:athrow          
	}

	private void addTabFromItemView(TabItem tabitem)
	{
		Tab tab = newTab();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #352 <Method TabLayout$Tab newTab()>
	//    2    4:astore_2        
		if(tabitem.mText != null)
	//*   3    5:aload_1         
	//*   4    6:getfield        #358 <Field CharSequence TabItem.mText>
	//*   5    9:ifnull          21
			tab.setText(tabitem.mText);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:getfield        #358 <Field CharSequence TabItem.mText>
	//    9   17:invokevirtual   #362 <Method TabLayout$Tab TabLayout$Tab.setText(CharSequence)>
	//   10   20:pop             
		if(tabitem.mIcon != null)
	//*  11   21:aload_1         
	//*  12   22:getfield        #366 <Field Drawable TabItem.mIcon>
	//*  13   25:ifnull          37
			tab.setIcon(tabitem.mIcon);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:getfield        #366 <Field Drawable TabItem.mIcon>
	//   17   33:invokevirtual   #370 <Method TabLayout$Tab TabLayout$Tab.setIcon(Drawable)>
	//   18   36:pop             
		if(tabitem.mCustomLayout != 0)
	//*  19   37:aload_1         
	//*  20   38:getfield        #373 <Field int TabItem.mCustomLayout>
	//*  21   41:ifeq            53
			tab.setCustomView(tabitem.mCustomLayout);
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:getfield        #373 <Field int TabItem.mCustomLayout>
	//   25   49:invokevirtual   #377 <Method TabLayout$Tab TabLayout$Tab.setCustomView(int)>
	//   26   52:pop             
		if(!TextUtils.isEmpty(tabitem.getContentDescription()))
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #381 <Method CharSequence TabItem.getContentDescription()>
	//*  29   57:invokestatic    #387 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   60:ifne            72
			tab.setContentDescription(tabitem.getContentDescription());
	//   31   63:aload_2         
	//   32   64:aload_1         
	//   33   65:invokevirtual   #381 <Method CharSequence TabItem.getContentDescription()>
	//   34   68:invokevirtual   #390 <Method TabLayout$Tab TabLayout$Tab.setContentDescription(CharSequence)>
	//   35   71:pop             
		addTab(tab);
	//   36   72:aload_0         
	//   37   73:aload_2         
	//   38   74:invokevirtual   #394 <Method void addTab(TabLayout$Tab)>
	//   39   77:return          
	}

	private void addTabView(Tab tab)
	{
		TabView tabview = tab.mView;
	//    0    0:aload_1         
	//    1    1:getfield        #400 <Field TabLayout$TabView TabLayout$Tab.mView>
	//    2    4:astore_2        
		mTabStrip.addView(((View) (tabview)), tab.getPosition(), ((android.view.ViewGroup.LayoutParams) (createLayoutParamsForTabs())));
	//    3    5:aload_0         
	//    4    6:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//    8   14:aload_0         
	//    9   15:invokespecial   #407 <Method android.widget.LinearLayout$LayoutParams createLayoutParamsForTabs()>
	//   10   18:invokevirtual   #408 <Method void TabLayout$SlidingTabStrip.addView(View, int, android.view.ViewGroup$LayoutParams)>
	//   11   21:return          
	}

	private void addViewInternal(View view)
	{
		if(view instanceof TabItem)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #354 <Class TabItem>
	//*   2    4:ifeq            16
		{
			addTabFromItemView((TabItem)view);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #354 <Class TabItem>
	//    6   12:invokespecial   #412 <Method void addTabFromItemView(TabItem)>
			return;
	//    7   15:return          
		} else
		{
			throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
	//    8   16:new             #414 <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc2            #416 <String "Only TabItem instances can be added to TabLayout">
	//   11   23:invokespecial   #419 <Method void IllegalArgumentException(String)>
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
		if(getWindowToken() != null && ViewCompat.isLaidOut(((View) (this))) && !mTabStrip.childrenNeedLayout())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #424 <Method android.os.IBinder getWindowToken()>
	//*   6   10:ifnull          91
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #430 <Method boolean ViewCompat.isLaidOut(View)>
	//*   9   17:ifeq            91
	//*  10   20:aload_0         
	//*  11   21:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//*  12   24:invokevirtual   #434 <Method boolean TabLayout$SlidingTabStrip.childrenNeedLayout()>
	//*  13   27:ifeq            33
	//*  14   30:goto            91
		{
			int j = getScrollX();
	//   15   33:aload_0         
	//   16   34:invokevirtual   #437 <Method int getScrollX()>
	//   17   37:istore_2        
			int k = calculateScrollXForTab(i, 0.0F);
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:fconst_0        
	//   21   41:invokespecial   #441 <Method int calculateScrollXForTab(int, float)>
	//   22   44:istore_3        
			if(j != k)
	//*  23   45:iload_2         
	//*  24   46:iload_3         
	//*  25   47:icmpeq          79
			{
				ensureScrollAnimator();
	//   26   50:aload_0         
	//   27   51:invokespecial   #444 <Method void ensureScrollAnimator()>
				mScrollAnimator.setIntValues(new int[] {
					j, k
				});
	//   28   54:aload_0         
	//   29   55:getfield        #446 <Field ValueAnimator mScrollAnimator>
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
	//   40   69:invokevirtual   #452 <Method void ValueAnimator.setIntValues(int[])>
				mScrollAnimator.start();
	//   41   72:aload_0         
	//   42   73:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   43   76:invokevirtual   #455 <Method void ValueAnimator.start()>
			}
			mTabStrip.animateIndicatorToPosition(i, 300);
	//   44   79:aload_0         
	//   45   80:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   46   83:iload_1         
	//   47   84:sipush          300
	//   48   87:invokevirtual   #458 <Method void TabLayout$SlidingTabStrip.animateIndicatorToPosition(int, int)>
			return;
	//   49   90:return          
		} else
		{
			setScrollPosition(i, 0.0F, true);
	//   50   91:aload_0         
	//   51   92:iload_1         
	//   52   93:fconst_0        
	//   53   94:iconst_1        
	//   54   95:invokevirtual   #462 <Method void setScrollPosition(int, float, boolean)>
			return;
	//   55   98:return          
		}
	}

	private void applyModeAndGravity()
	{
		int i;
		if(mMode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #316 <Field int mMode>
	//*   2    4:ifne            24
			i = Math.max(0, mContentInsetStart - mTabPaddingStart);
	//    3    7:iconst_0        
	//    4    8:aload_0         
	//    5    9:getfield        #308 <Field int mContentInsetStart>
	//    6   12:aload_0         
	//    7   13:getfield        #220 <Field int mTabPaddingStart>
	//    8   16:isub            
	//    9   17:invokestatic    #467 <Method int Math.max(int, int)>
	//   10   20:istore_1        
		else
	//*  11   21:goto            26
			i = 0;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		ViewCompat.setPaddingRelative(((View) (mTabStrip)), i, 0, 0, 0);
	//   14   26:aload_0         
	//   15   27:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   16   30:iload_1         
	//   17   31:iconst_0        
	//   18   32:iconst_0        
	//   19   33:iconst_0        
	//   20   34:invokestatic    #471 <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
		switch(mMode)
	//*  21   37:aload_0         
	//*  22   38:getfield        #316 <Field int mMode>
		{
	//*  23   41:tableswitch     0 1: default 64
	//	               0 78
	//	               1 67
	//*  24   64:goto            88
		case 1: // '\001'
			mTabStrip.setGravity(1);
	//   25   67:aload_0         
	//   26   68:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   27   71:iconst_1        
	//   28   72:invokevirtual   #474 <Method void TabLayout$SlidingTabStrip.setGravity(int)>
			break;

	//*  29   75:goto            88
		case 0: // '\0'
			mTabStrip.setGravity(0x800003);
	//   30   78:aload_0         
	//   31   79:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   32   82:ldc2            #475 <Int 0x800003>
	//   33   85:invokevirtual   #474 <Method void TabLayout$SlidingTabStrip.setGravity(int)>
			break;
		}
		updateTabViews(true);
	//   34   88:aload_0         
	//   35   89:iconst_1        
	//   36   90:invokevirtual   #478 <Method void updateTabViews(boolean)>
	//   37   93:return          
	}

	private int calculateScrollXForTab(int i, float f)
	{
		int k = mMode;
	//    0    0:aload_0         
	//    1    1:getfield        #316 <Field int mMode>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(k == 0)
	//*   5    8:iload           4
	//*   6   10:ifne            128
		{
			View view1 = mTabStrip.getChildAt(i);
	//    7   13:aload_0         
	//    8   14:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #482 <Method View TabLayout$SlidingTabStrip.getChildAt(int)>
	//   11   21:astore          6
			i++;
	//   12   23:iload_1         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:istore_1        
			View view;
			if(i < mTabStrip.getChildCount())
	//*  16   27:iload_1         
	//*  17   28:aload_0         
	//*  18   29:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//*  19   32:invokevirtual   #485 <Method int TabLayout$SlidingTabStrip.getChildCount()>
	//*  20   35:icmpge          51
				view = mTabStrip.getChildAt(i);
	//   21   38:aload_0         
	//   22   39:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   23   42:iload_1         
	//   24   43:invokevirtual   #482 <Method View TabLayout$SlidingTabStrip.getChildAt(int)>
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
	//   32   61:invokevirtual   #490 <Method int View.getWidth()>
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
	//   40   77:invokevirtual   #490 <Method int View.getWidth()>
	//   41   80:istore_3        
			int l = (view1.getLeft() + i / 2) - getWidth() / 2;
	//   42   81:aload           6
	//   43   83:invokevirtual   #493 <Method int View.getLeft()>
	//   44   86:iload_1         
	//   45   87:iconst_2        
	//   46   88:idiv            
	//   47   89:iadd            
	//   48   90:aload_0         
	//   49   91:invokevirtual   #494 <Method int getWidth()>
	//   50   94:iconst_2        
	//   51   95:idiv            
	//   52   96:isub            
	//   53   97:istore          4
			i = (int)((float)(i + j) * 0.5F * f);
	//   54   99:iload_1         
	//   55  100:iload_3         
	//   56  101:iadd            
	//   57  102:i2f             
	//   58  103:ldc2            #495 <Float 0.5F>
	//   59  106:fmul            
	//   60  107:fload_2         
	//   61  108:fmul            
	//   62  109:f2i             
	//   63  110:istore_1        
			if(ViewCompat.getLayoutDirection(((View) (this))) == 0)
	//*  64  111:aload_0         
	//*  65  112:invokestatic    #499 <Method int ViewCompat.getLayoutDirection(View)>
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
	//    2    2:invokevirtual   #504 <Method void TabLayout$Tab.setPosition(int)>
		mTabs.add(i, ((Object) (tab)));
	//    3    5:aload_0         
	//    4    6:getfield        #138 <Field ArrayList mTabs>
	//    5    9:iload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #508 <Method void ArrayList.add(int, Object)>
		int j = mTabs.size();
	//    8   14:aload_0         
	//    9   15:getfield        #138 <Field ArrayList mTabs>
	//   10   18:invokevirtual   #511 <Method int ArrayList.size()>
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
				((Tab)mTabs.get(i)).setPosition(i);
	//   19   31:aload_0         
	//   20   32:getfield        #138 <Field ArrayList mTabs>
	//   21   35:iload_2         
	//   22   36:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   23   39:checkcast       #27  <Class TabLayout$Tab>
	//   24   42:iload_2         
	//   25   43:invokevirtual   #504 <Method void TabLayout$Tab.setPosition(int)>
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
	//    0    0:new             #280 <Class ColorStateList>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:anewarray       int[][]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:getstatic       #519 <Field int[] SELECTED_STATE_SET>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:getstatic       #522 <Field int[] EMPTY_STATE_SET>
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
	//   22   31:invokespecial   #525 <Method void ColorStateList(int[][], int[])>
	//   23   34:areturn         
	}

	private android.widget.LinearLayout.LayoutParams createLayoutParamsForTabs()
	{
		android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -1);
	//    0    0:new             #527 <Class android.widget.LinearLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:iconst_m1       
	//    4    7:invokespecial   #528 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//    5   10:astore_1        
		updateTabViewLayoutParams(layoutparams);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokespecial   #532 <Method void updateTabViewLayoutParams(android.widget.LinearLayout$LayoutParams)>
		return layoutparams;
	//    9   16:aload_1         
	//   10   17:areturn         
	}

	private TabView createTabView(Tab tab)
	{
		TabView tabview;
		if(mTabViewPool != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
	//*   2    4:ifnull          23
			tabview = (TabView)mTabViewPool.acquire();
	//    3    7:aload_0         
	//    4    8:getfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
	//    5   11:invokeinterface #540 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    6   16:checkcast       #36  <Class TabLayout$TabView>
	//    7   19:astore_2        
		else
	//*   8   20:goto            25
			tabview = null;
	//    9   23:aconst_null     
	//   10   24:astore_2        
		TabView tabview1 = tabview;
	//   11   25:aload_2         
	//   12   26:astore_3        
		if(tabview == null)
	//*  13   27:aload_2         
	//*  14   28:ifnonnull       44
			tabview1 = new TabView(getContext());
	//   15   31:new             #36  <Class TabLayout$TabView>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:invokevirtual   #544 <Method Context getContext()>
	//   20   40:invokespecial   #545 <Method void TabLayout$TabView(TabLayout, Context)>
	//   21   43:astore_3        
		tabview1.setTab(tab);
	//   22   44:aload_3         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #548 <Method void TabLayout$TabView.setTab(TabLayout$Tab)>
		tabview1.setFocusable(true);
	//   25   49:aload_3         
	//   26   50:iconst_1        
	//   27   51:invokevirtual   #551 <Method void TabLayout$TabView.setFocusable(boolean)>
		tabview1.setMinimumWidth(getTabMinWidth());
	//   28   54:aload_3         
	//   29   55:aload_0         
	//   30   56:invokespecial   #554 <Method int getTabMinWidth()>
	//   31   59:invokevirtual   #557 <Method void TabLayout$TabView.setMinimumWidth(int)>
		return tabview1;
	//   32   62:aload_3         
	//   33   63:areturn         
	}

	private void dispatchTabReselected(Tab tab)
	{
		for(int i = mSelectedListeners.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//*   2    4:invokevirtual   #511 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((OnTabSelectedListener)mSelectedListeners.get(i)).onTabReselected(tab);
	//    8   14:aload_0         
	//    9   15:getfield        #143 <Field ArrayList mSelectedListeners>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #14  <Class TabLayout$OnTabSelectedListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #561 <Method void TabLayout$OnTabSelectedListener.onTabReselected(TabLayout$Tab)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void dispatchTabSelected(Tab tab)
	{
		for(int i = mSelectedListeners.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//*   2    4:invokevirtual   #511 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((OnTabSelectedListener)mSelectedListeners.get(i)).onTabSelected(tab);
	//    8   14:aload_0         
	//    9   15:getfield        #143 <Field ArrayList mSelectedListeners>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #14  <Class TabLayout$OnTabSelectedListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #565 <Method void TabLayout$OnTabSelectedListener.onTabSelected(TabLayout$Tab)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void dispatchTabUnselected(Tab tab)
	{
		for(int i = mSelectedListeners.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//*   2    4:invokevirtual   #511 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iflt            38
			((OnTabSelectedListener)mSelectedListeners.get(i)).onTabUnselected(tab);
	//    8   14:aload_0         
	//    9   15:getfield        #143 <Field ArrayList mSelectedListeners>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #14  <Class TabLayout$OnTabSelectedListener>
	//   13   25:aload_1         
	//   14   26:invokeinterface #569 <Method void TabLayout$OnTabSelectedListener.onTabUnselected(TabLayout$Tab)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_2        
	//*  19   35:goto            10
	//   20   38:return          
	}

	private void ensureScrollAnimator()
	{
		if(mScrollAnimator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//*   2    4:ifnonnull       54
		{
			mScrollAnimator = new ValueAnimator();
	//    3    7:aload_0         
	//    4    8:new             #448 <Class ValueAnimator>
	//    5   11:dup             
	//    6   12:invokespecial   #570 <Method void ValueAnimator()>
	//    7   15:putfield        #446 <Field ValueAnimator mScrollAnimator>
			mScrollAnimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
	//    8   18:aload_0         
	//    9   19:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   10   22:getstatic       #576 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   11   25:invokevirtual   #580 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			mScrollAnimator.setDuration(300L);
	//   12   28:aload_0         
	//   13   29:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   14   32:ldc2w           #581 <Long 300L>
	//   15   35:invokevirtual   #586 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   16   38:pop             
			mScrollAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

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
	//   17   39:aload_0         
	//   18   40:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   19   43:new             #6   <Class TabLayout$1>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:invokespecial   #589 <Method void TabLayout$1(TabLayout)>
	//   23   51:invokevirtual   #593 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		}
	//   24   54:return          
	}

	private int getDefaultHeight()
	{
		int j = mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field ArrayList mTabs>
	//    2    4:invokevirtual   #511 <Method int ArrayList.size()>
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
			Tab tab = (Tab)mTabs.get(i);
	//   13   21:aload_0         
	//   14   22:getfield        #138 <Field ArrayList mTabs>
	//   15   25:iload_1         
	//   16   26:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #27  <Class TabLayout$Tab>
	//   18   32:astore          5
			if(tab != null && tab.getIcon() != null && !TextUtils.isEmpty(tab.getText()))
	//*  19   34:aload           5
	//*  20   36:ifnull          63
	//*  21   39:aload           5
	//*  22   41:invokevirtual   #598 <Method Drawable TabLayout$Tab.getIcon()>
	//*  23   44:ifnull          63
	//*  24   47:aload           5
	//*  25   49:invokevirtual   #601 <Method CharSequence TabLayout$Tab.getText()>
	//*  26   52:invokestatic    #387 <Method boolean TextUtils.isEmpty(CharSequence)>
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
		return !flag ? 48 : 72;
	//   36   70:iload_2         
	//   37   71:ifeq            77
	//   38   74:bipush          72
	//   39   76:ireturn         
	//   40   77:bipush          48
	//   41   79:ireturn         
	}

	private float getScrollPosition()
	{
		return mTabStrip.getIndicatorPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    2    4:invokevirtual   #606 <Method float TabLayout$SlidingTabStrip.getIndicatorPosition()>
	//    3    7:freturn         
	}

	private int getTabMinWidth()
	{
		if(mRequestedTabMinWidth != -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #293 <Field int mRequestedTabMinWidth>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			return mRequestedTabMinWidth;
	//    4    8:aload_0         
	//    5    9:getfield        #293 <Field int mRequestedTabMinWidth>
	//    6   12:ireturn         
		if(mMode == 0)
	//*   7   13:aload_0         
	//*   8   14:getfield        #316 <Field int mMode>
	//*   9   17:ifne            25
			return mScrollableTabMinWidth;
	//   10   20:aload_0         
	//   11   21:getfield        #342 <Field int mScrollableTabMinWidth>
	//   12   24:ireturn         
		else
			return 0;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	private int getTabScrollRange()
	{
		return Math.max(0, mTabStrip.getWidth() - getWidth() - getPaddingLeft() - getPaddingRight());
	//    0    0:iconst_0        
	//    1    1:aload_0         
	//    2    2:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    3    5:invokevirtual   #608 <Method int TabLayout$SlidingTabStrip.getWidth()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #494 <Method int getWidth()>
	//    6   12:isub            
	//    7   13:aload_0         
	//    8   14:invokevirtual   #611 <Method int getPaddingLeft()>
	//    9   17:isub            
	//   10   18:aload_0         
	//   11   19:invokevirtual   #614 <Method int getPaddingRight()>
	//   12   22:isub            
	//   13   23:invokestatic    #467 <Method int Math.max(int, int)>
	//   14   26:ireturn         
	}

	private void removeTabViewAt(int i)
	{
		TabView tabview = (TabView)mTabStrip.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #482 <Method View TabLayout$SlidingTabStrip.getChildAt(int)>
	//    4    8:checkcast       #36  <Class TabLayout$TabView>
	//    5   11:astore_2        
		mTabStrip.removeViewAt(i);
	//    6   12:aload_0         
	//    7   13:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #618 <Method void TabLayout$SlidingTabStrip.removeViewAt(int)>
		if(tabview != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          39
		{
			tabview.reset();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #621 <Method void TabLayout$TabView.reset()>
			mTabViewPool.release(((Object) (tabview)));
	//   14   28:aload_0         
	//   15   29:getfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
	//   16   32:aload_2         
	//   17   33:invokeinterface #625 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   18   38:pop             
		}
		requestLayout();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #628 <Method void requestLayout()>
	//   21   43:return          
	}

	private void setSelectedTabView(int i)
	{
		int k = mTabStrip.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    2    4:invokevirtual   #485 <Method int TabLayout$SlidingTabStrip.getChildCount()>
	//    3    7:istore_3        
		if(i < k)
	//*   4    8:iload_1         
	//*   5    9:iload_3         
	//*   6   10:icmpge          58
		{
			for(int j = 0; j < k; j++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          58
			{
				View view = mTabStrip.getChildAt(j);
	//   12   20:aload_0         
	//   13   21:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   14   24:iload_2         
	//   15   25:invokevirtual   #482 <Method View TabLayout$SlidingTabStrip.getChildAt(int)>
	//   16   28:astore          5
				boolean flag;
				if(j == i)
	//*  17   30:iload_2         
	//*  18   31:iload_1         
	//*  19   32:icmpne          41
					flag = true;
	//   20   35:iconst_1        
	//   21   36:istore          4
				else
	//*  22   38:goto            44
					flag = false;
	//   23   41:iconst_0        
	//   24   42:istore          4
				view.setSelected(flag);
	//   25   44:aload           5
	//   26   46:iload           4
	//   27   48:invokevirtual   #632 <Method void View.setSelected(boolean)>
			}

	//   28   51:iload_2         
	//   29   52:iconst_1        
	//   30   53:iadd            
	//   31   54:istore_2        
		}
	//*  32   55:goto            15
	//   33   58:return          
	}

	private void setupWithViewPager(ViewPager viewpager, boolean flag, boolean flag1)
	{
		if(mViewPager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #637 <Field ViewPager mViewPager>
	//*   2    4:ifnull          43
		{
			if(mPageChangeListener != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #639 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//*   5   11:ifnull          25
				mViewPager.removeOnPageChangeListener(((android.support.v4.view.ViewPager.OnPageChangeListener) (mPageChangeListener)));
	//    6   14:aload_0         
	//    7   15:getfield        #637 <Field ViewPager mViewPager>
	//    8   18:aload_0         
	//    9   19:getfield        #639 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//   10   22:invokevirtual   #645 <Method void ViewPager.removeOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
			if(mAdapterChangeListener != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #647 <Field TabLayout$AdapterChangeListener mAdapterChangeListener>
	//*  13   29:ifnull          43
				mViewPager.removeOnAdapterChangeListener(((android.support.v4.view.ViewPager.OnAdapterChangeListener) (mAdapterChangeListener)));
	//   14   32:aload_0         
	//   15   33:getfield        #637 <Field ViewPager mViewPager>
	//   16   36:aload_0         
	//   17   37:getfield        #647 <Field TabLayout$AdapterChangeListener mAdapterChangeListener>
	//   18   40:invokevirtual   #651 <Method void ViewPager.removeOnAdapterChangeListener(android.support.v4.view.ViewPager$OnAdapterChangeListener)>
		}
		if(mCurrentVpSelectedListener != null)
	//*  19   43:aload_0         
	//*  20   44:getfield        #653 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
	//*  21   47:ifnull          63
		{
			removeOnTabSelectedListener(mCurrentVpSelectedListener);
	//   22   50:aload_0         
	//   23   51:aload_0         
	//   24   52:getfield        #653 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
	//   25   55:invokevirtual   #657 <Method void removeOnTabSelectedListener(TabLayout$OnTabSelectedListener)>
			mCurrentVpSelectedListener = null;
	//   26   58:aload_0         
	//   27   59:aconst_null     
	//   28   60:putfield        #653 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
		}
		if(viewpager != null)
	//*  29   63:aload_1         
	//*  30   64:ifnull          192
		{
			mViewPager = viewpager;
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:putfield        #637 <Field ViewPager mViewPager>
			if(mPageChangeListener == null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #639 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//*  36   76:ifnonnull       91
				mPageChangeListener = new TabLayoutOnPageChangeListener(this);
	//   37   79:aload_0         
	//   38   80:new             #33  <Class TabLayout$TabLayoutOnPageChangeListener>
	//   39   83:dup             
	//   40   84:aload_0         
	//   41   85:invokespecial   #658 <Method void TabLayout$TabLayoutOnPageChangeListener(TabLayout)>
	//   42   88:putfield        #639 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
			mPageChangeListener.reset();
	//   43   91:aload_0         
	//   44   92:getfield        #639 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//   45   95:invokevirtual   #659 <Method void TabLayout$TabLayoutOnPageChangeListener.reset()>
			viewpager.addOnPageChangeListener(((android.support.v4.view.ViewPager.OnPageChangeListener) (mPageChangeListener)));
	//   46   98:aload_1         
	//   47   99:aload_0         
	//   48  100:getfield        #639 <Field TabLayout$TabLayoutOnPageChangeListener mPageChangeListener>
	//   49  103:invokevirtual   #662 <Method void ViewPager.addOnPageChangeListener(android.support.v4.view.ViewPager$OnPageChangeListener)>
			mCurrentVpSelectedListener = ((OnTabSelectedListener) (new ViewPagerOnTabSelectedListener(viewpager)));
	//   50  106:aload_0         
	//   51  107:new             #39  <Class TabLayout$ViewPagerOnTabSelectedListener>
	//   52  110:dup             
	//   53  111:aload_1         
	//   54  112:invokespecial   #665 <Method void TabLayout$ViewPagerOnTabSelectedListener(ViewPager)>
	//   55  115:putfield        #653 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
			addOnTabSelectedListener(mCurrentVpSelectedListener);
	//   56  118:aload_0         
	//   57  119:aload_0         
	//   58  120:getfield        #653 <Field TabLayout$OnTabSelectedListener mCurrentVpSelectedListener>
	//   59  123:invokevirtual   #668 <Method void addOnTabSelectedListener(TabLayout$OnTabSelectedListener)>
			PagerAdapter pageradapter = viewpager.getAdapter();
	//   60  126:aload_1         
	//   61  127:invokevirtual   #672 <Method PagerAdapter ViewPager.getAdapter()>
	//   62  130:astore          4
			if(pageradapter != null)
	//*  63  132:aload           4
	//*  64  134:ifnull          144
				setPagerAdapter(pageradapter, flag);
	//   65  137:aload_0         
	//   66  138:aload           4
	//   67  140:iload_2         
	//   68  141:invokevirtual   #676 <Method void setPagerAdapter(PagerAdapter, boolean)>
			if(mAdapterChangeListener == null)
	//*  69  144:aload_0         
	//*  70  145:getfield        #647 <Field TabLayout$AdapterChangeListener mAdapterChangeListener>
	//*  71  148:ifnonnull       163
				mAdapterChangeListener = new AdapterChangeListener();
	//   72  151:aload_0         
	//   73  152:new             #8   <Class TabLayout$AdapterChangeListener>
	//   74  155:dup             
	//   75  156:aload_0         
	//   76  157:invokespecial   #677 <Method void TabLayout$AdapterChangeListener(TabLayout)>
	//   77  160:putfield        #647 <Field TabLayout$AdapterChangeListener mAdapterChangeListener>
			mAdapterChangeListener.setAutoRefresh(flag);
	//   78  163:aload_0         
	//   79  164:getfield        #647 <Field TabLayout$AdapterChangeListener mAdapterChangeListener>
	//   80  167:iload_2         
	//   81  168:invokevirtual   #680 <Method void TabLayout$AdapterChangeListener.setAutoRefresh(boolean)>
			viewpager.addOnAdapterChangeListener(((android.support.v4.view.ViewPager.OnAdapterChangeListener) (mAdapterChangeListener)));
	//   82  171:aload_1         
	//   83  172:aload_0         
	//   84  173:getfield        #647 <Field TabLayout$AdapterChangeListener mAdapterChangeListener>
	//   85  176:invokevirtual   #683 <Method void ViewPager.addOnAdapterChangeListener(android.support.v4.view.ViewPager$OnAdapterChangeListener)>
			setScrollPosition(viewpager.getCurrentItem(), 0.0F, true);
	//   86  179:aload_0         
	//   87  180:aload_1         
	//   88  181:invokevirtual   #686 <Method int ViewPager.getCurrentItem()>
	//   89  184:fconst_0        
	//   90  185:iconst_1        
	//   91  186:invokevirtual   #462 <Method void setScrollPosition(int, float, boolean)>
		} else
	//*  92  189:goto            203
		{
			mViewPager = null;
	//   93  192:aload_0         
	//   94  193:aconst_null     
	//   95  194:putfield        #637 <Field ViewPager mViewPager>
			setPagerAdapter(((PagerAdapter) (null)), false);
	//   96  197:aload_0         
	//   97  198:aconst_null     
	//   98  199:iconst_0        
	//   99  200:invokevirtual   #676 <Method void setPagerAdapter(PagerAdapter, boolean)>
		}
		mSetupViewPagerImplicitly = flag1;
	//  100  203:aload_0         
	//  101  204:iload_3         
	//  102  205:putfield        #688 <Field boolean mSetupViewPagerImplicitly>
	//  103  208:return          
	}

	private void updateAllTabs()
	{
		int j = mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field ArrayList mTabs>
	//    2    4:invokevirtual   #511 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((Tab)mTabs.get(i)).updateView();
	//    9   15:aload_0         
	//   10   16:getfield        #138 <Field ArrayList mTabs>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #27  <Class TabLayout$Tab>
	//   14   26:invokevirtual   #692 <Method void TabLayout$Tab.updateView()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
	//   20   36:return          
	}

	private void updateTabViewLayoutParams(android.widget.LinearLayout.LayoutParams layoutparams)
	{
		if(mMode == 1 && mTabGravity == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #316 <Field int mMode>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          26
	//*   4    8:aload_0         
	//*   5    9:getfield        #321 <Field int mTabGravity>
	//*   6   12:ifne            26
		{
			layoutparams.width = 0;
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:putfield        #695 <Field int android.widget.LinearLayout$LayoutParams.width>
			layoutparams.weight = 1.0F;
	//   10   20:aload_1         
	//   11   21:fconst_1        
	//   12   22:putfield        #698 <Field float android.widget.LinearLayout$LayoutParams.weight>
			return;
	//   13   25:return          
		} else
		{
			layoutparams.width = -2;
	//   14   26:aload_1         
	//   15   27:bipush          -2
	//   16   29:putfield        #695 <Field int android.widget.LinearLayout$LayoutParams.width>
			layoutparams.weight = 0.0F;
	//   17   32:aload_1         
	//   18   33:fconst_0        
	//   19   34:putfield        #698 <Field float android.widget.LinearLayout$LayoutParams.weight>
			return;
	//   20   37:return          
		}
	}

	public void addOnTabSelectedListener(OnTabSelectedListener ontabselectedlistener)
	{
		if(!mSelectedListeners.contains(((Object) (ontabselectedlistener))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #701 <Method boolean ArrayList.contains(Object)>
	//*   4    8:ifne            20
			mSelectedListeners.add(((Object) (ontabselectedlistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #143 <Field ArrayList mSelectedListeners>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #703 <Method boolean ArrayList.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void addTab(Tab tab)
	{
		addTab(tab, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #138 <Field ArrayList mTabs>
	//    4    6:invokevirtual   #705 <Method boolean ArrayList.isEmpty()>
	//    5    9:invokevirtual   #708 <Method void addTab(TabLayout$Tab, boolean)>
	//    6   12:return          
	}

	public void addTab(Tab tab, int i)
	{
		addTab(tab, i, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #138 <Field ArrayList mTabs>
	//    5    7:invokevirtual   #705 <Method boolean ArrayList.isEmpty()>
	//    6   10:invokevirtual   #711 <Method void addTab(TabLayout$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addTab(Tab tab, int i, boolean flag)
	{
		if(tab.mParent != this)
	//*   0    0:aload_1         
	//*   1    1:getfield        #715 <Field TabLayout TabLayout$Tab.mParent>
	//*   2    4:aload_0         
	//*   3    5:if_acmpeq       19
			throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
	//    4    8:new             #414 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc2            #717 <String "Tab belongs to a different TabLayout.">
	//    7   15:invokespecial   #419 <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		configureTab(tab, i);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:invokespecial   #719 <Method void configureTab(TabLayout$Tab, int)>
		addTabView(tab);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokespecial   #721 <Method void addTabView(TabLayout$Tab)>
		if(flag)
	//*  16   30:iload_3         
	//*  17   31:ifeq            38
			tab.select();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #724 <Method void TabLayout$Tab.select()>
	//   20   38:return          
	}

	public void addTab(Tab tab, boolean flag)
	{
		addTab(tab, mTabs.size(), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #138 <Field ArrayList mTabs>
	//    4    6:invokevirtual   #511 <Method int ArrayList.size()>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #711 <Method void addTab(TabLayout$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addView(View view)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #726 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void addView(View view, int i)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #726 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #726 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		addViewInternal(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #726 <Method void addViewInternal(View)>
	//    3    5:return          
	}

	public void clearOnTabSelectedListeners()
	{
		mSelectedListeners.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//    2    4:invokevirtual   #732 <Method void ArrayList.clear()>
	//    3    7:return          
	}

	int dpToPx(int i)
	{
		return Math.round(getResources().getDisplayMetrics().density * (float)i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #325 <Method Resources getResources()>
	//    2    4:invokevirtual   #737 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    3    7:getfield        #742 <Field float DisplayMetrics.density>
	//    4   10:iload_1         
	//    5   11:i2f             
	//    6   12:fmul            
	//    7   13:invokestatic    #746 <Method int Math.round(float)>
	//    8   16:ireturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #751 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return generateDefaultLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #755 <Method android.widget.FrameLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public int getSelectedTabPosition()
	{
		if(mSelectedTab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #758 <Field TabLayout$Tab mSelectedTab>
	//*   2    4:ifnull          15
			return mSelectedTab.getPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #758 <Field TabLayout$Tab mSelectedTab>
	//    5   11:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//    6   14:ireturn         
		else
			return -1;
	//    7   15:iconst_m1       
	//    8   16:ireturn         
	}

	public Tab getTabAt(int i)
	{
		if(i >= 0 && i < getTabCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            27
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #762 <Method int getTabCount()>
	//*   5    9:icmplt          15
	//*   6   12:goto            27
			return (Tab)mTabs.get(i);
	//    7   15:aload_0         
	//    8   16:getfield        #138 <Field ArrayList mTabs>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   11   23:checkcast       #27  <Class TabLayout$Tab>
	//   12   26:areturn         
		else
			return null;
	//   13   27:aconst_null     
	//   14   28:areturn         
	}

	public int getTabCount()
	{
		return mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field ArrayList mTabs>
	//    2    4:invokevirtual   #511 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public int getTabGravity()
	{
		return mTabGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field int mTabGravity>
	//    2    4:ireturn         
	}

	int getTabMaxWidth()
	{
		return mTabMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int mTabMaxWidth>
	//    2    4:ireturn         
	}

	public int getTabMode()
	{
		return mMode;
	//    0    0:aload_0         
	//    1    1:getfield        #316 <Field int mMode>
	//    2    4:ireturn         
	}

	public ColorStateList getTabTextColors()
	{
		return mTabTextColors;
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field ColorStateList mTabTextColors>
	//    2    4:areturn         
	}

	public Tab newTab()
	{
		Tab tab1 = (Tab)sTabPool.acquire();
	//    0    0:getstatic       #123 <Field android.support.v4.util.Pools$Pool sTabPool>
	//    1    3:invokeinterface #540 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #27  <Class TabLayout$Tab>
	//    3   11:astore_2        
		Tab tab = tab1;
	//    4   12:aload_2         
	//    5   13:astore_1        
		if(tab1 == null)
	//*   6   14:aload_2         
	//*   7   15:ifnonnull       26
			tab = new Tab();
	//    8   18:new             #27  <Class TabLayout$Tab>
	//    9   21:dup             
	//   10   22:invokespecial   #769 <Method void TabLayout$Tab()>
	//   11   25:astore_1        
		tab.mParent = this;
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:putfield        #715 <Field TabLayout TabLayout$Tab.mParent>
		tab.mView = createTabView(tab);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokespecial   #771 <Method TabLayout$TabView createTabView(TabLayout$Tab)>
	//   19   37:putfield        #400 <Field TabLayout$TabView TabLayout$Tab.mView>
		return tab;
	//   20   40:aload_1         
	//   21   41:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #774 <Method void HorizontalScrollView.onAttachedToWindow()>
		if(mViewPager == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #637 <Field ViewPager mViewPager>
	//*   4    8:ifnonnull       33
		{
			android.view.ViewParent viewparent = getParent();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #778 <Method android.view.ViewParent getParent()>
	//    7   15:astore_1        
			if(viewparent instanceof ViewPager)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #641 <Class ViewPager>
	//*  10   20:ifeq            33
				setupWithViewPager((ViewPager)viewparent, true, true);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:checkcast       #641 <Class ViewPager>
	//   14   28:iconst_1        
	//   15   29:iconst_1        
	//   16   30:invokespecial   #780 <Method void setupWithViewPager(ViewPager, boolean, boolean)>
		}
	//   17   33:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #783 <Method void HorizontalScrollView.onDetachedFromWindow()>
		if(mSetupViewPagerImplicitly)
	//*   2    4:aload_0         
	//*   3    5:getfield        #688 <Field boolean mSetupViewPagerImplicitly>
	//*   4    8:ifeq            21
		{
			setupWithViewPager(((ViewPager) (null)));
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #785 <Method void setupWithViewPager(ViewPager)>
			mSetupViewPagerImplicitly = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #688 <Field boolean mSetupViewPagerImplicitly>
		}
	//   11   21:return          
	}

	protected void onMeasure(int i, int j)
	{
		View view;
		int k = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #788 <Method int getDefaultHeight()>
	//    3    5:invokevirtual   #790 <Method int dpToPx(int)>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #793 <Method int getPaddingTop()>
	//    6   12:iadd            
	//    7   13:aload_0         
	//    8   14:invokevirtual   #796 <Method int getPaddingBottom()>
	//    9   17:iadd            
	//   10   18:istore_3        
		int l = android.view.View.MeasureSpec.getMode(j);
	//   11   19:iload_2         
	//   12   20:invokestatic    #801 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   13   23:istore          4
		if(l != 0x80000000)
	//*  14   25:iload           4
	//*  15   27:ldc2            #802 <Int 0x80000000>
	//*  16   30:icmpeq          52
		{
			if(l == 0)
	//*  17   33:iload           4
	//*  18   35:ifeq            41
	//*  19   38:goto            67
				j = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
	//   20   41:iload_3         
	//   21   42:ldc2            #803 <Int 0x40000000>
	//   22   45:invokestatic    #806 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   48:istore_2        
		} else
	//*  24   49:goto            67
		{
			j = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k, android.view.View.MeasureSpec.getSize(j)), 0x40000000);
	//   25   52:iload_3         
	//   26   53:iload_2         
	//   27   54:invokestatic    #809 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   28   57:invokestatic    #812 <Method int Math.min(int, int)>
	//   29   60:ldc2            #803 <Int 0x40000000>
	//   30   63:invokestatic    #806 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   31   66:istore_2        
		}
		k = android.view.View.MeasureSpec.getSize(i);
	//   32   67:iload_1         
	//   33   68:invokestatic    #809 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   34   71:istore_3        
		if(android.view.View.MeasureSpec.getMode(i) != 0)
	//*  35   72:iload_1         
	//*  36   73:invokestatic    #801 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  37   76:ifeq            108
		{
			if(mRequestedTabMaxWidth > 0)
	//*  38   79:aload_0         
	//*  39   80:getfield        #298 <Field int mRequestedTabMaxWidth>
	//*  40   83:ifle            94
				k = mRequestedTabMaxWidth;
	//   41   86:aload_0         
	//   42   87:getfield        #298 <Field int mRequestedTabMaxWidth>
	//   43   90:istore_3        
			else
	//*  44   91:goto            103
				k -= dpToPx(56);
	//   45   94:iload_3         
	//   46   95:aload_0         
	//   47   96:bipush          56
	//   48   98:invokevirtual   #790 <Method int dpToPx(int)>
	//   49  101:isub            
	//   50  102:istore_3        
			mTabMaxWidth = k;
	//   51  103:aload_0         
	//   52  104:iload_3         
	//   53  105:putfield        #141 <Field int mTabMaxWidth>
		}
		super.onMeasure(i, j);
	//   54  108:aload_0         
	//   55  109:iload_1         
	//   56  110:iload_2         
	//   57  111:invokespecial   #814 <Method void HorizontalScrollView.onMeasure(int, int)>
		if(getChildCount() != 1)
			break MISSING_BLOCK_LABEL_233;
	//   58  114:aload_0         
	//   59  115:invokevirtual   #815 <Method int getChildCount()>
	//   60  118:iconst_1        
	//   61  119:icmpne          233
		i = 0;
	//   62  122:iconst_0        
	//   63  123:istore_1        
		view = getChildAt(0);
	//   64  124:aload_0         
	//   65  125:iconst_0        
	//   66  126:invokevirtual   #816 <Method View getChildAt(int)>
	//   67  129:astore          5
		mMode;
	//   68  131:aload_0         
	//   69  132:getfield        #316 <Field int mMode>
		JVM INSTR tableswitch 0 1: default 156
	//	               0 176
	//	               1 159;
	//   70  135:tableswitch     0 1: default 156
	//	               0 176
	//	               1 159
		   goto _L1 _L2 _L3
_L1:
		break; /* Loop/switch isn't completed */
	//   71  156:goto            191
_L3:
		if(view.getMeasuredWidth() == getMeasuredWidth())
			break; /* Loop/switch isn't completed */
	//   72  159:aload           5
	//   73  161:invokevirtual   #819 <Method int View.getMeasuredWidth()>
	//   74  164:aload_0         
	//   75  165:invokevirtual   #820 <Method int getMeasuredWidth()>
	//   76  168:icmpeq          191
_L4:
		i = 1;
	//   77  171:iconst_1        
	//   78  172:istore_1        
		break; /* Loop/switch isn't completed */
	//   79  173:goto            191
_L2:
		if(view.getMeasuredWidth() >= getMeasuredWidth()) goto _L5; else goto _L4
	//   80  176:aload           5
	//   81  178:invokevirtual   #819 <Method int View.getMeasuredWidth()>
	//   82  181:aload_0         
	//   83  182:invokevirtual   #820 <Method int getMeasuredWidth()>
	//   84  185:icmpge          191
	//*  85  188:goto            171
_L5:
		if(i != 0)
	//*  86  191:iload_1         
	//*  87  192:ifeq            233
		{
			i = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height);
	//   88  195:iload_2         
	//   89  196:aload_0         
	//   90  197:invokevirtual   #793 <Method int getPaddingTop()>
	//   91  200:aload_0         
	//   92  201:invokevirtual   #796 <Method int getPaddingBottom()>
	//   93  204:iadd            
	//   94  205:aload           5
	//   95  207:invokevirtual   #824 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   96  210:getfield        #829 <Field int android.view.ViewGroup$LayoutParams.height>
	//   97  213:invokestatic    #833 <Method int getChildMeasureSpec(int, int, int)>
	//   98  216:istore_1        
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000), i);
	//   99  217:aload           5
	//  100  219:aload_0         
	//  101  220:invokevirtual   #820 <Method int getMeasuredWidth()>
	//  102  223:ldc2            #803 <Int 0x40000000>
	//  103  226:invokestatic    #806 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  104  229:iload_1         
	//  105  230:invokevirtual   #836 <Method void View.measure(int, int)>
		}
	//  106  233:return          
	}

	void populateFromPagerAdapter()
	{
		removeAllTabs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #840 <Method void removeAllTabs()>
		if(mPagerAdapter != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #842 <Field PagerAdapter mPagerAdapter>
	//*   4    8:ifnull          97
		{
			int k = mPagerAdapter.getCount();
	//    5   11:aload_0         
	//    6   12:getfield        #842 <Field PagerAdapter mPagerAdapter>
	//    7   15:invokevirtual   #847 <Method int PagerAdapter.getCount()>
	//    8   18:istore_2        
			for(int i = 0; i < k; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_1        
	//*  11   21:iload_1         
	//*  12   22:iload_2         
	//*  13   23:icmpge          53
				addTab(newTab().setText(mPagerAdapter.getPageTitle(i)), false);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #352 <Method TabLayout$Tab newTab()>
	//   17   31:aload_0         
	//   18   32:getfield        #842 <Field PagerAdapter mPagerAdapter>
	//   19   35:iload_1         
	//   20   36:invokevirtual   #851 <Method CharSequence PagerAdapter.getPageTitle(int)>
	//   21   39:invokevirtual   #362 <Method TabLayout$Tab TabLayout$Tab.setText(CharSequence)>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #708 <Method void addTab(TabLayout$Tab, boolean)>

	//   24   46:iload_1         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_1        
	//*  28   50:goto            21
			if(mViewPager != null && k > 0)
	//*  29   53:aload_0         
	//*  30   54:getfield        #637 <Field ViewPager mViewPager>
	//*  31   57:ifnull          97
	//*  32   60:iload_2         
	//*  33   61:ifle            97
			{
				int j = mViewPager.getCurrentItem();
	//   34   64:aload_0         
	//   35   65:getfield        #637 <Field ViewPager mViewPager>
	//   36   68:invokevirtual   #686 <Method int ViewPager.getCurrentItem()>
	//   37   71:istore_1        
				if(j != getSelectedTabPosition() && j < getTabCount())
	//*  38   72:iload_1         
	//*  39   73:aload_0         
	//*  40   74:invokevirtual   #853 <Method int getSelectedTabPosition()>
	//*  41   77:icmpeq          97
	//*  42   80:iload_1         
	//*  43   81:aload_0         
	//*  44   82:invokevirtual   #762 <Method int getTabCount()>
	//*  45   85:icmpge          97
					selectTab(getTabAt(j));
	//   46   88:aload_0         
	//   47   89:aload_0         
	//   48   90:iload_1         
	//   49   91:invokevirtual   #855 <Method TabLayout$Tab getTabAt(int)>
	//   50   94:invokevirtual   #858 <Method void selectTab(TabLayout$Tab)>
			}
		}
	//   51   97:return          
	}

	public void removeAllTabs()
	{
		for(int i = mTabStrip.getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//*   2    4:invokevirtual   #485 <Method int TabLayout$SlidingTabStrip.getChildCount()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            26
			removeTabViewAt(i);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokespecial   #860 <Method void removeTabViewAt(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            10
		Tab tab;
		for(Iterator iterator = mTabs.iterator(); iterator.hasNext(); sTabPool.release(((Object) (tab))))
	//*  16   26:aload_0         
	//*  17   27:getfield        #138 <Field ArrayList mTabs>
	//*  18   30:invokevirtual   #864 <Method Iterator ArrayList.iterator()>
	//*  19   33:astore_2        
	//*  20   34:aload_2         
	//*  21   35:invokeinterface #869 <Method boolean Iterator.hasNext()>
	//*  22   40:ifeq            76
		{
			tab = (Tab)iterator.next();
	//   23   43:aload_2         
	//   24   44:invokeinterface #872 <Method Object Iterator.next()>
	//   25   49:checkcast       #27  <Class TabLayout$Tab>
	//   26   52:astore_3        
			iterator.remove();
	//   27   53:aload_2         
	//   28   54:invokeinterface #875 <Method void Iterator.remove()>
			tab.reset();
	//   29   59:aload_3         
	//   30   60:invokevirtual   #876 <Method void TabLayout$Tab.reset()>
		}

	//   31   63:getstatic       #123 <Field android.support.v4.util.Pools$Pool sTabPool>
	//   32   66:aload_3         
	//   33   67:invokeinterface #625 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   34   72:pop             
	//*  35   73:goto            34
		mSelectedTab = null;
	//   36   76:aload_0         
	//   37   77:aconst_null     
	//   38   78:putfield        #758 <Field TabLayout$Tab mSelectedTab>
	//   39   81:return          
	}

	public void removeOnTabSelectedListener(OnTabSelectedListener ontabselectedlistener)
	{
		mSelectedListeners.remove(((Object) (ontabselectedlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field ArrayList mSelectedListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #878 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTab(Tab tab)
	{
		if(tab.mParent != this)
	//*   0    0:aload_1         
	//*   1    1:getfield        #715 <Field TabLayout TabLayout$Tab.mParent>
	//*   2    4:aload_0         
	//*   3    5:if_acmpeq       19
		{
			throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
	//    4    8:new             #414 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc2            #881 <String "Tab does not belong to this TabLayout.">
	//    7   15:invokespecial   #419 <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		} else
		{
			removeTabAt(tab.getPosition());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//   12   24:invokevirtual   #884 <Method void removeTabAt(int)>
			return;
	//   13   27:return          
		}
	}

	public void removeTabAt(int i)
	{
		int j;
		if(mSelectedTab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #758 <Field TabLayout$Tab mSelectedTab>
	//*   2    4:ifnull          18
			j = mSelectedTab.getPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #758 <Field TabLayout$Tab mSelectedTab>
	//    5   11:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//    6   14:istore_2        
		else
	//*   7   15:goto            20
			j = 0;
	//    8   18:iconst_0        
	//    9   19:istore_2        
		removeTabViewAt(i);
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:invokespecial   #860 <Method void removeTabViewAt(int)>
		Tab tab = (Tab)mTabs.remove(i);
	//   13   25:aload_0         
	//   14   26:getfield        #138 <Field ArrayList mTabs>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #886 <Method Object ArrayList.remove(int)>
	//   17   33:checkcast       #27  <Class TabLayout$Tab>
	//   18   36:astore          5
		if(tab != null)
	//*  19   38:aload           5
	//*  20   40:ifnull          59
		{
			tab.reset();
	//   21   43:aload           5
	//   22   45:invokevirtual   #876 <Method void TabLayout$Tab.reset()>
			sTabPool.release(((Object) (tab)));
	//   23   48:getstatic       #123 <Field android.support.v4.util.Pools$Pool sTabPool>
	//   24   51:aload           5
	//   25   53:invokeinterface #625 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//   26   58:pop             
		}
		int l = mTabs.size();
	//   27   59:aload_0         
	//   28   60:getfield        #138 <Field ArrayList mTabs>
	//   29   63:invokevirtual   #511 <Method int ArrayList.size()>
	//   30   66:istore          4
		for(int k = i; k < l; k++)
	//*  31   68:iload_1         
	//*  32   69:istore_3        
	//*  33   70:iload_3         
	//*  34   71:iload           4
	//*  35   73:icmpge          98
			((Tab)mTabs.get(k)).setPosition(k);
	//   36   76:aload_0         
	//   37   77:getfield        #138 <Field ArrayList mTabs>
	//   38   80:iload_3         
	//   39   81:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   40   84:checkcast       #27  <Class TabLayout$Tab>
	//   41   87:iload_3         
	//   42   88:invokevirtual   #504 <Method void TabLayout$Tab.setPosition(int)>

	//   43   91:iload_3         
	//   44   92:iconst_1        
	//   45   93:iadd            
	//   46   94:istore_3        
	//*  47   95:goto            70
		if(j == i)
	//*  48   98:iload_2         
	//*  49   99:iload_1         
	//*  50  100:icmpne          144
		{
			Tab tab1;
			if(mTabs.isEmpty())
	//*  51  103:aload_0         
	//*  52  104:getfield        #138 <Field ArrayList mTabs>
	//*  53  107:invokevirtual   #705 <Method boolean ArrayList.isEmpty()>
	//*  54  110:ifeq            119
				tab1 = null;
	//   55  113:aconst_null     
	//   56  114:astore          5
			else
	//*  57  116:goto            138
				tab1 = (Tab)mTabs.get(Math.max(0, i - 1));
	//   58  119:aload_0         
	//   59  120:getfield        #138 <Field ArrayList mTabs>
	//   60  123:iconst_0        
	//   61  124:iload_1         
	//   62  125:iconst_1        
	//   63  126:isub            
	//   64  127:invokestatic    #467 <Method int Math.max(int, int)>
	//   65  130:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   66  133:checkcast       #27  <Class TabLayout$Tab>
	//   67  136:astore          5
			selectTab(tab1);
	//   68  138:aload_0         
	//   69  139:aload           5
	//   70  141:invokevirtual   #858 <Method void selectTab(TabLayout$Tab)>
		}
	//   71  144:return          
	}

	void selectTab(Tab tab)
	{
		selectTab(tab, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #888 <Method void selectTab(TabLayout$Tab, boolean)>
	//    4    6:return          
	}

	void selectTab(Tab tab, boolean flag)
	{
		Tab tab1 = mSelectedTab;
	//    0    0:aload_0         
	//    1    1:getfield        #758 <Field TabLayout$Tab mSelectedTab>
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
	//   10   19:invokespecial   #890 <Method void dispatchTabReselected(TabLayout$Tab)>
				animateToTab(tab.getPosition());
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//   14   27:invokespecial   #892 <Method void animateToTab(int)>
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
	//   19   36:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
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
	//*  29   56:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
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
	//   39   72:invokevirtual   #462 <Method void setScrollPosition(int, float, boolean)>
				else
	//*  40   75:goto            83
					animateToTab(i);
	//   41   78:aload_0         
	//   42   79:iload_3         
	//   43   80:invokespecial   #892 <Method void animateToTab(int)>
				if(i != -1)
	//*  44   83:iload_3         
	//*  45   84:iconst_m1       
	//*  46   85:icmpeq          93
					setSelectedTabView(i);
	//   47   88:aload_0         
	//   48   89:iload_3         
	//   49   90:invokespecial   #894 <Method void setSelectedTabView(int)>
			}
			if(tab1 != null)
	//*  50   93:aload           4
	//*  51   95:ifnull          104
				dispatchTabUnselected(tab1);
	//   52   98:aload_0         
	//   53   99:aload           4
	//   54  101:invokespecial   #896 <Method void dispatchTabUnselected(TabLayout$Tab)>
			mSelectedTab = tab;
	//   55  104:aload_0         
	//   56  105:aload_1         
	//   57  106:putfield        #758 <Field TabLayout$Tab mSelectedTab>
			if(tab != null)
	//*  58  109:aload_1         
	//*  59  110:ifnull          118
				dispatchTabSelected(tab);
	//   60  113:aload_0         
	//   61  114:aload_1         
	//   62  115:invokespecial   #898 <Method void dispatchTabSelected(TabLayout$Tab)>
		}
	//   63  118:return          
	}

	public void setOnTabSelectedListener(OnTabSelectedListener ontabselectedlistener)
	{
		if(mSelectedListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #902 <Field TabLayout$OnTabSelectedListener mSelectedListener>
	//*   2    4:ifnull          15
			removeOnTabSelectedListener(mSelectedListener);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #902 <Field TabLayout$OnTabSelectedListener mSelectedListener>
	//    6   12:invokevirtual   #657 <Method void removeOnTabSelectedListener(TabLayout$OnTabSelectedListener)>
		mSelectedListener = ontabselectedlistener;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #902 <Field TabLayout$OnTabSelectedListener mSelectedListener>
		if(ontabselectedlistener != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			addOnTabSelectedListener(ontabselectedlistener);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #668 <Method void addOnTabSelectedListener(TabLayout$OnTabSelectedListener)>
	//   15   29:return          
	}

	void setPagerAdapter(PagerAdapter pageradapter, boolean flag)
	{
		if(mPagerAdapter != null && mPagerAdapterObserver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #842 <Field PagerAdapter mPagerAdapter>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #905 <Field DataSetObserver mPagerAdapterObserver>
	//*   5   11:ifnull          25
			mPagerAdapter.unregisterDataSetObserver(mPagerAdapterObserver);
	//    6   14:aload_0         
	//    7   15:getfield        #842 <Field PagerAdapter mPagerAdapter>
	//    8   18:aload_0         
	//    9   19:getfield        #905 <Field DataSetObserver mPagerAdapterObserver>
	//   10   22:invokevirtual   #909 <Method void PagerAdapter.unregisterDataSetObserver(DataSetObserver)>
		mPagerAdapter = pageradapter;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #842 <Field PagerAdapter mPagerAdapter>
		if(flag && pageradapter != null)
	//*  14   30:iload_2         
	//*  15   31:ifeq            65
	//*  16   34:aload_1         
	//*  17   35:ifnull          65
		{
			if(mPagerAdapterObserver == null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #905 <Field DataSetObserver mPagerAdapterObserver>
	//*  20   42:ifnonnull       57
				mPagerAdapterObserver = ((DataSetObserver) (new PagerAdapterObserver()));
	//   21   45:aload_0         
	//   22   46:new             #17  <Class TabLayout$PagerAdapterObserver>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:invokespecial   #910 <Method void TabLayout$PagerAdapterObserver(TabLayout)>
	//   26   54:putfield        #905 <Field DataSetObserver mPagerAdapterObserver>
			pageradapter.registerDataSetObserver(mPagerAdapterObserver);
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #905 <Field DataSetObserver mPagerAdapterObserver>
	//   30   62:invokevirtual   #913 <Method void PagerAdapter.registerDataSetObserver(DataSetObserver)>
		}
		populateFromPagerAdapter();
	//   31   65:aload_0         
	//   32   66:invokevirtual   #915 <Method void populateFromPagerAdapter()>
	//   33   69:return          
	}

	void setScrollAnimatorListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		ensureScrollAnimator();
	//    0    0:aload_0         
	//    1    1:invokespecial   #444 <Method void ensureScrollAnimator()>
		mScrollAnimator.addListener(animatorlistener);
	//    2    4:aload_0         
	//    3    5:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #920 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
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
	//    5    5:invokevirtual   #923 <Method void setScrollPosition(int, float, boolean, boolean)>
	//    6    8:return          
	}

	void setScrollPosition(int i, float f, boolean flag, boolean flag1)
	{
		int j = Math.round((float)i + f);
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:fload_2         
	//    3    3:fadd            
	//    4    4:invokestatic    #746 <Method int Math.round(float)>
	//    5    7:istore          5
		if(j >= 0)
	//*   6    9:iload           5
	//*   7   11:iflt            87
		{
			if(j >= mTabStrip.getChildCount())
	//*   8   14:iload           5
	//*   9   16:aload_0         
	//*  10   17:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//*  11   20:invokevirtual   #485 <Method int TabLayout$SlidingTabStrip.getChildCount()>
	//*  12   23:icmplt          27
				return;
	//   13   26:return          
			if(flag1)
	//*  14   27:iload           4
	//*  15   29:ifeq            41
				mTabStrip.setIndicatorPositionFromTabPosition(i, f);
	//   16   32:aload_0         
	//   17   33:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   18   36:iload_1         
	//   19   37:fload_2         
	//   20   38:invokevirtual   #927 <Method void TabLayout$SlidingTabStrip.setIndicatorPositionFromTabPosition(int, float)>
			if(mScrollAnimator != null && mScrollAnimator.isRunning())
	//*  21   41:aload_0         
	//*  22   42:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//*  23   45:ifnull          65
	//*  24   48:aload_0         
	//*  25   49:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//*  26   52:invokevirtual   #930 <Method boolean ValueAnimator.isRunning()>
	//*  27   55:ifeq            65
				mScrollAnimator.cancel();
	//   28   58:aload_0         
	//   29   59:getfield        #446 <Field ValueAnimator mScrollAnimator>
	//   30   62:invokevirtual   #933 <Method void ValueAnimator.cancel()>
			scrollTo(calculateScrollXForTab(i, f), 0);
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:iload_1         
	//   34   68:fload_2         
	//   35   69:invokespecial   #441 <Method int calculateScrollXForTab(int, float)>
	//   36   72:iconst_0        
	//   37   73:invokevirtual   #936 <Method void scrollTo(int, int)>
			if(flag)
	//*  38   76:iload_3         
	//*  39   77:ifeq            86
				setSelectedTabView(j);
	//   40   80:aload_0         
	//   41   81:iload           5
	//   42   83:invokespecial   #894 <Method void setSelectedTabView(int)>
			return;
	//   43   86:return          
		} else
		{
			return;
	//   44   87:return          
		}
	}

	public void setSelectedTabIndicatorColor(int i)
	{
		mTabStrip.setSelectedIndicatorColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #209 <Method void TabLayout$SlidingTabStrip.setSelectedIndicatorColor(int)>
	//    4    8:return          
	}

	public void setSelectedTabIndicatorHeight(int i)
	{
		mTabStrip.setSelectedIndicatorHeight(i);
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #200 <Method void TabLayout$SlidingTabStrip.setSelectedIndicatorHeight(int)>
	//    4    8:return          
	}

	public void setTabGravity(int i)
	{
		if(mTabGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #321 <Field int mTabGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mTabGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #321 <Field int mTabGravity>
			applyModeAndGravity();
	//    7   13:aload_0         
	//    8   14:invokespecial   #345 <Method void applyModeAndGravity()>
		}
	//    9   17:return          
	}

	public void setTabMode(int i)
	{
		if(i != mMode)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #316 <Field int mMode>
	//*   3    5:icmpeq          17
		{
			mMode = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #316 <Field int mMode>
			applyModeAndGravity();
	//    7   13:aload_0         
	//    8   14:invokespecial   #345 <Method void applyModeAndGravity()>
		}
	//    9   17:return          
	}

	public void setTabTextColors(int i, int j)
	{
		setTabTextColors(createColorStateList(i, j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #288 <Method ColorStateList createColorStateList(int, int)>
	//    4    6:invokevirtual   #945 <Method void setTabTextColors(ColorStateList)>
	//    5    9:return          
	}

	public void setTabTextColors(ColorStateList colorstatelist)
	{
		if(mTabTextColors != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #265 <Field ColorStateList mTabTextColors>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			mTabTextColors = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #265 <Field ColorStateList mTabTextColors>
			updateAllTabs();
	//    7   13:aload_0         
	//    8   14:invokespecial   #947 <Method void updateAllTabs()>
		}
	//    9   17:return          
	}

	public void setTabsFromPagerAdapter(PagerAdapter pageradapter)
	{
		setPagerAdapter(pageradapter, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #676 <Method void setPagerAdapter(PagerAdapter, boolean)>
	//    4    6:return          
	}

	public void setupWithViewPager(ViewPager viewpager)
	{
		setupWithViewPager(viewpager, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #952 <Method void setupWithViewPager(ViewPager, boolean)>
	//    4    6:return          
	}

	public void setupWithViewPager(ViewPager viewpager, boolean flag)
	{
		setupWithViewPager(viewpager, flag, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #780 <Method void setupWithViewPager(ViewPager, boolean, boolean)>
	//    5    7:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return getTabScrollRange() > 0;
	//    0    0:aload_0         
	//    1    1:invokespecial   #955 <Method int getTabScrollRange()>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	void updateTabViews(boolean flag)
	{
		for(int i = 0; i < mTabStrip.getChildCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//*   5    7:invokevirtual   #485 <Method int TabLayout$SlidingTabStrip.getChildCount()>
	//*   6   10:icmpge          56
		{
			View view = mTabStrip.getChildAt(i);
	//    7   13:aload_0         
	//    8   14:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #482 <Method View TabLayout$SlidingTabStrip.getChildAt(int)>
	//   11   21:astore_3        
			view.setMinimumWidth(getTabMinWidth());
	//   12   22:aload_3         
	//   13   23:aload_0         
	//   14   24:invokespecial   #554 <Method int getTabMinWidth()>
	//   15   27:invokevirtual   #956 <Method void View.setMinimumWidth(int)>
			updateTabViewLayoutParams((android.widget.LinearLayout.LayoutParams)view.getLayoutParams());
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #824 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   35:checkcast       #527 <Class android.widget.LinearLayout$LayoutParams>
	//   20   38:invokespecial   #532 <Method void updateTabViewLayoutParams(android.widget.LinearLayout$LayoutParams)>
			if(flag)
	//*  21   41:iload_1         
	//*  22   42:ifeq            49
				view.requestLayout();
	//   23   45:aload_3         
	//   24   46:invokevirtual   #957 <Method void View.requestLayout()>
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
	private static final int INVALID_WIDTH = -1;
	public static final int MODE_FIXED = 1;
	public static final int MODE_SCROLLABLE = 0;
	static final int MOTION_NON_ADJACENT_OFFSET = 24;
	private static final int TAB_MIN_WIDTH_MARGIN = 56;
	private static final android.support.v4.util.Pools.Pool sTabPool = new android.support.v4.util.Pools.SynchronizedPool(16);
	private AdapterChangeListener mAdapterChangeListener;
	private int mContentInsetStart;
	private OnTabSelectedListener mCurrentVpSelectedListener;
	int mMode;
	private TabLayoutOnPageChangeListener mPageChangeListener;
	private PagerAdapter mPagerAdapter;
	private DataSetObserver mPagerAdapterObserver;
	private final int mRequestedTabMaxWidth;
	private final int mRequestedTabMinWidth;
	private ValueAnimator mScrollAnimator;
	private final int mScrollableTabMinWidth;
	private OnTabSelectedListener mSelectedListener;
	private final ArrayList mSelectedListeners;
	private Tab mSelectedTab;
	private boolean mSetupViewPagerImplicitly;
	final int mTabBackgroundResId;
	int mTabGravity;
	int mTabMaxWidth;
	int mTabPaddingBottom;
	int mTabPaddingEnd;
	int mTabPaddingStart;
	int mTabPaddingTop;
	private final SlidingTabStrip mTabStrip;
	int mTabTextAppearance;
	ColorStateList mTabTextColors;
	float mTabTextMultiLineSize;
	float mTabTextSize;
	private final android.support.v4.util.Pools.Pool mTabViewPool;
	private final ArrayList mTabs;
	ViewPager mViewPager;

	static 
	{
	//    0    0:new             #117 <Class android.support.v4.util.Pools$SynchronizedPool>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #121 <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//    4    9:putstatic       #123 <Field android.support.v4.util.Pools$Pool sTabPool>
	//*   5   12:return          
	}
}
