// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeBounds, au

static final class ChangeBounds$6 extends Property
{

	public PointF a(View view)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void a(View view, PointF pointf)
	{
		au.a(view, Math.round(pointf.x), Math.round(pointf.y), view.getRight(), view.getBottom());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:getfield        #21  <Field float PointF.x>
	//    3    5:invokestatic    #27  <Method int Math.round(float)>
	//    4    8:aload_2         
	//    5    9:getfield        #30  <Field float PointF.y>
	//    6   12:invokestatic    #27  <Method int Math.round(float)>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #36  <Method int View.getRight()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #39  <Method int View.getBottom()>
	//   11   23:invokestatic    #44  <Method void au.a(View, int, int, int, int)>
	//   12   26:return          
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
