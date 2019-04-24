// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

// Referenced classes of package o:
//			ks, kr, kq, ku, 
//			kw, kt, kp, ko, 
//			km

public class kx
	implements android.view.View.OnTouchListener, ks, android.view.View.OnLayoutChangeListener
{
	class c
		implements Runnable
	{

		public void a(int i1, int j1, int k1, int l1)
		{
			RectF rectf = a.a();
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field kx a>
		//    2    4:invokevirtual   #34  <Method RectF kx.a()>
		//    3    7:astore          10
			if(rectf == null)
		//*   4    9:aload           10
		//*   5   11:ifnonnull       15
				return;
		//    6   14:return          
			int i2 = Math.round(-rectf.left);
		//    7   15:aload           10
		//    8   17:getfield        #40  <Field float RectF.left>
		//    9   20:fneg            
		//   10   21:invokestatic    #46  <Method int Math.round(float)>
		//   11   24:istore          5
			int j2;
			if((float)i1 < rectf.width())
		//*  12   26:iload_1         
		//*  13   27:i2f             
		//*  14   28:aload           10
		//*  15   30:invokevirtual   #50  <Method float RectF.width()>
		//*  16   33:fcmpg           
		//*  17   34:ifge            63
			{
				j2 = 0;
		//   18   37:iconst_0        
		//   19   38:istore          6
				int k2 = Math.round(rectf.width() - (float)i1);
		//   20   40:aload           10
		//   21   42:invokevirtual   #50  <Method float RectF.width()>
		//   22   45:iload_1         
		//   23   46:i2f             
		//   24   47:fsub            
		//   25   48:invokestatic    #46  <Method int Math.round(float)>
		//   26   51:istore          7
				i1 = j2;
		//   27   53:iload           6
		//   28   55:istore_1        
				j2 = k2;
		//   29   56:iload           7
		//   30   58:istore          6
			} else
		//*  31   60:goto            70
			{
				j2 = i2;
		//   32   63:iload           5
		//   33   65:istore          6
				i1 = i2;
		//   34   67:iload           5
		//   35   69:istore_1        
			}
			int l2 = Math.round(-rectf.top);
		//   36   70:aload           10
		//   37   72:getfield        #53  <Field float RectF.top>
		//   38   75:fneg            
		//   39   76:invokestatic    #46  <Method int Math.round(float)>
		//   40   79:istore          7
			int i3;
			if((float)j1 < rectf.height())
		//*  41   81:iload_2         
		//*  42   82:i2f             
		//*  43   83:aload           10
		//*  44   85:invokevirtual   #56  <Method float RectF.height()>
		//*  45   88:fcmpg           
		//*  46   89:ifge            118
			{
				i3 = 0;
		//   47   92:iconst_0        
		//   48   93:istore          8
				int j3 = Math.round(rectf.height() - (float)j1);
		//   49   95:aload           10
		//   50   97:invokevirtual   #56  <Method float RectF.height()>
		//   51  100:iload_2         
		//   52  101:i2f             
		//   53  102:fsub            
		//   54  103:invokestatic    #46  <Method int Math.round(float)>
		//   55  106:istore          9
				j1 = i3;
		//   56  108:iload           8
		//   57  110:istore_2        
				i3 = j3;
		//   58  111:iload           9
		//   59  113:istore          8
			} else
		//*  60  115:goto            125
			{
				i3 = l2;
		//   61  118:iload           7
		//   62  120:istore          8
				j1 = l2;
		//   63  122:iload           7
		//   64  124:istore_2        
			}
			c = i2;
		//   65  125:aload_0         
		//   66  126:iload           5
		//   67  128:putfield        #58  <Field int c>
			b = l2;
		//   68  131:aload_0         
		//   69  132:iload           7
		//   70  134:putfield        #60  <Field int b>
			if(i2 != j2 || l2 != i3)
		//*  71  137:iload           5
		//*  72  139:iload           6
		//*  73  141:icmpne          151
		//*  74  144:iload           7
		//*  75  146:iload           8
		//*  76  148:icmpeq          173
				e.fling(i2, l2, k1, l1, i1, j2, j1, i3, 0, 0);
		//   77  151:aload_0         
		//   78  152:getfield        #29  <Field OverScroller e>
		//   79  155:iload           5
		//   80  157:iload           7
		//   81  159:iload_3         
		//   82  160:iload           4
		//   83  162:iload_1         
		//   84  163:iload           6
		//   85  165:iload_2         
		//   86  166:iload           8
		//   87  168:iconst_0        
		//   88  169:iconst_0        
		//   89  170:invokevirtual   #64  <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
		//   90  173:return          
		}

		public void e()
		{
			e.forceFinished(true);
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field OverScroller e>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #68  <Method void OverScroller.forceFinished(boolean)>
		//    4    8:return          
		}

		public void run()
		{
			if(e.isFinished())
		//*   0    0:aload_0         
		//*   1    1:getfield        #29  <Field OverScroller e>
		//*   2    4:invokevirtual   #73  <Method boolean OverScroller.isFinished()>
		//*   3    7:ifeq            11
				return;
		//    4   10:return          
			if(e.computeScrollOffset())
		//*   5   11:aload_0         
		//*   6   12:getfield        #29  <Field OverScroller e>
		//*   7   15:invokevirtual   #76  <Method boolean OverScroller.computeScrollOffset()>
		//*   8   18:ifeq            97
			{
				int i1 = e.getCurrX();
		//    9   21:aload_0         
		//   10   22:getfield        #29  <Field OverScroller e>
		//   11   25:invokevirtual   #80  <Method int OverScroller.getCurrX()>
		//   12   28:istore_1        
				int j1 = e.getCurrY();
		//   13   29:aload_0         
		//   14   30:getfield        #29  <Field OverScroller e>
		//   15   33:invokevirtual   #83  <Method int OverScroller.getCurrY()>
		//   16   36:istore_2        
				kx.h(a).postTranslate(c - i1, b - j1);
		//   17   37:aload_0         
		//   18   38:getfield        #19  <Field kx a>
		//   19   41:invokestatic    #87  <Method Matrix kx.h(kx)>
		//   20   44:aload_0         
		//   21   45:getfield        #58  <Field int c>
		//   22   48:iload_1         
		//   23   49:isub            
		//   24   50:i2f             
		//   25   51:aload_0         
		//   26   52:getfield        #60  <Field int b>
		//   27   55:iload_2         
		//   28   56:isub            
		//   29   57:i2f             
		//   30   58:invokevirtual   #93  <Method boolean Matrix.postTranslate(float, float)>
		//   31   61:pop             
				kx.c(a, kx.f(a));
		//   32   62:aload_0         
		//   33   63:getfield        #19  <Field kx a>
		//   34   66:aload_0         
		//   35   67:getfield        #19  <Field kx a>
		//   36   70:invokestatic    #96  <Method Matrix kx.f(kx)>
		//   37   73:invokestatic    #99  <Method void kx.c(kx, Matrix)>
				c = i1;
		//   38   76:aload_0         
		//   39   77:iload_1         
		//   40   78:putfield        #58  <Field int c>
				b = j1;
		//   41   81:aload_0         
		//   42   82:iload_2         
		//   43   83:putfield        #60  <Field int b>
				km.a(((View) (kx.c(a))), ((Runnable) (this)));
		//   44   86:aload_0         
		//   45   87:getfield        #19  <Field kx a>
		//   46   90:invokestatic    #102 <Method ImageView kx.c(kx)>
		//   47   93:aload_0         
		//   48   94:invokestatic    #107 <Method void km.a(View, Runnable)>
			}
		//   49   97:return          
		}

		final kx a;
		private int b;
		private int c;
		private final OverScroller e;

		public c(Context context)
		{
			a = kx.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field kx a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			e = new OverScroller(context);
		//    5    9:aload_0         
		//    6   10:new             #24  <Class OverScroller>
		//    7   13:dup             
		//    8   14:aload_2         
		//    9   15:invokespecial   #27  <Method void OverScroller(Context)>
		//   10   18:putfield        #29  <Field OverScroller e>
		//   11   21:return          
		}
	}

	class d
		implements Runnable
	{

		private float b()
		{
			float f1 = Math.min(1.0F, ((float)(System.currentTimeMillis() - b) * 1.0F) / (float)kx.i(e));
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
			return kx.k(e).getInterpolation(f1);
		//   15   25:aload_0         
		//   16   26:getfield        #21  <Field kx e>
		//   17   29:invokestatic    #55  <Method Interpolator kx.k(kx)>
		//   18   32:fload_1         
		//   19   33:invokeinterface #61  <Method float Interpolator.getInterpolation(float)>
		//   20   38:freturn         
		}

		public void run()
		{
			float f1 = b();
		//    0    0:aload_0         
		//    1    1:invokespecial   #64  <Method float b()>
		//    2    4:fstore_1        
			float f2 = (a + (i - a) * f1) / e.b();
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
			e.d(f2, d, c);
		//   18   30:aload_0         
		//   19   31:getfield        #21  <Field kx e>
		//   20   34:fload_2         
		//   21   35:aload_0         
		//   22   36:getfield        #26  <Field float d>
		//   23   39:aload_0         
		//   24   40:getfield        #28  <Field float c>
		//   25   43:invokevirtual   #68  <Method void kx.d(float, float, float)>
			if(f1 < 1.0F)
		//*  26   46:fload_1         
		//*  27   47:fconst_1        
		//*  28   48:fcmpg           
		//*  29   49:ifge            63
				km.a(((View) (kx.c(e))), ((Runnable) (this)));
		//   30   52:aload_0         
		//   31   53:getfield        #21  <Field kx e>
		//   32   56:invokestatic    #71  <Method ImageView kx.c(kx)>
		//   33   59:aload_0         
		//   34   60:invokestatic    #76  <Method void km.a(View, Runnable)>
		//   35   63:return          
		}

		private final float a;
		private final long b = System.currentTimeMillis();
		private final float c;
		private final float d;
		final kx e;
		private final float i;

		public d(float f1, float f2, float f3, float f4)
		{
			e = kx.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field kx e>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
			d = f3;
		//    5    9:aload_0         
		//    6   10:fload           4
		//    7   12:putfield        #26  <Field float d>
			c = f4;
		//    8   15:aload_0         
		//    9   16:fload           5
		//   10   18:putfield        #28  <Field float c>
		//   11   21:aload_0         
		//   12   22:invokestatic    #34  <Method long System.currentTimeMillis()>
		//   13   25:putfield        #36  <Field long b>
			a = f1;
		//   14   28:aload_0         
		//   15   29:fload_2         
		//   16   30:putfield        #38  <Field float a>
			i = f2;
		//   17   33:aload_0         
		//   18   34:fload_3         
		//   19   35:putfield        #40  <Field float i>
		//   20   38:return          
		}
	}


	public kx(ImageView imageview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #89  <Method void Object()>
		k = ((Interpolator) (new AccelerateDecelerateInterpolator()));
	//    2    4:aload_0         
	//    3    5:new             #91  <Class AccelerateDecelerateInterpolator>
	//    4    8:dup             
	//    5    9:invokespecial   #92  <Method void AccelerateDecelerateInterpolator()>
	//    6   12:putfield        #94  <Field Interpolator k>
		g = c;
	//    7   15:aload_0         
	//    8   16:getstatic       #82  <Field int c>
	//    9   19:putfield        #96  <Field int g>
		f = d;
	//   10   22:aload_0         
	//   11   23:getstatic       #80  <Field float d>
	//   12   26:putfield        #98  <Field float f>
		h = e;
	//   13   29:aload_0         
	//   14   30:getstatic       #78  <Field float e>
	//   15   33:putfield        #100 <Field float h>
		i = b;
	//   16   36:aload_0         
	//   17   37:getstatic       #75  <Field float b>
	//   18   40:putfield        #102 <Field float i>
		p = true;
	//   19   43:aload_0         
	//   20   44:iconst_1        
	//   21   45:putfield        #104 <Field boolean p>
		n = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #106 <Field boolean n>
	//   25   53:aload_0         
	//   26   54:new             #108 <Class Matrix>
	//   27   57:dup             
	//   28   58:invokespecial   #109 <Method void Matrix()>
	//   29   61:putfield        #111 <Field Matrix u>
	//   30   64:aload_0         
	//   31   65:new             #108 <Class Matrix>
	//   32   68:dup             
	//   33   69:invokespecial   #109 <Method void Matrix()>
	//   34   72:putfield        #113 <Field Matrix r>
	//   35   75:aload_0         
	//   36   76:new             #108 <Class Matrix>
	//   37   79:dup             
	//   38   80:invokespecial   #109 <Method void Matrix()>
	//   39   83:putfield        #115 <Field Matrix q>
	//   40   86:aload_0         
	//   41   87:new             #117 <Class RectF>
	//   42   90:dup             
	//   43   91:invokespecial   #118 <Method void RectF()>
	//   44   94:putfield        #120 <Field RectF s>
	//   45   97:aload_0         
	//   46   98:bipush          9
	//   47  100:newarray        float[]
	//   48  102:putfield        #122 <Field float[] t>
		C = 2;
	//   49  105:aload_0         
	//   50  106:iconst_2        
	//   51  107:putfield        #124 <Field int C>
		E = true;
	//   52  110:aload_0         
	//   53  111:iconst_1        
	//   54  112:putfield        #126 <Field boolean E>
		I = android.widget.ImageView.ScaleType.FIT_CENTER;
	//   55  115:aload_0         
	//   56  116:getstatic       #131 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   57  119:putfield        #133 <Field android.widget.ImageView$ScaleType I>
		m = imageview;
	//   58  122:aload_0         
	//   59  123:aload_1         
	//   60  124:putfield        #135 <Field ImageView m>
		imageview.setOnTouchListener(((android.view.View.OnTouchListener) (this)));
	//   61  127:aload_1         
	//   62  128:aload_0         
	//   63  129:invokevirtual   #141 <Method void ImageView.setOnTouchListener(android.view.View$OnTouchListener)>
		imageview.addOnLayoutChangeListener(((android.view.View.OnLayoutChangeListener) (this)));
	//   64  132:aload_1         
	//   65  133:aload_0         
	//   66  134:invokevirtual   #145 <Method void ImageView.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
		if(imageview.isInEditMode())
	//*  67  137:aload_1         
	//*  68  138:invokevirtual   #149 <Method boolean ImageView.isInEditMode()>
	//*  69  141:ifeq            145
		{
			return;
	//   70  144:return          
		} else
		{
			A = 0.0F;
	//   71  145:aload_0         
	//   72  146:fconst_0        
	//   73  147:putfield        #151 <Field float A>
			l = new kr(imageview.getContext(), ((ks) (this)));
	//   74  150:aload_0         
	//   75  151:new             #153 <Class kr>
	//   76  154:dup             
	//   77  155:aload_1         
	//   78  156:invokevirtual   #157 <Method Context ImageView.getContext()>
	//   79  159:aload_0         
	//   80  160:invokespecial   #160 <Method void kr(Context, ks)>
	//   81  163:putfield        #162 <Field kr l>
			o = new GestureDetector(imageview.getContext(), ((android.view.GestureDetector.OnGestureListener) (new android.view.GestureDetector.SimpleOnGestureListener() {

				public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
				{
					if(kx.a(b) != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #14  <Field kx b>
				//*   2    4:invokestatic    #24  <Method kt kx.a(kx)>
				//*   3    7:ifnull          66
					{
						if(b.b() > kx.g())
				//*   4   10:aload_0         
				//*   5   11:getfield        #14  <Field kx b>
				//*   6   14:invokevirtual   #27  <Method float kx.b()>
				//*   7   17:invokestatic    #30  <Method float kx.g()>
				//*   8   20:fcmpl           
				//*   9   21:ifle            26
							return false;
				//   10   24:iconst_0        
				//   11   25:ireturn         
						if(MotionEventCompat.getPointerCount(motionevent) > kx.k() || MotionEventCompat.getPointerCount(motionevent1) > kx.k())
				//*  12   26:aload_1         
				//*  13   27:invokestatic    #36  <Method int MotionEventCompat.getPointerCount(MotionEvent)>
				//*  14   30:invokestatic    #40  <Method int kx.k()>
				//*  15   33:icmpgt          46
				//*  16   36:aload_2         
				//*  17   37:invokestatic    #36  <Method int MotionEventCompat.getPointerCount(MotionEvent)>
				//*  18   40:invokestatic    #40  <Method int kx.k()>
				//*  19   43:icmple          48
							return false;
				//   20   46:iconst_0        
				//   21   47:ireturn         
						else
							return kx.a(b).d(motionevent, motionevent1, f1, f2);
				//   22   48:aload_0         
				//   23   49:getfield        #14  <Field kx b>
				//   24   52:invokestatic    #24  <Method kt kx.a(kx)>
				//   25   55:aload_1         
				//   26   56:aload_2         
				//   27   57:fload_3         
				//   28   58:fload           4
				//   29   60:invokeinterface #45  <Method boolean kt.d(MotionEvent, MotionEvent, float, float)>
				//   30   65:ireturn         
					} else
					{
						return false;
				//   31   66:iconst_0        
				//   32   67:ireturn         
					}
				}

				public void onLongPress(MotionEvent motionevent)
				{
					if(kx.d(b) != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #14  <Field kx b>
				//*   2    4:invokestatic    #50  <Method android.view.View$OnLongClickListener kx.d(kx)>
				//*   3    7:ifnull          30
						kx.d(b).onLongClick(((View) (kx.c(b))));
				//    4   10:aload_0         
				//    5   11:getfield        #14  <Field kx b>
				//    6   14:invokestatic    #50  <Method android.view.View$OnLongClickListener kx.d(kx)>
				//    7   17:aload_0         
				//    8   18:getfield        #14  <Field kx b>
				//    9   21:invokestatic    #54  <Method ImageView kx.c(kx)>
				//   10   24:invokeinterface #60  <Method boolean android.view.View$OnLongClickListener.onLongClick(View)>
				//   11   29:pop             
				//   12   30:return          
				}

				final kx b;

			
			{
				b = kx.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field kx b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
			//    5    9:return          
			}
			}
)));
	//   82  166:aload_0         
	//   83  167:new             #164 <Class GestureDetector>
	//   84  170:dup             
	//   85  171:aload_1         
	//   86  172:invokevirtual   #157 <Method Context ImageView.getContext()>
	//   87  175:new             #14  <Class kx$3>
	//   88  178:dup             
	//   89  179:aload_0         
	//   90  180:invokespecial   #167 <Method void kx$3(kx)>
	//   91  183:invokespecial   #170 <Method void GestureDetector(Context, android.view.GestureDetector$OnGestureListener)>
	//   92  186:putfield        #172 <Field GestureDetector o>
			o.setOnDoubleTapListener(new android.view.GestureDetector.OnDoubleTapListener() {

				public boolean onDoubleTap(MotionEvent motionevent)
				{
					float f1;
					float f2;
					float f3;
					f1 = d.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field kx d>
				//    2    4:invokevirtual   #28  <Method float kx.b()>
				//    3    7:fstore_2        
					f2 = motionevent.getX();
				//    4    8:aload_1         
				//    5    9:invokevirtual   #33  <Method float MotionEvent.getX()>
				//    6   12:fstore_3        
					f3 = motionevent.getY();
				//    7   13:aload_1         
				//    8   14:invokevirtual   #36  <Method float MotionEvent.getY()>
				//    9   17:fstore          4
					if(f1 < d.e())
				//*  10   19:fload_2         
				//*  11   20:aload_0         
				//*  12   21:getfield        #16  <Field kx d>
				//*  13   24:invokevirtual   #39  <Method float kx.e()>
				//*  14   27:fcmpg           
				//*  15   28:ifge            52
					{
						d.d(d.e(), f2, f3, true);
				//   16   31:aload_0         
				//   17   32:getfield        #16  <Field kx d>
				//   18   35:aload_0         
				//   19   36:getfield        #16  <Field kx d>
				//   20   39:invokevirtual   #39  <Method float kx.e()>
				//   21   42:fload_3         
				//   22   43:fload           4
				//   23   45:iconst_1        
				//   24   46:invokevirtual   #42  <Method void kx.d(float, float, float, boolean)>
						break MISSING_BLOCK_LABEL_119;
				//   25   49:goto            115
					}
					if(f1 >= d.e() && f1 < d.d())
				//*  26   52:fload_2         
				//*  27   53:aload_0         
				//*  28   54:getfield        #16  <Field kx d>
				//*  29   57:invokevirtual   #39  <Method float kx.e()>
				//*  30   60:fcmpl           
				//*  31   61:iflt            97
				//*  32   64:fload_2         
				//*  33   65:aload_0         
				//*  34   66:getfield        #16  <Field kx d>
				//*  35   69:invokevirtual   #44  <Method float kx.d()>
				//*  36   72:fcmpg           
				//*  37   73:ifge            97
					{
						d.d(d.d(), f2, f3, true);
				//   38   76:aload_0         
				//   39   77:getfield        #16  <Field kx d>
				//   40   80:aload_0         
				//   41   81:getfield        #16  <Field kx d>
				//   42   84:invokevirtual   #44  <Method float kx.d()>
				//   43   87:fload_3         
				//   44   88:fload           4
				//   45   90:iconst_1        
				//   46   91:invokevirtual   #42  <Method void kx.d(float, float, float, boolean)>
						break MISSING_BLOCK_LABEL_119;
				//   47   94:goto            115
					}
					try
					{
						d.d(d.c(), f2, f3, true);
				//   48   97:aload_0         
				//   49   98:getfield        #16  <Field kx d>
				//   50  101:aload_0         
				//   51  102:getfield        #16  <Field kx d>
				//   52  105:invokevirtual   #47  <Method float kx.c()>
				//   53  108:fload_3         
				//   54  109:fload           4
				//   55  111:iconst_1        
				//   56  112:invokevirtual   #42  <Method void kx.d(float, float, float, boolean)>
					}
				//*  57  115:goto            119
					// Misplaced declaration of an exception variable
					catch(MotionEvent motionevent) { }
				//   58  118:astore_1        
					return true;
				//   59  119:iconst_1        
				//   60  120:ireturn         
				}

				public boolean onDoubleTapEvent(MotionEvent motionevent)
				{
					return false;
				//    0    0:iconst_0        
				//    1    1:ireturn         
				}

				public boolean onSingleTapConfirmed(MotionEvent motionevent)
				{
					if(kx.b(d) != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #16  <Field kx d>
				//*   2    4:invokestatic    #52  <Method android.view.View$OnClickListener kx.b(kx)>
				//*   3    7:ifnull          29
						kx.b(d).onClick(((View) (kx.c(d))));
				//    4   10:aload_0         
				//    5   11:getfield        #16  <Field kx d>
				//    6   14:invokestatic    #52  <Method android.view.View$OnClickListener kx.b(kx)>
				//    7   17:aload_0         
				//    8   18:getfield        #16  <Field kx d>
				//    9   21:invokestatic    #55  <Method ImageView kx.c(kx)>
				//   10   24:invokeinterface #61  <Method void android.view.View$OnClickListener.onClick(View)>
					RectF rectf = d.a();
				//   11   29:aload_0         
				//   12   30:getfield        #16  <Field kx d>
				//   13   33:invokevirtual   #65  <Method RectF kx.a()>
				//   14   36:astore          4
					if(rectf != null)
				//*  15   38:aload           4
				//*  16   40:ifnull          153
					{
						float f2 = motionevent.getX();
				//   17   43:aload_1         
				//   18   44:invokevirtual   #33  <Method float MotionEvent.getX()>
				//   19   47:fstore_3        
						float f1 = motionevent.getY();
				//   20   48:aload_1         
				//   21   49:invokevirtual   #36  <Method float MotionEvent.getY()>
				//   22   52:fstore_2        
						if(rectf.contains(f2, f1))
				//*  23   53:aload           4
				//*  24   55:fload_3         
				//*  25   56:fload_2         
				//*  26   57:invokevirtual   #71  <Method boolean RectF.contains(float, float)>
				//*  27   60:ifeq            124
						{
							f2 = (f2 - rectf.left) / rectf.width();
				//   28   63:fload_3         
				//   29   64:aload           4
				//   30   66:getfield        #75  <Field float RectF.left>
				//   31   69:fsub            
				//   32   70:aload           4
				//   33   72:invokevirtual   #78  <Method float RectF.width()>
				//   34   75:fdiv            
				//   35   76:fstore_3        
							f1 = (f1 - rectf.top) / rectf.height();
				//   36   77:fload_2         
				//   37   78:aload           4
				//   38   80:getfield        #81  <Field float RectF.top>
				//   39   83:fsub            
				//   40   84:aload           4
				//   41   86:invokevirtual   #84  <Method float RectF.height()>
				//   42   89:fdiv            
				//   43   90:fstore_2        
							if(kx.e(d) != null)
				//*  44   91:aload_0         
				//*  45   92:getfield        #16  <Field kx d>
				//*  46   95:invokestatic    #87  <Method ko kx.e(kx)>
				//*  47   98:ifnull          122
								kx.e(d).e(kx.c(d), f2, f1);
				//   48  101:aload_0         
				//   49  102:getfield        #16  <Field kx d>
				//   50  105:invokestatic    #87  <Method ko kx.e(kx)>
				//   51  108:aload_0         
				//   52  109:getfield        #16  <Field kx d>
				//   53  112:invokestatic    #55  <Method ImageView kx.c(kx)>
				//   54  115:fload_3         
				//   55  116:fload_2         
				//   56  117:invokeinterface #92  <Method void ko.e(ImageView, float, float)>
							return true;
				//   57  122:iconst_1        
				//   58  123:ireturn         
						}
						if(kx.g(d) != null)
				//*  59  124:aload_0         
				//*  60  125:getfield        #16  <Field kx d>
				//*  61  128:invokestatic    #96  <Method kp kx.g(kx)>
				//*  62  131:ifnull          153
							kx.g(d).d(kx.c(d));
				//   63  134:aload_0         
				//   64  135:getfield        #16  <Field kx d>
				//   65  138:invokestatic    #96  <Method kp kx.g(kx)>
				//   66  141:aload_0         
				//   67  142:getfield        #16  <Field kx d>
				//   68  145:invokestatic    #55  <Method ImageView kx.c(kx)>
				//   69  148:invokeinterface #100 <Method void kp.d(ImageView)>
					}
					return false;
				//   70  153:iconst_0        
				//   71  154:ireturn         
				}

				final kx d;

			
			{
				d = kx.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field kx d>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   93  189:aload_0         
	//   94  190:getfield        #172 <Field GestureDetector o>
	//   95  193:new             #12  <Class kx$2>
	//   96  196:dup             
	//   97  197:aload_0         
	//   98  198:invokespecial   #173 <Method void kx$2(kx)>
	//   99  201:invokevirtual   #177 <Method void GestureDetector.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
			return;
	//  100  204:return          
		}
	}

	static kt a(kx kx1)
	{
		return kx1.j;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field kt j>
	//    2    4:areturn         
	}

	private int b(ImageView imageview)
	{
		return imageview.getWidth() - imageview.getPaddingLeft() - imageview.getPaddingRight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #185 <Method int ImageView.getWidth()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #188 <Method int ImageView.getPaddingLeft()>
	//    4    8:isub            
	//    5    9:aload_1         
	//    6   10:invokevirtual   #191 <Method int ImageView.getPaddingRight()>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	static android.view.View.OnClickListener b(kx kx1)
	{
		return kx1.y;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field android.view.View$OnClickListener y>
	//    2    4:areturn         
	}

	private void b(Drawable drawable)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		float f1 = b(m);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #135 <Field ImageView m>
	//    6   10:invokespecial   #197 <Method int b(ImageView)>
	//    7   13:i2f             
	//    8   14:fstore_2        
		float f2 = d(m);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #135 <Field ImageView m>
	//   12   20:invokespecial   #199 <Method int d(ImageView)>
	//   13   23:i2f             
	//   14   24:fstore_3        
		int i1 = drawable.getIntrinsicWidth();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #204 <Method int Drawable.getIntrinsicWidth()>
	//   17   29:istore          6
		int j1 = drawable.getIntrinsicHeight();
	//   18   31:aload_1         
	//   19   32:invokevirtual   #207 <Method int Drawable.getIntrinsicHeight()>
	//   20   35:istore          7
		u.reset();
	//   21   37:aload_0         
	//   22   38:getfield        #111 <Field Matrix u>
	//   23   41:invokevirtual   #210 <Method void Matrix.reset()>
		float f3 = f1 / (float)i1;
	//   24   44:fload_2         
	//   25   45:iload           6
	//   26   47:i2f             
	//   27   48:fdiv            
	//   28   49:fstore          4
		float f4 = f2 / (float)j1;
	//   29   51:fload_3         
	//   30   52:iload           7
	//   31   54:i2f             
	//   32   55:fdiv            
	//   33   56:fstore          5
		if(I == android.widget.ImageView.ScaleType.CENTER)
	//*  34   58:aload_0         
	//*  35   59:getfield        #133 <Field android.widget.ImageView$ScaleType I>
	//*  36   62:getstatic       #213 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
	//*  37   65:if_acmpne       93
			u.postTranslate((f1 - (float)i1) / 2.0F, (f2 - (float)j1) / 2.0F);
	//   38   68:aload_0         
	//   39   69:getfield        #111 <Field Matrix u>
	//   40   72:fload_2         
	//   41   73:iload           6
	//   42   75:i2f             
	//   43   76:fsub            
	//   44   77:fconst_2        
	//   45   78:fdiv            
	//   46   79:fload_3         
	//   47   80:iload           7
	//   48   82:i2f             
	//   49   83:fsub            
	//   50   84:fconst_2        
	//   51   85:fdiv            
	//   52   86:invokevirtual   #217 <Method boolean Matrix.postTranslate(float, float)>
	//   53   89:pop             
		else
	//*  54   90:goto            388
		if(I == android.widget.ImageView.ScaleType.CENTER_CROP)
	//*  55   93:aload_0         
	//*  56   94:getfield        #133 <Field android.widget.ImageView$ScaleType I>
	//*  57   97:getstatic       #220 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//*  58  100:if_acmpne       155
		{
			f3 = Math.max(f3, f4);
	//   59  103:fload           4
	//   60  105:fload           5
	//   61  107:invokestatic    #226 <Method float Math.max(float, float)>
	//   62  110:fstore          4
			u.postScale(f3, f3);
	//   63  112:aload_0         
	//   64  113:getfield        #111 <Field Matrix u>
	//   65  116:fload           4
	//   66  118:fload           4
	//   67  120:invokevirtual   #229 <Method boolean Matrix.postScale(float, float)>
	//   68  123:pop             
			u.postTranslate((f1 - (float)i1 * f3) / 2.0F, (f2 - (float)j1 * f3) / 2.0F);
	//   69  124:aload_0         
	//   70  125:getfield        #111 <Field Matrix u>
	//   71  128:fload_2         
	//   72  129:iload           6
	//   73  131:i2f             
	//   74  132:fload           4
	//   75  134:fmul            
	//   76  135:fsub            
	//   77  136:fconst_2        
	//   78  137:fdiv            
	//   79  138:fload_3         
	//   80  139:iload           7
	//   81  141:i2f             
	//   82  142:fload           4
	//   83  144:fmul            
	//   84  145:fsub            
	//   85  146:fconst_2        
	//   86  147:fdiv            
	//   87  148:invokevirtual   #217 <Method boolean Matrix.postTranslate(float, float)>
	//   88  151:pop             
		} else
	//*  89  152:goto            388
		if(I == android.widget.ImageView.ScaleType.CENTER_INSIDE)
	//*  90  155:aload_0         
	//*  91  156:getfield        #133 <Field android.widget.ImageView$ScaleType I>
	//*  92  159:getstatic       #232 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//*  93  162:if_acmpne       221
		{
			f3 = Math.min(1.0F, Math.min(f3, f4));
	//   94  165:fconst_1        
	//   95  166:fload           4
	//   96  168:fload           5
	//   97  170:invokestatic    #235 <Method float Math.min(float, float)>
	//   98  173:invokestatic    #235 <Method float Math.min(float, float)>
	//   99  176:fstore          4
			u.postScale(f3, f3);
	//  100  178:aload_0         
	//  101  179:getfield        #111 <Field Matrix u>
	//  102  182:fload           4
	//  103  184:fload           4
	//  104  186:invokevirtual   #229 <Method boolean Matrix.postScale(float, float)>
	//  105  189:pop             
			u.postTranslate((f1 - (float)i1 * f3) / 2.0F, (f2 - (float)j1 * f3) / 2.0F);
	//  106  190:aload_0         
	//  107  191:getfield        #111 <Field Matrix u>
	//  108  194:fload_2         
	//  109  195:iload           6
	//  110  197:i2f             
	//  111  198:fload           4
	//  112  200:fmul            
	//  113  201:fsub            
	//  114  202:fconst_2        
	//  115  203:fdiv            
	//  116  204:fload_3         
	//  117  205:iload           7
	//  118  207:i2f             
	//  119  208:fload           4
	//  120  210:fmul            
	//  121  211:fsub            
	//  122  212:fconst_2        
	//  123  213:fdiv            
	//  124  214:invokevirtual   #217 <Method boolean Matrix.postTranslate(float, float)>
	//  125  217:pop             
		} else
	//* 126  218:goto            388
		{
			drawable = ((Drawable) (new RectF(0.0F, 0.0F, i1, j1)));
	//  127  221:new             #117 <Class RectF>
	//  128  224:dup             
	//  129  225:fconst_0        
	//  130  226:fconst_0        
	//  131  227:iload           6
	//  132  229:i2f             
	//  133  230:iload           7
	//  134  232:i2f             
	//  135  233:invokespecial   #238 <Method void RectF(float, float, float, float)>
	//  136  236:astore_1        
			RectF rectf = new RectF(0.0F, 0.0F, f1, f2);
	//  137  237:new             #117 <Class RectF>
	//  138  240:dup             
	//  139  241:fconst_0        
	//  140  242:fconst_0        
	//  141  243:fload_2         
	//  142  244:fload_3         
	//  143  245:invokespecial   #238 <Method void RectF(float, float, float, float)>
	//  144  248:astore          8
			if((int)A % 180 != 0)
	//* 145  250:aload_0         
	//* 146  251:getfield        #151 <Field float A>
	//* 147  254:f2i             
	//* 148  255:sipush          180
	//* 149  258:irem            
	//* 150  259:ifeq            278
				drawable = ((Drawable) (new RectF(0.0F, 0.0F, j1, i1)));
	//  151  262:new             #117 <Class RectF>
	//  152  265:dup             
	//  153  266:fconst_0        
	//  154  267:fconst_0        
	//  155  268:iload           7
	//  156  270:i2f             
	//  157  271:iload           6
	//  158  273:i2f             
	//  159  274:invokespecial   #238 <Method void RectF(float, float, float, float)>
	//  160  277:astore_1        
			static class _cls5
			{

				static final int d[];

				static 
				{
					d = new int[android.widget.ImageView.ScaleType.values().length];
				//    0    0:invokestatic    #18  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] d>
					try
					{
						d[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] d>
				//    5   12:getstatic       #24  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
				//    6   15:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:goto            24
					catch(NoSuchFieldError nosuchfielderror) { }
				//   10   23:astore_0        
					try
					{
						d[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 2;
				//   11   24:getstatic       #20  <Field int[] d>
				//   12   27:getstatic       #31  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_START>
				//   13   30:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
				//   14   33:iconst_2        
				//   15   34:iastore         
					}
				//*  16   35:goto            39
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   17   38:astore_0        
					try
					{
						d[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 3;
				//   18   39:getstatic       #20  <Field int[] d>
				//   19   42:getstatic       #34  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_END>
				//   20   45:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
				//   21   48:iconst_3        
				//   22   49:iastore         
					}
				//*  23   50:goto            54
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   24   53:astore_0        
					try
					{
						d[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 4;
				//   25   54:getstatic       #20  <Field int[] d>
				//   26   57:getstatic       #37  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
				//   27   60:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
				//   28   63:iconst_4        
				//   29   64:iastore         
				//   30   65:return          
					}
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   31   66:astore_0        
				//*  32   67:return          
				}
			}

			switch(_cls5.d[I.ordinal()])
	//* 161  278:getstatic       #241 <Field int[] kx$5.d>
	//* 162  281:aload_0         
	//* 163  282:getfield        #133 <Field android.widget.ImageView$ScaleType I>
	//* 164  285:invokevirtual   #244 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//* 165  288:iaload          
			{
	//* 166  289:tableswitch     1 4: default 320
	//	               1 323
	//	               2 340
	//	               3 357
	//	               4 374
	//* 167  320:goto            388
			case 1: // '\001'
				u.setRectToRect(((RectF) (drawable)), rectf, android.graphics.Matrix.ScaleToFit.CENTER);
	//  168  323:aload_0         
	//  169  324:getfield        #111 <Field Matrix u>
	//  170  327:aload_1         
	//  171  328:aload           8
	//  172  330:getstatic       #249 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.CENTER>
	//  173  333:invokevirtual   #253 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//  174  336:pop             
				break;

	//* 175  337:goto            388
			case 2: // '\002'
				u.setRectToRect(((RectF) (drawable)), rectf, android.graphics.Matrix.ScaleToFit.START);
	//  176  340:aload_0         
	//  177  341:getfield        #111 <Field Matrix u>
	//  178  344:aload_1         
	//  179  345:aload           8
	//  180  347:getstatic       #256 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.START>
	//  181  350:invokevirtual   #253 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//  182  353:pop             
				break;

	//* 183  354:goto            388
			case 3: // '\003'
				u.setRectToRect(((RectF) (drawable)), rectf, android.graphics.Matrix.ScaleToFit.END);
	//  184  357:aload_0         
	//  185  358:getfield        #111 <Field Matrix u>
	//  186  361:aload_1         
	//  187  362:aload           8
	//  188  364:getstatic       #259 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.END>
	//  189  367:invokevirtual   #253 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//  190  370:pop             
				break;

	//* 191  371:goto            388
			case 4: // '\004'
				u.setRectToRect(((RectF) (drawable)), rectf, android.graphics.Matrix.ScaleToFit.FILL);
	//  192  374:aload_0         
	//  193  375:getfield        #111 <Field Matrix u>
	//  194  378:aload_1         
	//  195  379:aload           8
	//  196  381:getstatic       #262 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.FILL>
	//  197  384:invokevirtual   #253 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//  198  387:pop             
				break;
			}
		}
		o();
	//  199  388:aload_0         
	//  200  389:invokespecial   #264 <Method void o()>
	//  201  392:return          
	}

	private float c(Matrix matrix, int i1)
	{
		matrix.getValues(t);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #122 <Field float[] t>
	//    3    5:invokevirtual   #269 <Method void Matrix.getValues(float[])>
		return t[i1];
	//    4    8:aload_0         
	//    5    9:getfield        #122 <Field float[] t>
	//    6   12:iload_2         
	//    7   13:faload          
	//    8   14:freturn         
	}

	static ImageView c(kx kx1)
	{
		return kx1.m;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field ImageView m>
	//    2    4:areturn         
	}

	private void c(Matrix matrix)
	{
		m.setImageMatrix(matrix);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field ImageView m>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #274 <Method void ImageView.setImageMatrix(Matrix)>
		if(x != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #276 <Field kq x>
	//*   6   12:ifnull          35
		{
			matrix = ((Matrix) (e(matrix)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #279 <Method RectF e(Matrix)>
	//   10   20:astore_1        
			if(matrix != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          35
				x.d(((RectF) (matrix)));
	//   13   25:aload_0         
	//   14   26:getfield        #276 <Field kq x>
	//   15   29:aload_1         
	//   16   30:invokeinterface #284 <Method void kq.d(RectF)>
		}
	//   17   35:return          
	}

	static void c(kx kx1, Matrix matrix)
	{
		kx1.c(matrix);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #287 <Method void c(Matrix)>
	//    3    5:return          
	}

	private int d(ImageView imageview)
	{
		return imageview.getHeight() - imageview.getPaddingTop() - imageview.getPaddingBottom();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #290 <Method int ImageView.getHeight()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #293 <Method int ImageView.getPaddingTop()>
	//    4    8:isub            
	//    5    9:aload_1         
	//    6   10:invokevirtual   #296 <Method int ImageView.getPaddingBottom()>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	static android.view.View.OnLongClickListener d(kx kx1)
	{
		return kx1.z;
	//    0    0:aload_0         
	//    1    1:getfield        #299 <Field android.view.View$OnLongClickListener z>
	//    2    4:areturn         
	}

	private RectF e(Matrix matrix)
	{
		Drawable drawable = m.getDrawable();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field ImageView m>
	//    2    4:invokevirtual   #303 <Method Drawable ImageView.getDrawable()>
	//    3    7:astore_2        
		if(drawable != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          45
		{
			s.set(0.0F, 0.0F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
	//    6   12:aload_0         
	//    7   13:getfield        #120 <Field RectF s>
	//    8   16:fconst_0        
	//    9   17:fconst_0        
	//   10   18:aload_2         
	//   11   19:invokevirtual   #204 <Method int Drawable.getIntrinsicWidth()>
	//   12   22:i2f             
	//   13   23:aload_2         
	//   14   24:invokevirtual   #207 <Method int Drawable.getIntrinsicHeight()>
	//   15   27:i2f             
	//   16   28:invokevirtual   #306 <Method void RectF.set(float, float, float, float)>
			matrix.mapRect(s);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #120 <Field RectF s>
	//   20   36:invokevirtual   #310 <Method boolean Matrix.mapRect(RectF)>
	//   21   39:pop             
			return s;
	//   22   40:aload_0         
	//   23   41:getfield        #120 <Field RectF s>
	//   24   44:areturn         
		} else
		{
			return null;
	//   25   45:aconst_null     
	//   26   46:areturn         
		}
	}

	static ko e(kx kx1)
	{
		return kx1.w;
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field ko w>
	//    2    4:areturn         
	}

	static Matrix f(kx kx1)
	{
		return kx1.m();
	//    0    0:aload_0         
	//    1    1:invokespecial   #317 <Method Matrix m()>
	//    2    4:areturn         
	}

	static float g()
	{
		return d;
	//    0    0:getstatic       #80  <Field float d>
	//    1    3:freturn         
	}

	static kp g(kx kx1)
	{
		return kx1.v;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field kp v>
	//    2    4:areturn         
	}

	static Matrix h(kx kx1)
	{
		return kx1.q;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Matrix q>
	//    2    4:areturn         
	}

	static int i(kx kx1)
	{
		return kx1.g;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int g>
	//    2    4:ireturn         
	}

	static int k()
	{
		return a;
	//    0    0:getstatic       #84  <Field int a>
	//    1    3:ireturn         
	}

	static Interpolator k(kx kx1)
	{
		return kx1.k;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Interpolator k>
	//    2    4:areturn         
	}

	private boolean l()
	{
		RectF rectf = e(m());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #317 <Method Matrix m()>
	//    3    5:invokespecial   #279 <Method RectF e(Matrix)>
	//    4    8:astore          6
		if(rectf == null)
	//*   5   10:aload           6
	//*   6   12:ifnonnull       17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		float f4 = rectf.height();
	//    9   17:aload           6
	//   10   19:invokevirtual   #326 <Method float RectF.height()>
	//   11   22:fstore          4
		float f3 = rectf.width();
	//   12   24:aload           6
	//   13   26:invokevirtual   #329 <Method float RectF.width()>
	//   14   29:fstore_3        
		float f2 = 0.0F;
	//   15   30:fconst_0        
	//   16   31:fstore_2        
		float f1 = 0.0F;
	//   17   32:fconst_0        
	//   18   33:fstore_1        
		int i1 = d(m);
	//   19   34:aload_0         
	//   20   35:aload_0         
	//   21   36:getfield        #135 <Field ImageView m>
	//   22   39:invokespecial   #199 <Method int d(ImageView)>
	//   23   42:istore          5
		if(f4 <= (float)i1)
	//*  24   44:fload           4
	//*  25   46:iload           5
	//*  26   48:i2f             
	//*  27   49:fcmpg           
	//*  28   50:ifgt            139
			switch(_cls5.d[I.ordinal()])
	//*  29   53:getstatic       #241 <Field int[] kx$5.d>
	//*  30   56:aload_0         
	//*  31   57:getfield        #133 <Field android.widget.ImageView$ScaleType I>
	//*  32   60:invokevirtual   #244 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  33   63:iaload          
			{
	//*  34   64:lookupswitch    2: default 92
	//	               2: 95
	//	               3: 105
	//*  35   92:goto            121
			case 2: // '\002'
				f1 = -rectf.top;
	//   36   95:aload           6
	//   37   97:getfield        #332 <Field float RectF.top>
	//   38  100:fneg            
	//   39  101:fstore_1        
				break;

	//*  40  102:goto            181
			case 3: // '\003'
				f1 = (float)i1 - f4 - rectf.top;
	//   41  105:iload           5
	//   42  107:i2f             
	//   43  108:fload           4
	//   44  110:fsub            
	//   45  111:aload           6
	//   46  113:getfield        #332 <Field float RectF.top>
	//   47  116:fsub            
	//   48  117:fstore_1        
				break;

	//*  49  118:goto            181
			default:
				f1 = ((float)i1 - f4) / 2.0F - rectf.top;
	//   50  121:iload           5
	//   51  123:i2f             
	//   52  124:fload           4
	//   53  126:fsub            
	//   54  127:fconst_2        
	//   55  128:fdiv            
	//   56  129:aload           6
	//   57  131:getfield        #332 <Field float RectF.top>
	//   58  134:fsub            
	//   59  135:fstore_1        
				break;
			}
		else
	//*  60  136:goto            181
		if(rectf.top > 0.0F)
	//*  61  139:aload           6
	//*  62  141:getfield        #332 <Field float RectF.top>
	//*  63  144:fconst_0        
	//*  64  145:fcmpl           
	//*  65  146:ifle            159
			f1 = -rectf.top;
	//   66  149:aload           6
	//   67  151:getfield        #332 <Field float RectF.top>
	//   68  154:fneg            
	//   69  155:fstore_1        
		else
	//*  70  156:goto            181
		if(rectf.bottom < (float)i1)
	//*  71  159:aload           6
	//*  72  161:getfield        #335 <Field float RectF.bottom>
	//*  73  164:iload           5
	//*  74  166:i2f             
	//*  75  167:fcmpg           
	//*  76  168:ifge            181
			f1 = (float)i1 - rectf.bottom;
	//   77  171:iload           5
	//   78  173:i2f             
	//   79  174:aload           6
	//   80  176:getfield        #335 <Field float RectF.bottom>
	//   81  179:fsub            
	//   82  180:fstore_1        
		i1 = b(m);
	//   83  181:aload_0         
	//   84  182:aload_0         
	//   85  183:getfield        #135 <Field ImageView m>
	//   86  186:invokespecial   #197 <Method int b(ImageView)>
	//   87  189:istore          5
		if(f3 <= (float)i1)
	//*  88  191:fload_3         
	//*  89  192:iload           5
	//*  90  194:i2f             
	//*  91  195:fcmpg           
	//*  92  196:ifgt            286
		{
			switch(_cls5.d[I.ordinal()])
	//*  93  199:getstatic       #241 <Field int[] kx$5.d>
	//*  94  202:aload_0         
	//*  95  203:getfield        #133 <Field android.widget.ImageView$ScaleType I>
	//*  96  206:invokevirtual   #244 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  97  209:iaload          
			{
	//*  98  210:lookupswitch    2: default 236
	//	               2: 239
	//	               3: 249
	//*  99  236:goto            264
			case 2: // '\002'
				f2 = -rectf.left;
	//  100  239:aload           6
	//  101  241:getfield        #338 <Field float RectF.left>
	//  102  244:fneg            
	//  103  245:fstore_2        
				break;

	//* 104  246:goto            278
			case 3: // '\003'
				f2 = (float)i1 - f3 - rectf.left;
	//  105  249:iload           5
	//  106  251:i2f             
	//  107  252:fload_3         
	//  108  253:fsub            
	//  109  254:aload           6
	//  110  256:getfield        #338 <Field float RectF.left>
	//  111  259:fsub            
	//  112  260:fstore_2        
				break;

	//* 113  261:goto            278
			default:
				f2 = ((float)i1 - f3) / 2.0F - rectf.left;
	//  114  264:iload           5
	//  115  266:i2f             
	//  116  267:fload_3         
	//  117  268:fsub            
	//  118  269:fconst_2        
	//  119  270:fdiv            
	//  120  271:aload           6
	//  121  273:getfield        #338 <Field float RectF.left>
	//  122  276:fsub            
	//  123  277:fstore_2        
				break;
			}
			C = 2;
	//  124  278:aload_0         
	//  125  279:iconst_2        
	//  126  280:putfield        #124 <Field int C>
		} else
	//* 127  283:goto            346
		if(rectf.left > 0.0F)
	//* 128  286:aload           6
	//* 129  288:getfield        #338 <Field float RectF.left>
	//* 130  291:fconst_0        
	//* 131  292:fcmpl           
	//* 132  293:ifle            311
		{
			C = 0;
	//  133  296:aload_0         
	//  134  297:iconst_0        
	//  135  298:putfield        #124 <Field int C>
			f2 = -rectf.left;
	//  136  301:aload           6
	//  137  303:getfield        #338 <Field float RectF.left>
	//  138  306:fneg            
	//  139  307:fstore_2        
		} else
	//* 140  308:goto            346
		if(rectf.right < (float)i1)
	//* 141  311:aload           6
	//* 142  313:getfield        #341 <Field float RectF.right>
	//* 143  316:iload           5
	//* 144  318:i2f             
	//* 145  319:fcmpg           
	//* 146  320:ifge            341
		{
			f2 = (float)i1 - rectf.right;
	//  147  323:iload           5
	//  148  325:i2f             
	//  149  326:aload           6
	//  150  328:getfield        #341 <Field float RectF.right>
	//  151  331:fsub            
	//  152  332:fstore_2        
			C = 1;
	//  153  333:aload_0         
	//  154  334:iconst_1        
	//  155  335:putfield        #124 <Field int C>
		} else
	//* 156  338:goto            346
		{
			C = -1;
	//  157  341:aload_0         
	//  158  342:iconst_m1       
	//  159  343:putfield        #124 <Field int C>
		}
		q.postTranslate(f2, f1);
	//  160  346:aload_0         
	//  161  347:getfield        #115 <Field Matrix q>
	//  162  350:fload_2         
	//  163  351:fload_1         
	//  164  352:invokevirtual   #217 <Method boolean Matrix.postTranslate(float, float)>
	//  165  355:pop             
		return true;
	//  166  356:iconst_1        
	//  167  357:ireturn         
	}

	private Matrix m()
	{
		r.set(u);
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Matrix r>
	//    2    4:aload_0         
	//    3    5:getfield        #111 <Field Matrix u>
	//    4    8:invokevirtual   #343 <Method void Matrix.set(Matrix)>
		r.postConcat(q);
	//    5   11:aload_0         
	//    6   12:getfield        #113 <Field Matrix r>
	//    7   15:aload_0         
	//    8   16:getfield        #115 <Field Matrix q>
	//    9   19:invokevirtual   #347 <Method boolean Matrix.postConcat(Matrix)>
	//   10   22:pop             
		return r;
	//   11   23:aload_0         
	//   12   24:getfield        #113 <Field Matrix r>
	//   13   27:areturn         
	}

	private void n()
	{
		if(B != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #349 <Field kx$c B>
	//*   2    4:ifnull          19
		{
			B.e();
	//    3    7:aload_0         
	//    4    8:getfield        #349 <Field kx$c B>
	//    5   11:invokevirtual   #351 <Method void kx$c.e()>
			B = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #349 <Field kx$c B>
		}
	//    9   19:return          
	}

	private void o()
	{
		q.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Matrix q>
	//    2    4:invokevirtual   #210 <Method void Matrix.reset()>
		a(A);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #151 <Field float A>
	//    6   12:invokevirtual   #354 <Method void a(float)>
		c(m());
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #317 <Method Matrix m()>
	//   10   20:invokespecial   #287 <Method void c(Matrix)>
		l();
	//   11   23:aload_0         
	//   12   24:invokespecial   #356 <Method boolean l()>
	//   13   27:pop             
	//   14   28:return          
	}

	private void p()
	{
		if(l())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #356 <Method boolean l()>
	//*   2    4:ifeq            15
			c(m());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #317 <Method Matrix m()>
	//    6   12:invokespecial   #287 <Method void c(Matrix)>
	//    7   15:return          
	}

	public RectF a()
	{
		l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #356 <Method boolean l()>
	//    2    4:pop             
		return e(m());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #317 <Method Matrix m()>
	//    6   10:invokespecial   #279 <Method RectF e(Matrix)>
	//    7   13:areturn         
	}

	public void a(float f1)
	{
		q.postRotate(f1 % 360F);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Matrix q>
	//    2    4:fload_1         
	//    3    5:ldc2            #358 <Float 360F>
	//    4    8:frem            
	//    5    9:invokevirtual   #362 <Method boolean Matrix.postRotate(float)>
	//    6   12:pop             
		p();
	//    7   13:aload_0         
	//    8   14:invokespecial   #364 <Method void p()>
	//    9   17:return          
	}

	public void a(float f1, float f2, float f3, float f4)
	{
		B = new c(m.getContext());
	//    0    0:aload_0         
	//    1    1:new             #18  <Class kx$c>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #135 <Field ImageView m>
	//    6   10:invokevirtual   #157 <Method Context ImageView.getContext()>
	//    7   13:invokespecial   #367 <Method void kx$c(kx, Context)>
	//    8   16:putfield        #349 <Field kx$c B>
		B.a(b(m), d(m), (int)f3, (int)f4);
	//    9   19:aload_0         
	//   10   20:getfield        #349 <Field kx$c B>
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #135 <Field ImageView m>
	//   14   28:invokespecial   #197 <Method int b(ImageView)>
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #135 <Field ImageView m>
	//   18   36:invokespecial   #199 <Method int d(ImageView)>
	//   19   39:fload_3         
	//   20   40:f2i             
	//   21   41:fload           4
	//   22   43:f2i             
	//   23   44:invokevirtual   #370 <Method void kx$c.a(int, int, int, int)>
		m.post(((Runnable) (B)));
	//   24   47:aload_0         
	//   25   48:getfield        #135 <Field ImageView m>
	//   26   51:aload_0         
	//   27   52:getfield        #349 <Field kx$c B>
	//   28   55:invokevirtual   #374 <Method boolean ImageView.post(Runnable)>
	//   29   58:pop             
	//   30   59:return          
	}

	public void a(int i1)
	{
		g = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #96  <Field int g>
	//    3    5:return          
	}

	public void a(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
	{
		o.setOnDoubleTapListener(ondoubletaplistener);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field GestureDetector o>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #177 <Method void GestureDetector.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
	//    4    8:return          
	}

	public void a(boolean flag)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #104 <Field boolean p>
	//    3    5:return          
	}

	public float b()
	{
		return (float)Math.sqrt((float)Math.pow(c(q, 0), 2D) + (float)Math.pow(c(q, 3), 2D));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #115 <Field Matrix q>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #378 <Method float c(Matrix, int)>
	//    5    9:f2d             
	//    6   10:ldc2w           #379 <Double 2D>
	//    7   13:invokestatic    #384 <Method double Math.pow(double, double)>
	//    8   16:d2f             
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #115 <Field Matrix q>
	//   12   22:iconst_3        
	//   13   23:invokespecial   #378 <Method float c(Matrix, int)>
	//   14   26:f2d             
	//   15   27:ldc2w           #379 <Double 2D>
	//   16   30:invokestatic    #384 <Method double Math.pow(double, double)>
	//   17   33:d2f             
	//   18   34:fadd            
	//   19   35:f2d             
	//   20   36:invokestatic    #388 <Method double Math.sqrt(double)>
	//   21   39:d2f             
	//   22   40:freturn         
	}

	public void b(float f1)
	{
		q.setRotate(f1 % 360F);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field Matrix q>
	//    2    4:fload_1         
	//    3    5:ldc2            #358 <Float 360F>
	//    4    8:frem            
	//    5    9:invokevirtual   #391 <Method void Matrix.setRotate(float)>
		p();
	//    6   12:aload_0         
	//    7   13:invokespecial   #364 <Method void p()>
	//    8   16:return          
	}

	public void b(android.view.View.OnLongClickListener onlongclicklistener)
	{
		z = onlongclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #299 <Field android.view.View$OnLongClickListener z>
	//    3    5:return          
	}

	public void b(ko ko)
	{
		w = ko;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #313 <Field ko w>
	//    3    5:return          
	}

	public float c()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field float f>
	//    2    4:freturn         
	}

	public void c(float f1)
	{
		ku.a(f, f1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field float f>
	//    2    4:fload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field float i>
	//    5    9:invokestatic    #398 <Method void ku.a(float, float, float)>
		h = f1;
	//    6   12:aload_0         
	//    7   13:fload_1         
	//    8   14:putfield        #100 <Field float h>
	//    9   17:return          
	}

	public void c(float f1, float f2, float f3)
	{
		ku.a(f1, f2, f3);
	//    0    0:fload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokestatic    #398 <Method void ku.a(float, float, float)>
		f = f1;
	//    4    6:aload_0         
	//    5    7:fload_1         
	//    6    8:putfield        #98  <Field float f>
		h = f2;
	//    7   11:aload_0         
	//    8   12:fload_2         
	//    9   13:putfield        #100 <Field float h>
		i = f3;
	//   10   16:aload_0         
	//   11   17:fload_3         
	//   12   18:putfield        #102 <Field float i>
	//   13   21:return          
	}

	public void c(android.view.View.OnClickListener onclicklistener)
	{
		y = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #194 <Field android.view.View$OnClickListener y>
	//    3    5:return          
	}

	public void c(kt kt)
	{
		j = kt;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #180 <Field kt j>
	//    3    5:return          
	}

	public float d()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field float i>
	//    2    4:freturn         
	}

	public void d(float f1)
	{
		ku.a(f1, h, i);
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #100 <Field float h>
	//    3    5:aload_0         
	//    4    6:getfield        #102 <Field float i>
	//    5    9:invokestatic    #398 <Method void ku.a(float, float, float)>
		f = f1;
	//    6   12:aload_0         
	//    7   13:fload_1         
	//    8   14:putfield        #98  <Field float f>
	//    9   17:return          
	}

	public void d(float f1, float f2, float f3)
	{
		if((b() < i || f1 < 1.0F) && (b() > f || f1 > 1.0F))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #402 <Method float b()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #102 <Field float i>
	//*   4    8:fcmpg           
	//*   5    9:iflt            18
	//*   6   12:fload_1         
	//*   7   13:fconst_1        
	//*   8   14:fcmpg           
	//*   9   15:ifge            71
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #402 <Method float b()>
	//*  12   22:aload_0         
	//*  13   23:getfield        #98  <Field float f>
	//*  14   26:fcmpl           
	//*  15   27:ifgt            36
	//*  16   30:fload_1         
	//*  17   31:fconst_1        
	//*  18   32:fcmpl           
	//*  19   33:ifle            71
		{
			if(D != null)
	//*  20   36:aload_0         
	//*  21   37:getfield        #404 <Field kw D>
	//*  22   40:ifnull          55
				D.a(f1, f2, f3);
	//   23   43:aload_0         
	//   24   44:getfield        #404 <Field kw D>
	//   25   47:fload_1         
	//   26   48:fload_2         
	//   27   49:fload_3         
	//   28   50:invokeinterface #407 <Method void kw.a(float, float, float)>
			q.postScale(f1, f1, f2, f3);
	//   29   55:aload_0         
	//   30   56:getfield        #115 <Field Matrix q>
	//   31   59:fload_1         
	//   32   60:fload_1         
	//   33   61:fload_2         
	//   34   62:fload_3         
	//   35   63:invokevirtual   #410 <Method boolean Matrix.postScale(float, float, float, float)>
	//   36   66:pop             
			p();
	//   37   67:aload_0         
	//   38   68:invokespecial   #364 <Method void p()>
		}
	//   39   71:return          
	}

	public void d(float f1, float f2, float f3, boolean flag)
	{
		if(f1 < f || f1 > i)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #98  <Field float f>
	//*   3    5:fcmpg           
	//*   4    6:iflt            18
	//*   5    9:fload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #102 <Field float i>
	//*   8   14:fcmpl           
	//*   9   15:ifle            29
			throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
	//   10   18:new             #413 <Class IllegalArgumentException>
	//   11   21:dup             
	//   12   22:ldc2            #415 <String "Scale must be within the range of minScale and maxScale">
	//   13   25:invokespecial   #418 <Method void IllegalArgumentException(String)>
	//   14   28:athrow          
		if(flag)
	//*  15   29:iload           4
	//*  16   31:ifeq            58
		{
			m.post(((Runnable) (new d(b(), f1, f2, f3))));
	//   17   34:aload_0         
	//   18   35:getfield        #135 <Field ImageView m>
	//   19   38:new             #21  <Class kx$d>
	//   20   41:dup             
	//   21   42:aload_0         
	//   22   43:aload_0         
	//   23   44:invokevirtual   #402 <Method float b()>
	//   24   47:fload_1         
	//   25   48:fload_2         
	//   26   49:fload_3         
	//   27   50:invokespecial   #421 <Method void kx$d(kx, float, float, float, float)>
	//   28   53:invokevirtual   #374 <Method boolean ImageView.post(Runnable)>
	//   29   56:pop             
			return;
	//   30   57:return          
		} else
		{
			q.setScale(f1, f1, f2, f3);
	//   31   58:aload_0         
	//   32   59:getfield        #115 <Field Matrix q>
	//   33   62:fload_1         
	//   34   63:fload_1         
	//   35   64:fload_2         
	//   36   65:fload_3         
	//   37   66:invokevirtual   #424 <Method void Matrix.setScale(float, float, float, float)>
			p();
	//   38   69:aload_0         
	//   39   70:invokespecial   #364 <Method void p()>
			return;
	//   40   73:return          
		}
	}

	public void d(kq kq1)
	{
		x = kq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #276 <Field kq x>
	//    3    5:return          
	}

	public void d(kw kw1)
	{
		D = kw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #404 <Field kw D>
	//    3    5:return          
	}

	public void d(boolean flag)
	{
		E = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #126 <Field boolean E>
		f();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #428 <Method void f()>
	//    5    9:return          
	}

	public float e()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field float h>
	//    2    4:freturn         
	}

	public void e(float f1)
	{
		ku.a(f, h, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field float f>
	//    2    4:aload_0         
	//    3    5:getfield        #100 <Field float h>
	//    4    8:fload_1         
	//    5    9:invokestatic    #398 <Method void ku.a(float, float, float)>
		i = f1;
	//    6   12:aload_0         
	//    7   13:fload_1         
	//    8   14:putfield        #102 <Field float i>
	//    9   17:return          
	}

	public void e(float f1, float f2)
	{
		if(l.d())
	//*   0    0:aload_0         
	//*   1    1:getfield        #162 <Field kr l>
	//*   2    4:invokevirtual   #431 <Method boolean kr.d()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		q.postTranslate(f1, f2);
	//    5   11:aload_0         
	//    6   12:getfield        #115 <Field Matrix q>
	//    7   15:fload_1         
	//    8   16:fload_2         
	//    9   17:invokevirtual   #217 <Method boolean Matrix.postTranslate(float, float)>
	//   10   20:pop             
		p();
	//   11   21:aload_0         
	//   12   22:invokespecial   #364 <Method void p()>
		ViewParent viewparent = m.getParent();
	//   13   25:aload_0         
	//   14   26:getfield        #135 <Field ImageView m>
	//   15   29:invokevirtual   #435 <Method ViewParent ImageView.getParent()>
	//   16   32:astore_3        
		if(p && !l.d() && !n)
	//*  17   33:aload_0         
	//*  18   34:getfield        #104 <Field boolean p>
	//*  19   37:ifeq            106
	//*  20   40:aload_0         
	//*  21   41:getfield        #162 <Field kr l>
	//*  22   44:invokevirtual   #431 <Method boolean kr.d()>
	//*  23   47:ifne            106
	//*  24   50:aload_0         
	//*  25   51:getfield        #106 <Field boolean n>
	//*  26   54:ifne            106
		{
			if((C == 2 || C == 0 && f1 >= 1.0F || C == 1 && f1 <= -1F) && viewparent != null)
	//*  27   57:aload_0         
	//*  28   58:getfield        #124 <Field int C>
	//*  29   61:iconst_2        
	//*  30   62:icmpeq          94
	//*  31   65:aload_0         
	//*  32   66:getfield        #124 <Field int C>
	//*  33   69:ifne            78
	//*  34   72:fload_1         
	//*  35   73:fconst_1        
	//*  36   74:fcmpl           
	//*  37   75:ifge            94
	//*  38   78:aload_0         
	//*  39   79:getfield        #124 <Field int C>
	//*  40   82:iconst_1        
	//*  41   83:icmpne          117
	//*  42   86:fload_1         
	//*  43   87:ldc2            #436 <Float -1F>
	//*  44   90:fcmpg           
	//*  45   91:ifgt            117
	//*  46   94:aload_3         
	//*  47   95:ifnull          117
			{
				viewparent.requestDisallowInterceptTouchEvent(false);
	//   48   98:aload_3         
	//   49   99:iconst_0        
	//   50  100:invokeinterface #441 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				return;
	//   51  105:return          
			}
		} else
		if(viewparent != null)
	//*  52  106:aload_3         
	//*  53  107:ifnull          117
			viewparent.requestDisallowInterceptTouchEvent(true);
	//   54  110:aload_3         
	//   55  111:iconst_1        
	//   56  112:invokeinterface #441 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//   57  117:return          
	}

	public void e(float f1, boolean flag)
	{
		d(f1, m.getRight() / 2, m.getBottom() / 2, flag);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #135 <Field ImageView m>
	//    4    6:invokevirtual   #445 <Method int ImageView.getRight()>
	//    5    9:iconst_2        
	//    6   10:idiv            
	//    7   11:i2f             
	//    8   12:aload_0         
	//    9   13:getfield        #135 <Field ImageView m>
	//   10   16:invokevirtual   #448 <Method int ImageView.getBottom()>
	//   11   19:iconst_2        
	//   12   20:idiv            
	//   13   21:i2f             
	//   14   22:iload_2         
	//   15   23:invokevirtual   #450 <Method void d(float, float, float, boolean)>
	//   16   26:return          
	}

	public void e(android.widget.ImageView.ScaleType scaletype)
	{
		if(ku.c(scaletype) && scaletype != I)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #454 <Method boolean ku.c(android.widget.ImageView$ScaleType)>
	//*   2    4:ifeq            24
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #133 <Field android.widget.ImageView$ScaleType I>
	//*   6   12:if_acmpeq       24
		{
			I = scaletype;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #133 <Field android.widget.ImageView$ScaleType I>
			f();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #428 <Method void f()>
		}
	//   12   24:return          
	}

	public void e(kp kp)
	{
		v = kp;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #321 <Field kp v>
	//    3    5:return          
	}

	public void f()
	{
		if(E)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field boolean E>
	//*   2    4:ifeq            19
		{
			b(m.getDrawable());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #135 <Field ImageView m>
	//    6   12:invokevirtual   #303 <Method Drawable ImageView.getDrawable()>
	//    7   15:invokespecial   #457 <Method void b(Drawable)>
			return;
	//    8   18:return          
		} else
		{
			o();
	//    9   19:aload_0         
	//   10   20:invokespecial   #264 <Method void o()>
			return;
	//   11   23:return          
		}
	}

	public Matrix h()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Matrix r>
	//    2    4:areturn         
	}

	public android.widget.ImageView.ScaleType i()
	{
		return I;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field android.widget.ImageView$ScaleType I>
	//    2    4:areturn         
	}

	public void k(float f1)
	{
		e(f1, false);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #460 <Method void e(float, boolean)>
	//    4    6:return          
	}

	public void onLayoutChange(View view, int i1, int j1, int k1, int l1, int i2, int j2, 
			int k2, int l2)
	{
		b(m.getDrawable());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #135 <Field ImageView m>
	//    3    5:invokevirtual   #303 <Method Drawable ImageView.getDrawable()>
	//    4    8:invokespecial   #457 <Method void b(Drawable)>
	//    5   11:return          
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		boolean flag4 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		boolean flag3 = false;
	//    2    3:iconst_0        
	//    3    4:istore          6
		boolean flag2 = flag4;
	//    4    6:iload           7
	//    5    8:istore          5
		if(E)
	//*   6   10:aload_0         
	//*   7   11:getfield        #126 <Field boolean E>
	//*   8   14:ifeq            305
		{
			flag2 = flag4;
	//    9   17:iload           7
	//   10   19:istore          5
			if(ku.c((ImageView)view))
	//*  11   21:aload_1         
	//*  12   22:checkcast       #137 <Class ImageView>
	//*  13   25:invokestatic    #467 <Method boolean ku.c(ImageView)>
	//*  14   28:ifeq            305
			{
				flag2 = flag3;
	//   15   31:iload           6
	//   16   33:istore          5
				switch(motionevent.getAction())
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #472 <Method int MotionEvent.getAction()>
				{
	//*  19   39:tableswitch     0 3: default 68
	//	               0 75
	//	               1 102
	//	               2 167
	//	               3 102
				default:
					flag2 = flag3;
	//   20   68:iload           6
	//   21   70:istore          5
					break;
	//   22   72:goto            167

				case 2: // '\002'
					break;

				case 0: // '\0'
					view = ((View) (view.getParent()));
	//   23   75:aload_1         
	//   24   76:invokevirtual   #475 <Method ViewParent View.getParent()>
	//   25   79:astore_1        
					if(view != null)
	//*  26   80:aload_1         
	//*  27   81:ifnull          91
						((ViewParent) (view)).requestDisallowInterceptTouchEvent(true);
	//   28   84:aload_1         
	//   29   85:iconst_1        
	//   30   86:invokeinterface #441 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
					n();
	//   31   91:aload_0         
	//   32   92:invokespecial   #477 <Method void n()>
					flag2 = flag3;
	//   33   95:iload           6
	//   34   97:istore          5
					break;
	//   35   99:goto            167

				case 1: // '\001'
				case 3: // '\003'
					flag2 = flag3;
	//   36  102:iload           6
	//   37  104:istore          5
					if(b() >= f)
						break;
	//   38  106:aload_0         
	//   39  107:invokevirtual   #402 <Method float b()>
	//   40  110:aload_0         
	//   41  111:getfield        #98  <Field float f>
	//   42  114:fcmpg           
	//   43  115:ifge            167
					RectF rectf = a();
	//   44  118:aload_0         
	//   45  119:invokevirtual   #479 <Method RectF a()>
	//   46  122:astore          8
					flag2 = flag3;
	//   47  124:iload           6
	//   48  126:istore          5
					if(rectf != null)
	//*  49  128:aload           8
	//*  50  130:ifnull          167
					{
						view.post(((Runnable) (new d(b(), f, rectf.centerX(), rectf.centerY()))));
	//   51  133:aload_1         
	//   52  134:new             #21  <Class kx$d>
	//   53  137:dup             
	//   54  138:aload_0         
	//   55  139:aload_0         
	//   56  140:invokevirtual   #402 <Method float b()>
	//   57  143:aload_0         
	//   58  144:getfield        #98  <Field float f>
	//   59  147:aload           8
	//   60  149:invokevirtual   #482 <Method float RectF.centerX()>
	//   61  152:aload           8
	//   62  154:invokevirtual   #485 <Method float RectF.centerY()>
	//   63  157:invokespecial   #421 <Method void kx$d(kx, float, float, float, float)>
	//   64  160:invokevirtual   #486 <Method boolean View.post(Runnable)>
	//   65  163:pop             
						flag2 = true;
	//   66  164:iconst_1        
	//   67  165:istore          5
					}
					break;
				}
				flag3 = flag2;
	//   68  167:iload           5
	//   69  169:istore          6
				if(l != null)
	//*  70  171:aload_0         
	//*  71  172:getfield        #162 <Field kr l>
	//*  72  175:ifnull          276
				{
					flag2 = l.d();
	//   73  178:aload_0         
	//   74  179:getfield        #162 <Field kr l>
	//   75  182:invokevirtual   #431 <Method boolean kr.d()>
	//   76  185:istore          5
					boolean flag5 = l.c();
	//   77  187:aload_0         
	//   78  188:getfield        #162 <Field kr l>
	//   79  191:invokevirtual   #488 <Method boolean kr.c()>
	//   80  194:istore          7
					flag3 = l.e(motionevent);
	//   81  196:aload_0         
	//   82  197:getfield        #162 <Field kr l>
	//   83  200:aload_2         
	//   84  201:invokevirtual   #491 <Method boolean kr.e(MotionEvent)>
	//   85  204:istore          6
					boolean flag;
					if(!flag2 && !l.d())
	//*  86  206:iload           5
	//*  87  208:ifne            226
	//*  88  211:aload_0         
	//*  89  212:getfield        #162 <Field kr l>
	//*  90  215:invokevirtual   #431 <Method boolean kr.d()>
	//*  91  218:ifne            226
						flag = true;
	//   92  221:iconst_1        
	//   93  222:istore_3        
					else
	//*  94  223:goto            228
						flag = false;
	//   95  226:iconst_0        
	//   96  227:istore_3        
					boolean flag1;
					if(!flag5 && !l.c())
	//*  97  228:iload           7
	//*  98  230:ifne            249
	//*  99  233:aload_0         
	//* 100  234:getfield        #162 <Field kr l>
	//* 101  237:invokevirtual   #488 <Method boolean kr.c()>
	//* 102  240:ifne            249
						flag1 = true;
	//  103  243:iconst_1        
	//  104  244:istore          4
					else
	//* 105  246:goto            252
						flag1 = false;
	//  106  249:iconst_0        
	//  107  250:istore          4
					if(flag && flag1)
	//* 108  252:iload_3         
	//* 109  253:ifeq            267
	//* 110  256:iload           4
	//* 111  258:ifeq            267
						flag2 = true;
	//  112  261:iconst_1        
	//  113  262:istore          5
					else
	//* 114  264:goto            270
						flag2 = false;
	//  115  267:iconst_0        
	//  116  268:istore          5
					n = flag2;
	//  117  270:aload_0         
	//  118  271:iload           5
	//  119  273:putfield        #106 <Field boolean n>
				}
				flag2 = flag3;
	//  120  276:iload           6
	//  121  278:istore          5
				if(o != null)
	//* 122  280:aload_0         
	//* 123  281:getfield        #172 <Field GestureDetector o>
	//* 124  284:ifnull          305
				{
					flag2 = flag3;
	//  125  287:iload           6
	//  126  289:istore          5
					if(o.onTouchEvent(motionevent))
	//* 127  291:aload_0         
	//* 128  292:getfield        #172 <Field GestureDetector o>
	//* 129  295:aload_2         
	//* 130  296:invokevirtual   #494 <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//* 131  299:ifeq            305
						flag2 = true;
	//  132  302:iconst_1        
	//  133  303:istore          5
				}
			}
		}
		return flag2;
	//  134  305:iload           5
	//  135  307:ireturn         
	}

	private static int a = 1;
	private static float b = 3F;
	private static int c = 200;
	private static float d = 1.0F;
	private static float e = 1.75F;
	private float A;
	private c B;
	private int C;
	private kw D;
	private boolean E;
	private android.widget.ImageView.ScaleType I;
	private float f;
	private int g;
	private float h;
	private float i;
	private kt j;
	private Interpolator k;
	private kr l;
	private ImageView m;
	private boolean n;
	private GestureDetector o;
	private boolean p;
	private final Matrix q = new Matrix();
	private final Matrix r = new Matrix();
	private final RectF s = new RectF();
	private final float t[] = new float[9];
	private final Matrix u = new Matrix();
	private kp v;
	private ko w;
	private kq x;
	private android.view.View.OnClickListener y;
	private android.view.View.OnLongClickListener z;

	static 
	{
	//    0    0:ldc1            #73  <Float 3F>
	//    1    2:putstatic       #75  <Field float b>
	//    2    5:ldc1            #76  <Float 1.75F>
	//    3    7:putstatic       #78  <Field float e>
	//    4   10:fconst_1        
	//    5   11:putstatic       #80  <Field float d>
	//    6   14:sipush          200
	//    7   17:putstatic       #82  <Field int c>
	//    8   20:iconst_1        
	//    9   21:putstatic       #84  <Field int a>
	//*  10   24:return          
	}
}
