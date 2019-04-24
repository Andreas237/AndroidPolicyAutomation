// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			r, CardView

class CardView$1
	implements r
{

	public void a(int i, int j)
	{
		if(i > a.a)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #16  <Field CardView a>
	//*   3    5:getfield        #24  <Field int CardView.a>
	//*   4    8:icmple          19
			CardView.a(a, i);
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field CardView a>
	//    7   15:iload_1         
	//    8   16:invokestatic    #27  <Method void CardView.a(CardView, int)>
		if(j > a.b)
	//*   9   19:iload_2         
	//*  10   20:aload_0         
	//*  11   21:getfield        #16  <Field CardView a>
	//*  12   24:getfield        #29  <Field int CardView.b>
	//*  13   27:icmple          38
			CardView.b(a, j);
	//   14   30:aload_0         
	//   15   31:getfield        #16  <Field CardView a>
	//   16   34:iload_2         
	//   17   35:invokestatic    #31  <Method void CardView.b(CardView, int)>
	//   18   38:return          
	}

	public void a(int i, int j, int k, int l)
	{
		a.d.set(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CardView a>
	//    2    4:getfield        #36  <Field Rect CardView.d>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokevirtual   #41  <Method void Rect.set(int, int, int, int)>
		CardView.a(a, i + a.c.left, j + a.c.top, k + a.c.right, l + a.c.bottom);
	//    8   15:aload_0         
	//    9   16:getfield        #16  <Field CardView a>
	//   10   19:iload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #16  <Field CardView a>
	//   13   24:getfield        #44  <Field Rect CardView.c>
	//   14   27:getfield        #47  <Field int Rect.left>
	//   15   30:iadd            
	//   16   31:iload_2         
	//   17   32:aload_0         
	//   18   33:getfield        #16  <Field CardView a>
	//   19   36:getfield        #44  <Field Rect CardView.c>
	//   20   39:getfield        #50  <Field int Rect.top>
	//   21   42:iadd            
	//   22   43:iload_3         
	//   23   44:aload_0         
	//   24   45:getfield        #16  <Field CardView a>
	//   25   48:getfield        #44  <Field Rect CardView.c>
	//   26   51:getfield        #53  <Field int Rect.right>
	//   27   54:iadd            
	//   28   55:iload           4
	//   29   57:aload_0         
	//   30   58:getfield        #16  <Field CardView a>
	//   31   61:getfield        #44  <Field Rect CardView.c>
	//   32   64:getfield        #56  <Field int Rect.bottom>
	//   33   67:iadd            
	//   34   68:invokestatic    #59  <Method void CardView.a(CardView, int, int, int, int)>
	//   35   71:return          
	}

	public void a(Drawable drawable)
	{
		b = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field Drawable b>
		a.setBackgroundDrawable(drawable);
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field CardView a>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #65  <Method void CardView.setBackgroundDrawable(Drawable)>
	//    7   13:return          
	}

	public boolean a()
	{
		return a.getUseCompatPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CardView a>
	//    2    4:invokevirtual   #69  <Method boolean CardView.getUseCompatPadding()>
	//    3    7:ireturn         
	}

	public boolean b()
	{
		return a.getPreventCornerOverlap();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CardView a>
	//    2    4:invokevirtual   #72  <Method boolean CardView.getPreventCornerOverlap()>
	//    3    7:ireturn         
	}

	public Drawable c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Drawable b>
	//    2    4:areturn         
	}

	public View d()
	{
		return ((View) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CardView a>
	//    2    4:areturn         
	}

	final CardView a;
	private Drawable b;

	CardView$1(CardView cardview)
	{
		a = cardview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field CardView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
