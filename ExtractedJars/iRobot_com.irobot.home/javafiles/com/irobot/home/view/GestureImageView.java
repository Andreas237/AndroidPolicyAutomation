// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

// Referenced classes of package com.irobot.home.view:
//			e

public class GestureImageView extends ImageView
{
	private class a
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
			GestureImageView.a(a, g.ANIMATE_ZOOM);
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
				GestureImageView.a(a, g.NONE);
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

		a(float f1, float f2, float f3)
		{
			a = GestureImageView.this;
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

	private class b extends android.view.GestureDetector.SimpleOnGestureListener
	{

		public boolean onDoubleTap(MotionEvent motionevent)
		{
			boolean flag;
			if(GestureImageView.k(a) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field GestureImageView a>
		//*   2    4:invokestatic    #26  <Method android.view.GestureDetector$OnDoubleTapListener GestureImageView.k(GestureImageView)>
		//*   3    7:ifnull          28
				flag = GestureImageView.k(a).onDoubleTap(motionevent);
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field GestureImageView a>
		//    6   14:invokestatic    #26  <Method android.view.GestureDetector$OnDoubleTapListener GestureImageView.k(GestureImageView)>
		//    7   17:aload_1         
		//    8   18:invokeinterface #30  <Method boolean android.view.GestureDetector$OnDoubleTapListener.onDoubleTap(MotionEvent)>
		//    9   23:istore          4
			else
		//*  10   25:goto            31
				flag = false;
		//   11   28:iconst_0        
		//   12   29:istore          4
			if(GestureImageView.h(a) == g.NONE)
		//*  13   31:aload_0         
		//*  14   32:getfield        #13  <Field GestureImageView a>
		//*  15   35:invokestatic    #34  <Method GestureImageView$g GestureImageView.h(GestureImageView)>
		//*  16   38:getstatic       #40  <Field GestureImageView$g GestureImageView$g.NONE>
		//*  17   41:if_acmpne       140
			{
				float f2 = GestureImageView.l(a);
		//   18   44:aload_0         
		//   19   45:getfield        #13  <Field GestureImageView a>
		//   20   48:invokestatic    #44  <Method float GestureImageView.l(GestureImageView)>
		//   21   51:fstore_3        
				float f1 = 1.0F;
		//   22   52:fconst_1        
		//   23   53:fstore_2        
				if(f2 == 1.0F)
		//*  24   54:fload_3         
		//*  25   55:fconst_1        
		//*  26   56:fcmpl           
		//*  27   57:ifne            63
					f1 = 3F;
		//   28   60:ldc1            #45  <Float 3F>
		//   29   62:fstore_2        
				if(GestureImageView.k(a) == null)
		//*  30   63:aload_0         
		//*  31   64:getfield        #13  <Field GestureImageView a>
		//*  32   67:invokestatic    #26  <Method android.view.GestureDetector$OnDoubleTapListener GestureImageView.k(GestureImageView)>
		//*  33   70:ifnonnull       104
					GestureImageView.a(a, ((a) (a)). new a(f1, motionevent.getX(), motionevent.getY()));
		//   34   73:aload_0         
		//   35   74:getfield        #13  <Field GestureImageView a>
		//   36   77:new             #47  <Class GestureImageView$a>
		//   37   80:dup             
		//   38   81:aload_0         
		//   39   82:getfield        #13  <Field GestureImageView a>
		//   40   85:fload_2         
		//   41   86:aload_1         
		//   42   87:invokevirtual   #53  <Method float MotionEvent.getX()>
		//   43   90:aload_1         
		//   44   91:invokevirtual   #56  <Method float MotionEvent.getY()>
		//   45   94:invokespecial   #59  <Method void GestureImageView$a(GestureImageView, float, float, float)>
		//   46   97:invokestatic    #62  <Method GestureImageView$a GestureImageView.a(GestureImageView, GestureImageView$a)>
		//   47  100:pop             
				else
		//*  48  101:goto            123
					GestureImageView.m(a).a(f1, motionevent.getX(), motionevent.getY());
		//   49  104:aload_0         
		//   50  105:getfield        #13  <Field GestureImageView a>
		//   51  108:invokestatic    #66  <Method GestureImageView$a GestureImageView.m(GestureImageView)>
		//   52  111:fload_2         
		//   53  112:aload_1         
		//   54  113:invokevirtual   #53  <Method float MotionEvent.getX()>
		//   55  116:aload_1         
		//   56  117:invokevirtual   #56  <Method float MotionEvent.getY()>
		//   57  120:invokevirtual   #69  <Method void GestureImageView$a.a(float, float, float)>
				a.postOnAnimation(((Runnable) (GestureImageView.m(a))));
		//   58  123:aload_0         
		//   59  124:getfield        #13  <Field GestureImageView a>
		//   60  127:aload_0         
		//   61  128:getfield        #13  <Field GestureImageView a>
		//   62  131:invokestatic    #66  <Method GestureImageView$a GestureImageView.m(GestureImageView)>
		//   63  134:invokevirtual   #73  <Method void GestureImageView.postOnAnimation(Runnable)>
				flag = true;
		//   64  137:iconst_1        
		//   65  138:istore          4
			}
			return flag;
		//   66  140:iload           4
		//   67  142:ireturn         
		}

		public boolean onSingleTapConfirmed(MotionEvent motionevent)
		{
			return a.performClick();
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field GestureImageView a>
		//    2    4:invokevirtual   #78  <Method boolean GestureImageView.performClick()>
		//    3    7:ireturn         
		}

		final GestureImageView a;

		private b()
		{
			a = GestureImageView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field GestureImageView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
		//    5    9:return          
		}

	}

	private class c
		implements android.view.View.OnTouchListener
	{

		public boolean onTouch(View view, MotionEvent motionevent)
		{
			if(GestureImageView.a(a))
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field GestureImageView a>
		//*   2    4:invokestatic    #34  <Method boolean GestureImageView.a(GestureImageView)>
		//*   3    7:ifeq            22
				GestureImageView.b(a).onTouchEvent(motionevent);
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field GestureImageView a>
		//    6   14:invokestatic    #37  <Method ScaleGestureDetector GestureImageView.b(GestureImageView)>
		//    7   17:aload_2         
		//    8   18:invokevirtual   #43  <Method boolean ScaleGestureDetector.onTouchEvent(MotionEvent)>
		//    9   21:pop             
			if(GestureImageView.c(a))
		//*  10   22:aload_0         
		//*  11   23:getfield        #17  <Field GestureImageView a>
		//*  12   26:invokestatic    #45  <Method boolean GestureImageView.c(GestureImageView)>
		//*  13   29:ifeq            44
				GestureImageView.d(a).a(motionevent);
		//   14   32:aload_0         
		//   15   33:getfield        #17  <Field GestureImageView a>
		//   16   36:invokestatic    #49  <Method e GestureImageView.d(GestureImageView)>
		//   17   39:aload_2         
		//   18   40:invokevirtual   #53  <Method boolean e.a(MotionEvent)>
		//   19   43:pop             
			if(GestureImageView.e(a))
		//*  20   44:aload_0         
		//*  21   45:getfield        #17  <Field GestureImageView a>
		//*  22   48:invokestatic    #56  <Method boolean GestureImageView.e(GestureImageView)>
		//*  23   51:ifeq            66
				GestureImageView.f(a).onTouchEvent(motionevent);
		//   24   54:aload_0         
		//   25   55:getfield        #17  <Field GestureImageView a>
		//   26   58:invokestatic    #60  <Method GestureDetector GestureImageView.f(GestureImageView)>
		//   27   61:aload_2         
		//   28   62:invokevirtual   #63  <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
		//   29   65:pop             
			if(!GestureImageView.g(a)) goto _L2; else goto _L1
		//   30   66:aload_0         
		//   31   67:getfield        #17  <Field GestureImageView a>
		//   32   70:invokestatic    #66  <Method boolean GestureImageView.g(GestureImageView)>
		//   33   73:ifeq            297
_L1:
			view = ((View) (new PointF(motionevent.getX(), motionevent.getY())));
		//   34   76:new             #22  <Class PointF>
		//   35   79:dup             
		//   36   80:aload_2         
		//   37   81:invokevirtual   #72  <Method float MotionEvent.getX()>
		//   38   84:aload_2         
		//   39   85:invokevirtual   #75  <Method float MotionEvent.getY()>
		//   40   88:invokespecial   #78  <Method void PointF(float, float)>
		//   41   91:astore_1        
			if(GestureImageView.h(a) != g.NONE && GestureImageView.h(a) != g.DRAG) goto _L2; else goto _L3
		//   42   92:aload_0         
		//   43   93:getfield        #17  <Field GestureImageView a>
		//   44   96:invokestatic    #82  <Method GestureImageView$g GestureImageView.h(GestureImageView)>
		//   45   99:getstatic       #88  <Field GestureImageView$g GestureImageView$g.NONE>
		//   46  102:if_acmpeq       118
		//   47  105:aload_0         
		//   48  106:getfield        #17  <Field GestureImageView a>
		//   49  109:invokestatic    #82  <Method GestureImageView$g GestureImageView.h(GestureImageView)>
		//   50  112:getstatic       #91  <Field GestureImageView$g GestureImageView$g.DRAG>
		//   51  115:if_acmpne       297
_L3:
			int i1 = motionevent.getActionMasked();
		//   52  118:aload_2         
		//   53  119:invokevirtual   #95  <Method int MotionEvent.getActionMasked()>
		//   54  122:istore          5
			if(i1 == 6) goto _L5; else goto _L4
		//   55  124:iload           5
		//   56  126:bipush          6
		//   57  128:icmpeq          285
_L4:
			i1;
		//   58  131:iload           5
			JVM INSTR tableswitch 0 2: default 160
		//		               0 260
		//		               1 285
		//		               2 163;
		//   59  133:tableswitch     0 2: default 160
		//		               0 260
		//		               1 285
		//		               2 163
			   goto _L2 _L6 _L5 _L7
		//*  60  160:goto            297
_L7:
			if(GestureImageView.h(a) == g.DRAG)
		//*  61  163:aload_0         
		//*  62  164:getfield        #17  <Field GestureImageView a>
		//*  63  167:invokestatic    #82  <Method GestureImageView$g GestureImageView.h(GestureImageView)>
		//*  64  170:getstatic       #91  <Field GestureImageView$g GestureImageView$g.DRAG>
		//*  65  173:if_acmpne       297
			{
				float f1 = ((PointF) (view)).x - b.x;
		//   66  176:aload_1         
		//   67  177:getfield        #99  <Field float PointF.x>
		//   68  180:aload_0         
		//   69  181:getfield        #25  <Field PointF b>
		//   70  184:getfield        #99  <Field float PointF.x>
		//   71  187:fsub            
		//   72  188:fstore_3        
				float f2 = ((PointF) (view)).y - b.y;
		//   73  189:aload_1         
		//   74  190:getfield        #102 <Field float PointF.y>
		//   75  193:aload_0         
		//   76  194:getfield        #25  <Field PointF b>
		//   77  197:getfield        #102 <Field float PointF.y>
		//   78  200:fsub            
		//   79  201:fstore          4
				GestureImageView.i(a).postTranslate(f1, f2);
		//   80  203:aload_0         
		//   81  204:getfield        #17  <Field GestureImageView a>
		//   82  207:invokestatic    #106 <Method Matrix GestureImageView.i(GestureImageView)>
		//   83  210:fload_3         
		//   84  211:fload           4
		//   85  213:invokevirtual   #112 <Method boolean Matrix.postTranslate(float, float)>
		//   86  216:pop             
				b.set(((PointF) (view)).x, ((PointF) (view)).y);
		//   87  217:aload_0         
		//   88  218:getfield        #25  <Field PointF b>
		//   89  221:aload_1         
		//   90  222:getfield        #99  <Field float PointF.x>
		//   91  225:aload_1         
		//   92  226:getfield        #102 <Field float PointF.y>
		//   93  229:invokevirtual   #115 <Method void PointF.set(float, float)>
				if(GestureImageView.j(a) != null)
		//*  94  232:aload_0         
		//*  95  233:getfield        #17  <Field GestureImageView a>
		//*  96  236:invokestatic    #119 <Method GestureImageView$d GestureImageView.j(GestureImageView)>
		//*  97  239:ifnull          297
					GestureImageView.j(a).a(f1, f2);
		//   98  242:aload_0         
		//   99  243:getfield        #17  <Field GestureImageView a>
		//  100  246:invokestatic    #119 <Method GestureImageView$d GestureImageView.j(GestureImageView)>
		//  101  249:fload_3         
		//  102  250:fload           4
		//  103  252:invokeinterface #123 <Method void GestureImageView$d.a(float, float)>
			}
			  goto _L2
		//* 104  257:goto            297
_L6:
			b.set(((PointF) (view)));
		//  105  260:aload_0         
		//  106  261:getfield        #25  <Field PointF b>
		//  107  264:aload_1         
		//  108  265:invokevirtual   #126 <Method void PointF.set(PointF)>
			view = ((View) (a));
		//  109  268:aload_0         
		//  110  269:getfield        #17  <Field GestureImageView a>
		//  111  272:astore_1        
			motionevent = ((MotionEvent) (g.DRAG));
		//  112  273:getstatic       #91  <Field GestureImageView$g GestureImageView$g.DRAG>
		//  113  276:astore_2        
_L8:
			GestureImageView.a(((GestureImageView) (view)), ((g) (motionevent)));
		//  114  277:aload_1         
		//  115  278:aload_2         
		//  116  279:invokestatic    #129 <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
			break; /* Loop/switch isn't completed */
		//  117  282:goto            297
_L5:
			view = ((View) (a));
		//  118  285:aload_0         
		//  119  286:getfield        #17  <Field GestureImageView a>
		//  120  289:astore_1        
			motionevent = ((MotionEvent) (g.NONE));
		//  121  290:getstatic       #88  <Field GestureImageView$g GestureImageView$g.NONE>
		//  122  293:astore_2        
			if(true) goto _L8; else goto _L2
		//  123  294:goto            277
_L2:
			a.setImageMatrix(GestureImageView.i(a));
		//  124  297:aload_0         
		//  125  298:getfield        #17  <Field GestureImageView a>
		//  126  301:aload_0         
		//  127  302:getfield        #17  <Field GestureImageView a>
		//  128  305:invokestatic    #106 <Method Matrix GestureImageView.i(GestureImageView)>
		//  129  308:invokevirtual   #133 <Method void GestureImageView.setImageMatrix(Matrix)>
			return true;
		//  130  311:iconst_1        
		//  131  312:ireturn         
		}

		final GestureImageView a;
		private PointF b;

		private c()
		{
			a = GestureImageView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field GestureImageView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			b = new PointF();
		//    5    9:aload_0         
		//    6   10:new             #22  <Class PointF>
		//    7   13:dup             
		//    8   14:invokespecial   #23  <Method void PointF()>
		//    9   17:putfield        #25  <Field PointF b>
		//   10   20:return          
		}

	}

	public static interface d
	{

		public abstract void a(float f1);

		public abstract void a(float f1, float f2);

		public abstract void b(float f1);
	}

	private class e
		implements e.a
	{

		public boolean a(com.irobot.home.view.e e1)
		{
			GestureImageView.a(a, e1.a(), e1.b(), e1.c());
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field GestureImageView a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method float e.a()>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #31  <Method float e.b()>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #34  <Method float e.c()>
		//    8   16:invokestatic    #37  <Method void GestureImageView.a(GestureImageView, float, float, float)>
			return true;
		//    9   19:iconst_1        
		//   10   20:ireturn         
		}

		public boolean b(com.irobot.home.view.e e1)
		{
			GestureImageView.a(a, g.ROTATE);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field GestureImageView a>
		//    2    4:getstatic       #43  <Field GestureImageView$g GestureImageView$g.ROTATE>
		//    3    7:invokestatic    #46  <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
			return true;
		//    4   10:iconst_1        
		//    5   11:ireturn         
		}

		public boolean c(com.irobot.home.view.e e1)
		{
			GestureImageView.a(a, g.NONE);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field GestureImageView a>
		//    2    4:getstatic       #49  <Field GestureImageView$g GestureImageView$g.NONE>
		//    3    7:invokestatic    #46  <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
			return true;
		//    4   10:iconst_1        
		//    5   11:ireturn         
		}

		final GestureImageView a;

		private e()
		{
			a = GestureImageView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field GestureImageView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}

	}

	private class f extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
	{

		public boolean onScale(ScaleGestureDetector scalegesturedetector)
		{
			GestureImageView.a(a, scalegesturedetector.getScaleFactor(), scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field GestureImageView a>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #28  <Method float ScaleGestureDetector.getScaleFactor()>
		//    4    8:f2d             
		//    5    9:aload_1         
		//    6   10:invokevirtual   #31  <Method float ScaleGestureDetector.getFocusX()>
		//    7   13:aload_1         
		//    8   14:invokevirtual   #34  <Method float ScaleGestureDetector.getFocusY()>
		//    9   17:invokestatic    #37  <Method void GestureImageView.a(GestureImageView, double, float, float)>
			return true;
		//   10   20:iconst_1        
		//   11   21:ireturn         
		}

		public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
		{
			GestureImageView.a(a, g.ZOOM);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field GestureImageView a>
		//    2    4:getstatic       #44  <Field GestureImageView$g GestureImageView$g.ZOOM>
		//    3    7:invokestatic    #47  <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
			return true;
		//    4   10:iconst_1        
		//    5   11:ireturn         
		}

		public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
		{
			super.onScaleEnd(scalegesturedetector);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #51  <Method void android.view.ScaleGestureDetector$SimpleOnScaleGestureListener.onScaleEnd(ScaleGestureDetector)>
			GestureImageView.a(a, g.NONE);
		//    3    5:aload_0         
		//    4    6:getfield        #13  <Field GestureImageView a>
		//    5    9:getstatic       #54  <Field GestureImageView$g GestureImageView$g.NONE>
		//    6   12:invokestatic    #47  <Method void GestureImageView.a(GestureImageView, GestureImageView$g)>
		//    7   15:return          
		}

		final GestureImageView a;

		private f()
		{
			a = GestureImageView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field GestureImageView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.view.ScaleGestureDetector$SimpleOnScaleGestureListener()>
		//    5    9:return          
		}

	}

	private static final class g extends Enum
	{

		public static g valueOf(String s1)
		{
			return (g)Enum.valueOf(com/irobot/home/view/GestureImageView$g, s1);
		//    0    0:ldc1            #2   <Class GestureImageView$g>
		//    1    2:aload_0         
		//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GestureImageView$g>
		//    4    9:areturn         
		}

		public static g[] values()
		{
			return (g[])((g []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field GestureImageView$g[] $VALUES>
		//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.irobot.home.view.GestureImageView$g_3B_.clone()>
		//    2    6:checkcast       #50  <Class GestureImageView$g[]>
		//    3    9:areturn         
		}

		private static final g $VALUES[];
		public static final g ANIMATE_ZOOM;
		public static final g DRAG;
		public static final g NONE;
		public static final g ROTATE;
		public static final g ZOOM;

		static 
		{
			NONE = new g("NONE", 0);
		//    0    0:new             #2   <Class GestureImageView$g>
		//    1    3:dup             
		//    2    4:ldc1            #19  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #23  <Method void GestureImageView$g(String, int)>
		//    5   10:putstatic       #25  <Field GestureImageView$g NONE>
			ZOOM = new g("ZOOM", 1);
		//    6   13:new             #2   <Class GestureImageView$g>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "ZOOM">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #23  <Method void GestureImageView$g(String, int)>
		//   11   23:putstatic       #28  <Field GestureImageView$g ZOOM>
			ROTATE = new g("ROTATE", 2);
		//   12   26:new             #2   <Class GestureImageView$g>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "ROTATE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #23  <Method void GestureImageView$g(String, int)>
		//   17   36:putstatic       #31  <Field GestureImageView$g ROTATE>
			DRAG = new g("DRAG", 3);
		//   18   39:new             #2   <Class GestureImageView$g>
		//   19   42:dup             
		//   20   43:ldc1            #32  <String "DRAG">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #23  <Method void GestureImageView$g(String, int)>
		//   23   49:putstatic       #34  <Field GestureImageView$g DRAG>
			ANIMATE_ZOOM = new g("ANIMATE_ZOOM", 4);
		//   24   52:new             #2   <Class GestureImageView$g>
		//   25   55:dup             
		//   26   56:ldc1            #35  <String "ANIMATE_ZOOM">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #23  <Method void GestureImageView$g(String, int)>
		//   29   62:putstatic       #37  <Field GestureImageView$g ANIMATE_ZOOM>
			$VALUES = (new g[] {
				NONE, ZOOM, ROTATE, DRAG, ANIMATE_ZOOM
			});
		//   30   65:iconst_5        
		//   31   66:anewarray       g[]
		//   32   69:dup             
		//   33   70:iconst_0        
		//   34   71:getstatic       #25  <Field GestureImageView$g NONE>
		//   35   74:aastore         
		//   36   75:dup             
		//   37   76:iconst_1        
		//   38   77:getstatic       #28  <Field GestureImageView$g ZOOM>
		//   39   80:aastore         
		//   40   81:dup             
		//   41   82:iconst_2        
		//   42   83:getstatic       #31  <Field GestureImageView$g ROTATE>
		//   43   86:aastore         
		//   44   87:dup             
		//   45   88:iconst_3        
		//   46   89:getstatic       #34  <Field GestureImageView$g DRAG>
		//   47   92:aastore         
		//   48   93:dup             
		//   49   94:iconst_4        
		//   50   95:getstatic       #37  <Field GestureImageView$g ANIMATE_ZOOM>
		//   51   98:aastore         
		//   52   99:putstatic       #39  <Field GestureImageView$g[] $VALUES>
		//*  53  102:return          
		}

		private g(String s1, int i1)
		{
			super(s1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public GestureImageView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void ImageView(Context)>
		n = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #65  <Field android.view.GestureDetector$OnDoubleTapListener n>
		a(context, ((AttributeSet) (null)), 0);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:aconst_null     
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #68  <Method void a(Context, AttributeSet, int)>
	//   11   17:return          
	}

	public GestureImageView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #71  <Method void ImageView(Context, AttributeSet)>
		n = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #65  <Field android.view.GestureDetector$OnDoubleTapListener n>
		a(context, attributeset, 0);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #68  <Method void a(Context, AttributeSet, int)>
	//   12   18:return          
	}

	public GestureImageView(Context context, AttributeSet attributeset, int i1)
	{
		super(context, attributeset, i1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #73  <Method void ImageView(Context, AttributeSet, int)>
		n = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #65  <Field android.view.GestureDetector$OnDoubleTapListener n>
		a(context, attributeset, i1);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:iload_3         
	//   12   16:invokevirtual   #68  <Method void a(Context, AttributeSet, int)>
	//   13   19:return          
	}

	private int a(int i1, int j1, int k1)
	{
		if(i1 != 0x80000000)
	//*   0    0:iload_1         
	//*   1    1:ldc1            #75  <Int 0x80000000>
	//*   2    3:icmpeq          14
		{
			if(i1 != 0)
	//*   3    6:iload_1         
	//*   4    7:ifeq            12
				return j1;
	//    5   10:iload_2         
	//    6   11:ireturn         
			else
				return k1;
	//    7   12:iload_3         
	//    8   13:ireturn         
		} else
		{
			return Math.min(k1, j1);
	//    9   14:iload_3         
	//   10   15:iload_2         
	//   11   16:invokestatic    #81  <Method int Math.min(int, int)>
	//   12   19:ireturn         
		}
	}

	private PointF a(float f1, float f2)
	{
		g.getValues(h);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Matrix g>
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field float[] h>
	//    4    8:invokevirtual   #92  <Method void Matrix.getValues(float[])>
		float f4 = getDrawable().getIntrinsicWidth();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #96  <Method Drawable getDrawable()>
	//    7   15:invokevirtual   #102 <Method int Drawable.getIntrinsicWidth()>
	//    8   18:i2f             
	//    9   19:fstore          4
		float f3 = getDrawable().getIntrinsicHeight();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #96  <Method Drawable getDrawable()>
	//   12   25:invokevirtual   #105 <Method int Drawable.getIntrinsicHeight()>
	//   13   28:i2f             
	//   14   29:fstore_3        
		f1 /= f4;
	//   15   30:fload_1         
	//   16   31:fload           4
	//   17   33:fdiv            
	//   18   34:fstore_1        
		f2 /= f3;
	//   19   35:fload_2         
	//   20   36:fload_3         
	//   21   37:fdiv            
	//   22   38:fstore_2        
		return new PointF(h[2] + getImageWidth() * f1, h[5] + getImageHeight() * f2);
	//   23   39:new             #107 <Class PointF>
	//   24   42:dup             
	//   25   43:aload_0         
	//   26   44:getfield        #86  <Field float[] h>
	//   27   47:iconst_2        
	//   28   48:faload          
	//   29   49:aload_0         
	//   30   50:invokespecial   #111 <Method float getImageWidth()>
	//   31   53:fload_1         
	//   32   54:fmul            
	//   33   55:fadd            
	//   34   56:aload_0         
	//   35   57:getfield        #86  <Field float[] h>
	//   36   60:iconst_5        
	//   37   61:faload          
	//   38   62:aload_0         
	//   39   63:invokespecial   #114 <Method float getImageHeight()>
	//   40   66:fload_2         
	//   41   67:fmul            
	//   42   68:fadd            
	//   43   69:invokespecial   #117 <Method void PointF(float, float)>
	//   44   72:areturn         
	}

	private PointF a(float f1, float f2, boolean flag)
	{
		g.getValues(h);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Matrix g>
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field float[] h>
	//    4    8:invokevirtual   #92  <Method void Matrix.getValues(float[])>
		float f6 = getDrawable().getIntrinsicWidth();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #96  <Method Drawable getDrawable()>
	//    7   15:invokevirtual   #102 <Method int Drawable.getIntrinsicWidth()>
	//    8   18:i2f             
	//    9   19:fstore          7
		float f5 = getDrawable().getIntrinsicHeight();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #96  <Method Drawable getDrawable()>
	//   12   25:invokevirtual   #105 <Method int Drawable.getIntrinsicHeight()>
	//   13   28:i2f             
	//   14   29:fstore          6
		float f3 = h[2];
	//   15   31:aload_0         
	//   16   32:getfield        #86  <Field float[] h>
	//   17   35:iconst_2        
	//   18   36:faload          
	//   19   37:fstore          4
		float f4 = h[5];
	//   20   39:aload_0         
	//   21   40:getfield        #86  <Field float[] h>
	//   22   43:iconst_5        
	//   23   44:faload          
	//   24   45:fstore          5
		f3 = ((f1 - f3) * f6) / getImageWidth();
	//   25   47:fload_1         
	//   26   48:fload           4
	//   27   50:fsub            
	//   28   51:fload           7
	//   29   53:fmul            
	//   30   54:aload_0         
	//   31   55:invokespecial   #111 <Method float getImageWidth()>
	//   32   58:fdiv            
	//   33   59:fstore          4
		f4 = ((f2 - f4) * f5) / getImageHeight();
	//   34   61:fload_2         
	//   35   62:fload           5
	//   36   64:fsub            
	//   37   65:fload           6
	//   38   67:fmul            
	//   39   68:aload_0         
	//   40   69:invokespecial   #114 <Method float getImageHeight()>
	//   41   72:fdiv            
	//   42   73:fstore          5
		f2 = f3;
	//   43   75:fload           4
	//   44   77:fstore_2        
		f1 = f4;
	//   45   78:fload           5
	//   46   80:fstore_1        
		if(flag)
	//*  47   81:iload_3         
	//*  48   82:ifeq            109
		{
			f2 = Math.min(Math.max(f3, 0.0F), f6);
	//   49   85:fload           4
	//   50   87:fconst_0        
	//   51   88:invokestatic    #122 <Method float Math.max(float, float)>
	//   52   91:fload           7
	//   53   93:invokestatic    #124 <Method float Math.min(float, float)>
	//   54   96:fstore_2        
			f1 = Math.min(Math.max(f4, 0.0F), f5);
	//   55   97:fload           5
	//   56   99:fconst_0        
	//   57  100:invokestatic    #122 <Method float Math.max(float, float)>
	//   58  103:fload           6
	//   59  105:invokestatic    #124 <Method float Math.min(float, float)>
	//   60  108:fstore_1        
		}
		return new PointF(f2, f1);
	//   61  109:new             #107 <Class PointF>
	//   62  112:dup             
	//   63  113:fload_2         
	//   64  114:fload_1         
	//   65  115:invokespecial   #117 <Method void PointF(float, float)>
	//   66  118:areturn         
	}

	static PointF a(GestureImageView gestureimageview, float f1, float f2)
	{
		return gestureimageview.a(f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #127 <Method PointF a(float, float)>
	//    4    6:areturn         
	}

	static PointF a(GestureImageView gestureimageview, float f1, float f2, boolean flag)
	{
		return gestureimageview.a(f1, f2, flag);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #130 <Method PointF a(float, float, boolean)>
	//    5    7:areturn         
	}

	static a a(GestureImageView gestureimageview, a a1)
	{
		gestureimageview.o = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #133 <Field GestureImageView$a o>
		return a1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	private void a(double d1, float f1, float f2)
	{
		float f3;
		float f5;
		float f6;
		f5 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field float b>
	//    2    4:fstore          6
		b = (float)((double)b * d1);
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #136 <Field float b>
	//    6   11:f2d             
	//    7   12:dload_1         
	//    8   13:dmul            
	//    9   14:d2f             
	//   10   15:putfield        #136 <Field float b>
		f6 = b;
	//   11   18:aload_0         
	//   12   19:getfield        #136 <Field float b>
	//   13   22:fstore          7
		f3 = 3F;
	//   14   24:ldc1            #137 <Float 3F>
	//   15   26:fstore          5
		if(f6 <= 3F) goto _L2; else goto _L1
	//   16   28:fload           7
	//   17   30:ldc1            #137 <Float 3F>
	//   18   32:fcmpl           
	//   19   33:ifle            52
_L1:
		b = f3;
	//   20   36:aload_0         
	//   21   37:fload           5
	//   22   39:putfield        #136 <Field float b>
		d1 = f3 / f5;
	//   23   42:fload           5
	//   24   44:fload           6
	//   25   46:fdiv            
	//   26   47:f2d             
	//   27   48:dstore_1        
		break; /* Loop/switch isn't completed */
	//   28   49:goto            71
_L2:
		f6 = b;
	//   29   52:aload_0         
	//   30   53:getfield        #136 <Field float b>
	//   31   56:fstore          7
		f3 = 1.0F;
	//   32   58:fconst_1        
	//   33   59:fstore          5
		if(f6 >= 1.0F) goto _L3; else goto _L1
	//   34   61:fload           7
	//   35   63:fconst_1        
	//   36   64:fcmpg           
	//   37   65:ifge            71
	//*  38   68:goto            36
_L3:
		Matrix matrix = g;
	//   39   71:aload_0         
	//   40   72:getfield        #84  <Field Matrix g>
	//   41   75:astore          8
		float f4 = (float)d1;
	//   42   77:dload_1         
	//   43   78:d2f             
	//   44   79:fstore          5
		matrix.postScale(f4, f4, f1, f2);
	//   45   81:aload           8
	//   46   83:fload           5
	//   47   85:fload           5
	//   48   87:fload_3         
	//   49   88:fload           4
	//   50   90:invokevirtual   #141 <Method boolean Matrix.postScale(float, float, float, float)>
	//   51   93:pop             
		if(t != null)
	//*  52   94:aload_0         
	//*  53   95:getfield        #143 <Field GestureImageView$d t>
	//*  54   98:ifnull          112
			t.b(f4);
	//   55  101:aload_0         
	//   56  102:getfield        #143 <Field GestureImageView$d t>
	//   57  105:fload           5
	//   58  107:invokeinterface #146 <Method void GestureImageView$d.b(float)>
		return;
	//   59  112:return          
	}

	static void a(GestureImageView gestureimageview, double d1, float f1, float f2)
	{
		gestureimageview.a(d1, f1, f2);
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:fload_3         
	//    3    3:fload           4
	//    4    5:invokespecial   #149 <Method void a(double, float, float)>
	//    5    8:return          
	}

	static void a(GestureImageView gestureimageview, float f1, float f2, float f3)
	{
		gestureimageview.b(f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:invokespecial   #153 <Method void b(float, float, float)>
	//    5    7:return          
	}

	static void a(GestureImageView gestureimageview, g g1)
	{
		gestureimageview.setState(g1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method void setState(GestureImageView$g)>
	//    3    5:return          
	}

	static boolean a(GestureImageView gestureimageview)
	{
		return gestureimageview.p;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field boolean p>
	//    2    4:ireturn         
	}

	static ScaleGestureDetector b(GestureImageView gestureimageview)
	{
		return gestureimageview.k;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field ScaleGestureDetector k>
	//    2    4:areturn         
	}

	private void b()
	{
label0:
		{
			float f1;
			float f2;
			float f7;
			float f8;
label1:
			{
label2:
				{
					Drawable drawable = getDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method Drawable getDrawable()>
	//    2    4:astore          9
					if(drawable == null || drawable.getIntrinsicWidth() == 0)
						break label0;
	//    3    6:aload           9
	//    4    8:ifnull          265
	//    5   11:aload           9
	//    6   13:invokevirtual   #102 <Method int Drawable.getIntrinsicWidth()>
	//    7   16:ifeq            265
					if(drawable.getIntrinsicHeight() == 0)
	//*   8   19:aload           9
	//*   9   21:invokevirtual   #105 <Method int Drawable.getIntrinsicHeight()>
	//*  10   24:ifne            28
						return;
	//   11   27:return          
					if(g == null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #84  <Field Matrix g>
	//*  14   32:ifnonnull       36
						return;
	//   15   35:return          
					int i1 = drawable.getIntrinsicWidth();
	//   16   36:aload           9
	//   17   38:invokevirtual   #102 <Method int Drawable.getIntrinsicWidth()>
	//   18   41:istore          7
					int j1 = drawable.getIntrinsicHeight();
	//   19   43:aload           9
	//   20   45:invokevirtual   #105 <Method int Drawable.getIntrinsicHeight()>
	//   21   48:istore          8
					f1 = c;
	//   22   50:aload_0         
	//   23   51:getfield        #166 <Field int c>
	//   24   54:i2f             
	//   25   55:fstore_1        
					f7 = i1;
	//   26   56:iload           7
	//   27   58:i2f             
	//   28   59:fstore          5
					float f3 = f1 / f7;
	//   29   61:fload_1         
	//   30   62:fload           5
	//   31   64:fdiv            
	//   32   65:fstore_3        
					f1 = d;
	//   33   66:aload_0         
	//   34   67:getfield        #168 <Field int d>
	//   35   70:i2f             
	//   36   71:fstore_1        
					f8 = j1;
	//   37   72:iload           8
	//   38   74:i2f             
	//   39   75:fstore          6
					float f5 = f1 / f8;
	//   40   77:fload_1         
	//   41   78:fload           6
	//   42   80:fdiv            
	//   43   81:fstore          4
					f1 = f3;
	//   44   83:fload_3         
	//   45   84:fstore_1        
					f2 = f5;
	//   46   85:fload           4
	//   47   87:fstore_2        
					static class _cls1
					{

						static final int a[];

						static 
						{
							a = new int[android.widget.ImageView.ScaleType.values().length];
						//    0    0:invokestatic    #18  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] a>
							try
							{
								a[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] a>
						//    5   12:getstatic       #24  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
						//    6   15:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							}
						//*   9   20:getstatic       #20  <Field int[] a>
						//*  10   23:getstatic       #31  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
						//*  11   26:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
						//*  12   29:iconst_2        
						//*  13   30:iastore         
						//*  14   31:getstatic       #20  <Field int[] a>
						//*  15   34:getstatic       #34  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
						//*  16   37:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
						//*  17   40:iconst_3        
						//*  18   41:iastore         
						//*  19   42:getstatic       #20  <Field int[] a>
						//*  20   45:getstatic       #37  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
						//*  21   48:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
						//*  22   51:iconst_4        
						//*  23   52:iastore         
						//*  24   53:getstatic       #20  <Field int[] a>
						//*  25   56:getstatic       #40  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
						//*  26   59:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
						//*  27   62:iconst_5        
						//*  28   63:iastore         
						//*  29   64:return          
							catch(NoSuchFieldError nosuchfielderror) { }
						//   30   65:astore_0        
							try
							{
								a[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
							}
						//*  31   66:goto            20
							catch(NoSuchFieldError nosuchfielderror1) { }
						//   32   69:astore_0        
							try
							{
								a[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
							}
						//*  33   70:goto            31
							catch(NoSuchFieldError nosuchfielderror2) { }
						//   34   73:astore_0        
							try
							{
								a[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
							}
						//*  35   74:goto            42
							catch(NoSuchFieldError nosuchfielderror3) { }
						//   36   77:astore_0        
							try
							{
								a[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 5;
							}
						//*  37   78:goto            53
							catch(NoSuchFieldError nosuchfielderror4) { }
						//   38   81:astore_0        
						//*  39   82:return          
						}
					}

					switch(_cls1.a[j.ordinal()])
	//*  48   88:getstatic       #171 <Field int[] GestureImageView$1.a>
	//*  49   91:aload_0         
	//*  50   92:getfield        #173 <Field android.widget.ImageView$ScaleType j>
	//*  51   95:invokevirtual   #178 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  52   98:iaload          
					{
	//*  53   99:tableswitch     1 5: default 132
	//	               1 178
	//	               2 166
	//	               3 152
	//	               4 142
	//	               5 182
					default:
						throw new UnsupportedOperationException("GestureImageView does not support FIT_START and FIT_END");
	//   54  132:new             #180 <Class UnsupportedOperationException>
	//   55  135:dup             
	//   56  136:ldc1            #182 <String "GestureImageView does not support FIT_START and FIT_END">
	//   57  138:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//   58  141:athrow          

					case 1: // '\001'
						break label2;

					case 5: // '\005'
						break label1;

					case 4: // '\004'
						f1 = Math.min(f3, f5);
	//   59  142:fload_3         
	//   60  143:fload           4
	//   61  145:invokestatic    #124 <Method float Math.min(float, float)>
	//   62  148:fstore_1        
						break;
	//   63  149:goto            173

					case 3: // '\003'
						f1 = Math.min(1.0F, Math.min(f3, f5));
	//   64  152:fconst_1        
	//   65  153:fload_3         
	//   66  154:fload           4
	//   67  156:invokestatic    #124 <Method float Math.min(float, float)>
	//   68  159:invokestatic    #124 <Method float Math.min(float, float)>
	//   69  162:fstore_1        
						break;
	//   70  163:goto            173

					case 2: // '\002'
						f1 = Math.max(f3, f5);
	//   71  166:fload_3         
	//   72  167:fload           4
	//   73  169:invokestatic    #122 <Method float Math.max(float, float)>
	//   74  172:fstore_1        
						break;
					}
					f2 = f1;
	//   75  173:fload_1         
	//   76  174:fstore_2        
					break label1;
	//   77  175:goto            182
				}
				f1 = 1.0F;
	//   78  178:fconst_1        
	//   79  179:fstore_1        
				f2 = 1.0F;
	//   80  180:fconst_1        
	//   81  181:fstore_2        
			}
			float f4 = (float)c - f7 * f1;
	//   82  182:aload_0         
	//   83  183:getfield        #166 <Field int c>
	//   84  186:i2f             
	//   85  187:fload           5
	//   86  189:fload_1         
	//   87  190:fmul            
	//   88  191:fsub            
	//   89  192:fstore_3        
			float f6 = (float)d - f8 * f2;
	//   90  193:aload_0         
	//   91  194:getfield        #168 <Field int d>
	//   92  197:i2f             
	//   93  198:fload           6
	//   94  200:fload_2         
	//   95  201:fmul            
	//   96  202:fsub            
	//   97  203:fstore          4
			e = (float)c - f4;
	//   98  205:aload_0         
	//   99  206:aload_0         
	//  100  207:getfield        #166 <Field int c>
	//  101  210:i2f             
	//  102  211:fload_3         
	//  103  212:fsub            
	//  104  213:putfield        #187 <Field float e>
			f = (float)d - f6;
	//  105  216:aload_0         
	//  106  217:aload_0         
	//  107  218:getfield        #168 <Field int d>
	//  108  221:i2f             
	//  109  222:fload           4
	//  110  224:fsub            
	//  111  225:putfield        #189 <Field float f>
			g.setScale(f1, f2);
	//  112  228:aload_0         
	//  113  229:getfield        #84  <Field Matrix g>
	//  114  232:fload_1         
	//  115  233:fload_2         
	//  116  234:invokevirtual   #192 <Method void Matrix.setScale(float, float)>
			g.postTranslate(f4 / 2.0F, f6 / 2.0F);
	//  117  237:aload_0         
	//  118  238:getfield        #84  <Field Matrix g>
	//  119  241:fload_3         
	//  120  242:fconst_2        
	//  121  243:fdiv            
	//  122  244:fload           4
	//  123  246:fconst_2        
	//  124  247:fdiv            
	//  125  248:invokevirtual   #196 <Method boolean Matrix.postTranslate(float, float)>
	//  126  251:pop             
			b = 1.0F;
	//  127  252:aload_0         
	//  128  253:fconst_1        
	//  129  254:putfield        #136 <Field float b>
			setImageMatrix(g);
	//  130  257:aload_0         
	//  131  258:aload_0         
	//  132  259:getfield        #84  <Field Matrix g>
	//  133  262:invokevirtual   #200 <Method void setImageMatrix(Matrix)>
		}
	//  134  265:return          
	}

	private void b(float f1, float f2, float f3)
	{
		g.postRotate(f1, f2, f3);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Matrix g>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:invokevirtual   #204 <Method boolean Matrix.postRotate(float, float, float)>
	//    6   10:pop             
		if(t != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #143 <Field GestureImageView$d t>
	//*   9   15:ifnull          28
			t.a(f1);
	//   10   18:aload_0         
	//   11   19:getfield        #143 <Field GestureImageView$d t>
	//   12   22:fload_1         
	//   13   23:invokeinterface #206 <Method void GestureImageView$d.a(float)>
	//   14   28:return          
	}

	static boolean c(GestureImageView gestureimageview)
	{
		return gestureimageview.q;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field boolean q>
	//    2    4:ireturn         
	}

	static com.irobot.home.view.e d(GestureImageView gestureimageview)
	{
		return gestureimageview.l;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field e l>
	//    2    4:areturn         
	}

	static boolean e(GestureImageView gestureimageview)
	{
		return gestureimageview.s;
	//    0    0:aload_0         
	//    1    1:getfield        #213 <Field boolean s>
	//    2    4:ireturn         
	}

	static GestureDetector f(GestureImageView gestureimageview)
	{
		return gestureimageview.m;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field GestureDetector m>
	//    2    4:areturn         
	}

	static boolean g(GestureImageView gestureimageview)
	{
		return gestureimageview.r;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field boolean r>
	//    2    4:ireturn         
	}

	private float getImageHeight()
	{
		return f * b;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field float f>
	//    2    4:aload_0         
	//    3    5:getfield        #136 <Field float b>
	//    4    8:fmul            
	//    5    9:freturn         
	}

	private float getImageWidth()
	{
		return e * b;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field float e>
	//    2    4:aload_0         
	//    3    5:getfield        #136 <Field float b>
	//    4    8:fmul            
	//    5    9:freturn         
	}

	static g h(GestureImageView gestureimageview)
	{
		return gestureimageview.i;
	//    0    0:aload_0         
	//    1    1:getfield        #221 <Field GestureImageView$g i>
	//    2    4:areturn         
	}

	static Matrix i(GestureImageView gestureimageview)
	{
		return gestureimageview.g;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Matrix g>
	//    2    4:areturn         
	}

	static d j(GestureImageView gestureimageview)
	{
		return gestureimageview.t;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field GestureImageView$d t>
	//    2    4:areturn         
	}

	static android.view.GestureDetector.OnDoubleTapListener k(GestureImageView gestureimageview)
	{
		return gestureimageview.n;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field android.view.GestureDetector$OnDoubleTapListener n>
	//    2    4:areturn         
	}

	static float l(GestureImageView gestureimageview)
	{
		return gestureimageview.b;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field float b>
	//    2    4:freturn         
	}

	static a m(GestureImageView gestureimageview)
	{
		return gestureimageview.o;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field GestureImageView$a o>
	//    2    4:areturn         
	}

	static int n(GestureImageView gestureimageview)
	{
		return gestureimageview.c;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field int c>
	//    2    4:ireturn         
	}

	static int o(GestureImageView gestureimageview)
	{
		return gestureimageview.d;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field int d>
	//    2    4:ireturn         
	}

	private void setState(g g1)
	{
		i = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #221 <Field GestureImageView$g i>
	//    3    5:return          
	}

	public void a()
	{
		b = 1.0F;
	//    0    0:aload_0         
	//    1    1:fconst_1        
	//    2    2:putfield        #136 <Field float b>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #229 <Method void b()>
	//    5    9:return          
	}

	public void a(float f1, float f2, float f3)
	{
		a(f1, f2, f3, j);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:aload_0         
	//    5    5:getfield        #173 <Field android.widget.ImageView$ScaleType j>
	//    6    8:invokevirtual   #232 <Method void a(float, float, float, android.widget.ImageView$ScaleType)>
	//    7   11:return          
	}

	public void a(float f1, float f2, float f3, android.widget.ImageView.ScaleType scaletype)
	{
		if(scaletype != j)
	//*   0    0:aload           4
	//*   1    2:aload_0         
	//*   2    3:getfield        #173 <Field android.widget.ImageView$ScaleType j>
	//*   3    6:if_acmpeq       15
			setScaleType(scaletype);
	//    4    9:aload_0         
	//    5   10:aload           4
	//    6   12:invokevirtual   #236 <Method void setScaleType(android.widget.ImageView$ScaleType)>
		a();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #238 <Method void a()>
		a(f1, c / 2, d / 2);
	//    9   19:aload_0         
	//   10   20:fload_1         
	//   11   21:f2d             
	//   12   22:aload_0         
	//   13   23:getfield        #166 <Field int c>
	//   14   26:iconst_2        
	//   15   27:idiv            
	//   16   28:i2f             
	//   17   29:aload_0         
	//   18   30:getfield        #168 <Field int d>
	//   19   33:iconst_2        
	//   20   34:idiv            
	//   21   35:i2f             
	//   22   36:invokespecial   #149 <Method void a(double, float, float)>
		g.getValues(h);
	//   23   39:aload_0         
	//   24   40:getfield        #84  <Field Matrix g>
	//   25   43:aload_0         
	//   26   44:getfield        #86  <Field float[] h>
	//   27   47:invokevirtual   #92  <Method void Matrix.getValues(float[])>
		h[2] = -(f2 * getImageWidth() - (float)c * 0.5F);
	//   28   50:aload_0         
	//   29   51:getfield        #86  <Field float[] h>
	//   30   54:iconst_2        
	//   31   55:fload_2         
	//   32   56:aload_0         
	//   33   57:invokespecial   #111 <Method float getImageWidth()>
	//   34   60:fmul            
	//   35   61:aload_0         
	//   36   62:getfield        #166 <Field int c>
	//   37   65:i2f             
	//   38   66:ldc1            #239 <Float 0.5F>
	//   39   68:fmul            
	//   40   69:fsub            
	//   41   70:fneg            
	//   42   71:fastore         
		h[5] = -(f3 * getImageHeight() - (float)d * 0.5F);
	//   43   72:aload_0         
	//   44   73:getfield        #86  <Field float[] h>
	//   45   76:iconst_5        
	//   46   77:fload_3         
	//   47   78:aload_0         
	//   48   79:invokespecial   #114 <Method float getImageHeight()>
	//   49   82:fmul            
	//   50   83:aload_0         
	//   51   84:getfield        #168 <Field int d>
	//   52   87:i2f             
	//   53   88:ldc1            #239 <Float 0.5F>
	//   54   90:fmul            
	//   55   91:fsub            
	//   56   92:fneg            
	//   57   93:fastore         
		g.setValues(h);
	//   58   94:aload_0         
	//   59   95:getfield        #84  <Field Matrix g>
	//   60   98:aload_0         
	//   61   99:getfield        #86  <Field float[] h>
	//   62  102:invokevirtual   #242 <Method void Matrix.setValues(float[])>
		setImageMatrix(g);
	//   63  105:aload_0         
	//   64  106:aload_0         
	//   65  107:getfield        #84  <Field Matrix g>
	//   66  110:invokevirtual   #200 <Method void setImageMatrix(Matrix)>
	//   67  113:return          
	}

	protected void a(Context context, AttributeSet attributeset, int i1)
	{
		attributeset = ((AttributeSet) (context.getTheme().obtainStyledAttributes(attributeset, com.irobot.home.g.a.GestureImageView, 0, 0)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #248 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:getstatic       #252 <Field int[] com.irobot.home.g$a.GestureImageView>
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #258 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    7   13:astore_2        
		p = ((TypedArray) (attributeset)).getBoolean(3, true);
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:iconst_3        
	//   11   17:iconst_1        
	//   12   18:invokevirtual   #264 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   13   21:putfield        #161 <Field boolean p>
		q = ((TypedArray) (attributeset)).getBoolean(1, true);
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:iconst_1        
	//   17   27:iconst_1        
	//   18   28:invokevirtual   #264 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   19   31:putfield        #208 <Field boolean q>
		r = ((TypedArray) (attributeset)).getBoolean(0, true);
	//   20   34:aload_0         
	//   21   35:aload_2         
	//   22   36:iconst_0        
	//   23   37:iconst_1        
	//   24   38:invokevirtual   #264 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   25   41:putfield        #218 <Field boolean r>
		s = ((TypedArray) (attributeset)).getBoolean(2, true);
	//   26   44:aload_0         
	//   27   45:aload_2         
	//   28   46:iconst_2        
	//   29   47:iconst_1        
	//   30   48:invokevirtual   #264 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   31   51:putfield        #213 <Field boolean s>
		((TypedArray) (attributeset)).recycle();
	//   32   54:aload_2         
	//   33   55:invokevirtual   #267 <Method void TypedArray.recycle()>
		super.setClickable(true);
	//   34   58:aload_0         
	//   35   59:iconst_1        
	//   36   60:invokespecial   #271 <Method void ImageView.setClickable(boolean)>
		k = new ScaleGestureDetector(context, ((android.view.ScaleGestureDetector.OnScaleGestureListener) (new f(((_cls1) (null))))));
	//   37   63:aload_0         
	//   38   64:new             #273 <Class ScaleGestureDetector>
	//   39   67:dup             
	//   40   68:aload_1         
	//   41   69:new             #23  <Class GestureImageView$f>
	//   42   72:dup             
	//   43   73:aload_0         
	//   44   74:aconst_null     
	//   45   75:invokespecial   #276 <Method void GestureImageView$f(GestureImageView, GestureImageView$1)>
	//   46   78:invokespecial   #279 <Method void ScaleGestureDetector(Context, android.view.ScaleGestureDetector$OnScaleGestureListener)>
	//   47   81:putfield        #164 <Field ScaleGestureDetector k>
		l = new com.irobot.home.view.e(context, ((e.a) (new e(((_cls1) (null))))));
	//   48   84:aload_0         
	//   49   85:new             #281 <Class e>
	//   50   88:dup             
	//   51   89:aload_1         
	//   52   90:new             #20  <Class GestureImageView$e>
	//   53   93:dup             
	//   54   94:aload_0         
	//   55   95:aconst_null     
	//   56   96:invokespecial   #282 <Method void GestureImageView$e(GestureImageView, GestureImageView$1)>
	//   57   99:invokespecial   #285 <Method void e(Context, e$a)>
	//   58  102:putfield        #211 <Field e l>
		m = new GestureDetector(context, ((android.view.GestureDetector.OnGestureListener) (new b(((_cls1) (null))))));
	//   59  105:aload_0         
	//   60  106:new             #287 <Class GestureDetector>
	//   61  109:dup             
	//   62  110:aload_1         
	//   63  111:new             #11  <Class GestureImageView$b>
	//   64  114:dup             
	//   65  115:aload_0         
	//   66  116:aconst_null     
	//   67  117:invokespecial   #288 <Method void GestureImageView$b(GestureImageView, GestureImageView$1)>
	//   68  120:invokespecial   #291 <Method void GestureDetector(Context, android.view.GestureDetector$OnGestureListener)>
	//   69  123:putfield        #216 <Field GestureDetector m>
		g = new Matrix();
	//   70  126:aload_0         
	//   71  127:new             #88  <Class Matrix>
	//   72  130:dup             
	//   73  131:invokespecial   #293 <Method void Matrix()>
	//   74  134:putfield        #84  <Field Matrix g>
		h = new float[9];
	//   75  137:aload_0         
	//   76  138:bipush          9
	//   77  140:newarray        float[]
	//   78  142:putfield        #86  <Field float[] h>
		b = 1.0F;
	//   79  145:aload_0         
	//   80  146:fconst_1        
	//   81  147:putfield        #136 <Field float b>
		if(j == null)
	//*  82  150:aload_0         
	//*  83  151:getfield        #173 <Field android.widget.ImageView$ScaleType j>
	//*  84  154:ifnonnull       164
			j = android.widget.ImageView.ScaleType.FIT_CENTER;
	//   85  157:aload_0         
	//   86  158:getstatic       #296 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   87  161:putfield        #173 <Field android.widget.ImageView$ScaleType j>
		setImageMatrix(g);
	//   88  164:aload_0         
	//   89  165:aload_0         
	//   90  166:getfield        #84  <Field Matrix g>
	//   91  169:invokevirtual   #200 <Method void setImageMatrix(Matrix)>
		setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//   92  172:aload_0         
	//   93  173:getstatic       #299 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//   94  176:invokevirtual   #236 <Method void setScaleType(android.widget.ImageView$ScaleType)>
		setState(g.NONE);
	//   95  179:aload_0         
	//   96  180:getstatic       #302 <Field GestureImageView$g GestureImageView$g.NONE>
	//   97  183:invokespecial   #158 <Method void setState(GestureImageView$g)>
		super.setOnTouchListener(((android.view.View.OnTouchListener) (new c(((_cls1) (null))))));
	//   98  186:aload_0         
	//   99  187:new             #14  <Class GestureImageView$c>
	//  100  190:dup             
	//  101  191:aload_0         
	//  102  192:aconst_null     
	//  103  193:invokespecial   #303 <Method void GestureImageView$c(GestureImageView, GestureImageView$1)>
	//  104  196:invokespecial   #307 <Method void ImageView.setOnTouchListener(android.view.View$OnTouchListener)>
		return;
	//  105  199:return          
		context;
	//  106  200:astore_1        
		((TypedArray) (attributeset)).recycle();
	//  107  201:aload_2         
	//  108  202:invokevirtual   #267 <Method void TypedArray.recycle()>
		throw context;
	//  109  205:aload_1         
	//  110  206:athrow          
	}

	protected void onMeasure(int i1, int j1)
	{
		Drawable drawable = getDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method Drawable getDrawable()>
	//    2    4:astore          7
		if(drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0)
	//*   3    6:aload           7
	//*   4    8:ifnull          107
	//*   5   11:aload           7
	//*   6   13:invokevirtual   #102 <Method int Drawable.getIntrinsicWidth()>
	//*   7   16:ifeq            107
	//*   8   19:aload           7
	//*   9   21:invokevirtual   #105 <Method int Drawable.getIntrinsicHeight()>
	//*  10   24:ifne            30
	//*  11   27:goto            107
		{
			int k1 = drawable.getIntrinsicWidth();
	//   12   30:aload           7
	//   13   32:invokevirtual   #102 <Method int Drawable.getIntrinsicWidth()>
	//   14   35:istore_3        
			int l1 = drawable.getIntrinsicHeight();
	//   15   36:aload           7
	//   16   38:invokevirtual   #105 <Method int Drawable.getIntrinsicHeight()>
	//   17   41:istore          4
			int i2 = android.view.View.MeasureSpec.getSize(i1);
	//   18   43:iload_1         
	//   19   44:invokestatic    #315 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   20   47:istore          5
			i1 = android.view.View.MeasureSpec.getMode(i1);
	//   21   49:iload_1         
	//   22   50:invokestatic    #318 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   53:istore_1        
			int j2 = android.view.View.MeasureSpec.getSize(j1);
	//   24   54:iload_2         
	//   25   55:invokestatic    #315 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   26   58:istore          6
			j1 = android.view.View.MeasureSpec.getMode(j1);
	//   27   60:iload_2         
	//   28   61:invokestatic    #318 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   29   64:istore_2        
			c = a(i1, i2, k1);
	//   30   65:aload_0         
	//   31   66:aload_0         
	//   32   67:iload_1         
	//   33   68:iload           5
	//   34   70:iload_3         
	//   35   71:invokespecial   #320 <Method int a(int, int, int)>
	//   36   74:putfield        #166 <Field int c>
			d = a(j1, j2, l1);
	//   37   77:aload_0         
	//   38   78:aload_0         
	//   39   79:iload_2         
	//   40   80:iload           6
	//   41   82:iload           4
	//   42   84:invokespecial   #320 <Method int a(int, int, int)>
	//   43   87:putfield        #168 <Field int d>
			setMeasuredDimension(c, d);
	//   44   90:aload_0         
	//   45   91:aload_0         
	//   46   92:getfield        #166 <Field int c>
	//   47   95:aload_0         
	//   48   96:getfield        #168 <Field int d>
	//   49   99:invokevirtual   #323 <Method void setMeasuredDimension(int, int)>
			b();
	//   50  102:aload_0         
	//   51  103:invokespecial   #229 <Method void b()>
			return;
	//   52  106:return          
		} else
		{
			setMeasuredDimension(0, 0);
	//   53  107:aload_0         
	//   54  108:iconst_0        
	//   55  109:iconst_0        
	//   56  110:invokevirtual   #323 <Method void setMeasuredDimension(int, int)>
			return;
	//   57  113:return          
		}
	}

	public void setAllowDrag(boolean flag)
	{
		r = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #218 <Field boolean r>
	//    3    5:return          
	}

	public void setAllowRotate(boolean flag)
	{
		q = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #208 <Field boolean q>
	//    3    5:return          
	}

	public void setAllowTap(boolean flag)
	{
		s = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #213 <Field boolean s>
	//    3    5:return          
	}

	public void setAllowZoom(boolean flag)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #161 <Field boolean p>
	//    3    5:return          
	}

	public void setImageBitmap(Bitmap bitmap)
	{
		super.setImageBitmap(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #331 <Method void ImageView.setImageBitmap(Bitmap)>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #229 <Method void b()>
	//    5    9:return          
	}

	public void setImageDrawable(Drawable drawable)
	{
		super.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #335 <Method void ImageView.setImageDrawable(Drawable)>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #229 <Method void b()>
	//    5    9:return          
	}

	public void setImageResource(int i1)
	{
		super.setImageResource(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #339 <Method void ImageView.setImageResource(int)>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #229 <Method void b()>
	//    5    9:return          
	}

	public void setImageURI(Uri uri)
	{
		super.setImageURI(uri);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #343 <Method void ImageView.setImageURI(Uri)>
		b();
	//    3    5:aload_0         
	//    4    6:invokespecial   #229 <Method void b()>
	//    5    9:return          
	}

	public void setOnViewManipulatedListener(d d1)
	{
		t = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #143 <Field GestureImageView$d t>
	//    3    5:return          
	}

	public void setZoom(float f1)
	{
		a(f1, 0.5F, 0.5F);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc1            #239 <Float 0.5F>
	//    3    4:ldc1            #239 <Float 0.5F>
	//    4    6:invokevirtual   #348 <Method void a(float, float, float)>
	//    5    9:return          
	}

	private static final String a = "GestureImageView";
	private float b;
	private int c;
	private int d;
	private float e;
	private float f;
	private Matrix g;
	private float h[];
	private g i;
	private android.widget.ImageView.ScaleType j;
	private ScaleGestureDetector k;
	private com.irobot.home.view.e l;
	private GestureDetector m;
	private android.view.GestureDetector.OnDoubleTapListener n;
	private a o;
	private boolean p;
	private boolean q;
	private boolean r;
	private boolean s;
	private d t;

	static 
	{
	//    0    0:return          
	}
}
