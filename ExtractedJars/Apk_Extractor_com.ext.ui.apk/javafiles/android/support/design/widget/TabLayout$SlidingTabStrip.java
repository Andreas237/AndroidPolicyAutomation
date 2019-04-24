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
	//    4    8:astore          8
		int i;
		int j;
		if(view != null && view.getWidth() > 0)
	//*   5   10:aload           8
	//*   6   12:ifnull          158
	//*   7   15:aload           8
	//*   8   17:invokevirtual   #63  <Method int View.getWidth()>
	//*   9   20:ifle            158
		{
			int l = view.getLeft();
	//   10   23:aload           8
	//   11   25:invokevirtual   #66  <Method int View.getLeft()>
	//   12   28:istore          7
			int k = view.getRight();
	//   13   30:aload           8
	//   14   32:invokevirtual   #69  <Method int View.getRight()>
	//   15   35:istore          6
			i = k;
	//   16   37:iload           6
	//   17   39:istore          4
			j = l;
	//   18   41:iload           7
	//   19   43:istore          5
			if(mSelectionOffset > 0.0F)
	//*  20   45:aload_0         
	//*  21   46:getfield        #71  <Field float mSelectionOffset>
	//*  22   49:fconst_0        
	//*  23   50:fcmpl           
	//*  24   51:ifle            149
			{
				i = k;
	//   25   54:iload           6
	//   26   56:istore          4
				j = l;
	//   27   58:iload           7
	//   28   60:istore          5
				if(mSelectedPosition < getChildCount() - 1)
	//*  29   62:aload_0         
	//*  30   63:getfield        #34  <Field int mSelectedPosition>
	//*  31   66:aload_0         
	//*  32   67:invokevirtual   #74  <Method int getChildCount()>
	//*  33   70:iconst_1        
	//*  34   71:isub            
	//*  35   72:icmpge          149
				{
					View view1 = getChildAt(mSelectedPosition + 1);
	//   36   75:aload_0         
	//   37   76:aload_0         
	//   38   77:getfield        #34  <Field int mSelectedPosition>
	//   39   80:iconst_1        
	//   40   81:iadd            
	//   41   82:invokevirtual   #57  <Method View getChildAt(int)>
	//   42   85:astore          8
					float f = mSelectionOffset;
	//   43   87:aload_0         
	//   44   88:getfield        #71  <Field float mSelectionOffset>
	//   45   91:fstore_1        
					float f1 = view1.getLeft();
	//   46   92:aload           8
	//   47   94:invokevirtual   #66  <Method int View.getLeft()>
	//   48   97:i2f             
	//   49   98:fstore_2        
					float f2 = mSelectionOffset;
	//   50   99:aload_0         
	//   51  100:getfield        #71  <Field float mSelectionOffset>
	//   52  103:fstore_3        
					j = (int)((float)l * (1.0F - f2) + f * f1);
	//   53  104:iload           7
	//   54  106:i2f             
	//   55  107:fconst_1        
	//   56  108:fload_3         
	//   57  109:fsub            
	//   58  110:fmul            
	//   59  111:fload_1         
	//   60  112:fload_2         
	//   61  113:fmul            
	//   62  114:fadd            
	//   63  115:f2i             
	//   64  116:istore          5
					f = mSelectionOffset;
	//   65  118:aload_0         
	//   66  119:getfield        #71  <Field float mSelectionOffset>
	//   67  122:fstore_1        
					f1 = view1.getRight();
	//   68  123:aload           8
	//   69  125:invokevirtual   #69  <Method int View.getRight()>
	//   70  128:i2f             
	//   71  129:fstore_2        
					f2 = mSelectionOffset;
	//   72  130:aload_0         
	//   73  131:getfield        #71  <Field float mSelectionOffset>
	//   74  134:fstore_3        
					i = (int)((float)k * (1.0F - f2) + f1 * f);
	//   75  135:iload           6
	//   76  137:i2f             
	//   77  138:fconst_1        
	//   78  139:fload_3         
	//   79  140:fsub            
	//   80  141:fmul            
	//   81  142:fload_2         
	//   82  143:fload_1         
	//   83  144:fmul            
	//   84  145:fadd            
	//   85  146:f2i             
	//   86  147:istore          4
				}
			}
		} else
	//*  87  149:aload_0         
	//*  88  150:iload           5
	//*  89  152:iload           4
	//*  90  154:invokevirtual   #78  <Method void setIndicatorPosition(int, int)>
	//*  91  157:return          
		{
			i = -1;
	//   92  158:iconst_m1       
	//   93  159:istore          4
			j = -1;
	//   94  161:iconst_m1       
	//   95  162:istore          5
		}
		setIndicatorPosition(j, i);
	//*  96  164:goto            149
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
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int j = getChildCount();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #74  <Method int getChildCount()>
	//    4    7:istore_2        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
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
	//*  11   15:icmpge          31
				{
					if(getChildAt(i).getWidth() > 0)
						break label0;
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:invokevirtual   #57  <Method View getChildAt(int)>
	//   15   23:invokevirtual   #63  <Method int View.getWidth()>
	//   16   26:ifgt            33
					flag = true;
	//   17   29:iconst_1        
	//   18   30:istore_3        
				}
				return flag;
	//   19   31:iload_3         
	//   20   32:ireturn         
			}
			i++;
	//   21   33:iload_1         
	//   22   34:iconst_1        
	//   23   35:iadd            
	//   24   36:istore_1        
		} while(true);
	//   25   37:goto            10
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
	//*   9   15:ifnull          75
	//*  10   18:aload_0         
	//*  11   19:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
	//*  12   22:invokevirtual   #87  <Method boolean ValueAnimator.isRunning()>
	//*  13   25:ifeq            75
		{
			mIndicatorAnimator.cancel();
	//   14   28:aload_0         
	//   15   29:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
	//   16   32:invokevirtual   #90  <Method void ValueAnimator.cancel()>
			long l1 = mIndicatorAnimator.getDuration();
	//   17   35:aload_0         
	//   18   36:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
	//   19   39:invokevirtual   #169 <Method long ValueAnimator.getDuration()>
	//   20   42:lstore          7
			i = mSelectedPosition;
	//   21   44:aload_0         
	//   22   45:getfield        #34  <Field int mSelectedPosition>
	//   23   48:istore_2        
			float f = mIndicatorAnimator.getAnimatedFraction();
	//   24   49:aload_0         
	//   25   50:getfield        #81  <Field ValueAnimator mIndicatorAnimator>
	//   26   53:invokevirtual   #172 <Method float ValueAnimator.getAnimatedFraction()>
	//   27   56:fstore          6
			animateIndicatorToPosition(i, Math.round((float)l1 * (1.0F - f)));
	//   28   58:aload_0         
	//   29   59:iload_2         
	//   30   60:lload           7
	//   31   62:l2f             
	//   32   63:fconst_1        
	//   33   64:fload           6
	//   34   66:fsub            
	//   35   67:fmul            
	//   36   68:invokestatic    #176 <Method int Math.round(float)>
	//   37   71:invokevirtual   #178 <Method void animateIndicatorToPosition(int, int)>
			return;
	//   38   74:return          
		} else
		{
			updateIndicatorPosition();
	//   39   75:aload_0         
	//   40   76:invokespecial   #98  <Method void updateIndicatorPosition()>
			return;
	//   41   79:return          
		}
	}

	protected void onMeasure(int i, int j)
	{
		boolean flag;
		flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		super.onMeasure(i, j);
	//    2    3:aload_0         
	//    3    4:iload_1         
	//    4    5:iload_2         
	//    5    6:invokespecial   #181 <Method void LinearLayout.onMeasure(int, int)>
		break MISSING_BLOCK_LABEL_9;
label0:
		while(!flag) 
		{
			do
			{
				do
	//*   6    9:iload_1         
	//*   7   10:invokestatic    #186 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   8   13:ldc1            #187 <Int 0x40000000>
	//*   9   15:icmpeq          19
					return;
	//   10   18:return          
				while(android.view.View.MeasureSpec.getMode(i) != 0x40000000 || mMode != 1 || mTabGravity != 1);
	//   11   19:aload_0         
	//   12   20:getfield        #29  <Field TabLayout this$0>
	//   13   23:getfield        #190 <Field int TabLayout.mMode>
	//   14   26:iconst_1        
	//   15   27:icmpne          18
	//   16   30:aload_0         
	//   17   31:getfield        #29  <Field TabLayout this$0>
	//   18   34:getfield        #193 <Field int TabLayout.mTabGravity>
	//   19   37:iconst_1        
	//   20   38:icmpne          18
				int j1 = getChildCount();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #74  <Method int getChildCount()>
	//   23   45:istore          7
				int i1 = 0;
	//   24   47:iconst_0        
	//   25   48:istore          5
				int l = 0;
	//   26   50:iconst_0        
	//   27   51:istore          4
				while(i1 < j1) 
	//*  28   53:iload           5
	//*  29   55:iload           7
	//*  30   57:icmpge          99
				{
					Object obj = ((Object) (getChildAt(i1)));
	//   31   60:aload_0         
	//   32   61:iload           5
	//   33   63:invokevirtual   #57  <Method View getChildAt(int)>
	//   34   66:astore          8
					int k;
					if(((View) (obj)).getVisibility() == 0)
	//*  35   68:aload           8
	//*  36   70:invokevirtual   #196 <Method int View.getVisibility()>
	//*  37   73:ifne            238
						k = Math.max(l, ((View) (obj)).getMeasuredWidth());
	//   38   76:iload           4
	//   39   78:aload           8
	//   40   80:invokevirtual   #199 <Method int View.getMeasuredWidth()>
	//   41   83:invokestatic    #203 <Method int Math.max(int, int)>
	//   42   86:istore_3        
					else
	//*  43   87:iload           5
	//*  44   89:iconst_1        
	//*  45   90:iadd            
	//*  46   91:istore          5
	//*  47   93:iload_3         
	//*  48   94:istore          4
	//*  49   96:goto            53
	//*  50   99:iload           4
	//*  51  101:ifle            18
	//*  52  104:aload_0         
	//*  53  105:getfield        #29  <Field TabLayout this$0>
	//*  54  108:bipush          16
	//*  55  110:invokevirtual   #143 <Method int TabLayout.dpToPx(int)>
	//*  56  113:istore_3        
	//*  57  114:iload           4
	//*  58  116:iload           7
	//*  59  118:imul            
	//*  60  119:aload_0         
	//*  61  120:invokevirtual   #204 <Method int getMeasuredWidth()>
	//*  62  123:iload_3         
	//*  63  124:iconst_2        
	//*  64  125:imul            
	//*  65  126:isub            
	//*  66  127:icmpgt          204
	//*  67  130:iconst_0        
	//*  68  131:istore          5
	//*  69  133:iload           6
	//*  70  135:istore_3        
	//*  71  136:iload_3         
	//*  72  137:istore          6
	//*  73  139:iload           5
	//*  74  141:iload           7
	//*  75  143:icmpge          223
	//*  76  146:aload_0         
	//*  77  147:iload           5
	//*  78  149:invokevirtual   #57  <Method View getChildAt(int)>
	//*  79  152:invokevirtual   #208 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  80  155:checkcast       #210 <Class android.widget.LinearLayout$LayoutParams>
	//*  81  158:astore          8
	//*  82  160:aload           8
	//*  83  162:getfield        #213 <Field int android.widget.LinearLayout$LayoutParams.width>
	//*  84  165:iload           4
	//*  85  167:icmpne          180
	//*  86  170:aload           8
	//*  87  172:getfield        #216 <Field float android.widget.LinearLayout$LayoutParams.weight>
	//*  88  175:fconst_0        
	//*  89  176:fcmpl           
	//*  90  177:ifeq            235
	//*  91  180:aload           8
	//*  92  182:iload           4
	//*  93  184:putfield        #213 <Field int android.widget.LinearLayout$LayoutParams.width>
	//*  94  187:aload           8
	//*  95  189:fconst_0        
	//*  96  190:putfield        #216 <Field float android.widget.LinearLayout$LayoutParams.weight>
	//*  97  193:iconst_1        
	//*  98  194:istore_3        
	//*  99  195:iload           5
	//* 100  197:iconst_1        
	//* 101  198:iadd            
	//* 102  199:istore          5
	//* 103  201:goto            136
	//* 104  204:aload_0         
	//* 105  205:getfield        #29  <Field TabLayout this$0>
	//* 106  208:iconst_0        
	//* 107  209:putfield        #193 <Field int TabLayout.mTabGravity>
	//* 108  212:aload_0         
	//* 109  213:getfield        #29  <Field TabLayout this$0>
	//* 110  216:iconst_0        
	//* 111  217:invokevirtual   #219 <Method void TabLayout.updateTabViews(boolean)>
	//* 112  220:iconst_1        
	//* 113  221:istore          6
	//* 114  223:iload           6
	//* 115  225:ifeq            18
	//* 116  228:aload_0         
	//* 117  229:iload_1         
	//* 118  230:iload_2         
	//* 119  231:invokespecial   #181 <Method void LinearLayout.onMeasure(int, int)>
	//* 120  234:return          
	//* 121  235:goto            195
						k = l;
	//  122  238:iload           4
	//  123  240:istore_3        
					i1++;
					l = k;
				}
			} while(l <= 0);
			k = dpToPx(16);
			if(l * j1 <= getMeasuredWidth() - k * 2)
			{
				i1 = 0;
				k = ((int) (flag));
				do
				{
					flag = ((boolean) (k));
					if(i1 >= j1)
						continue label0;
					obj = ((Object) ((android.widget.LinearLayout$LayoutParams)getChildAt(i1).getLayoutParams()));
					if(((android.widget.LinearLayout$LayoutParams) (obj)).width != l || ((android.widget.LinearLayout$LayoutParams) (obj)).weight != 0.0F)
					{
						obj.width = l;
						obj.weight = 0.0F;
						k = 1;
					}
					i1++;
				} while(true);
			}
			mTabGravity = 0;
			updateTabViews(false);
			flag = true;
		}
		super.onMeasure(i, j);
		return;
	//* 124  241:goto            87
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
