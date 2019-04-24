// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.view.animation.Interpolator;

// Referenced classes of package o:
//			kx, km

class kx$d
	implements Runnable
{

	private float b()
	{
		float f = Math.min(1.0F, ((float)(System.currentTimeMillis() - b) * 1.0F) / (float)kx.i(e));
	//    0    0:fconst_1        
	//    1    1:invokestatic    #34  <Method long System.currentTimeMillis()>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field long b>
	//    4    8:lsub            
	//    5    9:l2f             
	//    6   10:fconst_1        
	//    7   11:fmul            
	//    8   12:aload_0         
	//    9   13:getfield        #21  <Field kx e>
	//   10   16:invokestatic    #45  <Method int kx.i(kx)>
	//   11   19:i2f             
	//   12   20:fdiv            
	//   13   21:invokestatic    #51  <Method float Math.min(float, float)>
	//   14   24:fstore_1        
		return kx.k(e).getInterpolation(f);
	//   15   25:aload_0         
	//   16   26:getfield        #21  <Field kx e>
	//   17   29:invokestatic    #55  <Method Interpolator kx.k(kx)>
	//   18   32:fload_1         
	//   19   33:invokeinterface #61  <Method float Interpolator.getInterpolation(float)>
	//   20   38:freturn         
	}

	public void run()
	{
		float f = b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method float b()>
	//    2    4:fstore_1        
		float f1 = (a + (i - a) * f) / e.b();
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field float a>
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field float i>
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field float a>
	//    9   17:fsub            
	//   10   18:fload_1         
	//   11   19:fmul            
	//   12   20:fadd            
	//   13   21:aload_0         
	//   14   22:getfield        #21  <Field kx e>
	//   15   25:invokevirtual   #65  <Method float kx.b()>
	//   16   28:fdiv            
	//   17   29:fstore_2        
		e.d(f1, d, c);
	//   18   30:aload_0         
	//   19   31:getfield        #21  <Field kx e>
	//   20   34:fload_2         
	//   21   35:aload_0         
	//   22   36:getfield        #26  <Field float d>
	//   23   39:aload_0         
	//   24   40:getfield        #28  <Field float c>
	//   25   43:invokevirtual   #68  <Method void kx.d(float, float, float)>
		if(f < 1.0F)
	//*  26   46:fload_1         
	//*  27   47:fconst_1        
	//*  28   48:fcmpg           
	//*  29   49:ifge            63
			km.a(((android.view.View) (kx.c(e))), ((Runnable) (this)));
	//   30   52:aload_0         
	//   31   53:getfield        #21  <Field kx e>
	//   32   56:invokestatic    #71  <Method android.widget.ImageView kx.c(kx)>
	//   33   59:aload_0         
	//   34   60:invokestatic    #76  <Method void km.a(android.view.View, Runnable)>
	//   35   63:return          
	}

	private final float a;
	private final long b = System.currentTimeMillis();
	private final float c;
	private final float d;
	final kx e;
	private final float i;

	public kx$d(kx kx1, float f, float f1, float f2, float f3)
	{
		e = kx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field kx e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		d = f2;
	//    5    9:aload_0         
	//    6   10:fload           4
	//    7   12:putfield        #26  <Field float d>
		c = f3;
	//    8   15:aload_0         
	//    9   16:fload           5
	//   10   18:putfield        #28  <Field float c>
	//   11   21:aload_0         
	//   12   22:invokestatic    #34  <Method long System.currentTimeMillis()>
	//   13   25:putfield        #36  <Field long b>
		a = f;
	//   14   28:aload_0         
	//   15   29:fload_2         
	//   16   30:putfield        #38  <Field float a>
		i = f1;
	//   17   33:aload_0         
	//   18   34:fload_3         
	//   19   35:putfield        #40  <Field float i>
	//   20   38:return          
	}
}
