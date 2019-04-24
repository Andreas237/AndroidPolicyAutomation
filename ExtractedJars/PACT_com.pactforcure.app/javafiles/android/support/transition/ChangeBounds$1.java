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

	public PointF get(Drawable drawable)
	{
		drawable.copyBounds(mBounds);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field Rect mBounds>
	//    3    5:invokevirtual   #29  <Method void Drawable.copyBounds(Rect)>
		return new PointF(mBounds.left, mBounds.top);
	//    4    8:new             #31  <Class PointF>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field Rect mBounds>
	//    8   16:getfield        #35  <Field int Rect.left>
	//    9   19:i2f             
	//   10   20:aload_0         
	//   11   21:getfield        #20  <Field Rect mBounds>
	//   12   24:getfield        #38  <Field int Rect.top>
	//   13   27:i2f             
	//   14   28:invokespecial   #41  <Method void PointF(float, float)>
	//   15   31:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((Drawable)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class Drawable>
	//    3    5:invokevirtual   #44  <Method PointF get(Drawable)>
	//    4    8:areturn         
	}

	public void set(Drawable drawable, PointF pointf)
	{
		drawable.copyBounds(mBounds);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field Rect mBounds>
	//    3    5:invokevirtual   #29  <Method void Drawable.copyBounds(Rect)>
		mBounds.offsetTo(Math.round(pointf.x), Math.round(pointf.y));
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field Rect mBounds>
	//    6   12:aload_2         
	//    7   13:getfield        #50  <Field float PointF.x>
	//    8   16:invokestatic    #56  <Method int Math.round(float)>
	//    9   19:aload_2         
	//   10   20:getfield        #59  <Field float PointF.y>
	//   11   23:invokestatic    #56  <Method int Math.round(float)>
	//   12   26:invokevirtual   #63  <Method void Rect.offsetTo(int, int)>
		drawable.setBounds(mBounds);
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #20  <Field Rect mBounds>
	//   16   34:invokevirtual   #66  <Method void Drawable.setBounds(Rect)>
	//   17   37:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((Drawable)obj, (PointF)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #25  <Class Drawable>
	//    3    5:aload_2         
	//    4    6:checkcast       #31  <Class PointF>
	//    5    9:invokevirtual   #69  <Method void set(Drawable, PointF)>
	//    6   12:return          
	}

	private Rect mBounds;

	ChangeBounds$1(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void Property(Class, String)>
		mBounds = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #15  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #18  <Method void Rect()>
	//    8   14:putfield        #20  <Field Rect mBounds>
	//    9   17:return          
	}
}
