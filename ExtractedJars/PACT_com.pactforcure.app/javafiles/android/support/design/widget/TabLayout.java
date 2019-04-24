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
		//*   6   12:ifnull          134
		//*   7   15:aload           5
		//*   8   17:invokevirtual   #63  <Method int View.getWidth()>
		//*   9   20:ifle            134
			{
				int l = view.getLeft();
		//   10   23:aload           5
		//   11   25:invokevirtual   #66  <Method int View.getLeft()>
		//   12   28:istore          4
				int k = view.getRight();
		//   13   30:aload           5
		//   14   32:invokevirtual   #69  <Method int View.getRight()>
		//   15   35:istore_3        
				i = l;
		//   16   36:iload           4
		//   17   38:istore_1        
				j = k;
		//   18   39:iload_3         
		//   19   40:istore_2        
				if(mSelectionOffset > 0.0F)
		//*  20   41:aload_0         
		//*  21   42:getfield        #71  <Field float mSelectionOffset>
		//*  22   45:fconst_0        
		//*  23   46:fcmpl           
		//*  24   47:ifle            127
				{
					i = l;
		//   25   50:iload           4
		//   26   52:istore_1        
					j = k;
		//   27   53:iload_3         
		//   28   54:istore_2        
					if(mSelectedPosition < getChildCount() - 1)
		//*  29   55:aload_0         
		//*  30   56:getfield        #34  <Field int mSelectedPosition>
		//*  31   59:aload_0         
		//*  32   60:invokevirtual   #74  <Method int getChildCount()>
		//*  33   63:iconst_1        
		//*  34   64:isub            
		//*  35   65:icmpge          127
					{
						View view1 = getChildAt(mSelectedPosition + 1);
		//   36   68:aload_0         
		//   37   69:aload_0         
		//   38   70:getfield        #34  <Field int mSelectedPosition>
		//   39   73:iconst_1        
		//   40   74:iadd            
		//   41   75:invokevirtual   #57  <Method View getChildAt(int)>
		//   42   78:astore          5
						i = (int)(mSelectionOffset * (float)view1.getLeft() + (1.0F - mSelectionOffset) * (float)l);
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
		//   58  103:istore_1        
						j = (int)(mSelectionOffset * (float)view1.getRight() + (1.0F - mSelectionOffset) * (float)k);
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
		//   74  126:istore_2        
					}
				}
			} else
		//*  75  127:aload_0         
		//*  76  128:iload_1         
		//*  77  129:iload_2         
		//*  78  130:invokevirtual   #78  <Method void setIndicatorPosition(int, int)>
		//*  79  133:return          
			{
				j = -1;
		//   80  134:iconst_m1       
		//   81  135:istore_2        
				i = -1;
		//   82  136:iconst_m1       
		//   83  137:istore_1        
			}
			setIndicatorPosition(i, j);
		//*  84  138:goto            127
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
			View view;
			if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
		//*  10   24:aload_0         
		//*  11   25:invokestatic    #96  <Method int ViewCompat.getLayoutDirection(View)>
		//*  12   28:iconst_1        
		//*  13   29:icmpne          51
				startLeft = 1;
		//   14   32:iconst_1        
		//   15   33:istore_3        
			else
		//*  16   34:aload_0         
		//*  17   35:iload_1         
		//*  18   36:invokevirtual   #57  <Method View getChildAt(int)>
		//*  19   39:astore          7
		//*  20   41:aload           7
		//*  21   43:ifnonnull       56
		//*  22   46:aload_0         
		//*  23   47:invokespecial   #98  <Method void updateIndicatorPosition()>
		//*  24   50:return          
				startLeft = 0;
		//   25   51:iconst_0        
		//   26   52:istore_3        
			view = getChildAt(i);
			if(view == null)
			{
				updateIndicatorPosition();
			} else
		//*  27   53:goto            34
			{
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
		//*  40   80:icmpgt          194
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
		//*  47   94:iload_3         
		//*  48   95:iload           5
		//*  49   97:icmpne          107
		//*  50  100:iload           4
		//*  51  102:iload           6
		//*  52  104:icmpeq          50
		//*  53  107:new             #83  <Class ValueAnimator>
		//*  54  110:dup             
		//*  55  111:invokespecial   #105 <Method void ValueAnimator()>
		//*  56  114:astore          7
		//*  57  116:aload_0         
		//*  58  117:aload           7
		//*  59  119:putfield        #81  <Field ValueAnimator mIndicatorAnimator>
		//*  60  122:aload           7
		//*  61  124:getstatic       #111 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
		//*  62  127:invokevirtual   #115 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		//*  63  130:aload           7
		//*  64  132:iload_2         
		//*  65  133:i2l             
		//*  66  134:invokevirtual   #119 <Method ValueAnimator ValueAnimator.setDuration(long)>
		//*  67  137:pop             
		//*  68  138:aload           7
		//*  69  140:iconst_2        
		//*  70  141:newarray        float[]
		//*  71  143:dup             
		//*  72  144:iconst_0        
		//*  73  145:fconst_0        
		//*  74  146:fastore         
		//*  75  147:dup             
		//*  76  148:iconst_1        
		//*  77  149:fconst_1        
		//*  78  150:fastore         
		//*  79  151:invokevirtual   #123 <Method void ValueAnimator.setFloatValues(float[])>
		//*  80  154:aload           7
		//*  81  156:new             #9   <Class TabLayout$SlidingTabStrip$1>
		//*  82  159:dup             
		//*  83  160:aload_0         
		//*  84  161:iload_3         
		//*  85  162:iload           5
		//*  86  164:iload           4
		//*  87  166:iload           6
		//*  88  168:invokespecial   #126 <Method void TabLayout$SlidingTabStrip$1(TabLayout$SlidingTabStrip, int, int, int, int)>
		//*  89  171:invokevirtual   #130 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		//*  90  174:aload           7
		//*  91  176:new             #11  <Class TabLayout$SlidingTabStrip$2>
		//*  92  179:dup             
		//*  93  180:aload_0         
		//*  94  181:iload_1         
		//*  95  182:invokespecial   #133 <Method void TabLayout$SlidingTabStrip$2(TabLayout$SlidingTabStrip, int)>
		//*  96  185:invokevirtual   #137 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		//*  97  188:aload           7
		//*  98  190:invokevirtual   #140 <Method void ValueAnimator.start()>
		//*  99  193:return          
				{
					startRight = dpToPx(24);
		//  100  194:aload_0         
		//  101  195:getfield        #29  <Field TabLayout this$0>
		//  102  198:bipush          24
		//  103  200:invokevirtual   #143 <Method int TabLayout.dpToPx(int)>
		//  104  203:istore          4
					if(i < mSelectedPosition)
		//* 105  205:iload_1         
		//* 106  206:aload_0         
		//* 107  207:getfield        #34  <Field int mSelectedPosition>
		//* 108  210:icmpge          243
					{
						if(startLeft != 0)
		//* 109  213:iload_3         
		//* 110  214:ifeq            230
						{
							startRight = targetLeft - startRight;
		//  111  217:iload           5
		//  112  219:iload           4
		//  113  221:isub            
		//  114  222:istore          4
							startLeft = startRight;
		//  115  224:iload           4
		//  116  226:istore_3        
						} else
		//* 117  227:goto            94
						{
							startRight = k + startRight;
		//  118  230:iload           6
		//  119  232:iload           4
		//  120  234:iadd            
		//  121  235:istore          4
							startLeft = startRight;
		//  122  237:iload           4
		//  123  239:istore_3        
						}
					} else
		//* 124  240:goto            94
					if(startLeft != 0)
		//* 125  243:iload_3         
		//* 126  244:ifeq            260
					{
						startRight = k + startRight;
		//  127  247:iload           6
		//  128  249:iload           4
		//  129  251:iadd            
		//  130  252:istore          4
						startLeft = startRight;
		//  131  254:iload           4
		//  132  256:istore_3        
					} else
		//* 133  257:goto            94
					{
						startRight = targetLeft - startRight;
		//  134  260:iload           5
		//  135  262:iload           4
		//  136  264:isub            
		//  137  265:istore          4
						startLeft = startRight;
		//  138  267:iload           4
		//  139  269:istore_3        
					}
				}
				if(startLeft != targetLeft || startRight != k)
				{
					ValueAnimator valueanimator = new ValueAnimator();
					mIndicatorAnimator = valueanimator;
					valueanimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
					valueanimator.setDuration(j);
					valueanimator.setFloatValues(new float[] {
						0.0F, 1.0F
					});
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
					valueanimator.start();
					return;
				}
			}
		//* 140  270:goto            94
		}

		boolean childrenNeedLayout()
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_1        
			for(int j = getChildCount(); i < j; i++)
		//*   2    2:aload_0         
		//*   3    3:invokevirtual   #74  <Method int getChildCount()>
		//*   4    6:istore_2        
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
			break MISSING_BLOCK_LABEL_6;
			boolean flag1;
