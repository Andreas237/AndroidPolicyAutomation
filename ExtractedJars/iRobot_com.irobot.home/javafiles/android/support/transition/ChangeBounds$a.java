// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeBounds, au

private static class ChangeBounds$a
{

	private void a()
	{
		au.a(e, a, b, c, d);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field View e>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int a>
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field int b>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field int c>
	//    8   16:aload_0         
	//    9   17:getfield        #31  <Field int d>
	//   10   20:invokestatic    #36  <Method void au.a(View, int, int, int, int)>
		f = 0;
	//   11   23:aload_0         
	//   12   24:iconst_0        
	//   13   25:putfield        #38  <Field int f>
		g = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #40  <Field int g>
	//   17   33:return          
	}

	void a(PointF pointf)
	{
		a = Math.round(pointf.x);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #47  <Field float PointF.x>
	//    3    5:invokestatic    #53  <Method int Math.round(float)>
	//    4    8:putfield        #25  <Field int a>
		b = Math.round(pointf.y);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:getfield        #56  <Field float PointF.y>
	//    8   16:invokestatic    #53  <Method int Math.round(float)>
	//    9   19:putfield        #27  <Field int b>
		f = f + 1;
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #38  <Field int f>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:putfield        #38  <Field int f>
		if(f == g)
	//*  16   32:aload_0         
	//*  17   33:getfield        #38  <Field int f>
	//*  18   36:aload_0         
	//*  19   37:getfield        #40  <Field int g>
	//*  20   40:icmpne          47
			a();
	//   21   43:aload_0         
	//   22   44:invokespecial   #58  <Method void a()>
	//   23   47:return          
	}

	void b(PointF pointf)
	{
		c = Math.round(pointf.x);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #47  <Field float PointF.x>
	//    3    5:invokestatic    #53  <Method int Math.round(float)>
	//    4    8:putfield        #29  <Field int c>
		d = Math.round(pointf.y);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:getfield        #56  <Field float PointF.y>
	//    8   16:invokestatic    #53  <Method int Math.round(float)>
	//    9   19:putfield        #31  <Field int d>
		g = g + 1;
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:getfield        #40  <Field int g>
	//   13   27:iconst_1        
	//   14   28:iadd            
	//   15   29:putfield        #40  <Field int g>
		if(f == g)
	//*  16   32:aload_0         
	//*  17   33:getfield        #38  <Field int f>
	//*  18   36:aload_0         
	//*  19   37:getfield        #40  <Field int g>
	//*  20   40:icmpne          47
			a();
	//   21   43:aload_0         
	//   22   44:invokespecial   #58  <Method void a()>
	//   23   47:return          
	}

	private int a;
	private int b;
	private int c;
	private int d;
	private View e;
	private int f;
	private int g;

	ChangeBounds$a(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		e = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field View e>
	//    5    9:return          
	}
}
