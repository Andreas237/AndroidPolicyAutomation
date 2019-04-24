// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			ChangeBounds

static final class ChangeBounds$1 extends Property
{

	public PointF a(Drawable drawable)
	{
		drawable.copyBounds(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field Rect a>
	//    3    5:invokevirtual   #28  <Method void Drawable.copyBounds(Rect)>
		return new PointF(a.left, a.top);
	//    4    8:new             #30  <Class PointF>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field Rect a>
	//    8   16:getfield        #34  <Field int Rect.left>
	//    9   19:i2f             
	//   10   20:aload_0         
	//   11   21:getfield        #20  <Field Rect a>
	//   12   24:getfield        #37  <Field int Rect.top>
	//   13   27:i2f             
	//   14   28:invokespecial   #40  <Method void PointF(float, float)>
	//   15   31:areturn         
	}

	public void a(Drawable drawable, PointF pointf)
	{
		drawable.copyBounds(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field Rect a>
	//    3    5:invokevirtual   #28  <Method void Drawable.copyBounds(Rect)>
		a.offsetTo(Math.round(pointf.x), Math.round(pointf.y));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field Rect a>
	//    6   12:aload_2         
	//    7   13:getfield        #45  <Field float PointF.x>
	//    8   16:invokestatic    #51  <Method int Math.round(float)>
	//    9   19:aload_2         
	//   10   20:getfield        #54  <Field float PointF.y>
	//   11   23:invokestatic    #51  <Method int Math.round(float)>
	//   12   26:invokevirtual   #58  <Method void Rect.offsetTo(int, int)>
		drawable.setBounds(a);
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #20  <Field Rect a>
	//   16   34:invokevirtual   #61  <Method void Drawable.setBounds(Rect)>
	//   17   37:return          
	}

	public Object get(Object obj)
	{
		return ((Object) (a((Drawable)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class Drawable>
	//    3    5:invokevirtual   #65  <Method PointF a(Drawable)>
	//    4    8:areturn         
	}

	public void set(Object obj, Object obj1)
	{
		a((Drawable)obj, (PointF)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class Drawable>
	//    3    5:aload_2         
	//    4    6:checkcast       #30  <Class PointF>
	//    5    9:invokevirtual   #69  <Method void a(Drawable, PointF)>
	//    6   12:return          
	}

	private Rect a;

	ChangeBounds$1(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void Property(Class, String)>
		a = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #15  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #18  <Method void Rect()>
	//    8   14:putfield        #20  <Field Rect a>
	//    9   17:return          
	}
}