label0:
			while(!flag1) 
			{
				int l;
				int l1;
				do
				{
					do
		//*   4    6:iload_1         
		//*   5    7:invokestatic    #186 <Method int android.view.View$MeasureSpec.getMode(int)>
		//*   6   10:ldc1            #187 <Int 0x40000000>
		//*   7   12:icmpeq          16
						return;
		//    8   15:return          
					while(android.view.View.MeasureSpec.getMode(i) != 0x40000000 || mMode != 1 || mTabGravity != 1);
		//    9   16:aload_0         
		//   10   17:getfield        #29  <Field TabLayout this$0>
		//   11   20:getfield        #190 <Field int TabLayout.mMode>
		//   12   23:iconst_1        
		//   13   24:icmpne          15
		//   14   27:aload_0         
		//   15   28:getfield        #29  <Field TabLayout this$0>
		//   16   31:getfield        #193 <Field int TabLayout.mTabGravity>
		//   17   34:iconst_1        
		//   18   35:icmpne          15
					l1 = getChildCount();
		//   19   38:aload_0         
		//   20   39:invokevirtual   #74  <Method int getChildCount()>
		//   21   42:istore          7
					l = 0;
		//   22   44:iconst_0        
		//   23   45:istore          4
					for(int k = 0; k < l1;)
		//*  24   47:iconst_0        
		//*  25   48:istore_3        
		//*  26   49:iload_3         
		//*  27   50:iload           7
		//*  28   52:icmpge          97
					{
						View view = getChildAt(k);
		//   29   55:aload_0         
		//   30   56:iload_3         
		//   31   57:invokevirtual   #57  <Method View getChildAt(int)>
		//   32   60:astore          8
						int i1 = l;
		//   33   62:iload           4
		//   34   64:istore          5
						if(view.getVisibility() == 0)
		//*  35   66:aload           8
		//*  36   68:invokevirtual   #196 <Method int View.getVisibility()>
		//*  37   71:ifne            86
							i1 = Math.max(l, view.getMeasuredWidth());
		//   38   74:iload           4
		//   39   76:aload           8
		//   40   78:invokevirtual   #199 <Method int View.getMeasuredWidth()>
		//   41   81:invokestatic    #203 <Method int Math.max(int, int)>
		//   42   84:istore          5
						k++;
		//   43   86:iload_3         
		//   44   87:iconst_1        
		//   45   88:iadd            
		//   46   89:istore_3        
						l = i1;
		//   47   90:iload           5
		//   48   92:istore          4
					}

				} while(l <= 0);
		//   49   94:goto            49
		//   50   97:iload           4
		//   51   99:ifle            15
				int j1 = dpToPx(16);
		//   52  102:aload_0         
		//   53  103:getfield        #29  <Field TabLayout this$0>
		//   54  106:bipush          16
		//   55  108:invokevirtual   #143 <Method int TabLayout.dpToPx(int)>
		//   56  111:istore          5
				boolean flag = false;
		//   57  113:iconst_0        
		//   58  114:istore_3        
				if(l * l1 <= getMeasuredWidth() - j1 * 2)
		//*  59  115:iload           4
		//*  60  117:iload           7
		//*  61  119:imul            
		//*  62  120:aload_0         
		//*  63  121:invokevirtual   #204 <Method int getMeasuredWidth()>
		//*  64  124:iload           5
		//*  65  126:iconst_2        
		//*  66  127:imul            
		//*  67  128:isub            
		//*  68  129:icmpgt          203
				{
					int k1 = 0;
		//   69  132:iconst_0        
		//   70  133:istore          5
					do
					{
						flag1 = flag;
		//   71  135:iload_3         
		//   72  136:istore          6
						if(k1 >= l1)
							continue label0;
		//   73  138:iload           5
		//   74  140:iload           7
		//   75  142:icmpge          222
						android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)getChildAt(k1).getLayoutParams();
		//   76  145:aload_0         
		//   77  146:iload           5
		//   78  148:invokevirtual   #57  <Method View getChildAt(int)>
		//   79  151:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   80  154:checkcast       #210 <Class android.widget.LinearLayout$LayoutParams>
		//   81  157:astore          8
						if(layoutparams.width != l || layoutparams.weight != 0.0F)
		//*  82  159:aload           8
		//*  83  161:getfield        #213 <Field int android.widget.LinearLayout$LayoutParams.width>
		//*  84  164:iload           4
		//*  85  166:icmpne          179
		//*  86  169:aload           8
		//*  87  171:getfield        #216 <Field float android.widget.LinearLayout$LayoutParams.weight>
		//*  88  174:fconst_0        
		//*  89  175:fcmpl           
		//*  90  176:ifeq            194
						{
							layoutparams.width = l;
		//   91  179:aload           8
		//   92  181:iload           4
		//   93  183:putfield        #213 <Field int android.widget.LinearLayout$LayoutParams.width>
							layoutparams.weight = 0.0F;
		//   94  186:aload           8
		//   95  188:fconst_0        
		//   96  189:putfield        #216 <Field float android.widget.LinearLayout$LayoutParams.weight>
							flag = true;
		//   97  192:iconst_1        
		//   98  193:istore_3        
						}
						k1++;
		//   99  194:iload           5
		//  100  196:iconst_1        
		//  101  197:iadd            
		//  102  198:istore          5
					} while(true);
		//  103  200:goto            135
				}
				mTabGravity = 0;
		//  104  203:aload_0         
		//  105  204:getfield        #29  <Field TabLayout this$0>
		//  106  207:iconst_0        
		//  107  208:putfield        #193 <Field int TabLayout.mTabGravity>
				updateTabViews(false);
		//  108  211:aload_0         
		//  109  212:getfield        #29  <Field TabLayout this$0>
		//  110  215:iconst_0        
		//  111  216:invokevirtual   #219 <Method void TabLayout.updateTabViews(boolean)>
				flag1 = true;
		//  112  219:iconst_1        
		//  113  220:istore          6
			}
		//  114  222:iload           6
		//  115  224:ifeq            15
			super.onMeasure(i, j);
		//  116  227:aload_0         
		//  117  228:iload_1         
		//  118  229:iload_2         
		//  119  230:invokespecial   #181 <Method void LinearLayout.onMeasure(int, int)>
			return;
		//  120  233:return          
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
		//*   6   14:ifnull          65
			{
				boolean flag;
				boolean flag1;
				if(mScrollState != 2 || mPreviousScrollState == 1)
		//*   7   17:aload_0         
		//*   8   18:getfield        #32  <Field int mScrollState>
		//*   9   21:iconst_2        
		//*  10   22:icmpne          33
		//*  11   25:aload_0         
		//*  12   26:getfield        #34  <Field int mPreviousScrollState>
		//*  13   29:iconst_1        
		//*  14   30:icmpne          66
					flag = true;
		//   15   33:iconst_1        
		//   16   34:istore          4
				else
		//*  17   36:aload_0         
		//*  18   37:getfield        #32  <Field int mScrollState>
		//*  19   40:iconst_2        
		//*  20   41:icmpne          51
		//*  21   44:aload_0         
		//*  22   45:getfield        #34  <Field int mPreviousScrollState>
		//*  23   48:ifeq            72
		//*  24   51:iconst_1        
		//*  25   52:istore          5
		//*  26   54:aload           6
		//*  27   56:iload_1         
		//*  28   57:fload_2         
		//*  29   58:iload           4
		//*  30   60:iload           5
		//*  31   62:invokevirtual   #44  <Method void TabLayout.setScrollPosition(int, float, boolean, boolean)>
		//*  32   65:return          
					flag = false;
		//   33   66:iconst_0        
		//   34   67:istore          4
				if(mScrollState != 2 || mPreviousScrollState != 0)
					flag1 = true;
				else
		//*  35   69:goto            36
					flag1 = false;
		//   36   72:iconst_0        
		//   37   73:istore          5
				tablayout.setScrollPosition(i, f, flag, flag1);
			}
		//*  38   75:goto            54
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
		//*   6   12:ifnull          65
		//*   7   15:aload_3         
		//*   8   16:invokevirtual   #49  <Method int TabLayout.getSelectedTabPosition()>
		//*   9   19:iload_1         
		//*  10   20:icmpeq          65
		//*  11   23:iload_1         
		//*  12   24:aload_3         
		//*  13   25:invokevirtual   #52  <Method int TabLayout.getTabCount()>
		//*  14   28:icmpge          65
			{
				boolean flag;
				if(mScrollState == 0 || mScrollState == 2 && mPreviousScrollState == 0)
		//*  15   31:aload_0         
		//*  16   32:getfield        #32  <Field int mScrollState>
		//*  17   35:ifeq            53
		//*  18   38:aload_0         
		//*  19   39:getfield        #32  <Field int mScrollState>
		//*  20   42:iconst_2        
		//*  21   43:icmpne          66
		//*  22   46:aload_0         
		//*  23   47:getfield        #34  <Field int mPreviousScrollState>
		//*  24   50:ifne            66
					flag = true;
		//   25   53:iconst_1        
		//   26   54:istore_2        
				else
		//*  27   55:aload_3         
		//*  28   56:aload_3         
		//*  29   57:iload_1         
		//*  30   58:invokevirtual   #56  <Method TabLayout$Tab TabLayout.getTabAt(int)>
		//*  31   61:iload_2         
		//*  32   62:invokevirtual   #60  <Method void TabLayout.selectTab(TabLayout$Tab, boolean)>
		//*  33   65:return          
					flag = false;
		//   34   66:iconst_0        
		//   35   67:istore_2        
				tablayout.selectTab(tablayout.getTabAt(i), flag);
			}
		//*  36   68:goto            55
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
			Object obj = null;
		//    0    0:aconst_null     
		//    1    1:astore          9
			boolean flag;
			CharSequence charsequence;
			Drawable drawable;
			CharSequence charsequence1;
			if(mTab != null)
		//*   2    3:aload_0         
		//*   3    4:getfield        #110 <Field TabLayout$Tab mTab>
		//*   4    7:ifnull          199
				drawable = mTab.getIcon();
		//    5   10:aload_0         
		//    6   11:getfield        #110 <Field TabLayout$Tab mTab>
		//    7   14:invokevirtual   #116 <Method Drawable TabLayout$Tab.getIcon()>
		//    8   17:astore          7
			else
		//*   9   19:aload_0         
		//*  10   20:getfield        #110 <Field TabLayout$Tab mTab>
		//*  11   23:ifnull          205
		//*  12   26:aload_0         
		//*  13   27:getfield        #110 <Field TabLayout$Tab mTab>
		//*  14   30:invokevirtual   #120 <Method CharSequence TabLayout$Tab.getText()>
		//*  15   33:astore          8
		//*  16   35:aload_0         
		//*  17   36:getfield        #110 <Field TabLayout$Tab mTab>
		//*  18   39:ifnull          211
		//*  19   42:aload_0         
		//*  20   43:getfield        #110 <Field TabLayout$Tab mTab>
		//*  21   46:invokevirtual   #123 <Method CharSequence TabLayout$Tab.getContentDescription()>
		//*  22   49:astore          6
		//*  23   51:aload_2         
		//*  24   52:ifnull          82
		//*  25   55:aload           7
		//*  26   57:ifnull          217
		//*  27   60:aload_2         
		//*  28   61:aload           7
		//*  29   63:invokevirtual   #129 <Method void ImageView.setImageDrawable(Drawable)>
		//*  30   66:aload_2         
		//*  31   67:iconst_0        
		//*  32   68:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
		//*  33   71:aload_0         
		//*  34   72:iconst_0        
		//*  35   73:invokevirtual   #133 <Method void setVisibility(int)>
		//*  36   76:aload_2         
		//*  37   77:aload           6
		//*  38   79:invokevirtual   #137 <Method void ImageView.setContentDescription(CharSequence)>
		//*  39   82:aload           8
		//*  40   84:invokestatic    #143 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  41   87:ifne            231
		//*  42   90:iconst_1        
		//*  43   91:istore_3        
		//*  44   92:aload_1         
		//*  45   93:ifnull          122
		//*  46   96:iload_3         
		//*  47   97:ifeq            236
		//*  48  100:aload_1         
		//*  49  101:aload           8
		//*  50  103:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
		//*  51  106:aload_1         
		//*  52  107:iconst_0        
		//*  53  108:invokevirtual   #149 <Method void TextView.setVisibility(int)>
		//*  54  111:aload_0         
		//*  55  112:iconst_0        
		//*  56  113:invokevirtual   #133 <Method void setVisibility(int)>
		//*  57  116:aload_1         
		//*  58  117:aload           6
		//*  59  119:invokevirtual   #150 <Method void TextView.setContentDescription(CharSequence)>
		//*  60  122:aload_2         
		//*  61  123:ifnull          186
		//*  62  126:aload_2         
		//*  63  127:invokevirtual   #154 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
		//*  64  130:checkcast       #156 <Class android.view.ViewGroup$MarginLayoutParams>
		//*  65  133:astore_1        
		//*  66  134:iconst_0        
		//*  67  135:istore          5
		//*  68  137:iload           5
		//*  69  139:istore          4
		//*  70  141:iload_3         
		//*  71  142:ifeq            167
		//*  72  145:iload           5
		//*  73  147:istore          4
		//*  74  149:aload_2         
		//*  75  150:invokevirtual   #160 <Method int ImageView.getVisibility()>
		//*  76  153:ifne            167
		//*  77  156:aload_0         
		//*  78  157:getfield        #25  <Field TabLayout this$0>
		//*  79  160:bipush          8
		//*  80  162:invokevirtual   #164 <Method int TabLayout.dpToPx(int)>
		//*  81  165:istore          4
		//*  82  167:iload           4
		//*  83  169:aload_1         
		//*  84  170:getfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//*  85  173:icmpeq          186
		//*  86  176:aload_1         
		//*  87  177:iload           4
		//*  88  179:putfield        #167 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//*  89  182:aload_2         
		//*  90  183:invokevirtual   #171 <Method void ImageView.requestLayout()>
		//*  91  186:iload_3         
		//*  92  187:ifeq            250
		//*  93  190:aload           9
		//*  94  192:astore_1        
		//*  95  193:aload_0         
		//*  96  194:aload_1         
		//*  97  195:invokestatic    #177 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
		//*  98  198:return          
				drawable = null;
		//   99  199:aconst_null     
		//  100  200:astore          7
			if(mTab != null)
				charsequence1 = mTab.getText();
			else
		//* 101  202:goto            19
				charsequence1 = null;
		//  102  205:aconst_null     
		//  103  206:astore          8
			if(mTab != null)
				charsequence = mTab.getContentDescription();
			else
		//* 104  208:goto            35
				charsequence = null;
		//  105  211:aconst_null     
		//  106  212:astore          6
			if(imageview != null)
			{
				int i;
				boolean flag1;
				if(drawable != null)
				{
					imageview.setImageDrawable(drawable);
					imageview.setVisibility(0);
					setVisibility(0);
				} else
		//* 107  214:goto            51
				{
					imageview.setVisibility(8);
		//  108  217:aload_2         
		//  109  218:bipush          8
		//  110  220:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
					imageview.setImageDrawable(((Drawable) (null)));
		//  111  223:aload_2         
		//  112  224:aconst_null     
		//  113  225:invokevirtual   #129 <Method void ImageView.setImageDrawable(Drawable)>
				}
				imageview.setContentDescription(charsequence);
			}
			if(!TextUtils.isEmpty(charsequence1))
				flag = true;
			else
		//* 114  228:goto            76
				flag = false;
		//  115  231:iconst_0        
		//  116  232:istore_3        
			if(textview != null)
			{
				if(flag)
				{
					textview.setText(charsequence1);
					textview.setVisibility(0);
					setVisibility(0);
				} else
		//* 117  233:goto            92
				{
					textview.setVisibility(8);
		//  118  236:aload_1         
		//  119  237:bipush          8
		//  120  239:invokevirtual   #149 <Method void TextView.setVisibility(int)>
					textview.setText(((CharSequence) (null)));
		//  121  242:aload_1         
		//  122  243:aconst_null     
		//  123  244:invokevirtual   #148 <Method void TextView.setText(CharSequence)>
				}
				textview.setContentDescription(charsequence);
			}
			if(imageview != null)
			{
				textview = ((TextView) ((android.view.ViewGroup.MarginLayoutParams)imageview.getLayoutParams()));
				flag1 = false;
				i = ((int) (flag1));
				if(flag)
				{
					i = ((int) (flag1));
					if(imageview.getVisibility() == 0)
						i = dpToPx(8);
				}
				if(i != ((android.view.ViewGroup.MarginLayoutParams) (textview)).bottomMargin)
				{
					textview.bottomMargin = i;
					imageview.requestLayout();
				}
			}
			if(flag)
				textview = ((TextView) (obj));
			else
		//* 124  247:goto            116
				textview = ((TextView) (charsequence));
		//  125  250:aload           6
		//  126  252:astore_1        
			TooltipCompat.setTooltipText(((View) (this)), ((CharSequence) (textview)));
		//* 127  253:goto            193
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
			int k = android.view.View.MeasureSpec.getSize(i);
		//    0    0:iload_1         
		//    1    1:invokestatic    #211 <Method int android.view.View$MeasureSpec.getSize(int)>
		//    2    4:istore          5
			int i1 = android.view.View.MeasureSpec.getMode(i);
		//    3    6:iload_1         
		//    4    7:invokestatic    #214 <Method int android.view.View$MeasureSpec.getMode(int)>
		//    5   10:istore          6
			int k1 = getTabMaxWidth();
		//    6   12:aload_0         
		//    7   13:getfield        #25  <Field TabLayout this$0>
		//    8   16:invokevirtual   #217 <Method int TabLayout.getTabMaxWidth()>
		//    9   19:istore          7
			if(k1 > 0 && (i1 == 0 || k > k1))
		//*  10   21:iload           7
		//*  11   23:ifle            270
		//*  12   26:iload           6
		//*  13   28:ifeq            38
		//*  14   31:iload           5
		//*  15   33:iload           7
		//*  16   35:icmple          270
				i = android.view.View.MeasureSpec.makeMeasureSpec(mTabMaxWidth, 0x80000000);
		//   17   38:aload_0         
		//   18   39:getfield        #25  <Field TabLayout this$0>
		//   19   42:getfield        #220 <Field int TabLayout.mTabMaxWidth>
		//   20   45:ldc1            #221 <Int 0x80000000>
		//   21   47:invokestatic    #225 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   22   50:istore_1        
			super.onMeasure(i, j);
		//   23   51:aload_0         
		//   24   52:iload_1         
		//   25   53:iload_2         
		//   26   54:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
			if(mTextView == null) goto _L2; else goto _L1
		//   27   57:aload_0         
		//   28   58:getfield        #229 <Field TextView mTextView>
		//   29   61:ifnull          269
