// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.animation.ObjectAnimator;

public class la
{

	public la()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		e = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #15  <Field float e>
		c = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #17  <Field float c>
	//    8   14:return          
	}

	public la(android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		e = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #15  <Field float e>
		c = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #17  <Field float c>
		b = animatorupdatelistener;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #21  <Field android.animation.ValueAnimator$AnimatorUpdateListener b>
	//   11   19:return          
	}

	public float b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field float c>
	//    2    4:freturn         
	}

	public void c(int i)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
		{
			return;
	//    3    8:return          
		} else
		{
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "phaseX", new float[] {
				0.0F, 1.0F
			});
	//    4    9:aload_0         
	//    5   10:ldc1            #31  <String "phaseX">
	//    6   12:iconst_2        
	//    7   13:newarray        float[]
	//    8   15:dup             
	//    9   16:iconst_0        
	//   10   17:fconst_0        
	//   11   18:fastore         
	//   12   19:dup             
	//   13   20:iconst_1        
	//   14   21:fconst_1        
	//   15   22:fastore         
	//   16   23:invokestatic    #37  <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   17   26:astore_2        
			objectanimator.setDuration(i);
	//   18   27:aload_2         
	//   19   28:iload_1         
	//   20   29:i2l             
	//   21   30:invokevirtual   #41  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   22   33:pop             
			objectanimator.addUpdateListener(b);
	//   23   34:aload_2         
	//   24   35:aload_0         
	//   25   36:getfield        #21  <Field android.animation.ValueAnimator$AnimatorUpdateListener b>
	//   26   39:invokevirtual   #44  <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			objectanimator.start();
	//   27   42:aload_2         
	//   28   43:invokevirtual   #47  <Method void ObjectAnimator.start()>
			return;
	//   29   46:return          
		}
	}

	public float d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field float e>
	//    2    4:freturn         
	}

	private android.animation.ValueAnimator.AnimatorUpdateListener b;
	protected float c;
	protected float e;
}
