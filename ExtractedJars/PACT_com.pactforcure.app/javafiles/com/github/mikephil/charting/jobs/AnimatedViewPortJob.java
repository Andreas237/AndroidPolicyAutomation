// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.jobs;

import android.animation.ObjectAnimator;
import android.view.View;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.jobs:
//			ViewPortJob

public abstract class AnimatedViewPortJob extends ViewPortJob
	implements android.animation.ValueAnimator.AnimatorUpdateListener
{

	public AnimatedViewPortJob(ViewPortHandler viewporthandler, float f, float f1, Transformer transformer, View view, float f2, float f3, 
			long l)
	{
		super(viewporthandler, f, f1, transformer, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #20  <Method void ViewPortJob(ViewPortHandler, float, float, Transformer, View)>
		xOrigin = f2;
	//    7   11:aload_0         
	//    8   12:fload           6
	//    9   14:putfield        #22  <Field float xOrigin>
		yOrigin = f3;
	//   10   17:aload_0         
	//   11   18:fload           7
	//   12   20:putfield        #24  <Field float yOrigin>
		animator = ObjectAnimator.ofFloat(((Object) (this)), "phase", new float[] {
			0.0F, 1.0F
		});
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:ldc1            #25  <String "phase">
	//   16   27:iconst_2        
	//   17   28:newarray        float[]
	//   18   30:dup             
	//   19   31:iconst_0        
	//   20   32:fconst_0        
	//   21   33:fastore         
	//   22   34:dup             
	//   23   35:iconst_1        
	//   24   36:fconst_1        
	//   25   37:fastore         
	//   26   38:invokestatic    #31  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   27   41:putfield        #33  <Field ObjectAnimator animator>
		animator.setDuration(l);
	//   28   44:aload_0         
	//   29   45:getfield        #33  <Field ObjectAnimator animator>
	//   30   48:lload           8
	//   31   50:invokevirtual   #37  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   32   53:pop             
		animator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (this)));
	//   33   54:aload_0         
	//   34   55:getfield        #33  <Field ObjectAnimator animator>
	//   35   58:aload_0         
	//   36   59:invokevirtual   #41  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
	//   37   62:return          
	}

	public float getPhase()
	{
		return phase;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field float phase>
	//    2    4:freturn         
	}

	public float getXOrigin()
	{
		return xOrigin;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float xOrigin>
	//    2    4:freturn         
	}

	public float getYOrigin()
	{
		return yOrigin;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field float yOrigin>
	//    2    4:freturn         
	}

	public void run()
	{
		animator.start();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ObjectAnimator animator>
	//    2    4:invokevirtual   #53  <Method void ObjectAnimator.start()>
	//    3    7:return          
	}

	public void setPhase(float f)
	{
		phase = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #46  <Field float phase>
	//    3    5:return          
	}

	protected ObjectAnimator animator;
	protected float phase;
	protected float xOrigin;
	protected float yOrigin;
}