_L1:
			float f1;
			int j1;
			getResources();
		//   30   64:aload_0         
		//   31   65:invokevirtual   #233 <Method Resources getResources()>
		//   32   68:pop             
			f1 = mTabTextSize;
		//   33   69:aload_0         
		//   34   70:getfield        #25  <Field TabLayout this$0>
		//   35   73:getfield        #237 <Field float TabLayout.mTabTextSize>
		//   36   76:fstore          4
			j1 = mDefaultMaxLines;
		//   37   78:aload_0         
		//   38   79:getfield        #30  <Field int mDefaultMaxLines>
		//   39   82:istore          6
			if(mIconView == null || mIconView.getVisibility() != 0) goto _L4; else goto _L3
		//   40   84:aload_0         
		//   41   85:getfield        #239 <Field ImageView mIconView>
		//   42   88:ifnull          273
		//   43   91:aload_0         
		//   44   92:getfield        #239 <Field ImageView mIconView>
		//   45   95:invokevirtual   #160 <Method int ImageView.getVisibility()>
		//   46   98:ifne            273
_L3:
			float f;
			int l;
			l = 1;
		//   47  101:iconst_1        
		//   48  102:istore          5
			f = f1;
		//   49  104:fload           4
		//   50  106:fstore_3        
_L6:
			f1 = mTextView.getTextSize();
		//   51  107:aload_0         
		//   52  108:getfield        #229 <Field TextView mTextView>
		//   53  111:invokevirtual   #240 <Method float TextView.getTextSize()>
		//   54  114:fstore          4
			int l1 = mTextView.getLineCount();
		//   55  116:aload_0         
		//   56  117:getfield        #229 <Field TextView mTextView>
		//   57  120:invokevirtual   #243 <Method int TextView.getLineCount()>
		//   58  123:istore          8
			j1 = TextViewCompat.getMaxLines(mTextView);
		//   59  125:aload_0         
		//   60  126:getfield        #229 <Field TextView mTextView>
		//   61  129:invokestatic    #249 <Method int TextViewCompat.getMaxLines(TextView)>
		//   62  132:istore          6
			if(f != f1 || j1 >= 0 && l != j1)
		//*  63  134:fload_3         
		//*  64  135:fload           4
		//*  65  137:fcmpl           
		//*  66  138:ifne            153
		//*  67  141:iload           6
		//*  68  143:iflt            269
		//*  69  146:iload           5
		//*  70  148:iload           6
		//*  71  150:icmpeq          269
			{
label0:
				{
					boolean flag = true;
		//   72  153:iconst_1        
		//   73  154:istore          7
					j1 = ((int) (flag));
		//   74  156:iload           7
		//   75  158:istore          6
					if(mMode != 1)
						break label0;
		//   76  160:aload_0         
		//   77  161:getfield        #25  <Field TabLayout this$0>
		//   78  164:getfield        #252 <Field int TabLayout.mMode>
		//   79  167:iconst_1        
		//   80  168:icmpne          240
					j1 = ((int) (flag));
		//   81  171:iload           7
		//   82  173:istore          6
					if(f <= f1)
						break label0;
		//   83  175:fload_3         
		//   84  176:fload           4
		//   85  178:fcmpl           
		//   86  179:ifle            240
					j1 = ((int) (flag));
		//   87  182:iload           7
		//   88  184:istore          6
					if(l1 != 1)
						break label0;
		//   89  186:iload           8
		//   90  188:iconst_1        
		//   91  189:icmpne          240
					Layout layout = mTextView.getLayout();
		//   92  192:aload_0         
		//   93  193:getfield        #229 <Field TextView mTextView>
		//   94  196:invokevirtual   #256 <Method Layout TextView.getLayout()>
		//   95  199:astore          9
					if(layout != null)
		//*  96  201:aload           9
		//*  97  203:ifnull          237
					{
						j1 = ((int) (flag));
		//   98  206:iload           7
		//   99  208:istore          6
						if(approximateLineWidth(layout, 0, f) <= (float)(getMeasuredWidth() - getPaddingLeft() - getPaddingRight()))
							break label0;
		//  100  210:aload_0         
		//  101  211:aload           9
		//  102  213:iconst_0        
		//  103  214:fload_3         
		//  104  215:invokespecial   #258 <Method float approximateLineWidth(Layout, int, float)>
		//  105  218:aload_0         
		//  106  219:invokevirtual   #261 <Method int getMeasuredWidth()>
		//  107  222:aload_0         
		//  108  223:invokevirtual   #264 <Method int getPaddingLeft()>
		//  109  226:isub            
		//  110  227:aload_0         
		//  111  228:invokevirtual   #267 <Method int getPaddingRight()>
		//  112  231:isub            
		//  113  232:i2f             
		//  114  233:fcmpl           
		//  115  234:ifle            240
					}
					j1 = 0;
		//  116  237:iconst_0        
		//  117  238:istore          6
				}
				if(j1 != 0)
		//* 118  240:iload           6
		//* 119  242:ifeq            269
				{
					mTextView.setTextSize(0, f);
		//  120  245:aload_0         
		//  121  246:getfield        #229 <Field TextView mTextView>
		//  122  249:iconst_0        
		//  123  250:fload_3         
		//  124  251:invokevirtual   #271 <Method void TextView.setTextSize(int, float)>
					mTextView.setMaxLines(l);
		//  125  254:aload_0         
		//  126  255:getfield        #229 <Field TextView mTextView>
		//  127  258:iload           5
		//  128  260:invokevirtual   #274 <Method void TextView.setMaxLines(int)>
					super.onMeasure(i, j);
		//  129  263:aload_0         
		//  130  264:iload_1         
		//  131  265:iload_2         
		//  132  266:invokespecial   #227 <Method void LinearLayout.onMeasure(int, int)>
				}
			}
_L2:
			return;
		//  133  269:return          
		//* 134  270:goto            51
