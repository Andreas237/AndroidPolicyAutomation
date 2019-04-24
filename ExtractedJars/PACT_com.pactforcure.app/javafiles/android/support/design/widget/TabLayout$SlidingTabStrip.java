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
		view = getChildAt(position);
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
				if(position < mSelectedPosition)
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
						startRight = targetRight + startRight;
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
					startRight = targetRight + startRight;
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
			if(startLeft != targetLeft || startRight != targetRight)
			{
				ValueAnimator valueanimator = new ValueAnimator();
				mIndicatorAnimator = valueanimator;
				valueanimator.setInterpolator(((android.animation.TimeInterpolator) (AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
				valueanimator.setDuration(i);
				valueanimator.setFloatValues(new float[] {
					0.0F, 1.0F
				});
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
					android.widget.LinearLayout$LayoutParams linearlayout$layoutparams = (android.widget.LinearLayout$LayoutParams)getChildAt(k1).getLayoutParams();
	//   76  145:aload_0         
	//   77  146:iload           5
	//   78  148:invokevirtual   #57  <Method View getChildAt(int)>
	//   79  151:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   80  154:checkcast       #210 <Class android.widget.LinearLayout$LayoutParams>
	//   81  157:astore          8
					if(linearlayout$layoutparams.width != l || linearlayout$layoutparams.weight != 0.0F)
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
						linearlayout$layoutparams.width = l;
	//   91  179:aload           8
	//   92  181:iload           4
	//   93  183:putfield        #213 <Field int android.widget.LinearLayout$LayoutParams.width>
						linearlayout$layoutparams.weight = 0.0F;
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
