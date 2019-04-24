// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.AccelerateDecelerateInterpolator;

// Referenced classes of package com.irobot.home.view:
//			GestureImageView

private class GestureImageView$a
	implements Runnable
{

	private float a()
	{
		float f1 = Math.min(1.0F, (float)(System.currentTimeMillis() - b) / 500F);
	//    0    0:fconst_1        
	//    1    1:invokestatic    #45  <Method long System.currentTimeMillis()>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field long b>
	//    4    8:lsub            
	//    5    9:l2f             
	//    6   10:ldc1            #48  <Float 500F>
	//    7   12:fdiv            
	//    8   13:invokestatic    #54  <Method float Math.min(float, float)>
	//    9   16:fstore_1        
		return g.getInterpolation(f1);
	//   10   17:aload_0         
	//   11   18:getfield        #34  <Field AccelerateDecelerateInterpolator g>
	//   12   21:fload_1         
	//   13   22:invokevirtual   #58  <Method float AccelerateDecelerateInterpolator.getInterpolation(float)>
	//   14   25:freturn         
	}

	private void a(float f1)
	{
		float f2 = h.x;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field PointF h>
	//    2    4:getfield        #66  <Field float PointF.x>
	//    3    7:fstore_2        
		float f3 = i.x;
	//    4    8:aload_0         
	//    5    9:getfield        #68  <Field PointF i>
	//    6   12:getfield        #66  <Field float PointF.x>
	//    7   15:fstore_3        
		float f4 = h.x;
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field PointF h>
	//   10   20:getfield        #66  <Field float PointF.x>
	//   11   23:fstore          4
		float f5 = h.y;
	//   12   25:aload_0         
	//   13   26:getfield        #61  <Field PointF h>
	//   14   29:getfield        #71  <Field float PointF.y>
	//   15   32:fstore          5
		float f6 = i.y;
	//   16   34:aload_0         
	//   17   35:getfield        #68  <Field PointF i>
	//   18   38:getfield        #71  <Field float PointF.y>
	//   19   41:fstore          6
		float f7 = h.y;
	//   20   43:aload_0         
	//   21   44:getfield        #61  <Field PointF h>
	//   22   47:getfield        #71  <Field float PointF.y>
	//   23   50:fstore          7
		PointF pointf = GestureImageView.a(a, e, f);
	//   24   52:aload_0         
	//   25   53:getfield        #26  <Field GestureImageView a>
	//   26   56:aload_0         
	//   27   57:getfield        #73  <Field float e>
	//   28   60:aload_0         
	//   29   61:getfield        #75  <Field float f>
	//   30   64:invokestatic    #78  <Method PointF GestureImageView.a(GestureImageView, float, float)>
	//   31   67:astore          8
		GestureImageView.i(a).postTranslate((f2 + (f3 - f4) * f1) - pointf.x, (f5 + f1 * (f6 - f7)) - pointf.y);
	//   32   69:aload_0         
	//   33   70:getfield        #26  <Field GestureImageView a>
	//   34   73:invokestatic    #81  <Method Matrix GestureImageView.i(GestureImageView)>
	//   35   76:fload_2         
	//   36   77:fload_3         
	//   37   78:fload           4
	//   38   80:fsub            
	//   39   81:fload_1         
	//   40   82:fmul            
	//   41   83:fadd            
	//   42   84:aload           8
	//   43   86:getfield        #66  <Field float PointF.x>
	//   44   89:fsub            
	//   45   90:fload           5
	//   46   92:fload_1         
	//   47   93:fload           6
	//   48   95:fload           7
	//   49   97:fsub            
	//   50   98:fmul            
	//   51   99:fadd            
	//   52  100:aload           8
	//   53  102:getfield        #71  <Field float PointF.y>
	//   54  105:fsub            
	//   55  106:invokevirtual   #87  <Method boolean Matrix.postTranslate(float, float)>
	//   56  109:pop             
	//   57  110:return          
	}

	private double b(float f1)
	{
		return (double)(c + f1 * (d - c)) / (double)GestureImageView.l(a);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field float c>
	//    2    4:fload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #92  <Field float d>
	//    5    9:aload_0         
	//    6   10:getfield        #90  <Field float c>
	//    7   13:fsub            
	//    8   14:fmul            
	//    9   15:fadd            
	//   10   16:f2d             
	//   11   17:aload_0         
	//   12   18:getfield        #26  <Field GestureImageView a>
	//   13   21:invokestatic    #96  <Method float GestureImageView.l(GestureImageView)>
	//   14   24:f2d             
	//   15   25:ddiv            
	//   16   26:dreturn         
	}

	public void a(float f1, float f2, float f3)
	{
		GestureImageView.a(a, GestureImageView$g.ANIMATE_ZOOM);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field GestureImageView a>
	//    2    4:getstatic       #102 <Field GestureImageView$g GestureImageView$g.ANIMATE_ZOOM>
	//    3    7:invokestatic    #105 <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
		b = System.currentTimeMillis();
	//    4   10:aload_0         
	//    5   11:invokestatic    #45  <Method long System.currentTimeMillis()>
	//    6   14:putfield        #47  <Field long b>
		c = GestureImageView.l(a);
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:getfield        #26  <Field GestureImageView a>
	//   10   22:invokestatic    #96  <Method float GestureImageView.l(GestureImageView)>
	//   11   25:putfield        #90  <Field float c>
		d = f1;
	//   12   28:aload_0         
	//   13   29:fload_1         
	//   14   30:putfield        #92  <Field float d>
		PointF pointf = GestureImageView.a(a, f2, f3, false);
	//   15   33:aload_0         
	//   16   34:getfield        #26  <Field GestureImageView a>
	//   17   37:fload_2         
	//   18   38:fload_3         
	//   19   39:iconst_0        
	//   20   40:invokestatic    #108 <Method PointF GestureImageView.a(GestureImageView, float, float, boolean)>
	//   21   43:astore          4
		e = pointf.x;
	//   22   45:aload_0         
	//   23   46:aload           4
	//   24   48:getfield        #66  <Field float PointF.x>
	//   25   51:putfield        #73  <Field float e>
		f = pointf.y;
	//   26   54:aload_0         
	//   27   55:aload           4
	//   28   57:getfield        #71  <Field float PointF.y>
	//   29   60:putfield        #75  <Field float f>
		h = GestureImageView.a(a, e, f);
	//   30   63:aload_0         
	//   31   64:aload_0         
	//   32   65:getfield        #26  <Field GestureImageView a>
	//   33   68:aload_0         
	//   34   69:getfield        #73  <Field float e>
	//   35   72:aload_0         
	//   36   73:getfield        #75  <Field float f>
	//   37   76:invokestatic    #78  <Method PointF GestureImageView.a(GestureImageView, float, float)>
	//   38   79:putfield        #61  <Field PointF h>
		i = new PointF(GestureImageView.n(a) / 2, GestureImageView.o(a) / 2);
	//   39   82:aload_0         
	//   40   83:new             #63  <Class PointF>
	//   41   86:dup             
	//   42   87:aload_0         
	//   43   88:getfield        #26  <Field GestureImageView a>
	//   44   91:invokestatic    #112 <Method int GestureImageView.n(GestureImageView)>
	//   45   94:iconst_2        
	//   46   95:idiv            
	//   47   96:i2f             
	//   48   97:aload_0         
	//   49   98:getfield        #26  <Field GestureImageView a>
	//   50  101:invokestatic    #115 <Method int GestureImageView.o(GestureImageView)>
	//   51  104:iconst_2        
	//   52  105:idiv            
	//   53  106:i2f             
	//   54  107:invokespecial   #118 <Method void PointF(float, float)>
	//   55  110:putfield        #68  <Field PointF i>
	//   56  113:return          
	}

	public void run()
	{
		float f1 = a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method float a()>
	//    2    4:fstore_3        
		double d1 = b(f1);
	//    3    5:aload_0         
	//    4    6:fload_3         
	//    5    7:invokespecial   #123 <Method double b(float)>
	//    6   10:dstore_1        
		GestureImageView.a(a, d1, e, f);
	//    7   11:aload_0         
	//    8   12:getfield        #26  <Field GestureImageView a>
	//    9   15:dload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #73  <Field float e>
	//   12   20:aload_0         
	//   13   21:getfield        #75  <Field float f>
	//   14   24:invokestatic    #126 <Method void GestureImageView.a(GestureImageView, double, float, float)>
		a(f1);
	//   15   27:aload_0         
	//   16   28:fload_3         
	//   17   29:invokespecial   #128 <Method void a(float)>
		a.setImageMatrix(GestureImageView.i(a));
	//   18   32:aload_0         
	//   19   33:getfield        #26  <Field GestureImageView a>
	//   20   36:aload_0         
	//   21   37:getfield        #26  <Field GestureImageView a>
	//   22   40:invokestatic    #81  <Method Matrix GestureImageView.i(GestureImageView)>
	//   23   43:invokevirtual   #132 <Method void GestureImageView.setImageMatrix(Matrix)>
		if(f1 < 1.0F)
	//*  24   46:fload_3         
	//*  25   47:fconst_1        
	//*  26   48:fcmpg           
	//*  27   49:ifge            61
		{
			a.postOnAnimation(((Runnable) (this)));
	//   28   52:aload_0         
	//   29   53:getfield        #26  <Field GestureImageView a>
	//   30   56:aload_0         
	//   31   57:invokevirtual   #136 <Method void GestureImageView.postOnAnimation(Runnable)>
			return;
	//   32   60:return          
		} else
		{
			GestureImageView.a(a, GestureImageView$g.NONE);
	//   33   61:aload_0         
	//   34   62:getfield        #26  <Field GestureImageView a>
	//   35   65:getstatic       #139 <Field GestureImageView$g GestureImageView$g.NONE>
	//   36   68:invokestatic    #105 <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
			return;
	//   37   71:return          
		}
	}

	final GestureImageView a;
	private long b;
	private float c;
	private float d;
	private float e;
	private float f;
	private AccelerateDecelerateInterpolator g;
	private PointF h;
	private PointF i;

	GestureImageView$a(GestureImageView gestureimageview, float f1, float f2, float f3)
	{
		a = gestureimageview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field GestureImageView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #29  <Method void Object()>
		g = new AccelerateDecelerateInterpolator();
	//    5    9:aload_0         
	//    6   10:new             #31  <Class AccelerateDecelerateInterpolator>
	//    7   13:dup             
	//    8   14:invokespecial   #32  <Method void AccelerateDecelerateInterpolator()>
	//    9   17:putfield        #34  <Field AccelerateDecelerateInterpolator g>
		a(f1, f2, f3);
	//   10   20:aload_0         
	//   11   21:fload_2         
	//   12   22:fload_3         
	//   13   23:fload           4
	//   14   25:invokevirtual   #37  <Method void a(float, float, float)>
	//   15   28:return          
	}
}
