// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeBounds, ViewUtils

static final class ChangeBounds$5 extends Property
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
		ViewUtils.setLeftTopRightBottom(view, Math.round(pointf.x), Math.round(pointf.y), view.getRight(), view.getBottom());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getfield        #27  <Field float PointF.x>
	//    3    5:invokestatic    #33  <Method int Math.round(float)>
	//    4    8:aload_2         
	//    5    9:getfield        #36  <Field float PointF.y>
	//    6   12:invokestatic    #33  <Method int Math.round(float)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #40  <Method int View.getRight()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #43  <Method int View.getBottom()>
	//   11   23:invokestatic    #49  <Method void ViewUtils.setLeftTopRightBottom(View, int, int, int, int)>
	//   12   26:return          
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

	ChangeBounds$5(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
