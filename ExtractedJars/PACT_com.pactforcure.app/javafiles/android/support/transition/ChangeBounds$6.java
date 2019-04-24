// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeBounds, ViewUtils

static final class ChangeBounds$6 extends Property
{

	public PointF get(View view)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((View)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class View>
	//    3    5:invokevirtual   #19  <Method PointF get(View)>
	//    4    8:areturn         
	}

	public void set(View view, PointF pointf)
	{
		int i = Math.round(pointf.x);
	//    0    0:aload_2         
	//    1    1:getfield        #27  <Field float PointF.x>
	//    2    4:invokestatic    #33  <Method int Math.round(float)>
	//    3    7:istore_3        
		int j = Math.round(pointf.y);
	//    4    8:aload_2         
	//    5    9:getfield        #36  <Field float PointF.y>
	//    6   12:invokestatic    #33  <Method int Math.round(float)>
	//    7   15:istore          4
		ViewUtils.setLeftTopRightBottom(view, i, j, i + view.getWidth(), j + view.getHeight());
	//    8   17:aload_1         
	//    9   18:iload_3         
	//   10   19:iload           4
	//   11   21:iload_3         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #40  <Method int View.getWidth()>
	//   14   26:iadd            
	//   15   27:iload           4
	//   16   29:aload_1         
	//   17   30:invokevirtual   #43  <Method int View.getHeight()>
	//   18   33:iadd            
	//   19   34:invokestatic    #49  <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
	//   20   37:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((View)obj, (PointF)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class View>
	//    3    5:aload_2         
	//    4    6:checkcast       #23  <Class PointF>
	//    5    9:invokevirtual   #52  <Method void set(View, PointF)>
	//    6   12:return          
	}

	ChangeBounds$6(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