_L4:
			l = j1;
		//  135  273:iload           6
		//  136  275:istore          5
			f = f1;
		//  137  277:fload           4
		//  138  279:fstore_3        
			if(mTextView != null)
		//* 139  280:aload_0         
		//* 140  281:getfield        #229 <Field TextView mTextView>
		//* 141  284:ifnull          107
			{
				l = j1;
		//  142  287:iload           6
		//  143  289:istore          5
				f = f1;
		//  144  291:fload           4
		//  145  293:fstore_3        
				if(mTextView.getLineCount() > 1)
		//* 146  294:aload_0         
		//* 147  295:getfield        #229 <Field TextView mTextView>
		//* 148  298:invokevirtual   #243 <Method int TextView.getLineCount()>
		//* 149  301:iconst_1        
		//* 150  302:icmple          107
				{
					f = mTabTextMultiLineSize;
		//  151  305:aload_0         
		//  152  306:getfield        #25  <Field TabLayout this$0>
		//  153  309:getfield        #277 <Field float TabLayout.mTabTextMultiLineSize>
		//  154  312:fstore_3        
					l = j1;
		//  155  313:iload           6
		//  156  315:istore          5
				}
			}
			if(true) goto _L6; else goto _L5
		//  157  317:goto            107
_L5:
		}

		public boolean performClick()
		{
			boolean flag1 = super.performClick();
		//    0    0:aload_0         
		//    1    1:invokespecial   #281 <Method boolean LinearLayout.performClick()>
		//    2    4:istore_2        
			boolean flag = flag1;
		//    3    5:iload_2         
		//    4    6:istore_1        
			if(mTab != null)
		//*   5    7:aload_0         
		//*   6    8:getfield        #110 <Field TabLayout$Tab mTab>
		//*   7   11:ifnull          32
			{
				if(!flag1)
		//*   8   14:iload_2         
		//*   9   15:ifne            23
					playSoundEffect(0);
		//   10   18:aload_0         
		//   11   19:iconst_0        
		//   12   20:invokevirtual   #284 <Method void playSoundEffect(int)>
				mTab.select();
		//   13   23:aload_0         
		//   14   24:getfield        #110 <Field TabLayout$Tab mTab>
		//   15   27:invokevirtual   #287 <Method void TabLayout$Tab.select()>
				flag = true;
		//   16   30:iconst_1        
		//   17   31:istore_1        
			}
			return flag;
		//   18   32:iload_1         
		//   19   33:ireturn         
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
		//*   3    5:icmpeq          82
				flag1 = true;
		//    4    8:iconst_1        
		//    5    9:istore_2        
			else
		//*   6   10:aload_0         
		//*   7   11:iload_1         
		//*   8   12:invokespecial   #299 <Method void LinearLayout.setSelected(boolean)>
		//*   9   15:iload_2         
		//*  10   16:ifeq            36
		//*  11   19:iload_1         
		//*  12   20:ifeq            36
		//*  13   23:getstatic       #304 <Field int android.os.Build$VERSION.SDK_INT>
		//*  14   26:bipush          16
		//*  15   28:icmpge          36
		//*  16   31:aload_0         
		//*  17   32:iconst_4        
		//*  18   33:invokevirtual   #307 <Method void sendAccessibilityEvent(int)>
		//*  19   36:aload_0         
		//*  20   37:getfield        #229 <Field TextView mTextView>
		//*  21   40:ifnull          51
		//*  22   43:aload_0         
		//*  23   44:getfield        #229 <Field TextView mTextView>
		//*  24   47:iload_1         
		//*  25   48:invokevirtual   #308 <Method void TextView.setSelected(boolean)>
		//*  26   51:aload_0         
		//*  27   52:getfield        #239 <Field ImageView mIconView>
		//*  28   55:ifnull          66
		//*  29   58:aload_0         
		//*  30   59:getfield        #239 <Field ImageView mIconView>
		//*  31   62:iload_1         
		//*  32   63:invokevirtual   #309 <Method void ImageView.setSelected(boolean)>
		//*  33   66:aload_0         
		//*  34   67:getfield        #311 <Field View mCustomView>
		//*  35   70:ifnull          81
		//*  36   73:aload_0         
		//*  37   74:getfield        #311 <Field View mCustomView>
		//*  38   77:iload_1         
		//*  39   78:invokevirtual   #314 <Method void View.setSelected(boolean)>
		//*  40   81:return          
				flag1 = false;
		//   41   82:iconst_0        
		//   42   83:istore_2        
			super.setSelected(flag);
			if(flag1 && flag && android.os.Build.VERSION.SDK_INT < 16)
				sendAccessibilityEvent(4);
			if(mTextView != null)
				mTextView.setSelected(flag);
			if(mIconView != null)
				mIconView.setSelected(flag);
			if(mCustomView != null)
				mCustomView.setSelected(flag);
		//*  43   84:goto            10
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
		//    2    4:astore_3        
			boolean flag;
			Object obj;
			if(tab != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          300
				obj = ((Object) (tab.getCustomView()));
		//    5    9:aload_3         
		//    6   10:invokevirtual   #321 <Method View TabLayout$Tab.getCustomView()>
		//    7   13:astore_2        
			else
		//*   8   14:aload_2         
		//*   9   15:ifnull          305
		//*  10   18:aload_2         
		//*  11   19:invokevirtual   #325 <Method android.view.ViewParent View.getParent()>
		//*  12   22:astore          4
		//*  13   24:aload           4
		//*  14   26:aload_0         
		//*  15   27:if_acmpeq       49
		//*  16   30:aload           4
		//*  17   32:ifnull          44
		//*  18   35:aload           4
		//*  19   37:checkcast       #327 <Class ViewGroup>
		//*  20   40:aload_2         
		//*  21   41:invokevirtual   #331 <Method void ViewGroup.removeView(View)>
		//*  22   44:aload_0         
		//*  23   45:aload_2         
		//*  24   46:invokevirtual   #334 <Method void addView(View)>
		//*  25   49:aload_0         
		//*  26   50:aload_2         
		//*  27   51:putfield        #311 <Field View mCustomView>
		//*  28   54:aload_0         
		//*  29   55:getfield        #229 <Field TextView mTextView>
		//*  30   58:ifnull          70
		//*  31   61:aload_0         
		//*  32   62:getfield        #229 <Field TextView mTextView>
		//*  33   65:bipush          8
		//*  34   67:invokevirtual   #149 <Method void TextView.setVisibility(int)>
		//*  35   70:aload_0         
		//*  36   71:getfield        #239 <Field ImageView mIconView>
		//*  37   74:ifnull          94
		//*  38   77:aload_0         
		//*  39   78:getfield        #239 <Field ImageView mIconView>
		//*  40   81:bipush          8
		//*  41   83:invokevirtual   #132 <Method void ImageView.setVisibility(int)>
		//*  42   86:aload_0         
		//*  43   87:getfield        #239 <Field ImageView mIconView>
		//*  44   90:aconst_null     
		//*  45   91:invokevirtual   #129 <Method void ImageView.setImageDrawable(Drawable)>
		//*  46   94:aload_0         
		//*  47   95:aload_2         
		//*  48   96:ldc2            #335 <Int 0x1020014>
		//*  49   99:invokevirtual   #339 <Method View View.findViewById(int)>
		//*  50  102:checkcast       #145 <Class TextView>
		//*  51  105:putfield        #341 <Field TextView mCustomTextView>
		//*  52  108:aload_0         
		//*  53  109:getfield        #341 <Field TextView mCustomTextView>
		//*  54  112:ifnull          126
		//*  55  115:aload_0         
		//*  56  116:aload_0         
		//*  57  117:getfield        #341 <Field TextView mCustomTextView>
		//*  58  120:invokestatic    #249 <Method int TextViewCompat.getMaxLines(TextView)>
		//*  59  123:putfield        #30  <Field int mDefaultMaxLines>
		//*  60  126:aload_0         
		//*  61  127:aload_2         
		//*  62  128:ldc2            #342 <Int 0x1020006>
		//*  63  131:invokevirtual   #339 <Method View View.findViewById(int)>
		//*  64  134:checkcast       #125 <Class ImageView>
		//*  65  137:putfield        #344 <Field ImageView mCustomIconView>
		//*  66  140:aload_0         
		//*  67  141:getfield        #311 <Field View mCustomView>
		//*  68  144:ifnonnull       338
		//*  69  147:aload_0         
		//*  70  148:getfield        #239 <Field ImageView mIconView>
		//*  71  151:ifnonnull       184
		//*  72  154:aload_0         
		//*  73  155:invokevirtual   #76  <Method Context getContext()>
		//*  74  158:invokestatic    #350 <Method LayoutInflater LayoutInflater.from(Context)>
		//*  75  161:getstatic       #355 <Field int android.support.design.R$layout.design_layout_tab_icon>
		//*  76  164:aload_0         
		//*  77  165:iconst_0        
		//*  78  166:invokevirtual   #359 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//*  79  169:checkcast       #125 <Class ImageView>
		//*  80  172:astore_2        
		//*  81  173:aload_0         
		//*  82  174:aload_2         
		//*  83  175:iconst_0        
		//*  84  176:invokevirtual   #362 <Method void addView(View, int)>
		//*  85  179:aload_0         
		//*  86  180:aload_2         
		//*  87  181:putfield        #239 <Field ImageView mIconView>
		//*  88  184:aload_0         
		//*  89  185:getfield        #229 <Field TextView mTextView>
		//*  90  188:ifnonnull       231
		//*  91  191:aload_0         
		//*  92  192:invokevirtual   #76  <Method Context getContext()>
		//*  93  195:invokestatic    #350 <Method LayoutInflater LayoutInflater.from(Context)>
		//*  94  198:getstatic       #365 <Field int android.support.design.R$layout.design_layout_tab_text>
		//*  95  201:aload_0         
		//*  96  202:iconst_0        
		//*  97  203:invokevirtual   #359 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//*  98  206:checkcast       #145 <Class TextView>
		//*  99  209:astore_2        
		//* 100  210:aload_0         
		//* 101  211:aload_2         
		//* 102  212:invokevirtual   #334 <Method void addView(View)>
		//* 103  215:aload_0         
		//* 104  216:aload_2         
		//* 105  217:putfield        #229 <Field TextView mTextView>
		//* 106  220:aload_0         
		//* 107  221:aload_0         
		//* 108  222:getfield        #229 <Field TextView mTextView>
		//* 109  225:invokestatic    #249 <Method int TextViewCompat.getMaxLines(TextView)>
		//* 110  228:putfield        #30  <Field int mDefaultMaxLines>
		//* 111  231:aload_0         
		//* 112  232:getfield        #229 <Field TextView mTextView>
		//* 113  235:aload_0         
		//* 114  236:getfield        #25  <Field TabLayout this$0>
		//* 115  239:getfield        #368 <Field int TabLayout.mTabTextAppearance>
		//* 116  242:invokestatic    #372 <Method void TextViewCompat.setTextAppearance(TextView, int)>
		//* 117  245:aload_0         
		//* 118  246:getfield        #25  <Field TabLayout this$0>
		//* 119  249:getfield        #376 <Field ColorStateList TabLayout.mTabTextColors>
		//* 120  252:ifnull          269
		//* 121  255:aload_0         
		//* 122  256:getfield        #229 <Field TextView mTextView>
		//* 123  259:aload_0         
		//* 124  260:getfield        #25  <Field TabLayout this$0>
		//* 125  263:getfield        #376 <Field ColorStateList TabLayout.mTabTextColors>
		//* 126  266:invokevirtual   #380 <Method void TextView.setTextColor(ColorStateList)>
		//* 127  269:aload_0         
		//* 128  270:aload_0         
		//* 129  271:getfield        #229 <Field TextView mTextView>
		//* 130  274:aload_0         
		//* 131  275:getfield        #239 <Field ImageView mIconView>
		//* 132  278:invokespecial   #382 <Method void updateTextAndIcon(TextView, ImageView)>
		//* 133  281:aload_3         
		//* 134  282:ifnull          367
		//* 135  285:aload_3         
		//* 136  286:invokevirtual   #383 <Method boolean TabLayout$Tab.isSelected()>
		//* 137  289:ifeq            367
		//* 138  292:iconst_1        
		//* 139  293:istore_1        
		//* 140  294:aload_0         
		//* 141  295:iload_1         
		//* 142  296:invokevirtual   #295 <Method void setSelected(boolean)>
		//* 143  299:return          
				obj = null;
		//  144  300:aconst_null     
		//  145  301:astore_2        
			if(obj != null)
			{
				android.view.ViewParent viewparent = ((View) (obj)).getParent();
				if(viewparent != this)
				{
					if(viewparent != null)
						((ViewGroup)viewparent).removeView(((View) (obj)));
					addView(((View) (obj)));
				}
				mCustomView = ((View) (obj));
				if(mTextView != null)
					mTextView.setVisibility(8);
				if(mIconView != null)
				{
					mIconView.setVisibility(8);
					mIconView.setImageDrawable(((Drawable) (null)));
				}
				mCustomTextView = (TextView)((View) (obj)).findViewById(0x1020014);
				if(mCustomTextView != null)
					mDefaultMaxLines = TextViewCompat.getMaxLines(mCustomTextView);
				mCustomIconView = (ImageView)((View) (obj)).findViewById(0x1020006);
			} else
		//* 146  302:goto            14
			{
				if(mCustomView != null)
		//* 147  305:aload_0         
		//* 148  306:getfield        #311 <Field View mCustomView>
		//* 149  309:ifnull          325
				{
					removeView(mCustomView);
		//  150  312:aload_0         
		//  151  313:aload_0         
		//  152  314:getfield        #311 <Field View mCustomView>
		//  153  317:invokevirtual   #384 <Method void removeView(View)>
					mCustomView = null;
		//  154  320:aload_0         
		//  155  321:aconst_null     
		//  156  322:putfield        #311 <Field View mCustomView>
				}
				mCustomTextView = null;
		//  157  325:aload_0         
		//  158  326:aconst_null     
		//  159  327:putfield        #341 <Field TextView mCustomTextView>
				mCustomIconView = null;
		//  160  330:aload_0         
		//  161  331:aconst_null     
		//  162  332:putfield        #344 <Field ImageView mCustomIconView>
			}
			if(mCustomView == null)
			{
				if(mIconView == null)
				{
					obj = ((Object) ((ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_icon, ((ViewGroup) (this)), false)));
					addView(((View) (obj)), 0);
					mIconView = ((ImageView) (obj));
				}
				if(mTextView == null)
				{
					obj = ((Object) ((TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_text, ((ViewGroup) (this)), false)));
					addView(((View) (obj)));
					mTextView = ((TextView) (obj));
					mDefaultMaxLines = TextViewCompat.getMaxLines(mTextView);
				}
				TextViewCompat.setTextAppearance(mTextView, mTabTextAppearance);
				if(mTabTextColors != null)
					mTextView.setTextColor(mTabTextColors);
				updateTextAndIcon(mTextView, mIconView);
			} else
		//* 163  335:goto            140
			if(mCustomTextView != null || mCustomIconView != null)
		//* 164  338:aload_0         
		//* 165  339:getfield        #341 <Field TextView mCustomTextView>
		//* 166  342:ifnonnull       352
		//* 167  345:aload_0         
		//* 168  346:getfield        #344 <Field ImageView mCustomIconView>
		//* 169  349:ifnull          281
				updateTextAndIcon(mCustomTextView, mCustomIconView);
		//  170  352:aload_0         
		//  171  353:aload_0         
		//  172  354:getfield        #341 <Field TextView mCustomTextView>
		//  173  357:aload_0         
		//  174  358:getfield        #344 <Field ImageView mCustomIconView>
		//  175  361:invokespecial   #382 <Method void updateTextAndIcon(TextView, ImageView)>
			if(tab != null && tab.isSelected())
				flag = true;
			else
		//* 176  364:goto            281
				flag = false;
		//  177  367:iconst_0        
		//  178  368:istore_1        
			setSelected(flag);
		//* 179  369:goto            294
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
		if(getWindowToken() == null || !ViewCompat.isLaidOut(((View) (this))) || mTabStrip.childrenNeedLayout())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #424 <Method android.os.IBinder getWindowToken()>
	//*   6   10:ifnull          30
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #430 <Method boolean ViewCompat.isLaidOut(View)>
	//*   9   17:ifeq            30
	//*  10   20:aload_0         
	//*  11   21:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//*  12   24:invokevirtual   #434 <Method boolean TabLayout$SlidingTabStrip.childrenNeedLayout()>
	//*  13   27:ifeq            38
		{
			setScrollPosition(i, 0.0F, true);
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:fconst_0        
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #438 <Method void setScrollPosition(int, float, boolean)>
			return;
	//   19   37:return          
		}
		int j = getScrollX();
	//   20   38:aload_0         
	//   21   39:invokevirtual   #441 <Method int getScrollX()>
	//   22   42:istore_2        
		int k = calculateScrollXForTab(i, 0.0F);
	//   23   43:aload_0         
	//   24   44:iload_1         
	//   25   45:fconst_0        
	//   26   46:invokespecial   #445 <Method int calculateScrollXForTab(int, float)>
	//   27   49:istore_3        
		if(j != k)
	//*  28   50:iload_2         
	//*  29   51:iload_3         
	//*  30   52:icmpeq          84
		{
			ensureScrollAnimator();
	//   31   55:aload_0         
	//   32   56:invokespecial   #448 <Method void ensureScrollAnimator()>
			mScrollAnimator.setIntValues(new int[] {
				j, k
			});
	//   33   59:aload_0         
	//   34   60:getfield        #450 <Field ValueAnimator mScrollAnimator>
	//   35   63:iconst_2        
	//   36   64:newarray        int[]
	//   37   66:dup             
	//   38   67:iconst_0        
	//   39   68:iload_2         
	//   40   69:iastore         
	//   41   70:dup             
	//   42   71:iconst_1        
	//   43   72:iload_3         
	//   44   73:iastore         
	//   45   74:invokevirtual   #456 <Method void ValueAnimator.setIntValues(int[])>
			mScrollAnimator.start();
	//   46   77:aload_0         
	//   47   78:getfield        #450 <Field ValueAnimator mScrollAnimator>
	//   48   81:invokevirtual   #459 <Method void ValueAnimator.start()>
		}
		mTabStrip.animateIndicatorToPosition(i, 300);
	//   49   84:aload_0         
	//   50   85:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   51   88:iload_1         
	//   52   89:sipush          300
	//   53   92:invokevirtual   #462 <Method void TabLayout$SlidingTabStrip.animateIndicatorToPosition(int, int)>
	//   54   95:return          
	}

	private void applyModeAndGravity()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(mMode == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #316 <Field int mMode>
	//*   4    6:ifne            23
			i = Math.max(0, mContentInsetStart - mTabPaddingStart);
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:getfield        #308 <Field int mContentInsetStart>
	//    8   14:aload_0         
	//    9   15:getfield        #220 <Field int mTabPaddingStart>
	//   10   18:isub            
	//   11   19:invokestatic    #467 <Method int Math.max(int, int)>
	//   12   22:istore_1        
		ViewCompat.setPaddingRelative(((View) (mTabStrip)), i, 0, 0, 0);
	//   13   23:aload_0         
	//   14   24:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   15   27:iload_1         
	//   16   28:iconst_0        
	//   17   29:iconst_0        
	//   18   30:iconst_0        
	//   19   31:invokestatic    #471 <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
		mMode;
	//   20   34:aload_0         
	//   21   35:getfield        #316 <Field int mMode>
		JVM INSTR tableswitch 0 1: default 60
	//	               0 77
	//	               1 66;
	//   22   38:tableswitch     0 1: default 60
	//	               0 77
	//	               1 66
		   goto _L1 _L2 _L3
_L1:
		updateTabViews(true);
	//   23   60:aload_0         
	//   24   61:iconst_1        
	//   25   62:invokevirtual   #474 <Method void updateTabViews(boolean)>
		return;
	//   26   65:return          
_L3:
		mTabStrip.setGravity(1);
	//   27   66:aload_0         
	//   28   67:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   29   70:iconst_1        
	//   30   71:invokevirtual   #477 <Method void TabLayout$SlidingTabStrip.setGravity(int)>
		continue; /* Loop/switch isn't completed */
	//   31   74:goto            60
_L2:
		mTabStrip.setGravity(0x800003);
	//   32   77:aload_0         
	//   33   78:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   34   81:ldc2            #478 <Int 0x800003>
	//   35   84:invokevirtual   #477 <Method void TabLayout$SlidingTabStrip.setGravity(int)>
		if(true) goto _L1; else goto _L4
	//   36   87:goto            60
_L4:
	}

	private int calculateScrollXForTab(int i, float f)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(mMode == 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #316 <Field int mMode>
	//*   4    6:ifne            124
		{
			View view1 = mTabStrip.getChildAt(i);
	//    5    9:aload_0         
	//    6   10:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #482 <Method View TabLayout$SlidingTabStrip.getChildAt(int)>
	//    9   17:astore          6
			int k;
			View view;
			if(i + 1 < mTabStrip.getChildCount())
	//*  10   19:iload_1         
	//*  11   20:iconst_1        
	//*  12   21:iadd            
	//*  13   22:aload_0         
	//*  14   23:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//*  15   26:invokevirtual   #485 <Method int TabLayout$SlidingTabStrip.getChildCount()>
	//*  16   29:icmpge          108
				view = mTabStrip.getChildAt(i + 1);
	//   17   32:aload_0         
	//   18   33:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   19   36:iload_1         
	//   20   37:iconst_1        
	//   21   38:iadd            
	//   22   39:invokevirtual   #482 <Method View TabLayout$SlidingTabStrip.getChildAt(int)>
	//   23   42:astore          5
			else
	//*  24   44:aload           6
	//*  25   46:ifnull          114
	//*  26   49:aload           6
	//*  27   51:invokevirtual   #490 <Method int View.getWidth()>
	//*  28   54:istore_1        
	//*  29   55:aload           5
	//*  30   57:ifnull          66
	//*  31   60:aload           5
	//*  32   62:invokevirtual   #490 <Method int View.getWidth()>
	//*  33   65:istore_3        
	//*  34   66:aload           6
	//*  35   68:invokevirtual   #493 <Method int View.getLeft()>
	//*  36   71:iload_1         
	//*  37   72:iconst_2        
	//*  38   73:idiv            
	//*  39   74:iadd            
	//*  40   75:aload_0         
	//*  41   76:invokevirtual   #494 <Method int getWidth()>
	//*  42   79:iconst_2        
	//*  43   80:idiv            
	//*  44   81:isub            
	//*  45   82:istore          4
	//*  46   84:iload_1         
	//*  47   85:iload_3         
	//*  48   86:iadd            
	//*  49   87:i2f             
	//*  50   88:ldc2            #495 <Float 0.5F>
	//*  51   91:fmul            
	//*  52   92:fload_2         
	//*  53   93:fmul            
	//*  54   94:f2i             
	//*  55   95:istore_1        
	//*  56   96:aload_0         
	//*  57   97:invokestatic    #499 <Method int ViewCompat.getLayoutDirection(View)>
	//*  58  100:ifne            119
	//*  59  103:iload           4
	//*  60  105:iload_1         
	//*  61  106:iadd            
	//*  62  107:ireturn         
				view = null;
	//   63  108:aconst_null     
	//   64  109:astore          5
			if(view1 != null)
				i = view1.getWidth();
			else
	//*  65  111:goto            44
				i = 0;
	//   66  114:iconst_0        
	//   67  115:istore_1        
			if(view != null)
				j = view.getWidth();
			k = (view1.getLeft() + i / 2) - getWidth() / 2;
			i = (int)((float)(i + j) * 0.5F * f);
			if(ViewCompat.getLayoutDirection(((View) (this))) == 0)
				return k + i;
			else
	//*  68  116:goto            55
				return k - i;
	//   69  119:iload           4
	//   70  121:iload_1         
	//   71  122:isub            
	//   72  123:ireturn         
		} else
		{
			return 0;
	//   73  124:iconst_0        
	//   74  125:ireturn         
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
		for(i++; i < j; i++)
	//*  12   22:iload_2         
	//*  13   23:iconst_1        
	//*  14   24:iadd            
	//*  15   25:istore_2        
	//*  16   26:iload_2         
	//*  17   27:iload_3         
	//*  18   28:icmpge          53
			((Tab)mTabs.get(i)).setPosition(i);
	//   19   31:aload_0         
	//   20   32:getfield        #138 <Field ArrayList mTabs>
	//   21   35:iload_2         
	//   22   36:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   23   39:checkcast       #27  <Class TabLayout$Tab>
	//   24   42:iload_2         
	//   25   43:invokevirtual   #504 <Method void TabLayout$Tab.setPosition(int)>

	//   26   46:iload_2         
	//   27   47:iconst_1        
	//   28   48:iadd            
	//   29   49:istore_2        
	//*  30   50:goto            26
	//   31   53:return          
	}

	private static ColorStateList createColorStateList(int i, int j)
	{
		int ai[][] = new int[2][];
	//    0    0:iconst_2        
	//    1    1:anewarray       int[][]
	//    2    4:astore_2        
		int ai1[] = new int[2];
	//    3    5:iconst_2        
	//    4    6:newarray        int[]
	//    5    8:astore_3        
		ai[0] = SELECTED_STATE_SET;
	//    6    9:aload_2         
	//    7   10:iconst_0        
	//    8   11:getstatic       #519 <Field int[] SELECTED_STATE_SET>
	//    9   14:aastore         
		ai1[0] = j;
	//   10   15:aload_3         
	//   11   16:iconst_0        
	//   12   17:iload_1         
	//   13   18:iastore         
		j = 0 + 1;
	//   14   19:iconst_0        
	//   15   20:iconst_1        
	//   16   21:iadd            
	//   17   22:istore_1        
		ai[j] = EMPTY_STATE_SET;
	//   18   23:aload_2         
	//   19   24:iload_1         
	//   20   25:getstatic       #522 <Field int[] EMPTY_STATE_SET>
	//   21   28:aastore         
		ai1[j] = i;
	//   22   29:aload_3         
	//   23   30:iload_1         
	//   24   31:iload_0         
	//   25   32:iastore         
		return new ColorStateList(ai, ai1);
	//   26   33:new             #280 <Class ColorStateList>
	//   27   36:dup             
	//   28   37:aload_2         
	//   29   38:aload_3         
	//   30   39:invokespecial   #525 <Method void ColorStateList(int[][], int[])>
	//   31   42:areturn         
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
		TabView tabview1;
		if(mTabViewPool != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
	//*   2    4:ifnull          59
			tabview = (TabView)mTabViewPool.acquire();
	//    3    7:aload_0         
	//    4    8:getfield        #148 <Field android.support.v4.util.Pools$Pool mTabViewPool>
	//    5   11:invokeinterface #540 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    6   16:checkcast       #36  <Class TabLayout$TabView>
	//    7   19:astore_2        
		else
	//*   8   20:aload_2         
	//*   9   21:astore_3        
	//*  10   22:aload_2         
	//*  11   23:ifnonnull       39
	//*  12   26:new             #36  <Class TabLayout$TabView>
	//*  13   29:dup             
	//*  14   30:aload_0         
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #544 <Method Context getContext()>
	//*  17   35:invokespecial   #545 <Method void TabLayout$TabView(TabLayout, Context)>
	//*  18   38:astore_3        
	//*  19   39:aload_3         
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #548 <Method void TabLayout$TabView.setTab(TabLayout$Tab)>
	//*  22   44:aload_3         
	//*  23   45:iconst_1        
	//*  24   46:invokevirtual   #551 <Method void TabLayout$TabView.setFocusable(boolean)>
	//*  25   49:aload_3         
	//*  26   50:aload_0         
	//*  27   51:invokespecial   #554 <Method int getTabMinWidth()>
	//*  28   54:invokevirtual   #557 <Method void TabLayout$TabView.setMinimumWidth(int)>
	//*  29   57:aload_3         
	//*  30   58:areturn         
			tabview = null;
	//   31   59:aconst_null     
	//   32   60:astore_2        
		tabview1 = tabview;
		if(tabview == null)
			tabview1 = new TabView(getContext());
		tabview1.setTab(tab);
		tabview1.setFocusable(true);
		tabview1.setMinimumWidth(getTabMinWidth());
		return tabview1;
	//*  33   61:goto            20
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
	//*   1    1:getfield        #450 <Field ValueAnimator mScrollAnimator>
	//*   2    4:ifnonnull       54
		{
			mScrollAnimator = new ValueAnimator();
	//    3    7:aload_0         
	//    4    8:new             #452 <Class ValueAnimator>
	//    5   11:dup             
	//    6   12:invokespecial   #570 <Method void ValueAnimator()>
	//    7   15:putfield        #450 <Field ValueAnimator mScrollAnimator>
			mScrollAnimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
	//    8   18:aload_0         
	//    9   19:getfield        #450 <Field ValueAnimator mScrollAnimator>
	//   10   22:getstatic       #576 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR>
	//   11   25:invokevirtual   #580 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			mScrollAnimator.setDuration(300L);
	//   12   28:aload_0         
	//   13   29:getfield        #450 <Field ValueAnimator mScrollAnimator>
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
	//   18   40:getfield        #450 <Field ValueAnimator mScrollAnimator>
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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		int j = mTabs.size();
	//    4    4:aload_0         
	//    5    5:getfield        #138 <Field ArrayList mTabs>
	//    6    8:invokevirtual   #511 <Method int ArrayList.size()>
	//    7   11:istore          4
		do
		{
label0:
			{
				boolean flag = flag1;
	//    8   13:iload_3         
	//    9   14:istore_2        
				if(i < j)
	//*  10   15:iload_1         
	//*  11   16:iload           4
	//*  12   18:icmpge          60
				{
					Tab tab = (Tab)mTabs.get(i);
	//   13   21:aload_0         
	//   14   22:getfield        #138 <Field ArrayList mTabs>
	//   15   25:iload_1         
	//   16   26:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   17   29:checkcast       #27  <Class TabLayout$Tab>
	//   18   32:astore          5
					if(tab == null || tab.getIcon() == null || TextUtils.isEmpty(tab.getText()))
						break label0;
	//   19   34:aload           5
	//   20   36:ifnull          67
	//   21   39:aload           5
	//   22   41:invokevirtual   #598 <Method Drawable TabLayout$Tab.getIcon()>
	//   23   44:ifnull          67
	//   24   47:aload           5
	//   25   49:invokevirtual   #601 <Method CharSequence TabLayout$Tab.getText()>
	//   26   52:invokestatic    #387 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   27   55:ifne            67
					flag = true;
	//   28   58:iconst_1        
	//   29   59:istore_2        
				}
				return !flag ? 48 : 72;
	//   30   60:iload_2         
	//   31   61:ifeq            74
	//   32   64:bipush          72
	//   33   66:ireturn         
	//   34   67:iload_1         
	//   35   68:iconst_1        
	//   36   69:iadd            
	//   37   70:istore_1        
	//   38   71:goto            13
	//   39   74:bipush          48
	//   40   76:ireturn         
			}
			i++;
		} while(true);
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
			int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
			while(j < k) 
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
	//*  19   32:icmpne          52
					flag = true;
	//   20   35:iconst_1        
	//   21   36:istore          4
				else
	//*  22   38:aload           5
	//*  23   40:iload           4
	//*  24   42:invokevirtual   #632 <Method void View.setSelected(boolean)>
	//*  25   45:iload_2         
	//*  26   46:iconst_1        
	//*  27   47:iadd            
	//*  28   48:istore_2        
	//*  29   49:goto            15
					flag = false;
	//   30   52:iconst_0        
	//   31   53:istore          4
				view.setSelected(flag);
				j++;
			}
		}
	//*  32   55:goto            38
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
	//*  30   64:ifnull          195
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
	//   91  186:invokevirtual   #438 <Method void setScrollPosition(int, float, boolean)>
		} else
	//*  92  189:aload_0         
	//*  93  190:iload_3         
	//*  94  191:putfield        #688 <Field boolean mSetupViewPagerImplicitly>
	//*  95  194:return          
		{
			mViewPager = null;
	//   96  195:aload_0         
	//   97  196:aconst_null     
	//   98  197:putfield        #637 <Field ViewPager mViewPager>
			setPagerAdapter(((PagerAdapter) (null)), false);
	//   99  200:aload_0         
	//  100  201:aconst_null     
	//  101  202:iconst_0        
	//  102  203:invokevirtual   #676 <Method void setPagerAdapter(PagerAdapter, boolean)>
		}
		mSetupViewPagerImplicitly = flag1;
	//* 103  206:goto            189
	}

	private void updateAllTabs()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(int j = mTabs.size(); i < j; i++)
	//*   2    2:aload_0         
	//*   3    3:getfield        #138 <Field ArrayList mTabs>
	//*   4    6:invokevirtual   #511 <Method int ArrayList.size()>
	//*   5    9:istore_2        
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
		if(i < 0 || i >= getTabCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #762 <Method int getTabCount()>
	//*   5    9:icmplt          14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		else
			return (Tab)mTabs.get(i);
	//    8   14:aload_0         
	//    9   15:getfield        #138 <Field ArrayList mTabs>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #27  <Class TabLayout$Tab>
	//   13   25:areturn         
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
		android.view.View.MeasureSpec.getMode(j);
	//   11   19:iload_2         
	//   12   20:invokestatic    #801 <Method int android.view.View$MeasureSpec.getMode(int)>
		JVM INSTR lookupswitch 2: default 48
	//	               -2147483648: 171
	//	               0: 189;
	//   13   23:lookupswitch    2: default 48
	//	               -2147483648: 171
	//	               0: 189
		   goto _L1 _L2 _L3
_L1:
		View view;
		k = android.view.View.MeasureSpec.getSize(i);
	//   14   48:iload_1         
	//   15   49:invokestatic    #804 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   16   52:istore_3        
		if(android.view.View.MeasureSpec.getMode(i) != 0)
	//*  17   53:iload_1         
	//*  18   54:invokestatic    #801 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  19   57:ifeq            77
		{
			if(mRequestedTabMaxWidth > 0)
	//*  20   60:aload_0         
	//*  21   61:getfield        #298 <Field int mRequestedTabMaxWidth>
	//*  22   64:ifle            200
				k = mRequestedTabMaxWidth;
	//   23   67:aload_0         
	//   24   68:getfield        #298 <Field int mRequestedTabMaxWidth>
	//   25   71:istore_3        
			else
	//*  26   72:aload_0         
	//*  27   73:iload_3         
	//*  28   74:putfield        #141 <Field int mTabMaxWidth>
	//*  29   77:aload_0         
	//*  30   78:iload_1         
	//*  31   79:iload_2         
	//*  32   80:invokespecial   #806 <Method void HorizontalScrollView.onMeasure(int, int)>
	//*  33   83:aload_0         
	//*  34   84:invokevirtual   #807 <Method int getChildCount()>
	//*  35   87:iconst_1        
	//*  36   88:icmpne          170
	//*  37   91:aload_0         
	//*  38   92:iconst_0        
	//*  39   93:invokevirtual   #808 <Method View getChildAt(int)>
	//*  40   96:astore          4
	//*  41   98:iconst_0        
	//*  42   99:istore_1        
	//*  43  100:aload_0         
	//*  44  101:getfield        #316 <Field int mMode>
	//*  45  104:tableswitch     0 1: default 128
	//	               0 212
	//	               1 234
	//*  46  128:iload_1         
	//*  47  129:ifeq            170
	//*  48  132:iload_2         
	//*  49  133:aload_0         
	//*  50  134:invokevirtual   #793 <Method int getPaddingTop()>
	//*  51  137:aload_0         
	//*  52  138:invokevirtual   #796 <Method int getPaddingBottom()>
	//*  53  141:iadd            
	//*  54  142:aload           4
	//*  55  144:invokevirtual   #812 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  56  147:getfield        #817 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  57  150:invokestatic    #821 <Method int getChildMeasureSpec(int, int, int)>
	//*  58  153:istore_1        
	//*  59  154:aload           4
	//*  60  156:aload_0         
	//*  61  157:invokevirtual   #824 <Method int getMeasuredWidth()>
	//*  62  160:ldc2            #825 <Int 0x40000000>
	//*  63  163:invokestatic    #828 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  64  166:iload_1         
	//*  65  167:invokevirtual   #831 <Method void View.measure(int, int)>
	//*  66  170:return          
	//*  67  171:iload_3         
	//*  68  172:iload_2         
	//*  69  173:invokestatic    #804 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  70  176:invokestatic    #834 <Method int Math.min(int, int)>
	//*  71  179:ldc2            #825 <Int 0x40000000>
	//*  72  182:invokestatic    #828 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  73  185:istore_2        
	//*  74  186:goto            48
	//*  75  189:iload_3         
	//*  76  190:ldc2            #825 <Int 0x40000000>
	//*  77  193:invokestatic    #828 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  78  196:istore_2        
	//*  79  197:goto            48
				k -= dpToPx(56);
	//   80  200:iload_3         
	//   81  201:aload_0         
	//   82  202:bipush          56
	//   83  204:invokevirtual   #790 <Method int dpToPx(int)>
	//   84  207:isub            
	//   85  208:istore_3        
			mTabMaxWidth = k;
		}
		super.onMeasure(i, j);
		if(getChildCount() != 1) goto _L5; else goto _L4
_L4:
		view = getChildAt(0);
		i = 0;
		mMode;
		JVM INSTR tableswitch 0 1: default 128
	//	               0 212
	//	               1 234;
		   goto _L6 _L7 _L8
_L6:
		break; /* Loop/switch isn't completed */
_L8:
		break MISSING_BLOCK_LABEL_234;
_L9:
		if(i != 0)
		{
			i = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height);
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000), i);
		}
