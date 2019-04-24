// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			ChangeTransform

static final class ChangeTransform$2 extends Property
{

	public PointF a(ChangeTransform$b changetransform$b)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void a(ChangeTransform$b changetransform$b, PointF pointf)
	{
		changetransform$b.a(pointf);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method void ChangeTransform$b.a(PointF)>
	//    3    5:return          
	}

	public Object get(Object obj)
	{
		return ((Object) (a((ChangeTransform$b)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class ChangeTransform$b>
	//    3    5:invokevirtual   #24  <Method PointF a(ChangeTransform$b)>
	//    4    8:areturn         
	}

	public void set(Object obj, Object obj1)
	{
		a((ChangeTransform$b)obj, (PointF)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class ChangeTransform$b>
	//    3    5:aload_2         
	//    4    6:checkcast       #28  <Class PointF>
	//    5    9:invokevirtual   #30  <Method void a(ChangeTransform$b, PointF)>
	//    6   12:return          
	}

	ChangeTransform$2(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
