// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.design.animation.AnimationUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.design.widget:
//			TabLayout

private class TabLayout$SlidingTabIndicator extends LinearLayout
{

	private void calculateTabViewContentBounds(TabLayout.TabView tabview, RectF rectf)
	{
		int j = TabLayout.TabView.access$500(tabview);
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
				if(view instanceof TabLayout.TabView)
	//*  28   59:aload           8
	//*  29   61:instanceof      #63  <Class TabLayout$TabView>
	//*  30   64:ifeq            107
				{
					calculateTabViewContentBounds((TabLayout.TabView)view, TabLayout.access$400(TabLayout.this));
	//   31   67:aload_0         
	//   32   68:aload           8
	//   33   70:checkcast       #63  <Class TabLayout$TabView>
	//   34   73:aload_0         
	//   35   74:getfield        #31  <Field TabLayout this$0>
	//   36   77:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
	//   37   80:invokespecial   #106 <Method void calculateTabViewContentBounds(TabLayout$TabView, RectF)>
					j = (int)TabLayout.access$400(TabLayout.this).left;
	//   38   83:aload_0         
	//   39   84:getfield        #31  <Field TabLayout this$0>
	//   40   87:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
	//   41   90:getfield        #109 <Field float RectF.left>
	//   42   93:f2i             
	//   43   94:istore_3        
					i = (int)TabLayout.access$400(TabLayout.this).right;
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
						if(view1 instanceof TabLayout.TabView)
	//*  95  193:aload           8
	//*  96  195:instanceof      #63  <Class TabLayout$TabView>
	//*  97  198:ifeq            243
						{
							calculateTabViewContentBounds((TabLayout.TabView)view1, TabLayout.access$400(TabLayout.this));
	//   98  201:aload_0         
	//   99  202:aload           8
	//  100  204:checkcast       #63  <Class TabLayout$TabView>
	//  101  207:aload_0         
	//  102  208:getfield        #31  <Field TabLayout this$0>
	//  103  211:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
	//  104  214:invokespecial   #106 <Method void calculateTabViewContentBounds(TabLayout$TabView, RectF)>
							l = (int)TabLayout.access$400(TabLayout.this).left;
	//  105  217:aload_0         
	//  106  218:getfield        #31  <Field TabLayout this$0>
	//  107  221:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
	//  108  224:getfield        #109 <Field float RectF.left>
	//  109  227:f2i             
	//  110  228:istore          5
							k = (int)TabLayout.access$400(TabLayout.this).right;
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

	void animateIndicatorToPosition(final int position, int i)
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
		obj = ((Object) (getChildAt(position)));
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
		final int finalTargetRight = ((View) (obj)).getRight();
	//   23   49:aload           7
	//   24   51:invokevirtual   #96  <Method int View.getRight()>
	//   25   54:istore          4
		if(!tabIndicatorFullWidth && (obj instanceof TabLayout.TabView))
	//*  26   56:aload_0         
	//*  27   57:getfield        #31  <Field TabLayout this$0>
	//*  28   60:getfield        #100 <Field boolean TabLayout.tabIndicatorFullWidth>
	//*  29   63:ifne            118
	//*  30   66:aload           7
	//*  31   68:instanceof      #63  <Class TabLayout$TabView>
	//*  32   71:ifeq            118
		{
			calculateTabViewContentBounds((TabLayout.TabView)obj, TabLayout.access$400(TabLayout.this));
	//   33   74:aload_0         
	//   34   75:aload           7
	//   35   77:checkcast       #63  <Class TabLayout$TabView>
	//   36   80:aload_0         
	//   37   81:getfield        #31  <Field TabLayout this$0>
	//   38   84:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
	//   39   87:invokespecial   #106 <Method void calculateTabViewContentBounds(TabLayout$TabView, RectF)>
			finalTargetLeft = (int)TabLayout.access$400(TabLayout.this).left;
	//   40   90:aload_0         
	//   41   91:getfield        #31  <Field TabLayout this$0>
	//   42   94:invokestatic    #104 <Method RectF TabLayout.access$400(TabLayout)>
	//   43   97:getfield        #109 <Field float RectF.left>
	//   44  100:f2i             
	//   45  101:istore_3        
			finalTargetRight = (int)TabLayout.access$400(TabLayout.this).right;
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
		if(startLeft != finalTargetLeft || startRight != finalTargetRight)
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
			valueanimator.setDuration(i);
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
			valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					float f = valueanimator1.getAnimatedFraction();
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

				final TabLayout.SlidingTabIndicator this$1;
				final int val$finalTargetLeft;
				final int val$finalTargetRight;
				final int val$startLeft;
				final int val$startRight;

			
			{
				this$1 = TabLayout.SlidingTabIndicator.this;
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
				finalTargetRight = l;
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
			valueanimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator)
				{
					animator = ((Animator) (TabLayout.SlidingTabIndicator.this));
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

				final TabLayout.SlidingTabIndicator this$1;
				final int val$position;

			
			{
				this$1 = TabLayout.SlidingTabIndicator.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field TabLayout$SlidingTabIndicator this$1>
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
	//	               0 131
	//	               1 109
	//	               2 144
	//	               3 97
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

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #230 <Method void LinearLayout.onLayout(boolean, int, int, int, int)>
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
	//   20   41:invokevirtual   #234 <Method long ValueAnimator.getDuration()>
	//   21   44:lstore          6
			animateIndicatorToPosition(selectedPosition, Math.round((1.0F - indicatorAnimator.getAnimatedFraction()) * (float)l1));
	//   22   46:aload_0         
	//   23   47:aload_0         
	//   24   48:getfield        #36  <Field int selectedPosition>
	//   25   51:fconst_1        
	//   26   52:aload_0         
	//   27   53:getfield        #124 <Field ValueAnimator indicatorAnimator>
	//   28   56:invokevirtual   #238 <Method float ValueAnimator.getAnimatedFraction()>
	//   29   59:fsub            
	//   30   60:lload           6
	//   31   62:l2f             
	//   32   63:fmul            
	//   33   64:invokestatic    #244 <Method int Math.round(float)>
	//   34   67:invokevirtual   #246 <Method void animateIndicatorToPosition(int, int)>
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
	//    3    3:invokespecial   #249 <Method void LinearLayout.onMeasure(int, int)>
		if(android.view.View.MeasureSpec.getMode(i) != 0x40000000)
	//*   4    6:iload_1         
	//*   5    7:invokestatic    #254 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   6   10:ldc1            #255 <Int 0x40000000>
	//*   7   12:icmpeq          16
			return;
	//    8   15:return          
		int k = mode;
	//    9   16:aload_0         
	//   10   17:getfield        #31  <Field TabLayout this$0>
	//   11   20:getfield        #258 <Field int TabLayout.mode>
	//   12   23:istore_3        
		boolean flag2 = true;
	//   13   24:iconst_1        
	//   14   25:istore          7
		if(k == 1 && tabGravity == 1)
	//*  15   27:iload_3         
	//*  16   28:iconst_1        
	//*  17   29:icmpne          242
	//*  18   32:aload_0         
	//*  19   33:getfield        #31  <Field TabLayout this$0>
	//*  20   36:getfield        #261 <Field int TabLayout.tabGravity>
	//*  21   39:iconst_1        
	//*  22   40:icmpne          242
		{
			int l1 = getChildCount();
	//   23   43:aload_0         
	//   24   44:invokevirtual   #117 <Method int getChildCount()>
	//   25   47:istore          8
			boolean flag1 = false;
	//   26   49:iconst_0        
	//   27   50:istore          6
			int l = 0;
	//   28   52:iconst_0        
	//   29   53:istore_3        
			int i1;
			int j1;
			for(i1 = 0; l < l1; i1 = j1)
	//*  30   54:iconst_0        
	//*  31   55:istore          4
	//*  32   57:iload_3         
	//*  33   58:iload           8
	//*  34   60:icmpge          105
			{
				View view = getChildAt(l);
	//   35   63:aload_0         
	//   36   64:iload_3         
	//   37   65:invokevirtual   #89  <Method View getChildAt(int)>
	//   38   68:astore          9
				j1 = i1;
	//   39   70:iload           4
	//   40   72:istore          5
				if(view.getVisibility() == 0)
	//*  41   74:aload           9
	//*  42   76:invokevirtual   #264 <Method int View.getVisibility()>
	//*  43   79:ifne            94
					j1 = Math.max(i1, view.getMeasuredWidth());
	//   44   82:iload           4
	//   45   84:aload           9
	//   46   86:invokevirtual   #267 <Method int View.getMeasuredWidth()>
	//   47   89:invokestatic    #271 <Method int Math.max(int, int)>
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
	//   60  112:getfield        #31  <Field TabLayout this$0>
	//   61  115:bipush          16
	//   62  117:invokevirtual   #71  <Method int TabLayout.dpToPx(int)>
	//   63  120:istore_3        
			boolean flag;
			if(i1 * l1 <= getMeasuredWidth() - l * 2)
	//*  64  121:iload           4
	//*  65  123:iload           8
	//*  66  125:imul            
	//*  67  126:aload_0         
	//*  68  127:invokevirtual   #272 <Method int getMeasuredWidth()>
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
	//   83  153:invokevirtual   #89  <Method View getChildAt(int)>
	//   84  156:invokevirtual   #276 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   85  159:checkcast       #278 <Class android.widget.LinearLayout$LayoutParams>
	//   86  162:astore          9
					if(layoutparams.width != i1 || layoutparams.weight != 0.0F)
	//*  87  164:aload           9
	//*  88  166:getfield        #281 <Field int android.widget.LinearLayout$LayoutParams.width>
	//*  89  169:iload           4
	//*  90  171:icmpne          184
	//*  91  174:aload           9
	//*  92  176:getfield        #284 <Field float android.widget.LinearLayout$LayoutParams.weight>
	//*  93  179:fconst_0        
	//*  94  180:fcmpl           
	//*  95  181:ifeq            199
					{
						layoutparams.width = i1;
	//   96  184:aload           9
	//   97  186:iload           4
	//   98  188:putfield        #281 <Field int android.widget.LinearLayout$LayoutParams.width>
						layoutparams.weight = 0.0F;
	//   99  191:aload           9
	//  100  193:fconst_0        
	//  101  194:putfield        #284 <Field float android.widget.LinearLayout$LayoutParams.weight>
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
	//* 109  208:goto            232
			{
				TabLayout tablayout = TabLayout.this;
	//  110  211:aload_0         
	//  111  212:getfield        #31  <Field TabLayout this$0>
	//  112  215:astore          9
				tablayout.tabGravity = 0;
	//  113  217:aload           9
	//  114  219:iconst_0        
	//  115  220:putfield        #261 <Field int TabLayout.tabGravity>
				tablayout.updateTabViews(false);
	//  116  223:aload           9
	//  117  225:iconst_0        
	//  118  226:invokevirtual   #287 <Method void TabLayout.updateTabViews(boolean)>
				flag = flag2;
	//  119  229:iload           7
	//  120  231:istore_3        
			}
			if(flag)
	//* 121  232:iload_3         
	//* 122  233:ifeq            242
				super.onMeasure(i, j);
	//  123  236:aload_0         
	//  124  237:iload_1         
	//  125  238:iload_2         
	//  126  239:invokespecial   #249 <Method void LinearLayout.onMeasure(int, int)>
		}
	//  127  242:return          
	}

	public void onRtlPropertiesChanged(int i)
	{
		super.onRtlPropertiesChanged(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #291 <Method void LinearLayout.onRtlPropertiesChanged(int)>
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
	//   11   22:invokevirtual   #294 <Method void requestLayout()>
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
	//   15   27:invokestatic    #300 <Method void ViewCompat.postInvalidateOnAnimation(View)>
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
	//    8   16:invokevirtual   #306 <Method void Paint.setColor(int)>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//    9   19:aload_0         
	//   10   20:invokestatic    #300 <Method void ViewCompat.postInvalidateOnAnimation(View)>
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
	//    8   14:invokestatic    #300 <Method void ViewCompat.postInvalidateOnAnimation(View)>
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

	TabLayout$SlidingTabIndicator(Context context)
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
