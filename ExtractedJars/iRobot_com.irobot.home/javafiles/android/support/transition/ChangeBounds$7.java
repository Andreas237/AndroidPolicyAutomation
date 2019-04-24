// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeBounds, au

static final class ChangeBounds$7 extends Property
{

	public PointF a(View view)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void a(View view, PointF pointf)
	{
		int i = Math.round(pointf.x);
	//    0    0:aload_2         
	//    1    1:getfield        #21  <Field float PointF.x>
	//    2    4:invokestatic    #27  <Method int Math.round(float)>
	//    3    7:istore_3        
		int j = Math.round(pointf.y);
	//    4    8:aload_2         
	//    5    9:getfield        #30  <Field float PointF.y>
	//    6   12:invokestatic    #27  <Method int Math.round(float)>
	//    7   15:istore          4
		au.a(view, i, j, view.getWidth() + i, view.getHeight() + j);
	//    8   17:aload_1         
	//    9   18:iload_3         
	//   10   19:iload           4
	//   11   21:aload_1         
	//   12   22:invokevirtual   #36  <Method int View.getWidth()>
	//   13   25:iload_3         
	//   14   26:iadd            
	//   15   27:aload_1         
	//   16   28:invokevirtual   #39  <Method int View.getHeight()>
	//   17   31:iload           4
	//   18   33:iadd            
	//   19   34:invokestatic    #44  <Method void au.a(View, int, int, int, int)>
	//   20   37:return          
	}

	public Object get(Object obj)
	{
		return ((Object) (a((View)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class View>
	//    3    5:invokevirtual   #48  <Method PointF a(View)>
	//    4    8:areturn         
	}

	public void set(Object obj, Object obj1)
	{
		a((View)obj, (PointF)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class View>
	//    3    5:aload_2         
	//    4    6:checkcast       #17  <Class PointF>
	//    5    9:invokevirtual   #52  <Method void a(View, PointF)>
	//    6   12:return          
	}

	ChangeBounds$7(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
