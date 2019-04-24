// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat

static class VectorDrawableCompat$h extends android.graphics.drawable.Drawable$ConstantState
{

	public Paint a(ColorFilter colorfilter)
	{
		if(!e() && colorfilter == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #69  <Method boolean e()>
	//*   2    4:ifne            13
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		if(m == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #71  <Field Paint m>
	//*   9   17:ifnonnull       39
		{
			m = new Paint();
	//   10   20:aload_0         
	//   11   21:new             #53  <Class Paint>
	//   12   24:dup             
	//   13   25:invokespecial   #72  <Method void Paint()>
	//   14   28:putfield        #71  <Field Paint m>
			m.setFilterBitmap(true);
	//   15   31:aload_0         
	//   16   32:getfield        #71  <Field Paint m>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #76  <Method void Paint.setFilterBitmap(boolean)>
		}
		m.setAlpha(b.getRootAlpha());
	//   19   39:aload_0         
	//   20   40:getfield        #71  <Field Paint m>
	//   21   43:aload_0         
	//   22   44:getfield        #41  <Field VectorDrawableCompat$b b>
	//   23   47:invokevirtual   #80  <Method int VectorDrawableCompat$b.getRootAlpha()>
	//   24   50:invokevirtual   #84  <Method void Paint.setAlpha(int)>
		m.setColorFilter(colorfilter);
	//   25   53:aload_0         
	//   26   54:getfield        #71  <Field Paint m>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #88  <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   29   61:pop             
		return m;
	//   30   62:aload_0         
	//   31   63:getfield        #71  <Field Paint m>
	//   32   66:areturn         
	}

	public void a()
	{
		i = c;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field ColorStateList c>
	//    3    5:putfield        #90  <Field ColorStateList i>
		g = a;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #36  <Field android.graphics.PorterDuff$Mode a>
	//    7   13:putfield        #92  <Field android.graphics.PorterDuff$Mode g>
		k = b.getRootAlpha();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #41  <Field VectorDrawableCompat$b b>
	//   11   21:invokevirtual   #80  <Method int VectorDrawableCompat$b.getRootAlpha()>
	//   12   24:putfield        #94  <Field int k>
		f = d;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #65  <Field boolean d>
	//   16   32:putfield        #96  <Field boolean f>
		p = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #98  <Field boolean p>
	//   20   40:return          
	}

	public void a(int j, int l)
	{
		h.eraseColor(0);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Bitmap h>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #106 <Method void Bitmap.eraseColor(int)>
		Canvas canvas = new Canvas(h);
	//    4    8:new             #108 <Class Canvas>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field Bitmap h>
	//    8   16:invokespecial   #111 <Method void Canvas(Bitmap)>
	//    9   19:astore_3        
		b.b(canvas, j, l, ((ColorFilter) (null)));
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field VectorDrawableCompat$b b>
	//   12   24:aload_3         
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:aconst_null     
	//   16   28:invokevirtual   #114 <Method void VectorDrawableCompat$b.b(Canvas, int, int, ColorFilter)>
	//   17   31:return          
	}

	public void b(Canvas canvas, ColorFilter colorfilter, Rect rect)
	{
		colorfilter = ((ColorFilter) (a(colorfilter)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #117 <Method Paint a(ColorFilter)>
	//    3    5:astore_2        
		canvas.drawBitmap(h, ((Rect) (null)), rect, ((Paint) (colorfilter)));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #101 <Field Bitmap h>
	//    7   11:aconst_null     
	//    8   12:aload_3         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #121 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
	//   11   17:return          
	}

	public boolean b()
	{
		return !p && i == c && g == a && f == d && k == b.getRootAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean p>
	//    2    4:ifne            56
	//    3    7:aload_0         
	//    4    8:getfield        #90  <Field ColorStateList i>
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field ColorStateList c>
	//    7   15:if_acmpne       56
	//    8   18:aload_0         
	//    9   19:getfield        #92  <Field android.graphics.PorterDuff$Mode g>
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field android.graphics.PorterDuff$Mode a>
	//   12   26:if_acmpne       56
	//   13   29:aload_0         
	//   14   30:getfield        #96  <Field boolean f>
	//   15   33:aload_0         
	//   16   34:getfield        #65  <Field boolean d>
	//   17   37:icmpne          56
	//   18   40:aload_0         
	//   19   41:getfield        #94  <Field int k>
	//   20   44:aload_0         
	//   21   45:getfield        #41  <Field VectorDrawableCompat$b b>
	//   22   48:invokevirtual   #80  <Method int VectorDrawableCompat$b.getRootAlpha()>
	//   23   51:icmpne          56
	//   24   54:iconst_1        
	//   25   55:ireturn         
	//   26   56:iconst_0        
	//   27   57:ireturn         
	}

	public boolean b(int j, int l)
	{
		return j == h.getWidth() && l == h.getHeight();
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #101 <Field Bitmap h>
	//    3    5:invokevirtual   #125 <Method int Bitmap.getWidth()>
	//    4    8:icmpne          24
	//    5   11:iload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field Bitmap h>
	//    8   16:invokevirtual   #128 <Method int Bitmap.getHeight()>
	//    9   19:icmpne          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public void d(int j, int l)
	{
		if(h == null || !b(j, l))
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Bitmap h>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:iload_1         
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #130 <Method boolean b(int, int)>
	//*   7   13:ifne            33
		{
			h = Bitmap.createBitmap(j, l, android.graphics.Bitmap.Config.ARGB_8888);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:getstatic       #136 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   12   22:invokestatic    #140 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   13   25:putfield        #101 <Field Bitmap h>
			p = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #98  <Field boolean p>
		}
	//   17   33:return          
	}

	public boolean e()
	{
		return b.getRootAlpha() < 255;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field VectorDrawableCompat$b b>
	//    2    4:invokevirtual   #80  <Method int VectorDrawableCompat$b.getRootAlpha()>
	//    3    7:sipush          255
	//    4   10:icmpge          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getChangingConfigurations()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int e>
	//    2    4:ireturn         
	}

	public Drawable newDrawable()
	{
		return ((Drawable) (new VectorDrawableCompat(this)));
	//    0    0:new             #6   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #145 <Method void VectorDrawableCompat(VectorDrawableCompat$h)>
	//    4    8:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		return ((Drawable) (new VectorDrawableCompat(this)));
	//    0    0:new             #6   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #145 <Method void VectorDrawableCompat(VectorDrawableCompat$h)>
	//    4    8:areturn         
	}

	android.graphics.PorterDuff.Mode a;
	VectorDrawableCompat$b b;
	ColorStateList c;
	boolean d;
	int e;
	boolean f;
	android.graphics.PorterDuff.Mode g;
	Bitmap h;
	ColorStateList i;
	int k;
	Paint m;
	boolean p;

	public VectorDrawableCompat$h()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void android.graphics.drawable.Drawable$ConstantState()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field ColorStateList c>
		a = VectorDrawableCompat.DEFAULT_TINT_MODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #34  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
	//    7   13:putfield        #36  <Field android.graphics.PorterDuff$Mode a>
		b = new VectorDrawableCompat$b();
	//    8   16:aload_0         
	//    9   17:new             #38  <Class VectorDrawableCompat$b>
	//   10   20:dup             
	//   11   21:invokespecial   #39  <Method void VectorDrawableCompat$b()>
	//   12   24:putfield        #41  <Field VectorDrawableCompat$b b>
	//   13   27:return          
	}

	public VectorDrawableCompat$h(VectorDrawableCompat$h vectordrawablecompat$h)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void android.graphics.drawable.Drawable$ConstantState()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field ColorStateList c>
		a = VectorDrawableCompat.DEFAULT_TINT_MODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #34  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
	//    7   13:putfield        #36  <Field android.graphics.PorterDuff$Mode a>
		if(vectordrawablecompat$h != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          131
		{
			e = vectordrawablecompat$h.e;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #45  <Field int e>
	//   13   25:putfield        #45  <Field int e>
			b = new VectorDrawableCompat$b(vectordrawablecompat$h.b);
	//   14   28:aload_0         
	//   15   29:new             #38  <Class VectorDrawableCompat$b>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:getfield        #41  <Field VectorDrawableCompat$b b>
	//   19   37:invokespecial   #48  <Method void VectorDrawableCompat$b(VectorDrawableCompat$b)>
	//   20   40:putfield        #41  <Field VectorDrawableCompat$b b>
			if(VectorDrawableCompat$b.c(vectordrawablecompat$h.b) != null)
	//*  21   43:aload_1         
	//*  22   44:getfield        #41  <Field VectorDrawableCompat$b b>
	//*  23   47:invokestatic    #51  <Method Paint VectorDrawableCompat$b.c(VectorDrawableCompat$b)>
	//*  24   50:ifnull          75
				VectorDrawableCompat$b.a(b, new Paint(VectorDrawableCompat$b.c(vectordrawablecompat$h.b)));
	//   25   53:aload_0         
	//   26   54:getfield        #41  <Field VectorDrawableCompat$b b>
	//   27   57:new             #53  <Class Paint>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:getfield        #41  <Field VectorDrawableCompat$b b>
	//   31   65:invokestatic    #51  <Method Paint VectorDrawableCompat$b.c(VectorDrawableCompat$b)>
	//   32   68:invokespecial   #56  <Method void Paint(Paint)>
	//   33   71:invokestatic    #59  <Method Paint VectorDrawableCompat$b.a(VectorDrawableCompat$b, Paint)>
	//   34   74:pop             
			if(VectorDrawableCompat$b.a(vectordrawablecompat$h.b) != null)
	//*  35   75:aload_1         
	//*  36   76:getfield        #41  <Field VectorDrawableCompat$b b>
	//*  37   79:invokestatic    #61  <Method Paint VectorDrawableCompat$b.a(VectorDrawableCompat$b)>
	//*  38   82:ifnull          107
				VectorDrawableCompat$b.d(b, new Paint(VectorDrawableCompat$b.a(vectordrawablecompat$h.b)));
	//   39   85:aload_0         
	//   40   86:getfield        #41  <Field VectorDrawableCompat$b b>
	//   41   89:new             #53  <Class Paint>
	//   42   92:dup             
	//   43   93:aload_1         
	//   44   94:getfield        #41  <Field VectorDrawableCompat$b b>
	//   45   97:invokestatic    #61  <Method Paint VectorDrawableCompat$b.a(VectorDrawableCompat$b)>
	//   46  100:invokespecial   #56  <Method void Paint(Paint)>
	//   47  103:invokestatic    #63  <Method Paint VectorDrawableCompat$b.d(VectorDrawableCompat$b, Paint)>
	//   48  106:pop             
			c = vectordrawablecompat$h.c;
	//   49  107:aload_0         
	//   50  108:aload_1         
	//   51  109:getfield        #31  <Field ColorStateList c>
	//   52  112:putfield        #31  <Field ColorStateList c>
			a = vectordrawablecompat$h.a;
	//   53  115:aload_0         
	//   54  116:aload_1         
	//   55  117:getfield        #36  <Field android.graphics.PorterDuff$Mode a>
	//   56  120:putfield        #36  <Field android.graphics.PorterDuff$Mode a>
			d = vectordrawablecompat$h.d;
	//   57  123:aload_0         
	//   58  124:aload_1         
	//   59  125:getfield        #65  <Field boolean d>
	//   60  128:putfield        #65  <Field boolean d>
		}
	//   61  131:return          
	}
}