_L5:
		return;
_L2:
		j = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k, android.view.View.MeasureSpec.getSize(j)), 0x40000000);
		  goto _L1
_L3:
		j = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
		  goto _L1
	//*  86  209:goto            72
_L7:
		if(view.getMeasuredWidth() < getMeasuredWidth())
	//*  87  212:aload           4
	//*  88  214:invokevirtual   #835 <Method int View.getMeasuredWidth()>
	//*  89  217:aload_0         
	//*  90  218:invokevirtual   #824 <Method int getMeasuredWidth()>
	//*  91  221:icmpge          229
			i = 1;
	//   92  224:iconst_1        
	//   93  225:istore_1        
		else
	//*  94  226:goto            128
			i = 0;
	//   95  229:iconst_0        
	//   96  230:istore_1        
		  goto _L9
	//*  97  231:goto            226
		if(view.getMeasuredWidth() != getMeasuredWidth())
	//*  98  234:aload           4
	//*  99  236:invokevirtual   #835 <Method int View.getMeasuredWidth()>
	//* 100  239:aload_0         
	//* 101  240:invokevirtual   #824 <Method int getMeasuredWidth()>
	//* 102  243:icmpeq          251
			i = 1;
	//  103  246:iconst_1        
	//  104  247:istore_1        
		else
	//* 105  248:goto            128
			i = 0;
	//  106  251:iconst_0        
	//  107  252:istore_1        
		  goto _L9
	//* 108  253:goto            248
	}

	void populateFromPagerAdapter()
	{
		removeAllTabs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #839 <Method void removeAllTabs()>
		if(mPagerAdapter != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #841 <Field PagerAdapter mPagerAdapter>
	//*   4    8:ifnull          97
		{
			int k = mPagerAdapter.getCount();
	//    5   11:aload_0         
	//    6   12:getfield        #841 <Field PagerAdapter mPagerAdapter>
	//    7   15:invokevirtual   #846 <Method int PagerAdapter.getCount()>
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
	//   18   32:getfield        #841 <Field PagerAdapter mPagerAdapter>
	//   19   35:iload_1         
	//   20   36:invokevirtual   #850 <Method CharSequence PagerAdapter.getPageTitle(int)>
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
	//*  40   74:invokevirtual   #852 <Method int getSelectedTabPosition()>
	//*  41   77:icmpeq          97
	//*  42   80:iload_1         
	//*  43   81:aload_0         
	//*  44   82:invokevirtual   #762 <Method int getTabCount()>
	//*  45   85:icmpge          97
					selectTab(getTabAt(j));
	//   46   88:aload_0         
	//   47   89:aload_0         
	//   48   90:iload_1         
	//   49   91:invokevirtual   #854 <Method TabLayout$Tab getTabAt(int)>
	//   50   94:invokevirtual   #857 <Method void selectTab(TabLayout$Tab)>
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
	//   10   16:invokespecial   #859 <Method void removeTabViewAt(int)>

	//   11   19:iload_1         
	//   12   20:iconst_1        
	//   13   21:isub            
	//   14   22:istore_1        
	//*  15   23:goto            10
		Tab tab;
		for(Iterator iterator = mTabs.iterator(); iterator.hasNext(); sTabPool.release(((Object) (tab))))
	//*  16   26:aload_0         
	//*  17   27:getfield        #138 <Field ArrayList mTabs>
	//*  18   30:invokevirtual   #863 <Method Iterator ArrayList.iterator()>
	//*  19   33:astore_2        
	//*  20   34:aload_2         
	//*  21   35:invokeinterface #868 <Method boolean Iterator.hasNext()>
	//*  22   40:ifeq            76
		{
			tab = (Tab)iterator.next();
	//   23   43:aload_2         
	//   24   44:invokeinterface #871 <Method Object Iterator.next()>
	//   25   49:checkcast       #27  <Class TabLayout$Tab>
	//   26   52:astore_3        
			iterator.remove();
	//   27   53:aload_2         
	//   28   54:invokeinterface #874 <Method void Iterator.remove()>
			tab.reset();
	//   29   59:aload_3         
	//   30   60:invokevirtual   #875 <Method void TabLayout$Tab.reset()>
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
	//    3    5:invokevirtual   #877 <Method boolean ArrayList.remove(Object)>
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
	//    6   12:ldc2            #880 <String "Tab does not belong to this TabLayout.">
	//    7   15:invokespecial   #419 <Method void IllegalArgumentException(String)>
	//    8   18:athrow          
		} else
		{
			removeTabAt(tab.getPosition());
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//   12   24:invokevirtual   #883 <Method void removeTabAt(int)>
			return;
	//   13   27:return          
		}
	}

	public void removeTabAt(int i)
	{
		int j;
		int l;
		Tab tab;
		if(mSelectedTab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #758 <Field TabLayout$Tab mSelectedTab>
	//*   2    4:ifnull          93
			j = mSelectedTab.getPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #758 <Field TabLayout$Tab mSelectedTab>
	//    5   11:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//    6   14:istore_2        
		else
	//*   7   15:aload_0         
	//*   8   16:iload_1         
	//*   9   17:invokespecial   #859 <Method void removeTabViewAt(int)>
	//*  10   20:aload_0         
	//*  11   21:getfield        #138 <Field ArrayList mTabs>
	//*  12   24:iload_1         
	//*  13   25:invokevirtual   #885 <Method Object ArrayList.remove(int)>
	//*  14   28:checkcast       #27  <Class TabLayout$Tab>
	//*  15   31:astore          5
	//*  16   33:aload           5
	//*  17   35:ifnull          54
	//*  18   38:aload           5
	//*  19   40:invokevirtual   #875 <Method void TabLayout$Tab.reset()>
	//*  20   43:getstatic       #123 <Field android.support.v4.util.Pools$Pool sTabPool>
	//*  21   46:aload           5
	//*  22   48:invokeinterface #625 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//*  23   53:pop             
	//*  24   54:aload_0         
	//*  25   55:getfield        #138 <Field ArrayList mTabs>
	//*  26   58:invokevirtual   #511 <Method int ArrayList.size()>
	//*  27   61:istore          4
	//*  28   63:iload_1         
	//*  29   64:istore_3        
	//*  30   65:iload_3         
	//*  31   66:iload           4
	//*  32   68:icmpge          98
	//*  33   71:aload_0         
	//*  34   72:getfield        #138 <Field ArrayList mTabs>
	//*  35   75:iload_3         
	//*  36   76:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//*  37   79:checkcast       #27  <Class TabLayout$Tab>
	//*  38   82:iload_3         
	//*  39   83:invokevirtual   #504 <Method void TabLayout$Tab.setPosition(int)>
	//*  40   86:iload_3         
	//*  41   87:iconst_1        
	//*  42   88:iadd            
	//*  43   89:istore_3        
	//*  44   90:goto            65
			j = 0;
	//   45   93:iconst_0        
	//   46   94:istore_2        
		removeTabViewAt(i);
		tab = (Tab)mTabs.remove(i);
		if(tab != null)
		{
			tab.reset();
			sTabPool.release(((Object) (tab)));
		}
		l = mTabs.size();
		for(int k = i; k < l; k++)
			((Tab)mTabs.get(k)).setPosition(k);

	//*  47   95:goto            15
		if(j == i)
	//*  48   98:iload_2         
	//*  49   99:iload_1         
	//*  50  100:icmpne          122
		{
			Tab tab1;
			if(mTabs.isEmpty())
	//*  51  103:aload_0         
	//*  52  104:getfield        #138 <Field ArrayList mTabs>
	//*  53  107:invokevirtual   #705 <Method boolean ArrayList.isEmpty()>
	//*  54  110:ifeq            123
				tab1 = null;
	//   55  113:aconst_null     
	//   56  114:astore          5
			else
	//*  57  116:aload_0         
	//*  58  117:aload           5
	//*  59  119:invokevirtual   #857 <Method void selectTab(TabLayout$Tab)>
	//*  60  122:return          
				tab1 = (Tab)mTabs.get(Math.max(0, i - 1));
	//   61  123:aload_0         
	//   62  124:getfield        #138 <Field ArrayList mTabs>
	//   63  127:iconst_0        
	//   64  128:iload_1         
	//   65  129:iconst_1        
	//   66  130:isub            
	//   67  131:invokestatic    #467 <Method int Math.max(int, int)>
	//   68  134:invokevirtual   #515 <Method Object ArrayList.get(int)>
	//   69  137:checkcast       #27  <Class TabLayout$Tab>
	//   70  140:astore          5
			selectTab(tab1);
		}
	//*  71  142:goto            116
	}

	void selectTab(Tab tab)
	{
		selectTab(tab, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #887 <Method void selectTab(TabLayout$Tab, boolean)>
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
	//*   7   14:ifnull          30
			{
				dispatchTabReselected(tab);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokespecial   #889 <Method void dispatchTabReselected(TabLayout$Tab)>
				animateToTab(tab.getPosition());
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//   14   27:invokespecial   #891 <Method void animateToTab(int)>
			}
		} else
	//*  15   30:return          
		{
			int i;
			if(tab != null)
	//*  16   31:aload_1         
	//*  17   32:ifnull          106
				i = tab.getPosition();
	//   18   35:aload_1         
	//   19   36:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//   20   39:istore_3        
			else
	//*  21   40:iload_2         
	//*  22   41:ifeq            80
	//*  23   44:aload           4
	//*  24   46:ifnull          58
	//*  25   49:aload           4
	//*  26   51:invokevirtual   #403 <Method int TabLayout$Tab.getPosition()>
	//*  27   54:iconst_m1       
	//*  28   55:icmpne          111
	//*  29   58:iload_3         
	//*  30   59:iconst_m1       
	//*  31   60:icmpeq          111
	//*  32   63:aload_0         
	//*  33   64:iload_3         
	//*  34   65:fconst_0        
	//*  35   66:iconst_1        
	//*  36   67:invokevirtual   #438 <Method void setScrollPosition(int, float, boolean)>
	//*  37   70:iload_3         
	//*  38   71:iconst_m1       
	//*  39   72:icmpeq          80
	//*  40   75:aload_0         
	//*  41   76:iload_3         
	//*  42   77:invokespecial   #893 <Method void setSelectedTabView(int)>
	//*  43   80:aload           4
	//*  44   82:ifnull          91
	//*  45   85:aload_0         
	//*  46   86:aload           4
	//*  47   88:invokespecial   #895 <Method void dispatchTabUnselected(TabLayout$Tab)>
	//*  48   91:aload_0         
	//*  49   92:aload_1         
	//*  50   93:putfield        #758 <Field TabLayout$Tab mSelectedTab>
	//*  51   96:aload_1         
	//*  52   97:ifnull          30
	//*  53  100:aload_0         
	//*  54  101:aload_1         
	//*  55  102:invokespecial   #897 <Method void dispatchTabSelected(TabLayout$Tab)>
	//*  56  105:return          
				i = -1;
	//   57  106:iconst_m1       
	//   58  107:istore_3        
			if(flag)
			{
				if((tab1 == null || tab1.getPosition() == -1) && i != -1)
					setScrollPosition(i, 0.0F, true);
				else
	//*  59  108:goto            40
					animateToTab(i);
	//   60  111:aload_0         
	//   61  112:iload_3         
	//   62  113:invokespecial   #891 <Method void animateToTab(int)>
				if(i != -1)
					setSelectedTabView(i);
			}
			if(tab1 != null)
				dispatchTabUnselected(tab1);
			mSelectedTab = tab;
			if(tab != null)
			{
				dispatchTabSelected(tab);
				return;
			}
		}
	//*  63  116:goto            70
	}

	public void setOnTabSelectedListener(OnTabSelectedListener ontabselectedlistener)
	{
		if(mSelectedListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #901 <Field TabLayout$OnTabSelectedListener mSelectedListener>
	//*   2    4:ifnull          15
			removeOnTabSelectedListener(mSelectedListener);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #901 <Field TabLayout$OnTabSelectedListener mSelectedListener>
	//    6   12:invokevirtual   #657 <Method void removeOnTabSelectedListener(TabLayout$OnTabSelectedListener)>
		mSelectedListener = ontabselectedlistener;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #901 <Field TabLayout$OnTabSelectedListener mSelectedListener>
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
	//*   1    1:getfield        #841 <Field PagerAdapter mPagerAdapter>
	//*   2    4:ifnull          25
	//*   3    7:aload_0         
	//*   4    8:getfield        #904 <Field DataSetObserver mPagerAdapterObserver>
	//*   5   11:ifnull          25
			mPagerAdapter.unregisterDataSetObserver(mPagerAdapterObserver);
	//    6   14:aload_0         
	//    7   15:getfield        #841 <Field PagerAdapter mPagerAdapter>
	//    8   18:aload_0         
	//    9   19:getfield        #904 <Field DataSetObserver mPagerAdapterObserver>
	//   10   22:invokevirtual   #908 <Method void PagerAdapter.unregisterDataSetObserver(DataSetObserver)>
		mPagerAdapter = pageradapter;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #841 <Field PagerAdapter mPagerAdapter>
		if(flag && pageradapter != null)
	//*  14   30:iload_2         
	//*  15   31:ifeq            65
	//*  16   34:aload_1         
	//*  17   35:ifnull          65
		{
			if(mPagerAdapterObserver == null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #904 <Field DataSetObserver mPagerAdapterObserver>
	//*  20   42:ifnonnull       57
				mPagerAdapterObserver = ((DataSetObserver) (new PagerAdapterObserver()));
	//   21   45:aload_0         
	//   22   46:new             #17  <Class TabLayout$PagerAdapterObserver>
	//   23   49:dup             
	//   24   50:aload_0         
	//   25   51:invokespecial   #909 <Method void TabLayout$PagerAdapterObserver(TabLayout)>
	//   26   54:putfield        #904 <Field DataSetObserver mPagerAdapterObserver>
			pageradapter.registerDataSetObserver(mPagerAdapterObserver);
	//   27   57:aload_1         
	//   28   58:aload_0         
	//   29   59:getfield        #904 <Field DataSetObserver mPagerAdapterObserver>
	//   30   62:invokevirtual   #912 <Method void PagerAdapter.registerDataSetObserver(DataSetObserver)>
		}
		populateFromPagerAdapter();
	//   31   65:aload_0         
	//   32   66:invokevirtual   #914 <Method void populateFromPagerAdapter()>
	//   33   69:return          
	}

	void setScrollAnimatorListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		ensureScrollAnimator();
	//    0    0:aload_0         
	//    1    1:invokespecial   #448 <Method void ensureScrollAnimator()>
		mScrollAnimator.addListener(animatorlistener);
	//    2    4:aload_0         
	//    3    5:getfield        #450 <Field ValueAnimator mScrollAnimator>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #919 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
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
	//    5    5:invokevirtual   #922 <Method void setScrollPosition(int, float, boolean, boolean)>
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
		if(j >= 0 && j < mTabStrip.getChildCount())
	//*   6    9:iload           5
	//*   7   11:iflt            26
	//*   8   14:iload           5
	//*   9   16:aload_0         
	//*  10   17:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//*  11   20:invokevirtual   #485 <Method int TabLayout$SlidingTabStrip.getChildCount()>
	//*  12   23:icmplt          27
	//*  13   26:return          
		{
			if(flag1)
	//*  14   27:iload           4
	//*  15   29:ifeq            41
				mTabStrip.setIndicatorPositionFromTabPosition(i, f);
	//   16   32:aload_0         
	//   17   33:getfield        #162 <Field TabLayout$SlidingTabStrip mTabStrip>
	//   18   36:iload_1         
	//   19   37:fload_2         
	//   20   38:invokevirtual   #926 <Method void TabLayout$SlidingTabStrip.setIndicatorPositionFromTabPosition(int, float)>
			if(mScrollAnimator != null && mScrollAnimator.isRunning())
	//*  21   41:aload_0         
	//*  22   42:getfield        #450 <Field ValueAnimator mScrollAnimator>
	//*  23   45:ifnull          65
	//*  24   48:aload_0         
	//*  25   49:getfield        #450 <Field ValueAnimator mScrollAnimator>
	//*  26   52:invokevirtual   #929 <Method boolean ValueAnimator.isRunning()>
	//*  27   55:ifeq            65
				mScrollAnimator.cancel();
	//   28   58:aload_0         
	//   29   59:getfield        #450 <Field ValueAnimator mScrollAnimator>
	//   30   62:invokevirtual   #932 <Method void ValueAnimator.cancel()>
			scrollTo(calculateScrollXForTab(i, f), 0);
	//   31   65:aload_0         
	//   32   66:aload_0         
	//   33   67:iload_1         
	//   34   68:fload_2         
	//   35   69:invokespecial   #445 <Method int calculateScrollXForTab(int, float)>
	//   36   72:iconst_0        
	//   37   73:invokevirtual   #935 <Method void scrollTo(int, int)>
			if(flag)
	//*  38   76:iload_3         
	//*  39   77:ifeq            26
			{
				setSelectedTabView(j);
	//   40   80:aload_0         
	//   41   81:iload           5
	//   42   83:invokespecial   #893 <Method void setSelectedTabView(int)>
				return;
	//   43   86:return          
			}
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
	//    4    6:invokevirtual   #944 <Method void setTabTextColors(ColorStateList)>
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
	//    8   14:invokespecial   #946 <Method void updateAllTabs()>
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
	//    3    3:invokevirtual   #951 <Method void setupWithViewPager(ViewPager, boolean)>
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
	//    1    1:invokespecial   #954 <Method int getTabScrollRange()>
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
	//   15   27:invokevirtual   #955 <Method void View.setMinimumWidth(int)>
			updateTabViewLayoutParams((android.widget.LinearLayout.LayoutParams)view.getLayoutParams());
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #812 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   35:checkcast       #527 <Class android.widget.LinearLayout$LayoutParams>
	//   20   38:invokespecial   #532 <Method void updateTabViewLayoutParams(android.widget.LinearLayout$LayoutParams)>
			if(flag)
	//*  21   41:iload_1         
	//*  22   42:ifeq            49
				view.requestLayout();
	//   23   45:aload_3         
	//   24   46:invokevirtual   #956 <Method void View.requestLayout()>
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
