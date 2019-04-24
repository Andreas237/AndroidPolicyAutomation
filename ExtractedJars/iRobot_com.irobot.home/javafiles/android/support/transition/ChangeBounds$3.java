// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.PointF;
import android.util.Property;

// Referenced classes of package android.support.transition:
//			ChangeBounds

static final class ChangeBounds$3 extends Property
{

	public PointF a(ChangeBounds$a changebounds$a)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void a(ChangeBounds$a changebounds$a, PointF pointf)
	{
		changebounds$a.a(pointf);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method void ChangeBounds$a.a(PointF)>
	//    3    5:return          
	}

	public Object get(Object obj)
	{
		return ((Object) (a((ChangeBounds$a)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class ChangeBounds$a>
	//    3    5:invokevirtual   #24  <Method PointF a(ChangeBounds$a)>
	//    4    8:areturn         
	}

	public void set(Object obj, Object obj1)
	{
		a((ChangeBounds$a)obj, (PointF)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class ChangeBounds$a>
	//    3    5:aload_2         
	//    4    6:checkcast       #28  <Class PointF>
	//    5    9:invokevirtual   #30  <Method void a(ChangeBounds$a, PointF)>
	//    6   12:return          
	}

	ChangeBounds$3(Class class1, String s)
	{
		super(class1, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void Property(Class, String)>
	//    4    6:return          
	}
}
