// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

public class AnimatingProgressBar extends ProgressBar
{

	public AnimatingProgressBar(Context context, AttributeSet attributeset, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		super(context, attributeset, i);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:aload_2         
	//    5    6:iload_3         
	//    6    7:invokespecial   #25  <Method void ProgressBar(Context, AttributeSet, int)>
		c = false;
	//    7   10:aload_0         
	//    8   11:iconst_0        
	//    9   12:putfield        #27  <Field boolean c>
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  10   15:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   18:bipush          11
	//*  12   20:icmplt          26
			flag = true;
	//   13   23:iconst_1        
	//   14   24:istore          4
		c = flag;
	//   15   26:aload_0         
	//   16   27:iload           4
	//   17   29:putfield        #27  <Field boolean c>
	//   18   32:return          
	}

	static void a(AnimatingProgressBar animatingprogressbar, int i)
	{
		((ProgressBar) (animatingprogressbar)).ProgressBar.setProgress(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #38  <Method void ProgressBar.setProgress(int)>
	//    3    5:return          
	}

	static void b(AnimatingProgressBar animatingprogressbar, int i)
	{
		((ProgressBar) (animatingprogressbar)).ProgressBar.setProgress(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #38  <Method void ProgressBar.setProgress(int)>
	//    3    5:return          
	}

	public void a()
	{
		b(this, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #40  <Method void b(AnimatingProgressBar, int)>
		if(b != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #42  <Field ValueAnimator b>
	//*   5    9:ifnull          19
			b.cancel();
	//    6   12:aload_0         
	//    7   13:getfield        #42  <Field ValueAnimator b>
	//    8   16:invokevirtual   #47  <Method void ValueAnimator.cancel()>
	//    9   19:return          
	}

	protected ValueAnimator getAnimator()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ValueAnimator b>
	//    2    4:areturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void ProgressBar.onDetachedFromWindow()>
		if(b != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #42  <Field ValueAnimator b>
	//*   4    8:ifnull          18
			b.cancel();
	//    5   11:aload_0         
	//    6   12:getfield        #42  <Field ValueAnimator b>
	//    7   15:invokevirtual   #47  <Method void ValueAnimator.cancel()>
	//    8   18:return          
	}

	public void setProgress(int i)
	{
		if(c) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field boolean c>
	//    2    4:ifne            13
_L1:
		super.setProgress(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #38  <Method void ProgressBar.setProgress(int)>
_L6:
		return;
	//    6   12:return          
_L2:
		if(b == null) goto _L4; else goto _L3
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field ValueAnimator b>
	//    9   17:ifnull          64
_L3:
		b.cancel();
	//   10   20:aload_0         
	//   11   21:getfield        #42  <Field ValueAnimator b>
	//   12   24:invokevirtual   #47  <Method void ValueAnimator.cancel()>
		if(getProgress() >= i) goto _L6; else goto _L5
	//   13   27:aload_0         
	//   14   28:invokevirtual   #56  <Method int getProgress()>
	//   15   31:iload_1         
	//   16   32:icmpge          12
_L5:
		b.setIntValues(new int[] {
			getProgress(), i
		});
	//   17   35:aload_0         
	//   18   36:getfield        #42  <Field ValueAnimator b>
	//   19   39:iconst_2        
	//   20   40:newarray        int[]
	//   21   42:dup             
	//   22   43:iconst_0        
	//   23   44:aload_0         
	//   24   45:invokevirtual   #56  <Method int getProgress()>
	//   25   48:iastore         
	//   26   49:dup             
	//   27   50:iconst_1        
	//   28   51:iload_1         
	//   29   52:iastore         
	//   30   53:invokevirtual   #60  <Method void ValueAnimator.setIntValues(int[])>
		b.start();
	//   31   56:aload_0         
	//   32   57:getfield        #42  <Field ValueAnimator b>
	//   33   60:invokevirtual   #63  <Method void ValueAnimator.start()>
		return;
	//   34   63:return          
_L4:
		b = ValueAnimator.ofInt(new int[] {
			getProgress(), i
		});
	//   35   64:aload_0         
	//   36   65:iconst_2        
	//   37   66:newarray        int[]
	//   38   68:dup             
	//   39   69:iconst_0        
	//   40   70:aload_0         
	//   41   71:invokevirtual   #56  <Method int getProgress()>
	//   42   74:iastore         
	//   43   75:dup             
	//   44   76:iconst_1        
	//   45   77:iload_1         
	//   46   78:iastore         
	//   47   79:invokestatic    #67  <Method ValueAnimator ValueAnimator.ofInt(int[])>
	//   48   82:putfield        #42  <Field ValueAnimator b>
		b.setInterpolator(((android.animation.TimeInterpolator) (a)));
	//   49   85:aload_0         
	//   50   86:getfield        #42  <Field ValueAnimator b>
	//   51   89:getstatic       #21  <Field Interpolator a>
	//   52   92:invokevirtual   #71  <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
		b.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator)
			{
				a = (Integer)valueanimator.getAnimatedValue();
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #31  <Method Object ValueAnimator.getAnimatedValue()>
			//    3    5:checkcast       #33  <Class Integer>
			//    4    8:putfield        #35  <Field Integer a>
				AnimatingProgressBar.a(b, a.intValue());
			//    5   11:aload_0         
			//    6   12:getfield        #19  <Field AnimatingProgressBar b>
			//    7   15:aload_0         
			//    8   16:getfield        #35  <Field Integer a>
			//    9   19:invokevirtual   #39  <Method int Integer.intValue()>
			//   10   22:invokestatic    #42  <Method void AnimatingProgressBar.a(AnimatingProgressBar, int)>
			//   11   25:return          
			}

			Integer a;
			final AnimatingProgressBar b;

			
			{
				b = AnimatingProgressBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AnimatingProgressBar b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   53   95:aload_0         
	//   54   96:getfield        #42  <Field ValueAnimator b>
	//   55   99:new             #6   <Class AnimatingProgressBar$1>
	//   56  102:dup             
	//   57  103:aload_0         
	//   58  104:invokespecial   #74  <Method void AnimatingProgressBar$1(AnimatingProgressBar)>
	//   59  107:invokevirtual   #78  <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		if(true) goto _L5; else goto _L7
	//   60  110:goto            35
_L7:
	}

	private static final Interpolator a = new AccelerateDecelerateInterpolator();
	private ValueAnimator b;
	private boolean c;

	static 
	{
	//    0    0:new             #16  <Class AccelerateDecelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void AccelerateDecelerateInterpolator()>
	//    3    7:putstatic       #21  <Field Interpolator a>
	//*   4   10:return          
	}
}
