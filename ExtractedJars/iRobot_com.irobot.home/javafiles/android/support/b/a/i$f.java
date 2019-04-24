// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.b.a:
//			i

private static class i$f extends android.graphics.drawable.able.ConstantState
{

	public Paint a(ColorFilter colorfilter)
	{
		if(!a() && colorfilter == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #68  <Method boolean a()>
	//*   2    4:ifne            13
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		if(l == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #70  <Field Paint l>
	//*   9   17:ifnonnull       39
		{
			l = new Paint();
	//   10   20:aload_0         
	//   11   21:new             #52  <Class Paint>
	//   12   24:dup             
	//   13   25:invokespecial   #71  <Method void Paint()>
	//   14   28:putfield        #70  <Field Paint l>
			l.setFilterBitmap(true);
	//   15   31:aload_0         
	//   16   32:getfield        #70  <Field Paint l>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #75  <Method void Paint.setFilterBitmap(boolean)>
		}
		l.setAlpha(b.getRootAlpha());
	//   19   39:aload_0         
	//   20   40:getfield        #70  <Field Paint l>
	//   21   43:aload_0         
	//   22   44:getfield        #40  <Field i$e b>
	//   23   47:invokevirtual   #79  <Method int i$e.getRootAlpha()>
	//   24   50:invokevirtual   #83  <Method void Paint.setAlpha(int)>
		l.setColorFilter(colorfilter);
	//   25   53:aload_0         
	//   26   54:getfield        #70  <Field Paint l>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #87  <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   29   61:pop             
		return l;
	//   30   62:aload_0         
	//   31   63:getfield        #70  <Field Paint l>
	//   32   66:areturn         
	}

	public void a(int i1, int j1)
	{
		f.eraseColor(0);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Bitmap f>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #95  <Method void Bitmap.eraseColor(int)>
		Canvas canvas = new Canvas(f);
	//    4    8:new             #97  <Class Canvas>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #90  <Field Bitmap f>
	//    8   16:invokespecial   #100 <Method void Canvas(Bitmap)>
	//    9   19:astore_3        
		b.a(canvas, i1, j1, ((ColorFilter) (null)));
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field i$e b>
	//   12   24:aload_3         
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:aconst_null     
	//   16   28:invokevirtual   #103 <Method void i$e.a(Canvas, int, int, ColorFilter)>
	//   17   31:return          
	}

	public void a(Canvas canvas, ColorFilter colorfilter, Rect rect)
	{
		colorfilter = ((ColorFilter) (a(colorfilter)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #106 <Method Paint a(ColorFilter)>
	//    3    5:astore_2        
		canvas.drawBitmap(f, ((Rect) (null)), rect, ((Paint) (colorfilter)));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #90  <Field Bitmap f>
	//    7   11:aconst_null     
	//    8   12:aload_3         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #110 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
	//   11   17:return          
	}

	public boolean a()
	{
		return b.getRootAlpha() < 255;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field i$e b>
	//    2    4:invokevirtual   #79  <Method int i$e.getRootAlpha()>
	//    3    7:sipush          255
	//    4   10:icmpge          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void b(int i1, int j1)
	{
		if(f == null || !c(i1, j1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field Bitmap f>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:iload_1         
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #113 <Method boolean c(int, int)>
	//*   7   13:ifne            33
		{
			f = Bitmap.createBitmap(i1, j1, android.graphics.ap.Config.ARGB_8888);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:getstatic       #119 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   12   22:invokestatic    #123 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   13   25:putfield        #90  <Field Bitmap f>
			k = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #125 <Field boolean k>
		}
	//   17   33:return          
	}

	public boolean b()
	{
		return !k && g == c && h == d && j == e && i == b.getRootAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field boolean k>
	//    2    4:ifne            56
	//    3    7:aload_0         
	//    4    8:getfield        #127 <Field ColorStateList g>
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field ColorStateList c>
	//    7   15:if_acmpne       56
	//    8   18:aload_0         
	//    9   19:getfield        #129 <Field android.graphics.PorterDuff$Mode h>
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field android.graphics.PorterDuff$Mode d>
	//   12   26:if_acmpne       56
	//   13   29:aload_0         
	//   14   30:getfield        #131 <Field boolean j>
	//   15   33:aload_0         
	//   16   34:getfield        #64  <Field boolean e>
	//   17   37:icmpne          56
	//   18   40:aload_0         
	//   19   41:getfield        #133 <Field int i>
	//   20   44:aload_0         
	//   21   45:getfield        #40  <Field i$e b>
	//   22   48:invokevirtual   #79  <Method int i$e.getRootAlpha()>
	//   23   51:icmpne          56
	//   24   54:iconst_1        
	//   25   55:ireturn         
	//   26   56:iconst_0        
	//   27   57:ireturn         
	}

	public void c()
	{
		g = c;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field ColorStateList c>
	//    3    5:putfield        #127 <Field ColorStateList g>
		h = d;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field android.graphics.PorterDuff$Mode d>
	//    7   13:putfield        #129 <Field android.graphics.PorterDuff$Mode h>
		i = b.getRootAlpha();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #40  <Field i$e b>
	//   11   21:invokevirtual   #79  <Method int i$e.getRootAlpha()>
	//   12   24:putfield        #133 <Field int i>
		j = e;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #64  <Field boolean e>
	//   16   32:putfield        #131 <Field boolean j>
		k = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #125 <Field boolean k>
	//   20   40:return          
	}

	public boolean c(int i1, int j1)
	{
		return i1 == f.getWidth() && j1 == f.getHeight();
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #90  <Field Bitmap f>
	//    3    5:invokevirtual   #136 <Method int Bitmap.getWidth()>
	//    4    8:icmpne          24
	//    5   11:iload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #90  <Field Bitmap f>
	//    8   16:invokevirtual   #139 <Method int Bitmap.getHeight()>
	//    9   19:icmpne          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public int getChangingConfigurations()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int a>
	//    2    4:ireturn         
	}

	public Drawable newDrawable()
	{
		return ((Drawable) (new i(this)));
	//    0    0:new             #6   <Class i>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #144 <Method void i(i$f)>
	//    4    8:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		return ((Drawable) (new i(this)));
	//    0    0:new             #6   <Class i>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #144 <Method void i(i$f)>
	//    4    8:areturn         
	}

	int a;
	i$e b;
	ColorStateList c;
	android.graphics.erDuff.Mode d;
	boolean e;
	Bitmap f;
	ColorStateList g;
	android.graphics.erDuff.Mode h;
	int i;
	boolean j;
	boolean k;
	Paint l;

	public i$f()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void android.graphics.drawable.Drawable$ConstantState()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field ColorStateList c>
		d = i.a;
	//    5    9:aload_0         
	//    6   10:getstatic       #33  <Field android.graphics.PorterDuff$Mode i.a>
	//    7   13:putfield        #35  <Field android.graphics.PorterDuff$Mode d>
		b = new i$e();
	//    8   16:aload_0         
	//    9   17:new             #37  <Class i$e>
	//   10   20:dup             
	//   11   21:invokespecial   #38  <Method void i$e()>
	//   12   24:putfield        #40  <Field i$e b>
	//   13   27:return          
	}

	public i$f(i$f i$f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void android.graphics.drawable.Drawable$ConstantState()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field ColorStateList c>
		d = i.a;
	//    5    9:aload_0         
	//    6   10:getstatic       #33  <Field android.graphics.PorterDuff$Mode i.a>
	//    7   13:putfield        #35  <Field android.graphics.PorterDuff$Mode d>
		if(i$f1 != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          131
		{
			a = i$f1.a;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #44  <Field int a>
	//   13   25:putfield        #44  <Field int a>
			b = new i$e(i$f1.b);
	//   14   28:aload_0         
	//   15   29:new             #37  <Class i$e>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:getfield        #40  <Field i$e b>
	//   19   37:invokespecial   #47  <Method void i$e(i$e)>
	//   20   40:putfield        #40  <Field i$e b>
			if(i$e.a(i$f1.b) != null)
	//*  21   43:aload_1         
	//*  22   44:getfield        #40  <Field i$e b>
	//*  23   47:invokestatic    #50  <Method Paint i$e.a(i$e)>
	//*  24   50:ifnull          75
				i$e.a(b, new Paint(i$e.a(i$f1.b)));
	//   25   53:aload_0         
	//   26   54:getfield        #40  <Field i$e b>
	//   27   57:new             #52  <Class Paint>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:getfield        #40  <Field i$e b>
	//   31   65:invokestatic    #50  <Method Paint i$e.a(i$e)>
	//   32   68:invokespecial   #55  <Method void Paint(Paint)>
	//   33   71:invokestatic    #58  <Method Paint i$e.a(i$e, Paint)>
	//   34   74:pop             
			if(i$e.b(i$f1.b) != null)
	//*  35   75:aload_1         
	//*  36   76:getfield        #40  <Field i$e b>
	//*  37   79:invokestatic    #60  <Method Paint i$e.b(i$e)>
	//*  38   82:ifnull          107
				i$e.b(b, new Paint(i$e.b(i$f1.b)));
	//   39   85:aload_0         
	//   40   86:getfield        #40  <Field i$e b>
	//   41   89:new             #52  <Class Paint>
	//   42   92:dup             
	//   43   93:aload_1         
	//   44   94:getfield        #40  <Field i$e b>
	//   45   97:invokestatic    #60  <Method Paint i$e.b(i$e)>
	//   46  100:invokespecial   #55  <Method void Paint(Paint)>
	//   47  103:invokestatic    #62  <Method Paint i$e.b(i$e, Paint)>
	//   48  106:pop             
			c = i$f1.c;
	//   49  107:aload_0         
	//   50  108:aload_1         
	//   51  109:getfield        #31  <Field ColorStateList c>
	//   52  112:putfield        #31  <Field ColorStateList c>
			d = i$f1.d;
	//   53  115:aload_0         
	//   54  116:aload_1         
	//   55  117:getfield        #35  <Field android.graphics.PorterDuff$Mode d>
	//   56  120:putfield        #35  <Field android.graphics.PorterDuff$Mode d>
			e = i$f1.e;
	//   57  123:aload_0         
	//   58  124:aload_1         
	//   59  125:getfield        #64  <Field boolean e>
	//   60  128:putfield        #64  <Field boolean e>
		}
	//   61  131:return          
	}
}
