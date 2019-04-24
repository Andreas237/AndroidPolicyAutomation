// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.design.widget:
//			TabLayout, AnimationUtils

private class TabLayout$SlidingTabStrip extends LinearLayout
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

	void animateIndicatorToPosition(final int position, int i)
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
		View view = getChildAt(position);
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
		final int targetRight = view.getRight();
	//   31   63:aload           7
	//   32   65:invokevirtual   #69  <Method int View.getRight()>
	//   33   68:istore          6
		final int startRight;
		if(Math.abs(position - mSelectedPosition) <= 1)
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
			if(position < mSelectedPosition)
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
					startLeft = startRight + targetRight;
	//   66  132:iload           4
	//   67  134:iload           6
	//   68  136:iadd            
	//   69  137:istore_3        
			} else
	//*  70  138:goto            126
			if(startLeft != 0)
	//*  71  141:iload_3         
	//*  72  142:ifeq            154
				startLeft = startRight + targetRight;
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
		if(startLeft != targetLeft || startRight != targetRight)
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
			valueanimator.setDuration(i);
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
			valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					float f = valueanimator1.getAnimatedFraction();
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

				final TabLayout.SlidingTabStrip this$1;
				final int val$startLeft;
				final int val$startRight;
				final int val$targetLeft;
				final int val$targetRight;

			
			{
				this$1 = TabLayout.SlidingTabStrip.this;
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
				targetRight = l;
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
			valueanimator.addListener(((android.animation.Animator$AnimatorListener) (new AnimatorListenerAdapter() {

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

				final TabLayout.SlidingTabStrip this$1;
				final int val$position;

			
			{
				this$1 = TabLayout.SlidingTabStrip.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field TabLayout$SlidingTabStrip this$1>
				position = i;
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
					android.widget.LinearLayout$LayoutParams linearlayout$layoutparams = (android.widget.LinearLayout$LayoutParams)getChildAt(k1).getLayoutParams();
	//   81  150:aload_0         
	//   82  151:iload           5
	//   83  153:invokevirtual   #57  <Method View getChildAt(int)>
	//   84  156:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   85  159:checkcast       #210 <Class android.widget.LinearLayout$LayoutParams>
	//   86  162:astore          9
					if(linearlayout$layoutparams.width != i1 || linearlayout$layoutparams.weight != 0.0F)
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
						linearlayout$layoutparams.width = i1;
	//   96  184:aload           9
	//   97  186:iload           4
	//   98  188:putfield        #213 <Field int android.widget.LinearLayout$LayoutParams.width>
						linearlayout$layoutparams.weight = 0.0F;
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

	TabLayout$SlidingTabStrip(Context context)
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
