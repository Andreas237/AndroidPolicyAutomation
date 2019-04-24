// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeTransform, au

private static class ChangeTransform$b
{

	private void b()
	{
		c[2] = d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float[] c>
	//    2    4:iconst_2        
	//    3    5:aload_0         
	//    4    6:getfield        #36  <Field float d>
	//    5    9:fastore         
		c[5] = e;
	//    6   10:aload_0         
	//    7   11:getfield        #34  <Field float[] c>
	//    8   14:iconst_5        
	//    9   15:aload_0         
	//   10   16:getfield        #38  <Field float e>
	//   11   19:fastore         
		a.setValues(c);
	//   12   20:aload_0         
	//   13   21:getfield        #25  <Field Matrix a>
	//   14   24:aload_0         
	//   15   25:getfield        #34  <Field float[] c>
	//   16   28:invokevirtual   #45  <Method void Matrix.setValues(float[])>
		au.c(b, a);
	//   17   31:aload_0         
	//   18   32:getfield        #27  <Field View b>
	//   19   35:aload_0         
	//   20   36:getfield        #25  <Field Matrix a>
	//   21   39:invokestatic    #50  <Method void au.c(View, Matrix)>
	//   22   42:return          
	}

	Matrix a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Matrix a>
	//    2    4:areturn         
	}

	void a(PointF pointf)
	{
		d = pointf.x;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #57  <Field float PointF.x>
	//    3    5:putfield        #36  <Field float d>
		e = pointf.y;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #60  <Field float PointF.y>
	//    7   13:putfield        #38  <Field float e>
		b();
	//    8   16:aload_0         
	//    9   17:invokespecial   #40  <Method void b()>
	//   10   20:return          
	}

	void a(float af[])
	{
		System.arraycopy(((Object) (af)), 0, ((Object) (c)), 0, af.length);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aload_0         
	//    3    3:getfield        #34  <Field float[] c>
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:arraylength     
	//    7    9:invokestatic    #66  <Method void System.arraycopy(Object, int, Object, int, int)>
		b();
	//    8   12:aload_0         
	//    9   13:invokespecial   #40  <Method void b()>
	//   10   16:return          
	}

	private final Matrix a = new Matrix();
	private final View b;
	private final float c[];
	private float d;
	private float e;

	ChangeTransform$b(View view, float af[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void Matrix()>
	//    6   12:putfield        #25  <Field Matrix a>
		b = view;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #27  <Field View b>
		c = (float[])((float []) (af)).clone();
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #32  <Method Object _5B_F.clone()>
	//   13   25:checkcast       #28  <Class float[]>
	//   14   28:putfield        #34  <Field float[] c>
		d = c[2];
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #34  <Field float[] c>
	//   18   36:iconst_2        
	//   19   37:faload          
	//   20   38:putfield        #36  <Field float d>
		e = c[5];
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #34  <Field float[] c>
	//   24   46:iconst_5        
	//   25   47:faload          
	//   26   48:putfield        #38  <Field float e>
		b();
	//   27   51:aload_0         
	//   28   52:invokespecial   #40  <Method void b()>
	//   29   55:return          
	}
}
