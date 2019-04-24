// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.design.widget:
//			k, FloatingActionButton

private class FloatingActionButton$b
	implements k
{

	public float a()
	{
		return (float)a.getSizeDimension() / 2.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton a>
	//    2    4:invokevirtual   #24  <Method int FloatingActionButton.getSizeDimension()>
	//    3    7:i2f             
	//    4    8:fconst_2        
	//    5    9:fdiv            
	//    6   10:freturn         
	}

	public void a(int i, int j, int l, int i1)
	{
		a.c.set(i, j, l, i1);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton a>
	//    2    4:getfield        #29  <Field Rect FloatingActionButton.c>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokevirtual   #34  <Method void Rect.set(int, int, int, int)>
		a.setPadding(i + a.a, j + a.a, l + a.a, i1 + a.a);
	//    8   15:aload_0         
	//    9   16:getfield        #15  <Field FloatingActionButton a>
	//   10   19:iload_1         
	//   11   20:aload_0         
	//   12   21:getfield        #15  <Field FloatingActionButton a>
	//   13   24:getfield        #37  <Field int FloatingActionButton.a>
	//   14   27:iadd            
	//   15   28:iload_2         
	//   16   29:aload_0         
	//   17   30:getfield        #15  <Field FloatingActionButton a>
	//   18   33:getfield        #37  <Field int FloatingActionButton.a>
	//   19   36:iadd            
	//   20   37:iload_3         
	//   21   38:aload_0         
	//   22   39:getfield        #15  <Field FloatingActionButton a>
	//   23   42:getfield        #37  <Field int FloatingActionButton.a>
	//   24   45:iadd            
	//   25   46:iload           4
	//   26   48:aload_0         
	//   27   49:getfield        #15  <Field FloatingActionButton a>
	//   28   52:getfield        #37  <Field int FloatingActionButton.a>
	//   29   55:iadd            
	//   30   56:invokevirtual   #40  <Method void FloatingActionButton.setPadding(int, int, int, int)>
	//   31   59:return          
	}

	public void a(Drawable drawable)
	{
		FloatingActionButton.a(a, drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton a>
	//    2    4:aload_1         
	//    3    5:invokestatic    #44  <Method void FloatingActionButton.a(FloatingActionButton, Drawable)>
	//    4    8:return          
	}

	public boolean b()
	{
		return a.b;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field FloatingActionButton a>
	//    2    4:getfield        #48  <Field boolean FloatingActionButton.b>
	//    3    7:ireturn         
	}

	final FloatingActionButton a;

	FloatingActionButton$b(FloatingActionButton floatingactionbutton)
	{
		a = floatingactionbutton;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field FloatingActionButton a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
